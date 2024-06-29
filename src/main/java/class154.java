import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class154 {

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "Lna;")
    public static class26 field2403 = class69.method505("l", (byte) -125);

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field2402 = 0;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "Lna;")
    public static class26 field2399 = class69.method505(")2", (byte) -122);

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public static int field2401 = -1;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "Lna;")
    private static class26 field2407 = class69.method505("Cancel", (byte) -120);

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "Lna;")
    public static class26 field2406 = field2407;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "Lna;")
    public static class26 field2408 = class69.method505("Memory after cleanup=", (byte) -118);

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "Lwa;")
    public static class82 field2404 = new class82(new byte[5000]);

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "Lna;")
    public static class26 field2411 = null;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "Lfd;")
    public static class242 field2410;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "[I")
    public static int[] field2400;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIIII)V", line = 11)
    public static final void method1045(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2409++;
        int var8 = 0;
        int var9 = arg6;
        int var10 = 0;
        int var11 = arg4 - arg7;
        int var12 = arg4 * arg4;
        int var13 = arg6 - arg7;
        int var14 = arg6 * arg6;
        int var15 = var13 * var13;
        int var16 = var14 << 1;
        int var17 = var12 << 1;
        int var18 = var15 << 1;
        int var19 = var11 * var11;
        int var20 = var19 << 1;
        int var21 = arg6 << 1;
        int var22 = var13 << 1;
        int var23 = var14 - ((var21 - 1) * var17);
        int var24 = (1 - var22) * var19 + var18;
        int var25 = (1 - var21) * var12 + var16;
        int var26 = var12 << 2;
        int var27 = var15 - ((var22 - 1) * var20);
        int var28 = var19 << 2;
        int var29 = var14 << 2;
        int var30 = var15 << 2;
        int var31 = (var21 - 3) * var17;
        int var32 = var16 * 3;
        int var33 = (var22 - 3) * var20;
        int var34 = var18 * 3;
        int var35 = var29;
        int var36 = var30;
        int var37 = (var13 - 1) * var28;
        if (arg5 < 73) {
            method1045(108, -88, 76, -36, -95, -64, -84, 85);
        }
        int var38 = (arg6 - 1) * var26;
        int[] var39 = class45.field710[arg2];
        class76.method543(var39, arg1 - arg4, -87, -var11 + arg1, arg3);
        class76.method543(var39, arg1 - var11, -66, arg1 - -var11, arg0);
        class76.method543(var39, arg1 + var11, -68, arg1 + arg4, arg3);
        while (var9 > 0) {
            if (var25 < 0) {
                while (var25 < 0) {
                    var23 += var35;
                    var25 += var32;
                    var8++;
                    var35 += var29;
                    var32 += var29;
                }
            }
            if (var23 < 0) {
                var25 += var32;
                var8++;
                var32 += var29;
                var23 += var35;
                var35 += var29;
            }
            boolean var40 = var9 <= var13;
            if (var40) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var24 += var34;
                        var34 += var30;
                        var10++;
                        var27 += var36;
                        var36 += var30;
                    }
                }
                if (var27 < 0) {
                    var24 += var34;
                    var10++;
                    var34 += var30;
                    var27 += var36;
                    var36 += var30;
                }
                var27 += -var33;
                var33 -= var28;
                var24 += -var37;
                var37 -= var28;
            }
            var25 += -var38;
            var23 += -var31;
            var31 -= var26;
            var9--;
            int var41 = arg2 - var9;
            int var42 = arg1 + var8;
            var38 -= var26;
            int var43 = arg2 + var9;
            int var44 = arg1 - var8;
            if (var40) {
                int var45 = arg1 + var10;
                int var46 = arg1 - var10;
                class76.method543(class45.field710[var41], var44, -93, var46, arg3);
                class76.method543(class45.field710[var41], var46, 121, var45, arg0);
                class76.method543(class45.field710[var41], var45, -47, var42, arg3);
                class76.method543(class45.field710[var43], var44, 124, var46, arg3);
                class76.method543(class45.field710[var43], var46, -73, var45, arg0);
                class76.method543(class45.field710[var43], var45, 111, var42, arg3);
            } else {
                class76.method543(class45.field710[var41], var44, 96, var42, arg3);
                class76.method543(class45.field710[var43], var44, 124, var42, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lba;IILba;Z)I", line = 235)
    public static final int method1046(class166 arg0, int arg1, int arg2, class166 arg3, boolean arg4) {
        field2405++;
        if (arg1 == 1) {
            int var5 = arg0.field3634;
            int var6 = arg3.field3634;
            if (!arg4) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg1 == 2) {
            return arg0.method1126(102).field4658.method177((byte) -67, arg3.method1126(-119).field4658);
        } else if (arg1 == 3) {
            if (arg0.field2570.method159((byte) -42, class212.field3281)) {
                if (arg3.field2570.method159((byte) -42, class212.field3281)) {
                    return 0;
                } else if (arg4) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg3.field2570.method159((byte) -42, class212.field3281)) {
                return arg4 ? 1 : -1;
            } else {
                return arg0.field2570.method177((byte) -100, arg3.field2570);
            }
        } else if (arg2 <= 67) {
            return 36;
        } else if (arg1 == 4) {
            return arg0.method1547(-114) ? (arg3.method1547(-108) ? 0 : 1) : (arg3.method1547(-123) ? -1 : 0);
        } else if (arg1 == 5) {
            return arg0.method1548(64) ? (arg3.method1548(64) ? 0 : 1) : (arg3.method1548(64) ? -1 : 0);
        } else if (arg1 == 6) {
            return arg0.method1545(false) ? (arg3.method1545(false) ? 0 : 1) : (arg3.method1545(false) ? -1 : 0);
        } else if (arg1 == 7) {
            return arg0.method1543(8) ? (arg3.method1543(8) ? 0 : 1) : (arg3.method1543(8) ? -1 : 0);
        } else {
            return arg0.field2571 - arg3.field2571;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V", line = 302)
    public static void method1047(int arg0) {
        field2406 = null;
        field2399 = null;
        field2408 = null;
        if (arg0 != -196) {
            field2407 = (class26) null;
        }
        field2404 = null;
        field2400 = null;
        field2410 = null;
        field2403 = null;
        field2411 = null;
        field2407 = null;
    }
}
