import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class77 extends class54 {

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
    public static int field1352 = 0;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "Ldc;")
    public static class37 field1354 = class185.method1233((byte) 86, "sl_stars");

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "Ldc;")
    public static class37 field1356 = class185.method1233((byte) 86, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "Ldc;")
    private static class37 field1351 = class185.method1233((byte) 86, "go back to the main RuneScape webpage");

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "I")
    public static int field1359 = 0;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "Ldc;")
    public static class37 field1349 = field1351;

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "[Z")
    public static boolean[] field1360 = new boolean[8];

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "Lrb;")
    public static class187 field1350;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "Lwa;")
    public static class238 field1355;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "Lha;")
    public class77 field1353;

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "Lha;")
    public class77 field1357;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)Z")
    public static final boolean method531(int arg0) throws IOException {
        field1361++;
        if (class180.field3352 == null) {
            return false;
        }
        int var1 = class180.field3352.method554(-80);
        if (var1 == 0) {
            return false;
        }
        if (class223.field4136 == -1) {
            var1--;
            class180.field3352.method555(1, 121, 0, class12.field167.field502);
            class12.field167.field526 = 0;
            class223.field4136 = class12.field167.method1508((byte) 47);
            class8.field100 = class120.field2137[class223.field4136];
        }
        if (class8.field100 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class180.field3352.method555(1, arg0 - 19935, 0, class12.field167.field502);
            var1--;
            class8.field100 = class12.field167.field502[0] & 0xFF;
        }
        if (class8.field100 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class180.field3352.method555(2, 113, 0, class12.field167.field502);
            class12.field167.field526 = 0;
            class8.field100 = class12.field167.method230((byte) -101);
        }
        if (var1 < class8.field100) {
            return false;
        }
        class12.field167.field526 = 0;
        class180.field3352.method555(class8.field100, 105, 0, class12.field167.field502);
        class135.field2502 = 0;
        class59.field1096 = class59.field1105;
        class59.field1105 = class100.field1739;
        class100.field1739 = class223.field4136;
        if (class223.field4136 == 225) {
            int var2 = class12.field167.method226(-18);
            int var3 = class12.field167.method210(2);
            class136 var4 = class180.method1200(var2, (byte) 111);
            if (var4.field2516 != var3 || var3 == -1) {
                var4.field2530 = 0;
                var4.field2516 = var3;
                var4.field2610 = 0;
                class210.method1395((byte) 29, var4);
            }
            class223.field4136 = -1;
            return true;
        } else if (class223.field4136 == 205) {
            client.method278((byte) 102);
            class191.field3571 = class12.field167.method215(arg0 ^ 0x94D7C444);
            class198.field3693 = class112.field1963;
            class223.field4136 = -1;
            return true;
        } else if (class223.field4136 == 139) {
            field1359 = class12.field167.method234((byte) 82) * 30;
            class223.field4136 = -1;
            class198.field3693 = class112.field1963;
            return true;
        } else if (class223.field4136 == 192) {
            byte[] var5 = new byte[class8.field100];
            class12.field167.method1507(-122, class8.field100, 0, var5);
            class208.method1377(class105.method682(var5, 0, class8.field100, 0), (byte) -110);
            class223.field4136 = -1;
            return true;
        } else if (class223.field4136 == 112) {
            int var6 = class12.field167.method207(65280);
            int var7 = class12.field167.method230((byte) -118);
            int var8 = class12.field167.method219((byte) -128);
            int var9 = class12.field167.method207(65280);
            if (var8 >> 30 != 0) {
                int var14 = var8 >> 28 & 0x3;
                int var15 = (var8 & 0x3FFF) - class124.field2212;
                int var16 = (var8 >> 14 & 0x3FFF) - class99.field1735;
                if (var16 >= 0 && var15 >= 0 && var16 < 104 && var15 < 104) {
                    int var17 = var16 * 128 + 64;
                    int var18 = var15 * 128 + 64;
                    class185 var19 = new class185(var6, var14, var17, var18, class145.method1008(var14, var17, var18, (byte) -96) - var9, var7, class203.field3758);
                    class191.field3566.method1340(69, new class97(var19));
                }
            } else if (var8 >> 29 != 0) {
                int var12 = var8 & 0xFFFF;
                class66 var13 = class70.field1262[var12];
                if (var13 != null) {
                    var13.field3502 = class203.field3758 + var7;
                    var13.field3526 = 0;
                    var13.field3541 = var6;
                    if (class203.field3758 < var13.field3502) {
                        var13.field3526 = -1;
                    }
                    var13.field3492 = 0;
                    if (var13.field3541 == 65535) {
                        var13.field3541 = -1;
                    }
                    var13.field3478 = var9;
                }
            } else if (var8 >> 28 != 0) {
                int var10 = var8 & 0xFFFF;
                class123 var11;
                if (class75.field1324 == var10) {
                    var11 = class238.field4382;
                } else {
                    var11 = class8.field107[var10];
                }
                if (var11 != null) {
                    var11.field3526 = 0;
                    var11.field3478 = var9;
                    var11.field3541 = var6;
                    var11.field3492 = 0;
                    var11.field3502 = class203.field3758 + var7;
                    if (class203.field3758 < var11.field3502) {
                        var11.field3526 = -1;
                    }
                    if (var11.field3541 == 65535) {
                        var11.field3541 = -1;
                    }
                }
            }
            class223.field4136 = -1;
            return true;
        } else if (class223.field4136 == 125 || class223.field4136 == 238 || class223.field4136 == 198 || class223.field4136 == 74 || class223.field4136 == 16 || class223.field4136 == 214 || class223.field4136 == 188 || class223.field4136 == 134 || class223.field4136 == 138 || class223.field4136 == 60 || class223.field4136 == 77 || class223.field4136 == 24) {
            class82.method566(-89);
            class223.field4136 = -1;
            return true;
        } else if (class223.field4136 == 10) {
            if (class8.field100 == 0) {
                class41.field856 = class214.field3996;
            } else {
                class41.field856 = class12.field167.method180(2);
            }
            class223.field4136 = -1;
            return true;
        } else if (class223.field4136 == 76) {
            int var20 = class12.field167.method207(65280);
            int var21 = class12.field167.method195(125);
            int var22 = class12.field167.method207(65280);
            int var23 = class12.field167.method207(65280);
            class136 var24 = class180.method1200(var21, (byte) 111);
            if (var24.field2617 != var20 || var24.field2620 != var23 || var24.field2560 != var22) {
                var24.field2617 = var20;
                var24.field2620 = var23;
                var24.field2560 = var22;
                class210.method1395((byte) 29, var24);
            }
            class223.field4136 = -1;
            return true;
        } else if (class223.field4136 == 87) {
            class156.method1059(arg0 ^ 0x5152);
            class223.field4136 = -1;
            return true;
        } else if (class223.field4136 == 229) {
            int var25 = class12.field167.method207(65280);
            if (var25 == 65535) {
                var25 = -1;
            }
            int var26 = class12.field167.method195(-112);
            int var27 = class12.field167.method189((byte) 122);
            int var28 = var26 >> 28 & 0x3;
            int var29 = var26 >> 14 & 0x3FFF;
            int var30 = var27 >> 2;
            int var31 = var26 & 0x3FFF;
            int var32 = var27 & 0x3;
            int var33 = var31 - class124.field2212;
            int var34 = var29 - class99.field1735;
            int var35 = class168.field3200[var30];
            class131.method917(90, var35, var34, var33, var25, var30, var28, var32);
            class223.field4136 = -1;
            return true;
        } else if (class223.field4136 == 213) {
            long var36 = class12.field167.method222(-90);
            class12.field167.method206(-16933672);
            long var38 = class12.field167.method222(-107);
            long var40 = (long) class12.field167.method230((byte) -103);
            long var42 = (long) class12.field167.method225(116);
            long var44 = (var40 << 32) + var42;
            int var46 = class12.field167.method215(arg0 - 1797833796);
            int var47 = class12.field167.method230((byte) -114);
            boolean var48 = false;
            int var49 = 0;
            label1118: while (true) {
                if (var49 >= 100) {
                    if (var46 <= 1) {
                        for (int var50 = 0; var50 < class59.field1100; var50++) {
                            if (class193.field3606[var50] == var36) {
                                var48 = true;
                                break label1118;
                            }
                        }
                    }
                    break;
                }
                if (class68.field1246[var49] == var44) {
                    var48 = true;
                    break;
                }
                var49++;
            }
            if (!var48 && class245.field4482 == 0) {
                class68.field1246[class107.field1875] = var44;
                class107.field1875 = (class107.field1875 + 1) % 100;
                class37 var51 = class66.method486(var47, arg0 - 20043).method974(class12.field167, arg0 - 20044);
                if (var46 == 2 || var46 == 3) {
                    class203.method1334(20, var47, var51, class184.method1228(-1, var38).method317((byte) 59), class80.method548(new class37[] { class49.field971, class184.method1228(-1, var36).method317((byte) 59) }, arg0 - 20069), (byte) -115);
                } else if (var46 == 1) {
                    class203.method1334(20, var47, var51, class184.method1228(-1, var38).method317((byte) 59), class80.method548(new class37[] { class74.field1313, class184.method1228(-1, var36).method317((byte) 59) }, arg0 ^ 0xFFFFB1F3), (byte) -126);
                } else {
                    class203.method1334(20, var47, var51, class184.method1228(arg0 ^ 0xFFFFB1B3, var38).method317((byte) 59), class184.method1228(-1, var36).method317((byte) 59), (byte) -103);
                }
            }
            class223.field4136 = -1;
            return true;
        } else if (class223.field4136 == 34) {
            int var52 = class8.field100 + class12.field167.field526;
            int var53 = class12.field167.method230((byte) -126);
            int var54 = class12.field167.method230((byte) -128);
            if (class149.field2828 != var53) {
                class149.field2828 = var53;
                class15.method101(15532, class149.field2828);
                class206.method1364((byte) -60);
                class78.method539(class149.field2828, true);
                for (int var55 = 0; var55 < 100; var55++) {
                    class211.field3948[var55] = true;
                }
            }
            while (var54-- > 0) {
                int var64 = class12.field167.method226(0);
                int var65 = class12.field167.method230((byte) -117);
                int var66 = class12.field167.method215(-1797813752);
                class201 var67 = (class201) class85.field1499.method1047((byte) 109, (long) var64);
                if (var67 != null && var67.field3746 != var65) {
                    class128.method902(true, -28361, var67);
                    var67 = null;
                }
                if (var67 == null) {
                    var67 = class153.method1046(var66, var65, var64, arg0 - 42046);
                }
                var67.field3752 = true;
            }
            for (class201 var56 = (class201) class85.field1499.method1042((byte) -25); var56 != null; var56 = (class201) class85.field1499.method1041(true)) {
                if (var56.field3752) {
                    var56.field3752 = false;
                } else {
                    class128.method902(true, -28361, var56);
                }
            }
            class107.field1857 = new class153(512);
            while (class12.field167.field526 < var52) {
                int var57 = class12.field167.method226(-83);
                int var58 = class12.field167.method230((byte) -105);
                int var59 = class12.field167.method230((byte) -120);
                int var60 = class12.field167.method226(-88);
                for (int var61 = var58; var61 <= var59; var61++) {
                    long var62 = ((long) var57 << 32) + (long) var61;
                    class107.field1857.method1044(new class140(var60), (byte) -14, var62);
                }
            }
            class223.field4136 = -1;
            return true;
        } else if (class223.field4136 == 47) {
            class191.field3577 = 0;
            class223.field4136 = -1;
            return true;
        } else if (class223.field4136 == 99) {
            int var68 = class12.field167.method195(-39);
            class37 var69 = class12.field167.method180(2);
            class136 var70 = class180.method1200(var68, (byte) 111);
            if (!var69.method346(var70.field2580, (byte) -49)) {
                var70.field2580 = var69;
                class210.method1395((byte) 29, var70);
            }
            class223.field4136 = -1;
            return true;
        } else if (class223.field4136 == 52) {
            class41.field860 = class12.field167.method215(-1797813752);
            class238.field4378 = class12.field167.method227(-124);
            while (class12.field167.field526 < class8.field100) {
                class223.field4136 = class12.field167.method215(arg0 - 1797833796);
                class82.method566(66);
            }
            class223.field4136 = -1;
            return true;
        } else if (class223.field4136 == 13) {
            class28.field499 = true;
            class106.field1832 = class12.field167.method215(-1797813752);
            class152.field2876 = class12.field167.method215(-1797813752);
            class155.field2924 = class12.field167.method230((byte) -98);
            class112.field1999 = class12.field167.method215(-1797813752);
            class195.field3646 = class12.field167.method215(-1797813752);
            if (class195.field3646 >= 100) {
                int var71 = class106.field1832 * 128 + 64;
                int var72 = class152.field2876 * 128 + 64;
                int var73 = class145.method1008(class125.field2246, var71, var72, (byte) -38) - class155.field2924;
                int var74 = var71 - class6.field71;
                int var75 = var72 - class118.field2112;
                int var76 = var73 - class166.field3169;
                int var77 = (int) Math.sqrt((double) (var74 * var74 + var75 * var75));
                class92.field1587 = (int) (Math.atan2((double) var76, (double) var77) * 325.949D) & 0x7FF;
                class25.field434 = (int) (Math.atan2((double) var74, (double) var75) * -325.949D) & 0x7FF;
                if (class92.field1587 < 128) {
                    class92.field1587 = 128;
                }
                if (class92.field1587 > 383) {
                    class92.field1587 = 383;
                }
            }
            class223.field4136 = -1;
            return true;
        } else if (class223.field4136 == 248) {
            int var78 = class12.field167.method195(arg0 ^ 0xFFFFB1EF);
            int var79 = class12.field167.method230((byte) -128);
            int var80 = var79 >> 5 & 0x1F;
            int var81 = var79 >> 10 & 0x1F;
            int var82 = var79 & 0x1F;
            int var83 = (var81 << 19) + (var80 << 11) + (var82 << 3);
            class136 var84 = class180.method1200(var78, (byte) 111);
            if (var84.field2543 != var83) {
                var84.field2543 = var83;
                class210.method1395((byte) 29, var84);
            }
            class223.field4136 = -1;
            return true;
        } else if (class223.field4136 == 183) {
            long var85 = class12.field167.method222(-114);
            class12.field167.method206(arg0 - 16953716);
            long var87 = class12.field167.method222(arg0 ^ 0xFFFFB1D9);
            long var89 = (long) class12.field167.method230((byte) -122);
            long var91 = (long) class12.field167.method225(arg0 - 19923);
            long var93 = (var89 << 32) + var91;
            int var95 = class12.field167.method215(-1797813752);
            boolean var96 = false;
            int var97 = 0;
            label1182: while (true) {
                if (var97 >= 100) {
                    if (var95 <= 1) {
                        if (class144.field2763 == 1 || class78.field1365 == 1) {
                            var96 = true;
                        } else {
                            for (int var98 = 0; var98 < class59.field1100; var98++) {
                                if (class193.field3606[var98] == var85) {
                                    var96 = true;
                                    break label1182;
                                }
                            }
                        }
                    }
                    break;
                }
                if (class68.field1246[var97] == var93) {
                    var96 = true;
                    break;
                }
                var97++;
            }
            if (!var96 && class245.field4482 == 0) {
                class68.field1246[class107.field1875] = var93;
                class107.field1875 = (class107.field1875 + 1) % 100;
                class37 var99 = class93.method629(class180.method1195((byte) -80, class12.field167).method312(arg0 ^ 0x4E4D));
                if (var95 == 2 || var95 == 3) {
                    class173.method1168(class184.method1228(arg0 - 20045, var87).method317((byte) 59), var99, 9, class80.method548(new class37[] { class49.field971, class184.method1228(arg0 - 20045, var85).method317((byte) 59) }, -85), -1);
                } else if (var95 == 1) {
                    class173.method1168(class184.method1228(-1, var87).method317((byte) 59), var99, 9, class80.method548(new class37[] { class74.field1313, class184.method1228(arg0 - 20045, var85).method317((byte) 59) }, arg0 ^ 0xFFFFB181), -1);
                } else {
                    class173.method1168(class184.method1228(-1, var87).method317((byte) 59), var99, 9, class184.method1228(-1, var85).method317((byte) 59), -1);
                }
            }
            class223.field4136 = -1;
            return true;
        } else if (class223.field4136 == 239) {
            client.method278((byte) 102);
            int var100 = class12.field167.method237(37);
            int var101 = class12.field167.method212(arg0 ^ 0x4E33);
            int var102 = class12.field167.method189((byte) 79);
            class115.field2062[var101] = var100;
            class44.field944[var101] = var102;
            class246.field4498[var101] = 1;
            for (int var103 = 0; var103 < 98; var103++) {
                if (var100 >= class85.field1501[var103]) {
                    class246.field4498[var101] = var103 + 2;
                }
            }
            class174.field3319[class58.method449(class203.field3771++, 31)] = var101;
            class223.field4136 = -1;
            return true;
        } else if (class223.field4136 == 246) {
            byte var104 = class12.field167.method187(-75);
            int var105 = class12.field167.method196(125);
            class153.field2907[var105] = var104;
            if (class159.field3011[var105] != var104) {
                class159.field3011[var105] = var104;
                class156.method1061(16428, var105);
            }
            class114.field2042[class58.method449(31, class158.field3000++)] = var105;
            class223.field4136 = -1;
            return true;
        } else if (class223.field4136 == 228) {
            int var106 = class12.field167.method196(123);
            int var107 = class12.field167.method207(arg0 ^ 0xB14C);
            class242.field4445 = var107;
            class82.field1454 = var106;
            class239.method1569((byte) 93);
            class223.field4136 = -1;
            return true;
        } else if (class223.field4136 == 44) {
            class195.method1297(false, -101);
            class223.field4136 = -1;
            return true;
        } else if (class223.field4136 == 58) {
            class37 var108 = class12.field167.method180(2);
            Object[] var109 = new Object[var108.method334(arg0 - 20105) + 1];
            for (int var110 = var108.method334(-61) - 1; var110 >= 0; var110--) {
                if (var108.method329((byte) 126, var110) == 115) {
                    var109[var110 + 1] = class12.field167.method180(arg0 - 20042);
                } else {
                    var109[var110 + 1] = Integer.valueOf(class12.field167.method226(119));
                }
            }
            var109[0] = Integer.valueOf(class12.field167.method226(105));
            class51 var111 = new class51();
            var111.field1042 = var109;
            class210.method1397(var111, (byte) -103);
            class223.field4136 = -1;
            return true;
        } else if (class223.field4136 == 114) {
            long var112 = class12.field167.method222(-110);
            int var114 = class12.field167.method230((byte) -110);
            byte var115 = class12.field167.method206(-16933672);
            boolean var116 = false;
            if ((Long.MIN_VALUE & var112) != 0L) {
                var116 = true;
            }
            if (var116) {
                if (class135.field2496 == 0) {
                    class223.field4136 = -1;
                    return true;
                }
                long var117 = var112 & Long.MAX_VALUE;
                boolean var119 = false;
                int var120;
                for (var120 = 0; class135.field2496 > var120 && (class147.field2794[var120].field1066 != var117 || class147.field2794[var120].field2442 != var114); var120++) {
                }
                if (var120 < class135.field2496) {
                    while (var120 < class135.field2496 - 1) {
                        class147.field2794[var120] = class147.field2794[var120 + 1];
                        var120++;
                    }
                    class135.field2496--;
                    class147.field2794[class135.field2496] = null;
                }
            } else {
                class37 var121 = class12.field167.method180(2);
                class131 var122 = new class131();
                var122.field1066 = var112;
                var122.field2448 = class184.method1228(-1, var122.field1066);
                var122.field2457 = var115;
                var122.field2445 = var121;
                var122.field2442 = var114;
                int var123;
                for (var123 = class135.field2496 - 1; var123 >= 0; var123--) {
                    int var124 = class147.field2794[var123].field2448.method314(true, var122.field2448);
                    if (var124 == 0) {
                        class147.field2794[var123].field2442 = var114;
                        class147.field2794[var123].field2457 = var115;
                        class147.field2794[var123].field2445 = var121;
                        class223.field4136 = -1;
                        class198.field3698 = class112.field1963;
                        if (class198.field3695 == var112) {
                            class84.field1492 = var115;
                        }
                        return true;
                    }
                    if (var124 < 0) {
                        break;
                    }
                }
                if (class135.field2496 >= class147.field2794.length) {
                    class223.field4136 = -1;
                    return true;
                }
                for (int var125 = class135.field2496 - 1; var125 > var123; var125--) {
                    class147.field2794[var125 + 1] = class147.field2794[var125];
                }
                if (class135.field2496 == 0) {
                    class147.field2794 = new class131[100];
                }
                class147.field2794[var123 + 1] = var122;
                class135.field2496++;
                if (class198.field3695 == var112) {
                    class84.field1492 = var115;
                }
            }
            class198.field3698 = class112.field1963;
            class223.field4136 = -1;
            return true;
        } else if (class223.field4136 == 203) {
            class112.field1977 = (short) class12.field167.method207(65280);
            if (class112.field1977 <= 0) {
                class112.field1977 = 1;
            }
            class228.field4192 = (short) class12.field167.method207(65280);
            if (class228.field4192 <= 0) {
                class228.field4192 = 32767;
            } else if (class112.field1972 > class228.field4192) {
                class228.field4192 = class112.field1972;
            }
            class112.field1972 = (short) class12.field167.method207(65280);
            if (class112.field1972 <= 0) {
                class112.field1972 = 1;
            }
            class88.field1543 = (short) class12.field167.method196(123);
            class223.field4136 = -1;
            if (class88.field1543 <= 0) {
                class88.field1543 = 32767;
            } else if (class112.field1977 > class88.field1543) {
                class88.field1543 = class112.field1977;
            }
            return true;
        } else if (class223.field4136 == 90) {
            class44.field950 = class12.field167.method180(2);
            class3.method30(class44.field950, 0);
            class223.field4136 = -1;
            return true;
        } else if (class223.field4136 == 197) {
            int var126 = class12.field167.method207(65280);
            int var127 = class12.field167.method195(115);
            class136 var128 = class180.method1200(var127, (byte) 111);
            if (var128 != null && var128.field2513 == 0) {
                if (var128.field2598 - var128.field2509 < var126) {
                    var126 = var128.field2598 - var128.field2509;
                }
                if (var126 < 0) {
                    var126 = 0;
                }
                if (var128.field2593 != var126) {
                    var128.field2593 = var126;
                    class210.method1395((byte) 29, var128);
                }
            }
            class223.field4136 = -1;
            return true;
        } else {
            if (arg0 != 20044) {
                field1351 = null;
            }
            if (class223.field4136 == 150) {
                class198.field3698 = class112.field1963;
                long var129 = class12.field167.method222(-108);
                if (var129 == 0L) {
                    class223.field4136 = -1;
                    class147.field2794 = null;
                    class31.field618 = null;
                    class41.field841 = null;
                    class135.field2496 = 0;
                    return true;
                }
                long var131 = class12.field167.method222(-99);
                class41.field841 = class184.method1228(-1, var131);
                class31.field618 = class184.method1228(arg0 - 20045, var129);
                class223.field4141 = class12.field167.method206(-16933672);
                int var133 = class12.field167.method215(arg0 ^ 0x94D7C444);
                if (var133 == 255) {
                    class223.field4136 = -1;
                    return true;
                }
                class135.field2496 = var133;
                class131[] var134 = new class131[100];
                for (int var135 = 0; var135 < class135.field2496; var135++) {
                    var134[var135] = new class131();
                    var134[var135].field1066 = class12.field167.method222(-97);
                    var134[var135].field2448 = class184.method1228(-1, var134[var135].field1066);
                    var134[var135].field2442 = class12.field167.method230((byte) -124);
                    var134[var135].field2457 = class12.field167.method206(arg0 ^ 0xFEFDD294);
                    var134[var135].field2445 = class12.field167.method180(2);
                    if (class198.field3695 == var134[var135].field1066) {
                        class84.field1492 = var134[var135].field2457;
                    }
                }
                boolean var136 = false;
                int var137 = class135.field2496;
                while (var137 > 0) {
                    var137--;
                    boolean var138 = true;
                    for (int var139 = 0; var139 < var137; var139++) {
                        if (var134[var139].field2448.method314(true, var134[var139 + 1].field2448) > 0) {
                            var138 = false;
                            class131 var140 = var134[var139];
                            var134[var139] = var134[var139 + 1];
                            var134[var139 + 1] = var140;
                        }
                    }
                    if (var138) {
                        break;
                    }
                }
                class223.field4136 = -1;
                class147.field2794 = var134;
                return true;
            } else if (class223.field4136 == 75) {
                class17.field263 = class12.field167.method215(arg0 - 1797833796);
                class204.field3788 = class12.field167.method215(-1797813752);
                class66.field1185 = class12.field167.method215(-1797813752);
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 39) {
                class28.field499 = false;
                for (int var141 = 0; var141 < 5; var141++) {
                    class233.field4246[var141] = false;
                }
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 221) {
                for (int var142 = 0; var142 < class8.field107.length; var142++) {
                    if (class8.field107[var142] != null) {
                        class8.field107[var142].field3524 = -1;
                    }
                }
                for (int var143 = 0; var143 < class70.field1262.length; var143++) {
                    if (class70.field1262[var143] != null) {
                        class70.field1262[var143].field3524 = -1;
                    }
                }
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 202) {
                int var144 = class12.field167.method207(arg0 + 45236);
                int var145 = class12.field167.method234((byte) 82);
                int var146 = class12.field167.method237(56);
                class136 var147 = class180.method1200(var146, (byte) 111);
                class223.field4136 = -1;
                var147.field2600 = (var145 << 16) + var144;
                return true;
            } else if (class223.field4136 == 6) {
                int var148 = class12.field167.method219((byte) -117);
                int var149 = class12.field167.method212(126);
                int var150 = class12.field167.method207(65280);
                class201 var151 = (class201) class85.field1499.method1047((byte) -33, (long) var148);
                if (var151 != null) {
                    class128.method902(var151.field3746 != var150, arg0 ^ 0xFFFFDF7B, var151);
                }
                class153.method1046(var149, var150, var148, -22002);
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 1) {
                class239.field4389 = class12.field167.method215(-1797813752);
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 102) {
                for (int var152 = 0; var152 < class159.field3011.length; var152++) {
                    if (class159.field3011[var152] != class153.field2907[var152]) {
                        class159.field3011[var152] = class153.field2907[var152];
                        class156.method1061(16428, var152);
                        class114.field2042[class58.method449(class158.field3000++, 31)] = var152;
                    }
                }
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 81) {
                class59.field1100 = class8.field100 / 8;
                for (int var153 = 0; var153 < class59.field1100; var153++) {
                    class193.field3606[var153] = class12.field167.method222(-120);
                    class128.field2388[var153] = class184.method1228(-1, class193.field3606[var153]);
                }
                class223.field4136 = -1;
                class168.field3197 = class112.field1963;
                return true;
            } else if (class223.field4136 == 33) {
                int var154 = class12.field167.method215(-1797813752);
                if (class12.field167.method215(arg0 - 1797833796) == 0) {
                    class200.field3744[var154] = new class205();
                } else {
                    class12.field167.field526--;
                    class200.field3744[var154] = new class205(class12.field167);
                }
                class223.field4136 = -1;
                class94.field1644 = class112.field1963;
                return true;
            } else if (class223.field4136 == 104) {
                int var155 = class12.field167.method226(125);
                int var156 = class12.field167.method230((byte) -105);
                if (var155 < -70000) {
                    var156 += 32768;
                }
                class136 var157;
                if (var155 < 0) {
                    var157 = null;
                } else {
                    var157 = class180.method1200(var155, (byte) 111);
                }
                if (var157 != null) {
                    for (int var158 = 0; var158 < var157.field2538.length; var158++) {
                        var157.field2538[var158] = 0;
                        var157.field2657[var158] = 0;
                    }
                }
                class205.method1349(var156, 1);
                int var159 = class12.field167.method230((byte) -128);
                for (int var160 = 0; var160 < var159; var160++) {
                    int var161 = class12.field167.method196(125);
                    int var162 = class12.field167.method215(-1797813752);
                    if (var162 == 255) {
                        var162 = class12.field167.method226(116);
                    }
                    if (var157 != null && var157.field2538.length > var160) {
                        var157.field2538[var160] = var161;
                        var157.field2657[var160] = var162;
                    }
                    class10.method68(var160, var162, var161 - 1, var156, -44);
                }
                if (var157 != null) {
                    class210.method1395((byte) 29, var157);
                }
                client.method278((byte) 102);
                class183.field3390[class58.method449(31, class138.field2685++)] = class58.method449(32767, var156);
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 148) {
                if (class149.field2828 != -1) {
                    class142.method987(class149.field2828, 0, false);
                }
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 67) {
                int var163 = class12.field167.method196(123);
                int var164 = class12.field167.method195(arg0 - 20066);
                class136 var165 = class180.method1200(var164, (byte) 111);
                if (var163 == 65535) {
                    var163 = -1;
                }
                if (var165.field2621 != 1 || var165.field2601 != var163) {
                    var165.field2601 = var163;
                    var165.field2621 = 1;
                    class210.method1395((byte) 29, var165);
                }
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 19) {
                int var166 = class12.field167.method219((byte) -128);
                boolean var167 = class12.field167.method215(-1797813752) == 1;
                class136 var168 = class180.method1200(var166, (byte) 111);
                if (var168.field2645 != var167) {
                    var168.field2645 = var167;
                    class210.method1395((byte) 29, var168);
                }
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 92) {
                long var169 = class12.field167.method222(-104);
                int var171 = class12.field167.method230((byte) -127);
                class37 var172 = class66.method486(var171, 1).method974(class12.field167, 0);
                class203.method1334(19, var171, var172, null, class184.method1228(-1, var169).method317((byte) 59), (byte) -108);
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 174) {
                client.method278((byte) 102);
                class85.field1503 = class12.field167.method228(true);
                class198.field3693 = class112.field1963;
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 222) {
                int var173 = class12.field167.method230((byte) -103);
                int var174 = class12.field167.method212(127);
                if (var174 == 1) {
                    class6.method45();
                    for (int var175 = 0; var175 < 4; var175++) {
                        class11.field143[var175].method1096(118);
                    }
                    System.gc();
                } else if (var174 == 2) {
                    class145.method1004((byte) -94);
                    System.gc();
                    class236.method1525(25, arg0 + 7128);
                }
                class149.field2828 = var173;
                class15.method101(15532, var173);
                class206.method1364((byte) -60);
                class78.method539(class149.field2828, true);
                for (int var176 = 0; var176 < 100; var176++) {
                    class211.field3948[var176] = true;
                }
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 107) {
                int var177 = class12.field167.method215(-1797813752);
                int var178 = class12.field167.method215(-1797813752);
                int var179 = class12.field167.method215(-1797813752);
                int var180 = class12.field167.method215(-1797813752);
                int var181 = class12.field167.method230((byte) -121);
                class233.field4246[var177] = true;
                class171.field3275[var177] = var178;
                class174.field3323[var177] = var179;
                class170.field3244[var177] = var180;
                class80.field1418[var177] = var181;
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 50) {
                class106.method693(arg0 - 20044);
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 182) {
                int var182 = class12.field167.method215(arg0 ^ 0x94D7C444);
                int var183 = var182 >> 6;
                class25 var184 = new class25();
                var184.field429 = var182 & 0x3F;
                var184.field431 = class12.field167.method215(-1797813752);
                if (var184.field431 >= 0 && var184.field431 < class12.field174.length) {
                    if (var184.field429 == 1 || var184.field429 == 10) {
                        var184.field435 = class12.field167.method230((byte) -101);
                        class12.field167.field526 += 3;
                    } else if (var184.field429 >= 2 && var184.field429 <= 6) {
                        if (var184.field429 == 2) {
                            var184.field436 = 64;
                            var184.field433 = 64;
                        }
                        if (var184.field429 == 3) {
                            var184.field436 = 0;
                            var184.field433 = 64;
                        }
                        if (var184.field429 == 4) {
                            var184.field433 = 64;
                            var184.field436 = 128;
                        }
                        if (var184.field429 == 5) {
                            var184.field436 = 64;
                            var184.field433 = 0;
                        }
                        if (var184.field429 == 6) {
                            var184.field436 = 64;
                            var184.field433 = 128;
                        }
                        var184.field429 = 2;
                        var184.field437 = class12.field167.method230((byte) -123);
                        var184.field438 = class12.field167.method230((byte) -109);
                        var184.field430 = class12.field167.method215(-1797813752);
                    }
                    var184.field439 = class12.field167.method230((byte) -110);
                    if (var184.field439 == 65535) {
                        var184.field439 = -1;
                    }
                    class246.field4504[var183] = var184;
                }
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 161) {
                for (int var185 = 0; var185 < class112.field1978; var185++) {
                    class29 var186 = class82.method559(-61, var185);
                    if (var186 != null && var186.field533 == 0) {
                        class153.field2907[var185] = 0;
                        class159.field3011[var185] = 0;
                    }
                }
                client.method278((byte) 102);
                class158.field3000 += 32;
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 168) {
                int var187 = class12.field167.method207(65280);
                int var188 = class12.field167.method195(110);
                if (var187 == 65535) {
                    var187 = -1;
                }
                int var189 = class12.field167.method226(4);
                class136 var190 = class180.method1200(var189, (byte) 111);
                if (var190.field2527) {
                    var190.field2644 = var188;
                    var190.field2632 = var187;
                    class125 var192 = class223.method1471(-57, var187);
                    var190.field2617 = var192.field2221;
                    var190.field2525 = var192.field2252;
                    var190.field2510 = var192.field2227;
                    var190.field2584 = var192.field2229;
                    var190.field2560 = var192.field2226;
                    if (var190.field2528 > 0) {
                        var190.field2560 = var190.field2560 * 32 / var190.field2528;
                    } else if (var190.field2622 > 0) {
                        var190.field2560 = var190.field2560 * 32 / var190.field2622;
                    }
                    var190.field2620 = var192.field2277;
                    class210.method1395((byte) 29, var190);
                } else if (var187 == -1) {
                    class223.field4136 = -1;
                    var190.field2621 = 0;
                    return true;
                } else {
                    class125 var191 = class223.method1471(-114, var187);
                    var190.field2560 = var191.field2226 * 100 / var188;
                    var190.field2620 = var191.field2277;
                    var190.field2621 = 4;
                    var190.field2601 = var187;
                    var190.field2617 = var191.field2221;
                    class210.method1395((byte) 29, var190);
                }
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 11) {
                long var193 = class12.field167.method222(-89);
                class37 var195 = class93.method629(class180.method1195((byte) -80, class12.field167).method312(1));
                class215.method1418(6, -1, var195, class184.method1228(-1, var193).method317((byte) 59));
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 233) {
                class238.field4378 = class12.field167.method215(-1797813752);
                class41.field860 = class12.field167.method227(-122);
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 96) {
                int var196 = class12.field167.method226(-80);
                class136 var197 = class180.method1200(var196, (byte) 111);
                for (int var198 = 0; var198 < var197.field2538.length; var198++) {
                    var197.field2538[var198] = -1;
                    var197.field2538[var198] = 0;
                }
                class210.method1395((byte) 29, var197);
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 230) {
                class28.field499 = true;
                class37.field787 = class12.field167.method215(-1797813752);
                class145.field2779 = class12.field167.method215(-1797813752);
                class65.field1180 = class12.field167.method230((byte) -101);
                class127.field2342 = class12.field167.method215(arg0 - 1797833796);
                class99.field1733 = class12.field167.method215(arg0 ^ 0x94D7C444);
                if (class99.field1733 >= 100) {
                    class6.field71 = class37.field787 * 128 + 64;
                    class118.field2112 = class145.field2779 * 128 + 64;
                    class166.field3169 = class145.method1008(class125.field2246, class6.field71, class118.field2112, (byte) -89) - class65.field1180;
                }
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 124) {
                int var199 = class12.field167.method196(126);
                int var200 = class12.field167.method237(61);
                class136 var201 = class180.method1200(var200, (byte) 111);
                if (var199 == 65535) {
                    var199 = -1;
                }
                if (var201.field2621 != 2 || var201.field2601 != var199) {
                    var201.field2621 = 2;
                    var201.field2601 = var199;
                    class210.method1395((byte) 29, var201);
                }
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 207) {
                class84.method574(true);
                class223.field4136 = -1;
                return false;
            } else if (class223.field4136 == 160) {
                class173.field3295 = (short) class12.field167.method230((byte) -103);
                if (class173.field3295 <= 0) {
                    class173.field3295 = 320;
                }
                class108.field1887 = (short) class12.field167.method196(arg0 - 19917);
                class223.field4136 = -1;
                if (class108.field1887 <= 0) {
                    class108.field1887 = 256;
                }
                return true;
            } else if (class223.field4136 == 211) {
                class156.method1056((byte) -126, class12.field167);
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 250) {
                int var202 = class12.field167.method195(arg0 - 20088);
                int var203 = class12.field167.method196(arg0 - 19919);
                class153.field2907[var203] = var202;
                if (class159.field3011[var203] != var202) {
                    class159.field3011[var203] = var202;
                    class156.method1061(16428, var203);
                }
                class114.field2042[class58.method449(class158.field3000++, 31)] = var203;
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 137) {
                class79.field1388 = class12.field167.method215(-1797813752);
                class223.field4136 = -1;
                class168.field3197 = class112.field1963;
                return true;
            } else if (class223.field4136 == 212) {
                int var204 = class12.field167.method230((byte) -125);
                int var205 = class12.field167.method215(-1797813752);
                if (var204 == 65535) {
                    var204 = -1;
                }
                int var206 = class12.field167.method230((byte) -120);
                class58.method447(var205, var206, (byte) 65, var204);
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 122) {
                int var207 = class12.field167.method219((byte) -122);
                class125.field2274 = class10.field130.method138(arg0 - 20023, var207);
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 82) {
                int var208 = class12.field167.method207(65280);
                class94.method634(false, var208);
                class183.field3390[class58.method449(31, class138.field2685++)] = class58.method449(32767, var208);
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 177) {
                class195.method1297(true, -103);
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 191) {
                long var209 = class12.field167.method222(-101);
                int var211 = class12.field167.method230((byte) -108);
                int var212 = class12.field167.method215(-1797813752);
                boolean var213 = true;
                if (var209 < 0L) {
                    var213 = false;
                    var209 &= Long.MAX_VALUE;
                }
                class37 var214 = class243.field4462;
                if (var211 > 0) {
                    var214 = class12.field167.method180(2);
                }
                class37 var215 = class184.method1228(-1, var209).method317((byte) 59);
                for (int var216 = 0; var216 < class104.field1808; var216++) {
                    if (class147.field2795[var216] == var209) {
                        if (class162.field3069[var216] != var211) {
                            class162.field3069[var216] = var211;
                            if (var211 > 0) {
                                class215.method1418(5, -1, class80.method548(new class37[] { var215, class65.field1179 }, -57), class243.field4462);
                            }
                            if (var211 == 0) {
                                class215.method1418(5, arg0 - 20045, class80.method548(new class37[] { var215, class85.field1500 }, arg0 + -20053), class243.field4462);
                            }
                        }
                        var215 = null;
                        class204.field3784[var216] = var214;
                        class26.field455[var216] = var212;
                        class237.field4311[var216] = var213;
                        break;
                    }
                }
                boolean var217 = false;
                if (var215 != null && class104.field1808 < 200) {
                    class147.field2795[class104.field1808] = var209;
                    class80.field1420[class104.field1808] = var215;
                    class162.field3069[class104.field1808] = var211;
                    class204.field3784[class104.field1808] = var214;
                    class26.field455[class104.field1808] = var212;
                    class237.field4311[class104.field1808] = var213;
                    class104.field1808++;
                }
                class168.field3197 = class112.field1963;
                int var218 = class104.field1808;
                while (var218 > 0) {
                    var218--;
                    boolean var219 = true;
                    for (int var220 = 0; var220 < var218; var220++) {
                        if (class162.field3069[var220] != class43.field918 && class162.field3069[var220 + 1] == class43.field918 || class162.field3069[var220] == 0 && class162.field3069[var220 + 1] != 0) {
                            var219 = false;
                            int var221 = class162.field3069[var220];
                            class162.field3069[var220] = class162.field3069[var220 + 1];
                            class162.field3069[var220 + 1] = var221;
                            class37 var222 = class204.field3784[var220];
                            class204.field3784[var220] = class204.field3784[var220 + 1];
                            class204.field3784[var220 + 1] = var222;
                            class37 var223 = class80.field1420[var220];
                            class80.field1420[var220] = class80.field1420[var220 + 1];
                            class80.field1420[var220 + 1] = var223;
                            long var224 = class147.field2795[var220];
                            class147.field2795[var220] = class147.field2795[var220 + 1];
                            class147.field2795[var220 + 1] = var224;
                            int var226 = class26.field455[var220];
                            class26.field455[var220] = class26.field455[var220 + 1];
                            class26.field455[var220 + 1] = var226;
                            boolean var227 = class237.field4311[var220];
                            class237.field4311[var220] = class237.field4311[var220 + 1];
                            class237.field4311[var220 + 1] = var227;
                        }
                    }
                    if (var219) {
                        break;
                    }
                }
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 247) {
                class37 var228 = class12.field167.method180(2);
                int var229 = class12.field167.method212(126);
                int var230 = class12.field167.method189((byte) 112);
                if (var229 >= 1 && var229 <= 8) {
                    if (var228.method303(class193.field3601, 40)) {
                        var228 = null;
                    }
                    class166.field3177[var229 - 1] = var228;
                    field1360[var229 - 1] = var230 == 0;
                }
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 89) {
                class37 var231 = class12.field167.method180(2);
                if (var231.method325(class122.field2174, 0)) {
                    class37 var261 = var231.method311(var231.method336(125, class223.field4137), 0, true);
                    long var262 = var261.method347(-113);
                    boolean var264 = false;
                    for (int var265 = 0; var265 < class59.field1100; var265++) {
                        if (class193.field3606[var265] == var262) {
                            var264 = true;
                            break;
                        }
                    }
                    if (!var264 && class245.field4482 == 0) {
                        class215.method1418(4, -1, class152.field2879, var261);
                    }
                } else if (var231.method325(class110.field1912, 0)) {
                    class37 var255 = var231.method311(var231.method336(114, class223.field4137), 0, true);
                    long var256 = var255.method347(arg0 ^ 0x4E0B);
                    boolean var258 = false;
                    for (int var259 = 0; var259 < class59.field1100; var259++) {
                        if (class193.field3606[var259] == var256) {
                            var258 = true;
                            break;
                        }
                    }
                    if (!var258 && class245.field4482 == 0) {
                        class37 var260 = var231.method311(var231.method334(-61) - 9, var231.method336(71, class223.field4137) - -1, true);
                        class215.method1418(8, arg0 ^ 0xFFFFB1B3, var260, var255);
                    }
                } else if (var231.method325(class37.field789, 0)) {
                    class37 var250 = var231.method311(var231.method336(98, class223.field4137), 0, true);
                    long var251 = var250.method347(78);
                    boolean var253 = false;
                    for (int var254 = 0; var254 < class59.field1100; var254++) {
                        if (class193.field3606[var254] == var251) {
                            var253 = true;
                            break;
                        }
                    }
                    if (!var253 && class245.field4482 == 0) {
                        class215.method1418(10, -1, class243.field4462, var250);
                    }
                } else if (var231.method325(class163.field3084, 0)) {
                    class37 var249 = var231.method311(var231.method336(arg0 - 19978, class163.field3084), 0, true);
                    class215.method1418(11, -1, var249, class243.field4462);
                } else if (var231.method325(class107.field1877, 0)) {
                    class37 var248 = var231.method311(var231.method336(91, class107.field1877), 0, true);
                    if (class245.field4482 == 0) {
                        class215.method1418(12, -1, var248, class243.field4462);
                    }
                } else if (var231.method325(class240.field4404, 0)) {
                    class37 var247 = var231.method311(var231.method336(35, class240.field4404), 0, true);
                    if (class245.field4482 == 0) {
                        class215.method1418(13, -1, var247, class243.field4462);
                    }
                } else if (var231.method325(class151.field2855, 0)) {
                    class37 var242 = var231.method311(var231.method336(115, class223.field4137), 0, true);
                    long var243 = var242.method347(arg0 ^ 0xFFFFB19F);
                    boolean var245 = false;
                    for (int var246 = 0; var246 < class59.field1100; var246++) {
                        if (class193.field3606[var246] == var243) {
                            var245 = true;
                            break;
                        }
                    }
                    if (!var245 && class245.field4482 == 0) {
                        class215.method1418(14, -1, class243.field4462, var242);
                    }
                } else if (var231.method325(class3.field24, 0)) {
                    boolean var232 = false;
                    class37 var233 = var231.method311(var231.method336(122, class223.field4137), 0, true);
                    long var234 = var233.method347(-46);
                    for (int var236 = 0; var236 < class59.field1100; var236++) {
                        if (class193.field3606[var236] == var234) {
                            var232 = true;
                            break;
                        }
                    }
                    if (!var232 && class245.field4482 == 0) {
                        class215.method1418(15, -1, class243.field4462, var233);
                    }
                } else if (var231.method325(class24.field421, 0)) {
                    class37 var237 = var231.method311(var231.method336(109, class223.field4137), 0, true);
                    boolean var238 = false;
                    long var239 = var237.method347(-27);
                    for (int var241 = 0; var241 < class59.field1100; var241++) {
                        if (class193.field3606[var241] == var239) {
                            var238 = true;
                            break;
                        }
                    }
                    if (!var238 && class245.field4482 == 0) {
                        class215.method1418(16, arg0 ^ 0xFFFFB1B3, class243.field4462, var237);
                    }
                } else {
                    class215.method1418(0, -1, var231, class243.field4462);
                }
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 232) {
                long var266 = class12.field167.method222(-112);
                long var268 = (long) class12.field167.method230((byte) -113);
                long var270 = (long) class12.field167.method225(123);
                int var272 = class12.field167.method215(-1797813752);
                boolean var273 = false;
                long var274 = (var268 << 32) + var270;
                int var276 = 0;
                label1420: while (true) {
                    if (var276 >= 100) {
                        if (var272 <= 1) {
                            if (class144.field2763 == 1 || class78.field1365 == 1) {
                                var273 = true;
                            } else {
                                for (int var277 = 0; var277 < class59.field1100; var277++) {
                                    if (class193.field3606[var277] == var266) {
                                        var273 = true;
                                        break label1420;
                                    }
                                }
                            }
                        }
                        break;
                    }
                    if (class68.field1246[var276] == var274) {
                        var273 = true;
                        break;
                    }
                    var276++;
                }
                if (!var273 && class245.field4482 == 0) {
                    class68.field1246[class107.field1875] = var274;
                    class107.field1875 = (class107.field1875 + 1) % 100;
                    class37 var278 = class93.method629(class180.method1195((byte) -80, class12.field167).method312(1));
                    if (var272 == 2 || var272 == 3) {
                        class215.method1418(7, -1, var278, class80.method548(new class37[] { class49.field971, class184.method1228(-1, var266).method317((byte) 59) }, -83));
                    } else if (var272 == 1) {
                        class215.method1418(7, -1, var278, class80.method548(new class37[] { class74.field1313, class184.method1228(-1, var266).method317((byte) 59) }, -39));
                    } else {
                        class215.method1418(3, -1, var278, class184.method1228(arg0 ^ 0xFFFFB1B3, var266).method317((byte) 59));
                    }
                }
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 130) {
                long var279 = class12.field167.method222(-121);
                long var281 = (long) class12.field167.method230((byte) -116);
                long var283 = (long) class12.field167.method225(arg0 ^ 0x4E18);
                int var285 = class12.field167.method215(-1797813752);
                int var286 = class12.field167.method230((byte) -102);
                long var287 = (var281 << 32) + var283;
                boolean var289 = false;
                int var290 = 0;
                label1438: while (true) {
                    if (var290 >= 100) {
                        if (var285 <= 1) {
                            for (int var291 = 0; var291 < class59.field1100; var291++) {
                                if (class193.field3606[var291] == var279) {
                                    var289 = true;
                                    break label1438;
                                }
                            }
                        }
                        break;
                    }
                    if (class68.field1246[var290] == var287) {
                        var289 = true;
                        break;
                    }
                    var290++;
                }
                if (!var289 && class245.field4482 == 0) {
                    class68.field1246[class107.field1875] = var287;
                    class107.field1875 = (class107.field1875 + 1) % 100;
                    class37 var292 = class66.method486(var286, 1).method974(class12.field167, 0);
                    if (var285 == 2) {
                        class203.method1334(18, var286, var292, null, class80.method548(new class37[] { class49.field971, class184.method1228(arg0 ^ 0xFFFFB1B3, var279).method317((byte) 59) }, -51), (byte) -101);
                    } else if (var285 == 1) {
                        class203.method1334(18, var286, var292, null, class80.method548(new class37[] { class74.field1313, class184.method1228(-1, var279).method317((byte) 59) }, -53), (byte) -106);
                    } else {
                        class203.method1334(18, var286, var292, null, class184.method1228(-1, var279).method317((byte) 59), (byte) -103);
                    }
                }
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 167) {
                int var293 = class12.field167.method226(-103);
                class201 var294 = (class201) class85.field1499.method1047((byte) -110, (long) var293);
                if (var294 != null) {
                    class128.method902(true, -28361, var294);
                }
                if (class152.field2877 != null) {
                    class210.method1395((byte) 29, class152.field2877);
                    class152.field2877 = null;
                }
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 103) {
                int var295 = class12.field167.method189((byte) 105);
                int var296 = class12.field167.method234((byte) 82);
                int var297 = class12.field167.method207(65280);
                class66 var298 = class70.field1262[var297];
                if (var298 != null) {
                    class122.method835(var296, var298, var295, -1);
                }
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 64) {
                int var299 = class12.field167.method228(true);
                int var300 = class12.field167.method226(124);
                int var301 = class12.field167.method228(true);
                class136 var302 = class180.method1200(var300, (byte) 111);
                var302.field2661 = 0;
                var302.field2630 = var302.field2634 = var301;
                var302.field2636 = var302.field2607 = var299;
                var302.field2652 = 0;
                class210.method1395((byte) 29, var302);
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 147) {
                class197.field3678 = (short) class12.field167.method196(125);
                if (class197.field3678 <= 0) {
                    class197.field3678 = 256;
                }
                class139.field2698 = (short) class12.field167.method207(65280);
                if (class139.field2698 <= 0) {
                    class139.field2698 = 205;
                }
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 126) {
                int var303 = class12.field167.method219((byte) -124);
                class136 var304 = class180.method1200(var303, (byte) 111);
                var304.field2621 = 3;
                var304.field2601 = class238.field4382.field2191.method809(64);
                class210.method1395((byte) 29, var304);
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 110) {
                int var305 = class12.field167.method212(125);
                int var306 = class12.field167.method215(-1797813752);
                int var307 = class12.field167.method189((byte) 125);
                class125.field2246 = var305 >> 1;
                class238.field4382.method1264(var306, (byte) 9, (var305 & 0x1) == 1, var307);
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 159) {
                int var308 = class12.field167.method226(-127);
                int var309 = class12.field167.method230((byte) -123);
                if (var308 < -70000) {
                    var309 += 32768;
                }
                class136 var310;
                if (var308 >= 0) {
                    var310 = class180.method1200(var308, (byte) 111);
                } else {
                    var310 = null;
                }
                while (class8.field100 > class12.field167.field526) {
                    int var311 = class12.field167.method186((byte) 55);
                    int var312 = class12.field167.method230((byte) -127);
                    int var313 = 0;
                    if (var312 != 0) {
                        var313 = class12.field167.method215(arg0 ^ 0x94D7C444);
                        if (var313 == 255) {
                            var313 = class12.field167.method226(123);
                        }
                    }
                    if (var310 != null && var311 >= 0 && var310.field2538.length > var311) {
                        var310.field2538[var311] = var312;
                        var310.field2657[var311] = var313;
                    }
                    class10.method68(var311, var313, var312 - 1, var309, 68);
                }
                if (var310 != null) {
                    class210.method1395((byte) 29, var310);
                }
                client.method278((byte) 102);
                class183.field3390[class58.method449(31, class138.field2685++)] = class58.method449(32767, var309);
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 146) {
                int var314 = class12.field167.method226(104);
                int var315 = class12.field167.method226(arg0 - 19942);
                class201 var316 = (class201) class85.field1499.method1047((byte) -95, (long) var314);
                class201 var317 = (class201) class85.field1499.method1047((byte) -96, (long) var315);
                if (var317 != null) {
                    class128.method902(var316 == null || var316.field3746 != var317.field3746, -28361, var317);
                }
                if (var316 != null) {
                    var316.method433(0);
                    class85.field1499.method1044(var316, (byte) -14, (long) var315);
                }
                class136 var318 = class180.method1200(var314, (byte) 111);
                if (var318 != null) {
                    class210.method1395((byte) 29, var318);
                }
                class136 var319 = class180.method1200(var315, (byte) 111);
                if (var319 != null) {
                    class210.method1395((byte) 29, var319);
                }
                if (class149.field2828 != -1) {
                    class142.method987(class149.field2828, 1, false);
                }
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 118) {
                class238.field4378 = class12.field167.method189((byte) 113);
                class41.field860 = class12.field167.method189((byte) 112);
                for (int var320 = class41.field860; var320 < class41.field860 + 8; var320++) {
                    for (int var322 = class238.field4378; var322 < class238.field4378 + 8; var322++) {
                        if (class183.field3389[class125.field2246][var320][var322] != null) {
                            class183.field3389[class125.field2246][var320][var322] = null;
                            class101.method666(var320, var322, (byte) 119);
                        }
                    }
                }
                for (class166 var321 = (class166) class20.field337.method1338(79); var321 != null; var321 = (class166) class20.field337.method1332((byte) -89)) {
                    if (class41.field860 <= var321.field3175 && var321.field3175 < class41.field860 + 8 && class238.field4378 <= var321.field3178 && class238.field4378 + 8 > var321.field3178 && class125.field2246 == var321.field3168) {
                        var321.field3182 = 0;
                    }
                }
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 7) {
                class3.method29(class8.field100, class12.field167, 116, class10.field130);
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 178) {
                int var323 = class12.field167.method219((byte) -125);
                int var324 = class12.field167.method226(arg0 - 19933);
                int var325 = class12.field167.method196(125);
                if (var325 == 65535) {
                    var325 = -1;
                }
                int var326 = class12.field167.method207(65280);
                if (var326 == 65535) {
                    var326 = -1;
                }
                for (int var327 = var325; var327 <= var326; var327++) {
                    long var328 = ((long) var323 << 32) + (long) var327;
                    class54 var330 = class107.field1857.method1047((byte) 116, var328);
                    if (var330 != null) {
                        var330.method433(0);
                    }
                    class107.field1857.method1044(new class140(var324), (byte) -14, var328);
                }
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 172) {
                int var331 = class12.field167.method234((byte) 82);
                if (var331 == 65535) {
                    var331 = -1;
                }
                class7.method52(var331, (byte) 106);
                class223.field4136 = -1;
                return true;
            } else if (class223.field4136 == 132) {
                int var332 = class12.field167.method229(true);
                int var333 = class12.field167.method230((byte) -104);
                if (var333 == 65535) {
                    var333 = -1;
                }
                class85.method581((byte) 106, var332, var333);
                class223.field4136 = -1;
                return true;
            } else {
                class60.method455(95, null, "T1 - " + class223.field4136 + "," + class59.field1105 + "," + class59.field1096 + " - " + class8.field100);
                class84.method574(true);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)V")
    public static void method532(int arg0) {
        field1355 = null;
        field1349 = null;
        field1350 = null;
        if (arg0 != -1399) {
            field1359 = -29;
        }
        field1356 = null;
        field1354 = null;
        field1360 = null;
        field1351 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    public final void method533(boolean arg0) {
        if (arg0) {
            return;
        }
        field1358++;
        if (this.field1357 != null) {
            this.field1357.field1353 = this.field1353;
            this.field1353.field1357 = this.field1357;
            this.field1353 = null;
            this.field1357 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
    public static final void method534(int arg0) {
        int var1 = 119 % ((48 - arg0) / 63);
        field1362++;
        class88.field1533.method93(0);
        class83.field1468.method1183((byte) 124);
    }
}
