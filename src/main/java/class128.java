import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class128 extends class87 {

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "[I")
    public static int[] field2143 = new int[2000];

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "J")
    public static long field2150 = 0L;

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!ne", name = "L", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "[[B")
    public static byte[][] field2145;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lhc;II)V")
    public final void method40(class53 arg0, int arg1, int arg2) {
        if (arg2 != 25645) {
            field2143 = null;
        }
        if (~arg1 == -1) {
            super.field1381 = ~arg0.method366(arg2 ^ -9302) == -2;
        }
        ++field2147;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILmh;ZIB)V")
    public static final void method971(int arg0, class263 arg1, boolean arg2, int arg3, byte arg4) {
        ++field2151;
        if (arg4 == -59) {
            int var5 = arg1.field4046;
            if (arg1.field4086 != 0) {
                if (~arg1.field4086 != -2) {
                    if (~arg1.field4086 == -3) {
                        arg1.field4046 = arg1.field4190 * arg0 >> 14;
                    } else if (~arg1.field4086 == -4) {
                        if (~arg1.field4129 == -3) {
                            arg1.field4046 = (arg1.field4190 + -1) * arg1.field4094 + arg1.field4190 * 32;
                        } else if (arg1.field4129 == 7) {
                            arg1.field4046 = (arg1.field4190 + -1) * arg1.field4094 + arg1.field4190 * 12;
                        }
                    }
                } else {
                    arg1.field4046 = arg0 - arg1.field4190;
                }
            } else {
                arg1.field4046 = arg1.field4190;
            }
            int var6 = arg1.field4215;
            if (~arg1.field4099 == -1) {
                arg1.field4215 = arg1.field4163;
            } else if (arg1.field4099 != 1) {
                if (arg1.field4099 == 2) {
                    arg1.field4215 = arg1.field4163 * arg3 >> 14;
                } else if (arg1.field4099 == 3) {
                    if (~arg1.field4129 != -3) {
                        if (~arg1.field4129 == -8) {
                            arg1.field4215 = (arg1.field4163 - 1) * arg1.field4123 + arg1.field4163 * 115;
                        }
                    } else {
                        arg1.field4215 = (arg1.field4163 + -1) * arg1.field4123 + arg1.field4163 * 32;
                    }
                }
            } else {
                arg1.field4215 = -arg1.field4163 + arg3;
            }
            if (~arg1.field4099 == -5) {
                arg1.field4215 = arg1.field4139 * arg1.field4046 / arg1.field4119;
            }
            if (~arg1.field4086 == -5) {
                arg1.field4046 = arg1.field4215 * arg1.field4119 / arg1.field4139;
            }
            if (class270.field4368 && (client.method903(arg1).field3789 != 0 || ~arg1.field4129 == -1)) {
                if (~arg1.field4046 > -6 && ~arg1.field4215 > -6) {
                    arg1.field4215 = 5;
                    arg1.field4046 = 5;
                } else {
                    if (arg1.field4046 <= 0) {
                        arg1.field4046 = 5;
                    }
                    if (~arg1.field4215 >= -1) {
                        arg1.field4215 = 5;
                    }
                }
            }
            if (arg1.field4179 == 1337) {
                class135.field2203 = arg1;
            }
            if (arg2 && arg1.field4082 != null) {
                if (~arg1.field4215 != ~var6 || arg1.field4046 != var5) {
                    class234 var7 = new class234();
                    var7.field3419 = arg1.field4082;
                    var7.field3423 = arg1;
                    class304.field4923.method13(arg4 + 91, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "(I)V")
    public static final void method972(int arg0) {
        if (arg0 == 30004) {
            int var1 = field2145.length;
            ++field2142;
            for (int var2 = 0; var2 < var1; ++var2) {
                if (field2145[var2] != null) {
                    int var3 = -1;
                    for (int var4 = 0; ~var4 > ~class251.field3794; ++var4) {
                        if (~class62.field948[var4] == ~class53.field768[var2]) {
                            var3 = var4;
                            break;
                        }
                    }
                    if (~var3 == 0) {
                        class62.field948[class251.field3794] = class53.field768[var2];
                        var3 = class251.field3794++;
                    }
                    class53 var5 = new class53(field2145[var2]);
                    int var6 = 0;
                    while (var5.field735 < field2145[var2].length && var6 < 511 && ~class12.field135 > -1024) {
                        int var7 = var5.method331(arg0 ^ -29995);
                        int var8 = var3 | var6++ << 6;
                        int var9 = (var7 & 8153) >> 7;
                        int var10 = var7 >> 14;
                        int var11 = var7 & 63;
                        int var12 = (class53.field768[var2] >> 8) * 64 + var9 - class163.field2520;
                        int var13 = (255 & class53.field768[var2]) * 64 + var11 - class149.field2390;
                        class102 var14 = class303.method2062(var5.method331(-87), -102);
                        if (class255.field3856[var8] == null && ~(var14.field1782 & 1) < -1 && class280.field4510 == var10 && ~var12 <= -1 && ~(var14.field1738 + var12) > -105 && var13 >= 0 && var14.field1738 + var13 < 104) {
                            class255.field3856[var8] = new class12();
                            class12 var15 = class255.field3856[var8];
                            class14.field159[class12.field135++] = var8;
                            var15.field3749 = class199.field2930;
                            var15.method90(-1, var14);
                            var15.method1709(-19753, var15.field137.field1738);
                            var15.field3712 = var15.field3668 = class288.field4608[var15.field137.field1779];
                            var15.field3723 = var15.field137.field1724;
                            var15.field3724 = var15.field137.field1785;
                            if (var15.field3724 == 0) {
                                var15.field3668 = 0;
                            }
                            var15.method1710(var15.method1467(arg0 ^ 30004), -111, true, var12, var13);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "(I)V")
    public static void method973(int arg0) {
        field2143 = null;
        field2145 = null;
        int var1 = -93 / ((53 - arg0) / 49);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZ)[I")
    public final int[] method37(int arg0, boolean arg1) {
        ++field2144;
        int[] var3 = super.field1378.method319(arg0, arg1);
        if (arg1) {
            method971(-1, (class263) null, false, -36, (byte) -127);
        }
        if (super.field1378.field733) {
            int[] var4 = this.method642(0, arg0, true);
            for (int var5 = 0; ~var5 > ~class206.field3032; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
    public class128() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method974(int arg0, String arg1) {
        ++field2148;
        if (arg1 == null) {
            return false;
        } else {
            for (int var2 = 0; ~var2 > ~class110.field1832; ++var2) {
                if (arg1.equalsIgnoreCase(class223.field3268[var2])) {
                    return true;
                }
            }
            if (arg0 != 1128) {
                method972(51);
            }
            return arg1.equalsIgnoreCase(class213.field3139.field3069);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)[[I")
    public final int[][] method143(int arg0, int arg1) {
        ++field2146;
        int[][] var3 = super.field1390.method1902(-113, arg0);
        if (arg1 != 6) {
            field2150 = 127L;
        }
        if (super.field1390.field4428) {
            int[][] var4 = this.method648(arg0, -104, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class206.field3032; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = 4096 - var7[var11];
                var10[var11] = 4096 - var6[var11];
            }
        }
        return var3;
    }
}
