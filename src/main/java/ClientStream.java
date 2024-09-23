import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("e")
public class ClientStream implements Runnable {

    @OriginalMember(owner = "e", name = "a", descriptor = "I")
    private int field144 = 28009;

    @OriginalMember(owner = "e", name = "b", descriptor = "I")
    private int field145 = 2;

    @OriginalMember(owner = "e", name = "c", descriptor = "I")
    private int field146 = 2;

    @OriginalMember(owner = "e", name = "d", descriptor = "I")
    private int field147 = 741;

    @OriginalMember(owner = "e", name = "h", descriptor = "Z")
    private boolean field151 = false;

    @OriginalMember(owner = "e", name = "m", descriptor = "Z")
    private boolean field156 = false;

    @OriginalMember(owner = "e", name = "n", descriptor = "Z")
    private boolean field157 = false;

    @OriginalMember(owner = "e", name = "i", descriptor = "La;")
    public GameShell field152;

    @OriginalMember(owner = "e", name = "g", descriptor = "Ljava/net/Socket;")
    private Socket field150;

    @OriginalMember(owner = "e", name = "e", descriptor = "Ljava/io/InputStream;")
    private InputStream field148;

    @OriginalMember(owner = "e", name = "f", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field149;

    @OriginalMember(owner = "e", name = "k", descriptor = "I")
    private int field154;

    @OriginalMember(owner = "e", name = "l", descriptor = "I")
    private int field155;

    @OriginalMember(owner = "e", name = "j", descriptor = "[B")
    private byte[] field153;

    @OriginalMember(owner = "e", name = "<init>", descriptor = "(ZLjava/net/Socket;La;)V")
    public ClientStream(boolean arg0, Socket arg1, GameShell arg2) throws IOException {
        this.field152 = arg2;
        this.field150 = arg1;
        this.field150.setSoTimeout(30000);
        this.field150.setTcpNoDelay(true);
        this.field148 = this.field150.getInputStream();
        if (!arg0) {
            this.field146 = 37;
        }
        this.field149 = this.field150.getOutputStream();
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "()V")
    public void method38() {
        this.field151 = true;
        try {
            if (this.field148 != null) {
                this.field148.close();
            }
            if (this.field149 != null) {
                this.field149.close();
            }
            if (this.field150 != null) {
                this.field150.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field156 = false;
        synchronized (this) {
            this.notify();
        }
        this.field153 = null;
    }

    @OriginalMember(owner = "e", name = "b", descriptor = "()I")
    public int method39() throws IOException {
        return this.field151 ? 0 : this.field148.read();
    }

    @OriginalMember(owner = "e", name = "c", descriptor = "()I")
    public int method40() throws IOException {
        return this.field151 ? 0 : this.field148.available();
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "([BII)V")
    public void method41(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field151) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field148.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "([BIII)V")
    public void method42(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        int var5 = 45 / arg3;
        if (this.field151) {
            return;
        }
        if (this.field157) {
            this.field157 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field153 == null) {
            this.field153 = new byte[5000];
        }
        synchronized (this) {
            for (int var7 = 0; var7 < arg2; var7++) {
                this.field153[this.field155] = arg0[arg1 + var7];
                this.field155 = (this.field155 + 1) % 5000;
                if ((this.field154 + 4900) % 5000 == this.field155) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field156) {
                this.field156 = true;
                this.field152.method12(this, 3);
            }
            this.notify();
        }
    }

    @OriginalMember(owner = "e", name = "run", descriptor = "()V")
    public void run() {
        while (this.field156) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field155 == this.field154) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field156) {
                    return;
                }
                var2 = this.field154;
                if (this.field155 >= this.field154) {
                    var3 = this.field155 - this.field154;
                } else {
                    var3 = 5000 - this.field154;
                }
            }
            if (var3 > 0) {
                try {
                    this.field149.write(this.field153, var2, var3);
                } catch (IOException var7) {
                    this.field157 = true;
                }
                this.field154 = (this.field154 + var3) % 5000;
                try {
                    if (this.field155 == this.field154) {
                        this.field149.flush();
                    }
                } catch (IOException var6) {
                    this.field157 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(I)V")
    public void method43(int arg0) {
        System.out.println("dummy:" + this.field151);
        System.out.println("tcycl:" + this.field154);
        System.out.println("tnum:" + this.field155);
        System.out.println("writer:" + this.field156);
        if (this.field144 != arg0) {
            this.field145 = -9;
        }
        System.out.println("ioerror:" + this.field157);
        try {
            System.out.println("available:" + this.method40());
        } catch (IOException var2) {
        }
    }
}
