import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public class class397 {

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "I")
    public int field5600;

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "I")
    private int field5601;

    @OriginalMember(owner = "client!uba", name = "j", descriptor = "Lbv;")
    private class279 field5609;

    @OriginalMember(owner = "client!uba", name = "c", descriptor = "I")
    public int field5602;

    @OriginalMember(owner = "client!uba", name = "e", descriptor = "Luba;")
    public static class397 field5604 = new class397(0, 3, class279.field3797);

    @OriginalMember(owner = "client!uba", name = "l", descriptor = "Luba;")
    public static class397 field5611 = new class397(1, 3, class279.field3797);

    @OriginalMember(owner = "client!uba", name = "m", descriptor = "Luba;")
    public static class397 field5612 = new class397(2, 4, class279.field3793);

    @OriginalMember(owner = "client!uba", name = "n", descriptor = "Luba;")
    public static class397 field5613 = new class397(3, 1, class279.field3797);

    @OriginalMember(owner = "client!uba", name = "o", descriptor = "Luba;")
    public static class397 field5614 = new class397(4, 2, class279.field3797);

    @OriginalMember(owner = "client!uba", name = "p", descriptor = "Luba;")
    public static class397 field5615 = new class397(5, 3, class279.field3797);

    @OriginalMember(owner = "client!uba", name = "q", descriptor = "Luba;")
    public static class397 field5616 = new class397(6, 4, class279.field3797);

    @OriginalMember(owner = "client!uba", name = "r", descriptor = "I")
    public static int field5617 = class565.method3314((byte) 17, 16);

    @OriginalMember(owner = "client!uba", name = "s", descriptor = "Ljk;")
    private static class585 field5618 = new class585(81, 7);

    @OriginalMember(owner = "client!uba", name = "t", descriptor = "[S")
    public static short[] field5619 = new short[256];

    @OriginalMember(owner = "client!uba", name = "u", descriptor = "Loe;")
    public static class183 field5620 = new class183();

    @OriginalMember(owner = "client!uba", name = "v", descriptor = "[I")
    public static int[] field5621 = new int[5];

    @OriginalMember(owner = "client!uba", name = "d", descriptor = "I")
    public static int field5603;

    @OriginalMember(owner = "client!uba", name = "f", descriptor = "I")
    public static int field5605;

    @OriginalMember(owner = "client!uba", name = "g", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!uba", name = "h", descriptor = "I")
    public static int field5607;

    @OriginalMember(owner = "client!uba", name = "i", descriptor = "I")
    public static int field5608;

    @OriginalMember(owner = "client!uba", name = "k", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(IB)Luba;", line = 3)
    public static final class397 method2397(int arg0, byte arg1) {
        field5607++;
        int var2 = 111 / ((75 - arg1) / 36);
        if (arg0 == 0) {
            return field5604;
        } else if (arg0 == 1) {
            return field5611;
        } else if (arg0 == 2) {
            return field5612;
        } else if (arg0 == 3) {
            return field5613;
        } else if (arg0 == 4) {
            return field5614;
        } else if (arg0 == 5) {
            return field5615;
        } else if (arg0 == 6) {
            return field5616;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(B)V", line = 75)
    public static void method2398(byte arg0) {
        field5612 = null;
        field5618 = null;
        field5615 = null;
        field5621 = null;
        field5616 = null;
        field5604 = null;
        if (arg0 >= -114) {
            field5619 = null;
        }
        field5620 = null;
        field5611 = null;
        field5613 = null;
        field5619 = null;
        field5614 = null;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(Z)V", line = 95)
    public static final void method2399(boolean arg0) {
        if (arg0) {
            return;
        }
        if (class636.field9116 >= 0) {
            long var1 = class301.method1787((byte) -117);
            class636.field9116 = (int) ((long) class636.field9116 - (var1 - class578.field8440));
            if (class636.field9116 <= 0) {
                class39.field727 = class165.field2025.field8874;
                class665.field9420 = class165.field2025.field8869;
                class579.field8449 = class165.field2025.field8863;
                class433.field6219 = class165.field2025.field8868;
                class682.field9754 = class165.field2025.field8873;
                class133.field1692 = class165.field2025.field8878;
                class502.field7008 = class165.field2025.field8871;
                class24.field581 = class165.field2025.field8875;
                class466.field6492 = class165.field2025.field8864;
                class594.field8591 = class165.field2025.field8860;
                class636.field9116 = -1;
            } else {
                int var3 = (class636.field9116 << 8) / class260.field3577;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                float var6 = 1.0F - var5;
                class466.field6492 = ((class658.field9346 & 0xFF00FF) * var3 + ((class165.field2025.field8864 & 0xFF00FF) * var4) & 0xFF00FF00) + ((class658.field9346 & 0xFF00) * var3 + ((class165.field2025.field8864 & 0xFF00) * var4) & 0xFF0000) >>> 8;
                class24.field581 = (class165.field2025.field8875 - class472.field6587) * var6 + class472.field6587;
                class682.field9754 = (class165.field2025.field8873 - class514.field7539) * var6 + class514.field7539;
                class594.field8591 = class512.field7509 * var3 + class165.field2025.field8860 * var4 >> 8;
                class133.field1692 = (class165.field2025.field8878 - class350.field4676) * var6 + class350.field4676;
                class39.field727 = (class165.field2025.field8874 - class156.field1914) * var6 + class156.field1914;
                class665.field9420 = ((class210.field2556 & 0xFF00FF) * var3 + (class165.field2025.field8869 & 0xFF00FF) * var4 & 0xFF00FF00) + ((class210.field2556 & 0xFF00) * var3 + (class165.field2025.field8869 & 0xFF00) * var4 & 0xFF0000) >>> 8;
                class579.field8449 = (class165.field2025.field8863 - class630.field9025) * var6 + class630.field9025;
                class433.field6219 = (class165.field2025.field8868 - class598.field8625) * var6 + class598.field8625;
                if (class37.field707 != class165.field2025.field8871) {
                    class502.field7008 = class377.field5073.method313(class37.field707, class165.field2025.field8871, var6, class502.field7008);
                }
            }
            class578.field8440 = var1;
        }
        field5610++;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(I)V", line = 165)
    public static final void method2400(int arg0) {
        field5603++;
        if (class242.field3323 > 1) {
            class345.field4534 = class59.field926;
            class242.field3323--;
        }
        if (class52.field847) {
            class52.field847 = false;
            class589.method3415((byte) 73);
            return;
        }
        if (arg0 != 13464) {
            field5618 = null;
        }
        if (!class361.field4805) {
            class47.method538(true);
        }
        for (int var1 = 0; var1 < 100 && class48.method539(true); var1++) {
        }
        if (class114.field1485 != 10) {
            return;
        }
        while (class227.method1380(87)) {
            class543 var2 = class299.method1780(class84.field1196, class463.field6469, arg0 - 13408);
            var2.field7872.method2281((byte) 58, 0);
            int var3 = var2.field7872.field5195;
            class574.method3364(var2.field7872, (byte) 78);
            var2.field7872.method2265(var2.field7872.field5195 - var3, (byte) 93);
            class511.method3028(arg0 ^ 0x29A2, var2);
        }
        if (class582.field8481 == null) {
            if (class301.method1787((byte) -100) >= class517.field7568) {
                class582.field8481 = class405.field5731.method46(arg0 ^ 0xFFFFCB12, class281.field3813.field4480);
            }
        } else if (class582.field8481.field8416 != -1) {
            class543 var4 = class299.method1780(class84.field1196, class165.field2016, 96);
            var4.field7872.method2261((byte) 54, class582.field8481.field8416);
            class511.method3028(arg0 ^ 0x29A2, var4);
            class582.field8481 = null;
            class517.field7568 = class301.method1787((byte) -55) + 30000L;
        }
        class471 var5 = (class471) class404.field5707.method1132((byte) -98);
        if (var5 != null || (class301.method1787((byte) -90) - 2000L) > class395.field5583) {
            class543 var6 = null;
            int var7 = 0;
            for (class471 var8 = (class471) class239.field3316.method1132((byte) 92); var8 != null && (var6 == null || var6.field7872.field5195 - var7 < 240); var8 = (class471) class239.field3316.method1134(8446)) {
                var8.method3045(true);
                int var9 = var8.method1733((byte) 126);
                if (var9 < -1) {
                    var9 = -1;
                } else if (var9 > 65534) {
                    var9 = 65534;
                }
                int var10 = var8.method1729(false);
                if (var10 < -1) {
                    var10 = -1;
                } else if (var10 > 65534) {
                    var10 = 65534;
                }
                if (class230.field3001 != var10 || class612.field8777 != var9) {
                    if (var6 == null) {
                        class533.field7783++;
                        var6 = class299.method1780(class84.field1196, class493.field6892, 93);
                        var6.field7872.method2281((byte) 58, 0);
                        var7 = var6.field7872.field5195;
                    }
                    int var11 = var10 - class230.field3001;
                    class230.field3001 = var10;
                    int var12 = var9 - class612.field8777;
                    class612.field8777 = var9;
                    int var13 = (int) ((var8.method1731(true) - class395.field5583) / 20L);
                    if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                        var11 += 32;
                        var12 += 32;
                        var6.field7872.method2261((byte) 127, (var13 << 12) + ((var11 << 6) + var12));
                    } else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
                        var6.field7872.method2281((byte) 58, var13 + 128);
                        var12 += 128;
                        var11 += 128;
                        var6.field7872.method2261((byte) 33, (var11 << 8) + var12);
                    } else if (var13 < 32) {
                        var6.field7872.method2281((byte) 58, var13 + 192);
                        if (var10 == 1 || var9 == -1) {
                            var6.field7872.method2233((byte) -61, Integer.MIN_VALUE);
                        } else {
                            var6.field7872.method2233((byte) -49, var9 << 16 | var10);
                        }
                    } else {
                        var6.field7872.method2261((byte) 104, var13 + 57344);
                        if (var10 == 1 || var9 == -1) {
                            var6.field7872.method2233((byte) -77, Integer.MIN_VALUE);
                        } else {
                            var6.field7872.method2233((byte) -78, var9 << 16 | var10);
                        }
                    }
                    class395.field5583 = var8.method1731(true);
                }
            }
            if (var6 != null) {
                var6.field7872.method2265(var6.field7872.field5195 - var7, (byte) -80);
                class511.method3028(7482, var6);
            }
        }
        if (var5 != null) {
            long var14 = (var5.method1731(true) - class70.field1076) / 50L;
            class70.field1076 = var5.method1731(true);
            if (var14 > 32767L) {
                var14 = 32767L;
            }
            int var16 = var5.method1733((byte) 88);
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            int var17 = var5.method1729(false);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            byte var18 = 0;
            if (var5.method1730(true) == 2) {
                var18 = 1;
            }
            class668.field9584++;
            int var19 = (int) var14;
            class543 var20 = class299.method1780(class84.field1196, class693.field9856, 102);
            var20.field7872.method2256(var18 << 15 | var19, 2);
            var20.field7872.method2267(var16 << 16 | var17, arg0 ^ 0xAF0BB490);
            class511.method3028(7482, var20);
        }
        if (class171.field2089 > 0) {
            class53.field860++;
            class543 var21 = class299.method1780(class84.field1196, class454.field6389, arg0 - 13368);
            var21.field7872.method2281((byte) 58, class171.field2089 * 3);
            for (int var22 = 0; var22 < class171.field2089; var22++) {
                class446 var23 = class391.field5240[var22];
                long var24 = (var23.method2635(false) - class564.field8155) / 50L;
                if (var24 > 65535L) {
                    var24 = 65535L;
                }
                class564.field8155 = var23.method2635(false);
                var21.field7872.method2281((byte) 58, var23.method2637(arg0 ^ 0x34E2));
                var21.field7872.method2261((byte) 65, (int) var24);
            }
            class511.method3028(7482, var21);
        }
        if (class588.field8527 > 0) {
            class588.field8527--;
        }
        if (class447.field6335 && class588.field8527 <= 0) {
            class447.field6335 = false;
            class638.field9129++;
            class588.field8527 = 20;
            class543 var26 = class299.method1780(class84.field1196, class602.field8671, 84);
            var26.field7872.method2226((int) class393.field5309 >> 3, (byte) -58);
            var26.field7872.method2226((int) class115.field1495 >> 3, (byte) -58);
            class511.method3028(7482, var26);
        }
        if (class81.field1169 != class190.field2319) {
            class81.field1169 = class190.field2319;
            class690.field9844++;
            class543 var27 = class299.method1780(class84.field1196, class501.field7001, arg0 - 13337);
            var27.field7872.method2281((byte) 58, class190.field2319 ? 1 : 0);
            class511.method3028(7482, var27);
        }
        if (!class553.field8029) {
            class524.field7690++;
            class543 var28 = class299.method1780(class84.field1196, class431.field6185, 109);
            var28.field7872.method2281((byte) 58, 0);
            int var29 = var28.field7872.field5195;
            class389 var30 = new class389(class673.method3832((byte) -104));
            class221.field2851.method1846((byte) -115, var30);
            var28.field7872.method2253(var30.field5205, (byte) -23, var30.field5195, 0);
            var28.field7872.method2265(var28.field7872.field5195 - var29, (byte) 61);
            class511.method3028(7482, var28);
            class553.field8029 = true;
        }
        if (class281.field3808 != null) {
            if (class586.field8507 == 2) {
                class324.method1888(-125);
            } else if (class586.field8507 == 3) {
                class178.method1111(2);
            }
        }
        if (class527.field7715) {
            class527.field7715 = false;
        } else {
            class16.field311 /= 2.0F;
        }
        if (class149.field1828) {
            class149.field1828 = false;
        } else {
            class59.field936 /= 2.0F;
        }
        class412.method2485((byte) -60);
        if (class114.field1485 != 10) {
            return;
        }
        class197.method1209(arg0 + 699894316);
        class62.method601((byte) 31);
        class590.method3423(-512);
        class234.field3127++;
        if (class234.field3127 > 750) {
            class589.method3415((byte) 73);
            return;
        }
        class275.method1668(8);
        class290.method1728(0);
        class516.method3054(true);
        for (int var31 = class410.field5804.method3186(true, arg0 ^ 0xFFFFCB67); var31 != -1; var31 = class410.field5804.method3186(false, -1)) {
            class222.method1356((byte) 109, var31);
            class585.field8499[class435.method2605(class631.field9083++, 31)] = var31;
        }
        for (class233 var32 = class637.method3636(false); var32 != null; var32 = class637.method3636(false)) {
            int var33 = var32.method1421(1322);
            int var34 = var32.method1424((byte) 70);
            if (var33 == 1) {
                class415.field5874[var34] = var32.field3114;
                class62.field999 |= class25.field591[var34];
                class224.field2913[class435.method2605(31, class253.field3451++)] = var34;
            } else if (var33 == 2) {
                class279.field3799[var34] = var32.field3119;
                class264.field3634[class435.method2605(31, class402.field5676++)] = var34;
            } else if (var33 == 3) {
                class17 var57 = class400.method2420((byte) -122, var34);
                if (!var32.field3119.equals(var57.field476)) {
                    var57.field476 = var32.field3119;
                    class314.method1836(var57, false);
                }
            } else if (var33 == 4) {
                class17 var35 = class400.method2420((byte) -123, var34);
                int var36 = var32.field3114;
                int var37 = var32.field3116;
                int var38 = var32.field3118;
                if (var35.field433 != var36 || var35.field342 != var37 || var35.field447 != var38) {
                    var35.field447 = var38;
                    var35.field342 = var37;
                    var35.field433 = var36;
                    class314.method1836(var35, false);
                }
            } else if (var33 == 5) {
                class17 var55 = class400.method2420((byte) -101, var34);
                if (var32.field3114 != var55.field382 || var32.field3114 == -1) {
                    var55.field382 = var32.field3114;
                    var55.field415 = 1;
                    var55.field385 = 0;
                    var55.field444 = 0;
                    class282 var56 = var55.field382 == -1 ? null : class195.field2367.method3273(var55.field382, 0);
                    if (var56 != null) {
                        class32.method402(var55.field444, -1830945624, var56);
                    }
                    class314.method1836(var55, false);
                }
            } else if (var33 == 6) {
                int var39 = var32.field3114;
                int var40 = (var39 & 0x7CFB) >> 10;
                int var41 = (var39 & 0x3F5) >> 5;
                int var42 = var39 & 0x1F;
                int var43 = (var41 << 11) + (var40 << 19) + (var42 << 3);
                class17 var44 = class400.method2420((byte) -112, var34);
                if (var44.field470 != var43) {
                    var44.field470 = var43;
                    class314.method1836(var44, false);
                }
            } else if (var33 == 7) {
                class17 var45 = class400.method2420((byte) -107, var34);
                boolean var46 = var32.field3114 == 1;
                if (var45.field461 != var46) {
                    var45.field461 = var46;
                    class314.method1836(var45, false);
                }
            } else if (var33 == 8) {
                class17 var47 = class400.method2420((byte) -112, var34);
                if (var32.field3114 != var47.field408 || var32.field3116 != var47.field454 || var32.field3118 != var47.field446) {
                    var47.field446 = var32.field3118;
                    var47.field454 = var32.field3116;
                    var47.field408 = var32.field3114;
                    if (var47.field412 != -1) {
                        if (var47.field399 > 0) {
                            var47.field446 = var47.field446 * 32 / var47.field399;
                        } else if (var47.field367 > 0) {
                            var47.field446 = var47.field446 * 32 / var47.field367;
                        }
                    }
                    class314.method1836(var47, false);
                }
            } else if (var33 == 9) {
                class17 var48 = class400.method2420((byte) -117, var34);
                if (var32.field3114 != var48.field412 || var32.field3116 != var48.field361) {
                    var48.field361 = var32.field3116;
                    var48.field412 = var32.field3114;
                    class314.method1836(var48, false);
                }
            } else if (var33 == 10) {
                class17 var49 = class400.method2420((byte) -97, var34);
                if (var32.field3114 != var49.field380 || var32.field3116 != var49.field398 || var32.field3118 != var49.field474) {
                    var49.field474 = var32.field3118;
                    var49.field380 = var32.field3114;
                    var49.field398 = var32.field3116;
                    class314.method1836(var49, false);
                }
            } else if (var33 == 11) {
                class17 var50 = class400.method2420((byte) -116, var34);
                var50.field460 = var50.field443 = var32.field3114;
                var50.field389 = 0;
                var50.field351 = var50.field413 = var32.field3116;
                var50.field403 = 0;
                class314.method1836(var50, false);
            } else if (var33 == 12) {
                class17 var53 = class400.method2420((byte) -95, var34);
                int var54 = var32.field3114;
                if (var53 != null && var53.field379 == 0) {
                    if ((var53.field343 - var53.field402) < var54) {
                        var54 = var53.field343 - var53.field402;
                    }
                    if (var54 < 0) {
                        var54 = 0;
                    }
                    if (var53.field480 != var54) {
                        var53.field480 = var54;
                        class314.method1836(var53, false);
                    }
                }
            } else if (var33 == 14) {
                class17 var52 = class400.method2420((byte) -107, var34);
                var52.field401 = var32.field3114;
            } else if (var33 == 15) {
                class147.field1798 = var32.field3116;
                class432.field6201 = var32.field3114;
                class276.field3775 = true;
            } else if (var33 == 16) {
                class17 var51 = class400.method2420((byte) -117, var34);
                var51.field348 = var32.field3114;
            }
        }
        if (class546.field7934 != 0) {
            class25.field595 += 20;
            if (class25.field595 >= 400) {
                class546.field7934 = 0;
            }
        }
        class456.field6422++;
        if (class417.field5903 != null) {
            class490.field6846++;
            if (class490.field6846 >= 15) {
                class314.method1836(class417.field5903, false);
                class417.field5903 = null;
            }
        }
        class418.field5916 = null;
        class161.field1984 = false;
        class112.field1431 = null;
        class504.field7033 = false;
        class657.method3717(null, (byte) 60, -1, -1);
        class455.method2703(null, -1, -1, arg0 - 13587);
        if (!class99.field1336) {
            class10.field99 = -1;
        }
        class399.method2416(0);
        class59.field926++;
        if (class295.field3977) {
            class551.field8011++;
            class543 var58 = class299.method1780(class84.field1196, class434.field6230, 87);
            var58.field7872.method2220((byte) 17, class423.field6024 << 28 | class423.field6021 << 14 | class116.field1508);
            class511.method3028(7482, var58);
            class295.field3977 = false;
        }
        while (true) {
            class143 var59;
            class17 var60;
            class17 var61;
            do {
                var59 = (class143) class195.field2363.method1137(-1);
                if (var59 == null) {
                    while (true) {
                        class143 var62;
                        class17 var63;
                        class17 var64;
                        do {
                            var62 = (class143) class281.field3812.method1137(-1);
                            if (var62 == null) {
                                while (true) {
                                    class143 var65;
                                    class17 var66;
                                    class17 var67;
                                    do {
                                        var65 = (class143) field5620.method1137(-1);
                                        if (var65 == null) {
                                            if (class112.field1431 == null) {
                                                class160.field1948 = 0;
                                            }
                                            if (class386.field5135 != null) {
                                                class377.method2192(2);
                                            }
                                            if (class37.field698 > 0 && class376.field5043.method1687(-7653, 82) && class376.field5043.method1687(-7653, 81) && class131.field1668 != 0) {
                                                int var68 = class206.field2472.field532 - class131.field1668;
                                                if (var68 < 0) {
                                                    var68 = 0;
                                                } else if (var68 > 3) {
                                                    var68 = 3;
                                                }
                                                class51.method557(class206.field2472.field2686[0] + class88.field1239, class206.field2472.field2689[0] + class36.field689, var68, -127);
                                            }
                                            class36.method420(arg0 - 13580);
                                            for (int var69 = 0; var69 < 5; var69++) {
                                                int var10002 = field5621[var69]++;
                                            }
                                            if (class62.field999 && (class301.method1787((byte) 54) - 60000L) > class1.field5) {
                                                class651.method3664((byte) -75);
                                            }
                                            for (class484 var70 = (class484) class1.field4.method2070((byte) -124); var70 != null; var70 = (class484) class1.field4.method2068(arg0 ^ 0xFFFFCCB7)) {
                                                if (class301.method1787((byte) -34) / 1000L - 5L > (long) var70.field6787) {
                                                    if (var70.field6782 > 0) {
                                                        class301.method1786("", var70.field6786 + class424.field6057.method2561(class370.field4980, arg0 - 13464), "", "", -1, 5, 0);
                                                    }
                                                    if (var70.field6782 == 0) {
                                                        class301.method1786("", var70.field6786 + class424.field6058.method2561(class370.field4980, arg0 ^ 0x3498), "", "", -1, 5, 0);
                                                    }
                                                    var70.method2564((byte) 2);
                                                }
                                            }
                                            class86.field1221++;
                                            if (class86.field1221 > 500) {
                                                class86.field1221 = 0;
                                                int var71 = (int) (Math.random() * 8.0D);
                                                if ((var71 & 0x1) == 1) {
                                                    class429.field6162 += class300.field4039;
                                                }
                                                if ((var71 & 0x2) == 2) {
                                                    class419.field5948 += class13.field231;
                                                }
                                                if ((var71 & 0x4) == 4) {
                                                    class177.field2180 += class67.field1035;
                                                }
                                            }
                                            if (class429.field6162 < -50) {
                                                class300.field4039 = 2;
                                            }
                                            if (class429.field6162 > 50) {
                                                class300.field4039 = -2;
                                            }
                                            if (class419.field5948 < -55) {
                                                class13.field231 = 2;
                                            }
                                            if (class177.field2180 < -40) {
                                                class67.field1035 = 1;
                                            }
                                            if (class419.field5948 > 55) {
                                                class13.field231 = -2;
                                            }
                                            if (class177.field2180 > 40) {
                                                class67.field1035 = -1;
                                            }
                                            class434.field6232++;
                                            if (class434.field6232 > 500) {
                                                class434.field6232 = 0;
                                                int var72 = (int) (Math.random() * 8.0D);
                                                if ((var72 & 0x2) == 2) {
                                                    class680.field9743 += class32.field659;
                                                }
                                                if ((var72 & 0x1) == 1) {
                                                    class186.field2277 += class13.field229;
                                                }
                                            }
                                            if (class186.field2277 < -60) {
                                                class13.field229 = 2;
                                            }
                                            if (class680.field9743 < -20) {
                                                class32.field659 = 1;
                                            }
                                            if (class186.field2277 > 60) {
                                                class13.field229 = -2;
                                            }
                                            class634.field9102++;
                                            if (class680.field9743 > 10) {
                                                class32.field659 = -1;
                                            }
                                            if (class634.field9102 > 50) {
                                                class611.field8765++;
                                                class543 var73 = class299.method1780(class84.field1196, class90.field1262, arg0 ^ 0x34F8);
                                                class511.method3028(7482, var73);
                                            }
                                            if (class163.field1997) {
                                                class231.method1396((byte) 92);
                                                class163.field1997 = false;
                                            }
                                            try {
                                                class238.method1462(arg0 ^ 0x34C9);
                                                return;
                                            } catch (IOException var74) {
                                                class589.method3415((byte) 73);
                                                return;
                                            }
                                        }
                                        var66 = var65.field1789;
                                        if (var66.field485 < 0) {
                                            break;
                                        }
                                        var67 = class400.method2420((byte) -111, var66.field469);
                                    } while (var67 == null || var67.field429 == null || var66.field485 >= var67.field429.length || var67.field429[var66.field485] != var66);
                                    class545.method3204(var65);
                                }
                            }
                            var63 = var62.field1789;
                            if (var63.field485 < 0) {
                                break;
                            }
                            var64 = class400.method2420((byte) -101, var63.field469);
                        } while (var64 == null || var64.field429 == null || var63.field485 >= var64.field429.length || var64.field429[var63.field485] != var63);
                        class545.method3204(var62);
                    }
                }
                var60 = var59.field1789;
                if (var60.field485 < 0) {
                    break;
                }
                var61 = class400.method2420((byte) -100, var60.field469);
            } while (var61 == null || var61.field429 == null || var60.field485 >= var61.field429.length || var61.field429[var60.field485] != var60);
            class545.method3204(var59);
        }
    }

    @OriginalMember(owner = "client!uba", name = "toString", descriptor = "()Ljava/lang/String;", line = 1018)
    public final String toString() {
        field5606++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(BI)V", line = 1027)
    public static final void method2401(byte arg0, int arg1) {
        if (arg0 <= 46) {
            field5613 = null;
        }
        field5608++;
        class233 var2 = class7.method44(arg1, 16, -1);
        var2.method1423(0);
    }

    @OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(IILbv;)V", line = 1047)
    private class397(int arg0, int arg1, class279 arg2) {
        this.field5600 = arg0;
        this.field5601 = arg1;
        this.field5609 = arg2;
        this.field5602 = this.field5609.field3788 * this.field5601;
        if (this.field5600 >= 16) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(IILrm;I)V", line = 1062)
    public static final void method2402(int arg0, int arg1, class377 arg2, int arg3) {
        field5605++;
        if (arg2 == null || class34.field679.field2232 == arg2) {
            return;
        }
        int var4 = arg2.field5063;
        int var5 = arg2.field5065;
        int var6 = arg2.field5062;
        int var7 = (int) arg2.field5064;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        long var8 = arg2.field5064;
        if (arg1 != -31964) {
            return;
        }
        if (var6 == 19) {
            class17 var10 = class346.method1981(var5, var4, (byte) -107);
            if (var10 != null) {
                class415.method2491(50);
                class158 var11 = client.method1659(var10);
                class566.method3319(var11.method997((byte) -128), 80, var10, var11.field1923);
                class52.field844 = class355.method2004((byte) -69, var10);
                if (class52.field844 == null) {
                    class52.field844 = "Null";
                }
                class255.field3461 = var10.field438 + "<col=ffffff>";
            }
            return;
        }
        if (var6 == 59 || var6 == 1007) {
            class469.method2752(var4, (byte) 111, var7, arg2.field5059, var5);
        }
        if (var6 == 6) {
            class546.field7934 = 2;
            class25.field595 = 0;
            class136.field1731 = arg3;
            class52.field848 = arg0;
            class463.field6467++;
            class543 var12 = class299.method1780(class84.field1196, class302.field4052, 97);
            var12.field7872.method2268(class376.field5043.method1687(-7653, 82) ? 1 : 0, arg1 ^ 0xFFFF8324);
            var12.field7872.method2226(class36.field689 + var4, (byte) -58);
            var12.field7872.method2256(var7, arg1 ^ 0xFFFF8326);
            var12.field7872.method2222(class88.field1239 + var5, arg1 ^ 0x38DE);
            class511.method3028(arg1 ^ 0xFFFF9E1E, var12);
            class96.method735(var5, (byte) -98, var4);
        }
        if (var6 == 5) {
            class433.field6211++;
            class25.field595 = 0;
            class136.field1731 = arg3;
            class52.field848 = arg0;
            class546.field7934 = 2;
            class543 var13 = class299.method1780(class84.field1196, field5618, 40);
            var13.field7872.method2268(class376.field5043.method1687(-7653, 82) ? 1 : 0, arg1 + 31964);
            var13.field7872.method2226((int) (var8 >>> 32) & Integer.MAX_VALUE, (byte) -58);
            var13.field7872.method2222(class88.field1239 + var5, -17414);
            var13.field7872.method2226(class36.field689 + var4, (byte) -58);
            class511.method3028(arg1 ^ 0xFFFF9E1E, var13);
            class562.method3290(var8, var4, var5, true);
        }
        if (var6 == 48) {
            class633 var14 = (class633) class522.field7662.method3678((long) var7, -126);
            if (var14 != null) {
                class52.field848 = arg0;
                class25.field595 = 0;
                class136.field1731 = arg3;
                class557 var15 = var14.field9097;
                class69.field1061++;
                class546.field7934 = 2;
                class543 var16 = class299.method1780(class84.field1196, class679.field9728, 101);
                var16.field7872.method2282(arg1 ^ 0x7CDA, class376.field5043.method1687(arg1 + 24311, 82) ? 1 : 0);
                var16.field7872.method2256(var7, 2);
                class511.method3028(7482, var16);
                class674.method3833(0, -1, var15.field2689[0], 0, -2, true, var15.method1284((byte) -124), var15.field2686[0], var15.method1284((byte) -124));
            }
        }
        if (var6 == 17) {
            if (class37.field698 > 0 && class376.field5043.method1687(-7653, 82) && class376.field5043.method1687(-7653, 81)) {
                class51.method557(class88.field1239 + var5, class36.field689 + var4, class206.field2472.field532, arg1 ^ 0x7CA1);
            } else {
                class25.field595 = 0;
                class136.field1731 = arg3;
                class574.field8415++;
                class52.field848 = arg0;
                class546.field7934 = 1;
                class543 var17 = class299.method1780(class84.field1196, class604.field8710, arg1 + 32076);
                var17.field7872.method2222(class88.field1239 + var5, arg1 ^ 0x38DE);
                var17.field7872.method2261((byte) 58, class36.field689 + var4);
                class511.method3028(7482, var17);
            }
        }
        if (var6 == 1002 || var6 == 1008 || var6 == 1012 || var6 == 1010 || var6 == 1004) {
            class137.method908(var4, var7, 59, var6);
        }
        if (var6 == 15) {
            class613 var18 = class184.field2252[var7];
            if (var18 != null) {
                class25.field595 = 0;
                class136.field1731 = arg3;
                class546.field7934 = 2;
                class637.field9125++;
                class52.field848 = arg0;
                class543 var19 = class299.method1780(class84.field1196, class136.field1728, 97);
                var19.field7872.method2281((byte) 58, class376.field5043.method1687(arg1 + 24311, 82) ? 1 : 0);
                var19.field7872.method2256(var7, 2);
                class511.method3028(7482, var19);
                class674.method3833(0, -1, var18.field2689[0], 0, -2, true, var18.method1284((byte) -124), var18.field2686[0], var18.method1284((byte) -124));
            }
        }
        if (var6 == 20) {
            class633 var20 = (class633) class522.field7662.method3678((long) var7, arg1 + 31842);
            if (var20 != null) {
                class557 var21 = var20.field9097;
                class136.field1731 = arg3;
                class52.field848 = arg0;
                class414.field5863++;
                class25.field595 = 0;
                class546.field7934 = 2;
                class543 var22 = class299.method1780(class84.field1196, class79.field1159, arg1 ^ 0xFFFF837F);
                var22.field7872.method2282(arg1 ^ 0x7CDA, class376.field5043.method1687(-7653, 82) ? 1 : 0);
                var22.field7872.method2226(class282.field3819, (byte) -58);
                var22.field7872.method2239(class391.field5243, (byte) -120);
                var22.field7872.method2256(class386.field5147, arg1 ^ 0xFFFF8326);
                var22.field7872.method2226(var7, (byte) -58);
                class511.method3028(arg1 + 39446, var22);
                class674.method3833(0, arg1 ^ 0x7CDB, var21.field2689[0], 0, -2, true, var21.method1284((byte) -124), var21.field2686[0], var21.method1284((byte) -124));
            }
        }
        if (var6 == 9) {
            class613 var23 = class184.field2252[var7];
            if (var23 != null) {
                class575.field8418++;
                class25.field595 = 0;
                class52.field848 = arg0;
                class136.field1731 = arg3;
                class546.field7934 = 2;
                class543 var24 = class299.method1780(class84.field1196, class232.field3074, 42);
                var24.field7872.method2261((byte) 105, var7);
                var24.field7872.method2268(class376.field5043.method1687(-7653, 82) ? 1 : 0, 0);
                class511.method3028(arg1 + 39446, var24);
                class674.method3833(0, -1, var23.field2689[0], 0, -2, true, var23.method1284((byte) -124), var23.field2686[0], var23.method1284((byte) -124));
            }
        }
        if (var6 == 25) {
            class52.field848 = arg0;
            class546.field7934 = 2;
            class25.field595 = 0;
            class237.field3185++;
            class136.field1731 = arg3;
            class543 var25 = class299.method1780(class84.field1196, class6.field56, 67);
            var25.field7872.method2222(class88.field1239 + var5, -17414);
            var25.field7872.method2281((byte) 58, class376.field5043.method1687(-7653, 82) ? 1 : 0);
            var25.field7872.method2256(class36.field689 + var4, 2);
            var25.field7872.method2256(var7, 2);
            class511.method3028(7482, var25);
            class96.method735(var5, (byte) -91, var4);
        }
        if (var6 == 57) {
            class137.field1734++;
            class136.field1731 = arg3;
            class52.field848 = arg0;
            class25.field595 = 0;
            class546.field7934 = 1;
            class543 var26 = class299.method1780(class84.field1196, class561.field8100, 86);
            var26.field7872.method2256(class88.field1239 + var5, 2);
            var26.field7872.method2222(class36.field689 + var4, -17414);
            var26.field7872.method2226(class282.field3819, (byte) -58);
            var26.field7872.method2267(class391.field5243, -1358200824);
            var26.field7872.method2222(class386.field5147, -17414);
            class511.method3028(arg1 ^ 0xFFFF9E1E, var26);
            class674.method3833(0, arg1 ^ 0x7CDB, var4, 0, -4, true, 1, var5, 1);
        }
        if (var6 == 3) {
            class17 var27 = class346.method1981(var5, var4, (byte) -119);
            if (var27 != null) {
                class249.method1526(var27, (byte) -99);
            }
        }
        if (var6 == 16) {
            class613 var28 = class184.field2252[var7];
            if (var28 != null) {
                class417.field5912++;
                class52.field848 = arg0;
                class546.field7934 = 2;
                class25.field595 = 0;
                class136.field1731 = arg3;
                class543 var29 = class299.method1780(class84.field1196, class342.field4516, 51);
                var29.field7872.method2268(class376.field5043.method1687(-7653, 82) ? 1 : 0, 0);
                var29.field7872.method2256(var7, 2);
                var29.field7872.method2226(class282.field3819, (byte) -58);
                var29.field7872.method2256(class386.field5147, 2);
                var29.field7872.method2233((byte) 113, class391.field5243);
                class511.method3028(7482, var29);
                class674.method3833(0, -1, var28.field2689[0], 0, -2, true, var28.method1284((byte) -124), var28.field2686[0], var28.method1284((byte) -124));
            }
        }
        if (var6 == 51) {
            class613 var30 = class184.field2252[var7];
            if (var30 != null) {
                class546.field7934 = 2;
                class136.field1731 = arg3;
                class25.field595 = 0;
                class306.field4067++;
                class52.field848 = arg0;
                class543 var31 = class299.method1780(class84.field1196, class600.field8654, arg1 + 32074);
                var31.field7872.method2237(-108, class376.field5043.method1687(arg1 ^ 0x613F, 82) ? 1 : 0);
                var31.field7872.method2226(var7, (byte) -58);
                class511.method3028(7482, var31);
                class674.method3833(0, -1, var30.field2689[0], 0, -2, true, var30.method1284((byte) -124), var30.field2686[0], var30.method1284((byte) -124));
            }
        }
        if (var6 == 21) {
            class633 var32 = (class633) class522.field7662.method3678((long) var7, -126);
            if (var32 != null) {
                class557 var33 = var32.field9097;
                class25.field595 = 0;
                class136.field1731 = arg3;
                class52.field848 = arg0;
                class546.field7934 = 2;
                class102.field1357++;
                class543 var34 = class299.method1780(class84.field1196, class295.field3979, 48);
                var34.field7872.method2222(var7, -17414);
                var34.field7872.method2282(-2, class376.field5043.method1687(-7653, 82) ? 1 : 0);
                class511.method3028(7482, var34);
                class674.method3833(0, -1, var33.field2689[0], 0, -2, true, var33.method1284((byte) -124), var33.field2686[0], var33.method1284((byte) -124));
            }
        }
        if (var6 == 49) {
            class613 var35 = class184.field2252[var7];
            if (var35 != null) {
                class25.field595 = 0;
                class191.field2331++;
                class546.field7934 = 2;
                class136.field1731 = arg3;
                class52.field848 = arg0;
                class543 var36 = class299.method1780(class84.field1196, class594.field8576, 35);
                var36.field7872.method2281((byte) 58, class376.field5043.method1687(-7653, 82) ? 1 : 0);
                var36.field7872.method2261((byte) 88, var7);
                class511.method3028(7482, var36);
                class674.method3833(0, arg1 + 31963, var35.field2689[0], 0, -2, true, var35.method1284((byte) -124), var35.field2686[0], var35.method1284((byte) -124));
            }
        }
        if (var6 == 4) {
            class613 var37 = class184.field2252[var7];
            if (var37 != null) {
                class136.field1731 = arg3;
                class25.field595 = 0;
                class546.field7934 = 2;
                class52.field848 = arg0;
                class549.field7967++;
                class543 var38 = class299.method1780(class84.field1196, class506.field7144, arg1 ^ 0xFFFF8308);
                var38.field7872.method2282(-2, class376.field5043.method1687(-7653, 82) ? 1 : 0);
                var38.field7872.method2226(var7, (byte) -58);
                class511.method3028(arg1 + 39446, var38);
                class674.method3833(0, -1, var37.field2689[0], 0, -2, true, var37.method1284((byte) -124), var37.field2686[0], var37.method1284((byte) -124));
            }
        }
        if (var6 == 23) {
            class136.field1731 = arg3;
            class502.field7015++;
            class546.field7934 = 2;
            class25.field595 = 0;
            class52.field848 = arg0;
            class543 var39 = class299.method1780(class84.field1196, class374.field5033, 73);
            var39.field7872.method2261((byte) 52, var7);
            var39.field7872.method2268(class376.field5043.method1687(-7653, 82) ? 1 : 0, arg1 ^ 0xFFFF8324);
            var39.field7872.method2226(class36.field689 + var4, (byte) -58);
            var39.field7872.method2222(class88.field1239 + var5, -17414);
            class511.method3028(arg1 ^ 0xFFFF9E1E, var39);
            class96.method735(var5, (byte) -121, var4);
        }
        if (var6 == 46) {
            class613 var40 = class184.field2252[var7];
            if (var40 != null) {
                class52.field848 = arg0;
                class25.field595 = 0;
                class136.field1731 = arg3;
                class546.field7934 = 2;
                class526.field7703++;
                class543 var41 = class299.method1780(class84.field1196, class321.field4227, 58);
                var41.field7872.method2237(-71, class376.field5043.method1687(-7653, 82) ? 1 : 0);
                var41.field7872.method2226(var7, (byte) -58);
                class511.method3028(7482, var41);
                class674.method3833(0, -1, var40.field2689[0], 0, -2, true, var40.method1284((byte) -124), var40.field2686[0], var40.method1284((byte) -124));
            }
        }
        if (var6 == 30) {
            class633 var42 = (class633) class522.field7662.method3678((long) var7, -120);
            if (var42 != null) {
                class25.field595 = 0;
                class557 var43 = var42.field9097;
                class276.field3779++;
                class546.field7934 = 2;
                class52.field848 = arg0;
                class136.field1731 = arg3;
                class543 var44 = class299.method1780(class84.field1196, class116.field1507, 55);
                var44.field7872.method2282(-2, class376.field5043.method1687(-7653, 82) ? 1 : 0);
                var44.field7872.method2226(var7, (byte) -58);
                class511.method3028(7482, var44);
                class674.method3833(0, arg1 ^ 0x7CDB, var43.field2689[0], 0, -2, true, var43.method1284((byte) -124), var43.field2686[0], var43.method1284((byte) -124));
            }
        }
        if (var6 == 1011) {
            class429.field6149++;
            class546.field7934 = 2;
            class25.field595 = 0;
            class52.field848 = arg0;
            class136.field1731 = arg3;
            class543 var45 = class299.method1780(class84.field1196, class670.field9628, 44);
            var45.field7872.method2261((byte) 82, var7);
            class511.method3028(7482, var45);
        }
        if (var6 == 44) {
            class244.field3333++;
            class25.field595 = 0;
            class546.field7934 = 2;
            class52.field848 = arg0;
            class136.field1731 = arg3;
            class543 var46 = class299.method1780(class84.field1196, class37.field701, arg1 + 32054);
            var46.field7872.method2233((byte) -65, class391.field5243);
            var46.field7872.method2261((byte) 112, Integer.MAX_VALUE & (int) (var8 >>> 32));
            var46.field7872.method2222(class36.field689 + var4, -17414);
            var46.field7872.method2261((byte) 103, class88.field1239 + var5);
            var46.field7872.method2261((byte) 115, class282.field3819);
            var46.field7872.method2256(class386.field5147, 2);
            var46.field7872.method2268(class376.field5043.method1687(-7653, 82) ? 1 : 0, 0);
            class511.method3028(7482, var46);
            class562.method3290(var8, var4, var5, true);
        }
        if (var6 == 11 && client.field3750 == null) {
            class79.method658(var4, var5, 17137);
            client.field3750 = class346.method1981(var5, var4, (byte) -125);
            class314.method1836(client.field3750, false);
        }
        if (var6 == 8) {
            class633 var47 = (class633) class522.field7662.method3678((long) var7, arg1 + 31841);
            if (var47 != null) {
                class557 var48 = var47.field9097;
                class136.field1731 = arg3;
                class546.field7934 = 2;
                class52.field848 = arg0;
                class27.field603++;
                class25.field595 = 0;
                class543 var49 = class299.method1780(class84.field1196, class239.field3314, arg1 ^ 0xFFFF8303);
                var49.field7872.method2256(var7, 2);
                var49.field7872.method2282(-2, class376.field5043.method1687(arg1 ^ 0x613F, 82) ? 1 : 0);
                class511.method3028(7482, var49);
                class674.method3833(0, arg1 + 31963, var48.field2689[0], 0, -2, true, var48.method1284((byte) -124), var48.field2686[0], var48.method1284((byte) -124));
            }
        }
        if (var6 == 1001) {
            class136.field1731 = arg3;
            class25.field595 = 0;
            class546.field7934 = 2;
            client.field3733++;
            class52.field848 = arg0;
            class543 var50 = class299.method1780(class84.field1196, class485.field6797, arg1 + 32038);
            var50.field7872.method2268(class376.field5043.method1687(-7653, 82) ? 1 : 0, 0);
            var50.field7872.method2256((int) (var8 >>> 32) & Integer.MAX_VALUE, 2);
            var50.field7872.method2256(class88.field1239 + var5, 2);
            var50.field7872.method2222(class36.field689 + var4, -17414);
            class511.method3028(7482, var50);
            class562.method3290(var8, var4, var5, true);
        }
        if (var6 == 45) {
            class25.field595 = 0;
            class201.field2431++;
            class546.field7934 = 2;
            class136.field1731 = arg3;
            class52.field848 = arg0;
            class543 var51 = class299.method1780(class84.field1196, class101.field1346, arg1 + 32063);
            var51.field7872.method2222(var5 + class88.field1239, -17414);
            var51.field7872.method2222(var7, -17414);
            var51.field7872.method2281((byte) 58, class376.field5043.method1687(-7653, 82) ? 1 : 0);
            var51.field7872.method2222(class36.field689 + var4, -17414);
            class511.method3028(7482, var51);
            class96.method735(var5, (byte) -83, var4);
        }
        if (var6 == 47) {
            class613 var52 = class184.field2252[var7];
            if (var52 != null) {
                class546.field7934 = 2;
                class52.field848 = arg0;
                class136.field1731 = arg3;
                class25.field595 = 0;
                class421.field5994++;
                class543 var53 = class299.method1780(class84.field1196, class219.field2830, 45);
                var53.field7872.method2281((byte) 58, class376.field5043.method1687(-7653, 82) ? 1 : 0);
                var53.field7872.method2256(var7, 2);
                class511.method3028(7482, var53);
                class674.method3833(0, arg1 ^ 0x7CDB, var52.field2689[0], 0, -2, true, var52.method1284((byte) -124), var52.field2686[0], var52.method1284((byte) -124));
            }
        }
        if (var6 == 58) {
            class220.field2849++;
            class136.field1731 = arg3;
            class52.field848 = arg0;
            class25.field595 = 0;
            class546.field7934 = 2;
            class543 var54 = class299.method1780(class84.field1196, class323.field4329, 59);
            var54.field7872.method2268(class376.field5043.method1687(-7653, 82) ? 1 : 0, 0);
            var54.field7872.method2226(class386.field5147, (byte) -58);
            var54.field7872.method2261((byte) 77, var5 + class88.field1239);
            var54.field7872.method2256(class36.field689 + var4, 2);
            var54.field7872.method2222(var7, -17414);
            var54.field7872.method2239(class391.field5243, (byte) -125);
            var54.field7872.method2226(class282.field3819, (byte) -58);
            class511.method3028(7482, var54);
            class96.method735(var5, (byte) -109, var4);
        }
        if (var6 == 2) {
            class25.field595 = 0;
            class330.field4393++;
            class136.field1731 = arg3;
            class546.field7934 = 2;
            class52.field848 = arg0;
            class543 var55 = class299.method1780(class84.field1196, class70.field1067, 99);
            var55.field7872.method2256(Integer.MAX_VALUE & (int) (var8 >>> 32), 2);
            var55.field7872.method2226(var4 + class36.field689, (byte) -58);
            var55.field7872.method2256(class88.field1239 + var5, 2);
            var55.field7872.method2268(class376.field5043.method1687(-7653, 82) ? 1 : 0, 0);
            class511.method3028(7482, var55);
            class562.method3290(var8, var4, var5, true);
        }
        if (var6 == 1009) {
            class136.field1731 = arg3;
            class25.field595 = 0;
            class546.field7934 = 2;
            class52.field848 = arg0;
            class457.field6450++;
            class543 var56 = class299.method1780(class84.field1196, class580.field8459, arg1 ^ 0xFFFF8346);
            var56.field7872.method2261((byte) 45, var7);
            class511.method3028(7482, var56);
        }
        if (var6 == 1006) {
            class52.field848 = arg0;
            class25.field595 = 0;
            class136.field1731 = arg3;
            class546.field7934 = 2;
            class633 var57 = (class633) class522.field7662.method3678((long) var7, -121);
            if (var57 != null) {
                class557 var58 = var57.field9097;
                class323 var59 = var58.field8052;
                if (var59.field4315 != null) {
                    var59 = var59.method1881(class410.field5804, (byte) 118);
                }
                if (var59 != null) {
                    class683.field9765++;
                    class543 var60 = class299.method1780(class84.field1196, class310.field4101, arg1 + 32080);
                    var60.field7872.method2261((byte) 124, var59.field4328);
                    class511.method3028(arg1 ^ 0xFFFF9E1E, var60);
                }
            }
        }
        if (var6 == 13) {
            class136.field1731 = arg3;
            class52.field848 = arg0;
            class318.field4199++;
            class546.field7934 = 2;
            class25.field595 = 0;
            class543 var61 = class299.method1780(class84.field1196, class540.field7848, 72);
            var61.field7872.method2226(class36.field689 + var4, (byte) -58);
            var61.field7872.method2256((int) (var8 >>> 32) & Integer.MAX_VALUE, arg1 ^ 0xFFFF8326);
            var61.field7872.method2282(-2, class376.field5043.method1687(arg1 + 24311, 82) ? 1 : 0);
            var61.field7872.method2256(class88.field1239 + var5, 2);
            class511.method3028(7482, var61);
            class562.method3290(var8, var4, var5, true);
        }
        if (var6 == 10) {
            class655.field9301++;
            class52.field848 = arg0;
            class136.field1731 = arg3;
            class546.field7934 = 2;
            class25.field595 = 0;
            class543 var62 = class299.method1780(class84.field1196, class655.field9304, arg1 ^ 0xFFFF831E);
            var62.field7872.method2282(-2, class376.field5043.method1687(-7653, 82) ? 1 : 0);
            var62.field7872.method2256((int) (var8 >>> 32) & Integer.MAX_VALUE, 2);
            var62.field7872.method2222(class36.field689 + var4, -17414);
            var62.field7872.method2261((byte) 116, class88.field1239 + var5);
            class511.method3028(arg1 + 39446, var62);
            class562.method3290(var8, var4, var5, true);
        }
        if (var6 == 60) {
            if (class37.field698 > 0 && class376.field5043.method1687(-7653, 82) && class376.field5043.method1687(arg1 + 24311, 81)) {
                class51.method557(class88.field1239 + var5, class36.field689 - -var4, class206.field2472.field532, -126);
            } else {
                class543 var63 = class228.method1385(var4, var7, var5, (byte) -30);
                if (var7 == 1) {
                    var63.field7872.method2281((byte) 58, -1);
                    var63.field7872.method2281((byte) 58, -1);
                    var63.field7872.method2261((byte) 106, (int) class115.field1495);
                    var63.field7872.method2281((byte) 58, 57);
                    var63.field7872.method2281((byte) 58, class186.field2277);
                    var63.field7872.method2281((byte) 58, class680.field9743);
                    var63.field7872.method2281((byte) 58, 89);
                    var63.field7872.method2261((byte) 33, class206.field2472.field530);
                    var63.field7872.method2261((byte) 59, class206.field2472.field531);
                    var63.field7872.method2281((byte) 58, 63);
                } else {
                    class136.field1731 = arg3;
                    class25.field595 = 0;
                    class52.field848 = arg0;
                    class546.field7934 = 1;
                }
                class511.method3028(7482, var63);
                class674.method3833(0, -1, var4, 0, -4, true, 1, var5, 1);
            }
        }
        if (var6 == 12) {
            class136.field1731 = arg3;
            class646.field9191++;
            class52.field848 = arg0;
            class546.field7934 = 2;
            class25.field595 = 0;
            class543 var64 = class299.method1780(class84.field1196, class507.field7420, 90);
            var64.field7872.method2226(var7, (byte) -58);
            var64.field7872.method2222(var5 + class88.field1239, -17414);
            var64.field7872.method2281((byte) 58, class376.field5043.method1687(-7653, 82) ? 1 : 0);
            var64.field7872.method2222(class36.field689 + var4, -17414);
            class511.method3028(7482, var64);
            class96.method735(var5, (byte) -105, var4);
        }
        if (var6 == 18) {
            class633 var65 = (class633) class522.field7662.method3678((long) var7, -124);
            if (var65 != null) {
                class25.field595 = 0;
                class534.field7796++;
                class136.field1731 = arg3;
                class52.field848 = arg0;
                class557 var66 = var65.field9097;
                class546.field7934 = 2;
                class543 var67 = class299.method1780(class84.field1196, class616.field8847, arg1 ^ 0xFFFF8317);
                var67.field7872.method2226(var7, (byte) -58);
                var67.field7872.method2281((byte) 58, class376.field5043.method1687(-7653, 82) ? 1 : 0);
                class511.method3028(arg1 ^ 0xFFFF9E1E, var67);
                class674.method3833(0, -1, var66.field2689[0], 0, -2, true, var66.method1284((byte) -124), var66.field2686[0], var66.method1284((byte) -124));
            }
        }
        if (var6 == 50) {
            class417.field5912++;
            class546.field7934 = 2;
            class25.field595 = 0;
            class136.field1731 = arg3;
            class52.field848 = arg0;
            class543 var68 = class299.method1780(class84.field1196, class342.field4516, 90);
            var68.field7872.method2268(class376.field5043.method1687(arg1 + 24311, 82) ? 1 : 0, 0);
            var68.field7872.method2256(class206.field2472.field2664, arg1 + 31966);
            var68.field7872.method2226(class282.field3819, (byte) -58);
            var68.field7872.method2256(class386.field5147, 2);
            var68.field7872.method2233((byte) -64, class391.field5243);
            class511.method3028(arg1 + 39446, var68);
        }
        if (var6 == 22) {
            class613 var69 = class184.field2252[var7];
            if (var69 != null) {
                class136.field1731 = arg3;
                class546.field7934 = 2;
                class25.field595 = 0;
                class617.field8855++;
                class52.field848 = arg0;
                class543 var70 = class299.method1780(class84.field1196, class115.field1494, arg1 + 32013);
                var70.field7872.method2268(class376.field5043.method1687(-7653, 82) ? 1 : 0, 0);
                var70.field7872.method2222(var7, -17414);
                class511.method3028(7482, var70);
                class674.method3833(0, -1, var69.field2689[0], 0, -2, true, var69.method1284((byte) -124), var69.field2686[0], var69.method1284((byte) -124));
            }
        }
        if (class99.field1336) {
            class415.method2491(115);
        }
        if (class417.field5903 != null && class490.field6846 == 0) {
            class314.method1836(class417.field5903, false);
        }
    }
}
