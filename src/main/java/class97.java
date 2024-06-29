import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class97 extends class110 {

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "[J")
    private long[] field2251 = new long[10];

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "[I")
    public static int[] field2256 = new int[50];

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "Lja;")
    public static class62 field2265 = class30.method243(43, "gr-Un:");

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "I")
    public static int field2264 = 0;

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "Lja;")
    private static class62 field2266 = class30.method243(43, ":");

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
    public static int field2253 = 0;

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "I")
    public static int field2262 = 0;

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "I")
    public static int field2270 = 0;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    private int field2250;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    private int field2252;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "I")
    private int field2267;

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "I")
    private int field2268;

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "J")
    private long field2254;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
    public static void method749(int arg0) {
        field2266 = null;
        if (arg0 != 37) {
            field2270 = -67;
        }
        field2265 = null;
        field2256 = null;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public final void method750(int arg0) {
        this.field2267 = 1;
        this.field2268 = 0;
        field2271++;
        if (arg0 <= 118) {
            return;
        }
        this.field2250 = 256;
        this.field2254 = class26.method209((byte) -42);
        for (int var2 = 0; var2 < 10; var2++) {
            this.field2251[var2] = this.field2254;
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)Z")
    public static final boolean method751(boolean arg0) {
        field2261++;
        if (class59.field1444 == null) {
            return false;
        }
        try {
            int var1 = class59.field1444.method982(-101);
            if (var1 == 0) {
                return false;
            }
            if (class122.field2800 == -1) {
                class59.field1444.method974(1, 0, -103, class38.field879.field2874);
                var1--;
                class38.field879.field2873 = 0;
                class122.field2800 = class38.field879.method806((byte) -112);
                class115.field2651 = class113.field2617[class122.field2800];
            }
            if (class115.field2651 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                var1--;
                class59.field1444.method974(1, 0, -86, class38.field879.field2874);
                class115.field2651 = class38.field879.field2874[0] & 0xFF;
            }
            if (class115.field2651 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                class59.field1444.method974(2, 0, -67, class38.field879.field2874);
                var1 -= 2;
                class38.field879.field2873 = 0;
                class115.field2651 = class38.field879.method1041(212464720);
            }
            if (var1 < class115.field2651) {
                return false;
            }
            class38.field879.field2873 = 0;
            class59.field1444.method974(class115.field2651, 0, -86, class38.field879.field2874);
            class138.field3222 = 0;
            class63.field1571 = class147.field3473;
            class147.field3473 = class53.field1225;
            class53.field1225 = class122.field2800;
            if (class122.field2800 == 131) {
                class38.field879.method1038((byte) -113);
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 171) {
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 89) {
                long var2 = class38.field879.method1030(126);
                class62 var4 = class89.method679(class136.method1091(class38.field879, 33).method449((byte) 96));
                class43.method320(0, 6, var4, class111.method899(false, var2).method462(70));
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 32) {
                int var5 = class38.field879.method1022((byte) 81);
                class137.field3164 = var5;
                class47.method336(24880, var5);
                class110.method889(false, class137.field3164);
                for (int var6 = 0; var6 < 100; var6++) {
                    class18.field416[var6] = true;
                }
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 51) {
                class15.field354 = class38.field879.method1023((byte) 0);
                class60.field1475 = class38.field879.method1025(255);
                while (class38.field879.field2873 < class115.field2651) {
                    class122.field2800 = class38.field879.method1025(255);
                    class29.method230((byte) 95);
                }
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 189) {
                int var7 = class38.field879.method996(15250);
                class102.field2372 = class148.field3481.method303((byte) -113, var7);
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 82) {
                class137.method1100(1);
                class1.field13 = class38.field879.method1025(255);
                class122.field2800 = -1;
                class59.field1447 = class150.field3538;
                return true;
            }
            if (class122.field2800 == 70) {
                class38.field879.method1025(255);
                class38.field879.method1022((byte) 116);
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 20) {
                class38.field879.method1004(-101981656);
                class38.field879.method1018((byte) 80);
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 137) {
                long var8 = class38.field879.method1030(127);
                int var10 = class38.field879.method1041(212464720);
                boolean var11 = false;
                if ((var8 & Long.MIN_VALUE) != 0L) {
                    var11 = true;
                }
                byte var12 = class38.field879.method1028(-115487256);
                if (var11) {
                    if (class115.field2629 == 0) {
                        class122.field2800 = -1;
                        return true;
                    }
                    boolean var13 = false;
                    long var14 = var8 & Long.MAX_VALUE;
                    int var16;
                    for (var16 = 0; class115.field2629 > var16 && (class39.field912[var16].field3493 != var14 || class39.field912[var16].field3022 != var10); var16++) {
                    }
                    if (class115.field2629 > var16) {
                        while (class115.field2629 - 1 > var16) {
                            class39.field912[var16] = class39.field912[var16 + 1];
                            var16++;
                        }
                        class39.field912[class115.field2629] = null;
                        class115.field2629--;
                    }
                } else {
                    class132 var17 = new class132();
                    var17.field3493 = var8;
                    var17.field3026 = class111.method899(false, var17.field3493);
                    var17.field3022 = var10;
                    var17.field3030 = var12;
                    int var18;
                    for (var18 = class115.field2629 - 1; var18 >= 0; var18--) {
                        int var19 = class39.field912[var18].field3026.method470(var17.field3026, 99);
                        if (var19 == 0) {
                            class39.field912[var18].field3022 = var10;
                            class39.field912[var18].field3030 = var12;
                            if (class142.field3316 == var8) {
                                class126.field2853 = var12;
                            }
                            class122.field2800 = -1;
                            return true;
                        }
                        if (var19 < 0) {
                            break;
                        }
                    }
                    if (class115.field2629 >= class39.field912.length) {
                        class122.field2800 = -1;
                        return true;
                    }
                    for (int var20 = class115.field2629 - 1; var20 > var18; var20--) {
                        class39.field912[var20 + 1] = class39.field912[var20];
                    }
                    if (class115.field2629 == 0) {
                        class39.field912 = new class132[100];
                    }
                    class39.field912[var18 + 1] = var17;
                    if (class142.field3316 == var8) {
                        class126.field2853 = var12;
                    }
                    class115.field2629++;
                }
                class122.field2800 = -1;
                class88.field2091 = class86.field2060;
                return true;
            }
            if (class122.field2800 == 114) {
                class26.field625 = class38.field879.method1018((byte) 80) * 30;
                class122.field2800 = -1;
                class59.field1447 = class150.field3538;
                return true;
            }
            if (class122.field2800 == 182) {
                int var21 = class38.field879.method1037(18834);
                class81 var22 = (class81) class16.field372.method537(-1, (long) var21);
                if (var22 != null) {
                    class136.method1093(var22, true, 120);
                }
                if (class119.field2724 != null) {
                    client.method163(class119.field2724, -109);
                    class119.field2724 = null;
                }
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 37) {
                class137.method1100(1);
                int var23 = class38.field879.method1023((byte) 108);
                int var24 = class38.field879.method1032(-986860040);
                int var25 = class38.field879.method1025(255);
                class38.field884[var25] = var24;
                class4.field40[var25] = var23;
                class45.field1035[var25] = 1;
                for (int var26 = 0; var26 < 98; var26++) {
                    if (class96.field2241[var26] <= var24) {
                        class45.field1035[var25] = var26 + 2;
                    }
                }
                class98.field2277[class24.method192(class65.field1625++, 31)] = var25;
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 222) {
                class38.field879.method995(-81);
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 124) {
                int var27 = class38.field879.method1037(18834);
                int var28 = class38.field879.method1041(212464720);
                if (var27 < -70000) {
                    var28 += 32768;
                }
                class54 var29;
                if (var27 >= 0) {
                    var29 = class62.method456(var27, (byte) 105);
                } else {
                    var29 = null;
                }
                if (var29 != null) {
                    for (int var30 = 0; var30 < var29.field1304.length; var30++) {
                        var29.field1304[var30] = 0;
                        var29.field1365[var30] = 0;
                    }
                }
                class122.method968(var28, 0);
                int var31 = class38.field879.method1041(212464720);
                for (int var32 = 0; var32 < var31; var32++) {
                    int var33 = class38.field879.method1022((byte) 94);
                    int var34 = class38.field879.method989(!arg0);
                    if (var34 == 255) {
                        var34 = class38.field879.method1032(-986860040);
                    }
                    if (var29 != null && var32 < var29.field1304.length) {
                        var29.field1304[var32] = var33;
                        var29.field1365[var32] = var34;
                    }
                    class65.method503(var28, var32, var33 - 1, var34, 1);
                }
                if (var29 != null) {
                    client.method163(var29, -94);
                }
                class137.method1100(1);
                class63.field1552[class24.method192(31, class88.field2098++)] = class24.method192(var28, 32767);
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 54) {
                int var35 = class38.field879.method1041(212464720);
                int var36 = class38.field879.method1037(18834);
                class54 var37 = class62.method456(var36, (byte) 74);
                if (var37.field1235 != 2 || var37.field1324 != var35) {
                    var37.field1324 = var35;
                    var37.field1235 = 2;
                    client.method163(var37, -98);
                }
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 99) {
                class60.field1475 = class38.field879.method995(-74);
                class15.field354 = class38.field879.method1025(255);
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 24) {
                int var38 = class38.field879.method1004(-101981656);
                int var39 = var38 >> 10 & 0x1F;
                int var40 = class38.field879.method1020((byte) -99);
                int var41 = var38 >> 5 & 0x1F;
                int var42 = var38 & 0x1F;
                int var43 = (var39 << 19) + (var41 << 11) + (var42 << 3);
                class54 var44 = class62.method456(var40, (byte) 107);
                if (var44.field1254 != var43) {
                    var44.field1254 = var43;
                    client.method163(var44, -93);
                }
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 55) {
                class38.field879.method1015((byte) -104);
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 44) {
                class38.field879.method1004(-101981656);
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 126) {
                int var45 = class38.field879.method996(15250);
                int var46 = class38.field879.method1022((byte) 96);
                int var47 = class38.field879.method1041(212464720);
                int var48 = class38.field879.method1004(-101981656);
                class54 var49 = class62.method456(var45, (byte) 107);
                if (var49.field1267 != var47 || var49.field1282 != var48 || var49.field1312 != var46) {
                    var49.field1282 = var48;
                    var49.field1267 = var47;
                    var49.field1312 = var46;
                    client.method163(var49, -80);
                }
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 120) {
                int var50 = class38.field879.method1023((byte) 112);
                int var51 = class38.field879.method995(-85);
                class62 var52 = class38.field879.method1015((byte) -122);
                if (var51 >= 1 && var51 <= 5) {
                    if (var52.method461(25064, class121.field2781)) {
                        var52 = null;
                    }
                    class4.field53[var51 - 1] = var52;
                    class18.field414[var51 - 1] = var50 == 0;
                }
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 3) {
                int var53 = class38.field879.method1027((byte) 84);
                int var54 = class38.field879.method1031(-127);
                int var55 = class38.field879.method1020((byte) -110);
                class54 var56 = class62.method456(var55, (byte) 117);
                int var57 = var56.field1275 + var54;
                int var58 = var56.field1251 + var53;
                if (var56.field1317 != var57 || var56.field1237 != var58) {
                    var56.field1237 = var58;
                    var56.field1317 = var57;
                    client.method163(var56, -88);
                }
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 242) {
                class62 var59 = class38.field879.method1015((byte) -108);
                if (var59.method438(class63.field1568, true)) {
                    class62 var71 = var59.method445(var59.method467(field2266, (byte) -97), (byte) 97, 0);
                    long var72 = var71.method448(37);
                    boolean var74 = false;
                    for (int var75 = 0; var75 < class100.field2339; var75++) {
                        if (class47.field1077[var75] == var72) {
                            var74 = true;
                            break;
                        }
                    }
                    if (!var74 && class30.field744 == 0) {
                        class43.method320(0, 4, class126.field2854, var71);
                    }
                } else if (var59.method438(class98.field2275, !arg0)) {
                    class62 var66 = var59.method445(var59.method467(field2266, (byte) -72), (byte) -53, 0);
                    long var67 = var66.method448(37);
                    boolean var69 = false;
                    for (int var70 = 0; var70 < class100.field2339; var70++) {
                        if (class47.field1077[var70] == var67) {
                            var69 = true;
                            break;
                        }
                    }
                    if (!var69 && class30.field744 == 0) {
                        class43.method320(0, 8, class126.field2841, var66);
                    }
                } else if (var59.method438(class15.field346, true)) {
                    class62 var60 = var59.method445(var59.method467(field2266, (byte) -53), (byte) -53, 0);
                    long var61 = var60.method448(37);
                    boolean var63 = false;
                    for (int var64 = 0; var64 < class100.field2339; var64++) {
                        if (class47.field1077[var64] == var61) {
                            var63 = true;
                            break;
                        }
                    }
                    if (!var63 && class30.field744 == 0) {
                        class62 var65 = var59.method445(var59.method460((byte) 38) - 9, (byte) -93, var59.method467(field2266, (byte) -116) + 1);
                        class43.method320(0, 8, var65, var60);
                    }
                } else {
                    class43.method320(0, 0, var59, class83.field1991);
                }
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 2) {
                int var76 = class38.field879.method1004(-101981656);
                byte var77 = class38.field879.method1000(-612);
                class65.field1630[var76] = var77;
                if (class24.field598[var76] != var77) {
                    class24.field598[var76] = var77;
                    class22.method169((byte) 123, var76);
                }
                class45.field1021[class24.method192(31, class81.field1958++)] = var76;
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 245) {
                class47.field1094 = true;
                class65.field1586 = class38.field879.method1025(255);
                client.field489 = class38.field879.method1025(255);
                class108.field2506 = class38.field879.method1041(212464720);
                class4.field60 = class38.field879.method1025(255);
                class60.field1453 = class38.field879.method1025(255);
                if (class60.field1453 >= 100) {
                    class81.field1959 = class65.field1586 * 128 + 64;
                    class140.field3248 = client.field489 * 128 + 64;
                    class115.field2649 = class111.method908(128, class81.field1959, class140.field3248, class155.field3598) - class108.field2506;
                }
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 142) {
                for (int var78 = 0; var78 < field2257; var78++) {
                    class56 var79 = class105.method851((byte) -102, var78);
                    if (var79 != null && var79.field1375 == 0) {
                        class65.field1630[var78] = 0;
                        class24.field598[var78] = 0;
                    }
                }
                class137.method1100(1);
                class81.field1958 += 32;
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 38) {
                int var80 = class38.field879.method1025(255);
                int var81 = class38.field879.method1025(255);
                int var82 = class38.field879.method1025(255);
                int var83 = class38.field879.method1025(255);
                class155.field3604[var80] = true;
                class122.field2785[var80] = var81;
                class43.field1002[var80] = var82;
                class26.field611[var80] = var83;
                class149.field3518[var80] = 0;
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 16) {
                int var84 = class38.field879.method996(15250);
                int var85 = class38.field879.method1032(-986860040);
                int var86 = class38.field879.method1004(-101981656);
                if (var86 == 65535) {
                    var86 = -1;
                }
                int var87 = class38.field879.method1041(212464720);
                if (var87 == 65535) {
                    var87 = -1;
                }
                for (int var88 = var86; var88 <= var87; var88++) {
                    long var89 = ((long) var85 << 32) + ((long) var88);
                    class148 var91 = class131.field2992.method537(-1, var89);
                    if (var91 != null) {
                        var91.method1176((byte) -121);
                    }
                    class131.field2992.method538(new class77(var84), (byte) -27, var89);
                }
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 85) {
                boolean var92 = class38.field879.method1023((byte) 99) == 1;
                int var93 = class38.field879.method1020((byte) -117);
                class54 var94 = class62.method456(var93, (byte) 106);
                if (var94.field1265 != var92) {
                    var94.field1265 = var92;
                    client.method163(var94, -105);
                }
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 169) {
                long var95 = class38.field879.method1030(113);
                long var97 = (long) class38.field879.method1041(212464720);
                long var99 = (long) class38.field879.method1026((byte) 84);
                long var101 = (var97 << 32) + var99;
                int var103 = class38.field879.method1025(255);
                boolean var104 = false;
                for (int var105 = 0; var105 < 100; var105++) {
                    if (class15.field357[var105] == var101) {
                        var104 = true;
                        break;
                    }
                }
                if (var103 <= 1) {
                    for (int var106 = 0; var106 < class100.field2339; var106++) {
                        if (class47.field1077[var106] == var95) {
                            var104 = true;
                            break;
                        }
                    }
                }
                if (!var104 && class30.field744 == 0) {
                    class15.field357[class148.field3502] = var101;
                    class148.field3502 = (class148.field3502 + 1) % 100;
                    class62 var107 = class89.method679(class136.method1091(class38.field879, 33).method449((byte) 127));
                    if (var103 == 2 || var103 == 3) {
                        class43.method320(0, 7, var107, class70.method594(new class62[] { class15.field365, class111.method899(false, var95).method462(90) }, 1229));
                    } else if (var103 == 1) {
                        class43.method320(0, 7, var107, class70.method594(new class62[] { class42.field966, class111.method899(arg0, var95).method462(110) }, 1229));
                    } else {
                        class43.method320(0, 3, var107, class111.method899(false, var95).method462(54));
                    }
                }
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 194) {
                class85.field2047 = class38.field879.method1025(255);
                class81.field1954 = class38.field879.method1025(255);
                class121.field2771 = class38.field879.method1025(255);
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 208) {
                class116.field2676 = class38.field879.method1025(255);
                if (class116.field2676 == 1) {
                    class122.field2786 = class38.field879.method1041(212464720);
                }
                if (class116.field2676 >= 2 && class116.field2676 <= 6) {
                    if (class116.field2676 == 2) {
                        class124.field2818 = 64;
                        class48.field1119 = 64;
                    }
                    if (class116.field2676 == 3) {
                        class48.field1119 = 0;
                        class124.field2818 = 64;
                    }
                    if (class116.field2676 == 4) {
                        class124.field2818 = 64;
                        class48.field1119 = 128;
                    }
                    if (class116.field2676 == 5) {
                        class124.field2818 = 0;
                        class48.field1119 = 64;
                    }
                    if (class116.field2676 == 6) {
                        class48.field1119 = 64;
                        class124.field2818 = 128;
                    }
                    class116.field2676 = 2;
                    class82.field1978 = class38.field879.method1041(212464720);
                    class144.field3356 = class38.field879.method1041(212464720);
                    class150.field3527 = class38.field879.method1025(255);
                }
                if (class116.field2676 == 10) {
                    class57.field1391 = class38.field879.method1041(212464720);
                }
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 213) {
                class100.field2339 = class115.field2651 / 8;
                for (int var108 = 0; var108 < class100.field2339; var108++) {
                    class47.field1077[var108] = class38.field879.method1030(120);
                }
                class122.field2800 = -1;
                class5.field102 = class150.field3538;
                return true;
            }
            if (class122.field2800 == 66) {
                class146.field3444 = 0;
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 68) {
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 231) {
                int var109 = class38.field879.method1022((byte) 87);
                int var110 = class38.field879.method1020((byte) -104);
                int var111 = class38.field879.method1018((byte) 80);
                class54 var112 = class62.method456(var110, (byte) 109);
                class122.field2800 = -1;
                var112.field1297 = (var111 << 16) + var109;
                return true;
            }
            if (class122.field2800 == 160) {
                class39.method294((byte) -126);
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 50) {
                class47.method334(class148.field3481, false, class115.field2651, class38.field879);
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 62) {
                class62 var113 = class38.field879.method1015((byte) -70);
                Object[] var114 = new Object[var113.method460((byte) 38) + 1];
                for (int var115 = var113.method460((byte) 38) - 1; var115 >= 0; var115--) {
                    if (var113.method446((byte) -15, var115) == 115) {
                        var114[var115 + 1] = class38.field879.method1015((byte) -72);
                    } else {
                        var114[var115 + 1] = Integer.valueOf(class38.field879.method1037(18834));
                    }
                }
                var114[0] = Integer.valueOf(class38.field879.method1037(18834));
                class113 var116 = new class113();
                var116.field2601 = var114;
                class124.method976(var116, -97);
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 128) {
                class47.field1094 = true;
                class108.field2505 = class38.field879.method1025(255);
                class84.field2019 = class38.field879.method1025(255);
                class22.field512 = class38.field879.method1041(212464720);
                class141.field3295 = class38.field879.method1025(255);
                class57.field1419 = class38.field879.method1025(255);
                if (class57.field1419 >= 100) {
                    int var117 = class108.field2505 * 128 + 64;
                    int var118 = class84.field2019 * 128 + 64;
                    int var119 = class111.method908(128, var117, var118, class155.field3598) - class22.field512;
                    int var120 = var118 - class140.field3248;
                    int var121 = var119 - class115.field2649;
                    int var122 = var117 - class81.field1959;
                    int var123 = (int) Math.sqrt((double) (var120 * var120 + var122 * var122));
                    class20.field433 = (int) (Math.atan2((double) var121, (double) var123) * 325.949D) & 0x7FF;
                    class143.field3351 = (int) (-325.949D * Math.atan2((double) var122, (double) var120)) & 0x7FF;
                    if (class20.field433 < 128) {
                        class20.field433 = 128;
                    }
                    if (class20.field433 > 383) {
                        class20.field433 = 383;
                    }
                }
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 77) {
                class137.method1100(1);
                class147.field3465 = class38.field879.method1027((byte) 50);
                class122.field2800 = -1;
                class59.field1447 = class150.field3538;
                return true;
            }
            if (class122.field2800 == 101) {
                class15.field362 = class38.field879.method1025(255);
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 216) {
                class38.field879.method1004(-101981656);
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 153) {
                int var124 = class38.field879.method1037(18834);
                int var125 = class38.field879.method1041(212464720);
                if (var124 < -70000) {
                    var125 += 32768;
                }
                class54 var126;
                if (var124 >= 0) {
                    var126 = class62.method456(var124, (byte) 104);
                } else {
                    var126 = null;
                }
                while (class38.field879.field2873 < class115.field2651) {
                    int var127 = 0;
                    int var128 = class38.field879.method1001((byte) -71);
                    int var129 = class38.field879.method1041(212464720);
                    if (var129 != 0) {
                        var127 = class38.field879.method1025(255);
                        if (var127 == 255) {
                            var127 = class38.field879.method1037(18834);
                        }
                    }
                    if (var126 != null && var128 >= 0 && var126.field1304.length > var128) {
                        var126.field1304[var128] = var129;
                        var126.field1365[var128] = var127;
                    }
                    class65.method503(var125, var128, var129 - 1, var127, 1);
                }
                if (var126 != null) {
                    client.method163(var126, -106);
                }
                class137.method1100(1);
                class63.field1552[class24.method192(31, class88.field2098++)] = class24.method192(var125, 32767);
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 227) {
                class38.field879.method1025(255);
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 232) {
                class32.method251(-1);
                class122.field2800 = -1;
                return false;
            }
            if (class122.field2800 == 211) {
                class47.field1094 = false;
                for (int var130 = 0; var130 < 5; var130++) {
                    class155.field3604[var130] = false;
                }
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 26) {
                class1.method3(true, 65);
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 206) {
                class38.field879.method989(true);
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 110) {
                class38.field879.method1004(-101981656);
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 196) {
                int var131 = class38.field879.method1041(212464720);
                int var132 = class38.field879.method1032(-986860040);
                class65.field1630[var131] = var132;
                if (class24.field598[var131] != var132) {
                    class24.field598[var131] = var132;
                    class22.method169((byte) 84, var131);
                }
                class45.field1021[class24.method192(31, class81.field1958++)] = var131;
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 100) {
                int var133 = class38.field879.field2873 + class115.field2651;
                int var134 = class38.field879.method1041(212464720);
                if (class137.field3164 != var134) {
                    class137.field3164 = var134;
                    class47.method336(24880, class137.field3164);
                    class110.method889(arg0, class137.field3164);
                    for (int var135 = 0; var135 < 100; var135++) {
                        class18.field416[var135] = true;
                    }
                }
                while (class38.field879.field2873 < var133) {
                    int var136 = class38.field879.method1037(18834);
                    int var137 = class38.field879.method1041(212464720);
                    int var138 = class38.field879.method1025(255);
                    class81 var139 = (class81) class16.field372.method537(-1, (long) var136);
                    if (var139 != null && var139.field1963 != var137) {
                        class136.method1093(var139, true, 125);
                        var139 = null;
                    }
                    if (var139 == null) {
                        var139 = class126.method985(var137, 12252, var136, var138);
                    }
                    var139.field1956 = true;
                }
                for (class81 var140 = (class81) class16.field372.method531(112); var140 != null; var140 = (class81) class16.field372.method536(98)) {
                    if (var140.field1956) {
                        var140.field1956 = false;
                    } else {
                        class136.method1093(var140, true, -79);
                    }
                }
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 223) {
                class88.field2091 = class86.field2060;
                long var141 = class38.field879.method1030(125);
                if (var141 == 0L) {
                    class115.field2629 = 0;
                    class122.field2800 = -1;
                    class120.field2762 = null;
                    class39.field912 = null;
                    return true;
                }
                class120.field2762 = class111.method899(false, var141);
                class36.field858 = class38.field879.method1028(-115487256);
                int var143 = class38.field879.method1025(255);
                if (var143 == 255) {
                    class122.field2800 = -1;
                    return true;
                }
                class132[] var144 = new class132[100];
                class115.field2629 = var143;
                for (int var145 = 0; var145 < class115.field2629; var145++) {
                    var144[var145] = new class132();
                    var144[var145].field3493 = class38.field879.method1030(124);
                    var144[var145].field3026 = class111.method899(false, var144[var145].field3493);
                    var144[var145].field3022 = class38.field879.method1041(212464720);
                    var144[var145].field3030 = class38.field879.method1028(-115487256);
                    if (class142.field3316 == var144[var145].field3493) {
                        class126.field2853 = var144[var145].field3030;
                    }
                }
                int var146 = class115.field2629;
                boolean var147 = false;
                while (var146 > 0) {
                    var146--;
                    boolean var148 = true;
                    for (int var149 = 0; var149 < var146; var149++) {
                        if (var144[var149].field3026.method470(var144[var149 + 1].field3026, 93) > 0) {
                            class132 var150 = var144[var149];
                            var148 = false;
                            var144[var149] = var144[var149 + 1];
                            var144[var149 + 1] = var150;
                        }
                    }
                    if (var148) {
                        break;
                    }
                }
                class39.field912 = var144;
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 244) {
                int var151 = class38.field879.method1025(255);
                int var152 = class38.field879.method1025(255);
                int var153 = class38.field879.method1025(255);
                class155.field3598 = var153 >> 1;
                class40.field936.method64(var152, (byte) -24, var151, (var153 & 0x1) == 1);
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 203) {
                int var154 = class38.field879.method1018((byte) 80);
                int var155 = class38.field879.method996(15250);
                class54 var156 = class62.method456(var155, (byte) 82);
                if (var156.field1235 != 1 || var156.field1324 != var154) {
                    var156.field1324 = var154;
                    var156.field1235 = 1;
                    client.method163(var156, -78);
                }
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 210) {
                for (int var157 = 0; var157 < class52.field1200.length; var157++) {
                    if (class52.field1200[var157] != null) {
                        class52.field1200[var157].field177 = -1;
                    }
                }
                for (int var158 = 0; var158 < class136.field3127.length; var158++) {
                    if (class136.field3127[var158] != null) {
                        class136.field3127[var158].field177 = -1;
                    }
                }
                class122.field2800 = -1;
                return true;
            }
            if (arg0) {
                method756(117, -113);
            }
            if (class122.field2800 == 13) {
                int var159 = class38.field879.method1018((byte) 80);
                int var160 = class38.field879.method1032(-986860040);
                class54 var161 = class62.method456(var160, (byte) 73);
                if (var161 != null && var161.field1279 == 0) {
                    if (var159 > var161.field1328 - var161.field1345) {
                        var159 = var161.field1328 - var161.field1345;
                    }
                    if (var159 < 0) {
                        var159 = 0;
                    }
                    if (var161.field1262 != var159) {
                        var161.field1262 = var159;
                        client.method163(var161, -119);
                    }
                }
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 35) {
                class119.method949(false);
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 0) {
                for (int var162 = 0; var162 < class24.field598.length; var162++) {
                    if (class65.field1630[var162] != class24.field598[var162]) {
                        class24.field598[var162] = class65.field1630[var162];
                        class22.method169((byte) 124, var162);
                        class45.field1021[class24.method192(31, class81.field1958++)] = var162;
                    }
                }
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 202) {
                int var163 = class38.field879.method1004(-101981656);
                if (var163 == 65535) {
                    var163 = -1;
                }
                class32.method257(var163, -1);
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 234) {
                int var164 = class38.field879.method1022((byte) 121);
                if (var164 == 65535) {
                    var164 = -1;
                }
                int var165 = class38.field879.method1026((byte) 32);
                class15.method107(var165, var164, false);
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 200) {
                class139.field3231 = true;
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 53) {
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 71) {
                int var166 = class38.field879.method1037(18834);
                class62 var167 = class38.field879.method1015((byte) -77);
                class54 var168 = class62.method456(var166, (byte) 126);
                if (!var167.method475(77, var168.field1284)) {
                    var168.field1284 = var167;
                    client.method163(var168, -86);
                }
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 119) {
                long var169 = class38.field879.method1030(115);
                class38.field879.method1028(-115487256);
                long var171 = class38.field879.method1030(114);
                long var173 = (long) class38.field879.method1041(212464720);
                long var175 = (long) class38.field879.method1026((byte) 29);
                int var177 = class38.field879.method1025(255);
                long var178 = (var173 << 32) + var175;
                boolean var180 = false;
                for (int var181 = 0; var181 < 100; var181++) {
                    if (class15.field357[var181] == var178) {
                        var180 = true;
                        break;
                    }
                }
                if (var177 <= 1) {
                    for (int var182 = 0; var182 < class100.field2339; var182++) {
                        if (class47.field1077[var182] == var169) {
                            var180 = true;
                            break;
                        }
                    }
                }
                if (!var180 && class30.field744 == 0) {
                    class15.field357[class148.field3502] = var178;
                    class148.field3502 = (class148.field3502 + 1) % 100;
                    class62 var183 = class89.method679(class136.method1091(class38.field879, 33).method449((byte) 98));
                    if (var177 == 2 || var177 == 3) {
                        class98.method758(class70.method594(new class62[] { class15.field365, class111.method899(false, var169).method462(81) }, 1229), -13412, class111.method899(false, var171), 9, var183);
                    } else if (var177 == 1) {
                        class98.method758(class70.method594(new class62[] { class42.field966, class111.method899(false, var169).method462(58) }, 1229), -13412, class111.method899(false, var171), 9, var183);
                    } else {
                        class98.method758(class111.method899(false, var169).method462(80), -13412, class111.method899(false, var171), 9, var183);
                    }
                }
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 145) {
                int var184 = class38.field879.method996(15250);
                int var185 = class38.field879.method1038((byte) -113);
                class54 var186 = class62.method456(var184, (byte) 117);
                if (var186.field1247 != var185 || var185 == -1) {
                    var186.field1348 = 0;
                    var186.field1247 = var185;
                    var186.field1280 = 0;
                    client.method163(var186, -125);
                }
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 167) {
                int var187 = class38.field879.method1041(212464720);
                int var188 = class38.field879.method1025(255);
                int var189 = class38.field879.method1041(212464720);
                class140.method1115(var188, var187, var189, 33);
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 61) {
                int var190 = class38.field879.method1037(18834);
                int var191 = class38.field879.method1022((byte) 105);
                if (var191 == 65535) {
                    var191 = -1;
                }
                int var192 = class38.field879.method1032(-986860040);
                class54 var193 = class62.method456(var192, (byte) 90);
                if (var193.field1322) {
                    var193.field1270 = var190;
                    var193.field1250 = var191;
                    class23 var195 = class140.method1114(var191, false);
                    var193.field1261 = var195.field577;
                    var193.field1313 = var195.field540;
                    var193.field1266 = var195.field556;
                    var193.field1267 = var195.field554;
                    var193.field1282 = var195.field545;
                    var193.field1312 = var195.field579;
                    if (var193.field1316 > 0) {
                        var193.field1312 = var193.field1312 * 32 / var193.field1316;
                    }
                    client.method163(var193, -115);
                } else if (var191 == -1) {
                    var193.field1235 = 0;
                    class122.field2800 = -1;
                    return true;
                } else {
                    class23 var194 = class140.method1114(var191, false);
                    var193.field1312 = var194.field579 * 100 / var190;
                    var193.field1235 = 4;
                    var193.field1282 = var194.field545;
                    var193.field1267 = var194.field554;
                    var193.field1324 = var191;
                    client.method163(var193, -103);
                }
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 30) {
                class7.field207 = class38.field879.method1025(255);
                class122.field2800 = -1;
                class5.field102 = class150.field3538;
                return true;
            }
            if (class122.field2800 == 6) {
                int var196 = class38.field879.method996(15250);
                int var197 = class38.field879.method1041(212464720);
                int var198 = class38.field879.method1025(255);
                class81 var199 = (class81) class16.field372.method537(-1, (long) var196);
                if (var199 != null) {
                    class136.method1093(var199, var199.field1963 != var197, 10);
                }
                class126.method985(var197, 12252, var196, var198);
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 33) {
                int var200 = class38.field879.method1037(18834);
                class54 var201 = class62.method456(var200, (byte) 89);
                for (int var202 = 0; var202 < var201.field1304.length; var202++) {
                    var201.field1304[var202] = -1;
                    var201.field1304[var202] = 0;
                }
                client.method163(var201, -115);
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 146) {
                long var203 = class38.field879.method1030(124);
                int var205 = class38.field879.method1041(212464720);
                int var206 = class38.field879.method1025(255);
                class62 var207 = class111.method899(false, var203).method462(78);
                for (int var208 = 0; var208 < class54.field1334; var208++) {
                    if (class94.field2217[var208] == var203) {
                        if (class136.field3128[var208] != var205) {
                            class136.field3128[var208] = var205;
                            if (var205 > 0) {
                                class43.method320(0, 5, class70.method594(new class62[] { var207, class121.field2775 }, 1229), class83.field1991);
                            }
                            if (var205 == 0) {
                                class43.method320(0, 5, class70.method594(new class62[] { var207, class130.field2972 }, 1229), class83.field1991);
                            }
                        }
                        var207 = null;
                        class39.field918[var208] = var206;
                        break;
                    }
                }
                if (var207 != null && class54.field1334 < 200) {
                    class94.field2217[class54.field1334] = var203;
                    class155.field3597[class54.field1334] = var207;
                    class136.field3128[class54.field1334] = var205;
                    class39.field918[class54.field1334] = var206;
                    class54.field1334++;
                }
                int var209 = class54.field1334;
                boolean var210 = false;
                class5.field102 = class150.field3538;
                while (var209 > 0) {
                    boolean var211 = true;
                    var209--;
                    for (int var212 = 0; var212 < var209; var212++) {
                        if (class136.field3128[var212] != class59.field1449 && class136.field3128[var212 + 1] == class59.field1449 || class136.field3128[var212] == 0 && class136.field3128[var212 + 1] != 0) {
                            int var213 = class136.field3128[var212];
                            class136.field3128[var212] = class136.field3128[var212 + 1];
                            var211 = false;
                            class136.field3128[var212 + 1] = var213;
                            class62 var214 = class155.field3597[var212];
                            class155.field3597[var212] = class155.field3597[var212 + 1];
                            class155.field3597[var212 + 1] = var214;
                            long var215 = class94.field2217[var212];
                            class94.field2217[var212] = class94.field2217[var212 + 1];
                            class94.field2217[var212 + 1] = var215;
                            int var217 = class39.field918[var212];
                            class39.field918[var212] = class39.field918[var212 + 1];
                            class39.field918[var212 + 1] = var217;
                        }
                    }
                    if (var211) {
                        break;
                    }
                }
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 170) {
                class15.field354 = class38.field879.method1023((byte) -33);
                class60.field1475 = class38.field879.method1025(255);
                for (int var218 = class60.field1475; var218 < class60.field1475 + 8; var218++) {
                    for (int var219 = class15.field354; var219 < class15.field354 + 8; var219++) {
                        if (class32.field765[class155.field3598][var218][var219] != null) {
                            class32.field765[class155.field3598][var218][var219] = null;
                            class93.method714(var218, 1336339591, var219);
                        }
                    }
                }
                for (class131 var220 = (class131) class138.field3217.method840(true); var220 != null; var220 = (class131) class138.field3217.method841((byte) 18)) {
                    if (class60.field1475 <= var220.field2989 && var220.field2989 < class60.field1475 + 8 && var220.field3002 >= class15.field354 && var220.field3002 < class15.field354 + 8 && class155.field3598 == var220.field3005) {
                        var220.field2994 = 0;
                    }
                }
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 224) {
                class38.field879.method1041(212464720);
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 22 || class122.field2800 == 113 || class122.field2800 == 8 || class122.field2800 == 148 || class122.field2800 == 9 || class122.field2800 == 92 || class122.field2800 == 132 || class122.field2800 == 144 || class122.field2800 == 252 || class122.field2800 == 27 || class122.field2800 == 48) {
                class29.method230((byte) 108);
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 187) {
                class38.field879.method1027((byte) 32);
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 69) {
                int var221 = class38.field879.method996(15250);
                class54 var222 = class62.method456(var221, (byte) 119);
                var222.field1235 = 3;
                var222.field1324 = class40.field936.field2626.method896((byte) 124);
                client.method163(var222, -122);
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 65) {
                class1.method3(false, 110);
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 212) {
                int var223 = class38.field879.method1004(-101981656);
                class39.method293(var223, (byte) 82);
                class63.field1552[class24.method192(class88.field2098++, 31)] = class24.method192(var223, 32767);
                class122.field2800 = -1;
                return true;
            }
            if (class122.field2800 == 19) {
                class38.field879.method1041(212464720);
                class38.field879.method1004(-101981656);
                class122.field2800 = -1;
                return true;
            }
            class93.method715(null, "T1 - " + class122.field2800 + "," + class147.field3473 + "," + class63.field1571 + " - " + class115.field2651, true);
            class32.method251(-1);
        } catch (IOException var227) {
            class48.method343(-1);
        } catch (Exception var228) {
            String var225 = "T2 - " + class122.field2800 + "," + class147.field3473 + "," + class63.field1571 + " - " + class115.field2651 + "," + (class40.field936.field193[0] + class40.field926) + "," + (class40.field936.field144[0] + class27.field673) + " - ";
            for (int var226 = 0; var226 < class115.field2651 && var226 < 50; var226++) {
                var225 = var225 + class38.field879.field2874[var226] + ",";
            }
            class93.method715(var228, var225, true);
            class32.method251(-1);
        }
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)I")
    public final int method752(int arg0, int arg1, int arg2) {
        int var4 = this.field2250;
        this.field2250 = 300;
        field2263++;
        int var5 = this.field2267;
        if (arg0 != -1) {
            return -58;
        }
        this.field2267 = 1;
        this.field2254 = class26.method209((byte) -102);
        if (this.field2251[this.field2252] == 0L) {
            this.field2250 = var4;
            this.field2267 = var5;
        } else if (this.field2254 > this.field2251[this.field2252]) {
            this.field2250 = (int) ((long) (arg2 * 2560) / (this.field2254 - this.field2251[this.field2252]));
        }
        if (this.field2250 < 25) {
            this.field2250 = 25;
        }
        if (this.field2250 > 256) {
            this.field2250 = 256;
            this.field2267 = (int) ((long) arg2 - (this.field2254 - this.field2251[this.field2252]) / 10L);
        }
        if (arg2 < this.field2267) {
            this.field2267 = arg2;
        }
        this.field2251[this.field2252] = this.field2254;
        this.field2252 = (this.field2252 + 1) % 10;
        if (this.field2267 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field2251[var6] != 0L) {
                    this.field2251[var6] += this.field2267;
                }
            }
        }
        if (this.field2267 < arg1) {
            this.field2267 = arg1;
        }
        class146.method1168(-19127, (long) this.field2267);
        int var7 = 0;
        while (this.field2268 < 256) {
            var7++;
            this.field2268 += this.field2250;
        }
        this.field2268 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
    public final void method753(boolean arg0) {
        field2269++;
        int var2 = 0;
        if (!arg0) {
            method751(false);
        }
        while (var2 < 10) {
            this.field2251[var2] = 0L;
            var2++;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lja;Lja;ILpd;)Lmf;")
    public static final class89 method754(class62 arg0, class62 arg1, int arg2, class108 arg3) {
        field2255++;
        int var4 = arg3.method877(80, arg1);
        int var5 = 118 % ((-arg2 - 20) / 53);
        int var6 = arg3.method868(arg0, (byte) -117, var4);
        return class143.method1134(-94, arg3, var6, var4);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
    public static final void method755(byte arg0) {
        field2258++;
        int var1 = -55 / ((-arg0 - 20) / 37);
        for (int var2 = -1; var2 < class147.field3460; var2++) {
            int var3;
            if (var2 == -1) {
                var3 = 2047;
            } else {
                var3 = class141.field3311[var2];
            }
            class115 var4 = class52.field1200[var3];
            if (var4 != null) {
                class26.method204(1, (byte) 99, var4);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Lja;")
    public static final class62 method756(int arg0, int arg1) {
        field2260++;
        if (arg0 > -115) {
            field2256 = null;
        }
        return class60.field1479[arg1].method460((byte) 38) > 0 ? class70.method594(new class62[] { class53.field1226[arg1], class144.field3364, class60.field1479[arg1] }, 1229) : class53.field1226[arg1];
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V")
    public class97() {
        this.method750(123);
    }
}
