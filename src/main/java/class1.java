import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class1 extends class775 {

    @OriginalMember(owner = "client!us", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5 = new String[] { method5(method4("J*\u0019\u0013w")), method5(method4("Dw\u0019~\"")), method5(method4("Q,[<")), method5(method4("J*\u0019\u0011w")), method5(method4("J*\u0019\u0012w")) };

    @OriginalMember(owner = "client!us", name = "c", descriptor = "I")
    public static int field4 = 2;

    @OriginalMember(owner = "client!us", name = "e", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!us", name = "f", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!us", name = "d", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ILii;IIIIIIIII)Z", line = 7)
    public static final boolean method1(int arg0, class580 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        try {
            field2++;
            int var11 = arg5;
            int var12 = arg4;
            byte var13 = 64;
            byte var14 = 64;
            int var15 = arg5 - var13;
            if (arg10 != 16293) {
                method1(106, null, 124, 61, -8, 12, 49, 127, -11, 121, 42);
            }
            int var16 = arg4 - var14;
            class246.field3801[var13][var14] = 99;
            class384.field6161[var13][var14] = 0;
            byte var17 = 0;
            int var18 = 0;
            class116.field1698[var17] = arg5;
            byte var10001 = var17;
            int var28 = var17 + 1;
            class62.field849[var10001] = arg4;
            int[][] var19 = arg1.field8355;
            while (var28 != var18) {
                var11 = class116.field1698[var18];
                var12 = class62.field849[var18];
                var18 = var18 + 1 & 0xFFF;
                int var20 = var11 - var15;
                int var21 = var12 - var16;
                int var22 = var11 - arg1.field8345;
                int var23 = var12 - arg1.field8356;
                if (arg2 == -4) {
                    if (arg0 == var11 && arg6 == var12) {
                        class360.field5812 = var12;
                        class100.field1462 = var11;
                        return true;
                    }
                } else if (arg2 == -3) {
                    if (class480.method3662(var11, arg9, 2, 2, var12, arg6, arg0, arg8, 73)) {
                        class100.field1462 = var11;
                        class360.field5812 = var12;
                        return true;
                    }
                } else if (arg2 == -2) {
                    if (arg1.method4248(arg8, arg7, var11, 2883968, 2, var12, arg0, arg9, 2, arg6)) {
                        class360.field5812 = var12;
                        class100.field1462 = var11;
                        return true;
                    }
                } else if (arg2 == -1) {
                    if (arg1.method4250(arg8, (byte) 79, arg9, var11, var12, arg6, arg7, arg0, 2)) {
                        class360.field5812 = var12;
                        class100.field1462 = var11;
                        return true;
                    }
                } else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
                    if (arg1.method4255((byte) 42, arg0, arg6, arg2, arg3, var11, 2, var12)) {
                        class100.field1462 = var11;
                        class360.field5812 = var12;
                        return true;
                    }
                } else if (arg1.method4245(arg0, var11, arg3, arg6, arg2, -1, 2, var12)) {
                    class360.field5812 = var12;
                    class100.field1462 = var11;
                    return true;
                }
                int var25 = class384.field6161[var20][var21] + 1;
                if (var20 > 0 && class246.field3801[var20 - 1][var21] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                    class116.field1698[var28] = var11 - 1;
                    class62.field849[var28] = var12;
                    class246.field3801[var20 - 1][var21] = 2;
                    var28 = var28 + 1 & 0xFFF;
                    class384.field6161[var20 - 1][var21] = var25;
                }
                if (var20 < 126 && class246.field3801[var20 + 1][var21] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                    class116.field1698[var28] = var11 + 1;
                    class62.field849[var28] = var12;
                    var28 = var28 + 1 & 0xFFF;
                    class246.field3801[var20 + 1][var21] = 8;
                    class384.field6161[var20 + 1][var21] = var25;
                }
                if (var21 > 0 && class246.field3801[var20][var21 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                    class116.field1698[var28] = var11;
                    class62.field849[var28] = var12 - 1;
                    var28 = var28 + 1 & 0xFFF;
                    class246.field3801[var20][var21 - 1] = 1;
                    class384.field6161[var20][var21 - 1] = var25;
                }
                if (var21 < 126 && class246.field3801[var20][var21 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                    class116.field1698[var28] = var11;
                    class62.field849[var28] = var12 + 1;
                    class246.field3801[var20][var21 + 1] = 4;
                    var28 = var28 + 1 & 0xFFF;
                    class384.field6161[var20][var21 + 1] = var25;
                }
                if (var20 > 0 && var21 > 0 && class246.field3801[var20 - 1][var21 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                    class116.field1698[var28] = var11 - 1;
                    class62.field849[var28] = var12 - 1;
                    var28 = var28 + 1 & 0xFFF;
                    class246.field3801[var20 - 1][var21 - 1] = 3;
                    class384.field6161[var20 - 1][var21 - 1] = var25;
                }
                if (var20 < 126 && var21 > 0 && class246.field3801[var20 + 1][var21 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                    class116.field1698[var28] = var11 + 1;
                    class62.field849[var28] = var12 - 1;
                    var28 = var28 + 1 & 0xFFF;
                    class246.field3801[var20 + 1][var21 - 1] = 9;
                    class384.field6161[var20 + 1][var21 - 1] = var25;
                }
                if (var20 > 0 && var21 < 126 && class246.field3801[var20 - 1][var21 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                    class116.field1698[var28] = var11 - 1;
                    class62.field849[var28] = var12 + 1;
                    var28 = var28 + 1 & 0xFFF;
                    class246.field3801[var20 - 1][var21 + 1] = 6;
                    class384.field6161[var20 - 1][var21 + 1] = var25;
                }
                if (var20 < 126 && var21 < 126 && class246.field3801[var20 + 1][var21 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                    class116.field1698[var28] = var11 + 1;
                    class62.field849[var28] = var12 + 1;
                    var28 = var28 + 1 & 0xFFF;
                    class246.field3801[var20 + 1][var21 + 1] = 12;
                    class384.field6161[var20 + 1][var21 + 1] = var25;
                }
            }
            class100.field1462 = var11;
            class360.field5812 = var12;
            return false;
        } catch (RuntimeException var27) {
            throw class590.method4333(var27, field5[0] + arg0 + ',' + (arg1 == null ? field5[2] : field5[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(B)V", line = 359)
    public static final void method2(byte arg0) throws class146 {
        try {
            if (class184.field2931 == 1) {
                class761.field11182.method171(class776.field11329, class633.field9093);
            } else {
                class761.field11182.method171(0, 0);
            }
            field3++;
            if (arg0 != -92) {
                method3(null, 10, null);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lpj;I[[B)V", line = 379)
    public static final void method3(class154 arg0, int arg1, byte[][] arg2) {
        try {
            field1++;
            int[] var3 = new int[] { -1, 0, 0, 0, 0 };
            for (int var4 = 0; var4 < arg0.field10717; var4++) {
                class672.method4864(108);
                for (int var5 = 0; var5 < (class126.field1823 >> 3); var5++) {
                    for (int var6 = 0; var6 < class169.field2725 >> 3; var6++) {
                        int var7 = class734.field10759[var4][var5][var6];
                        if (var7 != -1) {
                            int var8 = (var7 & 0x30E4D74) >> 24;
                            if (!arg0.field10721 || var8 == 0) {
                                int var9 = (var7 & 0x6) >> 1;
                                int var10 = var7 >> 14 & 0x3FF;
                                int var11 = (var7 & 0x3FFB) >> 3;
                                int var12 = (var10 / 8 << 8) + var11 / 8;
                                for (int var13 = 0; var13 < class543.field7995.length; var13++) {
                                    if (class543.field7995[var13] == var12 && arg2[var13] != null) {
                                        class176 var14 = new class176(arg2[var13]);
                                        arg0.method5315(var6 * 8, var9, var11, var14, var5 * 8, var8, var10, true, var4, class297.field4841);
                                        arg0.method1391(-106, var10, var9, var8, var11, var5 * 8, var14, var3[0] == -1 ? var3 : null, var4, var6 * 8, class662.field9437);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            for (int var15 = 0; var15 < arg0.field10717; var15++) {
                class672.method4864(106);
                for (int var16 = 0; var16 < (class126.field1823 >> 3); var16++) {
                    for (int var17 = 0; var17 < (class169.field2725 >> 3); var17++) {
                        int var18 = class734.field10759[var15][var16][var17];
                        if (var18 == -1) {
                            arg0.method5309(var16 * 8, var17 * 8, var15, 8, (byte) 59, 8);
                        }
                    }
                }
            }
            if (arg1 <= 50) {
                field4 = 105;
            }
            if (var3[0] != -1) {
                class641.field9192 = class716.field10360.method4314(var3[0], class653.field9349, -17494, var3[1], var3[2], var3[3]);
                class652.field9338 = var3[4];
            }
        } catch (RuntimeException var20) {
            throw class590.method4333(var20, field5[3] + (arg0 == null ? field5[2] : field5[1]) + ',' + arg1 + ',' + (arg2 == null ? field5[2] : field5[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!us", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!us", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 63;
                    break;
                case 1:
                    var10005 = 89;
                    break;
                case 2:
                    var10005 = 55;
                    break;
                case 3:
                    var10005 = 80;
                    break;
                default:
                    var10005 = 95;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
