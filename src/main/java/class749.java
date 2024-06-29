import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class749 extends class38 {

    @OriginalMember(owner = "client!nh", name = "D", descriptor = "I")
    private int field10467 = 0;

    @OriginalMember(owner = "client!nh", name = "M", descriptor = "I")
    private int field10476 = 0;

    @OriginalMember(owner = "client!nh", name = "O", descriptor = "I")
    private int field10478 = 0;

    @OriginalMember(owner = "client!nh", name = "H", descriptor = "I")
    public static int field10471 = -1;

    @OriginalMember(owner = "client!nh", name = "N", descriptor = "Z")
    public static boolean field10477 = false;

    @OriginalMember(owner = "client!nh", name = "E", descriptor = "I")
    private int field10468;

    @OriginalMember(owner = "client!nh", name = "F", descriptor = "I")
    private int field10469;

    @OriginalMember(owner = "client!nh", name = "G", descriptor = "I")
    public static int field10470;

    @OriginalMember(owner = "client!nh", name = "I", descriptor = "I")
    public static int field10472;

    @OriginalMember(owner = "client!nh", name = "J", descriptor = "I")
    public static int field10473;

    @OriginalMember(owner = "client!nh", name = "K", descriptor = "I")
    public static int field10474;

    @OriginalMember(owner = "client!nh", name = "L", descriptor = "I")
    private int field10475;

    @OriginalMember(owner = "client!nh", name = "P", descriptor = "I")
    private int field10479;

    @OriginalMember(owner = "client!nh", name = "Q", descriptor = "I")
    public static int field10480;

    @OriginalMember(owner = "client!nh", name = "R", descriptor = "I")
    private int field10481;

    @OriginalMember(owner = "client!nh", name = "S", descriptor = "I")
    private int field10482;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIZ)V", line = 6)
    private final void method4180(int arg0, int arg1, int arg2, boolean arg3) {
        ++field10473;
        if (!arg3) {
            int var5 = arg1 > 2048 ? arg1 - -arg0 - (arg0 * arg1 >> 12) : (4096 - -arg0) * arg1 >> 12;
            if (var5 <= 0) {
                this.field10479 = this.field10469 = this.field10482 = arg1;
            } else {
                int var6 = arg2 * 6;
                int var7 = arg1 + arg1 + -var5;
                int var8 = (-var7 + var5 << 12) / var5;
                int var9 = var6 >> 12;
                int var10 = -(var9 << 12) + var6;
                int var12 = var8 * var5 >> 12;
                int var13 = var10 * var12 >> 12;
                int var14 = var7 + var13;
                int var15 = -var13 + var5;
                if (var9 != 0) {
                    if (~var9 != -2) {
                        if (var9 != 2) {
                            if (var9 != 3) {
                                if (var9 != 4) {
                                    if (var9 == 5) {
                                        this.field10469 = var7;
                                        this.field10482 = var15;
                                        this.field10479 = var5;
                                    }
                                } else {
                                    this.field10469 = var7;
                                    this.field10479 = var14;
                                    this.field10482 = var5;
                                }
                            } else {
                                this.field10482 = var5;
                                this.field10469 = var15;
                                this.field10479 = var7;
                            }
                        } else {
                            this.field10482 = var14;
                            this.field10469 = var5;
                            this.field10479 = var7;
                        }
                    } else {
                        this.field10479 = var15;
                        this.field10469 = var5;
                        this.field10482 = var7;
                    }
                } else {
                    this.field10479 = var5;
                    this.field10469 = var14;
                    this.field10482 = var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V", line = 112)
    public static final void method4181(int arg0) {
        ++field10470;
        if (class677.field9415 > 1) {
            class76.field1064 = class589.field8351;
            --class677.field9415;
        }
        if (class439.field6504) {
            class439.field6504 = false;
            class213.method1446(true);
        } else {
            if (!class483.field6967) {
                class579.method3363((byte) 73);
            }
            for (int var1 = 0; ~var1 > -101 && class763.method4235((byte) 123); ++var1) {
            }
            if (~class87.field1246 == -11) {
                while (class720.method4082(-16611)) {
                    class468 var2 = class93.method734(class29.field284, class521.field7456, 8174);
                    var2.field6839.method3730(102, 0);
                    int var3 = var2.field6839.field9084;
                    class206.method1400(var2.field6839, 0);
                    var2.field6839.method3746(-var3 + var2.field6839.field9084, 121);
                    class120.method872((byte) -114, var2);
                }
                if (class524.field7489 != null) {
                    if (class524.field7489.field3689 != -1) {
                        class468 var4 = class93.method734(class29.field284, class348.field5051, 8174);
                        var4.field6839.method3702(class524.field7489.field3689, (byte) -116);
                        class120.method872((byte) 44, var4);
                        class524.field7489 = null;
                        class430.field6434 = class524.method3075(18) - -30000L;
                    }
                } else if (~class524.method3075(18) <= ~class430.field6434) {
                    class524.field7489 = class720.field10102.method1276(class528.field7513.field8138, 256);
                }
                class467 var5 = (class467) class264.field3741.method1195(0);
                if (var5 != null || ~(class524.method3075(18) + -2000L) < ~class712.field10042) {
                    class468 var6 = null;
                    int var7 = 0;
                    for (class467 var8 = (class467) class665.field9341.method1195(0); var8 != null && (var6 == null || -var7 + var6.field6839.field9084 < 240); var8 = (class467) class665.field9341.method1201(2)) {
                        var8.method1304((byte) 7);
                        int var9 = var8.method1793((byte) 106);
                        if (var9 >= -1) {
                            if (~var9 < -65535) {
                                var9 = 65534;
                            }
                        } else {
                            var9 = -1;
                        }
                        int var10 = var8.method1794((byte) 122);
                        if (var10 >= -1) {
                            if (var10 > 65534) {
                                var10 = 65534;
                            }
                        } else {
                            var10 = -1;
                        }
                        if (~class583.field8296 != ~var10 || ~class608.field8609 != ~var9) {
                            if (var6 == null) {
                                var6 = class93.method734(class29.field284, class85.field1217, 8174);
                                ++class586.field8312;
                                var6.field6839.method3730(110, 0);
                                var7 = var6.field6839.field9084;
                            }
                            int var11 = -class583.field8296 + var10;
                            class583.field8296 = var10;
                            int var12 = -class608.field8609 + var9;
                            class608.field8609 = var9;
                            int var13 = (int) ((var8.method1791((byte) -102) - class712.field10042) / 20L);
                            if (~var13 > -9 && var11 >= -32 && ~var11 >= -32 && var12 >= -32 && var12 <= 31) {
                                var11 += 32;
                                var12 += 32;
                                var6.field6839.method3702((var11 << 6) + (var13 << 12) - -var12, (byte) -108);
                            } else if (var13 < 32 && ~var11 <= 127 && var11 <= 127 && ~var12 <= 127 && ~var12 >= -128) {
                                var6.field6839.method3730(122, var13 + 128);
                                var12 += 128;
                                var11 += 128;
                                var6.field6839.method3702((var11 << 8) + var12, (byte) -108);
                            } else if (var13 < 32) {
                                var6.field6839.method3730(118, var13 + 192);
                                if (var10 != 1 && var9 != -1) {
                                    var6.field6839.method3695(var9 << 16 | var10, 255);
                                } else {
                                    var6.field6839.method3695(Integer.MIN_VALUE, 255);
                                }
                            } else {
                                var6.field6839.method3702(var13 + 57344, (byte) -112);
                                if (~var10 != -2 && ~var9 != 0) {
                                    var6.field6839.method3695(var9 << 16 | var10, 255);
                                } else {
                                    var6.field6839.method3695(Integer.MIN_VALUE, 255);
                                }
                            }
                            class712.field10042 = var8.method1791((byte) -102);
                        }
                    }
                    if (var6 != null) {
                        var6.field6839.method3746(-var7 + var6.field6839.field9084, 124);
                        class120.method872((byte) 42, var6);
                    }
                }
                if (var5 != null) {
                    long var14 = (var5.method1791((byte) -102) - class523.field7475) / 50L;
                    if (var14 > 32767L) {
                        var14 = 32767L;
                    }
                    class523.field7475 = var5.method1791((byte) -102);
                    int var16 = var5.method1793((byte) -70);
                    if (var16 >= 0) {
                        if (var16 > 65535) {
                            var16 = 65535;
                        }
                    } else {
                        var16 = 0;
                    }
                    int var17 = var5.method1794((byte) 115);
                    if (var17 >= 0) {
                        if (var17 > 65535) {
                            var17 = 65535;
                        }
                    } else {
                        var17 = 0;
                    }
                    byte var18 = 0;
                    if (~var5.method1792((byte) -79) == -3) {
                        var18 = 1;
                    }
                    ++class241.field3507;
                    int var19 = (int) var14;
                    class468 var20 = class93.method734(class29.field284, class328.field4673, 8174);
                    var20.field6839.method3705(-21138, var16 << 16 | var17);
                    var20.field6839.method3734(var18 << 15 | var19, 501927912);
                    class120.method872((byte) -124, var20);
                }
                if (class748.field10462 > 0) {
                    ++class514.field7300;
                    class468 var21 = class93.method734(class29.field284, class244.field3563, 8174);
                    var21.field6839.method3730(125, class748.field10462 * 3);
                    for (int var22 = 0; class748.field10462 > var22; ++var22) {
                        class204 var23 = class618.field8688[var22];
                        long var24 = (var23.method716((byte) 53) + -class445.field6607) / 50L;
                        if (~var24 < -65536L) {
                            var24 = 65535L;
                        }
                        class445.field6607 = var23.method716((byte) 53);
                        var21.field6839.method3730(108, var23.method711(10196));
                        var21.field6839.method3702((int) var24, (byte) -107);
                    }
                    class120.method872((byte) -101, var21);
                }
                if (~class189.field2870 < -1) {
                    --class189.field2870;
                }
                if (class504.field7168 && ~class189.field2870 >= -1) {
                    class189.field2870 = 20;
                    ++class545.field7757;
                    class504.field7168 = false;
                    class468 var26 = class93.method734(class29.field284, class51.field739, 8174);
                    var26.field6839.method3706((byte) 82, (int) class418.field6261 >> 3);
                    var26.field6839.method3706((byte) 82, (int) class255.field3659 >> 3);
                    class120.method872((byte) 108, var26);
                }
                if (arg0 <= 24) {
                    method4181(54);
                }
                if (class559.field7996 != class201.field3018) {
                    ++class752.field10508;
                    class559.field7996 = class201.field3018;
                    class468 var27 = class93.method734(class29.field284, class741.field10386, 8174);
                    var27.field6839.method3730(127, !class201.field3018 ? 0 : 1);
                    class120.method872((byte) 111, var27);
                }
                if (!class349.field5105) {
                    ++class740.field10377;
                    class468 var28 = class93.method734(class29.field284, class290.field4143, 8174);
                    var28.field6839.method3730(124, 0);
                    int var29 = var28.field6839.field9084;
                    class645 var30 = class63.field916.method4106((byte) 69);
                    var28.field6839.method3703(0, var30.field9068, var30.field9084, 128);
                    var28.field6839.method3746(-var29 + var28.field6839.field9084, -115);
                    class120.method872((byte) 82, var28);
                    class349.field5105 = true;
                }
                if (class80.field1136 != null) {
                    if (class264.field3784 == 2) {
                        class343.method2176(113);
                    } else if (~class264.field3784 == -4) {
                        class233.method1552(127);
                    }
                }
                if (!field10477) {
                    class32.field330 /= 2.0F;
                } else {
                    field10477 = false;
                }
                if (class132.field1780) {
                    class132.field1780 = false;
                } else {
                    class724.field10112 /= 2.0F;
                }
                class242.method1613(122);
                if (class87.field1246 == 10) {
                    class497.method2958((byte) -117);
                    class163.method1191(-30273);
                    class106.method796(-4246);
                    ++class523.field7482;
                    if (class523.field7482 > 750) {
                        class213.method1446(true);
                    } else {
                        class341.method2174(-82);
                        class394.method2520(11383);
                        class611.method3541(1000);
                        for (int var31 = class83.field1160.method2608(-18952, true); var31 != -1; var31 = class83.field1160.method2608(-18952, false)) {
                            class434.method2689(5, var31);
                            class339.field4934[class493.method2943(31, class356.field5174++)] = var31;
                        }
                        for (class150 var32 = class54.method381((byte) -90); var32 != null; var32 = class54.method381((byte) -108)) {
                            int var33 = var32.method1114(-17179);
                            int var34 = var32.method1118((byte) -65);
                            if (~var33 != -2) {
                                if (~var33 == -3) {
                                    class413.field6210[var34] = var32.field2344;
                                    class378.field5714[class493.method2943(31, class703.field9802++)] = var34;
                                } else if (var33 != 3) {
                                    if (~var33 == -5) {
                                        class46 var35 = class405.method2580(var34, 93);
                                        int var36 = var32.field2346;
                                        int var37 = var32.field2342;
                                        int var38 = var32.field2345;
                                        if (~var35.field585 != ~var36 || var35.field679 != var37 || ~var35.field529 != ~var38) {
                                            var35.field585 = var36;
                                            var35.field679 = var37;
                                            var35.field529 = var38;
                                            class673.method3850(var35, (byte) 89);
                                        }
                                    } else if (var33 != 5) {
                                        if (~var33 == -7) {
                                            int var39 = var32.field2346;
                                            int var40 = (var39 & 32325) >> 10;
                                            int var41 = (1001 & var39) >> 5;
                                            int var42 = 31 & var39;
                                            int var43 = (var40 << 19) + ((var41 << 11) - -(var42 << 3));
                                            class46 var44 = class405.method2580(var34, -98);
                                            if (var44.field592 != var43) {
                                                var44.field592 = var43;
                                                class673.method3850(var44, (byte) -56);
                                            }
                                        } else if (~var33 == -8) {
                                            class46 var45 = class405.method2580(var34, 110);
                                            boolean var46 = var32.field2346 == 1;
                                            if (!var45.field682 == var46) {
                                                var45.field682 = var46;
                                                class673.method3850(var45, (byte) 100);
                                            }
                                        } else if (var33 != 8) {
                                            if (~var33 == -10) {
                                                class46 var47 = class405.method2580(var34, 60);
                                                if (~var32.field2346 != ~var47.field687 || var32.field2342 != var47.field562) {
                                                    var47.field687 = var32.field2346;
                                                    var47.field562 = var32.field2342;
                                                    class673.method3850(var47, (byte) -88);
                                                }
                                            } else if (~var33 == -11) {
                                                class46 var48 = class405.method2580(var34, 87);
                                                if (~var32.field2346 != ~var48.field680 || var32.field2342 != var48.field620 || ~var32.field2345 != ~var48.field528) {
                                                    var48.field620 = var32.field2342;
                                                    var48.field680 = var32.field2346;
                                                    var48.field528 = var32.field2345;
                                                    class673.method3850(var48, (byte) -40);
                                                }
                                            } else if (var33 != 11) {
                                                if (~var33 != -13) {
                                                    if (~var33 != -15) {
                                                        if (var33 != 15) {
                                                            if (~var33 == -17) {
                                                                class46 var49 = class405.method2580(var34, 75);
                                                                var49.field671 = var32.field2346;
                                                            } else if (var33 == 17) {
                                                                class46 var50 = class405.method2580(var34, -110);
                                                                var50.field520 = var32.field2346;
                                                            }
                                                        } else {
                                                            class344.field4987 = var32.field2346;
                                                            class445.field6615 = var32.field2342;
                                                            class72.field1010 = true;
                                                        }
                                                    } else {
                                                        class46 var51 = class405.method2580(var34, 101);
                                                        var51.field633 = var32.field2346;
                                                    }
                                                } else {
                                                    class46 var52 = class405.method2580(var34, -112);
                                                    int var53 = var32.field2346;
                                                    if (var52 != null && ~var52.field577 == -1) {
                                                        if (-var52.field574 + var52.field573 < var53) {
                                                            var53 = -var52.field574 + var52.field573;
                                                        }
                                                        if (var53 < 0) {
                                                            var53 = 0;
                                                        }
                                                        if (var52.field554 != var53) {
                                                            var52.field554 = var53;
                                                            class673.method3850(var52, (byte) -93);
                                                        }
                                                    }
                                                }
                                            } else {
                                                class46 var54 = class405.method2580(var34, 74);
                                                var54.field643 = var54.field642 = var32.field2342;
                                                var54.field625 = 0;
                                                var54.field637 = 0;
                                                var54.field669 = var54.field681 = var32.field2346;
                                                class673.method3850(var54, (byte) -91);
                                            }
                                        } else {
                                            class46 var55 = class405.method2580(var34, -53);
                                            if (~var32.field2346 != ~var55.field629 || var32.field2342 != var55.field523 || ~var32.field2345 != ~var55.field686) {
                                                var55.field629 = var32.field2346;
                                                var55.field523 = var32.field2342;
                                                var55.field686 = var32.field2345;
                                                if (var55.field687 != -1) {
                                                    if (var55.field659 > 0) {
                                                        var55.field686 = var55.field686 * 32 / var55.field659;
                                                    } else if (var55.field665 > 0) {
                                                        var55.field686 = var55.field686 * 32 / var55.field665;
                                                    }
                                                }
                                                class673.method3850(var55, (byte) -101);
                                            }
                                        }
                                    } else {
                                        class46 var56 = class405.method2580(var34, 54);
                                        if (var32.field2346 != var56.field544 || ~var32.field2346 == 0) {
                                            var56.field522 = 1;
                                            var56.field544 = var32.field2346;
                                            var56.field607 = 0;
                                            var56.field619 = 0;
                                            class288 var57 = ~var56.field544 == 0 ? null : class742.field10404.method2663(0, var56.field544);
                                            if (var57 != null) {
                                                class103.method790(-25839, var57, var56.field619);
                                            }
                                            class673.method3850(var56, (byte) -31);
                                        }
                                    }
                                } else {
                                    class46 var58 = class405.method2580(var34, -53);
                                    if (!var32.field2344.equals(var58.field654)) {
                                        var58.field654 = var32.field2344;
                                        class673.method3850(var58, (byte) 97);
                                    }
                                }
                            } else {
                                class461.field6799[var34] = var32.field2346;
                                class479.field6948 |= class521.field7460[var34];
                                class369.field5315[class493.method2943(31, class703.field9798++)] = var34;
                            }
                        }
                        ++class12.field171;
                        if (class199.field2994 != 0) {
                            class177.field2750 += 20;
                            if (class177.field2750 >= 400) {
                                class199.field2994 = 0;
                            }
                        }
                        if (class239.field3477 != null) {
                            ++class361.field5231;
                            if (~class361.field5231 <= -16) {
                                class673.method3850(class239.field3477, (byte) 119);
                                class239.field3477 = null;
                            }
                        }
                        class55.field769 = null;
                        class172.field2674 = false;
                        class177.field2752 = null;
                        class354.field5151 = false;
                        class325.method2065(-1, (class46) null, -11167, -1);
                        class48.method357(true, -1, (class46) null, -1);
                        if (!class282.field3986) {
                            class389.field5865 = -1;
                        }
                        class67.method595(-24367);
                        ++class589.field8351;
                        if (class149.field2331) {
                            ++class638.field8954;
                            class468 var59 = class93.method734(class29.field284, class700.field9649, 8174);
                            var59.field6839.method3698(120, class270.field3856 << 14 | class257.field3692 << 28 | class341.field4949);
                            class120.method872((byte) 62, var59);
                            class149.field2331 = false;
                        }
                        while (true) {
                            class177 var60;
                            class46 var61;
                            class46 var62;
                            do {
                                var60 = (class177) class533.field7665.method1198((byte) 41);
                                if (var60 == null) {
                                    while (true) {
                                        class177 var63;
                                        class46 var64;
                                        class46 var65;
                                        do {
                                            var63 = (class177) class716.field10073.method1198((byte) 60);
                                            if (var63 == null) {
                                                while (true) {
                                                    class177 var66;
                                                    class46 var67;
                                                    class46 var68;
                                                    do {
                                                        var66 = (class177) class150.field2337.method1198((byte) 90);
                                                        if (var66 == null) {
                                                            if (class55.field769 == null) {
                                                                class189.field2871 = 0;
                                                            }
                                                            if (class609.field8613 != null) {
                                                                class562.method3282(false);
                                                            }
                                                            if (class245.field3569 > 0 && class35.field371.method2474(82, (byte) 116) && class35.field371.method2474(81, (byte) 125) && ~class671.field9360 != -1) {
                                                                int var69 = -class671.field9360 + class130.field1749.field8429;
                                                                if (var69 >= 0) {
                                                                    if (var69 > 3) {
                                                                        var69 = 3;
                                                                    }
                                                                } else {
                                                                    var69 = 0;
                                                                }
                                                                class343.method2178(var69, class582.field8288 - -class130.field1749.field6139[0], class361.field5224 - -class130.field1749.field6133[0], false);
                                                            }
                                                            class179.method1267(true);
                                                            for (int var70 = 0; ~var70 > -6; ++var70) {
                                                                int var10002 = class602.field8518[var70]++;
                                                            }
                                                            if (class479.field6948 && ~(class524.method3075(18) + -60000L) < ~class673.field9388) {
                                                                class88.method708(false);
                                                            }
                                                            for (class501 var71 = (class501) class123.field1662.method1615((byte) 98); var71 != null; var71 = (class501) class123.field1662.method1625(-86)) {
                                                                if (~(class524.method3075(18) / 1000L + -5L) < ~((long) var71.field7113)) {
                                                                    if (var71.field7114 > 0) {
                                                                        class25.method125(0, "", 0, var71.field7118 + class430.field6389.method2679(class650.field9160, 88), 5, "", "");
                                                                    }
                                                                    if (var71.field7114 == 0) {
                                                                        class25.method125(0, "", 0, var71.field7118 + class430.field6390.method2679(class650.field9160, -49), 5, "", "");
                                                                    }
                                                                    var71.method385((byte) -11);
                                                                }
                                                            }
                                                            ++class57.field791;
                                                            if (~class57.field791 < -501) {
                                                                class57.field791 = 0;
                                                                int var72 = (int) (Math.random() * 8.0D);
                                                                if (~(4 & var72) == -5) {
                                                                    class378.field5721 += class497.field7071;
                                                                }
                                                                if ((var72 & 1) == 1) {
                                                                    class309.field4385 += class426.field6322;
                                                                }
                                                                if ((2 & var72) == 2) {
                                                                    class633.field8863 += class122.field1659;
                                                                }
                                                            }
                                                            if (~class309.field4385 > 49) {
                                                                class426.field6322 = 2;
                                                            }
                                                            if (class633.field8863 < -55) {
                                                                class122.field1659 = 2;
                                                            }
                                                            if (~class309.field4385 < -51) {
                                                                class426.field6322 = -2;
                                                            }
                                                            if (class378.field5721 < -40) {
                                                                class497.field7071 = 1;
                                                            }
                                                            if (class633.field8863 > 55) {
                                                                class122.field1659 = -2;
                                                            }
                                                            ++class108.field1501;
                                                            if (class378.field5721 > 40) {
                                                                class497.field7071 = -1;
                                                            }
                                                            if (class108.field1501 > 500) {
                                                                class108.field1501 = 0;
                                                                int var73 = (int) (8.0D * Math.random());
                                                                if ((var73 & 1) == 1) {
                                                                    class748.field10464 += class210.field3079;
                                                                }
                                                                if (~(var73 & 2) == -3) {
                                                                    class305.field4322 += class629.field8791;
                                                                }
                                                            }
                                                            if (class748.field10464 < -60) {
                                                                class210.field3079 = 2;
                                                            }
                                                            if (~class748.field10464 < -61) {
                                                                class210.field3079 = -2;
                                                            }
                                                            if (class305.field4322 < -20) {
                                                                class629.field8791 = 1;
                                                            }
                                                            if (class305.field4322 > 10) {
                                                                class629.field8791 = -1;
                                                            }
                                                            ++class77.field1072;
                                                            if (~class77.field1072 < -51) {
                                                                ++class748.field10465;
                                                                class468 var74 = class93.method734(class29.field284, class173.field2684, 8174);
                                                                class120.method872((byte) -40, var74);
                                                            }
                                                            if (class735.field10301) {
                                                                class284.method1820((byte) -32);
                                                                class735.field10301 = false;
                                                            }
                                                            try {
                                                                class691.method3927(1635);
                                                                return;
                                                            } catch (IOException var75) {
                                                                class213.method1446(true);
                                                                return;
                                                            }
                                                        }
                                                        var67 = var66.field2743;
                                                        if (var67.field603 < 0) {
                                                            break;
                                                        }
                                                        var68 = class405.method2580(var67.field557, -83);
                                                    } while (var68 == null || var68.field621 == null || ~var67.field603 <= ~var68.field621.length || var68.field621[var67.field603] != var67);
                                                    class709.method4025(var66);
                                                }
                                            }
                                            var64 = var63.field2743;
                                            if (var64.field603 < 0) {
                                                break;
                                            }
                                            var65 = class405.method2580(var64.field557, 115);
                                        } while (var65 == null || var65.field621 == null || var64.field603 >= var65.field621.length || var65.field621[var64.field603] != var64);
                                        class709.method4025(var63);
                                    }
                                }
                                var61 = var60.field2743;
                                if (~var61.field603 > -1) {
                                    break;
                                }
                                var62 = class405.method2580(var61.field557, 48);
                            } while (var62 == null || var62.field621 == null || var62.field621.length <= var61.field603 || var62.field621[var61.field603] != var61);
                            class709.method4025(var60);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)[[I", line = 987)
    public final int[][] method196(int arg0, int arg1) {
        if (arg0 != -18210) {
            this.method190(21, -41, (class645) null);
        }
        ++field10480;
        int[][] var3 = super.field387.method2809(arg1, (byte) -48);
        if (super.field387.field6792) {
            int[][] var4 = this.method195(true, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class729.field10216 > var11; ++var11) {
                this.method4182(var7[var11], 70, var6[var11], var5[var11]);
                this.field10468 += this.field10476;
                this.field10481 += this.field10467;
                this.field10475 += this.field10478;
                while (~this.field10481 > -1) {
                    this.field10481 += 4096;
                }
                while (this.field10481 > 4096) {
                    this.field10481 -= 4096;
                }
                if (~this.field10475 > -1) {
                    this.field10475 = 0;
                }
                if (~this.field10475 < -4097) {
                    this.field10475 = 4096;
                }
                if (~this.field10468 > -1) {
                    this.field10468 = 0;
                }
                if (~this.field10468 < -4097) {
                    this.field10468 = 4096;
                }
                this.method4180(this.field10475, this.field10468, this.field10481, false);
                var8[var11] = this.field10479;
                var9[var11] = this.field10469;
                var10[var11] = this.field10482;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIII)V", line = 1059)
    private final void method4182(int arg0, int arg1, int arg2, int arg3) {
        ++field10472;
        int var5 = ~arg3 < ~arg2 ? arg3 : arg2;
        int var6 = 69 / ((arg1 - 21) / 49);
        int var7 = ~arg2 >= ~arg3 ? arg2 : arg3;
        int var8 = var5 < arg0 ? arg0 : var5;
        int var9 = ~arg0 > ~var7 ? arg0 : var7;
        this.field10468 = (var9 - -var8) / 2;
        int var10 = -var9 + var8;
        if (this.field10468 > 0 && ~this.field10468 > -4097) {
            this.field10475 = (var10 << 12) / (~this.field10468 >= -2049 ? this.field10468 * 2 : -(this.field10468 * 2) + 8192);
        } else {
            this.field10475 = 0;
        }
        if (var10 > 0) {
            int var11 = (-arg3 + var8 << 12) / var10;
            int var12 = (-arg2 + var8 << 12) / var10;
            int var13 = (-arg0 + var8 << 12) / var10;
            if (arg3 == var8) {
                this.field10481 = arg2 == var9 ? var13 + 20480 : -var12 + 4096;
            } else if (arg2 == var8) {
                this.field10481 = arg0 != var9 ? -var13 + 12288 : var11 + 4096;
            } else {
                this.field10481 = arg3 != var9 ? -var11 + 20480 : var12 + 12288;
            }
            this.field10481 /= 6;
        } else {
            this.field10481 = 0;
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V", line = 1122)
    public class749() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILrg;)V", line = 1133)
    public final void method190(int arg0, int arg1, class645 arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field10476 = (arg2.method3743(true) << 12) / 100;
                }
            } else {
                this.field10478 = (arg2.method3743(true) << 12) / 100;
            }
        } else {
            this.field10467 = arg2.method3756(65536);
        }
        if (arg0 <= 34) {
            this.method4180(114, 1, 35, false);
        }
        ++field10474;
    }
}
