import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class375 extends class417 {

    @OriginalMember(owner = "client!du", name = "q", descriptor = "I")
    private int field5180 = -1;

    @OriginalMember(owner = "client!du", name = "p", descriptor = "B")
    private byte field5179;

    @OriginalMember(owner = "client!du", name = "m", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!du", name = "n", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!du", name = "o", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!du", name = "s", descriptor = "I")
    private int field5182;

    @OriginalMember(owner = "client!du", name = "u", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!du", name = "v", descriptor = "I")
    public static int field5185;

    @OriginalMember(owner = "client!du", name = "t", descriptor = "Lgj;")
    public static class660 field5183;

    @OriginalMember(owner = "client!du", name = "r", descriptor = "Ljava/lang/String;")
    private String field5181;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Lso;I)V", line = 7)
    public final void method610(class494 arg0, int arg1) {
        this.field5180 = arg0.method2998(true);
        if (arg1 >= -121) {
            this.field5180 = -109;
        }
        field5185++;
        this.field5179 = arg0.method2943((byte) 16);
        this.field5182 = arg0.method2998(true);
        arg0.method3005(-119);
        this.field5181 = arg0.method2996(120);
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIILmb;IIIIII)Z", line = 24)
    public static final boolean method2324(int arg0, int arg1, int arg2, int arg3, class274 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field5184++;
        int var11 = arg8;
        int var12 = arg1;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg8 - var13;
        class228.field3495[var13][var14] = 99;
        if (arg5 != 1) {
            field5183 = null;
        }
        int var16 = arg1 - var14;
        class673.field9380[var13][var14] = 0;
        byte var17 = 0;
        class753.field10404[var17] = arg8;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class511.field7231[var10001] = arg1;
        int[][] var19 = arg4.field3974;
        while (var26 != var18) {
            var11 = class753.field10404[var18];
            var12 = class511.field7231[var18];
            var18 = var18 + 1 & 0xFFF;
            int var20 = var11 - var15;
            int var21 = var12 - var16;
            int var22 = var11 - arg4.field3968;
            int var23 = var12 - arg4.field3978;
            if (arg9 == -4) {
                if (arg3 == var11 && arg0 == var12) {
                    class506.field7193 = var12;
                    class666.field9268 = var11;
                    return true;
                }
            } else if (arg9 == -3) {
                if (class12.method133(var11, (byte) 64, 2, arg0, var12, 2, arg3, arg2, arg6)) {
                    class666.field9268 = var11;
                    class506.field7193 = var12;
                    return true;
                }
            } else if (arg9 == -2) {
                if (arg4.method1779(var12, 2, arg6, arg3, arg10, var11, arg0, arg2, 2, (byte) -108)) {
                    class666.field9268 = var11;
                    class506.field7193 = var12;
                    return true;
                }
            } else if (arg9 == -1) {
                if (arg4.method1771(arg0, arg6, 2, arg2, var11, (byte) 100, var12, arg3, arg10)) {
                    class666.field9268 = var11;
                    class506.field7193 = var12;
                    return true;
                }
            } else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
                if (arg4.method1769(2, var12, arg0, 29514, var11, arg7, arg3, arg9)) {
                    class506.field7193 = var12;
                    class666.field9268 = var11;
                    return true;
                }
            } else if (arg4.method1776((byte) 45, 2, arg0, arg9, var12, var11, arg3, arg7)) {
                class666.field9268 = var11;
                class506.field7193 = var12;
                return true;
            }
            int var25 = class673.field9380[var20][var21] + 1;
            if (var20 > 0 && class228.field3495[var20 - 1][var21] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class753.field10404[var26] = var11 - 1;
                class511.field7231[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class228.field3495[var20 - 1][var21] = 2;
                class673.field9380[var20 - 1][var21] = var25;
            }
            if (var20 < 126 && class228.field3495[var20 + 1][var21] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class753.field10404[var26] = var11 + 1;
                class511.field7231[var26] = var12;
                class228.field3495[var20 + 1][var21] = 8;
                var26 = var26 + 1 & 0xFFF;
                class673.field9380[var20 + 1][var21] = var25;
            }
            if (var21 > 0 && class228.field3495[var20][var21 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class753.field10404[var26] = var11;
                class511.field7231[var26] = var12 - 1;
                class228.field3495[var20][var21 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class673.field9380[var20][var21 - 1] = var25;
            }
            if (var21 < 126 && class228.field3495[var20][var21 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class753.field10404[var26] = var11;
                class511.field7231[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class228.field3495[var20][var21 + 1] = 4;
                class673.field9380[var20][var21 + 1] = var25;
            }
            if (var20 > 0 && var21 > 0 && class228.field3495[var20 - 1][var21 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class753.field10404[var26] = var11 - 1;
                class511.field7231[var26] = var12 - 1;
                class228.field3495[var20 - 1][var21 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class673.field9380[var20 - 1][var21 - 1] = var25;
            }
            if (var20 < 126 && var21 > 0 && class228.field3495[var20 + 1][var21 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class753.field10404[var26] = var11 + 1;
                class511.field7231[var26] = var12 - 1;
                class228.field3495[var20 + 1][var21 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class673.field9380[var20 + 1][var21 - 1] = var25;
            }
            if (var20 > 0 && var21 < 126 && class228.field3495[var20 - 1][var21 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class753.field10404[var26] = var11 - 1;
                class511.field7231[var26] = var12 + 1;
                class228.field3495[var20 - 1][var21 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class673.field9380[var20 - 1][var21 + 1] = var25;
            }
            if (var20 < 126 && var21 < 126 && class228.field3495[var20 + 1][var21 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class753.field10404[var26] = var11 + 1;
                class511.field7231[var26] = var12 + 1;
                class228.field3495[var20 + 1][var21 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class673.field9380[var20 + 1][var21 + 1] = var25;
            }
        }
        class506.field7193 = var12;
        class666.field9268 = var11;
        return false;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(ILjava/lang/String;CLjava/lang/String;)Ljava/lang/String;", line = 378)
    public static final String method2325(int arg0, String arg1, char arg2, String arg3) {
        field5178++;
        int var4 = arg1.length();
        int var5 = arg3.length();
        int var6 = var4;
        int var7 = arg0 + var5;
        if (var7 != 0) {
            int var8 = 0;
            while (true) {
                var8 = arg1.indexOf(arg2, var8);
                if (var8 < 0) {
                    break;
                }
                var6 += var7;
                var8++;
            }
        }
        StringBuffer var9 = new StringBuffer(var6);
        int var10 = 0;
        while (true) {
            int var11 = arg1.indexOf(arg2, var10);
            if (var11 < 0) {
                var9.append(arg1.substring(var10));
                return var9.toString();
            }
            var9.append(arg1.substring(var10, var11));
            var10 = var11 + 1;
            var9.append(arg3);
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V", line = 428)
    public static void method2326(int arg0) {
        if (arg0 != 1) {
            field5176 = -123;
        }
        field5183 = null;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Lhs;Z)V", line = 445)
    public final void method611(class344 arg0, boolean arg1) {
        field5177++;
        class310 var3 = arg0.field4799[this.field5180];
        var3.field4424 = this.field5182;
        if (!arg1) {
            method2324(-54, 9, 25, 92, null, 49, -3, 99, -31, 16, 92);
        }
        var3.field4427 = this.field5179;
        var3.field4428 = this.field5181;
    }
}
