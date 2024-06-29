import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class226 extends class60 {

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
    private int field3189;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
    private int field3192;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
    private int field3200;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    private int field3191;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "I")
    private int field3198;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    private int field3188;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    private int field3190;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
    private int field3193;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "Z")
    public static boolean field3195 = false;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "Ldp;")
    public static class347 field3196 = new class347(" more options", " weitere Optionen", " autres options", " mais opções");

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "Luv;")
    public static class2 field3199 = new class2(69, 4);

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)V")
    public final void method429(int arg0, int arg1, int arg2) {
        if (arg0 == -201) {
            ++field3186;
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
    public static void method1416(int arg0) {
        if (arg0 != -19651) {
            field3199 = null;
        }
        field3199 = null;
        field3196 = null;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class226(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field3189 = arg6;
        this.field3192 = arg3;
        this.field3200 = arg2;
        this.field3191 = arg4;
        this.field3198 = arg1;
        this.field3188 = arg5;
        this.field3190 = arg7;
        this.field3193 = arg0;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IILep;IIBIIIII)Z")
    public static final boolean method1417(int arg0, int arg1, class311 arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field3185;
        int var11 = arg9;
        int var12 = arg4;
        byte var13 = 64;
        byte var14 = 64;
        if (arg5 <= 115) {
            return false;
        } else {
            int var15 = -var13 + arg9;
            class143.field2158[var13][var14] = 99;
            int var16 = -var14 + arg4;
            class239.field3353[var13][var14] = 0;
            byte var17 = 0;
            int var18 = 0;
            class491.field7326[var17] = arg9;
            byte var10001 = var17;
            int var26 = var17 + 1;
            class110.field1659[var10001] = arg4;
            int[][] var19 = arg2.field4819;
            while (var26 != var18) {
                var11 = class491.field7326[var18];
                var12 = class110.field1659[var18];
                var18 = 4095 & var18 + 1;
                int var20 = var11 - var15;
                int var21 = -var16 + var12;
                int var22 = -arg2.field4813 + var11;
                int var23 = -arg2.field4820 + var12;
                if (arg6 != -4) {
                    if (~arg6 != 2) {
                        if (arg6 != -2) {
                            if (~arg6 != 0) {
                                if (arg6 != 0 && arg6 != 1 && arg6 != 2 && ~arg6 != -4 && ~arg6 != -10) {
                                    if (arg2.method1952(arg10, arg0, arg1, (byte) 96, var11, var12, 2, arg6)) {
                                        class227.field3203 = var11;
                                        class425.field6332 = var12;
                                        return true;
                                    }
                                } else if (arg2.method1955(var12, arg6, arg10, 2, -3, arg0, var11, arg1)) {
                                    class425.field6332 = var12;
                                    class227.field3203 = var11;
                                    return true;
                                }
                            } else if (arg2.method1951(var12, true, var11, 2, arg8, arg7, arg3, arg1, arg10)) {
                                class425.field6332 = var12;
                                class227.field3203 = var11;
                                return true;
                            }
                        } else if (arg2.method1954(2, arg8, (byte) -36, var12, arg7, arg10, 2, arg3, arg1, var11)) {
                            class425.field6332 = var12;
                            class227.field3203 = var11;
                            return true;
                        }
                    } else if (class482.method2882(var11, arg10, 2, var12, arg7, -122, arg1, 2, arg8)) {
                        class425.field6332 = var12;
                        class227.field3203 = var11;
                        return true;
                    }
                } else if (~arg10 == ~var11 && ~arg1 == ~var12) {
                    class425.field6332 = var12;
                    class227.field3203 = var11;
                    return true;
                }
                int var25 = class239.field3353[var20][var21] + 1;
                if (~var20 < -1 && ~class143.field2158[var20 - 1][var21] == -1 && ~(1134821376 & var19[var22 + -1][var23]) == -1 && ~(var19[var22 + -1][var23 + 1] & 1310982144) == -1) {
                    class491.field7326[var26] = var11 + -1;
                    class110.field1659[var26] = var12;
                    class143.field2158[var20 + -1][var21] = 2;
                    var26 = var26 + 1 & 4095;
                    class239.field3353[var20 - 1][var21] = var25;
                }
                if (~var20 > -127 && class143.field2158[var20 + 1][var21] == 0 && ~(1625554944 & var19[var22 + 2][var23]) == -1 && (2015625216 & var19[var22 - -2][var23 + 1]) == 0) {
                    class491.field7326[var26] = var11 + 1;
                    class110.field1659[var26] = var12;
                    class143.field2158[var20 + 1][var21] = 8;
                    var26 = var26 + 1 & 4095;
                    class239.field3353[var20 + 1][var21] = var25;
                }
                if (var21 > 0 && ~class143.field2158[var20][var21 + -1] == -1 && (1134821376 & var19[var22][var23 + -1]) == 0 && (1625554944 & var19[var22 - -1][var23 + -1]) == 0) {
                    class491.field7326[var26] = var11;
                    class110.field1659[var26] = var12 + -1;
                    class143.field2158[var20][var21 + -1] = 1;
                    var26 = var26 - -1 & 4095;
                    class239.field3353[var20][var21 + -1] = var25;
                }
                if (var21 < 126 && ~class143.field2158[var20][var21 + 1] == -1 && ~(var19[var22][var23 + 2] & 1310982144) == -1 && (var19[var22 + 1][var23 - -2] & 2015625216) == 0) {
                    class491.field7326[var26] = var11;
                    class110.field1659[var26] = var12 - -1;
                    class143.field2158[var20][var21 + 1] = 4;
                    var26 = 4095 & var26 - -1;
                    class239.field3353[var20][var21 + 1] = var25;
                }
                if (var20 > 0 && ~var21 < -1 && class143.field2158[var20 + -1][var21 + -1] == 0 && ~(var19[var22 + -1][var23] & 1336147968) == -1 && (1134821376 & var19[var22 + -1][var23 + -1]) == 0 && (var19[var22][var23 - 1] & 1675886592) == 0) {
                    class491.field7326[var26] = var11 + -1;
                    class110.field1659[var26] = var12 + -1;
                    var26 = var26 + 1 & 4095;
                    class143.field2158[var20 - 1][var21 + -1] = 3;
                    class239.field3353[var20 + -1][var21 + -1] = var25;
                }
                if (~var20 > -127 && var21 > 0 && ~class143.field2158[var20 + 1][var21 + -1] == -1 && (var19[var22 + 1][var23 + -1] & 1675886592) == 0 && ~(var19[var22 - -2][var23 + -1] & 1625554944) == -1 && ~(2028208128 & var19[var22 + 2][var23]) == -1) {
                    class491.field7326[var26] = var11 + 1;
                    class110.field1659[var26] = var12 - 1;
                    class143.field2158[var20 + 1][var21 + -1] = 9;
                    var26 = 4095 & var26 + 1;
                    class239.field3353[var20 + 1][var21 + -1] = var25;
                }
                if (~var20 < -1 && ~var21 > -127 && class143.field2158[var20 - 1][var21 + 1] == 0 && (var19[var22 + -1][var23 - -1] & 1336147968) == 0 && (var19[var22 + -1][var23 + 2] & 1310982144) == 0 && ~(2116288512 & var19[var22][var23 + 2]) == -1) {
                    class491.field7326[var26] = var11 + -1;
                    class110.field1659[var26] = var12 - -1;
                    class143.field2158[var20 + -1][var21 + 1] = 6;
                    var26 = 4095 & var26 + 1;
                    class239.field3353[var20 + -1][var21 + 1] = var25;
                }
                if (~var20 > -127 && ~var21 > -127 && class143.field2158[var20 + 1][var21 + 1] == 0 && (var19[var22 - -1][var23 + 2] & 2116288512) == 0 && (2015625216 & var19[var22 + 2][var23 + 2]) == 0 && (var19[var22 + 2][var23 + 1] & 2028208128) == 0) {
                    class491.field7326[var26] = var11 + 1;
                    class110.field1659[var26] = var12 - -1;
                    var26 = 4095 & var26 + 1;
                    class143.field2158[var20 - -1][var21 + 1] = 12;
                    class239.field3353[var20 + 1][var21 - -1] = var25;
                }
            }
            class227.field3203 = var11;
            class425.field6332 = var12;
            return false;
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(III)V")
    public final void method431(int arg0, int arg1, int arg2) {
        ++field3187;
        if (arg1 != -76) {
            this.field3200 = 18;
        }
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(III)V")
    public final void method432(int arg0, int arg1, int arg2) {
        ++field3197;
        int var4 = this.field3193 * arg1 >> 12;
        int var5 = this.field3198 * arg2 >> 12;
        int var6 = this.field3200 * arg1 >> 12;
        int var7 = this.field3192 * arg2 >> 12;
        if (arg0 != 25878) {
            this.method432(53, -50, 89);
        }
        int var8 = this.field3191 * arg1 >> 12;
        int var9 = this.field3188 * arg2 >> 12;
        int var10 = this.field3189 * arg1 >> 12;
        int var11 = this.field3190 * arg2 >> 12;
        class59.method421(var7, var10, var6, var5, var8, var11, var4, -1, super.field820, var9);
    }
}
