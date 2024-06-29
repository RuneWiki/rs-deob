import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class186 extends class354 {

    @OriginalMember(owner = "client!ol", name = "M", descriptor = "F")
    public static float field2767 = 0.25F;

    @OriginalMember(owner = "client!ol", name = "N", descriptor = "[[Z")
    public static boolean[][] field2768 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!ol", name = "O", descriptor = "Lvp;")
    public static class123 field2769 = new class123(52, -1);

    @OriginalMember(owner = "client!ol", name = "H", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!ol", name = "I", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!ol", name = "J", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!ol", name = "K", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!ol", name = "L", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZILir;)V", line = 5)
    public static final void method1288(boolean arg0, int arg1, class22 arg2) {
        ++field2762;
        class441 var3 = arg2.method192(true);
        if (~arg2.field412 == -1) {
            arg2.field408 = 0;
            class459.field6769 = -1;
            class432.field6300 = 0;
        } else {
            if (arg2.field320 != -1 && arg2.field345 == 0) {
                class357 var4 = class311.field4455.method1233(true, arg2.field320);
                if (~arg2.field411 < -1 && var4.field5406 == 0) {
                    ++arg2.field408;
                    class459.field6769 = -1;
                    class432.field6300 = 0;
                    return;
                }
                if (~arg2.field411 >= -1 && ~var4.field5396 == -1) {
                    class432.field6300 = 0;
                    class459.field6769 = -1;
                    ++arg2.field408;
                    return;
                }
            }
            if (arg2.field359 != -1 && class180.field2734 >= arg2.field396) {
                class246 var5 = class450.field6582.method1475(arg2.field359, true);
                if (var5.field3543 && ~var5.field3547 != 0) {
                    class357 var6 = class311.field4455.method1233(true, var5.field3547);
                    if (~arg2.field411 < -1 && ~var6.field5406 == -1) {
                        ++arg2.field408;
                        class432.field6300 = 0;
                        class459.field6769 = -1;
                        return;
                    }
                    if (~arg2.field411 >= -1 && var6.field5396 == 0) {
                        class459.field6769 = -1;
                        ++arg2.field408;
                        class432.field6300 = 0;
                        return;
                    }
                }
            }
            if (arg2.field359 != -1 && arg2.field396 <= class180.field2734) {
                class246 var7 = class450.field6582.method1475(arg2.field359, true);
                if (var7.field3543 && var7.field3547 != -1) {
                    class357 var8 = class311.field4455.method1233(true, var7.field3547);
                    if (~arg2.field411 < -1 && ~var8.field5406 == -1) {
                        class459.field6769 = -1;
                        ++arg2.field408;
                        class432.field6300 = 0;
                        return;
                    }
                    if (~arg2.field411 >= -1 && ~var8.field5396 == -1) {
                        class459.field6769 = -1;
                        ++arg2.field408;
                        class432.field6300 = 0;
                        return;
                    }
                }
            }
            int var9 = arg2.field5529;
            int var10 = arg2.field5539;
            int var11 = arg2.field409[arg2.field412 + -1] * 128 - -(arg2.method184(arg1 ^ -8279) * 64);
            int var12 = arg2.field416[arg2.field412 - 1] * 128 - -(64 * arg2.method184(arg1 + 8281));
            if (var11 > var9) {
                if (var12 > var10) {
                    arg2.method187(10240, arg1 ^ -8280);
                } else if (var10 <= var12) {
                    arg2.method187(12288, arg1 ^ -8280);
                } else {
                    arg2.method187(14336, 0);
                }
            } else if (~var9 < ~var11) {
                if (~var10 <= ~var12) {
                    if (~var10 < ~var12) {
                        arg2.method187(2048, arg1 ^ -8280);
                    } else {
                        arg2.method187(4096, 0);
                    }
                } else {
                    arg2.method187(6144, 0);
                }
            } else if (~var10 <= ~var12) {
                if (~var10 < ~var12) {
                    arg2.method187(0, 0);
                }
            } else {
                arg2.method187(8192, 0);
            }
            byte var13 = arg2.field413[arg2.field412 - 1];
            if (!arg0 && (-var9 + var11 > 256 || -var9 + var11 < -256 || ~(var12 - var10) < -257 || ~(-var10 + var12) > 255)) {
                arg2.field5529 = var11;
                arg2.field5539 = var12;
                arg2.method186(15505, arg2.field357);
                --arg2.field412;
                if (~arg2.field411 < -1) {
                    --arg2.field411;
                }
                class432.field6300 = 0;
                class459.field6769 = -1;
            } else {
                int var14 = 4;
                boolean var15 = true;
                if (arg2 instanceof class13) {
                    var15 = ((class13) arg2).field210.field2187;
                }
                if (var15) {
                    int var16 = -arg2.field338.field7089 + arg2.field357;
                    if (~var16 != -1 && arg2.field355 == -1 && arg2.field385 != 0) {
                        var14 = 2;
                    }
                    if (!arg0 && arg2.field412 > 2) {
                        var14 = 6;
                    }
                    if (!arg0 && arg2.field412 > 3) {
                        var14 = 8;
                    }
                } else {
                    if (!arg0 && ~arg2.field412 < -2) {
                        var14 = 6;
                    }
                    if (!arg0 && arg2.field412 > 2) {
                        var14 = 8;
                    }
                }
                if (~arg2.field408 < -1 && ~arg2.field412 < -2) {
                    var14 = 8;
                    --arg2.field408;
                }
                if (~var13 != -3) {
                    if (~var13 == -1) {
                        var14 >>= 1;
                    }
                } else {
                    var14 <<= 1;
                }
                class432.field6300 = 0;
                if (arg1 != -8280) {
                    method1289(-64);
                }
                if (~var3.field6438 != 0) {
                    int var17 = var14 << 7;
                    if (~arg2.field412 == -2) {
                        int var18 = arg2.field407 * arg2.field407;
                        int var19 = (~var11 > ~arg2.field5529 ? -var11 + arg2.field5529 : -arg2.field5529 + var11) << 7;
                        int var20 = (var12 < arg2.field5539 ? -var12 + arg2.field5539 : -arg2.field5539 + var12) << 7;
                        int var21 = var19 <= var20 ? var20 : var19;
                        int var22 = var21 * 2 * var3.field6438;
                        if (~var22 > ~var18) {
                            arg2.field407 /= 2;
                        } else if (~(var18 / 2) < ~var21) {
                            arg2.field407 -= var3.field6438;
                            if (arg2.field407 < 0) {
                                arg2.field407 = 0;
                            }
                        } else if (~arg2.field407 > ~var17) {
                            arg2.field407 += var3.field6438;
                            if (~var17 > ~arg2.field407) {
                                arg2.field407 = var17;
                            }
                        }
                    } else if (arg2.field407 >= var17) {
                        if (arg2.field407 > 0) {
                            arg2.field407 -= var3.field6438;
                            if (~arg2.field407 > -1) {
                                arg2.field407 = 0;
                            }
                        }
                    } else {
                        arg2.field407 += var3.field6438;
                        if (~arg2.field407 < ~var17) {
                            arg2.field407 = var17;
                        }
                    }
                    var14 = arg2.field407 >> 7;
                    if (var14 < 1) {
                        var14 = 1;
                    }
                }
                if (~var9 > ~var11) {
                    class432.field6300 |= 4;
                    arg2.field5529 += var14;
                    if (~arg2.field5529 < ~var11) {
                        arg2.field5529 = var11;
                    }
                } else if (var9 > var11) {
                    class432.field6300 |= 8;
                    arg2.field5529 -= var14;
                    if (arg2.field5529 < var11) {
                        arg2.field5529 = var11;
                    }
                }
                if (var10 >= var12) {
                    if (~var12 > ~var10) {
                        arg2.field5539 -= var14;
                        class432.field6300 |= 2;
                        if (~var12 < ~arg2.field5539) {
                            arg2.field5539 = var12;
                        }
                    }
                } else {
                    class432.field6300 |= 1;
                    arg2.field5539 += var14;
                    if (arg2.field5539 > var12) {
                        arg2.field5539 = var12;
                    }
                }
                if (var14 < 8) {
                    class459.field6769 = var13;
                } else {
                    class459.field6769 = 2;
                }
                if (~arg2.field5529 == ~var11 && arg2.field5539 == var12) {
                    if (~arg2.field411 < -1) {
                        --arg2.field411;
                    }
                    --arg2.field412;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IB)[I", line = 338)
    public final int[] method253(int arg0, byte arg1) {
        ++field2764;
        int[] var3 = super.field5357.method861(true, arg0);
        if (super.field5357.field1869) {
            int[] var4 = this.method2293(0, arg0, (byte) 69);
            for (int var5 = 0; class404.field5952 > var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        if (arg1 != -95) {
            method1290(-94);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V", line = 373)
    public class186() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILti;I)V", line = 380)
    public final void method206(int arg0, class303 arg1, int arg2) {
        if (~arg2 == -1) {
            super.field5354 = arg1.method1918((byte) 70) == 1;
        }
        if (arg0 != 15180) {
            field2767 = 0.7505817F;
        }
        ++field2763;
    }

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "(I)V", line = 393)
    public static final void method1289(int arg0) {
        class23.field420.method2137(arg0 ^ 27254);
        ++field2766;
        class251.field3626 = null;
        class43.field655 = 1;
        if (arg0 != 28924) {
            method1288(true, 119, (class22) null);
        }
    }

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "(I)V", line = 410)
    public static void method1290(int arg0) {
        field2768 = null;
        field2769 = null;
        if (arg0 != -9061) {
            method1289(86);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BI)[[I", line = 428)
    public final int[][] method207(byte arg0, int arg1) {
        ++field2765;
        if (arg0 >= -40) {
            this.method206(93, (class303) null, 94);
        }
        int[][] var3 = super.field5351.method2819((byte) -101, arg1);
        if (super.field5351.field6959) {
            int[][] var4 = this.method2291(0, (byte) -124, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class404.field5952 < ~var11; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }
}
