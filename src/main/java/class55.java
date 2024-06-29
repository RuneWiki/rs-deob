import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class55 extends class584 {

    @OriginalMember(owner = "client!am", name = "bd", descriptor = "I")
    public int field761 = -1;

    @OriginalMember(owner = "client!am", name = "vd", descriptor = "I")
    public int field781 = -1;

    @OriginalMember(owner = "client!am", name = "id", descriptor = "[I")
    public static int[] field768 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!am", name = "Zc", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!am", name = "ad", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!am", name = "cd", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!am", name = "dd", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!am", name = "ed", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!am", name = "fd", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!am", name = "gd", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!am", name = "hd", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!am", name = "jd", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!am", name = "kd", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!am", name = "md", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!am", name = "nd", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!am", name = "od", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!am", name = "pd", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!am", name = "qd", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!am", name = "rd", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!am", name = "sd", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!am", name = "td", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!am", name = "ud", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!am", name = "ld", descriptor = "Liea;")
    public class11 field771;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(Lha;I)Ljl;")
    public final class596 method278(class545 arg0, int arg1) {
        ++field778;
        if (this.field771 != null && this.method368(arg0, 2048, arg1 ^ -2202)) {
            class723 var3 = arg0.method2087();
            int var4 = super.field8327.method2661(-56);
            var3.method866(var4);
            class38 var5 = class352.field4549[super.field9501][super.field9490 >> class509.field7106][super.field9489 >> class509.field7106];
            if (var5 != null && var5.field532 != null) {
                int var6 = -var5.field532.field734 + super.field8353;
                super.field8353 = (int) ((float) super.field8353 - (float) var6 / 10.0F);
            } else {
                super.field8353 = (int) ((float) super.field8353 - (float) super.field8353 / 10.0F);
            }
            var3.method851(super.field9490, super.field9502 + -20 + -super.field8353, super.field9489);
            class591 var7 = this.method3482(0);
            class11 var8 = this.field771.field111 == null ? this.field771 : this.field771.method55((byte) 118, class554.field7826);
            super.field8412 = false;
            class596 var9 = null;
            if (class674.field9500.field5168.method2781(arg1 ^ arg1) == 1 && var8.field116 && var7.field8529) {
                class103 var10 = super.field8317 != -1 && super.field8391 == 0 ? class274.field3684.method1881((byte) -80, super.field8317) : null;
                class103 var11 = super.field8309 == -1 || super.field8352 && var10 != null ? null : class274.field3684.method1881((byte) -80, super.field8309);
                class283 var12 = class692.method3934(this.field771.field134, super.field8359, var4, this.field771.field133 & 255, super.field8350, 65535 & this.field771.field107, arg0, super.field8408, this.field771.field108 & 65535, super.field8418[0], this.field771.field125 & 255, 768, var11 != null ? super.field8399 : super.field8357, var11 == null ? var10 : var11);
                if (var12 != null) {
                    var9 = class589.method3502(super.field8418.length + 1, this.method372(0), 0);
                    super.field8412 = true;
                    arg0.method2148(false);
                    if (class286.field3774) {
                        var12.method1164(var3, var9.field8579[super.field8418.length], class527.field7375, 0);
                    } else {
                        var12.method1168(var3, var9.field8579[super.field8418.length], 0);
                    }
                    arg0.method2148(true);
                }
            }
            var3.method866(var4);
            var3.method851(super.field9490, super.field9502 + -5 + -super.field8353, super.field9489);
            if (var9 == null) {
                var9 = class589.method3502(super.field8418.length, this.method372(0), 0);
            }
            this.method3479(super.field8418, var3, arg0, false, (byte) -91);
            if (class286.field3774) {
                for (int var13 = 0; ~super.field8418.length < ~var13; ++var13) {
                    if (super.field8418[var13] != null) {
                        super.field8418[var13].method1164(var3, var9.field8579[var13], class527.field7375, 0);
                    }
                }
            } else {
                for (int var14 = 0; var14 < super.field8418.length; ++var14) {
                    if (super.field8418[var14] != null) {
                        super.field8418[var14].method1168(var3, var9.field8579[var14], 0);
                    }
                }
            }
            if (super.field8413 != null) {
                class347 var15 = super.field8413.method1347();
                if (class286.field3774) {
                    arg0.method2112(var15, class527.field7375);
                } else {
                    arg0.method2122(var15);
                }
            }
            for (int var16 = 0; ~var16 > ~super.field8418.length; ++var16) {
                if (super.field8418[var16] != null) {
                    super.field8412 |= super.field8418[var16].method1130();
                }
            }
            super.field8370 = class54.field757;
            super.field8418[0] = super.field8418[1] = super.field8418[2] = null;
            return var9;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IBZILha;ILig;)V")
    public final void method365(int arg0, byte arg1, boolean arg2, int arg3, class545 arg4, int arg5, class674 arg6) {
        if (arg1 >= 76) {
            ++field759;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ZII)V")
    public final void method366(boolean arg0, int arg1, int arg2) {
        ++field770;
        int var4 = super.field8421[0];
        int var5 = super.field8414[0];
        if (arg1 == 0) {
            ++var5;
        }
        if (!arg0) {
            if (~arg1 == -2) {
                ++var5;
                ++var4;
            }
            if (arg1 == 2) {
                ++var4;
            }
            if (arg1 == 3) {
                --var5;
                ++var4;
            }
            if (~arg1 == -5) {
                --var5;
            }
            if (~arg1 == -6) {
                --var4;
                --var5;
            }
            if (~arg1 == -7) {
                --var4;
            }
            if (~super.field8317 != 0 && class274.field3684.method1881((byte) -80, super.field8317).field1486 == 1) {
                super.field8317 = -1;
                super.field8348 = null;
            }
            if (~arg1 == -8) {
                ++var5;
                --var4;
            }
            if (super.field8313 != -1) {
                class42 var6 = class267.field3625.method3986(-1, super.field8313);
                if (var6.field594 && var6.field585 != -1 && class274.field3684.method1881((byte) -80, var6.field585).field1486 == 1) {
                    super.field8313 = -1;
                }
            }
            if (~super.field8393 != 0) {
                class42 var7 = class267.field3625.method3986(-1, super.field8393);
                if (var7.field594 && ~var7.field585 != 0 && class274.field3684.method1881((byte) -80, var7.field585).field1486 == 1) {
                    super.field8393 = -1;
                }
            }
            if (~super.field8419 > -10) {
                ++super.field8419;
            }
            for (int var8 = super.field8419; ~var8 < -1; --var8) {
                super.field8421[var8] = super.field8421[var8 + -1];
                super.field8414[var8] = super.field8414[var8 + -1];
                super.field8420[var8] = super.field8420[var8 + -1];
            }
            super.field8421[0] = var4;
            super.field8420[0] = (byte) arg2;
            super.field8414[0] = var5;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIZIII)V")
    public final void method367(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        super.field9501 = super.field9495 = (byte) arg0;
        ++field773;
        if (class753.method4175(-12388, arg5, arg4)) {
            ++super.field9495;
        }
        if (super.field8317 != -1 && ~class274.field3684.method1881((byte) -80, super.field8317).field1486 == -2) {
            super.field8317 = -1;
            super.field8348 = null;
        }
        if (super.field8313 != -1) {
            class42 var7 = class267.field3625.method3986(-1, super.field8313);
            if (var7.field594 && ~var7.field585 != 0 && ~class274.field3684.method1881((byte) -80, var7.field585).field1486 == -2) {
                super.field8313 = -1;
            }
        }
        if (super.field8393 != -1) {
            class42 var8 = class267.field3625.method3986(arg1 ^ 1, super.field8393);
            if (var8.field594 && ~var8.field585 != 0 && class274.field3684.method1881((byte) -80, var8.field585).field1486 == 1) {
                super.field8393 = -1;
            }
        }
        if (!arg2) {
            int var9 = -super.field8421[0] + arg4;
            int var10 = -super.field8414[0] + arg5;
            if (var9 >= -8 && ~var9 >= -9 && var10 >= -8 && var10 <= 8) {
                if (~super.field8419 > -10) {
                    ++super.field8419;
                }
                for (int var11 = super.field8419; var11 > 0; --var11) {
                    super.field8421[var11] = super.field8421[var11 + -1];
                    super.field8414[var11] = super.field8414[var11 + -1];
                    super.field8420[var11] = super.field8420[var11 - 1];
                }
                super.field8421[0] = arg4;
                super.field8420[0] = 1;
                super.field8414[0] = arg5;
                return;
            }
        }
        super.field8422 = 0;
        super.field8416 = 0;
        super.field8421[0] = arg4;
        if (arg1 != -2) {
            this.field781 = 111;
        }
        super.field8419 = 0;
        super.field8414[0] = arg5;
        super.field9489 = (super.field8414[0] << 9) - -(arg3 << 8);
        super.field9490 = (super.field8421[0] << 9) - -(arg3 << 8);
        if (super.field8413 != null) {
            super.field8413.method1339();
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lha;II)Z")
    private final boolean method368(class545 arg0, int arg1, int arg2) {
        ++field766;
        if (arg2 > -68) {
            return false;
        } else {
            int var4 = arg1;
            class591 var5 = this.method3482(0);
            class103 var6 = super.field8317 != -1 && super.field8391 == 0 ? class274.field3684.method1881((byte) -80, super.field8317) : null;
            class103 var7 = super.field8309 == -1 || super.field8352 && var6 != null ? null : class274.field3684.method1881((byte) -80, super.field8309);
            int var8 = var5.field8520;
            int var9 = var5.field8524;
            if (~var8 != -1 || ~var9 != -1 || var5.field8474 != 0 || ~var5.field8528 != -1) {
                arg1 |= 7;
            }
            boolean var10 = ~super.field8400 != -1 && super.field8339 <= class245.field3409 && class245.field3409 < super.field8387;
            if (var10) {
                arg1 |= 524288;
            }
            int var11 = super.field8327.method2661(-63);
            class283 var12 = super.field8418[0] = this.field771.method49(super.field8355, var6, class554.field7826, var11, super.field8394, super.field8323, (byte) 26, super.field8399, super.field8390, super.field8357, class274.field3684, var7, super.field8379, super.field8407, arg1, arg0, class544.field7653);
            if (var12 == null) {
                return false;
            } else {
                super.field8343 = var12.method1120();
                super.field8354 = var12.method1113();
                this.method3473(0, var12);
                if (var8 == 0 && var9 == 0) {
                    this.method3478(this.method3470(-1) << 9, this.method3470(-1) << 9, 0, true, var11, 0);
                } else {
                    this.method3478(var9, var8, var5.field8493, true, var11, var5.field8523);
                    if (super.field8350 != 0) {
                        super.field8418[0].method1165(super.field8350);
                    }
                    if (super.field8359 != 0) {
                        super.field8418[0].method1167(super.field8359);
                    }
                    if (~super.field8408 != -1) {
                        super.field8418[0].method1117(0, super.field8408, 0);
                    }
                }
                if (var10) {
                    var12.method1149(super.field8403, super.field8319, super.field8345, super.field8400 & 255);
                }
                if (~super.field8313 != 0 && super.field8375 != -1) {
                    class42 var13 = class267.field3625.method3986(-1, super.field8313);
                    boolean var14 = var13.field596 == 3 && (~var8 != -1 || ~var9 != -1);
                    int var15 = var4;
                    if (!var14) {
                        if (super.field8397 != 0) {
                            var15 = var4 | 5;
                        }
                        if (super.field8321 != 0) {
                            var15 |= 2;
                        }
                        if (super.field8362 != 0) {
                            var15 |= 7;
                        }
                    } else {
                        var15 = var4 | 7;
                    }
                    class283 var16 = super.field8418[1] = var13.method290(arg0, super.field8375, class274.field3684, -25569, var15, super.field8337, super.field8401);
                    if (var16 != null) {
                        if (~super.field8362 > -1) {
                            if (super.field8397 != 0) {
                                var16.method1133(super.field8397 * 2048);
                            }
                        } else {
                            int var17 = 0;
                            int var18 = 0;
                            int var19 = 0;
                            if (var5.field8502 != null && var5.field8502[super.field8362] != null) {
                                var18 += var5.field8502[super.field8362][1];
                                var17 += var5.field8502[super.field8362][0];
                                var19 += var5.field8502[super.field8362][2];
                            }
                            if (var5.field8511 != null && var5.field8511[super.field8362] != null) {
                                var17 += var5.field8511[super.field8362][0];
                                var19 += var5.field8511[super.field8362][2];
                                var18 += var5.field8511[super.field8362][1];
                            }
                            if (~var19 != -1 || var17 != 0) {
                                int var20 = var11;
                                if (super.field8355 != null && ~super.field8355[super.field8362] != 0) {
                                    var20 = super.field8355[super.field8362];
                                }
                                int var21 = super.field8397 * 2048 + -var11 + var20 & 16383;
                                if (~var21 != -1) {
                                    var16.method1133(var21);
                                }
                                int var22 = class231.field3217[var21];
                                int var23 = class231.field3218[var21];
                                int var24 = var17 * var23 + var19 * var22 >> 14;
                                var19 = var19 * var23 + -(var17 * var22) >> 14;
                                var17 = var24;
                            }
                            var16.method1117(var17, var18, var19);
                        }
                        if (super.field8321 != 0) {
                            var16.method1117(0, -super.field8321 << 2, 0);
                        }
                        if (var14) {
                            if (super.field8350 != 0) {
                                var16.method1165(super.field8350);
                            }
                            if (super.field8359 != 0) {
                                var16.method1167(super.field8359);
                            }
                            if (super.field8408 != 0) {
                                var16.method1117(0, super.field8408, 0);
                            }
                        }
                    }
                } else {
                    super.field8418[1] = null;
                }
                if (~super.field8393 != 0 && ~super.field8358 != 0) {
                    class42 var25 = class267.field3625.method3986(-1, super.field8393);
                    boolean var26 = ~var25.field596 == -4 && (~var8 != -1 || ~var9 != -1);
                    int var27 = var4;
                    if (!var26) {
                        if (~super.field8406 != -1) {
                            var27 = var4 | 5;
                        }
                        if (~super.field8318 != -1) {
                            var27 |= 2;
                        }
                        if (super.field8316 != 0) {
                            var27 |= 7;
                        }
                    } else {
                        var27 = var4 | 7;
                    }
                    class283 var28 = super.field8418[2] = var25.method293(arg0, super.field8358, super.field8320, (byte) 49, var27, class274.field3684, super.field8369);
                    if (var28 != null) {
                        if (super.field8316 >= 0 && var5.field8502 != null && var5.field8502[super.field8316] != null) {
                            int var29 = 0;
                            int var30 = 0;
                            int var31 = 0;
                            if (var5.field8502 != null && var5.field8502[super.field8316] != null) {
                                var30 += var5.field8502[super.field8316][1];
                                var29 += var5.field8502[super.field8316][0];
                                var31 += var5.field8502[super.field8316][2];
                            }
                            if (var5.field8511 != null && var5.field8511[super.field8316] != null) {
                                var30 += var5.field8511[super.field8316][1];
                                var31 += var5.field8511[super.field8316][2];
                                var29 += var5.field8511[super.field8316][0];
                            }
                            if (~var31 != -1 || var29 != 0) {
                                int var32 = var11;
                                if (super.field8355 != null && super.field8355[super.field8316] != -1) {
                                    var32 = super.field8355[super.field8316];
                                }
                                int var33 = 16383 & super.field8406 * 2048 + -var11 + var32;
                                if (var33 != 0) {
                                    var28.method1133(var33);
                                }
                                int var34 = class231.field3217[var33];
                                int var35 = class231.field3218[var33];
                                int var36 = var29 * var35 + var31 * var34 >> 14;
                                var31 = var31 * var35 + -(var29 * var34) >> 14;
                                var29 = var36;
                            }
                            var28.method1117(var29, var30, var31);
                        } else if (super.field8406 != 0) {
                            var28.method1133(super.field8406 * 2048);
                        }
                        if (~super.field8318 != -1) {
                            var28.method1117(0, -super.field8318 << 2, 0);
                        }
                        if (var26) {
                            if (~super.field8350 != -1) {
                                var28.method1165(super.field8350);
                            }
                            if (~super.field8359 != -1) {
                                var28.method1167(super.field8359);
                            }
                            if (super.field8408 != 0) {
                                var28.method1117(0, super.field8408, 0);
                            }
                        }
                    }
                } else {
                    super.field8418[2] = null;
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "n", descriptor = "(I)V")
    public static void method369(int arg0) {
        if (arg0 < -71) {
            field768 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "o", descriptor = "(I)Z")
    public final boolean method370(int arg0) {
        ++field772;
        if (arg0 != -713165362) {
            this.method379((class11) null, -80);
        }
        return this.field771 != null;
    }

    @OriginalMember(owner = "client!am", name = "l", descriptor = "(I)I")
    public final int method371(int arg0) {
        ++field769;
        if (this.field771.field111 != null) {
            class11 var2 = this.field771.method55((byte) 118, class554.field7826);
            if (var2 != null && ~var2.field150 != 0) {
                return var2.field150;
            }
        }
        return arg0 != -7508 ? -37 : this.field771.field150;
    }

    @OriginalMember(owner = "client!am", name = "p", descriptor = "(I)Z")
    private final boolean method372(int arg0) {
        ++field780;
        return arg0 != 0 ? false : this.field771.field139;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(B)Z")
    public final boolean method373(byte arg0) {
        ++field764;
        if (arg0 != -57) {
            this.field781 = -108;
        }
        return false;
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(I)I")
    public final int method374(int arg0) {
        ++field767;
        if (this.field771.field111 != null) {
            class11 var2 = this.field771.method55((byte) 118, class554.field7826);
            if (var2 != null && var2.field158 != -1) {
                return var2.field158;
            }
        }
        if (arg0 != 0) {
            this.field771 = null;
        }
        return ~this.field771.field158 == 0 ? super.method374(0) : this.field771.field158;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIZ)I")
    public static final int method375(int arg0, int arg1, boolean arg2) {
        ++field762;
        int var3 = 0;
        while (arg1 > 0) {
            var3 = var3 << 1 | 1 & arg0;
            arg0 >>>= 1;
            --arg1;
        }
        if (!arg2) {
            method375(25, 38, false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!am", name = "h", descriptor = "(I)I")
    public final int method376(int arg0) {
        if (arg0 != 0) {
            this.field761 = -114;
        }
        ++field779;
        return this.field771 == null ? 0 : this.field771.field152;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)I")
    public final int method377(byte arg0) {
        ++field763;
        if (arg0 <= 4) {
            this.method373((byte) 118);
        }
        if (this.field771.field111 != null) {
            class11 var2 = this.field771.method55((byte) 118, class554.field7826);
            if (var2 != null && var2.field105 != -1) {
                return var2.field105;
            }
        }
        return this.field771.field105;
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(ILha;)V")
    public final void method271(int arg0, class545 arg1) {
        ++field776;
        if (this.field771 != null) {
            if (super.field8415 || this.method368(arg1, 0, -115)) {
                class723 var3 = arg1.method2087();
                int var4 = -119 % ((-15 - arg0) / 57);
                var3.method866(super.field8327.method2661(-27));
                var3.method851(super.field9490, super.field9502 + -20, super.field9489);
                this.method3479(super.field8418, var3, arg1, super.field8415, (byte) -122);
                super.field8418[0] = super.field8418[1] = super.field8418[2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method378(byte arg0, byte[] arg1) {
        ++field774;
        int var2 = -74 % ((arg0 - -56) / 63);
        int var3 = arg1.length;
        byte[] var4 = new byte[var3];
        class34.method245(arg1, 0, var4, 0, var3);
        return var4;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lha;III)Z")
    public final boolean method273(class545 arg0, int arg1, int arg2, int arg3) {
        ++field760;
        if (this.field771 != null && this.method368(arg0, 131072, -92)) {
            class723 var5 = arg0.method2087();
            if (arg3 != -1) {
                this.field771 = null;
            }
            int var6 = super.field8327.method2661(-125);
            var5.method866(var6);
            var5.method851(super.field9490, super.field9502, super.field9489);
            boolean var7 = false;
            for (int var8 = 0; ~var8 > ~super.field8418.length; ++var8) {
                if (super.field8418[var8] != null) {
                    boolean var10000;
                    label47: {
                        if (this.field771.field152 <= 0) {
                            label45: {
                                if (this.field771.field114 == -1) {
                                    if (~this.field771.field134 == -2) {
                                        break label45;
                                    }
                                    var10000 = false;
                                } else {
                                    if (~this.field771.field114 == -2) {
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
                    if (!class286.field3774) {
                        var10 = super.field8418[var8].method1155(arg1, arg2, var5, var9, this.field771.field152);
                    } else {
                        var10 = super.field8418[var8].method1151(arg1, arg2, var5, var9, this.field771.field152, class527.field7375);
                    }
                    if (var10) {
                        var7 = true;
                        break;
                    }
                }
            }
            super.field8418[0] = super.field8418[1] = super.field8418[2] = null;
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Liea;I)V")
    public final void method379(class11 arg0, int arg1) {
        ++field775;
        if (arg1 > -114) {
            this.method380((byte) 105);
        }
        this.field771 = arg0;
        if (super.field8413 != null) {
            super.field8413.method1339();
        }
    }

    @OriginalMember(owner = "client!am", name = "e", descriptor = "(B)V")
    public final void method380(byte arg0) {
        int var2 = -35 / ((arg0 - -45) / 42);
        ++field765;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(ILha;)Lgp;")
    public final class551 method274(int arg0, class545 arg1) {
        if (arg0 != 0) {
            this.field761 = 57;
        }
        ++field777;
        return null;
    }
}
