import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("e")
public class ClientStream implements Runnable {

    @OriginalMember(owner = "e", name = "a", descriptor = "B")
    private byte field138 = -39;

    @OriginalMember(owner = "e", name = "b", descriptor = "Z")
    private boolean field139 = false;

    @OriginalMember(owner = "e", name = "f", descriptor = "Z")
    private boolean field143 = false;

    @OriginalMember(owner = "e", name = "k", descriptor = "Z")
    private boolean field148 = false;

    @OriginalMember(owner = "e", name = "l", descriptor = "Z")
    private boolean field149 = false;

    @OriginalMember(owner = "e", name = "g", descriptor = "La;")
    public GameShell field144;

    @OriginalMember(owner = "e", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field142;

    @OriginalMember(owner = "e", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field140;

    @OriginalMember(owner = "e", name = "d", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field141;

    @OriginalMember(owner = "e", name = "i", descriptor = "I")
    private int field146;

    @OriginalMember(owner = "e", name = "j", descriptor = "I")
    private int field147;

    @OriginalMember(owner = "e", name = "h", descriptor = "[B")
    private byte[] field145;

    @OriginalMember(owner = "e", name = "<init>", descriptor = "(La;ZLjava/net/Socket;)V")
    public ClientStream(GameShell arg0, boolean arg1, Socket arg2) throws IOException {
        this.field144 = arg0;
        this.field142 = arg2;
        this.field142.setSoTimeout(30000);
        if (!arg1) {
            throw new NullPointerException();
        }
        this.field142.setTcpNoDelay(true);
        this.field140 = this.field142.getInputStream();
        this.field141 = this.field142.getOutputStream();
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "()V")
    public void method38() {
        this.field143 = true;
        try {
            if (this.field140 != null) {
                this.field140.close();
            }
            if (this.field141 != null) {
                this.field141.close();
            }
            if (this.field142 != null) {
                this.field142.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field148 = false;
        synchronized (this) {
            this.notify();
        }
        this.field145 = null;
    }

    @OriginalMember(owner = "e", name = "b", descriptor = "()I")
    public int method39() throws IOException {
        return this.field143 ? 0 : this.field140.read();
    }

    @OriginalMember(owner = "e", name = "c", descriptor = "()I")
    public int method40() throws IOException {
        return this.field143 ? 0 : this.field140.available();
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "([BII)V")
    public void method41(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field143) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field140.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(I[BBI)V")
    public void method42(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
        if (this.field138 != arg2) {
            this.field139 = !this.field139;
        }
        if (this.field143) {
            return;
        }
        if (this.field149) {
            this.field149 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field145 == null) {
            this.field145 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg0; var6++) {
                this.field145[this.field147] = arg1[arg3 + var6];
                this.field147 = (this.field147 + 1) % 5000;
                if ((this.field146 + 4900) % 5000 == this.field147) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field148) {
                this.field148 = true;
                this.field144.method12(this, 3);
            }
            this.notify();
        }
    }

    @OriginalMember(owner = "e", name = "run", descriptor = "()V")
    public void run() {
        while (this.field148) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field147 == this.field146) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field148) {
                    return;
                }
                var2 = this.field146;
                if (this.field147 >= this.field146) {
                    var3 = this.field147 - this.field146;
                } else {
                    var3 = 5000 - this.field146;
                }
            }
            if (var3 > 0) {
                try {
                    this.field141.write(this.field145, var2, var3);
                } catch (IOException var7) {
                    this.field149 = true;
                }
                this.field146 = (this.field146 + var3) % 5000;
                try {
                    if (this.field147 == this.field146) {
                        this.field141.flush();
                    }
                } catch (IOException var6) {
                    this.field149 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(I)V")
    public void method43(int arg0) {
        System.out.println("dummy:" + this.field143);
        System.out.println("tcycl:" + this.field146);
        if (arg0 >= 0) {
            return;
        }
        System.out.println("tnum:" + this.field147);
        System.out.println("writer:" + this.field148);
        System.out.println("ioerror:" + this.field149);
        try {
            System.out.println("available:" + this.method40());
        } catch (IOException var2) {
        }
    }
}
