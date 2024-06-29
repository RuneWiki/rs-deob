import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class173 extends class27 {

    @OriginalMember(owner = "client!kh", name = "N", descriptor = "I")
    private int field2495 = 0;

    @OriginalMember(owner = "client!kh", name = "K", descriptor = "I")
    private int field2492 = 4096;

    @OriginalMember(owner = "client!kh", name = "L", descriptor = "Ljava/lang/String;")
    public static String field2493 = "Choose Option";

    @OriginalMember(owner = "client!kh", name = "Q", descriptor = "[Ljava/lang/String;")
    public static String[] field2498 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!kh", name = "P", descriptor = "I")
    public static int field2497 = 2;

    @OriginalMember(owner = "client!kh", name = "V", descriptor = "I")
    public static int field2503 = 0;

    @OriginalMember(owner = "client!kh", name = "M", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!kh", name = "O", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!kh", name = "R", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!kh", name = "S", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!kh", name = "T", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!kh", name = "U", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!kh", name = "W", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!kh", name = "X", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!kh", name = "Y", descriptor = "[Lwi;")
    public static class234[] field2506;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(II)Z", line = 6)
    public static final boolean method1213(int arg0, int arg1) {
        field2505++;
        if (arg0 == 24815) {
            return arg1 == 4 || arg1 == 8;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILsb;I)V", line = 18)
    public final void method23(int arg0, class190 arg1, int arg2) {
        field2502++;
        if (arg2 == 0) {
            this.field2495 = arg1.method1317((byte) 90);
        } else if (arg2 == 1) {
            this.field2492 = arg1.method1317((byte) 33);
        }
        if (arg0 != -5836) {
            method1215((byte) 100);
        }
    }

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "(I)J", line = 53)
    public static final long method1214(int arg0) {
        if (arg0 != 0) {
            field2506 = (class234[]) null;
        }
        field2500++;
        return class329.field4952.method41((byte) 6);
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V", line = 2990)
    public class173() {
        super(1, true);
    }

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "(B)V", line = 80)
    public static final void method1215(byte arg0) {
        class28.field391.method458((byte) 126);
        if (arg0 != -21) {
            field2503 = 6;
        }
        field2494++;
        class291.field4405.method458((byte) -56);
        class3.field105.method458((byte) -87);
        class125.field1820.method458((byte) 108);
    }

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "(I)Z", line = 94)
    public static final boolean method1216(int arg0) throws IOException {
        field2504++;
        if (class67.field973 == null) {
            return false;
        }
        int var1 = class67.field973.method1554(-2);
        if (var1 == 0) {
            return false;
        }
        if (class54.field788 == -1) {
            class67.field973.method1552(class83.field1194.field2718, 0, 1, (byte) 33);
            var1--;
            class83.field1194.field2776 = 0;
            class54.field788 = class83.field1194.method1908((byte) -106);
            class358.field5481 = class321.field4844[class54.field788];
        }
        if (class358.field5481 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class67.field973.method1552(class83.field1194.field2718, 0, 1, (byte) 33);
            class358.field5481 = class83.field1194.field2718[0] & 0xFF;
            var1--;
        }
        if (class358.field5481 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class67.field973.method1552(class83.field1194.field2718, 0, 2, (byte) 33);
            class83.field1194.field2776 = 0;
            class358.field5481 = class83.field1194.method1317((byte) 88);
        }
        if (var1 < class358.field5481) {
            return false;
        }
        class83.field1194.field2776 = 0;
        class67.field973.method1552(class83.field1194.field2718, 0, class358.field5481, (byte) 33);
        class194.field2820 = class20.field319;
        class360.field5688 = 0;
        class20.field319 = class300.field4483;
        class300.field4483 = class54.field788;
        if (class54.field788 == 45) {
            int var2 = class83.field1194.method1359((byte) -102);
            int var3 = class83.field1194.method1350(0);
            if (class149.method1057(4680, var3)) {
                int var4 = 0;
                if (class1.field55.field3445 != null) {
                    var4 = class1.field55.field3445.method1880(false);
                }
                class15.method85(var4, var2, 3, -1, (byte) -93);
            }
            class54.field788 = -1;
            return true;
        } else if (class54.field788 == 96) {
            String var371 = class83.field1194.method1329((byte) 59);
            String var372 = class29.method196(class144.method1034(512, class361.method2504((byte) 3, class83.field1194)));
            class247.method1814(var371, -1, var371, 6, 0, var372);
            class54.field788 = -1;
            return true;
        } else if (class54.field788 == 172) {
            class174.method1221(124);
            class54.field788 = -1;
            return true;
        } else if (class54.field788 == 89) {
            int var364 = class83.field1194.method1371(-4);
            int var365 = class83.field1194.method1362(255);
            int var366 = class83.field1194.method1362(255);
            if (var366 == 65535) {
                var366 = -1;
            }
            int var367 = class83.field1194.method1371(-4);
            if (class149.method1057(4680, var365)) {
                class359 var368 = class231.method1719(var367, 96);
                if (var368.field5500) {
                    class206.method1509(-81, var364, var367, var366);
                    class122 var369 = class175.method1228((byte) 54, var366);
                    class326.method2253(var369.field1774, var367, var369.field1717, var369.field1731, 8);
                    class109.method836(var369.field1786, var367, var369.field1725, -94, var369.field1752);
                } else if (var366 == -1) {
                    var368.field5623 = 0;
                    class54.field788 = -1;
                    return true;
                } else {
                    class122 var370 = class175.method1228((byte) 54, var366);
                    var368.field5609 = var370.field1774;
                    var368.field5623 = 4;
                    var368.field5517 = var370.field1731;
                    var368.field5544 = var370.field1717 * 100 / var364;
                    var368.field5595 = var366;
                    class83.method676(var368, (byte) 74);
                }
            }
            class54.field788 = -1;
            return true;
        } else if (class54.field788 == 12) {
            class355.method2468(0);
            class359.field5610 = class83.field1194.method1347((byte) 61);
            class27.field369 = class68.field989;
            class54.field788 = -1;
            return true;
        } else if (class54.field788 == 136) {
            class99.method782(0);
            class355.method2468(0);
            class54.field788 = -1;
            class190.field2777 += 32;
            return true;
        } else if (class54.field788 == 174) {
            int var5 = class83.field1194.method1338((byte) -54);
            int var6 = class83.field1194.method1365(-9);
            if (class149.method1057(4680, var5)) {
                class15.method85(2047, var6, 5, 0, (byte) -96);
            }
            class54.field788 = -1;
            return true;
        } else if (class54.field788 == 199) {
            int var7 = class83.field1194.method1317((byte) 18);
            int var8 = class83.field1194.method1319(255);
            int var9 = class83.field1194.method1319(255);
            int var10 = class83.field1194.method1317((byte) 12);
            int var11 = class83.field1194.method1319(255);
            int var12 = class83.field1194.method1319(255);
            if (class149.method1057(4680, var7)) {
                class62.method505(var9, -26453, var12, var10, true, var11, var8);
            }
            class54.field788 = -1;
            return true;
        } else if (class54.field788 == 223) {
            int var361 = class83.field1194.method1317((byte) 98);
            if (var361 == 65535) {
                var361 = -1;
            }
            int var362 = class83.field1194.method1344(15537);
            int var363 = class83.field1194.method1317((byte) 69);
            if (class149.method1057(4680, var363)) {
                class15.method85(var361, var362, 2, -1, (byte) -102);
            }
            class54.field788 = -1;
            return true;
        } else if (class54.field788 == 236) {
            int var355 = class83.field1194.method1317((byte) 116);
            int var356 = class83.field1194.method1319(255);
            int var357 = class83.field1194.method1319(255);
            int var358 = class83.field1194.method1317((byte) 33);
            int var359 = class83.field1194.method1319(255);
            int var360 = class83.field1194.method1319(255);
            if (class149.method1057(4680, var355)) {
                class112.method849(var359, (byte) 109, var358, var360, var356, var357);
            }
            class54.field788 = -1;
            return true;
        } else if (class54.field788 == 192) {
            int var351 = class83.field1194.method1317((byte) 46);
            if (var351 == 65535) {
                var351 = -1;
            }
            int var352 = class83.field1194.method1319(255);
            int var353 = class83.field1194.method1317((byte) 46);
            int var354 = class83.field1194.method1319(255);
            class67.method548(var351, var353, var354, (byte) 27, var352);
            class54.field788 = -1;
            return true;
        } else if (class54.field788 == 152) {
            int var13 = class83.field1194.method1319(255);
            int var14 = class83.field1194.method1362(255);
            if (class149.method1057(4680, var14)) {
                class273.field4134 = var13;
            }
            class54.field788 = -1;
            return true;
        } else {
            if (arg0 <= 60) {
                field2497 = -41;
            }
            if (class54.field788 == 198) {
                int var15 = class83.field1194.method1371(-4);
                int var16 = class83.field1194.method1317((byte) 13);
                if (var15 < -70000) {
                    var16 += 32768;
                }
                class359 var17;
                if (var15 >= 0) {
                    var17 = class231.method1719(var15, 65);
                } else {
                    var17 = null;
                }
                while (class83.field1194.field2776 < class358.field5481) {
                    int var18 = class83.field1194.method1372(-93);
                    int var19 = 0;
                    int var20 = class83.field1194.method1317((byte) 9);
                    if (var20 != 0) {
                        var19 = class83.field1194.method1319(255);
                        if (var19 == 255) {
                            var19 = class83.field1194.method1371(-4);
                        }
                    }
                    if (var17 != null && var18 >= 0 && var18 < var17.field5545.length) {
                        var17.field5545[var18] = var20;
                        var17.field5513[var18] = var19;
                    }
                    class174.method1220(var16, var18, var20 - 1, -5, var19);
                }
                if (var17 != null) {
                    class83.method676(var17, (byte) 123);
                }
                class355.method2468(0);
                class274.field4155[class287.method2076(class289.field4381++, 31)] = class287.method2076(var16, 32767);
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 190) {
                int var21 = class83.field1194.method1359((byte) -115);
                int var22 = class83.field1194.method1362(255);
                int var23 = class83.field1194.method1338((byte) -54);
                if (class149.method1057(4680, var22)) {
                    class120.method895(var23, var21, (byte) 121);
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 38) {
                int var349 = class83.field1194.method1362(255);
                int var350 = class83.field1194.method1344(15537);
                class272.method1999(var350, -75, var349);
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 168) {
                int var24 = class83.field1194.method1344(15537);
                int var25 = class83.field1194.method1339((byte) -60);
                int var26 = class83.field1194.method1338((byte) -54);
                int var27 = class83.field1194.method1345(1814369736);
                if (class149.method1057(4680, var26)) {
                    class127.method941(-99, var24, var25, var27);
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 144) {
                boolean var28 = class83.field1194.method1319(255) == 1;
                String var29 = class83.field1194.method1329((byte) 59);
                String var30 = class83.field1194.method1329((byte) 59);
                int var31 = class83.field1194.method1317((byte) 62);
                int var32 = class83.field1194.method1319(255);
                boolean var33 = false;
                String var34 = "";
                if (var31 > 0) {
                    var34 = class83.field1194.method1329((byte) 59);
                    var33 = class83.field1194.method1319(255) == 1;
                }
                for (int var35 = 0; var35 < class110.field1608; var35++) {
                    if (var28) {
                        if (var30.equals(class109.field1585[var35])) {
                            class109.field1585[var35] = var29;
                            var29 = null;
                            class50.field761[var35] = var30;
                            break;
                        }
                    } else if (var29.equals(class109.field1585[var35])) {
                        if (class284.field4294[var35] != var31) {
                            class284.field4294[var35] = var31;
                            if (var31 > 0) {
                                class247.method1814("", -1, "", 5, 0, var29 + class134.field1961);
                            }
                            if (var31 == 0) {
                                class247.method1814("", -1, "", 5, 0, var29 + class56.field826);
                            }
                        }
                        var29 = null;
                        class50.field761[var35] = var30;
                        class119.field1684[var35] = var34;
                        class32.field459[var35] = var32;
                        class313.field4661[var35] = var33;
                        break;
                    }
                }
                if (var29 != null && class110.field1608 < 200) {
                    class109.field1585[class110.field1608] = var29;
                    class50.field761[class110.field1608] = var30;
                    class284.field4294[class110.field1608] = var31;
                    class119.field1684[class110.field1608] = var34;
                    class32.field459[class110.field1608] = var32;
                    class313.field4661[class110.field1608] = var33;
                    class110.field1608++;
                }
                class348.field5376 = class68.field989;
                boolean var36 = false;
                int var37 = class110.field1608;
                while (var37 > 0) {
                    boolean var38 = true;
                    var37--;
                    for (int var39 = 0; var39 < var37; var39++) {
                        if (class284.field4294[var39] != class15.field227 && class284.field4294[var39 + 1] == class15.field227 || class284.field4294[var39] == 0 && class284.field4294[var39 + 1] != 0) {
                            var38 = false;
                            int var40 = class284.field4294[var39];
                            class284.field4294[var39] = class284.field4294[var39 + 1];
                            class284.field4294[var39 + 1] = var40;
                            String var41 = class119.field1684[var39];
                            class119.field1684[var39] = class119.field1684[var39 + 1];
                            class119.field1684[var39 + 1] = var41;
                            String var42 = class109.field1585[var39];
                            class109.field1585[var39] = class109.field1585[var39 + 1];
                            class109.field1585[var39 + 1] = var42;
                            String var43 = class50.field761[var39];
                            class50.field761[var39] = class50.field761[var39 + 1];
                            class50.field761[var39 + 1] = var43;
                            int var44 = class32.field459[var39];
                            class32.field459[var39] = class32.field459[var39 + 1];
                            class32.field459[var39 + 1] = var44;
                            boolean var45 = class313.field4661[var39];
                            class313.field4661[var39] = class313.field4661[var39 + 1];
                            class313.field4661[var39 + 1] = var45;
                        }
                    }
                    if (var38) {
                        break;
                    }
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 27) {
                class180.field2586 = class83.field1194.method1319(255);
                class348.field5376 = class68.field989;
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 225) {
                int var46 = class83.field1194.method1320((byte) 56);
                int var47 = class83.field1194.method1362(255);
                int var48 = class83.field1194.method1359((byte) -76);
                if (class149.method1057(4680, var47)) {
                    class352.method2454(92, var46, var48);
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 24) {
                class302.method2131((byte) -126);
                class54.field788 = -1;
                return false;
            } else if (class54.field788 == 95) {
                int var346 = class83.field1194.method1338((byte) -54);
                byte var347 = class83.field1194.method1331(-2097152);
                int var348 = class83.field1194.method1338((byte) -54);
                if (class149.method1057(4680, var346)) {
                    class16.method96(var348, var347, 3);
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 84) {
                int var343 = class83.field1194.method1317((byte) 126);
                int var344 = class83.field1194.method1350(0);
                int var345 = class83.field1194.method1338((byte) -54);
                if (class149.method1057(4680, var345)) {
                    class307.method2159(var344, false, var343);
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 148) {
                int var340 = class83.field1194.method1319(255);
                int var341 = class83.field1194.method1319(255);
                byte var342 = class83.field1194.method1322(9813);
                if (class214.field3088 != var342) {
                    class54.field788 = -1;
                    return true;
                }
                class54.field788 = -1;
                if (var340 == 255) {
                    class358.field5478 = 0;
                    class50.field757 = false;
                    class3.field101 = 0;
                } else {
                    class358.field5478 = var341;
                    class3.field101 = var340;
                    class50.field757 = true;
                }
                return true;
            } else if (class54.field788 == 188) {
                class76.method617(13, false);
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 74) {
                boolean var324 = class83.field1194.method1319(255) == 1;
                String var325 = class83.field1194.method1329((byte) 59);
                String var326 = var325;
                if (var324) {
                    var326 = class83.field1194.method1329((byte) 59);
                }
                boolean var327 = false;
                long var328 = class83.field1194.method1311(24263);
                long var330 = (long) class83.field1194.method1317((byte) 19);
                long var332 = (long) class83.field1194.method1312(81);
                long var334 = (var330 << 32) + var332;
                int var336 = class83.field1194.method1319(255);
                int var337 = class83.field1194.method1317((byte) 64);
                int var338 = 0;
                while (true) {
                    if (var338 < 100) {
                        if (class213.field3079[var338] != var334) {
                            var338++;
                            continue;
                        }
                        var327 = true;
                        break;
                    }
                    if (var336 <= 1 && class103.method793(19, var326)) {
                        var327 = true;
                    }
                    break;
                }
                if (!var327 && class251.field3730 == 0) {
                    class213.field3079[class55.field802] = var334;
                    class55.field802 = (class55.field802 + 1) % 100;
                    String var339 = class192.method1385(31, var337).method2170((byte) -68, class83.field1194);
                    if (var336 == 2) {
                        class142.method1026(class227.method1690(32767, var328), var339, "<img=1>" + var325, var337, 0, 20, (byte) 30, "<img=1>" + var326);
                    } else if (var336 == 1) {
                        class142.method1026(class227.method1690(32767, var328), var339, "<img=0>" + var325, var337, 0, 20, (byte) 30, "<img=0>" + var326);
                    } else {
                        class142.method1026(class227.method1690(32767, var328), var339, var325, var337, 0, 20, (byte) 30, var326);
                    }
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 179) {
                class342.method2384(class358.field5481, class54.field787, 4, class83.field1194);
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 31) {
                int var321 = class83.field1194.method1338((byte) -54);
                if (var321 == 65535) {
                    var321 = -1;
                }
                int var322 = class83.field1194.method1371(-4);
                int var323 = class83.field1194.method1317((byte) 34);
                if (class149.method1057(4680, var323)) {
                    class15.method85(var321, var322, 1, -1, (byte) -91);
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 255) {
                class125.field1819 = class83.field1194.method1319(255);
                class133.field1946 = class83.field1194.method1320((byte) 48);
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 233) {
                int var49 = class83.field1194.method1350(0);
                int var50 = class83.field1194.method1317((byte) 122);
                String var51 = class83.field1194.method1329((byte) 59);
                if (class149.method1057(4680, var50)) {
                    class253.method1855(var51, var49, -59);
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 17) {
                class352.field5426 = class83.field1194.method1319(255);
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 183) {
                String var318 = class83.field1194.method1329((byte) 59);
                int var319 = class83.field1194.method1317((byte) 63);
                String var320 = class192.method1385(8, var319).method2170((byte) -68, class83.field1194);
                class142.method1026((String) null, var320, var318, var319, 0, 19, (byte) 30, var318);
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 83) {
                int var52 = class83.field1194.method1338((byte) -54);
                if (var52 == 65535) {
                    var52 = -1;
                }
                int var53 = class83.field1194.method1365(-75);
                int var54 = class83.field1194.method1317((byte) 53);
                int var55 = class83.field1194.method1359((byte) -101);
                if (var54 == 65535) {
                    var54 = -1;
                }
                int var56 = class83.field1194.method1350(0);
                if (class149.method1057(4680, var56)) {
                    for (int var57 = var54; var57 <= var52; var57++) {
                        long var58 = ((long) var53 << 32) + ((long) var57);
                        class199 var60 = (class199) class144.field2081.method1405(var58, false);
                        class199 var61;
                        if (var60 != null) {
                            var61 = new class199(var55, var60.field2904);
                            var60.method876(8);
                        } else if (var57 == -1) {
                            var61 = new class199(var55, class231.method1719(var53, 64).field5596.field2904);
                        } else {
                            var61 = new class199(var55, -1);
                        }
                        class144.field2081.method1400(var58, 119, var61);
                    }
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 34 || class54.field788 == 186 || class54.field788 == 150 || class54.field788 == 124 || class54.field788 == 137 || class54.field788 == 158 || class54.field788 == 66 || class54.field788 == 103 || class54.field788 == 235 || class54.field788 == 60 || class54.field788 == 189 || class54.field788 == 118 || class54.field788 == 91 || class54.field788 == 11) {
                class286.method2065(46);
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 53) {
                if (class124.field1809 != null) {
                    class348.method2443(-1, false, (byte) -87, -1, class135.field1971);
                }
                byte[] var62 = new byte[class358.field5481];
                class83.field1194.method1906(116, 0, var62, class358.field5481);
                String var63 = class91.method719(false, class358.field5481, var62, 0);
                if (class131.field1905 == null && class61.field890 == 3 || !class61.field887.startsWith("win") || class299.field4468) {
                    class256.method1883(108, var63, true);
                } else {
                    class2.field83 = true;
                    class252.field3765 = var63;
                    class154.field2202 = class54.field787.method480(90, var63);
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 132) {
                int var314 = class83.field1194.method1319(255);
                int var315 = var314 & 0x1F;
                int var316 = var314 >> 5;
                if (var315 == 0) {
                    class351.field5417[var316] = null;
                    class54.field788 = -1;
                    return true;
                }
                class230 var317 = new class230();
                var317.field3487 = var315;
                var317.field3490 = class83.field1194.method1319(255);
                if (var317.field3490 >= 0 && class92.field1282.length > var317.field3490) {
                    if (var317.field3487 == 1 || var317.field3487 == 10) {
                        var317.field3480 = class83.field1194.method1317((byte) 57);
                        class83.field1194.field2776 += 5;
                    } else if (var317.field3487 >= 2 && var317.field3487 <= 6) {
                        if (var317.field3487 == 2) {
                            var317.field3479 = 64;
                            var317.field3493 = 64;
                        }
                        if (var317.field3487 == 3) {
                            var317.field3479 = 0;
                            var317.field3493 = 64;
                        }
                        if (var317.field3487 == 4) {
                            var317.field3493 = 64;
                            var317.field3479 = 128;
                        }
                        if (var317.field3487 == 5) {
                            var317.field3493 = 0;
                            var317.field3479 = 64;
                        }
                        if (var317.field3487 == 6) {
                            var317.field3479 = 64;
                            var317.field3493 = 128;
                        }
                        var317.field3487 = 2;
                        var317.field3481 = class83.field1194.method1317((byte) 9);
                        var317.field3492 = class83.field1194.method1317((byte) 102);
                        var317.field3488 = class83.field1194.method1319(255);
                        var317.field3486 = class83.field1194.method1317((byte) 12);
                    }
                    var317.field3484 = class83.field1194.method1317((byte) 54);
                    if (var317.field3484 == 65535) {
                        var317.field3484 = -1;
                    }
                    class351.field5417[var316] = var317;
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 194) {
                class203.field2989 = class68.field989;
                if (class358.field5481 == 0) {
                    class54.field788 = -1;
                    class256.field3832 = 0;
                    class321.field4842 = null;
                    class132.field1942 = null;
                    class71.field1027 = null;
                    return true;
                }
                class71.field1027 = class83.field1194.method1329((byte) 59);
                boolean var302 = class83.field1194.method1319(255) == 1;
                if (var302) {
                    class83.field1194.method1329((byte) 59);
                }
                long var303 = class83.field1194.method1311(24263);
                class321.field4842 = class286.method2068(var303, (byte) 72);
                class14.field210 = class83.field1194.method1322(9813);
                int var305 = class83.field1194.method1319(255);
                if (var305 == 255) {
                    class54.field788 = -1;
                    return true;
                }
                class256.field3832 = var305;
                class148[] var306 = new class148[100];
                for (int var307 = 0; var307 < class256.field3832; var307++) {
                    var306[var307] = new class148();
                    var306[var307].field2127 = class83.field1194.method1329((byte) 59);
                    boolean var308 = class83.field1194.method1319(255) == 1;
                    if (var308) {
                        var306[var307].field2126 = class83.field1194.method1329((byte) 59);
                    } else {
                        var306[var307].field2126 = var306[var307].field2127;
                    }
                    var306[var307].field2131 = class83.field1194.method1317((byte) 81);
                    var306[var307].field2122 = class83.field1194.method1322(9813);
                    var306[var307].field2125 = class83.field1194.method1329((byte) 59);
                    if (var306[var307].field2126.equals(class1.field55.field3453)) {
                        class362.field5748 = var306[var307].field2122;
                    }
                }
                boolean var309 = false;
                int var310 = class256.field3832;
                while (var310 > 0) {
                    boolean var311 = true;
                    var310--;
                    for (int var312 = 0; var312 < var310; var312++) {
                        if (var306[var312].field2127.compareTo(var306[var312 + 1].field2127) > 0) {
                            class148 var313 = var306[var312];
                            var306[var312] = var306[var312 + 1];
                            var306[var312 + 1] = var313;
                            var311 = false;
                        }
                    }
                    if (var311) {
                        break;
                    }
                }
                class132.field1942 = var306;
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 69) {
                int var64 = class83.field1194.method1320((byte) 51);
                int var65 = class83.field1194.method1362(255);
                int var66 = class83.field1194.method1362(255);
                if (class149.method1057(4680, var66)) {
                    if (var64 == 2) {
                        class179.method1246(25593);
                    }
                    class257.field3850 = var65;
                    class51.method424(1, var65);
                    class202.method1469(false, (byte) -58);
                    class237.method1763(class257.field3850, (byte) 11);
                    for (int var67 = 0; var67 < 100; var67++) {
                        class332.field5051[var67] = true;
                    }
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 231) {
                if (class358.field5481 == 0) {
                    class9.field154 = class128.field1865;
                } else {
                    class9.field154 = class83.field1194.method1329((byte) 59);
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 216) {
                int var68 = class83.field1194.method1362(255);
                int var69 = class83.field1194.method1351(14794);
                int var70 = class83.field1194.method1350(0);
                class181 var71 = class300.field4495[var70];
                if (var71 != null) {
                    class112.method853(2047, var71, var68, var69);
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 36) {
                int var294 = class83.field1194.method1371(-4);
                int var295 = class83.field1194.method1317((byte) 41);
                class359 var296;
                if (var294 >= 0) {
                    var296 = class231.method1719(var294, 48);
                } else {
                    var296 = null;
                }
                if (var296 != null) {
                    for (int var297 = 0; var297 < var296.field5545.length; var297++) {
                        var296.field5545[var297] = 0;
                        var296.field5513[var297] = 0;
                    }
                }
                if (var294 < -70000) {
                    var295 += 32768;
                }
                class143.method1028(var295, -23404);
                int var298 = class83.field1194.method1317((byte) 60);
                for (int var299 = 0; var299 < var298; var299++) {
                    int var300 = class83.field1194.method1319(255);
                    if (var300 == 255) {
                        var300 = class83.field1194.method1344(15537);
                    }
                    int var301 = class83.field1194.method1362(255);
                    if (var296 != null && var296.field5545.length > var299) {
                        var296.field5545[var299] = var301;
                        var296.field5513[var299] = var300;
                    }
                    class174.method1220(var295, var299, var301 - 1, -127, var300);
                }
                if (var296 != null) {
                    class83.method676(var296, (byte) 87);
                }
                class355.method2468(0);
                class274.field4155[class287.method2076(31, class289.field4381++)] = class287.method2076(32767, var295);
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 240) {
                int var72 = class83.field1194.method1359((byte) -108);
                class255.field3806 = class54.field787.method496(var72, (byte) -47);
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 55) {
                int var292 = class83.field1194.method1362(255);
                if (var292 == 65535) {
                    var292 = -1;
                }
                int var293 = class83.field1194.method1320((byte) 64);
                class175.method1232(-67, var292, var293);
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 125) {
                int var289 = class83.field1194.method1338((byte) -54);
                if (var289 == 65535) {
                    var289 = -1;
                }
                int var290 = class83.field1194.method1370(-31156);
                int var291 = class83.field1194.method1364(true);
                class296.method2112(-1, var290, var289, var291);
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 228) {
                class83.field1194.field2776 += 28;
                if (class83.field1194.method1310(4)) {
                    class191.method1378(24, class83.field1194.field2776 - 28, class83.field1194);
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 196) {
                int var73 = class83.field1194.method1370(-31156);
                int var74 = class83.field1194.method1320((byte) 65);
                int var75 = class83.field1194.method1351(14794);
                class321.field4835 = var75 >> 1;
                class1.field55.method1701(6476, var73, var74, (var75 & 0x1) == 1);
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 195) {
                int var76 = class83.field1194.method1359((byte) -97);
                int var77 = class83.field1194.method1350(0);
                int var78 = class83.field1194.method1350(0);
                if (class149.method1057(4680, var77)) {
                    class16.method96(var78, var76, 3);
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 23) {
                int var286 = class83.field1194.method1371(-4);
                class359 var287 = class231.method1719(var286, 106);
                for (int var288 = 0; var288 < var287.field5545.length; var288++) {
                    var287.field5545[var288] = -1;
                    var287.field5545[var288] = 0;
                }
                class83.method676(var287, (byte) -69);
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 197) {
                int var284 = class83.field1194.method1317((byte) 32);
                int var285 = class83.field1194.method1359((byte) -94);
                class23.method132(var285, var284, -14154);
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 165) {
                boolean var79 = class83.field1194.method1319(255) == 1;
                String var80 = class83.field1194.method1329((byte) 59);
                String var81 = var80;
                if (var79) {
                    var81 = class83.field1194.method1329((byte) 59);
                }
                boolean var82 = false;
                long var83 = (long) class83.field1194.method1317((byte) 113);
                long var85 = (long) class83.field1194.method1312(50);
                int var87 = class83.field1194.method1319(255);
                long var88 = (var83 << 32) + var85;
                int var90 = 0;
                while (true) {
                    if (var90 >= 100) {
                        if (var87 <= 1) {
                            if (!(!class251.field3727 || class216.field3182) || class296.field4451) {
                                var82 = true;
                            } else if (class103.method793(101, var81)) {
                                var82 = true;
                            }
                        }
                        break;
                    }
                    if (class213.field3079[var90] == var88) {
                        var82 = true;
                        break;
                    }
                    var90++;
                }
                if (!var82 && class251.field3730 == 0) {
                    class213.field3079[class55.field802] = var88;
                    class55.field802 = (class55.field802 + 1) % 100;
                    String var91 = class29.method196(class144.method1034(512, class361.method2504((byte) 3, class83.field1194)));
                    if (var87 == 2) {
                        class142.method1026((String) null, var91, "<img=1>" + var80, -1, 0, 7, (byte) 30, "<img=1>" + var81);
                    } else if (var87 == 1) {
                        class142.method1026((String) null, var91, "<img=0>" + var80, -1, 0, 7, (byte) 30, "<img=0>" + var81);
                    } else {
                        class142.method1026((String) null, var91, var80, -1, 0, 3, (byte) 30, var81);
                    }
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 78) {
                String var92 = class83.field1194.method1329((byte) 59);
                int var93 = class83.field1194.method1338((byte) -54);
                int var94 = class83.field1194.method1338((byte) -54);
                if (class149.method1057(4680, var93)) {
                    class253.method1855(var92, var94, -107);
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 19) {
                class302.field4516 = class83.field1194.method1350(0) * 30;
                class27.field369 = class68.field989;
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 159) {
                int var283 = class83.field1194.method1338((byte) -54);
                class316.method2204(var283, (byte) -40);
                class274.field4155[class287.method2076(class289.field4381++, 31)] = class287.method2076(var283, 32767);
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 163) {
                int var95 = class83.field1194.method1317((byte) 95);
                int var96 = class83.field1194.method1350(0);
                int var97 = class83.field1194.method1362(255);
                int var98 = class83.field1194.method1338((byte) -54);
                int var99 = class83.field1194.method1344(15537);
                if (class149.method1057(4680, var98)) {
                    class15.method85(var95 << 16 | var97, var99, 7, var96, (byte) -113);
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 121) {
                class76.method617(13, true);
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 88) {
                int var280 = class83.field1194.method1339((byte) -111);
                int var281 = class83.field1194.method1362(255);
                int var282 = class83.field1194.method1371(-4);
                if (class149.method1057(4680, var281)) {
                    class292.method2099((byte) 108, var280, var282);
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 113) {
                int var100 = class83.field1194.method1344(15537);
                int var101 = class83.field1194.method1350(0);
                int var102 = class83.field1194.method1362(255);
                int var103 = class83.field1194.method1362(255);
                int var104 = class83.field1194.method1338((byte) -54);
                if (class149.method1057(4680, var102)) {
                    class326.method2253(var104, var100, var101, var103, 8);
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 142) {
                int var278 = class83.field1194.method1320((byte) 69);
                int var279 = class83.field1194.method1362(255);
                class23.method132(var278, var279, -14154);
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 249) {
                int var276 = class83.field1194.method1317((byte) 42);
                byte var277 = class83.field1194.method1331(-2097152);
                class272.method1999(var277, -69, var276);
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 138) {
                for (int var275 = 0; var275 < class227.field3423.length; var275++) {
                    if (class307.field4594[var275] != class227.field3423[var275]) {
                        class227.field3423[var275] = class307.field4594[var275];
                        class225.method1649(var275, 100);
                        class160.field2317[class287.method2076(31, class190.field2777++)] = var275;
                    }
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 131) {
                int var268 = class83.field1194.method1344(15537);
                int var269 = class83.field1194.method1362(255);
                int var270 = class83.field1194.method1344(15537);
                if (class149.method1057(4680, var269)) {
                    class98 var271 = (class98) class288.field4360.method1405((long) var270, false);
                    class98 var272 = (class98) class288.field4360.method1405((long) var268, false);
                    if (var272 != null) {
                        class343.method2396(-70, var272, var271 == null || var271.field1393 != var272.field1393);
                    }
                    if (var271 != null) {
                        var271.method876(8);
                        class288.field4360.method1400((long) var268, 127, var271);
                    }
                    class359 var273 = class231.method1719(var270, 107);
                    if (var273 != null) {
                        class83.method676(var273, (byte) -49);
                    }
                    class359 var274 = class231.method1719(var268, 93);
                    if (var274 != null) {
                        class83.method676(var274, (byte) -92);
                        class143.method1031(true, var274, -1);
                    }
                    if (class257.field3850 != -1) {
                        class31.method217(72, 1, class257.field3850);
                    }
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 28) {
                int var105 = class83.field1194.method1338((byte) -54);
                int var106 = class83.field1194.method1371(-4);
                if (var105 == 65535) {
                    var105 = -1;
                }
                int var107 = var106 >> 14 & 0x3FFF;
                int var108 = (var106 & 0x3286A052) >> 28;
                int var109 = var106 & 0x3FFF;
                int var110 = class83.field1194.method1351(14794);
                int var111 = var107 - class272.field4123;
                int var112 = var109 - class202.field2968;
                int var113 = var110 >> 2;
                int var114 = var110 & 0x3;
                int var115 = class103.field1481[var113];
                class190.method1325(var111, var114, var108, var115, var112, -83, var105, var113);
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 251) {
                int var258 = class83.field1194.method1359((byte) -81);
                int var259 = class83.field1194.method1350(0);
                if (var259 == 65535) {
                    var259 = -1;
                }
                int var260 = class83.field1194.method1338((byte) -54);
                int var261 = class83.field1194.method1317((byte) 66);
                int var262 = class83.field1194.method1317((byte) 121);
                if (var261 == 65535) {
                    var261 = -1;
                }
                if (class149.method1057(4680, var260)) {
                    for (int var263 = var261; var263 <= var259; var263++) {
                        long var264 = ((long) var258 << 32) + (long) var263;
                        class199 var266 = (class199) class144.field2081.method1405(var264, false);
                        class199 var267;
                        if (var266 != null) {
                            var267 = new class199(var266.field2901, var262);
                            var266.method876(8);
                        } else if (var263 == -1) {
                            var267 = new class199(class231.method1719(var258, 94).field5596.field2901, var262);
                        } else {
                            var267 = new class199(0, var262);
                        }
                        class144.field2081.method1400(var264, 118, var267);
                    }
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 86) {
                int var116 = class83.field1194.method1317((byte) 116);
                int var117 = class83.field1194.method1319(255);
                int var118 = class83.field1194.method1319(255);
                int var119 = class83.field1194.method1319(255);
                int var120 = class83.field1194.method1319(255);
                int var121 = class83.field1194.method1317((byte) 119);
                if (class149.method1057(4680, var116)) {
                    class71.field1021[var117] = true;
                    class109.field1581[var117] = var118;
                    class97.field1371[var117] = var119;
                    class8.field150[var117] = var120;
                    class122.field1770[var117] = var121;
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 87) {
                class133.field1946 = class83.field1194.method1370(-31156);
                class125.field1819 = class83.field1194.method1320((byte) 61);
                for (int var122 = class125.field1819; var122 < (class125.field1819 + 8); var122++) {
                    for (int var123 = class133.field1946; var123 < class133.field1946 + 8; var123++) {
                        if (class252.field3762[class321.field4835][var122][var123] != null) {
                            class252.field3762[class321.field4835][var122][var123] = null;
                            class241.method1776(var123, true, var122);
                        }
                    }
                }
                for (class217 var124 = (class217) class149.field2158.method93((byte) -103); var124 != null; var124 = (class217) class149.field2158.method97(-65)) {
                    if (class125.field1819 <= var124.field3194 && var124.field3194 < (class125.field1819 + 8) && var124.field3201 >= class133.field1946 && var124.field3201 < (class133.field1946 + 8) && class321.field4835 == var124.field3197) {
                        var124.field3202 = 0;
                    }
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 201) {
                int var125 = class83.field1194.method1317((byte) 11);
                String var126 = class83.field1194.method1329((byte) 59);
                Object[] var127 = new Object[var126.length() + 1];
                for (int var128 = var126.length() - 1; var128 >= 0; var128--) {
                    if (var126.charAt(var128) == 's') {
                        var127[var128 + 1] = class83.field1194.method1329((byte) 59);
                    } else {
                        var127[var128 + 1] = Integer.valueOf(class83.field1194.method1371(-4));
                    }
                }
                var127[0] = Integer.valueOf(class83.field1194.method1371(-4));
                if (class149.method1057(4680, var125)) {
                    class300 var129 = new class300();
                    var129.field4494 = var127;
                    class48.method412(var129, 200000);
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 119) {
                class241.field3595 = class83.field1194.method1319(255);
                class14.field211 = class83.field1194.method1319(255);
                class201.field2946 = class83.field1194.method1319(255);
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 214) {
                class166.method1183(class83.field1194.method1329((byte) 59), -19698);
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 64) {
                int var130 = class83.field1194.method1359((byte) -77);
                int var131 = class83.field1194.method1338((byte) -54);
                int var132 = class83.field1194.method1350(0);
                int var133 = class83.field1194.method1362(255);
                if (class149.method1057(4680, var131)) {
                    class275.method2011(var130, (var133 << 16) + var132, 0);
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 81) {
                if (class257.field3850 != -1) {
                    class31.method217(80, 0, class257.field3850);
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 68) {
                int var134 = class83.field1194.method1317((byte) 26);
                int var135 = class83.field1194.method1317((byte) 106);
                int var136 = class83.field1194.method1350(0);
                int var137 = class83.field1194.method1365(107);
                if (var137 >> 30 != 0) {
                    int var162 = var137 >> 28 & 0x3;
                    int var163 = ((var137 & 0xFFFDEBE) >> 14) - class272.field4123;
                    int var164 = (var137 & 0x3FFF) - class202.field2968;
                    if (var163 >= 0 && var164 >= 0 && var163 < 104 && var164 < 104) {
                        int var165 = var164 * 128 + 64;
                        int var166 = var163 * 128 + 64;
                        class323 var167 = new class323(var136, var162, var166, var165, class71.method584(var162, var166, -59, var165) - var134, var135, class304.field4560);
                        class217.field3199.method106(new class211(var167), -126);
                    }
                } else if (var137 >> 29 != 0) {
                    int var138 = var137 & 0xFFFF;
                    class181 var139 = class300.field4495[var138];
                    if (var139 != null) {
                        boolean var140 = true;
                        if (var136 == 65535) {
                            var136 = -1;
                        }
                        if (var136 != -1 && var139.field5090 != -1) {
                            if (var139.field5090 == var136) {
                                class107 var145 = class81.method669(32, var136);
                                if (var145.field1543 && var145.field1540 != -1) {
                                    class248 var146 = class119.method893(var145.field1540, (byte) -41);
                                    int var147 = var146.field3691;
                                    if (var147 == 1) {
                                        var139.field5107 = class304.field4560 + var135;
                                        var139.field5144 = 1;
                                        var140 = false;
                                        var139.field5159 = 0;
                                        var139.field5131 = 0;
                                        var139.field5143 = 0;
                                        class361.method2512(-29521, var139.field5137, false, var139.field5159, var146, var139.field5165);
                                    } else if (var147 == 2) {
                                        var140 = false;
                                        var139.field5097 = 0;
                                    }
                                }
                            } else {
                                class107 var141 = class81.method669(32, var136);
                                class107 var142 = class81.method669(32, var139.field5090);
                                if (var141.field1540 != -1 && var142.field1540 != -1) {
                                    class248 var143 = class119.method893(var141.field1540, (byte) -41);
                                    class248 var144 = class119.method893(var142.field1540, (byte) -41);
                                    if (var144.field3666 > var143.field3666) {
                                        var140 = false;
                                    }
                                }
                            }
                        }
                        if (var140) {
                            var139.field5100 = var134;
                            var139.field5144 = 1;
                            var139.field5131 = 0;
                            var139.field5107 = class304.field4560 + var135;
                            var139.field5159 = 0;
                            var139.field5090 = var136;
                            if (class304.field4560 < var139.field5107) {
                                var139.field5159 = -1;
                            }
                            if (var139.field5090 != -1 && class304.field4560 == var139.field5107) {
                                int var148 = class81.method669(32, var139.field5090).field1540;
                                if (var148 != -1) {
                                    class248 var149 = class119.method893(var148, (byte) -41);
                                    if (var149 != null && var149.field3667 != null) {
                                        class361.method2512(-29521, var139.field5137, false, 0, var149, var139.field5165);
                                    }
                                }
                            }
                        }
                    }
                } else if ((var137 >> 28) != 0) {
                    int var150 = var137 & 0xFFFF;
                    class228 var151;
                    if (class54.field790 == var150) {
                        var151 = class1.field55;
                    } else {
                        var151 = class343.field5312[var150];
                    }
                    if (var151 != null) {
                        if (var136 == 65535) {
                            var136 = -1;
                        }
                        boolean var152 = true;
                        if (var136 != -1 && var151.field5090 != -1) {
                            if (var151.field5090 == var136) {
                                class107 var153 = class81.method669(32, var136);
                                if (var153.field1543 && var153.field1540 != -1) {
                                    class248 var154 = class119.method893(var153.field1540, (byte) -41);
                                    int var155 = var154.field3691;
                                    if (var155 == 1) {
                                        var152 = false;
                                        var151.field5107 = class304.field4560 + var135;
                                        var151.field5144 = 1;
                                        var151.field5159 = 0;
                                        var151.field5131 = 0;
                                        var151.field5143 = 0;
                                        class361.method2512(-29521, var151.field5137, false, var151.field5159, var154, var151.field5165);
                                    } else if (var155 == 2) {
                                        var152 = false;
                                        var151.field5097 = 0;
                                    }
                                }
                            } else {
                                class107 var156 = class81.method669(32, var136);
                                class107 var157 = class81.method669(32, var151.field5090);
                                if (var156.field1540 != -1 && var157.field1540 != -1) {
                                    class248 var158 = class119.method893(var156.field1540, (byte) -41);
                                    class248 var159 = class119.method893(var157.field1540, (byte) -41);
                                    if (var159.field3666 > var158.field3666) {
                                        var152 = false;
                                    }
                                }
                            }
                        }
                        if (var152) {
                            var151.field5107 = class304.field4560 + var135;
                            var151.field5131 = 0;
                            var151.field5144 = 1;
                            var151.field5100 = var134;
                            var151.field5090 = var136;
                            if (var151.field5090 == 65535) {
                                var151.field5090 = -1;
                            }
                            var151.field5159 = 0;
                            if (class304.field4560 < var151.field5107) {
                                var151.field5159 = -1;
                            }
                            if (var151.field5090 != -1 && class304.field4560 == var151.field5107) {
                                int var160 = class81.method669(32, var151.field5090).field1540;
                                if (var160 != -1) {
                                    class248 var161 = class119.method893(var160, (byte) -41);
                                    if (var161 != null && var161.field3667 != null) {
                                        class361.method2512(-29521, var151.field5137, class1.field55 == var151, 0, var161, var151.field5165);
                                    }
                                }
                            }
                        }
                    }
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 9) {
                int var255 = class83.field1194.method1362(255);
                int var256 = class83.field1194.method1317((byte) 75);
                int var257 = class83.field1194.method1344(15537);
                if (class149.method1057(4680, var256)) {
                    class73.method608(var257, var255, 71);
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 247) {
                String var168 = class83.field1194.method1329((byte) 59);
                boolean var169 = class83.field1194.method1319(255) == 1;
                String var170;
                if (var169) {
                    var170 = class83.field1194.method1329((byte) 59);
                } else {
                    var170 = var168;
                }
                int var171 = class83.field1194.method1317((byte) 123);
                boolean var172 = false;
                byte var173 = class83.field1194.method1322(9813);
                if (var173 == -128) {
                    var172 = true;
                }
                if (var172) {
                    if (class256.field3832 == 0) {
                        class54.field788 = -1;
                        return true;
                    }
                    boolean var174 = false;
                    int var175;
                    for (var175 = 0; var175 < class256.field3832 && (!class132.field1942[var175].field2126.equals(var170) || class132.field1942[var175].field2131 != var171); var175++) {
                    }
                    if (var175 < class256.field3832) {
                        while (var175 < class256.field3832 - 1) {
                            class132.field1942[var175] = class132.field1942[var175 + 1];
                            var175++;
                        }
                        class256.field3832--;
                        class132.field1942[class256.field3832] = null;
                    }
                } else {
                    String var176 = class83.field1194.method1329((byte) 59);
                    class148 var177 = new class148();
                    var177.field2126 = var170;
                    var177.field2125 = var176;
                    var177.field2122 = var173;
                    var177.field2131 = var171;
                    var177.field2127 = var168;
                    int var178;
                    for (var178 = class256.field3832 - 1; var178 >= 0; var178--) {
                        int var179 = class132.field1942[var178].field2126.compareTo(var177.field2126);
                        if (var179 == 0) {
                            class132.field1942[var178].field2131 = var171;
                            class132.field1942[var178].field2122 = var173;
                            class132.field1942[var178].field2125 = var176;
                            if (var170.equals(class1.field55.field3453)) {
                                class362.field5748 = var173;
                            }
                            class54.field788 = -1;
                            class203.field2989 = class68.field989;
                            return true;
                        }
                        if (var179 < 0) {
                            break;
                        }
                    }
                    if (class132.field1942.length <= class256.field3832) {
                        class54.field788 = -1;
                        return true;
                    }
                    for (int var180 = class256.field3832 - 1; var180 > var178; var180--) {
                        class132.field1942[var180 + 1] = class132.field1942[var180];
                    }
                    if (class256.field3832 == 0) {
                        class132.field1942 = new class148[100];
                    }
                    class132.field1942[var178 + 1] = var177;
                    class256.field3832++;
                    if (var170.equals(class1.field55.field3453)) {
                        class362.field5748 = var173;
                    }
                }
                class54.field788 = -1;
                class203.field2989 = class68.field989;
                return true;
            } else if (class54.field788 == 110) {
                int var252 = class83.field1194.method1350(0);
                int var253 = class83.field1194.method1359((byte) -82);
                String var254 = class83.field1194.method1329((byte) 59);
                if (class149.method1057(4680, var252)) {
                    class75.method613(true, var253, var254);
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 234) {
                class255.field3810 = class83.field1194.method1319(255);
                for (int var251 = 0; var251 < class255.field3810; var251++) {
                    class192.field2806[var251] = class83.field1194.method1329((byte) 59);
                    class225.field3387[var251] = class83.field1194.method1329((byte) 59);
                    if (class225.field3387[var251].equals("")) {
                        class225.field3387[var251] = class192.field2806[var251];
                    }
                    class170.field2455[var251] = class83.field1194.method1329((byte) 59);
                    class190.field2775[var251] = class83.field1194.method1329((byte) 59);
                    if (class190.field2775[var251].equals("")) {
                        class190.field2775[var251] = class170.field2455[var251];
                    }
                    class333.field5161[var251] = false;
                }
                class54.field788 = -1;
                class348.field5376 = class68.field989;
                return true;
            } else if (class54.field788 == 246) {
                int var181 = class83.field1194.method1362(255);
                int var182 = class83.field1194.method1359((byte) -80);
                int var183 = class83.field1194.method1317((byte) 93);
                if (class149.method1057(4680, var183)) {
                    class356.method2471(var181, (byte) 102, var182);
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 77) {
                int var184 = class83.field1194.method1317((byte) 21);
                int var185 = class83.field1194.method1371(-4);
                if (class149.method1057(4680, var184)) {
                    class98 var186 = (class98) class288.field4360.method1405((long) var185, false);
                    if (var186 != null) {
                        class343.method2396(-69, var186, true);
                    }
                    if (class289.field4380 != null) {
                        class83.method676(class289.field4380, (byte) -124);
                        class289.field4380 = null;
                    }
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 70) {
                int var250 = class83.field1194.method1317((byte) 107);
                if (class149.method1057(4680, var250)) {
                    class177.method1237(true);
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 41) {
                int var187 = class83.field1194.method1317((byte) 94);
                if (class149.method1057(4680, var187)) {
                    class178.method1241(-39);
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 109) {
                int var188 = class83.field1194.method1372(-127);
                int var189 = class83.field1194.method1371(-4);
                int var190 = class83.field1194.method1319(255);
                String var191 = "";
                String var192 = var191;
                if ((var190 & 0x1) != 0) {
                    var191 = class83.field1194.method1329((byte) 59);
                    if ((var190 & 0x2) == 0) {
                        var192 = var191;
                    } else {
                        var192 = class83.field1194.method1329((byte) 59);
                    }
                }
                String var193 = class83.field1194.method1329((byte) 59);
                if (!var192.equals("") && class103.method793(79, var192)) {
                    class54.field788 = -1;
                    return true;
                } else {
                    class247.method1814(var192, -1, var191, var188, var189, var193);
                    class54.field788 = -1;
                    return true;
                }
            } else if (class54.field788 == 237) {
                boolean var236 = class83.field1194.method1319(255) == 1;
                String var237 = class83.field1194.method1329((byte) 59);
                String var238 = var237;
                if (var236) {
                    var238 = class83.field1194.method1329((byte) 59);
                }
                long var239 = (long) class83.field1194.method1317((byte) 60);
                long var241 = (long) class83.field1194.method1312(50);
                int var243 = class83.field1194.method1319(255);
                long var244 = (var239 << 32) + var241;
                boolean var246 = false;
                int var247 = class83.field1194.method1317((byte) 58);
                int var248 = 0;
                while (true) {
                    if (var248 >= 100) {
                        if (var243 <= 1 && class103.method793(34, var238)) {
                            var246 = true;
                        }
                        break;
                    }
                    if (class213.field3079[var248] == var244) {
                        var246 = true;
                        break;
                    }
                    var248++;
                }
                if (!var246 && class251.field3730 == 0) {
                    class213.field3079[class55.field802] = var244;
                    class55.field802 = (class55.field802 + 1) % 100;
                    String var249 = class192.method1385(102, var247).method2170((byte) -68, class83.field1194);
                    if (var243 == 2) {
                        class142.method1026((String) null, var249, "<img=1>" + var237, var247, 0, 18, (byte) 30, "<img=1>" + var238);
                    } else if (var243 == 1) {
                        class142.method1026((String) null, var249, "<img=0>" + var237, var247, 0, 18, (byte) 30, "<img=0>" + var238);
                    } else {
                        class142.method1026((String) null, var249, var237, var247, 0, 18, (byte) 30, var238);
                    }
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 2) {
                class89.method709(-11);
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 254) {
                int var194 = class83.field1194.method1365(-9);
                int var195 = class83.field1194.method1338((byte) -54);
                int var196 = class83.field1194.method1371(-4);
                int var197 = class83.field1194.method1317((byte) 62);
                if (class149.method1057(4680, var195)) {
                    class15.method85(var197, var196, 5, var194, (byte) -124);
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 29) {
                class133.field1946 = class83.field1194.method1320((byte) 63);
                class125.field1819 = class83.field1194.method1319(255);
                while (class83.field1194.field2776 < class358.field5481) {
                    class54.field788 = class83.field1194.method1319(255);
                    class286.method2065(63);
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 62) {
                boolean var198 = class83.field1194.method1319(255) == 1;
                String var199 = class83.field1194.method1329((byte) 59);
                String var200 = var199;
                if (var198) {
                    var200 = class83.field1194.method1329((byte) 59);
                }
                long var201 = class83.field1194.method1311(24263);
                long var203 = (long) class83.field1194.method1317((byte) 62);
                long var205 = (long) class83.field1194.method1312(87);
                long var207 = (var203 << 32) + var205;
                int var209 = class83.field1194.method1319(255);
                boolean var210 = false;
                int var211 = 0;
                while (true) {
                    if (var211 >= 100) {
                        if (var209 <= 1) {
                            if (!(!class251.field3727 || class216.field3182) || class296.field4451) {
                                var210 = true;
                            } else if (class103.method793(52, var200)) {
                                var210 = true;
                            }
                        }
                        break;
                    }
                    if (class213.field3079[var211] == var207) {
                        var210 = true;
                        break;
                    }
                    var211++;
                }
                if (!var210 && class251.field3730 == 0) {
                    class213.field3079[class55.field802] = var207;
                    class55.field802 = (class55.field802 + 1) % 100;
                    String var212 = class29.method196(class144.method1034(512, class361.method2504((byte) 3, class83.field1194)));
                    if (var209 == 2 || var209 == 3) {
                        class142.method1026(class227.method1690(32767, var201), var212, "<img=1>" + var199, -1, 0, 9, (byte) 30, "<img=1>" + var200);
                    } else if (var209 == 1) {
                        class142.method1026(class227.method1690(32767, var201), var212, "<img=0>" + var199, -1, 0, 9, (byte) 30, "<img=0>" + var200);
                    } else {
                        class142.method1026(class227.method1690(32767, var201), var212, var199, -1, 0, 9, (byte) 30, var200);
                    }
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 94) {
                int var229 = class83.field1194.method1319(255);
                boolean var230 = (var229 & 0x1) == 1;
                String var231 = class83.field1194.method1329((byte) 59);
                String var232 = class83.field1194.method1329((byte) 59);
                String var233 = class83.field1194.method1329((byte) 59);
                String var234 = class83.field1194.method1329((byte) 59);
                if (var230) {
                    for (int var235 = 0; var235 < class255.field3810; var235++) {
                        if (class225.field3387[var235].equals(var234)) {
                            class192.field2806[var235] = var231;
                            if (var232.equals("")) {
                                class225.field3387[var235] = var231;
                            } else {
                                class225.field3387[var235] = var232;
                            }
                            class170.field2455[var235] = var233;
                            if (var234.equals("")) {
                                class190.field2775[var235] = var233;
                            } else {
                                class190.field2775[var235] = var234;
                            }
                            break;
                        }
                    }
                } else {
                    class192.field2806[class255.field3810] = var231;
                    if (var232.equals("")) {
                        class225.field3387[class255.field3810] = var231;
                    } else {
                        class225.field3387[class255.field3810] = var232;
                    }
                    class170.field2455[class255.field3810] = var233;
                    if (var234.equals("")) {
                        class190.field2775[class255.field3810] = var233;
                    } else {
                        class190.field2775[class255.field3810] = var234;
                    }
                    class333.field5161[class255.field3810] = class287.method2076(var229, 2) == 2;
                    class255.field3810++;
                }
                class54.field788 = -1;
                class348.field5376 = class68.field989;
                return true;
            } else if (class54.field788 == 209) {
                class355.method2468(0);
                int var213 = class83.field1194.method1319(255);
                int var214 = class83.field1194.method1371(-4);
                int var215 = class83.field1194.method1320((byte) 77);
                class9.field157[var215] = var214;
                class275.field4174[var215] = var213;
                class259.field3859[var215] = 1;
                for (int var216 = 0; var216 < 98; var216++) {
                    if (var214 >= class41.field589[var216]) {
                        class259.field3859[var215] = var216 + 2;
                    }
                }
                class361.field5717[class287.method2076(31, class135.field1966++)] = var215;
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 40) {
                int var217 = class83.field1194.method1319(255);
                int var218 = class83.field1194.method1338((byte) -54);
                int var219 = class83.field1194.method1320((byte) 89);
                String var220 = class83.field1194.method1329((byte) 59);
                if (var218 == 65535) {
                    var218 = -1;
                }
                if (var217 >= 1 && var217 <= 8) {
                    if (var220.equalsIgnoreCase("null")) {
                        var220 = null;
                    }
                    class247.field3661[var217 - 1] = var220;
                    class227.field3416[var217 - 1] = var218;
                    class299.field4472[var217 - 1] = var219 == 0;
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 139) {
                int var228 = class83.field1194.method1319(255);
                if (class83.field1194.method1319(255) == 0) {
                    class302.field4506[var228] = new class65();
                } else {
                    class83.field1194.field2776--;
                    class302.field4506[var228] = new class65(class83.field1194);
                }
                class54.field788 = -1;
                class200.field2944 = class68.field989;
                return true;
            } else if (class54.field788 == 102) {
                for (int var221 = 0; var221 < class343.field5312.length; var221++) {
                    if (class343.field5312[var221] != null) {
                        class343.field5312[var221].field5190 = -1;
                    }
                }
                for (int var222 = 0; var222 < class300.field4495.length; var222++) {
                    if (class300.field4495[var222] != null) {
                        class300.field4495[var222].field5190 = -1;
                    }
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 187) {
                int var223 = class83.field1194.method1319(255);
                int var224 = class83.field1194.method1362(255);
                int var225 = class83.field1194.method1317((byte) 79);
                int var226 = class83.field1194.method1365(-60);
                if (class149.method1057(4680, var224)) {
                    class98 var227 = (class98) class288.field4360.method1405((long) var226, false);
                    if (var227 != null) {
                        class343.method2396(-99, var227, var227.field1393 != var225);
                    }
                    class109.method837(26, var226, var223, var225);
                }
                class54.field788 = -1;
                return true;
            } else if (class54.field788 == 61) {
                class355.method2468(0);
                class281.field4263 = class83.field1194.method1319(255);
                class54.field788 = -1;
                class27.field369 = class68.field989;
                return true;
            } else {
                class343.method2402("T1 - " + class54.field788 + "," + class20.field319 + "," + class194.field2820 + " - " + class358.field5481, (Throwable) null, -2);
                class302.method2131((byte) -111);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "(I)V", line = 2944)
    public static void method1217(int arg0) {
        field2506 = null;
        field2498 = null;
        if (arg0 != -180) {
            method1214(114);
        }
        field2493 = null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IB)[I", line = 2960)
    public final int[] method18(int arg0, byte arg1) {
        if (arg1 != -62) {
            return (int[]) null;
        }
        field2496++;
        int[] var3 = this.field375.method2087(-102, arg0);
        if (this.field375.field4382) {
            int[] var4 = this.method164(arg0, 83, 0);
            for (int var5 = 0; var5 < class209.field3053; var5++) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field2495 && this.field2492 >= var6 ? 4096 : 0;
            }
        }
        return var3;
    }
}
