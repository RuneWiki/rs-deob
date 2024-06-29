import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class50 extends class182 {

    @OriginalMember(owner = "client!ui", name = "X", descriptor = "Ljava/lang/String;")
    public static String field855 = "K";

    @OriginalMember(owner = "client!ui", name = "Z", descriptor = "Z")
    public static boolean field857 = false;

    @OriginalMember(owner = "client!ui", name = "Y", descriptor = "I")
    public static int field856 = 0;

    @OriginalMember(owner = "client!ui", name = "O", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!ui", name = "P", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!ui", name = "Q", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!ui", name = "R", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!ui", name = "S", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!ui", name = "T", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!ui", name = "U", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!ui", name = "V", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!ui", name = "W", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V")
    public class50() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIII)V")
    public static final void method321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field853;
        if (arg1 == arg5) {
            class269.method1892(arg0, 1, arg4, arg2, arg5);
        } else {
            int var6 = -48 / ((arg3 - 77) / 46);
            if (class23.field423 <= arg0 - arg5 && ~(arg0 + arg5) >= ~class272.field4552 && -arg1 + arg4 >= class55.field972 && ~(arg4 - -arg1) >= ~class240.field4053) {
                class108.method808(arg0, arg1, arg5, arg4, arg2, (byte) 112);
            } else {
                class251.method1828(arg1, arg5, arg0, arg4, arg2, 14804);
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BII)V")
    private final void method322(byte arg0, int arg1, int arg2) {
        int var4 = class207.field3415[arg2];
        ++field851;
        int var5 = class66.field1112[arg1];
        if (arg0 >= -104) {
            field856 = -106;
        }
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class131.field2165 = arg1;
            class160.field2611 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class131.field2165 = arg2;
            class160.field2611 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class131.field2165 = arg2;
            class160.field2611 = class4.field116 - arg1;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class131.field2165 = -arg1 + class16.field318;
            class160.field2611 = arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class131.field2165 = class16.field318 - arg1;
            class160.field2611 = -arg2 + class4.field116;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class131.field2165 = class16.field318 - arg2;
            class160.field2611 = -arg1 + class4.field116;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class160.field2611 = arg1;
            class131.field2165 = -arg2 + class16.field318;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class160.field2611 = -arg2 + class4.field116;
            class131.field2165 = arg1;
        }
        class160.field2611 &= class103.field1644;
        class131.field2165 &= class107.field1749;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(BI)V")
    public static final void method323(byte arg0, int arg1) {
        class149.field2467.method98(1, arg1);
        ++field852;
        if (arg0 != -69) {
            field856 = 62;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZI)[I")
    public final int[] method153(boolean arg0, int arg1) {
        ++field849;
        int[] var3 = super.field2911.method77(arg1, -106);
        if (super.field2911.field287) {
            for (int var4 = 0; ~class4.field116 < ~var4; ++var4) {
                this.method322((byte) -128, arg1, var4);
                int[] var5 = this.method1323(0, -17707, class131.field2165);
                var3[var4] = var5[class160.field2611];
            }
        }
        if (arg0) {
            field848 = 14;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZLab;I)V")
    public final void method155(boolean arg0, class249 arg1, int arg2) {
        if (arg2 == 0) {
            super.field2896 = ~arg1.method1802((byte) -108) == -2;
        }
        if (!arg0) {
            ++field850;
        }
    }

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "(I)V")
    public static void method324(int arg0) {
        field855 = null;
        int var1 = -29 % ((67 - arg0) / 34);
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)Z")
    public static final boolean method325(byte arg0) throws IOException {
        ++field854;
        if (class159.field2609 == null) {
            return false;
        } else {
            int var1 = class159.field2609.method1065(arg0 ^ -86);
            if (~var1 == -1) {
                return false;
            } else {
                if (class131.field2170 == -1) {
                    --var1;
                    class159.field2609.method1069(1, class136.field2239.field4182, 0, arg0 + 6013);
                    class136.field2239.field4160 = 0;
                    class131.field2170 = class136.field2239.method630(true);
                    class150.field2480 = class234.field3960[class131.field2170];
                }
                if (~class150.field2480 == 0) {
                    if (var1 <= 0) {
                        return false;
                    }
                    --var1;
                    class159.field2609.method1069(1, class136.field2239.field4182, 0, arg0 + 6013);
                    class150.field2480 = class136.field2239.field4182[0] & 255;
                }
                if (~class150.field2480 == 1) {
                    if (var1 <= 1) {
                        return false;
                    }
                    var1 -= 2;
                    class159.field2609.method1069(2, class136.field2239.field4182, 0, 6056);
                    class136.field2239.field4160 = 0;
                    class150.field2480 = class136.field2239.method1821((byte) 51);
                }
                if (var1 < class150.field2480) {
                    return false;
                } else {
                    class136.field2239.field4160 = 0;
                    class159.field2609.method1069(class150.field2480, class136.field2239.field4182, 0, 6056);
                    class243.field4073 = 0;
                    class275.field4586 = class158.field2583;
                    class158.field2583 = class169.field2731;
                    class169.field2731 = class131.field2170;
                    if (~class131.field2170 == -65) {
                        class80.method557(-107);
                        int var2 = class136.field2239.method1794((byte) 74);
                        int var3 = class136.field2239.method1800(arg0 + 42);
                        int var4 = class136.field2239.method1794((byte) 64);
                        class250.field4238[var2] = var3;
                        class231.field3914[var2] = var4;
                        class111.field1831[var2] = 1;
                        for (int var5 = 0; ~var5 > -99; ++var5) {
                            if (class244.field4094[var5] <= var3) {
                                class111.field1831[var2] = var5 + 2;
                            }
                        }
                        class76.field1301[class15.method84(class145.field2386++, 31)] = var2;
                        class131.field2170 = -1;
                        return true;
                    } else if (class131.field2170 == 52) {
                        int var6 = class136.field2239.method1806(-1);
                        int var7 = class136.field2239.method1821((byte) 51);
                        if (var7 == 65535) {
                            var7 = -1;
                        }
                        int var8 = class136.field2239.method1804(arg0 + 49);
                        int var9 = class136.field2239.method1804(87);
                        int var10 = class136.field2239.method1818(false);
                        if (~var10 == -65536) {
                            var10 = -1;
                        }
                        if (class219.method1558((byte) 90, var6)) {
                            for (int var11 = var7; ~var11 >= ~var10; ++var11) {
                                long var12 = ((long) var9 << 32) + (long) var11;
                                class20 var14 = (class20) class121.field2021.method987(-109, var12);
                                class20 var15;
                                if (var14 != null) {
                                    var15 = new class20(var8, var14.field360);
                                    var14.method993(32);
                                } else if (var11 == -1) {
                                    var15 = new class20(var8, class222.method1574(119, var9).field3407.field360);
                                } else {
                                    var15 = new class20(var8, -1);
                                }
                                class121.field2021.method986(var12, true, var15);
                            }
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (~class131.field2170 == -122) {
                        int var16 = class136.field2239.method1804(arg0 ^ 68);
                        class11.field199 = class142.field2344.method573(arg0 + -43, var16);
                        class131.field2170 = -1;
                        return true;
                    } else if (class131.field2170 == 132) {
                        int var17 = class136.field2239.method1800(-93);
                        int var18 = class136.field2239.method1787(arg0 ^ -44);
                        int var19 = class136.field2239.method1787(arg0 + -44);
                        int var20 = class136.field2239.method1806(-1);
                        if (var17 >> 30 == 0) {
                            if (var17 >> 29 == 0) {
                                if (var17 >> 28 != 0) {
                                    int var21 = 65535 & var17;
                                    class123 var22;
                                    if (class297.field4860 != var21) {
                                        var22 = class15.field300[var21];
                                    } else {
                                        var22 = class16.field314;
                                    }
                                    if (var22 != null) {
                                        if (var18 == 65535) {
                                            var18 = -1;
                                        }
                                        boolean var23 = true;
                                        if (var18 != -1 && ~var22.field757 != 0) {
                                            if (~var22.field757 != ~var18) {
                                                class84 var24 = class258.method1847(-122, var18);
                                                class84 var25 = class258.method1847(-122, var22.field757);
                                                if (~var24.field1404 != 0 && ~var25.field1404 != 0) {
                                                    class163 var26 = class34.method211(var24.field1404, 3);
                                                    class163 var27 = class34.method211(var25.field1404, 3);
                                                    if (~var26.field2662 > ~var27.field2662) {
                                                        var23 = false;
                                                    }
                                                }
                                            } else {
                                                class84 var28 = class258.method1847(-128, var18);
                                                if (var28.field1409 && var28.field1404 != -1) {
                                                    class163 var29 = class34.method211(var28.field1404, 3);
                                                    int var30 = var29.field2658;
                                                    if (var30 == 1) {
                                                        var22.field736 = 0;
                                                        var22.field751 = class275.field4598 - -var19;
                                                        var22.field747 = 0;
                                                        var22.field742 = 1;
                                                        var22.field767 = 0;
                                                        var23 = false;
                                                        class131.method980(false, var22.field771, var22.field715, var22.field747, (byte) -93, var29);
                                                    } else if (~var30 == -3) {
                                                        var23 = false;
                                                        var22.field804 = 0;
                                                    }
                                                }
                                            }
                                        }
                                        if (var23) {
                                            var22.field757 = var18;
                                            var22.field727 = var20;
                                            var22.field747 = 0;
                                            var22.field767 = 0;
                                            if (var22.field757 == 65535) {
                                                var22.field757 = -1;
                                            }
                                            var22.field751 = class275.field4598 + var19;
                                            var22.field742 = 1;
                                            if (~var22.field751 < ~class275.field4598) {
                                                var22.field747 = -1;
                                            }
                                            if (var22.field757 != -1 && ~class275.field4598 == ~var22.field751) {
                                                int var31 = class258.method1847(-122, var22.field757).field1404;
                                                if (~var31 != 0) {
                                                    class163 var32 = class34.method211(var31, 3);
                                                    if (var32 != null && var32.field2639 != null) {
                                                        class131.method980(class16.field314 == var22, var22.field771, var22.field715, 0, (byte) -95, var32);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                int var33 = 65535 & var17;
                                class307 var34 = class57.field1002[var33];
                                if (var34 != null) {
                                    boolean var35 = true;
                                    if (~var18 == -65536) {
                                        var18 = -1;
                                    }
                                    if (var18 != -1 && var34.field757 != -1) {
                                        if (~var34.field757 != ~var18) {
                                            class84 var36 = class258.method1847(-116, var18);
                                            class84 var37 = class258.method1847(-124, var34.field757);
                                            if (~var36.field1404 != 0 && ~var37.field1404 != 0) {
                                                class163 var38 = class34.method211(var36.field1404, 3);
                                                class163 var39 = class34.method211(var37.field1404, arg0 ^ 40);
                                                if (~var38.field2662 > ~var39.field2662) {
                                                    var35 = false;
                                                }
                                            }
                                        } else {
                                            class84 var40 = class258.method1847(-124, var18);
                                            if (var40.field1409 && var40.field1404 != -1) {
                                                class163 var41 = class34.method211(var40.field1404, 3);
                                                int var42 = var41.field2658;
                                                if (~var42 != -2) {
                                                    if (var42 == 2) {
                                                        var34.field804 = 0;
                                                        var35 = false;
                                                    }
                                                } else {
                                                    var35 = false;
                                                    var34.field767 = 0;
                                                    var34.field742 = 1;
                                                    var34.field751 = class275.field4598 + var19;
                                                    var34.field736 = 0;
                                                    var34.field747 = 0;
                                                    class131.method980(false, var34.field771, var34.field715, var34.field747, (byte) -111, var41);
                                                }
                                            }
                                        }
                                    }
                                    if (var35) {
                                        var34.field757 = var18;
                                        var34.field727 = var20;
                                        var34.field767 = 0;
                                        var34.field747 = 0;
                                        var34.field742 = 1;
                                        var34.field751 = class275.field4598 + var19;
                                        if (~var34.field751 < ~class275.field4598) {
                                            var34.field747 = -1;
                                        }
                                        if (var34.field757 != -1 && ~class275.field4598 == ~var34.field751) {
                                            int var43 = class258.method1847(arg0 + -168, var34.field757).field1404;
                                            if (var43 != -1) {
                                                class163 var44 = class34.method211(var43, arg0 ^ 40);
                                                if (var44 != null && var44.field2639 != null) {
                                                    class131.method980(false, var34.field771, var34.field715, 0, (byte) -79, var44);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            int var45 = (1006917308 & var17) >> 28;
                            int var46 = (var17 & 16383) + -class78.field1313;
                            int var47 = ((268431647 & var17) >> 14) + -class26.field462;
                            if (var47 >= 0 && var46 >= 0 && ~var47 > -105 && ~var46 > -105) {
                                int var48 = var47 * 128 + 64;
                                int var49 = var46 * 128 + 64;
                                class265 var50 = new class265(var18, var45, var48, var49, -var20 + class277.method1939(var45, var48, var49, (byte) -34), var19, class275.field4598);
                                class181.field2881.method311(124, new class202(var50));
                            }
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (class131.field2170 == 141) {
                        int var51 = class136.field2239.method1787(-1);
                        int var52 = class136.field2239.method1802((byte) 32);
                        class81.method560(32658, var52, var51);
                        class131.field2170 = -1;
                        return true;
                    } else if (~class131.field2170 == -211) {
                        class162.method1198(class150.field2480, (byte) 74, class142.field2344, class136.field2239);
                        class131.field2170 = -1;
                        return true;
                    } else if (~class131.field2170 == -71) {
                        int var53 = class136.field2239.method1815(-1);
                        int var54 = class136.field2239.method1821((byte) 51);
                        int var55 = class136.field2239.method1787(-1);
                        if (class219.method1558((byte) 46, var54)) {
                            class190.method1375(var55, var53, true);
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (~class131.field2170 == -76) {
                        int var56 = class136.field2239.method1800(-96);
                        int var57 = class136.field2239.method1821((byte) 51);
                        class237.method1701(22445, var56, var57);
                        class131.field2170 = -1;
                        return true;
                    } else if (~class131.field2170 == -21) {
                        int var58 = class136.field2239.method1819(arg0 ^ -1741461885);
                        int var59 = class136.field2239.method1800(-69);
                        int var60 = class136.field2239.method1802((byte) 64);
                        String var61 = "";
                        String var62 = var61;
                        if ((1 & var60) != 0) {
                            var61 = class136.field2239.method1769(1);
                            if ((2 & var60) != 0) {
                                var62 = class136.field2239.method1769(1);
                            } else {
                                var62 = var61;
                            }
                        }
                        String var63 = class136.field2239.method1769(arg0 ^ 42);
                        if (!var62.equals("") && class42.method255((byte) -95, var62)) {
                            class131.field2170 = -1;
                            return true;
                        } else {
                            class160.method1192(var62, var58, var59, var61, var63, 1464);
                            class131.field2170 = -1;
                            return true;
                        }
                    } else if (class131.field2170 == 13) {
                        int var64 = class136.field2239.method1802((byte) -120);
                        int var65 = class136.field2239.method1802((byte) -121);
                        byte var66 = class136.field2239.method1768(arg0 ^ 127);
                        if (class240.field4059 != var66) {
                            class131.field2170 = -1;
                            return true;
                        } else {
                            class131.field2170 = -1;
                            if (~var64 != -256) {
                                class130.field2149 = true;
                                class133.field2194 = var64;
                                class163.field2661 = var65;
                            } else {
                                class130.field2149 = false;
                                class133.field2194 = 0;
                                class163.field2661 = 0;
                            }
                            return true;
                        }
                    } else if (class131.field2170 == 84) {
                        int var67 = class136.field2239.method1800(122);
                        int var68 = class136.field2239.method1821((byte) 51);
                        if (~var67 > 69999) {
                            var68 += 32768;
                        }
                        class207 var69;
                        if (~var67 > -1) {
                            var69 = null;
                        } else {
                            var69 = class222.method1574(119, var67);
                        }
                        if (var69 != null) {
                            for (int var70 = 0; var70 < var69.field3421.length; ++var70) {
                                var69.field3421[var70] = 0;
                                var69.field3354[var70] = 0;
                            }
                        }
                        class240.method1723(var68, true);
                        int var71 = class136.field2239.method1821((byte) 51);
                        for (int var72 = 0; var71 > var72; ++var72) {
                            int var73 = class136.field2239.method1767(255);
                            if (~var73 == -256) {
                                var73 = class136.field2239.method1800(-96);
                            }
                            int var74 = class136.field2239.method1787(-1);
                            if (var69 != null && var69.field3421.length > var72) {
                                var69.field3421[var72] = var74;
                                var69.field3354[var72] = var73;
                            }
                            class238.method1702(var68, var72, false, var73, var74 + -1);
                        }
                        if (var69 != null) {
                            class206.method1441(arg0 + -43, var69);
                        }
                        class80.method557(-121);
                        class134.field2207[class15.method84(class76.field1298++, 31)] = class15.method84(32767, var68);
                        class131.field2170 = -1;
                        return true;
                    } else if (~class131.field2170 == -98) {
                        class67.method463(-1, class136.field2239.method1769(1));
                        class131.field2170 = -1;
                        return true;
                    } else if (class131.field2170 == 180) {
                        int var75 = class136.field2239.method1787(-1);
                        int var76 = class136.field2239.method1804(90);
                        class81.method560(32658, var76, var75);
                        class131.field2170 = -1;
                        return true;
                    } else if (~class131.field2170 == -87) {
                        int var77 = class136.field2239.method1787(-1);
                        int var78 = class136.field2239.method1818(false);
                        int var79 = class136.field2239.method1821((byte) 51);
                        if (class219.method1558((byte) 73, var78)) {
                            class86.method605(var77, var79, (byte) 89);
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (~class131.field2170 == -169) {
                        int var80 = class136.field2239.method1818(false);
                        int var81 = class136.field2239.method1802((byte) -99);
                        int var82 = class136.field2239.method1821((byte) 51);
                        int var83 = class136.field2239.method1807((byte) -27);
                        if (class219.method1558((byte) 46, var80)) {
                            class278 var84 = (class278) class306.field4952.method987(arg0 ^ -88, (long) var83);
                            if (var84 != null) {
                                class272.method1917((byte) 74, ~var84.field4622 != ~var82, var84);
                            }
                            class29.method185(var81, var82, var83, arg0 + -43);
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (class131.field2170 == 135) {
                        class190.method1374(false);
                        class80.method557(-123);
                        class236.field3986 += 32;
                        class131.field2170 = -1;
                        return true;
                    } else if (class131.field2170 == 106) {
                        int var85 = class136.field2239.method1806(-1);
                        int var86 = class136.field2239.method1787(-1);
                        int var87 = class136.field2239.method1814(arg0 ^ -44);
                        if (class219.method1558((byte) 106, var85)) {
                            if (~var87 == -3) {
                                class197.method1400(arg0 + -27);
                            }
                            class243.field4082 = var86;
                            class244.method1746((byte) 106, var86);
                            class215.method1536(arg0 + 28899, false);
                            class279.method1955(class243.field4082, 2000000);
                            for (int var88 = 0; ~var88 > -101; ++var88) {
                                class143.field2351[var88] = true;
                            }
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (class131.field2170 == 206) {
                        class217.method1552((byte) 73);
                        class131.field2170 = -1;
                        return true;
                    } else if (class131.field2170 == 204) {
                        int var89 = class136.field2239.method1802((byte) -127);
                        if (class136.field2239.method1802((byte) -108) == 0) {
                            class87.field1436[var89] = new class58();
                        } else {
                            --class136.field2239.field4160;
                            class87.field1436[var89] = new class58(class136.field2239);
                        }
                        class113.field1927 = class196.field3162;
                        class131.field2170 = -1;
                        return true;
                    } else if (~class131.field2170 == -168) {
                        for (int var90 = 0; var90 < class15.field300.length; ++var90) {
                            if (class15.field300[var90] != null) {
                                class15.field300[var90].field761 = -1;
                            }
                        }
                        for (int var91 = 0; var91 < class57.field1002.length; ++var91) {
                            if (class57.field1002[var91] != null) {
                                class57.field1002[var91].field761 = -1;
                            }
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (class131.field2170 == 193) {
                        int var92 = class136.field2239.method1821((byte) 51);
                        if (class219.method1558((byte) 66, var92)) {
                            class183.method1330((byte) 93);
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (~class131.field2170 == -117) {
                        boolean var93 = ~class136.field2239.method1802((byte) 71) == -2;
                        String var94 = class136.field2239.method1769(1);
                        String var95 = var94;
                        if (var93) {
                            var95 = class136.field2239.method1769(1);
                        }
                        long var96 = class136.field2239.method1810((byte) -94);
                        long var98 = (long) class136.field2239.method1821((byte) 51);
                        long var100 = (long) class136.field2239.method1812((byte) 52);
                        int var102 = class136.field2239.method1802((byte) -122);
                        int var103 = class136.field2239.method1821((byte) 51);
                        boolean var104 = false;
                        long var105 = (var98 << 32) - -var100;
                        int var107 = 0;
                        while (true) {
                            if (~var107 <= -101) {
                                if (~var102 >= -2 && class42.method255((byte) -95, var95)) {
                                    var104 = true;
                                }
                                break;
                            }
                            if (class130.field2147[var107] == var105) {
                                var104 = true;
                                break;
                            }
                            ++var107;
                        }
                        if (!var104 && ~class136.field2238 == -1) {
                            class130.field2147[class300.field4899] = var105;
                            class300.field4899 = (class300.field4899 + 1) % 100;
                            String var108 = class263.method1865((byte) -79, var103).method1902(class136.field2239, (byte) -45);
                            if (var102 == 2) {
                                class246.method1755(0, arg0 ^ -44, var103, class241.method1726(var96, arg0 ^ 1901097473), "<img=1>" + var95, 20, "<img=1>" + var94, var108);
                            } else if (~var102 != -2) {
                                class246.method1755(0, -1, var103, class241.method1726(var96, arg0 ^ 1901097473), var95, 20, var94, var108);
                            } else {
                                class246.method1755(0, -1, var103, class241.method1726(var96, 1901097514), "<img=0>" + var95, 20, "<img=0>" + var94, var108);
                            }
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (~class131.field2170 == -9) {
                        String var109 = class136.field2239.method1769(arg0 ^ 42);
                        boolean var110 = ~class136.field2239.method1802((byte) 110) == -2;
                        String var111;
                        if (!var110) {
                            var111 = var109;
                        } else {
                            var111 = class136.field2239.method1769(1);
                        }
                        int var112 = class136.field2239.method1821((byte) 51);
                        byte var113 = class136.field2239.method1768(90);
                        boolean var114 = false;
                        if (var113 == -128) {
                            var114 = true;
                        }
                        if (!var114) {
                            String var115 = class136.field2239.method1769(arg0 + -42);
                            class80 var116 = new class80();
                            var116.field1339 = var113;
                            var116.field1346 = var115;
                            var116.field1349 = var109;
                            var116.field1337 = var112;
                            var116.field1343 = var111;
                            int var117;
                            for (var117 = class34.field549 + -1; ~var117 <= -1; --var117) {
                                int var118 = class272.field4534[var117].field1343.compareTo(var116.field1343);
                                if (~var118 == -1) {
                                    class272.field4534[var117].field1337 = var112;
                                    class272.field4534[var117].field1339 = var113;
                                    class272.field4534[var117].field1346 = var115;
                                    if (var111.equals(class16.field314.field2069)) {
                                        class130.field2157 = var113;
                                    }
                                    class131.field2170 = -1;
                                    class146.field2409 = class196.field3162;
                                    return true;
                                }
                                if (~var118 > -1) {
                                    break;
                                }
                            }
                            if (class272.field4534.length <= class34.field549) {
                                class131.field2170 = -1;
                                return true;
                            }
                            for (int var119 = class34.field549 + -1; var119 > var117; --var119) {
                                class272.field4534[var119 + 1] = class272.field4534[var119];
                            }
                            if (class34.field549 == 0) {
                                class272.field4534 = new class80[100];
                            }
                            class272.field4534[var117 + 1] = var116;
                            ++class34.field549;
                            if (var111.equals(class16.field314.field2069)) {
                                class130.field2157 = var113;
                            }
                        } else {
                            if (~class34.field549 == -1) {
                                class131.field2170 = -1;
                                return true;
                            }
                            boolean var120 = false;
                            int var121;
                            for (var121 = 0; ~class34.field549 < ~var121 && (!class272.field4534[var121].field1343.equals(var111) || class272.field4534[var121].field1337 != var112); ++var121) {
                            }
                            if (class34.field549 > var121) {
                                while (~(class34.field549 - 1) < ~var121) {
                                    class272.field4534[var121] = class272.field4534[var121 + 1];
                                    ++var121;
                                }
                                --class34.field549;
                                class272.field4534[class34.field549] = null;
                            }
                        }
                        class146.field2409 = class196.field3162;
                        class131.field2170 = -1;
                        return true;
                    } else if (class131.field2170 == 255) {
                        int var122 = class136.field2239.method1800(arg0 ^ 69);
                        int var123 = class136.field2239.method1821((byte) 51);
                        class207 var124;
                        if (var122 >= 0) {
                            var124 = class222.method1574(108, var122);
                        } else {
                            var124 = null;
                        }
                        if (var122 < -70000) {
                            var123 += 32768;
                        }
                        while (~class136.field2239.field4160 > ~class150.field2480) {
                            int var125 = class136.field2239.method1819(-1741461848);
                            int var126 = class136.field2239.method1821((byte) 51);
                            int var127 = 0;
                            if (~var126 != -1) {
                                var127 = class136.field2239.method1802((byte) -119);
                                if (~var127 == -256) {
                                    var127 = class136.field2239.method1800(arg0 ^ -105);
                                }
                            }
                            if (var124 != null && var125 >= 0 && ~var124.field3421.length < ~var125) {
                                var124.field3421[var125] = var126;
                                var124.field3354[var125] = var127;
                            }
                            class238.method1702(var123, var125, false, var127, var126 + -1);
                        }
                        if (var124 != null) {
                            class206.method1441(0, var124);
                        }
                        class80.method557(arg0 ^ -78);
                        class134.field2207[class15.method84(class76.field1298++, 31)] = class15.method84(var123, 32767);
                        class131.field2170 = -1;
                        return true;
                    } else if (class131.field2170 == 76) {
                        class163.field2643 = class136.field2239.method1802((byte) -119);
                        class131.field2170 = -1;
                        class293.field4824 = class196.field3162;
                        return true;
                    } else if (~class131.field2170 == -10) {
                        String var128 = class136.field2239.method1769(1);
                        String var129 = class165.method1238(class95.method677(class151.method1144(class136.field2239, 865122384), arg0 + -43));
                        class160.method1192(var128, 6, 0, var128, var129, arg0 + 1421);
                        class131.field2170 = -1;
                        return true;
                    } else if (~class131.field2170 == -100) {
                        int var130 = class136.field2239.method1800(arg0 ^ -113);
                        class207 var131 = class222.method1574(121, var130);
                        for (int var132 = 0; var131.field3421.length > var132; ++var132) {
                            var131.field3421[var132] = -1;
                            var131.field3421[var132] = 0;
                        }
                        class206.method1441(arg0 ^ 43, var131);
                        class131.field2170 = -1;
                        return true;
                    } else if (class131.field2170 == 91) {
                        int var133 = class136.field2239.method1818(false);
                        int var134 = class136.field2239.method1787(arg0 ^ -44);
                        int var135 = class136.field2239.method1821((byte) 51);
                        int var136 = class136.field2239.method1807((byte) -27);
                        if (class219.method1558((byte) 95, var133)) {
                            class168.method1256(arg0 + 21, (var134 << 16) - -var135, var136);
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (~class131.field2170 == -16) {
                        int var137 = class136.field2239.method1821((byte) 51);
                        int var138 = class136.field2239.method1802((byte) 85);
                        int var139 = class136.field2239.method1802((byte) -96);
                        int var140 = class136.field2239.method1821((byte) 51);
                        int var141 = class136.field2239.method1802((byte) -115);
                        int var142 = class136.field2239.method1802((byte) 38);
                        if (class219.method1558((byte) 49, var137)) {
                            class87.method609(true, var141, var138, var139, (byte) 121, var140, var142);
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (class131.field2170 == 137) {
                        int var143 = class136.field2239.method1821((byte) 51);
                        if (class219.method1558((byte) 51, var143)) {
                            class189.method1363(true);
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (class131.field2170 == 69) {
                        int var144 = class136.field2239.method1787(-1);
                        String var145 = class136.field2239.method1769(arg0 + -42);
                        int var146 = class136.field2239.method1787(arg0 ^ -44);
                        if (class219.method1558((byte) 121, var144)) {
                            class78.method549(var145, var146, (byte) -114);
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (class131.field2170 == 110) {
                        boolean var147 = ~class136.field2239.method1802((byte) 33) == -2;
                        String var148 = class136.field2239.method1769(arg0 + -42);
                        String var149 = var148;
                        if (var147) {
                            var149 = class136.field2239.method1769(1);
                        }
                        boolean var150 = false;
                        long var151 = (long) class136.field2239.method1821((byte) 51);
                        long var153 = (long) class136.field2239.method1812((byte) 52);
                        int var155 = class136.field2239.method1802((byte) -127);
                        long var156 = (var151 << 32) + var153;
                        int var158 = class136.field2239.method1821((byte) 51);
                        int var159 = 0;
                        while (true) {
                            if (~var159 <= -101) {
                                if (var155 <= 1 && class42.method255((byte) -95, var149)) {
                                    var150 = true;
                                }
                                break;
                            }
                            if (class130.field2147[var159] == var156) {
                                var150 = true;
                                break;
                            }
                            ++var159;
                        }
                        if (!var150 && class136.field2238 == 0) {
                            class130.field2147[class300.field4899] = var156;
                            class300.field4899 = (class300.field4899 + 1) % 100;
                            String var160 = class263.method1865((byte) -79, var158).method1902(class136.field2239, (byte) -122);
                            if (~var155 == -3) {
                                class246.method1755(0, -1, var158, (String) null, "<img=1>" + var149, 18, "<img=1>" + var148, var160);
                            } else if (var155 == 1) {
                                class246.method1755(0, -1, var158, (String) null, "<img=0>" + var149, 18, "<img=0>" + var148, var160);
                            } else {
                                class246.method1755(0, -1, var158, (String) null, var149, 18, var148, var160);
                            }
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (~class131.field2170 == -108) {
                        int var161 = class136.field2239.method1787(arg0 ^ -44);
                        int var162 = class136.field2239.method1787(-1);
                        if (~var162 == -65536) {
                            var162 = -1;
                        }
                        int var163 = class136.field2239.method1807((byte) -27);
                        if (class219.method1558((byte) 56, var161)) {
                            class205.method1436(var163, 2, -1, 38, var162);
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (class131.field2170 == 126) {
                        int var164 = class136.field2239.method1806(-1);
                        int var165 = class136.field2239.method1787(-1);
                        int var166 = class136.field2239.method1818(false);
                        int var167 = class136.field2239.method1806(-1);
                        int var168 = class136.field2239.method1804(92);
                        if (class219.method1558((byte) 51, var164)) {
                            class140.method1036(var166, var168, var165, var167, (byte) -11);
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (~class131.field2170 == -31) {
                        int var169 = class136.field2239.method1802((byte) -87);
                        int var170 = var169 >> 5;
                        int var171 = 31 & var169;
                        if (~var171 == -1) {
                            class250.field4234[var170] = null;
                            class131.field2170 = -1;
                            return true;
                        } else {
                            class245 var172 = new class245();
                            var172.field4110 = var171;
                            var172.field4103 = class136.field2239.method1802((byte) 122);
                            if (~var172.field4103 <= -1 && ~var172.field4103 > ~class248.field4149.length) {
                                if (~var172.field4110 != -2 && var172.field4110 != 10) {
                                    if (~var172.field4110 <= -3 && var172.field4110 <= 6) {
                                        if (var172.field4110 == 2) {
                                            var172.field4119 = 64;
                                            var172.field4121 = 64;
                                        }
                                        if (~var172.field4110 == -4) {
                                            var172.field4121 = 0;
                                            var172.field4119 = 64;
                                        }
                                        if (var172.field4110 == 4) {
                                            var172.field4121 = 128;
                                            var172.field4119 = 64;
                                        }
                                        if (var172.field4110 == 5) {
                                            var172.field4119 = 0;
                                            var172.field4121 = 64;
                                        }
                                        if (~var172.field4110 == -7) {
                                            var172.field4121 = 64;
                                            var172.field4119 = 128;
                                        }
                                        var172.field4110 = 2;
                                        var172.field4105 = class136.field2239.method1821((byte) 51);
                                        var172.field4115 = class136.field2239.method1821((byte) 51);
                                        var172.field4109 = class136.field2239.method1802((byte) -118);
                                        var172.field4106 = class136.field2239.method1821((byte) 51);
                                    }
                                } else {
                                    var172.field4111 = class136.field2239.method1821((byte) 51);
                                    class136.field2239.field4160 += 5;
                                }
                                var172.field4107 = class136.field2239.method1821((byte) 51);
                                if (~var172.field4107 == -65536) {
                                    var172.field4107 = -1;
                                }
                                class250.field4234[var170] = var172;
                            }
                            class131.field2170 = -1;
                            return true;
                        }
                    } else if (~class131.field2170 == -204) {
                        if (class243.field4082 != -1) {
                            class179.method1305((byte) 69, class243.field4082, 0);
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (~class131.field2170 == -113) {
                        boolean var173 = class136.field2239.method1802((byte) 121) == 1;
                        String var174 = class136.field2239.method1769(1);
                        String var175 = class136.field2239.method1769(1);
                        int var176 = class136.field2239.method1821((byte) 51);
                        String var177 = "";
                        boolean var178 = false;
                        int var179 = class136.field2239.method1802((byte) -123);
                        if (var176 > 0) {
                            var177 = class136.field2239.method1769(1);
                            var178 = ~class136.field2239.method1802((byte) -115) == -2;
                        }
                        for (int var180 = 0; ~var180 > ~class76.field1296; ++var180) {
                            if (!var173) {
                                if (var174.equals(class190.field3040[var180])) {
                                    if (~class217.field3659[var180] != ~var176) {
                                        class217.field3659[var180] = var176;
                                        if (var176 > 0) {
                                            class160.method1192("", 5, 0, "", var174 + class88.field1457, 1464);
                                        }
                                        if (~var176 == -1) {
                                            class160.method1192("", 5, 0, "", var174 + class302.field4919, arg0 ^ 1427);
                                        }
                                    }
                                    var174 = null;
                                    class94.field1537[var180] = var175;
                                    class108.field1784[var180] = var177;
                                    class5.field123[var180] = var179;
                                    class283.field4675[var180] = var178;
                                    break;
                                }
                            } else if (var175.equals(class190.field3040[var180])) {
                                class190.field3040[var180] = var174;
                                var174 = null;
                                class94.field1537[var180] = var175;
                                break;
                            }
                        }
                        if (var174 != null && ~class76.field1296 > -201) {
                            class190.field3040[class76.field1296] = var174;
                            class94.field1537[class76.field1296] = var175;
                            class217.field3659[class76.field1296] = var176;
                            class108.field1784[class76.field1296] = var177;
                            class5.field123[class76.field1296] = var179;
                            class283.field4675[class76.field1296] = var178;
                            ++class76.field1296;
                        }
                        class293.field4824 = class196.field3162;
                        boolean var181 = false;
                        int var182 = class76.field1296;
                        while (var182 > 0) {
                            boolean var183 = true;
                            --var182;
                            for (int var184 = 0; var182 > var184; ++var184) {
                                if (~class217.field3659[var184] != ~class251.field4250 && ~class217.field3659[var184 - -1] == ~class251.field4250 || ~class217.field3659[var184] == -1 && class217.field3659[var184 - -1] != 0) {
                                    var183 = false;
                                    int var185 = class217.field3659[var184];
                                    class217.field3659[var184] = class217.field3659[var184 + 1];
                                    class217.field3659[var184 + 1] = var185;
                                    String var186 = class108.field1784[var184];
                                    class108.field1784[var184] = class108.field1784[var184 + 1];
                                    class108.field1784[var184 + 1] = var186;
                                    String var187 = class190.field3040[var184];
                                    class190.field3040[var184] = class190.field3040[var184 + 1];
                                    class190.field3040[var184 + 1] = var187;
                                    String var188 = class94.field1537[var184];
                                    class94.field1537[var184] = class94.field1537[var184 - -1];
                                    class94.field1537[var184 + 1] = var188;
                                    int var189 = class5.field123[var184];
                                    class5.field123[var184] = class5.field123[var184 + 1];
                                    class5.field123[var184 + 1] = var189;
                                    boolean var190 = class283.field4675[var184];
                                    class283.field4675[var184] = class283.field4675[var184 + 1];
                                    class283.field4675[var184 + 1] = var190;
                                }
                            }
                            if (var183) {
                                break;
                            }
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (class131.field2170 == 88) {
                        int var191 = class136.field2239.method1800(arg0 ^ 86);
                        int var192 = class136.field2239.method1821((byte) 51);
                        if (class219.method1558((byte) 76, var192)) {
                            class205.method1436(var191, 5, 0, 39, 2047);
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (class131.field2170 == 57) {
                        class16.field330 = class136.field2239.method1794((byte) -70);
                        class23.field413 = class136.field2239.method1794((byte) 83);
                        class131.field2170 = -1;
                        return true;
                    } else if (class131.field2170 == 188) {
                        int var193 = class136.field2239.method1806(-1);
                        int var194 = class136.field2239.method1821((byte) 51);
                        int var195 = class136.field2239.method1804(82);
                        if (class219.method1558((byte) 117, var194)) {
                            class232.method1670(false, var195, var193);
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (~class131.field2170 == -7) {
                        int var196 = class136.field2239.method1821((byte) 51);
                        int var197 = class136.field2239.method1807((byte) -27);
                        if (class219.method1558((byte) 87, var196)) {
                            int var198 = 0;
                            if (class16.field314.field2081 != null) {
                                var198 = class16.field314.field2081.method1985((byte) -78);
                            }
                            class205.method1436(var197, 3, -1, arg0 ^ 33, var198);
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (class131.field2170 == 230) {
                        int var199 = class136.field2239.method1818(false);
                        class183.method1331(var199, -1);
                        class134.field2207[class15.method84(31, class76.field1298++)] = class15.method84(32767, var199);
                        class131.field2170 = -1;
                        return true;
                    } else if (~class131.field2170 == -32) {
                        int var200 = class136.field2239.method1815(-1);
                        int var201 = class136.field2239.method1806(-1);
                        int var202 = class136.field2239.method1763(arg0 + -44);
                        if (class219.method1558((byte) 109, var201)) {
                            class190.method1370(var200, (byte) 65, var202);
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (class131.field2170 == 47) {
                        class23.field413 = class136.field2239.method1767(255);
                        class16.field330 = class136.field2239.method1767(255);
                        for (int var203 = class16.field330; ~(class16.field330 + 8) < ~var203; ++var203) {
                            for (int var205 = class23.field413; ~(class23.field413 + 8) < ~var205; ++var205) {
                                if (class125.field2101[class182.field2898][var203][var205] != null) {
                                    class125.field2101[class182.field2898][var203][var205] = null;
                                    class89.method620(var205, false, var203);
                                }
                            }
                        }
                        for (class248 var204 = (class248) class21.field387.method309(arg0 + -43); var204 != null; var204 = (class248) class21.field387.method312((byte) -115)) {
                            if (var204.field4132 >= class16.field330 && ~var204.field4132 > ~(class16.field330 + 8) && class23.field413 <= var204.field4146 && class23.field413 + 8 > var204.field4146 && ~class182.field2898 == ~var204.field4140) {
                                var204.field4145 = 0;
                            }
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (~class131.field2170 == -80) {
                        int var206 = class136.field2239.method1818(false);
                        int var207 = class136.field2239.method1794((byte) -113);
                        if (var206 == 65535) {
                            var206 = -1;
                        }
                        class166.method1241(var207, (byte) -127, var206);
                        class131.field2170 = -1;
                        return true;
                    } else if (class131.field2170 == 94) {
                        int var208 = class136.field2239.method1794((byte) -115);
                        int var209 = class136.field2239.method1764(arg0 + -40);
                        int var210 = class136.field2239.method1821((byte) 51);
                        if (~var210 == -65536) {
                            var210 = -1;
                        }
                        class223.method1586(0, var210, var209, var208);
                        class131.field2170 = -1;
                        return true;
                    } else if (class131.field2170 == 25) {
                        String var211 = class136.field2239.method1769(1);
                        int var212 = class136.field2239.method1821((byte) 51);
                        String var213 = class263.method1865((byte) -79, var212).method1902(class136.field2239, (byte) -107);
                        class246.method1755(0, -1, var212, (String) null, var211, 19, var211, var213);
                        class131.field2170 = -1;
                        return true;
                    } else if (~class131.field2170 == -109) {
                        class86.field1425 = class136.field2239.method1802((byte) 52);
                        for (int var214 = 0; class86.field1425 > var214; ++var214) {
                            class180.field2876[var214] = class136.field2239.method1769(1);
                            class122.field2043[var214] = class136.field2239.method1769(1);
                            if (class122.field2043[var214].equals("")) {
                                class122.field2043[var214] = class180.field2876[var214];
                            }
                            class122.field2045[var214] = class136.field2239.method1769(1);
                            class152.field2533[var214] = class136.field2239.method1769(1);
                            if (class152.field2533[var214].equals("")) {
                                class152.field2533[var214] = class122.field2045[var214];
                            }
                            class88.field1455[var214] = false;
                        }
                        class131.field2170 = -1;
                        class293.field4824 = class196.field3162;
                        return true;
                    } else if (~class131.field2170 == -216) {
                        int var215 = class136.field2239.method1767(255);
                        int var216 = class136.field2239.method1814(arg0 ^ -44);
                        int var217 = class136.field2239.method1814(-1);
                        class182.field2898 = var217 >> 1;
                        class16.field314.method919(var215, var216, ~(1 & var217) == -2, false);
                        class131.field2170 = -1;
                        return true;
                    } else if (~class131.field2170 == -242) {
                        int var218 = class136.field2239.method1815(-1);
                        int var219 = class136.field2239.method1804(97);
                        int var220 = class136.field2239.method1818(false);
                        int var221 = class136.field2239.method1787(-1);
                        if (class219.method1558((byte) 116, var221)) {
                            class205.method1436(var219, 5, var218, 116, var220);
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (class131.field2170 == 80) {
                        int var222 = class136.field2239.method1821((byte) 51);
                        int var223 = class136.field2239.method1802((byte) 58);
                        int var224 = class136.field2239.method1802((byte) -85);
                        int var225 = class136.field2239.method1802((byte) -87);
                        int var226 = class136.field2239.method1802((byte) -119);
                        int var227 = class136.field2239.method1821((byte) 51);
                        if (class219.method1558((byte) 49, var222)) {
                            class71.field1210[var223] = true;
                            class206.field3314[var223] = var224;
                            class219.field3699[var223] = var225;
                            class254.field4314[var223] = var226;
                            class203.field3254[var223] = var227;
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (~class131.field2170 == -115) {
                        byte[] var228 = new byte[class150.field2480];
                        class136.field2239.method632(0, var228, class150.field2480, arg0 ^ 4766);
                        String var229 = class248.method1758(0, class150.field2480, 18532, var228);
                        if (class64.field1086 != null || ~class83.field1378 != -4 && class83.field1374.startsWith("win") && !class49.field845) {
                            class47.field818 = true;
                            class100.field1595 = var229;
                            class220.field3703 = class142.field2344.method585((byte) 122, var229);
                        } else {
                            class107.method801(true, (byte) 119, var229);
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (class131.field2170 == 136) {
                        String var230 = class136.field2239.method1769(arg0 + -42);
                        int var231 = class136.field2239.method1818(false);
                        int var232 = class136.field2239.method1787(-1);
                        if (class219.method1558((byte) 85, var232)) {
                            class78.method549(var230, var231, (byte) 21);
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (class131.field2170 == 162) {
                        byte var233 = class136.field2239.method1770(-128);
                        int var234 = class136.field2239.method1787(-1);
                        int var235 = class136.field2239.method1821((byte) 51);
                        if (class219.method1558((byte) 66, var234)) {
                            class313.method2121(var235, 1, var233);
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (~class131.field2170 == -193) {
                        int var236 = class136.field2239.method1806(-1);
                        int var237 = class136.field2239.method1767(255);
                        int var238 = class136.field2239.method1818(false);
                        class307 var239 = class57.field1002[var236];
                        if (var239 != null) {
                            class182.method1326(var239, var238, var237, 229);
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (class131.field2170 == 182) {
                        class155.field2572 = 30 * class136.field2239.method1787(arg0 + -44);
                        class228.field3856 = class196.field3162;
                        class131.field2170 = -1;
                        return true;
                    } else if (class131.field2170 == 225) {
                        int var240 = class136.field2239.method1802((byte) 105);
                        int var241 = class136.field2239.method1821((byte) 51);
                        if (class219.method1558((byte) 91, var241)) {
                            class20.field364 = var240;
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (~class131.field2170 == -62) {
                        int var242 = class136.field2239.method1787(-1);
                        byte var243 = class136.field2239.method1768(arg0 ^ 74);
                        class237.method1701(arg0 + 22402, var243, var242);
                        class131.field2170 = -1;
                        return true;
                    } else if (~class131.field2170 == -79) {
                        int var244 = class136.field2239.method1821((byte) 51);
                        int var245 = class136.field2239.method1802((byte) -118);
                        int var246 = class136.field2239.method1802((byte) -120);
                        int var247 = class136.field2239.method1821((byte) 51);
                        int var248 = class136.field2239.method1802((byte) 79);
                        int var249 = class136.field2239.method1802((byte) -116);
                        if (class219.method1558((byte) 61, var244)) {
                            class119.method901(var247, var249, var245, arg0 ^ -29358, var246, var248);
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (class131.field2170 == 211) {
                        class95.method678(true, -5913);
                        class131.field2170 = -1;
                        return true;
                    } else if (class131.field2170 == 122) {
                        int var250 = class136.field2239.method1787(-1);
                        int var251 = class136.field2239.method1821((byte) 51);
                        int var252 = class136.field2239.method1807((byte) -27);
                        if (var251 == 65535) {
                            var251 = -1;
                        }
                        if (class219.method1558((byte) 99, var250)) {
                            class205.method1436(var252, 1, -1, 125, var251);
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (class131.field2170 == 72) {
                        int var253 = class136.field2239.method1806(-1);
                        if (~var253 == -65536) {
                            var253 = -1;
                        }
                        int var254 = class136.field2239.method1804(86);
                        int var255 = class136.field2239.method1818(false);
                        int var256 = class136.field2239.method1821((byte) 51);
                        if (var256 == 65535) {
                            var256 = -1;
                        }
                        int var257 = class136.field2239.method1787(-1);
                        if (class219.method1558((byte) 116, var255)) {
                            for (int var258 = var256; ~var258 >= ~var253; ++var258) {
                                long var259 = ((long) var254 << 32) + (long) var258;
                                class20 var261 = (class20) class121.field2021.method987(-126, var259);
                                class20 var262;
                                if (var261 != null) {
                                    var262 = new class20(var261.field371, var257);
                                    var261.method993(32);
                                } else if (var258 == -1) {
                                    var262 = new class20(class222.method1574(125, var254).field3407.field371, var257);
                                } else {
                                    var262 = new class20(0, var257);
                                }
                                class121.field2021.method986(var259, true, var262);
                            }
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (~class131.field2170 == -223) {
                        class310.field4987 = class136.field2239.method1802((byte) -111);
                        class196.field3159 = class136.field2239.method1802((byte) -103);
                        class223.field3758 = class136.field2239.method1802((byte) -102);
                        class131.field2170 = -1;
                        return true;
                    } else if (~class131.field2170 == -124) {
                        class80.method556(104);
                        class131.field2170 = -1;
                        return false;
                    } else if (class131.field2170 == 151) {
                        int var263 = class136.field2239.method1787(-1);
                        int var264 = class136.field2239.method1763(-1);
                        int var265 = class136.field2239.method1762(-1);
                        int var266 = class136.field2239.method1800(-50);
                        if (class219.method1558((byte) 66, var263)) {
                            class51.method332(var265, var264, var266, (byte) -83);
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (~class131.field2170 == -29) {
                        int var267 = class136.field2239.method1821((byte) 51);
                        int var268 = class136.field2239.method1821((byte) 51);
                        int var269 = class136.field2239.method1815(-1);
                        if (class219.method1558((byte) 60, var268)) {
                            class248.method1759(var269, 0, var267);
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (class131.field2170 == 170) {
                        int var270 = class136.field2239.method1821((byte) 51);
                        int var271 = class136.field2239.method1800(94);
                        if (class219.method1558((byte) 51, var270)) {
                            class278 var272 = (class278) class306.field4952.method987(-102, (long) var271);
                            if (var272 != null) {
                                class272.method1917((byte) 74, true, var272);
                            }
                            if (class6.field133 != null) {
                                class206.method1441(arg0 ^ 43, class6.field133);
                                class6.field133 = null;
                            }
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (~class131.field2170 == -225) {
                        int var273 = class136.field2239.method1802((byte) 111);
                        boolean var274 = ~(1 & var273) == -2;
                        String var275 = class136.field2239.method1769(1);
                        String var276 = class136.field2239.method1769(arg0 ^ 42);
                        String var277 = class136.field2239.method1769(1);
                        String var278 = class136.field2239.method1769(1);
                        if (var274) {
                            for (int var279 = 0; ~class86.field1425 < ~var279; ++var279) {
                                if (class122.field2043[var279].equals(var278)) {
                                    class180.field2876[var279] = var275;
                                    if (var276.equals("")) {
                                        class122.field2043[var279] = var275;
                                    } else {
                                        class122.field2043[var279] = var276;
                                    }
                                    class122.field2045[var279] = var277;
                                    if (!var278.equals("")) {
                                        class152.field2533[var279] = var278;
                                    } else {
                                        class152.field2533[var279] = var277;
                                    }
                                    break;
                                }
                            }
                        } else {
                            class180.field2876[class86.field1425] = var275;
                            if (!var276.equals("")) {
                                class122.field2043[class86.field1425] = var276;
                            } else {
                                class122.field2043[class86.field1425] = var275;
                            }
                            class122.field2045[class86.field1425] = var277;
                            if (!var278.equals("")) {
                                class152.field2533[class86.field1425] = var278;
                            } else {
                                class152.field2533[class86.field1425] = var277;
                            }
                            class88.field1455[class86.field1425] = ~class15.method84(2, var273) == -3;
                            ++class86.field1425;
                        }
                        class293.field4824 = class196.field3162;
                        class131.field2170 = -1;
                        return true;
                    } else if (class131.field2170 == 218) {
                        int var280 = class136.field2239.method1818(false);
                        int var281 = class136.field2239.method1818(false);
                        int var282 = class136.field2239.method1806(-1);
                        int var283 = class136.field2239.method1818(false);
                        int var284 = class136.field2239.method1807((byte) -27);
                        if (class219.method1558((byte) 77, var280)) {
                            class205.method1436(var284, 7, var283, -6, var282 | var281 << 16);
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (class131.field2170 == 227) {
                        boolean var285 = class136.field2239.method1802((byte) 80) == 1;
                        String var286 = class136.field2239.method1769(1);
                        String var287 = var286;
                        if (var285) {
                            var287 = class136.field2239.method1769(1);
                        }
                        long var288 = (long) class136.field2239.method1821((byte) 51);
                        long var290 = (long) class136.field2239.method1812((byte) 52);
                        long var292 = (var288 << 32) + var290;
                        int var294 = class136.field2239.method1802((byte) -86);
                        boolean var295 = false;
                        int var296 = 0;
                        while (true) {
                            if (~var296 <= -101) {
                                if (~var294 >= -2) {
                                    if ((!class69.field1163 || class146.field2402) && !class122.field2042) {
                                        if (class42.method255((byte) -95, var287)) {
                                            var295 = true;
                                        }
                                    } else {
                                        var295 = true;
                                    }
                                }
                                break;
                            }
                            if (class130.field2147[var296] == var292) {
                                var295 = true;
                                break;
                            }
                            ++var296;
                        }
                        if (!var295 && class136.field2238 == 0) {
                            class130.field2147[class300.field4899] = var292;
                            class300.field4899 = (class300.field4899 + 1) % 100;
                            String var297 = class165.method1238(class95.method677(class151.method1144(class136.field2239, arg0 + 865122341), 0));
                            if (var294 == 2) {
                                class246.method1755(0, arg0 + -44, -1, (String) null, "<img=1>" + var287, 7, "<img=1>" + var286, var297);
                            } else if (var294 != 1) {
                                class246.method1755(0, -1, -1, (String) null, var287, 3, var286, var297);
                            } else {
                                class246.method1755(0, -1, -1, (String) null, "<img=0>" + var287, 7, "<img=0>" + var286, var297);
                            }
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (~class131.field2170 == -39) {
                        class146.field2409 = class196.field3162;
                        if (~class150.field2480 == -1) {
                            class272.field4534 = null;
                            class58.field1025 = null;
                            class199.field3212 = null;
                            class131.field2170 = -1;
                            class34.field549 = 0;
                            return true;
                        } else {
                            class199.field3212 = class136.field2239.method1769(1);
                            boolean var298 = ~class136.field2239.method1802((byte) 48) == -2;
                            if (var298) {
                                class136.field2239.method1769(1);
                            }
                            long var299 = class136.field2239.method1810((byte) -97);
                            class58.field1025 = class243.method1739((byte) 72, var299);
                            class151.field2529 = class136.field2239.method1768(126);
                            int var301 = class136.field2239.method1802((byte) -120);
                            if (~var301 == -256) {
                                class131.field2170 = -1;
                                return true;
                            } else {
                                class80[] var302 = new class80[100];
                                class34.field549 = var301;
                                for (int var303 = 0; var303 < class34.field549; ++var303) {
                                    var302[var303] = new class80();
                                    var302[var303].field1349 = class136.field2239.method1769(1);
                                    boolean var309 = ~class136.field2239.method1802((byte) 50) == -2;
                                    if (!var309) {
                                        var302[var303].field1343 = var302[var303].field1349;
                                    } else {
                                        var302[var303].field1343 = class136.field2239.method1769(1);
                                    }
                                    var302[var303].field1337 = class136.field2239.method1821((byte) 51);
                                    var302[var303].field1339 = class136.field2239.method1768(79);
                                    var302[var303].field1346 = class136.field2239.method1769(1);
                                    if (var302[var303].field1343.equals(class16.field314.field2069)) {
                                        class130.field2157 = var302[var303].field1339;
                                    }
                                }
                                boolean var304 = false;
                                int var305 = class34.field549;
                                while (var305 > 0) {
                                    --var305;
                                    boolean var306 = true;
                                    for (int var307 = 0; var305 > var307; ++var307) {
                                        if (~var302[var307].field1349.compareTo(var302[var307 - -1].field1349) < -1) {
                                            class80 var308 = var302[var307];
                                            var306 = false;
                                            var302[var307] = var302[var307 + 1];
                                            var302[var307 + 1] = var308;
                                        }
                                    }
                                    if (var306) {
                                        break;
                                    }
                                }
                                class272.field4534 = var302;
                                class131.field2170 = -1;
                                return true;
                            }
                        }
                    } else if (~class131.field2170 == -146) {
                        class80.method557(-104);
                        class174.field2793 = class136.field2239.method1762(-1);
                        class228.field3856 = class196.field3162;
                        class131.field2170 = -1;
                        return true;
                    } else if (~class131.field2170 == -66) {
                        int var310 = class136.field2239.method1815(arg0 + -44);
                        int var311 = 3 & var310 >> 28;
                        int var312 = var310 >> 14 & 16383;
                        int var313 = var310 & 16383;
                        int var314 = class136.field2239.method1821((byte) 51);
                        int var315 = class136.field2239.method1802((byte) 76);
                        int var316 = var312 - class26.field462;
                        int var317 = var315 & 3;
                        int var318 = var315 >> 2;
                        int var319 = var313 - class78.field1313;
                        int var320 = class199.field3211[var318];
                        if (~var314 == -65536) {
                            var314 = -1;
                        }
                        class21.method140(var317, var319, var320, var314, var311, var318, var316, 5);
                        class131.field2170 = -1;
                        return true;
                    } else if (~class131.field2170 == -104) {
                        boolean var321 = ~class136.field2239.method1802((byte) 34) == -2;
                        String var322 = class136.field2239.method1769(1);
                        String var323 = var322;
                        if (var321) {
                            var323 = class136.field2239.method1769(1);
                        }
                        long var324 = class136.field2239.method1810((byte) -75);
                        long var326 = (long) class136.field2239.method1821((byte) 51);
                        long var328 = (long) class136.field2239.method1812((byte) 52);
                        long var330 = (var326 << 32) + var328;
                        boolean var332 = false;
                        int var333 = class136.field2239.method1802((byte) -107);
                        int var334 = 0;
                        while (true) {
                            if (var334 >= 100) {
                                if (~var333 >= -2) {
                                    if ((!class69.field1163 || class146.field2402) && !class122.field2042) {
                                        if (class42.method255((byte) -95, var323)) {
                                            var332 = true;
                                        }
                                    } else {
                                        var332 = true;
                                    }
                                }
                                break;
                            }
                            if (class130.field2147[var334] == var330) {
                                var332 = true;
                                break;
                            }
                            ++var334;
                        }
                        if (!var332 && class136.field2238 == 0) {
                            class130.field2147[class300.field4899] = var330;
                            class300.field4899 = (class300.field4899 + 1) % 100;
                            String var335 = class165.method1238(class95.method677(class151.method1144(class136.field2239, 865122384), arg0 + -43));
                            if (~var333 != -3 && ~var333 != -4) {
                                if (~var333 == -2) {
                                    class246.method1755(0, arg0 + -44, -1, class241.method1726(var324, 1901097514), "<img=0>" + var323, 9, "<img=0>" + var322, var335);
                                } else {
                                    class246.method1755(0, arg0 + -44, -1, class241.method1726(var324, 1901097514), var323, 9, var322, var335);
                                }
                            } else {
                                class246.method1755(0, -1, -1, class241.method1726(var324, arg0 ^ 1901097473), "<img=1>" + var323, 9, "<img=1>" + var322, var335);
                            }
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (~class131.field2170 == -93) {
                        for (int var336 = 0; class12.field230.length > var336; ++var336) {
                            if (~class152.field2541[var336] != ~class12.field230[var336]) {
                                class12.field230[var336] = class152.field2541[var336];
                                class279.method1950(var336, false);
                                class255.field4317[class15.method84(31, class236.field3986++)] = var336;
                            }
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (~class131.field2170 == -234) {
                        class23.field413 = class136.field2239.method1794((byte) 60);
                        class16.field330 = class136.field2239.method1794((byte) -95);
                        while (class136.field2239.field4160 < class150.field2480) {
                            class131.field2170 = class136.field2239.method1802((byte) 80);
                            class216.method1539(arg0 ^ 41);
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (class131.field2170 == 14) {
                        class136.field2239.field4160 += 28;
                        if (class136.field2239.method1766(255)) {
                            class151.method1146(class136.field2239.field4160 + -28, class136.field2239, 127);
                        }
                        class131.field2170 = -1;
                        return true;
                    } else if (~class131.field2170 == -245) {
                        class80.method557(arg0 + -169);
                        class147.field2429 = class136.field2239.method1802((byte) -106);
                        class228.field3856 = class196.field3162;
                        class131.field2170 = -1;
                        return true;
                    } else if (~class131.field2170 != -46) {
                        if (~class131.field2170 == -218) {
                            class95.method678(false, -5913);
                            class131.field2170 = -1;
                            return true;
                        } else if (~class131.field2170 == -128) {
                            class231.method1664(87);
                            class131.field2170 = -1;
                            return true;
                        } else if (class131.field2170 == 249) {
                            if (class150.field2480 == 0) {
                                class13.field271 = class280.field4652;
                            } else {
                                class13.field271 = class136.field2239.method1769(1);
                            }
                            class131.field2170 = -1;
                            return true;
                        } else if (~class131.field2170 == -2) {
                            int var344 = class136.field2239.method1806(-1);
                            String var345 = class136.field2239.method1769(arg0 ^ 42);
                            int var346 = class136.field2239.method1800(arg0 + 50);
                            if (class219.method1558((byte) 68, var344)) {
                                class100.method711(var346, var345, arg0 ^ 16504);
                            }
                            class131.field2170 = -1;
                            return true;
                        } else if (~class131.field2170 == -255) {
                            int var347 = class136.field2239.method1821((byte) 51);
                            if (var347 == 65535) {
                                var347 = -1;
                            }
                            int var348 = class136.field2239.method1802((byte) -110);
                            int var349 = class136.field2239.method1821((byte) 51);
                            int var350 = class136.field2239.method1802((byte) 114);
                            class1.method4(var350, var348, var349, var347, 23492);
                            class131.field2170 = -1;
                            return true;
                        } else if (~class131.field2170 == -148) {
                            int var351 = class136.field2239.method1800(-89);
                            int var352 = class136.field2239.method1806(-1);
                            if (var352 == 65535) {
                                var352 = -1;
                            }
                            int var353 = class136.field2239.method1804(87);
                            int var354 = class136.field2239.method1818(false);
                            if (class219.method1558((byte) 123, var354)) {
                                class207 var355 = class222.method1574(arg0 ^ 93, var351);
                                if (var355.field3446) {
                                    class205.method1431(true, var353, var351, var352);
                                    class71 var356 = class13.method75(false, var352);
                                    class140.method1036(var356.field1231, var351, var356.field1226, var356.field1251, (byte) -11);
                                    class77.method544((byte) 106, var356.field1202, var351, var356.field1182, var356.field1208);
                                } else {
                                    if (var352 == -1) {
                                        class131.field2170 = -1;
                                        var355.field3393 = 0;
                                        return true;
                                    }
                                    class71 var357 = class13.method75(false, var352);
                                    var355.field3352 = var357.field1231 * 100 / var353;
                                    var355.field3381 = var352;
                                    var355.field3366 = var357.field1226;
                                    var355.field3370 = var357.field1251;
                                    var355.field3393 = 4;
                                    class206.method1441(0, var355);
                                }
                            }
                            class131.field2170 = -1;
                            return true;
                        } else if (~class131.field2170 == -37) {
                            int var358 = class136.field2239.method1821((byte) 51);
                            String var359 = class136.field2239.method1769(1);
                            Object[] var360 = new Object[1 + var359.length()];
                            for (int var361 = -1 + var359.length(); var361 >= 0; --var361) {
                                if (~var359.charAt(var361) != -116) {
                                    var360[var361 + 1] = new Integer(class136.field2239.method1800(113));
                                } else {
                                    var360[var361 + 1] = class136.field2239.method1769(arg0 + -42);
                                }
                            }
                            var360[0] = new Integer(class136.field2239.method1800(class284.method1990(arg0, -110)));
                            if (class219.method1558((byte) 100, var358)) {
                                class303 var362 = new class303();
                                var362.field4935 = var360;
                                class269.method1893(-3725, var362);
                            }
                            class131.field2170 = -1;
                            return true;
                        } else if (~class131.field2170 == -43) {
                            int var363 = class136.field2239.method1794((byte) -103);
                            int var364 = class136.field2239.method1802((byte) 71);
                            String var365 = class136.field2239.method1769(1);
                            int var366 = class136.field2239.method1818(false);
                            if (var366 == 65535) {
                                var366 = -1;
                            }
                            if (var364 >= 1 && var364 <= 8) {
                                if (var365.equalsIgnoreCase("null")) {
                                    var365 = null;
                                }
                                class66.field1107[var364 + -1] = var365;
                                class171.field2766[var364 - 1] = var366;
                                class246.field4124[var364 + -1] = var363 == 0;
                            }
                            class131.field2170 = -1;
                            return true;
                        } else if (class131.field2170 == 119) {
                            class292.field4791 = class136.field2239.method1802((byte) 50);
                            class131.field2170 = -1;
                            return true;
                        } else if (class131.field2170 != 49 && ~class131.field2170 != -68 && class131.field2170 != 113 && class131.field2170 != 179 && class131.field2170 != 200 && class131.field2170 != 173 && class131.field2170 != 134 && class131.field2170 != 50 && class131.field2170 != 146 && ~class131.field2170 != -131 && class131.field2170 != 21 && ~class131.field2170 != -82 && ~class131.field2170 != -91 && ~class131.field2170 != -18) {
                            if (class131.field2170 == 51) {
                                int var367 = class136.field2239.method1804(54);
                                int var368 = class136.field2239.method1802((byte) 34);
                                int var369 = class136.field2239.method1806(arg0 + -44);
                                if (class219.method1558((byte) 62, var369)) {
                                    class287.method2004(var367, -113, var368);
                                }
                                class131.field2170 = -1;
                                return true;
                            } else {
                                if (arg0 != 43) {
                                    field856 = -45;
                                }
                                if (~class131.field2170 == -176) {
                                    int var370 = class136.field2239.method1821((byte) 51);
                                    int var371 = class136.field2239.method1807((byte) -27);
                                    int var372 = class136.field2239.method1818(false);
                                    if (class219.method1558((byte) 73, var372)) {
                                        class313.method2121(var370, 1, var371);
                                    }
                                    class131.field2170 = -1;
                                    return true;
                                } else {
                                    class84.method595(14117, "T1 - " + class131.field2170 + "," + class158.field2583 + "," + class275.field4586 + " - " + class150.field2480, (Throwable) null);
                                    class80.method556(104);
                                    return true;
                                }
                            }
                        } else {
                            class216.method1539(2);
                            class131.field2170 = -1;
                            return true;
                        }
                    } else {
                        int var337 = class136.field2239.method1804(arg0 + 78);
                        int var338 = class136.field2239.method1804(54);
                        int var339 = class136.field2239.method1818(false);
                        if (class219.method1558((byte) 46, var339)) {
                            class278 var340 = (class278) class306.field4952.method987(-108, (long) var337);
                            class278 var341 = (class278) class306.field4952.method987(-120, (long) var338);
                            if (var341 != null) {
                                class272.method1917((byte) 74, var340 == null || var340.field4622 != var341.field4622, var341);
                            }
                            if (var340 != null) {
                                var340.method993(32);
                                class306.field4952.method986((long) var338, true, var340);
                            }
                            class207 var342 = class222.method1574(arg0 ^ 92, var337);
                            if (var342 != null) {
                                class206.method1441(0, var342);
                            }
                            class207 var343 = class222.method1574(117, var338);
                            if (var343 != null) {
                                class206.method1441(0, var343);
                                class26.method168(var343, 0, true);
                            }
                            if (~class243.field4082 != 0) {
                                class179.method1305((byte) 69, class243.field4082, 1);
                            }
                        }
                        class131.field2170 = -1;
                        return true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BI)[[I")
    public final int[][] method157(byte arg0, int arg1) {
        int var3 = -98 / ((-64 - arg0) / 49);
        ++field847;
        int[][] var4 = super.field2905.method50(arg1, (byte) 124);
        if (super.field2905.field158) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; class4.field116 > var8; ++var8) {
                this.method322((byte) -124, arg1, var8);
                int[][] var9 = this.method1327(0, 0, class131.field2165);
                var5[var8] = var9[0][class160.field2611];
                var6[var8] = var9[1][class160.field2611];
                var7[var8] = var9[2][class160.field2611];
            }
        }
        return var4;
    }
}
