import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class48 {

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field784 = 0;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "Lli;")
    public static class185 field783 = class245.method1649(" GMT", -101);

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field788 = 0;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "[I")
    public static int[] field790 = new int[2];

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "Lsd;")
    public static class23 field785;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "Lhi;")
    public static class250 field791;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(JZIIB)Lli;")
    public static final class185 method304(long arg0, boolean arg1, int arg2, int arg3, byte arg4) {
        field787++;
        class185 var6 = class37.method232(0, 0);
        if (arg0 < 0L) {
            arg0 = -arg0;
            var6.method1337(class121.field2194, -27866);
        }
        class185 var7 = class158.field3000;
        class185 var8 = class180.field3312;
        if (arg3 == 1) {
            var7 = class180.field3312;
            var8 = class158.field3000;
        }
        if (arg3 == 2) {
            var7 = class180.field3312;
            var8 = class202.field3702;
        }
        if (arg4 <= 54) {
            return null;
        }
        if (arg3 == 3) {
            var8 = class158.field3000;
            var7 = class180.field3312;
        }
        class185 var9 = class37.method232(0, 0);
        class185 var10 = class37.method232(0, 0);
        for (int var11 = 0; var11 < arg2; var11++) {
            var10.method1337(class90.method591((int) (arg0 % 10L), 0), -27866);
            arg0 /= 10L;
        }
        if (arg0 == 0L) {
            var9 = class72.field1254;
        }
        int var12 = 0;
        while (arg0 > 0L) {
            if (arg1 && var12 != 0 && (var12 % 3) == 0) {
                var9.method1337(var8, -27866);
            }
            var9.method1337(class90.method591((int) (arg0 % 10L), 0), -27866);
            var12++;
            arg0 /= 10L;
        }
        if (var10.method1311((byte) 49) > 0) {
            var10.method1337(var7, -27866);
        }
        return class87.method567(-11039, new class185[] { var6, var9.method1304(true), var10.method1304(true) });
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public static void method305(int arg0) {
        field791 = null;
        if (arg0 == 0) {
            field785 = null;
            field790 = null;
            field783 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
    public static final void method306(byte arg0) {
        class198.field3619.method86(0);
        int var1 = 40 % ((28 - arg0) / 46);
        field789++;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lpi;IIIIIIIZ)V")
    public static final void method307(class267 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class6.field144;
        int var11;
        int var12 = var11 = (arg7 << 7) - class185.field3447;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class201.field3694[arg1][arg6][arg7] - class150.field2847;
        int var18 = class201.field3694[arg1][arg6 + 1][arg7] - class150.field2847;
        int var19 = class201.field3694[arg1][arg6 + 1][arg7 + 1] - class150.field2847;
        int var20 = class201.field3694[arg1][arg6][arg7 + 1] - class150.field2847;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class167.field3106;
        int var46 = (var24 << 9) / var25 + class167.field3111;
        int var47 = (var27 << 9) / var31 + class167.field3106;
        int var48 = (var30 << 9) / var31 + class167.field3111;
        int var49 = (var33 << 9) / var37 + class167.field3106;
        int var50 = (var36 << 9) / var37 + class167.field3111;
        int var51 = (var39 << 9) / var43 + class167.field3106;
        int var52 = (var42 << 9) / var43 + class167.field3111;
        class167.field3107 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class87.field1702 && class63.method425(class47.field782 + class167.field3106, class176.field3220 + class167.field3111, var50, var52, var48, var49, var51, var47)) {
                class93.field1777 = arg6;
                class254.field4506 = arg7;
            }
            if (!arg8) {
                class167.field3123 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class167.field3119 || var51 > class167.field3119 || var47 > class167.field3119) {
                    class167.field3123 = true;
                }
                if (arg0.field4728 == -1) {
                    if (arg0.field4720 != 12345678) {
                        class167.method1191(var50, var52, var48, var49, var51, var47, arg0.field4720, arg0.field4722, arg0.field4724);
                    }
                } else if (!class152.field2884) {
                    int var53 = class167.field3116.method385(1, arg0.field4728);
                    class167.method1191(var50, var52, var48, var49, var51, var47, class235.method1603(var53, arg0.field4720), class235.method1603(var53, arg0.field4722), class235.method1603(var53, arg0.field4724));
                } else if (arg0.field4726) {
                    class167.method1204(var50, var52, var48, var49, var51, var47, arg0.field4720, arg0.field4722, arg0.field4724, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field4728);
                } else {
                    class167.method1204(var50, var52, var48, var49, var51, var47, arg0.field4720, arg0.field4722, arg0.field4724, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field4728);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class87.field1702 && class63.method425(class47.field782 + class167.field3106, class176.field3220 + class167.field3111, var46, var48, var52, var45, var47, var51)) {
            class93.field1777 = arg6;
            class254.field4506 = arg7;
        }
        if (arg8) {
            return;
        }
        class167.field3123 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class167.field3119 || var47 > class167.field3119 || var51 > class167.field3119) {
            class167.field3123 = true;
        }
        if (arg0.field4728 != -1) {
            if (class152.field2884) {
                class167.method1204(var46, var48, var52, var45, var47, var51, arg0.field4727, arg0.field4724, arg0.field4722, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field4728);
                return;
            }
            int var54 = class167.field3116.method385(1, arg0.field4728);
            class167.method1191(var46, var48, var52, var45, var47, var51, class235.method1603(var54, arg0.field4727), class235.method1603(var54, arg0.field4724), class235.method1603(var54, arg0.field4722));
        } else if (arg0.field4727 != 12345678) {
            class167.method1191(var46, var48, var52, var45, var47, var51, arg0.field4727, arg0.field4724, arg0.field4722);
            return;
        }
    }
}
