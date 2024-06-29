import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class531 extends class150 {

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "Lwea;")
    public static class259 field7170 = new class259(3, 2);

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field7172 = new String[200];

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "Lwp;")
    public static class453 field7175 = new class453(108, 17);

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    public static int field7167;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    public static int field7168;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
    public static int field7169;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    public static int field7171;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public static int field7174;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
    public static int field7176;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "Z")
    public static boolean field7173;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "([IB)Ljava/lang/String;")
    public static final String method2880(int[] arg0, byte arg1) {
        field7174++;
        if (arg1 != 126) {
            return null;
        }
        StringBuffer var2 = new StringBuffer();
        int var3 = class305.field3772;
        for (int var4 = 0; var4 < arg0.length; var4++) {
            class500 var5 = class453.field5806.method960((byte) 0, arg0[var4]);
            if (var5.field6579 != -1) {
                class536 var6 = (class536) class662.field9368.method2418((long) var5.field6579, (byte) 100);
                if (var6 == null) {
                    class661 var7 = class661.method3715(class631.field8846, var5.field6579, 0);
                    if (var7 != null) {
                        var6 = class32.field452.method1072(var7, true);
                        class662.field9368.method2409((long) var5.field6579, var6, arg1 - 125);
                    }
                }
                if (var6 != null) {
                    class478.field6077[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BII)I")
    public static final int method2881(byte arg0, int arg1, int arg2) {
        field7171++;
        int var3 = class20.method129(arg2 - 1, arg1 + -1, -11) + class20.method129(arg2 - 1, arg1 + 1, arg0 ^ 0xFFFFFF9C) - (-class20.method129(arg2 - -1, arg1 + -1, -11) - class20.method129(arg2 - -1, arg1 - -1, -11));
        if (arg0 == 105) {
            int var4 = class20.method129(arg2, arg1 - 1, arg0 + -116) - (-class20.method129(arg2, arg1 + 1, -11) + (-class20.method129(arg2 - 1, arg1, -11) - class20.method129(arg2 + 1, arg1, -11)));
            int var5 = class20.method129(arg2, arg1, -11);
            return var4 / 8 + var3 / 16 + var5 / 4;
        } else {
            return 61;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIII)V")
    public static final void method2882(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7167++;
        int var6 = -12 / ((arg2 - 52) / 53);
        if (class159.field2063 < arg3 || class289.field3595 > arg5) {
            return;
        }
        boolean var7;
        if (arg0 < class263.field3294) {
            arg0 = class263.field3294;
            var7 = false;
        } else if (class314.field4052 < arg0) {
            var7 = false;
            arg0 = class314.field4052;
        } else {
            var7 = true;
        }
        boolean var8;
        if (arg4 < class263.field3294) {
            arg4 = class263.field3294;
            var8 = false;
        } else if (class314.field4052 >= arg4) {
            var8 = true;
        } else {
            arg4 = class314.field4052;
            var8 = false;
        }
        if (arg3 >= class289.field3595) {
            class57.method362(arg0, class550.field7650[arg3++], arg1, arg4, 26);
        } else {
            arg3 = class289.field3595;
        }
        if (arg5 <= class159.field2063) {
            class57.method362(arg0, class550.field7650[arg5--], arg1, arg4, 100);
        } else {
            arg5 = class159.field2063;
        }
        if (var7 && var8) {
            for (int var9 = arg3; var9 <= arg5; var9++) {
                int[] var10 = class550.field7650[var9];
                var10[arg0] = var10[arg4] = arg1;
            }
            return;
        }
        if (var7) {
            for (int var11 = arg3; var11 <= arg5; var11++) {
                class550.field7650[var11][arg0] = arg1;
            }
            return;
        }
        if (var8) {
            for (int var12 = arg3; var12 <= arg5; var12++) {
                class550.field7650[var12][arg4] = arg1;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V")
    public static void method2883(int arg0) {
        field7175 = null;
        field7172 = null;
        if (arg0 != 0) {
            field7173 = true;
        }
        field7170 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BLr;I)Lsa;")
    public static final class595 method2884(byte arg0, class566 arg1, int arg2) {
        if (arg0 < 55) {
            return null;
        } else {
            field7176++;
            class462 var3 = class449.method2401((byte) -66, arg2, arg1, true);
            return var3 == null ? null : var3.field5884;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)V")
    public static final void method2885(int arg0, int arg1) {
        if (arg0 < -50) {
            field7169++;
            if (class525.method2860((byte) 123, arg1)) {
                class651.method3655(71, class103.field1390[arg1], -1);
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIILwd;IIIII)Z")
    public static final boolean method2886(int arg0, int arg1, int arg2, int arg3, int arg4, class356 arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field7168++;
        int var11 = arg3;
        int var12 = arg6;
        byte var13 = 64;
        byte var14 = 64;
        if (arg8 != 4095) {
            field7175 = null;
        }
        int var15 = arg3 - var13;
        int var16 = arg6 - var14;
        class517.field7067[var13][var14] = 99;
        class470.field5973[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class19.field291[var17] = arg3;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class534.field7204[var10001] = arg6;
        int[][] var19 = arg5.field4537;
        while (var26 != var18) {
            var11 = class19.field291[var18];
            var12 = class534.field7204[var18];
            int var20 = var12 - var16;
            int var21 = var11 - var15;
            var18 = var18 + 1 & 0xFFF;
            int var22 = var11 - arg5.field4555;
            int var23 = var12 - arg5.field4547;
            if (arg7 == -4) {
                if (arg0 == var11 && arg9 == var12) {
                    class265.field3372 = var12;
                    class190.field2379 = var11;
                    return true;
                }
            } else if (arg7 == -3) {
                if (class43.method259(var11, false, 2, var12, arg4, arg0, arg9, 2, arg2)) {
                    class265.field3372 = var12;
                    class190.field2379 = var11;
                    return true;
                }
            } else if (arg7 == -2) {
                if (arg5.method1962(arg4, 2, (byte) 119, arg9, arg10, arg0, arg2, var12, var11, 2)) {
                    class190.field2379 = var11;
                    class265.field3372 = var12;
                    return true;
                }
            } else if (arg7 == -1) {
                if (arg5.method1952(-1, arg4, arg0, var12, arg9, arg2, var11, arg10, 2)) {
                    class190.field2379 = var11;
                    class265.field3372 = var12;
                    return true;
                }
            } else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
                if (arg5.method1967(var11, var12, 2, 67108864, arg9, arg1, arg7, arg0)) {
                    class190.field2379 = var11;
                    class265.field3372 = var12;
                    return true;
                }
            } else if (arg5.method1956(2, 44, arg7, arg9, arg1, var12, var11, arg0)) {
                class265.field3372 = var12;
                class190.field2379 = var11;
                return true;
            }
            int var25 = class470.field5973[var21][var20] + 1;
            if (var21 > 0 && class517.field7067[var21 - 1][var20] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class19.field291[var26] = var11 - 1;
                class534.field7204[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class517.field7067[var21 - 1][var20] = 2;
                class470.field5973[var21 - 1][var20] = var25;
            }
            if (var21 < 126 && class517.field7067[var21 + 1][var20] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class19.field291[var26] = var11 + 1;
                class534.field7204[var26] = var12;
                class517.field7067[var21 + 1][var20] = 8;
                var26 = var26 + 1 & 0xFFF;
                class470.field5973[var21 + 1][var20] = var25;
            }
            if (var20 > 0 && class517.field7067[var21][var20 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class19.field291[var26] = var11;
                class534.field7204[var26] = var12 - 1;
                class517.field7067[var21][var20 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class470.field5973[var21][var20 - 1] = var25;
            }
            if (var20 < 126 && class517.field7067[var21][var20 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class19.field291[var26] = var11;
                class534.field7204[var26] = var12 + 1;
                class517.field7067[var21][var20 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class470.field5973[var21][var20 + 1] = var25;
            }
            if (var21 > 0 && var20 > 0 && class517.field7067[var21 - 1][var20 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class19.field291[var26] = var11 - 1;
                class534.field7204[var26] = var12 - 1;
                class517.field7067[var21 - 1][var20 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class470.field5973[var21 - 1][var20 - 1] = var25;
            }
            if (var21 < 126 && var20 > 0 && class517.field7067[var21 + 1][var20 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class19.field291[var26] = var11 + 1;
                class534.field7204[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class517.field7067[var21 + 1][var20 - 1] = 9;
                class470.field5973[var21 + 1][var20 - 1] = var25;
            }
            if (var21 > 0 && var20 < 126 && class517.field7067[var21 - 1][var20 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class19.field291[var26] = var11 - 1;
                class534.field7204[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class517.field7067[var21 - 1][var20 + 1] = 6;
                class470.field5973[var21 - 1][var20 + 1] = var25;
            }
            if (var21 < 126 && var20 < 126 && class517.field7067[var21 + 1][var20 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class19.field291[var26] = var11 + 1;
                class534.field7204[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class517.field7067[var21 + 1][var20 + 1] = 12;
                class470.field5973[var21 + 1][var20 + 1] = var25;
            }
        }
        class265.field3372 = var12;
        class190.field2379 = var11;
        return false;
    }
}
