import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class709 {

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "I")
    private static int field9888 = 0;

    @OriginalMember(owner = "client!wv", name = "g", descriptor = "I")
    private static int field9893 = 0;

    @OriginalMember(owner = "client!wv", name = "m", descriptor = "[I")
    private static int[] field9899 = new int[5];

    @OriginalMember(owner = "client!wv", name = "k", descriptor = "[Ljava/lang/String;")
    private static String[] field9897 = new String[1000];

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "[Lsg;")
    private static class433[] field9889 = new class433[50];

    @OriginalMember(owner = "client!wv", name = "r", descriptor = "[I")
    private static int[] field9904 = new int[1000];

    @OriginalMember(owner = "client!wv", name = "l", descriptor = "[[I")
    private static int[][] field9898 = new int[5][5000];

    @OriginalMember(owner = "client!wv", name = "v", descriptor = "I")
    private static int field9908 = 0;

    @OriginalMember(owner = "client!wv", name = "q", descriptor = "Ljava/util/Calendar;")
    private static Calendar field9903 = Calendar.getInstance();

    @OriginalMember(owner = "client!wv", name = "z", descriptor = "[Ljava/lang/String;")
    private static String[] field9912 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!wv", name = "B", descriptor = "[I")
    private static int[] field9914 = new int[3];

    @OriginalMember(owner = "client!wv", name = "A", descriptor = "Lme;")
    public static class668 field9913 = new class668(4);

    @OriginalMember(owner = "client!wv", name = "C", descriptor = "I")
    private static int field9915 = 0;

    @OriginalMember(owner = "client!wv", name = "f", descriptor = "I")
    public static int field9892;

    @OriginalMember(owner = "client!wv", name = "h", descriptor = "I")
    public static int field9894;

    @OriginalMember(owner = "client!wv", name = "i", descriptor = "I")
    public static int field9895;

    @OriginalMember(owner = "client!wv", name = "j", descriptor = "I")
    public static int field9896;

    @OriginalMember(owner = "client!wv", name = "n", descriptor = "I")
    public static int field9900;

    @OriginalMember(owner = "client!wv", name = "o", descriptor = "I")
    public static int field9901;

    @OriginalMember(owner = "client!wv", name = "p", descriptor = "I")
    public static int field9902;

    @OriginalMember(owner = "client!wv", name = "t", descriptor = "I")
    public static int field9906;

    @OriginalMember(owner = "client!wv", name = "u", descriptor = "I")
    public static int field9907;

    @OriginalMember(owner = "client!wv", name = "x", descriptor = "I")
    public static int field9910;

    @OriginalMember(owner = "client!wv", name = "y", descriptor = "I")
    public static int field9911;

    @OriginalMember(owner = "client!wv", name = "w", descriptor = "Lrr;")
    private static class371 field9909;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "Ltc;")
    private static class477 field9887;

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "Ltc;")
    private static class477 field9891;

    @OriginalMember(owner = "client!wv", name = "s", descriptor = "[I")
    private static int[] field9905;

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "[Ljava/lang/String;")
    private static String[] field9890;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lnq;I)V")
    private static final void method3884(class155 arg0, int arg1) {
        Object[] var2 = arg0.field1962;
        int var3 = (Integer) var2[0];
        class705 var4 = class580.method3185((byte) -89, var3);
        if (var4 == null) {
            return;
        }
        field9905 = new int[var4.field9814];
        int var5 = 0;
        field9890 = new String[var4.field9818];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field1970;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field1969;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field1968 == null ? -1 : arg0.field1968.field6234;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field1958;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field1968 == null ? -1 : arg0.field1968.field6221;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field1967 == null ? -1 : arg0.field1967.field6234;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field1967 == null ? -1 : arg0.field1967.field6221;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field1959;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field1965;
                }
                field9905[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field1963;
                }
                field9890[var6++] = var9;
            }
        }
        field9915 = arg0.field1957;
        method3894(var4, arg1);
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lnq;)V")
    public static final void method3885(class155 arg0) {
        method3884(arg0, 200000);
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IZ)V")
    private static final void method3886(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field9888 -= 3;
                int var2 = field9904[field9888];
                int var3 = field9904[field9888 + 1];
                int var4 = field9904[field9888 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class477 var5 = class600.method3268(-99, var2);
                if (var5.field6258 == null) {
                    var5.field6258 = new class477[var4 + 1];
                }
                if (var5.field6258.length <= var4) {
                    class477[] var6 = new class477[var4 + 1];
                    for (int var7 = 0; var7 < var5.field6258.length; var7++) {
                        var6[var7] = var5.field6258[var7];
                    }
                    var5.field6258 = var6;
                }
                if (var4 > 0 && var5.field6258[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class477 var8 = new class477();
                var8.field6312 = var3;
                var8.field6292 = var8.field6234 = var5.field6234;
                var8.field6221 = var4;
                var5.field6258[var4] = var8;
                if (arg1) {
                    field9891 = var8;
                } else {
                    field9887 = var8;
                }
                class386.method2199(var5, false);
                return;
            }
            if (arg0 == 101) {
                class477 var9 = arg1 ? field9891 : field9887;
                if (var9.field6221 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class477 var10 = class600.method3268(-92, var9.field6234);
                var10.field6258[var9.field6221] = null;
                class386.method2199(var10, false);
                return;
            }
            if (arg0 == 102) {
                class477 var11 = class600.method3268(8, field9904[--field9888]);
                var11.field6258 = null;
                class386.method2199(var11, false);
                return;
            }
            if (arg0 == 200) {
                field9888 -= 2;
                int var12 = field9904[field9888];
                int var13 = field9904[field9888 + 1];
                class477 var14 = class386.method2203(var12, 0, var13);
                if (var14 != null && var13 != -1) {
                    field9904[field9888++] = 1;
                    if (arg1) {
                        field9891 = var14;
                        return;
                    }
                    field9887 = var14;
                    return;
                }
                field9904[field9888++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field9904[--field9888];
                class477 var16 = class600.method3268(5, var15);
                if (var16 != null) {
                    field9904[field9888++] = 1;
                    if (arg1) {
                        field9891 = var16;
                        return;
                    }
                    field9887 = var16;
                    return;
                }
                field9904[field9888++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field9904[--field9888];
                method3887(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field9904[--field9888];
                method3892(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field9888 -= 2;
                int var19 = field9904[field9888];
                int var20 = field9904[field9888 + 1];
                for (int var21 = 0; var21 < class637.field8869.length; var21++) {
                    if (class637.field8869[var21] == var19) {
                        class233.field3130.field2469.method1350(Integer.MIN_VALUE, var20, var21, class120.field1550);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class701.field9794.length; var22++) {
                    if (class701.field9794[var22] == var19) {
                        class233.field3130.field2469.method1350(Integer.MIN_VALUE, var20, var22, class120.field1550);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field9888 -= 2;
                int var23 = field9904[field9888];
                int var24 = field9904[field9888 + 1];
                class233.field3130.field2469.method1345((byte) 59, var23, var24);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field9904[--field9888] != 0;
                class233.field3130.field2469.method1352((byte) -13, var25);
                return;
            }
            if (arg0 == 411) {
                field9888 -= 2;
                int var26 = field9904[field9888];
                int var27 = field9904[field9888 + 1];
                class233.field3130.field2469.method1351(var27, var26, class232.field3109, 1073741824);
                return;
            }
        } else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
            class477 var28;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var28 = class600.method3268(115, field9904[--field9888]);
            } else {
                var28 = arg1 ? field9891 : field9887;
            }
            if (arg0 == 1000) {
                field9888 -= 4;
                var28.field6238 = field9904[field9888];
                var28.field6349 = field9904[field9888 + 1];
                int var29 = field9904[field9888 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 5) {
                    var29 = 5;
                }
                int var30 = field9904[field9888 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 5) {
                    var30 = 5;
                }
                var28.field6243 = (byte) var29;
                var28.field6288 = (byte) var30;
                class386.method2199(var28, false);
                class175.method1184(var28, (byte) 44);
                if (var28.field6221 == -1) {
                    class218.method1395(11, var28.field6234);
                }
                return;
            }
            if (arg0 == 1001) {
                field9888 -= 4;
                var28.field6297 = field9904[field9888];
                var28.field6227 = field9904[field9888 + 1];
                var28.field6291 = 0;
                var28.field6365 = 0;
                int var31 = field9904[field9888 + 2];
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 4) {
                    var31 = 4;
                }
                int var32 = field9904[field9888 + 3];
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 4) {
                    var32 = 4;
                }
                var28.field6376 = (byte) var31;
                var28.field6274 = (byte) var32;
                class386.method2199(var28, false);
                class175.method1184(var28, (byte) 59);
                if (var28.field6312 == 0) {
                    class133.method965(1900077296, false, var28);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var33 = field9904[--field9888] == 1;
                if (var28.field6340 != var33) {
                    var28.field6340 = var33;
                    class386.method2199(var28, false);
                }
                if (var28.field6221 == -1) {
                    class116.method868((byte) 109, var28.field6234);
                }
                return;
            }
            if (arg0 == 1004) {
                field9888 -= 2;
                var28.field6219 = field9904[field9888];
                var28.field6229 = field9904[field9888 + 1];
                class386.method2199(var28, false);
                class175.method1184(var28, (byte) 77);
                if (var28.field6312 == 0) {
                    class133.method965(1900077296, false, var28);
                }
                return;
            }
            if (arg0 == 1005) {
                var28.field6228 = field9904[--field9888] == 1;
                return;
            }
        } else if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
            class477 var34;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var34 = class600.method3268(108, field9904[--field9888]);
            } else {
                var34 = arg1 ? field9891 : field9887;
            }
            if (arg0 == 1100) {
                field9888 -= 2;
                var34.field6317 = field9904[field9888];
                if (var34.field6317 > var34.field6225 - var34.field6372) {
                    var34.field6317 = var34.field6225 - var34.field6372;
                }
                if (var34.field6317 < 0) {
                    var34.field6317 = 0;
                }
                var34.field6356 = field9904[field9888 + 1];
                if (var34.field6356 > var34.field6252 - var34.field6224) {
                    var34.field6356 = var34.field6252 - var34.field6224;
                }
                if (var34.field6356 < 0) {
                    var34.field6356 = 0;
                }
                class386.method2199(var34, false);
                if (var34.field6221 == -1) {
                    class368.method2119(var34.field6234, 100);
                }
                return;
            }
            if (arg0 == 1101) {
                var34.field6302 = field9904[--field9888];
                class386.method2199(var34, false);
                if (var34.field6221 == -1) {
                    class325.method1879(var34.field6234, 6);
                }
                return;
            }
            if (arg0 == 1102) {
                var34.field6309 = field9904[--field9888] == 1;
                class386.method2199(var34, false);
                return;
            }
            if (arg0 == 1103) {
                var34.field6310 = field9904[--field9888];
                class386.method2199(var34, false);
                return;
            }
            if (arg0 == 1104) {
                var34.field6308 = field9904[--field9888];
                class386.method2199(var34, false);
                return;
            }
            if (arg0 == 1105) {
                int var35 = field9904[--field9888];
                if (var34.field6265 != var35) {
                    var34.field6265 = var35;
                    class386.method2199(var34, false);
                }
                if (var34.field6221 == -1) {
                    class229.method1440(var34.field6234, 14);
                }
                return;
            }
            if (arg0 == 1106) {
                var34.field6215 = field9904[--field9888];
                class386.method2199(var34, false);
                return;
            }
            if (arg0 == 1107) {
                var34.field6256 = field9904[--field9888] == 1;
                class386.method2199(var34, false);
                return;
            }
            if (arg0 == 1108) {
                var34.field6323 = 1;
                var34.field6325 = field9904[--field9888];
                class386.method2199(var34, false);
                if (var34.field6221 == -1) {
                    class39.method308(44, var34.field6234);
                }
                return;
            }
            if (arg0 == 1109) {
                field9888 -= 6;
                var34.field6253 = field9904[field9888];
                var34.field6271 = field9904[field9888 + 1];
                var34.field6283 = field9904[field9888 + 2];
                var34.field6342 = field9904[field9888 + 3];
                var34.field6277 = field9904[field9888 + 4];
                var34.field6216 = field9904[field9888 + 5];
                class386.method2199(var34, false);
                if (var34.field6221 == -1) {
                    class652.method3584((byte) -15, var34.field6234);
                    class357.method2052((byte) 88, var34.field6234);
                }
                return;
            }
            if (arg0 == 1110) {
                int var36 = field9904[--field9888];
                if (var34.field6272 != var36) {
                    var34.field6272 = var36;
                    var34.field6301 = 0;
                    var34.field6267 = 1;
                    var34.field6261 = 0;
                    class348 var37 = var34.field6272 == -1 ? null : class552.field7163.method3031(-117, var34.field6272);
                    if (var37 != null) {
                        class708.method3883(var37, var34.field6301, false);
                    }
                    class386.method2199(var34, false);
                }
                if (var34.field6221 == -1) {
                    class526.method2810(var34.field6234, 2);
                }
                return;
            }
            if (arg0 == 1111) {
                var34.field6334 = field9904[--field9888] == 1;
                class386.method2199(var34, false);
                return;
            }
            if (arg0 == 1112) {
                String var38 = field9897[--field9908];
                if (!var38.equals(var34.field6298)) {
                    var34.field6298 = var38;
                    class386.method2199(var34, false);
                }
                if (var34.field6221 == -1) {
                    class630.method3495((byte) 110, var34.field6234);
                }
                return;
            }
            if (arg0 == 1113) {
                var34.field6354 = field9904[--field9888];
                class386.method2199(var34, false);
                if (var34.field6221 == -1) {
                    class470.method2610(-8160, var34.field6234);
                }
                return;
            }
            if (arg0 == 1114) {
                field9888 -= 3;
                var34.field6248 = field9904[field9888];
                var34.field6247 = field9904[field9888 + 1];
                var34.field6352 = field9904[field9888 + 2];
                class386.method2199(var34, false);
                return;
            }
            if (arg0 == 1115) {
                var34.field6329 = field9904[--field9888] == 1;
                class386.method2199(var34, false);
                return;
            }
            if (arg0 == 1116) {
                var34.field6360 = field9904[--field9888];
                class386.method2199(var34, false);
                return;
            }
            if (arg0 == 1117) {
                var34.field6370 = field9904[--field9888];
                class386.method2199(var34, false);
                return;
            }
            if (arg0 == 1118) {
                var34.field6353 = field9904[--field9888] == 1;
                class386.method2199(var34, false);
                return;
            }
            if (arg0 == 1119) {
                var34.field6346 = field9904[--field9888] == 1;
                class386.method2199(var34, false);
                return;
            }
            if (arg0 == 1120) {
                field9888 -= 2;
                var34.field6225 = field9904[field9888];
                var34.field6252 = field9904[field9888 + 1];
                class386.method2199(var34, false);
                if (var34.field6312 == 0) {
                    class133.method965(1900077296, false, var34);
                }
                return;
            }
            if (arg0 == 1121) {
                field9888 -= 2;
                var34.field6257 = (short) field9904[field9888];
                var34.field6328 = (short) field9904[field9888 + 1];
                class386.method2199(var34, false);
                return;
            }
            if (arg0 == 1122) {
                var34.field6263 = field9904[--field9888] == 1;
                class386.method2199(var34, false);
                return;
            }
            if (arg0 == 1123) {
                var34.field6216 = field9904[--field9888];
                class386.method2199(var34, false);
                if (var34.field6221 == -1) {
                    class652.method3584((byte) -15, var34.field6234);
                }
                return;
            }
            if (arg0 == 1124) {
                int var39 = field9904[--field9888];
                var34.field6218 = var39 == 1;
                class386.method2199(var34, false);
                return;
            }
            if (arg0 == 1125) {
                field9888 -= 2;
                var34.field6270 = field9904[field9888];
                var34.field6367 = field9904[field9888 + 1];
                class386.method2199(var34, false);
                return;
            }
            if (arg0 == 1126) {
                var34.field6284 = field9904[--field9888];
                class386.method2199(var34, false);
                return;
            }
            if (arg0 == 1127) {
                field9888 -= 2;
                int var40 = field9904[field9888];
                int var41 = field9904[field9888 + 1];
                class428 var42 = class191.field2445.method1075((byte) -65, var40);
                if (var42.field5546 != var41) {
                    var34.method2643(var40, var41, false);
                    return;
                }
                var34.method2632(13930, var40);
                return;
            }
            if (arg0 == 1128) {
                int var43 = field9904[--field9888];
                String var44 = field9897[--field9908];
                class428 var45 = class191.field2445.method1075((byte) -65, var43);
                if (!var45.field5541.equals(var44)) {
                    var34.method2637(var43, (byte) 102, var44);
                    return;
                }
                var34.method2632(13930, var43);
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class477 var46;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var46 = class600.method3268(115, field9904[--field9888]);
            } else {
                var46 = arg1 ? field9891 : field9887;
            }
            class386.method2199(var46, false);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field9888 -= 2;
                int var47 = field9904[field9888];
                int var48 = field9904[field9888 + 1];
                if (var46.field6221 == -1) {
                    class295.method1748(-125, var46.field6234);
                    class652.method3584((byte) -15, var46.field6234);
                    class357.method2052((byte) 88, var46.field6234);
                }
                if (var47 == -1) {
                    var46.field6323 = 1;
                    var46.field6325 = -1;
                    var46.field6321 = -1;
                    return;
                }
                var46.field6321 = var47;
                var46.field6237 = var48;
                if (arg0 == 1208 || arg0 == 1209) {
                    var46.field6242 = true;
                } else {
                    var46.field6242 = false;
                }
                class696 var49 = class232.field3109.method1292(0, var47);
                var46.field6283 = var49.field9504;
                var46.field6342 = var49.field9551;
                var46.field6277 = var49.field9518;
                var46.field6253 = var49.field9572;
                var46.field6271 = var49.field9526;
                var46.field6216 = var49.field9524;
                if (arg0 == 1205 || arg0 == 1209) {
                    var46.field6239 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var46.field6239 = 1;
                } else {
                    var46.field6239 = 2;
                }
                if (var46.field6291 > 0) {
                    var46.field6216 = var46.field6216 * 32 / var46.field6291;
                    return;
                }
                if (var46.field6297 > 0) {
                    var46.field6216 = var46.field6216 * 32 / var46.field6297;
                }
                return;
            }
            if (arg0 == 1201) {
                var46.field6323 = 2;
                var46.field6325 = field9904[--field9888];
                if (var46.field6221 == -1) {
                    class39.method308(118, var46.field6234);
                }
                return;
            }
            if (arg0 == 1202) {
                var46.field6323 = 3;
                var46.field6325 = -1;
                if (var46.field6221 == -1) {
                    class39.method308(18, var46.field6234);
                }
                return;
            }
            if (arg0 == 1203) {
                var46.field6323 = 6;
                var46.field6325 = field9904[--field9888];
                if (var46.field6221 == -1) {
                    class39.method308(111, var46.field6234);
                }
                return;
            }
            if (arg0 == 1204) {
                var46.field6323 = 5;
                var46.field6325 = field9904[--field9888];
                if (var46.field6221 == -1) {
                    class39.method308(102, var46.field6234);
                }
                return;
            }
            if (arg0 == 1206) {
                field9888 -= 4;
                var46.field6255 = field9904[field9888];
                var46.field6316 = field9904[field9888 + 1];
                var46.field6233 = field9904[field9888 + 2];
                var46.field6259 = field9904[field9888 + 3];
                class386.method2199(var46, false);
                return;
            }
            if (arg0 == 1207) {
                field9888 -= 2;
                var46.field6364 = field9904[field9888];
                var46.field6251 = field9904[field9888 + 1];
                class386.method2199(var46, false);
                return;
            }
            if (arg0 == 1210) {
                field9888 -= 4;
                var46.field6325 = field9904[field9888];
                var46.field6278 = field9904[field9888 + 1];
                if (field9904[field9888 + 2] == 1) {
                    var46.field6323 = 9;
                } else {
                    var46.field6323 = 8;
                }
                if (field9904[field9888 + 3] == 1) {
                    var46.field6242 = true;
                } else {
                    var46.field6242 = false;
                }
                if (var46.field6221 == -1) {
                    class39.method308(116, var46.field6234);
                }
                return;
            }
            if (arg0 == 1211) {
                var46.field6323 = 5;
                var46.field6325 = class353.field4536;
                var46.field6278 = 0;
                if (var46.field6221 == -1) {
                    class39.method308(82, var46.field6234);
                }
                return;
            }
        } else if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
            class477 var50;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var50 = class600.method3268(-62, field9904[--field9888]);
            } else {
                var50 = arg1 ? field9891 : field9887;
            }
            if (arg0 == 1300) {
                int var51 = field9904[--field9888] - 1;
                if (var51 >= 0 && var51 <= 9) {
                    var50.method2645((byte) -38, var51, field9897[--field9908]);
                    return;
                }
                field9908--;
                return;
            }
            if (arg0 == 1301) {
                field9888 -= 2;
                int var52 = field9904[field9888];
                int var53 = field9904[field9888 + 1];
                if (var52 == -1 && var53 == -1) {
                    var50.field6230 = null;
                    return;
                }
                var50.field6230 = class386.method2203(var52, 0, var53);
                return;
            }
            if (arg0 == 1302) {
                int var54 = field9904[--field9888];
                if (class240.field3245 != var54 && class467.field6104 != var54 && class15.field168 != var54) {
                    return;
                }
                var50.field6295 = var54;
                return;
            }
            if (arg0 == 1303) {
                var50.field6355 = field9904[--field9888];
                return;
            }
            if (arg0 == 1304) {
                var50.field6250 = field9904[--field9888];
                return;
            }
            if (arg0 == 1305) {
                var50.field6315 = field9897[--field9908];
                return;
            }
            if (arg0 == 1306) {
                var50.field6361 = field9897[--field9908];
                return;
            }
            if (arg0 == 1307) {
                var50.field6220 = null;
                return;
            }
            if (arg0 == 1308) {
                var50.field6273 = field9904[--field9888];
                var50.field6379 = field9904[--field9888];
                return;
            }
            if (arg0 == 1309) {
                int var55 = field9904[--field9888];
                int var56 = field9904[--field9888];
                if (var56 >= 1 && var56 <= 10) {
                    var50.method2633((byte) -108, var55, var56 - 1);
                }
                return;
            }
            if (arg0 == 1310) {
                var50.field6275 = field9897[--field9908];
                return;
            }
            if (arg0 == 1311) {
                var50.field6276 = field9904[--field9888];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var57;
                int var58;
                int var59;
                if (arg0 == 1312) {
                    field9888 -= 3;
                    var57 = field9904[field9888] - 1;
                    var58 = field9904[field9888 + 1];
                    var59 = field9904[field9888 + 2];
                    if (var57 < 0 || var57 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field9888 -= 2;
                    var57 = 10;
                    var58 = field9904[field9888];
                    var59 = field9904[field9888 + 1];
                }
                if (var50.field6282 == null) {
                    if (var58 == 0) {
                        return;
                    }
                    var50.field6282 = new byte[11];
                    var50.field6337 = new byte[11];
                    var50.field6294 = new int[11];
                }
                var50.field6282[var57] = (byte) var58;
                if (var58 == 0) {
                    var50.field6240 = false;
                    for (int var60 = 0; var60 < var50.field6282.length; var60++) {
                        if (var50.field6282[var60] != 0) {
                            var50.field6240 = true;
                            break;
                        }
                    }
                } else {
                    var50.field6240 = true;
                }
                var50.field6337[var57] = (byte) var59;
                return;
            }
            if (arg0 == 1314) {
                var50.field6231 = field9904[--field9888];
                return;
            }
        } else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
            class477 var61;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var61 = class600.method3268(-76, field9904[--field9888]);
            } else {
                var61 = arg1 ? field9891 : field9887;
            }
            if (arg0 == 1499) {
                var61.method2640((byte) 33);
                return;
            }
            String var62 = field9897[--field9908];
            int[] var63 = null;
            if (var62.length() > 0 && var62.charAt(var62.length() - 1) == 'Y') {
                int var64 = field9904[--field9888];
                if (var64 > 0) {
                    var63 = new int[var64];
                    while (var64-- > 0) {
                        var63[var64] = field9904[--field9888];
                    }
                }
                var62 = var62.substring(0, var62.length() - 1);
            }
            Object[] var65 = new Object[var62.length() + 1];
            for (int var66 = var65.length - 1; var66 >= 1; var66--) {
                if (var62.charAt(var66 - 1) == 's') {
                    var65[var66] = field9897[--field9908];
                } else {
                    var65[var66] = Integer.valueOf(field9904[--field9888]);
                }
            }
            int var67 = field9904[--field9888];
            if (var67 == -1) {
                var65 = null;
            } else {
                var65[0] = Integer.valueOf(var67);
            }
            if (arg0 == 1400) {
                var61.field6366 = var65;
            } else if (arg0 == 1401) {
                var61.field6289 = var65;
            } else if (arg0 == 1402) {
                var61.field6382 = var65;
            } else if (arg0 == 1403) {
                var61.field6305 = var65;
            } else if (arg0 == 1404) {
                var61.field6357 = var65;
            } else if (arg0 == 1405) {
                var61.field6348 = var65;
            } else if (arg0 == 1406) {
                var61.field6338 = var65;
            } else if (arg0 == 1407) {
                var61.field6226 = var65;
                var61.field6347 = var63;
            } else if (arg0 == 1408) {
                var61.field6293 = var65;
            } else if (arg0 == 1409) {
                var61.field6268 = var65;
            } else if (arg0 == 1410) {
                var61.field6343 = var65;
            } else if (arg0 == 1411) {
                var61.field6341 = var65;
            } else if (arg0 == 1412) {
                var61.field6279 = var65;
            } else if (arg0 == 1414) {
                var61.field6320 = var65;
                var61.field6369 = var63;
            } else if (arg0 == 1415) {
                var61.field6222 = var65;
                var61.field6260 = var63;
            } else if (arg0 == 1416) {
                var61.field6345 = var65;
            } else if (arg0 == 1417) {
                var61.field6350 = var65;
            } else if (arg0 == 1418) {
                var61.field6223 = var65;
            } else if (arg0 == 1419) {
                var61.field6241 = var65;
            } else if (arg0 == 1420) {
                var61.field6374 = var65;
            } else if (arg0 == 1421) {
                var61.field6245 = var65;
            } else if (arg0 == 1422) {
                var61.field6269 = var65;
            } else if (arg0 == 1423) {
                var61.field6363 = var65;
            } else if (arg0 == 1424) {
                var61.field6254 = var65;
            } else if (arg0 == 1425) {
                var61.field6375 = var65;
            } else if (arg0 == 1426) {
                var61.field6318 = var65;
            } else if (arg0 == 1427) {
                var61.field6331 = var65;
            } else if (arg0 == 1428) {
                var61.field6264 = var65;
                var61.field6358 = var63;
            } else if (arg0 == 1429) {
                var61.field6249 = var65;
                var61.field6306 = var63;
            } else if (arg0 == 1430) {
                var61.field6280 = var65;
            }
            var61.field6287 = true;
            return;
        } else if (arg0 < 1600) {
            class477 var68 = arg1 ? field9891 : field9887;
            if (arg0 == 1500) {
                field9904[field9888++] = var68.field6286;
                return;
            }
            if (arg0 == 1501) {
                field9904[field9888++] = var68.field6303;
                return;
            }
            if (arg0 == 1502) {
                field9904[field9888++] = var68.field6372;
                return;
            }
            if (arg0 == 1503) {
                field9904[field9888++] = var68.field6224;
                return;
            }
            if (arg0 == 1504) {
                field9904[field9888++] = var68.field6340 ? 1 : 0;
                return;
            }
            if (arg0 == 1505) {
                field9904[field9888++] = var68.field6292;
                return;
            }
            if (arg0 == 1506) {
                class477 var69 = class221.method1406(-56, var68);
                field9904[field9888++] = var69 == null ? -1 : var69.field6234;
                return;
            }
        } else if (arg0 < 1700) {
            class477 var70 = arg1 ? field9891 : field9887;
            if (arg0 == 1600) {
                field9904[field9888++] = var70.field6317;
                return;
            }
            if (arg0 == 1601) {
                field9904[field9888++] = var70.field6356;
                return;
            }
            if (arg0 == 1602) {
                field9897[field9908++] = var70.field6298;
                return;
            }
            if (arg0 == 1603) {
                field9904[field9888++] = var70.field6225;
                return;
            }
            if (arg0 == 1604) {
                field9904[field9888++] = var70.field6252;
                return;
            }
            if (arg0 == 1605) {
                field9904[field9888++] = var70.field6216;
                return;
            }
            if (arg0 == 1606) {
                field9904[field9888++] = var70.field6283;
                return;
            }
            if (arg0 == 1607) {
                field9904[field9888++] = var70.field6277;
                return;
            }
            if (arg0 == 1608) {
                field9904[field9888++] = var70.field6342;
                return;
            }
            if (arg0 == 1609) {
                field9904[field9888++] = var70.field6310;
                return;
            }
            if (arg0 == 1610) {
                field9904[field9888++] = var70.field6253;
                return;
            }
            if (arg0 == 1611) {
                field9904[field9888++] = var70.field6271;
                return;
            }
            if (arg0 == 1612) {
                field9904[field9888++] = var70.field6265;
                return;
            }
            if (arg0 == 1613) {
                int var71 = field9904[--field9888];
                class428 var72 = class191.field2445.method1075((byte) -65, var71);
                if (var72.method2460(-28741)) {
                    field9897[field9908++] = var70.method2644(var72.field5541, var71, 98);
                    return;
                }
                field9904[field9888++] = var70.method2638(var71, var72.field5546, false);
                return;
            }
            if (arg0 == 1614) {
                field9904[field9888++] = var70.field6215;
                return;
            }
        } else if (arg0 < 1800) {
            class477 var73 = arg1 ? field9891 : field9887;
            if (arg0 == 1700) {
                field9904[field9888++] = var73.field6321;
                return;
            }
            if (arg0 == 1701) {
                if (var73.field6321 != -1) {
                    field9904[field9888++] = var73.field6237;
                    return;
                }
                field9904[field9888++] = 0;
                return;
            }
            if (arg0 == 1702) {
                field9904[field9888++] = var73.field6221;
                return;
            }
        } else if (arg0 < 1900) {
            class477 var74 = arg1 ? field9891 : field9887;
            if (arg0 == 1800) {
                field9904[field9888++] = client.method696(var74).method1142((byte) -124);
                return;
            }
            if (arg0 == 1801) {
                int var75 = field9904[--field9888];
                int var352 = var75 - 1;
                if (var74.field6220 != null && var352 < var74.field6220.length && var74.field6220[var352] != null) {
                    field9897[field9908++] = var74.field6220[var352];
                    return;
                }
                field9897[field9908++] = "";
                return;
            }
            if (arg0 == 1802) {
                if (var74.field6315 == null) {
                    field9897[field9908++] = "";
                    return;
                }
                field9897[field9908++] = var74.field6315;
                return;
            }
        } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
            class477 var350;
            if (arg0 >= 2000) {
                var350 = class600.method3268(125, field9904[--field9888]);
                arg0 -= 1000;
            } else {
                var350 = arg1 ? field9891 : field9887;
            }
            if (field9915 >= 10) {
                throw new RuntimeException("C29xx-1");
            }
            if (arg0 == 1927) {
                if (var350.field6331 == null) {
                    return;
                }
                class155 var351 = new class155();
                var351.field1968 = var350;
                var351.field1962 = var350.field6331;
                var351.field1957 = field9915 + 1;
                class587.field7952.method2087(var351, 15);
                return;
            }
        } else if (arg0 < 2600) {
            class477 var76 = class600.method3268(-15, field9904[--field9888]);
            if (arg0 == 2500) {
                field9904[field9888++] = var76.field6286;
                return;
            }
            if (arg0 == 2501) {
                field9904[field9888++] = var76.field6303;
                return;
            }
            if (arg0 == 2502) {
                field9904[field9888++] = var76.field6372;
                return;
            }
            if (arg0 == 2503) {
                field9904[field9888++] = var76.field6224;
                return;
            }
            if (arg0 == 2504) {
                field9904[field9888++] = var76.field6340 ? 1 : 0;
                return;
            }
            if (arg0 == 2505) {
                field9904[field9888++] = var76.field6292;
                return;
            }
            if (arg0 == 1506) {
                class477 var77 = class221.method1406(-104, var76);
                field9904[field9888++] = var77 == null ? -1 : var77.field6234;
                return;
            }
        } else if (arg0 < 2700) {
            class477 var78 = class600.method3268(108, field9904[--field9888]);
            if (arg0 == 2600) {
                field9904[field9888++] = var78.field6317;
                return;
            }
            if (arg0 == 2601) {
                field9904[field9888++] = var78.field6356;
                return;
            }
            if (arg0 == 2602) {
                field9897[field9908++] = var78.field6298;
                return;
            }
            if (arg0 == 2603) {
                field9904[field9888++] = var78.field6225;
                return;
            }
            if (arg0 == 2604) {
                field9904[field9888++] = var78.field6252;
                return;
            }
            if (arg0 == 2605) {
                field9904[field9888++] = var78.field6216;
                return;
            }
            if (arg0 == 2606) {
                field9904[field9888++] = var78.field6283;
                return;
            }
            if (arg0 == 2607) {
                field9904[field9888++] = var78.field6277;
                return;
            }
            if (arg0 == 2608) {
                field9904[field9888++] = var78.field6342;
                return;
            }
            if (arg0 == 2609) {
                field9904[field9888++] = var78.field6310;
                return;
            }
            if (arg0 == 2610) {
                field9904[field9888++] = var78.field6253;
                return;
            }
            if (arg0 == 2611) {
                field9904[field9888++] = var78.field6271;
                return;
            }
            if (arg0 == 2612) {
                field9904[field9888++] = var78.field6265;
                return;
            }
            if (arg0 == 2613) {
                field9904[field9888++] = var78.field6215;
                return;
            }
        } else if (arg0 < 2800) {
            if (arg0 == 2700) {
                class477 var79 = class600.method3268(-50, field9904[--field9888]);
                field9904[field9888++] = var79.field6321;
                return;
            }
            if (arg0 == 2701) {
                class477 var80 = class600.method3268(1, field9904[--field9888]);
                if (var80.field6321 != -1) {
                    field9904[field9888++] = var80.field6237;
                    return;
                }
                field9904[field9888++] = 0;
                return;
            }
            if (arg0 == 2702) {
                int var81 = field9904[--field9888];
                class270 var82 = (class270) class700.field9763.method39((long) var81, 31750);
                if (var82 != null) {
                    field9904[field9888++] = 1;
                    return;
                }
                field9904[field9888++] = 0;
                return;
            }
            if (arg0 == 2703) {
                class477 var83 = class600.method3268(123, field9904[--field9888]);
                if (var83.field6258 == null) {
                    field9904[field9888++] = 0;
                    return;
                }
                int var84 = var83.field6258.length;
                for (int var85 = 0; var85 < var83.field6258.length; var85++) {
                    if (var83.field6258[var85] == null) {
                        var84 = var85;
                        break;
                    }
                }
                field9904[field9888++] = var84;
                return;
            }
            if (arg0 == 2704 || arg0 == 2705) {
                field9888 -= 2;
                int var86 = field9904[field9888];
                int var87 = field9904[field9888 + 1];
                class270 var88 = (class270) class700.field9763.method39((long) var86, 31750);
                if (var88 != null && var88.field3588 == var87) {
                    field9904[field9888++] = 1;
                    return;
                }
                field9904[field9888++] = 0;
                return;
            }
        } else if (arg0 < 2900) {
            class477 var89 = class600.method3268(114, field9904[--field9888]);
            if (arg0 == 2800) {
                field9904[field9888++] = client.method696(var89).method1142((byte) -124);
                return;
            }
            if (arg0 == 2801) {
                int var90 = field9904[--field9888];
                int var353 = var90 - 1;
                if (var89.field6220 != null && var353 < var89.field6220.length && var89.field6220[var353] != null) {
                    field9897[field9908++] = var89.field6220[var353];
                    return;
                }
                field9897[field9908++] = "";
                return;
            }
            if (arg0 == 2802) {
                if (var89.field6315 == null) {
                    field9897[field9908++] = "";
                    return;
                }
                field9897[field9908++] = var89.field6315;
                return;
            }
        } else if (arg0 < 3200) {
            if (arg0 == 3100) {
                String var91 = field9897[--field9908];
                class96.method731((byte) 93, var91);
                return;
            }
            if (arg0 == 3101) {
                field9888 -= 2;
                class172.method1169(field9904[field9888 + 1], field9904[field9888], (byte) 49, class233.field3130);
                return;
            }
            if (arg0 == 3103) {
                class232.method1470(true, 0);
                return;
            }
            if (arg0 == 3104) {
                String var92 = field9897[--field9908];
                int var93 = 0;
                if (class594.method3226(-100, var92)) {
                    var93 = class703.method3845((byte) -94, var92);
                }
                field9901++;
                class11 var94 = class130.method931(class649.field9035, (byte) 54, class40.field559);
                var94.field114.method2353(var93, (byte) -31);
                class100.method760(var94, 84);
                return;
            }
            if (arg0 == 3105) {
                String var95 = field9897[--field9908];
                field9907++;
                class11 var96 = class130.method931(class649.field9035, (byte) 54, class665.field9221);
                var96.field114.method2352(true, var95.length() + 1);
                var96.field114.method2374(var95, -83);
                class100.method760(var96, 105);
                return;
            }
            if (arg0 == 3106) {
                String var97 = field9897[--field9908];
                field9910++;
                class11 var98 = class130.method931(class649.field9035, (byte) 54, class442.field5717);
                var98.field114.method2352(true, var97.length() + 1);
                var98.field114.method2374(var97, -82);
                class100.method760(var98, 68);
                return;
            }
            if (arg0 == 3107) {
                int var99 = field9904[--field9888];
                String var100 = field9897[--field9908];
                class428.method2461(var99, 4, var100);
                return;
            }
            if (arg0 == 3108) {
                field9888 -= 3;
                int var101 = field9904[field9888];
                int var102 = field9904[field9888 + 1];
                int var103 = field9904[field9888 + 2];
                class477 var104 = class600.method3268(124, var103);
                class330.method1908(var104, var102, 121, var101);
                return;
            }
            if (arg0 == 3109) {
                field9888 -= 2;
                int var105 = field9904[field9888];
                int var106 = field9904[field9888 + 1];
                class477 var107 = arg1 ? field9891 : field9887;
                class330.method1908(var107, var106, 98, var105);
                return;
            }
            if (arg0 == 3110) {
                int var108 = field9904[--field9888];
                field9902++;
                class11 var109 = class130.method931(class649.field9035, (byte) 54, class188.field2394);
                var109.field114.method2386(var108, 1103587288);
                class100.method760(var109, -104);
                return;
            }
            if (arg0 == 3111) {
                field9888 -= 2;
                int var110 = field9904[field9888];
                int var111 = field9904[field9888 + 1];
                class270 var112 = (class270) class700.field9763.method39((long) var110, 31750);
                if (var112 != null) {
                    class298.method1764(true, -100, var112.field3588 != var111, var112);
                }
                class529.method2817(var110, var111, true, false, 3);
                return;
            }
            if (arg0 == 3112) {
                field9888--;
                int var113 = field9904[field9888];
                class270 var114 = (class270) class700.field9763.method39((long) var113, 31750);
                if (var114 != null && var114.field3591 == 3) {
                    class298.method1764(true, -99, true, var114);
                }
                return;
            }
            if (arg0 == 3113) {
                class515.method2774(125, field9897[--field9908]);
                return;
            }
            if (arg0 == 3114) {
                field9888 -= 2;
                int var115 = field9904[field9888];
                int var116 = field9904[field9888 + 1];
                String var117 = field9897[--field9908];
                class495.method2696(-1, var116, "", var115, "", var117, "");
                return;
            }
            if (arg0 == 3115) {
                field9888 -= 11;
                class562[] var118 = class167.method1156(109);
                class573[] var119 = class239.method1507((byte) -37);
                class249.method1558(var119[field9904[field9888 + 1]], field9904[field9888 + 8], field9904[field9888 + 7], field9904[field9888 + 2], field9904[field9888 + 5], field9904[field9888 + 10], field9904[field9888 + 4], field9904[field9888 + 3], field9904[field9888 + 9], field9904[field9888 + 6], (byte) 120, var118[field9904[field9888]]);
                return;
            }
        } else if (arg0 < 3300) {
            if (arg0 == 3200) {
                field9888 -= 3;
                class520.method2795(false, 255, field9904[field9888], field9904[field9888 + 1], field9904[field9888 + 2]);
                return;
            }
            if (arg0 == 3201) {
                class631.method3502(-1, 50, 255, field9904[--field9888]);
                return;
            }
            if (arg0 == 3202) {
                field9888 -= 2;
                class33.method264((byte) 46, field9904[field9888 + 1], 255, field9904[field9888]);
                return;
            }
            if (arg0 == 3203) {
                field9888 -= 4;
                class520.method2795(false, field9904[field9888 + 3], field9904[field9888], field9904[field9888 + 1], field9904[field9888 + 2]);
                return;
            }
            if (arg0 == 3204) {
                field9888 -= 3;
                class631.method3502(-1, field9904[field9888 + 2], field9904[field9888 + 1], field9904[field9888]);
                return;
            }
            if (arg0 == 3205) {
                field9888 -= 3;
                class33.method264((byte) 46, field9904[field9888 + 1], field9904[field9888 + 2], field9904[field9888]);
                return;
            }
            if (arg0 == 3206) {
                field9888 -= 4;
                class285.method1700(field9904[field9888 + 1], field9904[field9888], (byte) -62, field9904[field9888 + 2], false, field9904[field9888 + 3]);
                return;
            }
            if (arg0 == 3207) {
                field9888 -= 4;
                class285.method1700(field9904[field9888 + 1], field9904[field9888], (byte) 106, field9904[field9888 + 2], true, field9904[field9888 + 3]);
                return;
            }
        } else if (arg0 < 3400) {
            if (arg0 == 3300) {
                field9904[field9888++] = class424.field5503;
                return;
            }
            if (arg0 == 3301) {
                field9888 -= 2;
                int var120 = field9904[field9888];
                int var121 = field9904[field9888 + 1];
                field9904[field9888++] = class87.method657(var120, var121, false, -1);
                return;
            }
            if (arg0 == 3302) {
                field9888 -= 2;
                int var122 = field9904[field9888];
                int var123 = field9904[field9888 + 1];
                field9904[field9888++] = class287.method1709(var122, (byte) 100, var123, false);
                return;
            }
            if (arg0 == 3303) {
                field9888 -= 2;
                int var124 = field9904[field9888];
                int var125 = field9904[field9888 + 1];
                field9904[field9888++] = class519.method2793(38, var125, false, var124);
                return;
            }
            if (arg0 == 3304) {
                int var126 = field9904[--field9888];
                field9904[field9888++] = class361.field4669.method631(var126, -113).field2933;
                return;
            }
            if (arg0 == 3305) {
                int var127 = field9904[--field9888];
                field9904[field9888++] = class638.field8880[var127];
                return;
            }
            if (arg0 == 3306) {
                int var128 = field9904[--field9888];
                field9904[field9888++] = class243.field3256[var128];
                return;
            }
            if (arg0 == 3307) {
                int var129 = field9904[--field9888];
                field9904[field9888++] = class553.field7248[var129];
                return;
            }
            if (arg0 == 3308) {
                byte var130 = class233.field3130.field508;
                int var131 = (class233.field3130.field506 >> 9) + class100.field1326;
                int var132 = (class233.field3130.field503 >> 9) + class186.field2376;
                field9904[field9888++] = (var130 << 28) + (var131 << 14) + var132;
                return;
            }
            if (arg0 == 3309) {
                int var133 = field9904[--field9888];
                field9904[field9888++] = var133 >> 14 & 0x3FFF;
                return;
            }
            if (arg0 == 3310) {
                int var134 = field9904[--field9888];
                field9904[field9888++] = var134 >> 28;
                return;
            }
            if (arg0 == 3311) {
                int var135 = field9904[--field9888];
                field9904[field9888++] = var135 & 0x3FFF;
                return;
            }
            if (arg0 == 3312) {
                field9904[field9888++] = class454.field5922 ? 1 : 0;
                return;
            }
            if (arg0 == 3313) {
                field9888 -= 2;
                int var136 = field9904[field9888];
                int var137 = field9904[field9888 + 1];
                field9904[field9888++] = class87.method657(var136, var137, true, -1);
                return;
            }
            if (arg0 == 3314) {
                field9888 -= 2;
                int var138 = field9904[field9888];
                int var139 = field9904[field9888 + 1];
                field9904[field9888++] = class287.method1709(var138, (byte) 100, var139, true);
                return;
            }
            if (arg0 == 3315) {
                field9888 -= 2;
                int var140 = field9904[field9888];
                int var141 = field9904[field9888 + 1];
                field9904[field9888++] = class519.method2793(98, var141, true, var140);
                return;
            }
            if (arg0 == 3316) {
                if (class54.field741 >= 2) {
                    field9904[field9888++] = class54.field741;
                    return;
                }
                field9904[field9888++] = 0;
                return;
            }
            if (arg0 == 3317) {
                field9904[field9888++] = class112.field1466;
                return;
            }
            if (arg0 == 3318) {
                field9904[field9888++] = class423.field5473.field3554;
                return;
            }
            if (arg0 == 3321) {
                field9904[field9888++] = class684.field9398;
                return;
            }
            if (arg0 == 3322) {
                field9904[field9888++] = class602.field8104;
                return;
            }
            if (arg0 == 3323) {
                if (class110.field1435 >= 5 && class110.field1435 <= 9) {
                    field9904[field9888++] = 1;
                    return;
                }
                field9904[field9888++] = 0;
                return;
            }
            if (arg0 == 3324) {
                if (class110.field1435 >= 5 && class110.field1435 <= 9) {
                    field9904[field9888++] = class110.field1435;
                    return;
                }
                field9904[field9888++] = 0;
                return;
            }
            if (arg0 == 3325) {
                field9904[field9888++] = class603.field8118 ? 1 : 0;
                return;
            }
            if (arg0 == 3326) {
                field9904[field9888++] = class233.field3130.field2499;
                return;
            }
            if (arg0 == 3327) {
                field9904[field9888++] = class233.field3130.field2469.field2706 ? 1 : 0;
                return;
            }
            if (arg0 == 3329) {
                field9904[field9888++] = class597.field8076 ? 1 : 0;
                return;
            }
            if (arg0 == 3330) {
                int var142 = field9904[--field9888];
                field9904[field9888++] = class245.method1531(-108, var142, false);
                return;
            }
            if (arg0 == 3331) {
                field9888 -= 2;
                int var143 = field9904[field9888];
                int var144 = field9904[field9888 + 1];
                field9904[field9888++] = class492.method2688(var143, false, var144, (byte) -82, false);
                return;
            }
            if (arg0 == 3332) {
                field9888 -= 2;
                int var145 = field9904[field9888];
                int var146 = field9904[field9888 + 1];
                field9904[field9888++] = class492.method2688(var145, false, var146, (byte) -106, true);
                return;
            }
            if (arg0 == 3333) {
                field9904[field9888++] = class222.field2906;
                return;
            }
            if (arg0 == 3335) {
                field9904[field9888++] = class144.field1890;
                return;
            }
            if (arg0 == 3336) {
                field9888 -= 4;
                int var147 = field9904[field9888];
                int var148 = field9904[field9888 + 1];
                int var149 = field9904[field9888 + 2];
                int var150 = field9904[field9888 + 3];
                int var151 = (var148 << 14) + var147;
                int var152 = (var149 << 28) + var151;
                int var153 = var150 + var152;
                field9904[field9888++] = var153;
                return;
            }
            if (arg0 == 3337) {
                field9904[field9888++] = class31.field467;
                return;
            }
            if (arg0 == 3338) {
                field9904[field9888++] = class328.method1894(true);
                return;
            }
            if (arg0 == 3339) {
                field9904[field9888++] = class107.field1389 ? 1 : 0;
                return;
            }
            if (arg0 == 3340) {
                field9904[field9888++] = class164.field2043 ? 1 : 0;
                return;
            }
            if (arg0 == 3341) {
                field9904[field9888++] = class346.field4421 ? 1 : 0;
                return;
            }
            if (arg0 == 3342) {
                field9904[field9888++] = class691.field9440.method2214(-2703);
                return;
            }
            if (arg0 == 3343) {
                field9904[field9888++] = class691.field9440.method2208(30114);
                return;
            }
            if (arg0 == 3344) {
                field9897[field9908++] = class254.method1606((byte) 11);
                return;
            }
            if (arg0 == 3345) {
                field9897[field9908++] = class413.method2336((byte) -113);
                return;
            }
            if (arg0 == 3346) {
                field9904[field9888++] = class298.method1762((byte) 120);
                return;
            }
            if (arg0 == 3347) {
                field9904[field9888++] = class378.field4846;
                return;
            }
        } else if (arg0 < 3500) {
            if (arg0 == 3400) {
                field9888 -= 2;
                int var154 = field9904[field9888];
                int var155 = field9904[field9888 + 1];
                class539 var156 = class359.field4656.method2333((byte) 86, var154);
                field9897[field9908++] = var156.method2860(var155, -4639);
                return;
            }
            if (arg0 == 3408) {
                field9888 -= 4;
                int var157 = field9904[field9888];
                int var158 = field9904[field9888 + 1];
                int var159 = field9904[field9888 + 2];
                int var160 = field9904[field9888 + 3];
                class539 var161 = class359.field4656.method2333((byte) 72, var159);
                if (var161.field7001 == var157 && var161.field7016 == var158) {
                    if (var158 == 115) {
                        field9897[field9908++] = var161.method2860(var160, -4639);
                        return;
                    }
                    field9904[field9888++] = var161.method2858(14285, var160);
                    return;
                }
                throw new RuntimeException("C3408-1");
            }
            if (arg0 == 3409) {
                field9888 -= 3;
                int var162 = field9904[field9888];
                int var163 = field9904[field9888 + 1];
                int var164 = field9904[field9888 + 2];
                if (var163 == -1) {
                    throw new RuntimeException("C3409-2");
                }
                class539 var165 = class359.field4656.method2333((byte) 36, var163);
                if (var165.field7016 != var162) {
                    throw new RuntimeException("C3409-1");
                }
                field9904[field9888++] = var165.method2863(var164, 5) ? 1 : 0;
                return;
            }
            if (arg0 == 3410) {
                int var166 = field9904[--field9888];
                String var167 = field9897[--field9908];
                if (var166 == -1) {
                    throw new RuntimeException("C3410-2");
                }
                class539 var168 = class359.field4656.method2333((byte) 121, var166);
                if (var168.field7016 != 's') {
                    throw new RuntimeException("C3410-1");
                }
                field9904[field9888++] = var168.method2865((byte) 126, var167) ? 1 : 0;
                return;
            }
            if (arg0 == 3411) {
                int var169 = field9904[--field9888];
                class539 var170 = class359.field4656.method2333((byte) 52, var169);
                field9904[field9888++] = var170.field7013.method43((byte) -71);
                return;
            }
        } else if (arg0 < 3700) {
            if (arg0 == 3600) {
                if (class532.field6926 == 0) {
                    field9904[field9888++] = -2;
                    return;
                }
                if (class532.field6926 == 1) {
                    field9904[field9888++] = -1;
                    return;
                }
                field9904[field9888++] = class665.field9225;
                return;
            }
            if (arg0 == 3601) {
                int var171 = field9904[--field9888];
                if (class532.field6926 == 2 && var171 < class665.field9225) {
                    field9897[field9908++] = class405.field5160[var171];
                    if (class329.field4274[var171] != null) {
                        field9897[field9908++] = class329.field4274[var171];
                        return;
                    }
                    field9897[field9908++] = "";
                    return;
                }
                field9897[field9908++] = "";
                field9897[field9908++] = "";
                return;
            }
            if (arg0 == 3602) {
                int var172 = field9904[--field9888];
                if (class532.field6926 == 2 && var172 < class665.field9225) {
                    field9904[field9888++] = class565.field7387[var172];
                    return;
                }
                field9904[field9888++] = 0;
                return;
            }
            if (arg0 == 3603) {
                int var173 = field9904[--field9888];
                if (class532.field6926 == 2 && var173 < class665.field9225) {
                    field9904[field9888++] = class509.field6673[var173];
                    return;
                }
                field9904[field9888++] = 0;
                return;
            }
            if (arg0 == 3604) {
                String var174 = field9897[--field9908];
                int var175 = field9904[--field9888];
                class612.method3323((byte) -1, var175, var174);
                return;
            }
            if (arg0 == 3605) {
                String var176 = field9897[--field9908];
                class328.method1893(var176, 100);
                return;
            }
            if (arg0 == 3606) {
                String var177 = field9897[--field9908];
                class580.method3186(var177, (byte) 86);
                return;
            }
            if (arg0 == 3607) {
                String var178 = field9897[--field9908];
                class370.method2129((byte) -8, var178, false);
                return;
            }
            if (arg0 == 3608) {
                String var179 = field9897[--field9908];
                class152.method1108(var179, (byte) 18);
                return;
            }
            if (arg0 == 3609) {
                String var180 = field9897[--field9908];
                if (var180.startsWith("<img=0>") || var180.startsWith("<img=1>")) {
                    var180 = var180.substring(7);
                }
                field9904[field9888++] = class678.method3726(var180, false) ? 1 : 0;
                return;
            }
            if (arg0 == 3610) {
                int var181 = field9904[--field9888];
                if (class532.field6926 == 2 && var181 < class665.field9225) {
                    field9897[field9908++] = class636.field8849[var181];
                    return;
                }
                field9897[field9908++] = "";
                return;
            }
            if (arg0 == 3611) {
                if (class428.field5543 != null) {
                    field9897[field9908++] = class347.method1995((byte) -3, class428.field5543);
                    return;
                }
                field9897[field9908++] = "";
                return;
            }
            if (arg0 == 3612) {
                if (class428.field5543 != null) {
                    field9904[field9888++] = class76.field1038;
                    return;
                }
                field9904[field9888++] = 0;
                return;
            }
            if (arg0 == 3613) {
                int var182 = field9904[--field9888];
                if (class428.field5543 != null && var182 < class76.field1038) {
                    field9897[field9908++] = class265.field3540[var182].field9050;
                    return;
                }
                field9897[field9908++] = "";
                return;
            }
            if (arg0 == 3614) {
                int var183 = field9904[--field9888];
                if (class428.field5543 != null && var183 < class76.field1038) {
                    field9904[field9888++] = class265.field3540[var183].field9058;
                    return;
                }
                field9904[field9888++] = 0;
                return;
            }
            if (arg0 == 3615) {
                int var184 = field9904[--field9888];
                if (class428.field5543 != null && var184 < class76.field1038) {
                    field9904[field9888++] = class265.field3540[var184].field9049;
                    return;
                }
                field9904[field9888++] = 0;
                return;
            }
            if (arg0 == 3616) {
                field9904[field9888++] = class535.field6973;
                return;
            }
            if (arg0 == 3617) {
                String var185 = field9897[--field9908];
                class171.method1168(var185, -93);
                return;
            }
            if (arg0 == 3618) {
                field9904[field9888++] = class446.field5733;
                return;
            }
            if (arg0 == 3619) {
                String var186 = field9897[--field9908];
                class237.method1498((byte) -125, var186);
                return;
            }
            if (arg0 == 3620) {
                class282.method1690((byte) -95);
                return;
            }
            if (arg0 == 3621) {
                if (class532.field6926 == 0) {
                    field9904[field9888++] = -1;
                    return;
                }
                field9904[field9888++] = class703.field9804;
                return;
            }
            if (arg0 == 3622) {
                int var187 = field9904[--field9888];
                if (class532.field6926 != 0 && var187 < class703.field9804) {
                    field9897[field9908++] = class408.field5236[var187];
                    if (class580.field7903[var187] != null) {
                        field9897[field9908++] = class580.field7903[var187];
                        return;
                    }
                    field9897[field9908++] = "";
                    return;
                }
                field9897[field9908++] = "";
                field9897[field9908++] = "";
                return;
            }
            if (arg0 == 3623) {
                String var188 = field9897[--field9908];
                if (var188.startsWith("<img=0>") || var188.startsWith("<img=1>")) {
                    var188 = var188.substring(7);
                }
                field9904[field9888++] = class336.method1924((byte) 126, var188) ? 1 : 0;
                return;
            }
            if (arg0 == 3624) {
                int var189 = field9904[--field9888];
                if (class265.field3540 != null && var189 < class76.field1038 && class265.field3540[var189].field9052.equalsIgnoreCase(class233.field3130.field2492)) {
                    field9904[field9888++] = 1;
                    return;
                }
                field9904[field9888++] = 0;
                return;
            }
            if (arg0 == 3625) {
                if (class438.field5665 != null) {
                    field9897[field9908++] = class438.field5665;
                    return;
                }
                field9897[field9908++] = "";
                return;
            }
            if (arg0 == 3626) {
                int var190 = field9904[--field9888];
                if (class428.field5543 != null && var190 < class76.field1038) {
                    field9897[field9908++] = class265.field3540[var190].field9056;
                    return;
                }
                field9897[field9908++] = "";
                return;
            }
            if (arg0 == 3627) {
                int var191 = field9904[--field9888];
                if (class532.field6926 == 2 && var191 >= 0 && var191 < class665.field9225) {
                    field9904[field9888++] = class51.field713[var191] ? 1 : 0;
                    return;
                }
                field9904[field9888++] = 0;
                return;
            }
            if (arg0 == 3628) {
                String var192 = field9897[--field9908];
                if (var192.startsWith("<img=0>") || var192.startsWith("<img=1>")) {
                    var192 = var192.substring(7);
                }
                field9904[field9888++] = class116.method874(4, var192);
                return;
            }
            if (arg0 == 3629) {
                field9904[field9888++] = class358.field4643;
                return;
            }
            if (arg0 == 3630) {
                String var193 = field9897[--field9908];
                class370.method2129((byte) -8, var193, true);
                return;
            }
            if (arg0 == 3631) {
                int var194 = field9904[--field9888];
                field9904[field9888++] = class185.field2367[var194] ? 1 : 0;
                return;
            }
            if (arg0 == 3632) {
                int var195 = field9904[--field9888];
                if (class428.field5543 != null && var195 < class76.field1038) {
                    field9897[field9908++] = class265.field3540[var195].field9052;
                    return;
                }
                field9897[field9908++] = "";
                return;
            }
            if (arg0 == 3633) {
                int var196 = field9904[--field9888];
                if (class532.field6926 != 0 && var196 < class703.field9804) {
                    field9897[field9908++] = class379.field4851[var196];
                    return;
                }
                field9897[field9908++] = "";
                return;
            }
        } else if (arg0 < 4000) {
            if (arg0 == 3903) {
                int var197 = field9904[--field9888];
                field9904[field9888++] = class8.field85[var197].method1138(-110);
                return;
            }
            if (arg0 == 3904) {
                int var198 = field9904[--field9888];
                field9904[field9888++] = class8.field85[var198].field2004;
                return;
            }
            if (arg0 == 3905) {
                int var199 = field9904[--field9888];
                field9904[field9888++] = class8.field85[var199].field2001;
                return;
            }
            if (arg0 == 3906) {
                int var200 = field9904[--field9888];
                field9904[field9888++] = class8.field85[var200].field2003;
                return;
            }
            if (arg0 == 3907) {
                int var201 = field9904[--field9888];
                field9904[field9888++] = class8.field85[var201].field1996;
                return;
            }
            if (arg0 == 3908) {
                int var202 = field9904[--field9888];
                field9904[field9888++] = class8.field85[var202].field1997;
                return;
            }
            if (arg0 == 3910) {
                int var203 = field9904[--field9888];
                int var204 = class8.field85[var203].method1137((byte) 93);
                field9904[field9888++] = var204 == 0 ? 1 : 0;
                return;
            }
            if (arg0 == 3911) {
                int var205 = field9904[--field9888];
                int var206 = class8.field85[var205].method1137((byte) -114);
                field9904[field9888++] = var206 == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 3912) {
                int var207 = field9904[--field9888];
                int var208 = class8.field85[var207].method1137((byte) -40);
                field9904[field9888++] = var208 == 5 ? 1 : 0;
                return;
            }
            if (arg0 == 3913) {
                int var209 = field9904[--field9888];
                int var210 = class8.field85[var209].method1137((byte) 99);
                field9904[field9888++] = var210 == 1 ? 1 : 0;
                return;
            }
        } else if (arg0 < 4100) {
            if (arg0 == 4000) {
                field9888 -= 2;
                int var211 = field9904[field9888];
                int var212 = field9904[field9888 + 1];
                field9904[field9888++] = var211 + var212;
                return;
            }
            if (arg0 == 4001) {
                field9888 -= 2;
                int var213 = field9904[field9888];
                int var214 = field9904[field9888 + 1];
                field9904[field9888++] = var213 - var214;
                return;
            }
            if (arg0 == 4002) {
                field9888 -= 2;
                int var215 = field9904[field9888];
                int var216 = field9904[field9888 + 1];
                field9904[field9888++] = var215 * var216;
                return;
            }
            if (arg0 == 4003) {
                field9888 -= 2;
                int var217 = field9904[field9888];
                int var218 = field9904[field9888 + 1];
                field9904[field9888++] = var217 / var218;
                return;
            }
            if (arg0 == 4004) {
                int var219 = field9904[--field9888];
                field9904[field9888++] = (int) (Math.random() * (double) var219);
                return;
            }
            if (arg0 == 4005) {
                int var220 = field9904[--field9888];
                field9904[field9888++] = (int) (Math.random() * (double) (var220 + 1));
                return;
            }
            if (arg0 == 4006) {
                field9888 -= 5;
                int var221 = field9904[field9888];
                int var222 = field9904[field9888 + 1];
                int var223 = field9904[field9888 + 2];
                int var224 = field9904[field9888 + 3];
                int var225 = field9904[field9888 + 4];
                field9904[field9888++] = (var222 - var221) * (var225 - var223) / (var224 - var223) + var221;
                return;
            }
            if (arg0 == 4007) {
                field9888 -= 2;
                long var226 = (long) field9904[field9888];
                long var228 = (long) field9904[field9888 + 1];
                field9904[field9888++] = (int) (var226 * var228 / 100L + var226);
                return;
            }
            if (arg0 == 4008) {
                field9888 -= 2;
                int var230 = field9904[field9888];
                int var231 = field9904[field9888 + 1];
                field9904[field9888++] = var230 | 0x1 << var231;
                return;
            }
            if (arg0 == 4009) {
                field9888 -= 2;
                int var232 = field9904[field9888];
                int var233 = field9904[field9888 + 1];
                field9904[field9888++] = var232 & -(0x1 << var233) - 1;
                return;
            }
            if (arg0 == 4010) {
                field9888 -= 2;
                int var234 = field9904[field9888];
                int var235 = field9904[field9888 + 1];
                field9904[field9888++] = (var234 & 0x1 << var235) == 0 ? 0 : 1;
                return;
            }
            if (arg0 == 4011) {
                field9888 -= 2;
                int var236 = field9904[field9888];
                int var237 = field9904[field9888 + 1];
                field9904[field9888++] = var236 % var237;
                return;
            }
            if (arg0 == 4012) {
                field9888 -= 2;
                int var238 = field9904[field9888];
                int var239 = field9904[field9888 + 1];
                if (var238 == 0) {
                    field9904[field9888++] = 0;
                    return;
                }
                field9904[field9888++] = (int) Math.pow((double) var238, (double) var239);
                return;
            }
            if (arg0 == 4013) {
                field9888 -= 2;
                int var240 = field9904[field9888];
                int var241 = field9904[field9888 + 1];
                if (var240 == 0) {
                    field9904[field9888++] = 0;
                    return;
                }
                if (var241 == 0) {
                    field9904[field9888++] = Integer.MAX_VALUE;
                    return;
                }
                field9904[field9888++] = (int) Math.pow((double) var240, 1.0D / (double) var241);
                return;
            }
            if (arg0 == 4014) {
                field9888 -= 2;
                int var242 = field9904[field9888];
                int var243 = field9904[field9888 + 1];
                field9904[field9888++] = var242 & var243;
                return;
            }
            if (arg0 == 4015) {
                field9888 -= 2;
                int var244 = field9904[field9888];
                int var245 = field9904[field9888 + 1];
                field9904[field9888++] = var244 | var245;
                return;
            }
            if (arg0 == 4016) {
                field9888 -= 2;
                int var246 = field9904[field9888];
                int var247 = field9904[field9888 + 1];
                field9904[field9888++] = var246 < var247 ? var246 : var247;
                return;
            }
            if (arg0 == 4017) {
                field9888 -= 2;
                int var248 = field9904[field9888];
                int var249 = field9904[field9888 + 1];
                field9904[field9888++] = var248 > var249 ? var248 : var249;
                return;
            }
            if (arg0 == 4018) {
                field9888 -= 3;
                long var250 = (long) field9904[field9888];
                long var252 = (long) field9904[field9888 + 1];
                long var254 = (long) field9904[field9888 + 2];
                field9904[field9888++] = (int) (var250 * var254 / var252);
                return;
            }
        } else if (arg0 < 4200) {
            if (arg0 == 4100) {
                String var256 = field9897[--field9908];
                int var257 = field9904[--field9888];
                field9897[field9908++] = var256 + var257;
                return;
            }
            if (arg0 == 4101) {
                field9908 -= 2;
                String var258 = field9897[field9908];
                String var259 = field9897[field9908 + 1];
                field9897[field9908++] = var258 + var259;
                return;
            }
            if (arg0 == 4102) {
                String var260 = field9897[--field9908];
                int var261 = field9904[--field9888];
                field9897[field9908++] = var260 + class71.method569((byte) 61, var261, true);
                return;
            }
            if (arg0 == 4103) {
                String var262 = field9897[--field9908];
                field9897[field9908++] = var262.toLowerCase();
                return;
            }
            if (arg0 == 4104) {
                field9897[field9908++] = method3897(field9904[--field9888]);
                return;
            }
            if (arg0 == 4105) {
                field9908 -= 2;
                String var263 = field9897[field9908];
                String var264 = field9897[field9908 + 1];
                if (class233.field3130.field2469 != null && class233.field3130.field2469.field2706) {
                    field9897[field9908++] = var264;
                    return;
                }
                field9897[field9908++] = var263;
                return;
            }
            if (arg0 == 4106) {
                int var265 = field9904[--field9888];
                field9897[field9908++] = Integer.toString(var265);
                return;
            }
            if (arg0 == 4107) {
                field9908 -= 2;
                field9904[field9888++] = class322.method1863(field9897[field9908], field9897[field9908 + 1], class144.field1890, 10);
                return;
            }
            if (arg0 == 4108) {
                String var266 = field9897[--field9908];
                field9888 -= 2;
                int var267 = field9904[field9888];
                int var268 = field9904[field9888 + 1];
                class547 var269 = class346.method1992(0, 14278, var268, class261.field3511);
                field9904[field9888++] = var269.method2899(class497.field6553, var267, var266, true);
                return;
            }
            if (arg0 == 4109) {
                String var270 = field9897[--field9908];
                field9888 -= 2;
                int var271 = field9904[field9888];
                int var272 = field9904[field9888 + 1];
                class547 var273 = class346.method1992(0, 14278, var272, class261.field3511);
                field9904[field9888++] = var273.method2898(class497.field6553, var271, -5633, var270);
                return;
            }
            if (arg0 == 4110) {
                field9908 -= 2;
                String var274 = field9897[field9908];
                String var275 = field9897[field9908 + 1];
                if (field9904[--field9888] == 1) {
                    field9897[field9908++] = var274;
                    return;
                }
                field9897[field9908++] = var275;
                return;
            }
            if (arg0 == 4111) {
                String var276 = field9897[--field9908];
                field9897[field9908++] = class442.method2507(var276, -14);
                return;
            }
            if (arg0 == 4112) {
                String var277 = field9897[--field9908];
                int var278 = field9904[--field9888];
                if (var278 == -1) {
                    throw new RuntimeException("null char");
                }
                field9897[field9908++] = var277 + (char) var278;
                return;
            }
            if (arg0 == 4113) {
                int var279 = field9904[--field9888];
                field9904[field9888++] = class489.method2677((char) var279, (byte) -92) ? 1 : 0;
                return;
            }
            if (arg0 == 4114) {
                int var280 = field9904[--field9888];
                field9904[field9888++] = class298.method1760((char) var280, (byte) -56) ? 1 : 0;
                return;
            }
            if (arg0 == 4115) {
                int var281 = field9904[--field9888];
                field9904[field9888++] = class72.method572((char) var281, (byte) 127) ? 1 : 0;
                return;
            }
            if (arg0 == 4116) {
                int var282 = field9904[--field9888];
                field9904[field9888++] = class267.method1646((byte) -117, (char) var282) ? 1 : 0;
                return;
            }
            if (arg0 == 4117) {
                String var283 = field9897[--field9908];
                if (var283 != null) {
                    field9904[field9888++] = var283.length();
                    return;
                }
                field9904[field9888++] = 0;
                return;
            }
            if (arg0 == 4118) {
                String var284 = field9897[--field9908];
                field9888 -= 2;
                int var285 = field9904[field9888];
                int var286 = field9904[field9888 + 1];
                field9897[field9908++] = var284.substring(var285, var286);
                return;
            }
            if (arg0 == 4119) {
                String var287 = field9897[--field9908];
                StringBuffer var288 = new StringBuffer(var287.length());
                boolean var289 = false;
                for (int var290 = 0; var290 < var287.length(); var290++) {
                    char var291 = var287.charAt(var290);
                    if (var291 == '<') {
                        var289 = true;
                    } else if (var291 == '>') {
                        var289 = false;
                    } else if (!var289) {
                        var288.append(var291);
                    }
                }
                field9897[field9908++] = var288.toString();
                return;
            }
            if (arg0 == 4120) {
                String var292 = field9897[--field9908];
                field9888 -= 2;
                int var293 = field9904[field9888];
                int var294 = field9904[field9888 + 1];
                field9904[field9888++] = var292.indexOf(var293, var294);
                return;
            }
            if (arg0 == 4121) {
                field9908 -= 2;
                String var295 = field9897[field9908];
                String var296 = field9897[field9908 + 1];
                int var297 = field9904[--field9888];
                field9904[field9888++] = var295.indexOf(var296, var297);
                return;
            }
            if (arg0 == 4122) {
                int var298 = field9904[--field9888];
                field9904[field9888++] = Character.toLowerCase((char) var298);
                return;
            }
            if (arg0 == 4123) {
                int var299 = field9904[--field9888];
                field9904[field9888++] = Character.toUpperCase((char) var299);
                return;
            }
            if (arg0 == 4124) {
                boolean var300 = field9904[--field9888] != 0;
                int var301 = field9904[--field9888];
                field9897[field9908++] = class287.method1706((long) var301, 0, 10, var300, class144.field1890);
                return;
            }
            if (arg0 == 4125) {
                String var302 = field9897[--field9908];
                int var303 = field9904[--field9888];
                class547 var304 = class346.method1992(0, 14278, var303, class261.field3511);
                field9904[field9888++] = var304.method2907(var302, class497.field6553, -1);
                return;
            }
        } else if (arg0 < 4300) {
            if (arg0 == 4200) {
                int var305 = field9904[--field9888];
                field9897[field9908++] = class232.field3109.method1292(0, var305).field9569;
                return;
            }
            if (arg0 == 4201) {
                field9888 -= 2;
                int var306 = field9904[field9888];
                int var307 = field9904[field9888 + 1];
                class696 var308 = class232.field3109.method1292(0, var306);
                if (var307 >= 1 && var307 <= 5 && var308.field9556[var307 - 1] != null) {
                    field9897[field9908++] = var308.field9556[var307 - 1];
                    return;
                }
                field9897[field9908++] = "";
                return;
            }
            if (arg0 == 4202) {
                field9888 -= 2;
                int var309 = field9904[field9888];
                int var310 = field9904[field9888 + 1];
                class696 var311 = class232.field3109.method1292(0, var309);
                if (var310 >= 1 && var310 <= 5 && var311.field9534[var310 - 1] != null) {
                    field9897[field9908++] = var311.field9534[var310 - 1];
                    return;
                }
                field9897[field9908++] = "";
                return;
            }
            if (arg0 == 4203) {
                int var312 = field9904[--field9888];
                field9904[field9888++] = class232.field3109.method1292(0, var312).field9500;
                return;
            }
            if (arg0 == 4204) {
                int var313 = field9904[--field9888];
                field9904[field9888++] = class232.field3109.method1292(0, var313).field9579 == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 4205) {
                int var314 = field9904[--field9888];
                class696 var315 = class232.field3109.method1292(0, var314);
                if (var315.field9575 == -1 && var315.field9505 >= 0) {
                    field9904[field9888++] = var315.field9505;
                    return;
                }
                field9904[field9888++] = var314;
                return;
            }
            if (arg0 == 4206) {
                int var316 = field9904[--field9888];
                class696 var317 = class232.field3109.method1292(0, var316);
                if (var317.field9575 >= 0 && var317.field9505 >= 0) {
                    field9904[field9888++] = var317.field9505;
                    return;
                }
                field9904[field9888++] = var316;
                return;
            }
            if (arg0 == 4207) {
                int var318 = field9904[--field9888];
                field9904[field9888++] = class232.field3109.method1292(0, var318).field9506 ? 1 : 0;
                return;
            }
            if (arg0 == 4208) {
                field9888 -= 2;
                int var319 = field9904[field9888];
                int var320 = field9904[field9888 + 1];
                class428 var321 = class191.field2445.method1075((byte) -65, var320);
                if (var321.method2460(-28741)) {
                    field9897[field9908++] = class232.field3109.method1292(0, var319).method3783(var320, var321.field5541, (byte) 97);
                    return;
                }
                field9904[field9888++] = class232.field3109.method1292(0, var319).method3782(false, var321.field5546, var320);
                return;
            }
            if (arg0 == 4209) {
                field9888 -= 2;
                int var322 = field9904[field9888];
                int var323 = field9904[field9888 + 1] - 1;
                class696 var324 = class232.field3109.method1292(0, var322);
                if (var324.field9507 == var323) {
                    field9904[field9888++] = var324.field9535;
                    return;
                }
                if (var324.field9527 == var323) {
                    field9904[field9888++] = var324.field9546;
                    return;
                }
                field9904[field9888++] = -1;
                return;
            }
            if (arg0 == 4210) {
                String var325 = field9897[--field9908];
                int var326 = field9904[--field9888];
                class636.method3513(var326 == 1, true, var325);
                field9904[field9888++] = class542.field7043;
                return;
            }
            if (arg0 == 4211) {
                if (client.field1222 != null && class587.field7973 < class542.field7043) {
                    field9904[field9888++] = client.field1222[class587.field7973++] & 0xFFFF;
                    return;
                }
                field9904[field9888++] = -1;
                return;
            }
            if (arg0 == 4212) {
                class587.field7973 = 0;
                return;
            }
            if (arg0 == 4213) {
                int var327 = field9904[--field9888];
                field9904[field9888++] = class232.field3109.method1292(0, var327).field9552;
                return;
            }
            if (arg0 == 4214) {
                String var328 = field9897[--field9908];
                field9888 -= 3;
                int var329 = field9904[field9888];
                int var330 = field9904[field9888 + 1];
                int var331 = field9904[field9888 + 2];
                class47.method434(var328, var329 == 1, false, var330, var331);
                field9904[field9888++] = class542.field7043;
                return;
            }
            if (arg0 == 4215) {
                field9908 -= 2;
                field9888 -= 2;
                String var332 = field9897[field9908];
                int var333 = field9904[field9888];
                int var334 = field9904[field9888 + 1];
                String var335 = field9897[field9908 + 1];
                class637.method3518(-58, var332, var335, var333 == 1, var334);
                field9904[field9888++] = class542.field7043;
                return;
            }
        } else if (arg0 < 4400) {
            if (arg0 == 4300) {
                field9888 -= 2;
                int var336 = field9904[field9888];
                int var337 = field9904[field9888 + 1];
                class428 var338 = class191.field2445.method1075((byte) -65, var337);
                if (var338.method2460(-28741)) {
                    field9897[field9908++] = class646.field8998.method519(var336, 0).method3826(var338.field5541, 29164, var337);
                    return;
                }
                field9904[field9888++] = class646.field8998.method519(var336, 0).method3827(var338.field5546, 136, var337);
                return;
            }
        } else if (arg0 < 4500) {
            if (arg0 == 4400) {
                field9888 -= 2;
                int var339 = field9904[field9888];
                int var340 = field9904[field9888 + 1];
                class428 var341 = class191.field2445.method1075((byte) -65, var340);
                if (var341.method2460(-28741)) {
                    field9897[field9908++] = class348.field4436.method1900(-119, var339).method3813((byte) -99, var340, var341.field5541);
                    return;
                }
                field9904[field9888++] = class348.field4436.method1900(-116, var339).method3810(var341.field5546, 122, var340);
                return;
            }
        } else if (arg0 < 4600) {
            if (arg0 == 4500) {
                field9888 -= 2;
                int var342 = field9904[field9888];
                int var343 = field9904[field9888 + 1];
                class428 var344 = class191.field2445.method1075((byte) -65, var343);
                if (var344.method2460(-28741)) {
                    field9897[field9908++] = class671.field9319.method1804(var342, (byte) -50).method2707(var343, var344.field5541, (byte) -96);
                    return;
                }
                field9904[field9888++] = class671.field9319.method1804(var342, (byte) 118).method2708(var344.field5546, var343, false);
                return;
            }
        } else if (arg0 < 4700 && arg0 == 4600) {
            int var345 = field9904[--field9888];
            class501 var346 = class536.field6983.method92(var345, (byte) 24);
            if (var346.field6582 != null && var346.field6582.length > 0) {
                int var347 = 0;
                int var348 = var346.field6598[0];
                for (int var349 = 1; var349 < var346.field6582.length; var349++) {
                    if (var346.field6598[var349] > var348) {
                        var347 = var349;
                        var348 = var346.field6598[var349];
                    }
                }
                field9904[field9888++] = var346.field6582[var347];
                return;
            }
            field9904[field9888++] = var346.field6588;
            return;
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V")
    private static final void method3887(int arg0) {
        class477 var1 = class600.method3268(-112, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class477[] var3 = class160.field2005[var2];
        if (var3 == null) {
            class477[] var4 = class322.field4179[var2];
            int var5 = var4.length;
            var3 = class160.field2005[var2] = new class477[var5];
            class443.method2512(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class443.method2512(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "(IZ)V")
    private static final void method3888(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field9904[field9888++] = class681.field9384;
                return;
            }
            if (arg0 == 5001) {
                field9888 -= 3;
                class681.field9384 = field9904[field9888];
                class642.field8931 = class581.method3188(field9904[field9888 + 1], 3);
                if (class642.field8931 == null) {
                    class642.field8931 = class556.field7273;
                }
                class364.field4701 = field9904[field9888 + 2];
                field9900++;
                class11 var2 = class130.method931(class649.field9035, (byte) 54, class611.field8247);
                var2.field114.method2352(true, class681.field9384);
                var2.field114.method2352(true, class642.field8931.field4745);
                var2.field114.method2352(true, class364.field4701);
                class100.method760(var2, 72);
                return;
            }
            if (arg0 == 5002) {
                field9908 -= 2;
                String var3 = field9897[field9908];
                String var4 = field9897[field9908 + 1];
                field9888 -= 2;
                int var5 = field9904[field9888];
                int var6 = field9904[field9888 + 1];
                if (var4 == null) {
                    var4 = "";
                }
                if (var4.length() > 80) {
                    var4 = var4.substring(0, 80);
                }
                field9906++;
                class11 var7 = class130.method931(class649.field9035, (byte) 54, class226.field2935);
                var7.field114.method2352(true, class367.method2111(2, var3) + class367.method2111(2, var4) + 2);
                var7.field114.method2374(var3, -82);
                var7.field114.method2352(true, var5 - 1);
                var7.field114.method2352(true, var6);
                var7.field114.method2374(var4, -102);
                class100.method760(var7, 116);
                return;
            }
            if (arg0 == 5003) {
                int var8 = field9904[--field9888];
                class659 var9 = class633.method3505(true, var8);
                String var10 = "";
                if (var9 != null && var9.field9194 != null) {
                    var10 = var9.field9194;
                }
                field9897[field9908++] = var10;
                return;
            }
            if (arg0 == 5004) {
                int var11 = field9904[--field9888];
                class659 var12 = class633.method3505(true, var11);
                int var13 = -1;
                if (var12 != null) {
                    var13 = var12.field9186;
                }
                field9904[field9888++] = var13;
                return;
            }
            if (arg0 == 5005) {
                if (class642.field8931 == null) {
                    field9904[field9888++] = -1;
                    return;
                }
                field9904[field9888++] = class642.field8931.field4745;
                return;
            }
            if (arg0 == 5006) {
                int var14 = field9904[--field9888];
                class11 var15 = class130.method931(class649.field9035, (byte) 54, class105.field1378);
                var15.field114.method2352(true, var14);
                class100.method760(var15, 78);
                return;
            }
            if (arg0 == 5008) {
                String var16 = field9897[--field9908];
                method3895(var16, arg0);
                return;
            }
            if (arg0 == 5009) {
                field9908 -= 2;
                String var17 = field9897[field9908];
                String var18 = field9897[field9908 + 1];
                if (class54.field741 != 0 || (!class578.field7883 || class282.field3678) && !class597.field8076) {
                    field9911++;
                    class11 var19 = class130.method931(class649.field9035, (byte) 54, class222.field2905);
                    var19.field114.method2352(true, 0);
                    int var20 = var19.field114.field5367;
                    var19.field114.method2374(var17, -90);
                    class631.method3499(118, var18, var19.field114);
                    var19.field114.method2357(var19.field114.field5367 - var20, false);
                    class100.method760(var19, 108);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var21 = field9904[--field9888];
                class659 var22 = class633.method3505(true, var21);
                String var23 = "";
                if (var22 != null && var22.field9193 != null) {
                    var23 = var22.field9193;
                }
                field9897[field9908++] = var23;
                return;
            }
            if (arg0 == 5011) {
                int var24 = field9904[--field9888];
                class659 var25 = class633.method3505(true, var24);
                String var26 = "";
                if (var25 != null && var25.field9180 != null) {
                    var26 = var25.field9180;
                }
                field9897[field9908++] = var26;
                return;
            }
            if (arg0 == 5012) {
                int var27 = field9904[--field9888];
                class659 var28 = class633.method3505(true, var27);
                int var29 = -1;
                if (var28 != null) {
                    var29 = var28.field9185;
                }
                field9904[field9888++] = var29;
                return;
            }
            if (arg0 == 5015) {
                String var30;
                if (class233.field3130 == null || class233.field3130.field2473 == null) {
                    var30 = class135.field1784;
                } else {
                    var30 = class233.field3130.method1270((byte) -116, true);
                }
                field9897[field9908++] = var30;
                return;
            }
            if (arg0 == 5016) {
                field9904[field9888++] = class364.field4701;
                return;
            }
            if (arg0 == 5017) {
                field9904[field9888++] = class573.method3058(10294);
                return;
            }
            if (arg0 == 5018) {
                int var31 = field9904[--field9888];
                class659 var32 = class633.method3505(true, var31);
                int var33 = 0;
                if (var32 != null) {
                    var33 = var32.field9189;
                }
                field9904[field9888++] = var33;
                return;
            }
            if (arg0 == 5019) {
                int var34 = field9904[--field9888];
                class659 var35 = class633.method3505(true, var34);
                String var36 = "";
                if (var35 != null && var35.field9181 != null) {
                    var36 = var35.field9181;
                }
                field9897[field9908++] = var36;
                return;
            }
            if (arg0 == 5020) {
                String var37;
                if (class233.field3130 == null || class233.field3130.field2473 == null) {
                    var37 = class135.field1784;
                } else {
                    var37 = class233.field3130.method1274(-1, false);
                }
                field9897[field9908++] = var37;
                return;
            }
            if (arg0 == 5023) {
                int var38 = field9904[--field9888];
                class659 var39 = class633.method3505(true, var38);
                int var40 = -1;
                if (var39 != null) {
                    var40 = var39.field9190;
                }
                field9904[field9888++] = var40;
                return;
            }
            if (arg0 == 5024) {
                int var41 = field9904[--field9888];
                class659 var42 = class633.method3505(true, var41);
                int var43 = -1;
                if (var42 != null) {
                    var43 = var42.field9188;
                }
                field9904[field9888++] = var43;
                return;
            }
            if (arg0 == 5025) {
                int var44 = field9904[--field9888];
                class659 var45 = class633.method3505(true, var44);
                String var46 = "";
                if (var45 != null && var45.field9182 != null) {
                    var46 = var45.field9182;
                }
                field9897[field9908++] = var46;
                return;
            }
            if (arg0 == 5050) {
                int var47 = field9904[--field9888];
                field9897[field9908++] = class567.field7401.method1679(var47, -90).field4769;
                return;
            }
            if (arg0 == 5051) {
                int var48 = field9904[--field9888];
                class370 var49 = class567.field7401.method1679(var48, -80);
                if (var49.field4774 == null) {
                    field9904[field9888++] = 0;
                    return;
                }
                field9904[field9888++] = var49.field4774.length;
                return;
            }
            if (arg0 == 5052) {
                field9888 -= 2;
                int var50 = field9904[field9888];
                int var51 = field9904[field9888 + 1];
                class370 var52 = class567.field7401.method1679(var50, -103);
                int var53 = var52.field4774[var51];
                field9904[field9888++] = var53;
                return;
            }
            if (arg0 == 5053) {
                int var54 = field9904[--field9888];
                class370 var55 = class567.field7401.method1679(var54, -95);
                if (var55.field4776 == null) {
                    field9904[field9888++] = 0;
                    return;
                }
                field9904[field9888++] = var55.field4776.length;
                return;
            }
            if (arg0 == 5054) {
                field9888 -= 2;
                int var56 = field9904[field9888];
                int var57 = field9904[field9888 + 1];
                field9904[field9888++] = class567.field7401.method1679(var56, -107).field4776[var57];
                return;
            }
            if (arg0 == 5055) {
                int var58 = field9904[--field9888];
                field9897[field9908++] = class196.field2553.method24(var58, 32767).method255((byte) -28);
                return;
            }
            if (arg0 == 5056) {
                int var59 = field9904[--field9888];
                class30 var60 = class196.field2553.method24(var59, 32767);
                if (var60.field455 == null) {
                    field9904[field9888++] = 0;
                    return;
                }
                field9904[field9888++] = var60.field455.length;
                return;
            }
            if (arg0 == 5057) {
                field9888 -= 2;
                int var61 = field9904[field9888];
                int var62 = field9904[field9888 + 1];
                field9904[field9888++] = class196.field2553.method24(var61, 32767).field455[var62];
                return;
            }
            if (arg0 == 5058) {
                field9909 = new class371();
                field9909.field4784 = field9904[--field9888];
                field9909.field4781 = class196.field2553.method24(field9909.field4784, 32767);
                field9909.field4783 = new int[field9909.field4781.method250(-124)];
                return;
            }
            if (arg0 == 5059) {
                field9896++;
                class11 var63 = class130.method931(class649.field9035, (byte) 54, class316.field4107);
                var63.field114.method2352(true, 0);
                int var64 = var63.field114.field5367;
                var63.field114.method2352(true, 0);
                var63.field114.method2386(field9909.field4784, 1103587288);
                field9909.field4781.method247(-50, var63.field114, field9909.field4783);
                var63.field114.method2357(var63.field114.field5367 - var64, false);
                class100.method760(var63, -105);
                return;
            }
            if (arg0 == 5060) {
                String var65 = field9897[--field9908];
                field9894++;
                class11 var66 = class130.method931(class649.field9035, (byte) 54, class526.field6849);
                var66.field114.method2352(true, 0);
                int var67 = var66.field114.field5367;
                var66.field114.method2374(var65, -120);
                var66.field114.method2386(field9909.field4784, 1103587288);
                field9909.field4781.method247(-100, var66.field114, field9909.field4783);
                var66.field114.method2357(var66.field114.field5367 - var67, false);
                class100.method760(var66, 83);
                return;
            }
            if (arg0 == 5061) {
                field9896++;
                class11 var68 = class130.method931(class649.field9035, (byte) 54, class316.field4107);
                var68.field114.method2352(true, 0);
                int var69 = var68.field114.field5367;
                var68.field114.method2352(true, 1);
                var68.field114.method2386(field9909.field4784, 1103587288);
                field9909.field4781.method247(-60, var68.field114, field9909.field4783);
                var68.field114.method2357(var68.field114.field5367 - var69, false);
                class100.method760(var68, -114);
                return;
            }
            if (arg0 == 5062) {
                field9888 -= 2;
                int var70 = field9904[field9888];
                int var71 = field9904[field9888 + 1];
                field9904[field9888++] = class567.field7401.method1679(var70, -121).field4770[var71];
                return;
            }
            if (arg0 == 5063) {
                field9888 -= 2;
                int var72 = field9904[field9888];
                int var73 = field9904[field9888 + 1];
                field9904[field9888++] = class567.field7401.method1679(var72, -88).field4778[var73];
                return;
            }
            if (arg0 == 5064) {
                field9888 -= 2;
                int var74 = field9904[field9888];
                int var75 = field9904[field9888 + 1];
                if (var75 == -1) {
                    field9904[field9888++] = -1;
                    return;
                }
                field9904[field9888++] = class567.field7401.method1679(var74, -87).method2133((byte) -83, (char) var75);
                return;
            }
            if (arg0 == 5065) {
                field9888 -= 2;
                int var76 = field9904[field9888];
                int var77 = field9904[field9888 + 1];
                if (var77 == -1) {
                    field9904[field9888++] = -1;
                    return;
                }
                field9904[field9888++] = class567.field7401.method1679(var76, -112).method2134((char) var77, (byte) 8);
                return;
            }
            if (arg0 == 5066) {
                int var78 = field9904[--field9888];
                field9904[field9888++] = class196.field2553.method24(var78, 32767).method250(-96);
                return;
            }
            if (arg0 == 5067) {
                field9888 -= 2;
                int var79 = field9904[field9888];
                int var80 = field9904[field9888 + 1];
                int var81 = class196.field2553.method24(var79, 32767).method245(var80, (byte) 26).field3889;
                field9904[field9888++] = var81;
                return;
            }
            if (arg0 == 5068) {
                field9888 -= 2;
                int var82 = field9904[field9888];
                int var83 = field9904[field9888 + 1];
                field9909.field4783[var82] = var83;
                return;
            }
            if (arg0 == 5069) {
                field9888 -= 2;
                int var84 = field9904[field9888];
                int var85 = field9904[field9888 + 1];
                field9909.field4783[var84] = var85;
                return;
            }
            if (arg0 == 5070) {
                field9888 -= 3;
                int var86 = field9904[field9888];
                int var87 = field9904[field9888 + 1];
                int var88 = field9904[field9888 + 2];
                class30 var89 = class196.field2553.method24(var86, 32767);
                if (var89.method245(var87, (byte) 59).field3889 != 0) {
                    throw new RuntimeException("bad command");
                }
                field9904[field9888++] = var89.method243((byte) 120, var87, var88);
                return;
            }
            if (arg0 == 5071) {
                String var90 = field9897[--field9908];
                boolean var91 = field9904[--field9888] == 1;
                class586.method3199(8035, var91, var90);
                field9904[field9888++] = class542.field7043;
                return;
            }
            if (arg0 == 5072) {
                if (client.field1222 != null && class587.field7973 < class542.field7043) {
                    field9904[field9888++] = client.field1222[class587.field7973++] & 0xFFFF;
                    return;
                }
                field9904[field9888++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class587.field7973 = 0;
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class390.field4990.method3168(256, 86)) {
                    field9904[field9888++] = 1;
                    return;
                }
                field9904[field9888++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class390.field4990.method3168(256, 82)) {
                    field9904[field9888++] = 1;
                    return;
                }
                field9904[field9888++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class390.field4990.method3168(256, 81)) {
                    field9904[field9888++] = 1;
                    return;
                }
                field9904[field9888++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class211.method1356(field9904[--field9888], (byte) 95);
                return;
            }
            if (arg0 == 5201) {
                field9904[field9888++] = class11.method57((byte) 112);
                return;
            }
            if (arg0 == 5205) {
                class183.method1225(field9904[--field9888], false, 0, -1, -1);
                return;
            }
            if (arg0 == 5206) {
                int var92 = field9904[--field9888];
                class230 var93 = class706.method3873(var92 >> 14 & 0x3FFF, var92 & 0x3FFF);
                if (var93 == null) {
                    field9904[field9888++] = -1;
                    return;
                }
                field9904[field9888++] = var93.field3064;
                return;
            }
            if (arg0 == 5207) {
                class230 var94 = class706.method3867(field9904[--field9888]);
                if (var94 != null && var94.field3068 != null) {
                    field9897[field9908++] = var94.field3068;
                    return;
                }
                field9897[field9908++] = "";
                return;
            }
            if (arg0 == 5208) {
                field9904[field9888++] = class253.field3451;
                field9904[field9888++] = class468.field6108;
                return;
            }
            if (arg0 == 5209) {
                field9904[field9888++] = class706.field9866 + class556.field7274;
                field9904[field9888++] = class706.field9860 + class527.field6862;
                return;
            }
            if (arg0 == 5210) {
                int var95 = field9904[--field9888];
                class230 var96 = class706.method3867(var95);
                if (var96 == null) {
                    field9904[field9888++] = 0;
                    field9904[field9888++] = 0;
                    return;
                }
                field9904[field9888++] = var96.field3062 >> 14 & 0x3FFF;
                field9904[field9888++] = var96.field3062 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var97 = field9904[--field9888];
                class230 var98 = class706.method3867(var97);
                if (var98 == null) {
                    field9904[field9888++] = 0;
                    field9904[field9888++] = 0;
                    return;
                }
                field9904[field9888++] = var98.field3060 - var98.field3074;
                field9904[field9888++] = var98.field3071 - var98.field3065;
                return;
            }
            if (arg0 == 5212) {
                class700 var99 = class175.method1183(false);
                if (var99 == null) {
                    field9904[field9888++] = -1;
                    field9904[field9888++] = -1;
                    return;
                }
                field9904[field9888++] = var99.field9761;
                int var100 = var99.field9765 << 28 | class706.field9866 + var99.field9760 << 14 | class706.field9860 + var99.field9759;
                field9904[field9888++] = var100;
                return;
            }
            if (arg0 == 5213) {
                class700 var101 = class76.method617(5);
                if (var101 == null) {
                    field9904[field9888++] = -1;
                    field9904[field9888++] = -1;
                    return;
                }
                field9904[field9888++] = var101.field9761;
                int var102 = var101.field9765 << 28 | class706.field9866 + var101.field9760 << 14 | class706.field9860 + var101.field9759;
                field9904[field9888++] = var102;
                return;
            }
            if (arg0 == 5214) {
                int var103 = field9904[--field9888];
                class230 var104 = class423.method2437(34168);
                if (var104 != null) {
                    boolean var105 = var104.method1446(field9914, var103 & 0x3FFF, (byte) -92, var103 >> 28 & 0x3, var103 >> 14 & 0x3FFF);
                    if (var105) {
                        class100.method754(field9914[1], 122, field9914[2]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field9888 -= 2;
                int var106 = field9904[field9888];
                int var107 = field9904[field9888 + 1];
                class119 var108 = class706.method3875(var106 >> 14 & 0x3FFF, var106 & 0x3FFF);
                boolean var109 = false;
                for (class230 var110 = (class230) var108.method887(-128); var110 != null; var110 = (class230) var108.method892(true)) {
                    if (var110.field3064 == var107) {
                        var109 = true;
                        break;
                    }
                }
                if (var109) {
                    field9904[field9888++] = 1;
                    return;
                }
                field9904[field9888++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var111 = field9904[--field9888];
                class230 var112 = class706.method3867(var111);
                if (var112 == null) {
                    field9904[field9888++] = -1;
                    return;
                }
                field9904[field9888++] = var112.field3066;
                return;
            }
            if (arg0 == 5220) {
                field9904[field9888++] = class484.field6455 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var113 = field9904[--field9888];
                class100.method754(var113 >> 14 & 0x3FFF, 112, var113 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class230 var114 = class423.method2437(34168);
                if (var114 != null) {
                    boolean var115 = var114.method1448(field9914, (byte) 47, class706.field9860 + class527.field6862, class706.field9866 + class556.field7274);
                    if (var115) {
                        field9904[field9888++] = field9914[1];
                        field9904[field9888++] = field9914[2];
                        return;
                    }
                    field9904[field9888++] = -1;
                    field9904[field9888++] = -1;
                    return;
                }
                field9904[field9888++] = -1;
                field9904[field9888++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field9888 -= 2;
                int var116 = field9904[field9888];
                int var117 = field9904[field9888 + 1];
                class183.method1225(var116, false, 0, var117 & 0x3FFF, var117 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5224) {
                int var118 = field9904[--field9888];
                class230 var119 = class423.method2437(34168);
                if (var119 != null) {
                    boolean var120 = var119.method1446(field9914, var118 & 0x3FFF, (byte) -111, var118 >> 28 & 0x3, var118 >> 14 & 0x3FFF);
                    if (var120) {
                        field9904[field9888++] = field9914[1];
                        field9904[field9888++] = field9914[2];
                        return;
                    }
                    field9904[field9888++] = -1;
                    field9904[field9888++] = -1;
                    return;
                }
                field9904[field9888++] = -1;
                field9904[field9888++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var121 = field9904[--field9888];
                class230 var122 = class423.method2437(34168);
                if (var122 != null) {
                    boolean var123 = var122.method1448(field9914, (byte) 47, var121 & 0x3FFF, var121 >> 14 & 0x3FFF);
                    if (var123) {
                        field9904[field9888++] = field9914[1];
                        field9904[field9888++] = field9914[2];
                        return;
                    }
                    field9904[field9888++] = -1;
                    field9904[field9888++] = -1;
                    return;
                }
                field9904[field9888++] = -1;
                field9904[field9888++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class176.method1186(field9904[--field9888], (byte) -115);
                return;
            }
            if (arg0 == 5227) {
                field9888 -= 2;
                int var124 = field9904[field9888];
                int var125 = field9904[field9888 + 1];
                class183.method1225(var124, true, 0, var125 & 0x3FFF, var125 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5228) {
                class486.field6472 = field9904[--field9888] == 1;
                return;
            }
            if (arg0 == 5229) {
                field9904[field9888++] = class486.field6472 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var126 = field9904[--field9888];
                class245.method1530(var126, 4);
                return;
            }
            if (arg0 == 5231) {
                field9888 -= 2;
                int var127 = field9904[field9888];
                boolean var128 = field9904[field9888 + 1] == 1;
                if (class434.field5588 != null) {
                    class424 var129 = class434.field5588.method39((long) var127, 31750);
                    if (var129 != null && !var128) {
                        var129.method2438((byte) 123);
                        return;
                    }
                    if (var129 == null && var128) {
                        class424 var130 = new class424();
                        class434.field5588.method38(var130, 46, (long) var127);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var131 = field9904[--field9888];
                if (class434.field5588 != null) {
                    class424 var132 = class434.field5588.method39((long) var131, 31750);
                    field9904[field9888++] = var132 == null ? 0 : 1;
                    return;
                }
                field9904[field9888++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field9888 -= 2;
                int var133 = field9904[field9888];
                boolean var134 = field9904[field9888 + 1] == 1;
                if (class33.field491 != null) {
                    class424 var135 = class33.field491.method39((long) var133, 31750);
                    if (var135 != null && !var134) {
                        var135.method2438((byte) -105);
                        return;
                    }
                    if (var135 == null && var134) {
                        class424 var136 = new class424();
                        class33.field491.method38(var136, -98, (long) var133);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var137 = field9904[--field9888];
                if (class33.field491 != null) {
                    class424 var138 = class33.field491.method39((long) var137, 31750);
                    field9904[field9888++] = var138 == null ? 0 : 1;
                    return;
                }
                field9904[field9888++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field9904[field9888++] = class706.field9826 == null ? -1 : class706.field9826.field3064;
                return;
            }
            if (arg0 == 5236) {
                field9888 -= 2;
                int var139 = field9904[field9888];
                int var140 = field9904[field9888 + 1];
                int var141 = var140 >> 14 & 0x3FFF;
                int var142 = var140 & 0x3FFF;
                int var143 = class400.method2284(var141, var142, var139, 24214);
                if (var143 < 0) {
                    field9904[field9888++] = -1;
                    return;
                }
                field9904[field9888++] = var143;
                return;
            }
            if (arg0 == 5237) {
                class693.method3775(-53);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field9888 -= 2;
                int var144 = field9904[field9888];
                int var145 = field9904[field9888 + 1];
                class658.method3617(3, var144, var145, false, 11015);
                field9904[field9888++] = class114.field1483 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class114.field1483 != null) {
                    class658.method3617(class260.field3509.field1293, -1, -1, false, 11015);
                }
                return;
            }
            if (arg0 == 5302) {
                class169[] var146 = class79.method627((byte) -96);
                field9904[field9888++] = var146.length;
                return;
            }
            if (arg0 == 5303) {
                int var147 = field9904[--field9888];
                class169[] var148 = class79.method627((byte) -96);
                field9904[field9888++] = var148[var147].field2105;
                field9904[field9888++] = var148[var147].field2103;
                return;
            }
            if (arg0 == 5305) {
                int var149 = class260.field3509.field1264;
                int var150 = class260.field3509.field1266;
                int var151 = -1;
                class169[] var152 = class79.method627((byte) -96);
                for (int var153 = 0; var153 < var152.length; var153++) {
                    class169 var154 = var152[var153];
                    if (var154.field2105 == var149 && var154.field2103 == var150) {
                        var151 = var153;
                        break;
                    }
                }
                field9904[field9888++] = var151;
                return;
            }
            if (arg0 == 5306) {
                field9904[field9888++] = class62.method528(2);
                return;
            }
            if (arg0 == 5307) {
                int var155 = field9904[--field9888];
                if (var155 >= 1 && var155 <= 2) {
                    class658.method3617(var155, -1, -1, false, 11015);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field9904[field9888++] = class260.field3509.field1293;
                return;
            }
            if (arg0 == 5309) {
                int var156 = field9904[--field9888];
                if (var156 >= 1 && var156 <= 2) {
                    class260.field3509.field1293 = var156;
                    class260.field3509.method1574(class688.field9413, false);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field9908 -= 2;
                String var157 = field9897[field9908];
                String var158 = field9897[field9908 + 1];
                int var159 = field9904[--field9888];
                field9895++;
                class11 var160 = class130.method931(class649.field9035, (byte) 54, class448.field5856);
                var160.field114.method2352(true, class367.method2111(2, var157) + class367.method2111(2, var158) + 1);
                var160.field114.method2374(var157, -93);
                var160.field114.method2374(var158, -83);
                var160.field114.method2352(true, var159);
                class100.method760(var160, -114);
                return;
            }
            if (arg0 == 5401) {
                field9888 -= 2;
                class195.field2548[field9904[field9888]] = (short) class608.method3305(false, field9904[field9888 + 1]);
                class232.field3109.method1295((byte) -114);
                class232.field3109.method1289(-99);
                class646.field8998.method515((byte) 62);
                class211.method1355(-21784);
                return;
            }
            if (arg0 == 5405) {
                field9888 -= 2;
                int var161 = field9904[field9888];
                int var162 = field9904[field9888 + 1];
                if (var161 >= 0 && var161 < 2) {
                    class593.field8022[var161] = new int[var162 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field9888 -= 7;
                int var163 = field9904[field9888];
                int var164 = field9904[field9888 + 1] << 1;
                int var165 = field9904[field9888 + 2];
                int var166 = field9904[field9888 + 3];
                int var167 = field9904[field9888 + 4];
                int var168 = field9904[field9888 + 5];
                int var169 = field9904[field9888 + 6];
                if (var163 >= 0 && var163 < 2 && class593.field8022[var163] != null && var164 >= 0 && var164 < class593.field8022[var163].length) {
                    class593.field8022[var163][var164] = new int[] { (var165 >> 14 & 0x3FFF) << 9, var166 << 2, (var165 & 0x3FFF) << 9, var169 };
                    class593.field8022[var163][var164 + 1] = new int[] { (var167 >> 14 & 0x3FFF) << 9, var168 << 2, (var167 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var170 = class593.field8022[field9904[--field9888]].length >> 1;
                field9904[field9888++] = var170;
                return;
            }
            if (arg0 == 5411) {
                if (class114.field1483 != null) {
                    class658.method3617(class260.field3509.field1293, -1, -1, false, 11015);
                }
                if (class425.field5520 != null) {
                    class136.method990(0);
                    System.exit(0);
                    return;
                }
                String var171 = class514.field6736 == null ? class550.method2913(false) : class514.field6736;
                class183.method1227(false, var171, false, class364.field4697 == 1, class688.field9413);
                return;
            }
            if (arg0 == 5419) {
                String var172 = "";
                if (class100.field1323 != null) {
                    if (class100.field1323.field7113 == null) {
                        var172 = class601.method3273(-31337, class100.field1323.field7111);
                    } else {
                        var172 = (String) class100.field1323.field7113;
                    }
                }
                field9897[field9908++] = var172;
                return;
            }
            if (arg0 == 5420) {
                field9904[field9888++] = class688.field9413.field1823 ? 0 : 1;
                return;
            }
            if (arg0 == 5421) {
                if (class114.field1483 != null) {
                    class658.method3617(class260.field3509.field1293, -1, -1, false, 11015);
                }
                String var173 = field9897[--field9908];
                boolean var174 = field9904[--field9888] == 1;
                String var175 = class550.method2913(false) + var173;
                class183.method1227(false, var175, var174, class364.field4697 == 1, class688.field9413);
                return;
            }
            if (arg0 == 5422) {
                field9908 -= 2;
                String var176 = field9897[field9908];
                String var177 = field9897[field9908 + 1];
                int var178 = field9904[--field9888];
                if (var176.length() > 0) {
                    if (class543.field7051 == null) {
                        class543.field7051 = new String[class25.field311[class153.field1947.field8837]];
                    }
                    class543.field7051[var178] = var176;
                }
                if (var177.length() > 0) {
                    if (class230.field3080 == null) {
                        class230.field3080 = new String[class25.field311[class153.field1947.field8837]];
                    }
                    class230.field3080[var178] = var177;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field9897[--field9908]);
                return;
            }
            if (arg0 == 5424) {
                field9888 -= 11;
                class358.field4638 = field9904[field9888];
                class641.field8910 = field9904[field9888 + 1];
                class414.field5322 = field9904[field9888 + 2];
                class442.field5719 = field9904[field9888 + 3];
                class294.field3811 = field9904[field9888 + 4];
                class78.field1075 = field9904[field9888 + 5];
                class368.field4749 = field9904[field9888 + 6];
                class425.field5519 = field9904[field9888 + 7];
                class264.field3530 = field9904[field9888 + 8];
                class27.field398 = field9904[field9888 + 9];
                class255.field3461 = field9904[field9888 + 10];
                class90.field1186.method3362(class294.field3811, -127);
                class90.field1186.method3362(class78.field1075, -101);
                class90.field1186.method3362(class368.field4749, -121);
                class90.field1186.method3362(class425.field5519, -115);
                class90.field1186.method3362(class264.field3530, -107);
                class356.field4617 = null;
                class87.field1156 = null;
                class526.field6856 = null;
                class413.field5316 = null;
                class483.field6437 = null;
                class80.field1103 = null;
                class572.field7449 = null;
                class237.field3201 = null;
                class288.field3723 = true;
                return;
            }
            if (arg0 == 5425) {
                class418.method2408(126);
                class288.field3723 = false;
                return;
            }
            if (arg0 == 5426) {
                field9888 -= 2;
                class252.field3441 = field9904[field9888];
                class384.field4916 = field9904[field9888 + 1];
                return;
            }
            if (arg0 == 5427) {
                field9888 -= 2;
                class482.field6415 = field9904[field9888 + 1];
                return;
            }
            if (arg0 == 5428) {
                field9888 -= 2;
                int var179 = field9904[field9888];
                int var180 = field9904[field9888 + 1];
                field9904[field9888++] = class46.method429((byte) 103, var179, var180) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class640.method3528(field9897[--field9908], false, -4, false);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class92.method688(-13381, "accountcreated", class348.field4462);
                    return;
                } catch (Throwable var309) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class92.method688(-13381, "accountcreatestarted", class348.field4462);
                    return;
                } catch (Throwable var310) {
                    return;
                }
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field9888 -= 4;
                int var181 = field9904[field9888];
                int var182 = field9904[field9888 + 1];
                int var183 = field9904[field9888 + 2];
                int var184 = field9904[field9888 + 3];
                class203.method1321(false, var182 << 2, var184, (var181 >> 14 & 0x3FFF) - class100.field1326, var183, (var181 & 0x3FFF) - class186.field2376, (byte) -21);
                return;
            }
            if (arg0 == 5501) {
                field9888 -= 4;
                int var185 = field9904[field9888];
                int var186 = field9904[field9888 + 1];
                int var187 = field9904[field9888 + 2];
                int var188 = field9904[field9888 + 3];
                class72.method579(var188, (var185 >> 14 & 0x3FFF) - class100.field1326, var186 << 2, (var185 & 0x3FFF) - class186.field2376, var187, false);
                return;
            }
            if (arg0 == 5502) {
                field9888 -= 6;
                int var189 = field9904[field9888];
                if (var189 >= 2) {
                    throw new RuntimeException();
                }
                class424.field5505 = var189;
                int var190 = field9904[field9888 + 1];
                if (var190 + 1 >= class593.field8022[class424.field5505].length >> 1) {
                    throw new RuntimeException();
                }
                class191.field2442 = var190;
                class171.field2121 = 0;
                class564.field7366 = field9904[field9888 + 2];
                class50.field705 = field9904[field9888 + 3];
                int var191 = field9904[field9888 + 4];
                if (var191 >= 2) {
                    throw new RuntimeException();
                }
                class660.field9205 = var191;
                int var192 = field9904[field9888 + 5];
                if (var192 + 1 >= class593.field8022[class660.field9205].length >> 1) {
                    throw new RuntimeException();
                }
                class487.field6475 = var192;
                class704.field9810 = 3;
                return;
            }
            if (arg0 == 5503) {
                class284.method1696(-62);
                return;
            }
            if (arg0 == 5504) {
                field9888 -= 2;
                class51.method456(field9904[field9888 + 1], 0, 67, field9904[field9888]);
                return;
            }
            if (arg0 == 5505) {
                field9904[field9888++] = (int) class710.field9918 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field9904[field9888++] = (int) class141.field1859 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class392.method2233(false);
                return;
            }
            if (arg0 == 5508) {
                class440.method2497(-25035);
                return;
            }
            if (arg0 == 5509) {
                class27.method233(34);
                return;
            }
            if (arg0 == 5510) {
                class111.method853(false);
                return;
            }
            if (arg0 == 5511) {
                int var193 = field9904[--field9888];
                int var194 = var193 >> 14 & 0x3FFF;
                int var195 = var193 & 0x3FFF;
                int var196 = var194 - class100.field1326;
                if (var196 < 0) {
                    var196 = 0;
                } else if (var196 >= class611.field8258) {
                    var196 = class611.field8258;
                }
                int var197 = var195 - class186.field2376;
                if (var197 < 0) {
                    var197 = 0;
                } else if (var197 >= class656.field9155) {
                    var197 = class656.field9155;
                }
                class425.field5518 = (var196 << 9) + 256;
                class509.field6669 = (var197 << 9) + 256;
                class704.field9810 = 4;
                return;
            }
            if (arg0 == 5512) {
                class680.method3739((byte) -76);
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field9908 -= 2;
                String var198 = field9897[field9908];
                String var199 = field9897[field9908 + 1];
                int var200 = field9904[--field9888];
                if (class566.field7391 != 3) {
                    return;
                }
                if (class60.field816 == 0 && class45.field627 == 0) {
                    class135.field1784 = var198;
                    class83.field1128 = var199;
                    class222.field2906 = var200;
                    class442.method2508(6, 1);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class392.method2235(4096);
                return;
            }
            if (arg0 == 5602) {
                if (class60.field816 == 0) {
                    class668.field9280 = -2;
                    class540.field7019 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field9888 -= 4;
                if (class566.field7391 != 3) {
                    return;
                }
                if (class60.field816 == 0 && class45.field627 == 0) {
                    class500.method2706(field9904[field9888 + 2], 0, field9904[field9888 + 1], field9904[field9888], field9904[field9888 + 3]);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field9908--;
                if (class566.field7391 != 3) {
                    return;
                }
                if (class60.field816 == 0 && class45.field627 == 0) {
                    class237.method1496(16384, class510.method2746(field9897[field9908], (byte) 72));
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field9908 -= 2;
                if (class566.field7391 != 3) {
                    return;
                }
                if (class60.field816 == 0 && class45.field627 == 0) {
                    class699.method3821(class510.method2746(field9897[field9908], (byte) 72), -107, field9897[field9908 + 1], false);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class45.field627 == 0) {
                    class291.field3766 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field9904[field9888++] = class540.field7019;
                return;
            }
            if (arg0 == 5608) {
                field9904[field9888++] = class561.field7329;
                return;
            }
            if (arg0 == 5609) {
                field9904[field9888++] = class291.field3766;
                return;
            }
            if (arg0 == 5610) {
                for (int var201 = 0; var201 < 5; var201++) {
                    field9897[field9908++] = class691.field9448.length > var201 ? class347.method1995((byte) -3, class691.field9448[var201]) : "";
                }
                class691.field9448 = null;
                return;
            }
            if (arg0 == 5611) {
                field9904[field9888++] = class219.field2881;
                return;
            }
            if (arg0 == 5612) {
                int var202 = field9904[--field9888];
                if (class566.field7391 != 7) {
                    return;
                }
                if (class60.field816 == 0 && class45.field627 == 0) {
                    if (class2.field15 != null) {
                        class2.field15.method281(0);
                        class2.field15 = null;
                    }
                    class222.field2906 = var202;
                    class442.method2508(9, 1);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field9904[field9888++] = class540.field7019;
                return;
            }
            if (arg0 == 5615) {
                field9908 -= 2;
                String var203 = field9897[field9908];
                String var204 = field9897[field9908 + 1];
                if (class566.field7391 != 3) {
                    return;
                }
                if (class60.field816 == 0 && class45.field627 == 0) {
                    if (class2.field15 != null) {
                        class2.field15.method281(0);
                        class2.field15 = null;
                    }
                    class135.field1784 = var203;
                    class83.field1128 = var204;
                    class442.method2508(5, 1);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class250.method1577(3, false);
                return;
            }
            if (arg0 == 5617) {
                field9904[field9888++] = class668.field9280;
                return;
            }
            if (arg0 == 5618) {
                int var205 = field9904[--field9888];
                class483.method2665(var205, 3, false);
                return;
            }
            if (arg0 == 5619) {
                int var206 = field9904[--field9888];
                class483.method2665(var206, 3, true);
                return;
            }
            if (arg0 == 5620) {
                class601.method3272(-86);
                if (class635.field8834 != "" && class635.field8834 != "") {
                    field9904[field9888++] = 1;
                    return;
                }
                field9904[field9888++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field9908 -= 2;
                if (class566.field7391 != 3) {
                    return;
                }
                if (class60.field816 == 0 && class45.field627 == 0) {
                    class699.method3821(class510.method2746(field9897[field9908], (byte) 72), -66, field9897[field9908 + 1], true);
                    return;
                }
                return;
            }
            if (arg0 == 5622) {
                class548 var207 = class688.field9413.method1045("3", (byte) -48, false);
                while (var207.field7108 == 0) {
                    class122.method905(1L, -6145);
                }
                if (var207.field7108 == 2) {
                    throw new RuntimeException("Error opening file");
                }
                class218 var208 = (class218) var207.field7113;
                if (var208.method1388(10175).exists()) {
                    class418 var209 = new class418(50);
                    try {
                        var208.method1393(50, var209.field5393, (byte) 112, 0);
                    } catch (IOException var312) {
                    }
                }
                try {
                    var208.method1397(true);
                    return;
                } catch (Exception var311) {
                    return;
                }
            }
            if (arg0 == 5623) {
                if (class285.field3701 != null) {
                    field9904[field9888++] = 1;
                    return;
                }
                field9904[field9888++] = 0;
                return;
            }
            if (arg0 == 5624) {
                field9904[field9888++] = (int) (class569.field7432 >> 32);
                field9904[field9888++] = (int) (class569.field7432 & 0xFFFFL);
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var210 = field9904[--field9888];
                if (var210 < 1) {
                    var210 = 1;
                }
                if (var210 > 4) {
                    var210 = 4;
                }
                class260.field3509.field1301 = var210;
                class469.method2607((byte) -121);
                class260.field3509.method1574(class688.field9413, false);
                class249.field3389 = false;
                return;
            }
            if (arg0 == 6002) {
                class260.field3509.method1588(field9904[--field9888] == 1, true);
                class469.method2607((byte) 8);
                class540.method2867(3);
                class260.field3509.method1574(class688.field9413, false);
                class249.field3389 = false;
                return;
            }
            if (arg0 == 6003) {
                class260.field3509.field1295 = field9904[--field9888] == 1;
                class540.method2867(3);
                class260.field3509.method1574(class688.field9413, false);
                class249.field3389 = false;
                return;
            }
            if (arg0 == 6005) {
                class260.field3509.field1267 = field9904[--field9888] == 1;
                class469.method2607((byte) 97);
                class260.field3509.method1574(class688.field9413, false);
                class249.field3389 = false;
                return;
            }
            if (arg0 == 6006) {
                class260.field3509.field1297 = field9904[--field9888] == 1;
                class520.field6799.method332(!class260.field3509.field1297);
                class260.field3509.method1574(class688.field9413, false);
                class249.field3389 = false;
                return;
            }
            if (arg0 == 6007) {
                class260.field3509.field1271 = field9904[--field9888];
                class260.field3509.method1574(class688.field9413, false);
                class249.field3389 = false;
                return;
            }
            if (arg0 == 6008) {
                class260.field3509.field1282 = field9904[--field9888] == 1;
                class260.field3509.method1574(class688.field9413, false);
                class249.field3389 = false;
                return;
            }
            if (arg0 == 6009) {
                class260.field3509.field1304 = field9904[--field9888] == 1;
                class469.method2607((byte) -115);
                class260.field3509.method1574(class688.field9413, false);
                class249.field3389 = false;
                return;
            }
            if (arg0 == 6010) {
                class260.field3509.field1269 = field9904[--field9888] == 1;
                class260.field3509.method1574(class688.field9413, false);
                class249.field3389 = false;
                return;
            }
            if (arg0 == 6011) {
                int var211 = field9904[--field9888];
                if (var211 < 0 || var211 > 2) {
                    var211 = 0;
                }
                class260.field3509.method735(var211, class364.field4697, -117);
                class469.method2607((byte) -123);
                class260.field3509.method1574(class688.field9413, false);
                class249.field3389 = false;
                return;
            }
            if (arg0 == 6012) {
                class260.field3509.method737(class364.field4697, 25, field9904[--field9888] == 1);
                class24.method129(28260);
                class693.method3772((byte) 47);
                class260.field3509.method1574(class688.field9413, false);
                class249.field3389 = false;
                return;
            }
            if (arg0 == 6014) {
                class260.field3509.field1279 = field9904[--field9888] == 1;
                class469.method2607((byte) 42);
                class260.field3509.method1574(class688.field9413, false);
                class249.field3389 = false;
                return;
            }
            if (arg0 == 6015) {
                class260.field3509.field1278 = field9904[--field9888] == 1;
                class469.method2607((byte) -116);
                class260.field3509.method1574(class688.field9413, false);
                class249.field3389 = false;
                return;
            }
            if (arg0 == 6016) {
                int var212 = field9904[--field9888];
                if (var212 < 0 || var212 > 2) {
                    var212 = 0;
                }
                class260.field3509.field1287 = var212;
                class11.method58(class364.field4697, -98);
                class260.field3509.method1574(class688.field9413, false);
                return;
            }
            if (arg0 == 6017) {
                class260.field3509.field1294 = field9904[--field9888] == 1;
                class401.method2288(false);
                class260.field3509.method1574(class688.field9413, false);
                class249.field3389 = false;
                return;
            }
            if (arg0 == 6018) {
                int var213 = field9904[--field9888];
                if (var213 < 0) {
                    var213 = 0;
                }
                if (var213 > 127) {
                    var213 = 127;
                }
                class260.field3509.field1289 = var213;
                class260.field3509.method1574(class688.field9413, false);
                class249.field3389 = false;
                return;
            }
            if (arg0 == 6019) {
                int var214 = field9904[--field9888];
                if (var214 < 0) {
                    var214 = 0;
                }
                if (var214 > 255) {
                    var214 = 255;
                }
                if (class260.field3509.field1276 != var214) {
                    if (class260.field3509.field1276 == 0 && class166.field2085 != -1) {
                        class597.method3247(var214, 8364, class6.field53, false, 0, class166.field2085);
                        class60.field823 = false;
                    } else if (var214 == 0) {
                        class81.method633((byte) -122);
                        class60.field823 = false;
                    } else {
                        class50.method446((byte) 58, var214);
                    }
                    class260.field3509.field1276 = var214;
                }
                class260.field3509.method1574(class688.field9413, false);
                class249.field3389 = false;
                return;
            }
            if (arg0 == 6020) {
                int var215 = field9904[--field9888];
                if (var215 < 0) {
                    var215 = 0;
                }
                if (var215 > 127) {
                    var215 = 127;
                }
                class260.field3509.field1285 = var215;
                class260.field3509.method1574(class688.field9413, false);
                class249.field3389 = false;
                return;
            }
            if (arg0 == 6021) {
                class260.field3509.field3404 = field9904[--field9888] == 1;
                class540.method2867(3);
                return;
            }
            if (arg0 == 6023) {
                int var216 = field9904[--field9888];
                boolean var217 = false;
                if (var216 < 0) {
                    var216 = 0;
                }
                if (var216 > 2) {
                    var216 = 2;
                }
                if (class331.field4308 < 96) {
                    var216 = 0;
                    var217 = true;
                }
                class635.method3509(var216, -101);
                class260.field3509.method1574(class688.field9413, false);
                class249.field3389 = false;
                field9904[field9888++] = var217 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var218 = field9904[--field9888];
                if (var218 < 0 || var218 > 2) {
                    var218 = 0;
                }
                class260.field3509.field1277 = var218;
                class260.field3509.method1574(class688.field9413, false);
                return;
            }
            if (arg0 == 6025) {
                int var219 = field9904[--field9888];
                if (var219 < 0 || var219 > class181.method1203(class331.field4308, 0)) {
                    var219 = 0;
                }
                class260.field3509.field1296 = var219;
                class260.field3509.method1574(class688.field9413, false);
                class249.field3389 = false;
                return;
            }
            if (arg0 == 6027) {
                int var220 = field9904[--field9888];
                if (var220 < 0 || var220 > 1) {
                    var220 = 0;
                }
                class47.method431(var220 == 1, 125);
                return;
            }
            if (arg0 == 6028) {
                class260.field3509.field1292 = field9904[--field9888] != 0;
                class260.field3509.method1574(class688.field9413, false);
                return;
            }
            if (arg0 == 6029) {
                class260.field3509.field1271 = field9904[--field9888];
                class260.field3509.method1574(class688.field9413, false);
                return;
            }
            if (arg0 == 6030) {
                class260.field3509.field1268 = field9904[--field9888] != 0;
                class260.field3509.method1574(class688.field9413, false);
                class469.method2607((byte) 88);
                return;
            }
            if (arg0 == 6031) {
                int var221 = field9904[--field9888];
                if (var221 < 0 || var221 > 5) {
                    var221 = 2;
                }
                class11.method58(var221, -104);
                return;
            }
            if (arg0 == 6032) {
                int var222 = field9904[--field9888];
                if (var222 < 0 || var222 > 5) {
                    var222 = 2;
                }
                class260.field3509.field1275 = var222;
                class260.field3509.method1574(class688.field9413, false);
                class249.field3389 = false;
                return;
            }
            if (arg0 == 6033) {
                int var223 = field9904[--field9888];
                if (var223 < 0 || var223 > 4) {
                    var223 = 2;
                }
                class260.field3509.field1306 = var223;
                class260.field3509.method1574(class688.field9413, false);
                return;
            }
            if (arg0 == 6034) {
                class260.field3509.field1286 = field9904[--field9888] == 1;
                class260.field3509.method1574(class688.field9413, false);
                class24.method129(28260);
                class249.field3389 = false;
                return;
            }
            if (arg0 == 6035) {
                class260.field3509.field3415 = field9904[--field9888] == 1;
                class469.method2607((byte) 69);
                class540.method2867(3);
                return;
            }
            if (arg0 == 6036) {
                int var224 = field9904[--field9888];
                if (var224 < 0 || var224 > 2) {
                    var224 = 0;
                }
                class260.field3509.method1572((byte) -107, var224);
                class260.field3509.method1574(class688.field9413, false);
                return;
            }
            if (arg0 == 6037) {
                int var225 = field9904[--field9888];
                if (var225 < 0) {
                    var225 = 0;
                }
                if (var225 > 127) {
                    var225 = 127;
                }
                class260.field3509.field1280 = var225;
                class260.field3509.method1574(class688.field9413, false);
                class249.field3389 = false;
                return;
            }
            if (arg0 == 6038) {
                int var226 = field9904[--field9888];
                if (var226 < 0) {
                    var226 = 0;
                }
                if (var226 > 255) {
                    var226 = 255;
                }
                if (class260.field3509.field1302 != var226 && class413.field5317 == class166.field2085) {
                    if (class260.field3509.field1302 == 0) {
                        class597.method3247(var226, 8364, class6.field53, false, 0, class166.field2085);
                        class60.field823 = false;
                    } else if (var226 == 0) {
                        class81.method633((byte) -122);
                        class60.field823 = false;
                    } else {
                        class50.method446((byte) 58, var226);
                    }
                }
                class260.field3509.field1302 = var226;
                class260.field3509.method1574(class688.field9413, false);
                class249.field3389 = false;
                return;
            }
            if (arg0 == 6039) {
                int var227 = field9904[--field9888];
                if (var227 > 255 || var227 < 0) {
                    var227 = 0;
                }
                if (class260.field3509.field1262 != var227) {
                    class260.field3509.field1262 = var227;
                    class260.field3509.method1574(class688.field9413, false);
                    class249.field3389 = false;
                }
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field9904[field9888++] = class260.field3509.field1301;
                return;
            }
            if (arg0 == 6102) {
                field9904[field9888++] = class260.field3509.method1584(-1, class364.field4697) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field9904[field9888++] = class260.field3509.field1295 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field9904[field9888++] = class260.field3509.field1267 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field9904[field9888++] = class260.field3509.field1297 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field9904[field9888++] = class260.field3509.field1271;
                return;
            }
            if (arg0 == 6108) {
                field9904[field9888++] = class260.field3509.field1282 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field9904[field9888++] = class260.field3509.field1304 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field9904[field9888++] = class260.field3509.field1269 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field9904[field9888++] = class260.field3509.method733(class364.field4697, (byte) -55);
                return;
            }
            if (arg0 == 6112) {
                field9904[field9888++] = class260.field3509.method734((byte) 86, class364.field4697) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field9904[field9888++] = class260.field3509.field1279 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field9904[field9888++] = class260.field3509.field1278 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field9904[field9888++] = class260.field3509.field1287;
                return;
            }
            if (arg0 == 6117) {
                field9904[field9888++] = class260.field3509.field1294 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field9904[field9888++] = class260.field3509.field1289;
                return;
            }
            if (arg0 == 6119) {
                field9904[field9888++] = class260.field3509.field1276;
                return;
            }
            if (arg0 == 6120) {
                field9904[field9888++] = class260.field3509.field1285;
                return;
            }
            if (arg0 == 6121) {
                field9904[field9888++] = class520.field6799.method355() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field9904[field9888++] = class26.method151(1818702860);
                return;
            }
            if (arg0 == 6124) {
                field9904[field9888++] = class260.field3509.field1277;
                return;
            }
            if (arg0 == 6125) {
                field9904[field9888++] = class260.field3509.field1296;
                return;
            }
            if (arg0 == 6126) {
                field9904[field9888++] = class520.field6799.method327() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field9904[field9888++] = class260.field3509.field1261 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field9904[field9888++] = class260.field3509.field1292 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field9904[field9888++] = class260.field3509.field1271;
                return;
            }
            if (arg0 == 6130) {
                field9904[field9888++] = class260.field3509.field1268 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field9904[field9888++] = class364.field4697;
                return;
            }
            if (arg0 == 6132) {
                field9904[field9888++] = class260.field3509.field1275;
                return;
            }
            if (arg0 == 6133) {
                field9904[field9888++] = class688.field9413.field1823 && !class688.field9413.field1841 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field9904[field9888++] = class181.method1203(class331.field4308, 0);
                return;
            }
            if (arg0 == 6135) {
                field9904[field9888++] = class260.field3509.field1306;
                return;
            }
            if (arg0 == 6136) {
                field9904[field9888++] = class260.field3509.field1286 ? 1 : 0;
                return;
            }
            if (arg0 == 6137) {
                boolean var228 = true;
                try {
                    var228 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                } catch (Throwable var313) {
                }
                field9904[field9888++] = var228 ? 1 : 0;
                return;
            }
            if (arg0 == 6138) {
                field9904[field9888++] = class441.method2498((byte) 31, 200, class364.field4697);
                return;
            }
            if (arg0 == 6139) {
                field9904[field9888++] = class260.field3509.method1589(class364.field4697, (byte) 103);
                return;
            }
            if (arg0 == 6140) {
                byte var229 = 0;
                if (class135.method987(class364.field4697, (byte) 120) && class331.field4308 < 96) {
                    var229 = 1;
                }
                field9904[field9888++] = var229;
                return;
            }
            if (arg0 == 6141) {
                if (class331.field4308 < 96) {
                    field9904[field9888++] = 0;
                    return;
                }
                field9904[field9888++] = 2;
                return;
            }
            if (arg0 == 6142) {
                field9904[field9888++] = class260.field3509.field1280;
                return;
            }
            if (arg0 == 6143) {
                field9904[field9888++] = class260.field3509.field1302;
                return;
            }
            if (arg0 == 6144) {
                field9904[field9888++] = class326.field4244 ? 1 : 0;
                return;
            }
            if (arg0 == 6145) {
                field9904[field9888++] = class260.field3509.field1262;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field9888 -= 2;
                class40.field572 = (short) field9904[field9888];
                if (class40.field572 <= 0) {
                    class40.field572 = 256;
                }
                class298.field3897 = (short) field9904[field9888 + 1];
                if (class298.field3897 <= 0) {
                    class298.field3897 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field9888 -= 2;
                class93.field1236 = (short) field9904[field9888];
                if (class93.field1236 <= 0) {
                    class93.field1236 = 256;
                }
                class119.field1546 = (short) field9904[field9888 + 1];
                if (class119.field1546 <= 0) {
                    class119.field1546 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field9888 -= 4;
                class684.field9397 = (short) field9904[field9888];
                if (class684.field9397 <= 0) {
                    class684.field9397 = 1;
                }
                class15.field163 = (short) field9904[field9888 + 1];
                if (class15.field163 <= 0) {
                    class15.field163 = 32767;
                } else if (class15.field163 < class684.field9397) {
                    class15.field163 = class684.field9397;
                }
                class301.field3919 = (short) field9904[field9888 + 2];
                if (class301.field3919 <= 0) {
                    class301.field3919 = 1;
                }
                class371.field4785 = (short) field9904[field9888 + 3];
                if (class371.field4785 <= 0) {
                    class371.field4785 = 32767;
                    return;
                }
                if (class371.field4785 < class301.field3919) {
                    class371.field4785 = class301.field3919;
                }
                return;
            }
            if (arg0 == 6203) {
                class472.method2615(15993, 0, false, class256.field3466.field6224, class256.field3466.field6372, 0);
                field9904[field9888++] = class376.field4814;
                field9904[field9888++] = class40.field568;
                return;
            }
            if (arg0 == 6204) {
                field9904[field9888++] = class93.field1236;
                field9904[field9888++] = class119.field1546;
                return;
            }
            if (arg0 == 6205) {
                field9904[field9888++] = class40.field572;
                field9904[field9888++] = class298.field3897;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field9904[field9888++] = (int) (class584.method3191(1) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field9904[field9888++] = (int) (class584.method3191(1) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field9888 -= 3;
                int var230 = field9904[field9888];
                int var231 = field9904[field9888 + 1];
                int var232 = field9904[field9888 + 2];
                field9903.clear();
                field9903.set(11, 12);
                field9903.set(var232, var231, var230);
                int var233 = (int) (field9903.getTime().getTime() / 86400000L) - 11745;
                if (var232 < 1970) {
                    var233--;
                }
                field9904[field9888++] = var233;
                return;
            }
            if (arg0 == 6303) {
                field9903.clear();
                field9903.setTime(new Date(class584.method3191(1)));
                field9904[field9888++] = field9903.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var234 = field9904[--field9888];
                boolean var235 = true;
                if (var234 < 0) {
                    var235 = (var234 + 1) % 4 == 0;
                } else if (var234 < 1582) {
                    var235 = var234 % 4 == 0;
                } else if (var234 % 4 != 0) {
                    var235 = false;
                } else if (var234 % 100 != 0) {
                    var235 = true;
                } else if (var234 % 400 != 0) {
                    var235 = false;
                }
                field9904[field9888++] = var235 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field9904[field9888++] = class284.method1698(0) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field9904[field9888++] = class505.method2722(64) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class566.field7391 == 7 && class60.field816 == 0 && class45.field627 == 0) {
                    if (class388.field4977) {
                        field9904[field9888++] = 0;
                        return;
                    }
                    if (class637.field8875 > class584.method3191(1) - 1000L) {
                        field9904[field9888++] = 1;
                        return;
                    }
                    class388.field4977 = true;
                    class11 var236 = class130.method931(class649.field9035, (byte) 54, class660.field9197);
                    var236.field114.method2353(class260.field3505, (byte) -50);
                    class100.method760(var236, -112);
                    field9904[field9888++] = 0;
                    return;
                }
                field9904[field9888++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class138 var237 = class677.method3721(true);
                if (var237 != null) {
                    field9904[field9888++] = var237.field1811;
                    field9904[field9888++] = var237.field161;
                    field9897[field9908++] = var237.field1809;
                    class684 var238 = var237.method1040((byte) 123);
                    field9904[field9888++] = var238.field9395;
                    field9897[field9908++] = var238.field9396;
                    field9904[field9888++] = var237.field154;
                    field9904[field9888++] = var237.field1808;
                    field9897[field9908++] = var237.field1817;
                    return;
                }
                field9904[field9888++] = -1;
                field9904[field9888++] = 0;
                field9897[field9908++] = "";
                field9904[field9888++] = 0;
                field9897[field9908++] = "";
                field9904[field9888++] = 0;
                field9904[field9888++] = 0;
                field9897[field9908++] = "";
                return;
            }
            if (arg0 == 6502) {
                class138 var239 = class368.method2120(false);
                if (var239 != null) {
                    field9904[field9888++] = var239.field1811;
                    field9904[field9888++] = var239.field161;
                    field9897[field9908++] = var239.field1809;
                    class684 var240 = var239.method1040((byte) 91);
                    field9904[field9888++] = var240.field9395;
                    field9897[field9908++] = var240.field9396;
                    field9904[field9888++] = var239.field154;
                    field9904[field9888++] = var239.field1808;
                    field9897[field9908++] = var239.field1817;
                    return;
                }
                field9904[field9888++] = -1;
                field9904[field9888++] = 0;
                field9897[field9908++] = "";
                field9904[field9888++] = 0;
                field9897[field9908++] = "";
                field9904[field9888++] = 0;
                field9904[field9888++] = 0;
                field9897[field9908++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var241 = field9904[--field9888];
                String var242 = field9897[--field9908];
                if (class566.field7391 == 7 && class60.field816 == 0 && class45.field627 == 0) {
                    field9904[field9888++] = class39.method309(var242, 6693, var241) ? 1 : 0;
                    return;
                }
                field9904[field9888++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class260.field3509.field1273 = field9904[--field9888];
                class260.field3509.method1574(class688.field9413, false);
                return;
            }
            if (arg0 == 6505) {
                field9904[field9888++] = class260.field3509.field1273;
                return;
            }
            if (arg0 == 6506) {
                int var243 = field9904[--field9888];
                class138 var244 = class541.method2873(-80, var243);
                if (var244 != null) {
                    field9904[field9888++] = var244.field161;
                    field9897[field9908++] = var244.field1809;
                    class684 var245 = var244.method1040((byte) 86);
                    field9904[field9888++] = var245.field9395;
                    field9897[field9908++] = var245.field9396;
                    field9904[field9888++] = var244.field154;
                    field9904[field9888++] = var244.field1808;
                    field9897[field9908++] = var244.field1817;
                    return;
                }
                field9904[field9888++] = -1;
                field9897[field9908++] = "";
                field9904[field9888++] = 0;
                field9897[field9908++] = "";
                field9904[field9888++] = 0;
                field9904[field9888++] = 0;
                field9897[field9908++] = "";
                return;
            }
            if (arg0 == 6507) {
                field9888 -= 4;
                int var246 = field9904[field9888];
                boolean var247 = field9904[field9888 + 1] == 1;
                int var248 = field9904[field9888 + 2];
                boolean var249 = field9904[field9888 + 3] == 1;
                class57.method504(var248, var247, 24829, var246, var249);
                return;
            }
            if (arg0 == 6508) {
                class597.method3246(125);
                return;
            }
            if (arg0 == 6509) {
                if (class566.field7391 != 7) {
                    return;
                }
                class290.field3749 = field9904[--field9888] == 1;
                return;
            }
            if (arg0 == 6510) {
                field9904[field9888++] = class470.field6144;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class260.field3509.field1283 = field9904[--field9888] == 1;
                class260.field3509.method1574(class688.field9413, false);
                return;
            }
            if (arg0 == 6601) {
                field9904[field9888++] = class260.field3509.field1283 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class60.field821 == class549.field7131) {
            if (arg0 == 6700) {
                int var250 = class700.field9763.method43((byte) -123);
                if (class196.field2562 != -1) {
                    var250++;
                }
                field9904[field9888++] = var250;
                return;
            }
            if (arg0 == 6701) {
                int var251 = field9904[--field9888];
                if (class196.field2562 != -1) {
                    if (var251 == 0) {
                        field9904[field9888++] = class196.field2562;
                        return;
                    }
                    var251--;
                }
                class270 var252 = (class270) class700.field9763.method42((byte) 62);
                while (var251-- > 0) {
                    var252 = (class270) class700.field9763.method40(false);
                }
                field9904[field9888++] = var252.field3588;
                return;
            }
            if (arg0 == 6702) {
                int var253 = field9904[--field9888];
                if (class322.field4179[var253] == null) {
                    field9897[field9908++] = "";
                    return;
                }
                String var254 = class322.field4179[var253][0].field6322;
                if (var254 == null) {
                    field9897[field9908++] = "";
                    return;
                }
                field9897[field9908++] = var254.substring(0, var254.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var255 = field9904[--field9888];
                if (class322.field4179[var255] == null) {
                    field9904[field9888++] = 0;
                    return;
                }
                field9904[field9888++] = class322.field4179[var255].length;
                return;
            }
            if (arg0 == 6704) {
                field9888 -= 2;
                int var256 = field9904[field9888];
                int var257 = field9904[field9888 + 1];
                if (class322.field4179[var256] == null) {
                    field9897[field9908++] = "";
                    return;
                }
                String var258 = class322.field4179[var256][var257].field6322;
                if (var258 == null) {
                    field9897[field9908++] = "";
                    return;
                }
                field9897[field9908++] = var258;
                return;
            }
            if (arg0 == 6705) {
                field9888 -= 2;
                int var259 = field9904[field9888];
                int var260 = field9904[field9888 + 1];
                if (class322.field4179[var259] == null) {
                    field9904[field9888++] = 0;
                    return;
                }
                field9904[field9888++] = class322.field4179[var259][var260].field6371;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field9888 -= 3;
                int var261 = field9904[field9888];
                int var262 = field9904[field9888 + 1];
                int var263 = field9904[field9888 + 2];
                class619.method3378(var263, "", var261 << 16 | var262, (byte) -68, 1);
                return;
            }
            if (arg0 == 6708) {
                field9888 -= 3;
                int var264 = field9904[field9888];
                int var265 = field9904[field9888 + 1];
                int var266 = field9904[field9888 + 2];
                class619.method3378(var266, "", var264 << 16 | var265, (byte) -68, 2);
                return;
            }
            if (arg0 == 6709) {
                field9888 -= 3;
                int var267 = field9904[field9888];
                int var268 = field9904[field9888 + 1];
                int var269 = field9904[field9888 + 2];
                class619.method3378(var269, "", var267 << 16 | var268, (byte) -68, 3);
                return;
            }
            if (arg0 == 6710) {
                field9888 -= 3;
                int var270 = field9904[field9888];
                int var271 = field9904[field9888 + 1];
                int var272 = field9904[field9888 + 2];
                class619.method3378(var272, "", var270 << 16 | var271, (byte) -68, 4);
                return;
            }
            if (arg0 == 6711) {
                field9888 -= 3;
                int var273 = field9904[field9888];
                int var274 = field9904[field9888 + 1];
                int var275 = field9904[field9888 + 2];
                class619.method3378(var275, "", var273 << 16 | var274, (byte) -68, 5);
                return;
            }
            if (arg0 == 6712) {
                field9888 -= 3;
                int var276 = field9904[field9888];
                int var277 = field9904[field9888 + 1];
                int var278 = field9904[field9888 + 2];
                class619.method3378(var278, "", var276 << 16 | var277, (byte) -68, 6);
                return;
            }
            if (arg0 == 6713) {
                field9888 -= 3;
                int var279 = field9904[field9888];
                int var280 = field9904[field9888 + 1];
                int var281 = field9904[field9888 + 2];
                class619.method3378(var281, "", var279 << 16 | var280, (byte) -68, 7);
                return;
            }
            if (arg0 == 6714) {
                field9888 -= 3;
                int var282 = field9904[field9888];
                int var283 = field9904[field9888 + 1];
                int var284 = field9904[field9888 + 2];
                class619.method3378(var284, "", var282 << 16 | var283, (byte) -68, 8);
                return;
            }
            if (arg0 == 6715) {
                field9888 -= 3;
                int var285 = field9904[field9888];
                int var286 = field9904[field9888 + 1];
                int var287 = field9904[field9888 + 2];
                class619.method3378(var287, "", var285 << 16 | var286, (byte) -68, 9);
                return;
            }
            if (arg0 == 6716) {
                field9888 -= 3;
                int var288 = field9904[field9888];
                int var289 = field9904[field9888 + 1];
                int var290 = field9904[field9888 + 2];
                class619.method3378(var290, "", var288 << 16 | var289, (byte) -68, 10);
                return;
            }
            if (arg0 == 6717) {
                field9888 -= 3;
                int var291 = field9904[field9888];
                int var292 = field9904[field9888 + 1];
                int var293 = field9904[field9888 + 2];
                class477 var294 = class386.method2203(var291 << 16 | var292, 0, var293);
                class695.method3778((byte) 22);
                class162 var295 = client.method696(var294);
                class329.method1905(var295.method1142((byte) -124), var294, (byte) 31, var295.field2018);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var296 = field9904[--field9888];
                class576 var297 = class650.field9060.method2291((byte) 125, var296);
                if (var297.field7841 == null) {
                    field9897[field9908++] = "";
                    return;
                }
                field9897[field9908++] = var297.field7841;
                return;
            }
            if (arg0 == 6801) {
                int var298 = field9904[--field9888];
                class576 var299 = class650.field9060.method2291((byte) 123, var298);
                field9904[field9888++] = var299.field7816;
                return;
            }
            if (arg0 == 6802) {
                int var300 = field9904[--field9888];
                class576 var301 = class650.field9060.method2291((byte) 117, var300);
                field9904[field9888++] = var301.field7821;
                return;
            }
            if (arg0 == 6803) {
                int var302 = field9904[--field9888];
                class576 var303 = class650.field9060.method2291((byte) 124, var302);
                field9904[field9888++] = var303.field7831;
                return;
            }
            if (arg0 == 6804) {
                field9888 -= 2;
                int var304 = field9904[field9888];
                int var305 = field9904[field9888 + 1];
                class428 var306 = class191.field2445.method1075((byte) -65, var305);
                if (var306.method2460(-28741)) {
                    field9897[field9908++] = class650.field9060.method2291((byte) 127, var304).method3146(var305, var306.field5541, (byte) -119);
                    return;
                }
                field9904[field9888++] = class650.field9060.method2291((byte) 127, var304).method3148(var305, (byte) 100, var306.field5546);
                return;
            }
        } else if (arg0 < 7000) {
            if (arg0 == 6900) {
                field9904[field9888++] = class578.field7883 && !class282.field3678 ? 1 : 0;
                return;
            }
            if (arg0 == 6901) {
                field9904[field9888++] = class289.field3727;
                return;
            }
            if (arg0 == 6902) {
                field9904[field9888++] = class698.field9614;
                return;
            }
            if (arg0 == 6903) {
                field9904[field9888++] = class50.field698;
                return;
            }
            if (arg0 == 6904) {
                field9904[field9888++] = class561.field7327;
                return;
            }
            if (arg0 == 6905) {
                String var307 = "";
                if (class100.field1323 != null) {
                    if (class100.field1323.field7113 == null) {
                        var307 = class601.method3273(-31337, class100.field1323.field7111);
                    } else {
                        var307 = (String) class100.field1323.field7113;
                    }
                }
                field9897[field9908++] = var307;
                return;
            }
            if (arg0 == 6906) {
                field9904[field9888++] = class577.field7848;
                return;
            }
            if (arg0 == 6907) {
                field9904[field9888++] = class435.field5644;
                return;
            }
            if (arg0 == 6908) {
                field9904[field9888++] = class218.field2870;
                return;
            }
            if (arg0 == 6909) {
                field9904[field9888++] = class299.field3903 ? 1 : 0;
                return;
            }
            if (arg0 == 6910) {
                field9904[field9888++] = class153.field1948;
                return;
            }
            if (arg0 == 6911) {
                field9904[field9888++] = class284.field3690;
                return;
            }
            if (arg0 == 6912) {
                field9904[field9888++] = class561.field7328;
                return;
            }
        } else if (arg0 < 7100) {
            if (arg0 == 7000) {
                int var308 = class260.field3509.method1586(3);
                field9904[field9888++] = class260.field3509.field3416 = class364.field4697;
                field9904[field9888++] = var308;
                class469.method2607((byte) -125);
                class260.field3509.method1574(class688.field9413, false);
                class249.field3389 = false;
                return;
            }
            if (arg0 == 7001) {
                class260.field3509.method1585(0);
                class469.method2607((byte) -125);
                class260.field3509.method1574(class688.field9413, false);
                class249.field3389 = false;
                return;
            }
            if (arg0 == 7002) {
                class260.field3509.method1575(true);
                class469.method2607((byte) -127);
                class260.field3509.method1574(class688.field9413, false);
                class249.field3389 = false;
                return;
            }
            if (arg0 == 7003) {
                class260.field3509.method1583((byte) 113);
                class469.method2607((byte) 81);
                class260.field3509.method1574(class688.field9413, false);
                class249.field3389 = false;
                return;
            }
            if (arg0 == 7004) {
                class260.field3509.method1576(false);
                class469.method2607((byte) 51);
                class260.field3509.method1574(class688.field9413, false);
                class249.field3389 = false;
                return;
            }
            if (arg0 == 7005) {
                class260.field3509.field1298 = 0;
                class260.field3509.method1574(class688.field9413, false);
                class249.field3389 = false;
                return;
            }
            if (arg0 == 7006) {
                if (class260.field3509.field3416 == 2) {
                    class260.field3509.field3399 = true;
                    return;
                }
                if (class260.field3509.field3416 == 1) {
                    class260.field3509.field3413 = true;
                    return;
                }
                if (class260.field3509.field3416 == 3) {
                    class260.field3509.field3420 = true;
                }
                return;
            }
            if (arg0 == 7007) {
                field9904[field9888++] = class260.field3509.field1298;
                return;
            }
            if (arg0 == 7008) {
                if (class364.field4697 == 0 && class331.field4308 < 96) {
                    field9904[field9888++] = 1;
                    return;
                }
                field9904[field9888++] = 4;
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "()V")
    public static final void method3889() {
    }

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "(I)V")
    public static final void method3890(int arg0) {
        if (arg0 == -1 || !class152.method1106(39, arg0)) {
            return;
        }
        class477[] var1 = class322.field4179[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class477 var3 = var1[var2];
            if (var3.field6266 != null) {
                class155 var4 = new class155();
                var4.field1968 = var3;
                var4.field1962 = var3.field6266;
                method3884(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "(IZ)V")
    public static final void method3891(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "(I)V")
    private static final void method3892(int arg0) {
        class477 var1 = class600.method3268(119, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class477[] var3 = class160.field2005[var2];
        if (var3 == null) {
            class477[] var4 = class322.field4179[var2];
            int var5 = var4.length;
            var3 = class160.field2005[var2] = new class477[var5];
            class443.method2512(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class443.method2512(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lrba;II)V")
    public static final void method3893(class101 arg0, int arg1, int arg2) {
        class705 var3 = class636.method3515(arg1, (byte) 126, arg0, arg2);
        if (var3 == null) {
            return;
        }
        field9905 = new int[var3.field9814];
        field9890 = new String[var3.field9818];
        if (class165.field2053 == var3.field9821 || class26.field321 == var3.field9821 || class465.field6066 == var3.field9821) {
            int var4 = 0;
            int var5 = 0;
            if (class178.field2217 != null) {
                var4 = class178.field2217.field6286;
                var5 = class178.field2217.field6303;
            }
            field9905[0] = class691.field9440.method2214(-2703) - var4;
            field9905[1] = class691.field9440.method2208(30114) - var5;
        }
        method3894(var3, 200000);
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Ljk;I)V")
    private static final void method3894(class705 arg0, int arg1) {
        field9888 = 0;
        field9908 = 0;
        int var2 = -1;
        int[] var3 = arg0.field9812;
        int[] var4 = arg0.field9816;
        byte var5 = -1;
        field9893 = 0;
        try {
            int var6 = 0;
            label260: while (true) {
                var6++;
                if (var6 > arg1) {
                    throw new RuntimeException("slow");
                }
                var2++;
                int var43 = var3[var2];
                if (var43 >= 100) {
                    boolean var35;
                    if (var4[var2] == 1) {
                        var35 = true;
                    } else {
                        var35 = false;
                    }
                    if (var43 >= 100 && var43 < 5000) {
                        method3886(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method3888(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field9904[field9888++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field9904[field9888++] = class397.field5054.field3736[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class397.field5054.method1718(field9904[--field9888], var8, 0);
                } else if (var43 == 3) {
                    field9897[field9908++] = arg0.field9819[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field9888 -= 2;
                    if (field9904[field9888 + 1] != field9904[field9888]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field9888 -= 2;
                    if (field9904[field9888 + 1] == field9904[field9888]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field9888 -= 2;
                    if (field9904[field9888] < field9904[field9888 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field9888 -= 2;
                    if (field9904[field9888] > field9904[field9888 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field9893 == 0) {
                        return;
                    }
                    class433 var9 = field9889[--field9893];
                    arg0 = var9.field5582;
                    var3 = arg0.field9812;
                    var4 = arg0.field9816;
                    var2 = var9.field5581;
                    field9905 = var9.field5587;
                    field9890 = var9.field5586;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field9904[field9888++] = class397.field5054.method15(var10, 4);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class397.field5054.method1714(field9904[--field9888], var11, 8528);
                } else if (var43 == 31) {
                    field9888 -= 2;
                    if (field9904[field9888] <= field9904[field9888 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field9888 -= 2;
                    if (field9904[field9888] >= field9904[field9888 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field9904[field9888++] = field9905[var4[var2]];
                } else if (var43 == 34) {
                    field9905[var4[var2]] = field9904[--field9888];
                } else if (var43 == 35) {
                    field9897[field9908++] = field9890[var4[var2]];
                } else if (var43 == 36) {
                    field9890[var4[var2]] = field9897[--field9908];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field9908 -= var12;
                    String var13 = class536.method2853(field9908, var12, field9897, false);
                    field9897[field9908++] = var13;
                } else if (var43 == 38) {
                    field9888--;
                } else if (var43 == 39) {
                    field9908--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class705 var15 = class580.method3185((byte) -89, var14);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field9814];
                    String[] var17 = new String[var15.field9818];
                    for (int var18 = 0; var18 < var15.field9817; var18++) {
                        var16[var18] = field9904[field9888 + var18 - var15.field9817];
                    }
                    for (int var19 = 0; var19 < var15.field9824; var19++) {
                        var17[var19] = field9897[field9908 + var19 - var15.field9824];
                    }
                    field9888 -= var15.field9817;
                    field9908 -= var15.field9824;
                    class433 var20 = new class433();
                    var20.field5582 = arg0;
                    var20.field5581 = var2;
                    var20.field5587 = field9905;
                    var20.field5586 = field9890;
                    if (field9893 >= field9889.length) {
                        throw new RuntimeException();
                    }
                    field9889[field9893++] = var20;
                    arg0 = var15;
                    var3 = var15.field9812;
                    var4 = var15.field9816;
                    var2 = -1;
                    field9905 = var16;
                    field9890 = var17;
                } else if (var43 == 42) {
                    field9904[field9888++] = class311.field4040[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class311.field4040[var21] = field9904[--field9888];
                    class250.method1580(1, var21);
                    class653.field9086 |= class564.field7369[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field9904[--field9888];
                    if (var24 >= 0 && var24 <= 5000) {
                        field9899[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field9898[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field9904[--field9888];
                    if (var28 < 0 || var28 >= field9899[var27]) {
                        throw new RuntimeException();
                    }
                    field9904[field9888++] = field9898[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field9888 -= 2;
                    int var30 = field9904[field9888];
                    if (var30 < 0 || var30 >= field9899[var29]) {
                        throw new RuntimeException();
                    }
                    field9898[var29][var30] = field9904[field9888 + 1];
                } else if (var43 == 47) {
                    String var31 = class337.field4362[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field9897[field9908++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class337.field4362[var32] = field9897[--field9908];
                    class7.method26((byte) -112, var32);
                } else if (var43 == 51) {
                    class9 var33 = arg0.field9823[var4[var2]];
                    class195 var34 = (class195) var33.method39((long) field9904[--field9888], 31750);
                    if (var34 != null) {
                        var2 += var34.field2546;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field9820 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field5499).append(" ");
                for (int var41 = field9893 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field9889[var41].field5582.field5499).append(" ");
                }
                var40.append("op: ").append(var5);
                class698.method3809(var40.toString(), (byte) 115, var42);
            } else {
                class433.method2476("Clientscript error in: " + arg0.field9820, false, 4);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field9820).append("\n");
                for (int var38 = field9893 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field9889[var38].field5582.field9820).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class698.method3809(var37.toString(), (byte) 115, var42);
                class697.method3800(var37.toString(), 1);
            }
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method3895(String arg0, int arg1) {
        if (class54.field741 == 0 && !(!class578.field7883 || class282.field3678) || class597.field8076) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class604.field8171.method3280((byte) 85, 0))) {
            var3 = 0;
            arg0 = arg0.substring(class604.field8171.method3280((byte) -93, 0).length());
        } else if (var2.startsWith(class604.field8172.method3280((byte) -97, 0))) {
            var3 = 1;
            arg0 = arg0.substring(class604.field8172.method3280((byte) 82, 0).length());
        } else if (var2.startsWith(class604.field8173.method3280((byte) -85, 0))) {
            var3 = 2;
            arg0 = arg0.substring(class604.field8173.method3280((byte) -109, 0).length());
        } else if (var2.startsWith(class604.field8174.method3280((byte) -112, 0))) {
            var3 = 3;
            arg0 = arg0.substring(class604.field8174.method3280((byte) -86, 0).length());
        } else if (var2.startsWith(class604.field8175.method3280((byte) -87, 0))) {
            var3 = 4;
            arg0 = arg0.substring(class604.field8175.method3280((byte) 124, 0).length());
        } else if (var2.startsWith(class604.field8176.method3280((byte) 112, 0))) {
            var3 = 5;
            arg0 = arg0.substring(class604.field8176.method3280((byte) -63, 0).length());
        } else if (var2.startsWith(class604.field8177.method3280((byte) 99, 0))) {
            var3 = 6;
            arg0 = arg0.substring(class604.field8177.method3280((byte) 86, 0).length());
        } else if (var2.startsWith(class604.field8178.method3280((byte) -107, 0))) {
            var3 = 7;
            arg0 = arg0.substring(class604.field8178.method3280((byte) -106, 0).length());
        } else if (var2.startsWith(class604.field8179.method3280((byte) 112, 0))) {
            var3 = 8;
            arg0 = arg0.substring(class604.field8179.method3280((byte) -98, 0).length());
        } else if (var2.startsWith(class604.field8180.method3280((byte) 98, 0))) {
            var3 = 9;
            arg0 = arg0.substring(class604.field8180.method3280((byte) -71, 0).length());
        } else if (var2.startsWith(class604.field8181.method3280((byte) 115, 0))) {
            var3 = 10;
            arg0 = arg0.substring(class604.field8181.method3280((byte) -100, 0).length());
        } else if (var2.startsWith(class604.field8182.method3280((byte) 85, 0))) {
            var3 = 11;
            arg0 = arg0.substring(class604.field8182.method3280((byte) 119, 0).length());
        } else if (class144.field1890 != 0) {
            if (var2.startsWith(class604.field8171.method3280((byte) 114, class144.field1890))) {
                var3 = 0;
                arg0 = arg0.substring(class604.field8171.method3280((byte) -119, class144.field1890).length());
            } else if (var2.startsWith(class604.field8172.method3280((byte) 80, class144.field1890))) {
                var3 = 1;
                arg0 = arg0.substring(class604.field8172.method3280((byte) -122, class144.field1890).length());
            } else if (var2.startsWith(class604.field8173.method3280((byte) -92, class144.field1890))) {
                var3 = 2;
                arg0 = arg0.substring(class604.field8173.method3280((byte) 96, class144.field1890).length());
            } else if (var2.startsWith(class604.field8174.method3280((byte) 94, class144.field1890))) {
                var3 = 3;
                arg0 = arg0.substring(class604.field8174.method3280((byte) -97, class144.field1890).length());
            } else if (var2.startsWith(class604.field8175.method3280((byte) 79, class144.field1890))) {
                var3 = 4;
                arg0 = arg0.substring(class604.field8175.method3280((byte) 76, class144.field1890).length());
            } else if (var2.startsWith(class604.field8176.method3280((byte) 92, class144.field1890))) {
                var3 = 5;
                arg0 = arg0.substring(class604.field8176.method3280((byte) -128, class144.field1890).length());
            } else if (var2.startsWith(class604.field8177.method3280((byte) 87, class144.field1890))) {
                var3 = 6;
                arg0 = arg0.substring(class604.field8177.method3280((byte) 122, class144.field1890).length());
            } else if (var2.startsWith(class604.field8178.method3280((byte) 91, class144.field1890))) {
                var3 = 7;
                arg0 = arg0.substring(class604.field8178.method3280((byte) 112, class144.field1890).length());
            } else if (var2.startsWith(class604.field8179.method3280((byte) -90, class144.field1890))) {
                var3 = 8;
                arg0 = arg0.substring(class604.field8179.method3280((byte) -75, class144.field1890).length());
            } else if (var2.startsWith(class604.field8180.method3280((byte) -109, class144.field1890))) {
                var3 = 9;
                arg0 = arg0.substring(class604.field8180.method3280((byte) 70, class144.field1890).length());
            } else if (var2.startsWith(class604.field8181.method3280((byte) -58, class144.field1890))) {
                var3 = 10;
                arg0 = arg0.substring(class604.field8181.method3280((byte) 123, class144.field1890).length());
            } else if (var2.startsWith(class604.field8182.method3280((byte) -73, class144.field1890))) {
                var3 = 11;
                arg0 = arg0.substring(class604.field8182.method3280((byte) -56, class144.field1890).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class604.field8183.method3280((byte) 76, 0))) {
            var5 = 1;
            arg0 = arg0.substring(class604.field8183.method3280((byte) -84, 0).length());
        } else if (var4.startsWith(class604.field8184.method3280((byte) -98, 0))) {
            var5 = 2;
            arg0 = arg0.substring(class604.field8184.method3280((byte) -79, 0).length());
        } else if (var4.startsWith(class604.field8185.method3280((byte) -88, 0))) {
            var5 = 3;
            arg0 = arg0.substring(class604.field8185.method3280((byte) -75, 0).length());
        } else if (var4.startsWith(class604.field8186.method3280((byte) 105, 0))) {
            var5 = 4;
            arg0 = arg0.substring(class604.field8186.method3280((byte) 124, 0).length());
        } else if (var4.startsWith(class604.field8187.method3280((byte) -79, 0))) {
            var5 = 5;
            arg0 = arg0.substring(class604.field8187.method3280((byte) -125, 0).length());
        } else if (class144.field1890 != 0) {
            if (var4.startsWith(class604.field8183.method3280((byte) -73, class144.field1890))) {
                var5 = 1;
                arg0 = arg0.substring(class604.field8183.method3280((byte) 112, class144.field1890).length());
            } else if (var4.startsWith(class604.field8184.method3280((byte) -110, class144.field1890))) {
                var5 = 2;
                arg0 = arg0.substring(class604.field8184.method3280((byte) 93, class144.field1890).length());
            } else if (var4.startsWith(class604.field8185.method3280((byte) -124, class144.field1890))) {
                var5 = 3;
                arg0 = arg0.substring(class604.field8185.method3280((byte) -92, class144.field1890).length());
            } else if (var4.startsWith(class604.field8186.method3280((byte) -114, class144.field1890))) {
                var5 = 4;
                arg0 = arg0.substring(class604.field8186.method3280((byte) 95, class144.field1890).length());
            } else if (var4.startsWith(class604.field8187.method3280((byte) 70, class144.field1890))) {
                var5 = 5;
                arg0 = arg0.substring(class604.field8187.method3280((byte) 92, class144.field1890).length());
            }
        }
        field9892++;
        class11 var6 = class130.method931(class649.field9035, (byte) 54, class51.field707);
        var6.field114.method2352(true, 0);
        int var7 = var6.field114.field5367;
        var6.field114.method2352(true, var3);
        var6.field114.method2352(true, var5);
        class631.method3499(105, arg0, var6.field114);
        var6.field114.method2357(var6.field114.field5367 - var7, false);
        class100.method760(var6, -122);
    }

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "()V")
    public static void method3896() {
        field9905 = null;
        field9890 = null;
        field9899 = null;
        field9898 = null;
        field9904 = null;
        field9897 = null;
        field9889 = null;
        field9887 = null;
        field9891 = null;
        field9909 = null;
        field9903 = null;
        field9912 = null;
        field9914 = null;
        field9913 = null;
    }

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "(I)Ljava/lang/String;")
    private static final String method3897(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field9903.setTime(new Date(var1));
        int var3 = field9903.get(5);
        int var4 = field9903.get(2);
        int var5 = field9903.get(1);
        return var3 + "-" + field9912[var4] + "-" + var5;
    }
}
