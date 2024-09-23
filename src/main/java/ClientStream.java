import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("d")
public class ClientStream implements Runnable {

    @OriginalMember(owner = "d", name = "d", descriptor = "Z")
    private boolean field67 = false;

    @OriginalMember(owner = "d", name = "i", descriptor = "Z")
    private boolean field72 = false;

    @OriginalMember(owner = "d", name = "j", descriptor = "Z")
    private boolean field73 = false;

    @OriginalMember(owner = "d", name = "e", descriptor = "La;")
    public GameShell field68;

    @OriginalMember(owner = "d", name = "c", descriptor = "Ljava/net/Socket;")
    private Socket field66;

    @OriginalMember(owner = "d", name = "a", descriptor = "Ljava/io/InputStream;")
    private InputStream field64;

    @OriginalMember(owner = "d", name = "b", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field65;

    @OriginalMember(owner = "d", name = "g", descriptor = "I")
    private int field70;

    @OriginalMember(owner = "d", name = "h", descriptor = "I")
    private int field71;

    @OriginalMember(owner = "d", name = "f", descriptor = "[B")
    private byte[] field69;

    @OriginalMember(owner = "d", name = "<init>", descriptor = "(La;BLjava/net/Socket;)V")
    public ClientStream(GameShell arg0, byte arg1, Socket arg2) throws IOException {
        this.field68 = arg0;
        this.field66 = arg2;
        this.field66.setSoTimeout(30000);
        this.field66.setTcpNoDelay(true);
        if (arg1 != 124) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field64 = this.field66.getInputStream();
        this.field65 = this.field66.getOutputStream();
    }

    @OriginalMember(owner = "d", name = "a", descriptor = "()V")
    public void method29() {
        this.field67 = true;
        try {
            if (this.field64 != null) {
                this.field64.close();
            }
            if (this.field65 != null) {
                this.field65.close();
            }
            if (this.field66 != null) {
                this.field66.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field72 = false;
        synchronized (this) {
            this.notify();
        }
        this.field69 = null;
    }

    @OriginalMember(owner = "d", name = "b", descriptor = "()I")
    public int method30() throws IOException {
        return this.field67 ? 0 : this.field64.read();
    }

    @OriginalMember(owner = "d", name = "c", descriptor = "()I")
    public int method31() throws IOException {
        return this.field67 ? 0 : this.field64.available();
    }

    @OriginalMember(owner = "d", name = "a", descriptor = "([BII)V")
    public void method32(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field67) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field64.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "d", name = "a", descriptor = "(BI[BI)V")
    public void method33(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg0 != 1) {
            return;
        }
        boolean var5 = false;
        if (this.field67) {
            return;
        }
        if (this.field73) {
            this.field73 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field69 == null) {
            this.field69 = new byte[5000];
        }
        synchronized (this) {
            for (int var7 = 0; var7 < arg3; var7++) {
                this.field69[this.field71] = arg2[arg1 + var7];
                this.field71 = (this.field71 + 1) % 5000;
                if ((this.field70 + 4900) % 5000 == this.field71) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field72) {
                this.field72 = true;
                this.field68.method12(this, 2);
            }
            this.notify();
        }
    }

    @OriginalMember(owner = "d", name = "run", descriptor = "()V")
    public void run() {
        while (this.field72) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field71 == this.field70) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field72) {
                    return;
                }
                var2 = this.field70;
                if (this.field71 >= this.field70) {
                    var3 = this.field71 - this.field70;
                } else {
                    var3 = 5000 - this.field70;
                }
            }
            if (var3 > 0) {
                try {
                    this.field65.write(this.field69, var2, var3);
                } catch (IOException var7) {
                    this.field73 = true;
                }
                this.field70 = (this.field70 + var3) % 5000;
                try {
                    if (this.field71 == this.field70) {
                        this.field65.flush();
                    }
                } catch (IOException var6) {
                    this.field73 = true;
                }
            }
        }
    }
}
