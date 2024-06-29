import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class441 extends class380 {

    @OriginalMember(owner = "client!os", name = "K", descriptor = "I")
    public int field6392 = -1;

    @OriginalMember(owner = "client!os", name = "Q", descriptor = "I")
    public int field6398 = 0;

    @OriginalMember(owner = "client!os", name = "bb", descriptor = "Z")
    private boolean field6409 = false;

    @OriginalMember(owner = "client!os", name = "X", descriptor = "I")
    private int field6405 = 0;

    @OriginalMember(owner = "client!os", name = "O", descriptor = "I")
    public int field6396 = -1;

    @OriginalMember(owner = "client!os", name = "V", descriptor = "Ldh;")
    public static class320 field6403 = new class320(79, -1);

    @OriginalMember(owner = "client!os", name = "I", descriptor = "I")
    public static int field6391;

    @OriginalMember(owner = "client!os", name = "L", descriptor = "I")
    public static int field6393;

    @OriginalMember(owner = "client!os", name = "M", descriptor = "I")
    public static int field6394;

    @OriginalMember(owner = "client!os", name = "N", descriptor = "I")
    public static int field6395;

    @OriginalMember(owner = "client!os", name = "P", descriptor = "I")
    public static int field6397;

    @OriginalMember(owner = "client!os", name = "R", descriptor = "I")
    public static int field6399;

    @OriginalMember(owner = "client!os", name = "S", descriptor = "I")
    public static int field6400;

    @OriginalMember(owner = "client!os", name = "U", descriptor = "I")
    public int field6402;

    @OriginalMember(owner = "client!os", name = "W", descriptor = "I")
    public static int field6404;

    @OriginalMember(owner = "client!os", name = "Y", descriptor = "I")
    public int field6406;

    @OriginalMember(owner = "client!os", name = "Z", descriptor = "I")
    public static int field6407;

    @OriginalMember(owner = "client!os", name = "ab", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!os", name = "cb", descriptor = "I")
    public int field6410;

    @OriginalMember(owner = "client!os", name = "db", descriptor = "I")
    public static int field6411;

    @OriginalMember(owner = "client!os", name = "eb", descriptor = "I")
    public static int field6412;

    @OriginalMember(owner = "client!os", name = "fb", descriptor = "I")
    public static int field6413;

    @OriginalMember(owner = "client!os", name = "gb", descriptor = "I")
    public int field6414;

    @OriginalMember(owner = "client!os", name = "T", descriptor = "Loh;")
    public static class404 field6401;

    @OriginalMember(owner = "client!os", name = "f", descriptor = "(I)I")
    public final int method985(int arg0) {
        if (arg0 != 4) {
            return 70;
        } else {
            ++field6400;
            return -10;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIILha;)V")
    public static final void method2745(int arg0, int arg1, int arg2, class58 arg3) {
        ++field6394;
        if (arg2 >= ~arg0 && ~arg1 <= -1 && ~class643.field9205 != -1 && class497.field7021 != 0) {
            int var4;
            int var5;
            int var6;
            int var7;
            class165 var8;
            int var9;
            int var10;
            if (!class397.field5443) {
                arg3.method400(class443.field6425, class147.field1640, class643.field9205, class497.field7021);
                var4 = class643.field9205;
                var5 = class147.field1640;
                var6 = class443.field6425;
                var7 = class497.field7021;
                arg3.method432(class3.field20, class252.field3041, class643.field9205, class497.field7021);
                var8 = arg3.method352();
                var8.method1018(class686.field9683, class211.field2487, class291.field3582, class699.field9840, class342.field4439, class80.field839);
                var9 = arg0;
                arg3.method339(var8);
                var10 = arg1;
            } else {
                class367.method2144(512, false);
                var8 = arg3.method414();
                int[] var11 = arg3.method327();
                var4 = var11[2];
                var6 = var11[0];
                var5 = var11[1];
                var7 = var11[3];
                var9 = arg0 - -class668.method3793(false, 11468);
                var10 = arg1 - -class624.method3577((byte) 118, false);
            }
            if (~var7 == -1) {
                var7 = 1;
            }
            if (var4 == 0) {
                var4 = 1;
            }
            class496.method2960(-30022, true);
            if (class11.field88 != null && (!class568.field8075 || (64 & class12.field96) != 0)) {
                int var12 = -1;
                int var13 = -1;
                int var14 = arg3.method320();
                int var15 = arg3.method435();
                int var16;
                int var17;
                int var18;
                int var19;
                if (!class626.field8994) {
                    var16 = (-var5 + var10) * var15 / var7;
                    var17 = (-var6 + var9) * var15 / var4;
                    var18 = (-var5 + var10) * var14 / var7;
                    var19 = (-var6 + var9) * var14 / var4;
                } else {
                    var19 = var17 = (-var6 + var9) * class586.field8268 / var4;
                    var18 = var16 = (-var5 + var10) * class586.field8268 / var7;
                }
                int[] var20 = new int[] { var19, var18, var14 };
                var8.method1027(var20);
                int[] var21 = new int[] { var17, var16, var15 };
                var8.method1027(var21);
                float var22 = class604.method3432(4, (float) var21[1], (float) var21[2], (byte) 25, (float) var20[2], (float) var20[1], (float) var21[0], (float) var20[0]);
                if (var22 > 0.0F) {
                    int var23 = var21[0] + -var20[0];
                    int var24 = var21[2] + -var20[2];
                    int var25 = (int) ((float) var23 * var22 + (float) var20[0]);
                    int var26 = (int) ((float) var24 * var22 + (float) var20[2]);
                    var12 = (-1 + class90.field937.method1128(-1) << 8) + var25 >> 9;
                    var13 = (class90.field937.method1128(arg2) - 1 << 8) + var26 >> 9;
                    byte var27 = class90.field937.field4628;
                    if (var27 < 3 && (2 & class100.field1043[1][var25 >> 9][var26 >> 9]) != 0) {
                        int var87 = var27 + 1;
                    }
                }
                if (~var12 != 0 && ~var13 != 0) {
                    if (class568.field8075 && ~(class12.field96 & 64) != -1) {
                        class532 var28 = class689.method3895((byte) 123, class283.field3449, class620.field8886);
                        if (var28 != null) {
                            class723.method4030((long) (var13 | var12 << 0), true, -1, false, 0L, false, 6, class52.field548, var13, var12, true, class192.field2266, " ->");
                        } else {
                            class251.method1503((byte) 94);
                        }
                    } else {
                        if (class475.field6773) {
                            class723.method4030((long) (var13 | var12 << 0), true, -1, false, 0L, false, 22, class486.field6931.method2936(class489.field6978, 80), var13, var12, true, -1, "");
                        }
                        class723.method4030((long) (var13 | var12 << 0), true, -1, false, 0L, false, 15, class737.field10305, var13, var12, true, class154.field1701, "");
                        ++class262.field3245;
                    }
                }
            }
            if (class397.field5443) {
                class105.method719(false);
            }
            for (int var29 = 0; ~var29 > ~(!class397.field5443 ? 1 : 2); ++var29) {
                boolean var30 = var29 == 0;
                class710 var31 = !var30 ? class413.field5628 : class36.field387;
                int var32 = arg0;
                int var33 = arg1;
                if (class397.field5443) {
                    class367.method2144(arg2 ^ -513, var30);
                    var32 = arg0 + class668.method3793(var30, arg2 ^ -11469);
                    var33 = arg1 + class624.method3577((byte) 122, var30);
                }
                class454 var34 = var31.field9997;
                for (class547 var35 = (class547) var34.method2790(114); var35 != null; var35 = (class547) var34.method2794(arg2 ^ -122)) {
                    if ((class277.field3388 || class90.field937.field4628 == var35.field7866.field4628) && var35.method3219(6, var33, var32, arg3)) {
                        boolean var36 = false;
                        boolean var37 = false;
                        int var38;
                        int var39;
                        if (!(var35.field7866 instanceof class340)) {
                            var38 = var35.field7866.field4629 >> 9;
                            var39 = var35.field7866.field4635 >> 9;
                        } else {
                            var38 = ((class340) var35.field7866).field4387;
                            var39 = ((class340) var35.field7866).field4395;
                        }
                        if (var35.field7866 instanceof class183) {
                            class183 var40 = (class183) var35.field7866;
                            int var41 = var40.method1128(-1);
                            if (~(1 & var41) == -1 && ~(var40.field4635 & 511) == -1 && (511 & var40.field4629) == 0 || ~(1 & var41) == -2 && ~(var40.field4635 & 511) == -257 && (511 & var40.field4629) == 256) {
                                int var42 = var40.field4635 - (var40.method1128(-1) + -1 << 8);
                                int var43 = var40.field4629 - (var40.method1128(-1) - 1 << 8);
                                for (int var44 = 0; ~var44 > ~class302.field3784; ++var44) {
                                    class151 var51 = (class151) class253.field3052.method1754(false, (long) class272.field3359[var44]);
                                    if (var51 != null) {
                                        class197 var52 = var51.field1661;
                                        if (class392.field5398 != var52.field7111 && var52.field7108) {
                                            int var53 = var52.field4635 - (var52.field2293.field4227 + -1 << 8);
                                            int var54 = -(var52.field2293.field4227 - 1 << 8) + var52.field4629;
                                            if (~var42 >= ~var53 && ~var52.field2293.field4227 >= ~(var40.method1128(-1) - (var53 - var42 >> 9)) && ~var43 >= ~var54 && ~var52.field2293.field4227 >= ~(var40.method1128(arg2) - (-var43 + var54 >> 9))) {
                                                class77.method547((byte) -96, class90.field937.field4628 != var35.field7866.field4628, var52);
                                                var52.field7111 = class392.field5398;
                                            }
                                        }
                                    }
                                }
                                int var45 = class585.field8256;
                                int[] var46 = class399.field5459;
                                for (int var47 = 0; var45 > var47; ++var47) {
                                    class183 var48 = class75.field792[var46[var47]];
                                    if (var48 != null && ~class392.field5398 != ~var48.field7111 && var40 != var48 && var48.field7108) {
                                        int var49 = var48.field4635 - (-1 + var48.method1128(-1) << 8);
                                        int var50 = var48.field4629 + -(-1 + var48.method1128(arg2) << 8);
                                        if (var49 >= var42 && var48.method1128(-1) <= -(-var42 + var49 >> 9) + var40.method1128(-1) && var50 >= var43 && var48.method1128(-1) <= var40.method1128(arg2) - (-var43 + var50 >> 9)) {
                                            class646.method3685(~arg2, ~class90.field937.field4628 != ~var35.field7866.field4628, var48);
                                            var48.field7111 = class392.field5398;
                                        }
                                    }
                                }
                            }
                            if (~class392.field5398 == ~var40.field7111) {
                                continue;
                            }
                            class646.method3685(~arg2, class90.field937.field4628 != var35.field7866.field4628, var40);
                            var40.field7111 = class392.field5398;
                        }
                        if (var35.field7866 instanceof class197) {
                            class197 var55 = (class197) var35.field7866;
                            if (var55.field2293 != null) {
                                if ((1 & var55.field2293.field4227) == 0 && (511 & var55.field4635) == 0 && (511 & var55.field4629) == 0 || (1 & var55.field2293.field4227) == 1 && ~(var55.field4635 & 511) == -257 && ~(var55.field4629 & 511) == -257) {
                                    int var56 = var55.field4635 - (var55.field2293.field4227 + -1 << 8);
                                    int var57 = -(var55.field2293.field4227 + -1 << 8) + var55.field4629;
                                    for (int var58 = 0; var58 < class302.field3784; ++var58) {
                                        class151 var65 = (class151) class253.field3052.method1754(false, (long) class272.field3359[var58]);
                                        if (var65 != null) {
                                            class197 var66 = var65.field1661;
                                            if (class392.field5398 != var66.field7111 && var55 != var66 && var66.field7108) {
                                                int var67 = -(var66.field2293.field4227 + -1 << 8) + var66.field4635;
                                                int var68 = var66.field4629 - (var66.field2293.field4227 + -1 << 8);
                                                if (var56 <= var67 && var55.field2293.field4227 - (-var56 + var67 >> 9) >= var66.field2293.field4227 && var68 >= var57 && var66.field2293.field4227 <= -(-var57 + var68 >> 9) + var55.field2293.field4227) {
                                                    class77.method547((byte) -101, class90.field937.field4628 != var35.field7866.field4628, var66);
                                                    var66.field7111 = class392.field5398;
                                                }
                                            }
                                        }
                                    }
                                    int var59 = class585.field8256;
                                    int[] var60 = class399.field5459;
                                    for (int var61 = 0; ~var59 < ~var61; ++var61) {
                                        class183 var62 = class75.field792[var60[var61]];
                                        if (var62 != null && class392.field5398 != var62.field7111 && var62.field7108) {
                                            int var63 = var62.field4635 - (var62.method1128(-1) + -1 << 8);
                                            int var64 = var62.field4629 + -(var62.method1128(arg2) - 1 << 8);
                                            if (~var56 >= ~var63 && var62.method1128(arg2) <= var55.field2293.field4227 - (-var56 + var63 >> 9) && var64 >= var57 && ~var62.method1128(-1) >= ~(-(-var57 + var64 >> 9) + var55.field2293.field4227)) {
                                                class646.method3685(0, ~class90.field937.field4628 != ~var35.field7866.field4628, var62);
                                                var62.field7111 = class392.field5398;
                                            }
                                        }
                                    }
                                }
                                if (class392.field5398 == var55.field7111) {
                                    continue;
                                }
                                class77.method547((byte) -120, class90.field937.field4628 != var35.field7866.field4628, var55);
                                var55.field7111 = class392.field5398;
                            }
                        }
                        if (var35.field7866 instanceof class441) {
                            int var69 = class464.field6624 + var39;
                            int var70 = var38 - -class181.field2144;
                            class723 var71 = (class723) class450.field6490.method1754(false, (long) (var70 << 14 | var35.field7866.field4628 << 28 | var69));
                            if (var71 != null) {
                                int var72 = 0;
                                class602 var73 = (class602) var71.field10131.method1718(184887176);
                                while (var73 != null) {
                                    class431 var74 = class361.field4643.method912((byte) 1, var73.field8567);
                                    if (class568.field8075 && class90.field937.field4628 == var35.field7866.field4628) {
                                        class703 var75 = class262.field3260 != -1 ? class84.field884.method98(true, class262.field3260) : null;
                                        if ((1 & class12.field96) != 0 && (var75 == null || var74.method2710(0, class262.field3260, var75.field9906) != var75.field9906)) {
                                            ++class579.field8202;
                                            class723.method4030((long) var72, false, -1, false, (long) var73.field8567, false, 45, class52.field548, var38, var39, true, class192.field2266, class175.field2063 + " -> <col=ff9040>" + var74.field6294);
                                        }
                                    }
                                    if (class90.field937.field4628 == var35.field7866.field4628) {
                                        String[] var76 = var74.field6281;
                                        for (int var77 = 4; var77 >= 0; --var77) {
                                            if (var76 != null && var76[var77] != null) {
                                                byte var78 = 0;
                                                int var79 = class472.field6761;
                                                if (var77 == 0) {
                                                    var78 = 44;
                                                }
                                                if (var77 == 1) {
                                                    var78 = 51;
                                                }
                                                if (~var77 == -3) {
                                                    var78 = 25;
                                                }
                                                if (var77 == 3) {
                                                    var78 = 48;
                                                }
                                                if (~var74.field6268 == ~var77) {
                                                    var79 = var74.field6318;
                                                }
                                                if (~var77 == -5) {
                                                    var78 = 2;
                                                }
                                                if (~var74.field6326 == ~var77) {
                                                    var79 = var74.field6284;
                                                }
                                                ++class649.field9273;
                                                class723.method4030((long) var72, false, -1, false, (long) var73.field8567, false, var78, var76[var77], var38, var39, true, var79, "<col=ff9040>" + var74.field6294);
                                            }
                                        }
                                    }
                                    ++class92.field966;
                                    class723.method4030((long) var72, false, -1, class90.field937.field4628 != var35.field7866.field4628, (long) var73.field8567, false, 1010, class486.field6926.method2936(class489.field6978, 123), var38, var39, true, class634.field9125, "<col=ff9040>" + var74.field6294);
                                    var73 = (class602) var71.field10131.method1730(-1024);
                                    ++var72;
                                }
                            }
                        }
                        if (var35.field7866 instanceof class281) {
                            class281 var80 = (class281) var35.field7866;
                            class316 var81 = class445.field6442.method3972((byte) 123, var80.method1241((byte) 99));
                            if (var81.field4045 != null) {
                                var81 = var81.method1886(class722.field10125, -44);
                            }
                            if (var81 != null) {
                                if (class568.field8075 && class90.field937.field4628 == var35.field7866.field4628) {
                                    class703 var82 = class262.field3260 != -1 ? class84.field884.method98(true, class262.field3260) : null;
                                    if ((4 & class12.field96) != 0 && (var82 == null || var81.method1899(var82.field9906, class262.field3260, arg2 ^ 107) != var82.field9906)) {
                                        class723.method4030((long) var80.hashCode(), false, -1, false, class261.method1571(var38, var39, var80, (byte) 41), false, 50, class52.field548, var38, var39, true, class192.field2266, class175.field2063 + " -> <col=00ffff>" + var81.field3995);
                                        ++class469.field6701;
                                    }
                                }
                                if (~class90.field937.field4628 == ~var35.field7866.field4628) {
                                    String[] var83 = var81.field4013;
                                    if (var83 != null) {
                                        for (int var84 = 4; var84 >= 0; --var84) {
                                            if (var83[var84] != null) {
                                                short var85 = 0;
                                                if (var84 == 0) {
                                                    var85 = 20;
                                                }
                                                int var86 = class472.field6761;
                                                if (var84 == 1) {
                                                    var85 = 46;
                                                }
                                                if (var84 == 2) {
                                                    var85 = 10;
                                                }
                                                if (var84 == 3) {
                                                    var85 = 19;
                                                }
                                                if (~var81.field4010 == ~var84) {
                                                    var86 = var81.field3991;
                                                }
                                                if (~var84 == -5) {
                                                    var85 = 1009;
                                                }
                                                if (~var81.field4041 == ~var84) {
                                                    var86 = var81.field4038;
                                                }
                                                class723.method4030((long) var80.hashCode(), false, -1, false, class261.method1571(var38, var39, var80, (byte) 12), false, var85, var83[var84], var38, var39, true, var86, "<col=00ffff>" + var81.field3995);
                                                ++class222.field2553;
                                            }
                                        }
                                    }
                                    class723.method4030((long) var80.hashCode(), false, -1, class90.field937.field4628 != var35.field7866.field4628, (long) var81.field3962, false, 1003, class486.field6926.method2936(class489.field6978, 69), var38, var39, true, class634.field9125, "<col=00ffff>" + var81.field3995);
                                    ++class170.field1910;
                                }
                            }
                        }
                    }
                }
                if (class397.field5443) {
                    class105.method719(false);
                }
            }
            class496.method2960(arg2 + -30021, false);
        }
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(ILha;)Llca;")
    public final class642 method983(int arg0, class58 arg1) {
        if (arg0 != 0) {
            this.method995(-69, 52, (class58) null, -118);
        }
        ++field6393;
        return null;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lha;I)V")
    public final void method990(class58 arg0, int arg1) {
        ++field6391;
        int var3 = -73 / ((arg1 - -2) / 62);
    }

    @OriginalMember(owner = "client!os", name = "g", descriptor = "(I)Z")
    public final boolean method989(int arg0) {
        ++field6413;
        return arg0 >= -112 ? false : this.field6409;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(B)V")
    public static final void method2746(byte arg0) {
        if (arg0 != -104) {
            method2747(-111, 28, 71, -18, 50, -3, 93, -94, 20, 69);
        }
        class620 var1 = class529.field7530;
        synchronized (class529.field7530) {
            class529.field7530.method3541(-647);
        }
        ++field6408;
        class620 var2 = class132.field1443;
        synchronized (class132.field1443) {
            class132.field1443.method3541(-647);
        }
    }

    @OriginalMember(owner = "client!os", name = "c", descriptor = "(I)Z")
    public final boolean method986(int arg0) {
        int var2 = -97 / ((arg0 - -50) / 60);
        ++field6407;
        return false;
    }

    @OriginalMember(owner = "client!os", name = "e", descriptor = "(Z)I")
    public final int method992(boolean arg0) {
        if (arg0) {
            this.field6409 = false;
        }
        ++field6399;
        return this.field6405;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(BLha;)Llba;")
    public final class547 method994(byte arg0, class58 arg1) {
        ++field6411;
        class398 var3 = class624.method3576(super.field4628, super.field4635 >> class748.field10430, super.field4629 >> class748.field10430);
        if (var3 != null && var3.field5449.field4385) {
            int var4 = var3.field5449.method985(arg0 + 116);
            if (~this.field6398 != ~var4) {
                super.field4627 -= this.field6398;
                super.field4627 += var4;
                this.field6398 = var4;
            }
        }
        class165 var5 = arg1.method422();
        var5.method1026();
        if (var3 == null || !var3.field5449.field4385) {
            boolean var6 = false;
            boolean var7 = false;
            boolean var8 = false;
            class278 var9 = class504.field7120[super.field4633];
            int var10 = this.field6405 << 1;
            int var12 = -var10 / 2;
            int var13 = -var10 / 2;
            int var14 = var9.method1675(super.field4629 + var13, super.field4635 + var12, 65286);
            int var15 = var10 / 2;
            int var16 = -var10 / 2;
            int var17 = var9.method1675(super.field4629 + var16, super.field4635 + var15, 65286);
            int var18 = -var10 / 2;
            int var19 = var10 / 2;
            int var20 = var9.method1675(super.field4629 + var19, super.field4635 + var18, 65286);
            int var21 = var10 / 2;
            int var22 = var10 / 2;
            int var23 = var9.method1675(super.field4629 + var22, super.field4635 + var21, arg0 ^ -65386);
            int var24 = ~var14 > ~var17 ? var14 : var17;
            int var25 = ~var20 <= ~var23 ? var23 : var20;
            int var26 = ~var17 <= ~var23 ? var23 : var17;
            if (var10 != 0) {
                int var27 = (int) (Math.atan2((double) (-var25 + var24), (double) var10) * 2607.5945876176133D) & 16383;
                if (~var27 != -1) {
                    var5.method1025(var27);
                }
            }
            int var28 = var20 > var14 ? var14 : var20;
            int var29 = var14 + var23;
            if (~var10 != -1) {
                int var30 = 16383 & (int) (2607.5945876176133D * Math.atan2((double) (-var26 + var28), (double) var10));
                if (~var30 != -1) {
                    var5.method1032(-var30);
                }
            }
            if (~var29 < ~(var17 - -var20)) {
                var29 = var17 - -var20;
            }
            int var31 = (var29 >> 1) - super.field4627;
            if (var31 != 0) {
                var5.method1033(0, var31, 0);
            }
        }
        var5.method1033(super.field4635, super.field4627 + -10, super.field4629);
        class547 var32 = class652.method3702(true, -9477, 3);
        this.field6405 = 0;
        this.field6409 = false;
        if (arg0 != -112) {
            this.field6392 = 108;
        }
        if (this.field6396 != -1) {
            class470 var33 = class361.field4643.method912((byte) 1, this.field6396).method2696(0, -1, this.field6402, (class25) null, arg1, (class429) null, 0, 2048, (byte) -14);
            if (var33 != null) {
                if (class626.field8994) {
                    var33.method188(var5, var32.field7870[2], class586.field8268, 0);
                } else {
                    var33.method228(var5, var32.field7870[2], 0);
                }
                this.field6409 |= var33.method197();
                this.field6405 = var33.method217();
            }
        }
        if (~this.field6392 != 0) {
            class470 var34 = class361.field4643.method912((byte) 1, this.field6392).method2696(0, -1, this.field6406, (class25) null, arg1, (class429) null, 0, 2048, (byte) -14);
            if (var34 != null) {
                if (class626.field8994) {
                    var34.method188(var5, var32.field7870[1], class586.field8268, 0);
                } else {
                    var34.method228(var5, var32.field7870[1], 0);
                }
                this.field6409 |= var34.method197();
                if (var34.method217() > this.field6405) {
                    this.field6405 = var34.method217();
                }
            }
        }
        class470 var35 = class361.field4643.method912((byte) 1, this.field6410).method2696(0, -1, this.field6414, (class25) null, arg1, (class429) null, 0, 2048, (byte) -14);
        if (var35 != null) {
            if (class626.field8994) {
                var35.method188(var5, var32.field7870[0], class586.field8268, 0);
            } else {
                var35.method228(var5, var32.field7870[0], 0);
            }
            this.field6409 |= var35.method197();
            if (~var35.method217() < ~this.field6405) {
                this.field6405 = var35.method217();
            }
        }
        return var32;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method2747(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 != 431207980) {
            field6403 = null;
        }
        ++field6395;
        if (~arg6 == ~arg9 && arg4 == arg8 && ~arg2 == ~arg5 && ~arg3 == ~arg7) {
            class619.method3533((byte) 75, arg6, arg1, arg3, arg5, arg8);
        } else {
            int var10 = arg6;
            int var11 = arg8;
            int var12 = arg6 * 3;
            int var13 = arg8 * 3;
            int var14 = arg9 * 3;
            int var15 = arg4 * 3;
            int var16 = arg2 * 3;
            int var17 = arg7 * 3;
            int var18 = -arg6 + var14 + arg5 + -var16;
            int var19 = -arg8 + -var17 + arg3 - -var15;
            int var20 = -var14 + var16 - (var14 - var12);
            int var21 = -var15 + -var15 + var13 + var17;
            int var22 = -var12 + var14;
            int var23 = -var13 + var15;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = arg6 - -(var27 - -var29 + var31 >> 12);
                int var34 = (var28 - (-var30 - var32) >> 12) + arg8;
                class619.method3533((byte) 75, var10, arg1, var34, var33, var11);
                var10 = var33;
                var11 = var34;
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "d", descriptor = "(Z)I")
    public final int method1177(boolean arg0) {
        ++field6397;
        class431 var2 = class361.field4643.method912((byte) 1, this.field6410);
        int var3 = var2.field6327;
        if (this.field6392 != -1) {
            class431 var4 = class361.field4643.method912((byte) 1, this.field6392);
            if (var4.field6327 > var3) {
                var3 = var4.field6327;
            }
        }
        if (!arg0) {
            this.field6392 = 0;
        }
        if (this.field6396 != -1) {
            class431 var5 = class361.field4643.method912((byte) 1, this.field6396);
            if (var3 < var5.field6327) {
                var3 = var5.field6327;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!os", name = "j", descriptor = "(I)V")
    public static void method2748(int arg0) {
        if (arg0 != -13964) {
            method2749(58, false, (class424) null, false);
        }
        field6403 = null;
        field6401 = null;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IILha;I)Z")
    public final boolean method995(int arg0, int arg1, class58 arg2, int arg3) {
        ++field6404;
        class165 var5 = arg2.method422();
        var5.method1019(super.field4635, super.field4627 + -10, super.field4629);
        class431 var6 = class361.field4643.method912((byte) 1, this.field6410);
        class470 var7 = var6.method2696(0, -1, this.field6414, (class25) null, arg2, (class429) null, 0, 131072, (byte) -14);
        if (var7 != null && (class626.field8994 ? var7.method191(arg0, arg1, var5, true, var6.field6327, class586.field8268) : var7.method227(arg0, arg1, var5, true, var6.field6327))) {
            return true;
        } else {
            if (this.field6392 != -1) {
                class431 var8 = class361.field4643.method912((byte) 1, this.field6392);
                class470 var9 = var8.method2696(0, -1, this.field6406, (class25) null, arg2, (class429) null, 0, 131072, (byte) -14);
                if (var9 != null && (class626.field8994 ? var9.method191(arg0, arg1, var5, true, var8.field6327, class586.field8268) : var9.method227(arg0, arg1, var5, true, var8.field6327))) {
                    return true;
                }
            }
            if (this.field6396 != arg3) {
                class431 var10 = class361.field4643.method912((byte) 1, this.field6396);
                class470 var11 = var10.method2696(0, -1, this.field6402, (class25) null, arg2, (class429) null, 0, 131072, (byte) -14);
                if (var11 != null && (class626.field8994 ? var11.method191(arg0, arg1, var5, true, var10.field6327, class586.field8268) : var11.method227(arg0, arg1, var5, true, var10.field6327))) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IZLwg;Z)V")
    public static final void method2749(int arg0, boolean arg1, class424 arg2, boolean arg3) {
        ++field6412;
        int var4 = arg2.field6159;
        int var5 = (int) arg2.field1522;
        arg2.method864(12983);
        if (arg1) {
            class451.method2777(var4, (byte) -18);
        }
        class165.method1034(var4, -17029);
        class532 var6 = class269.method1608((byte) -72, var5);
        if (var6 != null) {
            class11.method50(var6, (byte) -127);
        }
        class688.method3893(1);
        if (!arg3 && ~class327.field4245 != 0) {
            class600.method3415(class327.field4245, 64, 1);
        }
        class215 var7 = new class215(class153.field1688);
        for (class424 var8 = (class424) var7.method1262(arg0 ^ arg0); var8 != null; var8 = (class424) var7.method1264(126)) {
            if (!var8.method863(85)) {
                var8 = (class424) var7.method1262(arg0);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field6158 == 3) {
                int var9 = (int) var8.field1522;
                if (var9 >>> 16 == var4) {
                    method2749(0, true, var8, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(IIIII)V")
    public class441(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
    }
}
