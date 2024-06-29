import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class171 extends class175 {

    @OriginalMember(owner = "client!bg", name = "Z", descriptor = "I")
    private int field3002 = 1;

    @OriginalMember(owner = "client!bg", name = "Y", descriptor = "I")
    private int field3001 = 1;

    @OriginalMember(owner = "client!bg", name = "R", descriptor = "Z")
    public static boolean field2994 = false;

    @OriginalMember(owner = "client!bg", name = "S", descriptor = "Lmb;")
    public static class96 field2995 = class243.method1708("Weiter", (byte) 106);

    @OriginalMember(owner = "client!bg", name = "cb", descriptor = "[I")
    public static int[] field3005 = new int[5];

    @OriginalMember(owner = "client!bg", name = "bb", descriptor = "Lmb;")
    private static class96 field3004 = class243.method1708("cyan:", (byte) 103);

    @OriginalMember(owner = "client!bg", name = "db", descriptor = "Lmb;")
    public static class96 field3006 = field3004;

    @OriginalMember(owner = "client!bg", name = "U", descriptor = "Lmb;")
    public static class96 field2997 = field3004;

    @OriginalMember(owner = "client!bg", name = "P", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!bg", name = "Q", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!bg", name = "T", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!bg", name = "V", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!bg", name = "W", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!bg", name = "X", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!bg", name = "ab", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!bg", name = "eb", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "(B)Lrg;")
    public static final class239 method1220(byte arg0) {
        ++field3000;
        class239 var1 = new class239(30);
        var1.method1652(7, (byte) 41);
        var1.method1652(class269.field4682, (byte) 41);
        var1.method1652(!class130.field2353 ? 0 : 1, (byte) 41);
        var1.method1652(class248.field4292 ? 1 : 0, (byte) 41);
        var1.method1652(!class89.field1478 ? 0 : 1, (byte) 41);
        var1.method1652(class237.field4073 ? 1 : 0, (byte) 41);
        var1.method1652(!class82.field1392 ? 0 : 1, (byte) 41);
        var1.method1652(class128.field2334 ? 1 : 0, (byte) 41);
        var1.method1652(!class94.field1550 ? 0 : 1, (byte) 41);
        var1.method1652(!class219.field3743 ? 0 : 1, (byte) 41);
        var1.method1652(class148.field2620, (byte) 41);
        var1.method1652(class143.field2541 ? 1 : 0, (byte) 41);
        var1.method1652(!class161.field2860 ? 0 : 1, (byte) 41);
        var1.method1652(!class109.field2014 ? 0 : 1, (byte) 41);
        var1.method1652(class22.field376, (byte) 41);
        var1.method1652(!class22.field386 ? 0 : 1, (byte) 41);
        var1.method1652(class233.field3999, (byte) 41);
        var1.method1652(class92.field1525, (byte) 41);
        var1.method1652(class5.field100, (byte) 41);
        var1.method1632(true, class206.field3535);
        var1.method1632(true, class144.field2546);
        if (arg0 != 30) {
            field2994 = true;
        }
        var1.method1652(2, (byte) 41);
        var1.method1625((byte) -111, class234.field4018);
        var1.method1652(class256.field4461, (byte) 41);
        var1.method1652(!class176.field3061 ? 0 : 1, (byte) 41);
        return var1;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)[[I")
    public final int[][] method77(int arg0, int arg1) {
        ++field2999;
        int[][] var3 = super.field3035.method637(arg0, false);
        if (super.field3035.field1493) {
            int var4 = this.field3002 + this.field3002 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field3001 + this.field3001 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field3002 + arg0; ~var9 >= ~(this.field3002 + arg0); ++var9) {
                int var19 = 0;
                int var20 = 0;
                int[][] var21 = this.method1253(class92.field1520 & var9, -2880, 0);
                int[][] var22 = new int[3][class1.field11];
                int[] var23 = var21[1];
                int[] var24 = var21[0];
                int var25 = 0;
                int[] var26 = var21[2];
                for (int var27 = -this.field3001; var27 <= this.field3001; ++var27) {
                    int var37 = class194.field3343 & var27;
                    var19 += var24[var37];
                    var20 += var23[var37];
                    var25 += var26[var37];
                }
                int[] var28 = var22[0];
                int[] var29 = var22[2];
                int[] var30 = var22[1];
                int var31 = 0;
                while (class1.field11 > var31) {
                    var28[var31] = var7 * var19 >> 16;
                    var30[var31] = var7 * var20 >> 16;
                    var29[var31] = var7 * var25 >> 16;
                    int var32 = -this.field3001 + var31 & class194.field3343;
                    ++var31;
                    int var33 = var20 - var23[var32];
                    int var34 = var25 - var26[var32];
                    int var35 = var19 - var24[var32];
                    int var36 = class194.field3343 & var31 - -this.field3001;
                    var20 = var23[var36] + var33;
                    var25 = var26[var36] + var34;
                    var19 = var24[var36] + var35;
                }
                var8[-arg0 + var9 + this.field3002] = var22;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; var13 < class1.field11; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var4 < ~var17; ++var17) {
                    int[][] var18 = var8[var17];
                    var15 += var18[1][var13];
                    var14 += var18[0][var13];
                    var16 += var18[2][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return arg1 != 64 ? null : var3;
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V")
    public class171() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "(I)V")
    public static void method1221(int arg0) {
        field2997 = null;
        field2995 = null;
        field3005 = null;
        if (arg0 != 0) {
            method1223(21, 100);
        }
        field3006 = null;
        field3004 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BI)[I")
    public final int[] method1(byte arg0, int arg1) {
        ++field2998;
        int[] var3 = super.field3044.method904((byte) 97, arg1);
        if (super.field3044.field2150) {
            int var4 = this.field3002 + 1 - -this.field3002;
            int var5 = 65536 / var4;
            int var6 = this.field3001 - -this.field3001 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field3002 + arg1; this.field3002 + arg1 >= var9; ++var9) {
                int[] var13 = this.method1255(0, class92.field1520 & var9, 128);
                int[] var14 = new int[class1.field11];
                int var15 = 0;
                for (int var16 = -this.field3001; ~var16 >= ~this.field3001; ++var16) {
                    var15 += var13[class194.field3343 & var16];
                }
                int var17 = 0;
                while (~class1.field11 < ~var17) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[-this.field3001 + var17 & class194.field3343];
                    ++var17;
                    var15 = var13[var17 - -this.field3001 & class194.field3343] + var18;
                }
                var8[this.field3002 + var9 - arg1] = var14;
            }
            for (int var10 = 0; class1.field11 > var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var4 > var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        int var19 = -55 % ((arg0 - 62) / 54);
        return var3;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BILrg;)V")
    public final void method115(byte arg0, int arg1, class239 arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field3034 = ~arg2.method1651(4139) == -2;
                }
            } else {
                this.field3002 = arg2.method1651(4139);
            }
        } else {
            this.field3001 = arg2.method1651(4139);
        }
        ++field2992;
        int var5 = -88 / ((-22 - arg0) / 58);
    }

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "(I)V")
    public static final void method1222(int arg0) {
        ++field3003;
        if (!class233.field3990[96]) {
            if (!class233.field3990[97]) {
                class121.field2236 /= 2;
            } else {
                class121.field2236 += (-class121.field2236 + 24) / 2;
            }
        } else {
            class121.field2236 += (-class121.field2236 + -24) / 2;
        }
        int var1 = class14.field218 + class236.field4047.field4533;
        class235.field4033 += class121.field2236 / 2;
        int var2 = class52.field920 + class236.field4047.field4511;
        if (-var2 + class44.field752 < -500 || class44.field752 - var2 > 500 || ~(-var1 + class3.field69) > 499 || ~(-var1 + class3.field69) < -501) {
            class44.field752 = var2;
            class3.field69 = var1;
        }
        if (arg0 == 17687) {
            if (~class44.field752 != ~var2) {
                class44.field752 += (-class44.field752 + var2) / 16;
            }
            if (class233.field3990[98]) {
                class117.field2171 += (-class117.field2171 + 12) / 2;
            } else if (class233.field3990[99]) {
                class117.field2171 += (-class117.field2171 + -12) / 2;
            } else {
                class117.field2171 /= 2;
            }
            class117.field2170 += class117.field2171 / 2;
            if (~class3.field69 != ~var1) {
                class3.field69 += (-class3.field69 + var1) / 16;
            }
            class54.method407(118);
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(II)Lwe;")
    public static final class150 method1223(int arg0, int arg1) {
        ++field3007;
        class150 var2 = (class150) class269.field4691.method84(32, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class192.field3317.method23(arg0, 103, 3);
            class150 var4 = new class150();
            if (var3 != null) {
                var4.method1102(0, new class239(var3));
            }
            class269.field4691.method88(var4, 16518, (long) arg0);
            int var5 = 114 / ((-19 - arg1) / 63);
            return var4;
        }
    }
}
