import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class312 {

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "[I")
    private int[] field5278;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "[I")
    private int[] field5274;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "Li;")
    private class120 field5269;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "Li;")
    private class120 field5275;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "[Li;")
    private class120[] field5270;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "Lok;")
    private static class41 field5267 = class137.method956("Drop", 45);

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public static int field5266 = 0;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "Lok;")
    public static class41 field5277 = field5267;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "Lmh;")
    public static class65 field5273;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "Laf;")
    public static class72 field5262;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "Ldc;")
    public static class7 field5265;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "[I")
    public static int[] field5263;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V", line = 5)
    public static void method2159(byte arg0) {
        field5277 = null;
        field5263 = null;
        field5265 = null;
        field5262 = null;
        if (arg0 == -55) {
            field5273 = null;
            field5267 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIZIII)V", line = 24)
    public static final void method2160(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class212.method1496(-93, arg5);
        field5268++;
        int var7 = 0;
        int var8 = arg5 - arg2;
        if (var8 < 0) {
            var8 = 0;
        }
        if (!arg3) {
            field5265 = (class7) null;
        }
        int var9 = -arg5;
        int var10 = arg5;
        int var11 = -var8;
        int var12 = -1;
        int var13 = -1;
        int var14 = var8;
        int[] var15 = class239.field3829[arg4];
        int var16 = arg1 - var8;
        class269.method1908(19, var15, arg0, var16, arg1 - arg5);
        int var17 = arg1 + var8;
        class269.method1908(19, var15, arg6, var17, var16);
        class269.method1908(19, var15, arg0, arg1 + arg5, var17);
        while (var7 < var10) {
            var12 += 2;
            var9 += var12;
            var13 += 2;
            var11 += var13;
            if (var11 >= 0 && var14 >= 1) {
                class207.field3354[var14] = var7;
                var14--;
                var11 -= var14 << 1;
            }
            var7++;
            if (var9 >= 0) {
                var10--;
                var9 -= var10 << 1;
                if (var10 >= var8) {
                    int[] var18 = class239.field3829[arg4 + var10];
                    int[] var19 = class239.field3829[arg4 - var10];
                    int var20 = arg1 - var7;
                    int var21 = arg1 + var7;
                    class269.method1908(19, var18, arg0, var21, var20);
                    class269.method1908(19, var19, arg0, var21, var20);
                } else {
                    int[] var22 = class239.field3829[arg4 + var10];
                    int[] var23 = class239.field3829[arg4 - var10];
                    int var24 = class207.field3354[var10];
                    int var25 = arg1 + var7;
                    int var26 = arg1 - var7;
                    int var27 = arg1 - var24;
                    int var28 = arg1 + var24;
                    class269.method1908(19, var22, arg0, var27, var26);
                    class269.method1908(19, var22, arg6, var28, var27);
                    class269.method1908(19, var22, arg0, var25, var28);
                    class269.method1908(19, var23, arg0, var27, var26);
                    class269.method1908(19, var23, arg6, var28, var27);
                    class269.method1908(19, var23, arg0, var25, var28);
                }
            }
            int[] var29 = class239.field3829[arg4 + var7];
            int[] var30 = class239.field3829[arg4 - var7];
            int var31 = arg1 - var10;
            int var32 = arg1 + var10;
            if (var7 >= var8) {
                class269.method1908(19, var29, arg0, var32, var31);
                class269.method1908(19, var30, arg0, var32, var31);
            } else {
                int var33 = var14 < var7 ? class207.field3354[var7] : var14;
                int var34 = arg1 + var33;
                int var35 = arg1 - var33;
                class269.method1908(19, var29, arg0, var35, var31);
                class269.method1908(19, var29, arg6, var34, var35);
                class269.method1908(19, var29, arg0, var32, var34);
                class269.method1908(19, var30, arg0, var35, var31);
                class269.method1908(19, var30, arg6, var34, var35);
                class269.method1908(19, var30, arg0, var32, var34);
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZIILmh;ILse;DZ)[I", line = 151)
    public final int[] method2161(boolean arg0, int arg1, int arg2, class65 arg3, int arg4, class96 arg5, double arg6, boolean arg7) {
        if (arg4 != -1) {
            field5273 = (class65) null;
        }
        field5264++;
        class55.method389(-45, arg6);
        class62.field901 = arg5;
        class175.field2848 = arg3;
        int[] var10 = new int[arg1 * arg2];
        class306.method2112(-95, arg1, arg2);
        for (int var11 = 0; var11 < this.field5270.length; var11++) {
            this.field5270[var11].method856(arg2, arg4 + 2, arg1);
        }
        byte var12;
        int var13;
        int var14;
        if (arg7) {
            var12 = -1;
            var13 = arg1 - 1;
            var14 = -1;
        } else {
            var13 = 0;
            var12 = 1;
            var14 = arg1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg2; var16++) {
            if (arg0) {
                var15 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field5269.field1770) {
                int[] var21 = this.field5269.method14(var16, -14959);
                var20 = var21;
                var18 = var21;
                var19 = var21;
            } else {
                int[][] var17 = this.field5269.method168(var16, true);
                var18 = var17[2];
                var19 = var17[0];
                var20 = var17[1];
            }
            for (int var22 = var13; var22 != var14; var22 += var12) {
                int var23 = var19[var22] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = var20[var22] >> 4;
                int var25 = class294.field4751[var23];
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var26 = var18[var22] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class294.field4751[var24];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class294.field4751[var26];
                var10[var15++] = (var27 << 8) + (var25 << 16) + var28;
                if (arg0) {
                    var15 += arg1 - 1;
                }
            }
        }
        for (int var29 = 0; var29 < this.field5270.length; var29++) {
            this.field5270[var29].method435(true);
        }
        return var10;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBI)V", line = 303)
    public static final void method2162(int arg0, byte arg1, int arg2) {
        if (class244.field3900 != 0 && arg2 != -1) {
            class271.method1916(16611, class81.field1201, class244.field3900, false, 0, arg2);
            class265.field4193 = true;
        }
        if (arg1 != -109) {
            field5273 = (class65) null;
        }
        field5280++;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lmh;ILmh;)I", line = 323)
    public static final int method2163(class65 arg0, int arg1, class65 arg2) {
        int var3 = 0;
        if (arg0.method463(1, class48.field740)) {
            var3++;
        }
        field5281++;
        if (arg0.method463(1, class9.field118)) {
            var3++;
        }
        if (arg0.method463(1, class256.field4117)) {
            var3++;
        }
        if (arg2.method463(1, class48.field740)) {
            var3++;
        }
        if (arg1 != 27585) {
            return -69;
        }
        if (arg2.method463(1, class9.field118)) {
            var3++;
        }
        if (arg2.method463(1, class256.field4117)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lmh;Lmh;I)V", line = 356)
    public static final void method2164(class65 arg0, class65 arg1, int arg2) {
        class222.field3553 = arg0;
        int var3 = 39 % ((arg2 + 42) / 62);
        field5271++;
        class35.field524 = arg1;
        class149.field2317 = class222.field3553.method481(17377, 3);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BIIIIII)V", line = 374)
    public static final void method2165(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != -105) {
            return;
        }
        class162[] var7 = class35.field529;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class162 var9 = var7[var8];
            if (var9 != null && var9.field2584 == 2) {
                class80.method571((var9.field2577 - class88.field1300 << 7) + var9.field2574, arg1 >> 1, arg3, var9.field2581 * 2, 25757, arg2 >> 1, (var9.field2580 - class55.field809 << 7) + var9.field2579, arg6);
                if (class191.field3095 > -1 && (class18.field234 % 20) < 10) {
                    class277.field4538[var9.field2583].method83(class191.field3095 + arg5 - 12, class123.field1835 + arg4 + -28);
                }
            }
        }
        field5279++;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILse;Lmh;)Z", line = 405)
    public final boolean method2166(int arg0, class96 arg1, class65 arg2) {
        if (arg0 < 50) {
            this.field5270 = (class120[]) null;
        }
        field5272++;
        for (int var4 = 0; var4 < this.field5274.length; var4++) {
            if (!arg2.method463(1, this.field5274[var4])) {
                return false;
            }
        }
        for (int var5 = 0; var5 < this.field5278.length; var5++) {
            if (!arg1.method689(this.field5278[var5], (byte) 91)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZLmh;ILse;BD)[B", line = 441)
    public final byte[] method2167(int arg0, boolean arg1, class65 arg2, int arg3, class96 arg4, byte arg5, double arg6) {
        byte[] var9 = new byte[arg0 * 4 * arg3];
        class55.method389(125, arg6);
        field5276++;
        class62.field901 = arg4;
        class175.field2848 = arg2;
        class306.method2112(-93, arg0, arg3);
        for (int var10 = 0; var10 < this.field5270.length; var10++) {
            this.field5270[var10].method856(arg3, 1, arg0);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg3; var12++) {
            if (arg1) {
                var11 = var12 << 2;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field5269.field1770) {
                int[] var13 = this.field5269.method14(var12, -14959);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field5269.method168(var12, true);
                var15 = var17[1];
                var16 = var17[2];
                var14 = var17[0];
            }
            int[] var18;
            if (this.field5275.field1770) {
                var18 = this.field5275.method14(var12, -14959);
            } else {
                var18 = this.field5275.method168(var12, true)[0];
            }
            for (int var19 = arg0 - 1; var19 >= 0; var19--) {
                int var20 = var14[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                int var21 = var15[var19] >> 4;
                if (var20 < 0) {
                    var20 = 0;
                }
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = class294.field4751[var20];
                int var23 = class294.field4751[var21];
                int var24 = var16[var19] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = class294.field4751[var24];
                int var26;
                if (var22 == 0 && var23 == 0 && var25 == 0) {
                    var26 = 0;
                } else {
                    var26 = var18[var19] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                }
                var9[var11++] = (byte) var22;
                var9[var11++] = (byte) var23;
                var9[var11++] = (byte) var25;
                var9[var11++] = (byte) var26;
                if (arg1) {
                    var11 += (arg0 << 2) - 4;
                }
            }
        }
        for (int var27 = 0; var27 < this.field5270.length; var27++) {
            this.field5270[var27].method435(true);
        }
        if (arg5 > -68) {
            field5265 = (class7) null;
        }
        return var9;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V", line = 586)
    public class312() {
        this.field5278 = new int[0];
        this.field5274 = new int[0];
        this.field5269 = new class32();
        this.field5269.field1771 = 1;
        this.field5275 = new class32();
        this.field5275.field1771 = 1;
        this.field5270 = new class120[] { this.field5269, this.field5275 };
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Llb;)V", line = 602)
    public class312(class112 arg0) {
        int var2 = arg0.method792(2);
        int[][] var3 = new int[var2][];
        int var4 = 0;
        this.field5270 = new class120[var2];
        int var5 = 0;
        for (int var6 = 0; var6 < var2; var6++) {
            class120 var7 = class222.method1587((byte) -114, arg0);
            if (var7.method438((byte) -71) >= 0) {
                var5++;
            }
            if (var7.method572(126) >= 0) {
                var4++;
            }
            int var8 = var7.field1759.length;
            var3[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var3[var6][var9] = arg0.method792(2);
            }
            this.field5270[var6] = var7;
        }
        this.field5278 = new int[var4];
        int var10 = 0;
        this.field5274 = new int[var5];
        int var11 = 0;
        for (int var12 = 0; var12 < var2; var12++) {
            class120 var13 = this.field5270[var12];
            int var14 = var13.field1759.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field1759[var15] = this.field5270[var3[var12][var15]];
            }
            int var16 = var13.method438((byte) -71);
            int var17 = var13.method572(126);
            if (var16 > 0) {
                this.field5274[var11++] = var16;
            }
            if (var17 > 0) {
                this.field5278[var10++] = var17;
            }
            var3[var12] = null;
        }
        int[][] var18 = (int[][]) null;
        this.field5269 = this.field5270[arg0.method792(2)];
        this.field5275 = this.field5270[arg0.method792(2)];
    }
}
