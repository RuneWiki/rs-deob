import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class158 extends class154 {

    @OriginalMember(owner = "client!lg", name = "Y", descriptor = "I")
    private int field2616 = 4;

    @OriginalMember(owner = "client!lg", name = "fb", descriptor = "[B")
    private byte[] field2623 = new byte[512];

    @OriginalMember(owner = "client!lg", name = "eb", descriptor = "I")
    private int field2622 = 4;

    @OriginalMember(owner = "client!lg", name = "mb", descriptor = "I")
    private int field2630 = 0;

    @OriginalMember(owner = "client!lg", name = "rb", descriptor = "I")
    private int field2635 = 4;

    @OriginalMember(owner = "client!lg", name = "gb", descriptor = "Z")
    private boolean field2624 = true;

    @OriginalMember(owner = "client!lg", name = "nb", descriptor = "I")
    private int field2631 = 1638;

    @OriginalMember(owner = "client!lg", name = "Z", descriptor = "[S")
    public static short[] field2617 = new short[] { 21, 28, 16, 29, 8, 24, 2, 44 };

    @OriginalMember(owner = "client!lg", name = "hb", descriptor = "[Z")
    public static boolean[] field2625 = new boolean[112];

    @OriginalMember(owner = "client!lg", name = "kb", descriptor = "[I")
    public static int[] field2628 = new int[25];

    @OriginalMember(owner = "client!lg", name = "lb", descriptor = "Leg;")
    public static class37 field2629 = class174.method1167("hint_headicons", -81);

    @OriginalMember(owner = "client!lg", name = "X", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!lg", name = "ab", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!lg", name = "bb", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!lg", name = "db", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!lg", name = "ib", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!lg", name = "ob", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!lg", name = "pb", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!lg", name = "qb", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!lg", name = "sb", descriptor = "[I")
    public static int[] field2636;

    @OriginalMember(owner = "client!lg", name = "cb", descriptor = "[S")
    private short[] field2620;

    @OriginalMember(owner = "client!lg", name = "jb", descriptor = "[S")
    private short[] field2627;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "(I)V")
    public final void method144(int arg0) {
        this.field2623 = class4.method31((byte) 86, this.field2630);
        this.method1079((byte) -127);
        int var2 = this.field2635 + -1;
        if (arg0 != -9) {
            field2629 = null;
        }
        while (~var2 <= -2) {
            short var3 = this.field2620[var2];
            if (~var3 < -9 || ~var3 > 7) {
                break;
            }
            --this.field2635;
            --var2;
        }
        ++field2621;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)V")
    public static void method1075(boolean arg0) {
        field2625 = null;
        field2629 = null;
        field2636 = null;
        field2628 = null;
        field2617 = null;
        if (arg0) {
            field2636 = null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(II)[I")
    public final int[] method143(int arg0, int arg1) {
        if (arg1 != 1075962732) {
            this.field2635 = 114;
        }
        ++field2634;
        int[] var3 = super.field2574.method206(arg0, 10232);
        if (super.field2574.field536) {
            this.method1077(83, arg0, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIIZ)I")
    private final int method1076(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        ++field2615;
        int var8 = arg5 + -4096;
        int var9 = arg3 >> 12;
        int var10 = var9 - -1;
        if (var10 >= arg2) {
            var10 = 0;
        }
        int var11 = var10 & 255;
        int var12 = arg3 & 4095;
        int var13 = var9 & 255;
        int var14 = var12 + -4096;
        int var15 = this.field2623[arg0 + var13] & 3;
        int var16;
        if (var15 <= 1) {
            var16 = ~var15 == -1 ? arg5 + var12 : -var12 + arg5;
        } else {
            var16 = ~var15 == -3 ? -arg5 + var12 : -arg5 + -var12;
        }
        int var17 = 3 & this.field2623[arg0 + var11];
        int var18 = class218.field3749[var12];
        int var19;
        if (var17 <= 1) {
            var19 = var17 != 0 ? -var14 + arg5 : arg5 + var14;
        } else {
            var19 = var17 == 2 ? -arg5 + var14 : -arg5 + -var14;
        }
        int var20 = ((-var16 + var19) * var18 >> 12) + var16;
        int var21 = 3 & this.field2623[arg1 + var13];
        int var22;
        if (~var21 >= -2) {
            var22 = ~var21 != -1 ? var8 - var12 : var12 - -var8;
        } else {
            var22 = var21 == 2 ? var12 - var8 : -var8 + -var12;
        }
        int var23 = this.field2623[var11 - -arg1] & 3;
        int var24;
        if (var23 > 1) {
            var24 = ~var23 != -3 ? -var14 - var8 : var14 - var8;
        } else {
            var24 = var23 != 0 ? var8 - var14 : var14 - -var8;
        }
        int var25 = ((var24 - var22) * var18 >> 12) + var22;
        return !arg6 ? 66 : ((-var20 + var25) * arg4 >> 12) + var20;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II[I)V")
    private final void method1077(int arg0, int arg1, int[] arg2) {
        ++field2618;
        int var4 = class62.field1029[arg1] * this.field2616;
        int var5 = -127 % ((arg0 - 3) / 52);
        if (this.field2635 != 1) {
            short var6 = this.field2620[0];
            if (var6 > 8 || var6 < -8) {
                int var7 = this.field2627[0] << 12;
                int var8 = var4 * var7 >> 12;
                int var9 = this.field2622 * var7 >> 12;
                int var10 = this.field2616 * var7 >> 12;
                int var11 = var8 >> 12;
                int var12 = var8 & 4095;
                int var13 = var11 + 1;
                int var14 = 255 & this.field2623[255 & var11];
                int var15 = class218.field3749[var12];
                if (var13 >= var10) {
                    var13 = 0;
                }
                int var16 = 255 & this.field2623[var13 & 255];
                for (int var17 = 0; ~var17 > ~class227.field3898; ++var17) {
                    int var37 = class239.field4263[var17] * this.field2622;
                    int var38 = this.method1076(var14, var16, var9, var7 * var37 >> 12, var15, var12, true);
                    arg2[var17] = var6 * var38 >> 12;
                }
            }
            for (int var18 = 1; var18 < this.field2635; ++var18) {
                short var19 = this.field2620[var18];
                if (~var19 < -9 || ~var19 > 7) {
                    int var20 = this.field2627[var18] << 12;
                    int var21 = var4 * var20 >> 12;
                    int var22 = this.field2622 * var20 >> 12;
                    int var23 = this.field2616 * var20 >> 12;
                    int var24 = var21 >> 12;
                    int var25 = 255 & this.field2623[255 & var24];
                    int var26 = var24 + 1;
                    int var27 = var21 & 4095;
                    int var28 = class218.field3749[var27];
                    if (var23 <= var26) {
                        var26 = 0;
                    }
                    int var29 = 255 & this.field2623[255 & var26];
                    if (this.field2624 && this.field2635 + -1 == var18) {
                        for (int var30 = 0; var30 < class227.field3898; ++var30) {
                            int var31 = class239.field4263[var30] * this.field2622;
                            int var32 = this.method1076(var25, var29, var22, var20 * var31 >> 12, var28, var27, true);
                            int var33 = (var19 * var32 >> 12) + arg2[var30];
                            arg2[var30] = 2048 - -(var33 >> 1);
                        }
                    } else {
                        for (int var34 = 0; var34 < class227.field3898; ++var34) {
                            int var35 = class239.field4263[var34] * this.field2622;
                            int var36 = this.method1076(var25, var29, var22, var20 * var35 >> 12, var28, var27, true);
                            arg2[var34] += var19 * var36 >> 12;
                        }
                    }
                }
            }
        } else {
            int var39 = this.field2627[0] << 12;
            int var40 = this.field2622 * var39 >> 12;
            int var41 = this.field2616 * var39 >> 12;
            int var42 = var4 * var39 >> 12;
            short var43 = this.field2620[0];
            int var44 = var42 >> 12;
            int var45 = var42 & 4095;
            int var46 = this.field2623[var44 & 255] & 255;
            int var47 = class218.field3749[var45];
            int var48 = var44 - -1;
            if (var48 >= var41) {
                var48 = 0;
            }
            int var49 = this.field2623[255 & var48] & 255;
            if (this.field2624) {
                for (int var50 = 0; class227.field3898 > var50; ++var50) {
                    int var51 = class239.field4263[var50] * this.field2622;
                    int var52 = this.method1076(var46, var49, var40, var39 * var51 >> 12, var47, var45, true);
                    int var53 = var43 * var52 >> 12;
                    arg2[var50] = 2048 - -(var53 >> 1);
                }
            } else {
                for (int var54 = 0; var54 < class227.field3898; ++var54) {
                    int var55 = class239.field4263[var54] * this.field2622;
                    int var56 = this.method1076(var46, var49, var40, var39 * var55 >> 12, var47, var45, true);
                    arg2[var54] = var43 * var56 >> 12;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lva;II)V")
    public final void method142(class187 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (~arg2 == -7) {
                                    this.field2616 = arg0.method1268(255);
                                }
                            } else {
                                this.field2622 = arg0.method1268(255);
                            }
                        } else {
                            this.field2630 = arg0.method1268(255);
                        }
                    } else {
                        this.field2622 = this.field2616 = arg0.method1268(255);
                    }
                } else {
                    this.field2631 = arg0.method1276((byte) -105);
                    if (~this.field2631 > -1) {
                        this.field2620 = new short[this.field2635];
                        for (int var5 = 0; this.field2635 > var5; ++var5) {
                            this.field2620[var5] = (short) arg0.method1276((byte) -108);
                        }
                    }
                }
            } else {
                this.field2635 = arg0.method1268(arg1 ^ -13890);
            }
        } else {
            this.field2624 = arg0.method1268(255) == 1;
        }
        if (arg1 == -14015) {
            ++field2626;
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V")
    public class158() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIBII)V")
    public static final void method1078(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        int var10 = arg4 + 1;
        class145.method1010(arg5, arg2, -25086, arg0, class210.field3617[arg4]);
        int var9 = arg1 - 1;
        class145.method1010(arg5, arg2, -25086, arg0, class210.field3617[arg1]);
        ++field2619;
        if (arg3 < 32) {
            field2625 = null;
        }
        for (int var6 = var10; ~var9 <= ~var6; ++var6) {
            int[] var7 = class210.field3617[var6];
            var7[arg2] = var7[arg5] = arg0;
        }
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(B)V")
    private final void method1079(byte arg0) {
        int var2 = 116 % ((23 - arg0) / 55);
        ++field2633;
        if (~this.field2631 < -1) {
            this.field2627 = new short[this.field2635];
            this.field2620 = new short[this.field2635];
            for (int var3 = 0; ~this.field2635 < ~var3; ++var3) {
                this.field2620[var3] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field2631 / 4096.0F), (double) var3)));
                this.field2627[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        } else if (this.field2620 != null && ~this.field2620.length == ~this.field2635) {
            this.field2627 = new short[this.field2635];
            for (int var4 = 0; var4 < this.field2635; ++var4) {
                this.field2627[var4] = (short) ((int) Math.pow(2.0D, (double) var4));
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "(I)V")
    public static final void method1080(int arg0) {
        int var1 = 0;
        if (arg0 <= 105) {
            field2628 = null;
        }
        while (~var1 > ~class46.field729) {
            int var2 = class98.field1525[var1];
            class163 var3 = class55.field833[var2];
            if (var3 != null) {
                class214.method1520(var3.field2691.field4839, (byte) -66, var3);
            }
            ++var1;
        }
        ++field2632;
    }
}
