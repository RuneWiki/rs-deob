import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class89 extends class142 {

    @OriginalMember(owner = "client!jg", name = "S", descriptor = "I")
    public static int field1559 = 0;

    @OriginalMember(owner = "client!jg", name = "Y", descriptor = "Lai;")
    private static class10 field1565 = class44.method278("Choose Option", 127);

    @OriginalMember(owner = "client!jg", name = "X", descriptor = "Lai;")
    public static class10 field1564 = field1565;

    @OriginalMember(owner = "client!jg", name = "U", descriptor = "Ldd;")
    public static class34 field1561 = new class34(64);

    @OriginalMember(owner = "client!jg", name = "cb", descriptor = "Lai;")
    private static class10 field1569 = class44.method278("Select", 96);

    @OriginalMember(owner = "client!jg", name = "fb", descriptor = "Lai;")
    public static class10 field1572 = field1569;

    @OriginalMember(owner = "client!jg", name = "db", descriptor = "I")
    public static int field1570 = 0;

    @OriginalMember(owner = "client!jg", name = "gb", descriptor = "I")
    public static int field1573 = 1;

    @OriginalMember(owner = "client!jg", name = "kb", descriptor = "Lai;")
    private static class10 field1577 = class44.method278("Checking for updates )2 ", 107);

    @OriginalMember(owner = "client!jg", name = "jb", descriptor = "Lai;")
    public static class10 field1576 = field1577;

    @OriginalMember(owner = "client!jg", name = "hb", descriptor = "Lai;")
    private static class10 field1574 = class44.method278("Account locked as we suspect it has been stolen)3", 98);

    @OriginalMember(owner = "client!jg", name = "ib", descriptor = "Lai;")
    public static class10 field1575 = field1574;

    @OriginalMember(owner = "client!jg", name = "R", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!jg", name = "T", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!jg", name = "V", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!jg", name = "W", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!jg", name = "Z", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!jg", name = "bb", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!jg", name = "eb", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!jg", name = "ab", descriptor = "Lca;")
    public static class22 field1567;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(III)V")
    public static final void method545(int arg0, int arg1, int arg2) {
        ++field1566;
        if (class133.field2499 != arg1) {
            class79.field1395 = new int[arg1];
            for (int var3 = 0; arg1 > var3; ++var3) {
                class79.field1395[var3] = (var3 << 12) / arg1;
            }
            class133.field2499 = arg1;
            class56.field997 = arg1 + -1;
        }
        if (arg2 == -1) {
            if (class13.field219 != arg0) {
                class13.field212 = new int[arg0];
                for (int var4 = 0; ~var4 > ~arg0; ++var4) {
                    class13.field212[var4] = (var4 << 12) / arg0;
                }
                class13.field219 = arg0;
                class205.field3986 = arg0 + -1;
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(Z)Z")
    public static final boolean method546(boolean arg0) {
        ++field1568;
        if (class188.field3593 == null) {
            return false;
        } else {
            try {
                int var1 = class188.field3593.method551(!arg0);
                if (~var1 == -1) {
                    return false;
                }
                if (~class98.field1818 == 0) {
                    --var1;
                    class188.field3593.method556((byte) -57, 1, class74.field1273.field2160, 0);
                    class74.field1273.field2170 = 0;
                    class98.field1818 = class74.field1273.method631(-123);
                    class154.field2972 = class149.field2874[class98.field1818];
                }
                if (class154.field2972 == -1) {
                    if (var1 <= 0) {
                        return false;
                    }
                    class188.field3593.method556((byte) -116, 1, class74.field1273.field2160, 0);
                    class154.field2972 = 255 & class74.field1273.field2160[0];
                    --var1;
                }
                if (~class154.field2972 == 1) {
                    if (~var1 >= -2) {
                        return false;
                    }
                    class188.field3593.method556((byte) 119, 2, class74.field1273.field2160, 0);
                    var1 -= 2;
                    class74.field1273.field2170 = 0;
                    class154.field2972 = class74.field1273.method762((byte) 78);
                }
                if (var1 < class154.field2972) {
                    return false;
                }
                class74.field1273.field2170 = 0;
                class188.field3593.method556((byte) -13, class154.field2972, class74.field1273.field2160, 0);
                class37.field585 = 0;
                class157.field3032 = class162.field3111;
                class162.field3111 = class101.field1890;
                class101.field1890 = class98.field1818;
                if (class98.field1818 == 119) {
                    class176.method1149((byte) -113);
                    class98.field1818 = -1;
                    return false;
                }
                if (~class98.field1818 == -107) {
                    class10 var2 = class74.field1273.method764((byte) 77);
                    Object[] var3 = new Object[1 + var2.method40((byte) 79)];
                    for (int var4 = -1 + var2.method40((byte) 120); var4 >= 0; --var4) {
                        if (~var2.method61(var4, -1) != -116) {
                            var3[var4 + 1] = new Integer(class74.field1273.method761(255));
                        } else {
                            var3[var4 + 1] = class74.field1273.method764((byte) 110);
                        }
                    }
                    var3[0] = new Integer(class74.field1273.method761(255));
                    class5 var5 = new class5();
                    var5.field53 = var3;
                    class104.method681(200000, var5);
                    class98.field1818 = -1;
                    return true;
                }
                if (class98.field1818 == 1) {
                    int var6 = class74.field1273.method797(-118);
                    int var7 = class74.field1273.method795(-1);
                    class200 var8 = class66.method432(var6, false);
                    if (~var8.field3841 != -3 || var8.field3788 != var7) {
                        var8.field3788 = var7;
                        var8.field3841 = 2;
                        class168.method1116(var8, -89);
                    }
                    class98.field1818 = -1;
                    return true;
                }
                if (class98.field1818 == 74) {
                    int var9 = class74.field1273.method762((byte) 76);
                    int var10 = class74.field1273.method767(arg0);
                    int var11 = class74.field1273.method762((byte) 109);
                    class130.method907(-102, var11, var10, var9);
                    class98.field1818 = -1;
                    return true;
                }
                if (class98.field1818 == 159) {
                    class34.field525 = class74.field1273.method767(true);
                    client.field451 = class74.field1273.method767(true);
                    class104.field1940 = class74.field1273.method767(true);
                    class98.field1818 = -1;
                    return true;
                }
                if (class98.field1818 == 141) {
                    class172.method1132((byte) -78, false);
                    class98.field1818 = -1;
                    return true;
                }
                if (~class98.field1818 == -151) {
                    long var12 = class74.field1273.method811(110);
                    int var14 = class74.field1273.method762((byte) 97);
                    int var15 = class74.field1273.method767(true);
                    class10 var16 = class56.method381(var12, (byte) 98).method39(-109);
                    for (int var17 = 0; ~class124.field2380 < ~var17; ++var17) {
                        if (~class115.field2205[var17] == ~var12) {
                            if (class47.field795[var17] != var14) {
                                class47.field795[var17] = var14;
                                if (~var14 < -1) {
                                    class6.method20(5, class67.method440(0, new class10[] { var16, class169.field3266 }), (byte) 117, class10.field119);
                                }
                                if (var14 == 0) {
                                    class6.method20(5, class67.method440(0, new class10[] { var16, class118.field2284 }), (byte) 117, class10.field119);
                                }
                            }
                            class77.field1341[var17] = var15;
                            var16 = null;
                            break;
                        }
                    }
                    boolean var18 = false;
                    if (var16 != null && class124.field2380 < 200) {
                        class115.field2205[class124.field2380] = var12;
                        class131.field2480[class124.field2380] = var16;
                        class47.field795[class124.field2380] = var14;
                        class77.field1341[class124.field2380] = var15;
                        ++class124.field2380;
                    }
                    class98.field1812 = class7.field78;
                    int var19 = class124.field2380;
                    while (~var19 < -1) {
                        boolean var20 = true;
                        --var19;
                        for (int var21 = 0; var21 < var19; ++var21) {
                            if (class47.field795[var21] != class191.field3630 && class47.field795[var21 + 1] == class191.field3630 || class47.field795[var21] == 0 && class47.field795[var21 + 1] != 0) {
                                var20 = false;
                                int var22 = class47.field795[var21];
                                class47.field795[var21] = class47.field795[var21 + 1];
                                class47.field795[var21 - -1] = var22;
                                class10 var23 = class131.field2480[var21];
                                class131.field2480[var21] = class131.field2480[var21 - -1];
                                class131.field2480[var21 - -1] = var23;
                                long var24 = class115.field2205[var21];
                                class115.field2205[var21] = class115.field2205[var21 + 1];
                                class115.field2205[var21 - -1] = var24;
                                int var26 = class77.field1341[var21];
                                class77.field1341[var21] = class77.field1341[var21 + 1];
                                class77.field1341[var21 + 1] = var26;
                            }
                        }
                        if (var20) {
                            break;
                        }
                    }
                    class98.field1818 = -1;
                    return true;
                }
                if (~class98.field1818 == -127) {
                    if (class27.field402 != -1) {
                        class73.method460(0, class27.field402, (byte) -110);
                    }
                    class98.field1818 = -1;
                    return true;
                }
                if (~class98.field1818 == -29) {
                    class126.field2404 = class74.field1273.method767(true);
                    class98.field1818 = -1;
                    return true;
                }
                if (~class98.field1818 == -20) {
                    class128.field2435 = true;
                    class2.field7 = class74.field1273.method767(true);
                    class205.field3993 = class74.field1273.method767(true);
                    class186.field3549 = class74.field1273.method762((byte) 71);
                    class101.field1899 = class74.field1273.method767(true);
                    class13.field208 = class74.field1273.method767(true);
                    if (~class13.field208 <= -101) {
                        int var27 = class2.field7 * 128 - -64;
                        int var28 = class205.field3993 * 128 + 64;
                        int var29 = class145.method1003((byte) -120, var27, var28, class42.field687) + -class186.field3549;
                        int var30 = -class14.field226 + var29;
                        int var31 = -class119.field2294 + var27;
                        int var32 = var28 - class34.field520;
                        int var33 = (int) Math.sqrt((double) (var31 * var31 + var32 * var32));
                        class120.field2306 = 2047 & (int) (325.949D * Math.atan2((double) var30, (double) var33));
                        class207.field4044 = 2047 & (int) (Math.atan2((double) var31, (double) var32) * -325.949D);
                        if (class120.field2306 < 128) {
                            class120.field2306 = 128;
                        }
                        if (~class120.field2306 < -384) {
                            class120.field2306 = 383;
                        }
                    }
                    class98.field1818 = -1;
                    return true;
                }
                if (class98.field1818 == 151) {
                    int var34 = class74.field1273.method780(10664);
                    int var35 = class74.field1273.method790(8);
                    class200 var36 = class66.method432(var35, !arg0);
                    if (var36 != null && var36.field3888 == 0) {
                        if (var36.field3873 - var36.field3925 < var34) {
                            var34 = -var36.field3925 + var36.field3873;
                        }
                        if (var34 < 0) {
                            var34 = 0;
                        }
                        if (var36.field3907 != var34) {
                            var36.field3907 = var34;
                            class168.method1116(var36, -126);
                        }
                    }
                    class98.field1818 = -1;
                    return true;
                }
                if (class98.field1818 == 140) {
                    int var37 = class74.field1273.method795(-1);
                    if (~var37 == -65536) {
                        var37 = -1;
                    }
                    int var38 = class74.field1273.method775(-109);
                    int var39 = class74.field1273.method760(-258911864);
                    int var40 = class74.field1273.method797(-119);
                    if (var38 == 65535) {
                        var38 = -1;
                    }
                    for (int var41 = var38; var41 <= var37; ++var41) {
                        long var42 = ((long) var39 << 32) + (long) var41;
                        class119 var44 = class207.field4032.method213(126, var42);
                        if (var44 != null) {
                            var44.method848(false);
                        }
                        class207.field4032.method214(new class29(var40), (byte) 118, var42);
                    }
                    class98.field1818 = -1;
                    return true;
                }
                if (~class98.field1818 == -16) {
                    long var45 = class74.field1273.method811(116);
                    class74.field1273.method759((byte) 127);
                    long var47 = class74.field1273.method811(126);
                    long var49 = (long) class74.field1273.method762((byte) 124);
                    long var51 = (long) class74.field1273.method771(111);
                    int var53 = class74.field1273.method767(true);
                    long var54 = (var49 << 32) + var51;
                    boolean var56 = false;
                    for (int var57 = 0; var57 < 100; ++var57) {
                        if (class141.field2661[var57] == var54) {
                            var56 = true;
                            break;
                        }
                    }
                    if (~var53 >= -2) {
                        for (int var58 = 0; ~class78.field1375 < ~var58; ++var58) {
                            if (class153.field2935[var58] == var45) {
                                var56 = true;
                                break;
                            }
                        }
                    }
                    if (!var56 && ~class125.field2391 == -1) {
                        class141.field2661[class184.field3511] = var54;
                        class184.field3511 = (class184.field3511 + 1) % 100;
                        class10 var59 = class198.method1264(class147.method1017(class74.field1273, -73).method43(false));
                        if (~var53 != -3 && ~var53 != -4) {
                            if (~var53 == -2) {
                                class201.method1305(class56.method381(var47, (byte) 57).method39(-122), class67.method440(0, new class10[] { class87.field1538, class56.method381(var45, (byte) 81).method39(-123) }), var59, false, 9);
                            } else {
                                class201.method1305(class56.method381(var47, (byte) 123).method39(-119), class56.method381(var45, (byte) 85).method39(-102), var59, !arg0, 9);
                            }
                        } else {
                            class201.method1305(class56.method381(var47, (byte) 123).method39(-123), class67.method440(0, new class10[] { class169.field3259, class56.method381(var45, (byte) 66).method39(-116) }), var59, false, 9);
                        }
                    }
                    class98.field1818 = -1;
                    return true;
                }
                if (~class98.field1818 == -148) {
                    class7.field79 = class7.field78;
                    long var60 = class74.field1273.method811(121);
                    if (var60 == 0L) {
                        class75.field1288 = null;
                        class193.field3674 = 0;
                        class47.field817 = null;
                        class64.field1061 = null;
                        class98.field1818 = -1;
                        return true;
                    }
                    long var62 = class74.field1273.method811(112);
                    class64.field1061 = class56.method381(var62, (byte) 126);
                    class47.field817 = class56.method381(var60, (byte) 96);
                    class144.field2758 = class74.field1273.method759((byte) 127);
                    int var64 = class74.field1273.method767(true);
                    if (var64 == 255) {
                        class98.field1818 = -1;
                        return true;
                    }
                    class9[] var65 = new class9[100];
                    class193.field3674 = var64;
                    for (int var66 = 0; class193.field3674 > var66; ++var66) {
                        var65[var66] = new class9();
                        var65[var66].field2291 = class74.field1273.method811(116);
                        var65[var66].field114 = class56.method381(var65[var66].field2291, (byte) 85);
                        var65[var66].field110 = class74.field1273.method762((byte) 72);
                        var65[var66].field106 = class74.field1273.method759((byte) 127);
                        if (class75.field1304 == var65[var66].field2291) {
                            class44.field724 = var65[var66].field106;
                        }
                    }
                    boolean var67 = false;
                    int var68 = class193.field3674;
                    while (var68 > 0) {
                        --var68;
                        boolean var69 = true;
                        for (int var70 = 0; var70 < var68; ++var70) {
                            if (var65[var70].field114.method47(var65[var70 + 1].field114, false) > 0) {
                                var69 = false;
                                class9 var71 = var65[var70];
                                var65[var70] = var65[var70 + 1];
                                var65[var70 + 1] = var71;
                            }
                        }
                        if (var69) {
                            break;
                        }
                    }
                    class75.field1288 = var65;
                    class98.field1818 = -1;
                    return true;
                }
                if (~class98.field1818 == -10) {
                    byte var72 = class74.field1273.method787(-128);
                    int var73 = class74.field1273.method780(10664);
                    class33.field506[var73] = var72;
                    if (~class13.field215[var73] != ~var72) {
                        class13.field215[var73] = var72;
                        class157.method1056((byte) -126, var73);
                    }
                    class128.field2429[class123.method861(31, class4.field33++)] = var73;
                    class98.field1818 = -1;
                    return true;
                }
                if (class98.field1818 == 41) {
                    int var74 = class74.field1273.method767(true);
                    int var75 = class74.field1273.method767(arg0);
                    int var76 = class74.field1273.method767(true);
                    int var77 = class74.field1273.method767(arg0);
                    int var78 = class74.field1273.method762((byte) 122);
                    class130.field2474[var74] = true;
                    class19.field278[var74] = var75;
                    class128.field2428[var74] = var76;
                    class7.field86[var74] = var77;
                    class78.field1361[var74] = var78;
                    class98.field1818 = -1;
                    return true;
                }
                if (~class98.field1818 == -19) {
                    int var79 = class74.field1273.method795(-1);
                    int var80 = class74.field1273.method761(255);
                    class200 var81 = class66.method432(var80, !arg0);
                    if (~var81.field3841 != -2 || var81.field3788 != var79) {
                        var81.field3788 = var79;
                        var81.field3841 = 1;
                        class168.method1116(var81, -75);
                    }
                    class98.field1818 = -1;
                    return true;
                }
                if (~class98.field1818 == -57) {
                    class172.method1132((byte) -78, true);
                    class98.field1818 = -1;
                    return true;
                }
                if (~class98.field1818 == -30) {
                    int var82 = class74.field1273.method761(255);
                    class118 var83 = (class118) class165.field3162.method213(123, (long) var82);
                    if (var83 != null) {
                        class27.method176(arg0, var83, true);
                    }
                    if (class137.field2569 != null) {
                        class168.method1116(class137.field2569, -89);
                        class137.field2569 = null;
                    }
                    class98.field1818 = -1;
                    return true;
                }
                if (class98.field1818 == 78) {
                    class84.field1459 = class74.field1273.method806(0);
                    class128.field2431 = class74.field1273.method806(0);
                    class98.field1818 = -1;
                    return true;
                }
                if (class98.field1818 == 246) {
                    class184.method1185(!arg0);
                    class98.field1818 = -1;
                    return true;
                }
                if (class98.field1818 == 38) {
                    class118.method844(class120.field2313, class154.field2972, class74.field1273, (byte) -68);
                    class98.field1818 = -1;
                    return true;
                }
                if (class98.field1818 == 88) {
                    int var84 = class74.field1273.method797(-122);
                    int var85 = class74.field1273.method775(-67);
                    class33.field506[var85] = var84;
                    if (~class13.field215[var85] != ~var84) {
                        class13.field215[var85] = var84;
                        class157.method1056((byte) -127, var85);
                    }
                    class128.field2429[class123.method861(class4.field33++, 31)] = var85;
                    class98.field1818 = -1;
                    return true;
                }
                if (class98.field1818 == 149) {
                    class84.field1459 = class74.field1273.method774(255);
                    class128.field2431 = class74.field1273.method806(0);
                    while (~class74.field1273.field2170 > ~class154.field2972) {
                        class98.field1818 = class74.field1273.method767(true);
                        class3.method8(64);
                    }
                    class98.field1818 = -1;
                    return true;
                }
                if (class98.field1818 == 134) {
                    int var86 = class74.field1273.method762((byte) 102);
                    class27.field402 = var86;
                    class182.method1181(-14, var86);
                    class14.method90(-121, class27.field402);
                    for (int var87 = 0; var87 < 100; ++var87) {
                        class98.field1810[var87] = true;
                    }
                    class98.field1818 = -1;
                    return true;
                }
                if (~class98.field1818 == -8) {
                    class128.field2431 = class74.field1273.method774(255);
                    class84.field1459 = class74.field1273.method767(true);
                    for (int var88 = class128.field2431; ~var88 > ~(class128.field2431 + 8); ++var88) {
                        for (int var89 = class84.field1459; class84.field1459 - -8 > var89; ++var89) {
                            if (class33.field508[class42.field687][var88][var89] != null) {
                                class33.field508[class42.field687][var88][var89] = null;
                                class130.method906(var89, var88, -24639);
                            }
                        }
                    }
                    for (class171 var90 = (class171) class123.field2360.method1223(true); var90 != null; var90 = (class171) class123.field2360.method1226((byte) -57)) {
                        if (var90.field3302 >= class128.field2431 && ~(class128.field2431 + 8) < ~var90.field3302 && ~var90.field3314 <= ~class84.field1459 && class84.field1459 + 8 > var90.field3314 && ~class42.field687 == ~var90.field3307) {
                            var90.field3310 = 0;
                        }
                    }
                    class98.field1818 = -1;
                    return true;
                }
                if (~class98.field1818 == -27) {
                    class169.field3270 = 0;
                    class98.field1818 = -1;
                    return true;
                }
                if (class98.field1818 == 182) {
                    class10 var91 = class74.field1273.method764((byte) 29);
                    if (var91.method57((byte) 126, class200.field3812)) {
                        class10 var92 = var91.method44(var91.method53((byte) -121, class120.field2311), 0, (byte) 60);
                        long var93 = var92.method62((byte) -90);
                        boolean var95 = false;
                        for (int var96 = 0; ~var96 > ~class78.field1375; ++var96) {
                            if (~class153.field2935[var96] == ~var93) {
                                var95 = true;
                                break;
                            }
                        }
                        if (!var95 && ~class125.field2391 == -1) {
                            class6.method20(4, class74.field1272, (byte) 117, var92);
                        }
                    } else if (var91.method57((byte) 98, class122.field2338)) {
                        class10 var97 = var91.method44(var91.method53((byte) 117, class120.field2311), 0, (byte) 62);
                        long var98 = var97.method62((byte) -116);
                        boolean var100 = false;
                        for (int var101 = 0; class78.field1375 > var101; ++var101) {
                            if (~class153.field2935[var101] == ~var98) {
                                var100 = true;
                                break;
                            }
                        }
                        if (!var100 && ~class125.field2391 == -1) {
                            class10 var102 = var91.method44(var91.method40((byte) -54) + -9, var91.method53((byte) -126, class120.field2311) + 1, (byte) 88);
                            class6.method20(8, var102, (byte) 117, var97);
                        }
                    } else if (var91.method57((byte) 97, class87.field1545)) {
                        class10 var103 = var91.method44(var91.method53((byte) -124, class120.field2311), 0, (byte) -100);
                        boolean var104 = false;
                        long var105 = var103.method62((byte) -124);
                        for (int var107 = 0; var107 < class78.field1375; ++var107) {
                            if (~class153.field2935[var107] == ~var105) {
                                var104 = true;
                                break;
                            }
                        }
                        if (!var104 && ~class125.field2391 == -1) {
                            class6.method20(10, class10.field119, (byte) 117, var103);
                        }
                    } else if (var91.method57((byte) 121, class184.field3514)) {
                        class10 var108 = var91.method44(var91.method53((byte) -122, class184.field3514), 0, (byte) 60);
                        class6.method20(11, var108, (byte) 117, class10.field119);
                    } else if (var91.method57((byte) 108, class140.field2646)) {
                        class10 var109 = var91.method44(var91.method53((byte) -122, class140.field2646), 0, (byte) -51);
                        if (class125.field2391 == 0) {
                            class6.method20(12, var109, (byte) 117, class10.field119);
                        }
                    } else if (var91.method57((byte) 125, class64.field1072)) {
                        class10 var125 = var91.method44(var91.method53((byte) -128, class64.field1072), 0, (byte) -27);
                        if (~class125.field2391 == -1) {
                            class6.method20(13, var125, (byte) 117, class10.field119);
                        }
                    } else if (var91.method57((byte) 118, class95.field1755)) {
                        class10 var110 = var91.method44(var91.method53((byte) 98, class120.field2311), 0, (byte) 78);
                        long var111 = var110.method62((byte) -94);
                        boolean var113 = false;
                        for (int var114 = 0; var114 < class78.field1375; ++var114) {
                            if (class153.field2935[var114] == var111) {
                                var113 = true;
                                break;
                            }
                        }
                        if (!var113 && class125.field2391 == 0) {
                            class6.method20(14, class10.field119, (byte) 117, var110);
                        }
                    } else if (!var91.method57((byte) 121, class126.field2402)) {
                        if (!var91.method57((byte) 121, class97.field1797)) {
                            class6.method20(0, var91, (byte) 117, class10.field119);
                        } else {
                            class10 var115 = var91.method44(var91.method53((byte) -126, class120.field2311), 0, (byte) 114);
                            long var116 = var115.method62((byte) -65);
                            boolean var118 = false;
                            for (int var119 = 0; ~class78.field1375 < ~var119; ++var119) {
                                if (~class153.field2935[var119] == ~var116) {
                                    var118 = true;
                                    break;
                                }
                            }
                            if (!var118 && ~class125.field2391 == -1) {
                                class6.method20(16, class10.field119, (byte) 117, var115);
                            }
                        }
                    } else {
                        class10 var120 = var91.method44(var91.method53((byte) -127, class120.field2311), 0, (byte) -66);
                        long var121 = var120.method62((byte) -106);
                        boolean var123 = false;
                        for (int var124 = 0; class78.field1375 > var124; ++var124) {
                            if (~class153.field2935[var124] == ~var121) {
                                var123 = true;
                                break;
                            }
                        }
                        if (!var123 && class125.field2391 == 0) {
                            class6.method20(15, class10.field119, (byte) 117, var120);
                        }
                    }
                    class98.field1818 = -1;
                    return true;
                }
                if (class98.field1818 == 21 || class98.field1818 == 189 || class98.field1818 == 2 || class98.field1818 == 200 || ~class98.field1818 == -115 || ~class98.field1818 == -12 || class98.field1818 == 194 || ~class98.field1818 == -68 || class98.field1818 == 72 || ~class98.field1818 == -198 || ~class98.field1818 == -203) {
                    class3.method8(118);
                    class98.field1818 = -1;
                    return true;
                }
                if (~class98.field1818 == -46) {
                    int var126 = class74.field1273.method762((byte) 98);
                    int var127 = class74.field1273.method790(8);
                    int var128 = class74.field1273.method780(10664);
                    int var129 = class74.field1273.method762((byte) 113);
                    class200 var130 = class66.method432(var127, !arg0);
                    if (~var130.field3827 != ~var129 || ~var130.field3909 != ~var128 || ~var130.field3807 != ~var126) {
                        var130.field3827 = var129;
                        var130.field3807 = var126;
                        var130.field3909 = var128;
                        class168.method1116(var130, -122);
                    }
                    class98.field1818 = -1;
                    return true;
                }
                if (class98.field1818 == 176) {
                    int var131 = class74.field1273.method761(255);
                    class10 var132 = class74.field1273.method764((byte) 48);
                    class200 var133 = class66.method432(var131, false);
                    if (!var132.method64(101, var133.field3922)) {
                        var133.field3922 = var132;
                        class168.method1116(var133, -102);
                    }
                    class98.field1818 = -1;
                    return true;
                }
                if (~class98.field1818 == -208) {
                    for (int var134 = 0; ~var134 > ~class5.field63; ++var134) {
                        class20 var135 = class45.method280(16, var134);
                        if (var135 != null && ~var135.field299 == -1) {
                            class33.field506[var134] = 0;
                            class13.field215[var134] = 0;
                        }
                    }
                    class196.method1248((byte) 89);
                    class4.field33 += 32;
                    class98.field1818 = -1;
                    return true;
                }
                if (!arg0) {
                    return false;
                }
                if (class98.field1818 == 248) {
                    class45.method279(-4594, class74.field1273);
                    class98.field1818 = -1;
                    return true;
                }
                if (class98.field1818 == 229) {
                    int var136 = class74.field1273.method762((byte) 80);
                    int var137 = class74.field1273.method761(255);
                    int var138 = class74.field1273.method780(10664);
                    class200 var139 = class66.method432(var137, false);
                    class98.field1818 = -1;
                    var139.field3804 = (var138 << 16) + var136;
                    return true;
                }
                if (class98.field1818 == 25) {
                    class196.method1248((byte) 89);
                    class154.field2982 = class74.field1273.method765(95);
                    class98.field1818 = -1;
                    class129.field2444 = class7.field78;
                    return true;
                }
                if (class98.field1818 == 10) {
                    class128.field2435 = false;
                    for (int var140 = 0; ~var140 > -6; ++var140) {
                        class130.field2474[var140] = false;
                    }
                    class98.field1818 = -1;
                    return true;
                }
                if (~class98.field1818 == -181) {
                    long var141 = class74.field1273.method811(113);
                    long var143 = (long) class74.field1273.method762((byte) 108);
                    long var145 = (long) class74.field1273.method771(125);
                    long var147 = (var143 << 32) + var145;
                    boolean var149 = false;
                    int var150 = class74.field1273.method767(true);
                    for (int var151 = 0; var151 < 100; ++var151) {
                        if (class141.field2661[var151] == var147) {
                            var149 = true;
                            break;
                        }
                    }
                    if (var150 <= 1) {
                        for (int var152 = 0; ~class78.field1375 < ~var152; ++var152) {
                            if (~class153.field2935[var152] == ~var141) {
                                var149 = true;
                                break;
                            }
                        }
                    }
                    if (!var149 && ~class125.field2391 == -1) {
                        class141.field2661[class184.field3511] = var147;
                        class184.field3511 = (class184.field3511 + 1) % 100;
                        class10 var153 = class198.method1264(class147.method1017(class74.field1273, -90).method43(false));
                        if (~var150 != -3 && var150 != 3) {
                            if (~var150 != -2) {
                                class6.method20(3, var153, (byte) 117, class56.method381(var141, (byte) 109).method39(-126));
                            } else {
                                class6.method20(7, var153, (byte) 117, class67.method440(0, new class10[] { class87.field1538, class56.method381(var141, (byte) 123).method39(-121) }));
                            }
                        } else {
                            class6.method20(7, var153, (byte) 117, class67.method440(0, new class10[] { class169.field3259, class56.method381(var141, (byte) 57).method39(-100) }));
                        }
                    }
                    class98.field1818 = -1;
                    return true;
                }
                if (class98.field1818 == 107) {
                    int var154 = class74.field1273.method797(20);
                    int var155 = class74.field1273.method775(-72);
                    int var156 = var155 >> 10 & 31;
                    int var157 = 31 & var155;
                    int var158 = 31 & var155 >> 5;
                    int var159 = (var156 << 19) + (var157 << 3) + (var158 << 11);
                    class200 var160 = class66.method432(var154, false);
                    if (var160.field3800 != var159) {
                        var160.field3800 = var159;
                        class168.method1116(var160, -101);
                    }
                    class98.field1818 = -1;
                    return true;
                }
                if (~class98.field1818 == -163) {
                    int var161 = class74.field1273.method790(8);
                    class200 var162 = class66.method432(var161, false);
                    for (int var163 = 0; var162.field3883.length > var163; ++var163) {
                        var162.field3883[var163] = -1;
                        var162.field3883[var163] = 0;
                    }
                    class168.method1116(var162, -102);
                    class98.field1818 = -1;
                    return true;
                }
                if (class98.field1818 == 252) {
                    int var164 = class74.field1273.method790(8);
                    class194.field3693 = class120.field2313.method503(124, var164);
                    class98.field1818 = -1;
                    return true;
                }
                if (class98.field1818 == 235) {
                    int var165 = class74.field1273.method806(0);
                    int var166 = class74.field1273.method806(0);
                    int var167 = class74.field1273.method767(arg0);
                    class42.field687 = var166 >> 1;
                    class145.field2767.method429(var165, ~(1 & var166) == -2, var167, (byte) -122);
                    class98.field1818 = -1;
                    return true;
                }
                if (~class98.field1818 == -228) {
                    int var168 = class74.field1273.method801(-129);
                    int var169 = class74.field1273.method797(125);
                    int var170 = class74.field1273.method780(10664);
                    class118 var171 = (class118) class165.field3162.method213(118, (long) var169);
                    if (var171 != null) {
                        class27.method176(true, var171, ~var171.field2272 != ~var170);
                    }
                    class34.method224(var168, var169, var170, -1);
                    class98.field1818 = -1;
                    return true;
                }
                if (class98.field1818 == 108) {
                    int var172 = class74.field1273.method760(-258911864);
                    int var173 = class74.field1273.method784(25452);
                    class200 var174 = class66.method432(var172, false);
                    if (~var174.field3920 != ~var173 || ~var173 == 0) {
                        var174.field3893 = 0;
                        var174.field3860 = 0;
                        var174.field3920 = var173;
                        class168.method1116(var174, -95);
                    }
                    class98.field1818 = -1;
                    return true;
                }
                if (class98.field1818 == 13) {
                    long var175 = class74.field1273.method811(114);
                    int var177 = class74.field1273.method762((byte) 80);
                    byte var178 = class74.field1273.method759((byte) 127);
                    boolean var179 = false;
                    if (~(Long.MIN_VALUE & var175) != -1L) {
                        var179 = true;
                    }
                    if (!var179) {
                        class9 var180 = new class9();
                        var180.field2291 = var175;
                        var180.field114 = class56.method381(var180.field2291, (byte) 127);
                        var180.field106 = var178;
                        var180.field110 = var177;
                        int var181;
                        for (var181 = class193.field3674 - 1; var181 >= 0; --var181) {
                            int var182 = class75.field1288[var181].field114.method47(var180.field114, !arg0);
                            if (var182 == 0) {
                                class75.field1288[var181].field110 = var177;
                                class75.field1288[var181].field106 = var178;
                                if (~class75.field1304 == ~var175) {
                                    class44.field724 = var178;
                                }
                                class7.field79 = class7.field78;
                                class98.field1818 = -1;
                                return true;
                            }
                            if (~var182 > -1) {
                                break;
                            }
                        }
                        if (~class193.field3674 <= ~class75.field1288.length) {
                            class98.field1818 = -1;
                            return true;
                        }
                        for (int var183 = class193.field3674 - 1; var183 > var181; --var183) {
                            class75.field1288[var183 - -1] = class75.field1288[var183];
                        }
                        if (class193.field3674 == 0) {
                            class75.field1288 = new class9[100];
                        }
                        class75.field1288[var181 + 1] = var180;
                        if (~class75.field1304 == ~var175) {
                            class44.field724 = var178;
                        }
                        ++class193.field3674;
                    } else {
                        if (class193.field3674 == 0) {
                            class98.field1818 = -1;
                            return true;
                        }
                        long var184 = var175 & Long.MAX_VALUE;
                        boolean var186 = false;
                        int var187;
                        for (var187 = 0; ~class193.field3674 < ~var187 && (class75.field1288[var187].field2291 != var184 || ~class75.field1288[var187].field110 != ~var177); ++var187) {
                        }
                        if (~class193.field3674 < ~var187) {
                            while (~var187 > ~(class193.field3674 + -1)) {
                                class75.field1288[var187] = class75.field1288[var187 + 1];
                                ++var187;
                            }
                            --class193.field3674;
                            class75.field1288[class193.field3674] = null;
                        }
                    }
                    class98.field1818 = -1;
                    class7.field79 = class7.field78;
                    return true;
                }
                if (~class98.field1818 == -94) {
                    int var188 = class74.field1273.method795(-1);
                    int var189 = class74.field1273.method761(255);
                    if (~var188 == -65536) {
                        var188 = -1;
                    }
                    int var190 = class74.field1273.method797(111);
                    class200 var191 = class66.method432(var190, false);
                    if (!var191.field3927) {
                        if (~var188 == 0) {
                            class98.field1818 = -1;
                            var191.field3841 = 0;
                            return true;
                        }
                        class94 var192 = class104.method678(500, var188);
                        var191.field3841 = 4;
                        var191.field3827 = var192.field1735;
                        var191.field3807 = var192.field1703 * 100 / var189;
                        var191.field3788 = var188;
                        var191.field3909 = var192.field1722;
                        class168.method1116(var191, -85);
                    } else {
                        var191.field3766 = var188;
                        var191.field3919 = var189;
                        class94 var193 = class104.method678(500, var188);
                        var191.field3862 = var193.field1700;
                        var191.field3807 = var193.field1703;
                        if (~var191.field3845 < -1) {
                            var191.field3807 = var191.field3807 * 32 / var191.field3845;
                        }
                        var191.field3827 = var193.field1735;
                        var191.field3909 = var193.field1722;
                        var191.field3825 = var193.field1731;
                        var191.field3902 = var193.field1697;
                        class168.method1116(var191, -109);
                    }
                    class98.field1818 = -1;
                    return true;
                }
                if (class98.field1818 == 98) {
                    boolean var194 = ~class74.field1273.method801(-129) == -2;
                    int var195 = class74.field1273.method760(-258911864);
                    class200 var196 = class66.method432(var195, false);
                    if (var196.field3768 != var194) {
                        var196.field3768 = var194;
                        class168.method1116(var196, -90);
                    }
                    class98.field1818 = -1;
                    return true;
                }
                if (class98.field1818 == 32) {
                    class128.field2435 = true;
                    class201.field3932 = class74.field1273.method767(true);
                    class11.field184 = class74.field1273.method767(arg0);
                    class148.field2844 = class74.field1273.method762((byte) 91);
                    class6.field69 = class74.field1273.method767(true);
                    class205.field3984 = class74.field1273.method767(arg0);
                    if (~class205.field3984 <= -101) {
                        class34.field520 = class11.field184 * 128 + 64;
                        class119.field2294 = class201.field3932 * 128 - -64;
                        class14.field226 = class145.method1003((byte) -88, class119.field2294, class34.field520, class42.field687) + -class148.field2844;
                    }
                    class98.field1818 = -1;
                    return true;
                }
                if (~class98.field1818 == -51) {
                    long var197 = class74.field1273.method811(109);
                    class10 var199 = class198.method1264(class147.method1017(class74.field1273, -79).method43(false));
                    class6.method20(6, var199, (byte) 117, class56.method381(var197, (byte) 63).method39(-110));
                    class98.field1818 = -1;
                    return true;
                }
                if (~class98.field1818 == -35) {
                    class37.field584 = class74.field1273.method780(10664) * 30;
                    class98.field1818 = -1;
                    class129.field2444 = class7.field78;
                    return true;
                }
                if (class98.field1818 == 123) {
                    class129.field2452 = class74.field1273.method767(true);
                    class98.field1812 = class7.field78;
                    class98.field1818 = -1;
                    return true;
                }
                if (~class98.field1818 == -95) {
                    class10 var200 = class74.field1273.method764((byte) 18);
                    int var201 = class74.field1273.method806(0);
                    int var202 = class74.field1273.method806(0);
                    if (~var201 <= -2 && var201 <= 8) {
                        if (var200.method70((byte) 120, class39.field664)) {
                            var200 = null;
                        }
                        class55.field985[var201 - 1] = var200;
                        class140.field2642[var201 + -1] = var202 == 0;
                    }
                    class98.field1818 = -1;
                    return true;
                }
                if (class98.field1818 == 181) {
                    class196.method1248((byte) 89);
                    class149.field2875 = class74.field1273.method767(true);
                    class129.field2444 = class7.field78;
                    class98.field1818 = -1;
                    return true;
                }
                if (~class98.field1818 == -155) {
                    int var203 = class74.field1273.method790(8);
                    class200 var204 = class66.method432(var203, false);
                    var204.field3841 = 3;
                    var204.field3788 = class145.field2767.field609.method832((byte) -115);
                    class168.method1116(var204, -92);
                    class98.field1818 = -1;
                    return true;
                }
                if (~class98.field1818 == -111) {
                    int var205 = class74.field1273.method784(25452);
                    int var206 = class74.field1273.method784(25452);
                    int var207 = class74.field1273.method790(8);
                    class200 var208 = class66.method432(var207, false);
                    int var209 = var208.field3785 + var205;
                    int var210 = var208.field3837 - -var206;
                    if (~var208.field3822 != ~var210 || ~var208.field3842 != ~var209) {
                        var208.field3842 = var209;
                        var208.field3822 = var210;
                        class168.method1116(var208, -75);
                    }
                    class98.field1818 = -1;
                    return true;
                }
                if (~class98.field1818 == -207) {
                    for (int var211 = 0; class13.field215.length > var211; ++var211) {
                        if (~class33.field506[var211] != ~class13.field215[var211]) {
                            class13.field215[var211] = class33.field506[var211];
                            class157.method1056((byte) -122, var211);
                            class128.field2429[class123.method861(class4.field33++, 31)] = var211;
                        }
                    }
                    class98.field1818 = -1;
                    return true;
                }
                if (class98.field1818 == 156) {
                    class196.method1248((byte) 89);
                    int var212 = class74.field1273.method801(-129);
                    int var213 = class74.field1273.method767(true);
                    int var214 = class74.field1273.method790(8);
                    class65.field1135[var212] = var214;
                    class172.field3319[var212] = var213;
                    class107.field1991[var212] = 1;
                    for (int var215 = 0; var215 < 98; ++var215) {
                        if (~var214 <= ~class117.field2249[var215]) {
                            class107.field1991[var212] = var215 + 2;
                        }
                    }
                    class116.field2216[class123.method861(31, class3.field29++)] = var212;
                    class98.field1818 = -1;
                    return true;
                }
                if (~class98.field1818 == -176) {
                    int var216 = class74.field1273.field2170 - -class154.field2972;
                    int var217 = class74.field1273.method762((byte) 125);
                    int var218 = class74.field1273.method762((byte) 72);
                    if (class27.field402 != var217) {
                        class27.field402 = var217;
                        class182.method1181(-55, class27.field402);
                        class14.method90(46, class27.field402);
                        for (int var219 = 0; ~var219 > -101; ++var219) {
                            class98.field1810[var219] = true;
                        }
                    }
                    while (~(var218--) < -1) {
                        int var220 = class74.field1273.method761(255);
                        int var221 = class74.field1273.method762((byte) 99);
                        int var222 = class74.field1273.method767(arg0);
                        class118 var223 = (class118) class165.field3162.method213(118, (long) var220);
                        if (var223 != null && ~var223.field2272 != ~var221) {
                            class27.method176(arg0, var223, true);
                            var223 = null;
                        }
                        if (var223 == null) {
                            var223 = class34.method224(var222, var220, var221, -1);
                        }
                        var223.field2283 = true;
                    }
                    for (class118 var224 = (class118) class165.field3162.method212((byte) 79); var224 != null; var224 = (class118) class165.field3162.method215((byte) 34)) {
                        if (var224.field2283) {
                            var224.field2283 = false;
                        } else {
                            class27.method176(arg0, var224, true);
                        }
                    }
                    class207.field4032 = new class32(512);
                    while (~class74.field1273.field2170 > ~var216) {
                        int var225 = class74.field1273.method761(255);
                        int var226 = class74.field1273.method762((byte) 108);
                        int var227 = class74.field1273.method762((byte) 123);
                        int var228 = class74.field1273.method761(255);
                        for (int var229 = var226; var229 <= var227; ++var229) {
                            long var230 = ((long) var225 << 32) - -((long) var229);
                            class207.field4032.method214(new class29(var228), (byte) 123, var230);
                        }
                    }
                    class98.field1818 = -1;
                    return true;
                }
                if (class98.field1818 == 215) {
                    int var232 = class74.field1273.method761(255);
                    int var233 = class74.field1273.method762((byte) 71);
                    if (var232 < -70000) {
                        var233 += 32768;
                    }
                    class200 var234;
                    if (var232 >= 0) {
                        var234 = class66.method432(var232, !arg0);
                    } else {
                        var234 = null;
                    }
                    while (~class154.field2972 < ~class74.field1273.field2170) {
                        int var235 = 0;
                        int var236 = class74.field1273.method804((byte) -75);
                        int var237 = class74.field1273.method762((byte) 125);
                        if (~var237 != -1) {
                            var235 = class74.field1273.method767(true);
                            if (var235 == 255) {
                                var235 = class74.field1273.method761(255);
                            }
                        }
                        if (var234 != null && ~var236 <= -1 && var236 < var234.field3883.length) {
                            var234.field3883[var236] = var237;
                            var234.field3905[var236] = var235;
                        }
                        class182.method1178(var235, 0, var237 + -1, var236, var233);
                    }
                    if (var234 != null) {
                        class168.method1116(var234, -73);
                    }
                    class196.method1248((byte) 89);
                    class19.field276[class123.method861(31, class21.field343++)] = class123.method861(32767, var233);
                    class98.field1818 = -1;
                    return true;
                }
                if (~class98.field1818 == -70) {
                    class49.method354(2);
                    class98.field1818 = -1;
                    return true;
                }
                if (~class98.field1818 == -54) {
                    int var238 = class74.field1273.method775(-111);
                    if (var238 == 65535) {
                        var238 = -1;
                    }
                    class106.method684(var238, 26415);
                    class98.field1818 = -1;
                    return true;
                }
                if (class98.field1818 == 83) {
                    int var239 = class74.field1273.method770((byte) -110);
                    int var240 = class74.field1273.method775(-116);
                    if (var240 == 65535) {
                        var240 = -1;
                    }
                    class98.method645(var240, var239, 0);
                    class98.field1818 = -1;
                    return true;
                }
                if (class98.field1818 == 205) {
                    int var241 = class74.field1273.method761(255);
                    int var242 = class74.field1273.method762((byte) 119);
                    if (var241 < -70000) {
                        var242 += 32768;
                    }
                    class200 var243;
                    if (var241 >= 0) {
                        var243 = class66.method432(var241, false);
                    } else {
                        var243 = null;
                    }
                    if (var243 != null) {
                        for (int var244 = 0; var244 < var243.field3883.length; ++var244) {
                            var243.field3883[var244] = 0;
                            var243.field3905[var244] = 0;
                        }
                    }
                    class192.method1220(-1, var242);
                    int var245 = class74.field1273.method762((byte) 121);
                    for (int var246 = 0; ~var245 < ~var246; ++var246) {
                        int var247 = class74.field1273.method780(10664);
                        int var248 = class74.field1273.method806(0);
                        if (~var248 == -256) {
                            var248 = class74.field1273.method760(-258911864);
                        }
                        if (var243 != null && ~var246 > ~var243.field3883.length) {
                            var243.field3883[var246] = var247;
                            var243.field3905[var246] = var248;
                        }
                        class182.method1178(var248, 0, var247 + -1, var246, var242);
                    }
                    if (var243 != null) {
                        class168.method1116(var243, -77);
                    }
                    class196.method1248((byte) 89);
                    class19.field276[class123.method861(class21.field343++, 31)] = class123.method861(32767, var242);
                    class98.field1818 = -1;
                    return true;
                }
                if (~class98.field1818 == -112) {
                    int var249 = class74.field1273.method767(true);
                    if (class74.field1273.method767(true) != 0) {
                        --class74.field1273.field2170;
                        class47.field818[var249] = new class115(class74.field1273);
                    } else {
                        class47.field818[var249] = new class115();
                    }
                    class130.field2471 = class7.field78;
                    class98.field1818 = -1;
                    return true;
                }
                if (~class98.field1818 == -37) {
                    class74.field1274 = class74.field1273.method767(true);
                    if (class74.field1274 == 1) {
                        class175.field3361 = class74.field1273.method762((byte) 81);
                    }
                    if (class74.field1274 >= 2 && ~class74.field1274 >= -7) {
                        if (class74.field1274 == 2) {
                            class200.field3866 = 64;
                            class189.field3612 = 64;
                        }
                        if (~class74.field1274 == -4) {
                            class200.field3866 = 64;
                            class189.field3612 = 0;
                        }
                        if (~class74.field1274 == -5) {
                            class189.field3612 = 128;
                            class200.field3866 = 64;
                        }
                        if (class74.field1274 == 5) {
                            class189.field3612 = 64;
                            class200.field3866 = 0;
                        }
                        if (class74.field1274 == 6) {
                            class189.field3612 = 64;
                            class200.field3866 = 128;
                        }
                        class74.field1274 = 2;
                        class71.field1228 = class74.field1273.method762((byte) 106);
                        class203.field3952 = class74.field1273.method762((byte) 125);
                        class101.field1901 = class74.field1273.method767(true);
                    }
                    if (class74.field1274 == 10) {
                        class5.field66 = class74.field1273.method762((byte) 117);
                    }
                    class98.field1818 = -1;
                    return true;
                }
                if (class98.field1818 == 46) {
                    for (int var250 = 0; class2.field10.length > var250; ++var250) {
                        if (class2.field10[var250] != null) {
                            class2.field10[var250].field1081 = -1;
                        }
                    }
                    for (int var251 = 0; class168.field3249.length > var251; ++var251) {
                        if (class168.field3249[var251] != null) {
                            class168.field3249[var251].field1081 = -1;
                        }
                    }
                    class98.field1818 = -1;
                    return true;
                }
                if (~class98.field1818 == -170) {
                    class78.field1375 = class154.field2972 / 8;
                    for (int var252 = 0; ~class78.field1375 < ~var252; ++var252) {
                        class153.field2935[var252] = class74.field1273.method811(119);
                        class11.field178[var252] = class56.method381(class153.field2935[var252], (byte) 95);
                    }
                    class98.field1812 = class7.field78;
                    class98.field1818 = -1;
                    return true;
                }
                if (class98.field1818 == 244) {
                    int var253 = class74.field1273.method780(10664);
                    class87.method533(108, var253);
                    class19.field276[class123.method861(31, class21.field343++)] = class123.method861(32767, var253);
                    class98.field1818 = -1;
                    return true;
                }
                class109.method700((Throwable) null, "T1 - " + class98.field1818 + "," + class162.field3111 + "," + class157.field3032 + " - " + class154.field2972, (byte) -113);
                class176.method1149((byte) -89);
            } catch (IOException var257) {
                class175.method1145(-1);
            } catch (Exception var258) {
                String var255 = "T2 - " + class98.field1818 + "," + class162.field3111 + "," + class157.field3032 + " - " + class154.field2972 + "," + (class145.field2767.field1099[0] + class2.field16) + "," + (class200.field3767 - -class145.field2767.field1106[0]) + " - ";
                for (int var256 = 0; class154.field2972 > var256 && var256 < 50; ++var256) {
                    var255 = var255 + class74.field1273.field2160[var256] + ",";
                }
                class109.method700(var258, var255, (byte) -107);
                class176.method1149((byte) -126);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(B)V")
    public static void method547(byte arg0) {
        field1569 = null;
        field1576 = null;
        field1575 = null;
        field1574 = null;
        if (arg0 != 126) {
            field1574 = null;
        }
        field1572 = null;
        field1564 = null;
        field1577 = null;
        field1567 = null;
        field1565 = null;
        field1561 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILjava/util/Random;B)I")
    public static final int method548(int arg0, Random arg1, byte arg2) {
        if (arg2 != -73) {
            return 65;
        } else {
            ++field1562;
            if (~arg0 >= -1) {
                throw new IllegalArgumentException();
            } else if (class137.method931(arg0, (byte) 110)) {
                return (int) ((4294967295L & (long) arg1.nextInt()) * (long) arg0 >> 32);
            } else {
                int var3 = -((int) (4294967296L % (long) arg0)) + Integer.MIN_VALUE;
                int var4;
                do {
                    var4 = arg1.nextInt();
                } while (~var4 <= ~var3);
                return class174.method1140(var4, arg0, arg2 ^ -201);
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZI)[I")
    public final int[] method6(boolean arg0, int arg1) {
        if (arg0) {
            field1567 = null;
        }
        int[] var3 = super.field2683.method1186((byte) -114, arg1);
        if (super.field2683.field3516) {
            for (int var4 = 0; class133.field2499 > var4; ++var4) {
                var3[var4] = class79.field1395[var4];
            }
        }
        ++field1560;
        return var3;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ljava/lang/Object;ZLih;)V")
    public static final void method549(Object arg0, boolean arg1, class81 arg2) {
        ++field1558;
        if (arg2.field1419 != null) {
            if (arg1) {
                method547((byte) -84);
            }
            for (int var3 = 0; ~var3 > -51 && arg2.field1419.peekEvent() != null; ++var3) {
                class172.method1130(1L, (byte) -79);
            }
            if (arg0 != null) {
                arg2.field1419.postEvent(new ActionEvent(arg0, 1001, "dummy"));
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V")
    public class89() {
        super(0, true);
    }
}
