import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class338 extends class244 {

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public static int field4632 = -2;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "Ldt;")
    public static class184 field4635 = new class184(64);

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
    public static int field4637 = 0;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "Lkm;")
    public static class487 field4636;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "[I")
    public static int[] field4633;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)Z", line = 8)
    public static final boolean method2008(int arg0) throws IOException {
        field4634++;
        if (class237.field3339 == null) {
            return false;
        }
        int var1 = class237.field3339.method2634(-62);
        if (var1 == 0) {
            return false;
        }
        if (class255.field3570 == null) {
            if (class394.field5548) {
                var1--;
                class237.field3339.method2638(class388.field5458.field5886, 1, 0, arg0 + 421471559);
                class394.field5548 = false;
                class336.field4612++;
            }
            class388.field5458.field5830 = 0;
            if (class388.field5458.method808((byte) -108)) {
                if (var1 == 0) {
                    return false;
                }
                class237.field3339.method2638(class388.field5458.field5886, 1, 1, 421464188);
                var1--;
                class336.field4612++;
            }
            class394.field5548 = true;
            class52[] var2 = class400.method2371(7126);
            int var3 = class388.field5458.method804((byte) -125);
            if (var3 < 0 || var3 >= var2.length) {
                throw new IOException("invo:" + var3);
            }
            class255.field3570 = var2[var3];
            class7.field136 = class255.field3570.field865;
        }
        if (class7.field136 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class237.field3339.method2638(class388.field5458.field5886, 1, 0, 421464188);
            class7.field136 = class388.field5458.field5886[0] & 0xFF;
            var1--;
            class336.field4612++;
        }
        if (class7.field136 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class237.field3339.method2638(class388.field5458.field5886, 2, 0, 421464188);
            class388.field5458.field5830 = 0;
            var1 -= 2;
            class7.field136 = class388.field5458.method2508(true);
            class336.field4612 += 2;
        }
        if (var1 < class7.field136) {
            return false;
        }
        class388.field5458.field5830 = 0;
        class237.field3339.method2638(class388.field5458.field5886, class7.field136, 0, arg0 + 421471559);
        class147.field2083 = 0;
        class7.field129 = class472.field6619;
        class336.field4612 += class7.field136;
        class472.field6619 = class121.field1698;
        class121.field1698 = class255.field3570;
        if (class46.field742 == class255.field3570) {
            int var4 = class388.field5458.method2508(true);
            if (var4 == 65535) {
                var4 = -1;
            }
            int var5 = class388.field5458.method2483(-2103088664);
            int var6 = class388.field5458.method2484(-110);
            int var7 = class388.field5458.method2508(true);
            if (var7 == 65535) {
                var7 = -1;
            }
            int var8 = class388.field5458.method2484(arg0 ^ 0x1CAC);
            if (class355.method2132((byte) -80, var5)) {
                for (int var9 = var4; var9 <= var7; var9++) {
                    long var10 = ((long) var8 << 32) + (long) var9;
                    class67 var12 = (class67) class233.field3288.method2614(var10, 28);
                    class67 var13;
                    if (var12 != null) {
                        var13 = new class67(var6, var12.field992);
                        var12.method1182(28818);
                    } else if (var9 == -1) {
                        var13 = new class67(var6, class292.method1804((byte) -60, var8).field5130.field992);
                    } else {
                        var13 = new class67(var6, -1);
                    }
                    class233.field3288.method2620(var10, var13, false);
                }
            }
            class255.field3570 = null;
            return true;
        } else if (class255.field3570 == class192.field2751) {
            int var14 = class388.field5458.method2456(-29879);
            int var15 = class388.field5458.method2500(85);
            int var16 = class388.field5458.method2492((byte) -48);
            if (class355.method2132((byte) -80, var16)) {
                if (var14 == 2) {
                    class69.method484((byte) -126);
                }
                class182.field2652 = var15;
                class248.method1536(false, var15);
                class110.method688((byte) -30, false);
                class212.method1333(class182.field2652);
                for (int var17 = 0; var17 < 100; var17++) {
                    class127.field1809[var17] = true;
                }
            }
            class255.field3570 = null;
            return true;
        } else if (class380.field5395 == class255.field3570) {
            class175.method1161(arg0 + 7271, class401.field5595);
            class255.field3570 = null;
            return true;
        } else if (class255.field3570 == class222.field3130) {
            class334.field4584 = class388.field5458.method2503(true);
            class103.field1464 = class122.field1700;
            class255.field3570 = null;
            return true;
        } else if (class388.field5463 == class255.field3570) {
            int var18 = class388.field5458.method2483(-2103088664);
            int var19 = class388.field5458.method2511(true);
            int var20 = class388.field5458.method2483(-2103088664);
            int var21 = class388.field5458.method2492((byte) -48);
            int var22 = class388.field5458.method2500(arg0 ^ 0xFFFFE351);
            if (class355.method2132((byte) -80, var20)) {
                class468.method2754((byte) -120, var21, var18, var22, var19);
            }
            class255.field3570 = null;
            return true;
        } else if (class70.field1037 == class255.field3570) {
            class175.method1161(-92, class345.field4720);
            class255.field3570 = null;
            return true;
        } else if (class255.field3570 == class238.field3359) {
            int var23 = class388.field5458.method2483(-2103088664);
            String var24 = class388.field5458.method2464(false);
            int var25 = class388.field5458.method2508(true);
            if (class355.method2132((byte) -80, var23)) {
                class443.method2576(var24, var25, -110);
            }
            class255.field3570 = null;
            return true;
        } else if (class261.field3642 == class255.field3570) {
            int var26 = class388.field5458.method2508(true);
            int var27 = class388.field5458.method2502((byte) -86);
            if (class355.method2132((byte) -80, var26)) {
                class310.method1879(5, 0, -122, var27, class327.field4523);
            }
            class255.field3570 = null;
            return true;
        } else if (class84.field1262 == class255.field3570) {
            int var28 = class388.field5458.method2512((byte) -56);
            int var29 = class388.field5458.method2508(true);
            int var30 = class388.field5458.method2483(-2103088664);
            class196 var31 = class256.field3581[var30];
            if (var31 != null) {
                class473.method2775(var31, var28, 0, var29);
            }
            class255.field3570 = null;
            return true;
        } else if (class423.field5817 == class255.field3570) {
            int var32 = class388.field5458.method2508(true);
            int var33 = class388.field5458.method2502((byte) -86);
            if (class355.method2132((byte) -80, var32)) {
                class465 var34 = (class465) class231.field3258.method2614((long) var33, -109);
                if (var34 != null) {
                    class480.method2829(var34, true, (byte) 3, false);
                }
                if (class422.field5806 != null) {
                    class356.method2141(arg0 ^ 0x1CF6, class422.field5806);
                    class422.field5806 = null;
                }
            }
            class255.field3570 = null;
            return true;
        } else if (class459.field6462 == class255.field3570) {
            class175.method1161(arg0 ^ 0x1CA1, class210.field2970);
            class255.field3570 = null;
            return true;
        } else if (class309.field4220 == class255.field3570) {
            class33.method253((byte) 64, false);
            class255.field3570 = null;
            return false;
        } else if (class255.field3570 == class181.field2619) {
            class33.method253((byte) 64, true);
            class255.field3570 = null;
            return false;
        } else if (class54.field883 == class255.field3570) {
            class175.method1161(-55, class120.field1680);
            class255.field3570 = null;
            return true;
        } else if (class255.field3570 == class244.field3454) {
            int var35 = class388.field5458.method2500(64);
            int var36 = class388.field5458.method2483(-2103088664);
            int var37 = class388.field5458.method2508(true);
            if (class355.method2132((byte) -80, var35)) {
                class243.method1519(var36, (byte) -125, var37, 0);
            }
            class255.field3570 = null;
            return true;
        } else if (class377.field5335 == class255.field3570) {
            int var38 = class388.field5458.method2492((byte) -48);
            int var39 = class388.field5458.method2459(-96);
            if (class355.method2132((byte) -80, var38)) {
                class104.field1493 = var39;
            }
            class255.field3570 = null;
            return true;
        } else if (class255.field3570 == class182.field2653) {
            String var40 = class388.field5458.method2464(false);
            boolean var41 = class388.field5458.method2503(true) == 1;
            String var42;
            if (var41) {
                var42 = class388.field5458.method2464(false);
            } else {
                var42 = var40;
            }
            int var43 = class388.field5458.method2508(true);
            byte var44 = class388.field5458.method2480(-8315);
            boolean var45 = false;
            if (var44 == -128) {
                var45 = true;
            }
            if (var45) {
                if (class226.field3202 == 0) {
                    class255.field3570 = null;
                    return true;
                }
                boolean var51 = false;
                int var52;
                for (var52 = 0; var52 < class226.field3202 && (!class64.field973[var52].field6797.equals(var42) || class64.field973[var52].field6786 != var43); var52++) {
                }
                if (class226.field3202 > var52) {
                    while (class226.field3202 - 1 > var52) {
                        class64.field973[var52] = class64.field973[var52 + 1];
                        var52++;
                    }
                    class226.field3202--;
                    class64.field973[class226.field3202] = null;
                }
            } else {
                String var46 = class388.field5458.method2464(false);
                class480 var47 = new class480();
                var47.field6787 = var40;
                var47.field6797 = var42;
                var47.field6785 = class33.method257(-24, var47.field6797);
                var47.field6786 = var43;
                var47.field6791 = var46;
                var47.field6790 = var44;
                int var48;
                for (var48 = class226.field3202 - 1; var48 >= 0; var48--) {
                    int var49 = class64.field973[var48].field6785.compareTo(var47.field6785);
                    if (var49 == 0) {
                        class64.field973[var48].field6786 = var43;
                        class64.field973[var48].field6790 = var44;
                        class64.field973[var48].field6791 = var46;
                        if (var42.equals(class2.field21.field407)) {
                            class429.field5917 = var44;
                        }
                        class245.field3465 = class122.field1700;
                        class255.field3570 = null;
                        return true;
                    }
                    if (var49 < 0) {
                        break;
                    }
                }
                if (class64.field973.length <= class226.field3202) {
                    class255.field3570 = null;
                    return true;
                }
                for (int var50 = class226.field3202 - 1; var50 > var48; var50--) {
                    class64.field973[var50 + 1] = class64.field973[var50];
                }
                if (class226.field3202 == 0) {
                    class64.field973 = new class480[100];
                }
                class64.field973[var48 + 1] = var47;
                class226.field3202++;
                if (var42.equals(class2.field21.field407)) {
                    class429.field5917 = var44;
                }
            }
            class255.field3570 = null;
            class245.field3465 = class122.field1700;
            return true;
        } else if (class255.field3570 == class231.field3248) {
            int var53 = class388.field5458.method2508(true);
            int var54 = class388.field5458.method2503(true);
            boolean var55 = (var54 & 0x1) == 1;
            class167.method1031(var55, var53, (byte) -74);
            int var56 = class388.field5458.method2508(true);
            for (int var57 = 0; var57 < var56; var57++) {
                int var58 = class388.field5458.method2503(true);
                if (var58 == 255) {
                    var58 = class388.field5458.method2502((byte) -86);
                }
                int var59 = class388.field5458.method2492((byte) -48);
                class231.method1453(var58, var53, arg0 ^ 0xFFFFE335, var59 - 1, var57, var55);
            }
            class244.field3455[class347.method2074(class429.field5909++, 31)] = var53;
            class255.field3570 = null;
            return true;
        } else if (class255.field3570 == class129.field1824) {
            int var60 = class388.field5458.method2508(true);
            if (class355.method2132((byte) -80, var60)) {
                class422.method2449(103);
            }
            class255.field3570 = null;
            return true;
        } else if (class434.field5969 == class255.field3570) {
            int var61 = class388.field5458.method2500(114);
            String var62 = class388.field5458.method2464(false);
            int var63 = class388.field5458.method2472(-1448953392);
            if (class355.method2132((byte) -80, var61)) {
                class417.method2434(var63, (byte) -124, var62);
            }
            class255.field3570 = null;
            return true;
        } else if (class407.field5631 == class255.field3570) {
            int var64 = class388.field5458.method2500(78);
            if (var64 == 65535) {
                var64 = -1;
            }
            int var65 = class388.field5458.method2456(-29879);
            class56.method430(var64, var65, arg0 + 7282);
            class255.field3570 = null;
            return true;
        } else if (class255.field3570 == class10.field191) {
            int var66 = class388.field5458.method2500(112);
            if (var66 == 65535) {
                var66 = -1;
            }
            int var67 = class388.field5458.method2490((byte) -121);
            int var68 = class388.field5458.method2512((byte) -56);
            class194.method1238((byte) 81, var66, var67, var68);
            class255.field3570 = null;
            return true;
        } else if (class286.field3908 == class255.field3570) {
            int var69 = class388.field5458.method2492((byte) -48);
            if (var69 == 65535) {
                var69 = -1;
            }
            int var70 = class388.field5458.method2483(-2103088664);
            if (var70 == 65535) {
                var70 = -1;
            }
            int var71 = class388.field5458.method2508(true);
            int var72 = class388.field5458.method2511(true);
            int var73 = class388.field5458.method2483(-2103088664);
            if (class355.method2132((byte) -80, var73)) {
                for (int var74 = var70; var74 <= var69; var74++) {
                    long var75 = ((long) var72 << 32) + (long) var74;
                    class67 var77 = (class67) class233.field3288.method2614(var75, arg0 ^ 0xFFFFE347);
                    class67 var78;
                    if (var77 != null) {
                        var78 = new class67(var77.field995, var71);
                        var77.method1182(arg0 ^ 0xFFFF93A7);
                    } else if (var74 == -1) {
                        var78 = new class67(class292.method1804((byte) -87, var72).field5130.field995, var71);
                    } else {
                        var78 = new class67(0, var71);
                    }
                    class233.field3288.method2620(var75, var78, false);
                }
            }
            class255.field3570 = null;
            return true;
        } else if (class488.field6887 == class255.field3570) {
            if (class7.field136 == 0) {
                class449.field6181 = class386.field5442.method695(-121, class487.field6867);
            } else {
                class449.field6181 = class388.field5458.method2464(false);
            }
            class255.field3570 = null;
            return true;
        } else if (class268.field3722 == class255.field3570) {
            class320.field4376.method1490(128);
            class343.field4690 += 32;
            class255.field3570 = null;
            return true;
        } else if (class441.field6056 == class255.field3570) {
            int var79 = class388.field5458.method2511(true);
            int var80 = (var79 & 0x3E279F4A) >> 28;
            int var81 = var79 >> 14 & 0x3FFF;
            int var82 = var79 & 0x3FFF;
            int var83 = class388.field5458.method2459(-117);
            int var84 = var83 >> 2;
            int var85 = var83 & 0x3;
            int var86 = class104.field1501[var84];
            int var87 = class388.field5458.method2508(true);
            if (var87 == 65535) {
                var87 = -1;
            }
            int var88 = var81 - class153.field2204;
            int var89 = var82 - class325.field4472;
            class191.method1228(var84, var87, var85, var89, true, var86, var80, var88);
            class255.field3570 = null;
            return true;
        } else if (class400.field5587 == class255.field3570) {
            class436.field5977 = class388.field5458.method2503(true);
            class255.field3570 = null;
            class145.field2047 = class122.field1700;
            return true;
        } else if (class357.field4986 == class255.field3570) {
            class175.method1161(arg0 + 7322, class204.field2929);
            class255.field3570 = null;
            return true;
        } else if (class267.field3714 == class255.field3570) {
            int var90 = class388.field5458.method2502((byte) -86);
            int var91 = class388.field5458.method2483(arg0 - 2103081293);
            int var92 = class388.field5458.method2508(true);
            if (var92 == 65535) {
                var92 = -1;
            }
            int var93 = class388.field5458.method2502((byte) -86);
            if (class355.method2132((byte) -80, var91)) {
                class167.method1027(var90, var92, var93, false);
                class164 var94 = class58.field918.method344(var92, 31757);
                class468.method2754((byte) -125, var94.field2392, var94.field2421, var94.field2379, var93);
                class409.method2401(var94.field2356, arg0 ^ 0x19F3, var94.field2395, var94.field2390, var93);
            }
            class255.field3570 = null;
            return true;
        } else if (class59.field922 == class255.field3570) {
            int var95 = class388.field5458.method2483(arg0 - 2103081293);
            int var96 = class388.field5458.method2503(true);
            boolean var97 = (var96 & 0x1) == 1;
            class259.method1607(var95, (byte) 74, var97);
            class244.field3455[class347.method2074(class429.field5909++, 31)] = var95;
            class255.field3570 = null;
            return true;
        } else if (class255.field3570 == class146.field2061) {
            class175.method1161(-34, class240.field3377);
            class255.field3570 = null;
            return true;
        } else if (class90.field1347 == class255.field3570) {
            int var98 = class388.field5458.method2483(-2103088664);
            int var99 = class388.field5458.method2484(arg0 ^ 0x1C9A);
            if (class355.method2132((byte) -80, var98)) {
                class310.method1879(3, -1, -127, var99, -1);
            }
            class255.field3570 = null;
            return true;
        } else if (class445.field6148 == class255.field3570) {
            int var100 = class388.field5458.method2472(arg0 - 1448946021);
            int var101 = class388.field5458.method2514(9786);
            int var102 = class388.field5458.method2483(-2103088664);
            if (class355.method2132((byte) -80, var102)) {
                class225.method1421((byte) -126, var101, var100);
            }
            class255.field3570 = null;
            return true;
        } else if (class319.field4369 == class255.field3570) {
            int var103 = class388.field5458.method2511(true);
            int var104 = class388.field5458.method2483(-2103088664);
            int var105 = class388.field5458.method2502((byte) -86);
            if (class355.method2132((byte) -80, var104)) {
                class465 var106 = (class465) class231.field3258.method2614((long) var103, 43);
                class465 var107 = (class465) class231.field3258.method2614((long) var105, arg0 ^ 0xFFFFE34C);
                if (var107 != null) {
                    class480.method2829(var107, var106 == null || var106.field6527 != var107.field6527, (byte) 3, false);
                }
                if (var106 != null) {
                    var106.method1182(28818);
                    class231.field3258.method2620((long) var105, var106, false);
                }
                class363 var108 = class292.method1804((byte) -75, var103);
                if (var108 != null) {
                    class356.method2141(arg0 + 7290, var108);
                }
                class363 var109 = class292.method1804((byte) -74, var105);
                if (var109 != null) {
                    class356.method2141(arg0 + 7271, var109);
                    class265.method1674(var109, (byte) 28, true);
                }
                if (class182.field2652 != -1) {
                    class64.method463(class182.field2652, 1, 1);
                }
            }
            class255.field3570 = null;
            return true;
        } else if (class255.field3570 == class232.field3269) {
            int var110 = class388.field5458.method2503(true);
            if (class388.field5458.method2503(true) == 0) {
                class259.field3617[var110] = new class446();
            } else {
                class388.field5458.field5830--;
                class259.field3617[var110] = new class446(class388.field5458);
            }
            class56.field908 = class122.field1700;
            class255.field3570 = null;
            return true;
        } else if (class255.field3570 == class126.field1725) {
            boolean var111 = class388.field5458.method2503(true) == 1;
            String var112 = class388.field5458.method2464(false);
            String var113 = var112;
            if (var111) {
                var113 = class388.field5458.method2464(false);
            }
            long var114 = (long) class388.field5458.method2508(true);
            long var116 = (long) class388.field5458.method2498(3);
            int var118 = class388.field5458.method2503(true);
            long var119 = (var114 << 32) + var116;
            boolean var121 = false;
            int var122 = 0;
            while (true) {
                if (var122 >= 100) {
                    if (var118 <= 1) {
                        if (!(!class205.field2942 || class78.field1185) || class42.field719) {
                            var121 = true;
                        } else if (class261.method1612(var113, false)) {
                            var121 = true;
                        }
                    }
                    break;
                }
                if (class167.field2453[var122] == var119) {
                    var121 = true;
                    break;
                }
                var122++;
            }
            if (!var121 && class121.field1696 == 0) {
                class167.field2453[class133.field1882] = var119;
                class133.field1882 = (class133.field1882 + 1) % 100;
                String var123 = class418.method2439(class407.method2391(class277.method1736(false, class388.field5458), 82), (byte) 121);
                if (var118 == 2) {
                    class254.method1581(-1, (byte) -79, "<img=1>" + var112, var123, 7, (String) null, 0, "<img=1>" + var113);
                } else if (var118 == 1) {
                    class254.method1581(-1, (byte) -110, "<img=0>" + var112, var123, 7, (String) null, 0, "<img=0>" + var113);
                } else {
                    class254.method1581(-1, (byte) -81, var112, var123, 3, (String) null, 0, var113);
                }
            }
            class255.field3570 = null;
            return true;
        } else if (class80.field1211 == class255.field3570) {
            boolean var124 = class388.field5458.method2503(true) == 1;
            String var125 = class388.field5458.method2464(false);
            String var126 = class388.field5458.method2464(false);
            int var127 = class388.field5458.method2508(true);
            int var128 = class388.field5458.method2503(true);
            String var129 = "";
            boolean var130 = false;
            if (var127 > 0) {
                var129 = class388.field5458.method2464(false);
                var130 = class388.field5458.method2503(true) == 1;
            }
            for (int var131 = 0; var131 < class205.field2934; var131++) {
                if (var124) {
                    if (var126.equals(class321.field4403[var131])) {
                        class321.field4403[var131] = var125;
                        var125 = null;
                        class160.field2301[var131] = var126;
                        break;
                    }
                } else if (var125.equals(class321.field4403[var131])) {
                    if (class439.field6023[var131] != var127) {
                        class439.field6023[var131] = var127;
                        if (var127 > 0) {
                            class5.method77(var125 + class422.field5812.method695(-120, class487.field6867), 0, "", "", false, 5);
                        }
                        if (var127 == 0) {
                            class5.method77(var125 + class307.field4200.method695(-121, class487.field6867), 0, "", "", false, 5);
                        }
                    }
                    class160.field2301[var131] = var126;
                    class396.field5559[var131] = var129;
                    class135.field1887[var131] = var128;
                    var125 = null;
                    class356.field4978[var131] = var130;
                    break;
                }
            }
            if (var125 != null && class205.field2934 < 200) {
                class321.field4403[class205.field2934] = var125;
                class160.field2301[class205.field2934] = var126;
                class439.field6023[class205.field2934] = var127;
                class396.field5559[class205.field2934] = var129;
                class135.field1887[class205.field2934] = var128;
                class356.field4978[class205.field2934] = var130;
                class205.field2934++;
            }
            class145.field2047 = class122.field1700;
            boolean var132 = false;
            int var133 = class205.field2934;
            while (var133 > 0) {
                boolean var134 = true;
                var133--;
                for (int var135 = 0; var135 < var133; var135++) {
                    if (class439.field6023[var135] != class355.field4955 && class439.field6023[var135 + 1] == class355.field4955 || class439.field6023[var135] == 0 && class439.field6023[var135 + 1] != 0) {
                        int var136 = class439.field6023[var135];
                        class439.field6023[var135] = class439.field6023[var135 + 1];
                        class439.field6023[var135 + 1] = var136;
                        String var137 = class396.field5559[var135];
                        class396.field5559[var135] = class396.field5559[var135 + 1];
                        class396.field5559[var135 + 1] = var137;
                        String var138 = class321.field4403[var135];
                        class321.field4403[var135] = class321.field4403[var135 + 1];
                        class321.field4403[var135 + 1] = var138;
                        String var139 = class160.field2301[var135];
                        class160.field2301[var135] = class160.field2301[var135 + 1];
                        class160.field2301[var135 + 1] = var139;
                        int var140 = class135.field1887[var135];
                        class135.field1887[var135] = class135.field1887[var135 + 1];
                        class135.field1887[var135 + 1] = var140;
                        boolean var141 = class356.field4978[var135];
                        class356.field4978[var135] = class356.field4978[var135 + 1];
                        var134 = false;
                        class356.field4978[var135 + 1] = var141;
                    }
                }
                if (var134) {
                    break;
                }
            }
            class255.field3570 = null;
            return true;
        } else if (class255.field3570 == class221.field3114) {
            class175.method1161(-45, class303.field4146);
            class255.field3570 = null;
            return true;
        } else if (arg0 != -7371) {
            return true;
        } else if (class255.field3570 == class109.field1548) {
            class436.field5986 = class388.field5458.method2456(-29879);
            class148.field2090 = class388.field5458.method2456(-29879);
            class196.field2802 = class388.field5458.method2456(-29879);
            class255.field3570 = null;
            return true;
        } else if (class346.field4732 == class255.field3570) {
            class373.method2237(class388.field5458, (byte) 20, class7.field136);
            class255.field3570 = null;
            return true;
        } else if (class255.field3570 == class20.field347) {
            boolean var142 = class388.field5458.method2503(true) == 1;
            String var143 = class388.field5458.method2464(false);
            String var144 = var143;
            if (var142) {
                var144 = class388.field5458.method2464(false);
            }
            long var145 = class388.field5458.method2494(-19827);
            long var147 = (long) class388.field5458.method2508(true);
            long var149 = (long) class388.field5458.method2498(3);
            int var151 = class388.field5458.method2503(true);
            long var152 = (var147 << 32) + var149;
            boolean var154 = false;
            int var155 = 0;
            while (true) {
                if (var155 >= 100) {
                    if (var151 <= 1) {
                        if (!(!class205.field2942 || class78.field1185) || class42.field719) {
                            var154 = true;
                        } else if (class261.method1612(var144, false)) {
                            var154 = true;
                        }
                    }
                    break;
                }
                if (class167.field2453[var155] == var152) {
                    var154 = true;
                    break;
                }
                var155++;
            }
            if (!var154 && class121.field1696 == 0) {
                class167.field2453[class133.field1882] = var152;
                class133.field1882 = (class133.field1882 + 1) % 100;
                String var156 = class418.method2439(class407.method2391(class277.method1736(false, class388.field5458), -123), (byte) 123);
                if (var151 == 2 || var151 == 3) {
                    class254.method1581(-1, (byte) -116, "<img=1>" + var143, var156, 9, class127.method773(arg0 ^ 0x1CAD, var145), 0, "<img=1>" + var144);
                } else if (var151 == 1) {
                    class254.method1581(-1, (byte) 41, "<img=0>" + var143, var156, 9, class127.method773(80, var145), 0, "<img=0>" + var144);
                } else {
                    class254.method1581(-1, (byte) -95, var143, var156, 9, class127.method773(75, var145), 0, var144);
                }
            }
            class255.field3570 = null;
            return true;
        } else if (class255.field3570 == class249.field3496) {
            class231.field3262 = class388.field5458.method2456(-29879);
            class84.field1263 = class388.field5458.method2503(true);
            class24.field426 = class388.field5458.method2456(-29879);
            while (class388.field5458.field5830 < class7.field136) {
                class464 var157 = class237.method1485(arg0 + 7372)[class388.field5458.method2503(true)];
                class175.method1161(-87, var157);
            }
            class255.field3570 = null;
            return true;
        } else if (class454.field6277 == class255.field3570) {
            if (class182.field2652 != -1) {
                class64.method463(class182.field2652, 1, 0);
            }
            class255.field3570 = null;
            return true;
        } else if (class32.field510 == class255.field3570) {
            boolean var158 = class388.field5458.method2503(true) == 1;
            String var159 = class388.field5458.method2464(false);
            String var160 = var159;
            if (var158) {
                var160 = class388.field5458.method2464(false);
            }
            long var161 = class388.field5458.method2494(-19827);
            long var163 = (long) class388.field5458.method2508(true);
            long var165 = (long) class388.field5458.method2498(3);
            int var167 = class388.field5458.method2503(true);
            int var168 = class388.field5458.method2508(true);
            long var169 = (var163 << 32) + var165;
            boolean var171 = false;
            int var172 = 0;
            while (true) {
                if (var172 >= 100) {
                    if (var167 <= 1 && class261.method1612(var160, false)) {
                        var171 = true;
                    }
                    break;
                }
                if (class167.field2453[var172] == var169) {
                    var171 = true;
                    break;
                }
                var172++;
            }
            if (!var171 && class121.field1696 == 0) {
                class167.field2453[class133.field1882] = var169;
                class133.field1882 = (class133.field1882 + 1) % 100;
                String var173 = class148.method913(var168, -95).method2313(0, class388.field5458);
                if (var167 == 2) {
                    class254.method1581(var168, (byte) 81, "<img=1>" + var159, var173, 20, class127.method773(-99, var161), 0, "<img=1>" + var160);
                } else if (var167 == 1) {
                    class254.method1581(var168, (byte) -113, "<img=0>" + var159, var173, 20, class127.method773(-77, var161), 0, "<img=0>" + var160);
                } else {
                    class254.method1581(var168, (byte) 119, var159, var173, 20, class127.method773(arg0 + 7424, var161), 0, var160);
                }
            }
            class255.field3570 = null;
            return true;
        } else if (class37.field642 == class255.field3570) {
            int var174 = class388.field5458.method2511(true);
            int var175 = class388.field5458.method2508(true);
            if (var175 == 65535) {
                var175 = -1;
            }
            int var176 = class388.field5458.method2492((byte) -48);
            if (class355.method2132((byte) -80, var176)) {
                class310.method1879(2, -1, -127, var174, var175);
            }
            class255.field3570 = null;
            return true;
        } else if (class289.field3972 == class255.field3570) {
            int var177 = class388.field5458.method2500(107);
            int var178 = class388.field5458.method2483(-2103088664);
            byte var179 = class388.field5458.method2480(-8315);
            if (class355.method2132((byte) -80, var177)) {
                class289.method1779(var179, var178, -128);
            }
            class255.field3570 = null;
            return true;
        } else if (class448.field6177 == class255.field3570) {
            int var180 = class388.field5458.method2500(arg0 ^ 0xFFFFE354);
            int var181 = class388.field5458.method2511(true);
            int var182 = class388.field5458.method2508(true);
            int var183 = class388.field5458.method2472(-1448953392);
            if (class355.method2132((byte) -80, var182)) {
                class310.method1879(5, var181, -124, var183, var180);
            }
            class255.field3570 = null;
            return true;
        } else if (class261.field3628 == class255.field3570) {
            int var184 = class388.field5458.method2474((byte) -56);
            int var185 = class388.field5458.method2502((byte) -86);
            int var186 = class388.field5458.method2503(true);
            String var187 = "";
            String var188 = var187;
            if ((var186 & 0x1) != 0) {
                var187 = class388.field5458.method2464(false);
                if ((var186 & 0x2) == 0) {
                    var188 = var187;
                } else {
                    var188 = class388.field5458.method2464(false);
                }
            }
            String var189 = class388.field5458.method2464(false);
            if (var184 == 99) {
                class109.method680(var189, arg0 + 19616);
            } else if (var188.equals("") || !class261.method1612(var188, false)) {
                class5.method77(var189, var185, var188, var187, false, var184);
            } else {
                class255.field3570 = null;
                return true;
            }
            class255.field3570 = null;
            return true;
        } else if (class3.field27 == class255.field3570) {
            class175.method1161(-64, class283.field3885);
            class255.field3570 = null;
            return true;
        } else if (class76.field1152 == class255.field3570) {
            class375.method2243(false, arg0 + 7370);
            class255.field3570 = null;
            return true;
        } else if (class438.field6007 == class255.field3570) {
            int var190 = class388.field5458.method2508(true);
            int var191 = class388.field5458.method2508(true);
            int var192 = class388.field5458.method2508(true);
            int var193 = class388.field5458.method2508(true);
            if (class355.method2132((byte) -80, var190) && class39.field666[var191] != null) {
                for (int var194 = var192; var194 < var193; var194++) {
                    int var195 = class388.field5458.method2498(3);
                    if (var194 < class39.field666[var191].length && class39.field666[var191][var194] != null) {
                        class39.field666[var191][var194].field5087 = var195;
                    }
                }
            }
            class255.field3570 = null;
            return true;
        } else if (class60.field940 == class255.field3570) {
            class445.method2587(false, class388.field5458.method2464(false));
            class255.field3570 = null;
            return true;
        } else if (class459.field6471 == class255.field3570) {
            int var196 = class388.field5458.method2508(true);
            int var197 = class388.field5458.method2512((byte) -56);
            int var198 = class388.field5458.method2500(118);
            int var199 = class388.field5458.method2484(arg0 + 7279);
            if (class355.method2132((byte) -80, var198)) {
                class465 var200 = (class465) class231.field3258.method2614((long) var199, -105);
                if (var200 != null) {
                    class480.method2829(var200, var200.field6527 != var196, (byte) 3, false);
                }
                class125.method762(var199, var197, arg0 + 39684, false, var196);
            }
            class255.field3570 = null;
            return true;
        } else if (class459.field6469 == class255.field3570) {
            int var201 = class388.field5458.method2508(true);
            int var202 = class388.field5458.method2503(true);
            int var203 = class388.field5458.method2503(true);
            int var204 = class388.field5458.method2503(true);
            int var205 = class388.field5458.method2503(true);
            int var206 = class388.field5458.method2508(true);
            if (class355.method2132((byte) -80, var201)) {
                class269.field3730[var202] = true;
                class73.field1059[var202] = var203;
                class417.field5741[var202] = var204;
                class115.field1629[var202] = var205;
                class274.field3800[var202] = var206;
            }
            class255.field3570 = null;
            return true;
        } else if (class387.field5453 == class255.field3570) {
            int var207 = class388.field5458.method2502((byte) -86);
            class268.field3724 = class343.field4703.method118(9434, var207);
            class255.field3570 = null;
            return true;
        } else if (class41.field700 == class255.field3570) {
            if (class90.field1344 != null) {
                class356.method2139(-1, class411.field5693, (byte) 118, false, -1);
            }
            byte[] var208 = new byte[class7.field136];
            class388.field5458.method803(0, 0, class7.field136, var208);
            String var209 = class164.method1015(var208, -129, class7.field136, 0);
            class442.method2570(class343.field4703, var209, false, true, class221.field3118 == 1);
            class255.field3570 = null;
            return true;
        } else if (class262.field3660 == class255.field3570) {
            class166.method1021(125);
            class255.field3570 = null;
            return false;
        } else if (class394.field5549 == class255.field3570) {
            class175.method1161(-97, class11.field196);
            class255.field3570 = null;
            return true;
        } else if (class349.field4773 == class255.field3570) {
            int var210 = class388.field5458.method2500(117);
            int var211 = class388.field5458.method2459(arg0 + 7265);
            class320.field4376.method1484(var211, var210, false);
            class255.field3570 = null;
            return true;
        } else if (class50.field838 == class255.field3570) {
            int var212 = class388.field5458.method2508(true);
            String var213 = class388.field5458.method2464(false);
            Object[] var214 = new Object[var213.length() + 1];
            for (int var215 = var213.length() - 1; var215 >= 0; var215--) {
                if (var213.charAt(var215) == 's') {
                    var214[var215 + 1] = class388.field5458.method2464(false);
                } else {
                    var214[var215 + 1] = Integer.valueOf(class388.field5458.method2502((byte) -86));
                }
            }
            var214[0] = Integer.valueOf(class388.field5458.method2502((byte) -86));
            if (class355.method2132((byte) -80, var212)) {
                class32 var216 = new class32();
                var216.field518 = var214;
                class212.method1331(var216);
            }
            class255.field3570 = null;
            return true;
        } else if (class383.field5437 == class255.field3570) {
            int var217 = class388.field5458.method2508(true);
            int var218 = class388.field5458.method2503(true);
            boolean var219 = (var218 & 0x1) == 1;
            while (class388.field5458.field5830 < class7.field136) {
                int var220 = class388.field5458.method2474((byte) 66);
                int var221 = class388.field5458.method2508(true);
                int var222 = 0;
                if (var221 != 0) {
                    var222 = class388.field5458.method2503(true);
                    if (var222 == 255) {
                        var222 = class388.field5458.method2502((byte) -86);
                    }
                }
                class231.method1453(var222, var217, arg0 ^ 0xFFFFE335, var221 - 1, var220, var219);
            }
            class244.field3455[class347.method2074(class429.field5909++, 31)] = var217;
            class255.field3570 = null;
            return true;
        } else if (class255.field3570 == class114.field1605) {
            int var223 = class388.field5458.method2508(true);
            int var224 = class388.field5458.method2500(118);
            int var225 = class388.field5458.method2484(-113);
            if (class355.method2132((byte) -80, var224)) {
                class136.method821((byte) -88, var223, var225);
            }
            class255.field3570 = null;
            return true;
        } else if (class255.field3570 == class182.field2646) {
            class242.field3423 = class388.field5458.method2514(9786);
            class255.field3570 = null;
            class103.field1464 = class122.field1700;
            return true;
        } else if (class462.field6503 == class255.field3570) {
            String var226 = class388.field5458.method2464(false);
            String var227 = class418.method2439(class407.method2391(class277.method1736(false, class388.field5458), -124), (byte) 127);
            class5.method77(var227, 0, var226, var226, false, 6);
            class255.field3570 = null;
            return true;
        } else if (class321.field4407 == class255.field3570) {
            class175.method1161(arg0 + 7341, class353.field4921);
            class255.field3570 = null;
            return true;
        } else if (class255.field3570 == class132.field1862) {
            class231.field3262 = class388.field5458.method2512((byte) -56);
            class84.field1263 = class388.field5458.method2503(true);
            class24.field426 = class388.field5458.method2459(-110);
            class255.field3570 = null;
            return true;
        } else if (class432.field5953 == class255.field3570) {
            int var228 = class388.field5458.method2484(arg0 ^ 0x1CB1);
            int var229 = class388.field5458.method2492((byte) -48);
            class320.field4376.method1488(var229, -21973, var228);
            class255.field3570 = null;
            return true;
        } else if (class270.field3746 == class255.field3570) {
            class347.method2081(class7.field136, arg0 ^ 0x1CCA, class343.field4703, class388.field5458);
            class255.field3570 = null;
            return true;
        } else if (class255.field3570 == class199.field2846) {
            int var230 = class388.field5458.method2508(true);
            if (class355.method2132((byte) -80, var230)) {
                class129.method785(arg0 + 7371);
            }
            class255.field3570 = null;
            return true;
        } else if (class27.field451 == class255.field3570) {
            class245.field3465 = class122.field1700;
            if (class7.field136 == 0) {
                class255.field3570 = null;
                class211.field2982 = null;
                class110.field1558 = null;
                class64.field973 = null;
                class226.field3202 = 0;
                return true;
            }
            class211.field2982 = class388.field5458.method2464(false);
            boolean var231 = class388.field5458.method2503(true) == 1;
            if (var231) {
                class388.field5458.method2464(false);
            }
            long var232 = class388.field5458.method2494(arg0 - 12456);
            class110.field1558 = class184.method1208(var232, -124);
            class374.field5290 = class388.field5458.method2480(-8315);
            int var234 = class388.field5458.method2503(true);
            if (var234 == 255) {
                class255.field3570 = null;
                return true;
            }
            class226.field3202 = var234;
            class480[] var235 = new class480[100];
            for (int var236 = 0; var236 < class226.field3202; var236++) {
                var235[var236] = new class480();
                var235[var236].field6787 = class388.field5458.method2464(false);
                boolean var242 = class388.field5458.method2503(true) == 1;
                if (var242) {
                    var235[var236].field6797 = class388.field5458.method2464(false);
                } else {
                    var235[var236].field6797 = var235[var236].field6787;
                }
                var235[var236].field6785 = class33.method257(103, var235[var236].field6797);
                var235[var236].field6786 = class388.field5458.method2508(true);
                var235[var236].field6790 = class388.field5458.method2480(-8315);
                var235[var236].field6791 = class388.field5458.method2464(false);
                if (var235[var236].field6797.equals(class2.field21.field407)) {
                    class429.field5917 = var235[var236].field6790;
                }
            }
            boolean var237 = false;
            int var238 = class226.field3202;
            while (var238 > 0) {
                var238--;
                boolean var239 = true;
                for (int var240 = 0; var240 < var238; var240++) {
                    if (var235[var240].field6785.compareTo(var235[var240 + 1].field6785) > 0) {
                        class480 var241 = var235[var240];
                        var235[var240] = var235[var240 + 1];
                        var235[var240 + 1] = var241;
                        var239 = false;
                    }
                }
                if (var239) {
                    break;
                }
            }
            class64.field973 = var235;
            class255.field3570 = null;
            return true;
        } else if (class321.field4394 == class255.field3570) {
            int var243 = class388.field5458.method2472(arg0 ^ 0x565D5AE5);
            int var244 = class388.field5458.method2483(arg0 ^ 0x7D5A8ADD);
            class320.field4376.method1484(var243, var244, false);
            class255.field3570 = null;
            return true;
        } else if (class444.field6125 == class255.field3570) {
            int var245 = class388.field5458.method2456(arg0 ^ 0x687C);
            int var246 = class388.field5458.method2459(-87);
            int var247 = class388.field5458.method2492((byte) -48);
            if (var247 == 65535) {
                var247 = -1;
            }
            String var248 = class388.field5458.method2464(false);
            if (var245 >= 1 && var245 <= 8) {
                if (var248.equalsIgnoreCase("null")) {
                    var248 = null;
                }
                class13.field207[var245 - 1] = var248;
                class155.field2231[var245 - 1] = var247;
                class43.field726[var245 - 1] = var246 == 0;
            }
            class255.field3570 = null;
            return true;
        } else if (class78.field1172 == class255.field3570) {
            int var249 = class388.field5458.method2500(115);
            int var250 = class388.field5458.method2502((byte) -86);
            int var251 = class388.field5458.method2508(true);
            if (class355.method2132((byte) -80, var249)) {
                class71.method497(var251, var250, arg0 - 15980);
            }
            class255.field3570 = null;
            return true;
        } else if (class79.field1199 == class255.field3570) {
            int var252 = class388.field5458.method2502((byte) -86);
            int var253 = class388.field5458.method2483(-2103088664);
            int var254 = class388.field5458.method2492((byte) -48);
            if (class355.method2132((byte) -80, var253)) {
                class485.method2839(var252, 6, var254);
            }
            class255.field3570 = null;
            return true;
        } else if (class255.field3570 == class136.field1927) {
            int var255 = class388.field5458.method2500(77);
            int var256 = class388.field5458.method2500(74);
            int var257 = class388.field5458.method2502((byte) -86);
            if (class355.method2132((byte) -80, var256)) {
                class289.method1779(var257, var255, -91);
            }
            class255.field3570 = null;
            return true;
        } else if (class489.field6893 == class255.field3570) {
            class388.field5458.field5830 += 28;
            if (class388.field5458.method2461(true)) {
                class367.method2217(46, class388.field5458, class388.field5458.field5830 - 28);
            }
            class255.field3570 = null;
            return true;
        } else if (class407.field5641 == class255.field3570) {
            class175.method1161(-26, class473.field6629);
            class255.field3570 = null;
            return true;
        } else if (class9.field182 == class255.field3570) {
            int var258 = class388.field5458.method2508(true);
            int var259 = class388.field5458.method2492((byte) -48);
            int var260 = class388.field5458.method2492((byte) -48);
            int var261 = class388.field5458.method2511(true);
            if (var261 >> 30 != 0) {
                int var262 = (var261 & 0x3F0386C7) >> 28;
                int var263 = (var261 >> 14 & 0x3FFF) - class153.field2204;
                int var264 = (var261 & 0x3FFF) - class325.field4472;
                if (var263 >= 0 && var264 >= 0 && var263 < class200.field2875 && var264 < class422.field5811) {
                    int var265 = var263 * 128 + 64;
                    int var266 = var264 * 128 + 64;
                    class233 var267 = new class233(var258, 0, class356.field4972, var262, var265, class418.method2441(var266, var262, var265, arg0 - 9407) - var259, var266, var263, var263, var264, var264);
                    class346.field4724.method1553((byte) -102, new class229(var267));
                }
            } else if (var261 >> 29 != 0) {
                int var268 = var261 & 0xFFFF;
                class196 var269 = class256.field3581[var268];
                if (var269 != null) {
                    if (var258 == 65535) {
                        var258 = -1;
                    }
                    boolean var270 = true;
                    if (var258 != -1 && var269.field1079 != -1) {
                        if (var269.field1079 == var258) {
                            class321 var271 = class163.field2348.method548(var258, (byte) -80);
                            if (var271.field4392 && var271.field4391 != -1) {
                                class372 var272 = class31.field505.method950(true, var271.field4391);
                                int var273 = var272.field5271;
                                if (var273 == 0 || var273 == 2) {
                                    var270 = false;
                                } else if (var273 == 1) {
                                    var270 = true;
                                }
                            }
                        } else {
                            class321 var274 = class163.field2348.method548(var258, (byte) 62);
                            class321 var275 = class163.field2348.method548(var269.field1079, (byte) 110);
                            if (var274.field4391 != -1 && var275.field4391 != -1) {
                                class372 var276 = class31.field505.method950(true, var274.field4391);
                                class372 var277 = class31.field505.method950(true, var275.field4391);
                                if (var276.field5260 < var277.field5260) {
                                    var270 = false;
                                }
                            }
                        }
                    }
                    if (var270) {
                        var269.field1079 = var258;
                        var269.field1121 = class356.field4972 + var260;
                        var269.field1132 = var259;
                        var269.field1091 = 0;
                        var269.field1125 = 0;
                        var269.field1074 = 1;
                        if (var269.field1121 > class356.field4972) {
                            var269.field1091 = -1;
                        }
                        if (var269.field1079 != -1 && class356.field4972 == var269.field1121) {
                            int var278 = class163.field2348.method548(var269.field1079, (byte) 103).field4391;
                            if (var278 != -1) {
                                class372 var279 = class31.field505.method950(true, var278);
                                if (var279 != null && var279.field5278 != null) {
                                    class272.method1706(var269.field6766, var279, false, (byte) 31, var269.field6765, var269.field6746, 0);
                                }
                            }
                        }
                    }
                }
            } else if ((var261 >> 28) != 0) {
                int var280 = var261 & 0xFFFF;
                class23 var281;
                if (class327.field4523 == var280) {
                    var281 = class2.field21;
                } else {
                    var281 = class310.field4235[var280];
                }
                if (var281 != null) {
                    if (var258 == 65535) {
                        var258 = -1;
                    }
                    boolean var282 = true;
                    if (var258 != -1 && var281.field1079 != -1) {
                        if (var281.field1079 == var258) {
                            class321 var287 = class163.field2348.method548(var258, (byte) 96);
                            if (var287.field4392 && var287.field4391 != -1) {
                                class372 var288 = class31.field505.method950(true, var287.field4391);
                                int var289 = var288.field5271;
                                if (var289 == 0 || var289 == 2) {
                                    var282 = false;
                                } else if (var289 == 1) {
                                    var282 = true;
                                }
                            }
                        } else {
                            class321 var283 = class163.field2348.method548(var258, (byte) 50);
                            class321 var284 = class163.field2348.method548(var281.field1079, (byte) 127);
                            if (var283.field4391 != -1 && var284.field4391 != -1) {
                                class372 var285 = class31.field505.method950(true, var283.field4391);
                                class372 var286 = class31.field505.method950(true, var284.field4391);
                                if (var285.field5260 < var286.field5260) {
                                    var282 = false;
                                }
                            }
                        }
                    }
                    if (var282) {
                        var281.field1132 = var259;
                        var281.field1125 = 0;
                        var281.field1074 = 1;
                        var281.field1121 = class356.field4972 + var260;
                        var281.field1079 = var258;
                        var281.field1091 = 0;
                        if (class356.field4972 < var281.field1121) {
                            var281.field1091 = -1;
                        }
                        if (var281.field1079 == 65535) {
                            var281.field1079 = -1;
                        }
                        if (var281.field1079 != -1 && class356.field4972 == var281.field1121) {
                            int var290 = class163.field2348.method548(var281.field1079, (byte) -117).field4391;
                            if (var290 != -1) {
                                class372 var291 = class31.field505.method950(true, var290);
                                if (var291 != null && var291.field5278 != null) {
                                    class272.method1706(var281.field6766, var291, class2.field21 == var281, (byte) 31, var281.field6765, var281.field6746, 0);
                                }
                            }
                        }
                    }
                }
            }
            class255.field3570 = null;
            return true;
        } else if (class255.field3570 == class104.field1499) {
            class175.method1161(-111, class449.field6185);
            class255.field3570 = null;
            return true;
        } else if (class283.field3889 == class255.field3570) {
            int var292 = class388.field5458.method2503(true);
            int var293 = class388.field5458.method2503(true);
            if (var293 == 255) {
                var292 = -1;
                var293 = -1;
            }
            class242.method1516(var292, var293, 0);
            class255.field3570 = null;
            return true;
        } else if (class255.field3570 == class243.field3444) {
            int var294 = class388.field5458.method2483(-2103088664);
            int var295 = class388.field5458.method2483(-2103088664);
            String var296 = class388.field5458.method2464(false);
            if (class355.method2132((byte) -80, var294)) {
                class443.method2576(var296, var295, 51);
            }
            class255.field3570 = null;
            return true;
        } else if (class41.field688 == class255.field3570) {
            class175.method1161(-87, class22.field370);
            class255.field3570 = null;
            return true;
        } else if (class99.field1403 == class255.field3570) {
            String var297 = class388.field5458.method2464(false);
            int var298 = class388.field5458.method2508(true);
            String var299 = class148.method913(var298, 51).method2313(0, class388.field5458);
            class254.method1581(var298, (byte) 36, var297, var299, 19, (String) null, 0, var297);
            class255.field3570 = null;
            return true;
        } else if (class255.field3570 == class198.field2837) {
            int var300 = class388.field5458.method2483(-2103088664);
            byte var301 = class388.field5458.method2509(-26667);
            class320.field4376.method1488(var300, -21973, var301);
            class255.field3570 = null;
            return true;
        } else if (class475.field6698 == class255.field3570) {
            class310.field4245 = class388.field5458.method2508(true) * 30;
            class255.field3570 = null;
            class103.field1464 = class122.field1700;
            return true;
        } else if (class255.field3570 == class125.field1717) {
            int var302 = class388.field5458.method2500(85);
            int var303 = class388.field5458.method2492((byte) -48);
            int var304 = class388.field5458.method2500(arg0 + 7496);
            int var305 = class388.field5458.method2484(-78);
            int var306 = class388.field5458.method2500(86);
            if (class355.method2132((byte) -80, var304)) {
                class310.method1879(7, var303, arg0 + 7247, var305, var302 | var306 << 16);
            }
            class255.field3570 = null;
            return true;
        } else if (class328.field4530 == class255.field3570) {
            int var307 = class388.field5458.method2508(true);
            int var308 = class388.field5458.method2503(true);
            int var309 = class388.field5458.method2503(true);
            int var310 = class388.field5458.method2508(true);
            int var311 = class388.field5458.method2503(true);
            int var312 = class388.field5458.method2503(true);
            if (class355.method2132((byte) -80, var307)) {
                class129.method787(var310, -120, var312, var308, var309, var311, true);
            }
            class255.field3570 = null;
            return true;
        } else if (class326.field4498 == class255.field3570) {
            class84.field1263 = class388.field5458.method2456(-29879);
            class231.field3262 = class388.field5458.method2459(-104);
            class24.field426 = class388.field5458.method2503(true);
            for (class418 var313 = (class418) class135.field1898.method2615((byte) -18); var313 != null; var313 = (class418) class135.field1898.method2619((byte) -98)) {
                int var315 = (int) (var313.field2608 & 0x3FFFL);
                int var316 = (int) (var313.field2608 >> 14 & 0x3FFFL);
                int var317 = (int) (var313.field2608 >> 28 & 0x3L);
                if (class24.field426 == var317 && var315 >= class231.field3262 && var315 < (class231.field3262 + 8) && var316 >= class84.field1263 && var316 < (class84.field1263 + 8)) {
                    var313.method1182(28818);
                    class421.method2447(arg0 - 527380558, var316, class24.field426, var315);
                }
            }
            for (class103 var314 = (class103) class230.field3244.method1544(-114); var314 != null; var314 = (class103) class230.field3244.method1546((byte) -42)) {
                if (class231.field3262 <= var314.field1465 && var314.field1465 < class231.field3262 + 8 && class84.field1263 <= var314.field1470 && var314.field1470 < class84.field1263 + 8 && class24.field426 == var314.field1471) {
                    var314.field1466 = 0;
                }
            }
            class255.field3570 = null;
            return true;
        } else if (class255.field3570 == class244.field3450) {
            class306.field4191 = class388.field5458.method2503(true);
            class255.field3570 = null;
            return true;
        } else if (class406.field5623 == class255.field3570) {
            int var318 = class388.field5458.method2508(true);
            if (var318 == 65535) {
                var318 = -1;
            }
            int var319 = class388.field5458.method2503(true);
            int var320 = class388.field5458.method2508(true);
            int var321 = class388.field5458.method2503(true);
            class445.method2590(arg0 + 18054, var320, var321, var318, var319);
            class255.field3570 = null;
            return true;
        } else if (class255.field3570 == class117.field1650) {
            int var322 = class388.field5458.method2500(85);
            int var323 = class388.field5458.method2483(-2103088664);
            int var324 = class388.field5458.method2492((byte) -48);
            int var325 = class388.field5458.method2511(true);
            if (class355.method2132((byte) -80, var323)) {
                class132.method795((var324 << 16) + var322, (byte) -105, var325);
            }
            class255.field3570 = null;
            return true;
        } else if (class255.field3570 == class109.field1541) {
            class175.method1161(-87, class166.field2445);
            class255.field3570 = null;
            return true;
        } else if (class277.field3844 == class255.field3570) {
            int var326 = class388.field5458.method2492((byte) -48);
            int var327 = class388.field5458.method2485(arg0 ^ 0xFFFF1C35);
            int var328 = class388.field5458.method2485(arg0 + 72651);
            int var329 = class388.field5458.method2472(-1448953392);
            if (class355.method2132((byte) -80, var326)) {
                class117.method741(var328, var329, var327, true);
            }
            class255.field3570 = null;
            return true;
        } else if (class423.field5814 == class255.field3570) {
            int var330 = class388.field5458.method2503(true);
            int var331 = var330 >> 5;
            int var332 = var330 & 0x1F;
            if (var332 == 0) {
                class51.field860[var331] = null;
                class255.field3570 = null;
                return true;
            }
            class147 var333 = new class147();
            var333.field2071 = var332;
            var333.field2087 = class388.field5458.method2503(true);
            if (var333.field2087 >= 0 && class289.field3971.length > var333.field2087) {
                if (var333.field2071 == 1 || var333.field2071 == 10) {
                    var333.field2074 = class388.field5458.method2508(true);
                    class388.field5458.field5830 += 6;
                } else if (var333.field2071 >= 2 && var333.field2071 <= 6) {
                    if (var333.field2071 == 2) {
                        var333.field2080 = 64;
                        var333.field2077 = 64;
                    }
                    if (var333.field2071 == 3) {
                        var333.field2080 = 0;
                        var333.field2077 = 64;
                    }
                    if (var333.field2071 == 4) {
                        var333.field2080 = 128;
                        var333.field2077 = 64;
                    }
                    if (var333.field2071 == 5) {
                        var333.field2077 = 0;
                        var333.field2080 = 64;
                    }
                    if (var333.field2071 == 6) {
                        var333.field2077 = 128;
                        var333.field2080 = 64;
                    }
                    var333.field2071 = 2;
                    var333.field2086 = class388.field5458.method2503(true);
                    var333.field2075 = class388.field5458.method2508(true);
                    var333.field2072 = class388.field5458.method2508(true);
                    var333.field2082 = class388.field5458.method2503(true);
                    var333.field2085 = class388.field5458.method2508(true);
                }
                var333.field2079 = class388.field5458.method2508(true);
                if (var333.field2079 == 65535) {
                    var333.field2079 = -1;
                }
                class51.field860[var331] = var333;
            }
            class255.field3570 = null;
            return true;
        } else if (class381.field5404 == class255.field3570) {
            int var334 = class388.field5458.method2512((byte) -56);
            int var335 = class388.field5458.method2503(true);
            int var336 = class388.field5458.method2502((byte) -86);
            class162.field2324[var335] = var336;
            class67.field999[var335] = var334;
            class29.field470[var335] = 1;
            int var337 = class174.field2567[var335] - 1;
            for (int var338 = 0; var338 < var337; var338++) {
                if (var336 >= class192.field2737[var338]) {
                    class29.field470[var335] = var338 + 2;
                }
            }
            class110.field1554[class347.method2074(class210.field2963++, 31)] = var335;
            class255.field3570 = null;
            return true;
        } else if (class472.field6615 == class255.field3570) {
            int var339 = class388.field5458.method2511(true);
            int var340 = class388.field5458.method2492((byte) -48);
            int var341 = class388.field5458.method2503(true);
            if (class355.method2132((byte) -80, var340)) {
                class410.method2405(16, var341, var339);
            }
            class255.field3570 = null;
            return true;
        } else if (class255.field3570 == class175.field2573) {
            int var342 = class388.field5458.method2503(true);
            boolean var343 = (var342 & 0x1) == 1;
            String var344 = class388.field5458.method2464(false);
            String var345 = class388.field5458.method2464(false);
            if (var345.equals("")) {
                var345 = var344;
            }
            String var346 = class388.field5458.method2464(false);
            String var347 = class388.field5458.method2464(false);
            if (var347.equals("")) {
                var347 = var346;
            }
            if (var343) {
                for (int var348 = 0; var348 < class161.field2315; var348++) {
                    if (class353.field4928[var348].equals(var347)) {
                        class181.field2624[var348] = var344;
                        class353.field4928[var348] = var345;
                        class20.field353[var348] = var346;
                        class374.field5296[var348] = var347;
                        break;
                    }
                }
            } else {
                class181.field2624[class161.field2315] = var344;
                class353.field4928[class161.field2315] = var345;
                class20.field353[class161.field2315] = var346;
                class374.field5296[class161.field2315] = var347;
                class289.field3960[class161.field2315] = class347.method2074(var342, 2) == 2;
                class161.field2315++;
            }
            class255.field3570 = null;
            class145.field2047 = class122.field1700;
            return true;
        } else if (class306.field4183 == class255.field3570) {
            class375.method2243(true, -1);
            class255.field3570 = null;
            return true;
        } else if (class255.field3570 == class237.field3342) {
            int var349 = class388.field5458.method2483(-2103088664);
            int var350 = class388.field5458.method2484(-112);
            int var351 = class388.field5458.method2483(-2103088664);
            if (var351 == 65535) {
                var351 = -1;
            }
            if (class355.method2132((byte) -80, var349)) {
                class454.method2622(var351, (byte) 110, var350);
            }
            class255.field3570 = null;
            return true;
        } else if (class255.field3570 == class216.field3064) {
            class161.field2315 = class388.field5458.method2503(true);
            for (int var352 = 0; var352 < class161.field2315; var352++) {
                class181.field2624[var352] = class388.field5458.method2464(false);
                class353.field4928[var352] = class388.field5458.method2464(false);
                if (class353.field4928[var352].equals("")) {
                    class353.field4928[var352] = class181.field2624[var352];
                }
                class20.field353[var352] = class388.field5458.method2464(false);
                class374.field5296[var352] = class388.field5458.method2464(false);
                if (class374.field5296[var352].equals("")) {
                    class374.field5296[var352] = class20.field353[var352];
                }
                class289.field3960[var352] = false;
            }
            class255.field3570 = null;
            class145.field2047 = class122.field1700;
            return true;
        } else if (class255.field3570 == class157.field2255) {
            int var353 = class388.field5458.method2508(true);
            int var354 = class388.field5458.method2503(true);
            int var355 = class388.field5458.method2503(true);
            int var356 = class388.field5458.method2508(true);
            int var357 = class388.field5458.method2503(true);
            int var358 = class388.field5458.method2503(true);
            if (class355.method2132((byte) -80, var353)) {
                class349.method2087(22434, var357, var358, var355, var356, var354);
            }
            class255.field3570 = null;
            return true;
        } else if (class255.field3570 == class210.field2969) {
            boolean var359 = class388.field5458.method2503(true) == 1;
            String var360 = class388.field5458.method2464(false);
            String var361 = var360;
            if (var359) {
                var361 = class388.field5458.method2464(false);
            }
            long var362 = (long) class388.field5458.method2508(true);
            long var364 = (long) class388.field5458.method2498(3);
            int var366 = class388.field5458.method2503(true);
            int var367 = class388.field5458.method2508(true);
            long var368 = (var362 << 32) + var364;
            boolean var370 = false;
            int var371 = 0;
            while (true) {
                if (var371 >= 100) {
                    if (var366 <= 1 && class261.method1612(var361, false)) {
                        var370 = true;
                    }
                    break;
                }
                if (class167.field2453[var371] == var368) {
                    var370 = true;
                    break;
                }
                var371++;
            }
            if (!var370 && class121.field1696 == 0) {
                class167.field2453[class133.field1882] = var368;
                class133.field1882 = (class133.field1882 + 1) % 100;
                String var372 = class148.method913(var367, arg0 ^ 0x1CE6).method2313(0, class388.field5458);
                if (var366 == 2) {
                    class254.method1581(var367, (byte) -89, "<img=1>" + var360, var372, 18, (String) null, 0, "<img=1>" + var361);
                } else if (var366 == 1) {
                    class254.method1581(var367, (byte) -127, "<img=0>" + var360, var372, 18, (String) null, 0, "<img=0>" + var361);
                } else {
                    class254.method1581(var367, (byte) 73, var360, var372, 18, (String) null, 0, var361);
                }
            }
            class255.field3570 = null;
            return true;
        } else if (class255.field3570 == class109.field1547) {
            class175.method1161(-60, class138.field1963);
            class255.field3570 = null;
            return true;
        } else if (class6.field116 == class255.field3570) {
            for (int var373 = 0; var373 < class310.field4235.length; var373++) {
                if (class310.field4235[var373] != null) {
                    class310.field4235[var373].field1128 = -1;
                }
            }
            for (int var374 = 0; var374 < class256.field3581.length; var374++) {
                if (class256.field3581[var374] != null) {
                    class256.field3581[var374].field1128 = -1;
                }
            }
            class255.field3570 = null;
            return true;
        } else if (class255.field3570 == class184.field2676) {
            int var375 = class388.field5458.method2483(-2103088664);
            if (var375 == 65535) {
                var375 = -1;
            }
            int var376 = class388.field5458.method2511(true);
            int var377 = class388.field5458.method2483(-2103088664);
            if (class355.method2132((byte) -80, var377)) {
                class310.method1879(1, -1, -126, var376, var375);
            }
            class255.field3570 = null;
            return true;
        } else {
            class181.method1190((byte) 124, "T1 - " + (class255.field3570 == null ? -1 : class255.field3570.method413((byte) -59)) + "," + (class472.field6619 == null ? -1 : class472.field6619.method413((byte) -83)) + "," + (class7.field129 == null ? -1 : class7.field129.method413((byte) -54)) + " - " + class7.field136, (Throwable) null);
            class166.method1021(arg0 ^ 0xFFFFE34F);
            return true;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lkm;Lkj;IIIII)V", line = 2896)
    public static final void method2009(class487 arg0, class280 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class109.field1542 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class456.field6299) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class205.field2946 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class406 var15 = class455.field6293[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class317.field4306[var12].method710(var13, var14) + class317.field4306[var12].method710(var13 + 1, var14) + class317.field4306[var12].method710(var13, var14 + 1) + class317.field4306[var12].method710(var13 + 1, var14 + 1)) / 4 - (class317.field4306[arg2].method710(arg3, arg4) + class317.field4306[arg2].method710(arg3 + 1, arg4) + class317.field4306[arg2].method710(arg3, arg4 + 1) + class317.field4306[arg2].method710(arg3 + 1, arg4 + 1)) / 4;
                                    class467 var17 = var15.field5617;
                                    class467 var18 = var15.field5624;
                                    if (var17 != null && var17.method195(92)) {
                                        arg1.method198((var13 - arg3) * class372.field5263 + (1 - arg5) * class411.field5703, arg0, var16, var7, (var14 - arg4) * class372.field5263 + (1 - arg6) * class411.field5703, var17, (byte) 59);
                                    }
                                    if (var18 != null && var18.method195(105)) {
                                        arg1.method198((var13 - arg3) * class372.field5263 + (1 - arg5) * class411.field5703, arg0, var16, var7, (var14 - arg4) * class372.field5263 + (1 - arg6) * class411.field5703, var18, (byte) 59);
                                    }
                                    for (class146 var19 = var15.field5613; var19 != null; var19 = var19.field2066) {
                                        class478 var20 = var19.field2062;
                                        if (var20 != null && var20.method195(118) && (var20.field6753 == var13 || var8 == var13) && (var20.field6747 == var14 || var10 == var14)) {
                                            int var21 = var20.field6751 + 1 - var20.field6753;
                                            int var22 = var20.field6749 + 1 - var20.field6747;
                                            arg1.method198((var20.field6753 - arg3) * class372.field5263 + (var21 - arg5) * class411.field5703, arg0, var16, var7, (var20.field6747 - arg4) * class372.field5263 + (var22 - arg6) * class411.field5703, var20, (byte) 59);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V", line = 2997)
    public static void method2010(byte arg0) {
        field4636 = null;
        if (arg0 != 12) {
            field4638 = -88;
        }
        field4635 = null;
        field4633 = null;
    }
}
