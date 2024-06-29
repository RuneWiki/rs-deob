import jagex3.jagmisc.jagmisc;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class522 {

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "Lqt;")
    public static class459 field3112 = new class459(76, 2);

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "Lsn;")
    public static class453 field3115 = new class453("runescape", 0);

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "Lhl;")
    public static class375 field3116 = new class375(16);

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "[I")
    public static int[] field3118 = new int[14];

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field3120;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Ljava/lang/Class;")
    public static Class field3119;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "[Lm;")
    public static class130[] field3117;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Ltf;IIIIIIIII)V")
    public static final void method1369(class198[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class198 var11 = arg0[var10];
            if (var11 != null && var11.field3033 == arg1) {
                int var12 = var11.field2924 + arg6;
                int var13 = var11.field2957 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field2941 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field3008 + var12;
                    int var19 = var11.field2988 + var13;
                    if (var11.field2941 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field2941 == 0 || var11.field2996 || method1395(var11).field4366 != 0 || class77.field1271 == var11 || class195.field2853 == var11.field2966) {
                    if (!method1378(var11)) {
                        if (class290.field4312 == var11 && class372.method2277(class290.field4312, 22988) != null) {
                            class506.field7305 = true;
                            class474.field6915 = var12;
                            class545.field7996 = var13;
                        }
                        if (var11.field2987 || var14 < var16 && var15 < var17) {
                            if (var11.field3047 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class361 var20 = (class361) class287.field4256.method863(-1); var20 != null; var20 = (class361) class287.field4256.method865(-1)) {
                                    if (var20.field5259) {
                                        var20.method421(22071);
                                        var20.field5252.field3001 = false;
                                    }
                                }
                                if (class413.field5848 == 0) {
                                    class290.field4312 = null;
                                    class77.field1271 = null;
                                }
                                class488.field7059 = 0;
                                class101.field1567 = false;
                                class400.field5683 = false;
                                if (!class248.field3714) {
                                    class136.method990(57);
                                }
                            }
                            boolean var21;
                            if (class49.field909.method639((byte) 126) >= var14 && class49.field909.method644(101) >= var15 && class49.field909.method639((byte) 27) < var16 && class49.field909.method644(101) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class219.field3351 && var21) {
                                if (var11.field2940 >= 0) {
                                    class276.field4122 = var11.field2940;
                                } else if (var11.field3047) {
                                    class276.field4122 = -1;
                                }
                            }
                            if (!class248.field3714 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class521.method3093((byte) 82, arg9 - var13, var11, arg8 - var12);
                            }
                            boolean var22 = false;
                            if (class49.field909.method643(52) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class191 var24 = (class191) class425.field6027.method863(-1);
                            if (var24 != null && var24.method1300(0) == 0 && var24.method1301((byte) 39) >= var14 && var24.method1302(-6) >= var15 && var24.method1301((byte) 39) < var16 && var24.method1302(-6) < var17) {
                                var23 = true;
                            }
                            if (var11.field2981 != null) {
                                for (int var25 = 0; var25 < var11.field2981.length; var25++) {
                                    if (class218.field3339.method74(var11.field2981[var25], 64)) {
                                        if (var11.field2890 == null || class24.field349 >= var11.field2890[var25]) {
                                            byte var26 = var11.field2925[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class218.field3339.method74(86, 64) && !class218.field3339.method74(82, 64) && !class218.field3339.method74(81, 64)) && ((var26 & 0x2) == 0 || class218.field3339.method74(86, 64)) && ((var26 & 0x1) == 0 || class218.field3339.method74(82, 64)) && ((var26 & 0x4) == 0 || class218.field3339.method74(81, 64))) {
                                                if (var25 < 10) {
                                                    class503.method2942(var25 + 1, 0, -1, var11.field3016, "");
                                                } else if (var25 == 10) {
                                                    class461.method2735((byte) -107);
                                                    class293 var27 = method1395(var11);
                                                    class192.method1308(var27.method1887(-124), -589291614, var11, var27.field4356);
                                                    class89.field1442 = class342.method2166(var11, 0);
                                                    if (class89.field1442 == null) {
                                                        class89.field1442 = "Null";
                                                    }
                                                    class503.field7268 = var11.field2954 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field2980[var25];
                                                if (var11.field2890 == null) {
                                                    var11.field2890 = new int[var11.field2981.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field2890[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field2890[var25] = class24.field349 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field2890 != null) {
                                        var11.field2890[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class306.method1952(var24.method1302(-6) - var13, (byte) -113, var24.method1301((byte) 39) - var12, var11);
                            }
                            if (class290.field4312 != null && class290.field4312 != var11 && var21 && method1395(var11).method1888((byte) -121)) {
                                class320.field4773 = var11;
                            }
                            if (class77.field1271 == var11) {
                                class477.field6949 = true;
                                class97.field1533 = var12;
                                class299.field4462 = var13;
                            }
                            if (var11.field2996 || var11.field2966 != 0) {
                                if (var21 && class500.field7229 != 0 && var11.field3018 != null) {
                                    class361 var29 = new class361();
                                    var29.field5259 = true;
                                    var29.field5252 = var11;
                                    var29.field5254 = class500.field7229;
                                    var29.field5256 = var11.field3018;
                                    class287.field4256.method866((byte) 10, var29);
                                }
                                if (class290.field4312 != null || class248.field3714 || class141.field2182 != var11.field2966 && class488.field7059 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field2966 != 0) {
                                    if (class213.field3224 == var11.field2966 || class244.field3649 == var11.field2966) {
                                        class496.field7174 = var11;
                                        if (class391.field5551 != null) {
                                            class391.field5551.method2076(class76.field1256, var11.field2988, (byte) 92);
                                        }
                                        if (class213.field3224 == var11.field2966) {
                                            if (!class248.field3714 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class349.method2202(arg9, class76.field1256, (byte) -82, arg8);
                                                for (class102 var30 = (class102) class25.field358.method904(false); var30 != null; var30 = (class102) class25.field358.method907(-1)) {
                                                    if (arg8 >= var30.field1583 && arg8 < var30.field1581 && arg9 >= var30.field1582 && arg9 < var30.field1578) {
                                                        class136.method990(94);
                                                        class290.method1859(var30.field1576, 1);
                                                    }
                                                }
                                            }
                                            class293.method1891(var13, var11, 127, var12);
                                            continue;
                                        }
                                    }
                                    if (class195.field2853 == var11.field2966) {
                                        if (var11.method1335(class76.field1256, (byte) 59) == null || class213.field3219 != 0 && class213.field3219 != 3 || class248.field3714 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field3044[var32];
                                        if (var31 < var33 || var31 > var11.field3002[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field3008 / 2;
                                        int var35 = var32 - var11.field2988 / 2;
                                        int var36;
                                        if (class294.field4381 == 4) {
                                            var36 = (int) class508.field7354 & 0x3FFF;
                                        } else {
                                            var36 = (int) class508.field7354 + class78.field1280 & 0x3FFF;
                                        }
                                        int var37 = class358.field5204[var36];
                                        int var38 = class358.field5203[var36];
                                        if (class294.field4381 != 4) {
                                            var37 = (class384.field5495 + 256) * var37 >> 8;
                                            var38 = (class384.field5495 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 15;
                                        int var40 = var35 * var38 - var34 * var37 >> 15;
                                        int var41;
                                        int var42;
                                        if (class294.field4381 == 4) {
                                            var41 = (class385.field5502 >> 7) + (var39 >> 2);
                                            var42 = (class279.field4147 >> 7) - (var40 >> 2);
                                        } else {
                                            int var43 = (class364.field5293.method135((byte) 72) - 1) * 64;
                                            var41 = (class364.field5293.field6961 - var43 >> 7) + (var39 >> 2);
                                            var42 = (class364.field5293.field6965 - var43 >> 7) - (var40 >> 2);
                                        }
                                        if (class219.field3351 && (class25.field362 & 0x40) != 0) {
                                            class198 var44 = class539.method3173(class303.field4494, 2, class72.field1164);
                                            if (var44 == null) {
                                                class461.method2735((byte) -108);
                                            } else {
                                                class20.method114(49, 1L, true, var41, false, true, class137.field2118, " ->", class89.field1442, var11.field2952, var42);
                                            }
                                            continue;
                                        }
                                        if (class167.field2519 == class14.field163) {
                                            class20.method114(45, 1L, true, var41, false, true, -1, "", class36.field781.method426(class503.field7255, 101), -1, var42);
                                        }
                                        class20.method114(21, 1L, true, var41, false, true, class248.field3715, "", class114.field1701, -1, var42);
                                        continue;
                                    }
                                    if (class141.field2182 == var11.field2966) {
                                        class80.field1302 = var11;
                                        if (var21) {
                                            class101.field1567 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method1301((byte) 39) - var12 - var11.field3008 / 2) * 2.0D / (double) class382.field5457);
                                            int var46 = (int) (-((double) (var24.method1302(-6) - var13 - var11.field2988 / 2) * 2.0D / (double) class382.field5457));
                                            int var47 = class70.field1149 + var45 + class382.field5467;
                                            int var48 = class388.field5514 + var46 + class382.field5469;
                                            class158 var49 = class226.method1519(false);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method1107(var50, -5906, var47, var48);
                                            if (var50 != null) {
                                                if (class218.field3339.method74(82, 64) && class37.field791 > 0) {
                                                    class329.method2081(var50[1], var50[0], (byte) 94, var50[2]);
                                                    continue;
                                                }
                                                class400.field5683 = true;
                                                class344.field5072 = var50[0];
                                                class220.field3368 = var50[1];
                                                class290.field4305 = var50[2];
                                            }
                                            class488.field7059 = 1;
                                            class505.field7299 = false;
                                            class201.field3082 = class49.field909.method639((byte) -127);
                                            class505.field7298 = class49.field909.method644(101);
                                            continue;
                                        }
                                        if (var22 && class488.field7059 > 0) {
                                            if (class488.field7059 == 1 && (class201.field3082 != class49.field909.method639((byte) -115) || class505.field7298 != class49.field909.method644(101))) {
                                                class417.field5923 = class70.field1149;
                                                class312.field4654 = class388.field5514;
                                                class488.field7059 = 2;
                                            }
                                            if (class488.field7059 == 2) {
                                                class505.field7299 = true;
                                                class477.method2820(3, class417.field5923 + (int) ((double) (class201.field3082 - class49.field909.method639((byte) -115)) * 2.0D / (double) class382.field5460));
                                                class446.method2632(class312.field4654 - (int) ((double) (class505.field7298 - class49.field909.method644(101)) * 2.0D / (double) class382.field5460), true);
                                            }
                                            continue;
                                        }
                                        if (class488.field7059 > 0 && !class505.field7299) {
                                            if ((class390.field5540 == 1 || class256.method1659(-10)) && class430.field6184 > 2) {
                                                class345.method2183(class201.field3082, class505.field7298, 106);
                                            } else if (class297.method1910(0)) {
                                                class345.method2183(class201.field3082, class505.field7298, -90);
                                            }
                                        }
                                        class488.field7059 = 0;
                                        continue;
                                    }
                                    if (class87.field1413 == var11.field2966) {
                                        if (var22) {
                                            class366.method2249(-23643, var11.field2988, class49.field909.method639((byte) -100) - var12, var11.field3008, class49.field909.method644(101) - var13);
                                        }
                                        continue;
                                    }
                                    if (class309.field4573 == var11.field2966) {
                                        class19.method107(var12, var13, var11, (byte) 83);
                                        continue;
                                    }
                                }
                                if (!var11.field3041 && var23) {
                                    var11.field3041 = true;
                                    if (var11.field2893 != null) {
                                        class361 var51 = new class361();
                                        var51.field5259 = true;
                                        var51.field5252 = var11;
                                        var51.field5257 = var24.method1301((byte) 39) - var12;
                                        var51.field5254 = var24.method1302(-6) - var13;
                                        var51.field5256 = var11.field2893;
                                        class287.field4256.method866((byte) 10, var51);
                                    }
                                }
                                if (var11.field3041 && var22 && var11.field3010 != null) {
                                    class361 var52 = new class361();
                                    var52.field5259 = true;
                                    var52.field5252 = var11;
                                    var52.field5257 = class49.field909.method639((byte) 112) - var12;
                                    var52.field5254 = class49.field909.method644(101) - var13;
                                    var52.field5256 = var11.field3010;
                                    class287.field4256.method866((byte) 10, var52);
                                }
                                if (var11.field3041 && !var22) {
                                    var11.field3041 = false;
                                    if (var11.field2991 != null) {
                                        class361 var53 = new class361();
                                        var53.field5259 = true;
                                        var53.field5252 = var11;
                                        var53.field5257 = class49.field909.method639((byte) -121) - var12;
                                        var53.field5254 = class49.field909.method644(101) - var13;
                                        var53.field5256 = var11.field2991;
                                        class152.field2320.method866((byte) 10, var53);
                                    }
                                }
                                if (var22 && var11.field2960 != null) {
                                    class361 var54 = new class361();
                                    var54.field5259 = true;
                                    var54.field5252 = var11;
                                    var54.field5257 = class49.field909.method639((byte) 35) - var12;
                                    var54.field5254 = class49.field909.method644(101) - var13;
                                    var54.field5256 = var11.field2960;
                                    class287.field4256.method866((byte) 10, var54);
                                }
                                if (!var11.field3001 && var21) {
                                    var11.field3001 = true;
                                    if (var11.field2885 != null) {
                                        class361 var55 = new class361();
                                        var55.field5259 = true;
                                        var55.field5252 = var11;
                                        var55.field5257 = class49.field909.method639((byte) -95) - var12;
                                        var55.field5254 = class49.field909.method644(101) - var13;
                                        var55.field5256 = var11.field2885;
                                        class287.field4256.method866((byte) 10, var55);
                                    }
                                }
                                if (var11.field3001 && var21 && var11.field3049 != null) {
                                    class361 var56 = new class361();
                                    var56.field5259 = true;
                                    var56.field5252 = var11;
                                    var56.field5257 = class49.field909.method639((byte) -93) - var12;
                                    var56.field5254 = class49.field909.method644(101) - var13;
                                    var56.field5256 = var11.field3049;
                                    class287.field4256.method866((byte) 10, var56);
                                }
                                if (var11.field3001 && !var21) {
                                    var11.field3001 = false;
                                    if (var11.field2965 != null) {
                                        class361 var57 = new class361();
                                        var57.field5259 = true;
                                        var57.field5252 = var11;
                                        var57.field5257 = class49.field909.method639((byte) -92) - var12;
                                        var57.field5254 = class49.field909.method644(101) - var13;
                                        var57.field5256 = var11.field2965;
                                        class152.field2320.method866((byte) 10, var57);
                                    }
                                }
                                if (var11.field2897 != null) {
                                    class361 var58 = new class361();
                                    var58.field5252 = var11;
                                    var58.field5256 = var11.field2897;
                                    class360.field5235.method866((byte) 10, var58);
                                }
                                if (var11.field3024 != null && class447.field6385 > var11.field2899) {
                                    if (var11.field2918 == null || class447.field6385 - var11.field2899 > 32) {
                                        class361 var63 = new class361();
                                        var63.field5252 = var11;
                                        var63.field5256 = var11.field3024;
                                        class287.field4256.method866((byte) 10, var63);
                                    } else {
                                        label693: for (int var59 = var11.field2899; var59 < class447.field6385; var59++) {
                                            int var60 = class297.field4441[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field2918.length; var61++) {
                                                if (var11.field2918[var61] == var60) {
                                                    class361 var62 = new class361();
                                                    var62.field5252 = var11;
                                                    var62.field5256 = var11.field3024;
                                                    class287.field4256.method866((byte) 10, var62);
                                                    break label693;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2899 = class447.field6385;
                                }
                                if (var11.field2989 != null && class87.field1412 > var11.field2894) {
                                    if (var11.field3051 == null || class87.field1412 - var11.field2894 > 32) {
                                        class361 var68 = new class361();
                                        var68.field5252 = var11;
                                        var68.field5256 = var11.field2989;
                                        class287.field4256.method866((byte) 10, var68);
                                    } else {
                                        label669: for (int var64 = var11.field2894; var64 < class87.field1412; var64++) {
                                            int var65 = class25.field360[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field3051.length; var66++) {
                                                if (var11.field3051[var66] == var65) {
                                                    class361 var67 = new class361();
                                                    var67.field5252 = var11;
                                                    var67.field5256 = var11.field2989;
                                                    class287.field4256.method866((byte) 10, var67);
                                                    break label669;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2894 = class87.field1412;
                                }
                                if (var11.field3007 != null && class313.field4671 > var11.field2907) {
                                    if (var11.field2929 == null || class313.field4671 - var11.field2907 > 32) {
                                        class361 var73 = new class361();
                                        var73.field5252 = var11;
                                        var73.field5256 = var11.field3007;
                                        class287.field4256.method866((byte) 10, var73);
                                    } else {
                                        label645: for (int var69 = var11.field2907; var69 < class313.field4671; var69++) {
                                            int var70 = class446.field6366[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field2929.length; var71++) {
                                                if (var11.field2929[var71] == var70) {
                                                    class361 var72 = new class361();
                                                    var72.field5252 = var11;
                                                    var72.field5256 = var11.field3007;
                                                    class287.field4256.method866((byte) 10, var72);
                                                    break label645;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2907 = class313.field4671;
                                }
                                if (var11.field2944 != null && class184.field2717 > var11.field2934) {
                                    if (var11.field2931 == null || class184.field2717 - var11.field2934 > 32) {
                                        class361 var78 = new class361();
                                        var78.field5252 = var11;
                                        var78.field5256 = var11.field2944;
                                        class287.field4256.method866((byte) 10, var78);
                                    } else {
                                        label621: for (int var74 = var11.field2934; var74 < class184.field2717; var74++) {
                                            int var75 = class280.field4170[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field2931.length; var76++) {
                                                if (var11.field2931[var76] == var75) {
                                                    class361 var77 = new class361();
                                                    var77.field5252 = var11;
                                                    var77.field5256 = var11.field2944;
                                                    class287.field4256.method866((byte) 10, var77);
                                                    break label621;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2934 = class184.field2717;
                                }
                                if (var11.field3030 != null && class12.field132 > var11.field2901) {
                                    if (var11.field3023 == null || class12.field132 - var11.field2901 > 32) {
                                        class361 var83 = new class361();
                                        var83.field5252 = var11;
                                        var83.field5256 = var11.field3030;
                                        class287.field4256.method866((byte) 10, var83);
                                    } else {
                                        label597: for (int var79 = var11.field2901; var79 < class12.field132; var79++) {
                                            int var80 = class156.field2390[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field3023.length; var81++) {
                                                if (var11.field3023[var81] == var80) {
                                                    class361 var82 = new class361();
                                                    var82.field5252 = var11;
                                                    var82.field5256 = var11.field3030;
                                                    class287.field4256.method866((byte) 10, var82);
                                                    break label597;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2901 = class12.field132;
                                }
                                if (class182.field2679 > var11.field2974 && var11.field2985 != null) {
                                    class361 var84 = new class361();
                                    var84.field5252 = var11;
                                    var84.field5256 = var11.field2985;
                                    class287.field4256.method866((byte) 10, var84);
                                }
                                if (class196.field2864 > var11.field2974 && var11.field2928 != null) {
                                    class361 var85 = new class361();
                                    var85.field5252 = var11;
                                    var85.field5256 = var11.field2928;
                                    class287.field4256.method866((byte) 10, var85);
                                }
                                if (class112.field1659 > var11.field2974 && var11.field2902 != null) {
                                    class361 var86 = new class361();
                                    var86.field5252 = var11;
                                    var86.field5256 = var11.field2902;
                                    class287.field4256.method866((byte) 10, var86);
                                }
                                if (class495.field7168 > var11.field2974 && var11.field2971 != null) {
                                    class361 var87 = new class361();
                                    var87.field5252 = var11;
                                    var87.field5256 = var11.field2971;
                                    class287.field4256.method866((byte) 10, var87);
                                }
                                if (class512.field7447 > var11.field2974 && var11.field2903 != null) {
                                    class361 var88 = new class361();
                                    var88.field5252 = var11;
                                    var88.field5256 = var11.field2903;
                                    class287.field4256.method866((byte) 10, var88);
                                }
                                var11.field2974 = class426.field6113;
                                if (var11.field3038 != null) {
                                    for (int var89 = 0; var89 < class235.field3504; var89++) {
                                        class361 var90 = new class361();
                                        var90.field5252 = var11;
                                        var90.field5255 = class355.field5175[var89].method2703((byte) -105);
                                        var90.field5258 = class355.field5175[var89].method2704(true);
                                        var90.field5256 = var11.field3038;
                                        class287.field4256.method866((byte) 10, var90);
                                    }
                                }
                                if (class11.field112 && var11.field2984 != null) {
                                    class361 var91 = new class361();
                                    var91.field5252 = var11;
                                    var91.field5256 = var11.field2984;
                                    class287.field4256.method866((byte) 10, var91);
                                }
                            }
                            if (var11.field2941 == 5 && var11.field3043 != -1) {
                                var11.method1334(class59.field1057, class175.field2614, (byte) -19).method2076(class76.field1256, var11.field2988, (byte) 112);
                            }
                            class182.method1265(var11, -6);
                            if (var11.field2941 == 0) {
                                method1369(arg0, var11.field3016, var14, var15, var16, var17, var12 - var11.field2997, var13 - var11.field2898, arg8, arg9);
                                if (var11.field3013 != null) {
                                    method1369(var11.field3013, var11.field3016, var14, var15, var16, var17, var12 - var11.field2997, var13 - var11.field2898, arg8, arg9);
                                }
                                class541 var92 = (class541) class220.field3370.method2284(true, (long) var11.field3016);
                                if (var92 != null) {
                                    if (field3115 == class14.field163 && var92.field7956 == 0 && !class248.field3714 && var21 && !class65.field1107) {
                                        class136.method990(85);
                                    }
                                    class121.method890(var12, var14, var92.field7955, var13, arg8, 1, arg9, var15, var17, var16);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class182.method1265(var11, -6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method1370(int arg0) {
        field3099++;
        if (class479.field6979.field972 > class182.field2677) {
            class474.field6918.field4015 = !class474.field6918.field4015;
            class364.field5294 = (class479.field6979.field972 * 50 - 50) * 5;
            if (class364.field5294 > 3000) {
                class364.field5294 = 3000;
            }
            if (class479.field6979.field972 >= 2 && class479.field6979.field971 == 6) {
                this.method3101("js5connect_outofdate", 3);
                class37.field799 = 13;
                return;
            }
            if (class479.field6979.field972 >= 4 && class479.field6979.field971 == -1) {
                this.method3101("js5crc", 3);
                class37.field799 = 13;
                return;
            }
            if (class479.field6979.field972 >= 4 && class496.method2909(-23928, class37.field799)) {
                if (class479.field6979.field971 == 7 || class479.field6979.field971 == 9) {
                    this.method3101("js5connect_full", 3);
                } else if (class479.field6979.field971 <= 0) {
                    this.method3101("js5io", arg0 ^ 0x6);
                } else {
                    this.method3101("js5connect", arg0 ^ 0x6);
                }
                class37.field799 = 13;
                return;
            }
        }
        if (arg0 != 5) {
            return;
        }
        class182.field2677 = class479.field6979.field972;
        if (class364.field5294 > 0) {
            class364.field5294--;
            return;
        }
        try {
            if (class88.field1429 == 0) {
                class512.field7440 = class280.field4173.method2441(class474.field6918.field4009, class474.field6918.method1719((byte) -121), -26);
                class88.field1429++;
            }
            if (class88.field1429 == 1) {
                if (class512.field7440.field1314 == 2) {
                    this.method1371(arg0 - 105, 1000);
                    return;
                }
                if (class512.field7440.field1314 == 1) {
                    class88.field1429++;
                }
            }
            if (class88.field1429 == 2) {
                class340.field5031 = new class164((Socket) class512.field7440.field1311, class280.field4173);
                class519 var2 = new class519(5);
                var2.method3048(-2034159384, class195.field2839.field19);
                var2.method3019(604, 11648);
                class340.field5031.method1181(-40, var2.field7545, 5, 0);
                class88.field1429++;
                class441.field6278 = class165.method1188((byte) 26);
            }
            if (class88.field1429 == 3) {
                if (class496.method2909(-23928, class37.field799) || class340.field5031.method1187(-112) > 0) {
                    int var3 = class340.field5031.method1182(-1);
                    if (var3 != 0) {
                        this.method1371(-53, var3);
                        return;
                    }
                    class88.field1429++;
                } else if ((class165.method1188((byte) 26) - class441.field6278) > 30000L) {
                    this.method1371(-91, 1001);
                    return;
                }
            }
            if (class88.field1429 == 4) {
                boolean var4 = class37.field799 == 1 || class359.method2227(class37.field799, (byte) -40) || class275.method1773(class37.field799, 117);
                class479.field6979.method462(class340.field5031, !var4, arg0 + 51);
                class512.field7440 = null;
                class340.field5031 = null;
                class88.field1429 = 0;
            }
        } catch (IOException var5) {
            this.method1371(-29, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method1371(int arg0, int arg1) {
        field3109++;
        class340.field5031 = null;
        class479.field6979.field971 = arg1;
        class88.field1429 = 0;
        class512.field7440 = null;
        if (arg0 <= -14) {
            class479.field6979.field972++;
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public static void method1372(int arg0) {
        if (arg0 < 110) {
            return;
        }
        field3117 = null;
        field3118 = null;
        field3116 = null;
        field3115 = null;
        field3112 = null;
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    public static final void method1373(int arg0) {
        int var1 = class452.field6603;
        int[] var2 = class532.field7853;
        int var3 = class520.field7590 ? var1 : class477.field6952 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class23 var5;
            if (var4 < var1) {
                var5 = class494.field7143[var2[var4]];
            } else {
                var5 = ((class193) class390.field5539.method2284(true, (long) class483.field7012[var4 - var1])).field2805;
            }
            if (var5.field6956 == arg0) {
                var5.field323 = 0;
                if (var5.field285 < 0) {
                    var5.field298 = false;
                } else {
                    int var6 = var5.method135((byte) 72);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field6961 & 0x7F) != 0 || (var5.field6965 & 0x7F) != 0) {
                            var5.field298 = false;
                            continue;
                        }
                    } else if ((var5.field6961 & 0x7F) != 64 || (var5.field6965 & 0x7F) != 64) {
                        var5.field298 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field6961 >> 7;
                        int var8 = var5.field6965 >> 7;
                        if (class430.field6187[var7][var8] != var5.field285) {
                            var5.field298 = true;
                            continue;
                        }
                        if (class302.field4482[var7][var8] > 1) {
                            var10002 = class302.field4482[var7][var8]--;
                            var5.field298 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 64 + 60;
                        int var10 = var5.field6961 - var9 >> 7;
                        int var11 = var5.field6965 - var9 >> 7;
                        int var12 = var5.field6961 + var9 >> 7;
                        int var13 = var5.field6965 + var9 >> 7;
                        if (!class478.method2827(var5.field285, var13, (byte) -99, var10, var11, var12)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class430.field6187[var14][var15] == var5.field285) {
                                        var10002 = class302.field4482[var14][var15]--;
                                    }
                                }
                            }
                            var5.field298 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class510 && var5.field341 != null && class24.field349 >= var5.field341.field3206 && class24.field349 < var5.field341.field3213) {
                        ((class510) var5).field7368 = false;
                    }
                    var5.field298 = false;
                    var5.field6954 = class224.method1515(var5.field6961, var5.field6965, var5.field6956, -631749433);
                    class501.method2930(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)Ljava/lang/String;")
    public final String method1374(byte arg0) {
        field3104++;
        String var2 = null;
        try {
            var2 = "[1)" + class82.field1315 + "," + class501.field7240 + "," + class69.field1139 + "," + class255.field3763 + "|";
            if (class364.field5293 != null) {
                var2 = var2 + "2)" + class123.field1944 + "," + (class364.field5293.field343[0] + class82.field1315) + "," + (class364.field5293.field344[0] + class501.field7240) + "|";
            }
            var2 = var2 + "3)" + class74.field1211 + "|4)" + class220.field3371.field2576 + "|5)" + class360.method2235(32397) + "|6)" + class50.field927 + "," + class76.field1247 + "|";
            var2 = var2 + "7)" + class220.field3371.method1215(class74.field1211, arg0 + 109) + "|";
            var2 = var2 + "8)" + class220.field3371.method1213((byte) -35, class74.field1211) + "|";
            var2 = var2 + "9)" + class220.field3371.field2567 + "|";
            var2 = var2 + "10)" + class220.field3371.field2583 + "|";
            if (arg0 != -113) {
                return null;
            }
            var2 = var2 + "11)" + class220.field3371.field2578 + "|";
            var2 = var2 + "12)" + class220.field3371.method1048(class74.field1211, 85) + "|";
            var2 = var2 + "13)" + class414.field5859 + "|";
            var2 = var2 + "14)" + class37.field799;
            try {
                var2 = var2 + "|15)" + jagmisc.getTotalPhysicalMemory();
            } catch (Throwable var15) {
            }
            try {
                if (class74.field1211 == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field3119 == null ? (field3119 = method1397("client")) : field3119).getClassLoader());
                    for (int var8 = 0; var7.size() > var8; var8++) {
                        try {
                            Object var9 = var7.elementAt(var8);
                            Field var10 = var9.getClass().getDeclaredField("name");
                            var6.invoke(var10, Boolean.TRUE);
                            try {
                                String var11 = (String) var10.get(var9);
                                if (var11 != null && var11.indexOf("sw3d.dll") != -1) {
                                    Field var12 = var9.getClass().getDeclaredField("handle");
                                    var6.invoke(var12, Boolean.TRUE);
                                    var2 = var2 + "|16)" + Long.toHexString(var12.getLong(var9));
                                    var6.invoke(var12, Boolean.FALSE);
                                }
                            } catch (Throwable var13) {
                            }
                            var6.invoke(var10, Boolean.FALSE);
                        } catch (Throwable var14) {
                        }
                    }
                }
            } catch (Throwable var16) {
            }
            var2 = var2 + "]";
        } catch (Throwable var17) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ltf;)Ltf;")
    public static final class198 method1375(class198 arg0) {
        int var1 = method1395(arg0).method1890((byte) 61);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class154.method1087(arg0.field3033, 2);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 6) {
                class444.method2624(-128, "Argument count");
            }
            class390.field5532 = new class267();
            class390.field5532.field4020 = Integer.parseInt(arg0[0]);
            class259.field3835 = new class267();
            class259.field3835.field4020 = Integer.parseInt(arg0[1]);
            class397.field5648 = new class267();
            class397.field5648.field4020 = Integer.parseInt(arg0[2]);
            class368.field5320 = class339.field5023;
            if (arg0[3].equals("live")) {
                class147.field2270 = class65.field1110;
            } else if (arg0[3].equals("rc")) {
                class147.field2270 = class181.field2674;
            } else if (arg0[3].equals("wip")) {
                class147.field2270 = class439.field6252;
            } else {
                class444.method2624(-126, "modewhat");
            }
            class503.field7255 = class163.method1177(-82, arg0[4]);
            if (class503.field7255 == -1) {
                if (arg0[4].equals("english")) {
                    class503.field7255 = 0;
                } else if (arg0[4].equals("german")) {
                    class503.field7255 = 1;
                } else {
                    class444.method2624(-123, "language");
                }
            }
            class481.field6989 = false;
            class164.field2484 = false;
            if (arg0[5].equals("game0")) {
                class14.field163 = field3115;
            } else if (arg0[5].equals("game1")) {
                class14.field163 = class167.field2519;
            } else {
                class444.method2624(-123, "game");
            }
            class245.field3672 = 0;
            class394.field5615 = "";
            class446.field6374 = 0;
            class41.field852 = true;
            class92.field1477 = true;
            class14.field165 = false;
            class8.field59 = false;
            class275.field4114 = class14.field163.field6607;
            client var1 = new client();
            class212.field3194 = var1;
            var1.method3099(class147.field2270.method2785(-1) + 32, (byte) -114, false, 604, 30, class14.field163.field6605, 1024, 768);
            class70.field1153.setLocation(40, 40);
        } catch (Exception var3) {
            class266.method1710((byte) 81, var3, null);
        }
        field3096++;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method1376(byte arg0) {
        if (arg0 < 80) {
            field3116 = null;
        }
        field3100++;
        if (class8.field59) {
            class414.field5859 = 64;
        }
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class530.method3143(89);
        class447.field6378 = new class371(class280.field4173);
        class479.field6979 = new class52();
        if (class438.field6237 != class368.field5320) {
            class445.field6348 = new byte[50][];
        }
        class220.field3371 = new class149(class280.field4173);
        if (class438.field6237 == class368.field5320) {
            class390.field5532.field4009 = this.getCodeBase().getHost();
        } else if (class372.method2276(106, class368.field5320)) {
            class390.field5532.field4009 = this.getCodeBase().getHost();
            class390.field5532.field4013 = class390.field5532.field4020 + 40000;
            class259.field3835.field4013 = class259.field3835.field4020 + 40000;
            class390.field5532.field4014 = class390.field5532.field4020 + 50000;
            class397.field5648.field4013 = class397.field5648.field4020 + 40000;
            class259.field3835.field4014 = class259.field3835.field4020 + 50000;
            class397.field5648.field4014 = class397.field5648.field4020 + 50000;
        } else if (class368.field5320 == class339.field5023) {
            class390.field5532.field4009 = "127.0.0.1";
            class259.field3835.field4009 = "127.0.0.1";
            class390.field5532.field4013 = class390.field5532.field4020 + 40000;
            class397.field5648.field4009 = "127.0.0.1";
            class259.field3835.field4013 = class259.field3835.field4020 + 40000;
            class390.field5532.field4014 = class390.field5532.field4020 + 50000;
            class397.field5648.field4013 = class397.field5648.field4020 + 40000;
            class259.field3835.field4014 = class259.field3835.field4020 + 50000;
            class397.field5648.field4014 = class397.field5648.field4020 + 50000;
        }
        if (field3115 == class14.field163) {
            class38.field812 = false;
        }
        class337.field5001 = class423.field5987 = class181.field2672 = class389.field5520 = new short[256];
        if (class167.field2519 == class14.field163) {
            class65.field1106 = true;
            class466.field6780 = 16777215;
            class157.field2401 = 0;
            class117.field1805 = class515.field7473;
            class289.field4275 = class255.field3769;
            class23.field330 = class394.field5600;
            class87.field1414 = class254.field3757;
        } else {
            class87.field1414 = class479.field6982;
            class117.field1805 = class195.field2852;
            class289.field4275 = class391.field5560;
            class23.field330 = class34.field769;
        }
        class474.field6918 = class390.field5532;
        class218.field3339 = class270.method1752((byte) 119, class481.field6991);
        class49.field909 = class478.method2828(class481.field6991, true, (byte) -105);
        class372.field5358 = class411.field5809;
        try {
            if (class280.field4173.field5822 != null) {
                class545.field7995 = new class473(class280.field4173.field5822, 5200, 0);
                for (int var3 = 0; var3 < 30; var3++) {
                    class166.field2502[var3] = new class473(class280.field4173.field5818[var3], 6000, 0);
                }
                class59.field1072 = new class473(class280.field4173.field5813, 6000, 0);
                class466.field6781 = new class91(255, class545.field7995, class59.field1072, 500000);
                class485.field7027 = new class473(class280.field4173.field5804, 24, 0);
                class280.field4173.field5822 = null;
                class280.field4173.field5813 = null;
                class280.field4173.field5818 = null;
                class280.field4173.field5804 = null;
            }
        } catch (IOException var4) {
            class485.field7027 = null;
            class59.field1072 = null;
            class545.field7995 = null;
            class466.field6781 = null;
        }
        if (class438.field6237 != class368.field5320) {
            class350.field5134 = true;
        }
        if (field3115 == class14.field163) {
            class57.field1023 = class500.field7226.method426(class503.field7255, 52);
        } else if (class167.field2519 == class14.field163) {
            class57.field1023 = class355.field5166.method426(class503.field7255, 78);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    private final void method1377(int arg0) {
        field3098++;
        if (class37.field799 == 13) {
            return;
        }
        long var2 = class95.method725(false) / 1000000L - class451.field6592;
        class451.field6592 = class95.method725(false) / 1000000L;
        boolean var4 = class341.method2159(false);
        if (var4 && class75.field1240 && class66.field1118 != null) {
            class66.field1118.method2958(arg0 + 2000);
        }
        if (class504.method2945(class37.field799, -125)) {
            if (class300.field4468 != 0L && class300.field4468 < class165.method1188((byte) 26)) {
                class477.method2825(class220.field3371.field2584, class220.field3371.field2588, 3, class360.method2235(32397), false);
            } else if (!class76.field1256.method326() && class487.field7053) {
                class27.method163(false);
            }
        }
        if (class230.field3443 == null) {
            Container var5;
            if (class70.field1153 == null) {
                var5 = class280.field4173.field5824;
            } else {
                var5 = class70.field1153;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class70.field1153 == var5) {
                Insets var8 = class70.field1153.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class228.field3431 != var6 || class299.field4463 != var7) {
                if (class76.field1256 == null || class76.field1256.method220()) {
                    class530.method3143(106);
                } else {
                    class299.field4463 = var7;
                    class228.field3431 = var6;
                }
                class300.field4468 = class165.method1188((byte) 26) + 500L;
            }
        }
        if (class230.field3443 != null && !class111.field1640 && class504.method2945(class37.field799, -113)) {
            class477.method2825(-1, -1, 3, class220.field3371.field2580, false);
        }
        boolean var9 = false;
        if (class304.field4511) {
            class304.field4511 = false;
            var9 = true;
        }
        if (var9) {
            class219.method1485((byte) 117);
        }
        if (class76.field1256 != null && class76.field1256.method326() || class360.method2235(arg0 ^ 0x7E8D) != 1) {
            class531.method3148(-47);
        }
        if (class37.field799 == arg0) {
            class520.method3084((byte) -24, class276.field4118[class275.field4114], class83.field1318[class275.field4114], class28.field392[class275.field4114], var9, class90.field1447, class490.field7071);
        } else if (class37.field799 == 1) {
            class405.method2416(class270.field4072, class28.field392[class275.field4114].getRGB(), class83.field1318[class275.field4114].getRGB(), arg0 + 117, class276.field4118[class275.field4114].getRGB(), class76.field1256.method326() | var9, class76.field1256);
        } else if (class307.method1955(class37.field799, (byte) 109)) {
            class77.method592((byte) 16);
        } else if (class279.method1798(-14337, class37.field799)) {
            class77.method592((byte) 16);
        } else if (class347.method2186(27559, class37.field799)) {
            if (class477.field6951 == 1) {
                if (class406.field5774 > class409.field5793) {
                    class409.field5793 = class406.field5774;
                }
                int var11 = (class409.field5793 - class406.field5774) * 50 / class409.field5793;
                class283.method1825(true, class406.field5775, class235.field3505.method426(class503.field7255, arg0 + 109) + "<br>(" + var11 + "%)", -105);
            } else if (class477.field6951 == 2) {
                if (class41.field851 < class215.field3233) {
                    class41.field851 = class215.field3233;
                }
                int var10 = (class41.field851 - class215.field3233) * 50 / class41.field851 + 50;
                class283.method1825(true, class406.field5775, class235.field3505.method426(class503.field7255, 47) + "<br>(" + var10 + "%)", -87);
            } else {
                class283.method1825(true, class406.field5775, class235.field3505.method426(class503.field7255, 41), -94);
            }
        } else if (class37.field799 == 9) {
            class484.method2858((byte) -90, var2);
        } else if (class37.field799 == 12) {
            class283.method1825(true, class406.field5775, class14.field145.method426(class503.field7255, 72) + "<br>" + class246.field3679.method426(class503.field7255, 108), 16);
        }
        if (class166.field2492 == 3) {
            for (int var12 = 0; var12 < class7.field52; var12++) {
                Rectangle var13 = class184.field2724[var12];
                if (class283.field4212[var12]) {
                    class76.field1256.method1193(arg0 + 1, var13.y, var13.x, var13.width, var13.height, -1996553985);
                } else if (class130.field2043[var12]) {
                    class76.field1256.method1193(1, var13.y, var13.x, var13.width, var13.height, -1996554240);
                }
            }
        }
        if (class73.method573((byte) 73)) {
            class44.method425(-19371, class76.field1256);
        }
        if (class504.method2945(class37.field799, -123) && class166.field2492 == 0 && class360.method2235(32397) == 1 && !var9 && class411.field5816.equals("1.1")) {
            int var14 = 0;
            for (int var15 = 0; var15 < class7.field52; var15++) {
                if (class130.field2043[var15]) {
                    class130.field2043[var15] = false;
                    class450.field6576[var14++] = class184.field2724[var15];
                }
            }
            class76.field1256.method206(class450.field6576, var14);
        } else if (class37.field799 != 0) {
            class76.field1256.method280();
            for (int var16 = 0; var16 < class7.field52; var16++) {
                class130.field2043[var16] = false;
            }
        }
        if (class220.field3371.field2561 == 0) {
            class477.method2826(15L, arg0);
        } else if (class220.field3371.field2561 == 1) {
            class477.method2826(10L, 0);
        } else if (class220.field3371.field2561 == 2) {
            class477.method2826(5L, 0);
        } else if (class220.field3371.field2561 == 3) {
            class477.method2826(2L, 0);
        }
        if (class98.field1541) {
            class218.method1477(97);
        }
        if (class220.field3371.field2556 && class37.field799 == 2 && class188.field2765 != -1) {
            class220.field3371.field2556 = false;
            class220.field3371.method1044(arg0 ^ 0x1, class280.field4173);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ltf;)Z")
    public static final boolean method1378(class198 arg0) {
        if (class65.field1107) {
            if (method1395(arg0).field4366 != 0) {
                return false;
            }
            if (arg0.field2941 == 0) {
                return false;
            }
        }
        return arg0.field2977;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method1379(int arg0) {
        field3102++;
        method1372(115);
        class246.method1612((byte) 103);
        class524.method3109(-32600);
        class275.method1771((byte) 16);
        class334.method2121(5);
        class505.method2947((byte) -97);
        class86.method640(-23253);
        class425.method2517(-25269);
        class525.method3113(0);
        class42.method418((byte) -112);
        class18.method104((byte) -25);
        class375.method2291(false);
        class522.method3096(-22095);
        class470.method2786((byte) -114);
        class430.method2550((byte) -27);
        class453.method2699(123);
        class15.method90((byte) 31);
        class167.method1198((byte) -127);
        class149.method1046((byte) 17);
        class118.method859((byte) 62);
        class52.method466(4);
        class393.method2373((byte) 65);
        class138.method1011(arg0 - 23);
        class320.method2013(12398);
        class473.method2804(-1);
        class91.method673(255);
        class511.method2985((byte) -70);
        class180.method1249(arg0 + 55);
        class208.method1417(111);
        class452.method2694((byte) 125);
        class77.method596((byte) -119);
        class259.method1667((byte) -90);
        class406.method2420(false);
        class73.method563(4462);
        class212.method1427(-95);
        class491.method2879(arg0 - 64);
        class380.method2304(arg0 ^ 0x6);
        class255.method1647((byte) -54);
        class319.method2008(false);
        class457.method2716(false);
        class140.method1017(arg0 ^ 0x40);
        class121.method892((byte) 106);
        class192.method1313(-589291614);
        class178.method1239(8147);
        class329.method2078(-127);
        class5.method14(-22345);
        class338.method2149(13);
        class45.method428((byte) -64);
        class224.method1516((byte) 90);
        class193.method1316((byte) 14);
        class190.method1293(260);
        class415.method2485(19486);
        class316.method1998((byte) -61);
        class136.method992(125);
        class423.method2507((byte) 76);
        class159.method1128((byte) -78);
        class431.method2560((byte) -120);
        class128.method943(-1);
        class328.method2073(arg0 - 62);
        class198.method1340(false);
        class510.method2977(1410);
        class390.method2352((byte) -63);
        class486.method2864((byte) -120);
        class90.method664(-5129);
        class519.method3050(2);
        class23.method126(-1);
        class269.method1748((byte) -44);
        class216.method1440((byte) 112);
        class50.method447(-123);
        class413.method2468((byte) 111);
        class279.method1794(-120);
        class541.method3181(arg0 - 64);
        class293.method1884((byte) 15);
        class459.method2727((byte) 115);
        class6.method20(arg0 ^ 0x65);
        class388.method2344(-48);
        class19.method109((byte) -100);
        class464.method2756(false);
        class485.method2859((byte) 108);
        class488.method2871(29289);
        class94.method723(arg0 ^ 0xFFFFDFAC);
        class219.method1487(true);
        class433.method2565(0);
        class267.method1715(false);
        class28.method168(10);
        class134.method980((byte) -122);
        class460.method2729((byte) -121);
        class38.method400(-1);
        class297.method1911((byte) 96);
        class172.method1216(arg0 - 64);
        class58.method488(-3166);
        class543.method3190(false);
        class183.method1269(true);
        class490.method2873(86);
        class336.method2137(0);
        class181.method1257(1);
        class34.method364(82);
        class261.method1682(-2860);
        class330.method2086(false);
        class335.method2126(127);
        class24.method145(-111);
        class311.method1978(114);
        class116.method842(10292);
        class200.method1357(60);
        class119.method872((byte) 41);
        class369.method2263((byte) -103);
        class260.method1671(0);
        class217.method1462((byte) -120);
        class306.method1951((byte) -18);
        class67.method532(99);
        class229.method1531(71);
        class502.method2932(arg0 - 64);
        class49.method442((byte) 9);
        class25.method158((byte) -8);
        class234.method1553((byte) 35);
        class327.method2072((byte) 127);
        class483.method2851(-102);
        class477.method2823((byte) -26);
        class62.method515(arg0 ^ 0x3E);
        class478.method2830(41);
        class166.method1189(false);
        class154.method1089(64);
        class87.method653(-24755);
        class115.method812();
        class213.method1432(false);
        class236.method1564(arg0 - 114);
        class437.method2574(-120);
        class303.method1938((byte) 53);
        class127.method940((byte) 23);
        class418.method2493(-95);
        class66.method529(-1566);
        class281.method1813();
        class382.method2335();
        class249.method1621(-97);
        class528.method3133(arg0 - 65);
        class456.method2707();
        class288.method1842(-105);
        class4.method11(arg0 ^ 0xFFFFEF56);
        class287.method1841(30);
        class53.method469(false);
        class39.method401((byte) 107);
        class429.method2548((byte) 75);
        class284.method1833((byte) 110);
        class333.method2115((byte) -48);
        class332.method2107((byte) 126);
        class521.method3090((byte) -11);
        class439.method2579(-60);
        class2.method6(-127);
        class299.method1922((byte) -106);
        class368.method2255((byte) 108);
        class220.method1491((byte) 42);
        class218.method1484(32);
        class296.method1908((byte) 122);
        class538.method3166(-10523);
        class394.method2377(arg0 + 296431357);
        class256.method1655((byte) -126);
        class518.method3012(arg0 - 31);
        class339.method2154(-110);
        class21.method119((byte) -43);
        class126.method938((byte) -52);
        class32.method178(-94);
        class92.method675(arg0 - 181);
        class315.method1995((byte) -49);
        class514.method3004(-52);
        class465.method2762(-25733);
        class129.method949();
        class114.method806((byte) 111);
        class263.method1699(0);
        class189.method1290(-69);
        class410.method2434((byte) -105);
        class258.method1664(false);
        class405.method2418(-2034);
        class88.method656(arg0 - 57);
        class130.method960((byte) -90);
        class108.method785(1);
        class467.method2773((byte) 126);
        class468.method2774((byte) -100);
        class469.method2778(true);
        class317.method2002(13);
        class152.method1079(88);
        class424.method2510((byte) 49);
        class214.method1437(6);
        class177.method1236(-127);
        class211.method1422((byte) 114);
        class515.method3006(15006);
        class366.method2250(arg0 ^ 0x70);
        class22.method121(50);
        class529.method3138(false);
        class539.method3175(arg0 - 185);
        class342.method2167((byte) -23);
        class65.method527(arg0 - 63);
        class356.method2216((byte) -70);
        class450.method2682(51);
        class377.method2302(arg0 - 165);
        class56.method479(-1);
        class63.method517(-4);
        class102.method751(803177123);
        class492.method2883(112);
        class359.method2225((byte) -25);
        class230.method1536(0);
        class203.method1404((byte) 126);
        class29.method170((byte) 48);
        class312.method1984((byte) 101);
        class233.method1549(0);
        class347.method2188(0);
        class201.method1368(-1);
        class146.method1039(arg0 ^ 0x40);
        class444.method2625(false);
        class352.method2210((byte) 102);
        class111.method792(0);
        class251.method1628(-31410);
        class155.method1090();
        class248.method1618(117);
        class280.method1803(7);
        class14.method79(false);
        class471.method2789((byte) 2);
        class254.method1639(false);
        class161.method1173((byte) 39);
        class445.method2627(arg0 - 63);
        class215.method1438(-101);
        class295.method1899(false);
        class270.method1754(arg0 ^ 0xFFFFB230);
        class274.method1763(-112);
        class348.method2193();
        class294.method1897(80);
        class370.method2266((byte) -7);
        class46.method434(arg0 + 17988);
        class71.method546(11);
        class385.method2340(122);
        class455.method2706(false);
        class442.method2602(1674279052);
        class238.method1574((byte) 126);
        class397.method2391(false);
        class497.method2912((byte) -94);
        class446.method2631(arg0 - 64);
        class403.method2410((byte) -110);
        class533.method3154(0);
        class440.method2591(-12366);
        class175.method1223(26531);
        class163.method1180((byte) 117);
        class95.method727(120);
        class79.method607(arg0 ^ 0x42);
        class7.method21(arg0 ^ arg0);
        class399.method2394(-24194);
        class321.method2047();
        class305.method1948(-124);
        class474.method2813(64);
        class527.method3132();
        class428.method2541();
        class64.method524();
        class226.method1521(arg0 + 1015);
        class285.method1836((byte) -46);
        class378.method2303();
        class313.method1988((byte) -9);
        class142.method1029(-127);
        class197.method1331(41);
        class402.method2405((byte) 25);
        class481.method2842((byte) -93);
        class151.method1072();
        class98.method737((byte) 120);
        class535.method3159((byte) 17);
        class139.method1013(6744);
        class228.method1527(28);
        class96.method731(31551);
        class133.method972(-31);
        class57.method481((byte) -124);
        class100.method741((byte) 37);
        class276.method1780(arg0 + 14947);
        class412.method2465((byte) 38);
        class400.method2398(14104);
        class106.method773(arg0 ^ 0xFFFFB9BA);
        class494.method2901((byte) 98);
        class422.method2504(-38);
        class482.method2843((byte) 47);
        class131.method964(1);
        class447.method2635(512);
        class196.method1330(-106);
        class503.method2940(2273);
        class59.method500(arg0 ^ 0x3D9);
        class117.method845(0);
        class530.method3145(arg0 ^ 0x5B15);
        class302.method1933((byte) -127);
        class75.method581(33985);
        class292.method1871((byte) -1);
        class120.method887(8);
        class176.method1230((byte) -5);
        class78.method598(-21173);
        class277.method1783(0);
        class157.method1101((byte) -122);
        class235.method1560(arg0 - 186);
        class221.method1503(-128);
        class135.method984();
        class11.method59(-124);
        class89.method663(arg0 - 65);
        class195.method1323(4096);
        class513.method3001(true);
        class30.method172(-126);
        class506.method2948(0);
        class132.method968(-1);
        class69.method541(arg0 ^ 0xBF);
        class153.method1081((byte) 14);
        class253.method1636(false);
        class501.method2929(-2048);
        class363.method2238(arg0 ^ 0x1040);
        class47.method437(-8285);
        class337.method2139(4096);
        class476.method2819(arg0 ^ 0x3);
        class340.method2157(-1);
        class76.method585((byte) -82);
        class27.method165((byte) -105);
        class350.method2205(-1);
        class451.method2690(23614);
        class387.method2343(false);
        class540.method3177(10);
        class504.method2944(true);
        class245.method1608((byte) 9);
        class12.method64(true);
        class458.method2721((byte) -114);
        class110.method790((byte) -112);
        class475.method2816((byte) 115);
        class345.method2184(false);
        class531.method3147(-28100);
        class479.method2838(arg0 - 19186);
        class36.method388((byte) 24);
        class318.method2006();
        class449.method2663();
        class472.method2796(51);
        class244.method1605((byte) -55);
        class360.method2232(arg0 ^ 0x43);
        class419.method2498(17811);
        class242.method1594(-24512);
        class290.method1857(-100);
        class41.method409((byte) 42);
        class417.method2490((byte) 127);
        class80.method610(true);
        class392.method2364(true);
        class262.method1695(13);
        class358.method2217(false);
        class141.method1025(arg0 + 1336);
        class376.method2297(120);
        class10.method54(arg0 ^ 0xFFFFFFBF);
        class8.method32(0);
        class184.method1276(8421);
        class37.method393((byte) -127);
        class408.method2427(false);
        class250.method1623((byte) 97);
        class156.method1097(11403);
        class386.method2342((byte) -88);
        class222.method1510(arg0 ^ 0x40);
        class512.method2998(1);
        class231.method1545(40);
        class51.method450(true);
        class461.method2733((byte) 104);
        class171.method1211(0);
        class448.method2637(29046);
        class462.method2736(-27919);
        class247.method1616(-24214);
        class84.method621((byte) 121);
        class349.method2201(0);
        class314.method1992((byte) 54);
        class438.method2576(arg0 - 129);
        class83.method617(0);
        class168.method1204(-2);
        class500.method2922(121);
        class202.method1399(arg0 ^ 0xFFFFFFCD);
        class55.method477((byte) 105);
        class545.method3200((byte) 65);
        class112.method796(-71);
        class289.method1851(255);
        class355.method2213(false);
        class496.method2910(2640);
        class199.method1354((byte) 124);
        class434.method2566(-115);
        class147.method1042(59);
        class241.method1592(36);
        class107.method782(true);
        class191.method1304(116);
        class283.method1826(arg0 ^ 0xFFFFFFC3);
        class194.method1319(arg0 ^ 0xFFFFFFAD);
        class364.method2245((byte) -125);
        class484.method2855(-17852);
        class185.method1280(true);
        class341.method2161((byte) -11);
        class517.method3008((byte) 15);
        class227.method1524(arg0 ^ 0x9);
        class466.method2766(arg0 ^ 0xC0);
        class532.method3152(0);
        class206.method1414(arg0 ^ 0x40);
        class436.method2571(arg0 ^ 0x6C);
        class70.method545(117);
        class179.method1247(arg0 + 29620);
        class389.method2349(true);
        class271.method1758((byte) -51);
        class421.method2502(32);
        class170.method1207((byte) -114);
        class13.method71((byte) 73);
        class391.method2356(82);
        class495.method2907(-122);
        class17.method96(arg0 - 80);
        class544.method3198(arg0 ^ 0xFFFFA702);
        class520.method3083((byte) -115);
        if (class522.field7645) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIZLuc;ILuc;)V")
    public static final void method1380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, class23 arg7, int arg8, class23 arg9) {
        field3095++;
        int var10 = arg7.method129(-85);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class343 var12 = (class343) class417.field5914.method2982(0, (long) var10);
        if (var12 == null) {
            class104[] var13 = class104.method760(class96.field1527, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class76.field1256.method308(var13[0], true);
            class417.field5914.method2981(var12, 53, (long) var10);
        }
        class229.method1530(arg3 >> 1, 128, arg8 >> 1, arg9.method135((byte) 72) * 64, arg9.field6961, arg2, 0, arg9.field6956, arg9.field6965, arg0);
        int var14 = arg5 - (18 - class452.field6599[0]);
        int var15 = arg1 - (-class452.field6599[1] + 54) - 16;
        int var16 = arg4 / 4 * 18 + var14;
        int var17 = arg4 % 4 * 18 + var15;
        if (arg6) {
            method1391(true, 24, -71);
        }
        var12.method2175(var16, var17);
        if (arg7 == arg9) {
            class76.field1256.method1200(true, var17 - 1, var16 + -1, -256, 18, 18);
        }
        class102 var18 = class188.method1287((byte) 0);
        var18.field1576 = arg7;
        var18.field1581 = var16 + 16;
        var18.field1578 = var17 + 16;
        var18.field1583 = var16;
        var18.field1582 = var17;
        class25.field358.method905(var18, 0);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    private final void method1381(byte arg0) {
        field3105++;
        if (!class220.field3371.field2556) {
            for (int var2 = 0; var2 < class235.field3504; var2++) {
                if (class355.field5175[var2].method2704(true) == 's' || class355.field5175[var2].method2704(true) == 'S') {
                    class220.field3371.field2556 = true;
                    break;
                }
            }
        }
        if (class518.field7504 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class165.method1188((byte) 26);
            if (class532.field7847 == 0L) {
                class532.field7847 = var5;
            }
            if (var4 > 16384 && var5 - class532.field7847 < 5000L) {
                if (var5 - class185.field2730 > 1000L) {
                    System.gc();
                    class185.field2730 = var5;
                }
                class90.field1447 = class330.field4870.method426(class503.field7255, 47);
                class490.field7071 = 5;
            } else {
                class90.field1447 = class198.field3028.method426(class503.field7255, 92);
                class490.field7071 = 5;
                class518.field7504 = 10;
            }
        } else if (class518.field7504 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class19.field213[var7] = class41.method411(109, class69.field1139, class255.field3763);
            }
            class90.field1447 = class513.field7452.method426(class503.field7255, 105);
            class518.field7504 = 20;
            class490.field7071 = 10;
        } else if (class518.field7504 == 20) {
            if (class24.field353 == null) {
                class24.field353 = new class393(class479.field6979, class447.field6378);
            }
            if (class24.field353.method2369(true)) {
                class474.field6906 = class498.method2918(false, (byte) 63, 1, true, 0);
                class510.field7357 = class498.method2918(false, (byte) 88, 1, true, 1);
                class468.field6795 = class498.method2918(false, (byte) 12, 1, true, 2);
                class453.field6608 = class498.method2918(false, (byte) 33, 1, true, 3);
                class386.field5505 = class498.method2918(false, (byte) 6, 1, true, 4);
                class76.field1243 = class498.method2918(true, (byte) 13, 1, true, 5);
                class425.field6000 = class498.method2918(true, (byte) 47, 1, false, 6);
                class349.field5119 = class498.method2918(false, (byte) 107, 1, true, 7);
                class96.field1527 = class498.method2918(false, (byte) 3, 1, true, 8);
                class504.field7287 = class498.method2918(false, (byte) 18, 1, true, 9);
                class263.field3975 = class498.method2918(false, (byte) 96, 1, true, 10);
                class231.field3461 = class498.method2918(false, (byte) 44, 1, true, 11);
                class464.field6744 = class498.method2918(false, (byte) 92, 1, true, 12);
                class149.field2287 = class498.method2918(false, (byte) 71, 1, true, 13);
                class76.field1248 = class498.method2918(false, (byte) 110, 1, false, 14);
                class392.field5575 = class498.method2918(false, (byte) 19, 1, true, 15);
                class459.field6656 = class498.method2918(false, (byte) 88, 1, true, 16);
                class328.field4816 = class498.method2918(false, (byte) 127, 1, true, 17);
                class334.field4945 = class498.method2918(false, (byte) 46, 1, true, 18);
                class15.field174 = class498.method2918(false, (byte) 107, 1, true, 19);
                class117.field1814 = class498.method2918(false, (byte) 116, 1, true, 20);
                class475.field6921 = class498.method2918(false, (byte) 3, 1, true, 21);
                class290.field4296 = class498.method2918(false, (byte) 79, 1, true, 22);
                class312.field4655 = class498.method2918(true, (byte) 80, 1, true, 23);
                class253.field3752 = class498.method2918(false, (byte) 19, 1, true, 24);
                class541.field7959 = class498.method2918(false, (byte) 79, 1, true, 25);
                class195.field2815 = class498.method2918(true, (byte) 29, 1, true, 26);
                class403.field5752 = class498.method2918(false, (byte) 126, 1, true, 27);
                class263.field3980 = class498.method2918(true, (byte) 65, 1, true, 28);
                class388.field5515 = class498.method2918(false, (byte) 40, 1, true, 29);
                class90.field1447 = class5.field30.method426(class503.field7255, 64);
                class518.field7504 = 30;
                class490.field7071 = 15;
            } else {
                class90.field1447 = class15.field177.method426(class503.field7255, 75);
                class490.field7071 = 12;
            }
        } else if (class518.field7504 == 30) {
            int var8 = 0;
            for (int var9 = 0; var9 < 30; var9++) {
                var8 += class425.field6008[var9].method1007(arg0 ^ 0xFFFFFFA9) * class311.field4637[var9] / 100;
            }
            if (var8 == 100) {
                class90.field1447 = class89.field1437.method426(class503.field7255, 75);
                class490.field7071 = 20;
                class517.method3007(class96.field1527, -63);
                class47.method436((byte) 125, class96.field1527);
                class518.field7504 = 40;
            } else {
                if (var8 != 0) {
                    class90.field1447 = class88.field1431.method426(class503.field7255, 86) + var8 + "%";
                }
                class490.field7071 = 20;
            }
        } else if (class518.field7504 == 40) {
            if (class263.field3980.method2028(arg0 + 87)) {
                this.method1390(class263.field3980.method2029(1, false), arg0 + 343);
                class90.field1447 = class222.field3392.method426(class503.field7255, 84);
                class518.field7504 = 50;
                class490.field7071 = 25;
            } else {
                class90.field1447 = class315.field4689.method426(class503.field7255, arg0 + 137) + class263.field3980.method2020(arg0 ^ 0xFFFFFFF8) + "%";
                class490.field7071 = 25;
            }
        } else if (class518.field7504 == 50) {
            class299.method1921(27052);
            class90.field1447 = class215.field3235.method426(class503.field7255, arg0 + 199);
            class490.field7071 = 30;
            class518.field7504 = 60;
        } else if (class518.field7504 == 60) {
            int var10 = class423.method2509(class149.field2287, (byte) -59, class96.field1527);
            int var11 = class185.method1278((byte) -21);
            if (var10 < var11) {
                class90.field1447 = class474.field6912.method426(class503.field7255, 39) + var10 * 100 / var11 + "%";
                class490.field7071 = 35;
            } else {
                class90.field1447 = class438.field6235.method426(class503.field7255, 102);
                class518.field7504 = 70;
                class490.field7071 = 35;
            }
        } else if (class518.field7504 == 70) {
            int var12 = class484.method2853((byte) 102, class96.field1527);
            int var13 = class279.method1799(false);
            if (var12 < var13) {
                class90.field1447 = class317.field4716.method426(class503.field7255, 49) + var12 * 100 / var13 + "%";
                class490.field7071 = 40;
            } else {
                class90.field1447 = class377.field5421.method426(class503.field7255, 75);
                class518.field7504 = 80;
                class490.field7071 = 40;
            }
        } else if (class518.field7504 == 80) {
            if (class195.field2815.method2028(0)) {
                class2.field1 = new class53(class195.field2815, class504.field7287, class96.field1527);
                class90.field1447 = class23.field332.method426(class503.field7255, 65);
                class518.field7504 = 90;
                class490.field7071 = 45;
            } else {
                class90.field1447 = class314.field4683.method426(class503.field7255, 113) + class195.field2815.method2020(-36) + "%";
                class490.field7071 = 45;
            }
        } else if (class518.field7504 == 90) {
            class90.field1447 = class347.field5112.method426(class503.field7255, 115);
            class490.field7071 = 50;
            class518.field7504 = 95;
        } else if (class518.field7504 == 95) {
            if (class220.field3371.field2556) {
                class220.field3371.field2563 = 0;
                class220.field3371.field2576 = 0;
                class220.field3371.field2564 = 0;
                class220.field3371.field2553 = 0;
                class220.field3371.field2580 = 1;
            }
            class220.field3371.field2556 = true;
            class220.field3371.method1044(1, class280.field4173);
            class263.method1705(false, class220.field3371.field2553, -1);
            class90.field1447 = class545.field7994.method426(class503.field7255, arg0 ^ 0xFFFFFF81);
            class490.field7071 = 55;
            class518.field7504 = 100;
        } else if (class518.field7504 == 100) {
            class70.method543(class149.field2287, (byte) -55, class96.field1527, class76.field1256);
            class90.field1447 = class403.field5740.method426(class503.field7255, arg0 + 170);
            class490.field7071 = 60;
            class170.method1206(1, 1);
            class518.field7504 = 110;
        } else if (class518.field7504 == 110) {
            class468.field6795.method2028(0);
            byte var14 = 0;
            int var15 = var14 + class468.field6795.method2020(arg0 + 168);
            class459.field6656.method2028(arg0 + 87);
            int var16 = var15 + class459.field6656.method2020(-31);
            class328.field4816.method2028(0);
            int var17 = var16 + class328.field4816.method2020(-68);
            class334.field4945.method2028(0);
            int var18 = var17 + class334.field4945.method2020(arg0 ^ 0x37);
            class15.field174.method2028(arg0 ^ 0xFFFFFFA9);
            int var19 = var18 + class15.field174.method2020(88);
            class117.field1814.method2028(0);
            int var20 = var19 + class117.field1814.method2020(79);
            class475.field6921.method2028(0);
            int var21 = var20 + class475.field6921.method2020(93);
            class290.field4296.method2028(0);
            int var22 = var21 + class290.field4296.method2020(-69);
            class253.field3752.method2028(0);
            int var23 = var22 + class253.field3752.method2020(94);
            class541.field7959.method2028(0);
            int var24 = var23 + class541.field7959.method2020(92);
            class403.field5752.method2028(0);
            int var25 = var24 + class403.field5752.method2020(arg0 ^ 0xFFFFFFDB);
            class388.field5515.method2028(arg0 + 87);
            int var26 = var25 + class388.field5515.method2020(-90);
            if (var26 < 1200) {
                class90.field1447 = class530.field7831.method426(class503.field7255, 62) + var26 / 12 + "%";
                class490.field7071 = 65;
            } else {
                class510.field7361 = new class319(class14.field163, class503.field7255, class468.field6795);
                class147.field2266 = new class180(class14.field163, class503.field7255, class468.field6795);
                class355.field5172 = new class208(class14.field163, class503.field7255, class468.field6795, class96.field1527);
                class6.field37 = new class452(class14.field163, class503.field7255, class328.field4816);
                class451.field6589 = new class344(class14.field163, class503.field7255, class468.field6795);
                class90.field1452 = new class77(class14.field163, class503.field7255, class468.field6795);
                class303.field4490 = new class74(class14.field163, class503.field7255, class468.field6795, class349.field5119);
                class106.field1598 = new class259(class14.field163, class503.field7255, class468.field6795);
                class163.field2468 = new class406(class14.field163, class503.field7255, class468.field6795);
                class277.field4139 = new class73(class14.field163, class503.field7255, true, class459.field6656, class349.field5119);
                class506.field7320 = new class212(class14.field163, class503.field7255, class468.field6795, class96.field1527);
                class389.field5528 = new class491(class14.field163, class503.field7255, class468.field6795, class96.field1527);
                class117.field1812 = new class380(class14.field163, class503.field7255, true, class334.field4945, class349.field5119);
                class58.field1052 = new class255(class14.field163, class503.field7255, true, class510.field7361, class15.field174, class349.field5119);
                class159.field2443 = new class298(class14.field163, class503.field7255, class468.field6795);
                class96.field1526 = new class457(class14.field163, class503.field7255, class117.field1814, class474.field6906, class510.field7357);
                class175.field2614 = new class140(class14.field163, class503.field7255, class468.field6795);
                class59.field1057 = new class121(class14.field163, class503.field7255, class468.field6795);
                class69.field1133 = new class192(class14.field163, class503.field7255, class475.field6921, class349.field5119);
                class88.field1430 = new class178(class14.field163, class503.field7255, class468.field6795);
                class84.field1341 = new class329(class14.field163, class503.field7255, class468.field6795);
                class191.field2784 = new class5(class14.field163, class503.field7255, class468.field6795);
                class6.field36 = new class338(class14.field163, class503.field7255, class290.field4296);
                class429.field6177 = new class45(class14.field163, class503.field7255, class468.field6795);
                class218.method1480(class96.field1527, class349.field5119, class149.field2287, class453.field6608, (byte) 73);
                class342.method2163(79, class388.field5515);
                class419.field5954 = new class224(class503.field7255, class253.field3752, class541.field7959);
                class363.field5277 = new class526(class503.field7255, class253.field3752, class541.field7959, new class32());
                class90.field1447 = class96.field1515.method426(class503.field7255, 109);
                class490.field7071 = 65;
                class33.method222((byte) 126);
                class277.field4139.method566((byte) 91, !class220.field3371.method1048(class74.field1211, -117));
                class84.field1335 = new class307();
                class305.method1949((byte) 51);
                class36.method383(89, class403.field5752);
                class182.method1259(class349.field5119, class2.field1, -6);
                class518.field7504 = 120;
            }
        } else if (class518.field7504 == 120) {
            int var27 = class19.method108(class96.field1527, arg0 - 18190);
            int var28 = class36.method385(-3617);
            if (var27 < var28) {
                class90.field1447 = class260.field3845.method426(class503.field7255, 115) + var27 * 100 / var28 + "%";
                class490.field7071 = 70;
            } else {
                class289.method1852(arg0 ^ 0xFFFFFFCB, class76.field1256, class96.field1527);
                class482.method2844(class525.field7661, (byte) 83);
                class90.field1447 = class263.field3967.method426(class503.field7255, arg0 ^ 0xFFFFFFCB);
                class490.field7071 = 70;
                class518.field7504 = 130;
            }
        } else if (arg0 == -87) {
            if (class518.field7504 == 130) {
                if (class263.field3975.method2032(arg0 - 34, "huffman", "")) {
                    class263 var29 = new class263(class263.field3975.method2016("", arg0 + 179, "huffman"));
                    class144.method1035((byte) -66, var29);
                    class90.field1447 = class193.field2809.method426(class503.field7255, arg0 ^ 0xFFFFFF83);
                    class490.field7071 = 75;
                    class518.field7504 = 140;
                } else {
                    class90.field1447 = class532.field7845.method426(class503.field7255, 79) + "0%";
                    class490.field7071 = 75;
                }
            } else if (class518.field7504 == 140) {
                if (class453.field6608.method2028(arg0 ^ 0xFFFFFFA9)) {
                    class90.field1447 = class394.field5599.method426(class503.field7255, 87);
                    class518.field7504 = 150;
                    class490.field7071 = 80;
                } else {
                    class90.field1447 = class484.field7025.method426(class503.field7255, 103) + class453.field6608.method2020(arg0 ^ 0xFFFFFFDC) + "%";
                    class490.field7071 = 80;
                }
            } else if (class518.field7504 == 150) {
                if (class464.field6744.method2028(arg0 + 87)) {
                    class90.field1447 = class247.field3691.method426(class503.field7255, 120);
                    class518.field7504 = 160;
                    class490.field7071 = 82;
                } else {
                    class90.field1447 = class421.field5971.method426(class503.field7255, 101) + class464.field6744.method2020(-55) + "%";
                    class490.field7071 = 82;
                }
            } else if (class518.field7504 == 160) {
                if (class149.field2287.method2028(arg0 + 87)) {
                    class90.field1447 = class287.field4251.method426(class503.field7255, 44);
                    class490.field7071 = 85;
                    class518.field7504 = 170;
                } else {
                    class90.field1447 = class287.field4251.method426(class503.field7255, arg0 ^ 0xFFFFFFF6) + class149.field2287.method2020(82) + "%";
                    class490.field7071 = 85;
                }
            } else if (class518.field7504 == 170) {
                if (class312.field4655.method2046("details", 0)) {
                    class382.method2330(class312.field4655, class451.field6589, class90.field1452, class277.field4139, class506.field7320, class389.field5528, class84.field1335);
                    class90.field1447 = class506.field7317.method426(class503.field7255, 66);
                    class490.field7071 = 89;
                    class518.field7504 = 190;
                } else {
                    class90.field1447 = class412.field5835.method426(class503.field7255, 113) + class312.field4655.method2031("details", -4793) + "%";
                    class490.field7071 = 87;
                }
            } else if (class518.field7504 == 190) {
                class388.field5517 = new boolean[class191.field2784.field28];
                class288.field4270 = new int[class191.field2784.field28];
                class259.field3838 = new String[class84.field1341.field4833];
                for (int var30 = 0; var30 < class191.field2784.field28; var30++) {
                    if (class191.field2784.method13(var30, true).field7497 == 0) {
                        class388.field5517[var30] = true;
                        class263.field3979++;
                    }
                    class288.field4270[var30] = -1;
                }
                class342.method2162(255);
                class241.field3613 = class453.field6608.method2043((byte) -88, "loginscreen");
                class531.field7837 = class453.field6608.method2043((byte) 122, "lobbyscreen");
                class76.field1243.method2023(true, arg0 + 44, false);
                class425.field6000.method2023(true, 106, true);
                class96.field1527.method2023(true, 105, true);
                class149.field2287.method2023(true, arg0 - 11, true);
                class263.field3975.method2023(true, 118, true);
                class453.field6608.method2023(true, 120, true);
                class98.field1541 = true;
                class468.field6795.field4741 = 2;
                class328.field4816.field4741 = 2;
                class459.field6656.field4741 = 2;
                class334.field4945.field4741 = 2;
                class15.field174.field4741 = 2;
                class117.field1814.field4741 = 2;
                class475.field6921.field4741 = 2;
                class477.method2825(-1, -1, 3, class220.field3371.field2580, false);
                class90.field1447 = class440.field6256.method426(class503.field7255, 83);
                class490.field7071 = 95;
                class518.field7504 = 200;
            } else if (class518.field7504 == 200) {
                class170.method1206(arg0 + 88, 2);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    private final void method1382(boolean arg0) {
        field3111++;
        if (class37.field799 == 13) {
            return;
        }
        class24.field349++;
        if ((class24.field349 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class484.field7021 = var2.get(11) * 600 + (var2.get(12) * 10 + (var2.get(13) / 6));
            class349.field5123.setSeed((long) class484.field7021);
        }
        if (class24.field349 % 50 == 0) {
            class271.field4077 = class76.field1255;
            class505.field7303 = class192.field2802;
            class76.field1255 = 0;
            class192.field2802 = 0;
        }
        this.method1392(false);
        if (class24.field353 != null) {
            class24.field353.method2368(-112);
        }
        if (!arg0) {
            this.method1370(-1);
        }
        class262.method1694(15013);
        class218.field3339.method84(83);
        class49.field909.method646((byte) -123);
        if (class76.field1256 != null) {
            class76.field1256.method231((int) class165.method1188((byte) 26));
        }
        class468.method2776((byte) 69);
        class229.field3442 = 0;
        class235.field3504 = 0;
        for (class454 var3 = class218.field3339.method80((byte) -90); var3 != null; var3 = class218.field3339.method80((byte) 91)) {
            int var6 = var3.method2701(-125);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method2704(arg0);
                if (class261.method1687(-18337) && (var7 == '`' || var7 == '§')) {
                    if (class73.method573((byte) 98)) {
                        class446.method2629(-7880);
                    } else {
                        class305.method1947((byte) -6);
                    }
                } else if (class235.field3504 < 128) {
                    class355.field5175[class235.field3504] = var3;
                    class235.field3504++;
                }
            } else if (var6 == 0 && class229.field3442 < 75) {
                class528.field7713[class229.field3442] = var3;
                class229.field3442++;
            }
        }
        class500.field7229 = 0;
        for (class191 var4 = class49.field909.method647(-26); var4 != null; var4 = class49.field909.method647(-86)) {
            int var5 = var4.method1300(0);
            if (var5 == -1) {
                class154.field2340.method866((byte) 10, var4);
            } else if (var5 == 6) {
                class500.field7229 += var4.method1305((byte) 126);
            } else if (class88.method658(var5, false)) {
                class425.field6027.method866((byte) 10, var4);
                if (class425.field6027.method852(true) > 10) {
                    class425.field6027.method862(-96);
                }
            }
        }
        if (class73.method573((byte) 99)) {
            class261.method1681((byte) 71);
        }
        if (class37.field799 == 0) {
            this.method1381((byte) -87);
            class523.method3108((byte) -62);
        } else if (class37.field799 == 1) {
            this.method1381((byte) -87);
            class523.method3108((byte) -62);
        } else if (class347.method2186(27559, class37.field799)) {
            class63.method518(-76);
        }
        if (class359.method2227(class37.field799, (byte) -40) && !class347.method2186(27559, class37.field799)) {
            this.method1385(18);
            class349.method2199(80);
            class8.method33(0);
        } else if (class275.method1773(class37.field799, -96) && !class347.method2186(27559, class37.field799)) {
            this.method1385(18);
            class8.method33(0);
        } else if (class37.field799 == 11) {
            class8.method33(0);
        } else if (class171.method1210(class37.field799, -11) && !class347.method2186(27559, class37.field799)) {
            class452.method2695(1000);
        } else if (class37.field799 == 12) {
            class8.method33(0);
            if (class252.field3741 != -3 && class252.field3741 != 2 && class252.field3741 != 15) {
                class391.method2358(false, 35);
            }
        }
        class218.method1481(-17968, class76.field1256);
        class425.field6027.method862(-87);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method1383(int arg0) {
        if (class74.field1211 == 2) {
            try {
                this.method1377(0);
            } catch (Throwable var3) {
                class266.method1710((byte) 81, var3, var3.getMessage() + " (Recovered) " + this.method1374((byte) -113));
                class322.method2063(0, -125);
            }
        } else {
            this.method1377(arg0 + 12690);
        }
        field3101++;
        if (arg0 != -12690) {
            field3112 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method1384() {
        for (int var0 = 0; var0 < class69.field1139; var0++) {
            int[] var1 = class430.field6187[var0];
            for (int var2 = 0; var2 < class255.field3763; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
    private final void method1385(int arg0) {
        if (class37.field799 == 6 && class193.field2807 == 0) {
            if (class246.field3680 > 1) {
                class246.field3680--;
                class512.field7447 = class426.field6113;
            }
            if (!class248.field3714) {
                class136.method990(92);
            }
            for (int var2 = 0; var2 < 100 && class500.method2923((byte) -122); var2++) {
            }
        }
        field3097++;
        if (arg0 != 18) {
            this.method1379(-5);
        }
        class163.field2465++;
        class293.method1891(-1, null, arg0 ^ 0x6F, -1);
        class19.method107(-1, -1, null, (byte) 83);
        class277.method1781(-86);
        class426.field6113++;
        for (int var3 = 0; var3 < class329.field4838; var3++) {
            class279 var4 = class221.field3375[var3].field2805;
            if (var4 != null) {
                byte var5 = var4.field4157.field4618;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method135((byte) 72);
                    if ((var5 & 0x2) != 0 && var4.field333 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field343[0] + var7;
                            int var10 = var4.field344[0] + var8;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > class69.field1139 - var6 - 1) {
                                var9 = class69.field1139 - var6 - 1;
                            }
                            if (var10 < 0) {
                                var10 = 0;
                            } else if ((class255.field3763 - var6 - 1) < var10) {
                                var10 = class255.field3763 - var6 - 1;
                            }
                            int var11 = class121.method899(var6, 0, var6, -1, true, class206.field3142, true, var4.field344[0], 0, var9, class22.field232, var4.field343[0], var6, class19.field213[var4.field6956], var10);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field343[var12] = class206.field3142[var11 - var12 - 1];
                                    var4.field344[var12] = class22.field232[var11 - var12 - 1];
                                    var4.field342[var12] = 1;
                                }
                                var4.field333 = var11;
                            }
                        }
                    }
                    class412.method2467(var4, true, 11906);
                    int var13 = class261.method1685(var4, 64);
                    class279.method1796(var13, (byte) -115, var4, class544.field7980, class249.field3720);
                    class395.method2385(var4, -16599);
                }
            }
        }
        if (class193.field2807 == 0 && class329.field4840 == 0) {
            if (class294.field4381 == 2) {
                class538.method3169(16383);
            } else {
                class31.method173(-19900);
            }
            if ((class315.field4688 >> 7) < 14 || class69.field1139 - 14 <= class315.field4688 >> 7 || (class397.field5649 >> 7) < 14 || class397.field5649 >> 7 >= class255.field3763 - 14) {
                class37.method389(arg0 - 19);
            }
        }
        while (true) {
            class361 var14;
            class198 var15;
            class198 var16;
            do {
                var14 = (class361) class360.field5235.method862(-80);
                if (var14 == null) {
                    while (true) {
                        class361 var17;
                        class198 var18;
                        class198 var19;
                        do {
                            var17 = (class361) class152.field2320.method862(-70);
                            if (var17 == null) {
                                while (true) {
                                    class361 var20;
                                    class198 var21;
                                    class198 var22;
                                    do {
                                        var20 = (class361) class287.field4256.method862(-106);
                                        if (var20 == null) {
                                            if (class290.field4312 != null) {
                                                class18.method106((byte) -106);
                                            }
                                            if (class24.field349 % 1500 == 0) {
                                                class337.method2142(-118);
                                            }
                                            if (class37.field799 == 6 && class193.field2807 == 0) {
                                                class131.method965(arg0 ^ 0xFFFFA379);
                                            }
                                            class385.method2341(arg0 ^ 0x6BA9);
                                            if (class84.field1340 && class516.field7475 < (class165.method1188((byte) 26) - 60000L)) {
                                                class478.method2831((byte) 82);
                                            }
                                            for (class147 var23 = (class147) class247.field3688.method904(false); var23 != null; var23 = (class147) class247.field3688.method907(-1)) {
                                                if (((long) var23.field2269) < (class165.method1188((byte) 26) / 1000L - 5L)) {
                                                    if (var23.field2267 > 0) {
                                                        class10.method52("", arg0 + 96, 5, var23.field2265 + class114.field1698.method426(class503.field7255, 50), "", 0);
                                                    }
                                                    if (var23.field2267 == 0) {
                                                        class10.method52("", 52, 5, var23.field2265 + class540.field7952.method426(class503.field7255, 100), "", 0);
                                                    }
                                                    var23.method2429(126);
                                                }
                                            }
                                            if (class37.field799 == 6 && class193.field2807 == 0) {
                                                if (class410.field5802 == null) {
                                                    class391.method2358(false, arg0 ^ 0x44);
                                                    return;
                                                }
                                                class97.field1534++;
                                                if (class97.field1534 > 50) {
                                                    class228.method1528(true, class392.field5565);
                                                    class496.field7173++;
                                                }
                                                try {
                                                    if (class410.field5802 != null && class276.field4124.field7558 > 0) {
                                                        class76.field1255 += class276.field4124.field7558;
                                                        class410.field5802.method1296(class276.field4124.field7558, 0, arg0 ^ 0x4ECE, class276.field4124.field7545);
                                                        class276.field4124.field7558 = 0;
                                                        class97.field1534 = 0;
                                                        return;
                                                    }
                                                } catch (IOException var24) {
                                                    class391.method2358(false, arg0 - 145);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field5252;
                                        if (var21.field2969 < 0) {
                                            break;
                                        }
                                        var22 = class154.method1087(var21.field3033, 2);
                                    } while (var22 == null || var22.field3013 == null || var22.field3013.length <= var21.field2969 || var22.field3013[var21.field2969] != var21);
                                    class281.method1805(var20);
                                }
                            }
                            var18 = var17.field5252;
                            if (var18.field2969 < 0) {
                                break;
                            }
                            var19 = class154.method1087(var18.field3033, arg0 ^ 0x10);
                        } while (var19 == null || var19.field3013 == null || var18.field2969 >= var19.field3013.length || var19.field3013[var18.field2969] != var18);
                        class281.method1805(var17);
                    }
                }
                var15 = var14.field5252;
                if (var15.field2969 < 0) {
                    break;
                }
                var16 = class154.method1087(var15.field3033, 2);
            } while (var16 == null || var16.field3013 == null || var16.field3013.length <= var15.field2969 || var16.field3013[var15.field2969] != var15);
            class281.method1805(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method1386(int arg0) {
        if (class84.field1340) {
            class478.method2831((byte) 109);
        }
        field3107++;
        if (class76.field1256 != null) {
            class76.field1256.method1197((byte) -48);
        }
        if (class230.field3443 != null) {
            class474.method2815(false, class230.field3443, class280.field4173);
            class230.field3443 = null;
        }
        if (class410.field5802 != null) {
            class410.field5802.method1291(true);
            class410.field5802 = null;
        }
        class492.method2884(arg0 ^ 0x635C7C3A);
        class479.field6979.method465(-120);
        class447.field6378.method2268((byte) 90);
        if (class370.field5337 != null) {
            class370.field5337.method988(true);
            class370.field5337 = null;
        }
        if (arg0 != 29) {
            field3116 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
    public static final void method1387(int arg0) {
        int var1 = class452.field6603;
        int[] var2 = class532.field7853;
        for (int var3 = 0; var3 < class477.field6952 + var1; var3++) {
            class23 var4;
            if (var3 < var1) {
                var4 = class494.field7143[var2[var3]];
            } else {
                var4 = ((class193) class390.field5539.method2284(true, (long) class483.field7012[var3 - var1])).field2805;
            }
            if (var4.field6956 == arg0 && var4.field285 >= 0) {
                int var5 = var4.method135((byte) 72);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field6961 & 0x7F) != 0 || (var4.field6965 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var4.field6961 & 0x7F) != 64 || (var4.field6965 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field6961 >> 7;
                    int var7 = var4.field6965 >> 7;
                    if (var4.field285 > class430.field6187[var6][var7]) {
                        class430.field6187[var6][var7] = var4.field285;
                        class302.field4482[var6][var7] = 1;
                    } else if (class430.field6187[var6][var7] == var4.field285) {
                        var10002 = class302.field4482[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 64 + 60;
                    int var9 = var4.field6961 - var8 >> 7;
                    int var10 = var4.field6965 - var8 >> 7;
                    int var11 = var4.field6961 + var8 >> 7;
                    int var12 = var4.field6965 + var8 >> 7;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field285 > class430.field6187[var13][var14]) {
                                class430.field6187[var13][var14] = var4.field285;
                                class302.field4482[var13][var14] = 1;
                            } else if (class430.field6187[var13][var14] == var4.field285) {
                                var10002 = class302.field4482[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)V")
    public static final void method1388(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 <= 11) {
            field3116 = null;
        }
        field3110++;
        class414 var4 = class57.field1019[arg2][arg3];
        class118.method867(var4 == null ? class56.field1011 : var4, arg0, 0);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method1389() {
        class170.field2535 = 0;
        for (int var0 = 0; var0 < class477.field6952; var0++) {
            class279 var1 = ((class193) class390.field5539.method2284(true, (long) class483.field7012[var0])).field2805;
            if (var1.field298 && var1.method129(-57) != -1) {
                int var2 = (var1.method135((byte) 72) - 1) * 64 + 60;
                int var3 = var1.field6961 - var2 >> 7;
                int var4 = var1.field6965 - var2 >> 7;
                class23 var5 = class484.method2857(var3, var1.field6956, var4, (byte) -114);
                if (var5 != null) {
                    int var6 = var5.field290;
                    if (var5 instanceof class279) {
                        var6 += 2048;
                    }
                    if (var5.field323 == 0 && var5.method129(121) != -1) {
                        class149.field2284[class170.field2535] = var6;
                        class229.field3439[class170.field2535] = var6;
                        class170.field2535++;
                        var5.field323++;
                    }
                    class149.field2284[class170.field2535] = var6;
                    class229.field3439[class170.field2535] = var1.field290 + 2048;
                    class170.field2535++;
                    var5.field323++;
                }
            }
        }
        class247.method1617(class170.field2535 - 1, 0, class149.field2284, class229.field3439, false);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V")
    private final void method1390(byte[] arg0, int arg1) {
        field3114++;
        class519 var3 = new class519(arg0);
        if (arg1 != 256) {
            field3115 = null;
        }
        while (true) {
            while (true) {
                while (true) {
                    int var4 = var3.method3072((byte) -127);
                    if (var4 == 0) {
                        return;
                    }
                    if (var4 == 1) {
                        int[] var9 = class338.field5010 = new int[6];
                        var9[0] = var3.method3018(class288.method1845(arg1, 566991160));
                        var9[1] = var3.method3018(566990904);
                        var9[2] = var3.method3018(566990904);
                        var9[3] = var3.method3018(arg1 + 566990648);
                        var9[4] = var3.method3018(566990904);
                        var9[5] = var3.method3018(566990904);
                    } else if (var4 == 4) {
                        int var5 = var3.method3072((byte) -123);
                        class313.field4672 = new int[var5];
                        for (int var6 = 0; var6 < var5; var6++) {
                            class313.field4672[var6] = var3.method3018(566990904);
                            if (class313.field4672[var6] == 65535) {
                                class313.field4672[var6] = -1;
                            }
                        }
                    } else if (var4 == 5) {
                        int var7 = var3.method3072((byte) -125);
                        class198.field3048 = new int[var7];
                        for (int var8 = 0; var8 < var7; var8++) {
                            class198.field3048[var8] = var3.method3018(class288.method1845(arg1, 566991160));
                            if (class198.field3048[var8] == 65535) {
                                class198.field3048[var8] = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZII)V")
    public static final void method1391(boolean arg0, int arg1, int arg2) {
        field3113++;
        class275 var3 = class213.method1433((byte) 95, 6, arg2);
        var3.method1778(0);
        var3.field4113 = arg1;
        if (arg0) {
            method1373(-25);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field3106++;
        if (!this.method3098(-49)) {
            return;
        }
        class390.field5532 = new class267();
        class390.field5532.field4020 = Integer.parseInt(this.getParameter("worldid"));
        class259.field3835 = new class267();
        class259.field3835.field4020 = Integer.parseInt(this.getParameter("lobbyid"));
        class259.field3835.field4009 = this.getParameter("lobbyaddress");
        class397.field5648 = new class267();
        class397.field5648.field4020 = Integer.parseInt(this.getParameter("demoid"));
        class397.field5648.field4009 = this.getParameter("demoaddress");
        class368.field5320 = class483.method2848(0, Integer.parseInt(this.getParameter("modewhere")));
        if (!class372.method2276(127, class368.field5320) && class438.field6237 != class368.field5320) {
            class368.field5320 = class438.field6237;
        }
        class147.field2270 = class206.method1413((byte) -93, Integer.parseInt(this.getParameter("modewhat")));
        if (class439.field6252 != class147.field2270 && class181.field2674 != class147.field2270 && class65.field1110 != class147.field2270) {
            class147.field2270 = class65.field1110;
        }
        try {
            class503.field7255 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var10) {
            class503.field7255 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class164.field2484 = true;
        } else {
            class164.field2484 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class481.field6989 = true;
        } else {
            class481.field6989 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class311.field4619 = true;
        } else {
            class311.field4619 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class14.field163 = field3115;
            } else if (var4.equals("1")) {
                class14.field163 = class167.field2519;
            }
        }
        try {
            class446.field6374 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var9) {
            class446.field6374 = 0;
        }
        class231.field3469 = this.getParameter("quiturl");
        class394.field5615 = this.getParameter("settings");
        if (class394.field5615 == null) {
            class394.field5615 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class245.field3672 = Integer.parseInt(var5);
            } catch (Exception var8) {
                class245.field3672 = 0;
            }
        }
        class275.field4114 = Integer.parseInt(this.getParameter("colourid"));
        if (class275.field4114 < 0 || class275.field4114 >= class28.field392.length) {
            class275.field4114 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class41.field852 = true;
            class92.field1477 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class14.field165 = true;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class8.field59 = true;
        }
        if (field3115 == class14.field163) {
            class277.field4136 = 765;
            class219.field3349 = 503;
        } else if (class167.field2519 == class14.field163) {
            class219.field3349 = 480;
            class277.field4136 = 640;
        }
        class212.field3194 = this;
        this.method3105(class219.field3349, class147.field2270.method2785(-1) + 32, class277.field4136, 604, (byte) 62);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    private final void method1392(boolean arg0) {
        field3108++;
        if (!arg0) {
            boolean var2 = class479.field6979.method460(arg0);
            if (!var2) {
                this.method1370(5);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method1393() {
        int var0 = class452.field6603;
        int[] var1 = class532.field7853;
        boolean var2 = class220.field3371.field2574 == 1 && var0 > 200 || class220.field3371.field2574 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class510 var13 = class494.field7143[var1[var3]];
            if (var13.method2968(-12708)) {
                var13.method127((byte) -122);
                if (var13.field6971 >= 0 && var13.field6962 >= 0 && var13.field6970 < class69.field1139 && var13.field6959 < class255.field3763) {
                    var13.field7368 = var13.field240 ? var2 : false;
                    if (class364.field5293 == var13) {
                        var13.field285 = Integer.MAX_VALUE;
                    } else {
                        int var14 = 0;
                        if (!var13.field298) {
                            var14++;
                        }
                        if (var13.field319 > class24.field349) {
                            var14 += 2;
                        }
                        int var15 = var14 + (5 - var13.method135((byte) 72) << 2);
                        if (var13.field7375) {
                            var15 += 512;
                        } else {
                            if (class403.field5755 == 0) {
                                var15 += 32;
                            } else {
                                var15 += 128;
                            }
                            var15 += 256;
                        }
                        var13.field285 = var15 + 1;
                    }
                } else {
                    var13.field285 = -1;
                }
            } else {
                var13.field285 = -1;
            }
        }
        for (int var4 = 0; var4 < class477.field6952; var4++) {
            class279 var10 = ((class193) class390.field5539.method2284(true, (long) class483.field7012[var4])).field2805;
            if (var10.method1797(-12708) && var10.field4157.method1981(class84.field1335, 42)) {
                var10.method127((byte) -118);
                if (var10.field6971 >= 0 && var10.field6962 >= 0 && var10.field6970 < class69.field1139 && var10.field6959 < class255.field3763) {
                    int var11 = 0;
                    if (!var10.field298) {
                        var11++;
                    }
                    if (var10.field319 > class24.field349) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method135((byte) 72) << 2);
                    if (class403.field5755 == 0) {
                        if (var10.field4157.field4646) {
                            var12 += 64;
                        } else {
                            var12 += 128;
                        }
                    } else if (class403.field5755 == 1) {
                        if (var10.field4157.field4646) {
                            var12 += 32;
                        } else {
                            var12 += 64;
                        }
                    }
                    if (var10.field4157.field4607) {
                        var12 += 1024;
                    } else if (!var10.field4157.field4606) {
                        var12 += 256;
                    }
                    var10.field285 = var12 + 1;
                } else {
                    var10.field285 = -1;
                }
            } else {
                var10.field285 = -1;
            }
        }
        for (int var5 = 0; var5 < class356.field5182.length; var5++) {
            class3 var6 = class356.field5182[var5];
            if (var6 != null) {
                if (var6.field17 == 1) {
                    class193 var7 = (class193) class390.field5539.method2284(true, (long) var6.field8);
                    if (var7 != null) {
                        class279 var8 = var7.field2805;
                        if (var8.field285 >= 0) {
                            var8.field285 += 2048;
                        }
                    }
                } else if (var6.field17 == 10) {
                    class510 var9 = class494.field7143[var6.field8];
                    if (var9 != null && class364.field5293 != var9 && var9.field285 >= 0) {
                        var9.field285 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method1394(byte arg0) {
        if (class74.field1211 == 2) {
            try {
                this.method1382(true);
            } catch (Throwable var4) {
                class266.method1710((byte) 81, var4, var4.getMessage() + " (Recovered) " + this.method1374((byte) -113));
                class322.method2063(0, -122);
            }
        } else {
            this.method1382(true);
        }
        field3103++;
        int var3 = -38 % ((1 - arg0) / 44);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Ltf;)Luw;")
    public static final class293 method1395(class198 arg0) {
        class293 var1 = (class293) class363.field5276.method2284(true, ((long) arg0.field3016 << 32) + (long) arg0.field2969);
        return var1 == null ? arg0.field2962 : var1;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method1396() {
        int var0 = class452.field6603;
        int[] var1 = class532.field7853;
        int var2 = class520.field7590 ? var0 : class477.field6952 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class23 var4;
            if (var3 < var0) {
                var4 = class494.field7143[var1[var3]];
            } else {
                var4 = ((class193) class390.field5539.method2284(true, (long) class483.field7012[var3 - var0])).field2805;
            }
            if (var4.field285 >= 0) {
                int var5 = var4.method135((byte) 72);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field6961 & 0x7F) == 0 && (var4.field6965 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var4.field6961 & 0x7F) == 64 && (var4.field6965 & 0x7F) == 64) {
                    continue;
                }
                if (var4 instanceof class510 && var4.field341 != null && class24.field349 >= var4.field341.field3206 && class24.field349 < var4.field341.field3213) {
                    ((class510) var4).field7368 = false;
                }
                var4.field6954 = class224.method1515(var4.field6961, var4.field6965, var4.field6956, -631749433);
                class501.method2930(var4, true);
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1397(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
