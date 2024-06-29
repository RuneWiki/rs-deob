import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class24 extends class87 {

    @OriginalMember(owner = "client!mk", name = "L", descriptor = "I")
    private int field261 = 1;

    @OriginalMember(owner = "client!mk", name = "R", descriptor = "I")
    private int field267 = 1;

    @OriginalMember(owner = "client!mk", name = "S", descriptor = "[[S")
    public static short[][] field268 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!mk", name = "H", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!mk", name = "I", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!mk", name = "J", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!mk", name = "K", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!mk", name = "M", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!mk", name = "N", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!mk", name = "Q", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!mk", name = "G", descriptor = "Llc;")
    public static class270 field256;

    @OriginalMember(owner = "client!mk", name = "O", descriptor = "Ljava/lang/String;")
    public static String field264;

    @OriginalMember(owner = "client!mk", name = "P", descriptor = "[I")
    public static int[] field265;

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V")
    public class24() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lhc;II)V")
    public final void method40(class53 arg0, int arg1, int arg2) {
        if (arg2 != 25645) {
            method163(false, (class270) null);
        }
        ++field259;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    super.field1381 = arg0.method366(-16505) == 1;
                }
            } else {
                this.field267 = arg0.method366(-16505);
            }
        } else {
            this.field261 = arg0.method366(arg2 ^ -9302);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZ)[I")
    public final int[] method37(int arg0, boolean arg1) {
        ++field260;
        int[] var3 = super.field1378.method319(arg0, arg1);
        if (arg1) {
            return null;
        } else {
            if (super.field1378.field733) {
                int var4 = this.field267 + this.field267 + 1;
                int var5 = 65536 / var4;
                int var6 = this.field261 + 1 - -this.field261;
                int var7 = 65536 / var6;
                int[][] var8 = new int[var4][];
                for (int var9 = -this.field267 + arg0; var9 <= this.field267 + arg0; ++var9) {
                    int[] var13 = this.method642(0, class32.field406 & var9, !arg1);
                    int var14 = 0;
                    int[] var15 = new int[class206.field3032];
                    for (int var16 = -this.field261; this.field261 >= var16; ++var16) {
                        var14 += var13[class181.field2722 & var16];
                    }
                    int var17 = 0;
                    while (~var17 > ~class206.field3032) {
                        var15[var17] = var7 * var14 >> 16;
                        int var18 = var14 - var13[var17 - this.field261 & class181.field2722];
                        ++var17;
                        var14 = var13[this.field261 + var17 & class181.field2722] + var18;
                    }
                    var8[this.field267 + var9 + -arg0] = var15;
                }
                for (int var10 = 0; var10 < class206.field3032; ++var10) {
                    int var11 = 0;
                    for (int var12 = 0; var4 > var12; ++var12) {
                        var11 += var8[var12][var10];
                    }
                    var3[var10] = var5 * var11 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "(I)V")
    public static void method161(int arg0) {
        if (arg0 != -1304731184) {
            method165(103);
        }
        field265 = null;
        field256 = null;
        field268 = null;
        field264 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)[[I")
    public final int[][] method143(int arg0, int arg1) {
        ++field266;
        if (arg1 != 6) {
            this.field267 = -14;
        }
        int[][] var3 = super.field1390.method1902(-101, arg0);
        if (super.field1390.field4428) {
            int var4 = this.field267 - -this.field267 + 1;
            int var5 = this.field261 - (-this.field261 + -1);
            int var6 = 65536 / var4;
            int var7 = 65536 / var5;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field267 + arg0; var9 <= arg0 - -this.field267; ++var9) {
                int[][] var19 = this.method648(class32.field406 & var9, arg1 ^ -128, 0);
                int[][] var20 = new int[3][class206.field3032];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field261; var27 <= this.field261; ++var27) {
                    int var37 = class181.field2722 & var27;
                    var21 += var24[var37];
                    var22 += var25[var37];
                    var23 += var26[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (class206.field3032 > var31) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = class181.field2722 & -this.field261 + var31;
                    int var33 = var23 - var26[var32];
                    int var34 = var21 - var24[var32];
                    ++var31;
                    int var35 = var22 - var25[var32];
                    int var36 = class181.field2722 & this.field261 + var31;
                    var23 = var26[var36] + var33;
                    var21 = var24[var36] + var34;
                    var22 = var25[var36] + var35;
                }
                var8[-arg0 + this.field267 + var9] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; class206.field3032 > var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var17 < var4; ++var17) {
                    int[][] var18 = var8[var17];
                    var15 += var18[1][var13];
                    var16 += var18[2][var13];
                    var14 += var18[0][var13];
                }
                var10[var13] = var6 * var14 >> 16;
                var11[var13] = var6 * var15 >> 16;
                var12[var13] = var6 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIILmh;)V")
    public static final void method162(int arg0, int arg1, int arg2, class263 arg3) {
        ++field257;
        if (arg1 == -13627) {
            if (arg3.field4193 != 0) {
                if (~arg3.field4193 != -2) {
                    if (~arg3.field4193 == -3) {
                        arg3.field4206 = -arg3.field4215 + -arg3.field4101 + arg2;
                    } else if (~arg3.field4193 == -4) {
                        arg3.field4206 = arg3.field4101 * arg2 >> 14;
                    } else if (~arg3.field4193 != -5) {
                        arg3.field4206 = -(arg3.field4101 * arg2 >> 14) + -arg3.field4215 + arg2;
                    } else {
                        arg3.field4206 = (arg3.field4101 * arg2 >> 14) + (-arg3.field4215 + arg2) / 2;
                    }
                } else {
                    arg3.field4206 = (-arg3.field4215 + arg2) / 2 - -arg3.field4101;
                }
            } else {
                arg3.field4206 = arg3.field4101;
            }
            if (~arg3.field4149 != -1) {
                if (~arg3.field4149 == -2) {
                    arg3.field4140 = (arg0 - arg3.field4046) / 2 + arg3.field4164;
                } else if (arg3.field4149 != 2) {
                    if (~arg3.field4149 == -4) {
                        arg3.field4140 = arg3.field4164 * arg0 >> 14;
                    } else if (arg3.field4149 != 4) {
                        arg3.field4140 = -arg3.field4046 + arg0 + -(arg3.field4164 * arg0 >> 14);
                    } else {
                        arg3.field4140 = (arg3.field4164 * arg0 >> 14) + (-arg3.field4046 + arg0) / 2;
                    }
                } else {
                    arg3.field4140 = arg0 - arg3.field4164 + -arg3.field4046;
                }
            } else {
                arg3.field4140 = arg3.field4164;
            }
            if (class270.field4368) {
                if (~client.method903(arg3).field3789 == -1 && ~arg3.field4129 != -1) {
                    return;
                }
                if (arg3.field4206 >= 0) {
                    if (~arg2 > ~(arg3.field4215 + arg3.field4206)) {
                        arg3.field4206 = arg2 - arg3.field4215;
                    }
                } else {
                    arg3.field4206 = 0;
                }
                if (arg3.field4140 < 0) {
                    arg3.field4140 = 0;
                    return;
                }
                if (~(arg3.field4140 + arg3.field4046) < ~arg0) {
                    arg3.field4140 = -arg3.field4046 + arg0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZLlc;)V")
    public static final void method163(boolean arg0, class270 arg1) {
        ++field263;
        if (arg0) {
            field256 = null;
        }
        field256 = arg1;
        class51.field701 = field256.method1891(16, -104);
    }

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "(III)I")
    public static final int method164(int arg0, int arg1, int arg2) {
        ++field258;
        class101 var3 = (class101) class142.field2308.method1073(arg2, (long) arg1);
        if (var3 == null) {
            return 0;
        } else {
            return ~arg0 <= -1 && ~var3.field1713.length < ~arg0 ? var3.field1713[arg0] : 0;
        }
    }

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "(I)I")
    public static final int method165(int arg0) {
        if (arg0 >= -82) {
            field265 = null;
        }
        ++field262;
        return class169.field2570.method1419((byte) -26);
    }
}
