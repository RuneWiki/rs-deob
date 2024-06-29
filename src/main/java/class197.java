import java.awt.Container;
import java.awt.Insets;
import java.lang.reflect.Method;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class197 {

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "J")
    public long field2719 = 0L;

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "Lab;")
    public static class148 field2736 = new class148();

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2740 = Calendar.getInstance();

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
    public static int field2742 = 0;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public int field2720;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    public int field2721;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public int field2722;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public int field2724;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
    public int field2729;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "Lsg;")
    public static class166 field2741;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "Lpa;")
    public static class220 field2735;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "Lhc;")
    public static class235 field2726;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "Lsa;")
    public class268 field2725;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "Lsa;")
    public class268 field2727;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "Lpl;")
    public static class293 field2738;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vi", name = "y", descriptor = "Ljava/lang/Class;")
    public static Class field2743;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BII)I")
    public static final int method1252(byte arg0, int arg1, int arg2) {
        field2731++;
        class69 var3 = (class69) class75.field1051.method23(216, (long) arg1);
        if (var3 == null) {
            return -1;
        } else if (arg0 == 34) {
            return arg2 >= 0 && var3.field941.length > arg2 ? var3.field941[arg2] : -1;
        } else {
            return 24;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lhc;I)V")
    public static final void method1253(class235 arg0, int arg1) {
        if (arg1 != -16200) {
            field2738 = null;
        }
        field2732++;
        class11.field114 = arg0;
        class269.field4120 = class11.field114.method1577(4, -6339);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V")
    public static final void method1254(byte arg0) {
        try {
            if (arg0 != 12) {
                return;
            }
            Method var1 = (field2743 == null ? (field2743 = method1262("java.lang.Runtime")) : field2743).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class274.field4236 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        field2733++;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)V")
    public static final void method1255(byte arg0) {
        field2728++;
        int var1 = -93 / ((arg0 - 16) / 51);
        if (class52.field758 != null || class208.field2967 != null) {
            return;
        }
        int var2 = class202.field2798;
        if (!class15.field146) {
            if (var2 == 1 && class68.field925 > 0) {
                short var3 = class221.field3306[class68.field925 - 1];
                if (var3 == 36 || var3 == 1 || var3 == 3 || var3 == 46 || var3 == 31 || var3 == 47 || var3 == 25 || var3 == 17 || var3 == 35 || var3 == 41 || var3 == 58 || var3 == 1003) {
                    int var4 = class144.field2001[class68.field925 - 1];
                    int var5 = class219.field3299[class68.field925 - 1];
                    class211 var6 = class67.method421(var4, 0);
                    class203 var7 = client.method1040(var6);
                    if (var7.method1292(-31) || var7.method1287(-14829)) {
                        class57.field826 = 0;
                        class103.field1436 = false;
                        if (class52.field758 != null) {
                            class236.method1583(class52.field758, 0);
                        }
                        class52.field758 = class67.method421(var4, 0);
                        class40.field595 = class27.field344;
                        class100.field1396 = var5;
                        class173.field2410 = class81.field1112;
                        class236.method1583(class52.field758, 0);
                        return;
                    }
                }
            }
            if (var2 == 1 && (class170.field2352 == 1 && class68.field925 > 2 || class202.method1277(class68.field925 - 1, (byte) 83))) {
                var2 = 2;
            }
            if (var2 == 2 && class68.field925 > 0 || class297.field4687 == 1) {
                class75.method483(1);
            }
            if (var2 == 1 && class68.field925 > 0 || class297.field4687 == 2) {
                class56.method349(-12173);
                return;
            }
            return;
        }
        if (var2 != 1) {
            int var8 = class12.field124;
            int var9 = class287.field4543;
            if ((class40.field593 - 10) > var8 || var8 > (class40.field593 + class175.field2458 + 10) || (class180.field2516 - 10) > var9 || var9 > class224.field3406 + class180.field2516 + 10) {
                class15.field146 = false;
                class238.method1595((byte) 30, class40.field593, class224.field3406, class175.field2458, class180.field2516);
            }
        }
        if (var2 != 1) {
            return;
        }
        int var10 = class40.field593;
        int var11 = class180.field2516;
        int var12 = class175.field2458;
        int var13 = class27.field344;
        int var14 = class81.field1112;
        int var15 = -1;
        for (int var16 = 0; var16 < class68.field925; var16++) {
            if (class137.field1925) {
                int var17 = var11 - (-((class68.field925 - var16 - 1) * 15) - 33);
                if (var13 > var10 && (var10 + var12) > var13 && (var17 - 13) < var14 && var17 + 3 > var14) {
                    var15 = var16;
                }
            } else {
                int var18 = (class68.field925 - var16 - 1) * 15 + var11 + 31;
                if (var10 < var13 && var13 < var10 + var12 && var18 - 13 < var14 && var14 < var18 + 3) {
                    var15 = var16;
                }
            }
        }
        if (var15 != -1) {
            class247.method1663((byte) -110, var15);
        }
        class15.field146 = false;
        class238.method1595((byte) 30, class40.field593, class224.field3406, class175.field2458, class180.field2516);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ljd;Z)V")
    public static final void method1256(class89 arg0, boolean arg1) {
        class169.field2347.method988(arg0, (byte) -77);
        while (true) {
            class89 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class89[][] var7;
            class89 var66;
            do {
                class89 var65;
                do {
                    class89 var64;
                    do {
                        class89 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class89) class169.field2347.method997((byte) -112);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field1222);
                                            var3 = var2.field1241;
                                            var4 = var2.field1223;
                                            var5 = var2.field1229;
                                            var6 = var2.field1247;
                                            var7 = class194.field2682[var5];
                                            if (!var2.field1239) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class89 var8 = class194.field2682[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field1222) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class213.field3206 && var3 > class142.field1969) {
                                                    class89 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field1222 && (var9.field1239 || (var2.field1245 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class213.field3206 && var3 < class132.field1883 - 1) {
                                                    class89 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field1222 && (var10.field1239 || (var2.field1245 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class266.field4044 && var4 > class250.field3829) {
                                                    class89 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field1222 && (var11.field1239 || (var2.field1245 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class266.field4044 && var4 < class93.field1286 - 1) {
                                                    class89 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field1222 && (var12.field1239 || (var2.field1245 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field1239 = false;
                                            if (var2.field1249 != null) {
                                                class89 var13 = var2.field1249;
                                                if (var13.field1243 == null) {
                                                    if (var13.field1225 != null) {
                                                        if (class239.method1600(0, var3, var4)) {
                                                            class104.method678(var13.field1225, class228.field3464, class158.field2201, class30.field414, class177.field2483, var3, var4, true);
                                                        } else {
                                                            class104.method678(var13.field1225, class228.field3464, class158.field2201, class30.field414, class177.field2483, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class239.method1600(0, var3, var4)) {
                                                    class33.method220(var13.field1243, 0, class228.field3464, class158.field2201, class30.field414, class177.field2483, var3, var4, true);
                                                } else {
                                                    class33.method220(var13.field1243, 0, class228.field3464, class158.field2201, class30.field414, class177.field2483, var3, var4, false);
                                                }
                                                class197 var14 = var13.field1244;
                                                if (var14 != null) {
                                                    var14.field2725.method120(0, class228.field3464, class158.field2201, class30.field414, class177.field2483, var14.field2729 - class124.field1745, var14.field2722 - class21.field309, var14.field2721 - class65.field889, var14.field2719, var5, (class97) null);
                                                }
                                                for (int var15 = 0; var15 < var13.field1240; var15++) {
                                                    class198 var16 = var13.field1226[var15];
                                                    if (var16 != null) {
                                                        var16.field2752.method120(var16.field2762, class228.field3464, class158.field2201, class30.field414, class177.field2483, var16.field2760 - class124.field1745, var16.field2745 - class21.field309, var16.field2757 - class65.field889, var16.field2753, var5, (class97) null);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field1243 == null) {
                                                if (var2.field1225 != null) {
                                                    if (class239.method1600(var6, var3, var4)) {
                                                        class104.method678(var2.field1225, class228.field3464, class158.field2201, class30.field414, class177.field2483, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class104.method678(var2.field1225, class228.field3464, class158.field2201, class30.field414, class177.field2483, var3, var4, false);
                                                    }
                                                }
                                            } else if (class239.method1600(var6, var3, var4)) {
                                                class33.method220(var2.field1243, var6, class228.field3464, class158.field2201, class30.field414, class177.field2483, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field1243.field898 != 12345678 || class65.field885 && var5 <= class252.field3851) {
                                                    class33.method220(var2.field1243, var6, class228.field3464, class158.field2201, class30.field414, class177.field2483, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class23 var18 = var2.field1237;
                                                if (var18 != null && (var18.field322 & 0x80000000L) != 0L) {
                                                    var18.field328.method120(0, class228.field3464, class158.field2201, class30.field414, class177.field2483, var18.field325 - class124.field1745, var18.field323 - class21.field309, var18.field326 - class65.field889, var18.field322, var5, (class97) null);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class197 var21 = var2.field1244;
                                            class228 var22 = var2.field1235;
                                            if (var21 != null || var22 != null) {
                                                if (class213.field3206 == var3) {
                                                    var19++;
                                                } else if (class213.field3206 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class266.field4044 == var4) {
                                                    var19 += 3;
                                                } else if (class266.field4044 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class129.field1825[var19];
                                                var2.field1228 = class208.field2960[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field2720 & class186.field2568[var19]) == 0) {
                                                    var2.field1231 = 0;
                                                } else if (var21.field2720 == 16) {
                                                    var2.field1231 = 3;
                                                    var2.field1224 = class280.field4339[var19];
                                                    var2.field1232 = 3 - var2.field1224;
                                                } else if (var21.field2720 == 32) {
                                                    var2.field1231 = 6;
                                                    var2.field1224 = class204.field2842[var19];
                                                    var2.field1232 = 6 - var2.field1224;
                                                } else if (var21.field2720 == 64) {
                                                    var2.field1231 = 12;
                                                    var2.field1224 = class167.field2295[var19];
                                                    var2.field1232 = 12 - var2.field1224;
                                                } else {
                                                    var2.field1231 = 9;
                                                    var2.field1224 = class9.field85[var19];
                                                    var2.field1232 = 9 - var2.field1224;
                                                }
                                                if ((var21.field2720 & var20) != 0 && !class154.method1029(var6, var3, var4, var21.field2720)) {
                                                    var21.field2725.method120(0, class228.field3464, class158.field2201, class30.field414, class177.field2483, var21.field2729 - class124.field1745, var21.field2722 - class21.field309, var21.field2721 - class65.field889, var21.field2719, var5, (class97) null);
                                                }
                                                if ((var21.field2724 & var20) != 0 && !class154.method1029(var6, var3, var4, var21.field2724)) {
                                                    var21.field2727.method120(0, class228.field3464, class158.field2201, class30.field414, class177.field2483, var21.field2729 - class124.field1745, var21.field2722 - class21.field309, var21.field2721 - class65.field889, var21.field2719, var5, (class97) null);
                                                }
                                            }
                                            if (var22 != null && !class94.method632(var6, var3, var4, var22.field3459.method106())) {
                                                if ((var22.field3460 & var20) != 0) {
                                                    var22.field3459.method120(0, class228.field3464, class158.field2201, class30.field414, class177.field2483, var22.field3450 + var22.field3446 - class124.field1745, var22.field3452 - class21.field309, var22.field3451 + var22.field3457 - class65.field889, var22.field3453, var5, (class97) null);
                                                } else if (var22.field3460 == 256) {
                                                    int var23 = var22.field3450 - class124.field1745;
                                                    int var24 = var22.field3452 - class21.field309;
                                                    int var25 = var22.field3451 - class65.field889;
                                                    int var26 = var22.field3462;
                                                    int var27;
                                                    if (var26 == 1 || var26 == 2) {
                                                        var27 = -var23;
                                                    } else {
                                                        var27 = var23;
                                                    }
                                                    int var28;
                                                    if (var26 == 2 || var26 == 3) {
                                                        var28 = -var25;
                                                    } else {
                                                        var28 = var25;
                                                    }
                                                    if (var28 < var27) {
                                                        var22.field3459.method120(0, class228.field3464, class158.field2201, class30.field414, class177.field2483, var22.field3446 + var23, var24, var22.field3457 + var25, var22.field3453, var5, (class97) null);
                                                    } else if (var22.field3463 != null) {
                                                        var22.field3463.method120(0, class228.field3464, class158.field2201, class30.field414, class177.field2483, var23, var24, var25, var22.field3453, var5, (class97) null);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class23 var29 = var2.field1237;
                                                if (var29 != null && (var29.field322 & 0x80000000L) == 0L) {
                                                    var29.field328.method120(0, class228.field3464, class158.field2201, class30.field414, class177.field2483, var29.field325 - class124.field1745, var29.field323 - class21.field309, var29.field326 - class65.field889, var29.field322, var5, (class97) null);
                                                }
                                                class186 var30 = var2.field1246;
                                                if (var30 != null && var30.field2563 == 0) {
                                                    if (var30.field2561 != null) {
                                                        var30.field2561.method120(0, class228.field3464, class158.field2201, class30.field414, class177.field2483, var30.field2564 - class124.field1745, var30.field2567 - class21.field309, var30.field2562 - class65.field889, var30.field2569, var5, (class97) null);
                                                    }
                                                    if (var30.field2572 != null) {
                                                        var30.field2572.method120(0, class228.field3464, class158.field2201, class30.field414, class177.field2483, var30.field2564 - class124.field1745, var30.field2567 - class21.field309, var30.field2562 - class65.field889, var30.field2569, var5, (class97) null);
                                                    }
                                                    if (var30.field2566 != null) {
                                                        var30.field2566.method120(0, class228.field3464, class158.field2201, class30.field414, class177.field2483, var30.field2564 - class124.field1745, var30.field2567 - class21.field309, var30.field2562 - class65.field889, var30.field2569, var5, (class97) null);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field1245;
                                            if (var31 != 0) {
                                                if (var3 < class213.field3206 && (var31 & 0x4) != 0) {
                                                    class89 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field1222) {
                                                        class169.field2347.method988(var32, (byte) -77);
                                                    }
                                                }
                                                if (var4 < class266.field4044 && (var31 & 0x2) != 0) {
                                                    class89 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field1222) {
                                                        class169.field2347.method988(var33, (byte) -77);
                                                    }
                                                }
                                                if (var3 > class213.field3206 && (var31 & 0x1) != 0) {
                                                    class89 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field1222) {
                                                        class169.field2347.method988(var34, (byte) -77);
                                                    }
                                                }
                                                if (var4 > class266.field4044 && (var31 & 0x8) != 0) {
                                                    class89 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field1222) {
                                                        class169.field2347.method988(var35, (byte) -77);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field1231 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field1240; var37++) {
                                                if (class44.field662 != var2.field1226[var37].field2750 && (var2.field1230[var37] & var2.field1231) == var2.field1224) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class197 var38 = var2.field1244;
                                                if (!class154.method1029(var6, var3, var4, var38.field2720)) {
                                                    var38.field2725.method120(0, class228.field3464, class158.field2201, class30.field414, class177.field2483, var38.field2729 - class124.field1745, var38.field2722 - class21.field309, var38.field2721 - class65.field889, var38.field2719, var5, (class97) null);
                                                }
                                                var2.field1231 = 0;
                                            }
                                        }
                                        if (!var2.field1236) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field1240;
                                            var2.field1236 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; var41++) {
                                                class198 var42 = var2.field1226[var41];
                                                if (class44.field662 != var42.field2750) {
                                                    for (int var43 = var42.field2746; var43 <= var42.field2765; var43++) {
                                                        for (int var44 = var42.field2748; var44 <= var42.field2763; var44++) {
                                                            class89 var45 = var7[var43][var44];
                                                            if (var45.field1239) {
                                                                var2.field1236 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field1231 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field2746) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field2765) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field2748) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field2763) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field1231) == var2.field1232) {
                                                                    var2.field1236 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class36.field558[var40++] = var42;
                                                    int var47 = class213.field3206 - var42.field2746;
                                                    int var48 = var42.field2765 - class213.field3206;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class266.field4044 - var42.field2748;
                                                    int var50 = var42.field2763 - class266.field4044;
                                                    if (var50 > var49) {
                                                        var42.field2747 = var47 + var50;
                                                    } else {
                                                        var42.field2747 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class198 var54 = class36.field558[var53];
                                                    if (class44.field662 != var54.field2750) {
                                                        if (var54.field2747 > var51) {
                                                            var51 = var54.field2747;
                                                            var52 = var53;
                                                        } else if (var54.field2747 == var51) {
                                                            int var55 = var54.field2760 - class124.field1745;
                                                            int var56 = var54.field2757 - class65.field889;
                                                            int var57 = class36.field558[var52].field2760 - class124.field1745;
                                                            int var58 = class36.field558[var52].field2757 - class65.field889;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class198 var59 = class36.field558[var52];
                                                var59.field2750 = class44.field662;
                                                if (!class178.method1169(var6, var59.field2746, var59.field2765, var59.field2748, var59.field2763, var59.field2752.method106())) {
                                                    var59.field2752.method120(var59.field2762, class228.field3464, class158.field2201, class30.field414, class177.field2483, var59.field2760 - class124.field1745, var59.field2745 - class21.field309, var59.field2757 - class65.field889, var59.field2753, var5, (class97) null);
                                                }
                                                for (int var60 = var59.field2746; var60 <= var59.field2765; var60++) {
                                                    for (int var61 = var59.field2748; var61 <= var59.field2763; var61++) {
                                                        class89 var62 = var7[var60][var61];
                                                        if (var62.field1231 != 0) {
                                                            class169.field2347.method988(var62, (byte) -77);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field1222) {
                                                            class169.field2347.method988(var62, (byte) -77);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field1236) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field1236 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field1222);
                            } while (var2.field1231 != 0);
                            if (var3 > class213.field3206 || var3 <= class142.field1969) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field1222);
                        if (var3 < class213.field3206 || var3 >= class132.field1883 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field1222);
                    if (var4 > class266.field4044 || var4 <= class250.field3829) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field1222);
                if (var4 < class266.field4044 || var4 >= class93.field1286 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field1222);
            var2.field1222 = false;
            class199.field2774--;
            class186 var67 = var2.field1246;
            if (var67 != null && var67.field2563 != 0) {
                if (var67.field2561 != null) {
                    var67.field2561.method120(0, class228.field3464, class158.field2201, class30.field414, class177.field2483, var67.field2564 - class124.field1745, var67.field2567 - class21.field309 - var67.field2563, var67.field2562 - class65.field889, var67.field2569, var5, (class97) null);
                }
                if (var67.field2572 != null) {
                    var67.field2572.method120(0, class228.field3464, class158.field2201, class30.field414, class177.field2483, var67.field2564 - class124.field1745, var67.field2567 - class21.field309 - var67.field2563, var67.field2562 - class65.field889, var67.field2569, var5, (class97) null);
                }
                if (var67.field2566 != null) {
                    var67.field2566.method120(0, class228.field3464, class158.field2201, class30.field414, class177.field2483, var67.field2564 - class124.field1745, var67.field2567 - class21.field309 - var67.field2563, var67.field2562 - class65.field889, var67.field2569, var5, (class97) null);
                }
            }
            if (var2.field1228 != 0) {
                class228 var68 = var2.field1235;
                if (var68 != null && !class94.method632(var6, var3, var4, var68.field3459.method106())) {
                    if ((var68.field3460 & var2.field1228) != 0) {
                        var68.field3459.method120(0, class228.field3464, class158.field2201, class30.field414, class177.field2483, var68.field3450 + var68.field3446 - class124.field1745, var68.field3452 - class21.field309, var68.field3451 + var68.field3457 - class65.field889, var68.field3453, var5, (class97) null);
                    } else if (var68.field3460 == 256) {
                        int var69 = var68.field3450 - class124.field1745;
                        int var70 = var68.field3452 - class21.field309;
                        int var71 = var68.field3451 - class65.field889;
                        int var72 = var68.field3462;
                        int var73;
                        if (var72 == 1 || var72 == 2) {
                            var73 = -var69;
                        } else {
                            var73 = var69;
                        }
                        int var74;
                        if (var72 == 2 || var72 == 3) {
                            var74 = -var71;
                        } else {
                            var74 = var71;
                        }
                        if (var74 >= var73) {
                            var68.field3459.method120(0, class228.field3464, class158.field2201, class30.field414, class177.field2483, var68.field3446 + var69, var70, var68.field3457 + var71, var68.field3453, var5, (class97) null);
                        } else if (var68.field3463 != null) {
                            var68.field3463.method120(0, class228.field3464, class158.field2201, class30.field414, class177.field2483, var69, var70, var71, var68.field3453, var5, (class97) null);
                        }
                    }
                }
                class197 var75 = var2.field1244;
                if (var75 != null) {
                    if ((var75.field2724 & var2.field1228) != 0 && !class154.method1029(var6, var3, var4, var75.field2724)) {
                        var75.field2727.method120(0, class228.field3464, class158.field2201, class30.field414, class177.field2483, var75.field2729 - class124.field1745, var75.field2722 - class21.field309, var75.field2721 - class65.field889, var75.field2719, var5, (class97) null);
                    }
                    if ((var75.field2720 & var2.field1228) != 0 && !class154.method1029(var6, var3, var4, var75.field2720)) {
                        var75.field2725.method120(0, class228.field3464, class158.field2201, class30.field414, class177.field2483, var75.field2729 - class124.field1745, var75.field2722 - class21.field309, var75.field2721 - class65.field889, var75.field2719, var5, (class97) null);
                    }
                }
            }
            if (var5 < class27.field342 - 1) {
                class89 var76 = class194.field2682[var5 + 1][var3][var4];
                if (var76 != null && var76.field1222) {
                    class169.field2347.method988(var76, (byte) -77);
                }
            }
            if (var3 < class213.field3206) {
                class89 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field1222) {
                    class169.field2347.method988(var77, (byte) -77);
                }
            }
            if (var4 < class266.field4044) {
                class89 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field1222) {
                    class169.field2347.method988(var78, (byte) -77);
                }
            }
            if (var3 > class213.field3206) {
                class89 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field1222) {
                    class169.field2347.method988(var79, (byte) -77);
                }
            }
            if (var4 > class266.field4044) {
                class89 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field1222) {
                    class169.field2347.method988(var80, (byte) -77);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)V")
    public static void method1257(boolean arg0) {
        field2741 = null;
        field2726 = null;
        field2735 = null;
        field2740 = null;
        field2738 = null;
        field2736 = null;
        if (!arg0) {
            field2726 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(JB)Ljava/lang/String;")
    public static final String method1258(long arg0, byte arg1) {
        field2734++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            int var4 = -34 / ((-arg1 - 7) / 36);
            long var5 = arg0;
            while (var5 != 0L) {
                var5 /= 37L;
                var3++;
            }
            StringBuffer var7 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                var7.append(class75.field1045[(int) (var8 - arg0 * 37L)]);
            }
            return var7.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZZIBIII)V")
    public static final void method1259(boolean arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field2730++;
        if (arg6 == 3) {
            method1259(true, true, arg2, (byte) 22, -1, -1, class221.field3321);
            return;
        }
        Container var7;
        if (class11.field110 != null) {
            var7 = class11.field110;
        } else if (class17.field179 == null) {
            var7 = class200.field2784.field3715;
        } else {
            var7 = class17.field179;
        }
        class33.field501 = var7.getSize().width;
        client.field2194 = var7.getSize().height;
        if (class17.field179 == var7) {
            Insets var8 = class17.field179.getInsets();
            class33.field501 -= var8.left + var8.right;
            client.field2194 -= var8.top + var8.bottom;
        }
        if (arg6 >= 2) {
            class110.field1531 = 0;
            class233.field3521 = 0;
            class275.field4263 = class33.field501;
            field2739 = client.field2194;
        } else {
            class110.field1531 = 0;
            class275.field4263 = 765;
            class233.field3521 = (class33.field501 - 765) / 2;
            field2739 = 503;
        }
        if (arg1) {
            class50.method321(class156.field2177, 64);
            class253.method1691((byte) -43, class156.field2177);
            if (class178.field2503 != null) {
                class178.field2503.method6(class156.field2177, 22830);
            }
            class250.field3826.method906(-122);
            class129.method885(-1, class156.field2177);
            class137.method934((byte) -117, class156.field2177);
            if (class178.field2503 != null) {
                class178.field2503.method4(class156.field2177, 4);
            }
        } else {
            class156.field2177.setSize(class275.field4263, field2739);
            if (class17.field179 == var7) {
                Insets var9 = class17.field179.getInsets();
                class156.field2177.setLocation(class233.field3521 + var9.left, var9.top - -class110.field1531);
            } else {
                class156.field2177.setLocation(class233.field3521, class110.field1531);
            }
        }
        if (arg6 > 0) {
            method1259(true, true, arg2, (byte) 48, -1, -1, 0);
            return;
        }
        if (arg3 <= 3) {
            field2742 = -32;
        }
        class236.field3586 = !class34.method231(123);
        if (class212.field3193 != -1) {
            class75.method484(true, 2295);
        }
        if (class290.field4567 != null && (class79.field1097 == 30 || class79.field1097 == 25)) {
            class294.method1970(127);
        }
        for (int var10 = 0; var10 < 100; var10++) {
            class42.field640[var10] = true;
        }
        class210.field3001 = true;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IB)V")
    public static final void method1260(int arg0, byte arg1) {
        class280 var2 = class181.method1180(arg0, 0, 8);
        field2723++;
        if (arg1 != -18) {
            field2740 = null;
        }
        var2.method1871((byte) 26);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method1261(String[] arg0, int arg1) {
        field2737++;
        String[] var2 = new String[arg1];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        return var2;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1262(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
