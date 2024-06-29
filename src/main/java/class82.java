import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class82 extends class80 {

    @OriginalMember(owner = "client!md", name = "p", descriptor = "[B")
    public byte[] field1588;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "Lr;")
    private static class66 field1593 = class93.method641(43, "wishes to trade with you)3");

    @OriginalMember(owner = "client!md", name = "v", descriptor = "Lr;")
    public static class66 field1594 = field1593;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "Lsd;")
    public static class246 field1591 = class153.method1042(3253);

    @OriginalMember(owner = "client!md", name = "q", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!md", name = "z", descriptor = "Llb;")
    public static class228 field1598;

    @OriginalMember(owner = "client!md", name = "w", descriptor = "Lsb;")
    public static class89 field1595;

    @OriginalMember(owner = "client!md", name = "x", descriptor = "[I")
    public static int[] field1596;

    @OriginalMember(owner = "client!md", name = "y", descriptor = "[Ljb;")
    public static class256[] field1597;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Laj;IIIIIIIZ)V")
    public static final void method563(class162 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class171.field3036;
        int var11;
        int var12 = var11 = (arg7 << 7) - class30.field455;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class30.field453[arg1][arg6][arg7] - class142.field2603;
        int var18 = class30.field453[arg1][arg6 + 1][arg7] - class142.field2603;
        int var19 = class30.field453[arg1][arg6 + 1][arg7 + 1] - class142.field2603;
        int var20 = class30.field453[arg1][arg6][arg7 + 1] - class142.field2603;
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
        int var45 = (var21 << 9) / var25 + class123.field2323;
        int var46 = (var24 << 9) / var25 + class123.field2319;
        int var47 = (var27 << 9) / var31 + class123.field2323;
        int var48 = (var30 << 9) / var31 + class123.field2319;
        int var49 = (var33 << 9) / var37 + class123.field2323;
        int var50 = (var36 << 9) / var37 + class123.field2319;
        int var51 = (var39 << 9) / var43 + class123.field2323;
        int var52 = (var42 << 9) / var43 + class123.field2319;
        class123.field2312 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class249.field4374 && class154.method1052(class131.field2434 + class123.field2323, class184.field3220 + class123.field2319, var50, var52, var48, var49, var51, var47)) {
                class54.field945 = arg6;
                class64.field1267 = arg7;
            }
            if (!arg8) {
                class123.field2316 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class123.field2327 || var51 > class123.field2327 || var47 > class123.field2327) {
                    class123.field2316 = true;
                }
                if (arg0.field2902 == -1) {
                    if (arg0.field2906 != 12345678) {
                        class123.method850(var50, var52, var48, var49, var51, var47, arg0.field2906, arg0.field2894, arg0.field2898);
                    }
                } else if (!class15.field200) {
                    int var53 = class123.field2318.method411(arg0.field2902, -23);
                    class123.method850(var50, var52, var48, var49, var51, var47, class163.method1098(var53, arg0.field2906), class163.method1098(var53, arg0.field2894), class163.method1098(var53, arg0.field2898));
                } else if (arg0.field2903) {
                    class123.method833(var50, var52, var48, var49, var51, var47, arg0.field2906, arg0.field2894, arg0.field2898, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field2902);
                } else {
                    class123.method833(var50, var52, var48, var49, var51, var47, arg0.field2906, arg0.field2894, arg0.field2898, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field2902);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class249.field4374 && class154.method1052(class131.field2434 + class123.field2323, class184.field3220 + class123.field2319, var46, var48, var52, var45, var47, var51)) {
            class54.field945 = arg6;
            class64.field1267 = arg7;
        }
        if (arg8) {
            return;
        }
        class123.field2316 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class123.field2327 || var47 > class123.field2327 || var51 > class123.field2327) {
            class123.field2316 = true;
        }
        if (arg0.field2902 != -1) {
            if (class15.field200) {
                class123.method833(var46, var48, var52, var45, var47, var51, arg0.field2908, arg0.field2898, arg0.field2894, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field2902);
                return;
            }
            int var54 = class123.field2318.method411(arg0.field2902, 117);
            class123.method850(var46, var48, var52, var45, var47, var51, class163.method1098(var54, arg0.field2908), class163.method1098(var54, arg0.field2898), class163.method1098(var54, arg0.field2894));
        } else if (arg0.field2908 != 12345678) {
            class123.method850(var46, var48, var52, var45, var47, var51, arg0.field2908, arg0.field2898, arg0.field2894);
            return;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BLlh;)Ll;")
    public static final class19 method564(byte arg0, class249 arg1) {
        field1592++;
        if (arg0 < 70) {
            field1598 = null;
        }
        return new class19(arg1.method1684(-22489), arg1.method1684(-22489), arg1.method1684(-22489), arg1.method1684(-22489), arg1.method1648((byte) -97), arg1.method1648((byte) 91), arg1.method1677(-6677));
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
    public static final void method565(byte arg0) {
        field1590++;
        class83.field1607.method1614(-123);
        if (arg0 != -79) {
            field1598 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V")
    public static void method566(boolean arg0) {
        field1595 = null;
        field1596 = null;
        field1594 = null;
        if (arg0) {
            method564((byte) -8, (class249) null);
        }
        field1597 = null;
        field1593 = null;
        field1591 = null;
        field1598 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lcj;I)V")
    public static final void method567(class28 arg0, int arg1) {
        if (arg1 != -7486) {
            field1597 = null;
        }
        class109.field2117 = arg0;
        field1589++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(III)Lkk;")
    public static final class47 method568(int arg0, int arg1, int arg2) {
        class16 var3 = class110.field2124[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class47 var4 = var3.field205;
            var3.field205 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "([B)V")
    public class82(byte[] arg0) {
        this.field1588 = arg0;
    }
}
