import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class615 extends class748 {

    @OriginalMember(owner = "client!wg", name = "K", descriptor = "I")
    private int field8754 = 0;

    @OriginalMember(owner = "client!wg", name = "Z", descriptor = "I")
    private int field8769 = 0;

    @OriginalMember(owner = "client!wg", name = "X", descriptor = "I")
    private int field8767 = 0;

    @OriginalMember(owner = "client!wg", name = "H", descriptor = "I")
    public static int field8751;

    @OriginalMember(owner = "client!wg", name = "I", descriptor = "I")
    public static int field8752;

    @OriginalMember(owner = "client!wg", name = "J", descriptor = "I")
    public static int field8753;

    @OriginalMember(owner = "client!wg", name = "L", descriptor = "I")
    private int field8755;

    @OriginalMember(owner = "client!wg", name = "M", descriptor = "I")
    public static int field8756;

    @OriginalMember(owner = "client!wg", name = "N", descriptor = "I")
    public static int field8757;

    @OriginalMember(owner = "client!wg", name = "O", descriptor = "I")
    private int field8758;

    @OriginalMember(owner = "client!wg", name = "P", descriptor = "I")
    public static int field8759;

    @OriginalMember(owner = "client!wg", name = "Q", descriptor = "I")
    private int field8760;

    @OriginalMember(owner = "client!wg", name = "R", descriptor = "I")
    public static int field8761;

    @OriginalMember(owner = "client!wg", name = "S", descriptor = "I")
    private int field8762;

    @OriginalMember(owner = "client!wg", name = "T", descriptor = "I")
    private int field8763;

    @OriginalMember(owner = "client!wg", name = "U", descriptor = "I")
    public static int field8764;

    @OriginalMember(owner = "client!wg", name = "V", descriptor = "I")
    public static int field8765;

    @OriginalMember(owner = "client!wg", name = "W", descriptor = "I")
    private int field8766;

    @OriginalMember(owner = "client!wg", name = "Y", descriptor = "I")
    public static int field8768;

    @OriginalMember(owner = "client!wg", name = "ab", descriptor = "I")
    public static int field8770;

    @OriginalMember(owner = "client!wg", name = "bb", descriptor = "I")
    public static int field8771;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "(I)V", line = 3)
    public static final void method3605(int arg0) {
        ++field8768;
        if (class734.field10279 == 1 || ~class734.field10279 == -4 || ~class734.field10279 != ~class441.field6037 && (~class734.field10279 == -1 || class441.field6037 == 0)) {
            class676.field9533 = 0;
            class287.field3776 = 0;
            class403.field5587.method1385((byte) -97);
        }
        class441.field6037 = class734.field10279;
        if (arg0 <= 117) {
            method3609((byte) -52);
        }
    }

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "(I)Lbi;", line = 23)
    public static final class118 method3606(int arg0) {
        ++field8753;
        class118 var1 = (class118) class644.field9138.method667(true);
        if (var1 != null) {
            var1.method3065(-17363);
            var1.method1706((byte) 79);
            return var1;
        } else if (arg0 != 31467) {
            return null;
        } else {
            class118 var2;
            do {
                var2 = (class118) class632.field9003.method667(true);
                if (var2 == null) {
                    return null;
                }
                if (var2.method777((byte) 75) > class224.method1457((byte) -62)) {
                    return null;
                }
                var2.method3065(-17363);
                var2.method1706((byte) 79);
            } while (~(var2.field3778 & Long.MIN_VALUE) == -1L);
            return var2;
        }
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(B)V", line = 67)
    public static final void method3607(byte arg0) {
        ++field8756;
        try {
            if (~class736.field10292 == -2) {
                int var1 = class336.field4314.method2296(1);
                if (var1 > 0 && class336.field4314.method2291(37)) {
                    int var2 = var1 - class308.field3973;
                    if (~var2 > -1) {
                        var2 = 0;
                    }
                    class336.field4314.method2301((byte) -36, var2);
                    return;
                }
                class336.field4314.method2311(-108);
                class336.field4314.method2304(arg0 ^ 30957);
                if (class355.field4565 == null) {
                    class736.field10292 = 0;
                } else {
                    class736.field10292 = 2;
                }
                class109.field1551 = null;
                class683.field9606 = null;
            }
            if (arg0 != -2) {
                method3613(59);
            }
            if (~class736.field10292 == -4) {
                int var3 = class336.field4314.method2296(1);
                if (~class470.field6423 < ~var3 && class336.field4314.method2291(37)) {
                    int var4 = class670.field9424 + var3;
                    if (var4 > class470.field6423) {
                        var4 = class470.field6423;
                    }
                    class336.field4314.method2301((byte) -36, var4);
                } else {
                    class736.field10292 = 0;
                    class670.field9424 = 0;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            class336.field4314.method2311(-108);
            class355.field4565 = null;
            class109.field1551 = null;
            class539.field7539 = null;
            class683.field9606 = null;
            class736.field10292 = 0;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lcw;BIIILaa;ILpaa;)V", line = 134)
    public static final void method3608(class21 arg0, byte arg1, int arg2, int arg3, int arg4, class571 arg5, int arg6, class712 arg7) {
        ++field8770;
        if (arg0 != null) {
            int var8;
            if (~class665.field9377 == -5) {
                var8 = (int) class403.field5597 & 16383;
            } else {
                var8 = (int) class403.field5597 + class732.field10234 & 16383;
            }
            int var9 = 10 + Math.max(arg7.field9966 / 2, arg7.field10011 / 2);
            if (arg1 == 67) {
                int var10 = arg2 * arg2 + arg4 * arg4;
                if (var9 * var9 >= var10) {
                    int var11 = class231.field3217[var8];
                    int var12 = class231.field3218[var8];
                    if (class665.field9377 != 4) {
                        var12 = var12 * 256 / (class592.field8541 + 256);
                        var11 = var11 * 256 / (class592.field8541 + 256);
                    }
                    int var13 = arg2 * var12 + arg4 * var11 >> 14;
                    int var14 = arg4 * var12 + -(arg2 * var11) >> 14;
                    arg0.method119(var13 + arg7.field9966 / 2 + arg3 + -(arg0.method116() / 2), arg7.field10011 / 2 + -var14 + arg6 - arg0.method108() / 2, arg5, arg3, arg6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "(B)I", line = 177)
    public static final int method3609(byte arg0) {
        ++field8751;
        if (arg0 != 98) {
            return -52;
        } else if (class455.field6257 != null) {
            return 3;
        } else {
            return !class93.field1299 ? 1 : 2;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZLvj;)V", line = 191)
    public final void method20(int arg0, boolean arg1, class26 arg2) {
        ++field8764;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field8767 = (arg2.method195(128) << 12) / 100;
                }
            } else {
                this.field8754 = (arg2.method195(128) << 12) / 100;
            }
        } else {
            this.field8769 = arg2.method173(-3);
        }
        if (arg1) {
            this.field8754 = -101;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIII)V", line = 241)
    private final void method3610(int arg0, int arg1, int arg2, int arg3) {
        ++field8771;
        if (arg2 != 12288) {
            method3612(true, -3, (class55) null);
        }
        int var5 = arg3 > arg1 ? arg3 : arg1;
        int var6 = var5 < arg0 ? arg0 : var5;
        int var7 = ~arg1 < ~arg3 ? arg3 : arg1;
        int var8 = ~var7 < ~arg0 ? arg0 : var7;
        int var9 = -var8 + var6;
        this.field8766 = (var6 + var8) / 2;
        if (~this.field8766 < -1 && ~this.field8766 > -4097) {
            this.field8755 = (var9 << 12) / (this.field8766 <= 2048 ? this.field8766 * 2 : -(this.field8766 * 2) + 8192);
        } else {
            this.field8755 = 0;
        }
        if (var9 > 0) {
            int var10 = (-arg3 + var6 << 12) / var9;
            int var11 = (-arg1 + var6 << 12) / var9;
            int var12 = (-arg0 + var6 << 12) / var9;
            if (~arg3 == ~var6) {
                this.field8760 = ~arg1 != ~var8 ? 4096 - var11 : 20480 - -var12;
            } else if (~arg1 == ~var6) {
                this.field8760 = ~arg0 != ~var8 ? -var12 + 12288 : var10 + 4096;
            } else {
                this.field8760 = ~arg3 != ~var8 ? 20480 - var10 : var11 + 12288;
            }
            this.field8760 /= 6;
        } else {
            this.field8760 = 0;
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(IIII)V", line = 295)
    private final void method3611(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 1) {
            ++field8765;
            int var5 = arg3 > 2048 ? arg3 - -arg0 + -(arg0 * arg3 >> 12) : (4096 - -arg0) * arg3 >> 12;
            if (var5 > 0) {
                int var6 = arg1 * 6;
                int var7 = arg3 + arg3 - var5;
                int var8 = (-var7 + var5 << 12) / var5;
                int var9 = var6 >> 12;
                int var10 = var6 - (var9 << 12);
                int var12 = var8 * var5 >> 12;
                int var13 = var10 * var12 >> 12;
                int var14 = var7 + var13;
                int var15 = -var13 + var5;
                if (~var9 == -1) {
                    this.field8758 = var7;
                    this.field8763 = var14;
                    this.field8762 = var5;
                    return;
                }
                if (var9 == 1) {
                    this.field8758 = var7;
                    this.field8762 = var15;
                    this.field8763 = var5;
                    return;
                }
                if (~var9 == -3) {
                    this.field8763 = var5;
                    this.field8762 = var7;
                    this.field8758 = var14;
                    return;
                }
                if (var9 == 3) {
                    this.field8762 = var7;
                    this.field8763 = var15;
                    this.field8758 = var5;
                    return;
                }
                if (~var9 == -5) {
                    this.field8762 = var14;
                    this.field8758 = var5;
                    this.field8763 = var7;
                    return;
                }
                if (~var9 == -6) {
                    this.field8763 = var7;
                    this.field8758 = var15;
                    this.field8762 = var5;
                    return;
                }
            } else {
                this.field8762 = this.field8763 = this.field8758 = arg3;
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(II)[[I", line = 403)
    public final int[][] method445(int arg0, int arg1) {
        ++field8752;
        int[][] var3 = super.field10420.method930(29784, arg0);
        if (super.field10420.field1979) {
            int[][] var4 = this.method4159(0, arg1, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class424.field5889 > var11; ++var11) {
                this.method3610(var7[var11], var6[var11], 12288, var5[var11]);
                this.field8766 += this.field8767;
                this.field8755 += this.field8754;
                for (this.field8760 += this.field8769; this.field8760 < 0; this.field8760 += 4096) {
                }
                if (~this.field8755 > -1) {
                    this.field8755 = 0;
                }
                while (~this.field8760 < -4097) {
                    this.field8760 -= 4096;
                }
                if (this.field8755 > 4096) {
                    this.field8755 = 4096;
                }
                if (~this.field8766 > -1) {
                    this.field8766 = 0;
                }
                if (~this.field8766 < -4097) {
                    this.field8766 = 4096;
                }
                this.method3611(this.field8755, this.field8760, 1, this.field8766);
                var8[var11] = this.field8762;
                var9[var11] = this.field8763;
                var10[var11] = this.field8758;
            }
        }
        if (arg1 != 0) {
            this.method3610(3, 124, -23, -20);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V", line = 477)
    public class615() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZILam;)V", line = 481)
    public static final void method3612(boolean arg0, int arg1, class55 arg2) {
        ++field8757;
        if (class605.field8642 < 400) {
            class11 var3 = arg2.field771;
            if (var3.field111 != null) {
                var3 = var3.method55((byte) 118, class554.field7826);
                if (var3 == null) {
                    return;
                }
            }
            if (var3.field139) {
                String var4 = var3.field119;
                if (var3.field164 != 0) {
                    String var5 = class324.field4159 != class210.field2984 ? class138.field1864.method891(-2041650704, class369.field4721) : class138.field1866.method891(-2041650704, class369.field4721);
                    var4 = var4 + class679.method3893(class473.field6483.field9242, var3.field164, (byte) 105) + " (" + var5 + var3.field164 + ")";
                }
                if (class13.field187 && !arg0) {
                    class752 var6 = ~class545.field7705 == 0 ? null : class223.field3134.method2390(1, class545.field7705);
                    if ((2 & class626.field8934) != 0 && (var6 == null || var3.method51(var6.field10448, -1, class545.field7705) != var6.field10448)) {
                        ++class356.field4579;
                        class370.method2059(false, 0, 28, -1, class101.field1454, false, 0, (long) arg2.field8344, class215.field3044, (long) arg2.field8344, 20, true, class146.field2027 + " -> <col=ffff00>" + var4);
                    }
                }
                if (!arg0) {
                    String[] var7 = var3.field127;
                    if (class261.field3568) {
                        var7 = class210.method1392(var7, false);
                    }
                    if (var7 != null) {
                        for (int var8 = 4; ~var8 <= -1; --var8) {
                            if (var7[var8] != null && (~var3.field137 == -1 || !var7[var8].equalsIgnoreCase(class138.field1859.method891(-2041650704, class369.field4721)))) {
                                byte var9 = 0;
                                if (~var8 == -1) {
                                    var9 = 11;
                                }
                                int var10 = class448.field6162;
                                if (var8 == 1) {
                                    var9 = 51;
                                }
                                if (~var8 == -3) {
                                    var9 = 16;
                                }
                                if (var8 == 3) {
                                    var9 = 19;
                                }
                                if (~var3.field169 == ~var8) {
                                    var10 = var3.field113;
                                }
                                if (~var8 == -5) {
                                    var9 = 59;
                                }
                                if (~var3.field95 == ~var8) {
                                    var10 = var3.field163;
                                }
                                class370.method2059(false, 0, 28, -1, var7[var8].equalsIgnoreCase(class138.field1859.method891(-2041650704, class369.field4721)) ? var3.field131 : var10, false, 0, (long) arg2.field8344, var7[var8], (long) arg2.field8344, var9, true, "<col=ffff00>" + var4);
                                ++class568.field8063;
                            }
                        }
                    }
                    if (var3.field137 == 1 && var7 != null) {
                        for (int var11 = 4; ~var11 <= -1; --var11) {
                            if (var7[var11] != null && var7[var11].equalsIgnoreCase(class138.field1859.method891(-2041650704, class369.field4721))) {
                                short var12 = 0;
                                if (class473.field6483.field9242 < var3.field164) {
                                    var12 = 2000;
                                }
                                short var13 = 0;
                                if (var11 == 0) {
                                    var13 = 11;
                                }
                                if (var11 == 1) {
                                    var13 = 51;
                                }
                                if (~var11 == -3) {
                                    var13 = 16;
                                }
                                if (~var11 == -4) {
                                    var13 = 19;
                                }
                                if (~var11 == -5) {
                                    var13 = 59;
                                }
                                if (~var13 != -1) {
                                    var13 += var12;
                                }
                                ++class346.field4405;
                                class370.method2059(false, 0, 28, -1, var3.field131, false, 0, (long) arg2.field8344, var7[var11], (long) arg2.field8344, var13, true, "<col=ffff00>" + var4);
                            }
                        }
                    }
                }
                class370.method2059(false, 0, 28, -1, class686.field9627, arg0, 0, (long) arg2.field8344, class138.field1858.method891(-2041650704, class369.field4721), (long) arg2.field8344, 1011, true, "<col=ffff00>" + var4);
                if (arg1 <= -53) {
                    ++class308.field3977;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "(I)V", line = 644)
    public static final void method3613(int arg0) {
        ++field8759;
        if (class746.field10392 != class14.field193) {
            try {
                if (arg0 == 1) {
                    class208.method1378("tbrefresh", class306.field3966, -9875);
                }
            } catch (Throwable var1) {
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lkf;I)I", line = 672)
    public static final int method3614(class720 arg0, int arg1) {
        if (arg1 != 5121) {
            return 71;
        } else {
            ++field8761;
            if (class720.field10156 != arg0) {
                if (class720.field10160 != arg0) {
                    if (class720.field10162 == arg0) {
                        return 5124;
                    } else if (class720.field10164 != arg0) {
                        if (class720.field10165 == arg0) {
                            return 5123;
                        } else if (class720.field10166 != arg0) {
                            if (class720.field10167 == arg0) {
                                return 5131;
                            } else if (class720.field10168 == arg0) {
                                return 5126;
                            } else {
                                throw new IllegalArgumentException("");
                            }
                        } else {
                            return 5125;
                        }
                    } else {
                        return 5121;
                    }
                } else {
                    return 5122;
                }
            } else {
                return 5120;
            }
        }
    }
}
