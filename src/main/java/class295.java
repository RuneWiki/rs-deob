import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class295 {

    @OriginalMember(owner = "client!or", name = "d", descriptor = "[Ltd;")
    public class106[] field3999 = new class106[8];

    @OriginalMember(owner = "client!or", name = "b", descriptor = "[Lhd;")
    public class17[] field3997 = new class17[100];

    @OriginalMember(owner = "client!or", name = "a", descriptor = "[I")
    public int[] field3996 = new int[3];

    @OriginalMember(owner = "client!or", name = "l", descriptor = "[I")
    public int[] field4007 = new int[100];

    @OriginalMember(owner = "client!or", name = "g", descriptor = "I")
    public static int field4002 = 127;

    @OriginalMember(owner = "client!or", name = "j", descriptor = "I")
    public static int field4005 = 1;

    @OriginalMember(owner = "client!or", name = "c", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!or", name = "f", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!or", name = "h", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!or", name = "i", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!or", name = "k", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!or", name = "m", descriptor = "I")
    public int field4008;

    @OriginalMember(owner = "client!or", name = "n", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!or", name = "q", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!or", name = "o", descriptor = "Ljava/lang/Object;")
    public Object field4010;

    @OriginalMember(owner = "client!or", name = "e", descriptor = "[I")
    public static int[] field4000;

    @OriginalMember(owner = "client!or", name = "p", descriptor = "[[B")
    public static byte[][] field4011;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IIBIIII)V", line = 9)
    public static final void method1732(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = -23 / ((arg2 - 40) / 60);
        for (class198 var8 = (class198) class118.field1467.method986((byte) 115); var8 != null; var8 = (class198) class118.field1467.method984((byte) 91)) {
            if (class234.field3224 >= var8.field2643) {
                var8.method982((byte) 88);
            } else {
                class397.method2484((var8.field2645 << 7) + 64, arg6 >> 1, arg4 >> 1, arg3, var8.field2652 * 2, arg1, (var8.field2644 << 7) + 64, (byte) -75);
                class291.field3957.method1766(552, var8.field2650, arg5 + class155.field1969[0], var8.field2642 | 0xFF000000, 0, class155.field1969[1] + arg0);
            }
        }
        field4004++;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V", line = 40)
    public static final void method1733(int arg0) {
        field4003++;
        if (class422.field6188 > 1) {
            class422.field6188--;
            class17.field167 = class367.field5142;
        }
        if (class192.field2420 > 0) {
            class192.field2420--;
        }
        if (class368.field5151) {
            class368.field5151 = false;
            class104.method557(126);
            return;
        }
        if (!class452.field6586) {
            class382.method2366((byte) -43);
        }
        for (int var1 = 0; var1 < 100 && class308.method1808((byte) -93); var1++) {
        }
        if (class129.field1664 != 30) {
            return;
        }
        class154.method818(78, class281.field3857, (byte) -58);
        Object var2 = class6.field59.field3634;
        synchronized (class6.field59.field3634) {
            if (!class435.field6362) {
                class6.field59.field3642 = 0;
            } else if (class128.field1657 != 0 || class6.field59.field3642 >= 40) {
                class281.field3857.method295(20579, 0);
                class7.field71++;
                class281.field3857.method1386(-222840624, 0);
                int var3 = class281.field3857.field3389;
                int var4 = 0;
                for (int var5 = 0; class6.field59.field3642 > var5 && (class281.field3857.field3389 - var3) < 240; var5++) {
                    var4++;
                    int var6 = class6.field59.field3645[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    int var7 = class6.field59.field3643[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    boolean var8 = false;
                    if (class6.field59.field3645[var5] == -1 && class6.field59.field3643[var5] == -1) {
                        var8 = true;
                        var6 = -1;
                        var7 = -1;
                    }
                    if (class143.field1835 != var7 || class366.field5127 != var6) {
                        int var9 = var7 - class143.field1835;
                        class143.field1835 = var7;
                        int var10 = var6 - class366.field5127;
                        class366.field5127 = var6;
                        if (class423.field6203 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class281.field3857.method1346(120, (class423.field6203 << 12) + (var9 << 6) + var10);
                            class423.field6203 = 0;
                        } else if (class423.field6203 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            class281.field3857.method1386(-222840624, class423.field6203 + 128);
                            var10 += 128;
                            var9 += 128;
                            class281.field3857.method1346(120, (var9 << 8) + var10);
                            class423.field6203 = 0;
                        } else if (class423.field6203 < 32) {
                            class281.field3857.method1386(-222840624, class423.field6203 + 192);
                            if (var8) {
                                class281.field3857.method1357(Integer.MIN_VALUE, 1826838072);
                            } else {
                                class281.field3857.method1357(var6 << 16 | var7, 1826838072);
                            }
                            class423.field6203 = 0;
                        } else {
                            class281.field3857.method1346(117, class423.field6203 + 57344);
                            if (var8) {
                                class281.field3857.method1357(Integer.MIN_VALUE, 1826838072);
                            } else {
                                class281.field3857.method1357(var7 | var6 << 16, 1826838072);
                            }
                            class423.field6203 = 0;
                        }
                    } else if (class423.field6203 < 2047) {
                        class423.field6203++;
                    }
                }
                class281.field3857.method1362(class281.field3857.field3389 - var3, (byte) 103);
                if (class6.field59.field3642 <= var4) {
                    class6.field59.field3642 = 0;
                } else {
                    class6.field59.field3642 -= var4;
                    for (int var11 = 0; var11 < class6.field59.field3642; var11++) {
                        class6.field59.field3643[var11] = class6.field59.field3643[var4 + var11];
                        class6.field59.field3645[var11] = class6.field59.field3645[var4 + var11];
                    }
                }
            }
        }
        if (class128.field1657 != 0) {
            long var12 = (class262.field3580 - class191.field2403) / 50L;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            class191.field2403 = class262.field3580;
            int var14 = class341.field4568;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            int var15 = class96.field1147;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var16 = 0;
            if (class128.field1657 == 2) {
                var16 = 1;
            }
            class310.field4184++;
            int var17 = (int) var12;
            class281.field3857.method295(20579, 217);
            class281.field3857.method1345(122, var15 | var14 << 16);
            class281.field3857.method1376(13, var16 << 15 | var17);
        }
        if (class392.field5646 > 0) {
            class392.field5646--;
        }
        if (class69.field726 && class392.field5646 <= 0) {
            class69.field726 = false;
            class392.field5646 = 20;
            client.field3464++;
            class281.field3857.method295(20579, 7);
            class281.field3857.method1360((int) class41.field432 >> 3, -125);
            class281.field3857.method1376(12, (int) class425.field6241 >> 3);
        }
        if (class58.field609 && !class23.field211) {
            class151.field1911++;
            class23.field211 = true;
            class281.field3857.method295(20579, 113);
            class281.field3857.method1386(-222840624, 1);
        }
        if (!class58.field609 && class23.field211) {
            class23.field211 = false;
            class151.field1911++;
            class281.field3857.method295(20579, 113);
            class281.field3857.method1386(-222840624, 0);
        }
        if (!class114.field1416) {
            class281.field3857.method295(20579, 225);
            class349.field4850++;
            class281.field3857.method1345(125, class8.method39(true));
            class114.field1416 = true;
        }
        if (class293.field3990) {
            class293.field3990 = false;
        } else {
            class125.field1604 /= 2.0F;
        }
        if (class216.field2897) {
            class216.field2897 = false;
        } else {
            class335.field4460 /= 2.0F;
        }
        class419.method2611(125);
        if (class129.field1664 != 30) {
            return;
        }
        class200.method1074((byte) 86);
        class155.method831(-2);
        class154.method822(-114);
        class140.field1793++;
        if (class140.field1793 > 750) {
            class104.method557(127);
            return;
        }
        class337.method1960(0);
        class250.method1390((byte) -117);
        class438.method2720(false);
        for (int var18 = class427.method2644(true, -28232); var18 != -1; var18 = class427.method2644(false, -28232)) {
            class187.method1008(false, var18);
            class320.field4275[class262.method1461(31, class142.field1808++)] = var18;
        }
        for (class40 var19 = class271.method1501(-1872773629); var19 != null; var19 = class271.method1501(-1872773629)) {
            int var20 = var19.method188(24168416);
            int var21 = var19.method194(-13661);
            if (var20 == 1) {
                class142.field1810[var21] = var19.field418;
                class293.field3988 |= class279.field3799[var21];
                class339.field4529[class262.method1461(31, class288.field3925++)] = var21;
            } else if (var20 == 2) {
                class321.field4298[var21] = var19.field408;
                class176.field2200[class262.method1461(class444.field6496++, 31)] = var21;
            } else if (var20 == 3) {
                class194 var22 = class57.method301(var21, (byte) 97);
                if (!var19.field408.equals(var22.field2569)) {
                    var22.field2569 = var19.field408;
                    class204.method1107(var22, (byte) -99);
                }
            } else if (var20 == 4) {
                class194 var40 = class57.method301(var21, (byte) 107);
                int var41 = var19.field418;
                int var42 = var19.field413;
                int var43 = var19.field410;
                if (var40.field2444 != var41 || var40.field2599 != var42 || var40.field2487 != var43) {
                    var40.field2599 = var42;
                    var40.field2487 = var43;
                    var40.field2444 = var41;
                    class204.method1107(var40, (byte) -98);
                }
            } else if (var20 == 5) {
                class194 var39 = class57.method301(var21, (byte) 88);
                if (var19.field418 != var39.field2516 || var19.field418 == -1) {
                    var39.field2508 = 0;
                    var39.field2516 = var19.field418;
                    var39.field2486 = 1;
                    var39.field2463 = 0;
                    class204.method1107(var39, (byte) -122);
                }
            } else if (var20 == 6) {
                int var23 = var19.field418;
                int var24 = var23 >> 10 & 0x1F;
                int var25 = var23 >> 5 & 0x1F;
                int var26 = var23 & 0x1F;
                int var27 = (var25 << 11) + (var24 << 19) + (var26 << 3);
                class194 var28 = class57.method301(var21, (byte) 79);
                if (var28.field2563 != var27) {
                    var28.field2563 = var27;
                    class204.method1107(var28, (byte) -127);
                }
            } else if (var20 == 7) {
                class194 var29 = class57.method301(var21, (byte) 97);
                boolean var30 = var19.field418 == 1;
                if (var29.field2494 != var30) {
                    var29.field2494 = var30;
                    class204.method1107(var29, (byte) -119);
                }
            } else if (var20 == 8) {
                class194 var31 = class57.method301(var21, (byte) 91);
                if (var19.field418 != var31.field2479 || var19.field413 != var31.field2583 || var19.field410 != var31.field2598) {
                    var31.field2598 = var19.field410;
                    var31.field2583 = var19.field413;
                    var31.field2479 = var19.field418;
                    if (var31.field2507 != -1) {
                        if (var31.field2626 > 0) {
                            var31.field2598 = var31.field2598 * 32 / var31.field2626;
                        } else if (var31.field2495 > 0) {
                            var31.field2598 = var31.field2598 * 32 / var31.field2495;
                        }
                    }
                    class204.method1107(var31, (byte) -100);
                }
            } else if (var20 == 9) {
                class194 var32 = class57.method301(var21, (byte) 108);
                if (var19.field418 != var32.field2507 || var19.field413 != var32.field2461) {
                    var32.field2461 = var19.field413;
                    var32.field2507 = var19.field418;
                    class204.method1107(var32, (byte) -118);
                }
            } else if (var20 == 10) {
                class194 var38 = class57.method301(var21, (byte) 75);
                if (var19.field418 != var38.field2548 || var19.field413 != var38.field2448 || var19.field410 != var38.field2557) {
                    var38.field2548 = var19.field418;
                    var38.field2557 = var19.field410;
                    var38.field2448 = var19.field413;
                    class204.method1107(var38, (byte) -99);
                }
            } else if (var20 == 11) {
                class194 var37 = class57.method301(var21, (byte) 117);
                var37.field2553 = var37.field2457 = var19.field413;
                var37.field2562 = var37.field2447 = var19.field418;
                var37.field2570 = 0;
                var37.field2498 = 0;
                class204.method1107(var37, (byte) -93);
            } else if (var20 == 12) {
                class194 var33 = class57.method301(var21, (byte) 81);
                int var34 = var19.field418;
                if (var33 != null && var33.field2492 == 0) {
                    if (var34 > (var33.field2445 - var33.field2460)) {
                        var34 = var33.field2445 - var33.field2460;
                    }
                    if (var34 < 0) {
                        var34 = 0;
                    }
                    if (var33.field2565 != var34) {
                        var33.field2565 = var34;
                        class204.method1107(var33, (byte) -119);
                    }
                }
            } else if (var20 == 13) {
                class194 var36 = class57.method301(var21, (byte) 70);
                var36.field2499 = var19.field418;
            } else if (var20 == 14) {
                class194 var35 = class57.method301(var21, (byte) 93);
                var35.field2603 = var19.field418;
            } else if (var20 == 15) {
                class149.field1894 = var19.field413;
                class324.field4321 = var19.field418;
                class6.field52 = true;
            }
        }
        if (class176.field2201 != 0) {
            class417.field5996 += 20;
            if (class417.field5996 >= 400) {
                class176.field2201 = 0;
            }
        }
        class259.field3526++;
        if (class283.field3873 != null) {
            class419.field6090++;
            if (class419.field6090 >= 15) {
                class204.method1107(class283.field3873, (byte) -103);
                class283.field3873 = null;
            }
        }
        class194 var44 = class222.field2972;
        class194 var45 = class24.field225;
        class222.field2972 = null;
        class256.field3503 = false;
        class296.field4036 = false;
        class428.field6289 = 0;
        class24.field225 = null;
        class432.field6335 = null;
        while (class75.method425(127) && class428.field6289 < 128) {
            if (!class278.method1534(21182) || class429.field6301 != '`' && class429.field6301 != '§') {
                class314.field4208[class428.field6289] = class335.field4461;
                class5.field39[class428.field6289] = class429.field6301;
                class428.field6289++;
            } else if (class263.method1469(20362)) {
                class436.method2700(false);
            } else {
                class376.method2257(false);
            }
        }
        if (class263.method1469(20362)) {
            class111.method589(51);
        }
        class271.field3671 = null;
        class263.method1471(-1, 25570, (class194) null, -1);
        class109.method578((class194) null, -1, (byte) 20, -1);
        if (class272.field3680 != -1) {
            client.method1415(class272.field3680, 0, 3, 0, class337.field4496, 0, 0, class333.field4423);
        }
        class367.field5142++;
        if (class271.field3671 != null) {
            class168.method892(true);
        }
        if (class112.field1407) {
            class281.field3857.method295(20579, 142);
            class267.field3638++;
            class281.field3857.method1345(116, class316.field4222 << 28 | class359.field5067 << 14 | class339.field4520);
            class112.field1407 = false;
        }
        while (true) {
            class425 var46;
            class194 var47;
            class194 var48;
            do {
                var46 = (class425) class292.field3964.method815(12256);
                if (var46 == null) {
                    while (true) {
                        class425 var49;
                        class194 var50;
                        class194 var51;
                        do {
                            var49 = (class425) class367.field5136.method815(12256);
                            if (var49 == null) {
                                while (true) {
                                    class425 var52;
                                    class194 var53;
                                    class194 var54;
                                    do {
                                        var52 = (class425) class204.field2736.method815(12256);
                                        if (var52 == null) {
                                            if (class271.field3671 == null) {
                                                class40.field415 = 0;
                                            }
                                            if (class106.field1313 != null) {
                                                class344.method2007(-125);
                                            }
                                            if (class110.field1357 > 0 && class249.field3361[82] && class249.field3361[81] && class46.field463 != 0) {
                                                int var55 = class263.field3592 - class46.field463;
                                                if (var55 < 0) {
                                                    var55 = 0;
                                                } else if (var55 > 3) {
                                                    var55 = 3;
                                                }
                                                class198.method1061(class427.field6264.field6119[0] + class70.field767, var55, (byte) 39, class291.field3961 + class427.field6264.field6109[0]);
                                            }
                                            class436.method2697((byte) -106);
                                            if (class123.field1558 != null) {
                                                class204.method1107(class123.field1558, (byte) -101);
                                                class398.field5743++;
                                                if (class337.field4493 > (class200.field2689 + 5) || class337.field4493 < (class200.field2689 - 5) || class306.field4146 > (class87.field985 + 5) || class306.field4146 < (class87.field985 - 5)) {
                                                    class374.field5262 = true;
                                                }
                                                if (class268.field3650 == 0) {
                                                    if (class374.field5262 && class398.field5743 >= 5) {
                                                        if (class212.field2878 == class123.field1558 && class249.field3362 != class192.field2421) {
                                                            class194 var56 = class123.field1558;
                                                            byte var57 = 0;
                                                            if (class242.field3301 == 1 && var56.field2455 == 206) {
                                                                var57 = 1;
                                                            }
                                                            if (var56.field2473[class249.field3362] <= 0) {
                                                                var57 = 0;
                                                            }
                                                            if (var57 == 1) {
                                                                int var58 = class192.field2421;
                                                                int var59 = class249.field3362;
                                                                while (var58 != var59) {
                                                                    if (var58 > var59) {
                                                                        var56.method1050(var58, var58 - 1, 115);
                                                                        var58--;
                                                                    } else if (var58 < var59) {
                                                                        var56.method1050(var58, var58 + 1, 105);
                                                                        var58++;
                                                                    }
                                                                }
                                                            } else {
                                                                var56.method1050(class192.field2421, class249.field3362, 126);
                                                            }
                                                            class119.field1489++;
                                                            class281.field3857.method295(20579, 178);
                                                            class281.field3857.method1357(class123.field1558.field2502, 1826838072);
                                                            class281.field3857.method1341(var57, -116);
                                                            class281.field3857.method1346(123, class192.field2421);
                                                            class281.field3857.method1332(-128, class249.field3362);
                                                        }
                                                    } else if ((class56.field566 == 1 || class279.method1547((byte) -121)) && class244.field3323 > 2) {
                                                        class75.method423(2);
                                                    } else if (class244.method1307(-110)) {
                                                        class319.method1842(103);
                                                    }
                                                    class128.field1657 = 0;
                                                    class419.field6090 = 10;
                                                    class123.field1558 = null;
                                                }
                                            }
                                            if (class222.field2972 != var44) {
                                                if (var44 != null) {
                                                    class204.method1107(var44, (byte) -112);
                                                }
                                                if (class222.field2972 != null) {
                                                    class204.method1107(class222.field2972, (byte) -109);
                                                }
                                            }
                                            if (class24.field225 != var45 && class203.field2723 == class195.field2631) {
                                                if (var45 != null) {
                                                    class204.method1107(var45, (byte) -95);
                                                }
                                                if (class24.field225 != null) {
                                                    class204.method1107(class24.field225, (byte) -124);
                                                }
                                            }
                                            if (class24.field225 == null) {
                                                if (class203.field2723 > 0) {
                                                    class203.field2723--;
                                                }
                                            } else if (class195.field2631 > class203.field2723) {
                                                class203.field2723++;
                                                if (class203.field2723 == class195.field2631) {
                                                    class204.method1107(class24.field225, (byte) -126);
                                                }
                                            }
                                            for (int var60 = 0; var60 < 5; var60++) {
                                                int var10002 = class409.field5926[var60]++;
                                            }
                                            int var61 = class282.method1661(16078);
                                            int var62 = class42.method200((byte) -4);
                                            if (arg0 <= 112) {
                                                method1732(-75, 94, (byte) -53, 0, 72, 66, 59);
                                            }
                                            if (var61 > 15000 && var62 > 15000) {
                                                class192.field2420 = 250;
                                                class128.field1653++;
                                                class235.method1274(64, 14500);
                                                class281.field3857.method295(20579, 71);
                                            }
                                            if (class293.field3988 && (class442.method2730(25207) - 60000L) > class128.field1650) {
                                                class360.method2204(0);
                                            }
                                            class87.field989++;
                                            if (class87.field989 > 500) {
                                                class87.field989 = 0;
                                                int var63 = (int) (Math.random() * 8.0D);
                                                if ((var63 & 0x2) == 2) {
                                                    class161.field2066 += class334.field4430;
                                                }
                                                if ((var63 & 0x1) == 1) {
                                                    class183.field2335 += class389.field5562;
                                                }
                                                if ((var63 & 0x4) == 4) {
                                                    class401.field5857 += class327.field4349;
                                                }
                                            }
                                            if (class183.field2335 < -50) {
                                                class389.field5562 = 2;
                                            }
                                            if (class183.field2335 > 50) {
                                                class389.field5562 = -2;
                                            }
                                            if (class161.field2066 < -55) {
                                                class334.field4430 = 2;
                                            }
                                            if (class161.field2066 > 55) {
                                                class334.field4430 = -2;
                                            }
                                            if (class401.field5857 < -40) {
                                                class327.field4349 = 1;
                                            }
                                            if (class401.field5857 > 40) {
                                                class327.field4349 = -1;
                                            }
                                            class17.field169++;
                                            if (class17.field169 > 500) {
                                                class17.field169 = 0;
                                                int var64 = (int) (Math.random() * 8.0D);
                                                if ((var64 & 0x2) == 2) {
                                                    class411.field5937 += class111.field1387;
                                                }
                                                if ((var64 & 0x1) == 1) {
                                                    class136.field1731 += class36.field370;
                                                }
                                            }
                                            if (class136.field1731 < -60) {
                                                class36.field370 = 2;
                                            }
                                            if (class411.field5937 < -20) {
                                                class111.field1387 = 1;
                                            }
                                            if (class136.field1731 > 60) {
                                                class36.field370 = -2;
                                            }
                                            if (class411.field5937 > 10) {
                                                class111.field1387 = -1;
                                            }
                                            class299.field4077++;
                                            if (class299.field4077 > 50) {
                                                class402.field5873++;
                                                class281.field3857.method295(20579, 99);
                                            }
                                            if (class213.field2883) {
                                                class171.method901(106);
                                                class213.field2883 = false;
                                            }
                                            try {
                                                if (class264.field3605 != null && class281.field3857.field3389 > 0) {
                                                    class264.field3605.method1537(class281.field3857.field3406, false, class281.field3857.field3389, 0);
                                                    class281.field3857.field3389 = 0;
                                                    class299.field4077 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var65) {
                                                class104.method557(-100);
                                                return;
                                            }
                                        }
                                        var53 = var52.field6242;
                                        if (var53.field2542 < 0) {
                                            break;
                                        }
                                        var54 = class57.method301(var53.field2470, (byte) 80);
                                    } while (var54 == null || var54.field2620 == null || var53.field2542 >= var54.field2620.length || var54.field2620[var53.field2542] != var53);
                                    class277.method1523(var52);
                                }
                            }
                            var50 = var49.field6242;
                            if (var50.field2542 < 0) {
                                break;
                            }
                            var51 = class57.method301(var50.field2470, (byte) 72);
                        } while (var51 == null || var51.field2620 == null || var51.field2620.length <= var50.field2542 || var51.field2620[var50.field2542] != var50);
                        class277.method1523(var49);
                    }
                }
                var47 = var46.field6242;
                if (var47.field2542 < 0) {
                    break;
                }
                var48 = class57.method301(var47.field2470, (byte) 76);
            } while (var48 == null || var48.field2620 == null || var47.field2542 >= var48.field2620.length || var48.field2620[var47.field2542] != var47);
            class277.method1523(var46);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lur;Z)V", line = 1006)
    public static final void method1734(class91 arg0, boolean arg1) {
        field4006++;
        for (class319 var2 = (class319) class296.field4034.method814((byte) 90); var2 != null; var2 = (class319) class296.field4034.method827(73)) {
            if (var2.field4247 == arg0) {
                if (var2.field4246 != null) {
                    class374.field5265.method2213(var2.field4246);
                    var2.field4246 = null;
                }
                var2.method1967(-1);
                return;
            }
        }
        if (!arg1) {
            method1734((class91) null, false);
        }
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(I)V", line = 1041)
    public static void method1735(int arg0) {
        field4000 = null;
        field4011 = null;
        if (arg0 != -24624) {
            field4002 = 23;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V", line = 1054)
    public static final void method1736(byte arg0) {
        field4012++;
        class114 var1 = class200.field2684;
        synchronized (class200.field2684) {
            class200.field2684.method606((byte) 89);
        }
        if (arg0 <= 18) {
            return;
        }
        class114 var2 = class77.field869;
        synchronized (class77.field869) {
            class77.field869.method606((byte) 76);
        }
        class114 var3 = class12.field111;
        synchronized (class12.field111) {
            class12.field111.method606((byte) 126);
        }
        class114 var4 = class291.field3956;
        synchronized (class291.field3956) {
            class291.field3956.method606((byte) 124);
        }
    }

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(I)V", line = 1092)
    public static final void method1737(int arg0) {
        field3998++;
        if (arg0 < 17) {
            field4005 = 77;
        }
        class114 var1 = class414.field5971;
        synchronized (class414.field5971) {
            class414.field5971.method606((byte) 95);
        }
    }
}
