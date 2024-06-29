import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!TVERLIYS")
public class class51 implements Runnable {

    @OriginalMember(owner = "client!TVERLIYS", name = "a", descriptor = "Z")
    private boolean field1454 = false;

    @OriginalMember(owner = "client!TVERLIYS", name = "e", descriptor = "Z")
    private boolean field1458 = false;

    @OriginalMember(owner = "client!TVERLIYS", name = "j", descriptor = "Z")
    private boolean field1463 = false;

    @OriginalMember(owner = "client!TVERLIYS", name = "k", descriptor = "Z")
    private boolean field1464 = false;

    @OriginalMember(owner = "client!TVERLIYS", name = "f", descriptor = "LHJHAUOBE;")
    public class26 field1459;

    @OriginalMember(owner = "client!TVERLIYS", name = "d", descriptor = "Ljava/net/Socket;")
    private Socket field1457;

    @OriginalMember(owner = "client!TVERLIYS", name = "b", descriptor = "Ljava/io/InputStream;")
    private InputStream field1455;

    @OriginalMember(owner = "client!TVERLIYS", name = "c", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1456;

    @OriginalMember(owner = "client!TVERLIYS", name = "h", descriptor = "I")
    private int field1461;

    @OriginalMember(owner = "client!TVERLIYS", name = "i", descriptor = "I")
    private int field1462;

    @OriginalMember(owner = "client!TVERLIYS", name = "g", descriptor = "[B")
    private byte[] field1460;

    @OriginalMember(owner = "client!TVERLIYS", name = "<init>", descriptor = "(ZLjava/net/Socket;LHJHAUOBE;)V")
    public class51(boolean arg0, Socket arg1, class26 arg2) throws IOException {
        this.field1459 = arg2;
        this.field1457 = arg1;
        this.field1457.setSoTimeout(30000);
        this.field1457.setTcpNoDelay(true);
        if (arg0) {
            throw new NullPointerException();
        }
        this.field1455 = this.field1457.getInputStream();
        this.field1456 = this.field1457.getOutputStream();
    }

    @OriginalMember(owner = "client!TVERLIYS", name = "a", descriptor = "()V")
    public void method464() {
        this.field1458 = true;
        try {
            if (this.field1455 != null) {
                this.field1455.close();
            }
            if (this.field1456 != null) {
                this.field1456.close();
            }
            if (this.field1457 != null) {
                this.field1457.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field1463 = false;
        synchronized (this) {
            this.notify();
        }
        this.field1460 = null;
    }

    @OriginalMember(owner = "client!TVERLIYS", name = "b", descriptor = "()I")
    public int method465() throws IOException {
        return this.field1458 ? 0 : this.field1455.read();
    }

    @OriginalMember(owner = "client!TVERLIYS", name = "c", descriptor = "()I")
    public int method466() throws IOException {
        return this.field1458 ? 0 : this.field1455.available();
    }

    @OriginalMember(owner = "client!TVERLIYS", name = "a", descriptor = "([BII)V")
    public void method467(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1458) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1455.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "client!TVERLIYS", name = "a", descriptor = "(II[BI)V")
    public void method468(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (this.field1458) {
            return;
        }
        if (this.field1464) {
            this.field1464 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field1460 == null) {
            this.field1460 = new byte[5000];
        }
        synchronized (this) {
            int var6 = 0;
            while (true) {
                if (var6 >= arg3) {
                    if (!this.field1463) {
                        this.field1463 = true;
                        this.field1459.method139(this, 3);
                    }
                    this.notify();
                    break;
                }
                this.field1460[this.field1462] = arg2[arg0 + var6];
                this.field1462 = (this.field1462 + 1) % 5000;
                if ((this.field1461 + 4900) % 5000 == this.field1462) {
                    throw new IOException("buffer overflow");
                }
                var6++;
            }
        }
        if (arg1 < 9 || arg1 > 9) {
            this.field1454 = !this.field1454;
        }
    }

    @OriginalMember(owner = "client!TVERLIYS", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1463) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field1462 == this.field1461) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field1463) {
                    return;
                }
                var2 = this.field1461;
                if (this.field1462 >= this.field1461) {
                    var3 = this.field1462 - this.field1461;
                } else {
                    var3 = 5000 - this.field1461;
                }
            }
            if (var3 > 0) {
                try {
                    this.field1456.write(this.field1460, var2, var3);
                } catch (IOException var7) {
                    this.field1464 = true;
                }
                this.field1461 = (this.field1461 + var3) % 5000;
                try {
                    if (this.field1462 == this.field1461) {
                        this.field1456.flush();
                    }
                } catch (IOException var6) {
                    this.field1464 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!TVERLIYS", name = "a", descriptor = "(I)V")
    public void method469(int arg0) {
        System.out.println("dummy:" + this.field1458);
        System.out.println("tcycl:" + this.field1461);
        System.out.println("tnum:" + this.field1462);
        int var2 = 31 / arg0;
        System.out.println("writer:" + this.field1463);
        System.out.println("ioerror:" + this.field1464);
        try {
            System.out.println("available:" + this.method466());
        } catch (IOException var3) {
        }
    }
}
