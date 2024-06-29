import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class45 {

    @OriginalMember(owner = "client!dw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field647 = new String[] { method489(method488("\u001f0\u001f(L")), method489(method488("\u001f0\u001f)L")), method489(method488("\u00152]\u0006")), method489(method488("\u0000i\u001fD\u0019")), method489(method488("\u001f0\u001f+L")) };

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "Ltf;")
    public static class524 field644 = new class524();

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "Llga;")
    public static class47 field645;

    @OriginalMember(owner = "client!dw", name = "e", descriptor = "Ljh;")
    public static class698 field646;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)V")
    public static void method485(int arg0) {
        try {
            if (arg0 < 118) {
                method485(69);
            }
            field645 = null;
            field646 = null;
            field644 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field647[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZII)Z")
    public static final boolean method486(boolean arg0, int arg1, int arg2) {
        try {
            field643++;
            if (!arg0) {
                field644 = null;
            }
            return (arg2 & 0x34) != 0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field647[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(ILuda;IIIIIIIII)Z")
    public static final boolean method487(int arg0, class302 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        try {
            field642++;
            int var11 = arg4;
            int var12 = arg5;
            byte var13 = 64;
            byte var14 = 64;
            int var15 = arg4 - var13;
            int var16 = arg5 - var14;
            class393.field5717[var13][var14] = 99;
            class481.field7084[var13][var14] = 0;
            byte var17 = 0;
            if (arg2 > -119) {
                return false;
            }
            class796.field11576[var17] = arg4;
            int var18 = 0;
            byte var10001 = var17;
            int var28 = var17 + 1;
            class356.field5171[var10001] = arg5;
            int[][] var19 = arg1.field4202;
            while (var28 != var18) {
                var12 = class356.field5171[var18];
                var11 = class796.field11576[var18];
                var18 = var18 + 1 & 0xFFF;
                int var20 = var11 - var15;
                int var21 = var12 - var16;
                int var22 = var11 - arg1.field4214;
                int var23 = var12 - arg1.field4196;
                if (arg8 == -4) {
                    if (arg3 == var11 && arg0 == var12) {
                        class263.field3716 = var11;
                        class654.field9282 = var12;
                        return true;
                    }
                } else if (arg8 == -3) {
                    if (class801.method5778(2, var11, var12, 2, arg3, arg7, arg0, (byte) 120, arg6)) {
                        class654.field9282 = var12;
                        class263.field3716 = var11;
                        return true;
                    }
                } else if (arg8 == -2) {
                    if (arg1.method2416(arg0, (byte) 34, arg9, arg6, arg3, var11, 2, 2, arg7, var12)) {
                        class654.field9282 = var12;
                        class263.field3716 = var11;
                        return true;
                    }
                } else if (arg8 == -1) {
                    if (arg1.method2422(arg0, var12, arg6, var11, 2, arg3, arg9, false, arg7)) {
                        class654.field9282 = var12;
                        class263.field3716 = var11;
                        return true;
                    }
                } else if (arg8 == 0 || arg8 == 1 || arg8 == 2 || arg8 == 3 || arg8 == 9) {
                    if (arg1.method2424(var12, arg10, arg3, 0, var11, arg0, arg8, 2)) {
                        class263.field3716 = var11;
                        class654.field9282 = var12;
                        return true;
                    }
                } else if (arg1.method2430(false, var11, arg10, var12, arg8, arg3, 2, arg0)) {
                    class654.field9282 = var12;
                    class263.field3716 = var11;
                    return true;
                }
                int var25 = class481.field7084[var20][var21] + 1;
                if (var20 > 0 && class393.field5717[var20 - 1][var21] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                    class796.field11576[var28] = var11 - 1;
                    class356.field5171[var28] = var12;
                    class393.field5717[var20 - 1][var21] = 2;
                    var28 = var28 + 1 & 0xFFF;
                    class481.field7084[var20 - 1][var21] = var25;
                }
                if (var20 < 126 && class393.field5717[var20 + 1][var21] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                    class796.field11576[var28] = var11 + 1;
                    class356.field5171[var28] = var12;
                    var28 = var28 + 1 & 0xFFF;
                    class393.field5717[var20 + 1][var21] = 8;
                    class481.field7084[var20 + 1][var21] = var25;
                }
                if (var21 > 0 && class393.field5717[var20][var21 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                    class796.field11576[var28] = var11;
                    class356.field5171[var28] = var12 - 1;
                    class393.field5717[var20][var21 - 1] = 1;
                    var28 = var28 + 1 & 0xFFF;
                    class481.field7084[var20][var21 - 1] = var25;
                }
                if (var21 < 126 && class393.field5717[var20][var21 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                    class796.field11576[var28] = var11;
                    class356.field5171[var28] = var12 + 1;
                    class393.field5717[var20][var21 + 1] = 4;
                    var28 = var28 + 1 & 0xFFF;
                    class481.field7084[var20][var21 + 1] = var25;
                }
                if (var20 > 0 && var21 > 0 && class393.field5717[var20 - 1][var21 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                    class796.field11576[var28] = var11 - 1;
                    class356.field5171[var28] = var12 - 1;
                    var28 = var28 + 1 & 0xFFF;
                    class393.field5717[var20 - 1][var21 - 1] = 3;
                    class481.field7084[var20 - 1][var21 - 1] = var25;
                }
                if (var20 < 126 && var21 > 0 && class393.field5717[var20 + 1][var21 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                    class796.field11576[var28] = var11 + 1;
                    class356.field5171[var28] = var12 - 1;
                    class393.field5717[var20 + 1][var21 - 1] = 9;
                    var28 = var28 + 1 & 0xFFF;
                    class481.field7084[var20 + 1][var21 - 1] = var25;
                }
                if (var20 > 0 && var21 < 126 && class393.field5717[var20 - 1][var21 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                    class796.field11576[var28] = var11 - 1;
                    class356.field5171[var28] = var12 + 1;
                    class393.field5717[var20 - 1][var21 + 1] = 6;
                    var28 = var28 + 1 & 0xFFF;
                    class481.field7084[var20 - 1][var21 + 1] = var25;
                }
                if (var20 < 126 && var21 < 126 && class393.field5717[var20 + 1][var21 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                    class796.field11576[var28] = var11 + 1;
                    class356.field5171[var28] = var12 + 1;
                    class393.field5717[var20 + 1][var21 + 1] = 12;
                    var28 = var28 + 1 & 0xFFF;
                    class481.field7084[var20 + 1][var21 + 1] = var25;
                }
            }
            class654.field9282 = var12;
            class263.field3716 = var11;
            return false;
        } catch (RuntimeException var27) {
            throw class665.method4799(var27, field647[1] + arg0 + ',' + (arg1 == null ? field647[2] : field647[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!dw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method488(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x64);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method489(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 123;
                    break;
                case 1:
                    var10005 = 71;
                    break;
                case 2:
                    var10005 = 49;
                    break;
                case 3:
                    var10005 = 106;
                    break;
                default:
                    var10005 = 100;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
