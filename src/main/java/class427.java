import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class427 extends class514 {

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "[I")
    public int[] field6084 = new int[16];

    @OriginalMember(owner = "client!cc", name = "M", descriptor = "[I")
    private int[] field6110 = new int[16];

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "[I")
    private int[] field6087 = new int[16];

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "[I")
    private int[] field6089 = new int[16];

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "[I")
    private int[] field6097 = new int[16];

    @OriginalMember(owner = "client!cc", name = "B", descriptor = "[I")
    private int[] field6099 = new int[16];

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "[I")
    private int[] field6088 = new int[16];

    @OriginalMember(owner = "client!cc", name = "V", descriptor = "[I")
    private int[] field6119 = new int[16];

    @OriginalMember(owner = "client!cc", name = "eb", descriptor = "[I")
    public int[] field6128 = new int[16];

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "[I")
    public int[] field6096 = new int[16];

    @OriginalMember(owner = "client!cc", name = "A", descriptor = "[[Lgt;")
    private class87[][] field6098 = new class87[16][128];

    @OriginalMember(owner = "client!cc", name = "pb", descriptor = "[I")
    private int[] field6139 = new int[16];

    @OriginalMember(owner = "client!cc", name = "rb", descriptor = "[I")
    private int[] field6141 = new int[16];

    @OriginalMember(owner = "client!cc", name = "mb", descriptor = "I")
    private int field6136 = 1000000;

    @OriginalMember(owner = "client!cc", name = "fb", descriptor = "[I")
    private int[] field6129 = new int[16];

    @OriginalMember(owner = "client!cc", name = "ub", descriptor = "[[Lgt;")
    private class87[][] field6144 = new class87[16][128];

    @OriginalMember(owner = "client!cc", name = "X", descriptor = "[I")
    private int[] field6121 = new int[16];

    @OriginalMember(owner = "client!cc", name = "U", descriptor = "I")
    private int field6118 = 256;

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "[I")
    private int[] field6094 = new int[16];

    @OriginalMember(owner = "client!cc", name = "jb", descriptor = "[I")
    private int[] field6133 = new int[16];

    @OriginalMember(owner = "client!cc", name = "C", descriptor = "Lfaa;")
    private class276 field6100 = new class276();

    @OriginalMember(owner = "client!cc", name = "Db", descriptor = "Lug;")
    private class410 field6153 = new class410(this);

    @OriginalMember(owner = "client!cc", name = "J", descriptor = "Lica;")
    private class205 field6107 = new class205(128);

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
    public static int field6090 = -2;

    @OriginalMember(owner = "client!cc", name = "ob", descriptor = "[J")
    public static long[] field6138 = new long[100];

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    public static int field6085 = -1;

    @OriginalMember(owner = "client!cc", name = "I", descriptor = "Lqp;")
    public static class586 field6106 = new class586(3, 5);

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
    public static int field6086;

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "I")
    public static int field6091;

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "I")
    public static int field6092;

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
    public static int field6093;

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
    public static int field6095;

    @OriginalMember(owner = "client!cc", name = "D", descriptor = "I")
    public static int field6101;

    @OriginalMember(owner = "client!cc", name = "E", descriptor = "I")
    public static int field6102;

    @OriginalMember(owner = "client!cc", name = "F", descriptor = "I")
    public static int field6103;

    @OriginalMember(owner = "client!cc", name = "G", descriptor = "I")
    public static int field6104;

    @OriginalMember(owner = "client!cc", name = "H", descriptor = "I")
    public static int field6105;

    @OriginalMember(owner = "client!cc", name = "K", descriptor = "I")
    public static int field6108;

    @OriginalMember(owner = "client!cc", name = "L", descriptor = "I")
    public static int field6109;

    @OriginalMember(owner = "client!cc", name = "N", descriptor = "I")
    public static int field6111;

    @OriginalMember(owner = "client!cc", name = "P", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!cc", name = "Q", descriptor = "I")
    public static int field6114;

    @OriginalMember(owner = "client!cc", name = "R", descriptor = "I")
    public static int field6115;

    @OriginalMember(owner = "client!cc", name = "S", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!cc", name = "T", descriptor = "I")
    public static int field6117;

    @OriginalMember(owner = "client!cc", name = "W", descriptor = "I")
    public static int field6120;

    @OriginalMember(owner = "client!cc", name = "Y", descriptor = "I")
    public static int field6122;

    @OriginalMember(owner = "client!cc", name = "Z", descriptor = "I")
    public static int field6123;

    @OriginalMember(owner = "client!cc", name = "ab", descriptor = "I")
    public static int field6124;

    @OriginalMember(owner = "client!cc", name = "bb", descriptor = "I")
    public static int field6125;

    @OriginalMember(owner = "client!cc", name = "cb", descriptor = "I")
    public static int field6126;

    @OriginalMember(owner = "client!cc", name = "db", descriptor = "I")
    public static int field6127;

    @OriginalMember(owner = "client!cc", name = "gb", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!cc", name = "hb", descriptor = "I")
    public static int field6131;

    @OriginalMember(owner = "client!cc", name = "ib", descriptor = "I")
    public static int field6132;

    @OriginalMember(owner = "client!cc", name = "kb", descriptor = "I")
    public static int field6134;

    @OriginalMember(owner = "client!cc", name = "lb", descriptor = "I")
    public static int field6135;

    @OriginalMember(owner = "client!cc", name = "nb", descriptor = "I")
    public static int field6137;

    @OriginalMember(owner = "client!cc", name = "qb", descriptor = "I")
    public static int field6140;

    @OriginalMember(owner = "client!cc", name = "sb", descriptor = "I")
    public static int field6142;

    @OriginalMember(owner = "client!cc", name = "tb", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!cc", name = "vb", descriptor = "I")
    public static int field6145;

    @OriginalMember(owner = "client!cc", name = "wb", descriptor = "I")
    public static int field6146;

    @OriginalMember(owner = "client!cc", name = "xb", descriptor = "I")
    public static int field6147;

    @OriginalMember(owner = "client!cc", name = "yb", descriptor = "I")
    public static int field6148;

    @OriginalMember(owner = "client!cc", name = "zb", descriptor = "I")
    public static int field6149;

    @OriginalMember(owner = "client!cc", name = "Ab", descriptor = "I")
    public static int field6150;

    @OriginalMember(owner = "client!cc", name = "Bb", descriptor = "I")
    public static int field6151;

    @OriginalMember(owner = "client!cc", name = "Eb", descriptor = "I")
    public static int field6154;

    @OriginalMember(owner = "client!cc", name = "Fb", descriptor = "I")
    private int field6155;

    @OriginalMember(owner = "client!cc", name = "Ib", descriptor = "I")
    private int field6158;

    @OriginalMember(owner = "client!cc", name = "Kb", descriptor = "I")
    private int field6160;

    @OriginalMember(owner = "client!cc", name = "Cb", descriptor = "J")
    private long field6152;

    @OriginalMember(owner = "client!cc", name = "Hb", descriptor = "J")
    private long field6157;

    @OriginalMember(owner = "client!cc", name = "Jb", descriptor = "Lbh;")
    private class504 field6159;

    @OriginalMember(owner = "client!cc", name = "Gb", descriptor = "Z")
    private boolean field6156;

    @OriginalMember(owner = "client!cc", name = "Lb", descriptor = "Z")
    private boolean field6161;

    @OriginalMember(owner = "client!cc", name = "O", descriptor = "[I")
    public static int[] field6112;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IILgt;I[I)Z")
    public final boolean method2521(int arg0, int arg1, class87 arg2, int arg3, int[] arg4) {
        field6111++;
        arg2.field1116 = class36.field419 / 100;
        if (arg2.field1102 >= 0 && (arg2.field1123 == null || arg2.field1123.method1439())) {
            arg2.method518(true);
            arg2.method2997(1);
            if (arg2.field1122 > 0 && this.field6098[arg2.field1100][arg2.field1122] == arg2) {
                this.field6098[arg2.field1100][arg2.field1122] = null;
            }
            return true;
        }
        int var6 = arg2.field1118;
        if (var6 > 0) {
            int var7 = var6 - (int) (Math.pow(2.0D, (double) this.field6094[arg2.field1100] * 4.921259842519685E-4D) * 16.0D + 0.5D);
            if (var7 < 0) {
                var7 = 0;
            }
            arg2.field1118 = var7;
        }
        arg2.field1123.method1403(this.method2536(arg2, (byte) -107));
        if (arg1 < 102) {
            this.method2543(58, -103, 82);
        }
        class482 var8 = arg2.field1114;
        boolean var9 = false;
        arg2.field1106++;
        arg2.field1112 += var8.field7318;
        double var10 = (double) ((arg2.field1113 - 60 << 8) + (arg2.field1120 * arg2.field1118 >> 12)) * 5.086263020833333E-6D;
        if (var8.field7314 > 0) {
            if (var8.field7315 > 0) {
                arg2.field1119 += (int) (Math.pow(2.0D, (double) var8.field7315 * var10) * 128.0D + 0.5D);
            } else {
                arg2.field1119 += 128;
            }
            if (arg2.field1119 * var8.field7314 >= 819200) {
                var9 = true;
            }
        }
        if (var8.field7316 != null) {
            if (var8.field7307 > 0) {
                arg2.field1108 += (int) (Math.pow(2.0D, (double) var8.field7307 * var10) * 128.0D + 0.5D);
            } else {
                arg2.field1108 += 128;
            }
            while (arg2.field1104 < var8.field7316.length - 2 && arg2.field1108 > (var8.field7316[arg2.field1104 + 2] & 0xFF) << 8) {
                arg2.field1104 += 2;
            }
            if ((var8.field7316.length - 2) == arg2.field1104 && var8.field7316[arg2.field1104 + 1] == 0) {
                var9 = true;
            }
        }
        if (arg2.field1102 >= 0 && var8.field7306 != null && (this.field6096[arg2.field1100] & 0x1) == 0 && (arg2.field1122 < 0 || this.field6098[arg2.field1100][arg2.field1122] != arg2)) {
            if (var8.field7310 > 0) {
                arg2.field1102 += (int) (Math.pow(2.0D, (double) var8.field7310 * var10) * 128.0D + 0.5D);
            } else {
                arg2.field1102 += 128;
            }
            while (var8.field7306.length - 2 > arg2.field1105 && arg2.field1102 > (var8.field7306[arg2.field1105 + 2] & 0xFF) << 8) {
                arg2.field1105 += 2;
            }
            if ((var8.field7306.length - 2) == arg2.field1105) {
                var9 = true;
            }
        }
        if (!var9) {
            arg2.field1123.method1398(arg2.field1116, this.method2554(true, arg2), this.method2556(-29, arg2));
            return false;
        }
        arg2.field1123.method1438(arg2.field1116);
        if (arg4 == null) {
            arg2.field1123.method1434(arg0);
        } else {
            arg2.field1123.method1425(arg4, arg3, arg0);
        }
        if (arg2.field1123.method1413()) {
            this.field6153.field5852.method2083(arg2.field1123);
        }
        arg2.method518(true);
        if (arg2.field1102 >= 0) {
            arg2.method2997(1);
            if (arg2.field1122 > 0 && this.field6098[arg2.field1100][arg2.field1122] == arg2) {
                this.field6098[arg2.field1100][arg2.field1122] = null;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BI)V")
    private final void method2522(byte arg0, int arg1) {
        field6122++;
        if (arg0 > -80 || (this.field6096[arg1] & 0x4) == 0) {
            return;
        }
        for (class87 var3 = (class87) this.field6153.field5850.method2496((byte) 30); var3 != null; var3 = (class87) this.field6153.field5850.method2494(123)) {
            if (var3.field1100 == arg1) {
                var3.field1111 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)V")
    private final void method2523(int arg0, int arg1) {
        field6117++;
        if (arg1 < 0) {
            for (int var3 = 0; var3 < 16; var3++) {
                this.method2523(71, var3);
            }
            return;
        }
        this.field6110[arg1] = 12800;
        this.field6097[arg1] = 8192;
        this.field6121[arg1] = 16383;
        this.field6099[arg1] = 8192;
        this.field6089[arg1] = 0;
        this.field6094[arg1] = 8192;
        this.method2557((byte) -83, arg1);
        this.method2522((byte) -84, arg1);
        this.field6096[arg1] = 0;
        this.field6129[arg1] = 32767;
        int var4 = 74 % ((22 - arg0) / 35);
        this.field6139[arg1] = 256;
        this.field6084[arg1] = 0;
        this.method2555((byte) -15, 8192, arg1);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)V")
    private final void method2524(int arg0, int arg1, int arg2) {
        field6150++;
        int var4 = 9 % ((arg2 + 36) / 50);
        if (this.field6133[arg0] != arg1) {
            this.field6133[arg0] = arg1;
            for (int var5 = 0; var5 < 128; var5++) {
                this.field6098[arg0][var5] = null;
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
    public final synchronized void method2525(int arg0) {
        this.method2532(arg0 ^ 0xFFFFFFBF, true);
        field6086++;
        if (arg0 != 2) {
            this.field6157 = -27L;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ldda;Lbh;Lgv;II)Z")
    public final synchronized boolean method2526(class597 arg0, class504 arg1, class300 arg2, int arg3, int arg4) {
        arg1.method3027();
        field6132++;
        if (arg3 < 56) {
            this.method2535(-75, -90, 66, -113);
        }
        boolean var6 = true;
        int[] var7 = null;
        if (arg4 > 0) {
            var7 = new int[] { arg4 };
        }
        for (class138 var8 = (class138) arg1.field7521.method1331(-1925); var8 != null; var8 = (class138) arg1.field7521.method1340((byte) 116)) {
            int var9 = (int) var8.field7465;
            class78 var10 = (class78) this.field6107.method1333((long) var9, false);
            if (var10 == null) {
                var10 = class130.method806(arg0, var9, 0);
                if (var10 == null) {
                    var6 = false;
                    continue;
                }
                this.field6107.method1341(var10, (byte) -97, (long) var9);
            }
            if (!var10.method456(var8.field1820, false, arg2, var7)) {
                var6 = false;
            }
        }
        if (var6) {
            arg1.method3029();
        }
        return var6;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIII)V")
    private final void method2527(int arg0, int arg1, int arg2, int arg3) {
        field6092++;
        class87 var5 = this.field6144[arg1][arg2];
        if (var5 == null) {
            return;
        }
        this.field6144[arg1][arg2] = null;
        if ((arg0 & this.field6096[arg1]) == 0) {
            var5.field1102 = 0;
            return;
        }
        for (class87 var6 = (class87) this.field6153.field5850.method2496((byte) -124); var6 != null; var6 = (class87) this.field6153.field5850.method2494(39)) {
            if (var5.field1100 == var6.field1100 && var6.field1102 < 0 && var5 != var6) {
                var5.field1102 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIB)V")
    private final void method2528(int arg0, int arg1, byte arg2) {
        if (arg2 >= 28) {
            this.field6099[arg0] = arg1;
            field6142++;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZLbh;Z)V")
    public final synchronized void method2529(boolean arg0, class504 arg1, boolean arg2) {
        this.method2534(0, arg0, arg2, arg1);
        field6104++;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "()Lft;")
    public final synchronized class514 method1397() {
        field6102++;
        return null;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(III)V")
    private final synchronized void method2530(int arg0, int arg1, int arg2) {
        if (arg2 != -999) {
            return;
        }
        field6135++;
        if (arg0 >= 0) {
            this.field6141[arg0] = arg1;
        } else {
            for (int var4 = 0; var4 < 16; var4++) {
                this.field6141[var4] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZILgt;)V")
    public final void method2531(boolean arg0, int arg1, class87 arg2) {
        if (arg1 > -11) {
            return;
        }
        field6101++;
        int var4 = arg2.field1109.field45.length;
        int var7;
        if (arg0 && arg2.field1109.field49) {
            int var5 = var4 + var4 - arg2.field1109.field48;
            int var6 = var4 << 8;
            var7 = (int) ((long) this.field6084[arg2.field1100] * (long) var5 >> 6);
            if (var6 <= var7) {
                var7 = var6 - (var7 - var6) - 1;
                arg2.field1123.method1407(true);
            }
        } else {
            var7 = (int) ((long) this.field6084[arg2.field1100] * (long) var4 >> 6);
        }
        arg2.field1123.method1421(var7);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZ)V")
    private final synchronized void method2532(int arg0, boolean arg1) {
        this.field6100.method1738();
        field6151++;
        this.field6159 = null;
        if (arg0 > -54) {
            this.method2548(94, (byte) -91);
        }
        this.method2537(arg1, 0);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V")
    private final void method2533(boolean arg0) {
        field6105++;
        if (!arg0) {
            return;
        }
        int var2 = this.field6155;
        int var3 = this.field6158;
        long var4 = this.field6152;
        if (this.field6159 != null && this.field6160 == var3) {
            this.method2534(0, this.field6156, this.field6161, this.field6159);
            this.method2533(true);
            return;
        }
        while (this.field6158 == var3) {
            while (this.field6100.field4054[var2] == var3) {
                this.field6100.method1733(var2);
                int var6 = this.field6100.method1736(var2);
                if (var6 == 1) {
                    this.field6100.method1732();
                    this.field6100.method1740(var2);
                    if (this.field6100.method1744()) {
                        if (this.field6159 != null) {
                            this.method2529(this.field6156, this.field6159, true);
                            this.method2533(true);
                            return;
                        }
                        if (!this.field6156 || var3 == 0) {
                            this.method2537(true, 0);
                            this.field6100.method1738();
                            return;
                        }
                        this.field6100.method1739(var4);
                    }
                    break;
                }
                if ((var6 & 0x80) != 0) {
                    this.method2551(30, var6);
                }
                this.field6100.method1742(var2);
                this.field6100.method1740(var2);
            }
            var2 = this.field6100.method1735();
            var3 = this.field6100.field4054[var2];
            var4 = this.field6100.method1746(var3);
        }
        this.field6155 = var2;
        this.field6152 = var4;
        this.field6158 = var3;
        if (this.field6159 != null && var3 > this.field6160) {
            this.field6158 = this.field6160;
            this.field6155 = -1;
            this.field6152 = this.field6100.method1746(this.field6158);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZZLbh;)V")
    private final synchronized void method2534(int arg0, boolean arg1, boolean arg2, class504 arg3) {
        field6143++;
        this.method2532(-81, arg2);
        this.field6100.method1747(arg3.field7522);
        this.field6156 = arg1;
        this.field6157 = 0L;
        int var5 = this.field6100.method1745();
        for (int var6 = arg0; var6 < var5; var6++) {
            this.field6100.method1733(var6);
            this.field6100.method1742(var6);
            this.field6100.method1740(var6);
        }
        this.field6155 = this.field6100.method1735();
        this.field6158 = this.field6100.field4054[this.field6155];
        this.field6152 = this.field6100.method1746(this.field6158);
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(IIII)V")
    private final void method2535(int arg0, int arg1, int arg2, int arg3) {
        field6113++;
        this.method2527(2, arg2, arg1, 64);
        if ((this.field6096[arg2] & 0x2) != 0) {
            for (class87 var5 = (class87) this.field6153.field5850.method2490(arg0); var5 != null; var5 = (class87) this.field6153.field5850.method2495((byte) 121)) {
                if (var5.field1100 == arg2 && var5.field1102 < 0) {
                    this.field6144[arg2][var5.field1113] = null;
                    this.field6144[arg2][arg1] = var5;
                    int var6 = (var5.field1120 * var5.field1118 >> 12) + var5.field1121;
                    var5.field1121 += arg1 - var5.field1113 << 8;
                    var5.field1113 = arg1;
                    var5.field1120 = var6 - var5.field1121;
                    var5.field1118 = 4096;
                    return;
                }
            }
        }
        class78 var7 = (class78) this.field6107.method1333((long) this.field6133[arg2], false);
        if (var7 == null) {
            return;
        }
        class5 var8 = var7.field906[arg1];
        if (var8 == null) {
            return;
        }
        class87 var9 = new class87();
        var9.field1110 = var7;
        var9.field1109 = var8;
        var9.field1100 = arg2;
        var9.field1114 = var7.field902[arg1];
        var9.field1122 = var7.field911[arg1];
        var9.field1113 = arg1;
        var9.field1101 = var7.field900 * arg3 * var7.field904[arg1] * arg3 + 1024 >> 11;
        var9.field1124 = var7.field907[arg1] & 0xFF;
        var9.field1121 = (arg1 << 8) - (var7.field908[arg1] & 0x7FFF);
        var9.field1119 = 0;
        var9.field1105 = arg0;
        var9.field1104 = 0;
        var9.field1108 = 0;
        var9.field1102 = -1;
        if (this.field6084[arg2] == 0) {
            var9.field1123 = class217.method1420(var8, this.method2536(var9, (byte) 80), this.method2554(true, var9), this.method2556(127, var9));
        } else {
            var9.field1123 = class217.method1420(var8, this.method2536(var9, (byte) 102), 0, this.method2556(12, var9));
            this.method2531(var7.field908[arg1] < 0, arg0 ^ 0xFFFFFFEA, var9);
        }
        if (var7.field908[arg1] < 0) {
            var9.field1123.method1417(-1);
        }
        if (var9.field1122 >= 0) {
            class87 var10 = this.field6098[arg2][var9.field1122];
            if (var10 != null && var10.field1102 < 0) {
                this.field6144[arg2][var10.field1113] = null;
                var10.field1102 = 0;
            }
            this.field6098[arg2][var9.field1122] = var9;
        }
        this.field6153.field5850.method2492(var9, (byte) -93);
        this.field6144[arg2][arg1] = var9;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([III)V")
    public final synchronized void method1425(int[] arg0, int arg1, int arg2) {
        field6120++;
        if (this.field6100.method1737()) {
            int var4 = this.field6100.field4055 * this.field6136 / class36.field419;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field6157;
                if ((this.field6152 - var5) >= 0L) {
                    this.field6157 = var5;
                    break;
                }
                int var7 = (int) ((this.field6152 + (long) var4 - this.field6157 - 1L) / (long) var4);
                this.field6157 += (long) var4 * (long) var7;
                this.field6153.method1425(arg0, arg1, var7);
                arg2 -= var7;
                arg1 += var7;
                this.method2533(true);
            } while (this.field6100.method1737());
        }
        this.field6153.method1425(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lgt;B)I")
    private final int method2536(class87 arg0, byte arg1) {
        field6149++;
        int var3 = arg0.field1121 + (arg0.field1120 * arg0.field1118 >> 12);
        int var4 = ((this.field6099[arg0.field1100] - 8192) * this.field6139[arg0.field1100] >> 12) + var3;
        int var5 = -98 / ((arg1 - 22) / 36);
        class482 var6 = arg0.field1114;
        if (var6.field7318 > 0 && (var6.field7317 > 0 || this.field6089[arg0.field1100] > 0)) {
            int var7 = var6.field7317 << 2;
            int var8 = var6.field7313 << 1;
            if (arg0.field1106 < var8) {
                var7 = arg0.field1106 * var7 / var8;
            }
            int var9 = (this.field6089[arg0.field1100] >> 7) + var7;
            double var10 = Math.sin((double) (arg0.field1112 & 0x1FF) * 0.01227184630308513D);
            var4 += (int) ((double) var9 * var10);
        }
        int var12 = (int) ((double) (arg0.field1109.field46 * 256) * Math.pow(2.0D, (double) var4 * 3.255208333333333E-4D) / (double) class36.field419 + 0.5D);
        return var12 >= 1 ? var12 : 1;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "()I")
    public final synchronized int method1419() {
        field6130++;
        return 0;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public final synchronized void method1434(int arg0) {
        field6103++;
        if (this.field6100.method1737()) {
            int var2 = this.field6100.field4055 * this.field6136 / class36.field419;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field6157;
                if ((this.field6152 - var3) >= 0L) {
                    this.field6157 = var3;
                    break;
                }
                int var5 = (int) (((long) var2 + this.field6152 - this.field6157 - 1L) / (long) var2);
                this.field6157 += (long) var2 * (long) var5;
                this.field6153.method1434(var5);
                arg0 -= var5;
                this.method2533(true);
            } while (this.field6100.method1737());
        }
        this.field6153.method1434(arg0);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)V")
    private final void method2537(boolean arg0, int arg1) {
        field6123++;
        if (arg0) {
            this.method2544(-1, 27489);
        } else {
            this.method2558(true, -1);
        }
        this.method2523(-13, -1);
        for (int var3 = arg1; var3 < 16; var3++) {
            this.field6133[var3] = this.field6088[var3];
        }
        for (int var4 = 0; var4 < 16; var4++) {
            this.field6087[var4] = class637.method3693(this.field6088[var4], -128);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BIII)V")
    private final void method2538(byte arg0, int arg1, int arg2, int arg3) {
        int var5 = 123 % ((arg0 - 25) / 42);
        field6093++;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)I")
    public final int method2539(int arg0) {
        if (arg0 != 0) {
            this.field6139 = null;
        }
        field6091++;
        return this.field6118;
    }

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "(I)V")
    public static final void method2540(int arg0) {
        if (class152.method894(class192.field2903, 1) || class242.method1563((byte) 118, class192.field2903)) {
            class201.method1304((byte) -38, 5000, class367.field5319 >> 10, class358.field5200 >> 10);
        } else {
            int var1 = class239.field3493.field1090[0] >> 3;
            int var2 = class239.field3493.field1089[0] >> 3;
            if (var1 >= 0 && (class35.field399 >> 3) > var1 && var2 >= 0 && class382.field5586 >> 3 > var2) {
                class201.method1304((byte) -38, 5000, var2, var1);
            } else {
                class201.method1304((byte) -38, 0, class382.field5586 >> 4, class35.field399 >> 4);
            }
        }
        field6134++;
        if (arg0 != 18818) {
            method2541((byte) -113);
        }
        class361.method2213(65280);
        class581.method3394((byte) -112);
        class165.method1048((byte) 83);
        class488.method2954(256);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
    public static void method2541(byte arg0) {
        field6106 = null;
        field6112 = null;
        if (arg0 < 69) {
            method2546(112);
        }
        field6138 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILgt;)Z")
    public final boolean method2542(int arg0, class87 arg1) {
        field6114++;
        if (arg0 != 1569430726) {
            return true;
        } else if (arg1.field1123 == null) {
            if (arg1.field1102 >= 0) {
                arg1.method2997(1);
                if (arg1.field1122 > 0 && this.field6098[arg1.field1100][arg1.field1122] == arg1) {
                    this.field6098[arg1.field1100][arg1.field1122] = null;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(III)V")
    public final synchronized void method2543(int arg0, int arg1, int arg2) {
        this.method2552(arg2, arg0, -128);
        if (arg1 != -1672502902) {
            this.method1437();
        }
        field6145++;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)V")
    private final void method2544(int arg0, int arg1) {
        field6154++;
        if (arg1 != 27489) {
            return;
        }
        for (class87 var3 = (class87) this.field6153.field5850.method2496((byte) 27); var3 != null; var3 = (class87) this.field6153.field5850.method2494(85)) {
            if (arg0 < 0 || var3.field1100 == arg0) {
                if (var3.field1123 != null) {
                    var3.field1123.method1438(class36.field419 / 100);
                    if (var3.field1123.method1413()) {
                        this.field6153.field5852.method2083(var3.field1123);
                    }
                    var3.method518(true);
                }
                if (var3.field1102 < 0) {
                    this.field6144[var3.field1100][var3.field1113] = null;
                }
                var3.method2997(1);
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "(I)V")
    public static final void method2545(int arg0) {
        if (class283.field4192 < 102) {
            class283.field4192 += 6;
        }
        field6095++;
        if (~class509.field7565 != arg0) {
            class549.field8179 -= class509.field7565 * 5;
            if (class549.field8179 >= class174.field2410) {
                class549.field8179 = class174.field2410 - 1;
            }
            class509.field7565 = 0;
            if (class549.field8179 < 0) {
                class549.field8179 = 0;
            }
        }
        for (int var1 = 0; var1 < class180.field2769; var1++) {
            class454 var2 = class202.field3019[var1];
            int var3 = var2.method2367(-28783);
            char var4 = var2.method2363(arg0 + 28815);
            int var5 = var2.method2368(32613);
            if (var3 == 84) {
                class395.method2378(false, 0);
            }
            if (var3 == 80) {
                class395.method2378(true, 0);
            } else if (var3 == 66 && (var5 & 0x4) != 0) {
                if (class87.field1103 != null) {
                    String var6 = "";
                    for (int var7 = class59.field709.length - 1; var7 >= 0; var7--) {
                        if (class59.field709[var7] != null && class59.field709[var7].length() > 0) {
                            var6 = var6 + class59.field709[var7] + '\n';
                        }
                    }
                    class87.field1103.setContents(new StringSelection(var6), null);
                }
            } else if (var3 == 67 && (var5 & 0x4) != 0) {
                if (class87.field1103 != null) {
                    Transferable var8 = class87.field1103.getContents(null);
                    if (var8 != null) {
                        try {
                            String var9 = (String) var8.getTransferData(DataFlavor.stringFlavor);
                            if (var9 != null) {
                                String[] var10 = class317.method1994(8, '\n', var9);
                                if (var10.length > 1) {
                                    for (int var11 = 0; var11 < var10.length; var11++) {
                                        class545.field8138 = var10[var11];
                                        class395.method2378(false, ~arg0);
                                    }
                                } else {
                                    class545.field8138 = class545.field8138 + var9;
                                }
                            }
                        } catch (Exception var12) {
                        }
                    }
                }
            } else if (var3 == 85 && class393.field5722 > 0) {
                class545.field8138 = class545.field8138.substring(0, class393.field5722 - 1) + class545.field8138.substring(class393.field5722);
                class393.field5722--;
            } else if (var3 == 101 && class393.field5722 < class545.field8138.length()) {
                class545.field8138 = class545.field8138.substring(0, class393.field5722) + class545.field8138.substring(class393.field5722 + 1);
            } else if (var3 == 96 && class393.field5722 > 0) {
                class393.field5722--;
            } else if (var3 == 97 && class393.field5722 < class545.field8138.length()) {
                class393.field5722++;
            } else if (var3 == 102) {
                class393.field5722 = 0;
            } else if (var3 == 103) {
                class393.field5722 = class545.field8138.length();
            } else if (var3 == 104 && class538.field7973 < class59.field709.length) {
                class538.field7973++;
                class479.method2904(true);
                class393.field5722 = class545.field8138.length();
            } else if (var3 == 105 && class538.field7973 > 0) {
                class538.field7973--;
                class479.method2904(true);
                class393.field5722 = class545.field8138.length();
            } else if (class243.method1570(arg0 + 1, var4) || var4 == ':' || var4 == ',' || var4 == ' ' || var4 == '_' || var4 == '-' || var4 == '+' || var4 == '[' || var4 == ']') {
                class545.field8138 = class545.field8138.substring(0, class393.field5722) + class202.field3019[var1].method2363(arg0 + 28815) + class545.field8138.substring(class393.field5722);
                class393.field5722++;
            }
        }
        class180.field2769 = 0;
        class539.method3164(-125);
    }

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "(I)[Lqp;")
    public static final class586[] method2546(int arg0) {
        field6148++;
        return arg0 > -71 ? null : new class586[] { class31.field309, class327.field4831, class269.field3987, field6106, class451.field6586, class605.field8915, class260.field3808, class278.field4127, class477.field7266, class518.field7694, class362.field5232, class126.field1658, class604.field8899, class69.field786, class323.field4801, class339.field4969, class39.field442, class127.field1683, class321.field4778, class231.field3423, class195.field2941, class477.field7263, class541.field8097, class43.field520, class154.field1978, class51.field613, class114.field1461, class566.field8406, class92.field1146, class163.field2175, class623.field9121, class192.field2902, class257.field3760, class121.field1565, class125.field1643, class18.field167, class39.field437, class231.field3415, class122.field1571, class541.field8101, class380.field5564, class99.field1252, class235.field3453, class620.field9042, class575.field8486, class160.field2138, class141.field1849, class331.field4908, class561.field8319, class195.field2937, class519.field7714, class556.field8253, class433.field6346, class552.field8217, class596.field8781, class634.field9253, class56.field689, class578.field8519, class168.field2275, class124.field1603, class21.field189, class611.field8984, class616.field9017, class88.field1127, class22.field198, class277.field4067, class392.field5712, class377.field5547, class554.field8231, class182.field2790, class317.field4744, class537.field7951, class586.field8707, class382.field5583, class508.field7553, class550.field8198, class591.field8738, class578.field8513, class587.field8716, class372.field5395, class167.field2259, class604.field8901, class487.field7376, client.field9083, class252.field3679, class50.field588, class14.field132, class10.field82, class518.field7707, class290.field4261, class632.field9237, class62.field726, class593.field8761, class173.field2340, class223.field3274, class300.field4395, class356.field5177, class420.field6033, class643.field9331, class123.field1587, class625.field9162, class36.field410, class99.field1232, class598.field8829, class605.field8917, class468.field6828, class546.field8154, class143.field1858, class70.field800, class328.field4836, class646.field9377, class76.field884, class202.field3020, class218.field3234 };
    }

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "(I)Z")
    public final synchronized boolean method2547(int arg0) {
        field6146++;
        if (arg0 <= 86) {
            field6138 = null;
        }
        return this.field6100.method1737();
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)V")
    public final synchronized void method2548(int arg0, byte arg1) {
        this.field6118 = arg0;
        field6137++;
        if (arg1 > -65) {
            this.method2557((byte) 31, -55);
        }
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(III)Lvf;")
    public static final class73 method2549(int arg0, int arg1, int arg2) {
        class415 var3 = class526.field7777[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5985;
    }

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "(I)V")
    public final synchronized void method2550(int arg0) {
        field6140++;
        for (class78 var2 = (class78) this.field6107.method1331(-1925); var2 != null; var2 = (class78) this.field6107.method1340((byte) 102)) {
            var2.method453(124);
        }
        int var3 = -113 % ((arg0 - 84) / 40);
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(II)V")
    private final void method2551(int arg0, int arg1) {
        if (arg0 < 1) {
            this.field6097 = null;
        }
        field6108++;
        int var3 = arg1 & 0xF0;
        if (var3 == 128) {
            int var4 = arg1 & 0xF;
            int var5 = (arg1 & 0x7F1D) >> 8;
            int var6 = (arg1 & 0x7F3B5B) >> 16;
            this.method2527(2, var4, var5, var6);
        } else if (var3 == 144) {
            int var7 = arg1 & 0xF;
            int var8 = (arg1 & 0x7F52) >> 8;
            int var9 = (arg1 & 0x7FF46A) >> 16;
            if (var9 > 0) {
                this.method2535(0, var8, var7, var9);
            } else {
                this.method2527(2, var7, var8, 64);
            }
        } else if (var3 == 160) {
            int var10 = arg1 & 0xF;
            int var11 = (arg1 & 0x7F8A) >> 8;
            int var12 = (arg1 & 0x7FBFB1) >> 16;
            this.method2538((byte) -51, var12, var11, var10);
        } else if (var3 == 176) {
            int var13 = arg1 & 0xF;
            int var14 = (arg1 & 0x7F48) >> 8;
            int var15 = (arg1 & 0x7FC858) >> 16;
            if (var14 == 0) {
                this.field6087[var13] = class637.method3693(this.field6087[var13], -2080769) + (var15 << 14);
            }
            if (var14 == 32) {
                this.field6087[var13] = class637.method3693(this.field6087[var13], -16257) + (var15 << 7);
            }
            if (var14 == 1) {
                this.field6089[var13] = class637.method3693(this.field6089[var13], -16257) + (var15 << 7);
            }
            if (var14 == 33) {
                this.field6089[var13] = var15 + class637.method3693(this.field6089[var13], -128);
            }
            if (var14 == 5) {
                this.field6094[var13] = (var15 << 7) + class637.method3693(-16257, this.field6094[var13]);
            }
            if (var14 == 37) {
                this.field6094[var13] = class637.method3693(this.field6094[var13], -128) + var15;
            }
            if (var14 == 7) {
                this.field6110[var13] = (var15 << 7) + class637.method3693(-16257, this.field6110[var13]);
            }
            if (var14 == 39) {
                this.field6110[var13] = class637.method3693(this.field6110[var13], -128) + var15;
            }
            if (var14 == 10) {
                this.field6097[var13] = class637.method3693(this.field6097[var13], -16257) + (var15 << 7);
            }
            if (var14 == 42) {
                this.field6097[var13] = class637.method3693(-128, this.field6097[var13]) + var15;
            }
            if (var14 == 11) {
                this.field6121[var13] = (var15 << 7) + class637.method3693(-16257, this.field6121[var13]);
            }
            if (var14 == 43) {
                this.field6121[var13] = var15 + class637.method3693(this.field6121[var13], -128);
            }
            if (var14 == 64) {
                if (var15 >= 64) {
                    this.field6096[var13] = class313.method1926(this.field6096[var13], 1);
                } else {
                    this.field6096[var13] = class637.method3693(this.field6096[var13], -2);
                }
            }
            if (var14 == 65) {
                if (var15 >= 64) {
                    this.field6096[var13] = class313.method1926(this.field6096[var13], 2);
                } else {
                    this.method2557((byte) -57, var13);
                    this.field6096[var13] = class637.method3693(this.field6096[var13], -3);
                }
            }
            if (var14 == 99) {
                this.field6129[var13] = (var15 << 7) + class637.method3693(127, this.field6129[var13]);
            }
            if (var14 == 98) {
                this.field6129[var13] = class637.method3693(this.field6129[var13], 16256) + var15;
            }
            if (var14 == 101) {
                this.field6129[var13] = (var15 << 7) + class637.method3693(127, this.field6129[var13]) + 16384;
            }
            if (var14 == 100) {
                this.field6129[var13] = class637.method3693(this.field6129[var13], 16256) + var15 + 16384;
            }
            if (var14 == 120) {
                this.method2544(var13, 27489);
            }
            if (var14 == 121) {
                this.method2523(-44, var13);
            }
            if (var14 == 123) {
                this.method2558(true, var13);
            }
            if (var14 == 6) {
                int var16 = this.field6129[var13];
                if (var16 == 16384) {
                    this.field6139[var13] = class637.method3693(-16257, this.field6139[var13]) + (var15 << 7);
                }
            }
            if (var14 == 38) {
                int var17 = this.field6129[var13];
                if (var17 == 16384) {
                    this.field6139[var13] = class637.method3693(-128, this.field6139[var13]) + var15;
                }
            }
            if (var14 == 16) {
                this.field6084[var13] = (var15 << 7) + class637.method3693(-16257, this.field6084[var13]);
            }
            if (var14 == 48) {
                this.field6084[var13] = class637.method3693(this.field6084[var13], -128) + var15;
            }
            if (var14 == 81) {
                if (var15 < 64) {
                    this.method2522((byte) -93, var13);
                    this.field6096[var13] = class637.method3693(this.field6096[var13], -5);
                } else {
                    this.field6096[var13] = class313.method1926(this.field6096[var13], 4);
                }
            }
            if (var14 == 17) {
                this.method2555((byte) -15, (var15 << 7) + (this.field6119[var13] & 0xFFFFC07F), var13);
            }
            if (var14 == 49) {
                this.method2555((byte) -15, (this.field6119[var13] & 0xFFFFFF80) + var15, var13);
            }
        } else if (var3 == 192) {
            int var18 = arg1 & 0xF;
            int var19 = arg1 >> 8 & 0x7F;
            this.method2524(var18, this.field6087[var18] + var19, -113);
        } else if (var3 == 208) {
            int var20 = arg1 & 0xF;
            int var21 = arg1 >> 8 & 0x7F;
            this.method2553(var20, var21, -82);
        } else if (var3 == 224) {
            int var22 = arg1 & 0xF;
            int var23 = (arg1 >> 8 & 0x7F) + (arg1 >> 9 & 0x3F80);
            this.method2528(var22, var23, (byte) 124);
        } else {
            int var24 = arg1 & 0xFF;
            if (var24 == 255) {
                this.method2537(true, 0);
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(III)V")
    private final void method2552(int arg0, int arg1, int arg2) {
        this.field6088[arg0] = arg1;
        if (arg2 >= -63) {
            this.method2556(-1, null);
        }
        field6116++;
        this.field6087[arg0] = class637.method3693(-128, arg1);
        this.method2524(arg0, arg1, 118);
    }

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "(III)V")
    private final void method2553(int arg0, int arg1, int arg2) {
        field6147++;
        int var4 = 57 / ((-arg2 - 26) / 52);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZLgt;)I")
    private final int method2554(boolean arg0, class87 arg1) {
        field6127++;
        if (this.field6141[arg1.field1100] == 0) {
            return 0;
        }
        class482 var3 = arg1.field1114;
        int var4 = this.field6121[arg1.field1100] * this.field6110[arg1.field1100] + 4096 >> 13;
        int var5 = var4 * var4 + 16384 >> 15;
        int var6 = arg1.field1101 * var5 + 16384 >> 15;
        int var7 = this.field6118 * var6 + 128 >> 8;
        int var8 = this.field6141[arg1.field1100] * var7 + 128 >> 8;
        if (var3.field7314 > 0) {
            var8 = (int) (Math.pow(0.5D, (double) arg1.field1119 * 1.953125E-5D * (double) var3.field7314) * (double) var8 + 0.5D);
        }
        if (!arg0) {
            return -45;
        }
        if (var3.field7316 != null) {
            int var9 = arg1.field1108;
            int var10 = var3.field7316[arg1.field1104 + 1];
            if ((var3.field7316.length - 2) > arg1.field1104) {
                int var11 = (var3.field7316[arg1.field1104] & 0xFF) << 8;
                int var12 = (var3.field7316[arg1.field1104 + 2] & 0xFF) << 8;
                var10 += (var3.field7316[arg1.field1104 + 3] - var10) * (var9 - var11) / (var12 - var11);
            }
            var8 = var8 * var10 + 32 >> 6;
        }
        if (arg1.field1102 > 0 && var3.field7306 != null) {
            int var13 = arg1.field1102;
            int var14 = var3.field7306[arg1.field1105 + 1];
            if ((var3.field7306.length - 2) > arg1.field1105) {
                int var15 = (var3.field7306[arg1.field1105] & 0xFF) << 8;
                int var16 = var3.field7306[arg1.field1105 + 2] & 0xFF << 8;
                var14 += (var13 - var15) * (var3.field7306[arg1.field1105 + 3] - var14) / (var16 - var15);
            }
            var8 = var8 * var14 + 32 >> 6;
        }
        return var8;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BII)V")
    private final void method2555(byte arg0, int arg1, int arg2) {
        field6124++;
        if (arg0 != -15) {
            this.method2527(24, 79, 110, 24);
        }
        this.field6119[arg2] = arg1;
        this.field6128[arg2] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(ILgt;)I")
    private final int method2556(int arg0, class87 arg1) {
        field6109++;
        int var3 = 6 % ((arg0 - 68) / 47);
        int var4 = this.field6097[arg1.field1100];
        return var4 < 8192 ? arg1.field1124 * var4 + 32 >> 6 : 16384 - ((128 - arg1.field1124) * (16384 - var4) + 32 >> 6);
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(BI)V")
    private final void method2557(byte arg0, int arg1) {
        field6131++;
        if (arg0 > -31) {
            this.field6084 = null;
        }
        if ((this.field6096[arg1] & 0x2) == 0) {
            return;
        }
        for (class87 var3 = (class87) this.field6153.field5850.method2496((byte) -126); var3 != null; var3 = (class87) this.field6153.field5850.method2494(117)) {
            if (var3.field1100 == arg1 && this.field6144[arg1][var3.field1113] == null && var3.field1102 < 0) {
                var3.field1102 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(ZI)V")
    private final void method2558(boolean arg0, int arg1) {
        for (class87 var3 = (class87) this.field6153.field5850.method2496((byte) -96); var3 != null; var3 = (class87) this.field6153.field5850.method2494(38)) {
            if ((arg1 < 0 || var3.field1100 == arg1) && var3.field1102 < 0) {
                this.field6144[var3.field1100][var3.field1113] = null;
                var3.field1102 = 0;
            }
        }
        field6115++;
        if (!arg0) {
            this.field6152 = 24L;
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "()Lft;")
    public final synchronized class514 method1437() {
        field6126++;
        return this.field6153;
    }

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "(I)V")
    public final synchronized void method2559(int arg0) {
        field6125++;
        if (arg0 > -106) {
            this.method2552(-65, 67, 116);
        }
        for (class78 var2 = (class78) this.field6107.method1331(-1925); var2 != null; var2 = (class78) this.field6107.method1340((byte) -125)) {
            var2.method2997(1);
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
    public class427() {
        this.method2530(-1, 256, -999);
        this.method2537(true, 0);
    }
}
