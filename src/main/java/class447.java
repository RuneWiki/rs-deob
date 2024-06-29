import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class447 {

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "Lwl;")
    public static class452 field6585 = new class452(39, 1);

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "Ljava/lang/String;")
    public static String field6589 = null;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "Z")
    public static boolean field6590 = false;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field6582;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field6584;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field6587;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "Liq;")
    public static class134 field6591;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "Lsh;")
    public class447 field6586;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "Lsh;")
    public class447 field6588;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
    public static final void method2758(int arg0) {
        class149.field2067 = arg0;
        field6582++;
        class372.field5433.method2512((byte) 4);
        class372.field5433.method2504(42, class126.field1613);
        class149.field2067++;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
    public final void method2759(byte arg0) {
        if (arg0 != -25) {
            this.field6588 = null;
        }
        field6583++;
        if (this.field6586 != null) {
            this.field6586.field6588 = this.field6588;
            this.field6588.field6586 = this.field6586;
            this.field6588 = null;
            this.field6586 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method2760(byte arg0, String arg1) {
        field6584++;
        if (arg1 == null) {
            return -1;
        } else if (arg0 < 21) {
            return -41;
        } else {
            for (int var2 = 0; var2 < class145.field1985; var2++) {
                if (arg1.equalsIgnoreCase(class137.field1853[var2])) {
                    return var2;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)Z")
    public static final boolean method2761(int arg0) throws IOException {
        field6587++;
        if (class301.field4543 == null) {
            return false;
        }
        int var1 = class301.field4543.method2158(false);
        if (var1 == 0) {
            return false;
        }
        if (class288.field4384 == null) {
            if (class111.field1462) {
                class301.field4543.method2159((byte) -128, 0, 1, class424.field6232.field5685);
                var1--;
                class111.field1462 = false;
            }
            class424.field6232.field5666 = 0;
            if (class424.field6232.method713(false)) {
                if (var1 == 0) {
                    return false;
                }
                class301.field4543.method2159((byte) -128, 1, 1, class424.field6232.field5685);
                var1--;
            }
            class111.field1462 = true;
            class452[] var2 = class441.method2697((byte) 119);
            int var3 = class424.field6232.method720((byte) -114);
            if (var3 < 0 || var2.length <= var3) {
                throw new IOException("invo:" + var3);
            }
            class288.field4384 = var2[var3];
            class44.field547 = class288.field4384.field6691;
        }
        if (class44.field547 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class301.field4543.method2159((byte) -128, 0, 1, class424.field6232.field5685);
            var1--;
            class44.field547 = class424.field6232.field5685[0] & 0xFF;
        }
        if (class44.field547 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class301.field4543.method2159((byte) -128, 0, 2, class424.field6232.field5685);
            class424.field6232.field5666 = 0;
            class44.field547 = class424.field6232.method2323(-76);
            var1 -= 2;
        }
        if (class44.field547 > var1) {
            return false;
        }
        class424.field6232.field5666 = 0;
        class301.field4543.method2159((byte) -128, 0, class44.field547, class424.field6232.field5685);
        class299.field4532 = class261.field3980;
        class138.field1870 = 0;
        class261.field3980 = class463.field6831;
        class463.field6831 = class288.field4384;
        if (arg0 != 1) {
            method2758(112);
        }
        if (class412.field6127 == class288.field4384) {
            class312.method1898(true, 3);
            class288.field4384 = null;
            return true;
        } else if (class292.field4440 == class288.field4384) {
            int var4 = class424.field6232.method2354(255);
            int var5 = class424.field6232.method2335(-79);
            int var6 = class424.field6232.method2324(-83);
            if (class103.method650(var5, 19334)) {
                class333 var7 = (class333) class308.field4647.method2302((long) var6, 23576);
                class333 var8 = (class333) class308.field4647.method2302((long) var4, arg0 ^ 0x5C19);
                if (var8 != null) {
                    class367.method2204(var7 == null || var7.field4965 != var8.field4965, (byte) -103, false, var8);
                }
                if (var7 != null) {
                    var7.method625((byte) -50);
                    class308.field4647.method2301(arg0 ^ 0x4D, var7, (long) var4);
                }
                class170 var9 = class168.method1020(var6, (byte) 81);
                if (var9 != null) {
                    class405.method2543(var9, 126);
                }
                class170 var10 = class168.method1020(var4, (byte) 117);
                if (var10 != null) {
                    class405.method2543(var10, 125);
                    class207.method1215(var10, true, 35);
                }
                if (class6.field69 != -1) {
                    class250.method1526((byte) -63, 1, class6.field69);
                }
            }
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class219.field3327) {
            class151.method938(class44.field547, 26, class424.field6232);
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class167.field2364) {
            int var11 = class424.field6232.method2354(255);
            int var12 = class424.field6232.method2323(-79);
            class345.method2101(var11, (byte) 103, var12);
            class288.field4384 = null;
            return true;
        } else if (class396.field5920 == class288.field4384) {
            class433.field6366 = class424.field6232.method2343(255);
            for (int var13 = 0; var13 < class433.field6366; var13++) {
                class289.field4400[var13] = class424.field6232.method2332(102);
                class246.field3687[var13] = class424.field6232.method2332(class339.method2073(arg0, 89));
                if (class246.field3687[var13].equals("")) {
                    class246.field3687[var13] = class289.field4400[var13];
                }
                class458.field6793[var13] = class424.field6232.method2332(124);
                class68.field891[var13] = class424.field6232.method2332(109);
                if (class68.field891[var13].equals("")) {
                    class68.field891[var13] = class458.field6793[var13];
                }
                class75.field1020[var13] = false;
            }
            class72.field958 = class172.field2639;
            class288.field4384 = null;
            return true;
        } else if (class442.field6494 == class288.field4384) {
            int var14 = class424.field6232.method2318(-64);
            int var15 = class424.field6232.method2354(255);
            String var16 = class424.field6232.method2332(78);
            if (class103.method650(var14, 19334)) {
                class246.method1504(var16, var15, 24907);
            }
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class103.field1382) {
            int var17 = class424.field6232.method2343(255);
            int var18 = class424.field6232.method2335(-70);
            class345.method2101(var17, (byte) -124, var18);
            class288.field4384 = null;
            return true;
        } else if (class39.field479 == class288.field4384) {
            boolean var19 = class424.field6232.method2343(255) == 1;
            String var20 = class424.field6232.method2332(61);
            String var21 = var20;
            if (var19) {
                var21 = class424.field6232.method2332(81);
            }
            long var22 = class424.field6232.method2361((byte) -83);
            long var24 = (long) class424.field6232.method2323(-72);
            long var26 = (long) class424.field6232.method2382((byte) -78);
            int var28 = class424.field6232.method2343(255);
            int var29 = class424.field6232.method2323(-9);
            long var30 = (var24 << 32) + var26;
            boolean var32 = false;
            int var33 = 0;
            while (true) {
                if (var33 >= 100) {
                    if (var28 <= 1 && class14.method83(var21, (byte) -105)) {
                        var32 = true;
                    }
                    break;
                }
                if (class251.field3755[var33] == var30) {
                    var32 = true;
                    break;
                }
                var33++;
            }
            if (!var32 && class110.field1448 == 0) {
                class251.field3755[class100.field1374] = var30;
                class100.field1374 = (class100.field1374 + 1) % 100;
                String var34 = class75.method495((byte) -10, var29).method2532(true, class424.field6232);
                if (var28 == 2) {
                    class272.method1694(var34, 20, "<img=1>" + var20, "<img=1>" + var21, var29, class86.method560(-72, var22), (byte) 118, 0);
                } else if (var28 == 1) {
                    class272.method1694(var34, 20, "<img=0>" + var20, "<img=0>" + var21, var29, class86.method560(-54, var22), (byte) 105, 0);
                } else {
                    class272.method1694(var34, 20, var20, var21, var29, class86.method560(-113, var22), (byte) 105, 0);
                }
            }
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class107.field1424) {
            if (class44.field547 == 0) {
                class375.field5460 = class55.field742.method937((byte) 104, class27.field356);
            } else {
                class375.field5460 = class424.field6232.method2332(127);
            }
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class264.field4034) {
            int var35 = class424.field6232.method2354(255);
            int var36 = class424.field6232.method2368((byte) -20);
            int var37 = class424.field6232.method2346(arg0 + 18078);
            int var38 = class424.field6232.method2335(109);
            if (class103.method650(var38, 19334)) {
                class292.method1811(16383, var37, var35, var36);
            }
            class288.field4384 = null;
            return true;
        } else if (class454.field6748 == class288.field4384) {
            class463.method2856(93, class283.field4316);
            class288.field4384 = null;
            return true;
        } else if (class396.field5924 == class288.field4384) {
            int var39 = class424.field6232.method2328(-87);
            byte var40 = class424.field6232.method2364(arg0 ^ 0xFFFFFF8A);
            int var41 = class424.field6232.method2323(-81);
            if (class103.method650(var41, arg0 ^ 0x4B87)) {
                class282.method1735(var40, (byte) 102, var39);
            }
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class187.field2809) {
            class105.field1412 = class424.field6232.method2343(255);
            class386.field5689 = class424.field6232.method2351((byte) 107);
            class220.field3358 = class424.field6232.method2359((byte) -21);
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class262.field3986) {
            class230.method1396((byte) 35, class424.field6232.method2332(66));
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class221.field3367) {
            int var42 = class424.field6232.method2343(arg0 ^ 0xFE);
            boolean var43 = (var42 & 0x1) == 1;
            String var44 = class424.field6232.method2332(84);
            String var45 = class424.field6232.method2332(107);
            if (var45.equals("")) {
                var45 = var44;
            }
            String var46 = class424.field6232.method2332(80);
            String var47 = class424.field6232.method2332(93);
            if (var47.equals("")) {
                var47 = var46;
            }
            if (var43) {
                for (int var48 = 0; var48 < class433.field6366; var48++) {
                    if (class246.field3687[var48].equals(var47)) {
                        class289.field4400[var48] = var44;
                        class246.field3687[var48] = var45;
                        class458.field6793[var48] = var46;
                        class68.field891[var48] = var47;
                        break;
                    }
                }
            } else {
                class289.field4400[class433.field6366] = var44;
                class246.field3687[class433.field6366] = var45;
                class458.field6793[class433.field6366] = var46;
                class68.field891[class433.field6366] = var47;
                class75.field1020[class433.field6366] = class406.method2552(2, var42) == 2;
                class433.field6366++;
            }
            class72.field958 = class172.field2639;
            class288.field4384 = null;
            return true;
        } else if (class407.field6063 == class288.field4384) {
            int var49 = class424.field6232.method2343(255);
            if (class424.field6232.method2343(255) == 0) {
                class276.field4208[var49] = new class319();
            } else {
                class424.field6232.field5666--;
                class276.field4208[var49] = new class319(class424.field6232);
            }
            class288.field4384 = null;
            class146.field2032 = class172.field2639;
            return true;
        } else if (class288.field4384 == class269.field4088) {
            class463.method2856(86, class380.field5547);
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class118.field1544) {
            class463.method2856(109, class140.field1880);
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class287.field4373) {
            class277.method1715(arg0 ^ 0x42, true);
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class146.field2026) {
            int var50 = class424.field6232.method2323(-80);
            int var51 = class424.field6232.method2323(arg0 ^ 0xFFFFFF95);
            int var52 = class424.field6232.method2354(255);
            if (class103.method650(var50, 19334)) {
                class20.method124(var51, var52, -65);
            }
            class288.field4384 = null;
            return true;
        } else if (class347.field5186 == class288.field4384) {
            int var53 = class424.field6232.method2323(-2);
            int var54 = class424.field6232.method2343(arg0 ^ 0xFE);
            boolean var55 = (var54 & 0x1) == 1;
            while (class44.field547 > class424.field6232.field5666) {
                int var56 = class424.field6232.method2372(true);
                int var57 = class424.field6232.method2323(-54);
                int var58 = 0;
                if (var57 != 0) {
                    var58 = class424.field6232.method2343(arg0 + 254);
                    if (var58 == 255) {
                        var58 = class424.field6232.method2354(arg0 + 254);
                    }
                }
                class32.method188(var55, var56, var58, var57 - 1, var53, false);
            }
            class53.field719[class406.method2552(31, class184.field2776++)] = var53;
            class288.field4384 = null;
            return true;
        } else if (class66.field849 == class288.field4384) {
            class418.method2601(-117, class44.field547, class424.field6232, class79.field1043);
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class265.field4043) {
            int var59 = class424.field6232.method2351((byte) 125);
            int var60 = class424.field6232.method2335(-114);
            if (var60 == 65535) {
                var60 = -1;
            }
            class108.method667(var59, var60, -115);
            class288.field4384 = null;
            return true;
        } else if (class402.field6009 == class288.field4384) {
            int var61 = class424.field6232.method2318(104);
            if (var61 == 65535) {
                var61 = -1;
            }
            int var62 = class424.field6232.method2343(arg0 ^ 0xFE);
            int var63 = class424.field6232.method2374((byte) 83);
            class418.method2603(var61, 0, var62, var63);
            class288.field4384 = null;
            return true;
        } else if (class409.field6084 == class288.field4384) {
            class463.method2856(arg0 + 91, class378.field5508);
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class165.field2303) {
            String var64 = class424.field6232.method2332(127);
            int var65 = class424.field6232.method2335(99);
            int var66 = class424.field6232.method2335(arg0 ^ 0x6A);
            if (class103.method650(var66, 19334)) {
                class105.method658(var64, -33, var65);
            }
            class288.field4384 = null;
            return true;
        } else if (class315.field4768 == class288.field4384) {
            int var67 = class424.field6232.method2323(-105);
            int var68 = class424.field6232.method2328(-83);
            int var69 = class424.field6232.method2324(-102);
            int var70 = class424.field6232.method2335(arg0 ^ 0xFFFFFF94);
            int var71 = class424.field6232.method2323(-68);
            if (class103.method650(var67, 19334)) {
                class449.method2769(var71, (byte) 100, var70, var68, var69);
            }
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class140.field1885) {
            int var72 = class424.field6232.method2324(arg0 ^ 0xFFFFFF90);
            int var73 = class424.field6232.method2335(104);
            int var74 = class424.field6232.method2323(arg0 - 3);
            if (class103.method650(var74, 19334)) {
                class282.method1735(var72, (byte) 102, var73);
            }
            class288.field4384 = null;
            return true;
        } else if (class362.field5329 == class288.field4384) {
            class105.field1412 = class424.field6232.method2359((byte) -21);
            class386.field5689 = class424.field6232.method2359((byte) -21);
            class220.field3358 = class424.field6232.method2343(arg0 ^ 0xFE);
            while (class44.field547 > class424.field6232.field5666) {
                class55 var75 = class283.method1740(false)[class424.field6232.method2343(255)];
                class463.method2856(121, var75);
            }
            class288.field4384 = null;
            return true;
        } else if (class42.field512 == class288.field4384) {
            class103.field1397 = class424.field6232.method2359((byte) -21);
            class265.field4038 = class424.field6232.method2351((byte) 66);
            class162.field2254 = class424.field6232.method2365(0);
            class288.field4384 = null;
            return true;
        } else if (class440.field6466 == class288.field4384) {
            int var76 = class424.field6232.method2323(arg0 - 83);
            int var77 = class424.field6232.method2354(255);
            if (class103.method650(var76, 19334)) {
                class333 var78 = (class333) class308.field4647.method2302((long) var77, 23576);
                if (var78 != null) {
                    class367.method2204(true, (byte) -68, false, var78);
                }
                if (class98.field1359 != null) {
                    class405.method2543(class98.field1359, 125);
                    class98.field1359 = null;
                }
            }
            class288.field4384 = null;
            return true;
        } else if (class335.field4982 == class288.field4384) {
            class463.method2856(arg0 + 88, class219.field3337);
            class288.field4384 = null;
            return true;
        } else if (class343.field5126 == class288.field4384) {
            int var79 = class424.field6232.method2323(-102);
            int var80 = class424.field6232.method2323(-104);
            int var81 = class424.field6232.method2323(-74);
            int var82 = class424.field6232.method2323(-13);
            if (class103.method650(var79, 19334) && class130.field1650[var80] != null) {
                for (int var83 = var81; var83 < var82; var83++) {
                    int var84 = class424.field6232.method2382((byte) -77);
                    if (var83 < class130.field1650[var80].length && class130.field1650[var80][var83] != null) {
                        class130.field1650[var80][var83].field2541 = var84;
                    }
                }
            }
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class20.field273) {
            class463.method2856(114, class47.field580);
            class288.field4384 = null;
            return true;
        } else if (class63.field797 == class288.field4384) {
            class463.method2856(71, class466.field6863);
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class228.field3462) {
            int var85 = class424.field6232.method2323(-89);
            int var86 = class424.field6232.method2343(255);
            int var87 = class424.field6232.method2343(255);
            int var88 = class424.field6232.method2343(255);
            int var89 = class424.field6232.method2343(255);
            int var90 = class424.field6232.method2323(-69);
            if (class103.method650(var85, arg0 ^ 0x4B87)) {
                class79.field1038[var86] = true;
                class381.field5556[var86] = var87;
                class161.field2245[var86] = var88;
                class28.field367[var86] = var89;
                class427.field6288[var86] = var90;
            }
            class288.field4384 = null;
            return true;
        } else if (class54.field727 == class288.field4384) {
            String var91 = class424.field6232.method2332(127);
            boolean var92 = class424.field6232.method2343(255) == 1;
            String var93;
            if (var92) {
                var93 = class424.field6232.method2332(81);
            } else {
                var93 = var91;
            }
            int var94 = class424.field6232.method2323(-13);
            byte var95 = class424.field6232.method2341((byte) 54);
            boolean var96 = false;
            if (var95 == -128) {
                var96 = true;
            }
            if (var96) {
                if (class74.field979 == 0) {
                    class288.field4384 = null;
                    return true;
                }
                boolean var97 = false;
                int var98;
                for (var98 = 0; var98 < class74.field979 && (!class196.field2964[var98].field4684.equals(var93) || class196.field2964[var98].field4678 != var94); var98++) {
                }
                if (var98 < class74.field979) {
                    while (var98 < class74.field979 - 1) {
                        class196.field2964[var98] = class196.field2964[var98 + 1];
                        var98++;
                    }
                    class74.field979--;
                    class196.field2964[class74.field979] = null;
                }
            } else {
                String var99 = class424.field6232.method2332(78);
                class311 var100 = new class311();
                var100.field4681 = var91;
                var100.field4684 = var93;
                var100.field4679 = class171.method1054(0, var100.field4684);
                var100.field4683 = var95;
                var100.field4680 = var99;
                var100.field4678 = var94;
                int var101;
                for (var101 = class74.field979 - 1; var101 >= 0; var101--) {
                    int var102 = class196.field2964[var101].field4679.compareTo(var100.field4679);
                    if (var102 == 0) {
                        class196.field2964[var101].field4678 = var94;
                        class196.field2964[var101].field4683 = var95;
                        class196.field2964[var101].field4680 = var99;
                        if (var93.equals(class113.field1500.field2459)) {
                            class128.field1646 = var95;
                        }
                        class243.field3650 = class172.field2639;
                        class288.field4384 = null;
                        return true;
                    }
                    if (var102 < 0) {
                        break;
                    }
                }
                if (class196.field2964.length <= class74.field979) {
                    class288.field4384 = null;
                    return true;
                }
                for (int var103 = class74.field979 - 1; var103 > var101; var103--) {
                    class196.field2964[var103 + 1] = class196.field2964[var103];
                }
                if (class74.field979 == 0) {
                    class196.field2964 = new class311[100];
                }
                class196.field2964[var101 + 1] = var100;
                class74.field979++;
                if (var93.equals(class113.field1500.field2459)) {
                    class128.field1646 = var95;
                }
            }
            class288.field4384 = null;
            class243.field3650 = class172.field2639;
            return true;
        } else if (class396.field5921 == class288.field4384) {
            boolean var104 = class424.field6232.method2343(255) == 1;
            String var105 = class424.field6232.method2332(83);
            String var106 = var105;
            if (var104) {
                var106 = class424.field6232.method2332(76);
            }
            long var107 = (long) class424.field6232.method2323(arg0 - 50);
            long var109 = (long) class424.field6232.method2382((byte) -97);
            int var111 = class424.field6232.method2343(arg0 ^ 0xFE);
            int var112 = class424.field6232.method2323(-2);
            long var113 = (var107 << 32) + var109;
            boolean var115 = false;
            int var116 = 0;
            while (true) {
                if (var116 >= 100) {
                    if (var111 <= 1 && class14.method83(var106, (byte) -110)) {
                        var115 = true;
                    }
                    break;
                }
                if (class251.field3755[var116] == var113) {
                    var115 = true;
                    break;
                }
                var116++;
            }
            if (!var115 && class110.field1448 == 0) {
                class251.field3755[class100.field1374] = var113;
                class100.field1374 = (class100.field1374 + 1) % 100;
                String var117 = class75.method495((byte) -10, var112).method2532(true, class424.field6232);
                if (var111 == 2) {
                    class272.method1694(var117, 18, "<img=1>" + var105, "<img=1>" + var106, var112, (String) null, (byte) 111, 0);
                } else if (var111 == 1) {
                    class272.method1694(var117, 18, "<img=0>" + var105, "<img=0>" + var106, var112, (String) null, (byte) 108, 0);
                } else {
                    class272.method1694(var117, 18, var105, var106, var112, (String) null, (byte) 122, 0);
                }
            }
            class288.field4384 = null;
            return true;
        } else if (class68.field890 == class288.field4384) {
            class463.method2856(71, class137.field1859);
            class288.field4384 = null;
            return true;
        } else if (class430.field6323 == class288.field4384) {
            class424.field6232.field5666 += 28;
            if (class424.field6232.method2350(true)) {
                class80.method518(class424.field6232, class424.field6232.field5666 - 28, 72);
            }
            class288.field4384 = null;
            return true;
        } else if (class326.field4899 == class288.field4384) {
            boolean var118 = class424.field6232.method2343(255) == 1;
            String var119 = class424.field6232.method2332(107);
            String var120 = var119;
            if (var118) {
                var120 = class424.field6232.method2332(arg0 + 114);
            }
            long var121 = (long) class424.field6232.method2323(-21);
            long var123 = (long) class424.field6232.method2382((byte) -97);
            int var125 = class424.field6232.method2343(arg0 + 254);
            long var126 = (var121 << 32) + var123;
            boolean var128 = false;
            int var129 = 0;
            while (true) {
                if (var129 >= 100) {
                    if (var125 <= 1) {
                        if (!(!class430.field6326 || class238.field3570) || class286.field4361) {
                            var128 = true;
                        } else if (class14.method83(var120, (byte) -71)) {
                            var128 = true;
                        }
                    }
                    break;
                }
                if (class251.field3755[var129] == var126) {
                    var128 = true;
                    break;
                }
                var129++;
            }
            if (!var128 && class110.field1448 == 0) {
                class251.field3755[class100.field1374] = var126;
                class100.field1374 = (class100.field1374 + 1) % 100;
                String var130 = class376.method2265(-63, class380.method2293(class128.method752(80, class424.field6232), arg0 + 31905));
                if (var125 == 2) {
                    class272.method1694(var130, 7, "<img=1>" + var119, "<img=1>" + var120, -1, (String) null, (byte) 102, 0);
                } else if (var125 == 1) {
                    class272.method1694(var130, 7, "<img=0>" + var119, "<img=0>" + var120, -1, (String) null, (byte) 119, 0);
                } else {
                    class272.method1694(var130, 3, var119, var120, -1, (String) null, (byte) 101, 0);
                }
            }
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class201.field3019) {
            class85.field1127 = class424.field6232.method2323(arg0 - 55) * 30;
            class288.field4384 = null;
            class277.field4212 = class172.field2639;
            return true;
        } else if (class288.field4384 == class173.field2657) {
            boolean var131 = class424.field6232.method2343(arg0 ^ 0xFE) == 1;
            String var132 = class424.field6232.method2332(116);
            String var133 = var132;
            if (var131) {
                var133 = class424.field6232.method2332(84);
            }
            long var134 = class424.field6232.method2361((byte) -110);
            long var136 = (long) class424.field6232.method2323(-50);
            long var138 = (long) class424.field6232.method2382((byte) -89);
            int var140 = class424.field6232.method2343(arg0 + 254);
            long var141 = (var136 << 32) + var138;
            boolean var143 = false;
            int var144 = 0;
            while (true) {
                if (var144 >= 100) {
                    if (var140 <= 1) {
                        if (!(!class430.field6326 || class238.field3570) || class286.field4361) {
                            var143 = true;
                        } else if (class14.method83(var133, (byte) -76)) {
                            var143 = true;
                        }
                    }
                    break;
                }
                if (class251.field3755[var144] == var141) {
                    var143 = true;
                    break;
                }
                var144++;
            }
            if (!var143 && class110.field1448 == 0) {
                class251.field3755[class100.field1374] = var141;
                class100.field1374 = (class100.field1374 + 1) % 100;
                String var145 = class376.method2265(-63, class380.method2293(class128.method752(-124, class424.field6232), 31906));
                if (var140 == 2 || var140 == 3) {
                    class272.method1694(var145, 9, "<img=1>" + var132, "<img=1>" + var133, -1, class86.method560(arg0 - 110, var134), (byte) 126, 0);
                } else if (var140 == 1) {
                    class272.method1694(var145, 9, "<img=0>" + var132, "<img=0>" + var133, -1, class86.method560(-85, var134), (byte) 102, 0);
                } else {
                    class272.method1694(var145, 9, var132, var133, -1, class86.method560(arg0 - 85, var134), (byte) 103, 0);
                }
            }
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class132.field1675) {
            int var146 = class424.field6232.method2335(-89);
            if (var146 == 65535) {
                var146 = -1;
            }
            int var147 = class424.field6232.method2324(-91);
            int var148 = class424.field6232.method2323(-81);
            if (class103.method650(var148, arg0 ^ 0x4B87)) {
                class409.method2567(var147, -25, var146);
            }
            class288.field4384 = null;
            return true;
        } else if (class451.field6655 == class288.field4384) {
            int var149 = class424.field6232.method2335(-23);
            int var150 = class424.field6232.method2328(-66);
            String var151 = class424.field6232.method2332(113);
            if (class103.method650(var150, 19334)) {
                class105.method658(var151, arg0 ^ 0xFFFFFFB7, var149);
            }
            class288.field4384 = null;
            return true;
        } else if (class312.field4692 == class288.field4384) {
            for (int var152 = 0; var152 < class140.field1883.length; var152++) {
                if (class140.field1883[var152] != null) {
                    class140.field1883[var152].field1955 = -1;
                }
            }
            for (int var153 = 0; var153 < class170.field2626.length; var153++) {
                if (class170.field2626[var153] != null) {
                    class170.field2626[var153].field1955 = -1;
                }
            }
            class288.field4384 = null;
            return true;
        } else if (class408.field6073 == class288.field4384) {
            int var154 = class424.field6232.method2323(-39);
            String var155 = class424.field6232.method2332(arg0 ^ 0x53);
            Object[] var156 = new Object[var155.length() + 1];
            for (int var157 = var155.length() - 1; var157 >= 0; var157--) {
                if (var155.charAt(var157) == 's') {
                    var156[var157 + 1] = class424.field6232.method2332(65);
                } else {
                    var156[var157 + 1] = Integer.valueOf(class424.field6232.method2354(255));
                }
            }
            var156[0] = Integer.valueOf(class424.field6232.method2354(255));
            if (class103.method650(var154, 19334)) {
                class327 var158 = new class327();
                var158.field4908 = var156;
                class384.method2316(var158);
            }
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class271.field4161) {
            int var159 = class424.field6232.method2323(-42);
            if (class103.method650(var159, arg0 ^ 0x4B87)) {
                class265.method1645((byte) 117);
            }
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class20.field270) {
            int var160 = class424.field6232.method2351((byte) 106);
            int var161 = class424.field6232.method2323(-22);
            if (class103.method650(var161, 19334)) {
                class5.field62 = var160;
            }
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class258.field3955) {
            class243.field3650 = class172.field2639;
            if (class44.field547 == 0) {
                class196.field2964 = null;
                class288.field4384 = null;
                class36.field433 = null;
                field6589 = null;
                class74.field979 = 0;
                return true;
            }
            field6589 = class424.field6232.method2332(108);
            boolean var162 = class424.field6232.method2343(255) == 1;
            if (var162) {
                class424.field6232.method2332(arg0 ^ 0x5D);
            }
            long var163 = class424.field6232.method2361((byte) -77);
            class36.field433 = class437.method2681(true, var163);
            class357.field5255 = class424.field6232.method2341((byte) 54);
            int var165 = class424.field6232.method2343(255);
            if (var165 == 255) {
                class288.field4384 = null;
                return true;
            }
            class74.field979 = var165;
            class311[] var166 = new class311[100];
            for (int var167 = 0; var167 < class74.field979; var167++) {
                var166[var167] = new class311();
                var166[var167].field4681 = class424.field6232.method2332(58);
                boolean var173 = class424.field6232.method2343(255) == 1;
                if (var173) {
                    var166[var167].field4684 = class424.field6232.method2332(92);
                } else {
                    var166[var167].field4684 = var166[var167].field4681;
                }
                var166[var167].field4679 = class171.method1054(0, var166[var167].field4684);
                var166[var167].field4678 = class424.field6232.method2323(-4);
                var166[var167].field4683 = class424.field6232.method2341((byte) 54);
                var166[var167].field4680 = class424.field6232.method2332(88);
                if (var166[var167].field4684.equals(class113.field1500.field2459)) {
                    class128.field1646 = var166[var167].field4683;
                }
            }
            boolean var168 = false;
            int var169 = class74.field979;
            while (var169 > 0) {
                var169--;
                boolean var170 = true;
                for (int var171 = 0; var171 < var169; var171++) {
                    if (var166[var171].field4679.compareTo(var166[var171 + 1].field4679) > 0) {
                        class311 var172 = var166[var171];
                        var166[var171] = var166[var171 + 1];
                        var170 = false;
                        var166[var171 + 1] = var172;
                    }
                }
                if (var170) {
                    break;
                }
            }
            class288.field4384 = null;
            class196.field2964 = var166;
            return true;
        } else if (class288.field4384 == class111.field1460) {
            int var174 = class424.field6232.method2323(-73);
            if (class103.method650(var174, 19334)) {
                class77.method506(true);
            }
            class288.field4384 = null;
            return true;
        } else if (class422.field6212 == class288.field4384) {
            int var175 = class424.field6232.method2323(arg0 ^ 0xFFFFFFE6);
            int var176 = class424.field6232.method2343(255);
            int var177 = class424.field6232.method2323(-2);
            int var178 = class424.field6232.method2324(arg0 ^ 0xFFFFFFA5);
            if (class103.method650(var175, 19334)) {
                class333 var179 = (class333) class308.field4647.method2302((long) var178, 23576);
                if (var179 != null) {
                    class367.method2204(var179.field4965 != var177, (byte) -62, false, var179);
                }
                class160.method969(var178, var177, false, (byte) -92, var176);
            }
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class278.field4222) {
            int var180 = class424.field6232.method2367(13);
            int var181 = class424.field6232.method2345(255);
            int var182 = class424.field6232.method2318(-63);
            int var183 = class424.field6232.method2328(-72);
            if (class103.method650(var182, 19334)) {
                class273.method1703(5, var183, var181, var180, 89);
            }
            class288.field4384 = null;
            return true;
        } else if (class415.field6162 == class288.field4384) {
            int var184 = class424.field6232.method2335(89);
            int var185 = class424.field6232.method2354(arg0 + 254);
            class318.method1943(var185, var184, -108);
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class284.field4326) {
            int var186 = class424.field6232.method2345(255);
            int var187 = (var186 & 0x31BF96BD) >> 28;
            int var188 = var186 >> 14 & 0x3FFF;
            int var189 = var186 & 0x3FFF;
            int var190 = class424.field6232.method2365(0);
            int var191 = var190 >> 2;
            int var192 = var190 & 0x3;
            int var193 = class423.field6228[var191];
            int var194 = class424.field6232.method2328(-116);
            int var195 = var189 - class112.field1487;
            int var196 = var188 - class17.field250;
            if (var194 == 65535) {
                var194 = -1;
            }
            class168.method1019(var192, var194, var193, var195, var187, var196, 8, var191);
            class288.field4384 = null;
            return true;
        } else if (class407.field6053 == class288.field4384) {
            int var197 = class424.field6232.method2365(0);
            int var198 = class424.field6232.method2335(109);
            int var199 = class424.field6232.method2318(-127);
            class155 var200 = class170.field2626[var198];
            if (var200 != null) {
                class146.method916(var199, var200, (byte) -36, var197);
            }
            class288.field4384 = null;
            return true;
        } else if (class414.field6144 == class288.field4384) {
            int var201 = class424.field6232.method2365(0);
            int var202 = class424.field6232.method2324(-121);
            int var203 = class424.field6232.method2318(-37);
            if (class103.method650(var203, 19334)) {
                class138.method879((byte) 31, var201, var202);
            }
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class113.field1490) {
            int var204 = class424.field6232.method2367(121);
            int var205 = class424.field6232.method2351((byte) 75);
            int var206 = class424.field6232.method2365(0);
            class327.field4906[var206] = var204;
            class245.field3681[var206] = var205;
            class455.field6761[var206] = 1;
            int var207 = class79.field1041[var206] - 1;
            for (int var208 = 0; var208 < var207; var208++) {
                if (class286.field4356[var208] <= var204) {
                    class455.field6761[var206] = var208 + 2;
                }
            }
            class401.field5976[class406.method2552(class30.field381++, 31)] = var206;
            class288.field4384 = null;
            return true;
        } else if (class39.field496 == class288.field4384) {
            class333.method2038(-1);
            class288.field4384 = null;
            class463.field6825 += 32;
            return true;
        } else if (class288.field4384 == class114.field1511) {
            int var209 = class424.field6232.method2328(-87);
            if (var209 == 65535) {
                var209 = -1;
            }
            int var210 = class424.field6232.method2365(0);
            String var211 = class424.field6232.method2332(123);
            int var212 = class424.field6232.method2359((byte) -21);
            if (var212 >= 1 && var212 <= 8) {
                if (var211.equalsIgnoreCase("null")) {
                    var211 = null;
                }
                class119.field1567[var212 - 1] = var211;
                class453.field6719[var212 - 1] = var209;
                class296.field4497[var212 - 1] = var210 == 0;
            }
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class269.field4086) {
            int var213 = class424.field6232.method2345(arg0 ^ 0xFE);
            int var214 = class424.field6232.method2318(arg0 ^ 0xFFFFFFC4);
            if (var214 == 65535) {
                var214 = -1;
            }
            int var215 = class424.field6232.method2323(-97);
            int var216 = class424.field6232.method2324(arg0 - 102);
            int var217 = class424.field6232.method2318(109);
            if (var217 == 65535) {
                var217 = -1;
            }
            if (class103.method650(var215, 19334)) {
                for (int var218 = var217; var218 <= var214; var218++) {
                    long var219 = ((long) var213 << 32) + (long) var218;
                    class312 var221 = (class312) class80.field1050.method2302(var219, 23576);
                    class312 var222;
                    if (var221 != null) {
                        var222 = new class312(var216, var221.field4687);
                        var221.method625((byte) -50);
                    } else if (var218 == -1) {
                        var222 = new class312(var216, class168.method1020(var213, (byte) 69).field2480.field4687);
                    } else {
                        var222 = new class312(var216, -1);
                    }
                    class80.field1050.method2301(97, var222, var219);
                }
            }
            class288.field4384 = null;
            return true;
        } else if (class71.field930 == class288.field4384) {
            class386.field5689 = class424.field6232.method2359((byte) -21);
            class220.field3358 = class424.field6232.method2365(0);
            class105.field1412 = class424.field6232.method2343(255);
            for (class429 var223 = (class429) class45.field557.method2296(5773); var223 != null; var223 = (class429) class45.field557.method2304(100)) {
                int var225 = (int) (var223.field1339 & 0x3FFFL);
                int var226 = (int) (var223.field1339 >> 14 & 0x3FFFL);
                int var227 = (int) (var223.field1339 >> 28 & 0x3L);
                if (class220.field3358 == var227 && var225 >= class386.field5689 && class386.field5689 + 8 > var225 && class105.field1412 <= var226 && (class105.field1412 + 8) > var226) {
                    var223.method625((byte) -50);
                    class292.method1808(-108, var225, var226, class220.field3358);
                }
            }
            for (class343 var224 = (class343) class192.field2875.method2514((byte) 61); var224 != null; var224 = (class343) class192.field2875.method2511(115)) {
                if (var224.field5129 >= class386.field5689 && class386.field5689 + 8 > var224.field5129 && var224.field5135 >= class105.field1412 && (class105.field1412 + 8) > var224.field5135 && class220.field3358 == var224.field5137) {
                    var224.field5130 = 0;
                }
            }
            class288.field4384 = null;
            return true;
        } else if (class388.field5752 == class288.field4384) {
            class463.method2856(81, class333.field4970);
            class288.field4384 = null;
            return true;
        } else if (class359.field5304 == class288.field4384) {
            int var228 = class424.field6232.method2318(117);
            int var229 = class424.field6232.method2335(arg0 - 39);
            int var230 = class424.field6232.method2359((byte) -21);
            if (class103.method650(var228, 19334)) {
                if (var230 == 2) {
                    class74.method492((byte) 12);
                }
                class6.field69 = var229;
                class292.method1810(var229, arg0 - 1);
                class39.method224(arg0 ^ 0x62, false);
                class384.method2314(class6.field69);
                for (int var231 = 0; var231 < 100; var231++) {
                    class6.field71[var231] = true;
                }
            }
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class131.field1669) {
            class185.field2787 = class424.field6232.method2343(arg0 + 254);
            class288.field4384 = null;
            class277.field4212 = class172.field2639;
            return true;
        } else if (class288.field4384 == class238.field3568) {
            class289.field4393 = class424.field6232.method2327((byte) -116);
            class288.field4384 = null;
            class277.field4212 = class172.field2639;
            return true;
        } else if (class288.field4384 == class163.field2269) {
            class463.method2856(arg0 ^ 0x7B, class429.field6306);
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class100.field1369) {
            byte var232 = class424.field6232.method2376(128);
            int var233 = class424.field6232.method2335(82);
            class318.method1943(var232, var233, -116);
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class189.field2836) {
            int var234 = class424.field6232.method2323(-8);
            int var235 = class424.field6232.method2327((byte) -116);
            int var236 = class424.field6232.method2367(-119);
            if (class103.method650(var234, 19334)) {
                class432.method2653(var235, var236, 5);
            }
            class288.field4384 = null;
            return true;
        } else if (class456.field6769 == class288.field4384) {
            int var237 = class424.field6232.method2318(115);
            int var238 = class424.field6232.method2367(46);
            int var239 = class424.field6232.method2323(-56);
            if (class103.method650(var237, 19334)) {
                class261.method1610(arg0 ^ 0xFFFFFF8D, var239, var238);
            }
            class288.field4384 = null;
            return true;
        } else if (class375.field5478 == class288.field4384) {
            class463.method2856(arg0 ^ 0x7B, class380.field5553);
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class229.field3501) {
            boolean var240 = class424.field6232.method2343(255) == 1;
            String var241 = class424.field6232.method2332(67);
            String var242 = class424.field6232.method2332(98);
            int var243 = class424.field6232.method2323(-127);
            int var244 = class424.field6232.method2343(arg0 ^ 0xFE);
            String var245 = "";
            boolean var246 = false;
            if (var243 > 0) {
                var245 = class424.field6232.method2332(81);
                var246 = class424.field6232.method2343(arg0 + 254) == 1;
            }
            for (int var247 = 0; var247 < class145.field1985; var247++) {
                if (var240) {
                    if (var242.equals(class137.field1853[var247])) {
                        class137.field1853[var247] = var241;
                        var241 = null;
                        class112.field1486[var247] = var242;
                        break;
                    }
                } else if (var241.equals(class137.field1853[var247])) {
                    if (class151.field2089[var247] != var243) {
                        class151.field2089[var247] = var243;
                        if (var243 > 0) {
                            class261.method1618(0, "", (byte) 108, 5, var241 + class333.field4964.method937((byte) -101, class27.field356), "");
                        }
                        if (var243 == 0) {
                            class261.method1618(0, "", (byte) 108, 5, var241 + class407.field6043.method937((byte) 126, class27.field356), "");
                        }
                    }
                    class112.field1486[var247] = var242;
                    class255.field3941[var247] = var245;
                    class418.field6199[var247] = var244;
                    class189.field2837[var247] = var246;
                    var241 = null;
                    break;
                }
            }
            if (var241 != null && class145.field1985 < 200) {
                class137.field1853[class145.field1985] = var241;
                class112.field1486[class145.field1985] = var242;
                class151.field2089[class145.field1985] = var243;
                class255.field3941[class145.field1985] = var245;
                class418.field6199[class145.field1985] = var244;
                class189.field2837[class145.field1985] = var246;
                class145.field1985++;
            }
            class72.field958 = class172.field2639;
            boolean var248 = false;
            int var249 = class145.field1985;
            while (var249 > 0) {
                var249--;
                boolean var250 = true;
                for (int var251 = 0; var251 < var249; var251++) {
                    if (class151.field2089[var251] != class414.field6149 && class151.field2089[var251 + 1] == class414.field6149 || class151.field2089[var251] == 0 && class151.field2089[var251 + 1] != 0) {
                        int var252 = class151.field2089[var251];
                        class151.field2089[var251] = class151.field2089[var251 + 1];
                        class151.field2089[var251 + 1] = var252;
                        String var253 = class255.field3941[var251];
                        class255.field3941[var251] = class255.field3941[var251 + 1];
                        class255.field3941[var251 + 1] = var253;
                        String var254 = class137.field1853[var251];
                        class137.field1853[var251] = class137.field1853[var251 + 1];
                        class137.field1853[var251 + 1] = var254;
                        String var255 = class112.field1486[var251];
                        class112.field1486[var251] = class112.field1486[var251 + 1];
                        class112.field1486[var251 + 1] = var255;
                        int var256 = class418.field6199[var251];
                        class418.field6199[var251] = class418.field6199[var251 + 1];
                        class418.field6199[var251 + 1] = var256;
                        boolean var257 = class189.field2837[var251];
                        class189.field2837[var251] = class189.field2837[var251 + 1];
                        class189.field2837[var251 + 1] = var257;
                        var250 = false;
                    }
                }
                if (var250) {
                    break;
                }
            }
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class282.field4310) {
            String var258 = class424.field6232.method2332(123);
            String var259 = class376.method2265(-63, class380.method2293(class128.method752(arg0 ^ 0x2B, class424.field6232), arg0 ^ 0x7CA3));
            class261.method1618(0, var258, (byte) 108, 6, var259, var258);
            class288.field4384 = null;
            return true;
        } else if (class446.field6572 == class288.field4384) {
            int var260 = class424.field6232.method2323(-109);
            int var261 = class424.field6232.method2343(255);
            int var262 = class424.field6232.method2343(255);
            int var263 = class424.field6232.method2323(arg0 - 118);
            int var264 = class424.field6232.method2343(255);
            int var265 = class424.field6232.method2343(255);
            if (class103.method650(var260, 19334)) {
                class275.method1707(var262, var263, var264, -21223, var265, var261);
            }
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class119.field1562) {
            int var266 = class424.field6232.method2343(255);
            int var267 = var266 >> 5;
            int var268 = var266 & 0x1F;
            if (var268 == 0) {
                class55.field744[var267] = null;
                class288.field4384 = null;
                return true;
            }
            class8 var269 = new class8();
            var269.field85 = var268;
            var269.field84 = class424.field6232.method2343(255);
            if (var269.field84 >= 0 && class262.field4013.length > var269.field84) {
                if (var269.field85 == 1 || var269.field85 == 10) {
                    var269.field79 = class424.field6232.method2323(-115);
                    class424.field6232.field5666 += 6;
                } else if (var269.field85 >= 2 && var269.field85 <= 6) {
                    if (var269.field85 == 2) {
                        var269.field87 = 64;
                        var269.field76 = 64;
                    }
                    if (var269.field85 == 3) {
                        var269.field76 = 64;
                        var269.field87 = 0;
                    }
                    if (var269.field85 == 4) {
                        var269.field87 = 128;
                        var269.field76 = 64;
                    }
                    if (var269.field85 == 5) {
                        var269.field87 = 64;
                        var269.field76 = 0;
                    }
                    if (var269.field85 == 6) {
                        var269.field87 = 64;
                        var269.field76 = 128;
                    }
                    var269.field85 = 2;
                    var269.field93 = class424.field6232.method2343(255);
                    var269.field78 = class424.field6232.method2323(-83);
                    var269.field89 = class424.field6232.method2323(-4);
                    var269.field88 = class424.field6232.method2343(arg0 ^ 0xFE);
                    var269.field90 = class424.field6232.method2323(-71);
                }
                var269.field83 = class424.field6232.method2323(-94);
                if (var269.field83 == 65535) {
                    var269.field83 = -1;
                }
                class55.field744[var267] = var269;
            }
            class288.field4384 = null;
            return true;
        } else if (class425.field6249 == class288.field4384) {
            int var270 = class424.field6232.method2318(-88);
            if (var270 == 65535) {
                var270 = -1;
            }
            int var271 = class424.field6232.method2328(-66);
            int var272 = class424.field6232.method2354(255);
            if (class103.method650(var271, arg0 ^ 0x4B87)) {
                class273.method1703(1, var270, var272, -1, 90);
            }
            class288.field4384 = null;
            return true;
        } else if (class52.field675 == class288.field4384) {
            int var273 = class424.field6232.method2323(-85);
            if (var273 == 65535) {
                var273 = -1;
            }
            int var274 = class424.field6232.method2343(255);
            int var275 = class424.field6232.method2323(-98);
            int var276 = class424.field6232.method2343(255);
            class189.method1151(var276, var273, var275, var274, (byte) -102);
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class150.field2074) {
            int var277 = class424.field6232.method2351((byte) 79);
            int var278 = class424.field6232.method2359((byte) -21);
            if (var277 == 255) {
                var277 = -1;
                var278 = -1;
            }
            class345.method2103(var277, arg0 ^ 0xFFFFFFB3, var278);
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class132.field1688) {
            class277.method1715(-62, false);
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class184.field2775) {
            String var279 = class424.field6232.method2332(96);
            int var280 = class424.field6232.method2323(-53);
            String var281 = class75.method495((byte) -10, var280).method2532(true, class424.field6232);
            class272.method1694(var281, 19, var279, var279, var280, (String) null, (byte) 105, 0);
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class170.field2629) {
            int var282 = class424.field6232.method2318(arg0 + 119);
            int var283 = class424.field6232.method2345(255);
            if (class103.method650(var282, 19334)) {
                class273.method1703(3, -1, var283, -1, arg0 ^ 0x77);
            }
            class288.field4384 = null;
            return true;
        } else if (field6585 == class288.field4384) {
            class97.field1337 = class424.field6232.method2343(arg0 + 254);
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class185.field2785) {
            int var284 = class424.field6232.method2323(-40);
            int var285 = class424.field6232.method2343(255);
            boolean var286 = (var285 & 0x1) == 1;
            class8.method63(var284, var286, 93);
            int var287 = class424.field6232.method2323(-4);
            for (int var288 = 0; var288 < var287; var288++) {
                int var289 = class424.field6232.method2343(255);
                if (var289 == 255) {
                    var289 = class424.field6232.method2354(255);
                }
                int var290 = class424.field6232.method2318(-65);
                class32.method188(var286, var288, var289, var290 - 1, var284, false);
            }
            class53.field719[class406.method2552(31, class184.field2776++)] = var284;
            class288.field4384 = null;
            return true;
        } else if (class45.field565 == class288.field4384) {
            int var291 = class424.field6232.method2335(-106);
            int var292 = class424.field6232.method2345(255);
            int var293 = class424.field6232.method2318(-92);
            int var294 = class424.field6232.method2328(-88);
            if (class103.method650(var293, arg0 ^ 0x4B87)) {
                class13.method79(-1, (var291 << 16) + var294, var292);
            }
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class155.field2154) {
            class77.method504((byte) 17);
            class288.field4384 = null;
            return false;
        } else if (class288.field4384 == class176.field2673) {
            int var295 = class424.field6232.method2318(106);
            int var296 = class424.field6232.method2345(255);
            if (class103.method650(var295, 19334)) {
                class273.method1703(5, class386.field5703, var296, 0, 100);
            }
            class288.field4384 = null;
            return true;
        } else if (class68.field885 == class288.field4384) {
            int var297 = class424.field6232.method2354(255);
            class57.field751 = class79.field1043.method1449(var297, false);
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class277.field4217) {
            class312.method1898(false, 3);
            class288.field4384 = null;
            return true;
        } else if (class60.field776 == class288.field4384) {
            int var298 = class424.field6232.method2367(15);
            int var299 = class424.field6232.method2328(-101);
            int var300 = class424.field6232.method2328(-87);
            int var301 = class424.field6232.method2335(-59);
            if (var298 >> 30 != 0) {
                int var302 = (var298 & 0x387F3359) >> 28;
                int var303 = ((var298 & 0xFFFF0BF) >> 14) - class17.field250;
                int var304 = (var298 & 0x3FFF) - class112.field1487;
                if (var303 >= 0 && var304 >= 0 && class115.field1522 > var303 && class198.field3004 > var304) {
                    int var305 = var303 * 128 + 64;
                    int var306 = var304 * 128 + 64;
                    class320 var307 = new class320(var301, 0, class26.field332, var302, var305, class437.method2686(var302, arg0 ^ 0x1, var306, var305) - var299, var306, var303, var303, var304, var304);
                    class88.field1245.method2504(42, new class80(var307));
                }
            } else if ((var298 >> 29) != 0) {
                int var308 = var298 & 0xFFFF;
                class155 var309 = class170.field2626[var308];
                if (var309 != null) {
                    if (var301 == 65535) {
                        var301 = -1;
                    }
                    boolean var310 = true;
                    if (var301 != -1 && var309.field1938 != -1) {
                        if (var309.field1938 == var301) {
                            class195 var315 = class251.method1530(var301, 121);
                            if (var315.field2949 && var315.field2950 != -1) {
                                class379 var316 = class98.method629(var315.field2950, (byte) -115);
                                int var317 = var316.field5531;
                                if (var317 == 0 || var317 == 2) {
                                    var310 = false;
                                } else if (var317 == 1) {
                                    var310 = true;
                                }
                            }
                        } else {
                            class195 var311 = class251.method1530(var301, arg0 + 82);
                            class195 var312 = class251.method1530(var309.field1938, 85);
                            if (var311.field2950 != -1 && var312.field2950 != -1) {
                                class379 var313 = class98.method629(var311.field2950, (byte) -115);
                                class379 var314 = class98.method629(var312.field2950, (byte) -115);
                                if (var313.field5536 < var314.field5536) {
                                    var310 = false;
                                }
                            }
                        }
                    }
                    if (var310) {
                        var309.field1932 = 0;
                        var309.field2005 = 1;
                        var309.field1938 = var301;
                        var309.field1992 = 0;
                        var309.field1995 = class26.field332 + var300;
                        var309.field1993 = var299;
                        if (class26.field332 < var309.field1995) {
                            var309.field1932 = -1;
                        }
                        if (var309.field1938 != -1 && class26.field332 == var309.field1995) {
                            int var318 = class251.method1530(var309.field1938, 108).field2950;
                            if (var318 != -1) {
                                class379 var319 = class98.method629(var318, (byte) -115);
                                if (var319 != null && var319.field5539 != null) {
                                    class251.method1528(false, 0, var309.field1892, var309.field1900, var319, var309.field1902, (byte) -118);
                                }
                            }
                        }
                    }
                }
            } else if (var298 >> 28 != 0) {
                int var320 = var298 & 0xFFFF;
                class169 var321;
                if (class386.field5703 == var320) {
                    var321 = class113.field1500;
                } else {
                    var321 = class140.field1883[var320];
                }
                if (var321 != null) {
                    if (var301 == 65535) {
                        var301 = -1;
                    }
                    boolean var322 = true;
                    if (var301 != -1 && var321.field1938 != -1) {
                        if (var321.field1938 == var301) {
                            class195 var323 = class251.method1530(var301, arg0 ^ 0x6B);
                            if (var323.field2949 && var323.field2950 != -1) {
                                class379 var324 = class98.method629(var323.field2950, (byte) -115);
                                int var325 = var324.field5531;
                                if (var325 == 0 || var325 == 2) {
                                    var322 = false;
                                } else if (var325 == 1) {
                                    var322 = true;
                                }
                            }
                        } else {
                            class195 var326 = class251.method1530(var301, 88);
                            class195 var327 = class251.method1530(var321.field1938, 90);
                            if (var326.field2950 != -1 && var327.field2950 != -1) {
                                class379 var328 = class98.method629(var326.field2950, (byte) -115);
                                class379 var329 = class98.method629(var327.field2950, (byte) -115);
                                if (var329.field5536 > var328.field5536) {
                                    var322 = false;
                                }
                            }
                        }
                    }
                    if (var322) {
                        var321.field1993 = var299;
                        var321.field1995 = class26.field332 + var300;
                        var321.field1938 = var301;
                        var321.field2005 = 1;
                        var321.field1992 = 0;
                        var321.field1932 = 0;
                        if (var321.field1938 == 65535) {
                            var321.field1938 = -1;
                        }
                        if (var321.field1995 > class26.field332) {
                            var321.field1932 = -1;
                        }
                        if (var321.field1938 != -1 && class26.field332 == var321.field1995) {
                            int var330 = class251.method1530(var321.field1938, arg0 + 73).field2950;
                            if (var330 != -1) {
                                class379 var331 = class98.method629(var330, (byte) -115);
                                if (var331 != null && var331.field5539 != null) {
                                    class251.method1528(class113.field1500 == var321, 0, var321.field1892, var321.field1900, var331, var321.field1902, (byte) -118);
                                }
                            }
                        }
                    }
                }
            }
            class288.field4384 = null;
            return true;
        } else if (class373.field5440 == class288.field4384) {
            int var332 = class424.field6232.method2345(255);
            int var333 = class424.field6232.method2318(arg0 - 11);
            int var334 = class424.field6232.method2328(arg0 - 127);
            int var335 = class424.field6232.method2323(-106);
            if (var335 == 65535) {
                var335 = -1;
            }
            int var336 = class424.field6232.method2318(113);
            if (var336 == 65535) {
                var336 = -1;
            }
            if (class103.method650(var333, 19334)) {
                for (int var337 = var335; var337 <= var336; var337++) {
                    long var338 = ((long) var332 << 32) + (long) var337;
                    class312 var340 = (class312) class80.field1050.method2302(var338, 23576);
                    class312 var341;
                    if (var340 != null) {
                        var341 = new class312(var340.field4689, var334);
                        var340.method625((byte) -50);
                    } else if (var337 == -1) {
                        var341 = new class312(class168.method1020(var332, (byte) 122).field2480.field4689, var334);
                    } else {
                        var341 = new class312(0, var334);
                    }
                    class80.field1050.method2301(118, var341, var338);
                }
            }
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class149.field2063) {
            int var342 = class424.field6232.method2328(arg0 - 110);
            int var343 = class424.field6232.method2328(-69);
            int var344 = class424.field6232.method2328(-118);
            if (class103.method650(var342, arg0 ^ 0x4B87)) {
                class271.method1685(arg0 ^ 0x62, 0, var343, var344);
            }
            class288.field4384 = null;
            return true;
        } else if (class52.field680 == class288.field4384) {
            int var345 = class424.field6232.method2372(true);
            int var346 = class424.field6232.method2354(255);
            int var347 = class424.field6232.method2343(255);
            String var348 = "";
            String var349 = var348;
            if ((var347 & 0x1) != 0) {
                var348 = class424.field6232.method2332(arg0 ^ 0x49);
                if ((var347 & 0x2) == 0) {
                    var349 = var348;
                } else {
                    var349 = class424.field6232.method2332(117);
                }
            }
            String var350 = class424.field6232.method2332(112);
            if (var345 == 99) {
                class141.method886(-1, var350);
            } else if (var349.equals("") || !class14.method83(var349, (byte) -94)) {
                class261.method1618(var346, var348, (byte) 108, var345, var350, var349);
            } else {
                class288.field4384 = null;
                return true;
            }
            class288.field4384 = null;
            return true;
        } else if (class372.field5432 == class288.field4384) {
            int var351 = class424.field6232.method2323(-116);
            int var352 = class424.field6232.method2343(255);
            int var353 = class424.field6232.method2343(arg0 ^ 0xFE);
            int var354 = class424.field6232.method2323(arg0 ^ 0xFFFFFFF7);
            int var355 = class424.field6232.method2343(arg0 + 254);
            int var356 = class424.field6232.method2343(255);
            if (class103.method650(var351, 19334)) {
                class150.method933(var353, var356, false, var352, var355, var354, true);
            }
            class288.field4384 = null;
            return true;
        } else if (class431.field6328 == class288.field4384) {
            int var357 = class424.field6232.method2345(arg0 ^ 0xFE);
            int var358 = class424.field6232.method2324(-93);
            int var359 = class424.field6232.method2323(-83);
            int var360 = class424.field6232.method2318(119);
            if (var360 == 65535) {
                var360 = -1;
            }
            if (class103.method650(var359, arg0 + 19333)) {
                class229.method1390(var360, 99, var357, var358);
                class167 var361 = class186.field2796.method1106(50, var360);
                class449.method2769(var361.field2373, (byte) -42, var361.field2335, var361.field2347, var357);
                class79.method516(var361.field2330, var361.field2340, (byte) -14, var361.field2398, var357);
            }
            class288.field4384 = null;
            return true;
        } else if (class50.field641 == class288.field4384) {
            int var362 = class424.field6232.method2323(-21);
            if (var362 == 65535) {
                var362 = -1;
            }
            int var363 = class424.field6232.method2328(arg0 ^ 0xFFFFFFB9);
            int var364 = class424.field6232.method2324(-87);
            if (class103.method650(var363, 19334)) {
                class273.method1703(2, var362, var364, -1, 94);
            }
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class25.field320) {
            class463.method2856(108, class189.field2830);
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class107.field1425) {
            int var365 = class424.field6232.method2343(255);
            int var366 = class424.field6232.method2335(-96);
            boolean var367 = (var365 & 0x1) == 1;
            class212.method1240(var367, var366, (byte) 67);
            class53.field719[class406.method2552(class184.field2776++, 31)] = var366;
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class282.field4306) {
            class463.method2856(98, class327.field4922);
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class127.field1624) {
            int var368 = class424.field6232.method2323(-8);
            int var369 = class424.field6232.method2335(arg0 - 19);
            int var370 = class424.field6232.method2318(-85);
            int var371 = class424.field6232.method2345(arg0 ^ 0xFE);
            int var372 = class424.field6232.method2335(arg0 ^ 0xFFFFFF95);
            if (class103.method650(var369, 19334)) {
                class273.method1703(7, var372 << 16 | var368, var371, var370, arg0 + 89);
            }
            class288.field4384 = null;
            return true;
        } else if (class442.field6497 == class288.field4384) {
            class463.method2856(arg0 + 76, class180.field2712);
            class288.field4384 = null;
            return true;
        } else if (class312.field4699 == class288.field4384) {
            if (class90.field1277 != null) {
                class446.method2757(-1, class376.field5479, -1, -4, false);
            }
            byte[] var373 = new byte[class44.field547];
            class424.field6232.method715(0, var373, class44.field547, -30200);
            String var374 = class380.method2292(-1, var373, class44.field547, 0);
            class315.method1923(true, true, class79.field1043, var374, class405.field6032 == 1);
            class288.field4384 = null;
            return true;
        } else if (class383.field5588 == class288.field4384) {
            class155.field2161 = class424.field6232.method2343(arg0 ^ 0xFE);
            class72.field958 = class172.field2639;
            class288.field4384 = null;
            return true;
        } else if (class427.field6283 == class288.field4384) {
            int var375 = class424.field6232.method2354(255);
            int var376 = class424.field6232.method2335(121);
            int var377 = class424.field6232.method2328(-65);
            if (class103.method650(var377, 19334)) {
                class449.method2764(var376, var375, true);
            }
            class288.field4384 = null;
            return true;
        } else if (class288.field4384 == class198.field2987) {
            class463.method2856(arg0 ^ 0x54, class282.field4312);
            class288.field4384 = null;
            return true;
        } else if (class55.field739 == class288.field4384) {
            if (class6.field69 != -1) {
                class250.method1526((byte) -63, 0, class6.field69);
            }
            class288.field4384 = null;
            return true;
        } else {
            class288.method1783("T1 - " + (class288.field4384 == null ? -1 : class288.field4384.method2803(true)) + "," + (class261.field3980 == null ? -1 : class261.field3980.method2803(true)) + "," + (class299.field4532 == null ? -1 : class299.field4532.method2803(true)) + " - " + class44.field547, (Throwable) null, 126);
            class77.method504((byte) 95);
            return true;
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)V")
    public static void method2762(byte arg0) {
        field6585 = null;
        field6591 = null;
        int var1 = -118 % ((56 - arg0) / 55);
        field6589 = null;
    }
}
