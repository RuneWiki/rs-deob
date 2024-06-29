import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class670 {

    @OriginalMember(owner = "client!pw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9446 = new String[] { method4827(method4826("zLt[\\")), method4827(method4826("dN6v")), method4827(method4826("q\u0015t4\t")) };

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "I")
    public static int field9445 = -1;

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "I")
    public static int field9442;

    @OriginalMember(owner = "client!pw", name = "d", descriptor = "I")
    public static int field9443;

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "I")
    public static int field9444;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(IIIII[I[IIILuda;IZIII)I", line = 13)
    public static final int method4825(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6, int arg7, int arg8, class302 arg9, int arg10, boolean arg11, int arg12, int arg13, int arg14) {
        try {
            field9443++;
            for (int var15 = 0; var15 < 128; var15++) {
                for (int var16 = 0; var16 < 128; var16++) {
                    class393.field5717[var15][var16] = 0;
                    class481.field7084[var15][var16] = 99999999;
                }
            }
            boolean var17;
            if (arg1 == 1) {
                var17 = class351.method2807(arg3, arg0, arg10, arg4, arg7, arg12, arg2, arg14, 1, arg13, arg9);
            } else if (arg1 == 2) {
                var17 = class45.method487(arg14, arg9, -124, arg4, arg3, arg2, arg0, arg13, arg10, arg7, arg12);
            } else {
                var17 = class231.method1919(arg2, arg12, arg14, arg13, arg0, arg1, arg4, arg10, arg3, arg9, 127, arg7);
            }
            int var18 = arg3 - 64;
            int var19 = arg2 - 64;
            int var20 = class263.field3716;
            int var21 = class654.field9282;
            if (!var17) {
                if (!arg11) {
                    return -1;
                }
                int var22 = Integer.MAX_VALUE;
                int var23 = Integer.MAX_VALUE;
                byte var24 = 10;
                for (int var25 = arg4 - var24; var25 <= (arg4 + var24); var25++) {
                    for (int var26 = arg14 - var24; var26 <= (arg14 + var24); var26++) {
                        int var27 = var25 - var18;
                        int var28 = var26 - var19;
                        if (var27 >= 0 && var28 >= 0 && var27 < 128 && var28 < 128 && class481.field7084[var27][var28] < 100) {
                            int var29 = 0;
                            if (var25 < arg4) {
                                var29 = arg4 - var25;
                            } else if ((arg0 + arg4 - 1) < var25) {
                                var29 = var25 + 1 - arg0 - arg4;
                            }
                            int var30 = 0;
                            if (arg14 > var26) {
                                var30 = arg14 - var26;
                            } else if (arg13 + arg14 - 1 < var26) {
                                var30 = var26 + 1 - arg14 - arg13;
                            }
                            int var31 = var29 * var29 + (var30 * var30);
                            if (var31 < var22 || var22 == var31 && var23 > class481.field7084[var27][var28]) {
                                var21 = var26;
                                var22 = var31;
                                var23 = class481.field7084[var27][var28];
                                var20 = var25;
                            }
                        }
                    }
                }
                if (~var22 == Integer.MIN_VALUE) {
                    return -1;
                }
            }
            if (arg3 == var20 && arg2 == var21) {
                return 0;
            }
            byte var32 = 0;
            class796.field11576[var32] = var20;
            int var39 = var32 + 1;
            class356.field5171[var32] = var21;
            int var33;
            int var34 = var33 = class393.field5717[var20 - var18][var21 - var19];
            while (arg3 != var20 || var21 != arg2) {
                if (var34 != var33) {
                    var33 = var34;
                    class796.field11576[var39] = var20;
                    class356.field5171[var39++] = var21;
                }
                if ((var34 & 0x1) != 0) {
                    var21++;
                } else if ((var34 & 0x4) != 0) {
                    var21--;
                }
                if ((var34 & 0x2) != 0) {
                    var20++;
                } else if ((var34 & 0x8) != 0) {
                    var20--;
                }
                var34 = class393.field5717[var20 - var18][var21 - var19];
            }
            if (arg8 != 15705) {
                field9445 = 15;
            }
            int var35 = 0;
            while (var39-- > 0) {
                arg5[var35] = class796.field11576[var39];
                arg6[var35++] = class356.field5171[var39];
                if (arg5.length <= var35) {
                    break;
                }
            }
            return var35;
        } catch (RuntimeException var37) {
            throw class665.method4799(var37, field9446[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field9446[1] : field9446[2]) + ',' + (arg6 == null ? field9446[1] : field9446[2]) + ',' + arg7 + ',' + arg8 + ',' + (arg9 == null ? field9446[1] : field9446[2]) + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + arg14 + ')');
        }
    }

    @OriginalMember(owner = "client!pw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4826(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x74);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4827(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 10;
                    break;
                case 1:
                    var10005 = 59;
                    break;
                case 2:
                    var10005 = 90;
                    break;
                case 3:
                    var10005 = 26;
                    break;
                default:
                    var10005 = 116;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
