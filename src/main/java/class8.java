import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CWPTWZXW")
public class class8 implements Runnable {

    @OriginalMember(owner = "CWPTWZXW", name = "a", descriptor = "Z")
    private boolean field635 = true;

    @OriginalMember(owner = "CWPTWZXW", name = "e", descriptor = "Z")
    private boolean field639 = false;

    @OriginalMember(owner = "CWPTWZXW", name = "j", descriptor = "Z")
    private boolean field644 = false;

    @OriginalMember(owner = "CWPTWZXW", name = "k", descriptor = "Z")
    private boolean field645 = false;

    @OriginalMember(owner = "CWPTWZXW", name = "f", descriptor = "LIVVPRVRY;")
    public class33 field640;

    @OriginalMember(owner = "CWPTWZXW", name = "d", descriptor = "Ljava/net/Socket;")
    private Socket field638;

    @OriginalMember(owner = "CWPTWZXW", name = "b", descriptor = "Ljava/io/InputStream;")
    private InputStream field636;

    @OriginalMember(owner = "CWPTWZXW", name = "c", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field637;

    @OriginalMember(owner = "CWPTWZXW", name = "h", descriptor = "I")
    private int field642;

    @OriginalMember(owner = "CWPTWZXW", name = "i", descriptor = "I")
    private int field643;

    @OriginalMember(owner = "CWPTWZXW", name = "g", descriptor = "[B")
    private byte[] field641;

    @OriginalMember(owner = "CWPTWZXW", name = "<init>", descriptor = "(LIVVPRVRY;Ljava/net/Socket;I)V")
    public class8(class33 arg0, Socket arg1, int arg2) throws IOException {
        this.field640 = arg0;
        if (arg2 != 1) {
            this.field635 = !this.field635;
        }
        this.field638 = arg1;
        this.field638.setSoTimeout(30000);
        this.field638.setTcpNoDelay(true);
        this.field636 = this.field638.getInputStream();
        this.field637 = this.field638.getOutputStream();
    }

    @OriginalMember(owner = "CWPTWZXW", name = "a", descriptor = "()V")
    public void method229() {
        this.field639 = true;
        try {
            if (this.field636 != null) {
                this.field636.close();
            }
            if (this.field637 != null) {
                this.field637.close();
            }
            if (this.field638 != null) {
                this.field638.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field644 = false;
        synchronized (this) {
            this.notify();
        }
        this.field641 = null;
    }

    @OriginalMember(owner = "CWPTWZXW", name = "b", descriptor = "()I")
    public int method230() throws IOException {
        return this.field639 ? 0 : this.field636.read();
    }

    @OriginalMember(owner = "CWPTWZXW", name = "c", descriptor = "()I")
    public int method231() throws IOException {
        return this.field639 ? 0 : this.field636.available();
    }

    @OriginalMember(owner = "CWPTWZXW", name = "a", descriptor = "([BII)V")
    public void method232(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field639) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field636.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "CWPTWZXW", name = "a", descriptor = "(I[BII)V")
    public void method233(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (this.field639) {
            return;
        }
        if (this.field645) {
            this.field645 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field641 == null) {
            this.field641 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field641[this.field643] = arg1[arg3 + var6];
                this.field643 = (this.field643 + 1) % 5000;
                if ((this.field642 + 4900) % 5000 == this.field643) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field644) {
                this.field644 = true;
                this.field640.method117(this, 3);
            }
            this.notify();
        }
        if (arg0 <= 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
    }

    @OriginalMember(owner = "CWPTWZXW", name = "run", descriptor = "()V")
    public void run() {
        while (this.field644) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field643 == this.field642) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field644) {
                    return;
                }
                var2 = this.field642;
                if (this.field643 >= this.field642) {
                    var3 = this.field643 - this.field642;
                } else {
                    var3 = 5000 - this.field642;
                }
            }
            if (var3 > 0) {
                try {
                    this.field637.write(this.field641, var2, var3);
                } catch (IOException var7) {
                    this.field645 = true;
                }
                this.field642 = (this.field642 + var3) % 5000;
                try {
                    if (this.field643 == this.field642) {
                        this.field637.flush();
                    }
                } catch (IOException var6) {
                    this.field645 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "CWPTWZXW", name = "a", descriptor = "(I)V")
    public void method234(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        System.out.println("dummy:" + this.field639);
        System.out.println("tcycl:" + this.field642);
        System.out.println("tnum:" + this.field643);
        System.out.println("writer:" + this.field644);
        System.out.println("ioerror:" + this.field645);
        try {
            System.out.println("available:" + this.method231());
        } catch (IOException var3) {
        }
    }
}
