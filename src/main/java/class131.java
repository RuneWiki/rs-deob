import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class131 extends class40 {

    @OriginalMember(owner = "client!bj", name = "L", descriptor = "S")
    public static short field1908 = 256;

    @OriginalMember(owner = "client!bj", name = "R", descriptor = "I")
    public static int field1914 = 255;

    @OriginalMember(owner = "client!bj", name = "K", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!bj", name = "M", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!bj", name = "N", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!bj", name = "P", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!bj", name = "Q", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!bj", name = "O", descriptor = "[I")
    public static int[] field1911;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "(B)V", line = 10)
    public static void method859(byte arg0) {
        if (arg0 > 65) {
            field1911 = null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V", line = 22)
    public class131() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BIIIILqr;IIIII)Z", line = 27)
    public static final boolean method860(byte arg0, int arg1, int arg2, int arg3, int arg4, class41 arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field1912++;
        int var11 = arg9;
        int var12 = arg1;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg9 - var13;
        class87.field1132[var13][var14] = 99;
        int var16 = arg1 - var14;
        class399.field5612[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class287.field4187[var17] = arg9;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class451.field6468[var10001] = arg1;
        int[][] var19 = arg5.field572;
        if (arg0 < 52) {
            method862((byte) 6, (class130) null);
        }
        while (var26 != var18) {
            var12 = class451.field6468[var18];
            var11 = class287.field4187[var18];
            int var20 = var11 - arg5.field565;
            var18 = var18 + 1 & 0xFFF;
            int var21 = var11 - var15;
            int var22 = var12 - var16;
            int var23 = var12 - arg5.field570;
            if (arg10 == -4) {
                if (arg7 == var11 && arg8 == var12) {
                    class418.field6003 = var12;
                    class88.field1154 = var11;
                    return true;
                }
            } else if (arg10 == -3) {
                if (class253.method1763(arg2, 1, arg7, 1, arg4, arg8, var12, (byte) 123, var11)) {
                    class88.field1154 = var11;
                    class418.field6003 = var12;
                    return true;
                }
            } else if (arg10 == -2) {
                if (arg5.method270(0, arg3, arg4, arg2, 1, arg7, 1, var12, var11, arg8)) {
                    class418.field6003 = var12;
                    class88.field1154 = var11;
                    return true;
                }
            } else if (arg10 == -1) {
                if (arg5.method271(arg3, (byte) 112, var12, arg2, arg8, arg7, var11, 1, arg4)) {
                    class88.field1154 = var11;
                    class418.field6003 = var12;
                    return true;
                }
            } else if (arg10 == 0 || arg10 == 1 || arg10 == 2 || arg10 == 3 || arg10 == 9) {
                if (arg5.method269(arg6, arg8, arg10, -3, var12, arg7, var11, 1)) {
                    class418.field6003 = var12;
                    class88.field1154 = var11;
                    return true;
                }
            } else if (arg5.method283(arg10, false, var12, arg6, arg7, 1, arg8, var11)) {
                class418.field6003 = var12;
                class88.field1154 = var11;
                return true;
            }
            int var25 = class399.field5612[var21][var22] + 1;
            if (var21 > 0 && class87.field1132[var21 - 1][var22] == 0 && (var19[var20 - 1][var23] & 0x42240000) == 0) {
                class287.field4187[var26] = var11 - 1;
                class451.field6468[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class87.field1132[var21 - 1][var22] = 2;
                class399.field5612[var21 - 1][var22] = var25;
            }
            if (var21 < 127 && class87.field1132[var21 + 1][var22] == 0 && (var19[var20 + 1][var23] & 0x60240000) == 0) {
                class287.field4187[var26] = var11 + 1;
                class451.field6468[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class87.field1132[var21 + 1][var22] = 8;
                class399.field5612[var21 + 1][var22] = var25;
            }
            if (var22 > 0 && class87.field1132[var21][var22 - 1] == 0 && (var19[var20][var23 - 1] & 0x40A40000) == 0) {
                class287.field4187[var26] = var11;
                class451.field6468[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class87.field1132[var21][var22 - 1] = 1;
                class399.field5612[var21][var22 - 1] = var25;
            }
            if (var22 < 127 && class87.field1132[var21][var22 + 1] == 0 && (var19[var20][var23 + 1] & 0x48240000) == 0) {
                class287.field4187[var26] = var11;
                class451.field6468[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class87.field1132[var21][var22 + 1] = 4;
                class399.field5612[var21][var22 + 1] = var25;
            }
            if (var21 > 0 && var22 > 0 && class87.field1132[var21 - 1][var22 - 1] == 0 && (var19[var20 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var20 - 1][var23] & 0x42240000) == 0 && (var19[var20][var23 - 1] & 0x40A40000) == 0) {
                class287.field4187[var26] = var11 - 1;
                class451.field6468[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class87.field1132[var21 - 1][var22 - 1] = 3;
                class399.field5612[var21 - 1][var22 - 1] = var25;
            }
            if (var21 < 127 && var22 > 0 && class87.field1132[var21 + 1][var22 - 1] == 0 && (var19[var20 + 1][var23 - 1] & 0x60E40000) == 0 && (var19[var20 + 1][var23] & 0x60240000) == 0 && (var19[var20][var23 - 1] & 0x40A40000) == 0) {
                class287.field4187[var26] = var11 + 1;
                class451.field6468[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class87.field1132[var21 + 1][var22 - 1] = 9;
                class399.field5612[var21 + 1][var22 - 1] = var25;
            }
            if (var21 > 0 && var22 < 127 && class87.field1132[var21 - 1][var22 + 1] == 0 && (var19[var20 - 1][var23 + 1] & 0x4E240000) == 0 && (var19[var20 - 1][var23] & 0x42240000) == 0 && (var19[var20][var23 + 1] & 0x48240000) == 0) {
                class287.field4187[var26] = var11 - 1;
                class451.field6468[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class87.field1132[var21 - 1][var22 + 1] = 6;
                class399.field5612[var21 - 1][var22 + 1] = var25;
            }
            if (var21 < 127 && var22 < 127 && class87.field1132[var21 + 1][var22 + 1] == 0 && (var19[var20 + 1][var23 + 1] & 0x78240000) == 0 && (var19[var20 + 1][var23] & 0x60240000) == 0 && (var19[var20][var23 + 1] & 0x48240000) == 0) {
                class287.field4187[var26] = var11 + 1;
                class451.field6468[var26] = var12 + 1;
                class87.field1132[var21 + 1][var22 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class399.field5612[var21 + 1][var22 + 1] = var25;
            }
        }
        class418.field6003 = var12;
        class88.field1154 = var11;
        return false;
    }

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "(B)V", line = 277)
    public static final void method861(byte arg0) {
        if (arg0 <= 125) {
            field1911 = null;
        }
        field1913++;
        for (class86 var1 = (class86) class319.field4666.method2752(-68); var1 != null; var1 = (class86) class319.field4666.method2754(-1)) {
            class216 var2 = var1.field1118;
            if (class158.field2302 != var2.field4464 || var2.field3104) {
                var1.method2660((byte) 112);
                var2.method1512((byte) 127);
            } else if (var2.field3110 <= class34.field434) {
                var2.method1514(0, class239.field3529);
                if (var2.field3104) {
                    var1.method2660((byte) 121);
                } else {
                    class196.method1395(var2, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BLlf;)Lgp;", line = 315)
    public static final class31 method862(byte arg0, class130 arg1) {
        if (arg0 != 69) {
            field1914 = -31;
        }
        field1910++;
        return new class31(arg1.method844(698527688), arg1.method844(698527688), arg1.method844(698527688), arg1.method844(698527688), arg1.method844(698527688), arg1.method844(arg0 ^ 0x29A2AF8D), arg1.method844(698527688), arg1.method844(698527688), arg1.method839((byte) -92), arg1.method837(true));
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BI)[I", line = 327)
    public final int[] method44(byte arg0, int arg1) {
        field1907++;
        return arg0 > -20 ? null : class9.field124;
    }
}
