import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class265 extends class615 {

    @OriginalMember(owner = "client!ao", name = "H", descriptor = "I")
    private int field3673 = 4096;

    @OriginalMember(owner = "client!ao", name = "G", descriptor = "I")
    private int field3672 = 8192;

    @OriginalMember(owner = "client!ao", name = "O", descriptor = "I")
    private int field3679 = 2048;

    @OriginalMember(owner = "client!ao", name = "J", descriptor = "I")
    private int field3675 = 2048;

    @OriginalMember(owner = "client!ao", name = "V", descriptor = "I")
    private int field3685 = 0;

    @OriginalMember(owner = "client!ao", name = "S", descriptor = "I")
    private int field3682 = 0;

    @OriginalMember(owner = "client!ao", name = "W", descriptor = "I")
    private int field3686 = 12288;

    @OriginalMember(owner = "client!ao", name = "T", descriptor = "[Ljava/awt/Color;")
    public static Color[] field3683 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!ao", name = "F", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!ao", name = "I", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!ao", name = "L", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!ao", name = "N", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!ao", name = "P", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!ao", name = "Q", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!ao", name = "U", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!ao", name = "Y", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!ao", name = "Z", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!ao", name = "X", descriptor = "Leh;")
    public static class335 field3687;

    @OriginalMember(owner = "client!ao", name = "M", descriptor = "Lxa;")
    public static class468 field3677;

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "()V", line = 174)
    public class265() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(BILeh;)V", line = 15)
    public final void method15(byte arg0, int arg1, class335 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field3672 = arg2.method2001((byte) -83);
                                }
                            } else {
                                this.field3673 = arg2.method2001((byte) -83);
                            }
                        } else {
                            this.field3686 = arg2.method2001((byte) -83);
                        }
                    } else {
                        this.field3679 = arg2.method2001((byte) -83);
                    }
                } else {
                    this.field3685 = arg2.method2001((byte) -83);
                }
            } else {
                this.field3682 = arg2.method2001((byte) -83);
            }
        } else {
            this.field3675 = arg2.method2001((byte) -83);
        }
        if (arg0 >= 44) {
            ++field3684;
        }
    }

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "(I)V", line = 92)
    public static void method1616(int arg0) {
        field3683 = null;
        if (arg0 != -1) {
            method1622(true);
        }
        field3677 = null;
        field3687 = null;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIZIIII)V", line = 113)
    public static final void method1617(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((!arg2 ? class344.field4718.field5450 : class344.field4718.field5429) != 0 && arg1 != 0 && class273.field3798 < 50 && arg0 != -1) {
            class653.field8828[class273.field3798++] = new class70((byte) (!arg2 ? 2 : 3), arg0, arg1, arg4, arg5, arg3);
        }
        ++field3680;
        int var7 = -64 / ((66 - arg6) / 43);
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(III)Z", line = 129)
    private final boolean method1618(int arg0, int arg1, int arg2) {
        ++field3671;
        if (arg2 != -3) {
            return true;
        } else {
            int var4 = (arg0 + arg1) * this.field3686 >> 12;
            int var5 = class166.field2582[var4 * 255 >> 12 & 255];
            int var6 = (var5 << 12) / this.field3686;
            int var7 = (var6 << 12) / this.field3672;
            int var8 = this.field3673 * var7 >> 12;
            return ~var8 < ~(-arg0 + arg1) && -arg0 + arg1 > -var8;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIB)Z", line = 148)
    private final boolean method1619(int arg0, int arg1, byte arg2) {
        ++field3689;
        int var4 = (-arg1 + arg0) * this.field3686 >> 12;
        int var5 = class166.field2582[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field3686;
        if (arg2 != -60) {
            this.field3673 = -35;
        }
        int var7 = (var6 << 12) / this.field3672;
        int var8 = this.field3673 * var7 >> 12;
        return ~var8 < ~(arg0 + arg1) && ~(arg0 + arg1) < ~(-var8);
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(I)V", line = 178)
    public final void method10(int arg0) {
        class201.method1312((byte) 100);
        ++field3674;
        if (arg0 != 12404) {
            this.method10(-29);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IZZ)Lfs;", line = 190)
    public static final class521 method1620(int arg0, boolean arg1, boolean arg2) {
        ++field3676;
        if (arg2) {
            return null;
        } else {
            long var3 = (long) ((arg1 ? Integer.MIN_VALUE : 0) | arg0);
            return (class521) class62.field957.method2918(var3, (byte) -125);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IB)[I", line = 204)
    public final int[] method8(int arg0, byte arg1) {
        if (arg1 != -18) {
            return null;
        } else {
            ++field3681;
            int[] var3 = super.field8125.method298(arg0, -119);
            if (super.field8125.field579) {
                int var4 = class402.field5353[arg0] + -2048;
                for (int var5 = 0; ~class505.field6740 < ~var5; ++var5) {
                    int var6 = class168.field2599[var5] + -2048;
                    int var7 = var6 - -this.field3675;
                    int var8 = ~var7 <= 2047 ? var7 : var7 - -4096;
                    int var9 = var8 > 2048 ? var8 + -4096 : var8;
                    int var10 = var4 - -this.field3682;
                    int var11 = ~var10 <= 2047 ? var10 : var10 + 4096;
                    int var12 = var11 <= 2048 ? var11 : var11 + -4096;
                    int var13 = this.field3685 + var6;
                    int var14 = var13 < -2048 ? var13 + 4096 : var13;
                    int var15 = var14 <= 2048 ? var14 : var14 + -4096;
                    int var16 = this.field3679 + var4;
                    int var17 = var16 >= -2048 ? var16 : var16 + 4096;
                    int var18 = var17 > 2048 ? var17 - 4096 : var17;
                    var3[var5] = !this.method1619(var12, var9, (byte) -60) && !this.method1618(var15, var18, -3) ? 0 : 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IZIIIIII)V", line = 261)
    public static final void method1621(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3678;
        int var8 = 0;
        if (arg1) {
            int var9 = arg7;
            int var10 = 0;
            int var11 = -arg3 + arg6;
            int var12 = -arg3 + arg7;
            int var13 = arg6 * arg6;
            int var14 = arg7 * arg7;
            int var15 = var11 * var11;
            int var16 = var12 * var12;
            int var17 = var14 << 1;
            int var18 = var13 << 1;
            int var19 = var16 << 1;
            int var20 = var15 << 1;
            int var21 = arg7 << 1;
            int var22 = var12 << 1;
            int var23 = (-var21 + 1) * var13 + var17;
            int var24 = -((var21 + -1) * var18) + var14;
            int var25 = (-var22 + 1) * var15 + var19;
            int var26 = var16 - (var22 - 1) * var20;
            int var27 = var13 << 2;
            int var28 = var14 << 2;
            int var29 = var15 << 2;
            int var30 = var16 << 2;
            int var31 = var17 * 3;
            int var32 = (var21 + -3) * var18;
            int var33 = var19 * 3;
            int var34 = (var22 + -3) * var20;
            int var35 = var28;
            int var36 = (arg7 + -1) * var27;
            int var37 = var30;
            int var38 = (var12 + -1) * var29;
            int[] var39 = class236.field3325[arg2];
            class475.method2668(arg5, -var11 + arg4, 7, var39, -arg6 + arg4);
            class475.method2668(arg0, arg4 - -var11, 7, var39, -var11 + arg4);
            class475.method2668(arg5, arg4 + arg6, 7, var39, arg4 + var11);
            while (~var9 < -1) {
                boolean var40 = var9 <= var12;
                if (var40) {
                    if (~var25 > -1) {
                        while (var25 < 0) {
                            var25 += var33;
                            var26 += var37;
                            var37 += var30;
                            var33 += var30;
                            ++var10;
                        }
                    }
                    if (var26 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var33 += var30;
                        ++var10;
                        var37 += var30;
                    }
                    var26 += -var34;
                    var25 += -var38;
                    var38 -= var29;
                    var34 -= var29;
                }
                if (~var23 > -1) {
                    while (~var23 > -1) {
                        var24 += var35;
                        var23 += var31;
                        var31 += var28;
                        var35 += var28;
                        ++var8;
                    }
                }
                if (~var24 > -1) {
                    var23 += var31;
                    var24 += var35;
                    var31 += var28;
                    ++var8;
                    var35 += var28;
                }
                var23 += -var36;
                var24 += -var32;
                var36 -= var27;
                var32 -= var27;
                --var9;
                int var41 = -var9 + arg2;
                int var42 = arg2 + var9;
                int var43 = arg4 - -var8;
                int var44 = arg4 - var8;
                if (!var40) {
                    class475.method2668(arg5, var43, 7, class236.field3325[var41], var44);
                    class475.method2668(arg5, var43, 7, class236.field3325[var42], var44);
                } else {
                    int var45 = arg4 - -var10;
                    int var46 = -var10 + arg4;
                    class475.method2668(arg5, var46, 7, class236.field3325[var41], var44);
                    class475.method2668(arg0, var45, 7, class236.field3325[var41], var46);
                    class475.method2668(arg5, var43, 7, class236.field3325[var41], var45);
                    class475.method2668(arg5, var46, 7, class236.field3325[var42], var44);
                    class475.method2668(arg0, var45, 7, class236.field3325[var42], var46);
                    class475.method2668(arg5, var43, 7, class236.field3325[var42], var45);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Z)V", line = 431)
    public static final void method1622(boolean arg0) {
        if (arg0) {
            class693.field9751.method3748(6);
            ++field3688;
        }
    }
}
