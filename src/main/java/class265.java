import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class265 {

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "Lum;")
    public static class347 field3759 = new class347();

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "[[S")
    public static short[][] field3761 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public int field3754;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public int field3755;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public int field3756;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZI)V")
    public static final void method1630(boolean arg0, int arg1) {
        field3757++;
        if (arg0 && class249.field3567 != null) {
            class364.field5476 = class249.field3567.field3543;
        } else {
            class364.field5476 = -1;
        }
        class389.field5768 = 0;
        class26.field431 = null;
        class56.field883 = null;
        class249.field3567 = null;
        class249.method1571();
        if (arg1 >= -29) {
            return;
        }
        class249.field3582.method2089(328);
        class96.field1290 = null;
        class472.field6822 = null;
        class94.field1268 = null;
        class134.field1711 = -1;
        class206.field2851 = null;
        class493.field7525 = null;
        class261.field3728 = -1;
        class400.field5888 = null;
        class249.field3575 = null;
        class12.field198 = null;
        class251.field3613 = null;
        class411.field6035 = null;
        class249.field3573.method281(14240);
        class249.field3568.method1263(64, 64, (byte) -19);
        class249.field3573.method285((byte) -17, 128, 64);
        class249.field3566.method2130(-10668, 64);
        class78.field1102.method441((byte) 109, 64);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
    public static void method1631(int arg0) {
        if (arg0 != -1) {
            method1630(true, 112);
        }
        field3761 = null;
        field3759 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)Z")
    public static final boolean method1632(byte arg0) throws IOException {
        field3760++;
        if (class22.field294 == null) {
            return false;
        }
        int var1 = class22.field294.method2120(102);
        if (var1 == 0) {
            return false;
        }
        if (class36.field563 == null) {
            if (class432.field6344) {
                class22.field294.method2125(1, (byte) -55, class234.field3288.field2041, 0);
                var1--;
                class432.field6344 = false;
                class216.field3035++;
            }
            class234.field3288.field2018 = 0;
            if (class234.field3288.method2219(255)) {
                if (var1 == 0) {
                    return false;
                }
                class22.field294.method2125(1, (byte) -55, class234.field3288.field2041, 1);
                var1--;
                class216.field3035++;
            }
            class432.field6344 = true;
            class390[] var2 = class157.method1006(0);
            int var3 = class234.field3288.method2222((byte) 125);
            if (var3 < 0 || var3 >= var2.length) {
                throw new IOException("invo:" + var3 + " ip:" + class234.field3288.field2018);
            }
            class36.field563 = var2[var3];
            class359.field5330 = class36.field563.field5793;
        }
        if (class359.field5330 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class22.field294.method2125(1, (byte) -55, class234.field3288.field2041, 0);
            class216.field3035++;
            class359.field5330 = class234.field3288.field2041[0] & 0xFF;
            var1--;
        }
        if (class359.field5330 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class22.field294.method2125(2, (byte) -55, class234.field3288.field2041, 0);
            class234.field3288.field2018 = 0;
            var1 -= 2;
            class359.field5330 = class234.field3288.method993((byte) -44);
            class216.field3035 += 2;
        }
        if (class359.field5330 > var1) {
            return false;
        }
        class234.field3288.field2018 = 0;
        class22.field294.method2125(class359.field5330, (byte) -55, class234.field3288.field2041, 0);
        class116.field1499 = 0;
        class216.field3035 += class359.field5330;
        class357.field5300 = class13.field203;
        class13.field203 = class309.field4507;
        class309.field4507 = class36.field563;
        if (class441.field6437 == class36.field563) {
            int var4 = class234.field3288.method963(-119);
            int var5 = class234.field3288.method993((byte) -78);
            int var6 = class234.field3288.method999(4);
            int var7 = class234.field3288.method985(85);
            int var8 = class234.field3288.method963(-122);
            if (class358.method2175((byte) -115, var7)) {
                class495.method2976(var5, var8, (byte) -89, var6, var4);
            }
            class36.field563 = null;
            return true;
        } else if (class53.field806 == class36.field563) {
            int var9 = class234.field3288.method993((byte) -34);
            int var10 = class234.field3288.method941((byte) 127);
            int var11 = class234.field3288.method941((byte) 126);
            int var12 = class234.field3288.method993((byte) -83) << 0;
            int var13 = class234.field3288.method941((byte) 127);
            int var14 = class234.field3288.method941((byte) 125);
            if (class358.method2175((byte) -86, var9)) {
                class327.method1965((byte) 80, var11, true, var10, var14, var12, var13);
            }
            class36.field563 = null;
            return true;
        } else if (class389.field5774 == class36.field563) {
            class388.method2332(2, class230.field3219);
            class36.field563 = null;
            return true;
        } else if (class36.field563 == class254.field3670) {
            int var15 = class234.field3288.method999(4);
            int var16 = class234.field3288.method963(arg0 ^ 0x6A);
            if (class358.method2175((byte) -107, var16)) {
                class269.method1645(-1, 3, var15, -1, (byte) 116);
            }
            class36.field563 = null;
            return true;
        } else if (class442.field6446 == class36.field563) {
            int var17 = class234.field3288.method950(186);
            int var18 = class234.field3288.method950(arg0 + 192);
            int var19 = class234.field3288.method985(-96);
            if (class358.method2175((byte) -83, var19)) {
                class311 var20 = (class311) class213.field3010.method2310((byte) -69, (long) var17);
                class311 var21 = (class311) class213.field3010.method2310((byte) 102, (long) var18);
                if (var21 != null) {
                    class32.method264(var20 == null || var20.field4525 != var21.field4525, arg0 - 16318922, false, var21);
                }
                if (var20 != null) {
                    var20.method536(false);
                    class213.field3010.method2317(-1, (long) var18, var20);
                }
                class356 var22 = class4.method25(var17, false);
                if (var22 != null) {
                    class170.method1068(arg0 ^ 0x7F, var22);
                }
                class356 var23 = class4.method25(var18, false);
                if (var23 != null) {
                    class170.method1068(-41, var23);
                    class53.method393(true, var23, (byte) -81);
                }
                if (class465.field6737 != -1) {
                    class469.method2743(1, false, class465.field6737);
                }
            }
            class36.field563 = null;
            return true;
        } else if (class36.field563 == class149.field1931) {
            class388.method2332(2, class126.field1624);
            class36.field563 = null;
            return true;
        } else if (class46.field699 == class36.field563) {
            class294.field4255 = class490.field7491;
            if (class359.field5330 == 0) {
                class36.field563 = null;
                class205.field2842 = null;
                class311.field4528 = null;
                class437.field6402 = 0;
                class216.field3033 = null;
                return true;
            }
            class311.field4528 = class234.field3288.method981(false);
            boolean var24 = class234.field3288.method941((byte) 123) == 1;
            if (var24) {
                class234.field3288.method981(false);
            }
            long var25 = class234.field3288.method975(-76);
            class205.field2842 = class222.method1374(var25, (byte) -97);
            class41.field631 = class234.field3288.method946(84);
            int var27 = class234.field3288.method941((byte) 124);
            if (var27 == 255) {
                class36.field563 = null;
                return true;
            }
            class437.field6402 = var27;
            class137[] var28 = new class137[100];
            for (int var29 = 0; var29 < class437.field6402; var29++) {
                var28[var29] = new class137();
                var28[var29].field1796 = class234.field3288.method981(false);
                boolean var35 = class234.field3288.method941((byte) 123) == 1;
                if (var35) {
                    var28[var29].field1793 = class234.field3288.method981(false);
                } else {
                    var28[var29].field1793 = var28[var29].field1796;
                }
                var28[var29].field1786 = class258.method1605(var28[var29].field1793, arg0 ^ 0xFFFFFF86);
                var28[var29].field1790 = class234.field3288.method993((byte) -88);
                var28[var29].field1791 = class234.field3288.method946(arg0 + 63);
                var28[var29].field1795 = class234.field3288.method981(false);
                if (var28[var29].field1793.equals(class415.field6145.field4592)) {
                    class48.field741 = var28[var29].field1791;
                }
            }
            boolean var30 = false;
            int var31 = class437.field6402;
            while (var31 > 0) {
                boolean var32 = true;
                var31--;
                for (int var33 = 0; var33 < var31; var33++) {
                    if (var28[var33].field1786.compareTo(var28[var33 + 1].field1786) > 0) {
                        class137 var34 = var28[var33];
                        var28[var33] = var28[var33 + 1];
                        var28[var33 + 1] = var34;
                        var32 = false;
                    }
                }
                if (var32) {
                    break;
                }
            }
            class216.field3033 = var28;
            class36.field563 = null;
            return true;
        } else if (class36.field563 == class262.field3741) {
            int var36 = class234.field3288.method993((byte) -87);
            if (var36 == 65535) {
                var36 = -1;
            }
            int var37 = class234.field3288.method941((byte) 125);
            int var38 = class234.field3288.method993((byte) -59);
            int var39 = class234.field3288.method941((byte) 123);
            class66.method464(var38, var39, var36, var37, (byte) 2);
            class36.field563 = null;
            return true;
        } else if (class36.field563 == class186.field2647) {
            int var40 = class234.field3288.method954(-1);
            int var41 = class234.field3288.method963(-125);
            int var42 = class234.field3288.method999(arg0 + 10);
            int var43 = class234.field3288.method959(65536);
            if (class358.method2175((byte) -77, var41)) {
                class142.method894(var43, (byte) 119, var40, var42);
            }
            class36.field563 = null;
            return true;
        } else if (class36.field563 == class216.field3036) {
            int var44 = class234.field3288.method941((byte) 125);
            int var45 = var44 >> 5;
            int var46 = var44 & 0x1F;
            if (var46 == 0) {
                class254.field3662[var45] = null;
                class36.field563 = null;
                return true;
            }
            class434 var47 = new class434();
            var47.field6358 = var46;
            var47.field6364 = class234.field3288.method941((byte) 127);
            if (var47.field6364 >= 0 && class150.field1943.length > var47.field6364) {
                if (var47.field6358 == 1 || var47.field6358 == 10) {
                    var47.field6357 = class234.field3288.method993((byte) -119);
                    class234.field3288.field2018 += 6;
                } else if (var47.field6358 >= 2 && var47.field6358 <= 6) {
                    if (var47.field6358 == 2) {
                        var47.field6362 = 64;
                        var47.field6360 = 64;
                    }
                    if (var47.field6358 == 3) {
                        var47.field6362 = 64;
                        var47.field6360 = 0;
                    }
                    if (var47.field6358 == 4) {
                        var47.field6360 = 128;
                        var47.field6362 = 64;
                    }
                    if (var47.field6358 == 5) {
                        var47.field6362 = 0;
                        var47.field6360 = 64;
                    }
                    if (var47.field6358 == 6) {
                        var47.field6362 = 128;
                        var47.field6360 = 64;
                    }
                    var47.field6358 = 2;
                    var47.field6365 = class234.field3288.method941((byte) 127);
                    var47.field6360 += class234.field3288.method993((byte) -65) - class455.field6637 << 7;
                    var47.field6362 += class234.field3288.method993((byte) -58) - class223.field3158 << 7;
                    var47.field6367 = class234.field3288.method941((byte) 125);
                    var47.field6363 = class234.field3288.method993((byte) -122);
                }
                var47.field6366 = class234.field3288.method993((byte) -39);
                if (var47.field6366 == 65535) {
                    var47.field6366 = -1;
                }
                class254.field3662[var45] = var47;
            }
            class36.field563 = null;
            return true;
        } else if (class36.field563 == class100.field1367) {
            int var48 = class234.field3288.method941((byte) 125);
            int var49 = class234.field3288.method955((byte) -124);
            boolean var50 = (var48 & 0x1) == 1;
            class285.method1730(var50, var49, true);
            class508.field7745[class500.method3013(class437.field6392++, 31)] = var49;
            class36.field563 = null;
            return true;
        } else if (class36.field563 == class341.field4962) {
            int var51 = class234.field3288.method963(-128);
            int var52 = class234.field3288.method963(arg0 ^ 0x7B);
            int var53 = class234.field3288.method980(arg0 ^ 0x4BF7);
            class139 var54 = class504.field7697[var52];
            if (var54 != null) {
                class403.method2417(var51, var54, var53, arg0 ^ 0xFFFFFF8E);
            }
            class36.field563 = null;
            return true;
        } else if (class480.field6933 == class36.field563) {
            int var55 = class234.field3288.method941((byte) 125);
            boolean var56 = (var55 & 0x1) == 1;
            String var57 = class234.field3288.method981(false);
            String var58 = class234.field3288.method981(false);
            if (var58.equals("")) {
                var58 = var57;
            }
            String var59 = class234.field3288.method981(false);
            String var60 = class234.field3288.method981(false);
            if (var60.equals("")) {
                var60 = var59;
            }
            if (var56) {
                for (int var61 = 0; var61 < class136.field1754; var61++) {
                    if (class235.field3307[var61].equals(var60)) {
                        class137.field1787[var61] = var57;
                        class235.field3307[var61] = var58;
                        class149.field1932[var61] = var59;
                        class239.field3346[var61] = var60;
                        break;
                    }
                }
            } else {
                class137.field1787[class136.field1754] = var57;
                class235.field3307[class136.field1754] = var58;
                class149.field1932[class136.field1754] = var59;
                class239.field3346[class136.field1754] = var60;
                class246.field3538[class136.field1754] = class500.method3013(var55, 2) == 2;
                class136.field1754++;
            }
            class145.field1888 = class490.field7491;
            class36.field563 = null;
            return true;
        } else if (class36.field563 == class224.field3170) {
            class472.method2762((byte) -105);
            class36.field563 = null;
            return true;
        } else if (class96.field1294 == class36.field563) {
            int var62 = class234.field3288.method993((byte) -111);
            int var63 = class234.field3288.method941((byte) 127);
            int var64 = class234.field3288.method941((byte) 124);
            int var65 = class234.field3288.method993((byte) -112) << 0;
            int var66 = class234.field3288.method941((byte) 126);
            int var67 = class234.field3288.method941((byte) 126);
            if (class358.method2175((byte) -110, var62)) {
                class420.method2487(var63, var64, 75, var66, var65, var67);
            }
            class36.field563 = null;
            return true;
        } else if (class399.field5878 == class36.field563) {
            class364.field5475 = class234.field3288.method939(arg0 ^ 0xFD0C890A);
            class116.field1497 = class234.field3288.method946(arg0 + 100) << 3;
            class417.field6192 = class234.field3288.method976((byte) 26) << 3;
            for (class414 var68 = (class414) class473.field6838.method2316(4999); var68 != null; var68 = (class414) class473.field6838.method2308((byte) 122)) {
                int var70 = (int) (var68.field1177 & 0x3FFFL);
                int var71 = (int) (var68.field1177 >> 14 & 0x3FFFL);
                int var72 = (int) (var68.field1177 >> 28 & 0x3L);
                if (class364.field5475 == var72 && class116.field1497 <= var70 && (class116.field1497 + 8) > var70 && var71 >= class417.field6192 && var71 < class417.field6192 + 8) {
                    var68.method536(false);
                    class409.method2447(var70, (byte) 68, var71, class364.field5475);
                }
            }
            for (class234 var69 = (class234) class117.field1517.method2096(-21400); var69 != null; var69 = (class234) class117.field1517.method2084((byte) 19)) {
                if (class116.field1497 <= var69.field3283 && class116.field1497 + 8 > var69.field3283 && class417.field6192 <= var69.field3280 && var69.field3280 < class417.field6192 + 8 && class364.field5475 == var69.field3276) {
                    var69.field3272 = 0;
                }
            }
            class36.field563 = null;
            return true;
        } else if (class36.field563 == class231.field3232) {
            String var73 = class234.field3288.method981(false);
            int var74 = class234.field3288.method996(8);
            int var75 = class234.field3288.method939(49510128);
            int var76 = class234.field3288.method955((byte) -128);
            if (var76 == 65535) {
                var76 = -1;
            }
            if (var75 >= 1 && var75 <= 8) {
                if (var73.equalsIgnoreCase("null")) {
                    var73 = null;
                }
                class84.field1161[var75 - 1] = var73;
                class482.field6984[var75 - 1] = var76;
                class493.field7530[var75 - 1] = var74 == 0;
            }
            class36.field563 = null;
            return true;
        } else if (class488.field7468 == class36.field563) {
            int var77 = class234.field3288.method993((byte) -69);
            if (class358.method2175((byte) -116, var77)) {
                class193.method1216((byte) 124);
            }
            class36.field563 = null;
            return true;
        } else if (class36.field563 == class259.field3718) {
            class90.method560(class359.field5330, class234.field3288, arg0 ^ 0xFFFFFEFA);
            class36.field563 = null;
            return true;
        } else if (class36.field563 == class205.field2841) {
            boolean var78 = class234.field3288.method941((byte) 127) == 1;
            String var79 = class234.field3288.method981(false);
            String var80 = var79;
            if (var78) {
                var80 = class234.field3288.method981(false);
            }
            int var81 = class234.field3288.method941((byte) 125);
            boolean var82 = false;
            if (var81 <= 1) {
                if (!(!class434.field6368 || class110.field1445) || class360.field5350) {
                    var82 = true;
                } else if (var81 <= 1 && class17.method124(true, var80)) {
                    var82 = true;
                }
            }
            if (!var82 && class226.field3197 == 0) {
                String var83 = class210.method1301((byte) -44, class431.method2561((byte) 126, class234.field3288));
                if (var81 == 2) {
                    class40.method308(var83, -1, null, 24, "<img=1>" + var80, -1, "<img=1>" + var79, 0);
                } else if (var81 == 1) {
                    class40.method308(var83, -1, null, 24, "<img=0>" + var80, -1, "<img=0>" + var79, 0);
                } else {
                    class40.method308(var83, -1, null, 24, var80, -1, var79, 0);
                }
            }
            class36.field563 = null;
            return true;
        } else if (class502.field7665 == class36.field563) {
            class202.method1247(5818);
            class36.field563 = null;
            return false;
        } else if (class58.field901 == class36.field563) {
            int var84 = class234.field3288.method963(-118);
            int var85 = class234.field3288.method999(4);
            class453.field6591.method110(var84, var85, true);
            class36.field563 = null;
            return true;
        } else if (class36.field563 == class162.field2100) {
            int var86 = class234.field3288.method963(-116);
            if (var86 == 65535) {
                var86 = -1;
            }
            int var87 = class234.field3288.method986((byte) 0);
            int var88 = var87 >> 28 & 0x3;
            int var89 = var87 >> 14 & 0x3FFF;
            int var90 = var87 & 0x3FFF;
            int var91 = class234.field3288.method939(49510128);
            int var92 = var91 >> 2;
            int var93 = var91 & 0x3;
            int var94 = var89 - class455.field6637;
            int var95 = var90 - class223.field3158;
            int var96 = class327.field4772[var92];
            class9.method71(var94, var92, var86, var96, var95, var93, var88, false);
            class36.field563 = null;
            return true;
        } else if (class36.field563 == class355.field5127) {
            int var97 = class234.field3288.method977((byte) 99);
            int var98 = class234.field3288.method986((byte) 0);
            int var99 = class234.field3288.method963(arg0 ^ 0x7A);
            if (var99 == 65535) {
                var99 = -1;
            }
            int var100 = class234.field3288.method955((byte) -127);
            if (var100 == 65535) {
                var100 = -1;
            }
            int var101 = class234.field3288.method993((byte) -39);
            if (class358.method2175((byte) -94, var101)) {
                for (int var102 = var99; var102 <= var100; var102++) {
                    long var103 = ((long) var97 << 32) + (long) var102;
                    class489 var105 = (class489) class7.field130.method2310((byte) 63, var103);
                    class489 var106;
                    if (var105 != null) {
                        var106 = new class489(var98, var105.field7482);
                        var105.method536(false);
                    } else if (var102 == -1) {
                        var106 = new class489(var98, class4.method25(var97, false).field5280.field7482);
                    } else {
                        var106 = new class489(var98, -1);
                    }
                    class7.field130.method2317(arg0 ^ 0x5, var103, var106);
                }
            }
            class36.field563 = null;
            return true;
        } else if (class372.field5575 == class36.field563) {
            boolean var107 = class234.field3288.method941((byte) 123) == 1;
            String var108 = class234.field3288.method981(false);
            String var109 = var108;
            if (var107) {
                var109 = class234.field3288.method981(false);
            }
            long var110 = class234.field3288.method975(-103);
            long var112 = (long) class234.field3288.method993((byte) -89);
            long var114 = (long) class234.field3288.method943(1295851312);
            int var116 = class234.field3288.method941((byte) 125);
            long var117 = (var112 << 32) + var114;
            boolean var119 = false;
            int var120 = 0;
            while (true) {
                if (var120 >= 100) {
                    if (var116 <= 1) {
                        if (!(!class434.field6368 || class110.field1445) || class360.field5350) {
                            var119 = true;
                        } else if (class17.method124(true, var109)) {
                            var119 = true;
                        }
                    }
                    break;
                }
                if (class298.field4341[var120] == var117) {
                    var119 = true;
                    break;
                }
                var120++;
            }
            if (!var119 && class226.field3197 == 0) {
                class298.field4341[class292.field4172] = var117;
                class292.field4172 = (class292.field4172 + 1) % 100;
                String var121 = class210.method1301((byte) -44, class431.method2561((byte) 122, class234.field3288));
                if (var116 == 2 || var116 == 3) {
                    class40.method308(var121, -1, class340.method2065(0, var110), 9, "<img=1>" + var109, -1, "<img=1>" + var108, 0);
                } else if (var116 == 1) {
                    class40.method308(var121, -1, class340.method2065(arg0 + 6, var110), 9, "<img=0>" + var109, -1, "<img=0>" + var108, 0);
                } else {
                    class40.method308(var121, -1, class340.method2065(0, var110), 9, var109, -1, var108, 0);
                }
            }
            class36.field563 = null;
            return true;
        } else if (class454.field6611 == class36.field563) {
            class291.field4160 = class234.field3288.method993((byte) -97) * 30;
            class28.field470 = class490.field7491;
            class36.field563 = null;
            return true;
        } else if (class85.field1167 == class36.field563) {
            class234.field3288.field2018 += 28;
            if (class234.field3288.method938(arg0 ^ 0x68)) {
                class500.method3011((byte) 98, class234.field3288.field2018 - 28, class234.field3288);
            }
            class36.field563 = null;
            return true;
        } else if (class86.field1180 == class36.field563) {
            class388.method2332(arg0 ^ 0xFFFFFFF8, class423.field6255);
            class36.field563 = null;
            return true;
        } else if (class71.field1040 == class36.field563) {
            boolean var122 = class234.field3288.method941((byte) 126) == 1;
            String var123 = class234.field3288.method981(false);
            String var124 = var123;
            if (var122) {
                var124 = class234.field3288.method981(false);
            }
            long var125 = (long) class234.field3288.method993((byte) -121);
            long var127 = (long) class234.field3288.method943(arg0 + 1295851318);
            int var129 = class234.field3288.method941((byte) 125);
            long var130 = (var125 << 32) + var127;
            boolean var132 = false;
            int var133 = 0;
            while (true) {
                if (var133 >= 100) {
                    if (var129 <= 1) {
                        if (!(!class434.field6368 || class110.field1445) || class360.field5350) {
                            var132 = true;
                        } else if (class17.method124(true, var124)) {
                            var132 = true;
                        }
                    }
                    break;
                }
                if (class298.field4341[var133] == var130) {
                    var132 = true;
                    break;
                }
                var133++;
            }
            if (!var132 && class226.field3197 == 0) {
                class298.field4341[class292.field4172] = var130;
                class292.field4172 = (class292.field4172 + 1) % 100;
                String var134 = class210.method1301((byte) -44, class431.method2561((byte) 126, class234.field3288));
                if (var129 == 2) {
                    class40.method308(var134, arg0 + 5, null, 7, "<img=1>" + var124, -1, "<img=1>" + var123, 0);
                } else if (var129 == 1) {
                    class40.method308(var134, arg0 ^ 0x5, null, 7, "<img=0>" + var124, -1, "<img=0>" + var123, 0);
                } else {
                    class40.method308(var134, arg0 + 5, null, 3, var124, -1, var123, 0);
                }
            }
            class36.field563 = null;
            return true;
        } else if (class36.field563 == class166.field2167) {
            class388.method2332(2, class360.field5340);
            class36.field563 = null;
            return true;
        } else if (class505.field7705 == class36.field563) {
            int var135 = class234.field3288.method963(-119);
            int var136 = class234.field3288.method941((byte) 126);
            int var137 = class234.field3288.method993((byte) -92);
            int var138 = class234.field3288.method999(arg0 + 10);
            int var139 = class234.field3288.method963(arg0 - 110);
            boolean var140 = (var136 & 0x80) != 0;
            if ((var138 >> 30) != 0) {
                int var171 = var138 >> 28 & 0x3;
                int var172 = ((var138 & 0xFFFD7BC) >> 14) - class455.field6637;
                int var173 = (var138 & 0x3FFF) - class223.field3158;
                if (var172 >= 0 && var173 >= 0 && class362.field5442 > var172 && class203.field2813 > var173) {
                    int var174 = var172 * 128 + 64;
                    int var175 = var173 * 128 + 64;
                    int var176 = var171;
                    if (var171 < 3 && class352.method2137(var173, 64, var172)) {
                        var176 = var171 + 1;
                    }
                    class163 var177 = new class163(var139, 0, class263.field3748, var171, var176, var174, class103.method620(var171, var175, (byte) 20, var174) - var137, var175, var172, var172, var173, var173, var136);
                    class488.field7470.method2086((byte) -118, new class456(var177));
                }
            } else if ((var138 >> 29) != 0) {
                int var156 = var138 & 0xFFFF;
                class139 var157 = class504.field7697[var156];
                if (var157 != null) {
                    if (var139 == 65535) {
                        var139 = -1;
                    }
                    boolean var158 = true;
                    int var159 = var140 ? var157.field4263 : var157.field4269;
                    if (var139 != -1 && var159 != -1) {
                        if (var139 == var159) {
                            class366 var160 = class53.field820.method2427(var139, -17773);
                            if (var160.field5517 && var160.field5501 != -1) {
                                class168 var161 = class286.field4083.method2602(-24462, var160.field5501);
                                int var162 = var161.field2221;
                                if (var162 == 0 || var162 == 2) {
                                    var158 = false;
                                } else if (var162 == 1) {
                                    var158 = true;
                                }
                            }
                        } else {
                            class366 var163 = class53.field820.method2427(var139, arg0 ^ 0x4569);
                            class366 var164 = class53.field820.method2427(var159, -17773);
                            if (var163.field5501 != -1 && var164.field5501 != -1) {
                                class168 var165 = class286.field4083.method2602(-24462, var163.field5501);
                                class168 var166 = class286.field4083.method2602(-24462, var164.field5501);
                                if (var165.field2217 < var166.field2217) {
                                    var158 = false;
                                }
                            }
                        }
                    }
                    if (var158) {
                        if (var140) {
                            var157.field4263 = var139;
                            var157.field4197 = 0;
                            var157.field4194 = var136 & 0x7;
                            var157.field4235 = class263.field3748 + var135;
                            var157.field4266 = var137;
                            var157.field4220 = 1;
                            var157.field4218 = 0;
                            if (var157.field4235 > class263.field3748) {
                                var157.field4197 = -1;
                            }
                            if (var157.field4263 != -1 && class263.field3748 == var157.field4235) {
                                int var169 = class53.field820.method2427(var157.field4263, -17773).field5501;
                                if (var169 != -1) {
                                    class168 var170 = class286.field4083.method2602(-24462, var169);
                                    if (var170 != null && var170.field2219 != null) {
                                        class204.method1258(-1, 0, var157.field2959, false, var170, var157.field2966, var157.field2956);
                                    }
                                }
                            }
                        } else {
                            var157.field4269 = var139;
                            var157.field4183 = 0;
                            var157.field4187 = 0;
                            var157.field4190 = var136 & 0x7;
                            var157.field4191 = class263.field3748 + var135;
                            var157.field4189 = var137;
                            var157.field4258 = 1;
                            if (var157.field4191 > class263.field3748) {
                                var157.field4183 = -1;
                            }
                            if (var157.field4269 != -1 && class263.field3748 == var157.field4191) {
                                int var167 = class53.field820.method2427(var157.field4269, -17773).field5501;
                                if (var167 != -1) {
                                    class168 var168 = class286.field4083.method2602(arg0 - 24456, var167);
                                    if (var168 != null && var168.field2219 != null) {
                                        class204.method1258(-1, 0, var157.field2959, false, var168, var157.field2966, var157.field2956);
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (var138 >> 28 != 0) {
                int var141 = var138 & 0xFFFF;
                class313 var142;
                if (class156.field2047 == var141) {
                    var142 = class415.field6145;
                } else {
                    var142 = class262.field3742[var141];
                }
                if (var142 != null) {
                    if (var139 == 65535) {
                        var139 = -1;
                    }
                    boolean var143 = true;
                    int var144 = var140 ? var142.field4263 : var142.field4269;
                    if (var139 != -1 && var144 != -1) {
                        if (var139 == var144) {
                            class366 var149 = class53.field820.method2427(var139, -17773);
                            if (var149.field5517 && var149.field5501 != -1) {
                                class168 var150 = class286.field4083.method2602(-24462, var149.field5501);
                                int var151 = var150.field2221;
                                if (var151 == 0 || var151 == 2) {
                                    var143 = false;
                                } else if (var151 == 1) {
                                    var143 = true;
                                }
                            }
                        } else {
                            class366 var145 = class53.field820.method2427(var139, -17773);
                            class366 var146 = class53.field820.method2427(var144, -17773);
                            if (var145.field5501 != -1 && var146.field5501 != -1) {
                                class168 var147 = class286.field4083.method2602(-24462, var145.field5501);
                                class168 var148 = class286.field4083.method2602(-24462, var146.field5501);
                                if (var147.field2217 < var148.field2217) {
                                    var143 = false;
                                }
                            }
                        }
                    }
                    if (var143) {
                        if (var140) {
                            var142.field4266 = var137;
                            var142.field4220 = 1;
                            var142.field4218 = 0;
                            var142.field4197 = 0;
                            var142.field4235 = class263.field3748 + var135;
                            var142.field4194 = var136 & 0x7;
                            var142.field4263 = var139;
                            if (var142.field4235 > class263.field3748) {
                                var142.field4197 = -1;
                            }
                            if (var142.field4263 == 65535) {
                                var142.field4263 = -1;
                            }
                            if (var142.field4263 != -1 && class263.field3748 == var142.field4235) {
                                int var152 = class53.field820.method2427(var142.field4263, -17773).field5501;
                                if (var152 != -1) {
                                    class168 var153 = class286.field4083.method2602(-24462, var152);
                                    if (var153 != null && var153.field2219 != null) {
                                        class204.method1258(-1, 0, var142.field2959, class415.field6145 == var142, var153, var142.field2966, var142.field2956);
                                    }
                                }
                            }
                        } else {
                            var142.field4190 = var136 & 0x7;
                            var142.field4183 = 0;
                            var142.field4269 = var139;
                            var142.field4189 = var137;
                            var142.field4191 = class263.field3748 + var135;
                            var142.field4258 = 1;
                            var142.field4187 = 0;
                            if (var142.field4191 > class263.field3748) {
                                var142.field4183 = -1;
                            }
                            if (var142.field4269 == 65535) {
                                var142.field4269 = -1;
                            }
                            if (var142.field4269 != -1 && class263.field3748 == var142.field4191) {
                                int var154 = class53.field820.method2427(var142.field4269, -17773).field5501;
                                if (var154 != -1) {
                                    class168 var155 = class286.field4083.method2602(-24462, var154);
                                    if (var155 != null && var155.field2219 != null) {
                                        class204.method1258(-1, 0, var142.field2959, class415.field6145 == var142, var155, var142.field2966, var142.field2956);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class36.field563 = null;
            return true;
        } else if (class36.field563 == class161.field2096) {
            class145.field1876 = class495.method2975(arg0 ^ 0x6A, class234.field3288.method941((byte) 126));
            class36.field563 = null;
            return true;
        } else if (class36.field563 == class347.field5013) {
            int var178 = class234.field3288.method993((byte) -116);
            int var179 = class234.field3288.method999(4);
            int var180 = class234.field3288.method985(-60);
            if (class358.method2175((byte) -76, var180)) {
                class135.method845(var179, var178, false);
            }
            class36.field563 = null;
            return true;
        } else if (class36.field563 == class337.field4886) {
            class4.method28(arg0 ^ 0xFFFF9527);
            class36.field563 = null;
            return false;
        } else if (class503.field7681 == class36.field563) {
            int var181 = class234.field3288.method993((byte) -109);
            if (class358.method2175((byte) -107, var181)) {
                class484.method2828(0);
            }
            class36.field563 = null;
            return true;
        } else if (class36.field563 == class233.field3269) {
            class388.method2332(2, class7.field119);
            class36.field563 = null;
            return true;
        } else if (class36.field563 == class150.field1938) {
            int var182 = class234.field3288.method977((byte) 99);
            int var183 = class234.field3288.method993((byte) -105);
            int var184 = class234.field3288.method939(49510128);
            int var185 = class234.field3288.method955((byte) -123);
            if (class358.method2175((byte) -88, var183)) {
                class311 var186 = (class311) class213.field3010.method2310((byte) -108, (long) var182);
                if (var186 != null) {
                    class32.method264(var186.field4525 != var185, arg0 - 16318922, false, var186);
                }
                class75.method496(false, var185, (byte) 84, var184, var182);
            }
            class36.field563 = null;
            return true;
        } else if (class36.field563 == class121.field1591) {
            int var187 = class234.field3288.method955((byte) -128);
            int var188 = class234.field3288.method993((byte) -90);
            int var189 = class234.field3288.method977((byte) 99);
            if (class358.method2175((byte) -97, var188)) {
                class236.method1431(var187, arg0 + 5, var189);
            }
            class36.field563 = null;
            return true;
        } else if (class36.field563 == class283.field4038) {
            int var190 = class234.field3288.method950(186);
            String var191 = class234.field3288.method981(false);
            int var192 = class234.field3288.method963(-123);
            if (class358.method2175((byte) -79, var192)) {
                class406.method2430(var190, var191, 0);
            }
            class36.field563 = null;
            return true;
        } else if (client.field2663 == class36.field563) {
            class31.field522 = class234.field3288.method941((byte) 124);
            class398.field5874 = class234.field3288.method980(-19443);
            class36.field563 = null;
            return true;
        } else if (class36.field563 == class233.field3260) {
            int var193 = class234.field3288.method993((byte) -69);
            int var194 = class234.field3288.method977((byte) 99);
            if (class358.method2175((byte) -104, var193)) {
                class269.method1645(0, 5, var194, class156.field2047, (byte) 116);
            }
            class36.field563 = null;
            return true;
        } else if (class36.field563 == class157.field2059) {
            int var195 = class234.field3288.method963(-124);
            int var196 = class234.field3288.method993((byte) -62);
            int var197 = class234.field3288.method993((byte) -43);
            int var198 = class234.field3288.method999(4);
            if (class358.method2175((byte) -110, var196)) {
                class291.method1760((var195 << 16) + var197, 117, var198);
            }
            class36.field563 = null;
            return true;
        } else if (class409.field5998 == class36.field563) {
            int var199 = class234.field3288.method941((byte) 126);
            int var200 = class234.field3288.method939(49510128);
            if (var200 == 255) {
                var200 = -1;
                var199 = -1;
            }
            class163.method1032(var199, var200, (byte) -113);
            class36.field563 = null;
            return true;
        } else if (class444.field6474 == class36.field563) {
            boolean var201 = class234.field3288.method941((byte) 127) == 1;
            String var202 = class234.field3288.method981(false);
            String var203 = var202;
            if (var201) {
                var203 = class234.field3288.method981(false);
            }
            long var204 = class234.field3288.method975(-84);
            long var206 = (long) class234.field3288.method993((byte) -49);
            long var208 = (long) class234.field3288.method943(1295851312);
            int var210 = class234.field3288.method941((byte) 126);
            int var211 = class234.field3288.method993((byte) -64);
            long var212 = (var206 << 32) + var208;
            boolean var214 = false;
            int var215 = 0;
            while (true) {
                if (var215 >= 100) {
                    if (var210 <= 1 && class17.method124(true, var203)) {
                        var214 = true;
                    }
                    break;
                }
                if (class298.field4341[var215] == var212) {
                    var214 = true;
                    break;
                }
                var215++;
            }
            if (!var214 && class226.field3197 == 0) {
                class298.field4341[class292.field4172] = var212;
                class292.field4172 = (class292.field4172 + 1) % 100;
                String var216 = class195.field2749.method2212(var211, -455528836).method1306(arg0 + 96, class234.field3288);
                if (var210 == 2) {
                    class40.method308(var216, arg0 ^ 0x5, class340.method2065(0, var204), 20, "<img=1>" + var203, var211, "<img=1>" + var202, 0);
                } else if (var210 == 1) {
                    class40.method308(var216, -1, class340.method2065(0, var204), 20, "<img=0>" + var203, var211, "<img=0>" + var202, 0);
                } else {
                    class40.method308(var216, arg0 ^ 0x5, class340.method2065(0, var204), 20, var203, var211, var202, 0);
                }
            }
            class36.field563 = null;
            return true;
        } else if (class77.field1091 == class36.field563) {
            class388.method2332(arg0 ^ 0xFFFFFFF8, class361.field5399);
            class36.field563 = null;
            return true;
        } else if (class36.field563 == class319.field4691) {
            class157.method1002(30132, class86.field1182, class359.field5330, class234.field3288);
            class36.field563 = null;
            return true;
        } else if (class6.field114 == class36.field563) {
            int var217 = class234.field3288.method985(-99);
            byte var218 = class234.field3288.method994(128);
            class453.field6591.method110(var217, var218, true);
            class36.field563 = null;
            return true;
        } else if (class36.field563 == class202.field2810) {
            int var219 = class234.field3288.method941((byte) 123);
            int var220 = class234.field3288.method950(186);
            int var221 = class234.field3288.method980(-19443);
            class218.field3051[var219] = var220;
            class187.field2648[var219] = var221;
            class230.field3218[var219] = 1;
            int var222 = class378.field5650[var219] - 1;
            for (int var223 = 0; var223 < var222; var223++) {
                if (class54.field844[var223] <= var220) {
                    class230.field3218[var219] = var223 + 2;
                }
            }
            class442.field6454[class500.method3013(class172.field2351++, 31)] = var219;
            class36.field563 = null;
            return true;
        } else if (class36.field563 == class214.field3023) {
            class364.field5475 = class234.field3288.method941((byte) 126);
            class116.field1497 = class234.field3288.method949(-12754) << 3;
            class417.field6192 = class234.field3288.method949(arg0 ^ 0x31D4) << 3;
            class36.field563 = null;
            return true;
        } else if (class36.field563 == class358.field5310) {
            class388.method2332(arg0 ^ 0xFFFFFFF8, class506.field7715);
            class36.field563 = null;
            return true;
        } else if (class36.field563 == class234.field3287) {
            int var224 = class234.field3288.method950(186);
            class428.field6307 = class86.field1182.method325(0, var224);
            class36.field563 = null;
            return true;
        } else if (class467.field6749 == class36.field563) {
            String var225 = class234.field3288.method981(false);
            int var226 = class234.field3288.method993((byte) -99);
            String var227 = class195.field2749.method2212(var226, -455528836).method1306(-56, class234.field3288);
            class40.method308(var227, arg0 ^ 0x5, null, 19, var225, var226, var225, 0);
            class36.field563 = null;
            return true;
        } else if (class36.field563 == class236.field3316) {
            int var228 = class234.field3288.method941((byte) 124);
            int var229 = class234.field3288.method985(arg0 ^ 0xFFFFFF81);
            int var230 = class234.field3288.method985(-67);
            if (class358.method2175((byte) -71, var229)) {
                if (var228 == 2) {
                    class15.method113(arg0 + 31);
                }
                class465.field6737 = var230;
                class149.method920(var230, (byte) -117);
                class309.method1856(-78, false);
                class396.method2364(class465.field6737);
                for (int var231 = 0; var231 < 100; var231++) {
                    class61.field909[var231] = true;
                }
            }
            class36.field563 = null;
            return true;
        } else if (class481.field6936 == class36.field563) {
            String var232 = class234.field3288.method981(false);
            int var233 = class234.field3288.method993((byte) -87);
            int var234 = class234.field3288.method985(-84);
            if (class358.method2175((byte) -124, var234)) {
                class95.method584(false, var233, var232);
            }
            class36.field563 = null;
            return true;
        } else if (class86.field1170 == class36.field563) {
            class388.method2332(2, class503.field7678);
            class36.field563 = null;
            return true;
        } else if (class501.field7656 == class36.field563) {
            class388.method2332(2, class100.field1368);
            class36.field563 = null;
            return true;
        } else if (class482.field6954 == class36.field563) {
            int var235 = class234.field3288.method993((byte) -45);
            int var236 = class234.field3288.method993((byte) -109);
            int var237 = class234.field3288.method993((byte) -87);
            int var238 = class234.field3288.method993((byte) -115);
            if (class358.method2175((byte) -79, var235) && class181.field2591[var236] != null) {
                for (int var239 = var237; var239 < var238; var239++) {
                    int var240 = class234.field3288.method943(1295851312);
                    if (class181.field2591[var236].length > var239 && class181.field2591[var236][var239] != null) {
                        class181.field2591[var236][var239].field5195 = var240;
                    }
                }
            }
            class36.field563 = null;
            return true;
        } else if (class67.field993 == class36.field563) {
            int var241 = class234.field3288.method993((byte) -122);
            if (var241 == 65535) {
                var241 = -1;
            }
            int var242 = class234.field3288.method941((byte) 123);
            int var243 = class234.field3288.method993((byte) -80);
            int var244 = class234.field3288.method941((byte) 123);
            class508.method3061(var244, var242, arg0 - 67, var243, var241);
            class36.field563 = null;
            return true;
        } else if (class36.field563 == class131.field1668) {
            class388.method2332(2, class342.field4971);
            class36.field563 = null;
            return true;
        } else if (class36.field563 == class202.field2807) {
            boolean var245 = class234.field3288.method941((byte) 126) == 1;
            String var246 = class234.field3288.method981(false);
            String var247 = var246;
            if (var245) {
                var247 = class234.field3288.method981(false);
            }
            int var248 = class234.field3288.method941((byte) 126);
            int var249 = class234.field3288.method993((byte) -114);
            boolean var250 = false;
            if (var248 <= 1 && class17.method124(true, var247)) {
                var250 = true;
            }
            if (!var250 && class226.field3197 == 0) {
                String var251 = class195.field2749.method2212(var249, -455528836).method1306(arg0 ^ 0x26, class234.field3288);
                if (var248 == 2) {
                    class40.method308(var251, -1, null, 25, "<img=1>" + var247, var249, "<img=1>" + var246, 0);
                } else if (var248 == 1) {
                    class40.method308(var251, -1, null, 25, "<img=0>" + var247, var249, "<img=0>" + var246, 0);
                } else {
                    class40.method308(var251, -1, null, 25, var247, var249, var246, 0);
                }
            }
            class36.field563 = null;
            return true;
        } else if (class36.field563 == class146.field1891) {
            class117.field1503 = class234.field3288.method936((byte) -96);
            class28.field470 = class490.field7491;
            class36.field563 = null;
            return true;
        } else if (class36.field563 == class256.field3678) {
            class388.method2332(2, class248.field3548);
            class36.field563 = null;
            return true;
        } else if (class46.field700 == class36.field563) {
            int var252 = class234.field3288.method955((byte) -122);
            int var253 = class234.field3288.method977((byte) 99);
            int var254 = class234.field3288.method993((byte) -52);
            if (class358.method2175((byte) -92, var254)) {
                class221.method1360(arg0 - 3541, var252, var253);
            }
            class36.field563 = null;
            return true;
        } else if (class36.field563 == class137.field1794) {
            class226.field3193 = class359.field5330 > 2 ? class234.field3288.method981(false) : class420.field6204.method1220(2969, class81.field1122);
            class138.field1807 = class359.field5330 > 0 ? class234.field3288.method993((byte) -41) : -1;
            class36.field563 = null;
            if (class138.field1807 == 65535) {
                class138.field1807 = -1;
            }
            return true;
        } else if (class41.field627 == class36.field563) {
            int var255 = class234.field3288.method955((byte) -122);
            if (var255 == 65535) {
                var255 = -1;
            }
            int var256 = class234.field3288.method950(arg0 ^ 0xFFFFFF40);
            int var257 = class234.field3288.method985(arg0 ^ 0x74);
            if (var257 == 65535) {
                var257 = -1;
            }
            int var258 = class234.field3288.method963(arg0 - 120);
            int var259 = class234.field3288.method955((byte) -121);
            if (class358.method2175((byte) -82, var258)) {
                for (int var260 = var257; var260 <= var255; var260++) {
                    long var261 = ((long) var256 << 32) + (long) var260;
                    class489 var263 = (class489) class7.field130.method2310((byte) -76, var261);
                    class489 var264;
                    if (var263 != null) {
                        var264 = new class489(var263.field7487, var259);
                        var263.method536(false);
                    } else if (var260 == -1) {
                        var264 = new class489(class4.method25(var256, false).field5280.field7487, var259);
                    } else {
                        var264 = new class489(0, var259);
                    }
                    class7.field130.method2317(-1, var261, var264);
                }
            }
            class36.field563 = null;
            return true;
        } else if (class78.field1093 == class36.field563) {
            String var265 = class234.field3288.method981(false);
            String var266 = class210.method1301((byte) -44, class431.method2561((byte) 122, class234.field3288));
            class447.method2609(var266, 0, var265, 124, 6, var265);
            class36.field563 = null;
            return true;
        } else if (class36.field563 == class331.field4816) {
            int var267 = class234.field3288.method950(186);
            int var268 = class234.field3288.method955((byte) -125);
            int var269 = class234.field3288.method955((byte) -124);
            int var270 = class234.field3288.method985(91);
            int var271 = class234.field3288.method963(-115);
            if (class358.method2175((byte) -113, var268)) {
                class269.method1645(var270, 7, var267, var269 << 16 | var271, (byte) 116);
            }
            class36.field563 = null;
            return true;
        } else if (class36.field563 == class223.field3149) {
            boolean var272 = class234.field3288.method941((byte) 125) == 1;
            String var273 = class234.field3288.method981(false);
            String var274 = var273;
            if (var272) {
                var274 = class234.field3288.method981(false);
            }
            long var275 = (long) class234.field3288.method993((byte) -88);
            long var277 = (long) class234.field3288.method943(1295851312);
            int var279 = class234.field3288.method941((byte) 127);
            int var280 = class234.field3288.method993((byte) -123);
            long var281 = (var275 << 32) + var277;
            boolean var283 = false;
            int var284 = 0;
            while (true) {
                if (var284 >= 100) {
                    if (var279 <= 1 && class17.method124(true, var274)) {
                        var283 = true;
                    }
                    break;
                }
                if (class298.field4341[var284] == var281) {
                    var283 = true;
                    break;
                }
                var284++;
            }
            if (!var283 && class226.field3197 == 0) {
                class298.field4341[class292.field4172] = var281;
                class292.field4172 = (class292.field4172 + 1) % 100;
                String var285 = class195.field2749.method2212(var280, -455528836).method1306(arg0 + 95, class234.field3288);
                if (var279 == 2) {
                    class40.method308(var285, -1, null, 18, "<img=1>" + var274, var280, "<img=1>" + var273, 0);
                } else if (var279 == 1) {
                    class40.method308(var285, -1, null, 18, "<img=0>" + var274, var280, "<img=0>" + var273, 0);
                } else {
                    class40.method308(var285, arg0 + 5, null, 18, var274, var280, var273, 0);
                }
            }
            class36.field563 = null;
            return true;
        } else if (class453.field6589 == class36.field563) {
            int var286 = class234.field3288.method993((byte) -34);
            String var287 = class234.field3288.method981(false);
            Object[] var288 = new Object[var287.length() + 1];
            for (int var289 = var287.length() - 1; var289 >= 0; var289--) {
                if (var287.charAt(var289) == 's') {
                    var288[var289 + 1] = class234.field3288.method981(false);
                } else {
                    var288[var289 + 1] = Integer.valueOf(class234.field3288.method950(186));
                }
            }
            var288[0] = Integer.valueOf(class234.field3288.method950(186));
            if (class358.method2175((byte) -128, var286)) {
                class99 var290 = new class99();
                var290.field1346 = var288;
                class396.method2358(var290);
            }
            class36.field563 = null;
            return true;
        } else if (class36.field563 == class224.field3169) {
            int var291 = class234.field3288.method993((byte) -58);
            int var292 = class234.field3288.method941((byte) 123);
            int var293 = class234.field3288.method941((byte) 126);
            int var294 = class234.field3288.method941((byte) 124);
            int var295 = class234.field3288.method941((byte) 123);
            int var296 = class234.field3288.method993((byte) -70);
            if (class358.method2175((byte) -91, var291)) {
                class179.field2584[var292] = true;
                class219.field3078[var292] = var293;
                class242.field3473[var292] = var294;
                class208.field2927[var292] = var295;
                class484.field7017[var292] = var296;
            }
            class36.field563 = null;
            return true;
        } else if (class36.field563 == class141.field1845) {
            int var297 = class234.field3288.method993((byte) -119);
            if (var297 == 65535) {
                var297 = -1;
            }
            int var298 = class234.field3288.method950(186);
            int var299 = class234.field3288.method955((byte) -123);
            if (class358.method2175((byte) -105, var299)) {
                class269.method1645(-1, 2, var298, var297, (byte) 116);
            }
            class36.field563 = null;
            return true;
        } else {
            if (arg0 != -6) {
                field3761 = null;
            }
            if (class399.field5879 == class36.field563) {
                class388.method2332(2, class464.field6728);
                class36.field563 = null;
                return true;
            } else if (class463.field6716 == class36.field563) {
                int var300 = class234.field3288.method993((byte) -119);
                int var301 = class234.field3288.method941((byte) 127);
                boolean var302 = (var301 & 0x1) == 1;
                while (class234.field3288.field2018 < class359.field5330) {
                    int var303 = class234.field3288.method953((byte) -40);
                    int var304 = class234.field3288.method993((byte) -86);
                    int var305 = 0;
                    if (var304 != 0) {
                        var305 = class234.field3288.method941((byte) 127);
                        if (var305 == 255) {
                            var305 = class234.field3288.method950(186);
                        }
                    }
                    class235.method1424(var304 - 1, var305, var303, (byte) -55, var302, var300);
                }
                class508.field7745[class500.method3013(class437.field6392++, 31)] = var300;
                class36.field563 = null;
                return true;
            } else if (class36.field563 == class267.field3768) {
                class112.method659((byte) -19, true);
                class36.field563 = null;
                return true;
            } else if (class36.field563 == class199.field2775) {
                int var306 = class234.field3288.method993((byte) -128);
                int var307 = class234.field3288.method993((byte) -113);
                int var308 = class234.field3288.method963(arg0 - 113);
                if (class358.method2175((byte) -112, var307)) {
                    class390.method2351(0, var308, var306, (byte) -112);
                }
                class36.field563 = null;
                return true;
            } else if (class477.field6866 == class36.field563) {
                if (class465.field6737 != -1) {
                    class469.method2743(0, false, class465.field6737);
                }
                class36.field563 = null;
                return true;
            } else if (class36.field563 == class128.field1640) {
                class470.field6793 = class234.field3288.method941((byte) 127);
                class36.field563 = null;
                class28.field470 = class490.field7491;
                return true;
            } else if (class36.field563 == class20.field283) {
                int var309 = class234.field3288.method993((byte) -48);
                int var310 = class234.field3288.method941((byte) 125);
                boolean var311 = (var310 & 0x1) == 1;
                class331.method1991(var309, var311, (byte) -127);
                int var312 = class234.field3288.method993((byte) -52);
                for (int var313 = 0; var313 < var312; var313++) {
                    int var314 = class234.field3288.method985(-56);
                    int var315 = class234.field3288.method996(8);
                    if (var315 == 255) {
                        var315 = class234.field3288.method986((byte) 0);
                    }
                    class235.method1424(var314 - 1, var315, var313, (byte) -55, var311, var309);
                }
                class508.field7745[class500.method3013(31, class437.field6392++)] = var309;
                class36.field563 = null;
                return true;
            } else if (class55.field858 == class36.field563) {
                int var316 = class234.field3288.method985(arg0 ^ 0x68);
                int var317 = class234.field3288.method950(186);
                int var318 = class234.field3288.method939(49510128);
                if (class358.method2175((byte) -100, var316)) {
                    class56.method420(117, var318, var317);
                }
                class36.field563 = null;
                return true;
            } else if (class36.field563 == class209.field2948) {
                class441.method2578(arg0 - 64, class234.field3288.method981(false));
                class36.field563 = null;
                return true;
            } else if (class36.field563 == class256.field3677) {
                class417.field6192 = class234.field3288.method949(arg0 ^ 0x31D4) << 3;
                class364.field5475 = class234.field3288.method980(-19443);
                class116.field1497 = class234.field3288.method946(83) << 3;
                while (class359.field5330 > class234.field3288.field2018) {
                    class426 var319 = class491.method2954((byte) -98)[class234.field3288.method941((byte) 126)];
                    class388.method2332(arg0 + 8, var319);
                }
                class36.field563 = null;
                return true;
            } else if (class36.field563 == class259.field3707) {
                int var320 = class234.field3288.method993((byte) -103);
                int var321 = class234.field3288.method950(186);
                if (class358.method2175((byte) -97, var320)) {
                    class311 var322 = (class311) class213.field3010.method2310((byte) 99, (long) var321);
                    if (var322 != null) {
                        class32.method264(true, -16318928, false, var322);
                    }
                    if (class319.field4688 != null) {
                        class170.method1068(-121, class319.field4688);
                        class319.field4688 = null;
                    }
                }
                class36.field563 = null;
                return true;
            } else if (class472.field6814 == class36.field563) {
                int var323 = class234.field3288.method999(4);
                int var324 = class234.field3288.method955((byte) -126);
                int var325 = class234.field3288.method999(4);
                int var326 = class234.field3288.method993((byte) -78);
                if (var326 == 65535) {
                    var326 = -1;
                }
                if (class358.method2175((byte) -75, var324)) {
                    class345.method2081(var325, arg0 ^ 0xFFFFFFB7, var323, var326);
                    class361 var327 = class405.field5947.method1162(var326, arg0 + 6);
                    class495.method2976(var327.field5376, var327.field5370, (byte) -111, var325, var327.field5413);
                    class166.method1051(var325, (byte) 114, var327.field5364, var327.field5417, var327.field5400);
                }
                class36.field563 = null;
                return true;
            } else if (class459.field6682 == class36.field563) {
                String var328 = class234.field3288.method981(false);
                boolean var329 = class234.field3288.method941((byte) 124) == 1;
                String var330;
                if (var329) {
                    var330 = class234.field3288.method981(false);
                } else {
                    var330 = var328;
                }
                int var331 = class234.field3288.method993((byte) -76);
                byte var332 = class234.field3288.method946(111);
                boolean var333 = false;
                if (var332 == -128) {
                    var333 = true;
                }
                if (var333) {
                    if (class437.field6402 == 0) {
                        class36.field563 = null;
                        return true;
                    }
                    boolean var334 = false;
                    int var335;
                    for (var335 = 0; var335 < class437.field6402 && (!class216.field3033[var335].field1793.equals(var330) || class216.field3033[var335].field1790 != var331); var335++) {
                    }
                    if (var335 < class437.field6402) {
                        while (var335 < class437.field6402 - 1) {
                            class216.field3033[var335] = class216.field3033[var335 + 1];
                            var335++;
                        }
                        class437.field6402--;
                        class216.field3033[class437.field6402] = null;
                    }
                } else {
                    String var336 = class234.field3288.method981(false);
                    class137 var337 = new class137();
                    var337.field1796 = var328;
                    var337.field1793 = var330;
                    var337.field1786 = class258.method1605(var337.field1793, -104);
                    var337.field1790 = var331;
                    var337.field1791 = var332;
                    var337.field1795 = var336;
                    int var338;
                    for (var338 = class437.field6402 - 1; var338 >= 0; var338--) {
                        int var339 = class216.field3033[var338].field1786.compareTo(var337.field1786);
                        if (var339 == 0) {
                            class216.field3033[var338].field1790 = var331;
                            class216.field3033[var338].field1791 = var332;
                            class216.field3033[var338].field1795 = var336;
                            if (var330.equals(class415.field6145.field4592)) {
                                class48.field741 = var332;
                            }
                            class294.field4255 = class490.field7491;
                            class36.field563 = null;
                            return true;
                        }
                        if (var339 < 0) {
                            break;
                        }
                    }
                    if (class216.field3033.length <= class437.field6402) {
                        class36.field563 = null;
                        return true;
                    }
                    for (int var340 = class437.field6402 - 1; var340 > var338; var340--) {
                        class216.field3033[var340 + 1] = class216.field3033[var340];
                    }
                    if (class437.field6402 == 0) {
                        class216.field3033 = new class137[100];
                    }
                    class216.field3033[var338 + 1] = var337;
                    class437.field6402++;
                    if (var330.equals(class415.field6145.field4592)) {
                        class48.field741 = var332;
                    }
                }
                class294.field4255 = class490.field7491;
                class36.field563 = null;
                return true;
            } else if (class424.field6263 == class36.field563) {
                int var341 = class234.field3288.method953((byte) -40);
                int var342 = class234.field3288.method950(arg0 ^ 0xFFFFFF40);
                int var343 = class234.field3288.method941((byte) 124);
                String var344 = "";
                String var345 = var344;
                if ((var343 & 0x1) != 0) {
                    var344 = class234.field3288.method981(false);
                    if ((var343 & 0x2) == 0) {
                        var345 = var344;
                    } else {
                        var345 = class234.field3288.method981(false);
                    }
                }
                String var346 = class234.field3288.method981(false);
                if (var341 == 99) {
                    class465.method2724(-26334, var346);
                } else if (var345.equals("") || !class17.method124(true, var345)) {
                    class447.method2609(var346, var342, var345, -125, var341, var344);
                } else {
                    class36.field563 = null;
                    return true;
                }
                class36.field563 = null;
                return true;
            } else if (class384.field5715 == class36.field563) {
                class231.field3230 = class234.field3288.method941((byte) 123);
                class36.field563 = null;
                return true;
            } else if (class488.field7471 == class36.field563) {
                int var347 = class234.field3288.method963(-127);
                int var348 = class234.field3288.method977((byte) 99);
                int var349 = class234.field3288.method977((byte) 99);
                int var350 = class234.field3288.method993((byte) -54);
                if (class358.method2175((byte) -80, var347)) {
                    class269.method1645(var349, 5, var348, var350, (byte) 116);
                }
                class36.field563 = null;
                return true;
            } else if (class36.field563 == class193.field2736) {
                int var351 = class234.field3288.method936((byte) -96);
                int var352 = class234.field3288.method955((byte) -125);
                int var353 = class234.field3288.method977((byte) 99);
                if (class358.method2175((byte) -88, var352)) {
                    class493.method2967(var353, -4, var351);
                }
                class36.field563 = null;
                return true;
            } else if (class36.field563 == class187.field2651) {
                class388.method2332(2, class355.field5124);
                class36.field563 = null;
                return true;
            } else if (class471.field6801 == class36.field563) {
                class388.method2332(arg0 ^ 0xFFFFFFF8, class112.field1467);
                class36.field563 = null;
                return true;
            } else if (class48.field727 == class36.field563) {
                int var354 = class234.field3288.method999(4);
                int var355 = class234.field3288.method993((byte) -56);
                if (var355 == 65535) {
                    var355 = -1;
                }
                int var356 = class234.field3288.method963(arg0 - 110);
                if (class358.method2175((byte) -87, var356)) {
                    class269.method1645(-1, 1, var354, var355, (byte) 116);
                }
                class36.field563 = null;
                return true;
            } else if (class368.field5530 == class36.field563) {
                class112.method659((byte) -19, false);
                class36.field563 = null;
                return true;
            } else if (class36.field563 == class355.field5128) {
                class453.field6591.method106(arg0 - 66);
                class36.field563 = null;
                class219.field3073 += 32;
                return true;
            } else if (class36.field563 == class276.field3951) {
                if (class217.field3043 != null) {
                    class208.method1284(class118.field1533.field6877, -1, -1, false, -83);
                }
                byte[] var357 = new byte[class359.field5330];
                class234.field3288.method2220(0, var357, 0, class359.field5330);
                String var358 = class311.method1862(class359.field5330, 0, var357, 0);
                class423.method2523(class86.field1182, class293.field4174 == 1, true, var358, true);
                class36.field563 = null;
                return true;
            } else if (class36.field563 == class275.field3936) {
                class192.field2722 = 1;
                class36.field563 = null;
                class145.field1888 = class490.field7491;
                return true;
            } else if (class36.field563 == class292.field4169) {
                int var359 = class234.field3288.method985(105);
                int var360 = class234.field3288.method985(arg0 ^ 0x6D);
                int var361 = class234.field3288.method977((byte) 99);
                if (class358.method2175((byte) -101, var360)) {
                    class304.method1829((byte) 32, var359, var361);
                }
                class36.field563 = null;
                return true;
            } else if (class36.field563 == class235.field3302) {
                int var362 = class234.field3288.method941((byte) 125);
                if (class234.field3288.method941((byte) 125) == 0) {
                    class419.field6200[var362] = new class106();
                } else {
                    class234.field3288.field2018--;
                    class419.field6200[var362] = new class106(class234.field3288);
                }
                class36.field563 = null;
                class19.field269 = class490.field7491;
                return true;
            } else if (class36.field563 == class224.field3164) {
                for (int var363 = 0; var363 < class262.field3742.length; var363++) {
                    if (class262.field3742[var363] != null) {
                        class262.field3742[var363].field4215 = -1;
                    }
                }
                for (int var364 = 0; var364 < class504.field7697.length; var364++) {
                    if (class504.field7697[var364] != null) {
                        class504.field7697[var364].field4215 = -1;
                    }
                }
                class36.field563 = null;
                return true;
            } else if (class36.field563 == class15.field226) {
                byte var365 = class234.field3288.method949(-12754);
                int var366 = class234.field3288.method955((byte) -125);
                int var367 = class234.field3288.method955((byte) -127);
                if (class358.method2175((byte) -81, var367)) {
                    class135.method845(var365, var366, false);
                }
                class36.field563 = null;
                return true;
            } else if (class373.field5583 == class36.field563) {
                class136.field1754 = class234.field3288.method941((byte) 125);
                for (int var368 = 0; var368 < class136.field1754; var368++) {
                    class137.field1787[var368] = class234.field3288.method981(false);
                    class235.field3307[var368] = class234.field3288.method981(false);
                    if (class235.field3307[var368].equals("")) {
                        class235.field3307[var368] = class137.field1787[var368];
                    }
                    class149.field1932[var368] = class234.field3288.method981(false);
                    class239.field3346[var368] = class234.field3288.method981(false);
                    if (class239.field3346[var368].equals("")) {
                        class239.field3346[var368] = class149.field1932[var368];
                    }
                    class246.field3538[var368] = false;
                }
                class36.field563 = null;
                class145.field1888 = class490.field7491;
                return true;
            } else if (class83.field1129 == class36.field563) {
                int var369 = class234.field3288.method955((byte) -125);
                int var370 = class234.field3288.method996(8);
                if (class358.method2175((byte) -106, var369)) {
                    class360.field5351 = var370;
                }
                class36.field563 = null;
                return true;
            } else if (class36.field563 == class325.field4743) {
                int var371 = class234.field3288.method985(-26);
                int var372 = class234.field3288.method977((byte) 99);
                int var373 = class234.field3288.method985(92);
                if (var373 == 65535) {
                    var373 = -1;
                }
                if (class358.method2175((byte) -88, var371)) {
                    class451.method2625(var373, (byte) -84, var372);
                }
                class36.field563 = null;
                return true;
            } else if (class434.field6359 == class36.field563) {
                while (class359.field5330 > class234.field3288.field2018) {
                    boolean var384 = class234.field3288.method941((byte) 123) == 1;
                    String var385 = class234.field3288.method981(false);
                    String var386 = class234.field3288.method981(false);
                    int var387 = class234.field3288.method993((byte) -95);
                    int var388 = class234.field3288.method941((byte) 126);
                    String var389 = "";
                    boolean var390 = false;
                    if (var387 > 0) {
                        var389 = class234.field3288.method981(false);
                        var390 = class234.field3288.method941((byte) 126) == 1;
                    }
                    for (int var391 = 0; var391 < class296.field4317; var391++) {
                        if (var384) {
                            if (var386.equals(class281.field4019[var391])) {
                                class281.field4019[var391] = var385;
                                var385 = null;
                                class145.field1885[var391] = var386;
                                break;
                            }
                        } else if (var385.equals(class281.field4019[var391])) {
                            if (class285.field4076[var391] != var387) {
                                class285.field4076[var391] = var387;
                                if (var387 > 0) {
                                    class447.method2609(var385 + class51.field760.method1220(2969, class81.field1122), 0, "", arg0 ^ 0x3B, 5, "");
                                }
                                if (var387 == 0) {
                                    class447.method2609(var385 + class318.field4660.method1220(2969, class81.field1122), 0, "", 93, 5, "");
                                }
                            }
                            class145.field1885[var391] = var386;
                            class322.field4706[var391] = var389;
                            class68.field1009[var391] = var388;
                            class97.field1307[var391] = var390;
                            var385 = null;
                            break;
                        }
                    }
                    if (var385 != null && class296.field4317 < 200) {
                        class281.field4019[class296.field4317] = var385;
                        class145.field1885[class296.field4317] = var386;
                        class285.field4076[class296.field4317] = var387;
                        class322.field4706[class296.field4317] = var389;
                        class68.field1009[class296.field4317] = var388;
                        class97.field1307[class296.field4317] = var390;
                        class296.field4317++;
                    }
                }
                class145.field1888 = class490.field7491;
                class192.field2722 = 2;
                boolean var374 = false;
                int var375 = class296.field4317;
                while (var375 > 0) {
                    boolean var376 = true;
                    var375--;
                    for (int var377 = 0; var377 < var375; var377++) {
                        if (class285.field4076[var377] != class128.field1631 && class285.field4076[var377 + 1] == class128.field1631 || class285.field4076[var377] == 0 && class285.field4076[var377 + 1] != 0) {
                            int var378 = class285.field4076[var377];
                            class285.field4076[var377] = class285.field4076[var377 + 1];
                            class285.field4076[var377 + 1] = var378;
                            String var379 = class322.field4706[var377];
                            class322.field4706[var377] = class322.field4706[var377 + 1];
                            class322.field4706[var377 + 1] = var379;
                            String var380 = class281.field4019[var377];
                            class281.field4019[var377] = class281.field4019[var377 + 1];
                            class281.field4019[var377 + 1] = var380;
                            String var381 = class145.field1885[var377];
                            class145.field1885[var377] = class145.field1885[var377 + 1];
                            class145.field1885[var377 + 1] = var381;
                            int var382 = class68.field1009[var377];
                            class68.field1009[var377] = class68.field1009[var377 + 1];
                            class68.field1009[var377 + 1] = var382;
                            boolean var383 = class97.field1307[var377];
                            class97.field1307[var377] = class97.field1307[var377 + 1];
                            class97.field1307[var377 + 1] = var383;
                            var376 = false;
                        }
                    }
                    if (var376) {
                        break;
                    }
                }
                class36.field563 = null;
                return true;
            } else if (class36.field563 == class22.field293) {
                int var392 = class234.field3288.method980(-19443);
                int var393 = class234.field3288.method993((byte) -118);
                if (var393 == 65535) {
                    var393 = -1;
                }
                int var394 = class234.field3288.method996(arg0 ^ 0xFFFFFFF2);
                class198.method1234(var392, var394, arg0 + 6, var393);
                class36.field563 = null;
                return true;
            } else if (class378.field5656 == class36.field563) {
                int var395 = class234.field3288.method993((byte) -67);
                if (var395 == 65535) {
                    var395 = -1;
                }
                int var396 = class234.field3288.method980(-19443);
                int var397 = class234.field3288.method967(true);
                class191.method1201(var395, var396, 29899, var397);
                class36.field563 = null;
                return true;
            } else if (class36.field563 == class315.field4619) {
                int var398 = class234.field3288.method985(-123);
                int var399 = class234.field3288.method955((byte) -127);
                String var400 = class234.field3288.method981(false);
                if (class358.method2175((byte) -93, var399)) {
                    class95.method584(false, var398, var400);
                }
                class36.field563 = null;
                return true;
            } else if (class407.field5973 == class36.field563) {
                int var401 = class234.field3288.method950(186);
                int var402 = class234.field3288.method955((byte) -126);
                class453.field6591.method105(arg0 - 80, var402, var401);
                class36.field563 = null;
                return true;
            } else if (class56.field882 == class36.field563) {
                int var403 = class234.field3288.method993((byte) -127);
                int var404 = class234.field3288.method996(8);
                class453.field6591.method105(-114, var403, var404);
                class36.field563 = null;
                return true;
            } else if (class36.field563 == class206.field2846) {
                class388.method2332(2, class201.field2788);
                class36.field563 = null;
                return true;
            } else if (class473.field6840 == class36.field563) {
                class202.method1246((byte) -102);
                class36.field563 = null;
                return false;
            } else {
                class356.method2169(null, "T1 - " + (class36.field563 == null ? -1 : class36.field563.method2353(-2)) + "," + (class13.field203 == null ? -1 : class13.field203.method2353(-2)) + "," + (class357.field5300 == null ? -1 : class357.field5300.method2353(-2)) + " - " + class359.field5330, (byte) 34);
                class202.method1246((byte) -102);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(FBFF)I")
    public static final int method1633(float arg0, byte arg1, float arg2, float arg3) {
        int var4 = 122 / ((62 - arg1) / 46);
        field3758++;
        float var5 = (arg0 < 0.0F) ? -arg0 : arg0;
        float var6 = arg2 < 0.0F ? -arg2 : arg2;
        float var7 = (arg3 < 0.0F) ? -arg3 : arg3;
        if (var6 > var5 && var7 < var6) {
            return (arg2 > 0.0F) ? 0 : 1;
        } else if (var7 > var5 && var6 < var7) {
            return arg3 > 0.0F ? 2 : 3;
        } else if (arg0 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }
}
