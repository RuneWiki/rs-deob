import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class171 extends class90 {

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "Lgq;")
    public class226 field2432;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "Lct;")
    public static class285 field2433 = new class285(13, -1);

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "I")
    public static int field2435 = 20;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method1181(int arg0, byte[] arg1) {
        field2434++;
        int var2 = -12 % ((arg0 - 1) / 61);
        int var3 = arg1.length;
        byte[] var4 = new byte[var3];
        class149.method1007(arg1, 0, var4, 0, var3);
        return var4;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1182(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2436++;
        int var8 = 0;
        int var9 = arg1;
        int var10 = 0;
        int var11 = arg0 - arg7;
        int var12 = arg1 - arg7;
        if (arg3 <= 47) {
            return;
        }
        int var13 = arg0 * arg0;
        int var14 = arg1 * arg1;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg1 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - (var21 - 1) * var18;
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - (var22 - 1) * var20;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg1 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class49.field723[arg5];
        class345.method2125(false, var39, arg2 - arg0, -var11 + arg2, arg4);
        class345.method2125(false, var39, arg2 - var11, arg2 + var11, arg6);
        class345.method2125(false, var39, arg2 + var11, arg0 + arg2, arg4);
        while (var9 > 0) {
            boolean var40 = var9 <= var12;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var33 += var30;
                        var37 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var10++;
                    var33 += var30;
                    var37 += var30;
                }
                var26 += -var34;
                var25 += -var38;
                var34 -= var29;
                var38 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var31 += var28;
                    var35 += var28;
                    var8++;
                }
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var31 += var28;
                var8++;
                var35 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            var32 -= var27;
            var9--;
            var36 -= var27;
            int var41 = arg5 - var9;
            int var42 = arg5 + var9;
            int var43 = arg2 + var8;
            int var44 = arg2 - var8;
            if (var40) {
                int var45 = arg2 + var10;
                int var46 = arg2 - var10;
                class345.method2125(false, class49.field723[var41], var44, var46, arg4);
                class345.method2125(false, class49.field723[var41], var46, var45, arg6);
                class345.method2125(false, class49.field723[var41], var45, var43, arg4);
                class345.method2125(false, class49.field723[var42], var44, var46, arg4);
                class345.method2125(false, class49.field723[var42], var46, var45, arg6);
                class345.method2125(false, class49.field723[var42], var45, var43, arg4);
            } else {
                class345.method2125(false, class49.field723[var41], var44, var43, arg4);
                class345.method2125(false, class49.field723[var42], var44, var43, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1183(int arg0, String arg1) {
        if (arg0 != 0) {
            method1181(80, (byte[]) null);
        }
        field2437++;
        if (!arg1.equals("")) {
            class378.method2320(class473.field6632, (byte) 119);
            class382.field5653++;
            class230.field3390.method2619((byte) 103, class330.method2021((byte) 109, arg1));
            class230.field3390.method2597(arg1, (byte) -83);
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lgq;)V")
    public class171(class226 arg0) {
        this.field2432 = arg0;
    }

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "(I)V")
    public static void method1184(int arg0) {
        if (arg0 != 19086) {
            method1183(-88, (String) null);
        }
        field2433 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILje;)V")
    public static final void method1185(int arg0, class178 arg1) {
        field2431++;
        class178 var2 = class28.method241(-1, arg1);
        if (arg0 > -71) {
            return;
        }
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class233.field3411;
            var4 = class342.field5115;
        } else {
            var3 = var2.field2589;
            var4 = var2.field2595;
        }
        class144.method985(1, false, var3, arg1, var4);
        class4.method30(var3, arg1, var4, (byte) -16);
    }
}
