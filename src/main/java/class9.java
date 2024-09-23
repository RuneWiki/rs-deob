import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DUZSRFJE")
public class class9 implements Runnable {

    @OriginalMember(owner = "DUZSRFJE", name = "a", descriptor = "I")
    private int field626 = 44344;

    @OriginalMember(owner = "DUZSRFJE", name = "b", descriptor = "I")
    private int field627 = 973;

    @OriginalMember(owner = "DUZSRFJE", name = "f", descriptor = "Z")
    private boolean field631 = false;

    @OriginalMember(owner = "DUZSRFJE", name = "k", descriptor = "Z")
    private boolean field636 = false;

    @OriginalMember(owner = "DUZSRFJE", name = "l", descriptor = "Z")
    private boolean field637 = false;

    @OriginalMember(owner = "DUZSRFJE", name = "g", descriptor = "LAMTYETOI;")
    public class1 field632;

    @OriginalMember(owner = "DUZSRFJE", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field630;

    @OriginalMember(owner = "DUZSRFJE", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field628;

    @OriginalMember(owner = "DUZSRFJE", name = "d", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field629;

    @OriginalMember(owner = "DUZSRFJE", name = "i", descriptor = "I")
    private int field634;

    @OriginalMember(owner = "DUZSRFJE", name = "j", descriptor = "I")
    private int field635;

    @OriginalMember(owner = "DUZSRFJE", name = "h", descriptor = "[B")
    private byte[] field633;

    @OriginalMember(owner = "DUZSRFJE", name = "<init>", descriptor = "(LAMTYETOI;ZLjava/net/Socket;)V")
    public class9(class1 arg0, boolean arg1, Socket arg2) throws IOException {
        this.field632 = arg0;
        this.field630 = arg2;
        this.field630.setSoTimeout(30000);
        if (arg1) {
            throw new NullPointerException();
        }
        this.field630.setTcpNoDelay(true);
        this.field628 = this.field630.getInputStream();
        this.field629 = this.field630.getOutputStream();
    }

    @OriginalMember(owner = "DUZSRFJE", name = "a", descriptor = "()V")
    public void method174() {
        this.field631 = true;
        try {
            if (this.field628 != null) {
                this.field628.close();
            }
            if (this.field629 != null) {
                this.field629.close();
            }
            if (this.field630 != null) {
                this.field630.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field636 = false;
        synchronized (this) {
            this.notify();
        }
        this.field633 = null;
    }

    @OriginalMember(owner = "DUZSRFJE", name = "b", descriptor = "()I")
    public int method175() throws IOException {
        return this.field631 ? 0 : this.field628.read();
    }

    @OriginalMember(owner = "DUZSRFJE", name = "c", descriptor = "()I")
    public int method176() throws IOException {
        return this.field631 ? 0 : this.field628.available();
    }

    @OriginalMember(owner = "DUZSRFJE", name = "a", descriptor = "([BII)V")
    public void method177(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field631) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field628.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "DUZSRFJE", name = "a", descriptor = "(I[BII)V")
    public void method178(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg3 != 0) {
            this.field626 = 148;
        }
        if (this.field631) {
            return;
        }
        if (this.field637) {
            this.field637 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field633 == null) {
            this.field633 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field633[this.field635] = arg1[arg0 + var6];
                this.field635 = (this.field635 + 1) % 5000;
                if ((this.field634 + 4900) % 5000 == this.field635) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field636) {
                this.field636 = true;
                this.field632.method12(this, 3);
            }
            this.notify();
        }
    }

    @OriginalMember(owner = "DUZSRFJE", name = "run", descriptor = "()V")
    public void run() {
        while (this.field636) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field635 == this.field634) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field636) {
                    return;
                }
                var2 = this.field634;
                if (this.field635 >= this.field634) {
                    var3 = this.field635 - this.field634;
                } else {
                    var3 = 5000 - this.field634;
                }
            }
            if (var3 > 0) {
                try {
                    this.field629.write(this.field633, var2, var3);
                } catch (IOException var7) {
                    this.field637 = true;
                }
                this.field634 = (this.field634 + var3) % 5000;
                try {
                    if (this.field635 == this.field634) {
                        this.field629.flush();
                    }
                } catch (IOException var6) {
                    this.field637 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "DUZSRFJE", name = "a", descriptor = "(I)V")
    public void method179(int arg0) {
        System.out.println("dummy:" + this.field631);
        System.out.println("tcycl:" + this.field634);
        System.out.println("tnum:" + this.field635);
        if (arg0 != 0) {
            this.field627 = -6;
        }
        System.out.println("writer:" + this.field636);
        System.out.println("ioerror:" + this.field637);
        try {
            System.out.println("available:" + this.method176());
        } catch (IOException var2) {
        }
    }
}
