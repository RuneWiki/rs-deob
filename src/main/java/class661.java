import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class661 extends class264 {

    @OriginalMember(owner = "client!qt", name = "k", descriptor = "Z")
    public static boolean field9282 = false;

    @OriginalMember(owner = "client!qt", name = "q", descriptor = "Z")
    public static boolean field9288 = false;

    @OriginalMember(owner = "client!qt", name = "r", descriptor = "I")
    public static int field9289 = -2;

    @OriginalMember(owner = "client!qt", name = "l", descriptor = "I")
    public static int field9283;

    @OriginalMember(owner = "client!qt", name = "m", descriptor = "I")
    public static int field9284;

    @OriginalMember(owner = "client!qt", name = "n", descriptor = "I")
    public static int field9285;

    @OriginalMember(owner = "client!qt", name = "o", descriptor = "I")
    public static int field9286;

    @OriginalMember(owner = "client!qt", name = "p", descriptor = "I")
    public static int field9287;

    @OriginalMember(owner = "client!qt", name = "s", descriptor = "I")
    public static int field9290;

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "(I)V", line = 5)
    public static final void method3769(int arg0) {
        ++field9284;
        if (~class145.field1852.field8994.method2826((byte) -53) == -3) {
            byte var1 = (byte) (255 & class327.field4890 + -4);
            int var2 = class327.field4890 % class109.field1314;
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var18 = 0; class760.field10479 > var18; ++var18) {
                    class278.field3871[var3][var2][var18] = var1;
                }
            }
            if (class410.field5771 != 3) {
                for (int var4 = arg0; ~var4 > -3; ++var4) {
                    class175.field2497[var4] = -1000000;
                    class685.field9720[var4] = 1000000;
                    class206.field3023[var4] = 0;
                    class145.field1854[var4] = 1000000;
                    class624.field8795[var4] = 0;
                }
                int var5 = class251.field3549.field7718;
                int var6 = class251.field3549.field7719;
                if (~class763.field10510 != -2 && class406.field5746 == -1) {
                    int var7 = class580.method3366(class410.field5771, (byte) -95, class359.field5216, class277.field3866);
                    if (~(-class655.field9241 + var7) > -3201 && ~(4 & class617.field8700[class410.field5771][class277.field3866 >> 9][class359.field5216 >> 9]) != -1) {
                        class231.method1604(1, class359.field5216 >> 9, false, -19739, class378.field5427, class277.field3866 >> 9);
                        return;
                    }
                } else {
                    if (class763.field10510 != 1) {
                        var5 = class406.field5746;
                        var6 = class180.field2732;
                    }
                    if (~(class617.field8700[class410.field5771][var5 >> 9][var6 >> 9] & 4) != -1) {
                        class231.method1604(0, var6 >> 9, false, arg0 ^ -19739, class378.field5427, var5 >> 9);
                    }
                    if (~class689.field9757 <= -2561) {
                        return;
                    }
                    int var8 = class277.field3866 >> 9;
                    int var9 = class359.field5216 >> 9;
                    int var10 = var5 >> 9;
                    int var11 = var6 >> 9;
                    int var12;
                    if (~var8 <= ~var10) {
                        var12 = var8 - var10;
                    } else {
                        var12 = -var8 + var10;
                    }
                    int var13;
                    if (~var11 >= ~var9) {
                        var13 = -var11 + var9;
                    } else {
                        var13 = -var9 + var11;
                    }
                    if (var12 == 0 && ~var13 == -1 || ~(-class109.field1314) <= ~var12 || class109.field1314 <= var12 || var13 <= -class760.field10479 || class760.field10479 <= var13) {
                        class329.method2129("RC: " + var8 + "," + var9 + " " + var10 + "," + var11 + " " + class103.field1295 + "," + class175.field2496, false, (Throwable) null);
                        return;
                    }
                    if (var12 > var13) {
                        int var14 = var13 * 65536 / var12;
                        int var15 = 32768;
                        while (~var8 != ~var10) {
                            if (var8 >= var10) {
                                if (var10 < var8) {
                                    --var8;
                                }
                            } else {
                                ++var8;
                            }
                            if ((class617.field8700[class410.field5771][var8][var9] & 4) != 0) {
                                class231.method1604(1, var9, false, -19739, class378.field5427, var8);
                                return;
                            }
                            var15 += var14;
                            if (var15 >= 65536) {
                                var15 -= 65536;
                                if (var9 >= var11) {
                                    if (var11 < var9) {
                                        --var9;
                                    }
                                } else {
                                    ++var9;
                                }
                                if (~(class617.field8700[class410.field5771][var8][var9] & 4) != -1) {
                                    class231.method1604(1, var9, false, -19739, class378.field5427, var8);
                                    return;
                                }
                            }
                        }
                        return;
                    }
                    int var16 = var12 * 65536 / var13;
                    int var17 = 32768;
                    while (var9 != var11) {
                        if (var9 < var11) {
                            ++var9;
                        } else if (var9 > var11) {
                            --var9;
                        }
                        if (~(class617.field8700[class410.field5771][var8][var9] & 4) != -1) {
                            class231.method1604(1, var9, false, -19739, class378.field5427, var8);
                            return;
                        }
                        var17 += var16;
                        if (~var17 <= -65537) {
                            if (var8 < var10) {
                                ++var8;
                            } else if (var8 > var10) {
                                --var8;
                            }
                            var17 -= 65536;
                            if (~(class617.field8700[class410.field5771][var8][var9] & 4) != -1) {
                                class231.method1604(1, var9, false, -19739, class378.field5427, var8);
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(BI)V", line = 208)
    public final void method659(byte arg0, int arg1) {
        ++field9287;
        super.field3733 = arg1;
        if (arg0 >= -114) {
            this.method659((byte) 76, -14);
        }
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(I)V", line = 220)
    public final void method660(int arg0) {
        if (super.field3733 != 1 && ~super.field3733 != -1) {
            super.field3733 = this.method663((byte) -38);
        }
        ++field9286;
        int var2 = 64 % ((1 - arg0) / 41);
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(BI)I", line = 233)
    public final int method666(byte arg0, int arg1) {
        ++field9285;
        if (arg0 != 112) {
            field9289 = -80;
        }
        return 1;
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(B)I", line = 246)
    public final int method3770(byte arg0) {
        ++field9283;
        if (arg0 > -31) {
            this.method660(99);
        }
        return super.field3733;
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lmfa;)V", line = 264)
    public class661(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)I", line = 271)
    public final int method663(byte arg0) {
        if (arg0 != -38) {
            this.method663((byte) -100);
        }
        ++field9290;
        return 1;
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(ILmfa;)V", line = 290)
    public class661(int arg0, class640 arg1) {
        super(arg1);
    }
}
