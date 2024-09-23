import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("QHZQTTDB")
public class class52 implements Runnable {

    @OriginalMember(owner = "QHZQTTDB", name = "a", descriptor = "I")
    private int field1318 = -75;

    @OriginalMember(owner = "QHZQTTDB", name = "e", descriptor = "Z")
    private boolean field1322 = false;

    @OriginalMember(owner = "QHZQTTDB", name = "j", descriptor = "Z")
    private boolean field1327 = false;

    @OriginalMember(owner = "QHZQTTDB", name = "k", descriptor = "Z")
    private boolean field1328 = false;

    @OriginalMember(owner = "QHZQTTDB", name = "f", descriptor = "LXHFSQKPU;")
    public class65 field1323;

    @OriginalMember(owner = "QHZQTTDB", name = "d", descriptor = "Ljava/net/Socket;")
    private Socket field1321;

    @OriginalMember(owner = "QHZQTTDB", name = "b", descriptor = "Ljava/io/InputStream;")
    private InputStream field1319;

    @OriginalMember(owner = "QHZQTTDB", name = "c", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1320;

    @OriginalMember(owner = "QHZQTTDB", name = "h", descriptor = "I")
    private int field1325;

    @OriginalMember(owner = "QHZQTTDB", name = "i", descriptor = "I")
    private int field1326;

    @OriginalMember(owner = "QHZQTTDB", name = "g", descriptor = "[B")
    private byte[] field1324;

    @OriginalMember(owner = "QHZQTTDB", name = "<init>", descriptor = "(Ljava/net/Socket;LXHFSQKPU;B)V")
    public class52(Socket arg0, class65 arg1, byte arg2) throws IOException {
        if (arg2 != 6) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field1323 = arg1;
        this.field1321 = arg0;
        this.field1321.setSoTimeout(30000);
        this.field1321.setTcpNoDelay(true);
        this.field1319 = this.field1321.getInputStream();
        this.field1320 = this.field1321.getOutputStream();
    }

    @OriginalMember(owner = "QHZQTTDB", name = "a", descriptor = "()V")
    public void method469() {
        this.field1322 = true;
        try {
            if (this.field1319 != null) {
                this.field1319.close();
            }
            if (this.field1320 != null) {
                this.field1320.close();
            }
            if (this.field1321 != null) {
                this.field1321.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field1327 = false;
        synchronized (this) {
            this.notify();
        }
        this.field1324 = null;
    }

    @OriginalMember(owner = "QHZQTTDB", name = "b", descriptor = "()I")
    public int method470() throws IOException {
        return this.field1322 ? 0 : this.field1319.read();
    }

    @OriginalMember(owner = "QHZQTTDB", name = "c", descriptor = "()I")
    public int method471() throws IOException {
        return this.field1322 ? 0 : this.field1319.available();
    }

    @OriginalMember(owner = "QHZQTTDB", name = "a", descriptor = "([BII)V")
    public void method472(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1322) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1319.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "QHZQTTDB", name = "a", descriptor = "([BIII)V")
    public void method473(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (arg3 != -3381 || this.field1322) {
            return;
        }
        if (this.field1328) {
            this.field1328 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field1324 == null) {
            this.field1324 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field1324[this.field1326] = arg0[arg1 + var6];
                this.field1326 = (this.field1326 + 1) % 5000;
                if ((this.field1325 + 4900) % 5000 == this.field1326) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field1327) {
                this.field1327 = true;
                this.field1323.method129(this, 3);
            }
            this.notify();
        }
    }

    @OriginalMember(owner = "QHZQTTDB", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1327) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field1326 == this.field1325) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field1327) {
                    return;
                }
                var2 = this.field1325;
                if (this.field1326 >= this.field1325) {
                    var3 = this.field1326 - this.field1325;
                } else {
                    var3 = 5000 - this.field1325;
                }
            }
            if (var3 > 0) {
                try {
                    this.field1320.write(this.field1324, var2, var3);
                } catch (IOException var7) {
                    this.field1328 = true;
                }
                this.field1325 = (this.field1325 + var3) % 5000;
                try {
                    if (this.field1326 == this.field1325) {
                        this.field1320.flush();
                    }
                } catch (IOException var6) {
                    this.field1328 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "QHZQTTDB", name = "a", descriptor = "(Z)V")
    public void method474(boolean arg0) {
        System.out.println("dummy:" + this.field1322);
        System.out.println("tcycl:" + this.field1325);
        System.out.println("tnum:" + this.field1326);
        if (!arg0) {
            this.field1318 = -401;
        }
        System.out.println("writer:" + this.field1327);
        System.out.println("ioerror:" + this.field1328);
        try {
            System.out.println("available:" + this.method471());
        } catch (IOException var2) {
        }
    }
}
