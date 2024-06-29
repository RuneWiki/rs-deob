import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class83 implements Runnable {

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    private int field1547 = 0;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "Z")
    private boolean field1545 = false;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    private int field1548 = 0;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "Z")
    private boolean field1555 = false;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "Ln;")
    private class138 field1550;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "Ljava/net/Socket;")
    private Socket field1541;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field1540;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1554;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "[I")
    public static int[] field1542 = new int[25];

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "[I")
    public static int[] field1551 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field1543 = 0;

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "I")
    public static int field1556 = 2;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "Lfb;")
    private class9 field1558;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "[B")
    private byte[] field1549;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)I")
    public final int method627(byte arg0) throws IOException {
        if (arg0 == 48) {
            field1538++;
            return this.field1555 ? 0 : this.field1540.read();
        } else {
            return 11;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)Ljd;")
    public static final class85 method628(int arg0) {
        field1557++;
        int var1 = class46.field836[0] * class164.field2805[0];
        byte[] var2 = class31.field628[0];
        int[] var3 = new int[var1];
        if (arg0 != 29012) {
            return null;
        }
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class114.field1996[class51.method413(var2[var4], 255)];
        }
        class169 var5 = new class169(class89.field1707, class116.field2024, class20.field421[0], class2.field27[0], class46.field836[0], class164.field2805[0], var3);
        class261.method1759(true);
        return var5;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V")
    public static void method629(int arg0) {
        if (arg0 != 0) {
            method629(64);
        }
        field1551 = null;
        field1542 = null;
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(I)V")
    public final void method630(int arg0) {
        field1559++;
        if (this.field1555) {
            return;
        }
        synchronized (this) {
            this.field1555 = true;
            this.notifyAll();
        }
        if (this.field1558 != null) {
            while (this.field1558.field133 == 0) {
                class162.method1137(arg0 + 121, 1L);
            }
            if (this.field1558.field133 == 1) {
                try {
                    ((Thread) this.field1558.field132).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        if (arg0 == 2) {
            this.field1558 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(B)I")
    public final int method631(byte arg0) throws IOException {
        field1546++;
        if (this.field1555) {
            return 0;
        } else {
            if (arg0 > -18) {
                this.finalize();
            }
            return this.field1540.available();
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I[BIZ)V")
    public final void method632(int arg0, byte[] arg1, int arg2, boolean arg3) throws IOException {
        field1539++;
        if (this.field1555) {
            return;
        }
        if (this.field1545) {
            this.field1545 = false;
            throw new IOException();
        }
        if (this.field1549 == null) {
            this.field1549 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field1549[this.field1548] = arg1[arg0 + var6];
                this.field1548 = (this.field1548 + 1) % 5000;
                if ((this.field1547 + 4900) % 5000 == this.field1548) {
                    throw new IOException();
                }
            }
            if (!arg3) {
                method629(6);
            }
            if (this.field1558 == null) {
                this.field1558 = this.field1550.method956(this, (byte) -121, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!hk", name = "run", descriptor = "()V")
    public final void run() {
        field1553++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field1548 == this.field1547) {
                        if (this.field1555) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field1548 < this.field1547) {
                        var2 = 5000 - this.field1547;
                    } else {
                        var2 = this.field1548 - this.field1547;
                    }
                    var3 = this.field1547;
                }
                if (var2 > 0) {
                    try {
                        this.field1554.write(this.field1549, var3, var2);
                    } catch (IOException var9) {
                        this.field1545 = true;
                    }
                    this.field1547 = (this.field1547 + var2) % 5000;
                    try {
                        if (this.field1548 == this.field1547) {
                            this.field1554.flush();
                        }
                    } catch (IOException var8) {
                        this.field1545 = true;
                    }
                }
            }
            try {
                if (this.field1540 != null) {
                    this.field1540.close();
                }
                if (this.field1554 != null) {
                    this.field1554.close();
                }
                if (this.field1541 != null) {
                    this.field1541.close();
                }
            } catch (IOException var7) {
            }
            this.field1549 = null;
        } catch (Exception var12) {
            class121.method883((String) null, (byte) -102, var12);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z[BII)V")
    public final void method633(boolean arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field1544++;
        if (arg0 || this.field1555) {
            return;
        }
        while (arg3 > 0) {
            int var5 = this.field1540.read(arg1, arg2, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 += var5;
            arg3 -= var5;
        }
    }

    @OriginalMember(owner = "client!hk", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field1552++;
        this.method630(2);
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Ljava/net/Socket;Ln;)V")
    public class83(Socket arg0, class138 arg1) throws IOException {
        this.field1550 = arg1;
        this.field1541 = arg0;
        this.field1541.setSoTimeout(30000);
        this.field1541.setTcpNoDelay(true);
        this.field1540 = this.field1541.getInputStream();
        this.field1554 = this.field1541.getOutputStream();
    }
}
