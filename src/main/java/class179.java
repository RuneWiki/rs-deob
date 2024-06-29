import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class179 extends class165 {

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "[B")
    public byte[] field2969;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2968 = "Loaded interfaces";

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
    public static int field2976 = 0;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "Lak;")
    public static class172 field2970;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "Lgn;")
    public static class77 field2978;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI[B)I", line = 4)
    public static final int method1341(byte arg0, int arg1, byte[] arg2) {
        if (arg0 == -81) {
            field2973++;
            return class24.method136(0, arg2, 128, arg1);
        } else {
            return -90;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIII)V", line = 19)
    public static final void method1342(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2977++;
        int var8 = 0;
        if (arg7 != 4431) {
            return;
        }
        int var9 = 0;
        int var10 = arg1 - arg5;
        int var11 = arg2 - arg5;
        int var12 = arg1;
        int var13 = arg2 * arg2;
        int var14 = var11 * var11;
        int var15 = var10 * var10;
        int var16 = arg1 * arg1;
        int var17 = var16 << 1;
        int var18 = var13 << 1;
        int var19 = var15 << 1;
        int var20 = var14 << 1;
        int var21 = arg1 << 1;
        int var22 = var10 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var16 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var14 + var19;
        int var26 = var13 << 2;
        int var27 = var16 << 2;
        int var28 = var15 - (var22 - 1) * var20;
        int var29 = var14 << 2;
        int var30 = var15 << 2;
        int var31 = (var21 - 3) * var18;
        int var32 = var19 * 3;
        int var33 = var17 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var27;
        int var36 = (arg1 - 1) * var26;
        int var37 = (var10 - 1) * var29;
        int var38 = var30;
        int[] var39 = class281.field4523[arg4];
        class80.method545(arg0, arg7 ^ 0xFFFFEED7, arg3 - var11, -arg2 + arg3, var39);
        class80.method545(arg6, arg7 ^ 0xFFFFEEC4, arg3 + var11, -var11 + arg3, var39);
        class80.method545(arg0, arg7 ^ 0xFFFFEEF8, arg3 + arg2, arg3 - -var11, var39);
        while (var12 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var33;
                    var8++;
                    var33 += var27;
                    var24 += var35;
                    var35 += var27;
                }
            }
            if (var24 < 0) {
                var23 += var33;
                var33 += var27;
                var8++;
                var24 += var35;
                var35 += var27;
            }
            var24 += -var31;
            boolean var40 = var12 <= var10;
            var31 -= var26;
            var12--;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var9++;
                        var28 += var38;
                        var38 += var30;
                        var25 += var32;
                        var32 += var30;
                    }
                }
                if (var28 < 0) {
                    var28 += var38;
                    var25 += var32;
                    var9++;
                    var32 += var30;
                    var38 += var30;
                }
                var25 += -var37;
                var28 += -var34;
                var34 -= var29;
                var37 -= var29;
            }
            int var41 = arg4 + var12;
            var23 += -var36;
            var36 -= var26;
            int var42 = arg3 - var8;
            int var43 = arg3 + var8;
            int var44 = arg4 - var12;
            if (var40) {
                int var45 = arg3 - var9;
                int var46 = arg3 + var9;
                class80.method545(arg0, arg7 ^ 0xFFFFEE9B, var45, var42, class281.field4523[var44]);
                class80.method545(arg6, arg7 - 4558, var46, var45, class281.field4523[var44]);
                class80.method545(arg0, arg7 - 4523, var43, var46, class281.field4523[var44]);
                class80.method545(arg0, -105, var45, var42, class281.field4523[var41]);
                class80.method545(arg6, -119, var46, var45, class281.field4523[var41]);
                class80.method545(arg0, -99, var43, var46, class281.field4523[var41]);
            } else {
                class80.method545(arg0, arg7 ^ 0xFFFFEE85, var43, var42, class281.field4523[var44]);
                class80.method545(arg0, -50, var43, var42, class281.field4523[var41]);
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V", line = 188)
    public static final void method1343(int arg0, int arg1, int arg2) {
        if (arg2 != -3) {
            field2968 = (String) null;
        }
        field2975++;
        if (arg0 == 8) {
            arg0 = 4;
        }
        if (arg0 == 4 && !class245.field3872) {
            arg0 = 2;
            arg1 = 2;
        }
        if (class260.field4151 != arg0) {
            if (class219.field3542) {
                return;
            }
            if (class260.field4151 != 0) {
                class174.field2890[class260.field4151].method71();
            }
            if (arg0 != 0) {
                class40 var3 = class174.field2890[arg0];
                var3.method69();
                var3.method72(arg1);
            }
            class260.field4151 = arg0;
            class45.field626 = arg1;
        } else if (arg0 != 0 && class45.field626 != arg1) {
            class174.field2890[arg0].method72(arg1);
            class45.field626 = arg1;
        }
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(B)V", line = 243)
    public static final void method1344(byte arg0) {
        field2971++;
        class21.field301.method702((byte) 124);
        if (arg0 != -40) {
            method1342(115, 89, -49, 27, -58, 112, -72, 12);
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(III)V", line = 257)
    public static final void method1345(int arg0, int arg1, int arg2) {
        class97.field1386 = (float) arg1;
        field2974++;
        if (~class31.field423 == arg0) {
            class186.field3076 = arg2;
            class74.field1036 = arg1;
        }
        class330.field5090 = (float) arg2;
        class151.method1099(255);
        class33.field444 = true;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "([B)V", line = 273)
    public class179(byte[] arg0) {
        this.field2969 = arg0;
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)V", line = 284)
    public static void method1346(int arg0) {
        field2970 = null;
        if (arg0 != -1905858078) {
            method1342(-81, 53, 59, -40, -103, -27, -32, 97);
        }
        field2968 = null;
        field2978 = null;
    }
}
