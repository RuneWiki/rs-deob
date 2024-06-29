import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class452 {

    @OriginalMember(owner = "client!mea", name = "e", descriptor = "I")
    public int field6478 = 8;

    @OriginalMember(owner = "client!mea", name = "m", descriptor = "I")
    public int field6486 = 512;

    @OriginalMember(owner = "client!mea", name = "n", descriptor = "Z")
    public boolean field6487 = true;

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "I")
    public int field6474 = 1190717;

    @OriginalMember(owner = "client!mea", name = "f", descriptor = "Z")
    public boolean field6479 = true;

    @OriginalMember(owner = "client!mea", name = "q", descriptor = "Z")
    public boolean field6490 = false;

    @OriginalMember(owner = "client!mea", name = "o", descriptor = "I")
    public int field6488 = -1;

    @OriginalMember(owner = "client!mea", name = "h", descriptor = "I")
    public int field6481 = 0;

    @OriginalMember(owner = "client!mea", name = "j", descriptor = "I")
    public int field6483 = 127;

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "I")
    public int field6475 = 64;

    @OriginalMember(owner = "client!mea", name = "u", descriptor = "I")
    public int field6494 = -1;

    @OriginalMember(owner = "client!mea", name = "r", descriptor = "Led;")
    public static class732 field6491 = new class732(7, 0, 1, 1);

    @OriginalMember(owner = "client!mea", name = "i", descriptor = "F")
    public static float field6482;

    @OriginalMember(owner = "client!mea", name = "c", descriptor = "I")
    public int field6476;

    @OriginalMember(owner = "client!mea", name = "d", descriptor = "I")
    public static int field6477;

    @OriginalMember(owner = "client!mea", name = "g", descriptor = "I")
    public static int field6480;

    @OriginalMember(owner = "client!mea", name = "k", descriptor = "I")
    public static int field6484;

    @OriginalMember(owner = "client!mea", name = "l", descriptor = "I")
    public static int field6485;

    @OriginalMember(owner = "client!mea", name = "s", descriptor = "I")
    public static int field6492;

    @OriginalMember(owner = "client!mea", name = "t", descriptor = "I")
    public static int field6493;

    @OriginalMember(owner = "client!mea", name = "v", descriptor = "I")
    public static int field6495;

    @OriginalMember(owner = "client!mea", name = "w", descriptor = "I")
    public static int field6496;

    @OriginalMember(owner = "client!mea", name = "p", descriptor = "Lbm;")
    public class123 field6489;

    @OriginalMember(owner = "client!mea", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field6497;

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Z)V")
    public final void method2683(boolean arg0) {
        field6477++;
        this.field6478 = this.field6478 << 8 | this.field6476;
        if (arg0) {
            method2684(true);
        }
    }

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "(Z)V")
    public static final void method2684(boolean arg0) {
        if (class73.field989 > 1) {
            class73.field989--;
            class183.field2411 = class701.field9280;
        }
        field6495++;
        if (class160.field2151) {
            class160.field2151 = false;
            class73.method594((byte) -83);
            return;
        }
        if (!class677.field9075) {
            class473.method2753(-15151);
        }
        for (int var1 = 0; var1 < 100 && class761.method4195((byte) 99); var1++) {
        }
        if (class780.field10712 != 10) {
            return;
        }
        while (class33.method184((byte) 51)) {
            class43 var2 = class492.method2903(class738.field10016, 0, class73.field983);
            var2.field457.method1725(0, 127);
            int var3 = var2.field457.field3725;
            class45.method299(var2.field457, -20);
            var2.field457.method1726((byte) -127, var2.field457.field3725 - var3);
            class409.method2457((byte) -100, var2);
        }
        if (class790.field10852 == null) {
            if (class401.method2440(false) >= class66.field898) {
                class790.field10852 = class773.field10621.method1529(class102.field1464.field9101, false);
            }
        } else if (class790.field10852.field9211 != -1) {
            class43 var4 = class492.method2903(class563.field7703, 0, class73.field983);
            var4.field457.method1733(class790.field10852.field9211, -32466);
            class409.method2457((byte) -100, var4);
            class790.field10852 = null;
            class66.field898 = class401.method2440(false) + 30000L;
        }
        class428 var5 = (class428) class318.field4527.method679((byte) -86);
        if (var5 != null || class401.method2440(false) - 2000L > class477.field6697) {
            class43 var6 = null;
            int var7 = 0;
            for (class428 var8 = (class428) class555.field7655.method679((byte) -86); var8 != null && (var6 == null || var6.field457.field3725 - var7 < 240); var8 = (class428) class555.field7655.method681(-107)) {
                var8.method1102((byte) 124);
                int var9 = var8.method379(arg0);
                if (var9 < -1) {
                    var9 = -1;
                } else if (var9 > 65534) {
                    var9 = 65534;
                }
                int var10 = var8.method375(121);
                if (var10 < -1) {
                    var10 = -1;
                } else if (var10 > 65534) {
                    var10 = 65534;
                }
                if (class660.field8890 != var10 || class675.field9036 != var9) {
                    if (var6 == null) {
                        class441.field6345++;
                        var6 = class492.method2903(class197.field2557, 0, class73.field983);
                        var6.field457.method1725(0, 110);
                        var7 = var6.field457.field3725;
                    }
                    int var11 = var10 - class660.field8890;
                    class660.field8890 = var10;
                    int var12 = var9 - class675.field9036;
                    class675.field9036 = var9;
                    int var13 = (int) ((var8.method378((byte) 82) - class477.field6697) / 20L);
                    if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                        var12 += 32;
                        var11 += 32;
                        var6.field457.method1733((var13 << 12) + var12 + (var11 << 6), -32466);
                    } else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
                        var11 += 128;
                        var6.field457.method1725(var13 + 128, 92);
                        var12 += 128;
                        var6.field457.method1733((var11 << 8) + var12, -32466);
                    } else if (var13 < 32) {
                        var6.field457.method1725(var13 + 192, 101);
                        if (var10 == 1 || var9 == -1) {
                            var6.field457.method1686(112, Integer.MIN_VALUE);
                        } else {
                            var6.field457.method1686(-111, var9 << 16 | var10);
                        }
                    } else {
                        var6.field457.method1733(var13 + 57344, -32466);
                        if (var10 == 1 || var9 == -1) {
                            var6.field457.method1686(-81, Integer.MIN_VALUE);
                        } else {
                            var6.field457.method1686(110, var10 | var9 << 16);
                        }
                    }
                    class477.field6697 = var8.method378((byte) 73);
                }
            }
            if (var6 != null) {
                var6.field457.method1726((byte) -127, var6.field457.field3725 - var7);
                class409.method2457((byte) -100, var6);
            }
        }
        if (var5 != null) {
            long var14 = (var5.method378((byte) 93) - class702.field9305) / 50L;
            if (var14 > 32767L) {
                var14 = 32767L;
            }
            class702.field9305 = var5.method378((byte) 50);
            int var16 = var5.method379(true);
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            int var17 = var5.method375(121);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            byte var18 = 0;
            if (var5.method376((byte) -29) == 2) {
                var18 = 1;
            }
            int var19 = (int) var14;
            class605.field8200++;
            class43 var20 = class492.method2903(class399.field5709, 0, class73.field983);
            var20.field457.method1718((byte) -34, var19 | var18 << 15);
            var20.field457.method1686(-61, var17 | var16 << 16);
            class409.method2457((byte) -100, var20);
        }
        if (class243.field3194 > 0) {
            class406.field5757++;
            class43 var21 = class492.method2903(class689.field9213, 0, class73.field983);
            var21.field457.method1725(class243.field3194 * 3, 79);
            for (int var22 = 0; var22 < class243.field3194; var22++) {
                class622 var23 = class133.field1822[var22];
                long var24 = (var23.method1987(true) - class236.field3151) / 50L;
                class236.field3151 = var23.method1987(true);
                if (var24 > 65535L) {
                    var24 = 65535L;
                }
                var21.field457.method1725(var23.method1991(32262), 66);
                var21.field457.method1733((int) var24, -32466);
            }
            class409.method2457((byte) -100, var21);
        }
        if (class54.field642 > 0) {
            class54.field642--;
        }
        if (class7.field61 && class54.field642 <= 0) {
            class54.field642 = 20;
            class7.field61 = false;
            class786.field10797++;
            class43 var26 = class492.method2903(class7.field53, 0, class73.field983);
            var26.field457.method1733((int) class294.field4169 >> 3, -32466);
            var26.field457.method1733((int) class514.field7144 >> 3, -32466);
            class409.method2457((byte) -100, var26);
        }
        if (class95.field1347 != class388.field5620) {
            class142.field1899++;
            class388.field5620 = class95.field1347;
            class43 var27 = class492.method2903(class303.field4249, 0, class73.field983);
            var27.field457.method1725(class95.field1347 ? 1 : 0, 89);
            class409.method2457((byte) -100, var27);
        }
        if (!class180.field2362) {
            class68.field943++;
            class43 var28 = class492.method2903(class631.field8540, 0, class73.field983);
            var28.field457.method1725(0, 26);
            int var29 = var28.field457.field3725;
            class254 var30 = class125.field1721.method2251(false);
            var28.field457.method1716(var30.field3789, var30.field3725, 0, true);
            var28.field457.method1726((byte) -127, var28.field457.field3725 - var29);
            class409.method2457((byte) -100, var28);
            class180.field2362 = true;
        }
        if (class443.field6387 != null) {
            if (class697.field9252 == 2) {
                class715.method3959((byte) 70);
            } else if (class697.field9252 == 3) {
                class397.method2425(!arg0);
            }
        }
        if (class446.field6417) {
            class446.field6417 = false;
        } else {
            class49.field495 /= 2.0F;
        }
        if (class444.field6399) {
            class444.field6399 = false;
        } else {
            class495.field6971 /= 2.0F;
        }
        class99.method782(0);
        if (class780.field10712 != 10) {
            return;
        }
        class411.method2465((byte) 106);
        class639.method3517(2358);
        class702.method3831((byte) 113);
        class535.field7418++;
        if (class535.field7418 > 750) {
            class73.method594((byte) 116);
            return;
        }
        class561.method3199((byte) 18);
        class213.method1381(46);
        class112.method831(true);
        for (int var31 = class480.field6740.method4227(arg0, 127); var31 != -1; var31 = class480.field6740.method4227(false, -31)) {
            class114.method838(5, var31);
            class313.field4422[class519.method3018(31, class588.field8010++)] = var31;
        }
        for (class778 var32 = class430.method2582(arg0); var32 != null; var32 = class430.method2582(arg0)) {
            int var33 = var32.method4275((byte) -82);
            long var34 = var32.method4271(true);
            if (var33 == 1) {
                class138.field1865[(int) var34] = var32.field10690;
                class303.field4255 |= class679.field9091[(int) var34];
                class761.field10454[class519.method3018(class70.field957++, 31)] = (int) var34;
            } else if (var33 == 2) {
                field6497[(int) var34] = var32.field10694;
                class514.field7145[class519.method3018(class214.field2807++, 31)] = (int) var34;
            } else if (var33 == 3) {
                class347 var63 = class445.method2655((int) var34, (byte) 121);
                if (!var32.field10694.equals(var63.field4890)) {
                    var63.field4890 = var32.field10694;
                    class151.method1062((byte) -122, var63);
                }
            } else if (var33 == 4) {
                class347 var59 = class445.method2655((int) var34, (byte) 112);
                int var60 = var32.field10690;
                int var61 = var32.field10692;
                int var62 = var32.field10693;
                if (var59.field4985 != var60 || var59.field5037 != var61 || var59.field4925 != var62) {
                    var59.field5037 = var61;
                    var59.field4925 = var62;
                    var59.field4985 = var60;
                    class151.method1062((byte) -111, var59);
                }
            } else if (var33 == 5) {
                class347 var57 = class445.method2655((int) var34, (byte) 114);
                if (var32.field10690 != var57.field4992 || var32.field10690 == -1) {
                    var57.field4992 = var32.field10690;
                    var57.field5022 = 0;
                    var57.field4906 = 0;
                    var57.field4984 = 1;
                    class317 var58 = var57.field4992 == -1 ? null : class693.field9223.method2388(var57.field4992, 0);
                    if (var58 != null) {
                        class159.method1101(var57.field4906, (byte) -105, var58);
                    }
                    class151.method1062((byte) -100, var57);
                }
            } else if (var33 == 6) {
                int var36 = var32.field10690;
                int var37 = (var36 & 0x7CE9) >> 10;
                int var38 = (var36 & 0x3FE) >> 5;
                int var39 = var36 & 0x1F;
                int var40 = (var37 << 19) + (var38 << 11) + (var39 << 3);
                class347 var41 = class445.method2655((int) var34, (byte) 111);
                if (var41.field4944 != var40) {
                    var41.field4944 = var40;
                    class151.method1062((byte) -116, var41);
                }
            } else if (var33 == 7) {
                class347 var42 = class445.method2655((int) var34, (byte) 110);
                boolean var43 = var32.field10690 == 1;
                if (var42.field4951 != var43) {
                    var42.field4951 = var43;
                    class151.method1062((byte) -127, var42);
                }
            } else if (var33 == 8) {
                class347 var44 = class445.method2655((int) var34, (byte) 116);
                if (var32.field10690 != var44.field5001 || var32.field10692 != var44.field5010 || var32.field10693 != var44.field4888) {
                    var44.field5001 = var32.field10690;
                    var44.field5010 = var32.field10692;
                    var44.field4888 = var32.field10693;
                    if (var44.field4956 != -1) {
                        if (var44.field5024 > 0) {
                            var44.field4888 = var44.field4888 * 32 / var44.field5024;
                        } else if (var44.field4964 > 0) {
                            var44.field4888 = var44.field4888 * 32 / var44.field4964;
                        }
                    }
                    class151.method1062((byte) -110, var44);
                }
            } else if (var33 == 9) {
                class347 var56 = class445.method2655((int) var34, (byte) 116);
                if (var32.field10690 != var56.field4956 || var32.field10692 != var56.field5028) {
                    var56.field4956 = var32.field10690;
                    var56.field5028 = var32.field10692;
                    class151.method1062((byte) -101, var56);
                }
            } else if (var33 == 10) {
                class347 var55 = class445.method2655((int) var34, (byte) 113);
                if (var32.field10690 != var55.field5011 || var32.field10692 != var55.field4994 || var32.field10693 != var55.field4916) {
                    var55.field4916 = var32.field10693;
                    var55.field4994 = var32.field10692;
                    var55.field5011 = var32.field10690;
                    class151.method1062((byte) -121, var55);
                }
            } else if (var33 == 11) {
                class347 var54 = class445.method2655((int) var34, (byte) 124);
                var54.field4887 = var54.field5006 = var32.field10692;
                var54.field4886 = 0;
                var54.field4950 = 0;
                var54.field4934 = var54.field5032 = var32.field10690;
                class151.method1062((byte) -117, var54);
            } else if (var33 == 12) {
                class347 var45 = class445.method2655((int) var34, (byte) 111);
                int var46 = var32.field10690;
                if (var45 != null && var45.field4884 == 0) {
                    if (var45.field4978 - var45.field4940 < var46) {
                        var46 = var45.field4978 - var45.field4940;
                    }
                    if (var46 < 0) {
                        var46 = 0;
                    }
                    if (var45.field4949 != var46) {
                        var45.field4949 = var46;
                        class151.method1062((byte) -121, var45);
                    }
                }
            } else if (var33 == 14) {
                class347 var47 = class445.method2655((int) var34, (byte) 123);
                var47.field4965 = var32.field10690;
            } else if (var33 == 15) {
                class635.field8577 = true;
                class15.field148 = var32.field10692;
                class302.field4242 = var32.field10690;
            } else if (var33 == 16) {
                class347 var48 = class445.method2655((int) var34, (byte) 115);
                var48.field4898 = var32.field10690;
            } else if (var33 == 17) {
                class347 var49 = class445.method2655((int) var34, (byte) 110);
                var49.field4875 = var32.field10690;
            } else if (var33 == 18) {
                class347 var52 = class445.method2655((int) var34, (byte) 117);
                int var53 = (int) (var34 >> 32);
                var52.method2212((short) var32.field10690, var53, (short) var32.field10692, (byte) -121);
            } else if (var33 == 19) {
                class347 var50 = class445.method2655((int) var34, (byte) 113);
                int var51 = (int) (var34 >> 32);
                var50.method2223((short) var32.field10692, var51, (short) var32.field10690, false);
            }
        }
        if (class780.field10713 != 0) {
            class153.field2062 += 20;
            if (class153.field2062 >= 400) {
                class780.field10713 = 0;
            }
        }
        class643.field8659++;
        if (class676.field9054 != null) {
            class562.field7700++;
            if (class562.field7700 >= 15) {
                class151.method1062((byte) -112, class676.field9054);
                class676.field9054 = null;
            }
        }
        class178.field2351 = false;
        class157.field2116 = false;
        class254.field3722 = null;
        class336.field4737 = null;
        class260.method1763(null, -1, -120, -1);
        class275.method1808(-1, -1, 127, null);
        if (!class506.field7094) {
            class2.field22 = -1;
        }
        class276.method1812(false);
        class701.field9280++;
        if (class113.field1541) {
            class230.field2961++;
            class43 var64 = class492.method2903(class415.field5994, 0, class73.field983);
            var64.field457.method1720(-721660400, class715.field9757 | class159.field2147 << 28 | class228.field2946 << 14);
            class409.method2457((byte) -100, var64);
            class113.field1541 = false;
        }
        while (true) {
            class158 var65;
            class347 var66;
            class347 var67;
            do {
                var65 = (class158) class80.field1101.method687((byte) -125);
                if (var65 == null) {
                    while (true) {
                        class158 var68;
                        class347 var69;
                        class347 var70;
                        do {
                            var68 = (class158) class345.field4840.method687((byte) -110);
                            if (var68 == null) {
                                while (true) {
                                    class158 var71;
                                    class347 var72;
                                    class347 var73;
                                    do {
                                        var71 = (class158) class780.field10708.method687((byte) -107);
                                        if (var71 == null) {
                                            if (class254.field3722 == null) {
                                                class28.field281 = 0;
                                            }
                                            if (class528.field7306 != null) {
                                                class374.method2346(true);
                                            }
                                            if (class479.field6726 > 0 && class235.field3128.method983(101, 82) && class235.field3128.method983(101, 81) && class685.field9162 != 0) {
                                                int var74 = class625.field8475.field2813 - class685.field9162;
                                                if (var74 < 0) {
                                                    var74 = 0;
                                                } else if (var74 > 3) {
                                                    var74 = 3;
                                                }
                                                class537.method3117(var74, class625.field8475.field6198[0] + class120.field1625, -15913, class259.field3849 + class625.field8475.field6197[0]);
                                            }
                                            class671.method3703(29448);
                                            for (int var75 = 0; var75 < 5; var75++) {
                                                int var10002 = class234.field3114[var75]++;
                                            }
                                            if (class303.field4255 && class15.field149 < (class401.method2440(false) - 60000L)) {
                                                class756.method4144((byte) -116);
                                            }
                                            for (class399 var76 = (class399) class328.field4653.method2189((byte) 70); var76 != null; var76 = (class399) class328.field4653.method2192(0)) {
                                                if (((long) var76.field5714) < (class401.method2440(false) / 1000L - 5L)) {
                                                    if (var76.field5712 > 0) {
                                                        class26.method148(0, var76.field5710 + class58.field716.method365(class55.field647, (byte) 47), -88, "", 5, "", "");
                                                    }
                                                    if (var76.field5712 == 0) {
                                                        class26.method148(0, var76.field5710 + class58.field717.method365(class55.field647, (byte) 118), -114, "", 5, "", "");
                                                    }
                                                    var76.method3310(30305);
                                                }
                                            }
                                            class177.field2337++;
                                            if (class177.field2337 > 500) {
                                                class177.field2337 = 0;
                                                int var77 = (int) (Math.random() * 8.0D);
                                                if ((var77 & 0x4) == 4) {
                                                    class571.field7780 += class87.field1238;
                                                }
                                                if ((var77 & 0x1) == 1) {
                                                    class318.field4529 += class735.field9962;
                                                }
                                                if ((var77 & 0x2) == 2) {
                                                    class90.field1280 += class285.field4088;
                                                }
                                            }
                                            if (class318.field4529 < -50) {
                                                class735.field9962 = 2;
                                            }
                                            if (class318.field4529 > 50) {
                                                class735.field9962 = -2;
                                            }
                                            if (class90.field1280 < -55) {
                                                class285.field4088 = 2;
                                            }
                                            if (class90.field1280 > 55) {
                                                class285.field4088 = -2;
                                            }
                                            if (class571.field7780 < -40) {
                                                class87.field1238 = 1;
                                            }
                                            class654.field8815++;
                                            if (class571.field7780 > 40) {
                                                class87.field1238 = -1;
                                            }
                                            if (class654.field8815 > 500) {
                                                class654.field8815 = 0;
                                                int var78 = (int) (Math.random() * 8.0D);
                                                if ((var78 & 0x2) == 2) {
                                                    class767.field10544 += class517.field7186;
                                                }
                                                if ((var78 & 0x1) == 1) {
                                                    class551.field7614 += class198.field2568;
                                                }
                                            }
                                            if (class551.field7614 < -60) {
                                                class198.field2568 = 2;
                                            }
                                            if (class551.field7614 > 60) {
                                                class198.field2568 = -2;
                                            }
                                            if (class767.field10544 < -20) {
                                                class517.field7186 = 1;
                                            }
                                            class701.field9282++;
                                            if (class767.field10544 > 10) {
                                                class517.field7186 = -1;
                                            }
                                            if (class701.field9282 > 50) {
                                                class442.field6360++;
                                                class43 var79 = class492.method2903(class378.field5520, 0, class73.field983);
                                                class409.method2457((byte) -100, var79);
                                            }
                                            if (class90.field1277) {
                                                class711.method3944(96);
                                                class90.field1277 = false;
                                            }
                                            try {
                                                class345.method2186((byte) 126);
                                                return;
                                            } catch (IOException var80) {
                                                class73.method594((byte) 82);
                                                return;
                                            }
                                        }
                                        var72 = var71.field2137;
                                        if (var72.field4955 < 0) {
                                            break;
                                        }
                                        var73 = class445.method2655(var72.field4921, (byte) 124);
                                    } while (var73 == null || var73.field4928 == null || var73.field4928.length <= var72.field4955 || var73.field4928[var72.field4955] != var72);
                                    class727.method4005(var71);
                                }
                            }
                            var69 = var68.field2137;
                            if (var69.field4955 < 0) {
                                break;
                            }
                            var70 = class445.method2655(var69.field4921, (byte) 121);
                        } while (var70 == null || var70.field4928 == null || var69.field4955 >= var70.field4928.length || var70.field4928[var69.field4955] != var69);
                        class727.method4005(var68);
                    }
                }
                var66 = var65.field2137;
                if (var66.field4955 < 0) {
                    break;
                }
                var67 = class445.method2655(var66.field4921, (byte) 117);
            } while (var67 == null || var67.field4928 == null || var66.field4955 >= var67.field4928.length || var67.field4928[var66.field4955] != var66);
            class727.method4005(var65);
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Ldt;II)V")
    private final void method2685(class254 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field6481 = class571.method3248(83, arg0.method1722(false));
        } else if (arg1 == 2) {
            this.field6494 = arg0.method1731((byte) 64);
        } else if (arg1 == 3) {
            this.field6494 = arg0.method1728((byte) 8);
            if (this.field6494 == 65535) {
                this.field6494 = -1;
            }
        } else if (arg1 == 5) {
            this.field6487 = false;
        } else if (arg1 == 7) {
            this.field6488 = class571.method3248(54, arg0.method1722(false));
        } else if (arg1 == 8) {
            this.field6489.field1706 = this.field6476;
        } else if (arg1 == 9) {
            this.field6486 = arg0.method1728((byte) 56) << 2;
        } else if (arg1 == 10) {
            this.field6479 = false;
        } else if (arg1 == 11) {
            this.field6478 = arg0.method1731((byte) 64);
        } else if (arg1 == 12) {
            this.field6490 = true;
        } else if (arg1 == 13) {
            this.field6474 = arg0.method1722(false);
        } else if (arg1 == 14) {
            this.field6475 = arg0.method1731((byte) 64) << 2;
        } else if (arg1 == 16) {
            this.field6483 = arg0.method1731((byte) 64);
        }
        field6484++;
        if (arg2 >= -84) {
            this.method2683(true);
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(B)V")
    public static void method2686(byte arg0) {
        int var1 = 90 / ((arg0 - 21) / 48);
        field6497 = null;
        field6491 = null;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(II)I")
    public static final int method2687(int arg0, int arg1) {
        if (arg0 != 1096584331) {
            field6491 = null;
        }
        field6480++;
        return arg1 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(IIIIIIIII)Z")
    public static final boolean method2688(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6485++;
        if (arg1 >= arg0 + arg5 || arg1 + arg6 <= arg0) {
            return false;
        } else if (arg4 + arg7 > arg8 && (arg8 + arg2) > arg4) {
            return arg3 == -65535 ? true : true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(BJ)Ljava/lang/String;")
    public static final String method2689(byte arg0, long arg1) {
        field6492++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class255.field3795[(int) (var7 - (arg1 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                    var9 = ' ';
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            if (arg0 != -90) {
                field6482 = -0.5734598F;
            }
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(I)V")
    public static final void method2690(int arg0) {
        if (class780.field10712 == 3) {
            class170.method1148(4, arg0 ^ 0xFFFFD412);
        } else if (class780.field10712 == 7) {
            class170.method1148(8, -11239);
        } else if (class780.field10712 == 10) {
            class170.method1148(11, -11239);
        }
        if (arg0 != 11) {
            method2688(-115, 88, 122, -115, -106, -108, 41, 36, 52);
        }
        field6496++;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Ldt;Z)V")
    public final void method2691(class254 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method1731((byte) 64);
            if (var3 == 0) {
                if (!arg1) {
                    this.field6479 = false;
                }
                field6493++;
                return;
            }
            this.method2685(arg0, var3, -103);
        }
    }
}
