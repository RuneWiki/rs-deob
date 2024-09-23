import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JHRYTWFZ")
public class class25 implements Runnable {

    @OriginalMember(owner = "JHRYTWFZ", name = "a", descriptor = "Z")
    private boolean field924 = true;

    @OriginalMember(owner = "JHRYTWFZ", name = "b", descriptor = "Z")
    private boolean field925 = true;

    @OriginalMember(owner = "JHRYTWFZ", name = "f", descriptor = "Z")
    private boolean field929 = false;

    @OriginalMember(owner = "JHRYTWFZ", name = "k", descriptor = "Z")
    private boolean field934 = false;

    @OriginalMember(owner = "JHRYTWFZ", name = "l", descriptor = "Z")
    private boolean field935 = false;

    @OriginalMember(owner = "JHRYTWFZ", name = "g", descriptor = "LTFSZPSRF;")
    public class56 field930;

    @OriginalMember(owner = "JHRYTWFZ", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field928;

    @OriginalMember(owner = "JHRYTWFZ", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field926;

    @OriginalMember(owner = "JHRYTWFZ", name = "d", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field927;

    @OriginalMember(owner = "JHRYTWFZ", name = "i", descriptor = "I")
    private int field932;

    @OriginalMember(owner = "JHRYTWFZ", name = "j", descriptor = "I")
    private int field933;

    @OriginalMember(owner = "JHRYTWFZ", name = "h", descriptor = "[B")
    private byte[] field931;

    @OriginalMember(owner = "JHRYTWFZ", name = "<init>", descriptor = "(Ljava/net/Socket;ILTFSZPSRF;)V")
    public class25(Socket arg0, int arg1, class56 arg2) throws IOException {
        this.field930 = arg2;
        this.field928 = arg0;
        this.field928.setSoTimeout(30000);
        this.field928.setTcpNoDelay(true);
        if (arg1 != -24798) {
            throw new NullPointerException();
        }
        this.field926 = this.field928.getInputStream();
        this.field927 = this.field928.getOutputStream();
    }

    @OriginalMember(owner = "JHRYTWFZ", name = "a", descriptor = "()V")
    public void method318() {
        this.field929 = true;
        try {
            if (this.field926 != null) {
                this.field926.close();
            }
            if (this.field927 != null) {
                this.field927.close();
            }
            if (this.field928 != null) {
                this.field928.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field934 = false;
        synchronized (this) {
            this.notify();
        }
        this.field931 = null;
    }

    @OriginalMember(owner = "JHRYTWFZ", name = "b", descriptor = "()I")
    public int method319() throws IOException {
        return this.field929 ? 0 : this.field926.read();
    }

    @OriginalMember(owner = "JHRYTWFZ", name = "c", descriptor = "()I")
    public int method320() throws IOException {
        return this.field929 ? 0 : this.field926.available();
    }

    @OriginalMember(owner = "JHRYTWFZ", name = "a", descriptor = "([BII)V")
    public void method321(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field929) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field926.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "JHRYTWFZ", name = "a", descriptor = "([BIII)V")
    public void method322(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (this.field929) {
            return;
        }
        if (this.field935) {
            this.field935 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field931 == null) {
            this.field931 = new byte[5000];
        }
        synchronized (this) {
            int var6 = 0;
            while (true) {
                if (var6 >= arg1) {
                    if (!this.field934) {
                        this.field934 = true;
                        this.field930.method115(this, 3);
                    }
                    this.notify();
                    break;
                }
                this.field931[this.field933] = arg0[arg2 + var6];
                this.field933 = (this.field933 + 1) % 5000;
                if ((this.field932 + 4900) % 5000 == this.field933) {
                    throw new IOException("buffer overflow");
                }
                var6++;
            }
        }
        if (arg3 != 0) {
            this.field924 = !this.field924;
        }
    }

    @OriginalMember(owner = "JHRYTWFZ", name = "run", descriptor = "()V")
    public void run() {
        while (this.field934) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field933 == this.field932) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field934) {
                    return;
                }
                var2 = this.field932;
                if (this.field933 >= this.field932) {
                    var3 = this.field933 - this.field932;
                } else {
                    var3 = 5000 - this.field932;
                }
            }
            if (var3 > 0) {
                try {
                    this.field927.write(this.field931, var2, var3);
                } catch (IOException var7) {
                    this.field935 = true;
                }
                this.field932 = (this.field932 + var3) % 5000;
                try {
                    if (this.field933 == this.field932) {
                        this.field927.flush();
                    }
                } catch (IOException var6) {
                    this.field935 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "JHRYTWFZ", name = "a", descriptor = "(Z)V")
    public void method323(boolean arg0) {
        System.out.println("dummy:" + this.field929);
        if (!arg0) {
            return;
        }
        System.out.println("tcycl:" + this.field932);
        System.out.println("tnum:" + this.field933);
        System.out.println("writer:" + this.field934);
        System.out.println("ioerror:" + this.field935);
        try {
            System.out.println("available:" + this.method320());
        } catch (IOException var2) {
        }
    }
}
