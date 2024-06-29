import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class150 {

    @OriginalMember(owner = "client!rt", name = "i", descriptor = "[I")
    private static int[] field2280 = new int[5];

    @OriginalMember(owner = "client!rt", name = "h", descriptor = "[[I")
    private static int[][] field2279 = new int[5][5000];

    @OriginalMember(owner = "client!rt", name = "m", descriptor = "[I")
    private static int[] field2284 = new int[1000];

    @OriginalMember(owner = "client!rt", name = "k", descriptor = "I")
    private static int field2282 = 0;

    @OriginalMember(owner = "client!rt", name = "u", descriptor = "I")
    private static int field2292 = 0;

    @OriginalMember(owner = "client!rt", name = "v", descriptor = "[Ljava/lang/String;")
    private static String[] field2293 = new String[1000];

    @OriginalMember(owner = "client!rt", name = "r", descriptor = "I")
    private static int field2289 = 0;

    @OriginalMember(owner = "client!rt", name = "y", descriptor = "[Lgu;")
    private static class407[] field2296 = new class407[50];

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "Ljava/util/Calendar;")
    private static Calendar field2275 = Calendar.getInstance();

    @OriginalMember(owner = "client!rt", name = "z", descriptor = "[Ljava/lang/String;")
    private static String[] field2297 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!rt", name = "B", descriptor = "[I")
    private static int[] field2299 = new int[3];

    @OriginalMember(owner = "client!rt", name = "A", descriptor = "Llh;")
    public static class364 field2298 = new class364(4);

    @OriginalMember(owner = "client!rt", name = "C", descriptor = "I")
    private static int field2300 = 0;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!rt", name = "f", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!rt", name = "l", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!rt", name = "n", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!rt", name = "o", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!rt", name = "q", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!rt", name = "s", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!rt", name = "t", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!rt", name = "w", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!rt", name = "x", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "Ldf;")
    private static class274 field2278;

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "Ltn;")
    private static class58 field2274;

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "Ltn;")
    private static class58 field2276;

    @OriginalMember(owner = "client!rt", name = "j", descriptor = "[I")
    private static int[] field2281;

    @OriginalMember(owner = "client!rt", name = "p", descriptor = "[Ljava/lang/String;")
    private static String[] field2287;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "()V")
    public static final void method1078() {
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "()V")
    public static void method1079() {
        field2281 = null;
        field2287 = null;
        field2280 = null;
        field2279 = null;
        field2284 = null;
        field2293 = null;
        field2296 = null;
        field2274 = null;
        field2276 = null;
        field2278 = null;
        field2275 = null;
        field2297 = null;
        field2299 = null;
        field2298 = null;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lhd;I)V")
    private static final void method1080(class519 arg0, int arg1) {
        Object[] var2 = arg0.field7627;
        int var3 = (Integer) var2[0];
        class295 var4 = class233.method1515(var3, 0);
        if (var4 == null) {
            return;
        }
        field2281 = new int[var4.field4217];
        int var5 = 0;
        field2287 = new String[var4.field4219];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field7629;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field7624;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field7625 == null ? -1 : arg0.field7625.field955;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field7620;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field7625 == null ? -1 : arg0.field7625.field840;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field7622 == null ? -1 : arg0.field7622.field955;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field7622 == null ? -1 : arg0.field7622.field840;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field7628;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field7621;
                }
                field2281[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field7633;
                }
                field2287[var6++] = var9;
            }
        }
        field2300 = arg0.field7631;
        method1091(var4, arg1);
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V")
    public static final void method1081(int arg0) {
        if (arg0 == -1 || !class91.method738(false, arg0)) {
            return;
        }
        class58[] var1 = class416.field6157[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class58 var3 = var1[var2];
            if (var3.field850 != null) {
                class519 var4 = new class519();
                var4.field7625 = var3;
                var4.field7627 = var3.field850;
                method1080(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(I)Ljava/lang/String;")
    private static final String method1082(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field2275.setTime(new Date(var1));
        int var3 = field2275.get(5);
        int var4 = field2275.get(2);
        int var5 = field2275.get(1);
        return var3 + "-" + field2297[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lob;II)V")
    public static final void method1083(class516 arg0, int arg1, int arg2) {
        class295 var3 = class317.method1992(-119, arg0, arg1, arg2);
        if (var3 == null) {
            return;
        }
        field2281 = new int[var3.field4217];
        field2287 = new String[var3.field4219];
        if (class398.field5855 == var3.field4207 || class490.field7148 == var3.field4207 || class325.field4979 == var3.field4207) {
            int var4 = 0;
            int var5 = 0;
            if (class373.field5588 != null) {
                var4 = class373.field5588.field845;
                var5 = class373.field5588.field899;
            }
            field2281[0] = class481.field7063.method713(83) - var4;
            field2281[1] = class481.field7063.method712(-31039) - var5;
        }
        method1091(var3, 200000);
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IZ)V")
    private static final void method1084(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field2292 -= 3;
                int var2 = field2284[field2292];
                int var3 = field2284[field2292 + 1];
                int var4 = field2284[field2292 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class58 var5 = class421.method2578(-4179, var2);
                if (var5.field910 == null) {
                    var5.field910 = new class58[var4 + 1];
                }
                if (var5.field910.length <= var4) {
                    class58[] var6 = new class58[var4 + 1];
                    for (int var7 = 0; var7 < var5.field910.length; var7++) {
                        var6[var7] = var5.field910[var7];
                    }
                    var5.field910 = var6;
                }
                if (var4 > 0 && var5.field910[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class58 var8 = new class58();
                var8.field843 = var3;
                var8.field876 = var8.field955 = var5.field955;
                var8.field840 = var4;
                var5.field910[var4] = var8;
                if (arg1) {
                    field2276 = var8;
                } else {
                    field2274 = var8;
                }
                class139.method1027(var5, false);
                return;
            }
            if (arg0 == 101) {
                class58 var9 = arg1 ? field2276 : field2274;
                if (var9.field840 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class58 var10 = class421.method2578(-4179, var9.field955);
                var10.field910[var9.field840] = null;
                class139.method1027(var10, false);
                return;
            }
            if (arg0 == 102) {
                class58 var11 = class421.method2578(-4179, field2284[--field2292]);
                var11.field910 = null;
                class139.method1027(var11, false);
                return;
            }
            if (arg0 == 200) {
                field2292 -= 2;
                int var12 = field2284[field2292];
                int var13 = field2284[field2292 + 1];
                class58 var14 = class155.method1123(var13, var12, (byte) -78);
                if (var14 != null && var13 != -1) {
                    field2284[field2292++] = 1;
                    if (arg1) {
                        field2276 = var14;
                        return;
                    }
                    field2274 = var14;
                    return;
                }
                field2284[field2292++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field2284[--field2292];
                class58 var16 = class421.method2578(-4179, var15);
                if (var16 != null) {
                    field2284[field2292++] = 1;
                    if (arg1) {
                        field2276 = var16;
                        return;
                    }
                    field2274 = var16;
                    return;
                }
                field2284[field2292++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field2284[--field2292];
                method1090(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field2284[--field2292];
                method1088(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field2292 -= 2;
                int var19 = field2284[field2292];
                int var20 = field2284[field2292 + 1];
                for (int var21 = 0; var21 < class217.field3152.length; var21++) {
                    if (class217.field3152[var21] == var19) {
                        class95.field1558.field1060.method337(class413.field6075, var21, var20, -46);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class248.field3582.length; var22++) {
                    if (class248.field3582[var22] == var19) {
                        class95.field1558.field1060.method337(class413.field6075, var22, var20, 115);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field2292 -= 2;
                int var23 = field2284[field2292];
                int var24 = field2284[field2292 + 1];
                class95.field1558.field1060.method341((byte) 60, var23, var24);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field2284[--field2292] != 0;
                class95.field1558.field1060.method342((byte) -6, var25);
                return;
            }
        } else if (!(arg0 < 1000 || arg0 >= 1100) || !(arg0 < 2000 || arg0 >= 2100)) {
            class58 var26;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var26 = class421.method2578(-4179, field2284[--field2292]);
            } else {
                var26 = arg1 ? field2276 : field2274;
            }
            if (arg0 == 1000) {
                field2292 -= 4;
                var26.field886 = field2284[field2292];
                var26.field846 = field2284[field2292 + 1];
                int var27 = field2284[field2292 + 2];
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 5) {
                    var27 = 5;
                }
                int var28 = field2284[field2292 + 3];
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 5) {
                    var28 = 5;
                }
                var26.field916 = (byte) var27;
                var26.field933 = (byte) var28;
                class139.method1027(var26, false);
                class381.method2414(var26, -7017);
                if (var26.field840 == -1) {
                    class403.method2504(5565, var26.field955);
                }
                return;
            }
            if (arg0 == 1001) {
                field2292 -= 4;
                var26.field877 = field2284[field2292];
                var26.field936 = field2284[field2292 + 1];
                var26.field857 = 0;
                var26.field961 = 0;
                int var29 = field2284[field2292 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 4) {
                    var29 = 4;
                }
                int var30 = field2284[field2292 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 4) {
                    var30 = 4;
                }
                var26.field937 = (byte) var29;
                var26.field854 = (byte) var30;
                class139.method1027(var26, false);
                class381.method2414(var26, -7017);
                if (var26.field843 == 0) {
                    class162.method1171(var26, false, -121);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var31 = field2284[--field2292] == 1;
                if (var26.field924 != var31) {
                    var26.field924 = var31;
                    class139.method1027(var26, false);
                }
                if (var26.field840 == -1) {
                    class206.method1382(true, var26.field955);
                }
                return;
            }
            if (arg0 == 1004) {
                field2292 -= 2;
                var26.field841 = field2284[field2292];
                var26.field930 = field2284[field2292 + 1];
                class139.method1027(var26, false);
                class381.method2414(var26, -7017);
                if (var26.field843 == 0) {
                    class162.method1171(var26, false, -128);
                }
                return;
            }
            if (arg0 == 1005) {
                var26.field960 = field2284[--field2292] == 1;
                return;
            }
        } else if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
            class58 var32;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var32 = class421.method2578(-4179, field2284[--field2292]);
            } else {
                var32 = arg1 ? field2276 : field2274;
            }
            if (arg0 == 1100) {
                field2292 -= 2;
                var32.field885 = field2284[field2292];
                if (var32.field885 > var32.field895 - var32.field925) {
                    var32.field885 = var32.field895 - var32.field925;
                }
                if (var32.field885 < 0) {
                    var32.field885 = 0;
                }
                var32.field855 = field2284[field2292 + 1];
                if (var32.field855 > var32.field879 - var32.field896) {
                    var32.field855 = var32.field879 - var32.field896;
                }
                if (var32.field855 < 0) {
                    var32.field855 = 0;
                }
                class139.method1027(var32, false);
                if (var32.field840 == -1) {
                    class258.method1634(5797, var32.field955);
                }
                return;
            }
            if (arg0 == 1101) {
                var32.field943 = field2284[--field2292];
                class139.method1027(var32, false);
                if (var32.field840 == -1) {
                    class381.method2415(var32.field955, true);
                }
                return;
            }
            if (arg0 == 1102) {
                var32.field893 = field2284[--field2292] == 1;
                class139.method1027(var32, false);
                return;
            }
            if (arg0 == 1103) {
                var32.field973 = field2284[--field2292];
                class139.method1027(var32, false);
                return;
            }
            if (arg0 == 1104) {
                var32.field917 = field2284[--field2292];
                class139.method1027(var32, false);
                return;
            }
            if (arg0 == 1105) {
                int var33 = field2284[--field2292];
                if (var32.field980 != var33) {
                    var32.field980 = var33;
                    class139.method1027(var32, false);
                }
                if (var32.field840 == -1) {
                    class120.method873(var32.field955, (byte) -90);
                }
                return;
            }
            if (arg0 == 1106) {
                var32.field865 = field2284[--field2292];
                class139.method1027(var32, false);
                return;
            }
            if (arg0 == 1107) {
                var32.field929 = field2284[--field2292] == 1;
                class139.method1027(var32, false);
                return;
            }
            if (arg0 == 1108) {
                var32.field945 = 1;
                var32.field966 = field2284[--field2292];
                class139.method1027(var32, false);
                if (var32.field840 == -1) {
                    class51.method368(4, var32.field955);
                }
                return;
            }
            if (arg0 == 1109) {
                field2292 -= 6;
                var32.field847 = field2284[field2292];
                var32.field869 = field2284[field2292 + 1];
                var32.field990 = field2284[field2292 + 2];
                var32.field872 = field2284[field2292 + 3];
                var32.field932 = field2284[field2292 + 4];
                var32.field835 = field2284[field2292 + 5];
                class139.method1027(var32, false);
                if (var32.field840 == -1) {
                    class265.method1697(var32.field955, (byte) -124);
                    class476.method2844((byte) -119, var32.field955);
                }
                return;
            }
            if (arg0 == 1110) {
                int var34 = field2284[--field2292];
                if (var32.field909 != var34) {
                    var32.field909 = var34;
                    var32.field866 = 0;
                    var32.field901 = 1;
                    var32.field944 = 0;
                    class139.method1027(var32, false);
                }
                if (var32.field840 == -1) {
                    class231.method1507(var32.field955, 72);
                }
                return;
            }
            if (arg0 == 1111) {
                var32.field976 = field2284[--field2292] == 1;
                class139.method1027(var32, false);
                return;
            }
            if (arg0 == 1112) {
                String var35 = field2293[--field2289];
                if (!var35.equals(var32.field859)) {
                    var32.field859 = var35;
                    class139.method1027(var32, false);
                }
                if (var32.field840 == -1) {
                    class337.method2210(0, var32.field955);
                }
                return;
            }
            if (arg0 == 1113) {
                var32.field891 = field2284[--field2292];
                class139.method1027(var32, false);
                if (var32.field840 == -1) {
                    class225.method1493(var32.field955, (byte) -114);
                }
                return;
            }
            if (arg0 == 1114) {
                field2292 -= 3;
                var32.field988 = field2284[field2292];
                var32.field842 = field2284[field2292 + 1];
                var32.field902 = field2284[field2292 + 2];
                class139.method1027(var32, false);
                return;
            }
            if (arg0 == 1115) {
                var32.field948 = field2284[--field2292] == 1;
                class139.method1027(var32, false);
                return;
            }
            if (arg0 == 1116) {
                var32.field852 = field2284[--field2292];
                class139.method1027(var32, false);
                return;
            }
            if (arg0 == 1117) {
                var32.field983 = field2284[--field2292];
                class139.method1027(var32, false);
                return;
            }
            if (arg0 == 1118) {
                var32.field837 = field2284[--field2292] == 1;
                class139.method1027(var32, false);
                return;
            }
            if (arg0 == 1119) {
                var32.field974 = field2284[--field2292] == 1;
                class139.method1027(var32, false);
                return;
            }
            if (arg0 == 1120) {
                field2292 -= 2;
                var32.field895 = field2284[field2292];
                var32.field879 = field2284[field2292 + 1];
                class139.method1027(var32, false);
                if (var32.field843 == 0) {
                    class162.method1171(var32, false, -128);
                }
                return;
            }
            if (arg0 == 1121) {
                field2292 -= 2;
                var32.field851 = (short) field2284[field2292];
                var32.field861 = (short) field2284[field2292 + 1];
                class139.method1027(var32, false);
                return;
            }
            if (arg0 == 1122) {
                var32.field914 = field2284[--field2292] == 1;
                class139.method1027(var32, false);
                return;
            }
            if (arg0 == 1123) {
                var32.field835 = field2284[--field2292];
                class139.method1027(var32, false);
                if (var32.field840 == -1) {
                    class265.method1697(var32.field955, (byte) -124);
                }
                return;
            }
            if (arg0 == 1124) {
                int var36 = field2284[--field2292];
                var32.field942 = var36 == 1;
                class139.method1027(var32, false);
                return;
            }
            if (arg0 == 1125) {
                field2292 -= 2;
                var32.field881 = field2284[field2292];
                var32.field888 = field2284[field2292 + 1];
                class139.method1027(var32, false);
                return;
            }
            if (arg0 == 1126) {
                var32.field853 = field2284[--field2292];
                class139.method1027(var32, false);
                return;
            }
            if (arg0 == 1127) {
                field2292 -= 2;
                int var37 = field2284[field2292];
                int var38 = field2284[field2292 + 1];
                class93 var39 = class219.field3164.method2570((byte) -32, var37);
                if (var39.field1529 != var38) {
                    var32.method412(var37, 16, var38);
                    return;
                }
                var32.method413(1, var37);
                return;
            }
            if (arg0 == 1128) {
                int var40 = field2284[--field2292];
                String var41 = field2293[--field2289];
                class93 var42 = class219.field3164.method2570((byte) -32, var40);
                if (!var42.field1525.equals(var41)) {
                    var32.method424(var41, var40, (byte) -71);
                    return;
                }
                var32.method413(1, var40);
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class58 var43;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var43 = class421.method2578(-4179, field2284[--field2292]);
            } else {
                var43 = arg1 ? field2276 : field2274;
            }
            class139.method1027(var43, false);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field2292 -= 2;
                int var44 = field2284[field2292];
                int var45 = field2284[field2292 + 1];
                if (var43.field840 == -1) {
                    class85.method692(9, var43.field955);
                    class265.method1697(var43.field955, (byte) -124);
                    class476.method2844((byte) -125, var43.field955);
                }
                if (var44 == -1) {
                    var43.field945 = 1;
                    var43.field966 = -1;
                    var43.field946 = -1;
                    return;
                }
                var43.field946 = var44;
                var43.field977 = var45;
                if (arg0 == 1208 || arg0 == 1209) {
                    var43.field834 = true;
                } else {
                    var43.field834 = false;
                }
                class172 var46 = class8.field111.method3077(-123, var44);
                var43.field990 = var46.field2598;
                var43.field872 = var46.field2594;
                var43.field932 = var46.field2567;
                var43.field847 = var46.field2585;
                var43.field869 = var46.field2622;
                var43.field835 = var46.field2565;
                if (arg0 == 1205 || arg0 == 1209) {
                    var43.field889 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var43.field889 = 1;
                } else {
                    var43.field889 = 2;
                }
                if (var43.field857 > 0) {
                    var43.field835 = var43.field835 * 32 / var43.field857;
                    return;
                }
                if (var43.field877 > 0) {
                    var43.field835 = var43.field835 * 32 / var43.field877;
                }
                return;
            }
            if (arg0 == 1201) {
                var43.field945 = 2;
                var43.field966 = field2284[--field2292];
                if (var43.field840 == -1) {
                    class51.method368(4, var43.field955);
                }
                return;
            }
            if (arg0 == 1202) {
                var43.field945 = 3;
                var43.field966 = -1;
                if (var43.field840 == -1) {
                    class51.method368(4, var43.field955);
                }
                return;
            }
            if (arg0 == 1203) {
                var43.field945 = 6;
                var43.field966 = field2284[--field2292];
                if (var43.field840 == -1) {
                    class51.method368(4, var43.field955);
                }
                return;
            }
            if (arg0 == 1204) {
                var43.field945 = 5;
                var43.field966 = field2284[--field2292];
                if (var43.field840 == -1) {
                    class51.method368(4, var43.field955);
                }
                return;
            }
            if (arg0 == 1206) {
                field2292 -= 4;
                var43.field949 = field2284[field2292];
                var43.field981 = field2284[field2292 + 1];
                var43.field890 = field2284[field2292 + 2];
                var43.field864 = field2284[field2292 + 3];
                class139.method1027(var43, false);
                return;
            }
            if (arg0 == 1207) {
                field2292 -= 2;
                var43.field962 = field2284[field2292];
                var43.field923 = field2284[field2292 + 1];
                class139.method1027(var43, false);
                return;
            }
            if (arg0 == 1210) {
                field2292 -= 4;
                var43.field966 = field2284[field2292];
                var43.field894 = field2284[field2292 + 1];
                if (field2284[field2292 + 2] == 1) {
                    var43.field945 = 9;
                } else {
                    var43.field945 = 8;
                }
                if (field2284[field2292 + 3] == 1) {
                    var43.field834 = true;
                } else {
                    var43.field834 = false;
                }
                if (var43.field840 == -1) {
                    class51.method368(4, var43.field955);
                }
                return;
            }
            if (arg0 == 1211) {
                var43.field945 = 5;
                var43.field966 = class64.field1128;
                var43.field894 = 0;
                if (var43.field840 == -1) {
                    class51.method368(4, var43.field955);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class58 var58;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var58 = class421.method2578(-4179, field2284[--field2292]);
                } else {
                    var58 = arg1 ? field2276 : field2274;
                }
                String var59 = field2293[--field2289];
                int[] var60 = null;
                if (var59.length() > 0 && var59.charAt(var59.length() - 1) == 'Y') {
                    int var61 = field2284[--field2292];
                    if (var61 > 0) {
                        var60 = new int[var61];
                        while (var61-- > 0) {
                            var60[var61] = field2284[--field2292];
                        }
                    }
                    var59 = var59.substring(0, var59.length() - 1);
                }
                Object[] var62 = new Object[var59.length() + 1];
                for (int var63 = var62.length - 1; var63 >= 1; var63--) {
                    if (var59.charAt(var63 - 1) == 's') {
                        var62[var63] = field2293[--field2289];
                    } else {
                        var62[var63] = Integer.valueOf(field2284[--field2292]);
                    }
                }
                int var64 = field2284[--field2292];
                if (var64 == -1) {
                    var62 = null;
                } else {
                    var62[0] = Integer.valueOf(var64);
                }
                if (arg0 == 1400) {
                    var58.field920 = var62;
                } else if (arg0 == 1401) {
                    var58.field922 = var62;
                } else if (arg0 == 1402) {
                    var58.field928 = var62;
                } else if (arg0 == 1403) {
                    var58.field882 = var62;
                } else if (arg0 == 1404) {
                    var58.field978 = var62;
                } else if (arg0 == 1405) {
                    var58.field836 = var62;
                } else if (arg0 == 1406) {
                    var58.field972 = var62;
                } else if (arg0 == 1407) {
                    var58.field905 = var62;
                    var58.field912 = var60;
                } else if (arg0 == 1408) {
                    var58.field919 = var62;
                } else if (arg0 == 1409) {
                    var58.field880 = var62;
                } else if (arg0 == 1410) {
                    var58.field921 = var62;
                } else if (arg0 == 1411) {
                    var58.field965 = var62;
                } else if (arg0 == 1412) {
                    var58.field979 = var62;
                } else if (arg0 == 1414) {
                    var58.field908 = var62;
                    var58.field904 = var60;
                } else if (arg0 == 1415) {
                    var58.field975 = var62;
                    var58.field867 = var60;
                } else if (arg0 == 1416) {
                    var58.field833 = var62;
                } else if (arg0 == 1417) {
                    var58.field956 = var62;
                } else if (arg0 == 1418) {
                    var58.field844 = var62;
                } else if (arg0 == 1419) {
                    var58.field985 = var62;
                } else if (arg0 == 1420) {
                    var58.field884 = var62;
                } else if (arg0 == 1421) {
                    var58.field987 = var62;
                } else if (arg0 == 1422) {
                    var58.field883 = var62;
                } else if (arg0 == 1423) {
                    var58.field939 = var62;
                } else if (arg0 == 1424) {
                    var58.field863 = var62;
                } else if (arg0 == 1425) {
                    var58.field873 = var62;
                } else if (arg0 == 1426) {
                    var58.field871 = var62;
                } else if (arg0 == 1427) {
                    var58.field918 = var62;
                } else if (arg0 == 1428) {
                    var58.field915 = var62;
                    var58.field897 = var60;
                } else if (arg0 == 1429) {
                    var58.field875 = var62;
                    var58.field849 = var60;
                } else if (arg0 == 1430) {
                    var58.field968 = var62;
                }
                var58.field993 = true;
                return;
            }
            if (arg0 < 1600) {
                class58 var65 = arg1 ? field2276 : field2274;
                if (arg0 == 1500) {
                    field2284[field2292++] = var65.field845;
                    return;
                }
                if (arg0 == 1501) {
                    field2284[field2292++] = var65.field899;
                    return;
                }
                if (arg0 == 1502) {
                    field2284[field2292++] = var65.field925;
                    return;
                }
                if (arg0 == 1503) {
                    field2284[field2292++] = var65.field896;
                    return;
                }
                if (arg0 == 1504) {
                    field2284[field2292++] = var65.field924 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field2284[field2292++] = var65.field876;
                    return;
                }
                if (arg0 == 1506) {
                    class58 var66 = class290.method1805(var65, (byte) 71);
                    field2284[field2292++] = var66 == null ? -1 : var66.field955;
                    return;
                }
            } else if (arg0 < 1700) {
                class58 var67 = arg1 ? field2276 : field2274;
                if (arg0 == 1600) {
                    field2284[field2292++] = var67.field885;
                    return;
                }
                if (arg0 == 1601) {
                    field2284[field2292++] = var67.field855;
                    return;
                }
                if (arg0 == 1602) {
                    field2293[field2289++] = var67.field859;
                    return;
                }
                if (arg0 == 1603) {
                    field2284[field2292++] = var67.field895;
                    return;
                }
                if (arg0 == 1604) {
                    field2284[field2292++] = var67.field879;
                    return;
                }
                if (arg0 == 1605) {
                    field2284[field2292++] = var67.field835;
                    return;
                }
                if (arg0 == 1606) {
                    field2284[field2292++] = var67.field990;
                    return;
                }
                if (arg0 == 1607) {
                    field2284[field2292++] = var67.field932;
                    return;
                }
                if (arg0 == 1608) {
                    field2284[field2292++] = var67.field872;
                    return;
                }
                if (arg0 == 1609) {
                    field2284[field2292++] = var67.field973;
                    return;
                }
                if (arg0 == 1610) {
                    field2284[field2292++] = var67.field847;
                    return;
                }
                if (arg0 == 1611) {
                    field2284[field2292++] = var67.field869;
                    return;
                }
                if (arg0 == 1612) {
                    field2284[field2292++] = var67.field980;
                    return;
                }
                if (arg0 == 1613) {
                    int var68 = field2284[--field2292];
                    class93 var69 = class219.field3164.method2570((byte) -32, var68);
                    if (var69.method748((byte) 30)) {
                        field2293[field2289++] = var67.method422(var69.field1525, 16777215, var68);
                    } else {
                        field2284[field2292++] = var67.method417(var68, var69.field1529, 127);
                    }
                }
            } else if (arg0 < 1800) {
                class58 var70 = arg1 ? field2276 : field2274;
                if (arg0 == 1700) {
                    field2284[field2292++] = var70.field946;
                    return;
                }
                if (arg0 == 1701) {
                    if (var70.field946 != -1) {
                        field2284[field2292++] = var70.field977;
                        return;
                    }
                    field2284[field2292++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field2284[field2292++] = var70.field840;
                    return;
                }
            } else if (arg0 < 1900) {
                class58 var71 = arg1 ? field2276 : field2274;
                if (arg0 == 1800) {
                    field2284[field2292++] = client.method1349(var71).method779((byte) 122);
                    return;
                }
                if (arg0 == 1801) {
                    int var72 = field2284[--field2292];
                    int var334 = var72 - 1;
                    if (var71.field941 != null && var334 < var71.field941.length && var71.field941[var334] != null) {
                        field2293[field2289++] = var71.field941[var334];
                        return;
                    }
                    field2293[field2289++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var71.field992 == null) {
                        field2293[field2289++] = "";
                        return;
                    }
                    field2293[field2289++] = var71.field992;
                    return;
                }
            } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
                class58 var332;
                if (arg0 >= 2000) {
                    var332 = class421.method2578(-4179, field2284[--field2292]);
                    arg0 -= 1000;
                } else {
                    var332 = arg1 ? field2276 : field2274;
                }
                if (field2300 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var332.field918 == null) {
                        return;
                    }
                    class519 var333 = new class519();
                    var333.field7625 = var332;
                    var333.field7627 = var332.field918;
                    var333.field7631 = field2300 + 1;
                    class481.field7066.method2270(0, var333);
                    return;
                }
            } else if (arg0 < 2600) {
                class58 var73 = class421.method2578(-4179, field2284[--field2292]);
                if (arg0 == 2500) {
                    field2284[field2292++] = var73.field845;
                    return;
                }
                if (arg0 == 2501) {
                    field2284[field2292++] = var73.field899;
                    return;
                }
                if (arg0 == 2502) {
                    field2284[field2292++] = var73.field925;
                    return;
                }
                if (arg0 == 2503) {
                    field2284[field2292++] = var73.field896;
                    return;
                }
                if (arg0 == 2504) {
                    field2284[field2292++] = var73.field924 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field2284[field2292++] = var73.field876;
                    return;
                }
                if (arg0 == 1506) {
                    class58 var74 = class290.method1805(var73, (byte) 71);
                    field2284[field2292++] = var74 == null ? -1 : var74.field955;
                    return;
                }
            } else if (arg0 < 2700) {
                class58 var75 = class421.method2578(-4179, field2284[--field2292]);
                if (arg0 == 2600) {
                    field2284[field2292++] = var75.field885;
                    return;
                }
                if (arg0 == 2601) {
                    field2284[field2292++] = var75.field855;
                    return;
                }
                if (arg0 == 2602) {
                    field2293[field2289++] = var75.field859;
                    return;
                }
                if (arg0 == 2603) {
                    field2284[field2292++] = var75.field895;
                    return;
                }
                if (arg0 == 2604) {
                    field2284[field2292++] = var75.field879;
                    return;
                }
                if (arg0 == 2605) {
                    field2284[field2292++] = var75.field835;
                    return;
                }
                if (arg0 == 2606) {
                    field2284[field2292++] = var75.field990;
                    return;
                }
                if (arg0 == 2607) {
                    field2284[field2292++] = var75.field932;
                    return;
                }
                if (arg0 == 2608) {
                    field2284[field2292++] = var75.field872;
                    return;
                }
                if (arg0 == 2609) {
                    field2284[field2292++] = var75.field973;
                    return;
                }
                if (arg0 == 2610) {
                    field2284[field2292++] = var75.field847;
                    return;
                }
                if (arg0 == 2611) {
                    field2284[field2292++] = var75.field869;
                    return;
                }
                if (arg0 == 2612) {
                    field2284[field2292++] = var75.field980;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class58 var76 = class421.method2578(-4179, field2284[--field2292]);
                    field2284[field2292++] = var76.field946;
                    return;
                }
                if (arg0 == 2701) {
                    class58 var77 = class421.method2578(-4179, field2284[--field2292]);
                    if (var77.field946 == -1) {
                        field2284[field2292++] = 0;
                        return;
                    } else {
                        field2284[field2292++] = var77.field977;
                        return;
                    }
                }
                if (arg0 == 2702) {
                    int var78 = field2284[--field2292];
                    class183 var79 = (class183) class466.field6844.method2485(23, (long) var78);
                    if (var79 != null) {
                        field2284[field2292++] = 1;
                        return;
                    }
                    field2284[field2292++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class58 var80 = class421.method2578(-4179, field2284[--field2292]);
                    if (var80.field910 == null) {
                        field2284[field2292++] = 0;
                        return;
                    }
                    int var81 = var80.field910.length;
                    for (int var82 = 0; var82 < var80.field910.length; var82++) {
                        if (var80.field910[var82] == null) {
                            var81 = var82;
                            break;
                        }
                    }
                    field2284[field2292++] = var81;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field2292 -= 2;
                    int var83 = field2284[field2292];
                    int var84 = field2284[field2292 + 1];
                    class183 var85 = (class183) class466.field6844.method2485(109, (long) var83);
                    if (var85 != null && var85.field2753 == var84) {
                        field2284[field2292++] = 1;
                        return;
                    }
                    field2284[field2292++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class58 var86 = class421.method2578(-4179, field2284[--field2292]);
                if (arg0 == 2800) {
                    field2284[field2292++] = client.method1349(var86).method779((byte) 122);
                    return;
                }
                if (arg0 == 2801) {
                    int var87 = field2284[--field2292];
                    int var335 = var87 - 1;
                    if (var86.field941 != null && var335 < var86.field941.length && var86.field941[var335] != null) {
                        field2293[field2289++] = var86.field941[var335];
                        return;
                    }
                    field2293[field2289++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var86.field992 == null) {
                        field2293[field2289++] = "";
                        return;
                    }
                    field2293[field2289++] = var86.field992;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var88 = field2293[--field2289];
                    class460.method2756(var88, false);
                    return;
                }
                if (arg0 == 3101) {
                    field2292 -= 2;
                    class379.method2404(field2284[field2292], class95.field1558, field2284[field2292 + 1], -103);
                    return;
                }
                if (arg0 == 3103) {
                    class22.method182(true, 13521);
                    return;
                }
                if (arg0 == 3104) {
                    String var89 = field2293[--field2289];
                    int var90 = 0;
                    if (class65.method570(var89, -1484774708)) {
                        var90 = class457.method2745(var89, true);
                    }
                    field2272++;
                    class114.method841(false, class475.field6993);
                    class86.field1436.method1892(397825512, var90);
                    return;
                }
                if (arg0 == 3105) {
                    String var91 = field2293[--field2289];
                    field2288++;
                    class114.method841(false, class329.field5078);
                    class86.field1436.method1923((byte) 62, var91.length() + 1);
                    class86.field1436.method1882((byte) -113, var91);
                    return;
                }
                if (arg0 == 3106) {
                    String var92 = field2293[--field2289];
                    field2291++;
                    class114.method841(false, class436.field6335);
                    class86.field1436.method1923((byte) 62, var92.length() + 1);
                    class86.field1436.method1882((byte) -100, var92);
                    return;
                }
                if (arg0 == 3107) {
                    int var93 = field2284[--field2292];
                    String var94 = field2293[--field2289];
                    class421.method2577(var93, 96, var94);
                    return;
                }
                if (arg0 == 3108) {
                    field2292 -= 3;
                    int var95 = field2284[field2292];
                    int var96 = field2284[field2292 + 1];
                    int var97 = field2284[field2292 + 2];
                    class58 var98 = class421.method2578(-4179, var97);
                    class485.method2899(var98, var96, (byte) 15, var95);
                    return;
                }
                if (arg0 == 3109) {
                    field2292 -= 2;
                    int var99 = field2284[field2292];
                    int var100 = field2284[field2292 + 1];
                    class58 var101 = arg1 ? field2276 : field2274;
                    class485.method2899(var101, var100, (byte) 15, var99);
                    return;
                }
                if (arg0 == 3110) {
                    int var102 = field2284[--field2292];
                    field2283++;
                    class114.method841(false, class490.field7154);
                    class86.field1436.method1874(var102, (byte) -110);
                    return;
                }
                if (arg0 == 3111) {
                    field2292 -= 2;
                    int var103 = field2284[field2292];
                    int var104 = field2284[field2292 + 1];
                    class183 var105 = (class183) class466.field6844.method2485(75, (long) var103);
                    if (var105 != null) {
                        class456.method2743(var105.field2753 != var104, 90, true, var105);
                    }
                    class172.method1229(true, var103, 0, 3, var104);
                    return;
                }
                if (arg0 == 3112) {
                    field2292--;
                    int var106 = field2284[field2292];
                    class183 var107 = (class183) class466.field6844.method2485(29, (long) var106);
                    if (var107 != null && var107.field2750 == 3) {
                        class456.method2743(true, 127, true, var107);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class206.method1381(true, field2293[--field2289]);
                    return;
                }
                if (arg0 == 3114) {
                    field2292 -= 2;
                    int var108 = field2284[field2292];
                    int var109 = field2284[field2292 + 1];
                    String var110 = field2293[--field2289];
                    class64.method569(2, var108, var110, var109, "", "");
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field2292 -= 3;
                    class513.method3041(27663, field2284[field2292 + 1], field2284[field2292 + 2], field2284[field2292], 255);
                    return;
                }
                if (arg0 == 3201) {
                    class295.method1824(255, -9574, 50, field2284[--field2292]);
                    return;
                }
                if (arg0 == 3202) {
                    field2292 -= 2;
                    class310.method1941(-9434, 255, field2284[field2292], field2284[field2292 + 1]);
                    return;
                }
                if (arg0 == 3203) {
                    field2292 -= 4;
                    class513.method3041(27663, field2284[field2292 + 1], field2284[field2292 + 2], field2284[field2292], field2284[field2292 + 3]);
                    return;
                }
                if (arg0 == 3204) {
                    field2292 -= 3;
                    class295.method1824(field2284[field2292 + 1], -9574, field2284[field2292 + 2], field2284[field2292]);
                    return;
                }
                if (arg0 == 3205) {
                    field2292 -= 3;
                    class310.method1941(-9434, field2284[field2292 + 2], field2284[field2292], field2284[field2292 + 1]);
                    return;
                }
                if (arg0 == 3206) {
                    field2292 -= 4;
                    class16.method153(field2284[field2292 + 2], field2284[field2292], true, field2284[field2292 + 1], field2284[field2292 + 3]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field2284[field2292++] = class180.field2734;
                    return;
                }
                if (arg0 == 3301) {
                    field2292 -= 2;
                    int var111 = field2284[field2292];
                    int var112 = field2284[field2292 + 1];
                    field2284[field2292++] = class314.method1986(var111, false, var112, (byte) -108);
                    return;
                }
                if (arg0 == 3302) {
                    field2292 -= 2;
                    int var113 = field2284[field2292];
                    int var114 = field2284[field2292 + 1];
                    field2284[field2292++] = class282.method1783(var114, var113, false, -88);
                    return;
                }
                if (arg0 == 3303) {
                    field2292 -= 2;
                    int var115 = field2284[field2292];
                    int var116 = field2284[field2292 + 1];
                    field2284[field2292++] = class5.method42(false, var116, (byte) -126, var115);
                    return;
                }
                if (arg0 == 3304) {
                    int var117 = field2284[--field2292];
                    field2284[field2292++] = class458.field6760.method355(var117, (byte) -87).field4563;
                    return;
                }
                if (arg0 == 3305) {
                    int var118 = field2284[--field2292];
                    field2284[field2292++] = class229.field3351[var118];
                    return;
                }
                if (arg0 == 3306) {
                    int var119 = field2284[--field2292];
                    field2284[field2292++] = class369.field5524[var119];
                    return;
                }
                if (arg0 == 3307) {
                    int var120 = field2284[--field2292];
                    field2284[field2292++] = class108.field1685[var120];
                    return;
                }
                if (arg0 == 3308) {
                    byte var121 = class95.field1558.field5538;
                    int var122 = (class95.field1558.field5529 >> 7) + class483.field7082;
                    int var123 = (class95.field1558.field5539 >> 7) + class465.field6840;
                    field2284[field2292++] = (var121 << 28) + (var122 << 14) + var123;
                    return;
                }
                if (arg0 == 3309) {
                    int var124 = field2284[--field2292];
                    field2284[field2292++] = var124 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var125 = field2284[--field2292];
                    field2284[field2292++] = var125 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var126 = field2284[--field2292];
                    field2284[field2292++] = var126 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field2284[field2292++] = class22.field394 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field2292 -= 2;
                    int var127 = field2284[field2292];
                    int var128 = field2284[field2292 + 1];
                    field2284[field2292++] = class314.method1986(var127, true, var128, (byte) 26);
                    return;
                }
                if (arg0 == 3314) {
                    field2292 -= 2;
                    int var129 = field2284[field2292];
                    int var130 = field2284[field2292 + 1];
                    field2284[field2292++] = class282.method1783(var130, var129, true, -107);
                    return;
                }
                if (arg0 == 3315) {
                    field2292 -= 2;
                    int var131 = field2284[field2292];
                    int var132 = field2284[field2292 + 1];
                    field2284[field2292++] = class5.method42(true, var132, (byte) -125, var131);
                    return;
                }
                if (arg0 == 3316) {
                    if (class42.field642 >= 2) {
                        field2284[field2292++] = class42.field642;
                        return;
                    }
                    field2284[field2292++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field2284[field2292++] = class200.field2918;
                    return;
                }
                if (arg0 == 3318) {
                    field2284[field2292++] = class255.field3681;
                    return;
                }
                if (arg0 == 3321) {
                    field2284[field2292++] = class472.field6958;
                    return;
                }
                if (arg0 == 3322) {
                    field2284[field2292++] = class321.field4604;
                    return;
                }
                if (arg0 == 3323) {
                    if (class57.field824 >= 5 && class57.field824 <= 9) {
                        field2284[field2292++] = 1;
                        return;
                    }
                    field2284[field2292++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class57.field824 >= 5 && class57.field824 <= 9) {
                        field2284[field2292++] = class57.field824;
                        return;
                    }
                    field2284[field2292++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field2284[field2292++] = class333.field5121 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field2284[field2292++] = class95.field1558.field1071;
                    return;
                }
                if (arg0 == 3327) {
                    field2284[field2292++] = class95.field1558.field1060.field676 ? 1 : 0;
                    return;
                }
                if (arg0 == 3328) {
                    field2284[field2292++] = class170.field2554 && !class101.field1622 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field2284[field2292++] = class72.field1209 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var133 = field2284[--field2292];
                    field2284[field2292++] = class118.method864(var133, false, -16589);
                    return;
                }
                if (arg0 == 3331) {
                    field2292 -= 2;
                    int var134 = field2284[field2292];
                    int var135 = field2284[field2292 + 1];
                    field2284[field2292++] = class21.method177(var134, var135, 0, false, false);
                    return;
                }
                if (arg0 == 3332) {
                    field2292 -= 2;
                    int var136 = field2284[field2292];
                    int var137 = field2284[field2292 + 1];
                    field2284[field2292++] = class21.method177(var136, var137, 0, true, false);
                    return;
                }
                if (arg0 == 3333) {
                    field2284[field2292++] = class337.field5148;
                    return;
                }
                if (arg0 == 3335) {
                    field2284[field2292++] = class370.field5530;
                    return;
                }
                if (arg0 == 3336) {
                    field2292 -= 4;
                    int var138 = field2284[field2292];
                    int var139 = field2284[field2292 + 1];
                    int var140 = field2284[field2292 + 2];
                    int var141 = field2284[field2292 + 3];
                    int var142 = (var139 << 14) + var138;
                    int var143 = (var140 << 28) + var142;
                    int var144 = var141 + var143;
                    field2284[field2292++] = var144;
                    return;
                }
                if (arg0 == 3337) {
                    field2284[field2292++] = class389.field5759;
                    return;
                }
                if (arg0 == 3338) {
                    field2284[field2292++] = class525.method3102(40);
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field2292 -= 2;
                    int var145 = field2284[field2292];
                    int var146 = field2284[field2292 + 1];
                    class68 var147 = class405.field5963.method2960(var145, 0);
                    field2293[field2289++] = var147.method587(false, var146);
                    return;
                }
                if (arg0 == 3408) {
                    field2292 -= 4;
                    int var148 = field2284[field2292];
                    int var149 = field2284[field2292 + 1];
                    int var150 = field2284[field2292 + 2];
                    int var151 = field2284[field2292 + 3];
                    class68 var152 = class405.field5963.method2960(var150, 0);
                    if (var152.field1190 == var148 && var152.field1177 == var149) {
                        if (var149 == 115) {
                            field2293[field2289++] = var152.method587(false, var151);
                            return;
                        }
                        field2284[field2292++] = var152.method590(var151, -128);
                        return;
                    }
                    throw new RuntimeException("C3408-1");
                }
                if (arg0 == 3409) {
                    field2292 -= 3;
                    int var153 = field2284[field2292];
                    int var154 = field2284[field2292 + 1];
                    int var155 = field2284[field2292 + 2];
                    if (var154 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class68 var156 = class405.field5963.method2960(var154, 0);
                    if (var156.field1177 != var153) {
                        throw new RuntimeException("C3409-1");
                    }
                    field2284[field2292++] = var156.method594(var155, 55) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var157 = field2284[--field2292];
                    String var158 = field2293[--field2289];
                    if (var157 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class68 var159 = class405.field5963.method2960(var157, 0);
                    if (var159.field1177 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field2284[field2292++] = var159.method585(-4, var158) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var160 = field2284[--field2292];
                    class68 var161 = class405.field5963.method2960(var160, 0);
                    field2284[field2292++] = var161.field1179.method2482(0);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class317.field4540 == 0) {
                        field2284[field2292++] = -2;
                        return;
                    }
                    if (class317.field4540 == 1) {
                        field2284[field2292++] = -1;
                        return;
                    }
                    field2284[field2292++] = class424.field6218;
                    return;
                }
                if (arg0 == 3601) {
                    int var162 = field2284[--field2292];
                    if (class317.field4540 == 2 && var162 < class424.field6218) {
                        field2293[field2289++] = class469.field6908[var162];
                        if (class332.field5102[var162] != null) {
                            field2293[field2289++] = class332.field5102[var162];
                            return;
                        }
                        field2293[field2289++] = "";
                        return;
                    }
                    field2293[field2289++] = "";
                    field2293[field2289++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var163 = field2284[--field2292];
                    if (class317.field4540 == 2 && var163 < class424.field6218) {
                        field2284[field2292++] = class222.field3219[var163];
                        return;
                    }
                    field2284[field2292++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var164 = field2284[--field2292];
                    if (class317.field4540 == 2 && var164 < class424.field6218) {
                        field2284[field2292++] = class410.field6043[var164];
                        return;
                    }
                    field2284[field2292++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var165 = field2293[--field2289];
                    int var166 = field2284[--field2292];
                    class496.method2955(var165, var166, 2);
                    return;
                }
                if (arg0 == 3605) {
                    String var167 = field2293[--field2289];
                    class48.method356(31651, var167);
                    return;
                }
                if (arg0 == 3606) {
                    String var168 = field2293[--field2289];
                    class339.method2215(1, var168);
                    return;
                }
                if (arg0 == 3607) {
                    String var169 = field2293[--field2289];
                    class497.method2959((byte) 123, var169, false);
                    return;
                }
                if (arg0 == 3608) {
                    String var170 = field2293[--field2289];
                    class202.method1367(1, var170);
                    return;
                }
                if (arg0 == 3609) {
                    String var171 = field2293[--field2289];
                    if (var171.startsWith("<img=0>") || var171.startsWith("<img=1>")) {
                        var171 = var171.substring(7);
                    }
                    field2284[field2292++] = class346.method2247(83, var171) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var172 = field2284[--field2292];
                    if (class317.field4540 == 2 && var172 < class424.field6218) {
                        field2293[field2289++] = class227.field3331[var172];
                        return;
                    }
                    field2293[field2289++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class418.field6169 != null) {
                        field2293[field2289++] = class238.method1543((byte) -112, class418.field6169);
                        return;
                    }
                    field2293[field2289++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class418.field6169 != null) {
                        field2284[field2292++] = class22.field395;
                        return;
                    }
                    field2284[field2292++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var173 = field2284[--field2292];
                    if (class418.field6169 != null && var173 < class22.field395) {
                        field2293[field2289++] = class172.field2628[var173].field4205;
                        return;
                    }
                    field2293[field2289++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var174 = field2284[--field2292];
                    if (class418.field6169 != null && var174 < class22.field395) {
                        field2284[field2292++] = class172.field2628[var174].field4203;
                        return;
                    }
                    field2284[field2292++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var175 = field2284[--field2292];
                    if (class418.field6169 != null && var175 < class22.field395) {
                        field2284[field2292++] = class172.field2628[var175].field4200;
                        return;
                    }
                    field2284[field2292++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field2284[field2292++] = class443.field6495;
                    return;
                }
                if (arg0 == 3617) {
                    String var176 = field2293[--field2289];
                    class78.method639(0, var176);
                    return;
                }
                if (arg0 == 3618) {
                    field2284[field2292++] = class62.field1114;
                    return;
                }
                if (arg0 == 3619) {
                    String var177 = field2293[--field2289];
                    class348.method2259(-67, var177);
                    return;
                }
                if (arg0 == 3620) {
                    class432.method2621(-107);
                    return;
                }
                if (arg0 == 3621) {
                    if (class317.field4540 == 0) {
                        field2284[field2292++] = -1;
                        return;
                    }
                    field2284[field2292++] = class520.field7636;
                    return;
                }
                if (arg0 == 3622) {
                    int var178 = field2284[--field2292];
                    if (class317.field4540 != 0 && var178 < class520.field7636) {
                        field2293[field2289++] = class83.field1361[var178];
                        if (class451.field6586[var178] != null) {
                            field2293[field2289++] = class451.field6586[var178];
                            return;
                        }
                        field2293[field2289++] = "";
                        return;
                    }
                    field2293[field2289++] = "";
                    field2293[field2289++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var179 = field2293[--field2289];
                    if (var179.startsWith("<img=0>") || var179.startsWith("<img=1>")) {
                        var179 = var179.substring(7);
                    }
                    field2284[field2292++] = class13.method109(true, var179) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var180 = field2284[--field2292];
                    if (class172.field2628 != null && var180 < class22.field395 && class172.field2628[var180].field4199.equalsIgnoreCase(class95.field1558.field1094)) {
                        field2284[field2292++] = 1;
                        return;
                    }
                    field2284[field2292++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class298.field4258 != null) {
                        field2293[field2289++] = class298.field4258;
                        return;
                    }
                    field2293[field2289++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var181 = field2284[--field2292];
                    if (class418.field6169 != null && var181 < class22.field395) {
                        field2293[field2289++] = class172.field2628[var181].field4204;
                        return;
                    }
                    field2293[field2289++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var182 = field2284[--field2292];
                    if (class317.field4540 == 2 && var182 >= 0 && var182 < class424.field6218) {
                        field2284[field2292++] = class56.field816[var182] ? 1 : 0;
                        return;
                    }
                    field2284[field2292++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var183 = field2293[--field2289];
                    if (var183.startsWith("<img=0>") || var183.startsWith("<img=1>")) {
                        var183 = var183.substring(7);
                    }
                    field2284[field2292++] = class341.method2226(1102109936, var183);
                    return;
                }
                if (arg0 == 3629) {
                    field2284[field2292++] = class17.field260;
                    return;
                }
                if (arg0 == 3630) {
                    String var184 = field2293[--field2289];
                    class497.method2959((byte) 125, var184, true);
                    return;
                }
                if (arg0 == 3631) {
                    int var185 = field2284[--field2292];
                    field2284[field2292++] = class374.field5600[var185] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var186 = field2284[--field2292];
                    if (class418.field6169 != null && var186 < class22.field395) {
                        field2293[field2289++] = class172.field2628[var186].field4199;
                        return;
                    }
                    field2293[field2289++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var187 = field2284[--field2292];
                    if (class317.field4540 != 0 && var187 < class520.field7636) {
                        field2293[field2289++] = class173.field2656[var187];
                        return;
                    }
                    field2293[field2289++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var188 = field2284[--field2292];
                    field2284[field2292++] = class131.field2024[var188].method54(true);
                    return;
                }
                if (arg0 == 3904) {
                    int var189 = field2284[--field2292];
                    field2284[field2292++] = class131.field2024[var189].field97;
                    return;
                }
                if (arg0 == 3905) {
                    int var190 = field2284[--field2292];
                    field2284[field2292++] = class131.field2024[var190].field101;
                    return;
                }
                if (arg0 == 3906) {
                    int var191 = field2284[--field2292];
                    field2284[field2292++] = class131.field2024[var191].field102;
                    return;
                }
                if (arg0 == 3907) {
                    int var192 = field2284[--field2292];
                    field2284[field2292++] = class131.field2024[var192].field108;
                    return;
                }
                if (arg0 == 3908) {
                    int var193 = field2284[--field2292];
                    field2284[field2292++] = class131.field2024[var193].field98;
                    return;
                }
                if (arg0 == 3910) {
                    int var194 = field2284[--field2292];
                    int var195 = class131.field2024[var194].method53(11314);
                    field2284[field2292++] = var195 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var196 = field2284[--field2292];
                    int var197 = class131.field2024[var196].method53(11314);
                    field2284[field2292++] = var197 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var198 = field2284[--field2292];
                    int var199 = class131.field2024[var198].method53(11314);
                    field2284[field2292++] = var199 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var200 = field2284[--field2292];
                    int var201 = class131.field2024[var200].method53(11314);
                    field2284[field2292++] = var201 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field2292 -= 2;
                    int var202 = field2284[field2292];
                    int var203 = field2284[field2292 + 1];
                    field2284[field2292++] = var202 + var203;
                    return;
                }
                if (arg0 == 4001) {
                    field2292 -= 2;
                    int var204 = field2284[field2292];
                    int var205 = field2284[field2292 + 1];
                    field2284[field2292++] = var204 - var205;
                    return;
                }
                if (arg0 == 4002) {
                    field2292 -= 2;
                    int var206 = field2284[field2292];
                    int var207 = field2284[field2292 + 1];
                    field2284[field2292++] = var206 * var207;
                    return;
                }
                if (arg0 == 4003) {
                    field2292 -= 2;
                    int var208 = field2284[field2292];
                    int var209 = field2284[field2292 + 1];
                    field2284[field2292++] = var208 / var209;
                    return;
                }
                if (arg0 == 4004) {
                    int var210 = field2284[--field2292];
                    field2284[field2292++] = (int) (Math.random() * (double) var210);
                    return;
                }
                if (arg0 == 4005) {
                    int var211 = field2284[--field2292];
                    field2284[field2292++] = (int) (Math.random() * (double) (var211 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field2292 -= 5;
                    int var212 = field2284[field2292];
                    int var213 = field2284[field2292 + 1];
                    int var214 = field2284[field2292 + 2];
                    int var215 = field2284[field2292 + 3];
                    int var216 = field2284[field2292 + 4];
                    field2284[field2292++] = (var213 - var212) * (var216 - var214) / (var215 - var214) + var212;
                    return;
                }
                if (arg0 == 4007) {
                    field2292 -= 2;
                    long var217 = (long) field2284[field2292];
                    long var219 = (long) field2284[field2292 + 1];
                    field2284[field2292++] = (int) (var217 * var219 / 100L + var217);
                    return;
                }
                if (arg0 == 4008) {
                    field2292 -= 2;
                    int var221 = field2284[field2292];
                    int var222 = field2284[field2292 + 1];
                    field2284[field2292++] = var221 | 0x1 << var222;
                    return;
                }
                if (arg0 == 4009) {
                    field2292 -= 2;
                    int var223 = field2284[field2292];
                    int var224 = field2284[field2292 + 1];
                    field2284[field2292++] = var223 & -(0x1 << var224) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field2292 -= 2;
                    int var225 = field2284[field2292];
                    int var226 = field2284[field2292 + 1];
                    field2284[field2292++] = (var225 & 0x1 << var226) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field2292 -= 2;
                    int var227 = field2284[field2292];
                    int var228 = field2284[field2292 + 1];
                    field2284[field2292++] = var227 % var228;
                    return;
                }
                if (arg0 == 4012) {
                    field2292 -= 2;
                    int var229 = field2284[field2292];
                    int var230 = field2284[field2292 + 1];
                    if (var229 == 0) {
                        field2284[field2292++] = 0;
                        return;
                    }
                    field2284[field2292++] = (int) Math.pow((double) var229, (double) var230);
                    return;
                }
                if (arg0 == 4013) {
                    field2292 -= 2;
                    int var231 = field2284[field2292];
                    int var232 = field2284[field2292 + 1];
                    if (var231 == 0) {
                        field2284[field2292++] = 0;
                        return;
                    }
                    if (var232 == 0) {
                        field2284[field2292++] = Integer.MAX_VALUE;
                        return;
                    }
                    field2284[field2292++] = (int) Math.pow((double) var231, 1.0D / (double) var232);
                    return;
                }
                if (arg0 == 4014) {
                    field2292 -= 2;
                    int var233 = field2284[field2292];
                    int var234 = field2284[field2292 + 1];
                    field2284[field2292++] = var233 & var234;
                    return;
                }
                if (arg0 == 4015) {
                    field2292 -= 2;
                    int var235 = field2284[field2292];
                    int var236 = field2284[field2292 + 1];
                    field2284[field2292++] = var235 | var236;
                    return;
                }
                if (arg0 == 4016) {
                    field2292 -= 2;
                    int var237 = field2284[field2292];
                    int var238 = field2284[field2292 + 1];
                    field2284[field2292++] = var237 < var238 ? var237 : var238;
                    return;
                }
                if (arg0 == 4017) {
                    field2292 -= 2;
                    int var239 = field2284[field2292];
                    int var240 = field2284[field2292 + 1];
                    field2284[field2292++] = var239 > var240 ? var239 : var240;
                    return;
                }
                if (arg0 == 4018) {
                    field2292 -= 3;
                    long var241 = (long) field2284[field2292];
                    long var243 = (long) field2284[field2292 + 1];
                    long var245 = (long) field2284[field2292 + 2];
                    field2284[field2292++] = (int) (var241 * var245 / var243);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var247 = field2293[--field2289];
                    int var248 = field2284[--field2292];
                    field2293[field2289++] = var247 + var248;
                    return;
                }
                if (arg0 == 4101) {
                    field2289 -= 2;
                    String var249 = field2293[field2289];
                    String var250 = field2293[field2289 + 1];
                    field2293[field2289++] = var249 + var250;
                    return;
                }
                if (arg0 == 4102) {
                    String var251 = field2293[--field2289];
                    int var252 = field2284[--field2292];
                    field2293[field2289++] = var251 + class513.method3044(true, -84, var252);
                    return;
                }
                if (arg0 == 4103) {
                    String var253 = field2293[--field2289];
                    field2293[field2289++] = var253.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field2293[field2289++] = method1082(field2284[--field2292]);
                    return;
                }
                if (arg0 == 4105) {
                    field2289 -= 2;
                    String var254 = field2293[field2289];
                    String var255 = field2293[field2289 + 1];
                    if (class95.field1558.field1060 != null && class95.field1558.field1060.field676) {
                        field2293[field2289++] = var255;
                        return;
                    }
                    field2293[field2289++] = var254;
                    return;
                }
                if (arg0 == 4106) {
                    int var256 = field2284[--field2292];
                    field2293[field2289++] = Integer.toString(var256);
                    return;
                }
                if (arg0 == 4107) {
                    field2289 -= 2;
                    field2284[field2292++] = class161.method1166(field2293[field2289], field2293[field2289 + 1], class370.field5530, -103);
                    return;
                }
                if (arg0 == 4108) {
                    String var257 = field2293[--field2289];
                    field2292 -= 2;
                    int var258 = field2284[field2292];
                    int var259 = field2284[field2292 + 1];
                    class12 var260 = class114.method842(-79, class420.field6181, 0, var259);
                    field2284[field2292++] = var260.method97(var258, var257, 24619, class402.field5901);
                    return;
                }
                if (arg0 == 4109) {
                    String var261 = field2293[--field2289];
                    field2292 -= 2;
                    int var262 = field2284[field2292];
                    int var263 = field2284[field2292 + 1];
                    class12 var264 = class114.method842(-100, class420.field6181, 0, var263);
                    field2284[field2292++] = var264.method101(class402.field5901, var261, var262, 0);
                    return;
                }
                if (arg0 == 4110) {
                    field2289 -= 2;
                    String var265 = field2293[field2289];
                    String var266 = field2293[field2289 + 1];
                    if (field2284[--field2292] == 1) {
                        field2293[field2289++] = var265;
                        return;
                    }
                    field2293[field2289++] = var266;
                    return;
                }
                if (arg0 == 4111) {
                    String var267 = field2293[--field2289];
                    field2293[field2289++] = class342.method2234(true, var267);
                    return;
                }
                if (arg0 == 4112) {
                    String var268 = field2293[--field2289];
                    int var269 = field2284[--field2292];
                    if (var269 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field2293[field2289++] = var268 + (char) var269;
                    return;
                }
                if (arg0 == 4113) {
                    int var270 = field2284[--field2292];
                    field2284[field2292++] = class41.method319((char) var270, (byte) 1) ? 1 : 0;
                    return;
                }
                if (arg0 == 4114) {
                    int var271 = field2284[--field2292];
                    field2284[field2292++] = class165.method1186((char) var271, true) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var272 = field2284[--field2292];
                    field2284[field2292++] = class266.method1704((char) var272, (byte) 24) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var273 = field2284[--field2292];
                    field2284[field2292++] = class416.method2561((char) var273, (byte) 4) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var274 = field2293[--field2289];
                    if (var274 != null) {
                        field2284[field2292++] = var274.length();
                        return;
                    }
                    field2284[field2292++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var275 = field2293[--field2289];
                    field2292 -= 2;
                    int var276 = field2284[field2292];
                    int var277 = field2284[field2292 + 1];
                    field2293[field2289++] = var275.substring(var276, var277);
                    return;
                }
                if (arg0 == 4119) {
                    String var278 = field2293[--field2289];
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
                    field2293[field2289++] = var279.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var283 = field2293[--field2289];
                    field2292 -= 2;
                    int var284 = field2284[field2292];
                    int var285 = field2284[field2292 + 1];
                    field2284[field2292++] = var283.indexOf(var284, var285);
                    return;
                }
                if (arg0 == 4121) {
                    field2289 -= 2;
                    String var286 = field2293[field2289];
                    String var287 = field2293[field2289 + 1];
                    int var288 = field2284[--field2292];
                    field2284[field2292++] = var286.indexOf(var287, var288);
                    return;
                }
                if (arg0 == 4122) {
                    int var289 = field2284[--field2292];
                    field2284[field2292++] = Character.toLowerCase((char) var289);
                    return;
                }
                if (arg0 == 4123) {
                    int var290 = field2284[--field2292];
                    field2284[field2292++] = Character.toUpperCase((char) var290);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var291 = field2284[--field2292] != 0;
                    int var292 = field2284[--field2292];
                    field2293[field2289++] = class250.method1590(var291, 0, (long) var292, 68, class370.field5530);
                    return;
                }
                if (arg0 == 4125) {
                    String var293 = field2293[--field2289];
                    int var294 = field2284[--field2292];
                    class12 var295 = class114.method842(-118, class420.field6181, 0, var294);
                    field2284[field2292++] = var295.method100(20, class402.field5901, var293);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var296 = field2284[--field2292];
                    field2293[field2289++] = class8.field111.method3077(101, var296).field2569;
                    return;
                }
                if (arg0 == 4201) {
                    field2292 -= 2;
                    int var297 = field2284[field2292];
                    int var298 = field2284[field2292 + 1];
                    class172 var299 = class8.field111.method3077(96, var297);
                    if (var298 >= 1 && var298 <= 5 && var299.field2606[var298 - 1] != null) {
                        field2293[field2289++] = var299.field2606[var298 - 1];
                        return;
                    }
                    field2293[field2289++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field2292 -= 2;
                    int var300 = field2284[field2292];
                    int var301 = field2284[field2292 + 1];
                    class172 var302 = class8.field111.method3077(37, var300);
                    if (var301 >= 1 && var301 <= 5 && var302.field2593[var301 - 1] != null) {
                        field2293[field2289++] = var302.field2593[var301 - 1];
                        return;
                    }
                    field2293[field2289++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var303 = field2284[--field2292];
                    field2284[field2292++] = class8.field111.method3077(112, var303).field2555;
                    return;
                }
                if (arg0 == 4204) {
                    int var304 = field2284[--field2292];
                    field2284[field2292++] = class8.field111.method3077(-124, var304).field2566 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var305 = field2284[--field2292];
                    class172 var306 = class8.field111.method3077(101, var305);
                    if (var306.field2589 == -1 && var306.field2602 >= 0) {
                        field2284[field2292++] = var306.field2602;
                        return;
                    }
                    field2284[field2292++] = var305;
                    return;
                }
                if (arg0 == 4206) {
                    int var307 = field2284[--field2292];
                    class172 var308 = class8.field111.method3077(-123, var307);
                    if (var308.field2589 >= 0 && var308.field2602 >= 0) {
                        field2284[field2292++] = var308.field2602;
                        return;
                    }
                    field2284[field2292++] = var307;
                    return;
                }
                if (arg0 == 4207) {
                    int var309 = field2284[--field2292];
                    field2284[field2292++] = class8.field111.method3077(-124, var309).field2614 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field2292 -= 2;
                    int var310 = field2284[field2292];
                    int var311 = field2284[field2292 + 1];
                    class93 var312 = class219.field3164.method2570((byte) -32, var311);
                    if (var312.method748((byte) 116)) {
                        field2293[field2289++] = class8.field111.method3077(88, var310).method1231(var311, var312.field1525, 78);
                        return;
                    }
                    field2284[field2292++] = class8.field111.method3077(41, var310).method1226(0, var311, var312.field1529);
                    return;
                }
                if (arg0 == 4209) {
                    field2292 -= 2;
                    int var313 = field2284[field2292];
                    int var314 = field2284[field2292 + 1] - 1;
                    class172 var315 = class8.field111.method3077(21, var313);
                    if (var315.field2607 == var314) {
                        field2284[field2292++] = var315.field2580;
                        return;
                    }
                    if (var315.field2588 == var314) {
                        field2284[field2292++] = var315.field2562;
                        return;
                    }
                    field2284[field2292++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var316 = field2293[--field2289];
                    int var317 = field2284[--field2292];
                    class96.method764(var317 == 1, var316, false);
                    field2284[field2292++] = class95.field1554;
                    return;
                }
                if (arg0 == 4211) {
                    if (class305.field4375 != null && class76.field1254 < class95.field1554) {
                        field2284[field2292++] = class305.field4375[class76.field1254++] & 0xFFFF;
                        return;
                    }
                    field2284[field2292++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class76.field1254 = 0;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field2292 -= 2;
                    int var318 = field2284[field2292];
                    int var319 = field2284[field2292 + 1];
                    class93 var320 = class219.field3164.method2570((byte) -32, var319);
                    if (var320.method748((byte) 38)) {
                        field2293[field2289++] = class500.field7358.method1605((byte) -117, var318).method1057(var319, var320.field1525, (byte) 71);
                        return;
                    }
                    field2284[field2292++] = class500.field7358.method1605((byte) -117, var318).method1062(var319, (byte) 123, var320.field1529);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field2292 -= 2;
                    int var321 = field2284[field2292];
                    int var322 = field2284[field2292 + 1];
                    class93 var323 = class219.field3164.method2570((byte) -32, var322);
                    if (var323.method748((byte) 27)) {
                        field2293[field2289++] = class246.field3567.method609(127, var321).method3015(var323.field1525, var322, 115);
                        return;
                    }
                    field2284[field2292++] = class246.field3567.method609(120, var321).method3013(var322, var323.field1529, 4);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field2292 -= 2;
                    int var324 = field2284[field2292];
                    int var325 = field2284[field2292 + 1];
                    class93 var326 = class219.field3164.method2570((byte) -32, var325);
                    if (var326.method748((byte) -89)) {
                        field2293[field2289++] = class418.field6177.method3030(-12345, var324).method2688(var326.field1525, -18700, var325);
                        return;
                    }
                    field2284[field2292++] = class418.field6177.method3030(-12345, var324).method2686(var326.field1529, var325, true);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var327 = field2284[--field2292];
                class441 var328 = class4.field64.method1199(var327, (byte) -40);
                if (var328.field6465 != null && var328.field6465.length > 0) {
                    int var329 = 0;
                    int var330 = var328.field6436[0];
                    for (int var331 = 1; var331 < var328.field6465.length; var331++) {
                        if (var328.field6436[var331] > var330) {
                            var329 = var331;
                            var330 = var328.field6436[var331];
                        }
                    }
                    field2284[field2292++] = var328.field6465[var329];
                    return;
                }
                field2284[field2292++] = var328.field6446;
                return;
            }
        } else {
            class58 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class421.method2578(-4179, field2284[--field2292]);
            } else {
                var47 = arg1 ? field2276 : field2274;
            }
            if (arg0 == 1300) {
                int var48 = field2284[--field2292] - 1;
                if (var48 >= 0 && var48 <= 9) {
                    var47.method411(103, var48, field2293[--field2289]);
                    return;
                }
                field2289--;
                return;
            }
            if (arg0 == 1301) {
                field2292 -= 2;
                int var49 = field2284[field2292];
                int var50 = field2284[field2292 + 1];
                if (var49 == -1 && var50 == -1) {
                    var47.field970 = null;
                    return;
                }
                var47.field970 = class155.method1123(var50, var49, (byte) -118);
                return;
            }
            if (arg0 == 1302) {
                int var51 = field2284[--field2292];
                if (class122.field1909 != var51 && class36.field542 != var51 && class11.field175 != var51) {
                    return;
                }
                var47.field913 = var51;
                return;
            }
            if (arg0 == 1303) {
                var47.field934 = field2284[--field2292];
                return;
            }
            if (arg0 == 1304) {
                var47.field887 = field2284[--field2292];
                return;
            }
            if (arg0 == 1305) {
                var47.field992 = field2293[--field2289];
                return;
            }
            if (arg0 == 1306) {
                var47.field907 = field2293[--field2289];
                return;
            }
            if (arg0 == 1307) {
                var47.field941 = null;
                return;
            }
            if (arg0 == 1308) {
                var47.field986 = field2284[--field2292];
                var47.field951 = field2284[--field2292];
                return;
            }
            if (arg0 == 1309) {
                int var52 = field2284[--field2292];
                int var53 = field2284[--field2292];
                if (var53 >= 1 && var53 <= 10) {
                    var47.method421(true, var53 - 1, var52);
                }
                return;
            }
            if (arg0 == 1310) {
                var47.field832 = field2293[--field2289];
                return;
            }
            if (arg0 == 1311) {
                var47.field935 = field2284[--field2292];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var54;
                int var55;
                int var56;
                if (arg0 == 1312) {
                    field2292 -= 3;
                    var54 = field2284[field2292] - 1;
                    var55 = field2284[field2292 + 1];
                    var56 = field2284[field2292 + 2];
                    if (var54 < 0 || var54 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field2292 -= 2;
                    var54 = 10;
                    var55 = field2284[field2292];
                    var56 = field2284[field2292 + 1];
                }
                if (var47.field878 == null) {
                    if (var55 == 0) {
                        return;
                    }
                    var47.field878 = new byte[11];
                    var47.field952 = new byte[11];
                    var47.field911 = new int[11];
                }
                var47.field878[var54] = (byte) var55;
                if (var55 == 0) {
                    var47.field927 = false;
                    for (int var57 = 0; var57 < var47.field878.length; var57++) {
                        if (var47.field878[var57] != 0) {
                            var47.field927 = true;
                            break;
                        }
                    }
                } else {
                    var47.field927 = true;
                }
                var47.field952[var54] = (byte) var56;
                return;
            }
            if (arg0 == 1314) {
                var47.field931 = field2284[--field2292];
                return;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(IZ)V")
    private static final void method1085(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field2284[field2292++] = class509.field7439;
                return;
            }
            if (arg0 == 5001) {
                field2292 -= 3;
                class509.field7439 = field2284[field2292];
                class128.field1946 = class379.method2401((byte) -96, field2284[field2292 + 1]);
                if (class128.field1946 == null) {
                    class128.field1946 = class246.field3568;
                }
                class402.field5904 = field2284[field2292 + 2];
                field2273++;
                class114.method841(false, class87.field1468);
                class86.field1436.method1923((byte) 62, class509.field7439);
                class86.field1436.method1923((byte) 62, class128.field1946.field302);
                class86.field1436.method1923((byte) 62, class402.field5904);
                return;
            }
            if (arg0 == 5002) {
                field2289 -= 2;
                String var2 = field2293[field2289];
                String var3 = field2293[field2289 + 1];
                field2292 -= 2;
                int var4 = field2284[field2292];
                int var5 = field2284[field2292 + 1];
                if (var3 == null) {
                    var3 = "";
                }
                if (var3.length() > 80) {
                    var3 = var3.substring(0, 80);
                }
                field2294++;
                class114.method841(false, class219.field3163);
                class86.field1436.method1923((byte) 62, class8.method57(-104, var2) + class8.method57(-105, var3) + 2);
                class86.field1436.method1882((byte) -113, var2);
                class86.field1436.method1923((byte) 62, var4 - 1);
                class86.field1436.method1923((byte) 62, var5);
                class86.field1436.method1882((byte) 60, var3);
                return;
            }
            if (arg0 == 5003) {
                int var6 = field2284[--field2292];
                String var7 = null;
                if (var6 < 100) {
                    var7 = class415.field6138[var6];
                }
                if (var7 == null) {
                    var7 = "";
                }
                field2293[field2289++] = var7;
                return;
            }
            if (arg0 == 5004) {
                int var8 = field2284[--field2292];
                int var9 = -1;
                if (var8 < 100 && class415.field6138[var8] != null) {
                    var9 = class142.field2111[var8];
                }
                field2284[field2292++] = var9;
                return;
            }
            if (arg0 == 5005) {
                if (class128.field1946 == null) {
                    field2284[field2292++] = -1;
                    return;
                }
                field2284[field2292++] = class128.field1946.field302;
                return;
            }
            if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
                String var10 = field2293[--field2289];
                method1089(var10, arg0);
                return;
            }
            if (arg0 == 5009) {
                field2289 -= 2;
                String var11 = field2293[field2289];
                String var12 = field2293[field2289 + 1];
                if (class42.field642 != 0 || (!class170.field2554 || class101.field1622) && !class72.field1209) {
                    field2285++;
                    class114.method841(false, class21.field304);
                    class86.field1436.method1923((byte) 62, 0);
                    int var13 = class86.field1436.field4333;
                    class86.field1436.method1882((byte) 58, var11);
                    class527.method3109(84, var12, class86.field1436);
                    class86.field1436.method1897(class86.field1436.field4333 - var13, 255);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var14 = field2284[--field2292];
                String var15 = null;
                if (var14 < 100) {
                    var15 = class168.field2526[var14];
                }
                if (var15 == null) {
                    var15 = "";
                }
                field2293[field2289++] = var15;
                return;
            }
            if (arg0 == 5011) {
                int var16 = field2284[--field2292];
                String var17 = null;
                if (var16 < 100) {
                    var17 = class118.field1858[var16];
                }
                if (var17 == null) {
                    var17 = "";
                }
                field2293[field2289++] = var17;
                return;
            }
            if (arg0 == 5012) {
                int var18 = field2284[--field2292];
                int var19 = -1;
                if (var18 < 100) {
                    var19 = class383.field5692[var18];
                }
                field2284[field2292++] = var19;
                return;
            }
            if (arg0 == 5015) {
                String var20;
                if (class95.field1558 == null || class95.field1558.field1077 == null) {
                    var20 = class371.field5564;
                } else {
                    var20 = class95.field1558.method561(13762, true);
                }
                field2293[field2289++] = var20;
                return;
            }
            if (arg0 == 5016) {
                field2284[field2292++] = class402.field5904;
                return;
            }
            if (arg0 == 5017) {
                field2284[field2292++] = class471.field6940;
                return;
            }
            if (arg0 == 5018) {
                int var21 = field2284[--field2292];
                int var22 = 0;
                if (var21 < 100 && class415.field6138[var21] != null) {
                    var22 = class142.field2111[var21];
                }
                field2284[field2292++] = var22;
                return;
            }
            if (arg0 == 5019) {
                int var23 = field2284[--field2292];
                String var24 = null;
                if (var23 < 100) {
                    var24 = class231.field3375[var23];
                }
                if (var24 == null) {
                    var24 = "";
                }
                field2293[field2289++] = var24;
                return;
            }
            if (arg0 == 5020) {
                String var25;
                if (class95.field1558 == null || class95.field1558.field1077 == null) {
                    var25 = class371.field5564;
                } else {
                    var25 = class95.field1558.method555(false, (byte) -66);
                }
                field2293[field2289++] = var25;
                return;
            }
            if (arg0 == 5050) {
                int var26 = field2284[--field2292];
                field2293[field2289++] = class292.field4185.method2199((byte) 102, var26).field482;
                return;
            }
            if (arg0 == 5051) {
                int var27 = field2284[--field2292];
                class30 var28 = class292.field4185.method2199((byte) -98, var27);
                if (var28.field490 == null) {
                    field2284[field2292++] = 0;
                    return;
                }
                field2284[field2292++] = var28.field490.length;
                return;
            }
            if (arg0 == 5052) {
                field2292 -= 2;
                int var29 = field2284[field2292];
                int var30 = field2284[field2292 + 1];
                class30 var31 = class292.field4185.method2199((byte) -118, var29);
                int var32 = var31.field490[var30];
                field2284[field2292++] = var32;
                return;
            }
            if (arg0 == 5053) {
                int var33 = field2284[--field2292];
                class30 var34 = class292.field4185.method2199((byte) -118, var33);
                if (var34.field491 == null) {
                    field2284[field2292++] = 0;
                    return;
                }
                field2284[field2292++] = var34.field491.length;
                return;
            }
            if (arg0 == 5054) {
                field2292 -= 2;
                int var35 = field2284[field2292];
                int var36 = field2284[field2292 + 1];
                field2284[field2292++] = class292.field4185.method2199((byte) -104, var35).field491[var36];
                return;
            }
            if (arg0 == 5055) {
                int var37 = field2284[--field2292];
                field2293[field2289++] = class121.field1892.method1689(var37, (byte) -100).method3009(80);
                return;
            }
            if (arg0 == 5056) {
                int var38 = field2284[--field2292];
                class509 var39 = class121.field1892.method1689(var38, (byte) -87);
                if (var39.field7434 == null) {
                    field2284[field2292++] = 0;
                    return;
                }
                field2284[field2292++] = var39.field7434.length;
                return;
            }
            if (arg0 == 5057) {
                field2292 -= 2;
                int var40 = field2284[field2292];
                int var41 = field2284[field2292 + 1];
                field2284[field2292++] = class121.field1892.method1689(var40, (byte) -68).field7434[var41];
                return;
            }
            if (arg0 == 5058) {
                field2278 = new class274();
                field2278.field3959 = field2284[--field2292];
                field2278.field3953 = class121.field1892.method1689(field2278.field3959, (byte) -120);
                field2278.field3963 = new int[field2278.field3953.method3011(-93)];
                return;
            }
            if (arg0 == 5059) {
                field2295++;
                class114.method841(false, class493.field7190);
                class86.field1436.method1923((byte) 62, 0);
                int var42 = class86.field1436.field4333;
                class86.field1436.method1923((byte) 62, 0);
                class86.field1436.method1874(field2278.field3959, (byte) -110);
                field2278.field3953.method3004(class86.field1436, field2278.field3963, (byte) -125);
                class86.field1436.method1897(class86.field1436.field4333 - var42, 255);
                return;
            }
            if (arg0 == 5060) {
                String var43 = field2293[--field2289];
                field2286++;
                class114.method841(false, class123.field1913);
                class86.field1436.method1923((byte) 62, 0);
                int var44 = class86.field1436.field4333;
                class86.field1436.method1882((byte) -112, var43);
                class86.field1436.method1874(field2278.field3959, (byte) -110);
                field2278.field3953.method3004(class86.field1436, field2278.field3963, (byte) -125);
                class86.field1436.method1897(class86.field1436.field4333 - var44, 255);
                return;
            }
            if (arg0 == 5061) {
                field2295++;
                class114.method841(false, class493.field7190);
                class86.field1436.method1923((byte) 62, 0);
                int var45 = class86.field1436.field4333;
                class86.field1436.method1923((byte) 62, 1);
                class86.field1436.method1874(field2278.field3959, (byte) -110);
                field2278.field3953.method3004(class86.field1436, field2278.field3963, (byte) -125);
                class86.field1436.method1897(class86.field1436.field4333 - var45, 255);
                return;
            }
            if (arg0 == 5062) {
                field2292 -= 2;
                int var46 = field2284[field2292];
                int var47 = field2284[field2292 + 1];
                field2284[field2292++] = class292.field4185.method2199((byte) -107, var46).field488[var47];
                return;
            }
            if (arg0 == 5063) {
                field2292 -= 2;
                int var48 = field2284[field2292];
                int var49 = field2284[field2292 + 1];
                field2284[field2292++] = class292.field4185.method2199((byte) 86, var48).field485[var49];
                return;
            }
            if (arg0 == 5064) {
                field2292 -= 2;
                int var50 = field2284[field2292];
                int var51 = field2284[field2292 + 1];
                if (var51 == -1) {
                    field2284[field2292++] = -1;
                    return;
                }
                field2284[field2292++] = class292.field4185.method2199((byte) -106, var50).method247((char) var51, (byte) -77);
                return;
            }
            if (arg0 == 5065) {
                field2292 -= 2;
                int var52 = field2284[field2292];
                int var53 = field2284[field2292 + 1];
                if (var53 == -1) {
                    field2284[field2292++] = -1;
                    return;
                }
                field2284[field2292++] = class292.field4185.method2199((byte) 29, var52).method252((char) var53, (byte) -79);
                return;
            }
            if (arg0 == 5066) {
                int var54 = field2284[--field2292];
                field2284[field2292++] = class121.field1892.method1689(var54, (byte) -84).method3011(-76);
                return;
            }
            if (arg0 == 5067) {
                field2292 -= 2;
                int var55 = field2284[field2292];
                int var56 = field2284[field2292 + 1];
                int var57 = class121.field1892.method1689(var55, (byte) -91).method3003(var56, true).field6865;
                field2284[field2292++] = var57;
                return;
            }
            if (arg0 == 5068) {
                field2292 -= 2;
                int var58 = field2284[field2292];
                int var59 = field2284[field2292 + 1];
                field2278.field3963[var58] = var59;
                return;
            }
            if (arg0 == 5069) {
                field2292 -= 2;
                int var60 = field2284[field2292];
                int var61 = field2284[field2292 + 1];
                field2278.field3963[var60] = var61;
                return;
            }
            if (arg0 == 5070) {
                field2292 -= 3;
                int var62 = field2284[field2292];
                int var63 = field2284[field2292 + 1];
                int var64 = field2284[field2292 + 2];
                class509 var65 = class121.field1892.method1689(var62, (byte) -126);
                if (var65.method3003(var63, true).field6865 != 0) {
                    throw new RuntimeException("bad command");
                }
                field2284[field2292++] = var65.method3012((byte) -74, var64, var63);
                return;
            }
            if (arg0 == 5071) {
                String var66 = field2293[--field2289];
                boolean var67 = field2284[--field2292] == 1;
                class399.method2489(var67, var66, 0);
                field2284[field2292++] = class95.field1554;
                return;
            }
            if (arg0 == 5072) {
                if (class305.field4375 != null && class76.field1254 < class95.field1554) {
                    field2284[field2292++] = class305.field4375[class76.field1254++] & 0xFFFF;
                    return;
                }
                field2284[field2292++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class76.field1254 = 0;
                return;
            }
            if (arg0 == 5074) {
                field2295++;
                class114.method841(false, class493.field7190);
                class86.field1436.method1923((byte) 62, 0);
                int var68 = class86.field1436.field4333;
                class86.field1436.method1923((byte) 62, 2);
                class86.field1436.method1874(field2278.field3959, (byte) -110);
                field2278.field3953.method3004(class86.field1436, field2278.field3963, (byte) -125);
                class86.field1436.method1897(class86.field1436.field4333 - var68, 255);
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class351.field5334.method1767(86, (byte) -125)) {
                    field2284[field2292++] = 1;
                    return;
                }
                field2284[field2292++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class351.field5334.method1767(82, (byte) -108)) {
                    field2284[field2292++] = 1;
                    return;
                }
                field2284[field2292++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class351.field5334.method1767(81, (byte) -121)) {
                    field2284[field2292++] = 1;
                    return;
                }
                field2284[field2292++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class309.method1940(field2284[--field2292], (byte) -65);
                return;
            }
            if (arg0 == 5201) {
                field2284[field2292++] = class135.method992((byte) 111);
                return;
            }
            if (arg0 == 5205) {
                class270.method1735(-1, field2284[--field2292], false, -1, (byte) 76);
                return;
            }
            if (arg0 == 5206) {
                int var69 = field2284[--field2292];
                class145 var70 = class2.method19(var69 >> 14 & 0x3FFF, var69 & 0x3FFF);
                if (var70 == null) {
                    field2284[field2292++] = -1;
                    return;
                }
                field2284[field2292++] = var70.field2136;
                return;
            }
            if (arg0 == 5207) {
                class145 var71 = class2.method25(field2284[--field2292]);
                if (var71 != null && var71.field2147 != null) {
                    field2293[field2289++] = var71.field2147;
                    return;
                }
                field2293[field2289++] = "";
                return;
            }
            if (arg0 == 5208) {
                field2284[field2292++] = class177.field2681;
                field2284[field2292++] = class165.field2479;
                return;
            }
            if (arg0 == 5209) {
                field2284[field2292++] = class25.field439 + class2.field44;
                field2284[field2292++] = class33.field522 + class2.field40;
                return;
            }
            if (arg0 == 5210) {
                int var72 = field2284[--field2292];
                class145 var73 = class2.method25(var72);
                if (var73 == null) {
                    field2284[field2292++] = 0;
                    field2284[field2292++] = 0;
                    return;
                }
                field2284[field2292++] = var73.field2129 >> 14 & 0x3FFF;
                field2284[field2292++] = var73.field2129 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var74 = field2284[--field2292];
                class145 var75 = class2.method25(var74);
                if (var75 == null) {
                    field2284[field2292++] = 0;
                    field2284[field2292++] = 0;
                    return;
                }
                field2284[field2292++] = var75.field2140 - var75.field2142;
                field2284[field2292++] = var75.field2141 - var75.field2143;
                return;
            }
            if (arg0 == 5212) {
                class42 var76 = class294.method1821(-118);
                if (var76 == null) {
                    field2284[field2292++] = -1;
                    field2284[field2292++] = -1;
                    return;
                }
                field2284[field2292++] = var76.field649;
                int var77 = var76.field646 << 28 | class2.field44 + var76.field644 << 14 | class2.field40 + var76.field641;
                field2284[field2292++] = var77;
                return;
            }
            if (arg0 == 5213) {
                class42 var78 = class31.method257(61);
                if (var78 == null) {
                    field2284[field2292++] = -1;
                    field2284[field2292++] = -1;
                    return;
                }
                field2284[field2292++] = var78.field649;
                int var79 = var78.field646 << 28 | class2.field44 + var78.field644 << 14 | class2.field40 + var78.field641;
                field2284[field2292++] = var79;
                return;
            }
            if (arg0 == 5214) {
                int var80 = field2284[--field2292];
                class145 var81 = class341.method2228(-91);
                if (var81 != null) {
                    boolean var82 = var81.method1044(var80 & 0x3FFF, var80 >> 14 & 0x3FFF, false, var80 >> 28 & 0x3, field2299);
                    if (var82) {
                        class53.method383(field2299[2], (byte) -88, field2299[1]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field2292 -= 2;
                int var83 = field2284[field2292];
                int var84 = field2284[field2292 + 1];
                class111 var85 = class2.method22(var83 >> 14 & 0x3FFF, var83 & 0x3FFF);
                boolean var86 = false;
                for (class145 var87 = (class145) var85.method820(true); var87 != null; var87 = (class145) var85.method816(117)) {
                    if (var87.field2136 == var84) {
                        var86 = true;
                        break;
                    }
                }
                if (var86) {
                    field2284[field2292++] = 1;
                    return;
                }
                field2284[field2292++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var88 = field2284[--field2292];
                class145 var89 = class2.method25(var88);
                if (var89 == null) {
                    field2284[field2292++] = -1;
                    return;
                }
                field2284[field2292++] = var89.field2133;
                return;
            }
            if (arg0 == 5220) {
                field2284[field2292++] = class73.field1229 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var90 = field2284[--field2292];
                class53.method383(var90 & 0x3FFF, (byte) -128, var90 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class145 var91 = class341.method2228(-118);
                if (var91 != null) {
                    boolean var92 = var91.method1048(class25.field439 + class2.field44, field2299, class33.field522 + class2.field40, 1389751532);
                    if (var92) {
                        field2284[field2292++] = field2299[1];
                        field2284[field2292++] = field2299[2];
                        return;
                    }
                    field2284[field2292++] = -1;
                    field2284[field2292++] = -1;
                    return;
                }
                field2284[field2292++] = -1;
                field2284[field2292++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field2292 -= 2;
                int var93 = field2284[field2292];
                int var94 = field2284[field2292 + 1];
                class270.method1735(var94 & 0x3FFF, var93, false, var94 >> 14 & 0x3FFF, (byte) 80);
                return;
            }
            if (arg0 == 5224) {
                int var95 = field2284[--field2292];
                class145 var96 = class341.method2228(-106);
                if (var96 != null) {
                    boolean var97 = var96.method1044(var95 & 0x3FFF, var95 >> 14 & 0x3FFF, false, var95 >> 28 & 0x3, field2299);
                    if (var97) {
                        field2284[field2292++] = field2299[1];
                        field2284[field2292++] = field2299[2];
                        return;
                    }
                    field2284[field2292++] = -1;
                    field2284[field2292++] = -1;
                    return;
                }
                field2284[field2292++] = -1;
                field2284[field2292++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var98 = field2284[--field2292];
                class145 var99 = class341.method2228(-86);
                if (var99 != null) {
                    boolean var100 = var99.method1048(var98 >> 14 & 0x3FFF, field2299, var98 & 0x3FFF, 1389751532);
                    if (var100) {
                        field2284[field2292++] = field2299[1];
                        field2284[field2292++] = field2299[2];
                        return;
                    }
                    field2284[field2292++] = -1;
                    field2284[field2292++] = -1;
                    return;
                }
                field2284[field2292++] = -1;
                field2284[field2292++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class298.method1837(3, field2284[--field2292]);
                return;
            }
            if (arg0 == 5227) {
                field2292 -= 2;
                int var101 = field2284[field2292];
                int var102 = field2284[field2292 + 1];
                class270.method1735(var102 & 0x3FFF, var101, true, var102 >> 14 & 0x3FFF, (byte) 96);
                return;
            }
            if (arg0 == 5228) {
                class162.field2453 = field2284[--field2292] == 1;
                return;
            }
            if (arg0 == 5229) {
                field2284[field2292++] = class162.field2453 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var103 = field2284[--field2292];
                class314.method1983(100, var103);
                return;
            }
            if (arg0 == 5231) {
                field2292 -= 2;
                int var104 = field2284[field2292];
                boolean var105 = field2284[field2292 + 1] == 1;
                if (class53.field777 != null) {
                    class439 var106 = class53.field777.method2485(113, (long) var104);
                    if (var106 != null && !var105) {
                        var106.method2663(-118);
                        return;
                    }
                    if (var106 == null && var105) {
                        class439 var107 = new class439();
                        class53.field777.method2486(-109, var107, (long) var104);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var108 = field2284[--field2292];
                if (class53.field777 != null) {
                    class439 var109 = class53.field777.method2485(110, (long) var108);
                    field2284[field2292++] = var109 == null ? 0 : 1;
                    return;
                }
                field2284[field2292++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field2292 -= 2;
                int var110 = field2284[field2292];
                boolean var111 = field2284[field2292 + 1] == 1;
                if (class460.field6787 != null) {
                    class439 var112 = class460.field6787.method2485(40, (long) var110);
                    if (var112 != null && !var111) {
                        var112.method2663(-113);
                        return;
                    }
                    if (var112 == null && var111) {
                        class439 var113 = new class439();
                        class460.field6787.method2486(-98, var113, (long) var110);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var114 = field2284[--field2292];
                if (class460.field6787 != null) {
                    class439 var115 = class460.field6787.method2485(98, (long) var114);
                    field2284[field2292++] = var115 == null ? 0 : 1;
                    return;
                }
                field2284[field2292++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field2284[field2292++] = class2.field19 == null ? -1 : class2.field19.field2136;
                return;
            }
            if (arg0 == 5236) {
                field2292 -= 2;
                int var116 = field2284[field2292];
                int var117 = field2284[field2292 + 1];
                int var118 = var117 >> 14 & 0x3FFF;
                int var119 = var117 & 0x3FFF;
                int var120 = class222.method1469(-73, var118, var116, var119);
                if (var120 < 0) {
                    field2284[field2292++] = -1;
                    return;
                }
                field2284[field2292++] = var120;
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field2292 -= 2;
                int var121 = field2284[field2292];
                int var122 = field2284[field2292 + 1];
                class412.method2542(var122, false, var121, (byte) 77, 3);
                field2284[field2292++] = class320.field4577 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class320.field4577 != null) {
                    class412.method2542(-1, false, -1, (byte) 118, class397.field5830.field124);
                }
                return;
            }
            if (arg0 == 5302) {
                class207[] var123 = class490.method2936(-801);
                field2284[field2292++] = var123.length;
                return;
            }
            if (arg0 == 5303) {
                int var124 = field2284[--field2292];
                class207[] var125 = class490.method2936(-801);
                field2284[field2292++] = var125[var124].field2973;
                field2284[field2292++] = var125[var124].field2975;
                return;
            }
            if (arg0 == 5305) {
                int var126 = class397.field5830.field132;
                int var127 = class397.field5830.field127;
                int var128 = -1;
                class207[] var129 = class490.method2936(-801);
                for (int var130 = 0; var130 < var129.length; var130++) {
                    class207 var131 = var129[var130];
                    if (var131.field2973 == var126 && var131.field2975 == var127) {
                        var128 = var130;
                        break;
                    }
                }
                field2284[field2292++] = var128;
                return;
            }
            if (arg0 == 5306) {
                field2284[field2292++] = class428.method2611(1);
                return;
            }
            if (arg0 == 5307) {
                int var132 = field2284[--field2292];
                if (var132 >= 1 && var132 <= 2) {
                    class412.method2542(-1, false, -1, (byte) 90, var132);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field2284[field2292++] = class397.field5830.field124;
                return;
            }
            if (arg0 == 5309) {
                int var133 = field2284[--field2292];
                if (var133 >= 1 && var133 <= 2) {
                    class397.field5830.field124 = var133;
                    class397.field5830.method1299((byte) 100, class112.field1785);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field2289 -= 2;
                String var134 = field2293[field2289];
                String var135 = field2293[field2289 + 1];
                int var136 = field2284[--field2292];
                field2290++;
                class114.method841(false, class222.field3208);
                class86.field1436.method1923((byte) 62, class8.method57(-110, var134) + class8.method57(-127, var135) + 1);
                class86.field1436.method1882((byte) 70, var134);
                class86.field1436.method1882((byte) 120, var135);
                class86.field1436.method1923((byte) 62, var136);
                return;
            }
            if (arg0 == 5401) {
                field2292 -= 2;
                class379.field5650[field2284[field2292]] = (short) class86.method700(field2284[field2292 + 1], true);
                class8.field111.method3075(0);
                class8.field111.method3076(-2);
                class500.field7358.method1607(-3);
                class67.method582(-25099);
                return;
            }
            if (arg0 == 5405) {
                field2292 -= 2;
                int var137 = field2284[field2292];
                int var138 = field2284[field2292 + 1];
                if (var137 >= 0 && var137 < 2) {
                    class173.field2650[var137] = new int[var138 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field2292 -= 7;
                int var139 = field2284[field2292];
                int var140 = field2284[field2292 + 1] << 1;
                int var141 = field2284[field2292 + 2];
                int var142 = field2284[field2292 + 3];
                int var143 = field2284[field2292 + 4];
                int var144 = field2284[field2292 + 5];
                int var145 = field2284[field2292 + 6];
                if (var139 >= 0 && var139 < 2 && class173.field2650[var139] != null && var140 >= 0 && var140 < class173.field2650[var139].length) {
                    class173.field2650[var139][var140] = new int[] { (var141 >> 14 & 0x3FFF) << 7, var142, (var141 & 0x3FFF) << 7, var145 };
                    class173.field2650[var139][var140 + 1] = new int[] { (var143 >> 14 & 0x3FFF) << 7, var144, (var143 & 0x3FFF) << 7 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var146 = class173.field2650[field2284[--field2292]].length >> 1;
                field2284[field2292++] = var146;
                return;
            }
            if (arg0 == 5411) {
                if (class320.field4577 != null) {
                    class412.method2542(-1, false, -1, (byte) 100, class397.field5830.field124);
                }
                if (class409.field6029 != null) {
                    client.method1344((byte) 125);
                    System.exit(0);
                    return;
                }
                String var147 = class490.field7155 == null ? class489.method2929(0) : class490.field7155;
                class261.method1660((byte) -32, var147, false, class112.field1785, class399.field5865 == 1);
                return;
            }
            if (arg0 == 5419) {
                String var148 = "";
                if (class133.field2058 != null) {
                    if (class133.field2058.field1608 == null) {
                        var148 = class516.method3056(62, class133.field2058.field1605);
                    } else {
                        var148 = (String) class133.field2058.field1608;
                    }
                }
                field2293[field2289++] = var148;
                return;
            }
            if (arg0 == 5420) {
                field2284[field2292++] = class312.field4479 == 3 ? 1 : 0;
                return;
            }
            if (arg0 == 5421) {
                if (class320.field4577 != null) {
                    class412.method2542(-1, false, -1, (byte) 77, class397.field5830.field124);
                }
                String var149 = field2293[--field2289];
                boolean var150 = field2284[--field2292] == 1;
                String var151 = class489.method2929(0) + var149;
                class261.method1660((byte) -76, var151, var150, class112.field1785, class399.field5865 == 1);
                return;
            }
            if (arg0 == 5422) {
                field2289 -= 2;
                String var152 = field2293[field2289];
                String var153 = field2293[field2289 + 1];
                int var154 = field2284[--field2292];
                if (var152.length() > 0) {
                    if (class408.field6019 == null) {
                        class408.field6019 = new String[class251.field3635[class321.field4649.field3929]];
                    }
                    class408.field6019[var154] = var152;
                }
                if (var153.length() > 0) {
                    if (class239.field3482 == null) {
                        class239.field3482 = new String[class251.field3635[class321.field4649.field3929]];
                    }
                    class239.field3482[var154] = var153;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field2293[--field2289]);
                return;
            }
            if (arg0 == 5424) {
                field2292 -= 11;
                class131.field2015 = field2284[field2292];
                class438.field6393 = field2284[field2292 + 1];
                class445.field6532 = field2284[field2292 + 2];
                class7.field105 = field2284[field2292 + 3];
                class273.field3950 = field2284[field2292 + 4];
                class327.field5063 = field2284[field2292 + 5];
                class204.field2943 = field2284[field2292 + 6];
                class193.field2822 = field2284[field2292 + 7];
                class290.field4162 = field2284[field2292 + 8];
                class455.field6735 = field2284[field2292 + 9];
                class21.field306 = field2284[field2292 + 10];
                class460.field6798.method682(0, class273.field3950);
                class460.field6798.method682(0, class327.field5063);
                class460.field6798.method682(0, class204.field2943);
                class460.field6798.method682(0, class193.field2822);
                class460.field6798.method682(0, class290.field4162);
                class353.field5343 = null;
                class273.field3947 = null;
                class455.field6733 = null;
                class492.field7188 = null;
                class226.field3302 = null;
                class173.field2655 = null;
                class173.field2654 = null;
                class111.field1765 = null;
                class207.field2981 = true;
                return;
            }
            if (arg0 == 5425) {
                class442.method2684(-1);
                class207.field2981 = false;
                return;
            }
            if (arg0 == 5426) {
                field2292 -= 2;
                class520.field7642 = field2284[field2292];
                class183.field2751 = field2284[field2292 + 1];
                return;
            }
            if (arg0 == 5427) {
                field2292 -= 2;
                class40.field618 = field2284[field2292 + 1];
                return;
            }
            if (arg0 == 5428) {
                field2292 -= 2;
                int var155 = field2284[field2292];
                int var156 = field2284[field2292 + 1];
                field2284[field2292++] = class258.method1633(var156, 40, var155) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class92.method745(false, (byte) -95, field2293[--field2289]);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class426.method2606("accountcreated", class112.field1785.field4458, 21615);
                    return;
                } catch (Throwable var266) {
                    return;
                }
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field2292 -= 4;
                int var157 = field2284[field2292];
                int var158 = field2284[field2292 + 1];
                int var159 = field2284[field2292 + 2];
                int var160 = field2284[field2292 + 3];
                class415.method2558(true, false, (var157 & 0x3FFF) - class465.field6840, var158, (var157 >> 14 & 0x3FFF) - class483.field7082, var159, var160);
                return;
            }
            if (arg0 == 5501) {
                field2292 -= 4;
                int var161 = field2284[field2292];
                int var162 = field2284[field2292 + 1];
                int var163 = field2284[field2292 + 2];
                int var164 = field2284[field2292 + 3];
                class206.method1383(-19442, var164, var162, (var161 & 0x3FFF) - class465.field6840, (var161 >> 14 & 0x3FFF) - class483.field7082, var163);
                return;
            }
            if (arg0 == 5502) {
                field2292 -= 6;
                int var165 = field2284[field2292];
                if (var165 >= 2) {
                    throw new RuntimeException();
                }
                class258.field3726 = var165;
                int var166 = field2284[field2292 + 1];
                if (var166 + 1 >= class173.field2650[class258.field3726].length >> 1) {
                    throw new RuntimeException();
                }
                class214.field3088 = var166;
                class172.field2600 = 0;
                class439.field6407 = field2284[field2292 + 2];
                class222.field3220 = field2284[field2292 + 3];
                int var167 = field2284[field2292 + 4];
                if (var167 >= 2) {
                    throw new RuntimeException();
                }
                class98.field1598 = var167;
                int var168 = field2284[field2292 + 5];
                if (var168 + 1 >= class173.field2650[class98.field1598].length >> 1) {
                    throw new RuntimeException();
                }
                class372.field5578 = var168;
                class403.field5944 = 3;
                return;
            }
            if (arg0 == 5503) {
                class8.method60(-87);
                return;
            }
            if (arg0 == 5504) {
                field2292 -= 2;
                class211.method1411(field2284[field2292 + 1], field2284[field2292], 0, false);
                return;
            }
            if (arg0 == 5505) {
                field2284[field2292++] = (int) class382.field5684 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field2284[field2292++] = (int) class66.field1161 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class451.method2713((byte) 83);
                return;
            }
            if (arg0 == 5508) {
                class295.method1822(-1);
                return;
            }
            if (arg0 == 5509) {
                class159.method1147(-31166);
                return;
            }
            if (arg0 == 5510) {
                class222.method1464((byte) 90);
                return;
            }
            if (arg0 == 5511) {
                int var169 = field2284[--field2292];
                int var170 = var169 >> 14 & 0x3FFF;
                int var171 = var169 & 0x3FFF;
                int var172 = var170 - class483.field7082;
                if (var172 < 0) {
                    var172 = 0;
                } else if (var172 >= class237.field3436) {
                    var172 = class237.field3436;
                }
                int var173 = var171 - class465.field6840;
                if (var173 < 0) {
                    var173 = 0;
                } else if (var173 >= class83.field1366) {
                    var173 = class83.field1366;
                }
                class117.field1850 = (var172 << 7) + 64;
                class380.field5663 = (var173 << 7) + 64;
                class403.field5944 = 4;
                return;
            }
            if (arg0 == 5512) {
                class379.method2405(-1);
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field2289 -= 2;
                String var174 = field2293[field2289];
                String var175 = field2293[field2289 + 1];
                int var176 = field2284[--field2292];
                if (class17.field266 != 10) {
                    return;
                }
                if (class405.field5964 == 0 && class112.field1784 == 0 && class267.field3859 == 0 && class169.field2541 == 0) {
                    class200.method1363(var176, var175, (byte) -71, var174);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class64.method568(-114);
                return;
            }
            if (arg0 == 5602) {
                if (class112.field1784 == 0) {
                    class72.field1206 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field2292 -= 4;
                if (class17.field266 != 10) {
                    return;
                }
                if (class405.field5964 == 0 && class112.field1784 == 0 && class267.field3859 == 0 && class169.field2541 == 0) {
                    class520.method3071(field2284[field2292 + 1], true, field2284[field2292 + 3], field2284[field2292 + 2], field2284[field2292]);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field2289--;
                if (class17.field266 != 10) {
                    return;
                }
                if (class405.field5964 == 0 && class112.field1784 == 0 && class267.field3859 == 0 && class169.field2541 == 0) {
                    class529.method3137(0, class358.method2309(field2293[field2289], (byte) -83));
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field2289 -= 3;
                field2292 -= 7;
                if (class17.field266 != 10) {
                    return;
                }
                if (class405.field5964 == 0 && class112.field1784 == 0 && class267.field3859 == 0 && class169.field2541 == 0) {
                    class461.method2762(field2284[field2292 + 6] == 1, field2284[field2292 + 4] == 1, field2284[field2292 + 2], field2293[field2289 + 2], field2284[field2292 + 1], 255, class358.method2309(field2293[field2289], (byte) -83), field2293[field2289 + 1], field2284[field2292], field2284[field2292 + 3], field2284[field2292 + 5] == 1);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class267.field3859 == 0) {
                    class412.field6071 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field2284[field2292++] = class72.field1206;
                return;
            }
            if (arg0 == 5608) {
                field2284[field2292++] = class333.field5119;
                return;
            }
            if (arg0 == 5609) {
                field2284[field2292++] = class412.field6071;
                return;
            }
            if (arg0 == 5610) {
                for (int var177 = 0; var177 < 5; var177++) {
                    field2293[field2289++] = class173.field2642.length > var177 ? class238.method1543((byte) -112, class173.field2642[var177]) : "";
                }
                class173.field2642 = null;
                return;
            }
            if (arg0 == 5611) {
                field2284[field2292++] = class192.field2820;
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var178 = field2284[--field2292];
                if (var178 < 1) {
                    var178 = 1;
                }
                if (var178 > 4) {
                    var178 = 4;
                }
                class397.field5830.field128 = var178;
                class113.method836(10);
                class397.field5830.method1299((byte) 115, class112.field1785);
                class439.field6395 = false;
                return;
            }
            if (arg0 == 6002) {
                class397.field5830.method1297(field2284[--field2292] == 1, 59);
                class113.method836(10);
                class335.method2202(-1);
                class397.field5830.method1299((byte) 101, class112.field1785);
                class439.field6395 = false;
                return;
            }
            if (arg0 == 6003) {
                class397.field5830.field129 = field2284[--field2292] == 1;
                class335.method2202(-1);
                class397.field5830.method1299((byte) 104, class112.field1785);
                class439.field6395 = false;
                return;
            }
            if (arg0 == 6005) {
                class397.field5830.field123 = field2284[--field2292] == 1;
                class113.method836(10);
                class397.field5830.method1299((byte) 120, class112.field1785);
                class439.field6395 = false;
                return;
            }
            if (arg0 == 6006) {
                class397.field5830.field110 = field2284[--field2292] == 1;
                class394.field5821.method475(!class397.field5830.field110);
                class397.field5830.method1299((byte) 106, class112.field1785);
                class439.field6395 = false;
                return;
            }
            if (arg0 == 6007) {
                class397.field5830.field113 = field2284[--field2292];
                class397.field5830.method1299((byte) 98, class112.field1785);
                class439.field6395 = false;
                return;
            }
            if (arg0 == 6008) {
                class397.field5830.field133 = field2284[--field2292] == 1;
                class397.field5830.method1299((byte) 121, class112.field1785);
                class439.field6395 = false;
                return;
            }
            if (arg0 == 6009) {
                class397.field5830.field115 = field2284[--field2292] == 1;
                class113.method836(10);
                class397.field5830.method1299((byte) 112, class112.field1785);
                class439.field6395 = false;
                return;
            }
            if (arg0 == 6010) {
                class397.field5830.field131 = field2284[--field2292] == 1;
                class397.field5830.method1299((byte) 103, class112.field1785);
                class439.field6395 = false;
                return;
            }
            if (arg0 == 6011) {
                int var179 = field2284[--field2292];
                if (var179 < 0 || var179 > 2) {
                    var179 = 0;
                }
                class397.field5830.method62(1, var179, class399.field5865);
                class113.method836(10);
                class397.field5830.method1299((byte) 101, class112.field1785);
                class439.field6395 = false;
                return;
            }
            if (arg0 == 6012) {
                class397.field5830.method61(field2284[--field2292] == 1, class399.field5865, 81);
                class185.method1287(1);
                class193.method1317(16711680);
                class397.field5830.method1299((byte) 99, class112.field1785);
                class439.field6395 = false;
                return;
            }
            if (arg0 == 6014) {
                class397.field5830.field136 = field2284[--field2292] == 1;
                class113.method836(10);
                class397.field5830.method1299((byte) 122, class112.field1785);
                class439.field6395 = false;
                return;
            }
            if (arg0 == 6015) {
                class397.field5830.field153 = field2284[--field2292] == 1;
                class113.method836(10);
                class397.field5830.method1299((byte) 101, class112.field1785);
                class439.field6395 = false;
                return;
            }
            if (arg0 == 6016) {
                int var180 = field2284[--field2292];
                if (var180 < 0 || var180 > 2) {
                    var180 = 0;
                }
                class397.field5830.field142 = var180;
                class470.method2803(class399.field5865, (byte) -116);
                class397.field5830.method1299((byte) 123, class112.field1785);
                return;
            }
            if (arg0 == 6017) {
                class397.field5830.field118 = field2284[--field2292] == 1;
                class267.method1709(0);
                class397.field5830.method1299((byte) 127, class112.field1785);
                class439.field6395 = false;
                return;
            }
            if (arg0 == 6018) {
                int var181 = field2284[--field2292];
                if (var181 < 0) {
                    var181 = 0;
                }
                if (var181 > 127) {
                    var181 = 127;
                }
                class397.field5830.field116 = var181;
                class397.field5830.method1299((byte) 114, class112.field1785);
                class439.field6395 = false;
                return;
            }
            if (arg0 == 6019) {
                int var182 = field2284[--field2292];
                if (var182 < 0) {
                    var182 = 0;
                }
                if (var182 > 255) {
                    var182 = 255;
                }
                if (class397.field5830.field141 != var182) {
                    if (class397.field5830.field141 == 0 && class277.field3994 != -1) {
                        class72.method605(0, var182, class277.field3994, false, 0, class427.field6244);
                        class124.field1918 = false;
                    } else if (var182 == 0) {
                        class186.method1289(28924);
                        class124.field1918 = false;
                    } else {
                        class473.method2825(var182, -1);
                    }
                    class397.field5830.field141 = var182;
                }
                class397.field5830.method1299((byte) 99, class112.field1785);
                class439.field6395 = false;
                return;
            }
            if (arg0 == 6020) {
                int var183 = field2284[--field2292];
                if (var183 < 0) {
                    var183 = 0;
                }
                if (var183 > 127) {
                    var183 = 127;
                }
                class397.field5830.field135 = var183;
                class397.field5830.method1299((byte) 110, class112.field1785);
                class439.field6395 = false;
                return;
            }
            if (arg0 == 6021) {
                class397.field5830.field2776 = field2284[--field2292] == 1;
                class335.method2202(-1);
                return;
            }
            if (arg0 == 6023) {
                int var184 = field2284[--field2292];
                boolean var185 = false;
                if (var184 < 0) {
                    var184 = 0;
                }
                if (var184 > 2) {
                    var184 = 2;
                }
                if (class445.field6538 < 96) {
                    var184 = 0;
                    var185 = true;
                }
                class112.method830(var184, (byte) -111);
                class397.field5830.method1299((byte) 105, class112.field1785);
                class439.field6395 = false;
                field2284[field2292++] = var185 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var186 = field2284[--field2292];
                if (var186 < 0 || var186 > 2) {
                    var186 = 0;
                }
                class397.field5830.field137 = var186;
                class397.field5830.method1299((byte) 119, class112.field1785);
                return;
            }
            if (arg0 == 6025) {
                int var187 = field2284[--field2292];
                if (var187 < 0 || var187 > class254.method1614(2794, class445.field6538)) {
                    var187 = 0;
                }
                class397.field5830.field109 = var187;
                class397.field5830.method1299((byte) 101, class112.field1785);
                class439.field6395 = false;
                return;
            }
            if (arg0 == 6027) {
                int var188 = field2284[--field2292];
                if (var188 < 0 || var188 > 1) {
                    var188 = 0;
                }
                class115.method848(var188 == 1, 4729);
                return;
            }
            if (arg0 == 6028) {
                class397.field5830.field145 = field2284[--field2292] != 0;
                class397.field5830.method1299((byte) 114, class112.field1785);
                return;
            }
            if (arg0 == 6029) {
                class397.field5830.field113 = field2284[--field2292];
                class397.field5830.method1299((byte) 100, class112.field1785);
                return;
            }
            if (arg0 == 6030) {
                class397.field5830.field134 = field2284[--field2292] != 0;
                class397.field5830.method1299((byte) 114, class112.field1785);
                class113.method836(10);
                return;
            }
            if (arg0 == 6031) {
                int var189 = field2284[--field2292];
                if (var189 < 0 || var189 > 3) {
                    var189 = 2;
                }
                class470.method2803(var189, (byte) -123);
                return;
            }
            if (arg0 == 6032) {
                int var190 = field2284[--field2292];
                if (var190 < 0 || var190 > 3) {
                    var190 = 2;
                }
                class397.field5830.field143 = var190;
                class397.field5830.method1299((byte) 113, class112.field1785);
                class439.field6395 = false;
                return;
            }
            if (arg0 == 6033) {
                int var191 = field2284[--field2292];
                if (var191 < 0 || var191 > 4) {
                    var191 = 2;
                }
                class397.field5830.field139 = var191;
                class397.field5830.method1299((byte) 107, class112.field1785);
                return;
            }
            if (arg0 == 6034) {
                class397.field5830.field144 = field2284[--field2292] == 1;
                class397.field5830.method1299((byte) 117, class112.field1785);
                class185.method1287(1);
                class439.field6395 = false;
                return;
            }
            if (arg0 == 6035) {
                class397.field5830.field2780 = field2284[--field2292] == 1;
                class113.method836(10);
                class335.method2202(-1);
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field2284[field2292++] = class397.field5830.field128;
                return;
            }
            if (arg0 == 6102) {
                field2284[field2292++] = class397.field5830.method1298(class399.field5865, 0) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field2284[field2292++] = class397.field5830.field129 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field2284[field2292++] = class397.field5830.field123 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field2284[field2292++] = class397.field5830.field110 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field2284[field2292++] = class397.field5830.field113;
                return;
            }
            if (arg0 == 6108) {
                field2284[field2292++] = class397.field5830.field133 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field2284[field2292++] = class397.field5830.field115 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field2284[field2292++] = class397.field5830.field131 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field2284[field2292++] = class397.field5830.method56((byte) 57, class399.field5865);
                return;
            }
            if (arg0 == 6112) {
                field2284[field2292++] = class397.field5830.method59((byte) 114, class399.field5865) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field2284[field2292++] = class397.field5830.field136 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field2284[field2292++] = class397.field5830.field153 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field2284[field2292++] = class397.field5830.field142;
                return;
            }
            if (arg0 == 6117) {
                field2284[field2292++] = class397.field5830.field118 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field2284[field2292++] = class397.field5830.field116;
                return;
            }
            if (arg0 == 6119) {
                field2284[field2292++] = class397.field5830.field141;
                return;
            }
            if (arg0 == 6120) {
                field2284[field2292++] = class397.field5830.field135;
                return;
            }
            if (arg0 == 6121) {
                field2284[field2292++] = class394.field5821.method469() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field2284[field2292++] = class266.method1706(-128);
                return;
            }
            if (arg0 == 6124) {
                field2284[field2292++] = class397.field5830.field137;
                return;
            }
            if (arg0 == 6125) {
                field2284[field2292++] = class397.field5830.field109;
                return;
            }
            if (arg0 == 6126) {
                field2284[field2292++] = class394.field5821.method474() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field2284[field2292++] = class397.field5830.field130 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field2284[field2292++] = class397.field5830.field145 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field2284[field2292++] = class397.field5830.field113;
                return;
            }
            if (arg0 == 6130) {
                field2284[field2292++] = class397.field5830.field134 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field2284[field2292++] = class399.field5865;
                return;
            }
            if (arg0 == 6132) {
                field2284[field2292++] = class397.field5830.field143;
                return;
            }
            if (arg0 == 6133) {
                field2284[field2292++] = class312.field4479 == 1 || class312.field4479 == 4 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field2284[field2292++] = class254.method1614(2794, class445.field6538);
                return;
            }
            if (arg0 == 6135) {
                field2284[field2292++] = class397.field5830.field139;
                return;
            }
            if (arg0 == 6136) {
                field2284[field2292++] = class397.field5830.field144 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field2292 -= 2;
                class5.field80 = (short) field2284[field2292];
                if (class5.field80 <= 0) {
                    class5.field80 = 256;
                }
                class303.field4352 = (short) field2284[field2292 + 1];
                if (class303.field4352 <= 0) {
                    class303.field4352 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field2292 -= 2;
                class222.field3215 = (short) field2284[field2292];
                if (class222.field3215 <= 0) {
                    class222.field3215 = 256;
                }
                class365.field5488 = (short) field2284[field2292 + 1];
                if (class365.field5488 <= 0) {
                    class365.field5488 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field2292 -= 4;
                class249.field3586 = (short) field2284[field2292];
                if (class249.field3586 <= 0) {
                    class249.field3586 = 1;
                }
                class359.field5433 = (short) field2284[field2292 + 1];
                if (class359.field5433 <= 0) {
                    class359.field5433 = 32767;
                } else if (class359.field5433 < class249.field3586) {
                    class359.field5433 = class249.field3586;
                }
                class355.field5370 = (short) field2284[field2292 + 2];
                if (class355.field5370 <= 0) {
                    class355.field5370 = 1;
                }
                class479.field7030 = (short) field2284[field2292 + 3];
                if (class479.field7030 <= 0) {
                    class479.field7030 = 32767;
                    return;
                }
                if (class479.field7030 < class355.field5370) {
                    class479.field7030 = class355.field5370;
                }
                return;
            }
            if (arg0 == 6203) {
                class522.method3081(0, class212.field3067.field896, false, class212.field3067.field925, (byte) -38, 0);
                field2284[field2292++] = class369.field5526;
                field2284[field2292++] = class382.field5685;
                return;
            }
            if (arg0 == 6204) {
                field2284[field2292++] = class222.field3215;
                field2284[field2292++] = class365.field5488;
                return;
            }
            if (arg0 == 6205) {
                field2284[field2292++] = class5.field80;
                field2284[field2292++] = class303.field4352;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field2284[field2292++] = (int) (class464.method2773((byte) 103) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field2284[field2292++] = (int) (class464.method2773((byte) 103) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field2292 -= 3;
                int var192 = field2284[field2292];
                int var193 = field2284[field2292 + 1];
                int var194 = field2284[field2292 + 2];
                field2275.clear();
                field2275.set(11, 12);
                field2275.set(var194, var193, var192);
                field2284[field2292++] = (int) (field2275.getTime().getTime() / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6303) {
                field2275.clear();
                field2275.setTime(new Date(class464.method2773((byte) 103)));
                field2284[field2292++] = field2275.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var195 = field2284[--field2292];
                boolean var196 = true;
                if (var195 < 0) {
                    var196 = (var195 + 1) % 4 == 0;
                } else if (var195 < 1582) {
                    var196 = var195 % 4 == 0;
                } else if (var195 % 4 != 0) {
                    var196 = false;
                } else if (var195 % 100 != 0) {
                    var196 = true;
                } else if (var195 % 400 != 0) {
                    var196 = false;
                }
                field2284[field2292++] = var196 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field2284[field2292++] = class16.method150(0) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field2284[field2292++] = class32.method261(1) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class17.field266 == 10 && class405.field5964 == 0 && class112.field1784 == 0 && class267.field3859 == 0) {
                    field2284[field2292++] = class210.method1403(false) == -1 ? 0 : 1;
                    return;
                }
                field2284[field2292++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class507 var197 = class6.method47((byte) -88);
                if (var197 != null) {
                    field2284[field2292++] = var197.field7415;
                    field2284[field2292++] = var197.field7824;
                    field2293[field2289++] = var197.field7420;
                    class159 var198 = var197.method3000(-74);
                    field2284[field2292++] = var198.field2397;
                    field2293[field2289++] = var198.field2393;
                    field2284[field2292++] = var197.field7819;
                    field2284[field2292++] = var197.field7413;
                    return;
                }
                field2284[field2292++] = -1;
                field2284[field2292++] = 0;
                field2293[field2289++] = "";
                field2284[field2292++] = 0;
                field2293[field2289++] = "";
                field2284[field2292++] = 0;
                field2284[field2292++] = 0;
                return;
            }
            if (arg0 == 6502) {
                class507 var199 = class42.method324(true);
                if (var199 != null) {
                    field2284[field2292++] = var199.field7415;
                    field2284[field2292++] = var199.field7824;
                    field2293[field2289++] = var199.field7420;
                    class159 var200 = var199.method3000(-119);
                    field2284[field2292++] = var200.field2397;
                    field2293[field2289++] = var200.field2393;
                    field2284[field2292++] = var199.field7819;
                    field2284[field2292++] = var199.field7413;
                    return;
                }
                field2284[field2292++] = -1;
                field2284[field2292++] = 0;
                field2293[field2289++] = "";
                field2284[field2292++] = 0;
                field2293[field2289++] = "";
                field2284[field2292++] = 0;
                field2284[field2292++] = 0;
                return;
            }
            if (arg0 == 6503) {
                int var201 = field2284[--field2292];
                if (class17.field266 == 10 && class405.field5964 == 0 && class112.field1784 == 0 && class267.field3859 == 0) {
                    field2284[field2292++] = class326.method2130(false, var201) ? 1 : 0;
                    return;
                }
                field2284[field2292++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class397.field5830.field140 = field2284[--field2292];
                class397.field5830.method1299((byte) 120, class112.field1785);
                return;
            }
            if (arg0 == 6505) {
                field2284[field2292++] = class397.field5830.field140;
                return;
            }
            if (arg0 == 6506) {
                int var202 = field2284[--field2292];
                class507 var203 = class379.method2406(var202, 0);
                if (var203 != null) {
                    field2284[field2292++] = var203.field7824;
                    field2293[field2289++] = var203.field7420;
                    class159 var204 = var203.method3000(-93);
                    field2284[field2292++] = var204.field2397;
                    field2293[field2289++] = var204.field2393;
                    field2284[field2292++] = var203.field7819;
                    field2284[field2292++] = var203.field7413;
                    return;
                }
                field2284[field2292++] = -1;
                field2293[field2289++] = "";
                field2284[field2292++] = 0;
                field2293[field2289++] = "";
                field2284[field2292++] = 0;
                field2284[field2292++] = 0;
                return;
            }
            if (arg0 == 6507) {
                field2292 -= 4;
                int var205 = field2284[field2292];
                boolean var206 = field2284[field2292 + 1] == 1;
                int var207 = field2284[field2292 + 2];
                boolean var208 = field2284[field2292 + 3] == 1;
                class170.method1210(var208, var206, -102, var205, var207);
                return;
            }
            if (arg0 == 6508) {
                class439.method2665(false);
                return;
            }
            if (arg0 == 6509) {
                if (class17.field266 != 10) {
                    return;
                }
                class319.field4567 = field2284[--field2292] == 1;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class397.field5830.field150 = field2284[--field2292] == 1;
                class397.field5830.method1299((byte) 102, class112.field1785);
                return;
            }
            if (arg0 == 6601) {
                field2284[field2292++] = class397.field5830.field150 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class389.field5760 == class165.field2472) {
            if (arg0 == 6700) {
                int var209 = class466.field6844.method2482(0);
                if (class341.field5207 != -1) {
                    var209++;
                }
                field2284[field2292++] = var209;
                return;
            }
            if (arg0 == 6701) {
                int var210 = field2284[--field2292];
                if (class341.field5207 != -1) {
                    if (var210 == 0) {
                        field2284[field2292++] = class341.field5207;
                        return;
                    }
                    var210--;
                }
                class183 var211 = (class183) class466.field6844.method2483(125);
                while (var210-- > 0) {
                    var211 = (class183) class466.field6844.method2481((byte) -27);
                }
                field2284[field2292++] = var211.field2753;
                return;
            }
            if (arg0 == 6702) {
                int var212 = field2284[--field2292];
                if (class416.field6157[var212] == null) {
                    field2293[field2289++] = "";
                    return;
                }
                String var213 = class416.field6157[var212][0].field898;
                if (var213 == null) {
                    field2293[field2289++] = "";
                    return;
                }
                field2293[field2289++] = var213.substring(0, var213.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var214 = field2284[--field2292];
                if (class416.field6157[var214] == null) {
                    field2284[field2292++] = 0;
                    return;
                }
                field2284[field2292++] = class416.field6157[var214].length;
                return;
            }
            if (arg0 == 6704) {
                field2292 -= 2;
                int var215 = field2284[field2292];
                int var216 = field2284[field2292 + 1];
                if (class416.field6157[var215] == null) {
                    field2293[field2289++] = "";
                    return;
                }
                String var217 = class416.field6157[var215][var216].field898;
                if (var217 == null) {
                    field2293[field2289++] = "";
                    return;
                }
                field2293[field2289++] = var217;
                return;
            }
            if (arg0 == 6705) {
                field2292 -= 2;
                int var218 = field2284[field2292];
                int var219 = field2284[field2292 + 1];
                if (class416.field6157[var218] == null) {
                    field2284[field2292++] = 0;
                    return;
                }
                field2284[field2292++] = class416.field6157[var218][var219].field947;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field2292 -= 3;
                int var220 = field2284[field2292];
                int var221 = field2284[field2292 + 1];
                int var222 = field2284[field2292 + 2];
                class291.method1809(var222, "", (byte) -107, var220 << 16 | var221, 1);
                return;
            }
            if (arg0 == 6708) {
                field2292 -= 3;
                int var223 = field2284[field2292];
                int var224 = field2284[field2292 + 1];
                int var225 = field2284[field2292 + 2];
                class291.method1809(var225, "", (byte) -107, var223 << 16 | var224, 2);
                return;
            }
            if (arg0 == 6709) {
                field2292 -= 3;
                int var226 = field2284[field2292];
                int var227 = field2284[field2292 + 1];
                int var228 = field2284[field2292 + 2];
                class291.method1809(var228, "", (byte) -107, var226 << 16 | var227, 3);
                return;
            }
            if (arg0 == 6710) {
                field2292 -= 3;
                int var229 = field2284[field2292];
                int var230 = field2284[field2292 + 1];
                int var231 = field2284[field2292 + 2];
                class291.method1809(var231, "", (byte) -107, var229 << 16 | var230, 4);
                return;
            }
            if (arg0 == 6711) {
                field2292 -= 3;
                int var232 = field2284[field2292];
                int var233 = field2284[field2292 + 1];
                int var234 = field2284[field2292 + 2];
                class291.method1809(var234, "", (byte) -107, var232 << 16 | var233, 5);
                return;
            }
            if (arg0 == 6712) {
                field2292 -= 3;
                int var235 = field2284[field2292];
                int var236 = field2284[field2292 + 1];
                int var237 = field2284[field2292 + 2];
                class291.method1809(var237, "", (byte) -107, var235 << 16 | var236, 6);
                return;
            }
            if (arg0 == 6713) {
                field2292 -= 3;
                int var238 = field2284[field2292];
                int var239 = field2284[field2292 + 1];
                int var240 = field2284[field2292 + 2];
                class291.method1809(var240, "", (byte) -107, var238 << 16 | var239, 7);
                return;
            }
            if (arg0 == 6714) {
                field2292 -= 3;
                int var241 = field2284[field2292];
                int var242 = field2284[field2292 + 1];
                int var243 = field2284[field2292 + 2];
                class291.method1809(var243, "", (byte) -107, var241 << 16 | var242, 8);
                return;
            }
            if (arg0 == 6715) {
                field2292 -= 3;
                int var244 = field2284[field2292];
                int var245 = field2284[field2292 + 1];
                int var246 = field2284[field2292 + 2];
                class291.method1809(var246, "", (byte) -107, var244 << 16 | var245, 9);
                return;
            }
            if (arg0 == 6716) {
                field2292 -= 3;
                int var247 = field2284[field2292];
                int var248 = field2284[field2292 + 1];
                int var249 = field2284[field2292 + 2];
                class291.method1809(var249, "", (byte) -107, var247 << 16 | var248, 10);
                return;
            }
            if (arg0 == 6717) {
                field2292 -= 3;
                int var250 = field2284[field2292];
                int var251 = field2284[field2292 + 1];
                int var252 = field2284[field2292 + 2];
                class58 var253 = class155.method1123(var252, var250 << 16 | var251, (byte) -66);
                class105.method798(-28860);
                class102 var254 = client.method1349(var253);
                class163.method1183(var254.method779((byte) 122), var254.field1634, var253, -51);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var255 = field2284[--field2292];
                class210 var256 = class495.field7209.method1835(36, var255);
                if (var256.field3039 == null) {
                    field2293[field2289++] = "";
                    return;
                }
                field2293[field2289++] = var256.field3039;
                return;
            }
            if (arg0 == 6801) {
                int var257 = field2284[--field2292];
                class210 var258 = class495.field7209.method1835(36, var257);
                field2284[field2292++] = var258.field3042;
                return;
            }
            if (arg0 == 6802) {
                int var259 = field2284[--field2292];
                class210 var260 = class495.field7209.method1835(36, var259);
                field2284[field2292++] = var260.field3015;
                return;
            }
            if (arg0 == 6803) {
                int var261 = field2284[--field2292];
                class210 var262 = class495.field7209.method1835(36, var261);
                field2284[field2292++] = var262.field3016;
                return;
            }
            if (arg0 == 6804) {
                field2292 -= 2;
                int var263 = field2284[field2292];
                int var264 = field2284[field2292 + 1];
                class93 var265 = class219.field3164.method2570((byte) -32, var264);
                if (var265.method748((byte) -79)) {
                    field2293[field2289++] = class495.field7209.method1835(36, var263).method1405(var265.field1525, var264, 2);
                    return;
                }
                field2284[field2292++] = class495.field7209.method1835(36, var263).method1399(-65536, var264, var265.field1529);
                return;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lhd;)V")
    public static final void method1086(class519 arg0) {
        method1080(arg0, 200000);
    }

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "(IZ)V")
    public static final void method1087(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "(I)V")
    private static final void method1088(int arg0) {
        class58 var1 = class421.method2578(-4179, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class58[] var3 = class103.field1643[var2];
        if (var3 == null) {
            class58[] var4 = class416.field6157[var2];
            int var5 = var4.length;
            var3 = class103.field1643[var2] = new class58[var5];
            class486.method2904(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class486.method2904(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method1089(String arg0, int arg1) {
        if (class42.field642 == 0 && !(!class170.field2554 || class101.field1622) || class72.field1209) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class219.field3155.method1273(true, 0))) {
            var3 = 0;
            arg0 = arg0.substring(class219.field3155.method1273(true, 0).length());
        } else if (var2.startsWith(class522.field7669.method1273(true, 0))) {
            var3 = 1;
            arg0 = arg0.substring(class522.field7669.method1273(true, 0).length());
        } else if (var2.startsWith(class207.field2980.method1273(true, 0))) {
            var3 = 2;
            arg0 = arg0.substring(class207.field2980.method1273(true, 0).length());
        } else if (var2.startsWith(class248.field3577.method1273(true, 0))) {
            var3 = 3;
            arg0 = arg0.substring(class248.field3577.method1273(true, 0).length());
        } else if (var2.startsWith(class179.field2718.method1273(true, 0))) {
            var3 = 4;
            arg0 = arg0.substring(class179.field2718.method1273(true, 0).length());
        } else if (var2.startsWith(class268.field3901.method1273(true, 0))) {
            var3 = 5;
            arg0 = arg0.substring(class268.field3901.method1273(true, 0).length());
        } else if (var2.startsWith(class525.field7717.method1273(true, 0))) {
            var3 = 6;
            arg0 = arg0.substring(class525.field7717.method1273(true, 0).length());
        } else if (var2.startsWith(class193.field2831.method1273(true, 0))) {
            var3 = 7;
            arg0 = arg0.substring(class193.field2831.method1273(true, 0).length());
        } else if (var2.startsWith(class418.field6170.method1273(true, 0))) {
            var3 = 8;
            arg0 = arg0.substring(class418.field6170.method1273(true, 0).length());
        } else if (var2.startsWith(class82.field1357.method1273(true, 0))) {
            var3 = 9;
            arg0 = arg0.substring(class82.field1357.method1273(true, 0).length());
        } else if (var2.startsWith(class435.field6324.method1273(true, 0))) {
            var3 = 10;
            arg0 = arg0.substring(class435.field6324.method1273(true, 0).length());
        } else if (var2.startsWith(class326.field5007.method1273(true, 0))) {
            var3 = 11;
            arg0 = arg0.substring(class326.field5007.method1273(true, 0).length());
        } else if (class370.field5530 != 0) {
            if (var2.startsWith(class219.field3155.method1273(true, class370.field5530))) {
                var3 = 0;
                arg0 = arg0.substring(class219.field3155.method1273(true, class370.field5530).length());
            } else if (var2.startsWith(class522.field7669.method1273(true, class370.field5530))) {
                var3 = 1;
                arg0 = arg0.substring(class522.field7669.method1273(true, class370.field5530).length());
            } else if (var2.startsWith(class207.field2980.method1273(true, class370.field5530))) {
                var3 = 2;
                arg0 = arg0.substring(class207.field2980.method1273(true, class370.field5530).length());
            } else if (var2.startsWith(class248.field3577.method1273(true, class370.field5530))) {
                var3 = 3;
                arg0 = arg0.substring(class248.field3577.method1273(true, class370.field5530).length());
            } else if (var2.startsWith(class179.field2718.method1273(true, class370.field5530))) {
                var3 = 4;
                arg0 = arg0.substring(class179.field2718.method1273(true, class370.field5530).length());
            } else if (var2.startsWith(class268.field3901.method1273(true, class370.field5530))) {
                var3 = 5;
                arg0 = arg0.substring(class268.field3901.method1273(true, class370.field5530).length());
            } else if (var2.startsWith(class525.field7717.method1273(true, class370.field5530))) {
                var3 = 6;
                arg0 = arg0.substring(class525.field7717.method1273(true, class370.field5530).length());
            } else if (var2.startsWith(class193.field2831.method1273(true, class370.field5530))) {
                var3 = 7;
                arg0 = arg0.substring(class193.field2831.method1273(true, class370.field5530).length());
            } else if (var2.startsWith(class418.field6170.method1273(true, class370.field5530))) {
                var3 = 8;
                arg0 = arg0.substring(class418.field6170.method1273(true, class370.field5530).length());
            } else if (var2.startsWith(class82.field1357.method1273(true, class370.field5530))) {
                var3 = 9;
                arg0 = arg0.substring(class82.field1357.method1273(true, class370.field5530).length());
            } else if (var2.startsWith(class435.field6324.method1273(true, class370.field5530))) {
                var3 = 10;
                arg0 = arg0.substring(class435.field6324.method1273(true, class370.field5530).length());
            } else if (var2.startsWith(class326.field5007.method1273(true, class370.field5530))) {
                var3 = 11;
                arg0 = arg0.substring(class326.field5007.method1273(true, class370.field5530).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class334.field5131.method1273(true, 0))) {
            var5 = 1;
            arg0 = arg0.substring(class334.field5131.method1273(true, 0).length());
        } else if (var4.startsWith(class510.field7529.method1273(true, 0))) {
            var5 = 2;
            arg0 = arg0.substring(class510.field7529.method1273(true, 0).length());
        } else if (var4.startsWith(class448.field6564.method1273(true, 0))) {
            var5 = 3;
            arg0 = arg0.substring(class448.field6564.method1273(true, 0).length());
        } else if (var4.startsWith(class525.field7722.method1273(true, 0))) {
            var5 = 4;
            arg0 = arg0.substring(class525.field7722.method1273(true, 0).length());
        } else if (var4.startsWith(class225.field3276.method1273(true, 0))) {
            var5 = 5;
            arg0 = arg0.substring(class225.field3276.method1273(true, 0).length());
        } else if (class370.field5530 != 0) {
            if (var4.startsWith(class334.field5131.method1273(true, class370.field5530))) {
                var5 = 1;
                arg0 = arg0.substring(class334.field5131.method1273(true, class370.field5530).length());
            } else if (var4.startsWith(class510.field7529.method1273(true, class370.field5530))) {
                var5 = 2;
                arg0 = arg0.substring(class510.field7529.method1273(true, class370.field5530).length());
            } else if (var4.startsWith(class448.field6564.method1273(true, class370.field5530))) {
                var5 = 3;
                arg0 = arg0.substring(class448.field6564.method1273(true, class370.field5530).length());
            } else if (var4.startsWith(class525.field7722.method1273(true, class370.field5530))) {
                var5 = 4;
                arg0 = arg0.substring(class525.field7722.method1273(true, class370.field5530).length());
            } else if (var4.startsWith(class225.field3276.method1273(true, class370.field5530))) {
                var5 = 5;
                arg0 = arg0.substring(class225.field3276.method1273(true, class370.field5530).length());
            }
        }
        field2277++;
        class114.method841(false, class428.field6249);
        class86.field1436.method1923((byte) 62, 0);
        int var6 = class86.field1436.field4333;
        if (arg1 == 5021) {
            class86.field1436.method1923((byte) 62, 1);
        } else if (arg1 == 5022) {
            class86.field1436.method1923((byte) 62, 2);
        } else {
            class86.field1436.method1923((byte) 62, 0);
        }
        class86.field1436.method1923((byte) 62, var3);
        class86.field1436.method1923((byte) 62, var5);
        class527.method3109(89, arg0, class86.field1436);
        class86.field1436.method1897(class86.field1436.field4333 - var6, 255);
    }

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "(I)V")
    private static final void method1090(int arg0) {
        class58 var1 = class421.method2578(-4179, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class58[] var3 = class103.field1643[var2];
        if (var3 == null) {
            class58[] var4 = class416.field6157[var2];
            int var5 = var4.length;
            var3 = class103.field1643[var2] = new class58[var5];
            class486.method2904(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class486.method2904(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lss;I)V")
    private static final void method1091(class295 arg0, int arg1) {
        field2292 = 0;
        field2289 = 0;
        int var2 = -1;
        int[] var3 = arg0.field4206;
        int[] var4 = arg0.field4209;
        byte var5 = -1;
        field2282 = 0;
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
                        method1084(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method1085(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field2284[field2292++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field2284[field2292++] = class526.field7733.field6971[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class526.field7733.method2835(var8, (byte) 32, field2284[--field2292]);
                } else if (var43 == 3) {
                    field2293[field2289++] = arg0.field4213[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field2292 -= 2;
                    if (field2284[field2292 + 1] != field2284[field2292]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field2292 -= 2;
                    if (field2284[field2292 + 1] == field2284[field2292]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field2292 -= 2;
                    if (field2284[field2292] < field2284[field2292 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field2292 -= 2;
                    if (field2284[field2292] > field2284[field2292 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field2282 == 0) {
                        return;
                    }
                    class407 var9 = field2296[--field2282];
                    arg0 = var9.field5980;
                    var3 = arg0.field4206;
                    var4 = arg0.field4209;
                    var2 = var9.field5981;
                    field2281 = var9.field5982;
                    field2287 = var9.field5983;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field2284[field2292++] = class526.field7733.method2708(true, var10);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class526.field7733.method2832(0, var11, field2284[--field2292]);
                } else if (var43 == 31) {
                    field2292 -= 2;
                    if (field2284[field2292] <= field2284[field2292 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field2292 -= 2;
                    if (field2284[field2292] >= field2284[field2292 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field2284[field2292++] = field2281[var4[var2]];
                } else if (var43 == 34) {
                    field2281[var4[var2]] = field2284[--field2292];
                } else if (var43 == 35) {
                    field2293[field2289++] = field2287[var4[var2]];
                } else if (var43 == 36) {
                    field2287[var4[var2]] = field2293[--field2289];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field2289 -= var12;
                    String var13 = class102.method783(var12, field2293, field2289, (byte) 78);
                    field2293[field2289++] = var13;
                } else if (var43 == 38) {
                    field2292--;
                } else if (var43 == 39) {
                    field2289--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class295 var15 = class233.method1515(var14, 0);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field4217];
                    String[] var17 = new String[var15.field4219];
                    for (int var18 = 0; var18 < var15.field4218; var18++) {
                        var16[var18] = field2284[field2292 + var18 - var15.field4218];
                    }
                    for (int var19 = 0; var19 < var15.field4208; var19++) {
                        var17[var19] = field2293[field2289 + var19 - var15.field4208];
                    }
                    field2292 -= var15.field4218;
                    field2289 -= var15.field4208;
                    class407 var20 = new class407();
                    var20.field5980 = arg0;
                    var20.field5981 = var2;
                    var20.field5982 = field2281;
                    var20.field5983 = field2287;
                    if (field2282 >= field2296.length) {
                        throw new RuntimeException();
                    }
                    field2296[field2282++] = var20;
                    arg0 = var15;
                    var3 = var15.field4206;
                    var4 = var15.field4209;
                    var2 = -1;
                    field2281 = var16;
                    field2287 = var17;
                } else if (var43 == 42) {
                    field2284[field2292++] = class400.field5869[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class400.field5869[var21] = field2284[--field2292];
                    class404.method2519(8, var21);
                    class45.field678 |= class424.field6226[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field2284[--field2292];
                    if (var24 >= 0 && var24 <= 5000) {
                        field2280[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field2279[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field2284[--field2292];
                    if (var28 < 0 || var28 >= field2280[var27]) {
                        throw new RuntimeException();
                    }
                    field2284[field2292++] = field2279[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field2292 -= 2;
                    int var30 = field2284[field2292];
                    if (var30 < 0 || var30 >= field2280[var29]) {
                        throw new RuntimeException();
                    }
                    field2279[var29][var30] = field2284[field2292 + 1];
                } else if (var43 == 47) {
                    String var31 = class123.field1915[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field2293[field2289++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class123.field1915[var32] = field2293[--field2289];
                    class327.method2140(28758, var32);
                } else if (var43 == 51) {
                    class398 var33 = arg0.field4212[var4[var2]];
                    class242 var34 = (class242) var33.method2485(71, (long) field2284[--field2292]);
                    if (var34 != null) {
                        var2 += var34.field3509;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field4216 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field6399).append(" ");
                for (int var41 = field2282 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field2296[var41].field5980.field6399).append(" ");
                }
                var40.append("op: ").append(var5);
                class169.method1200(var40.toString(), var42, (byte) -113);
            } else {
                class460.method2756("Clientscript error in: " + arg0.field4216, false);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field4216).append("\n");
                for (int var38 = field2282 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field2296[var38].field5980.field4216).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class169.method1200(var37.toString(), var42, (byte) -113);
                class105.method796(var37.toString(), (byte) 124);
            }
        }
    }
}
