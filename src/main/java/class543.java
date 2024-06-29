import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class543 extends class525 {

    @OriginalMember(owner = "client!rw", name = "I", descriptor = "I")
    private int field7973;

    @OriginalMember(owner = "client!rw", name = "H", descriptor = "Lqv;")
    public static class316 field7972 = new class316(2, -2);

    @OriginalMember(owner = "client!rw", name = "C", descriptor = "I")
    public static int field7968;

    @OriginalMember(owner = "client!rw", name = "D", descriptor = "I")
    public static int field7969;

    @OriginalMember(owner = "client!rw", name = "E", descriptor = "I")
    public static int field7970;

    @OriginalMember(owner = "client!rw", name = "G", descriptor = "I")
    public static int field7971;

    @OriginalMember(owner = "client!rw", name = "J", descriptor = "I")
    public static int field7974;

    @OriginalMember(owner = "client!rw", name = "K", descriptor = "I")
    public static int field7975;

    @OriginalMember(owner = "client!rw", name = "L", descriptor = "I")
    public static int field7976;

    @OriginalMember(owner = "client!rw", name = "M", descriptor = "I")
    public static int field7977;

    @OriginalMember(owner = "client!rw", name = "B", descriptor = "[Lrt;")
    public class155[] field7967;

    @OriginalMember(owner = "client!rw", name = "A", descriptor = "[[B")
    private byte[][] field7966;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(II)Z")
    public final boolean method3182(int arg0, int arg1) {
        field7970++;
        int var3 = 116 / ((-arg1 - 15) / 61);
        return this.field7967[arg0].field2361;
    }

    @OriginalMember(owner = "client!rw", name = "d", descriptor = "(B)Z")
    public static final boolean method3183(byte arg0) throws IOException {
        field7976++;
        if (class410.field5802 == null) {
            return false;
        }
        if (class30.field405 == null) {
            if (class479.field6981) {
                if (!class410.field5802.method1298(1, 94)) {
                    return false;
                }
                class410.field5802.method1299(class336.field4966.field7545, 0, 1, 4470);
                class505.field7301 = 0;
                class479.field6981 = false;
                class192.field2802++;
            }
            class336.field4966.field7558 = 0;
            if (class336.field4966.method2476(8)) {
                if (!class410.field5802.method1298(1, 96)) {
                    return false;
                }
                class410.field5802.method1299(class336.field4966.field7545, 1, 1, 4470);
                class192.field2802++;
                class505.field7301 = 0;
            }
            class479.field6981 = true;
            class316[] var1 = class544.method3194(-5817);
            int var2 = class336.field4966.method2479(-129);
            if (var2 < 0 || var1.length <= var2) {
                throw new IOException("invo:" + var2 + " ip:" + class336.field4966.field7558);
            }
            class30.field405 = var1[var2];
            class305.field4527 = class30.field405.field4699;
        }
        if (class305.field4527 == -1) {
            if (!class410.field5802.method1298(1, 122)) {
                return false;
            }
            class410.field5802.method1299(class336.field4966.field7545, 0, 1, 4470);
            class192.field2802++;
            class305.field4527 = class336.field4966.field7545[0] & 0xFF;
            class505.field7301 = 0;
        }
        if (class305.field4527 == -2) {
            if (!class410.field5802.method1298(2, 120)) {
                return false;
            }
            class410.field5802.method1299(class336.field4966.field7545, 0, 2, 4470);
            class336.field4966.field7558 = 0;
            class305.field4527 = class336.field4966.method3018(566990904);
            class505.field7301 = 0;
            class192.field2802 += 2;
        }
        if (class305.field4527 > 0) {
            if (!class410.field5802.method1298(class305.field4527, 87)) {
                return false;
            }
            class336.field4966.field7558 = 0;
            class410.field5802.method1299(class336.field4966.field7545, 0, class305.field4527, 4470);
            class505.field7301 = 0;
            class192.field2802 += class305.field4527;
        }
        class501.field7244 = class269.field4041;
        class269.field4041 = class126.field1986;
        if (arg0 < 114) {
            method3185(-58, -20, -97, -108, 24, 57, -18);
        }
        class126.field1986 = class30.field405;
        if (class436.field6227 == class30.field405) {
            int var3 = class336.field4966.method3018(566990904);
            int var4 = class336.field4966.method3053(-129);
            int var5 = class336.field4966.method3018(566990904);
            if (var5 == 65535) {
                var5 = -1;
            }
            int var6 = class336.field4966.method3064(-2);
            int var7 = class336.field4966.method3018(566990904);
            if (var7 == 65535) {
                var7 = -1;
            }
            if (class80.method612((byte) -52, var3)) {
                for (int var8 = var7; var8 <= var5; var8++) {
                    long var9 = ((long) var4 << 32) + (long) var8;
                    class293 var11 = (class293) class363.field5276.method2284(true, var9);
                    class293 var12;
                    if (var11 != null) {
                        var12 = new class293(var11.field4366, var6);
                        var11.method421(22071);
                    } else if (var8 == -1) {
                        var12 = new class293(class154.method1087(var4, 2).field2962.field4366, var6);
                    } else {
                        var12 = new class293(0, var6);
                    }
                    class363.field5276.method2292(var9, var12, (byte) -128);
                }
            }
            class30.field405 = null;
            return true;
        } else if (class313.field4676 == class30.field405) {
            class31.method175(class336.field4966.method3082((byte) 39), -1);
            class30.field405 = null;
            return true;
        } else if (class30.field405 == class120.field1868) {
            int var13 = class336.field4966.method3018(566990904);
            int var14 = class336.field4966.method3064(-2);
            int var15 = class336.field4966.method3064(-2);
            if (class80.method612((byte) -96, var14)) {
                class7.method31((byte) 20, var13, 0, var15);
            }
            class30.field405 = null;
            return true;
        } else if (class30.field405 == class256.field3792) {
            class84.field1335.method1953((byte) -125);
            class313.field4671 += 32;
            class30.field405 = null;
            return true;
        } else if (class413.field5845 == class30.field405) {
            int var16 = class336.field4966.method3018(566990904);
            int var17 = class336.field4966.method3072((byte) -119);
            int var18 = class336.field4966.method3072((byte) -121);
            int var19 = class336.field4966.method3018(566990904) << 0;
            int var20 = class336.field4966.method3072((byte) -120);
            int var21 = class336.field4966.method3072((byte) -124);
            if (class80.method612((byte) -65, var16)) {
                class29.method169(var19, false, var18, var17, var21, var20);
            }
            class30.field405 = null;
            return true;
        } else if (class444.field6333 == class30.field405) {
            class66.method530(class356.field5181, -26);
            class30.field405 = null;
            return true;
        } else if (class473.field6894 == class30.field405) {
            int var22 = class336.field4966.method3022(-124);
            int var23 = class336.field4966.method3064(-2);
            int var24 = class336.field4966.method3081(24083);
            if (class80.method612((byte) -87, var24)) {
                client.method1391(false, var23, var22);
            }
            class30.field405 = null;
            return true;
        } else if (class30.field405 == class112.field1660) {
            class66.method530(class24.field351, -89);
            class30.field405 = null;
            return true;
        } else if (class39.field833 == class30.field405) {
            if (class275.method1773(class37.field799, -96)) {
                class246.field3680 = (int) ((float) class336.field4966.method3018(566990904) * 2.5F);
            } else {
                class246.field3680 = class336.field4966.method3018(566990904) * 30;
            }
            class30.field405 = null;
            class512.field7447 = class426.field6113;
            return true;
        } else if (class30.field405 == class23.field300) {
            int var25 = class336.field4966.method3038((byte) -121);
            int var26 = class336.field4966.method3018(566990904);
            int var27 = class336.field4966.method3018(566990904);
            if (var27 == 65535) {
                var27 = -1;
            }
            int var28 = class336.field4966.method3053(-129);
            if (class80.method612((byte) -62, var26)) {
                class389.method2350(var28, -15016, var27, var25);
                class116 var29 = class58.field1052.method1646(21708, var27);
                class376.method2296(var28, (byte) -99, var29.field1779, var29.field1734, var29.field1724);
                class78.method601(79, var29.field1768, var29.field1762, var28, var29.field1732);
            }
            class30.field405 = null;
            return true;
        } else if (class330.field4897 == class30.field405) {
            class66.method530(class475.field6930, 120);
            class30.field405 = null;
            return true;
        } else if (class339.field5018 == class30.field405) {
            class66.method530(class216.field3241, 126);
            class30.field405 = null;
            return true;
        } else if (class470.field6822 == class30.field405) {
            class12.method67(class280.field4173, class336.field4966, class305.field4527, 3988);
            class30.field405 = null;
            return true;
        } else if (class525.field7657 == class30.field405) {
            class38.field804 = class118.method857(class336.field4966.method3072((byte) -127), (byte) 118);
            class30.field405 = null;
            return true;
        } else if (class486.field7047 == class30.field405) {
            class112.field1659 = class426.field6113;
            if (class305.field4527 == 0) {
                class413.field5842 = 0;
                class478.field6955 = null;
                class248.field3713 = null;
                class524.field7653 = null;
                class30.field405 = null;
                return true;
            }
            class478.field6955 = class336.field4966.method3082((byte) 106);
            boolean var30 = class336.field4966.method3072((byte) -127) == 1;
            if (var30) {
                class336.field4966.method3082((byte) 29);
            }
            long var31 = class336.field4966.method3061(16556);
            class524.field7653 = class76.method587(var31, (byte) -53);
            class166.field2493 = class336.field4966.method3034((byte) 69);
            int var33 = class336.field4966.method3072((byte) -120);
            if (var33 == 255) {
                class30.field405 = null;
                return true;
            }
            class413.field5842 = var33;
            class486[] var34 = new class486[100];
            for (int var35 = 0; var35 < class413.field5842; var35++) {
                var34[var35] = new class486();
                var34[var35].field7035 = class336.field4966.method3082((byte) 46);
                boolean var41 = class336.field4966.method3072((byte) -123) == 1;
                if (var41) {
                    var34[var35].field7039 = class336.field4966.method3082((byte) 79);
                } else {
                    var34[var35].field7039 = var34[var35].field7035;
                }
                var34[var35].field7041 = class274.method1769(0, var34[var35].field7039);
                var34[var35].field7038 = class336.field4966.method3018(566990904);
                var34[var35].field7045 = class336.field4966.method3034((byte) -62);
                var34[var35].field7042 = class336.field4966.method3082((byte) 27);
                if (var34[var35].field7039.equals(class364.field5293.field7363)) {
                    class77.field1262 = var34[var35].field7045;
                }
            }
            boolean var36 = false;
            int var37 = class413.field5842;
            while (var37 > 0) {
                var37--;
                boolean var38 = true;
                for (int var39 = 0; var39 < var37; var39++) {
                    if (var34[var39].field7041.compareTo(var34[var39 + 1].field7041) > 0) {
                        class486 var40 = var34[var39];
                        var34[var39] = var34[var39 + 1];
                        var34[var39 + 1] = var40;
                        var38 = false;
                    }
                }
                if (var38) {
                    break;
                }
            }
            class248.field3713 = var34;
            class30.field405 = null;
            return true;
        } else if (class30.field405 == class258.field3821) {
            boolean var42 = class336.field4966.method3072((byte) -119) == 1;
            String var43 = class336.field4966.method3082((byte) 22);
            String var44 = var43;
            if (var42) {
                var44 = class336.field4966.method3082((byte) 119);
            }
            long var45 = class336.field4966.method3061(16556);
            long var47 = (long) class336.field4966.method3018(566990904);
            long var49 = (long) class336.field4966.method3040((byte) -3);
            int var51 = class336.field4966.method3072((byte) -127);
            int var52 = class336.field4966.method3018(566990904);
            long var53 = (var47 << 32) + var49;
            boolean var55 = false;
            int var56 = 0;
            while (true) {
                if (var56 >= 100) {
                    if (var51 <= 1 && class163.method1179(var44, (byte) 8)) {
                        var55 = true;
                    }
                    break;
                }
                if (class91.field1456[var56] == var53) {
                    var55 = true;
                    break;
                }
                var56++;
            }
            if (!var55 && class174.field2601 == 0) {
                class91.field1456[class91.field1466] = var53;
                class91.field1466 = (class91.field1466 + 1) % 100;
                String var57 = class363.field5277.method3120(125, var52).method1721(0, class336.field4966);
                if (var51 == 2) {
                    class267.method1716(99, "<img=1>" + var44, var57, 0, "<img=1>" + var43, class6.method16(var45, 84), var52, 20);
                } else if (var51 == 1) {
                    class267.method1716(99, "<img=0>" + var44, var57, 0, "<img=0>" + var43, class6.method16(var45, 107), var52, 20);
                } else {
                    class267.method1716(99, var44, var57, 0, var43, class6.method16(var45, -96), var52, 20);
                }
            }
            class30.field405 = null;
            return true;
        } else if (class58.field1049 == class30.field405) {
            int var58 = class336.field4966.method3075(10);
            String var59 = class336.field4966.method3082((byte) 91);
            int var60 = class336.field4966.method3060(-23438);
            int var61 = class336.field4966.method3081(24083);
            if (var61 == 65535) {
                var61 = -1;
            }
            if (var58 >= 1 && var58 <= 8) {
                if (var59.equalsIgnoreCase("null")) {
                    var59 = null;
                }
                class316.field4704[var58 - 1] = var59;
                class157.field2395[var58 - 1] = var61;
                class280.field4179[var58 - 1] = var60 == 0;
            }
            class30.field405 = null;
            return true;
        } else if (class474.field6917 == class30.field405) {
            int var62 = class336.field4966.method3022(-93);
            int var63 = class336.field4966.method3064(-2);
            int var64 = class336.field4966.method3081(24083);
            if (class80.method612((byte) -111, var64)) {
                class421.method2501(84, var62, var63);
            }
            class30.field405 = null;
            return true;
        } else if (class474.field6914 == class30.field405) {
            class458.method2724(0);
            class30.field405 = null;
            return false;
        } else if (class30.field405 == class21.field222) {
            int var65 = class336.field4966.method3033(11790);
            int var66 = class336.field4966.method3053(-129);
            int var67 = class336.field4966.method3072((byte) -121);
            String var68 = "";
            String var69 = var68;
            if ((var67 & 0x1) != 0) {
                var68 = class336.field4966.method3082((byte) 31);
                if ((var67 & 0x2) == 0) {
                    var69 = var68;
                } else {
                    var69 = class336.field4966.method3082((byte) 60);
                }
            }
            String var70 = class336.field4966.method3082((byte) 44);
            if (var65 == 99) {
                class329.method2077(-1, var70);
            } else if (var69.equals("") || !class163.method1179(var69, (byte) 8)) {
                class10.method52(var68, 101, var65, var70, var69, var66);
            } else {
                class30.field405 = null;
                return true;
            }
            class30.field405 = null;
            return true;
        } else if (class30.field405 == class180.field2658) {
            int var71 = class336.field4966.method3018(566990904);
            int var72 = class336.field4966.method3072((byte) -126);
            int var73 = class336.field4966.method3065((byte) -127);
            int var74 = class336.field4966.method3022(-124);
            if (class80.method612((byte) -121, var73)) {
                class541 var75 = (class541) class220.field3370.method2284(true, (long) var74);
                if (var75 != null) {
                    class126.method937(true, var75, var75.field7955 != var71, false);
                }
                class269.method1740(false, var71, var72, -1, var74);
            }
            class30.field405 = null;
            return true;
        } else if (class469.field6803 == class30.field405) {
            int var76 = class336.field4966.method3053(-129);
            int var77 = class336.field4966.method3064(-2);
            int var78 = class336.field4966.method3065((byte) -126);
            if (class80.method612((byte) -120, var77)) {
                class484.method2856(var76, -91, var78);
            }
            class30.field405 = null;
            return true;
        } else if (class302.field4478 == class30.field405) {
            String var79 = class336.field4966.method3082((byte) 36);
            String var80 = class374.method2280(class472.method2797(32767, class336.field4966), true);
            class10.method52(var79, 116, 6, var80, var79, 0);
            class30.field405 = null;
            return true;
        } else if (class30.field405 == class262.field3954) {
            class30.field405 = null;
            return false;
        } else if (class30.field405 == class19.field209) {
            boolean var81 = class336.field4966.method3072((byte) -126) == 1;
            String var82 = class336.field4966.method3082((byte) 53);
            String var83 = var82;
            if (var81) {
                var83 = class336.field4966.method3082((byte) 95);
            }
            long var84 = class336.field4966.method3061(16556);
            long var86 = (long) class336.field4966.method3018(566990904);
            long var88 = (long) class336.field4966.method3040((byte) -3);
            int var90 = class336.field4966.method3072((byte) -124);
            long var91 = (var86 << 32) + var88;
            boolean var93 = false;
            int var94 = 0;
            while (true) {
                if (var94 >= 100) {
                    if (var90 <= 1) {
                        if (!(!class10.field88 || class78.field1274) || class317.field4710) {
                            var93 = true;
                        } else if (class163.method1179(var83, (byte) 8)) {
                            var93 = true;
                        }
                    }
                    break;
                }
                if (class91.field1456[var94] == var91) {
                    var93 = true;
                    break;
                }
                var94++;
            }
            if (!var93 && class174.field2601 == 0) {
                class91.field1456[class91.field1466] = var91;
                class91.field1466 = (class91.field1466 + 1) % 100;
                String var95 = class374.method2280(class472.method2797(32767, class336.field4966), true);
                if (var90 == 2 || var90 == 3) {
                    class267.method1716(99, "<img=1>" + var83, var95, 0, "<img=1>" + var82, class6.method16(var84, -95), -1, 9);
                } else if (var90 == 1) {
                    class267.method1716(99, "<img=0>" + var83, var95, 0, "<img=0>" + var82, class6.method16(var84, 61), -1, 9);
                } else {
                    class267.method1716(99, var83, var95, 0, var82, class6.method16(var84, -72), -1, 9);
                }
            }
            class30.field405 = null;
            return true;
        } else if (class30.field405 == class270.field4068) {
            int var96 = class336.field4966.method3081(24083);
            int var97 = class336.field4966.method3081(24083);
            int var98 = class336.field4966.method3022(-124);
            int var99 = class336.field4966.method3081(24083);
            int var100 = class336.field4966.method3064(-2);
            if (class80.method612((byte) -59, var97)) {
                class376.method2296(var98, (byte) -99, var99, var100, var96);
            }
            class30.field405 = null;
            return true;
        } else if (class52.field958 == class30.field405) {
            int var101 = class336.field4966.method3018(566990904);
            int var102 = class336.field4966.method3038((byte) -119);
            int var103 = class336.field4966.method3081(24083);
            int var104 = class336.field4966.method3076(0);
            int var105 = class336.field4966.method3065((byte) -127);
            boolean var106 = (var104 & 0x80) != 0;
            if ((var102 >> 30) != 0) {
                int var107 = (var102 & 0x32C4E525) >> 28;
                int var108 = (var102 >> 14 & 0x3FFF) - class82.field1315;
                int var109 = (var102 & 0x3FFF) - class501.field7240;
                if (var108 >= 0 && var109 >= 0 && class69.field1139 > var108 && var109 < class255.field3763) {
                    int var110 = var108 * 128 + 64;
                    int var111 = var109 * 128 + 64;
                    int var112 = var107;
                    if (var107 < 3 && class195.method1322(var108, var109, 28946)) {
                        var112 = var107 + 1;
                    }
                    class359 var113 = new class359(var105, 0, class24.field349, var107, var112, var110, class224.method1515(var110, var111, var107, -631749433) - var101, var111, var108, var108, var109, var109, var104);
                    class533.field7867.method866((byte) 10, new class107(var113));
                }
            } else if (var102 >> 29 != 0) {
                int var114 = var102 & 0xFFFF;
                class193 var115 = (class193) class390.field5539.method2284(true, (long) var114);
                if (var115 != null) {
                    if (var105 == 65535) {
                        var105 = -1;
                    }
                    class279 var116 = var115.field2805;
                    boolean var117 = true;
                    int var118 = var106 ? var116.field250 : var116.field286;
                    if (var105 != -1 && var118 != -1) {
                        if (var105 == var118) {
                            class394 var123 = class69.field1133.method1312(var105, (byte) -39);
                            if (var123.field5607 && var123.field5596 != -1) {
                                class183 var124 = class96.field1526.method2717(-99, var123.field5596);
                                int var125 = var124.field2687;
                                if (var125 == 0 || var125 == 2) {
                                    var117 = false;
                                } else if (var125 == 1) {
                                    var117 = true;
                                }
                            }
                        } else {
                            class394 var119 = class69.field1133.method1312(var105, (byte) -39);
                            class394 var120 = class69.field1133.method1312(var118, (byte) -39);
                            if (var119.field5596 != -1 && var120.field5596 != -1) {
                                class183 var121 = class96.field1526.method2717(-106, var119.field5596);
                                class183 var122 = class96.field1526.method2717(-95, var120.field5596);
                                if (var122.field2688 > var121.field2688) {
                                    var117 = false;
                                }
                            }
                        }
                    }
                    if (var117) {
                        if (var106) {
                            var116.field262 = 1;
                            var116.field258 = var101;
                            var116.field302 = var104 & 0x7;
                            var116.field311 = class24.field349 + var103;
                            var116.field259 = 0;
                            var116.field309 = 0;
                            var116.field250 = var105;
                            if (var116.field311 > class24.field349) {
                                var116.field259 = -1;
                            }
                            if (var116.field250 != -1 && class24.field349 == var116.field311) {
                                int var128 = class69.field1133.method1312(var116.field250, (byte) -39).field5596;
                                if (var128 != -1) {
                                    class183 var129 = class96.field1526.method2717(-102, var128);
                                    if (var129 != null && var129.field2692 != null) {
                                        class511.method2983(var116.field6961, 0, var116.field6965, -64, false, var129, var116.field6956);
                                    }
                                }
                            }
                        } else {
                            var116.field277 = var104 & 0x7;
                            var116.field255 = 0;
                            var116.field283 = 0;
                            var116.field286 = var105;
                            var116.field289 = class24.field349 + var103;
                            var116.field271 = var101;
                            var116.field293 = 1;
                            if (var116.field289 > class24.field349) {
                                var116.field283 = -1;
                            }
                            if (var116.field286 != -1 && class24.field349 == var116.field289) {
                                int var126 = class69.field1133.method1312(var116.field286, (byte) -39).field5596;
                                if (var126 != -1) {
                                    class183 var127 = class96.field1526.method2717(-111, var126);
                                    if (var127 != null && var127.field2692 != null) {
                                        class511.method2983(var116.field6961, 0, var116.field6965, -64, false, var127, var116.field6956);
                                    }
                                }
                            }
                        }
                    }
                }
            } else if ((var102 >> 28) != 0) {
                int var130 = var102 & 0xFFFF;
                class510 var131;
                if (class497.field7188 == var130) {
                    var131 = class364.field5293;
                } else {
                    var131 = class494.field7143[var130];
                }
                if (var131 != null) {
                    if (var105 == 65535) {
                        var105 = -1;
                    }
                    boolean var132 = true;
                    int var133 = var106 ? var131.field250 : var131.field286;
                    if (var105 != -1 && var133 != -1) {
                        if (var105 == var133) {
                            class394 var134 = class69.field1133.method1312(var105, (byte) -39);
                            if (var134.field5607 && var134.field5596 != -1) {
                                class183 var135 = class96.field1526.method2717(-94, var134.field5596);
                                int var136 = var135.field2687;
                                if (var136 == 0 || var136 == 2) {
                                    var132 = false;
                                } else if (var136 == 1) {
                                    var132 = true;
                                }
                            }
                        } else {
                            class394 var137 = class69.field1133.method1312(var105, (byte) -39);
                            class394 var138 = class69.field1133.method1312(var133, (byte) -39);
                            if (var137.field5596 != -1 && var138.field5596 != -1) {
                                class183 var139 = class96.field1526.method2717(-93, var137.field5596);
                                class183 var140 = class96.field1526.method2717(-116, var138.field5596);
                                if (var139.field2688 < var140.field2688) {
                                    var132 = false;
                                }
                            }
                        }
                    }
                    if (var132) {
                        if (var106) {
                            var131.field262 = 1;
                            var131.field311 = class24.field349 + var103;
                            var131.field309 = 0;
                            var131.field250 = var105;
                            var131.field302 = var104 & 0x7;
                            var131.field258 = var101;
                            var131.field259 = 0;
                            if (class24.field349 < var131.field311) {
                                var131.field259 = -1;
                            }
                            if (var131.field250 == 65535) {
                                var131.field250 = -1;
                            }
                            if (var131.field250 != -1 && class24.field349 == var131.field311) {
                                int var143 = class69.field1133.method1312(var131.field250, (byte) -39).field5596;
                                if (var143 != -1) {
                                    class183 var144 = class96.field1526.method2717(-124, var143);
                                    if (var144 != null && var144.field2692 != null) {
                                        class511.method2983(var131.field6961, 0, var131.field6965, -64, class364.field5293 == var131, var144, var131.field6956);
                                    }
                                }
                            }
                        } else {
                            var131.field286 = var105;
                            var131.field293 = 1;
                            var131.field283 = 0;
                            var131.field255 = 0;
                            var131.field271 = var101;
                            var131.field289 = class24.field349 + var103;
                            var131.field277 = var104 & 0x7;
                            if (var131.field286 == 65535) {
                                var131.field286 = -1;
                            }
                            if (class24.field349 < var131.field289) {
                                var131.field283 = -1;
                            }
                            if (var131.field286 != -1 && class24.field349 == var131.field289) {
                                int var141 = class69.field1133.method1312(var131.field286, (byte) -39).field5596;
                                if (var141 != -1) {
                                    class183 var142 = class96.field1526.method2717(-112, var141);
                                    if (var142 != null && var142.field2692 != null) {
                                        class511.method2983(var131.field6961, 0, var131.field6965, -64, class364.field5293 == var131, var142, var131.field6956);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class30.field405 = null;
            return true;
        } else if (class446.field6359 == class30.field405) {
            int var145 = class336.field4966.method3022(-104);
            int var146 = class336.field4966.method3054(-19494);
            int var147 = class336.field4966.method3064(-2);
            int var148 = class336.field4966.method3052(17);
            if (class80.method612((byte) -62, var147)) {
                class83.method616(var146, var148, var145, false);
            }
            class30.field405 = null;
            return true;
        } else if (class385.field5499 == class30.field405) {
            int var149 = class336.field4966.method3065((byte) -125);
            int var150 = class336.field4966.method3075(109);
            int var151 = class336.field4966.method3065((byte) -126);
            class193 var152 = (class193) class390.field5539.method2284(true, (long) var151);
            if (var152 != null) {
                class405.method2415(var149, 0, var152.field2805, var150);
            }
            class30.field405 = null;
            return true;
        } else if (class481.field6988 == class30.field405) {
            int var153 = class336.field4966.method3072((byte) -121);
            boolean var154 = (var153 & 0x1) == 1;
            String var155 = class336.field4966.method3082((byte) 93);
            String var156 = class336.field4966.method3082((byte) 72);
            if (var156.equals("")) {
                var156 = var155;
            }
            String var157 = class336.field4966.method3082((byte) 42);
            String var158 = class336.field4966.method3082((byte) 79);
            if (var158.equals("")) {
                var158 = var157;
            }
            if (var154) {
                for (int var159 = 0; var159 < class8.field71; var159++) {
                    if (class277.field4129[var159].equals(var158)) {
                        class440.field6273[var159] = var155;
                        class277.field4129[var159] = var156;
                        class350.field5133[var159] = var157;
                        class98.field1540[var159] = var158;
                        break;
                    }
                }
            } else {
                class440.field6273[class8.field71] = var155;
                class277.field4129[class8.field71] = var156;
                class350.field5133[class8.field71] = var157;
                class98.field1540[class8.field71] = var158;
                class313.field4670[class8.field71] = class168.method1203(var153, 2) == 2;
                class8.field71++;
            }
            class30.field405 = null;
            class196.field2864 = class426.field6113;
            return true;
        } else if (class30.field405 == class241.field3616) {
            int var160 = class336.field4966.method3018(566990904);
            String var161 = class336.field4966.method3082((byte) 52);
            Object[] var162 = new Object[var161.length() + 1];
            for (int var163 = var161.length() - 1; var163 >= 0; var163--) {
                if (var161.charAt(var163) == 's') {
                    var162[var163 + 1] = class336.field4966.method3082((byte) 123);
                } else {
                    var162[var163 + 1] = Integer.valueOf(class336.field4966.method3053(-129));
                }
            }
            var162[0] = Integer.valueOf(class336.field4966.method3053(-129));
            if (class80.method612((byte) -116, var160)) {
                class361 var164 = new class361();
                var164.field5256 = var162;
                class281.method1805(var164);
            }
            class30.field405 = null;
            return true;
        } else if (class5.field31 == class30.field405) {
            class66.method530(class195.field2819, 127);
            class30.field405 = null;
            return true;
        } else if (class30.field405 == class11.field113) {
            int var165 = class336.field4966.method3072((byte) -128);
            int var166 = class336.field4966.method3064(-2);
            if (var166 == 65535) {
                var166 = -1;
            }
            int var167 = class336.field4966.method3060(-23438);
            class180.method1250(var166, var165, (byte) -2, var167);
            class30.field405 = null;
            return true;
        } else if (class504.field7293 == class30.field405) {
            int var168 = class336.field4966.method3065((byte) -125);
            if (var168 == 65535) {
                var168 = -1;
            }
            int var169 = class336.field4966.method3060(-23438);
            int var170 = class336.field4966.method3049(-85);
            class491.method2876(-127, var169, var170, var168);
            class30.field405 = null;
            return true;
        } else if (class438.field6238 == class30.field405) {
            int var171 = class336.field4966.method3081(24083);
            if (var171 == 65535) {
                var171 = -1;
            }
            int var172 = class336.field4966.method3064(-2);
            int var173 = class336.field4966.method3028(-23254);
            if (class80.method612((byte) -88, var172)) {
                class76.method586(-1, 1, var173, 0, var171);
            }
            class30.field405 = null;
            return true;
        } else if (class459.field6655 == class30.field405) {
            int var174 = class336.field4966.method3018(566990904);
            byte var175 = class336.field4966.method3034((byte) -95);
            class84.field1335.method1960(var175, (byte) -12, var174);
            class30.field405 = null;
            return true;
        } else if (class30.field405 == class176.field2619) {
            int var176 = class336.field4966.method3018(566990904);
            int var177 = class336.field4966.method3072((byte) -123);
            int var178 = class336.field4966.method3072((byte) -120);
            int var179 = class336.field4966.method3072((byte) -125);
            int var180 = class336.field4966.method3072((byte) -127);
            int var181 = class336.field4966.method3018(566990904);
            if (class80.method612((byte) -87, var176)) {
                class172.field2551[var177] = true;
                class408.field5787[var177] = var178;
                class77.field1260[var177] = var179;
                class400.field5681[var177] = var180;
                class196.field2868[var177] = var181;
            }
            class30.field405 = null;
            return true;
        } else if (class335.field4963 == class30.field405) {
            int var182 = class336.field4966.method3065((byte) -125);
            int var183 = class336.field4966.method3060(-23438);
            boolean var184 = (var183 & 0x1) == 1;
            class178.method1238(var182, (byte) -49, var184);
            class280.field4170[class168.method1203(31, class184.field2717++)] = var182;
            class30.field405 = null;
            return true;
        } else if (class30.field405 == class275.field4116) {
            int var185 = class336.field4966.method3072((byte) -125);
            int var186 = class336.field4966.method3076(0);
            int var187 = class336.field4966.method3038((byte) -125);
            class111.field1641[var186] = var187;
            class460.field6663[var186] = var185;
            class485.field7034[var186] = 1;
            int var188 = class67.field1120[var186] - 1;
            for (int var189 = 0; var189 < var188; var189++) {
                if (var187 >= class234.field3487[var189]) {
                    class485.field7034[var186] = var189 + 2;
                }
            }
            class156.field2390[class168.method1203(31, class12.field132++)] = var186;
            class30.field405 = null;
            return true;
        } else if (field7972 == class30.field405) {
            int var190 = class336.field4966.method3018(566990904);
            int var191 = class336.field4966.method3072((byte) -123);
            boolean var192 = (var191 & 0x1) == 1;
            while (class305.field4527 > class336.field4966.field7558) {
                int var193 = class336.field4966.method3033(11790);
                int var194 = class336.field4966.method3018(566990904);
                int var195 = 0;
                if (var194 != 0) {
                    var195 = class336.field4966.method3072((byte) -126);
                    if (var195 == 255) {
                        var195 = class336.field4966.method3053(-129);
                    }
                }
                class525.method3114(var193, var190, (byte) -60, var194 - 1, var195, var192);
            }
            class280.field4170[class168.method1203(class184.field2717++, 31)] = var190;
            class30.field405 = null;
            return true;
        } else if (class30.field405 == class214.field3228) {
            class182.method1261((byte) -116, false);
            class30.field405 = null;
            return true;
        } else if (class32.field415 == class30.field405) {
            int var196 = class336.field4966.method3081(24083);
            int var197 = class336.field4966.method3038((byte) -114);
            class84.field1335.method1960(var197, (byte) -12, var196);
            class30.field405 = null;
            return true;
        } else if (class366.field5300 == class30.field405) {
            int var198 = class336.field4966.method3081(24083);
            int var199 = class336.field4966.method3028(-23254);
            int var200 = class336.field4966.method3076(0);
            if (class80.method612((byte) -118, var198)) {
                class485.method2860(var200, (byte) -83, var199);
            }
            class30.field405 = null;
            return true;
        } else if (class5.field25 == class30.field405) {
            int var201 = class336.field4966.method3018(566990904);
            if (var201 == 65535) {
                var201 = -1;
            }
            int var202 = class336.field4966.method3072((byte) -122);
            int var203 = class336.field4966.method3018(566990904);
            int var204 = class336.field4966.method3072((byte) -127);
            class371.method2272(var202, 9832, var201, var204, var203);
            class30.field405 = null;
            return true;
        } else if (class30.field405 == class167.field2520) {
            boolean var205 = class336.field4966.method3072((byte) -119) == 1;
            String var206 = class336.field4966.method3082((byte) 41);
            String var207 = var206;
            if (var205) {
                var207 = class336.field4966.method3082((byte) 39);
            }
            long var208 = (long) class336.field4966.method3018(566990904);
            long var210 = (long) class336.field4966.method3040((byte) -3);
            int var212 = class336.field4966.method3072((byte) -120);
            int var213 = class336.field4966.method3018(566990904);
            long var214 = (var208 << 32) + var210;
            boolean var216 = false;
            int var217 = 0;
            while (true) {
                if (var217 >= 100) {
                    if (var212 <= 1 && class163.method1179(var207, (byte) 8)) {
                        var216 = true;
                    }
                    break;
                }
                if (class91.field1456[var217] == var214) {
                    var216 = true;
                    break;
                }
                var217++;
            }
            if (!var216 && class174.field2601 == 0) {
                class91.field1456[class91.field1466] = var214;
                class91.field1466 = (class91.field1466 + 1) % 100;
                String var218 = class363.field5277.method3120(-110, var213).method1721(0, class336.field4966);
                if (var212 == 2) {
                    class267.method1716(99, "<img=1>" + var207, var218, 0, "<img=1>" + var206, null, var213, 18);
                } else if (var212 == 1) {
                    class267.method1716(99, "<img=0>" + var207, var218, 0, "<img=0>" + var206, null, var213, 18);
                } else {
                    class267.method1716(99, var207, var218, 0, var206, null, var213, 18);
                }
            }
            class30.field405 = null;
            return true;
        } else if (class530.field7832 == class30.field405) {
            class414.field5868 = class336.field4966.method3060(-23438);
            class265.field3999 = class336.field4966.method3075(-3);
            class30.field405 = null;
            return true;
        } else if (class30.field405 == class262.field3959) {
            int var219 = class336.field4966.method3018(566990904);
            int var220 = class336.field4966.method3022(-109);
            int var221 = class336.field4966.method3038((byte) -116);
            int var222 = class336.field4966.method3065((byte) -125);
            if (class80.method612((byte) -81, var222)) {
                class76.method586(var221, 5, var220, 0, var219);
            }
            class30.field405 = null;
            return true;
        } else if (class30.field405 == class181.field2668) {
            int var223 = class336.field4966.method3065((byte) -125);
            int var224 = class336.field4966.method3065((byte) -125);
            int var225 = class336.field4966.method3053(-129);
            if (class80.method612((byte) -120, var224)) {
                class508.method2964(var223, false, var225);
            }
            class30.field405 = null;
            return true;
        } else if (class30.field405 == class134.field2088) {
            int var226 = class336.field4966.method3064(-2);
            int var227 = class336.field4966.method3038((byte) -119);
            if (class80.method612((byte) -118, var226)) {
                class76.method586(-1, 3, var227, 0, -1);
            }
            class30.field405 = null;
            return true;
        } else if (class519.field7578 == class30.field405) {
            int var228 = class336.field4966.method3018(566990904);
            int var229 = class336.field4966.method3064(-2);
            byte var230 = class336.field4966.method3034((byte) 104);
            if (class80.method612((byte) -93, var229)) {
                class484.method2856(var230, -114, var228);
            }
            class30.field405 = null;
            return true;
        } else if (class461.field6671 == class30.field405) {
            while (class336.field4966.field7558 < class305.field4527) {
                boolean var241 = class336.field4966.method3072((byte) -123) == 1;
                String var242 = class336.field4966.method3082((byte) 114);
                String var243 = class336.field4966.method3082((byte) 50);
                int var244 = class336.field4966.method3018(566990904);
                int var245 = class336.field4966.method3072((byte) -123);
                String var246 = "";
                boolean var247 = false;
                if (var244 > 0) {
                    var246 = class336.field4966.method3082((byte) 27);
                    var247 = class336.field4966.method3072((byte) -126) == 1;
                }
                for (int var248 = 0; var248 < class290.field4314; var248++) {
                    if (var241) {
                        if (var243.equals(class163.field2463[var248])) {
                            class163.field2463[var248] = var242;
                            class397.field5630[var248] = var243;
                            var242 = null;
                            break;
                        }
                    } else if (var242.equals(class163.field2463[var248])) {
                        if (class292.field4344[var248] != var244) {
                            boolean var249 = true;
                            for (class147 var250 = (class147) class247.field3688.method904(false); var250 != null; var250 = (class147) class247.field3688.method907(-1)) {
                                if (var250.field2265.equals(var242)) {
                                    if (var244 != 0 && var250.field2267 == 0) {
                                        var249 = false;
                                        var250.method2429(120);
                                    } else if (var244 == 0 && var250.field2267 != 0) {
                                        var249 = false;
                                        var250.method2429(124);
                                    }
                                }
                            }
                            if (var249) {
                                class247.field3688.method905(new class147(var242, var244), 0);
                            }
                            class292.field4344[var248] = var244;
                        }
                        class397.field5630[var248] = var243;
                        class306.field4540[var248] = var246;
                        class418.field5942[var248] = var245;
                        class79.field1291[var248] = var247;
                        var242 = null;
                        break;
                    }
                }
                if (var242 != null && class290.field4314 < 200) {
                    class163.field2463[class290.field4314] = var242;
                    class397.field5630[class290.field4314] = var243;
                    class292.field4344[class290.field4314] = var244;
                    class306.field4540[class290.field4314] = var246;
                    class418.field5942[class290.field4314] = var245;
                    class79.field1291[class290.field4314] = var247;
                    class290.field4314++;
                }
            }
            class196.field2864 = class426.field6113;
            class491.field7085 = 2;
            boolean var231 = false;
            int var232 = class290.field4314;
            while (var232 > 0) {
                boolean var233 = true;
                var232--;
                for (int var234 = 0; var234 < var232; var234++) {
                    if (class292.field4344[var234] != class474.field6918.field4020 && class292.field4344[var234 + 1] == class474.field6918.field4020 || class292.field4344[var234] == 0 && class292.field4344[var234 + 1] != 0) {
                        int var235 = class292.field4344[var234];
                        class292.field4344[var234] = class292.field4344[var234 + 1];
                        class292.field4344[var234 + 1] = var235;
                        String var236 = class306.field4540[var234];
                        class306.field4540[var234] = class306.field4540[var234 + 1];
                        class306.field4540[var234 + 1] = var236;
                        String var237 = class163.field2463[var234];
                        class163.field2463[var234] = class163.field2463[var234 + 1];
                        class163.field2463[var234 + 1] = var237;
                        String var238 = class397.field5630[var234];
                        class397.field5630[var234] = class397.field5630[var234 + 1];
                        class397.field5630[var234 + 1] = var238;
                        int var239 = class418.field5942[var234];
                        class418.field5942[var234] = class418.field5942[var234 + 1];
                        class418.field5942[var234 + 1] = var239;
                        boolean var240 = class79.field1291[var234];
                        class79.field1291[var234] = class79.field1291[var234 + 1];
                        var233 = false;
                        class79.field1291[var234 + 1] = var240;
                    }
                }
                if (var233) {
                    break;
                }
            }
            class30.field405 = null;
            return true;
        } else if (class30.field405 == class170.field2536) {
            class8.field71 = class336.field4966.method3072((byte) -124);
            for (int var251 = 0; var251 < class8.field71; var251++) {
                class440.field6273[var251] = class336.field4966.method3082((byte) 85);
                class277.field4129[var251] = class336.field4966.method3082((byte) 114);
                if (class277.field4129[var251].equals("")) {
                    class277.field4129[var251] = class440.field6273[var251];
                }
                class350.field5133[var251] = class336.field4966.method3082((byte) 52);
                class98.field1540[var251] = class336.field4966.method3082((byte) 87);
                if (class98.field1540[var251].equals("")) {
                    class98.field1540[var251] = class350.field5133[var251];
                }
                class313.field4670[var251] = false;
            }
            class196.field2864 = class426.field6113;
            class30.field405 = null;
            return true;
        } else if (class519.field7528 == class30.field405) {
            class114.field1701 = class305.field4527 > 2 ? class336.field4966.method3082((byte) 103) : class513.field7460.method426(class503.field7255, 63);
            class248.field3715 = class305.field4527 <= 0 ? -1 : class336.field4966.method3018(566990904);
            class30.field405 = null;
            if (class248.field3715 == 65535) {
                class248.field3715 = -1;
            }
            return true;
        } else if (class501.field7233 == class30.field405) {
            class66.method530(class369.field5325, 127);
            class30.field405 = null;
            return true;
        } else if (class88.field1421 == class30.field405) {
            int var252 = class336.field4966.method3072((byte) -124);
            if (class336.field4966.method3072((byte) -127) == 0) {
                class49.field914[var252] = new class90();
            } else {
                class336.field4966.field7558--;
                class49.field914[var252] = new class90(class336.field4966);
            }
            class30.field405 = null;
            class495.field7168 = class426.field6113;
            return true;
        } else if (class422.field5983 == class30.field405) {
            int var253 = class336.field4966.method3022(-122);
            int var254 = class336.field4966.method3054(-19494);
            int var255 = class336.field4966.method3081(24083);
            if (class80.method612((byte) -102, var255)) {
                class486.method2865(var254, -124, var253);
            }
            class30.field405 = null;
            return true;
        } else if (class30.field405 == class263.field3981) {
            int var256 = class336.field4966.method3065((byte) -125);
            int var257 = class336.field4966.method3018(566990904);
            String var258 = class336.field4966.method3082((byte) 77);
            if (class80.method612((byte) -48, var256)) {
                method3189(-30344, var258, var257);
            }
            class30.field405 = null;
            return true;
        } else if (class492.field7109 == class30.field405) {
            class7.method25(296132232);
            class30.field405 = null;
            return false;
        } else if (class30.field405 == class224.field3405) {
            class377.method2301((byte) 86);
            class30.field405 = null;
            return true;
        } else if (class347.field5088 == class30.field405) {
            int var259 = class336.field4966.method3064(-2);
            if (var259 == 65535) {
                var259 = -1;
            }
            int var260 = class336.field4966.method3064(-2);
            int var261 = class336.field4966.method3038((byte) -111);
            int var262 = class336.field4966.method3053(-129);
            int var263 = class336.field4966.method3064(-2);
            if (var263 == 65535) {
                var263 = -1;
            }
            if (class80.method612((byte) -96, var260)) {
                for (int var264 = var263; var264 <= var259; var264++) {
                    long var265 = ((long) var261 << 32) + ((long) var264);
                    class293 var267 = (class293) class363.field5276.method2284(true, var265);
                    class293 var268;
                    if (var267 != null) {
                        var268 = new class293(var262, var267.field4356);
                        var267.method421(22071);
                    } else if (var264 == -1) {
                        var268 = new class293(var262, class154.method1087(var261, 2).field2962.field4356);
                    } else {
                        var268 = new class293(var262, -1);
                    }
                    class363.field5276.method2292(var265, var268, (byte) -128);
                }
            }
            class30.field405 = null;
            return true;
        } else if (class390.field5537 == class30.field405) {
            int var269 = class336.field4966.method3064(-2);
            int var270 = class336.field4966.method3038((byte) -128);
            int var271 = class336.field4966.method3038((byte) -116);
            if (class80.method612((byte) -43, var269)) {
                class541 var272 = (class541) class220.field3370.method2284(true, (long) var270);
                class541 var273 = (class541) class220.field3370.method2284(true, (long) var271);
                if (var273 != null) {
                    class126.method937(true, var273, var272 == null || var272.field7955 != var273.field7955, false);
                }
                if (var272 != null) {
                    var272.method421(22071);
                    class220.field3370.method2292((long) var271, var272, (byte) -127);
                }
                class198 var274 = class154.method1087(var270, 2);
                if (var274 != null) {
                    class284.method1832(-17067, var274);
                }
                class198 var275 = class154.method1087(var271, 2);
                if (var275 != null) {
                    class284.method1832(-17067, var275);
                    class518.method3011(var275, -100, true);
                }
                if (class188.field2765 != -1) {
                    class504.method2943(class188.field2765, (byte) -63, 1);
                }
            }
            class30.field405 = null;
            return true;
        } else if (class315.field4691 == class30.field405) {
            boolean var276 = class336.field4966.method3072((byte) -124) == 1;
            String var277 = class336.field4966.method3082((byte) 25);
            String var278 = var277;
            if (var276) {
                var278 = class336.field4966.method3082((byte) 119);
            }
            int var279 = class336.field4966.method3072((byte) -123);
            int var280 = class336.field4966.method3018(566990904);
            boolean var281 = false;
            if (var279 <= 1 && class163.method1179(var278, (byte) 8)) {
                var281 = true;
            }
            if (!var281 && class174.field2601 == 0) {
                String var282 = class363.field5277.method3120(126, var280).method1721(0, class336.field4966);
                if (var279 == 2) {
                    class267.method1716(99, "<img=1>" + var278, var282, 0, "<img=1>" + var277, null, var280, 25);
                } else if (var279 == 1) {
                    class267.method1716(99, "<img=0>" + var278, var282, 0, "<img=0>" + var277, null, var280, 25);
                } else {
                    class267.method1716(99, var278, var282, 0, var277, null, var280, 25);
                }
            }
            class30.field405 = null;
            return true;
        } else if (class71.field1156 == class30.field405) {
            int var283 = class336.field4966.method3018(566990904);
            int var284 = class336.field4966.method3053(-129);
            int var285 = class336.field4966.method3018(566990904);
            int var286 = class336.field4966.method3081(24083);
            int var287 = class336.field4966.method3064(-2);
            if (class80.method612((byte) -87, var286)) {
                class76.method586(var283, 7, var284, 0, var287 << 16 | var285);
            }
            class30.field405 = null;
            return true;
        } else if (class30.field405 == class280.field4167) {
            class66.method530(class159.field2439, -69);
            class30.field405 = null;
            return true;
        } else if (class511.field7418 == class30.field405) {
            class66.method530(class166.field2494, 126);
            class30.field405 = null;
            return true;
        } else if (class30.field405 == class269.field4046) {
            class182.method1261((byte) -116, true);
            class30.field405 = null;
            return true;
        } else if (class80.field1306 == class30.field405) {
            String var288 = class336.field4966.method3082((byte) 118);
            boolean var289 = class336.field4966.method3072((byte) -120) == 1;
            String var290;
            if (var289) {
                var290 = class336.field4966.method3082((byte) 71);
            } else {
                var290 = var288;
            }
            int var291 = class336.field4966.method3018(566990904);
            byte var292 = class336.field4966.method3034((byte) -64);
            boolean var293 = false;
            if (var292 == -128) {
                var293 = true;
            }
            if (var293) {
                if (class413.field5842 == 0) {
                    class30.field405 = null;
                    return true;
                }
                boolean var299 = false;
                int var300;
                for (var300 = 0; class413.field5842 > var300 && (!class248.field3713[var300].field7039.equals(var290) || class248.field3713[var300].field7038 != var291); var300++) {
                }
                if (class413.field5842 > var300) {
                    while ((class413.field5842 - 1) > var300) {
                        class248.field3713[var300] = class248.field3713[var300 + 1];
                        var300++;
                    }
                    class413.field5842--;
                    class248.field3713[class413.field5842] = null;
                }
            } else {
                String var294 = class336.field4966.method3082((byte) 63);
                class486 var295 = new class486();
                var295.field7035 = var288;
                var295.field7039 = var290;
                var295.field7041 = class274.method1769(0, var295.field7039);
                var295.field7038 = var291;
                var295.field7042 = var294;
                var295.field7045 = var292;
                int var296;
                for (var296 = class413.field5842 - 1; var296 >= 0; var296--) {
                    int var297 = class248.field3713[var296].field7041.compareTo(var295.field7041);
                    if (var297 == 0) {
                        class248.field3713[var296].field7038 = var291;
                        class248.field3713[var296].field7045 = var292;
                        class248.field3713[var296].field7042 = var294;
                        if (var290.equals(class364.field5293.field7363)) {
                            class77.field1262 = var292;
                        }
                        class112.field1659 = class426.field6113;
                        class30.field405 = null;
                        return true;
                    }
                    if (var297 < 0) {
                        break;
                    }
                }
                if (class248.field3713.length <= class413.field5842) {
                    class30.field405 = null;
                    return true;
                }
                for (int var298 = class413.field5842 - 1; var298 > var296; var298--) {
                    class248.field3713[var298 + 1] = class248.field3713[var298];
                }
                if (class413.field5842 == 0) {
                    class248.field3713 = new class486[100];
                }
                class248.field3713[var296 + 1] = var295;
                class413.field5842++;
                if (var290.equals(class364.field5293.field7363)) {
                    class77.field1262 = var292;
                }
            }
            class30.field405 = null;
            class112.field1659 = class426.field6113;
            return true;
        } else if (class317.field4715 == class30.field405) {
            int var301 = class336.field4966.method3064(-2);
            if (var301 == 65535) {
                var301 = -1;
            }
            int var302 = class336.field4966.method3022(-104);
            int var303 = class336.field4966.method3018(566990904);
            if (class80.method612((byte) -85, var303)) {
                class76.method586(-1, 2, var302, 0, var301);
            }
            class30.field405 = null;
            return true;
        } else if (class319.field4732 == class30.field405) {
            class66.method530(class258.field3830, 125);
            class30.field405 = null;
            return true;
        } else if (class376.field5410 == class30.field405) {
            int var304 = class336.field4966.method3053(-129);
            class415.field5886 = class280.field4173.method2448(var304, (byte) -125);
            class30.field405 = null;
            return true;
        } else if (class329.field4834 == class30.field405) {
            class508.method2962(class336.field4966, class305.field4527, (byte) 106);
            class30.field405 = null;
            return true;
        } else if (class30.field405 == class28.field393) {
            boolean var305 = class336.field4966.method3072((byte) -121) == 1;
            String var306 = class336.field4966.method3082((byte) 52);
            String var307 = var306;
            if (var305) {
                var307 = class336.field4966.method3082((byte) 82);
            }
            int var308 = class336.field4966.method3072((byte) -124);
            boolean var309 = false;
            if (var308 <= 1) {
                if (!(!class10.field88 || class78.field1274) || class317.field4710) {
                    var309 = true;
                } else if (var308 <= 1 && class163.method1179(var307, (byte) 8)) {
                    var309 = true;
                }
            }
            if (!var309 && class174.field2601 == 0) {
                String var310 = class374.method2280(class472.method2797(32767, class336.field4966), true);
                if (var308 == 2) {
                    class267.method1716(99, "<img=1>" + var307, var310, 0, "<img=1>" + var306, null, -1, 24);
                } else if (var308 == 1) {
                    class267.method1716(99, "<img=0>" + var307, var310, 0, "<img=0>" + var306, null, -1, 24);
                } else {
                    class267.method1716(99, var307, var310, 0, var306, null, -1, 24);
                }
            }
            class30.field405 = null;
            return true;
        } else if (class30.field405 == class208.field3158) {
            int var311 = class336.field4966.method3065((byte) -126);
            int var312 = class336.field4966.method3065((byte) -125);
            int var313 = class336.field4966.method3053(-129);
            int var314 = class336.field4966.method3081(24083);
            if (class80.method612((byte) -53, var311)) {
                class314.method1993((var314 << 16) + var312, 13, var313);
            }
            class30.field405 = null;
            return true;
        } else if (class30.field405 == class238.field3588) {
            class244.field3648 = class336.field4966.method3072((byte) -128);
            class30.field405 = null;
            class512.field7447 = class426.field6113;
            return true;
        } else if (class483.field7010 == class30.field405) {
            class336.field4966.field7558 += 28;
            if (class336.field4966.method3055(-89)) {
                class163.method1178(class336.field4966.field7558 - 28, (byte) -115, class336.field4966);
            }
            class30.field405 = null;
            return true;
        } else if (class30.field405 == class167.field2509) {
            class30.field405 = null;
            class491.field7085 = 1;
            class196.field2864 = class426.field6113;
            return true;
        } else if (class30.field405 == class233.field3482) {
            class444.field6328 = class336.field4966.method3063((byte) -21) << 3;
            class470.field6819 = class336.field4966.method3060(-23438);
            class146.field2264 = class336.field4966.method3034((byte) -63) << 3;
            while (class336.field4966.field7558 < class305.field4527) {
                class216 var315 = class436.method2569(12)[class336.field4966.method3072((byte) -124)];
                class66.method530(var315, 126);
            }
            class30.field405 = null;
            return true;
        } else if (class30.field405 == class236.field3556) {
            int var316 = class336.field4966.method3072((byte) -121);
            int var317 = var316 >> 5;
            int var318 = var316 & 0x1F;
            if (var318 == 0) {
                class356.field5182[var317] = null;
                class30.field405 = null;
                return true;
            }
            class3 var319 = new class3();
            var319.field17 = var318;
            var319.field12 = class336.field4966.method3072((byte) -121);
            if (var319.field12 >= 0 && class288.field4263.length > var319.field12) {
                if (var319.field17 == 1 || var319.field17 == 10) {
                    var319.field8 = class336.field4966.method3018(566990904);
                    class336.field4966.field7558 += 6;
                } else if (var319.field17 >= 2 && var319.field17 <= 6) {
                    if (var319.field17 == 2) {
                        var319.field16 = 64;
                        var319.field14 = 64;
                    }
                    if (var319.field17 == 3) {
                        var319.field16 = 64;
                        var319.field14 = 0;
                    }
                    if (var319.field17 == 4) {
                        var319.field16 = 64;
                        var319.field14 = 128;
                    }
                    if (var319.field17 == 5) {
                        var319.field14 = 64;
                        var319.field16 = 0;
                    }
                    if (var319.field17 == 6) {
                        var319.field14 = 64;
                        var319.field16 = 128;
                    }
                    var319.field17 = 2;
                    var319.field10 = class336.field4966.method3072((byte) -127);
                    var319.field14 += class336.field4966.method3018(566990904) - class82.field1315 << 7;
                    var319.field16 += class336.field4966.method3018(566990904) - class501.field7240 << 7;
                    var319.field13 = class336.field4966.method3072((byte) -120) << 0;
                    var319.field6 = class336.field4966.method3018(566990904);
                }
                var319.field15 = class336.field4966.method3018(566990904);
                if (var319.field15 == 65535) {
                    var319.field15 = -1;
                }
                class356.field5182[var317] = var319;
            }
            class30.field405 = null;
            return true;
        } else if (class490.field7064 == class30.field405) {
            int var320 = class336.field4966.method3064(-2);
            if (var320 == 65535) {
                var320 = -1;
            }
            int var321 = class336.field4966.method3076(0);
            int var322 = var321 >> 2;
            int var323 = var321 & 0x3;
            int var324 = class71.field1155[var322];
            int var325 = class336.field4966.method3038((byte) -121);
            int var326 = var325 >> 28 & 0x3;
            int var327 = (var325 & 0xFFFFE70) >> 14;
            int var328 = var327 - class82.field1315;
            int var329 = var325 & 0x3FFF;
            int var330 = var329 - class501.field7240;
            class311.method1982(var326, var322, var324, var323, var320, var328, 126, var330);
            class30.field405 = null;
            return true;
        } else if (class30.field405 == class152.field2321) {
            class213.field3219 = class336.field4966.method3072((byte) -128);
            class30.field405 = null;
            return true;
        } else if (class345.field5077 == class30.field405) {
            int var331 = class336.field4966.method3072((byte) -127);
            int var332 = class336.field4966.method3081(24083);
            class84.field1335.method1956(var332, -119, var331);
            class30.field405 = null;
            return true;
        } else if (class387.field5511 == class30.field405) {
            String var333 = class336.field4966.method3082((byte) 53);
            int var334 = class336.field4966.method3018(566990904);
            String var335 = class363.field5277.method3120(-49, var334).method1721(0, class336.field4966);
            class267.method1716(99, var333, var335, 0, var333, null, var334, 19);
            class30.field405 = null;
            return true;
        } else if (class424.field5992 == class30.field405) {
            class470.field6819 = class336.field4966.method3075(4);
            class444.field6328 = class336.field4966.method3034((byte) -74) << 3;
            class146.field2264 = class336.field4966.method3063((byte) -21) << 3;
            for (class203 var336 = (class203) class191.field2787.method2285(127); var336 != null; var336 = (class203) class191.field2787.method2283((byte) 11)) {
                int var338 = (int) (var336.field863 >> 28 & 0x3L);
                int var339 = (int) (var336.field863 & 0x3FFFL);
                int var340 = var339 - class82.field1315;
                int var341 = (int) (var336.field863 >> 14 & 0x3FFFL);
                int var342 = var341 - class501.field7240;
                if (class470.field6819 == var338 && var340 >= class444.field6328 && var340 < (class444.field6328 + 8) && class146.field2264 <= var342 && var342 < (class146.field2264 + 8)) {
                    var336.method421(22071);
                    if (var340 >= 0 && var342 >= 0 && class69.field1139 > var340 && var342 < class255.field3763) {
                        method3186(var340, class470.field6819, false, var342);
                    }
                }
            }
            for (class50 var337 = (class50) class515.field7469.method863(-1); var337 != null; var337 = (class50) class515.field7469.method865(-1)) {
                if (var337.field924 >= class444.field6328 && var337.field924 < class444.field6328 + 8 && class146.field2264 <= var337.field919 && (class146.field2264 + 8) > var337.field919 && class470.field6819 == var337.field931) {
                    var337.field916 = 0;
                }
            }
            class30.field405 = null;
            return true;
        } else if (class494.field7149 == class30.field405) {
            class66.method530(class512.field7448, -55);
            class30.field405 = null;
            return true;
        } else if (class41.field844 == class30.field405) {
            int var343 = class336.field4966.method3018(566990904);
            int var344 = class336.field4966.method3053(-129);
            if (class80.method612((byte) -105, var343)) {
                class541 var345 = (class541) class220.field3370.method2284(true, (long) var344);
                if (var345 != null) {
                    class126.method937(true, var345, true, false);
                }
                if (class65.field1112 != null) {
                    class284.method1832(-17067, class65.field1112);
                    class65.field1112 = null;
                }
            }
            class30.field405 = null;
            return true;
        } else if (class37.field803 == class30.field405) {
            int var346 = class336.field4966.method3018(566990904);
            if (var346 == 65535) {
                var346 = -1;
            }
            int var347 = class336.field4966.method3072((byte) -127);
            int var348 = class336.field4966.method3018(566990904);
            int var349 = class336.field4966.method3072((byte) -124);
            class479.method2834(0, var348, var346, var347, var349);
            class30.field405 = null;
            return true;
        } else if (class30.field405 == class227.field3426) {
            if (class230.field3443 != null) {
                class477.method2825(-1, -1, 3, class220.field3371.field2580, false);
            }
            byte[] var350 = new byte[class305.field4527];
            class336.field4966.method2486(0, class305.field4527, var350, false);
            String var351 = class337.method2141(class305.field4527, -1969, var350, 0);
            class437.method2575(var351, true, class280.field4173, class74.field1211 == 1, 24991);
            class30.field405 = null;
            return true;
        } else if (class30.field405 == class228.field3436) {
            class66.method530(class448.field6437, 125);
            class30.field405 = null;
            return true;
        } else if (class467.field6784 == class30.field405) {
            class123.field1921 = class336.field4966.method3047((byte) -85);
            class10.field88 = class336.field4966.method3072((byte) -128) == 1;
            class30.field405 = null;
            return true;
        } else if (class30.field405 == class111.field1638) {
            int var352 = class336.field4966.method3075(113);
            int var353 = class336.field4966.method3018(566990904);
            int var354 = class336.field4966.method3081(24083);
            if (class80.method612((byte) -83, var353)) {
                if (var352 == 2) {
                    class364.method2243(-127);
                }
                class188.field2765 = var354;
                class390.method2354((byte) -118, var354);
                class198.method1343(false, -1);
                class281.method1815(class188.field2765);
                for (int var355 = 0; var355 < 100; var355++) {
                    class25.field361[var355] = true;
                }
            }
            class30.field405 = null;
            return true;
        } else if (class30.field405 == class146.field2245) {
            class66.method530(class393.field5592, 122);
            class30.field405 = null;
            return true;
        } else if (class89.field1440 == class30.field405) {
            class470.field6819 = class336.field4966.method3072((byte) -120);
            class146.field2264 = class336.field4966.method3036((byte) 99) << 3;
            class444.field6328 = class336.field4966.method3036((byte) 99) << 3;
            class30.field405 = null;
            return true;
        } else if (class513.field7462 == class30.field405) {
            int var356 = class336.field4966.method3018(566990904);
            int var357 = class336.field4966.method3018(566990904);
            int var358 = class336.field4966.method3018(566990904);
            int var359 = class336.field4966.method3018(566990904);
            if (class80.method612((byte) -44, var356) && class283.field4217[var357] != null) {
                for (int var360 = var358; var360 < var359; var360++) {
                    int var361 = class336.field4966.method3040((byte) -3);
                    if (class283.field4217[var357].length > var360 && class283.field4217[var357][var360] != null) {
                        class283.field4217[var357][var360].field2896 = var361;
                    }
                }
            }
            class30.field405 = null;
            return true;
        } else if (class30.field405 == class168.field2524) {
            String var362 = class336.field4966.method3082((byte) 44);
            int var363 = class336.field4966.method3065((byte) -128);
            int var364 = class336.field4966.method3022(-125);
            if (class80.method612((byte) -95, var363)) {
                class408.method2426(var362, (byte) -98, var364);
            }
            class30.field405 = null;
            return true;
        } else if (class30.field405 == class15.field173) {
            class127.field1991 = class336.field4966.method3044((byte) -125);
            class512.field7447 = class426.field6113;
            class30.field405 = null;
            return true;
        } else if (class439.field6249 == class30.field405) {
            class66.method530(class190.field2781, -100);
            class30.field405 = null;
            return true;
        } else if (class30.field405 == class287.field4258) {
            int var365 = class336.field4966.method3018(566990904);
            if (class80.method612((byte) -53, var365)) {
                class190.method1297((byte) 70);
            }
            class30.field405 = null;
            return true;
        } else if (class390.field5535 == class30.field405) {
            class66.method530(class368.field5309, 125);
            class30.field405 = null;
            return true;
        } else if (class30.field405 == class181.field2671) {
            int var366 = class336.field4966.method3018(566990904);
            int var367 = class336.field4966.method3072((byte) -124);
            int var368 = class336.field4966.method3072((byte) -127);
            int var369 = class336.field4966.method3018(566990904) << 0;
            int var370 = class336.field4966.method3072((byte) -122);
            int var371 = class336.field4966.method3072((byte) -125);
            if (class80.method612((byte) -108, var366)) {
                class44.method427(var370, var367, var371, true, -1, var369, var368);
            }
            class30.field405 = null;
            return true;
        } else if (class452.field6597 == class30.field405) {
            class391.method2358(class161.field2456, -126);
            class30.field405 = null;
            return false;
        } else if (class30.field405 == class254.field3761) {
            boolean var372 = class336.field4966.method3072((byte) -122) == 1;
            String var373 = class336.field4966.method3082((byte) 106);
            String var374 = var373;
            if (var372) {
                var374 = class336.field4966.method3082((byte) 75);
            }
            long var375 = (long) class336.field4966.method3018(566990904);
            long var377 = (long) class336.field4966.method3040((byte) -3);
            int var379 = class336.field4966.method3072((byte) -127);
            long var380 = (var375 << 32) + var377;
            boolean var382 = false;
            int var383 = 0;
            while (true) {
                if (var383 >= 100) {
                    if (var379 <= 1) {
                        if (!(!class10.field88 || class78.field1274) || class317.field4710) {
                            var382 = true;
                        } else if (class163.method1179(var374, (byte) 8)) {
                            var382 = true;
                        }
                    }
                    break;
                }
                if (class91.field1456[var383] == var380) {
                    var382 = true;
                    break;
                }
                var383++;
            }
            if (!var382 && class174.field2601 == 0) {
                class91.field1456[class91.field1466] = var380;
                class91.field1466 = (class91.field1466 + 1) % 100;
                String var384 = class374.method2280(class472.method2797(32767, class336.field4966), true);
                if (var379 == 2) {
                    class267.method1716(99, "<img=1>" + var374, var384, 0, "<img=1>" + var373, null, -1, 7);
                } else if (var379 == 1) {
                    class267.method1716(99, "<img=0>" + var374, var384, 0, "<img=0>" + var373, null, -1, 7);
                } else {
                    class267.method1716(99, var374, var384, 0, var373, null, -1, 3);
                }
            }
            class30.field405 = null;
            return true;
        } else if (class30.field405 == class202.field3123) {
            int var385 = class336.field4966.method3065((byte) -127);
            int var386 = class336.field4966.method3053(-129);
            class84.field1335.method1956(var385, -124, var386);
            class30.field405 = null;
            return true;
        } else if (class92.field1481 == class30.field405) {
            int var387 = class336.field4966.method3018(566990904);
            int var388 = class336.field4966.method3072((byte) -121);
            boolean var389 = (var388 & 0x1) == 1;
            class512.method2997(var389, -16937, var387);
            int var390 = class336.field4966.method3018(566990904);
            for (int var391 = 0; var391 < var390; var391++) {
                int var392 = class336.field4966.method3064(-2);
                int var393 = class336.field4966.method3060(-23438);
                if (var393 == 255) {
                    var393 = class336.field4966.method3028(-23254);
                }
                class525.method3114(var391, var387, (byte) -60, var392 - 1, var393, var389);
            }
            class280.field4170[class168.method1203(class184.field2717++, 31)] = var387;
            class30.field405 = null;
            return true;
        } else if (class30.field405 == class142.field2188) {
            for (int var394 = 0; var394 < class494.field7143.length; var394++) {
                if (class494.field7143[var394] != null) {
                    class494.field7143[var394].field274 = -1;
                }
            }
            for (int var395 = 0; var395 < class329.field4838; var395++) {
                class221.field3375[var395].field2805.field274 = -1;
            }
            class30.field405 = null;
            return true;
        } else if (class39.field815 == class30.field405) {
            int var396 = class336.field4966.method3081(24083);
            if (var396 == 65535) {
                var396 = -1;
            }
            int var397 = class336.field4966.method3028(-23254);
            int var398 = class336.field4966.method3081(24083);
            if (class80.method612((byte) -76, var398)) {
                class317.method2001(16, var397, var396);
            }
            class30.field405 = null;
            return true;
        } else if (class49.field912 == class30.field405) {
            if (class188.field2765 != -1) {
                class504.method2943(class188.field2765, (byte) -59, 0);
            }
            class30.field405 = null;
            return true;
        } else if (class525.field7667 == class30.field405) {
            int var399 = class336.field4966.method3038((byte) -110);
            int var400 = class336.field4966.method3064(-2);
            if (class80.method612((byte) -64, var400)) {
                class76.method586(0, 5, var399, 0, class497.field7188);
            }
            class30.field405 = null;
            return true;
        } else if (class475.field6925 == class30.field405) {
            class391.method2358(false, 71);
            class30.field405 = null;
            return false;
        } else if (class380.field5440 == class30.field405) {
            class66.method530(class69.field1145, 124);
            class30.field405 = null;
            return true;
        } else if (class306.field4530 == class30.field405) {
            int var401 = class336.field4966.method3064(-2);
            int var402 = class336.field4966.method3076(0);
            if (class80.method612((byte) -107, var401)) {
                class403.field5755 = var402;
            }
            class30.field405 = null;
            return true;
        } else if (class421.field5976 == class30.field405) {
            int var403 = class336.field4966.method3072((byte) -119);
            int var404 = class336.field4966.method3075(-14);
            if (var404 == 255) {
                var403 = -1;
                var404 = -1;
            }
            class233.method1548(var403, var404, -116);
            class30.field405 = null;
            return true;
        } else if (class358.field5196 == class30.field405) {
            boolean var405 = class336.field4966.method3072((byte) -124) == 1;
            byte[] var406 = new byte[class305.field4527 - 1];
            class336.field4966.method3024(class305.field4527 - 1, var406, 0, (byte) 94);
            class65.method528(110, var405, var406);
            class30.field405 = null;
            return true;
        } else if (class462.field6686 == class30.field405) {
            int var407 = class336.field4966.method3018(566990904);
            if (class80.method612((byte) -67, var407)) {
                class38.method397(-1);
            }
            class30.field405 = null;
            return true;
        } else if (class50.field915 == class30.field405) {
            String var408 = class336.field4966.method3082((byte) 108);
            int var409 = class336.field4966.method3018(566990904);
            int var410 = class336.field4966.method3018(566990904);
            if (class80.method612((byte) -97, var410)) {
                method3189(-30344, var408, var409);
            }
            class30.field405 = null;
            return true;
        } else {
            class266.method1710((byte) 81, null, "T1 - " + (class30.field405 == null ? -1 : class30.field405.method1997(0)) + "," + (class269.field4041 == null ? -1 : class269.field4041.method1997(0)) + "," + (class501.field7244 == null ? -1 : class501.field7244.method1997(0)) + " - " + class305.field4527);
            class391.method2358(false, -126);
            return true;
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(BI)Z")
    public final boolean method3184(byte arg0, int arg1) {
        field7974++;
        if (arg0 != 116) {
            method3189(-114, null, 86);
        }
        return this.field7967[arg1].field2354;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7975++;
        if (arg5 >= -120) {
            method3186(-41, 50, false, -2);
        }
        if (class465.field6763 <= arg3 && arg6 <= class176.field2630 && class424.field5996 <= arg0 && class333.field4936 >= arg2) {
            if (arg4 == 1) {
                class338.method2148(arg2, 64, arg3, arg6, arg1, arg0);
            } else {
                class228.method1529(arg6, arg4, arg2, arg0, arg3, 105, arg1);
            }
        } else if (arg4 == 1) {
            class37.method396(arg6, arg1, arg0, arg2, (byte) -42, arg3);
        } else {
            class255.method1648((byte) 99, arg4, arg3, arg1, arg6, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(IIZI)V")
    public static final void method3186(int arg0, int arg1, boolean arg2, int arg3) {
        field7971++;
        int var4 = class82.field1315 + arg0;
        int var5 = class501.field7240 + arg3;
        if (class461.field6675 == null || arg0 < 0 || arg3 < 0 || arg0 >= class69.field1139 || class255.field3763 <= arg3) {
            return;
        }
        long var6 = (long) (arg1 << 28 | var5 << 14 | var4);
        class203 var8 = (class203) class191.field2787.method2284(true, var6);
        if (var8 == null) {
            class302.method1934(arg1, arg0, arg3);
            return;
        }
        class413 var9 = (class413) var8.field3128.method863(-1);
        if (var9 == null) {
            class302.method1934(arg1, arg0, arg3);
            return;
        }
        class233 var10 = (class233) class302.method1934(arg1, arg0, arg3);
        if (var10 == null) {
            var10 = new class233();
        } else {
            var10.field3475 = var10.field3477 = -1;
        }
        var10.field3481 = var9.field5843;
        var10.field3478 = var9.field5841;
        label51: while (true) {
            class413 var11 = (class413) var8.field3128.method865(-1);
            if (var11 == null) {
                break;
            }
            if (var10.field3481 != var11.field5843) {
                var10.field3475 = var11.field5843;
                var10.field3476 = var11.field5841;
                while (true) {
                    class413 var12 = (class413) var8.field3128.method865(-1);
                    if (var12 == null) {
                        break label51;
                    }
                    if (var10.field3481 != var12.field5843 && var10.field3475 != var12.field5843) {
                        var10.field3485 = var12.field5841;
                        var10.field3477 = var12.field5843;
                    }
                }
            }
        }
        int var13 = class224.method1515((arg0 << 7) + 64, (arg3 << 7) + 64, arg1, -631749433);
        class467.method2772(arg1, arg0, arg3, var13, var10);
        if (arg2) {
            method3185(33, 20, 84, -87, 90, -121, 119);
        }
    }

    @OriginalMember(owner = "client!rw", name = "e", descriptor = "(B)Z")
    public final boolean method3187(byte arg0) {
        field7977++;
        if (this.field7967 != null) {
            return true;
        }
        if (this.field7966 == null) {
            if (!class47.field899.method2042(this.field7973, 122)) {
                return false;
            }
            int[] var2 = class47.field899.method2022((byte) 121, this.field7973);
            this.field7966 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field7966[var3] = class47.field899.method2037(var2[var3], (byte) 81, this.field7973);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field7966.length; var5++) {
            byte[] var15 = this.field7966[var5];
            int var16 = var15[1] & 0xFF | var15[0] & 0xFF << 8;
            var4 &= class28.field396.method2035(var16, (byte) -94);
        }
        if (!var4) {
            return false;
        }
        class118 var6 = new class118();
        int var7 = class47.field899.method2030(-10914, this.field7973);
        int var8 = 55 % ((31 - arg0) / 32);
        this.field7967 = new class155[var7];
        int[] var9 = class47.field899.method2022((byte) 121, this.field7973);
        for (int var10 = 0; var10 < var9.length; var10++) {
            byte[] var11 = this.field7966[var10];
            int var12 = var11[1] & 0xFF | var11[0] & 0xFF << 8;
            class251 var13 = null;
            for (class251 var14 = (class251) var6.method863(-1); var14 != null; var14 = (class251) var6.method865(-1)) {
                if (var14.field3728 == var12) {
                    var13 = var14;
                    break;
                }
            }
            if (var13 == null) {
                var13 = new class251(var12, class28.field396.method2029(var12, false));
                var6.method866((byte) 10, var13);
            }
            this.field7967[var9[var10]] = new class155(var11, var13);
        }
        this.field7966 = null;
        return true;
    }

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "(II)Z")
    public final boolean method3188(int arg0, int arg1) {
        field7969++;
        return arg1 == -1 ? this.field7967[arg0].field2369 : false;
    }

    @OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(I)V")
    public class543(int arg0) {
        this.field7973 = arg0;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(ILjava/lang/String;I)V")
    private static final void method3189(int arg0, String arg1, int arg2) {
        field7968++;
        if (arg0 != -30344) {
            field7972 = null;
        }
        class275 var3 = class213.method1433((byte) 69, 2, arg2);
        var3.method1778(0);
        var3.field4102 = arg1;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(Z)V")
    public static void method3190(boolean arg0) {
        field7972 = null;
        if (arg0) {
            field7972 = null;
        }
    }
}
