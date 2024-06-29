import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class85 implements Runnable {

    @OriginalMember(owner = "client!hu", name = "h", descriptor = "I")
    private int field1415 = 0;

    @OriginalMember(owner = "client!hu", name = "p", descriptor = "Z")
    private boolean field1423 = false;

    @OriginalMember(owner = "client!hu", name = "o", descriptor = "I")
    private int field1422 = 0;

    @OriginalMember(owner = "client!hu", name = "n", descriptor = "Z")
    private boolean field1421 = false;

    @OriginalMember(owner = "client!hu", name = "k", descriptor = "Ljava/net/Socket;")
    private Socket field1418;

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "Lci;")
    private class312 field1410;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "Ljava/io/InputStream;")
    private InputStream field1408;

    @OriginalMember(owner = "client!hu", name = "u", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1428;

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "[Lul;")
    public static class402[] field1412 = new class402[14];

    @OriginalMember(owner = "client!hu", name = "f", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!hu", name = "g", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!hu", name = "i", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!hu", name = "j", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!hu", name = "l", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!hu", name = "m", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!hu", name = "q", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!hu", name = "r", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!hu", name = "t", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!hu", name = "v", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!hu", name = "w", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!hu", name = "s", descriptor = "Lmg;")
    private class100 field1426;

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "Lvr;")
    public static class89 field1409;

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "[B")
    private byte[] field1411;

    static {
        new class180("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
    }

    @OriginalMember(owner = "client!hu", name = "run", descriptor = "()V", line = 3)
    public final void run() {
        field1424++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field1422 == this.field1415) {
                        if (this.field1421) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field1422;
                    if (this.field1422 > this.field1415) {
                        var3 = 5000 - this.field1422;
                    } else {
                        var3 = this.field1415 - this.field1422;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field1428.write(this.field1411, var2, var3);
                    } catch (IOException var9) {
                        this.field1423 = true;
                    }
                    this.field1422 = (this.field1422 + var3) % 5000;
                    try {
                        if (this.field1422 == this.field1415) {
                            this.field1428.flush();
                        }
                    } catch (IOException var8) {
                        this.field1423 = true;
                    }
                }
            }
            try {
                if (this.field1408 != null) {
                    this.field1408.close();
                }
                if (this.field1428 != null) {
                    this.field1428.close();
                }
                if (this.field1418 != null) {
                    this.field1418.close();
                }
            } catch (IOException var7) {
            }
            this.field1411 = null;
        } catch (Exception var12) {
            class169.method1200(null, var12, (byte) -113);
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)V", line = 75)
    public static void method689(int arg0) {
        field1409 = null;
        field1412 = null;
        if (arg0 != 30000) {
            field1409 = null;
        }
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(I)V", line = 89)
    public final void method690(int arg0) {
        field1417++;
        if (this.field1421) {
            return;
        }
        this.field1408 = new class49();
        this.field1428 = new class143();
        if (arg0 > -118) {
            this.finalize();
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(I[BII)V", line = 105)
    public final void method691(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field1420++;
        if (this.field1421) {
            return;
        }
        while (arg3 > 0) {
            int var5 = this.field1408.read(arg1, arg0, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 -= var5;
            arg0 += var5;
        }
        if (arg2 < 114) {
            method692(113, -95);
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)V", line = 130)
    public static final void method692(int arg0, int arg1) {
        field1427++;
        class434 var2 = class483.method2888(arg1, 83, arg0);
        var2.method2628(76);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)I", line = 141)
    public final int method693(byte arg0) throws IOException {
        if (arg0 >= -118) {
            this.method694(false);
        }
        field1414++;
        return this.field1421 ? 0 : this.field1408.available();
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Z)V", line = 162)
    public final void method694(boolean arg0) {
        field1429++;
        if (this.field1421) {
            return;
        }
        synchronized (this) {
            if (arg0) {
                this.field1408 = null;
            }
            this.field1421 = true;
            this.notifyAll();
        }
        if (this.field1426 != null) {
            while (this.field1426.field1604 == 0) {
                class185.method1285(112, 1L);
            }
            if (this.field1426.field1604 == 1) {
                try {
                    ((Thread) this.field1426.field1608).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field1426 = null;
    }

    @OriginalMember(owner = "client!hu", name = "finalize", descriptor = "()V", line = 203)
    protected final void finalize() {
        this.method694(false);
        field1430++;
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Ljava/net/Socket;Lci;)V", line = 315)
    public class85(Socket arg0, class312 arg1) throws IOException {
        this.field1418 = arg0;
        this.field1410 = arg1;
        this.field1418.setSoTimeout(30000);
        this.field1418.setTcpNoDelay(true);
        this.field1408 = this.field1418.getInputStream();
        this.field1428 = this.field1418.getOutputStream();
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(II[BB)V", line = 225)
    public final void method695(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        field1419++;
        if (this.field1421) {
            return;
        }
        if (this.field1423) {
            this.field1423 = false;
            throw new IOException();
        }
        if (this.field1411 == null) {
            this.field1411 = new byte[5000];
        }
        synchronized (this) {
            int var6 = 0;
            if (arg3 < 108) {
                this.run();
            }
            while (var6 < arg0) {
                this.field1411[this.field1415] = arg2[arg1 + var6];
                this.field1415 = (this.field1415 + 1) % 5000;
                if (((this.field1422 + 4900) % 5000) == this.field1415) {
                    throw new IOException();
                }
                var6++;
            }
            if (this.field1426 == null) {
                this.field1426 = this.field1410.method1959(-126, 3, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "(I)V", line = 291)
    public final void method696(int arg0) throws IOException {
        field1413++;
        if (!this.field1421 && arg0 == 30 && this.field1423) {
            this.field1423 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "(I)I", line = 329)
    public final int method697(int arg0) throws IOException {
        field1416++;
        if (arg0 != 0) {
            this.field1411 = null;
        }
        return this.field1421 ? 0 : this.field1408.read();
    }
}
