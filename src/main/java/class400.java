import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class400 extends class145 {

    @OriginalMember(owner = "client!fj", name = "H", descriptor = "I")
    private int field5590 = 1;

    @OriginalMember(owner = "client!fj", name = "N", descriptor = "I")
    private int field5595 = 1;

    @OriginalMember(owner = "client!fj", name = "Q", descriptor = "[Z")
    public static boolean[] field5598 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!fj", name = "F", descriptor = "I")
    public static int field5588;

    @OriginalMember(owner = "client!fj", name = "K", descriptor = "I")
    public static int field5592;

    @OriginalMember(owner = "client!fj", name = "L", descriptor = "I")
    public static int field5593;

    @OriginalMember(owner = "client!fj", name = "O", descriptor = "I")
    public static int field5596;

    @OriginalMember(owner = "client!fj", name = "P", descriptor = "I")
    public static int field5597;

    @OriginalMember(owner = "client!fj", name = "R", descriptor = "I")
    public static int field5599;

    @OriginalMember(owner = "client!fj", name = "J", descriptor = "Lrk;")
    public static class427 field5591;

    @OriginalMember(owner = "client!fj", name = "G", descriptor = "[Lkb;")
    public static class80[] field5589;

    @OriginalMember(owner = "client!fj", name = "M", descriptor = "[[Z")
    public static boolean[][] field5594;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(Z)I")
    public static final int method2452(boolean arg0) {
        ++field5592;
        class391 var1 = class249.field3415;
        boolean var2 = false;
        if (~class243.field3355 != -1) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var2 = true;
            var1 = class232.method1548(0, (class112) null, (class304) null, var3, 0, -2099013940);
        }
        long var4 = class108.method902((byte) -93);
        for (int var6 = 0; var6 < 10000; ++var6) {
            var1.method232(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class108.method902((byte) -93) + -var4);
        var1.method2414(0, 0, 100, arg0, 100, -16777216);
        if (var2) {
            var1.method2406(-122);
        }
        return var7;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method4(boolean arg0, int arg1) {
        ++field5597;
        if (!arg0) {
            this.field5590 = 19;
        }
        int[][] var3 = super.field2217.method2549(arg1, 0);
        if (super.field2217.field5771) {
            int var4 = this.field5590 - -this.field5590 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field5595 + 1 + this.field5595;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field5590 + arg1; ~var9 >= ~(this.field5590 + arg1); ++var9) {
                int[][] var19 = this.method1121(var9 & class402.field5610, 0, 2);
                int[][] var20 = new int[3][class156.field2364];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field5595; var27 <= this.field5595; ++var27) {
                    int var37 = var27 & class40.field606;
                    var21 += var24[var37];
                    var22 += var25[var37];
                    var23 += var26[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (var31 < class156.field2364) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = -this.field5595 + var31 & class40.field606;
                    int var33 = var22 - var25[var32];
                    ++var31;
                    int var34 = var23 - var26[var32];
                    int var35 = var21 - var24[var32];
                    int var36 = class40.field606 & this.field5595 + var31;
                    var21 = var24[var36] + var35;
                    var23 = var26[var36] + var34;
                    var22 = var25[var36] + var33;
                }
                var8[var9 - -this.field5590 + -arg1] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; class156.field2364 > var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var17 > ~var4; ++var17) {
                    int[][] var18 = var8[var17];
                    var16 += var18[2][var13];
                    var14 += var18[0][var13];
                    var15 += var18[1][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lug;III[Z)V")
    public static final void method2453(class325 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class91.field1351 != class244.field3367) {
            int var5 = class265.field3566[arg1].method1515(arg2, arg3);
            for (int var6 = 0; var6 <= arg1; ++var6) {
                if (arg4 == null || arg4[var6]) {
                    class411 var7 = class265.field3566[var6];
                    if (var7 != null) {
                        var7.method1516(arg0, arg2, var5 - var7.method1515(arg2, arg3), arg3, 0, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lap;BI)V")
    public final void method2(class289 arg0, byte arg1, int arg2) {
        int var4 = -40 / ((11 - arg1) / 52);
        ++field5599;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field2205 = arg0.method1861((byte) -72) == 1;
                }
            } else {
                this.field5590 = arg0.method1861((byte) -72);
            }
        } else {
            this.field5595 = arg0.method1861((byte) -72);
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(II)V")
    public static final void method2454(int arg0, int arg1) {
        ++field5593;
        if (arg1 <= -16) {
            class410 var2 = class75.field1123;
            synchronized (class75.field1123) {
                class75.field1123.method2534(0, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "(B)V")
    public static void method2455(byte arg0) {
        if (arg0 != 97) {
            field5591 = null;
        }
        field5589 = null;
        field5591 = null;
        field5598 = null;
        field5594 = null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field5588;
        int[] var3 = super.field2218.method1614(122, arg0);
        int var4 = 92 / ((16 - arg1) / 49);
        if (super.field2218.field3396) {
            int var5 = this.field5590 + this.field5590 + 1;
            int var6 = 65536 / var5;
            int var7 = this.field5595 - -1 + this.field5595;
            int var8 = 65536 / var7;
            int[][] var9 = new int[var5][];
            for (int var10 = -this.field5590 + arg0; arg0 - -this.field5590 >= var10; ++var10) {
                int[] var14 = this.method1119(0, 0, class402.field5610 & var10);
                int[] var15 = new int[class156.field2364];
                int var16 = 0;
                for (int var17 = -this.field5595; ~this.field5595 <= ~var17; ++var17) {
                    var16 += var14[var17 & class40.field606];
                }
                int var18 = 0;
                while (~class156.field2364 < ~var18) {
                    var15[var18] = var8 * var16 >> 16;
                    int var19 = var16 - var14[-this.field5595 + var18 & class40.field606];
                    ++var18;
                    var16 = var14[class40.field606 & this.field5595 + var18] + var19;
                }
                var9[-arg0 + this.field5590 + var10] = var15;
            }
            for (int var11 = 0; class156.field2364 > var11; ++var11) {
                int var12 = 0;
                for (int var13 = 0; ~var5 < ~var13; ++var13) {
                    var12 += var9[var13][var11];
                }
                var3[var11] = var6 * var12 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
    public class400() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "(I)V")
    public static final void method2456(int arg0) {
        if (arg0 >= -100) {
            field5589 = null;
        }
        ++field5596;
        if (!class39.field590) {
            class39.field590 = true;
            if (!class100.field1443) {
                class170.field2515 += (24.0F - class170.field2515) / 2.0F;
            } else {
                class313.field4229 = (float) ((int) class313.field4229 + 191 & -128);
            }
            class287.field3847 = true;
        }
    }
}
