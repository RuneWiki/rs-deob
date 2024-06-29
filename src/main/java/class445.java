import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class445 extends class386 {

    @OriginalMember(owner = "client!eu", name = "E", descriptor = "[I")
    public static int[] field6320 = new int[13];

    @OriginalMember(owner = "client!eu", name = "J", descriptor = "Z")
    public static volatile boolean field6325 = true;

    @OriginalMember(owner = "client!eu", name = "D", descriptor = "Ljk;")
    public static class585 field6319 = new class585(13, 8);

    @OriginalMember(owner = "client!eu", name = "F", descriptor = "I")
    public static int field6321;

    @OriginalMember(owner = "client!eu", name = "G", descriptor = "I")
    public static int field6322;

    @OriginalMember(owner = "client!eu", name = "H", descriptor = "I")
    public static int field6323;

    @OriginalMember(owner = "client!eu", name = "I", descriptor = "I")
    public static int field6324;

    // $FF: synthetic field
    @OriginalMember(owner = "client!eu", name = "K", descriptor = "Ljava/lang/Class;")
    public static Class field6326;

    @OriginalMember(owner = "client!eu", name = "C", descriptor = "[I")
    public static int[] field6318;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IILr;)Z")
    public static final boolean method2629(int arg0, int arg1, class165 arg2) {
        ++field6321;
        int var3 = (class473.field6604 + -104) / 2;
        int var4 = (class205.field2465 + -104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var3 - -104 > var6; ++var6) {
            for (int var57 = var4; ~var57 > ~(var4 - -104); ++var57) {
                for (int var58 = arg0; var58 <= 3; ++var58) {
                    if (class500.method2909(arg1 + 32526, var6, arg0, var58, var57)) {
                        int var59 = var58;
                        if (class626.method3602(var6, var57, (byte) 74)) {
                            var59 = var58 - 1;
                        }
                        if (var59 >= 0) {
                            var5 &= client.method1648(var57, (byte) -36, var6, var59);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        } else {
            int[] var7 = new int[262144];
            if (arg1 != -32596) {
                return false;
            } else {
                for (int var8 = 0; var7.length > var8; ++var8) {
                    var7[var8] = -16777216;
                }
                class524.field7695 = arg2.method311(var7, 0, 512, 512, 512);
                class232.method1416(arg1 ^ 32595);
                int var9 = -16777216 | (228 + (int) (20.0D * Math.random()) << 8) + (-10 + (int) (20.0D * Math.random()) + 238 << 16) - -228 + (int) (Math.random() * 20.0D);
                int var10 = -16777216 | -10 + (238 - -((int) (20.0D * Math.random()))) << 16;
                int var11 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (8.0D * Math.random());
                boolean[][] var12 = new boolean[class255.field3462 - -1][class255.field3462 + 1];
                for (int var13 = var3; var3 - -104 > var13; var13 += class255.field3462) {
                    for (int var36 = var4; var36 < var4 + 104; var36 += class255.field3462) {
                        int var37 = 0;
                        int var38 = 0;
                        int var39 = var13;
                        if (~var13 < -1) {
                            var39 = var13 - 1;
                            var37 += 4;
                        }
                        int var40 = var36;
                        if (var36 > 0) {
                            var40 = var36 - 1;
                        }
                        int var41 = class255.field3462 + var13;
                        if (~var41 > -105) {
                            ++var41;
                        }
                        int var42 = class255.field3462 + var36;
                        if (var42 < 104) {
                            ++var42;
                            var38 += 4;
                        }
                        arg2.method292(0, 0, class255.field3462 * 4 + var37, class255.field3462 * 4 + var38);
                        arg2.method323(-16777216);
                        for (int var43 = arg0; var43 <= 3; ++var43) {
                            for (int var50 = 0; ~var50 >= ~class255.field3462; ++var50) {
                                for (int var56 = 0; ~class255.field3462 <= ~var56; ++var56) {
                                    var12[var50][var56] = class500.method2909(-81, var39 + var50, arg0, var43, var40 + var56);
                                }
                            }
                            class399.field5631[var43].method421(0, 0, 1024, var39, var40, var41, var42, var12);
                            if (!class115.field1493) {
                                for (int var51 = -4; class255.field3462 > var51; ++var51) {
                                    for (int var52 = -4; ~var52 > ~class255.field3462; ++var52) {
                                        int var53 = var13 + var51;
                                        int var54 = var36 + var52;
                                        if (var3 <= var53 && var4 <= var54 && class500.method2909(-63, var53, arg0, var43, var54)) {
                                            int var55 = var43;
                                            if (class626.method3602(var53, var54, (byte) -95)) {
                                                var55 = var43 - 1;
                                            }
                                            if (~var55 <= -1) {
                                                class153.method982(arg2, (class255.field3462 - var52) * 4 + var38 + -4, var53, var9, var10, var54, var51 * 4 + var37, 106, var55);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (class115.field1493) {
                            class370 var44 = class349.field4642[arg0];
                            for (int var45 = 0; class255.field3462 > var45; ++var45) {
                                for (int var46 = 0; class255.field3462 > var46; ++var46) {
                                    int var47 = var13 - -var45;
                                    int var48 = var36 + var46;
                                    int var49 = var44.field4979[-var44.field4978 + var47][-var44.field4975 + var48];
                                    if (~(var49 & 1076101120) != -1) {
                                        arg2.method1042(var37 - -(var45 * 4), 4, 1, var38 - -((-var46 + class255.field3462) * 4) + -4, -1713569622, 4);
                                    } else if ((8388608 & var49) != 0) {
                                        arg2.method1039(4, -1713569622, (-var46 + class255.field3462) * 4 + var38 + -4, (byte) -115, var37 - -(var45 * 4));
                                    } else if (~(33554432 & var49) != -1) {
                                        arg2.method1045((byte) 39, var45 * 4 + 3 + var37, 4, -1713569622, var38 - -((-var46 + class255.field3462) * 4) - 4);
                                    } else if ((var49 & 134217728) == 0) {
                                        if ((536870912 & var49) != 0) {
                                            arg2.method1045((byte) 62, var45 * 4 + var37, 4, -1713569622, (-var46 + class255.field3462) * 4 + -4 + var38);
                                        }
                                    } else {
                                        arg2.method1039(4, -1713569622, (class255.field3462 - var46) * 4 + var38 + -4 + 3, (byte) 66, var45 * 4 + var37);
                                    }
                                }
                            }
                        }
                        arg2.method248(var37, var38, class255.field3462 * 4, class255.field3462 * 4, var11, 2);
                        class524.field7695.method5(48 - -((-var3 + var13) * 4), 464 - class255.field3462 * 4 + -((-var4 + var36) * 4), class255.field3462 * 4, class255.field3462 * 4, var37, var38);
                    }
                }
                arg2.method249();
                arg2.method323(-16777215);
                class100.method747(false);
                class261.field3597 = 0;
                class432.field6196.method1131((byte) -110);
                if (!class115.field1493) {
                    for (int var14 = var3; var14 < var3 + 104; ++var14) {
                        for (int var20 = var4; ~var20 > ~(var4 - -104); ++var20) {
                            for (int var21 = arg0; ~(arg0 + 1) <= ~var21 && ~var21 >= -4; ++var21) {
                                if (class500.method2909(-36, var14, arg0, var21, var20)) {
                                    class691 var22 = (class691) class403.method2429(var21, var14, var20);
                                    if (var22 == null) {
                                        var22 = (class691) class564.method3296(var21, var14, var20, field6326 != null ? field6326 : (field6326 = method2633("pn")));
                                    }
                                    if (var22 == null) {
                                        var22 = (class691) class511.method3030(var21, var14, var20);
                                    }
                                    if (var22 == null) {
                                        var22 = (class691) class168.method1059(var21, var14, var20);
                                    }
                                    if (var22 != null) {
                                        class232 var23 = class37.field703.method807(0, var22.method1072(4378));
                                        if (!var23.field3057 || class646.field9195) {
                                            int var24 = var23.field3070;
                                            if (var23.field3094 != null) {
                                                for (int var25 = 0; var23.field3094.length > var25; ++var25) {
                                                    if (~var23.field3094[var25] != 0) {
                                                        class232 var26 = class37.field703.method807(0, var23.field3094[var25]);
                                                        if (~var26.field3070 <= -1) {
                                                            var24 = var26.field3070;
                                                        }
                                                    }
                                                }
                                            }
                                            if (~var24 <= -1) {
                                                boolean var27 = false;
                                                if (~var24 <= -1) {
                                                    class289 var28 = class455.field6408.method3816(-103, var24);
                                                    if (var28 != null && var28.field3897) {
                                                        var27 = true;
                                                    }
                                                }
                                                int var29 = var14;
                                                int var30 = var20;
                                                if (var27) {
                                                    int[][] var31 = class349.field4642[var21].field4979;
                                                    int var32 = class349.field4642[var21].field4978;
                                                    int var33 = class349.field4642[var21].field4975;
                                                    for (int var34 = 0; var34 < 10; ++var34) {
                                                        int var35 = (int) (4.0D * Math.random());
                                                        if (~var35 == -1 && var3 < var29 && ~var29 < ~(var14 + -3) && (var31[var29 + -1 + -var32][-var33 + var30] & 2883848) == 0) {
                                                            --var29;
                                                        }
                                                        if (var35 == 1 && ~var29 > ~(var3 + 104 - 1) && var14 + 3 > var29 && ~(2883968 & var31[-var32 + var29 + 1][var30 - var33]) == -1) {
                                                            ++var29;
                                                        }
                                                        if (var35 == 2 && ~var30 < ~var4 && var30 > var20 + -3 && (2883842 & var31[-var32 + var29][var30 + -1 + -var33]) == 0) {
                                                            --var30;
                                                        }
                                                        if (~var35 == -4 && var4 + 104 - 1 > var30 && var20 + 3 > var30 && ~(2883872 & var31[-var32 + var29][var30 + 1 + -var33]) == -1) {
                                                            ++var30;
                                                        }
                                                    }
                                                }
                                                class86.field1220[class261.field3597] = var23.field3056;
                                                class79.field1155[class261.field3597] = var29;
                                                class12.field207[class261.field3597] = var30;
                                                ++class261.field3597;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class479.field6715 != null) {
                        class474.field6631.field9597 = 1;
                        class455.field6408.method3815(1024, 64, arg1 ^ 18755);
                        for (int var15 = 0; ~var15 > ~class479.field6715.field1154; ++var15) {
                            int var16 = class479.field6715.field1156[var15];
                            if (var16 >> 28 == class206.field2472.field532) {
                                int var17 = ((var16 & 268421598) >> 14) + -class36.field689;
                                int var18 = (var16 & 16383) + -class88.field1239;
                                if (~var17 <= -1 && class473.field6604 > var17 && var18 >= 0 && ~class205.field2465 < ~var18) {
                                    class432.field6196.method1129(new class556(var15), 262144);
                                } else {
                                    class289 var19 = class455.field6408.method3816(46, class479.field6715.field1157[var15]);
                                    if (var19.field3922 != null && ~(var19.field3901 + var17) <= -1 && var19.field3927 + var17 < class473.field6604 && var19.field3914 + var18 >= 0 && var19.field3893 + var18 < class205.field2465) {
                                        class432.field6196.method1129(new class556(var15), arg1 ^ -294740);
                                    }
                                }
                            }
                        }
                        class455.field6408.method3815(128, 64, -13841);
                        class474.field6631.field9597 = 2;
                        class474.field6631.method3785((byte) -52);
                    }
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(ILec;)I")
    public static final int method2630(int arg0, class213 arg1) {
        ++field6322;
        if (~arg1.field2616 == -1) {
            return 0;
        } else {
            if (arg1.field2628 != -1) {
                class213 var2 = null;
                if (~arg1.field2628 <= -32769) {
                    if (~arg1.field2628 <= -32769) {
                        var2 = class184.field2252[arg1.field2628 + -32768];
                    }
                } else {
                    class633 var3 = (class633) class522.field7662.method3678((long) arg1.field2628, -120);
                    if (var3 != null) {
                        var2 = var3.field9097;
                    }
                }
                if (var2 != null) {
                    int var4 = -var2.field530 + arg1.field530;
                    int var5 = -var2.field531 + arg1.field531;
                    if (var4 != 0 || var5 != 0) {
                        arg1.method1295(-1, 16383 & (int) (2607.5945876176133D * Math.atan2((double) var4, (double) var5)));
                    }
                }
            }
            if (arg1 instanceof class613) {
                class613 var6 = (class613) arg1;
                if (var6.field8796 != -1 && (~var6.field2683 == -1 || var6.field2688 > 0)) {
                    var6.method1295(-1, var6.field8796);
                    var6.field8796 = -1;
                }
            } else if (arg1 instanceof class557) {
                class557 var7 = (class557) arg1;
                if (~var7.field8046 != 0 && (~var7.field2683 == -1 || var7.field2688 > 0)) {
                    int var8 = -((-class36.field689 + var7.field8046 + -class36.field689) * 256) + var7.field530;
                    int var9 = var7.field531 - (var7.field8063 - (class88.field1239 - -class88.field1239)) * 256;
                    if (~var8 != -1 || ~var9 != -1) {
                        var7.method1295(-1, 16383 & (int) (Math.atan2((double) var8, (double) var9) * 2607.5945876176133D));
                    }
                    var7.field8046 = -1;
                }
            }
            if (arg0 >= -72) {
                field6320 = null;
            }
            return arg1.method1292(1729168142);
        }
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "()V")
    public class445() {
        super(1, true);
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(II)[I")
    public final int[] method359(int arg0, int arg1) {
        ++field6324;
        int[] var3 = super.field5140.method1564(arg0, true);
        int var4 = -55 % ((13 - arg1) / 40);
        if (super.field5140.field3482) {
            int[][] var5 = this.method2211(arg0, 0, -101);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            for (int var9 = 0; ~var9 > ~class599.field8643; ++var9) {
                var3[var9] = (var6[var9] + var8[var9] + var7[var9]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIILr;Ln;)V")
    public static final void method2631(int arg0, int arg1, int arg2, class165 arg3, class17 arg4) {
        ++field6323;
        class616 var5 = arg4.method192(arg3, (byte) 99);
        if (var5 != null) {
            arg3.method292(arg1, arg0, arg4.field414 + arg1, arg4.field402 + arg0);
            if (~class301.field4043 != -3 && class301.field4043 != 5 && class524.field7695 != null) {
                int var6;
                int var7;
                int var8;
                int var9;
                if (class586.field8507 != 4) {
                    var6 = class206.field2472.field530;
                    var7 = -(class680.field9743 * 16) + 4096;
                    var8 = (int) (-class115.field1495) + class186.field2277 & 16383;
                    var9 = class206.field2472.field531;
                } else {
                    var9 = class271.field3695;
                    var7 = 4096;
                    var6 = class394.field5560;
                    var8 = 16383 & (int) (-class115.field1495);
                }
                int var10 = var6 / 128 + -(class473.field6604 * 2) + 208 + 48;
                int var11 = class205.field2465 * 4 + 48 - (var9 / 128 - -(class205.field2465 * 2)) - -208;
                class524.field7695.method3930((float) arg4.field414 / 2.0F + (float) arg1, (float) arg4.field402 / 2.0F + (float) arg0, (float) var10, (float) var11, var7, var8 << 2, var5, arg1, arg0);
                for (class556 var12 = (class556) class432.field6196.method1132((byte) 100); var12 != null; var12 = (class556) class432.field6196.method1134(arg2 + 8318)) {
                    int var58 = var12.field8043;
                    int var59 = (16383 & class479.field6715.field1156[var58] >> 14) + -class36.field689;
                    int var60 = (class479.field6715.field1156[var58] & 16383) + -class88.field1239;
                    int var61 = var59 * 4 + 2 + -(var6 / 128);
                    int var62 = var60 * 4 + -(var9 / 128) + 2;
                    class662.method3745(var62, arg0, class479.field6715.field1157[var58], arg2 ^ 130, var5, var61, arg3, arg1, arg4);
                }
                for (int var13 = 0; class261.field3597 > var13; ++var13) {
                    int var55 = class79.field1155[var13] * 4 + 2 + -(var6 / 128);
                    int var56 = class12.field207[var13] * 4 + -(var9 / 128) + 2;
                    class232 var57 = class37.field703.method807(0, class86.field1220[var13]);
                    if (var57.field3094 != null) {
                        var57 = var57.method1412(72, class410.field5804);
                        if (var57 == null || ~var57.field3070 == 0) {
                            continue;
                        }
                    }
                    class662.method3745(var56, arg0, var57.field3070, 2, var5, var55, arg3, arg1, arg4);
                }
                for (class507 var14 = (class507) class475.field6655.method3669((byte) 28); var14 != null; var14 = (class507) class475.field6655.method3676((byte) -12)) {
                    int var50 = (int) (var14.field7519 >> 28 & 3L);
                    if (class172.field2099 == var50) {
                        int var51 = (int) (var14.field7519 & 16383L) + -class36.field689;
                        int var52 = -class88.field1239 + (int) (16383L & var14.field7519 >> 14);
                        int var53 = var51 * 4 - -2 + -(var6 / 128);
                        int var54 = var52 * 4 - var9 / 128 + 2;
                        class86.method685(class493.field6894[0], arg1, arg4, var54, var53, var5, (byte) -92, arg0);
                    }
                }
                for (int var15 = 0; class99.field1332 > var15; ++var15) {
                    class633 var45 = (class633) class522.field7662.method3678((long) class600.field8658[var15], arg2 ^ -254);
                    if (var45 != null) {
                        class557 var46 = var45.field9097;
                        if (var46.method3258((byte) -111) && class206.field2472.field532 == var46.field532) {
                            class323 var47 = var46.field8052;
                            if (var47 != null && var47.field4315 != null) {
                                var47 = var47.method1881(class410.field5804, (byte) -8);
                            }
                            if (var47 != null && var47.field4306 && var47.field4299) {
                                int var48 = var46.field530 / 128 + -(var6 / 128);
                                int var49 = var46.field531 / 128 + -(var9 / 128);
                                if (var47.field4316 == -1) {
                                    class86.method685(class493.field6894[1], arg1, arg4, var49, var48, var5, (byte) -92, arg0);
                                } else {
                                    class662.method3745(var49, arg0, var47.field4316, 2, var5, var48, arg3, arg1, arg4);
                                }
                            }
                        }
                    }
                }
                int var16 = class394.field5564;
                int[] var17 = class82.field1176;
                for (int var18 = 0; var18 < var16; ++var18) {
                    class613 var37 = class184.field2252[var17[var18]];
                    if (var37 != null && var37.method3514((byte) -126) && !var37.field8795 && class206.field2472 != var37 && ~class206.field2472.field532 == ~var37.field532) {
                        int var38 = var37.field530 / 128 + -(var6 / 128);
                        int var39 = var37.field531 / 128 + -(var9 / 128);
                        boolean var40 = false;
                        for (int var41 = 0; var41 < class700.field9897; ++var41) {
                            if (var37.field8801.equals(class529.field7730[var41]) && class318.field4208[var41] != 0) {
                                var40 = true;
                                break;
                            }
                        }
                        boolean var42 = false;
                        for (int var43 = 0; class246.field3378 > var43; ++var43) {
                            if (var37.field8801.equals(class642.field9171[var43].field1065)) {
                                var42 = true;
                                break;
                            }
                        }
                        boolean var44 = false;
                        if (~class206.field2472.field8792 != -1 && ~var37.field8792 != -1 && ~class206.field2472.field8792 == ~var37.field8792) {
                            var44 = true;
                        }
                        if (var37.field8782) {
                            class86.method685(class493.field6894[6], arg1, arg4, var39, var38, var5, (byte) -92, arg0);
                        } else if (var40) {
                            class86.method685(class493.field6894[3], arg1, arg4, var39, var38, var5, (byte) -92, arg0);
                        } else if (var42) {
                            class86.method685(class493.field6894[5], arg1, arg4, var39, var38, var5, (byte) -92, arg0);
                        } else if (!var44) {
                            class86.method685(class493.field6894[2], arg1, arg4, var39, var38, var5, (byte) -92, arg0);
                        } else {
                            class86.method685(class493.field6894[4], arg1, arg4, var39, var38, var5, (byte) -92, arg0);
                        }
                    }
                }
                class341[] var19 = class631.field9068;
                for (int var20 = 0; ~var19.length < ~var20; ++var20) {
                    class341 var23 = var19[var20];
                    if (var23 != null && ~var23.field4508 != -1 && class543.field7882 % 20 < 10) {
                        if (~var23.field4508 == -2) {
                            class633 var24 = (class633) class522.field7662.method3678((long) var23.field4513, -120);
                            if (var24 != null) {
                                class557 var25 = var24.field9097;
                                int var26 = var25.field530 / 128 + -(var6 / 128);
                                int var27 = var25.field531 / 128 + -(var9 / 128);
                                class193.method1184(360000L, var5, var27, arg1, arg0, arg4, var26, (byte) 3, var23.field4510);
                            }
                        }
                        if (var23.field4508 == 2) {
                            int var28 = var23.field4504 / 128 + -(var6 / 128);
                            int var29 = var23.field4506 / 128 + -(var9 / 128);
                            long var30 = (long) (var23.field4509 << 7);
                            long var32 = var30 * var30;
                            class193.method1184(var32, var5, var29, arg1, arg0, arg4, var28, (byte) 3, var23.field4510);
                        }
                        if (~var23.field4508 == -11 && var23.field4513 >= 0 && class184.field2252.length > var23.field4513) {
                            class613 var34 = class184.field2252[var23.field4513];
                            if (var34 != null) {
                                int var35 = var34.field530 / 128 + -(var6 / 128);
                                int var36 = var34.field531 / 128 - var9 / 128;
                                class193.method1184(360000L, var5, var36, arg1, arg0, arg4, var35, (byte) 3, var23.field4510);
                            }
                        }
                    }
                }
                if (class586.field8507 != 4) {
                    if (class432.field6201 != 0) {
                        int var21 = class432.field6201 * 4 + -(var6 / 128) - (-2 - 2 * (-1 + class206.field2472.method1284((byte) -124)));
                        int var22 = -(var9 / 128) + class147.field1798 * 4 + 2 + -2 + class206.field2472.method1284((byte) -124) * 2;
                        class86.method685(class335.field4459[class276.field3775 ? 1 : 0], arg1, arg4, var22, var21, var5, (byte) -92, arg0);
                    }
                    if (!class206.field2472.field8795) {
                        arg3.method1042(arg1 - -(arg4.field414 / 2) + -1, 3, 1, arg4.field402 / 2 + arg0 - 1, -1, 3);
                    }
                }
            } else {
                arg3.method245(-16777216, var5, arg1, arg0);
            }
            if (arg2 != 128) {
                field6320 = null;
            }
        }
    }

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "(I)V")
    public static void method2632(int arg0) {
        if (arg0 < 70) {
            field6325 = false;
        }
        field6319 = null;
        field6320 = null;
        field6318 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2633(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
