import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class22 extends class425 {

    @OriginalMember(owner = "client!ub", name = "Zc", descriptor = "I")
    public int field214 = -1;

    @OriginalMember(owner = "client!ub", name = "Xc", descriptor = "I")
    public int field212 = -1;

    @OriginalMember(owner = "client!ub", name = "md", descriptor = "I")
    public int field227 = 1;

    @OriginalMember(owner = "client!ub", name = "hd", descriptor = "I")
    public int field222 = 1;

    @OriginalMember(owner = "client!ub", name = "Pc", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!ub", name = "Qc", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!ub", name = "Rc", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!ub", name = "Sc", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!ub", name = "Tc", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!ub", name = "Uc", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!ub", name = "Vc", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!ub", name = "ad", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!ub", name = "bd", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!ub", name = "dd", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!ub", name = "ed", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!ub", name = "fd", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!ub", name = "gd", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!ub", name = "id", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!ub", name = "jd", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!ub", name = "kd", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!ub", name = "nd", descriptor = "I")
    public int field228;

    @OriginalMember(owner = "client!ub", name = "od", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!ub", name = "pd", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!ub", name = "cd", descriptor = "Loaa;")
    public class304 field217;

    @OriginalMember(owner = "client!ub", name = "ld", descriptor = "Loj;")
    public class400 field226;

    @OriginalMember(owner = "client!ub", name = "Yc", descriptor = "Lrm;")
    public static class430 field213;

    @OriginalMember(owner = "client!ub", name = "Wc", descriptor = "Ljava/lang/String;")
    public String field211;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(Lha;B)Lpia;", line = 3)
    public final class104 method114(class66 arg0, byte arg1) {
        ++field208;
        if (this.field217 != null && this.method123(2048, arg0, 1)) {
            class109 var3 = arg0.method475();
            int var4 = super.field6109.method958((byte) -72);
            var3.method810(var4);
            class194 var5 = class443.field6387[super.field2813][super.field2802 >> class478.field6717][super.field2810 >> class478.field6717];
            if (var5 != null && var5.field2519 != null) {
                int var6 = -var5.field2519.field8518 + super.field6143;
                super.field6143 = (int) ((float) super.field6143 - (float) var6 / 10.0F);
            } else {
                super.field6143 = (int) ((float) super.field6143 - (float) super.field6143 / 10.0F);
            }
            var3.method818(super.field2802, super.field2815 + -20 - super.field6143, super.field2810);
            class588 var7 = this.method2573(-1);
            class304 var8 = this.field217.field4295 == null ? this.field217 : this.field217.method1968(class480.field6740, -1);
            super.field6190 = false;
            class104 var9 = null;
            if (class125.field1721.field5134.method2409(43) == 1 && var8.field4325 && var7.field7997) {
                class317 var10 = super.field6138 != -1 && ~super.field6183 == -1 ? class693.field9223.method2388(super.field6138, 0) : null;
                class317 var11 = super.field6111 == -1 || super.field6128 && var10 != null ? null : class693.field9223.method2388(super.field6111, 0);
                class497 var12 = class749.method4095(var4, arg0, var11 == null ? var10 : var11, this.field217.field4300, 255 & this.field217.field4287, 255 & this.field217.field4302, 127, super.field6132, super.field6139, super.field6196[0], this.field217.field4312 & 65535, super.field6184, var11 == null ? super.field6150 : super.field6112, 65535 & this.field217.field4327);
                if (var12 != null) {
                    var9 = class568.method3241(super.field6196.length + 1, (byte) -125, this.method116(121));
                    super.field6190 = true;
                    arg0.method508(false);
                    if (!class408.field5786) {
                        var12.method254(var3, var9.field1479[super.field6196.length], 0);
                    } else {
                        var12.method258(var3, var9.field1479[super.field6196.length], class72.field972, 0);
                    }
                    arg0.method508(true);
                }
            }
            var3.method810(var4);
            var3.method818(super.field2802, -super.field6143 + super.field2815 + -5, super.field2810);
            if (var9 == null) {
                var9 = class568.method3241(super.field6196.length, (byte) 91, this.method116(arg1 + -34));
            }
            this.method2567(-1, var3, false, super.field6196, arg0);
            if (class408.field5786) {
                for (int var13 = 0; ~var13 > ~super.field6196.length; ++var13) {
                    if (super.field6196[var13] != null) {
                        super.field6196[var13].method258(var3, var9.field1479[var13], class72.field972, 0);
                    }
                }
            } else {
                for (int var14 = 0; var14 < super.field6196.length; ++var14) {
                    if (super.field6196[var14] != null) {
                        super.field6196[var14].method254(var3, var9.field1479[var14], 0);
                    }
                }
            }
            if (super.field6191 != null) {
                class586 var15 = super.field6191.method1057();
                if (!class408.field5786) {
                    arg0.method534(var15);
                } else {
                    arg0.method524(var15, class72.field972);
                }
            }
            if (arg1 != 115) {
                this.method131((class66) null, (byte) -64);
            }
            for (int var16 = 0; ~super.field6196.length < ~var16; ++var16) {
                if (super.field6196[var16] != null) {
                    super.field6190 |= super.field6196[var16].method272();
                }
            }
            super.field6106 = class327.field4642;
            super.field6196[0] = super.field6196[1] = super.field6196[2] = null;
            return var9;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZIIIIB)V", line = 130)
    public final void method115(boolean arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        ++field223;
        super.field2813 = super.field2809 = (byte) arg3;
        if (class49.method310(arg4, arg2, (byte) 65)) {
            ++super.field2809;
        }
        if (~super.field6138 != 0 && ~class693.field9223.method2388(super.field6138, 0).field4489 == -2) {
            super.field6179 = null;
            super.field6138 = -1;
        }
        int var7 = 0;
        if (arg5 > 10) {
            while (~var7 > ~super.field6110.length) {
                if (~super.field6110[var7].field1549 != 0) {
                    class573 var11 = class641.field8643.method918(super.field6110[var7].field1549, 64);
                    if (var11.field7801 && ~var11.field7819 != 0 && class693.field9223.method2388(var11.field7819, 0).field4489 == 1) {
                        super.field6110[var7].field1549 = -1;
                    }
                }
                ++var7;
            }
            if (!arg0) {
                int var8 = -super.field6198[0] + arg4;
                int var9 = -super.field6197[0] + arg2;
                if (var8 >= -8 && ~var8 >= -9 && var9 >= -8 && var9 <= 8) {
                    if (~super.field6195 > -10) {
                        ++super.field6195;
                    }
                    for (int var10 = super.field6195; var10 > 0; --var10) {
                        super.field6198[var10] = super.field6198[var10 + -1];
                        super.field6197[var10] = super.field6197[var10 + -1];
                        super.field6194[var10] = super.field6194[var10 - 1];
                    }
                    super.field6198[0] = arg4;
                    super.field6197[0] = arg2;
                    super.field6194[0] = 1;
                    return;
                }
            }
            super.field6198[0] = arg4;
            super.field6200 = 0;
            super.field6199 = 0;
            super.field6195 = 0;
            super.field6197[0] = arg2;
            super.field2802 = (super.field6198[0] << 9) + (arg1 << 8);
            super.field2810 = (super.field6197[0] << 9) - -(arg1 << 8);
            if (super.field6191 != null) {
                super.field6191.method1046();
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "(I)Z", line = 212)
    private final boolean method116(int arg0) {
        ++field216;
        if (arg0 <= 33) {
            this.field211 = null;
        }
        return this.field217.field4260;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)I", line = 224)
    public final int method117(byte arg0) {
        ++field209;
        if (arg0 < 105) {
            return 87;
        } else {
            return this.field217 == null ? 0 : this.field217.field4279;
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(IBI)V", line = 248)
    public final void method118(int arg0, byte arg1, int arg2) {
        ++field225;
        int var4 = super.field6198[0];
        int var5 = super.field6197[0];
        if (~arg0 == -1) {
            ++var5;
        }
        if (arg0 == 1) {
            ++var5;
            ++var4;
        }
        if (arg0 == 2) {
            ++var4;
        }
        if (~arg0 == -4) {
            --var5;
            ++var4;
        }
        if (arg1 == -100) {
            if (~arg0 == -5) {
                --var5;
            }
            if (arg0 == 5) {
                --var5;
                --var4;
            }
            if (~arg0 == -7) {
                --var4;
            }
            if (super.field6138 != -1 && ~class693.field9223.method2388(super.field6138, arg1 + 100).field4489 == -2) {
                super.field6179 = null;
                super.field6138 = -1;
            }
            if (~arg0 == -8) {
                ++var5;
                --var4;
            }
            for (int var6 = 0; var6 < super.field6110.length; ++var6) {
                if (super.field6110[var6].field1549 != -1) {
                    class573 var8 = class641.field8643.method918(super.field6110[var6].field1549, 64);
                    if (var8.field7801 && var8.field7819 != -1 && ~class693.field9223.method2388(var8.field7819, 0).field4489 == -2) {
                        super.field6110[var6].field1549 = -1;
                    }
                }
            }
            if (~super.field6195 > -10) {
                ++super.field6195;
            }
            for (int var7 = super.field6195; var7 > 0; --var7) {
                super.field6198[var7] = super.field6198[var7 + -1];
                super.field6197[var7] = super.field6197[var7 + -1];
                super.field6194[var7] = super.field6194[var7 - 1];
            }
            super.field6198[0] = var4;
            super.field6194[0] = (byte) arg2;
            super.field6197[0] = var5;
        }
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(Lha;B)Lln;", line = 346)
    public final class398 method119(class66 arg0, byte arg1) {
        if (arg1 >= -35) {
            return null;
        } else {
            ++field221;
            return null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(B)Z", line = 368)
    public final boolean method120(byte arg0) {
        ++field206;
        if (arg0 != 63) {
            return true;
        } else {
            return this.field217 != null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III[IIZIIILeq;II[III)I", line = 383)
    public static final int method121(int arg0, int arg1, int arg2, int[] arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, class224 arg9, int arg10, int arg11, int[] arg12, int arg13, int arg14) {
        for (int var15 = arg2; ~var15 > -129; ++var15) {
            for (int var35 = 0; ~var35 > -129; ++var35) {
                class437.field6319[var15][var35] = 0;
                class85.field1207[var15][var35] = 99999999;
            }
        }
        ++field210;
        boolean var16;
        if (arg13 != 1) {
            if (~arg13 == -3) {
                var16 = class792.method4327(arg7, arg8, arg10, arg1, arg4, arg11, arg6, arg0, (byte) -118, arg9, arg14);
            } else {
                var16 = class710.method3939(arg7, arg1, 0, arg14, arg11, arg10, arg4, arg0, arg13, arg9, arg8, arg6);
            }
        } else {
            var16 = class620.method3434(arg9, arg11, arg0, arg8, arg1, arg4, arg10, arg6, arg7, arg14, (byte) 83);
        }
        int var17 = arg8 + -64;
        int var18 = arg7 - 64;
        int var19 = class6.field44;
        int var20 = class399.field5715;
        if (!var16) {
            if (!arg5) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg1 - var23; var24 <= arg1 + var23; ++var24) {
                for (int var25 = -var23 + arg4; var25 <= arg4 + var23; ++var25) {
                    int var26 = -var17 + var24;
                    int var27 = -var18 + var25;
                    if (~var26 <= -1 && var27 >= 0 && var26 < 128 && var27 < 128 && ~class85.field1207[var26][var27] > -101) {
                        int var28 = 0;
                        if (arg1 > var24) {
                            var28 = -var24 + arg1;
                        } else if (var24 > arg1 + arg10 - 1) {
                            var28 = 1 - (arg1 - (-arg10 + var24));
                        }
                        int var29 = 0;
                        if (var25 < arg4) {
                            var29 = -var25 + arg4;
                        } else if (arg14 + -1 + arg4 < var25) {
                            var29 = var25 - -1 - (arg4 + arg14);
                        }
                        int var30 = var28 * var28 - -(var29 * var29);
                        if (var30 < var21 || ~var21 == ~var30 && ~var22 < ~class85.field1207[var26][var27]) {
                            var22 = class85.field1207[var26][var27];
                            var20 = var25;
                            var21 = var30;
                            var19 = var24;
                        }
                    }
                }
            }
            if (~var21 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (arg8 == var19 && ~arg7 == ~var20) {
            return 0;
        } else {
            byte var31 = 0;
            class58.field761[var31] = var19;
            int var37 = var31 + 1;
            class560.field7681[var31] = var20;
            int var32;
            int var33 = var32 = class437.field6319[-var17 + var19][-var18 + var20];
            while (arg8 != var19 || arg7 != var20) {
                if (var32 != var33) {
                    var32 = var33;
                    class58.field761[var37] = var19;
                    class560.field7681[var37++] = var20;
                }
                if ((var33 & 2) != 0) {
                    ++var19;
                } else if (~(8 & var33) != -1) {
                    --var19;
                }
                if ((var33 & 1) == 0) {
                    if ((var33 & 4) != 0) {
                        --var20;
                    }
                } else {
                    ++var20;
                }
                var33 = class437.field6319[-var17 + var19][-var18 + var20];
            }
            int var34 = 0;
            while (~(var37--) < -1) {
                arg3[var34] = class58.field761[var37];
                arg12[var34++] = class560.field7681[var37];
                if (~arg3.length >= ~var34) {
                    break;
                }
            }
            return var34;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILha;II)Z", line = 554)
    public final boolean method122(int arg0, class66 arg1, int arg2, int arg3) {
        ++field224;
        if (this.field217 != null && this.method123(131072, arg1, 1)) {
            class109 var5 = arg1.method475();
            int var6 = super.field6109.method958((byte) -97);
            var5.method810(var6);
            if (arg2 != 6238) {
                field213 = null;
            }
            var5.method818(super.field2802, super.field2815, super.field2810);
            boolean var7 = false;
            for (int var8 = 0; super.field6196.length > var8; ++var8) {
                if (super.field6196[var8] != null) {
                    boolean var10000;
                    label47: {
                        if (this.field217.field4279 <= 0) {
                            label45: {
                                if (this.field217.field4335 != -1) {
                                    if (~this.field217.field4335 == -2) {
                                        break label45;
                                    }
                                    var10000 = false;
                                } else {
                                    if (this.field217.field4300 == 1) {
                                        break label45;
                                    }
                                    var10000 = false;
                                }
                                if (!var10000) {
                                    var10000 = false;
                                    break label47;
                                }
                            }
                        }
                        var10000 = true;
                    }
                    boolean var9 = var10000;
                    boolean var10;
                    if (!class408.field5786) {
                        var10 = super.field6196[var8].method248(arg0, arg3, var5, var9, this.field217.field4279);
                    } else {
                        var10 = super.field6196[var8].method245(arg0, arg3, var5, var9, this.field217.field4279, class72.field972);
                    }
                    if (var10) {
                        var7 = true;
                        break;
                    }
                }
            }
            super.field6196[0] = super.field6196[1] = super.field6196[2] = null;
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILha;I)Z", line = 611)
    private final boolean method123(int arg0, class66 arg1, int arg2) {
        ++field218;
        int var4 = arg0;
        class588 var5 = this.method2573(-1);
        class317 var6 = ~super.field6138 != 0 && super.field6183 == 0 ? class693.field9223.method2388(super.field6138, 0) : null;
        class317 var7 = super.field6111 == -1 || super.field6128 && var6 != null ? null : class693.field9223.method2388(super.field6111, 0);
        int var8 = var5.field8015;
        int var9 = var5.field8017;
        if (var8 != 0 || ~var9 != -1 || ~var5.field8025 != -1 || ~var5.field8033 != -1) {
            arg0 |= 7;
        }
        boolean var10 = super.field6153 != 0 && class572.field7788 >= super.field6185 && super.field6129 > class572.field7788;
        if (var10) {
            arg0 |= 524288;
        }
        int var11 = super.field6109.method958((byte) -47);
        class497 var12 = super.field6196[0] = this.field217.method1971(class175.field2314, super.field6150, super.field6157, super.field6112, super.field6155, arg1, var7, arg0, this.field226, super.field6136, super.field6121, class480.field6740, super.field6163, super.field6181, 256, var11, class693.field9223, var6);
        if (arg2 != 1) {
            this.field211 = null;
        }
        if (var12 == null) {
            return false;
        } else {
            super.field6125 = var12.method265();
            super.field6175 = var12.method264();
            this.method2562(var12, 0);
            if (~var8 == -1 && ~var9 == -1) {
                this.method2556(0, this.method2563(-12840) << 9, var11, false, 0, this.method2563(-12840) << 9);
            } else {
                this.method2556(var5.field8011, var9, var11, false, var5.field8022, var8);
                if (super.field6184 != 0) {
                    super.field6196[0].method293(super.field6184);
                }
                if (~super.field6132 != -1) {
                    super.field6196[0].method290(super.field6132);
                }
                if (~super.field6139 != -1) {
                    super.field6196[0].method266(0, super.field6139, 0);
                }
            }
            if (var10) {
                var12.method279(super.field6148, super.field6113, super.field6120, 255 & super.field6153);
            }
            this.method2560(var4, var11, var5, var9, 121, var8, arg1);
            return true;
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(Z)V", line = 687)
    public static void method124(boolean arg0) {
        field213 = null;
        if (arg0) {
            field213 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)I", line = 697)
    public final int method125(byte arg0) {
        ++field204;
        if (arg0 <= 58) {
            this.field227 = 104;
        }
        if (this.field217.field4295 != null) {
            class304 var2 = this.field217.method1968(class480.field6740, -1);
            if (var2 != null && var2.field4294 != -1) {
                return var2.field4294;
            }
        }
        return this.field217.field4294;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)Z", line = 718)
    public final boolean method126(byte arg0) {
        ++field215;
        return arg0 != -34 ? false : false;
    }

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "(I)V", line = 729)
    public final void method127(int arg0) {
        if (arg0 != -13127) {
            this.field222 = 5;
        }
        ++field207;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "(I)I", line = 740)
    public final int method128(int arg0) {
        ++field220;
        if (this.field217.field4295 != null) {
            class304 var2 = this.field217.method1968(class480.field6740, -1);
            if (var2 != null && ~var2.field4284 != 0) {
                return var2.field4284;
            }
        }
        int var3 = -121 % ((arg0 - 26) / 53);
        return this.field217.field4284;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILfq;BIILha;Z)V", line = 762)
    public final void method129(int arg0, class214 arg1, byte arg2, int arg3, int arg4, class66 arg5, boolean arg6) {
        if (arg2 != -103) {
            method121(108, 1, 127, (int[]) null, 15, false, 40, 42, -16, (class224) null, -33, -50, (int[]) null, 65, 3);
        }
        ++field229;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)I", line = 777)
    public final int method130(int arg0) {
        if (arg0 < 108) {
            this.method125((byte) -49);
        }
        ++field205;
        if (this.field217.field4295 != null) {
            class304 var2 = this.field217.method1968(class480.field6740, -1);
            if (var2 != null && var2.field4286 != -1) {
                return var2.field4286;
            }
        }
        return this.field217.field4286 != -1 ? this.field217.field4286 : super.method130(125);
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(Lha;B)V", line = 799)
    public final void method131(class66 arg0, byte arg1) {
        ++field230;
        if (this.field217 != null) {
            if (super.field6192 || this.method123(0, arg0, 1)) {
                class109 var3 = arg0.method475();
                if (arg1 != 53) {
                    this.field212 = -18;
                }
                var3.method810(super.field6109.method958((byte) 100));
                var3.method818(super.field2802, super.field2815 + -20, super.field2810);
                this.method2567(-1, var3, super.field6192, super.field6196, arg0);
                super.field6196[0] = super.field6196[1] = super.field6196[2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLoaa;)V", line = 826)
    public final void method132(byte arg0, class304 arg1) {
        ++field219;
        this.field217 = arg1;
        if (this.field217 != null) {
            this.field211 = this.field217.field4278;
            this.field228 = this.field217.field4313;
        }
        if (arg0 > -49) {
            this.method117((byte) 28);
        }
        if (super.field6191 != null) {
            super.field6191.method1046();
        }
    }
}
