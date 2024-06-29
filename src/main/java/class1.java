import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class1 extends class222 {

    @OriginalMember(owner = "client!dc", name = "bb", descriptor = "I")
    private int field6 = 1;

    @OriginalMember(owner = "client!dc", name = "eb", descriptor = "I")
    private int field9 = 1;

    @OriginalMember(owner = "client!dc", name = "W", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!dc", name = "fb", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!dc", name = "gb", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!dc", name = "hb", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!dc", name = "ib", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!dc", name = "jb", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!dc", name = "X", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!dc", name = "cb", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!dc", name = "db", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!dc", name = "Y", descriptor = "Lkb;")
    public static class247 field3;

    @OriginalMember(owner = "client!dc", name = "Z", descriptor = "Ltg;")
    public static class75 field4;

    @OriginalMember(owner = "client!dc", name = "ab", descriptor = "[[B")
    public static byte[][] field5;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILq;)V")
    public static final void method1(int arg0, class148 arg1) {
        ++field7;
        if (arg0 != 0) {
            field5 = null;
        }
        int var2 = arg1.field2691;
        if (var2 == 324) {
            if (class118.field2120 == -1) {
                class115.field2048 = arg1.field2723;
                class118.field2120 = arg1.field2636;
            }
            if (class104.field1850.field1531) {
                arg1.field2636 = class118.field2120;
            } else {
                arg1.field2636 = class115.field2048;
            }
        } else if (~var2 == -326) {
            if (~class118.field2120 == 0) {
                class115.field2048 = arg1.field2723;
                class118.field2120 = arg1.field2636;
            }
            if (!class104.field1850.field1531) {
                arg1.field2636 = class118.field2120;
            } else {
                arg1.field2636 = class115.field2048;
            }
        } else if (~var2 == -328) {
            arg1.field2608 = 150;
            arg1.field2631 = (int) (256.0D * Math.sin((double) class236.field4071 / 40.0D)) & 2047;
            arg1.field2661 = -1;
            arg1.field2724 = 5;
        } else if (var2 == 328) {
            if (class163.field2943.field3323 == null) {
                arg1.field2661 = 0;
            } else {
                arg1.field2608 = 150;
                arg1.field2631 = 2047 & (int) (Math.sin((double) class236.field4071 / 40.0D) * 256.0D);
                arg1.field2724 = 5;
                arg1.field2661 = ((int) class163.field2943.field3323.method727((byte) 36) << 11) + 2047;
                arg1.field2633 = class163.field2943.field4518;
                arg1.field2629 = class163.field2943.field4479;
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
    public class1() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "(I)V")
    public static void method2(int arg0) {
        field4 = null;
        if (arg0 == 256) {
            field3 = null;
            field5 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Llj;ZI)V")
    public final void method3(class216 arg0, boolean arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field3842 = ~arg0.method1446(5350) == -2;
                }
            } else {
                this.field9 = arg0.method1446(5350);
            }
        } else {
            this.field6 = arg0.method1446(5350);
        }
        if (arg1) {
            field3 = null;
        }
        ++field8;
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(II)[[I")
    public final int[][] method4(int arg0, int arg1) {
        if (arg1 != 1) {
            return null;
        } else {
            int[][] var3 = super.field3834.method627(arg1 + 4102, arg0);
            ++field1;
            if (super.field3834.field1486) {
                int var4 = this.field6 - -this.field6 + 1;
                int var5 = this.field9 + this.field9 + 1;
                int var6 = 65536 / var4;
                int var7 = 65536 / var5;
                int[][][] var8 = new int[var5][][];
                for (int var9 = -this.field9 + arg0; ~var9 >= ~(this.field9 + arg0); ++var9) {
                    int[][] var19 = this.method1531(class191.field3299 & var9, 0, 120);
                    int[][] var20 = new int[3][class13.field253];
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int[] var24 = var19[0];
                    int[] var25 = var19[2];
                    int[] var26 = var19[1];
                    for (int var27 = -this.field6; ~this.field6 <= ~var27; ++var27) {
                        int var37 = var27 & class162.field2924;
                        var22 += var26[var37];
                        var21 += var25[var37];
                        var23 += var24[var37];
                    }
                    int[] var28 = var20[0];
                    int[] var29 = var20[1];
                    int[] var30 = var20[2];
                    int var31 = 0;
                    while (var31 < class13.field253) {
                        var28[var31] = var6 * var23 >> 16;
                        var29[var31] = var6 * var22 >> 16;
                        var30[var31] = var6 * var21 >> 16;
                        int var32 = -this.field6 + var31 & class162.field2924;
                        int var33 = var22 - var26[var32];
                        ++var31;
                        int var34 = var23 - var24[var32];
                        int var35 = var21 - var25[var32];
                        int var36 = class162.field2924 & this.field6 + var31;
                        var22 = var26[var36] + var33;
                        var21 = var25[var36] + var35;
                        var23 = var24[var36] + var34;
                    }
                    var8[this.field9 + var9 + -arg0] = var20;
                }
                int[] var10 = var3[0];
                int[] var11 = var3[1];
                int[] var12 = var3[2];
                for (int var13 = 0; ~var13 > ~class13.field253; ++var13) {
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = 0; var5 > var17; ++var17) {
                        int[][] var18 = var8[var17];
                        var16 += var18[1][var13];
                        var14 += var18[0][var13];
                        var15 += var18[2][var13];
                    }
                    var10[var13] = var7 * var14 >> 16;
                    var11[var13] = var7 * var16 >> 16;
                    var12[var13] = var7 * var15 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIILq;I)V")
    public static final void method5(int arg0, int arg1, int arg2, class148 arg3, int arg4) {
        if (arg1 != 256) {
            field4 = null;
        }
        if (class124.field2250 >= 3) {
            class128.method955(arg2, arg4, 0, arg3.field2638, arg3.field2713);
        } else {
            ((class247) class53.field854).method1242(arg2, arg4, arg3.field2694, arg3.field2647, class53.field854.field1454 / 2, class53.field854.field1444 / 2, class243.field4219, 256, arg3.field2638, arg3.field2713);
        }
        class69.field1105[arg0] = true;
        ++field2;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILna;IIIBI)Lna;")
    public static final class17 method6(int arg0, class17 arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        ++field12;
        long var7 = (long) arg0;
        class17 var9 = (class17) class211.field3606.method1564(var7, 0);
        if (var9 == null) {
            class240 var10 = class240.method1648(class218.field3757, arg0, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1649(64, 768, -50, -10, -50);
            class211.field3606.method1563(var7, 21771, var9);
        }
        int var11 = arg1.method168();
        int var12 = arg1.method158();
        if (arg5 > -87) {
            field5 = null;
        }
        int var13 = arg1.method159();
        int var14 = arg1.method163();
        class17 var15 = var9.method148(true, true);
        if (arg2 != 0) {
            var15.method152(arg2);
        }
        class58 var16 = (class58) var15;
        if (class70.method480(class265.field4640, (byte) 126, arg4 + var11, arg6 + var13) != arg3 || class70.method480(class265.field4640, (byte) 126, arg4 + var12, arg6 + var14) != arg3) {
            for (int var17 = 0; ~var17 > ~var16.field912; ++var17) {
                var16.field904[var17] += class70.method480(class265.field4640, (byte) 126, var16.field926[var17] + arg4, var16.field901[var17] + arg6) + -arg3;
            }
            var16.field924 = false;
        }
        return var15;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        if (arg0 < 35) {
            field3 = null;
        }
        ++field10;
        int[] var3 = super.field3844.method22(0, arg1);
        if (super.field3844.field61) {
            int var4 = this.field9 + 1 + this.field9;
            int var5 = 65536 / var4;
            int var6 = this.field6 + this.field6 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = arg1 - this.field9; var9 <= this.field9 + arg1; ++var9) {
                int[] var13 = this.method1537((byte) 69, 0, class191.field3299 & var9);
                int[] var14 = new int[class13.field253];
                int var15 = 0;
                for (int var16 = -this.field6; this.field6 >= var16; ++var16) {
                    var15 += var13[var16 & class162.field2924];
                }
                int var17 = 0;
                while (~var17 > ~class13.field253) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[-this.field6 + var17 & class162.field2924];
                    ++var17;
                    var15 = var13[var17 - -this.field6 & class162.field2924] + var18;
                }
                var8[this.field9 + var9 + -arg1] = var14;
            }
            for (int var10 = 0; ~var10 > ~class13.field253; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var12 > ~var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLtg;)V")
    public static final void method8(byte arg0, class75 arg1) {
        if (arg0 <= -125) {
            ++field14;
            class115.field2065 = arg1;
        }
    }
}
