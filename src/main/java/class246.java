import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class246 {

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public int field3255;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "Lgm;")
    public class90 field3253;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "[I")
    public int[] field3258;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)Z", line = 7)
    public static final boolean method1609(byte arg0) throws IOException {
        field3257++;
        if (class181.field2107 == null) {
            return false;
        }
        int var1 = class181.field2107.method2467((byte) -80);
        if (var1 == 0) {
            return false;
        }
        if (class269.field3478 == -1) {
            class181.field2107.method2466(0, 1, 16752, class215.field2658.field3188);
            class215.field2658.field3211 = 0;
            class269.field3478 = class215.field2658.method2166(90);
            class134.field1533 = class202.field2381[class269.field3478];
            var1--;
        }
        if (class134.field1533 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class181.field2107.method2466(0, 1, 16752, class215.field2658.field3188);
            var1--;
            class134.field1533 = class215.field2658.field3188[0] & 0xFF;
        }
        if (class134.field1533 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class181.field2107.method2466(0, 2, 16752, class215.field2658.field3188);
            class215.field2658.field3211 = 0;
            class134.field1533 = class215.field2658.method1587((byte) -102);
            var1 -= 2;
        }
        if (class134.field1533 > var1) {
            return false;
        }
        class215.field2658.field3211 = 0;
        class181.field2107.method2466(0, class134.field1533, 16752, class215.field2658.field3188);
        class383.field5248 = 0;
        class106.field1260 = class382.field5234;
        class382.field5234 = class277.field3584;
        class277.field3584 = class269.field3478;
        if (class269.field3478 == 104) {
            int var2 = class215.field2658.method1576((byte) 125);
            int var3 = class215.field2658.method1551(44);
            int var4 = class215.field2658.method1578(-21);
            if (class388.method2412(arg0 ^ 0x46, var3)) {
                class134.method869(var2, -107, var4);
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 248) {
            int var5 = class215.field2658.method1559((byte) -112);
            int var6 = class215.field2658.method1576((byte) 123);
            int var7 = class215.field2658.method1563(arg0 ^ 0x1F);
            String var8 = "";
            String var9 = var8;
            if ((var7 & 0x1) != 0) {
                var8 = class215.field2658.method1565(-44);
                if ((var7 & 0x2) == 0) {
                    var9 = var8;
                } else {
                    var9 = class215.field2658.method1565(-59);
                }
            }
            String var10 = class215.field2658.method1565(arg0 ^ 0x17);
            if (var5 == 99) {
                class228.method1394(var10, 0);
            } else if (var9.equals("") || !class430.method2622(var9, arg0 ^ 0xFFFFFF9B)) {
                class330.method2124(var9, false, var8, var5, var6, var10);
            } else {
                class269.field3478 = -1;
                return true;
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 140) {
            int var11 = class215.field2658.method1572(-3);
            int var12 = class215.field2658.method1572(-3);
            int var13 = class215.field2658.method1572(-3);
            class43.field513 = var13 >> 1;
            class143.field1684.method842((var13 & 0x1) == 1, var11, (byte) 124, class43.field513, var12);
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 130) {
            int var14 = class215.field2658.method1549(48);
            int var15 = class215.field2658.method1551(53);
            class336.method2153(2, var15, var14);
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 19) {
            class349.field4758 = class215.field2658.method1563(arg0 - 31);
            class269.field3478 = -1;
            class424.field5812 = class383.field5246;
            return true;
        } else if (class269.field3478 == 251) {
            boolean var16 = class215.field2658.method1563(-128) == 1;
            String var17 = class215.field2658.method1565(arg0 + 49);
            String var18 = var17;
            if (var16) {
                var18 = class215.field2658.method1565(-119);
            }
            long var19 = class215.field2658.method1542(-1844808528);
            long var21 = (long) class215.field2658.method1587((byte) -102);
            long var23 = (long) class215.field2658.method1545(8);
            int var25 = class215.field2658.method1563(-128);
            int var26 = class215.field2658.method1587((byte) -102);
            long var27 = (var21 << 32) + var23;
            boolean var29 = false;
            int var30 = 0;
            while (true) {
                if (var30 >= 100) {
                    if (var25 <= 1 && class430.method2622(var18, 4)) {
                        var29 = true;
                    }
                    break;
                }
                if (class8.field65[var30] == var27) {
                    var29 = true;
                    break;
                }
                var30++;
            }
            if (!var29 && class229.field2909 == 0) {
                class8.field65[class392.field5341] = var27;
                class392.field5341 = (class392.field5341 + 1) % 100;
                String var31 = class31.method207(var26, 1).method567(class215.field2658, true);
                if (var25 == 2) {
                    class175.method1099(var26, var31, class346.method2200(var19, (byte) -4), "<img=1>" + var18, 20, "<img=1>" + var17, 0, (byte) 20);
                } else if (var25 == 1) {
                    class175.method1099(var26, var31, class346.method2200(var19, (byte) -4), "<img=0>" + var18, 20, "<img=0>" + var17, 0, (byte) 20);
                } else {
                    class175.method1099(var26, var31, class346.method2200(var19, (byte) -4), var18, 20, var17, 0, (byte) 20);
                }
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 37) {
            int var32 = class215.field2658.method1587((byte) -102);
            int var33 = class215.field2658.method1563(arg0 ^ 0x1F);
            boolean var34 = (var33 & 0x1) == 1;
            class269.method1683((byte) 76, var32, var34);
            int var35 = class215.field2658.method1587((byte) -102);
            for (int var36 = 0; var36 < var35; var36++) {
                int var37 = class215.field2658.method1578(-84);
                int var38 = class215.field2658.method1572(-3);
                if (var38 == 255) {
                    var38 = class215.field2658.method1585((byte) -128);
                }
                class32.method214(var34, var37 - 1, -397439700, var32, var36, var38);
            }
            class126.field1412[class191.method1183(class40.field480++, 31)] = var32;
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 217) {
            int var39 = class215.field2658.method1587((byte) -102);
            int var40 = class215.field2658.method1551(arg0 ^ 0xFFFFFFE4);
            String var41 = class215.field2658.method1565(-72);
            if (class388.method2412(-123, var39)) {
                class57.method317(false, var41, var40);
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 48) {
            class42.field503 = class383.field5246;
            if (class134.field1533 == 0) {
                class269.field3478 = -1;
                class345.field4693 = null;
                class349.field4760 = null;
                class363.field4934 = null;
                class406.field5615 = 0;
                return true;
            }
            class349.field4760 = class215.field2658.method1565(-73);
            boolean var42 = class215.field2658.method1563(arg0 ^ 0x1F) == 1;
            if (var42) {
                class215.field2658.method1565(-88);
            }
            long var43 = class215.field2658.method1542(-1844808528);
            class363.field4934 = class374.method2340(var43, -6279);
            class176.field2065 = class215.field2658.method1589(false);
            int var45 = class215.field2658.method1563(-128);
            if (var45 == 255) {
                class269.field3478 = -1;
                return true;
            }
            class406.field5615 = var45;
            class440[] var46 = new class440[100];
            for (int var47 = 0; var47 < class406.field5615; var47++) {
                var46[var47] = new class440();
                var46[var47].field6070 = class215.field2658.method1565(arg0 + 13);
                boolean var53 = class215.field2658.method1563(-128) == 1;
                if (var53) {
                    var46[var47].field6066 = class215.field2658.method1565(-121);
                } else {
                    var46[var47].field6066 = var46[var47].field6070;
                }
                var46[var47].field6069 = class405.method2524((byte) -112, var46[var47].field6066);
                var46[var47].field6065 = class215.field2658.method1587((byte) -102);
                var46[var47].field6068 = class215.field2658.method1589(false);
                var46[var47].field6063 = class215.field2658.method1565(-94);
                if (var46[var47].field6066.equals(class143.field1684.field1480)) {
                    class20.field217 = var46[var47].field6068;
                }
            }
            boolean var48 = false;
            int var49 = class406.field5615;
            while (var49 > 0) {
                var49--;
                boolean var50 = true;
                for (int var51 = 0; var51 < var49; var51++) {
                    if (var46[var51].field6069.compareTo(var46[var51 + 1].field6069) > 0) {
                        class440 var52 = var46[var51];
                        var46[var51] = var46[var51 + 1];
                        var46[var51 + 1] = var52;
                        var50 = false;
                    }
                }
                if (var50) {
                    break;
                }
            }
            class269.field3478 = -1;
            class345.field4693 = var46;
            return true;
        } else if (class269.field3478 == 173) {
            class223.field2796 = class215.field2658.method1563(-128);
            class364.field4955 = class383.field5246;
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 62) {
            int var54 = class215.field2658.method1587((byte) -102);
            int var55 = class215.field2658.method1563(-128);
            int var56 = class215.field2658.method1563(arg0 - 31);
            int var57 = class215.field2658.method1563(arg0 ^ 0x1F);
            int var58 = class215.field2658.method1563(arg0 ^ 0x1F);
            int var59 = class215.field2658.method1587((byte) -102);
            if (class388.method2412(-34, var54)) {
                class310.field4187[var55] = true;
                class255.field3312[var55] = var56;
                class449.field6282[var55] = var57;
                class207.field2508[var55] = var58;
                class153.field1790[var55] = var59;
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 149) {
            int var60 = class215.field2658.method1587((byte) -102);
            if (class388.method2412(arg0 + 81, var60)) {
                class355.method2249(101);
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 227) {
            int var61 = class215.field2658.method1587((byte) -102);
            int var62 = class215.field2658.method1563(arg0 - 31);
            boolean var63 = (var62 & 0x1) == 1;
            while (class134.field1533 > class215.field2658.field3211) {
                int var64 = class215.field2658.method1559((byte) -70);
                int var65 = class215.field2658.method1587((byte) -102);
                int var66 = 0;
                if (var65 != 0) {
                    var66 = class215.field2658.method1563(arg0 - 31);
                    if (var66 == 255) {
                        var66 = class215.field2658.method1576((byte) 125);
                    }
                }
                class32.method214(var63, var65 - 1, -397439700, var61, var64, var66);
            }
            class126.field1412[class191.method1183(31, class40.field480++)] = var61;
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 118) {
            int var67 = class215.field2658.method1585((byte) -128);
            int var68 = var67 >> 28 & 0x3;
            int var69 = var67 >> 14 & 0x3FFF;
            int var70 = var67 & 0x3FFF;
            int var71 = class215.field2658.method1578(arg0 + 124);
            if (var71 == 65535) {
                var71 = -1;
            }
            int var72 = class215.field2658.method1572(-3);
            int var73 = var72 >> 2;
            int var74 = var72 & 0x3;
            int var75 = class30.field330[var73];
            int var76 = var70 - class129.field1432;
            int var77 = var69 - class278.field3608;
            class173.method1086(var77, var76, var71, 4, var73, var74, var75, var68);
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 24) {
            if (class53.field620 != null) {
                class56.method312(-1, true, -1, class444.field6135, false);
            }
            byte[] var78 = new byte[class134.field1533];
            class215.field2658.method2172(var78, 0, 0, class134.field1533);
            String var79 = class296.method1883(6, var78, class134.field1533, 0);
            class208.method1281(var79, class20.field220 == 1, class401.field5525, arg0 + 106, true);
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 246) {
            class276.field3571 = class215.field2658.method1551(36) * 30;
            class364.field4955 = class383.field5246;
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 21) {
            class180.method1126(false, -126);
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 74) {
            int var80 = class215.field2658.method1572(-3);
            int var81 = class215.field2658.method1583(-128);
            int var82 = class215.field2658.method1549(48);
            class173.field2001[var81] = var82;
            class240.field3157[var81] = var80;
            class131.field1500[var81] = 1;
            int var83 = class75.field916[var81] - 1;
            for (int var84 = 0; var84 < var83; var84++) {
                if (var82 >= class301.field4030[var84]) {
                    class131.field1500[var81] = var84 + 2;
                }
            }
            class197.field2335[class191.method1183(31, class288.field3789++)] = var81;
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 129) {
            String var85 = class215.field2658.method1565(arg0 + 51);
            int var86 = class215.field2658.method1578(arg0 ^ 0x23);
            int var87 = class215.field2658.method1587((byte) -102);
            if (class388.method2412(arg0 ^ 0xD, var86)) {
                class57.method317(false, var85, var87);
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 249) {
            int var88 = class215.field2658.method1587((byte) -102);
            int var89 = class215.field2658.method1583(arg0 ^ 0x1F);
            int var90 = class215.field2658.method1585((byte) -128);
            int var91 = class215.field2658.method1551(37);
            if (class388.method2412(-102, var88)) {
                class244 var92 = (class244) class282.field3678.method2218(arg0 + 98, (long) var90);
                if (var92 != null) {
                    class277.method1741(var92.field3245 != var91, false, var92, 1);
                }
                class62.method357(0, var91, var90, false, var89);
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 52) {
            int var93 = class215.field2658.method1563(-128);
            int var94 = class215.field2658.method1587((byte) -102);
            if (class388.method2412(arg0 ^ 0x4D, var94)) {
                class354.field4817 = var93;
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 243) {
            class215.field2658.field3211 += 28;
            if (class215.field2658.method1575((byte) -124)) {
                class398.method2457(class215.field2658, class215.field2658.field3211 - 28, arg0 + -2117353662);
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 11) {
            int var95 = class215.field2658.method1551(arg0 + 172);
            int var96 = class215.field2658.method1570((byte) 86);
            if (class388.method2412(-86, var95)) {
                class116.method678(2047, arg0 + 5, 5, var96, 0);
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 171) {
            int var97 = class215.field2658.method1583(arg0 - 31);
            int var98 = class215.field2658.method1551(36);
            class153.method986(0, var97, var98);
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 85) {
            String var99 = class215.field2658.method1565(arg0 ^ 0x1F);
            int var100 = class215.field2658.method1587((byte) -102);
            String var101 = class31.method207(var100, arg0 + 98).method567(class215.field2658, true);
            class175.method1099(var100, var101, (String) null, var99, 19, var99, 0, (byte) 20);
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 214) {
            class184.field2133 = class215.field2658.method1563(-128);
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 177) {
            int var102 = class215.field2658.method1587((byte) -102);
            int var103 = class215.field2658.method1576((byte) 124);
            int var104 = class215.field2658.method1583(-128);
            if (class388.method2412(-57, var102)) {
                class72.method433(var103, var104, arg0 + 104);
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 30 || class269.field3478 == 27 || class269.field3478 == 79 || class269.field3478 == 83 || class269.field3478 == 44 || class269.field3478 == 2 || class269.field3478 == 162 || class269.field3478 == 119 || class269.field3478 == 35 || class269.field3478 == 165 || class269.field3478 == 226 || class269.field3478 == 84 || class269.field3478 == 98 || class269.field3478 == 133 || class269.field3478 == 175) {
            class35.method223(arg0 ^ 0xFFFFFF9D);
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 25) {
            byte var105 = class215.field2658.method1589(false);
            int var106 = class215.field2658.method1578(114);
            class336.method2153(2, var106, var105);
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 66) {
            int var107 = class215.field2658.method1563(-128);
            int var108 = var107 >> 5;
            int var109 = var107 & 0x1F;
            if (var109 == 0) {
                class307.field4159[var108] = null;
                class269.field3478 = -1;
                return true;
            }
            class220 var110 = new class220();
            var110.field2716 = var109;
            var110.field2715 = class215.field2658.method1563(-128);
            if (var110.field2715 >= 0 && var110.field2715 < class150.field1756.length) {
                if (var110.field2716 == 1 || var110.field2716 == 10) {
                    var110.field2711 = class215.field2658.method1587((byte) -102);
                    class215.field2658.field3211 += 5;
                } else if (var110.field2716 >= 2 && var110.field2716 <= 6) {
                    if (var110.field2716 == 2) {
                        var110.field2724 = 64;
                        var110.field2712 = 64;
                    }
                    if (var110.field2716 == 3) {
                        var110.field2712 = 64;
                        var110.field2724 = 0;
                    }
                    if (var110.field2716 == 4) {
                        var110.field2712 = 64;
                        var110.field2724 = 128;
                    }
                    if (var110.field2716 == 5) {
                        var110.field2724 = 64;
                        var110.field2712 = 0;
                    }
                    if (var110.field2716 == 6) {
                        var110.field2724 = 64;
                        var110.field2712 = 128;
                    }
                    var110.field2716 = 2;
                    var110.field2721 = class215.field2658.method1587((byte) -102);
                    var110.field2718 = class215.field2658.method1587((byte) -102);
                    var110.field2714 = class215.field2658.method1563(-128);
                    var110.field2719 = class215.field2658.method1587((byte) -102);
                }
                var110.field2723 = class215.field2658.method1587((byte) -102);
                if (var110.field2723 == 65535) {
                    var110.field2723 = -1;
                }
                class307.field4159[var108] = var110;
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 158) {
            int var111 = class215.field2658.method1576((byte) 121);
            class35.field387 = class401.field5525.method2734(var111, 0);
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 125) {
            int var112 = class215.field2658.method1587((byte) -102);
            int var113 = class215.field2658.method1576((byte) 124);
            int var114 = class215.field2658.method1564(true);
            if (class388.method2412(-97, var112)) {
                class96.method596((byte) 61, var113, var114);
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 46) {
            String var115 = class215.field2658.method1565(-97);
            int var116 = class215.field2658.method1563(-128);
            int var117 = class215.field2658.method1551(60);
            if (var117 == 65535) {
                var117 = -1;
            }
            int var118 = class215.field2658.method1563(-128);
            if (var118 >= 1 && var118 <= 8) {
                if (var115.equalsIgnoreCase("null")) {
                    var115 = null;
                }
                class181.field2108[var118 - 1] = var115;
                class1.field9[var118 - 1] = var117;
                class269.field3475[var118 - 1] = var116 == 0;
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 189) {
            boolean var119 = class215.field2658.method1563(arg0 ^ 0x1F) == 1;
            String var120 = class215.field2658.method1565(-78);
            String var121 = var120;
            if (var119) {
                var121 = class215.field2658.method1565(arg0 + 15);
            }
            long var122 = class215.field2658.method1542(-1844808528);
            long var124 = (long) class215.field2658.method1587((byte) -102);
            long var126 = (long) class215.field2658.method1545(8);
            int var128 = class215.field2658.method1563(arg0 ^ 0x1F);
            long var129 = (var124 << 32) + var126;
            boolean var131 = false;
            int var132 = 0;
            while (true) {
                if (var132 >= 100) {
                    if (var128 <= 1) {
                        if (!(!class374.field5070 || class265.field3419) || class352.field4788) {
                            var131 = true;
                        } else if (class430.method2622(var121, arg0 ^ 0xFFFFFF9B)) {
                            var131 = true;
                        }
                    }
                    break;
                }
                if (class8.field65[var132] == var129) {
                    var131 = true;
                    break;
                }
                var132++;
            }
            if (!var131 && class229.field2909 == 0) {
                class8.field65[class392.field5341] = var129;
                class392.field5341 = (class392.field5341 + 1) % 100;
                String var133 = class50.method279((byte) 5, class68.method395(class1.method1(0, class215.field2658), 29766));
                if (var128 == 2 || var128 == 3) {
                    class175.method1099(-1, var133, class346.method2200(var122, (byte) -4), "<img=1>" + var121, 9, "<img=1>" + var120, 0, (byte) 20);
                } else if (var128 == 1) {
                    class175.method1099(-1, var133, class346.method2200(var122, (byte) -4), "<img=0>" + var121, 9, "<img=0>" + var120, 0, (byte) 20);
                } else {
                    class175.method1099(-1, var133, class346.method2200(var122, (byte) -4), var121, 9, var120, 0, (byte) 20);
                }
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 100) {
            int var134 = class215.field2658.method1569(true);
            byte var135 = class215.field2658.method1568(0);
            int var136 = class215.field2658.method1578(7);
            if (class388.method2412(-96, var134)) {
                class134.method869(var135, -125, var136);
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 76) {
            int var137 = class215.field2658.method1578(127);
            int var138 = class215.field2658.method1578(-97);
            int var139 = class215.field2658.method1585((byte) -128);
            if (class388.method2412(arg0 ^ 0x78, var138)) {
                class66.method383(var139, var137, (byte) 70);
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 221) {
            class5.method20((byte) -105);
            class269.field3478 = -1;
            class283.field3709 += 32;
            return true;
        } else if (class269.field3478 == 159) {
            int var140 = class215.field2658.method1587((byte) -102);
            if (var140 == 65535) {
                var140 = -1;
            }
            int var141 = class215.field2658.method1576((byte) 121);
            int var142 = class215.field2658.method1551(126);
            int var143 = class215.field2658.method1569(true);
            if (var143 == 65535) {
                var143 = -1;
            }
            int var144 = class215.field2658.method1585((byte) -128);
            if (class388.method2412(-20, var142)) {
                for (int var145 = var140; var145 <= var143; var145++) {
                    long var146 = ((long) var141 << 32) + (long) var145;
                    class357 var148 = (class357) class368.field5013.method2218(1, var146);
                    class357 var149;
                    if (var148 != null) {
                        var149 = new class357(var144, var148.field4836);
                        var148.method263(false);
                    } else if (var145 == -1) {
                        var149 = new class357(var144, class195.method1212(var141, (byte) 49).field6337.field4836);
                    } else {
                        var149 = new class357(var144, -1);
                    }
                    class368.field5013.method2227(var149, -8218, var146);
                }
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 202) {
            boolean var150 = class215.field2658.method1563(-128) == 1;
            String var151 = class215.field2658.method1565(arg0 ^ 0x19);
            String var152 = class215.field2658.method1565(-125);
            int var153 = class215.field2658.method1587((byte) -102);
            int var154 = class215.field2658.method1563(arg0 ^ 0x1F);
            String var155 = "";
            boolean var156 = false;
            if (var153 > 0) {
                var155 = class215.field2658.method1565(-121);
                var156 = class215.field2658.method1563(-128) == 1;
            }
            for (int var157 = 0; var157 < class332.field4536; var157++) {
                if (var150) {
                    if (var152.equals(class107.field1275[var157])) {
                        class107.field1275[var157] = var151;
                        var151 = null;
                        class300.field4007[var157] = var152;
                        break;
                    }
                } else if (var151.equals(class107.field1275[var157])) {
                    if (class379.field5156[var157] != var153) {
                        class379.field5156[var157] = var153;
                        if (var153 > 0) {
                            class330.method2124("", false, "", 5, 0, var151 + class103.field1210.method434(class373.field5057, arg0 ^ 0x1F9F));
                        }
                        if (var153 == 0) {
                            class330.method2124("", false, "", 5, 0, var151 + class279.field3614.method434(class373.field5057, -8192));
                        }
                    }
                    class300.field4007[var157] = var152;
                    class302.field4060[var157] = var155;
                    class242.field3228[var157] = var154;
                    var151 = null;
                    class314.field4230[var157] = var156;
                    break;
                }
            }
            if (var151 != null && class332.field4536 < 200) {
                class107.field1275[class332.field4536] = var151;
                class300.field4007[class332.field4536] = var152;
                class379.field5156[class332.field4536] = var153;
                class302.field4060[class332.field4536] = var155;
                class242.field3228[class332.field4536] = var154;
                class314.field4230[class332.field4536] = var156;
                class332.field4536++;
            }
            class424.field5812 = class383.field5246;
            boolean var158 = false;
            int var159 = class332.field4536;
            while (var159 > 0) {
                boolean var160 = true;
                var159--;
                for (int var161 = 0; var161 < var159; var161++) {
                    if (class379.field5156[var161] != class388.field5290 && class379.field5156[var161 + 1] == class388.field5290 || class379.field5156[var161] == 0 && class379.field5156[var161 + 1] != 0) {
                        int var162 = class379.field5156[var161];
                        class379.field5156[var161] = class379.field5156[var161 + 1];
                        class379.field5156[var161 + 1] = var162;
                        String var163 = class302.field4060[var161];
                        class302.field4060[var161] = class302.field4060[var161 + 1];
                        class302.field4060[var161 + 1] = var163;
                        String var164 = class107.field1275[var161];
                        class107.field1275[var161] = class107.field1275[var161 + 1];
                        class107.field1275[var161 + 1] = var164;
                        String var165 = class300.field4007[var161];
                        class300.field4007[var161] = class300.field4007[var161 + 1];
                        class300.field4007[var161 + 1] = var165;
                        int var166 = class242.field3228[var161];
                        class242.field3228[var161] = class242.field3228[var161 + 1];
                        class242.field3228[var161 + 1] = var166;
                        boolean var167 = class314.field4230[var161];
                        class314.field4230[var161] = class314.field4230[var161 + 1];
                        var160 = false;
                        class314.field4230[var161 + 1] = var167;
                    }
                }
                if (var160) {
                    break;
                }
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 191) {
            int var168 = class215.field2658.method1570((byte) 86);
            int var169 = class215.field2658.method1585((byte) -128);
            int var170 = class215.field2658.method1587((byte) -102);
            int var171 = class215.field2658.method1569(true);
            if (var171 == 65535) {
                var171 = -1;
            }
            if (class388.method2412(-79, var170)) {
                class394.method2443(var168, var169, arg0 + 165, var171);
                class59 var172 = class131.method843((byte) 5, var171);
                class304.method1933(var172.field714, var168, 8, var172.field726, var172.field742);
                class112.method657(var172.field729, var172.field674, var168, 10, var172.field701);
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 107) {
            int var173 = class215.field2658.method1563(-128);
            boolean var174 = (var173 & 0x1) == 1;
            String var175 = class215.field2658.method1565(-97);
            String var176 = class215.field2658.method1565(-85);
            if (var176.equals("")) {
                var176 = var175;
            }
            String var177 = class215.field2658.method1565(-83);
            String var178 = class215.field2658.method1565(-97);
            if (var178.equals("")) {
                var178 = var177;
            }
            if (var174) {
                for (int var179 = 0; var179 < class368.field5019; var179++) {
                    if (class453.field6480[var179].equals(var178)) {
                        class319.field4290[var179] = var175;
                        class453.field6480[var179] = var176;
                        class89.field1026[var179] = var177;
                        class195.field2322[var179] = var178;
                        break;
                    }
                }
            } else {
                class319.field4290[class368.field5019] = var175;
                class453.field6480[class368.field5019] = var176;
                class89.field1026[class368.field5019] = var177;
                class195.field2322[class368.field5019] = var178;
                class361.field4893[class368.field5019] = class191.method1183(var173, 2) == 2;
                class368.field5019++;
            }
            class424.field5812 = class383.field5246;
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 6) {
            int var180 = class215.field2658.method1549(48);
            int var181 = class215.field2658.method1551(99);
            int var182 = class215.field2658.method1569(true);
            int var183 = class215.field2658.method1578(125);
            if (class388.method2412(-76, var182)) {
                class304.method1935((byte) -73, var180, (var183 << 16) + var181);
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 197) {
            int var184 = class215.field2658.method1578(-105);
            int var185 = class215.field2658.method1578(115);
            int var186 = class215.field2658.method1576((byte) 125);
            int var187 = class215.field2658.method1570((byte) -41);
            if (class388.method2412(arg0 ^ 0x3F, var185)) {
                class116.method678(var184, -38, 5, var186, var187);
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 201) {
            int var188 = class215.field2658.method1549(48);
            int var189 = class215.field2658.method1587((byte) -102);
            int var190 = class215.field2658.method1569(true);
            if (var190 == 65535) {
                var190 = -1;
            }
            if (class388.method2412(-56, var189)) {
                class116.method678(var190, -110, 1, var188, -1);
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 106) {
            int var191 = class215.field2658.method1587((byte) -102);
            int var192 = class215.field2658.method1576((byte) 126);
            if (class388.method2412(-96, var191)) {
                class244 var193 = (class244) class282.field3678.method2218(1, (long) var192);
                if (var193 != null) {
                    class277.method1741(true, false, var193, 1);
                }
                if (class40.field485 != null) {
                    class303.method1923(class40.field485, 10240);
                    class40.field485 = null;
                }
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 112) {
            int var194 = class215.field2658.method1578(-119);
            int var195 = class215.field2658.method1585((byte) -128);
            int var196 = class215.field2658.method1587((byte) -102);
            if (class388.method2412(-54, var196)) {
                class423.method2592(var195, var194, true);
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 185) {
            class240.field3159 = class215.field2658.method1572(-3);
            class283.field3706 = class215.field2658.method1563(arg0 ^ 0x1F);
            while (class215.field2658.field3211 < class134.field1533) {
                class269.field3478 = class215.field2658.method1563(-128);
                class35.method223(2);
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 40) {
            int var197 = class215.field2658.method1587((byte) -102);
            int var198 = class215.field2658.method1587((byte) -102);
            int var199 = class215.field2658.method1587((byte) -102);
            int var200 = class215.field2658.method1587((byte) -102);
            if (class388.method2412(-92, var197) && class362.field4903[var198] != null) {
                for (int var201 = var199; var201 < var200; var201++) {
                    int var202 = class215.field2658.method1545(8);
                    if (var201 < class362.field4903[var198].length && class362.field4903[var198][var201] != null) {
                        class362.field4903[var198][var201].field6399 = var202;
                    }
                }
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 195) {
            class204.field2468 = class215.field2658.method1563(-128);
            class369.field5029 = class215.field2658.method1563(-128);
            class181.field2114 = class215.field2658.method1563(-128);
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 252) {
            class140.method899(class215.field2658, class134.field1533, class401.field5525, -32716);
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 166) {
            class335.method2151(arg0 ^ 0xFFFFFFE7);
            class269.field3478 = -1;
            return false;
        } else if (class269.field3478 == 233) {
            if (class366.field4983 != -1) {
                class430.method2623(class366.field4983, true, 0);
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 96) {
            String var203 = class215.field2658.method1565(-49);
            String var204 = class50.method279((byte) 5, class68.method395(class1.method1(0, class215.field2658), 29766));
            class330.method2124(var203, false, var203, 6, 0, var204);
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 253) {
            int var205 = class215.field2658.method1569(true);
            if (var205 == 65535) {
                var205 = -1;
            }
            int var206 = class215.field2658.method1569(true);
            if (var206 == 65535) {
                var206 = -1;
            }
            int var207 = class215.field2658.method1587((byte) -102);
            int var208 = class215.field2658.method1570((byte) -99);
            int var209 = class215.field2658.method1587((byte) -102);
            if (class388.method2412(-112, var209)) {
                for (int var210 = var206; var210 <= var205; var210++) {
                    long var211 = ((long) var208 << 32) + ((long) var210);
                    class357 var213 = (class357) class368.field5013.method2218(1, var211);
                    class357 var214;
                    if (var213 != null) {
                        var214 = new class357(var213.field4847, var207);
                        var213.method263(false);
                    } else if (var210 == -1) {
                        var214 = new class357(class195.method1212(var208, (byte) 49).field6337.field4847, var207);
                    } else {
                        var214 = new class357(0, var207);
                    }
                    class368.field5013.method2227(var214, arg0 ^ 0x2079, var211);
                }
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 153) {
            int var215 = class215.field2658.method1587((byte) -102);
            int var216 = class215.field2658.method1563(-128);
            int var217 = class215.field2658.method1563(arg0 - 31);
            int var218 = class215.field2658.method1587((byte) -102);
            int var219 = class215.field2658.method1563(arg0 - 31);
            int var220 = class215.field2658.method1563(-128);
            if (class388.method2412(-61, var215)) {
                class423.method2595(var220, var219, var216, var217, var218, arg0 ^ 0xFFFFFF9D, true);
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 141) {
            boolean var221 = class215.field2658.method1563(-128) == 1;
            String var222 = class215.field2658.method1565(-119);
            String var223 = var222;
            if (var221) {
                var223 = class215.field2658.method1565(-61);
            }
            long var224 = (long) class215.field2658.method1587((byte) -102);
            long var226 = (long) class215.field2658.method1545(arg0 ^ 0xFFFFFF97);
            int var228 = class215.field2658.method1563(-128);
            long var229 = (var224 << 32) + var226;
            boolean var231 = false;
            int var232 = 0;
            while (true) {
                if (var232 >= 100) {
                    if (var228 <= 1) {
                        if (!(!class374.field5070 || class265.field3419) || class352.field4788) {
                            var231 = true;
                        } else if (class430.method2622(var223, arg0 ^ 0xFFFFFF9B)) {
                            var231 = true;
                        }
                    }
                    break;
                }
                if (class8.field65[var232] == var229) {
                    var231 = true;
                    break;
                }
                var232++;
            }
            if (!var231 && class229.field2909 == 0) {
                class8.field65[class392.field5341] = var229;
                class392.field5341 = (class392.field5341 + 1) % 100;
                String var233 = class50.method279((byte) 5, class68.method395(class1.method1(0, class215.field2658), arg0 ^ 0xFFFF8BD9));
                if (var228 == 2) {
                    class175.method1099(-1, var233, (String) null, "<img=1>" + var223, 7, "<img=1>" + var222, 0, (byte) 20);
                } else if (var228 == 1) {
                    class175.method1099(-1, var233, (String) null, "<img=0>" + var223, 7, "<img=0>" + var222, 0, (byte) 20);
                } else {
                    class175.method1099(-1, var233, (String) null, var223, 3, var222, 0, (byte) 20);
                }
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 36) {
            int var234 = class215.field2658.method1563(-128);
            int var235 = class215.field2658.method1569(true);
            if (var235 == 65535) {
                var235 = -1;
            }
            class197.method1218(arg0 ^ 0xFFFF8C04, var235, var234);
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 205) {
            int var236 = class215.field2658.method1567(true);
            int var237 = class215.field2658.method1551(arg0 ^ 0xFFFFFFD9);
            if (var237 == 65535) {
                var237 = -1;
            }
            int var238 = class215.field2658.method1557(-21004);
            class386.method2401(var238, var237, var236, -1);
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 190) {
            class240.field3159 = class215.field2658.method1572(-3);
            class283.field3706 = class215.field2658.method1563(arg0 ^ 0x1F);
            for (class14 var239 = (class14) class76.field939.method2222(0); var239 != null; var239 = (class14) class76.field939.method2215(false)) {
                int var241 = (int) (var239.field505 & 0x3FFFL);
                int var242 = (int) (var239.field505 >> 14 & 0x3FFFL);
                int var243 = (int) (var239.field505 >> 28 & 0x3L);
                if (class43.field513 == var243 && class240.field3159 <= var241 && var241 < (class240.field3159 + 8) && var242 >= class283.field3706 && (class283.field3706 + 8) > var242) {
                    var239.method263(false);
                    class405.method2523(class43.field513, var241, var242, (byte) -27);
                }
            }
            for (class186 var240 = (class186) class432.field5895.method1690((byte) -109); var240 != null; var240 = (class186) class432.field5895.method1699((byte) 40)) {
                if (var240.field2150 >= class240.field3159 && var240.field2150 < (class240.field3159 + 8) && class283.field3706 <= var240.field2157 && var240.field2157 < class283.field3706 + 8 && class43.field513 == var240.field2156) {
                    var240.field2152 = 0;
                }
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 50) {
            int var244 = class215.field2658.method1569(true);
            int var245 = class215.field2658.method1578(arg0 ^ 0xFFFFFFE0);
            int var246 = class215.field2658.method1585((byte) -128);
            if (class388.method2412(-125, var244)) {
                class49.method273(var245, (byte) -53, var246);
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 32) {
            int var247 = class215.field2658.method1551(arg0 + 190);
            int var248 = class215.field2658.method1569(true);
            int var249 = class215.field2658.method1549(48);
            int var250 = class215.field2658.method1587((byte) -102);
            int var251 = class215.field2658.method1578(109);
            if (class388.method2412(-125, var251)) {
                class304.method1933(var250, var249, 8, var248, var247);
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 77) {
            int var252 = class215.field2658.method1587((byte) -102);
            String var253 = class215.field2658.method1565(-120);
            Object[] var254 = new Object[var253.length() + 1];
            for (int var255 = var253.length() - 1; var255 >= 0; var255--) {
                if (var253.charAt(var255) == 's') {
                    var254[var255 + 1] = class215.field2658.method1565(-80);
                } else {
                    var254[var255 + 1] = Integer.valueOf(class215.field2658.method1576((byte) 127));
                }
            }
            var254[0] = Integer.valueOf(class215.field2658.method1576((byte) 121));
            if (class388.method2412(-118, var252)) {
                class221 var256 = new class221();
                var256.field2735 = var254;
                class93.method578(var256);
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 8) {
            int var257 = class215.field2658.method1578(123);
            int var258 = class215.field2658.method1569(true);
            int var259 = class215.field2658.method1578(33);
            if (class388.method2412(-111, var258)) {
                class301.method1913(0, var259, var257, -110);
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 210) {
            class157.method1004(true);
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 143) {
            int var260 = class215.field2658.method1578(118);
            int var261 = class215.field2658.method1576((byte) 127);
            class153.method986(0, var261, var260);
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 33) {
            int var262 = class215.field2658.method1563(-128);
            if (class215.field2658.method1563(-128) == 0) {
                class275.field3558[var262] = new class336();
            } else {
                class215.field2658.field3211--;
                class275.field3558[var262] = new class336(class215.field2658);
            }
            class269.field3478 = -1;
            class191.field2252 = class383.field5246;
            return true;
        } else if (class269.field3478 == 90) {
            int var263 = class215.field2658.method1587((byte) -102);
            int var264 = class215.field2658.method1563(arg0 - 31);
            int var265 = class215.field2658.method1563(-128);
            int var266 = class215.field2658.method1587((byte) -102);
            int var267 = class215.field2658.method1563(-128);
            int var268 = class215.field2658.method1563(-128);
            if (class388.method2412(arg0 ^ 0x2, var263)) {
                class424.method2600(var265, -1025, var267, var264, var266, var268);
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 14) {
            boolean var269 = class215.field2658.method1563(arg0 - 31) == 1;
            String var270 = class215.field2658.method1565(-89);
            String var271 = var270;
            if (var269) {
                var271 = class215.field2658.method1565(-51);
            }
            long var272 = (long) class215.field2658.method1587((byte) -102);
            long var274 = (long) class215.field2658.method1545(8);
            int var276 = class215.field2658.method1563(-128);
            int var277 = class215.field2658.method1587((byte) -102);
            long var278 = (var272 << 32) + var274;
            boolean var280 = false;
            int var281 = 0;
            while (true) {
                if (var281 >= 100) {
                    if (var276 <= 1 && class430.method2622(var271, 4)) {
                        var280 = true;
                    }
                    break;
                }
                if (class8.field65[var281] == var278) {
                    var280 = true;
                    break;
                }
                var281++;
            }
            if (!var280 && class229.field2909 == 0) {
                class8.field65[class392.field5341] = var278;
                class392.field5341 = (class392.field5341 + 1) % 100;
                String var282 = class31.method207(var277, 1).method567(class215.field2658, true);
                if (var276 == 2) {
                    class175.method1099(var277, var282, (String) null, "<img=1>" + var271, 18, "<img=1>" + var270, 0, (byte) 20);
                } else if (var276 == 1) {
                    class175.method1099(var277, var282, (String) null, "<img=0>" + var271, 18, "<img=0>" + var270, 0, (byte) 20);
                } else {
                    class175.method1099(var277, var282, (String) null, var271, 18, var270, 0, (byte) 20);
                }
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 216) {
            int var283 = class215.field2658.method1587((byte) -102);
            if (class388.method2412(-65, var283)) {
                class250.method1625(53);
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 9) {
            int var284 = class215.field2658.method1587((byte) -102);
            int var285 = class215.field2658.method1549(48);
            int var286 = class215.field2658.method1578(arg0 ^ 0xFFFFFFE9);
            int var287 = class215.field2658.method1578(110);
            if ((var285 >> 30) != 0) {
                int var312 = var285 >> 28 & 0x3;
                int var313 = (var285 >> 14 & 0x3FFF) - class278.field3608;
                int var314 = (var285 & 0x3FFF) - class129.field1432;
                if (var313 >= 0 && var314 >= 0 && class22.field232 > var313 && var314 < class196.field2329) {
                    int var315 = var313 * 128 + 64;
                    int var316 = var314 * 128 + 64;
                    class302 var317 = new class302(var286, 0, class106.field1273, var312, var315, class189.method1170(var316, var315, true, var312) - var284, var316, var313, var313, var314, var314);
                    class201.field2368.method1696(false, new class433(var317));
                }
            } else if ((var285 >> 29) != 0) {
                int var288 = var285 & 0xFFFF;
                class298 var289 = class220.field2726[var288];
                if (var289 != null) {
                    if (var286 == 65535) {
                        var286 = -1;
                    }
                    boolean var290 = true;
                    if (var286 != -1 && var289.field2467 != -1) {
                        if (var289.field2467 == var286) {
                            class167 var291 = class179.method1124((byte) -42, var286);
                            if (var291.field1937 && var291.field1935 != -1) {
                                class156 var292 = class430.method2621((byte) -71, var291.field1935);
                                int var293 = var292.field1804;
                                if (var293 == 0 || var293 == 2) {
                                    var290 = false;
                                } else if (var293 == 1) {
                                    var290 = true;
                                }
                            }
                        } else {
                            class167 var294 = class179.method1124((byte) -42, var286);
                            class167 var295 = class179.method1124((byte) -42, var289.field2467);
                            if (var294.field1935 != -1 && var295.field1935 != -1) {
                                class156 var296 = class430.method2621((byte) -62, var294.field1935);
                                class156 var297 = class430.method2621((byte) -104, var295.field1935);
                                if (var297.field1827 > var296.field1827) {
                                    var290 = false;
                                }
                            }
                        }
                    }
                    if (var290) {
                        var289.field2430 = 0;
                        var289.field2467 = var286;
                        var289.field2404 = 1;
                        var289.field2417 = class106.field1273 + var287;
                        var289.field2464 = 0;
                        var289.field2416 = var284;
                        if (var289.field2417 > class106.field1273) {
                            var289.field2464 = -1;
                        }
                        if (var289.field2467 != -1 && class106.field1273 == var289.field2417) {
                            int var298 = class179.method1124((byte) -42, var289.field2467).field1935;
                            if (var298 != -1) {
                                class156 var299 = class430.method2621((byte) -125, var298);
                                if (var299 != null && var299.field1821 != null) {
                                    class325.method2038(var289.field1516, var289.field1514, false, var299, 0, (byte) -100);
                                }
                            }
                        }
                    }
                }
            } else if ((var285 >> 28) != 0) {
                int var300 = var285 & 0xFFFF;
                class131 var301;
                if (class429.field5865 == var300) {
                    var301 = class143.field1684;
                } else {
                    var301 = class212.field2584[var300];
                }
                if (var301 != null) {
                    if (var286 == 65535) {
                        var286 = -1;
                    }
                    boolean var302 = true;
                    if (var286 != -1 && var301.field2467 != -1) {
                        if (var301.field2467 == var286) {
                            class167 var307 = class179.method1124((byte) -42, var286);
                            if (var307.field1937 && var307.field1935 != -1) {
                                class156 var308 = class430.method2621((byte) -73, var307.field1935);
                                int var309 = var308.field1804;
                                if (var309 == 0 || var309 == 2) {
                                    var302 = false;
                                } else if (var309 == 1) {
                                    var302 = true;
                                }
                            }
                        } else {
                            class167 var303 = class179.method1124((byte) -42, var286);
                            class167 var304 = class179.method1124((byte) -42, var301.field2467);
                            if (var303.field1935 != -1 && var304.field1935 != -1) {
                                class156 var305 = class430.method2621((byte) -28, var303.field1935);
                                class156 var306 = class430.method2621((byte) -50, var304.field1935);
                                if (var306.field1827 > var305.field1827) {
                                    var302 = false;
                                }
                            }
                        }
                    }
                    if (var302) {
                        var301.field2467 = var286;
                        var301.field2404 = 1;
                        var301.field2430 = 0;
                        var301.field2464 = 0;
                        var301.field2416 = var284;
                        var301.field2417 = class106.field1273 + var287;
                        if (var301.field2467 == 65535) {
                            var301.field2467 = -1;
                        }
                        if (var301.field2417 > class106.field1273) {
                            var301.field2464 = -1;
                        }
                        if (var301.field2467 != -1 && class106.field1273 == var301.field2417) {
                            int var310 = class179.method1124((byte) -42, var301.field2467).field1935;
                            if (var310 != -1) {
                                class156 var311 = class430.method2621((byte) -44, var310);
                                if (var311 != null && var311.field1821 != null) {
                                    class325.method2038(var301.field1516, var301.field1514, class143.field1684 == var301, var311, 0, (byte) -100);
                                }
                            }
                        }
                    }
                }
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 113) {
            if (class134.field1533 == 0) {
                class217.field2662 = class113.field1321.method434(class373.field5057, -8192);
            } else {
                class217.field2662 = class215.field2658.method1565(-113);
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 55) {
            class180.method1126(true, -127);
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 131) {
            int var318 = class215.field2658.method1587((byte) -102);
            int var319 = class215.field2658.method1549(48);
            int var320 = class215.field2658.method1569(true);
            if (var320 == 65535) {
                var320 = -1;
            }
            if (class388.method2412(-13, var318)) {
                class238.method1523(arg0 ^ 0xD, var320, var319);
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 56) {
            class393.field5361 = class215.field2658.method1582(false);
            class269.field3478 = -1;
            class364.field4955 = class383.field5246;
            return true;
        } else if (class269.field3478 == 215) {
            int var321 = class215.field2658.method1551(58);
            int var322 = class215.field2658.method1578(arg0 ^ 0xFFFFFFED);
            if (var322 == 65535) {
                var322 = -1;
            }
            int var323 = class215.field2658.method1570((byte) -117);
            if (class388.method2412(-13, var321)) {
                class116.method678(var322, -61, 2, var323, -1);
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 102) {
            int var324 = class215.field2658.method1578(arg0 ^ 0xFFFFFFE2);
            int var325 = class215.field2658.method1567(true);
            boolean var326 = (var325 & 0x1) == 1;
            class281.method1767(var326, (byte) -79, var324);
            class126.field1412[class191.method1183(class40.field480++, 31)] = var324;
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 231) {
            int var327 = class215.field2658.method1576((byte) 126);
            int var328 = class215.field2658.method1582(false);
            int var329 = class215.field2658.method1564(true);
            int var330 = class215.field2658.method1551(96);
            if (class388.method2412(arg0 + 15, var330)) {
                class23.method142(var329, arg0 + 108, var327, var328);
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 188) {
            for (int var331 = 0; var331 < class212.field2584.length; var331++) {
                if (class212.field2584[var331] != null) {
                    class212.field2584[var331].field2400 = -1;
                }
            }
            for (int var332 = 0; var332 < class220.field2726.length; var332++) {
                if (class220.field2726[var332] != null) {
                    class220.field2726[var332].field2400 = -1;
                }
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 89) {
            String var333 = class215.field2658.method1565(arg0 ^ 0x30);
            boolean var334 = class215.field2658.method1563(-128) == 1;
            String var335;
            if (var334) {
                var335 = class215.field2658.method1565(-79);
            } else {
                var335 = var333;
            }
            int var336 = class215.field2658.method1587((byte) -102);
            byte var337 = class215.field2658.method1589(false);
            boolean var338 = false;
            if (var337 == -128) {
                var338 = true;
            }
            if (var338) {
                if (class406.field5615 == 0) {
                    class269.field3478 = -1;
                    return true;
                }
                boolean var344 = false;
                int var345;
                for (var345 = 0; var345 < class406.field5615 && (!class345.field4693[var345].field6066.equals(var335) || class345.field4693[var345].field6065 != var336); var345++) {
                }
                if (class406.field5615 > var345) {
                    while (var345 < class406.field5615 - 1) {
                        class345.field4693[var345] = class345.field4693[var345 + 1];
                        var345++;
                    }
                    class406.field5615--;
                    class345.field4693[class406.field5615] = null;
                }
            } else {
                String var339 = class215.field2658.method1565(arg0 + 43);
                class440 var340 = new class440();
                var340.field6066 = var335;
                var340.field6070 = var333;
                var340.field6069 = class405.method2524((byte) 117, var340.field6066);
                var340.field6063 = var339;
                var340.field6068 = var337;
                var340.field6065 = var336;
                int var341;
                for (var341 = class406.field5615 - 1; var341 >= 0; var341--) {
                    int var342 = class345.field4693[var341].field6069.compareTo(var340.field6069);
                    if (var342 == 0) {
                        class345.field4693[var341].field6065 = var336;
                        class345.field4693[var341].field6068 = var337;
                        class345.field4693[var341].field6063 = var339;
                        if (var335.equals(class143.field1684.field1480)) {
                            class20.field217 = var337;
                        }
                        class269.field3478 = -1;
                        class42.field503 = class383.field5246;
                        return true;
                    }
                    if (var342 < 0) {
                        break;
                    }
                }
                if (class345.field4693.length <= class406.field5615) {
                    class269.field3478 = -1;
                    return true;
                }
                for (int var343 = class406.field5615 - 1; var343 > var341; var343--) {
                    class345.field4693[var343 + 1] = class345.field4693[var343];
                }
                if (class406.field5615 == 0) {
                    class345.field4693 = new class440[100];
                }
                class345.field4693[var341 + 1] = var340;
                class406.field5615++;
                if (var335.equals(class143.field1684.field1480)) {
                    class20.field217 = var337;
                }
            }
            class42.field503 = class383.field5246;
            class269.field3478 = -1;
            return true;
        } else if (arg0 != -97) {
            return true;
        } else if (class269.field3478 == 157) {
            int var346 = class215.field2658.method1578(113);
            int var347 = class215.field2658.method1587((byte) -102);
            int var348 = class215.field2658.method1563(arg0 ^ 0x1F);
            if (class388.method2412(-41, var347)) {
                if (var348 == 2) {
                    class391.method2430((byte) -88);
                }
                class366.field4983 = var346;
                class173.method1088(0, var346);
                class18.method106(false, (byte) 67);
                class93.method582(class366.field4983);
                for (int var349 = 0; var349 < 100; var349++) {
                    class65.field786[var349] = true;
                }
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 95) {
            String var350 = class215.field2658.method1565(arg0 + 47);
            int var351 = class215.field2658.method1551(110);
            int var352 = class215.field2658.method1570((byte) 106);
            if (class388.method2412(-87, var351)) {
                class150.method966(13503, var352, var350);
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 139) {
            int var353 = class215.field2658.method1585((byte) -128);
            int var354 = class215.field2658.method1551(98);
            if (class388.method2412(arg0 ^ 0x7D, var354)) {
                class116.method678(-1, arg0 ^ 0x78, 3, var353, -1);
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 103) {
            class283.field3706 = class215.field2658.method1572(-3);
            class240.field3159 = class215.field2658.method1572(-3);
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 167) {
            class369.method2325(arg0 ^ 0xF123515C);
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 39) {
            for (int var355 = 0; var355 < class56.field649.length; var355++) {
                if (class56.field649[var355] != class104.field1231[var355]) {
                    class56.field649[var355] = class104.field1231[var355];
                    class266.method1665(true, var355);
                    class204.field2469[class191.method1183(31, class283.field3709++)] = var355;
                }
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 200) {
            int var356 = class215.field2658.method1563(-128);
            int var357 = class215.field2658.method1563(arg0 ^ 0x1F);
            if (var356 == 255) {
                var356 = -1;
                var357 = -1;
            }
            class434.method2644(var357, var356, -23764);
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 183) {
            int var358 = class215.field2658.method1578(111);
            int var359 = class215.field2658.method1578(arg0 + 206);
            int var360 = class215.field2658.method1570((byte) 116);
            int var361 = class215.field2658.method1578(111);
            int var362 = class215.field2658.method1578(110);
            if (class388.method2412(arg0 + 46, var358)) {
                class116.method678(var361 | var359 << 16, -85, 7, var360, var362);
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 150) {
            int var363 = class215.field2658.method1551(103);
            int var364 = class215.field2658.method1585((byte) -128);
            int var365 = class215.field2658.method1549(48);
            if (class388.method2412(arg0 - 26, var363)) {
                class244 var366 = (class244) class282.field3678.method2218(arg0 ^ 0xFFFFFF9E, (long) var365);
                class244 var367 = (class244) class282.field3678.method2218(1, (long) var364);
                if (var367 != null) {
                    class277.method1741(var366 == null || var366.field3245 != var367.field3245, false, var367, 1);
                }
                if (var366 != null) {
                    var366.method263(false);
                    class282.field3678.method2227(var366, -8218, (long) var364);
                }
                class453 var368 = class195.method1212(var365, (byte) 49);
                if (var368 != null) {
                    class303.method1923(var368, 10240);
                }
                class453 var369 = class195.method1212(var364, (byte) 49);
                if (var369 != null) {
                    class303.method1923(var369, arg0 + 10337);
                    class306.method1942(true, -1, var369);
                }
                if (class366.field4983 != -1) {
                    class430.method2623(class366.field4983, true, 1);
                }
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 224) {
            class368.field5019 = class215.field2658.method1563(-128);
            for (int var370 = 0; var370 < class368.field5019; var370++) {
                class319.field4290[var370] = class215.field2658.method1565(class262.method1658(arg0, 11));
                class453.field6480[var370] = class215.field2658.method1565(-98);
                if (class453.field6480[var370].equals("")) {
                    class453.field6480[var370] = class319.field4290[var370];
                }
                class89.field1026[var370] = class215.field2658.method1565(-97);
                class195.field2322[var370] = class215.field2658.method1565(-51);
                if (class195.field2322[var370].equals("")) {
                    class195.field2322[var370] = class89.field1026[var370];
                }
                class361.field4893[var370] = false;
            }
            class424.field5812 = class383.field5246;
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 82) {
            int var371 = class215.field2658.method1587((byte) -102);
            if (var371 == 65535) {
                var371 = -1;
            }
            int var372 = class215.field2658.method1563(arg0 ^ 0x1F);
            int var373 = class215.field2658.method1587((byte) -102);
            int var374 = class215.field2658.method1563(-128);
            class390.method2424(var372, var371, var374, var373, -1);
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 238) {
            int var375 = class215.field2658.method1551(105);
            int var376 = class215.field2658.method1587((byte) -102);
            int var377 = class215.field2658.method1572(arg0 + 94);
            class298 var378 = class220.field2726[var376];
            if (var378 != null) {
                class402.method2512(var375, (byte) -118, var377, var378);
            }
            class269.field3478 = -1;
            return true;
        } else if (class269.field3478 == 174) {
            class133.method868(true, class215.field2658.method1565(arg0 ^ 0x7));
            class269.field3478 = -1;
            return true;
        } else {
            class402.method2510("T1 - " + class269.field3478 + "," + class382.field5234 + "," + class106.field1260 + " - " + class134.field1533, (Throwable) null, -29832);
            class335.method2151(arg0 ^ 0xFFFFFFD5);
            return true;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIILjava/lang/Class;)Lfe;", line = 2779)
    public static final class133 method1610(int arg0, int arg1, int arg2, Class arg3) {
        class316 var4 = class347.field4722[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class272 var5 = var4.field4256; var5 != null; var5 = var5.field3514) {
            class133 var6 = var5.field3512;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field1512 == arg1 && var6.field1518 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BI)I", line = 2804)
    public static final int method1611(byte arg0, int arg1) {
        field3256++;
        int var2 = -104 % ((13 - arg0) / 37);
        int var3 = arg1 >>> 1;
        int var4 = var3 | var3 >>> 1;
        int var5 = var4 | var4 >>> 2;
        int var6 = var5 | var5 >>> 4;
        int var7 = var6 | var6 >>> 8;
        int var8 = var7 | var7 >>> 16;
        return arg1 & ~var8;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(JZLuo;)V", line = 2822)
    public static final void method1612(long arg0, boolean arg1, class118 arg2) {
        class28.field318 = 0;
        if (!arg1) {
            method1612(-78L, false, (class118) null);
        }
        class269.field3470 = class285.field3726;
        field3254++;
        class285.field3726 = 0;
        long var4 = class164.method1038(8635);
        for (class69 var6 = (class69) class220.field2722.method1838(-6325); var6 != null; var6 = (class69) class220.field2722.method1834((byte) 120)) {
            if (var6.method401(arg2, arg0)) {
                class28.field318++;
            }
        }
        if (class22.field235 && (arg0 % 100L) == 0L) {
            System.out.println("Particle system count: " + class220.field2722.method1842((byte) 99) + ", running: " + class28.field318 + ". Particles: " + class285.field3726 + ". Time taken: " + (class164.method1038(8635) - var4) + "ms");
        }
    }
}
