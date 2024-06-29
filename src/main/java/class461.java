import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class461 extends class287 {

    @OriginalMember(owner = "client!ht", name = "r", descriptor = "[B")
    public byte[] field6674;

    @OriginalMember(owner = "client!ht", name = "s", descriptor = "I")
    public static int field6675 = 0;

    @OriginalMember(owner = "client!ht", name = "u", descriptor = "I")
    public static int field6677 = 0;

    @OriginalMember(owner = "client!ht", name = "q", descriptor = "I")
    public static int field6673;

    @OriginalMember(owner = "client!ht", name = "t", descriptor = "I")
    public static int field6676;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Z)V")
    public static final void method2682(boolean arg0) {
        field6673++;
        if (arg0 || class516.field7579 == 0 || class516.field7579 == 5) {
            return;
        }
        try {
            if ((++class120.field1877) > 2000) {
                if (class104.field1702 != null) {
                    class104.field1702.method172(12292);
                    class104.field1702 = null;
                }
                if (class526.field7681 >= 1) {
                    class516.field7579 = 0;
                    class355.method2122(-36, -5);
                    return;
                }
                class120.field1877 = 0;
                class516.field7579 = 1;
                class526.field7681++;
                if (class225.field3176 == 2 || class225.field3176 == 3) {
                    class184.field2737.field613 = !class184.field2737.field613;
                } else {
                    class414.field5911.field613 = !class414.field5911.field613;
                }
            }
            if (class516.field7579 == 1) {
                if (class225.field3176 == 2 || class225.field3176 == 3) {
                    class42.field623 = class346.field4985.method1181(class184.field2737.field603, 111, class184.field2737.method285(-57));
                } else {
                    class42.field623 = class346.field4985.method1181(class414.field5911.field603, 78, class414.field5911.method285(-124));
                }
                class516.field7579 = 2;
            }
            if (class516.field7579 == 2) {
                if (class42.field623.field6699 == 2) {
                    throw new IOException();
                }
                if (class42.field623.field6699 != 1) {
                    return;
                }
                class104.field1702 = new class27((Socket) class42.field623.field6695, class346.field4985);
                class42.field623 = null;
                long var1 = class66.field957 = class329.method1942(false, class481.field6957);
                class17.field275.field4360 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class17.field275.method1891(false, class88.field1429.field2102);
                class17.field275.method1891(false, var3);
                class104.field1702.method180(0, 2, 18170, class17.field275.field4336);
                class191.method1264(Integer.MIN_VALUE);
                int var4 = class104.field1702.method175(-25652);
                class191.method1264(Integer.MIN_VALUE);
                if (var4 != 0) {
                    class516.field7579 = 0;
                    class355.method2122(-35, var4);
                    class104.field1702.method172(12292);
                    class104.field1702 = null;
                    class11.method80(2);
                    return;
                }
                class516.field7579 = 3;
            }
            if (class516.field7579 == 3) {
                if (class104.field1702.method181(-1) < 8) {
                    return;
                }
                class104.field1702.method177(8, class508.field7414.field4336, 0, 110);
                class508.field7414.field4360 = 0;
                class395.field5687 = class508.field7414.method1886(false);
                class319 var5 = new class319(70);
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class395.field5687 >> 32), (int) class395.field5687 };
                var5.method1891(arg0, 10);
                var5.method1858(var6[0], (byte) -33);
                var5.method1858(var6[1], (byte) -92);
                var5.method1858(var6[2], (byte) -76);
                var5.method1858(var6[3], (byte) -65);
                var5.method1859((byte) -1, class329.method1942(false, class481.field6957));
                var5.method1879(32767, class518.field7611);
                var5.method1864(false, class515.field7540, class98.field1561);
                class28 var7 = class17.field275;
                var7.field4360 = 0;
                if (class225.field3176 == 2 || class225.field3176 == 3) {
                    if (class494.field7155 == 12) {
                        var7.method1891(false, class88.field1433.field2102);
                    } else {
                        var7.method1891(arg0, class88.field1431.field2102);
                    }
                    var7.method1857(561746448, 0);
                    int var9 = var7.field4360;
                    var7.method1858(599, (byte) -26);
                    var7.method1891(arg0, class61.field899);
                    var7.method1891(false, class75.method586((byte) 72));
                    var7.method1857(561746448, class66.field953);
                    var7.method1857(561746448, class348.field5033);
                    var7.method1891(false, class76.field1075.field3689);
                    class234.method1431(var7, 0);
                    var7.method1879(32767, class255.field3476);
                    var7.method1858(class387.field5536, (byte) -82);
                    class319 var10 = class76.field1075.method1101(17);
                    var7.method1891(false, var10.field4360);
                    var7.method1885(var10.field4360, 0, false, var10.field4336);
                    class425.field6186 = true;
                    var7.method1857(561746448, class20.field294);
                    var7.method1857(561746448, class123.field1903);
                    class358.method2133((byte) -19);
                    var7.method1885(var5.field4360, 0, false, var5.field4336);
                    var7.method1881(var7.field4360 - var9, 2);
                } else {
                    var7.method1891(false, class88.field1434.field2102);
                    var7.method1857(561746448, 0);
                    int var8 = var7.field4360;
                    var7.method1858(599, (byte) -15);
                    var7.method1891(arg0, class152.field2343.field134);
                    var7.method1891(false, class486.field6998);
                    class234.method1431(var7, 0);
                    var7.method1879(32767, class255.field3476);
                    var7.method1858(class387.field5536, (byte) -114);
                    class358.method2133((byte) -19);
                    var7.method1885(var5.field4360, 0, false, var5.field4336);
                    var7.method1881(var7.field4360 - var8, 2);
                }
                class104.field1702.method180(0, var7.field4360, 18170, var7.field4336);
                var7.method193(var6, (byte) -93);
                for (int var11 = 0; var11 < 4; var11++) {
                    var6[var11] += 50;
                }
                class508.field7414.method193(var6, (byte) 94);
                class516.field7579 = 4;
            }
            if (class516.field7579 == 4) {
                if (class104.field1702.method181(-1) < 1) {
                    return;
                }
                int var12 = class104.field1702.method175(-25652);
                if (var12 == 21) {
                    class516.field7579 = 7;
                } else if (var12 == 29) {
                    class516.field7579 = 13;
                } else if (var12 == 1) {
                    class516.field7579 = 5;
                    class355.method2122(127, var12);
                    return;
                } else if (var12 == 2) {
                    class516.field7579 = 8;
                } else if (var12 == 15) {
                    class516.field7579 = 14;
                    class399.field5722 = -2;
                } else if (var12 == 23 && class526.field7681 < 1) {
                    class516.field7579 = 1;
                    class526.field7681++;
                    class120.field1877 = 0;
                    class104.field1702.method172(12292);
                    class104.field1702 = null;
                    return;
                } else {
                    class516.field7579 = 0;
                    class355.method2122(126, var12);
                    class104.field1702.method172(12292);
                    class104.field1702 = null;
                    class11.method80(2);
                    return;
                }
            }
            if (class516.field7579 == 6) {
                class17.field275.field4360 = 0;
                class17.field275.method190(class88.field1432.field2102, -19465);
                class104.field1702.method180(0, class17.field275.field4360, 18170, class17.field275.field4336);
                class516.field7579 = 4;
            } else if (class516.field7579 == 7) {
                if (class104.field1702.method181(-1) >= 1) {
                    class331.field4505 = class104.field1702.method175(-25652) * 60 + 180;
                    class516.field7579 = 0;
                    class355.method2122(126, 21);
                    class104.field1702.method172(12292);
                    class104.field1702 = null;
                    class11.method80(2);
                }
            } else if (class516.field7579 == 13) {
                if (class104.field1702.method181(-1) >= 1) {
                    class307.field4171 = class104.field1702.method175(-25652);
                    class516.field7579 = 0;
                    class355.method2122(-11, 29);
                    class104.field1702.method172(12292);
                    class104.field1702 = null;
                    class11.method80(2);
                }
            } else if (class516.field7579 != 8) {
                if (class516.field7579 == 9) {
                    if (class225.field3176 == 3) {
                        class338.field4904 = true;
                    } else {
                        class338.field4904 = false;
                    }
                    class28 var13 = class508.field7414;
                    if (class225.field3176 == 2 || class225.field3176 == 3) {
                        if (class104.field1702.method181(-1) < class487.field7054) {
                            return;
                        }
                        class104.field1702.method177(class487.field7054, var13.field4336, 0, 117);
                        var13.field4360 = 0;
                        class136.field2064 = var13.method1869(-118);
                        class3.field35 = var13.method1869(-117);
                        class355.field5134 = var13.method1869(-117) == 1;
                        class345.field4970 = var13.method1869(-83) == 1;
                        class122.field1899 = var13.method1869(-71) == 1;
                        class185.field2739 = var13.method1869(-115) == 1;
                        class484.field6972 = var13.method1844(-109);
                        class296.field3998 = var13.method1869(-81) == 1;
                        class76.field1076 = var13.method1830((byte) 44);
                        class65.field938 = var13.method1869(-97) == 1;
                        if (class225.field3176 == 3) {
                            boolean var14 = var13.method1869(-67) == 1;
                            if (var14) {
                                long var15 = var13.method1886(false);
                                String var17 = class468.method2723(var15, 77);
                                int var18 = var13.method1869(-112);
                                byte[] var19 = new byte[var18];
                                var13.method189((byte) -104, var18, var19, 0);
                                String var20 = class146.method1035(-124, var19);
                                class453 var21 = null;
                                try {
                                    class464 var22 = class346.field4985.method1199(-14340, "3", false);
                                    while (var22.field6699 == 0) {
                                        class334.method2047(1L, 0);
                                    }
                                    if (var22.field6699 == 1) {
                                        var21 = (class453) var22.field6695;
                                        int var23 = var17.length() + 3 - (-2 - (var20.length() + 4));
                                        if (var23 > 50) {
                                            throw new RuntimeException(">50");
                                        }
                                        class319 var24 = new class319(var23 + 1);
                                        var24.method1891(false, var23);
                                        var24.method1891(false, 0);
                                        var24.method1838(8, var17);
                                        var24.method1838(8, var20);
                                        var24.method1849(-17283);
                                        var21.method2662(var24.field4360, (byte) 46, var24.field4336, 0);
                                    }
                                } catch (Exception var33) {
                                }
                                try {
                                    if (var21 != null) {
                                        var21.method2659(-1);
                                    }
                                } catch (Exception var31) {
                                }
                            }
                        }
                        class452.field6629.method605(!arg0, class65.field938);
                        class534.field7872.method3087(false, class65.field938);
                        class233.field3248.method2226(-128, class65.field938);
                    } else if (class104.field1702.method181(-1) >= class487.field7054) {
                        class104.field1702.method177(class487.field7054, var13.field4336, 0, 107);
                        var13.field4360 = 0;
                        class136.field2064 = var13.method1869(-94);
                        class3.field35 = var13.method1869(-99);
                        class355.field5134 = var13.method1869(-66) == 1;
                        class345.field4970 = var13.method1869(-70) == 1;
                        class122.field1899 = var13.method1869(-92) == 1;
                        class220.field3106 = var13.method1844(-118);
                        class296.field3998 = class220.field3106 > 0;
                        class276.field3758 = var13.method1844(-119);
                        class13.field144 = var13.method1844(-110);
                        class267.field3595 = var13.method1844(-102);
                        class322.field4423 = var13.method1863(-1);
                        class454.field6635 = class346.field4985.method1192(class322.field4423, 3);
                        class271.field3662 = var13.method1869(-96);
                        class72.field1033 = var13.method1844(-118);
                        class360.field5178 = var13.method1844(-113);
                        class250.field3398 = var13.method1869(-95) == 1;
                        class81.field1158.field7036 = class81.field1158.field7033 = var13.method1878(0);
                        class439.field6332 = new class41();
                        class439.field6332.field609 = var13.method1844(-109);
                        if (class439.field6332.field609 == 65535) {
                            class439.field6332.field609 = -1;
                        }
                        class439.field6332.field603 = var13.method1878(0);
                        if (class81.field1144 != class523.field7659) {
                            class439.field6332.field604 = class439.field6332.field609 + 40000;
                            class439.field6332.field605 = class439.field6332.field609 + 50000;
                        }
                        if (class6.field79 != class523.field7659 && (class184.field2737.method286(class13.field136, (byte) -10) || class184.field2737.method286(class475.field6872, (byte) -104))) {
                            class184.field2737 = class439.field6332;
                        }
                    } else {
                        return;
                    }
                    if ((!class355.field5134 || class122.field1899) && !class296.field3998) {
                        try {
                            class344.method2077(false, "unzap", class346.field4985.field2623);
                        } catch (Throwable var30) {
                        }
                    } else {
                        try {
                            class344.method2077(false, "zap", class346.field4985.field2623);
                        } catch (Throwable var32) {
                            if (class191.field2794) {
                                try {
                                    class346.field4985.field2623.getAppletContext().showDocument(new URL(class346.field4985.field2623.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var29) {
                                }
                            }
                        }
                    }
                    if (class81.field1144 == class523.field7659) {
                        try {
                            class344.method2077(arg0, "loggedin", class346.field4985.field2623);
                        } catch (Throwable var28) {
                        }
                    }
                    if (class225.field3176 != 2 && class225.field3176 != 3) {
                        class516.field7579 = 0;
                        class355.method2122(126, 2);
                        class415.method2448(-658990073);
                        class63.method421(6, true);
                        class322.field4426 = null;
                        return;
                    }
                    class516.field7579 = 11;
                }
                if (class516.field7579 == 11) {
                    if (class104.field1702.method181(-1) < 3) {
                        return;
                    }
                    class104.field1702.method177(3, class508.field7414.field4336, 0, 115);
                    class516.field7579 = 12;
                }
                if (class516.field7579 == 12) {
                    class28 var25 = class508.field7414;
                    var25.field4360 = 0;
                    if (var25.method197(7632)) {
                        if (class104.field1702.method181(-1) < 1) {
                            return;
                        }
                        class104.field1702.method177(1, var25.field4336, 3, 122);
                    }
                    class322.field4426 = class523.method3105(2)[var25.method185((byte) -97)];
                    class399.field5722 = var25.method1844(-118);
                    class516.field7579 = 10;
                }
                if (class516.field7579 == 10) {
                    if (class104.field1702.method181(-1) >= class399.field5722) {
                        class104.field1702.method177(class399.field5722, class508.field7414.field4336, 0, 107);
                        class508.field7414.field4360 = 0;
                        int var26 = class399.field5722;
                        class516.field7579 = 0;
                        class355.method2122(126, 2);
                        class384.method2277(-76);
                        class322.method1909(18335, class508.field7414);
                        class412.field5874 = -1;
                        class521.method3101(false);
                        if (class508.field7414.field4360 != var26) {
                            throw new RuntimeException("lswp pos:" + class508.field7414.field4360 + " psize:" + var26);
                        }
                        class322.field4426 = null;
                    }
                } else if (class516.field7579 == 14) {
                    if (class399.field5722 == -2) {
                        if (class104.field1702.method181(-1) < 2) {
                            return;
                        }
                        class104.field1702.method177(2, class508.field7414.field4336, 0, 114);
                        class508.field7414.field4360 = 0;
                        class399.field5722 = class508.field7414.method1844(-121);
                    }
                    if (class104.field1702.method181(-1) >= class399.field5722) {
                        class104.field1702.method177(class399.field5722, class508.field7414.field4336, 0, 105);
                        class508.field7414.field4360 = 0;
                        class516.field7579 = 0;
                        int var27 = class399.field5722;
                        class355.method2122(126, 15);
                        class118.method871(-27897);
                        class322.method1909(18335, class508.field7414);
                        if (class508.field7414.field4360 != var27) {
                            throw new RuntimeException("lswpr pos:" + class508.field7414.field4360 + " psize:" + var27);
                        }
                        class322.field4426 = null;
                    }
                }
            } else if (class104.field1702.method181(-1) >= 1) {
                class487.field7054 = class104.field1702.method175(-25652);
                class516.field7579 = 9;
            }
        } catch (IOException var34) {
            if (class104.field1702 != null) {
                class104.field1702.method172(12292);
                class104.field1702 = null;
            }
            if (class526.field7681 >= 1) {
                class516.field7579 = 0;
                class355.method2122(126, -4);
                class11.method80(2);
            } else {
                if (class225.field3176 == 2 || class225.field3176 == 3) {
                    class184.field2737.field613 = !class184.field2737.field613;
                } else {
                    class414.field5911.field613 = !class414.field5911.field613;
                }
                class516.field7579 = 1;
                class526.field7681++;
                class120.field1877 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "([B)V")
    public class461(byte[] arg0) {
        this.field6674 = arg0;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IILpm;ILjm;Lpf;II)V")
    public static final void method2683(int arg0, int arg1, class103 arg2, int arg3, class209 arg4, class487 arg5, int arg6, int arg7) {
        field6676++;
        class374 var8 = new class374();
        var8.field5382 = arg0 << 7;
        var8.field5370 = arg1 << 7;
        if (arg7 != -4946) {
            return;
        }
        var8.field5377 = arg6;
        if (arg2 != null) {
            var8.field5371 = arg2;
            int var10 = arg2.field1639;
            int var11 = arg2.field1695;
            if (arg3 == 1 || arg3 == 3) {
                var11 = arg2.field1639;
                var10 = arg2.field1695;
            }
            var8.field5359 = arg2.field1688;
            var8.field5363 = arg2.field1675;
            var8.field5366 = arg2.field1637;
            var8.field5380 = arg1 + var10 << 7;
            var8.field5378 = arg2.field1657 << 7;
            var8.field5365 = arg0 + var11 << 7;
            var8.field5368 = arg2.field1642;
            var8.field5361 = arg2.field1680;
            if (arg2.field1613 != null) {
                var8.field5379 = true;
                var8.method2244((byte) 97);
            }
            if (var8.field5363 != null) {
                var8.field5375 = var8.field5359 + ((int) (Math.random() * (double) (var8.field5368 - var8.field5359)));
            }
            class398.field5713.method3139(0, var8);
        } else if (arg4 != null) {
            var8.field5360 = arg4;
            class83 var9 = arg4.field2976;
            if (var9.field1272 != null) {
                var8.field5379 = true;
                var9 = var9.method655(class309.field4200, (byte) 123);
            }
            if (var9 != null) {
                var8.field5380 = var9.field1228 + arg1 << 7;
                var8.field5365 = var9.field1228 + arg0 << 7;
                var8.field5361 = class7.method45(20215, arg4);
                var8.field5366 = var9.field1254;
                var8.field5378 = var9.field1275 << 7;
            }
            class265.field3566.method3139(0, var8);
        } else if (arg5 != null) {
            var8.field5364 = arg5;
            var8.field5380 = arg5.method116(8569) + arg1 << 7;
            var8.field5365 = arg0 + arg5.method116(8569) << 7;
            var8.field5361 = class273.method1598(arg5, (byte) 80);
            var8.field5366 = arg5.field7018;
            var8.field5378 = arg5.field7043 << 7;
            class481.field6955.method1586(var8, (long) arg5.field179, 1);
            return;
        }
    }
}
