import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class39 {

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "[I")
    public static int[] field4853 = new int[99];

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "[Ljl;")
    public static class56[] field4852 = new class56[8];

    @OriginalMember(owner = "client!client", name = "U", descriptor = "[[S")
    private static short[][] field4845 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "Lag;")
    public static class211 field4857 = null;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "[[Z")
    public static boolean[][] field4858;

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class238.method1608(false, "argument count");
            }
            class148.field2317 = Integer.parseInt(arg0[0]);
            class225.field3652 = 2;
            if (arg0[1].equals("live")) {
                class130.field2044 = 0;
            } else if (arg0[1].equals("rc")) {
                class130.field2044 = 1;
            } else if (arg0[1].equals("wip")) {
                class130.field2044 = 2;
            } else {
                class238.method1608(false, "modewhat");
            }
            class266.field4275 = false;
            class2.field28 = class9.method45(arg0[2], 119);
            if (class2.field28 == -1) {
                if (arg0[2].equals("english")) {
                    class2.field28 = 0;
                } else if (arg0[2].equals("german")) {
                    class2.field28 = 1;
                } else {
                    class238.method1608(false, "language");
                }
            }
            class234.method1583(11680, class2.field28);
            class281.field4493 = false;
            class211.field3504 = false;
            if (arg0[3].equals("game0")) {
                class299.field4792 = 0;
            } else if (arg0[3].equals("game1")) {
                class299.field4792 = 1;
            } else {
                class238.method1608(false, "game");
            }
            class211.field3503 = 0;
            class240.field3837 = false;
            class1.field17 = 0;
            class160.field2545 = "";
            client var1 = new client();
            class59.field973 = var1;
            var1.method256(768, 1024, (byte) -112, false, 552, class130.field2044 + 32, class299.field4792 == 1 ? "mechscape" : "runescape", 29);
            class92.field1494.setLocation(40, 40);
        } catch (Exception var3) {
            class19.method94(-105, var3, (String) null);
        }
        field4856++;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    private final void method2014(byte arg0) {
        field4859++;
        if (class306.field4884 < class90.field1472.field1058) {
            class92.field1488 = (class90.field1472.field1058 - 1) * 250;
            if (class32.field483 == class245.field3903) {
                class245.field3903 = class52.field870;
            } else {
                class245.field3903 = class32.field483;
            }
            if (class92.field1488 > 3000) {
                class92.field1488 = 3000;
            }
            if (class90.field1472.field1058 >= 2 && class90.field1472.field1060 == 6) {
                this.method253(64, "js5connect_outofdate");
                class153.field2385 = 1000;
                return;
            }
            if (class90.field1472.field1058 >= 4 && class90.field1472.field1060 == -1) {
                this.method253(64, "js5crc");
                class153.field2385 = 1000;
                return;
            }
            if (class90.field1472.field1058 >= 4 && (class153.field2385 == 0 || class153.field2385 == 5)) {
                if (class90.field1472.field1060 == 7 || class90.field1472.field1060 == 9) {
                    this.method253(64, "js5connect_full");
                } else if (class90.field1472.field1060 > 0) {
                    this.method253(64, "js5connect");
                } else {
                    this.method253(64, "js5io");
                }
                class153.field2385 = 1000;
                return;
            }
        }
        class306.field4884 = class90.field1472.field1058;
        if (arg0 != -7) {
            this.method257(112);
        }
        if (class92.field1488 > 0) {
            class92.field1488--;
            return;
        }
        try {
            if (class277.field4454 == 0) {
                class256.field4150 = class268.field4323.method326(true, class145.field2289, class245.field3903);
                class277.field4454++;
            }
            if (class277.field4454 == 1) {
                if (class256.field4150.field2814 == 2) {
                    this.method2025(1000, 6);
                    return;
                }
                if (class256.field4150.field2814 == 1) {
                    class277.field4454++;
                }
            }
            if (class277.field4454 == 2) {
                class10.field106 = new class139((Socket) class256.field4150.field2817, class268.field4323);
                class162 var2 = new class162(5);
                var2.method1108(15, true);
                var2.method1125(552, 255);
                class10.field106.method977(var2.field2573, 5, 0, -27241);
                class277.field4454++;
                class229.field3708 = class191.method1350((byte) -46);
            }
            if (class277.field4454 == 3) {
                if (class153.field2385 == 0 || class153.field2385 == 5 || class10.field106.method972(0) > 0) {
                    int var3 = class10.field106.method978(-98);
                    if (var3 != 0) {
                        this.method2025(var3, 6);
                        return;
                    }
                    class277.field4454++;
                } else if ((class191.method1350((byte) -80) - class229.field3708) > 30000L) {
                    this.method2025(1001, 6);
                    return;
                }
            }
            if (class277.field4454 == 4) {
                boolean var4 = class153.field2385 == 5 || class153.field2385 == 10 || class153.field2385 == 28;
                class90.field1472.method430(25433, class10.field106, !var4);
                class10.field106 = null;
                class256.field4150 = null;
                class277.field4454 = 0;
            }
        } catch (IOException var5) {
            this.method2025(1002, arg0 + 13);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lag;)Lue;")
    public static final class223 method2015(class211 arg0) {
        class223 var1 = (class223) class143.field2269.method1059(0, ((long) arg0.field3375 << 32) + (long) arg0.field3413);
        return var1 == null ? arg0.field3422 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lag;IIIIIII)V")
    public static final void method2016(class211[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class211 var9 = arg0[var8];
            if (var9 != null && var9.field3395 == arg1 && (!var9.field3337 || var9.field3385 == 0 || var9.field3329 || method2015(var9).field3629 != 0 || class277.field4446 == var9 || var9.field3446 == 1338) && (!var9.field3337 || !method2017(var9))) {
                int var10 = var9.field3453 + arg6;
                int var11 = var9.field3416 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field3385 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field3430 + var10;
                    int var17 = var9.field3394 + var11;
                    if (var9.field3385 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (field4857 == var9) {
                    class2.field34 = true;
                    class59.field970 = var10;
                    class265.field4271 = var11;
                }
                if (!var9.field3337 || var12 < var14 && var13 < var15) {
                    if (var9.field3385 == 0) {
                        if (!var9.field3337 && method2017(var9) && class161.field2559 != var9) {
                            continue;
                        }
                        if (var9.field3327 && class269.field4344 >= var12 && class77.field1281 >= var13 && class269.field4344 < var14 && class77.field1281 < var15) {
                            for (class126 var18 = (class126) class288.field4611.method1643((byte) -46); var18 != null; var18 = (class126) class288.field4611.method1642((byte) 124)) {
                                if (var18.field1997) {
                                    var18.method913(-3542);
                                    var18.field2000.field3469 = false;
                                }
                            }
                            if (class280.field4484 == 0) {
                                field4857 = null;
                                class277.field4446 = null;
                            }
                            class143.field2270 = 0;
                            class269.field4345 = false;
                        }
                    }
                    if (var9.field3337) {
                        boolean var19;
                        if (class269.field4344 >= var12 && class77.field1281 >= var13 && class269.field4344 < var14 && class77.field1281 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class163.field2642 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class20.field257 == 1 && class309.field4941 >= var12 && class42.field609 >= var13 && class309.field4941 < var14 && class42.field609 < var15) {
                            var21 = true;
                        }
                        if (var9.field3428 != null) {
                            for (int var22 = 0; var22 < var9.field3428.length; var22++) {
                                if (class100.field1627[var9.field3428[var22]]) {
                                    if (var9.field3473 == null || class29.field360 >= var9.field3473[var22]) {
                                        byte var23 = var9.field3471[var22];
                                        if (var23 == 0 || ((var23 & 0x8) == 0 || !class100.field1627[86] && !class100.field1627[82] && !class100.field1627[81]) && ((var23 & 0x2) == 0 || class100.field1627[86]) && ((var23 & 0x1) == 0 || class100.field1627[82]) && ((var23 & 0x4) == 0 || class100.field1627[81])) {
                                            class126.method874(var9.field3375, "", -1, (byte) 77, var22 + 1);
                                            int var24 = var9.field3493[var22];
                                            if (var9.field3473 == null) {
                                                var9.field3473 = new int[var9.field3428.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field3473[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field3473[var22] = class29.field360 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field3473 != null) {
                                    var9.field3473[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class196.method1378(var9, -9347, class42.field609 - var11, class309.field4941 - var10);
                        }
                        if (field4857 != null && field4857 != var9 && var19 && method2015(var9).method1534(false)) {
                            class13.field146 = var9;
                        }
                        if (class277.field4446 == var9) {
                            class121.field1926 = true;
                            class66.field1107 = var10;
                            class243.field3864 = var11;
                        }
                        if (var9.field3329 || var9.field3446 != 0) {
                            if (var19 && class206.field3274 != 0 && var9.field3486 != null) {
                                class126 var25 = new class126();
                                var25.field1997 = true;
                                var25.field2000 = var9;
                                var25.field1987 = class206.field3274;
                                var25.field1989 = var9.field3486;
                                class288.field4611.method1646(true, var25);
                            }
                            if (field4857 != null || class11.field110 != null || class286.field4537 || var9.field3446 != 1400 && class143.field2270 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field3446 != 0) {
                                if (var9.field3446 == 1337) {
                                    class121.field1934 = var9;
                                    continue;
                                }
                                if (var9.field3446 == 1338) {
                                    if (var21) {
                                        class79.field1315 = class309.field4941 - var10;
                                        class23.field297 = class42.field609 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field3446 == 1400) {
                                    class280.field4486 = var9;
                                    if (var19) {
                                        class269.field4345 = true;
                                    }
                                    if (var21) {
                                        int var26 = (int) ((double) (class309.field4941 - var10 - var9.field3430 / 2) * 2.0D / (double) class275.field4418);
                                        int var27 = (int) ((double) (class42.field609 - var11 - var9.field3394 / 2) * 2.0D / (double) class275.field4418);
                                        int var28 = class247.field3934 + var26;
                                        int var29 = class129.field2029 + var27;
                                        int var30 = class275.field4412 + var28;
                                        int var31 = class275.field4416 + class275.field4413 - var29 - 1;
                                        class77 var32 = class237.method1607(0);
                                        if (var32 == null) {
                                            continue;
                                        }
                                        int[] var33 = new int[3];
                                        var32.method524((byte) 56, var30, var33, var31);
                                        if (var33 != null) {
                                            if (class100.field1627[82] && class298.field4765 > 0) {
                                                class168.method1223((byte) 71, var33[0], var33[2], var33[1]);
                                                class214.method1490(26579);
                                                continue;
                                            }
                                            class268.field4307++;
                                            class314.field5061.method828(117, 6);
                                            class314.field5061.method1113(8843, var33[0] << 28 | var33[1] << 14 | var33[2]);
                                        }
                                        class143.field2270 = 1;
                                        class39.field542 = false;
                                        class151.field2371 = class269.field4344;
                                        class272.field4371 = class77.field1281;
                                        continue;
                                    }
                                    if (var20 && class143.field2270 > 0) {
                                        if (class143.field2270 == 1 && (class269.field4344 != class151.field2371 || class77.field1281 != class272.field4371)) {
                                            class169.field2751 = class247.field3934;
                                            class131.field2067 = class129.field2029;
                                            class143.field2270 = 2;
                                        }
                                        if (class143.field2270 == 2) {
                                            class39.field542 = true;
                                            class286.method1909((int) ((double) (class151.field2371 - class269.field4344) * 2.0D / (double) class275.field4409) + class169.field2751, -1);
                                            class279.method1879(-124, (int) ((double) (class272.field4371 - class77.field1281) * 2.0D / (double) class275.field4409) + class131.field2067);
                                        }
                                        continue;
                                    }
                                    if (class143.field2270 > 0 && !class39.field542) {
                                        if ((class2.field21 == 1 || class33.method219(false, class83.field1384 - 1)) && class83.field1384 > 2) {
                                            class14.method65(-90);
                                        } else if (class83.field1384 > 0) {
                                            class180.method1312((byte) 44);
                                        }
                                    }
                                    class143.field2270 = 0;
                                    continue;
                                }
                                if (var9.field3446 == 1401) {
                                    if (var20) {
                                        class312.method2086(var9.field3394, class269.field4344 - var10, var9.field3430, 0, class77.field1281 - var11);
                                    }
                                    continue;
                                }
                                if (var9.field3446 == 1402) {
                                    class117.method834(var9, (byte) -57);
                                    continue;
                                }
                            }
                            if (!var9.field3483 && var21) {
                                var9.field3483 = true;
                                if (var9.field3412 != null) {
                                    class126 var34 = new class126();
                                    var34.field1997 = true;
                                    var34.field2000 = var9;
                                    var34.field1999 = class309.field4941 - var10;
                                    var34.field1987 = class42.field609 - var11;
                                    var34.field1989 = var9.field3412;
                                    class288.field4611.method1646(true, var34);
                                }
                            }
                            if (var9.field3483 && var20 && var9.field3472 != null) {
                                class126 var35 = new class126();
                                var35.field1997 = true;
                                var35.field2000 = var9;
                                var35.field1999 = class269.field4344 - var10;
                                var35.field1987 = class77.field1281 - var11;
                                var35.field1989 = var9.field3472;
                                class288.field4611.method1646(true, var35);
                            }
                            if (var9.field3483 && !var20) {
                                var9.field3483 = false;
                                if (var9.field3434 != null) {
                                    class126 var36 = new class126();
                                    var36.field1997 = true;
                                    var36.field2000 = var9;
                                    var36.field1999 = class269.field4344 - var10;
                                    var36.field1987 = class77.field1281 - var11;
                                    var36.field1989 = var9.field3434;
                                    class204.field3254.method1646(true, var36);
                                }
                            }
                            if (var20 && var9.field3445 != null) {
                                class126 var37 = new class126();
                                var37.field1997 = true;
                                var37.field2000 = var9;
                                var37.field1999 = class269.field4344 - var10;
                                var37.field1987 = class77.field1281 - var11;
                                var37.field1989 = var9.field3445;
                                class288.field4611.method1646(true, var37);
                            }
                            if (!var9.field3469 && var19) {
                                var9.field3469 = true;
                                if (var9.field3338 != null) {
                                    class126 var38 = new class126();
                                    var38.field1997 = true;
                                    var38.field2000 = var9;
                                    var38.field1999 = class269.field4344 - var10;
                                    var38.field1987 = class77.field1281 - var11;
                                    var38.field1989 = var9.field3338;
                                    class288.field4611.method1646(true, var38);
                                }
                            }
                            if (var9.field3469 && var19 && var9.field3359 != null) {
                                class126 var39 = new class126();
                                var39.field1997 = true;
                                var39.field2000 = var9;
                                var39.field1999 = class269.field4344 - var10;
                                var39.field1987 = class77.field1281 - var11;
                                var39.field1989 = var9.field3359;
                                class288.field4611.method1646(true, var39);
                            }
                            if (var9.field3469 && !var19) {
                                var9.field3469 = false;
                                if (var9.field3465 != null) {
                                    class126 var40 = new class126();
                                    var40.field1997 = true;
                                    var40.field2000 = var9;
                                    var40.field1999 = class269.field4344 - var10;
                                    var40.field1987 = class77.field1281 - var11;
                                    var40.field1989 = var9.field3465;
                                    class204.field3254.method1646(true, var40);
                                }
                            }
                            if (var9.field3449 != null) {
                                class126 var41 = new class126();
                                var41.field2000 = var9;
                                var41.field1989 = var9.field3449;
                                class291.field4675.method1646(true, var41);
                            }
                            if (var9.field3461 != null && class311.field4971 > var9.field3362) {
                                if (var9.field3397 == null || class311.field4971 - var9.field3362 > 32) {
                                    class126 var46 = new class126();
                                    var46.field2000 = var9;
                                    var46.field1989 = var9.field3461;
                                    class288.field4611.method1646(true, var46);
                                } else {
                                    label600: for (int var42 = var9.field3362; var42 < class311.field4971; var42++) {
                                        int var43 = class104.field1661[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field3397.length; var44++) {
                                            if (var9.field3397[var44] == var43) {
                                                class126 var45 = new class126();
                                                var45.field2000 = var9;
                                                var45.field1989 = var9.field3461;
                                                class288.field4611.method1646(true, var45);
                                                break label600;
                                            }
                                        }
                                    }
                                }
                                var9.field3362 = class311.field4971;
                            }
                            if (var9.field3497 != null && class117.field1892 > var9.field3396) {
                                if (var9.field3450 == null || class117.field1892 - var9.field3396 > 32) {
                                    class126 var51 = new class126();
                                    var51.field2000 = var9;
                                    var51.field1989 = var9.field3497;
                                    class288.field4611.method1646(true, var51);
                                } else {
                                    label576: for (int var47 = var9.field3396; var47 < class117.field1892; var47++) {
                                        int var48 = class287.field4604[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field3450.length; var49++) {
                                            if (var9.field3450[var49] == var48) {
                                                class126 var50 = new class126();
                                                var50.field2000 = var9;
                                                var50.field1989 = var9.field3497;
                                                class288.field4611.method1646(true, var50);
                                                break label576;
                                            }
                                        }
                                    }
                                }
                                var9.field3396 = class117.field1892;
                            }
                            if (var9.field3334 != null && class268.field4319 > var9.field3388) {
                                if (var9.field3417 == null || class268.field4319 - var9.field3388 > 32) {
                                    class126 var56 = new class126();
                                    var56.field2000 = var9;
                                    var56.field1989 = var9.field3334;
                                    class288.field4611.method1646(true, var56);
                                } else {
                                    label552: for (int var52 = var9.field3388; var52 < class268.field4319; var52++) {
                                        int var53 = class190.field3080[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field3417.length; var54++) {
                                            if (var9.field3417[var54] == var53) {
                                                class126 var55 = new class126();
                                                var55.field2000 = var9;
                                                var55.field1989 = var9.field3334;
                                                class288.field4611.method1646(true, var55);
                                                break label552;
                                            }
                                        }
                                    }
                                }
                                var9.field3388 = class268.field4319;
                            }
                            if (var9.field3358 != null && class312.field4980 > var9.field3348) {
                                if (var9.field3403 == null || class312.field4980 - var9.field3348 > 32) {
                                    class126 var61 = new class126();
                                    var61.field2000 = var9;
                                    var61.field1989 = var9.field3358;
                                    class288.field4611.method1646(true, var61);
                                } else {
                                    label528: for (int var57 = var9.field3348; var57 < class312.field4980; var57++) {
                                        int var58 = class115.field1803[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field3403.length; var59++) {
                                            if (var9.field3403[var59] == var58) {
                                                class126 var60 = new class126();
                                                var60.field2000 = var9;
                                                var60.field1989 = var9.field3358;
                                                class288.field4611.method1646(true, var60);
                                                break label528;
                                            }
                                        }
                                    }
                                }
                                var9.field3348 = class312.field4980;
                            }
                            if (var9.field3494 != null && class97.field1560 > var9.field3429) {
                                if (var9.field3440 == null || class97.field1560 - var9.field3429 > 32) {
                                    class126 var66 = new class126();
                                    var66.field2000 = var9;
                                    var66.field1989 = var9.field3494;
                                    class288.field4611.method1646(true, var66);
                                } else {
                                    label504: for (int var62 = var9.field3429; var62 < class97.field1560; var62++) {
                                        int var63 = class296.field4726[var62 & 0x1F];
                                        for (int var64 = 0; var64 < var9.field3440.length; var64++) {
                                            if (var9.field3440[var64] == var63) {
                                                class126 var65 = new class126();
                                                var65.field2000 = var9;
                                                var65.field1989 = var9.field3494;
                                                class288.field4611.method1646(true, var65);
                                                break label504;
                                            }
                                        }
                                    }
                                }
                                var9.field3429 = class97.field1560;
                            }
                            if (class312.field4982 > var9.field3345 && var9.field3424 != null) {
                                class126 var67 = new class126();
                                var67.field2000 = var9;
                                var67.field1989 = var9.field3424;
                                class288.field4611.method1646(true, var67);
                            }
                            if (class205.field3264 > var9.field3345 && var9.field3379 != null) {
                                class126 var68 = new class126();
                                var68.field2000 = var9;
                                var68.field1989 = var9.field3379;
                                class288.field4611.method1646(true, var68);
                            }
                            if (class268.field4317 > var9.field3345 && var9.field3448 != null) {
                                class126 var69 = new class126();
                                var69.field2000 = var9;
                                var69.field1989 = var9.field3448;
                                class288.field4611.method1646(true, var69);
                            }
                            if (class203.field3246 > var9.field3345 && var9.field3380 != null) {
                                class126 var70 = new class126();
                                var70.field2000 = var9;
                                var70.field1989 = var9.field3380;
                                class288.field4611.method1646(true, var70);
                            }
                            if (class304.field4874 > var9.field3345 && var9.field3339 != null) {
                                class126 var71 = new class126();
                                var71.field2000 = var9;
                                var71.field1989 = var9.field3339;
                                class288.field4611.method1646(true, var71);
                            }
                            var9.field3345 = class74.field1237;
                            if (var9.field3331 != null) {
                                for (int var72 = 0; var72 < class165.field2653; var72++) {
                                    class126 var73 = new class126();
                                    var73.field2000 = var9;
                                    var73.field1992 = class309.field4939[var72];
                                    var73.field1983 = class132.field2074[var72];
                                    var73.field1989 = var9.field3331;
                                    class288.field4611.method1646(true, var73);
                                }
                            }
                            if (class163.field2641 && var9.field3447 != null) {
                                class126 var74 = new class126();
                                var74.field2000 = var9;
                                var74.field1989 = var9.field3447;
                                class288.field4611.method1646(true, var74);
                            }
                        }
                    }
                    if (!var9.field3337 && field4857 == null && class11.field110 == null && !class286.field4537) {
                        if ((var9.field3373 >= 0 || var9.field3381 != 0) && class269.field4344 >= var12 && class77.field1281 >= var13 && class269.field4344 < var14 && class77.field1281 < var15) {
                            if (var9.field3373 >= 0) {
                                class161.field2559 = arg0[var9.field3373];
                            } else {
                                class161.field2559 = var9;
                            }
                        }
                        if (var9.field3385 == 8 && class269.field4344 >= var12 && class77.field1281 >= var13 && class269.field4344 < var14 && class77.field1281 < var15) {
                            class305.field4878 = var9;
                        }
                        if (var9.field3414 > var9.field3394) {
                            class294.method1957(var9.field3394, var11, var9, var9.field3414, var9.field3430 + var10, class269.field4344, class77.field1281, 16);
                        }
                    }
                    if (var9.field3385 == 0) {
                        method2016(arg0, var9.field3375, var12, var13, var14, var15, var10 - var9.field3392, var11 - var9.field3369);
                        if (var9.field3352 != null) {
                            method2016(var9.field3352, var9.field3375, var12, var13, var14, var15, var10 - var9.field3392, var11 - var9.field3369);
                        }
                        class97 var75 = (class97) class244.field3880.method1059(0, (long) var9.field3375);
                        if (var75 != null) {
                            class115.method802(var14, var10, var12, var11, var75.field1556, var13, (byte) -19, var15);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lag;)Z")
    public static final boolean method2017(class211 arg0) {
        if (class176.field2877) {
            if (method2015(arg0).field3629 != 0) {
                return false;
            }
            if (arg0.field3385 == 0) {
                return false;
            }
        }
        return arg0.field3495;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method257(int arg0) {
        field4854++;
        if (class255.field4115 != null) {
            class255.field4115.field1209 = false;
        }
        if (arg0 >= -91) {
            method2018();
        }
        class255.field4115 = null;
        if (class208.field3298 != null) {
            class208.field3298.method974((byte) 107);
            class208.field3298 = null;
        }
        class22.method125(class131.field2064, (byte) 97);
        class271.method1816(class131.field2064, 9938);
        if (class193.field3136 != null) {
            class193.field3136.method999(class131.field2064, (byte) -113);
        }
        class90.method610(113);
        class165.method1186(0);
        class193.field3136 = null;
        if (class233.field3750 != null) {
            class233.field3750.method1922((byte) -23);
        }
        if (class62.field1024 != null) {
            class62.field1024.method1922((byte) -128);
        }
        class90.field1472.method428(28449);
        class313.field4992.method1374(125);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method2018() {
        class124.field1966 = 0;
        for (int var0 = 0; var0 < class246.field3912; var0++) {
            class131 var1 = class12.field127[class184.field3020[var0]];
            if (var1.field713 && var1.method290(-13800) != -1) {
                int var2 = var1.field637 - (var1.method279(23397) - 1) * 64;
                int var3 = var1.field710 - (var1.method279(23397) - 1) * 64;
                class179 var4 = class276.method1858(class56.field941, var2 >> 7, var3 >> 7);
                if (var4 != null) {
                    long var5 = var4.field2933;
                    int var7 = (int) (var5 >>> 32) & Integer.MAX_VALUE;
                    class43 var8;
                    if ((var5 >>> 29 & 0x3L) == 0L) {
                        var8 = class270.field4355[var7];
                    } else {
                        var8 = class12.field127[var7];
                        var7 += 2048;
                    }
                    if (var8.field633 == -1) {
                        class277.field4452[class124.field1966] = var7;
                        class266.field4278[class124.field1966++] = var7;
                        var8.field633 = 0;
                    }
                    class277.field4452[class124.field1966] = var7;
                    class266.field4278[class124.field1966++] = class184.field3020[var0] + 2048;
                }
            }
        }
        class258.method1734(0, class266.field4278, class277.field4452, 105, class124.field1966 - 1);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method255(int arg0) {
        field4846++;
        if (class153.field2385 == 1000) {
            return;
        }
        long var2 = class155.method1057(13974) / 1000000L - class294.field4712;
        class294.field4712 = class155.method1057(13974) / 1000000L;
        boolean var4 = class23.method130(arg0 ^ 0x80000002);
        if (var4 && class277.field4451 && class233.field3750 != null) {
            class233.field3750.method1931(arg0 ^ 0x7FFFF82F);
        }
        if ((class153.field2385 == 30 || class153.field2385 == 10) && (class43.field642 || class214.field3538 != 0L && class214.field3538 < class191.method1350((byte) -125))) {
            class41.method268(class56.method383(false), class34.field518, class43.field642, -27825, class123.field1959);
        }
        if (class259.field4184 == null) {
            Container var5;
            if (class259.field4184 != null) {
                var5 = class259.field4184;
            } else if (class92.field1494 == null) {
                var5 = class268.field4323.field751;
            } else {
                var5 = class92.field1494;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class92.field1494 == var5) {
                Insets var8 = class92.field1494.getInsets();
                var6 -= var8.left + var8.right;
                var7 -= var8.top + var8.bottom;
            }
            if (class66.field1099 != var6 || class153.field2387 != var7) {
                if (class45.field760.startsWith("mac")) {
                    class153.field2387 = var7;
                    class66.field1099 = var6;
                } else {
                    class100.method684((byte) -110);
                }
                class214.field3538 = class191.method1350((byte) 115) + 500L;
            }
        }
        boolean var9 = false;
        if (arg0 != Integer.MAX_VALUE) {
            this.method2019(-1, (byte[]) null);
        }
        if (class32.field468) {
            class32.field468 = false;
            var9 = true;
        }
        if (var9) {
            class221.method1518(0);
        }
        if (class153.field2385 == 0) {
            class89.method606(var9, 96, (Color) null, class195.field3157, class186.field3032);
        } else if (class153.field2385 == 5) {
            class97.method669(false, arg0 ^ 0x7FFFFFFD, class59.field967);
        } else if (class153.field2385 == 10) {
            class92.method618(arg0 - 2147483497);
        } else if (class153.field2385 == 25 || class153.field2385 == 28) {
            if (class165.field2667 == 1) {
                if (class214.field3535 > class170.field2763) {
                    class170.field2763 = class214.field3535;
                }
                int var10 = (class170.field2763 - class214.field3535) * 50 / class170.field2763;
                class249.method1660(class47.field797 + "<br>(" + var10 + "%)", false, false);
            } else if (class165.field2667 == 2) {
                if (class12.field126 < class150.field2337) {
                    class12.field126 = class150.field2337;
                }
                int var11 = (class12.field126 - class150.field2337) * 50 / class12.field126 + 50;
                class249.method1660(class47.field797 + "<br>(" + var11 + "%)", false, false);
            } else {
                class249.method1660(class47.field797, false, false);
            }
        } else if (class153.field2385 == 30) {
            class178.method1302(var2, 113);
        } else if (class153.field2385 == 40) {
            class249.method1660(class61.field1001 + "<br>" + class303.field4838, false, false);
        }
        if ((class153.field2385 == 30 || class153.field2385 == 10) && class158.field2505 == 0 && !var9) {
            try {
                Graphics var12 = class131.field2064.getGraphics();
                for (int var13 = 0; var13 < class250.field3971; var13++) {
                    if (class85.field1415[var13]) {
                        class112.field1757.method40(var12, class74.field1241[var13], class15.field164[var13], class132.field2088[var13], class190.field3075[var13], -113);
                        class85.field1415[var13] = false;
                    }
                }
            } catch (Exception var17) {
                class131.field2064.repaint();
            }
        } else if (class153.field2385 != 0) {
            try {
                Graphics var14 = class131.field2064.getGraphics();
                class112.field1757.method38(0, 0, 0, var14);
                for (int var15 = 0; var15 < class250.field3971; var15++) {
                    class85.field1415[var15] = false;
                }
            } catch (Exception var16) {
                class131.field2064.repaint();
            }
        }
        if (class212.field3516) {
            class116.method829(arg0 - 2147483562);
        }
        if (class294.field4713 && class153.field2385 == 10 && class22.field284 != -1) {
            class294.field4713 = false;
            class56.method385(-68, class268.field4323);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)V")
    private final void method2019(int arg0, byte[] arg1) {
        field4848++;
        if (arg0 != -65536) {
            method2028();
        }
        class162 var3 = new class162(arg1);
        while (true) {
            int var4;
            do {
                while (true) {
                    var4 = var3.method1133((byte) 53);
                    if (var4 == 0) {
                        return;
                    }
                    if (var4 != 1) {
                        break;
                    }
                    var3.method1142(arg0 + 46566);
                    var3.method1142(-18970);
                    var3.method1142(arg0 + 46566);
                    var3.method1142(-18970);
                    var3.method1142(-18970);
                    var3.method1142(-18970);
                }
            } while (var4 != 4);
            int var5 = var3.method1133((byte) 53);
            class67.field1109 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                class67.field1109[var6] = var3.method1142(-18970);
                if (class67.field1109[var6] == 65535) {
                    class67.field1109[var6] = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    public static void method2020(byte arg0) {
        field4852 = null;
        if (arg0 > -25) {
            field4852 = null;
        }
        field4858 = null;
        field4857 = null;
        field4845 = null;
        field4853 = null;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method2021() {
        for (int var0 = -1; var0 < class246.field3912 + class13.field145; var0++) {
            class43 var1;
            long var2;
            if (var0 < 0) {
                var1 = class239.field3829;
                var2 = 8791798054912L;
            } else if (var0 < class13.field145) {
                int var4 = class259.field4176[var0];
                var1 = class270.field4355[var4];
                var2 = (long) var4 << 32;
            } else {
                int var5 = class184.field3020[var0 - class13.field145];
                class131 var6 = class12.field127[var5];
                var1 = var6;
                var2 = (long) var5 << 32 | 0x20000000L;
                if (!var6.field2056.field4076) {
                    var2 |= Long.MIN_VALUE;
                }
            }
            if (var1.field667 < 0) {
                var1.field713 = false;
            } else {
                var1.field633 = -1;
                int var7 = var1.method279(23397);
                if ((var7 & 0x1) == 0) {
                    if ((var1.field637 & 0x7F) != 0 || (var1.field710 & 0x7F) != 0) {
                        var1.field713 = false;
                        continue;
                    }
                } else if ((var1.field637 & 0x7F) != 64 || (var1.field710 & 0x7F) != 64) {
                    var1.field713 = false;
                    continue;
                }
                int var10002;
                if (var7 == 1) {
                    int var8 = var1.field637 >> 7;
                    int var9 = var1.field710 >> 7;
                    if (var8 < 0 || var8 >= 104 || var9 < 0 || var9 >= 104) {
                        var1.field713 = true;
                        continue;
                    }
                    if (class15.field165[var8][var9] != var1.field667) {
                        var1.field713 = true;
                        continue;
                    }
                    if (class308.field4922[var8][var9] > 1) {
                        var10002 = class308.field4922[var8][var9]--;
                        var1.field713 = true;
                        continue;
                    }
                } else {
                    int var10 = var1.field637 - var7 * 64 >> 7;
                    int var11 = var1.field710 - var7 * 64 >> 7;
                    int var12 = var7 + var10;
                    int var13 = var7 + var11;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var12 > 104) {
                        var12 = 104;
                    }
                    if (var11 < 0) {
                        var11 = 0;
                    }
                    if (var13 > 104) {
                        var13 = 104;
                    }
                    if (!class244.method1635(var10, -5413, var11, var12, var13, var1.field667)) {
                        for (int var14 = var10; var14 < var12; var14++) {
                            for (int var15 = var11; var15 < var13; var15++) {
                                if (class15.field165[var14][var15] == var1.field667) {
                                    var10002 = class308.field4922[var14][var15]--;
                                }
                            }
                        }
                        var1.field713 = true;
                        continue;
                    }
                }
                if (var1 instanceof class299 && var1.field622 != null && class29.field360 >= var1.field656 && class29.field360 < var1.field663) {
                    ((class299) var1).field4776 = false;
                    var1.field713 = false;
                    var1.field653 = class155.method1060((byte) -12, class56.field941, var1.field710, var1.field637);
                    class203.method1420(class56.field941, var1.field637, var1.field710, var1.field653, var1, var1.field652, var2, var1.field700, var1.field683, var1.field680, var1.field693);
                } else {
                    var1.field713 = false;
                    var1.field653 = class155.method1060((byte) -12, class56.field941, var1.field710, var1.field637);
                    class51.method358(class56.field941, var1.field637, var1.field710, var1.field653, (var7 - 1) * 64 + 60, var1, var1.field652, var2, var1.field621);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method2022() {
        for (int var0 = 0; var0 < 104; var0++) {
            int[] var1 = class15.field165[var0];
            for (int var2 = 0; var2 < 104; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method2023() {
        boolean var0 = class100.field1624 && class13.field145 > 200 || class13.field145 > 50;
        for (int var1 = 0; var1 < class13.field145; var1++) {
            class299 var10 = class270.field4355[class259.field4176[var1]];
            var10.field711 = false;
            if (var10.method285(96)) {
                var10.field4776 = var10.field682 == var10.method292(-42).field3006 ? var0 : false;
                int var11 = 0;
                if (!var10.field713) {
                    var11++;
                }
                if (var10.field668 > class29.field360) {
                    var11 += 2;
                }
                int var12 = var11 + (5 - var10.method279(23397) << 2);
                if (class23.field290 == 0) {
                    var12 += 32;
                } else {
                    var12 += 128;
                }
                var12 += 256;
                var10.field667 = var12 + 1;
            } else {
                var10.field667 = -1;
            }
        }
        for (int var2 = 0; var2 < class246.field3912; var2++) {
            class131 var7 = class12.field127[class184.field3020[var2]];
            var7.field711 = false;
            if (var7.method285(106) && var7.field2056.method1702(23333)) {
                int var8 = 0;
                if (!var7.field713) {
                    var8++;
                }
                if (var7.field668 > class29.field360) {
                    var8 += 2;
                }
                int var9 = var8 + (5 - var7.method279(23397) << 2);
                if (class23.field290 == 0) {
                    if (var7.field2056.field4059) {
                        var9 += 64;
                    } else {
                        var9 += 128;
                    }
                } else if (class23.field290 == 1) {
                    if (var7.field2056.field4059) {
                        var9 += 32;
                    } else {
                        var9 += 64;
                    }
                }
                if (var7.field2056.field4035) {
                    var9 += 512;
                } else {
                    var9 += 256;
                }
                var7.field667 = var9 + 1;
            } else {
                var7.field667 = -1;
            }
        }
        for (int var3 = 0; var3 < field4852.length; var3++) {
            class56 var4 = field4852[var3];
            if (var4 != null) {
                if (var4.field942 == 1) {
                    class131 var5 = class12.field127[var4.field930];
                    if (var5 != null && var5.field667 != -1) {
                        var5.field667 += 1024;
                    }
                } else if (var4.field942 == 10) {
                    class299 var6 = class270.field4355[var4.field930];
                    if (var6 != null && var6.field667 != -1) {
                        var6.field667 += 1024;
                    }
                }
            }
        }
        class239.field3829.field667 = Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method251(byte arg0) {
        field4847++;
        method2020((byte) -58);
        class171.method1246();
        class245.method1638(0);
        if (arg0 != 112) {
            method2029((class211) null);
        }
        class286.method1906((byte) -103);
        class275.method1839();
        class77.method519(true);
        class39.method246((byte) 125);
        class73.method493(9053);
        class72.method490(-117);
        class56.method386((byte) 122);
        class162.method1132((byte) -121);
        class63.method440(false);
        class196.method1379(arg0 ^ 0xFFFFFFEA);
        class168.method1226(arg0 ^ 0xFFFFDAB0);
        class32.method211((byte) -93);
        class251.method1669(true);
        class85.method578(-1);
        class25.method139((byte) -108);
        class173.method1256(-114);
        class131.method928(false);
        class116.method827(45);
        class44.method301(-2);
        class211.method1480(-5);
        class299.method1974(89);
        class246.method1641((byte) 73);
        class146.method1020(0);
        class155.method1054(true);
        class145.method1015(arg0 - 112);
        class185.method1328((byte) -48);
        class133.method940(4260);
        class314.method2095(-44);
        class289.method1923(3111);
        class233.method1573(13050);
        class264.method1776((byte) -116);
        class307.method2057(127);
        class43.method282((byte) -91);
        class151.method1041((byte) 2);
        class296.method1963(-1);
        class253.method1707(-1);
        class97.method667(3652);
        class223.method1531(-22990);
        class119.method844(false);
        class128.method911(7199);
        class57.method394(false);
        class40.method263(219);
        class304.method2037(0);
        class313.method2087(false);
        class306.method2044(4096);
        class67.method471((byte) -125);
        class83.method572((byte) 119);
        class121.method851(39);
        class291.method1936((byte) -90);
        class207.method1447(0);
        class238.method1611(false);
        class204.method1428((byte) 91);
        class195.method1366((byte) -121);
        class167.method1220(-101);
        class14.method69(true);
        class161.method1104(false);
        class48.method344(112);
        class158.method1078((byte) 94);
        class241.method1623(-16);
        class88.method600(-1);
        class166.method1210();
        class123.method868((byte) 95);
        class115.method815(90);
        class31.method180();
        class177.method1292(28074);
        class68.method476(11684);
        class263.method1763(-128);
        class65.method454(0);
        class236.method1599((byte) 31);
        class84.method576(81);
        class220.method1514((byte) 106);
        class93.method648();
        class163.method1171(33);
        class132.method931((byte) 100);
        class80.method548();
        class261.method1756((byte) -72);
        class266.method1791((byte) 29);
        class94.method651(250);
        class269.method1810((byte) 50);
        class140.method984();
        class111.method780(11573);
        class50.method355(1);
        class47.method335(false);
        class213.method1485((byte) 96);
        class17.method86(arg0 ^ 0x3AD5);
        class262.method1762(-22033);
        class127.method906();
        class279.method1877((byte) 109);
        class104.method743(true);
        class60.method413(-22787);
        class137.method959(arg0 - 113);
        class101.method688(arg0 ^ 0x65);
        class205.method1433(-41);
        class237.method1605(-94);
        class144.method1010(4);
        class310.method2069((byte) 104);
        class174.method1273(false);
        class184.method1325(true);
        class247.method1655((byte) 125);
        class182.method1319(false);
        class55.method376(arg0 ^ 0xFFFF8BD9);
        class26.method145(2);
        class129.method917(14);
        class21.method115();
        class19.method97(0);
        class234.method1580(arg0 ^ 0xFFFFE7C8);
        class87.method596((byte) 120);
        class208.method1453((byte) 59);
        class278.method1873(-1);
        class106.method752();
        class277.method1863(4);
        class198.method1383(arg0 ^ 0x6F);
        class230.method1552(-117);
        class285.method1898((byte) 64);
        class149.method1037((byte) 78);
        class69.method479(arg0 ^ 0x29);
        class64.method452(-1);
        class38.method237();
        class302.method2001();
        class120.method850(-111);
        class258.method1736(0);
        class41.method267((byte) -23);
        class183.method1324(true);
        class203.method1424((byte) 85);
        class212.method1482((byte) 115);
        class267.method1796(-116);
        class303.method2013((byte) -80);
        class49.method347(114);
        class12.method59(arg0 ^ 0x4A);
        class126.method875(174);
        class228.method1544(arg0 - 112);
        class2.method13(17);
        class192.method1356(-125);
        class179.method1307(89);
        class229.method1549(-102);
        class209.method1457((byte) -80);
        class259.method1741((byte) 116);
        class188.method1342(0);
        class29.method161(false);
        class108.method769((byte) 35);
        class154.method1049();
        class52.method364(14819);
        class150.method1038(-1);
        class8.method41();
        class240.method1617((byte) 68);
        class239.method1616(15226);
        class160.method1101(-22950);
        class105.method747(109);
        class34.method223(-3);
        class175.method1284((byte) -87);
        class227.method1542(-1);
        class107.method761(true);
        class86.method588((byte) 127);
        class138.method966();
        class305.method2041((byte) -101);
        class3.method19(-121);
        class176.method1288(-9025);
        class255.method1717(arg0 - 221);
        class141.method997((byte) -50);
        class159.method1097(37);
        class265.method1782((byte) 78);
        class81.method560(19331);
        class206.method1442(28355);
        class218.method1507(8);
        class282.method1893((byte) 78);
        class281.method1888(0);
        class76.method513();
        class11.method56(true);
        class6.method36((byte) 36);
        class250.method1662((byte) 108);
        class46.method331((byte) -41);
        class180.method1313(9);
        class103.method742(-61);
        class178.method1305(arg0 - 14);
        class143.method1003(36);
        class202.method1412();
        class70.method483(64);
        class309.method2067(1);
        class30.method165((byte) 0);
        class189.method1345(-26907);
        class301.method1989(-1);
        class110.method773();
        class300.method1986();
        class59.method405(11321);
        class271.method1817(32);
        class274.method1837((byte) -58);
        class109.method771(62);
        class16.method81();
        class113.method797();
        class187.method1340((byte) -128);
        class193.method1361(1519);
        class117.method836(-35);
        class62.method426(true);
        class78.method533(true);
        class308.method2060(-30526);
        class186.method1334(11);
        class199.method1392(121);
        class288.method1920(false);
        class215.method1497(false);
        class74.method503((byte) 120);
        class28.method160(0);
        class219.method1512(0);
        class312.method2085((byte) 114);
        class98.method671((byte) 32);
        class92.method617(false);
        class272.method1819(1011);
        class136.method952((byte) -98);
        class153.method1048(4545);
        class268.method1800(-117);
        class293.method1954((byte) 64);
        class125.method872((byte) -116);
        class112.method786((byte) -127);
        class298.method1970((byte) 122);
        class82.method571((byte) 122);
        class273.method1832((byte) -122);
        class42.method275((byte) -73);
        class244.method1633(true);
        class214.method1492(true);
        class96.method661(-11433);
        class100.method681((byte) 99);
        class10.method48(-116);
        class22.method124(-1734);
        class130.method921((byte) -43);
        class53.method372(22118);
        class170.method1233(0);
        class181.method1314((byte) -91);
        class256.method1723(arg0 + 13594);
        class224.method1538(0);
        class13.method62(true);
        class23.method132(-1);
        class61.method418(true);
        class243.method1627((byte) -110);
        class75.method506(-67);
        class148.method1030(-12101);
        class249.method1659(arg0 - 106);
        class156.method1064(false);
        class15.method74(31658);
        class124.method871((byte) 116);
        class294.method1956(109);
        class216.method1498(10830);
        class134.method945((byte) 117);
        class270.method1812((byte) 100);
        class4.method25(-112);
        class18.method90((byte) 103);
        class287.method1910((byte) 34);
        class280.method1882(arg0 ^ 0x70);
        class79.method539(-105);
        class1.method5((byte) 25);
        class190.method1347(arg0 - 20801);
        class90.method613(118);
        class71.method486(arg0 - 62);
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field4844++;
        if (!this.method243((byte) 56)) {
            return;
        }
        class148.field2317 = Integer.parseInt(this.getParameter("worldid"));
        class225.field3652 = Integer.parseInt(this.getParameter("modewhere"));
        if (class225.field3652 < 0 || class225.field3652 > 1) {
            class225.field3652 = 0;
        }
        class130.field2044 = Integer.parseInt(this.getParameter("modewhat"));
        if (class130.field2044 < 0 || class130.field2044 > 2) {
            class130.field2044 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class266.field4275 = true;
        } else {
            class266.field4275 = false;
        }
        try {
            class2.field28 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class2.field28 = 0;
        }
        class234.method1583(11680, class2.field28);
        String var2 = this.getParameter("objecttag");
        if (var2 != null && var2.equals("1")) {
            class211.field3504 = true;
        } else {
            class211.field3504 = false;
        }
        String var3 = this.getParameter("js");
        if (var3 != null && var3.equals("1")) {
            class281.field4493 = true;
        } else {
            class281.field4493 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class299.field4792 = 1;
        } else {
            class299.field4792 = 0;
        }
        try {
            class1.field17 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class1.field17 = 0;
        }
        class160.field2545 = this.getParameter("settings");
        if (class160.field2545 == null) {
            class160.field2545 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class211.field3503 = Integer.parseInt(var5);
            } catch (Exception var7) {
                class211.field3503 = 0;
            }
        }
        String var6 = this.getParameter("haveie6");
        if (var6 != null && var6.equals("1")) {
            class240.field3837 = true;
        } else {
            class240.field3837 = false;
        }
        class59.field973 = this;
        this.method240(765, 503, 552, class130.field2044 + 32, 32000);
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    private final void method2024(byte arg0) {
        field4860++;
        boolean var2 = class90.field1472.method439(true);
        if (arg0 >= -114) {
            field4857 = null;
        }
        if (!var2) {
            this.method2014((byte) -7);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method249(int arg0) {
        class100.method684((byte) -110);
        class313.field4992 = new class196();
        field4855++;
        class90.field1472 = new class63();
        if (class130.field2044 != 0) {
            class70.field1182 = new byte[50][];
        }
        class163.method1174(96, class268.field4323);
        if (class225.field3652 == 0) {
            class272.field4368 = this.getCodeBase().getHost();
            class220.field3606 = 43594;
            class63.field1045 = 443;
        } else if (class225.field3652 == 1) {
            class272.field4368 = this.getCodeBase().getHost();
            class220.field3606 = class148.field2317 + 40000;
            class63.field1045 = class148.field2317 + 50000;
        } else if (class225.field3652 == 2) {
            class272.field4368 = "127.0.0.1";
            class220.field3606 = class148.field2317 + 40000;
            class63.field1045 = class148.field2317 + 50000;
        }
        class52.field870 = class63.field1045;
        class60.field990 = class144.field2277 = class12.field129 = class179.field2929 = new short[256];
        class32.field483 = class220.field3606;
        class55.field915 = class220.field3606;
        if (arg0 != 86) {
            return;
        }
        if (class299.field4792 == 1) {
            class241.field3848 = class133.field2119;
            class55.field903 = class155.field2416;
            class168.field2741 = class160.field2548;
            class298.field4759 = true;
            class245.field3901 = class77.field1274;
        } else {
            class245.field3901 = class203.field3243;
            class55.field903 = field4845;
            class168.field2741 = class236.field3789;
            class241.field3848 = class236.field3786;
        }
        class145.field2289 = class272.field4368;
        if (class45.field759 == 3 && class225.field3652 != 2) {
            class60.field979 = class148.field2317;
        }
        class245.field3903 = class55.field915;
        class40.method266(-277381177);
        class201.method1406(class131.field2064, arg0 ^ 0xFFFFFFFB);
        class52.method360(true, class131.field2064);
        class193.field3136 = class62.method422(3);
        if (class193.field3136 != null) {
            class193.field3136.method1000(class131.field2064, (byte) -127);
        }
        class218.field3590 = class45.field759;
        try {
            if (class268.field4323.field750 != null) {
                class227.field3665 = new class85(class268.field4323.field750, 5200, 0);
                for (int var2 = 0; var2 < 29; var2++) {
                    class253.field4074[var2] = new class85(class268.field4323.field752[var2], 6000, 0);
                }
                class176.field2872 = new class85(class268.field4323.field745, 6000, 0);
                class78.field1293 = new class25(255, class227.field3665, class176.field2872, 500000);
                class87.field1433 = new class85(class268.field4323.field748, 24, 0);
                class268.field4323.field752 = null;
                class268.field4323.field748 = null;
                class268.field4323.field745 = null;
                class268.field4323.field750 = null;
            }
        } catch (IOException var3) {
            class78.field1293 = null;
            class87.field1433 = null;
            class176.field2872 = null;
            class227.field3665 = null;
        }
        if (class299.field4792 == 0) {
            class177.field2901 = class57.field946;
        } else if (class299.field4792 == 1) {
            class177.field2901 = class117.field1890;
        }
        if (class225.field3652 != 0) {
            class119.field1908 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method2025(int arg0, int arg1) {
        if (arg1 != 6) {
            field4852 = null;
        }
        class90.field1472.field1058++;
        class10.field106 = null;
        class90.field1472.field1060 = arg0;
        class277.field4454 = 0;
        class256.field4150 = null;
        field4849++;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "()V")
    public static final void method2026() {
        for (int var0 = -1; var0 < class246.field3912 + class13.field145; var0++) {
            class43 var1;
            long var2;
            if (var0 < 0) {
                var1 = class239.field3829;
                var2 = 8791798054912L;
            } else if (var0 < class13.field145) {
                int var4 = class259.field4176[var0];
                var1 = class270.field4355[var4];
                var2 = (long) var4 << 32;
            } else {
                int var5 = class184.field3020[var0 - class13.field145];
                class131 var6 = class12.field127[var5];
                var1 = var6;
                var2 = (long) var5 << 32 | 0x20000000L;
                if (!var6.field2056.field4076) {
                    var2 |= Long.MIN_VALUE;
                }
            }
            if (var1.field667 >= 0) {
                int var7 = var1.method279(23397);
                if ((var7 & 0x1) == 0) {
                    if ((var1.field637 & 0x7F) == 0 && (var1.field710 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var1.field637 & 0x7F) == 64 && (var1.field710 & 0x7F) == 64) {
                    continue;
                }
                if (var1 instanceof class299 && var1.field622 != null && class29.field360 >= var1.field656 && class29.field360 < var1.field663) {
                    ((class299) var1).field4776 = false;
                    var1.field653 = class155.method1060((byte) -12, class56.field941, var1.field710, var1.field637);
                    class203.method1420(class56.field941, var1.field637, var1.field710, var1.field653, var1, var1.field652, var2, var1.field700, var1.field683, var1.field680, var1.field693);
                } else {
                    var1.field653 = class155.method1060((byte) -12, class56.field941, var1.field710, var1.field637);
                    class51.method358(class56.field941, var1.field637, var1.field710, var1.field653, (var7 - 1) * 64 + 60, var1, var1.field652, var2, var1.field621);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
    public static final void method2027(byte arg0) {
        field4851++;
        if (arg0 != -33) {
            method2026();
        }
        class185.method1329(false, false);
        System.gc();
        class262.method1760(25, arg0 - 54);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "()V")
    public static final void method2028() {
        for (int var0 = -1; var0 < class246.field3912 + class13.field145; var0++) {
            class43 var1;
            if (var0 < 0) {
                var1 = class239.field3829;
            } else if (var0 < class13.field145) {
                var1 = class270.field4355[class259.field4176[var0]];
            } else {
                var1 = class12.field127[class184.field3020[var0 - class13.field145]];
            }
            if (var1.field667 >= 0) {
                int var2 = var1.method279(23397);
                if ((var2 & 0x1) == 0) {
                    if ((var1.field637 & 0x7F) != 0 || (var1.field710 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var1.field637 & 0x7F) != 64 || (var1.field710 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var2 == 1) {
                    int var3 = var1.field637 >> 7;
                    int var4 = var1.field710 >> 7;
                    if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104 && var1.field667 >= class15.field165[var3][var4]) {
                        if (var1.field667 > class15.field165[var3][var4]) {
                            class15.field165[var3][var4] = var1.field667;
                            class308.field4922[var3][var4] = 1;
                        } else {
                            var10002 = class308.field4922[var3][var4]++;
                        }
                    }
                } else {
                    int var5 = var1.field637 - var2 * 64 >> 7;
                    int var6 = var1.field710 - var2 * 64 >> 7;
                    int var7 = var5 + var1.method279(23397);
                    int var8 = var6 + var1.method279(23397);
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    if (var7 > 104) {
                        var7 = 104;
                    }
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    if (var8 > 104) {
                        var8 = 104;
                    }
                    for (int var9 = var5; var9 < var7; var9++) {
                        for (int var10 = var6; var10 < var8; var10++) {
                            if (var1.field667 > class15.field165[var9][var10]) {
                                class15.field165[var9][var10] = var1.field667;
                                class308.field4922[var9][var10] = 1;
                            } else if (class15.field165[var9][var10] == var1.field667) {
                                var10002 = class308.field4922[var9][var10]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lag;)Lag;")
    public static final class211 method2029(class211 arg0) {
        int var1 = method2015(arg0).method1525((byte) 21);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class17.method87(arg0.field3395, -20055);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method250(byte arg0) {
        field4850++;
        if (class153.field2385 == 1000) {
            return;
        }
        class29.field360++;
        if (class29.field360 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class55.field906 = var2.get(11) * 600 + (var2.get(12) * 10 + (var2.get(13) / 6));
            class243.field3858.setSeed((long) class55.field906);
        }
        this.method2024((byte) -128);
        if (class198.field3191 != null) {
            class198.field3191.method1222(112);
        }
        class281.method1886(arg0 ^ 0xFFFFFFB7);
        class276.method1859((byte) 104);
        class139.method969(-8150);
        class95.method657(-13333);
        if (class193.field3136 != null) {
            int var3 = class193.field3136.method998((byte) 122);
            class206.field3274 = var3;
        }
        if (arg0 != -71) {
            field4845 = null;
        }
        if (class153.field2385 == 0) {
            this.method2030((byte) -126);
            class293.method1953(118);
        } else if (class153.field2385 == 5) {
            this.method2030((byte) -126);
            class293.method1953(120);
        } else if (class153.field2385 == 25 || class153.field2385 == 28) {
            class237.method1606(-1);
        }
        if (class153.field2385 == 10) {
            this.method2031((byte) -77);
            class289.method1927((byte) 118);
            class105.method746(true);
            class134.method946((byte) -2);
        } else if (class153.field2385 == 30) {
            class236.method1598(-98);
        } else if (class153.field2385 == 40) {
            class134.method946((byte) -2);
            if (class311.field4973 != -3) {
                if (class311.field4973 == 15) {
                    class108.method767(12159);
                    return;
                }
                if (class311.field4973 != 2) {
                    class216.method1500(0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
    private final void method2030(byte arg0) {
        field4843++;
        if (!class294.field4713) {
            label241: while (true) {
                do {
                    if (!class224.method1539(3072)) {
                        break label241;
                    }
                } while (class101.field1628 != 's' && class101.field1628 != 'S');
                class294.field4713 = true;
            }
        }
        if (class267.field4302 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class191.method1350((byte) 5);
            if (class212.field3515 == 0L) {
                class212.field3515 = var4;
            }
            if (var3 > 16384 && var4 - class212.field3515 < 5000L) {
                if (var4 - class162.field2583 > 1000L) {
                    System.gc();
                    class162.field2583 = var4;
                }
                class195.field3157 = 5;
                class186.field3032 = class88.field1440;
            } else {
                class195.field3157 = 5;
                class186.field3032 = class178.field2911;
                class267.field4302 = 10;
            }
        } else if (class267.field4302 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class131.field2065[var6] = new class44(104, 104);
            }
            class267.field4302 = 30;
            class186.field3032 = class206.field3281;
            class195.field3157 = 10;
        } else if (class267.field4302 == 30) {
            if (class198.field3191 == null) {
                class198.field3191 = new class168(class90.field1472, class313.field4992);
            }
            if (class198.field3191.method1221((byte) -115)) {
                class256.field4148 = class119.method840(true, true, (byte) -112, 0, false);
                class220.field3602 = class119.method840(true, true, (byte) -125, 1, false);
                class269.field4342 = class119.method840(false, true, (byte) -118, 2, true);
                class234.field3752 = class119.method840(true, true, (byte) 13, 3, false);
                class229.field3690 = class119.method840(true, true, (byte) 109, 4, false);
                class84.field1393 = class119.method840(true, true, (byte) 47, 5, true);
                class50.field852 = class119.method840(true, false, (byte) -124, 6, true);
                class265.field4266 = class119.method840(true, true, (byte) -12, 7, false);
                class160.field2541 = class119.method840(true, true, (byte) 97, 8, false);
                class267.field4303 = class119.method840(true, true, (byte) -15, 9, false);
                class247.field3938 = class119.method840(true, true, (byte) 14, 10, false);
                class216.field3566 = class119.method840(true, true, (byte) 24, 11, false);
                class10.field105 = class119.method840(true, true, (byte) -118, 12, false);
                class72.field1213 = class119.method840(true, true, (byte) -127, 13, false);
                class193.field3145 = class119.method840(true, false, (byte) 67, 14, false);
                class216.field3570 = class119.method840(true, true, (byte) 1, 15, false);
                class223.field3624 = class119.method840(true, true, (byte) -127, 16, false);
                class98.field1579 = class119.method840(true, true, (byte) -121, 17, false);
                class83.field1380 = class119.method840(true, true, (byte) -112, 18, false);
                class44.field727 = class119.method840(true, true, (byte) -116, 19, false);
                class236.field3782 = class119.method840(true, true, (byte) -127, 20, false);
                class189.field3061 = class119.method840(true, true, (byte) -128, 21, false);
                class310.field4962 = class119.method840(true, true, (byte) -125, 22, false);
                class32.field496 = class119.method840(true, true, (byte) -113, 23, true);
                class233.field3735 = class119.method840(true, true, (byte) -126, 24, false);
                class48.field799 = class119.method840(true, true, (byte) 34, 25, false);
                class137.field2171 = class119.method840(true, true, (byte) -113, 26, true);
                class293.field4700 = class119.method840(true, true, (byte) -110, 27, false);
                class241.field3846 = class119.method840(true, true, (byte) 60, 28, true);
                class195.field3157 = 15;
                class267.field4302 = 40;
                class186.field3032 = class168.field2731;
            } else {
                class195.field3157 = 12;
                class186.field3032 = class236.field3799;
            }
        } else if (class267.field4302 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 29; var8++) {
                var7 += class296.field4735[var8].method215(100) * class137.field2178[var8] / 100;
            }
            if (var7 == 100) {
                class195.field3157 = 20;
                class186.field3032 = class62.field1028;
                class22.method127(arg0 ^ 0xFFFFFFF7, class160.field2541);
                class288.method1916(1, class160.field2541);
                class53.method371(75, class160.field2541);
                class267.field4302 = 41;
            } else {
                class195.field3157 = 20;
                if (var7 != 0) {
                    class186.field3032 = class85.field1404 + var7 + "%";
                }
            }
        } else if (class267.field4302 == 41) {
            if (class241.field3846.method1691(arg0 + 126)) {
                this.method2019(-65536, class241.field3846.method1689(1, -108));
                class195.field3157 = 25;
                class267.field4302 = 45;
                class186.field3032 = class29.field359;
            } else {
                class186.field3032 = class212.field3512 + class241.field3846.method1677((byte) -99) + "%";
                class195.field3157 = 25;
            }
        } else if (class267.field4302 == 45) {
            class308.method2059(22050, class247.field3931, (byte) 112, 2);
            class298.field4762 = new class314();
            class298.field4762.method2106(9, 128, 7);
            class233.field3750 = class92.method620(-1, class268.field4323, 22050, class131.field2064, 0);
            class233.field3750.method1926(class298.field4762, (byte) 103);
            class195.method1371(class298.field4762, class216.field3570, arg0 ^ 0xFFFFFFEB, class229.field3690, class193.field3145);
            class62.field1024 = class92.method620(-1, class268.field4323, 2048, class131.field2064, 1);
            class6.field68 = new class235();
            class62.field1024.method1926(class6.field68, (byte) 125);
            class151.field2342 = new class233(22050, class133.field2103);
            class272.field4376 = class50.field852.method1699(arg0 ^ 0xFFFFFF82, "scape main");
            class186.field3032 = class255.field4125;
            class267.field4302 = 50;
            class195.field3157 = 30;
        } else if (class267.field4302 == 50) {
            int var9 = class279.method1876(0, class72.field1213, class160.field2541);
            int var10 = class176.method1290(arg0 ^ 0xFFFFA67A);
            if (var10 > var9) {
                class195.field3157 = 35;
                class186.field3032 = class271.field4357 + var9 * 100 / var10 + "%";
            } else {
                class267.field4302 = 60;
                class186.field3032 = class65.field1093;
                class195.field3157 = 35;
            }
        } else if (class267.field4302 == 60) {
            int var11 = class10.method50(class160.field2541, (byte) -9);
            int var12 = class41.method269(arg0 ^ 0xA);
            if (var12 > var11) {
                class186.field3032 = class133.field2109 + var11 * 100 / var12 + "%";
                class195.field3157 = 40;
            } else {
                class267.field4302 = 65;
                class186.field3032 = class219.field3595;
                class195.field3157 = 40;
            }
        } else if (class267.field4302 == 65) {
            class67.method472(class160.field2541, class72.field1213, arg0 - 1873);
            class186.field3032 = class250.field3954;
            class195.field3157 = 45;
            class262.method1760(5, -59);
            class267.field4302 = 70;
        } else if (class267.field4302 == 70) {
            class269.field4342.method1691(0);
            byte var13 = 0;
            int var14 = var13 + class269.field4342.method1677((byte) -101);
            class223.field3624.method1691(0);
            int var15 = var14 + class223.field3624.method1677((byte) -111);
            class98.field1579.method1691(0);
            int var16 = var15 + class98.field1579.method1677((byte) -123);
            class83.field1380.method1691(arg0 ^ 0xFFFFFF82);
            int var17 = var16 + class83.field1380.method1677((byte) -125);
            class44.field727.method1691(arg0 ^ 0xFFFFFF82);
            int var18 = var17 + class44.field727.method1677((byte) -126);
            class236.field3782.method1691(0);
            int var19 = var18 + class236.field3782.method1677((byte) -121);
            class189.field3061.method1691(0);
            int var20 = var19 + class189.field3061.method1677((byte) -104);
            class310.field4962.method1691(0);
            int var21 = var20 + class310.field4962.method1677((byte) -127);
            class233.field3735.method1691(0);
            int var22 = var21 + class233.field3735.method1677((byte) -114);
            class48.field799.method1691(0);
            int var23 = var22 + class48.field799.method1677((byte) -97);
            class293.field4700.method1691(arg0 + 126);
            int var24 = var23 + class293.field4700.method1677((byte) -98);
            if (var24 < 1100) {
                class195.field3157 = 50;
                class186.field3032 = class68.field1124 + var24 / 11 + "%";
            } else {
                class121.method858(arg0 ^ 0xFFFFFFCD, class269.field4342);
                class261.method1755(class269.field4342, true);
                class30.method164(arg0 + 127, class269.field4342);
                class53.method369(false, class265.field4266, class269.field4342);
                class139.method975((byte) 103, class223.field3624, class265.field4266, true);
                class199.method1388(class83.field1380, true, class265.field4266, 16711680);
                class48.method343(class44.field727, class265.field4266, class238.field3821, 110, true);
                class195.method1370(false, class269.field4342);
                class195.method1367(-18, class256.field4148, class236.field3782, class220.field3602);
                class296.method1965(-125, class269.field4342);
                class192.method1351(class265.field4266, (byte) 125, class189.field3061);
                class64.method450((byte) -100, class310.field4962);
                class163.method1175(class269.field4342, (byte) -52);
                class6.method31(class234.field3752, class72.field1213, 0, class265.field4266, class160.field2541);
                class269.method1808(class269.field4342, 29203);
                class243.method1630(class98.field1579, arg0 ^ 0xFFFFF68C);
                class291.method1942((byte) 121, class48.field799, class233.field3735, new class208());
                class229.method1550(class48.field799, class233.field3735, 0);
                class293.method1952(0, class269.field4342);
                class204.method1429(class269.field4342, (byte) -58);
                class46.method333(class269.field4342, (byte) 40);
                class22.method119(class160.field2541, class269.field4342, arg0 + 23577);
                class243.method1629(class269.field4342, 125, class160.field2541);
                class268.method1799(class269.field4342, arg0 ^ 0xFFFFFF8B, class160.field2541);
                class195.field3157 = 50;
                class186.field3032 = class82.field1365;
                class82.method570((byte) -98);
                class267.field4302 = 80;
            }
        } else if (class267.field4302 == 80) {
            int var25 = class282.method1889(0, class160.field2541);
            int var26 = class6.method34(-107);
            if (var26 > var25) {
                class195.field3157 = 60;
                class186.field3032 = class81.field1344 + var25 * 100 / var26 + "%";
            } else {
                class288.method1917((byte) -48, class160.field2541);
                class267.field4302 = 90;
                class195.field3157 = 60;
                class186.field3032 = class13.field132;
            }
        } else if (class267.field4302 == 90) {
            if (class137.field2171.method1691(0)) {
                class20 var27 = new class20(class267.field4303, class137.field2171, class160.field2541, 20, !class1.field15);
                class302.method2002(var27);
                if (class77.field1289 == 1) {
                    class302.method1999(0.9F);
                }
                if (class77.field1289 == 2) {
                    class302.method1999(0.8F);
                }
                if (class77.field1289 == 3) {
                    class302.method1999(0.7F);
                }
                if (class77.field1289 == 4) {
                    class302.method1999(0.6F);
                }
                class186.field3032 = class132.field2070;
                class267.field4302 = 100;
                class195.field3157 = 70;
            } else {
                class186.field3032 = class53.field891 + class137.field2171.method1677((byte) -106) + "%";
                class195.field3157 = 70;
            }
        } else if (class267.field4302 == 100) {
            if (class281.method1887(class160.field2541, 0)) {
                class267.field4302 = 110;
            }
        } else if (class267.field4302 == 110) {
            class255.field4115 = new class72();
            class268.field4323.method319(10, class255.field4115, (byte) -48);
            class195.field3157 = 75;
            class267.field4302 = 120;
            class186.field3032 = class234.field3777;
        } else if (arg0 == -126) {
            if (class267.field4302 == 120) {
                if (class247.field3938.method1696("huffman", true, "")) {
                    class120 var28 = new class120(class247.field3938.method1683((byte) 46, "huffman", ""));
                    class265.method1784(var28, (byte) -126);
                    class267.field4302 = 130;
                    class195.field3157 = 80;
                    class186.field3032 = class277.field4447;
                } else {
                    class195.field3157 = 80;
                    class186.field3032 = class62.field1021 + "0%";
                }
            } else if (class267.field4302 == 130) {
                if (!class234.field3752.method1691(0)) {
                    class186.field3032 = class53.field897 + class234.field3752.method1677((byte) -118) * 3 / 4 + "%";
                    class195.field3157 = 85;
                } else if (!class10.field105.method1691(0)) {
                    class186.field3032 = class53.field897 + (class10.field105.method1677((byte) -106) / 10 + 75) + "%";
                    class195.field3157 = 85;
                } else if (!class72.field1213.method1691(0)) {
                    class186.field3032 = class53.field897 + (class72.field1213.method1677((byte) -101) / 20 + 85) + "%";
                    class195.field3157 = 85;
                } else if (class32.field496.method1695("details", -31451)) {
                    class275.method1852(class32.field496);
                    class171.method1236(class293.field4700);
                    class21.method114(class265.field4266);
                    class267.field4302 = 135;
                    class186.field3032 = class90.field1469;
                    class195.field3157 = 95;
                } else {
                    class186.field3032 = class53.field897 + (class32.field496.method1668((byte) -59, "details") / 10 + 90) + "%";
                    class195.field3157 = 85;
                }
            } else if (class267.field4302 == 135) {
                int var29 = class152.method1043(arg0 ^ 0x66B5);
                if (var29 == -1) {
                    class195.field3157 = 95;
                    class186.field3032 = class161.field2560;
                } else if (var29 == 7 || var29 == 9) {
                    this.method253(arg0 ^ 0xFFFFFFC2, "worldlistfull");
                    class262.method1760(1000, -68);
                } else if (class111.field1754) {
                    class267.field4302 = 140;
                    class195.field3157 = 96;
                    class186.field3032 = class170.field2771;
                } else {
                    this.method253(arg0 + 190, "worldlistio_" + var29);
                    class262.method1760(1000, arg0 ^ 0x34);
                }
            } else if (class267.field4302 == 140) {
                class296.field4722 = class234.field3752.method1699(0, "loginscreen");
                class84.field1393.method1673(true, arg0 + 44, false);
                class50.field852.method1673(true, arg0 ^ 0x7, true);
                class160.field2541.method1673(true, -76, true);
                class72.field1213.method1673(true, -47, true);
                class247.field3938.method1673(true, -37, true);
                class234.field3752.method1673(true, -26, true);
                class212.field3516 = true;
                class186.field3032 = class234.field3775;
                class267.field4302 = 150;
                class195.field3157 = 97;
            } else if (class267.field4302 == 150) {
                if (class294.field4713) {
                    class206.field3282 = 0;
                    class265.field4273 = 0;
                    class229.field3704 = 0;
                    class312.field4979 = 0;
                }
                class294.field4713 = true;
                class56.method385(115, class268.field4323);
                class41.method268(class229.field3704, -1, false, -27825, -1);
                class267.field4302 = 160;
                class186.field3032 = class185.field3025;
                class195.field3157 = 100;
            } else if (class267.field4302 == 160) {
                class241.method1620(true, 9083);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
    private final void method2031(byte arg0) {
        field4842++;
        for (class165.field2653 = 0; class224.method1539(arg0 + 3149) && class165.field2653 < 128; class165.field2653++) {
            class309.field4939[class165.field2653] = class265.field4272;
            class132.field2074[class165.field2653] = class101.field1628;
        }
        class223.field3630++;
        if (class22.field284 != -1) {
            class115.method802(class294.field4709, 0, 0, 0, class22.field284, 0, (byte) -19, class310.field4964);
        }
        class74.field1237++;
        if (arg0 != -77) {
            method2021();
        }
        if (class299.field4792 == 0) {
            class262.method1761((byte) -119);
        } else if (class162.field2612 == 0 && class176.field2873 == 0) {
            if (class120.field1919 == 2) {
                class152.method1042(-14769);
            } else {
                class39.method247(10);
            }
            if ((class148.field2314 >> 7) < 14 || (class148.field2314 >> 7) >= 90 || class104.field1666 >> 7 < 14 || class104.field1666 >> 7 >= 90) {
                class218.method1510((byte) 125);
            }
        }
        while (true) {
            class126 var2;
            class211 var3;
            class211 var4;
            do {
                var2 = (class126) class291.field4675.method1651((byte) 122);
                if (var2 == null) {
                    while (true) {
                        class126 var5;
                        class211 var6;
                        class211 var7;
                        do {
                            var5 = (class126) class204.field3254.method1651((byte) 123);
                            if (var5 == null) {
                                while (true) {
                                    class126 var8;
                                    class211 var9;
                                    class211 var10;
                                    do {
                                        var8 = (class126) class288.field4611.method1651((byte) 126);
                                        if (var8 == null) {
                                            if (field4857 != null) {
                                                class257.method1731(true);
                                            }
                                            if (class285.field4527 != null && class285.field4527.field2814 == 1) {
                                                if (class285.field4527.field2817 != null) {
                                                    class95.method653(class146.field2311, arg0 + 357801201, class281.field4494);
                                                }
                                                class285.field4527 = null;
                                                class281.field4494 = null;
                                                class146.field2311 = false;
                                            }
                                            if (class29.field360 % 1500 == 0) {
                                                class139.method976(-11901);
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field2000;
                                        if (var9.field3413 < 0) {
                                            break;
                                        }
                                        var10 = class17.method87(var9.field3395, -20055);
                                    } while (var10 == null || var10.field3352 == null || var10.field3352.length <= var9.field3413 || var10.field3352[var9.field3413] != var9);
                                    class137.method960(200000, var8);
                                }
                            }
                            var6 = var5.field2000;
                            if (var6.field3413 < 0) {
                                break;
                            }
                            var7 = class17.method87(var6.field3395, arg0 ^ 0x4E1A);
                        } while (var7 == null || var7.field3352 == null || var7.field3352.length <= var6.field3413 || var7.field3352[var6.field3413] != var6);
                        class137.method960(200000, var5);
                    }
                }
                var3 = var2.field2000;
                if (var3.field3413 < 0) {
                    break;
                }
                var4 = class17.method87(var3.field3395, -20055);
            } while (var4 == null || var4.field3352 == null || var3.field3413 >= var4.field3352.length || var4.field3352[var3.field3413] != var3);
            class137.method960(arg0 ^ 0xFFFCF2F3, var2);
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field4853[var1] = var0 / 4;
        }
    }
}
