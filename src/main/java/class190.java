import java.awt.Canvas;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class190 {

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public int field3475;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public int field3474;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public int field3470;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public int field3472;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "Lcf;")
    public static class93 field3479 = class147.method1066("<br>(X100(U(Y", -48);

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "Loe;")
    public static class143 field3478 = new class143();

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "Lcf;")
    public static class93 field3482 = class147.method1066("<br>", -48);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "Lld;")
    public static class79 field3480;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field3481;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public static void method1366(int arg0) {
        field3478 = null;
        field3481 = null;
        if (arg0 == 1) {
            field3480 = null;
            field3482 = null;
            field3479 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V")
    public static final void method1367(boolean arg0) {
        int var1 = class137.field2394;
        if (arg0) {
            field3478 = null;
        }
        int var2 = class147.field2584;
        field3476++;
        int var3 = class61.field1040;
        int var4 = class266.field4739;
        if (class101.field1755 == null || class34.field530 == null) {
            if (class246.field4436.method1280(class93.field1665, (byte) -111) && class246.field4436.method1280(class250.field4498, (byte) -39)) {
                class101.field1755 = class278.method1862(class246.field4436, class93.field1665, 0, 8);
                class34.field530 = class278.method1862(class246.field4436, class250.field4498, 0, 8);
            } else {
                class75.method510(var1, var2, var3, 20, class18.field237, 256 - class44.field697);
            }
        }
        if (class101.field1755 != null && class34.field530 != null) {
            int var5 = var3 / class101.field1755.field2135;
            for (int var6 = 0; var6 < var5; var6++) {
                class101.field1755.method560(var1 + (class101.field1755.field2135 * var6), var2);
            }
            class34.field530.method560(var1, var2);
            class34.field530.method570(var1 + var3 - class34.field530.field2135, var2);
        }
        class183.field3383.method1832(class11.field154, var1 + 3, var2 - -14, class264.field4719, -1);
        class75.method510(var1, var2 + 20, var3, var4 - 20, class18.field237, 256 - class44.field697);
        int var7 = class157.field2793;
        int var8 = class227.field4056;
        for (int var9 = 0; var9 < class253.field4549; var9++) {
            int var17 = (class253.field4549 - var9 - 1) * 15 + var2 + 35;
            if (var1 < var8 && (var1 + var3) > var8 && var7 > (var17 - 13) && var17 + 3 > var7) {
                class75.method510(var1, var17 - 13, var3, 16, class240.field4293, 256 - class104.field1799);
            }
        }
        if ((class234.field4179 == null || class186.field3437 == null || class276.field4950 == null) && class246.field4436.method1280(class16.field216, (byte) -91) && class246.field4436.method1280(class193.field3534, (byte) -104) && class246.field4436.method1280(class224.field4040, (byte) -46)) {
            class234.field4179 = class278.method1862(class246.field4436, class16.field216, 0, 8);
            class186.field3437 = class278.method1862(class246.field4436, class193.field3534, 0, 8);
            class276.field4950 = class278.method1862(class246.field4436, class224.field4040, 0, 8);
        }
        if (class234.field4179 != null && class186.field3437 != null && class276.field4950 != null) {
            int var10 = var3 / class234.field4179.field2135;
            for (int var11 = 0; var11 < var10; var11++) {
                class234.field4179.method560(class234.field4179.field2135 * var11 + var1, var2 + var4 + -class234.field4179.field2127);
            }
            int var12 = (var4 - 20) / class186.field3437.field2127;
            for (int var13 = 0; var13 < var12; var13++) {
                class186.field3437.method560(var1, class186.field3437.field2127 * var13 + var2 + 20);
                class186.field3437.method570(var1 + var3 - class186.field3437.field2135, class186.field3437.field2127 * var13 + var2 + 20);
            }
            class276.field4950.method560(var1, var2 + var4 - class276.field4950.field2127);
            class276.field4950.method570(var1 - (class276.field4950.field2135 - var3), var2 - class276.field4950.field2127 + var4);
        }
        for (int var14 = 0; var14 < class253.field4549; var14++) {
            int var15 = (class253.field4549 - var14 - 1) * 15 + var2 + 35;
            int var16 = class264.field4719;
            if (var1 < var8 && (var1 + var3) > var8 && var15 - 13 < var7 && var7 < (var15 + 3)) {
                var16 = class224.field4041;
            }
            class183.field3383.method1832(class3.method12(var14, -83), var1 + 3, var15, var16, 0);
        }
        class165.method1201(class147.field2584, class266.field4739, (byte) 68, class61.field1040, class137.field2394);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)Lcf;")
    public static final class93 method1368(int arg0, int arg1) {
        if (arg1 != -926) {
            method1371((byte) 37);
        }
        field3471++;
        if (arg0 < 100000) {
            return class130.method949((byte) -77, new class93[] { class141.field2459, class148.method1067(-7015, arg0), class170.field2984 });
        } else if (arg0 < 10000000) {
            return class130.method949((byte) -77, new class93[] { class110.field1872, class148.method1067(-7015, arg0 / 1000), class177.field3103, class170.field2984 });
        } else {
            return class130.method949((byte) -77, new class93[] { class76.field1419, class148.method1067(-7015, arg0 / 1000000), class156.field2767, class170.field2984 });
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)Z")
    public static final boolean method1369(int arg0) throws IOException {
        field3469++;
        if (class92.field1625 == null) {
            return false;
        }
        int var1 = class92.field1625.method950(false);
        if (var1 == 0) {
            return false;
        }
        if (~class111.field1888 == arg0) {
            class92.field1625.method946(class250.field4504.field5011, 1, 0, 1);
            var1--;
            class250.field4504.field5027 = 0;
            class111.field1888 = class250.field4504.method1572(255);
            class72.field1300 = class95.field1709[class111.field1888];
        }
        if (class72.field1300 == -1) {
            if (var1 <= 0) {
                return false;
            }
            var1--;
            class92.field1625.method946(class250.field4504.field5011, 1, 0, arg0 ^ 0x1);
            class72.field1300 = class250.field4504.field5011[0] & 0xFF;
        }
        if (class72.field1300 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class92.field1625.method946(class250.field4504.field5011, 2, 0, 1);
            var1 -= 2;
            class250.field4504.field5027 = 0;
            class72.field1300 = class250.field4504.method1891(-113);
        }
        if (class72.field1300 > var1) {
            return false;
        }
        class250.field4504.field5027 = 0;
        class92.field1625.method946(class250.field4504.field5011, class72.field1300, 0, arg0 + 1);
        class31.field492 = 0;
        class256.field4627 = class238.field4265;
        class238.field4265 = class237.field4250;
        class237.field4250 = class111.field1888;
        if (class111.field1888 == 90) {
            long var2 = class250.field4504.method1873((byte) 6);
            class250.field4504.method1925(true);
            long var4 = class250.field4504.method1873((byte) 6);
            long var6 = (long) class250.field4504.method1891(arg0 ^ 0xFFFFFF8A);
            long var8 = (long) class250.field4504.method1893((byte) 90);
            int var10 = class250.field4504.method1907(16832);
            int var11 = class250.field4504.method1891(-127);
            long var12 = (var6 << 32) + var8;
            boolean var14 = false;
            int var15 = 0;
            label1158: while (true) {
                if (var15 >= 100) {
                    if (var10 <= 1) {
                        for (int var16 = 0; var16 < class284.field5098; var16++) {
                            if (class223.field4025[var16] == var2) {
                                var14 = true;
                                break label1158;
                            }
                        }
                    }
                    break;
                }
                if (class3.field34[var15] == var12) {
                    var14 = true;
                    break;
                }
                var15++;
            }
            if (!var14 && class120.field2126 == 0) {
                class3.field34[class42.field661] = var12;
                class42.field661 = (class42.field661 + 1) % 100;
                class93 var17 = class127.method928(var11, (byte) 18).method413(5383, class250.field4504);
                if (var10 == 2 || var10 == 3) {
                    class260.method1753(class205.method1454((byte) 58, var4).method687(-96), var17, class130.method949((byte) -77, new class93[] { class30.field451, class205.method1454((byte) 63, var2).method687(-96) }), var11, -4252, 20);
                } else if (var10 == 1) {
                    class260.method1753(class205.method1454((byte) 76, var4).method687(arg0 - 96), var17, class130.method949((byte) -77, new class93[] { class288.field5150, class205.method1454((byte) -105, var2).method687(arg0 - 96) }), var11, -4252, 20);
                } else {
                    class260.method1753(class205.method1454((byte) 112, var4).method687(-96), var17, class205.method1454((byte) -99, var2).method687(arg0 - 96), var11, -4252, 20);
                }
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 68) {
            if (class69.field1262 != -1) {
                class61.method383(class69.field1262, 73, 0);
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 7 || class111.field1888 == 175 || class111.field1888 == 10 || class111.field1888 == 171 || class111.field1888 == 71 || class111.field1888 == 13 || class111.field1888 == 53 || class111.field1888 == 28 || class111.field1888 == 134 || class111.field1888 == 251 || class111.field1888 == 148 || class111.field1888 == 80 || class111.field1888 == 147) {
            class240.method1638((byte) 108);
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 238) {
            int var18 = class250.field4504.method1907(arg0 ^ 0x41C0);
            int var19 = var18 >> 6;
            class174 var20 = new class174();
            var20.field3028 = var18 & 0x3F;
            var20.field3025 = class250.field4504.method1907(16832);
            if (var20.field3025 >= 0 && var20.field3025 < class264.field4700.length) {
                if (var20.field3028 == 1 || var20.field3028 == 10) {
                    var20.field3022 = class250.field4504.method1891(-116);
                    class250.field4504.field5027 += 3;
                } else if (var20.field3028 >= 2 && var20.field3028 <= 6) {
                    if (var20.field3028 == 2) {
                        var20.field3035 = 64;
                        var20.field3031 = 64;
                    }
                    if (var20.field3028 == 3) {
                        var20.field3035 = 0;
                        var20.field3031 = 64;
                    }
                    if (var20.field3028 == 4) {
                        var20.field3035 = 128;
                        var20.field3031 = 64;
                    }
                    if (var20.field3028 == 5) {
                        var20.field3035 = 64;
                        var20.field3031 = 0;
                    }
                    if (var20.field3028 == 6) {
                        var20.field3031 = 128;
                        var20.field3035 = 64;
                    }
                    var20.field3028 = 2;
                    var20.field3038 = class250.field4504.method1891(-128);
                    var20.field3026 = class250.field4504.method1891(-120);
                    var20.field3032 = class250.field4504.method1907(arg0 + 16832);
                }
                var20.field3023 = class250.field4504.method1891(-128);
                if (var20.field3023 == 65535) {
                    var20.field3023 = -1;
                }
                class44.field707[var19] = var20;
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 135) {
            class69.field1257 = class250.field4504.method1907(16832);
            class111.field1888 = -1;
            class9.field128 = class193.field3542;
            return true;
        } else if (class111.field1888 == 197) {
            int var21 = class250.field4504.method1891(-128);
            int var22 = class250.field4504.method1879(1483502360);
            int var23 = class250.field4504.method1891(-114);
            if (class113.method811(11077, var23)) {
                if (var22 == 2) {
                    class143.method1039((byte) -50);
                }
                class69.field1262 = var21;
                class280.method1931(var21, -104);
                class171.method1229(false, arg0 + 73);
                class228.method1567(class69.field1262, false);
                for (int var24 = 0; var24 < 100; var24++) {
                    class25.field314[var24] = true;
                }
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 226) {
            class16.method76(arg0 - 94);
            class89.field1592 = class250.field4504.method1907(16832);
            class167.field2951 = class193.field3542;
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 63) {
            int var25 = class250.field4504.method1891(-117);
            int var26 = class250.field4504.method1907(arg0 ^ 0x41C0);
            int var27 = class250.field4504.method1907(arg0 ^ 0x41C0);
            int var28 = class250.field4504.method1891(arg0 - 114);
            int var29 = class250.field4504.method1907(16832);
            int var30 = class250.field4504.method1907(16832);
            if (class113.method811(arg0 ^ 0x2B45, var25)) {
                class135.method987(var26, var27, var28, var30, var29, arg0 - 113);
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 209) {
            class136.method996(class250.field4504.method1889((byte) -67), (byte) -122);
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 49) {
            class152.field2673 = class250.field4504.method1895(117);
            class39.field609 = class250.field4504.method1879(1483502360);
            for (int var31 = class39.field609; var31 < (class39.field609 + 8); var31++) {
                for (int var33 = class152.field2673; var33 < (class152.field2673 + 8); var33++) {
                    if (class109.field1858[class138.field2405][var31][var33] != null) {
                        class109.field1858[class138.field2405][var31][var33] = null;
                        class50.method279(var31, var33, arg0 ^ 0xFFFF91B6);
                    }
                }
            }
            for (class53 var32 = (class53) class284.field5093.method1151(125); var32 != null; var32 = (class53) class284.field5093.method1159(25)) {
                if (var32.field883 >= class39.field609 && var32.field883 < class39.field609 + 8 && var32.field879 >= class152.field2673 && var32.field879 < class152.field2673 + 8 && class138.field2405 == var32.field871) {
                    var32.field863 = 0;
                }
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 84) {
            int var34 = class250.field4504.method1926(-2097152);
            int var35 = class250.field4504.method1891(-115);
            if (var35 == 65535) {
                var35 = -1;
            }
            int var36 = class250.field4504.method1890(false);
            if (class113.method811(11077, var36)) {
                class256.method1735(var34, -1, arg0 + 3, var35, 1);
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 190) {
            int var37 = class250.field4504.method1891(-114);
            class93 var38 = class250.field4504.method1889((byte) -67);
            Object[] var39 = new Object[var38.method666(false) + 1];
            for (int var40 = var38.method666(false) - 1; var40 >= 0; var40--) {
                if (var38.method645(arg0 ^ 0xFF, var40) == 115) {
                    var39[var40 + 1] = class250.field4504.method1889((byte) -67);
                } else {
                    var39[var40 + 1] = Integer.valueOf(class250.field4504.method1872(97));
                }
            }
            var39[0] = Integer.valueOf(class250.field4504.method1872(105));
            if (class113.method811(arg0 + 11077, var37)) {
                class223 var41 = new class223();
                var41.field4015 = var39;
                class106.method763(var41, (byte) -72);
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 36) {
            class121.method895(88);
            class111.field1888 = -1;
            return false;
        } else if (class111.field1888 == 55) {
            int var42 = class250.field4504.method1909((byte) 31);
            class93 var43 = class250.field4504.method1889((byte) -67);
            int var44 = class250.field4504.method1891(-125);
            if (class113.method811(arg0 + 11077, var42)) {
                class126.method925(var44, (byte) -41, var43);
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 61) {
            byte var45 = class250.field4504.method1925(true);
            int var46 = class250.field4504.method1890(false);
            class130.method953(arg0 + 1, var46, var45);
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 52) {
            class195.field3565 = class250.field4504.method1907(16832);
            class168.field2955 = class250.field4504.method1907(16832);
            class250.field4506 = class250.field4504.method1907(arg0 ^ 0x41C0);
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 17) {
            long var47 = class250.field4504.method1873((byte) 6);
            class93 var49 = class274.method1815(class52.method285(32767, class250.field4504).method672(958045282));
            class263.method1764(6, (byte) -116, class205.method1454((byte) 104, var47).method687(arg0 ^ 0xFFFFFFA0), var49);
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 114) {
            int var50 = class250.field4504.method1872(98);
            int var51 = class250.field4504.method1876((byte) -82);
            int var52 = class250.field4504.method1891(-128);
            int var53 = class250.field4504.method1909((byte) 64);
            if (class113.method811(arg0 ^ 0x2B45, var53)) {
                class214 var54 = (class214) class255.field4610.method135((long) var50, true);
                if (var54 != null) {
                    class66.method454(1, var54, var54.field3912 != var52);
                }
                class174.method1244(var51, arg0 + 22, var50, var52);
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 47) {
            int var55 = class250.field4504.method1890(false);
            int var56 = class250.field4504.method1891(-115);
            int var57 = class250.field4504.method1909((byte) 12);
            int var58 = class250.field4504.method1891(arg0 - 127);
            int var59 = class250.field4504.method1926(-2097152);
            if (class113.method811(11077, var56)) {
                class256.method1735(var59, var58, 122, var57 | var55 << 16, 7);
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 224) {
            long var60 = class250.field4504.method1873((byte) 6);
            long var62 = (long) class250.field4504.method1891(-126);
            long var64 = (long) class250.field4504.method1893((byte) -117);
            long var66 = (var62 << 32) + var64;
            int var68 = class250.field4504.method1907(16832);
            boolean var69 = false;
            int var70 = class250.field4504.method1891(-124);
            int var71 = 0;
            label1197: while (true) {
                if (var71 >= 100) {
                    if (var68 <= 1) {
                        for (int var72 = 0; var72 < class284.field5098; var72++) {
                            if (class223.field4025[var72] == var60) {
                                var69 = true;
                                break label1197;
                            }
                        }
                    }
                    break;
                }
                if (class3.field34[var71] == var66) {
                    var69 = true;
                    break;
                }
                var71++;
            }
            if (!var69 && class120.field2126 == 0) {
                class3.field34[class42.field661] = var66;
                class42.field661 = (class42.field661 + 1) % 100;
                class93 var73 = class127.method928(var70, (byte) 18).method413(5383, class250.field4504);
                if (var68 == 2) {
                    class260.method1753((class93) null, var73, class130.method949((byte) -77, new class93[] { class30.field451, class205.method1454((byte) 49, var60).method687(arg0 - 96) }), var70, -4252, 18);
                } else if (var68 == 1) {
                    class260.method1753((class93) null, var73, class130.method949((byte) -77, new class93[] { class288.field5150, class205.method1454((byte) -116, var60).method687(-96) }), var70, -4252, 18);
                } else {
                    class260.method1753((class93) null, var73, class205.method1454((byte) 0, var60).method687(-96), var70, arg0 - 4252, 18);
                }
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 88) {
            long var74 = class250.field4504.method1873((byte) 6);
            int var76 = class250.field4504.method1891(-119);
            byte var77 = class250.field4504.method1925(true);
            boolean var78 = false;
            if ((var74 & Long.MIN_VALUE) != 0L) {
                var78 = true;
            }
            if (var78) {
                if (class161.field2834 == 0) {
                    class111.field1888 = -1;
                    return true;
                }
                boolean var84 = false;
                long var85 = var74 & Long.MAX_VALUE;
                int var87;
                for (var87 = 0; var87 < class161.field2834 && (class97.field1733[var87].field4006 != var85 || class97.field1733[var87].field1222 != var76); var87++) {
                }
                if (var87 < class161.field2834) {
                    while (class161.field2834 - 1 > var87) {
                        class97.field1733[var87] = class97.field1733[var87 + 1];
                        var87++;
                    }
                    class161.field2834--;
                    class97.field1733[class161.field2834] = null;
                }
            } else {
                class93 var79 = class250.field4504.method1889((byte) -67);
                class67 var80 = new class67();
                var80.field4006 = var74;
                var80.field1223 = class205.method1454((byte) -114, var80.field4006);
                var80.field1226 = var79;
                var80.field1222 = var76;
                var80.field1225 = var77;
                int var81;
                for (var81 = class161.field2834 - 1; var81 >= 0; var81--) {
                    int var82 = class97.field1733[var81].field1223.method661(var80.field1223, -1);
                    if (var82 == 0) {
                        class97.field1733[var81].field1222 = var76;
                        class97.field1733[var81].field1225 = var77;
                        class97.field1733[var81].field1226 = var79;
                        class253.field4561 = class193.field3542;
                        class111.field1888 = -1;
                        if (class167.field2946 == var74) {
                            class249.field4491 = var77;
                        }
                        return true;
                    }
                    if (var82 < 0) {
                        break;
                    }
                }
                if (class161.field2834 >= class97.field1733.length) {
                    class111.field1888 = -1;
                    return true;
                }
                for (int var83 = class161.field2834 - 1; var83 > var81; var83--) {
                    class97.field1733[var83 + 1] = class97.field1733[var83];
                }
                if (class161.field2834 == 0) {
                    class97.field1733 = new class67[100];
                }
                class97.field1733[var81 + 1] = var80;
                if (class167.field2946 == var74) {
                    class249.field4491 = var77;
                }
                class161.field2834++;
            }
            class253.field4561 = class193.field3542;
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 188) {
            int var88 = class250.field4504.method1917((byte) -126);
            int var89 = class250.field4504.method1877((byte) -26);
            int var90 = class250.field4504.method1891(arg0 ^ 0xFFFFFF86);
            if (class113.method811(11077, var90)) {
                class32.method190(var89, var88, 12);
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 145) {
            int var91 = class250.field4504.method1891(-128);
            int var92 = class250.field4504.method1877((byte) -26);
            int var93 = class250.field4504.method1907(16832);
            if (class113.method811(11077, var91)) {
                class24.method125(var92, 1, var93);
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 213) {
            class246.method1677((byte) 111);
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 67) {
            int var94 = class250.field4504.method1872(arg0 ^ 0x62);
            int var95 = class250.field4504.method1891(-114);
            if (var94 < -70000) {
                var95 += 32768;
            }
            class181 var96;
            if (var94 < 0) {
                var96 = null;
            } else {
                var96 = client.method1114(arg0 - 20985, var94);
            }
            if (var96 != null) {
                for (int var97 = 0; var97 < var96.field3301.length; var97++) {
                    var96.field3301[var97] = 0;
                    var96.field3304[var97] = 0;
                }
            }
            class248.method1687(111, var95);
            int var98 = class250.field4504.method1891(-111);
            for (int var99 = 0; var99 < var98; var99++) {
                int var100 = class250.field4504.method1876((byte) -82);
                if (var100 == 255) {
                    var100 = class250.field4504.method1871(-121);
                }
                int var101 = class250.field4504.method1877((byte) -26);
                if (var96 != null && var99 < var96.field3301.length) {
                    var96.field3301[var99] = var101;
                    var96.field3304[var99] = var100;
                }
                class177.method1290(0, var95, var100, var99, var101 - 1);
            }
            if (var96 != null) {
                class254.method1731(var96, (byte) -79);
            }
            class16.method76(-115);
            class9.field131[class58.method333(class54.field905++, 31)] = class58.method333(var95, 32767);
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 108) {
            class241.method1648(3, class250.field4504);
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 225) {
            class253.field4561 = class193.field3542;
            long var102 = class250.field4504.method1873((byte) 6);
            if (var102 == 0L) {
                class6.field84 = null;
                class161.field2834 = 0;
                class111.field1888 = -1;
                class97.field1733 = null;
                class257.field4634 = null;
                return true;
            }
            long var104 = class250.field4504.method1873((byte) 6);
            class257.field4634 = class205.method1454((byte) -109, var104);
            class6.field84 = class205.method1454((byte) 22, var102);
            class205.field3692 = class250.field4504.method1925(true);
            int var106 = class250.field4504.method1907(16832);
            if (var106 == 255) {
                class111.field1888 = -1;
                return true;
            }
            class67[] var107 = new class67[100];
            class161.field2834 = var106;
            for (int var108 = 0; var108 < class161.field2834; var108++) {
                var107[var108] = new class67();
                var107[var108].field4006 = class250.field4504.method1873((byte) 6);
                var107[var108].field1223 = class205.method1454((byte) -105, var107[var108].field4006);
                var107[var108].field1222 = class250.field4504.method1891(-127);
                var107[var108].field1225 = class250.field4504.method1925(true);
                var107[var108].field1226 = class250.field4504.method1889((byte) -67);
                if (class167.field2946 == var107[var108].field4006) {
                    class249.field4491 = var107[var108].field1225;
                }
            }
            boolean var109 = false;
            int var110 = class161.field2834;
            while (var110 > 0) {
                var110--;
                boolean var111 = true;
                for (int var112 = 0; var112 < var110; var112++) {
                    if (var107[var112].field1223.method661(var107[var112 + 1].field1223, -1) > 0) {
                        class67 var113 = var107[var112];
                        var111 = false;
                        var107[var112] = var107[var112 + 1];
                        var107[var112 + 1] = var113;
                    }
                }
                if (var111) {
                    break;
                }
            }
            class97.field1733 = var107;
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 50) {
            if (class72.field1300 == 0) {
                class61.field1032 = class101.field1756;
            } else {
                class61.field1032 = class250.field4504.method1889((byte) -67);
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 210) {
            long var114 = class250.field4504.method1873((byte) 6);
            int var116 = class250.field4504.method1891(-127);
            boolean var117 = true;
            if (var114 < 0L) {
                var114 &= Long.MAX_VALUE;
                var117 = false;
            }
            int var118 = class250.field4504.method1907(16832);
            class93 var119 = class178.field3144;
            if (var116 > 0) {
                var119 = class250.field4504.method1889((byte) -67);
            }
            class93 var120 = class205.method1454((byte) 49, var114).method687(arg0 ^ 0xFFFFFFA0);
            for (int var121 = 0; var121 < class145.field2567; var121++) {
                if (class284.field5095[var121] == var114) {
                    if (class220.field3999[var121] != var116) {
                        class220.field3999[var121] = var116;
                        if (var116 > 0) {
                            class263.method1764(5, (byte) -116, class178.field3144, class130.method949((byte) -77, new class93[] { var120, class257.field4633 }));
                        }
                        if (var116 == 0) {
                            class263.method1764(5, (byte) -116, class178.field3144, class130.method949((byte) -77, new class93[] { var120, class111.field1895 }));
                        }
                    }
                    class210.field3825[var121] = var119;
                    class24.field296[var121] = var118;
                    var120 = null;
                    class267.field4745[var121] = var117;
                    break;
                }
            }
            if (var120 != null && class145.field2567 < 200) {
                class284.field5095[class145.field2567] = var114;
                class171.field3004[class145.field2567] = var120;
                class220.field3999[class145.field2567] = var116;
                class210.field3825[class145.field2567] = var119;
                class24.field296[class145.field2567] = var118;
                class267.field4745[class145.field2567] = var117;
                class145.field2567++;
            }
            boolean var122 = false;
            int var123 = class145.field2567;
            class9.field128 = class193.field3542;
            while (var123 > 0) {
                boolean var124 = true;
                var123--;
                for (int var125 = 0; var125 < var123; var125++) {
                    if (class220.field3999[var125] != class74.field1352 && class220.field3999[var125 + 1] == class74.field1352 || class220.field3999[var125] == 0 && class220.field3999[var125 + 1] != 0) {
                        var124 = false;
                        int var126 = class220.field3999[var125];
                        class220.field3999[var125] = class220.field3999[var125 + 1];
                        class220.field3999[var125 + 1] = var126;
                        class93 var127 = class210.field3825[var125];
                        class210.field3825[var125] = class210.field3825[var125 + 1];
                        class210.field3825[var125 + 1] = var127;
                        class93 var128 = class171.field3004[var125];
                        class171.field3004[var125] = class171.field3004[var125 + 1];
                        class171.field3004[var125 + 1] = var128;
                        long var129 = class284.field5095[var125];
                        class284.field5095[var125] = class284.field5095[var125 + 1];
                        class284.field5095[var125 + 1] = var129;
                        int var131 = class24.field296[var125];
                        class24.field296[var125] = class24.field296[var125 + 1];
                        class24.field296[var125 + 1] = var131;
                        boolean var132 = class267.field4745[var125];
                        class267.field4745[var125] = class267.field4745[var125 + 1];
                        class267.field4745[var125 + 1] = var132;
                    }
                }
                if (var124) {
                    break;
                }
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 100) {
            class39.field609 = class250.field4504.method1895(arg0 + 114);
            class152.field2673 = class250.field4504.method1907(16832);
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 66) {
            int var133 = class250.field4504.method1891(-121);
            int var134 = class250.field4504.method1907(16832);
            int var135 = class250.field4504.method1907(16832);
            int var136 = class250.field4504.method1891(-123);
            int var137 = class250.field4504.method1907(16832);
            int var138 = class250.field4504.method1907(16832);
            if (class113.method811(11077, var133)) {
                class146.method1061(var136, true, var137, var135, var138, var134, true);
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 98) {
            int var139 = class250.field4504.method1926(-2097152);
            class181 var140 = client.method1114(-20985, var139);
            for (int var141 = 0; var141 < var140.field3301.length; var141++) {
                var140.field3301[var141] = -1;
                var140.field3301[var141] = 0;
            }
            class254.method1731(var140, (byte) -118);
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 196) {
            class31.method180(true, -21895);
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 45) {
            int var142 = class250.field4504.method1890(false);
            int var143 = class250.field4504.method1917((byte) 79);
            int var144 = class250.field4504.method1877((byte) -26);
            int var145 = class250.field4504.method1890(false);
            if (var143 >> 30 != 0) {
                int var146 = var143 >> 28 & 0x3;
                int var147 = (var143 & 0x3FFF) - class4.field52;
                int var148 = ((var143 & 0xFFFCA76) >> 14) - class229.field4111;
                if (var148 >= 0 && var147 >= 0 && var148 < 104 && var147 < 104) {
                    int var149 = var148 * 128 + 64;
                    int var150 = var147 * 128 + 64;
                    class185 var151 = new class185(var142, var146, var149, var150, class13.method56(var150, var149, (byte) 55, var146) - var145, var144, class275.field4921);
                    class11.field152.method1152((byte) -5, new class35(var151));
                }
            } else if (var143 >> 29 != 0) {
                int var157 = var143 & 0xFFFF;
                class227 var158 = class155.field2709[var157];
                if (var158 != null) {
                    if (var142 == 65535) {
                        var142 = -1;
                    }
                    boolean var159 = true;
                    if (var142 != -1 && var158.field3846 != -1 && class131.method964(class188.method1359(var142, -113).field2352, true).field475 < class131.method964(class188.method1359(var158.field3846, -56).field2352, true).field475) {
                        var159 = false;
                    }
                    if (var159) {
                        var158.field3847 = 0;
                        var158.field3846 = var142;
                        var158.field3798 = 0;
                        var158.field3829 = 1;
                        var158.field3802 = class275.field4921 + var144;
                        if (class275.field4921 < var158.field3802) {
                            var158.field3847 = -1;
                        }
                        var158.field3844 = var145;
                        if (var158.field3846 != -1 && class275.field4921 == var158.field3802) {
                            int var160 = class188.method1359(var158.field3846, -66).field2352;
                            if (var160 != -1) {
                                class31 var161 = class131.method964(var160, true);
                                if (var161 != null && var161.field479 != null) {
                                    class55.method309(var158.field3784, 0, var161, var158.field3868, -17474, false);
                                }
                            }
                        }
                    }
                }
            } else if ((var143 >> 28) != 0) {
                int var152 = var143 & 0xFFFF;
                class237 var153;
                if (class141.field2446 == var152) {
                    var153 = class166.field2927;
                } else {
                    var153 = class224.field4031[var152];
                }
                if (var153 != null) {
                    if (var142 == 65535) {
                        var142 = -1;
                    }
                    boolean var154 = true;
                    if (var142 != -1 && var153.field3846 != -1 && class131.method964(class188.method1359(var142, arg0 - 103).field2352, true).field475 < class131.method964(class188.method1359(var153.field3846, -45).field2352, true).field475) {
                        var154 = false;
                    }
                    if (var154) {
                        var153.field3844 = var145;
                        var153.field3798 = 0;
                        var153.field3802 = class275.field4921 + var144;
                        var153.field3829 = 1;
                        var153.field3847 = 0;
                        if (var153.field3802 > class275.field4921) {
                            var153.field3847 = -1;
                        }
                        var153.field3846 = var142;
                        if (var153.field3846 == 65535) {
                            var153.field3846 = -1;
                        }
                        if (var153.field3846 != -1 && class275.field4921 == var153.field3802) {
                            int var155 = class188.method1359(var153.field3846, arg0 - 92).field2352;
                            if (var155 != -1) {
                                class31 var156 = class131.method964(var155, true);
                                if (var156 != null && var156.field479 != null) {
                                    class55.method309(var153.field3784, 0, var156, var153.field3868, -17474, class166.field2927 == var153);
                                }
                            }
                        }
                    }
                }
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 211) {
            int var162 = class250.field4504.method1917((byte) 15);
            int var163 = class250.field4504.method1891(-124);
            int var164 = class250.field4504.method1923(1699318408);
            if (class113.method811(11077, var163)) {
                class207.method1462((byte) 65, var162, var164);
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 192) {
            int var165 = class250.field4504.method1909((byte) 84);
            int var166 = class250.field4504.method1926(arg0 ^ 0xFFE00000);
            if (var165 == 65535) {
                var165 = -1;
            }
            int var167 = class250.field4504.method1909((byte) 24);
            int var168 = class250.field4504.method1890(false);
            if (var168 == 65535) {
                var168 = -1;
            }
            int var169 = class250.field4504.method1872(126);
            if (class113.method811(11077, var167)) {
                for (int var170 = var168; var170 <= var165; var170++) {
                    long var171 = ((long) var166 << 32) + (long) var170;
                    class200 var173 = (class200) class140.field2439.method135(var171, true);
                    class200 var174;
                    if (var173 != null) {
                        var174 = new class200(var169, var173.field3626);
                        var173.method1544((byte) -95);
                    } else if (var170 == -1) {
                        var174 = new class200(var169, client.method1114(-20985, var166).field3349.field3626);
                    } else {
                        var174 = new class200(var169, -1);
                    }
                    class140.field2439.method137(var171, var174, -1);
                }
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 217) {
            long var175 = class250.field4504.method1873((byte) 6);
            boolean var177 = false;
            long var178 = (long) class250.field4504.method1891(arg0 - 123);
            long var180 = (long) class250.field4504.method1893((byte) -115);
            int var182 = class250.field4504.method1907(arg0 + 16832);
            long var183 = (var178 << 32) + var180;
            int var185 = 0;
            label1342: while (true) {
                if (var185 >= 100) {
                    if (var182 <= 1) {
                        if ((!class3.field36 || class67.field1224) && !class19.field259) {
                            for (int var186 = 0; var186 < class284.field5098; var186++) {
                                if (class223.field4025[var186] == var175) {
                                    var177 = true;
                                    break label1342;
                                }
                            }
                        } else {
                            var177 = true;
                        }
                    }
                    break;
                }
                if (class3.field34[var185] == var183) {
                    var177 = true;
                    break;
                }
                var185++;
            }
            if (!var177 && class120.field2126 == 0) {
                class3.field34[class42.field661] = var183;
                class42.field661 = (class42.field661 + 1) % 100;
                class93 var187 = class274.method1815(class52.method285(arg0 ^ 0x7FFF, class250.field4504).method672(arg0 + 958045282));
                if (var182 == 2 || var182 == 3) {
                    class263.method1764(7, (byte) -116, class130.method949((byte) -77, new class93[] { class30.field451, class205.method1454((byte) 117, var175).method687(-96) }), var187);
                } else if (var182 == 1) {
                    class263.method1764(7, (byte) -116, class130.method949((byte) -77, new class93[] { class288.field5150, class205.method1454((byte) -109, var175).method687(-96) }), var187);
                } else {
                    class263.method1764(3, (byte) -116, class205.method1454((byte) 69, var175).method687(arg0 ^ 0xFFFFFFA0), var187);
                }
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 109) {
            int var188 = class250.field4504.method1871(-123);
            int var189 = var188 >> 28 & 0x3;
            int var190 = var188 & 0x3FFF;
            int var191 = (var188 & 0xFFFC6F5) >> 14;
            int var192 = class250.field4504.method1907(16832);
            int var193 = var192 >> 2;
            int var194 = var192 & 0x3;
            int var195 = class80.field1490[var193];
            int var196 = class250.field4504.method1909((byte) 69);
            int var197 = var190 - class4.field52;
            int var198 = var191 - class229.field4111;
            if (var196 == 65535) {
                var196 = -1;
            }
            class229.method1575(var198, var193, var197, var196, var195, var189, 7, var194);
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 138) {
            byte[] var199 = new byte[class72.field1300];
            class250.field4504.method1573((byte) 49, var199, class72.field1300, 0);
            class93 var200 = class65.method450(class72.field1300, 0, 23, var199);
            if (class246.field4432 == null && class286.field5122 == 3 || !class286.field5121.startsWith("win") || class73.field1314) {
                class120.method892((byte) 91, true, var200);
            } else {
                class257.field4637 = var200;
                class141.field2448 = true;
                class166.field2932 = class169.field2967.method1964(arg0 + 2, new String(var200.method642(arg0 + 20), "ISO-8859-1"));
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 38) {
            int var201 = class250.field4504.method1890(false);
            class93 var202 = class250.field4504.method1889((byte) -67);
            int var203 = class250.field4504.method1909((byte) 75);
            if (class113.method811(11077, var201)) {
                class126.method925(var203, (byte) -41, var202);
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 142) {
            int var204 = class250.field4504.method1891(-121);
            if (var204 == 65535) {
                var204 = -1;
            }
            class139.method1012((byte) 123, var204);
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 133) {
            int var205 = class250.field4504.method1912(-1004622416);
            int var206 = class250.field4504.method1890(false);
            if (var206 == 65535) {
                var206 = -1;
            }
            class165.method1189((byte) -121, var205, var206);
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 255) {
            int var207 = class250.field4504.method1907(arg0 + 16832);
            if (class250.field4504.method1907(16832) == 0) {
                class43.field691[var207] = new class78();
            } else {
                class250.field4504.field5027--;
                class43.field691[var207] = new class78(class250.field4504);
            }
            class111.field1888 = -1;
            class76.field1427 = class193.field3542;
            return true;
        } else if (class111.field1888 == 54) {
            int var208 = class250.field4504.method1871(arg0 - 117);
            int var209 = class250.field4504.method1897((byte) 56);
            int var210 = class250.field4504.method1909((byte) 37);
            int var211 = class250.field4504.method1918((byte) 90);
            if (class113.method811(11077, var210)) {
                class115.method827(var209, var208, 126, var211);
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 185) {
            int var212 = class250.field4504.method1877((byte) -26);
            int var213 = class250.field4504.method1907(arg0 + 16832);
            if (class113.method811(11077, var212)) {
                class129.field2275 = var213;
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 76) {
            int var214 = class250.field4504.method1890(false);
            int var215 = class250.field4504.method1895(108);
            class230.method1577(var215, (byte) -111, var214);
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 181) {
            class93 var216 = class250.field4504.method1889((byte) -67);
            if (var216.method678(arg0 ^ 0x46, class3.field24)) {
                class93 var252 = var216.method674(arg0 - 64, 0, var216.method652(class256.field4624, 9));
                boolean var253 = false;
                long var254 = var252.method679((byte) -95);
                for (int var256 = 0; var256 < class284.field5098; var256++) {
                    if (class223.field4025[var256] == var254) {
                        var253 = true;
                        break;
                    }
                }
                if (!var253 && class120.field2126 == 0) {
                    class263.method1764(4, (byte) -116, var252, class280.field5041);
                }
            } else if (var216.method678(74, class93.field1641)) {
                boolean var246 = false;
                class93 var247 = var216.method674(arg0 - 101, 0, var216.method652(class256.field4624, 9));
                long var248 = var247.method679((byte) 67);
                for (int var250 = 0; var250 < class284.field5098; var250++) {
                    if (class223.field4025[var250] == var248) {
                        var246 = true;
                        break;
                    }
                }
                if (!var246 && class120.field2126 == 0) {
                    class93 var251 = var216.method674(arg0 - 81, var216.method652(class256.field4624, 9) + 1, var216.method666(false) - 9);
                    class263.method1764(8, (byte) -116, var247, var251);
                }
            } else if (var216.method678(arg0 ^ 0x6E, class25.field328)) {
                class93 var217 = var216.method674(101, 0, var216.method652(class256.field4624, arg0 + 9));
                boolean var218 = false;
                long var219 = var217.method679((byte) 122);
                for (int var221 = 0; var221 < class284.field5098; var221++) {
                    if (class223.field4025[var221] == var219) {
                        var218 = true;
                        break;
                    }
                }
                if (!var218 && class120.field2126 == 0) {
                    class263.method1764(10, (byte) -116, var217, class178.field3144);
                }
            } else if (var216.method678(101, class39.field604)) {
                class93 var222 = var216.method674(-41, 0, var216.method652(class39.field604, 9));
                class263.method1764(11, (byte) -116, class178.field3144, var222);
            } else if (var216.method678(56, class186.field3439)) {
                class93 var223 = var216.method674(91, 0, var216.method652(class186.field3439, 9));
                if (class120.field2126 == 0) {
                    class263.method1764(12, (byte) -116, class178.field3144, var223);
                }
            } else if (var216.method678(76, class149.field2620)) {
                class93 var224 = var216.method674(arg0 ^ 0xFFFFFFD7, 0, var216.method652(class149.field2620, arg0 ^ 0x9));
                if (class120.field2126 == 0) {
                    class263.method1764(13, (byte) -116, class178.field3144, var224);
                }
            } else if (var216.method678(124, class55.field922)) {
                class93 var225 = var216.method674(102, 0, var216.method652(class256.field4624, arg0 + 9));
                long var226 = var225.method679((byte) 112);
                boolean var228 = false;
                for (int var229 = 0; var229 < class284.field5098; var229++) {
                    if (class223.field4025[var229] == var226) {
                        var228 = true;
                        break;
                    }
                }
                if (!var228 && class120.field2126 == 0) {
                    class263.method1764(14, (byte) -116, var225, class178.field3144);
                }
            } else if (var216.method678(arg0 ^ 0x65, class102.field1782)) {
                class93 var241 = var216.method674(-82, 0, var216.method652(class256.field4624, 9));
                long var242 = var241.method679((byte) -92);
                boolean var244 = false;
                for (int var245 = 0; var245 < class284.field5098; var245++) {
                    if (class223.field4025[var245] == var242) {
                        var244 = true;
                        break;
                    }
                }
                if (!var244 && class120.field2126 == 0) {
                    class263.method1764(15, (byte) -116, var241, class178.field3144);
                }
            } else if (var216.method678(arg0 + 88, class200.field3643)) {
                class93 var236 = var216.method674(-112, 0, var216.method652(class256.field4624, 9));
                long var237 = var236.method679((byte) 95);
                boolean var239 = false;
                for (int var240 = 0; var240 < class284.field5098; var240++) {
                    if (class223.field4025[var240] == var237) {
                        var239 = true;
                        break;
                    }
                }
                if (!var239 && class120.field2126 == 0) {
                    class263.method1764(16, (byte) -116, var236, class178.field3144);
                }
            } else if (var216.method678(63, class259.field4665)) {
                class93 var230 = var216.method674(-47, 0, var216.method652(class256.field4624, 9));
                long var231 = var230.method679((byte) 55);
                boolean var233 = false;
                for (int var234 = 0; var234 < class284.field5098; var234++) {
                    if (class223.field4025[var234] == var231) {
                        var233 = true;
                        break;
                    }
                }
                if (!var233 && class120.field2126 == 0) {
                    class93 var235 = var216.method674(-123, var216.method652(class256.field4624, 9) + 1, var216.method666(false) - 9);
                    class263.method1764(21, (byte) -116, var230, var235);
                }
            } else {
                class263.method1764(0, (byte) -116, class178.field3144, var216);
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 141) {
            class55.field908 = 0;
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 34) {
            int var257 = class250.field4504.method1890(false);
            int var258 = class250.field4504.method1909((byte) 39);
            int var259 = class250.field4504.method1891(arg0 - 120);
            if (class113.method811(11077, var258)) {
                class211.field3875 = var259;
                class50.field825 = var257;
                if (class18.field234 == 2) {
                    class233.field4155 = class50.field825;
                    class198.field3602 = class211.field3875;
                }
                class19.method89((byte) 104);
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 187) {
            class284.field5098 = class72.field1300 / 8;
            for (int var260 = 0; var260 < class284.field5098; var260++) {
                class223.field4025[var260] = class250.field4504.method1873((byte) 6);
                class164.field2889[var260] = class205.method1454((byte) -98, class223.field4025[var260]);
            }
            class9.field128 = class193.field3542;
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 249) {
            int var261 = class250.field4504.method1909((byte) 92);
            int var262 = class250.field4504.method1891(-128);
            int var263 = class250.field4504.method1876((byte) -82);
            class227 var264 = class155.field2709[var262];
            if (var264 != null) {
                class164.method1187(var261, var263, var264, (byte) 109);
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 37) {
            int var265 = class250.field4504.method1890(false);
            int var266 = class250.field4504.method1917((byte) -128);
            int var267 = class250.field4504.method1890(false);
            if (var267 == 65535) {
                var267 = -1;
            }
            if (class113.method811(11077, var265)) {
                class256.method1735(var266, -1, -47, var267, 2);
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 8) {
            class16.method76(-22);
            class121.field2173 = class250.field4504.method1914((byte) 60);
            class111.field1888 = -1;
            class167.field2951 = class193.field3542;
            return true;
        } else if (class111.field1888 == 23) {
            class93 var268 = class250.field4504.method1889((byte) -67);
            int var269 = class250.field4504.method1909((byte) 53);
            int var270 = class250.field4504.method1871(arg0 - 118);
            if (class113.method811(11077, var269)) {
                class133.method971(var270, 3, var268);
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 128) {
            int var271 = class250.field4504.method1926(arg0 ^ 0xFFE00000);
            class105.field1826 = class169.field2967.method1958(-82, var271);
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 44) {
            int var272 = class250.field4504.method1877((byte) -26);
            int var273 = class250.field4504.method1909((byte) 102);
            int var274 = class250.field4504.method1926(arg0 - 2097152);
            if (class113.method811(11077, var272)) {
                class24.method125(var273, 1, var274);
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 18) {
            for (int var275 = 0; var275 < class176.field3061.length; var275++) {
                if (class47.field754[var275] != class176.field3061[var275]) {
                    class176.field3061[var275] = class47.field754[var275];
                    class53.method292(var275, 119);
                    class124.field2209[class58.method333(class211.field3872++, 31)] = var275;
                }
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 99) {
            int var276 = class250.field4504.method1891(-113);
            int var277 = class250.field4504.method1907(16832);
            int var278 = class250.field4504.method1907(arg0 ^ 0x41C0);
            int var279 = class250.field4504.method1907(16832);
            int var280 = class250.field4504.method1907(16832);
            int var281 = class250.field4504.method1891(arg0 - 127);
            if (class113.method811(11077, var276)) {
                class243.field4383[var277] = true;
                class227.field4060[var277] = var278;
                class7.field95[var277] = var279;
                class259.field4657[var277] = var280;
                class269.field4809[var277] = var281;
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 92) {
            class39.field609 = class250.field4504.method1876((byte) -82);
            class152.field2673 = class250.field4504.method1907(16832);
            while (class72.field1300 > class250.field4504.field5027) {
                class111.field1888 = class250.field4504.method1907(16832);
                class240.method1638((byte) 108);
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 48) {
            int var282 = class250.field4504.method1909((byte) 26);
            int var283 = class250.field4504.method1917((byte) 76);
            int var284 = class250.field4504.method1877((byte) -26);
            int var285 = class250.field4504.method1909((byte) 89);
            if (class113.method811(11077, var284)) {
                class6.method27((var282 << 16) + var285, (byte) 80, var283);
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 252) {
            int var286 = class250.field4504.method1926(arg0 ^ 0xFFE00000);
            int var287 = class250.field4504.method1909((byte) 102);
            if (class113.method811(arg0 + 11077, var287)) {
                int var288 = 0;
                if (class166.field2927.field4249 != null) {
                    var288 = class166.field2927.field4249.method1168(arg0 ^ 0xC);
                }
                class256.method1735(var286, -1, 127, var288, 3);
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 214) {
            int var289 = class250.field4504.method1895(103);
            int var290 = class250.field4504.method1872(98);
            int var291 = class250.field4504.method1909((byte) 23);
            if (class113.method811(11077, var291)) {
                class80.method554(var290, arg0 + 7, var289);
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 96) {
            int var292 = class250.field4504.method1909((byte) 48);
            int var293 = class250.field4504.method1871(arg0 ^ 0x79);
            int var294 = class250.field4504.method1926(arg0 - 2097152);
            if (class113.method811(11077, var292)) {
                class214 var295 = (class214) class255.field4610.method135((long) var293, true);
                class214 var296 = (class214) class255.field4610.method135((long) var294, true);
                if (var296 != null) {
                    class66.method454(1, var296, var295 == null || var295.field3912 != var296.field3912);
                }
                if (var295 != null) {
                    var295.method1544((byte) -32);
                    class255.field4610.method137((long) var294, var295, -1);
                }
                class181 var297 = client.method1114(-20985, var293);
                if (var297 != null) {
                    class254.method1731(var297, (byte) -75);
                }
                class181 var298 = client.method1114(-20985, var294);
                if (var298 != null) {
                    class254.method1731(var298, (byte) -127);
                    class32.method192(var298, true, arg0 - 1);
                }
                if (class69.field1262 != -1) {
                    class61.method383(class69.field1262, 73, 1);
                }
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 40) {
            int var299 = class250.field4504.method1890(false);
            int var300 = class250.field4504.method1871(-114);
            class130.method953(arg0 ^ 0x1, var299, var300);
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 223) {
            int var301 = class250.field4504.method1876((byte) -82);
            int var302 = class250.field4504.method1876((byte) -82);
            int var303 = class250.field4504.method1907(arg0 + 16832);
            class138.field2405 = var301 >> 1;
            class166.field2927.method1614((byte) 90, var303, (var301 & 0x1) == 1, var302);
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 222) {
            class83.method582(class72.field1300, class169.field2967, true, class250.field4504);
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 86) {
            long var304 = class250.field4504.method1873((byte) 6);
            class250.field4504.method1925(true);
            long var306 = class250.field4504.method1873((byte) 6);
            boolean var308 = false;
            long var309 = (long) class250.field4504.method1891(-122);
            long var311 = (long) class250.field4504.method1893((byte) -107);
            long var313 = (var309 << 32) + var311;
            int var315 = class250.field4504.method1907(16832);
            int var316 = 0;
            label1477: while (true) {
                if (var316 >= 100) {
                    if (var315 <= 1) {
                        if ((!class3.field36 || class67.field1224) && !class19.field259) {
                            for (int var317 = 0; var317 < class284.field5098; var317++) {
                                if (class223.field4025[var317] == var304) {
                                    var308 = true;
                                    break label1477;
                                }
                            }
                        } else {
                            var308 = true;
                        }
                    }
                    break;
                }
                if (class3.field34[var316] == var313) {
                    var308 = true;
                    break;
                }
                var316++;
            }
            if (!var308 && class120.field2126 == 0) {
                class3.field34[class42.field661] = var313;
                class42.field661 = (class42.field661 + 1) % 100;
                class93 var318 = class274.method1815(class52.method285(32767, class250.field4504).method672(arg0 + 958045282));
                if (var315 == 2 || var315 == 3) {
                    class149.method1072(9, class205.method1454((byte) 94, var306).method687(arg0 ^ 0xFFFFFFA0), class130.method949((byte) -77, new class93[] { class30.field451, class205.method1454((byte) -95, var304).method687(arg0 ^ 0xFFFFFFA0) }), arg0, var318);
                } else if (var315 == 1) {
                    class149.method1072(9, class205.method1454((byte) -93, var306).method687(arg0 - 96), class130.method949((byte) -77, new class93[] { class288.field5150, class205.method1454((byte) -93, var304).method687(arg0 ^ 0xFFFFFFA0) }), 0, var318);
                } else {
                    class149.method1072(9, class205.method1454((byte) 47, var306).method687(-96), class205.method1454((byte) 51, var304).method687(arg0 - 96), arg0, var318);
                }
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 231) {
            class16.method76(arg0 ^ 0xFFFFFFB6);
            int var319 = class250.field4504.method1895(125);
            int var320 = class250.field4504.method1872(123);
            int var321 = class250.field4504.method1907(16832);
            class273.field4866[var321] = var320;
            class172.field3014[var321] = var319;
            class144.field2491[var321] = 1;
            for (int var322 = 0; var322 < 98; var322++) {
                if (var320 >= class63.field1148[var322]) {
                    class144.field2491[var321] = var322 + 2;
                }
            }
            class249.field4482[class58.method333(class259.field4658++, 31)] = var321;
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 64) {
            class19.method86((byte) -120);
            class16.method76(-95);
            class211.field3872 += 32;
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 176) {
            class14.field170 = class250.field4504.method1907(16832);
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 220) {
            int var323 = class250.field4504.method1891(arg0 ^ 0xFFFFFF84);
            int var324 = class250.field4504.method1872(113);
            if (class113.method811(arg0 + 11077, var323)) {
                class214 var325 = (class214) class255.field4610.method135((long) var324, true);
                if (var325 != null) {
                    class66.method454(arg0 + 1, var325, true);
                }
                if (class139.field2410 != null) {
                    class254.method1731(class139.field2410, (byte) -102);
                    class139.field2410 = null;
                }
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 87) {
            int var326 = class250.field4504.method1891(arg0 - 123);
            int var327 = class250.field4504.method1917((byte) -102);
            class230.method1577(var327, (byte) -111, var326);
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 194) {
            int var328 = class250.field4504.method1879(1483502360);
            int var329 = class250.field4504.method1890(false);
            class93 var330 = class250.field4504.method1889((byte) -67);
            if (var329 == 65535) {
                var329 = -1;
            }
            int var331 = class250.field4504.method1876((byte) -82);
            if (var331 >= 1 && var331 <= 8) {
                if (var330.method649(class167.field2937, -4446)) {
                    var330 = null;
                }
                class69.field1251[var331 - 1] = var330;
                class167.field2949[var331 - 1] = var329;
                class89.field1578[var331 - 1] = var328 == 0;
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 127) {
            int var332 = class250.field4504.method1871(-114);
            int var333 = class250.field4504.method1909((byte) 84);
            int var334 = class250.field4504.method1890(false);
            if (class113.method811(11077, var334)) {
                class7.method33(false, var333, var332);
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 208) {
            class31.method180(false, -21895);
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 221) {
            int var335 = class250.field4504.method1877((byte) -26);
            int var336 = class250.field4504.method1871(arg0 ^ 0x49);
            int var337 = class250.field4504.method1890(false);
            int var338 = class250.field4504.method1909((byte) 29);
            if (var338 == 65535) {
                var338 = -1;
            }
            int var339 = class250.field4504.method1891(-121);
            if (var339 == 65535) {
                var339 = -1;
            }
            if (class113.method811(11077, var337)) {
                for (int var340 = var338; var340 <= var339; var340++) {
                    long var341 = ((long) var336 << 32) + (long) var340;
                    class200 var343 = (class200) class140.field2439.method135(var341, true);
                    class200 var344;
                    if (var343 != null) {
                        var344 = new class200(var343.field3646, var335);
                        var343.method1544((byte) -86);
                    } else if (var340 == -1) {
                        var344 = new class200(client.method1114(-20985, var336).field3349.field3646, var335);
                    } else {
                        var344 = new class200(0, var335);
                    }
                    class140.field2439.method137(var341, var344, -1);
                }
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 170) {
            int var345 = class250.field4504.method1890(false);
            class14.method65(2, var345);
            class9.field131[class58.method333(31, class54.field905++)] = class58.method333(32767, var345);
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 27) {
            class25.method130((byte) -26);
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 136) {
            int var346 = class250.field4504.method1909((byte) 40);
            int var347 = class250.field4504.method1877((byte) -26);
            int var348 = class250.field4504.method1890(false);
            int var349 = class250.field4504.method1890(false);
            int var350 = class250.field4504.method1872(127);
            if (class113.method811(11077, var347)) {
                class245.method1669(var346, var350, var348, (byte) 125, var349);
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 131) {
            for (int var351 = 0; var351 < class224.field4031.length; var351++) {
                if (class224.field4031[var351] != null) {
                    class224.field4031[var351].field3840 = -1;
                }
            }
            for (int var352 = 0; var352 < class155.field2709.length; var352++) {
                if (class155.field2709[var352] != null) {
                    class155.field2709[var352].field3840 = -1;
                }
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 143) {
            int var353 = class250.field4504.method1891(-126);
            if (class113.method811(11077, var353)) {
                class15.method71(0);
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 160) {
            int var354 = class250.field4504.method1872(arg0 + 94);
            int var355 = class250.field4504.method1872(111);
            int var356 = class250.field4504.method1890(false);
            int var357 = class250.field4504.method1909((byte) 36);
            if (var357 == 65535) {
                var357 = -1;
            }
            if (class113.method811(arg0 + 11077, var356)) {
                class181 var358 = client.method1114(-20985, var354);
                if (var358.field3307) {
                    class206.method1457(var357, 9, var354, var355);
                    class29 var359 = class89.method617(var357, 0);
                    class245.method1669(var359.field393, var354, var359.field403, (byte) 114, var359.field418);
                    class83.method580(var359.field422, (byte) -116, var359.field411, var354, var359.field371);
                } else if (var357 == -1) {
                    class111.field1888 = -1;
                    var358.field3287 = 0;
                    return true;
                } else {
                    class29 var360 = class89.method617(var357, arg0);
                    var358.field3243 = var360.field393;
                    var358.field3254 = var360.field403;
                    var358.field3326 = var357;
                    var358.field3287 = 4;
                    var358.field3260 = var360.field418 * 100 / var355;
                    class254.method1731(var358, (byte) -77);
                }
            }
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 94) {
            int var361 = class250.field4504.method1872(arg0 ^ 0x5E);
            int var362 = class250.field4504.method1891(-116);
            class181 var363;
            if (var361 < 0) {
                var363 = null;
            } else {
                var363 = client.method1114(-20985, var361);
            }
            if (var361 < -70000) {
                var362 += 32768;
            }
            while (class250.field4504.field5027 < class72.field1300) {
                int var364 = class250.field4504.method1924(arg0 + 8100);
                int var365 = class250.field4504.method1891(-122);
                int var366 = 0;
                if (var365 != 0) {
                    var366 = class250.field4504.method1907(16832);
                    if (var366 == 255) {
                        var366 = class250.field4504.method1872(arg0 ^ 0x7E);
                    }
                }
                if (var363 != null && var364 >= 0 && var364 < var363.field3301.length) {
                    var363.field3301[var364] = var365;
                    var363.field3304[var364] = var366;
                }
                class177.method1290(0, var362, var366, var364, var365 - 1);
            }
            if (var363 != null) {
                class254.method1731(var363, (byte) 89);
            }
            class16.method76(-48);
            class9.field131[class58.method333(31, class54.field905++)] = class58.method333(32767, var362);
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 69) {
            int var367 = class250.field4504.method1891(-126);
            if (var367 == 65535) {
                var367 = -1;
            }
            int var368 = class250.field4504.method1907(arg0 + 16832);
            int var369 = class250.field4504.method1891(-120);
            class279.method1866(var367, var368, var369, ~arg0);
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 4) {
            class38.field593 = class250.field4504.method1891(-112) * 30;
            class167.field2951 = class193.field3542;
            class111.field1888 = -1;
            return true;
        } else if (class111.field1888 == 241) {
            long var370 = class250.field4504.method1873((byte) 6);
            int var372 = class250.field4504.method1891(-123);
            class93 var373 = class127.method928(var372, (byte) 18).method413(5383, class250.field4504);
            class260.method1753((class93) null, var373, class205.method1454((byte) -99, var370).method687(arg0 ^ 0xFFFFFFA0), var372, -4252, 19);
            class111.field1888 = -1;
            return true;
        } else {
            class127.method931((byte) -124, "T1 - " + class111.field1888 + "," + class238.field4265 + "," + class256.field4627 + " - " + class72.field1300, (Throwable) null);
            class121.method895(118);
            return true;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lhg;I)V")
    public static final void method1370(class177 arg0, int arg1) {
        field3477++;
        if (arg1 == -1) {
            class232.field4147 = arg0;
            class141.field2455 = class232.field4147.method1283(4, -5357);
        }
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
    public class190() {
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lvc;)V")
    public class190(class190 arg0) {
        this.field3475 = arg0.field3475;
        this.field3474 = arg0.field3474;
        this.field3470 = arg0.field3470;
        this.field3472 = arg0.field3472;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
    public static final void method1371(byte arg0) {
        for (class43 var1 = (class43) class70.field1278.method1151(105); var1 != null; var1 = (class43) class70.field1278.method1159(95)) {
            if (var1.field694) {
                var1.method243(24946);
            }
        }
        field3473++;
        for (class43 var2 = (class43) class58.field990.method1151(126); var2 != null; var2 = (class43) class58.field990.method1159(111)) {
            if (var2.field694) {
                var2.method243(24946);
            }
        }
        if (arg0 < 7) {
            method1367(true);
        }
    }
}
