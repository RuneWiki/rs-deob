import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class174 {

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "Lsd;")
    private static class166 field3305 = class135.method935("You are standing in a members)2only area)3", 0);

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "Lsd;")
    public static class166 field3311 = class135.method935("blaugr-Un:", 0);

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "[Lsd;")
    public static class166[] field3307 = new class166[1000];

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "Lsd;")
    public static class166 field3309 = field3305;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZI)Lsd;")
    public static final class166 method1192(boolean arg0, int arg1) {
        field3312++;
        if (arg0) {
            field3309 = null;
        }
        return class192.method1280(10, false, (byte) 80, arg1);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lsd;Lsd;BLsd;)V")
    public static final void method1193(class166 arg0, class166 arg1, byte arg2, class166 arg3) {
        class12.field228 = arg3;
        class12.field222 = arg0;
        class12.field231 = arg1;
        field3306++;
        int var4 = -45 % ((arg2 - 68) / 37);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
    public static void method1194(int arg0) {
        if (arg0 != 161) {
            method1193(null, null, (byte) -70, null);
        }
        field3305 = null;
        field3309 = null;
        field3307 = null;
        field3311 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)Z")
    public static final boolean method1195(boolean arg0) {
        field3308++;
        if (class47.field861 == null) {
            return false;
        }
        try {
            int var1 = class47.field861.method16((byte) 44);
            if (var1 == 0) {
                return false;
            }
            if (class145.field2841 == -1) {
                class47.field861.method13(class179.field3377.field988, arg0, 0, 1);
                var1--;
                class179.field3377.field1000 = 0;
                class145.field2841 = class179.field3377.method704(255);
                class19.field335 = class190.field3622[class145.field2841];
            }
            if (class19.field335 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                class47.field861.method13(class179.field3377.field988, true, 0, 1);
                var1--;
                class19.field335 = class179.field3377.field988[0] & 0xFF;
            }
            if (class19.field335 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                class47.field861.method13(class179.field3377.field988, true, 0, 2);
                var1 -= 2;
                class179.field3377.field1000 = 0;
                class19.field335 = class179.field3377.method405(2);
            }
            if (class19.field335 > var1) {
                return false;
            }
            class179.field3377.field1000 = 0;
            class47.field861.method13(class179.field3377.field988, true, 0, class19.field335);
            class112.field2195 = 0;
            class64.field1327 = class162.field3088;
            class162.field3088 = class113.field2209;
            class113.field2209 = class145.field2841;
            if (class145.field2841 == 2) {
                class145.field2841 = -1;
                class16.field276 = 0;
                return true;
            }
            if (class145.field2841 == 222) {
                int var2 = class179.field3377.method405(2);
                class146.field2884 = var2;
                class143.method978(var2, (byte) 106);
                class131.method921(125, class146.field2884);
                for (int var3 = 0; var3 < 100; var3++) {
                    class30.field556[var3] = true;
                }
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 255) {
                int var4 = class179.field3377.method423((byte) -90);
                if (var4 == 65535) {
                    var4 = -1;
                }
                int var5 = class179.field3377.method405(2);
                int var6 = class179.field3377.method426((byte) -124);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var7 = class179.field3377.method419(-4);
                for (int var8 = var4; var8 <= var5; var8++) {
                    long var9 = ((long) var7 << 32) + (long) var8;
                    class130 var11 = class164.field3120.method224(-1, var9);
                    if (var11 != null) {
                        var11.method915(0);
                    }
                    class164.field3120.method216(new class39(var6), 12682, var9);
                }
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 50) {
                int var12 = class179.field3377.method430(!arg0);
                int var13 = class179.field3377.method427((byte) -112);
                class23.field400[var13] = var12;
                if (class91.field1785[var13] != var12) {
                    class91.field1785[var13] = var12;
                    class151.method1026((byte) 97, var13);
                }
                class87.field1722[class22.method151(class182.field3459++, 31)] = var13;
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 216) {
                class169.method1180(-27053);
                class10.field194 = class179.field3377.method400(255);
                class145.field2841 = -1;
                class154.field2974 = class95.field1844;
                return true;
            }
            if (class145.field2841 == 116) {
                if (class146.field2884 != -1) {
                    class166.method1120(-65, 0, class146.field2884);
                }
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 155) {
                class18.method112((byte) 105);
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 15) {
                int var14 = class179.field3377.method419(-4);
                class54 var15 = (class54) class103.field2017.method224(-1, (long) var14);
                if (var15 != null) {
                    class8.method52(var15, true, true);
                }
                if (class11.field201 != null) {
                    class68.method550(class11.field201, 15);
                    class11.field201 = null;
                }
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 153) {
                class77.field1601 = class179.field3377.method424((byte) 43);
                class23.field392 = class179.field3377.method393((byte) 25);
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 131) {
                int var16 = class179.field3377.method427((byte) -89);
                int var17 = class179.field3377.method426((byte) -54);
                int var18 = var16 >> 10 & 0x1F;
                int var19 = var16 >> 5 & 0x1F;
                int var20 = var16 & 0x1F;
                class193 var21 = class90.method701(-31355, var17);
                int var22 = (var18 << 19) + (var19 << 11) + (var20 << 3);
                if (var21.field3775 != var22) {
                    var21.field3775 = var22;
                    class68.method550(var21, 15);
                }
                class145.field2841 = -1;
                return true;
            }
            if (!arg0) {
                return false;
            }
            if (class145.field2841 == 186) {
                class25.field446 = true;
                class4.field84 = class179.field3377.method400(255);
                class160.field3074 = class179.field3377.method400(255);
                class157.field3001 = class179.field3377.method405(2);
                class132.field2571 = class179.field3377.method400(255);
                class58.field1197 = class179.field3377.method400(255);
                if (class58.field1197 >= 100) {
                    class22.field385 = class160.field3074 * 128 + 64;
                    class38.field690 = class4.field84 * 128 + 64;
                    class61.field1242 = class119.method864(class38.field690, class22.field385, class165.field3130, true) - class157.field3001;
                }
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 252) {
                int var23 = class179.field3377.method400(255);
                if (class179.field3377.method400(255) == 0) {
                    class192.field3642[var23] = new class144();
                } else {
                    class179.field3377.field1000--;
                    class192.field3642[var23] = new class144(class179.field3377);
                }
                class142.field2763 = class95.field1844;
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 212) {
                int var24 = class179.field3377.method395(-2);
                class112.field2187 = class35.field664.method653(var24, true);
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 10) {
                class25.field446 = false;
                for (int var25 = 0; var25 < 5; var25++) {
                    class29.field534[var25] = false;
                }
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 241) {
                class68.method553(class179.field3377, 0);
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 124) {
                class23.field392 = class179.field3377.method393((byte) 25);
                class77.field1601 = class179.field3377.method400(255);
                while (class19.field335 > class179.field3377.field1000) {
                    class145.field2841 = class179.field3377.method400(255);
                    class99.method743(-4);
                }
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 44) {
                long var26 = class179.field3377.method385((byte) -65);
                class179.field3377.method388(-29381);
                long var28 = class179.field3377.method385((byte) -99);
                long var30 = (long) class179.field3377.method405(2);
                long var32 = (long) class179.field3377.method422((byte) -127);
                long var34 = (var30 << 32) + var32;
                boolean var36 = false;
                int var37 = class179.field3377.method400(255);
                for (int var38 = 0; var38 < 100; var38++) {
                    if (class113.field2208[var38] == var34) {
                        var36 = true;
                        break;
                    }
                }
                if (var37 <= 1) {
                    for (int var39 = 0; var39 < class119.field2344; var39++) {
                        if (class72.field1430[var39] == var26) {
                            var36 = true;
                            break;
                        }
                    }
                }
                if (!var36 && class57.field1155 == 0) {
                    class113.field2208[class112.field2172] = var34;
                    class112.field2172 = (class112.field2172 + 1) % 100;
                    class166 var40 = class24.method164(class33.method242(class179.field3377, 32767).method1145(!arg0));
                    if (var37 == 2 || var37 == 3) {
                        class56.method467(9, class22.method148(new class166[] { class88.field1743, class191.method1278(37, var26).method1159(-94) }, 0), var40, class191.method1278(37, var28).method1159(-106), false);
                    } else if (var37 == 1) {
                        class56.method467(9, class22.method148(new class166[] { class90.field1783, class191.method1278(37, var26).method1159(-58) }, 0), var40, class191.method1278(37, var28).method1159(-64), false);
                    } else {
                        class56.method467(9, class191.method1278(37, var26).method1159(-96), var40, class191.method1278(37, var28).method1159(-121), false);
                    }
                }
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 130) {
                int var41 = class179.field3377.method419(-4);
                int var42 = class179.field3377.method402(30639);
                class193 var43 = class90.method701(-31355, var41);
                if (var43.field3802 != var42 || var42 == -1) {
                    var43.field3745 = 0;
                    var43.field3732 = 0;
                    var43.field3802 = var42;
                    class68.method550(var43, 15);
                }
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 146) {
                class91.method714(-25560);
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 16) {
                long var44 = class179.field3377.method385((byte) 73);
                long var46 = (long) class179.field3377.method405(2);
                long var48 = (long) class179.field3377.method422((byte) 117);
                boolean var50 = false;
                int var51 = class179.field3377.method400(255);
                long var52 = (var46 << 32) + var48;
                for (int var54 = 0; var54 < 100; var54++) {
                    if (class113.field2208[var54] == var52) {
                        var50 = true;
                        break;
                    }
                }
                if (var51 <= 1) {
                    for (int var55 = 0; var55 < class119.field2344; var55++) {
                        if (class72.field1430[var55] == var44) {
                            var50 = true;
                            break;
                        }
                    }
                }
                if (!var50 && class57.field1155 == 0) {
                    class113.field2208[class112.field2172] = var52;
                    class112.field2172 = (class112.field2172 + 1) % 100;
                    class166 var56 = class24.method164(class33.method242(class179.field3377, 32767).method1145(false));
                    if (var51 == 2 || var51 == 3) {
                        class150.method1023((byte) 110, 7, var56, class22.method148(new class166[] { class88.field1743, class191.method1278(37, var44).method1159(-53) }, 0));
                    } else if (var51 == 1) {
                        class150.method1023((byte) 124, 7, var56, class22.method148(new class166[] { class90.field1783, class191.method1278(37, var44).method1159(-44) }, 0));
                    } else {
                        class150.method1023((byte) 116, 3, var56, class191.method1278(37, var44).method1159(-34));
                    }
                }
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 80) {
                int var57 = class179.field3377.method427((byte) -119);
                int var58 = class179.field3377.method427((byte) -106);
                int var59 = class179.field3377.method426((byte) -113);
                class193 var60 = class90.method701(-31355, var59);
                class145.field2841 = -1;
                var60.field3763 = (var58 << 16) + var57;
                return true;
            }
            if (class145.field2841 == 115) {
                long var61 = class179.field3377.method385((byte) -112);
                int var63 = class179.field3377.method405(2);
                byte var64 = class179.field3377.method388(-29381);
                boolean var65 = false;
                if ((Long.MIN_VALUE & var61) != 0L) {
                    var65 = true;
                }
                if (var65) {
                    if (class58.field1194 == 0) {
                        class145.field2841 = -1;
                        return true;
                    }
                    long var70 = var61 & Long.MAX_VALUE;
                    boolean var72 = false;
                    int var73;
                    for (var73 = 0; class58.field1194 > var73 && (class156.field2995[var73].field2541 != var70 || class156.field2995[var73].field574 != var63); var73++) {
                    }
                    if (var73 < class58.field1194) {
                        while (class58.field1194 - 1 > var73) {
                            class156.field2995[var73] = class156.field2995[var73 + 1];
                            var73++;
                        }
                        class58.field1194--;
                        class156.field2995[class58.field1194] = null;
                    }
                } else {
                    class31 var66 = new class31();
                    var66.field2541 = var61;
                    var66.field582 = class191.method1278(37, var66.field2541);
                    var66.field574 = var63;
                    var66.field583 = var64;
                    int var67;
                    for (var67 = class58.field1194 - 1; var67 >= 0; var67--) {
                        int var68 = class156.field2995[var67].field582.method1116(var66.field582, -110);
                        if (var68 == 0) {
                            class156.field2995[var67].field574 = var63;
                            class156.field2995[var67].field583 = var64;
                            class145.field2841 = -1;
                            class167.field3224 = class95.field1844;
                            if (class42.field750 == var61) {
                                class100.field1899 = var64;
                            }
                            return true;
                        }
                        if (var68 < 0) {
                            break;
                        }
                    }
                    if (class58.field1194 >= class156.field2995.length) {
                        class145.field2841 = -1;
                        return true;
                    }
                    for (int var69 = class58.field1194 - 1; var69 > var67; var69--) {
                        class156.field2995[var69 + 1] = class156.field2995[var69];
                    }
                    if (class58.field1194 == 0) {
                        class156.field2995 = new class31[100];
                    }
                    class156.field2995[var67 + 1] = var66;
                    class58.field1194++;
                    if (class42.field750 == var61) {
                        class100.field1899 = var64;
                    }
                }
                class145.field2841 = -1;
                class167.field3224 = class95.field1844;
                return true;
            }
            if (class145.field2841 == 161) {
                int var74 = class179.field3377.method427((byte) -96);
                class97.method734(var74, (byte) 11);
                class88.field1736[class22.method151(31, class193.field3812++)] = class22.method151(var74, 32767);
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 23) {
                int var75 = class179.field3377.method405(2);
                int var76 = class179.field3377.method400(255);
                int var77 = class179.field3377.method405(2);
                class100.method746(var77, var75, var76, -51);
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 147) {
                for (int var78 = 0; var78 < class182.field3451.length; var78++) {
                    if (class182.field3451[var78] != null) {
                        class182.field3451[var78].field3543 = -1;
                    }
                }
                for (int var79 = 0; var79 < class124.field2434.length; var79++) {
                    if (class124.field2434[var79] != null) {
                        class124.field2434[var79].field3543 = -1;
                    }
                }
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 191) {
                class25.field446 = true;
                class84.field1690 = class179.field3377.method400(255);
                class114.field2220 = class179.field3377.method400(255);
                class204.field4036 = class179.field3377.method405(2);
                class31.field584 = class179.field3377.method400(255);
                class82.field1672 = class179.field3377.method400(255);
                if (class82.field1672 >= 100) {
                    int var80 = class114.field2220 * 128 + 64;
                    int var81 = class84.field1690 * 128 + 64;
                    int var82 = class119.method864(var81, var80, class165.field3130, true) - class204.field4036;
                    int var83 = var80 - class22.field385;
                    int var84 = var81 - class38.field690;
                    int var85 = var82 - class61.field1242;
                    int var86 = (int) Math.sqrt((double) (var83 * var83 + var84 * var84));
                    class143.field2786 = (int) (Math.atan2((double) var85, (double) var86) * 325.949D) & 0x7FF;
                    class159.field3046 = (int) (Math.atan2((double) var84, (double) var83) * -325.949D) & 0x7FF;
                    if (class143.field2786 < 128) {
                        class143.field2786 = 128;
                    }
                    if (class143.field2786 > 383) {
                        class143.field2786 = 383;
                    }
                }
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 88) {
                int var87 = class179.field3377.method393((byte) 25);
                int var88 = class179.field3377.method424((byte) -122);
                int var89 = class179.field3377.method424((byte) -114);
                class165.field3130 = var89 >> 1;
                class41.field728.method1242(var87, 93, (var89 & 0x1) == 1, var88);
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 254) {
                class64.method543(class19.field335, class35.field664, 9207, class179.field3377);
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 194) {
                class119.field2344 = class19.field335 / 8;
                for (int var90 = 0; var90 < class119.field2344; var90++) {
                    class72.field1430[var90] = class179.field3377.method385((byte) 114);
                    class128.field2507[var90] = class191.method1278(37, class72.field1430[var90]);
                }
                class128.field2508 = class95.field1844;
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 20) {
                class166 var91 = class179.field3377.method436((byte) -117);
                Object[] var92 = new Object[var91.method1143(true) + 1];
                for (int var93 = var91.method1143(true) - 1; var93 >= 0; var93--) {
                    if (var91.method1152(-117, var93) == 115) {
                        var92[var93 + 1] = class179.field3377.method436((byte) -57);
                    } else {
                        var92[var93 + 1] = Integer.valueOf(class179.field3377.method419(-4));
                    }
                }
                var92[0] = Integer.valueOf(class179.field3377.method419(-4));
                class137 var94 = new class137();
                var94.field2668 = var92;
                class166.method1126((byte) -113, var94);
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 92) {
                int var95 = class179.field3377.method427((byte) -118);
                int var96 = class179.field3377.method430(!arg0);
                class193 var97 = class90.method701(-31355, var96);
                if (var97.field3822 != 2 || var97.field3717 != var95) {
                    var97.field3717 = var95;
                    var97.field3822 = 2;
                    class68.method550(var97, 15);
                }
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 109) {
                int var98 = class179.field3377.method395(-2);
                boolean var99 = class179.field3377.method400(255) == 1;
                class193 var100 = class90.method701(-31355, var98);
                if (var100.field3750 != var99) {
                    var100.field3750 = var99;
                    class68.method550(var100, 15);
                }
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 30) {
                int var101 = class179.field3377.method405(2);
                if (var101 == 65535) {
                    var101 = -1;
                }
                class123.method880((byte) 78, var101);
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 238) {
                int var102 = class179.field3377.method398((byte) 76);
                if (var102 == 65535) {
                    var102 = -1;
                }
                int var103 = class179.field3377.method394(23304);
                class139.method952(var102, var103, -115);
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 132) {
                int var104 = class179.field3377.method395(-2);
                int var105 = class179.field3377.method405(2);
                class193 var106 = class90.method701(-31355, var104);
                if (var106.field3822 != 1 || var106.field3717 != var105) {
                    var106.field3717 = var105;
                    var106.field3822 = 1;
                    class68.method550(var106, 15);
                }
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 24) {
                int var107 = class179.field3377.method430(!arg0);
                class193 var108 = class90.method701(-31355, var107);
                var108.field3822 = 3;
                var108.field3717 = class41.field728.field2424.method811((byte) 37);
                class68.method550(var108, 15);
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 164) {
                class169.method1173((byte) 125);
                class145.field2841 = -1;
                return false;
            }
            if (class145.field2841 == 193) {
                int var109 = class179.field3377.method400(255);
                int var110 = class179.field3377.method400(255);
                int var111 = class179.field3377.method400(255);
                int var112 = class179.field3377.method400(255);
                int var113 = class179.field3377.method405(2);
                class29.field534[var109] = true;
                class12.field233[var109] = var110;
                class200.field3961[var109] = var111;
                class204.field4034[var109] = var112;
                class48.field894[var109] = var113;
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 200) {
                long var114 = class179.field3377.method385((byte) 81);
                class166 var116 = class24.method164(class33.method242(class179.field3377, 32767).method1145(!arg0));
                class150.method1023((byte) -74, 6, var116, class191.method1278(37, var114).method1159(-47));
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 179) {
                int var117 = class179.field3377.method423((byte) -90);
                int var118 = class179.field3377.method419(-4);
                int var119 = class179.field3377.method424((byte) -53);
                class54 var120 = (class54) class103.field2017.method224(-1, (long) var118);
                if (var120 != null) {
                    class8.method52(var120, true, var120.field1023 != var117);
                }
                class199.method1307(var117, var118, var119, (byte) 97);
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 79) {
                int var121 = class179.field3377.method419(-4);
                int var122 = class179.field3377.method405(2);
                if (var121 < -70000) {
                    var122 += 32768;
                }
                class193 var123;
                if (var121 >= 0) {
                    var123 = class90.method701(-31355, var121);
                } else {
                    var123 = null;
                }
                while (class179.field3377.field1000 < class19.field335) {
                    int var124 = class179.field3377.method425(-21462);
                    int var125 = class179.field3377.method405(2);
                    int var126 = 0;
                    if (var125 != 0) {
                        var126 = class179.field3377.method400(255);
                        if (var126 == 255) {
                            var126 = class179.field3377.method419(-4);
                        }
                    }
                    if (var123 != null && var124 >= 0 && var123.field3755.length > var124) {
                        var123.field3755[var124] = var125;
                        var123.field3760[var124] = var126;
                    }
                    class169.method1181(1, var125 - 1, var124, var126, var122);
                }
                if (var123 != null) {
                    class68.method550(var123, 15);
                }
                class169.method1180(-27053);
                class88.field1736[class22.method151(class193.field3812++, 31)] = class22.method151(32767, var122);
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 57) {
                class31.field573 = class179.field3377.method400(255);
                class128.field2513 = class179.field3377.method400(255);
                class115.field2240 = class179.field3377.method400(255);
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 1) {
                int var127 = class179.field3377.method430(!arg0);
                class166 var128 = class179.field3377.method436((byte) -127);
                class193 var129 = class90.method701(-31355, var127);
                if (!var128.method1138(var129.field3759, (byte) 120)) {
                    var129.field3759 = var128;
                    class68.method550(var129, 15);
                }
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 173) {
                class167.field3224 = class95.field1844;
                long var130 = class179.field3377.method385((byte) 82);
                if (var130 == 0L) {
                    class11.field198 = null;
                    class14.field254 = null;
                    class145.field2841 = -1;
                    class156.field2995 = null;
                    class58.field1194 = 0;
                    return true;
                }
                long var132 = class179.field3377.method385((byte) 71);
                class14.field254 = class191.method1278(37, var132);
                class11.field198 = class191.method1278(37, var130);
                class157.field3004 = class179.field3377.method388(-29381);
                int var134 = class179.field3377.method400(255);
                if (var134 == 255) {
                    class145.field2841 = -1;
                    return true;
                }
                class58.field1194 = var134;
                class31[] var135 = new class31[100];
                for (int var136 = 0; var136 < class58.field1194; var136++) {
                    var135[var136] = new class31();
                    var135[var136].field2541 = class179.field3377.method385((byte) -111);
                    var135[var136].field582 = class191.method1278(37, var135[var136].field2541);
                    var135[var136].field574 = class179.field3377.method405(2);
                    var135[var136].field583 = class179.field3377.method388(-29381);
                    if (class42.field750 == var135[var136].field2541) {
                        class100.field1899 = var135[var136].field583;
                    }
                }
                boolean var137 = false;
                int var138 = class58.field1194;
                while (var138 > 0) {
                    boolean var139 = true;
                    var138--;
                    for (int var140 = 0; var140 < var138; var140++) {
                        if (var135[var140].field582.method1116(var135[var140 + 1].field582, -115) > 0) {
                            class31 var141 = var135[var140];
                            var139 = false;
                            var135[var140] = var135[var140 + 1];
                            var135[var140 + 1] = var141;
                        }
                    }
                    if (var139) {
                        break;
                    }
                }
                class145.field2841 = -1;
                class156.field2995 = var135;
                return true;
            }
            if (class145.field2841 == 159) {
                int var142 = class179.field3377.method440((byte) -66);
                int var143 = class179.field3377.method395(-2);
                int var144 = class179.field3377.method402(30639);
                class193 var145 = class90.method701(-31355, var143);
                int var146 = var145.field3803 + var142;
                int var147 = var145.field3699 + var144;
                if (var145.field3695 != var146 || var145.field3767 != var147) {
                    var145.field3767 = var147;
                    var145.field3695 = var146;
                    class68.method550(var145, 15);
                }
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 69 || class145.field2841 == 22 || class145.field2841 == 172 || class145.field2841 == 148 || class145.field2841 == 175 || class145.field2841 == 114 || class145.field2841 == 204 || class145.field2841 == 157 || class145.field2841 == 39 || class145.field2841 == 64 || class145.field2841 == 83) {
                class99.method743(-4);
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 71) {
                int var148 = class179.field3377.method426((byte) -22);
                int var149 = class179.field3377.method398((byte) 58);
                int var150 = class179.field3377.method423((byte) -90);
                int var151 = class179.field3377.method423((byte) -90);
                class193 var152 = class90.method701(-31355, var148);
                if (var152.field3709 != var150 || var152.field3764 != var149 || var152.field3831 != var151) {
                    var152.field3764 = var149;
                    var152.field3831 = var151;
                    var152.field3709 = var150;
                    class68.method550(var152, 15);
                }
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 96) {
                byte var153 = class179.field3377.method416((byte) 127);
                int var154 = class179.field3377.method398((byte) 127);
                class23.field400[var154] = var153;
                if (class91.field1785[var154] != var153) {
                    class91.field1785[var154] = var153;
                    class151.method1026((byte) 98, var154);
                }
                class87.field1722[class22.method151(31, class182.field3459++)] = var154;
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 18) {
                class169.method1180(-27053);
                class42.field744 = class179.field3377.method421((byte) 87);
                class154.field2974 = class95.field1844;
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 145) {
                int var155 = class179.field3377.method430(false);
                class193 var156 = class90.method701(-31355, var155);
                for (int var157 = 0; var157 < var156.field3755.length; var157++) {
                    var156.field3755[var157] = -1;
                    var156.field3755[var157] = 0;
                }
                class68.method550(var156, 15);
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 230) {
                class77.field1601 = class179.field3377.method424((byte) -93);
                class23.field392 = class179.field3377.method433((byte) -116);
                for (int var158 = class77.field1601; var158 < class77.field1601 + 8; var158++) {
                    for (int var159 = class23.field392; var159 < class23.field392 + 8; var159++) {
                        if (class111.field2144[class165.field3130][var158][var159] != null) {
                            class111.field2144[class165.field3130][var158][var159] = null;
                            class121.method870(var159, -99999999, var158);
                        }
                    }
                }
                for (class46 var160 = (class46) class32.field588.method1109((byte) -99); var160 != null; var160 = (class46) class32.field588.method1115((byte) 51)) {
                    if (var160.field828 >= class77.field1601 && class77.field1601 + 8 > var160.field828 && class23.field392 <= var160.field826 && var160.field826 < class23.field392 + 8 && class165.field3130 == var160.field825) {
                        var160.field817 = 0;
                    }
                }
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 7) {
                int var161 = class179.field3377.method419(-4);
                int var162 = class179.field3377.method405(2);
                class193 var163 = class90.method701(-31355, var161);
                if (var163 != null && var163.field3797 == 0) {
                    if (var163.field3741 - var163.field3768 < var162) {
                        var162 = var163.field3741 - var163.field3768;
                    }
                    if (var162 < 0) {
                        var162 = 0;
                    }
                    if (var163.field3739 != var162) {
                        var163.field3739 = var162;
                        class68.method550(var163, 15);
                    }
                }
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 68) {
                class67.field1366 = class179.field3377.method400(255);
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 228) {
                for (int var164 = 0; var164 < class171.field3281; var164++) {
                    class97 var165 = class70.method566((byte) 50, var164);
                    if (var165 != null && var165.field1860 == 0) {
                        class23.field400[var164] = 0;
                        class91.field1785[var164] = 0;
                    }
                }
                class169.method1180(-27053);
                class145.field2841 = -1;
                class182.field3459 += 32;
                return true;
            }
            if (class145.field2841 == 188) {
                class106.field2074 = class179.field3377.method427((byte) -90) * 30;
                class154.field2974 = class95.field1844;
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 217) {
                class169.field3240 = class179.field3377.method400(255);
                class145.field2841 = -1;
                class128.field2508 = class95.field1844;
                return true;
            }
            if (class145.field2841 == 47) {
                class31.method234(-1832, true);
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 110) {
                for (int var166 = 0; var166 < class91.field1785.length; var166++) {
                    if (class91.field1785[var166] != class23.field400[var166]) {
                        class91.field1785[var166] = class23.field400[var166];
                        class151.method1026((byte) 108, var166);
                        class87.field1722[class22.method151(31, class182.field3459++)] = var166;
                    }
                }
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 167) {
                class166 var167 = class179.field3377.method436((byte) 127);
                if (var167.method1153(class95.field1837, 21194)) {
                    class166 var187 = var167.method1121(10876, var167.method1137(-1, class141.field2738), 0);
                    boolean var188 = false;
                    long var189 = var187.method1133((byte) 30);
                    for (int var191 = 0; var191 < class119.field2344; var191++) {
                        if (class72.field1430[var191] == var189) {
                            var188 = true;
                            break;
                        }
                    }
                    if (!var188 && class57.field1155 == 0) {
                        class150.method1023((byte) 115, 4, class89.field1750, var187);
                    }
                } else if (var167.method1153(class49.field912, 21194)) {
                    boolean var182 = false;
                    class166 var183 = var167.method1121(10876, var167.method1137(-1, class141.field2738), 0);
                    long var184 = var183.method1133((byte) 30);
                    for (int var186 = 0; var186 < class119.field2344; var186++) {
                        if (class72.field1430[var186] == var184) {
                            var182 = true;
                            break;
                        }
                    }
                    if (!var182 && class57.field1155 == 0) {
                        class150.method1023((byte) -44, 8, class23.field389, var183);
                    }
                } else if (var167.method1153(class2.field15, 21194)) {
                    class166 var176 = var167.method1121(10876, var167.method1137(-1, class141.field2738), 0);
                    long var177 = var176.method1133((byte) 30);
                    boolean var179 = false;
                    for (int var180 = 0; var180 < class119.field2344; var180++) {
                        if (class72.field1430[var180] == var177) {
                            var179 = true;
                            break;
                        }
                    }
                    if (!var179 && class57.field1155 == 0) {
                        class166 var181 = var167.method1121(10876, var167.method1143(arg0) - 9, var167.method1137(-1, class141.field2738) + 1);
                        class150.method1023((byte) -25, 8, var181, var176);
                    }
                } else if (var167.method1153(class113.field2203, 21194)) {
                    boolean var171 = false;
                    class166 var172 = var167.method1121(10876, var167.method1137(-1, class141.field2738), 0);
                    long var173 = var172.method1133((byte) 30);
                    for (int var175 = 0; var175 < class119.field2344; var175++) {
                        if (class72.field1430[var175] == var173) {
                            var171 = true;
                            break;
                        }
                    }
                    if (!var171 && class57.field1155 == 0) {
                        class150.method1023((byte) 115, 10, class196.field3891, var172);
                    }
                } else if (var167.method1153(class63.field1314, 21194)) {
                    class166 var170 = var167.method1121(10876, var167.method1137(-1, class63.field1314), 0);
                    class150.method1023((byte) -74, 11, var170, class196.field3891);
                } else if (var167.method1153(class151.field2935, 21194)) {
                    class166 var169 = var167.method1121(10876, var167.method1137(-1, class151.field2935), 0);
                    if (class57.field1155 == 0) {
                        class150.method1023((byte) -114, 12, var169, class196.field3891);
                    }
                } else if (var167.method1153(class48.field892, 21194)) {
                    class166 var168 = var167.method1121(10876, var167.method1137(-1, class48.field892), 0);
                    if (class57.field1155 == 0) {
                        class150.method1023((byte) -16, 13, var168, class196.field3891);
                    }
                } else {
                    class150.method1023((byte) 107, 0, var167, class196.field3891);
                }
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 224) {
                class169.method1180(-27053);
                int var192 = class179.field3377.method395(-2);
                int var193 = class179.field3377.method400(255);
                int var194 = class179.field3377.method424((byte) 76);
                class12.field238[var194] = var192;
                class135.field2609[var194] = var193;
                class60.field1231[var194] = 1;
                for (int var195 = 0; var195 < 98; var195++) {
                    if (class23.field390[var195] <= var192) {
                        class60.field1231[var194] = var195 + 2;
                    }
                }
                class56.field1056[class22.method151(31, class89.field1755++)] = var194;
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 27) {
                int var196 = class179.field3377.field1000 + class19.field335;
                int var197 = class179.field3377.method405(2);
                int var198 = class179.field3377.method405(2);
                if (class146.field2884 != var197) {
                    class146.field2884 = var197;
                    class143.method978(class146.field2884, (byte) 106);
                    class131.method921(124, class146.field2884);
                    for (int var199 = 0; var199 < 100; var199++) {
                        class30.field556[var199] = true;
                    }
                }
                while (var198-- > 0) {
                    int var200 = class179.field3377.method419(-4);
                    int var201 = class179.field3377.method405(2);
                    int var202 = class179.field3377.method400(255);
                    class54 var203 = (class54) class103.field2017.method224(-1, (long) var200);
                    if (var203 != null && var203.field1023 != var201) {
                        class8.method52(var203, true, true);
                        var203 = null;
                    }
                    if (var203 == null) {
                        var203 = class199.method1307(var201, var200, var202, (byte) 125);
                    }
                    var203.field1020 = true;
                }
                for (class54 var204 = (class54) class103.field2017.method221(0); var204 != null; var204 = (class54) class103.field2017.method222(-107)) {
                    if (var204.field1020) {
                        var204.field1020 = false;
                    } else {
                        class8.method52(var204, arg0, true);
                    }
                }
                class164.field3120 = new class29(512);
                while (class179.field3377.field1000 < var196) {
                    int var205 = class179.field3377.method419(-4);
                    int var206 = class179.field3377.method405(2);
                    int var207 = class179.field3377.method405(2);
                    int var208 = class179.field3377.method419(-4);
                    for (int var209 = var206; var209 <= var207; var209++) {
                        long var210 = ((long) var205 << 32) + ((long) var209);
                        class164.field3120.method216(new class39(var208), 12682, var210);
                    }
                }
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 169) {
                class31.method234(-1832, false);
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 129) {
                long var212 = class179.field3377.method385((byte) -108);
                int var214 = class179.field3377.method405(2);
                int var215 = class179.field3377.method400(255);
                class166 var216 = class191.method1278(37, var212).method1159(-82);
                for (int var217 = 0; var217 < class189.field3609; var217++) {
                    if (class154.field2964[var217] == var212) {
                        if (class121.field2374[var217] != var214) {
                            class121.field2374[var217] = var214;
                            if (var214 > 0) {
                                class150.method1023((byte) -25, 5, class22.method148(new class166[] { var216, class35.field655 }, 0), class196.field3891);
                            }
                            if (var214 == 0) {
                                class150.method1023((byte) -24, 5, class22.method148(new class166[] { var216, class84.field1688 }, 0), class196.field3891);
                            }
                        }
                        var216 = null;
                        class97.field1857[var217] = var215;
                        break;
                    }
                }
                if (var216 != null && class189.field3609 < 200) {
                    class154.field2964[class189.field3609] = var212;
                    class127.field2500[class189.field3609] = var216;
                    class121.field2374[class189.field3609] = var214;
                    class97.field1857[class189.field3609] = var215;
                    class189.field3609++;
                }
                boolean var218 = false;
                class128.field2508 = class95.field1844;
                int var219 = class189.field3609;
                while (var219 > 0) {
                    var219--;
                    boolean var220 = true;
                    for (int var221 = 0; var221 < var219; var221++) {
                        if (class121.field2374[var221] != class106.field2071 && class121.field2374[var221 + 1] == class106.field2071 || class121.field2374[var221] == 0 && class121.field2374[var221 + 1] != 0) {
                            var220 = false;
                            int var222 = class121.field2374[var221];
                            class121.field2374[var221] = class121.field2374[var221 + 1];
                            class121.field2374[var221 + 1] = var222;
                            class166 var223 = class127.field2500[var221];
                            class127.field2500[var221] = class127.field2500[var221 + 1];
                            class127.field2500[var221 + 1] = var223;
                            long var224 = class154.field2964[var221];
                            class154.field2964[var221] = class154.field2964[var221 + 1];
                            class154.field2964[var221 + 1] = var224;
                            int var226 = class97.field1857[var221];
                            class97.field1857[var221] = class97.field1857[var221 + 1];
                            class97.field1857[var221 + 1] = var226;
                        }
                    }
                    if (var220) {
                        break;
                    }
                }
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 225) {
                int var227 = class179.field3377.method393((byte) 25);
                class166 var228 = class179.field3377.method436((byte) 119);
                int var229 = class179.field3377.method393((byte) 25);
                if (var227 >= 1 && var227 <= 8) {
                    if (var228.method1146((byte) -119, class43.field782)) {
                        var228 = null;
                    }
                    class196.field3901[var227 - 1] = var228;
                    class113.field2196[var227 - 1] = var229 == 0;
                }
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 89) {
                class180.field3411 = class179.field3377.method400(255);
                if (class180.field3411 == 1) {
                    class103.field2023 = class179.field3377.method405(2);
                }
                if (class180.field3411 >= 2 && class180.field3411 <= 6) {
                    if (class180.field3411 == 2) {
                        class35.field659 = 64;
                        class187.field3577 = 64;
                    }
                    if (class180.field3411 == 3) {
                        class187.field3577 = 64;
                        class35.field659 = 0;
                    }
                    if (class180.field3411 == 4) {
                        class35.field659 = 128;
                        class187.field3577 = 64;
                    }
                    if (class180.field3411 == 5) {
                        class187.field3577 = 0;
                        class35.field659 = 64;
                    }
                    if (class180.field3411 == 6) {
                        class35.field659 = 64;
                        class187.field3577 = 128;
                    }
                    class180.field3411 = 2;
                    class88.field1742 = class179.field3377.method405(2);
                    class43.field776 = class179.field3377.method405(2);
                    class31.field578 = class179.field3377.method400(255);
                }
                if (class180.field3411 == 10) {
                    class81.field1656 = class179.field3377.method405(2);
                }
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 181) {
                int var230 = class179.field3377.method419(-4);
                int var231 = class179.field3377.method405(2);
                if (var231 == 65535) {
                    var231 = -1;
                }
                int var232 = class179.field3377.method430(false);
                class193 var233 = class90.method701(-31355, var230);
                if (var233.field3841) {
                    var233.field3726 = var231;
                    var233.field3819 = var232;
                    class57 var234 = class3.method19(var231, true);
                    var233.field3764 = var234.field1140;
                    var233.field3730 = var234.field1139;
                    var233.field3718 = var234.field1117;
                    var233.field3747 = var234.field1159;
                    var233.field3709 = var234.field1156;
                    var233.field3831 = var234.field1175;
                    if (var233.field3705 > 0) {
                        var233.field3831 = var233.field3831 * 32 / var233.field3705;
                    }
                    class68.method550(var233, 15);
                } else if (var231 == -1) {
                    var233.field3822 = 0;
                    class145.field2841 = -1;
                    return true;
                } else {
                    class57 var235 = class3.method19(var231, true);
                    var233.field3831 = var235.field1175 * 100 / var232;
                    var233.field3709 = var235.field1156;
                    var233.field3764 = var235.field1140;
                    var233.field3822 = 4;
                    var233.field3717 = var231;
                    class68.method550(var233, 15);
                }
                class145.field2841 = -1;
                return true;
            }
            if (class145.field2841 == 43) {
                int var236 = class179.field3377.method419(-4);
                int var237 = class179.field3377.method405(2);
                if (var236 < -70000) {
                    var237 += 32768;
                }
                class193 var238;
                if (var236 >= 0) {
                    var238 = class90.method701(-31355, var236);
                } else {
                    var238 = null;
                }
                if (var238 != null) {
                    for (int var239 = 0; var239 < var238.field3755.length; var239++) {
                        var238.field3755[var239] = 0;
                        var238.field3760[var239] = 0;
                    }
                }
                class159.method1075(-25527, var237);
                int var240 = class179.field3377.method405(2);
                for (int var241 = 0; var241 < var240; var241++) {
                    int var242 = class179.field3377.method393((byte) 25);
                    if (var242 == 255) {
                        var242 = class179.field3377.method419(-4);
                    }
                    int var243 = class179.field3377.method427((byte) -115);
                    if (var238 != null && var238.field3755.length > var241) {
                        var238.field3755[var241] = var243;
                        var238.field3760[var241] = var242;
                    }
                    class169.method1181(1, var243 - 1, var241, var242, var237);
                }
                if (var238 != null) {
                    class68.method550(var238, 15);
                }
                class169.method1180(-27053);
                class88.field1736[class22.method151(31, class193.field3812++)] = class22.method151(32767, var237);
                class145.field2841 = -1;
                return true;
            }
            class32.method238((byte) -65, null, "T1 - " + class145.field2841 + "," + class162.field3088 + "," + class64.field1327 + " - " + class19.field335);
            class169.method1173((byte) 12);
        } catch (IOException var247) {
            class10.method58(true);
        } catch (Exception var248) {
            String var245 = "T2 - " + class145.field2841 + "," + class162.field3088 + "," + class64.field1327 + " - " + class19.field335 + "," + (class41.field728.field3554[0] + class170.field3279) + "," + (class147.field2901 + class41.field728.field3521[0]) + " - ";
            for (int var246 = 0; var246 < class19.field335 && var246 < 50; var246++) {
                var245 = var245 + class179.field3377.field988[var246] + ",";
            }
            class32.method238((byte) -65, var248, var245);
            class169.method1173((byte) 108);
        }
        return true;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
    public static final void method1196(int arg0) {
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
        System.exit(1);
        if (arg0 <= 38) {
            method1195(true);
        }
        field3310++;
    }
}
