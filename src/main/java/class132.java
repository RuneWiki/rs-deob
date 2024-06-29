import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class132 extends class206 {

    @OriginalMember(owner = "client!laa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1551 = new String[] { method1141(method1140("T<Uu")), method1141(method1140("Ag\u00177O")), method1141(method1140("V(X7p\u0012")), method1141(method1140("V(X7s\u0012")), method1141(method1140("V(X7q\u0012")) };

    @OriginalMember(owner = "client!laa", name = "k", descriptor = "I")
    public static int field1539 = 0;

    @OriginalMember(owner = "client!laa", name = "l", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!laa", name = "o", descriptor = "I")
    public int field1544;

    @OriginalMember(owner = "client!laa", name = "u", descriptor = "I")
    public int field1547;

    @OriginalMember(owner = "client!laa", name = "j", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!laa", name = "r", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!laa", name = "s", descriptor = "Lla;")
    public static class476 field1546;

    @OriginalMember(owner = "client!laa", name = "m", descriptor = "[I")
    public int[] field1541;

    @OriginalMember(owner = "client!laa", name = "q", descriptor = "[I")
    public int[] field1542;

    @OriginalMember(owner = "client!laa", name = "t", descriptor = "[I")
    public int[] field1545;

    @OriginalMember(owner = "client!laa", name = "p", descriptor = "[Lvd;")
    public class42[] field1538;

    @OriginalMember(owner = "client!laa", name = "v", descriptor = "[Lvd;")
    public class42[] field1540;

    @OriginalMember(owner = "client!laa", name = "n", descriptor = "[[[B")
    public byte[][][] field1549;

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIILdja;BIIIIII)Z")
    public static final boolean method1137(int arg0, int arg1, int arg2, class324 arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        try {
            field1548++;
            int var11 = arg1;
            int var12 = arg5;
            byte var13 = 64;
            byte var14 = 64;
            int var15 = arg1 - var13;
            int var16 = arg5 - var14;
            if (arg4 != -25) {
                return true;
            }
            class36.field415[var13][var14] = 99;
            class751.field10933[var13][var14] = 0;
            byte var17 = 0;
            int var18 = 0;
            class282.field4222[var17] = arg1;
            byte var10001 = var17;
            int var28 = var17 + 1;
            class314.field4967[var10001] = arg5;
            int[][] var19 = arg3.field5117;
            while (var28 != var18) {
                var12 = class314.field4967[var18];
                var11 = class282.field4222[var18];
                var18 = var18 + 1 & 0xFFF;
                int var20 = var11 - var15;
                int var21 = var12 - var16;
                int var22 = var11 - arg3.field5114;
                int var23 = var12 - arg3.field5097;
                if (arg8 == -4) {
                    if (arg9 == var11 && arg6 == var12) {
                        class650.field9410 = var11;
                        class534.field7819 = var12;
                        return true;
                    }
                } else if (arg8 == -3) {
                    if (class39.method264(arg9, arg6, 2, var11, arg10, arg0, 0, 2, var12)) {
                        class534.field7819 = var12;
                        class650.field9410 = var11;
                        return true;
                    }
                } else if (arg8 == -2) {
                    if (arg3.method2747(2, arg6, var12, arg9, (byte) 48, arg7, arg0, var11, arg10, 2)) {
                        class650.field9410 = var11;
                        class534.field7819 = var12;
                        return true;
                    }
                } else if (arg8 == -1) {
                    if (arg3.method2735(2, arg9, true, arg10, arg0, var12, arg6, arg7, var11)) {
                        class534.field7819 = var12;
                        class650.field9410 = var11;
                        return true;
                    }
                } else if (arg8 == 0 || arg8 == 1 || arg8 == 2 || arg8 == 3 || arg8 == 9) {
                    if (arg3.method2750(var12, 2, -97, var11, arg9, arg2, arg6, arg8)) {
                        class534.field7819 = var12;
                        class650.field9410 = var11;
                        return true;
                    }
                } else if (arg3.method2748(arg2, (byte) 96, var11, arg8, arg9, var12, arg6, 2)) {
                    class650.field9410 = var11;
                    class534.field7819 = var12;
                    return true;
                }
                int var25 = class751.field10933[var20][var21] + 1;
                if (var20 > 0 && class36.field415[var20 - 1][var21] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                    class282.field4222[var28] = var11 - 1;
                    class314.field4967[var28] = var12;
                    var28 = var28 + 1 & 0xFFF;
                    class36.field415[var20 - 1][var21] = 2;
                    class751.field10933[var20 - 1][var21] = var25;
                }
                if (var20 < 126 && class36.field415[var20 + 1][var21] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                    class282.field4222[var28] = var11 + 1;
                    class314.field4967[var28] = var12;
                    class36.field415[var20 + 1][var21] = 8;
                    var28 = var28 + 1 & 0xFFF;
                    class751.field10933[var20 + 1][var21] = var25;
                }
                if (var21 > 0 && class36.field415[var20][var21 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                    class282.field4222[var28] = var11;
                    class314.field4967[var28] = var12 - 1;
                    var28 = var28 + 1 & 0xFFF;
                    class36.field415[var20][var21 - 1] = 1;
                    class751.field10933[var20][var21 - 1] = var25;
                }
                if (var21 < 126 && class36.field415[var20][var21 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                    class282.field4222[var28] = var11;
                    class314.field4967[var28] = var12 + 1;
                    class36.field415[var20][var21 + 1] = 4;
                    var28 = var28 + 1 & 0xFFF;
                    class751.field10933[var20][var21 + 1] = var25;
                }
                if (var20 > 0 && var21 > 0 && class36.field415[var20 - 1][var21 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                    class282.field4222[var28] = var11 - 1;
                    class314.field4967[var28] = var12 - 1;
                    var28 = var28 + 1 & 0xFFF;
                    class36.field415[var20 - 1][var21 - 1] = 3;
                    class751.field10933[var20 - 1][var21 - 1] = var25;
                }
                if (var20 < 126 && var21 > 0 && class36.field415[var20 + 1][var21 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                    class282.field4222[var28] = var11 + 1;
                    class314.field4967[var28] = var12 - 1;
                    class36.field415[var20 + 1][var21 - 1] = 9;
                    var28 = var28 + 1 & 0xFFF;
                    class751.field10933[var20 + 1][var21 - 1] = var25;
                }
                if (var20 > 0 && var21 < 126 && class36.field415[var20 - 1][var21 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                    class282.field4222[var28] = var11 - 1;
                    class314.field4967[var28] = var12 + 1;
                    class36.field415[var20 - 1][var21 + 1] = 6;
                    var28 = var28 + 1 & 0xFFF;
                    class751.field10933[var20 - 1][var21 + 1] = var25;
                }
                if (var20 < 126 && var21 < 126 && class36.field415[var20 + 1][var21 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                    class282.field4222[var28] = var11 + 1;
                    class314.field4967[var28] = var12 + 1;
                    var28 = var28 + 1 & 0xFFF;
                    class36.field415[var20 + 1][var21 + 1] = 12;
                    class751.field10933[var20 + 1][var21 + 1] = var25;
                }
            }
            class650.field9410 = var11;
            class534.field7819 = var12;
            return false;
        } catch (RuntimeException var27) {
            throw class759.method5498(var27, field1551[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field1551[0] : field1551[1]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Ldja;IIIIIIIIII)Z")
    public static final boolean method1138(class324 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        try {
            field1550++;
            int var11 = arg6;
            int var12 = arg9;
            byte var13 = 64;
            byte var14 = 64;
            int var15 = arg6 - var13;
            class36.field415[var13][var14] = 99;
            int var16 = arg9 - var14;
            class751.field10933[var13][var14] = 0;
            byte var17 = 0;
            class282.field4222[var17] = arg6;
            int var18 = 0;
            if (arg2 < 38) {
                field1543 = -39;
            }
            byte var10001 = var17;
            int var28 = var17 + 1;
            class314.field4967[var10001] = arg9;
            int[][] var19 = arg0.field5117;
            while (var28 != var18) {
                var11 = class282.field4222[var18];
                var12 = class314.field4967[var18];
                int var20 = var11 - arg0.field5114;
                int var21 = var11 - var15;
                var18 = var18 + 1 & 0xFFF;
                int var22 = var12 - arg0.field5097;
                int var23 = var12 - var16;
                if (arg5 == -4) {
                    if (arg1 == var11 && arg4 == var12) {
                        class650.field9410 = var11;
                        class534.field7819 = var12;
                        return true;
                    }
                } else if (arg5 == -3) {
                    if (class39.method264(arg1, arg4, 1, var11, arg7, arg8, 0, 1, var12)) {
                        class534.field7819 = var12;
                        class650.field9410 = var11;
                        return true;
                    }
                } else if (arg5 == -2) {
                    if (arg0.method2747(1, arg4, var12, arg1, (byte) 64, arg3, arg8, var11, arg7, 1)) {
                        class534.field7819 = var12;
                        class650.field9410 = var11;
                        return true;
                    }
                } else if (arg5 == -1) {
                    if (arg0.method2735(1, arg1, true, arg7, arg8, var12, arg4, arg3, var11)) {
                        class534.field7819 = var12;
                        class650.field9410 = var11;
                        return true;
                    }
                } else if (arg5 == 0 || arg5 == 1 || arg5 == 2 || arg5 == 3 || arg5 == 9) {
                    if (arg0.method2750(var12, 1, -77, var11, arg1, arg10, arg4, arg5)) {
                        class534.field7819 = var12;
                        class650.field9410 = var11;
                        return true;
                    }
                } else if (arg0.method2748(arg10, (byte) 102, var11, arg5, arg1, var12, arg4, 1)) {
                    class650.field9410 = var11;
                    class534.field7819 = var12;
                    return true;
                }
                int var25 = class751.field10933[var21][var23] + 1;
                if (var21 > 0 && class36.field415[var21 - 1][var23] == 0 && (var19[var20 - 1][var22] & 0x42240000) == 0) {
                    class282.field4222[var28] = var11 - 1;
                    class314.field4967[var28] = var12;
                    class36.field415[var21 - 1][var23] = 2;
                    var28 = var28 + 1 & 0xFFF;
                    class751.field10933[var21 - 1][var23] = var25;
                }
                if (var21 < 127 && class36.field415[var21 + 1][var23] == 0 && (var19[var20 + 1][var22] & 0x60240000) == 0) {
                    class282.field4222[var28] = var11 + 1;
                    class314.field4967[var28] = var12;
                    var28 = var28 + 1 & 0xFFF;
                    class36.field415[var21 + 1][var23] = 8;
                    class751.field10933[var21 + 1][var23] = var25;
                }
                if (var23 > 0 && class36.field415[var21][var23 - 1] == 0 && (var19[var20][var22 - 1] & 0x40A40000) == 0) {
                    class282.field4222[var28] = var11;
                    class314.field4967[var28] = var12 - 1;
                    class36.field415[var21][var23 - 1] = 1;
                    var28 = var28 + 1 & 0xFFF;
                    class751.field10933[var21][var23 - 1] = var25;
                }
                if (var23 < 127 && class36.field415[var21][var23 + 1] == 0 && (var19[var20][var22 + 1] & 0x48240000) == 0) {
                    class282.field4222[var28] = var11;
                    class314.field4967[var28] = var12 + 1;
                    var28 = var28 + 1 & 0xFFF;
                    class36.field415[var21][var23 + 1] = 4;
                    class751.field10933[var21][var23 + 1] = var25;
                }
                if (var21 > 0 && var23 > 0 && class36.field415[var21 - 1][var23 - 1] == 0 && (var19[var20 - 1][var22 - 1] & 0x43A40000) == 0 && (var19[var20 - 1][var22] & 0x42240000) == 0 && (var19[var20][var22 - 1] & 0x40A40000) == 0) {
                    class282.field4222[var28] = var11 - 1;
                    class314.field4967[var28] = var12 - 1;
                    var28 = var28 + 1 & 0xFFF;
                    class36.field415[var21 - 1][var23 - 1] = 3;
                    class751.field10933[var21 - 1][var23 - 1] = var25;
                }
                if (var21 < 127 && var23 > 0 && class36.field415[var21 + 1][var23 - 1] == 0 && (var19[var20 + 1][var22 - 1] & 0x60E40000) == 0 && (var19[var20 + 1][var22] & 0x60240000) == 0 && (var19[var20][var22 - 1] & 0x40A40000) == 0) {
                    class282.field4222[var28] = var11 + 1;
                    class314.field4967[var28] = var12 - 1;
                    var28 = var28 + 1 & 0xFFF;
                    class36.field415[var21 + 1][var23 - 1] = 9;
                    class751.field10933[var21 + 1][var23 - 1] = var25;
                }
                if (var21 > 0 && var23 < 127 && class36.field415[var21 - 1][var23 + 1] == 0 && (var19[var20 - 1][var22 + 1] & 0x4E240000) == 0 && (var19[var20 - 1][var22] & 0x42240000) == 0 && (var19[var20][var22 + 1] & 0x48240000) == 0) {
                    class282.field4222[var28] = var11 - 1;
                    class314.field4967[var28] = var12 + 1;
                    var28 = var28 + 1 & 0xFFF;
                    class36.field415[var21 - 1][var23 + 1] = 6;
                    class751.field10933[var21 - 1][var23 + 1] = var25;
                }
                if (var21 < 127 && var23 < 127 && class36.field415[var21 + 1][var23 + 1] == 0 && (var19[var20 + 1][var22 + 1] & 0x78240000) == 0 && (var19[var20 + 1][var22] & 0x60240000) == 0 && (var19[var20][var22 + 1] & 0x48240000) == 0) {
                    class282.field4222[var28] = var11 + 1;
                    class314.field4967[var28] = var12 + 1;
                    var28 = var28 + 1 & 0xFFF;
                    class36.field415[var21 + 1][var23 + 1] = 12;
                    class751.field10933[var21 + 1][var23 + 1] = var25;
                }
            }
            class534.field7819 = var12;
            class650.field9410 = var11;
            return false;
        } catch (RuntimeException var27) {
            throw class759.method5498(var27, field1551[2] + (arg0 == null ? field1551[0] : field1551[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(I)V")
    public static void method1139(int arg0) {
        try {
            if (arg0 != -1) {
                method1137(25, -115, 28, null, (byte) 94, 37, 10, -85, -34, -124, 52);
            }
            field1546 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1551[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!laa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1140(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x32);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!laa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1141(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 58;
                    break;
                case 1:
                    var10005 = 73;
                    break;
                case 2:
                    var10005 = 57;
                    break;
                case 3:
                    var10005 = 25;
                    break;
                default:
                    var10005 = 50;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
