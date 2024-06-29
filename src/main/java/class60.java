import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!UUQNASSN")
public class class60 implements Runnable {

    @OriginalMember(owner = "client!UUQNASSN", name = "a", descriptor = "Z")
    private boolean field1535 = false;

    @OriginalMember(owner = "client!UUQNASSN", name = "e", descriptor = "Z")
    private boolean field1539 = false;

    @OriginalMember(owner = "client!UUQNASSN", name = "j", descriptor = "Z")
    private boolean field1544 = false;

    @OriginalMember(owner = "client!UUQNASSN", name = "k", descriptor = "Z")
    private boolean field1545 = false;

    @OriginalMember(owner = "client!UUQNASSN", name = "f", descriptor = "LNCIKLCII;")
    public class38 field1540;

    @OriginalMember(owner = "client!UUQNASSN", name = "d", descriptor = "Ljava/net/Socket;")
    private Socket field1538;

    @OriginalMember(owner = "client!UUQNASSN", name = "b", descriptor = "Ljava/io/InputStream;")
    private InputStream field1536;

    @OriginalMember(owner = "client!UUQNASSN", name = "c", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1537;

    @OriginalMember(owner = "client!UUQNASSN", name = "h", descriptor = "I")
    private int field1542;

    @OriginalMember(owner = "client!UUQNASSN", name = "i", descriptor = "I")
    private int field1543;

    @OriginalMember(owner = "client!UUQNASSN", name = "g", descriptor = "[B")
    private byte[] field1541;

    @OriginalMember(owner = "client!UUQNASSN", name = "<init>", descriptor = "(ILNCIKLCII;Ljava/net/Socket;)V")
    public class60(int arg0, class38 arg1, Socket arg2) throws IOException {
        this.field1540 = arg1;
        this.field1538 = arg2;
        this.field1538.setSoTimeout(30000);
        if (arg0 != -634) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field1538.setTcpNoDelay(true);
        this.field1536 = this.field1538.getInputStream();
        this.field1537 = this.field1538.getOutputStream();
    }

    @OriginalMember(owner = "client!UUQNASSN", name = "a", descriptor = "()V")
    public void method546() {
        this.field1539 = true;
        try {
            if (this.field1536 != null) {
                this.field1536.close();
            }
            if (this.field1537 != null) {
                this.field1537.close();
            }
            if (this.field1538 != null) {
                this.field1538.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field1544 = false;
        synchronized (this) {
            this.notify();
        }
        this.field1541 = null;
    }

    @OriginalMember(owner = "client!UUQNASSN", name = "b", descriptor = "()I")
    public int method547() throws IOException {
        return this.field1539 ? 0 : this.field1536.read();
    }

    @OriginalMember(owner = "client!UUQNASSN", name = "c", descriptor = "()I")
    public int method548() throws IOException {
        return this.field1539 ? 0 : this.field1536.available();
    }

    @OriginalMember(owner = "client!UUQNASSN", name = "a", descriptor = "([BII)V")
    public void method549(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1539) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1536.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "client!UUQNASSN", name = "a", descriptor = "(IZ[BI)V")
    public void method550(int arg0, boolean arg1, byte[] arg2, int arg3) throws IOException {
        if (this.field1539) {
            return;
        }
        if (this.field1545) {
            this.field1545 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field1541 == null) {
            this.field1541 = new byte[5000];
        }
        synchronized (this) {
            int var6 = 0;
            while (true) {
                if (var6 >= arg3) {
                    if (!this.field1544) {
                        this.field1544 = true;
                        this.field1540.method97(this, 3);
                    }
                    this.notify();
                    break;
                }
                this.field1541[this.field1543] = arg2[arg0 + var6];
                this.field1543 = (this.field1543 + 1) % 5000;
                if ((this.field1542 + 4900) % 5000 == this.field1543) {
                    throw new IOException("buffer overflow");
                }
                var6++;
            }
        }
        if (arg1) {
            this.field1535 = !this.field1535;
        }
    }

    @OriginalMember(owner = "client!UUQNASSN", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1544) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field1543 == this.field1542) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field1544) {
                    return;
                }
                var2 = this.field1542;
                if (this.field1543 >= this.field1542) {
                    var3 = this.field1543 - this.field1542;
                } else {
                    var3 = 5000 - this.field1542;
                }
            }
            if (var3 > 0) {
                try {
                    this.field1537.write(this.field1541, var2, var3);
                } catch (IOException var7) {
                    this.field1545 = true;
                }
                this.field1542 = (this.field1542 + var3) % 5000;
                try {
                    if (this.field1543 == this.field1542) {
                        this.field1537.flush();
                    }
                } catch (IOException var6) {
                    this.field1545 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!UUQNASSN", name = "a", descriptor = "(I)V")
    public void method551(int arg0) {
        System.out.println("dummy:" + this.field1539);
        System.out.println("tcycl:" + this.field1542);
        System.out.println("tnum:" + this.field1543);
        System.out.println("writer:" + this.field1544);
        System.out.println("ioerror:" + this.field1545);
        int var2 = 84 / arg0;
        try {
            System.out.println("available:" + this.method548());
        } catch (IOException var3) {
        }
    }
}
