import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class233 {

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static volatile int field2297 = 0;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "Lfi;")
    public static class331 field2307 = new class331(50);

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field2317;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "qb", descriptor = "Ljava/lang/Class;")
    public static Class field2316;

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    private final void method1060(int arg0) {
        class12.field127 = 0;
        field2312++;
        while (class115.method641((byte) -108) && class12.field127 < 128) {
            if (!class189.method1205((byte) -75) || !(class295.field4219 == '`' || class295.field4219 == '§')) {
                class191.field2599[class12.field127] = class343.field5052;
                class392.field5737[class12.field127] = class295.field4219;
                class12.field127++;
            } else if (class349.method2225(128)) {
                class372.method2338(116);
            } else {
                class402.method2546(arg0 ^ 0xFFFFFF83);
            }
        }
        if (class349.method2225(arg0 + 128)) {
            class437.method2716(5411);
        }
        class245.field3329++;
        class311.method1951(-1, (class119) null, -1, (byte) -71);
        class248.method1559((class119) null, arg0, -1, -1);
        if (class424.field6086 != -1) {
            class166.method1100(0, class424.field6086, 0, class38.field389, false, 0, class222.field3039, 0);
        }
        class418.field6013++;
        for (int var2 = 0; var2 < 32768; var2++) {
            class358 var12 = class81.field917[var2];
            if (var12 != null) {
                byte var13 = var12.field5229.field4929;
                if ((var13 & 0x1) != 0) {
                    int var14 = var12.method786((byte) 70);
                    if ((var13 & 0x2) != 0 && var12.field6345 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var15 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var16 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var15 != 0 || var16 != 0) {
                            int var17 = var12.field6351[0] + var15;
                            int var18 = var12.field6350[0] + var16;
                            if (var17 < 0) {
                                var17 = 0;
                            } else if ((class279.field3935 - var14 - 1) < var17) {
                                var17 = class279.field3935 - var14 - 1;
                            }
                            if (var18 < 0) {
                                var18 = 0;
                            } else if (var18 > (class164.field2287 - var14 - 1)) {
                                var18 = class164.field2287 - var14 - 1;
                            }
                            int var19 = class70.method412(0, -115, var14, var14, 0, var14, class54.field613[var12.field1308], var12.field6351[0], var17, -1, var18, true, class193.field2635, var12.field6350[0], class382.field5614);
                            if (var19 > 0) {
                                if (var19 > 9) {
                                    var19 = 9;
                                }
                                for (int var20 = 0; var20 < var19; var20++) {
                                    var12.field6351[var20] = class193.field2635[var19 - var20 - 1];
                                    var12.field6350[var20] = class382.field5614[var19 - var20 - 1];
                                    var12.field6352[var20] = 1;
                                }
                                var12.field6345 = var19;
                            }
                        }
                    }
                    class261.method1642(var12, arg0 - 64, true);
                    int var21 = class301.method1901(6, var12);
                    class157.method1034(var21, -14337, class384.field5623, var12, class231.field3135);
                    class101.method545(var12, -1);
                }
            }
        }
        if (class248.field3363 == 0 && class392.field5734 == 0) {
            if (class231.field3128 == 2) {
                class247.method1557(true);
            } else {
                class160.method1050((byte) 127);
            }
            if ((class272.field3853 >> 7) < 14 || class272.field3853 >> 7 >= class279.field3935 - 14 || class272.field3852 >> 7 < 14 || (class272.field3852 >> 7) >= (class164.field2287 - 14)) {
                class388.method2478(arg0 ^ 0xC1A5F584);
            }
        }
        while (true) {
            class191 var3;
            class119 var4;
            class119 var5;
            do {
                var3 = (class191) class383.field5617.method1112(-1);
                if (var3 == null) {
                    while (true) {
                        class191 var6;
                        class119 var7;
                        class119 var8;
                        do {
                            var6 = (class191) class140.field1986.method1112(-1);
                            if (var6 == null) {
                                while (true) {
                                    class191 var9;
                                    class119 var10;
                                    class119 var11;
                                    do {
                                        var9 = (class191) class364.field5293.method1112(~arg0);
                                        if (var9 == null) {
                                            if (class193.field2632 != null) {
                                                class266.method1699(false);
                                            }
                                            if ((class221.field3033 % 1500) == 0) {
                                                class102.method549(arg0 ^ 0xFFFFFF82);
                                            }
                                            class130.method781(false);
                                            if (class400.field5811 && (class203.method1299((byte) 5) - 60000L) > class193.field2642) {
                                                class308.method1927((byte) 122);
                                                return;
                                            }
                                            return;
                                        }
                                        var10 = var9.field2605;
                                        if (var10.field1495 < 0) {
                                            break;
                                        }
                                        var11 = class179.method1170(var10.field1529, 818041328);
                                    } while (var11 == null || var11.field1460 == null || var10.field1495 >= var11.field1460.length || var11.field1460[var10.field1495] != var10);
                                    class387.method2471(var9);
                                }
                            }
                            var7 = var6.field2605;
                            if (var7.field1495 < 0) {
                                break;
                            }
                            var8 = class179.method1170(var7.field1529, 818041328);
                        } while (var8 == null || var8.field1460 == null || var7.field1495 >= var8.field1460.length || var8.field1460[var7.field1495] != var7);
                        class387.method2471(var6);
                    }
                }
                var4 = var3.field2605;
                if (var4.field1495 < 0) {
                    break;
                }
                var5 = class179.method1170(var4.field1529, arg0 ^ 0x30C251F0);
            } while (var5 == null || var5.field1460 == null || var4.field1495 >= var5.field1460.length || var5.field1460[var4.field1495] != var4);
            class387.method2471(var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field2301++;
        try {
            if (arg0.length != 4) {
                class54.method312((byte) 125, "argument count");
            }
            class246.field3337 = Integer.parseInt(arg0[0]);
            class213.field2908 = 2;
            if (arg0[1].equals("live")) {
                class228.field3117 = 0;
            } else if (arg0[1].equals("rc")) {
                class228.field3117 = 1;
            } else if (arg0[1].equals("wip")) {
                class228.field3117 = 2;
            } else {
                class54.method312((byte) 125, "modewhat");
            }
            class297.field4234 = class213.method1399(arg0[2], -80);
            if (class297.field4234 == -1) {
                if (arg0[2].equals("english")) {
                    class297.field4234 = 0;
                } else if (arg0[2].equals("german")) {
                    class297.field4234 = 1;
                } else {
                    class54.method312((byte) 125, "language");
                }
            }
            class191.method1222(-3, class297.field4234);
            class220.field3019 = false;
            class242.field3271 = false;
            if (arg0[3].equals("game0")) {
                class136.field1912 = 0;
            } else if (arg0[3].equals("game1")) {
                class136.field1912 = 1;
            } else {
                class54.method312((byte) 125, "game");
            }
            class330.field4718 = class136.field1912;
            class100.field1130 = "";
            class404.field5884 = 0;
            class191.field2617 = 0;
            client var1 = new client();
            class407.field5920 = var1;
            var1.method1492(1024, 29, 560, 768, false, class228.field3117 + 32, 112, class136.field1912 == 1 ? "stellardawn" : "runescape");
            class252.field3406.setLocation(40, 40);
        } catch (Exception var3) {
            class411.method2578(var3, (String) null, (byte) -68);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method1061() {
        int var0 = class400.field5815 ? class148.field2082 : class426.field6168 + class148.field2082;
        for (int var1 = -1; var1 < var0; var1++) {
            class433 var2;
            if (var1 < 0) {
                var2 = class390.field5715;
            } else if (var1 < class148.field2082) {
                var2 = class375.field5473[class294.field4217[var1]];
            } else {
                var2 = class81.field917[class201.field2770[var1 - class148.field2082]];
            }
            var2.field6266 = 0;
            if (var2.field6329 < 0) {
                var2.field6287 = false;
            } else {
                int var3 = var2.method786((byte) 70);
                if ((var3 & 0x1) == 0) {
                    if ((var2.field1304 & 0x7F) != 0 || (var2.field1311 & 0x7F) != 0) {
                        var2.field6287 = false;
                        continue;
                    }
                } else if ((var2.field1304 & 0x7F) != 64 || (var2.field1311 & 0x7F) != 64) {
                    var2.field6287 = false;
                    continue;
                }
                int var10002;
                if (var3 == 1) {
                    int var4 = var2.field1304 >> 7;
                    int var5 = var2.field1311 >> 7;
                    if (class308.field4407[var4][var5] != var2.field6329) {
                        var2.field6287 = true;
                        continue;
                    }
                    if (class219.field3010[var4][var5] > 1) {
                        var10002 = class219.field3010[var4][var5]--;
                        var2.field6287 = true;
                        continue;
                    }
                } else {
                    int var6 = (var3 - 1) * 64 + 60;
                    int var7 = var2.field1304 - var6 >> 7;
                    int var8 = var2.field1311 - var6 >> 7;
                    int var9 = var2.field1304 + var6 >> 7;
                    int var10 = var2.field1311 + var6 >> 7;
                    if (!class355.method2265(var8, var2.field6329, var10, 241, var7, var9)) {
                        for (int var11 = var7; var11 <= var9; var11++) {
                            for (int var12 = var8; var12 <= var10; var12++) {
                                if (class308.field4407[var11][var12] == var2.field6329) {
                                    var10002 = class219.field3010[var11][var12]--;
                                }
                            }
                        }
                        var2.field6287 = true;
                        continue;
                    }
                }
                if (var2 instanceof class133 && var2.field6343 != null && class221.field3033 >= var2.field6341 && class221.field3033 < var2.field6346) {
                    ((class133) var2).field1854 = false;
                }
                var2.field6287 = false;
                var2.field1310 = class372.method2335(var2.field1311, class410.field5931, (byte) 37, var2.field1304);
                class310.method1947(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZI)Ljava/lang/String;")
    public static final String method1062(int arg0, boolean arg1, int arg2) {
        if (arg2 == 70) {
            field2298++;
            return arg1 && arg0 >= 0 ? class100.method541(arg0, 10, arg1, -64) : Integer.toString(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILra;)V")
    private static final void method1063(int arg0, class57 arg1) {
        if (arg0 >= -13) {
            field2307 = null;
        }
        class45.field545 = arg1;
        field2305++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V")
    private final void method1064(byte[] arg0, int arg1) {
        if (arg1 > -66) {
            field2297 = -1;
        }
        field2302++;
        class211 var3 = new class211(arg0);
        while (true) {
            while (true) {
                int var4 = var3.method1342((byte) -128);
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    int[] var5 = class282.field3966 = new int[6];
                    var5[0] = var3.method1355(32136);
                    var5[1] = var3.method1355(32136);
                    var5[2] = var3.method1355(32136);
                    var5[3] = var3.method1355(32136);
                    var5[4] = var3.method1355(32136);
                    var5[5] = var3.method1355(32136);
                } else if (var4 == 4) {
                    int var6 = var3.method1342((byte) -127);
                    class428.field6222 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        class428.field6222[var7] = var3.method1355(32136);
                        if (class428.field6222[var7] == 65535) {
                            class428.field6222[var7] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
    public static final void method1065(byte arg0, int arg1) {
        field2314++;
        class32.method189(arg0 ^ 0x4C);
        class40.method250((byte) 106);
        class123.method700(true, arg1, (byte) 120);
        class334.method2151(class218.field2991, class92.field1012, (byte) 56, class323.field4546);
        class71.method418(class92.field1012, class218.field2991, false);
        class286.method1823(arg0 + 27795, class159.field2247);
        class116.method643(16384);
        class109.method609(52);
        if (arg0 != -77) {
            field2297 = 95;
        }
        if (class105.field1191 == 10) {
            class77.method435((byte) 14, false);
        } else if (class105.field1191 == 30) {
            class266.method1695(25, (byte) -83);
        } else if (class105.field1191 == 5) {
            class102.method553(true, class218.field2991, class92.field1012);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method1066() {
        boolean var0 = class318.field4509 == 1 && class148.field2082 > 200 || class318.field4509 == 0 && class148.field2082 > 50;
        for (int var1 = 0; var1 < class148.field2082; var1++) {
            class133 var10 = class375.field5473[class294.field4217[var1]];
            if (var10.method793(255)) {
                var10.method621((byte) 117);
                if (var10.field1316 >= 0 && var10.field1305 >= 0 && var10.field1298 < class279.field3935 && var10.field1299 < class164.field2287) {
                    var10.field1854 = var10.field6335 ? var0 : false;
                    int var11 = 0;
                    if (!var10.field6287) {
                        var11++;
                    }
                    if (var10.field6323 > class221.field3033) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method786((byte) 70) << 2);
                    if (class174.field2425 == 0) {
                        var12 += 32;
                    } else {
                        var12 += 128;
                    }
                    var12 += 256;
                    var10.field6329 = var12 + 1;
                } else {
                    var10.field6329 = -1;
                }
            } else {
                var10.field6329 = -1;
            }
        }
        for (int var2 = 0; var2 < class426.field6168; var2++) {
            class358 var7 = class81.field917[class201.field2770[var2]];
            if (var7.method2280(255) && var7.field5229.method2156(128)) {
                var7.method621((byte) 118);
                if (var7.field1316 >= 0 && var7.field1305 >= 0 && var7.field1298 < class279.field3935 && var7.field1299 < class164.field2287) {
                    int var8 = 0;
                    if (!var7.field6287) {
                        var8++;
                    }
                    if (var7.field6323 > class221.field3033) {
                        var8 += 2;
                    }
                    int var9 = var8 + (5 - var7.method786((byte) 70) << 2);
                    if (class174.field2425 == 0) {
                        if (var7.field5229.field4934) {
                            var9 += 64;
                        } else {
                            var9 += 128;
                        }
                    } else if (class174.field2425 == 1) {
                        if (var7.field5229.field4934) {
                            var9 += 32;
                        } else {
                            var9 += 64;
                        }
                    }
                    if (var7.field5229.field4931) {
                        var9 += 512;
                    } else if (!var7.field5229.field4985) {
                        var9 += 256;
                    }
                    var7.field6329 = var9 + 1;
                } else {
                    var7.field6329 = -1;
                }
            } else {
                var7.field6329 = -1;
            }
        }
        for (int var3 = 0; var3 < class286.field4039.length; var3++) {
            class58 var4 = class286.field4039[var3];
            if (var4 != null) {
                if (var4.field708 == 1) {
                    class358 var5 = class81.field917[var4.field697];
                    if (var5 != null && var5.field6329 >= 0) {
                        var5.field6329 += 1024;
                    }
                } else if (var4.field708 == 10) {
                    class133 var6 = class375.field5473[var4.field697];
                    if (var6 != null && var6.field6329 >= 0) {
                        var6.field6329 += 1024;
                    }
                }
            }
        }
        class390.field5715.field6329 = Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method1067() {
        int var0 = class400.field5815 ? class148.field2082 : class426.field6168 + class148.field2082;
        for (int var1 = -1; var1 < var0; var1++) {
            class433 var2;
            if (var1 < 0) {
                var2 = class390.field5715;
            } else if (var1 < class148.field2082) {
                var2 = class375.field5473[class294.field4217[var1]];
            } else {
                var2 = class81.field917[class201.field2770[var1 - class148.field2082]];
            }
            if (var2.field6329 >= 0) {
                int var3 = var2.method786((byte) 70);
                if ((var3 & 0x1) == 0) {
                    if ((var2.field1304 & 0x7F) == 0 && (var2.field1311 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var2.field1304 & 0x7F) == 64 && (var2.field1311 & 0x7F) == 64) {
                    continue;
                }
                if (var2 instanceof class133 && var2.field6343 != null && class221.field3033 >= var2.field6341 && class221.field3033 < var2.field6346) {
                    ((class133) var2).field1854 = false;
                }
                var2.field1310 = class372.method2335(var2.field1311, class410.field5931, (byte) 63, var2.field1304);
                class310.method1947(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Ljf;IIIIIII)V")
    public static final void method1068(class119[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class119 var9 = arg0[var8];
            if (var9 != null && var9.field1529 == arg1) {
                int var10 = var9.field1448 + arg6;
                int var11 = var9.field1562 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field1535 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field1552 + var10;
                    int var17 = var9.field1498 + var11;
                    if (var9.field1535 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (!var9.field1475 || var9.field1535 == 0 || var9.field1505 || method1076(var9).field39 != 0 || class382.field5600 == var9 || var9.field1538 == 1338) {
                    if (!var9.field1475 || !method1074(var9)) {
                        if (class193.field2632 == var9) {
                            class19.field203 = true;
                            class58.field699 = var10;
                            class257.field3501 = var11;
                        }
                        if (!var9.field1475 || var9.field1436 || var12 < var14 && var13 < var15) {
                            if (var9.field1535 == 0) {
                                if (!var9.field1475 && method1074(var9) && class193.field2639 != var9) {
                                    continue;
                                }
                                if (var9.field1599 && class57.field654 >= var12 && class48.field562 >= var13 && class57.field654 < var14 && class48.field562 < var15) {
                                    for (class191 var18 = (class191) class364.field5293.method1124(-1); var18 != null; var18 = (class191) class364.field5293.method1119(false)) {
                                        if (var18.field2606) {
                                            var18.method2290((byte) 98);
                                            var18.field2605.field1531 = false;
                                        }
                                    }
                                    if (class397.field5786 == 0) {
                                        class193.field2632 = null;
                                        class382.field5600 = null;
                                    }
                                    class366.field5338 = 0;
                                    class213.field2915 = false;
                                    class56.field635 = false;
                                    if (!class81.field903) {
                                        class448.method2780(true);
                                    }
                                }
                            }
                            boolean var19;
                            if (class57.field654 >= var12 && class48.field562 >= var13 && class57.field654 < var14 && class48.field562 < var15) {
                                var19 = true;
                            } else {
                                var19 = false;
                            }
                            if (!class81.field903 && var19) {
                                class245.method1550(class48.field562 - var11, class57.field654 - var10, var9, -557);
                            }
                            if (var9.field1475) {
                                boolean var20 = false;
                                if (class137.field1922 == 1 && var19) {
                                    var20 = true;
                                }
                                boolean var21 = false;
                                if (class353.field5154 == 1 && class302.field4326 >= var12 && class124.field1643 >= var13 && class302.field4326 < var14 && class124.field1643 < var15) {
                                    var21 = true;
                                }
                                if (var9.field1509 != null) {
                                    for (int var22 = 0; var22 < var9.field1509.length; var22++) {
                                        if (class256.field3447[var9.field1509[var22]]) {
                                            if (var9.field1494 == null || class221.field3033 >= var9.field1494[var22]) {
                                                byte var23 = var9.field1525[var22];
                                                if (var23 == 0 || ((var23 & 0x8) == 0 || !class256.field3447[86] && !class256.field3447[82] && !class256.field3447[81]) && ((var23 & 0x2) == 0 || class256.field3447[86]) && ((var23 & 0x1) == 0 || class256.field3447[82]) && ((var23 & 0x4) == 0 || class256.field3447[81])) {
                                                    class134.method801("", (byte) -31, var22 + 1, var9.field1424, -1);
                                                    int var24 = var9.field1464[var22];
                                                    if (var9.field1494 == null) {
                                                        var9.field1494 = new int[var9.field1509.length];
                                                    }
                                                    if (var24 == 0) {
                                                        var9.field1494[var22] = Integer.MAX_VALUE;
                                                    } else {
                                                        var9.field1494[var22] = class221.field3033 + var24;
                                                    }
                                                }
                                            }
                                        } else if (var9.field1494 != null) {
                                            var9.field1494[var22] = 0;
                                        }
                                    }
                                }
                                if (var21) {
                                    class360.method2300(class124.field1643 - var11, class302.field4326 - var10, true, var9);
                                }
                                if (class193.field2632 != null && class193.field2632 != var9 && var19 && method1076(var9).method33((byte) -116)) {
                                    class376.field5507 = var9;
                                }
                                if (class382.field5600 == var9) {
                                    class170.field2378 = true;
                                    class314.field4476 = var10;
                                    class98.field1110 = var11;
                                }
                                if (var9.field1505 || var9.field1538 != 0) {
                                    if (var19 && class247.field3357 != 0 && var9.field1533 != null) {
                                        class191 var25 = new class191();
                                        var25.field2606 = true;
                                        var25.field2605 = var9;
                                        var25.field2609 = class247.field3357;
                                        var25.field2602 = var9.field1533;
                                        class364.field5293.method1125(-1, var25);
                                    }
                                    if (class193.field2632 != null || class189.field2571 != null || class81.field903 || var9.field1538 != 1400 && class366.field5338 > 0) {
                                        var21 = false;
                                        var20 = false;
                                        var19 = false;
                                    }
                                    if (var9.field1538 != 0) {
                                        if (var9.field1538 == 1337 || var9.field1538 == 1403) {
                                            class56.field631 = var9;
                                            if (class434.field6366 != null) {
                                                class434.field6366.method195(class218.field2991, 1, var9.field1498);
                                            }
                                            if (var9.field1538 == 1337) {
                                                if (!class81.field903 && var19) {
                                                    class356.method2269(-22305, class218.field2991);
                                                    for (class213 var26 = (class213) class204.field2796.method1604((byte) 53); var26 != null; var26 = (class213) class204.field2796.method1612(-1)) {
                                                        if (class57.field654 >= var26.field2917 && class57.field654 < var26.field2912 && class48.field562 >= var26.field2910 && class48.field562 < var26.field2904) {
                                                            class448.method2780(true);
                                                            class355.method2267(var26.field2911, 195);
                                                        }
                                                    }
                                                }
                                                class311.method1951(var10, var9, var11, (byte) -71);
                                                continue;
                                            }
                                        }
                                        if (var9.field1538 == 1338) {
                                            if (var9.method678((byte) -120, class218.field2991) == null || class114.field1318 != 0 && class114.field1318 != 3 || class81.field903 || !var19) {
                                                continue;
                                            }
                                            int var27 = class57.field654 - var10;
                                            int var28 = class48.field562 - var11;
                                            int var29 = var9.field1465[var28];
                                            if (var27 < var29 || var27 > var9.field1492[var28] + var29) {
                                                continue;
                                            }
                                            int var30 = var27 - var9.field1552 / 2;
                                            int var31 = var28 - var9.field1498 / 2;
                                            int var32;
                                            if (class231.field3128 == 4) {
                                                var32 = (int) class276.field3893 & 0x3FFF;
                                            } else {
                                                var32 = (int) class276.field3893 + class260.field3585 & 0x3FFF;
                                            }
                                            int var33 = class286.field4025[var32];
                                            int var34 = class286.field4035[var32];
                                            if (class231.field3128 != 4) {
                                                var33 = (class164.field2288 + 256) * var33 >> 8;
                                                var34 = (class164.field2288 + 256) * var34 >> 8;
                                            }
                                            int var35 = var30 * var34 + var31 * var33 >> 15;
                                            int var36 = var31 * var34 - var30 * var33 >> 15;
                                            int var37;
                                            int var38;
                                            if (class231.field3128 == 4) {
                                                var37 = (class355.field5200 >> 7) + (var35 >> 2);
                                                var38 = (class132.field1811 >> 7) - (var36 >> 2);
                                            } else {
                                                int var39 = (class390.field5715.method786((byte) 70) - 1) * 64;
                                                var37 = (class390.field5715.field1304 - var39 >> 7) + (var35 >> 2);
                                                var38 = (class390.field5715.field1311 - var39 >> 7) - (var36 >> 2);
                                            }
                                            if (class271.field3842 && (class289.field4103 & 0x40) != 0) {
                                                class119 var40 = class354.method2262(-128, class24.field243, class199.field2715);
                                                if (var40 == null) {
                                                    class428.method2664(-1);
                                                } else {
                                                    class70.method411(1, class110.field1275, " ->", class338.field5007, 0, var37, var38, 1L);
                                                }
                                                continue;
                                            }
                                            if (class136.field1912 == 1) {
                                                class70.method411(21, class437.field6408, "", -1, 0, var37, var38, 1L);
                                            }
                                            class70.method411(59, class433.field6286, "", -1, 0, var37, var38, 1L);
                                            continue;
                                        }
                                        if (var9.field1538 == 1400) {
                                            class38.field390 = var9;
                                            if (var19) {
                                                class213.field2915 = true;
                                            }
                                            if (var21) {
                                                int var41 = (int) ((double) (class302.field4326 - var10 - var9.field1552 / 2) * 2.0D / (double) class106.field1209);
                                                int var42 = (int) (-((double) (class124.field1643 - var11 - var9.field1498 / 2) * 2.0D / (double) class106.field1209));
                                                int var43 = class221.field3025 + var41 + class106.field1222;
                                                int var44 = class356.field5214 + var42 + class106.field1228;
                                                class95 var45 = class3.method21((byte) -126);
                                                if (var45 == null) {
                                                    continue;
                                                }
                                                int[] var46 = new int[3];
                                                var45.method511(var44, var43, var46, (byte) 125);
                                                if (var46 != null) {
                                                    if (class256.field3447[82] && class56.field642 > 0) {
                                                        class153.method920((byte) -84, var46[2], var46[0], var46[1]);
                                                        continue;
                                                    }
                                                    class56.field635 = true;
                                                    class164.field2291 = var46[0];
                                                    class98.field1097 = var46[1];
                                                    class249.field3395 = var46[2];
                                                }
                                                class366.field5338 = 1;
                                                class397.field5792 = false;
                                                class388.field5682 = class57.field654;
                                                class383.field5619 = class48.field562;
                                                continue;
                                            }
                                            if (var20 && class366.field5338 > 0) {
                                                if (class366.field5338 == 1 && (class57.field654 != class388.field5682 || class48.field562 != class383.field5619)) {
                                                    class139.field1977 = class221.field3025;
                                                    class153.field2152 = class356.field5214;
                                                    class366.field5338 = 2;
                                                }
                                                if (class366.field5338 == 2) {
                                                    class397.field5792 = true;
                                                    class231.method1476((byte) -86, (int) ((double) (class388.field5682 - class57.field654) * 2.0D / (double) class106.field1212) + class139.field1977);
                                                    class88.method477(-27184, class153.field2152 - (int) ((double) (class383.field5619 - class48.field562) * 2.0D / (double) class106.field1212));
                                                }
                                                continue;
                                            }
                                            if (class366.field5338 > 0 && !class397.field5792) {
                                                if ((class354.field5175 == 1 || class247.method1555(0)) && class433.field6324 > 2) {
                                                    class437.method2719(0, 2);
                                                } else if (class231.method1474(-1)) {
                                                    class437.method2719(0, 1);
                                                }
                                            }
                                            class366.field5338 = 0;
                                            continue;
                                        }
                                        if (var9.field1538 == 1401) {
                                            if (var20) {
                                                class238.method1522(class57.field654 - var10, 524, class48.field562 - var11, var9.field1552, var9.field1498);
                                            }
                                            continue;
                                        }
                                        if (var9.field1538 == 1402) {
                                            class101.method543((byte) 120, var9);
                                            continue;
                                        }
                                        if (var9.field1538 == 1406) {
                                            class248.method1559(var9, 0, var11, var10);
                                            continue;
                                        }
                                    }
                                    if (!var9.field1428 && var21) {
                                        var9.field1428 = true;
                                        if (var9.field1507 != null) {
                                            class191 var47 = new class191();
                                            var47.field2606 = true;
                                            var47.field2605 = var9;
                                            var47.field2614 = class302.field4326 - var10;
                                            var47.field2609 = class124.field1643 - var11;
                                            var47.field2602 = var9.field1507;
                                            class364.field5293.method1125(-1, var47);
                                        }
                                    }
                                    if (var9.field1428 && var20 && var9.field1468 != null) {
                                        class191 var48 = new class191();
                                        var48.field2606 = true;
                                        var48.field2605 = var9;
                                        var48.field2614 = class57.field654 - var10;
                                        var48.field2609 = class48.field562 - var11;
                                        var48.field2602 = var9.field1468;
                                        class364.field5293.method1125(-1, var48);
                                    }
                                    if (var9.field1428 && !var20) {
                                        var9.field1428 = false;
                                        if (var9.field1523 != null) {
                                            class191 var49 = new class191();
                                            var49.field2606 = true;
                                            var49.field2605 = var9;
                                            var49.field2614 = class57.field654 - var10;
                                            var49.field2609 = class48.field562 - var11;
                                            var49.field2602 = var9.field1523;
                                            class140.field1986.method1125(-1, var49);
                                        }
                                    }
                                    if (var20 && var9.field1508 != null) {
                                        class191 var50 = new class191();
                                        var50.field2606 = true;
                                        var50.field2605 = var9;
                                        var50.field2614 = class57.field654 - var10;
                                        var50.field2609 = class48.field562 - var11;
                                        var50.field2602 = var9.field1508;
                                        class364.field5293.method1125(-1, var50);
                                    }
                                    if (!var9.field1531 && var19) {
                                        var9.field1531 = true;
                                        if (var9.field1474 != null) {
                                            class191 var51 = new class191();
                                            var51.field2606 = true;
                                            var51.field2605 = var9;
                                            var51.field2614 = class57.field654 - var10;
                                            var51.field2609 = class48.field562 - var11;
                                            var51.field2602 = var9.field1474;
                                            class364.field5293.method1125(-1, var51);
                                        }
                                    }
                                    if (var9.field1531 && var19 && var9.field1559 != null) {
                                        class191 var52 = new class191();
                                        var52.field2606 = true;
                                        var52.field2605 = var9;
                                        var52.field2614 = class57.field654 - var10;
                                        var52.field2609 = class48.field562 - var11;
                                        var52.field2602 = var9.field1559;
                                        class364.field5293.method1125(-1, var52);
                                    }
                                    if (var9.field1531 && !var19) {
                                        var9.field1531 = false;
                                        if (var9.field1572 != null) {
                                            class191 var53 = new class191();
                                            var53.field2606 = true;
                                            var53.field2605 = var9;
                                            var53.field2614 = class57.field654 - var10;
                                            var53.field2609 = class48.field562 - var11;
                                            var53.field2602 = var9.field1572;
                                            class140.field1986.method1125(-1, var53);
                                        }
                                    }
                                    if (var9.field1491 != null) {
                                        class191 var54 = new class191();
                                        var54.field2605 = var9;
                                        var54.field2602 = var9.field1491;
                                        class383.field5617.method1125(-1, var54);
                                    }
                                    if (var9.field1550 != null && class179.field2468 > var9.field1537) {
                                        if (var9.field1518 == null || class179.field2468 - var9.field1537 > 32) {
                                            class191 var59 = new class191();
                                            var59.field2605 = var9;
                                            var59.field2602 = var9.field1550;
                                            class364.field5293.method1125(-1, var59);
                                        } else {
                                            label688: for (int var55 = var9.field1537; var55 < class179.field2468; var55++) {
                                                int var56 = class114.field1325[var55 & 0x1F];
                                                for (int var57 = 0; var57 < var9.field1518.length; var57++) {
                                                    if (var9.field1518[var57] == var56) {
                                                        class191 var58 = new class191();
                                                        var58.field2605 = var9;
                                                        var58.field2602 = var9.field1550;
                                                        class364.field5293.method1125(-1, var58);
                                                        break label688;
                                                    }
                                                }
                                            }
                                        }
                                        var9.field1537 = class179.field2468;
                                    }
                                    if (var9.field1426 != null && class307.field4398 > var9.field1527) {
                                        if (var9.field1601 == null || class307.field4398 - var9.field1527 > 32) {
                                            class191 var64 = new class191();
                                            var64.field2605 = var9;
                                            var64.field2602 = var9.field1426;
                                            class364.field5293.method1125(-1, var64);
                                        } else {
                                            label668: for (int var60 = var9.field1527; var60 < class307.field4398; var60++) {
                                                int var61 = class95.field1066[var60 & 0x1F];
                                                for (int var62 = 0; var62 < var9.field1601.length; var62++) {
                                                    if (var9.field1601[var62] == var61) {
                                                        class191 var63 = new class191();
                                                        var63.field2605 = var9;
                                                        var63.field2602 = var9.field1426;
                                                        class364.field5293.method1125(-1, var63);
                                                        break label668;
                                                    }
                                                }
                                            }
                                        }
                                        var9.field1527 = class307.field4398;
                                    }
                                    if (var9.field1591 != null && class25.field247 > var9.field1567) {
                                        if (var9.field1583 == null || class25.field247 - var9.field1567 > 32) {
                                            class191 var69 = new class191();
                                            var69.field2605 = var9;
                                            var69.field2602 = var9.field1591;
                                            class364.field5293.method1125(-1, var69);
                                        } else {
                                            label648: for (int var65 = var9.field1567; var65 < class25.field247; var65++) {
                                                int var66 = class274.field3875[var65 & 0x1F];
                                                for (int var67 = 0; var67 < var9.field1583.length; var67++) {
                                                    if (var9.field1583[var67] == var66) {
                                                        class191 var68 = new class191();
                                                        var68.field2605 = var9;
                                                        var68.field2602 = var9.field1591;
                                                        class364.field5293.method1125(-1, var68);
                                                        break label648;
                                                    }
                                                }
                                            }
                                        }
                                        var9.field1567 = class25.field247;
                                    }
                                    if (var9.field1575 != null && class123.field1642 > var9.field1602) {
                                        if (var9.field1587 == null || class123.field1642 - var9.field1602 > 32) {
                                            class191 var74 = new class191();
                                            var74.field2605 = var9;
                                            var74.field2602 = var9.field1575;
                                            class364.field5293.method1125(-1, var74);
                                        } else {
                                            label628: for (int var70 = var9.field1602; var70 < class123.field1642; var70++) {
                                                int var71 = class281.field3954[var70 & 0x1F];
                                                for (int var72 = 0; var72 < var9.field1587.length; var72++) {
                                                    if (var9.field1587[var72] == var71) {
                                                        class191 var73 = new class191();
                                                        var73.field2605 = var9;
                                                        var73.field2602 = var9.field1575;
                                                        class364.field5293.method1125(-1, var73);
                                                        break label628;
                                                    }
                                                }
                                            }
                                        }
                                        var9.field1602 = class123.field1642;
                                    }
                                    if (var9.field1588 != null && class362.field5274 > var9.field1457) {
                                        if (var9.field1430 == null || class362.field5274 - var9.field1457 > 32) {
                                            class191 var79 = new class191();
                                            var79.field2605 = var9;
                                            var79.field2602 = var9.field1588;
                                            class364.field5293.method1125(-1, var79);
                                        } else {
                                            label608: for (int var75 = var9.field1457; var75 < class362.field5274; var75++) {
                                                int var76 = class112.field1296[var75 & 0x1F];
                                                for (int var77 = 0; var77 < var9.field1430.length; var77++) {
                                                    if (var9.field1430[var77] == var76) {
                                                        class191 var78 = new class191();
                                                        var78.field2605 = var9;
                                                        var78.field2602 = var9.field1588;
                                                        class364.field5293.method1125(-1, var78);
                                                        break label608;
                                                    }
                                                }
                                            }
                                        }
                                        var9.field1457 = class362.field5274;
                                    }
                                    if (class375.field5480 > var9.field1577 && var9.field1517 != null) {
                                        class191 var80 = new class191();
                                        var80.field2605 = var9;
                                        var80.field2602 = var9.field1517;
                                        class364.field5293.method1125(-1, var80);
                                    }
                                    if (class367.field5362 > var9.field1577 && var9.field1574 != null) {
                                        class191 var81 = new class191();
                                        var81.field2605 = var9;
                                        var81.field2602 = var9.field1574;
                                        class364.field5293.method1125(-1, var81);
                                    }
                                    if (class59.field709 > var9.field1577 && var9.field1477 != null) {
                                        class191 var82 = new class191();
                                        var82.field2605 = var9;
                                        var82.field2602 = var9.field1477;
                                        class364.field5293.method1125(-1, var82);
                                    }
                                    if (class418.field6011 > var9.field1577 && var9.field1502 != null) {
                                        class191 var83 = new class191();
                                        var83.field2605 = var9;
                                        var83.field2602 = var9.field1502;
                                        class364.field5293.method1125(-1, var83);
                                    }
                                    if (class256.field3434 > var9.field1577 && var9.field1570 != null) {
                                        class191 var84 = new class191();
                                        var84.field2605 = var9;
                                        var84.field2602 = var9.field1570;
                                        class364.field5293.method1125(-1, var84);
                                    }
                                    var9.field1577 = class418.field6013;
                                    if (var9.field1543 != null) {
                                        for (int var85 = 0; var85 < class12.field127; var85++) {
                                            class191 var86 = new class191();
                                            var86.field2605 = var9;
                                            var86.field2611 = class191.field2599[var85];
                                            var86.field2616 = class392.field5737[var85];
                                            var86.field2602 = var9.field1543;
                                            class364.field5293.method1125(-1, var86);
                                        }
                                    }
                                    if (class366.field5343 && var9.field1451 != null) {
                                        class191 var87 = new class191();
                                        var87.field2605 = var9;
                                        var87.field2602 = var9.field1451;
                                        class364.field5293.method1125(-1, var87);
                                    }
                                }
                                if (var9.field1535 == 5 && var9.field1437 != -1) {
                                    var9.method683(-4968).method195(class218.field2991, 1, var9.field1498);
                                }
                            }
                            if (!var9.field1475 && class193.field2632 == null && class189.field2571 == null && !class81.field903) {
                                if ((var9.field1423 >= 0 || var9.field1444 != 0) && class57.field654 >= var12 && class48.field562 >= var13 && class57.field654 < var14 && class48.field562 < var15) {
                                    if (var9.field1423 >= 0) {
                                        class193.field2639 = arg0[var9.field1423];
                                    } else {
                                        class193.field2639 = var9;
                                    }
                                }
                                if (var9.field1535 == 8 && class57.field654 >= var12 && class48.field562 >= var13 && class57.field654 < var14 && class48.field562 < var15) {
                                    class272.field3849 = var9;
                                }
                                if (var9.field1593 > var9.field1498) {
                                    class191.method1221(8, var11, var9.field1552 + var10, var9.field1498, var9.field1593, var9, class48.field562, class57.field654);
                                }
                            }
                            class81.method453(var11, arg5, var9, var10, arg4, arg2, -1, arg3);
                            if (var9.field1535 == 0) {
                                method1068(arg0, var9.field1424, var12, var13, var14, var15, var10 - var9.field1501, var11 - var9.field1467);
                                if (var9.field1460 != null) {
                                    method1068(var9.field1460, var9.field1424, var12, var13, var14, var15, var10 - var9.field1501, var11 - var9.field1467);
                                }
                                class201 var88 = (class201) class396.field5783.method1204((byte) -89, (long) var9.field1424);
                                if (var88 != null) {
                                    if (var88.field2771 == 0 && !class81.field903 && var19 && !class267.field3764) {
                                        class448.method2780(true);
                                    }
                                    class166.method1100(var12, var88.field2776, var11, var14, false, var10, var15, var13);
                                }
                            }
                        }
                    }
                } else if (var12 < var14 && var13 < var15) {
                    class81.method453(var11, arg5, var9, var10, arg4, arg2, -1, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    private final void method1069(byte arg0) {
        if (arg0 < 53) {
            return;
        }
        field2310++;
        boolean var2 = class355.field5204.method1414(-4953);
        if (!var2) {
            this.method1079(44);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lml;B)V")
    public static final void method1070(class219 arg0, byte arg1) {
        field2313++;
        if (class19.field202 == null) {
            return;
        }
        class265 var2 = null;
        if (arg0.field3000 == 0) {
            var2 = (class265) class204.method1300(arg0.field2998, arg0.field3005, arg0.field2995);
        }
        if (arg1 < 58) {
            return;
        }
        if (arg0.field3000 == 1) {
            var2 = (class265) class338.method2176(arg0.field2998, arg0.field3005, arg0.field2995);
        }
        if (arg0.field3000 == 2) {
            var2 = (class265) class310.method1944(arg0.field2998, arg0.field3005, arg0.field2995, field2316 == null ? (field2316 = method1088("sl")) : field2316);
        }
        if (arg0.field3000 == 3) {
            var2 = (class265) class122.method689(arg0.field2998, arg0.field3005, arg0.field2995);
        }
        if (var2 == null) {
            arg0.field3007 = 0;
            arg0.field2997 = 0;
            arg0.field3006 = -1;
        } else {
            arg0.field3006 = var2.method225(121);
            arg0.field3007 = var2.method210(-23890);
            arg0.field2997 = var2.method214(-123);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field2304++;
        if (!this.method1484((byte) -127)) {
            return;
        }
        class246.field3337 = Integer.parseInt(this.getParameter("worldid"));
        class213.field2908 = Integer.parseInt(this.getParameter("modewhere"));
        if (class213.field2908 < 0 || class213.field2908 > 1) {
            class213.field2908 = 0;
        }
        class228.field3117 = Integer.parseInt(this.getParameter("modewhat"));
        if (class228.field3117 < 0 || class228.field3117 > 2) {
            class228.field3117 = 0;
        }
        try {
            class297.field4234 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var7) {
            class297.field4234 = 0;
        }
        class191.method1222(-3, class297.field4234);
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class242.field3271 = true;
        } else {
            class242.field3271 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class220.field3019 = true;
        } else {
            class220.field3019 = false;
        }
        String var3 = this.getParameter("game");
        if (var3 != null && var3.equals("1")) {
            class136.field1912 = 1;
        } else {
            class136.field1912 = 0;
        }
        try {
            class404.field5884 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var6) {
            class404.field5884 = 0;
        }
        class266.field3712 = this.getParameter("quiturl");
        class100.field1130 = this.getParameter("settings");
        if (class100.field1130 == null) {
            class100.field1130 = "";
        }
        String var4 = this.getParameter("country");
        if (var4 != null) {
            try {
                class191.field2617 = Integer.parseInt(var4);
            } catch (Exception var5) {
                class191.field2617 = 0;
            }
        }
        class330.field4718 = Integer.parseInt(this.getParameter("colourid"));
        if (class330.field4718 < 0 || class67.field761.length <= class330.field4718) {
            class330.field4718 = 0;
        }
        class407.field5920 = this;
        this.method1483(false, class228.field3117 + 32, 765, 503, 560);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method1071(byte arg0) {
        field2309++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class422.method2616((byte) -85);
        class181.field2480 = new class266(class323.field4554);
        class355.field5204 = new class216();
        if (class228.field3117 != 0) {
            class99.field1114 = new byte[50][];
        }
        class152.method910(class323.field4554, 73);
        if (class213.field2908 == 0) {
            class118.field1397 = this.getCodeBase().getHost();
            class341.field5020 = 43594;
            class300.field4275 = 443;
        } else if (class213.field2908 == 1) {
            class118.field1397 = this.getCodeBase().getHost();
            class341.field5020 = class246.field3337 + 40000;
            class300.field4275 = class246.field3337 + 50000;
        } else if (class213.field2908 == 2) {
            class118.field1397 = "127.0.0.1";
            class300.field4275 = class246.field3337 + 50000;
            class341.field5020 = class246.field3337 + 40000;
        }
        class422.field6065 = class341.field5020;
        class2.field23 = class300.field4275;
        class249.field3394 = class341.field5020;
        class85.field950 = class118.field1397;
        if (class378.field5553 == 3) {
            class23.field229 = class246.field3337;
        }
        if (class136.field1912 == 1) {
            class158.field2243 = 16777215;
            class108.field1248 = class109.field1273;
            class406.field5900 = true;
            class101.field1147 = class327.field4669;
            class198.field2693 = class282.field3964;
            class323.field4559 = class72.field813;
            class217.field2978 = 0;
        } else {
            class108.field1248 = class83.field937;
            class198.field2693 = class51.field584;
            class101.field1147 = class113.field1300;
            class323.field4559 = class412.field5961;
        }
        class118.field1412 = class94.field1039 = class343.field5048 = class397.field5785 = new short[256];
        class375.field5469 = class422.field6065;
        class152.method913((byte) 123);
        class55.method319(class348.field5096, (byte) 98);
        class108.method603((byte) 127, class348.field5096);
        class335.field4924 = class21.method147(5);
        int var3 = -76 % ((arg0 - 60) / 44);
        if (class335.field4924 != null) {
            class335.field4924.method2229(20159, class348.field5096);
        }
        class450.field6570 = class378.field5553;
        try {
            if (class323.field4554.field5561 != null) {
                class239.field3248 = new class412(class323.field4554.field5561, 5200, 0);
                for (int var4 = 0; var4 < 29; var4++) {
                    class260.field3530[var4] = new class412(class323.field4554.field5546[var4], 6000, 0);
                }
                class170.field2387 = new class412(class323.field4554.field5545, 6000, 0);
                class75.field835 = new class93(255, class239.field3248, class170.field2387, 500000);
                class348.field5086 = new class412(class323.field4554.field5547, 24, 0);
                class323.field4554.field5561 = null;
                class323.field4554.field5545 = null;
                class323.field4554.field5547 = null;
                class323.field4554.field5546 = null;
            }
        } catch (IOException var5) {
            class170.field2387 = null;
            class75.field835 = null;
            class239.field3248 = null;
            class348.field5086 = null;
        }
        if (class136.field1912 == 0) {
            class364.field5296 = class171.field2394;
        } else if (class136.field1912 == 1) {
            class364.field5296 = class180.field2473;
        }
        if (class213.field2908 != 0) {
            class101.field1139 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    public static final void method1072(byte arg0) {
        int var1 = 55 % ((arg0 + 70) / 39);
        field2300++;
        for (class219 var2 = (class219) class327.field4643.method1124(-1); var2 != null; var2 = (class219) class327.field4643.method1119(false)) {
            if (var2.field2996 == -1) {
                var2.field2994 = 0;
                method1070(var2, (byte) 70);
            } else {
                var2.method2290((byte) 98);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method1073(byte arg0) {
        field2306++;
        if (class105.field1191 == 1000) {
            return;
        }
        class221.field3033++;
        if ((class221.field3033 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class367.field5366 = var2.get(11) * 600 - (-(var2.get(12) * 10) - var2.get(13) / 6);
            class386.field5650.setSeed((long) class367.field5366);
        }
        if (arg0 != 40) {
            method1061();
        }
        this.method1069((byte) 109);
        if (class222.field3038 != null) {
            class222.field3038.method2357(0);
        }
        class315.method1969(-88);
        class58.method365(-26586);
        class213.method1400(arg0 ^ 0xFFFFFA7E);
        class289.method1850(true);
        if (class218.field2991 != null) {
            class218.field2991.method1007((int) class203.method1299((byte) 5));
        }
        if (class335.field4924 != null) {
            int var3 = class335.field4924.method2227(true);
            class247.field3357 = var3;
        }
        class109.method606(0);
        if (class105.field1191 == 0) {
            this.method1082((byte) 110);
            class277.method1747((byte) -117);
        } else if (class105.field1191 == 5) {
            this.method1082((byte) 107);
            class277.method1747((byte) -82);
        } else if (class105.field1191 == 25 || class105.field1191 == 28) {
            class435.method2706(-107);
        }
        if (class105.field1191 == 10) {
            this.method1060(0);
            class249.method1561(arg0 ^ 0x28);
            class242.method1535(-102);
            class200.method1280(124);
        } else if (class105.field1191 == 30) {
            class373.method2342((byte) 53);
        } else if (class105.field1191 == 40) {
            class200.method1280(98);
            if (class159.field2251 != -3) {
                if (class159.field2251 == 15) {
                    class142.method841(-1);
                } else if (class159.field2251 != 2) {
                    class6.method60((byte) -89);
                }
            }
        }
        class403.method2552((byte) 119, class218.field2991);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljf;)Z")
    public static final boolean method1074(class119 arg0) {
        if (class267.field3764) {
            if (method1076(arg0).field39 != 0) {
                return false;
            }
            if (arg0.field1535 == 0) {
                return false;
            }
        }
        return arg0.field1503;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method1075(int arg0) {
        field2311++;
        if (class400.field5811) {
            class308.method1927((byte) 124);
        }
        if (class218.field2991 != null) {
            class218.field2991.method1153(-9980);
        }
        if (class223.field3042 != null) {
            class19.method132(class223.field3042, class323.field4554, (byte) -8);
            class223.field3042 = null;
        }
        if (class71.field806 != null) {
            class71.field806.field230 = false;
        }
        if (arg0 != 11041) {
            field2307 = null;
        }
        class71.field806 = null;
        if (class330.field4719 != null) {
            class330.field4719.method1503(false);
            class330.field4719 = null;
        }
        class135.method812(class348.field5096, (byte) -59);
        class213.method1398(0, class348.field5096);
        if (class335.field4924 != null) {
            class335.field4924.method2230(class348.field5096, -15174);
        }
        class54.method313(-127);
        class337.method2169((byte) -42);
        class335.field4924 = null;
        if (class225.field3064 != null) {
            class225.field3064.method1868(-29804);
        }
        if (class444.field6488 != null) {
            class444.field6488.method1868(-29804);
        }
        class355.field5204.method1419((byte) -79);
        class181.field2480.method1691(15745);
        if (class180.field2475 != null) {
            class180.field2475.method1262(arg0 ^ 0xFFFFD4A6);
            class180.field2475 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljf;)Ldc;")
    public static final class3 method1076(class119 arg0) {
        class3 var1 = (class3) class302.field4309.method1204((byte) -82, ((long) arg0.field1424 << 32) + (long) arg0.field1495);
        return var1 == null ? arg0.field1443 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(III)I")
    public static final int method1077(int arg0, int arg1, int arg2) {
        field2315++;
        class417 var3 = (class417) class201.field2774.method1204((byte) -109, (long) arg2);
        if (var3 == null) {
            return 0;
        } else if (arg0 >= 0 && var3.field5984.length > arg0) {
            int var4 = -74 % ((-arg1 - 17) / 50);
            return var3.field5984[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
    private final void method1078(int arg0, byte arg1) {
        class182.field2511 = 0;
        int var3 = 103 % ((arg1 - 2) / 39);
        class224.field3057 = null;
        class355.field5204.field2963++;
        class67.field766 = null;
        field2295++;
        class355.field5204.field2965 = arg0;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method1079(int arg0) {
        field2296++;
        if (class71.field803 < class355.field5204.field2963) {
            if (class375.field5469 == class249.field3394) {
                class375.field5469 = class2.field23;
            } else {
                class375.field5469 = class249.field3394;
            }
            class385.field5636 = (class355.field5204.field2963 - 1) * 250;
            if (class385.field5636 > 3000) {
                class385.field5636 = 3000;
            }
            if (class355.field5204.field2963 >= 2 && class355.field5204.field2965 == 6) {
                this.method1493("js5connect_outofdate", -70);
                class105.field1191 = 1000;
                return;
            }
            if (class355.field5204.field2963 >= 4 && class355.field5204.field2965 == -1) {
                this.method1493("js5crc", -115);
                class105.field1191 = 1000;
                return;
            }
            if (class355.field5204.field2963 >= 4 && (class105.field1191 == 0 || class105.field1191 == 5)) {
                if (class355.field5204.field2965 == 7 || class355.field5204.field2965 == 9) {
                    this.method1493("js5connect_full", -118);
                } else if (class355.field5204.field2965 > 0) {
                    this.method1493("js5connect", -69);
                } else {
                    this.method1493("js5io", -83);
                }
                class105.field1191 = 1000;
                return;
            }
        }
        class71.field803 = class355.field5204.field2963;
        int var2 = 67 % ((-arg0 - 25) / 55);
        if (class385.field5636 > 0) {
            class385.field5636--;
            return;
        }
        try {
            if (class182.field2511 == 0) {
                class224.field3057 = class323.field4554.method2380(class375.field5469, -29, class85.field950);
                class182.field2511++;
            }
            if (class182.field2511 == 1) {
                if (class224.field3057.field3268 == 2) {
                    this.method1078(1000, (byte) -75);
                    return;
                }
                if (class224.field3057.field3268 == 1) {
                    class182.field2511++;
                }
            }
            if (class182.field2511 == 2) {
                class67.field766 = new class236((Socket) class224.field3057.field3270, class323.field4554);
                class211 var3 = new class211(5);
                var3.method1396(21375, 15);
                var3.method1361((byte) -118, 560);
                class67.field766.method1511(5, 28067, 0, var3.field2867);
                class182.field2511++;
                class140.field1988 = class203.method1299((byte) 5);
            }
            if (class182.field2511 == 3) {
                if (class105.field1191 == 0 || class105.field1191 == 5 || class67.field766.method1508((byte) -117) > 0) {
                    int var4 = class67.field766.method1509((byte) 26);
                    if (var4 != 0) {
                        this.method1078(var4, (byte) 103);
                        return;
                    }
                    class182.field2511++;
                } else if ((class203.method1299((byte) 5) - class140.field1988) > 30000L) {
                    this.method1078(1001, (byte) -78);
                    return;
                }
            }
            if (class182.field2511 == 4) {
                boolean var5 = class105.field1191 == 5 || class105.field1191 == 10 || class105.field1191 == 28;
                class355.field5204.method1411((byte) 96, !var5, class67.field766);
                class224.field3057 = null;
                class182.field2511 = 0;
                class67.field766 = null;
            }
        } catch (IOException var6) {
            this.method1078(1002, (byte) 106);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method1080(byte arg0) {
        method1083(1);
        field2303++;
        class195.method1240(46);
        class349.method2226(-1);
        class233.method1494((byte) -125);
        class124.method702((byte) 101);
        class71.method416((byte) 117);
        class174.method1147(true);
        class58.method363(75);
        class211.method1389(-31700);
        class236.method1506((byte) 52);
        class216.method1417(false);
        class266.method1693(false);
        class375.method2353((byte) 88);
        class289.method1849((byte) -98);
        class57.method351(-117);
        class412.method2588(-1);
        class93.method497(-120);
        class331.method2048(0);
        class358.method2281(-14075);
        class135.method815((byte) -126);
        class39.method233(-1);
        class95.method510((byte) 105);
        class220.method1436((byte) -85);
        class34.method199(24913);
        class257.method1608(2);
        class119.method671(0);
        class83.method455(-21776);
        class133.method798(108);
        class189.method1210(true);
        class169.method1113(arg0 ^ 0x43);
        class350.method2233((byte) 108);
        class344.method2203((byte) 8);
        class343.method2198((byte) 49);
        class262.method1674(2501);
        class291.method1867((byte) -102);
        class156.method1030((byte) 61);
        class116.method652((byte) 93);
        class182.method1183(arg0 ^ 0xFFFFFFC2);
        class433.method2698(2);
        class196.method1250((byte) 107);
        class302.method1904(-28620);
        class219.method1432(-23);
        class437.method2714(true);
        class201.method1287((byte) -127);
        class3.method32(arg0 - 6547);
        class73.method427(true);
        class277.method1753((byte) 98);
        class200.method1274((byte) -74);
        class393.method2515((byte) -86);
        class319.method1988(64);
        class271.method1722(-1);
        class33.method192((byte) 82);
        class38.method230(53);
        class160.method1049(true);
        class359.method2288((byte) 51);
        class1.method4(0);
        class298.method1884((byte) 101);
        class12.method95(-86);
        class164.method1058((byte) -97);
        class152.method916(true);
        class138.method825(-97);
        class413.method2590(arg0 ^ 0xFFFFFFA8);
        class77.method436(arg0 ^ 0xFFFFB672);
        class261.method1641(arg0 ^ 0xFFFFFFC1);
        class10.method87((byte) 92);
        class282.method1808(arg0 ^ 0xFFFFC3CD);
        class327.method2022((byte) 63);
        class171.method1135((byte) -68);
        class249.method1563(124);
        class403.method2551(-1);
        class335.method2168(arg0 + 8637);
        class260.method1625(arg0 + 63);
        class148.method878(-1);
        class50.method304(69);
        class379.method2411(0);
        class452.method2813(true);
        class32.method183((byte) -119);
        class383.method2456(arg0 + 17115);
        class315.method1971(122);
        class192.method1228((byte) 124);
        class67.method400((byte) 110);
        class149.method889(-28497);
        class51.method306(-21204);
        class334.method2148(-1955814472);
        class172.method1138((byte) -64);
        class308.method1928((byte) -5);
        class175.method1155((byte) 119);
        class162.method1055((byte) -7);
        class168.method1110((byte) -77);
        class287.method1830((byte) -4);
        class253.method1590();
        class43.method267((byte) -7);
        class72.method420(97);
        class142.method842(120);
        class337.method2171(arg0 + 130);
        class207.method1313((byte) -65);
        class20.method136((byte) 0);
        class387.method2475();
        class106.method575();
        class329.method2038((byte) 90);
        class278.method1756(-119);
        class31.method177();
        class108.method600((byte) -37);
        class290.method1856(27661);
        class101.method546((byte) 6);
        class118.method665(25438);
        class70.method413(54);
        class311.method1956((byte) 125);
        class288.method1834(arg0 + 2130182696);
        class264.method1688((byte) 80);
        class176.method1162(-3);
        class396.method2522(true);
        class151.method900(-4645);
        class360.method2303(arg0 ^ 0x52);
        class8.method72(64);
        class247.method1556(128);
        class270.method1720((byte) -23);
        class377.method2377((byte) 87);
        class100.method540(0);
        class283.method1810(63);
        class444.method2748(88);
        class450.method2796(arg0 ^ 0xFFFFC20C);
        class286.method1822(arg0 ^ 0x6D);
        class300.method1892(arg0 + 175);
        class7.method71((byte) -53);
        class158.method1041(arg0 ^ 0x43);
        class373.method2344(1);
        class123.method694((byte) 60);
        class97.method526(-67);
        class376.method2364(14);
        class269.method1709(2);
        class144.method849((byte) -75);
        class251.method1570(false);
        class422.method2617(1);
        class52.method310(-104);
        class442.method2738(true);
        class333.method2137();
        class139.method830(-4);
        class305.method1913(arg0 ^ 0xFFFFFFC7);
        class204.method1301(250);
        class191.method1225(false);
        class246.method1552(2);
        class113.method626(14577);
        class330.method2039((byte) -50);
        class19.method133(false);
        class447.method2771(16383);
        class389.method2481();
        class314.method1961(-1);
        class306.method1918((byte) -26);
        class66.method395((byte) 125);
        class240.method1530((byte) -60);
        class436.method2709(205);
        class143.method845(false);
        class299.method1890(-22560);
        class362.method2306((byte) 105);
        class238.method1525(0);
        class153.method918((byte) -76);
        class390.method2494(-17204);
        class428.method2663((byte) 108);
        class417.method2595(64);
        class228.method1464(true);
        class244.method1542(0);
        class307.method1922(arg0 - 12179);
        class338.method2178((byte) 17);
        class348.method2215((byte) 86);
        class81.method449((byte) 123);
        class41.method257(9048);
        class134.method802((byte) 75);
        class443.method2747(8776);
        class418.method2600(9985);
        class368.method2321();
        class132.method784(arg0 + 64);
        class45.method283(18943);
        class213.method1397((byte) -35);
        class426.method2657((byte) 119);
        class227.method1463(arg0 + 10645);
        class326.method2006(8308);
        class59.method368(-31);
        class99.method534((byte) -55);
        class111.method614(24482);
        class407.method2566(true);
        class354.method2256(1);
        class75.method430((byte) -36);
        class37.method220(arg0 ^ 0x3E);
        if (arg0 != -64) {
            field2307 = null;
        }
        class323.method1996(1);
        class140.method832((byte) 82);
        class88.method478(21021);
        class394.method2517();
        class35.method202(128);
        class382.method2453(123);
        class221.method1440(false);
        class215.method1403(-33);
        class178.method1167(8);
        class339.method2184(799756972);
        class237.method1512(true);
        class112.method618(-9536);
        class188.method1199((byte) -71);
        class429.method2670();
        class137.method821(0);
        class274.method1738(9);
        class48.method296((byte) 38);
        class239.method1527(arg0 ^ 0xFFFFF6BB);
        class281.method1803(true);
        class130.method780(24783);
        class78.method443(-3);
        class316.method1973();
        class296.method1875();
        class87.method474(arg0 ^ 0xFFFFFFC0);
        class173.method1142(-22155);
        class252.method1579(7251);
        class157.method1035(false);
        class206.method1305(-94);
        class193.method1231((byte) -127);
        class324.method2000(1);
        class310.method1949(arg0 + 8255);
        class92.method495((byte) 101);
        class125.method712();
        class202.method1296();
        class147.method873(arg0 - 20976);
        class309.method1937();
        class397.method2524(0);
        class115.method637(0);
        class410.method2577(arg0 - 34);
        class351.method2235(-1);
        class400.method2532(-13064);
        class2.method16(111);
        class297.method1878((byte) -43);
        class170.method1130((byte) 122);
        class180.method1174(-1);
        class186.method1195((byte) 113);
        class245.method1545(65535);
        class155.method1026(-109);
        class166.method1101((byte) 115);
        class272.method1725(arg0 ^ 0xFFFFFF85);
        class401.method2537(arg0 ^ 0x6D);
        class105.method563(false);
        class225.method1456(-17830);
        class384.method2461((byte) 119);
        class222.method1446((byte) -97);
        class198.method1265((byte) 115);
        class402.method2544((byte) 46);
        class267.method1701((byte) 2);
        class318.method1975(-95);
        class392.method2497(arg0 ^ 0xFFFFFFB3);
        class256.method1603(-15984);
        class294.method1869(-11331);
        class150.method893(false);
        class94.method506(arg0 - 26065);
        class6.method56(true);
        class448.method2782(arg0 + 191);
        class114.method628(arg0 ^ 0x3E);
        class366.method2315(arg0 + 154);
        class96.method517(true);
        class223.method1448(2);
        class21.method145(4096);
        class218.method1430(-1);
        class440.method2734((byte) -94);
        class146.method870(127);
        class98.method527(true);
        class122.method687((byte) 102);
        class406.method2565(true);
        class369.method2331(-3);
        class355.method2268(29980);
        class356.method2275(64);
        class275.method1741(-8576);
        class42.method262(8);
        class420.method2611(0);
        class217.method1423((byte) 30);
        class103.method560(arg0 + 64);
        class224.method1453((byte) -52);
        class419.method2604((byte) 95);
        class109.method608(arg0 + 22932);
        class54.method316((byte) -104);
        class427.method2662(true);
        class231.method1475((byte) 111);
        class56.method323(true);
        class279.method1763(false);
        class85.method461(0);
        class388.method2480(-646);
        class126.method771();
        class69.method406();
        class372.method2334(-1);
        class301.method1899(82);
        class181.method1177(arg0 ^ 0xFFFFFFC0);
        class16.method108((byte) 123);
        class24.method153(true);
        class110.method611(arg0 ^ 0xFFFFFF97);
        class26.method158((byte) 69);
        class364.method2308(true);
        class341.method2188(true);
        class63.method385(arg0 - 4471);
        class423.method2624(-118);
        class303.method1907(-3);
        class248.method1560(0);
        class386.method2467(2116935560);
        class268.method1705(arg0 - 24902);
        class424.method2627(false);
        class159.method1044(1);
        class179.method1171(0);
        class435.method2703(arg0 - 19705);
        class226.method1457(arg0 ^ 0xFFFFFFC1);
        class30.method171(true);
        class434.method2701(arg0 ^ 0x45);
        class40.method251(false);
        class136.method818((byte) 114);
        class102.method551(-105);
        if (class233.field3184) {
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method1081() {
        class307.field4391 = 0;
        for (int var0 = 0; var0 < class426.field6168; var0++) {
            class358 var1 = class81.field917[class201.field2770[var0]];
            if (var1.field6287 && var1.method791(-66) != -1) {
                int var2 = (var1.method786((byte) 70) - 1) * 64 + 60;
                int var3 = var1.field1304 - var2 >> 7;
                int var4 = var1.field1311 - var2 >> 7;
                class433 var5 = class355.method2266(class410.field5931, 25279, var4, var3);
                if (var5 != null) {
                    int var6 = var5.field6279;
                    if (var5 instanceof class358) {
                        var6 += 2048;
                    }
                    if (var5.field6266 == 0 && var5.method791(-92) != -1) {
                        class397.field5791[class307.field4391] = var6;
                        class419.field6024[class307.field4391] = var6;
                        class307.field4391++;
                        var5.field6266++;
                    }
                    class397.field5791[class307.field4391] = var6;
                    class419.field6024[class307.field4391] = var1.field6279 + 2048;
                    class307.field4391++;
                    var5.field6266++;
                }
            }
        }
        class72.method423(0, class419.field6024, class397.field5791, (byte) 90, class307.field4391 - 1);
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
    private final void method1082(byte arg0) {
        if (!class152.field2133) {
            label227: while (true) {
                do {
                    if (!class115.method641((byte) -122)) {
                        break label227;
                    }
                } while (class295.field4219 != 's' && class295.field4219 != 'S');
                class152.field2133 = true;
            }
        }
        field2299++;
        if (class417.field5989 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class203.method1299((byte) 5);
            if (class277.field3897 == 0L) {
                class277.field3897 = var4;
            }
            if (var3 > 16384 && (var4 - class277.field3897) < 5000L) {
                if (var4 - class406.field5901 > 1000L) {
                    System.gc();
                    class406.field5901 = var4;
                }
                class155.field2206 = 5;
                class132.field1813 = class50.field583;
            } else {
                class417.field5989 = 10;
                class155.field2206 = 5;
                class132.field1813 = class224.field3060;
            }
        } else if (class417.field5989 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class54.field613[var6] = class367.method2318(class279.field3935, (byte) -97, class164.field2287);
            }
            class155.field2206 = 10;
            class417.field5989 = 20;
            class132.field1813 = class34.field331;
        } else if (class417.field5989 == 20) {
            if (class222.field3038 == null) {
                class222.field3038 = new class375(class355.field5204, class181.field2480);
            }
            if (class222.field3038.method2354((byte) 89)) {
                class350.field5114 = class88.method480(0, false, true, 67, 1);
                class335.field4932 = class88.method480(1, false, true, -128, 1);
                class324.field4574 = class88.method480(2, false, true, 51, 1);
                class220.field3018 = class88.method480(3, false, true, 35, 1);
                class151.field2113 = class88.method480(4, false, true, -73, 1);
                class282.field3968 = class88.method480(5, true, true, 90, 1);
                class354.field5165 = class88.method480(6, true, false, -94, 1);
                class144.field2031 = class88.method480(7, false, true, -124, 1);
                class92.field1012 = class88.method480(8, false, true, -95, 1);
                class105.field1199 = class88.method480(9, false, true, 110, 1);
                class118.field1403 = class88.method480(10, false, true, 4, 1);
                class213.field2919 = class88.method480(11, false, true, 73, 1);
                class78.field889 = class88.method480(12, false, true, -119, 1);
                class323.field4546 = class88.method480(13, false, true, -80, 1);
                class3.field41 = class88.method480(14, false, false, 22, 1);
                class303.field4336 = class88.method480(15, false, true, -112, 1);
                class162.field2280 = class88.method480(16, false, true, -105, 1);
                class151.field2129 = class88.method480(17, false, true, 104, 1);
                class364.field5295 = class88.method480(18, false, true, 24, 1);
                class362.field5273 = class88.method480(19, false, true, 29, 1);
                class6.field70 = class88.method480(20, false, true, -119, 1);
                class8.field98 = class88.method480(21, false, true, -106, 1);
                class318.field4502 = class88.method480(22, false, true, -89, 1);
                class54.field611 = class88.method480(23, true, true, 20, 1);
                class101.field1133 = class88.method480(24, false, true, -115, 1);
                class97.field1093 = class88.method480(25, false, true, 33, 1);
                class134.field1883 = class88.method480(26, true, true, 108, 1);
                class132.field1809 = class88.method480(27, false, true, 65, 1);
                class341.field5016 = class88.method480(28, true, true, 74, 1);
                class132.field1813 = class437.field6409;
                class155.field2206 = 15;
                class417.field5989 = 30;
            } else {
                class155.field2206 = 12;
                class132.field1813 = class115.field1333;
            }
        } else if (class417.field5989 == 30) {
            int var7 = 0;
            for (int var8 = 0; var8 < 29; var8++) {
                var7 += class59.field713[var8].method1847((byte) 9) * class227.field3102[var8] / 100;
            }
            if (var7 == 100) {
                class132.field1813 = class54.field614;
                class155.field2206 = 20;
                class278.method1758(56, class92.field1012);
                class200.method1282(-8291, class92.field1012);
                class417.field5989 = 40;
            } else {
                class155.field2206 = 20;
                if (var7 != 0) {
                    class132.field1813 = class101.field1135 + var7 + "%";
                }
            }
        } else if (class417.field5989 == 40) {
            if (class341.field5016.method357(6)) {
                this.method1064(class341.field5016.method348(1, 0), -121);
                class132.field1813 = class216.field2955;
                class417.field5989 = 50;
                class155.field2206 = 25;
            } else {
                class132.field1813 = class39.field411 + class341.field5016.method329(-2) + "%";
                class155.field2206 = 25;
            }
        } else if (class417.field5989 == 50) {
            class45.method285(22050, 2, class159.field2255, 48000);
            class153.field2153 = new class262();
            class153.field2153.method1658(9, 652122856, 128);
            class225.field3064 = class444.method2751(class323.field4554, (byte) -87, 22050, class348.field5096, 0);
            class225.field3064.method1865(class153.field2153, 57);
            class423.method2625(false, class151.field2113, class303.field4336, class153.field2153, class3.field41);
            class444.field6488 = class444.method2751(class323.field4554, (byte) -123, 2048, class348.field5096, 1);
            class135.field1884 = new class451();
            class444.field6488.method1865(class135.field1884, 59);
            class206.field2802 = new class156(22050, class233.field3158);
            class67.field765 = class354.field5165.method332("scape main", -1);
            class132.field1813 = class200.field2743;
            class155.field2206 = 30;
            class417.field5989 = 60;
        } else if (class417.field5989 == 60) {
            int var9 = class30.method168((byte) -99, class323.field4546, class92.field1012);
            int var10 = class245.method1548(false);
            if (var10 > var9) {
                class132.field1813 = class77.field863 + var9 * 100 / var10 + "%";
                class155.field2206 = 35;
            } else {
                class417.field5989 = 70;
                class132.field1813 = class221.field3032;
                class155.field2206 = 35;
            }
        } else if (class417.field5989 == 70) {
            int var11 = class356.method2273(-75, class92.field1012);
            int var12 = class174.method1151(true);
            if (var12 > var11) {
                class132.field1813 = class10.field121 + var11 * 100 / var12 + "%";
                class155.field2206 = 40;
            } else {
                class417.field5989 = 80;
                class132.field1813 = class348.field5084;
                class155.field2206 = 40;
            }
        } else if (class417.field5989 == 80) {
            if (class134.field1883.method357(6)) {
                class225.field3070 = new class118(class134.field1883, class105.field1199, class92.field1012);
                class132.field1813 = class311.field4444;
                class155.field2206 = 45;
                class417.field5989 = 90;
            } else {
                class132.field1813 = class193.field2641 + class134.field1883.method329(-2) + "%";
                class155.field2206 = 45;
            }
        } else if (class417.field5989 == 90) {
            class132.field1813 = class442.field6459;
            class417.field5989 = 95;
            class155.field2206 = 50;
        } else if (class417.field5989 == 95) {
            if (class152.field2133) {
                class288.field4081 = 1;
                class166.field2336 = 0;
                class384.field5630 = 0;
                class264.field3709 = 0;
                class169.field2373 = 0;
            }
            class152.field2133 = true;
            class193.method1232(27875, class323.field4554);
            class176.method1163((byte) 111);
            class123.method700(false, class264.field3709, (byte) 91);
            class155.field2206 = 55;
            class417.field5989 = 100;
            class132.field1813 = class88.field984;
        } else if (arg0 > 36) {
            if (class417.field5989 == 100) {
                class334.method2151(class218.field2991, class92.field1012, (byte) -117, class323.field4546);
                class155.field2206 = 60;
                class132.field1813 = class359.field5245;
                class266.method1695(5, (byte) -97);
                class417.field5989 = 110;
            } else if (class417.field5989 == 110) {
                byte var13 = 0;
                class324.field4574.method357(6);
                int var14 = var13 + class324.field4574.method329(-2);
                class162.field2280.method357(6);
                int var15 = var14 + class162.field2280.method329(-2);
                class151.field2129.method357(6);
                int var16 = var15 + class151.field2129.method329(-2);
                class364.field5295.method357(6);
                int var17 = var16 + class364.field5295.method329(-2);
                class362.field5273.method357(6);
                int var18 = var17 + class362.field5273.method329(-2);
                class6.field70.method357(6);
                int var19 = var18 + class6.field70.method329(-2);
                class8.field98.method357(6);
                int var20 = var19 + class8.field98.method329(-2);
                class318.field4502.method357(6);
                int var21 = var20 + class318.field4502.method329(-2);
                class101.field1133.method357(6);
                int var22 = var21 + class101.field1133.method329(-2);
                class97.field1093.method357(6);
                int var23 = var22 + class97.field1093.method329(-2);
                class132.field1809.method357(6);
                int var24 = var23 + class132.field1809.method329(-2);
                if (var24 < 1100) {
                    class155.field2206 = 65;
                    class132.field1813 = class155.field2217 + var24 / 11 + "%";
                } else {
                    class274.method1733(class324.field4574, (byte) -23);
                    class224.method1454(4018, class324.field4574);
                    class237.method1516((byte) -19, class324.field4574);
                    class68.method403(class324.field4574, class144.field2031, 3);
                    class148.method884(2, class162.field2280, class144.field2031, true);
                    class342.method2192(false, class144.field2031, class364.field5295, true);
                    class101.method547(true, class144.field2031, class362.field5273, -3905);
                    class327.method2011((byte) -122, class324.field4574);
                    class384.method2459(class6.field70, class335.field4932, class350.field5114, -23);
                    method1063(-106, class324.field4574);
                    class184.method1192(class8.field98, -17110, class144.field2031);
                    class158.method1037(class318.field4502, 102);
                    class143.method844(class324.field4574, 16);
                    class308.method1930(class92.field1012, class220.field3018, class323.field4546, class144.field2031, false);
                    class238.method1523(24047, class324.field4574);
                    class434.method2700(class151.field2129, 17634);
                    class450.method2794(new class300(), class101.field1133, (byte) 117, class97.field1093);
                    class355.method2263(false, class97.field1093, class101.field1133);
                    class264.method1687(class324.field4574, 14816);
                    class16.method111(0, class324.field4574);
                    class375.method2355(class324.field4574, 32);
                    class291.method1862(class324.field4574, true, class92.field1012);
                    class307.method1925(class92.field1012, 95, class324.field4574);
                    class435.method2704(class324.field4574, -6941);
                    class1.method8(class324.field4574, true, class92.field1012);
                    class277.method1749(class324.field4574, 19);
                    class427.method2661(15, class324.field4574);
                    class132.field1813 = class369.field5416;
                    class155.field2206 = 65;
                    class40.method249(-124);
                    class417.field5989 = 120;
                }
            } else if (class417.field5989 == 120) {
                int var25 = class329.method2036(class92.field1012, (byte) 78);
                int var26 = class355.method2264(15);
                if (var25 < var26) {
                    class155.field2206 = 70;
                    class132.field1813 = class221.field3026 + var25 * 100 / var26 + "%";
                } else {
                    class71.method418(class92.field1012, class218.field2991, false);
                    class286.method1823(27718, class159.field2247);
                    class132.field1813 = class179.field2470;
                    class155.field2206 = 70;
                    class417.field5989 = 130;
                }
            } else if (class417.field5989 == 130) {
                class71.field806 = new class23();
                class323.field4554.method2386(10, class71.field806, (byte) -55);
                class155.field2206 = 75;
                class417.field5989 = 140;
                class132.field1813 = class420.field6043;
            } else if (class417.field5989 == 140) {
                if (class118.field1403.method340("huffman", false, "")) {
                    class422 var27 = new class422(class118.field1403.method331(0, "", "huffman"));
                    class197.method1263(var27, -24310);
                    class132.field1813 = class72.field810;
                    class417.field5989 = 150;
                    class155.field2206 = 80;
                } else {
                    class132.field1813 = class222.field3040 + "0%";
                    class155.field2206 = 80;
                }
            } else if (class417.field5989 == 150) {
                if (!class220.field3018.method357(6)) {
                    class132.field1813 = class376.field5498 + class220.field3018.method329(-2) * 3 / 4 + "%";
                    class155.field2206 = 85;
                } else if (!class78.field889.method357(6)) {
                    class132.field1813 = class376.field5498 + (class78.field889.method329(-2) / 10 + 75) + "%";
                    class155.field2206 = 85;
                } else if (!class323.field4546.method357(6)) {
                    class132.field1813 = class376.field5498 + (class323.field4546.method329(-2) / 20 + 85) + "%";
                    class155.field2206 = 85;
                } else if (class54.field611.method326(100, "details")) {
                    class106.method587(class54.field611);
                    class117.method662(18035, class132.field1809);
                    class57.method330(-117, class225.field3070, class144.field2031);
                    class132.field1813 = class113.field1302;
                    class155.field2206 = 85;
                    class417.field5989 = 160;
                } else {
                    class132.field1813 = class376.field5498 + (class54.field611.method356(0, "details") / 10 + 90) + "%";
                    class155.field2206 = 85;
                }
            } else if (class417.field5989 == 160) {
                int var28 = class38.method232((byte) 70);
                if (var28 == -1) {
                    class132.field1813 = class244.field3294;
                    class155.field2206 = 90;
                } else if (var28 == 7 || var28 == 9) {
                    this.method1493("worldlistfull", -83);
                    class266.method1695(1000, (byte) 71);
                } else if (class151.field2126) {
                    class417.field5989 = 170;
                    class155.field2206 = 90;
                    class132.field1813 = class358.field5232;
                } else {
                    this.method1493("worldlistio_" + var28, -119);
                    class266.method1695(1000, (byte) -96);
                }
            } else if (class417.field5989 == 170) {
                class160.field2272 = new int[class315.field4483];
                class226.field3082 = new String[class218.field2987];
                class148.field2087 = new boolean[class315.field4483];
                for (int var29 = 0; var29 < class315.field4483; var29++) {
                    if (class108.method604(var29, 127).field3786 == 0) {
                        class148.field2087[var29] = true;
                        class152.field2142++;
                    }
                    class160.field2272[var29] = -1;
                }
                class251.method1572(-101);
                class267.field3737 = class220.field3018.method332("loginscreen", -1);
                class282.field3968.method347(-1, false, true);
                class354.field5165.method347(-1, true, true);
                class92.field1012.method347(-1, true, true);
                class323.field4546.method347(-1, true, true);
                class118.field1403.method347(-1, true, true);
                class220.field3018.method347(-1, true, true);
                class294.field4213 = true;
                class324.field4574.field665 = 2;
                class151.field2129.field665 = 2;
                class162.field2280.field665 = 2;
                class364.field5295.field665 = 2;
                class362.field5273.field665 = 2;
                class6.field70.field665 = 2;
                class8.field98.field665 = 2;
                class175.method1158(-1, -1, -1, class288.field4081, false);
                class155.field2206 = 95;
                class132.field1813 = class20.field208;
                class417.field5989 = 180;
            } else if (class417.field5989 == 180) {
                class77.method435((byte) 14, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public static void method1083(int arg0) {
        field2307 = null;
        if (arg0 != 1) {
            field2307 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "()V")
    public static final void method1084() {
        for (int var0 = -1; var0 < class426.field6168 + class148.field2082; var0++) {
            class433 var1;
            if (var0 < 0) {
                var1 = class390.field5715;
            } else if (var0 < class148.field2082) {
                var1 = class375.field5473[class294.field4217[var0]];
            } else {
                var1 = class81.field917[class201.field2770[var0 - class148.field2082]];
            }
            if (var1.field6329 >= 0) {
                int var2 = var1.method786((byte) 70);
                if ((var2 & 0x1) == 0) {
                    if ((var1.field1304 & 0x7F) != 0 || (var1.field1311 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var1.field1304 & 0x7F) != 64 || (var1.field1311 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var2 == 1) {
                    int var3 = var1.field1304 >> 7;
                    int var4 = var1.field1311 >> 7;
                    if (var1.field6329 > class308.field4407[var3][var4]) {
                        class308.field4407[var3][var4] = var1.field6329;
                        class219.field3010[var3][var4] = 1;
                    } else if (class308.field4407[var3][var4] == var1.field6329) {
                        var10002 = class219.field3010[var3][var4]++;
                    }
                } else {
                    int var5 = (var2 - 1) * 64 + 60;
                    int var6 = var1.field1304 - var5 >> 7;
                    int var7 = var1.field1311 - var5 >> 7;
                    int var8 = var1.field1304 + var5 >> 7;
                    int var9 = var1.field1311 + var5 >> 7;
                    for (int var10 = var6; var10 <= var8; var10++) {
                        for (int var11 = var7; var11 <= var9; var11++) {
                            if (var1.field6329 > class308.field4407[var10][var11]) {
                                class308.field4407[var10][var11] = var1.field6329;
                                class219.field3010[var10][var11] = 1;
                            } else if (class308.field4407[var10][var11] == var1.field6329) {
                                var10002 = class219.field3010[var10][var11]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method1085(int arg0) {
        field2308++;
        if (class105.field1191 == 1000) {
            return;
        }
        long var2 = class377.method2372((byte) -108) / 1000000L - class341.field5025;
        class341.field5025 = class377.method2372((byte) -107) / 1000000L;
        int var4 = 73 % ((49 - arg0) / 44);
        boolean var5 = class32.method185(-1);
        if (var5 && class343.field5049 && class225.field3064 != null) {
            class225.field3064.method1864(2000);
        }
        if (class105.field1191 == 30 || class105.field1191 == 10) {
            if (class160.field2267 != 0L && class203.method1299((byte) 5) > class160.field2267) {
                class175.method1158(class373.field5445, -1, class430.field6235, class23.method151((byte) -82), false);
            } else if (class218.field2991.method927() && class195.field2648) {
                class122.method690(17026);
            }
        }
        if (class223.field3042 == null) {
            Container var6;
            if (class252.field3406 == null) {
                var6 = class323.field4554.field5559;
            } else {
                var6 = class252.field3406;
            }
            int var7 = var6.getSize().width;
            int var8 = var6.getSize().height;
            if (class252.field3406 == var6) {
                Insets var9 = class252.field3406.getInsets();
                var7 -= var9.left + var9.right;
                var8 -= var9.top + var9.bottom;
            }
            if (class356.field5219 != var7 || class384.field5628 != var8) {
                if (class218.field2991 == null || class218.field2991.method935()) {
                    class422.method2616((byte) -85);
                } else {
                    class384.field5628 = var8;
                    class356.field5219 = var7;
                }
                class160.field2267 = class203.method1299((byte) 5) + 500L;
            }
        }
        if (class223.field3042 != null && !class442.field6467 && (class105.field1191 == 30 || class105.field1191 == 10)) {
            class175.method1158(-1, -1, -1, class288.field4081, false);
        }
        boolean var10 = false;
        if (class162.field2285) {
            var10 = true;
            class162.field2285 = false;
        }
        if (var10) {
            class397.method2527((byte) 96);
        }
        if (class218.field2991 != null && class218.field2991.method931() || class23.method151((byte) -113) != 1) {
            class109.method609(-128);
        }
        if (class105.field1191 == 0) {
            class286.method1826(var10, class155.field2206, class112.field1289[class330.field4718], class311.field4435[class330.field4718], class132.field1813, (byte) -44, class67.field761[class330.field4718]);
        } else if (class105.field1191 == 5) {
            class138.method826(var10 | class218.field2991.method931(), class311.field4435[class330.field4718].getRGB(), -32530, class287.field4059, class67.field761[class330.field4718].getRGB(), class112.field1289[class330.field4718].getRGB(), class218.field2991);
        } else if (class105.field1191 == 10) {
            class6.method62((byte) 126);
        } else if (class105.field1191 == 25 || class105.field1191 == 28) {
            if (class260.field3591 == 1) {
                if (class150.field2110 > class223.field3050) {
                    class223.field3050 = class150.field2110;
                }
                int var12 = (class223.field3050 - class150.field2110) * 50 / class223.field3050;
                class289.method1846(class407.field5907 + "<br>(" + var12 + "%)", class2.field20, true, (byte) -79);
            } else if (class260.field3591 == 2) {
                if (class70.field783 > class356.field5217) {
                    class356.field5217 = class70.field783;
                }
                int var11 = (class356.field5217 - class70.field783) * 50 / class356.field5217 + 50;
                class289.method1846(class407.field5907 + "<br>(" + var11 + "%)", class2.field20, true, (byte) -110);
            } else {
                class289.method1846(class407.field5907, class2.field20, true, (byte) -91);
            }
        } else if (class105.field1191 == 30) {
            class92.method496(var2, 1);
        } else if (class105.field1191 == 40) {
            class289.method1846(class402.field5868 + "<br>" + class426.field6177, class2.field20, true, (byte) -115);
        }
        if (class19.field195 == 3) {
            for (int var13 = 0; var13 < class262.field3646; var13++) {
                Rectangle var14 = class281.field3941[var13];
                if (class350.field5115[var13]) {
                    class218.field2991.method1150((byte) 126, var14.y, var14.x, var14.height, var14.width, -1996553985);
                } else if (class270.field3817[var13]) {
                    class218.field2991.method1150((byte) 127, var14.y, var14.x, var14.height, var14.width, -1996554240);
                }
            }
        }
        if (class349.method2225(128)) {
            class6.method61((byte) -22, class218.field2991);
        }
        if ((class105.field1191 == 30 || class105.field1191 == 10) && class19.field195 == 0 && class23.method151((byte) -53) == 1 && !var10 && class378.field5554.equals("1.1")) {
            int var15 = 0;
            for (int var16 = 0; var16 < class262.field3646; var16++) {
                if (class270.field3817[var16]) {
                    class270.field3817[var16] = false;
                    class291.field4195[var15++] = class281.field3941[var16];
                }
            }
            class218.field2991.method978(class291.field4195, var15);
        } else if (class105.field1191 != 0) {
            class218.field2991.method1022();
            for (int var17 = 0; var17 < class262.field3646; var17++) {
                class270.field3817[var17] = false;
            }
        }
        if (class294.field4213) {
            class171.method1134(-115);
        }
        if (class152.field2133 && class105.field1191 == 10 && class424.field6086 != -1) {
            class152.field2133 = false;
            class193.method1232(27875, class323.field4554);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Ljf;)Ljf;")
    public static final class119 method1086(class119 arg0) {
        int var1 = method1076(arg0).method20(-47);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class179.method1170(arg0.field1529, 818041328);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "()V")
    public static final void method1087() {
        for (int var0 = 0; var0 < class279.field3935; var0++) {
            int[] var1 = class308.field4407[var0];
            for (int var2 = 0; var2 < class164.field2287; var2++) {
                var1[var2] = 0;
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1088(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
