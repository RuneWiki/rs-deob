import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class77 extends class152 {

    @OriginalMember(owner = "client!pg", name = "Gb", descriptor = "I")
    public static volatile int field1100 = -1;

    @OriginalMember(owner = "client!pg", name = "Ob", descriptor = "[I")
    public static int[] field1108 = new int[500];

    @OriginalMember(owner = "client!pg", name = "Hb", descriptor = "Ljava/lang/String;")
    public static String field1101 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!pg", name = "Jb", descriptor = "[Laa;")
    public static class173[] field1103 = new class173[4];

    @OriginalMember(owner = "client!pg", name = "Xb", descriptor = "Ljava/lang/String;")
    public static String field1117 = null;

    @OriginalMember(owner = "client!pg", name = "Vb", descriptor = "[I")
    public static int[] field1115 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!pg", name = "Sb", descriptor = "[Lil;")
    public static class165[] field1112 = new class165[14];

    @OriginalMember(owner = "client!pg", name = "ac", descriptor = "Ljava/lang/String;")
    public static String field1120 = " has logged out.";

    @OriginalMember(owner = "client!pg", name = "Fb", descriptor = "I")
    private int field1099;

    @OriginalMember(owner = "client!pg", name = "Ib", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!pg", name = "Kb", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!pg", name = "Lb", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!pg", name = "Mb", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!pg", name = "Nb", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!pg", name = "Pb", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!pg", name = "Qb", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!pg", name = "Rb", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!pg", name = "Ub", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!pg", name = "Wb", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!pg", name = "Yb", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!pg", name = "Zb", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!pg", name = "bc", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!pg", name = "cc", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!pg", name = "Tb", descriptor = "Lmc;")
    private class202 field1113;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "(II)I")
    public final int method554(int arg0, int arg1) {
        ++field1106;
        int var3 = this.field1099 >> 3;
        int var4 = -(this.field1099 & 7) + 8;
        this.field1099 += arg0;
        int var5 = 0;
        if (arg1 > -38) {
            this.method567(false);
        }
        while (~arg0 < ~var4) {
            var5 += (class259.field4246[var4] & super.field2523[var3++]) << -var4 + arg0;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 != var4) {
            var6 = (super.field2523[var3] >> -arg0 + var4 & class259.field4246[arg0]) + var5;
        } else {
            var6 = (class259.field4246[var4] & super.field2523[var3]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!pg", name = "B", descriptor = "(I)Lei;")
    public static final class176 method555(int arg0) {
        if (arg0 != 17) {
            method564(-46);
        }
        ++field1121;
        try {
            return (class176) Class.forName("wk").newInstance();
        } catch (Throwable var1) {
            return new class127();
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IILjava/lang/String;)I")
    public static final int method556(int arg0, int arg1, String arg2) {
        ++field1122;
        return arg0 != 91 ? 125 : class24.method177(-123, arg2, true, arg1);
    }

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "(II)V")
    public final void method557(int arg0, int arg1) {
        ++field1104;
        super.field2523[super.field2511++] = (byte) (this.field1113.method1487(false) + arg0);
        if (arg1 != 8) {
            field1105 = 104;
        }
    }

    @OriginalMember(owner = "client!pg", name = "C", descriptor = "(I)V")
    public static final void method558(int arg0) {
        ++field1102;
        if (class222.field3551 != null) {
            if (class101.field1498 < 10) {
                if (!class100.field1474.method647(-106, class222.field3551.field3546)) {
                    class101.field1498 = class296.field4676.method646(class222.field3551.field3546, (byte) -108) / 10;
                    return;
                }
                class32.method236((byte) -83);
                class101.field1498 = 10;
            }
            if (~class101.field1498 == -11) {
                int var1 = -1;
                class227.field3636 = class222.field3551.field3568 >> 6 << 6;
                class85.field1245 = (class222.field3551.field3554 >> 6 << 6) + 64 + -class227.field3636;
                int var2 = -1;
                class122.field1786 = class222.field3551.field3564 >> 6 << 6;
                class52.field753 = (class222.field3551.field3561 >> 6 << 6) + -class122.field1786 - -64;
                int[] var3 = class222.field3551.method1595(class282.field4487 - -(class186.field2993.field1979 >> 7), (class186.field2993.field1910 >> 7) + class99.field1465, class58.field826, 12800);
                if (var3 != null) {
                    var2 = class122.field1786 - var3[2] + class52.field753 + -1;
                    var1 = var3[1] + -class227.field3636;
                }
                if (~var1 <= -1 && var1 < class85.field1245 && ~var2 <= -1 && class52.field753 > var2) {
                    int var4 = var1 + -5 + (int) (10.0D * Math.random());
                    class172.field2765 = var4;
                    int var5 = var2 + -5 + (int) (Math.random() * 10.0D);
                    class296.field4682 = var5;
                } else if (~class232.field3722 != 0 && class10.field91 != -1) {
                    int[] var6 = class222.field3551.method1590(class10.field91, class232.field3722, 0);
                    if (var6 != null) {
                        class296.field4682 = -var6[2] + class122.field1786 + class52.field753 + -1;
                        class172.field2765 = var6[1] + -class227.field3636;
                    }
                    class10.field91 = -1;
                    class232.field3722 = -1;
                } else {
                    int[] var7 = class222.field3551.method1590(16383 & class222.field3551.field3563, class222.field3551.field3563 >> 14 & 16383, 0);
                    class172.field2765 = var7[1] - class227.field3636;
                    class296.field4682 = class52.field753 + class122.field1786 + -1 + -var7[2];
                }
                if (class222.field3551.field3550 != 37) {
                    if (class222.field3551.field3550 == 50) {
                        class6.field52 = 4.0F;
                        class229.field3689 = 4.0F;
                    } else if (~class222.field3551.field3550 != -76) {
                        if (~class222.field3551.field3550 != -101) {
                            if (~class222.field3551.field3550 != -201) {
                                class6.field52 = 8.0F;
                                class229.field3689 = 8.0F;
                            } else {
                                class6.field52 = 16.0F;
                                class229.field3689 = 16.0F;
                            }
                        } else {
                            class6.field52 = 8.0F;
                            class229.field3689 = 8.0F;
                        }
                    } else {
                        class6.field52 = 6.0F;
                        class229.field3689 = 6.0F;
                    }
                } else {
                    class6.field52 = 3.0F;
                    class229.field3689 = 3.0F;
                }
                class110.method809(true);
                int var8 = class85.field1245 >> 6;
                int var9 = class200.field3205 >> 2 << 10;
                int var10 = class52.field753 >> 6;
                class24.field280 = new int[var8][var10][];
                class267.field4310 = new byte[var8][var10][];
                class252.field4162 = new byte[var8][var10][];
                class33.field417 = new byte[var8][var10][];
                class121.field1767 = new int[class101.field1499 + 1];
                class122.field1784 = new byte[var8][var10][];
                class108.field1564 = new int[var8][var10][];
                class208.field3338 = new int[var8][var10][];
                class253.field4183 = new byte[var8][var10][];
                int var11 = class274.field4410 >> 1;
                class180.method1342(var9, (byte) -90, var11);
                class101.field1498 = 20;
            } else if (~class101.field1498 == -21) {
                class38.method298(124, new class152(class100.field1474.method644(class222.field3551.field3546, "underlay", arg0 + -30370)));
                class101.field1498 = 30;
                class40.method307(arg0 ^ -46, true);
                class10.method80(-94);
            } else if (class101.field1498 == 30) {
                class34.method262(new class152(class100.field1474.method644(class222.field3551.field3546, "overlay", arg0 + -30370)), -101);
                class101.field1498 = 40;
                class10.method80(arg0 + 5);
            } else if (~class101.field1498 == -41) {
                class283.method1932((byte) -116, new class152(class100.field1474.method644(class222.field3551.field3546, "overlay2", arg0 ^ -30238)));
                class101.field1498 = 50;
                class10.method80(arg0 + -2);
            } else if (class101.field1498 == 50) {
                class280.method1917(new class152(class100.field1474.method644(class222.field3551.field3546, "loc", -30279)), (byte) -123);
                class101.field1498 = 60;
                class40.method307(-104, true);
                class10.method80(-18);
            } else if (class101.field1498 == 60) {
                if (class100.field1474.method620(true, class222.field3551.field3546 + "_labels")) {
                    if (!class100.field1474.method647(arg0 ^ -58, class222.field3551.field3546 + "_labels")) {
                        return;
                    }
                    class63.field940 = class101.method765(2, class222.field3551.field3546 + "_labels", class100.field1474);
                } else {
                    class63.field940 = new class80(0);
                }
                class101.field1498 = 70;
                class10.method80(-64);
            } else if (~class101.field1498 == -71) {
                class21.field237 = new class167(11, true, class10.field89);
                class101.field1498 = 73;
                class40.method307(arg0 + -216, true);
                class10.method80(110);
            } else if (~class101.field1498 == -74) {
                class213.field3411 = new class167(12, true, class10.field89);
                class101.field1498 = 76;
                class40.method307(-122, true);
                class10.method80(-51);
            } else if (~class101.field1498 == -77) {
                class112.field1616 = new class167(14, true, class10.field89);
                class101.field1498 = 79;
                class40.method307(-106, true);
                class10.method80(88);
            } else if (~class101.field1498 == -80) {
                class10.field115 = new class167(17, true, class10.field89);
                class101.field1498 = 82;
                class40.method307(-126, true);
                class10.method80(-40);
            } else if (class101.field1498 == 82) {
                class10.field103 = new class167(19, true, class10.field89);
                class101.field1498 = 85;
                class40.method307(-104, true);
                class10.method80(-34);
            } else if (class101.field1498 == 85) {
                class296.field4688 = new class167(22, true, class10.field89);
                class101.field1498 = 88;
                class40.method307(arg0 + -209, true);
                class10.method80(arg0 ^ 22);
            } else if (~class101.field1498 == -89) {
                class238.field3803 = new class167(26, true, class10.field89);
                class101.field1498 = 91;
                class40.method307(-128, true);
                class10.method80(0);
            } else {
                class96.field1423 = new class167(30, true, class10.field89);
                if (arg0 != 91) {
                    method564(-113);
                }
                class101.field1498 = 100;
                class40.method307(-125, true);
                class10.method80(arg0 ^ 62);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III[B)V")
    public final void method559(int arg0, int arg1, int arg2, byte[] arg3) {
        ++field1107;
        if (arg2 != -1697787130) {
            this.method561((int[]) null, true);
        }
        for (int var5 = 0; arg1 > var5; ++var5) {
            arg3[arg0 + var5] = (byte) (super.field2523[super.field2511++] + -this.field1113.method1487(false));
        }
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(Z)V")
    public final void method560(boolean arg0) {
        if (arg0) {
            this.method560(true);
        }
        super.field2511 = (this.field1099 - -7) / 8;
        ++field1114;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "([IZ)V")
    public final void method561(int[] arg0, boolean arg1) {
        ++field1119;
        this.field1113 = new class202(arg0);
        if (!arg1) {
            method558(21);
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(I)V")
    public class77(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "(BI)I")
    public final int method562(byte arg0, int arg1) {
        if (arg0 < 84) {
            return 37;
        } else {
            ++field1110;
            return arg1 * 8 + -this.field1099;
        }
    }

    @OriginalMember(owner = "client!pg", name = "D", descriptor = "(I)V")
    public final void method563(int arg0) {
        this.field1099 = super.field2511 * 8;
        if (arg0 < -48) {
            ++field1118;
        }
    }

    @OriginalMember(owner = "client!pg", name = "E", descriptor = "(I)V")
    public static void method564(int arg0) {
        field1115 = null;
        field1112 = null;
        if (arg0 != 3) {
            method565(-85, -24, 60);
        }
        field1103 = null;
        field1120 = null;
        field1101 = null;
        field1117 = null;
        field1108 = null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)Z")
    public static final boolean method565(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class274.field4408; ++var3) {
            class174 var4 = class85.field1238[var3];
            if (var4.field2823 == 1) {
                int var5 = var4.field2828 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field2831 * var5 >> 8) + var4.field2835;
                    int var7 = (var4.field2846 * var5 >> 8) + var4.field2839;
                    int var8 = (var4.field2829 * var5 >> 8) + var4.field2827;
                    int var9 = (var4.field2841 * var5 >> 8) + var4.field2840;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field2823 == 2) {
                int var10 = arg0 - var4.field2828;
                if (var10 > 0) {
                    int var11 = (var4.field2831 * var10 >> 8) + var4.field2835;
                    int var12 = (var4.field2846 * var10 >> 8) + var4.field2839;
                    int var13 = (var4.field2829 * var10 >> 8) + var4.field2827;
                    int var14 = (var4.field2841 * var10 >> 8) + var4.field2840;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field2823 == 3) {
                int var15 = var4.field2835 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field2826 * var15 >> 8) + var4.field2828;
                    int var17 = (var4.field2837 * var15 >> 8) + var4.field2824;
                    int var18 = (var4.field2829 * var15 >> 8) + var4.field2827;
                    int var19 = (var4.field2841 * var15 >> 8) + var4.field2840;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field2823 == 4) {
                int var20 = arg2 - var4.field2835;
                if (var20 > 0) {
                    int var21 = (var4.field2826 * var20 >> 8) + var4.field2828;
                    int var22 = (var4.field2837 * var20 >> 8) + var4.field2824;
                    int var23 = (var4.field2829 * var20 >> 8) + var4.field2827;
                    int var24 = (var4.field2841 * var20 >> 8) + var4.field2840;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field2823 == 5) {
                int var25 = arg1 - var4.field2827;
                if (var25 > 0) {
                    int var26 = (var4.field2826 * var25 >> 8) + var4.field2828;
                    int var27 = (var4.field2837 * var25 >> 8) + var4.field2824;
                    int var28 = (var4.field2831 * var25 >> 8) + var4.field2835;
                    int var29 = (var4.field2846 * var25 >> 8) + var4.field2839;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "(B)Z")
    public static final boolean method566(byte arg0) {
        if (arg0 >= -8) {
            method558(-53);
        }
        ++field1109;
        return class3.field29;
    }

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "(Z)I")
    public final int method567(boolean arg0) {
        ++field1111;
        return arg0 ? 48 : 255 & super.field2523[super.field2511++] + -this.field1113.method1487(false);
    }
}
