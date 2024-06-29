import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class685 {

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9608 = new String[] { method4906(method4905("8+A!T")), method4906(method4905("7?\u0003\t")), method4906(method4905("\"dAK\u0001")) };

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field9607;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIILaa;Lha;IILvo;I)V")
    public static final void method4904(int arg0, int arg1, int arg2, class685 arg3, class18 arg4, int arg5, int arg6, class782 arg7, int arg8) {
        try {
            field9607++;
            class475 var9 = class319.field4356.method2508(arg1, false);
            if (arg5 == 2 && var9 != null && var9.field6961 && var9.method3672((byte) -109, class734.field10459)) {
                if (var9.field6984 != null) {
                    int[] var10 = new int[var9.field6984.length];
                    for (int var11 = 0; var11 < (var10.length / 2); var11++) {
                        int var12;
                        if (class596.field8579 == 4) {
                            var12 = (int) class349.field5057 & 0x3FFF;
                        } else {
                            var12 = (int) class349.field5057 + class801.field11658 & 0x3FFF;
                        }
                        int var13 = class487.field7151[var12];
                        int var14 = class487.field7150[var12];
                        if (class596.field8579 != 4) {
                            var13 = var13 * 256 / (class398.field5794 + 256);
                            var14 = var14 * 256 / (class398.field5794 + 256);
                        }
                        var10[var11 * 2] = arg7.field11295 / 2 + (arg6 + ((var9.field6984[var11 * 2 + 1] * 4 + arg2) * var13 + ((arg8 + (var9.field6984[var11 * 2] * 4)) * var14) >> 14));
                        var10[var11 * 2 + 1] = arg0 + (arg7.field11244 / 2) - ((arg2 + (var9.field6984[var11 * 2 + 1] * 4)) * var14 - ((var9.field6984[var11 * 2] * 4 + arg8) * var13) >> 14);
                    }
                    class512.method3912(arg4, var10, var9.field6991, arg7.field11137, arg7.field11208);
                    if (var9.field6974 <= 0) {
                        for (int var15 = 0; var15 < var10.length / 2 - 1; var15++) {
                            arg4.method185(var10[var15 * 2], var10[var15 * 2 + 1], var10[(var15 + 1) * 2], var10[var15 * 2 + 2 + 1], var9.field6965[var9.field6993[var15] & 0xFF], 1, arg3, arg6, arg0);
                        }
                        arg4.method185(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field6965[var9.field6993[var9.field6993.length - 1] & 0xFF], 1, arg3, arg6, arg0);
                    } else {
                        for (int var16 = 0; var16 < (var10.length / 2 - 1); var16++) {
                            int var17 = var10[var16 * 2];
                            int var18 = var10[var16 * 2 + 1];
                            int var19 = var10[var16 * 2 + 2];
                            int var20 = var10[(var16 + 1) * 2 + 1];
                            if (var19 < var17) {
                                int var22 = var17;
                                int var23 = var18;
                                var17 = var19;
                                var19 = var22;
                                var18 = var20;
                                var20 = var23;
                            } else if (var17 == var19 && var18 > var20) {
                                int var21 = var18;
                                var18 = var20;
                                var20 = var21;
                            }
                            arg4.method128(var17, var18, var19, var20, var9.field6965[var9.field6993[var16] & 0xFF], 1, arg3, arg6, arg0, var9.field6974, var9.field6986, var9.field6997);
                        }
                        int var24 = var10[var10.length - 2];
                        int var25 = var10[var10.length - 1];
                        int var26 = var10[0];
                        int var27 = var10[1];
                        if (var26 < var24) {
                            int var28 = var24;
                            var24 = var26;
                            int var29 = var25;
                            var26 = var28;
                            var25 = var27;
                            var27 = var29;
                        } else if (var24 == var26 && var27 < var25) {
                            int var30 = var25;
                            var25 = var27;
                            var27 = var30;
                        }
                        arg4.method128(var24, var25, var26, var27, var9.field6965[var9.field6993[var9.field6993.length - 1] & 0xFF], 1, arg3, arg6, arg0, var9.field6974, var9.field6986, var9.field6997);
                    }
                }
                class392 var31 = null;
                if (var9.field6985 != -1) {
                    var31 = var9.method3669((byte) -121, false, arg4);
                    if (var31 != null) {
                        class620.method4560(arg3, arg7, var31, 16383, arg0, arg8, arg6, arg2);
                    }
                }
                if (var9.field6998 != null) {
                    int var32 = 0;
                    if (var31 != null) {
                        var32 = var31.method1377();
                    }
                    class216 var33 = class626.field8945;
                    class161 var34 = class17.field218;
                    if (var9.field6996 == 1) {
                        var34 = class84.field1185;
                        var33 = class23.field279;
                    }
                    if (var9.field6996 == 2) {
                        var33 = class200.field2954;
                        var34 = class520.field7584;
                    }
                    class70.method734(arg3, arg8, var32, arg6, var34, var9.field6982, true, var9.field6998, arg2, arg0, arg7, var33);
                    return;
                }
            }
        } catch (RuntimeException var36) {
            throw class665.method4799(var36, field9608[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field9608[1] : field9608[2]) + ',' + (arg4 == null ? field9608[1] : field9608[2]) + ',' + arg5 + ',' + arg6 + ',' + (arg7 == null ? field9608[1] : field9608[2]) + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4905(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4906(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 89;
                    break;
                case 1:
                    var10005 = 74;
                    break;
                case 2:
                    var10005 = 111;
                    break;
                case 3:
                    var10005 = 101;
                    break;
                default:
                    var10005 = 124;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
