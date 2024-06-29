import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class684 {

    @OriginalMember(owner = "client!si", name = "k", descriptor = "[Ljga;")
    private class143[] field9730;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    private int field9726;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "Z")
    public static boolean field9724 = false;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field9720;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field9722;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field9723;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field9727;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public static int field9728;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public static int field9729;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "I")
    public static int field9731;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "J")
    private long field9721;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "Ljga;")
    private class143 field9725;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILbda;III)Z")
    public static final boolean method3864(int arg0, class197 arg1, int arg2, int arg3, int arg4) {
        field9728++;
        if (!class155.field2557) {
            return false;
        } else if (class495.field7220 < 100) {
            return false;
        } else if (class118.method952(arg4, arg0, true, arg2)) {
            if (arg3 > -42) {
                method3864(-116, null, 59, -41, 43);
            }
            int var5 = arg0 << class49.field637;
            int var6 = arg2 << class49.field637;
            int var7 = class687.field9745[arg4].method3858(arg2, arg0, (byte) 88) - 1;
            int var8 = arg1.method626(-32768) + var7;
            if (arg1.field3077 == 1) {
                if (!class45.method363(var8, 1, var7, var6, var5, class457.field6576 + var6, var6, var5, var8, var5)) {
                    return false;
                } else if (class45.method363(var8, 1, var7, class457.field6576 + var6, var5, class457.field6576 + var6, var6, var5, var7, var5)) {
                    class184.field2918++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg1.field3077 == 2) {
                if (!class45.method363(var8, 1, var7, class457.field6576 + var6, class457.field6576 + var5, class457.field6576 + var6, class457.field6576 + var6, var5, var8, var5)) {
                    return false;
                } else if (class45.method363(var7, 1, var7, class457.field6576 + var6, class457.field6576 + var5, class457.field6576 + var6, class457.field6576 + var6, var5 + class457.field6576, var8, var5)) {
                    class184.field2918++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg1.field3077 == 4) {
                if (!class45.method363(var8, 1, var7, var6, var5 + class457.field6576, class457.field6576 + var6, var6, class457.field6576 + var5, var8, var5 + class457.field6576)) {
                    return false;
                } else if (class45.method363(var8, 1, var7, class457.field6576 + var6, var5 - -class457.field6576, class457.field6576 + var6, var6, class457.field6576 + var5, var7, class457.field6576 + var5)) {
                    class184.field2918++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg1.field3077 == 8) {
                if (!class45.method363(var8, 1, var7, var6, class457.field6576 + var5, var6, var6, var5, var8, var5)) {
                    return false;
                } else if (class45.method363(var7, 1, var7, var6, class457.field6576 + var5, var6, var6, var5 + class457.field6576, var8, var5)) {
                    class184.field2918++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg1.field3077 == 16) {
                if (class623.method3516(var8, 121, class211.field3229, class211.field3229 + var6, var7, class211.field3229, var5)) {
                    class184.field2918++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg1.field3077 == 32) {
                if (class623.method3516(var8, 95, class211.field3229, class211.field3229 + var6, var7, class211.field3229, class211.field3229 + var5)) {
                    class184.field2918++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg1.field3077 == 64) {
                if (class623.method3516(var8, 41, class211.field3229, var6, var7, class211.field3229, var5 + class211.field3229)) {
                    class184.field2918++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg1.field3077 != 128) {
                return true;
            } else if (class623.method3516(var8, 71, class211.field3229, var6, var7, class211.field3229, var5)) {
                class184.field2918++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)Ljga;")
    public final class143 method3865(int arg0) {
        if (arg0 < 29) {
            this.method3867(4L, -87);
        }
        field9727++;
        if (this.field9725 == null) {
            return null;
        }
        class143 var2 = this.field9730[(int) (this.field9721 & (long) (this.field9726 - 1))];
        while (this.field9725 != var2) {
            if (this.field9725.field2469 == this.field9721) {
                class143 var3 = this.field9725;
                this.field9725 = this.field9725.field2473;
                return var3;
            }
            this.field9725 = this.field9725.field2473;
        }
        this.field9725 = null;
        return null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljga;IJ)V")
    public final void method3866(class143 arg0, int arg1, long arg2) {
        field9731++;
        if (arg0.field2471 != null) {
            arg0.method1113(32730);
        }
        class143 var5 = this.field9730[(int) (arg2 & (long) (this.field9726 - 1))];
        arg0.field2471 = var5.field2471;
        arg0.field2473 = var5;
        arg0.field2471.field2473 = arg0;
        arg0.field2473.field2471 = arg0;
        if (arg1 < -15) {
            arg0.field2469 = arg2;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(JI)Ljga;")
    public final class143 method3867(long arg0, int arg1) {
        if (arg1 != 0) {
            this.method3865(23);
        }
        this.field9721 = arg0;
        field9720++;
        class143 var4 = this.field9730[(int) (arg0 & (long) (this.field9726 - 1))];
        for (this.field9725 = var4.field2473; this.field9725 != var4; this.field9725 = this.field9725.field2473) {
            if (this.field9725.field2469 == arg0) {
                class143 var5 = this.field9725;
                this.field9725 = this.field9725.field2473;
                return var5;
            }
        }
        this.field9725 = null;
        return null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3868(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9722++;
        class337.method2006(-21241, arg0);
        int var7 = 0;
        int var8 = arg0 - arg2;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg0;
        int var10 = -arg0;
        int var11 = -85 % (arg5 / 36);
        int var12 = var8;
        int var13 = -var8;
        int var14 = -1;
        int var15 = -1;
        int[] var16 = class657.field9275[arg4];
        int var17 = arg6 - var8;
        int var18 = arg6 + var8;
        class223.method1484(var16, var17, -123, arg3, arg6 - arg0);
        class223.method1484(var16, var18, -79, arg1, var17);
        class223.method1484(var16, arg0 + arg6, -96, arg3, var18);
        while (var7 < var9) {
            var15 += 2;
            var14 += 2;
            var13 += var15;
            var10 += var14;
            if (var13 >= 0 && var12 >= 1) {
                class534.field7850[var12] = var7;
                var12--;
                var13 -= var12 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                if (var8 > var9) {
                    int[] var19 = class657.field9275[arg4 + var9];
                    int[] var20 = class657.field9275[arg4 - var9];
                    int var21 = class534.field7850[var9];
                    int var22 = arg6 + var7;
                    int var23 = arg6 - var7;
                    int var24 = arg6 + var21;
                    int var25 = arg6 - var21;
                    class223.method1484(var19, var25, -109, arg3, var23);
                    class223.method1484(var19, var24, -105, arg1, var25);
                    class223.method1484(var19, var22, -128, arg3, var24);
                    class223.method1484(var20, var25, -110, arg3, var23);
                    class223.method1484(var20, var24, -100, arg1, var25);
                    class223.method1484(var20, var22, -103, arg3, var24);
                } else {
                    int[] var26 = class657.field9275[arg4 + var9];
                    int[] var27 = class657.field9275[arg4 - var9];
                    int var28 = arg6 + var7;
                    int var29 = arg6 - var7;
                    class223.method1484(var26, var28, -98, arg3, var29);
                    class223.method1484(var27, var28, -110, arg3, var29);
                }
                var10 -= var9 << 1;
            }
            int[] var30 = class657.field9275[arg4 + var7];
            int[] var31 = class657.field9275[arg4 - var7];
            int var32 = arg6 + var9;
            int var33 = arg6 - var9;
            if (var7 >= var8) {
                class223.method1484(var30, var32, -110, arg3, var33);
                class223.method1484(var31, var32, -119, arg3, var33);
            } else {
                int var34 = var7 > var12 ? class534.field7850[var7] : var12;
                int var35 = arg6 + var34;
                int var36 = arg6 - var34;
                class223.method1484(var30, var36, -108, arg3, var33);
                class223.method1484(var30, var35, -128, arg1, var36);
                class223.method1484(var30, var32, -92, arg3, var35);
                class223.method1484(var31, var36, -125, arg3, var33);
                class223.method1484(var31, var35, -85, arg1, var36);
                class223.method1484(var31, var32, -124, arg3, var35);
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(I)V")
    public class684(int arg0) {
        this.field9730 = new class143[arg0];
        this.field9726 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class143 var3 = this.field9730[var2] = new class143();
            var3.field2473 = var3;
            var3.field2471 = var3;
        }
    }
}
