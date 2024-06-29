import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class232 extends class134 {

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field3722 = -1;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "[J")
    public static long[] field3725 = new long[100];

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
    public static int field3727 = 0;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public static void method1642(byte arg0) {
        int var1 = -111 % ((10 - arg0) / 60);
        field3725 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public static final String method1643(byte arg0, int arg1) {
        if (arg0 < 88) {
            field3725 = null;
        }
        field3726++;
        return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + ((arg1 & 0xFF9D) >> 8) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ldd;IIIIIIIZ)V")
    public static final void method1644(class135 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class204.field3277;
        int var11;
        int var12 = var11 = (arg7 << 7) - class108.field1566;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class220.field3533[arg1][arg6][arg7] - class244.field3960;
        int var18 = class220.field3533[arg1][arg6 + 1][arg7] - class244.field3960;
        int var19 = class220.field3533[arg1][arg6 + 1][arg7 + 1] - class244.field3960;
        int var20 = class220.field3533[arg1][arg6][arg7 + 1] - class244.field3960;
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
        int var45 = (var21 << 9) / var25 + class47.field691;
        int var46 = (var24 << 9) / var25 + class47.field681;
        int var47 = (var27 << 9) / var31 + class47.field691;
        int var48 = (var30 << 9) / var31 + class47.field681;
        int var49 = (var33 << 9) / var37 + class47.field691;
        int var50 = (var36 << 9) / var37 + class47.field681;
        int var51 = (var39 << 9) / var43 + class47.field691;
        int var52 = (var42 << 9) / var43 + class47.field681;
        class47.field690 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class238.field3806 && class179.method1339(class47.field691 + field3727, class47.field681 + class286.field4550, var50, var52, var48, var49, var51, var47)) {
                class101.field1496 = arg6;
                class286.field4540 = arg7;
            }
            if (!arg8) {
                class47.field692 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class47.field693 || var51 > class47.field693 || var47 > class47.field693) {
                    class47.field692 = true;
                }
                if (arg0.field2216 == -1) {
                    if (arg0.field2214 != 12345678) {
                        class47.method362(var50, var52, var48, var49, var51, var47, arg0.field2214, arg0.field2211, arg0.field2219);
                    }
                } else if (!class42.field595) {
                    int var53 = class47.field689.method237(arg0.field2216, 65535);
                    class47.method362(var50, var52, var48, var49, var51, var47, class102.method773(var53, arg0.field2214), class102.method773(var53, arg0.field2211), class102.method773(var53, arg0.field2219));
                } else if (arg0.field2220) {
                    class47.method366(var50, var52, var48, var49, var51, var47, arg0.field2214, arg0.field2211, arg0.field2219, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field2216);
                } else {
                    class47.method366(var50, var52, var48, var49, var51, var47, arg0.field2214, arg0.field2211, arg0.field2219, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field2216);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class238.field3806 && class179.method1339(class47.field691 + field3727, class47.field681 + class286.field4550, var46, var48, var52, var45, var47, var51)) {
            class101.field1496 = arg6;
            class286.field4540 = arg7;
        }
        if (arg8) {
            return;
        }
        class47.field692 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class47.field693 || var47 > class47.field693 || var51 > class47.field693) {
            class47.field692 = true;
        }
        if (arg0.field2216 != -1) {
            if (class42.field595) {
                class47.method366(var46, var48, var52, var45, var47, var51, arg0.field2208, arg0.field2219, arg0.field2211, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field2216);
                return;
            }
            int var54 = class47.field689.method237(arg0.field2216, 65535);
            class47.method362(var46, var48, var52, var45, var47, var51, class102.method773(var54, arg0.field2208), class102.method773(var54, arg0.field2219), class102.method773(var54, arg0.field2211));
        } else if (arg0.field2208 != 12345678) {
            class47.method362(var46, var48, var52, var45, var47, var51, arg0.field2208, arg0.field2219, arg0.field2211);
            return;
        }
    }
}
