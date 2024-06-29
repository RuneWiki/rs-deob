import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class48 extends class270 {

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "I")
    private int field768 = 0;

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "[S")
    private short[] field771 = new short[257];

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "Lce;")
    public static class345 field778 = new class345(64);

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "Ljh;")
    public static class444 field782 = new class444(5000);

    @OriginalMember(owner = "client!ha", name = "G", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!ha", name = "J", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!ha", name = "N", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!ha", name = "O", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!ha", name = "S", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "Ldp;")
    public static class174 field783;

    @OriginalMember(owner = "client!ha", name = "W", descriptor = "Lmr;")
    public static class84 field781;

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "[I")
    private int[] field779;

    @OriginalMember(owner = "client!ha", name = "V", descriptor = "[I")
    private int[] field780;

    @OriginalMember(owner = "client!ha", name = "R", descriptor = "[[I")
    private int[][] field776;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(B)V", line = 3)
    private final void method383(byte arg0) {
        ++field772;
        int[] var2 = this.field776[0];
        int[] var3 = this.field776[1];
        int[] var4 = this.field776[this.field776.length - 2];
        if (arg0 != -76) {
            this.method81((byte) 20, -119);
        }
        int[] var5 = this.field776[this.field776.length + -1];
        this.field780 = new int[] { var4[0] + -var5[0] + var4[0], var4[1] + -var5[1] + var4[1] };
        this.field779 = new int[] { var2[0] - var3[0] - -var2[0], var2[1] + -var3[1] + var2[1] };
    }

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V", line = 24)
    private final void method384(int arg0) {
        ++field777;
        if (arg0 == -1) {
            int var2 = this.field768;
            if (~var2 != -3) {
                if (var2 == 1) {
                    for (int var3 = 0; ~var3 > -258; ++var3) {
                        int var4 = var3 << 4;
                        int var5;
                        for (var5 = 1; var5 < this.field776.length - 1 && ~var4 <= ~this.field776[var5][0]; ++var5) {
                        }
                        int[] var6 = this.field776[var5 + -1];
                        int[] var7 = this.field776[var5];
                        int var8 = (var4 - var6[0] << 12) / (var7[0] + -var6[0]);
                        int var9 = -class133.field2145[(8188 & var8) >> 5] + 4096 >> 1;
                        int var10 = -var9 + 4096;
                        int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                        if (var11 <= -32768) {
                            var11 = -32767;
                        }
                        if (~var11 <= -32769) {
                            var11 = 32767;
                        }
                        this.field771[var3] = (short) var11;
                    }
                } else {
                    for (int var12 = 0; ~var12 > -258; ++var12) {
                        int var13 = var12 << 4;
                        int var14;
                        for (var14 = 1; ~(this.field776.length - 1) < ~var14 && var13 >= this.field776[var14][0]; ++var14) {
                        }
                        int[] var15 = this.field776[var14 + -1];
                        int[] var16 = this.field776[var14];
                        int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                        int var18 = -var17 + 4096;
                        int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                        if (~var19 >= 32767) {
                            var19 = -32767;
                        }
                        if (var19 >= 32768) {
                            var19 = 32767;
                        }
                        this.field771[var12] = (short) var19;
                    }
                }
            } else {
                for (int var20 = 0; var20 < 257; ++var20) {
                    int var21 = var20 << 4;
                    int var22;
                    for (var22 = 1; ~var22 > ~(this.field776.length - 1) && ~var21 <= ~this.field776[var22][0]; ++var22) {
                    }
                    int[] var23 = this.field776[var22 + -1];
                    int[] var24 = this.field776[var22];
                    int var25 = this.method385(var22 + -2, -127)[1];
                    int var26 = var23[1];
                    int var27 = var24[1];
                    int var28 = this.method385(var22 + 1, -128)[1];
                    int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                    int var30 = var29 * var29 >> 12;
                    int var31 = -var25 + -var27 + var26 + var28;
                    int var32 = var25 - var31 + -var26;
                    int var33 = -var25 + var27;
                    int var35 = (var29 * var31 >> 12) * var30 >> 12;
                    int var36 = var30 * var32 >> 12;
                    int var37 = var29 * var33 >> 12;
                    int var38 = var35 - (-var36 + -var37) + var26;
                    if (~var38 >= 32767) {
                        var38 = -32767;
                    }
                    if (~var38 <= -32769) {
                        var38 = 32767;
                    }
                    this.field771[var20] = (short) var38;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)[I", line = 202)
    private final int[] method385(int arg0, int arg1) {
        ++field774;
        if (arg1 >= -126) {
            return null;
        } else if (arg0 < 0) {
            return this.field779;
        } else {
            return arg0 >= this.field776.length ? this.field780 : this.field776[arg0];
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZIBI)Loq;", line = 220)
    public static final class120 method386(int arg0, boolean arg1, int arg2, byte arg3, int arg4) {
        ++field769;
        class120 var5 = new class120();
        var5.field1874 = arg2;
        var5.field1875 = arg0;
        class355.field5045.method1217(1, (long) arg4, var5);
        class237.method1730(122, arg2);
        class258 var6 = class342.method2207(arg4, (byte) 14);
        if (var6 != null) {
            class107.method947(true, var6);
        }
        if (class132.field2132 != null) {
            class107.method947(true, class132.field2132);
            class132.field2132 = null;
        }
        class46.method375(-96);
        if (arg3 <= 86) {
            method389(-94, (String) null);
        }
        if (var6 != null) {
            class360.method2307(var6, -1, !arg1);
        }
        if (!arg1) {
            class216.method1638(arg2);
        }
        if (!arg1 && class321.field4642 != -1) {
            class135.method1111((byte) -81, class321.field4642, 1);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BI)[I", line = 267)
    public final int[] method81(byte arg0, int arg1) {
        ++field767;
        int[] var3 = super.field4053.method396(arg1, 85);
        if (arg0 < 26) {
            this.method78((byte) -34, (class37) null, 125);
        }
        if (super.field4053.field815) {
            int[] var4 = this.method1927(0, 0, arg1);
            for (int var5 = 0; class161.field2445 > var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field771[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V", line = 310)
    public static void method387(boolean arg0) {
        if (!arg0) {
            method389(5, (String) null);
        }
        field781 = null;
        field778 = null;
        field782 = null;
        field783 = null;
    }

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V", line = 327)
    public static final void method388(int arg0) {
        ++field773;
        if (~class234.field3387 < -2) {
            --class234.field3387;
            class175.field2609 = class341.field4845;
        }
        if (~class123.field1937 < -1) {
            --class123.field1937;
        }
        if (class61.field991) {
            class61.field991 = false;
            class44.method355((byte) 118);
        } else {
            if (!class84.field1365) {
                class388.method2457(0);
            }
            for (int var1 = 0; ~var1 > -101 && class390.method2473(true); ++var1) {
            }
            if (class240.field3463 == 30) {
                class214.method1628(230, -4, class13.field216);
                Object var2 = field781.field1363;
                synchronized (field781.field1363) {
                    if (!class132.field2128) {
                        field781.field1370 = 0;
                    } else if (~class60.field951 != -1 || ~field781.field1370 <= -41) {
                        class13.field216.method2781(false, 211);
                        ++class308.field4504;
                        class13.field216.method267(0, false);
                        int var3 = class13.field216.field565;
                        int var4 = 0;
                        for (int var5 = 0; ~field781.field1370 < ~var5 && -var3 + class13.field216.field565 < 240; ++var5) {
                            ++var4;
                            int var6 = field781.field1371[var5];
                            if (~var6 > -1) {
                                var6 = 0;
                            } else if (var6 > 65534) {
                                var6 = 65534;
                            }
                            int var7 = field781.field1372[var5];
                            if (~var7 > -1) {
                                var7 = 0;
                            } else if (~var7 < -65535) {
                                var7 = 65534;
                            }
                            boolean var8 = false;
                            if (field781.field1371[var5] == -1 && field781.field1372[var5] == -1) {
                                var8 = true;
                                var6 = -1;
                                var7 = -1;
                            }
                            if (class210.field3065 == var7 && ~class36.field508 == ~var6) {
                                if (~class33.field471 > -2048) {
                                    ++class33.field471;
                                }
                            } else {
                                int var9 = var7 - class210.field3065;
                                class210.field3065 = var7;
                                int var10 = -class36.field508 + var6;
                                class36.field508 = var6;
                                if (~class33.field471 > -9 && var9 >= -32 && ~var9 >= -32 && ~var10 <= 31 && var10 <= 31) {
                                    var10 += 32;
                                    var9 += 32;
                                    class13.field216.method324((class33.field471 << 12) + (var9 << 6) + var10, -52);
                                    class33.field471 = 0;
                                } else if (class33.field471 < 32 && ~var9 <= 127 && var9 <= 127 && ~var10 <= 127 && ~var10 >= -128) {
                                    var10 += 128;
                                    var9 += 128;
                                    class13.field216.method267(class33.field471 + 128, false);
                                    class13.field216.method324((var9 << 8) + var10, -66);
                                    class33.field471 = 0;
                                } else if (class33.field471 < 32) {
                                    class13.field216.method267(class33.field471 + 192, false);
                                    if (var8) {
                                        class13.field216.method275(Integer.MIN_VALUE, 1414495172);
                                    } else {
                                        class13.field216.method275(var7 | var6 << 16, 1414495172);
                                    }
                                    class33.field471 = 0;
                                } else {
                                    class13.field216.method324(class33.field471 + 57344, -109);
                                    if (var8) {
                                        class13.field216.method275(Integer.MIN_VALUE, 1414495172);
                                    } else {
                                        class13.field216.method275(var6 << 16 | var7, 1414495172);
                                    }
                                    class33.field471 = 0;
                                }
                            }
                        }
                        class13.field216.method287(class13.field216.field565 - var3, -63);
                        if (var4 >= field781.field1370) {
                            field781.field1370 = 0;
                        } else {
                            field781.field1370 -= var4;
                            for (int var11 = 0; field781.field1370 > var11; ++var11) {
                                field781.field1372[var11] = field781.field1372[var4 + var11];
                                field781.field1371[var11] = field781.field1371[var4 + var11];
                            }
                        }
                    }
                }
                if (class60.field951 != 0) {
                    long var12 = (-class292.field4341 + class338.field4823) / 50L;
                    class292.field4341 = class338.field4823;
                    if (~var12 < -32768L) {
                        var12 = 32767L;
                    }
                    int var14 = class78.field1320;
                    if (var14 >= 0) {
                        if (var14 > 65535) {
                            var14 = 65535;
                        }
                    } else {
                        var14 = 0;
                    }
                    int var15 = class62.field1000;
                    if (~var15 > -1) {
                        var15 = 0;
                    } else if (~var15 < -65536) {
                        var15 = 65535;
                    }
                    byte var16 = 0;
                    if (~class60.field951 == -3) {
                        var16 = 1;
                    }
                    ++class422.field6146;
                    class13.field216.method2781(false, 218);
                    int var17 = (int) var12;
                    class13.field216.method324(var16 << 15 | var17, -119);
                    class13.field216.method275(var14 << 16 | var15, 1414495172);
                }
                if (class322.field4655 > 0) {
                    --class322.field4655;
                }
                if (class206.field3020 && class322.field4655 <= 0) {
                    ++class109.field1782;
                    class322.field4655 = 20;
                    class206.field3020 = false;
                    class13.field216.method2781(false, 223);
                    class13.field216.method283((byte) 122, (int) class436.field6359 >> 3);
                    class13.field216.method319((int) class106.field1756 >> 3, (byte) -62);
                }
                if (class37.field533 && !class140.field2215) {
                    ++class399.field5872;
                    class140.field2215 = true;
                    class13.field216.method2781(false, 221);
                    class13.field216.method267(1, false);
                }
                if (!class37.field533 && class140.field2215) {
                    ++class399.field5872;
                    class140.field2215 = false;
                    class13.field216.method2781(false, 221);
                    class13.field216.method267(0, false);
                }
                if (!class196.field2870) {
                    class13.field216.method2781(false, 149);
                    ++class98.field1528;
                    class13.field216.method300(121, class16.method94(false));
                    class196.field2870 = true;
                }
                if (!class46.field750) {
                    class278.field4183 /= 2.0F;
                } else {
                    class46.field750 = false;
                }
                if (!class88.field1411) {
                    class247.field3586 /= 2.0F;
                } else {
                    class88.field1411 = false;
                }
                class239.method1746((byte) 48);
                if (~class240.field3463 == -31) {
                    class447.method2799(false);
                    class102.method846(-1);
                    class83.method642(1718570920);
                    ++class79.field1335;
                    if (class79.field1335 > 750) {
                        class44.method355((byte) 118);
                    } else if (arg0 <= -65) {
                        class102.method845(116);
                        class280.method1986((byte) 77);
                        class21.method140((byte) -127);
                        for (int var18 = class398.method2540(true, (byte) 124); var18 != -1; var18 = class398.method2540(false, (byte) -115)) {
                            class381.method2411(0, var18);
                            class188.field2787[class35.method254(class365.field5197++, 31)] = var18;
                        }
                        for (class221 var19 = class333.method2180((byte) -28); var19 != null; var19 = class333.method2180((byte) -28)) {
                            int var20 = var19.method1694((byte) -9);
                            int var21 = var19.method1691(true);
                            if (~var20 != -2) {
                                if (var20 != 2) {
                                    if (~var20 != -4) {
                                        if (~var20 == -5) {
                                            class258 var22 = class342.method2207(var21, (byte) 14);
                                            int var23 = var19.field3297;
                                            int var24 = var19.field3291;
                                            int var25 = var19.field3295;
                                            if (~var22.field3858 != ~var23 || ~var22.field3864 != ~var24 || var22.field3872 != var25) {
                                                var22.field3872 = var25;
                                                var22.field3858 = var23;
                                                var22.field3864 = var24;
                                                class107.method947(true, var22);
                                            }
                                        } else if (~var20 != -6) {
                                            if (~var20 != -7) {
                                                if (~var20 != -8) {
                                                    if (~var20 == -9) {
                                                        class258 var26 = class342.method2207(var21, (byte) 14);
                                                        if (~var19.field3297 != ~var26.field3771 || var19.field3291 != var26.field3889 || var19.field3295 != var26.field3888) {
                                                            var26.field3889 = var19.field3291;
                                                            var26.field3771 = var19.field3297;
                                                            var26.field3888 = var19.field3295;
                                                            if (var26.field3765 != -1) {
                                                                if (var26.field3819 > 0) {
                                                                    var26.field3888 = var26.field3888 * 32 / var26.field3819;
                                                                } else if (var26.field3905 > 0) {
                                                                    var26.field3888 = var26.field3888 * 32 / var26.field3905;
                                                                }
                                                            }
                                                            class107.method947(true, var26);
                                                        }
                                                    } else if (var20 != 9) {
                                                        if (var20 == 10) {
                                                            class258 var27 = class342.method2207(var21, (byte) 14);
                                                            if (var19.field3297 != var27.field3785 || ~var19.field3291 != ~var27.field3752 || ~var19.field3295 != ~var27.field3774) {
                                                                var27.field3774 = var19.field3295;
                                                                var27.field3752 = var19.field3291;
                                                                var27.field3785 = var19.field3297;
                                                                class107.method947(true, var27);
                                                            }
                                                        } else if (~var20 != -12) {
                                                            if (var20 == 12) {
                                                                class258 var28 = class342.method2207(var21, (byte) 14);
                                                                int var29 = var19.field3297;
                                                                if (var28 != null && ~var28.field3793 == -1) {
                                                                    if (var29 > -var28.field3758 + var28.field3882) {
                                                                        var29 = var28.field3882 - var28.field3758;
                                                                    }
                                                                    if (~var29 > -1) {
                                                                        var29 = 0;
                                                                    }
                                                                    if (~var28.field3900 != ~var29) {
                                                                        var28.field3900 = var29;
                                                                        class107.method947(true, var28);
                                                                    }
                                                                }
                                                            } else if (var20 == 13) {
                                                                class258 var30 = class342.method2207(var21, (byte) 14);
                                                                var30.field3806 = var19.field3297;
                                                            } else if (var20 != 14) {
                                                                if (var20 == 15) {
                                                                    class11.field136 = var19.field3291;
                                                                    class420.field6129 = true;
                                                                    class161.field2434 = var19.field3297;
                                                                }
                                                            } else {
                                                                class258 var31 = class342.method2207(var21, (byte) 14);
                                                                var31.field3810 = var19.field3297;
                                                            }
                                                        } else {
                                                            class258 var32 = class342.method2207(var21, (byte) 14);
                                                            var32.field3908 = var32.field3870 = var19.field3291;
                                                            var32.field3770 = 0;
                                                            var32.field3868 = 0;
                                                            var32.field3750 = var32.field3853 = var19.field3297;
                                                            class107.method947(true, var32);
                                                        }
                                                    } else {
                                                        class258 var33 = class342.method2207(var21, (byte) 14);
                                                        if (var19.field3297 != var33.field3765 || var19.field3291 != var33.field3743) {
                                                            var33.field3743 = var19.field3291;
                                                            var33.field3765 = var19.field3297;
                                                            class107.method947(true, var33);
                                                        }
                                                    }
                                                } else {
                                                    class258 var34 = class342.method2207(var21, (byte) 14);
                                                    boolean var35 = ~var19.field3297 == -2;
                                                    if (!var35 == var34.field3873) {
                                                        var34.field3873 = var35;
                                                        class107.method947(true, var34);
                                                    }
                                                }
                                            } else {
                                                int var36 = var19.field3297;
                                                int var37 = (var36 & 32181) >> 10;
                                                int var38 = var36 >> 5 & 31;
                                                int var39 = 31 & var36;
                                                int var40 = (var39 << 3) + (var37 << 19) + (var38 << 11);
                                                class258 var41 = class342.method2207(var21, (byte) 14);
                                                if (~var41.field3772 != ~var40) {
                                                    var41.field3772 = var40;
                                                    class107.method947(true, var41);
                                                }
                                            }
                                        } else {
                                            class258 var42 = class342.method2207(var21, (byte) 14);
                                            if (var19.field3297 != var42.field3828 || ~var19.field3297 == 0) {
                                                var42.field3894 = 0;
                                                var42.field3811 = 0;
                                                var42.field3731 = 1;
                                                var42.field3828 = var19.field3297;
                                                class107.method947(true, var42);
                                            }
                                        }
                                    } else {
                                        class258 var43 = class342.method2207(var21, (byte) 14);
                                        if (!var19.field3290.equals(var43.field3733)) {
                                            var43.field3733 = var19.field3290;
                                            class107.method947(true, var43);
                                        }
                                    }
                                } else {
                                    class425.field6183[var21] = var19.field3290;
                                    class282.field4222[class35.method254(31, class281.field4211++)] = var21;
                                }
                            } else {
                                class27.field401[var21] = var19.field3297;
                                class315.field4587 |= class102.field1590[var21];
                                class228.field3349[class35.method254(class205.field3009++, 31)] = var21;
                            }
                        }
                        if (class197.field2878 != 0) {
                            class342.field4848 += 20;
                            if (~class342.field4848 <= -401) {
                                class197.field2878 = 0;
                            }
                        }
                        ++class409.field5967;
                        if (class21.field318 != null) {
                            ++class228.field3345;
                            if (class228.field3345 >= 15) {
                                class107.method947(true, class21.field318);
                                class21.field318 = null;
                            }
                        }
                        class258 var44 = class183.field2714;
                        class258 var45 = class348.field4926;
                        class183.field2714 = null;
                        class282.field4229 = false;
                        class228.field3334 = 0;
                        class348.field4926 = null;
                        class135.field2162 = null;
                        class239.field3451 = false;
                        while (class85.method653(-1) && class228.field3334 < 128) {
                            if (!class192.method1481(true) || ~class292.field4334 != -97 && ~class292.field4334 != -168) {
                                class199.field2909[class228.field3334] = class382.field5464;
                                class441.field6405[class228.field3334] = class292.field4334;
                                ++class228.field3334;
                            } else if (class148.method1156(false)) {
                                class157.method1236((byte) 19);
                            } else {
                                class364.method2329((byte) -77);
                            }
                        }
                        if (class148.method1156(false)) {
                            class269.method1917(118);
                        }
                        class331.field4759 = null;
                        class379.method2406((class258) null, -1, (byte) -86, -1);
                        class258.method1861(-1, (class258) null, -1, 6);
                        if (~class321.field4642 != 0) {
                            class200.method1521(0, 0, 0, class113.field1819, class277.field4170, 0, class321.field4642, -25216);
                        }
                        ++class341.field4845;
                        if (class331.field4759 != null) {
                            class35.method255((byte) 52);
                        }
                        if (class237.field3418) {
                            class13.field216.method2781(false, 193);
                            ++class415.field6007;
                            class13.field216.method262(class361.field5148 | class257.field3724 << 14 | class350.field4967 << 28, 20241);
                            class237.field3418 = false;
                        }
                        while (true) {
                            class254 var46;
                            class258 var47;
                            class258 var48;
                            do {
                                var46 = (class254) class242.field3508.method150(0);
                                if (var46 == null) {
                                    while (true) {
                                        class254 var49;
                                        class258 var50;
                                        class258 var51;
                                        do {
                                            var49 = (class254) class18.field241.method150(0);
                                            if (var49 == null) {
                                                while (true) {
                                                    class254 var52;
                                                    class258 var53;
                                                    class258 var54;
                                                    do {
                                                        var52 = (class254) class182.field2688.method150(0);
                                                        if (var52 == null) {
                                                            if (class331.field4759 == null) {
                                                                class5.field34 = 0;
                                                            }
                                                            if (class273.field4109 != null) {
                                                                class244.method1777(24120);
                                                            }
                                                            if (~class289.field4315 < -1 && class33.field482[82] && class33.field482[81] && ~class282.field4228 != -1) {
                                                                int var55 = -class282.field4228 + class367.field5213;
                                                                if (var55 < 0) {
                                                                    var55 = 0;
                                                                } else if (var55 > 3) {
                                                                    var55 = 3;
                                                                }
                                                                class422.method2652(class86.field1394.field5694[0] + class379.field5384, 63, var55, class86.field1394.field5696[0] + class294.field4362);
                                                            }
                                                            class354.method2275((byte) -28);
                                                            if (class133.field2141 != null) {
                                                                class107.method947(true, class133.field2141);
                                                                ++class372.field5278;
                                                                if (class380.field5388 + 5 < class129.field2111 || ~(class380.field5388 - 5) < ~class129.field2111 || class291.field4327 > class341.field4841 + 5 || class341.field4841 + -5 > class291.field4327) {
                                                                    class444.field6454 = true;
                                                                }
                                                                if (class408.field5943 == 0) {
                                                                    if (class444.field6454 && class372.field5278 >= 5) {
                                                                        if (class369.field5235 == class133.field2141 && ~class326.field4700 != ~class225.field3326) {
                                                                            class258 var56 = class133.field2141;
                                                                            byte var57 = 0;
                                                                            if (~class392.field5735 == -2 && ~var56.field3821 == -207) {
                                                                                var57 = 1;
                                                                            }
                                                                            if (var56.field3847[class326.field4700] <= 0) {
                                                                                var57 = 0;
                                                                            }
                                                                            ++class437.field6360;
                                                                            if (~var57 != -2) {
                                                                                var56.method1872((byte) -67, class225.field3326, class326.field4700);
                                                                            } else {
                                                                                int var58 = class225.field3326;
                                                                                int var59 = class326.field4700;
                                                                                while (var58 != var59) {
                                                                                    if (var58 <= var59) {
                                                                                        if (var58 < var59) {
                                                                                            var56.method1872((byte) -67, var58, var58 - -1);
                                                                                            ++var58;
                                                                                        }
                                                                                    } else {
                                                                                        var56.method1872((byte) -67, var58, var58 + -1);
                                                                                        --var58;
                                                                                    }
                                                                                }
                                                                            }
                                                                            class13.field216.method2781(false, 219);
                                                                            class13.field216.method275(class133.field2141.field3854, 1414495172);
                                                                            class13.field216.method277(var57, (byte) -14);
                                                                            class13.field216.method260(class225.field3326, (byte) -102);
                                                                            class13.field216.method260(class326.field4700, (byte) -92);
                                                                        }
                                                                    } else if ((class60.field963 == 1 || class133.method1102(-2001)) && class389.field5591 > 2) {
                                                                        class307.method2100(21633);
                                                                    } else if (class19.method121(80)) {
                                                                        class89.method666((byte) 86);
                                                                    }
                                                                    class228.field3345 = 10;
                                                                    class60.field951 = 0;
                                                                    class133.field2141 = null;
                                                                }
                                                            }
                                                            if (class183.field2714 != var44) {
                                                                if (var44 != null) {
                                                                    class107.method947(true, var44);
                                                                }
                                                                if (class183.field2714 != null) {
                                                                    class107.method947(true, class183.field2714);
                                                                }
                                                            }
                                                            if (class348.field4926 != var45 && class390.field5679 == class351.field4984) {
                                                                if (var45 != null) {
                                                                    class107.method947(true, var45);
                                                                }
                                                                if (class348.field4926 != null) {
                                                                    class107.method947(true, class348.field4926);
                                                                }
                                                            }
                                                            if (class348.field4926 == null) {
                                                                if (class351.field4984 > 0) {
                                                                    --class351.field4984;
                                                                }
                                                            } else if (~class390.field5679 < ~class351.field4984) {
                                                                ++class351.field4984;
                                                                if (class390.field5679 == class351.field4984) {
                                                                    class107.method947(true, class348.field4926);
                                                                }
                                                            }
                                                            for (int var60 = 0; ~var60 > -6; ++var60) {
                                                                int var10002 = class185.field2726[var60]++;
                                                            }
                                                            int var61 = class76.method595(0);
                                                            int var62 = class231.method1717(88);
                                                            if (~var61 < -15001 && ~var62 < -15001) {
                                                                class123.field1937 = 250;
                                                                class137.method1119(14500, (byte) 90);
                                                                ++class263.field3963;
                                                                class13.field216.method2781(false, 92);
                                                            }
                                                            if (class315.field4587 && ~(class10.method63(-21149) + -60000L) < ~class402.field5880) {
                                                                class239.method1740((byte) 115);
                                                            }
                                                            ++class140.field2218;
                                                            if (class140.field2218 > 500) {
                                                                class140.field2218 = 0;
                                                                int var63 = (int) (8.0D * Math.random());
                                                                if ((var63 & 4) == 4) {
                                                                    class389.field5570 += class409.field5966;
                                                                }
                                                                if ((1 & var63) == 1) {
                                                                    class41.field632 += class191.field2830;
                                                                }
                                                                if ((var63 & 2) == 2) {
                                                                    class398.field5855 += class90.field1425;
                                                                }
                                                            }
                                                            if (~class41.field632 > 49) {
                                                                class191.field2830 = 2;
                                                            }
                                                            if (class398.field5855 < -55) {
                                                                class90.field1425 = 2;
                                                            }
                                                            if (class41.field632 > 50) {
                                                                class191.field2830 = -2;
                                                            }
                                                            if (~class398.field5855 < -56) {
                                                                class90.field1425 = -2;
                                                            }
                                                            if (class389.field5570 < -40) {
                                                                class409.field5966 = 1;
                                                            }
                                                            if (~class389.field5570 < -41) {
                                                                class409.field5966 = -1;
                                                            }
                                                            ++class303.field4427;
                                                            if (~class303.field4427 < -501) {
                                                                class303.field4427 = 0;
                                                                int var64 = (int) (Math.random() * 8.0D);
                                                                if ((var64 & 1) == 1) {
                                                                    class1.field3 += class90.field1421;
                                                                }
                                                                if ((var64 & 2) == 2) {
                                                                    class248.field3593 += class58.field916;
                                                                }
                                                            }
                                                            if (class1.field3 < -60) {
                                                                class90.field1421 = 2;
                                                            }
                                                            if (~class248.field3593 > 19) {
                                                                class58.field916 = 1;
                                                            }
                                                            if (class1.field3 > 60) {
                                                                class90.field1421 = -2;
                                                            }
                                                            if (~class248.field3593 < -11) {
                                                                class58.field916 = -1;
                                                            }
                                                            ++class437.field6371;
                                                            if (~class437.field6371 < -51) {
                                                                ++class407.field5937;
                                                                class13.field216.method2781(false, 104);
                                                            }
                                                            if (class123.field1948) {
                                                                class377.method2390(23895);
                                                                class123.field1948 = false;
                                                            }
                                                            try {
                                                                if (class124.field2028 != null && ~class13.field216.field565 < -1) {
                                                                    class124.field2028.method1653(class13.field216.field578, 3, class13.field216.field565, 0);
                                                                    class13.field216.field565 = 0;
                                                                    class437.field6371 = 0;
                                                                    return;
                                                                }
                                                                return;
                                                            } catch (IOException var65) {
                                                                class44.method355((byte) 118);
                                                                return;
                                                            }
                                                        }
                                                        var53 = var52.field3678;
                                                        if (var53.field3860 < 0) {
                                                            break;
                                                        }
                                                        var54 = class342.method2207(var53.field3754, (byte) 14);
                                                    } while (var54 == null || var54.field3869 == null || var54.field3869.length <= var53.field3860 || var54.field3869[var53.field3860] != var53);
                                                    class216.method1636(var52);
                                                }
                                            }
                                            var50 = var49.field3678;
                                            if (~var50.field3860 > -1) {
                                                break;
                                            }
                                            var51 = class342.method2207(var50.field3754, (byte) 14);
                                        } while (var51 == null || var51.field3869 == null || ~var50.field3860 <= ~var51.field3869.length || var51.field3869[var50.field3860] != var50);
                                        class216.method1636(var49);
                                    }
                                }
                                var47 = var46.field3678;
                                if (~var47.field3860 > -1) {
                                    break;
                                }
                                var48 = class342.method2207(var47.field3754, (byte) 14);
                            } while (var48 == null || var48.field3869 == null || var48.field3869.length <= var47.field3860 || var48.field3869[var47.field3860] != var47);
                            class216.method1636(var46);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V", line = 1362)
    public class48() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILjava/lang/String;)V", line = 1292)
    public static final void method389(int arg0, String arg1) {
        ++field766;
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(arg0);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V", line = 1301)
    public final void method83(boolean arg0) {
        ++field770;
        if (this.field776 == null) {
            this.field776 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (arg0) {
            if (this.field776.length < 2) {
                throw new RuntimeException("Curve operation requires at least two markers");
            } else {
                if (this.field768 == 2) {
                    this.method383((byte) -76);
                }
                class164.method1269(0);
                this.method384(-1);
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLec;I)V", line = 1329)
    public final void method78(byte arg0, class37 arg1, int arg2) {
        if (arg0 == 108) {
            if (arg2 == 0) {
                this.field768 = arg1.method271((byte) 100);
                this.field776 = new int[arg1.method271((byte) 127)][2];
                for (int var4 = 0; ~this.field776.length < ~var4; ++var4) {
                    this.field776[var4][0] = arg1.method320((byte) -87);
                    this.field776[var4][1] = arg1.method320((byte) -87);
                }
            }
            ++field775;
        }
    }
}
