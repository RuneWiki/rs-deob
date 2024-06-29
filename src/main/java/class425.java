import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class425 extends class434 implements class303 {

    @OriginalMember(owner = "client!uu", name = "P", descriptor = "Z")
    private boolean field6171;

    @OriginalMember(owner = "client!uu", name = "S", descriptor = "S")
    private short field6174;

    @OriginalMember(owner = "client!uu", name = "gb", descriptor = "Z")
    private boolean field6188;

    @OriginalMember(owner = "client!uu", name = "fb", descriptor = "Z")
    private boolean field6187;

    @OriginalMember(owner = "client!uu", name = "T", descriptor = "B")
    private byte field6175;

    @OriginalMember(owner = "client!uu", name = "X", descriptor = "B")
    private byte field6179;

    @OriginalMember(owner = "client!uu", name = "db", descriptor = "B")
    private byte field6185;

    @OriginalMember(owner = "client!uu", name = "F", descriptor = "Z")
    private boolean field6161;

    @OriginalMember(owner = "client!uu", name = "G", descriptor = "Le;")
    public class285 field6162;

    @OriginalMember(owner = "client!uu", name = "K", descriptor = "Li;")
    private class197 field6166;

    @OriginalMember(owner = "client!uu", name = "cb", descriptor = "Z")
    public static boolean field6184 = false;

    @OriginalMember(owner = "client!uu", name = "M", descriptor = "Lew;")
    public static class270 field6168 = new class270(8);

    @OriginalMember(owner = "client!uu", name = "eb", descriptor = "Z")
    public static boolean field6186 = true;

    @OriginalMember(owner = "client!uu", name = "ib", descriptor = "Lrb;")
    public static class283 field6190 = new class283(67, -1);

    @OriginalMember(owner = "client!uu", name = "B", descriptor = "I")
    public static int field6157;

    @OriginalMember(owner = "client!uu", name = "C", descriptor = "I")
    public static int field6158;

    @OriginalMember(owner = "client!uu", name = "D", descriptor = "I")
    public static int field6159;

    @OriginalMember(owner = "client!uu", name = "E", descriptor = "I")
    public static int field6160;

    @OriginalMember(owner = "client!uu", name = "H", descriptor = "I")
    public static int field6163;

    @OriginalMember(owner = "client!uu", name = "I", descriptor = "I")
    public static int field6164;

    @OriginalMember(owner = "client!uu", name = "J", descriptor = "I")
    public static int field6165;

    @OriginalMember(owner = "client!uu", name = "L", descriptor = "I")
    public static int field6167;

    @OriginalMember(owner = "client!uu", name = "N", descriptor = "I")
    public static int field6169;

    @OriginalMember(owner = "client!uu", name = "O", descriptor = "I")
    public static int field6170;

    @OriginalMember(owner = "client!uu", name = "Q", descriptor = "I")
    public static int field6172;

    @OriginalMember(owner = "client!uu", name = "R", descriptor = "I")
    public static int field6173;

    @OriginalMember(owner = "client!uu", name = "U", descriptor = "I")
    public static int field6176;

    @OriginalMember(owner = "client!uu", name = "V", descriptor = "I")
    public static int field6177;

    @OriginalMember(owner = "client!uu", name = "W", descriptor = "I")
    public static int field6178;

    @OriginalMember(owner = "client!uu", name = "Y", descriptor = "I")
    public static int field6180;

    @OriginalMember(owner = "client!uu", name = "Z", descriptor = "I")
    public static int field6181;

    @OriginalMember(owner = "client!uu", name = "ab", descriptor = "I")
    public static int field6182;

    @OriginalMember(owner = "client!uu", name = "bb", descriptor = "I")
    public static int field6183;

    @OriginalMember(owner = "client!uu", name = "hb", descriptor = "I")
    public static int field6189;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lza;I)V")
    public final void method156(class295 arg0, int arg1) {
        ++field6182;
        Object var3 = null;
        if (arg1 > -109) {
            field6186 = true;
        }
        class197 var5;
        if (this.field6166 == null && this.field6161) {
            class135 var4 = this.method2535(arg0, 262144, true, 103);
            var5 = var4 != null ? var4.field2053 : null;
        } else {
            var5 = this.field6166;
            this.field6166 = null;
        }
        if (var5 != null) {
            class161.method1135(var5, this.field6179, super.field6284, super.field6287, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(Z)Z")
    public static final boolean method2534(boolean arg0) throws IOException {
        ++field6176;
        if (class104.field1702 == null) {
            return false;
        } else {
            int var1 = class104.field1702.method181(-1);
            if (var1 == 0) {
                return false;
            } else {
                if (class322.field4426 == null) {
                    if (class415.field6026) {
                        --var1;
                        class104.field1702.method177(1, class508.field7414.field4336, 0, 111);
                        class415.field6026 = false;
                        ++class301.field4112;
                    }
                    class508.field7414.field4360 = 0;
                    if (class508.field7414.method197(7632)) {
                        if (var1 == 0) {
                            return false;
                        }
                        --var1;
                        class104.field1702.method177(1, class508.field7414.field4336, 1, 106);
                        ++class301.field4112;
                    }
                    class415.field6026 = true;
                    class283[] var2 = class523.method3105(2);
                    int var3 = class508.field7414.method185((byte) -101);
                    if (var3 < 0 || var2.length <= var3) {
                        throw new IOException("invo:" + var3 + " ip:" + class508.field7414.field4360);
                    }
                    class322.field4426 = var2[var3];
                    class399.field5722 = class322.field4426.field3837;
                }
                if (~class399.field5722 == 0) {
                    if (~var1 >= -1) {
                        return false;
                    }
                    class104.field1702.method177(1, class508.field7414.field4336, 0, 110);
                    ++class301.field4112;
                    class399.field5722 = class508.field7414.field4336[0] & 255;
                    --var1;
                }
                if (class399.field5722 == -2) {
                    if (~var1 >= -2) {
                        return false;
                    }
                    class104.field1702.method177(2, class508.field7414.field4336, 0, 120);
                    class508.field7414.field4360 = 0;
                    var1 -= 2;
                    class399.field5722 = class508.field7414.method1844(-123);
                    class301.field4112 += 2;
                }
                if (~var1 > ~class399.field5722) {
                    return false;
                } else {
                    class508.field7414.field4360 = 0;
                    class104.field1702.method177(class399.field5722, class508.field7414.field4336, 0, 104);
                    class301.field4112 += class399.field5722;
                    class104.field1710 = 0;
                    class72.field1037 = class530.field7804;
                    class530.field7804 = class40.field601;
                    class40.field601 = class322.field4426;
                    if (class322.field4426 == class180.field2678) {
                        class529.method3127(32582, class323.field4433);
                        class322.field4426 = null;
                        return true;
                    } else if (class487.field7051 == class322.field4426) {
                        int var4 = class508.field7414.method1865(-78);
                        int var5 = class508.field7414.method1844(-113);
                        int var6 = class508.field7414.method1863(-1);
                        if (class238.method1454(var5, 111)) {
                            class248.method1482(var4, var6, 2);
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class426.field6202 == class322.field4426) {
                        int var7 = class508.field7414.method1844(-108);
                        int var8 = class508.field7414.method1842(123);
                        int var9 = class508.field7414.method1848((byte) 107);
                        int var10 = class508.field7414.method1828(true);
                        if (class238.method1454(var7, 120)) {
                            class421.method2506(var8, var10, 127, var9);
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class92.field1513 == class322.field4426) {
                        int var11 = class508.field7414.method1844(-102);
                        String var12 = class508.field7414.method1871(54);
                        Object[] var13 = new Object[1 + var12.length()];
                        for (int var14 = -1 + var12.length(); ~var14 <= -1; --var14) {
                            if (var12.charAt(var14) == 's') {
                                var13[var14 + 1] = class508.field7414.method1871(66);
                            } else {
                                var13[var14 + 1] = new Integer(class508.field7414.method1863(-1));
                            }
                        }
                        var13[0] = new Integer(class508.field7414.method1863(-1));
                        if (class238.method1454(var11, 107)) {
                            class414 var15 = new class414();
                            var15.field5900 = var13;
                            class47.method313(var15);
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class100.field1570) {
                        class206.field2963 = class508.field7414.method1845(-128);
                        class369.field5285 = class508.field7414.method1869(-68);
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class166.field2547) {
                        boolean var16 = ~class508.field7414.method1869(-75) == -2;
                        byte[] var17 = new byte[class399.field5722 + -1];
                        class508.field7414.method1887(0, var17, class399.field5722 + -1, true);
                        class14.method93(var17, var16, -3021);
                        class322.field4426 = null;
                        return true;
                    } else if (class411.field5853 == class322.field4426) {
                        int var18 = class508.field7414.method1876((byte) -125);
                        int var19 = var18 >> 2;
                        int var20 = var18 & 3;
                        int var21 = class153.field2356[var19];
                        int var22 = class508.field7414.method1865(-95);
                        if (~var22 == -65536) {
                            var22 = -1;
                        }
                        int var23 = class508.field7414.method1863(-1);
                        int var24 = (1049331614 & var23) >> 28;
                        int var25 = (var23 & 268420501) >> 14;
                        int var26 = 16383 & var23;
                        int var27 = var25 - class110.field1775;
                        int var28 = var26 - class399.field5727;
                        class300.method1746(var24, var20, var19, true, var21, var27, var22, var28);
                        class322.field4426 = null;
                        return true;
                    } else if (class42.field618 == class322.field4426) {
                        int var29 = class508.field7414.method1869(-94);
                        if (class508.field7414.method1869(-98) != 0) {
                            --class508.field7414.field4360;
                            class304.field4129[var29] = new class486(class508.field7414);
                        } else {
                            class304.field4129[var29] = new class486();
                        }
                        class296.field3996 = class365.field5245;
                        class322.field4426 = null;
                        return true;
                    } else if (class419.field6067 == class322.field4426) {
                        int var30 = class508.field7414.method1882(-18851);
                        int var31 = class508.field7414.method1837((byte) -18);
                        int var32 = class508.field7414.method1844(-101);
                        int var33 = class508.field7414.method1865(-124);
                        int var34 = class508.field7414.method1848((byte) 107);
                        if (class238.method1454(var33, 95)) {
                            class496.method2945(7, 0, var34, var32 | var31 << 16, var30);
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class420.field6077 == class322.field4426) {
                        class275.field3735 = class508.field7414.method1869(-104);
                        class492.field7132 = class365.field5245;
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class163.field2477) {
                        int var35 = class508.field7414.method1865(-95);
                        int var36 = class508.field7414.method1844(-112);
                        if (~var36 == -65536) {
                            var36 = -1;
                        }
                        int var37 = class508.field7414.method1846(false);
                        if (class238.method1454(var35, 108)) {
                            class191.method1269(Integer.MAX_VALUE, var37, var36);
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class201.field2919) {
                        int var38 = class508.field7414.method1837((byte) -18);
                        String var39 = class508.field7414.method1871(69);
                        int var40 = class508.field7414.method1863(-1);
                        if (class238.method1454(var38, 101)) {
                            class508.method3008(var40, (byte) -88, var39);
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class104.field1713) {
                        int var41 = class508.field7414.method1882(-18851);
                        int var42 = class508.field7414.method1836(4);
                        int var43 = class508.field7414.method1836(4);
                        if (class238.method1454(var41, 101)) {
                            class91 var44 = (class91) field6168.method1592((byte) -25, (long) var43);
                            class91 var45 = (class91) field6168.method1592((byte) -25, (long) var42);
                            if (var45 != null) {
                                class147.method1052(var45, false, var44 == null || var44.field1460 != var45.field1460, -4);
                            }
                            if (var44 != null) {
                                var44.method2791((byte) 112);
                                field6168.method1586(var44, (long) var42, 1);
                            }
                            class444 var46 = class22.method138(62, var43);
                            if (var46 != null) {
                                class151.method1093(var46, 117);
                            }
                            class444 var47 = class22.method138(53, var42);
                            if (var47 != null) {
                                class151.method1093(var47, 125);
                                class345.method2078(true, var47, 0);
                            }
                            if (~class236.field3268 != 0) {
                                class264.method1554((byte) 76, 1, class236.field3268);
                            }
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class122.field1898) {
                        int var48 = class508.field7414.method1869(-65);
                        int var49 = var48 >> 5;
                        int var50 = 31 & var48;
                        if (~var50 == -1) {
                            class413.field5884[var49] = null;
                            class322.field4426 = null;
                            return true;
                        } else {
                            class449 var51 = new class449();
                            var51.field6572 = var50;
                            var51.field6577 = class508.field7414.method1869(-127);
                            if (~var51.field6577 <= -1 && class443.field6382.length > var51.field6577) {
                                if (~var51.field6572 != -2 && ~var51.field6572 != -11) {
                                    if (~var51.field6572 <= -3 && var51.field6572 <= 6) {
                                        if (~var51.field6572 == -3) {
                                            var51.field6571 = 64;
                                            var51.field6574 = 64;
                                        }
                                        if (~var51.field6572 == -4) {
                                            var51.field6574 = 64;
                                            var51.field6571 = 0;
                                        }
                                        if (var51.field6572 == 4) {
                                            var51.field6571 = 128;
                                            var51.field6574 = 64;
                                        }
                                        if (~var51.field6572 == -6) {
                                            var51.field6571 = 64;
                                            var51.field6574 = 0;
                                        }
                                        if (~var51.field6572 == -7) {
                                            var51.field6574 = 128;
                                            var51.field6571 = 64;
                                        }
                                        var51.field6572 = 2;
                                        var51.field6573 = class508.field7414.method1869(-92);
                                        var51.field6571 += class508.field7414.method1844(-102) + -class110.field1775 << 7;
                                        var51.field6574 += class508.field7414.method1844(-104) + -class399.field5727 << 7;
                                        var51.field6578 = class508.field7414.method1869(-122) << 0;
                                        var51.field6580 = class508.field7414.method1844(-112);
                                    }
                                } else {
                                    var51.field6581 = class508.field7414.method1844(-106);
                                    class508.field7414.field4360 += 6;
                                }
                                var51.field6575 = class508.field7414.method1844(-118);
                                if (~var51.field6575 == -65536) {
                                    var51.field6575 = -1;
                                }
                                class413.field5884[var49] = var51;
                            }
                            class322.field4426 = null;
                            return true;
                        }
                    } else if (class467.field6746 == class322.field4426) {
                        class508.field7414.field4360 += 28;
                        if (class508.field7414.method1841(-2843)) {
                            class419.method2476(true, class508.field7414.field4360 - 28, class508.field7414);
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class266.field3578) {
                        int var52 = class508.field7414.method1882(-18851);
                        int var53 = class508.field7414.method1837((byte) -18);
                        int var54 = class508.field7414.method1882(-18851);
                        int var55 = class508.field7414.method1865(-81);
                        int var56 = class508.field7414.method1863(-1);
                        if (class238.method1454(var53, 114)) {
                            class475.method2788(var56, var55, var52, 524287, var54);
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class323.field4428 == class322.field4426) {
                        class529.method3127(32582, class265.field3567);
                        class322.field4426 = null;
                        return true;
                    } else if (class502.field7341 == class322.field4426) {
                        class521.method3101(arg0);
                        class322.field4426 = null;
                        return false;
                    } else if (class322.field4426 == class32.field482) {
                        class529.method3127(32582, class122.field1890);
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class153.field2349) {
                        int var57 = class508.field7414.method1863(-1);
                        int var58 = class508.field7414.method1844(-101);
                        if (class238.method1454(var58, 103)) {
                            class496.method2945(5, 0, var57, class484.field6972, 0);
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class53.field763 == class322.field4426) {
                        int var59 = class508.field7414.method1882(-18851);
                        int var60 = class508.field7414.method1845(-128);
                        int var61 = class508.field7414.method1865(-84);
                        int var62 = class508.field7414.method1848((byte) 107);
                        if (class238.method1454(var59, 105)) {
                            class91 var63 = (class91) field6168.method1592((byte) -25, (long) var62);
                            if (var63 != null) {
                                class147.method1052(var63, false, var63.field1460 != var61, -4);
                            }
                            class317.method1827(var61, var60, var62, false, 1);
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class125.field1942) {
                        int var64 = class508.field7414.method1844(-105);
                        int var65 = class508.field7414.method1863(-1);
                        if (class238.method1454(var64, 115)) {
                            class91 var66 = (class91) field6168.method1592((byte) -25, (long) var65);
                            if (var66 != null) {
                                class147.method1052(var66, false, true, -4);
                            }
                            if (class389.field5616 != null) {
                                class151.method1093(class389.field5616, 114);
                                class389.field5616 = null;
                            }
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class485.field6976 == class322.field4426) {
                        int var67 = class508.field7414.method1844(-127);
                        int var68 = class508.field7414.method1869(-97);
                        int var69 = class508.field7414.method1869(-95);
                        int var70 = class508.field7414.method1844(-111) << 0;
                        int var71 = class508.field7414.method1869(-78);
                        int var72 = class508.field7414.method1869(-109);
                        if (class238.method1454(var67, 109)) {
                            class423.method2530(var72, var68, 16631, var71, var70, var69);
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class503.field7361 == class322.field4426) {
                        class529.method3127(32582, class230.field3220);
                        class322.field4426 = null;
                        return true;
                    } else if (class407.field5771 == class322.field4426) {
                        if (class222.method1384(0, class494.field7155)) {
                            class104.field1705 = (int) (2.5F * (float) class508.field7414.method1844(-127));
                        } else {
                            class104.field1705 = 30 * class508.field7414.method1844(-113);
                        }
                        class492.field7132 = class365.field5245;
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class10.field119) {
                        class422.field6145 = class508.field7414.method1862(80) << 3;
                        class255.field3477 = class508.field7414.method1845(-128);
                        class185.field2744 = class508.field7414.method1834(-89) << 3;
                        for (class292 var73 = (class292) class484.field6966.method1588(117); var73 != null; var73 = (class292) class484.field6966.method1582(-106)) {
                            int var75 = (int) (var73.field6883 >> 28 & 3L);
                            int var76 = (int) (var73.field6883 & 16383L);
                            int var77 = -class110.field1775 + var76;
                            int var78 = (int) (var73.field6883 >> 14 & 16383L);
                            int var79 = var78 - class399.field5727;
                            if (class255.field3477 == var75 && var77 >= class185.field2744 && ~(class185.field2744 + 8) < ~var77 && ~class422.field6145 >= ~var79 && class422.field6145 + 8 > var79) {
                                var73.method2791((byte) 112);
                                if (var77 >= 0 && var79 >= 0 && class9.field111 > var77 && ~class192.field2809 < ~var79) {
                                    class4.method26(var79, var77, (byte) 0, class255.field3477);
                                }
                            }
                        }
                        for (class65 var74 = (class65) class463.field6690.method3137(0); var74 != null; var74 = (class65) class463.field6690.method3132(0)) {
                            if (class185.field2744 <= var74.field931 && var74.field931 < class185.field2744 + 8 && ~var74.field929 <= ~class422.field6145 && var74.field929 < class422.field6145 + 8 && class255.field3477 == var74.field935) {
                                var74.field940 = 0;
                            }
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class163.field2440) {
                        int var80 = class508.field7414.method1863(-1);
                        int var81 = class508.field7414.method1844(-112);
                        int var82 = class508.field7414.method1837((byte) -18);
                        if (class238.method1454(var82, 107)) {
                            class13.method91(false, var80, var81);
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class339.field4918 == class322.field4426) {
                        class384.method2276(0, false);
                        class322.field4426 = null;
                        return false;
                    } else if (class322.field4426 == class146.field2209) {
                        int var83 = class508.field7414.method1844(-109);
                        if (~var83 == -65536) {
                            var83 = -1;
                        }
                        int var84 = class508.field7414.method1869(-125);
                        int var85 = class508.field7414.method1844(-102);
                        int var86 = class508.field7414.method1869(-118);
                        class431.method2558(var86, var85, -1, var83, var84);
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class316.field4294) {
                        class529.method3127(32582, class499.field7294);
                        class322.field4426 = null;
                        return true;
                    } else if (class519.field7635 == class322.field4426) {
                        int var87 = class508.field7414.method1837((byte) -18);
                        int var88 = class508.field7414.method1882(-18851);
                        String var89 = class508.field7414.method1871(112);
                        if (class238.method1454(var87, 95)) {
                            class19.method130(var88, -26980, var89);
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class373.field5355 == class322.field4426) {
                        int var90 = class508.field7414.method1843(1);
                        int var91 = class508.field7414.method1836(4);
                        int var92 = class508.field7414.method1837((byte) -18);
                        if (class238.method1454(var92, 118)) {
                            class217.method1365(var91, 4096, var90);
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class444.field6494 == class322.field4426) {
                        int var93 = class508.field7414.method1845(-128);
                        int var94 = class508.field7414.method1844(-113);
                        int var95 = class508.field7414.method1863(-1);
                        if (class238.method1454(var94, 106)) {
                            class333.method2044((byte) -48, var93, var95);
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class50.field727 == class322.field4426) {
                        class68.field976 = class365.field5245;
                        if (~class399.field5722 == -1) {
                            class167.field2554 = 0;
                            class347.field4994 = null;
                            class372.field5340 = null;
                            class511.field7488 = null;
                            class322.field4426 = null;
                            return true;
                        } else {
                            class511.field7488 = class508.field7414.method1871(118);
                            boolean var96 = ~class508.field7414.method1869(-128) == -2;
                            if (var96) {
                                class508.field7414.method1871(70);
                            }
                            long var97 = class508.field7414.method1886(false);
                            class372.field5340 = class468.method2723(var97, -99);
                            class366.field5258 = class508.field7414.method1894(-2018);
                            int var99 = class508.field7414.method1869(-94);
                            if (~var99 == -256) {
                                class322.field4426 = null;
                                return true;
                            } else {
                                class167.field2554 = var99;
                                class244[] var100 = new class244[100];
                                for (int var101 = 0; ~var101 > ~class167.field2554; ++var101) {
                                    var100[var101] = new class244();
                                    var100[var101].field3343 = class508.field7414.method1871(112);
                                    boolean var107 = class508.field7414.method1869(-93) == 1;
                                    if (!var107) {
                                        var100[var101].field3345 = var100[var101].field3343;
                                    } else {
                                        var100[var101].field3345 = class508.field7414.method1871(44);
                                    }
                                    var100[var101].field3342 = class75.method585(var100[var101].field3345, -1);
                                    var100[var101].field3348 = class508.field7414.method1844(-109);
                                    var100[var101].field3346 = class508.field7414.method1894(-2018);
                                    var100[var101].field3347 = class508.field7414.method1871(6);
                                    if (var100[var101].field3345.equals(class81.field1158.field7036)) {
                                        class428.field6219 = var100[var101].field3346;
                                    }
                                }
                                boolean var102 = false;
                                int var103 = class167.field2554;
                                while (~var103 < -1) {
                                    --var103;
                                    boolean var104 = true;
                                    for (int var105 = 0; var105 < var103; ++var105) {
                                        if (~var100[var105].field3342.compareTo(var100[var105 + 1].field3342) < -1) {
                                            class244 var106 = var100[var105];
                                            var100[var105] = var100[var105 + 1];
                                            var100[var105 + 1] = var106;
                                            var104 = false;
                                        }
                                    }
                                    if (var104) {
                                        break;
                                    }
                                }
                                class322.field4426 = null;
                                class347.field4994 = var100;
                                return true;
                            }
                        }
                    } else if (class322.field4426 == class186.field2751) {
                        int var108 = class508.field7414.method1876((byte) -120);
                        int var109 = class508.field7414.method1882(-18851);
                        int var110 = class508.field7414.method1882(-18851);
                        int var111 = class508.field7414.method1837((byte) -18);
                        int var112 = class508.field7414.method1836(4);
                        boolean var113 = ~(var108 & 128) != -1;
                        if (var112 >> 30 == 0) {
                            if (var112 >> 29 != 0) {
                                int var114 = var112 & 65535;
                                class326 var115 = (class326) class281.field3826.method1592((byte) -25, (long) var114);
                                if (var115 != null) {
                                    class209 var116 = var115.field4455;
                                    if (~var110 == -65536) {
                                        var110 = -1;
                                    }
                                    boolean var117 = true;
                                    int var118 = var113 ? var116.field175 : var116.field237;
                                    if (~var110 != 0 && var118 != -1) {
                                        if (var110 == var118) {
                                            class350 var119 = class316.field4288.method2651((byte) 59, var110);
                                            if (var119.field5086 && var119.field5089 != -1) {
                                                class55 var120 = class50.field716.method831(var119.field5089, (byte) 54);
                                                int var121 = var120.field792;
                                                if (~var121 != -1 && var121 != 2) {
                                                    if (~var121 == -2) {
                                                        var117 = true;
                                                    }
                                                } else {
                                                    var117 = false;
                                                }
                                            }
                                        } else {
                                            class350 var122 = class316.field4288.method2651((byte) 59, var110);
                                            class350 var123 = class316.field4288.method2651((byte) 59, var118);
                                            if (~var122.field5089 != 0 && ~var123.field5089 != 0) {
                                                class55 var124 = class50.field716.method831(var122.field5089, (byte) 54);
                                                class55 var125 = class50.field716.method831(var123.field5089, (byte) 54);
                                                if (~var124.field784 > ~var125.field784) {
                                                    var117 = false;
                                                }
                                            }
                                        }
                                    }
                                    if (var117) {
                                        if (!var113) {
                                            var116.field227 = 1;
                                            var116.field211 = class28.field417 + var109;
                                            var116.field159 = var111;
                                            var116.field188 = 7 & var108;
                                            var116.field204 = 0;
                                            var116.field222 = 0;
                                            var116.field237 = var110;
                                            if (~var116.field211 < ~class28.field417) {
                                                var116.field222 = -1;
                                            }
                                            if (var116.field237 != -1 && ~class28.field417 == ~var116.field211) {
                                                int var126 = class316.field4288.method2651((byte) 59, var116.field237).field5089;
                                                if (~var126 != 0) {
                                                    class55 var127 = class50.field716.method831(var126, (byte) 54);
                                                    if (var127 != null && var127.field796 != null) {
                                                        class196.method1286(var127, var116.field6287, false, (byte) 1, var116.field6279, var116.field6284, 0);
                                                    }
                                                }
                                            }
                                        } else {
                                            var116.field242 = 0;
                                            var116.field203 = 1;
                                            var116.field171 = class28.field417 + var109;
                                            var116.field175 = var110;
                                            var116.field174 = var111;
                                            var116.field187 = 0;
                                            var116.field176 = 7 & var108;
                                            if (~var116.field171 < ~class28.field417) {
                                                var116.field242 = -1;
                                            }
                                            if (var116.field175 != -1 && class28.field417 == var116.field171) {
                                                int var128 = class316.field4288.method2651((byte) 59, var116.field175).field5089;
                                                if (~var128 != 0) {
                                                    class55 var129 = class50.field716.method831(var128, (byte) 54);
                                                    if (var129 != null && var129.field796 != null) {
                                                        class196.method1286(var129, var116.field6287, false, (byte) 1, var116.field6279, var116.field6284, 0);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (~(var112 >> 28) != -1) {
                                int var130 = var112 & 65535;
                                class487 var131;
                                if (~class484.field6972 != ~var130) {
                                    var131 = class45.field642[var130];
                                } else {
                                    var131 = class81.field1158;
                                }
                                if (var131 != null) {
                                    if (~var110 == -65536) {
                                        var110 = -1;
                                    }
                                    boolean var132 = true;
                                    int var133 = !var113 ? var131.field237 : var131.field175;
                                    if (var110 != -1 && var133 != -1) {
                                        if (~var110 != ~var133) {
                                            class350 var134 = class316.field4288.method2651((byte) 59, var110);
                                            class350 var135 = class316.field4288.method2651((byte) 59, var133);
                                            if (var134.field5089 != -1 && ~var135.field5089 != 0) {
                                                class55 var136 = class50.field716.method831(var134.field5089, (byte) 54);
                                                class55 var137 = class50.field716.method831(var135.field5089, (byte) 54);
                                                if (var136.field784 < var137.field784) {
                                                    var132 = false;
                                                }
                                            }
                                        } else {
                                            class350 var138 = class316.field4288.method2651((byte) 59, var110);
                                            if (var138.field5086 && var138.field5089 != -1) {
                                                class55 var139 = class50.field716.method831(var138.field5089, (byte) 54);
                                                int var140 = var139.field792;
                                                if (var140 != 0 && ~var140 != -3) {
                                                    if (~var140 == -2) {
                                                        var132 = true;
                                                    }
                                                } else {
                                                    var132 = false;
                                                }
                                            }
                                        }
                                    }
                                    if (var132) {
                                        if (var113) {
                                            var131.field171 = class28.field417 - -var109;
                                            var131.field242 = 0;
                                            var131.field174 = var111;
                                            var131.field203 = 1;
                                            var131.field187 = 0;
                                            var131.field176 = var108 & 7;
                                            var131.field175 = var110;
                                            if (var131.field171 > class28.field417) {
                                                var131.field242 = -1;
                                            }
                                            if (~var131.field175 == -65536) {
                                                var131.field175 = -1;
                                            }
                                            if (~var131.field175 != 0 && class28.field417 == var131.field171) {
                                                int var141 = class316.field4288.method2651((byte) 59, var131.field175).field5089;
                                                if (~var141 != 0) {
                                                    class55 var142 = class50.field716.method831(var141, (byte) 54);
                                                    if (var142 != null && var142.field796 != null) {
                                                        class196.method1286(var142, var131.field6287, class81.field1158 == var131, (byte) 1, var131.field6279, var131.field6284, 0);
                                                    }
                                                }
                                            }
                                        } else {
                                            var131.field227 = 1;
                                            var131.field222 = 0;
                                            var131.field237 = var110;
                                            var131.field211 = class28.field417 + var109;
                                            var131.field204 = 0;
                                            var131.field188 = 7 & var108;
                                            var131.field159 = var111;
                                            if (~var131.field237 == -65536) {
                                                var131.field237 = -1;
                                            }
                                            if (~var131.field211 < ~class28.field417) {
                                                var131.field222 = -1;
                                            }
                                            if (~var131.field237 != 0 && class28.field417 == var131.field211) {
                                                int var143 = class316.field4288.method2651((byte) 59, var131.field237).field5089;
                                                if (~var143 != 0) {
                                                    class55 var144 = class50.field716.method831(var143, (byte) 54);
                                                    if (var144 != null && var144.field796 != null) {
                                                        class196.method1286(var144, var131.field6287, class81.field1158 == var131, (byte) 1, var131.field6279, var131.field6284, 0);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            int var145 = var112 >> 28 & 3;
                            int var146 = ((var112 & 268420414) >> 14) + -class110.field1775;
                            int var147 = (16383 & var112) + -class399.field5727;
                            if (var146 >= 0 && ~var147 <= -1 && var146 < class9.field111 && ~class192.field2809 < ~var147) {
                                int var148 = var146 * 128 + 64;
                                int var149 = var147 * 128 + 64;
                                int var150 = var145;
                                if (var145 < 3 && class363.method2175(10174, var146, var147)) {
                                    var150 = var145 + 1;
                                }
                                class110 var151 = new class110(var110, 0, class28.field417, var145, var150, var148, -var111 + class123.method893(var149, var148, (byte) -13, var145), var149, var146, var146, var147, var147, var108);
                                class413.field5880.method3139(0, new class322(var151));
                            }
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class251.field3429) {
                        class529.method3127(32582, class249.field3390);
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class24.field330) {
                        class529.method3127(32582, class235.field3261);
                        class322.field4426 = null;
                        return true;
                    } else if (class521.field7646 == class322.field4426) {
                        int var152 = class508.field7414.method1848((byte) 107);
                        int var153 = class508.field7414.method1844(-122);
                        class309.field4200.method3069(0, var152, var153);
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class104.field1712) {
                        byte var154 = class508.field7414.method1834(-120);
                        int var155 = class508.field7414.method1882(-18851);
                        class309.field4200.method3074(var154, var155, (byte) 67);
                        class322.field4426 = null;
                        return true;
                    } else if (class403.field5759 == class322.field4426) {
                        int var156 = class508.field7414.method1882(-18851);
                        int var157 = class508.field7414.method1844(-118);
                        int var158 = class508.field7414.method1848((byte) 107);
                        if (class238.method1454(var157, 101)) {
                            class30.method222(var156, -99, var158);
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class322.field4420) {
                        int var159 = class508.field7414.method1848((byte) 107);
                        int var160 = class508.field7414.method1865(-121);
                        class309.field4200.method3074(var159, var160, (byte) 54);
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class264.field3544) {
                        int var161 = class508.field7414.method1844(-104);
                        int var162 = class508.field7414.method1869(-84);
                        boolean var163 = ~(var162 & 1) == -2;
                        class414.method2438(-1, var161, var163);
                        int var164 = class508.field7414.method1844(-117);
                        for (int var165 = 0; var164 > var165; ++var165) {
                            int var166 = class508.field7414.method1845(-128);
                            if (var166 == 255) {
                                var166 = class508.field7414.method1836(4);
                            }
                            int var167 = class508.field7414.method1865(-85);
                            class467.method2716(var165, var161, var166, var167 + -1, var163, 33);
                        }
                        class266.field3584[class375.method2245(31, class72.field1036++)] = var161;
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class224.field3168) {
                        int var168 = class508.field7414.method1844(-102);
                        int var169 = class508.field7414.method1869(-80);
                        int var170 = class508.field7414.method1869(-107);
                        int var171 = class508.field7414.method1869(-78);
                        int var172 = class508.field7414.method1869(-106);
                        int var173 = class508.field7414.method1844(-112);
                        if (class238.method1454(var168, 114)) {
                            class309.field4206[var169] = true;
                            class164.field2495[var169] = var170;
                            class449.field6583[var169] = var171;
                            class523.field7658[var169] = var172;
                            class314.field4260[var169] = var173;
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class92.field1505 == class322.field4426) {
                        int var174 = class508.field7414.method1845(-128);
                        int var175 = class508.field7414.method1882(-18851);
                        int var176 = class508.field7414.method1837((byte) -18);
                        class326 var177 = (class326) class281.field3826.method1592((byte) -25, (long) var175);
                        if (var177 != null) {
                            class169.method1168(var177.field4455, var174, true, var176);
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class128.field1974) {
                        int var178 = class508.field7414.method1837((byte) -18);
                        if (~var178 == -65536) {
                            var178 = -1;
                        }
                        int var179 = class508.field7414.method1848((byte) 107);
                        int var180 = class508.field7414.method1837((byte) -18);
                        if (~var180 == -65536) {
                            var180 = -1;
                        }
                        int var181 = class508.field7414.method1846(false);
                        int var182 = class508.field7414.method1865(-96);
                        if (class238.method1454(var182, 97)) {
                            for (int var183 = var180; var178 >= var183; ++var183) {
                                long var184 = ((long) var181 << 32) + (long) var183;
                                class428 var186 = (class428) class120.field1866.method1592((byte) -25, var184);
                                class428 var187;
                                if (var186 == null) {
                                    if (~var183 == 0) {
                                        var187 = new class428(var179, class22.method138(106, var181).field6517.field6211);
                                    } else {
                                        var187 = new class428(var179, -1);
                                    }
                                } else {
                                    var187 = new class428(var179, var186.field6211);
                                    var186.method2791((byte) 112);
                                }
                                class120.field1866.method1586(var187, var184, 1);
                            }
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class222.field3140) {
                        class296.field3993 = class508.field7414.method1869(-96);
                        for (int var188 = 0; ~var188 > ~class296.field3993; ++var188) {
                            class169.field2579[var188] = class508.field7414.method1871(71);
                            class508.field7421[var188] = class508.field7414.method1871(101);
                            if (class508.field7421[var188].equals("")) {
                                class508.field7421[var188] = class169.field2579[var188];
                            }
                            class148.field2266[var188] = class508.field7414.method1871(43);
                            class51.field728[var188] = class508.field7414.method1871(78);
                            if (class51.field728[var188].equals("")) {
                                class51.field728[var188] = class148.field2266[var188];
                            }
                            class76.field1077[var188] = false;
                        }
                        class294.field3968 = class365.field5245;
                        class322.field4426 = null;
                        return true;
                    } else if (class427.field6206 == class322.field4426) {
                        int var189 = class508.field7414.method1869(-116);
                        boolean var190 = ~(1 & var189) == -2;
                        String var191 = class508.field7414.method1871(84);
                        String var192 = class508.field7414.method1871(77);
                        if (var192.equals("")) {
                            var192 = var191;
                        }
                        String var193 = class508.field7414.method1871(102);
                        String var194 = class508.field7414.method1871(40);
                        if (var194.equals("")) {
                            var194 = var193;
                        }
                        if (!var190) {
                            class169.field2579[class296.field3993] = var191;
                            class508.field7421[class296.field3993] = var192;
                            class148.field2266[class296.field3993] = var193;
                            class51.field728[class296.field3993] = var194;
                            class76.field1077[class296.field3993] = class375.method2245(var189, 2) == 2;
                            ++class296.field3993;
                        } else {
                            for (int var195 = 0; var195 < class296.field3993; ++var195) {
                                if (class508.field7421[var195].equals(var194)) {
                                    class169.field2579[var195] = var191;
                                    class508.field7421[var195] = var192;
                                    class148.field2266[var195] = var193;
                                    class51.field728[var195] = var194;
                                    break;
                                }
                            }
                        }
                        class294.field3968 = class365.field5245;
                        class322.field4426 = null;
                        return true;
                    } else if (class40.field599 == class322.field4426) {
                        String var196 = class508.field7414.method1871(92);
                        String var197 = class112.method850(-63, class38.method265(class508.field7414, -106));
                        class9.method68(var196, 0, 6, -1, var197, var196);
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class274.field3719) {
                        class529.method3127(32582, class209.field2994);
                        class322.field4426 = null;
                        return true;
                    } else if (class5.field74 == class322.field4426) {
                        int var198 = class508.field7414.method1877(-57);
                        int var199 = class508.field7414.method1863(-1);
                        int var200 = class508.field7414.method1869(-115);
                        String var201 = "";
                        String var202 = var201;
                        if ((1 & var200) != 0) {
                            var201 = class508.field7414.method1871(95);
                            if (~(2 & var200) != -1) {
                                var202 = class508.field7414.method1871(27);
                            } else {
                                var202 = var201;
                            }
                        }
                        String var203 = class508.field7414.method1871(56);
                        if (var198 != 99) {
                            if (!var202.equals("") && class95.method772(0, var202)) {
                                class322.field4426 = null;
                                return true;
                            }
                            class9.method68(var201, var199, var198, -1, var203, var202);
                        } else {
                            class353.method2116(var203, false);
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class449.field6576 == class322.field4426) {
                        class195.field2827 = class508.field7414.method1869(-112);
                        class322.field4426 = null;
                        return true;
                    } else if (class39.field589 == class322.field4426) {
                        class529.method3127(32582, class273.field3707);
                        class322.field4426 = null;
                        return true;
                    } else if (class382.field5485 == class322.field4426) {
                        int var204 = class508.field7414.method1863(-1);
                        class454.field6635 = class346.field4985.method1192(var204, 3);
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class212.field3022) {
                        byte var205 = class508.field7414.method1862(53);
                        int var206 = class508.field7414.method1882(-18851);
                        int var207 = class508.field7414.method1865(-111);
                        if (class238.method1454(var207, 118)) {
                            class248.method1482(var206, var205, 2);
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class520.field7636 == class322.field4426) {
                        boolean var208 = class508.field7414.method1869(-107) == 1;
                        String var209 = class508.field7414.method1871(33);
                        String var210 = var209;
                        if (var208) {
                            var210 = class508.field7414.method1871(75);
                        }
                        int var211 = class508.field7414.method1869(-79);
                        boolean var212 = false;
                        if (~var211 >= -2) {
                            if ((!class355.field5134 || class345.field4970) && !class185.field2739) {
                                if (var211 <= 1 && class95.method772(0, var210)) {
                                    var212 = true;
                                }
                            } else {
                                var212 = true;
                            }
                        }
                        if (!var212 && class422.field6142 == 0) {
                            String var213 = class112.method850(-63, class38.method265(class508.field7414, -99));
                            if (var211 != 2) {
                                if (~var211 == -2) {
                                    class365.method2184(0, var213, (String) null, 108, 24, -1, "<img=0>" + var209, "<img=0>" + var210);
                                } else {
                                    class365.method2184(0, var213, (String) null, -111, 24, -1, var209, var210);
                                }
                            } else {
                                class365.method2184(0, var213, (String) null, -80, 24, -1, "<img=1>" + var209, "<img=1>" + var210);
                            }
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class265.field3569) {
                        class533.method3160(false);
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class140.field2094) {
                        int var214 = class508.field7414.method1848((byte) 107);
                        int var215 = class508.field7414.method1837((byte) -18);
                        int var216 = class508.field7414.method1865(-93);
                        if (class238.method1454(var216, 110)) {
                            class197.method1297(var214, -100, var215);
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class342.field4948 == class322.field4426) {
                        while (~class399.field5722 < ~class508.field7414.field4360) {
                            boolean var227 = class508.field7414.method1869(-92) == 1;
                            String var228 = class508.field7414.method1871(80);
                            String var229 = class508.field7414.method1871(88);
                            int var230 = class508.field7414.method1844(-121);
                            int var231 = class508.field7414.method1869(-100);
                            String var232 = "";
                            boolean var233 = false;
                            if (var230 > 0) {
                                var232 = class508.field7414.method1871(53);
                                var233 = class508.field7414.method1869(-99) == 1;
                            }
                            for (int var234 = 0; var234 < class399.field5724; ++var234) {
                                if (!var227) {
                                    if (var228.equals(class494.field7148[var234])) {
                                        if (class423.field6155[var234] != var230) {
                                            boolean var235 = true;
                                            for (class102 var236 = (class102) class416.field6029.method2600((byte) 111); var236 != null; var236 = (class102) class416.field6029.method2601(121)) {
                                                if (var236.field1600.equals(var228)) {
                                                    if (~var230 != -1 && var236.field1601 == 0) {
                                                        var236.method2861((byte) 47);
                                                        var235 = false;
                                                    } else if (~var230 == -1 && ~var236.field1601 != -1) {
                                                        var236.method2861((byte) 47);
                                                        var235 = false;
                                                    }
                                                }
                                            }
                                            if (var235) {
                                                class416.field6029.method2599(1256, new class102(var228, var230));
                                            }
                                            class423.field6155[var234] = var230;
                                        }
                                        class384.field5510[var234] = var229;
                                        class184.field2736[var234] = var232;
                                        class342.field4949[var234] = var231;
                                        class529.field7782[var234] = var233;
                                        var228 = null;
                                        break;
                                    }
                                } else if (var229.equals(class494.field7148[var234])) {
                                    class494.field7148[var234] = var228;
                                    var228 = null;
                                    class384.field5510[var234] = var229;
                                    break;
                                }
                            }
                            if (var228 != null && class399.field5724 < 200) {
                                class494.field7148[class399.field5724] = var228;
                                class384.field5510[class399.field5724] = var229;
                                class423.field6155[class399.field5724] = var230;
                                class184.field2736[class399.field5724] = var232;
                                class342.field4949[class399.field5724] = var231;
                                class529.field7782[class399.field5724] = var233;
                                ++class399.field5724;
                            }
                        }
                        class382.field5486 = 2;
                        class294.field3968 = class365.field5245;
                        boolean var217 = false;
                        int var218 = class399.field5724;
                        while (~var218 < -1) {
                            boolean var219 = true;
                            --var218;
                            for (int var220 = 0; var220 < var218; ++var220) {
                                if (class423.field6155[var220] != class184.field2737.field609 && class423.field6155[var220 + 1] == class184.field2737.field609 || ~class423.field6155[var220] == -1 && ~class423.field6155[var220 + 1] != -1) {
                                    int var221 = class423.field6155[var220];
                                    class423.field6155[var220] = class423.field6155[var220 + 1];
                                    class423.field6155[var220 + 1] = var221;
                                    String var222 = class184.field2736[var220];
                                    class184.field2736[var220] = class184.field2736[var220 + 1];
                                    class184.field2736[var220 - -1] = var222;
                                    String var223 = class494.field7148[var220];
                                    class494.field7148[var220] = class494.field7148[var220 - -1];
                                    class494.field7148[var220 + 1] = var223;
                                    String var224 = class384.field5510[var220];
                                    class384.field5510[var220] = class384.field5510[var220 + 1];
                                    class384.field5510[var220 + 1] = var224;
                                    int var225 = class342.field4949[var220];
                                    class342.field4949[var220] = class342.field4949[var220 + 1];
                                    class342.field4949[var220 + 1] = var225;
                                    boolean var226 = class529.field7782[var220];
                                    class529.field7782[var220] = class529.field7782[var220 - -1];
                                    class529.field7782[var220 + 1] = var226;
                                    var219 = false;
                                }
                            }
                            if (var219) {
                                break;
                            }
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class520.field7639 == class322.field4426) {
                        class157.method1125((byte) 63, class508.field7414, class399.field5722);
                        class322.field4426 = null;
                        return true;
                    } else if (field6190 == class322.field4426) {
                        boolean var237 = ~class508.field7414.method1869(-100) == -2;
                        String var238 = class508.field7414.method1871(115);
                        String var239 = var238;
                        if (var237) {
                            var239 = class508.field7414.method1871(6);
                        }
                        long var240 = class508.field7414.method1886(false);
                        long var242 = (long) class508.field7414.method1844(-125);
                        long var244 = (long) class508.field7414.method1852(1086280488);
                        int var246 = class508.field7414.method1869(-127);
                        int var247 = class508.field7414.method1844(-118);
                        long var248 = (var242 << 32) + var244;
                        boolean var250 = false;
                        int var251 = 0;
                        while (true) {
                            if (var251 >= 100) {
                                if (~var246 >= -2 && class95.method772(0, var239)) {
                                    var250 = true;
                                }
                                break;
                            }
                            if (~class75.field1057[var251] == ~var248) {
                                var250 = true;
                                break;
                            }
                            ++var251;
                        }
                        if (!var250 && class422.field6142 == 0) {
                            class75.field1057[class376.field5401] = var248;
                            class376.field5401 = (class376.field5401 - -1) % 100;
                            String var252 = class188.field2772.method1387((byte) 109, var247).method1071(class508.field7414, 107);
                            if (var246 != 2) {
                                if (var246 == 1) {
                                    class365.method2184(0, var252, class340.method2065(var240, false), 93, 20, var247, "<img=0>" + var238, "<img=0>" + var239);
                                } else {
                                    class365.method2184(0, var252, class340.method2065(var240, arg0), -69, 20, var247, var238, var239);
                                }
                            } else {
                                class365.method2184(0, var252, class340.method2065(var240, arg0), 62, 20, var247, "<img=1>" + var238, "<img=1>" + var239);
                            }
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class326.field4460 == class322.field4426) {
                        class525.field7672 = class508.field7414.method1847(41);
                        class492.field7132 = class365.field5245;
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class312.field4237) {
                        boolean var253 = class508.field7414.method1869(-105) == 1;
                        String var254 = class508.field7414.method1871(121);
                        String var255 = var254;
                        if (var253) {
                            var255 = class508.field7414.method1871(41);
                        }
                        long var256 = class508.field7414.method1886(false);
                        long var258 = (long) class508.field7414.method1844(-122);
                        long var260 = (long) class508.field7414.method1852(1086280488);
                        int var262 = class508.field7414.method1869(-90);
                        long var263 = (var258 << 32) + var260;
                        boolean var265 = false;
                        int var266 = 0;
                        while (true) {
                            if (var266 >= 100) {
                                if (~var262 >= -2) {
                                    if ((!class355.field5134 || class345.field4970) && !class185.field2739) {
                                        if (class95.method772(0, var255)) {
                                            var265 = true;
                                        }
                                    } else {
                                        var265 = true;
                                    }
                                }
                                break;
                            }
                            if (class75.field1057[var266] == var263) {
                                var265 = true;
                                break;
                            }
                            ++var266;
                        }
                        if (!var265 && ~class422.field6142 == -1) {
                            class75.field1057[class376.field5401] = var263;
                            class376.field5401 = (class376.field5401 - -1) % 100;
                            String var267 = class112.method850(-63, class38.method265(class508.field7414, -108));
                            if (~var262 != -3 && var262 != 3) {
                                if (~var262 == -2) {
                                    class365.method2184(0, var267, class340.method2065(var256, false), 46, 9, -1, "<img=0>" + var254, "<img=0>" + var255);
                                } else {
                                    class365.method2184(0, var267, class340.method2065(var256, false), -111, 9, -1, var254, var255);
                                }
                            } else {
                                class365.method2184(0, var267, class340.method2065(var256, false), 79, 9, -1, "<img=1>" + var254, "<img=1>" + var255);
                            }
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class515.field7539 == class322.field4426) {
                        int var268 = class508.field7414.method1845(-128);
                        int var269 = class508.field7414.method1876((byte) -127);
                        if (var269 == 255) {
                            var269 = -1;
                            var268 = -1;
                        }
                        class431.method2560(var269, var268, (byte) -71);
                        class322.field4426 = null;
                        return true;
                    } else if (class54.field779 == class322.field4426) {
                        class207.method1324(-105);
                        class322.field4426 = null;
                        return false;
                    } else if (class322.field4426 == class27.field399) {
                        class529.method3127(32582, class165.field2540);
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class134.field2048) {
                        int var270 = class508.field7414.method1836(4);
                        int var271 = class508.field7414.method1882(-18851);
                        if (~var271 == -65536) {
                            var271 = -1;
                        }
                        int var272 = class508.field7414.method1844(-111);
                        if (class238.method1454(var272, 113)) {
                            class496.method2945(2, 0, var270, var271, -1);
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class515.field7536 == class322.field4426) {
                        int var273 = class508.field7414.method1845(-128);
                        int var274 = class508.field7414.method1863(-1);
                        int var275 = class508.field7414.method1845(-128);
                        class206.field2964[var275] = var274;
                        class391.field5645[var275] = var273;
                        class497.field7279[var275] = 1;
                        int var276 = class532.field7821[var275] + -1;
                        for (int var277 = 0; var277 < var276; ++var277) {
                            if (~class417.field6039[var277] >= ~var274) {
                                class497.field7279[var275] = var277 + 2;
                            }
                        }
                        class165.field2541[class375.method2245(31, class34.field538++)] = var275;
                        class322.field4426 = null;
                        return true;
                    } else if (class412.field5873 == class322.field4426) {
                        class529.method3127(32582, class497.field7272);
                        class322.field4426 = null;
                        return true;
                    } else if (class92.field1511 == class322.field4426) {
                        for (int var278 = 0; ~class45.field642.length < ~var278; ++var278) {
                            if (class45.field642[var278] != null) {
                                class45.field642[var278].field166 = -1;
                            }
                        }
                        for (int var279 = 0; class534.field7854 > var279; ++var279) {
                            class496.field7261[var279].field4455.field166 = -1;
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class363.field5224 == class322.field4426) {
                        int var280 = class508.field7414.method1882(-18851);
                        int var281 = class508.field7414.method1889(-123);
                        int var282 = class508.field7414.method1837((byte) -18);
                        if (class238.method1454(var280, 108)) {
                            if (~var281 == -3) {
                                class39.method271(true);
                            }
                            class236.field3268 = var282;
                            class416.method2459(var282, -78);
                            class454.method2663(true, false);
                            class47.method317(class236.field3268);
                            for (int var283 = 0; ~var283 > -101; ++var283) {
                                class428.field6214[var283] = true;
                            }
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class141.field2105) {
                        class529.method3127(32582, class169.field2580);
                        class322.field4426 = null;
                        return true;
                    } else if (class94.field1527 == class322.field4426) {
                        class121.field1889 = class265.method1561(class508.field7414.method1869(-82), -111);
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class181.field2684) {
                        int var284 = class508.field7414.method1865(-123);
                        int var285 = class508.field7414.method1837((byte) -18);
                        int var286 = class508.field7414.method1882(-18851);
                        if (class238.method1454(var286, 110)) {
                            class55.method358(var285, 0, var284, (byte) -116);
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class451.field6611 == class322.field4426) {
                        int var287 = class508.field7414.method1848((byte) 107);
                        int var288 = class508.field7414.method1865(-87);
                        int var289 = class508.field7414.method1837((byte) -18);
                        int var290 = class508.field7414.method1882(-18851);
                        if (class238.method1454(var288, 113)) {
                            class243.method1471((var289 << 16) + var290, true, var287);
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class54.field764 == class322.field4426) {
                        int var291 = class508.field7414.method1882(-18851);
                        int var292 = class508.field7414.method1837((byte) -18);
                        if (var292 == 65535) {
                            var292 = -1;
                        }
                        int var293 = class508.field7414.method1865(-127);
                        int var294 = class508.field7414.method1837((byte) -18);
                        if (var294 == 65535) {
                            var294 = -1;
                        }
                        int var295 = class508.field7414.method1863(-1);
                        if (class238.method1454(var291, 112)) {
                            for (int var296 = var292; ~var294 <= ~var296; ++var296) {
                                long var297 = ((long) var295 << 32) + (long) var296;
                                class428 var299 = (class428) class120.field1866.method1592((byte) -25, var297);
                                class428 var300;
                                if (var299 != null) {
                                    var300 = new class428(var299.field6217, var293);
                                    var299.method2791((byte) 112);
                                } else if (var296 == -1) {
                                    var300 = new class428(class22.method138(-107, var295).field6517.field6217, var293);
                                } else {
                                    var300 = new class428(0, var293);
                                }
                                class120.field1866.method1586(var300, var297, 1);
                            }
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class534.field7866 == class322.field4426) {
                        boolean var301 = class508.field7414.method1869(-97) == 1;
                        String var302 = class508.field7414.method1871(47);
                        String var303 = var302;
                        if (var301) {
                            var303 = class508.field7414.method1871(109);
                        }
                        int var304 = class508.field7414.method1869(-95);
                        int var305 = class508.field7414.method1844(-101);
                        boolean var306 = false;
                        if (var304 <= 1 && class95.method772(0, var303)) {
                            var306 = true;
                        }
                        if (!var306 && ~class422.field6142 == -1) {
                            String var307 = class188.field2772.method1387((byte) 109, var305).method1071(class508.field7414, 36);
                            if (var304 == 2) {
                                class365.method2184(0, var307, (String) null, 94, 25, var305, "<img=1>" + var302, "<img=1>" + var303);
                            } else if (~var304 == -2) {
                                class365.method2184(0, var307, (String) null, 96, 25, var305, "<img=0>" + var302, "<img=0>" + var303);
                            } else {
                                class365.method2184(0, var307, (String) null, 48, 25, var305, var302, var303);
                            }
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class535.field7873 == class322.field4426) {
                        String var308 = class508.field7414.method1871(122);
                        boolean var309 = ~class508.field7414.method1869(-72) == -2;
                        String var310;
                        if (!var309) {
                            var310 = var308;
                        } else {
                            var310 = class508.field7414.method1871(125);
                        }
                        int var311 = class508.field7414.method1844(-112);
                        byte var312 = class508.field7414.method1894(-2018);
                        boolean var313 = false;
                        if (~var312 == 127) {
                            var313 = true;
                        }
                        if (!var313) {
                            String var314 = class508.field7414.method1871(110);
                            class244 var315 = new class244();
                            var315.field3343 = var308;
                            var315.field3345 = var310;
                            var315.field3342 = class75.method585(var315.field3345, -1);
                            var315.field3347 = var314;
                            var315.field3346 = var312;
                            var315.field3348 = var311;
                            int var316;
                            for (var316 = class167.field2554 - 1; ~var316 <= -1; --var316) {
                                int var317 = class347.field4994[var316].field3342.compareTo(var315.field3342);
                                if (~var317 == -1) {
                                    class347.field4994[var316].field3348 = var311;
                                    class347.field4994[var316].field3346 = var312;
                                    class347.field4994[var316].field3347 = var314;
                                    if (var310.equals(class81.field1158.field7036)) {
                                        class428.field6219 = var312;
                                    }
                                    class68.field976 = class365.field5245;
                                    class322.field4426 = null;
                                    return true;
                                }
                                if (var317 < 0) {
                                    break;
                                }
                            }
                            if (~class167.field2554 <= ~class347.field4994.length) {
                                class322.field4426 = null;
                                return true;
                            }
                            for (int var318 = class167.field2554 + -1; ~var318 < ~var316; --var318) {
                                class347.field4994[var318 + 1] = class347.field4994[var318];
                            }
                            if (~class167.field2554 == -1) {
                                class347.field4994 = new class244[100];
                            }
                            class347.field4994[var316 - -1] = var315;
                            ++class167.field2554;
                            if (var310.equals(class81.field1158.field7036)) {
                                class428.field6219 = var312;
                            }
                        } else {
                            if (~class167.field2554 == -1) {
                                class322.field4426 = null;
                                return true;
                            }
                            boolean var319 = false;
                            int var320;
                            for (var320 = 0; ~class167.field2554 < ~var320 && (!class347.field4994[var320].field3345.equals(var310) || class347.field4994[var320].field3348 != var311); ++var320) {
                            }
                            if (~class167.field2554 < ~var320) {
                                while (~(class167.field2554 - 1) < ~var320) {
                                    class347.field4994[var320] = class347.field4994[var320 - -1];
                                    ++var320;
                                }
                                --class167.field2554;
                                class347.field4994[class167.field2554] = null;
                            }
                        }
                        class322.field4426 = null;
                        class68.field976 = class365.field5245;
                        return true;
                    } else if (class428.field6220 == class322.field4426) {
                        int var321 = class508.field7414.method1882(-18851);
                        int var322 = class508.field7414.method1846(false);
                        if (class238.method1454(var321, 106)) {
                            class496.method2945(3, 0, var322, -1, -1);
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class191.field2798) {
                        if (class26.field358 != null) {
                            class133.method964(class76.field1075.field3676, false, -1, -4, -1);
                        }
                        byte[] var323 = new byte[class399.field5722];
                        class508.field7414.method189((byte) -104, class399.field5722, var323, 0);
                        String var324 = class313.method1804(class399.field5722, 0, true, var323);
                        class311.method1796(var324, true, class195.field2849 == 1, (byte) -128, class346.field4985);
                        class322.field4426 = null;
                        return true;
                    } else if (class458.field6667 == class322.field4426) {
                        class207.method1323(false, 109);
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class264.field3551) {
                        int var325 = class508.field7414.method1865(-117);
                        int var326 = class508.field7414.method1837((byte) -18);
                        if (var326 == 65535) {
                            var326 = -1;
                        }
                        int var327 = class508.field7414.method1846(false);
                        int var328 = class508.field7414.method1846(arg0);
                        if (class238.method1454(var325, 119)) {
                            class118.method868(var327, var326, true, var328);
                            class297 var329 = class534.field7872.method3089(var326, 122);
                            class475.method2788(var328, var329.field4051, var329.field4034, 524287, var329.field4081);
                            class353.method2119(var329.field4049, var328, var329.field4059, var329.field4035, true);
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class508.field7416 == class322.field4426) {
                        int var330 = class508.field7414.method1844(-122);
                        int var331 = class508.field7414.method1869(-119);
                        boolean var332 = (1 & var331) == 1;
                        while (~class399.field5722 < ~class508.field7414.field4360) {
                            int var333 = class508.field7414.method1877(-101);
                            int var334 = class508.field7414.method1844(-111);
                            int var335 = 0;
                            if (~var334 != -1) {
                                var335 = class508.field7414.method1869(-81);
                                if (var335 == 255) {
                                    var335 = class508.field7414.method1863(-1);
                                }
                            }
                            class467.method2716(var333, var330, var335, var334 - 1, var332, 97);
                        }
                        class266.field3584[class375.method2245(31, class72.field1036++)] = var330;
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class196.field2879) {
                        class255.field3477 = class508.field7414.method1869(-80);
                        class185.field2744 = class508.field7414.method1834(-82) << 3;
                        class422.field6145 = class508.field7414.method1834(-125) << 3;
                        class322.field4426 = null;
                        return true;
                    } else if (class504.field7371 == class322.field4426) {
                        class384.method2276(0, class527.field7689);
                        class322.field4426 = null;
                        return false;
                    } else if (class369.field5281 == class322.field4426) {
                        class422.field6145 = class508.field7414.method1862(51) << 3;
                        class255.field3477 = class508.field7414.method1876((byte) -128);
                        class185.field2744 = class508.field7414.method1834(-127) << 3;
                        while (class508.field7414.field4360 < class399.field5722) {
                            class205 var336 = class168.method1163(-96)[class508.field7414.method1869(-66)];
                            class529.method3127(32582, var336);
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class237.field3281) {
                        int var337 = class508.field7414.method1865(-101);
                        int var338 = class508.field7414.method1848((byte) 107);
                        int var339 = class508.field7414.method1837((byte) -18);
                        int var340 = class508.field7414.method1836(4);
                        if (class238.method1454(var339, 97)) {
                            class496.method2945(5, 0, var338, var337, var340);
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class16.field251) {
                        int var341 = class508.field7414.method1844(-107);
                        if (class238.method1454(var341, 116)) {
                            class27.method179((byte) -6);
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class366.field5255 == class322.field4426) {
                        if (~class236.field3268 != 0) {
                            class264.method1554((byte) -115, 0, class236.field3268);
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class516.field7566 == class322.field4426) {
                        int var342 = class508.field7414.method1876((byte) -121);
                        int var343 = class508.field7414.method1869(-115);
                        int var344 = class508.field7414.method1837((byte) -18);
                        if (var344 == 65535) {
                            var344 = -1;
                        }
                        class60.method403(var343, var342, 0, var344);
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class149.field2299) {
                        int var345 = class508.field7414.method1876((byte) -125);
                        int var346 = class508.field7414.method1882(-18851);
                        if (var346 == 65535) {
                            var346 = -1;
                        }
                        int var347 = class508.field7414.method1856(-3);
                        class259.method1537(var346, var347, var345, !arg0);
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class311.field4226) {
                        String var348 = class508.field7414.method1871(108);
                        int var349 = class508.field7414.method1844(-101);
                        int var350 = class508.field7414.method1844(-125);
                        if (class238.method1454(var349, 95)) {
                            class19.method130(var350, -26980, var348);
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class265.field3568) {
                        class382.field5486 = 1;
                        class322.field4426 = null;
                        class294.field3968 = class365.field5245;
                        return true;
                    } else if (class358.field5150 == class322.field4426) {
                        String var351 = class508.field7414.method1871(10);
                        int var352 = class508.field7414.method1844(-128);
                        if (~var352 == -65536) {
                            var352 = -1;
                        }
                        int var353 = class508.field7414.method1889(18);
                        int var354 = class508.field7414.method1876((byte) -124);
                        if (~var353 <= -2 && ~var353 >= -9) {
                            if (var351.equalsIgnoreCase("null")) {
                                var351 = null;
                            }
                            class331.field4501[var353 + -1] = var351;
                            class497.field7282[var353 - 1] = var352;
                            class245.field3354[var353 + -1] = ~var354 == -1;
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class414.field5905 == class322.field4426) {
                        class76.field1076 = class508.field7414.method1830((byte) 97);
                        class355.field5134 = class508.field7414.method1869(-110) == 1;
                        class322.field4426 = null;
                        return true;
                    } else if (class384.field5511 == class322.field4426) {
                        int var355 = class508.field7414.method1844(-114);
                        if (class238.method1454(var355, 109)) {
                            class168.method1164((byte) -127);
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class224.field3169) {
                        class529.method3127(32582, class397.field5704);
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class109.field1773) {
                        int var356 = class508.field7414.method1882(-18851);
                        int var357 = class508.field7414.method1845(-128);
                        class309.field4200.method3069(0, var357, var356);
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class100.field1593) {
                        int var358 = class508.field7414.method1865(-83);
                        if (~var358 == -65536) {
                            var358 = -1;
                        }
                        int var359 = class508.field7414.method1882(-18851);
                        int var360 = class508.field7414.method1848((byte) 107);
                        if (class238.method1454(var359, 120)) {
                            class496.method2945(1, 0, var360, var358, -1);
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class133.field2030) {
                        int var361 = class508.field7414.method1844(-122);
                        int var362 = class508.field7414.method1844(-103);
                        int var363 = class508.field7414.method1844(-106);
                        int var364 = class508.field7414.method1844(-126);
                        if (class238.method1454(var361, 106) && class505.field7387[var362] != null) {
                            for (int var365 = var363; ~var364 < ~var365; ++var365) {
                                int var366 = class508.field7414.method1852(1086280488);
                                if (var365 < class505.field7387[var362].length && class505.field7387[var362][var365] != null) {
                                    class505.field7387[var362][var365].field6385 = var366;
                                }
                            }
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class444.field6540 == class322.field4426) {
                        class529.method3127(32582, class196.field2875);
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class211.field3005) {
                        int var367 = class508.field7414.method1889(-19);
                        int var368 = class508.field7414.method1865(-97);
                        if (class238.method1454(var368, 99)) {
                            class349.field5073 = var367;
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class439.field6323 == class322.field4426) {
                        int var369 = class508.field7414.method1844(-119);
                        int var370 = class508.field7414.method1845(-128);
                        boolean var371 = ~(var370 & 1) == -2;
                        class195.method1275(false, var371, var369);
                        class266.field3584[class375.method2245(31, class72.field1036++)] = var369;
                        class322.field4426 = null;
                        return true;
                    } else if (class390.field5626 == class322.field4426) {
                        class76.field1078 = ~class399.field5722 >= -3 ? class14.field147.method1126(class486.field6998, (byte) -19) : class508.field7414.method1871(50);
                        class347.field4989 = class399.field5722 > 0 ? class508.field7414.method1844(-122) : -1;
                        if (~class347.field4989 == -65536) {
                            class347.field4989 = -1;
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class397.field5707 == class322.field4426) {
                        String var372 = class508.field7414.method1871(114);
                        int var373 = class508.field7414.method1844(-106);
                        String var374 = class188.field2772.method1387((byte) 109, var373).method1071(class508.field7414, 122);
                        class365.method2184(0, var374, (String) null, -61, 19, var373, var372, var372);
                        class322.field4426 = null;
                        return true;
                    } else if (class457.field6663 == class322.field4426) {
                        boolean var375 = class508.field7414.method1869(-83) == 1;
                        String var376 = class508.field7414.method1871(122);
                        String var377 = var376;
                        if (var375) {
                            var377 = class508.field7414.method1871(97);
                        }
                        long var378 = (long) class508.field7414.method1844(-128);
                        long var380 = (long) class508.field7414.method1852(1086280488);
                        int var382 = class508.field7414.method1869(-117);
                        long var383 = (var378 << 32) - -var380;
                        boolean var385 = false;
                        int var386 = 0;
                        while (true) {
                            if (var386 >= 100) {
                                if (var382 <= 1) {
                                    if ((!class355.field5134 || class345.field4970) && !class185.field2739) {
                                        if (class95.method772(0, var377)) {
                                            var385 = true;
                                        }
                                    } else {
                                        var385 = true;
                                    }
                                }
                                break;
                            }
                            if (~class75.field1057[var386] == ~var383) {
                                var385 = true;
                                break;
                            }
                            ++var386;
                        }
                        if (!var385 && ~class422.field6142 == -1) {
                            class75.field1057[class376.field5401] = var383;
                            class376.field5401 = (class376.field5401 - -1) % 100;
                            String var387 = class112.method850(-63, class38.method265(class508.field7414, -101));
                            if (var382 != 2) {
                                if (~var382 != -2) {
                                    class365.method2184(0, var387, (String) null, 58, 3, -1, var376, var377);
                                } else {
                                    class365.method2184(0, var387, (String) null, -125, 7, -1, "<img=0>" + var376, "<img=0>" + var377);
                                }
                            } else {
                                class365.method2184(0, var387, (String) null, -120, 7, -1, "<img=1>" + var376, "<img=1>" + var377);
                            }
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class384.field5518 == class322.field4426) {
                        int var388 = class508.field7414.method1844(-105);
                        int var389 = class508.field7414.method1869(-110);
                        int var390 = class508.field7414.method1869(-94);
                        int var391 = class508.field7414.method1844(-107) << 0;
                        int var392 = class508.field7414.method1869(-92);
                        int var393 = class508.field7414.method1869(-87);
                        if (class238.method1454(var388, 109)) {
                            class29.method199(var390, var393, var389, -77, var391, true, var392);
                        }
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class249.field3396) {
                        class30.method220(class508.field7414, class346.field4985, class399.field5722, 116);
                        class322.field4426 = null;
                        return true;
                    } else if (class322.field4426 == class233.field3244) {
                        class86.method724(class508.field7414.method1871(127), (byte) 76);
                        class322.field4426 = null;
                        return true;
                    } else if (class441.field6362 == class322.field4426) {
                        class309.field4200.method3072(-127);
                        class322.field4426 = null;
                        class342.field4940 += 32;
                        return true;
                    } else if (class322.field4426 != class117.field1843) {
                        if (class346.field4982 == class322.field4426) {
                            int var408 = class508.field7414.method1844(-117);
                            if (~var408 == -65536) {
                                var408 = -1;
                            }
                            int var409 = class508.field7414.method1869(-115);
                            int var410 = class508.field7414.method1844(-122);
                            int var411 = class508.field7414.method1869(-108);
                            class329.method1944(var410, 37, var408, var411, var409);
                            class322.field4426 = null;
                            return true;
                        } else if (class66.field952 == class322.field4426) {
                            class529.method3127(32582, class126.field1964);
                            class322.field4426 = null;
                            return true;
                        } else if (class86.field1403 == class322.field4426) {
                            class207.method1323(true, -41);
                            class322.field4426 = null;
                            return true;
                        } else {
                            class187.method1255((Throwable) null, "T1 - " + (class322.field4426 == null ? -1 : class322.field4426.method1628(true)) + "," + (class530.field7804 != null ? class530.field7804.method1628(!arg0) : -1) + "," + (class72.field1037 == null ? -1 : class72.field1037.method1628(!arg0)) + " - " + class399.field5722, -80);
                            class384.method2276(0, arg0);
                            return true;
                        }
                    } else {
                        boolean var394 = ~class508.field7414.method1869(-103) == -2;
                        String var395 = class508.field7414.method1871(63);
                        String var396 = var395;
                        if (var394) {
                            var396 = class508.field7414.method1871(44);
                        }
                        long var397 = (long) class508.field7414.method1844(-115);
                        long var399 = (long) class508.field7414.method1852(1086280488);
                        int var401 = class508.field7414.method1869(-70);
                        int var402 = class508.field7414.method1844(-101);
                        long var403 = (var397 << 32) - -var399;
                        boolean var405 = false;
                        int var406 = 0;
                        while (true) {
                            if (var406 >= 100) {
                                if (~var401 >= -2 && class95.method772(0, var396)) {
                                    var405 = true;
                                }
                                break;
                            }
                            if (class75.field1057[var406] == var403) {
                                var405 = true;
                                break;
                            }
                            ++var406;
                        }
                        if (!var405 && class422.field6142 == 0) {
                            class75.field1057[class376.field5401] = var403;
                            class376.field5401 = (class376.field5401 + 1) % 100;
                            String var407 = class188.field2772.method1387((byte) 109, var402).method1071(class508.field7414, 122);
                            if (var401 != 2) {
                                if (var401 == 1) {
                                    class365.method2184(0, var407, (String) null, 74, 18, var402, "<img=0>" + var395, "<img=0>" + var396);
                                } else {
                                    class365.method2184(0, var407, (String) null, 94, 18, var402, var395, var396);
                                }
                            } else {
                                class365.method2184(0, var407, (String) null, -91, 18, var402, "<img=1>" + var395, "<img=1>" + var396);
                            }
                        }
                        class322.field4426 = null;
                        return true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "(B)I")
    public final int method157(byte arg0) {
        if (arg0 != -22) {
            this.method2537((byte) 39);
        }
        ++field6177;
        return this.field6175;
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(B)Z")
    public final boolean method160(byte arg0) {
        ++field6163;
        if (arg0 != 112) {
            field6168 = null;
        }
        return this.field6161;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IBILza;)Z")
    public final boolean method158(int arg0, byte arg1, int arg2, class295 arg3) {
        ++field6183;
        class285 var5 = this.method2538(arg3, 131072, (byte) -97);
        if (var5 != null) {
            class512 var6 = arg3.method541();
            var6.method955(super.field6284, super.field6281, super.field6287);
            return var5.method684(arg2, arg0, var6, false);
        } else {
            if (arg1 < 58) {
                this.field6174 = -53;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "(I)Z")
    public final boolean method169(int arg0) {
        if (arg0 != -28206) {
            this.field6174 = -52;
        }
        ++field6173;
        return this.field6171;
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(I)V")
    public final void method165(int arg0) {
        if (arg0 != -8698) {
            this.method160((byte) 52);
        }
        ++field6160;
        if (this.field6162 != null) {
            this.field6162.method687();
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILza;B)Le;")
    public final class285 method162(int arg0, class295 arg1, byte arg2) {
        if (arg2 != -14) {
            this.field6171 = false;
        }
        ++field6180;
        return this.method2538(arg1, arg0, (byte) -88);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Llb;IZIBILza;)V")
    public final void method161(class186 arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5, class295 arg6) {
        ++field6181;
        if (arg4 >= 54) {
            if (arg0 instanceof class125) {
                class125 var8 = (class125) arg0;
                if (this.field6162 != null && var8.field1926 != null) {
                    this.field6162.method698(var8.field1926, arg1, arg5, arg3, arg2);
                }
            } else {
                if (arg0 instanceof class425) {
                    class425 var9 = (class425) arg0;
                    if (this.field6162 != null && var9.field6162 != null) {
                        this.field6162.method698(var9.field6162, arg1, arg5, arg3, arg2);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uu", name = "f", descriptor = "(I)I")
    public final int method836(int arg0) {
        ++field6165;
        if (arg0 != -32768) {
            return 5;
        } else {
            return this.field6162 == null ? 0 : this.field6162.method670();
        }
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(Lza;I)V")
    public final void method164(class295 arg0, int arg1) {
        ++field6189;
        if (arg1 == 1907) {
            Object var3 = null;
            class197 var5;
            if (this.field6166 == null && this.field6161) {
                class135 var4 = this.method2535(arg0, 262144, true, 83);
                var5 = var4 != null ? var4.field2053 : null;
            } else {
                var5 = this.field6166;
                this.field6166 = null;
            }
            if (var5 != null) {
                class125.method903(var5, this.field6179, super.field6284, super.field6287, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(BLza;)Lql;")
    public final class121 method171(byte arg0, class295 arg1) {
        if (arg0 != -96) {
            return null;
        } else {
            ++field6167;
            if (this.field6162 == null) {
                return null;
            } else {
                class512 var3 = arg1.method541();
                var3.method955(super.field6284, super.field6281, super.field6287);
                class121 var4 = null;
                if (this.field6188) {
                    var4 = class399.method2364(1, -29752);
                }
                this.field6162.method701(var3, var4 == null ? null : var4.field1878[0], 0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "(I)V")
    public final void method168(int arg0) {
        int var2 = -107 / ((43 - arg0) / 56);
        ++field6172;
        this.field6171 = false;
        if (this.field6162 != null) {
            this.field6162.method711(-65537 & this.field6162.method671());
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lza;IZI)Luo;")
    private final class135 method2535(class295 arg0, int arg1, boolean arg2, int arg3) {
        ++field6158;
        class103 var5 = class452.field6629.method603((byte) 124, this.field6174 & 65535);
        class11 var6;
        class11 var7;
        if (!this.field6187) {
            if (~this.field6179 > -4) {
                var6 = class348.field5000[this.field6179 - -1];
            } else {
                var6 = null;
            }
            var7 = class348.field5000[this.field6179];
        } else {
            var6 = class348.field5000[0];
            var7 = class36.field554[this.field6179];
        }
        if (arg3 < 76) {
            field6168 = null;
        }
        return var5.method801(this.field6185 == 11 ? 10 : this.field6185, arg1, super.field6284, false, super.field6281, var6, arg0, var7, super.field6287, this.field6185 != 11 ? this.field6175 : this.field6175 + 4, arg2);
    }

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "(Lza;I)V")
    public final void method166(class295 arg0, int arg1) {
        ++field6170;
        if (arg1 <= 7) {
            field6184 = true;
        }
    }

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "(B)V")
    public static void method2536(byte arg0) {
        field6168 = null;
        if (arg0 >= 12) {
            field6190 = null;
        }
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(Lza;Lpm;IIIIIZIIIIIIZ)V")
    public class425(class295 arg0, class103 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field1668 == 1, class321.method1905(arg13, (byte) -90, arg12));
        this.field6171 = arg14;
        this.field6174 = (short) arg1.field1646;
        this.field6188 = ~arg1.field1697 != -1 && !arg7;
        this.field6187 = arg7;
        this.field6175 = (byte) arg13;
        this.field6179 = (byte) arg3;
        this.field6185 = (byte) arg12;
        this.field6161 = arg0.method498() && arg1.field1614 && !this.field6187 && ~class76.field1075.method1593(class195.field2849, 121) != -1;
        int var16 = 2048;
        if (this.field6171) {
            var16 |= 65536;
        }
        class135 var17 = this.method2535(arg0, var16, this.field6161, 127);
        if (var17 != null) {
            this.field6162 = var17.field2051;
            this.field6166 = var17.field2053;
            if (this.field6171) {
                this.field6162 = this.field6162.method697((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)I")
    public final int method159(int arg0) {
        int var2 = -29 / ((arg0 - 78) / 46);
        ++field6169;
        return this.field6185;
    }

    @OriginalMember(owner = "client!uu", name = "f", descriptor = "(B)I")
    public final int method2537(byte arg0) {
        int var2 = 73 % ((-44 - arg0) / 53);
        ++field6159;
        return this.field6162 != null ? this.field6162.method716() / 4 : 15;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lza;IB)Le;")
    private final class285 method2538(class295 arg0, int arg1, byte arg2) {
        ++field6157;
        if (this.field6162 != null && arg0.method459(this.field6162.method671(), arg1) == 0) {
            return this.field6162;
        } else if (arg2 > -75) {
            return null;
        } else {
            class135 var4 = this.method2535(arg0, arg1, false, 100);
            return var4 != null ? var4.field2051 : null;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)I")
    public final int method170(byte arg0) {
        int var2 = 73 % ((-11 - arg0) / 47);
        ++field6178;
        return this.field6174 & 65535;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(III)I")
    public static final int method2539(int arg0, int arg1, int arg2) {
        ++field6164;
        int var3 = arg2 >>> 24;
        if (arg0 <= 31) {
            return -108;
        } else {
            int var4 = 255 - var3;
            int var5 = (16711680 & (65280 & arg2) * var3 | -16711936 & (arg2 & 16711935) * var3) >>> 8;
            return ((16711680 & (65280 & arg1) * var4 | (16711935 & arg1) * var4 & -16711936) >>> 8) + var5;
        }
    }

    static {
        new class157("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
    }
}
