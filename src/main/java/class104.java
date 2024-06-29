import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class104 implements Runnable {

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    private int field1821 = 0;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "Z")
    private boolean field1828 = false;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
    private int field1832 = 0;

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "Z")
    private boolean field1838 = false;

    @OriginalMember(owner = "client!sa", name = "C", descriptor = "Ljava/net/Socket;")
    private Socket field1844;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "Lke;")
    private class107 field1827;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "Ljava/io/InputStream;")
    private InputStream field1824;

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1840;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "Lch;")
    public static class133 field1830 = new class133(64);

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "Lhk;")
    public static class294 field1839 = new class294();

    @OriginalMember(owner = "client!sa", name = "A", descriptor = "Lqd;")
    public static class40 field1842 = class147.method1106("Lade Benutzeroberfl-=che )2 ", (byte) -88);

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "Lqd;")
    public static class40 field1841 = class147.method1106("Weiter", (byte) -76);

    @OriginalMember(owner = "client!sa", name = "B", descriptor = "Lpl;")
    public static class186 field1843 = new class186(30);

    @OriginalMember(owner = "client!sa", name = "G", descriptor = "Z")
    public static boolean field1847 = true;

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "Lqd;")
    public static class40 field1846 = class147.method1106(":assistreq:", (byte) -53);

    @OriginalMember(owner = "client!sa", name = "H", descriptor = "I")
    public static int field1848 = 0;

    @OriginalMember(owner = "client!sa", name = "I", descriptor = "Z")
    public static boolean field1849 = false;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "Lkg;")
    private class70 field1823;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "[B")
    private byte[] field1818;

    @OriginalMember(owner = "client!sa", name = "D", descriptor = "[[[B")
    public static byte[][][] field1845;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lda;B)V", line = 5)
    public static final void method778(class114 arg0, byte arg1) {
        field1834++;
        short var2 = 256;
        for (int var3 = 0; var3 < class298.field4982.length; var3++) {
            class298.field4982[var3] = 0;
        }
        if (arg1 != 86) {
            field1843 = (class186) null;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var5 = (int) (Math.random() * 128.0D * (double) var2);
            class298.field4982[var5] = (int) (Math.random() * 284.0D);
        }
        for (int var6 = 0; var6 < 20; var6++) {
            for (int var7 = 1; var7 < var2 - 1; var7++) {
                for (int var8 = 1; var8 < 127; var8++) {
                    int var9 = var8 + (var7 << 7);
                    class290.field4854[var9] = (class298.field4982[var9 + 1] + class298.field4982[var9 + 128] + class298.field4982[var9 + -128] + class298.field4982[var9 + -1]) / 4;
                }
            }
            int[] var10 = class298.field4982;
            class298.field4982 = class290.field4854;
            class290.field4854 = var10;
        }
        if (arg0 == null) {
            return;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg0.field4128; var12++) {
            for (int var13 = 0; var13 < arg0.field4116; var13++) {
                if (arg0.field1976[var11++] != 0) {
                    int var14 = var13 + arg0.field4122 + 16;
                    int var15 = var12 + arg0.field4119 + 16;
                    int var16 = (var15 << 7) + var14;
                    class298.field4982[var16] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III[B)V", line = 98)
    public final void method779(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field1820++;
        if (this.field1828) {
            return;
        }
        if (this.field1838) {
            this.field1838 = false;
            throw new IOException();
        }
        if (this.field1818 == null) {
            this.field1818 = new byte[5000];
        }
        synchronized (this) {
            int var6 = 0;
            if (arg1 == 16333) {
                while (arg0 > var6) {
                    this.field1818[this.field1821] = arg3[arg2 + var6];
                    this.field1821 = (this.field1821 + 1) % 5000;
                    if ((this.field1832 + 4900) % 5000 == this.field1821) {
                        throw new IOException();
                    }
                    var6++;
                }
                if (this.field1823 == null) {
                    this.field1823 = this.field1827.method800(-30, this, 3);
                }
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V", line = 150)
    public final void method780(boolean arg0) throws IOException {
        field1833++;
        if (!arg0) {
            this.field1824 = (InputStream) null;
        }
        if (!this.field1828 && this.field1838) {
            this.field1838 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)Z", line = 171)
    public static final boolean method781(int arg0, int arg1) {
        if (arg1 != 7127) {
            method788((byte) -83);
        }
        field1816++;
        if (arg0 < 32) {
            return false;
        } else if (arg0 == 127) {
            return false;
        } else {
            return arg0 < 129 || arg0 > 159;
        }
    }

    @OriginalMember(owner = "client!sa", name = "finalize", descriptor = "()V", line = 203)
    protected final void finalize() {
        this.method784(75);
        field1819++;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIIIII)V", line = 212)
    public static final void method782(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg6 == arg7 && arg3 == arg5 && arg1 == arg9 && arg2 == arg8) {
            class228.method1598(-18921, arg0, arg9, arg3, arg2, arg7);
        } else {
            int var10 = arg3;
            int var11 = arg7;
            int var12 = arg3 * 3;
            int var13 = arg6 * 3;
            int var14 = arg7 * 3;
            int var15 = arg1 * 3;
            int var16 = arg5 * 3;
            int var17 = arg9 - arg7 - (-var13 + var15);
            int var18 = arg8 * 3;
            int var19 = arg2 + var16 - arg3 - var18;
            int var20 = var15 + var14 - var13 - var13;
            int var21 = var13 - var14;
            int var22 = var16 - var12;
            int var23 = var18 + var12 - var16 - var16;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var17 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var23 * var25;
                int var31 = var21 * var24;
                int var32 = (var29 + var31 + var27 >> 12) + arg7;
                int var33 = var22 * var24;
                int var34 = arg3 + (var28 + var33 + var30 >> 12);
                class228.method1598(-18921, arg0, var32, var10, var34, var11);
                var10 = var34;
                var11 = var32;
            }
        }
        field1817++;
        int var35 = -115 / ((-arg4 - 39) / 52);
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(II)V", line = 286)
    public static final void method783(int arg0, int arg1) {
        field1826++;
        class273.method1890(class273.field4533, ((float) arg1 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
        class273.method1891(-50.0F, -60.0F, -50.0F);
        class273.method1893(class273.field4527, 0);
        if (arg0 < -48) {
            class273.method1886();
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Ljava/net/Socket;Lke;)V", line = 599)
    public class104(Socket arg0, class107 arg1) throws IOException {
        this.field1844 = arg0;
        this.field1827 = arg1;
        this.field1844.setSoTimeout(30000);
        this.field1844.setTcpNoDelay(true);
        this.field1824 = this.field1844.getInputStream();
        this.field1840 = this.field1844.getOutputStream();
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V", line = 307)
    public final void method784(int arg0) {
        field1831++;
        if (this.field1828) {
            return;
        }
        synchronized (this) {
            this.field1828 = true;
            this.notifyAll();
        }
        if (this.field1823 != null) {
            while (this.field1823.field1258 == 0) {
                class160.method1227(1L, false);
            }
            if (this.field1823.field1258 == 1) {
                try {
                    ((Thread) this.field1823.field1260).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field1823 = null;
        if (arg0 < 50) {
            field1839 = (class294) null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I[BII)V", line = 343)
    public final void method785(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field1822++;
        if (this.field1828 || arg3 != 28016) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field1824.read(arg1, arg2, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 += var5;
            arg0 -= var5;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "([IIII[I)V", line = 368)
    public static final void method786(int[] arg0, int arg1, int arg2, int arg3, int[] arg4) {
        if (arg3 < arg1) {
            int var5 = arg3;
            int var6 = (arg1 + arg3) / 2;
            int var7 = arg4[var6];
            arg4[var6] = arg4[arg1];
            arg4[arg1] = var7;
            int var8 = arg0[var6];
            arg0[var6] = arg0[arg1];
            arg0[arg1] = var8;
            for (int var9 = arg3; var9 < arg1; var9++) {
                if (arg4[var9] > (var9 & 0x1) + var7) {
                    int var10 = arg4[var9];
                    arg4[var9] = arg4[var5];
                    arg4[var5] = var10;
                    int var11 = arg0[var9];
                    arg0[var9] = arg0[var5];
                    arg0[var5++] = var11;
                }
            }
            arg4[arg1] = arg4[var5];
            arg4[var5] = var7;
            arg0[arg1] = arg0[var5];
            arg0[var5] = var8;
            method786(arg0, var5 - 1, arg2 ^ 0x0, arg3, arg4);
            method786(arg0, arg1, arg2, var5 - -1, arg4);
        }
        field1829++;
        if (arg2 != -1) {
            method783(83, -32);
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V", line = 427)
    public final void method787(int arg0) {
        field1835++;
        if (this.field1828) {
            return;
        }
        this.field1824 = new class226();
        this.field1840 = new class88();
        if (arg0 >= -102) {
            field1841 = (class40) null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V", line = 445)
    public static void method788(byte arg0) {
        field1845 = (byte[][][]) null;
        field1841 = null;
        field1839 = null;
        field1830 = null;
        field1846 = null;
        int var1 = 105 / ((-arg0 - 40) / 39);
        field1843 = null;
        field1842 = null;
    }

    @OriginalMember(owner = "client!sa", name = "run", descriptor = "()V", line = 470)
    public final void run() {
        try {
            while (true) {
                int var3;
                int var4;
                label88: {
                    synchronized (this) {
                        label89: {
                            if (this.field1832 == this.field1821) {
                                if (this.field1828) {
                                    break label89;
                                }
                                try {
                                    this.wait();
                                } catch (InterruptedException var13) {
                                }
                            }
                            var3 = this.field1832;
                            if (this.field1821 >= this.field1832) {
                                var4 = this.field1821 - this.field1832;
                            } else {
                                var4 = 5000 - this.field1832;
                            }
                            break label88;
                        }
                    }
                    try {
                        if (this.field1824 != null) {
                            this.field1824.close();
                        }
                        if (this.field1840 != null) {
                            this.field1840.close();
                        }
                        if (this.field1844 != null) {
                            this.field1844.close();
                        }
                    } catch (IOException var10) {
                    }
                    this.field1818 = null;
                    break;
                }
                if (var4 > 0) {
                    try {
                        this.field1840.write(this.field1818, var3, var4);
                    } catch (IOException var12) {
                        this.field1838 = true;
                    }
                    this.field1832 = (this.field1832 + var4) % 5000;
                    try {
                        if (this.field1832 == this.field1821) {
                            this.field1840.flush();
                        }
                    } catch (IOException var11) {
                        this.field1838 = true;
                    }
                }
            }
        } catch (Exception var15) {
            class44.method412(var15, -14997, (String) null);
        }
        field1837++;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)I", line = 553)
    public final int method789(byte arg0) throws IOException {
        field1836++;
        if (this.field1828) {
            return 0;
        } else if (arg0 == 22) {
            return this.field1824.read();
        } else {
            return 90;
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)I", line = 572)
    public final int method790(byte arg0) throws IOException {
        field1825++;
        if (arg0 == 66) {
            return this.field1828 ? 0 : this.field1824.available();
        } else {
            return -17;
        }
    }
}
