import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class8 {

    @OriginalMember(owner = "client!mn", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field103 = new String[] { method61(method60("\u0018\u001aWp")), method61(method60("\rA\u00152z")), method61(method60("\u001b\u0001\u0015_/")), method61(method60("\u001b\u0001\u0015]/")), method61(method60("\u001b\u0001\u0015X/")), method61(method60("\u001b\u0001\u0015^/")), method61(method60("\u0019\u001f^rm\u0005")) };

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "[I")
    public static int[] field98 = new int[32];

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "Lop;")
    public static class574 field100 = new class574("", 19);

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIII)I", line = 4)
    public static final int method56(int arg0, int arg1, int arg2, int arg3) {
        try {
            field101++;
            int var4 = arg2 / arg1;
            int var5 = arg1 - 1 & arg2;
            int var6 = arg0 / arg1;
            int var7 = arg0 & arg1 - 1;
            int var8 = class351.method2803(var4, var6, (byte) -78);
            int var9 = class351.method2803(var4 + 1, var6, (byte) -78);
            int var10 = class351.method2803(var4, var6 + 1, (byte) -78);
            int var11 = class351.method2803(arg3 + var4, var6 - -1, (byte) -78);
            int var12 = class41.method466(var8, var5, arg1, var9, (byte) 34);
            int var13 = class41.method466(var10, var5, arg1, var11, (byte) 34);
            return class41.method466(var12, var7, arg1, var13, (byte) 34);
        } catch (RuntimeException var15) {
            throw class665.method4799(var15, field103[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Ljava/lang/String;ZZLft;Z)V", line = 35)
    public static final void method57(String arg0, boolean arg1, boolean arg2, class188 arg3, boolean arg4) {
        try {
            field102++;
            class12.method81(arg3, arg1, field103[6], -117, arg4, arg0);
            if (!arg2) {
                method56(-57, -72, 95, 76);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field103[5] + (arg0 == null ? field103[0] : field103[1]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field103[0] : field103[1]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IBILiga;Lha;Luja;)Z", line = 51)
    public static final boolean method58(int arg0, byte arg1, int arg2, class353 arg3, class18 arg4, class475 arg5) {
        try {
            field99++;
            int var6 = Integer.MAX_VALUE;
            int var7 = Integer.MIN_VALUE;
            int var8 = Integer.MAX_VALUE;
            int var9 = Integer.MIN_VALUE;
            if (arg5.field6984 != null) {
                var7 = (arg3.field5110 + arg5.field6994 - class534.field7753) * (class534.field7742 - class534.field7758) / (class534.field7743 - class534.field7753) + class534.field7758;
                var9 = class534.field7755 - ((arg5.field7009 - (class534.field7746 - arg3.field5117)) * (class534.field7755 - class534.field7750) / (class534.field7744 - class534.field7746));
                var6 = (arg3.field5110 + arg5.field6967 - class534.field7753) * (class534.field7742 - class534.field7758) / (class534.field7743 - class534.field7753) + class534.field7758;
                var8 = class534.field7755 - ((arg5.field6995 + arg3.field5117 - class534.field7746) * (class534.field7755 - class534.field7750) / (class534.field7744 - class534.field7746));
            }
            class392 var10 = null;
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            int var14 = 0;
            if (arg5.field6985 != -1) {
                if (arg3.field5111 && arg5.field6959 != -1) {
                    var10 = arg5.method3669((byte) -42, true, arg4);
                } else {
                    var10 = arg5.method3669((byte) -16, false, arg4);
                }
                if (var10 != null) {
                    var11 = arg3.field5115 - (var10.method1378() + 1 >> 1);
                    if (var6 > var11) {
                        var6 = var11;
                    }
                    var12 = arg3.field5115 + (var10.method1378() + 1 >> 1);
                    if (var12 > var7) {
                        var7 = var12;
                    }
                    var13 = arg3.field5118 - (var10.method1380() + 1 >> 1);
                    if (var13 < var8) {
                        var8 = var13;
                    }
                    var14 = arg3.field5118 + (var10.method1380() + 1 >> 1);
                    if (var14 > var9) {
                        var9 = var14;
                    }
                }
            }
            class484 var15 = null;
            int var16 = 0;
            int var17 = 0;
            int var18 = 0;
            int var19 = 0;
            int var20 = 0;
            int var21 = 0;
            int var22 = 0;
            if (arg1 >= -77) {
                field100 = null;
            }
            int var23 = 0;
            if (arg5.field6998 != null) {
                var15 = class26.method303(arg5.field6996, -1);
                if (var15 != null) {
                    var16 = class17.field218.method1356(null, null, false, arg5.field6998, class583.field8417);
                    int var24 = arg3.field5118 - ((class534.field7755 - class534.field7750) * arg5.field6958 / (class534.field7744 - class534.field7746));
                    var17 = arg3.field5115 + ((class534.field7742 - class534.field7758) * arg5.field6987 / (class534.field7743 - class534.field7753));
                    if (var10 == null) {
                        var18 = var24 - var16 * var15.method3737() / 2;
                    } else {
                        var18 = var24 - ((var10.method1380() >> 1) + (var16 * var15.method3736()));
                    }
                    for (int var25 = 0; var25 < var16; var25++) {
                        String var26 = class583.field8417[var25];
                        if (var25 < (var16 - 1)) {
                            var26 = var26.substring(0, var26.length() - 4);
                        }
                        int var27 = var15.method3733(var26);
                        if (var27 > var19) {
                            var19 = var27;
                        }
                    }
                    var20 = arg2 + var17 - (var19 / 2);
                    if (var20 < var6) {
                        var6 = var20;
                    }
                    var21 = var17 - (-(var19 / 2) - arg2);
                    if (var7 < var21) {
                        var7 = var21;
                    }
                    var22 = arg0 + var18;
                    if (var8 > var22) {
                        var8 = var22;
                    }
                    var23 = arg0 + (var18 + (var15.method3736() * var16));
                    if (var23 > var9) {
                        var9 = var23;
                    }
                }
            }
            if (var7 < class534.field7758 || var6 > class534.field7742 || var9 < class534.field7750 || class534.field7755 < var8) {
                return true;
            }
            class534.method4056(arg4, arg3, arg5);
            if (var10 != null) {
                if (class147.field1894 > 0 && (class230.field3330 != -1 && class230.field3330 == arg3.field5108 || class570.field8272 != -1 && class570.field8272 == arg5.field7003)) {
                    int var28;
                    if (class426.field6140 <= 50) {
                        var28 = class426.field6140 * 2;
                    } else {
                        var28 = 200 - (class426.field6140 * 2);
                    }
                    int var29 = var28 << 24 | 0xFFFF00;
                    arg4.method147(var10.method1376() / 2 + 7, arg3.field5115, arg3.field5118, 1, var29);
                    arg4.method147(var10.method1376() / 2 + 5, arg3.field5115, arg3.field5118, 1, var29);
                    arg4.method147(var10.method1376() / 2 + 3, arg3.field5115, arg3.field5118, 1, var29);
                    arg4.method147(var10.method1376() / 2 + 1, arg3.field5115, arg3.field5118, 1, var29);
                    arg4.method147(var10.method1376() / 2, arg3.field5115, arg3.field5118, 1, var29);
                }
                var10.method3074(arg3.field5115 - (var10.method1378() >> 1), arg3.field5118 + -(var10.method1380() >> 1));
            }
            if (arg5.field6998 != null && var15 != null) {
                class129.method1138(arg3, arg5, arg4, 93, var19, var15, var16, var17, var18);
            }
            if (arg5.field6985 != -1 || arg5.field6998 != null) {
                class478 var30 = new class478(arg3);
                var30.field7057 = var21;
                var30.field7056 = var11;
                var30.field7055 = var23;
                var30.field7050 = var13;
                var30.field7051 = var22;
                var30.field7059 = var14;
                var30.field7049 = var20;
                var30.field7053 = var12;
                class304.field4238.method3984(var30, 0);
            }
            return false;
        } catch (RuntimeException var32) {
            throw class665.method4799(var32, field103[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field103[0] : field103[1]) + ',' + (arg4 == null ? field103[0] : field103[1]) + ',' + (arg5 == null ? field103[0] : field103[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)V", line = 242)
    public static void method59(boolean arg0) {
        try {
            if (!arg0) {
                field100 = null;
            }
            field100 = null;
            field98 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field103[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mn", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method60(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mn", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method61(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 118;
                    break;
                case 1:
                    var10005 = 111;
                    break;
                case 2:
                    var10005 = 59;
                    break;
                case 3:
                    var10005 = 28;
                    break;
                default:
                    var10005 = 7;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
