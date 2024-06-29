import java.io.IOException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class91 implements Runnable {

    @OriginalMember(owner = "client!na", name = "a", descriptor = "Z")
    public static boolean field2211 = false;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "I")
    public static int field2220 = 0;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2215 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!na", name = "l", descriptor = "Lhe;")
    public static class54 field2222 = class6.method58("Benutzeroberfl-=che geladen)3", false);

    @OriginalMember(owner = "client!na", name = "n", descriptor = "[I")
    public static int[] field2224 = new int[4000];

    @OriginalMember(owner = "client!na", name = "o", descriptor = "Lhe;")
    public static class54 field2225 = class6.method58("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", false);

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "[I")
    public static int[] field2216;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BII)I")
    public static final int method729(byte arg0, int arg1, int arg2) {
        field2221++;
        if (arg0 <= 115) {
            field2212 = 74;
        }
        class7 var3 = (class7) class63.field1524.method246((byte) 117, (long) arg1);
        if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field210.length; var5++) {
                if (var3.field218[var5] == arg2) {
                    var4 += var3.field210[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
    public static void method730(int arg0) {
        field2222 = null;
        field2224 = null;
        if (arg0 == 467836531) {
            field2216 = null;
            field2225 = null;
            field2215 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lef;II)Lce;")
    public static final class20 method731(class35 arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            method730(-25);
        }
        field2223++;
        return class133.method998(true, arg0, arg1) ? class114.method871(2640) : null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)Z")
    public static final boolean method732(byte arg0) {
        field2218++;
        if (class142.field3236 == null) {
            return false;
        }
        try {
            int var1 = class142.field3236.method1138(true);
            if (var1 == 0) {
                return false;
            }
            if (class85.field2123 == -1) {
                class142.field3236.method1135(class40.field1044.field2055, 99, 0, 1);
                class40.field1044.field2076 = 0;
                class85.field2123 = class40.field1044.method455(true);
                class128.field2890 = class137.field3148[class85.field2123];
                var1--;
            }
            if (class128.field2890 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                var1--;
                class142.field3236.method1135(class40.field1044.field2055, 25, 0, 1);
                class128.field2890 = class40.field1044.field2055[0] & 0xFF;
            }
            if (class128.field2890 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                class142.field3236.method1135(class40.field1044.field2055, 108, 0, 2);
                var1 -= 2;
                class40.field1044.field2076 = 0;
                class128.field2890 = class40.field1044.method631((byte) -106);
            }
            if (var1 < class128.field2890) {
                return false;
            }
            class40.field1044.field2076 = 0;
            class142.field3236.method1135(class40.field1044.field2055, 98, 0, class128.field2890);
            class137.field3131 = 0;
            class99.field2518 = class78.field1913;
            class78.field1913 = class80.field1965;
            class80.field1965 = class85.field2123;
            if (class85.field2123 == 30) {
                class111.field2658 = class40.field1044.method631((byte) -114) * 30;
                class85.field2123 = -1;
                class80.field1959 = class84.field2084;
                return true;
            }
            if (class85.field2123 == 187) {
                if (class39.field1016 != -1) {
                    class115.method877(0, 0, class39.field1016);
                }
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 79) {
                int var2 = class40.field1044.field2076 + class128.field2890;
                int var3 = class40.field1044.method631((byte) -99);
                int var4 = class40.field1044.method631((byte) -104);
                if (class39.field1016 != var3) {
                    class39.field1016 = var3;
                    class131.method988(class39.field1016, 0);
                    class124.method950(false, class39.field1016);
                    for (int var5 = 0; var5 < 100; var5++) {
                        class85.field2114[var5] = true;
                    }
                }
                while (var4-- > 0) {
                    int var6 = class40.field1044.method641((byte) 73);
                    int var7 = class40.field1044.method631((byte) -101);
                    int var8 = class40.field1044.method638(0);
                    class112 var9 = (class112) class63.field1530.method246((byte) 117, (long) var6);
                    if (var9 != null && var9.field2691 != var7) {
                        class44.method330(arg0 ^ 0x48, true, var9);
                        var9 = null;
                    }
                    if (var9 == null) {
                        var9 = class49.method356((byte) 102, var7, var8, var6);
                    }
                    var9.field2690 = true;
                }
                for (class112 var10 = (class112) class63.field1530.method245((byte) -117); var10 != null; var10 = (class112) class63.field1530.method244((byte) -25)) {
                    if (var10.field2690) {
                        var10.field2690 = false;
                    } else {
                        class44.method330(95, true, var10);
                    }
                }
                class129.field2900 = new class32(512);
                while (class40.field1044.field2076 < var2) {
                    int var11 = class40.field1044.method641((byte) 73);
                    int var12 = class40.field1044.method631((byte) -122);
                    int var13 = class40.field1044.method631((byte) -117);
                    int var14 = class40.field1044.method641((byte) 73);
                    for (int var15 = var12; var15 <= var13; var15++) {
                        long var16 = ((long) var11 << 32) + (long) var15;
                        class129.field2900.method241(new class108(var14), var16, false);
                    }
                }
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 61 || class85.field2123 == 208 || class85.field2123 == 239 || class85.field2123 == 26 || class85.field2123 == 186 || class85.field2123 == 218 || class85.field2123 == 39 || class85.field2123 == 112 || class85.field2123 == 140 || class85.field2123 == 16 || class85.field2123 == 17) {
                class19.method157(arg0 - 155);
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 190) {
                class53.method374((byte) -78);
                int var18 = class40.field1044.method662(32767);
                int var19 = class40.field1044.method644(false);
                int var20 = class40.field1044.method638(arg0 ^ 0x32);
                class87.field2159[var18] = var19;
                class149.field3376[var18] = var20;
                class63.field1546[var18] = 1;
                for (int var21 = 0; var21 < 98; var21++) {
                    if (var19 >= class66.field1591[var21]) {
                        class63.field1546[var18] = var21 + 2;
                    }
                }
                class79.field1932[class118.method887(31, class146.field3307++)] = var18;
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 44) {
                for (int var22 = 0; var22 < class157.field3577; var22++) {
                    class128 var23 = class72.method563(-102, var22);
                    if (var23 != null && var23.field2884 == 0) {
                        class35.field894[var22] = 0;
                        class63.field1540[var22] = 0;
                    }
                }
                class53.method374((byte) -78);
                class85.field2123 = -1;
                class150.field3392 += 32;
                return true;
            }
            if (class85.field2123 == 221) {
                class134.method1003(false, (byte) 49);
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 50) {
                long var24 = class40.field1044.method637((byte) 33);
                long var26 = (long) class40.field1044.method631((byte) -109);
                long var28 = (long) class40.field1044.method670(false);
                int var30 = class40.field1044.method638(0);
                long var31 = (var26 << 32) + var28;
                boolean var33 = false;
                for (int var34 = 0; var34 < 100; var34++) {
                    if (class34.field863[var34] == var31) {
                        var33 = true;
                        break;
                    }
                }
                if (var30 <= 1) {
                    for (int var35 = 0; var35 < class54.field1347; var35++) {
                        if (class15.field464[var35] == var24) {
                            var33 = true;
                            break;
                        }
                    }
                }
                if (!var33 && class156.field3557 == 0) {
                    class34.field863[class99.field2515] = var31;
                    class99.field2515 = (class99.field2515 + 1) % 100;
                    class54 var36 = class154.method1186(class138.method1073((byte) -83, class40.field1044).method380(false));
                    if (var30 == 2 || var30 == 3) {
                        class80.method612(var36, class143.method1105(new class54[] { class129.field2909, class135.method1011(-5, var24).method418(104) }, -842), (byte) 123, 7);
                    } else if (var30 == 1) {
                        class80.method612(var36, class143.method1105(new class54[] { class89.field2200, class135.method1011(arg0 - 55, var24).method418(106) }, -842), (byte) 122, 7);
                    } else {
                        class80.method612(var36, class135.method1011(-5, var24).method418(124), (byte) 119, 3);
                    }
                }
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 2) {
                int var37 = class40.field1044.method663(4);
                class93 var38 = class121.method938(true, var37);
                for (int var39 = 0; var39 < var38.field2280.length; var39++) {
                    var38.field2280[var39] = -1;
                    var38.field2280[var39] = 0;
                }
                class134.method1005(var38, 0);
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 254) {
                int var40 = class40.field1044.method641((byte) 73);
                int var41 = class40.field1044.method635((byte) -14);
                if (var41 == 65535) {
                    var41 = -1;
                }
                int var42 = class40.field1044.method659(-86);
                int var43 = class40.field1044.method645(arg0 - 50);
                if (var43 == 65535) {
                    var43 = -1;
                }
                for (int var44 = var43; var44 <= var41; var44++) {
                    long var45 = ((long) var40 << 32) + (long) var44;
                    class5 var47 = class129.field2900.method246((byte) 117, var45);
                    if (var47 != null) {
                        var47.method48(-315);
                    }
                    class129.field2900.method241(new class108(var42), var45, false);
                }
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 63) {
                int var48 = class40.field1044.method659(arg0 ^ 0xFFFFFFE6);
                int var49 = class40.field1044.method672(0);
                class93 var50 = class121.method938(true, var48);
                if (var50.field2311 != var49 || var49 == -1) {
                    var50.field2342 = 0;
                    var50.field2311 = var49;
                    var50.field2254 = 0;
                    class134.method1005(var50, 0);
                }
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 8) {
                int var51 = class40.field1044.method644(false);
                class93 var52 = class121.method938(true, var51);
                var52.field2238 = 3;
                var52.field2351 = class108.field2639.field642.method533(-256);
                class134.method1005(var52, 0);
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 1) {
                int var53 = class40.field1044.method663(4);
                int var54 = class40.field1044.method645(0);
                int var55 = class40.field1044.method645(0);
                int var56 = class40.field1044.method631((byte) -127);
                class93 var57 = class121.method938(true, var53);
                if (var57.field2314 != var55 || var57.field2337 != var56 || var57.field2269 != var54) {
                    var57.field2269 = var54;
                    var57.field2314 = var55;
                    var57.field2337 = var56;
                    class134.method1005(var57, 0);
                }
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 182) {
                class137.method1069(class128.field2890, class80.field1963, (byte) 20, class40.field1044);
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 9) {
                int var58 = class40.field1044.method663(4);
                int var59 = class40.field1044.method645(0);
                class93 var60 = class121.method938(true, var58);
                if (var60.field2238 != 1 || var60.field2351 != var59) {
                    var60.field2351 = var59;
                    var60.field2238 = 1;
                    class134.method1005(var60, arg0 ^ 0x32);
                }
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 72) {
                class54 var61 = class40.field1044.method634(99);
                int var62 = class40.field1044.method662(32767);
                int var63 = class40.field1044.method630(255);
                if (var62 >= 1 && var62 <= 8) {
                    if (var61.method397(class143.field3277, (byte) -105)) {
                        var61 = null;
                    }
                    class138.field3154[var62 - 1] = var61;
                    class53.field1287[var62 - 1] = var63 == 0;
                }
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 82) {
                class50.field1206 = true;
                class38.field959 = class40.field1044.method638(0);
                class139.field3189 = class40.field1044.method638(arg0 ^ 0x32);
                class86.field2138 = class40.field1044.method631((byte) -113);
                class1.field1 = class40.field1044.method638(arg0 - 50);
                class142.field3263 = class40.field1044.method638(arg0 - 50);
                if (class142.field3263 >= 100) {
                    class65.field1561 = class139.field3189 * 128 + 64;
                    class11.field315 = class38.field959 * 128 + 64;
                    class93.field2277 = class134.method1007(class11.field315, class65.field1561, true, class157.field3573) - class86.field2138;
                }
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 47) {
                int var64 = class40.field1044.method663(4);
                class54 var65 = class40.field1044.method634(114);
                class93 var66 = class121.method938(true, var64);
                if (!var65.method381(1, var66.field2251)) {
                    var66.field2251 = var65;
                    class134.method1005(var66, 0);
                }
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 142) {
                boolean var67 = class40.field1044.method662(32767) == 1;
                int var68 = class40.field1044.method663(4);
                class93 var69 = class121.method938(true, var68);
                if (var67 != var69.field2326) {
                    var69.field2326 = var67;
                    class134.method1005(var69, 0);
                }
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 40) {
                int var70 = class40.field1044.method631((byte) -108);
                int var71 = class40.field1044.method638(0);
                int var72 = class40.field1044.method631((byte) -123);
                class68.method535(var72, var70, var71, 12644);
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 74) {
                for (int var73 = 0; var73 < class48.field1148.length; var73++) {
                    if (class48.field1148[var73] != null) {
                        class48.field1148[var73].field981 = -1;
                    }
                }
                for (int var74 = 0; var74 < class111.field2679.length; var74++) {
                    if (class111.field2679[var74] != null) {
                        class111.field2679[var74].field981 = -1;
                    }
                }
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 156) {
                class57.field1436 = class40.field1044.method638(0);
                class149.field3385 = class40.field1044.method638(0);
                class48.field1147 = class40.field1044.method638(0);
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 120) {
                int var75 = class40.field1044.method641((byte) 73);
                int var76 = class40.field1044.method631((byte) -111);
                if (var75 < -70000) {
                    var76 += 32768;
                }
                class93 var77;
                if (var75 < 0) {
                    var77 = null;
                } else {
                    var77 = class121.method938(true, var75);
                }
                while (class128.field2890 > class40.field1044.field2076) {
                    int var78 = class40.field1044.method636((byte) -50);
                    int var79 = class40.field1044.method631((byte) -110);
                    int var80 = 0;
                    if (var79 != 0) {
                        var80 = class40.field1044.method638(arg0 ^ 0x32);
                        if (var80 == 255) {
                            var80 = class40.field1044.method641((byte) 73);
                        }
                    }
                    if (var77 != null && var78 >= 0 && var78 < var77.field2280.length) {
                        var77.field2280[var78] = var79;
                        var77.field2317[var78] = var80;
                    }
                    class138.method1074(var80, var79 - 1, var78, arg0 ^ 0xFFFF8B97, var76);
                }
                if (var77 != null) {
                    class134.method1005(var77, 0);
                }
                class53.method374((byte) -78);
                class2.field25[class118.method887(31, class17.field508++)] = class118.method887(var76, 32767);
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 166) {
                int var81 = class40.field1044.method631((byte) -100);
                int var82 = class40.field1044.method644(false);
                class93 var83 = class121.method938(true, var82);
                if (var83 != null && var83.field2359 == 0) {
                    if (var81 > var83.field2307 - var83.field2286) {
                        var81 = var83.field2307 - var83.field2286;
                    }
                    if (var81 < 0) {
                        var81 = 0;
                    }
                    if (var83.field2339 != var81) {
                        var83.field2339 = var81;
                        class134.method1005(var83, 0);
                    }
                }
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 245) {
                int var84 = class40.field1044.method645(0);
                byte var85 = class40.field1044.method651(-117);
                class35.field894[var84] = var85;
                if (class63.field1540[var84] != var85) {
                    class63.field1540[var84] = var85;
                    class4.method43(var84, 2);
                }
                class52.field1243[class118.method887(class150.field3392++, 31)] = var84;
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 201) {
                int var86 = class40.field1044.method674(23580);
                int var87 = class40.field1044.method674(23580);
                int var88 = class40.field1044.method659(118);
                class93 var89 = class121.method938(true, var88);
                int var90 = var89.field2330 + var87;
                int var91 = var89.field2293 + var86;
                if (var89.field2282 != var91 || var89.field2313 != var90) {
                    var89.field2313 = var90;
                    var89.field2282 = var91;
                    class134.method1005(var89, arg0 ^ 0x32);
                }
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 113) {
                class50.field1206 = true;
                class19.field550 = class40.field1044.method638(0);
                class28.field744 = class40.field1044.method638(0);
                class13.field366 = class40.field1044.method631((byte) -123);
                class34.field851 = class40.field1044.method638(arg0 - 50);
                class102.field2552 = class40.field1044.method638(0);
                if (class102.field2552 >= 100) {
                    int var92 = class19.field550 * 128 + 64;
                    int var93 = class28.field744 * 128 + 64;
                    int var94 = class134.method1007(var92, var93, true, class157.field3573) - class13.field366;
                    int var95 = var92 - class11.field315;
                    int var96 = var94 - class93.field2277;
                    int var97 = var93 - class65.field1561;
                    int var98 = (int) Math.sqrt((double) (var95 * var95 + var97 * var97));
                    class95.field2418 = (int) (Math.atan2((double) var96, (double) var98) * 325.949D) & 0x7FF;
                    class39.field1025 = (int) (Math.atan2((double) var95, (double) var97) * -325.949D) & 0x7FF;
                    if (class95.field2418 < 128) {
                        class95.field2418 = 128;
                    }
                    if (class95.field2418 > 383) {
                        class95.field2418 = 383;
                    }
                }
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 159) {
                class48.field1157 = class40.field1044.method661((byte) 76);
                class129.field2914 = class40.field1044.method661((byte) 60);
                for (int var99 = class48.field1157; var99 < class48.field1157 + 8; var99++) {
                    for (int var100 = class129.field2914; var100 < class129.field2914 + 8; var100++) {
                        if (class77.field1878[class157.field3573][var99][var100] != null) {
                            class77.field1878[class157.field3573][var99][var100] = null;
                            class124.method951(var100, var99, arg0 ^ 0x72);
                        }
                    }
                }
                for (class43 var101 = (class43) class120.field2789.method979(-125); var101 != null; var101 = (class43) class120.field2789.method983(18485)) {
                    if (class48.field1157 <= var101.field1102 && var101.field1102 < class48.field1157 + 8 && class129.field2914 <= var101.field1099 && class129.field2914 + 8 > var101.field1099 && class157.field3573 == var101.field1110) {
                        var101.field1103 = 0;
                    }
                }
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 168) {
                int var102 = class40.field1044.method635((byte) -74);
                class32.method248(var102, (byte) 58);
                class2.field25[class118.method887(class17.field508++, 31)] = class118.method887(var102, 32767);
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 99) {
                class50.field1206 = false;
                for (int var103 = 0; var103 < 5; var103++) {
                    class6.field181[var103] = false;
                }
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 174) {
                class103.method806(-21432);
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 152) {
                class18.field528 = class40.field1044.method638(0);
                class3.field60 = class84.field2084;
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 237) {
                int var104 = class40.field1044.method630(255);
                int var105 = class40.field1044.method662(arg0 + 32717);
                int var106 = class40.field1044.method662(32767);
                class157.field3573 = var104 >> 1;
                class108.field2639.method288(var106, (var104 & 0x1) == 1, 128, var105);
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 0) {
                int var107 = class40.field1044.method663(4);
                class118.field2764 = class80.field1963.method1128(var107, 121);
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 252) {
                class53.field1289 = class4.field138;
                long var108 = class40.field1044.method637((byte) 33);
                if (var108 == 0L) {
                    class72.field1779 = 0;
                    class85.field2123 = -1;
                    class94.field2382 = null;
                    class56.field1414 = null;
                    return true;
                }
                class94.field2382 = class135.method1011(arg0 ^ 0xFFFFFFC9, var108);
                class142.field3241 = class40.field1044.method651(62);
                int var110 = class40.field1044.method638(0);
                if (var110 == 255) {
                    class85.field2123 = -1;
                    return true;
                }
                class72.field1779 = var110;
                class51[] var111 = new class51[100];
                for (int var112 = 0; var112 < class72.field1779; var112++) {
                    var111[var112] = new class51();
                    var111[var112].field154 = class40.field1044.method637((byte) 33);
                    var111[var112].field1230 = class135.method1011(-5, var111[var112].field154);
                    var111[var112].field1224 = class40.field1044.method631((byte) -107);
                    var111[var112].field1228 = class40.field1044.method651(79);
                    if (class50.field1208 == var111[var112].field154) {
                        class57.field1431 = var111[var112].field1228;
                    }
                }
                boolean var113 = false;
                int var114 = class72.field1779;
                while (var114 > 0) {
                    var114--;
                    boolean var115 = true;
                    for (int var116 = 0; var116 < var114; var116++) {
                        if (var111[var116].field1230.method392(255, var111[var116 + 1].field1230) > 0) {
                            class51 var117 = var111[var116];
                            var111[var116] = var111[var116 + 1];
                            var111[var116 + 1] = var117;
                            var115 = false;
                        }
                    }
                    if (var115) {
                        break;
                    }
                }
                class85.field2123 = -1;
                class56.field1414 = var111;
                return true;
            }
            if (class85.field2123 == 214) {
                class48.field1157 = class40.field1044.method638(arg0 ^ 0x32);
                class129.field2914 = class40.field1044.method661((byte) 79);
                while (class128.field2890 > class40.field1044.field2076) {
                    class85.field2123 = class40.field1044.method638(arg0 ^ 0x32);
                    class19.method157(-105);
                }
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 238) {
                int var118 = class40.field1044.method663(arg0 - 46);
                int var119 = class40.field1044.method631((byte) -103);
                int var120 = class40.field1044.method630(255);
                class112 var121 = (class112) class63.field1530.method246((byte) 117, (long) var118);
                if (var121 != null) {
                    class44.method330(107, var121.field2691 != var119, var121);
                }
                class49.method356((byte) 36, var119, var120, var118);
                class85.field2123 = -1;
                return true;
            }
            if (arg0 != 50) {
                return true;
            }
            if (class85.field2123 == 173) {
                int var122 = class40.field1044.method638(arg0 ^ 0x32);
                int var123 = class40.field1044.method638(0);
                int var124 = class40.field1044.method638(0);
                int var125 = class40.field1044.method638(0);
                class6.field181[var122] = true;
                class151.field3412[var122] = var123;
                class16.field487[var122] = var124;
                class115.field2729[var122] = var125;
                class108.field2632[var122] = 0;
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 132) {
                class129.field2914 = class40.field1044.method638(0);
                class48.field1157 = class40.field1044.method638(0);
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 160) {
                class111.field2669 = class40.field1044.method638(0);
                if (class111.field2669 == 1) {
                    class17.field515 = class40.field1044.method631((byte) -125);
                }
                if (class111.field2669 >= 2 && class111.field2669 <= 6) {
                    if (class111.field2669 == 2) {
                        class18.field522 = 64;
                        class18.field531 = 64;
                    }
                    if (class111.field2669 == 3) {
                        class18.field531 = 0;
                        class18.field522 = 64;
                    }
                    if (class111.field2669 == 4) {
                        class18.field522 = 64;
                        class18.field531 = 128;
                    }
                    if (class111.field2669 == 5) {
                        class18.field522 = 0;
                        class18.field531 = 64;
                    }
                    if (class111.field2669 == 6) {
                        class18.field531 = 64;
                        class18.field522 = 128;
                    }
                    class111.field2669 = 2;
                    class149.field3387 = class40.field1044.method631((byte) -105);
                    class149.field3355 = class40.field1044.method631((byte) -111);
                    class114.field2716 = class40.field1044.method638(0);
                }
                if (class111.field2669 == 10) {
                    class32.field806 = class40.field1044.method631((byte) -119);
                }
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 77) {
                int var126 = class40.field1044.method657((byte) 96);
                class39.field1016 = var126;
                class131.method988(var126, 0);
                class124.method950(false, class39.field1016);
                for (int var127 = 0; var127 < 100; var127++) {
                    class85.field2114[var127] = true;
                }
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 233) {
                int var128 = class40.field1044.method663(4);
                int var129 = class40.field1044.method645(0);
                int var130 = class40.field1044.method657((byte) -73);
                class93 var131 = class121.method938(true, var128);
                class85.field2123 = -1;
                var131.field2346 = (var129 << 16) + var130;
                return true;
            }
            if (class85.field2123 == 100) {
                long var132 = class40.field1044.method637((byte) 33);
                int var134 = class40.field1044.method631((byte) -119);
                int var135 = class40.field1044.method638(0);
                class54 var136 = class135.method1011(arg0 - 55, var132).method418(95);
                for (int var137 = 0; var137 < class158.field3609; var137++) {
                    if (class129.field2920[var137] == var132) {
                        if (class94.field2368[var137] != var134) {
                            class94.field2368[var137] = var134;
                            if (var134 > 0) {
                                class80.method612(class143.method1105(new class54[] { var136, class44.field1126 }, arg0 ^ 0xFFFFFC84), class24.field671, (byte) 121, 5);
                            }
                            if (var134 == 0) {
                                class80.method612(class143.method1105(new class54[] { var136, class105.field2595 }, -842), class24.field671, (byte) 112, 5);
                            }
                        }
                        class66.field1583[var137] = var135;
                        var136 = null;
                        break;
                    }
                }
                boolean var138 = false;
                if (var136 != null && class158.field3609 < 200) {
                    class129.field2920[class158.field3609] = var132;
                    class40.field1054[class158.field3609] = var136;
                    class94.field2368[class158.field3609] = var134;
                    class66.field1583[class158.field3609] = var135;
                    class158.field3609++;
                }
                class3.field60 = class84.field2084;
                int var139 = class158.field3609;
                while (var139 > 0) {
                    boolean var140 = true;
                    var139--;
                    for (int var141 = 0; var141 < var139; var141++) {
                        if (class94.field2368[var141] != class123.field2828 && class94.field2368[var141 + 1] == class123.field2828 || class94.field2368[var141] == 0 && class94.field2368[var141 + 1] != 0) {
                            int var142 = class94.field2368[var141];
                            class94.field2368[var141] = class94.field2368[var141 + 1];
                            class94.field2368[var141 + 1] = var142;
                            var140 = false;
                            class54 var143 = class40.field1054[var141];
                            class40.field1054[var141] = class40.field1054[var141 + 1];
                            class40.field1054[var141 + 1] = var143;
                            long var144 = class129.field2920[var141];
                            class129.field2920[var141] = class129.field2920[var141 + 1];
                            class129.field2920[var141 + 1] = var144;
                            int var146 = class66.field1583[var141];
                            class66.field1583[var141] = class66.field1583[var141 + 1];
                            class66.field1583[var141 + 1] = var146;
                        }
                    }
                    if (var140) {
                        break;
                    }
                }
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 92) {
                int var147 = class40.field1044.method641((byte) 73);
                int var148 = class40.field1044.method631((byte) -123);
                if (var147 < -70000) {
                    var148 += 32768;
                }
                class93 var149;
                if (var147 >= 0) {
                    var149 = class121.method938(true, var147);
                } else {
                    var149 = null;
                }
                if (var149 != null) {
                    for (int var150 = 0; var150 < var149.field2280.length; var150++) {
                        var149.field2280[var150] = 0;
                        var149.field2317[var150] = 0;
                    }
                }
                class149.method1136((byte) 115, var148);
                int var151 = class40.field1044.method631((byte) -113);
                for (int var152 = 0; var152 < var151; var152++) {
                    int var153 = class40.field1044.method630(255);
                    if (var153 == 255) {
                        var153 = class40.field1044.method641((byte) 73);
                    }
                    int var154 = class40.field1044.method635((byte) -113);
                    if (var149 != null && var152 < var149.field2280.length) {
                        var149.field2280[var152] = var154;
                        var149.field2317[var152] = var153;
                    }
                    class138.method1074(var153, var154 - 1, var152, -29787, var148);
                }
                if (var149 != null) {
                    class134.method1005(var149, 0);
                }
                class53.method374((byte) -78);
                class2.field25[class118.method887(class17.field508++, 31)] = class118.method887(32767, var148);
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 114) {
                int var155 = class40.field1044.method644(false);
                int var156 = class40.field1044.method631((byte) -125);
                if (var156 == 65535) {
                    var156 = -1;
                }
                int var157 = class40.field1044.method644(false);
                class93 var158 = class121.method938(true, var157);
                if (var158.field2279) {
                    var158.field2244 = var155;
                    var158.field2327 = var156;
                    class67 var160 = class141.method1088(var156, (byte) -117);
                    var158.field2252 = var160.field1637;
                    var158.field2337 = var160.field1656;
                    var158.field2269 = var160.field1644;
                    if (var158.field2257 > 0) {
                        var158.field2269 = var158.field2269 * 32 / var158.field2257;
                    }
                    var158.field2314 = var160.field1664;
                    var158.field2249 = var160.field1671;
                    var158.field2325 = var160.field1626;
                    class134.method1005(var158, arg0 ^ 0x32);
                } else if (var156 == -1) {
                    var158.field2238 = 0;
                    class85.field2123 = -1;
                    return true;
                } else {
                    class67 var159 = class141.method1088(var156, (byte) -115);
                    var158.field2238 = 4;
                    var158.field2314 = var159.field1664;
                    var158.field2351 = var156;
                    var158.field2337 = var159.field1656;
                    var158.field2269 = var159.field1644 * 100 / var155;
                    class134.method1005(var158, 0);
                }
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 163) {
                class53.method374((byte) -78);
                class38.field953 = class40.field1044.method638(arg0 - 50);
                class80.field1959 = class84.field2084;
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 108) {
                class54 var161 = class40.field1044.method634(120);
                if (var161.method405(class34.field858, (byte) 126)) {
                    class54 var162 = var161.method408((byte) -122, 0, var161.method382(class83.field2067, (byte) 117));
                    long var163 = var162.method385((byte) -25);
                    boolean var165 = false;
                    for (int var166 = 0; var166 < class54.field1347; var166++) {
                        if (class15.field464[var166] == var163) {
                            var165 = true;
                            break;
                        }
                    }
                    if (!var165 && class156.field3557 == 0) {
                        class80.method612(class158.field3597, var162, (byte) 108, 4);
                    }
                } else if (var161.method405(class88.field2176, (byte) 127)) {
                    class54 var167 = var161.method408((byte) 19, 0, var161.method382(class83.field2067, (byte) -89));
                    long var168 = var167.method385((byte) -117);
                    boolean var170 = false;
                    for (int var171 = 0; var171 < class54.field1347; var171++) {
                        if (class15.field464[var171] == var168) {
                            var170 = true;
                            break;
                        }
                    }
                    if (!var170 && class156.field3557 == 0) {
                        class80.method612(class9.field255, var167, (byte) 122, 8);
                    }
                } else if (var161.method405(class31.field784, (byte) -6)) {
                    class54 var172 = var161.method408((byte) 32, 0, var161.method382(class83.field2067, (byte) 30));
                    long var173 = var172.method385((byte) -25);
                    boolean var175 = false;
                    for (int var176 = 0; var176 < class54.field1347; var176++) {
                        if (class15.field464[var176] == var173) {
                            var175 = true;
                            break;
                        }
                    }
                    if (!var175 && class156.field3557 == 0) {
                        class54 var177 = var161.method408((byte) -119, var161.method382(class83.field2067, (byte) -18) + 1, var161.method404(-117) - 9);
                        class80.method612(var177, var172, (byte) 125, 8);
                    }
                } else if (var161.method405(class49.field1189, (byte) 123)) {
                    class54 var178 = var161.method408((byte) -128, 0, var161.method382(class83.field2067, (byte) -74));
                    long var179 = var178.method385((byte) -49);
                    boolean var181 = false;
                    for (int var182 = 0; var182 < class54.field1347; var182++) {
                        if (class15.field464[var182] == var179) {
                            var181 = true;
                            break;
                        }
                    }
                    if (!var181 && class156.field3557 == 0) {
                        class80.method612(class24.field671, var178, (byte) 116, 10);
                    }
                } else {
                    class80.method612(var161, class24.field671, (byte) 117, 0);
                }
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 90) {
                class53.method378(arg0 ^ 0x6E75);
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 101) {
                for (int var183 = 0; var183 < class63.field1540.length; var183++) {
                    if (class63.field1540[var183] != class35.field894[var183]) {
                        class63.field1540[var183] = class35.field894[var183];
                        class4.method43(var183, 2);
                        class52.field1243[class118.method887(class150.field3392++, 31)] = var183;
                    }
                }
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 68) {
                class1.field15 = 0;
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 137) {
                int var184 = class40.field1044.method641((byte) 73);
                class112 var185 = (class112) class63.field1530.method246((byte) 117, (long) var184);
                if (var185 != null) {
                    class44.method330(arg0 ^ 0xFFFFFF8C, true, var185);
                }
                if (class93.field2242 != null) {
                    class134.method1005(class93.field2242, 0);
                    class93.field2242 = null;
                }
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 89) {
                long var186 = class40.field1044.method637((byte) 33);
                class40.field1044.method651(40);
                long var188 = class40.field1044.method637((byte) 33);
                long var190 = (long) class40.field1044.method631((byte) -102);
                long var192 = (long) class40.field1044.method670(false);
                int var194 = class40.field1044.method638(0);
                long var195 = (var190 << 32) + var192;
                boolean var197 = false;
                for (int var198 = 0; var198 < 100; var198++) {
                    if (class34.field863[var198] == var195) {
                        var197 = true;
                        break;
                    }
                }
                if (var194 <= 1) {
                    for (int var199 = 0; var199 < class54.field1347; var199++) {
                        if (class15.field464[var199] == var186) {
                            var197 = true;
                            break;
                        }
                    }
                }
                if (!var197 && class156.field3557 == 0) {
                    class34.field863[class99.field2515] = var195;
                    class99.field2515 = (class99.field2515 + 1) % 100;
                    class54 var200 = class154.method1186(class138.method1073((byte) -83, class40.field1044).method380(false));
                    if (var194 == 2 || var194 == 3) {
                        class123.method949(class143.method1105(new class54[] { class129.field2909, class135.method1011(arg0 ^ 0xFFFFFFC9, var186).method418(113) }, -842), false, 9, class135.method1011(-5, var188), var200);
                    } else if (var194 == 1) {
                        class123.method949(class143.method1105(new class54[] { class89.field2200, class135.method1011(-5, var186).method418(90) }, arg0 ^ 0xFFFFFC84), false, 9, class135.method1011(arg0 - 55, var188), var200);
                    } else {
                        class123.method949(class135.method1011(-5, var186).method418(arg0 + 43), false, 9, class135.method1011(arg0 ^ 0xFFFFFFC9, var188), var200);
                    }
                }
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 5) {
                int var201 = class40.field1044.method635((byte) -93);
                if (var201 == 65535) {
                    var201 = -1;
                }
                class58.method465((byte) 106, var201);
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 86) {
                int var202 = class40.field1044.method670(false);
                int var203 = class40.field1044.method645(0);
                if (var203 == 65535) {
                    var203 = -1;
                }
                class87.method695(false, var203, var202);
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 69) {
                class54 var204 = class40.field1044.method634(112);
                Object[] var205 = new Object[var204.method404(arg0 - 159) + 1];
                for (int var206 = var204.method404(-118) - 1; var206 >= 0; var206--) {
                    if (var204.method413(21340, var206) == 115) {
                        var205[var206 + 1] = class40.field1044.method634(120);
                    } else {
                        var205[var206 + 1] = Integer.valueOf(class40.field1044.method641((byte) 73));
                    }
                }
                var205[0] = Integer.valueOf(class40.field1044.method641((byte) 73));
                class100 var207 = new class100();
                var207.field2522 = var205;
                class32.method242(1, var207);
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 143) {
                class75.field1866 = class40.field1044.method638(0);
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 167) {
                class77.method592(0);
                class85.field2123 = -1;
                return false;
            }
            if (class85.field2123 == 199) {
                class53.method374((byte) -78);
                class150.field3393 = class40.field1044.method660((byte) -80);
                class85.field2123 = -1;
                class80.field1959 = class84.field2084;
                return true;
            }
            if (class85.field2123 == 244) {
                int var208 = class40.field1044.method641((byte) 73);
                int var209 = class40.field1044.method645(arg0 ^ 0x32);
                int var210 = var209 >> 10 & 0x1F;
                int var211 = var209 >> 5 & 0x1F;
                int var212 = var209 & 0x1F;
                int var213 = (var210 << 19) + (var211 << 11) + (var212 << 3);
                class93 var214 = class121.method938(true, var208);
                if (var214.field2296 != var213) {
                    var214.field2296 = var213;
                    class134.method1005(var214, arg0 ^ 0x32);
                }
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 75) {
                class54.field1347 = class128.field2890 / 8;
                for (int var215 = 0; var215 < class54.field1347; var215++) {
                    class15.field464[var215] = class40.field1044.method637((byte) 33);
                }
                class85.field2123 = -1;
                class3.field60 = class84.field2084;
                return true;
            }
            if (class85.field2123 == 37) {
                int var216 = class40.field1044.method645(0);
                int var217 = class40.field1044.method644(false);
                class35.field894[var216] = var217;
                if (class63.field1540[var216] != var217) {
                    class63.field1540[var216] = var217;
                    class4.method43(var216, 2);
                }
                class52.field1243[class118.method887(31, class150.field3392++)] = var216;
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 207) {
                int var218 = class40.field1044.method657((byte) -81);
                int var219 = class40.field1044.method641((byte) 73);
                class93 var220 = class121.method938(true, var219);
                if (var220.field2238 != 2 || var220.field2351 != var218) {
                    var220.field2351 = var218;
                    var220.field2238 = 2;
                    class134.method1005(var220, 0);
                }
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 23) {
                long var221 = class40.field1044.method637((byte) 33);
                class54 var223 = class154.method1186(class138.method1073((byte) -83, class40.field1044).method380(false));
                class80.method612(var223, class135.method1011(arg0 - 55, var221).method418(119), (byte) 112, 6);
                class85.field2123 = -1;
                return true;
            }
            if (class85.field2123 == 104) {
                long var224 = class40.field1044.method637((byte) 33);
                int var226 = class40.field1044.method631((byte) -119);
                boolean var227 = false;
                if ((var224 & Long.MIN_VALUE) != 0L) {
                    var227 = true;
                }
                byte var228 = class40.field1044.method651(30);
                if (var227) {
                    if (class72.field1779 == 0) {
                        class85.field2123 = -1;
                        return true;
                    }
                    long var229 = var224 & Long.MAX_VALUE;
                    boolean var231 = false;
                    int var232;
                    for (var232 = 0; class72.field1779 > var232 && (class56.field1414[var232].field154 != var229 || class56.field1414[var232].field1224 != var226); var232++) {
                    }
                    if (var232 < class72.field1779) {
                        while (class72.field1779 - 1 > var232) {
                            class56.field1414[var232] = class56.field1414[var232 + 1];
                            var232++;
                        }
                        class56.field1414[class72.field1779] = null;
                        class72.field1779--;
                    }
                } else {
                    class51 var233 = new class51();
                    var233.field154 = var224;
                    var233.field1230 = class135.method1011(-5, var233.field154);
                    var233.field1228 = var228;
                    var233.field1224 = var226;
                    int var234;
                    for (var234 = class72.field1779 - 1; var234 >= 0; var234--) {
                        int var235 = class56.field1414[var234].field1230.method392(arg0 ^ 0xCD, var233.field1230);
                        if (var235 == 0) {
                            class56.field1414[var234].field1224 = var226;
                            class56.field1414[var234].field1228 = var228;
                            if (class50.field1208 == var224) {
                                class57.field1431 = var228;
                            }
                            class85.field2123 = -1;
                            class53.field1289 = class4.field138;
                            return true;
                        }
                        if (var235 < 0) {
                            break;
                        }
                    }
                    if (class56.field1414.length <= class72.field1779) {
                        class85.field2123 = -1;
                        return true;
                    }
                    for (int var236 = class72.field1779 - 1; var236 > var234; var236--) {
                        class56.field1414[var236 + 1] = class56.field1414[var236];
                    }
                    if (class72.field1779 == 0) {
                        class56.field1414 = new class51[100];
                    }
                    class56.field1414[var234 + 1] = var233;
                    class72.field1779++;
                    if (class50.field1208 == var224) {
                        class57.field1431 = var228;
                    }
                }
                class85.field2123 = -1;
                class53.field1289 = class4.field138;
                return true;
            }
            if (class85.field2123 == 222) {
                class134.method1003(true, (byte) 84);
                class85.field2123 = -1;
                return true;
            }
            class48.method345(null, arg0 ^ 0xFFFFFFBE, "T1 - " + class85.field2123 + "," + class78.field1913 + "," + class99.field2518 + " - " + class128.field2890);
            class77.method592(0);
        } catch (IOException var240) {
            class18.method156(arg0 - 51);
        } catch (Exception var241) {
            String var238 = "T2 - " + class85.field2123 + "," + class78.field1913 + "," + class99.field2518 + " - " + class128.field2890 + "," + (class108.field2639.field952[0] + class11.field323) + "," + (class108.field2639.field951[0] + class67.field1648) + " - ";
            for (int var239 = 0; class128.field2890 > var239 && var239 < 50; var239++) {
                var238 = var238 + class40.field1044.field2055[var239] + ",";
            }
            class48.method345(var241, -85, var238);
            class77.method592(arg0 - 50);
        }
        return true;
    }

    @OriginalMember(owner = "client!na", name = "run", descriptor = "()V")
    public final void run() {
        field2213++;
        try {
            while (true) {
                class130 var1 = class71.field1771;
                class86 var2;
                synchronized (class71.field1771) {
                    var2 = (class86) class71.field1771.method979(-122);
                }
                if (var2 == null) {
                    class50.method360(100L, 10);
                    Object var6 = class19.field568;
                    synchronized (class19.field568) {
                        if (class17.field509 <= 1) {
                            class17.field509 = 0;
                            class19.field568.notifyAll();
                            return;
                        }
                        class17.field509--;
                    }
                } else {
                    if (var2.field2135 == 0) {
                        var2.field2128.method148(var2.field2133.length, (int) var2.field154, 27463, var2.field2133);
                        class130 var4 = class71.field1771;
                        synchronized (class71.field1771) {
                            var2.method48(-315);
                        }
                    } else if (var2.field2135 == 1) {
                        var2.field2133 = var2.field2128.method152((int) var2.field154, 255);
                        class130 var3 = class71.field1771;
                        synchronized (class71.field1771) {
                            class26.field704.method976(var2, (byte) -126);
                        }
                    }
                    Object var5 = class19.field568;
                    synchronized (class19.field568) {
                        if (class17.field509 <= 1) {
                            class17.field509 = 0;
                            class19.field568.notifyAll();
                            return;
                        }
                        class17.field509 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class48.method345(var17, -101, null);
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V")
    public static final void method733(byte arg0) {
        for (class138 var1 = (class138) class83.field2039.method979(-127); var1 != null; var1 = (class138) class83.field2039.method983(18485)) {
            if (var1.field3160 != null) {
                class5.field143.method486(var1.field3160);
                var1.field3160 = null;
            }
            if (var1.field3157 != null) {
                class5.field143.method486(var1.field3157);
                var1.field3157 = null;
            }
        }
        field2219++;
        if (arg0 < 85) {
            field2224 = null;
        }
        class83.field2039.method978((byte) -97);
    }
}
