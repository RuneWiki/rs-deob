import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class217 extends class88 {

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "[Ljd;")
    public class85[] field3933 = new class85[5];

    @OriginalMember(owner = "client!rg", name = "N", descriptor = "[I")
    public int[] field3941 = new int[5];

    @OriginalMember(owner = "client!rg", name = "U", descriptor = "I")
    public int field3948 = 0;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
    public int field3931;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "I")
    public int field3927;

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "I")
    public int field3929;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
    public int field3930;

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "Lhj;")
    public static class69 field3921 = class181.method1318(" <col=ffffff>", (byte) -106);

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
    public static int field3920 = -1;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "I")
    public int field3934;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
    public int field3936;

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "I")
    public int field3937;

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
    public int field3940;

    @OriginalMember(owner = "client!rg", name = "T", descriptor = "I")
    public int field3947;

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "Lfc;")
    public class118 field3932;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "Lpa;")
    public class204 field3935;

    @OriginalMember(owner = "client!rg", name = "S", descriptor = "Lre;")
    public class212 field3946;

    @OriginalMember(owner = "client!rg", name = "Q", descriptor = "Lrg;")
    public class217 field3944;

    @OriginalMember(owner = "client!rg", name = "O", descriptor = "Lrf;")
    public class267 field3942;

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "Ldf;")
    public class53 field3938;

    @OriginalMember(owner = "client!rg", name = "V", descriptor = "Lge;")
    public class68 field3949;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "Z")
    public boolean field3928;

    @OriginalMember(owner = "client!rg", name = "P", descriptor = "Z")
    public boolean field3943;

    @OriginalMember(owner = "client!rg", name = "R", descriptor = "Z")
    public boolean field3945;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)Z")
    public static final boolean method1553(byte arg0) throws IOException {
        field3922++;
        if (class135.field2532 == null) {
            return false;
        }
        int var1 = class135.field2532.method1269((byte) -85);
        if (var1 == 0) {
            return false;
        }
        if (class13.field190 == -1) {
            class135.field2532.method1265(class199.field3595.field2385, -54, 0, 1);
            class199.field3595.field2379 = 0;
            class13.field190 = class199.field3595.method299(-927408541);
            class33.field451 = class163.field3010[class13.field190];
            var1--;
        }
        if (class33.field451 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class135.field2532.method1265(class199.field3595.field2385, -87, 0, 1);
            var1--;
            class33.field451 = class199.field3595.field2385[0] & 0xFF;
        }
        if (class33.field451 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class135.field2532.method1265(class199.field3595.field2385, -76, 0, 2);
            class199.field3595.field2379 = 0;
            class33.field451 = class199.field3595.method912(41);
        }
        if (var1 < class33.field451) {
            return false;
        }
        class199.field3595.field2379 = 0;
        class135.field2532.method1265(class199.field3595.field2385, -75, 0, class33.field451);
        class163.field3016 = class170.field3118;
        class230.field4213 = 0;
        class170.field3118 = class157.field2930;
        class157.field2930 = class13.field190;
        if (class13.field190 == 8) {
            class179.method1307(class199.field3595, class33.field451, true, class36.field508);
            class13.field190 = -1;
            return true;
        } else if (class13.field190 == 34) {
            int var2 = class199.field3595.method937(false);
            int var3 = class199.field3595.method937(false);
            int var4 = class199.field3595.method912(-110);
            int var5 = class199.field3595.method937(false);
            int var6 = class199.field3595.method937(false);
            class229.method1635(var2, var5, (byte) -9, var3, var4, var6);
            class13.field190 = -1;
            return true;
        } else if (class13.field190 == 232) {
            class20.method115(-5);
            class13.field190 = -1;
            return false;
        } else if (class13.field190 == 179) {
            int var7 = class199.field3595.method961(-268435456);
            int var8 = class199.field3595.method962((byte) 125);
            class207.field3775 = var7;
            client.field2812 = var8;
            class126.method900(false);
            class13.field190 = -1;
            return true;
        } else if (class13.field190 == 15) {
            long var9 = class199.field3595.method909(false);
            long var11 = (long) class199.field3595.method912(-96);
            long var13 = (long) class199.field3595.method952((byte) -99);
            boolean var15 = false;
            long var16 = (var11 << 32) + var13;
            int var18 = class199.field3595.method937(false);
            int var19 = class199.field3595.method912(80);
            int var20 = 0;
            label1055: while (true) {
                if (var20 >= 100) {
                    if (var18 <= 1) {
                        for (int var21 = 0; var21 < class149.field2778; var21++) {
                            if (class159.field2959[var21] == var9) {
                                var15 = true;
                                break label1055;
                            }
                        }
                    }
                    break;
                }
                if (class271.field4799[var20] == var16) {
                    var15 = true;
                    break;
                }
                var20++;
            }
            if (!var15 && class105.field1993 == 0) {
                class271.field4799[class54.field969] = var16;
                class54.field969 = (class54.field969 + 1) % 100;
                class69 var22 = class80.method568(var19, -40).method1430(class199.field3595, (byte) 35);
                if (var18 == 2) {
                    class70.method498(var19, class9.method42(61, new class69[] { class24.field351, class101.method749(var9, 25801).method452(122) }), var22, (class69) null, -1, 18);
                } else if (var18 == 1) {
                    class70.method498(var19, class9.method42(96, new class69[] { class168.field3093, class101.method749(var9, 25801).method452(122) }), var22, (class69) null, -1, 18);
                } else {
                    class70.method498(var19, class101.method749(var9, 25801).method452(122), var22, (class69) null, -1, 18);
                }
            }
            class13.field190 = -1;
            return true;
        } else if (class13.field190 == 83) {
            class181.method1323((byte) -50, class199.field3595);
            class13.field190 = -1;
            return true;
        } else if (class13.field190 == 221) {
            int var23 = class199.field3595.method926((byte) -125);
            int var24 = class199.field3595.method961(-268435456);
            int var25 = class199.field3595.method930((byte) 52);
            if (class54.method316(var24, -3853)) {
                if (var23 == 2) {
                    class116.method855(-3658);
                }
                class35.field483 = var25;
                class254.method1766((byte) -116, var25);
                class40.method223(false, 0);
                class45.method257((byte) 102, class35.field483);
                for (int var26 = 0; var26 < 100; var26++) {
                    class40.field576[var26] = true;
                }
            }
            class13.field190 = -1;
            return true;
        } else if (class13.field190 == 73) {
            int var27 = class199.field3595.method923(true);
            int var28 = class199.field3595.method912(103);
            if (var27 < -70000) {
                var28 += 32768;
            }
            class50 var29;
            if (var27 >= 0) {
                var29 = client.method1144((byte) -9, var27);
            } else {
                var29 = null;
            }
            if (var29 != null) {
                for (int var30 = 0; var30 < var29.field851.length; var30++) {
                    var29.field851[var30] = 0;
                    var29.field790[var30] = 0;
                }
            }
            class253.method1762((byte) 28, var28);
            int var31 = class199.field3595.method912(-79);
            for (int var32 = 0; var32 < var31; var32++) {
                int var33 = class199.field3595.method930((byte) 52);
                int var34 = class199.field3595.method946(false);
                if (var34 == 255) {
                    var34 = class199.field3595.method923(true);
                }
                if (var29 != null && var32 < var29.field851.length) {
                    var29.field851[var32] = var33;
                    var29.field790[var32] = var34;
                }
                class164.method1218((byte) -45, var28, var34, var32, var33 - 1);
            }
            if (var29 != null) {
                class204.method1478(var29, false);
            }
            class237.method1672(true);
            class246.field4499[class69.method443(31, class165.field3042++)] = class69.method443(var28, 32767);
            class13.field190 = -1;
            return true;
        } else if (class13.field190 == 5) {
            int var35 = class199.field3595.method940(false);
            class69 var36 = class199.field3595.method963(false);
            int var37 = class199.field3595.method912(108);
            if (class54.method316(var37, -3853)) {
                class211.method1523(var36, 1, var35);
            }
            class13.field190 = -1;
            return true;
        } else if (class13.field190 == 71) {
            int var38 = class199.field3595.method951(-82);
            int var39 = class199.field3595.method953(2);
            int var40 = class199.field3595.method947(-23188);
            int var41 = class199.field3595.method961(-268435456);
            if (class54.method316(var41, -3853)) {
                class180.method1311(var40, var39, var38, true);
            }
            class13.field190 = -1;
            return true;
        } else if (class13.field190 == 208) {
            int var42 = class199.field3595.method951(109);
            int var43 = class199.field3595.method961(-268435456);
            if (class54.method316(var43, -3853)) {
                int var44 = 0;
                if (class156.field2904.field2036 != null) {
                    var44 = class156.field2904.field2036.method680(false);
                }
                class232.method1651(var44, var42, 3, -127);
            }
            class13.field190 = -1;
            return true;
        } else if (class13.field190 == 17) {
            if (class35.field483 != -1) {
                class215.method1548(0, class35.field483, 5);
            }
            class13.field190 = -1;
            return true;
        } else if (class13.field190 == 207) {
            class208.field3789 = class199.field3595.method912(-89) * 30;
            class13.field190 = -1;
            class33.field471 = class81.field1564;
            return true;
        } else if (class13.field190 == 237) {
            int var45 = class199.field3595.method944(false);
            class50 var46 = client.method1144((byte) -9, var45);
            for (int var47 = 0; var47 < var46.field851.length; var47++) {
                var46.field851[var47] = -1;
                var46.field851[var47] = 0;
            }
            class204.method1478(var46, false);
            class13.field190 = -1;
            return true;
        } else if (class13.field190 == 82) {
            int var48 = class199.field3595.method912(-91);
            int var49 = class199.field3595.method912(73);
            int var50 = class199.field3595.method944(false);
            if (class54.method316(var48, -3853)) {
                class140.method1077(var49, var50, -106);
            }
            class13.field190 = -1;
            return true;
        } else if (class13.field190 == 48) {
            int var51 = class199.field3595.method940(false);
            int var52 = class199.field3595.method961(-268435456);
            class4.method17(var52, 23, var51);
            class13.field190 = -1;
            return true;
        } else if (class13.field190 == 101) {
            class223.method1587((byte) -71, true);
            class13.field190 = -1;
            return true;
        } else if (class13.field190 == 206) {
            long var53 = class199.field3595.method909(false);
            class199.field3595.method950(1495791448);
            long var55 = class199.field3595.method909(false);
            long var57 = (long) class199.field3595.method912(-93);
            long var59 = (long) class199.field3595.method952((byte) -90);
            int var61 = class199.field3595.method937(false);
            boolean var62 = false;
            long var63 = (var57 << 32) + var59;
            int var65 = class199.field3595.method912(-120);
            int var66 = 0;
            label1103: while (true) {
                if (var66 >= 100) {
                    if (var61 <= 1) {
                        for (int var67 = 0; var67 < class149.field2778; var67++) {
                            if (class159.field2959[var67] == var53) {
                                var62 = true;
                                break label1103;
                            }
                        }
                    }
                    break;
                }
                if (class271.field4799[var66] == var63) {
                    var62 = true;
                    break;
                }
                var66++;
            }
            if (!var62 && class105.field1993 == 0) {
                class271.field4799[class54.field969] = var63;
                class54.field969 = (class54.field969 + 1) % 100;
                class69 var68 = class80.method568(var65, -40).method1430(class199.field3595, (byte) 35);
                if (var61 == 2 || var61 == 3) {
                    class70.method498(var65, class9.method42(102, new class69[] { class24.field351, class101.method749(var53, 25801).method452(122) }), var68, class101.method749(var55, 25801).method452(122), -1, 20);
                } else if (var61 == 1) {
                    class70.method498(var65, class9.method42(-100, new class69[] { class168.field3093, class101.method749(var53, 25801).method452(122) }), var68, class101.method749(var55, 25801).method452(122), -1, 20);
                } else {
                    class70.method498(var65, class101.method749(var53, 25801).method452(122), var68, class101.method749(var55, 25801).method452(122), -1, 20);
                }
            }
            class13.field190 = -1;
            return true;
        } else if (class13.field190 == 239) {
            class202.field3650 = class199.field3595.method937(false);
            class58.field1058 = class199.field3595.method946(false);
            class13.field190 = -1;
            return true;
        } else if (class13.field190 == 10) {
            class237.method1672(true);
            class28.field408 = class199.field3595.method955((byte) 113);
            class33.field471 = class81.field1564;
            class13.field190 = -1;
            return true;
        } else if (class13.field190 == 180) {
            int var69 = class199.field3595.method937(false);
            if (class199.field3595.method937(false) == 0) {
                class133.field2474[var69] = new class116();
            } else {
                class199.field3595.field2379--;
                class133.field2474[var69] = new class116(class199.field3595);
            }
            class13.field190 = -1;
            class177.field3219 = class81.field1564;
            return true;
        } else if (class13.field190 == 249) {
            int var70 = class199.field3595.method923(true);
            int var71 = class199.field3595.method912(51);
            if (var70 < -70000) {
                var71 += 32768;
            }
            class50 var72;
            if (var70 >= 0) {
                var72 = client.method1144((byte) -9, var70);
            } else {
                var72 = null;
            }
            while (class33.field451 > class199.field3595.field2379) {
                int var73 = 0;
                int var74 = class199.field3595.method907(-104);
                int var75 = class199.field3595.method912(106);
                if (var75 != 0) {
                    var73 = class199.field3595.method937(false);
                    if (var73 == 255) {
                        var73 = class199.field3595.method923(true);
                    }
                }
                if (var72 != null && var74 >= 0 && var72.field851.length > var74) {
                    var72.field851[var74] = var75;
                    var72.field790[var74] = var73;
                }
                class164.method1218((byte) 104, var71, var73, var74, var75 - 1);
            }
            if (var72 != null) {
                class204.method1478(var72, false);
            }
            class237.method1672(true);
            class246.field4499[class69.method443(31, class165.field3042++)] = class69.method443(32767, var71);
            class13.field190 = -1;
            return true;
        } else if (class13.field190 == 52) {
            long var76 = class199.field3595.method909(false);
            int var78 = class199.field3595.method912(80);
            class69 var79 = class80.method568(var78, -40).method1430(class199.field3595, (byte) 35);
            class70.method498(var78, class101.method749(var76, 25801).method452(122), var79, (class69) null, -1, 19);
            class13.field190 = -1;
            return true;
        } else if (class13.field190 == 81) {
            byte[] var80 = new byte[class33.field451];
            class199.field3595.method302((byte) 75, 0, class33.field451, var80);
            class69 var81 = class38.method209(123, 0, class33.field451, var80);
            if (class10.field85 == null && class165.field3035 == 2 || !class42.field604.startsWith("win") || class248.field4526) {
                class171.method1256(var81, 0, true);
            } else {
                class59.field1070 = true;
                class66.field1274 = var81;
                class23.field317 = class36.field508.method236(false, new String(var81.method469(126), "ISO-8859-1"));
            }
            class13.field190 = -1;
            return true;
        } else if (class13.field190 == 3) {
            class237.method1672(true);
            int var82 = class199.field3595.method926((byte) -88);
            int var83 = class199.field3595.method944(false);
            int var84 = class199.field3595.method946(false);
            class139.field2607[var84] = var83;
            class179.field3253[var84] = var82;
            class208.field3791[var84] = 1;
            for (int var85 = 0; var85 < 98; var85++) {
                if (class265.field4719[var85] <= var83) {
                    class208.field3791[var84] = var85 + 2;
                }
            }
            class81.field1546[class69.method443(31, class181.field3276++)] = var84;
            class13.field190 = -1;
            return true;
        } else if (class13.field190 == 214) {
            class265.field4715 = class199.field3595.method937(false);
            class13.field190 = -1;
            return true;
        } else if (class13.field190 == 151) {
            int var86 = class199.field3595.method912(-92);
            if (var86 == 65535) {
                var86 = -1;
            }
            class211.method1527(var86, -117);
            class13.field190 = -1;
            return true;
        } else if (class13.field190 == 170) {
            int var87 = class199.field3595.method956(-3);
            int var88 = class199.field3595.method961(-268435456);
            if (var88 == 65535) {
                var88 = -1;
            }
            class268.method1843(var88, var87, 110);
            class13.field190 = -1;
            return true;
        } else if (class13.field190 == 108) {
            int var89 = class199.field3595.method951(119);
            int var90 = class199.field3595.method962((byte) -79);
            int var91 = class199.field3595.method962((byte) 103);
            if (class54.method316(var90, -3853)) {
                class63.method412(var91, var89, true);
            }
            class13.field190 = -1;
            return true;
        } else if (class13.field190 == 190) {
            int var92 = class199.field3595.method944(false);
            int var93 = class199.field3595.method917(255);
            int var94 = class199.field3595.method912(122);
            int var95 = class199.field3595.method962((byte) 87);
            if (class54.method316(var94, -3853)) {
                class259 var96 = (class259) class156.field2910.method769(true, (long) var92);
                if (var96 != null) {
                    class52.method306(var96, var96.field4640 != var95, 3);
                }
                class55.method330(var93, var92, var95, -32);
            }
            class13.field190 = -1;
            return true;
        } else if (class13.field190 == 58) {
            class101.method744(71);
            class13.field190 = -1;
            return true;
        } else if (class13.field190 == 226) {
            int var97 = class199.field3595.method930((byte) 52);
            class98.method718(var97, (byte) -100);
            class246.field4499[class69.method443(class165.field3042++, 31)] = class69.method443(var97, 32767);
            class13.field190 = -1;
            return true;
        } else if (class13.field190 == 76) {
            long var98 = class199.field3595.method909(false);
            int var100 = class199.field3595.method912(-110);
            int var101 = class199.field3595.method937(false);
            boolean var102 = true;
            class69 var103 = class209.field3816;
            if (var100 > 0) {
                var103 = class199.field3595.method963(false);
            }
            if (var98 < 0L) {
                var102 = false;
                var98 &= Long.MAX_VALUE;
            }
            class69 var104 = class101.method749(var98, 25801).method452(122);
            for (int var105 = 0; var105 < class273.field4828; var105++) {
                if (class141.field2642[var105] == var98) {
                    if (class112.field2163[var105] != var100) {
                        class112.field2163[var105] = var100;
                        if (var100 > 0) {
                            class122.method881(5, class209.field3816, class9.method42(95, new class69[] { var104, class123.field2280 }), false);
                        }
                        if (var100 == 0) {
                            class122.method881(5, class209.field3816, class9.method42(-86, new class69[] { var104, class130.field2426 }), false);
                        }
                    }
                    var104 = null;
                    class62.field1202[var105] = var103;
                    class22.field307[var105] = var101;
                    class93.field1737[var105] = var102;
                    break;
                }
            }
            if (var104 != null && class273.field4828 < 200) {
                class141.field2642[class273.field4828] = var98;
                class103.field1915[class273.field4828] = var104;
                class112.field2163[class273.field4828] = var100;
                class62.field1202[class273.field4828] = var103;
                class22.field307[class273.field4828] = var101;
                class93.field1737[class273.field4828] = var102;
                class273.field4828++;
            }
            class208.field3795 = class81.field1564;
            int var106 = class273.field4828;
            boolean var107 = false;
            while (var106 > 0) {
                boolean var108 = true;
                var106--;
                for (int var109 = 0; var109 < var106; var109++) {
                    if (class112.field2163[var109] != class204.field3666 && class112.field2163[var109 + 1] == class204.field3666 || class112.field2163[var109] == 0 && class112.field2163[var109 + 1] != 0) {
                        var108 = false;
                        int var110 = class112.field2163[var109];
                        class112.field2163[var109] = class112.field2163[var109 + 1];
                        class112.field2163[var109 + 1] = var110;
                        class69 var111 = class62.field1202[var109];
                        class62.field1202[var109] = class62.field1202[var109 + 1];
                        class62.field1202[var109 + 1] = var111;
                        class69 var112 = class103.field1915[var109];
                        class103.field1915[var109] = class103.field1915[var109 + 1];
                        class103.field1915[var109 + 1] = var112;
                        long var113 = class141.field2642[var109];
                        class141.field2642[var109] = class141.field2642[var109 + 1];
                        class141.field2642[var109 + 1] = var113;
                        int var115 = class22.field307[var109];
                        class22.field307[var109] = class22.field307[var109 + 1];
                        class22.field307[var109 + 1] = var115;
                        boolean var116 = class93.field1737[var109];
                        class93.field1737[var109] = class93.field1737[var109 + 1];
                        class93.field1737[var109 + 1] = var116;
                    }
                }
                if (var108) {
                    break;
                }
            }
            class13.field190 = -1;
            return true;
        } else {
            int var117 = 109 % ((73 - arg0) / 52);
            if (class13.field190 == 104) {
                class69 var118 = class199.field3595.method963(false);
                int var119 = class199.field3595.method930((byte) 52);
                int var120 = class199.field3595.method961(-268435456);
                if (class54.method316(var119, -3853)) {
                    class34.method185(var120, (byte) 104, var118);
                }
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 31) {
                int var121 = class199.field3595.method962((byte) 78);
                int var122 = class199.field3595.method923(true);
                int var123 = class199.field3595.method961(-268435456);
                int var124 = class199.field3595.method912(-121);
                if ((var122 >> 30) != 0) {
                    int var125 = var122 >> 28 & 0x3;
                    int var126 = ((var122 & 0xFFFC569) >> 14) - class242.field4441;
                    int var127 = (var122 & 0x3FFF) - class220.field3962;
                    if (var126 >= 0 && var127 >= 0 && var126 < 104 && var127 < 104) {
                        int var128 = var126 * 128 + 64;
                        int var129 = var127 * 128 + 64;
                        class228 var130 = new class228(var124, var125, var128, var129, class156.method1179(var128, var129, 89, var125) - var121, var123, class180.field3272);
                        class262.field4668.method1727(-120, new class180(var130));
                    }
                } else if ((var122 >> 29) != 0) {
                    int var135 = var122 & 0xFFFF;
                    class38 var136 = class131.field2428[var135];
                    if (var136 != null) {
                        var136.field4027 = 0;
                        var136.field3992 = var124;
                        var136.field4035 = var121;
                        var136.field4047 = 0;
                        if (var136.field3992 == 65535) {
                            var136.field3992 = -1;
                        }
                        var136.field4020 = class180.field3272 + var123;
                        if (class180.field3272 < var136.field4020) {
                            var136.field4027 = -1;
                        }
                        if (var136.field3992 != -1 && class180.field3272 == var136.field4020) {
                            int var137 = class213.method1533(128, var136.field3992).field561;
                            if (var137 != -1) {
                                class159 var138 = class211.method1521(-83, var137);
                                if (var138 != null && var138.field2962 != null) {
                                    class248.method1748(var136.field4005, var136.field3985, var138, -79, 0, false);
                                }
                            }
                        }
                    }
                } else if ((var122 >> 28) != 0) {
                    int var131 = var122 & 0xFFFF;
                    class108 var132;
                    if (class13.field191 == var131) {
                        var132 = class156.field2904;
                    } else {
                        var132 = class35.field491[var131];
                    }
                    if (var132 != null) {
                        var132.field4047 = 0;
                        var132.field3992 = var124;
                        var132.field4035 = var121;
                        var132.field4020 = class180.field3272 + var123;
                        if (var132.field3992 == 65535) {
                            var132.field3992 = -1;
                        }
                        var132.field4027 = 0;
                        if (var132.field4020 > class180.field3272) {
                            var132.field4027 = -1;
                        }
                        if (var132.field3992 != -1 && class180.field3272 == var132.field4020) {
                            int var133 = class213.method1533(128, var132.field3992).field561;
                            if (var133 != -1) {
                                class159 var134 = class211.method1521(-65, var133);
                                if (var134 != null && var134.field2962 != null) {
                                    class248.method1748(var132.field4005, var132.field3985, var134, 106, 0, class156.field2904 == var132);
                                }
                            }
                        }
                    }
                }
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 45) {
                class69 var139 = class199.field3595.method963(false);
                int var140 = class199.field3595.method926((byte) -110);
                int var141 = class199.field3595.method937(false);
                if (var140 >= 1 && var140 <= 8) {
                    if (var139.method446(class258.field4626, 23)) {
                        var139 = null;
                    }
                    class268.field4764[var140 - 1] = var139;
                    class215.field3903[var140 - 1] = var141 == 0;
                }
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 111) {
                class13.field190 = -1;
                class129.field2408 = 0;
                return true;
            } else if (class13.field190 == 4) {
                long var142 = class199.field3595.method909(false);
                class69 var144 = class225.method1611(class44.method249(class199.field3595, true).method488(8));
                class122.method881(6, class101.method749(var142, 25801).method452(122), var144, false);
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 116) {
                int var145 = class199.field3595.method923(true);
                int var146 = class199.field3595.method930((byte) 52);
                int var147 = class199.field3595.method961(-268435456);
                if (var147 == 65535) {
                    var147 = -1;
                }
                int var148 = class199.field3595.method951(-102);
                if (class54.method316(var146, -3853)) {
                    class50 var149 = client.method1144((byte) -9, var148);
                    if (var149.field763) {
                        class17.method107(var147, (byte) -50, var145, var148);
                        class205 var151 = class83.method585(var147, -1);
                        class106.method800(var151.field3709, (byte) -74, var148, var151.field3722, var151.field3731);
                        class95.method688(var148, 10, var151.field3733, var151.field3708, var151.field3698);
                    } else if (var147 == -1) {
                        var149.field737 = 0;
                        class13.field190 = -1;
                        return true;
                    } else {
                        class205 var150 = class83.method585(var147, -1);
                        var149.field776 = var150.field3722 * 100 / var145;
                        var149.field888 = var147;
                        var149.field737 = 4;
                        var149.field883 = var150.field3731;
                        var149.field835 = var150.field3709;
                        class204.method1478(var149, false);
                    }
                }
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 219) {
                class223.method1587((byte) -98, false);
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 199) {
                int var152 = class199.field3595.method961(-268435456);
                if (var152 == 65535) {
                    var152 = -1;
                }
                int var153 = class199.field3595.method962((byte) -106);
                int var154 = class199.field3595.method940(false);
                if (class54.method316(var153, -3853)) {
                    class232.method1651(var152, var154, 1, -127);
                }
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 78) {
                int var155 = class199.field3595.method962((byte) -96);
                if (var155 == 65535) {
                    var155 = -1;
                }
                int var156 = class199.field3595.method940(false);
                int var157 = (var156 & 0x3166E9F3) >> 28;
                int var158 = var156 >> 14 & 0x3FFF;
                int var159 = var156 & 0x3FFF;
                int var160 = class199.field3595.method926((byte) -90);
                int var161 = var159 - class220.field3962;
                int var162 = var158 - class242.field4441;
                int var163 = var160 >> 2;
                int var164 = var160 & 0x3;
                int var165 = class108.field2033[var163];
                class130.method967((byte) 110, var161, var157, var165, var162, var163, var155, var164);
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 128) {
                class111.field2112 = class199.field3595.method937(false);
                class208.field3795 = class81.field1564;
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 231) {
                class126.field2319 = class199.field3595.method937(false);
                class112.field2154 = class199.field3595.method937(false);
                class72.field1396 = class199.field3595.method937(false);
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 107) {
                for (int var166 = 0; var166 < class50.field812.length; var166++) {
                    if (class50.field812[var166] != class258.field4629[var166]) {
                        class50.field812[var166] = class258.field4629[var166];
                        class106.method802(true, var166);
                        class89.field1699[class69.method443(class268.field4773++, 31)] = var166;
                    }
                }
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 149) {
                int var167 = class199.field3595.method930((byte) 52);
                class69 var168 = class199.field3595.method963(false);
                int var169 = class199.field3595.method912(65);
                if (class54.method316(var169, -3853)) {
                    class34.method185(var167, (byte) -96, var168);
                }
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 85) {
                class47.method269(true);
                class237.method1672(true);
                class268.field4773 += 32;
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 95) {
                int var170 = class199.field3595.method937(false);
                int var171 = class199.field3595.method937(false);
                int var172 = class199.field3595.method937(false);
                int var173 = class199.field3595.method937(false);
                int var174 = class199.field3595.method912(117);
                class199.field3588[var170] = true;
                class172.field3152[var170] = var171;
                class171.field3125[var170] = var172;
                class163.field3014[var170] = var173;
                class236.field4289[var170] = var174;
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 100) {
                class69 var175 = class199.field3595.method963(false);
                if (var175.method487(class123.field2283, 28160)) {
                    class69 var176 = var175.method485(var175.method481(0, class206.field3768), 0, (byte) -20);
                    boolean var177 = false;
                    long var178 = var176.method473((byte) 101);
                    for (int var180 = 0; var180 < class149.field2778; var180++) {
                        if (class159.field2959[var180] == var178) {
                            var177 = true;
                            break;
                        }
                    }
                    if (!var177 && class105.field1993 == 0) {
                        class122.method881(4, var176, class78.field1508, false);
                    }
                } else if (var175.method487(class126.field2322, 28160)) {
                    boolean var181 = false;
                    class69 var182 = var175.method485(var175.method481(0, class206.field3768), 0, (byte) -20);
                    long var183 = var182.method473((byte) 117);
                    for (int var185 = 0; var185 < class149.field2778; var185++) {
                        if (class159.field2959[var185] == var183) {
                            var181 = true;
                            break;
                        }
                    }
                    if (!var181 && class105.field1993 == 0) {
                        class69 var186 = var175.method485(var175.method441((byte) 73) - 9, var175.method481(0, class206.field3768) + 1, (byte) -20);
                        class122.method881(8, var182, var186, false);
                    }
                } else if (var175.method487(class216.field3919, 28160)) {
                    class69 var187 = var175.method485(var175.method481(0, class206.field3768), 0, (byte) -20);
                    boolean var188 = false;
                    long var189 = var187.method473((byte) 58);
                    for (int var191 = 0; var191 < class149.field2778; var191++) {
                        if (class159.field2959[var191] == var189) {
                            var188 = true;
                            break;
                        }
                    }
                    if (!var188 && class105.field1993 == 0) {
                        class122.method881(10, var187, class209.field3816, false);
                    }
                } else if (var175.method487(class43.field619, 28160)) {
                    class69 var192 = var175.method485(var175.method481(0, class43.field619), 0, (byte) -20);
                    class122.method881(11, class209.field3816, var192, false);
                } else if (var175.method487(class207.field3769, 28160)) {
                    class69 var193 = var175.method485(var175.method481(0, class207.field3769), 0, (byte) -20);
                    if (class105.field1993 == 0) {
                        class122.method881(12, class209.field3816, var193, false);
                    }
                } else if (var175.method487(class39.field546, 28160)) {
                    class69 var194 = var175.method485(var175.method481(0, class39.field546), 0, (byte) -20);
                    if (class105.field1993 == 0) {
                        class122.method881(13, class209.field3816, var194, false);
                    }
                } else if (var175.method487(class251.field4541, 28160)) {
                    boolean var211 = false;
                    class69 var212 = var175.method485(var175.method481(0, class206.field3768), 0, (byte) -20);
                    long var213 = var212.method473((byte) 122);
                    for (int var215 = 0; var215 < class149.field2778; var215++) {
                        if (class159.field2959[var215] == var213) {
                            var211 = true;
                            break;
                        }
                    }
                    if (!var211 && class105.field1993 == 0) {
                        class122.method881(14, var212, class209.field3816, false);
                    }
                } else if (var175.method487(class265.field4706, 28160)) {
                    class69 var206 = var175.method485(var175.method481(0, class206.field3768), 0, (byte) -20);
                    long var207 = var206.method473((byte) 76);
                    boolean var209 = false;
                    for (int var210 = 0; var210 < class149.field2778; var210++) {
                        if (class159.field2959[var210] == var207) {
                            var209 = true;
                            break;
                        }
                    }
                    if (!var209 && class105.field1993 == 0) {
                        class122.method881(15, var206, class209.field3816, false);
                    }
                } else if (var175.method487(class210.field3825, 28160)) {
                    class69 var201 = var175.method485(var175.method481(0, class206.field3768), 0, (byte) -20);
                    boolean var202 = false;
                    long var203 = var201.method473((byte) 85);
                    for (int var205 = 0; var205 < class149.field2778; var205++) {
                        if (class159.field2959[var205] == var203) {
                            var202 = true;
                            break;
                        }
                    }
                    if (!var202 && class105.field1993 == 0) {
                        class122.method881(16, var201, class209.field3816, false);
                    }
                } else if (var175.method487(class259.field4648, 28160)) {
                    class69 var195 = var175.method485(var175.method481(0, class206.field3768), 0, (byte) -20);
                    long var196 = var195.method473((byte) 67);
                    boolean var198 = false;
                    for (int var199 = 0; var199 < class149.field2778; var199++) {
                        if (class159.field2959[var199] == var196) {
                            var198 = true;
                            break;
                        }
                    }
                    if (!var198 && class105.field1993 == 0) {
                        class69 var200 = var175.method485(var175.method441((byte) 73) - 9, var175.method481(0, class206.field3768) + 1, (byte) -20);
                        class122.method881(21, var195, var200, false);
                    }
                } else {
                    class122.method881(0, class209.field3816, var175, false);
                }
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 39) {
                int var216 = class199.field3595.method937(false);
                int var217 = var216 >> 6;
                class232 var218 = new class232();
                var218.field4241 = var216 & 0x3F;
                var218.field4242 = class199.field3595.method937(false);
                if (var218.field4242 >= 0 && var218.field4242 < class13.field195.length) {
                    if (var218.field4241 == 1 || var218.field4241 == 10) {
                        var218.field4236 = class199.field3595.method912(88);
                        class199.field3595.field2379 += 3;
                    } else if (var218.field4241 >= 2 && var218.field4241 <= 6) {
                        if (var218.field4241 == 2) {
                            var218.field4232 = 64;
                            var218.field4231 = 64;
                        }
                        if (var218.field4241 == 3) {
                            var218.field4231 = 0;
                            var218.field4232 = 64;
                        }
                        if (var218.field4241 == 4) {
                            var218.field4232 = 64;
                            var218.field4231 = 128;
                        }
                        if (var218.field4241 == 5) {
                            var218.field4231 = 64;
                            var218.field4232 = 0;
                        }
                        if (var218.field4241 == 6) {
                            var218.field4232 = 128;
                            var218.field4231 = 64;
                        }
                        var218.field4241 = 2;
                        var218.field4248 = class199.field3595.method912(46);
                        var218.field4245 = class199.field3595.method912(42);
                        var218.field4239 = class199.field3595.method937(false);
                    }
                    var218.field4235 = class199.field3595.method912(39);
                    if (var218.field4235 == 65535) {
                        var218.field4235 = -1;
                    }
                    class60.field1094[var217] = var218;
                }
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 156) {
                int var219 = class199.field3595.method930((byte) 52);
                int var220 = class199.field3595.method961(-268435456);
                int var221 = class199.field3595.method944(false);
                if (var220 == 65535) {
                    var220 = -1;
                }
                if (class54.method316(var219, -3853)) {
                    class232.method1651(var220, var221, 2, -128);
                }
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 110) {
                for (int var222 = 0; var222 < class35.field491.length; var222++) {
                    if (class35.field491[var222] != null) {
                        class35.field491[var222].field4010 = -1;
                    }
                }
                for (int var223 = 0; var223 < class131.field2428.length; var223++) {
                    if (class131.field2428[var223] != null) {
                        class131.field2428[var223].field4010 = -1;
                    }
                }
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 244 || class13.field190 == 126 || class13.field190 == 135 || class13.field190 == 32 || class13.field190 == 50 || class13.field190 == 222 || class13.field190 == 240 || class13.field190 == 194 || class13.field190 == 220 || class13.field190 == 88 || class13.field190 == 168 || class13.field190 == 175) {
                class114.method846((byte) -123);
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 150) {
                class11.method53(58);
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 209) {
                long var224 = class199.field3595.method909(false);
                boolean var226 = false;
                long var227 = (long) class199.field3595.method912(-108);
                long var229 = (long) class199.field3595.method952((byte) -109);
                int var231 = class199.field3595.method937(false);
                long var232 = (var227 << 32) + var229;
                int var234 = 0;
                label1251: while (true) {
                    if (var234 >= 100) {
                        if (var231 <= 1) {
                            if (class108.field2060 == 1 || class182.field3313 == 1) {
                                var226 = true;
                            } else {
                                for (int var235 = 0; var235 < class149.field2778; var235++) {
                                    if (class159.field2959[var235] == var224) {
                                        var226 = true;
                                        break label1251;
                                    }
                                }
                            }
                        }
                        break;
                    }
                    if (class271.field4799[var234] == var232) {
                        var226 = true;
                        break;
                    }
                    var234++;
                }
                if (!var226 && class105.field1993 == 0) {
                    class271.field4799[class54.field969] = var232;
                    class54.field969 = (class54.field969 + 1) % 100;
                    class69 var236 = class225.method1611(class44.method249(class199.field3595, true).method488(8));
                    if (var231 == 2 || var231 == 3) {
                        class122.method881(7, class9.method42(-113, new class69[] { class24.field351, class101.method749(var224, 25801).method452(122) }), var236, false);
                    } else if (var231 == 1) {
                        class122.method881(7, class9.method42(-96, new class69[] { class168.field3093, class101.method749(var224, 25801).method452(122) }), var236, false);
                    } else {
                        class122.method881(3, class101.method749(var224, 25801).method452(122), var236, false);
                    }
                }
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 251) {
                int var237 = class199.field3595.method961(-268435456);
                int var238 = class199.field3595.method930((byte) 52);
                int var239 = class199.field3595.method944(false);
                int var240 = class199.field3595.method930((byte) 52);
                if (class54.method316(var237, -3853)) {
                    class48.method273((byte) 117, (var238 << 16) + var240, var239);
                }
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 228) {
                class58.field1058 = class199.field3595.method937(false);
                class202.field3650 = class199.field3595.method946(false);
                for (int var241 = class202.field3650; var241 < class202.field3650 + 8; var241++) {
                    for (int var243 = class58.field1058; var243 < class58.field1058 + 8; var243++) {
                        if (class32.field437[class52.field927][var241][var243] != null) {
                            class32.field437[class52.field927][var241][var243] = null;
                            class263.method1808(var241, var243, 64);
                        }
                    }
                }
                for (class272 var242 = (class272) class38.field528.method1724(255); var242 != null; var242 = (class272) class38.field528.method1726(112)) {
                    if (var242.field4809 >= class202.field3650 && var242.field4809 < class202.field3650 + 8 && class58.field1058 <= var242.field4808 && class58.field1058 + 8 > var242.field4808 && class52.field927 == var242.field4817) {
                        var242.field4823 = 0;
                    }
                }
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 49) {
                int var244 = class199.field3595.method912(-125);
                int var245 = class199.field3595.method926((byte) -125);
                int var246 = class199.field3595.method962((byte) 106);
                class38 var247 = class131.field2428[var244];
                if (var247 != null) {
                    class161.method1208(var245, 49, var246, var247);
                }
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 164) {
                class149.field2778 = class33.field451 / 8;
                for (int var248 = 0; var248 < class149.field2778; var248++) {
                    class159.field2959[var248] = class199.field3595.method909(false);
                    class105.field1977[var248] = class101.method749(class159.field2959[var248], 25801);
                }
                class208.field3795 = class81.field1564;
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 139) {
                if (class33.field451 == 0) {
                    class188.field3416 = class126.field2323;
                } else {
                    class188.field3416 = class199.field3595.method963(false);
                }
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 98) {
                class40.method224(100, class199.field3595.method963(false));
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 22) {
                int var249 = class199.field3595.method951(-117);
                int var250 = class199.field3595.method930((byte) 52);
                int var251 = class199.field3595.method961(-268435456);
                int var252 = class199.field3595.method961(-268435456);
                int var253 = class199.field3595.method961(-268435456);
                if (class54.method316(var250, -3853)) {
                    class106.method800(var252, (byte) -74, var249, var251, var253);
                }
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 223) {
                int var254 = class199.field3595.method912(-89);
                int var255 = class199.field3595.method962((byte) 110);
                int var256 = class199.field3595.method912(-122);
                int var257 = class199.field3595.method951(118);
                if (class54.method316(var256, -3853)) {
                    class232.method1651(var255 << 16 | var254, var257, 7, -127);
                }
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 63) {
                int var258 = class199.field3595.method944(false);
                int var259 = class199.field3595.method962((byte) -54);
                int var260 = class199.field3595.method940(false);
                int var261 = class199.field3595.method912(-89);
                if (var261 == 65535) {
                    var261 = -1;
                }
                int var262 = class199.field3595.method961(-268435456);
                if (var262 == 65535) {
                    var262 = -1;
                }
                if (class54.method316(var259, -3853)) {
                    for (int var263 = var261; var263 <= var262; var263++) {
                        long var264 = ((long) var260 << 32) + (long) var263;
                        class88 var266 = class162.field2998.method769(true, var264);
                        if (var266 != null) {
                            var266.method632(-8296);
                        }
                        class162.field2998.method761(var264, 0, new class3(var258));
                    }
                }
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 212) {
                long var267 = class199.field3595.method909(false);
                class199.field3595.method950(1495791448);
                long var269 = class199.field3595.method909(false);
                long var271 = (long) class199.field3595.method912(94);
                long var273 = (long) class199.field3595.method952((byte) -120);
                int var275 = class199.field3595.method937(false);
                long var276 = (var271 << 32) + var273;
                boolean var278 = false;
                int var279 = 0;
                label1306: while (true) {
                    if (var279 >= 100) {
                        if (var275 <= 1) {
                            if (class108.field2060 == 1 || class182.field3313 == 1) {
                                var278 = true;
                            } else {
                                for (int var280 = 0; var280 < class149.field2778; var280++) {
                                    if (class159.field2959[var280] == var267) {
                                        var278 = true;
                                        break label1306;
                                    }
                                }
                            }
                        }
                        break;
                    }
                    if (class271.field4799[var279] == var276) {
                        var278 = true;
                        break;
                    }
                    var279++;
                }
                if (!var278 && class105.field1993 == 0) {
                    class271.field4799[class54.field969] = var276;
                    class54.field969 = (class54.field969 + 1) % 100;
                    class69 var281 = class225.method1611(class44.method249(class199.field3595, true).method488(8));
                    if (var275 == 2 || var275 == 3) {
                        client.method1146(var281, (byte) 39, class101.method749(var269, 25801).method452(122), 9, class9.method42(-95, new class69[] { class24.field351, class101.method749(var267, 25801).method452(122) }));
                    } else if (var275 == 1) {
                        client.method1146(var281, (byte) 39, class101.method749(var269, 25801).method452(122), 9, class9.method42(127, new class69[] { class168.field3093, class101.method749(var267, 25801).method452(122) }));
                    } else {
                        client.method1146(var281, (byte) 39, class101.method749(var269, 25801).method452(122), 9, class101.method749(var267, 25801).method452(122));
                    }
                }
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 30) {
                int var282 = class199.field3595.method912(-93);
                int var283 = class199.field3595.method923(true);
                if (class54.method316(var282, -3853)) {
                    class259 var284 = (class259) class156.field2910.method769(true, (long) var283);
                    if (var284 != null) {
                        class52.method306(var284, true, 3);
                    }
                    if (class193.field3516 != null) {
                        class204.method1478(class193.field3516, false);
                        class193.field3516 = null;
                    }
                }
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 26) {
                class237.method1672(true);
                class208.field3783 = class199.field3595.method937(false);
                class13.field190 = -1;
                class33.field471 = class81.field1564;
                return true;
            } else if (class13.field190 == 62) {
                int var285 = class199.field3595.method951(66);
                class191.field3458 = class36.field508.method234(24728, var285);
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 109) {
                int var286 = class199.field3595.method937(false);
                int var287 = class199.field3595.method937(false);
                int var288 = class199.field3595.method912(-114);
                int var289 = class199.field3595.method937(false);
                int var290 = class199.field3595.method937(false);
                class140.method1075(var287, var289, var288, true, var290, var286, -103);
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 115) {
                int var291 = class199.field3595.method926((byte) -115);
                int var292 = class199.field3595.method962((byte) 127);
                int var293 = class199.field3595.method930((byte) 52);
                if (class54.method316(var293, -3853)) {
                    class53.method311(var291, var292, -105);
                }
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 210) {
                class97.method715(false);
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 125) {
                int var294 = class199.field3595.method940(false);
                int var295 = class199.field3595.method926((byte) -87);
                int var296 = class199.field3595.method930((byte) 52);
                if (class54.method316(var296, -3853)) {
                    class65.method426(var295, (byte) 89, var294);
                }
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 229) {
                int var297 = class199.field3595.method923(true);
                int var298 = class199.field3595.method962((byte) 116);
                int var299 = class199.field3595.method947(-23188);
                if (class54.method316(var298, -3853)) {
                    class258.method1781(var297, var299, (byte) -24);
                }
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 182) {
                int var300 = class199.field3595.method962((byte) 83);
                int var301 = class199.field3595.method940(false);
                class50.method282(var300, 125, var301);
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 216) {
                class202.field3650 = class199.field3595.method926((byte) -84);
                class58.field1058 = class199.field3595.method917(255);
                while (class33.field451 > class199.field3595.field2379) {
                    class13.field190 = class199.field3595.method937(false);
                    class114.method846((byte) -73);
                }
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 106) {
                class43.field616 = class81.field1564;
                long var302 = class199.field3595.method909(false);
                if (var302 == 0L) {
                    class216.field3910 = 0;
                    class273.field4833 = null;
                    class233.field4255 = null;
                    class13.field190 = -1;
                    class222.field4038 = null;
                    return true;
                }
                long var304 = class199.field3595.method909(false);
                class233.field4255 = class101.method749(var304, 25801);
                class222.field4038 = class101.method749(var302, 25801);
                class245.field4491 = class199.field3595.method950(1495791448);
                int var306 = class199.field3595.method937(false);
                if (var306 == 255) {
                    class13.field190 = -1;
                    return true;
                }
                class216.field3910 = var306;
                class26[] var307 = new class26[100];
                for (int var308 = 0; var308 < class216.field3910; var308++) {
                    var307[var308] = new class26();
                    var307[var308].field1685 = class199.field3595.method909(false);
                    var307[var308].field363 = class101.method749(var307[var308].field1685, 25801);
                    var307[var308].field368 = class199.field3595.method912(-115);
                    var307[var308].field371 = class199.field3595.method950(1495791448);
                    var307[var308].field375 = class199.field3595.method963(false);
                    if (class116.field2213 == var307[var308].field1685) {
                        class79.field1527 = var307[var308].field371;
                    }
                }
                boolean var309 = false;
                int var310 = class216.field3910;
                while (var310 > 0) {
                    boolean var311 = true;
                    var310--;
                    for (int var312 = 0; var312 < var310; var312++) {
                        if (var307[var312].field363.method465(var307[var312 + 1].field363, (byte) 118) > 0) {
                            class26 var313 = var307[var312];
                            var311 = false;
                            var307[var312] = var307[var312 + 1];
                            var307[var312 + 1] = var313;
                        }
                    }
                    if (var311) {
                        break;
                    }
                }
                class13.field190 = -1;
                class273.field4833 = var307;
                return true;
            } else if (class13.field190 == 91) {
                int var314 = class199.field3595.method912(-99);
                byte var315 = class199.field3595.method950(1495791448);
                class50.method282(var314, 93, var315);
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 247) {
                int var316 = class199.field3595.method951(67);
                int var317 = class199.field3595.method930((byte) 52);
                int var318 = class199.field3595.method961(-268435456);
                if (class54.method316(var318, -3853)) {
                    class53.method311(var316, var317, -66);
                }
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 59) {
                int var319 = class199.field3595.method912(43);
                int var320 = class199.field3595.method937(false);
                class4.method17(var319, 80, var320);
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 243) {
                int var321 = class199.field3595.method912(-83);
                class69 var322 = class199.field3595.method963(false);
                Object[] var323 = new Object[var322.method441((byte) 73) + 1];
                for (int var324 = var322.method441((byte) 73) - 1; var324 >= 0; var324--) {
                    if (var322.method490(120, var324) == 115) {
                        var323[var324 + 1] = class199.field3595.method963(false);
                    } else {
                        var323[var324 + 1] = Integer.valueOf(class199.field3595.method923(true));
                    }
                }
                var323[0] = Integer.valueOf(class199.field3595.method923(true));
                if (class54.method316(var321, -3853)) {
                    class58 var325 = new class58();
                    var325.field1050 = var323;
                    class179.method1304((byte) -126, var325);
                }
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 129) {
                int var326 = class199.field3595.method961(-268435456);
                int var327 = class199.field3595.method951(107);
                int var328 = class199.field3595.method951(-90);
                if (class54.method316(var326, -3853)) {
                    class259 var329 = (class259) class156.field2910.method769(true, (long) var327);
                    class259 var330 = (class259) class156.field2910.method769(true, (long) var328);
                    if (var330 != null) {
                        class52.method306(var330, var329 == null || var329.field4640 != var330.field4640, 3);
                    }
                    if (var329 != null) {
                        var329.method632(-8296);
                        class156.field2910.method761((long) var328, 0, var329);
                    }
                    class50 var331 = client.method1144((byte) -9, var327);
                    if (var331 != null) {
                        class204.method1478(var331, false);
                    }
                    class50 var332 = client.method1144((byte) -9, var328);
                    if (var332 != null) {
                        class204.method1478(var332, false);
                        class247.method1745(true, var332, 124);
                    }
                    if (class35.field483 != -1) {
                        class215.method1548(1, class35.field483, 111);
                    }
                }
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 103) {
                long var333 = class199.field3595.method909(false);
                int var335 = class199.field3595.method912(-113);
                byte var336 = class199.field3595.method950(1495791448);
                boolean var337 = false;
                if ((Long.MIN_VALUE & var333) != 0L) {
                    var337 = true;
                }
                if (var337) {
                    if (class216.field3910 == 0) {
                        class13.field190 = -1;
                        return true;
                    }
                    long var338 = var333 & Long.MAX_VALUE;
                    boolean var340 = false;
                    int var341;
                    for (var341 = 0; class216.field3910 > var341 && (class273.field4833[var341].field1685 != var338 || class273.field4833[var341].field368 != var335); var341++) {
                    }
                    if (class216.field3910 > var341) {
                        while (var341 < class216.field3910 - 1) {
                            class273.field4833[var341] = class273.field4833[var341 + 1];
                            var341++;
                        }
                        class216.field3910--;
                        class273.field4833[class216.field3910] = null;
                    }
                } else {
                    class69 var342 = class199.field3595.method963(false);
                    class26 var343 = new class26();
                    var343.field1685 = var333;
                    var343.field363 = class101.method749(var343.field1685, 25801);
                    var343.field368 = var335;
                    var343.field371 = var336;
                    var343.field375 = var342;
                    int var344;
                    for (var344 = class216.field3910 - 1; var344 >= 0; var344--) {
                        int var345 = class273.field4833[var344].field363.method465(var343.field363, (byte) 124);
                        if (var345 == 0) {
                            class273.field4833[var344].field368 = var335;
                            class273.field4833[var344].field371 = var336;
                            class273.field4833[var344].field375 = var342;
                            class13.field190 = -1;
                            if (class116.field2213 == var333) {
                                class79.field1527 = var336;
                            }
                            class43.field616 = class81.field1564;
                            return true;
                        }
                        if (var345 < 0) {
                            break;
                        }
                    }
                    if (class216.field3910 >= class273.field4833.length) {
                        class13.field190 = -1;
                        return true;
                    }
                    for (int var346 = class216.field3910 - 1; var346 > var344; var346--) {
                        class273.field4833[var346 + 1] = class273.field4833[var346];
                    }
                    if (class216.field3910 == 0) {
                        class273.field4833 = new class26[100];
                    }
                    class273.field4833[var344 + 1] = var343;
                    if (class116.field2213 == var333) {
                        class79.field1527 = var336;
                    }
                    class216.field3910++;
                }
                class13.field190 = -1;
                class43.field616 = class81.field1564;
                return true;
            } else if (class13.field190 == 1) {
                int var347 = class199.field3595.method912(-100);
                int var348 = class199.field3595.method937(false);
                if (var347 == 65535) {
                    var347 = -1;
                }
                int var349 = class199.field3595.method912(-111);
                class255.method1768(-72, var349, var348, var347);
                class13.field190 = -1;
                return true;
            } else if (class13.field190 == 75) {
                int var350 = class199.field3595.method917(255);
                int var351 = class199.field3595.method917(255);
                int var352 = class199.field3595.method946(false);
                class52.field927 = var351 >> 1;
                class156.field2904.method812(var350, 0, (var351 & 0x1) == 1, var352);
                class13.field190 = -1;
                return true;
            } else {
                class222.method1575("T1 - " + class13.field190 + "," + class170.field3118 + "," + class163.field3016 + " - " + class33.field451, (Throwable) null, -55);
                class20.method115(-5);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(B)V")
    public static void method1554(byte arg0) {
        if (arg0 != -40) {
            field3923 = 94;
        }
        field3921 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)I")
    public static final int method1555(int arg0, byte arg1) {
        field3925++;
        if (arg1 >= 65 && arg1 <= 90) {
            return arg1 - 65;
        } else if (arg1 >= 97 && arg1 <= 122) {
            return arg1 + 26 - 97;
        } else if (arg1 >= 48 && arg1 <= 57) {
            return arg1 + 52 - 48;
        } else if (arg1 == 43) {
            return 62;
        } else if (arg1 == 42) {
            return 62;
        } else if (arg1 == 47) {
            return 63;
        } else if (arg1 == 45) {
            return 63;
        } else {
            if (arg0 != -140) {
                method1555(0, (byte) -123);
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(III)V")
    public class217(int arg0, int arg1, int arg2) {
        this.field3931 = arg2;
        this.field3927 = arg1;
        this.field3930 = this.field3929 = arg0;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BJ)V")
    public static final void method1556(byte arg0, long arg1) {
        field3924++;
        if (arg1 == 0L) {
            return;
        }
        if (arg0 != -4) {
            method1555(35, (byte) 57);
        }
        class133.field2479++;
        class48.field692.method301(103, -104);
        class48.field692.method918(arg1, arg0 ^ 0xFFFFB678);
    }
}
