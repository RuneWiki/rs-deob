import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class49 extends class431 {

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "S")
    public short field631;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "[I")
    public static int[] field628 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "Lpc;")
    public static class477 field632;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)I")
    public static final int method484(int arg0, int arg1, int arg2) {
        field627++;
        int var3 = 0;
        while (arg1 > 0) {
            var3 = arg2 & 0x1 | var3 << 1;
            arg2 >>>= 0x1;
            arg1--;
        }
        int var4 = -108 / ((6 - arg0) / 42);
        return var3;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIB)V")
    public static final void method485(int arg0, int arg1, byte arg2) {
        field634++;
        if (arg2 > -28) {
            method487((byte) -113);
        }
        class211 var3 = class452.method2749(12, -95, arg0);
        var3.method1463(0);
        var3.field3441 = arg1;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
    public static final void method486(byte arg0) {
        if (arg0 < 109) {
            method488(null, 72, 81, 45, 57, 28, -122, -29, 106, -48, -63);
        }
        field633++;
        if (class377.field5692 == null) {
            return;
        }
        class515.field7496.method1959(0);
        class505.method3009();
        class77.method668(false);
        class52.method499(18328);
        class285.method1842(0);
        class323.method2054(-33);
        if (class32.field377 != null) {
            class32.field377.method1624(true);
        }
        class213.method1479(126);
        class123.method912(true);
        class402.method2517(34);
        class387.method2419(false, (byte) -1);
        class276.method1811(-15267);
        for (int var1 = 0; var1 < 2048; var1++) {
            class177 var5 = class26.field319[var1];
            if (var5 != null) {
                var5.field1986 = null;
                for (int var6 = 0; var6 < var5.field1980.length; var6++) {
                    var5.field1980[var6] = null;
                }
            }
        }
        for (int var2 = 0; var2 < class153.field2265.length; var2++) {
            class116 var3 = class153.field2265[var2];
            if (var3 != null) {
                for (int var4 = 0; var4 < var3.field1980.length; var4++) {
                    var3.field1980[var4] = null;
                }
            }
        }
        class94.field1324 = null;
        class210.field3431 = null;
        class377.field5692.method305(-26760);
        class377.field5692 = null;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)V")
    public static void method487(byte arg0) {
        int var1 = -118 / ((-arg0 - 36) / 35);
        field628 = null;
        field632 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lpd;IIIIIIIIII)Z")
    public static final boolean method488(class172 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field630++;
        int var11 = arg6;
        int var12 = arg10;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg6 - var13;
        class237.field3810[var13][var14] = 99;
        if (arg1 != -10657) {
            method487((byte) 6);
        }
        int var16 = arg10 - var14;
        class129.field1947[var13][var14] = 0;
        byte var17 = 0;
        class53.field661[var17] = arg6;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class349.field5164[var10001] = arg10;
        int[][] var19 = arg0.field2573;
        while (var26 != var18) {
            var11 = class53.field661[var18];
            var12 = class349.field5164[var18];
            var18 = var18 + 1 & 0xFFF;
            int var20 = var12 - var16;
            int var21 = var11 - var15;
            int var22 = var11 - arg0.field2559;
            int var23 = var12 - arg0.field2565;
            if (arg4 == -4) {
                if (arg8 == var11 && arg7 == var12) {
                    class162.field2406 = var12;
                    class428.field6371 = var11;
                    return true;
                }
            } else if (arg4 == -3) {
                if (class56.method515(var12, 2, arg2, var11, 2, arg5, arg8, 4268, arg7)) {
                    class428.field6371 = var11;
                    class162.field2406 = var12;
                    return true;
                }
            } else if (arg4 == -2) {
                if (arg0.method1162(var12, arg5, 2, arg8, arg7, arg2, var11, arg3, 2, (byte) 10)) {
                    class428.field6371 = var11;
                    class162.field2406 = var12;
                    return true;
                }
            } else if (arg4 == -1) {
                if (arg0.method1154(var11, arg3, arg5, 2, arg8, (byte) 124, arg7, var12, arg2)) {
                    class428.field6371 = var11;
                    class162.field2406 = var12;
                    return true;
                }
            } else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
                if (arg0.method1156(arg9, var11, arg8, 2, arg4, arg7, arg1 + 10656, var12)) {
                    class428.field6371 = var11;
                    class162.field2406 = var12;
                    return true;
                }
            } else if (arg0.method1160(false, 2, var11, var12, arg9, arg8, arg7, arg4)) {
                class428.field6371 = var11;
                class162.field2406 = var12;
                return true;
            }
            int var25 = class129.field1947[var21][var20] + 1;
            if (var21 > 0 && class237.field3810[var21 - 1][var20] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class53.field661[var26] = var11 - 1;
                class349.field5164[var26] = var12;
                class237.field3810[var21 - 1][var20] = 2;
                var26 = var26 + 1 & 0xFFF;
                class129.field1947[var21 - 1][var20] = var25;
            }
            if (var21 < 126 && class237.field3810[var21 + 1][var20] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class53.field661[var26] = var11 + 1;
                class349.field5164[var26] = var12;
                class237.field3810[var21 + 1][var20] = 8;
                var26 = var26 + 1 & 0xFFF;
                class129.field1947[var21 + 1][var20] = var25;
            }
            if (var20 > 0 && class237.field3810[var21][var20 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class53.field661[var26] = var11;
                class349.field5164[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class237.field3810[var21][var20 - 1] = 1;
                class129.field1947[var21][var20 - 1] = var25;
            }
            if (var20 < 126 && class237.field3810[var21][var20 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class53.field661[var26] = var11;
                class349.field5164[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class237.field3810[var21][var20 + 1] = 4;
                class129.field1947[var21][var20 + 1] = var25;
            }
            if (var21 > 0 && var20 > 0 && class237.field3810[var21 - 1][var20 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class53.field661[var26] = var11 - 1;
                class349.field5164[var26] = var12 - 1;
                class237.field3810[var21 - 1][var20 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class129.field1947[var21 - 1][var20 - 1] = var25;
            }
            if (var21 < 126 && var20 > 0 && class237.field3810[var21 + 1][var20 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class53.field661[var26] = var11 + 1;
                class349.field5164[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class237.field3810[var21 + 1][var20 - 1] = 9;
                class129.field1947[var21 + 1][var20 - 1] = var25;
            }
            if (var21 > 0 && var20 < 126 && class237.field3810[var21 - 1][var20 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class53.field661[var26] = var11 - 1;
                class349.field5164[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class237.field3810[var21 - 1][var20 + 1] = 6;
                class129.field1947[var21 - 1][var20 + 1] = var25;
            }
            if (var21 < 126 && var20 < 126 && class237.field3810[var21 + 1][var20 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class53.field661[var26] = var11 + 1;
                class349.field5164[var26] = var12 + 1;
                class237.field3810[var21 + 1][var20 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class129.field1947[var21 + 1][var20 + 1] = var25;
            }
        }
        class162.field2406 = var12;
        class428.field6371 = var11;
        return false;
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
    public class49() {
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BI)I")
    public static final int method489(byte arg0, int arg1) {
        field629++;
        int var2 = -5 / ((79 - arg0) / 32);
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(S)V")
    public class49(short arg0) {
        this.field631 = arg0;
    }
}
