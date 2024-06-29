import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class93 {

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "[I")
    private static int[] field1082 = new int[1000];

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "[I")
    private static int[] field1079 = new int[5];

    @OriginalMember(owner = "client!mp", name = "p", descriptor = "I")
    private static int field1094 = 0;

    @OriginalMember(owner = "client!mp", name = "s", descriptor = "[[I")
    private static int[][] field1097 = new int[5][5000];

    @OriginalMember(owner = "client!mp", name = "t", descriptor = "[Ljava/lang/String;")
    private static String[] field1098 = new String[1000];

    @OriginalMember(owner = "client!mp", name = "k", descriptor = "[Lgb;")
    private static class104[] field1089 = new class104[50];

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "Ljava/util/Calendar;")
    private static Calendar field1084 = Calendar.getInstance();

    @OriginalMember(owner = "client!mp", name = "y", descriptor = "[I")
    private static int[] field1103 = new int[3];

    @OriginalMember(owner = "client!mp", name = "z", descriptor = "[Ljava/lang/String;")
    private static String[] field1104 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!mp", name = "w", descriptor = "Lhq;")
    public static class365 field1101 = new class365(4);

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!mp", name = "g", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!mp", name = "h", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!mp", name = "i", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!mp", name = "j", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!mp", name = "l", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!mp", name = "o", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!mp", name = "v", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!mp", name = "x", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!mp", name = "m", descriptor = "Lqm;")
    private static class246 field1091;

    @OriginalMember(owner = "client!mp", name = "q", descriptor = "Laq;")
    private static class453 field1095;

    @OriginalMember(owner = "client!mp", name = "r", descriptor = "Laq;")
    private static class453 field1096;

    @OriginalMember(owner = "client!mp", name = "u", descriptor = "[I")
    private static int[] field1099;

    @OriginalMember(owner = "client!mp", name = "n", descriptor = "[Ljava/lang/String;")
    private static String[] field1092;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(III)V")
    public static final void method577(int arg0, int arg1, int arg2) {
        class107 var3 = class411.method2549(arg0, arg1, (byte) -70, arg2);
        if (var3 == null) {
            return;
        }
        field1099 = new int[var3.field1285];
        field1092 = new String[var3.field1278];
        if (var3.field1277 == 15 || var3.field1277 == 17 || var3.field1277 == 16) {
            int var4 = 0;
            int var5 = 0;
            if (class310.field4200 != null) {
                var4 = class310.field4200.field6394;
                var5 = class310.field4200.field6434;
            }
            field1099[0] = class358.field4866.method1860(16) - var4;
            field1099[1] = class358.field4866.method1858(-18493) - var5;
        }
        method581(var3, 200000);
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lhb;)V")
    public static final void method578(class221 arg0) {
        method580(arg0, 200000);
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "()V")
    public static void method579() {
        field1099 = null;
        field1092 = null;
        field1079 = null;
        field1097 = null;
        field1082 = null;
        field1098 = null;
        field1089 = null;
        field1096 = null;
        field1095 = null;
        field1091 = null;
        field1084 = null;
        field1104 = null;
        field1103 = null;
        field1101 = null;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lhb;I)V")
    private static final void method580(class221 arg0, int arg1) {
        Object[] var2 = arg0.field2735;
        int var3 = (Integer) var2[0];
        class107 var4 = class217.method1320(var3, 0);
        if (var4 == null) {
            return;
        }
        field1099 = new int[var4.field1285];
        int var5 = 0;
        field1092 = new String[var4.field1278];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field2736;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field2738;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field2732 == null ? -1 : arg0.field2732.field6475;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field2739;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field2732 == null ? -1 : arg0.field2732.field6364;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field2741 == null ? -1 : arg0.field2741.field6475;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field2741 == null ? -1 : arg0.field2741.field6364;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field2737;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field2729;
                }
                field1099[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field2742;
                }
                field1092[var6++] = var9;
            }
        }
        method581(var4, arg1);
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lpe;I)V")
    private static final void method581(class107 arg0, int arg1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = -1;
        int[] var5 = arg0.field1280;
        int[] var6 = arg0.field1284;
        byte var7 = -1;
        field1094 = 0;
        try {
            int var8 = 0;
            label4487: while (true) {
                var8++;
                if (var8 > arg1) {
                    throw new RuntimeException("slow");
                }
                var4++;
                int var621 = var5[var4];
                if (var621 < 100) {
                    if (var621 == 0) {
                        field1082[var2++] = var6[var4];
                        continue;
                    }
                    if (var621 == 1) {
                        int var9 = var6[var4];
                        field1082[var2++] = class56.field649[var9];
                        continue;
                    }
                    if (var621 == 2) {
                        int var10 = var6[var4];
                        var2--;
                        class247.method1613((byte) 30, field1082[var2], var10);
                        continue;
                    }
                    if (var621 == 3) {
                        field1098[var3++] = arg0.field1283[var4];
                        continue;
                    }
                    if (var621 == 6) {
                        var4 += var6[var4];
                        continue;
                    }
                    if (var621 == 7) {
                        var2 -= 2;
                        if (field1082[var2 + 1] != field1082[var2]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var621 == 8) {
                        var2 -= 2;
                        if (field1082[var2 + 1] == field1082[var2]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var621 == 9) {
                        var2 -= 2;
                        if (field1082[var2] < field1082[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var621 == 10) {
                        var2 -= 2;
                        if (field1082[var2] > field1082[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var621 == 21) {
                        if (field1094 == 0) {
                            return;
                        }
                        class104 var11 = field1089[--field1094];
                        arg0 = var11.field1218;
                        var5 = arg0.field1280;
                        var6 = arg0.field1284;
                        var4 = var11.field1217;
                        field1099 = var11.field1222;
                        field1092 = var11.field1227;
                        continue;
                    }
                    if (var621 == 25) {
                        int var12 = var6[var4];
                        field1082[var2++] = class106.method640((byte) 45, var12);
                        continue;
                    }
                    if (var621 == 27) {
                        int var13 = var6[var4];
                        var2--;
                        class444.method2753(var13, (byte) -77, field1082[var2]);
                        continue;
                    }
                    if (var621 == 31) {
                        var2 -= 2;
                        if (field1082[var2] <= field1082[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var621 == 32) {
                        var2 -= 2;
                        if (field1082[var2] >= field1082[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var621 == 33) {
                        field1082[var2++] = field1099[var6[var4]];
                        continue;
                    }
                    int var10001;
                    if (var621 == 34) {
                        var10001 = var6[var4];
                        var2--;
                        field1099[var10001] = field1082[var2];
                        continue;
                    }
                    if (var621 == 35) {
                        field1098[var3++] = field1092[var6[var4]];
                        continue;
                    }
                    if (var621 == 36) {
                        var10001 = var6[var4];
                        var3--;
                        field1092[var10001] = field1098[var3];
                        continue;
                    }
                    if (var621 == 37) {
                        int var14 = var6[var4];
                        var3 -= var14;
                        String var15 = class281.method1763(false, var3, var14, field1098);
                        field1098[var3++] = var15;
                        continue;
                    }
                    if (var621 == 38) {
                        var2--;
                        continue;
                    }
                    if (var621 == 39) {
                        var3--;
                        continue;
                    }
                    if (var621 == 40) {
                        int var16 = var6[var4];
                        class107 var17 = class217.method1320(var16, 0);
                        if (var17 == null) {
                            throw new RuntimeException();
                        }
                        int[] var18 = new int[var17.field1285];
                        String[] var19 = new String[var17.field1278];
                        for (int var20 = 0; var20 < var17.field1276; var20++) {
                            var18[var20] = field1082[var2 + var20 - var17.field1276];
                        }
                        for (int var21 = 0; var21 < var17.field1281; var21++) {
                            var19[var21] = field1098[var3 + var21 - var17.field1281];
                        }
                        var2 -= var17.field1276;
                        var3 -= var17.field1281;
                        class104 var22 = new class104();
                        var22.field1218 = arg0;
                        var22.field1217 = var4;
                        var22.field1222 = field1099;
                        var22.field1227 = field1092;
                        if (field1094 >= field1089.length) {
                            throw new RuntimeException();
                        }
                        field1089[field1094++] = var22;
                        arg0 = var17;
                        var5 = var17.field1280;
                        var6 = var17.field1284;
                        var4 = -1;
                        field1099 = var18;
                        field1092 = var19;
                        continue;
                    }
                    if (var621 == 42) {
                        field1082[var2++] = class198.field2338[var6[var4]];
                        continue;
                    }
                    if (var621 == 43) {
                        int var23 = var6[var4];
                        var2--;
                        class198.field2338[var23] = field1082[var2];
                        class101.method610(19453, var23);
                        class181.field2109 |= class53.field618[var23];
                        continue;
                    }
                    if (var621 == 44) {
                        int var24 = var6[var4] >> 16;
                        int var25 = var6[var4] & 0xFFFF;
                        var2--;
                        int var26 = field1082[var2];
                        if (var26 >= 0 && var26 <= 5000) {
                            field1079[var24] = var26;
                            byte var27 = -1;
                            if (var25 == 105) {
                                var27 = 0;
                            }
                            int var28 = 0;
                            while (true) {
                                if (var28 >= var26) {
                                    continue label4487;
                                }
                                field1097[var24][var28] = var27;
                                var28++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var621 == 45) {
                        int var29 = var6[var4];
                        var2--;
                        int var30 = field1082[var2];
                        if (var30 >= 0 && var30 < field1079[var29]) {
                            field1082[var2++] = field1097[var29][var30];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var621 == 46) {
                        int var31 = var6[var4];
                        var2 -= 2;
                        int var32 = field1082[var2];
                        if (var32 >= 0 && var32 < field1079[var31]) {
                            field1097[var31][var32] = field1082[var2 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var621 == 47) {
                        String var33 = class51.field597[var6[var4]];
                        if (var33 == null) {
                            var33 = "null";
                        }
                        field1098[var3++] = var33;
                        continue;
                    }
                    if (var621 == 48) {
                        int var34 = var6[var4];
                        var3--;
                        class51.field597[var34] = field1098[var3];
                        class451.method2793((byte) 56, var34);
                        continue;
                    }
                    if (var621 == 51) {
                        class349 var35 = arg0.field1282[var6[var4]];
                        var2--;
                        class369 var36 = (class369) var35.method2218(1, (long) field1082[var2]);
                        if (var36 != null) {
                            var4 += var36.field5032;
                        }
                        continue;
                    }
                }
                boolean var37;
                if (var6[var4] == 1) {
                    var37 = true;
                } else {
                    var37 = false;
                }
                if (var621 < 300) {
                    if (var621 == 100) {
                        var2 -= 3;
                        int var38 = field1082[var2];
                        int var39 = field1082[var2 + 1];
                        int var40 = field1082[var2 + 2];
                        if (var39 == 0) {
                            throw new RuntimeException();
                        }
                        class453 var41 = class195.method1212(var38, (byte) 49);
                        if (var41.field6350 == null) {
                            var41.field6350 = new class453[var40 + 1];
                        }
                        if (var41.field6350.length <= var40) {
                            class453[] var42 = new class453[var40 + 1];
                            for (int var43 = 0; var43 < var41.field6350.length; var43++) {
                                var42[var43] = var41.field6350[var43];
                            }
                            var41.field6350 = var42;
                        }
                        if (var40 > 0 && var41.field6350[var40 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var40 - 1));
                        }
                        class453 var44 = new class453();
                        var44.field6383 = var39;
                        var44.field6462 = var44.field6475 = var41.field6475;
                        var44.field6364 = var40;
                        var41.field6350[var40] = var44;
                        if (var37) {
                            field1095 = var44;
                        } else {
                            field1096 = var44;
                        }
                        class303.method1923(var41, 10240);
                        continue;
                    }
                    if (var621 == 101) {
                        class453 var45 = var37 ? field1095 : field1096;
                        if (var45.field6364 == -1) {
                            if (var37) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class453 var46 = class195.method1212(var45.field6475, (byte) 49);
                        var46.field6350[var45.field6364] = null;
                        class303.method1923(var46, 10240);
                        continue;
                    }
                    if (var621 == 102) {
                        var2--;
                        class453 var47 = class195.method1212(field1082[var2], (byte) 49);
                        var47.field6350 = null;
                        class303.method1923(var47, 10240);
                        continue;
                    }
                    if (var621 == 200) {
                        var2 -= 2;
                        int var48 = field1082[var2];
                        int var49 = field1082[var2 + 1];
                        class453 var50 = class378.method2346(-23490, var49, var48);
                        if (var50 != null && var49 != -1) {
                            field1082[var2++] = 1;
                            if (var37) {
                                field1095 = var50;
                            } else {
                                field1096 = var50;
                            }
                            continue;
                        }
                        field1082[var2++] = 0;
                        continue;
                    }
                    if (var621 == 201) {
                        var2--;
                        int var51 = field1082[var2];
                        class453 var52 = class195.method1212(var51, (byte) 49);
                        if (var52 == null) {
                            field1082[var2++] = 0;
                        } else {
                            field1082[var2++] = 1;
                            if (var37) {
                                field1095 = var52;
                            } else {
                                field1096 = var52;
                            }
                        }
                        continue;
                    }
                } else if (var621 < 500) {
                    if (var621 == 403) {
                        var2 -= 2;
                        int var53 = field1082[var2];
                        int var54 = field1082[var2 + 1];
                        for (int var55 = 0; var55 < class12.field157.length; var55++) {
                            if (class12.field157[var55] == var53) {
                                class143.field1684.field1466.method2645(var55, -26193, var54);
                                continue label4487;
                            }
                        }
                        int var56 = 0;
                        while (true) {
                            if (var56 >= class372.field5041.length) {
                                continue label4487;
                            }
                            if (class372.field5041[var56] == var53) {
                                class143.field1684.field1466.method2645(var56, -26193, var54);
                                continue label4487;
                            }
                            var56++;
                        }
                    }
                    if (var621 == 404) {
                        var2 -= 2;
                        int var57 = field1082[var2];
                        int var58 = field1082[var2 + 1];
                        class143.field1684.field1466.method2657(var57, -1, var58);
                        continue;
                    }
                    if (var621 == 410) {
                        var2--;
                        boolean var59 = field1082[var2] != 0;
                        class143.field1684.field1466.method2654(var59, (byte) 47);
                        continue;
                    }
                } else if (!(var621 < 1000 || var621 >= 1100) || !(var621 < 2000 || var621 >= 2100)) {
                    class453 var60;
                    if (var621 >= 2000) {
                        var621 -= 1000;
                        var2--;
                        var60 = class195.method1212(field1082[var2], (byte) 49);
                    } else {
                        var60 = var37 ? field1095 : field1096;
                    }
                    if (var621 == 1000) {
                        var2 -= 4;
                        var60.field6474 = field1082[var2];
                        var60.field6381 = field1082[var2 + 1];
                        int var61 = field1082[var2 + 2];
                        if (var61 < 0) {
                            var61 = 0;
                        } else if (var61 > 5) {
                            var61 = 5;
                        }
                        int var62 = field1082[var2 + 3];
                        if (var62 < 0) {
                            var62 = 0;
                        } else if (var62 > 5) {
                            var62 = 5;
                        }
                        var60.field6416 = (byte) var61;
                        var60.field6454 = (byte) var62;
                        class303.method1923(var60, 10240);
                        class421.method2581(-42, var60);
                        if (var60.field6364 == -1) {
                            class295.method1878(9179409, var60.field6475);
                        }
                        continue;
                    }
                    if (var621 == 1001) {
                        var2 -= 4;
                        var60.field6390 = field1082[var2];
                        var60.field6363 = field1082[var2 + 1];
                        var60.field6398 = 0;
                        var60.field6340 = 0;
                        int var63 = field1082[var2 + 2];
                        if (var63 < 0) {
                            var63 = 0;
                        } else if (var63 > 4) {
                            var63 = 4;
                        }
                        int var64 = field1082[var2 + 3];
                        if (var64 < 0) {
                            var64 = 0;
                        } else if (var64 > 4) {
                            var64 = 4;
                        }
                        var60.field6456 = (byte) var63;
                        var60.field6407 = (byte) var64;
                        class303.method1923(var60, 10240);
                        class421.method2581(-72, var60);
                        if (var60.field6383 == 0) {
                            class306.method1942(false, -1, var60);
                        }
                        continue;
                    }
                    if (var621 == 1003) {
                        var2--;
                        boolean var65 = field1082[var2] == 1;
                        if (var60.field6459 != var65) {
                            var60.field6459 = var65;
                            class303.method1923(var60, 10240);
                        }
                        if (var60.field6364 == -1) {
                            class268.method1682((byte) 66, var60.field6475);
                        }
                        continue;
                    }
                    if (var621 == 1004) {
                        var2 -= 2;
                        var60.field6395 = field1082[var2];
                        var60.field6346 = field1082[var2 + 1];
                        class303.method1923(var60, 10240);
                        class421.method2581(-42, var60);
                        if (var60.field6383 == 0) {
                            class306.method1942(false, -1, var60);
                        }
                        continue;
                    }
                    if (var621 == 1005) {
                        var2--;
                        var60.field6316 = field1082[var2] == 1;
                        continue;
                    }
                } else if (!(var621 < 1100 || var621 >= 1200) || !(var621 < 2100 || var621 >= 2200)) {
                    class453 var66;
                    if (var621 >= 2000) {
                        var621 -= 1000;
                        var2--;
                        var66 = class195.method1212(field1082[var2], (byte) 49);
                    } else {
                        var66 = var37 ? field1095 : field1096;
                    }
                    if (var621 == 1100) {
                        var2 -= 2;
                        var66.field6345 = field1082[var2];
                        if (var66.field6345 > var66.field6339 - var66.field6377) {
                            var66.field6345 = var66.field6339 - var66.field6377;
                        }
                        if (var66.field6345 < 0) {
                            var66.field6345 = 0;
                        }
                        var66.field6386 = field1082[var2 + 1];
                        if (var66.field6386 > var66.field6417 - var66.field6432) {
                            var66.field6386 = var66.field6417 - var66.field6432;
                        }
                        if (var66.field6386 < 0) {
                            var66.field6386 = 0;
                        }
                        class303.method1923(var66, 10240);
                        if (var66.field6364 == -1) {
                            class380.method2360(var66.field6475, true);
                        }
                        continue;
                    }
                    if (var621 == 1101) {
                        var2--;
                        var66.field6357 = field1082[var2];
                        class303.method1923(var66, 10240);
                        if (var66.field6364 == -1) {
                            class127.method818(28902, var66.field6475);
                        }
                        continue;
                    }
                    if (var621 == 1102) {
                        var2--;
                        var66.field6327 = field1082[var2] == 1;
                        class303.method1923(var66, 10240);
                        continue;
                    }
                    if (var621 == 1103) {
                        var2--;
                        var66.field6374 = field1082[var2];
                        class303.method1923(var66, 10240);
                        continue;
                    }
                    if (var621 == 1104) {
                        var2--;
                        var66.field6382 = field1082[var2];
                        class303.method1923(var66, 10240);
                        continue;
                    }
                    if (var621 == 1105) {
                        var2--;
                        int var67 = field1082[var2];
                        if (var66.field6460 != var67) {
                            var66.field6460 = var67;
                            class303.method1923(var66, 10240);
                        }
                        if (var66.field6364 == -1) {
                            class434.method2656((byte) 104, var66.field6475);
                        }
                        continue;
                    }
                    if (var621 == 1106) {
                        var2--;
                        var66.field6430 = field1082[var2];
                        class303.method1923(var66, 10240);
                        continue;
                    }
                    if (var621 == 1107) {
                        var2--;
                        var66.field6436 = field1082[var2] == 1;
                        class303.method1923(var66, 10240);
                        continue;
                    }
                    if (var621 == 1108) {
                        var66.field6411 = 1;
                        var2--;
                        var66.field6435 = field1082[var2];
                        class303.method1923(var66, 10240);
                        if (var66.field6364 == -1) {
                            class267.method1674(var66.field6475, 7313);
                        }
                        continue;
                    }
                    if (var621 == 1109) {
                        var2 -= 6;
                        var66.field6457 = field1082[var2];
                        var66.field6351 = field1082[var2 + 1];
                        var66.field6478 = field1082[var2 + 2];
                        var66.field6332 = field1082[var2 + 3];
                        var66.field6477 = field1082[var2 + 4];
                        var66.field6414 = field1082[var2 + 5];
                        class303.method1923(var66, 10240);
                        if (var66.field6364 == -1) {
                            class378.method2352(var66.field6475, (byte) 31);
                            class422.method2589(var66.field6475, (byte) 33);
                        }
                        continue;
                    }
                    if (var621 == 1110) {
                        var2--;
                        int var68 = field1082[var2];
                        if (var66.field6426 != var68) {
                            var66.field6426 = var68;
                            var66.field6315 = 0;
                            var66.field6331 = 1;
                            var66.field6439 = 0;
                            class303.method1923(var66, 10240);
                        }
                        if (var66.field6364 == -1) {
                            class238.method1524(-1, var66.field6475);
                        }
                        continue;
                    }
                    if (var621 == 1111) {
                        var2--;
                        var66.field6392 = field1082[var2] == 1;
                        class303.method1923(var66, 10240);
                        continue;
                    }
                    if (var621 == 1112) {
                        var3--;
                        String var69 = field1098[var3];
                        if (!var69.equals(var66.field6406)) {
                            var66.field6406 = var69;
                            class303.method1923(var66, 10240);
                        }
                        if (var66.field6364 == -1) {
                            class416.method2563(var66.field6475, (byte) -66);
                        }
                        continue;
                    }
                    if (var621 == 1113) {
                        var2--;
                        var66.field6403 = field1082[var2];
                        class303.method1923(var66, 10240);
                        if (var66.field6364 == -1) {
                            class222.method1352(var66.field6475, 107);
                        }
                        continue;
                    }
                    if (var621 == 1114) {
                        var2 -= 3;
                        var66.field6476 = field1082[var2];
                        var66.field6385 = field1082[var2 + 1];
                        var66.field6470 = field1082[var2 + 2];
                        class303.method1923(var66, 10240);
                        continue;
                    }
                    if (var621 == 1115) {
                        var2--;
                        var66.field6368 = field1082[var2] == 1;
                        class303.method1923(var66, 10240);
                        continue;
                    }
                    if (var621 == 1116) {
                        var2--;
                        var66.field6359 = field1082[var2];
                        class303.method1923(var66, 10240);
                        continue;
                    }
                    if (var621 == 1117) {
                        var2--;
                        var66.field6473 = field1082[var2];
                        class303.method1923(var66, 10240);
                        continue;
                    }
                    if (var621 == 1118) {
                        var2--;
                        var66.field6425 = field1082[var2] == 1;
                        class303.method1923(var66, 10240);
                        continue;
                    }
                    if (var621 == 1119) {
                        var2--;
                        var66.field6341 = field1082[var2] == 1;
                        class303.method1923(var66, 10240);
                        continue;
                    }
                    if (var621 == 1120) {
                        var2 -= 2;
                        var66.field6339 = field1082[var2];
                        var66.field6417 = field1082[var2 + 1];
                        class303.method1923(var66, 10240);
                        if (var66.field6383 == 0) {
                            class306.method1942(false, -1, var66);
                        }
                        continue;
                    }
                    if (var621 == 1121) {
                        var2 -= 2;
                        var66.field6347 = (short) field1082[var2];
                        var66.field6369 = (short) field1082[var2 + 1];
                        class303.method1923(var66, 10240);
                        continue;
                    }
                    if (var621 == 1122) {
                        var2--;
                        var66.field6320 = field1082[var2] == 1;
                        class303.method1923(var66, 10240);
                        continue;
                    }
                    if (var621 == 1123) {
                        var2--;
                        var66.field6414 = field1082[var2];
                        class303.method1923(var66, 10240);
                        if (var66.field6364 == -1) {
                            class378.method2352(var66.field6475, (byte) 31);
                        }
                        continue;
                    }
                    if (var621 == 1124) {
                        var2--;
                        int var70 = field1082[var2];
                        var66.field6342 = var70 == 1;
                        class303.method1923(var66, 10240);
                        continue;
                    }
                    if (var621 == 1125) {
                        var2 -= 2;
                        var66.field6449 = field1082[var2];
                        var66.field6409 = field1082[var2 + 1];
                        class303.method1923(var66, 10240);
                        continue;
                    }
                } else if (var621 >= 1200 && var621 < 1300 || var621 >= 2200 && var621 < 2300) {
                    class453 var71;
                    if (var621 >= 2000) {
                        var621 -= 1000;
                        var2--;
                        var71 = class195.method1212(field1082[var2], (byte) 49);
                    } else {
                        var71 = var37 ? field1095 : field1096;
                    }
                    class303.method1923(var71, 10240);
                    if (var621 == 1200 || var621 == 1205 || var621 == 1208 || var621 == 1209 || var621 == 1212 || var621 == 1213) {
                        var2 -= 2;
                        int var72 = field1082[var2];
                        int var73 = field1082[var2 + 1];
                        if (var71.field6364 == -1) {
                            class208.method1273(var71.field6475, (byte) 97);
                            class378.method2352(var71.field6475, (byte) 31);
                            class422.method2589(var71.field6475, (byte) 113);
                        }
                        if (var72 == -1) {
                            var71.field6411 = 1;
                            var71.field6435 = -1;
                            var71.field6358 = -1;
                            continue;
                        }
                        var71.field6358 = var72;
                        var71.field6453 = var73;
                        if (var621 == 1208 || var621 == 1209) {
                            var71.field6376 = true;
                        } else {
                            var71.field6376 = false;
                        }
                        class59 var74 = class131.method843((byte) 5, var72);
                        var71.field6478 = var74.field742;
                        var71.field6332 = var74.field726;
                        var71.field6477 = var74.field674;
                        var71.field6457 = var74.field701;
                        var71.field6351 = var74.field729;
                        var71.field6414 = var74.field714;
                        if (var621 == 1205 || var621 == 1209) {
                            var71.field6443 = 0;
                        } else if (var621 == 1212 || var621 == 1213) {
                            var71.field6443 = 1;
                        } else {
                            var71.field6443 = 2;
                        }
                        if (var71.field6398 > 0) {
                            var71.field6414 = var71.field6414 * 32 / var71.field6398;
                        } else if (var71.field6390 > 0) {
                            var71.field6414 = var71.field6414 * 32 / var71.field6390;
                        }
                        continue;
                    }
                    if (var621 == 1201) {
                        var71.field6411 = 2;
                        var2--;
                        var71.field6435 = field1082[var2];
                        if (var71.field6364 == -1) {
                            class267.method1674(var71.field6475, 7313);
                        }
                        continue;
                    }
                    if (var621 == 1202) {
                        var71.field6411 = 3;
                        var71.field6435 = -1;
                        if (var71.field6364 == -1) {
                            class267.method1674(var71.field6475, 7313);
                        }
                        continue;
                    }
                    if (var621 == 1203) {
                        var71.field6411 = 6;
                        var2--;
                        var71.field6435 = field1082[var2];
                        if (var71.field6364 == -1) {
                            class267.method1674(var71.field6475, 7313);
                        }
                        continue;
                    }
                    if (var621 == 1204) {
                        var71.field6411 = 5;
                        var2--;
                        var71.field6435 = field1082[var2];
                        if (var71.field6364 == -1) {
                            class267.method1674(var71.field6475, 7313);
                        }
                        continue;
                    }
                    if (var621 == 1206) {
                        var2 -= 4;
                        var71.field6424 = field1082[var2];
                        var71.field6319 = field1082[var2 + 1];
                        var71.field6427 = field1082[var2 + 2];
                        var71.field6362 = field1082[var2 + 3];
                        class303.method1923(var71, 10240);
                        continue;
                    }
                    if (var621 == 1207) {
                        var2 -= 2;
                        var71.field6367 = field1082[var2];
                        var71.field6479 = field1082[var2 + 1];
                        class303.method1923(var71, 10240);
                        continue;
                    }
                    if (var621 == 1210) {
                        var2 -= 4;
                        var71.field6435 = field1082[var2];
                        var71.field6330 = field1082[var2 + 1];
                        if (field1082[var2 + 2] == 1) {
                            var71.field6411 = 9;
                        } else {
                            var71.field6411 = 8;
                        }
                        if (field1082[var2 + 3] == 1) {
                            var71.field6376 = true;
                        } else {
                            var71.field6376 = false;
                        }
                        if (var71.field6364 == -1) {
                            class267.method1674(var71.field6475, 7313);
                        }
                        continue;
                    }
                    if (var621 == 1211) {
                        var71.field6411 = 5;
                        var71.field6435 = 2047;
                        var71.field6330 = 0;
                        if (var71.field6364 == -1) {
                            class267.method1674(var71.field6475, 7313);
                        }
                        continue;
                    }
                } else if (var621 >= 1300 && var621 < 1400 || var621 >= 2300 && var621 < 2400) {
                    class453 var75;
                    if (var621 >= 2000) {
                        var621 -= 1000;
                        var2--;
                        var75 = class195.method1212(field1082[var2], (byte) 49);
                    } else {
                        var75 = var37 ? field1095 : field1096;
                    }
                    if (var621 == 1300) {
                        var2--;
                        int var76 = field1082[var2] - 1;
                        if (var76 >= 0 && var76 <= 9) {
                            var3--;
                            var75.method2804(field1098[var3], var76, -3908);
                            continue;
                        }
                        var3--;
                        continue;
                    }
                    if (var621 == 1301) {
                        var2 -= 2;
                        int var77 = field1082[var2];
                        int var78 = field1082[var2 + 1];
                        var75.field6466 = class378.method2346(-23490, var78, var77);
                        continue;
                    }
                    if (var621 == 1302) {
                        var2--;
                        var75.field6467 = field1082[var2] == 1;
                        continue;
                    }
                    if (var621 == 1303) {
                        var2--;
                        var75.field6429 = field1082[var2];
                        continue;
                    }
                    if (var621 == 1304) {
                        var2--;
                        var75.field6397 = field1082[var2];
                        continue;
                    }
                    if (var621 == 1305) {
                        var3--;
                        var75.field6366 = field1098[var3];
                        continue;
                    }
                    if (var621 == 1306) {
                        var3--;
                        var75.field6451 = field1098[var3];
                        continue;
                    }
                    if (var621 == 1307) {
                        var75.field6441 = null;
                        continue;
                    }
                    if (var621 == 1308) {
                        var2--;
                        var75.field6471 = field1082[var2];
                        var2--;
                        var75.field6326 = field1082[var2];
                        continue;
                    }
                    if (var621 == 1309) {
                        var2--;
                        int var79 = field1082[var2];
                        var2--;
                        int var80 = field1082[var2];
                        if (var80 >= 1 && var80 <= 10) {
                            var75.method2810(var79, 22307, var80 - 1);
                        }
                        continue;
                    }
                    if (var621 == 1310) {
                        var3--;
                        var75.field6433 = field1098[var3];
                        continue;
                    }
                    if (var621 == 1311) {
                        var2--;
                        var75.field6455 = field1082[var2];
                        continue;
                    }
                } else {
                    if (var621 >= 1400 && var621 < 1500 || var621 >= 2400 && var621 < 2500) {
                        class453 var81;
                        if (var621 >= 2000) {
                            var621 -= 1000;
                            var2--;
                            var81 = class195.method1212(field1082[var2], (byte) 49);
                        } else {
                            var81 = var37 ? field1095 : field1096;
                        }
                        var3--;
                        String var82 = field1098[var3];
                        int[] var83 = null;
                        if (var82.length() > 0 && var82.charAt(var82.length() - 1) == 'Y') {
                            var2--;
                            int var84 = field1082[var2];
                            if (var84 > 0) {
                                var83 = new int[var84];
                                while (var84-- > 0) {
                                    var2--;
                                    var83[var84] = field1082[var2];
                                }
                            }
                            var82 = var82.substring(0, var82.length() - 1);
                        }
                        Object[] var85 = new Object[var82.length() + 1];
                        for (int var86 = var85.length - 1; var86 >= 1; var86--) {
                            if (var82.charAt(var86 - 1) == 's') {
                                var3--;
                                var85[var86] = field1098[var3];
                            } else {
                                var2--;
                                var85[var86] = Integer.valueOf(field1082[var2]);
                            }
                        }
                        var2--;
                        int var87 = field1082[var2];
                        if (var87 == -1) {
                            var85 = null;
                        } else {
                            var85[0] = Integer.valueOf(var87);
                        }
                        if (var621 == 1400) {
                            var81.field6438 = var85;
                        } else if (var621 == 1401) {
                            var81.field6442 = var85;
                        } else if (var621 == 1402) {
                            var81.field6349 = var85;
                        } else if (var621 == 1403) {
                            var81.field6372 = var85;
                        } else if (var621 == 1404) {
                            var81.field6365 = var85;
                        } else if (var621 == 1405) {
                            var81.field6329 = var85;
                        } else if (var621 == 1406) {
                            var81.field6461 = var85;
                        } else if (var621 == 1407) {
                            var81.field6463 = var85;
                            var81.field6413 = var83;
                        } else if (var621 == 1408) {
                            var81.field6379 = var85;
                        } else if (var621 == 1409) {
                            var81.field6396 = var85;
                        } else if (var621 == 1410) {
                            var81.field6404 = var85;
                        } else if (var621 == 1411) {
                            var81.field6402 = var85;
                        } else if (var621 == 1412) {
                            var81.field6468 = var85;
                        } else if (var621 == 1414) {
                            var81.field6360 = var85;
                            var81.field6352 = var83;
                        } else if (var621 == 1415) {
                            var81.field6355 = var85;
                            var81.field6336 = var83;
                        } else if (var621 == 1416) {
                            var81.field6321 = var85;
                        } else if (var621 == 1417) {
                            var81.field6325 = var85;
                        } else if (var621 == 1418) {
                            var81.field6380 = var85;
                        } else if (var621 == 1419) {
                            var81.field6373 = var85;
                        } else if (var621 == 1420) {
                            var81.field6421 = var85;
                        } else if (var621 == 1421) {
                            var81.field6375 = var85;
                        } else if (var621 == 1422) {
                            var81.field6446 = var85;
                        } else if (var621 == 1423) {
                            var81.field6353 = var85;
                        } else if (var621 == 1424) {
                            var81.field6389 = var85;
                        } else if (var621 == 1425) {
                            var81.field6450 = var85;
                        } else if (var621 == 1426) {
                            var81.field6333 = var85;
                        } else if (var621 == 1427) {
                            var81.field6448 = var85;
                        } else if (var621 == 1428) {
                            var81.field6343 = var85;
                            var81.field6465 = var83;
                        } else if (var621 == 1429) {
                            var81.field6412 = var85;
                            var81.field6464 = var83;
                        }
                        var81.field6371 = true;
                        continue;
                    }
                    if (var621 < 1600) {
                        class453 var88 = var37 ? field1095 : field1096;
                        if (var621 == 1500) {
                            field1082[var2++] = var88.field6394;
                            continue;
                        }
                        if (var621 == 1501) {
                            field1082[var2++] = var88.field6434;
                            continue;
                        }
                        if (var621 == 1502) {
                            field1082[var2++] = var88.field6377;
                            continue;
                        }
                        if (var621 == 1503) {
                            field1082[var2++] = var88.field6432;
                            continue;
                        }
                        if (var621 == 1504) {
                            field1082[var2++] = var88.field6459 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 1505) {
                            field1082[var2++] = var88.field6462;
                            continue;
                        }
                    } else if (var621 < 1700) {
                        class453 var89 = var37 ? field1095 : field1096;
                        if (var621 == 1600) {
                            field1082[var2++] = var89.field6345;
                            continue;
                        }
                        if (var621 == 1601) {
                            field1082[var2++] = var89.field6386;
                            continue;
                        }
                        if (var621 == 1602) {
                            field1098[var3++] = var89.field6406;
                            continue;
                        }
                        if (var621 == 1603) {
                            field1082[var2++] = var89.field6339;
                            continue;
                        }
                        if (var621 == 1604) {
                            field1082[var2++] = var89.field6417;
                            continue;
                        }
                        if (var621 == 1605) {
                            field1082[var2++] = var89.field6414;
                            continue;
                        }
                        if (var621 == 1606) {
                            field1082[var2++] = var89.field6478;
                            continue;
                        }
                        if (var621 == 1607) {
                            field1082[var2++] = var89.field6477;
                            continue;
                        }
                        if (var621 == 1608) {
                            field1082[var2++] = var89.field6332;
                            continue;
                        }
                        if (var621 == 1609) {
                            field1082[var2++] = var89.field6374;
                            continue;
                        }
                        if (var621 == 1610) {
                            field1082[var2++] = var89.field6457;
                            continue;
                        }
                        if (var621 == 1611) {
                            field1082[var2++] = var89.field6351;
                            continue;
                        }
                        if (var621 == 1612) {
                            field1082[var2++] = var89.field6460;
                            continue;
                        }
                    } else if (var621 < 1800) {
                        class453 var90 = var37 ? field1095 : field1096;
                        if (var621 == 1700) {
                            field1082[var2++] = var90.field6358;
                            continue;
                        }
                        if (var621 == 1701) {
                            if (var90.field6358 == -1) {
                                field1082[var2++] = 0;
                            } else {
                                field1082[var2++] = var90.field6453;
                            }
                            continue;
                        }
                        if (var621 == 1702) {
                            field1082[var2++] = var90.field6364;
                            continue;
                        }
                    } else if (var621 < 1900) {
                        class453 var91 = var37 ? field1095 : field1096;
                        if (var621 == 1800) {
                            field1082[var2++] = client.method2696(var91).method2257((byte) 106);
                            continue;
                        }
                        if (var621 == 1801) {
                            var2--;
                            int var92 = field1082[var2];
                            int var622 = var92 - 1;
                            if (var91.field6441 != null && var622 < var91.field6441.length && var91.field6441[var622] != null) {
                                field1098[var3++] = var91.field6441[var622];
                                continue;
                            }
                            field1098[var3++] = "";
                            continue;
                        }
                        if (var621 == 1802) {
                            if (var91.field6366 == null) {
                                field1098[var3++] = "";
                            } else {
                                field1098[var3++] = var91.field6366;
                            }
                            continue;
                        }
                    } else if (var621 < 2600) {
                        var2--;
                        class453 var93 = class195.method1212(field1082[var2], (byte) 49);
                        if (var621 == 2500) {
                            field1082[var2++] = var93.field6394;
                            continue;
                        }
                        if (var621 == 2501) {
                            field1082[var2++] = var93.field6434;
                            continue;
                        }
                        if (var621 == 2502) {
                            field1082[var2++] = var93.field6377;
                            continue;
                        }
                        if (var621 == 2503) {
                            field1082[var2++] = var93.field6432;
                            continue;
                        }
                        if (var621 == 2504) {
                            field1082[var2++] = var93.field6459 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 2505) {
                            field1082[var2++] = var93.field6462;
                            continue;
                        }
                    } else if (var621 < 2700) {
                        var2--;
                        class453 var94 = class195.method1212(field1082[var2], (byte) 49);
                        if (var621 == 2600) {
                            field1082[var2++] = var94.field6345;
                            continue;
                        }
                        if (var621 == 2601) {
                            field1082[var2++] = var94.field6386;
                            continue;
                        }
                        if (var621 == 2602) {
                            field1098[var3++] = var94.field6406;
                            continue;
                        }
                        if (var621 == 2603) {
                            field1082[var2++] = var94.field6339;
                            continue;
                        }
                        if (var621 == 2604) {
                            field1082[var2++] = var94.field6417;
                            continue;
                        }
                        if (var621 == 2605) {
                            field1082[var2++] = var94.field6414;
                            continue;
                        }
                        if (var621 == 2606) {
                            field1082[var2++] = var94.field6478;
                            continue;
                        }
                        if (var621 == 2607) {
                            field1082[var2++] = var94.field6477;
                            continue;
                        }
                        if (var621 == 2608) {
                            field1082[var2++] = var94.field6332;
                            continue;
                        }
                        if (var621 == 2609) {
                            field1082[var2++] = var94.field6374;
                            continue;
                        }
                        if (var621 == 2610) {
                            field1082[var2++] = var94.field6457;
                            continue;
                        }
                        if (var621 == 2611) {
                            field1082[var2++] = var94.field6351;
                            continue;
                        }
                        if (var621 == 2612) {
                            field1082[var2++] = var94.field6460;
                            continue;
                        }
                    } else if (var621 < 2800) {
                        if (var621 == 2700) {
                            var2--;
                            class453 var95 = class195.method1212(field1082[var2], (byte) 49);
                            field1082[var2++] = var95.field6358;
                            continue;
                        }
                        if (var621 == 2701) {
                            var2--;
                            class453 var96 = class195.method1212(field1082[var2], (byte) 49);
                            if (var96.field6358 == -1) {
                                field1082[var2++] = 0;
                            } else {
                                field1082[var2++] = var96.field6453;
                            }
                            continue;
                        }
                        if (var621 == 2702) {
                            var2--;
                            int var97 = field1082[var2];
                            class244 var98 = (class244) class282.field3678.method2218(1, (long) var97);
                            if (var98 == null) {
                                field1082[var2++] = 0;
                            } else {
                                field1082[var2++] = 1;
                            }
                            continue;
                        }
                        if (var621 == 2703) {
                            var2--;
                            class453 var99 = class195.method1212(field1082[var2], (byte) 49);
                            if (var99.field6350 == null) {
                                field1082[var2++] = 0;
                                continue;
                            }
                            int var100 = var99.field6350.length;
                            for (int var101 = 0; var101 < var99.field6350.length; var101++) {
                                if (var99.field6350[var101] == null) {
                                    var100 = var101;
                                    break;
                                }
                            }
                            field1082[var2++] = var100;
                            continue;
                        }
                        if (var621 == 2704 || var621 == 2705) {
                            var2 -= 2;
                            int var102 = field1082[var2];
                            int var103 = field1082[var2 + 1];
                            class244 var104 = (class244) class282.field3678.method2218(1, (long) var102);
                            if (var104 != null && var104.field3245 == var103) {
                                field1082[var2++] = 1;
                                continue;
                            }
                            field1082[var2++] = 0;
                            continue;
                        }
                    } else if (var621 < 2900) {
                        var2--;
                        class453 var105 = class195.method1212(field1082[var2], (byte) 49);
                        if (var621 == 2800) {
                            field1082[var2++] = client.method2696(var105).method2257((byte) 94);
                            continue;
                        }
                        if (var621 == 2801) {
                            var2--;
                            int var106 = field1082[var2];
                            int var623 = var106 - 1;
                            if (var105.field6441 != null && var623 < var105.field6441.length && var105.field6441[var623] != null) {
                                field1098[var3++] = var105.field6441[var623];
                                continue;
                            }
                            field1098[var3++] = "";
                            continue;
                        }
                        if (var621 == 2802) {
                            if (var105.field6366 == null) {
                                field1098[var3++] = "";
                            } else {
                                field1098[var3++] = var105.field6366;
                            }
                            continue;
                        }
                    } else if (var621 < 3200) {
                        if (var621 == 3100) {
                            var3--;
                            String var107 = field1098[var3];
                            class134.method876((byte) -111, var107);
                            continue;
                        }
                        if (var621 == 3101) {
                            var2 -= 2;
                            class451.method2798(85, class143.field1684, field1082[var2], field1082[var2 + 1]);
                            continue;
                        }
                        if (var621 == 3103) {
                            class51.method293(true, (byte) 37);
                            continue;
                        }
                        if (var621 == 3104) {
                            var3--;
                            String var108 = field1098[var3];
                            int var109 = 0;
                            if (class357.method2261(var108, 18495)) {
                                var109 = class366.method2311(var108, 80);
                            }
                            field1100++;
                            class427.field5837.method2162(false, 51);
                            class427.field5837.method1560(-26356, var109);
                            continue;
                        }
                        if (var621 == 3105) {
                            var3--;
                            String var110 = field1098[var3];
                            field1086++;
                            class427.field5837.method2162(false, 173);
                            class427.field5837.method1593(var110.length() + 1, -98);
                            class427.field5837.method1562(-71, var110);
                            continue;
                        }
                        if (var621 == 3106) {
                            var3--;
                            String var111 = field1098[var3];
                            field1081++;
                            class427.field5837.method2162(false, 85);
                            class427.field5837.method1593(var111.length() + 1, -122);
                            class427.field5837.method1562(95, var111);
                            continue;
                        }
                        if (var621 == 3107) {
                            var2--;
                            int var112 = field1082[var2];
                            var3--;
                            String var113 = field1098[var3];
                            class282.method1778((byte) -93, var112, var113);
                            continue;
                        }
                        if (var621 == 3108) {
                            var2 -= 3;
                            int var114 = field1082[var2];
                            int var115 = field1082[var2 + 1];
                            int var116 = field1082[var2 + 2];
                            class453 var117 = class195.method1212(var116, (byte) 49);
                            class416.method2560((byte) -114, var117, var115, var114);
                            continue;
                        }
                        if (var621 == 3109) {
                            var2 -= 2;
                            int var118 = field1082[var2];
                            int var119 = field1082[var2 + 1];
                            class453 var120 = var37 ? field1095 : field1096;
                            class416.method2560((byte) -75, var120, var119, var118);
                            continue;
                        }
                        if (var621 == 3110) {
                            var2--;
                            int var121 = field1082[var2];
                            field1083++;
                            class427.field5837.method2162(false, 209);
                            class427.field5837.method1573(-6266, var121);
                            continue;
                        }
                        if (var621 == 3111) {
                            var2 -= 2;
                            int var122 = field1082[var2];
                            int var123 = field1082[var2 + 1];
                            class244 var124 = (class244) class282.field3678.method2218(1, (long) var122);
                            if (var124 != null) {
                                class277.method1741(var124.field3245 != var123, true, var124, 1);
                            }
                            class62.method357(0, var123, var122, true, 3);
                            continue;
                        }
                        if (var621 == 3112) {
                            var2--;
                            int var125 = field1082[var2];
                            class244 var126 = (class244) class282.field3678.method2218(1, (long) var125);
                            if (var126 != null && var126.field3240 == 3) {
                                class277.method1741(true, true, var126, 1);
                            }
                            continue;
                        }
                    } else if (var621 < 3300) {
                        if (var621 == 3200) {
                            var2 -= 3;
                            class390.method2424(field1082[var2 + 1], field1082[var2], 255, field1082[var2 + 2], -1);
                            continue;
                        }
                        if (var621 == 3201) {
                            var2--;
                            class197.method1218(29595, field1082[var2], 255);
                            continue;
                        }
                        if (var621 == 3202) {
                            var2 -= 2;
                            class386.method2401(field1082[var2 + 1], field1082[var2], 255, -1);
                            continue;
                        }
                    } else if (var621 < 3400) {
                        if (var621 == 3300) {
                            field1082[var2++] = class106.field1273;
                            continue;
                        }
                        if (var621 == 3301) {
                            var2 -= 2;
                            int var127 = field1082[var2];
                            int var128 = field1082[var2 + 1];
                            field1082[var2++] = class255.method1629(var128, 5936, var127, false);
                            continue;
                        }
                        if (var621 == 3302) {
                            var2 -= 2;
                            int var129 = field1082[var2];
                            int var130 = field1082[var2 + 1];
                            field1082[var2++] = class161.method1026((byte) 39, false, var129, var130);
                            continue;
                        }
                        if (var621 == 3303) {
                            var2 -= 2;
                            int var131 = field1082[var2];
                            int var132 = field1082[var2 + 1];
                            field1082[var2++] = class42.method260(var131, false, false, var132);
                            continue;
                        }
                        if (var621 == 3304) {
                            var2--;
                            int var133 = field1082[var2];
                            field1082[var2++] = class176.method1104(var133, true).field572;
                            continue;
                        }
                        if (var621 == 3305) {
                            var2--;
                            int var134 = field1082[var2];
                            field1082[var2++] = class240.field3157[var134];
                            continue;
                        }
                        if (var621 == 3306) {
                            var2--;
                            int var135 = field1082[var2];
                            field1082[var2++] = class131.field1500[var135];
                            continue;
                        }
                        if (var621 == 3307) {
                            var2--;
                            int var136 = field1082[var2];
                            field1082[var2++] = class173.field2001[var136];
                            continue;
                        }
                        if (var621 == 3308) {
                            int var137 = class43.field513;
                            int var138 = (class143.field1684.field1516 >> 7) + class278.field3608;
                            int var139 = (class143.field1684.field1514 >> 7) + class129.field1432;
                            field1082[var2++] = (var137 << 28) + (var138 << 14) + var139;
                            continue;
                        }
                        if (var621 == 3309) {
                            var2--;
                            int var140 = field1082[var2];
                            field1082[var2++] = var140 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var621 == 3310) {
                            var2--;
                            int var141 = field1082[var2];
                            field1082[var2++] = var141 >> 28;
                            continue;
                        }
                        if (var621 == 3311) {
                            var2--;
                            int var142 = field1082[var2];
                            field1082[var2++] = var142 & 0x3FFF;
                            continue;
                        }
                        if (var621 == 3312) {
                            field1082[var2++] = class357.field4843 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3313) {
                            var2 -= 2;
                            int var143 = field1082[var2];
                            int var144 = field1082[var2 + 1];
                            field1082[var2++] = class255.method1629(var144, 5936, var143, true);
                            continue;
                        }
                        if (var621 == 3314) {
                            var2 -= 2;
                            int var145 = field1082[var2];
                            int var146 = field1082[var2 + 1];
                            field1082[var2++] = class161.method1026((byte) 36, true, var145, var146);
                            continue;
                        }
                        if (var621 == 3315) {
                            var2 -= 2;
                            int var147 = field1082[var2];
                            int var148 = field1082[var2 + 1];
                            field1082[var2++] = class42.method260(var147, false, true, var148);
                            continue;
                        }
                        if (var621 == 3316) {
                            if (class427.field5842 >= 2) {
                                field1082[var2++] = class427.field5842;
                            } else {
                                field1082[var2++] = 0;
                            }
                            continue;
                        }
                        if (var621 == 3317) {
                            field1082[var2++] = class276.field3571;
                            continue;
                        }
                        if (var621 == 3318) {
                            field1082[var2++] = class388.field5290;
                            continue;
                        }
                        if (var621 == 3321) {
                            field1082[var2++] = class223.field2796;
                            continue;
                        }
                        if (var621 == 3322) {
                            field1082[var2++] = class393.field5361;
                            continue;
                        }
                        if (var621 == 3323) {
                            if (class267.field3453 >= 5 && class267.field3453 <= 9) {
                                field1082[var2++] = 1;
                                continue;
                            }
                            field1082[var2++] = 0;
                            continue;
                        }
                        if (var621 == 3324) {
                            if (class267.field3453 >= 5 && class267.field3453 <= 9) {
                                field1082[var2++] = class267.field3453;
                                continue;
                            }
                            field1082[var2++] = 0;
                            continue;
                        }
                        if (var621 == 3325) {
                            field1082[var2++] = class316.field4246 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3326) {
                            field1082[var2++] = class143.field1684.field1463;
                            continue;
                        }
                        if (var621 == 3327) {
                            field1082[var2++] = class143.field1684.field1466.field5940 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3328) {
                            field1082[var2++] = class374.field5070 && !class265.field3419 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3329) {
                            field1082[var2++] = class352.field4788 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3330) {
                            var2--;
                            int var149 = field1082[var2];
                            field1082[var2++] = class150.method959(122, var149, false);
                            continue;
                        }
                        if (var621 == 3331) {
                            var2 -= 2;
                            int var150 = field1082[var2];
                            int var151 = field1082[var2 + 1];
                            field1082[var2++] = class194.method1207(var150, var151, true, false, false);
                            continue;
                        }
                        if (var621 == 3332) {
                            var2 -= 2;
                            int var152 = field1082[var2];
                            int var153 = field1082[var2 + 1];
                            field1082[var2++] = class194.method1207(var152, var153, true, false, true);
                            continue;
                        }
                        if (var621 == 3333) {
                            field1082[var2++] = class158.field1849;
                            continue;
                        }
                        if (var621 == 3335) {
                            field1082[var2++] = class373.field5057;
                            continue;
                        }
                        if (var621 == 3336) {
                            var2 -= 4;
                            int var154 = field1082[var2];
                            int var155 = field1082[var2 + 1];
                            int var156 = field1082[var2 + 2];
                            int var157 = field1082[var2 + 3];
                            int var158 = (var155 << 14) + var154;
                            int var159 = (var156 << 28) + var158;
                            int var160 = var157 + var159;
                            field1082[var2++] = var160;
                            continue;
                        }
                        if (var621 == 3337) {
                            field1082[var2++] = class333.field4549;
                            continue;
                        }
                        if (var621 == 3338) {
                            field1082[var2++] = class105.method632(0);
                            continue;
                        }
                    } else if (var621 < 3500) {
                        if (var621 == 3400) {
                            var2 -= 2;
                            int var161 = field1082[var2];
                            int var162 = field1082[var2 + 1];
                            class130 var163 = class106.method635(true, var161);
                            field1098[var3++] = var163.method835(-3848, var162);
                            continue;
                        }
                        if (var621 == 3408) {
                            var2 -= 4;
                            int var164 = field1082[var2];
                            int var165 = field1082[var2 + 1];
                            int var166 = field1082[var2 + 2];
                            int var167 = field1082[var2 + 3];
                            class130 var168 = class106.method635(true, var166);
                            if (var168.field1444 == var164 && var168.field1438 == var165) {
                                if (var165 == 115) {
                                    field1098[var3++] = var168.method835(-3848, var167);
                                } else {
                                    field1082[var2++] = var168.method826(var167, 106);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var621 == 3409) {
                            var2 -= 3;
                            int var169 = field1082[var2];
                            int var170 = field1082[var2 + 1];
                            int var171 = field1082[var2 + 2];
                            if (var170 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class130 var172 = class106.method635(true, var170);
                            if (var172.field1438 != var169) {
                                throw new RuntimeException("C3409-1");
                            }
                            field1082[var2++] = var172.method830(var171, true) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3410) {
                            var2--;
                            int var173 = field1082[var2];
                            var3--;
                            String var174 = field1098[var3];
                            if (var173 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class130 var175 = class106.method635(true, var173);
                            if (var175.field1438 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            field1082[var2++] = var175.method831(var174, (byte) -54) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3411) {
                            var2--;
                            int var176 = field1082[var2];
                            class130 var177 = class106.method635(true, var176);
                            field1082[var2++] = var177.field1436.method2219((byte) -101);
                            continue;
                        }
                    } else if (var621 < 3700) {
                        if (var621 == 3600) {
                            if (class349.field4758 == 0) {
                                field1082[var2++] = -2;
                            } else if (class349.field4758 == 1) {
                                field1082[var2++] = -1;
                            } else {
                                field1082[var2++] = class332.field4536;
                            }
                            continue;
                        }
                        if (var621 == 3601) {
                            var2--;
                            int var178 = field1082[var2];
                            if (class349.field4758 == 2 && var178 < class332.field4536) {
                                field1098[var3++] = class107.field1275[var178];
                                if (class300.field4007[var178] == null) {
                                    field1098[var3++] = "";
                                } else {
                                    field1098[var3++] = class300.field4007[var178];
                                }
                                continue;
                            }
                            field1098[var3++] = "";
                            field1098[var3++] = "";
                            continue;
                        }
                        if (var621 == 3602) {
                            var2--;
                            int var179 = field1082[var2];
                            if (class349.field4758 == 2 && var179 < class332.field4536) {
                                field1082[var2++] = class379.field5156[var179];
                                continue;
                            }
                            field1082[var2++] = 0;
                            continue;
                        }
                        if (var621 == 3603) {
                            var2--;
                            int var180 = field1082[var2];
                            if (class349.field4758 == 2 && var180 < class332.field4536) {
                                field1082[var2++] = class242.field3228[var180];
                                continue;
                            }
                            field1082[var2++] = 0;
                            continue;
                        }
                        if (var621 == 3604) {
                            var3--;
                            String var181 = field1098[var3];
                            var2--;
                            int var182 = field1082[var2];
                            class76.method455(var182, var181, (byte) -89);
                            continue;
                        }
                        if (var621 == 3605) {
                            var3--;
                            String var183 = field1098[var3];
                            class198.method1225((byte) 85, var183);
                            continue;
                        }
                        if (var621 == 3606) {
                            var3--;
                            String var184 = field1098[var3];
                            class59.method335(1, var184);
                            continue;
                        }
                        if (var621 == 3607) {
                            var3--;
                            String var185 = field1098[var3];
                            class98.method605(1, false, var185);
                            continue;
                        }
                        if (var621 == 3608) {
                            var3--;
                            String var186 = field1098[var3];
                            class18.method113(83, var186);
                            continue;
                        }
                        if (var621 == 3609) {
                            var3--;
                            String var187 = field1098[var3];
                            if (var187.startsWith("<img=0>") || var187.startsWith("<img=1>")) {
                                var187 = var187.substring(7);
                            }
                            field1082[var2++] = class249.method1620(true, var187) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3610) {
                            var2--;
                            int var188 = field1082[var2];
                            if (class349.field4758 == 2 && var188 < class332.field4536) {
                                field1098[var3++] = class302.field4060[var188];
                                continue;
                            }
                            field1098[var3++] = "";
                            continue;
                        }
                        if (var621 == 3611) {
                            if (class363.field4934 == null) {
                                field1098[var3++] = "";
                            } else {
                                field1098[var3++] = class207.method1264(class363.field4934, 7507);
                            }
                            continue;
                        }
                        if (var621 == 3612) {
                            if (class363.field4934 == null) {
                                field1082[var2++] = 0;
                            } else {
                                field1082[var2++] = class406.field5615;
                            }
                            continue;
                        }
                        if (var621 == 3613) {
                            var2--;
                            int var189 = field1082[var2];
                            if (class363.field4934 != null && var189 < class406.field5615) {
                                field1098[var3++] = class345.field4693[var189].field6070;
                                continue;
                            }
                            field1098[var3++] = "";
                            continue;
                        }
                        if (var621 == 3614) {
                            var2--;
                            int var190 = field1082[var2];
                            if (class363.field4934 != null && var190 < class406.field5615) {
                                field1082[var2++] = class345.field4693[var190].field6065;
                                continue;
                            }
                            field1082[var2++] = 0;
                            continue;
                        }
                        if (var621 == 3615) {
                            var2--;
                            int var191 = field1082[var2];
                            if (class363.field4934 != null && var191 < class406.field5615) {
                                field1082[var2++] = class345.field4693[var191].field6068;
                                continue;
                            }
                            field1082[var2++] = 0;
                            continue;
                        }
                        if (var621 == 3616) {
                            field1082[var2++] = class176.field2065;
                            continue;
                        }
                        if (var621 == 3617) {
                            var3--;
                            String var192 = field1098[var3];
                            class39.method252(var192, 19724);
                            continue;
                        }
                        if (var621 == 3618) {
                            field1082[var2++] = class20.field217;
                            continue;
                        }
                        if (var621 == 3619) {
                            var3--;
                            String var193 = field1098[var3];
                            class247.method1617((byte) 83, var193);
                            continue;
                        }
                        if (var621 == 3620) {
                            class393.method2439(-104);
                            continue;
                        }
                        if (var621 == 3621) {
                            if (class349.field4758 == 0) {
                                field1082[var2++] = -1;
                            } else {
                                field1082[var2++] = class368.field5019;
                            }
                            continue;
                        }
                        if (var621 == 3622) {
                            var2--;
                            int var194 = field1082[var2];
                            if (class349.field4758 != 0 && var194 < class368.field5019) {
                                field1098[var3++] = class319.field4290[var194];
                                if (class89.field1026[var194] == null) {
                                    field1098[var3++] = "";
                                } else {
                                    field1098[var3++] = class89.field1026[var194];
                                }
                                continue;
                            }
                            field1098[var3++] = "";
                            field1098[var3++] = "";
                            continue;
                        }
                        if (var621 == 3623) {
                            var3--;
                            String var195 = field1098[var3];
                            if (var195.startsWith("<img=0>") || var195.startsWith("<img=1>")) {
                                var195 = var195.substring(7);
                            }
                            field1082[var2++] = class430.method2622(var195, 4) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3624) {
                            var2--;
                            int var196 = field1082[var2];
                            if (class345.field4693 != null && var196 < class406.field5615 && class345.field4693[var196].field6066.equalsIgnoreCase(class143.field1684.field1480)) {
                                field1082[var2++] = 1;
                                continue;
                            }
                            field1082[var2++] = 0;
                            continue;
                        }
                        if (var621 == 3625) {
                            if (class349.field4760 == null) {
                                field1098[var3++] = "";
                            } else {
                                field1098[var3++] = class349.field4760;
                            }
                            continue;
                        }
                        if (var621 == 3626) {
                            var2--;
                            int var197 = field1082[var2];
                            if (class363.field4934 != null && var197 < class406.field5615) {
                                field1098[var3++] = class345.field4693[var197].field6063;
                                continue;
                            }
                            field1098[var3++] = "";
                            continue;
                        }
                        if (var621 == 3627) {
                            var2--;
                            int var198 = field1082[var2];
                            if (class349.field4758 == 2 && var198 >= 0 && var198 < class332.field4536) {
                                field1082[var2++] = class314.field4230[var198] ? 1 : 0;
                                continue;
                            }
                            field1082[var2++] = 0;
                            continue;
                        }
                        if (var621 == 3628) {
                            var3--;
                            String var199 = field1098[var3];
                            if (var199.startsWith("<img=0>") || var199.startsWith("<img=1>")) {
                                var199 = var199.substring(7);
                            }
                            field1082[var2++] = class134.method870(true, var199);
                            continue;
                        }
                        if (var621 == 3629) {
                            field1082[var2++] = class104.field1230;
                            continue;
                        }
                        if (var621 == 3630) {
                            var3--;
                            String var200 = field1098[var3];
                            class98.method605(1, true, var200);
                            continue;
                        }
                        if (var621 == 3631) {
                            var2--;
                            int var201 = field1082[var2];
                            field1082[var2++] = class361.field4893[var201] ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3632) {
                            var2--;
                            int var202 = field1082[var2];
                            if (class363.field4934 != null && var202 < class406.field5615) {
                                field1098[var3++] = class345.field4693[var202].field6066;
                                continue;
                            }
                            field1098[var3++] = "";
                            continue;
                        }
                        if (var621 == 3633) {
                            var2--;
                            int var203 = field1082[var2];
                            if (class349.field4758 != 0 && var203 < class368.field5019) {
                                field1098[var3++] = class453.field6480[var203];
                                continue;
                            }
                            field1098[var3++] = "";
                            continue;
                        }
                    } else if (var621 < 4000) {
                        if (var621 == 3903) {
                            var2--;
                            int var204 = field1082[var2];
                            field1082[var2++] = class275.field3558[var204].method2157(true);
                            continue;
                        }
                        if (var621 == 3904) {
                            var2--;
                            int var205 = field1082[var2];
                            field1082[var2++] = class275.field3558[var205].field4582;
                            continue;
                        }
                        if (var621 == 3905) {
                            var2--;
                            int var206 = field1082[var2];
                            field1082[var2++] = class275.field3558[var206].field4575;
                            continue;
                        }
                        if (var621 == 3906) {
                            var2--;
                            int var207 = field1082[var2];
                            field1082[var2++] = class275.field3558[var207].field4578;
                            continue;
                        }
                        if (var621 == 3907) {
                            var2--;
                            int var208 = field1082[var2];
                            field1082[var2++] = class275.field3558[var208].field4577;
                            continue;
                        }
                        if (var621 == 3908) {
                            var2--;
                            int var209 = field1082[var2];
                            field1082[var2++] = class275.field3558[var209].field4581;
                            continue;
                        }
                        if (var621 == 3910) {
                            var2--;
                            int var210 = field1082[var2];
                            int var211 = class275.field3558[var210].method2152(-126);
                            field1082[var2++] = var211 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3911) {
                            var2--;
                            int var212 = field1082[var2];
                            int var213 = class275.field3558[var212].method2152(-115);
                            field1082[var2++] = var213 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3912) {
                            var2--;
                            int var214 = field1082[var2];
                            int var215 = class275.field3558[var214].method2152(-121);
                            field1082[var2++] = var215 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3913) {
                            var2--;
                            int var216 = field1082[var2];
                            int var217 = class275.field3558[var216].method2152(-119);
                            field1082[var2++] = var217 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var621 < 4100) {
                        if (var621 == 4000) {
                            var2 -= 2;
                            int var218 = field1082[var2];
                            int var219 = field1082[var2 + 1];
                            field1082[var2++] = var218 + var219;
                            continue;
                        }
                        if (var621 == 4001) {
                            var2 -= 2;
                            int var220 = field1082[var2];
                            int var221 = field1082[var2 + 1];
                            field1082[var2++] = var220 - var221;
                            continue;
                        }
                        if (var621 == 4002) {
                            var2 -= 2;
                            int var222 = field1082[var2];
                            int var223 = field1082[var2 + 1];
                            field1082[var2++] = var222 * var223;
                            continue;
                        }
                        if (var621 == 4003) {
                            var2 -= 2;
                            int var224 = field1082[var2];
                            int var225 = field1082[var2 + 1];
                            field1082[var2++] = var224 / var225;
                            continue;
                        }
                        if (var621 == 4004) {
                            var2--;
                            int var226 = field1082[var2];
                            field1082[var2++] = (int) (Math.random() * (double) var226);
                            continue;
                        }
                        if (var621 == 4005) {
                            var2--;
                            int var227 = field1082[var2];
                            field1082[var2++] = (int) (Math.random() * (double) (var227 + 1));
                            continue;
                        }
                        if (var621 == 4006) {
                            var2 -= 5;
                            int var228 = field1082[var2];
                            int var229 = field1082[var2 + 1];
                            int var230 = field1082[var2 + 2];
                            int var231 = field1082[var2 + 3];
                            int var232 = field1082[var2 + 4];
                            field1082[var2++] = (var229 - var228) * (var232 - var230) / (var231 - var230) + var228;
                            continue;
                        }
                        if (var621 == 4007) {
                            var2 -= 2;
                            long var233 = (long) field1082[var2];
                            long var235 = (long) field1082[var2 + 1];
                            field1082[var2++] = (int) (var233 * var235 / 100L + var233);
                            continue;
                        }
                        if (var621 == 4008) {
                            var2 -= 2;
                            int var237 = field1082[var2];
                            int var238 = field1082[var2 + 1];
                            field1082[var2++] = var237 | 0x1 << var238;
                            continue;
                        }
                        if (var621 == 4009) {
                            var2 -= 2;
                            int var239 = field1082[var2];
                            int var240 = field1082[var2 + 1];
                            field1082[var2++] = var239 & -(0x1 << var240) - 1;
                            continue;
                        }
                        if (var621 == 4010) {
                            var2 -= 2;
                            int var241 = field1082[var2];
                            int var242 = field1082[var2 + 1];
                            field1082[var2++] = (var241 & 0x1 << var242) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var621 == 4011) {
                            var2 -= 2;
                            int var243 = field1082[var2];
                            int var244 = field1082[var2 + 1];
                            field1082[var2++] = var243 % var244;
                            continue;
                        }
                        if (var621 == 4012) {
                            var2 -= 2;
                            int var245 = field1082[var2];
                            int var246 = field1082[var2 + 1];
                            if (var245 == 0) {
                                field1082[var2++] = 0;
                            } else {
                                field1082[var2++] = (int) Math.pow((double) var245, (double) var246);
                            }
                            continue;
                        }
                        if (var621 == 4013) {
                            var2 -= 2;
                            int var247 = field1082[var2];
                            int var248 = field1082[var2 + 1];
                            if (var247 == 0) {
                                field1082[var2++] = 0;
                            } else if (var248 == 0) {
                                field1082[var2++] = Integer.MAX_VALUE;
                            } else {
                                field1082[var2++] = (int) Math.pow((double) var247, 1.0D / (double) var248);
                            }
                            continue;
                        }
                        if (var621 == 4014) {
                            var2 -= 2;
                            int var249 = field1082[var2];
                            int var250 = field1082[var2 + 1];
                            field1082[var2++] = var249 & var250;
                            continue;
                        }
                        if (var621 == 4015) {
                            var2 -= 2;
                            int var251 = field1082[var2];
                            int var252 = field1082[var2 + 1];
                            field1082[var2++] = var251 | var252;
                            continue;
                        }
                        if (var621 == 4016) {
                            var2 -= 2;
                            int var253 = field1082[var2];
                            int var254 = field1082[var2 + 1];
                            field1082[var2++] = var253 < var254 ? var253 : var254;
                            continue;
                        }
                        if (var621 == 4017) {
                            var2 -= 2;
                            int var255 = field1082[var2];
                            int var256 = field1082[var2 + 1];
                            field1082[var2++] = var255 > var256 ? var255 : var256;
                            continue;
                        }
                        if (var621 == 4018) {
                            var2 -= 3;
                            long var257 = (long) field1082[var2];
                            long var259 = (long) field1082[var2 + 1];
                            long var261 = (long) field1082[var2 + 2];
                            field1082[var2++] = (int) (var257 * var261 / var259);
                            continue;
                        }
                    } else if (var621 < 4200) {
                        if (var621 == 4100) {
                            var3--;
                            String var263 = field1098[var3];
                            var2--;
                            int var264 = field1082[var2];
                            field1098[var3++] = var263 + var264;
                            continue;
                        }
                        if (var621 == 4101) {
                            var3 -= 2;
                            String var265 = field1098[var3];
                            String var266 = field1098[var3 + 1];
                            field1098[var3++] = var265 + var266;
                            continue;
                        }
                        if (var621 == 4102) {
                            var3--;
                            String var267 = field1098[var3];
                            var2--;
                            int var268 = field1082[var2];
                            field1098[var3++] = var267 + class300.method1903(var268, true, 1365);
                            continue;
                        }
                        if (var621 == 4103) {
                            var3--;
                            String var269 = field1098[var3];
                            field1098[var3++] = var269.toLowerCase();
                            continue;
                        }
                        if (var621 == 4104) {
                            var2--;
                            int var270 = field1082[var2];
                            long var271 = ((long) var270 + 11745L) * 86400000L;
                            field1084.setTime(new Date(var271));
                            int var273 = field1084.get(5);
                            int var274 = field1084.get(2);
                            int var275 = field1084.get(1);
                            field1098[var3++] = var273 + "-" + field1104[var274] + "-" + var275;
                            continue;
                        }
                        if (var621 == 4105) {
                            var3 -= 2;
                            String var276 = field1098[var3];
                            String var277 = field1098[var3 + 1];
                            if (class143.field1684.field1466 != null && class143.field1684.field1466.field5940) {
                                field1098[var3++] = var277;
                                continue;
                            }
                            field1098[var3++] = var276;
                            continue;
                        }
                        if (var621 == 4106) {
                            var2--;
                            int var278 = field1082[var2];
                            field1098[var3++] = Integer.toString(var278);
                            continue;
                        }
                        if (var621 == 4107) {
                            var3 -= 2;
                            field1082[var2++] = class163.method1037(class373.field5057, field1098[var3], field1098[var3 + 1], (byte) 92);
                            continue;
                        }
                        if (var621 == 4108) {
                            var3--;
                            String var279 = field1098[var3];
                            var2 -= 2;
                            int var280 = field1082[var2];
                            int var281 = field1082[var2 + 1];
                            class347 var282 = class181.method1132(var281, 0, (byte) 45, class201.field2370);
                            field1082[var2++] = var282.method2207(var279, class333.field4546, var280, false);
                            continue;
                        }
                        if (var621 == 4109) {
                            var3--;
                            String var283 = field1098[var3];
                            var2 -= 2;
                            int var284 = field1082[var2];
                            int var285 = field1082[var2 + 1];
                            class347 var286 = class181.method1132(var285, 0, (byte) 45, class201.field2370);
                            field1082[var2++] = var286.method2209(0, var283, var284, class333.field4546);
                            continue;
                        }
                        if (var621 == 4110) {
                            var3 -= 2;
                            String var287 = field1098[var3];
                            String var288 = field1098[var3 + 1];
                            var2--;
                            if (field1082[var2] == 1) {
                                field1098[var3++] = var287;
                            } else {
                                field1098[var3++] = var288;
                            }
                            continue;
                        }
                        if (var621 == 4111) {
                            var3--;
                            String var289 = field1098[var3];
                            field1098[var3++] = class50.method279((byte) 5, var289);
                            continue;
                        }
                        if (var621 == 4112) {
                            var3--;
                            String var290 = field1098[var3];
                            var2--;
                            int var291 = field1082[var2];
                            if (var291 == -1) {
                                throw new RuntimeException("null char");
                            }
                            field1098[var3++] = var290 + (char) var291;
                            continue;
                        }
                        if (var621 == 4113) {
                            var2--;
                            int var292 = field1082[var2];
                            field1082[var2++] = class5.method18(-340, (char) var292) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 4114) {
                            var2--;
                            int var293 = field1082[var2];
                            field1082[var2++] = class277.method1742((byte) -61, (char) var293) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 4115) {
                            var2--;
                            int var294 = field1082[var2];
                            field1082[var2++] = class332.method2132((char) var294, -25171) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 4116) {
                            var2--;
                            int var295 = field1082[var2];
                            field1082[var2++] = class52.method299(48, (char) var295) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 4117) {
                            var3--;
                            String var296 = field1098[var3];
                            if (var296 == null) {
                                field1082[var2++] = 0;
                            } else {
                                field1082[var2++] = var296.length();
                            }
                            continue;
                        }
                        if (var621 == 4118) {
                            var3--;
                            String var297 = field1098[var3];
                            var2 -= 2;
                            int var298 = field1082[var2];
                            int var299 = field1082[var2 + 1];
                            field1098[var3++] = var297.substring(var298, var299);
                            continue;
                        }
                        if (var621 == 4119) {
                            var3--;
                            String var300 = field1098[var3];
                            StringBuffer var301 = new StringBuffer(var300.length());
                            boolean var302 = false;
                            for (int var303 = 0; var303 < var300.length(); var303++) {
                                char var304 = var300.charAt(var303);
                                if (var304 == '<') {
                                    var302 = true;
                                } else if (var304 == '>') {
                                    var302 = false;
                                } else if (!var302) {
                                    var301.append(var304);
                                }
                            }
                            field1098[var3++] = var301.toString();
                            continue;
                        }
                        if (var621 == 4120) {
                            var3--;
                            String var305 = field1098[var3];
                            var2 -= 2;
                            int var306 = field1082[var2];
                            int var307 = field1082[var2 + 1];
                            field1082[var2++] = var305.indexOf(var306, var307);
                            continue;
                        }
                        if (var621 == 4121) {
                            var3 -= 2;
                            String var308 = field1098[var3];
                            String var309 = field1098[var3 + 1];
                            var2--;
                            int var310 = field1082[var2];
                            field1082[var2++] = var308.indexOf(var309, var310);
                            continue;
                        }
                        if (var621 == 4122) {
                            var2--;
                            int var311 = field1082[var2];
                            field1082[var2++] = Character.toLowerCase((char) var311);
                            continue;
                        }
                        if (var621 == 4123) {
                            var2--;
                            int var312 = field1082[var2];
                            field1082[var2++] = Character.toUpperCase((char) var312);
                            continue;
                        }
                        if (var621 == 4124) {
                            var2--;
                            boolean var313 = field1082[var2] != 0;
                            var2--;
                            int var314 = field1082[var2];
                            field1098[var3++] = class118.method734((long) var314, var313, class373.field5057, 10, 0);
                            continue;
                        }
                        if (var621 == 4125) {
                            var3--;
                            String var315 = field1098[var3];
                            var2--;
                            int var316 = field1082[var2];
                            class347 var317 = class181.method1132(var316, 0, (byte) 45, class201.field2370);
                            field1082[var2++] = var317.method2212(76, class333.field4546, var315);
                            continue;
                        }
                    } else if (var621 < 4300) {
                        if (var621 == 4200) {
                            var2--;
                            int var318 = field1082[var2];
                            field1098[var3++] = class131.method843((byte) 5, var318).field736;
                            continue;
                        }
                        if (var621 == 4201) {
                            var2 -= 2;
                            int var319 = field1082[var2];
                            int var320 = field1082[var2 + 1];
                            class59 var321 = class131.method843((byte) 5, var319);
                            if (var320 >= 1 && var320 <= 5 && var321.field732[var320 - 1] != null) {
                                field1098[var3++] = var321.field732[var320 - 1];
                                continue;
                            }
                            field1098[var3++] = "";
                            continue;
                        }
                        if (var621 == 4202) {
                            var2 -= 2;
                            int var322 = field1082[var2];
                            int var323 = field1082[var2 + 1];
                            class59 var324 = class131.method843((byte) 5, var322);
                            if (var323 >= 1 && var323 <= 5 && var324.field704[var323 - 1] != null) {
                                field1098[var3++] = var324.field704[var323 - 1];
                                continue;
                            }
                            field1098[var3++] = "";
                            continue;
                        }
                        if (var621 == 4203) {
                            var2--;
                            int var325 = field1082[var2];
                            field1082[var2++] = class131.method843((byte) 5, var325).field713;
                            continue;
                        }
                        if (var621 == 4204) {
                            var2--;
                            int var326 = field1082[var2];
                            field1082[var2++] = class131.method843((byte) 5, var326).field678 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 4205) {
                            var2--;
                            int var327 = field1082[var2];
                            class59 var328 = class131.method843((byte) 5, var327);
                            if (var328.field719 == -1 && var328.field734 >= 0) {
                                field1082[var2++] = var328.field734;
                                continue;
                            }
                            field1082[var2++] = var327;
                            continue;
                        }
                        if (var621 == 4206) {
                            var2--;
                            int var329 = field1082[var2];
                            class59 var330 = class131.method843((byte) 5, var329);
                            if (var330.field719 >= 0 && var330.field734 >= 0) {
                                field1082[var2++] = var330.field734;
                                continue;
                            }
                            field1082[var2++] = var329;
                            continue;
                        }
                        if (var621 == 4207) {
                            var2--;
                            int var331 = field1082[var2];
                            field1082[var2++] = class131.method843((byte) 5, var331).field685 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 4208) {
                            var2 -= 2;
                            int var332 = field1082[var2];
                            int var333 = field1082[var2 + 1];
                            class354 var334 = class450.method2783(var333, (byte) 104);
                            if (var334.method2246(64)) {
                                field1098[var3++] = class131.method843((byte) 5, var332).method342(var334.field4810, var333, -29990);
                            } else {
                                field1082[var2++] = class131.method843((byte) 5, var332).method341((byte) 110, var333, var334.field4814);
                            }
                            continue;
                        }
                        if (var621 == 4209) {
                            var2 -= 2;
                            int var335 = field1082[var2];
                            int var336 = field1082[var2 + 1] - 1;
                            class59 var337 = class131.method843((byte) 5, var335);
                            if (var337.field694 == var336) {
                                field1082[var2++] = var337.field711;
                            } else if (var337.field679 == var336) {
                                field1082[var2++] = var337.field695;
                            } else {
                                field1082[var2++] = -1;
                            }
                            continue;
                        }
                        if (var621 == 4210) {
                            var3--;
                            String var338 = field1098[var3];
                            var2--;
                            int var339 = field1082[var2];
                            class148.method955(var339 == 1, -15697, var338);
                            field1082[var2++] = class401.field5534;
                            continue;
                        }
                        if (var621 == 4211) {
                            if (class118.field1355 != null && class396.field5385 < class401.field5534) {
                                field1082[var2++] = class118.field1355[class396.field5385++] & 0xFFFF;
                                continue;
                            }
                            field1082[var2++] = -1;
                            continue;
                        }
                        if (var621 == 4212) {
                            class396.field5385 = 0;
                            continue;
                        }
                    } else if (var621 < 4400) {
                        if (var621 == 4300) {
                            var2 -= 2;
                            int var340 = field1082[var2];
                            int var341 = field1082[var2 + 1];
                            class354 var342 = class450.method2783(var341, (byte) -43);
                            if (var342.method2246(97)) {
                                field1098[var3++] = class225.method1387(var340, (byte) -120).method1956(var342.field4810, var341, (byte) 104);
                            } else {
                                field1082[var2++] = class225.method1387(var340, (byte) -127).method1955((byte) 85, var342.field4814, var341);
                            }
                            continue;
                        }
                    } else if (var621 < 4500) {
                        if (var621 == 4400) {
                            var2 -= 2;
                            int var343 = field1082[var2];
                            int var344 = field1082[var2 + 1];
                            class354 var345 = class450.method2783(var344, (byte) 98);
                            if (var345.method2246(95)) {
                                field1098[var3++] = class380.method2361(var343, -29012).method2773(var345.field4810, var344, 12288);
                            } else {
                                field1082[var2++] = class380.method2361(var343, -29012).method2765((byte) 114, var345.field4814, var344);
                            }
                            continue;
                        }
                    } else if (var621 < 4600) {
                        if (var621 == 4500) {
                            var2 -= 2;
                            int var346 = field1082[var2];
                            int var347 = field1082[var2 + 1];
                            class354 var348 = class450.method2783(var347, (byte) 121);
                            if (var348.method2246(-97)) {
                                field1098[var3++] = class330.method2123(29, var346).method1752(90, var348.field4810, var347);
                            } else {
                                field1082[var2++] = class330.method2123(29, var346).method1750(125, var348.field4814, var347);
                            }
                            continue;
                        }
                    } else if (var621 < 4700) {
                        if (var621 == 4600) {
                            var2--;
                            int var349 = field1082[var2];
                            class437 var350 = class207.method1267(var349, (byte) -101);
                            if (var350.field5974 != null && var350.field5974.length > 0) {
                                int var351 = 0;
                                int var352 = var350.field5959[0];
                                for (int var353 = 1; var353 < var350.field5974.length; var353++) {
                                    if (var350.field5959[var353] > var352) {
                                        var351 = var353;
                                        var352 = var350.field5959[var353];
                                    }
                                }
                                field1082[var2++] = var350.field5974[var351];
                                continue;
                            }
                            field1082[var2++] = var350.field5967;
                            continue;
                        }
                    } else if (var621 < 5100) {
                        if (var621 == 5000) {
                            field1082[var2++] = class204.field2468;
                            continue;
                        }
                        if (var621 == 5001) {
                            var2 -= 3;
                            class204.field2468 = field1082[var2];
                            class369.field5029 = field1082[var2 + 1];
                            class181.field2114 = field1082[var2 + 2];
                            field1088++;
                            class427.field5837.method2162(false, 54);
                            class427.field5837.method1593(class204.field2468, -92);
                            class427.field5837.method1593(class369.field5029, -92);
                            class427.field5837.method1593(class181.field2114, -93);
                            continue;
                        }
                        if (var621 == 5002) {
                            var3 -= 2;
                            String var354 = field1098[var3];
                            String var355 = field1098[var3 + 1];
                            var2 -= 2;
                            int var356 = field1082[var2];
                            int var357 = field1082[var2 + 1];
                            if (var355 == null) {
                                var355 = "";
                            }
                            if (var355.length() > 80) {
                                var355 = var355.substring(0, 80);
                            }
                            field1085++;
                            class427.field5837.method2162(false, 186);
                            class427.field5837.method1593(class350.method2229(2, var354) + class350.method2229(2, var355) + 2, -114);
                            class427.field5837.method1562(-48, var354);
                            class427.field5837.method1593(var356 - 1, -91);
                            class427.field5837.method1593(var357, -118);
                            class427.field5837.method1562(-104, var355);
                            continue;
                        }
                        if (var621 == 5003) {
                            var2--;
                            int var358 = field1082[var2];
                            String var359 = null;
                            if (var358 < 100) {
                                var359 = class28.field321[var358];
                            }
                            if (var359 == null) {
                                var359 = "";
                            }
                            field1098[var3++] = var359;
                            continue;
                        }
                        if (var621 == 5004) {
                            var2--;
                            int var360 = field1082[var2];
                            int var361 = -1;
                            if (var360 < 100 && class28.field321[var360] != null) {
                                var361 = class202.field2378[var360];
                            }
                            field1082[var2++] = var361;
                            continue;
                        }
                        if (var621 == 5005) {
                            field1082[var2++] = class369.field5029;
                            continue;
                        }
                        if (var621 == 5008) {
                            var3--;
                            String var362 = field1098[var3];
                            if (class427.field5842 == 0 && (class374.field5070 && !class265.field3419 || class352.field4788)) {
                                continue;
                            }
                            String var363 = var362.toLowerCase();
                            byte var364 = 0;
                            if (var363.startsWith(class397.field5390.method434(0, -8192))) {
                                var364 = 0;
                                var362 = var362.substring(class397.field5390.method434(0, -8192).length());
                            } else if (var363.startsWith(class57.field659.method434(0, -8192))) {
                                var364 = 1;
                                var362 = var362.substring(class57.field659.method434(0, -8192).length());
                            } else if (var363.startsWith(class376.field5092.method434(0, -8192))) {
                                var364 = 2;
                                var362 = var362.substring(class376.field5092.method434(0, -8192).length());
                            } else if (var363.startsWith(class204.field2470.method434(0, -8192))) {
                                var364 = 3;
                                var362 = var362.substring(class204.field2470.method434(0, -8192).length());
                            } else if (var363.startsWith(class318.field4279.method434(0, -8192))) {
                                var364 = 4;
                                var362 = var362.substring(class318.field4279.method434(0, -8192).length());
                            } else if (var363.startsWith(class393.field5359.method434(0, -8192))) {
                                var364 = 5;
                                var362 = var362.substring(class393.field5359.method434(0, -8192).length());
                            } else if (var363.startsWith(class213.field2624.method434(0, -8192))) {
                                var364 = 6;
                                var362 = var362.substring(class213.field2624.method434(0, -8192).length());
                            } else if (var363.startsWith(class130.field1451.method434(0, -8192))) {
                                var364 = 7;
                                var362 = var362.substring(class130.field1451.method434(0, -8192).length());
                            } else if (var363.startsWith(class362.field4907.method434(0, -8192))) {
                                var364 = 8;
                                var362 = var362.substring(class362.field4907.method434(0, -8192).length());
                            } else if (var363.startsWith(class258.field3319.method434(0, -8192))) {
                                var364 = 9;
                                var362 = var362.substring(class258.field3319.method434(0, -8192).length());
                            } else if (var363.startsWith(class349.field4756.method434(0, -8192))) {
                                var364 = 10;
                                var362 = var362.substring(class349.field4756.method434(0, -8192).length());
                            } else if (var363.startsWith(class393.field5352.method434(0, -8192))) {
                                var364 = 11;
                                var362 = var362.substring(class393.field5352.method434(0, -8192).length());
                            } else if (class373.field5057 != 0) {
                                if (var363.startsWith(class397.field5390.method434(class373.field5057, -8192))) {
                                    var364 = 0;
                                    var362 = var362.substring(class397.field5390.method434(class373.field5057, -8192).length());
                                } else if (var363.startsWith(class57.field659.method434(class373.field5057, -8192))) {
                                    var364 = 1;
                                    var362 = var362.substring(class57.field659.method434(class373.field5057, -8192).length());
                                } else if (var363.startsWith(class376.field5092.method434(class373.field5057, -8192))) {
                                    var364 = 2;
                                    var362 = var362.substring(class376.field5092.method434(class373.field5057, -8192).length());
                                } else if (var363.startsWith(class204.field2470.method434(class373.field5057, -8192))) {
                                    var364 = 3;
                                    var362 = var362.substring(class204.field2470.method434(class373.field5057, -8192).length());
                                } else if (var363.startsWith(class318.field4279.method434(class373.field5057, -8192))) {
                                    var364 = 4;
                                    var362 = var362.substring(class318.field4279.method434(class373.field5057, -8192).length());
                                } else if (var363.startsWith(class393.field5359.method434(class373.field5057, -8192))) {
                                    var364 = 5;
                                    var362 = var362.substring(class393.field5359.method434(class373.field5057, -8192).length());
                                } else if (var363.startsWith(class213.field2624.method434(class373.field5057, -8192))) {
                                    var364 = 6;
                                    var362 = var362.substring(class213.field2624.method434(class373.field5057, -8192).length());
                                } else if (var363.startsWith(class130.field1451.method434(class373.field5057, -8192))) {
                                    var364 = 7;
                                    var362 = var362.substring(class130.field1451.method434(class373.field5057, -8192).length());
                                } else if (var363.startsWith(class362.field4907.method434(class373.field5057, -8192))) {
                                    var364 = 8;
                                    var362 = var362.substring(class362.field4907.method434(class373.field5057, -8192).length());
                                } else if (var363.startsWith(class258.field3319.method434(class373.field5057, -8192))) {
                                    var364 = 9;
                                    var362 = var362.substring(class258.field3319.method434(class373.field5057, -8192).length());
                                } else if (var363.startsWith(class349.field4756.method434(class373.field5057, -8192))) {
                                    var364 = 10;
                                    var362 = var362.substring(class349.field4756.method434(class373.field5057, -8192).length());
                                } else if (var363.startsWith(class393.field5352.method434(class373.field5057, -8192))) {
                                    var364 = 11;
                                    var362 = var362.substring(class393.field5352.method434(class373.field5057, -8192).length());
                                }
                            }
                            String var365 = var362.toLowerCase();
                            byte var366 = 0;
                            if (var365.startsWith(class334.field4555.method434(0, -8192))) {
                                var366 = 1;
                                var362 = var362.substring(class334.field4555.method434(0, -8192).length());
                            } else if (var365.startsWith(class383.field5238.method434(0, -8192))) {
                                var366 = 2;
                                var362 = var362.substring(class383.field5238.method434(0, -8192).length());
                            } else if (var365.startsWith(class194.field2299.method434(0, -8192))) {
                                var366 = 3;
                                var362 = var362.substring(class194.field2299.method434(0, -8192).length());
                            } else if (var365.startsWith(class54.field628.method434(0, -8192))) {
                                var366 = 4;
                                var362 = var362.substring(class54.field628.method434(0, -8192).length());
                            } else if (var365.startsWith(class211.field2575.method434(0, -8192))) {
                                var366 = 5;
                                var362 = var362.substring(class211.field2575.method434(0, -8192).length());
                            } else if (class373.field5057 != 0) {
                                if (var365.startsWith(class334.field4555.method434(class373.field5057, -8192))) {
                                    var366 = 1;
                                    var362 = var362.substring(class334.field4555.method434(class373.field5057, -8192).length());
                                } else if (var365.startsWith(class383.field5238.method434(class373.field5057, -8192))) {
                                    var366 = 2;
                                    var362 = var362.substring(class383.field5238.method434(class373.field5057, -8192).length());
                                } else if (var365.startsWith(class194.field2299.method434(class373.field5057, -8192))) {
                                    var366 = 3;
                                    var362 = var362.substring(class194.field2299.method434(class373.field5057, -8192).length());
                                } else if (var365.startsWith(class54.field628.method434(class373.field5057, -8192))) {
                                    var366 = 4;
                                    var362 = var362.substring(class54.field628.method434(class373.field5057, -8192).length());
                                } else if (var365.startsWith(class211.field2575.method434(class373.field5057, -8192))) {
                                    var366 = 5;
                                    var362 = var362.substring(class211.field2575.method434(class373.field5057, -8192).length());
                                }
                            }
                            field1090++;
                            class427.field5837.method2162(false, 210);
                            class427.field5837.method1593(0, -123);
                            int var367 = class427.field5837.field3211;
                            class427.field5837.method1593(var364, -125);
                            class427.field5837.method1593(var366, -108);
                            class411.method2548((byte) 41, class427.field5837, var362);
                            class427.field5837.method1597(class427.field5837.field3211 - var367, -104);
                            continue;
                        }
                        if (var621 == 5009) {
                            var3 -= 2;
                            String var368 = field1098[var3];
                            String var369 = field1098[var3 + 1];
                            if (class427.field5842 != 0 || (!class374.field5070 || class265.field3419) && !class352.field4788) {
                                field1093++;
                                class427.field5837.method2162(false, 49);
                                class427.field5837.method1593(0, -117);
                                int var370 = class427.field5837.field3211;
                                class427.field5837.method1562(-48, var368);
                                class411.method2548((byte) 41, class427.field5837, var369);
                                class427.field5837.method1597(class427.field5837.field3211 - var370, -120);
                            }
                            continue;
                        }
                        if (var621 == 5010) {
                            var2--;
                            int var371 = field1082[var2];
                            String var372 = null;
                            if (var371 < 100) {
                                var372 = class35.field382[var371];
                            }
                            if (var372 == null) {
                                var372 = "";
                            }
                            field1098[var3++] = var372;
                            continue;
                        }
                        if (var621 == 5011) {
                            var2--;
                            int var373 = field1082[var2];
                            String var374 = null;
                            if (var373 < 100) {
                                var374 = class293.field3857[var373];
                            }
                            if (var374 == null) {
                                var374 = "";
                            }
                            field1098[var3++] = var374;
                            continue;
                        }
                        if (var621 == 5012) {
                            var2--;
                            int var375 = field1082[var2];
                            int var376 = -1;
                            if (var375 < 100) {
                                var376 = class344.field4680[var375];
                            }
                            field1082[var2++] = var376;
                            continue;
                        }
                        if (var621 == 5015) {
                            String var377;
                            if (class143.field1684 == null || class143.field1684.field1481 == null) {
                                var377 = class252.field3305;
                            } else {
                                var377 = class143.field1684.method844(-11905, true);
                            }
                            field1098[var3++] = var377;
                            continue;
                        }
                        if (var621 == 5016) {
                            field1082[var2++] = class181.field2114;
                            continue;
                        }
                        if (var621 == 5017) {
                            field1082[var2++] = class33.field370;
                            continue;
                        }
                        if (var621 == 5018) {
                            var2--;
                            int var378 = field1082[var2];
                            int var379 = 0;
                            if (var378 < 100 && class28.field321[var378] != null) {
                                var379 = class202.field2378[var378];
                            }
                            field1082[var2++] = var379;
                            continue;
                        }
                        if (var621 == 5019) {
                            var2--;
                            int var380 = field1082[var2];
                            String var381 = null;
                            if (var380 < 100) {
                                var381 = class217.field2664[var380];
                            }
                            if (var381 == null) {
                                var381 = "";
                            }
                            field1098[var3++] = var381;
                            continue;
                        }
                        if (var621 == 5020) {
                            String var382;
                            if (class143.field1684 == null || class143.field1684.field1481 == null) {
                                var382 = class252.field3305;
                            } else {
                                var382 = class143.field1684.method846(false, 0);
                            }
                            field1098[var3++] = var382;
                            continue;
                        }
                        if (var621 == 5050) {
                            var2--;
                            int var383 = field1082[var2];
                            field1098[var3++] = class217.method1321(var383, (byte) -74).field1769;
                            continue;
                        }
                        if (var621 == 5051) {
                            var2--;
                            int var384 = field1082[var2];
                            class152 var385 = class217.method1321(var384, (byte) -26);
                            if (var385.field1765 == null) {
                                field1082[var2++] = 0;
                            } else {
                                field1082[var2++] = var385.field1765.length;
                            }
                            continue;
                        }
                        if (var621 == 5052) {
                            var2 -= 2;
                            int var386 = field1082[var2];
                            int var387 = field1082[var2 + 1];
                            class152 var388 = class217.method1321(var386, (byte) -111);
                            int var389 = var388.field1765[var387];
                            field1082[var2++] = var389;
                            continue;
                        }
                        if (var621 == 5053) {
                            var2--;
                            int var390 = field1082[var2];
                            class152 var391 = class217.method1321(var390, (byte) -53);
                            if (var391.field1772 == null) {
                                field1082[var2++] = 0;
                            } else {
                                field1082[var2++] = var391.field1772.length;
                            }
                            continue;
                        }
                        if (var621 == 5054) {
                            var2 -= 2;
                            int var392 = field1082[var2];
                            int var393 = field1082[var2 + 1];
                            field1082[var2++] = class217.method1321(var392, (byte) -52).field1772[var393];
                            continue;
                        }
                        if (var621 == 5055) {
                            var2--;
                            int var394 = field1082[var2];
                            field1098[var3++] = class31.method207(var394, 1).method562(false);
                            continue;
                        }
                        if (var621 == 5056) {
                            var2--;
                            int var395 = field1082[var2];
                            class90 var396 = class31.method207(var395, 1);
                            if (var396.field1060 == null) {
                                field1082[var2++] = 0;
                            } else {
                                field1082[var2++] = var396.field1060.length;
                            }
                            continue;
                        }
                        if (var621 == 5057) {
                            var2 -= 2;
                            int var397 = field1082[var2];
                            int var398 = field1082[var2 + 1];
                            field1082[var2++] = class31.method207(var397, 1).field1060[var398];
                            continue;
                        }
                        if (var621 == 5058) {
                            field1091 = new class246();
                            var2--;
                            field1091.field3255 = field1082[var2];
                            field1091.field3253 = class31.method207(field1091.field3255, 1);
                            field1091.field3258 = new int[field1091.field3253.method568(80)];
                            continue;
                        }
                        if (var621 == 5059) {
                            field1087++;
                            class427.field5837.method2162(false, 141);
                            class427.field5837.method1593(0, -96);
                            int var399 = class427.field5837.field3211;
                            class427.field5837.method1593(0, -93);
                            class427.field5837.method1573(-6266, field1091.field3255);
                            field1091.field3253.method563(class427.field5837, field1091.field3258, -1);
                            class427.field5837.method1597(class427.field5837.field3211 - var399, -99);
                            continue;
                        }
                        if (var621 == 5060) {
                            var3--;
                            String var400 = field1098[var3];
                            field1080++;
                            class427.field5837.method2162(false, 168);
                            class427.field5837.method1593(0, -98);
                            int var401 = class427.field5837.field3211;
                            class427.field5837.method1562(119, var400);
                            class427.field5837.method1573(-6266, field1091.field3255);
                            field1091.field3253.method563(class427.field5837, field1091.field3258, -1);
                            class427.field5837.method1597(class427.field5837.field3211 - var401, -116);
                            continue;
                        }
                        if (var621 == 5061) {
                            field1087++;
                            class427.field5837.method2162(false, 141);
                            class427.field5837.method1593(0, -104);
                            int var402 = class427.field5837.field3211;
                            class427.field5837.method1593(1, -112);
                            class427.field5837.method1573(-6266, field1091.field3255);
                            field1091.field3253.method563(class427.field5837, field1091.field3258, -1);
                            class427.field5837.method1597(class427.field5837.field3211 - var402, -89);
                            continue;
                        }
                        if (var621 == 5062) {
                            var2 -= 2;
                            int var403 = field1082[var2];
                            int var404 = field1082[var2 + 1];
                            field1082[var2++] = class217.method1321(var403, (byte) -94).field1770[var404];
                            continue;
                        }
                        if (var621 == 5063) {
                            var2 -= 2;
                            int var405 = field1082[var2];
                            int var406 = field1082[var2 + 1];
                            field1082[var2++] = class217.method1321(var405, (byte) -82).field1775[var406];
                            continue;
                        }
                        if (var621 == 5064) {
                            var2 -= 2;
                            int var407 = field1082[var2];
                            int var408 = field1082[var2 + 1];
                            if (var408 == -1) {
                                field1082[var2++] = -1;
                            } else {
                                field1082[var2++] = class217.method1321(var407, (byte) -52).method976((char) var408, 32768);
                            }
                            continue;
                        }
                        if (var621 == 5065) {
                            var2 -= 2;
                            int var409 = field1082[var2];
                            int var410 = field1082[var2 + 1];
                            if (var410 == -1) {
                                field1082[var2++] = -1;
                            } else {
                                field1082[var2++] = class217.method1321(var409, (byte) -120).method977((char) var410, 107);
                            }
                            continue;
                        }
                        if (var621 == 5066) {
                            var2--;
                            int var411 = field1082[var2];
                            field1082[var2++] = class31.method207(var411, 1).method568(80);
                            continue;
                        }
                        if (var621 == 5067) {
                            var2 -= 2;
                            int var412 = field1082[var2];
                            int var413 = field1082[var2 + 1];
                            int var414 = class31.method207(var412, 1).method560(var413, 0);
                            field1082[var2++] = var414;
                            continue;
                        }
                        if (var621 == 5068) {
                            var2 -= 2;
                            int var415 = field1082[var2];
                            int var416 = field1082[var2 + 1];
                            field1091.field3258[var415] = var416;
                            continue;
                        }
                        if (var621 == 5069) {
                            var2 -= 2;
                            int var417 = field1082[var2];
                            int var418 = field1082[var2 + 1];
                            field1091.field3258[var417] = var418;
                            continue;
                        }
                        if (var621 == 5070) {
                            var2 -= 3;
                            int var419 = field1082[var2];
                            int var420 = field1082[var2 + 1];
                            int var421 = field1082[var2 + 2];
                            class90 var422 = class31.method207(var419, 1);
                            if (var422.method560(var420, 0) != 0) {
                                throw new RuntimeException("bad command");
                            }
                            field1082[var2++] = var422.method561(var420, (byte) -123, var421);
                            continue;
                        }
                        if (var621 == 5071) {
                            var3--;
                            String var423 = field1098[var3];
                            var2--;
                            boolean var424 = field1082[var2] == 1;
                            class201.method1236(var423, var424, -111);
                            field1082[var2++] = class401.field5534;
                            continue;
                        }
                        if (var621 == 5072) {
                            if (class118.field1355 != null && class396.field5385 < class401.field5534) {
                                field1082[var2++] = class118.field1355[class396.field5385++] & 0xFFFF;
                                continue;
                            }
                            field1082[var2++] = -1;
                            continue;
                        }
                        if (var621 == 5073) {
                            class396.field5385 = 0;
                            continue;
                        }
                    } else if (var621 < 5200) {
                        if (var621 == 5100) {
                            if (class261.field3359.method623(9, 86)) {
                                field1082[var2++] = 1;
                            } else {
                                field1082[var2++] = 0;
                            }
                            continue;
                        }
                        if (var621 == 5101) {
                            if (class261.field3359.method623(9, 82)) {
                                field1082[var2++] = 1;
                            } else {
                                field1082[var2++] = 0;
                            }
                            continue;
                        }
                        if (var621 == 5102) {
                            if (class261.field3359.method623(9, 81)) {
                                field1082[var2++] = 1;
                            } else {
                                field1082[var2++] = 0;
                            }
                            continue;
                        }
                    } else if (var621 < 5300) {
                        if (var621 == 5200) {
                            var2--;
                            class146.method950(field1082[var2], -201);
                            continue;
                        }
                        if (var621 == 5201) {
                            field1082[var2++] = class428.method2616((byte) 22);
                            continue;
                        }
                        if (var621 == 5205) {
                            var2--;
                            class39.method250(field1082[var2], -1, -1, false, true);
                            continue;
                        }
                        if (var621 == 5206) {
                            var2--;
                            int var425 = field1082[var2];
                            class195 var426 = class224.method1373(var425 >> 14 & 0x3FFF, var425 & 0x3FFF);
                            if (var426 == null) {
                                field1082[var2++] = -1;
                            } else {
                                field1082[var2++] = var426.field2313;
                            }
                            continue;
                        }
                        if (var621 == 5207) {
                            var2--;
                            class195 var427 = class224.method1384(field1082[var2]);
                            if (var427 != null && var427.field2306 != null) {
                                field1098[var3++] = var427.field2306;
                                continue;
                            }
                            field1098[var3++] = "";
                            continue;
                        }
                        if (var621 == 5208) {
                            field1082[var2++] = class296.field3948;
                            field1082[var2++] = class57.field658;
                            continue;
                        }
                        if (var621 == 5209) {
                            field1082[var2++] = class54.field633 + class224.field2825;
                            field1082[var2++] = class394.field5366 + class224.field2815;
                            continue;
                        }
                        if (var621 == 5210) {
                            var2--;
                            int var428 = field1082[var2];
                            class195 var429 = class224.method1384(var428);
                            if (var429 == null) {
                                field1082[var2++] = 0;
                                field1082[var2++] = 0;
                            } else {
                                field1082[var2++] = var429.field2310 >> 14 & 0x3FFF;
                                field1082[var2++] = var429.field2310 & 0x3FFF;
                            }
                            continue;
                        }
                        if (var621 == 5211) {
                            var2--;
                            int var430 = field1082[var2];
                            class195 var431 = class224.method1384(var430);
                            if (var431 == null) {
                                field1082[var2++] = 0;
                                field1082[var2++] = 0;
                            } else {
                                field1082[var2++] = var431.field2305 - var431.field2309;
                                field1082[var2++] = var431.field2307 - var431.field2311;
                            }
                            continue;
                        }
                        if (var621 == 5212) {
                            class278 var432 = class398.method2456(true);
                            if (var432 == null) {
                                field1082[var2++] = -1;
                                field1082[var2++] = -1;
                            } else {
                                field1082[var2++] = var432.field3596;
                                int var433 = var432.field3595 << 28 | class224.field2825 + var432.field3601 << 14 | class224.field2815 + var432.field3593;
                                field1082[var2++] = var433;
                            }
                            continue;
                        }
                        if (var621 == 5213) {
                            class278 var434 = class394.method2441(52);
                            if (var434 == null) {
                                field1082[var2++] = -1;
                                field1082[var2++] = -1;
                            } else {
                                field1082[var2++] = var434.field3596;
                                int var435 = var434.field3595 << 28 | class224.field2825 + var434.field3601 << 14 | class224.field2815 + var434.field3593;
                                field1082[var2++] = var435;
                            }
                            continue;
                        }
                        if (var621 == 5214) {
                            var2--;
                            int var436 = field1082[var2];
                            class195 var437 = class150.method957(-15039);
                            if (var437 != null) {
                                boolean var438 = var437.method1211(var436 >> 14 & 0x3FFF, var436 & 0x3FFF, true, field1103, var436 >> 28 & 0x3);
                                if (var438) {
                                    class378.method2348(field1103[2], field1103[1], (byte) 121);
                                }
                            }
                            continue;
                        }
                        if (var621 == 5215) {
                            var2 -= 2;
                            int var439 = field1082[var2];
                            int var440 = field1082[var2 + 1];
                            class161 var441 = class224.method1369(var439 >> 14 & 0x3FFF, var439 & 0x3FFF);
                            boolean var442 = false;
                            for (class195 var443 = (class195) var441.method1027(-20578); var443 != null; var443 = (class195) var441.method1023(-92)) {
                                if (var443.field2313 == var440) {
                                    var442 = true;
                                    break;
                                }
                            }
                            if (var442) {
                                field1082[var2++] = 1;
                            } else {
                                field1082[var2++] = 0;
                            }
                            continue;
                        }
                        if (var621 == 5218) {
                            var2--;
                            int var444 = field1082[var2];
                            class195 var445 = class224.method1384(var444);
                            if (var445 == null) {
                                field1082[var2++] = -1;
                            } else {
                                field1082[var2++] = var445.field2320;
                            }
                            continue;
                        }
                        if (var621 == 5220) {
                            field1082[var2++] = class342.field4655 == 100 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 5221) {
                            var2--;
                            int var446 = field1082[var2];
                            class378.method2348(var446 & 0x3FFF, var446 >> 14 & 0x3FFF, (byte) 68);
                            continue;
                        }
                        if (var621 == 5222) {
                            class195 var447 = class150.method957(-15039);
                            if (var447 == null) {
                                field1082[var2++] = -1;
                                field1082[var2++] = -1;
                            } else {
                                boolean var448 = var447.method1210(field1103, class394.field5366 + class224.field2815, 21436, class54.field633 + class224.field2825);
                                if (var448) {
                                    field1082[var2++] = field1103[1];
                                    field1082[var2++] = field1103[2];
                                } else {
                                    field1082[var2++] = -1;
                                    field1082[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var621 == 5223) {
                            var2 -= 2;
                            int var449 = field1082[var2];
                            int var450 = field1082[var2 + 1];
                            class39.method250(var449, var450 >> 14 & 0x3FFF, var450 & 0x3FFF, false, true);
                            continue;
                        }
                        if (var621 == 5224) {
                            var2--;
                            int var451 = field1082[var2];
                            class195 var452 = class150.method957(-15039);
                            if (var452 == null) {
                                field1082[var2++] = -1;
                                field1082[var2++] = -1;
                            } else {
                                boolean var453 = var452.method1211(var451 >> 14 & 0x3FFF, var451 & 0x3FFF, true, field1103, var451 >> 28 & 0x3);
                                if (var453) {
                                    field1082[var2++] = field1103[1];
                                    field1082[var2++] = field1103[2];
                                } else {
                                    field1082[var2++] = -1;
                                    field1082[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var621 == 5225) {
                            var2--;
                            int var454 = field1082[var2];
                            class195 var455 = class150.method957(-15039);
                            if (var455 == null) {
                                field1082[var2++] = -1;
                                field1082[var2++] = -1;
                            } else {
                                boolean var456 = var455.method1210(field1103, var454 & 0x3FFF, 21436, var454 >> 14 & 0x3FFF);
                                if (var456) {
                                    field1082[var2++] = field1103[1];
                                    field1082[var2++] = field1103[2];
                                } else {
                                    field1082[var2++] = -1;
                                    field1082[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var621 == 5226) {
                            var2--;
                            class304.method1930(field1082[var2], (byte) -56);
                            continue;
                        }
                        if (var621 == 5227) {
                            var2 -= 2;
                            int var457 = field1082[var2];
                            int var458 = field1082[var2 + 1];
                            class39.method250(var457, var458 >> 14 & 0x3FFF, var458 & 0x3FFF, true, true);
                            continue;
                        }
                        if (var621 == 5228) {
                            var2--;
                            class39.field466 = field1082[var2] == 1;
                            continue;
                        }
                        if (var621 == 5229) {
                            field1082[var2++] = class39.field466 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 5230) {
                            var2--;
                            int var459 = field1082[var2];
                            class381.method2366(100, var459);
                            continue;
                        }
                        if (var621 == 5231) {
                            var2 -= 2;
                            int var460 = field1082[var2];
                            boolean var461 = field1082[var2 + 1] == 1;
                            if (class355.field4822 == null) {
                                continue;
                            }
                            class43 var462 = class355.field4822.method2218(1, (long) var460);
                            if (var462 != null && !var461) {
                                var462.method263(false);
                                continue;
                            }
                            if (var462 == null && var461) {
                                class43 var463 = new class43();
                                class355.field4822.method2227(var463, -8218, (long) var460);
                            }
                            continue;
                        }
                        if (var621 == 5232) {
                            var2--;
                            int var464 = field1082[var2];
                            if (class355.field4822 == null) {
                                field1082[var2++] = 0;
                            } else {
                                class43 var465 = class355.field4822.method2218(1, (long) var464);
                                field1082[var2++] = var465 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var621 == 5233) {
                            var2 -= 2;
                            int var466 = field1082[var2];
                            boolean var467 = field1082[var2 + 1] == 1;
                            if (class153.field1780 == null) {
                                continue;
                            }
                            class43 var468 = class153.field1780.method2218(1, (long) var466);
                            if (var468 != null && !var467) {
                                var468.method263(false);
                                continue;
                            }
                            if (var468 == null && var467) {
                                class43 var469 = new class43();
                                class153.field1780.method2227(var469, -8218, (long) var466);
                            }
                            continue;
                        }
                        if (var621 == 5234) {
                            var2--;
                            int var470 = field1082[var2];
                            if (class153.field1780 == null) {
                                field1082[var2++] = 0;
                            } else {
                                class43 var471 = class153.field1780.method2218(1, (long) var470);
                                field1082[var2++] = var471 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var621 == 5235) {
                            field1082[var2++] = class224.field2802 == null ? -1 : class224.field2802.field2313;
                            continue;
                        }
                    } else if (var621 < 5400) {
                        if (var621 == 5300) {
                            var2 -= 2;
                            int var472 = field1082[var2];
                            int var473 = field1082[var2 + 1];
                            class56.method312(var473, true, var472, 3, false);
                            field1082[var2++] = class53.field620 == null ? 0 : 1;
                            continue;
                        }
                        if (var621 == 5301) {
                            if (class53.field620 != null) {
                                class56.method312(-1, true, -1, class444.field6135, false);
                            }
                            continue;
                        }
                        if (var621 == 5302) {
                            class215[] var474 = class41.method255(0);
                            field1082[var2++] = var474.length;
                            continue;
                        }
                        if (var621 == 5303) {
                            var2--;
                            int var475 = field1082[var2];
                            class215[] var476 = class41.method255(0);
                            field1082[var2++] = var476[var475].field2656;
                            field1082[var2++] = var476[var475].field2657;
                            continue;
                        }
                        if (var621 == 5305) {
                            int var477 = class428.field5851;
                            int var478 = class244.field3249;
                            int var479 = -1;
                            class215[] var480 = class41.method255(0);
                            for (int var481 = 0; var481 < var480.length; var481++) {
                                class215 var482 = var480[var481];
                                if (var482.field2656 == var477 && var482.field2657 == var478) {
                                    var479 = var481;
                                    break;
                                }
                            }
                            field1082[var2++] = var479;
                            continue;
                        }
                        if (var621 == 5306) {
                            field1082[var2++] = client.method2697(-121);
                            continue;
                        }
                        if (var621 == 5307) {
                            var2--;
                            int var483 = field1082[var2];
                            if (var483 >= 1 && var483 <= 2) {
                                class56.method312(-1, true, -1, var483, false);
                            }
                            continue;
                        }
                        if (var621 == 5308) {
                            field1082[var2++] = class444.field6135;
                            continue;
                        }
                        if (var621 == 5309) {
                            var2--;
                            int var484 = field1082[var2];
                            if (var484 >= 1 && var484 <= 2) {
                                class444.field6135 = var484;
                                class362.method2273(class401.field5525, (byte) 107);
                            }
                            continue;
                        }
                    } else if (var621 < 5500) {
                        if (var621 == 5400) {
                            var3 -= 2;
                            String var485 = field1098[var3];
                            String var486 = field1098[var3 + 1];
                            var2--;
                            int var487 = field1082[var2];
                            field1102++;
                            class427.field5837.method2162(false, 199);
                            class427.field5837.method1593(class350.method2229(2, var485) + class350.method2229(2, var486) + 1, -110);
                            class427.field5837.method1562(99, var485);
                            class427.field5837.method1562(110, var486);
                            class427.field5837.method1593(var487, -110);
                            continue;
                        }
                        if (var621 == 5401) {
                            var2 -= 2;
                            class382.field5235[field1082[var2]] = (short) class168.method1070(field1082[var2 + 1], true);
                            class170.method1084(false);
                            class339.method2175(true);
                            class94.method588(-124);
                            class67.method388(-118);
                            class11.method53(16026);
                            continue;
                        }
                        if (var621 == 5405) {
                            var2 -= 2;
                            int var488 = field1082[var2];
                            int var489 = field1082[var2 + 1];
                            if (var488 >= 0 && var488 < 2) {
                                class332.field4527[var488] = new int[var489 << 1][4];
                            }
                            continue;
                        }
                        if (var621 == 5406) {
                            var2 -= 7;
                            int var490 = field1082[var2];
                            int var491 = field1082[var2 + 1] << 1;
                            int var492 = field1082[var2 + 2];
                            int var493 = field1082[var2 + 3];
                            int var494 = field1082[var2 + 4];
                            int var495 = field1082[var2 + 5];
                            int var496 = field1082[var2 + 6];
                            if (var490 >= 0 && var490 < 2 && class332.field4527[var490] != null && var491 >= 0 && var491 < class332.field4527[var490].length) {
                                class332.field4527[var490][var491] = new int[] { (var492 >> 14 & 0x3FFF) * 128, var493, (var492 & 0x3FFF) * 128, var496 };
                                class332.field4527[var490][var491 + 1] = new int[] { (var494 >> 14 & 0x3FFF) * 128, var495, (var494 & 0x3FFF) * 128 };
                            }
                            continue;
                        }
                        if (var621 == 5407) {
                            var2--;
                            int var497 = class332.field4527[field1082[var2]].length >> 1;
                            field1082[var2++] = var497;
                            continue;
                        }
                        if (var621 == 5411) {
                            if (class53.field620 != null) {
                                class56.method312(-1, true, -1, class444.field6135, false);
                            }
                            if (class167.field1942 == null) {
                                String var498 = class220.field2727 == null ? class220.method1336((byte) -84) : class220.field2727;
                                class208.method1281(var498, class20.field220 == 1, class401.field5525, 9, false);
                            } else {
                                class380.method2363(940);
                                System.exit(0);
                            }
                            continue;
                        }
                        if (var621 == 5419) {
                            String var499 = "";
                            if (class35.field387 != null) {
                                if (class35.field387.field4243 == null) {
                                    var499 = class22.method135(true, class35.field387.field4242);
                                } else {
                                    var499 = (String) class35.field387.field4243;
                                }
                            }
                            field1098[var3++] = var499;
                            continue;
                        }
                        if (var621 == 5420) {
                            field1082[var2++] = class441.field6075 == 3 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 5421) {
                            if (class53.field620 != null) {
                                class56.method312(-1, true, -1, class444.field6135, false);
                            }
                            var3--;
                            String var500 = field1098[var3];
                            var2--;
                            boolean var501 = field1082[var2] == 1;
                            String var502 = class220.method1336((byte) -118) + var500;
                            class208.method1281(var502, class20.field220 == 1, class401.field5525, 9, var501);
                            continue;
                        }
                        if (var621 == 5422) {
                            var3 -= 2;
                            String var503 = field1098[var3];
                            String var504 = field1098[var3 + 1];
                            var2--;
                            int var505 = field1082[var2];
                            if (var503.length() > 0) {
                                if (class89.field1042 == null) {
                                    class89.field1042 = new String[class72.field888[class31.field356]];
                                }
                                class89.field1042[var505] = var503;
                            }
                            if (var504.length() > 0) {
                                if (class4.field30 == null) {
                                    class4.field30 = new String[class72.field888[class31.field356]];
                                }
                                class4.field30[var505] = var504;
                            }
                            continue;
                        }
                        if (var621 == 5423) {
                            var3--;
                            System.out.println(field1098[var3]);
                            continue;
                        }
                        if (var621 == 5424) {
                            var2 -= 11;
                            class68.field817 = field1082[var2];
                            class365.field4958 = field1082[var2 + 1];
                            class104.field1229 = field1082[var2 + 2];
                            class431.field5876 = field1082[var2 + 3];
                            class137.field1548 = field1082[var2 + 4];
                            class68.field813 = field1082[var2 + 5];
                            class80.field980 = field1082[var2 + 6];
                            class275.field3550 = field1082[var2 + 7];
                            class270.field3501 = field1082[var2 + 8];
                            class414.field5687 = field1082[var2 + 9];
                            class249.field3282 = field1082[var2 + 10];
                            class15.field177.method1797(0, class137.field1548);
                            class15.field177.method1797(0, class68.field813);
                            class15.field177.method1797(0, class80.field980);
                            class15.field177.method1797(0, class275.field3550);
                            class15.field177.method1797(0, class270.field3501);
                            class97.field1141 = null;
                            class137.field1567 = null;
                            class446.field6232 = null;
                            class234.field3080 = null;
                            class35.field386 = null;
                            class411.field5666 = null;
                            class433.field5910 = null;
                            class276.field3574 = null;
                            class231.field3044 = true;
                            continue;
                        }
                        if (var621 == 5425) {
                            class126.method814((byte) 0);
                            class231.field3044 = false;
                            continue;
                        }
                        if (var621 == 5426) {
                            var2 -= 2;
                            class72.field891 = field1082[var2];
                            class339.field4625 = field1082[var2 + 1];
                            continue;
                        }
                        if (var621 == 5427) {
                            var2 -= 2;
                            class282.field3687 = field1082[var2 + 1];
                            continue;
                        }
                        if (var621 == 5428) {
                            var2 -= 2;
                            int var506 = field1082[var2];
                            int var507 = field1082[var2 + 1];
                            field1082[var2++] = class105.method628(var507, false, var506) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 5429) {
                            var3--;
                            class210.method1289(false, 10, field1098[var3]);
                            continue;
                        }
                    } else if (var621 < 5600) {
                        if (var621 == 5500) {
                            var2 -= 4;
                            int var508 = field1082[var2];
                            int var509 = field1082[var2 + 1];
                            int var510 = field1082[var2 + 2];
                            int var511 = field1082[var2 + 3];
                            class423.method2595(var511, var510, (var508 >> 14 & 0x3FFF) - class278.field3608, (var508 & 0x3FFF) - class129.field1432, var509, 2, false);
                            continue;
                        }
                        if (var621 == 5501) {
                            var2 -= 4;
                            int var512 = field1082[var2];
                            int var513 = field1082[var2 + 1];
                            int var514 = field1082[var2 + 2];
                            int var515 = field1082[var2 + 3];
                            class424.method2600((var512 & 0x3FFF) - class129.field1432, -1025, var514, (var512 >> 14 & 0x3FFF) - class278.field3608, var513, var515);
                            continue;
                        }
                        if (var621 == 5502) {
                            var2 -= 6;
                            int var516 = field1082[var2];
                            if (var516 >= 2) {
                                throw new RuntimeException();
                            }
                            class234.field3086 = var516;
                            int var517 = field1082[var2 + 1];
                            if (var517 + 1 >= class332.field4527[class234.field3086].length >> 1) {
                                throw new RuntimeException();
                            }
                            class113.field1325 = var517;
                            class51.field593 = 0;
                            class178.field2082 = field1082[var2 + 2];
                            class220.field2725 = field1082[var2 + 3];
                            int var518 = field1082[var2 + 4];
                            if (var518 >= 2) {
                                throw new RuntimeException();
                            }
                            class258.field3339 = var518;
                            int var519 = field1082[var2 + 5];
                            if (var519 + 1 >= class332.field4527[class258.field3339].length >> 1) {
                                throw new RuntimeException();
                            }
                            class365.field4971 = var519;
                            class320.field4294 = 3;
                            continue;
                        }
                        if (var621 == 5503) {
                            class250.method1625(22);
                            continue;
                        }
                        if (var621 == 5504) {
                            var2 -= 2;
                            class301.method1913(0, field1082[var2 + 1], field1082[var2], -91);
                            continue;
                        }
                        if (var621 == 5505) {
                            field1082[var2++] = (int) class301.field4020 >> 3;
                            continue;
                        }
                        if (var621 == 5506) {
                            field1082[var2++] = (int) class434.field5929 >> 3;
                            continue;
                        }
                        if (var621 == 5507) {
                            class290.method1849(47);
                            continue;
                        }
                        if (var621 == 5508) {
                            class212.method1299(-110);
                            continue;
                        }
                        if (var621 == 5509) {
                            class298.method1892(8);
                            continue;
                        }
                        if (var621 == 5510) {
                            class318.method1989((byte) -106);
                            continue;
                        }
                        if (var621 == 5511) {
                            var2--;
                            int var520 = field1082[var2];
                            int var521 = var520 >> 14 & 0x3FFF;
                            int var522 = var520 & 0x3FFF;
                            int var523 = var521 - class278.field3608;
                            if (var523 < 0) {
                                var523 = 0;
                            } else if (var523 >= class22.field232) {
                                var523 = class22.field232;
                            }
                            int var524 = var522 - class129.field1432;
                            if (var524 < 0) {
                                var524 = 0;
                            } else if (var524 >= class196.field2329) {
                                var524 = class196.field2329;
                            }
                            class225.field2856 = var523 * 128 + 64;
                            class347.field4725 = var524 * 128 + 64;
                            class320.field4294 = 4;
                            continue;
                        }
                        if (var621 == 5512) {
                            class355.method2249(-95);
                            continue;
                        }
                    } else if (var621 < 5700) {
                        if (var621 == 5600) {
                            var3 -= 2;
                            String var525 = field1098[var3];
                            String var526 = field1098[var3 + 1];
                            var2--;
                            int var527 = field1082[var2];
                            if (class174.field2017 == 10 && class190.field2233 == 0 && class80.field970 == 0 && class102.field1189 == 0 && class72.field893 == 0) {
                                class361.method2270(var525, -3, var527, var526);
                            }
                            continue;
                        }
                        if (var621 == 5601) {
                            class337.method2159(-113);
                            continue;
                        }
                        if (var621 == 5602) {
                            if (class80.field970 == 0) {
                                class406.field5620 = -2;
                            }
                            continue;
                        }
                        if (var621 == 5603) {
                            var2 -= 4;
                            if (class174.field2017 == 10 && class190.field2233 == 0 && class80.field970 == 0 && class102.field1189 == 0 && class72.field893 == 0) {
                                class218.method1322(field1082[var2], field1082[var2 + 2], 98, field1082[var2 + 1], field1082[var2 + 3]);
                            }
                            continue;
                        }
                        if (var621 == 5604) {
                            var3--;
                            if (class174.field2017 == 10 && class190.field2233 == 0 && class80.field970 == 0 && class102.field1189 == 0 && class72.field893 == 0) {
                                class59.method332(0, class412.method2551(field1098[var3], (byte) -105));
                            }
                            continue;
                        }
                        if (var621 == 5605) {
                            var3 -= 3;
                            var2 -= 7;
                            if (class174.field2017 == 10 && class190.field2233 == 0 && class80.field970 == 0 && class102.field1189 == 0 && class72.field893 == 0) {
                                class390.method2426(field1082[var2 + 3], field1098[var3 + 2], field1082[var2 + 1], (byte) 125, field1082[var2 + 2], field1098[var3 + 1], field1082[var2 + 5] == 1, field1082[var2 + 6] == 1, class412.method2551(field1098[var3], (byte) -108), field1082[var2], field1082[var2 + 4] == 1);
                            }
                            continue;
                        }
                        if (var621 == 5606) {
                            if (class102.field1189 == 0) {
                                class388.field5299 = -2;
                            }
                            continue;
                        }
                        if (var621 == 5607) {
                            field1082[var2++] = class406.field5620;
                            continue;
                        }
                        if (var621 == 5608) {
                            field1082[var2++] = class332.field4539;
                            continue;
                        }
                        if (var621 == 5609) {
                            field1082[var2++] = class388.field5299;
                            continue;
                        }
                        if (var621 == 5610) {
                            for (int var528 = 0; var528 < 5; var528++) {
                                field1098[var3++] = class279.field3617.length > var528 ? class207.method1264(class279.field3617[var528], 7507) : "";
                            }
                            class279.field3617 = null;
                            continue;
                        }
                        if (var621 == 5611) {
                            field1082[var2++] = class252.field3306;
                            continue;
                        }
                    } else if (var621 < 6100) {
                        if (var621 == 6001) {
                            var2--;
                            int var529 = field1082[var2];
                            if (var529 < 1) {
                                var529 = 1;
                            }
                            if (var529 > 4) {
                                var529 = 4;
                            }
                            class2.field18 = var529;
                            class361.method2267((byte) 104);
                            class362.method2273(class401.field5525, (byte) 95);
                            class75.field905 = false;
                            continue;
                        }
                        if (var621 == 6002) {
                            var2--;
                            class181.method1134(field1082[var2] == 1, (byte) 125);
                            class428.method2611((byte) -113);
                            class361.method2267((byte) 55);
                            class296.method1880(true);
                            class362.method2273(class401.field5525, (byte) 124);
                            class75.field905 = false;
                            continue;
                        }
                        if (var621 == 6003) {
                            var2--;
                            class147.field1727 = field1082[var2] == 1;
                            class296.method1880(true);
                            class362.method2273(class401.field5525, (byte) 98);
                            class75.field905 = false;
                            continue;
                        }
                        if (var621 == 6005) {
                            var2--;
                            class167.field1948 = field1082[var2] == 1;
                            class361.method2267((byte) 81);
                            class362.method2273(class401.field5525, (byte) 95);
                            class75.field905 = false;
                            continue;
                        }
                        if (var621 == 6006) {
                            var2--;
                            class341.field4646 = field1082[var2] == 1;
                            class267.field3454.method787(!class341.field4646);
                            class362.method2273(class401.field5525, (byte) 97);
                            class75.field905 = false;
                            continue;
                        }
                        if (var621 == 6007) {
                            var2--;
                            class403.field5601 = field1082[var2];
                            class362.method2273(class401.field5525, (byte) 112);
                            class75.field905 = false;
                            continue;
                        }
                        if (var621 == 6008) {
                            var2--;
                            class40.field482 = field1082[var2] == 1;
                            class362.method2273(class401.field5525, (byte) 109);
                            class75.field905 = false;
                            continue;
                        }
                        if (var621 == 6009) {
                            var2--;
                            class275.field3557 = field1082[var2] == 1;
                            class361.method2267((byte) 58);
                            class362.method2273(class401.field5525, (byte) 119);
                            class75.field905 = false;
                            continue;
                        }
                        if (var621 == 6010) {
                            var2--;
                            class194.field2296 = field1082[var2] == 1;
                            class362.method2273(class401.field5525, (byte) 109);
                            class75.field905 = false;
                            continue;
                        }
                        if (var621 == 6011) {
                            var2--;
                            int var530 = field1082[var2];
                            if (var530 < 0 || var530 > 2) {
                                var530 = 0;
                            }
                            class333.field4548 = var530;
                            class361.method2267((byte) 98);
                            class362.method2273(class401.field5525, (byte) 112);
                            class75.field905 = false;
                            continue;
                        }
                        if (var621 == 6012) {
                            var2--;
                            class252.field3298 = field1082[var2] == 1;
                            class49.method274(39);
                            class362.method2273(class401.field5525, (byte) 113);
                            class75.field905 = false;
                            continue;
                        }
                        if (var621 == 6014) {
                            var2--;
                            class183.field2125 = field1082[var2] == 1;
                            class361.method2267((byte) 66);
                            class362.method2273(class401.field5525, (byte) 126);
                            class75.field905 = false;
                            continue;
                        }
                        if (var621 == 6015) {
                            var2--;
                            class20.field211 = field1082[var2] == 1;
                            class361.method2267((byte) 103);
                            class362.method2273(class401.field5525, (byte) 103);
                            class75.field905 = false;
                            continue;
                        }
                        if (var621 == 6016) {
                            var2--;
                            int var531 = field1082[var2];
                            if (var531 < 0 || var531 > 2) {
                                var531 = 0;
                            }
                            class414.field5684 = var531;
                            class6.method23((byte) -58);
                            class362.method2273(class401.field5525, (byte) 103);
                            continue;
                        }
                        if (var621 == 6017) {
                            var2--;
                            class373.field5049 = field1082[var2] == 1;
                            class419.method2572(false);
                            class362.method2273(class401.field5525, (byte) 105);
                            class75.field905 = false;
                            continue;
                        }
                        if (var621 == 6018) {
                            var2--;
                            int var532 = field1082[var2];
                            if (var532 < 0) {
                                var532 = 0;
                            }
                            if (var532 > 127) {
                                var532 = 127;
                            }
                            class96.field1136 = var532;
                            class362.method2273(class401.field5525, (byte) 110);
                            class75.field905 = false;
                            continue;
                        }
                        if (var621 == 6019) {
                            var2--;
                            int var533 = field1082[var2];
                            if (var533 < 0) {
                                var533 = 0;
                            }
                            if (var533 > 255) {
                                var533 = 255;
                            }
                            if (class162.field1895 != var533) {
                                if (class162.field1895 == 0 && class346.field4702 != -1) {
                                    class150.method967(false, -3063, 0, class346.field4702, class150.field1738, var533);
                                    class344.field4679 = false;
                                } else if (var533 == 0) {
                                    class228.method1396(1);
                                    class344.field4679 = false;
                                } else {
                                    class267.method1673(var533, false);
                                }
                                class162.field1895 = var533;
                            }
                            class362.method2273(class401.field5525, (byte) 107);
                            class75.field905 = false;
                            continue;
                        }
                        if (var621 == 6020) {
                            var2--;
                            int var534 = field1082[var2];
                            if (var534 < 0) {
                                var534 = 0;
                            }
                            if (var534 > 127) {
                                var534 = 127;
                            }
                            class330.field4500 = var534;
                            class362.method2273(class401.field5525, (byte) 116);
                            class75.field905 = false;
                            continue;
                        }
                        if (var621 == 6021) {
                            var2--;
                            class229.field2937 = field1082[var2] == 1;
                            class296.method1880(true);
                            continue;
                        }
                        if (var621 == 6023) {
                            var2--;
                            int var535 = field1082[var2];
                            boolean var536 = false;
                            if (var535 < 0) {
                                var535 = 0;
                            }
                            if (var535 > 2) {
                                var535 = 2;
                            }
                            if (class105.field1254 < 96) {
                                var535 = 0;
                                var536 = true;
                            }
                            class198.method1224((byte) -122, var535);
                            class362.method2273(class401.field5525, (byte) 120);
                            class75.field905 = false;
                            field1082[var2++] = var536 ? 0 : 1;
                            continue;
                        }
                        if (var621 == 6024) {
                            var2--;
                            int var537 = field1082[var2];
                            if (var537 < 0 || var537 > 2) {
                                var537 = 0;
                            }
                            class192.field2254 = var537;
                            class362.method2273(class401.field5525, (byte) 113);
                            continue;
                        }
                        if (var621 == 6025) {
                            var2--;
                            int var538 = field1082[var2];
                            if (var538 < 0 || var538 > class150.method969(class105.field1254, 110)) {
                                var538 = 0;
                            }
                            class276.field3580 = var538;
                            class362.method2273(class401.field5525, (byte) 109);
                            class75.field905 = false;
                            continue;
                        }
                        if (var621 == 6027) {
                            var2--;
                            int var539 = field1082[var2];
                            if (var539 < 0 || var539 > 1) {
                                var539 = 0;
                            }
                            class338.method2165(-1, var539 == 1);
                            continue;
                        }
                        if (var621 == 6028) {
                            var2--;
                            class168.field1968 = field1082[var2] != 0;
                            class362.method2273(class401.field5525, (byte) 112);
                            continue;
                        }
                        if (var621 == 6029) {
                            var2--;
                            class403.field5601 = field1082[var2];
                            class362.method2273(class401.field5525, (byte) 99);
                            continue;
                        }
                        if (var621 == 6030) {
                            var2--;
                            class362.field4906 = field1082[var2] != 0;
                            class362.method2273(class401.field5525, (byte) 104);
                            class361.method2267((byte) 42);
                            continue;
                        }
                        if (var621 == 6031) {
                            var2--;
                            int var540 = field1082[var2];
                            if (var540 < 0 || var540 > 3) {
                                var540 = 2;
                            }
                            class373.method2338(-105, var540);
                            continue;
                        }
                        if (var621 == 6032) {
                            var2--;
                            int var541 = field1082[var2];
                            if (var541 < 0 || var541 > 3) {
                                var541 = 2;
                            }
                            class121.field1382 = var541;
                            class362.method2273(class401.field5525, (byte) 112);
                            class75.field905 = false;
                            continue;
                        }
                        if (var621 == 6033) {
                            var2--;
                            int var542 = field1082[var2];
                            if (var542 < 0 || var542 > 4) {
                                var542 = 2;
                            }
                            class355.field4825 = var542;
                            class362.method2273(class401.field5525, (byte) 124);
                            continue;
                        }
                    } else if (var621 < 6200) {
                        if (var621 == 6101) {
                            field1082[var2++] = class2.field18;
                            continue;
                        }
                        if (var621 == 6102) {
                            field1082[var2++] = class98.method602(65280) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6103) {
                            field1082[var2++] = class147.field1727 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6105) {
                            field1082[var2++] = class167.field1948 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6106) {
                            field1082[var2++] = class341.field4646 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6107) {
                            field1082[var2++] = class403.field5601;
                            continue;
                        }
                        if (var621 == 6108) {
                            field1082[var2++] = class40.field482 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6109) {
                            field1082[var2++] = class275.field3557 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6110) {
                            field1082[var2++] = class194.field2296 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6111) {
                            field1082[var2++] = class333.field4548;
                            continue;
                        }
                        if (var621 == 6112) {
                            field1082[var2++] = class252.field3298 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6114) {
                            field1082[var2++] = class183.field2125 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6115) {
                            field1082[var2++] = class20.field211 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6116) {
                            field1082[var2++] = class414.field5684;
                            continue;
                        }
                        if (var621 == 6117) {
                            field1082[var2++] = class373.field5049 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6118) {
                            field1082[var2++] = class96.field1136;
                            continue;
                        }
                        if (var621 == 6119) {
                            field1082[var2++] = class162.field1895;
                            continue;
                        }
                        if (var621 == 6120) {
                            field1082[var2++] = class330.field4500;
                            continue;
                        }
                        if (var621 == 6121) {
                            field1082[var2++] = class267.field3454.method781() ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6123) {
                            field1082[var2++] = class184.method1148((byte) 105);
                            continue;
                        }
                        if (var621 == 6124) {
                            field1082[var2++] = class192.field2254;
                            continue;
                        }
                        if (var621 == 6125) {
                            field1082[var2++] = class276.field3580;
                            continue;
                        }
                        if (var621 == 6126) {
                            field1082[var2++] = class267.field3454.method785() ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6127) {
                            field1082[var2++] = class265.field3408 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6128) {
                            field1082[var2++] = class168.field1968 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6129) {
                            field1082[var2++] = class403.field5601;
                            continue;
                        }
                        if (var621 == 6130) {
                            field1082[var2++] = class362.field4906 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6131) {
                            field1082[var2++] = class20.field220;
                            continue;
                        }
                        if (var621 == 6132) {
                            field1082[var2++] = class121.field1382;
                            continue;
                        }
                        if (var621 == 6133) {
                            field1082[var2++] = class441.field6075 == 1 || class441.field6075 == 4 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6134) {
                            field1082[var2++] = class150.method969(class105.field1254, 96);
                            continue;
                        }
                        if (var621 == 6135) {
                            field1082[var2++] = class355.field4825;
                            continue;
                        }
                    } else if (var621 < 6300) {
                        if (var621 == 6200) {
                            var2 -= 2;
                            class52.field616 = (short) field1082[var2];
                            if (class52.field616 <= 0) {
                                class52.field616 = 256;
                            }
                            class167.field1951 = (short) field1082[var2 + 1];
                            if (class167.field1951 <= 0) {
                                class167.field1951 = 205;
                            }
                            continue;
                        }
                        if (var621 == 6201) {
                            var2 -= 2;
                            class229.field2945 = (short) field1082[var2];
                            if (class229.field2945 <= 0) {
                                class229.field2945 = 256;
                            }
                            class363.field4937 = (short) field1082[var2 + 1];
                            if (class363.field4937 <= 0) {
                                class363.field4937 = 320;
                            }
                            continue;
                        }
                        if (var621 == 6202) {
                            var2 -= 4;
                            class451.field6297 = (short) field1082[var2];
                            if (class451.field6297 <= 0) {
                                class451.field6297 = 1;
                            }
                            class262.field3374 = (short) field1082[var2 + 1];
                            if (class262.field3374 <= 0) {
                                class262.field3374 = 32767;
                            } else if (class262.field3374 < class451.field6297) {
                                class262.field3374 = class451.field6297;
                            }
                            class112.field1315 = (short) field1082[var2 + 2];
                            if (class112.field1315 <= 0) {
                                class112.field1315 = 1;
                            }
                            class372.field5045 = (short) field1082[var2 + 3];
                            if (class372.field5045 <= 0) {
                                class372.field5045 = 32767;
                            } else if (class372.field5045 < class112.field1315) {
                                class372.field5045 = class112.field1315;
                            }
                            continue;
                        }
                        if (var621 == 6203) {
                            class345.method2196(0, class336.field4583.field6432, class336.field4583.field6377, false, true, 0);
                            field1082[var2++] = class229.field2926;
                            field1082[var2++] = class269.field3473;
                            continue;
                        }
                        if (var621 == 6204) {
                            field1082[var2++] = class229.field2945;
                            field1082[var2++] = class363.field4937;
                            continue;
                        }
                        if (var621 == 6205) {
                            field1082[var2++] = class52.field616;
                            field1082[var2++] = class167.field1951;
                            continue;
                        }
                    } else if (var621 < 6400) {
                        if (var621 == 6300) {
                            field1082[var2++] = (int) (class164.method1038(8635) / 60000L);
                            continue;
                        }
                        if (var621 == 6301) {
                            field1082[var2++] = (int) (class164.method1038(8635) / 86400000L) - 11745;
                            continue;
                        }
                        if (var621 == 6302) {
                            var2 -= 3;
                            int var543 = field1082[var2];
                            int var544 = field1082[var2 + 1];
                            int var545 = field1082[var2 + 2];
                            field1084.clear();
                            field1084.set(11, 12);
                            field1084.set(var545, var544, var543);
                            field1082[var2++] = (int) (field1084.getTime().getTime() / 86400000L) - 11745;
                            continue;
                        }
                        if (var621 == 6303) {
                            field1084.clear();
                            field1084.setTime(new Date(class164.method1038(8635)));
                            field1082[var2++] = field1084.get(1);
                            continue;
                        }
                        if (var621 == 6304) {
                            var2--;
                            int var546 = field1082[var2];
                            boolean var547 = true;
                            if (var546 < 0) {
                                var547 = (var546 + 1) % 4 == 0;
                            } else if (var546 < 1582) {
                                var547 = var546 % 4 == 0;
                            } else if (var546 % 4 != 0) {
                                var547 = false;
                            } else if (var546 % 100 != 0) {
                                var547 = true;
                            } else if (var546 % 400 != 0) {
                                var547 = false;
                            }
                            field1082[var2++] = var547 ? 1 : 0;
                            continue;
                        }
                    } else if (var621 < 6500) {
                        if (var621 == 6405) {
                            field1082[var2++] = class57.method319(-123) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6406) {
                            field1082[var2++] = class325.method2040(-1860952312) ? 1 : 0;
                            continue;
                        }
                    } else if (var621 < 6600) {
                        if (var621 == 6500) {
                            if (class174.field2017 == 10 && class190.field2233 == 0 && class80.field970 == 0 && class102.field1189 == 0) {
                                field1082[var2++] = class304.method1931(1003) == -1 ? 0 : 1;
                                continue;
                            }
                            field1082[var2++] = 1;
                            continue;
                        }
                        if (var621 == 6501) {
                            class27 var548 = class2.method9(2);
                            if (var548 == null) {
                                field1082[var2++] = -1;
                                field1082[var2++] = 0;
                                field1098[var3++] = "";
                                field1082[var2++] = 0;
                                field1098[var3++] = "";
                                field1082[var2++] = 0;
                                field1082[var2++] = 0;
                            } else {
                                field1082[var2++] = var548.field299;
                                field1082[var2++] = var548.field5322;
                                field1098[var3++] = var548.field302;
                                class54 var549 = var548.method171(true);
                                field1082[var2++] = var549.field629;
                                field1098[var3++] = var549.field634;
                                field1082[var2++] = var548.field5316;
                                field1082[var2++] = var548.field303;
                            }
                            continue;
                        }
                        if (var621 == 6502) {
                            class27 var550 = class234.method1511(1);
                            if (var550 == null) {
                                field1082[var2++] = -1;
                                field1082[var2++] = 0;
                                field1098[var3++] = "";
                                field1082[var2++] = 0;
                                field1098[var3++] = "";
                                field1082[var2++] = 0;
                                field1082[var2++] = 0;
                            } else {
                                field1082[var2++] = var550.field299;
                                field1082[var2++] = var550.field5322;
                                field1098[var3++] = var550.field302;
                                class54 var551 = var550.method171(true);
                                field1082[var2++] = var551.field629;
                                field1098[var3++] = var551.field634;
                                field1082[var2++] = var550.field5316;
                                field1082[var2++] = var550.field303;
                            }
                            continue;
                        }
                        if (var621 == 6503) {
                            var2--;
                            int var552 = field1082[var2];
                            if (class174.field2017 == 10 && class190.field2233 == 0 && class80.field970 == 0 && class102.field1189 == 0) {
                                field1082[var2++] = class384.method2393(-18875, var552) ? 1 : 0;
                                continue;
                            }
                            field1082[var2++] = 0;
                            continue;
                        }
                        if (var621 == 6504) {
                            var2--;
                            class201.field2374 = field1082[var2];
                            class362.method2273(class401.field5525, (byte) 104);
                            continue;
                        }
                        if (var621 == 6505) {
                            field1082[var2++] = class201.field2374;
                            continue;
                        }
                        if (var621 == 6506) {
                            var2--;
                            int var553 = field1082[var2];
                            class27 var554 = class235.method1515(var553, (byte) 120);
                            if (var554 == null) {
                                field1082[var2++] = -1;
                                field1098[var3++] = "";
                                field1082[var2++] = 0;
                                field1098[var3++] = "";
                                field1082[var2++] = 0;
                                field1082[var2++] = 0;
                            } else {
                                field1082[var2++] = var554.field5322;
                                field1098[var3++] = var554.field302;
                                class54 var555 = var554.method171(true);
                                field1082[var2++] = var555.field629;
                                field1098[var3++] = var555.field634;
                                field1082[var2++] = var554.field5316;
                                field1082[var2++] = var554.field303;
                            }
                            continue;
                        }
                        if (var621 == 6507) {
                            var2 -= 4;
                            int var556 = field1082[var2];
                            boolean var557 = field1082[var2 + 1] == 1;
                            int var558 = field1082[var2 + 2];
                            boolean var559 = field1082[var2 + 3] == 1;
                            class108.method645(var556, false, var557, var559, var558);
                            continue;
                        }
                        if (var621 == 6508) {
                            class440.method2707((byte) -91);
                            continue;
                        }
                        if (var621 == 6509) {
                            if (class174.field2017 == 10) {
                                var2--;
                                if (field1082[var2] == 1) {
                                    if (class203.field2384 == null) {
                                        class203.field2384 = new class198();
                                    }
                                } else if (class203.field2384 != null) {
                                    class203.field2384.method1220((byte) 9);
                                    class203.field2384 = null;
                                }
                            }
                            continue;
                        }
                    } else if (var621 < 6700) {
                        if (var621 == 6600) {
                            var2--;
                            class244.field3246 = field1082[var2] == 1;
                            class362.method2273(class401.field5525, (byte) 120);
                            continue;
                        }
                        if (var621 == 6601) {
                            field1082[var2++] = class244.field3246 ? 1 : 0;
                            continue;
                        }
                    } else if (var621 < 6800 && class173.field2003 == 2) {
                        if (var621 == 6700) {
                            int var560 = class282.field3678.method2219((byte) -128);
                            if (class366.field4983 != -1) {
                                var560++;
                            }
                            field1082[var2++] = var560;
                            continue;
                        }
                        if (var621 == 6701) {
                            var2--;
                            int var561 = field1082[var2];
                            if (class366.field4983 != -1) {
                                if (var561 == 0) {
                                    field1082[var2++] = class366.field4983;
                                    continue;
                                }
                                var561--;
                            }
                            class244 var562 = (class244) class282.field3678.method2222(0);
                            while (var561-- > 0) {
                                var562 = (class244) class282.field3678.method2215(false);
                            }
                            field1082[var2++] = var562.field3245;
                            continue;
                        }
                        if (var621 == 6702) {
                            var2--;
                            int var563 = field1082[var2];
                            if (class362.field4903[var563] == null) {
                                field1098[var3++] = "";
                            } else {
                                String var564 = class362.field4903[var563][0].field6344;
                                if (var564 == null) {
                                    field1098[var3++] = "";
                                } else {
                                    field1098[var3++] = var564.substring(0, var564.indexOf(58));
                                }
                            }
                            continue;
                        }
                        if (var621 == 6703) {
                            var2--;
                            int var565 = field1082[var2];
                            if (class362.field4903[var565] == null) {
                                field1082[var2++] = 0;
                            } else {
                                field1082[var2++] = class362.field4903[var565].length;
                            }
                            continue;
                        }
                        if (var621 == 6704) {
                            var2 -= 2;
                            int var566 = field1082[var2];
                            int var567 = field1082[var2 + 1];
                            if (class362.field4903[var566] == null) {
                                field1098[var3++] = "";
                            } else {
                                String var568 = class362.field4903[var566][var567].field6344;
                                if (var568 == null) {
                                    field1098[var3++] = "";
                                } else {
                                    field1098[var3++] = var568;
                                }
                            }
                            continue;
                        }
                        if (var621 == 6705) {
                            var2 -= 2;
                            int var569 = field1082[var2];
                            int var570 = field1082[var2 + 1];
                            if (class362.field4903[var569] == null) {
                                field1082[var2++] = 0;
                            } else {
                                field1082[var2++] = class362.field4903[var569][var570].field6399;
                            }
                            continue;
                        }
                        if (var621 == 6706) {
                            continue;
                        }
                        if (var621 == 6707) {
                            var2 -= 3;
                            int var571 = field1082[var2];
                            int var572 = field1082[var2 + 1];
                            int var573 = field1082[var2 + 2];
                            class54.method308("", -109, var573, 1, var571 << 16 | var572);
                            continue;
                        }
                        if (var621 == 6708) {
                            var2 -= 3;
                            int var574 = field1082[var2];
                            int var575 = field1082[var2 + 1];
                            int var576 = field1082[var2 + 2];
                            class54.method308("", -85, var576, 2, var574 << 16 | var575);
                            continue;
                        }
                        if (var621 == 6709) {
                            var2 -= 3;
                            int var577 = field1082[var2];
                            int var578 = field1082[var2 + 1];
                            int var579 = field1082[var2 + 2];
                            class54.method308("", -77, var579, 3, var577 << 16 | var578);
                            continue;
                        }
                        if (var621 == 6710) {
                            var2 -= 3;
                            int var580 = field1082[var2];
                            int var581 = field1082[var2 + 1];
                            int var582 = field1082[var2 + 2];
                            class54.method308("", -77, var582, 4, var580 << 16 | var581);
                            continue;
                        }
                        if (var621 == 6711) {
                            var2 -= 3;
                            int var583 = field1082[var2];
                            int var584 = field1082[var2 + 1];
                            int var585 = field1082[var2 + 2];
                            class54.method308("", -118, var585, 5, var583 << 16 | var584);
                            continue;
                        }
                        if (var621 == 6712) {
                            var2 -= 3;
                            int var586 = field1082[var2];
                            int var587 = field1082[var2 + 1];
                            int var588 = field1082[var2 + 2];
                            class54.method308("", -115, var588, 6, var586 << 16 | var587);
                            continue;
                        }
                        if (var621 == 6713) {
                            var2 -= 3;
                            int var589 = field1082[var2];
                            int var590 = field1082[var2 + 1];
                            int var591 = field1082[var2 + 2];
                            class54.method308("", -101, var591, 7, var589 << 16 | var590);
                            continue;
                        }
                        if (var621 == 6714) {
                            var2 -= 3;
                            int var592 = field1082[var2];
                            int var593 = field1082[var2 + 1];
                            int var594 = field1082[var2 + 2];
                            class54.method308("", -101, var594, 8, var592 << 16 | var593);
                            continue;
                        }
                        if (var621 == 6715) {
                            var2 -= 3;
                            int var595 = field1082[var2];
                            int var596 = field1082[var2 + 1];
                            int var597 = field1082[var2 + 2];
                            class54.method308("", -86, var597, 9, var595 << 16 | var596);
                            continue;
                        }
                        if (var621 == 6716) {
                            var2 -= 3;
                            int var598 = field1082[var2];
                            int var599 = field1082[var2 + 1];
                            int var600 = field1082[var2 + 2];
                            class54.method308("", -106, var600, 10, var598 << 16 | var599);
                            continue;
                        }
                        if (var621 == 6717) {
                            var2 -= 3;
                            int var601 = field1082[var2];
                            int var602 = field1082[var2 + 1];
                            int var603 = field1082[var2 + 2];
                            class453 var604 = class378.method2346(-23490, var603, var601 << 16 | var602);
                            class416.method2561((byte) -47);
                            class357 var605 = client.method2696(var604);
                            class419.method2569(var605.method2257((byte) 112), var605.field4836, var604.field6471, var604.field6326, var601 << 16 | var602, var603, 0);
                            continue;
                        }
                    } else if (var621 < 6900) {
                        if (var621 == 6800) {
                            var2--;
                            int var606 = field1082[var2];
                            class222 var607 = class339.method2178(false, var606);
                            if (var607.field2785 == null) {
                                field1098[var3++] = "";
                            } else {
                                field1098[var3++] = var607.field2785;
                            }
                            continue;
                        }
                        if (var621 == 6801) {
                            var2--;
                            int var608 = field1082[var2];
                            class222 var609 = class339.method2178(false, var608);
                            field1082[var2++] = var609.field2783;
                            continue;
                        }
                        if (var621 == 6802) {
                            var2--;
                            int var610 = field1082[var2];
                            class222 var611 = class339.method2178(false, var610);
                            field1082[var2++] = var611.field2765;
                            continue;
                        }
                        if (var621 == 6803) {
                            var2--;
                            int var612 = field1082[var2];
                            class222 var613 = class339.method2178(false, var612);
                            field1082[var2++] = var613.field2784;
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var620) {
            if (arg0.field1279 == null) {
                StringBuffer var618 = new StringBuffer(30);
                var618.append("CS2: ").append(arg0.field505).append(" ");
                for (int var619 = field1094 - 1; var619 >= 0; var619--) {
                    var618.append("v: ").append(field1089[var619].field1218.field505).append(" ");
                }
                var618.append("op: ").append(var7);
                class402.method2510(var618.toString(), var620, -29832);
            } else {
                class134.method876((byte) -111, "Clientscript error in: " + arg0.field1279);
                StringBuffer var615 = new StringBuffer(30);
                var615.append("Clientscript error in: ").append(arg0.field1279).append("\n");
                for (int var616 = field1094 - 1; var616 >= 0; var616--) {
                    var615.append("via: ").append(field1089[var616].field1218.field1279).append("\n");
                }
                var615.append("Op: ").append(var7).append("\n");
                String var617 = var620.getMessage();
                if (var617 != null && var617.length() > 0) {
                    var615.append("Message: ").append(var617).append("\n");
                }
                class402.method2510(var615.toString(), var620, -29832);
                class228.method1394(var615.toString(), 0);
            }
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V")
    public static final void method582(int arg0) {
        if (arg0 == -1 || !class192.method1185(-3201, arg0)) {
            return;
        }
        class453[] var1 = class362.field4903[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class453 var3 = var1[var2];
            if (var3.field6354 != null) {
                class221 var4 = new class221();
                var4.field2732 = var3;
                var4.field2735 = var3.field6354;
                method580(var4, 2000000);
            }
        }
    }
}
