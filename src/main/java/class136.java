import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class136 {

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public int field3087 = 0;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    public int field3095 = 0;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "[I")
    public static int[] field3080 = new int[2048];

    @OriginalMember(owner = "client!td", name = "d", descriptor = "[Z")
    public static boolean[] field3083 = new boolean[8];

    @OriginalMember(owner = "client!td", name = "o", descriptor = "Lv;")
    public static class146 field3094 = class159.method1226((byte) -37, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    public static int field3090 = 0;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "[[S")
    public static short[][] field3082 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!td", name = "r", descriptor = "Lv;")
    public static class146 field3097 = class159.method1226((byte) -37, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!td", name = "t", descriptor = "I")
    private static int field3099 = 2;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public int field3081;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public int field3086;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public int field3088;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!td", name = "u", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "I")
    public int field3101;

    @OriginalMember(owner = "client!td", name = "w", descriptor = "I")
    public int field3102;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "Lfc;")
    public static class39 field3085;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "Ljd;")
    public class66 field3089;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "Ljd;")
    public class66 field3091;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
    public static final void method1009(int arg0) {
        if (class6.field150 != null) {
            class98 var1 = class6.field150;
            synchronized (class6.field150) {
                class6.field150 = null;
            }
        }
        field3096++;
        if (arg0 < 1) {
            method1012(-46, 8, 90, -102, 2);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lla;Lla;I)I")
    public static final int method1010(class77 arg0, class77 arg1, int arg2) {
        field3103++;
        int var3 = 0;
        if (arg1.method588(21014, class52.field1181, class134.field3064)) {
            var3++;
        }
        if (arg0.method588(21014, class150.field3470, class134.field3064)) {
            var3++;
        }
        if (arg0.method588(21014, class155.field3535, class134.field3064)) {
            var3++;
        }
        if (arg0.method588(21014, class1.field13, class134.field3064)) {
            var3++;
        }
        if (arg0.method588(21014, class8.field152, class134.field3064)) {
            var3++;
        }
        if (arg0.method588(21014, class75.field1802, class134.field3064)) {
            var3++;
        }
        arg0.method588(21014, class142.field3244, class134.field3064);
        if (arg2 < 104) {
            method1009(-5);
        }
        arg0.method588(21014, class15.field250, class134.field3064);
        arg0.method588(21014, class125.field2907, class134.field3064);
        arg0.method588(21014, class150.field3476, class134.field3064);
        arg0.method588(21014, class48.field1108, class134.field3064);
        return var3;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
    public static final void method1011(int arg0) {
        if (class38.field863 > 1) {
            class38.field863--;
        }
        field3084++;
        if (class47.field1080 > 0) {
            class47.field1080--;
        }
        if (class29.field600) {
            class29.field600 = false;
            class111.method873((byte) 52);
            return;
        }
        for (int var1 = 0; var1 < 100 && class38.method256(-13759); var1++) {
        }
        if (class47.field1071 != 30) {
            return;
        }
        class110.method871(56, (byte) 81, class82.field1990);
        Object var2 = class111.field2630.field605;
        synchronized (class111.field2630.field605) {
            if (!class33.field691) {
                class111.field2630.field615 = 0;
            } else if (class46.field1065 != 0 || class111.field2630.field615 >= 40) {
                class157.field3619++;
                class82.field1990.method265((byte) -85, 133);
                class82.field1990.method791(false, 0);
                int var3 = class82.field1990.field2304;
                int var4 = 0;
                for (int var5 = 0; class111.field2630.field615 > var5 && class82.field1990.field2304 - var3 < 240; var5++) {
                    var4++;
                    int var6 = class111.field2630.field614[var5];
                    int var7 = class111.field2630.field616[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 764) {
                        var6 = 764;
                    }
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 502) {
                        var7 = 502;
                    }
                    int var8 = var7 * 765 + var6;
                    if (class111.field2630.field616[var5] == -1 && class111.field2630.field614[var5] == -1) {
                        var8 = 524287;
                        var7 = -1;
                        var6 = -1;
                    }
                    if (class94.field2230 != var6 || class47.field1090 != var7) {
                        int var9 = var6 - class94.field2230;
                        class94.field2230 = var6;
                        int var10 = var7 - class47.field1090;
                        class47.field1090 = var7;
                        if (class83.field2014 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class82.field1990.method766((class83.field2014 << 12) + (var9 << 6) + var10, (byte) 117);
                            class83.field2014 = 0;
                        } else if (class83.field2014 < 8) {
                            class82.field1990.method768((byte) -113, (class83.field2014 << 19) + var8 + 8388608);
                            class83.field2014 = 0;
                        } else {
                            class82.field1990.method788((class83.field2014 << 19) + var8 - 1073741824, -730641264);
                            class83.field2014 = 0;
                        }
                    } else if (class83.field2014 < 2047) {
                        class83.field2014++;
                    }
                }
                class82.field1990.method749(class82.field1990.field2304 - var3, (byte) 98);
                if (var4 < class111.field2630.field615) {
                    class111.field2630.field615 -= var4;
                    for (int var11 = 0; var11 < class111.field2630.field615; var11++) {
                        class111.field2630.field614[var11] = class111.field2630.field614[var11 + var4];
                        class111.field2630.field616[var11] = class111.field2630.field616[var4 + var11];
                    }
                } else {
                    class111.field2630.field615 = 0;
                }
            }
        }
        if (class46.field1065 != 0) {
            class92.field2216++;
            long var12 = (class44.field1000 - class120.field2783) / 50L;
            int var14 = class25.field401;
            class120.field2783 = class44.field1000;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 502) {
                var14 = 502;
            }
            if (var12 > 4095L) {
                var12 = 4095L;
            }
            int var15 = class90.field2150;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 764) {
                var15 = 764;
            }
            byte var16 = 0;
            int var17 = var14 * 765 + var15;
            int var18 = (int) var12;
            if (class46.field1065 == 2) {
                var16 = 1;
            }
            class82.field1990.method265((byte) -85, 106);
            class82.field1990.method788((var16 << 19) + (var18 << 20) + var17, arg0 + -730641264);
        }
        if (class51.field1150[96] || class51.field1150[97] || class51.field1150[98] || class51.field1150[99]) {
            class24.field388 = true;
        }
        if (class32.field671 > 0) {
            class32.field671--;
        }
        if (class24.field388 && class32.field671 <= 0) {
            class118.field2749++;
            class24.field388 = false;
            class32.field671 = 20;
            class82.field1990.method265((byte) -85, 12);
            class82.field1990.method794(arg0 ^ 0x9407CC08, class72.field1692);
            class82.field1990.method794(arg0 ^ 0x9407CC08, class5.field103);
        }
        if (class71.field1649 && !client.field354) {
            client.field354 = true;
            class82.field1990.method265((byte) -85, 36);
            class82.field1990.method791(false, 1);
            class113.field2655++;
        }
        if (!class71.field1649 && client.field354) {
            client.field354 = false;
            class82.field1990.method265((byte) -85, 36);
            class113.field2655++;
            class82.field1990.method791(false, 0);
        }
        class5.method34((byte) 30);
        if (class47.field1071 != 30) {
            return;
        }
        class59.method404(~arg0);
        class51.method346((byte) 82);
        class79.field1951++;
        if (class79.field1951 > 750) {
            class111.method873((byte) 41);
            return;
        }
        class35.method234(0);
        class32.method216(arg0 + 93);
        class70.method505(0);
        if (class141.field3221 != 0) {
            class72.field1688 += 20;
            if (class72.field1688 >= 400) {
                class141.field3221 = 0;
            }
        }
        class1.field16++;
        if (class147.field3405 != null) {
            class3.field83++;
            if (class3.field83 >= 15) {
                class75.method567((byte) 119, class147.field3405);
                class147.field3405 = null;
            }
        }
        if (class28.field594 != null) {
            class75.method567((byte) 113, class28.field594);
            if (class2.field45 > class51.field1155 + 5 || class2.field45 < class51.field1155 - 5 || class151.field3491 > class134.field3065 + 5 || class151.field3491 < class134.field3065 - 5) {
                class90.field2135 = true;
            }
            class44.field984++;
            if (class146.field3386 == 0) {
                if (class90.field2135 && class44.field984 >= 5) {
                    if (class28.field594 == class157.field3617 && class126.field2917 != class113.field2646) {
                        class67.field1522++;
                        byte var19 = 0;
                        class26 var20 = class28.field594;
                        if (class125.field2903 == 1 && var20.field442 == 206) {
                            var19 = 1;
                        }
                        if (var20.field519[class126.field2917] <= 0) {
                            var19 = 0;
                        }
                        if (class64.method461(class42.method281(var20, 1299495520), false)) {
                            int var21 = class113.field2646;
                            int var22 = class126.field2917;
                            var20.field519[var22] = var20.field519[var21];
                            var20.field440[var22] = var20.field440[var21];
                            var20.field519[var21] = -1;
                            var20.field440[var21] = 0;
                        } else if (var19 == 1) {
                            int var23 = class113.field2646;
                            int var24 = class126.field2917;
                            while (var23 != var24) {
                                if (var24 < var23) {
                                    var20.method168(var23, 0, var23 - 1);
                                    var23--;
                                } else if (var23 < var24) {
                                    var20.method168(var23, arg0, var23 + 1);
                                    var23++;
                                }
                            }
                        } else {
                            var20.method168(class113.field2646, arg0, class126.field2917);
                        }
                        class82.field1990.method265((byte) -85, 120);
                        class82.field1990.method783(var19, false);
                        class82.field1990.method794(-1811428344, class126.field2917);
                        class82.field1990.method756(class113.field2646, false);
                        class82.field1990.method781(class28.field594.field547, false);
                    }
                } else if ((class9.field178 == 1 || class5.method46(class13.field208 - 1, (byte) -110)) && class13.field208 > 2) {
                    class125.method937(765);
                } else if (class13.field208 > 0) {
                    class154.method1158((byte) -101, class13.field208 - 1);
                }
                class3.field83 = 10;
                class46.field1065 = 0;
                class28.field594 = null;
            }
        }
        class47.field1092 = 0;
        class103.field2513 = false;
        class52.field1204 = false;
        class92.field2207 = null;
        class26 var25 = class48.field1110;
        class26 var26 = class77.field1873;
        class48.field1110 = null;
        class77.field1873 = null;
        while (class54.method361(-124) && class47.field1092 < 128) {
            class146.field3338[class47.field1092] = class33.field711;
            class49.field1127[class47.field1092] = class94.field2236;
            class47.field1092++;
        }
        class28.method196(0, 0, 765, class6.field136, arg0, 503, 0, -83);
        class44.field1016++;
        while (true) {
            class120 var27;
            class26 var28;
            class26 var29;
            do {
                var27 = (class120) class87.field2057.method1141(2);
                if (var27 == null) {
                    while (true) {
                        class120 var30;
                        class26 var31;
                        class26 var32;
                        do {
                            var30 = (class120) class143.field3258.method1141(2);
                            if (var30 == null) {
                                while (true) {
                                    class120 var33;
                                    class26 var34;
                                    class26 var35;
                                    do {
                                        var33 = (class120) class117.field2722.method1141(2);
                                        if (var33 == null) {
                                            if (client.field340 != null) {
                                                class157.method1218(38);
                                            }
                                            if (class156.field3582 != -1) {
                                                int var36 = class156.field3582;
                                                int var37 = class156.field3550;
                                                boolean var38 = class81.method617(0, 0, var36, 1, 0, 0, true, var37, 0, class116.field2696.field788[0], 0, class116.field2696.field738[0]);
                                                if (var38) {
                                                    class72.field1687 = class25.field401;
                                                    class13.field205 = class90.field2150;
                                                    class141.field3221 = 1;
                                                    class72.field1688 = 0;
                                                }
                                                class156.field3582 = -1;
                                            }
                                            class12.method69((byte) 87);
                                            if (class48.field1110 != var25) {
                                                if (var25 != null) {
                                                    class75.method567((byte) 123, var25);
                                                }
                                                if (class48.field1110 != null) {
                                                    class75.method567((byte) 113, class48.field1110);
                                                }
                                            }
                                            if (class77.field1873 != var26 && class47.field1085 == class143.field3276) {
                                                if (var26 != null) {
                                                    class75.method567((byte) 120, var26);
                                                }
                                                if (class77.field1873 != null) {
                                                    class75.method567((byte) 112, class77.field1873);
                                                }
                                            }
                                            if (class77.field1873 == null) {
                                                if (class143.field3276 > 0) {
                                                    class143.field3276--;
                                                }
                                            } else if (class47.field1085 > class143.field3276) {
                                                class143.field3276++;
                                                if (class47.field1085 == class143.field3276) {
                                                    class75.method567((byte) 121, class77.field1873);
                                                }
                                            }
                                            class34.method225(false);
                                            if (class150.field3477) {
                                                class107.method862(2047);
                                            }
                                            for (int var39 = 0; var39 < 5; var39++) {
                                                int var10002 = class15.field243[var39]++;
                                            }
                                            int var40 = class2.method6(28379);
                                            int var41 = class134.method1002(107);
                                            if (var40 > 4500 && var41 > 4500) {
                                                class47.field1080 = 250;
                                                class8.method58(true, 4000);
                                                class34.field720++;
                                                class82.field1990.method265((byte) -85, 146);
                                            }
                                            class75.field1783++;
                                            if (class75.field1783 > 500) {
                                                class75.field1783 = 0;
                                                int var42 = (int) (Math.random() * 8.0D);
                                                if ((var42 & 0x1) == 1) {
                                                    class33.field692 += class28.field590;
                                                }
                                                if ((var42 & 0x4) == 4) {
                                                    class101.field2448 += class126.field2926;
                                                }
                                                if ((var42 & 0x2) == 2) {
                                                    class54.field1232 += class81.field1975;
                                                }
                                            }
                                            if (class33.field692 < -50) {
                                                class28.field590 = 2;
                                            }
                                            if (class101.field2448 < -40) {
                                                class126.field2926 = 1;
                                            }
                                            if (class33.field692 > 50) {
                                                class28.field590 = -2;
                                            }
                                            if (class54.field1232 < -55) {
                                                class81.field1975 = 2;
                                            }
                                            if (class101.field2448 > 40) {
                                                class126.field2926 = -1;
                                            }
                                            if (class54.field1232 > 55) {
                                                class81.field1975 = -2;
                                            }
                                            class103.field2509++;
                                            class9.field177++;
                                            if (class103.field2509 > 500) {
                                                int var43 = (int) (Math.random() * 8.0D);
                                                if ((var43 & 0x1) == 1) {
                                                    class18.field296 += field3099;
                                                }
                                                if ((var43 & 0x2) == 2) {
                                                    class32.field667 += class111.field2615;
                                                }
                                                class103.field2509 = 0;
                                            }
                                            if (class32.field667 < -20) {
                                                class111.field2615 = 1;
                                            }
                                            if (class32.field667 > 10) {
                                                class111.field2615 = -1;
                                            }
                                            if (class18.field296 < -60) {
                                                field3099 = 2;
                                            }
                                            if (class18.field296 > 60) {
                                                field3099 = -2;
                                            }
                                            if (class9.field177 > 50) {
                                                class33.field705++;
                                                class82.field1990.method265((byte) -85, 25);
                                            }
                                            try {
                                                if (class58.field1298 != null && class82.field1990.field2304 > 0) {
                                                    class58.field1298.method1078(0, 1, class82.field1990.field2304, class82.field1990.field2320);
                                                    class82.field1990.field2304 = 0;
                                                    class9.field177 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var44) {
                                                class111.method873((byte) 33);
                                                return;
                                            }
                                        }
                                        var34 = var33.field2787;
                                        if (var34.field461 < 0) {
                                            break;
                                        }
                                        var35 = class64.method466(arg0 - 1922515024, var34.field498);
                                    } while (var35 == null || var35.field562 == null || var34.field461 >= var35.field562.length || var35.field562[var34.field461] != var34);
                                    class25.method157(var33, 5);
                                }
                            }
                            var31 = var30.field2787;
                            if (var31.field461 < 0) {
                                break;
                            }
                            var32 = class64.method466(-1922515024, var31.field498);
                        } while (var32 == null || var32.field562 == null || var31.field461 >= var32.field562.length || var32.field562[var31.field461] != var31);
                        class25.method157(var30, 5);
                    }
                }
                var28 = var27.field2787;
                if (var28.field461 < 0) {
                    break;
                }
                var29 = class64.method466(-1922515024, var28.field498);
            } while (var29 == null || var29.field562 == null || var28.field461 >= var29.field562.length || var29.field562[var28.field461] != var28);
            class25.method157(var27, 5);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIII)V")
    public static final void method1012(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3092++;
        if (class47.field1087 == 0 && !class22.field367) {
            class95.method742(255, 9, 0, arg0 - arg4, arg3 - arg2, class20.field308, class158.field3633);
            class127.field2928++;
        }
        int var5 = -1;
        int var6 = 0;
        if (arg1 <= 118) {
            return;
        }
        while (var6 < class139.field3176) {
            int var7 = class139.field3192[var6];
            int var8 = var7 >> 7 & 0x7F;
            int var9 = var7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                label274: {
                    var5 = var7;
                    if (var10 == 2 && class66.field1496.method1196(class148.field3428, var9, var8, var7) >= 0) {
                        class69 var12 = class124.method928(-1, var11);
                        if (var12.field1598 != null) {
                            var12 = var12.method486(105);
                        }
                        if (var12 == null) {
                            break label274;
                        }
                        if (class47.field1087 == 1) {
                            class121.field2812++;
                            class95.method742(255, 15, var7, var8, var9, class88.field2091, class71.method509(new class146[] { class59.field1359, class157.field3624, var12.field1595 }, (byte) -88));
                        } else if (!class22.field367) {
                            class146[] var13 = var12.field1583;
                            if (class67.field1528) {
                                var13 = class75.method563((byte) -116, var13);
                            }
                            if (var13 != null) {
                                for (int var14 = 4; var14 >= 0; var14--) {
                                    if (var13[var14] != null) {
                                        short var15 = 0;
                                        if (var14 == 0) {
                                            var15 = 8;
                                        }
                                        class63.field1420++;
                                        if (var14 == 1) {
                                            var15 = 4;
                                        }
                                        if (var14 == 2) {
                                            var15 = 38;
                                        }
                                        if (var14 == 3) {
                                            var15 = 30;
                                        }
                                        if (var14 == 4) {
                                            var15 = 1001;
                                        }
                                        class95.method742(255, var15, var7, var8, var9, var13[var14], class71.method509(new class146[] { class145.field3305, var12.field1595 }, (byte) 111));
                                    }
                                }
                            }
                            class95.method742(255, 1006, var12.field1624 << 14, var8, var9, class155.field3536, class71.method509(new class146[] { class145.field3305, var12.field1595 }, (byte) -86));
                            class17.field258++;
                        } else if ((class142.field3241 & 0x4) == 4) {
                            class67.field1539++;
                            class95.method742(255, 42, var7, var8, var9, class122.field2850, class71.method509(new class146[] { class140.field3206, class157.field3624, var12.field1595 }, (byte) 76));
                        }
                    }
                    if (var10 == 1) {
                        class38 var16 = class34.field735[var11];
                        if (var16.field849.field1922 == 1 && (var16.field757 & 0x7F) == 64 && (var16.field790 & 0x7F) == 64) {
                            for (int var17 = 0; var17 < class91.field2171; var17++) {
                                class38 var20 = class34.field735[class57.field1271[var17]];
                                if (var20 != null && var16 != var20 && var20.field849.field1922 == 1 && var16.field757 == var20.field757 && var16.field790 == var20.field790) {
                                    class126.method938(class57.field1271[var17], var20.field849, 10, var8, var9);
                                }
                            }
                            for (int var18 = 0; var18 < class126.field2925; var18++) {
                                class67 var19 = class125.field2902[field3080[var18]];
                                if (var19 != null && var16.field757 == var19.field757 && var16.field790 == var19.field790) {
                                    class159.method1225(var9, var8, field3080[var18], var19, (byte) -56);
                                }
                            }
                        }
                        class126.method938(var11, var16.field849, 10, var8, var9);
                    }
                    if (var10 == 0) {
                        class67 var21 = class125.field2902[var11];
                        if ((var21.field757 & 0x7F) == 64 && (var21.field790 & 0x7F) == 64) {
                            for (int var22 = 0; var22 < class91.field2171; var22++) {
                                class38 var25 = class34.field735[class57.field1271[var22]];
                                if (var25 != null && var25.field849.field1922 == 1 && var21.field757 == var25.field757 && var21.field790 == var25.field790) {
                                    class126.method938(class57.field1271[var22], var25.field849, 10, var8, var9);
                                }
                            }
                            for (int var23 = 0; var23 < class126.field2925; var23++) {
                                class67 var24 = class125.field2902[field3080[var23]];
                                if (var24 != null && var21 != var24 && var21.field757 == var24.field757 && var21.field790 == var24.field790) {
                                    class159.method1225(var9, var8, field3080[var23], var24, (byte) -56);
                                }
                            }
                        }
                        class159.method1225(var9, var8, var11, var21, (byte) -56);
                    }
                    if (var10 == 3) {
                        class152 var26 = class148.field3434[class148.field3428][var9][var8];
                        if (var26 != null) {
                            for (class54 var27 = (class54) var26.method1146(19); var27 != null; var27 = (class54) var26.method1149(-74)) {
                                class59 var28 = class73.method524((byte) 110, var27.field1248);
                                if (class47.field1087 == 1) {
                                    class95.method742(255, 39, var27.field1248, var8, var9, class88.field2091, class71.method509(new class146[] { class59.field1359, class121.field2805, var28.field1338 }, (byte) -82));
                                    class103.field2506++;
                                } else if (!class22.field367) {
                                    class33.field694++;
                                    class146[] var29 = var28.field1372;
                                    if (class67.field1528) {
                                        var29 = class75.method563((byte) -116, var29);
                                    }
                                    for (int var30 = 4; var30 >= 0; var30--) {
                                        if (var29 != null && var29[var30] != null) {
                                            class90.field2154++;
                                            byte var31 = 0;
                                            if (var30 == 0) {
                                                var31 = 49;
                                            }
                                            if (var30 == 1) {
                                                var31 = 24;
                                            }
                                            if (var30 == 2) {
                                                var31 = 18;
                                            }
                                            if (var30 == 3) {
                                                var31 = 12;
                                            }
                                            if (var30 == 4) {
                                                var31 = 22;
                                            }
                                            class95.method742(255, var31, var27.field1248, var8, var9, var29[var30], class71.method509(new class146[] { class66.field1486, var28.field1338 }, (byte) -113));
                                        } else if (var30 == 2) {
                                            class31.field640++;
                                            class95.method742(255, 18, var27.field1248, var8, var9, class42.field950, class71.method509(new class146[] { class66.field1486, var28.field1338 }, (byte) 90));
                                        }
                                    }
                                    class95.method742(255, 1007, var27.field1248, var8, var9, class155.field3536, class71.method509(new class146[] { class66.field1486, var28.field1338 }, (byte) -117));
                                } else if ((class142.field3241 & 0x1) == 1) {
                                    class76.field1808++;
                                    class95.method742(255, 45, var27.field1248, var8, var9, class122.field2850, class71.method509(new class146[] { class140.field3206, class121.field2805, var28.field1338 }, (byte) 123));
                                }
                            }
                        }
                    }
                }
            }
            var6++;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ldd;II)Lv;")
    public static final class146 method1013(class26 arg0, int arg1, int arg2) {
        field3100++;
        if (arg2 != -2321) {
            return null;
        } else if (!class124.method930(arg1, class42.method281(arg0, arg2 + 1299497841), (byte) 126) && arg0.field559 == null) {
            return null;
        } else if (arg0.field480 == null || arg0.field480.length <= arg1 || arg0.field480[arg1] == null || arg0.field480[arg1].method1112((byte) -97).method1080(-1) == 0) {
            return class119.field2767 ? class71.method509(new class146[] { class90.field2167, class75.method564(false, arg1) }, (byte) 82) : null;
        } else {
            return arg0.field480[arg1];
        }
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V")
    public static void method1014(int arg0) {
        field3097 = null;
        field3094 = null;
        field3083 = null;
        if (arg0 != 1) {
            field3085 = null;
        }
        field3085 = null;
        field3082 = null;
        field3080 = null;
    }
}
