import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class113 extends class170 {

    @OriginalMember(owner = "client!ua", name = "gb", descriptor = "I")
    private int field1973 = 585;

    @OriginalMember(owner = "client!ua", name = "X", descriptor = "[I")
    public static int[] field1964 = new int[1000];

    @OriginalMember(owner = "client!ua", name = "ib", descriptor = "I")
    public static int field1975 = 0;

    @OriginalMember(owner = "client!ua", name = "W", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!ua", name = "Z", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!ua", name = "ab", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!ua", name = "bb", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!ua", name = "db", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!ua", name = "fb", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!ua", name = "hb", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!ua", name = "jb", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!ua", name = "eb", descriptor = "Lpk;")
    public static class99 field1971;

    @OriginalMember(owner = "client!ua", name = "cb", descriptor = "[I")
    public static int[] field1969;

    @OriginalMember(owner = "client!ua", name = "Y", descriptor = "[Lsa;")
    public static class260[] field1965;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(BI)[I")
    public final int[] method31(byte arg0, int arg1) {
        if (arg0 != -30) {
            method811(107);
        }
        ++field1974;
        int[] var3 = super.field3001.method1538(100, arg1);
        if (super.field3001.field3835) {
            int var4 = class282.field4964[arg1];
            for (int var5 = 0; var5 < class88.field1595; ++var5) {
                int var6 = class68.field1211[var5];
                if (this.field1973 < var6 && var6 < -this.field1973 + 4096 && var4 > 2048 - this.field1973 && ~(2048 - -this.field1973) < ~var4) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field1973);
                    var3[var5] = 4096 - var10;
                } else if (-this.field1973 + 2048 < var6 && ~var6 > ~(this.field1973 + 2048)) {
                    int var11 = var4 + -2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field1973;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field1973 + 2048);
                } else if (~this.field1973 >= ~var4 && var4 <= -this.field1973 + 4096) {
                    if (this.field1973 <= var6 && ~(-this.field1973 + 4096) <= ~var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 < 0 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (2048 - this.field1973);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field1973;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field1973 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)V")
    public static final void method806(int arg0, byte arg1) {
        ++field1968;
        short var2 = 256;
        int var3 = 92 / ((arg1 - -89) / 35);
        if (var2 < arg0) {
            arg0 = var2;
        }
        if (arg0 > 10) {
            arg0 = 10;
        }
        class283.field4966 += arg0 * 128;
        if (~class170.field3017.length > ~class283.field4966) {
            class283.field4966 -= class170.field3017.length;
            int var4 = (int) (12.0D * Math.random());
            class191.method1329(class213.field3780[var4], -32222);
        }
        int var5 = 0;
        int var6 = arg0 * 128;
        int var7 = (var2 - arg0) * 128;
        for (int var8 = 0; var7 > var8; ++var8) {
            int var27 = class170.field2995[var5 + var6] + -(class170.field3017[class283.field4966 + var5 & class170.field3017.length + -1] * arg0 / 6);
            if (var27 < 0) {
                var27 = 0;
            }
            class170.field2995[var5++] = var27;
        }
        for (int var9 = -arg0 + var2; var9 < var2; ++var9) {
            int var24 = var9 * 128;
            for (int var25 = 0; ~var25 > -129; ++var25) {
                int var26 = (int) (100.0D * Math.random());
                if (var26 < 50 && var25 > 10 && ~var25 > -119) {
                    class170.field2995[var24 + var25] = 255;
                } else {
                    class170.field2995[var24 + var25] = 0;
                }
            }
        }
        for (int var10 = 0; ~var10 > ~(-arg0 + var2); ++var10) {
            class174.field3157[var10] = class174.field3157[var10 - -arg0];
        }
        for (int var11 = -arg0 + var2; var11 < var2; ++var11) {
            class174.field3157[var11] = (int) (Math.sin((double) class135.field2330 / 14.0D) * 16.0D + Math.sin((double) class135.field2330 / 15.0D) * 14.0D + 12.0D * Math.sin((double) class135.field2330 / 16.0D));
            ++class135.field2330;
        }
        class144.field2479 += arg0;
        int var12 = ((1 & class160.field2844) + arg0) / 2;
        if (~var12 < -1) {
            for (int var13 = 0; var13 < class144.field2479; ++var13) {
                int var22 = 2 + (int) (124.0D * Math.random());
                int var23 = 128 + (int) (128.0D * Math.random());
                class170.field2995[var22 - -(var23 << 7)] = 192;
            }
            class144.field2479 = 0;
            for (int var14 = 0; var14 < var2; ++var14) {
                int var19 = 0;
                int var20 = var14 * 128;
                for (int var21 = -var12; ~var21 > -129; ++var21) {
                    if (~(var12 + var21) > -129) {
                        var19 += class170.field2995[var20 + var21 + var12];
                    }
                    if (-var12 - (1 - var21) >= 0) {
                        var19 -= class170.field2995[-var12 + -1 + var20 + var21];
                    }
                    if (~var21 <= -1) {
                        class17.field269[var20 + var21] = var19 / (var12 * 2 - -1);
                    }
                }
            }
            for (int var15 = 0; var15 < 128; ++var15) {
                int var16 = 0;
                for (int var17 = -var12; var2 > var17; ++var17) {
                    int var18 = var17 * 128;
                    if (var17 - -var12 < var2) {
                        var16 += class17.field269[var12 * 128 + var18 + var15];
                    }
                    if (~(var17 - 1 - var12) <= -1) {
                        var16 -= class17.field269[var15 + var18 + -((var12 + 1) * 128)];
                    }
                    if (var17 >= 0) {
                        class170.field2995[var15 + var18] = var16 / (var12 * 2 - -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(III)I")
    public static final int method807(int arg0, int arg1, int arg2) {
        ++field1967;
        int var3 = 1;
        while (~arg1 < -2) {
            if ((arg1 & 1) != 0) {
                var3 = arg0 * var3;
            }
            arg1 >>= 1;
            arg0 *= arg0;
        }
        int var4 = -118 / ((arg2 - 22) / 43);
        if (~arg1 == -2) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lv;II)V")
    public final void method29(class149 arg0, int arg1, int arg2) {
        ++field1966;
        if (~arg2 == -1) {
            this.field1973 = arg0.method1050(arg1 + 1272000691);
        }
        if (arg1 != 5877) {
            field1964 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "(I)V")
    public static void method808(int arg0) {
        int var1 = -124 / ((arg0 - -6) / 53);
        field1964 = null;
        field1969 = null;
        field1965 = null;
        field1971 = null;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
    public class113() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IJ)Lqk;")
    public static final class207 method809(int arg0, long arg1) {
        if (arg0 != 13216) {
            return null;
        } else {
            ++field1976;
            return class117.method836(10, false, (byte) 127, arg1);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZB)V")
    public static final void method810(boolean arg0, byte arg1) {
        if (arg1 < -85) {
            class270.field4772 = arg0;
            ++field1972;
            if (class270.field4772) {
                int var2 = class17.field262.method1050(1272006568);
                int var3 = class17.field262.method1079(13932);
                class17.field262.method779(true);
                for (int var4 = 0; ~var4 > -5; ++var4) {
                    for (int var22 = 0; ~var22 > -14; ++var22) {
                        for (int var23 = 0; ~var23 > -14; ++var23) {
                            int var24 = class17.field262.method773(1, false);
                            if (~var24 == -2) {
                                class281.field4933[var4][var22][var23] = class17.field262.method773(26, false);
                            } else {
                                class281.field4933[var4][var22][var23] = -1;
                            }
                        }
                    }
                }
                class17.field262.method775((byte) 110);
                int var5 = (-class17.field262.field2593 + class245.field4437) / 16;
                class157.field2790 = new int[var5][4];
                for (int var6 = 0; var5 > var6; ++var6) {
                    for (int var21 = 0; ~var21 > -5; ++var21) {
                        class157.field2790[var6][var21] = class17.field262.method1052(-1);
                    }
                }
                int var7 = class17.field262.method1072(255);
                int var8 = class17.field262.method1050(1272006568);
                int var9 = class17.field262.method1062(51);
                class15.field249 = new int[var5];
                class156.field2753 = new int[var5];
                class44.field877 = new int[var5];
                class27.field546 = null;
                class228.field4190 = null;
                class207.field3680 = new byte[var5][];
                class207.field3685 = new int[var5];
                class127.field2219 = new int[var5];
                class88.field1591 = new byte[var5][];
                int var10 = 0;
                for (int var11 = 0; var11 < 4; ++var11) {
                    for (int var12 = 0; var12 < 13; ++var12) {
                        for (int var13 = 0; var13 < 13; ++var13) {
                            int var14 = class281.field4933[var11][var12][var13];
                            if (var14 != -1) {
                                int var15 = (var14 & 16377) >> 3;
                                int var16 = (var14 & 16763996) >> 14;
                                int var17 = (var16 / 8 << 8) + var15 / 8;
                                for (int var18 = 0; ~var10 < ~var18; ++var18) {
                                    if (class207.field3685[var18] == var17) {
                                        var17 = -1;
                                        break;
                                    }
                                }
                                if (~var17 != 0) {
                                    class207.field3685[var10] = var17;
                                    int var19 = (65396 & var17) >> 8;
                                    int var20 = var17 & 255;
                                    class127.field2219[var10] = class13.field191.method711(113, class105.method757(false, new class207[] { class16.field257, class262.method1815(var19, (byte) -113), class265.field4705, class262.method1815(var20, (byte) -104) }));
                                    class44.field877[var10] = class13.field191.method711(97, class105.method757(false, new class207[] { class74.field1364, class262.method1815(var19, (byte) 26), class265.field4705, class262.method1815(var20, (byte) -124) }));
                                    class15.field249[var10] = class13.field191.method711(113, class105.method757(false, new class207[] { class201.field3551, class262.method1815(var19, (byte) -1), class265.field4705, class262.method1815(var20, (byte) -103) }));
                                    class156.field2753[var10] = class13.field191.method711(113, class105.method757(false, new class207[] { class165.field2916, class262.method1815(var19, (byte) -125), class265.field4705, class262.method1815(var20, (byte) 3) }));
                                    ++var10;
                                }
                            }
                        }
                    }
                }
                class154.method1105(var9, (byte) 14, var7, var2, var3, var8, false);
            } else {
                int var25 = class17.field262.method1062(55);
                int var26 = (-class17.field262.field2593 + class245.field4437) / 16;
                class157.field2790 = new int[var26][4];
                for (int var27 = 0; ~var27 > ~var26; ++var27) {
                    for (int var37 = 0; ~var37 > -5; ++var37) {
                        class157.field2790[var27][var37] = class17.field262.method1055(-97);
                    }
                }
                int var28 = class17.field262.method1079(13932);
                int var29 = class17.field262.method1079(13932);
                int var30 = class17.field262.method1050(1272006568);
                boolean var31 = false;
                int var32 = class17.field262.method1045((byte) -106);
                if ((var28 / 8 == 48 || ~(var28 / 8) == -50) && var30 / 8 == 48) {
                    var31 = true;
                }
                if (~(var28 / 8) == -49 && ~(var30 / 8) == -149) {
                    var31 = true;
                }
                class127.field2219 = new int[var26];
                class27.field546 = null;
                class156.field2753 = new int[var26];
                class207.field3680 = new byte[var26][];
                class207.field3685 = new int[var26];
                class88.field1591 = new byte[var26][];
                class228.field4190 = null;
                class44.field877 = new int[var26];
                class15.field249 = new int[var26];
                int var33 = 0;
                for (int var34 = (var28 - 6) / 8; ~((var28 + 6) / 8) <= ~var34; ++var34) {
                    for (int var35 = (var30 + -6) / 8; (var30 + 6) / 8 >= var35; ++var35) {
                        int var36 = (var34 << 8) + var35;
                        if (!var31 || var35 != 49 && var35 != 149 && var35 != 147 && ~var34 != -51 && (var34 != 49 || ~var35 != -48)) {
                            class207.field3685[var33] = var36;
                            class127.field2219[var33] = class13.field191.method711(113, class105.method757(false, new class207[] { class16.field257, class262.method1815(var34, (byte) -126), class265.field4705, class262.method1815(var35, (byte) -106) }));
                            class44.field877[var33] = class13.field191.method711(107, class105.method757(false, new class207[] { class74.field1364, class262.method1815(var34, (byte) 30), class265.field4705, class262.method1815(var35, (byte) -118) }));
                            class15.field249[var33] = class13.field191.method711(109, class105.method757(false, new class207[] { class201.field3551, class262.method1815(var34, (byte) 113), class265.field4705, class262.method1815(var35, (byte) 49) }));
                            class156.field2753[var33] = class13.field191.method711(120, class105.method757(false, new class207[] { class165.field2916, class262.method1815(var34, (byte) 55), class265.field4705, class262.method1815(var35, (byte) -106) }));
                        } else {
                            class207.field3685[var33] = var36;
                            class127.field2219[var33] = -1;
                            class44.field877[var33] = -1;
                            class15.field249[var33] = -1;
                            class156.field2753[var33] = -1;
                        }
                        ++var33;
                    }
                }
                class154.method1105(var30, (byte) 14, var32, var28, var29, var25, false);
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "(I)V")
    public static final void method811(int arg0) {
        if (arg0 != -1) {
            method807(-64, 73, 122);
        }
        if (class12.field170 < class108.field1913) {
            class12.field170 = (float) ((double) class12.field170 / 30.0D + (double) class12.field170);
            if (class108.field1913 < class12.field170) {
                class12.field170 = class108.field1913;
            }
            class288.method1965(1);
        } else if (class12.field170 > class108.field1913) {
            class12.field170 = (float) ((double) class12.field170 - (double) class12.field170 / 30.0D);
            if (class108.field1913 > class12.field170) {
                class12.field170 = class108.field1913;
            }
            class288.method1965(1);
        }
        ++field1970;
        if (~class62.field1137 != 0 && class48.field950 != -1) {
            int var1 = -class276.field4842 + class62.field1137;
            if (~var1 > -3 || ~var1 < -3) {
                var1 >>= 4;
            }
            int var2 = class48.field950 - class39.field786;
            class276.field4842 += var1;
            if (var2 < 2 || ~var2 < -3) {
                var2 >>= 4;
            }
            if (~var1 == -1 && ~var2 == -1) {
                class62.field1137 = -1;
                class48.field950 = -1;
            }
            class39.field786 += var2;
            class288.method1965(arg0 + 2);
        }
    }
}
