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
public class client extends class168 {

    @OriginalMember(owner = "client!client", name = "O", descriptor = "Ljava/lang/String;")
    public static String field4536 = null;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field4545 = -1;

    @OriginalMember(owner = "client!client", name = "N", descriptor = "Ljava/lang/String;")
    public static String field4535 = "Loaded textures";

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "Li;")
    public static class112 field4546 = new class112(16);

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "Z")
    public static boolean field4554;

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    private final void method1914(boolean arg0) {
        field4548++;
        boolean var2 = class91.field1610.method319(1);
        if (!var2) {
            this.method1923(-119);
        }
        if (!arg0) {
            this.method1137(-90);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method1130(int arg0) {
        if (class243.field3990 != null) {
            class243.field3990.field3632 = false;
        }
        field4552++;
        class243.field3990 = null;
        if (class194.field3131 != null) {
            class194.field3131.method1380(true);
            class194.field3131 = null;
        }
        class111.method772((byte) -72, class118.field2099);
        class134.method934(-124, class118.field2099);
        if (class101.field1723 != null) {
            class101.field1723.method46(class118.field2099, -95);
        }
        class231.method1542((byte) 10);
        class256.method1691((byte) 4);
        class101.field1723 = null;
        if (class154.field2576 != null) {
            class154.field2576.method1710(0);
        }
        if (arg0 != -6) {
            return;
        }
        if (class259.field4243 != null) {
            class259.field4243.method1710(0);
        }
        class91.field1610.method313(1957862288);
        class26.field392.method593(arg0 - 10184);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method1136(byte arg0) {
        field4539++;
        class286.method1911(true);
        class26.field392 = new class92();
        class91.field1610 = new class51();
        if (class149.field2511 != 0) {
            class21.field335 = new byte[50][];
        }
        class61.method387(class127.field2238, 3);
        if (class225.field3780 == 0) {
            class80.field1382 = this.getCodeBase().getHost();
            class83.field1504 = 443;
            class56.field978 = 43594;
        } else if (class225.field3780 == 1) {
            class80.field1382 = this.getCodeBase().getHost();
            class56.field978 = class273.field4385 + 40000;
            class83.field1504 = class273.field4385 + 50000;
        } else if (class225.field3780 == 2) {
            class56.field978 = class273.field4385 + 40000;
            class80.field1382 = "127.0.0.1";
            class83.field1504 = class273.field4385 + 50000;
        }
        class153.field2556 = class56.field978;
        class21.field331 = class80.field1382;
        if (class131.field2288 == 3 && class225.field3780 != 2) {
            class146.field2489 = class273.field4385;
        }
        class248.field4059 = class162.field2686 = class261.field4262 = class182.field2974 = new short[256];
        if (class185.field3002 == 1) {
            class119.field2117 = true;
            class215.field3630 = class41.field616;
            class84.field1527 = class56.field979;
            class30.field452 = class291.field4654;
            class228.field3845 = class78.field1338;
        } else {
            class228.field3845 = class144.field2467;
            class84.field1527 = class49.field846;
            class215.field3630 = class63.field1094;
            class30.field452 = class186.field3016;
        }
        class262.field4277 = class56.field978;
        class267.field4323 = class83.field1504;
        class4.field47 = class153.field2556;
        class176.method1173((byte) 119);
        class255.method1686((byte) -55, class118.field2099);
        class6.method32(-11, class118.field2099);
        class101.field1723 = class167.method1119(6);
        if (class101.field1723 != null) {
            class101.field1723.method39(class118.field2099, (byte) -57);
        }
        class4.field57 = class131.field2288;
        try {
            if (class127.field2238.field2281 != null) {
                class9.field100 = new class196(class127.field2238.field2281, 5200, 0);
                for (int var2 = 0; var2 < 29; var2++) {
                    class192.field3100[var2] = new class196(class127.field2238.field2296[var2], 6000, 0);
                }
                class267.field4316 = new class196(class127.field2238.field2287, 6000, 0);
                class194.field3136 = new class126(255, class9.field100, class267.field4316, 500000);
                class126.field2213 = new class196(class127.field2238.field2289, 24, 0);
                class127.field2238.field2287 = null;
                class127.field2238.field2296 = null;
                class127.field2238.field2281 = null;
                class127.field2238.field2289 = null;
            }
            int var3 = 69 % ((77 - arg0) / 39);
        } catch (IOException var4) {
            class9.field100 = null;
            class194.field3136 = null;
            class267.field4316 = null;
            class126.field2213 = null;
        }
        class241.field3968 = class105.field1862;
        if (class225.field3780 != 0) {
            class105.field1886 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ldl;)Ldl;")
    public static final class46 method1915(class46 arg0) {
        int var1 = method1922(arg0).method1251(0);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class108.method760(-29533, arg0.field660);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
    private final void method1916(int arg0, byte arg1) {
        class234.field3882 = 0;
        field4543++;
        class91.field1610.field902++;
        class91.field1610.field904 = arg0;
        class37.field552 = null;
        if (arg1 < 51) {
            this.method1137(-105);
        }
        class211.field3559 = null;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public static void method1917(byte arg0) {
        field4535 = null;
        int var1 = 38 / ((-arg0 - 57) / 61);
        field4536 = null;
        field4546 = null;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method1131(int arg0) {
        field4544++;
        if (class59.field1026 == 1000) {
            return;
        }
        long var2 = class3.method15((byte) 56) / 1000000L - class45.field633;
        class45.field633 = class3.method15((byte) 100) / 1000000L;
        boolean var4 = class136.method951(-7713);
        if (var4 && class175.field2874 && class154.field2576 != null) {
            class154.field2576.method1708((byte) 127);
        }
        if (arg0 != 2) {
            field4546 = null;
        }
        if ((class59.field1026 == 30 || class59.field1026 == 10) && (class107.field1911 || class58.field1023 != 0L && class58.field1023 < class232.method1544((byte) -116))) {
            class39.method262((byte) -20, class107.field1911, class77.field1245, class87.field1560, class85.method557(false));
        }
        if (class85.field1534 == null) {
            Container var5;
            if (class85.field1534 != null) {
                var5 = class85.field1534;
            } else if (class270.field4349 == null) {
                var5 = class127.field2238.field2294;
            } else {
                var5 = class270.field4349;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class270.field4349 == var5) {
                Insets var8 = class270.field4349.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.left + var8.right;
            }
            if (class132.field2302 != var6 || class42.field623 != var7) {
                if (class131.field2291.startsWith("mac")) {
                    class132.field2302 = var6;
                    class42.field623 = var7;
                } else {
                    class286.method1911(true);
                }
                class58.field1023 = class232.method1544((byte) -126) + 500L;
            }
        }
        boolean var9 = false;
        if (class229.field3857) {
            class229.field3857 = false;
            var9 = true;
        }
        if (var9) {
            class206.method1362(13);
        }
        if (class59.field1026 == 0) {
            class190.method1246(var9, class83.field1507, 95, (Color) null, class272.field4372);
        } else if (class59.field1026 == 5) {
            class269.method1768(false, class290.field4636, false);
        } else if (class59.field1026 == 10) {
            class66.method412(0);
        } else if (class59.field1026 == 25 || class59.field1026 == 28) {
            if (class122.field2148 == 1) {
                if (class119.field2112 < class165.field2708) {
                    class119.field2112 = class165.field2708;
                }
                int var10 = (class119.field2112 - class165.field2708) * 50 / class119.field2112;
                class229.method1539(0, false, class261.field4257 + "<br>(" + var10 + "%)");
            } else if (class122.field2148 == 2) {
                if (class33.field483 > class82.field1492) {
                    class82.field1492 = class33.field483;
                }
                int var11 = (class82.field1492 - class33.field483) * 50 / class82.field1492 + 50;
                class229.method1539(0, false, class261.field4257 + "<br>(" + var11 + "%)");
            } else {
                class229.method1539(0, false, class261.field4257);
            }
        } else if (class59.field1026 == 30) {
            class212.method1418(var2, true);
        } else if (class59.field1026 == 40) {
            class229.method1539(0, false, class189.field3070 + "<br>" + class176.field2897);
        }
        if ((class59.field1026 == 30 || class59.field1026 == 10) && class161.field2674 == 0 && !var9) {
            try {
                Graphics var14 = class118.field2099.getGraphics();
                for (int var15 = 0; var15 < class140.field2406; var15++) {
                    if (class239.field3937[var15]) {
                        class240.field3944.method184(class88.field1575[var15], class176.field2884[var15], class23.field364[var15], (byte) 102, var14, class223.field3754[var15]);
                        class239.field3937[var15] = false;
                    }
                }
            } catch (Exception var16) {
                class118.field2099.repaint();
            }
        } else if (class59.field1026 != 0) {
            try {
                Graphics var12 = class118.field2099.getGraphics();
                class240.field3944.method187(0, var12, arg0 - 125, 0);
                for (int var13 = 0; var13 < class140.field2406; var13++) {
                    class239.field3937[var13] = false;
                }
            } catch (Exception var17) {
                class118.field2099.repaint();
            }
        }
        if (class50.field852) {
            class134.method927(124);
        }
        if (class165.field2711 && class59.field1026 == 10 && field4545 != -1) {
            class165.field2711 = false;
            class28.method185(class127.field2238, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)V")
    private final void method1918(int arg0, byte[] arg1) {
        if (arg0 < 28) {
            this.method1138((byte) -121);
        }
        class101 var3 = new class101(arg1);
        field4538++;
        while (true) {
            int var4 = var3.method669((byte) 36);
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                var3.method677(false);
                var3.method677(false);
                var3.method677(false);
                var3.method677(false);
                var3.method677(false);
                var3.method677(false);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ldl;)Z")
    public static final boolean method1919(class46 arg0) {
        if (class285.field4510) {
            if (method1922(arg0).field3096 != 0) {
                return false;
            }
            if (arg0.field812 == 0) {
                return false;
            }
        }
        return arg0.field726;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Ldl;IIIIIII)V")
    public static final void method1920(class46[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class46 var9 = arg0[var8];
            if (var9 != null && var9.field660 == arg1 && (!var9.field734 || var9.field812 == 0 || var9.field697 || method1922(var9).field3096 != 0 || class187.field3030 == var9 || var9.field777 == 1338) && (!var9.field734 || !method1919(var9))) {
                int var10 = var9.field758 + arg6;
                int var11 = var9.field806 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field812 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field701 + var10;
                    int var17 = var9.field715 + var11;
                    if (var9.field812 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class6.field76 == var9) {
                    class290.field4630 = true;
                    class229.field3861 = var10;
                    class215.field3633 = var11;
                }
                if (!var9.field734 || var12 < var14 && var13 < var15) {
                    if (var9.field812 == 0) {
                        if (!var9.field734 && method1919(var9) && class201.field3304 != var9) {
                            continue;
                        }
                        if (var9.field652 && class48.field839 >= var12 && class256.field4182 >= var13 && class48.field839 < var14 && class256.field4182 < var15) {
                            for (class198 var18 = (class198) class28.field426.method379(6347); var18 != null; var18 = (class198) class28.field426.method378(-60)) {
                                if (var18.field3203) {
                                    var18.method547(10026);
                                    var18.field3205.field695 = false;
                                }
                            }
                            if (class156.field2616 == 0) {
                                class6.field76 = null;
                                class187.field3030 = null;
                            }
                            class83.field1512 = 0;
                        }
                    }
                    if (var9.field734) {
                        boolean var19;
                        if (class48.field839 >= var12 && class256.field4182 >= var13 && class48.field839 < var14 && class256.field4182 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class69.field1131 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class100.field1717 == 1 && class115.field2069 >= var12 && class160.field2668 >= var13 && class115.field2069 < var14 && class160.field2668 < var15) {
                            var21 = true;
                        }
                        if (var9.field750 != null) {
                            for (int var22 = 0; var22 < var9.field750.length; var22++) {
                                if (class12.field169[var9.field750[var22]]) {
                                    if (var9.field681 == null || class266.field4301 >= var9.field681[var22]) {
                                        byte var23 = var9.field761[var22];
                                        if (var23 == 0 || ((var23 & 0x8) == 0 || !class12.field169[86] && !class12.field169[82] && !class12.field169[81]) && ((var23 & 0x2) == 0 || class12.field169[86]) && ((var23 & 0x1) == 0 || class12.field169[82]) && ((var23 & 0x4) == 0 || class12.field169[81])) {
                                            class133.method922(var9.field786, -1, var22 + 1, -3, "");
                                            int var24 = var9.field797[var22];
                                            if (var9.field681 == null) {
                                                var9.field681 = new int[var9.field750.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field681[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field681[var22] = class266.field4301 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field681 != null) {
                                    var9.field681[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class42.method274(var9, class115.field2069 - var10, 0, class160.field2668 - var11);
                        }
                        if (class6.field76 != null && class6.field76 != var9 && var19 && method1922(var9).method1263(-475686027)) {
                            class198.field3206 = var9;
                        }
                        if (class187.field3030 == var9) {
                            class30.field449 = true;
                            class236.field3892 = var10;
                            class6.field70 = var11;
                        }
                        if (var9.field697 || var9.field777 != 0) {
                            if (var19 && class25.field387 != 0 && var9.field710 != null) {
                                class198 var25 = new class198();
                                var25.field3203 = true;
                                var25.field3205 = var9;
                                var25.field3190 = class25.field387;
                                var25.field3204 = var9.field710;
                                class28.field426.method374(-1, var25);
                            }
                            if (class6.field76 != null || class75.field1231 != null || class248.field4074 || var9.field777 != 1400 && class83.field1512 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field777 != 0) {
                                if (var9.field777 == 1337) {
                                    class215.field3624 = var9;
                                    continue;
                                }
                                if (var9.field777 == 1338) {
                                    if (var21) {
                                        class262.field4274 = class115.field2069 - var10;
                                        class177.field2924 = class160.field2668 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field777 == 1400) {
                                    class162.field2689 = var9;
                                    if (var21) {
                                        if (class12.field169[82] && class204.field3343 > 0) {
                                            int var26 = (int) ((double) (class115.field2069 - var10 - var9.field701 / 2) * 2.0D / (double) class116.field2077);
                                            int var27 = (int) ((double) (class160.field2668 - var11 - var9.field715 / 2) * 2.0D / (double) class116.field2077);
                                            int var28 = class294.field4681 + var26;
                                            int var29 = class213.field3583 + var27;
                                            int var30 = class124.field2184 + var28;
                                            int var31 = class83.field1514 + class193.field3114 - var29 - 1;
                                            class39 var32 = class220.method1458((byte) 121);
                                            int[] var33 = var32.method261((byte) 106, var31, var30);
                                            if (var33 != null) {
                                                class88.method575(var33[0], var33[2], -9225, var33[1]);
                                                class291.method1969(0);
                                            }
                                            continue;
                                        }
                                        class83.field1512 = 1;
                                        class26.field394 = class48.field839;
                                        class290.field4622 = class256.field4182;
                                        continue;
                                    }
                                    if (var20 && class83.field1512 > 0) {
                                        if (class83.field1512 == 1 && (class48.field839 != class26.field394 || class290.field4622 != class256.field4182)) {
                                            class23.field341 = class294.field4681;
                                            class193.field3117 = class213.field3583;
                                            class83.field1512 = 2;
                                        }
                                        if (class83.field1512 == 2) {
                                            class111.method773(-101, (int) ((double) (class26.field394 - class48.field839) * 2.0D / (double) class151.field2534) + class23.field341);
                                            class88.method573(-106, (int) ((double) (class290.field4622 - class256.field4182) * 2.0D / (double) class151.field2534) + class193.field3117);
                                        }
                                        continue;
                                    }
                                    class83.field1512 = 0;
                                    continue;
                                }
                                if (var9.field777 == 1401) {
                                    if (var20) {
                                        class3.method17(class256.field4182 - var11, var9.field715, var9.field701, class48.field839 - var10, true);
                                    }
                                    continue;
                                }
                                if (var9.field777 == 1402) {
                                    class79.method516(-373, var9);
                                    continue;
                                }
                            }
                            if (!var9.field815 && var21) {
                                var9.field815 = true;
                                if (var9.field684 != null) {
                                    class198 var34 = new class198();
                                    var34.field3203 = true;
                                    var34.field3205 = var9;
                                    var34.field3195 = class115.field2069 - var10;
                                    var34.field3190 = class160.field2668 - var11;
                                    var34.field3204 = var9.field684;
                                    class28.field426.method374(-1, var34);
                                }
                            }
                            if (var9.field815 && var20 && var9.field773 != null) {
                                class198 var35 = new class198();
                                var35.field3203 = true;
                                var35.field3205 = var9;
                                var35.field3195 = class48.field839 - var10;
                                var35.field3190 = class256.field4182 - var11;
                                var35.field3204 = var9.field773;
                                class28.field426.method374(-1, var35);
                            }
                            if (var9.field815 && !var20) {
                                var9.field815 = false;
                                if (var9.field676 != null) {
                                    class198 var36 = new class198();
                                    var36.field3203 = true;
                                    var36.field3205 = var9;
                                    var36.field3195 = class48.field839 - var10;
                                    var36.field3190 = class256.field4182 - var11;
                                    var36.field3204 = var9.field676;
                                    class9.field103.method374(-1, var36);
                                }
                            }
                            if (var20 && var9.field757 != null) {
                                class198 var37 = new class198();
                                var37.field3203 = true;
                                var37.field3205 = var9;
                                var37.field3195 = class48.field839 - var10;
                                var37.field3190 = class256.field4182 - var11;
                                var37.field3204 = var9.field757;
                                class28.field426.method374(-1, var37);
                            }
                            if (!var9.field695 && var19) {
                                var9.field695 = true;
                                if (var9.field716 != null) {
                                    class198 var38 = new class198();
                                    var38.field3203 = true;
                                    var38.field3205 = var9;
                                    var38.field3195 = class48.field839 - var10;
                                    var38.field3190 = class256.field4182 - var11;
                                    var38.field3204 = var9.field716;
                                    class28.field426.method374(-1, var38);
                                }
                            }
                            if (var9.field695 && var19 && var9.field669 != null) {
                                class198 var39 = new class198();
                                var39.field3203 = true;
                                var39.field3205 = var9;
                                var39.field3195 = class48.field839 - var10;
                                var39.field3190 = class256.field4182 - var11;
                                var39.field3204 = var9.field669;
                                class28.field426.method374(-1, var39);
                            }
                            if (var9.field695 && !var19) {
                                var9.field695 = false;
                                if (var9.field792 != null) {
                                    class198 var40 = new class198();
                                    var40.field3203 = true;
                                    var40.field3205 = var9;
                                    var40.field3195 = class48.field839 - var10;
                                    var40.field3190 = class256.field4182 - var11;
                                    var40.field3204 = var9.field792;
                                    class9.field103.method374(-1, var40);
                                }
                            }
                            if (var9.field735 != null) {
                                class198 var41 = new class198();
                                var41.field3205 = var9;
                                var41.field3204 = var9.field735;
                                class181.field2966.method374(-1, var41);
                            }
                            if (var9.field754 != null && class258.field4212 > var9.field809) {
                                if (var9.field751 == null || class258.field4212 - var9.field809 > 32) {
                                    class198 var46 = new class198();
                                    var46.field3205 = var9;
                                    var46.field3204 = var9.field754;
                                    class28.field426.method374(-1, var46);
                                } else {
                                    label572: for (int var42 = var9.field809; var42 < class258.field4212; var42++) {
                                        int var43 = class151.field2531[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field751.length; var44++) {
                                            if (var9.field751[var44] == var43) {
                                                class198 var45 = new class198();
                                                var45.field3205 = var9;
                                                var45.field3204 = var9.field754;
                                                class28.field426.method374(-1, var45);
                                                break label572;
                                            }
                                        }
                                    }
                                }
                                var9.field809 = class258.field4212;
                            }
                            if (var9.field784 != null && class223.field3755 > var9.field817) {
                                if (var9.field764 == null || class223.field3755 - var9.field817 > 32) {
                                    class198 var51 = new class198();
                                    var51.field3205 = var9;
                                    var51.field3204 = var9.field784;
                                    class28.field426.method374(-1, var51);
                                } else {
                                    label548: for (int var47 = var9.field817; var47 < class223.field3755; var47++) {
                                        int var48 = class175.field2878[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field764.length; var49++) {
                                            if (var9.field764[var49] == var48) {
                                                class198 var50 = new class198();
                                                var50.field3205 = var9;
                                                var50.field3204 = var9.field784;
                                                class28.field426.method374(-1, var50);
                                                break label548;
                                            }
                                        }
                                    }
                                }
                                var9.field817 = class223.field3755;
                            }
                            if (var9.field682 != null && class98.field1690 > var9.field793) {
                                if (var9.field801 == null || class98.field1690 - var9.field793 > 32) {
                                    class198 var56 = new class198();
                                    var56.field3205 = var9;
                                    var56.field3204 = var9.field682;
                                    class28.field426.method374(-1, var56);
                                } else {
                                    label524: for (int var52 = var9.field793; var52 < class98.field1690; var52++) {
                                        int var53 = class194.field3138[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field801.length; var54++) {
                                            if (var9.field801[var54] == var53) {
                                                class198 var55 = new class198();
                                                var55.field3205 = var9;
                                                var55.field3204 = var9.field682;
                                                class28.field426.method374(-1, var55);
                                                break label524;
                                            }
                                        }
                                    }
                                }
                                var9.field793 = class98.field1690;
                            }
                            if (var9.field800 != null && class136.field2386 > var9.field752) {
                                if (var9.field738 == null || class136.field2386 - var9.field752 > 32) {
                                    class198 var61 = new class198();
                                    var61.field3205 = var9;
                                    var61.field3204 = var9.field800;
                                    class28.field426.method374(-1, var61);
                                } else {
                                    label500: for (int var57 = var9.field752; var57 < class136.field2386; var57++) {
                                        int var58 = class225.field3787[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field738.length; var59++) {
                                            if (var9.field738[var59] == var58) {
                                                class198 var60 = new class198();
                                                var60.field3205 = var9;
                                                var60.field3204 = var9.field800;
                                                class28.field426.method374(-1, var60);
                                                break label500;
                                            }
                                        }
                                    }
                                }
                                var9.field752 = class136.field2386;
                            }
                            if (var9.field686 != null && class118.field2100 > var9.field790) {
                                if (var9.field772 == null || class118.field2100 - var9.field790 > 32) {
                                    class198 var66 = new class198();
                                    var66.field3205 = var9;
                                    var66.field3204 = var9.field686;
                                    class28.field426.method374(-1, var66);
                                } else {
                                    label476: for (int var62 = var9.field790; var62 < class118.field2100; var62++) {
                                        int var63 = class292.field4670[var62 & 0x1F];
                                        for (int var64 = 0; var64 < var9.field772.length; var64++) {
                                            if (var9.field772[var64] == var63) {
                                                class198 var65 = new class198();
                                                var65.field3205 = var9;
                                                var65.field3204 = var9.field686;
                                                class28.field426.method374(-1, var65);
                                                break label476;
                                            }
                                        }
                                    }
                                }
                                var9.field790 = class118.field2100;
                            }
                            if (class133.field2312 > var9.field702 && var9.field664 != null) {
                                class198 var67 = new class198();
                                var67.field3205 = var9;
                                var67.field3204 = var9.field664;
                                class28.field426.method374(-1, var67);
                            }
                            if (class63.field1093 > var9.field702 && var9.field657 != null) {
                                class198 var68 = new class198();
                                var68.field3205 = var9;
                                var68.field3204 = var9.field657;
                                class28.field426.method374(-1, var68);
                            }
                            if (class240.field3939 > var9.field702 && var9.field700 != null) {
                                class198 var69 = new class198();
                                var69.field3205 = var9;
                                var69.field3204 = var9.field700;
                                class28.field426.method374(-1, var69);
                            }
                            if (class26.field397 > var9.field702 && var9.field798 != null) {
                                class198 var70 = new class198();
                                var70.field3205 = var9;
                                var70.field3204 = var9.field798;
                                class28.field426.method374(-1, var70);
                            }
                            if (class171.field2816 > var9.field702 && var9.field646 != null) {
                                class198 var71 = new class198();
                                var71.field3205 = var9;
                                var71.field3204 = var9.field646;
                                class28.field426.method374(-1, var71);
                            }
                            var9.field702 = class222.field3746;
                            if (var9.field658 != null) {
                                for (int var72 = 0; var72 < class173.field2837; var72++) {
                                    class198 var73 = new class198();
                                    var73.field3205 = var9;
                                    var73.field3201 = class222.field3745[var72];
                                    var73.field3194 = class152.field2546[var72];
                                    var73.field3204 = var9.field658;
                                    class28.field426.method374(-1, var73);
                                }
                            }
                            if (class229.field3863 && var9.field814 != null) {
                                class198 var74 = new class198();
                                var74.field3205 = var9;
                                var74.field3204 = var9.field814;
                                class28.field426.method374(-1, var74);
                            }
                        }
                    }
                    if (!var9.field734 && class6.field76 == null && class75.field1231 == null && !class248.field4074) {
                        if ((var9.field647 >= 0 || var9.field693 != 0) && class48.field839 >= var12 && class256.field4182 >= var13 && class48.field839 < var14 && class256.field4182 < var15) {
                            if (var9.field647 >= 0) {
                                class201.field3304 = arg0[var9.field647];
                            } else {
                                class201.field3304 = var9;
                            }
                        }
                        if (var9.field812 == 8 && class48.field839 >= var12 && class256.field4182 >= var13 && class48.field839 < var14 && class256.field4182 < var15) {
                            class79.field1359 = var9;
                        }
                        if (var9.field666 > var9.field715) {
                            class184.method1208(var9.field666, var11, class48.field839, var9.field715, var9, var9.field701 + var10, false, class256.field4182);
                        }
                    }
                    if (var9.field812 == 0) {
                        method1920(arg0, var9.field786, var12, var13, var14, var15, var10 - var9.field733, var11 - var9.field644);
                        if (var9.field785 != null) {
                            method1920(var9.field785, var9.field786, var12, var13, var14, var15, var10 - var9.field733, var11 - var9.field644);
                        }
                        class194 var75 = (class194) class41.field607.method779(-109, (long) var9.field786);
                        if (var75 != null) {
                            class275.method1804(var13, var10, var15, 118, var11, var12, var75.field3128, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ILvh;)Lai;")
    public static final class195 method1921(String arg0, int arg1, class108 arg2) {
        int var3 = arg2.method749(arg0, 1);
        field4540++;
        if (var3 == -1) {
            return new class195(0);
        }
        int[] var4 = arg2.method743(var3, 5064);
        class195 var5 = new class195(var4.length);
        for (int var6 = arg1; var6 < var5.field3158; var6++) {
            class101 var7 = new class101(arg2.method746(var4[var6], (byte) -128, var3));
            var5.field3152[var6] = var7.method662((byte) 1);
            var5.field3146[var6] = var7.method646(-79);
            var5.field3149[var6] = var7.method655((byte) 75);
            var5.field3142[var6] = var7.method655((byte) 64);
        }
        return var5;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Ldl;)Lpi;")
    public static final class192 method1922(class46 arg0) {
        class192 var1 = (class192) class157.field2621.method779(-80, ((long) arg0.field786 << 32) + (long) arg0.field704);
        return var1 == null ? arg0.field796 : var1;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field4549++;
        try {
            if (arg0.length != 4) {
                class17.method91("argument count", 87);
            }
            class273.field4385 = Integer.parseInt(arg0[0]);
            class225.field3780 = 2;
            if (arg0[1].equals("live")) {
                class149.field2511 = 0;
            } else if (arg0[1].equals("rc")) {
                class149.field2511 = 1;
            } else if (arg0[1].equals("wip")) {
                class149.field2511 = 2;
            } else {
                class17.method91("modewhat", 109);
            }
            class210.field3553 = false;
            class212.field3568 = class85.method559(-1, arg0[2]);
            if (class212.field3568 == -1) {
                if (arg0[2].equals("english")) {
                    class212.field3568 = 0;
                } else if (arg0[2].equals("german")) {
                    class212.field3568 = 1;
                } else {
                    class17.method91("language", 109);
                }
            }
            class281.method1830(79, class212.field3568);
            class11.field165 = false;
            class169.field2794 = false;
            if (arg0[3].equals("game0")) {
                class185.field3002 = 0;
            } else if (arg0[3].equals("game1")) {
                class185.field3002 = 1;
            } else {
                class17.method91("game", 120);
            }
            class107.field1910 = 0;
            class66.field1105 = false;
            class204.field3339 = "";
            class191.field3090 = 0;
            client var1 = new client();
            class159.field2663 = var1;
            var1.method1141(false, class149.field2511 + 32, "runescape", 768, 539, 29, 1024, false);
            class270.field4349.setLocation(40, 40);
        } catch (Exception var3) {
            class254.method1684(126, var3, (String) null);
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method1923(int arg0) {
        field4542++;
        if (class90.field1596 < class91.field1610.field902) {
            if (class4.field47 == class262.field4277) {
                class4.field47 = class267.field4323;
            } else {
                class4.field47 = class262.field4277;
            }
            class6.field65 = (class91.field1610.field902 - 1) * 50 * 5;
            if (class6.field65 > 3000) {
                class6.field65 = 3000;
            }
            if (class91.field1610.field902 >= 2 && class91.field1610.field904 == 6) {
                this.method1127((byte) 104, "js5connect_outofdate");
                class59.field1026 = 1000;
                return;
            }
            if (class91.field1610.field902 >= 4 && class91.field1610.field904 == -1) {
                this.method1127((byte) 104, "js5crc");
                class59.field1026 = 1000;
                return;
            }
            if (class91.field1610.field902 >= 4 && (class59.field1026 == 0 || class59.field1026 == 5)) {
                if (class91.field1610.field904 == 7 || class91.field1610.field904 == 9) {
                    this.method1127((byte) 104, "js5connect_full");
                } else if (class91.field1610.field904 <= 0) {
                    this.method1127((byte) 104, "js5io");
                } else {
                    this.method1127((byte) 104, "js5connect");
                }
                class59.field1026 = 1000;
                return;
            }
        }
        class90.field1596 = class91.field1610.field902;
        if (class6.field65 > 0) {
            class6.field65--;
            return;
        }
        try {
            if (class234.field3882 == 0) {
                class211.field3559 = class127.field2238.method910((byte) 118, class21.field331, class4.field47);
                class234.field3882++;
            }
            if (class234.field3882 == 1) {
                if (class211.field3559.field2857 == 2) {
                    this.method1916(1000, (byte) 94);
                    return;
                }
                if (class211.field3559.field2857 == 1) {
                    class234.field3882++;
                }
            }
            if (arg0 > -56) {
                field4535 = null;
            }
            if (class234.field3882 == 2) {
                class37.field552 = new class207((Socket) class211.field3559.field2859, class127.field2238);
                class101 var2 = new class101(5);
                var2.method682(15, 22555);
                var2.method698(106, 539);
                class37.field552.method1382(var2.field1730, 5, 0, (byte) -50);
                class234.field3882++;
                class97.field1663 = class232.method1544((byte) -102);
            }
            if (class234.field3882 == 3) {
                if (class59.field1026 == 0 || class59.field1026 == 5 || class37.field552.method1386(true) > 0) {
                    int var3 = class37.field552.method1377(-65);
                    if (var3 != 0) {
                        this.method1916(var3, (byte) 53);
                        return;
                    }
                    class234.field3882++;
                } else if (class232.method1544((byte) -72) - class97.field1663 > 30000L) {
                    this.method1916(1001, (byte) 100);
                    return;
                }
            }
            if (class234.field3882 == 4) {
                boolean var4 = class59.field1026 == 5 || class59.field1026 == 10 || class59.field1026 == 28;
                class91.field1610.method317(12, class37.field552, !var4);
                class211.field3559 = null;
                class37.field552 = null;
                class234.field3882 = 0;
            }
        } catch (IOException var5) {
            this.method1916(1002, (byte) 75);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    private final void method1924(boolean arg0) {
        if (!class165.field2711) {
            label246: while (true) {
                do {
                    if (!class296.method1989(127)) {
                        break label246;
                    }
                } while (class53.field932 != 's' && class53.field932 != 'S');
                class165.field2711 = true;
            }
        }
        if (arg0) {
            return;
        }
        field4547++;
        if (class87.field1564 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class232.method1544((byte) -119);
            if (class140.field2412 == 0L) {
                class140.field2412 = var4;
            }
            if (var3 > 16384 && var4 - class140.field2412 < 5000L) {
                if ((var4 - class273.field4376) > 1000L) {
                    System.gc();
                    class273.field4376 = var4;
                }
                class83.field1507 = 5;
                class272.field4372 = class248.field4063;
            } else {
                class87.field1564 = 10;
                class83.field1507 = 5;
                class272.field4372 = class37.field527;
            }
        } else if (class87.field1564 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class99.field1699[var6] = new class189(104, 104);
            }
            class83.field1507 = 10;
            class87.field1564 = 30;
            class272.field4372 = class52.field918;
        } else if (class87.field1564 == 30) {
            if (class61.field1070 == null) {
                class61.field1070 = new class82(class91.field1610, class26.field392);
            }
            if (class61.field1070.method540((byte) 115)) {
                class73.field1202 = class185.method1218(true, (byte) 118, false, 0, true);
                class76.field1236 = class185.method1218(true, (byte) 122, false, 1, true);
                class7.field87 = class185.method1218(false, (byte) 122, true, 2, true);
                class98.field1693 = class185.method1218(true, (byte) 107, false, 3, true);
                class207.field3449 = class185.method1218(true, (byte) 108, false, 4, true);
                class198.field3197 = class185.method1218(true, (byte) 122, true, 5, true);
                class56.field972 = class185.method1218(true, (byte) 110, true, 6, false);
                class206.field3438 = class185.method1218(true, (byte) 111, false, 7, true);
                class33.field471 = class185.method1218(true, (byte) 114, false, 8, true);
                class198.field3196 = class185.method1218(true, (byte) 121, false, 9, true);
                class142.field2445 = class185.method1218(true, (byte) 111, false, 10, true);
                class181.field2968 = class185.method1218(true, (byte) 118, false, 11, true);
                class119.field2106 = class185.method1218(true, (byte) 112, false, 12, true);
                class103.field1820 = class185.method1218(true, (byte) 105, false, 13, true);
                class193.field3119 = class185.method1218(true, (byte) 117, false, 14, false);
                class65.field1098 = class185.method1218(true, (byte) 116, false, 15, true);
                class188.field3052 = class185.method1218(true, (byte) 113, false, 16, true);
                class219.field3671 = class185.method1218(true, (byte) 125, false, 17, true);
                class55.field955 = class185.method1218(true, (byte) 114, false, 18, true);
                class259.field4242 = class185.method1218(true, (byte) 122, false, 19, true);
                class26.field396 = class185.method1218(true, (byte) 107, false, 20, true);
                class45.field632 = class185.method1218(true, (byte) 108, false, 21, true);
                class194.field3139 = class185.method1218(true, (byte) 127, false, 22, true);
                class101.field1739 = class185.method1218(true, (byte) 126, true, 23, true);
                class181.field2967 = class185.method1218(true, (byte) 120, false, 24, true);
                class145.field2481 = class185.method1218(true, (byte) 125, false, 25, true);
                class280.field4449 = class185.method1218(true, (byte) 105, true, 26, true);
                class19.field301 = class185.method1218(true, (byte) 114, false, 27, true);
                class248.field4060 = class185.method1218(true, (byte) 117, true, 28, true);
                class83.field1507 = 15;
                class87.field1564 = 40;
                class272.field4372 = class272.field4371;
            } else {
                class83.field1507 = 12;
                class272.field4372 = class154.field2578;
            }
        } else if (class87.field1564 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 29; var8++) {
                var7 += class55.field948[var8].method942(100) * class105.field1884[var8] / 100;
            }
            if (var7 == 100) {
                class83.field1507 = 20;
                class272.field4372 = class183.field2980;
                class220.method1456(false, class33.field471);
                class105.method710(1, class33.field471);
                class28.method183((byte) -112, class33.field471);
                class87.field1564 = 41;
            } else {
                if (var7 != 0) {
                    class272.field4372 = class212.field3580 + var7 + "%";
                }
                class83.field1507 = 20;
            }
        } else if (class87.field1564 == 41) {
            if (class248.field4060.method759(0)) {
                this.method1918(100, class248.field4060.method755((byte) -74, 1));
                class272.field4372 = class93.field1637;
                class87.field1564 = 45;
                class83.field1507 = 25;
            } else {
                class272.field4372 = class215.field3626 + class248.field4060.method740((byte) -107) + "%";
                class83.field1507 = 25;
            }
        } else if (class87.field1564 == 45) {
            class61.method382(2, class61.field1069, 22050, (byte) 9);
            class114.field2051 = new class78();
            class114.field2051.method507(128, 9, true);
            class154.field2576 = class89.method576(-120, class127.field2238, 0, class118.field2099, 22050);
            class154.field2576.method1714(50, class114.field2051);
            class69.method424(class114.field2051, class65.field1098, class193.field3119, class207.field3449, (byte) 72);
            class259.field4243 = class89.method576(-114, class127.field2238, 1, class118.field2099, 2048);
            class10.field149 = new class38();
            class259.field4243.method1714(50, class10.field149);
            class237.field3898 = new class61(22050, class81.field1478);
            class199.field3240 = class56.field972.method749("scape main", 1);
            class272.field4372 = class58.field1022;
            class87.field1564 = 50;
            class83.field1507 = 30;
        } else if (class87.field1564 == 50) {
            int var9 = class71.method432(class33.field471, 25353, class103.field1820);
            int var10 = class146.method1008(91);
            if (var9 < var10) {
                class272.field4372 = class108.field1938 + var9 * 100 / var10 + "%";
                class83.field1507 = 35;
            } else {
                class83.field1507 = 35;
                class272.field4372 = class290.field4637;
                class87.field1564 = 60;
            }
        } else if (class87.field1564 == 60) {
            int var11 = class62.method392(57, class33.field471);
            int var12 = class81.method530((byte) -105);
            if (var11 < var12) {
                class83.field1507 = 40;
                class272.field4372 = class74.field1228 + var11 * 100 / var12 + "%";
            } else {
                class272.field4372 = class261.field4259;
                class83.field1507 = 40;
                class87.field1564 = 65;
            }
        } else if (class87.field1564 == 65) {
            class93.method600(class103.field1820, (byte) 106, class33.field471);
            class272.field4372 = class245.field4029;
            class83.field1507 = 45;
            class217.method1441(5, -31239);
            class87.field1564 = 70;
        } else if (class87.field1564 == 70) {
            class7.field87.method759(0);
            byte var13 = 0;
            int var14 = var13 + class7.field87.method740((byte) -97);
            class188.field3052.method759(0);
            int var15 = var14 + class188.field3052.method740((byte) -126);
            class219.field3671.method759(0);
            int var16 = var15 + class219.field3671.method740((byte) -94);
            class55.field955.method759(0);
            int var17 = var16 + class55.field955.method740((byte) -96);
            class259.field4242.method759(0);
            int var18 = var17 + class259.field4242.method740((byte) -109);
            class26.field396.method759(0);
            int var19 = var18 + class26.field396.method740((byte) -113);
            class45.field632.method759(0);
            int var20 = var19 + class45.field632.method740((byte) -112);
            class194.field3139.method759(0);
            int var21 = var20 + class194.field3139.method740((byte) -105);
            class181.field2967.method759(0);
            int var22 = var21 + class181.field2967.method740((byte) -128);
            class145.field2481.method759(0);
            int var23 = var22 + class145.field2481.method740((byte) -117);
            class19.field301.method759(0);
            int var24 = var23 + class19.field301.method740((byte) -128);
            if (var24 < 1100) {
                class83.field1507 = 50;
                class272.field4372 = class205.field3355 + var24 / 11 + "%";
            } else {
                class139.method980((byte) -26, class7.field87);
                class294.method1979(0, class7.field87);
                class82.method543((byte) 97, class7.field87);
                class113.method790(class206.field3438, -1, class7.field87);
                class77.method472(104, true, class188.field3052, class206.field3438);
                class150.method1032(class206.field3438, (byte) 45, class55.field955);
                class78.method508(class45.field634, true, class259.field4242, class206.field3438, (byte) 69);
                class179.method1188(-78, class7.field87);
                class62.method391(class26.field396, class76.field1236, (byte) 24, class73.field1202);
                class163.method1103(-110, class7.field87);
                class292.method1974(class45.field632, (byte) 123, class206.field3438);
                class247.method1654(0, class194.field3139);
                class236.method1562(class7.field87, -25241);
                class109.method762(60, class33.field471, class206.field3438, class98.field1693, class103.field1820);
                class210.method1408(112, class7.field87);
                class122.method837(class219.field3671, 31946);
                class219.method1451(class145.field2481, new class76(), class181.field2967, -104);
                class118.method815(118, class145.field2481, class181.field2967);
                class191.method1250(5473, class7.field87);
                class67.method416((byte) -70, class7.field87);
                class75.method461(class7.field87, 0);
                class126.method859(class33.field471, (byte) 50, class7.field87);
                class286.method1906(class33.field471, class7.field87, 5189);
                class83.field1507 = 50;
                class272.field4372 = class286.field4528;
                class262.method1740(3549);
                class87.field1564 = 80;
            }
        } else if (class87.field1564 == 80) {
            int var25 = class225.method1511(class33.field471, !arg0);
            int var26 = class172.method1154((byte) -23);
            if (var25 < var26) {
                class272.field4372 = class161.field2683 + var25 * 100 / var26 + "%";
                class83.field1507 = 60;
            } else {
                class222.method1494(false, class33.field471);
                class87.field1564 = 90;
                class83.field1507 = 60;
                class272.field4372 = class3.field31;
            }
        } else if (class87.field1564 == 90) {
            if (class280.field4449.method759(0)) {
                class240 var27 = new class240(class198.field3196, class280.field4449, class33.field471, 20, !class239.field3932);
                class287.method1930(var27);
                if (class286.field4518 == 1) {
                    class287.method1943(0.9F);
                }
                if (class286.field4518 == 2) {
                    class287.method1943(0.8F);
                }
                if (class286.field4518 == 3) {
                    class287.method1943(0.7F);
                }
                if (class286.field4518 == 4) {
                    class287.method1943(0.6F);
                }
                class87.field1564 = 100;
                class272.field4372 = field4535;
                class83.field1507 = 70;
            } else {
                class272.field4372 = class109.field1981 + class280.field4449.method740((byte) -102) + "%";
                class83.field1507 = 70;
            }
        } else if (class87.field1564 == 100) {
            if (class78.method482(class33.field471, 192)) {
                class87.field1564 = 110;
            }
        } else if (class87.field1564 == 110) {
            class243.field3990 = new class215();
            class127.field2238.method917(10, (byte) 120, class243.field3990);
            class272.field4372 = class139.field2394;
            class83.field1507 = 75;
            class87.field1564 = 120;
        } else if (class87.field1564 == 120) {
            if (class142.field2445.method735(102, "huffman", "")) {
                class146 var28 = new class146(class142.field2445.method729("huffman", 83, ""));
                class78.method486(var28, (byte) -119);
                class83.field1507 = 80;
                class272.field4372 = class77.field1263;
                class87.field1564 = 130;
            } else {
                class272.field4372 = class134.field2324 + "0%";
                class83.field1507 = 80;
            }
        } else if (class87.field1564 == 130) {
            if (!class98.field1693.method759(0)) {
                class272.field4372 = class199.field3280 + class98.field1693.method740((byte) -100) * 3 / 4 + "%";
                class83.field1507 = 85;
            } else if (!class119.field2106.method759(0)) {
                class272.field4372 = class199.field3280 + (class119.field2106.method740((byte) -100) / 10 + 75) + "%";
                class83.field1507 = 85;
            } else if (!class103.field1820.method759(0)) {
                class272.field4372 = class199.field3280 + (class103.field1820.method740((byte) -98) / 20 + 85) + "%";
                class83.field1507 = 85;
            } else if (class101.field1739.method736("details", (byte) 6)) {
                class28.method188(class259.field4245, 1, class101.field1739);
                class13.method80(class206.field3438);
                class272.field4372 = class92.field1618;
                class87.field1564 = 135;
                class83.field1507 = 95;
            } else {
                class272.field4372 = class199.field3280 + ((class101.field1739.method728(0, "details") / 10) + 90) + "%";
                class83.field1507 = 85;
            }
        } else if (class87.field1564 == 135) {
            int var29 = class136.method960(true);
            if (var29 == -1) {
                class83.field1507 = 95;
                class272.field4372 = class191.field3085;
            } else if (var29 == 7 || var29 == 9) {
                this.method1127((byte) 104, "worldlistfull");
                class217.method1441(1000, -31239);
            } else if (class83.field1513) {
                class272.field4372 = class211.field3562;
                class87.field1564 = 140;
                class83.field1507 = 96;
            } else {
                this.method1127((byte) 104, "worldlistio_" + var29);
                class217.method1441(1000, -31239);
            }
        } else if (class87.field1564 == 140) {
            class54.field937 = class98.field1693.method749("loginscreen", 1);
            class198.field3197.method752((byte) -1, false, true);
            class56.field972.method752((byte) -1, true, true);
            class33.field471.method752((byte) -1, true, true);
            class103.field1820.method752((byte) -1, true, true);
            class142.field2445.method752((byte) -1, true, true);
            class98.field1693.method752((byte) -1, true, true);
            class272.field4372 = class30.field453;
            class87.field1564 = 150;
            class50.field852 = true;
            class83.field1507 = 97;
        } else if (class87.field1564 == 150) {
            if (class165.field2711) {
                class103.field1818 = 0;
                class139.field2403 = 0;
                class172.field2820 = 0;
                class52.field912 = 0;
            }
            class165.field2711 = true;
            class28.method185(class127.field2238, 0);
            class39.method262((byte) -20, false, -1, -1, class52.field912);
            class87.field1564 = 160;
            class272.field4372 = class160.field2669;
            class83.field1507 = 100;
        } else if (class87.field1564 == 160) {
            class101.method651(true, -105);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public final void method1137(int arg0) {
        method1917((byte) -118);
        class63.method399((byte) 95);
        field4541++;
        class39.method264(15907);
        class195.method1278((byte) -86);
        class110.method767(-77);
        class296.method1988((byte) -75);
        class272.method1787(-16182);
        class67.method415(31321);
        class168.method1125(77);
        class116.method808(true);
        class28.method189(566);
        class215.method1436(500);
        class280.method1828((byte) -120);
        class101.method656((byte) -39);
        class207.method1381(false);
        class51.method325(0);
        class92.method592((byte) 64);
        class82.method537((byte) 11);
        class135.method940(true);
        class108.method732(0);
        class196.method1296((byte) 96);
        class126.method861(51);
        class9.method56((byte) -122);
        class141.method986(20156);
        class30.method203(arg0 - 15753);
        class189.method1235(false);
        class46.method279(false);
        class288.method1952(-13);
        class60.method373(-1);
        class74.method454(arg0 ^ 0x60);
        class112.method787(1391207625);
        class7.method40((byte) -107);
        class88.method572(true);
        class106.method723(true);
        class78.method499((byte) -79);
        class258.method1716(false);
        class61.method383((byte) 33);
        class23.method158(true);
        class167.method1116(89);
        class81.method523(9068);
        class109.method761((byte) 123);
        class206.method1367(1);
        class103.method703(arg0 ^ 0xFFFFB93A);
        class208.method1403((byte) 52);
        class194.method1271(0);
        class192.method1258((byte) -5);
        class222.method1496(arg0 - 79);
        class291.method1970(114);
        class166.method1114((byte) 91);
        class259.method1720(-127);
        class56.method350((byte) 86);
        class96.method608((byte) 67);
        class253.method1674(-90);
        class163.method1101(17);
        class21.method148(0);
        class52.method328(arg0 - 110);
        class219.method1455((byte) 3);
        class99.method625(-9208);
        class132.method919(-110);
        class133.method923(0);
        class6.method34(-1);
        class95.method607(0);
        class220.method1457(116);
        class221.method1468();
        class160.method1091((byte) -30);
        class199.method1325((byte) 127);
        class18.method127();
        class252.method1671((byte) 58);
        class80.method520((byte) 49);
        class231.method1543((byte) 127);
        class185.method1221(56);
        class62.method394((byte) -59);
        class159.method1089(-98);
        class100.method635(true);
        class244.method1630();
        class3.method16((byte) -98);
        class10.method66(-956276121);
        class130.method902();
        class250.method1665(false);
        class248.method1659(true);
        class211.method1416((byte) -64);
        class137.method970();
        class171.method1149((byte) 92);
        class98.method618((byte) -14);
        class176.method1172(-9342);
        class183.method1199(15);
        class283.method1844();
        class193.method1268(arg0 ^ 0x10);
        class53.method335(15810);
        class2.method12(arg0 ^ 0xFFFFFF97);
        class129.method886(arg0 + 46);
        class1.method5(-2048);
        class90.method586(12);
        class169.method1143(-128);
        class151.method1040(3);
        class19.method136(24616);
        class147.method1015(arg0 + 65536);
        class162.method1099((byte) -115);
        class37.method245(-86);
        class121.method824(true);
        class47.method296(-63);
        class161.method1096(false);
        class13.method78();
        class157.method1080(arg0 - 124);
        class127.method880(1);
        class123.method842(-96);
        class76.method462(arg0 ^ 0xFFFFC0AF);
        class267.method1759((byte) -53);
        class134.method931((byte) -96);
        class257.method1705();
        class290.method1960(arg0 ^ 0x71);
        class45.method277(arg0 + 33);
        class14.method81((byte) 53);
        class24.method169(64);
        class240.method1587(59);
        class204.method1349(false);
        class113.method794((byte) 111);
        class136.method955(arg0 ^ arg0);
        class180.method1193();
        class287.method1944();
        class146.method1009((byte) 100);
        class49.method302(9104);
        class89.method582((byte) -56);
        class237.method1569(25696);
        class42.method275(0);
        class152.method1044(0);
        class239.method1577(128);
        class198.method1317((byte) -16);
        class184.method1204(false);
        class173.method1156(59);
        class158.method1088(arg0 ^ 0x7B);
        class212.method1417((byte) -126);
        class223.method1501((byte) 112);
        class11.method71(arg0 ^ 0x60);
        class216.method1440(arg0 ^ 0x6D);
        class251.method1669();
        class186.method1222((byte) 115);
        class295.method1986(~arg0);
        class139.method977(10416);
        class289.method1955();
        class5.method29(arg0 ^ 0x2);
        class165.method1113((byte) -19);
        class156.method1069((byte) -112);
        class261.method1733(12884);
        class55.method345(-2);
        class144.method1000(126);
        class57.method354(0);
        class273.method1792(3);
        class226.method1522();
        class59.method364(62);
        class241.method1590((byte) -26);
        class29.method191(false);
        class177.method1179(false);
        class213.method1422(1597);
        class143.method998(123);
        class27.method178((byte) -128);
        class35.method229(true);
        class154.method1059(6362);
        class69.method420(-1761652242);
        class73.method440(arg0 - 9206);
        class115.method806(45);
        class182.method1197(arg0 ^ 0x7D);
        class50.method307(65536);
        class266.method1752(arg0 + 5023);
        class12.method75(false);
        class229.method1538(false);
        class277.method1814((byte) -72);
        class246.method1646((byte) 100);
        class260.method1728();
        class104.method707(-123);
        class93.method603((byte) -117);
        class256.method1693(-71);
        class209.method1404(114);
        class111.method774((byte) -82);
        class282.method1836();
        class278.method1815();
        class292.method1972(64);
        class31.method207(96);
        class225.method1517((byte) 59);
        class181.method1194((byte) 85);
        class214.method1427();
        class86.method562();
        class65.method408(arg0 ^ 0xFFFFECB6);
        class276.method1811(0);
        class122.method832(true);
        class142.method995((byte) -67);
        class210.method1407(-121);
        class114.method803(118);
        class234.method1550(20160);
        class155.method1060(arg0 + 1);
        class245.method1640(arg0 ^ 0xFFFFFFFB);
        class243.method1606(121);
        class85.method560(arg0 + 94);
        class281.method1833((byte) 126);
        class68.method417(-3);
        class179.method1186(-12220);
        class145.method1007((byte) -97);
        class274.method1799(-19948);
        class77.method468(false);
        class119.method818(23207);
        class97.method613((byte) -119);
        class54.method337((byte) 41);
        class270.method1774((byte) -33);
        class125.method857(arg0 ^ 0x4C);
        class48.method298((byte) 73);
        class188.method1230(false);
        class217.method1444(false);
        class294.method1984(4096);
        class91.method589(90);
        class153.method1047((byte) 64);
        class293.method1977((byte) -51);
        class201.method1338(-3);
        class84.method552((byte) -8);
        class140.method984(0);
        class178.method1182((byte) -110);
        class79.method515(93);
        class191.method1249(arg0 + 18734);
        class264.method1746((byte) -1);
        class255.method1687(-8181);
        class228.method1533(112);
        class107.method724(4096);
        class4.method24((byte) 11);
        class286.method1913(arg0 - 9418);
        class254.method1681(true);
        class187.method1226(-109);
        class205.method1355(-1751526068);
        class102.method700((byte) 126);
        class105.method712(115);
        class175.method1165((byte) -33);
        class72.method436((byte) 92);
        class75.method459(-4097);
        class203.method1345(false);
        class26.method175(true);
        class124.method851(-4398);
        class58.method361((byte) -96);
        class66.method410((byte) -85);
        class25.method172(-117);
        class190.method1245(-120);
        class247.method1652(arg0);
        class269.method1769((byte) 45);
        class262.method1737((byte) 117);
        class150.method1033((byte) -110);
        class41.method270(28575);
        class118.method814((byte) 86);
        class33.method219(true);
        if (class168.field2789) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ldl;Z)Ljava/lang/String;")
    public static final String method1925(class46 arg0, boolean arg1) {
        if (arg1) {
            return null;
        }
        field4553++;
        if (method1922(arg0).method1257(121) == 0) {
            return null;
        } else if (arg0.field780 == null || arg0.field780.trim().length() == 0) {
            return class285.field4510 ? "Hidden-use" : null;
        } else {
            return arg0.field780;
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field4550++;
        if (!this.method1129(false)) {
            return;
        }
        class273.field4385 = Integer.parseInt(this.getParameter("worldid"));
        class225.field3780 = Integer.parseInt(this.getParameter("modewhere"));
        if (class225.field3780 < 0 || class225.field3780 > 1) {
            class225.field3780 = 0;
        }
        class149.field2511 = Integer.parseInt(this.getParameter("modewhat"));
        if (class149.field2511 < 0 || class149.field2511 > 2) {
            class149.field2511 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class210.field3553 = true;
        } else {
            class210.field3553 = false;
        }
        try {
            class212.field3568 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class212.field3568 = 0;
        }
        class281.method1830(40, class212.field3568);
        String var2 = this.getParameter("objecttag");
        if (var2 != null && var2.equals("1")) {
            class11.field165 = true;
        } else {
            class11.field165 = false;
        }
        String var3 = this.getParameter("js");
        if (var3 != null && var3.equals("1")) {
            class169.field2794 = true;
        } else {
            class169.field2794 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class185.field3002 = 1;
        } else {
            class185.field3002 = 0;
        }
        try {
            class191.field3090 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class191.field3090 = 0;
        }
        class204.field3339 = this.getParameter("settings");
        if (class204.field3339 == null) {
            class204.field3339 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class107.field1910 = Integer.parseInt(var5);
            } catch (Exception var7) {
                class107.field1910 = 0;
            }
        }
        String var6 = this.getParameter("haveie6");
        if (var6 != null && var6.equals("1")) {
            class66.field1105 = true;
        } else {
            class66.field1105 = false;
        }
        class159.field2663 = this;
        this.method1133((byte) -80, class149.field2511 + 32, 503, 765, 539);
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method1926(int arg0) {
        field4551++;
        for (class173.field2837 = 0; class296.method1989(127) && class173.field2837 < 128; class173.field2837++) {
            class222.field3745[class173.field2837] = class141.field2418;
            class152.field2546[class173.field2837] = class53.field932;
        }
        class191.field3087++;
        if (field4545 != -1) {
            class275.method1804(0, 0, class4.field38, -105, 0, 0, field4545, class267.field4324);
        }
        class222.field3746++;
        class165.method1112(true);
        while (true) {
            class198 var2;
            class46 var3;
            class46 var4;
            do {
                var2 = (class198) class181.field2966.method368(-1);
                if (var2 == null) {
                    int var5 = -61 % ((-arg0 - 74) / 33);
                    while (true) {
                        class198 var6;
                        class46 var7;
                        class46 var8;
                        do {
                            var6 = (class198) class9.field103.method368(-1);
                            if (var6 == null) {
                                while (true) {
                                    class198 var9;
                                    class46 var10;
                                    class46 var11;
                                    do {
                                        var9 = (class198) class28.field426.method368(-1);
                                        if (var9 == null) {
                                            if (class6.field76 != null) {
                                                class113.method797(1758);
                                            }
                                            if (class60.field1048 != null && class60.field1048.field2857 == 1) {
                                                if (class60.field1048.field2859 != null) {
                                                    class291.method1967(class253.field4142, class246.field4048, 79);
                                                }
                                                class60.field1048 = null;
                                                class246.field4048 = null;
                                                class253.field4142 = false;
                                            }
                                            if (class266.field4301 % 1500 == 0) {
                                                class157.method1076((byte) -119);
                                                return;
                                            }
                                            return;
                                        }
                                        var10 = var9.field3205;
                                        if (var10.field704 < 0) {
                                            break;
                                        }
                                        var11 = class108.method760(-29533, var10.field660);
                                    } while (var11 == null || var11.field785 == null || var11.field785.length <= var10.field704 || var11.field785[var10.field704] != var10);
                                    class71.method434(-10521, var9);
                                }
                            }
                            var7 = var6.field3205;
                            if (var7.field704 < 0) {
                                break;
                            }
                            var8 = class108.method760(-29533, var7.field660);
                        } while (var8 == null || var8.field785 == null || var8.field785.length <= var7.field704 || var8.field785[var7.field704] != var7);
                        class71.method434(-10521, var6);
                    }
                }
                var3 = var2.field3205;
                if (var3.field704 < 0) {
                    break;
                }
                var4 = class108.method760(-29533, var3.field660);
            } while (var4 == null || var4.field785 == null || var4.field785.length <= var3.field704 || var4.field785[var3.field704] != var3);
            class71.method434(-10521, var2);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method1927(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class216 var20 = new class216(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class79.field1367[var21][arg1][arg2] == null) {
                    class79.field1367[var21][arg1][arg2] = new class109(var21, arg1, arg2);
                }
            }
            class79.field1367[arg0][arg1][arg2].field1971 = var20;
        } else if (arg3 == 1) {
            class216 var22 = new class216(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class79.field1367[var23][arg1][arg2] == null) {
                    class79.field1367[var23][arg1][arg2] = new class109(var23, arg1, arg2);
                }
            }
            class79.field1367[arg0][arg1][arg2].field1971 = var22;
        } else {
            class251 var24 = new class251(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class79.field1367[var25][arg1][arg2] == null) {
                    class79.field1367[var25][arg1][arg2] = new class109(var25, arg1, arg2);
                }
            }
            class79.field1367[arg0][arg1][arg2].field1956 = var24;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method1138(byte arg0) {
        field4537++;
        if (class59.field1026 == 1000) {
            return;
        }
        class266.field4301++;
        if (class266.field4301 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class184.field2995 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class67.field1119.setSeed((long) class184.field2995);
        }
        this.method1914(true);
        if (class61.field1070 != null) {
            class61.field1070.method544((byte) -80);
        }
        class294.method1980((byte) 32);
        class97.method614(arg0 + 32169);
        class219.method1450(-29839);
        class127.method881((byte) -106);
        if (arg0 != -102) {
            field4546 = null;
        }
        if (class101.field1723 != null) {
            int var3 = class101.field1723.method38((byte) 44);
            class25.field387 = var3;
        }
        if (class59.field1026 == 0) {
            this.method1924(false);
            class2.method10((byte) -107);
        } else if (class59.field1026 == 5) {
            this.method1924(false);
            class2.method10((byte) 56);
        } else if (class59.field1026 == 25 || class59.field1026 == 28) {
            class241.method1591(0);
        }
        if (class59.field1026 == 10) {
            this.method1926(arg0 ^ 0x1F);
            class273.method1793((byte) 87);
            class3.method19((byte) -60);
            class156.method1074(arg0 ^ 0xFFFFFF95);
        } else if (class59.field1026 == 30) {
            class276.method1807(4);
            return;
        } else if (class59.field1026 == 40) {
            class156.method1074(74);
            if (class6.field73 != -3) {
                if (class6.field73 == 15) {
                    class263.method1742((byte) -57);
                    return;
                }
                if (class6.field73 != 2) {
                    class63.method402((byte) -18);
                    return;
                }
            }
        }
    }
}
