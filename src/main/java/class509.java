import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class509 {

    @OriginalMember(owner = "client!li", name = "b", descriptor = "Z")
    public boolean field7306;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field7305;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field7307;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public static int field7309;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "I")
    public static int field7310;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "I")
    public static int field7312;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "Lmda;")
    public class17 field7311;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "Lmda;")
    public class17 field7313;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "Z")
    public boolean field7308;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lua;IILwp;IIILr;I)V", line = 4)
    public static final void method2908(class598 arg0, int arg1, int arg2, class452 arg3, int arg4, int arg5, int arg6, class564 arg7, int arg8) {
        if (arg5 != 4) {
            return;
        }
        field7310++;
        class655 var9 = class247.field3060.method705(arg8, arg5 ^ 0xFFFFFF85);
        if (var9 == null || !var9.field9222 || !var9.method3644(arg5 ^ 0xFFFFCBA3, class628.field8859)) {
            return;
        }
        if (var9.field9217 != null) {
            int[] var10 = new int[var9.field9217.length];
            for (int var11 = 0; var11 < var10.length / 2; var11++) {
                int var13;
                if (class538.field7572 == 4) {
                    var13 = (int) class508.field7300 & 0x3FFF;
                } else {
                    var13 = (int) class508.field7300 + class302.field3748 & 0x3FFF;
                }
                int var14 = class435.field6134[var13];
                int var15 = class435.field6135[var13];
                if (class538.field7572 != 4) {
                    var14 = var14 * 256 / (class373.field5085 + 256);
                    var15 = var15 * 256 / (class373.field5085 + 256);
                }
                var10[var11 * 2] = arg6 - (-(arg3.field6483 / 2) - ((var9.field9217[var11 * 2] * 4 + arg4) * var15 + (var9.field9217[var11 * 2 + 1] * 4 + arg2) * var14 >> 14));
                var10[var11 * 2 + 1] = arg3.field6443 / 2 + arg1 - ((var9.field9217[var11 * 2 + 1] * 4 + arg2) * var15 - ((var9.field9217[var11 * 2] * 4 + arg4) * var14) >> 14);
            }
            class491.method2845(arg7, var10, var9.field9191, arg3.field6448, arg3.field6366);
            for (int var12 = 0; var12 < var10.length / 2 - 1; var12++) {
                arg7.method1023(var10[var12 * 2], var10[var12 * 2 + 1], var10[(var12 + 1) * 2], var10[(var12 + 1) * 2 + 1], var9.field9211, 1, arg0, arg6, arg1);
            }
            arg7.method1023(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field9211, 1, arg0, arg6, arg1);
        }
        class534 var16 = null;
        if (var9.field9206 != -1) {
            var16 = var9.method3646(false, false, arg7);
            if (var16 != null) {
                class517.method2941(arg2, var16, arg0, arg6, arg3, -23, arg4, arg1);
            }
        }
        if (var9.field9214 == null) {
            return;
        }
        int var17 = 0;
        if (var16 != null) {
            var17 = var16.method306();
        }
        class413 var18 = class198.field2349;
        class463 var19 = class104.field1128;
        if (var9.field9230 == 1) {
            var18 = class698.field9799;
            var19 = class436.field6153;
        }
        if (var9.field9230 == 2) {
            var19 = class488.field7097;
            var18 = class282.field3535;
        }
        class499.method2879(-116, var17, var9.field9214, arg2, arg4, var9.field9202, arg1, var19, arg3, var18, arg0, arg6);
        return;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)V", line = 106)
    public final void method2909(boolean arg0) {
        if (this.field7313 != null) {
            this.field7313.method74((byte) 118);
        }
        if (arg0) {
            field7307++;
            this.field7308 = false;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZIII)Z", line = 123)
    public static final boolean method2910(boolean arg0, int arg1, int arg2, int arg3) {
        field7305++;
        class414.field5560.method19(arg1, arg3, arg2, class404.field5403);
        int var4 = class404.field5403[2];
        if (var4 < 50) {
            return false;
        }
        if (arg0) {
            method2910(true, 125, -37, -58);
        }
        class404.field5403[0] = class14.field122 + (class404.field5403[0] * class701.field9830 / var4);
        class404.field5403[2] = var4;
        class404.field5403[1] = class404.field5403[1] * class73.field765 / var4 + class412.field5530;
        return true;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)Z", line = 148)
    public final boolean method2911(int arg0) {
        if (arg0 != 0) {
            method2910(true, -61, -5, -29);
        }
        field7312++;
        return this.field7308 && !this.field7306;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lnp;B)Lji;", line = 159)
    public static final class345 method2912(class115 arg0, byte arg1) {
        field7309++;
        int var2 = -66 / ((66 - arg1) / 55);
        class39 var3 = class499.method2876((byte) 16, arg0);
        int var4 = arg0.method637(255);
        return new class345(var3.field397, var3.field400, var3.field401, var3.field402, var3.field392, var4);
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Z)V", line = 175)
    public class509(boolean arg0) {
        this.field7306 = arg0;
    }
}
