import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jha")
public class class694 {

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "I")
    public int field9567 = -1;

    @OriginalMember(owner = "client!jha", name = "b", descriptor = "I")
    public int field9568 = -1;

    @OriginalMember(owner = "client!jha", name = "h", descriptor = "[B")
    public static byte[] field9574 = new byte[] { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };

    @OriginalMember(owner = "client!jha", name = "c", descriptor = "I")
    public static int field9569;

    @OriginalMember(owner = "client!jha", name = "d", descriptor = "I")
    public static int field9570;

    @OriginalMember(owner = "client!jha", name = "e", descriptor = "I")
    public static int field9571;

    @OriginalMember(owner = "client!jha", name = "f", descriptor = "I")
    public static int field9572;

    @OriginalMember(owner = "client!jha", name = "i", descriptor = "I")
    public static int field9575;

    @OriginalMember(owner = "client!jha", name = "g", descriptor = "[I")
    public int[] field9573;

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(Lee;BI)V")
    private final void method3913(class675 arg0, byte arg1, int arg2) {
        if (arg1 != -25) {
            this.field9573 = null;
        }
        field9575++;
        if (arg2 == 1) {
            this.field9568 = arg0.method3757((byte) -65);
        } else if (arg2 == 2) {
            this.field9573 = new int[arg0.method3750((byte) 35)];
            for (int var4 = 0; var4 < this.field9573.length; var4++) {
                this.field9573[var4] = arg0.method3757((byte) -65);
            }
        } else if (arg2 == 3) {
            this.field9567 = arg0.method3750((byte) 35);
        }
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(BI[BIIII)Z")
    public static final boolean method3914(byte arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6) {
        field9569++;
        int var7 = arg6 % arg5;
        if (arg0 != -53) {
            field9574 = null;
        }
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg5 - var7;
        }
        int var9 = -((arg4 + arg5 - 1) / arg5);
        int var10 = -((arg6 + arg5 - 1) / arg5);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg2[arg3] == 0) {
                    return true;
                }
                arg3 += arg5;
            }
            int var13 = arg3 - var8;
            if (arg2[var13 - 1] == 0) {
                return true;
            }
            arg3 = arg1 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(Lee;B)V")
    public final void method3915(class675 arg0, byte arg1) {
        field9570++;
        if (arg1 != -101) {
            return;
        }
        while (true) {
            int var3 = arg0.method3750((byte) 35);
            if (var3 == 0) {
                return;
            }
            this.method3913(arg0, (byte) -25, var3);
        }
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3916(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field9571++;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 0;
        int var11 = arg7 - arg2;
        int var12 = arg0 - arg2;
        int var13 = arg7 * arg7;
        int var14 = arg0 * arg0;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg0 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
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
        if (arg3 < 47) {
            return;
        }
        int var36 = (arg0 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class445.field6320[arg4];
        class643.method3557(arg5 - arg7, var39, (byte) 91, arg6, arg5 - var11);
        class643.method3557(arg5 - var11, var39, (byte) 116, arg1, arg5 + var11);
        class643.method3557(arg5 + var11, var39, (byte) 105, arg6, arg5 + arg7);
        while (var9 > 0) {
            boolean var40 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var8++;
                    var35 += var28;
                    var31 += var28;
                }
            }
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var10++;
                        var33 += var30;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var37 += var30;
                    var10++;
                    var33 += var30;
                }
                var26 += -var34;
                var25 += -var38;
                var38 -= var29;
                var34 -= var29;
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var31 += var28;
                var35 += var28;
                var8++;
            }
            var24 += -var32;
            var23 += -var36;
            var9--;
            var32 -= var27;
            var36 -= var27;
            int var41 = arg4 - var9;
            int var42 = arg4 + var9;
            int var43 = arg5 + var8;
            int var44 = arg5 - var8;
            if (var40) {
                int var45 = arg5 + var10;
                int var46 = arg5 - var10;
                class643.method3557(var44, class445.field6320[var41], (byte) 53, arg6, var46);
                class643.method3557(var46, class445.field6320[var41], (byte) 125, arg1, var45);
                class643.method3557(var45, class445.field6320[var41], (byte) 75, arg6, var43);
                class643.method3557(var44, class445.field6320[var42], (byte) 117, arg6, var46);
                class643.method3557(var46, class445.field6320[var42], (byte) 99, arg1, var45);
                class643.method3557(var45, class445.field6320[var42], (byte) 78, arg6, var43);
            } else {
                class643.method3557(var44, class445.field6320[var41], (byte) 48, arg6, var43);
                class643.method3557(var44, class445.field6320[var42], (byte) 53, arg6, var43);
            }
        }
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(Z)V")
    public static void method3917(boolean arg0) {
        field9574 = null;
        if (!arg0) {
            method3918(75);
        }
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(I)V")
    public static final void method3918(int arg0) {
        field9572++;
        class467.field6613.method1175((byte) 95);
        class455.field6430.method1175((byte) 122);
        if (arg0 > -32) {
            method3917(true);
        }
    }
}
