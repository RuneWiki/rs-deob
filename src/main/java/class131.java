import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class131 {

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "Z")
    public static boolean field1788 = false;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "I")
    public static int field1785 = 0;

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "I")
    public static int field1789 = 0;

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!qo", name = "h", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!qo", name = "i", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!qo", name = "j", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "[[[B")
    public static byte[][][] field1790;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)V", line = 10)
    public static final void method878(byte arg0) {
        class125.field1658.method2313(101);
        field1794++;
        class452.field6665.method2313(113);
        class202.field2859.method2313(114);
        class175.field2395.method2313(100);
        class399.field5775.method2313(111);
        if (arg0 > -25) {
            method881(-73);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZII)V", line = 30)
    public static final void method879(boolean arg0, int arg1, int arg2) {
        if (class202.field2852 != arg2) {
            class430.field6250 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class430.field6250[var3] = (var3 << 12) / arg2;
            }
            class4.field66 = arg2 * 32;
            class437.field6373 = arg2 - 1;
            class202.field2852 = arg2;
        }
        field1793++;
        if (class130.field1771 != arg1) {
            if (class202.field2852 == arg1) {
                class331.field4911 = class430.field6250;
            } else {
                class331.field4911 = new int[arg1];
                for (int var4 = 0; var4 < arg1; var4++) {
                    class331.field4911[var4] = (var4 << 12) / arg1;
                }
            }
            class139.field1911 = arg1 - 1;
            class130.field1771 = arg1;
        }
        if (arg0) {
            field1790 = null;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lat;IB)Ljava/lang/String;", line = 77)
    public static final String method880(class256 arg0, int arg1, byte arg2) {
        field1792++;
        if (arg2 >= -58) {
            return null;
        }
        try {
            int var3 = arg0.method1740(128);
            if (arg1 < var3) {
                var3 = arg1;
            }
            byte[] var4 = new byte[var3];
            arg0.field3762 += class36.field518.method2690(var4, (byte) 127, arg0.field3762, var3, 0, arg0.field3764);
            return class169.method1104(var3, var4, 54, 0);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V", line = 109)
    public static void method881(int arg0) {
        if (arg0 == -1) {
            field1790 = null;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IZ)V", line = 127)
    public static final void method882(int arg0, boolean arg1) {
        field1786++;
        byte[][] var2;
        byte var3;
        if (arg1) {
            var3 = 1;
            var2 = class322.field4762;
        } else {
            var2 = class38.field532;
            var3 = 4;
        }
        if (arg0 != 26280) {
            method881(-125);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class60.method457(14597);
            for (int var5 = 0; var5 < (class195.field2745 >> 3); var5++) {
                for (int var6 = 0; var6 < class78.field984 >> 3; var6++) {
                    int var7 = class75.field960[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg1 || var8 == 0) {
                            int var9 = (var7 & 0x7) >> 1;
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class356.field5174.length; var13++) {
                                if (class356.field5174[var13] == var12 && var2[var13] != null) {
                                    class166.method1099(var2[var13], (var11 & 0x7) * 8, 63, var8, arg1, class74.field942, class382.field5610, var6 * 8, (var10 & 0x7) * 8, var4, var5 * 8, var9);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIILth;IIIIIII)Z", line = 213)
    public static final boolean method883(int arg0, int arg1, int arg2, class175 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field1787++;
        int var11 = arg9;
        int var12 = arg6;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg9 - var13;
        int var16 = arg6 - var14;
        class157.field2117[var13][var14] = 99;
        class443.field6448[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class464.field6840[var17] = arg9;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class147.field1990[var10001] = arg6;
        int[][] var19 = arg3.field2408;
        if (arg5 < 59) {
            return true;
        }
        while (var26 != var18) {
            var12 = class147.field1990[var18];
            var11 = class464.field6840[var18];
            int var20 = var12 - var16;
            var18 = var18 + 1 & 0xFFF;
            int var21 = var11 - var15;
            int var22 = var11 - arg3.field2419;
            int var23 = var12 - arg3.field2400;
            if (arg4 == -4) {
                if (arg0 == var11 && arg1 == var12) {
                    class369.field5349 = var12;
                    class106.field1431 = var11;
                    return true;
                }
            } else if (arg4 == -3) {
                if (class100.method659(var12, (byte) -81, arg1, var11, arg7, arg8, 2, 2, arg0)) {
                    class369.field5349 = var12;
                    class106.field1431 = var11;
                    return true;
                }
            } else if (arg4 == -2) {
                if (arg3.method1214(arg8, var11, arg7, var12, -119, 2, arg1, arg0, 2, arg2)) {
                    class369.field5349 = var12;
                    class106.field1431 = var11;
                    return true;
                }
            } else if (arg4 == -1) {
                if (arg3.method1203(var11, arg2, arg8, arg1, var12, 2, (byte) -128, arg7, arg0)) {
                    class369.field5349 = var12;
                    class106.field1431 = var11;
                    return true;
                }
            } else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
                if (arg3.method1207(arg4, arg10, var11, 2, arg1, -1, var12, arg0)) {
                    class369.field5349 = var12;
                    class106.field1431 = var11;
                    return true;
                }
            } else if (arg3.method1204((byte) -30, arg10, 2, var12, arg0, var11, arg4, arg1)) {
                class369.field5349 = var12;
                class106.field1431 = var11;
                return true;
            }
            int var25 = class443.field6448[var21][var20] + 1;
            if (var21 > 0 && class157.field2117[var21 - 1][var20] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class464.field6840[var26] = var11 - 1;
                class147.field1990[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class157.field2117[var21 - 1][var20] = 2;
                class443.field6448[var21 - 1][var20] = var25;
            }
            if (var21 < 126 && class157.field2117[var21 + 1][var20] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class464.field6840[var26] = var11 + 1;
                class147.field1990[var26] = var12;
                class157.field2117[var21 + 1][var20] = 8;
                var26 = var26 + 1 & 0xFFF;
                class443.field6448[var21 + 1][var20] = var25;
            }
            if (var20 > 0 && class157.field2117[var21][var20 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class464.field6840[var26] = var11;
                class147.field1990[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class157.field2117[var21][var20 - 1] = 1;
                class443.field6448[var21][var20 - 1] = var25;
            }
            if (var20 < 126 && class157.field2117[var21][var20 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class464.field6840[var26] = var11;
                class147.field1990[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class157.field2117[var21][var20 + 1] = 4;
                class443.field6448[var21][var20 + 1] = var25;
            }
            if (var21 > 0 && var20 > 0 && class157.field2117[var21 - 1][var20 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class464.field6840[var26] = var11 - 1;
                class147.field1990[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class157.field2117[var21 - 1][var20 - 1] = 3;
                class443.field6448[var21 - 1][var20 - 1] = var25;
            }
            if (var21 < 126 && var20 > 0 && class157.field2117[var21 + 1][var20 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class464.field6840[var26] = var11 + 1;
                class147.field1990[var26] = var12 - 1;
                class157.field2117[var21 + 1][var20 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class443.field6448[var21 + 1][var20 - 1] = var25;
            }
            if (var21 > 0 && var20 < 126 && class157.field2117[var21 - 1][var20 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class464.field6840[var26] = var11 - 1;
                class147.field1990[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class157.field2117[var21 - 1][var20 + 1] = 6;
                class443.field6448[var21 - 1][var20 + 1] = var25;
            }
            if (var21 < 126 && var20 < 126 && class157.field2117[var21 + 1][var20 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class464.field6840[var26] = var11 + 1;
                class147.field1990[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class157.field2117[var21 + 1][var20 + 1] = 12;
                class443.field6448[var21 + 1][var20 + 1] = var25;
            }
        }
        class369.field5349 = var12;
        class106.field1431 = var11;
        return false;
    }
}
