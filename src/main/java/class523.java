import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class523 {

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "[I")
    private static int[] field7103 = new int[1000];

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "[I")
    private static int[] field7105 = new int[5];

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    private static int field7099 = 0;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    private static int field7098 = 0;

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "[Ljava/lang/String;")
    private static String[] field7109 = new String[1000];

    @OriginalMember(owner = "client!hj", name = "s", descriptor = "[[I")
    private static int[][] field7111 = new int[5][5000];

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "[Lfr;")
    private static class376[] field7104 = new class376[50];

    @OriginalMember(owner = "client!hj", name = "u", descriptor = "I")
    private static int field7113 = 0;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "Ljava/util/Calendar;")
    private static Calendar field7097 = Calendar.getInstance();

    @OriginalMember(owner = "client!hj", name = "A", descriptor = "[I")
    private static int[] field7119 = new int[3];

    @OriginalMember(owner = "client!hj", name = "B", descriptor = "[Ljava/lang/String;")
    private static String[] field7120 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!hj", name = "z", descriptor = "Lvh;")
    public static class328 field7118 = new class328(4);

    @OriginalMember(owner = "client!hj", name = "C", descriptor = "I")
    private static int field7121 = 0;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field7095;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public static int field7101;

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "I")
    public static int field7106;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "I")
    public static int field7107;

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "I")
    public static int field7108;

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "I")
    public static int field7110;

    @OriginalMember(owner = "client!hj", name = "t", descriptor = "I")
    public static int field7112;

    @OriginalMember(owner = "client!hj", name = "v", descriptor = "I")
    public static int field7114;

    @OriginalMember(owner = "client!hj", name = "w", descriptor = "I")
    public static int field7115;

    @OriginalMember(owner = "client!hj", name = "x", descriptor = "I")
    public static int field7116;

    @OriginalMember(owner = "client!hj", name = "y", descriptor = "I")
    public static int field7117;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "Lhh;")
    private static class115 field7096;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "Lfaa;")
    private static class140 field7094;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "Lfaa;")
    private static class140 field7102;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "[I")
    private static int[] field7100;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "[Ljava/lang/String;")
    private static String[] field7093;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZ)V")
    private static final void method2888(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field7098 -= 3;
                int var2 = field7103[field7098];
                int var3 = field7103[field7098 + 1];
                int var4 = field7103[field7098 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class140 var5 = class266.method1626(var2, 114);
                if (var5.field2043 == null) {
                    var5.field2043 = new class140[var4 + 1];
                }
                if (var5.field2043.length <= var4) {
                    class140[] var6 = new class140[var4 + 1];
                    for (int var7 = 0; var7 < var5.field2043.length; var7++) {
                        var6[var7] = var5.field2043[var7];
                    }
                    var5.field2043 = var6;
                }
                if (var4 > 0 && var5.field2043[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class140 var8 = new class140();
                var8.field2023 = var3;
                var8.field2054 = var8.field2100 = var5.field2100;
                var8.field2092 = var4;
                var5.field2043[var4] = var8;
                if (arg1) {
                    field7102 = var8;
                } else {
                    field7094 = var8;
                }
                class432.method2481(var5, 98);
                return;
            }
            if (arg0 == 101) {
                class140 var9 = arg1 ? field7102 : field7094;
                if (var9.field2092 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class140 var10 = class266.method1626(var9.field2100, 118);
                var10.field2043[var9.field2092] = null;
                class432.method2481(var10, 78);
                return;
            }
            if (arg0 == 102) {
                class140 var11 = class266.method1626(field7103[--field7098], 113);
                var11.field2043 = null;
                class432.method2481(var11, 85);
                return;
            }
            if (arg0 == 200) {
                field7098 -= 2;
                int var12 = field7103[field7098];
                int var13 = field7103[field7098 + 1];
                class140 var14 = class474.method2695(-12025, var12, var13);
                if (var14 != null && var13 != -1) {
                    field7103[field7098++] = 1;
                    if (arg1) {
                        field7102 = var14;
                        return;
                    }
                    field7094 = var14;
                    return;
                }
                field7103[field7098++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field7103[--field7098];
                class140 var16 = class266.method1626(var15, 113);
                if (var16 != null) {
                    field7103[field7098++] = 1;
                    if (arg1) {
                        field7102 = var16;
                        return;
                    }
                    field7094 = var16;
                    return;
                }
                field7103[field7098++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field7103[--field7098];
                method2895(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field7103[--field7098];
                method2901(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field7098 -= 2;
                int var19 = field7103[field7098];
                int var20 = field7103[field7098 + 1];
                for (int var21 = 0; var21 < class246.field3504.length; var21++) {
                    if (class246.field3504[var21] == var19) {
                        class253.field3576.field3989.method90((byte) 121, var21, var20, class472.field6593);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class419.field5911.length; var22++) {
                    if (class419.field5911[var22] == var19) {
                        class253.field3576.field3989.method90((byte) 117, var22, var20, class472.field6593);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field7098 -= 2;
                int var23 = field7103[field7098];
                int var24 = field7103[field7098 + 1];
                class253.field3576.field3989.method88(var24, false, var23);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field7103[--field7098] != 0;
                class253.field3576.field3989.method86((byte) 119, var25);
                return;
            }
        } else if (!(arg0 < 1000 || arg0 >= 1100) || !(arg0 < 2000 || arg0 >= 2100)) {
            class140 var26;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var26 = class266.method1626(field7103[--field7098], 123);
            } else {
                var26 = arg1 ? field7102 : field7094;
            }
            if (arg0 == 1000) {
                field7098 -= 4;
                var26.field2042 = field7103[field7098];
                var26.field1985 = field7103[field7098 + 1];
                int var27 = field7103[field7098 + 2];
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 5) {
                    var27 = 5;
                }
                int var28 = field7103[field7098 + 3];
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 5) {
                    var28 = 5;
                }
                var26.field2086 = (byte) var27;
                var26.field2066 = (byte) var28;
                class432.method2481(var26, -68);
                class652.method3629(18858, var26);
                if (var26.field2092 == -1) {
                    class296.method1849(0, var26.field2100);
                }
                return;
            }
            if (arg0 == 1001) {
                field7098 -= 4;
                var26.field1981 = field7103[field7098];
                var26.field2037 = field7103[field7098 + 1];
                var26.field2012 = 0;
                var26.field1993 = 0;
                int var29 = field7103[field7098 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 4) {
                    var29 = 4;
                }
                int var30 = field7103[field7098 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 4) {
                    var30 = 4;
                }
                var26.field2011 = (byte) var29;
                var26.field2098 = (byte) var30;
                class432.method2481(var26, -85);
                class652.method3629(18858, var26);
                if (var26.field2023 == 0) {
                    class316.method1936(var26, false, (byte) -123);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var31 = field7103[--field7098] == 1;
                if (var26.field2051 != var31) {
                    var26.field2051 = var31;
                    class432.method2481(var26, -127);
                }
                if (var26.field2092 == -1) {
                    class182.method1230(var26.field2100, -43);
                }
                return;
            }
            if (arg0 == 1004) {
                field7098 -= 2;
                var26.field2074 = field7103[field7098];
                var26.field2004 = field7103[field7098 + 1];
                class432.method2481(var26, -70);
                class652.method3629(18858, var26);
                if (var26.field2023 == 0) {
                    class316.method1936(var26, false, (byte) 89);
                }
                return;
            }
            if (arg0 == 1005) {
                var26.field2057 = field7103[--field7098] == 1;
                return;
            }
        } else if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
            class140 var32;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var32 = class266.method1626(field7103[--field7098], 107);
            } else {
                var32 = arg1 ? field7102 : field7094;
            }
            if (arg0 == 1100) {
                field7098 -= 2;
                var32.field2122 = field7103[field7098];
                if (var32.field2122 > var32.field2062 - var32.field2121) {
                    var32.field2122 = var32.field2062 - var32.field2121;
                }
                if (var32.field2122 < 0) {
                    var32.field2122 = 0;
                }
                var32.field2073 = field7103[field7098 + 1];
                if (var32.field2073 > var32.field1961 - var32.field2082) {
                    var32.field2073 = var32.field1961 - var32.field2082;
                }
                if (var32.field2073 < 0) {
                    var32.field2073 = 0;
                }
                class432.method2481(var32, -101);
                if (var32.field2092 == -1) {
                    class305.method1875(24, var32.field2100);
                }
                return;
            }
            if (arg0 == 1101) {
                var32.field1967 = field7103[--field7098];
                class432.method2481(var32, 111);
                if (var32.field2092 == -1) {
                    class232.method1465(true, var32.field2100);
                }
                return;
            }
            if (arg0 == 1102) {
                var32.field2000 = field7103[--field7098] == 1;
                class432.method2481(var32, 79);
                return;
            }
            if (arg0 == 1103) {
                var32.field1956 = field7103[--field7098];
                class432.method2481(var32, -105);
                return;
            }
            if (arg0 == 1104) {
                var32.field2009 = field7103[--field7098];
                class432.method2481(var32, 95);
                return;
            }
            if (arg0 == 1105) {
                int var33 = field7103[--field7098];
                if (var32.field2010 != var33) {
                    var32.field2010 = var33;
                    class432.method2481(var32, 124);
                }
                if (var32.field2092 == -1) {
                    class302.method1865(true, var32.field2100);
                }
                return;
            }
            if (arg0 == 1106) {
                var32.field2041 = field7103[--field7098];
                class432.method2481(var32, 85);
                return;
            }
            if (arg0 == 1107) {
                var32.field2079 = field7103[--field7098] == 1;
                class432.method2481(var32, -83);
                return;
            }
            if (arg0 == 1108) {
                var32.field2103 = 1;
                var32.field2021 = field7103[--field7098];
                class432.method2481(var32, -105);
                if (var32.field2092 == -1) {
                    class414.method2360(var32.field2100, (byte) -58);
                }
                return;
            }
            if (arg0 == 1109) {
                field7098 -= 6;
                var32.field2007 = field7103[field7098];
                var32.field1979 = field7103[field7098 + 1];
                var32.field2113 = field7103[field7098 + 2];
                var32.field2025 = field7103[field7098 + 3];
                var32.field2067 = field7103[field7098 + 4];
                var32.field2105 = field7103[field7098 + 5];
                class432.method2481(var32, -62);
                if (var32.field2092 == -1) {
                    class580.method3225((byte) -117, var32.field2100);
                    class219.method1413(false, var32.field2100);
                }
                return;
            }
            if (arg0 == 1110) {
                int var34 = field7103[--field7098];
                if (var32.field1992 != var34) {
                    var32.field1992 = var34;
                    var32.field1955 = 0;
                    var32.field2001 = 1;
                    var32.field2110 = 0;
                    class432.method2481(var32, 89);
                }
                if (var32.field2092 == -1) {
                    class630.method3499(var32.field2100, 5);
                }
                return;
            }
            if (arg0 == 1111) {
                var32.field2107 = field7103[--field7098] == 1;
                class432.method2481(var32, 105);
                return;
            }
            if (arg0 == 1112) {
                String var35 = field7109[--field7113];
                if (!var35.equals(var32.field1972)) {
                    var32.field1972 = var35;
                    class432.method2481(var32, -87);
                }
                if (var32.field2092 == -1) {
                    class158.method1093(var32.field2100, (byte) -2);
                }
                return;
            }
            if (arg0 == 1113) {
                var32.field2045 = field7103[--field7098];
                class432.method2481(var32, -89);
                if (var32.field2092 == -1) {
                    class426.method2416(var32.field2100, (byte) 24);
                }
                return;
            }
            if (arg0 == 1114) {
                field7098 -= 3;
                var32.field2108 = field7103[field7098];
                var32.field1983 = field7103[field7098 + 1];
                var32.field2048 = field7103[field7098 + 2];
                class432.method2481(var32, 119);
                return;
            }
            if (arg0 == 1115) {
                var32.field2060 = field7103[--field7098] == 1;
                class432.method2481(var32, -77);
                return;
            }
            if (arg0 == 1116) {
                var32.field2014 = field7103[--field7098];
                class432.method2481(var32, 84);
                return;
            }
            if (arg0 == 1117) {
                var32.field2038 = field7103[--field7098];
                class432.method2481(var32, -76);
                return;
            }
            if (arg0 == 1118) {
                var32.field2047 = field7103[--field7098] == 1;
                class432.method2481(var32, -76);
                return;
            }
            if (arg0 == 1119) {
                var32.field1958 = field7103[--field7098] == 1;
                class432.method2481(var32, 110);
                return;
            }
            if (arg0 == 1120) {
                field7098 -= 2;
                var32.field2062 = field7103[field7098];
                var32.field1961 = field7103[field7098 + 1];
                class432.method2481(var32, -88);
                if (var32.field2023 == 0) {
                    class316.method1936(var32, false, (byte) -77);
                }
                return;
            }
            if (arg0 == 1121) {
                field7098 -= 2;
                var32.field2050 = (short) field7103[field7098];
                var32.field1974 = (short) field7103[field7098 + 1];
                class432.method2481(var32, 83);
                return;
            }
            if (arg0 == 1122) {
                var32.field2109 = field7103[--field7098] == 1;
                class432.method2481(var32, 126);
                return;
            }
            if (arg0 == 1123) {
                var32.field2105 = field7103[--field7098];
                class432.method2481(var32, -112);
                if (var32.field2092 == -1) {
                    class580.method3225((byte) -128, var32.field2100);
                }
                return;
            }
            if (arg0 == 1124) {
                int var36 = field7103[--field7098];
                var32.field2006 = var36 == 1;
                class432.method2481(var32, -59);
                return;
            }
            if (arg0 == 1125) {
                field7098 -= 2;
                var32.field1997 = field7103[field7098];
                var32.field2033 = field7103[field7098 + 1];
                class432.method2481(var32, -118);
                return;
            }
            if (arg0 == 1126) {
                var32.field2040 = field7103[--field7098];
                class432.method2481(var32, 77);
                return;
            }
            if (arg0 == 1127) {
                field7098 -= 2;
                int var37 = field7103[field7098];
                int var38 = field7103[field7098 + 1];
                class374 var39 = class324.field4784.method2171((byte) -80, var37);
                if (var39.field5300 != var38) {
                    var32.method996(var37, 6857, var38);
                    return;
                }
                var32.method989(-2308, var37);
                return;
            }
            if (arg0 == 1128) {
                int var40 = field7103[--field7098];
                String var41 = field7109[--field7113];
                class374 var42 = class324.field4784.method2171((byte) -80, var40);
                if (!var42.field5301.equals(var41)) {
                    var32.method1004(var40, -74, var41);
                    return;
                }
                var32.method989(-2308, var40);
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class140 var43;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var43 = class266.method1626(field7103[--field7098], 111);
            } else {
                var43 = arg1 ? field7102 : field7094;
            }
            class432.method2481(var43, -117);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field7098 -= 2;
                int var44 = field7103[field7098];
                int var45 = field7103[field7098 + 1];
                if (var43.field2092 == -1) {
                    class291.method1829(var43.field2100, -112);
                    class580.method3225((byte) -118, var43.field2100);
                    class219.method1413(false, var43.field2100);
                }
                if (var44 == -1) {
                    var43.field2103 = 1;
                    var43.field2021 = -1;
                    var43.field1969 = -1;
                    return;
                }
                var43.field1969 = var44;
                var43.field2065 = var45;
                if (arg0 == 1208 || arg0 == 1209) {
                    var43.field2053 = true;
                } else {
                    var43.field2053 = false;
                }
                class257 var46 = class648.field9184.method3064(var44, -27);
                var43.field2113 = var46.field3681;
                var43.field2025 = var46.field3674;
                var43.field2067 = var46.field3606;
                var43.field2007 = var46.field3680;
                var43.field1979 = var46.field3612;
                var43.field2105 = var46.field3677;
                if (arg0 == 1205 || arg0 == 1209) {
                    var43.field2118 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var43.field2118 = 1;
                } else {
                    var43.field2118 = 2;
                }
                if (var43.field2012 > 0) {
                    var43.field2105 = var43.field2105 * 32 / var43.field2012;
                    return;
                }
                if (var43.field1981 > 0) {
                    var43.field2105 = var43.field2105 * 32 / var43.field1981;
                }
                return;
            }
            if (arg0 == 1201) {
                var43.field2103 = 2;
                var43.field2021 = field7103[--field7098];
                if (var43.field2092 == -1) {
                    class414.method2360(var43.field2100, (byte) -58);
                }
                return;
            }
            if (arg0 == 1202) {
                var43.field2103 = 3;
                var43.field2021 = -1;
                if (var43.field2092 == -1) {
                    class414.method2360(var43.field2100, (byte) -58);
                }
                return;
            }
            if (arg0 == 1203) {
                var43.field2103 = 6;
                var43.field2021 = field7103[--field7098];
                if (var43.field2092 == -1) {
                    class414.method2360(var43.field2100, (byte) -58);
                }
                return;
            }
            if (arg0 == 1204) {
                var43.field2103 = 5;
                var43.field2021 = field7103[--field7098];
                if (var43.field2092 == -1) {
                    class414.method2360(var43.field2100, (byte) -58);
                }
                return;
            }
            if (arg0 == 1206) {
                field7098 -= 4;
                var43.field2052 = field7103[field7098];
                var43.field2088 = field7103[field7098 + 1];
                var43.field2085 = field7103[field7098 + 2];
                var43.field2063 = field7103[field7098 + 3];
                class432.method2481(var43, 76);
                return;
            }
            if (arg0 == 1207) {
                field7098 -= 2;
                var43.field1990 = field7103[field7098];
                var43.field1975 = field7103[field7098 + 1];
                class432.method2481(var43, -85);
                return;
            }
            if (arg0 == 1210) {
                field7098 -= 4;
                var43.field2021 = field7103[field7098];
                var43.field2104 = field7103[field7098 + 1];
                if (field7103[field7098 + 2] == 1) {
                    var43.field2103 = 9;
                } else {
                    var43.field2103 = 8;
                }
                if (field7103[field7098 + 3] == 1) {
                    var43.field2053 = true;
                } else {
                    var43.field2053 = false;
                }
                if (var43.field2092 == -1) {
                    class414.method2360(var43.field2100, (byte) -58);
                }
                return;
            }
            if (arg0 == 1211) {
                var43.field2103 = 5;
                var43.field2021 = class27.field343;
                var43.field2104 = 0;
                if (var43.field2092 == -1) {
                    class414.method2360(var43.field2100, (byte) -58);
                }
                return;
            }
        } else if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
            class140 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class266.method1626(field7103[--field7098], 125);
            } else {
                var47 = arg1 ? field7102 : field7094;
            }
            if (arg0 == 1300) {
                int var48 = field7103[--field7098] - 1;
                if (var48 >= 0 && var48 <= 9) {
                    var47.method992(false, var48, field7109[--field7113]);
                    return;
                }
                field7113--;
                return;
            }
            if (arg0 == 1301) {
                field7098 -= 2;
                int var49 = field7103[field7098];
                int var50 = field7103[field7098 + 1];
                if (var49 == -1 && var50 == -1) {
                    var47.field2044 = null;
                    return;
                }
                var47.field2044 = class474.method2695(-12025, var49, var50);
                return;
            }
            if (arg0 == 1302) {
                int var51 = field7103[--field7098];
                if (class570.field7664 != var51 && class658.field9263 != var51 && class575.field7733 != var51) {
                    return;
                }
                var47.field2018 = var51;
                return;
            }
            if (arg0 == 1303) {
                var47.field2076 = field7103[--field7098];
                return;
            }
            if (arg0 == 1304) {
                var47.field2089 = field7103[--field7098];
                return;
            }
            if (arg0 == 1305) {
                var47.field2034 = field7109[--field7113];
                return;
            }
            if (arg0 == 1306) {
                var47.field2064 = field7109[--field7113];
                return;
            }
            if (arg0 == 1307) {
                var47.field2031 = null;
                return;
            }
            if (arg0 == 1308) {
                var47.field1963 = field7103[--field7098];
                var47.field2123 = field7103[--field7098];
                return;
            }
            if (arg0 == 1309) {
                int var52 = field7103[--field7098];
                int var53 = field7103[--field7098];
                if (var53 >= 1 && var53 <= 10) {
                    var47.method987((byte) 56, var53 - 1, var52);
                }
                return;
            }
            if (arg0 == 1310) {
                var47.field1986 = field7109[--field7113];
                return;
            }
            if (arg0 == 1311) {
                var47.field2101 = field7103[--field7098];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var54;
                int var55;
                int var56;
                if (arg0 == 1312) {
                    field7098 -= 3;
                    var54 = field7103[field7098] - 1;
                    var55 = field7103[field7098 + 1];
                    var56 = field7103[field7098 + 2];
                    if (var54 < 0 || var54 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field7098 -= 2;
                    var54 = 10;
                    var55 = field7103[field7098];
                    var56 = field7103[field7098 + 1];
                }
                if (var47.field2059 == null) {
                    if (var55 == 0) {
                        return;
                    }
                    var47.field2059 = new byte[11];
                    var47.field2112 = new byte[11];
                    var47.field2046 = new int[11];
                }
                var47.field2059[var54] = (byte) var55;
                if (var55 == 0) {
                    var47.field2119 = false;
                    for (int var57 = 0; var57 < var47.field2059.length; var57++) {
                        if (var47.field2059[var57] != 0) {
                            var47.field2119 = true;
                            break;
                        }
                    }
                } else {
                    var47.field2119 = true;
                }
                var47.field2112[var54] = (byte) var56;
                return;
            }
            if (arg0 == 1314) {
                var47.field2071 = field7103[--field7098];
                return;
            }
        } else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
            class140 var58;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var58 = class266.method1626(field7103[--field7098], 126);
            } else {
                var58 = arg1 ? field7102 : field7094;
            }
            if (arg0 == 1499) {
                var58.method997(114);
                return;
            }
            String var59 = field7109[--field7113];
            int[] var60 = null;
            if (var59.length() > 0 && var59.charAt(var59.length() - 1) == 'Y') {
                int var61 = field7103[--field7098];
                if (var61 > 0) {
                    var60 = new int[var61];
                    while (var61-- > 0) {
                        var60[var61] = field7103[--field7098];
                    }
                }
                var59 = var59.substring(0, var59.length() - 1);
            }
            Object[] var62 = new Object[var59.length() + 1];
            for (int var63 = var62.length - 1; var63 >= 1; var63--) {
                if (var59.charAt(var63 - 1) == 's') {
                    var62[var63] = field7109[--field7113];
                } else {
                    var62[var63] = Integer.valueOf(field7103[--field7098]);
                }
            }
            int var64 = field7103[--field7098];
            if (var64 == -1) {
                var62 = null;
            } else {
                var62[0] = Integer.valueOf(var64);
            }
            if (arg0 == 1400) {
                var58.field2097 = var62;
            } else if (arg0 == 1401) {
                var58.field2055 = var62;
            } else if (arg0 == 1402) {
                var58.field2015 = var62;
            } else if (arg0 == 1403) {
                var58.field1991 = var62;
            } else if (arg0 == 1404) {
                var58.field2087 = var62;
            } else if (arg0 == 1405) {
                var58.field2114 = var62;
            } else if (arg0 == 1406) {
                var58.field1987 = var62;
            } else if (arg0 == 1407) {
                var58.field2017 = var62;
                var58.field2099 = var60;
            } else if (arg0 == 1408) {
                var58.field2120 = var62;
            } else if (arg0 == 1409) {
                var58.field1957 = var62;
            } else if (arg0 == 1410) {
                var58.field2013 = var62;
            } else if (arg0 == 1411) {
                var58.field2070 = var62;
            } else if (arg0 == 1412) {
                var58.field2117 = var62;
            } else if (arg0 == 1414) {
                var58.field2039 = var62;
                var58.field1960 = var60;
            } else if (arg0 == 1415) {
                var58.field2075 = var62;
                var58.field1989 = var60;
            } else if (arg0 == 1416) {
                var58.field2083 = var62;
            } else if (arg0 == 1417) {
                var58.field1977 = var62;
            } else if (arg0 == 1418) {
                var58.field2061 = var62;
            } else if (arg0 == 1419) {
                var58.field2028 = var62;
            } else if (arg0 == 1420) {
                var58.field2090 = var62;
            } else if (arg0 == 1421) {
                var58.field1966 = var62;
            } else if (arg0 == 1422) {
                var58.field1962 = var62;
            } else if (arg0 == 1423) {
                var58.field1999 = var62;
            } else if (arg0 == 1424) {
                var58.field2003 = var62;
            } else if (arg0 == 1425) {
                var58.field2093 = var62;
            } else if (arg0 == 1426) {
                var58.field2116 = var62;
            } else if (arg0 == 1427) {
                var58.field2036 = var62;
            } else if (arg0 == 1428) {
                var58.field2022 = var62;
                var58.field1984 = var60;
            } else if (arg0 == 1429) {
                var58.field2078 = var62;
                var58.field1964 = var60;
            } else if (arg0 == 1430) {
                var58.field1995 = var62;
            }
            var58.field1988 = true;
            return;
        } else if (arg0 < 1600) {
            class140 var65 = arg1 ? field7102 : field7094;
            if (arg0 == 1500) {
                field7103[field7098++] = var65.field2029;
                return;
            }
            if (arg0 == 1501) {
                field7103[field7098++] = var65.field2027;
                return;
            }
            if (arg0 == 1502) {
                field7103[field7098++] = var65.field2121;
                return;
            }
            if (arg0 == 1503) {
                field7103[field7098++] = var65.field2082;
                return;
            }
            if (arg0 == 1504) {
                field7103[field7098++] = var65.field2051 ? 1 : 0;
                return;
            }
            if (arg0 == 1505) {
                field7103[field7098++] = var65.field2054;
                return;
            }
            if (arg0 == 1506) {
                class140 var66 = class198.method1342(var65, true);
                field7103[field7098++] = var66 == null ? -1 : var66.field2100;
                return;
            }
        } else if (arg0 < 1700) {
            class140 var67 = arg1 ? field7102 : field7094;
            if (arg0 == 1600) {
                field7103[field7098++] = var67.field2122;
                return;
            }
            if (arg0 == 1601) {
                field7103[field7098++] = var67.field2073;
                return;
            }
            if (arg0 == 1602) {
                field7109[field7113++] = var67.field1972;
                return;
            }
            if (arg0 == 1603) {
                field7103[field7098++] = var67.field2062;
                return;
            }
            if (arg0 == 1604) {
                field7103[field7098++] = var67.field1961;
                return;
            }
            if (arg0 == 1605) {
                field7103[field7098++] = var67.field2105;
                return;
            }
            if (arg0 == 1606) {
                field7103[field7098++] = var67.field2113;
                return;
            }
            if (arg0 == 1607) {
                field7103[field7098++] = var67.field2067;
                return;
            }
            if (arg0 == 1608) {
                field7103[field7098++] = var67.field2025;
                return;
            }
            if (arg0 == 1609) {
                field7103[field7098++] = var67.field1956;
                return;
            }
            if (arg0 == 1610) {
                field7103[field7098++] = var67.field2007;
                return;
            }
            if (arg0 == 1611) {
                field7103[field7098++] = var67.field1979;
                return;
            }
            if (arg0 == 1612) {
                field7103[field7098++] = var67.field2010;
                return;
            }
            if (arg0 == 1613) {
                int var68 = field7103[--field7098];
                class374 var69 = class324.field4784.method2171((byte) -80, var68);
                if (var69.method2182(115)) {
                    field7109[field7113++] = var67.method993((byte) -108, var68, var69.field5301);
                    return;
                }
                field7103[field7098++] = var67.method1003(var69.field5300, var68, 64);
                return;
            }
            if (arg0 == 1614) {
                field7103[field7098++] = var67.field2041;
                return;
            }
        } else if (arg0 < 1800) {
            class140 var70 = arg1 ? field7102 : field7094;
            if (arg0 == 1700) {
                field7103[field7098++] = var70.field1969;
                return;
            }
            if (arg0 == 1701) {
                if (var70.field1969 != -1) {
                    field7103[field7098++] = var70.field2065;
                    return;
                }
                field7103[field7098++] = 0;
                return;
            }
            if (arg0 == 1702) {
                field7103[field7098++] = var70.field2092;
                return;
            }
        } else if (arg0 < 1900) {
            class140 var71 = arg1 ? field7102 : field7094;
            if (arg0 == 1800) {
                field7103[field7098++] = client.method1655(var71).method2848(-1);
                return;
            }
            if (arg0 == 1801) {
                int var72 = field7103[--field7098];
                int var342 = var72 - 1;
                if (var71.field2031 != null && var342 < var71.field2031.length && var71.field2031[var342] != null) {
                    field7109[field7113++] = var71.field2031[var342];
                    return;
                }
                field7109[field7113++] = "";
                return;
            }
            if (arg0 == 1802) {
                if (var71.field2034 == null) {
                    field7109[field7113++] = "";
                    return;
                }
                field7109[field7113++] = var71.field2034;
                return;
            }
        } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
            class140 var340;
            if (arg0 >= 2000) {
                var340 = class266.method1626(field7103[--field7098], 102);
                arg0 -= 1000;
            } else {
                var340 = arg1 ? field7102 : field7094;
            }
            if (field7121 >= 10) {
                throw new RuntimeException("C29xx-1");
            }
            if (arg0 == 1927) {
                if (var340.field2036 == null) {
                    return;
                }
                class388 var341 = new class388();
                var341.field5443 = var340;
                var341.field5451 = var340.field2036;
                var341.field5439 = field7121 + 1;
                class1.field3.method1273(var341, (byte) 122);
                return;
            }
        } else if (arg0 < 2600) {
            class140 var73 = class266.method1626(field7103[--field7098], 118);
            if (arg0 == 2500) {
                field7103[field7098++] = var73.field2029;
                return;
            }
            if (arg0 == 2501) {
                field7103[field7098++] = var73.field2027;
                return;
            }
            if (arg0 == 2502) {
                field7103[field7098++] = var73.field2121;
                return;
            }
            if (arg0 == 2503) {
                field7103[field7098++] = var73.field2082;
                return;
            }
            if (arg0 == 2504) {
                field7103[field7098++] = var73.field2051 ? 1 : 0;
                return;
            }
            if (arg0 == 2505) {
                field7103[field7098++] = var73.field2054;
                return;
            }
            if (arg0 == 1506) {
                class140 var74 = class198.method1342(var73, true);
                field7103[field7098++] = var74 == null ? -1 : var74.field2100;
                return;
            }
        } else if (arg0 < 2700) {
            class140 var75 = class266.method1626(field7103[--field7098], 106);
            if (arg0 == 2600) {
                field7103[field7098++] = var75.field2122;
                return;
            }
            if (arg0 == 2601) {
                field7103[field7098++] = var75.field2073;
                return;
            }
            if (arg0 == 2602) {
                field7109[field7113++] = var75.field1972;
                return;
            }
            if (arg0 == 2603) {
                field7103[field7098++] = var75.field2062;
                return;
            }
            if (arg0 == 2604) {
                field7103[field7098++] = var75.field1961;
                return;
            }
            if (arg0 == 2605) {
                field7103[field7098++] = var75.field2105;
                return;
            }
            if (arg0 == 2606) {
                field7103[field7098++] = var75.field2113;
                return;
            }
            if (arg0 == 2607) {
                field7103[field7098++] = var75.field2067;
                return;
            }
            if (arg0 == 2608) {
                field7103[field7098++] = var75.field2025;
                return;
            }
            if (arg0 == 2609) {
                field7103[field7098++] = var75.field1956;
                return;
            }
            if (arg0 == 2610) {
                field7103[field7098++] = var75.field2007;
                return;
            }
            if (arg0 == 2611) {
                field7103[field7098++] = var75.field1979;
                return;
            }
            if (arg0 == 2612) {
                field7103[field7098++] = var75.field2010;
                return;
            }
            if (arg0 == 2613) {
                field7103[field7098++] = var75.field2041;
                return;
            }
        } else if (arg0 < 2800) {
            if (arg0 == 2700) {
                class140 var76 = class266.method1626(field7103[--field7098], 126);
                field7103[field7098++] = var76.field1969;
                return;
            }
            if (arg0 == 2701) {
                class140 var77 = class266.method1626(field7103[--field7098], 107);
                if (var77.field1969 != -1) {
                    field7103[field7098++] = var77.field2065;
                    return;
                }
                field7103[field7098++] = 0;
                return;
            }
            if (arg0 == 2702) {
                int var78 = field7103[--field7098];
                class198 var79 = (class198) class368.field5262.method2061(-17305, (long) var78);
                if (var79 != null) {
                    field7103[field7098++] = 1;
                    return;
                }
                field7103[field7098++] = 0;
                return;
            }
            if (arg0 == 2703) {
                class140 var80 = class266.method1626(field7103[--field7098], 106);
                if (var80.field2043 == null) {
                    field7103[field7098++] = 0;
                    return;
                }
                int var81 = var80.field2043.length;
                for (int var82 = 0; var82 < var80.field2043.length; var82++) {
                    if (var80.field2043[var82] == null) {
                        var81 = var82;
                        break;
                    }
                }
                field7103[field7098++] = var81;
                return;
            }
            if (arg0 == 2704 || arg0 == 2705) {
                field7098 -= 2;
                int var83 = field7103[field7098];
                int var84 = field7103[field7098 + 1];
                class198 var85 = (class198) class368.field5262.method2061(-17305, (long) var83);
                if (var85 != null && var85.field2922 == var84) {
                    field7103[field7098++] = 1;
                    return;
                }
                field7103[field7098++] = 0;
                return;
            }
        } else if (arg0 < 2900) {
            class140 var86 = class266.method1626(field7103[--field7098], 105);
            if (arg0 == 2800) {
                field7103[field7098++] = client.method1655(var86).method2848(-1);
                return;
            }
            if (arg0 == 2801) {
                int var87 = field7103[--field7098];
                int var343 = var87 - 1;
                if (var86.field2031 != null && var343 < var86.field2031.length && var86.field2031[var343] != null) {
                    field7109[field7113++] = var86.field2031[var343];
                    return;
                }
                field7109[field7113++] = "";
                return;
            }
            if (arg0 == 2802) {
                if (var86.field2034 == null) {
                    field7109[field7113++] = "";
                    return;
                }
                field7109[field7113++] = var86.field2034;
                return;
            }
        } else if (arg0 < 3200) {
            if (arg0 == 3100) {
                String var88 = field7109[--field7113];
                class340.method2038(27663, var88);
                return;
            }
            if (arg0 == 3101) {
                field7098 -= 2;
                class418.method2385(field7103[field7098 + 1], field7103[field7098], class253.field3576, 111);
                return;
            }
            if (arg0 == 3103) {
                class681.method3763(true, 17062);
                return;
            }
            if (arg0 == 3104) {
                String var89 = field7109[--field7113];
                int var90 = 0;
                if (class226.method1445(var89, (byte) 106)) {
                    var90 = class551.method3028(4, var89);
                }
                field7115++;
                class1.method5(1, class82.field1154);
                class288.field4014.method741(var90, (byte) 27);
                return;
            }
            if (arg0 == 3105) {
                String var91 = field7109[--field7113];
                field7101++;
                class1.method5(1, class610.field8478);
                class288.field4014.method746((byte) -90, var91.length() + 1);
                class288.field4014.method708(-124, var91);
                return;
            }
            if (arg0 == 3106) {
                String var92 = field7109[--field7113];
                field7114++;
                class1.method5(1, class476.field6650);
                class288.field4014.method746((byte) -91, var92.length() + 1);
                class288.field4014.method708(26, var92);
                return;
            }
            if (arg0 == 3107) {
                int var93 = field7103[--field7098];
                String var94 = field7109[--field7113];
                class540.method2974(-122, var93, var94);
                return;
            }
            if (arg0 == 3108) {
                field7098 -= 3;
                int var95 = field7103[field7098];
                int var96 = field7103[field7098 + 1];
                int var97 = field7103[field7098 + 2];
                class140 var98 = class266.method1626(var97, 117);
                class601.method3331(var98, (byte) 112, var95, var96);
                return;
            }
            if (arg0 == 3109) {
                field7098 -= 2;
                int var99 = field7103[field7098];
                int var100 = field7103[field7098 + 1];
                class140 var101 = arg1 ? field7102 : field7094;
                class601.method3331(var101, (byte) 112, var99, var100);
                return;
            }
            if (arg0 == 3110) {
                int var102 = field7103[--field7098];
                field7107++;
                class1.method5(1, class52.field752);
                class288.field4014.method731(-2045573048, var102);
                return;
            }
            if (arg0 == 3111) {
                field7098 -= 2;
                int var103 = field7103[field7098];
                int var104 = field7103[field7098 + 1];
                class198 var105 = (class198) class368.field5262.method2061(-17305, (long) var103);
                if (var105 != null) {
                    class258.method1594(true, -103, var105.field2922 != var104, var105);
                }
                class590.method3280(var103, true, 3, var104, 108);
                return;
            }
            if (arg0 == 3112) {
                field7098--;
                int var106 = field7103[field7098];
                class198 var107 = (class198) class368.field5262.method2061(-17305, (long) var106);
                if (var107 != null && var107.field2924 == 3) {
                    class258.method1594(true, -117, true, var107);
                }
                return;
            }
            if (arg0 == 3113) {
                class133.method950((byte) 94, field7109[--field7113]);
                return;
            }
            if (arg0 == 3114) {
                field7098 -= 2;
                int var108 = field7103[field7098];
                int var109 = field7103[field7098 + 1];
                String var110 = field7109[--field7113];
                class250.method1549("", "", -1, "", var108, var110, var109);
                return;
            }
        } else if (arg0 < 3300) {
            if (arg0 == 3200) {
                field7098 -= 3;
                class548.method3011(-12114, field7103[field7098], field7103[field7098 + 1], 255, field7103[field7098 + 2]);
                return;
            }
            if (arg0 == 3201) {
                class601.method3334(field7103[--field7098], (byte) -107, 50, 255);
                return;
            }
            if (arg0 == 3202) {
                field7098 -= 2;
                class284.method1712(0, field7103[field7098], field7103[field7098 + 1], 255);
                return;
            }
            if (arg0 == 3203) {
                field7098 -= 4;
                class548.method3011(-12114, field7103[field7098], field7103[field7098 + 1], field7103[field7098 + 3], field7103[field7098 + 2]);
                return;
            }
            if (arg0 == 3204) {
                field7098 -= 3;
                class601.method3334(field7103[field7098], (byte) -124, field7103[field7098 + 2], field7103[field7098 + 1]);
                return;
            }
            if (arg0 == 3205) {
                field7098 -= 3;
                class284.method1712(0, field7103[field7098], field7103[field7098 + 1], field7103[field7098 + 2]);
                return;
            }
            if (arg0 == 3206) {
                field7098 -= 4;
                class431.method2444(field7103[field7098 + 3], field7103[field7098 + 1], false, field7103[field7098 + 2], field7103[field7098], -1);
                return;
            }
            if (arg0 == 3207) {
                field7098 -= 4;
                class431.method2444(field7103[field7098 + 3], field7103[field7098 + 1], true, field7103[field7098 + 2], field7103[field7098], -1);
                return;
            }
        } else if (arg0 < 3400) {
            if (arg0 == 3300) {
                field7103[field7098++] = class239.field3440;
                return;
            }
            if (arg0 == 3301) {
                field7098 -= 2;
                int var111 = field7103[field7098];
                int var112 = field7103[field7098 + 1];
                field7103[field7098++] = class92.method682(var112, -87, var111, false);
                return;
            }
            if (arg0 == 3302) {
                field7098 -= 2;
                int var113 = field7103[field7098];
                int var114 = field7103[field7098 + 1];
                field7103[field7098++] = class535.method2959(var114, var113, false, 0);
                return;
            }
            if (arg0 == 3303) {
                field7098 -= 2;
                int var115 = field7103[field7098];
                int var116 = field7103[field7098 + 1];
                field7103[field7098++] = class496.method2770(var115, false, var116, -113);
                return;
            }
            if (arg0 == 3304) {
                int var117 = field7103[--field7098];
                field7103[field7098++] = class63.field837.method2053(var117, -123).field9673;
                return;
            }
            if (arg0 == 3305) {
                int var118 = field7103[--field7098];
                field7103[field7098++] = class660.field9273[var118];
                return;
            }
            if (arg0 == 3306) {
                int var119 = field7103[--field7098];
                field7103[field7098++] = class98.field1333[var119];
                return;
            }
            if (arg0 == 3307) {
                int var120 = field7103[--field7098];
                field7103[field7098++] = class658.field9261[var120];
                return;
            }
            if (arg0 == 3308) {
                byte var121 = class253.field3576.field520;
                int var122 = (class253.field3576.field509 >> 9) + class511.field6989;
                int var123 = (class253.field3576.field514 >> 9) + class124.field1726;
                field7103[field7098++] = (var121 << 28) + (var122 << 14) + var123;
                return;
            }
            if (arg0 == 3309) {
                int var124 = field7103[--field7098];
                field7103[field7098++] = var124 >> 14 & 0x3FFF;
                return;
            }
            if (arg0 == 3310) {
                int var125 = field7103[--field7098];
                field7103[field7098++] = var125 >> 28;
                return;
            }
            if (arg0 == 3311) {
                int var126 = field7103[--field7098];
                field7103[field7098++] = var126 & 0x3FFF;
                return;
            }
            if (arg0 == 3312) {
                field7103[field7098++] = class192.field2834 ? 1 : 0;
                return;
            }
            if (arg0 == 3313) {
                field7098 -= 2;
                int var127 = field7103[field7098];
                int var128 = field7103[field7098 + 1];
                field7103[field7098++] = class92.method682(var128, -65, var127, true);
                return;
            }
            if (arg0 == 3314) {
                field7098 -= 2;
                int var129 = field7103[field7098];
                int var130 = field7103[field7098 + 1];
                field7103[field7098++] = class535.method2959(var130, var129, true, 0);
                return;
            }
            if (arg0 == 3315) {
                field7098 -= 2;
                int var131 = field7103[field7098];
                int var132 = field7103[field7098 + 1];
                field7103[field7098++] = class496.method2770(var131, true, var132, -35);
                return;
            }
            if (arg0 == 3316) {
                if (class658.field9267 >= 2) {
                    field7103[field7098++] = class658.field9267;
                    return;
                }
                field7103[field7098++] = 0;
                return;
            }
            if (arg0 == 3317) {
                field7103[field7098++] = class77.field1062;
                return;
            }
            if (arg0 == 3318) {
                field7103[field7098++] = class195.field2887.field5522;
                return;
            }
            if (arg0 == 3321) {
                field7103[field7098++] = class144.field2137;
                return;
            }
            if (arg0 == 3322) {
                field7103[field7098++] = class420.field5943;
                return;
            }
            if (arg0 == 3323) {
                if (class186.field2754 >= 5 && class186.field2754 <= 9) {
                    field7103[field7098++] = 1;
                    return;
                }
                field7103[field7098++] = 0;
                return;
            }
            if (arg0 == 3324) {
                if (class186.field2754 >= 5 && class186.field2754 <= 9) {
                    field7103[field7098++] = class186.field2754;
                    return;
                }
                field7103[field7098++] = 0;
                return;
            }
            if (arg0 == 3325) {
                field7103[field7098++] = class206.field3037 ? 1 : 0;
                return;
            }
            if (arg0 == 3326) {
                field7103[field7098++] = class253.field3576.field3948;
                return;
            }
            if (arg0 == 3327) {
                field7103[field7098++] = class253.field3576.field3989.field253 ? 1 : 0;
                return;
            }
            if (arg0 == 3329) {
                field7103[field7098++] = class71.field977 ? 1 : 0;
                return;
            }
            if (arg0 == 3330) {
                int var133 = field7103[--field7098];
                field7103[field7098++] = class673.method3724(false, var133, true);
                return;
            }
            if (arg0 == 3331) {
                field7098 -= 2;
                int var134 = field7103[field7098];
                int var135 = field7103[field7098 + 1];
                field7103[field7098++] = class130.method907(var135, false, 0, var134, false);
                return;
            }
            if (arg0 == 3332) {
                field7098 -= 2;
                int var136 = field7103[field7098];
                int var137 = field7103[field7098 + 1];
                field7103[field7098++] = class130.method907(var137, false, 0, var136, true);
                return;
            }
            if (arg0 == 3333) {
                field7103[field7098++] = class208.field3075;
                return;
            }
            if (arg0 == 3335) {
                field7103[field7098++] = class666.field9377;
                return;
            }
            if (arg0 == 3336) {
                field7098 -= 4;
                int var138 = field7103[field7098];
                int var139 = field7103[field7098 + 1];
                int var140 = field7103[field7098 + 2];
                int var141 = field7103[field7098 + 3];
                int var142 = (var139 << 14) + var138;
                int var143 = (var140 << 28) + var142;
                int var144 = var141 + var143;
                field7103[field7098++] = var144;
                return;
            }
            if (arg0 == 3337) {
                field7103[field7098++] = class287.field3995;
                return;
            }
            if (arg0 == 3338) {
                field7103[field7098++] = class302.method1868(true);
                return;
            }
            if (arg0 == 3339) {
                field7103[field7098++] = class152.field2278 ? 1 : 0;
                return;
            }
            if (arg0 == 3340) {
                field7103[field7098++] = class368.field5268 ? 1 : 0;
                return;
            }
            if (arg0 == 3341) {
                field7103[field7098++] = class288.field4013 ? 1 : 0;
                return;
            }
            if (arg0 == 3342) {
                field7103[field7098++] = class46.field686.method70((byte) -90);
                return;
            }
            if (arg0 == 3343) {
                field7103[field7098++] = class46.field686.method66(74);
                return;
            }
            if (arg0 == 3344) {
                field7109[field7113++] = class534.method2955(-123);
                return;
            }
            if (arg0 == 3345) {
                field7109[field7113++] = class180.method1216(33);
                return;
            }
            if (arg0 == 3346) {
                field7103[field7098++] = class435.method2497((byte) -25);
                return;
            }
            if (arg0 == 3347) {
                field7103[field7098++] = class179.field2657;
                return;
            }
        } else if (arg0 < 3500) {
            if (arg0 == 3400) {
                field7098 -= 2;
                int var145 = field7103[field7098];
                int var146 = field7103[field7098 + 1];
                class312 var147 = class136.field1924.method680((byte) 56, var145);
                field7109[field7113++] = var147.method1915(var146, 107);
                return;
            }
            if (arg0 == 3408) {
                field7098 -= 4;
                int var148 = field7103[field7098];
                int var149 = field7103[field7098 + 1];
                int var150 = field7103[field7098 + 2];
                int var151 = field7103[field7098 + 3];
                class312 var152 = class136.field1924.method680((byte) 56, var150);
                if (var152.field4628 == var148 && var152.field4621 == var149) {
                    if (var149 == 115) {
                        field7109[field7113++] = var152.method1915(var151, 107);
                        return;
                    }
                    field7103[field7098++] = var152.method1919((byte) -91, var151);
                    return;
                }
                throw new RuntimeException("C3408-1");
            }
            if (arg0 == 3409) {
                field7098 -= 3;
                int var153 = field7103[field7098];
                int var154 = field7103[field7098 + 1];
                int var155 = field7103[field7098 + 2];
                if (var154 == -1) {
                    throw new RuntimeException("C3409-2");
                }
                class312 var156 = class136.field1924.method680((byte) 56, var154);
                if (var156.field4621 != var153) {
                    throw new RuntimeException("C3409-1");
                }
                field7103[field7098++] = var156.method1916(var155, 6) ? 1 : 0;
                return;
            }
            if (arg0 == 3410) {
                int var157 = field7103[--field7098];
                String var158 = field7109[--field7113];
                if (var157 == -1) {
                    throw new RuntimeException("C3410-2");
                }
                class312 var159 = class136.field1924.method680((byte) 56, var157);
                if (var159.field4621 != 's') {
                    throw new RuntimeException("C3410-1");
                }
                field7103[field7098++] = var159.method1917(101, var158) ? 1 : 0;
                return;
            }
            if (arg0 == 3411) {
                int var160 = field7103[--field7098];
                class312 var161 = class136.field1924.method680((byte) 56, var160);
                field7103[field7098++] = var161.field4630.method2057(0);
                return;
            }
        } else if (arg0 < 3700) {
            if (arg0 == 3600) {
                if (class539.field7312 == 0) {
                    field7103[field7098++] = -2;
                    return;
                }
                if (class539.field7312 == 1) {
                    field7103[field7098++] = -1;
                    return;
                }
                field7103[field7098++] = class372.field5293;
                return;
            }
            if (arg0 == 3601) {
                int var162 = field7103[--field7098];
                if (class539.field7312 == 2 && var162 < class372.field5293) {
                    field7109[field7113++] = class129.field1779[var162];
                    if (class460.field6515[var162] != null) {
                        field7109[field7113++] = class460.field6515[var162];
                        return;
                    }
                    field7109[field7113++] = "";
                    return;
                }
                field7109[field7113++] = "";
                field7109[field7113++] = "";
                return;
            }
            if (arg0 == 3602) {
                int var163 = field7103[--field7098];
                if (class539.field7312 == 2 && var163 < class372.field5293) {
                    field7103[field7098++] = class575.field7734[var163];
                    return;
                }
                field7103[field7098++] = 0;
                return;
            }
            if (arg0 == 3603) {
                int var164 = field7103[--field7098];
                if (class539.field7312 == 2 && var164 < class372.field5293) {
                    field7103[field7098++] = class633.field8868[var164];
                    return;
                }
                field7103[field7098++] = 0;
                return;
            }
            if (arg0 == 3604) {
                String var165 = field7109[--field7113];
                int var166 = field7103[--field7098];
                class38.method175(var165, var166, (byte) 76);
                return;
            }
            if (arg0 == 3605) {
                String var167 = field7109[--field7113];
                class684.method3772((byte) 107, var167);
                return;
            }
            if (arg0 == 3606) {
                String var168 = field7109[--field7113];
                class630.method3497(36067, var168);
                return;
            }
            if (arg0 == 3607) {
                String var169 = field7109[--field7113];
                class558.method3055(36, var169, false);
                return;
            }
            if (arg0 == 3608) {
                String var170 = field7109[--field7113];
                class550.method3024(121, var170);
                return;
            }
            if (arg0 == 3609) {
                String var171 = field7109[--field7113];
                if (var171.startsWith("<img=0>") || var171.startsWith("<img=1>")) {
                    var171 = var171.substring(7);
                }
                field7103[field7098++] = class396.method2255(var171, (byte) -62) ? 1 : 0;
                return;
            }
            if (arg0 == 3610) {
                int var172 = field7103[--field7098];
                if (class539.field7312 == 2 && var172 < class372.field5293) {
                    field7109[field7113++] = class653.field9224[var172];
                    return;
                }
                field7109[field7113++] = "";
                return;
            }
            if (arg0 == 3611) {
                if (class604.field8392 != null) {
                    field7109[field7113++] = class469.method2669(0, class604.field8392);
                    return;
                }
                field7109[field7113++] = "";
                return;
            }
            if (arg0 == 3612) {
                if (class604.field8392 != null) {
                    field7103[field7098++] = class473.field6605;
                    return;
                }
                field7103[field7098++] = 0;
                return;
            }
            if (arg0 == 3613) {
                int var173 = field7103[--field7098];
                if (class604.field8392 != null && var173 < class473.field6605) {
                    field7109[field7113++] = class623.field8674[var173].field5992;
                    return;
                }
                field7109[field7113++] = "";
                return;
            }
            if (arg0 == 3614) {
                int var174 = field7103[--field7098];
                if (class604.field8392 != null && var174 < class473.field6605) {
                    field7103[field7098++] = class623.field8674[var174].field5989;
                    return;
                }
                field7103[field7098++] = 0;
                return;
            }
            if (arg0 == 3615) {
                int var175 = field7103[--field7098];
                if (class604.field8392 != null && var175 < class473.field6605) {
                    field7103[field7098++] = class623.field8674[var175].field5993;
                    return;
                }
                field7103[field7098++] = 0;
                return;
            }
            if (arg0 == 3616) {
                field7103[field7098++] = class672.field9461;
                return;
            }
            if (arg0 == 3617) {
                String var176 = field7109[--field7113];
                class21.method110(-114, var176);
                return;
            }
            if (arg0 == 3618) {
                field7103[field7098++] = class474.field6628;
                return;
            }
            if (arg0 == 3619) {
                String var177 = field7109[--field7113];
                class3.method18((byte) 82, var177);
                return;
            }
            if (arg0 == 3620) {
                class507.method2821(true);
                return;
            }
            if (arg0 == 3621) {
                if (class539.field7312 == 0) {
                    field7103[field7098++] = -1;
                    return;
                }
                field7103[field7098++] = class261.field3711;
                return;
            }
            if (arg0 == 3622) {
                int var178 = field7103[--field7098];
                if (class539.field7312 != 0 && var178 < class261.field3711) {
                    field7109[field7113++] = client.field3854[var178];
                    if (class325.field4809[var178] != null) {
                        field7109[field7113++] = class325.field4809[var178];
                        return;
                    }
                    field7109[field7113++] = "";
                    return;
                }
                field7109[field7113++] = "";
                field7109[field7113++] = "";
                return;
            }
            if (arg0 == 3623) {
                String var179 = field7109[--field7113];
                if (var179.startsWith("<img=0>") || var179.startsWith("<img=1>")) {
                    var179 = var179.substring(7);
                }
                field7103[field7098++] = class250.method1545(true, var179) ? 1 : 0;
                return;
            }
            if (arg0 == 3624) {
                int var180 = field7103[--field7098];
                if (class623.field8674 != null && var180 < class473.field6605 && class623.field8674[var180].field5991.equalsIgnoreCase(class253.field3576.field3975)) {
                    field7103[field7098++] = 1;
                    return;
                }
                field7103[field7098++] = 0;
                return;
            }
            if (arg0 == 3625) {
                if (class85.field1176 != null) {
                    field7109[field7113++] = class85.field1176;
                    return;
                }
                field7109[field7113++] = "";
                return;
            }
            if (arg0 == 3626) {
                int var181 = field7103[--field7098];
                if (class604.field8392 != null && var181 < class473.field6605) {
                    field7109[field7113++] = class623.field8674[var181].field5988;
                    return;
                }
                field7109[field7113++] = "";
                return;
            }
            if (arg0 == 3627) {
                int var182 = field7103[--field7098];
                if (class539.field7312 == 2 && var182 >= 0 && var182 < class372.field5293) {
                    field7103[field7098++] = class264.field3748[var182] ? 1 : 0;
                    return;
                }
                field7103[field7098++] = 0;
                return;
            }
            if (arg0 == 3628) {
                String var183 = field7109[--field7113];
                if (var183.startsWith("<img=0>") || var183.startsWith("<img=1>")) {
                    var183 = var183.substring(7);
                }
                field7103[field7098++] = class258.method1592(var183, -17884);
                return;
            }
            if (arg0 == 3629) {
                field7103[field7098++] = class383.field5368;
                return;
            }
            if (arg0 == 3630) {
                String var184 = field7109[--field7113];
                class558.method3055(36, var184, true);
                return;
            }
            if (arg0 == 3631) {
                int var185 = field7103[--field7098];
                field7103[field7098++] = class357.field5121[var185] ? 1 : 0;
                return;
            }
            if (arg0 == 3632) {
                int var186 = field7103[--field7098];
                if (class604.field8392 != null && var186 < class473.field6605) {
                    field7109[field7113++] = class623.field8674[var186].field5991;
                    return;
                }
                field7109[field7113++] = "";
                return;
            }
            if (arg0 == 3633) {
                int var187 = field7103[--field7098];
                if (class539.field7312 != 0 && var187 < class261.field3711) {
                    field7109[field7113++] = class272.field3836[var187];
                    return;
                }
                field7109[field7113++] = "";
                return;
            }
        } else if (arg0 < 4000) {
            if (arg0 == 3903) {
                int var188 = field7103[--field7098];
                field7103[field7098++] = class152.field2277[var188].method602((byte) 56);
                return;
            }
            if (arg0 == 3904) {
                int var189 = field7103[--field7098];
                field7103[field7098++] = class152.field2277[var189].field1045;
                return;
            }
            if (arg0 == 3905) {
                int var190 = field7103[--field7098];
                field7103[field7098++] = class152.field2277[var190].field1047;
                return;
            }
            if (arg0 == 3906) {
                int var191 = field7103[--field7098];
                field7103[field7098++] = class152.field2277[var191].field1052;
                return;
            }
            if (arg0 == 3907) {
                int var192 = field7103[--field7098];
                field7103[field7098++] = class152.field2277[var192].field1048;
                return;
            }
            if (arg0 == 3908) {
                int var193 = field7103[--field7098];
                field7103[field7098++] = class152.field2277[var193].field1051;
                return;
            }
            if (arg0 == 3910) {
                int var194 = field7103[--field7098];
                int var195 = class152.field2277[var194].method601((byte) 102);
                field7103[field7098++] = var195 == 0 ? 1 : 0;
                return;
            }
            if (arg0 == 3911) {
                int var196 = field7103[--field7098];
                int var197 = class152.field2277[var196].method601((byte) 99);
                field7103[field7098++] = var197 == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 3912) {
                int var198 = field7103[--field7098];
                int var199 = class152.field2277[var198].method601((byte) 96);
                field7103[field7098++] = var199 == 5 ? 1 : 0;
                return;
            }
            if (arg0 == 3913) {
                int var200 = field7103[--field7098];
                int var201 = class152.field2277[var200].method601((byte) 105);
                field7103[field7098++] = var201 == 1 ? 1 : 0;
                return;
            }
        } else if (arg0 < 4100) {
            if (arg0 == 4000) {
                field7098 -= 2;
                int var202 = field7103[field7098];
                int var203 = field7103[field7098 + 1];
                field7103[field7098++] = var202 + var203;
                return;
            }
            if (arg0 == 4001) {
                field7098 -= 2;
                int var204 = field7103[field7098];
                int var205 = field7103[field7098 + 1];
                field7103[field7098++] = var204 - var205;
                return;
            }
            if (arg0 == 4002) {
                field7098 -= 2;
                int var206 = field7103[field7098];
                int var207 = field7103[field7098 + 1];
                field7103[field7098++] = var206 * var207;
                return;
            }
            if (arg0 == 4003) {
                field7098 -= 2;
                int var208 = field7103[field7098];
                int var209 = field7103[field7098 + 1];
                field7103[field7098++] = var208 / var209;
                return;
            }
            if (arg0 == 4004) {
                int var210 = field7103[--field7098];
                field7103[field7098++] = (int) (Math.random() * (double) var210);
                return;
            }
            if (arg0 == 4005) {
                int var211 = field7103[--field7098];
                field7103[field7098++] = (int) (Math.random() * (double) (var211 + 1));
                return;
            }
            if (arg0 == 4006) {
                field7098 -= 5;
                int var212 = field7103[field7098];
                int var213 = field7103[field7098 + 1];
                int var214 = field7103[field7098 + 2];
                int var215 = field7103[field7098 + 3];
                int var216 = field7103[field7098 + 4];
                field7103[field7098++] = (var213 - var212) * (var216 - var214) / (var215 - var214) + var212;
                return;
            }
            if (arg0 == 4007) {
                field7098 -= 2;
                long var217 = (long) field7103[field7098];
                long var219 = (long) field7103[field7098 + 1];
                field7103[field7098++] = (int) (var217 * var219 / 100L + var217);
                return;
            }
            if (arg0 == 4008) {
                field7098 -= 2;
                int var221 = field7103[field7098];
                int var222 = field7103[field7098 + 1];
                field7103[field7098++] = var221 | 0x1 << var222;
                return;
            }
            if (arg0 == 4009) {
                field7098 -= 2;
                int var223 = field7103[field7098];
                int var224 = field7103[field7098 + 1];
                field7103[field7098++] = var223 & -(0x1 << var224) - 1;
                return;
            }
            if (arg0 == 4010) {
                field7098 -= 2;
                int var225 = field7103[field7098];
                int var226 = field7103[field7098 + 1];
                field7103[field7098++] = (var225 & 0x1 << var226) == 0 ? 0 : 1;
                return;
            }
            if (arg0 == 4011) {
                field7098 -= 2;
                int var227 = field7103[field7098];
                int var228 = field7103[field7098 + 1];
                field7103[field7098++] = var227 % var228;
                return;
            }
            if (arg0 == 4012) {
                field7098 -= 2;
                int var229 = field7103[field7098];
                int var230 = field7103[field7098 + 1];
                if (var229 == 0) {
                    field7103[field7098++] = 0;
                    return;
                }
                field7103[field7098++] = (int) Math.pow((double) var229, (double) var230);
                return;
            }
            if (arg0 == 4013) {
                field7098 -= 2;
                int var231 = field7103[field7098];
                int var232 = field7103[field7098 + 1];
                if (var231 == 0) {
                    field7103[field7098++] = 0;
                    return;
                }
                if (var232 == 0) {
                    field7103[field7098++] = Integer.MAX_VALUE;
                    return;
                }
                field7103[field7098++] = (int) Math.pow((double) var231, 1.0D / (double) var232);
                return;
            }
            if (arg0 == 4014) {
                field7098 -= 2;
                int var233 = field7103[field7098];
                int var234 = field7103[field7098 + 1];
                field7103[field7098++] = var233 & var234;
                return;
            }
            if (arg0 == 4015) {
                field7098 -= 2;
                int var235 = field7103[field7098];
                int var236 = field7103[field7098 + 1];
                field7103[field7098++] = var235 | var236;
                return;
            }
            if (arg0 == 4016) {
                field7098 -= 2;
                int var237 = field7103[field7098];
                int var238 = field7103[field7098 + 1];
                field7103[field7098++] = var237 < var238 ? var237 : var238;
                return;
            }
            if (arg0 == 4017) {
                field7098 -= 2;
                int var239 = field7103[field7098];
                int var240 = field7103[field7098 + 1];
                field7103[field7098++] = var239 > var240 ? var239 : var240;
                return;
            }
            if (arg0 == 4018) {
                field7098 -= 3;
                long var241 = (long) field7103[field7098];
                long var243 = (long) field7103[field7098 + 1];
                long var245 = (long) field7103[field7098 + 2];
                field7103[field7098++] = (int) (var241 * var245 / var243);
                return;
            }
        } else if (arg0 < 4200) {
            if (arg0 == 4100) {
                String var247 = field7109[--field7113];
                int var248 = field7103[--field7098];
                field7109[field7113++] = var247 + var248;
                return;
            }
            if (arg0 == 4101) {
                field7113 -= 2;
                String var249 = field7109[field7113];
                String var250 = field7109[field7113 + 1];
                field7109[field7113++] = var249 + var250;
                return;
            }
            if (arg0 == 4102) {
                String var251 = field7109[--field7113];
                int var252 = field7103[--field7098];
                field7109[field7113++] = var251 + class150.method1055(true, var252, (byte) -118);
                return;
            }
            if (arg0 == 4103) {
                String var253 = field7109[--field7113];
                field7109[field7113++] = var253.toLowerCase();
                return;
            }
            if (arg0 == 4104) {
                field7109[field7113++] = method2891(field7103[--field7098]);
                return;
            }
            if (arg0 == 4105) {
                field7113 -= 2;
                String var254 = field7109[field7113];
                String var255 = field7109[field7113 + 1];
                if (class253.field3576.field3989 != null && class253.field3576.field3989.field253) {
                    field7109[field7113++] = var255;
                    return;
                }
                field7109[field7113++] = var254;
                return;
            }
            if (arg0 == 4106) {
                int var256 = field7103[--field7098];
                field7109[field7113++] = Integer.toString(var256);
                return;
            }
            if (arg0 == 4107) {
                field7113 -= 2;
                field7103[field7098++] = class691.method3801((byte) 74, class666.field9377, field7109[field7113 + 1], field7109[field7113]);
                return;
            }
            if (arg0 == 4108) {
                String var257 = field7109[--field7113];
                field7098 -= 2;
                int var258 = field7103[field7098];
                int var259 = field7103[field7098 + 1];
                class599 var260 = class205.method1362(22121, 0, class328.field4846, var259);
                field7103[field7098++] = var260.method3320(var257, var258, class656.field9239, 0);
                return;
            }
            if (arg0 == 4109) {
                String var261 = field7109[--field7113];
                field7098 -= 2;
                int var262 = field7103[field7098];
                int var263 = field7103[field7098 + 1];
                class599 var264 = class205.method1362(22121, 0, class328.field4846, var263);
                field7103[field7098++] = var264.method3318(-118, var261, var262, class656.field9239);
                return;
            }
            if (arg0 == 4110) {
                field7113 -= 2;
                String var265 = field7109[field7113];
                String var266 = field7109[field7113 + 1];
                if (field7103[--field7098] == 1) {
                    field7109[field7113++] = var265;
                    return;
                }
                field7109[field7113++] = var266;
                return;
            }
            if (arg0 == 4111) {
                String var267 = field7109[--field7113];
                field7109[field7113++] = class311.method1910(var267, true);
                return;
            }
            if (arg0 == 4112) {
                String var268 = field7109[--field7113];
                int var269 = field7103[--field7098];
                if (var269 == -1) {
                    throw new RuntimeException("null char");
                }
                field7109[field7113++] = var268 + (char) var269;
                return;
            }
            if (arg0 == 4113) {
                int var270 = field7103[--field7098];
                field7103[field7098++] = class261.method1596((char) var270, (byte) -43) ? 1 : 0;
                return;
            }
            if (arg0 == 4114) {
                int var271 = field7103[--field7098];
                field7103[field7098++] = class625.method3479(-66, (char) var271) ? 1 : 0;
                return;
            }
            if (arg0 == 4115) {
                int var272 = field7103[--field7098];
                field7103[field7098++] = class644.method3586((char) var272, 3) ? 1 : 0;
                return;
            }
            if (arg0 == 4116) {
                int var273 = field7103[--field7098];
                field7103[field7098++] = class82.method645((char) var273, false) ? 1 : 0;
                return;
            }
            if (arg0 == 4117) {
                String var274 = field7109[--field7113];
                if (var274 != null) {
                    field7103[field7098++] = var274.length();
                    return;
                }
                field7103[field7098++] = 0;
                return;
            }
            if (arg0 == 4118) {
                String var275 = field7109[--field7113];
                field7098 -= 2;
                int var276 = field7103[field7098];
                int var277 = field7103[field7098 + 1];
                field7109[field7113++] = var275.substring(var276, var277);
                return;
            }
            if (arg0 == 4119) {
                String var278 = field7109[--field7113];
                StringBuffer var279 = new StringBuffer(var278.length());
                boolean var280 = false;
                for (int var281 = 0; var281 < var278.length(); var281++) {
                    char var282 = var278.charAt(var281);
                    if (var282 == '<') {
                        var280 = true;
                    } else if (var282 == '>') {
                        var280 = false;
                    } else if (!var280) {
                        var279.append(var282);
                    }
                }
                field7109[field7113++] = var279.toString();
                return;
            }
            if (arg0 == 4120) {
                String var283 = field7109[--field7113];
                field7098 -= 2;
                int var284 = field7103[field7098];
                int var285 = field7103[field7098 + 1];
                field7103[field7098++] = var283.indexOf(var284, var285);
                return;
            }
            if (arg0 == 4121) {
                field7113 -= 2;
                String var286 = field7109[field7113];
                String var287 = field7109[field7113 + 1];
                int var288 = field7103[--field7098];
                field7103[field7098++] = var286.indexOf(var287, var288);
                return;
            }
            if (arg0 == 4122) {
                int var289 = field7103[--field7098];
                field7103[field7098++] = Character.toLowerCase((char) var289);
                return;
            }
            if (arg0 == 4123) {
                int var290 = field7103[--field7098];
                field7103[field7098++] = Character.toUpperCase((char) var290);
                return;
            }
            if (arg0 == 4124) {
                boolean var291 = field7103[--field7098] != 0;
                int var292 = field7103[--field7098];
                field7109[field7113++] = class161.method1122(0, (long) var292, -1, class666.field9377, var291);
                return;
            }
            if (arg0 == 4125) {
                String var293 = field7109[--field7113];
                int var294 = field7103[--field7098];
                class599 var295 = class205.method1362(22121, 0, class328.field4846, var294);
                field7103[field7098++] = var295.method3321((byte) -11, var293, class656.field9239);
                return;
            }
        } else if (arg0 < 4300) {
            if (arg0 == 4200) {
                int var296 = field7103[--field7098];
                field7109[field7113++] = class648.field9184.method3064(var296, -71).field3655;
                return;
            }
            if (arg0 == 4201) {
                field7098 -= 2;
                int var297 = field7103[field7098];
                int var298 = field7103[field7098 + 1];
                class257 var299 = class648.field9184.method3064(var297, -25);
                if (var298 >= 1 && var298 <= 5 && var299.field3654[var298 - 1] != null) {
                    field7109[field7113++] = var299.field3654[var298 - 1];
                    return;
                }
                field7109[field7113++] = "";
                return;
            }
            if (arg0 == 4202) {
                field7098 -= 2;
                int var300 = field7103[field7098];
                int var301 = field7103[field7098 + 1];
                class257 var302 = class648.field9184.method3064(var300, -104);
                if (var301 >= 1 && var301 <= 5 && var302.field3652[var301 - 1] != null) {
                    field7109[field7113++] = var302.field3652[var301 - 1];
                    return;
                }
                field7109[field7113++] = "";
                return;
            }
            if (arg0 == 4203) {
                int var303 = field7103[--field7098];
                field7103[field7098++] = class648.field9184.method3064(var303, -55).field3659;
                return;
            }
            if (arg0 == 4204) {
                int var304 = field7103[--field7098];
                field7103[field7098++] = class648.field9184.method3064(var304, -77).field3628 == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 4205) {
                int var305 = field7103[--field7098];
                class257 var306 = class648.field9184.method3064(var305, -64);
                if (var306.field3648 == -1 && var306.field3625 >= 0) {
                    field7103[field7098++] = var306.field3625;
                    return;
                }
                field7103[field7098++] = var305;
                return;
            }
            if (arg0 == 4206) {
                int var307 = field7103[--field7098];
                class257 var308 = class648.field9184.method3064(var307, -90);
                if (var308.field3648 >= 0 && var308.field3625 >= 0) {
                    field7103[field7098++] = var308.field3625;
                    return;
                }
                field7103[field7098++] = var307;
                return;
            }
            if (arg0 == 4207) {
                int var309 = field7103[--field7098];
                field7103[field7098++] = class648.field9184.method3064(var309, -57).field3611 ? 1 : 0;
                return;
            }
            if (arg0 == 4208) {
                field7098 -= 2;
                int var310 = field7103[field7098];
                int var311 = field7103[field7098 + 1];
                class374 var312 = class324.field4784.method2171((byte) -80, var311);
                if (var312.method2182(115)) {
                    field7109[field7113++] = class648.field9184.method3064(var310, -29).method1586(var311, -14419, var312.field5301);
                    return;
                }
                field7103[field7098++] = class648.field9184.method3064(var310, -126).method1580(false, var311, var312.field5300);
                return;
            }
            if (arg0 == 4209) {
                field7098 -= 2;
                int var313 = field7103[field7098];
                int var314 = field7103[field7098 + 1] - 1;
                class257 var315 = class648.field9184.method3064(var313, -51);
                if (var315.field3619 == var314) {
                    field7103[field7098++] = var315.field3671;
                    return;
                }
                if (var315.field3626 == var314) {
                    field7103[field7098++] = var315.field3636;
                    return;
                }
                field7103[field7098++] = -1;
                return;
            }
            if (arg0 == 4210) {
                String var316 = field7109[--field7113];
                int var317 = field7103[--field7098];
                class216.method1407(var316, var317 == 1, (byte) 75);
                field7103[field7098++] = class233.field3311;
                return;
            }
            if (arg0 == 4211) {
                if (class264.field3738 != null && class362.field5171 < class233.field3311) {
                    field7103[field7098++] = class264.field3738[class362.field5171++] & 0xFFFF;
                    return;
                }
                field7103[field7098++] = -1;
                return;
            }
            if (arg0 == 4212) {
                class362.field5171 = 0;
                return;
            }
            if (arg0 == 4214) {
                String var318 = field7109[--field7113];
                field7098 -= 3;
                int var319 = field7103[field7098];
                int var320 = field7103[field7098 + 1];
                int var321 = field7103[field7098 + 2];
                class46.method256(var321, var320, var319 == 1, (byte) 126, var318);
                field7103[field7098++] = class233.field3311;
                return;
            }
            if (arg0 == 4215) {
                field7113 -= 2;
                field7098 -= 2;
                String var322 = field7109[field7113];
                int var323 = field7103[field7098];
                int var324 = field7103[field7098 + 1];
                String var325 = field7109[field7113 + 1];
                class25.method120(var323 == 1, var324, var325, (byte) 93, var322);
                field7103[field7098++] = class233.field3311;
                return;
            }
        } else if (arg0 < 4400) {
            if (arg0 == 4300) {
                field7098 -= 2;
                int var326 = field7103[field7098];
                int var327 = field7103[field7098 + 1];
                class374 var328 = class324.field4784.method2171((byte) -80, var327);
                if (var328.method2182(115)) {
                    field7109[field7113++] = class648.field9185.method1493(var326, (byte) -71).method1117(var328.field5301, var327, (byte) 79);
                    return;
                }
                field7103[field7098++] = class648.field9185.method1493(var326, (byte) -71).method1123(var327, -22002, var328.field5300);
                return;
            }
        } else if (arg0 < 4500) {
            if (arg0 == 4400) {
                field7098 -= 2;
                int var329 = field7103[field7098];
                int var330 = field7103[field7098 + 1];
                class374 var331 = class324.field4784.method2171((byte) -80, var330);
                if (var331.method2182(115)) {
                    field7109[field7113++] = class164.field2499.method2013(var329, false).method3451(var330, var331.field5301, -25579);
                    return;
                }
                field7103[field7098++] = class164.field2499.method2013(var329, false).method3461(var330, -1, var331.field5300);
                return;
            }
        } else if (arg0 < 4600) {
            if (arg0 == 4500) {
                field7098 -= 2;
                int var332 = field7103[field7098];
                int var333 = field7103[field7098 + 1];
                class374 var334 = class324.field4784.method2171((byte) -80, var333);
                if (var334.method2182(115)) {
                    field7109[field7113++] = class146.field2170.method3761(var332, -17777).method3168(var334.field5301, var333, (byte) 3);
                    return;
                }
                field7103[field7098++] = class146.field2170.method3761(var332, -17777).method3167(var333, var334.field5300, (byte) 39);
                return;
            }
        } else if (arg0 < 4700 && arg0 == 4600) {
            int var335 = field7103[--field7098];
            class308 var336 = class310.field4615.method3018(var335, 32);
            if (var336.field4584 != null && var336.field4584.length > 0) {
                int var337 = 0;
                int var338 = var336.field4574[0];
                for (int var339 = 1; var339 < var336.field4584.length; var339++) {
                    if (var336.field4574[var339] > var338) {
                        var337 = var339;
                        var338 = var336.field4574[var339];
                    }
                }
                field7103[field7098++] = var336.field4584[var337];
                return;
            }
            field7103[field7098++] = var336.field4588;
            return;
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method2889(String arg0, int arg1) {
        if (class658.field9267 == 0 && !(!class451.field6295 || class440.field6198) || class71.field977) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class9.field181.method42(0, 19572))) {
            var3 = 0;
            arg0 = arg0.substring(class9.field181.method42(0, 19572).length());
        } else if (var2.startsWith(class9.field182.method42(0, 19572))) {
            var3 = 1;
            arg0 = arg0.substring(class9.field182.method42(0, 19572).length());
        } else if (var2.startsWith(class9.field183.method42(0, 19572))) {
            var3 = 2;
            arg0 = arg0.substring(class9.field183.method42(0, 19572).length());
        } else if (var2.startsWith(class9.field184.method42(0, 19572))) {
            var3 = 3;
            arg0 = arg0.substring(class9.field184.method42(0, 19572).length());
        } else if (var2.startsWith(class9.field185.method42(0, 19572))) {
            var3 = 4;
            arg0 = arg0.substring(class9.field185.method42(0, 19572).length());
        } else if (var2.startsWith(class9.field186.method42(0, 19572))) {
            var3 = 5;
            arg0 = arg0.substring(class9.field186.method42(0, 19572).length());
        } else if (var2.startsWith(class9.field187.method42(0, 19572))) {
            var3 = 6;
            arg0 = arg0.substring(class9.field187.method42(0, 19572).length());
        } else if (var2.startsWith(class9.field188.method42(0, 19572))) {
            var3 = 7;
            arg0 = arg0.substring(class9.field188.method42(0, 19572).length());
        } else if (var2.startsWith(class9.field189.method42(0, 19572))) {
            var3 = 8;
            arg0 = arg0.substring(class9.field189.method42(0, 19572).length());
        } else if (var2.startsWith(class9.field190.method42(0, 19572))) {
            var3 = 9;
            arg0 = arg0.substring(class9.field190.method42(0, 19572).length());
        } else if (var2.startsWith(class9.field191.method42(0, 19572))) {
            var3 = 10;
            arg0 = arg0.substring(class9.field191.method42(0, 19572).length());
        } else if (var2.startsWith(class9.field192.method42(0, 19572))) {
            var3 = 11;
            arg0 = arg0.substring(class9.field192.method42(0, 19572).length());
        } else if (class666.field9377 != 0) {
            if (var2.startsWith(class9.field181.method42(class666.field9377, 19572))) {
                var3 = 0;
                arg0 = arg0.substring(class9.field181.method42(class666.field9377, 19572).length());
            } else if (var2.startsWith(class9.field182.method42(class666.field9377, 19572))) {
                var3 = 1;
                arg0 = arg0.substring(class9.field182.method42(class666.field9377, 19572).length());
            } else if (var2.startsWith(class9.field183.method42(class666.field9377, 19572))) {
                var3 = 2;
                arg0 = arg0.substring(class9.field183.method42(class666.field9377, 19572).length());
            } else if (var2.startsWith(class9.field184.method42(class666.field9377, 19572))) {
                var3 = 3;
                arg0 = arg0.substring(class9.field184.method42(class666.field9377, 19572).length());
            } else if (var2.startsWith(class9.field185.method42(class666.field9377, 19572))) {
                var3 = 4;
                arg0 = arg0.substring(class9.field185.method42(class666.field9377, 19572).length());
            } else if (var2.startsWith(class9.field186.method42(class666.field9377, 19572))) {
                var3 = 5;
                arg0 = arg0.substring(class9.field186.method42(class666.field9377, 19572).length());
            } else if (var2.startsWith(class9.field187.method42(class666.field9377, 19572))) {
                var3 = 6;
                arg0 = arg0.substring(class9.field187.method42(class666.field9377, 19572).length());
            } else if (var2.startsWith(class9.field188.method42(class666.field9377, 19572))) {
                var3 = 7;
                arg0 = arg0.substring(class9.field188.method42(class666.field9377, 19572).length());
            } else if (var2.startsWith(class9.field189.method42(class666.field9377, 19572))) {
                var3 = 8;
                arg0 = arg0.substring(class9.field189.method42(class666.field9377, 19572).length());
            } else if (var2.startsWith(class9.field190.method42(class666.field9377, 19572))) {
                var3 = 9;
                arg0 = arg0.substring(class9.field190.method42(class666.field9377, 19572).length());
            } else if (var2.startsWith(class9.field191.method42(class666.field9377, 19572))) {
                var3 = 10;
                arg0 = arg0.substring(class9.field191.method42(class666.field9377, 19572).length());
            } else if (var2.startsWith(class9.field192.method42(class666.field9377, 19572))) {
                var3 = 11;
                arg0 = arg0.substring(class9.field192.method42(class666.field9377, 19572).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class9.field193.method42(0, 19572))) {
            var5 = 1;
            arg0 = arg0.substring(class9.field193.method42(0, 19572).length());
        } else if (var4.startsWith(class9.field194.method42(0, 19572))) {
            var5 = 2;
            arg0 = arg0.substring(class9.field194.method42(0, 19572).length());
        } else if (var4.startsWith(class9.field195.method42(0, 19572))) {
            var5 = 3;
            arg0 = arg0.substring(class9.field195.method42(0, 19572).length());
        } else if (var4.startsWith(class9.field196.method42(0, 19572))) {
            var5 = 4;
            arg0 = arg0.substring(class9.field196.method42(0, 19572).length());
        } else if (var4.startsWith(class9.field197.method42(0, 19572))) {
            var5 = 5;
            arg0 = arg0.substring(class9.field197.method42(0, 19572).length());
        } else if (class666.field9377 != 0) {
            if (var4.startsWith(class9.field193.method42(class666.field9377, 19572))) {
                var5 = 1;
                arg0 = arg0.substring(class9.field193.method42(class666.field9377, 19572).length());
            } else if (var4.startsWith(class9.field194.method42(class666.field9377, 19572))) {
                var5 = 2;
                arg0 = arg0.substring(class9.field194.method42(class666.field9377, 19572).length());
            } else if (var4.startsWith(class9.field195.method42(class666.field9377, 19572))) {
                var5 = 3;
                arg0 = arg0.substring(class9.field195.method42(class666.field9377, 19572).length());
            } else if (var4.startsWith(class9.field196.method42(class666.field9377, 19572))) {
                var5 = 4;
                arg0 = arg0.substring(class9.field196.method42(class666.field9377, 19572).length());
            } else if (var4.startsWith(class9.field197.method42(class666.field9377, 19572))) {
                var5 = 5;
                arg0 = arg0.substring(class9.field197.method42(class666.field9377, 19572).length());
            }
        }
        field7095++;
        class1.method5(1, class442.field6236);
        class288.field4014.method746((byte) -117, 0);
        int var6 = class288.field4014.field1301;
        class288.field4014.method746((byte) -109, var3);
        class288.field4014.method746((byte) -92, var5);
        class641.method3577(arg0, class288.field4014, -201);
        class288.field4014.method755(102, class288.field4014.field1301 - var6);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lad;)V")
    public static final void method2890(class388 arg0) {
        method2898(arg0, 200000);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)Ljava/lang/String;")
    private static final String method2891(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field7097.setTime(new Date(var1));
        int var3 = field7097.get(5);
        int var4 = field7097.get(2);
        int var5 = field7097.get(1);
        return var3 + "-" + field7120[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lmaa;II)V")
    public static final void method2892(class433 arg0, int arg1, int arg2) {
        class258 var3 = class608.method3363(arg2, arg1, arg0, (byte) 73);
        if (var3 == null) {
            return;
        }
        field7100 = new int[var3.field3686];
        field7093 = new String[var3.field3688];
        if (class226.field3253 == var3.field3687 || class509.field6972 == var3.field3687 || class605.field8429 == var3.field3687) {
            int var4 = 0;
            int var5 = 0;
            if (class31.field375 != null) {
                var4 = class31.field375.field2029;
                var5 = class31.field375.field2027;
            }
            field7100[0] = class46.field686.method70((byte) 113) - var4;
            field7100[1] = class46.field686.method66(74) - var5;
        }
        method2899(var3, 200000);
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(IZ)V")
    private static final void method2893(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field7103[field7098++] = class577.field7760;
                return;
            }
            if (arg0 == 5001) {
                field7098 -= 3;
                class577.field7760 = field7103[field7098];
                class434.field6141 = class413.method2355(115, field7103[field7098 + 1]);
                if (class434.field6141 == null) {
                    class434.field6141 = class186.field2740;
                }
                class628.field8773 = field7103[field7098 + 2];
                field7117++;
                class1.method5(1, class437.field6167);
                class288.field4014.method746((byte) -102, class577.field7760);
                class288.field4014.method746((byte) -96, class434.field6141.field8207);
                class288.field4014.method746((byte) -101, class628.field8773);
                return;
            }
            if (arg0 == 5002) {
                field7113 -= 2;
                String var2 = field7109[field7113];
                String var3 = field7109[field7113 + 1];
                field7098 -= 2;
                int var4 = field7103[field7098];
                int var5 = field7103[field7098 + 1];
                if (var3 == null) {
                    var3 = "";
                }
                if (var3.length() > 80) {
                    var3 = var3.substring(0, 80);
                }
                field7112++;
                class1.method5(1, class325.field4799);
                class288.field4014.method746((byte) -106, class499.method2790(var2, 118) + class499.method2790(var3, 113) + 2);
                class288.field4014.method708(-124, var2);
                class288.field4014.method746((byte) -107, var4 - 1);
                class288.field4014.method746((byte) -87, var5);
                class288.field4014.method708(110, var3);
                return;
            }
            if (arg0 == 5003) {
                int var6 = field7103[--field7098];
                class319 var7 = class525.method2919(0, var6);
                String var8 = "";
                if (var7 != null && var7.field4736 != null) {
                    var8 = var7.field4736;
                }
                field7109[field7113++] = var8;
                return;
            }
            if (arg0 == 5004) {
                int var9 = field7103[--field7098];
                class319 var10 = class525.method2919(0, var9);
                int var11 = -1;
                if (var10 != null) {
                    var11 = var10.field4735;
                }
                field7103[field7098++] = var11;
                return;
            }
            if (arg0 == 5005) {
                if (class434.field6141 == null) {
                    field7103[field7098++] = -1;
                    return;
                }
                field7103[field7098++] = class434.field6141.field8207;
                return;
            }
            if (arg0 == 5006) {
                int var12 = field7103[--field7098];
                class1.method5(1, class179.field2644);
                class288.field4014.method746((byte) -106, var12);
                return;
            }
            if (arg0 == 5008) {
                String var13 = field7109[--field7113];
                method2889(var13, arg0);
                return;
            }
            if (arg0 == 5009) {
                field7113 -= 2;
                String var14 = field7109[field7113];
                String var15 = field7109[field7113 + 1];
                if (class658.field9267 != 0 || (!class451.field6295 || class440.field6198) && !class71.field977) {
                    field7110++;
                    class1.method5(1, class465.field6543);
                    class288.field4014.method746((byte) -100, 0);
                    int var16 = class288.field4014.field1301;
                    class288.field4014.method708(-127, var14);
                    class641.method3577(var15, class288.field4014, -201);
                    class288.field4014.method755(101, class288.field4014.field1301 - var16);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var17 = field7103[--field7098];
                class319 var18 = class525.method2919(0, var17);
                String var19 = "";
                if (var18 != null && var18.field4725 != null) {
                    var19 = var18.field4725;
                }
                field7109[field7113++] = var19;
                return;
            }
            if (arg0 == 5011) {
                int var20 = field7103[--field7098];
                class319 var21 = class525.method2919(0, var20);
                String var22 = "";
                if (var21 != null && var21.field4730 != null) {
                    var22 = var21.field4730;
                }
                field7109[field7113++] = var22;
                return;
            }
            if (arg0 == 5012) {
                int var23 = field7103[--field7098];
                class319 var24 = class525.method2919(0, var23);
                int var25 = -1;
                if (var24 != null) {
                    var25 = var24.field4733;
                }
                field7103[field7098++] = var25;
                return;
            }
            if (arg0 == 5015) {
                String var26;
                if (class253.field3576 == null || class253.field3576.field3986 == null) {
                    var26 = class592.field8248;
                } else {
                    var26 = class253.field3576.method1717(true, (byte) 119);
                }
                field7109[field7113++] = var26;
                return;
            }
            if (arg0 == 5016) {
                field7103[field7098++] = class628.field8773;
                return;
            }
            if (arg0 == 5017) {
                field7103[field7098++] = class389.method2236(34067);
                return;
            }
            if (arg0 == 5018) {
                int var27 = field7103[--field7098];
                class319 var28 = class525.method2919(0, var27);
                int var29 = 0;
                if (var28 != null) {
                    var29 = var28.field4731;
                }
                field7103[field7098++] = var29;
                return;
            }
            if (arg0 == 5019) {
                int var30 = field7103[--field7098];
                class319 var31 = class525.method2919(0, var30);
                String var32 = "";
                if (var31 != null && var31.field4732 != null) {
                    var32 = var31.field4732;
                }
                field7109[field7113++] = var32;
                return;
            }
            if (arg0 == 5020) {
                String var33;
                if (class253.field3576 == null || class253.field3576.field3986 == null) {
                    var33 = class592.field8248;
                } else {
                    var33 = class253.field3576.method1720(false, false);
                }
                field7109[field7113++] = var33;
                return;
            }
            if (arg0 == 5023) {
                int var34 = field7103[--field7098];
                class319 var35 = class525.method2919(0, var34);
                int var36 = -1;
                if (var35 != null) {
                    var36 = var35.field4724;
                }
                field7103[field7098++] = var36;
                return;
            }
            if (arg0 == 5024) {
                int var37 = field7103[--field7098];
                class319 var38 = class525.method2919(0, var37);
                int var39 = -1;
                if (var38 != null) {
                    var39 = var38.field4737;
                }
                field7103[field7098++] = var39;
                return;
            }
            if (arg0 == 5025) {
                int var40 = field7103[--field7098];
                class319 var41 = class525.method2919(0, var40);
                String var42 = "";
                if (var41 != null && var41.field4727 != null) {
                    var42 = var41.field4727;
                }
                field7109[field7113++] = var42;
                return;
            }
            if (arg0 == 5050) {
                int var43 = field7103[--field7098];
                field7109[field7113++] = class587.field8204.method905(var43, (byte) -65).field5972;
                return;
            }
            if (arg0 == 5051) {
                int var44 = field7103[--field7098];
                class424 var45 = class587.field8204.method905(var44, (byte) -65);
                if (var45.field5984 == null) {
                    field7103[field7098++] = 0;
                    return;
                }
                field7103[field7098++] = var45.field5984.length;
                return;
            }
            if (arg0 == 5052) {
                field7098 -= 2;
                int var46 = field7103[field7098];
                int var47 = field7103[field7098 + 1];
                class424 var48 = class587.field8204.method905(var46, (byte) -65);
                int var49 = var48.field5984[var47];
                field7103[field7098++] = var49;
                return;
            }
            if (arg0 == 5053) {
                int var50 = field7103[--field7098];
                class424 var51 = class587.field8204.method905(var50, (byte) -65);
                if (var51.field5979 == null) {
                    field7103[field7098++] = 0;
                    return;
                }
                field7103[field7098++] = var51.field5979.length;
                return;
            }
            if (arg0 == 5054) {
                field7098 -= 2;
                int var52 = field7103[field7098];
                int var53 = field7103[field7098 + 1];
                field7103[field7098++] = class587.field8204.method905(var52, (byte) -65).field5979[var53];
                return;
            }
            if (arg0 == 5055) {
                int var54 = field7103[--field7098];
                field7109[field7113++] = class609.field8469.method77(var54, 13529).method3719((byte) -123);
                return;
            }
            if (arg0 == 5056) {
                int var55 = field7103[--field7098];
                class672 var56 = class609.field8469.method77(var55, 13529);
                if (var56.field9459 == null) {
                    field7103[field7098++] = 0;
                    return;
                }
                field7103[field7098++] = var56.field9459.length;
                return;
            }
            if (arg0 == 5057) {
                field7098 -= 2;
                int var57 = field7103[field7098];
                int var58 = field7103[field7098 + 1];
                field7103[field7098++] = class609.field8469.method77(var57, 13529).field9459[var58];
                return;
            }
            if (arg0 == 5058) {
                field7096 = new class115();
                field7096.field1540 = field7103[--field7098];
                field7096.field1541 = class609.field8469.method77(field7096.field1540, 13529);
                field7096.field1545 = new int[field7096.field1541.method3722(0)];
                return;
            }
            if (arg0 == 5059) {
                field7108++;
                class1.method5(1, class644.field9147);
                class288.field4014.method746((byte) -102, 0);
                int var59 = class288.field4014.field1301;
                class288.field4014.method746((byte) -98, 0);
                class288.field4014.method731(-2045573048, field7096.field1540);
                field7096.field1541.method3714(field7096.field1545, -1, class288.field4014);
                class288.field4014.method755(127, class288.field4014.field1301 - var59);
                return;
            }
            if (arg0 == 5060) {
                String var60 = field7109[--field7113];
                field7106++;
                class1.method5(1, class674.field9484);
                class288.field4014.method746((byte) -103, 0);
                int var61 = class288.field4014.field1301;
                class288.field4014.method708(63, var60);
                class288.field4014.method731(-2045573048, field7096.field1540);
                field7096.field1541.method3714(field7096.field1545, -1, class288.field4014);
                class288.field4014.method755(95, class288.field4014.field1301 - var61);
                return;
            }
            if (arg0 == 5061) {
                field7108++;
                class1.method5(1, class644.field9147);
                class288.field4014.method746((byte) -122, 0);
                int var62 = class288.field4014.field1301;
                class288.field4014.method746((byte) -111, 1);
                class288.field4014.method731(-2045573048, field7096.field1540);
                field7096.field1541.method3714(field7096.field1545, -1, class288.field4014);
                class288.field4014.method755(120, class288.field4014.field1301 - var62);
                return;
            }
            if (arg0 == 5062) {
                field7098 -= 2;
                int var63 = field7103[field7098];
                int var64 = field7103[field7098 + 1];
                field7103[field7098++] = class587.field8204.method905(var63, (byte) -65).field5974[var64];
                return;
            }
            if (arg0 == 5063) {
                field7098 -= 2;
                int var65 = field7103[field7098];
                int var66 = field7103[field7098 + 1];
                field7103[field7098++] = class587.field8204.method905(var65, (byte) -65).field5978[var66];
                return;
            }
            if (arg0 == 5064) {
                field7098 -= 2;
                int var67 = field7103[field7098];
                int var68 = field7103[field7098 + 1];
                if (var68 == -1) {
                    field7103[field7098++] = -1;
                    return;
                }
                field7103[field7098++] = class587.field8204.method905(var67, (byte) -65).method2407((char) var68, 0);
                return;
            }
            if (arg0 == 5065) {
                field7098 -= 2;
                int var69 = field7103[field7098];
                int var70 = field7103[field7098 + 1];
                if (var70 == -1) {
                    field7103[field7098++] = -1;
                    return;
                }
                field7103[field7098++] = class587.field8204.method905(var69, (byte) -65).method2408((char) var70, 121);
                return;
            }
            if (arg0 == 5066) {
                int var71 = field7103[--field7098];
                field7103[field7098++] = class609.field8469.method77(var71, 13529).method3722(0);
                return;
            }
            if (arg0 == 5067) {
                field7098 -= 2;
                int var72 = field7103[field7098];
                int var73 = field7103[field7098 + 1];
                int var74 = class609.field8469.method77(var72, 13529).method3715(var73, (byte) -105).field1423;
                field7103[field7098++] = var74;
                return;
            }
            if (arg0 == 5068) {
                field7098 -= 2;
                int var75 = field7103[field7098];
                int var76 = field7103[field7098 + 1];
                field7096.field1545[var75] = var76;
                return;
            }
            if (arg0 == 5069) {
                field7098 -= 2;
                int var77 = field7103[field7098];
                int var78 = field7103[field7098 + 1];
                field7096.field1545[var77] = var78;
                return;
            }
            if (arg0 == 5070) {
                field7098 -= 3;
                int var79 = field7103[field7098];
                int var80 = field7103[field7098 + 1];
                int var81 = field7103[field7098 + 2];
                class672 var82 = class609.field8469.method77(var79, 13529);
                if (var82.method3715(var80, (byte) -95).field1423 != 0) {
                    throw new RuntimeException("bad command");
                }
                field7103[field7098++] = var82.method3721(var81, 7446, var80);
                return;
            }
            if (arg0 == 5071) {
                String var83 = field7109[--field7113];
                boolean var84 = field7103[--field7098] == 1;
                class362.method2121(var84, var83, true);
                field7103[field7098++] = class233.field3311;
                return;
            }
            if (arg0 == 5072) {
                if (class264.field3738 != null && class362.field5171 < class233.field3311) {
                    field7103[field7098++] = class264.field3738[class362.field5171++] & 0xFFFF;
                    return;
                }
                field7103[field7098++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class362.field5171 = 0;
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class531.field7246.method666(50, 86)) {
                    field7103[field7098++] = 1;
                    return;
                }
                field7103[field7098++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class531.field7246.method666(50, 82)) {
                    field7103[field7098++] = 1;
                    return;
                }
                field7103[field7098++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class531.field7246.method666(50, 81)) {
                    field7103[field7098++] = 1;
                    return;
                }
                field7103[field7098++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class516.method2869(field7103[--field7098], -16651);
                return;
            }
            if (arg0 == 5201) {
                field7103[field7098++] = class126.method895(37);
                return;
            }
            if (arg0 == 5205) {
                class20.method102(-1, false, field7103[--field7098], 17143, -1);
                return;
            }
            if (arg0 == 5206) {
                int var85 = field7103[--field7098];
                class213 var86 = class148.method1027(var85 >> 14 & 0x3FFF, var85 & 0x3FFF);
                if (var86 == null) {
                    field7103[field7098++] = -1;
                    return;
                }
                field7103[field7098++] = var86.field3110;
                return;
            }
            if (arg0 == 5207) {
                class213 var87 = class148.method1030(field7103[--field7098]);
                if (var87 != null && var87.field3119 != null) {
                    field7109[field7113++] = var87.field3119;
                    return;
                }
                field7109[field7113++] = "";
                return;
            }
            if (arg0 == 5208) {
                field7103[field7098++] = class313.field4640;
                field7103[field7098++] = class674.field9483;
                return;
            }
            if (arg0 == 5209) {
                field7103[field7098++] = class306.field4504 + class148.field2208;
                field7103[field7098++] = class480.field6695 + class148.field2206;
                return;
            }
            if (arg0 == 5210) {
                int var88 = field7103[--field7098];
                class213 var89 = class148.method1030(var88);
                if (var89 == null) {
                    field7103[field7098++] = 0;
                    field7103[field7098++] = 0;
                    return;
                }
                field7103[field7098++] = var89.field3123 >> 14 & 0x3FFF;
                field7103[field7098++] = var89.field3123 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var90 = field7103[--field7098];
                class213 var91 = class148.method1030(var90);
                if (var91 == null) {
                    field7103[field7098++] = 0;
                    field7103[field7098++] = 0;
                    return;
                }
                field7103[field7098++] = var91.field3121 - var91.field3108;
                field7103[field7098++] = var91.field3125 - var91.field3111;
                return;
            }
            if (arg0 == 5212) {
                class209 var92 = class159.method1101(-127);
                if (var92 == null) {
                    field7103[field7098++] = -1;
                    field7103[field7098++] = -1;
                    return;
                }
                field7103[field7098++] = var92.field3086;
                int var93 = var92.field3082 << 28 | class148.field2208 + var92.field3081 << 14 | class148.field2206 + var92.field3085;
                field7103[field7098++] = var93;
                return;
            }
            if (arg0 == 5213) {
                class209 var94 = class509.method2834((byte) 102);
                if (var94 == null) {
                    field7103[field7098++] = -1;
                    field7103[field7098++] = -1;
                    return;
                }
                field7103[field7098++] = var94.field3086;
                int var95 = var94.field3082 << 28 | class148.field2208 + var94.field3081 << 14 | class148.field2206 + var94.field3085;
                field7103[field7098++] = var95;
                return;
            }
            if (arg0 == 5214) {
                int var96 = field7103[--field7098];
                class213 var97 = class482.method2725((byte) -125);
                if (var97 != null) {
                    boolean var98 = var97.method1396(var96 & 0x3FFF, (byte) 106, var96 >> 28 & 0x3, field7119, var96 >> 14 & 0x3FFF);
                    if (var98) {
                        class189.method1258(field7119[2], (byte) 110, field7119[1]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field7098 -= 2;
                int var99 = field7103[field7098];
                int var100 = field7103[field7098 + 1];
                class649 var101 = class148.method1040(var99 >> 14 & 0x3FFF, var99 & 0x3FFF);
                boolean var102 = false;
                for (class213 var103 = (class213) var101.method3611(255); var103 != null; var103 = (class213) var101.method3610(-30295)) {
                    if (var103.field3110 == var100) {
                        var102 = true;
                        break;
                    }
                }
                if (var102) {
                    field7103[field7098++] = 1;
                    return;
                }
                field7103[field7098++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var104 = field7103[--field7098];
                class213 var105 = class148.method1030(var104);
                if (var105 == null) {
                    field7103[field7098++] = -1;
                    return;
                }
                field7103[field7098++] = var105.field3109;
                return;
            }
            if (arg0 == 5220) {
                field7103[field7098++] = class160.field2400 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var106 = field7103[--field7098];
                class189.method1258(var106 & 0x3FFF, (byte) 95, var106 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class213 var107 = class482.method2725((byte) -124);
                if (var107 != null) {
                    boolean var108 = var107.method1397(class306.field4504 + class148.field2208, class480.field6695 + class148.field2206, field7119, 0);
                    if (var108) {
                        field7103[field7098++] = field7119[1];
                        field7103[field7098++] = field7119[2];
                        return;
                    }
                    field7103[field7098++] = -1;
                    field7103[field7098++] = -1;
                    return;
                }
                field7103[field7098++] = -1;
                field7103[field7098++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field7098 -= 2;
                int var109 = field7103[field7098];
                int var110 = field7103[field7098 + 1];
                class20.method102(var110 & 0x3FFF, false, var109, 17143, var110 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5224) {
                int var111 = field7103[--field7098];
                class213 var112 = class482.method2725((byte) -108);
                if (var112 != null) {
                    boolean var113 = var112.method1396(var111 & 0x3FFF, (byte) 118, var111 >> 28 & 0x3, field7119, var111 >> 14 & 0x3FFF);
                    if (var113) {
                        field7103[field7098++] = field7119[1];
                        field7103[field7098++] = field7119[2];
                        return;
                    }
                    field7103[field7098++] = -1;
                    field7103[field7098++] = -1;
                    return;
                }
                field7103[field7098++] = -1;
                field7103[field7098++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var114 = field7103[--field7098];
                class213 var115 = class482.method2725((byte) -106);
                if (var115 != null) {
                    boolean var116 = var115.method1397(var114 >> 14 & 0x3FFF, var114 & 0x3FFF, field7119, 0);
                    if (var116) {
                        field7103[field7098++] = field7119[1];
                        field7103[field7098++] = field7119[2];
                        return;
                    }
                    field7103[field7098++] = -1;
                    field7103[field7098++] = -1;
                    return;
                }
                field7103[field7098++] = -1;
                field7103[field7098++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class486.method2738((byte) -61, field7103[--field7098]);
                return;
            }
            if (arg0 == 5227) {
                field7098 -= 2;
                int var117 = field7103[field7098];
                int var118 = field7103[field7098 + 1];
                class20.method102(var118 & 0x3FFF, true, var117, 17143, var118 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5228) {
                class387.field5437 = field7103[--field7098] == 1;
                return;
            }
            if (arg0 == 5229) {
                field7103[field7098++] = class387.field5437 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var119 = field7103[--field7098];
                class493.method2758(true, var119);
                return;
            }
            if (arg0 == 5231) {
                field7098 -= 2;
                int var120 = field7103[field7098];
                boolean var121 = field7103[field7098 + 1] == 1;
                if (class638.field9060 != null) {
                    class539 var122 = class638.field9060.method2061(-17305, (long) var120);
                    if (var122 != null && !var121) {
                        var122.method2971(1);
                        return;
                    }
                    if (var122 == null && var121) {
                        class539 var123 = new class539();
                        class638.field9060.method2063((long) var120, 1, var123);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var124 = field7103[--field7098];
                if (class638.field9060 != null) {
                    class539 var125 = class638.field9060.method2061(-17305, (long) var124);
                    field7103[field7098++] = var125 == null ? 0 : 1;
                    return;
                }
                field7103[field7098++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field7098 -= 2;
                int var126 = field7103[field7098];
                boolean var127 = field7103[field7098 + 1] == 1;
                if (class278.field3897 != null) {
                    class539 var128 = class278.field3897.method2061(-17305, (long) var126);
                    if (var128 != null && !var127) {
                        var128.method2971(1);
                        return;
                    }
                    if (var128 == null && var127) {
                        class539 var129 = new class539();
                        class278.field3897.method2063((long) var126, 1, var129);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var130 = field7103[--field7098];
                if (class278.field3897 != null) {
                    class539 var131 = class278.field3897.method2061(-17305, (long) var130);
                    field7103[field7098++] = var131 == null ? 0 : 1;
                    return;
                }
                field7103[field7098++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field7103[field7098++] = class148.field2178 == null ? -1 : class148.field2178.field3110;
                return;
            }
            if (arg0 == 5236) {
                field7098 -= 2;
                int var132 = field7103[field7098];
                int var133 = field7103[field7098 + 1];
                int var134 = var133 >> 14 & 0x3FFF;
                int var135 = var133 & 0x3FFF;
                int var136 = class522.method2884(var134, var135, true, var132);
                if (var136 < 0) {
                    field7103[field7098++] = -1;
                    return;
                }
                field7103[field7098++] = var136;
                return;
            }
            if (arg0 == 5237) {
                class18.method95(-60);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field7098 -= 2;
                int var137 = field7103[field7098];
                int var138 = field7103[field7098 + 1];
                class679.method3752(3, false, var138, (byte) -107, var137);
                field7103[field7098++] = class164.field2504 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class164.field2504 != null) {
                    class679.method3752(class274.field3872.field917, false, -1, (byte) -101, -1);
                }
                return;
            }
            if (arg0 == 5302) {
                class18[] var139 = class325.method1968(0);
                field7103[field7098++] = var139.length;
                return;
            }
            if (arg0 == 5303) {
                int var140 = field7103[--field7098];
                class18[] var141 = class325.method1968(0);
                field7103[field7098++] = var141[var140].field271;
                field7103[field7098++] = var141[var140].field270;
                return;
            }
            if (arg0 == 5305) {
                int var142 = class274.field3872.field912;
                int var143 = class274.field3872.field886;
                int var144 = -1;
                class18[] var145 = class325.method1968(0);
                for (int var146 = 0; var146 < var145.length; var146++) {
                    class18 var147 = var145[var146];
                    if (var147.field271 == var142 && var147.field270 == var143) {
                        var144 = var146;
                        break;
                    }
                }
                field7103[field7098++] = var144;
                return;
            }
            if (arg0 == 5306) {
                field7103[field7098++] = class402.method2292(true);
                return;
            }
            if (arg0 == 5307) {
                int var148 = field7103[--field7098];
                if (var148 >= 1 && var148 <= 2) {
                    class679.method3752(var148, false, -1, (byte) -120, -1);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field7103[field7098++] = class274.field3872.field917;
                return;
            }
            if (arg0 == 5309) {
                int var149 = field7103[--field7098];
                if (var149 >= 1 && var149 <= 2) {
                    class274.field3872.field917 = var149;
                    class274.field3872.method2439(-2, class503.field6878);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field7113 -= 2;
                String var150 = field7109[field7113];
                String var151 = field7109[field7113 + 1];
                int var152 = field7103[--field7098];
                field7116++;
                class1.method5(1, class324.field4790);
                class288.field4014.method746((byte) -111, class499.method2790(var150, 110) + class499.method2790(var151, 124) + 1);
                class288.field4014.method708(28, var150);
                class288.field4014.method708(-124, var151);
                class288.field4014.method746((byte) -106, var152);
                return;
            }
            if (arg0 == 5401) {
                field7098 -= 2;
                class349.field5023[field7103[field7098]] = (short) class549.method3016((byte) 121, field7103[field7098 + 1]);
                class648.field9184.method3054(119);
                class648.field9184.method3053(124);
                class648.field9185.method1490(-122);
                class336.method2026(100);
                return;
            }
            if (arg0 == 5405) {
                field7098 -= 2;
                int var153 = field7103[field7098];
                int var154 = field7103[field7098 + 1];
                if (var153 >= 0 && var153 < 2) {
                    class645.field9155[var153] = new int[var154 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field7098 -= 7;
                int var155 = field7103[field7098];
                int var156 = field7103[field7098 + 1] << 1;
                int var157 = field7103[field7098 + 2];
                int var158 = field7103[field7098 + 3];
                int var159 = field7103[field7098 + 4];
                int var160 = field7103[field7098 + 5];
                int var161 = field7103[field7098 + 6];
                if (var155 >= 0 && var155 < 2 && class645.field9155[var155] != null && var156 >= 0 && var156 < class645.field9155[var155].length) {
                    class645.field9155[var155][var156] = new int[] { (var157 >> 14 & 0x3FFF) << 9, var158 << 2, (var157 & 0x3FFF) << 9, var161 };
                    class645.field9155[var155][var156 + 1] = new int[] { (var159 >> 14 & 0x3FFF) << 9, var160 << 2, (var159 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var162 = class645.field9155[field7103[--field7098]].length >> 1;
                field7103[field7098++] = var162;
                return;
            }
            if (arg0 == 5411) {
                if (class164.field2504 != null) {
                    class679.method3752(class274.field3872.field917, false, -1, (byte) -106, -1);
                }
                if (class166.field2513 != null) {
                    class603.method3342(503);
                    System.exit(0);
                    return;
                }
                String var163 = class662.field9337 == null ? class635.method3529(false) : class662.field9337;
                class106.method803(false, var163, class429.field6020 == 1, class503.field6878, false);
                return;
            }
            if (arg0 == 5419) {
                String var164 = "";
                if (class124.field1708 != null) {
                    if (class124.field1708.field3706 == null) {
                        var164 = class378.method2193(class124.field1708.field3701, 255);
                    } else {
                        var164 = (String) class124.field1708.field3706;
                    }
                }
                field7109[field7113++] = var164;
                return;
            }
            if (arg0 == 5420) {
                field7103[field7098++] = class503.field6878.field1084 ? 0 : 1;
                return;
            }
            if (arg0 == 5421) {
                if (class164.field2504 != null) {
                    class679.method3752(class274.field3872.field917, false, -1, (byte) -111, -1);
                }
                String var165 = field7109[--field7113];
                boolean var166 = field7103[--field7098] == 1;
                String var167 = class635.method3529(false) + var165;
                class106.method803(var166, var167, class429.field6020 == 1, class503.field6878, false);
                return;
            }
            if (arg0 == 5422) {
                field7113 -= 2;
                String var168 = field7109[field7113];
                String var169 = field7109[field7113 + 1];
                int var170 = field7103[--field7098];
                if (var168.length() > 0) {
                    if (class52.field750 == null) {
                        class52.field750 = new String[class34.field402[class158.field2374.field9181]];
                    }
                    class52.field750[var170] = var168;
                }
                if (var169.length() > 0) {
                    if (class72.field986 == null) {
                        class72.field986 = new String[class34.field402[class158.field2374.field9181]];
                    }
                    class72.field986[var170] = var169;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field7109[--field7113]);
                return;
            }
            if (arg0 == 5424) {
                field7098 -= 11;
                class599.field8327 = field7103[field7098];
                class19.field279 = field7103[field7098 + 1];
                class327.field4832 = field7103[field7098 + 2];
                class584.field8161 = field7103[field7098 + 3];
                class374.field5297 = field7103[field7098 + 4];
                class301.field4466 = field7103[field7098 + 5];
                class490.field6778 = field7103[field7098 + 6];
                class423.field5967 = field7103[field7098 + 7];
                class169.field2549 = field7103[field7098 + 8];
                class318.field4718 = field7103[field7098 + 9];
                class371.field5283 = field7103[field7098 + 10];
                class460.field6517.method947(108, class374.field5297);
                class460.field6517.method947(125, class301.field4466);
                class460.field6517.method947(-75, class490.field6778);
                class460.field6517.method947(95, class423.field5967);
                class460.field6517.method947(-96, class169.field2549);
                class302.field4470 = null;
                class181.field2675 = null;
                class491.field6788 = null;
                class168.field2538 = null;
                class232.field3300 = null;
                class208.field3076 = null;
                class535.field7289 = null;
                class427.field6006 = null;
                class36.field450 = true;
                return;
            }
            if (arg0 == 5425) {
                class517.method2877(-2127751325);
                class36.field450 = false;
                return;
            }
            if (arg0 == 5426) {
                field7098 -= 2;
                class651.field9213 = field7103[field7098];
                class258.field3691 = field7103[field7098 + 1];
                return;
            }
            if (arg0 == 5427) {
                field7098 -= 2;
                class299.field4461 = field7103[field7098 + 1];
                return;
            }
            if (arg0 == 5428) {
                field7098 -= 2;
                int var171 = field7103[field7098];
                int var172 = field7103[field7098 + 1];
                field7103[field7098++] = class264.method1605(17, var172, var171) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class693.method3806(false, field7109[--field7113], false, 4);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class2.method11("accountcreated", class188.field2779, 21190);
                    return;
                } catch (Throwable var300) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class2.method11("accountcreatestarted", class188.field2779, 21190);
                    return;
                } catch (Throwable var301) {
                    return;
                }
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field7098 -= 4;
                int var173 = field7103[field7098];
                int var174 = field7103[field7098 + 1];
                int var175 = field7103[field7098 + 2];
                int var176 = field7103[field7098 + 3];
                class289.method1742(false, var175, (var173 & 0x3FFF) - class124.field1726, -83, var176, var174 << 2, (var173 >> 14 & 0x3FFF) - class511.field6989);
                return;
            }
            if (arg0 == 5501) {
                field7098 -= 4;
                int var177 = field7103[field7098];
                int var178 = field7103[field7098 + 1];
                int var179 = field7103[field7098 + 2];
                int var180 = field7103[field7098 + 3];
                class11.method53(var179, (byte) 83, (var177 >> 14 & 0x3FFF) - class511.field6989, var178 << 2, (var177 & 0x3FFF) - class124.field1726, var180);
                return;
            }
            if (arg0 == 5502) {
                field7098 -= 6;
                int var181 = field7103[field7098];
                if (var181 >= 2) {
                    throw new RuntimeException();
                }
                class24.field326 = var181;
                int var182 = field7103[field7098 + 1];
                if (var182 + 1 >= class645.field9155[class24.field326].length >> 1) {
                    throw new RuntimeException();
                }
                class673.field9480 = var182;
                class670.field9446 = 0;
                class677.field9550 = field7103[field7098 + 2];
                class136.field1926 = field7103[field7098 + 3];
                int var183 = field7103[field7098 + 4];
                if (var183 >= 2) {
                    throw new RuntimeException();
                }
                class292.field4398 = var183;
                int var184 = field7103[field7098 + 5];
                if (var184 + 1 >= class645.field9155[class292.field4398].length >> 1) {
                    throw new RuntimeException();
                }
                class17.field244 = var184;
                class670.field9445 = 3;
                return;
            }
            if (arg0 == 5503) {
                class539.method2968(114);
                return;
            }
            if (arg0 == 5504) {
                field7098 -= 2;
                class498.method2787(true, 0, field7103[field7098], field7103[field7098 + 1]);
                return;
            }
            if (arg0 == 5505) {
                field7103[field7098++] = (int) class249.field3516 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field7103[field7098++] = (int) class646.field9167 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class605.method3352((byte) 88);
                return;
            }
            if (arg0 == 5508) {
                class514.method2854((byte) -121);
                return;
            }
            if (arg0 == 5509) {
                class418.method2384(63);
                return;
            }
            if (arg0 == 5510) {
                class218.method1410(14715);
                return;
            }
            if (arg0 == 5511) {
                int var185 = field7103[--field7098];
                int var186 = var185 >> 14 & 0x3FFF;
                int var187 = var185 & 0x3FFF;
                int var188 = var186 - class511.field6989;
                if (var188 < 0) {
                    var188 = 0;
                } else if (var188 >= class86.field1185) {
                    var188 = class86.field1185;
                }
                int var189 = var187 - class124.field1726;
                if (var189 < 0) {
                    var189 = 0;
                } else if (var189 >= class526.field7212) {
                    var189 = class526.field7212;
                }
                class264.field3734 = (var188 << 9) + 256;
                class30.field363 = (var189 << 9) + 256;
                class670.field9445 = 4;
                return;
            }
            if (arg0 == 5512) {
                class669.method3709(125);
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field7113 -= 2;
                String var190 = field7109[field7113];
                String var191 = field7109[field7113 + 1];
                int var192 = field7103[--field7098];
                if (class340.field4947 != 3) {
                    return;
                }
                if (class471.field6576 == 0 && class595.field8273 == 0) {
                    class592.field8248 = var190;
                    class374.field5302 = var191;
                    class208.field3075 = var192;
                    class94.method690(6, (byte) 125);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class206.method1364(-7);
                return;
            }
            if (arg0 == 5602) {
                if (class471.field6576 == 0) {
                    class678.field9556 = -2;
                    class448.field6268 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field7098 -= 4;
                if (class340.field4947 != 3) {
                    return;
                }
                if (class471.field6576 == 0 && class595.field8273 == 0) {
                    class167.method1153(field7103[field7098 + 2], field7103[field7098 + 3], field7103[field7098 + 1], false, field7103[field7098]);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field7113--;
                if (class340.field4947 != 3) {
                    return;
                }
                if (class471.field6576 == 0 && class595.field8273 == 0) {
                    class342.method2049(class482.method2727(12544, field7109[field7113]), (byte) 123);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field7113 -= 2;
                if (class340.field4947 != 3) {
                    return;
                }
                if (class471.field6576 == 0 && class595.field8273 == 0) {
                    class27.method128(class482.method2727(12544, field7109[field7113]), 19995, field7109[field7113 + 1], false);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class595.field8273 == 0) {
                    class17.field262 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field7103[field7098++] = class448.field6268;
                return;
            }
            if (arg0 == 5608) {
                field7103[field7098++] = class632.field8849;
                return;
            }
            if (arg0 == 5609) {
                field7103[field7098++] = class17.field262;
                return;
            }
            if (arg0 == 5610) {
                for (int var193 = 0; var193 < 5; var193++) {
                    field7109[field7113++] = class14.field222.length > var193 ? class469.method2669(0, class14.field222[var193]) : "";
                }
                class14.field222 = null;
                return;
            }
            if (arg0 == 5611) {
                field7103[field7098++] = class31.field368;
                return;
            }
            if (arg0 == 5612) {
                int var194 = field7103[--field7098];
                if (class340.field4947 != 7) {
                    return;
                }
                if (class471.field6576 == 0 && class595.field8273 == 0) {
                    if (class53.field758 != null) {
                        class53.field758.method3127(102);
                        class53.field758 = null;
                    }
                    class208.field3075 = var194;
                    class94.method690(9, (byte) 125);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field7103[field7098++] = class448.field6268;
                return;
            }
            if (arg0 == 5615) {
                field7113 -= 2;
                String var195 = field7109[field7113];
                String var196 = field7109[field7113 + 1];
                if (class340.field4947 != 3) {
                    return;
                }
                if (class471.field6576 == 0 && class595.field8273 == 0) {
                    if (class53.field758 != null) {
                        class53.field758.method3127(-91);
                        class53.field758 = null;
                    }
                    class592.field8248 = var195;
                    class374.field5302 = var196;
                    class94.method690(5, (byte) 125);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class528.method2930(false, 2);
                return;
            }
            if (arg0 == 5617) {
                field7103[field7098++] = class678.field9556;
                return;
            }
            if (arg0 == 5618) {
                int var197 = field7103[--field7098];
                class105.method797(var197, false, -1934);
                return;
            }
            if (arg0 == 5619) {
                int var198 = field7103[--field7098];
                class105.method797(var198, true, -1934);
                return;
            }
            if (arg0 == 5620) {
                class208.method1374(-31847);
                if (class683.field9609 != "" && class683.field9609 != "") {
                    field7103[field7098++] = 1;
                    return;
                }
                field7103[field7098++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field7113 -= 2;
                if (class340.field4947 != 3) {
                    return;
                }
                if (class471.field6576 == 0 && class595.field8273 == 0) {
                    class27.method128(class482.method2727(12544, field7109[field7113]), 19995, field7109[field7113 + 1], true);
                    return;
                }
                return;
            }
            if (arg0 == 5622) {
                class260 var199 = class503.field6878.method628(14, "3", false);
                while (var199.field3702 == 0) {
                    class419.method2390(37, 1L);
                }
                if (var199.field3702 == 2) {
                    throw new RuntimeException("Error opening file");
                }
                class124 var200 = (class124) var199.field3706;
                if (var200.method878(0).exists()) {
                    class96 var201 = new class96(50);
                    try {
                        var200.method880(var201.field1316, 1, 0, 50);
                    } catch (IOException var303) {
                    }
                }
                try {
                    var200.method886(true);
                    return;
                } catch (Exception var302) {
                    return;
                }
            }
            if (arg0 == 5623) {
                if (class690.field9699 != null) {
                    field7103[field7098++] = 1;
                    return;
                }
                field7103[field7098++] = 0;
                return;
            }
            if (arg0 == 5624) {
                field7103[field7098++] = (int) (class531.field7245 >> 32);
                field7103[field7098++] = (int) (class531.field7245 & 0xFFFFL);
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var202 = field7103[--field7098];
                if (var202 < 1) {
                    var202 = 1;
                }
                if (var202 > 4) {
                    var202 = 4;
                }
                class274.field3872.field889 = var202;
                class70.method572(16912);
                class274.field3872.method2439(-2, class503.field6878);
                class471.field6573 = false;
                return;
            }
            if (arg0 == 6002) {
                class274.field3872.method2438(field7103[--field7098] == 1, (byte) 121);
                class70.method572(16912);
                class640.method3569((byte) -22);
                class274.field3872.method2439(-2, class503.field6878);
                class471.field6573 = false;
                return;
            }
            if (arg0 == 6003) {
                class274.field3872.field910 = field7103[--field7098] == 1;
                class640.method3569((byte) -48);
                class274.field3872.method2439(-2, class503.field6878);
                class471.field6573 = false;
                return;
            }
            if (arg0 == 6005) {
                class274.field3872.field916 = field7103[--field7098] == 1;
                class70.method572(16912);
                class274.field3872.method2439(-2, class503.field6878);
                class471.field6573 = false;
                return;
            }
            if (arg0 == 6006) {
                class274.field3872.field880 = field7103[--field7098] == 1;
                class630.field8790.method422(!class274.field3872.field880);
                class274.field3872.method2439(-2, class503.field6878);
                class471.field6573 = false;
                return;
            }
            if (arg0 == 6007) {
                class274.field3872.field893 = field7103[--field7098];
                class274.field3872.method2439(-2, class503.field6878);
                class471.field6573 = false;
                return;
            }
            if (arg0 == 6008) {
                class274.field3872.field900 = field7103[--field7098] == 1;
                class274.field3872.method2439(-2, class503.field6878);
                class471.field6573 = false;
                return;
            }
            if (arg0 == 6009) {
                class274.field3872.field887 = field7103[--field7098] == 1;
                class70.method572(16912);
                class274.field3872.method2439(-2, class503.field6878);
                class471.field6573 = false;
                return;
            }
            if (arg0 == 6010) {
                class274.field3872.field881 = field7103[--field7098] == 1;
                class274.field3872.method2439(-2, class503.field6878);
                class471.field6573 = false;
                return;
            }
            if (arg0 == 6011) {
                int var203 = field7103[--field7098];
                if (var203 < 0 || var203 > 2) {
                    var203 = 0;
                }
                class274.field3872.method544(class429.field6020, var203, (byte) -72);
                class70.method572(16912);
                class274.field3872.method2439(-2, class503.field6878);
                class471.field6573 = false;
                return;
            }
            if (arg0 == 6012) {
                class274.field3872.method542((byte) -9, class429.field6020, field7103[--field7098] == 1);
                class68.method553((byte) 72);
                class353.method2098((byte) -101);
                class274.field3872.method2439(-2, class503.field6878);
                class471.field6573 = false;
                return;
            }
            if (arg0 == 6014) {
                class274.field3872.field884 = field7103[--field7098] == 1;
                class70.method572(16912);
                class274.field3872.method2439(-2, class503.field6878);
                class471.field6573 = false;
                return;
            }
            if (arg0 == 6015) {
                class274.field3872.field902 = field7103[--field7098] == 1;
                class70.method572(16912);
                class274.field3872.method2439(-2, class503.field6878);
                class471.field6573 = false;
                return;
            }
            if (arg0 == 6016) {
                int var204 = field7103[--field7098];
                if (var204 < 0 || var204 > 2) {
                    var204 = 0;
                }
                class274.field3872.field899 = var204;
                class339.method2033(class429.field6020, -28863);
                class274.field3872.method2439(-2, class503.field6878);
                return;
            }
            if (arg0 == 6017) {
                class274.field3872.field879 = field7103[--field7098] == 1;
                class492.method2754(21486);
                class274.field3872.method2439(-2, class503.field6878);
                class471.field6573 = false;
                return;
            }
            if (arg0 == 6018) {
                int var205 = field7103[--field7098];
                if (var205 < 0) {
                    var205 = 0;
                }
                if (var205 > 127) {
                    var205 = 127;
                }
                class274.field3872.field896 = var205;
                class274.field3872.method2439(-2, class503.field6878);
                class471.field6573 = false;
                return;
            }
            if (arg0 == 6019) {
                int var206 = field7103[--field7098];
                if (var206 < 0) {
                    var206 = 0;
                }
                if (var206 > 255) {
                    var206 = 255;
                }
                if (class274.field3872.field906 != var206) {
                    if (class274.field3872.field906 == 0 && class623.field8670 != -1) {
                        class103.method791(false, class623.field8670, 0, class74.field1027, var206, false);
                        class267.field3792 = false;
                    } else if (var206 == 0) {
                        class634.method3526((byte) 112);
                        class267.field3792 = false;
                    } else {
                        class678.method3744(0, var206);
                    }
                    class274.field3872.field906 = var206;
                }
                class274.field3872.method2439(-2, class503.field6878);
                class471.field6573 = false;
                return;
            }
            if (arg0 == 6020) {
                int var207 = field7103[--field7098];
                if (var207 < 0) {
                    var207 = 0;
                }
                if (var207 > 127) {
                    var207 = 127;
                }
                class274.field3872.field905 = var207;
                class274.field3872.method2439(-2, class503.field6878);
                class471.field6573 = false;
                return;
            }
            if (arg0 == 6021) {
                class274.field3872.field6046 = field7103[--field7098] == 1;
                class640.method3569((byte) -19);
                return;
            }
            if (arg0 == 6023) {
                int var208 = field7103[--field7098];
                boolean var209 = false;
                if (var208 < 0) {
                    var208 = 0;
                }
                if (var208 > 2) {
                    var208 = 2;
                }
                if (class202.field2968 < 96) {
                    var208 = 0;
                    var209 = true;
                }
                class18.method97(0, var208);
                class274.field3872.method2439(-2, class503.field6878);
                class471.field6573 = false;
                field7103[field7098++] = var209 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var210 = field7103[--field7098];
                if (var210 < 0 || var210 > 2) {
                    var210 = 0;
                }
                class274.field3872.field875 = var210;
                class274.field3872.method2439(-2, class503.field6878);
                return;
            }
            if (arg0 == 6025) {
                int var211 = field7103[--field7098];
                if (var211 < 0 || var211 > class65.method523(class202.field2968, 510558785)) {
                    var211 = 0;
                }
                class274.field3872.field913 = var211;
                class274.field3872.method2439(-2, class503.field6878);
                class471.field6573 = false;
                return;
            }
            if (arg0 == 6027) {
                int var212 = field7103[--field7098];
                if (var212 < 0 || var212 > 1) {
                    var212 = 0;
                }
                class590.method3276(var212 == 1, 1);
                return;
            }
            if (arg0 == 6028) {
                class274.field3872.field894 = field7103[--field7098] != 0;
                class274.field3872.method2439(-2, class503.field6878);
                return;
            }
            if (arg0 == 6029) {
                class274.field3872.field893 = field7103[--field7098];
                class274.field3872.method2439(-2, class503.field6878);
                return;
            }
            if (arg0 == 6030) {
                class274.field3872.field876 = field7103[--field7098] != 0;
                class274.field3872.method2439(-2, class503.field6878);
                class70.method572(16912);
                return;
            }
            if (arg0 == 6031) {
                int var213 = field7103[--field7098];
                if (var213 < 0 || var213 > 5) {
                    var213 = 2;
                }
                class339.method2033(var213, -28863);
                return;
            }
            if (arg0 == 6032) {
                int var214 = field7103[--field7098];
                if (var214 < 0 || var214 > 5) {
                    var214 = 2;
                }
                class274.field3872.field898 = var214;
                class274.field3872.method2439(-2, class503.field6878);
                class471.field6573 = false;
                return;
            }
            if (arg0 == 6033) {
                int var215 = field7103[--field7098];
                if (var215 < 0 || var215 > 4) {
                    var215 = 2;
                }
                class274.field3872.field883 = var215;
                class274.field3872.method2439(-2, class503.field6878);
                return;
            }
            if (arg0 == 6034) {
                class274.field3872.field885 = field7103[--field7098] == 1;
                class274.field3872.method2439(-2, class503.field6878);
                class68.method553((byte) 85);
                class471.field6573 = false;
                return;
            }
            if (arg0 == 6035) {
                class274.field3872.field6052 = field7103[--field7098] == 1;
                class70.method572(16912);
                class640.method3569((byte) -33);
                return;
            }
            if (arg0 == 6036) {
                int var216 = field7103[--field7098];
                if (var216 < 0 || var216 > 2) {
                    var216 = 0;
                }
                class274.field3872.method2448((byte) -68, var216);
                class274.field3872.method2439(-2, class503.field6878);
                return;
            }
            if (arg0 == 6037) {
                int var217 = field7103[--field7098];
                if (var217 < 0) {
                    var217 = 0;
                }
                if (var217 > 127) {
                    var217 = 127;
                }
                class274.field3872.field909 = var217;
                class274.field3872.method2439(-2, class503.field6878);
                class471.field6573 = false;
                return;
            }
            if (arg0 == 6038) {
                int var218 = field7103[--field7098];
                if (var218 < 0) {
                    var218 = 0;
                }
                if (var218 > 255) {
                    var218 = 255;
                }
                if (class274.field3872.field877 != var218 && class623.field8670 == class318.field4720) {
                    if (class274.field3872.field877 == 0) {
                        class103.method791(false, class623.field8670, 0, class74.field1027, var218, false);
                        class267.field3792 = false;
                    } else if (var218 == 0) {
                        class634.method3526((byte) 112);
                        class267.field3792 = false;
                    } else {
                        class678.method3744(0, var218);
                    }
                }
                class274.field3872.field877 = var218;
                class274.field3872.method2439(-2, class503.field6878);
                class471.field6573 = false;
                return;
            }
            if (arg0 == 6039) {
                int var219 = field7103[--field7098];
                if (var219 > 255 || var219 < 0) {
                    var219 = 0;
                }
                if (class274.field3872.field878 != var219) {
                    class274.field3872.field878 = var219;
                    class274.field3872.method2439(-2, class503.field6878);
                    class471.field6573 = false;
                }
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field7103[field7098++] = class274.field3872.field889;
                return;
            }
            if (arg0 == 6102) {
                field7103[field7098++] = class274.field3872.method2437((byte) -90, class429.field6020) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field7103[field7098++] = class274.field3872.field910 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field7103[field7098++] = class274.field3872.field916 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field7103[field7098++] = class274.field3872.field880 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field7103[field7098++] = class274.field3872.field893;
                return;
            }
            if (arg0 == 6108) {
                field7103[field7098++] = class274.field3872.field900 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field7103[field7098++] = class274.field3872.field887 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field7103[field7098++] = class274.field3872.field881 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field7103[field7098++] = class274.field3872.method543(class429.field6020, (byte) 20);
                return;
            }
            if (arg0 == 6112) {
                field7103[field7098++] = class274.field3872.method546((byte) -110, class429.field6020) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field7103[field7098++] = class274.field3872.field884 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field7103[field7098++] = class274.field3872.field902 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field7103[field7098++] = class274.field3872.field899;
                return;
            }
            if (arg0 == 6117) {
                field7103[field7098++] = class274.field3872.field879 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field7103[field7098++] = class274.field3872.field896;
                return;
            }
            if (arg0 == 6119) {
                field7103[field7098++] = class274.field3872.field906;
                return;
            }
            if (arg0 == 6120) {
                field7103[field7098++] = class274.field3872.field905;
                return;
            }
            if (arg0 == 6121) {
                field7103[field7098++] = class630.field8790.method476() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field7103[field7098++] = class274.method1669(-106);
                return;
            }
            if (arg0 == 6124) {
                field7103[field7098++] = class274.field3872.field875;
                return;
            }
            if (arg0 == 6125) {
                field7103[field7098++] = class274.field3872.field913;
                return;
            }
            if (arg0 == 6126) {
                field7103[field7098++] = class630.field8790.method436() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field7103[field7098++] = class274.field3872.field882 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field7103[field7098++] = class274.field3872.field894 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field7103[field7098++] = class274.field3872.field893;
                return;
            }
            if (arg0 == 6130) {
                field7103[field7098++] = class274.field3872.field876 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field7103[field7098++] = class429.field6020;
                return;
            }
            if (arg0 == 6132) {
                field7103[field7098++] = class274.field3872.field898;
                return;
            }
            if (arg0 == 6133) {
                field7103[field7098++] = class503.field6878.field1084 && !class503.field6878.field1090 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field7103[field7098++] = class65.method523(class202.field2968, 510558785);
                return;
            }
            if (arg0 == 6135) {
                field7103[field7098++] = class274.field3872.field883;
                return;
            }
            if (arg0 == 6136) {
                field7103[field7098++] = class274.field3872.field885 ? 1 : 0;
                return;
            }
            if (arg0 == 6137) {
                boolean var220 = true;
                try {
                    var220 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                } catch (Throwable var304) {
                }
                field7103[field7098++] = var220 ? 1 : 0;
                return;
            }
            if (arg0 == 6138) {
                field7103[field7098++] = class179.method1211(200, class429.field6020, 93);
                return;
            }
            if (arg0 == 6139) {
                field7103[field7098++] = class274.field3872.method2435(true, class429.field6020);
                return;
            }
            if (arg0 == 6140) {
                byte var221 = 0;
                if (class514.method2857(class429.field6020, (byte) -21) && class202.field2968 < 96) {
                    var221 = 1;
                }
                field7103[field7098++] = var221;
                return;
            }
            if (arg0 == 6141) {
                if (class202.field2968 < 96) {
                    field7103[field7098++] = 0;
                    return;
                }
                field7103[field7098++] = 2;
                return;
            }
            if (arg0 == 6142) {
                field7103[field7098++] = class274.field3872.field909;
                return;
            }
            if (arg0 == 6143) {
                field7103[field7098++] = class274.field3872.field877;
                return;
            }
            if (arg0 == 6144) {
                field7103[field7098++] = class622.field8657 ? 1 : 0;
                return;
            }
            if (arg0 == 6145) {
                field7103[field7098++] = class274.field3872.field878;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field7098 -= 2;
                class247.field3510 = (short) field7103[field7098];
                if (class247.field3510 <= 0) {
                    class247.field3510 = 256;
                }
                class219.field3174 = (short) field7103[field7098 + 1];
                if (class219.field3174 <= 0) {
                    class219.field3174 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field7098 -= 2;
                class590.field8217 = (short) field7103[field7098];
                if (class590.field8217 <= 0) {
                    class590.field8217 = 256;
                }
                class576.field7742 = (short) field7103[field7098 + 1];
                if (class576.field7742 <= 0) {
                    class576.field7742 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field7098 -= 4;
                class396.field5505 = (short) field7103[field7098];
                if (class396.field5505 <= 0) {
                    class396.field5505 = 1;
                }
                class53.field755 = (short) field7103[field7098 + 1];
                if (class53.field755 <= 0) {
                    class53.field755 = 32767;
                } else if (class53.field755 < class396.field5505) {
                    class53.field755 = class396.field5505;
                }
                class3.field17 = (short) field7103[field7098 + 2];
                if (class3.field17 <= 0) {
                    class3.field17 = 1;
                }
                class228.field3273 = (short) field7103[field7098 + 3];
                if (class228.field3273 <= 0) {
                    class228.field3273 = 32767;
                    return;
                }
                if (class228.field3273 < class3.field17) {
                    class228.field3273 = class3.field17;
                }
                return;
            }
            if (arg0 == 6203) {
                class663.method3673(class548.field7417.field2121, 0, false, -20189, 0, class548.field7417.field2082);
                field7103[field7098++] = class689.field9696;
                field7103[field7098++] = class440.field6200;
                return;
            }
            if (arg0 == 6204) {
                field7103[field7098++] = class590.field8217;
                field7103[field7098++] = class576.field7742;
                return;
            }
            if (arg0 == 6205) {
                field7103[field7098++] = class247.field3510;
                field7103[field7098++] = class219.field3174;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field7103[field7098++] = (int) (class680.method3756(-102) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field7103[field7098++] = (int) (class680.method3756(-120) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field7098 -= 3;
                int var222 = field7103[field7098];
                int var223 = field7103[field7098 + 1];
                int var224 = field7103[field7098 + 2];
                field7097.clear();
                field7097.set(11, 12);
                field7097.set(var224, var223, var222);
                int var225 = (int) (field7097.getTime().getTime() / 86400000L) - 11745;
                if (var224 < 1970) {
                    var225--;
                }
                field7103[field7098++] = var225;
                return;
            }
            if (arg0 == 6303) {
                field7097.clear();
                field7097.setTime(new Date(class680.method3756(-104)));
                field7103[field7098++] = field7097.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var226 = field7103[--field7098];
                boolean var227 = true;
                if (var226 < 0) {
                    var227 = (var226 + 1) % 4 == 0;
                } else if (var226 < 1582) {
                    var227 = var226 % 4 == 0;
                } else if (var226 % 4 != 0) {
                    var227 = false;
                } else if (var226 % 100 != 0) {
                    var227 = true;
                } else if (var226 % 400 != 0) {
                    var227 = false;
                }
                field7103[field7098++] = var227 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field7103[field7098++] = class210.method1383(22) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field7103[field7098++] = class102.method784(101) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class340.field4947 == 7 && class471.field6576 == 0 && class595.field8273 == 0) {
                    if (class37.field501) {
                        field7103[field7098++] = 0;
                        return;
                    }
                    if (class166.field2514 > class680.method3756(-93) - 1000L) {
                        field7103[field7098++] = 1;
                        return;
                    }
                    class37.field501 = true;
                    class1.method5(1, class271.field3829);
                    class288.field4014.method741(class440.field6204, (byte) 27);
                    field7103[field7098++] = 0;
                    return;
                }
                field7103[field7098++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class233 var228 = class466.method2668(-125);
                if (var228 != null) {
                    field7103[field7098++] = var228.field3304;
                    field7103[field7098++] = var228.field1952;
                    field7109[field7113++] = var228.field3313;
                    class621 var229 = var228.method1472(29356);
                    field7103[field7098++] = var229.field8653;
                    field7109[field7113++] = var229.field8654;
                    field7103[field7098++] = var228.field1947;
                    field7103[field7098++] = var228.field3307;
                    field7109[field7113++] = var228.field3308;
                    return;
                }
                field7103[field7098++] = -1;
                field7103[field7098++] = 0;
                field7109[field7113++] = "";
                field7103[field7098++] = 0;
                field7109[field7113++] = "";
                field7103[field7098++] = 0;
                field7103[field7098++] = 0;
                field7109[field7113++] = "";
                return;
            }
            if (arg0 == 6502) {
                class233 var230 = class640.method3567((byte) -69);
                if (var230 != null) {
                    field7103[field7098++] = var230.field3304;
                    field7103[field7098++] = var230.field1952;
                    field7109[field7113++] = var230.field3313;
                    class621 var231 = var230.method1472(29356);
                    field7103[field7098++] = var231.field8653;
                    field7109[field7113++] = var231.field8654;
                    field7103[field7098++] = var230.field1947;
                    field7103[field7098++] = var230.field3307;
                    field7109[field7113++] = var230.field3308;
                    return;
                }
                field7103[field7098++] = -1;
                field7103[field7098++] = 0;
                field7109[field7113++] = "";
                field7103[field7098++] = 0;
                field7109[field7113++] = "";
                field7103[field7098++] = 0;
                field7103[field7098++] = 0;
                field7109[field7113++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var232 = field7103[--field7098];
                String var233 = field7109[--field7113];
                if (class340.field4947 == 7 && class471.field6576 == 0 && class595.field8273 == 0) {
                    field7103[field7098++] = class328.method1994((byte) -104, var232, var233) ? 1 : 0;
                    return;
                }
                field7103[field7098++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class274.field3872.field914 = field7103[--field7098];
                class274.field3872.method2439(-2, class503.field6878);
                return;
            }
            if (arg0 == 6505) {
                field7103[field7098++] = class274.field3872.field914;
                return;
            }
            if (arg0 == 6506) {
                int var234 = field7103[--field7098];
                class233 var235 = class145.method1016((byte) -118, var234);
                if (var235 != null) {
                    field7103[field7098++] = var235.field1952;
                    field7109[field7113++] = var235.field3313;
                    class621 var236 = var235.method1472(29356);
                    field7103[field7098++] = var236.field8653;
                    field7109[field7113++] = var236.field8654;
                    field7103[field7098++] = var235.field1947;
                    field7103[field7098++] = var235.field3307;
                    field7109[field7113++] = var235.field3308;
                    return;
                }
                field7103[field7098++] = -1;
                field7109[field7113++] = "";
                field7103[field7098++] = 0;
                field7109[field7113++] = "";
                field7103[field7098++] = 0;
                field7103[field7098++] = 0;
                field7109[field7113++] = "";
                return;
            }
            if (arg0 == 6507) {
                field7098 -= 4;
                int var237 = field7103[field7098];
                boolean var238 = field7103[field7098 + 1] == 1;
                int var239 = field7103[field7098 + 2];
                boolean var240 = field7103[field7098 + 3] == 1;
                class344.method2051((byte) -121, var239, var237, var240, var238);
                return;
            }
            if (arg0 == 6508) {
                class74.method591(-91);
                return;
            }
            if (arg0 == 6509) {
                if (class340.field4947 != 7) {
                    return;
                }
                class91.field1211 = field7103[--field7098] == 1;
                return;
            }
            if (arg0 == 6510) {
                field7103[field7098++] = class677.field9552;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class274.field3872.field874 = field7103[--field7098] == 1;
                class274.field3872.method2439(-2, class503.field6878);
                return;
            }
            if (arg0 == 6601) {
                field7103[field7098++] = class274.field3872.field874 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class463.field6523 == class318.field4722) {
            if (arg0 == 6700) {
                int var241 = class368.field5262.method2057(0);
                if (class677.field9551 != -1) {
                    var241++;
                }
                field7103[field7098++] = var241;
                return;
            }
            if (arg0 == 6701) {
                int var242 = field7103[--field7098];
                if (class677.field9551 != -1) {
                    if (var242 == 0) {
                        field7103[field7098++] = class677.field9551;
                        return;
                    }
                    var242--;
                }
                class198 var243 = (class198) class368.field5262.method2066(false);
                while (var242-- > 0) {
                    var243 = (class198) class368.field5262.method2062(-19704);
                }
                field7103[field7098++] = var243.field2922;
                return;
            }
            if (arg0 == 6702) {
                int var244 = field7103[--field7098];
                if (class676.field9545[var244] == null) {
                    field7109[field7113++] = "";
                    return;
                }
                String var245 = class676.field9545[var244][0].field2106;
                if (var245 == null) {
                    field7109[field7113++] = "";
                    return;
                }
                field7109[field7113++] = var245.substring(0, var245.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var246 = field7103[--field7098];
                if (class676.field9545[var246] == null) {
                    field7103[field7098++] = 0;
                    return;
                }
                field7103[field7098++] = class676.field9545[var246].length;
                return;
            }
            if (arg0 == 6704) {
                field7098 -= 2;
                int var247 = field7103[field7098];
                int var248 = field7103[field7098 + 1];
                if (class676.field9545[var247] == null) {
                    field7109[field7113++] = "";
                    return;
                }
                String var249 = class676.field9545[var247][var248].field2106;
                if (var249 == null) {
                    field7109[field7113++] = "";
                    return;
                }
                field7109[field7113++] = var249;
                return;
            }
            if (arg0 == 6705) {
                field7098 -= 2;
                int var250 = field7103[field7098];
                int var251 = field7103[field7098 + 1];
                if (class676.field9545[var250] == null) {
                    field7103[field7098++] = 0;
                    return;
                }
                field7103[field7098++] = class676.field9545[var250][var251].field1965;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field7098 -= 3;
                int var252 = field7103[field7098];
                int var253 = field7103[field7098 + 1];
                int var254 = field7103[field7098 + 2];
                class15.method75("", 1, true, var254, var252 << 16 | var253);
                return;
            }
            if (arg0 == 6708) {
                field7098 -= 3;
                int var255 = field7103[field7098];
                int var256 = field7103[field7098 + 1];
                int var257 = field7103[field7098 + 2];
                class15.method75("", 2, true, var257, var255 << 16 | var256);
                return;
            }
            if (arg0 == 6709) {
                field7098 -= 3;
                int var258 = field7103[field7098];
                int var259 = field7103[field7098 + 1];
                int var260 = field7103[field7098 + 2];
                class15.method75("", 3, true, var260, var258 << 16 | var259);
                return;
            }
            if (arg0 == 6710) {
                field7098 -= 3;
                int var261 = field7103[field7098];
                int var262 = field7103[field7098 + 1];
                int var263 = field7103[field7098 + 2];
                class15.method75("", 4, true, var263, var261 << 16 | var262);
                return;
            }
            if (arg0 == 6711) {
                field7098 -= 3;
                int var264 = field7103[field7098];
                int var265 = field7103[field7098 + 1];
                int var266 = field7103[field7098 + 2];
                class15.method75("", 5, true, var266, var264 << 16 | var265);
                return;
            }
            if (arg0 == 6712) {
                field7098 -= 3;
                int var267 = field7103[field7098];
                int var268 = field7103[field7098 + 1];
                int var269 = field7103[field7098 + 2];
                class15.method75("", 6, true, var269, var267 << 16 | var268);
                return;
            }
            if (arg0 == 6713) {
                field7098 -= 3;
                int var270 = field7103[field7098];
                int var271 = field7103[field7098 + 1];
                int var272 = field7103[field7098 + 2];
                class15.method75("", 7, true, var272, var270 << 16 | var271);
                return;
            }
            if (arg0 == 6714) {
                field7098 -= 3;
                int var273 = field7103[field7098];
                int var274 = field7103[field7098 + 1];
                int var275 = field7103[field7098 + 2];
                class15.method75("", 8, true, var275, var273 << 16 | var274);
                return;
            }
            if (arg0 == 6715) {
                field7098 -= 3;
                int var276 = field7103[field7098];
                int var277 = field7103[field7098 + 1];
                int var278 = field7103[field7098 + 2];
                class15.method75("", 9, true, var278, var276 << 16 | var277);
                return;
            }
            if (arg0 == 6716) {
                field7098 -= 3;
                int var279 = field7103[field7098];
                int var280 = field7103[field7098 + 1];
                int var281 = field7103[field7098 + 2];
                class15.method75("", 10, true, var281, var279 << 16 | var280);
                return;
            }
            if (arg0 == 6717) {
                field7098 -= 3;
                int var282 = field7103[field7098];
                int var283 = field7103[field7098 + 1];
                int var284 = field7103[field7098 + 2];
                class140 var285 = class474.method2695(-12025, var282 << 16 | var283, var284);
                class651.method3622(-1);
                class513 var286 = client.method1655(var285);
                class245.method1520(20316, var286.field7014, var286.method2848(-1), var285);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var287 = field7103[--field7098];
                class307 var288 = class536.field7294.method2872((byte) 126, var287);
                if (var288.field4517 == null) {
                    field7109[field7113++] = "";
                    return;
                }
                field7109[field7113++] = var288.field4517;
                return;
            }
            if (arg0 == 6801) {
                int var289 = field7103[--field7098];
                class307 var290 = class536.field7294.method2872((byte) 124, var289);
                field7103[field7098++] = var290.field4539;
                return;
            }
            if (arg0 == 6802) {
                int var291 = field7103[--field7098];
                class307 var292 = class536.field7294.method2872((byte) 121, var291);
                field7103[field7098++] = var292.field4533;
                return;
            }
            if (arg0 == 6803) {
                int var293 = field7103[--field7098];
                class307 var294 = class536.field7294.method2872((byte) 127, var293);
                field7103[field7098++] = var294.field4527;
                return;
            }
            if (arg0 == 6804) {
                field7098 -= 2;
                int var295 = field7103[field7098];
                int var296 = field7103[field7098 + 1];
                class374 var297 = class324.field4784.method2171((byte) -80, var296);
                if (var297.method2182(115)) {
                    field7109[field7113++] = class536.field7294.method2872((byte) 118, var295).method1887(var297.field5301, false, var296);
                    return;
                }
                field7103[field7098++] = class536.field7294.method2872((byte) 125, var295).method1889(1037, var297.field5300, var296);
                return;
            }
        } else if (arg0 < 7000) {
            if (arg0 == 6900) {
                field7103[field7098++] = class451.field6295 && !class440.field6198 ? 1 : 0;
                return;
            }
            if (arg0 == 6901) {
                field7103[field7098++] = class387.field5433;
                return;
            }
            if (arg0 == 6902) {
                field7103[field7098++] = class169.field2550;
                return;
            }
            if (arg0 == 6903) {
                field7103[field7098++] = class323.field4772;
                return;
            }
            if (arg0 == 6904) {
                field7103[field7098++] = class134.field1902;
                return;
            }
            if (arg0 == 6905) {
                String var298 = "";
                if (class124.field1708 != null) {
                    if (class124.field1708.field3706 == null) {
                        var298 = class378.method2193(class124.field1708.field3701, 255);
                    } else {
                        var298 = (String) class124.field1708.field3706;
                    }
                }
                field7109[field7113++] = var298;
                return;
            }
            if (arg0 == 6906) {
                field7103[field7098++] = class446.field6250;
                return;
            }
            if (arg0 == 6907) {
                field7103[field7098++] = class246.field3499;
                return;
            }
            if (arg0 == 6908) {
                field7103[field7098++] = class325.field4807;
                return;
            }
            if (arg0 == 6909) {
                field7103[field7098++] = class313.field4645 ? 1 : 0;
                return;
            }
            if (arg0 == 6910) {
                field7103[field7098++] = class399.field5543;
                return;
            }
            if (arg0 == 6911) {
                field7103[field7098++] = class206.field3050;
                return;
            }
            if (arg0 == 6912) {
                field7103[field7098++] = class31.field370;
                return;
            }
        } else if (arg0 < 7100) {
            if (arg0 == 7000) {
                int var299 = class274.field3872.method2436(-9917);
                field7103[field7098++] = class274.field3872.field6051 = class429.field6020;
                field7103[field7098++] = var299;
                class70.method572(16912);
                class274.field3872.method2439(-2, class503.field6878);
                class471.field6573 = false;
                return;
            }
            if (arg0 == 7001) {
                class274.field3872.method2441(true);
                class70.method572(16912);
                class274.field3872.method2439(-2, class503.field6878);
                class471.field6573 = false;
                return;
            }
            if (arg0 == 7002) {
                class274.field3872.method2446(1);
                class70.method572(16912);
                class274.field3872.method2439(-2, class503.field6878);
                class471.field6573 = false;
                return;
            }
            if (arg0 == 7003) {
                class274.field3872.method2434(1496);
                class70.method572(16912);
                class274.field3872.method2439(-2, class503.field6878);
                class471.field6573 = false;
                return;
            }
            if (arg0 == 7004) {
                class274.field3872.method2445((byte) 47);
                class70.method572(16912);
                class274.field3872.method2439(-2, class503.field6878);
                class471.field6573 = false;
                return;
            }
            if (arg0 == 7005) {
                class274.field3872.field911 = 0;
                class274.field3872.method2439(-2, class503.field6878);
                class471.field6573 = false;
                return;
            }
            if (arg0 == 7006) {
                if (class274.field3872.field6051 == 2) {
                    class274.field3872.field6053 = true;
                    return;
                }
                if (class274.field3872.field6051 == 1) {
                    class274.field3872.field6036 = true;
                    return;
                }
                if (class274.field3872.field6051 == 3) {
                    class274.field3872.field6042 = true;
                }
                return;
            }
            if (arg0 == 7007) {
                field7103[field7098++] = class274.field3872.field911;
                return;
            }
            if (arg0 == 7008) {
                if (class429.field6020 == 0 && class202.field2968 < 96) {
                    field7103[field7098++] = 2;
                    return;
                }
                field7103[field7098++] = 4;
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V")
    public static final void method2894(int arg0) {
        if (arg0 == -1 || !class474.method2690(arg0, -256197904)) {
            return;
        }
        class140[] var1 = class676.field9545[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class140 var3 = var1[var2];
            if (var3.field2008 != null) {
                class388 var4 = new class388();
                var4.field5443 = var3;
                var4.field5451 = var3.field2008;
                method2898(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)V")
    private static final void method2895(int arg0) {
        class140 var1 = class266.method1626(arg0, 107);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class140[] var3 = class24.field321[var2];
        if (var3 == null) {
            class140[] var4 = class676.field9545[var2];
            int var5 = var4.length;
            var3 = class24.field321[var2] = new class140[var5];
            class282.method1708(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class282.method1708(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "()V")
    public static void method2896() {
        field7100 = null;
        field7093 = null;
        field7105 = null;
        field7111 = null;
        field7103 = null;
        field7109 = null;
        field7104 = null;
        field7094 = null;
        field7102 = null;
        field7096 = null;
        field7097 = null;
        field7120 = null;
        field7119 = null;
        field7118 = null;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "()V")
    public static final void method2897() {
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lad;I)V")
    private static final void method2898(class388 arg0, int arg1) {
        Object[] var2 = arg0.field5451;
        int var3 = (Integer) var2[0];
        class258 var4 = class77.method604(var3, -108);
        if (var4 == null) {
            return;
        }
        field7100 = new int[var4.field3686];
        int var5 = 0;
        field7093 = new String[var4.field3688];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field5449;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field5444;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field5443 == null ? -1 : arg0.field5443.field2100;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field5442;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field5443 == null ? -1 : arg0.field5443.field2092;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field5453 == null ? -1 : arg0.field5453.field2100;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field5453 == null ? -1 : arg0.field5453.field2092;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field5447;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field5440;
                }
                field7100[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field5450;
                }
                field7093[var6++] = var9;
            }
        }
        field7121 = arg0.field5439;
        method2899(var4, arg1);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Luu;I)V")
    private static final void method2899(class258 arg0, int arg1) {
        field7098 = 0;
        field7113 = 0;
        int var2 = -1;
        int[] var3 = arg0.field3689;
        int[] var4 = arg0.field3692;
        byte var5 = -1;
        field7099 = 0;
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
                        method2888(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method2893(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field7103[field7098++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field7103[field7098++] = class195.field2888.field1703[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class195.field2888.method877(16515072, var8, field7103[--field7098]);
                } else if (var43 == 3) {
                    field7109[field7113++] = arg0.field3695[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field7098 -= 2;
                    if (field7103[field7098 + 1] != field7103[field7098]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field7098 -= 2;
                    if (field7103[field7098 + 1] == field7103[field7098]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field7098 -= 2;
                    if (field7103[field7098] < field7103[field7098 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field7098 -= 2;
                    if (field7103[field7098] > field7103[field7098 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field7099 == 0) {
                        return;
                    }
                    class376 var9 = field7104[--field7099];
                    arg0 = var9.field5330;
                    var3 = arg0.field3689;
                    var4 = arg0.field3692;
                    var2 = var9.field5324;
                    field7100 = var9.field5328;
                    field7093 = var9.field5327;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field7103[field7098++] = class195.field2888.method508(85, var10);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class195.field2888.method875(field7103[--field7098], 0, var11);
                } else if (var43 == 31) {
                    field7098 -= 2;
                    if (field7103[field7098] <= field7103[field7098 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field7098 -= 2;
                    if (field7103[field7098] >= field7103[field7098 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field7103[field7098++] = field7100[var4[var2]];
                } else if (var43 == 34) {
                    field7100[var4[var2]] = field7103[--field7098];
                } else if (var43 == 35) {
                    field7109[field7113++] = field7093[var4[var2]];
                } else if (var43 == 36) {
                    field7093[var4[var2]] = field7109[--field7113];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field7113 -= var12;
                    String var13 = class103.method792(var12, field7113, -126, field7109);
                    field7109[field7113++] = var13;
                } else if (var43 == 38) {
                    field7098--;
                } else if (var43 == 39) {
                    field7113--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class258 var15 = class77.method604(var14, -60);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field3686];
                    String[] var17 = new String[var15.field3688];
                    for (int var18 = 0; var18 < var15.field3696; var18++) {
                        var16[var18] = field7103[field7098 + var18 - var15.field3696];
                    }
                    for (int var19 = 0; var19 < var15.field3684; var19++) {
                        var17[var19] = field7109[field7113 + var19 - var15.field3684];
                    }
                    field7098 -= var15.field3696;
                    field7113 -= var15.field3684;
                    class376 var20 = new class376();
                    var20.field5330 = arg0;
                    var20.field5324 = var2;
                    var20.field5328 = field7100;
                    var20.field5327 = field7093;
                    if (field7099 >= field7104.length) {
                        throw new RuntimeException();
                    }
                    field7104[field7099++] = var20;
                    arg0 = var15;
                    var3 = var15.field3689;
                    var4 = var15.field3692;
                    var2 = -1;
                    field7100 = var16;
                    field7093 = var17;
                } else if (var43 == 42) {
                    field7103[field7098++] = class614.field8514[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class614.field8514[var21] = field7103[--field7098];
                    class10.method51(var21, 1);
                    class417.field5879 |= class385.field5394[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field7103[--field7098];
                    if (var24 >= 0 && var24 <= 5000) {
                        field7105[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field7111[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field7103[--field7098];
                    if (var28 < 0 || var28 >= field7105[var27]) {
                        throw new RuntimeException();
                    }
                    field7103[field7098++] = field7111[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field7098 -= 2;
                    int var30 = field7103[field7098];
                    if (var30 < 0 || var30 >= field7105[var29]) {
                        throw new RuntimeException();
                    }
                    field7111[var29][var30] = field7103[field7098 + 1];
                } else if (var43 == 47) {
                    String var31 = class244.field3474[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field7109[field7113++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class244.field3474[var32] = field7109[--field7113];
                    class688.method3789(var32, false);
                } else if (var43 == 51) {
                    class346 var33 = arg0.field3699[var4[var2]];
                    class108 var34 = (class108) var33.method2061(-17305, (long) field7103[--field7098]);
                    if (var34 != null) {
                        var2 += var34.field1479;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field3690 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field7311).append(" ");
                for (int var41 = field7099 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field7104[var41].field5330.field7311).append(" ");
                }
                var40.append("op: ").append(var5);
                class139.method985((byte) -96, var40.toString(), var42);
            } else {
                class235.method1482(4, 24658, "Clientscript error in: " + arg0.field3690);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field3690).append("\n");
                for (int var38 = field7099 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field7104[var38].field5330.field3690).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class139.method985((byte) -114, var37.toString(), var42);
                class434.method2495((byte) 27, var37.toString());
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(IZ)V")
    public static final void method2900(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)V")
    private static final void method2901(int arg0) {
        class140 var1 = class266.method1626(arg0, 112);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class140[] var3 = class24.field321[var2];
        if (var3 == null) {
            class140[] var4 = class676.field9545[var2];
            int var5 = var4.length;
            var3 = class24.field321[var2] = new class140[var5];
            class282.method1708(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class282.method1708(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }
}
