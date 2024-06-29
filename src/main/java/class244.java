import java.awt.Rectangle;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class244 extends class352 {

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "I")
    private int field3421;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
    private int field3419;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
    private int field3417;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
    private int field3418;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3414;

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(IIIIIII)V", line = 5)
    public class244(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3421 = arg3;
        this.field3419 = arg0;
        this.field3417 = arg1;
        this.field3418 = arg2;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)Z", line = 18)
    public static final boolean method1624(boolean arg0) throws IOException {
        ++field3420;
        if (class81.field1092 == null) {
            return false;
        } else {
            int var1 = class81.field1092.method2995((byte) 121);
            if (~var1 == -1) {
                return false;
            } else {
                if (class339.field5361 == null) {
                    if (class27.field439) {
                        --var1;
                        class81.field1092.method2997(class486.field7134.field1277, 1, (byte) 98, 0);
                        ++class170.field2465;
                        class27.field439 = false;
                    }
                    class486.field7134.field1292 = 0;
                    if (class486.field7134.method2076(-129)) {
                        if (var1 == 0) {
                            return false;
                        }
                        class81.field1092.method2997(class486.field7134.field1277, 1, (byte) 98, 1);
                        --var1;
                        ++class170.field2465;
                    }
                    class27.field439 = true;
                    class492[] var2 = class26.method204(0);
                    int var3 = class486.field7134.method2079((byte) -16);
                    if (~var3 > -1 || ~var2.length >= ~var3) {
                        throw new IOException("invo:" + var3 + " ip:" + class486.field7134.field1292);
                    }
                    class339.field5361 = var2[var3];
                    class461.field6755 = class339.field5361.field7183;
                }
                if (class461.field6755 == -1) {
                    if (var1 <= 0) {
                        return false;
                    }
                    class81.field1092.method2997(class486.field7134.field1277, 1, (byte) 98, 0);
                    ++class170.field2465;
                    class461.field6755 = 255 & class486.field7134.field1277[0];
                    --var1;
                }
                if (~class461.field6755 == 1) {
                    if (var1 <= 1) {
                        return false;
                    }
                    class81.field1092.method2997(class486.field7134.field1277, 2, (byte) 98, 0);
                    class486.field7134.field1292 = 0;
                    class461.field6755 = class486.field7134.method631(10494);
                    var1 -= 2;
                    class170.field2465 += 2;
                }
                if (~class461.field6755 < ~var1) {
                    return false;
                } else {
                    class486.field7134.field1292 = 0;
                    class81.field1092.method2997(class486.field7134.field1277, class461.field6755, (byte) 98, 0);
                    class329.field5109 = class338.field5357;
                    class170.field2465 += class461.field6755;
                    class156.field2261 = 0;
                    class338.field5357 = class434.field6453;
                    class434.field6453 = class339.field5361;
                    if (class73.field985 == class339.field5361) {
                        int var4 = class486.field7134.method631(10494);
                        if (~var4 == -65536) {
                            var4 = -1;
                        }
                        int var5 = class486.field7134.method618((byte) 100);
                        int var6 = class486.field7134.method631(10494);
                        int var7 = class486.field7134.method618((byte) 100);
                        class491.method2918(var4, 40, var7, var5, var6);
                        class339.field5361 = null;
                        return true;
                    } else if (class339.field5361 == class317.field4863) {
                        class524.method3107(80, false);
                        class339.field5361 = null;
                        return true;
                    } else if (class404.field6111 == class339.field5361) {
                        class19.method146(0);
                        class339.field5361 = null;
                        return false;
                    } else if (class339.field5361 == class23.field348) {
                        class31.field471 = class486.field7134.method643((byte) 122);
                        class339.field5361 = null;
                        class111.field1561 = class485.field7086;
                        return true;
                    } else if (class455.field6682 == class339.field5361) {
                        class514.method3056(-102, class269.field3729);
                        class339.field5361 = null;
                        return true;
                    } else if (class340.field5367 == class339.field5361) {
                        String var8 = class486.field7134.method621(2029169511);
                        boolean var9 = class486.field7134.method618((byte) 100) == 1;
                        String var10;
                        if (var9) {
                            var10 = class486.field7134.method621(2029169511);
                        } else {
                            var10 = var8;
                        }
                        int var11 = class486.field7134.method631(10494);
                        byte var12 = class486.field7134.method619((byte) -23);
                        boolean var13 = false;
                        if (~var12 == 127) {
                            var13 = true;
                        }
                        if (!var13) {
                            String var14 = class486.field7134.method621(2029169511);
                            class69 var15 = new class69();
                            var15.field961 = var10;
                            var15.field952 = var8;
                            var15.field964 = class414.method2512(var15.field961, (byte) 104);
                            var15.field962 = var14;
                            var15.field959 = var11;
                            var15.field956 = var12;
                            int var16;
                            for (var16 = class81.field1089 + -1; var16 >= 0; --var16) {
                                int var17 = class56.field758[var16].field964.compareTo(var15.field964);
                                if (var17 == 0) {
                                    class56.field758[var16].field959 = var11;
                                    class56.field758[var16].field956 = var12;
                                    class56.field758[var16].field962 = var14;
                                    if (var10.equals(class339.field5365.field4947)) {
                                        class188.field2644 = var12;
                                    }
                                    class512.field7600 = class485.field7086;
                                    class339.field5361 = null;
                                    return true;
                                }
                                if (~var17 > -1) {
                                    break;
                                }
                            }
                            if (class56.field758.length <= class81.field1089) {
                                class339.field5361 = null;
                                return true;
                            }
                            for (int var18 = class81.field1089 - 1; ~var16 > ~var18; --var18) {
                                class56.field758[var18 + 1] = class56.field758[var18];
                            }
                            if (class81.field1089 == 0) {
                                class56.field758 = new class69[100];
                            }
                            class56.field758[var16 + 1] = var15;
                            ++class81.field1089;
                            if (var10.equals(class339.field5365.field4947)) {
                                class188.field2644 = var12;
                            }
                        } else {
                            if (~class81.field1089 == -1) {
                                class339.field5361 = null;
                                return true;
                            }
                            boolean var19 = false;
                            int var20;
                            for (var20 = 0; ~class81.field1089 < ~var20 && (!class56.field758[var20].field961.equals(var10) || ~class56.field758[var20].field959 != ~var11); ++var20) {
                            }
                            if (~var20 > ~class81.field1089) {
                                while (class81.field1089 + -1 > var20) {
                                    class56.field758[var20] = class56.field758[var20 + 1];
                                    ++var20;
                                }
                                --class81.field1089;
                                class56.field758[class81.field1089] = null;
                            }
                        }
                        class512.field7600 = class485.field7086;
                        class339.field5361 = null;
                        return true;
                    } else if (class41.field637 == class339.field5361) {
                        class512.field7600 = class485.field7086;
                        if (~class461.field6755 == -1) {
                            class320.field4913 = null;
                            class339.field5361 = null;
                            class56.field758 = null;
                            class81.field1089 = 0;
                            class300.field4436 = null;
                            return true;
                        } else {
                            class300.field4436 = class486.field7134.method621(2029169511);
                            boolean var21 = ~class486.field7134.method618((byte) 100) == -2;
                            if (var21) {
                                class486.field7134.method621(2029169511);
                            }
                            long var22 = class486.field7134.method607(-71);
                            class320.field4913 = class192.method1352((byte) -79, var22);
                            class496.field7259 = class486.field7134.method619((byte) -23);
                            int var24 = class486.field7134.method618((byte) 100);
                            if (var24 == 255) {
                                class339.field5361 = null;
                                return true;
                            } else {
                                class81.field1089 = var24;
                                class69[] var25 = new class69[100];
                                for (int var26 = 0; class81.field1089 > var26; ++var26) {
                                    var25[var26] = new class69();
                                    var25[var26].field952 = class486.field7134.method621(2029169511);
                                    boolean var32 = class486.field7134.method618((byte) 100) == 1;
                                    if (!var32) {
                                        var25[var26].field961 = var25[var26].field952;
                                    } else {
                                        var25[var26].field961 = class486.field7134.method621(2029169511);
                                    }
                                    var25[var26].field964 = class414.method2512(var25[var26].field961, (byte) 65);
                                    var25[var26].field959 = class486.field7134.method631(10494);
                                    var25[var26].field956 = class486.field7134.method619((byte) -23);
                                    var25[var26].field962 = class486.field7134.method621(2029169511);
                                    if (var25[var26].field961.equals(class339.field5365.field4947)) {
                                        class188.field2644 = var25[var26].field956;
                                    }
                                }
                                boolean var27 = false;
                                int var28 = class81.field1089;
                                while (~var28 < -1) {
                                    --var28;
                                    boolean var29 = true;
                                    for (int var30 = 0; ~var30 > ~var28; ++var30) {
                                        if (var25[var30].field964.compareTo(var25[var30 + 1].field964) > 0) {
                                            class69 var31 = var25[var30];
                                            var25[var30] = var25[var30 - -1];
                                            var25[var30 + 1] = var31;
                                            var29 = false;
                                        }
                                    }
                                    if (var29) {
                                        break;
                                    }
                                }
                                class56.field758 = var25;
                                class339.field5361 = null;
                                return true;
                            }
                        }
                    } else if (class339.field5361 == class303.field4458) {
                        boolean var33 = class486.field7134.method618((byte) 100) == 1;
                        String var34 = class486.field7134.method621(2029169511);
                        String var35 = var34;
                        if (var33) {
                            var35 = class486.field7134.method621(2029169511);
                        }
                        int var36 = class486.field7134.method618((byte) 100);
                        int var37 = class486.field7134.method631(10494);
                        boolean var38 = false;
                        if (~var36 >= -2 && class145.method968(var35, false)) {
                            var38 = true;
                        }
                        if (!var38 && ~class398.field6065 == -1) {
                            String var39 = class84.field1147.method3057(64, var37).method368(false, class486.field7134);
                            if (var36 != 2) {
                                if (var36 == 1) {
                                    class395.method2433(var39, var37, 0, "<img=0>" + var35, "<img=0>" + var34, (String) null, (byte) 67, 25);
                                } else {
                                    class395.method2433(var39, var37, 0, var35, var34, (String) null, (byte) 67, 25);
                                }
                            } else {
                                class395.method2433(var39, var37, 0, "<img=1>" + var35, "<img=1>" + var34, (String) null, (byte) 67, 25);
                            }
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class366.field5634 == class339.field5361) {
                        boolean var40 = class486.field7134.method618((byte) 100) == 1;
                        String var41 = class486.field7134.method621(2029169511);
                        String var42 = var41;
                        if (var40) {
                            var42 = class486.field7134.method621(2029169511);
                        }
                        long var43 = (long) class486.field7134.method631(10494);
                        long var45 = (long) class486.field7134.method641(32455);
                        int var47 = class486.field7134.method618((byte) 100);
                        int var48 = class486.field7134.method631(10494);
                        long var49 = (var43 << 32) - -var45;
                        boolean var51 = false;
                        int var52 = 0;
                        while (true) {
                            if (var52 >= 100) {
                                if (~var47 >= -2 && class145.method968(var42, false)) {
                                    var51 = true;
                                }
                                break;
                            }
                            if (class417.field6233[var52] == var49) {
                                var51 = true;
                                break;
                            }
                            ++var52;
                        }
                        if (!var51 && class398.field6065 == 0) {
                            class417.field6233[class516.field7662] = var49;
                            class516.field7662 = (class516.field7662 + 1) % 100;
                            String var53 = class84.field1147.method3057(64, var48).method368(!arg0, class486.field7134);
                            if (var47 != 2) {
                                if (~var47 == -2) {
                                    class395.method2433(var53, var48, 0, "<img=0>" + var42, "<img=0>" + var41, (String) null, (byte) 67, 18);
                                } else {
                                    class395.method2433(var53, var48, 0, var42, var41, (String) null, (byte) 67, 18);
                                }
                            } else {
                                class395.method2433(var53, var48, 0, "<img=1>" + var42, "<img=1>" + var41, (String) null, (byte) 67, 18);
                            }
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class375.field5742 == class339.field5361) {
                        class375.field5739 = class486.field7134.method631(10494) * 30;
                        class339.field5361 = null;
                        class111.field1561 = class485.field7086;
                        return true;
                    } else if (class339.field5361 == class174.field2503) {
                        int var54 = class486.field7134.method643((byte) 123);
                        int var55 = class486.field7134.method591((byte) -109);
                        int var56 = class486.field7134.method606((byte) -55);
                        if (class14.method117(true, var56)) {
                            class335.method2162(20725, var54, var55);
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class496.field7248 == class339.field5361) {
                        int var57 = class486.field7134.method636(-2);
                        int var58 = class486.field7134.method631(10494);
                        if (class14.method117(true, var58)) {
                            class405.field6121 = var57;
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class369.field5665 == class339.field5361) {
                        int var59 = class486.field7134.method631(10494);
                        int var60 = class486.field7134.method618((byte) 100);
                        boolean var61 = (1 & var60) == 1;
                        class217.method1476((byte) -126, var59, var61);
                        int var62 = class486.field7134.method631(10494);
                        for (int var63 = 0; ~var63 > ~var62; ++var63) {
                            int var64 = class486.field7134.method610(1312572200);
                            int var65 = class486.field7134.method618((byte) 100);
                            if (~var65 == -256) {
                                var65 = class486.field7134.method626((byte) 100);
                            }
                            class2.method23(var63, 1, var59, var64 - 1, var65, var61);
                        }
                        class152.field2182[class494.method2942(class456.field6698++, 31)] = var59;
                        class339.field5361 = null;
                        return true;
                    } else if (class517.field7665 == class339.field5361) {
                        boolean var66 = ~class486.field7134.method618((byte) 100) == -2;
                        String var67 = class486.field7134.method621(2029169511);
                        String var68 = var67;
                        if (var66) {
                            var68 = class486.field7134.method621(2029169511);
                        }
                        long var69 = (long) class486.field7134.method631(10494);
                        long var71 = (long) class486.field7134.method641(32455);
                        int var73 = class486.field7134.method618((byte) 100);
                        long var74 = (var69 << 32) + var71;
                        boolean var76 = false;
                        int var77 = 0;
                        while (true) {
                            if (~var77 <= -101) {
                                if (var73 <= 1) {
                                    if ((!class123.field1760 || class482.field7026) && !class422.field6304) {
                                        if (class145.method968(var68, false)) {
                                            var76 = true;
                                        }
                                    } else {
                                        var76 = true;
                                    }
                                }
                                break;
                            }
                            if (~class417.field6233[var77] == ~var74) {
                                var76 = true;
                                break;
                            }
                            ++var77;
                        }
                        if (!var76 && class398.field6065 == 0) {
                            class417.field6233[class516.field7662] = var74;
                            class516.field7662 = (class516.field7662 - -1) % 100;
                            String var78 = class227.method1562(class275.method1745(-20, class486.field7134), 115);
                            if (var73 != 2) {
                                if (var73 == 1) {
                                    class395.method2433(var78, -1, 0, "<img=0>" + var68, "<img=0>" + var67, (String) null, (byte) 67, 7);
                                } else {
                                    class395.method2433(var78, -1, 0, var68, var67, (String) null, (byte) 67, 3);
                                }
                            } else {
                                class395.method2433(var78, -1, 0, "<img=1>" + var68, "<img=1>" + var67, (String) null, (byte) 67, 7);
                            }
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class339.field5361 == class232.field3296) {
                        int var79 = class486.field7134.method634(121);
                        int var80 = class486.field7134.method583(false);
                        class36.field583.method1189(var79, var80, false);
                        class339.field5361 = null;
                        return true;
                    } else if (class94.field1367 == class339.field5361) {
                        int var81 = class486.field7134.method640(110);
                        int var82 = class486.field7134.method583(false);
                        int var83 = class486.field7134.method631(10494);
                        if (class14.method117(true, var83)) {
                            class65.method435(var82, (byte) 124, var81);
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class455.field6685 == class339.field5361) {
                        int var84 = class486.field7134.method631(10494);
                        int var85 = class486.field7134.method631(10494);
                        int var86 = class486.field7134.method631(10494);
                        int var87 = class486.field7134.method631(10494);
                        if (class14.method117(true, var84) && class59.field791[var85] != null) {
                            for (int var88 = var86; ~var87 < ~var88; ++var88) {
                                int var89 = class486.field7134.method641(32455);
                                if (class59.field791[var85].length > var88 && class59.field791[var85][var88] != null) {
                                    class59.field791[var85][var88].field7404 = var89;
                                }
                            }
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class339.field5361 == class21.field334) {
                        int var90 = class486.field7134.method591((byte) 113);
                        int var91 = class486.field7134.method631(10494);
                        if (var91 == 65535) {
                            var91 = -1;
                        }
                        int var92 = class486.field7134.method606((byte) -55);
                        if (class14.method117(true, var92)) {
                            class165.method1165(var90, 2, (byte) -117, var91, -1);
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class339.field5361 == class10.field153) {
                        class514.method3056(-114, class494.field7233);
                        class339.field5361 = null;
                        return true;
                    } else if (class374.field5735 == class339.field5361) {
                        int var93 = class486.field7134.method606((byte) -55);
                        int var94 = class486.field7134.method626((byte) 100);
                        int var95 = class486.field7134.method610(1312572200);
                        if (class14.method117(arg0, var95)) {
                            class251.method1642(var94, 1, var93);
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class352.field5456 == class339.field5361) {
                        class514.method3056(-100, class389.field5906);
                        class339.field5361 = null;
                        return true;
                    } else if (class339.field5361 == class167.field2434) {
                        boolean var96 = ~class486.field7134.method618((byte) 100) == -2;
                        String var97 = class486.field7134.method621(2029169511);
                        String var98 = var97;
                        if (var96) {
                            var98 = class486.field7134.method621(2029169511);
                        }
                        int var99 = class486.field7134.method618((byte) 100);
                        boolean var100 = false;
                        if (var99 <= 1) {
                            if ((!class123.field1760 || class482.field7026) && !class422.field6304) {
                                if (~var99 >= -2 && class145.method968(var98, !arg0)) {
                                    var100 = true;
                                }
                            } else {
                                var100 = true;
                            }
                        }
                        if (!var100 && class398.field6065 == 0) {
                            String var101 = class227.method1562(class275.method1745(-20, class486.field7134), 124);
                            if (var99 != 2) {
                                if (~var99 != -2) {
                                    class395.method2433(var101, -1, 0, var98, var97, (String) null, (byte) 67, 24);
                                } else {
                                    class395.method2433(var101, -1, 0, "<img=0>" + var98, "<img=0>" + var97, (String) null, (byte) 67, 24);
                                }
                            } else {
                                class395.method2433(var101, -1, 0, "<img=1>" + var98, "<img=1>" + var97, (String) null, (byte) 67, 24);
                            }
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class346.field5418 == class339.field5361) {
                        int var102 = class486.field7134.method583(false);
                        int var103 = class486.field7134.method618((byte) 100);
                        int var104 = class486.field7134.method626((byte) 100);
                        class471.field6876[var103] = var104;
                        class261.field3632[var103] = var102;
                        class500.field7451[var103] = 1;
                        int var105 = class369.field5666[var103] + -1;
                        for (int var106 = 0; ~var106 > ~var105; ++var106) {
                            if (var104 >= class462.field6765[var106]) {
                                class500.field7451[var103] = var106 + 2;
                            }
                        }
                        class100.field1444[class494.method2942(class232.field3302++, 31)] = var103;
                        class339.field5361 = null;
                        return true;
                    } else if (class339.field5361 == class14.field235) {
                        String var107 = class486.field7134.method621(2029169511);
                        String var108 = class227.method1562(class275.method1745(-20, class486.field7134), 97);
                        class268.method1712(var108, var107, 6, 0, var107, (byte) 110);
                        class339.field5361 = null;
                        return true;
                    } else if (class339.field5361 == class17.field270) {
                        class514.method3056(-123, class86.field1170);
                        class339.field5361 = null;
                        return true;
                    } else if (class339.field5361 == class225.field3176) {
                        int var109 = class486.field7134.method626((byte) 100);
                        int var110 = class486.field7134.method599(9956);
                        int var111 = class486.field7134.method586(-70);
                        int var112 = class486.field7134.method631(10494);
                        if (class14.method117(true, var112)) {
                            class206.method1432(true, var109, var110, var111);
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class8.field120 == class339.field5361) {
                        int var113 = class486.field7134.method631(10494);
                        int var114 = class486.field7134.method618((byte) 100);
                        int var115 = class486.field7134.method618((byte) 100);
                        int var116 = class486.field7134.method631(10494) << 0;
                        int var117 = class486.field7134.method618((byte) 100);
                        int var118 = class486.field7134.method618((byte) 100);
                        if (class14.method117(arg0, var113)) {
                            class231.method1576(var114, true, -128, var117, var118, var116, var115);
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class415.field6225 == class339.field5361) {
                        class300.method1930(-15514);
                        class339.field5361 = null;
                        return true;
                    } else if (class339.field5361 == class310.field4639) {
                        class503.field7500 = class486.field7134.method618((byte) 100);
                        class156.field2263 = class486.field7134.method633(96) << 3;
                        class292.field4353 = class486.field7134.method619((byte) -23) << 3;
                        while (~class486.field7134.field1292 > ~class461.field6755) {
                            class512 var119 = class435.method2606(-122)[class486.field7134.method618((byte) 100)];
                            class514.method3056(-103, var119);
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class434.field6452 == class339.field5361) {
                        class48.field676 = class486.field7134.method608(!arg0);
                        class44.field654 = class486.field7134.method583(!arg0);
                        class339.field5361 = null;
                        return true;
                    } else if (class417.field6248 == class339.field5361) {
                        int var120 = class486.field7134.method606((byte) -55);
                        if (~var120 == -65536) {
                            var120 = -1;
                        }
                        int var121 = class486.field7134.method610(1312572200);
                        int var122 = class486.field7134.method642(1866188344);
                        if (class14.method117(true, var121)) {
                            class481.method2877(var120, 2, var122);
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class441.field6554 == class339.field5361) {
                        int var123 = class486.field7134.method618((byte) 100);
                        int var124 = class486.field7134.method608(!arg0);
                        if (~var124 == -256) {
                            var123 = -1;
                            var124 = -1;
                        }
                        class138.method918(-119, var123, var124);
                        class339.field5361 = null;
                        return true;
                    } else if (class339.field5361 == class193.field2733) {
                        int var125 = class486.field7134.method606((byte) -55);
                        int var126 = class486.field7134.method640(-119);
                        int var127 = class486.field7134.method606((byte) -55);
                        if (class14.method117(arg0, var125)) {
                            class269.method1718(var127, (byte) -121, var126);
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class339.field5361 == class110.field1552) {
                        boolean var128 = ~class486.field7134.method618((byte) 100) == -2;
                        String var129 = class486.field7134.method621(2029169511);
                        String var130 = var129;
                        if (var128) {
                            var130 = class486.field7134.method621(2029169511);
                        }
                        long var131 = class486.field7134.method607(-30);
                        long var133 = (long) class486.field7134.method631(10494);
                        long var135 = (long) class486.field7134.method641(32455);
                        int var137 = class486.field7134.method618((byte) 100);
                        int var138 = class486.field7134.method631(10494);
                        long var139 = (var133 << 32) + var135;
                        boolean var141 = false;
                        int var142 = 0;
                        while (true) {
                            if (var142 >= 100) {
                                if (var137 <= 1 && class145.method968(var130, false)) {
                                    var141 = true;
                                }
                                break;
                            }
                            if (~class417.field6233[var142] == ~var139) {
                                var141 = true;
                                break;
                            }
                            ++var142;
                        }
                        if (!var141 && ~class398.field6065 == -1) {
                            class417.field6233[class516.field7662] = var139;
                            class516.field7662 = (class516.field7662 + 1) % 100;
                            String var143 = class84.field1147.method3057(64, var138).method368(false, class486.field7134);
                            if (var137 != 2) {
                                if (var137 != 1) {
                                    class395.method2433(var143, var138, 0, var130, var129, class259.method1676((byte) 97, var131), (byte) 67, 20);
                                } else {
                                    class395.method2433(var143, var138, 0, "<img=0>" + var130, "<img=0>" + var129, class259.method1676((byte) 92, var131), (byte) 67, 20);
                                }
                            } else {
                                class395.method2433(var143, var138, 0, "<img=1>" + var130, "<img=1>" + var129, class259.method1676((byte) 106, var131), (byte) 67, 20);
                            }
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class339.field5361 == class325.field4995) {
                        class13.method113(class461.field6755, class486.field7134, true);
                        class339.field5361 = null;
                        return true;
                    } else if (class368.field5662 == class339.field5361) {
                        int var144 = class486.field7134.method610(1312572200);
                        if (var144 == 65535) {
                            var144 = -1;
                        }
                        int var145 = class486.field7134.method642(1866188344);
                        int var146 = class486.field7134.method591((byte) 112);
                        int var147 = class486.field7134.method606((byte) -55);
                        if (class14.method117(true, var147)) {
                            class87.method568((byte) -62, var144, var145, var146);
                            class61 var148 = class84.field1154.method2451(-1, var144);
                            class100.method679(var146, (byte) 29, var148.field830, var148.field873, var148.field875);
                            class11.method94(-1, var148.field856, var148.field837, var148.field838, var146);
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class438.field6527 == class339.field5361) {
                        class524.method3107(66, true);
                        class339.field5361 = null;
                        return true;
                    } else if (class339.field5361 == class168.field2438) {
                        int var149 = class486.field7134.method618((byte) 100);
                        int var150 = class486.field7134.method610(1312572200);
                        boolean var151 = ~(var149 & 1) == -2;
                        class117.method758(var151, var150, 35713);
                        class152.field2182[class494.method2942(31, class456.field6698++)] = var150;
                        class339.field5361 = null;
                        return true;
                    } else if (class339.field5361 == class320.field4904) {
                        class514.method3056(-126, class237.field3375);
                        class339.field5361 = null;
                        return true;
                    } else if (class380.field5790 == class339.field5361) {
                        class433.field6411 = class486.field7134.method618((byte) 100);
                        class111.field1561 = class485.field7086;
                        class339.field5361 = null;
                        return true;
                    } else if (class339.field5361 == class249.field3462) {
                        int var152 = class486.field7134.method631(10494);
                        String var153 = class486.field7134.method621(2029169511);
                        Object[] var154 = new Object[var153.length() + 1];
                        for (int var155 = -1 + var153.length(); var155 >= 0; --var155) {
                            if (~var153.charAt(var155) != -116) {
                                var154[var155 + 1] = new Integer(class486.field7134.method626((byte) 100));
                            } else {
                                var154[var155 + 1] = class486.field7134.method621(2029169511);
                            }
                        }
                        var154[0] = new Integer(class486.field7134.method626((byte) 100));
                        if (class14.method117(arg0, var152)) {
                            class199 var156 = new class199();
                            var156.field2813 = var154;
                            class291.method1886(var156);
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class339.field5361 == class329.field5057) {
                        if (~class329.field5062 != 0) {
                            class336.method2169(class329.field5062, 22590, 0);
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class339.field5361 == class252.field3497) {
                        int var157 = class486.field7134.method610(1312572200);
                        int var158 = class486.field7134.method610(1312572200);
                        int var159 = class486.field7134.method640(-40);
                        int var160 = class486.field7134.method634(113);
                        if (class14.method117(true, var157)) {
                            class352.method2228((var160 << 16) + var158, 13, var159);
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class72.field982 == class339.field5361) {
                        class514.method3056(-109, class265.field3679);
                        class339.field5361 = null;
                        return true;
                    } else if (class510.field7581 == class339.field5361) {
                        String var161 = class486.field7134.method621(2029169511);
                        int var162 = class486.field7134.method631(10494);
                        String var163 = class84.field1147.method3057(64, var162).method368(false, class486.field7134);
                        class395.method2433(var163, var162, 0, var161, var161, (String) null, (byte) 67, 19);
                        class339.field5361 = null;
                        return true;
                    } else if (class48.field673 == class339.field5361) {
                        int var164 = class486.field7134.method631(10494);
                        int var165 = class486.field7134.method618((byte) 100);
                        boolean var166 = ~(1 & var165) == -2;
                        while (~class461.field6755 < ~class486.field7134.field1292) {
                            int var167 = class486.field7134.method598(false);
                            int var168 = class486.field7134.method631(10494);
                            int var169 = 0;
                            if (var168 != 0) {
                                var169 = class486.field7134.method618((byte) 100);
                                if (~var169 == -256) {
                                    var169 = class486.field7134.method626((byte) 100);
                                }
                            }
                            class2.method23(var167, 1, var164, var168 - 1, var169, var166);
                        }
                        class152.field2182[class494.method2942(class456.field6698++, 31)] = var164;
                        class339.field5361 = null;
                        return true;
                    } else if (class473.field6910 == class339.field5361) {
                        class514.method3056(-109, class495.field7239);
                        class339.field5361 = null;
                        return true;
                    } else if (class339.field5361 == class259.field3619) {
                        class514.method3056(-107, class362.field5611);
                        class339.field5361 = null;
                        return true;
                    } else if (class357.field5536 == class339.field5361) {
                        for (int var170 = 0; var170 < class439.field6539.length; ++var170) {
                            if (class439.field6539[var170] != null) {
                                class439.field6539[var170].field5240 = -1;
                            }
                        }
                        for (int var171 = 0; ~var171 > ~class151.field2174.length; ++var171) {
                            if (class151.field2174[var171] != null) {
                                class151.field2174[var171].field5240 = -1;
                            }
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class95.field1381 == class339.field5361) {
                        class514.method3056(-97, class472.field6904);
                        class339.field5361 = null;
                        return true;
                    } else if (class484.field7044 == class339.field5361) {
                        int var172 = class486.field7134.method606((byte) -55);
                        int var173 = class486.field7134.method610(1312572200);
                        String var174 = class486.field7134.method621(2029169511);
                        if (class14.method117(true, var173)) {
                            class399.method2453((byte) -56, var174, var172);
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class8.field118 == class339.field5361) {
                        class88.method576((byte) -109);
                        class339.field5361 = null;
                        return false;
                    } else if (class34.field534 == class339.field5361) {
                        class514.method3056(-119, class277.field3844);
                        class339.field5361 = null;
                        return true;
                    } else if (class339.field5361 == class201.field2832) {
                        class503.field7500 = class486.field7134.method583(false);
                        class156.field2263 = class486.field7134.method620(32131) << 3;
                        class292.field4353 = class486.field7134.method630(30814) << 3;
                        for (class481 var175 = (class481) class392.field5964.method948(62); var175 != null; var175 = (class481) class392.field5964.method938(-102)) {
                            int var177 = (int) (var175.field6799 & 16383L);
                            int var178 = (int) (16383L & var175.field6799 >> 14);
                            int var179 = (int) (var175.field6799 >> 28 & 3L);
                            if (class503.field7500 == var179 && ~class292.field4353 >= ~var177 && class292.field4353 + 8 > var177 && var178 >= class156.field2263 && class156.field2263 + 8 > var178) {
                                var175.method2785((byte) -120);
                                class158.method1031(class503.field7500, (byte) -36, var177, var178);
                            }
                        }
                        for (class309 var176 = (class309) class255.field3530.method1970(64); var176 != null; var176 = (class309) class255.field3530.method1960(24)) {
                            if (~class292.field4353 >= ~var176.field4623 && ~(class292.field4353 + 8) < ~var176.field4623 && ~var176.field4636 <= ~class156.field2263 && ~var176.field4636 > ~(class156.field2263 + 8) && ~class503.field7500 == ~var176.field4635) {
                                var176.field4626 = 0;
                            }
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class339.field5361 == class17.field275) {
                        int var180 = class486.field7134.method636(-2);
                        int var181 = class486.field7134.method636(-2);
                        String var182 = class486.field7134.method621(2029169511);
                        int var183 = class486.field7134.method631(10494);
                        if (~var183 == -65536) {
                            var183 = -1;
                        }
                        if (var181 >= 1 && ~var181 >= -9) {
                            if (var182.equalsIgnoreCase("null")) {
                                var182 = null;
                            }
                            class331.field5123[var181 + -1] = var182;
                            class397.field6039[var181 + -1] = var183;
                            class74.field991[var181 + -1] = ~var180 == -1;
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class339.field5361 == class13.field206) {
                        class514.method3056(-97, class332.field5143);
                        class339.field5361 = null;
                        return true;
                    } else if (class523.field7736 == class339.field5361) {
                        class442.method2668(class419.field6254, class461.field6755, class486.field7134, (byte) -70);
                        class339.field5361 = null;
                        return true;
                    } else if (class339.field5361 == class252.field3494) {
                        int var184 = class486.field7134.method631(10494);
                        int var185 = class486.field7134.method618((byte) 100);
                        int var186 = class486.field7134.method626((byte) 100);
                        int var187 = class486.field7134.method631(10494);
                        if (class14.method117(true, var187)) {
                            class407 var188 = (class407) class27.field449.method943((long) var186, -1);
                            if (var188 != null) {
                                class143.method953((byte) -85, false, var188, var188.field6155 != var184);
                            }
                            class370.method2305(var185, var184, false, false, var186);
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class77.field1040 == class339.field5361) {
                        int var189 = class486.field7134.method631(10494);
                        if (class14.method117(true, var189)) {
                            class326.method2107(-6);
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class399.field6088 == class339.field5361) {
                        class514.method3056(-98, class437.field6485);
                        class339.field5361 = null;
                        return true;
                    } else if (class339.field5361 == class204.field2860) {
                        int var190 = class486.field7134.method598(false);
                        int var191 = class486.field7134.method626((byte) 100);
                        int var192 = class486.field7134.method618((byte) 100);
                        String var193 = "";
                        String var194 = var193;
                        if ((1 & var192) != 0) {
                            var193 = class486.field7134.method621(2029169511);
                            if (~(2 & var192) != -1) {
                                var194 = class486.field7134.method621(2029169511);
                            } else {
                                var194 = var193;
                            }
                        }
                        String var195 = class486.field7134.method621(2029169511);
                        if (~var190 == -100) {
                            class290.method1872(var195, (byte) 98);
                        } else {
                            if (!var194.equals("") && class145.method968(var194, false)) {
                                class339.field5361 = null;
                                return true;
                            }
                            class268.method1712(var195, var194, var190, var191, var193, (byte) 112);
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class339.field5361 == class319.field4891) {
                        int var196 = class486.field7134.method610(1312572200);
                        if (~var196 == -65536) {
                            var196 = -1;
                        }
                        int var197 = class486.field7134.method636(-2);
                        int var198 = class486.field7134.method636(-2);
                        class377.method2342(var196, var197, (byte) -83, var198);
                        class339.field5361 = null;
                        return true;
                    } else if (class463.field6774 == class339.field5361) {
                        int var199 = class486.field7134.method608(false);
                        int var200 = class486.field7134.method622((byte) -114);
                        int var201 = class486.field7134.method631(10494);
                        if (~var201 == -65536) {
                            var201 = -1;
                        }
                        class51.method353(var200, true, var201, var199);
                        class339.field5361 = null;
                        return true;
                    } else if (class524.field7741 == class339.field5361) {
                        int var202 = class486.field7134.method618((byte) 100);
                        if (class486.field7134.method618((byte) 100) == 0) {
                            class371.field5700[var202] = new class143();
                        } else {
                            --class486.field7134.field1292;
                            class371.field5700[var202] = new class143(class486.field7134);
                        }
                        class339.field5361 = null;
                        class23.field354 = class485.field7086;
                        return true;
                    } else if (class339.field5361 == class198.field2801) {
                        int var203 = class486.field7134.method634(113);
                        byte var204 = class486.field7134.method630(30814);
                        class36.field583.method1186(var203, var204, (byte) 96);
                        class339.field5361 = null;
                        return true;
                    } else if (class91.field1333 == class339.field5361) {
                        boolean var205 = class486.field7134.method618((byte) 100) == 1;
                        String var206 = class486.field7134.method621(2029169511);
                        String var207 = var206;
                        if (var205) {
                            var207 = class486.field7134.method621(2029169511);
                        }
                        long var208 = class486.field7134.method607(-20);
                        long var210 = (long) class486.field7134.method631(10494);
                        long var212 = (long) class486.field7134.method641(32455);
                        int var214 = class486.field7134.method618((byte) 100);
                        long var215 = (var210 << 32) + var212;
                        boolean var217 = false;
                        int var218 = 0;
                        while (true) {
                            if (var218 >= 100) {
                                if (var214 <= 1) {
                                    if ((!class123.field1760 || class482.field7026) && !class422.field6304) {
                                        if (class145.method968(var207, false)) {
                                            var217 = true;
                                        }
                                    } else {
                                        var217 = true;
                                    }
                                }
                                break;
                            }
                            if (~class417.field6233[var218] == ~var215) {
                                var217 = true;
                                break;
                            }
                            ++var218;
                        }
                        if (!var217 && class398.field6065 == 0) {
                            class417.field6233[class516.field7662] = var215;
                            class516.field7662 = (class516.field7662 + 1) % 100;
                            String var219 = class227.method1562(class275.method1745(-20, class486.field7134), 95);
                            if (~var214 != -3 && var214 != 3) {
                                if (var214 != 1) {
                                    class395.method2433(var219, -1, 0, var207, var206, class259.method1676((byte) 112, var208), (byte) 67, 9);
                                } else {
                                    class395.method2433(var219, -1, 0, "<img=0>" + var207, "<img=0>" + var206, class259.method1676((byte) 116, var208), (byte) 67, 9);
                                }
                            } else {
                                class395.method2433(var219, -1, 0, "<img=1>" + var207, "<img=1>" + var206, class259.method1676((byte) 108, var208), (byte) 67, 9);
                            }
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class467.field6801 == class339.field5361) {
                        int var220 = class486.field7134.method642(1866188344);
                        int var221 = class486.field7134.method631(10494);
                        class36.field583.method1189(var221, var220, false);
                        class339.field5361 = null;
                        return true;
                    } else if (class339.field5361 == class193.field2743) {
                        int var222 = class486.field7134.method610(1312572200);
                        int var223 = class486.field7134.method626((byte) 100);
                        if (class14.method117(true, var222)) {
                            class165.method1165(var223, 3, (byte) -117, -1, -1);
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class339.field5361 == class193.field2731) {
                        int var224 = class486.field7134.method606((byte) -55);
                        int var225 = class486.field7134.method634(100);
                        if (var225 == 65535) {
                            var225 = -1;
                        }
                        int var226 = class486.field7134.method591((byte) -56);
                        int var227 = class486.field7134.method591((byte) -40);
                        int var228 = class486.field7134.method606((byte) -55);
                        if (var228 == 65535) {
                            var228 = -1;
                        }
                        if (class14.method117(true, var224)) {
                            for (int var229 = var225; var229 <= var228; ++var229) {
                                long var230 = ((long) var227 << 32) + (long) var229;
                                class388 var232 = (class388) class415.field6218.method943(var230, -1);
                                class388 var233;
                                if (var232 != null) {
                                    var233 = new class388(var226, var232.field5894);
                                    var232.method2785((byte) -120);
                                } else if (~var229 != 0) {
                                    var233 = new class388(var226, -1);
                                } else {
                                    var233 = new class388(var226, class211.method1457(var227, 6687).field7432.field5894);
                                }
                                class415.field6218.method940(var230, -69, var233);
                            }
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class339.field5361 == class100.field1442) {
                        class93.field1352 = class486.field7134.method618((byte) 100);
                        class339.field5361 = null;
                        return true;
                    } else if (class471.field6896 == class339.field5361) {
                        class204.field2873 = class486.field7134.method618((byte) 100);
                        for (int var234 = 0; ~class204.field2873 < ~var234; ++var234) {
                            class279.field3853[var234] = class486.field7134.method621(2029169511);
                            class42.field640[var234] = class486.field7134.method621(2029169511);
                            if (class42.field640[var234].equals("")) {
                                class42.field640[var234] = class279.field3853[var234];
                            }
                            class296.field4382[var234] = class486.field7134.method621(2029169511);
                            class381.field5815[var234] = class486.field7134.method621(2029169511);
                            if (class381.field5815[var234].equals("")) {
                                class381.field5815[var234] = class296.field4382[var234];
                            }
                            class152.field2204[var234] = false;
                        }
                        class339.field5361 = null;
                        class475.field6921 = class485.field7086;
                        return true;
                    } else if (class388.field5890 == class339.field5361) {
                        int var235 = class486.field7134.method631(10494);
                        int var236 = class486.field7134.method606((byte) -55);
                        int var237 = class486.field7134.method608(false);
                        class194 var238 = class151.field2174[var235];
                        if (var238 != null) {
                            class138.method919(var237, -117, var238, var236);
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class339.field5361 == class289.field4301) {
                        int var239 = class486.field7134.method618((byte) 100);
                        boolean var240 = ~(1 & var239) == -2;
                        String var241 = class486.field7134.method621(2029169511);
                        String var242 = class486.field7134.method621(2029169511);
                        if (var242.equals("")) {
                            var242 = var241;
                        }
                        String var243 = class486.field7134.method621(2029169511);
                        String var244 = class486.field7134.method621(2029169511);
                        if (var244.equals("")) {
                            var244 = var243;
                        }
                        if (var240) {
                            for (int var245 = 0; ~var245 > ~class204.field2873; ++var245) {
                                if (class42.field640[var245].equals(var244)) {
                                    class279.field3853[var245] = var241;
                                    class42.field640[var245] = var242;
                                    class296.field4382[var245] = var243;
                                    class381.field5815[var245] = var244;
                                    break;
                                }
                            }
                        } else {
                            class279.field3853[class204.field2873] = var241;
                            class42.field640[class204.field2873] = var242;
                            class296.field4382[class204.field2873] = var243;
                            class381.field5815[class204.field2873] = var244;
                            class152.field2204[class204.field2873] = ~class494.method2942(2, var239) == -3;
                            ++class204.field2873;
                        }
                        class339.field5361 = null;
                        class475.field6921 = class485.field7086;
                        return true;
                    } else if (class393.field5969 == class339.field5361) {
                        int var246 = class486.field7134.method591((byte) 79);
                        int var247 = class486.field7134.method610(1312572200);
                        int var248 = class486.field7134.method640(87);
                        int var249 = class486.field7134.method606((byte) -55);
                        if (class14.method117(true, var247)) {
                            class165.method1165(var246, 5, (byte) -117, var249, var248);
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class38.field610 == class339.field5361) {
                        int var250 = class486.field7134.method610(1312572200);
                        int var251 = class486.field7134.method631(10494);
                        int var252 = class486.field7134.method631(10494);
                        if (class14.method117(true, var251)) {
                            class164.method1163(var252, var250, 3, 0);
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class64.field897 == class339.field5361) {
                        int var253 = class486.field7134.method631(10494);
                        int var254 = class486.field7134.method610(1312572200);
                        byte var255 = class486.field7134.method630(30814);
                        if (class14.method117(true, var254)) {
                            class251.method1642(var255, 1, var253);
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class456.field6694 == class339.field5361) {
                        int var256 = class486.field7134.method610(1312572200);
                        int var257 = class486.field7134.method631(10494);
                        if (var257 == 65535) {
                            var257 = -1;
                        }
                        int var258 = class486.field7134.method640(-120);
                        if (class14.method117(true, var256)) {
                            class165.method1165(var258, 1, (byte) -117, var257, -1);
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class339.field5361 == class234.field3320) {
                        int var259 = class486.field7134.method606((byte) -55);
                        int var260 = class486.field7134.method642(1866188344);
                        int var261 = class486.field7134.method634(105);
                        if (class14.method117(true, var261)) {
                            class504.method3011(19499, var259, var260);
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class339.field5361 == class323.field4981) {
                        class156.field2263 = class486.field7134.method633(102) << 3;
                        class503.field7500 = class486.field7134.method636(-2);
                        class292.field4353 = class486.field7134.method620(32131) << 3;
                        class339.field5361 = null;
                        return true;
                    } else if (class339.field5361 == class282.field4030) {
                        class55.field751 = class208.method1442(class486.field7134.method618((byte) 100), false);
                        class339.field5361 = null;
                        return true;
                    } else if (!arg0) {
                        return false;
                    } else if (class339.field5361 == class30.field460) {
                        if (class260.field3628 != null) {
                            class41.method326(-1, -39, -1, class96.field1399.field5234, false);
                        }
                        byte[] var262 = new byte[class461.field6755];
                        class486.field7134.method2081(var262, 255, 0, class461.field6755);
                        String var263 = class424.method2552(var262, 0, class461.field6755, true);
                        class216.method1470(true, true, class419.field6254, class441.field6563 == 1, var263);
                        class339.field5361 = null;
                        return true;
                    } else if (class339.field5361 == class338.field5351) {
                        class486.field7134.field1292 += 28;
                        if (class486.field7134.method595(-22769)) {
                            class306.method1963(class486.field7134.field1292 - 28, (byte) -112, class486.field7134);
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class523.field7725 == class339.field5361) {
                        int var264 = class486.field7134.method634(114);
                        int var265 = class486.field7134.method610(1312572200);
                        int var266 = class486.field7134.method636(-2);
                        if (class14.method117(true, var265)) {
                            if (var266 == 2) {
                                class262.method1690(25);
                            }
                            class329.field5062 = var264;
                            class458.method2755(var264, -25377);
                            class519.method3092(false, 256);
                            class291.method1878(class329.field5062);
                            for (int var267 = 0; var267 < 100; ++var267) {
                                class326.field5002[var267] = true;
                            }
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class339.field5361 == class288.field4289) {
                        int var268 = class486.field7134.method640(80);
                        String var269 = class486.field7134.method621(2029169511);
                        int var270 = class486.field7134.method634(91);
                        if (class14.method117(true, var270)) {
                            class13.method112(var269, -1, var268);
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class55.field741 == class339.field5361) {
                        int var271 = class486.field7134.method631(10494);
                        int var272 = class486.field7134.method640(116);
                        class36.field583.method1186(var271, var272, (byte) 85);
                        class339.field5361 = null;
                        return true;
                    } else if (class371.field5699 == class339.field5361) {
                        int var273 = class486.field7134.method631(10494);
                        int var274 = class486.field7134.method606((byte) -55);
                        int var275 = class486.field7134.method626((byte) 100);
                        if (class14.method117(true, var273)) {
                            class229.method1571(var274, 72, var275);
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class81.field1088 == class339.field5361) {
                        int var276 = class486.field7134.method642(1866188344);
                        int var277 = class486.field7134.method591((byte) 87);
                        int var278 = class486.field7134.method634(123);
                        if (class14.method117(true, var278)) {
                            class407 var279 = (class407) class27.field449.method943((long) var276, -1);
                            class407 var280 = (class407) class27.field449.method943((long) var277, -1);
                            if (var280 != null) {
                                class143.method953((byte) -63, false, var280, var279 == null || ~var279.field6155 != ~var280.field6155);
                            }
                            if (var279 != null) {
                                var279.method2785((byte) -120);
                                class27.field449.method940((long) var277, -40, var279);
                            }
                            class499 var281 = class211.method1457(var276, 6687);
                            if (var281 != null) {
                                class338.method2189((byte) 119, var281);
                            }
                            class499 var282 = class211.method1457(var277, 6687);
                            if (var282 != null) {
                                class338.method2189((byte) 79, var282);
                                class57.method387(var282, true, -16180);
                            }
                            if (~class329.field5062 != 0) {
                                class336.method2169(class329.field5062, 22590, 1);
                            }
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class527.field7784 == class339.field5361) {
                        int var283 = class486.field7134.method626((byte) 100);
                        class93.field1353 = class419.field6254.method2817(var283, 16);
                        class339.field5361 = null;
                        return true;
                    } else if (class339.field5361 == class219.field3073) {
                        int var284 = class486.field7134.method631(10494);
                        int var285 = class486.field7134.method626((byte) 100);
                        if (class14.method117(arg0, var284)) {
                            class407 var286 = (class407) class27.field449.method943((long) var285, -1);
                            if (var286 != null) {
                                class143.method953((byte) -63, false, var286, true);
                            }
                            if (class112.field1571 != null) {
                                class338.method2189((byte) 114, class112.field1571);
                                class112.field1571 = null;
                            }
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class339.field5361 == class172.field2484) {
                        class514.method3056(-91, class265.field3703);
                        class339.field5361 = null;
                        return true;
                    } else if (class371.field5696 == class339.field5361) {
                        int var287 = class486.field7134.method610(1312572200);
                        if (var287 == 65535) {
                            var287 = -1;
                        }
                        int var288 = class486.field7134.method618((byte) 100);
                        int var289 = var288 >> 2;
                        int var290 = 3 & var288;
                        int var291 = class341.field5384[var289];
                        int var292 = class486.field7134.method642(1866188344);
                        int var293 = (887357983 & var292) >> 28;
                        int var294 = (var292 & 268430117) >> 14;
                        int var295 = var292 & 16383;
                        int var296 = var294 - class82.field1105;
                        int var297 = var295 - class437.field6477;
                        class199.method1394(var296, var289, var291, var290, var293, 3, var287, var297);
                        class339.field5361 = null;
                        return true;
                    } else if (class339.field5361 == class279.field3850) {
                        int var298 = class486.field7134.method631(10494);
                        int var299 = class486.field7134.method610(1312572200);
                        int var300 = class486.field7134.method640(77);
                        int var301 = class486.field7134.method631(10494);
                        int var302 = class486.field7134.method631(10494);
                        if (class14.method117(true, var299)) {
                            class165.method1165(var300, 7, (byte) -117, var301 | var298 << 16, var302);
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class8.field121 == class339.field5361) {
                        class36.field583.method1185(-17100);
                        class217.field3012 += 32;
                        class339.field5361 = null;
                        return true;
                    } else if (class67.field920 == class339.field5361) {
                        int var303 = class486.field7134.method631(10494);
                        if (~var303 == -65536) {
                            var303 = -1;
                        }
                        int var304 = class486.field7134.method631(10494);
                        if (~var304 == -65536) {
                            var304 = -1;
                        }
                        int var305 = class486.field7134.method610(1312572200);
                        int var306 = class486.field7134.method631(10494);
                        int var307 = class486.field7134.method642(1866188344);
                        if (class14.method117(true, var305)) {
                            for (int var308 = var304; ~var308 >= ~var303; ++var308) {
                                long var309 = ((long) var307 << 32) - -((long) var308);
                                class388 var311 = (class388) class415.field6218.method943(var309, -1);
                                class388 var312;
                                if (var311 == null) {
                                    if (~var308 != 0) {
                                        var312 = new class388(0, var306);
                                    } else {
                                        var312 = new class388(class211.method1457(var307, 6687).field7432.field5891, var306);
                                    }
                                } else {
                                    var312 = new class388(var311.field5891, var306);
                                    var311.method2785((byte) -120);
                                }
                                class415.field6218.method940(var309, -111, var312);
                            }
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class54.field729 == class339.field5361) {
                        int var313 = class486.field7134.method631(10494);
                        int var314 = class486.field7134.method618((byte) 100);
                        int var315 = class486.field7134.method618((byte) 100);
                        int var316 = class486.field7134.method618((byte) 100);
                        int var317 = class486.field7134.method618((byte) 100);
                        int var318 = class486.field7134.method631(10494);
                        if (class14.method117(true, var313)) {
                            class185.field2614[var314] = true;
                            class374.field5733[var314] = var315;
                            class435.field6470[var314] = var316;
                            class480.field7012[var314] = var317;
                            class395.field6004[var314] = var318;
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class487.field7139 == class339.field5361) {
                        int var319 = class486.field7134.method606((byte) -55);
                        int var320 = class486.field7134.method626((byte) 100);
                        int var321 = class486.field7134.method610(1312572200);
                        int var322 = class486.field7134.method610(1312572200);
                        int var323 = class486.field7134.method610(1312572200);
                        if (class14.method117(true, var321)) {
                            class100.method679(var320, (byte) -112, var323, var319, var322);
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class339.field5361 == class141.field2042) {
                        int var324 = class486.field7134.method631(10494);
                        if (class14.method117(true, var324)) {
                            class314.method2039(0);
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class421.field6287 == class339.field5361) {
                        int var325 = class486.field7134.method631(10494);
                        int var326 = class486.field7134.method618((byte) 100);
                        int var327 = class486.field7134.method618((byte) 100);
                        int var328 = class486.field7134.method631(10494) << 0;
                        int var329 = class486.field7134.method618((byte) 100);
                        int var330 = class486.field7134.method618((byte) 100);
                        if (class14.method117(true, var325)) {
                            class69.method477(var326, var328, var327, var330, (byte) 127, var329);
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class422.field6301 == class339.field5361) {
                        int var331 = class486.field7134.method610(1312572200);
                        int var332 = class486.field7134.method631(10494);
                        int var333 = class486.field7134.method606((byte) -55);
                        int var334 = class486.field7134.method626((byte) 100);
                        int var335 = class486.field7134.method636(-2);
                        boolean var336 = ~(128 & var335) != -1;
                        if (var334 >> 30 == 0) {
                            if (var334 >> 29 != 0) {
                                int var337 = var334 & 65535;
                                class194 var338 = class151.field2174[var337];
                                if (var338 != null) {
                                    if (~var332 == -65536) {
                                        var332 = -1;
                                    }
                                    boolean var339 = true;
                                    int var340 = !var336 ? var338.field5304 : var338.field5260;
                                    if (~var332 != 0 && var340 != -1) {
                                        if (var332 != var340) {
                                            class372 var341 = class275.field3826.method108(var332, 0);
                                            class372 var342 = class275.field3826.method108(var340, 0);
                                            if (var341.field5705 != -1 && ~var342.field5705 != 0) {
                                                class270 var343 = class260.field3621.method1934(125, var341.field5705);
                                                class270 var344 = class260.field3621.method1934(120, var342.field5705);
                                                if (~var343.field3756 > ~var344.field3756) {
                                                    var339 = false;
                                                }
                                            }
                                        } else {
                                            class372 var345 = class275.field3826.method108(var332, 0);
                                            if (var345.field5723 && var345.field5705 != -1) {
                                                class270 var346 = class260.field3621.method1934(115, var345.field5705);
                                                int var347 = var346.field3735;
                                                if (var347 != 0 && var347 != 2) {
                                                    if (var347 == 1) {
                                                        var339 = true;
                                                    }
                                                } else {
                                                    var339 = false;
                                                }
                                            }
                                        }
                                    }
                                    if (var339) {
                                        if (!var336) {
                                            var338.field5302 = 1;
                                            var338.field5321 = 0;
                                            var338.field5295 = class405.field6116 + var331;
                                            var338.field5259 = 7 & var335;
                                            var338.field5261 = var333;
                                            var338.field5258 = 0;
                                            var338.field5304 = var332;
                                            if (class405.field6116 < var338.field5295) {
                                                var338.field5258 = -1;
                                            }
                                            if (~var338.field5304 != 0 && class405.field6116 == var338.field5295) {
                                                int var348 = class275.field3826.method108(var338.field5304, 0).field5705;
                                                if (~var348 != 0) {
                                                    class270 var349 = class260.field3621.method1934(114, var348);
                                                    if (var349 != null && var349.field3765 != null) {
                                                        class445.method2678(false, 0, var338.field2210, var349, var338.field2217, (byte) -1, var338.field2215);
                                                    }
                                                }
                                            }
                                        } else {
                                            var338.field5277 = class405.field6116 + var331;
                                            var338.field5279 = 1;
                                            var338.field5243 = var335 & 7;
                                            var338.field5309 = var333;
                                            var338.field5260 = var332;
                                            var338.field5308 = 0;
                                            var338.field5313 = 0;
                                            if (~class405.field6116 > ~var338.field5277) {
                                                var338.field5308 = -1;
                                            }
                                            if (~var338.field5260 != 0 && ~class405.field6116 == ~var338.field5277) {
                                                int var350 = class275.field3826.method108(var338.field5260, 0).field5705;
                                                if (var350 != -1) {
                                                    class270 var351 = class260.field3621.method1934(116, var350);
                                                    if (var351 != null && var351.field3765 != null) {
                                                        class445.method2678(false, 0, var338.field2210, var351, var338.field2217, (byte) -128, var338.field2215);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (~(var334 >> 28) != -1) {
                                int var352 = var334 & 65535;
                                class322 var353;
                                if (~class452.field6641 != ~var352) {
                                    var353 = class439.field6539[var352];
                                } else {
                                    var353 = class339.field5365;
                                }
                                if (var353 != null) {
                                    if (var332 == 65535) {
                                        var332 = -1;
                                    }
                                    boolean var354 = true;
                                    int var355 = !var336 ? var353.field5304 : var353.field5260;
                                    if (var332 != -1 && var355 != -1) {
                                        if (~var332 != ~var355) {
                                            class372 var356 = class275.field3826.method108(var332, 0);
                                            class372 var357 = class275.field3826.method108(var355, 0);
                                            if (var356.field5705 != -1 && ~var357.field5705 != 0) {
                                                class270 var358 = class260.field3621.method1934(117, var356.field5705);
                                                class270 var359 = class260.field3621.method1934(119, var357.field5705);
                                                if (var359.field3756 > var358.field3756) {
                                                    var354 = false;
                                                }
                                            }
                                        } else {
                                            class372 var360 = class275.field3826.method108(var332, 0);
                                            if (var360.field5723 && ~var360.field5705 != 0) {
                                                class270 var361 = class260.field3621.method1934(127, var360.field5705);
                                                int var362 = var361.field3735;
                                                if (var362 != 0 && ~var362 != -3) {
                                                    if (~var362 == -2) {
                                                        var354 = true;
                                                    }
                                                } else {
                                                    var354 = false;
                                                }
                                            }
                                        }
                                    }
                                    if (var354) {
                                        if (!var336) {
                                            var353.field5258 = 0;
                                            var353.field5259 = var335 & 7;
                                            var353.field5304 = var332;
                                            var353.field5321 = 0;
                                            var353.field5302 = 1;
                                            var353.field5261 = var333;
                                            var353.field5295 = class405.field6116 + var331;
                                            if (~var353.field5304 == -65536) {
                                                var353.field5304 = -1;
                                            }
                                            if (var353.field5295 > class405.field6116) {
                                                var353.field5258 = -1;
                                            }
                                            if (~var353.field5304 != 0 && ~class405.field6116 == ~var353.field5295) {
                                                int var363 = class275.field3826.method108(var353.field5304, 0).field5705;
                                                if (var363 != -1) {
                                                    class270 var364 = class260.field3621.method1934(120, var363);
                                                    if (var364 != null && var364.field3765 != null) {
                                                        class445.method2678(class339.field5365 == var353, 0, var353.field2210, var364, var353.field2217, (byte) 62, var353.field2215);
                                                    }
                                                }
                                            }
                                        } else {
                                            var353.field5313 = 0;
                                            var353.field5277 = class405.field6116 - -var331;
                                            var353.field5260 = var332;
                                            var353.field5308 = 0;
                                            var353.field5243 = 7 & var335;
                                            var353.field5279 = 1;
                                            var353.field5309 = var333;
                                            if (~var353.field5260 == -65536) {
                                                var353.field5260 = -1;
                                            }
                                            if (~var353.field5277 < ~class405.field6116) {
                                                var353.field5308 = -1;
                                            }
                                            if (~var353.field5260 != 0 && ~class405.field6116 == ~var353.field5277) {
                                                int var365 = class275.field3826.method108(var353.field5260, 0).field5705;
                                                if (~var365 != 0) {
                                                    class270 var366 = class260.field3621.method1934(119, var365);
                                                    if (var366 != null && var366.field3765 != null) {
                                                        class445.method2678(class339.field5365 == var353, 0, var353.field2210, var366, var353.field2217, (byte) -115, var353.field2215);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            int var367 = var334 >> 28 & 3;
                            int var368 = ((var334 & 268433985) >> 14) - class82.field1105;
                            int var369 = (16383 & var334) + -class437.field6477;
                            if (var368 >= 0 && ~var369 <= -1 && var368 < class96.field1403 && ~class485.field7122 < ~var369) {
                                int var370 = var368 * 128 + 64;
                                int var371 = var369 * 128 + 64;
                                int var372 = var367;
                                if (var367 < 3 && class42.method333(var369, var368, 0)) {
                                    var372 = var367 + 1;
                                }
                                class384 var373 = new class384(var332, 0, class405.field6116, var367, var372, var370, -var333 + class500.method2985(var370, 5293, var367, var371), var371, var368, var368, var369, var369, var335);
                                class443.field6601.method1958(new class25(var373), 0);
                            }
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class339.field5361 == class315.field4815) {
                        class439.field6542 = 1;
                        class339.field5361 = null;
                        class475.field6921 = class485.field7086;
                        return true;
                    } else if (class490.field7164 == class339.field5361) {
                        int var374 = class486.field7134.method631(10494);
                        if (var374 == 65535) {
                            var374 = -1;
                        }
                        int var375 = class486.field7134.method618((byte) 100);
                        int var376 = class486.field7134.method631(10494);
                        int var377 = class486.field7134.method618((byte) 100);
                        class316.method2046(var375, var377, var376, var374, (byte) -106);
                        class339.field5361 = null;
                        return true;
                    } else if (class339.field5361 == class281.field3867) {
                        int var378 = class486.field7134.method626((byte) 100);
                        int var379 = class486.field7134.method634(84);
                        if (class14.method117(arg0, var379)) {
                            class165.method1165(var378, 5, (byte) -117, class452.field6641, 0);
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class461.field6761 == class339.field5361) {
                        class514.method3056(-121, class85.field1165);
                        class339.field5361 = null;
                        return true;
                    } else if (class463.field6778 == class339.field5361) {
                        int var380 = class486.field7134.method634(125);
                        int var381 = class486.field7134.method610(1312572200);
                        String var382 = class486.field7134.method621(2029169511);
                        if (class14.method117(true, var381)) {
                            class399.method2453((byte) -56, var382, var380);
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class396.field6022 == class339.field5361) {
                        class514.method3056(-117, class66.field916);
                        class339.field5361 = null;
                        return true;
                    } else if (class519.field7698 == class339.field5361) {
                        class481.method2879(1);
                        class339.field5361 = null;
                        return false;
                    } else if (class339.field5361 == class194.field2767) {
                        while (~class486.field7134.field1292 > ~class461.field6755) {
                            boolean var393 = class486.field7134.method618((byte) 100) == 1;
                            String var394 = class486.field7134.method621(2029169511);
                            String var395 = class486.field7134.method621(2029169511);
                            int var396 = class486.field7134.method631(10494);
                            int var397 = class486.field7134.method618((byte) 100);
                            String var398 = "";
                            boolean var399 = false;
                            if (~var396 < -1) {
                                var398 = class486.field7134.method621(2029169511);
                                var399 = class486.field7134.method618((byte) 100) == 1;
                            }
                            for (int var400 = 0; var400 < class189.field2653; ++var400) {
                                if (var393) {
                                    if (var395.equals(class397.field6033[var400])) {
                                        class397.field6033[var400] = var394;
                                        class442.field6573[var400] = var395;
                                        var394 = null;
                                        break;
                                    }
                                } else if (var394.equals(class397.field6033[var400])) {
                                    if (class323.field4985[var400] != var396) {
                                        class323.field4985[var400] = var396;
                                        if (~var396 < -1) {
                                            class268.method1712(var394 + class274.field3816.method2335((byte) -100, class288.field4292), "", 5, 0, "", (byte) 113);
                                        }
                                        if (var396 == 0) {
                                            class268.method1712(var394 + class354.field5491.method2335((byte) -100, class288.field4292), "", 5, 0, "", (byte) 117);
                                        }
                                    }
                                    class442.field6573[var400] = var395;
                                    class300.field4435[var400] = var398;
                                    class344.field5391[var400] = var397;
                                    class26.field433[var400] = var399;
                                    var394 = null;
                                    break;
                                }
                            }
                            if (var394 != null && class189.field2653 < 200) {
                                class397.field6033[class189.field2653] = var394;
                                class442.field6573[class189.field2653] = var395;
                                class323.field4985[class189.field2653] = var396;
                                class300.field4435[class189.field2653] = var398;
                                class344.field5391[class189.field2653] = var397;
                                class26.field433[class189.field2653] = var399;
                                ++class189.field2653;
                            }
                        }
                        class439.field6542 = 2;
                        class475.field6921 = class485.field7086;
                        boolean var383 = false;
                        int var384 = class189.field2653;
                        while (~var384 < -1) {
                            --var384;
                            boolean var385 = true;
                            for (int var386 = 0; var386 < var384; ++var386) {
                                if (~class323.field4985[var386] != ~class12.field195 && ~class323.field4985[var386 + 1] == ~class12.field195 || class323.field4985[var386] == 0 && class323.field4985[var386 + 1] != 0) {
                                    int var387 = class323.field4985[var386];
                                    class323.field4985[var386] = class323.field4985[var386 - -1];
                                    class323.field4985[var386 + 1] = var387;
                                    String var388 = class300.field4435[var386];
                                    class300.field4435[var386] = class300.field4435[var386 + 1];
                                    class300.field4435[var386 - -1] = var388;
                                    String var389 = class397.field6033[var386];
                                    class397.field6033[var386] = class397.field6033[var386 - -1];
                                    class397.field6033[var386 + 1] = var389;
                                    String var390 = class442.field6573[var386];
                                    class442.field6573[var386] = class442.field6573[var386 + 1];
                                    class442.field6573[var386 + 1] = var390;
                                    int var391 = class344.field5391[var386];
                                    class344.field5391[var386] = class344.field5391[var386 + 1];
                                    class344.field5391[var386 + 1] = var391;
                                    boolean var392 = class26.field433[var386];
                                    class26.field433[var386] = class26.field433[var386 + 1];
                                    class26.field433[var386 + 1] = var392;
                                    var385 = false;
                                }
                            }
                            if (var385) {
                                break;
                            }
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class363.field5625 == class339.field5361) {
                        int var401 = class486.field7134.method618((byte) 100);
                        int var402 = var401 >> 5;
                        int var403 = var401 & 31;
                        if (var403 == 0) {
                            class463.field6771[var402] = null;
                            class339.field5361 = null;
                            return true;
                        } else {
                            class187 var404 = new class187();
                            var404.field2631 = var403;
                            var404.field2629 = class486.field7134.method618((byte) 100);
                            if (~var404.field2629 <= -1 && ~var404.field2629 > ~class483.field7036.length) {
                                if (~var404.field2631 != -2 && var404.field2631 != 10) {
                                    if (var404.field2631 >= 2 && var404.field2631 <= 6) {
                                        if (~var404.field2631 == -3) {
                                            var404.field2628 = 64;
                                            var404.field2624 = 64;
                                        }
                                        if (var404.field2631 == 3) {
                                            var404.field2624 = 0;
                                            var404.field2628 = 64;
                                        }
                                        if (var404.field2631 == 4) {
                                            var404.field2628 = 64;
                                            var404.field2624 = 128;
                                        }
                                        if (~var404.field2631 == -6) {
                                            var404.field2628 = 0;
                                            var404.field2624 = 64;
                                        }
                                        if (~var404.field2631 == -7) {
                                            var404.field2624 = 64;
                                            var404.field2628 = 128;
                                        }
                                        var404.field2631 = 2;
                                        var404.field2630 = class486.field7134.method618((byte) 100);
                                        var404.field2624 += class486.field7134.method631(10494) - class82.field1105 << 7;
                                        var404.field2628 += class486.field7134.method631(10494) + -class437.field6477 << 7;
                                        var404.field2622 = class486.field7134.method618((byte) 100);
                                        var404.field2621 = class486.field7134.method631(10494);
                                    }
                                } else {
                                    var404.field2626 = class486.field7134.method631(10494);
                                    class486.field7134.field1292 += 6;
                                }
                                var404.field2623 = class486.field7134.method631(10494);
                                if (~var404.field2623 == -65536) {
                                    var404.field2623 = -1;
                                }
                                class463.field6771[var402] = var404;
                            }
                            class339.field5361 = null;
                            return true;
                        }
                    } else if (class516.field7655 == class339.field5361) {
                        class454.field6673 = class461.field6755 > 2 ? class486.field7134.method621(2029169511) : class287.field4284.method2335((byte) -100, class288.field4292);
                        class456.field6697 = ~class461.field6755 >= -1 ? -1 : class486.field7134.method631(10494);
                        if (~class456.field6697 == -65536) {
                            class456.field6697 = -1;
                        }
                        class339.field5361 = null;
                        return true;
                    } else if (class527.field7779 == class339.field5361) {
                        class336.method2164((byte) -126, class486.field7134.method621(2029169511));
                        class339.field5361 = null;
                        return true;
                    } else {
                        class438.method2644("T1 - " + (class339.field5361 != null ? class339.field5361.method2920(2) : -1) + "," + (class338.field5357 == null ? -1 : class338.field5357.method2920(2)) + "," + (class329.field5109 == null ? -1 : class329.field5109.method2920(2)) + " - " + class461.field6755, -1, (Throwable) null);
                        class19.method146(0);
                        return true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V", line = 3109)
    public static void method1625(int arg0) {
        if (arg0 != 625777584) {
            field3414 = null;
        }
        field3414 = null;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(III)V", line = 3119)
    public final void method136(int arg0, int arg1, int arg2) {
        ++field3424;
        if (arg0 != 1244456711) {
            this.method136(38, 118, 108);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZI)V", line = 3129)
    public static final void method1626(boolean arg0, int arg1) {
        ++field3416;
        for (class119 var2 = (class119) class73.field987.method1970(64); var2 != null; var2 = (class119) class73.field987.method1960(24)) {
            if (var2.field1681 != null) {
                class325.field4996.method1274(var2.field1681);
                var2.field1681 = null;
            }
            if (var2.field1665 != null) {
                class325.field4996.method1274(var2.field1665);
                var2.field1665 = null;
            }
            var2.method2785((byte) -120);
        }
        if (arg1 != -1) {
            method1625(119);
        }
        if (arg0) {
            for (class119 var3 = (class119) class55.field747.method1970(64); var3 != null; var3 = (class119) class55.field747.method1960(24)) {
                if (var3.field1681 != null) {
                    class325.field4996.method1274(var3.field1681);
                    var3.field1681 = null;
                }
                var3.method2785((byte) -120);
            }
            for (class119 var4 = (class119) class266.field3707.method948(arg1 ^ -17); var4 != null; var4 = (class119) class266.field3707.method938(-92)) {
                if (var4.field1681 != null) {
                    class325.field4996.method1274(var4.field1681);
                    var4.field1681 = null;
                }
                var4.method2785((byte) -120);
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIB)V", line = 3200)
    public static final void method1627(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        for (int var5 = 0; ~class425.field6335 < ~var5; ++var5) {
            Rectangle var6 = class383.field5834[var5];
            if (var6.x - -var6.width > arg3 && var6.x < arg0 + arg3 && ~(var6.y - -var6.height) < ~arg1 && arg1 + arg2 > var6.y) {
                class326.field5002[var5] = true;
            }
        }
        ++field3423;
        if (arg4 != -31) {
            method1626(true, -85);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)V", line = 3224)
    public final void method137(int arg0, int arg1, int arg2) {
        if (arg1 != -2) {
            this.method132(-122, (byte) 42, -5);
        }
        ++field3415;
        int var4 = this.field3419 * arg2 >> 12;
        int var5 = this.field3418 * arg2 >> 12;
        int var6 = this.field3417 * arg0 >> 12;
        int var7 = this.field3421 * arg0 >> 12;
        class49.method351(super.field5453, var6, var7, super.field5451, var4, super.field5452, true, var5);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IBI)V", line = 3245)
    public final void method132(int arg0, byte arg1, int arg2) {
        ++field3422;
        if (arg1 > -43) {
            method1626(true, -14);
        }
        int var4 = this.field3419 * arg0 >> 12;
        int var5 = this.field3418 * arg0 >> 12;
        int var6 = this.field3417 * arg2 >> 12;
        int var7 = this.field3421 * arg2 >> 12;
        class425.method2560(var7, -85, var4, var6, super.field5452, var5);
    }
}
