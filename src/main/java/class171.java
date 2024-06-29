import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public abstract class class171 {

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)[B")
    public abstract byte[] method1051(byte arg0);

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILmr;)V")
    public static final void method1052(int arg0, class145 arg1) {
        field2632++;
        int var2 = arg1.field2004 - class26.field332;
        int var3 = arg1.field1950 * 128 + (arg1.method911(0) * 64);
        int var4 = arg1.field1958 * 128 + (arg1.method911(0) * 64);
        arg1.field2015 = 0;
        arg1.field1900 += (var3 - arg1.field1900) / var2;
        arg1.field1892 += (var4 - arg1.field1892) / var2;
        if (arg1.field1998 == 0) {
            arg1.method897(8192, arg0 + 41099);
        }
        if (arg1.field1998 == 1) {
            arg1.method897(12288, 16384);
        }
        if (arg0 != -24715) {
            return;
        }
        if (arg1.field1998 == 2) {
            arg1.method897(0, 16384);
        }
        if (arg1.field1998 == 3) {
            arg1.method897(4096, 16384);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B[B)V")
    public abstract void method1053(byte arg0, byte[] arg1);

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method1054(int arg0, String arg1) {
        field2637++;
        if (arg1 == null) {
            return null;
        }
        int var2 = arg0;
        int var3 = arg1.length();
        while (var3 > var2 && class347.method2106(arg1.charAt(var2), arg0 + 31965)) {
            var2++;
        }
        while (var3 > var2 && class347.method2106(arg1.charAt(var3 - 1), arg0 ^ 0x7CDD)) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg1.charAt(var6);
            if (class408.method2563(var7, (byte) 102)) {
                char var8 = class191.method1152(var7, false);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lkr;ILor;Lfh;IIII)V")
    public static final void method1055(class234 arg0, int arg1, class153 arg2, class170 arg3, int arg4, int arg5, int arg6, int arg7) {
        field2635++;
        if (arg0 == null) {
            return;
        }
        int var8;
        if (class80.field1054 == 4) {
            var8 = (int) class462.field6810 & 0x3FFF;
        } else {
            var8 = (int) class462.field6810 + class3.field39 & 0x3FFF;
        }
        int var9 = Math.max(arg3.field2561 / 2, arg3.field2501 / 2) + 10;
        int var10 = arg6 * arg6 + arg7 * arg7;
        if (var10 > (var9 * var9)) {
            return;
        }
        int var11 = class110.field1450[var8];
        if (arg1 != 0) {
            return;
        }
        int var12 = class110.field1452[var8];
        if (class80.field1054 != 4) {
            var12 = var12 * 256 / (class343.field5138 + 256);
            var11 = var11 * 256 / (class343.field5138 + 256);
        }
        int var13 = arg6 * var12 + arg7 * var11 >> 15;
        int var14 = arg7 * var12 - arg6 * var11 >> 15;
        arg0.method1217(var13 + arg3.field2561 / 2 + arg5 - (arg0.method1226() / 2), arg4 - (-(arg3.field2501 / 2) - -var14 - -(arg0.method1219() / 2)), arg2, arg5, arg4);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)I")
    public static final int method1056(int arg0) {
        if (arg0 == -15481) {
            field2633++;
            return 2;
        } else {
            return -18;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I[B)Z")
    public static final boolean method1057(int arg0, byte[] arg1) {
        field2636++;
        class385 var2 = new class385(arg1);
        int var3 = var2.method2343(arg0 ^ 0xFFFFFF01);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = arg0 == ~var2.method2343(255);
        if (var4) {
            class250.method1525(var2, false);
        }
        class266.method1650(-82, var2);
        return true;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BIILek;IIIIIII)Z")
    public static final boolean method1058(byte arg0, int arg1, int arg2, class375 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field2634++;
        int var11 = arg10;
        int var12 = arg8;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg10 - var13;
        class449.field6612[var13][var14] = 99;
        int var16 = arg8 - var14;
        class150.field2072[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class451.field6659[var17] = arg10;
        if (arg0 != -94) {
            return false;
        }
        byte var10001 = var17;
        int var26 = var17 + 1;
        class107.field1429[var10001] = arg8;
        int[][] var19 = arg3.field5455;
        while (var26 != var18) {
            var11 = class451.field6659[var18];
            var12 = class107.field1429[var18];
            int var20 = var12 - var16;
            int var21 = var12 - arg3.field5456;
            var18 = var18 + 1 & 0xFFF;
            int var22 = var11 - arg3.field5452;
            int var23 = var11 - var15;
            if (arg4 == -4) {
                if (arg1 == var11 && arg9 == var12) {
                    class399.field5956 = var12;
                    class191.field2846 = var11;
                    return true;
                }
            } else if (arg4 == -3) {
                if (class71.method474(128, arg2, var12, 1, arg9, 1, var11, arg1, arg5)) {
                    class399.field5956 = var12;
                    class191.field2846 = var11;
                    return true;
                }
            } else if (arg4 == -2) {
                if (arg3.method2251(arg2, arg5, 1, 1, arg7, var12, var11, arg1, -29128, arg9)) {
                    class191.field2846 = var11;
                    class399.field5956 = var12;
                    return true;
                }
            } else if (arg4 == -1) {
                if (arg3.method2246(arg1, var12, (byte) 66, arg2, var11, arg7, 1, arg9, arg5)) {
                    class399.field5956 = var12;
                    class191.field2846 = var11;
                    return true;
                }
            } else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
                if (arg3.method2254(16, arg6, arg1, arg4, 1, var12, var11, arg9)) {
                    class191.field2846 = var11;
                    class399.field5956 = var12;
                    return true;
                }
            } else if (arg3.method2259(arg9, arg4, arg6, arg1, 1, var11, 0, var12)) {
                class399.field5956 = var12;
                class191.field2846 = var11;
                return true;
            }
            int var25 = class150.field2072[var23][var20] + 1;
            if (var23 > 0 && class449.field6612[var23 - 1][var20] == 0 && (var19[var22 - 1][var21] & 0x42240000) == 0) {
                class451.field6659[var26] = var11 - 1;
                class107.field1429[var26] = var12;
                class449.field6612[var23 - 1][var20] = 2;
                var26 = var26 + 1 & 0xFFF;
                class150.field2072[var23 - 1][var20] = var25;
            }
            if (var23 < 127 && class449.field6612[var23 + 1][var20] == 0 && (var19[var22 + 1][var21] & 0x60240000) == 0) {
                class451.field6659[var26] = var11 + 1;
                class107.field1429[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class449.field6612[var23 + 1][var20] = 8;
                class150.field2072[var23 + 1][var20] = var25;
            }
            if (var20 > 0 && class449.field6612[var23][var20 - 1] == 0 && (var19[var22][var21 - 1] & 0x40A40000) == 0) {
                class451.field6659[var26] = var11;
                class107.field1429[var26] = var12 - 1;
                class449.field6612[var23][var20 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class150.field2072[var23][var20 - 1] = var25;
            }
            if (var20 < 127 && class449.field6612[var23][var20 + 1] == 0 && (var19[var22][var21 + 1] & 0x48240000) == 0) {
                class451.field6659[var26] = var11;
                class107.field1429[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class449.field6612[var23][var20 + 1] = 4;
                class150.field2072[var23][var20 + 1] = var25;
            }
            if (var23 > 0 && var20 > 0 && class449.field6612[var23 - 1][var20 - 1] == 0 && (var19[var22 - 1][var21 - 1] & 0x43A40000) == 0 && (var19[var22 - 1][var21] & 0x42240000) == 0 && (var19[var22][var21 - 1] & 0x40A40000) == 0) {
                class451.field6659[var26] = var11 - 1;
                class107.field1429[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class449.field6612[var23 - 1][var20 - 1] = 3;
                class150.field2072[var23 - 1][var20 - 1] = var25;
            }
            if (var23 < 127 && var20 > 0 && class449.field6612[var23 + 1][var20 - 1] == 0 && (var19[var22 + 1][var21 - 1] & 0x60E40000) == 0 && (var19[var22 + 1][var21] & 0x60240000) == 0 && (var19[var22][var21 - 1] & 0x40A40000) == 0) {
                class451.field6659[var26] = var11 + 1;
                class107.field1429[var26] = var12 - 1;
                class449.field6612[var23 + 1][var20 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class150.field2072[var23 + 1][var20 - 1] = var25;
            }
            if (var23 > 0 && var20 < 127 && class449.field6612[var23 - 1][var20 + 1] == 0 && (var19[var22 - 1][var21 + 1] & 0x4E240000) == 0 && (var19[var22 - 1][var21] & 0x42240000) == 0 && (var19[var22][var21 + 1] & 0x48240000) == 0) {
                class451.field6659[var26] = var11 - 1;
                class107.field1429[var26] = var12 + 1;
                class449.field6612[var23 - 1][var20 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class150.field2072[var23 - 1][var20 + 1] = var25;
            }
            if (var23 < 127 && var20 < 127 && class449.field6612[var23 + 1][var20 + 1] == 0 && (var19[var22 + 1][var21 + 1] & 0x78240000) == 0 && (var19[var22 + 1][var21] & 0x60240000) == 0 && (var19[var22][var21 + 1] & 0x48240000) == 0) {
                class451.field6659[var26] = var11 + 1;
                class107.field1429[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class449.field6612[var23 + 1][var20 + 1] = 12;
                class150.field2072[var23 + 1][var20 + 1] = var25;
            }
        }
        class191.field2846 = var11;
        class399.field5956 = var12;
        return false;
    }
}
