import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hja")
public class class615 {

    @OriginalMember(owner = "client!hja", name = "b", descriptor = "Ljn;")
    public static class134 field8637 = new class134(128, 1);

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "F")
    public static float field8636;

    @OriginalMember(owner = "client!hja", name = "c", descriptor = "I")
    public static int field8638;

    @OriginalMember(owner = "client!hja", name = "d", descriptor = "I")
    public static int field8639;

    @OriginalMember(owner = "client!hja", name = "e", descriptor = "I")
    public static int field8640;

    @OriginalMember(owner = "client!hja", name = "f", descriptor = "I")
    public static int field8641;

    @OriginalMember(owner = "client!hja", name = "g", descriptor = "I")
    public static int field8642;

    @OriginalMember(owner = "client!hja", name = "h", descriptor = "I")
    public static int field8643;

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 4)
    public static final String method3548(byte arg0, String arg1, String arg2, String arg3) {
        field8641++;
        for (int var4 = arg1.indexOf(arg2); var4 != -1; var4 = arg1.indexOf(arg2, var4 + arg3.length())) {
            arg1 = arg1.substring(0, var4) + arg3 + arg1.substring(arg2.length() + var4);
        }
        if (arg0 != 22) {
            method3552(-64, -7, 8, 82, true, 122, 123, -100);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "(B)V", line = 23)
    public static void method3549(byte arg0) {
        int var1 = 94 % ((arg0 + 26) / 63);
        field8637 = null;
    }

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "(IIIIIIIII)Z", line = 32)
    public static final boolean method3550(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field8640++;
        if (arg6 + arg7 > arg8 && (arg8 + arg0) > arg6) {
            if (arg3 <= 13) {
                field8636 = 0.61184144F;
            }
            return arg1 < arg2 + arg4 && (arg1 + arg5) > arg2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "(I)Z", line = 51)
    public static final boolean method3551(int arg0) {
        if (arg0 != 1) {
            return false;
        }
        field8642++;
        if (class359.field5181) {
            try {
                class552.method3253(class511.field7007, arg0 ^ 0xFFFFFFCF, "showVideoAd");
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "(IIIIZIII)V", line = 74)
    public static final void method3552(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field8639++;
        int var8 = 0;
        int var9 = arg3;
        int var10 = 0;
        int var11 = arg1 - arg7;
        int var12 = arg3 - arg7;
        int var13 = arg1 * arg1;
        int var14 = arg3 * arg3;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg3 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - (var22 - 1) * var20;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        if (!arg4) {
            return;
        }
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg3 - 1) * var27;
        int var37 = var30;
        if (class727.field10060 <= arg2 && class474.field6576 >= arg2) {
            int[] var38 = class705.field9804[arg2];
            int var39 = class436.method2621(arg6 - arg1, class627.field8783, class177.field2236, 512);
            int var40 = class436.method2621(arg1 + arg6, class627.field8783, class177.field2236, 512);
            int var41 = class436.method2621(arg6 - var11, class627.field8783, class177.field2236, 512);
            int var42 = class436.method2621(arg6 + var11, class627.field8783, class177.field2236, 512);
            class128.method883(arg0, var39, var41, var38, 7);
            class128.method883(arg5, var41, var42, var38, 7);
            class128.method883(arg0, var42, var40, var38, 7);
        }
        int var43 = (var12 - 1) * var29;
        while (var9 > 0) {
            boolean var44 = var12 >= var9;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var37 += var30;
                        var33 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var37 += var30;
                    var10++;
                    var33 += var30;
                }
                var25 += -var43;
                var26 += -var34;
                var43 -= var29;
                var34 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var8++;
                    var35 += var28;
                    var31 += var28;
                }
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var35 += var28;
                var8++;
                var31 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var32 -= var27;
            var36 -= var27;
            var9--;
            int var45 = arg2 - var9;
            int var46 = arg2 + var9;
            if (var46 >= class727.field10060 && class474.field6576 >= var45) {
                int var47 = class436.method2621(arg6 + var8, class627.field8783, class177.field2236, 512);
                int var48 = class436.method2621(arg6 - var8, class627.field8783, class177.field2236, 512);
                if (var44) {
                    int var49 = class436.method2621(arg6 + var10, class627.field8783, class177.field2236, 512);
                    int var50 = class436.method2621(arg6 - var10, class627.field8783, class177.field2236, 512);
                    if (class727.field10060 <= var45) {
                        int[] var51 = class705.field9804[var45];
                        class128.method883(arg0, var48, var50, var51, 7);
                        class128.method883(arg5, var50, var49, var51, 7);
                        class128.method883(arg0, var49, var47, var51, 7);
                    }
                    if (var46 <= class474.field6576) {
                        int[] var52 = class705.field9804[var46];
                        class128.method883(arg0, var48, var50, var52, 7);
                        class128.method883(arg5, var50, var49, var52, 7);
                        class128.method883(arg0, var49, var47, var52, 7);
                    }
                } else {
                    if (var45 >= class727.field10060) {
                        class128.method883(arg0, var48, var47, class705.field9804[var45], 7);
                    }
                    if (class474.field6576 >= var46) {
                        class128.method883(arg0, var48, var47, class705.field9804[var46], 7);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "(III)Z", line = 292)
    public static final boolean method3553(int arg0, int arg1, int arg2) {
        if (arg1 != 458752) {
            method3552(-52, -70, -8, -124, true, -102, 97, -46);
        }
        field8638++;
        return class390.method2415(arg0, -1, arg2) | (arg0 & 0x70000) != 0 || class255.method1704(-112, arg2, arg0);
    }
}
