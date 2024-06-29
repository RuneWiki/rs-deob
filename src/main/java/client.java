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
public class client extends class529 {

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field3421;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "pb", descriptor = "Ljava/lang/Class;")
    public static Class field3422;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "Z")
    public static boolean field3423;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "[[B")
    public static byte[][] field3410;

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1548(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lep;)Lep;", line = 4)
    public static final class382 method1525(class382 arg0) {
        int var1 = method1530(arg0).method1497(-76);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class505.method2903(arg0.field5108, 65535);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lep;)Z", line = 23)
    public static final boolean method1526(class382 arg0) {
        if (class87.field933) {
            if (method1530(arg0).field3339 != 0) {
                return false;
            }
            if (arg0.field5112 == 0) {
                return false;
            }
        }
        return arg0.field5087;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lep;IIIIIIIII)V", line = 40)
    public static final void method1527(class382[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class382 var11 = arg0[var10];
            if (var11 != null && var11.field5108 == arg1) {
                int var12 = var11.field4996 + arg6;
                int var13 = var11.field4987 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field5112 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field5035 + var12;
                    int var19 = var11.field4958 + var13;
                    if (var11.field5112 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field5112 == 0 || var11.field5029 || method1530(var11).field3339 != 0 || class66.field694 == var11 || class215.field2610 == var11.field5091) {
                    if (!method1526(var11)) {
                        if (class464.field6446 == var11 && class649.method3648(class464.field6446, -100) != null) {
                            class457.field6383 = true;
                            class11.field107 = var12;
                            class225.field2881 = var13;
                        }
                        if (var11.field4990 || var14 < var16 && var15 < var17) {
                            if (var11.field5019 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class676 var20 = (class676) class522.field7480.method3174((byte) 49); var20 != null; var20 = (class676) class522.field7480.method3168(false)) {
                                    if (var20.field9582) {
                                        var20.method1519((byte) 121);
                                        var20.field9585.field5086 = false;
                                    }
                                }
                                if (class185.field2249 == 0) {
                                    class464.field6446 = null;
                                    class66.field694 = null;
                                }
                                class328.field4266 = 0;
                                class285.field3657 = false;
                                class306.field4000 = false;
                                if (!class215.field2615) {
                                    class636.method3559((byte) 46);
                                }
                            }
                            boolean var21;
                            if (class407.field5419.method162(-26561) >= var14 && class407.field5419.method161(31285) >= var15 && class407.field5419.method162(-26561) < var16 && class407.field5419.method161(31285) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class477.field6938 && var21) {
                                if (var11.field5050 >= 0) {
                                    class378.field4915 = var11.field5050;
                                } else if (var11.field5019) {
                                    class378.field4915 = -1;
                                }
                            }
                            if (!class215.field2615 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class386.method2114(arg9 - var13, -1, var11, arg8 - var12);
                            }
                            boolean var22 = false;
                            if (class407.field5419.method158(-7948) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class460 var24 = (class460) class285.field3607.method3174((byte) 49);
                            if (var24 != null && var24.method787(4733) == 0 && var24.method785(-6) >= var14 && var24.method786(22461) >= var15 && var24.method785(-6) < var16 && var24.method786(22461) < var17) {
                                var23 = true;
                            }
                            if (var11.field5075 != null && !class191.method1102(-53)) {
                                for (int var25 = 0; var25 < var11.field5075.length; var25++) {
                                    if (class653.field9339.method1805((byte) -103, var11.field5075[var25])) {
                                        if (var11.field5074 == null || class469.field6549 >= var11.field5074[var25]) {
                                            byte var26 = var11.field5082[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class653.field9339.method1805((byte) -57, 86) && !class653.field9339.method1805((byte) -88, 82) && !class653.field9339.method1805((byte) -88, 81)) && ((var26 & 0x2) == 0 || class653.field9339.method1805((byte) -67, 86)) && ((var26 & 0x1) == 0 || class653.field9339.method1805((byte) -119, 82)) && ((var26 & 0x4) == 0 || class653.field9339.method1805((byte) -80, 81))) {
                                                if (var25 < 10) {
                                                    class343.method1906(var11.field5055, var25 + 1, "", 1, -1);
                                                } else if (var25 == 10) {
                                                    class420.method2278(5580);
                                                    class264 var27 = method1530(var11);
                                                    class396.method2168(var27.field3336, var27.method1495((byte) 127), (byte) 91, var11);
                                                    class419.field5567 = class236.method1370(-1, var11);
                                                    if (class419.field5567 == null) {
                                                        class419.field5567 = "Null";
                                                    }
                                                    class182.field2231 = var11.field5007 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field5119[var25];
                                                if (var11.field5074 == null) {
                                                    var11.field5074 = new int[var11.field5075.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field5074[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field5074[var25] = class469.field6549 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field5074 != null) {
                                        var11.field5074[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class625.method3496(-28759, var24.method785(-6) - var12, var24.method786(22461) - var13, var11);
                            }
                            if (class464.field6446 != null && class464.field6446 != var11 && var21 && method1530(var11).method1499((byte) -124)) {
                                class332.field4291 = var11;
                            }
                            if (class66.field694 == var11) {
                                class492.field7142 = true;
                                class485.field7063 = var12;
                                class168.field2013 = var13;
                            }
                            if (var11.field5029 || var11.field5091 != 0) {
                                if (var21 && class24.field298 != 0 && var11.field5123 != null) {
                                    class676 var29 = new class676();
                                    var29.field9582 = true;
                                    var29.field9585 = var11;
                                    var29.field9586 = class24.field298;
                                    var29.field9580 = var11.field5123;
                                    class522.field7480.method3164(var29, 256);
                                }
                                if (class464.field6446 != null || class215.field2615 || class57.field594 != var11.field5091 && class328.field4266 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field5091 != 0) {
                                    if (class44.field495 == var11.field5091 || class651.field9314 == var11.field5091) {
                                        class113.field1320 = var11;
                                        if (class309.field4008 != null) {
                                            class309.field4008.method2195(var11.field4958, 512, class453.field6284);
                                        }
                                        if (class44.field495 == var11.field5091) {
                                            if (!class215.field2615 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class438.method2417(-2, class453.field6284, arg8, arg9);
                                                for (class393 var30 = (class393) class415.field5507.method93((byte) 108); var30 != null; var30 = (class393) class415.field5507.method92(0)) {
                                                    if (arg8 >= var30.field5233 && arg8 < var30.field5232 && arg9 >= var30.field5237 && arg9 < var30.field5231) {
                                                        class636.method3559((byte) 109);
                                                        class393.method2142(var30.field5230, 28);
                                                    }
                                                }
                                            }
                                            class396.method2165(var11, var12, 63, var13);
                                            continue;
                                        }
                                    }
                                    if (class215.field2610 == var11.field5091) {
                                        if (var11.method2091((byte) -83, class453.field6284) == null || class550.field7847 != 0 && class550.field7847 != 3 || class215.field2615 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field4994[var32];
                                        if (var31 < var33 || var31 > var11.field4985[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field5035 / 2;
                                        int var35 = var32 - var11.field4958 / 2;
                                        int var36;
                                        if (class5.field41 == 4) {
                                            var36 = (int) class90.field1041 & 0x3FFF;
                                        } else {
                                            var36 = (int) class90.field1041 + class628.field8908 & 0x3FFF;
                                        }
                                        int var37 = class285.field3655[var36];
                                        int var38 = class285.field3656[var36];
                                        if (class5.field41 != 4) {
                                            var37 = (class599.field8520 + 256) * var37 >> 8;
                                            var38 = (class599.field8520 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 14;
                                        int var40 = var35 * var38 - var34 * var37 >> 14;
                                        int var41;
                                        int var42;
                                        if (class5.field41 == 4) {
                                            var41 = (class638.field9053 >> 9) + (var39 >> 2);
                                            var42 = (class437.field6085 >> 9) - (var40 >> 2);
                                        } else {
                                            int var43 = (class377.field4914.method1656(true) - 1) * 256;
                                            var41 = (class377.field4914.field4641 - var43 >> 9) + (var39 >> 2);
                                            var42 = (class377.field4914.field4647 - var43 >> 9) - (var40 >> 2);
                                        }
                                        if (class477.field6938 && (class406.field5414 & 0x40) != 0) {
                                            class382 var44 = class657.method3708(class292.field3767, (byte) -117, class411.field5451);
                                            if (var44 == null) {
                                                class420.method2278(5580);
                                            } else {
                                                class459.method2618(false, 500, var11.field5110, " ->", var41, true, var42, 1L, class419.field5567, 18, class122.field1376);
                                            }
                                            continue;
                                        }
                                        if (class343.field4453 == class220.field2668) {
                                            class459.method2618(false, 500, -1, "", var41, true, var42, 1L, class221.field2746.method1296(class226.field2899, (byte) 110), 46, -1);
                                        }
                                        class459.method2618(false, 500, -1, "", var41, true, var42, 1L, class580.field8248, 9, class552.field7867);
                                        continue;
                                    }
                                    if (class57.field594 == var11.field5091) {
                                        class9.field92 = var11;
                                        if (var21) {
                                            class285.field3657 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method785(-6) - var12 - var11.field5035 / 2) * 2.0D / (double) class637.field9019);
                                            int var46 = (int) (-((double) (var24.method786(22461) - var13 - var11.field4958 / 2) * 2.0D / (double) class637.field9019));
                                            int var47 = class306.field3998 + var45 + class637.field9039;
                                            int var48 = class122.field1375 + var46 + class637.field9043;
                                            class672 var49 = class308.method1757((byte) 90);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method3771(var50, (byte) -59, var48, var47);
                                            if (var50 != null) {
                                                if (class653.field9339.method1805((byte) -79, 82) && class295.field3874 > 0) {
                                                    class195.method1126(var50[0], 26735, var50[1], var50[2]);
                                                    continue;
                                                }
                                                class306.field4000 = true;
                                                class673.field9561 = var50[0];
                                                class310.field4016 = var50[1];
                                                class295.field3871 = var50[2];
                                            }
                                            class328.field4266 = 1;
                                            class242.field3143 = false;
                                            class422.field5614 = class407.field5419.method162(-26561);
                                            class453.field6279 = class407.field5419.method161(31285);
                                            continue;
                                        }
                                        if (var22 && class328.field4266 > 0) {
                                            if (class328.field4266 == 1 && (class422.field5614 != class407.field5419.method162(-26561) || class453.field6279 != class407.field5419.method161(31285))) {
                                                class69.field746 = class306.field3998;
                                                class164.field1973 = class122.field1375;
                                                class328.field4266 = 2;
                                            }
                                            if (class328.field4266 == 2) {
                                                class242.field3143 = true;
                                                class571.method3225(class69.field746 + (int) ((double) (class422.field5614 - class407.field5419.method162(-26561)) * 2.0D / (double) class637.field9024), true);
                                                class35.method192(-1, class164.field1973 - (int) ((double) (class453.field6279 - class407.field5419.method161(31285)) * 2.0D / (double) class637.field9024));
                                            }
                                            continue;
                                        }
                                        if (class328.field4266 > 0 && !class242.field3143) {
                                            if ((class438.field6096 == 1 || class546.method3093(6)) && class145.field1625 > 2) {
                                                class67.method438(class453.field6279, false, class422.field5614);
                                            } else if (class527.method2997((byte) -119)) {
                                                class67.method438(class453.field6279, false, class422.field5614);
                                            }
                                        }
                                        class328.field4266 = 0;
                                        continue;
                                    }
                                    if (class306.field3993 == var11.field5091) {
                                        if (var22) {
                                            class291.method1639(class407.field5419.method161(31285) - var13, var11.field4958, var11.field5035, (byte) -67, class407.field5419.method162(-26561) - var12);
                                        }
                                        continue;
                                    }
                                    if (class73.field778 == var11.field5091) {
                                        class313.method1770(var13, 1, var11, var12);
                                        continue;
                                    }
                                }
                                if (!var11.field5107 && var23) {
                                    var11.field5107 = true;
                                    if (var11.field5014 != null) {
                                        class676 var51 = new class676();
                                        var51.field9582 = true;
                                        var51.field9585 = var11;
                                        var51.field9579 = var24.method785(-6) - var12;
                                        var51.field9586 = var24.method786(22461) - var13;
                                        var51.field9580 = var11.field5014;
                                        class522.field7480.method3164(var51, 256);
                                    }
                                }
                                if (var11.field5107 && var22 && var11.field4972 != null) {
                                    class676 var52 = new class676();
                                    var52.field9582 = true;
                                    var52.field9585 = var11;
                                    var52.field9579 = class407.field5419.method162(-26561) - var12;
                                    var52.field9586 = class407.field5419.method161(31285) - var13;
                                    var52.field9580 = var11.field4972;
                                    class522.field7480.method3164(var52, 256);
                                }
                                if (var11.field5107 && !var22) {
                                    var11.field5107 = false;
                                    if (var11.field5079 != null) {
                                        class676 var53 = new class676();
                                        var53.field9582 = true;
                                        var53.field9585 = var11;
                                        var53.field9579 = class407.field5419.method162(-26561) - var12;
                                        var53.field9586 = class407.field5419.method161(31285) - var13;
                                        var53.field9580 = var11.field5079;
                                        class357.field4687.method3164(var53, 256);
                                    }
                                }
                                if (var22 && var11.field4957 != null) {
                                    class676 var54 = new class676();
                                    var54.field9582 = true;
                                    var54.field9585 = var11;
                                    var54.field9579 = class407.field5419.method162(-26561) - var12;
                                    var54.field9586 = class407.field5419.method161(31285) - var13;
                                    var54.field9580 = var11.field4957;
                                    class522.field7480.method3164(var54, 256);
                                }
                                if (!var11.field5086 && var21) {
                                    var11.field5086 = true;
                                    if (var11.field5032 != null) {
                                        class676 var55 = new class676();
                                        var55.field9582 = true;
                                        var55.field9585 = var11;
                                        var55.field9579 = class407.field5419.method162(-26561) - var12;
                                        var55.field9586 = class407.field5419.method161(31285) - var13;
                                        var55.field9580 = var11.field5032;
                                        class522.field7480.method3164(var55, 256);
                                    }
                                }
                                if (var11.field5086 && var21 && var11.field5000 != null) {
                                    class676 var56 = new class676();
                                    var56.field9582 = true;
                                    var56.field9585 = var11;
                                    var56.field9579 = class407.field5419.method162(-26561) - var12;
                                    var56.field9586 = class407.field5419.method161(31285) - var13;
                                    var56.field9580 = var11.field5000;
                                    class522.field7480.method3164(var56, 256);
                                }
                                if (var11.field5086 && !var21) {
                                    var11.field5086 = false;
                                    if (var11.field4980 != null) {
                                        class676 var57 = new class676();
                                        var57.field9582 = true;
                                        var57.field9585 = var11;
                                        var57.field9579 = class407.field5419.method162(-26561) - var12;
                                        var57.field9586 = class407.field5419.method161(31285) - var13;
                                        var57.field9580 = var11.field4980;
                                        class357.field4687.method3164(var57, 256);
                                    }
                                }
                                if (var11.field5012 != null) {
                                    class676 var58 = new class676();
                                    var58.field9585 = var11;
                                    var58.field9580 = var11.field5012;
                                    class549.field7845.method3164(var58, 256);
                                }
                                if (var11.field5078 != null && class356.field4670 > var11.field5056) {
                                    if (var11.field4986 == null || class356.field4670 - var11.field5056 > 32) {
                                        class676 var63 = new class676();
                                        var63.field9585 = var11;
                                        var63.field9580 = var11.field5078;
                                        class522.field7480.method3164(var63, 256);
                                    } else {
                                        label694: for (int var59 = var11.field5056; var59 < class356.field4670; var59++) {
                                            int var60 = class285.field3652[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field4986.length; var61++) {
                                                if (var11.field4986[var61] == var60) {
                                                    class676 var62 = new class676();
                                                    var62.field9585 = var11;
                                                    var62.field9580 = var11.field5078;
                                                    class522.field7480.method3164(var62, 256);
                                                    break label694;
                                                }
                                            }
                                        }
                                    }
                                    var11.field5056 = class356.field4670;
                                }
                                if (var11.field5106 != null && class451.field6205 > var11.field5018) {
                                    if (var11.field5015 == null || class451.field6205 - var11.field5018 > 32) {
                                        class676 var68 = new class676();
                                        var68.field9585 = var11;
                                        var68.field9580 = var11.field5106;
                                        class522.field7480.method3164(var68, 256);
                                    } else {
                                        label670: for (int var64 = var11.field5018; var64 < class451.field6205; var64++) {
                                            int var65 = class522.field7481[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field5015.length; var66++) {
                                                if (var11.field5015[var66] == var65) {
                                                    class676 var67 = new class676();
                                                    var67.field9585 = var11;
                                                    var67.field9580 = var11.field5106;
                                                    class522.field7480.method3164(var67, 256);
                                                    break label670;
                                                }
                                            }
                                        }
                                    }
                                    var11.field5018 = class451.field6205;
                                }
                                if (var11.field5092 != null && class488.field7077 > var11.field4983) {
                                    if (var11.field5113 == null || class488.field7077 - var11.field4983 > 32) {
                                        class676 var73 = new class676();
                                        var73.field9585 = var11;
                                        var73.field9580 = var11.field5092;
                                        class522.field7480.method3164(var73, 256);
                                    } else {
                                        label646: for (int var69 = var11.field4983; var69 < class488.field7077; var69++) {
                                            int var70 = class547.field7822[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field5113.length; var71++) {
                                                if (var11.field5113[var71] == var70) {
                                                    class676 var72 = new class676();
                                                    var72.field9585 = var11;
                                                    var72.field9580 = var11.field5092;
                                                    class522.field7480.method3164(var72, 256);
                                                    break label646;
                                                }
                                            }
                                        }
                                    }
                                    var11.field4983 = class488.field7077;
                                }
                                if (var11.field5104 != null && class221.field2783 > var11.field5009) {
                                    if (var11.field5036 == null || class221.field2783 - var11.field5009 > 32) {
                                        class676 var78 = new class676();
                                        var78.field9585 = var11;
                                        var78.field9580 = var11.field5104;
                                        class522.field7480.method3164(var78, 256);
                                    } else {
                                        label622: for (int var74 = var11.field5009; var74 < class221.field2783; var74++) {
                                            int var75 = class655.field9354[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field5036.length; var76++) {
                                                if (var11.field5036[var76] == var75) {
                                                    class676 var77 = new class676();
                                                    var77.field9585 = var11;
                                                    var77.field9580 = var11.field5104;
                                                    class522.field7480.method3164(var77, 256);
                                                    break label622;
                                                }
                                            }
                                        }
                                    }
                                    var11.field5009 = class221.field2783;
                                }
                                if (var11.field4988 != null && class135.field1540 > var11.field5041) {
                                    if (var11.field5103 == null || class135.field1540 - var11.field5041 > 32) {
                                        class676 var83 = new class676();
                                        var83.field9585 = var11;
                                        var83.field9580 = var11.field4988;
                                        class522.field7480.method3164(var83, 256);
                                    } else {
                                        label598: for (int var79 = var11.field5041; var79 < class135.field1540; var79++) {
                                            int var80 = class200.field2448[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field5103.length; var81++) {
                                                if (var11.field5103[var81] == var80) {
                                                    class676 var82 = new class676();
                                                    var82.field9585 = var11;
                                                    var82.field9580 = var11.field4988;
                                                    class522.field7480.method3164(var82, 256);
                                                    break label598;
                                                }
                                            }
                                        }
                                    }
                                    var11.field5041 = class135.field1540;
                                }
                                if (class304.field3981 > var11.field5044 && var11.field5001 != null) {
                                    class676 var84 = new class676();
                                    var84.field9585 = var11;
                                    var84.field9580 = var11.field5001;
                                    class522.field7480.method3164(var84, 256);
                                }
                                if (class491.field7117 > var11.field5044 && var11.field4973 != null) {
                                    class676 var85 = new class676();
                                    var85.field9585 = var11;
                                    var85.field9580 = var11.field4973;
                                    class522.field7480.method3164(var85, 256);
                                }
                                if (class375.field4874 > var11.field5044 && var11.field5021 != null) {
                                    class676 var86 = new class676();
                                    var86.field9585 = var11;
                                    var86.field9580 = var11.field5021;
                                    class522.field7480.method3164(var86, 256);
                                }
                                if (class689.field9731 > var11.field5044 && var11.field5052 != null) {
                                    class676 var87 = new class676();
                                    var87.field9585 = var11;
                                    var87.field9580 = var11.field5052;
                                    class522.field7480.method3164(var87, 256);
                                }
                                if (class369.field4790 > var11.field5044 && var11.field5100 != null) {
                                    class676 var88 = new class676();
                                    var88.field9585 = var11;
                                    var88.field9580 = var11.field5100;
                                    class522.field7480.method3164(var88, 256);
                                }
                                var11.field5044 = class204.field2494;
                                if (var11.field4961 != null) {
                                    for (int var89 = 0; var89 < class411.field5452; var89++) {
                                        class676 var90 = new class676();
                                        var90.field9585 = var11;
                                        var90.field9573 = class420.field5582[var89].method38(19888);
                                        var90.field9583 = class420.field5582[var89].method41(115);
                                        var90.field9580 = var11.field4961;
                                        class522.field7480.method3164(var90, 256);
                                    }
                                }
                                if (class116.field1348 && var11.field4991 != null) {
                                    class676 var91 = new class676();
                                    var91.field9585 = var11;
                                    var91.field9580 = var11.field4991;
                                    class522.field7480.method3164(var91, 256);
                                }
                            }
                            if (var11.field5112 == 5 && var11.field5116 != -1) {
                                var11.method2089(class246.field3174, class196.field2366, 14455).method2195(var11.field4958, 512, class453.field6284);
                            }
                            class170.method1015(0, var11);
                            if (var11.field5112 == 0) {
                                method1527(arg0, var11.field5055, var14, var15, var16, var17, var12 - var11.field5008, var13 - var11.field5051, arg8, arg9);
                                if (var11.field4989 != null) {
                                    method1527(var11.field4989, var11.field5055, var14, var15, var16, var17, var12 - var11.field5008, var13 - var11.field5051, arg8, arg9);
                                }
                                class454 var92 = (class454) class234.field2982.method3234((byte) -86, (long) var11.field5055);
                                if (var92 != null) {
                                    if (class393.field5239 == class220.field2668 && var92.field6297 == 0 && !class215.field2615 && var21 && !class87.field933) {
                                        class636.method3559((byte) 68);
                                    }
                                    class496.method2860(var16, var15, arg8, var92.field6291, arg9, var17, -1, var14, var13, var12);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class170.method1015(0, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V", line = 942)
    private final void method1528(int arg0, byte arg1) {
        class453.field6281 = 0;
        class448.field6156.field6168++;
        class448.field6156.field6170 = arg0;
        int var3 = 52 % ((arg1 - 55) / 53);
        field3409++;
        class289.field3713 = null;
        class106.field1199 = null;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 957)
    public final void init() {
        field3406++;
        if (!this.method3021((byte) 123)) {
            return;
        }
        class279.field3530 = new class305();
        class279.field3530.field3986 = Integer.parseInt(this.getParameter("worldid"));
        class255.field3257 = new class305();
        class255.field3257.field3986 = Integer.parseInt(this.getParameter("lobbyid"));
        class255.field3257.field3992 = this.getParameter("lobbyaddress");
        class152.field1726 = new class305();
        class152.field1726.field3986 = Integer.parseInt(this.getParameter("demoid"));
        class152.field1726.field3992 = this.getParameter("demoaddress");
        class73.field771 = class575.method3251(-105, Integer.parseInt(this.getParameter("modewhere")));
        if (class73.field771 == class137.field1564) {
            class73.field771 = class156.field1739;
        } else if (!class500.method2875((byte) -120, class73.field771) && class73.field771 != class553.field7884) {
            class73.field771 = class553.field7884;
        }
        class537.field7715 = class268.method1515(Integer.parseInt(this.getParameter("modewhat")), 114);
        if (class537.field7715 != class414.field5487 && class537.field7715 != class245.field3170 && class537.field7715 != class523.field7486) {
            class537.field7715 = class523.field7486;
        }
        try {
            class226.field2899 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var14) {
            class226.field2899 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class373.field4842 = true;
        } else {
            class373.field4842 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class140.field1599 = true;
        } else {
            class140.field1599 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class621.field8731 = true;
        } else {
            class621.field8731 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class220.field2668 = class393.field5239;
            } else if (var4.equals("1")) {
                class220.field2668 = class343.field4453;
            }
        }
        try {
            class559.field7965 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var13) {
            class559.field7965 = 0;
        }
        class629.field8937 = this.getParameter("quiturl");
        class68.field738 = this.getParameter("settings");
        if (class68.field738 == null) {
            class68.field738 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class92.field1046 = Integer.parseInt(var5);
            } catch (Exception var12) {
                class92.field1046 = 0;
            }
        }
        class18.field149 = Integer.parseInt(this.getParameter("colourid"));
        if (class18.field149 < 0 || class234.field2986.length <= class18.field149) {
            class18.field149 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class282.field3593 = true;
            class571.field8101 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class467.field6478 = true;
        }
        class343.field4443 = this.getParameter("sskey");
        if (class343.field4443 != null && class343.field4443.length() < 2) {
            class343.field4443 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class170.field2046 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class250.field3228 = Integer.parseInt(var8);
            } catch (Exception var11) {
            }
        }
        String var9 = this.getParameter("userFlow");
        if (var9 != null) {
            try {
                class222.field2795 = Long.parseLong(var9);
            } catch (NumberFormatException var10) {
            }
        }
        class239.field3025 = this;
        if (class393.field5239 == class220.field2668) {
            class466.field6460 = 765;
            class137.field1567 = 503;
        } else if (class343.field4453 == class220.field2668) {
            class466.field6460 = 640;
            class137.field1567 = 480;
        }
        this.method3018(113, class537.field7715.method3314((byte) 8) + 32, class137.field1567, 612, class466.field6460, 34, class220.field2668.field2513);
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 1107)
    private final void method1529(int arg0) {
        field3419++;
        if (class351.field4601 == 14) {
            return;
        }
        class469.field6549++;
        if (class469.field6549 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class671.field9539 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class626.field8884.setSeed((long) class671.field9539);
        }
        if (class469.field6549 % 50 == 0) {
            class215.field2614 = class35.field401;
            class162.field1926 = class389.field5198;
            class35.field401 = 0;
            class389.field5198 = 0;
        }
        this.method1538(84);
        if (class215.field2613 != null) {
            class215.field2613.method1961(-115);
        }
        class599.method3349(-114);
        class653.field9339.method1797((byte) 0);
        class407.field5419.method163((byte) 54);
        if (class453.field6284 != null) {
            class453.field6284.method304((int) class641.method3604(false));
        }
        class344.method1915((byte) 121);
        class411.field5452 = 0;
        class627.field8903 = 0;
        for (class597 var3 = class653.field9339.method1798((byte) 0); var3 != null; var3 = class653.field9339.method1798((byte) 0)) {
            int var6 = var3.method37((byte) -44);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method41(116);
                if (class574.method3246(119) && (var7 == '`' || var7 == '§')) {
                    if (class191.method1102(-108)) {
                        class270.method1524(4489);
                    } else {
                        class567.method3206(0);
                    }
                } else if (class411.field5452 < 128) {
                    class420.field5582[class411.field5452] = var3;
                    class411.field5452++;
                }
            } else if (var6 == 0 && class627.field8903 < 75) {
                class565.field8016[class627.field8903] = var3;
                class627.field8903++;
            }
        }
        class24.field298 = 0;
        for (class460 var4 = class407.field5419.method154(true); var4 != null; var4 = class407.field5419.method154(true)) {
            int var5 = var4.method787(4733);
            if (var5 == -1) {
                class584.field8303.method3164(var4, 256);
            } else if (var5 == 6) {
                class24.field298 += var4.method784((byte) 10);
            } else if (class596.method3337(false, var5)) {
                class285.field3607.method3164(var4, 256);
                if (class285.field3607.method3165((byte) 47) > 10) {
                    class285.field3607.method3171(768);
                }
            }
        }
        if (class191.method1102(-55)) {
            class127.method733((byte) -96);
        }
        if (class480.method2805(class351.field4601, 2)) {
            class612.method3422(-23587);
            class503.method2892(10497);
        } else if (class569.method3217((byte) -94, class351.field4601)) {
            class137.method766((byte) -114);
        }
        if (class285.method1619(true, class351.field4601) && !class569.method3217((byte) -112, class351.field4601)) {
            this.method1537(-87);
            class156.method848(-67);
            class25.method130(6);
        } else if (class521.method2973(7, class351.field4601) && !class569.method3217((byte) -101, class351.field4601)) {
            this.method1537(-127);
            class25.method130(6);
        } else if (class351.field4601 == 12) {
            class25.method130(6);
        } else if (class621.method3481(-104, class351.field4601) && !class569.method3217((byte) -106, class351.field4601)) {
            class23.method105(0);
        } else if (class351.field4601 == 13) {
            class25.method130(6);
            if (class98.field1083 != -3 && class98.field1083 != 2 && class98.field1083 != 15) {
                class184.method1069(false, false);
            }
        }
        class362.method1987(0, class453.field6284);
        class285.field3607.method3171(768);
        if (arg0 >= -76) {
            field3414 = -89;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lep;)Ltf;", line = 1274)
    public static final class264 method1530(class382 arg0) {
        class264 var1 = (class264) class464.field6451.method3234((byte) -66, ((long) arg0.field5055 << 32) + (long) arg0.field5073);
        return var1 == null ? arg0.field5084 : var1;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)Ljava/lang/String;", line = 1278)
    public final String method1531(int arg0) {
        field3408++;
        String var2 = null;
        try {
            var2 = "[1)" + class682.field9685 + "," + class146.field1642 + "," + class399.field5338 + "," + class349.field4567 + "|";
            if (class377.field4914 != null) {
                var2 = var2 + "2)" + class353.field4625 + "," + (class377.field4914.field3839[0] + class682.field9685) + "," + (class377.field4914.field3841[0] + class146.field1642) + "|";
            }
            var2 = var2 + "3)" + class150.field1711 + "|4)" + class601.field8530.field2858 + "|5)" + class480.method2800(arg0 + 32033) + "|6)" + class399.field5336 + "," + class416.field5524 + "|";
            var2 = var2 + "7)" + class601.field8530.method1320(19, class150.field1711) + "|";
            var2 = var2 + "8)" + class601.field8530.method1317((byte) -123, class150.field1711) + "|";
            var2 = var2 + "9)" + class601.field8530.field2859 + "|";
            var2 = var2 + "10)" + class601.field8530.field2876 + "|";
            var2 = var2 + "11)" + class601.field8530.field2849 + "|";
            var2 = var2 + "12)" + class601.field8530.method1835(class150.field1711, (byte) 122) + "|";
            if (arg0 != -1) {
                field3410 = null;
            }
            var2 = var2 + "13)" + class145.field1630 + "|";
            var2 = var2 + "14)" + class351.field4601;
            try {
                var2 = var2 + "|15)" + jagmisc.getTotalPhysicalMemory();
            } catch (Throwable var15) {
            }
            try {
                if (class150.field1711 == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field3422 == null ? (field3422 = method1548("client")) : field3422).getClassLoader());
                    for (int var8 = 0; var8 < var7.size(); var8++) {
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

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 1362)
    public final void method1532(int arg0) {
        if (class135.field1526) {
            class321.method1813(913);
        }
        field3412++;
        if (class453.field6284 != null) {
            class453.field6284.method3548(false);
        }
        if (arg0 <= 35) {
            return;
        }
        if (class680.field9649 != null) {
            class330.method1865(class680.field9649, (byte) 111, class623.field8837);
            class680.field9649 = null;
        }
        if (class170.field2043 != null) {
            class170.field2043.method1642(-1);
            class170.field2043 = null;
        }
        class55.method271(-26890);
        class448.field6156.method2487(false);
        class254.field3247.method1778((byte) -2);
        if (class472.field6592 != null) {
            class472.field6592.method1071(108);
            class472.field6592 = null;
        }
        try {
            class579.field8243.method2980(16383);
            for (int var2 = 0; var2 < 34; var2++) {
                class539.field7756[var2].method2980(16383);
            }
            class636.field9004.method2980(16383);
            class566.field8020.method2980(16383);
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 1418)
    public static final void method1533(int arg0) {
        int var1 = class11.field111;
        int[] var2 = class79.field827;
        for (int var3 = 0; var3 < class118.field1356 + var1; var3++) {
            class292 var4;
            if (var3 < var1) {
                var4 = class362.field4726[var2[var3]];
            } else {
                var4 = ((class443) class392.field5223.method3234((byte) -73, (long) class664.field9449[var3 - var1])).field6107;
            }
            if (var4.field4638 == arg0 && var4.field3812 >= 0) {
                int var5 = var4.method1656(true);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field4641 & 0x1FF) != 0 || (var4.field4647 & 0x1FF) != 0) {
                        continue;
                    }
                } else if ((var4.field4641 & 0x1FF) != 256 || (var4.field4647 & 0x1FF) != 256) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field4641 >> 9;
                    int var7 = var4.field4647 >> 9;
                    if (var4.field3812 > class451.field6202[var6][var7]) {
                        class451.field6202[var6][var7] = var4.field3812;
                        class115.field1339[var6][var7] = 1;
                    } else if (class451.field6202[var6][var7] == var4.field3812) {
                        var10002 = class115.field1339[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 256 + 60;
                    int var9 = var4.field4641 - var8 >> 9;
                    int var10 = var4.field4647 - var8 >> 9;
                    int var11 = var4.field4641 + var8 >> 9;
                    int var12 = var4.field4647 + var8 >> 9;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field3812 > class451.field6202[var13][var14]) {
                                class451.field6202[var13][var14] = var4.field3812;
                                class115.field1339[var13][var14] = 1;
                            } else if (class451.field6202[var13][var14] == var4.field3812) {
                                var10002 = class115.field1339[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 1519)
    public static final void method1534(int arg0) {
        int var1 = class11.field111;
        int[] var2 = class79.field827;
        int var3 = class15.field140 ? var1 : class118.field1356 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class292 var5;
            if (var4 < var1) {
                var5 = class362.field4726[var2[var4]];
            } else {
                var5 = ((class443) class392.field5223.method3234((byte) -116, (long) class664.field9449[var4 - var1])).field6107;
            }
            if (var5.field4638 == arg0) {
                var5.field3822 = 0;
                if (var5.field3812 < 0) {
                    var5.field3735 = false;
                } else {
                    int var6 = var5.method1656(true);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field4641 & 0x1FF) != 0 || (var5.field4647 & 0x1FF) != 0) {
                            var5.field3735 = false;
                            continue;
                        }
                    } else if ((var5.field4641 & 0x1FF) != 256 || (var5.field4647 & 0x1FF) != 256) {
                        var5.field3735 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field4641 >> 9;
                        int var8 = var5.field4647 >> 9;
                        if (class451.field6202[var7][var8] != var5.field3812) {
                            var5.field3735 = true;
                            continue;
                        }
                        if (class115.field1339[var7][var8] > 1) {
                            var10002 = class115.field1339[var7][var8]--;
                            var5.field3735 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 256 + 252;
                        int var10 = var5.field4641 - var9 >> 9;
                        int var11 = var5.field4647 - var9 >> 9;
                        int var12 = var5.field4641 + var9 >> 9;
                        int var13 = var5.field4647 + var9 >> 9;
                        if (!class97.method605(var5.field3812, var13, var11, var10, var12, (byte) 113)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class451.field6202[var14][var15] == var5.field3812) {
                                        var10002 = class115.field1339[var14][var15]--;
                                    }
                                }
                            }
                            var5.field3735 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class455 && var5.field3834 != null && class469.field6549 >= var5.field3834.field7412 && class469.field6549 < var5.field3834.field7411) {
                        ((class455) var5).field6325 = false;
                    }
                    var5.field3735 = false;
                    var5.field4646 = class363.method1995(var5.field4638, var5.field4647, -1327568407, var5.field4641);
                    class223.method1309(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 1636)
    public final void method1535(byte arg0) {
        field3413++;
        method1546(9);
        class118.method708(-6123);
        class530.method3028((byte) -73);
        class221.method1295((byte) 127);
        class325.method1847(-61);
        class29.method159((byte) 126);
        class189.method1096(0);
        class270.method1518((byte) -93);
        class474.method2764((byte) 123);
        class529.method3015((byte) 11);
        class601.method3361(106);
        class590.method3315(6409);
        class41.method213(-125);
        class207.method1256(100);
        class389.method2127((byte) 17);
        class635.method3551((byte) 28);
        class324.method1843(-127);
        class239.method1376(-118);
        class608.method3392(-23503);
        class448.method2486(true);
        class315.method1783((byte) -87);
        class355.method1962(36);
        class198.method1208(100);
        class523.method2988((byte) -68);
        class59.method395((byte) -66);
        class653.method3695(true);
        class593.method3326(true);
        class504.method2901(23230);
        class194.method1113(-80);
        class332.method1867(10);
        class361.method1983((byte) -112);
        class592.method3320((byte) -124);
        class185.method1076(true);
        class664.method3733(30);
        class357.method1971(10304);
        class476.method2775(2169);
        class582.method3276((byte) 4);
        class343.method1908((byte) 93);
        class110.method684((byte) -89);
        class260.method1481(-11);
        class25.method127((byte) 119);
        class87.method546(false);
        class373.method2055((byte) -113);
        class565.method3199(12);
        class299.method1692((byte) 78);
        class266.method1507(false);
        class443.method2454((byte) -85);
        class518.method2954(false);
        class617.method3466((byte) 95);
        class407.method2214((byte) -122);
        class392.method2141((byte) 14);
        class277.method1583(0);
        class420.method2271(-117);
        class672.method3770(true);
        class404.method2196((byte) 48);
        class21.method88(0);
        class382.method2098(-105);
        class438.method2416(-80);
        class455.method2587(3);
        class157.method858((byte) -88);
        class292.method1660((byte) -64);
        class195.method1133(-1);
        class287.method1626((byte) -125);
        class547.method3096(-11399);
        class595.method3332(-1);
        class232.method1351(false);
        class625.method3498(-120);
        class454.method2581((byte) -111);
        class264.method1498(true);
        class549.method3103((byte) -58);
        class53.method268(205);
        class465.method2645((byte) 116);
        class169.method1012(107);
        class304.method1742(0);
        class238.method1373(25);
        class342.method1902(-18178);
        class212.method1272(44);
        class236.method1368(-120);
        class620.method3479((byte) -12);
        class436.method2406(-116);
        class305.method1744(-2394);
        class447.method2474((byte) 89);
        class545.method3089((byte) 8);
        class306.method1748(-124);
        class134.method751(-1);
        class501.method2883(0);
        class223.method1305((byte) -22);
        class2.method9(6628);
        class576.method3257(348370448);
        class179.method1055(22466);
        class149.method819(false);
        class515.method2944(11);
        class190.method1101((byte) 110);
        class437.method2412((byte) 83);
        class90.method567(114);
        class671.method3761((byte) 66);
        class137.method768(4275);
        class23.method107(64);
        class537.method3053(false);
        class647.method3637(9392);
        class482.method2808((byte) 71);
        class295.method1676(116);
        class213.method1273(8);
        class37.method199(-5085);
        class645.method3627((byte) -101);
        class211.method1267(14);
        class463.method2633(123);
        class106.method653(16);
        class122.method722((byte) -107);
        class388.method2123(84);
        class561.method3159((byte) -67);
        class692.method3832((byte) -112);
        class181.method1058(-105);
        class44.method219(-43);
        class104.method626((byte) 94);
        class506.method2914(2);
        class156.method853((byte) -36);
        class351.method1950(0);
        class426.method2297(false);
        class168.method1006(false);
        class410.method2221((byte) 125);
        class525.method2990((byte) 73);
        class589.method3310((byte) 110);
        class316.method1789((byte) 108);
        class637.method3575();
        class97.method604(-6496);
        class581.method3267(false);
        class246.method1422(true);
        class254.method1455(true);
        class683.method3810((byte) 60);
        class354.method1957(true);
        class673.method3774((byte) 125);
        class396.method2160(13589);
        class202.method1235();
        class468.method2650(-31107);
        class566.method3201(true);
        class127.method728(0);
        class263.method1493((byte) -67);
        class612.method3421((byte) -43);
        class364.method2000();
        class259.method1474(-1381);
        class627.method3518((byte) -82);
        class542.method3076((byte) -79);
        class434.method2316();
        class65.method430((byte) -117);
        class136.method764((byte) -92);
        class676.method3779((byte) -126);
        class654.method3696(false);
        class152.method834(43);
        class580.method3266((byte) -121);
        class32.method172((byte) -121);
        class247.method1427(1);
        class344.method1917(16439);
        class139.method775((byte) 119);
        class244.method1416(26211);
        class599.method3350(0);
        class60.method405((byte) 8);
        class172.method1016(false);
        class269.method1517(6681);
        class187.method1085();
        class375.method2062(1375731712);
        class73.method467((byte) 44);
        class387.method2120((byte) 33);
        class112.method697((byte) 127);
        class531.method3031();
        class312.method1766(false);
        class638.method3596(-31180);
        class135.method755((byte) -114);
        class634.method3543(7);
        class472.method2678(3);
        class674.method3776((byte) 117);
        class282.method1612(false);
        class297.method1681();
        class115.method703(24793);
        class383.method2106(21);
        class577.method3263(-57);
        class250.method1440(false);
        class462.method2629(-116);
        class607.method3382((byte) -113);
        class405.method2203((byte) 113);
        class370.method2019(0);
        class450.method2499(-4115);
        class569.method3220(false);
        class613.method3423(-1);
        class85.method537(false);
        class478.method2795(30);
        class631.method3534(114);
        class390.method2133(-23549);
        class183.method1065((byte) 93);
        class301.method1703((byte) 71);
        class639.method3602(false);
        class600.method3355(true);
        class628.method3519(0);
        class261.method1483(68);
        class393.method2145(2);
        class178.method1047(false);
        class132.method739(false);
        class43.method217(21682);
        class252.method1447(false);
        class28.method153(1);
        class477.method2793(-5566);
        class108.method676(85);
        class13.method63((byte) 62);
        class489.method2826(-1);
        class113.method701(0);
        class177.method1036(-90);
        class591.method3317(0);
        class173.method1019(-98);
        class164.method993(262144);
        class539.method3072(1);
        class579.method3265(26925);
        class320.method1795(true);
        class629.method3526((byte) 74);
        class650.method3668(37);
        class406.method2207(false);
        class684.method3813(76);
        class602.method3367((byte) 96);
        class408.method2215((byte) 67);
        class101.method615((byte) 102);
        class677.method3782((byte) -56);
        class120.method713(1783);
        class77.method483((byte) 83);
        class541.method3074(-14199);
        class111.method693(false);
        class414.method2241(false);
        class379.method2078((byte) -75);
        class678.method3791(-125);
        class151.method833(-31);
        class553.method3115(false);
        class526.method2996((byte) -116);
        class141.method783(-13419);
        class551.method3109(-123);
        class359.method1979(-128);
        class509.method2922(123);
        class552.method3111(false);
        class424.method2293(1);
        class469.method2660(-65);
        class657.method3707((byte) 46);
        class371.method2032();
        class349.method1936(256);
        class64.method427(-20790);
        class234.method1359(2);
        class603.method3368(2364);
        class273.method1560(-1);
        class214.method1277(0);
        class68.method445(0);
        class520.method2965((byte) -62);
        class610.method3401(-89);
        class107.method675((byte) 115);
        class345.method1918((byte) -33);
        class567.method3205((byte) -121);
        class337.method1898((byte) 125);
        class210.method1266(3);
        class35.method194((byte) -72);
        class533.method3032(-22121);
        class623.method3489(true);
        class475.method2771(-11342);
        class554.method3123((byte) -123);
        class160.method961();
        class222.method1297(-80);
        class67.method437(1);
        class681.method3805();
        class82.method527();
        class457.method2606(0);
        class54.method270(25);
        class216.method1285();
        class666.method3738(true);
        class203.method1245(0);
        class419.method2266(0);
        class126.method727(-524213725);
        class224.method1315(0);
        class50.method256(2);
        class484.method2812(true);
        class352.method1953((byte) -79);
        class358.method1975((byte) -61);
        class27.method150((byte) -60);
        class425.method2295(-126);
        class215.method1282((byte) -97);
        class514.method2943((byte) -102);
        class583.method3284((byte) 35);
        class182.method1061(116);
        class69.method458((byte) -116);
        class74.method479();
        class39.method205(-13378);
        class594.method3331(true);
        class79.method508((byte) 72);
        class636.method3562(7);
        class663.method3722(97);
        class176.method1031(false);
        class93.method587(false);
        class471.method2673((byte) 22);
        class496.method2858(-6);
        class418.method2263((byte) 116);
        class513.method2934(2);
        class648.method3643((byte) 111);
        class321.method1808(31327);
        class461.method2626(5878);
        class92.method586(-106);
        class170.method1014(9);
        class278.method1584((byte) 96);
        class431.method2306((byte) 38);
        class507.method2915(true);
        class381.method2082(121);
        class88.method549((byte) 49);
        class309.method1760(80);
        class285.method1620(109);
        class397.method2174((byte) 86);
        class435.method2335(true);
        class209.method1259(-1);
        class658.method3711(13784);
        class588.method3302(false);
        class281.method1600(25656);
        class255.method1461(-65);
        class598.method3344(18242);
        class445.method2466(7);
        class680.method3801(-62);
        class162.method974((byte) 72);
        class412.method2237(126);
        class446.method2469(1);
        class633.method3540((byte) 55);
        class385.method2112((byte) 3);
        class245.method1418((byte) 87);
        class146.method801(true);
        class546.method3092((byte) 121);
        class271.method1549(2);
        class667.method3740(-97);
        class651.method3672((byte) -101);
        class274.method1563(22);
        class368.method2017((byte) -66);
        class109.method681((byte) -127);
        class584.method3286(127);
        class81.method521((byte) -115);
        class57.method390(-830098896);
        class80.method510((byte) -82);
        class649.method3649((byte) -9);
        class402.method2190((byte) -98);
        class196.method1139(16);
        class311.method1764(5);
        class150.method823(false);
        class36.method195((byte) -122);
        class362.method1989((byte) -80);
        class240.method1384();
        class682.method3809((byte) -72);
        class329.method1858((byte) 67);
        class585.method3288(4096);
        class334.method1878(-20781);
        class374.method2058(true);
        class685.method3816(-2);
        class24.method113((byte) 79);
        class464.method2643((byte) 49);
        class186.method1083(-126);
        class98.method609(4096);
        class380.method2080((byte) 114);
        class226.method1323((byte) -73);
        class366.method2013(true);
        class257.method1467((byte) 92);
        class548.method3101((byte) 123);
        class205.method1249(-101);
        class369.method2018((byte) 101);
        class384.method2109(2);
        class279.method1590((byte) -123);
        class398.method2181(false);
        class61.method407((byte) 113);
        class644.method3615((byte) 47);
        class485.method2816((byte) -96);
        class423.method2290((byte) -127);
        class403.method2192((byte) 98);
        class521.method2971(92);
        class386.method2115(0);
        class86.method541((byte) -68);
        class253.method1450(88);
        class308.method1755((byte) -98);
        class689.method3824(true);
        class133.method747(105);
        class163.method991(-105);
        class158.method895();
        class422.method2287(false);
        class166.method995((byte) 126);
        class51.method259();
        class624.method3492(122);
        class574.method3243(98);
        class217.method1289(115);
        class416.method2247((byte) -33);
        class679.method3796(true);
        class348.method1929((byte) 73);
        class449.method2496(-100);
        class1.method5(18763);
        class575.method3252(16);
        class555.method3130((byte) 112);
        class630.method3532((byte) -128);
        class491.method2835(0);
        class16.method67(false);
        class9.method45(false);
        class14.method65(-7593);
        class286.method1622(false);
        class272.method1552(true);
        class265.method1505((byte) 73);
        class690.method3829(8);
        class470.method2665((byte) -82);
        class372.method2042(49);
        class587.method3295((byte) 115);
        class451.method2508(-1);
        class288.method1632((byte) -104);
        class347.method1927(0);
        class193.method1107(-5);
        class508.method2919(123);
        class95.method591(-66);
        class233.method1356(-126);
        class421.method2285((byte) 40);
        class52.method262(110);
        class300.method1700(-128);
        class550.method3107(9472);
        class516.method2947((byte) -36);
        class568.method3209(true);
        class58.method391(-122);
        class559.method3156(127);
        class55.method272(-21675);
        class4.method18(0);
        class249.method1432(13199);
        class153.method837(0);
        class535.method3042(-73);
        class459.method2619(3041);
        class490.method2830(0);
        class622.method3486(false);
        class314.method1776(82);
        class505.method2911(-112);
        class5.method21((byte) 107);
        class534.method3040(-128);
        class453.method2578(85);
        class66.method435((byte) -88);
        class353.method1954((byte) 71);
        class229.method1333((byte) 20);
        class99.method610(false);
        class377.method2071(22195);
        class84.method533(-91);
        class256.method1465(127);
        class503.method2893(19601);
        class428.method2303((byte) -23);
        if (arg0 > -78) {
            this.method1545(-29);
        }
        class536.method3045((byte) 15);
        class144.method790(-26383);
        class206.method1252(-2);
        class626.method3509(-27809);
        class400.method2187(117);
        class7.method34(-345670968);
        class284.method1616(10);
        class147.method802((byte) 20);
        class70.method459(-1);
        class498.method2865(100);
        class417.method2260(105);
        class38.method202((byte) -83);
        class655.method3697(-46);
        class46.method222(0);
        class201.method1225(true);
        class571.method3222(0);
        class399.method2186((byte) 74);
        class248.method1431((byte) -126);
        class319.method1793(-90);
        class460.method2624((byte) -88);
        class145.method794(0);
        class220.method1291((byte) 54);
        class17.method70(9382);
        class618.method3473((byte) -86);
        class208.method1257((byte) -89);
        class642.method3608(11);
        class8.method36((byte) -117);
        class427.method2302(16384);
        class230.method1338(true);
        class18.method73((byte) 103);
        class609.method3399((byte) -70);
        class275.method1564(-1);
        class30.method165(7);
        class242.method1401(true);
        class415.method2243(0);
        class522.method2975(false);
        class646.method3629(-31281);
        class606.method3381((byte) -117);
        class19.method78((byte) -79);
        class394.method2152(1);
        class289.method1636(82);
        class200.method1219((byte) 11);
        class11.method58(false);
        class294.method1675(-10);
        class323.method1824(2);
        class511.method2927(5);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 2133)
    public static final void main(String[] arg0) {
        field3417++;
        try {
            if (arg0.length != 6) {
                class330.method1859(0, "Argument count");
            }
            class279.field3530 = new class305();
            class279.field3530.field3986 = Integer.parseInt(arg0[0]);
            class255.field3257 = new class305();
            class255.field3257.field3986 = Integer.parseInt(arg0[1]);
            class152.field1726 = new class305();
            class152.field1726.field3986 = Integer.parseInt(arg0[2]);
            class73.field771 = class137.field1564;
            if (arg0[3].equals("live")) {
                class537.field7715 = class523.field7486;
            } else if (arg0[3].equals("rc")) {
                class537.field7715 = class245.field3170;
            } else if (arg0[3].equals("wip")) {
                class537.field7715 = class414.field5487;
            } else {
                class330.method1859(0, "modewhat");
            }
            class226.field2899 = class184.method1067(arg0[4], 95);
            if (class226.field2899 == -1) {
                if (arg0[4].equals("english")) {
                    class226.field2899 = 0;
                } else if (arg0[4].equals("german")) {
                    class226.field2899 = 1;
                } else {
                    class330.method1859(0, "language");
                }
            }
            class140.field1599 = false;
            class373.field4842 = false;
            if (arg0[5].equals("game0")) {
                class220.field2668 = class393.field5239;
            } else if (arg0[5].equals("game1")) {
                class220.field2668 = class343.field4453;
            } else {
                class330.method1859(0, "game");
            }
            class282.field3593 = true;
            class571.field8101 = true;
            class343.field4443 = null;
            class170.field2046 = false;
            class18.field149 = class220.field2668.field2518;
            class92.field1046 = 0;
            class467.field6478 = false;
            class559.field7965 = 0;
            class222.field2795 = 0L;
            class68.field738 = "";
            class250.field3228 = 0;
            client var1 = new client();
            class239.field3025 = var1;
            var1.method3017(34, 1024, false, class537.field7715.method3314((byte) 8) + 32, 4158, 612, class220.field2668.field2513, 768);
            class77.field796.setLocation(40, 40);
        } catch (Exception var3) {
            class150.method824(15, var3, null);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 2208)
    public static final void method1536() {
        class389.field5191 = 0;
        for (int var0 = 0; var0 < class118.field1356; var0++) {
            class625 var1 = ((class443) class392.field5223.method3234((byte) -84, (long) class664.field9449[var0])).field6107;
            if (var1.field3735 && var1.method1649((byte) 114) != -1) {
                int var2 = (var1.method1656(true) - 1) * 256 + 252;
                int var3 = var1.field4641 - var2 >> 9;
                int var4 = var1.field4647 - var2 >> 9;
                class292 var5 = class111.method691(var4, var1.field4638, (byte) -63, var3);
                if (var5 != null) {
                    int var6 = var5.field3784;
                    if (var5 instanceof class625) {
                        var6 += 2048;
                    }
                    if (var5.field3822 == 0 && var5.method1649((byte) 114) != -1) {
                        class673.field9564[class389.field5191] = var6;
                        class111.field1291[class389.field5191] = var6;
                        class389.field5191++;
                        var5.field3822++;
                    }
                    class673.field9564[class389.field5191] = var6;
                    class111.field1291[class389.field5191] = var1.field3784 + 2048;
                    class389.field5191++;
                    var5.field3822++;
                }
            }
        }
        class641.method3606(class673.field9564, 0, -122, class389.field5191 - 1, class111.field1291);
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 2256)
    private final void method1537(int arg0) {
        field3421++;
        if (class351.field4601 == 7 && class274.field3474 == 0) {
            if (class588.field8361 > 1) {
                class588.field8361--;
                class369.field4790 = class204.field2494;
            }
            if (!class215.field2615) {
                class636.method3559((byte) 105);
            }
            for (int var2 = 0; var2 < 100 && class104.method628(-117); var2++) {
            }
        }
        class233.field2978++;
        class396.method2165(null, -1, 101, -1);
        class313.method1770(-1, 1, null, -1);
        class656.method3705((byte) 59);
        class204.field2494++;
        for (int var3 = 0; var3 < class208.field2528; var3++) {
            class625 var4 = class609.field8605[var3].field6107;
            if (var4 != null) {
                byte var5 = var4.field8855.field258;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method1656(true);
                    if ((var5 & 0x2) != 0 && var4.field3835 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field3839[0] + var7;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if ((class399.field5338 - var6 - 1) < var9) {
                                var9 = class399.field5338 - var6 - 1;
                            }
                            int var10 = var4.field3841[0] + var8;
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (var10 > class349.field4567 - var6 - 1) {
                                var10 = class349.field4567 - var6 - 1;
                            }
                            int var11 = class292.method1662(var6, class7.field57, var10, -1, class475.field6919[var4.field4638], 0, -118, var6, true, var9, class475.field6920, 0, var6, var4.field3841[0], var4.field3839[0]);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field3839[var12] = class7.field57[var11 - var12 - 1];
                                    var4.field3841[var12] = class475.field6920[var11 - var12 - 1];
                                    var4.field3842[var12] = 1;
                                }
                                var4.field3835 = var11;
                            }
                        }
                    }
                    class644.method3614(10024, var4, true);
                    int var13 = class407.method2210(var4, (byte) 59);
                    class146.method798(var4, (byte) -86, class370.field4802, var13, class86.field915);
                    class194.method1111((byte) -87, var4);
                }
            }
        }
        if (class274.field3474 == 0 && class267.field3364 == 0) {
            if (class5.field41 == 2) {
                class559.method3157(false);
            } else {
                class591.method3318((byte) 114);
            }
            if ((class345.field4493 >> 9) < 14 || (class399.field5338 - 14) <= (class345.field4493 >> 9) || class662.field9411 >> 9 < 14 || class349.field4567 - 14 <= class662.field9411 >> 9) {
                class536.method3048(958375780);
            }
        }
        while (true) {
            class676 var14;
            class382 var15;
            class382 var16;
            do {
                var14 = (class676) class549.field7845.method3171(768);
                if (var14 == null) {
                    while (true) {
                        class676 var17;
                        class382 var18;
                        class382 var19;
                        do {
                            var17 = (class676) class357.field4687.method3171(768);
                            if (var17 == null) {
                                while (true) {
                                    class676 var20;
                                    class382 var21;
                                    class382 var22;
                                    do {
                                        var20 = (class676) class522.field7480.method3171(768);
                                        if (var20 == null) {
                                            if (class464.field6446 != null) {
                                                class250.method1436(-96);
                                            }
                                            if (class469.field6549 % 1500 == 0) {
                                                class374.method2057((byte) -75);
                                            }
                                            if (class351.field4601 == 7 && class274.field3474 == 0) {
                                                class233.method1355(false);
                                            }
                                            class334.method1881(-114);
                                            if (class135.field1526 && class641.method3604(false) - 60000L > class214.field2603) {
                                                class321.method1813(913);
                                            }
                                            if (arg0 > -45) {
                                                return;
                                            }
                                            for (class399 var23 = (class399) class127.field1450.method93((byte) 117); var23 != null; var23 = (class399) class127.field1450.method92(0)) {
                                                if ((long) var23.field5337 < class641.method3604(false) / 1000L - 5L) {
                                                    if (var23.field5331 > 0) {
                                                        class321.method1809("", 5, (byte) 122, "", "", 0, var23.field5330 + class221.field2738.method1296(class226.field2899, (byte) -112));
                                                    }
                                                    if (var23.field5331 == 0) {
                                                        class321.method1809("", 5, (byte) 123, "", "", 0, var23.field5330 + class221.field2739.method1296(class226.field2899, (byte) -114));
                                                    }
                                                    var23.method1374((byte) -122);
                                                }
                                            }
                                            if (class351.field4601 == 7 && class274.field3474 == 0) {
                                                if (class170.field2043 == null) {
                                                    class184.method1069(false, false);
                                                    return;
                                                }
                                                class404.field5378++;
                                                if (class404.field5378 > 50) {
                                                    class438.field6095++;
                                                    class480.method2802(class5.field36, 16751);
                                                }
                                                try {
                                                    if (class170.field2043 != null && class334.field4314.field6215 > 0) {
                                                        class35.field401 += class334.field4314.field6215;
                                                        class170.field2043.method1641(-32754, 0, class334.field4314.field6215, class334.field4314.field6209);
                                                        class404.field5378 = 0;
                                                        class334.field4314.field6215 = 0;
                                                        return;
                                                    }
                                                } catch (IOException var24) {
                                                    class184.method1069(false, false);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field9585;
                                        if (var21.field5073 < 0) {
                                            break;
                                        }
                                        var22 = class505.method2903(var21.field5108, 65535);
                                    } while (var22 == null || var22.field4989 == null || var22.field4989.length <= var21.field5073 || var22.field4989[var21.field5073] != var21);
                                    class364.method1998(var20);
                                }
                            }
                            var18 = var17.field9585;
                            if (var18.field5073 < 0) {
                                break;
                            }
                            var19 = class505.method2903(var18.field5108, 65535);
                        } while (var19 == null || var19.field4989 == null || var19.field4989.length <= var18.field5073 || var19.field4989[var18.field5073] != var18);
                        class364.method1998(var17);
                    }
                }
                var15 = var14.field9585;
                if (var15.field5073 < 0) {
                    break;
                }
                var16 = class505.method2903(var15.field5108, 65535);
            } while (var16 == null || var16.field4989 == null || var15.field5073 >= var16.field4989.length || var16.field4989[var15.field5073] != var15);
            class364.method1998(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 2544)
    private final void method1538(int arg0) {
        if (arg0 <= 4) {
            return;
        }
        field3407++;
        boolean var2 = class448.field6156.method2485((byte) -125);
        if (!var2) {
            this.method1540(0);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 2563)
    public static final void method1539() {
        for (int var0 = 0; var0 < class399.field5338; var0++) {
            int[] var1 = class451.field6202[var0];
            for (int var2 = 0; var2 < class349.field4567; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V", line = 2584)
    private final void method1540(int arg0) {
        field3416++;
        if (class327.field4262 < class448.field6156.field6168) {
            class277.field3494.method1746(0);
            class282.field3573 = (class448.field6156.field6168 - 1) * 50 * 5;
            if (class282.field3573 > 3000) {
                class282.field3573 = 3000;
            }
            if (class448.field6156.field6168 >= 2 && class448.field6156.field6170 == 6) {
                this.method3014(arg0 + 5998, "js5connect_outofdate");
                class351.field4601 = 14;
                return;
            }
            if (class448.field6156.field6168 >= 4 && class448.field6156.field6170 == -1) {
                this.method3014(arg0 ^ 0x176E, "js5crc");
                class351.field4601 = 14;
                return;
            }
            if (class448.field6156.field6168 >= 4 && class480.method2805(class351.field4601, 2)) {
                if (class448.field6156.field6170 == 7 || class448.field6156.field6170 == 9) {
                    this.method3014(5998, "js5connect_full");
                } else if (class448.field6156.field6170 <= 0) {
                    this.method3014(arg0 + 5998, "js5io");
                } else {
                    this.method3014(5998, "js5connect");
                }
                class351.field4601 = 14;
                return;
            }
        }
        class327.field4262 = class448.field6156.field6168;
        if (class282.field3573 > 0) {
            class282.field3573--;
            return;
        }
        try {
            if (class453.field6281 == arg0) {
                class106.field1199 = class277.field3494.method1743((byte) -119, class623.field8837);
                class453.field6281++;
            }
            if (class453.field6281 == 1) {
                if (class106.field1199.field2437 == 2) {
                    this.method1528(1000, (byte) -74);
                    return;
                }
                if (class106.field1199.field2437 == 1) {
                    class453.field6281++;
                }
            }
            if (class453.field6281 == 2) {
                class289.field3713 = new class608((Socket) class106.field1199.field2434, class623.field8837);
                class452 var2 = new class452(5);
                var2.method2525(class61.field631.field689, arg0 ^ 0xFFFEC047);
                var2.method2554(612, 255);
                class289.field3713.method3397(var2.field6209, 0, arg0 ^ 0x6, 5);
                class453.field6281++;
                class208.field2530 = class641.method3604(false);
            }
            if (class453.field6281 == 3) {
                if (class480.method2805(class351.field4601, 2) || class289.field3713.method3395((byte) 85) > 0) {
                    int var3 = class289.field3713.method3394((byte) 82);
                    if (var3 != 0) {
                        this.method1528(var3, (byte) 115);
                        return;
                    }
                    class453.field6281++;
                } else if ((class641.method3604(false) - class208.field2530) > 30000L) {
                    this.method1528(1001, (byte) -98);
                    return;
                }
            }
            if (class453.field6281 == 4) {
                boolean var4 = class480.method2805(class351.field4601, 2) || class285.method1619(true, class351.field4601) || class521.method2973(7, class351.field4601);
                class448.field6156.method2490(class289.field3713, !var4, (byte) 86);
                class453.field6281 = 0;
                class106.field1199 = null;
                class289.field3713 = null;
            }
        } catch (IOException var5) {
            this.method1528(1002, (byte) -87);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 2726)
    public static final void method1541() {
        int var0 = class11.field111;
        int[] var1 = class79.field827;
        boolean var2 = class601.field8530.field2842 == 1 && var0 > 200 || class601.field8530.field2842 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class455 var13 = class362.field4726[var1[var3]];
            if (var13.method2592(false)) {
                var13.method1046(-1);
                if (var13.field4642 >= 0 && var13.field4648 >= 0 && var13.field4645 < class399.field5338 && var13.field4639 < class349.field4567) {
                    var13.field6325 = var13.field3779 ? var2 : false;
                    if (class377.field4914 == var13) {
                        var13.field3812 = Integer.MAX_VALUE;
                    } else {
                        int var14 = 0;
                        if (!var13.field3735) {
                            var14++;
                        }
                        if (var13.field3762 > class469.field6549) {
                            var14 += 2;
                        }
                        int var15 = var14 + (5 - var13.method1656(true) << 2);
                        if (var13.field6315) {
                            var15 += 512;
                        } else {
                            if (class653.field9329 == 0) {
                                var15 += 32;
                            } else {
                                var15 += 128;
                            }
                            var15 += 256;
                        }
                        var13.field3812 = var15 + 1;
                    }
                } else {
                    var13.field3812 = -1;
                }
            } else {
                var13.field3812 = -1;
            }
        }
        for (int var4 = 0; var4 < class118.field1356; var4++) {
            class625 var10 = ((class443) class392.field5223.method3234((byte) -116, (long) class664.field9449[var4])).field6107;
            if (var10.method3503(false) && var10.field8855.method104(class491.field7127, -12169)) {
                var10.method1046(-1);
                if (var10.field4642 >= 0 && var10.field4648 >= 0 && var10.field4645 < class399.field5338 && var10.field4639 < class349.field4567) {
                    int var11 = 0;
                    if (!var10.field3735) {
                        var11++;
                    }
                    if (var10.field3762 > class469.field6549) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method1656(true) << 2);
                    if (class653.field9329 == 0) {
                        if (var10.field8855.field270) {
                            var12 += 64;
                        } else {
                            var12 += 128;
                        }
                    } else if (class653.field9329 == 1) {
                        if (var10.field8855.field270) {
                            var12 += 32;
                        } else {
                            var12 += 64;
                        }
                    }
                    if (var10.field8855.field256) {
                        var12 += 1024;
                    } else if (!var10.field8855.field238) {
                        var12 += 256;
                    }
                    var10.field3812 = var12 + 1;
                } else {
                    var10.field3812 = -1;
                }
            } else {
                var10.field3812 = -1;
            }
        }
        for (int var5 = 0; var5 < class81.field863.length; var5++) {
            class492 var6 = class81.field863[var5];
            if (var6 != null) {
                if (var6.field7141 == 1) {
                    class443 var7 = (class443) class392.field5223.method3234((byte) -63, (long) var6.field7134);
                    if (var7 != null) {
                        class625 var8 = var7.field6107;
                        if (var8.field3812 >= 0) {
                            var8.field3812 += 2048;
                        }
                    }
                } else if (var6.field7141 == 10) {
                    class455 var9 = class362.field4726[var6.field7134];
                    if (var9 != null && class377.field4914 != var9 && var9.field3812 >= 0) {
                        var9.field3812 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V", line = 2892)
    private final void method1542(byte arg0) {
        field3415++;
        if (class351.field4601 == 14) {
            return;
        }
        long var2 = class293.method1671(4) / 1000000L - class362.field4725;
        if (arg0 != 110) {
            return;
        }
        class362.field4725 = class293.method1671(arg0 - 106) / 1000000L;
        boolean var4 = class472.method2675(16683);
        if (var4 && class548.field7834 && class32.field358 != null) {
            class32.field358.method719(arg0 ^ 0xFFFFE882);
        }
        if (class376.method2068(class351.field4601, (byte) 98)) {
            if (class120.field1368 != 0L && class120.field1368 < class641.method3604(false)) {
                class472.method2676(class480.method2800(32032), class601.field8530.field2850, arg0 - 110, false, class601.field8530.field2865);
            } else if (!class453.field6284.method338() && class422.field5615) {
                class236.method1366(-89);
            }
        }
        if (class680.field9649 == null) {
            Container var5;
            if (class77.field796 != null) {
                var5 = class77.field796;
            } else if (class485.field7068 == null) {
                var5 = class663.field9432;
            } else {
                var5 = class485.field7068;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class77.field796 == var5) {
                Insets var8 = class77.field796.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class433.field5699 != var6 || class680.field9645 != var7 || class208.field2532) {
                if (class453.field6284 == null || class453.field6284.method323()) {
                    class22.method96(arg0 - 25689);
                } else {
                    class680.field9645 = var7;
                    class433.field5699 = var6;
                }
                class120.field1368 = class641.method3604(false) + 500L;
                class208.field2532 = false;
            }
        }
        if (class680.field9649 != null && !class412.field5476 && class376.method2068(class351.field4601, (byte) 102)) {
            class472.method2676(class601.field8530.field2869, -1, 0, false, -1);
        }
        boolean var9 = false;
        if (class229.field2914) {
            class229.field2914 = false;
            var9 = true;
        }
        if (var9) {
            class280.method1597(false);
        }
        if (class453.field6284 != null && class453.field6284.method338() || class480.method2800(32032) != 1) {
            class14.method66(12287);
        }
        if (class480.method2805(class351.field4601, arg0 - 108)) {
            class496.method2861(var9, (byte) 120);
        } else if (class521.method2974((byte) 121, class351.field4601)) {
            class75.method481(0);
        } else if (class267.method1509(class351.field4601, -21571)) {
            class75.method481(0);
        } else if (class569.method3217((byte) -106, class351.field4601)) {
            if (class421.field5603 == 1) {
                if (class689.field9727 > class73.field759) {
                    class73.field759 = class689.field9727;
                }
                int var10 = (class73.field759 - class689.field9727) * 50 / class73.field759;
                class1.method1(arg0 ^ 0x2, class221.field2684.method1296(class226.field2899, (byte) 90) + "<br>(" + var10 + "%)", true, class404.field5386);
            } else if (class421.field5603 == 2) {
                if (class581.field8255 < class149.field1702) {
                    class581.field8255 = class149.field1702;
                }
                int var11 = (class581.field8255 - class149.field1702) * 50 / class581.field8255 + 50;
                class1.method1(84, class221.field2684.method1296(class226.field2899, (byte) 125) + "<br>(" + var11 + "%)", true, class404.field5386);
            } else {
                class1.method1(77, class221.field2684.method1296(class226.field2899, (byte) 61), true, class404.field5386);
            }
        } else if (class351.field4601 == 10) {
            class684.method3812(false, var2);
        } else if (class351.field4601 == 13) {
            class1.method1(arg0 - 35, class221.field2686.method1296(class226.field2899, (byte) -105) + "<br>" + class221.field2687.method1296(class226.field2899, (byte) -124), true, class404.field5386);
        }
        if (class268.field3380 == 3) {
            for (int var12 = 0; var12 < class675.field9572; var12++) {
                Rectangle var13 = class382.field5060[var12];
                if (class576.field8221[var12]) {
                    class453.field6284.method3552(var13.height, var13.width, 7, -1996553985, var13.y, var13.x);
                } else if (class663.field9429[var12]) {
                    class453.field6284.method3552(var13.height, var13.width, 7, -1996554240, var13.y, var13.x);
                }
            }
        }
        if (class191.method1102(arg0 - 216)) {
            class157.method856(1, class453.field6284);
        }
        if (class623.field8837.field7935 && class376.method2068(class351.field4601, (byte) 119) && class268.field3380 == 0 && class480.method2800(32032) == 1 && !var9) {
            int var16 = 0;
            for (int var17 = 0; var17 < class675.field9572; var17++) {
                if (class663.field9429[var17]) {
                    class663.field9429[var17] = false;
                    class628.field8910[var16++] = class382.field5060[var17];
                }
            }
            try {
                class453.field6284.method285(class628.field8910, var16);
            } catch (class295 var18) {
            }
        } else if (class351.field4601 != 0) {
            for (int var14 = 0; var14 < class675.field9572; var14++) {
                class663.field9429[var14] = false;
            }
            try {
                class453.field6284.method341();
            } catch (class295 var19) {
                class150.method824(15, var19, var19.getMessage() + " (Recovered) " + this.method1531(-1));
                class466.method2646(8000, 0);
            }
        }
        if (class601.field8530.field2857 == 0) {
            class370.method2025(-1, 15L);
        } else if (class601.field8530.field2857 == 1) {
            class370.method2025(-1, 10L);
        } else if (class601.field8530.field2857 == 2) {
            class370.method2025(-1, 5L);
        } else if (class601.field8530.field2857 == 3) {
            class370.method2025(-1, 2L);
        }
        if (class204.field2493) {
            class373.method2051(false);
        }
        if (class601.field8530.field2848 && class351.field4601 == 3 && class397.field5320 != -1) {
            class601.field8530.field2848 = false;
            class601.field8530.method1841(126, class623.field8837);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 3144)
    public final void method1543(int arg0) {
        field3420++;
        if (class170.field2046) {
            class145.field1630 = 64;
        }
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class22.method96(-25579);
        class254.field3247 = new class315(class623.field8837);
        class448.field6156 = new class448();
        if (class73.field771 != class553.field7884) {
            class141.field1608 = new byte[50][];
        }
        class601.field8530 = new class324(class623.field8837);
        int var3 = 85 % ((31 - arg0) / 60);
        if (class73.field771 == class553.field7884) {
            class279.field3530.field3992 = this.getCodeBase().getHost();
        } else if (class500.method2875((byte) 44, class73.field771)) {
            class279.field3530.field3992 = this.getCodeBase().getHost();
            class279.field3530.field3991 = class279.field3530.field3986 + 40000;
            class255.field3257.field3991 = class255.field3257.field3986 + 40000;
            class152.field1726.field3991 = class152.field1726.field3986 + 40000;
            class279.field3530.field3989 = class279.field3530.field3986 + 50000;
            class255.field3257.field3989 = class255.field3257.field3986 + 50000;
            class152.field1726.field3989 = class152.field1726.field3986 + 50000;
        } else if (class73.field771 == class137.field1564) {
            class279.field3530.field3992 = "127.0.0.1";
            class255.field3257.field3992 = "127.0.0.1";
            class152.field1726.field3992 = "127.0.0.1";
            class279.field3530.field3991 = class279.field3530.field3986 + 40000;
            class255.field3257.field3991 = class255.field3257.field3986 + 40000;
            class152.field1726.field3991 = class152.field1726.field3986 + 40000;
            class279.field3530.field3989 = class279.field3530.field3986 + 50000;
            class255.field3257.field3989 = class255.field3257.field3986 + 50000;
            class152.field1726.field3989 = class152.field1726.field3986 + 50000;
        }
        if (class393.field5239 == class220.field2668) {
            class1.field7 = false;
        }
        class233.field2959 = class226.field2898 = class593.field8432 = class349.field4571 = new short[256];
        class277.field3494 = class279.field3530;
        if (class343.field4453 == class220.field2668) {
            class126.field1422 = 16777215;
            class505.field7270 = class150.field1705;
            class509.field7318 = class357.field4685;
            class629.field8943 = 0;
            class602.field8543 = true;
            class13.field116 = class507.field7298;
            class342.field4439 = class460.field6397;
        } else {
            class342.field4439 = class584.field8301;
            class505.field7270 = class521.field7470;
            class509.field7318 = class654.field9348;
            class13.field116 = class551.field7865;
        }
        class653.field9339 = class381.method2086(-11356, class220.field2664);
        class407.field5419 = class678.method3784(class220.field2664, true, 5);
        try {
            if (class623.field8837.field7910 != null) {
                class579.field8243 = new class523(class623.field8837.field7910, 5200, 0);
                for (int var4 = 0; var4 < 34; var4++) {
                    class539.field7756[var4] = new class523(class623.field8837.field7932[var4], 6000, 0);
                }
                class636.field9004 = new class523(class623.field8837.field7913, 6000, 0);
                class603.field8546 = new class59(255, class579.field8243, class636.field9004, 500000);
                class566.field8020 = new class523(class623.field8837.field7925, 24, 0);
                class623.field8837.field7932 = null;
                class623.field8837.field7925 = null;
                class623.field8837.field7910 = null;
                class623.field8837.field7913 = null;
            }
        } catch (IOException var5) {
            class566.field8020 = null;
            class579.field8243 = null;
            class603.field8546 = null;
            class636.field9004 = null;
        }
        if (class73.field771 != class553.field7884) {
            class75.field787 = true;
        }
        if (class393.field5239 == class220.field2668) {
            class537.field7671 = class221.field2671.method1296(class226.field2899, (byte) -86);
        } else if (class343.field4453 == class220.field2668) {
            class537.field7671 = class221.field2673.method1296(class226.field2899, (byte) 75);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V", line = 3267)
    public final void method1544(byte arg0) {
        if (arg0 != -72) {
            field3414 = 98;
        }
        field3418++;
        if (class150.field1711 != 2) {
            this.method1529(-81);
            return;
        }
        try {
            this.method1529(-114);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class150.method824(arg0 ^ 0xFFFFFFB7, var5, var5.getMessage() + " (Recovered) " + this.method1531(-1));
            class466.method2646(8000, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 3291)
    public final void method1545(int arg0) {
        field3411++;
        if (class150.field1711 != arg0) {
            this.method1542((byte) 110);
            return;
        }
        try {
            this.method1542((byte) 110);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class150.method824(15, var5, var5.getMessage() + " (Recovered) " + this.method1531(arg0 ^ 0xFFFFFFFD));
            class466.method2646(8000, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V", line = 3312)
    public static void method1546(int arg0) {
        if (arg0 != 9) {
            method1525(null);
        }
        field3410 = null;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 3329)
    public static final void method1547() {
        int var0 = class11.field111;
        int[] var1 = class79.field827;
        int var2 = class15.field140 ? var0 : class118.field1356 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class292 var4;
            if (var3 < var0) {
                var4 = class362.field4726[var1[var3]];
            } else {
                var4 = ((class443) class392.field5223.method3234((byte) -95, (long) class664.field9449[var3 - var0])).field6107;
            }
            if (var4.field3812 >= 0) {
                int var5 = var4.method1656(true);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field4641 & 0x1FF) == 0 && (var4.field4647 & 0x1FF) == 0) {
                        continue;
                    }
                } else if ((var4.field4641 & 0x1FF) == 256 && (var4.field4647 & 0x1FF) == 256) {
                    continue;
                }
                if (var4 instanceof class455 && var4.field3834 != null && class469.field6549 >= var4.field3834.field7412 && class469.field6549 < var4.field3834.field7411) {
                    ((class455) var4).field6325 = false;
                }
                var4.field4646 = class363.method1995(var4.field4638, var4.field4647, -1327568407, var4.field4641);
                class223.method1309(var4, true);
            }
        }
    }
}
