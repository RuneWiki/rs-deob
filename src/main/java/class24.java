import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("KPIQNZMJ")
public class class24 implements Runnable {

    @OriginalMember(owner = "KPIQNZMJ", name = "a", descriptor = "Z")
    private boolean field952 = false;

    @OriginalMember(owner = "KPIQNZMJ", name = "b", descriptor = "Z")
    private boolean field953 = false;

    @OriginalMember(owner = "KPIQNZMJ", name = "f", descriptor = "Z")
    private boolean field957 = false;

    @OriginalMember(owner = "KPIQNZMJ", name = "k", descriptor = "Z")
    private boolean field962 = false;

    @OriginalMember(owner = "KPIQNZMJ", name = "l", descriptor = "Z")
    private boolean field963 = false;

    @OriginalMember(owner = "KPIQNZMJ", name = "g", descriptor = "LDZXWUJSL;")
    public class12 field958;

    @OriginalMember(owner = "KPIQNZMJ", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field956;

    @OriginalMember(owner = "KPIQNZMJ", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field954;

    @OriginalMember(owner = "KPIQNZMJ", name = "d", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field955;

    @OriginalMember(owner = "KPIQNZMJ", name = "i", descriptor = "I")
    private int field960;

    @OriginalMember(owner = "KPIQNZMJ", name = "j", descriptor = "I")
    private int field961;

    @OriginalMember(owner = "KPIQNZMJ", name = "h", descriptor = "[B")
    private byte[] field959;

    @OriginalMember(owner = "KPIQNZMJ", name = "<init>", descriptor = "(BLjava/net/Socket;LDZXWUJSL;)V")
    public class24(byte arg0, Socket arg1, class12 arg2) throws IOException {
        this.field958 = arg2;
        this.field956 = arg1;
        this.field956.setSoTimeout(30000);
        this.field956.setTcpNoDelay(true);
        this.field954 = this.field956.getInputStream();
        if (arg0 == 3) {
            boolean var4 = false;
        } else {
            this.field952 = !this.field952;
        }
        this.field955 = this.field956.getOutputStream();
    }

    @OriginalMember(owner = "KPIQNZMJ", name = "a", descriptor = "()V")
    public void method261() {
        this.field957 = true;
        try {
            if (this.field954 != null) {
                this.field954.close();
            }
            if (this.field955 != null) {
                this.field955.close();
            }
            if (this.field956 != null) {
                this.field956.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field962 = false;
        synchronized (this) {
            this.notify();
        }
        this.field959 = null;
    }

    @OriginalMember(owner = "KPIQNZMJ", name = "b", descriptor = "()I")
    public int method262() throws IOException {
        return this.field957 ? 0 : this.field954.read();
    }

    @OriginalMember(owner = "KPIQNZMJ", name = "c", descriptor = "()I")
    public int method263() throws IOException {
        return this.field957 ? 0 : this.field954.available();
    }

    @OriginalMember(owner = "KPIQNZMJ", name = "a", descriptor = "([BII)V")
    public void method264(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field957) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field954.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "KPIQNZMJ", name = "a", descriptor = "(II[BI)V")
    public void method265(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg3 >= 0) {
            this.field953 = !this.field953;
        }
        if (this.field957) {
            return;
        }
        if (this.field963) {
            this.field963 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field959 == null) {
            this.field959 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg0; var6++) {
                this.field959[this.field961] = arg2[arg1 + var6];
                this.field961 = (this.field961 + 1) % 5000;
                if ((this.field960 + 4900) % 5000 == this.field961) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field962) {
                this.field962 = true;
                this.field958.method131(this, 3);
            }
            this.notify();
        }
    }

    @OriginalMember(owner = "KPIQNZMJ", name = "run", descriptor = "()V")
    public void run() {
        while (this.field962) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field961 == this.field960) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field962) {
                    return;
                }
                var2 = this.field960;
                if (this.field961 >= this.field960) {
                    var3 = this.field961 - this.field960;
                } else {
                    var3 = 5000 - this.field960;
                }
            }
            if (var3 > 0) {
                try {
                    this.field955.write(this.field959, var2, var3);
                } catch (IOException var7) {
                    this.field963 = true;
                }
                this.field960 = (this.field960 + var3) % 5000;
                try {
                    if (this.field961 == this.field960) {
                        this.field955.flush();
                    }
                } catch (IOException var6) {
                    this.field963 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "KPIQNZMJ", name = "a", descriptor = "(I)V")
    public void method266(int arg0) {
        System.out.println("dummy:" + this.field957);
        System.out.println("tcycl:" + this.field960);
        System.out.println("tnum:" + this.field961);
        while (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        System.out.println("writer:" + this.field962);
        System.out.println("ioerror:" + this.field963);
        try {
            System.out.println("available:" + this.method263());
        } catch (IOException var3) {
        }
    }
}
