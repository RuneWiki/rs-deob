import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("d")
public class ClientStream implements Runnable {

    @OriginalMember(owner = "d", name = "a", descriptor = "I")
    private int field61 = 44;

    @OriginalMember(owner = "d", name = "e", descriptor = "Z")
    private boolean field65 = false;

    @OriginalMember(owner = "d", name = "j", descriptor = "Z")
    private boolean field70 = false;

    @OriginalMember(owner = "d", name = "k", descriptor = "Z")
    private boolean field71 = false;

    @OriginalMember(owner = "d", name = "f", descriptor = "La;")
    public GameShell field66;

    @OriginalMember(owner = "d", name = "d", descriptor = "Ljava/net/Socket;")
    private Socket field64;

    @OriginalMember(owner = "d", name = "b", descriptor = "Ljava/io/InputStream;")
    private InputStream field62;

    @OriginalMember(owner = "d", name = "c", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field63;

    @OriginalMember(owner = "d", name = "h", descriptor = "I")
    private int field68;

    @OriginalMember(owner = "d", name = "i", descriptor = "I")
    private int field69;

    @OriginalMember(owner = "d", name = "g", descriptor = "[B")
    private byte[] field67;

    @OriginalMember(owner = "d", name = "<init>", descriptor = "(La;Ljava/net/Socket;Z)V")
    public ClientStream(GameShell arg0, Socket arg1, boolean arg2) throws IOException {
        this.field66 = arg0;
        if (arg2) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field64 = arg1;
        this.field64.setSoTimeout(30000);
        this.field64.setTcpNoDelay(true);
        this.field62 = this.field64.getInputStream();
        this.field63 = this.field64.getOutputStream();
    }

    @OriginalMember(owner = "d", name = "a", descriptor = "()V")
    public void method29() {
        this.field65 = true;
        try {
            if (this.field62 != null) {
                this.field62.close();
            }
            if (this.field63 != null) {
                this.field63.close();
            }
            if (this.field64 != null) {
                this.field64.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field70 = false;
        synchronized (this) {
            this.notify();
        }
        this.field67 = null;
    }

    @OriginalMember(owner = "d", name = "b", descriptor = "()I")
    public int method30() throws IOException {
        return this.field65 ? 0 : this.field62.read();
    }

    @OriginalMember(owner = "d", name = "c", descriptor = "()I")
    public int method31() throws IOException {
        return this.field65 ? 0 : this.field62.available();
    }

    @OriginalMember(owner = "d", name = "a", descriptor = "([BII)V")
    public void method32(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field65) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field62.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "d", name = "a", descriptor = "([BIII)V")
    public void method33(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (this.field65) {
            return;
        }
        if (this.field71) {
            this.field71 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field67 == null) {
            this.field67 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field67[this.field69] = arg0[arg1 + var6];
                this.field69 = (this.field69 + 1) % 5000;
                if ((this.field68 + 4900) % 5000 == this.field69) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field70) {
                this.field70 = true;
                this.field66.method12(this, 2);
            }
            this.notify();
        }
        if (arg3 != 0) {
            this.field61 = -304;
        }
    }

    @OriginalMember(owner = "d", name = "run", descriptor = "()V")
    public void run() {
        while (this.field70) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field69 == this.field68) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field70) {
                    return;
                }
                var2 = this.field68;
                if (this.field69 >= this.field68) {
                    var3 = this.field69 - this.field68;
                } else {
                    var3 = 5000 - this.field68;
                }
            }
            if (var3 > 0) {
                try {
                    this.field63.write(this.field67, var2, var3);
                } catch (IOException var7) {
                    this.field71 = true;
                }
                this.field68 = (this.field68 + var3) % 5000;
                try {
                    if (this.field69 == this.field68) {
                        this.field63.flush();
                    }
                } catch (IOException var6) {
                    this.field71 = true;
                }
            }
        }
    }
}
