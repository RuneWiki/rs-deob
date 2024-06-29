import java.io.IOException;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class255 {

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "[Z")
    public static boolean[] field2977 = new boolean[100];

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2976 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)Z", line = 5)
    public static final boolean method1516(int arg0) throws IOException {
        field2975++;
        if (class436.field5748 == null) {
            return false;
        }
        if (class320.field3967 == null) {
            if (class790.field10876) {
                if (!class436.field5748.method765((byte) -127, 1)) {
                    return false;
                }
                class436.field5748.method766(class583.field7964.field5275, 0, 81, 1);
                class790.field10876 = false;
                class742.field10346 = 0;
                class168.field2029++;
            }
            class583.field7964.field5262 = 0;
            if (class583.field7964.method2804(8)) {
                if (!class436.field5748.method765((byte) -100, 1)) {
                    return false;
                }
                class436.field5748.method766(class583.field7964.field5275, 1, arg0 - 30, 1);
                class742.field10346 = 0;
                class168.field2029++;
            }
            class790.field10876 = true;
            class596[] var1 = class358.method2095((byte) -99);
            int var2 = class583.field7964.method2807((byte) -43);
            if (var2 < 0 || var1.length <= var2) {
                throw new IOException("invo:" + var2 + " ip:" + class583.field7964.field5262);
            }
            class320.field3967 = var1[var2];
            class647.field8807 = class320.field3967.field8088;
        }
        if (class647.field8807 == -1) {
            if (!class436.field5748.method765((byte) 121, 1)) {
                return false;
            }
            class436.field5748.method766(class583.field7964.field5275, 0, 119, 1);
            class168.field2029++;
            class647.field8807 = class583.field7964.field5275[0] & 0xFF;
            class742.field10346 = 0;
        }
        if (~class647.field8807 == arg0) {
            if (!class436.field5748.method765((byte) -84, 2)) {
                return false;
            }
            class436.field5748.method766(class583.field7964.field5275, 0, 103, 2);
            class583.field7964.field5262 = 0;
            class647.field8807 = class583.field7964.method2390((byte) -112);
            class168.field2029 += 2;
            class742.field10346 = 0;
        }
        if (class647.field8807 > 0) {
            if (!class436.field5748.method765((byte) -35, class647.field8807)) {
                return false;
            }
            class583.field7964.field5262 = 0;
            class436.field5748.method766(class583.field7964.field5275, 0, arg0 + 106, class647.field8807);
            class168.field2029 += class647.field8807;
            class742.field10346 = 0;
        }
        class102.field1321 = class322.field3995;
        class322.field3995 = class185.field2245;
        class185.field2245 = class320.field3967;
        if (class594.field8071 == class320.field3967) {
            class267.field3158 = class583.field7964.method2393((byte) -107) == 1;
            class320.field3967 = null;
            return true;
        } else if (class444.field5954 == class320.field3967) {
            boolean var3 = class583.field7964.method2396((byte) 56) == 1;
            String var4 = class583.field7964.method2384(-6435);
            String var5 = var4;
            if (var3) {
                var5 = class583.field7964.method2384(-6435);
            }
            long var6 = (long) class583.field7964.method2390((byte) -128);
            long var8 = (long) class583.field7964.method2358(79);
            int var10 = class583.field7964.method2396((byte) -83);
            long var11 = (var6 << 32) + var8;
            boolean var13 = false;
            int var14 = 0;
            while (true) {
                if (var14 >= 100) {
                    if (var10 <= 1) {
                        if (!(!class730.field10234 || class633.field8636) || class257.field3052) {
                            var13 = true;
                        } else if (class764.method4236(var5, -1)) {
                            var13 = true;
                        }
                    }
                    break;
                }
                if (class132.field1643[var14] == var11) {
                    var13 = true;
                    break;
                }
                var14++;
            }
            if (!var13 && class619.field8334 == 0) {
                class132.field1643[class437.field5755] = var11;
                class437.field5755 = (class437.field5755 + 1) % 100;
                String var15 = class386.method2265(false, class589.method3385((byte) -106, class583.field7964));
                if (var10 == 2) {
                    class215.method1345("<img=1>" + var4, 7, "<img=1>" + var5, null, var4, (byte) 114, var15, -1, 0);
                } else if (var10 == 1) {
                    class215.method1345("<img=0>" + var4, 7, "<img=0>" + var5, null, var4, (byte) 120, var15, -1, 0);
                } else {
                    class215.method1345(var4, 3, var5, null, var4, (byte) 125, var15, -1, 0);
                }
            }
            class320.field3967 = null;
            return true;
        } else if (class320.field3967 == class120.field1541) {
            class247.method1489(class521.field7389, class647.field8807, arg0 - 1, class583.field7964);
            class320.field3967 = null;
            return true;
        } else if (class36.field540 == class320.field3967) {
            int var16 = class583.field7964.method2390((byte) 20);
            int var17 = class583.field7964.method2396((byte) 112);
            boolean var18 = (var17 & 0x1) == 1;
            while (class583.field7964.field5262 < class647.field8807) {
                int var19 = class583.field7964.method2354((byte) 105);
                int var20 = class583.field7964.method2390((byte) 117);
                int var21 = 0;
                if (var20 != 0) {
                    var21 = class583.field7964.method2396((byte) 49);
                    if (var21 == 255) {
                        var21 = class583.field7964.method2381((byte) 125);
                    }
                }
                class41.method340(var21, var16, var20 - 1, -1, var18, var19);
            }
            class151.field1890[class296.method1733(class382.field4890++, 31)] = var16;
            class320.field3967 = null;
            return true;
        } else if (class462.field6486 == class320.field3967) {
            while (class583.field7964.field5262 < class647.field8807) {
                boolean var32 = class583.field7964.method2396((byte) -99) == 1;
                String var33 = class583.field7964.method2384(-6435);
                String var34 = class583.field7964.method2384(-6435);
                int var35 = class583.field7964.method2390((byte) 58);
                int var36 = class583.field7964.method2396((byte) 66);
                String var37 = "";
                boolean var38 = false;
                if (var35 > 0) {
                    var37 = class583.field7964.method2384(arg0 ^ 0xFFFFE6DC);
                    var38 = class583.field7964.method2396((byte) -79) == 1;
                }
                for (int var39 = 0; var39 < class651.field8992; var39++) {
                    if (var32) {
                        if (var34.equals(class375.field4702[var39])) {
                            class375.field4702[var39] = var33;
                            var33 = null;
                            class156.field1942[var39] = var34;
                            break;
                        }
                    } else if (var33.equals(class375.field4702[var39])) {
                        if (class340.field4225[var39] != var35) {
                            boolean var40 = true;
                            for (class14 var41 = (class14) class195.field2314.method2447(arg0 ^ 0xFFFFFFAF); var41 != null; var41 = (class14) class195.field2314.method2439(arg0 - 108)) {
                                if (var41.field226.equals(var33)) {
                                    if (var35 != 0 && var41.field230 == 0) {
                                        var41.method892(arg0 + 50559);
                                        var40 = false;
                                    } else if (var35 == 0 && var41.field230 != 0) {
                                        var41.method892(arg0 + 50559);
                                        var40 = false;
                                    }
                                }
                            }
                            if (var40) {
                                class195.field2314.method2444(11586, new class14(var33, var35));
                            }
                            class340.field4225[var39] = var35;
                        }
                        class156.field1942[var39] = var34;
                        class208.field2471[var39] = var37;
                        class347.field4340[var39] = var36;
                        var33 = null;
                        class111.field1396[var39] = var38;
                        break;
                    }
                }
                if (var33 != null && class651.field8992 < 200) {
                    class375.field4702[class651.field8992] = var33;
                    class156.field1942[class651.field8992] = var34;
                    class340.field4225[class651.field8992] = var35;
                    class208.field2471[class651.field8992] = var37;
                    class347.field4340[class651.field8992] = var36;
                    class111.field1396[class651.field8992] = var38;
                    class651.field8992++;
                }
            }
            class280.field3263 = 2;
            class462.field6489 = class87.field1156;
            boolean var22 = false;
            int var23 = class651.field8992;
            while (var23 > 0) {
                boolean var24 = true;
                var23--;
                for (int var25 = 0; var25 < var23; var25++) {
                    if (class340.field4225[var25] != class55.field743.field4365 && class340.field4225[var25 + 1] == class55.field743.field4365 || class340.field4225[var25] == 0 && class340.field4225[var25 + 1] != 0) {
                        int var26 = class340.field4225[var25];
                        class340.field4225[var25] = class340.field4225[var25 + 1];
                        class340.field4225[var25 + 1] = var26;
                        String var27 = class208.field2471[var25];
                        class208.field2471[var25] = class208.field2471[var25 + 1];
                        class208.field2471[var25 + 1] = var27;
                        String var28 = class375.field4702[var25];
                        class375.field4702[var25] = class375.field4702[var25 + 1];
                        class375.field4702[var25 + 1] = var28;
                        String var29 = class156.field1942[var25];
                        class156.field1942[var25] = class156.field1942[var25 + 1];
                        class156.field1942[var25 + 1] = var29;
                        int var30 = class347.field4340[var25];
                        class347.field4340[var25] = class347.field4340[var25 + 1];
                        class347.field4340[var25 + 1] = var30;
                        boolean var31 = class111.field1396[var25];
                        class111.field1396[var25] = class111.field1396[var25 + 1];
                        class111.field1396[var25 + 1] = var31;
                        var24 = false;
                    }
                }
                if (var24) {
                    break;
                }
            }
            class320.field3967 = null;
            return true;
        } else if (class320.field3967 == class276.field3236) {
            class13.field218 = class583.field7964.method2396((byte) 124);
            class320.field3967 = null;
            return true;
        } else if (class445.field5958 == class320.field3967) {
            int var42 = class583.field7964.method2377(-1);
            int var43 = class583.field7964.method2415(arg0 ^ 0xFFFFFFA6);
            class329.method1951(12044);
            class329.method1955(5, var43, var42);
            class320.field3967 = null;
            return true;
        } else if (class464.field6498 == class320.field3967) {
            int var44 = class583.field7964.method2390((byte) -126);
            if (var44 == 65535) {
                var44 = -1;
            }
            int var45 = class583.field7964.method2396((byte) 29);
            int var46 = class583.field7964.method2390((byte) 114);
            int var47 = class583.field7964.method2396((byte) -97);
            class731.method4131(0, 256, var47, var45, var44, true, var46);
            class320.field3967 = null;
            return true;
        } else if (class447.field6018 == class320.field3967) {
            class309.field3846 = class324.method1930(class583.field7964.method2396((byte) -113), -1537);
            class320.field3967 = null;
            return true;
        } else if (class77.field1046 == class320.field3967) {
            int var48 = class583.field7964.method2381((byte) 45);
            int var49 = class583.field7964.method2421((byte) 90);
            if (var49 == 65535) {
                var49 = -1;
            }
            class329.method1951(arg0 + 12043);
            class323.method1928(var49, -1, 1, (byte) -79, var48);
            class320.field3967 = null;
            return true;
        } else if (class85.field1135 == class320.field3967) {
            int var50 = class583.field7964.method2402((byte) 102);
            int var51 = class583.field7964.method2368(-129);
            int var52 = class583.field7964.method2368(-129);
            class329.method1951(12044);
            class323.method1928(var50, var51, 5, (byte) -79, var52);
            class320.field3967 = null;
            return true;
        } else if (class764.field10534 == class320.field3967) {
            class293.field3513 = class87.field1156;
            boolean var53 = class583.field7964.method2396((byte) 104) == 1;
            if (class647.field8807 != 1) {
                if (var53) {
                    class227.field2671 = new class330(class583.field7964);
                } else {
                    class32.field501 = new class330(class583.field7964);
                }
                class320.field3967 = null;
                return true;
            }
            class320.field3967 = null;
            if (var53) {
                class227.field2671 = null;
            } else {
                class32.field501 = null;
            }
            return true;
        } else if (class502.field7048 == class320.field3967) {
            int var54 = class583.field7964.method2414(arg0 + 254);
            int var55 = class583.field7964.method2357(2);
            int var56 = class583.field7964.method2386((byte) -105);
            int var57 = class583.field7964.method2414(255);
            class329.method1951(arg0 + 12043);
            class35.method316(var55, var57, var54, var56, -19129);
            class320.field3967 = null;
            return true;
        } else if (class320.field3967 == class157.field1957) {
            class571.method3313(class603.field8144, -117);
            class320.field3967 = null;
            return true;
        } else if (class320.field3967 == class208.field2466) {
            int var58 = class583.field7964.method2402((byte) 65);
            if (var58 == 65535) {
                var58 = -1;
            }
            int var59 = class583.field7964.method2368(-129);
            int var60 = class583.field7964.method2390((byte) -126);
            if (var60 == 65535) {
                var60 = -1;
            }
            int var61 = class583.field7964.method2415(arg0 - 90);
            class329.method1951(12044);
            for (int var62 = var60; var62 <= var58; var62++) {
                long var63 = ((long) var59 << 32) + (long) var62;
                class396 var65 = (class396) class539.field7586.method2121(116, var63);
                class396 var66;
                if (var65 != null) {
                    var66 = new class396(var61, var65.field5125);
                    var65.method2219(13630);
                } else if (var62 == -1) {
                    var66 = new class396(var61, class479.method2848(var59, (byte) -88).field8440.field5125);
                } else {
                    var66 = new class396(var61, -1);
                }
                class539.field7586.method2112(var66, (byte) 6, var63);
            }
            class320.field3967 = null;
            return true;
        } else if (class333.field4119 == class320.field3967) {
            int var67 = class583.field7964.method2381((byte) 116);
            if (class608.field8177 != var67) {
                class608.field8177 = var67;
                class142.method1038(class465.field6513, -1, -1);
            }
            class320.field3967 = null;
            return true;
        } else if (class320.field3967 == class300.field3593) {
            class583.field7964.field5262 += 28;
            if (class583.field7964.method2411(-97)) {
                class710.method4024(class583.field7964, class583.field7964.field5262 - 28, 87);
            }
            class320.field3967 = null;
            return true;
        } else if (class39.field563 == class320.field3967) {
            int var68 = class583.field7964.method2402((byte) 73);
            int var69 = class583.field7964.method2415(arg0 - 83);
            int var70 = class583.field7964.method2414(arg0 + 254);
            int var71 = class583.field7964.method2390((byte) -106);
            class329.method1951(12044);
            class323.method1928(var70 << 16 | var71, var68, 7, (byte) -79, var69);
            class320.field3967 = null;
            return true;
        } else if (class37.field553 == class320.field3967) {
            int var72 = class583.field7964.method2368(-129);
            int var73 = class583.field7964.method2390((byte) 82);
            int var74 = class583.field7964.method2393((byte) -107);
            int var75 = class583.field7964.method2390((byte) -108);
            class329.method1951(12044);
            class65.method552(var74, var72, var73, var75, 18);
            class320.field3967 = null;
            return true;
        } else if (class320.field3967 == class16.field294) {
            int var76 = class583.field7964.method2415(-80);
            int var77 = class583.field7964.method2402((byte) 98);
            class329.method1951(arg0 + 12043);
            if (var77 == 65535) {
                var77 = -1;
            }
            class323.method1928(var77, -1, 2, (byte) -79, var76);
            class320.field3967 = null;
            return true;
        } else if (class754.field10446 == class320.field3967) {
            class251.method1499(class647.field8807, (byte) 25, class583.field7964);
            class320.field3967 = null;
            return true;
        } else if (class763.field10532 == class320.field3967) {
            int var78 = class583.field7964.method2390((byte) -5);
            if (var78 == 65535) {
                var78 = -1;
            }
            int var79 = class583.field7964.method2396((byte) 58);
            int var80 = class583.field7964.method2390((byte) -112);
            int var81 = class583.field7964.method2396((byte) 71);
            int var82 = class583.field7964.method2390((byte) -101);
            class676.method3809(var80, var78, var82, var79, var81, 0);
            class320.field3967 = null;
            return true;
        } else if (class320.field3967 == class289.field3490) {
            int var83 = class583.field7964.method2390((byte) 0);
            int var84 = class583.field7964.method2390((byte) -115);
            int var85 = class583.field7964.method2390((byte) -120);
            class329.method1951(12044);
            if (class316.field3880[var83] != null) {
                for (int var86 = var84; var86 < var85; var86++) {
                    int var87 = class583.field7964.method2358(104);
                    if (var86 < class316.field3880[var83].length && class316.field3880[var83][var86] != null) {
                        class316.field3880[var83][var86].field8450 = var87;
                    }
                }
            }
            class320.field3967 = null;
            return true;
        } else if (class622.field8541 == class320.field3967) {
            int var88 = class583.field7964.method2402((byte) 81);
            int[] var89 = new int[4];
            for (int var90 = 0; var90 < 4; var90++) {
                var89[var90] = class583.field7964.method2414(class241.method1459(arg0, 254));
            }
            int var91 = class583.field7964.method2386((byte) -115);
            class273 var92 = (class273) class30.field444.method2121(arg0 ^ 0x51, (long) var88);
            if (var92 != null) {
                class95.method832(var91, var89, 0, var92.field3210);
            }
            class320.field3967 = null;
            return true;
        } else if (class729.field10223 == class320.field3967) {
            class571.method3313(class85.field1141, -90);
            class320.field3967 = null;
            return true;
        } else if (class320.field3967 == class207.field2461) {
            int var93 = class583.field7964.method2386((byte) -96);
            class329.method1951(12044);
            class313.field3856 = var93;
            class320.field3967 = null;
            return true;
        } else if (class320.field3967 == class135.field1691) {
            if (class131.field1615 != -1) {
                class314.method1853(class131.field1615, 0, -17);
            }
            class320.field3967 = null;
            return true;
        } else if (class320.field3967 == class297.field3536) {
            class571.method3313(class788.field10862, -103);
            class320.field3967 = null;
            return true;
        } else if (class320.field3967 == class259.field3072) {
            int var94 = class583.field7964.method2390((byte) -102);
            int var95 = class583.field7964.method2402((byte) 122);
            int var96 = class583.field7964.method2357(2);
            class329.method1951(12044);
            class677.method3813(var96, -50, (var94 << 16) + var95);
            class320.field3967 = null;
            return true;
        } else if (class320.field3967 == class196.field2340) {
            class647.field8813 = class583.field7964.method2362((byte) 127);
            class320.field3967 = null;
            if (class647.field8813 == 0 || class647.field8813 == 1) {
                class200.field2406 = true;
            }
            return true;
        } else if (class556.field7731 == class320.field3967) {
            String var97 = class583.field7964.method2384(-6435);
            int var98 = class583.field7964.method2381((byte) 71);
            class329.method1951(arg0 ^ 0x2F0D);
            class337.method1995(var97, var98, 3);
            class320.field3967 = null;
            return true;
        } else if (class320.field3967 == class256.field2992) {
            int var99 = class583.field7964.method2357(2);
            class329.method1951(12044);
            if (var99 == -1) {
                class131.field1617 = -1;
                class719.field10094 = -1;
            } else {
                int var100 = (var99 & 0xFFFDCAB) >> 14;
                int var101 = var99 & 0x3FFF;
                int var102 = var100 - class632.field8626;
                if (var102 < 0) {
                    var102 = 0;
                } else if (class596.field8090 <= var102) {
                    var102 = class596.field8090;
                }
                int var103 = var101 - class620.field8435;
                if (var103 < 0) {
                    var103 = 0;
                } else if (var103 >= class107.field1350) {
                    var103 = class107.field1350;
                }
                class131.field1617 = (var102 << 9) + 256;
                class719.field10094 = (var103 << 9) + 256;
            }
            class320.field3967 = null;
            return true;
        } else if (class320.field3967 == class111.field1401) {
            int var104 = class583.field7964.method2381((byte) 125);
            int var105 = class583.field7964.method2402((byte) 95);
            class329.method1951(arg0 ^ 0x2F0D);
            class458.method2775(var105, var104, -18676);
            class320.field3967 = null;
            return true;
        } else if (class320.field3967 == class270.field3191) {
            class571.method3313(class683.field9352, -117);
            class320.field3967 = null;
            return true;
        } else if (class75.field1034 == class320.field3967) {
            int var106 = class583.field7964.method2357(2);
            int var107 = class583.field7964.method2390((byte) -119);
            class329.method1951(arg0 + 12043);
            class591.method3389(var107, var106, (byte) -96);
            class320.field3967 = null;
            return true;
        } else if (class320.field3967 == class13.field221) {
            int var108 = class583.field7964.method2414(arg0 ^ 0xFE);
            if (var108 == 65535) {
                var108 = -1;
            }
            int var109 = class583.field7964.method2368(-129);
            int var110 = class583.field7964.method2357(2);
            class329.method1951(arg0 + 12043);
            class421.method2518(var109, var110, var108, 22634);
            class340 var111 = class121.field1555.method2882(var108, -22087);
            class453.method2745(var111.field4254, var111.field4252, var111.field4236, var109, 8);
            class320.method1911(var111.field4201, var111.field4231, var111.field4197, arg0, var109);
            class320.field3967 = null;
            return true;
        } else if (class447.field6014 == class320.field3967) {
            class115.field1460 = class583.field7964.method2396((byte) 70);
            class43.field593 = class87.field1156;
            class320.field3967 = null;
            return true;
        } else if (class742.field10336 == class320.field3967) {
            class413.field5394 = class87.field1156;
            if (class647.field8807 == 0) {
                class397.field5141 = null;
                class454.field6396 = 0;
                class77.field1049 = null;
                class614.field8250 = null;
                class320.field3967 = null;
                return true;
            }
            class397.field5141 = class583.field7964.method2384(arg0 ^ 0xFFFFE6DC);
            boolean var112 = class583.field7964.method2396((byte) -90) == 1;
            if (var112) {
                class583.field7964.method2384(-6435);
            }
            long var113 = class583.field7964.method2361(94);
            class614.field8250 = class486.method2889(true, var113);
            class770.field10595 = class583.field7964.method2392(arg0 - 60);
            int var115 = class583.field7964.method2396((byte) 118);
            if (var115 == 255) {
                class320.field3967 = null;
                return true;
            }
            class454.field6396 = var115;
            class657[] var116 = new class657[100];
            for (int var117 = 0; var117 < class454.field6396; var117++) {
                var116[var117] = new class657();
                var116[var117].field9053 = class583.field7964.method2384(arg0 ^ 0xFFFFE6DC);
                boolean var123 = class583.field7964.method2396((byte) -80) == 1;
                if (var123) {
                    var116[var117].field9056 = class583.field7964.method2384(-6435);
                } else {
                    var116[var117].field9056 = var116[var117].field9053;
                }
                var116[var117].field9054 = class87.method803(var116[var117].field9056, false);
                var116[var117].field9052 = class583.field7964.method2390((byte) 92);
                var116[var117].field9050 = class583.field7964.method2392(-25);
                var116[var117].field9049 = class583.field7964.method2384(arg0 ^ 0xFFFFE6DC);
                if (var116[var117].field9056.equals(class300.field3596.field7399)) {
                    class137.field1719 = var116[var117].field9050;
                }
            }
            boolean var118 = false;
            int var119 = class454.field6396;
            while (var119 > 0) {
                var119--;
                boolean var120 = true;
                for (int var121 = 0; var121 < var119; var121++) {
                    if (var116[var121].field9054.compareTo(var116[var121 + 1].field9054) > 0) {
                        class657 var122 = var116[var121];
                        var116[var121] = var116[var121 + 1];
                        var116[var121 + 1] = var122;
                        var120 = false;
                    }
                }
                if (var120) {
                    break;
                }
            }
            class320.field3967 = null;
            class77.field1049 = var116;
            return true;
        } else if (class544.field7623 == class320.field3967) {
            int var124 = class583.field7964.method2396((byte) 117);
            int var125 = class583.field7964.method2402((byte) 68);
            class329.method1951(12044);
            if (var124 == 2) {
                class604.method3441(82);
            }
            class131.field1615 = var125;
            class728.method4114(arg0 - 116, var125);
            class413.method2462(false, arg0 ^ 0x4CDB);
            class142.method1043(class131.field1615);
            for (int var126 = 0; var126 < 100; var126++) {
                field2977[var126] = true;
            }
            class320.field3967 = null;
            return true;
        } else if (class71.field988 == class320.field3967) {
            int var127 = class583.field7964.method2402((byte) 116);
            int var128 = class583.field7964.method2381((byte) 41);
            class2.field30.method3384(true, var127, var128);
            class320.field3967 = null;
            return true;
        } else if (class471.field6563 == class320.field3967) {
            class231.method1420(-116);
            class320.field3967 = null;
            return false;
        } else if (class320.field3967 == class228.field2701) {
            String var129 = class583.field7964.method2384(arg0 ^ 0xFFFFE6DC);
            boolean var130 = class583.field7964.method2396((byte) 104) == 1;
            String var131;
            if (var130) {
                var131 = class583.field7964.method2384(-6435);
            } else {
                var131 = var129;
            }
            int var132 = class583.field7964.method2390((byte) -102);
            byte var133 = class583.field7964.method2392(115);
            boolean var134 = false;
            if (var133 == -128) {
                var134 = true;
            }
            if (var134) {
                if (class454.field6396 == 0) {
                    class320.field3967 = null;
                    return true;
                }
                boolean var135 = false;
                int var136;
                for (var136 = 0; var136 < class454.field6396 && (!class77.field1049[var136].field9056.equals(var131) || class77.field1049[var136].field9052 != var132); var136++) {
                }
                if (class454.field6396 > var136) {
                    while (class454.field6396 - 1 > var136) {
                        class77.field1049[var136] = class77.field1049[var136 + 1];
                        var136++;
                    }
                    class454.field6396--;
                    class77.field1049[class454.field6396] = null;
                }
            } else {
                String var137 = class583.field7964.method2384(-6435);
                class657 var138 = new class657();
                var138.field9056 = var131;
                var138.field9053 = var129;
                var138.field9054 = class87.method803(var138.field9056, false);
                var138.field9050 = var133;
                var138.field9049 = var137;
                var138.field9052 = var132;
                int var139;
                for (var139 = class454.field6396 - 1; var139 >= 0; var139--) {
                    int var140 = class77.field1049[var139].field9054.compareTo(var138.field9054);
                    if (var140 == 0) {
                        class77.field1049[var139].field9052 = var132;
                        class77.field1049[var139].field9050 = var133;
                        class77.field1049[var139].field9049 = var137;
                        if (var131.equals(class300.field3596.field7399)) {
                            class137.field1719 = var133;
                        }
                        class413.field5394 = class87.field1156;
                        class320.field3967 = null;
                        return true;
                    }
                    if (var140 < 0) {
                        break;
                    }
                }
                if (class454.field6396 >= class77.field1049.length) {
                    class320.field3967 = null;
                    return true;
                }
                for (int var141 = class454.field6396 - 1; var141 > var139; var141--) {
                    class77.field1049[var141 + 1] = class77.field1049[var141];
                }
                if (class454.field6396 == 0) {
                    class77.field1049 = new class657[100];
                }
                class77.field1049[var139 + 1] = var138;
                class454.field6396++;
                if (var131.equals(class300.field3596.field7399)) {
                    class137.field1719 = var133;
                }
            }
            class413.field5394 = class87.field1156;
            class320.field3967 = null;
            return true;
        } else if (class569.field7812 == class320.field3967) {
            boolean var142 = class583.field7964.method2396((byte) 72) == 1;
            byte[] var143 = new byte[class647.field8807 - 1];
            class583.field7964.method2401(65280, var143, 0, class647.field8807 - 1);
            class54.method482(arg0 + 85, var142, var143);
            class320.field3967 = null;
            return true;
        } else if (class540.field7594 == class320.field3967) {
            class329.method1951(12044);
            class17.method217(arg0 ^ 0xFFFFFFCB);
            class320.field3967 = null;
            return true;
        } else if (class320.field3967 == class157.field1954) {
            class571.method3313(class621.field8526, -102);
            class320.field3967 = null;
            return true;
        } else if (class482.field6729 == class320.field3967) {
            class329.method1951(12044);
            class223.method1373((byte) 59);
            class320.field3967 = null;
            return true;
        } else if (class369.field4586 == class320.field3967) {
            class462.field6489 = class87.field1156;
            class280.field3263 = 1;
            class320.field3967 = null;
            return true;
        } else if (class320.field3967 == class183.field2231) {
            boolean var144 = class583.field7964.method2396((byte) 61) == 1;
            String var145 = class583.field7964.method2384(-6435);
            long var146 = (long) class583.field7964.method2390((byte) -112);
            long var148 = (long) class583.field7964.method2358(87);
            int var150 = class583.field7964.method2396((byte) 50);
            int var151 = class583.field7964.method2390((byte) -123);
            long var152 = (var146 << 32) + var148;
            boolean var154 = false;
            Object var155 = null;
            class330 var156 = var144 ? class227.field2671 : class32.field501;
            if (var156 == null) {
                var154 = true;
            } else {
                label2149: {
                    for (int var157 = 0; var157 < 100; var157++) {
                        if (class132.field1643[var157] == var152) {
                            var154 = true;
                            break label2149;
                        }
                    }
                    if (var150 <= 1 && class764.method4236(var145, arg0 ^ 0xFFFFFFFE)) {
                        var154 = true;
                    }
                }
            }
            if (!var154 && class619.field8334 == 0) {
                class132.field1643[class437.field5755] = var152;
                class437.field5755 = (class437.field5755 + 1) % 100;
                String var158 = class578.field7881.method972(var151, 1).method3766(false, class583.field7964);
                int var159 = var144 ? 42 : 45;
                if (var150 == 2 || var150 == 3) {
                    class215.method1345("<img=1>" + var145, var159, "<img=1>" + var145, var156.field4074, var145, (byte) 114, var158, var151, 0);
                } else if (var150 == 1) {
                    class215.method1345("<img=0>" + var145, var159, "<img=0>" + var145, var156.field4074, var145, (byte) 116, var158, var151, 0);
                } else {
                    class215.method1345(var145, var159, var145, var156.field4074, var145, (byte) 126, var158, var151, 0);
                }
            }
            class320.field3967 = null;
            return true;
        } else if (class448.field6024 == class320.field3967) {
            if (class260.field3075 != null) {
                class121.method947(class118.field1503.field10674.method3823(0), -1, -1, 1, false);
            }
            byte[] var160 = new byte[class647.field8807];
            class583.field7964.method2808(0, arg0 ^ 0x7D83, class647.field8807, var160);
            String var161 = class260.method1555(var160, 0, arg0 + 1999, class647.field8807);
            String var162 = "opensn";
            if (!class171.field2050 || class627.method3554(true, class521.field7389, var162, 1, var161).field7769 == 2) {
                class268.method1589(true, class521.field7389, var162, true, var161, class118.field1503.field10665.method1903(0) == 1);
            }
            class320.field3967 = null;
            return true;
        } else if (class449.field6137 == class320.field3967) {
            boolean var163 = class583.field7964.method2396((byte) -121) == 1;
            String var164 = class583.field7964.method2384(-6435);
            String var165 = var164;
            if (var163) {
                var165 = class583.field7964.method2384(-6435);
            }
            int var166 = class583.field7964.method2396((byte) 48);
            int var167 = class583.field7964.method2390((byte) -102);
            boolean var168 = false;
            if (var166 <= 1 && class764.method4236(var165, -1)) {
                var168 = true;
            }
            if (!var168 && class619.field8334 == 0) {
                String var169 = class578.field7881.method972(var167, 1).method3766(false, class583.field7964);
                if (var166 == 2) {
                    class215.method1345("<img=1>" + var164, 25, "<img=1>" + var165, null, var164, (byte) 110, var169, var167, 0);
                } else if (var166 == 1) {
                    class215.method1345("<img=0>" + var164, 25, "<img=0>" + var165, null, var164, (byte) 127, var169, var167, 0);
                } else {
                    class215.method1345(var164, 25, var165, null, var164, (byte) 122, var169, var167, 0);
                }
            }
            class320.field3967 = null;
            return true;
        } else if (class7.field112 == class320.field3967) {
            class571.method3313(class784.field10829, -70);
            class320.field3967 = null;
            return true;
        } else if (class320.field3967 == class16.field301) {
            byte var170 = class583.field7964.method2413(arg0 - 28138);
            int var171 = class583.field7964.method2386((byte) -105);
            class329.method1951(12044);
            class772.method4276(var171, var170, 1843888288);
            class320.field3967 = null;
            return true;
        } else if (class48.field682 == class320.field3967) {
            int var172 = class583.field7964.method2402((byte) 102);
            int var173 = class583.field7964.method2396((byte) 44);
            class329.method1951(12044);
            class413.method2460((byte) 118, var172, true, var173);
            class320.field3967 = null;
            return true;
        } else if (class548.field7642 == class320.field3967) {
            class479.field6645 = class87.field1156;
            boolean var174 = class583.field7964.method2396((byte) -81) == 1;
            class757 var175 = new class757(class583.field7964);
            class500 var176;
            if (var174) {
                var176 = class621.field8525;
            } else {
                var176 = class504.field7138;
            }
            var175.method4220(84, var176);
            class320.field3967 = null;
            return true;
        } else if (class320.field3967 == class126.field1592) {
            class320.field3967 = null;
            return false;
        } else if (class699.field9504 == class320.field3967) {
            int var177 = class583.field7964.method2390((byte) 30);
            int var178 = class583.field7964.method2357(2);
            class329.method1951(12044);
            class730.method4125(var177, var178, (byte) 57);
            class320.field3967 = null;
            return true;
        } else if (class365.field4541 == class320.field3967) {
            int var179 = class583.field7964.method2414(255);
            int var180 = class583.field7964.method2414(255);
            class329.method1951(12044);
            class596.method3411(0, var179, var180, -15208);
            class320.field3967 = null;
            return true;
        } else if (class399.field5217 == class320.field3967) {
            class268.method1590(arg0 ^ 0xD, class727.field10182);
            class320.field3967 = null;
            return false;
        } else if (class320.field3967 == class267.field3147) {
            class571.method3313(class108.field1361, -94);
            class320.field3967 = null;
            return true;
        } else if (class320.field3967 == class103.field1331) {
            String var181 = class583.field7964.method2384(-6435);
            int var182 = class583.field7964.method2386((byte) -87);
            int var183 = class583.field7964.method2390((byte) -121);
            if (var183 == 65535) {
                var183 = -1;
            }
            int var184 = class583.field7964.method2374((byte) 99);
            if (var182 >= 1 && var182 <= 8) {
                if (var181.equalsIgnoreCase("null")) {
                    var181 = null;
                }
                class473.field6598[var182 - 1] = var181;
                class676.field9277[var182 - 1] = var183;
                class678.field9296[var182 - 1] = var184 == 0;
            }
            class320.field3967 = null;
            return true;
        } else if (class683.field9347 == class320.field3967) {
            int var185 = class583.field7964.method2357(2);
            int var186 = class583.field7964.method2402((byte) 86);
            if (var186 == 65535) {
                var186 = -1;
            }
            class329.method1951(12044);
            class539.method3197(var185, var186, 18);
            class320.field3967 = null;
            return true;
        } else if (class610.field8189 == class320.field3967) {
            class576.field7869 = class647.field8807 > 2 ? class583.field7964.method2384(-6435) : class637.field8701.method3584(class770.field10592, true);
            class302.field3610 = class647.field8807 > 0 ? class583.field7964.method2390((byte) 53) : -1;
            class320.field3967 = null;
            if (class302.field3610 == 65535) {
                class302.field3610 = -1;
            }
            return true;
        } else if (class320.field3967 == class221.field2578) {
            class479.field6645 = class87.field1156;
            boolean var187 = class583.field7964.method2396((byte) 106) == 1;
            if (class647.field8807 != 1) {
                if (var187) {
                    class621.field8525 = new class500(class583.field7964);
                } else {
                    class504.field7138 = new class500(class583.field7964);
                }
                class320.field3967 = null;
                return true;
            }
            class320.field3967 = null;
            if (var187) {
                class621.field8525 = null;
            } else {
                class504.field7138 = null;
            }
            return true;
        } else if (class621.field8521 == class320.field3967) {
            int var188 = class583.field7964.method2396((byte) 89);
            int var189 = var188 >> 5;
            int var190 = var188 & 0x1F;
            if (var190 == 0) {
                class56.field756[var189] = null;
                class320.field3967 = null;
                return true;
            }
            class615 var191 = new class615();
            var191.field8259 = var190;
            var191.field8264 = class583.field7964.method2396((byte) -87);
            if (var191.field8264 >= 0 && class535.field7535.length > var191.field8264) {
                if (var191.field8259 == 1 || var191.field8259 == 10) {
                    var191.field8258 = class583.field7964.method2390((byte) -97);
                    class583.field7964.field5262 += 6;
                } else if (var191.field8259 >= 2 && var191.field8259 <= 6) {
                    if (var191.field8259 == 2) {
                        var191.field8268 = 256;
                        var191.field8261 = 256;
                    }
                    if (var191.field8259 == 3) {
                        var191.field8261 = 0;
                        var191.field8268 = 256;
                    }
                    if (var191.field8259 == 4) {
                        var191.field8268 = 256;
                        var191.field8261 = 512;
                    }
                    if (var191.field8259 == 5) {
                        var191.field8268 = 0;
                        var191.field8261 = 256;
                    }
                    if (var191.field8259 == 6) {
                        var191.field8268 = 512;
                        var191.field8261 = 256;
                    }
                    var191.field8259 = 2;
                    var191.field8266 = class583.field7964.method2396((byte) 69);
                    var191.field8261 += class583.field7964.method2390((byte) -108) - class632.field8626 << 9;
                    var191.field8268 += class583.field7964.method2390((byte) 82) - class620.field8435 << 9;
                    var191.field8260 = class583.field7964.method2396((byte) 66) << 2;
                    var191.field8267 = class583.field7964.method2390((byte) 11);
                }
                var191.field8263 = class583.field7964.method2390((byte) -123);
                if (var191.field8263 == 65535) {
                    var191.field8263 = -1;
                }
                class56.field756[var189] = var191;
            }
            class320.field3967 = null;
            return true;
        } else if (class353.field4388 == class320.field3967) {
            String var192 = class583.field7964.method2384(-6435);
            Object[] var193 = new Object[var192.length() + 1];
            for (int var194 = var192.length() - 1; var194 >= 0; var194--) {
                if (var192.charAt(var194) == 's') {
                    var193[var194 + 1] = class583.field7964.method2384(-6435);
                } else {
                    var193[var194 + 1] = Integer.valueOf(class583.field7964.method2381((byte) 104));
                }
            }
            var193[0] = Integer.valueOf(class583.field7964.method2381((byte) 100));
            class329.method1951(12044);
            class529 var195 = new class529();
            var195.field7477 = var193;
            class142.method1045(var195);
            class320.field3967 = null;
            return true;
        } else if (class615.field8265 == class320.field3967) {
            boolean var196 = class583.field7964.method2396((byte) -80) == 1;
            String var197 = class583.field7964.method2384(-6435);
            String var198 = var197;
            if (var196) {
                var198 = class583.field7964.method2384(-6435);
            }
            long var199 = (long) class583.field7964.method2390((byte) -123);
            long var201 = (long) class583.field7964.method2358(104);
            int var203 = class583.field7964.method2396((byte) -109);
            int var204 = class583.field7964.method2390((byte) -109);
            long var205 = (var199 << 32) + var201;
            boolean var207 = false;
            int var208 = 0;
            while (true) {
                if (var208 >= 100) {
                    if (var203 <= 1 && class764.method4236(var198, -1)) {
                        var207 = true;
                    }
                    break;
                }
                if (class132.field1643[var208] == var205) {
                    var207 = true;
                    break;
                }
                var208++;
            }
            if (!var207 && class619.field8334 == 0) {
                class132.field1643[class437.field5755] = var205;
                class437.field5755 = (class437.field5755 + 1) % 100;
                String var209 = class578.field7881.method972(var204, arg0).method3766(false, class583.field7964);
                if (var203 == 2) {
                    class215.method1345("<img=1>" + var197, 18, "<img=1>" + var198, null, var197, (byte) 114, var209, var204, 0);
                } else if (var203 == 1) {
                    class215.method1345("<img=0>" + var197, 18, "<img=0>" + var198, null, var197, (byte) 115, var209, var204, 0);
                } else {
                    class215.method1345(var197, 18, var198, null, var197, (byte) 117, var209, var204, 0);
                }
            }
            class320.field3967 = null;
            return true;
        } else if (class558.field7748 == class320.field3967) {
            int var210 = class583.field7964.method2386((byte) -125);
            int var211 = class583.field7964.method2396((byte) -114);
            int var212 = class583.field7964.method2414(arg0 ^ 0xFE);
            if (var212 == 65535) {
                var212 = -1;
            }
            class647.method3649(var212, var210, var211, arg0 ^ 0x7F);
            class320.field3967 = null;
            return true;
        } else if (class73.field1001 == class320.field3967) {
            int var213 = class583.field7964.method2421((byte) 45);
            if (var213 == 65535) {
                var213 = -1;
            }
            int var214 = class583.field7964.method2374((byte) 54);
            int var215 = class583.field7964.method2382(-111);
            class531.method3167(var215, false, var213, var214);
            class320.field3967 = null;
            return true;
        } else if (class523.field7417 == class320.field3967) {
            int var216 = class583.field7964.method2415(-118);
            class329.method1951(arg0 ^ 0x2F0D);
            class52 var217 = (class52) class728.field10205.method2121(arg0 ^ 0x42, (long) var216);
            if (var217 != null) {
                class336.method1989(true, false, var217, (byte) 114);
            }
            if (class683.field9354 != null) {
                class576.method3330(class683.field9354, -1);
                class683.field9354 = null;
            }
            class320.field3967 = null;
            return true;
        } else if (class757.field10483 == class320.field3967) {
            boolean var218 = class583.field7964.method2396((byte) 48) == 1;
            String var219 = class583.field7964.method2384(-6435);
            String var220 = var219;
            if (var218) {
                var220 = class583.field7964.method2384(-6435);
            }
            int var221 = class583.field7964.method2396((byte) -88);
            boolean var222 = false;
            if (var221 <= 1) {
                if (!(!class730.field10234 || class633.field8636) || class257.field3052) {
                    var222 = true;
                } else if (var221 <= 1 && class764.method4236(var220, -1)) {
                    var222 = true;
                }
            }
            if (!var222 && class619.field8334 == 0) {
                String var223 = class386.method2265(false, class589.method3385((byte) -100, class583.field7964));
                if (var221 == 2) {
                    class215.method1345("<img=1>" + var219, 24, "<img=1>" + var220, null, var219, (byte) 116, var223, -1, 0);
                } else if (var221 == 1) {
                    class215.method1345("<img=0>" + var219, 24, "<img=0>" + var220, null, var219, (byte) 115, var223, -1, 0);
                } else {
                    class215.method1345(var219, 24, var220, null, var219, (byte) 116, var223, -1, 0);
                }
            }
            class320.field3967 = null;
            return true;
        } else if (class322.field4001 == class320.field3967) {
            boolean var224 = class583.field7964.method2396((byte) 86) == 1;
            String var225 = class583.field7964.method2384(arg0 - 6436);
            String var226 = var225;
            if (var224) {
                var226 = class583.field7964.method2384(-6435);
            }
            long var227 = class583.field7964.method2361(44);
            long var229 = (long) class583.field7964.method2390((byte) -111);
            long var231 = (long) class583.field7964.method2358(125);
            int var233 = class583.field7964.method2396((byte) -123);
            int var234 = class583.field7964.method2390((byte) -115);
            long var235 = (var229 << 32) + var231;
            boolean var237 = false;
            int var238 = 0;
            while (true) {
                if (var238 >= 100) {
                    if (var233 <= 1 && class764.method4236(var226, -1)) {
                        var237 = true;
                    }
                    break;
                }
                if (class132.field1643[var238] == var235) {
                    var237 = true;
                    break;
                }
                var238++;
            }
            if (!var237 && class619.field8334 == 0) {
                class132.field1643[class437.field5755] = var235;
                class437.field5755 = (class437.field5755 + 1) % 100;
                String var239 = class578.field7881.method972(var234, arg0).method3766(false, class583.field7964);
                if (var233 == 2) {
                    class215.method1345("<img=1>" + var225, 20, "<img=1>" + var226, class748.method4179((byte) -65, var227), var225, (byte) 122, var239, var234, 0);
                } else if (var233 == 1) {
                    class215.method1345("<img=0>" + var225, 20, "<img=0>" + var226, class748.method4179((byte) -65, var227), var225, (byte) 116, var239, var234, 0);
                } else {
                    class215.method1345(var225, 20, var226, class748.method4179((byte) -65, var227), var225, (byte) 125, var239, var234, 0);
                }
            }
            class320.field3967 = null;
            return true;
        } else if (class627.field8583 == class320.field3967) {
            class772.field10603 = class583.field7964.method2393((byte) -107);
            class158.field1964 = class583.field7964.method2406(-94) << 3;
            class553.field7695 = class583.field7964.method2406(arg0 - 100) << 3;
            class320.field3967 = null;
            return true;
        } else if (class742.field10347 == class320.field3967) {
            int var240 = class583.field7964.method2381((byte) 27);
            class500.field6989 = class521.field7389.method3804(arg0 + 108, var240);
            class320.field3967 = null;
            return true;
        } else if (class395.field5121 == class320.field3967) {
            int var241 = class583.field7964.method2381((byte) 115);
            int var242 = class583.field7964.method2374((byte) 73);
            int var243 = class583.field7964.method2386((byte) -95);
            class35.field530[var243] = var241;
            class622.field8544[var243] = var242;
            class430.field5668[var243] = 1;
            int var244 = class83.field1130[var243] - 1;
            for (int var245 = 0; var245 < var244; var245++) {
                if (var241 >= class629.field8594[var245]) {
                    class430.field5668[var243] = var245 + 2;
                }
            }
            class223.field2591[class296.method1733(31, class136.field1702++)] = var243;
            class320.field3967 = null;
            return true;
        } else if (class320.field3967 == class12.field217) {
            int var246 = class583.field7964.method2421((byte) 85);
            int var247 = class583.field7964.method2415(-97);
            class329.method1951(12044);
            class49.method461(var246, false, var247);
            class320.field3967 = null;
            return true;
        } else if (class786.field10853 == class320.field3967) {
            boolean var248 = class583.field7964.method2386((byte) -81) == 1;
            class329.method1951(12044);
            class320.field3967 = null;
            class448.field6025 = var248;
            return true;
        } else if (class674.field9241 == class320.field3967) {
            int var249 = class583.field7964.method2393((byte) -107);
            int var250 = class583.field7964.method2393((byte) -107);
            if (var249 == 255) {
                var250 = -1;
                var249 = -1;
            }
            class110.method881(var250, 255, var249);
            class320.field3967 = null;
            return true;
        } else if (class727.field10175 == class320.field3967) {
            class90.method816(true);
            class320.field3967 = null;
            return false;
        } else if (class542.field7610 == class320.field3967) {
            if (class451.method2741(class289.field3493, 0)) {
                class359.field4466 = (int) ((float) class583.field7964.method2390((byte) -107) * 2.5F);
            } else {
                class359.field4466 = class583.field7964.method2390((byte) -103) * 30;
            }
            class320.field3967 = null;
            class43.field593 = class87.field1156;
            return true;
        } else if (class614.field8255 == class320.field3967) {
            String var251 = class583.field7964.method2384(-6435);
            int var252 = class583.field7964.method2414(arg0 ^ 0xFE);
            class329.method1951(12044);
            class179.method1208(var251, 2, var252);
            class320.field3967 = null;
            return true;
        } else if (class515.field7260 == class320.field3967) {
            class52.method474(arg0 + 25713);
            class320.field3967 = null;
            return true;
        } else if (class320.field3967 == class116.field1478) {
            int var253 = class583.field7964.method2374((byte) 62);
            int var254 = class583.field7964.method2414(255) << 2;
            int var255 = class583.field7964.method2386((byte) -117);
            int var256 = class583.field7964.method2386((byte) -83);
            int var257 = class583.field7964.method2386((byte) -116);
            class329.method1951(12044);
            class672.method3777(arg0 + 124, var253, var255, var256, var257, var254);
            class320.field3967 = null;
            return true;
        } else if (class733.field10255 == class320.field3967) {
            int var258 = class583.field7964.method2374((byte) 103);
            int var259 = class583.field7964.method2368(-129);
            class329.method1951(12044);
            class289.method1697(-107, var259, var258);
            class320.field3967 = null;
            return true;
        } else if (class728.field10190 == class320.field3967) {
            int var260 = class583.field7964.method2402((byte) 67);
            class329.method1951(12044);
            class652.method3684(true, var260);
            class320.field3967 = null;
            return true;
        } else if (class320.field3967 == class217.field2551) {
            class772.field10603 = class583.field7964.method2386((byte) -83);
            class553.field7695 = class583.field7964.method2413(-28137) << 3;
            class158.field1964 = class583.field7964.method2413(-28137) << 3;
            for (class667 var261 = (class667) class673.field9230.method2119(arg0 ^ 0xFFFFFFB7); var261 != null; var261 = (class667) class673.field9230.method2111((byte) -128)) {
                int var264 = (int) (var261.field4809 >> 28 & 0x3L);
                int var265 = (int) (var261.field4809 & 0x3FFFL);
                int var266 = var265 - class632.field8626;
                int var267 = (int) (var261.field4809 >> 14 & 0x3FFFL);
                int var268 = var267 - class620.field8435;
                if (class772.field10603 == var264 && var266 >= class158.field1964 && (class158.field1964 + 8) > var266 && var268 >= class553.field7695 && class553.field7695 + 8 > var268) {
                    var261.method2219(13630);
                    if (var266 >= 0 && var268 >= 0 && var266 < class596.field8090 && var268 < class107.field1350) {
                        class650.method3676(var266, arg0 ^ 0x8551DBA8, class772.field10603, var268);
                    }
                }
            }
            for (class88 var262 = (class88) class83.field1126.method2725(arg0 ^ 0x24); var262 != null; var262 = (class88) class83.field1126.method2726(-119)) {
                if (class158.field1964 <= var262.field1176 && (class158.field1964 + 8) > var262.field1176 && class553.field7695 <= var262.field1179 && (class553.field7695 + 8) > var262.field1179 && class772.field10603 == var262.field1182) {
                    var262.field1184 = true;
                }
            }
            for (class88 var263 = (class88) class651.field8995.method2725(37); var263 != null; var263 = (class88) class651.field8995.method2726(-120)) {
                if (class158.field1964 <= var263.field1176 && (class158.field1964 + 8) > var263.field1176 && class553.field7695 <= var263.field1179 && class553.field7695 + 8 > var263.field1179 && class772.field10603 == var263.field1182) {
                    var263.field1184 = true;
                }
            }
            class320.field3967 = null;
            return true;
        } else if (class50.field704 == class320.field3967) {
            class293.field3513 = class87.field1156;
            boolean var269 = class583.field7964.method2396((byte) 60) == 1;
            class569 var270 = new class569(class583.field7964);
            class330 var271;
            if (var269) {
                var271 = class227.field2671;
            } else {
                var271 = class32.field501;
            }
            var270.method3292(var271, (byte) 124);
            class320.field3967 = null;
            return true;
        } else if (class320.field3967 == class16.field302) {
            int var272 = class583.field7964.method2402((byte) 113);
            String var273 = class583.field7964.method2384(-6435);
            class329.method1951(12044);
            class179.method1208(var273, 2, var272);
            class320.field3967 = null;
            return true;
        } else if (class320.field3967 == class313.field3857) {
            class60.field803 = class583.field7964.method2396((byte) 46);
            for (int var274 = 0; var274 < class60.field803; var274++) {
                class86.field1151[var274] = class583.field7964.method2384(arg0 - 6436);
                class645.field8786[var274] = class583.field7964.method2384(-6435);
                if (class645.field8786[var274].equals("")) {
                    class645.field8786[var274] = class86.field1151[var274];
                }
                class115.field1457[var274] = class583.field7964.method2384(-6435);
                class641.field8755[var274] = class583.field7964.method2384(-6435);
                if (class641.field8755[var274].equals("")) {
                    class641.field8755[var274] = class115.field1457[var274];
                }
                class119.field1515[var274] = false;
            }
            class320.field3967 = null;
            class462.field6489 = class87.field1156;
            return true;
        } else if (class622.field8536 == class320.field3967) {
            int var275 = class583.field7964.method2390((byte) -1);
            class329.method1951(12044);
            class533.method3173(var275, arg0 ^ 0x63C5);
            class320.field3967 = null;
            return true;
        } else if (class320.field3967 == class291.field3503) {
            int var276 = class583.field7964.method2396((byte) 114);
            boolean var277 = (var276 & 0x1) == 1;
            String var278 = class583.field7964.method2384(-6435);
            String var279 = class583.field7964.method2384(-6435);
            if (var279.equals("")) {
                var279 = var278;
            }
            String var280 = class583.field7964.method2384(-6435);
            String var281 = class583.field7964.method2384(-6435);
            if (var281.equals("")) {
                var281 = var280;
            }
            if (var277) {
                for (int var282 = 0; var282 < class60.field803; var282++) {
                    if (class645.field8786[var282].equals(var281)) {
                        class86.field1151[var282] = var278;
                        class645.field8786[var282] = var279;
                        class115.field1457[var282] = var280;
                        class641.field8755[var282] = var281;
                        break;
                    }
                }
            } else {
                class86.field1151[class60.field803] = var278;
                class645.field8786[class60.field803] = var279;
                class115.field1457[class60.field803] = var280;
                class641.field8755[class60.field803] = var281;
                class119.field1515[class60.field803] = class296.method1733(var276, 2) == 2;
                class60.field803++;
            }
            class320.field3967 = null;
            class462.field6489 = class87.field1156;
            return true;
        } else if (class547.field7634 == class320.field3967) {
            if (class260.field3075 != null) {
                class121.method947(class118.field1503.field10674.method3823(0), -1, -1, arg0, false);
            }
            byte[] var283 = new byte[class647.field8807];
            class583.field7964.method2808(0, arg0 ^ 0x7D83, class647.field8807, var283);
            String var284 = class260.method1555(var283, 0, arg0 + 1999, class647.field8807);
            class784.method4344(-64, class521.field7389, var284, true, class118.field1503.field10665.method1903(0) == 1);
            class320.field3967 = null;
            return true;
        } else if (class41.field579 == class320.field3967) {
            class553.field7695 = class583.field7964.method2392(125) << 3;
            class772.field10603 = class583.field7964.method2393((byte) -107);
            class158.field1964 = class583.field7964.method2362((byte) 107) << 3;
            while (class583.field7964.field5262 < class647.field8807) {
                class684 var285 = class299.method1749((byte) 60)[class583.field7964.method2396((byte) -127)];
                class571.method3313(var285, -77);
            }
            class320.field3967 = null;
            return true;
        } else if (class467.field6532 == class320.field3967) {
            int var286 = class583.field7964.method2418(-28075);
            int var287 = class583.field7964.method2368(arg0 ^ 0xFFFFFF7E);
            int var288 = class583.field7964.method2365(true);
            class329.method1951(12044);
            class761.method4229(var287, 11, var286, var288);
            class320.field3967 = null;
            return true;
        } else if (class320.field3967 == class131.field1618) {
            int var289 = class583.field7964.method2390((byte) -108);
            if (var289 == 65535) {
                var289 = -1;
            }
            int var290 = class583.field7964.method2396((byte) -114);
            int var291 = class583.field7964.method2390((byte) 110);
            int var292 = class583.field7964.method2396((byte) -96);
            int var293 = class583.field7964.method2390((byte) -3);
            class731.method4131(arg0 - 1, var293, var292, var290, var289, false, var291);
            class320.field3967 = null;
            return true;
        } else if (class484.field6746 == class320.field3967) {
            int var294 = class583.field7964.method2402((byte) 77);
            if (var294 == 65535) {
                var294 = -1;
            }
            int var295 = class583.field7964.method2390((byte) 15);
            int var296 = class583.field7964.method2381((byte) 29);
            int var297 = class583.field7964.method2390((byte) 16);
            if (var297 == 65535) {
                var297 = -1;
            }
            class329.method1951(12044);
            for (int var298 = var297; var298 <= var294; var298++) {
                long var299 = ((long) var296 << 32) + (long) var298;
                class396 var301 = (class396) class539.field7586.method2121(117, var299);
                class396 var302;
                if (var301 != null) {
                    var302 = new class396(var301.field5126, var295);
                    var301.method2219(13630);
                } else if (var298 == -1) {
                    var302 = new class396(class479.method2848(var296, (byte) 122).field8440.field5126, var295);
                } else {
                    var302 = new class396(0, var295);
                }
                class539.field7586.method2112(var302, (byte) 6, var299);
            }
            class320.field3967 = null;
            return true;
        } else if (class320.field3967 == class146.field1829) {
            class571.method3313(class448.field6019, -108);
            class320.field3967 = null;
            return true;
        } else if (class543.field7620 == class320.field3967) {
            int var303 = class583.field7964.method2415(arg0 ^ 0xFFFFFF86);
            class329.method1951(12044);
            class323.method1928(-1, -1, 3, (byte) -79, var303);
            class320.field3967 = null;
            return true;
        } else if (class519.field7332 == class320.field3967) {
            class268.method1590(arg0 ^ 0xD, false);
            class320.field3967 = null;
            return false;
        } else if (class50.field702 == class320.field3967) {
            int var304 = class583.field7964.method2396((byte) -125);
            int var305 = class583.field7964.method2402((byte) 71);
            boolean var306 = (var304 & 0x1) == 1;
            class270.method1595(var306, var305, 38);
            class151.field1890[class296.method1733(class382.field4890++, 31)] = var305;
            class320.field3967 = null;
            return true;
        } else if (class34.field525 == class320.field3967) {
            class571.method3313(class708.field9944, arg0 ^ 0xFFFFFFA5);
            class320.field3967 = null;
            return true;
        } else if (class765.field10539 == class320.field3967) {
            int var307 = class583.field7964.method2386((byte) -103);
            int var308 = class583.field7964.method2402((byte) 106);
            int var309 = class583.field7964.method2381((byte) 41);
            int var310 = class583.field7964.method2390((byte) 112);
            int var311 = class583.field7964.method2421((byte) 57);
            int var312 = class583.field7964.method2393((byte) -107);
            int var313 = var312 & 0x7;
            int var314 = (var312 & 0x7F) >> 3;
            if (var314 == 15) {
                var314 = -1;
            }
            if ((var309 >> 30) != 0) {
                int var344 = var309 >> 28 & 0x3;
                int var345 = (var309 >> 14 & 0x3FFF) - class632.field8626;
                int var346 = (var309 & 0x3FFF) - class620.field8435;
                if (var345 >= 0 && var346 >= 0 && class596.field8090 > var345 && var346 < class107.field1350) {
                    int var347 = var345 * 512 + 256;
                    int var348 = var346 * 512 + 256;
                    int var349 = var344;
                    if (var344 < 3 && class77.method708(var345, arg0 ^ 0xF4F9E4ED, var346)) {
                        var349 = var344 + 1;
                    }
                    class390 var350 = new class390(var308, var310, class228.field2707, var344, var349, var347, class483.method2867(var344, (byte) -95, var348, var347) - var311, var348, var345, var345, var346, var346, var313);
                    class153.field1909.method2732(new class448(var350), 21939);
                }
            } else if (var309 >> 29 != 0) {
                int var315 = var309 & 0xFFFF;
                class273 var316 = (class273) class30.field444.method2121(116, (long) var315);
                if (var316 != null) {
                    class388 var317 = var316.field3210;
                    class687 var318 = var317.field3439[var307];
                    if (var308 == 65535) {
                        var308 = -1;
                    }
                    boolean var319 = true;
                    int var320 = var318.field9372;
                    if (var308 != -1 && var320 != -1) {
                        if (var308 == var320) {
                            class308 var321 = class740.field10303.method1473(-44, var308);
                            if (var321.field3804 && var321.field3824 != -1) {
                                class582 var322 = class362.field4504.method3600(-40, var321.field3824);
                                int var323 = var322.field7941;
                                if (var323 == 0 || var323 == 2) {
                                    var319 = false;
                                } else if (var323 == 1) {
                                    var319 = true;
                                }
                            }
                        } else {
                            class308 var324 = class740.field10303.method1473(-106, var308);
                            class308 var325 = class740.field10303.method1473(-82, var320);
                            if (var324.field3824 != -1 && var325.field3824 != -1) {
                                class582 var326 = class362.field4504.method3600(-59, var324.field3824);
                                class582 var327 = class362.field4504.method3600(-76, var325.field3824);
                                if (var327.field7947 > var326.field7947) {
                                    var319 = false;
                                }
                            }
                        }
                    }
                    if (var319) {
                        var318.field9372 = var308;
                        var318.field9374 = var311;
                        var318.field9367 = var313;
                        var318.field9365 = 1;
                        var318.field9366 = 0;
                        var318.field9370 = 0;
                        var318.field9378 = var314;
                        var318.field9369 = class228.field2707 + var310;
                        if (var318.field9372 == 65535) {
                            var318.field9372 = -1;
                        }
                        if (class228.field2707 < var318.field9369) {
                            var318.field9366 = -1;
                        }
                        if (var318.field9372 != -1 && class228.field2707 == var318.field9369) {
                            int var328 = class740.field10303.method1473(arg0 - 116, var318.field9372).field3824;
                            if (var328 != -1) {
                                class582 var329 = class362.field4504.method3600(arg0 - 72, var328);
                                if (var329 != null && var329.field7955 != null && !var317.field3363) {
                                    class60.method520(0, (byte) -71, var317, var329);
                                }
                            }
                        }
                    }
                }
            } else if (var309 >> 28 != 0) {
                int var330 = var309 & 0xFFFF;
                class521 var331;
                if (class782.field10790 == var330) {
                    var331 = class300.field3596;
                } else {
                    var331 = class61.field825[var330];
                }
                if (var331 != null) {
                    if (var308 == 65535) {
                        var308 = -1;
                    }
                    class687 var332 = var331.field3439[var307];
                    boolean var333 = true;
                    int var334 = var332.field9372;
                    if (var308 != -1 && var334 != -1) {
                        if (var308 == var334) {
                            class308 var339 = class740.field10303.method1473(-35, var308);
                            if (var339.field3804 && var339.field3824 != -1) {
                                class582 var340 = class362.field4504.method3600(arg0 ^ 0xFFFFFFAA, var339.field3824);
                                int var341 = var340.field7941;
                                if (var341 == 0 || var341 == 2) {
                                    var333 = false;
                                } else if (var341 == 1) {
                                    var333 = true;
                                }
                            }
                        } else {
                            class308 var335 = class740.field10303.method1473(-55, var308);
                            class308 var336 = class740.field10303.method1473(arg0 - 77, var334);
                            if (var335.field3824 != -1 && var336.field3824 != -1) {
                                class582 var337 = class362.field4504.method3600(-97, var335.field3824);
                                class582 var338 = class362.field4504.method3600(arg0 ^ 0xFFFFFFBD, var336.field3824);
                                if (var338.field7947 > var337.field7947) {
                                    var333 = false;
                                }
                            }
                        }
                    }
                    if (var333) {
                        var332.field9374 = var311;
                        var332.field9367 = var313;
                        var332.field9378 = var314;
                        var332.field9369 = class228.field2707 + var310;
                        var332.field9365 = 1;
                        var332.field9366 = 0;
                        var332.field9372 = var308;
                        var332.field9370 = 0;
                        if (var332.field9369 > class228.field2707) {
                            var332.field9366 = -1;
                        }
                        if (var332.field9372 == 65535) {
                            var332.field9372 = -1;
                        }
                        if (var332.field9372 != -1 && class228.field2707 == var332.field9369) {
                            int var342 = class740.field10303.method1473(arg0 - 118, var332.field9372).field3824;
                            if (var342 != -1) {
                                class582 var343 = class362.field4504.method3600(-103, var342);
                                if (var343 != null && var343.field7955 != null && !var331.field3363) {
                                    class60.method520(0, (byte) -69, var331, var343);
                                }
                            }
                        }
                    }
                }
            }
            class320.field3967 = null;
            return true;
        } else if (class64.field875 == class320.field3967) {
            int var351 = class583.field7964.method2402((byte) 124);
            int var352 = class583.field7964.method2357(2);
            class2.field30.method3380(var352, var351, -1);
            class320.field3967 = null;
            return true;
        } else if (class427.field5652 == class320.field3967) {
            int var353 = class583.field7964.method2390((byte) 85);
            int var354 = class583.field7964.method2396((byte) -96);
            boolean var355 = (var354 & 0x1) == 1;
            class82.method777(var353, 0, var355);
            int var356 = class583.field7964.method2390((byte) -124);
            for (int var357 = 0; var357 < var356; var357++) {
                int var358 = class583.field7964.method2414(255);
                int var359 = class583.field7964.method2396((byte) -89);
                if (var359 == 255) {
                    var359 = class583.field7964.method2415(-92);
                }
                class41.method340(var359, var353, var358 - 1, -1, var355, var357);
            }
            class151.field1890[class296.method1733(31, class382.field4890++)] = var353;
            class320.field3967 = null;
            return true;
        } else if (class320.field3967 == class224.field2624) {
            int var360 = class583.field7964.method2368(arg0 - 130);
            class329.method1951(12044);
            class323.method1928(class782.field10790, 0, 5, (byte) -79, var360);
            class320.field3967 = null;
            return true;
        } else if (class320.field3967 == class165.field2021) {
            class571.method3313(class555.field7725, arg0 - 105);
            class320.field3967 = null;
            return true;
        } else if (class748.field10389 == class320.field3967) {
            class571.method3313(class283.field3281, -90);
            class320.field3967 = null;
            return true;
        } else if (class678.field9299 == class320.field3967) {
            int var361 = class583.field7964.method2354((byte) -125);
            int var362 = class583.field7964.method2381((byte) 35);
            int var363 = class583.field7964.method2396((byte) 124);
            String var364 = "";
            String var365 = var364;
            if ((var363 & 0x1) != 0) {
                var364 = class583.field7964.method2384(arg0 ^ 0xFFFFE6DC);
                if ((var363 & 0x2) == 0) {
                    var365 = var364;
                } else {
                    var365 = class583.field7964.method2384(-6435);
                }
            }
            String var366 = class583.field7964.method2384(-6435);
            if (var361 == 99) {
                class793.method4374(0, var366);
            } else if (var365.equals("") || !class764.method4236(var365, -1)) {
                class318.method1873(var364, var366, (byte) 40, var364, var365, var361, var362);
            } else {
                class320.field3967 = null;
                return true;
            }
            class320.field3967 = null;
            return true;
        } else if (class622.field8547 == class320.field3967) {
            int var367 = class583.field7964.method2396((byte) 53);
            int var368 = class583.field7964.method2390((byte) -126);
            int var369 = class583.field7964.method2386((byte) -106);
            int var370 = class583.field7964.method2374((byte) 59);
            int var371 = class583.field7964.method2374((byte) 58);
            class329.method1951(12044);
            class461.field6476[var369] = true;
            class53.field718[var369] = var367;
            class534.field7526[var369] = var371;
            class348.field4349[var369] = var370;
            class571.field7841[var369] = var368;
            class320.field3967 = null;
            return true;
        } else if (class342.field4286 == class320.field3967) {
            boolean var372 = class583.field7964.method2396((byte) 16) == 1;
            String var373 = class583.field7964.method2384(-6435);
            String var374 = var373;
            if (var372) {
                var374 = class583.field7964.method2384(-6435);
            }
            long var375 = class583.field7964.method2361(93);
            long var377 = (long) class583.field7964.method2390((byte) -99);
            long var379 = (long) class583.field7964.method2358(114);
            int var381 = class583.field7964.method2396((byte) 101);
            long var382 = (var377 << 32) + var379;
            boolean var384 = false;
            int var385 = 0;
            while (true) {
                if (var385 >= 100) {
                    if (var381 <= 1) {
                        if (!(!class730.field10234 || class633.field8636) || class257.field3052) {
                            var384 = true;
                        } else if (class764.method4236(var374, -1)) {
                            var384 = true;
                        }
                    }
                    break;
                }
                if (class132.field1643[var385] == var382) {
                    var384 = true;
                    break;
                }
                var385++;
            }
            if (!var384 && class619.field8334 == 0) {
                class132.field1643[class437.field5755] = var382;
                class437.field5755 = (class437.field5755 + 1) % 100;
                String var386 = class386.method2265(false, class589.method3385((byte) -122, class583.field7964));
                if (var381 == 2 || var381 == 3) {
                    class215.method1345("<img=1>" + var373, 9, "<img=1>" + var374, class748.method4179((byte) -65, var375), var373, (byte) 112, var386, -1, 0);
                } else if (var381 == 1) {
                    class215.method1345("<img=0>" + var373, 9, "<img=0>" + var374, class748.method4179((byte) -65, var375), var373, (byte) 124, var386, -1, 0);
                } else {
                    class215.method1345(var373, 9, var374, class748.method4179((byte) -65, var375), var373, (byte) 111, var386, -1, 0);
                }
            }
            class320.field3967 = null;
            return true;
        } else if (class536.field7549 == class320.field3967) {
            int var387 = class583.field7964.method2414(255);
            byte var388 = class583.field7964.method2406(-122);
            class2.field30.method3384(true, var387, var388);
            class320.field3967 = null;
            return true;
        } else if (class682.field9331 == class320.field3967) {
            String var389 = class583.field7964.method2384(-6435);
            int var390 = class583.field7964.method2390((byte) -113);
            String var391 = class578.field7881.method972(var390, 1).method3766(false, class583.field7964);
            class215.method1345(var389, 19, var389, null, var389, (byte) 122, var391, var390, 0);
            class320.field3967 = null;
            return true;
        } else if (class320.field3967 == class286.field3353) {
            int var392 = class583.field7964.method2402((byte) 86);
            int var393 = class583.field7964.method2402((byte) 84);
            int var394 = class583.field7964.method2357(arg0 + 1);
            int var395 = class583.field7964.method2402((byte) 77);
            class329.method1951(arg0 ^ 0x2F0D);
            class453.method2745(var392, var395, var393, var394, 8);
            class320.field3967 = null;
            return true;
        } else if (class320.field3967 == class139.field1729) {
            class131.field1619 = class583.field7964.method2396((byte) -127);
            class8.field136 = class583.field7964.method2393((byte) -107);
            class320.field3967 = null;
            return true;
        } else if (class587.field7996 == class320.field3967) {
            class2.field30.method3377((byte) -76);
            class230.field2736 += 32;
            class320.field3967 = null;
            return true;
        } else if (class357.field4423 == class320.field3967) {
            String var396 = class583.field7964.method2384(-6435);
            String var397 = class386.method2265(false, class589.method3385((byte) -127, class583.field7964));
            class318.method1873(var396, var397, (byte) 4, var396, var396, 6, 0);
            class320.field3967 = null;
            return true;
        } else if (class90.field1197 == class320.field3967) {
            int var398 = class583.field7964.method2357(arg0 ^ 0x3);
            int var399 = class583.field7964.method2421((byte) 98);
            class329.method1951(arg0 + 12043);
            class699.method3887((byte) 107, var399, var398);
            class320.field3967 = null;
            return true;
        } else if (class320.field3967 == class111.field1394) {
            class301.method1756(16, class583.field7964.method2384(-6435));
            class320.field3967 = null;
            return true;
        } else if (class513.field7241 == class320.field3967) {
            int var400 = class583.field7964.method2386((byte) -89);
            int var401 = class583.field7964.method2421((byte) 102) << 2;
            int var402 = class583.field7964.method2374((byte) 111);
            int var403 = class583.field7964.method2396((byte) 62);
            int var404 = class583.field7964.method2386((byte) -110);
            class329.method1951(arg0 + 12043);
            class347.method2062(var400, var403, var401, var402, -48, true, var404);
            class320.field3967 = null;
            return true;
        } else if (class320.field3967 == class137.field1716) {
            class571.method3313(class656.field9047, -117);
            class320.field3967 = null;
            return true;
        } else if (class320.field3967 == class138.field1726) {
            class571.method3313(class96.field1251, -79);
            class320.field3967 = null;
            return true;
        } else if (class56.field754 == class320.field3967) {
            int var405 = class583.field7964.method2390((byte) 66);
            int var406 = class583.field7964.method2393((byte) -107);
            class2.field30.method3380(var406, var405, -1);
            class320.field3967 = null;
            return true;
        } else if (class353.field4393 == class320.field3967) {
            class716.method4048(0);
            class320.field3967 = null;
            return true;
        } else if (class594.field8077 == class320.field3967) {
            class571.method3313(class164.field2009, -117);
            class320.field3967 = null;
            return true;
        } else if (class629.field8598 == class320.field3967) {
            class571.method3313(class201.field2409, -102);
            class320.field3967 = null;
            return true;
        } else if (class662.field9091 == class320.field3967) {
            for (int var407 = 0; var407 < class61.field825.length; var407++) {
                if (class61.field825[var407] != null) {
                    class61.field825[var407].field3430 = null;
                    class61.field825[var407].field3420 = -1;
                }
            }
            for (int var408 = 0; var408 < class370.field4599; var408++) {
                class616.field8293[var408].field3210.field3430 = null;
                class616.field8293[var408].field3210.field3420 = -1;
            }
            class320.field3967 = null;
            return true;
        } else if (class41.field575 == class320.field3967) {
            int var409 = class583.field7964.method2402((byte) 91);
            if (var409 == 65535) {
                var409 = -1;
            }
            int var410 = class583.field7964.method2386((byte) -123);
            int var411 = var410 >> 2;
            int var412 = var410 & 0x3;
            int var413 = class56.field760[var411];
            int var414 = class583.field7964.method2381((byte) 105);
            int var415 = var414 >> 28 & 0x3;
            int var416 = var414 >> 14 & 0x3FFF;
            int var417 = var414 & 0x3FFF;
            int var418 = var416 - class632.field8626;
            int var419 = var417 - class620.field8435;
            class10.method172((byte) -106, var418, var411, var419, var413, var409, var412, var415);
            class320.field3967 = null;
            return true;
        } else if (class632.field8624 == class320.field3967) {
            class41.field578 = class583.field7964.method2387(false);
            class730.field10234 = class583.field7964.method2396((byte) -94) == 1;
            class320.field3967 = null;
            return true;
        } else if (class501.field7027 == class320.field3967) {
            boolean var420 = class583.field7964.method2396((byte) 111) == 1;
            String var421 = class583.field7964.method2384(-6435);
            long var422 = (long) class583.field7964.method2390((byte) -125);
            long var424 = (long) class583.field7964.method2358(65);
            int var426 = class583.field7964.method2396((byte) -92);
            long var427 = (var422 << 32) + var424;
            boolean var429 = false;
            Object var430 = null;
            class330 var431 = var420 ? class227.field2671 : class32.field501;
            if (var431 == null) {
                var429 = true;
            } else {
                label2198: {
                    for (int var432 = 0; var432 < 100; var432++) {
                        if (class132.field1643[var432] == var427) {
                            var429 = true;
                            break label2198;
                        }
                    }
                    if (var426 <= 1) {
                        if (!(!class730.field10234 || class633.field8636) || class257.field3052) {
                            var429 = true;
                        } else if (class764.method4236(var421, -1)) {
                            var429 = true;
                        }
                    }
                }
            }
            if (!var429 && class619.field8334 == 0) {
                class132.field1643[class437.field5755] = var427;
                class437.field5755 = (class437.field5755 + 1) % 100;
                String var433 = class386.method2265(false, class589.method3385((byte) -115, class583.field7964));
                int var434 = var420 ? 41 : 44;
                if (var426 == 2 || var426 == 3) {
                    class215.method1345("<img=1>" + var421, var434, "<img=1>" + var421, var431.field4074, var421, (byte) 119, var433, -1, 0);
                } else if (var426 == 1) {
                    class215.method1345("<img=0>" + var421, var434, "<img=0>" + var421, var431.field4074, var421, (byte) 123, var433, -1, 0);
                } else {
                    class215.method1345(var421, var434, var421, var431.field4074, var421, (byte) 120, var433, -1, 0);
                }
            }
            class320.field3967 = null;
            return true;
        } else if (class320.field3967 == class308.field3828) {
            class618.field8327 = class583.field7964.method2365(true);
            class43.field593 = class87.field1156;
            class320.field3967 = null;
            return true;
        } else if (class320.field3967 == class117.field1494) {
            int var435 = class583.field7964.method2396((byte) 46);
            if (class583.field7964.method2396((byte) 84) == 0) {
                class536.field7550[var435] = new class264();
            } else {
                class583.field7964.field5262--;
                class536.field7550[var435] = new class264(class583.field7964);
            }
            class320.field3967 = null;
            class331.field4098 = class87.field1156;
            return true;
        } else if (class320.field3967 == class31.field493) {
            int var436 = class583.field7964.method2390((byte) 40);
            class521 var437;
            if (class782.field10790 == var436) {
                var437 = class300.field3596;
            } else {
                var437 = class61.field825[var436];
            }
            if (var437 == null) {
                class320.field3967 = null;
                return true;
            }
            int var438 = class583.field7964.method2390((byte) 124);
            int var439 = class583.field7964.method2396((byte) 79);
            boolean var440 = (var438 & 0x8000) != 0;
            if (var437.field7399 != null && var437.field7387 != null) {
                boolean var441 = false;
                if (var439 <= 1) {
                    if (!var440 && !(!class730.field10234 || class633.field8636) || class257.field3052) {
                        var441 = true;
                    } else if (class764.method4236(var437.field7399, -1)) {
                        var441 = true;
                    }
                }
                if (!var441 && class619.field8334 == 0) {
                    int var442 = -1;
                    String var443;
                    if (var440) {
                        var438 &= 0x7FFF;
                        class653 var444 = class348.method2064((byte) 67, class583.field7964);
                        var442 = var444.field9014;
                        var443 = var444.field9012.method3766(false, class583.field7964);
                    } else {
                        var443 = class386.method2265(false, class589.method3385((byte) -127, class583.field7964));
                    }
                    var437.field3381 = var443.trim();
                    var437.field3437 = 150;
                    var437.field3432 = var438 & 0xFF;
                    var437.field3384 = var438 >> 8;
                    int var445;
                    if (var439 == 1 || var439 == 2) {
                        var445 = var440 ? 17 : 1;
                    } else {
                        var445 = var440 ? 17 : 2;
                    }
                    if (var439 == 2) {
                        class215.method1345("<img=1>" + var437.method3123(true, true), var445, "<img=1>" + var437.method3122(1119, false), null, var437.field7395, (byte) 117, var443, var442, 0);
                    } else if (var439 == 1) {
                        class215.method1345("<img=0>" + var437.method3123(true, true), var445, "<img=0>" + var437.method3122(1119, false), null, var437.field7395, (byte) 125, var443, var442, 0);
                    } else {
                        class215.method1345(var437.method3123(true, true), var445, var437.method3122(1119, false), null, var437.field7395, (byte) 110, var443, var442, 0);
                    }
                }
            }
            class320.field3967 = null;
            return true;
        } else if (class786.field10854 == class320.field3967) {
            int var446 = class583.field7964.method2386((byte) -94);
            int var447 = class583.field7964.method2368(-129);
            int var448 = class583.field7964.method2390((byte) -100);
            class329.method1951(12044);
            class52 var449 = (class52) class728.field10205.method2121(125, (long) var447);
            if (var449 != null) {
                class336.method1989(var449.field713 != var448, false, var449, (byte) 117);
            }
            class229.method1411(var447, false, var446, var448, 32);
            class320.field3967 = null;
            return true;
        } else if (class648.field8835 == class320.field3967) {
            byte var450 = class583.field7964.method2413(-28137);
            int var451 = class583.field7964.method2414(255);
            class329.method1951(12044);
            class730.method4125(var451, var450, (byte) 57);
            class320.field3967 = null;
            return true;
        } else if (class657.field9057 == class320.field3967) {
            int var452 = class583.field7964.method2415(arg0 - 87);
            int var453 = class583.field7964.method2368(-129);
            class329.method1951(12044);
            class52 var454 = (class52) class728.field10205.method2121(arg0 + 109, (long) var452);
            class52 var455 = (class52) class728.field10205.method2121(90, (long) var453);
            if (var455 != null) {
                class336.method1989(var454 == null || var454.field713 != var455.field713, false, var455, (byte) 83);
            }
            if (var454 != null) {
                var454.method2219(13630);
                class728.field10205.method2112(var454, (byte) 6, (long) var453);
            }
            class620 var456 = class479.method2848(var452, (byte) -50);
            if (var456 != null) {
                class576.method3330(var456, arg0 ^ 0xFFFFFFFE);
            }
            class620 var457 = class479.method2848(var453, (byte) -118);
            if (var457 != null) {
                class576.method3330(var457, -1);
                class690.method3851(true, 17959, var457);
            }
            if (class131.field1615 != -1) {
                class314.method1853(class131.field1615, 1, arg0 - 45);
            }
            class320.field3967 = null;
            return true;
        } else {
            class705.method4008(null, "T1 - " + (class320.field3967 == null ? -1 : class320.field3967.method3409(118)) + "," + (class322.field3995 == null ? -1 : class322.field3995.method3409(118)) + "," + (class102.field1321 == null ? -1 : class102.field1321.method3409(arg0 + 116)) + " - " + class647.field8807, arg0 ^ 0xFFFFFF85);
            class268.method1590(12, false);
            return true;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(BIIII)Z", line = 3532)
    public static final boolean method1517(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = -122 % ((86 - arg0) / 36);
        field2974++;
        if (!class775.field10694 || !class722.field10132) {
            return false;
        } else if (class107.field1353 < 100) {
            return false;
        } else if (class216.method1347(arg2, 47, arg4, arg3)) {
            int var6 = arg3 << class714.field10017;
            int var7 = arg4 << class714.field10017;
            if (class770.method4271(class327.field4047, class327.field4047, class621.field8523[arg2].method1728(arg4, (byte) -95, arg3), arg1, 30000, var6, var7)) {
                class435.field5744++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Z)V", line = 3564)
    public static void method1518(boolean arg0) {
        field2977 = null;
        if (arg0) {
            method1517((byte) -26, 78, -34, -90, -50);
        }
        field2976 = null;
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)V", line = 3575)
    public static final void method1519(int arg0) {
        class78.field1055 = arg0;
    }
}
