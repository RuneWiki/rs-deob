import java.io.IOException;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class116 {

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
    public static int field2362 = 0;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "Leh;")
    public static class47 field2358 = class195.method1282((byte) -4, "Ausw-=hlen");

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "Leh;")
    private static class47 field2364 = class195.method1282((byte) -4, "Select");

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "Leh;")
    public static class47 field2361 = field2364;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "Lpa;")
    public static class136 field2357 = new class136(30);

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "Leh;")
    private static class47 field2366 = class195.method1282((byte) -4, "Error loading your profile)3");

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
    public static int field2365 = -1;

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "Leh;")
    public static class47 field2367 = field2366;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2353;

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
    public class116() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z)Z")
    public static final boolean method909(boolean arg0) {
        field2360++;
        if (class61.field1323 == null) {
            return false;
        }
        try {
            int var1 = class61.field1323.method680(0);
            if (var1 == 0) {
                return false;
            }
            if (class184.field3529 == -1) {
                var1--;
                class61.field1323.method682(0, class22.field418.field1495, 17031, 1);
                class22.field418.field1454 = 0;
                class184.field3529 = class22.field418.method656(-58);
                class14.field304 = class77.field1663[class184.field3529];
            }
            if (class14.field304 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                class61.field1323.method682(0, class22.field418.field1495, 17031, 1);
                var1--;
                class14.field304 = class22.field418.field1495[0] & 0xFF;
            }
            if (class14.field304 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                class61.field1323.method682(0, class22.field418.field1495, 17031, 2);
                var1 -= 2;
                class22.field418.field1454 = 0;
                class14.field304 = class22.field418.method569(26496);
            }
            if (var1 < class14.field304) {
                return false;
            }
            class22.field418.field1454 = 0;
            class61.field1323.method682(0, class22.field418.field1495, 17031, class14.field304);
            class107.field2234 = 0;
            class19.field378 = class76.field1659;
            class76.field1659 = class160.field3109;
            class160.field3109 = class184.field3529;
            if (class184.field3529 == 135) {
                class155.field3027 = class22.field418.method608(-112) * 30;
                class109.field2269 = class103.field2162;
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 236) {
                class34.method290(class22.field418, 0);
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 99) {
                int var2 = class22.field418.method604((byte) -125);
                int var3 = class22.field418.method604((byte) -123);
                int var4 = class22.field418.method604((byte) 46);
                int var5 = class22.field418.method604((byte) -124);
                int var6 = class22.field418.method569(26496);
                class200.field3904[var2] = true;
                class8.field161[var2] = var3;
                class75.field1633[var2] = var4;
                class96.field2047[var2] = var5;
                class198.field3848[var2] = var6;
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 130) {
                int var7 = class22.field418.method569(26496);
                int var8 = class22.field418.method569(26496);
                int var9 = class22.field418.method610((byte) 105);
                class61 var10 = class23.method224(var9, 484111152);
                var10.field1204 = (var7 << 16) + var8;
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 184) {
                class47 var11 = class22.field418.method575(-46);
                Object[] var12 = new Object[var11.method376(-43) + 1];
                for (int var13 = var11.method376(-43) - 1; var13 >= 0; var13--) {
                    if (var11.method392(var13, 55) == 115) {
                        var12[var13 + 1] = class22.field418.method575(75);
                    } else {
                        var12[var13 + 1] = Integer.valueOf(class22.field418.method599((byte) 96));
                    }
                }
                var12[0] = Integer.valueOf(class22.field418.method599((byte) 96));
                class43 var14 = new class43();
                var14.field871 = var12;
                class188.method1242(var14, 111);
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 77) {
                int var15 = class22.field418.method610((byte) 96);
                int var16 = class22.field418.method569(26496);
                if (var16 == 65535) {
                    var16 = -1;
                }
                int var17 = class22.field418.method592((byte) 125);
                class61 var18 = class23.method224(var15, 484111152);
                if (var18.field1313) {
                    var18.field1298 = var16;
                    var18.field1292 = var17;
                    class73 var19 = class87.method713(-118, var16);
                    var18.field1318 = var19.field1587;
                    var18.field1189 = var19.field1569;
                    var18.field1220 = var19.field1608;
                    var18.field1277 = var19.field1592;
                    var18.field1283 = var19.field1579;
                    var18.field1307 = var19.field1588;
                    if (var18.field1187 > 0) {
                        var18.field1307 = var18.field1307 * 32 / var18.field1187;
                    }
                    class20.method204(var18, (byte) -5);
                } else if (var16 == -1) {
                    class184.field3529 = -1;
                    var18.field1259 = 0;
                    return true;
                } else {
                    class73 var20 = class87.method713(126, var16);
                    var18.field1184 = var16;
                    var18.field1220 = var20.field1608;
                    var18.field1307 = var20.field1588 * 100 / var17;
                    var18.field1283 = var20.field1579;
                    var18.field1259 = 4;
                    class20.method204(var18, (byte) -5);
                }
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 10) {
                int var21 = class22.field418.method610((byte) 100);
                int var22 = class22.field418.method561(99);
                int var23 = class22.field418.method561(50);
                class61 var24 = class23.method224(var21, 484111152);
                int var25 = var24.field1265 + var23;
                int var26 = var24.field1252 + var22;
                if (var24.field1253 != var25 || var24.field1229 != var26) {
                    var24.field1253 = var25;
                    var24.field1229 = var26;
                    class20.method204(var24, (byte) -5);
                }
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 242) {
                class36.method308(2);
                class184.field3529 = -1;
                return false;
            }
            if (class184.field3529 == 231) {
                class95.field1958 = class22.field418.method604((byte) -128);
                if (class95.field1958 == 1) {
                    class26.field497 = class22.field418.method569(26496);
                }
                if (class95.field1958 >= 2 && class95.field1958 <= 6) {
                    if (class95.field1958 == 2) {
                        class195.field3792 = 64;
                        class53.field1034 = 64;
                    }
                    if (class95.field1958 == 3) {
                        class53.field1034 = 64;
                        class195.field3792 = 0;
                    }
                    if (class95.field1958 == 4) {
                        class53.field1034 = 64;
                        class195.field3792 = 128;
                    }
                    if (class95.field1958 == 5) {
                        class53.field1034 = 0;
                        class195.field3792 = 64;
                    }
                    if (class95.field1958 == 6) {
                        class195.field3792 = 64;
                        class53.field1034 = 128;
                    }
                    class95.field1958 = 2;
                    class166.field3217 = class22.field418.method569(26496);
                    class97.field2054 = class22.field418.method569(26496);
                    class37.field727 = class22.field418.method604((byte) -126);
                }
                if (class95.field1958 == 10) {
                    class82.field1762 = class22.field418.method569(26496);
                }
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 21) {
                int var27 = class22.field418.method599((byte) 96);
                int var28 = class22.field418.method608(106);
                int var29 = var28 >> 10 & 0x1F;
                class61 var30 = class23.method224(var27, 484111152);
                int var31 = var28 & 0x1F;
                int var32 = var28 >> 5 & 0x1F;
                int var33 = (var29 << 19) + (var31 << 3) + (var32 << 11);
                if (var30.field1193 != var33) {
                    var30.field1193 = var33;
                    class20.method204(var30, (byte) -5);
                }
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 17) {
                int var34 = class22.field418.method594(27796);
                int var35 = class22.field418.method594(27796);
                int var36 = class22.field418.method594(27796);
                class196.field3827 = var36 >> 1;
                class123.field2489.method1156(!arg0, var34, (var36 & 0x1) == 1, var35);
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 8) {
                int var37 = class22.field418.method584((byte) -38);
                class47 var38 = class22.field418.method575(118);
                int var39 = class22.field418.method594(27796);
                if (var39 >= 1 && var39 <= 8) {
                    if (var38.method411(false, class59.field1148)) {
                        var38 = null;
                    }
                    class161.field3136[var39 - 1] = var38;
                    class114.field2329[var39 - 1] = var37 == 0;
                }
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 206) {
                long var40 = class22.field418.method570((byte) 10);
                int var42 = class22.field418.method569(26496);
                int var43 = class22.field418.method604((byte) 88);
                class47 var44 = class173.method1166(var40, 1).method387(false);
                for (int var45 = 0; var45 < class77.field1679; var45++) {
                    if (class31.field593[var45] == var40) {
                        if (class132.field2608[var45] != var42) {
                            class132.field2608[var45] = var42;
                            if (var42 > 0) {
                                class60.method506(72, class181.field3472, 5, class5.method24(new class47[] { var44, class36.field698 }, (byte) 104));
                            }
                            if (var42 == 0) {
                                class60.method506(107, class181.field3472, 5, class5.method24(new class47[] { var44, class20.field384 }, (byte) 93));
                            }
                        }
                        class190.field3680[var45] = var43;
                        var44 = null;
                        break;
                    }
                }
                if (var44 != null && class77.field1679 < 200) {
                    class31.field593[class77.field1679] = var40;
                    class43.field864[class77.field1679] = var44;
                    class132.field2608[class77.field1679] = var42;
                    class190.field3680[class77.field1679] = var43;
                    class77.field1679++;
                }
                boolean var46 = false;
                class36.field713 = class103.field2162;
                int var47 = class77.field1679;
                while (var47 > 0) {
                    var47--;
                    boolean var48 = true;
                    for (int var49 = 0; var49 < var47; var49++) {
                        if (class132.field2608[var49] != class195.field3805 && class132.field2608[var49 + 1] == class195.field3805 || class132.field2608[var49] == 0 && class132.field2608[var49 + 1] != 0) {
                            var48 = false;
                            int var50 = class132.field2608[var49];
                            class132.field2608[var49] = class132.field2608[var49 + 1];
                            class132.field2608[var49 + 1] = var50;
                            class47 var51 = class43.field864[var49];
                            class43.field864[var49] = class43.field864[var49 + 1];
                            class43.field864[var49 + 1] = var51;
                            long var52 = class31.field593[var49];
                            class31.field593[var49] = class31.field593[var49 + 1];
                            class31.field593[var49 + 1] = var52;
                            int var54 = class190.field3680[var49];
                            class190.field3680[var49] = class190.field3680[var49 + 1];
                            class190.field3680[var49 + 1] = var54;
                        }
                    }
                    if (var48) {
                        break;
                    }
                }
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 45) {
                class5.field88 = class14.field304 / 8;
                for (int var55 = 0; var55 < class5.field88; var55++) {
                    class25.field487[var55] = class22.field418.method570((byte) 10);
                    class14.field303[var55] = class173.method1166(class25.field487[var55], 1);
                }
                class36.field713 = class103.field2162;
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 142) {
                int var56 = class22.field418.method599((byte) 96);
                class61 var57 = class23.method224(var56, 484111152);
                var57.field1259 = 3;
                var57.field1184 = class123.field2489.field606.method1219(214413162);
                class20.method204(var57, (byte) -5);
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 165) {
                class86.method704((byte) 89);
                class160.field3117 = class22.field418.method604((byte) 83);
                class109.field2269 = class103.field2162;
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 159 || class184.field3529 == 63 || class184.field3529 == 174 || class184.field3529 == 61 || class184.field3529 == 88 || class184.field3529 == 65 || class184.field3529 == 127 || class184.field3529 == 198 || class184.field3529 == 141 || class184.field3529 == 29 || class184.field3529 == 39) {
                class146.method1032(Integer.MAX_VALUE);
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 86) {
                int var58 = class22.field418.method586((byte) 101);
                if (var58 == 65535) {
                    var58 = -1;
                }
                int var59 = class22.field418.method592((byte) 125);
                int var60 = class22.field418.method608(-107);
                int var61 = class22.field418.method599((byte) 96);
                if (var60 == 65535) {
                    var60 = -1;
                }
                for (int var62 = var58; var62 <= var60; var62++) {
                    long var63 = ((long) var61 << 32) + (long) var62;
                    class110 var65 = class35.field685.method1342(var63, (byte) -20);
                    if (var65 != null) {
                        var65.method885(3);
                    }
                    class35.field685.method1341(-54, var63, new class190(var59));
                }
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 245) {
                int var66 = class14.field304 + class22.field418.field1454;
                int var67 = class22.field418.method569(26496);
                int var68 = class22.field418.method569(26496);
                if (class202.field3924 != var67) {
                    class202.field3924 = var67;
                    class146.method1033(0, class202.field3924);
                    class6.method31(class202.field3924, (byte) -127);
                    for (int var69 = 0; var69 < 100; var69++) {
                        class158.field3077[var69] = true;
                    }
                }
                while (var68-- > 0) {
                    int var70 = class22.field418.method599((byte) 96);
                    int var71 = class22.field418.method569(26496);
                    int var72 = class22.field418.method604((byte) -128);
                    class63 var73 = (class63) class138.field2710.method1342((long) var70, (byte) -20);
                    if (var73 != null && var73.field1349 != var71) {
                        class185.method1230(true, !arg0, var73);
                        var73 = null;
                    }
                    if (var73 == null) {
                        var73 = class165.method1125(-128, var71, var72, var70);
                    }
                    var73.field1341 = true;
                }
                for (class63 var74 = (class63) class138.field2710.method1344(false); var74 != null; var74 = (class63) class138.field2710.method1340(arg0)) {
                    if (var74.field1341) {
                        var74.field1341 = false;
                    } else {
                        class185.method1230(true, true, var74);
                    }
                }
                class35.field685 = new class204(512);
                while (class22.field418.field1454 < var66) {
                    int var75 = class22.field418.method599((byte) 96);
                    int var76 = class22.field418.method569(26496);
                    int var77 = class22.field418.method569(26496);
                    int var78 = class22.field418.method599((byte) 96);
                    for (int var79 = var76; var79 <= var77; var79++) {
                        long var80 = ((long) var75 << 32) + (long) var79;
                        class35.field685.method1341(-112, var80, new class190(var78));
                    }
                }
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 37) {
                int var82 = class22.field418.method599((byte) 96);
                int var83 = class22.field418.method569(26496);
                if (var82 < -70000) {
                    var83 += 32768;
                }
                class61 var84;
                if (var82 < 0) {
                    var84 = null;
                } else {
                    var84 = class23.method224(var82, 484111152);
                }
                while (class14.field304 > class22.field418.field1454) {
                    int var85 = 0;
                    int var86 = class22.field418.method603((byte) -127);
                    int var87 = class22.field418.method569(26496);
                    if (var87 != 0) {
                        var85 = class22.field418.method604((byte) -126);
                        if (var85 == 255) {
                            var85 = class22.field418.method599((byte) 96);
                        }
                    }
                    if (var84 != null && var86 >= 0 && var84.field1264.length > var86) {
                        var84.field1264[var86] = var87;
                        var84.field1310[var86] = var85;
                    }
                    class137.method1000(var86, (byte) -63, var85, var87 - 1, var83);
                }
                if (var84 != null) {
                    class20.method204(var84, (byte) -5);
                }
                class86.method704((byte) -122);
                class130.field2559[class142.method1018(31, class37.field740++)] = class142.method1018(32767, var83);
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 223) {
                for (int var88 = 0; var88 < class40.field795.length; var88++) {
                    if (class40.field795[var88] != null) {
                        class40.field795[var88].field3330 = -1;
                    }
                }
                for (int var89 = 0; var89 < class133.field2626.length; var89++) {
                    if (class133.field2626[var89] != null) {
                        class133.field2626[var89].field3330 = -1;
                    }
                }
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 252) {
                class86.method704((byte) 88);
                int var90 = class22.field418.method610((byte) 105);
                int var91 = class22.field418.method584((byte) 52);
                int var92 = class22.field418.method604((byte) -128);
                class127.field2539[var91] = var90;
                class22.field443[var91] = var92;
                class109.field2266[var91] = 1;
                for (int var93 = 0; var93 < 98; var93++) {
                    if (class109.field2252[var93] <= var90) {
                        class109.field2266[var91] = var93 + 2;
                    }
                }
                class105.field2181[class142.method1018(class88.field1873++, 31)] = var91;
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 103) {
                long var94 = class22.field418.method570((byte) 10);
                long var96 = (long) class22.field418.method569(26496);
                long var98 = (long) class22.field418.method613(!arg0);
                int var100 = class22.field418.method604((byte) -128);
                long var101 = (var96 << 32) + var98;
                boolean var103 = false;
                for (int var104 = 0; var104 < 100; var104++) {
                    if (class180.field3451[var104] == var101) {
                        var103 = true;
                        break;
                    }
                }
                if (var100 <= 1) {
                    for (int var105 = 0; var105 < class5.field88; var105++) {
                        if (class25.field487[var105] == var94) {
                            var103 = true;
                            break;
                        }
                    }
                }
                if (!var103 && class161.field3141 == 0) {
                    class180.field3451[class119.field2406] = var101;
                    class119.field2406 = (class119.field2406 + 1) % 100;
                    class47 var106 = class13.method97(class35.method305(class22.field418, 32767).method415(67));
                    if (var100 == 2 || var100 == 3) {
                        class60.method506(6, class5.method24(new class47[] { class189.field3672, class173.method1166(var94, 1).method387(false) }, (byte) 75), 7, var106);
                    } else if (var100 == 1) {
                        class60.method506(-124, class5.method24(new class47[] { class152.field2974, class173.method1166(var94, 1).method387(false) }, (byte) 120), 7, var106);
                    } else {
                        class60.method506(-128, class173.method1166(var94, 1).method387(false), 3, var106);
                    }
                }
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 146) {
                long var107 = class22.field418.method570((byte) 10);
                int var109 = class22.field418.method569(26496);
                boolean var110 = false;
                byte var111 = class22.field418.method567(-1);
                if ((Long.MIN_VALUE & var107) != 0L) {
                    var110 = true;
                }
                if (var110) {
                    if (class41.field809 == 0) {
                        class184.field3529 = -1;
                        return true;
                    }
                    boolean var116 = false;
                    long var117 = var107 & Long.MAX_VALUE;
                    int var119;
                    for (var119 = 0; var119 < class41.field809 && (class40.field807[var119].field2283 != var117 || class40.field807[var119].field1878 != var109); var119++) {
                    }
                    if (class41.field809 > var119) {
                        while (class41.field809 - 1 > var119) {
                            class40.field807[var119] = class40.field807[var119 + 1];
                            var119++;
                        }
                        class41.field809--;
                        class40.field807[class41.field809] = null;
                    }
                } else {
                    class88 var112 = new class88();
                    var112.field2283 = var107;
                    var112.field1872 = class173.method1166(var112.field2283, 1);
                    var112.field1878 = var109;
                    var112.field1876 = var111;
                    int var113;
                    for (var113 = class41.field809 - 1; var113 >= 0; var113--) {
                        int var114 = class40.field807[var113].field1872.method396(var112.field1872, -99);
                        if (var114 == 0) {
                            class40.field807[var113].field1878 = var109;
                            class40.field807[var113].field1876 = var111;
                            if (class176.field3377 == var107) {
                                class60.field1165 = var111;
                            }
                            class184.field3529 = -1;
                            class25.field474 = class103.field2162;
                            return true;
                        }
                        if (var114 < 0) {
                            break;
                        }
                    }
                    if (class41.field809 >= class40.field807.length) {
                        class184.field3529 = -1;
                        return true;
                    }
                    for (int var115 = class41.field809 - 1; var115 > var113; var115--) {
                        class40.field807[var115 + 1] = class40.field807[var115];
                    }
                    if (class41.field809 == 0) {
                        class40.field807 = new class88[100];
                    }
                    class40.field807[var113 + 1] = var112;
                    class41.field809++;
                    if (class176.field3377 == var107) {
                        class60.field1165 = var111;
                    }
                }
                class184.field3529 = -1;
                class25.field474 = class103.field2162;
                return true;
            }
            if (class184.field3529 == 20) {
                for (int var120 = 0; var120 < class203.field3991; var120++) {
                    class99 var121 = class139.method1011(var120, 16);
                    if (var121 != null && var121.field2094 == 0) {
                        class76.field1660[var120] = 0;
                        class83.field1778[var120] = 0;
                    }
                }
                class86.method704((byte) 122);
                class98.field2081 += 32;
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 186) {
                class202.field3944 = class22.field418.method604((byte) 38);
                class184.field3529 = -1;
                class36.field713 = class103.field2162;
                return true;
            }
            if (class184.field3529 == 221) {
                for (int var122 = 0; var122 < class83.field1778.length; var122++) {
                    if (class83.field1778[var122] != class76.field1660[var122]) {
                        class83.field1778[var122] = class76.field1660[var122];
                        class126.method952(var122, -40);
                        class147.field2887[class142.method1018(class98.field2081++, 31)] = var122;
                    }
                }
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 90) {
                int var123 = class22.field418.method595(85);
                int var124 = class22.field418.method577((byte) 102);
                class61 var125 = class23.method224(var123, 484111152);
                if (var125.field1314 != var124 || var124 == -1) {
                    var125.field1238 = 0;
                    var125.field1314 = var124;
                    var125.field1201 = 0;
                    class20.method204(var125, (byte) -5);
                }
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 115) {
                class20.field385 = class22.field418.method604((byte) -127);
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 166) {
                int var126 = class22.field418.method576(28836);
                int var127 = class22.field418.method610((byte) 82);
                class61 var128 = class23.method224(var127, 484111152);
                if (var128 != null && var128.field1311 == 0) {
                    if (var126 > var128.field1188 - var128.field1303) {
                        var126 = var128.field1188 - var128.field1303;
                    }
                    if (var126 < 0) {
                        var126 = 0;
                    }
                    if (var128.field1250 != var126) {
                        var128.field1250 = var126;
                        class20.method204(var128, (byte) -5);
                    }
                }
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 254) {
                class117.method918(false);
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 213) {
                int var129 = class22.field418.method569(26496);
                byte var130 = class22.field418.method589(6646);
                class76.field1660[var129] = var130;
                if (class83.field1778[var129] != var130) {
                    class83.field1778[var129] = var130;
                    class126.method952(var129, -114);
                }
                class147.field2887[class142.method1018(class98.field2081++, 31)] = var129;
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 152) {
                int var131 = class22.field418.method595(87);
                class138.field2697 = class142.field2782.method1057(var131, (byte) 22);
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 18) {
                int var132 = class22.field418.method586((byte) 110);
                int var133 = class22.field418.method594(27796);
                int var134 = class22.field418.method592((byte) 125);
                class63 var135 = (class63) class138.field2710.method1342((long) var134, (byte) -20);
                if (var135 != null) {
                    class185.method1230(var135.field1349 != var132, !arg0, var135);
                }
                class165.method1125(-127, var132, var133, var134);
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 50) {
                int var136 = class22.field418.method592((byte) 125);
                int var137 = class22.field418.method576(28836);
                class76.field1660[var137] = var136;
                if (class83.field1778[var137] != var136) {
                    class83.field1778[var137] = var136;
                    class126.method952(var137, -78);
                }
                class147.field2887[class142.method1018(class98.field2081++, 31)] = var137;
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 148) {
                int var138 = class22.field418.method576(28836);
                if (var138 == 65535) {
                    var138 = -1;
                }
                class115.method906(0, var138);
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 46) {
                int var139 = class22.field418.method579(-86);
                int var140 = class22.field418.method569(26496);
                if (var140 == 65535) {
                    var140 = -1;
                }
                class81.method690(var139, (byte) 6, var140);
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 6) {
                class21.field403 = class22.field418.method584((byte) 80);
                class67.field1449 = class22.field418.method584((byte) 51);
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 35) {
                int var141 = class22.field418.method608(14);
                class202.field3924 = var141;
                class146.method1033(0, var141);
                class6.method31(class202.field3924, (byte) -127);
                for (int var142 = 0; var142 < 100; var142++) {
                    class158.field3077[var142] = true;
                }
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 216) {
                long var143 = class22.field418.method570((byte) 10);
                class47 var145 = class13.method97(class35.method305(class22.field418, 32767).method415(67));
                class60.method506(-124, class173.method1166(var143, 1).method387(false), 6, var145);
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 188) {
                int var146 = class22.field418.method569(26496);
                int var147 = class22.field418.method604((byte) 16);
                int var148 = class22.field418.method569(26496);
                class22.method215((byte) -78, var147, var148, var146);
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 202) {
                class152.field2992 = false;
                for (int var149 = 0; var149 < 5; var149++) {
                    class200.field3904[var149] = false;
                }
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 47) {
                class25.field474 = class103.field2162;
                long var150 = class22.field418.method570((byte) 10);
                if (var150 == 0L) {
                    class40.field807 = null;
                    class41.field809 = 0;
                    class78.field1683 = null;
                    class122.field2478 = null;
                    class184.field3529 = -1;
                    return true;
                }
                long var152 = class22.field418.method570((byte) 10);
                class122.field2478 = class173.method1166(var152, 1);
                class78.field1683 = class173.method1166(var150, 1);
                class202.field3979 = class22.field418.method567(-1);
                int var154 = class22.field418.method604((byte) -29);
                if (var154 == 255) {
                    class184.field3529 = -1;
                    return true;
                }
                class41.field809 = var154;
                class88[] var155 = new class88[100];
                for (int var156 = 0; var156 < class41.field809; var156++) {
                    var155[var156] = new class88();
                    var155[var156].field2283 = class22.field418.method570((byte) 10);
                    var155[var156].field1872 = class173.method1166(var155[var156].field2283, 1);
                    var155[var156].field1878 = class22.field418.method569(26496);
                    var155[var156].field1876 = class22.field418.method567(-1);
                    if (class176.field3377 == var155[var156].field2283) {
                        class60.field1165 = var155[var156].field1876;
                    }
                }
                boolean var157 = false;
                int var158 = class41.field809;
                while (var158 > 0) {
                    var158--;
                    boolean var159 = true;
                    for (int var160 = 0; var160 < var158; var160++) {
                        if (var155[var160].field1872.method396(var155[var160 + 1].field1872, -105) > 0) {
                            class88 var161 = var155[var160];
                            var159 = false;
                            var155[var160] = var155[var160 + 1];
                            var155[var160 + 1] = var161;
                        }
                    }
                    if (var159) {
                        break;
                    }
                }
                class184.field3529 = -1;
                class40.field807 = var155;
                return true;
            }
            if (class184.field3529 == 108) {
                int var162 = class22.field418.method595(63);
                boolean var163 = class22.field418.method564((byte) 104) == 1;
                class61 var164 = class23.method224(var162, 484111152);
                if (var163 != var164.field1215) {
                    var164.field1215 = var163;
                    class20.method204(var164, (byte) -5);
                }
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 84) {
                class177.method1178(class22.field418, class14.field304, 18486, class142.field2782);
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 243) {
                int var165 = class22.field418.method599((byte) 96);
                class63 var166 = (class63) class138.field2710.method1342((long) var165, (byte) -20);
                if (var166 != null) {
                    class185.method1230(true, !arg0, var166);
                }
                if (class200.field3905 != null) {
                    class20.method204(class200.field3905, (byte) -5);
                    class200.field3905 = null;
                }
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 120) {
                long var167 = class22.field418.method570((byte) 10);
                class22.field418.method567(-1);
                long var169 = class22.field418.method570((byte) 10);
                long var171 = (long) class22.field418.method569(26496);
                long var173 = (long) class22.field418.method613(true);
                long var175 = (var171 << 32) + var173;
                boolean var177 = false;
                int var178 = class22.field418.method604((byte) -123);
                for (int var179 = 0; var179 < 100; var179++) {
                    if (class180.field3451[var179] == var175) {
                        var177 = true;
                        break;
                    }
                }
                if (var178 <= 1) {
                    for (int var180 = 0; var180 < class5.field88; var180++) {
                        if (class25.field487[var180] == var167) {
                            var177 = true;
                            break;
                        }
                    }
                }
                if (!var177 && class161.field3141 == 0) {
                    class180.field3451[class119.field2406] = var175;
                    class119.field2406 = (class119.field2406 + 1) % 100;
                    class47 var181 = class13.method97(class35.method305(class22.field418, 32767).method415(118));
                    if (var178 == 2 || var178 == 3) {
                        class133.method977(9, class5.method24(new class47[] { class189.field3672, class173.method1166(var167, 1).method387(false) }, (byte) 125), var181, true, class173.method1166(var169, 1).method387(false));
                    } else if (var178 == 1) {
                        class133.method977(9, class5.method24(new class47[] { class152.field2974, class173.method1166(var167, 1).method387(false) }, (byte) 73), var181, true, class173.method1166(var169, 1).method387(false));
                    } else {
                        class133.method977(9, class173.method1166(var167, 1).method387(false), var181, true, class173.method1166(var169, 1).method387(false));
                    }
                }
                class184.field3529 = -1;
                return true;
            }
            if (arg0) {
                method915((byte) 30);
            }
            if (class184.field3529 == 179) {
                int var182 = class22.field418.method599((byte) 96);
                int var183 = class22.field418.method576(28836);
                class61 var184 = class23.method224(var182, 484111152);
                if (var184.field1259 != 1 || var184.field1184 != var183) {
                    var184.field1184 = var183;
                    var184.field1259 = 1;
                    class20.method204(var184, (byte) -5);
                }
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 114) {
                class187.method1239(0);
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 123) {
                class152.field2992 = true;
                class163.field3170 = class22.field418.method604((byte) -127);
                class97.field2052 = class22.field418.method604((byte) -126);
                class44.field875 = class22.field418.method569(26496);
                class183.field3513 = class22.field418.method604((byte) -126);
                class59.field1145 = class22.field418.method604((byte) -124);
                if (class59.field1145 >= 100) {
                    int var185 = class163.field3170 * 128 + 64;
                    int var186 = class97.field2052 * 128 + 64;
                    int var187 = class39.method335(var185, class196.field3827, var186, 20896) - class44.field875;
                    int var188 = var185 - class33.field639;
                    int var189 = var187 - class188.field3655;
                    int var190 = var186 - class98.field2086;
                    int var191 = (int) Math.sqrt((double) (var188 * var188 + var190 * var190));
                    class194.field3787 = (int) (Math.atan2((double) var189, (double) var191) * 325.949D) & 0x7FF;
                    class53.field1036 = (int) (Math.atan2((double) var188, (double) var190) * -325.949D) & 0x7FF;
                    if (class194.field3787 < 128) {
                        class194.field3787 = 128;
                    }
                    if (class194.field3787 > 383) {
                        class194.field3787 = 383;
                    }
                }
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 105) {
                class21.field403 = class22.field418.method564((byte) 112);
                class67.field1449 = class22.field418.method594(27796);
                while (class14.field304 > class22.field418.field1454) {
                    class184.field3529 = class22.field418.method604((byte) -124);
                    class146.method1032(Integer.MAX_VALUE);
                }
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 137) {
                int var192 = class22.field418.method604((byte) 104);
                if (class22.field418.method604((byte) -126) == 0) {
                    class149.field2930[var192] = new class36();
                } else {
                    class22.field418.field1454--;
                    class149.field2930[var192] = new class36(class22.field418);
                }
                class143.field2816 = class103.field2162;
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 192) {
                class25.field488 = 0;
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 218) {
                int var193 = class22.field418.method569(26496);
                class5.method26(var193, (byte) -90);
                class130.field2559[class142.method1018(class37.field740++, 31)] = class142.method1018(var193, 32767);
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 230) {
                int var194 = class22.field418.method576(28836);
                int var195 = class22.field418.method610((byte) 91);
                int var196 = class22.field418.method576(28836);
                int var197 = class22.field418.method608(-110);
                class61 var198 = class23.method224(var195, 484111152);
                if (var198.field1220 != var196 || var198.field1283 != var197 || var198.field1307 != var194) {
                    var198.field1283 = var197;
                    var198.field1307 = var194;
                    var198.field1220 = var196;
                    class20.method204(var198, (byte) -5);
                }
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 172) {
                int var199 = class22.field418.method599((byte) 96);
                class61 var200 = class23.method224(var199, 484111152);
                for (int var201 = 0; var201 < var200.field1264.length; var201++) {
                    var200.field1264[var201] = -1;
                    var200.field1264[var201] = 0;
                }
                class20.method204(var200, (byte) -5);
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 57) {
                if (class202.field3924 != -1) {
                    class76.method662((byte) -35, class202.field3924, 0);
                }
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 162) {
                class86.method704((byte) 97);
                class41.field813 = class22.field418.method601(25640);
                class109.field2269 = class103.field2162;
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 209) {
                class152.field2992 = true;
                class77.field1666 = class22.field418.method604((byte) -125);
                class194.field3759 = class22.field418.method604((byte) 25);
                class82.field1766 = class22.field418.method569(26496);
                class140.field2748 = class22.field418.method604((byte) 107);
                class53.field1027 = class22.field418.method604((byte) -127);
                if (class53.field1027 >= 100) {
                    class33.field639 = class77.field1666 * 128 + 64;
                    class98.field2086 = class194.field3759 * 128 + 64;
                    class188.field3655 = class39.method335(class33.field639, class196.field3827, class98.field2086, 20896) - class82.field1766;
                }
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 4) {
                int var202 = class22.field418.method599((byte) 96);
                int var203 = class22.field418.method569(26496);
                class61 var204;
                if (var202 >= 0) {
                    var204 = class23.method224(var202, 484111152);
                } else {
                    var204 = null;
                }
                if (var204 != null) {
                    for (int var205 = 0; var205 < var204.field1264.length; var205++) {
                        var204.field1264[var205] = 0;
                        var204.field1310[var205] = 0;
                    }
                }
                if (var202 < -70000) {
                    var203 += 32768;
                }
                class32.method283(var203, !arg0);
                int var206 = class22.field418.method569(26496);
                for (int var207 = 0; var207 < var206; var207++) {
                    int var208 = class22.field418.method569(26496);
                    int var209 = class22.field418.method594(27796);
                    if (var209 == 255) {
                        var209 = class22.field418.method599((byte) 96);
                    }
                    if (var204 != null && var207 < var204.field1264.length) {
                        var204.field1264[var207] = var208;
                        var204.field1310[var207] = var209;
                    }
                    class137.method1000(var207, (byte) -126, var209, var208 - 1, var203);
                }
                if (var204 != null) {
                    class20.method204(var204, (byte) -5);
                }
                class86.method704((byte) -112);
                class130.field2559[class142.method1018(class37.field740++, 31)] = class142.method1018(var203, 32767);
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 149) {
                int var210 = class22.field418.method599((byte) 96);
                class47 var211 = class22.field418.method575(-93);
                class61 var212 = class23.method224(var210, 484111152);
                if (!var211.method409(121, var212.field1284)) {
                    var212.field1284 = var211;
                    class20.method204(var212, (byte) -5);
                }
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 126) {
                class178.method1188(false, 16617);
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 212) {
                class47 var213 = class22.field418.method575(95);
                if (var213.method414(109, class76.field1657)) {
                    boolean var214 = false;
                    class47 var215 = var213.method401(var213.method378(4, class115.field2350), 0, -49);
                    long var216 = var215.method399(109);
                    for (int var218 = 0; var218 < class5.field88; var218++) {
                        if (class25.field487[var218] == var216) {
                            var214 = true;
                            break;
                        }
                    }
                    if (!var214 && class161.field3141 == 0) {
                        class60.method506(-128, var215, 4, class81.field1733);
                    }
                } else if (var213.method414(120, class64.field1391)) {
                    class47 var242 = var213.method401(var213.method378(4, class115.field2350), 0, -49);
                    long var243 = var242.method399(127);
                    boolean var245 = false;
                    for (int var246 = 0; var246 < class5.field88; var246++) {
                        if (class25.field487[var246] == var243) {
                            var245 = true;
                            break;
                        }
                    }
                    if (!var245 && class161.field3141 == 0) {
                        class47 var247 = var213.method401(var213.method376(-43) - 9, var213.method378(4, class115.field2350) - -1, -49);
                        class60.method506(0, var242, 8, var247);
                    }
                } else if (var213.method414(116, class131.field2597)) {
                    class47 var237 = var213.method401(var213.method378(4, class115.field2350), 0, -49);
                    long var238 = var237.method399(125);
                    boolean var240 = false;
                    for (int var241 = 0; var241 < class5.field88; var241++) {
                        if (class25.field487[var241] == var238) {
                            var240 = true;
                            break;
                        }
                    }
                    if (!var240 && class161.field3141 == 0) {
                        class60.method506(45, var237, 10, class181.field3472);
                    }
                } else if (var213.method414(125, class79.field1721)) {
                    class47 var236 = var213.method401(var213.method378(4, class79.field1721), 0, -49);
                    class60.method506(-125, class181.field3472, 11, var236);
                } else if (var213.method414(112, class193.field3750)) {
                    class47 var219 = var213.method401(var213.method378(4, class193.field3750), 0, -49);
                    if (class161.field3141 == 0) {
                        class60.method506(-127, class181.field3472, 12, var219);
                    }
                } else if (var213.method414(118, client.field555)) {
                    class47 var235 = var213.method401(var213.method378(4, client.field555), 0, -49);
                    if (class161.field3141 == 0) {
                        class60.method506(71, class181.field3472, 13, var235);
                    }
                } else if (var213.method414(99, class165.field3199)) {
                    class47 var230 = var213.method401(var213.method378(4, class115.field2350), 0, -49);
                    boolean var231 = false;
                    long var232 = var230.method399(126);
                    for (int var234 = 0; var234 < class5.field88; var234++) {
                        if (class25.field487[var234] == var232) {
                            var231 = true;
                            break;
                        }
                    }
                    if (!var231 && class161.field3141 == 0) {
                        class60.method506(29, var230, 14, class181.field3472);
                    }
                } else if (var213.method414(114, class83.field1775)) {
                    class47 var225 = var213.method401(var213.method378(4, class115.field2350), 0, -49);
                    long var226 = var225.method399(122);
                    boolean var228 = false;
                    for (int var229 = 0; var229 < class5.field88; var229++) {
                        if (class25.field487[var229] == var226) {
                            var228 = true;
                            break;
                        }
                    }
                    if (!var228 && class161.field3141 == 0) {
                        class60.method506(-127, var225, 15, class181.field3472);
                    }
                } else if (var213.method414(123, class127.field2541)) {
                    class47 var220 = var213.method401(var213.method378(4, class115.field2350), 0, -49);
                    long var221 = var220.method399(123);
                    boolean var223 = false;
                    for (int var224 = 0; var224 < class5.field88; var224++) {
                        if (class25.field487[var224] == var221) {
                            var223 = true;
                            break;
                        }
                    }
                    if (!var223 && class161.field3141 == 0) {
                        class60.method506(-124, var220, 16, class181.field3472);
                    }
                } else {
                    class60.method506(23, class181.field3472, 0, var213);
                }
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 30) {
                class124.field2507 = class22.field418.method604((byte) -127);
                class97.field2066 = class22.field418.method604((byte) -128);
                class182.field3481 = class22.field418.method604((byte) -125);
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 187) {
                class178.method1188(true, 16617);
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 98) {
                int var248 = class22.field418.method569(26496);
                int var249 = class22.field418.method595(125);
                class61 var250 = class23.method224(var249, 484111152);
                if (var250.field1259 != 2 || var250.field1184 != var248) {
                    var250.field1184 = var248;
                    var250.field1259 = 2;
                    class20.method204(var250, (byte) -5);
                }
                class184.field3529 = -1;
                return true;
            }
            if (class184.field3529 == 68) {
                class21.field403 = class22.field418.method564((byte) -123);
                class67.field1449 = class22.field418.method584((byte) 82);
                for (int var251 = class67.field1449; var251 < class67.field1449 + 8; var251++) {
                    for (int var252 = class21.field403; var252 < class21.field403 + 8; var252++) {
                        if (class31.field597[class196.field3827][var251][var252] != null) {
                            class31.field597[class196.field3827][var251][var252] = null;
                            class159.method1094(var252, var251, (byte) -112);
                        }
                    }
                }
                for (class199 var253 = (class199) client.field551.method345(-96); var253 != null; var253 = (class199) client.field551.method348(13949)) {
                    if (class67.field1449 <= var253.field3885 && class67.field1449 + 8 > var253.field3885 && class21.field403 <= var253.field3873 && class21.field403 + 8 > var253.field3873 && class196.field3827 == var253.field3889) {
                        var253.field3891 = 0;
                    }
                }
                class184.field3529 = -1;
                return true;
            }
            class167.method1131((byte) -71, null, "T1 - " + class184.field3529 + "," + class76.field1659 + "," + class19.field378 + " - " + class14.field304);
            class36.method308(2);
        } catch (IOException var257) {
            class56.method482(101);
        } catch (Exception var258) {
            String var255 = "T2 - " + class184.field3529 + "," + class76.field1659 + "," + class19.field378 + " - " + class14.field304 + "," + (class123.field2489.field3310[0] + class127.field2536) + "," + (class123.field2489.field3317[0] + class34.field649) + " - ";
            for (int var256 = 0; class14.field304 > var256 && var256 < 50; var256++) {
                var255 = var255 + class22.field418.field1495[var256] + ",";
            }
            class167.method1131((byte) -56, var258, var255);
            class36.method308(2);
        }
        return true;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V")
    public static final void method910(byte arg0) {
        if (arg0 >= -106) {
            method911((byte) 101, 125, null);
        }
        field2356++;
        for (class146 var1 = (class146) class124.field2501.method345(-120); var1 != null; var1 = (class146) class124.field2501.method348(13949)) {
            if (var1.field2849 != null) {
                var1.method1030(49);
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BILsh;)V")
    public static final void method911(byte arg0, int arg1, class170 arg2) {
        class12.method90(arg1, 126, arg2.field3291, arg2.field3281);
        if (arg0 > 5) {
            field2363++;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IILah;)Lfb;")
    public static final class50 method912(int arg0, int arg1, class9 arg2) {
        field2359++;
        if (arg1 != 0) {
            field2358 = null;
        }
        return class23.method226(arg2, arg0, 2) ? class81.method687(false) : null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)V")
    public static final void method913(int arg0, int arg1, int arg2) {
        field2354++;
        if (arg0 == -1) {
            class60.field1174.method657(28182, 29);
            class60.field1174.method583(arg0 - 68041367, arg1);
            class60.field1174.method606(arg2, -1424429928);
            class124.field2502++;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lhd;[BI)V")
    public final void method914(class68 arg0, byte[] arg1, int arg2) {
        field2355++;
        if (arg0.field1495[arg0.field1454] != 31 || arg0.field1495[arg0.field1454 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (arg2 != 4040) {
            field2364 = null;
        }
        if (this.field2353 == null) {
            this.field2353 = new Inflater(true);
        }
        try {
            this.field2353.setInput(arg0.field1495, arg0.field1454 + 10, -8 - (arg0.field1454 + 10) + arg0.field1495.length);
            this.field2353.inflate(arg1);
        } catch (Exception var4) {
            this.field2353.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field2353.reset();
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(III)V")
    private class116(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)V")
    public static void method915(byte arg0) {
        field2366 = null;
        if (arg0 != 105) {
            field2365 = -98;
        }
        field2364 = null;
        field2358 = null;
        field2357 = null;
        field2361 = null;
        field2367 = null;
    }
}
