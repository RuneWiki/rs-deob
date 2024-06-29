import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class309 extends class164 implements class351 {

    @OriginalMember(owner = "client!vc", name = "Q", descriptor = "B")
    private byte field4421;

    @OriginalMember(owner = "client!vc", name = "G", descriptor = "Z")
    private boolean field4411;

    @OriginalMember(owner = "client!vc", name = "N", descriptor = "S")
    private short field4418;

    @OriginalMember(owner = "client!vc", name = "cb", descriptor = "B")
    private byte field4433;

    @OriginalMember(owner = "client!vc", name = "P", descriptor = "B")
    private byte field4420;

    @OriginalMember(owner = "client!vc", name = "db", descriptor = "Z")
    private boolean field4434;

    @OriginalMember(owner = "client!vc", name = "Z", descriptor = "Z")
    private boolean field4430;

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "Loc;")
    private class93 field4413;

    @OriginalMember(owner = "client!vc", name = "X", descriptor = "Lqc;")
    private class95 field4428;

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "J")
    public static volatile long field4414 = 0L;

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "I")
    public static int field4409 = 0;

    @OriginalMember(owner = "client!vc", name = "V", descriptor = "Ljava/lang/String;")
    public static String field4426 = null;

    @OriginalMember(owner = "client!vc", name = "ab", descriptor = "Z")
    public static boolean field4431 = false;

    @OriginalMember(owner = "client!vc", name = "eb", descriptor = "Ljava/lang/String;")
    public static String field4435 = "Drop";

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!vc", name = "F", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!vc", name = "H", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!vc", name = "M", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!vc", name = "O", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!vc", name = "R", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!vc", name = "S", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!vc", name = "T", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!vc", name = "U", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!vc", name = "W", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!vc", name = "Y", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!vc", name = "bb", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "[I")
    public static int[] field4407;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(B)V", line = 3)
    public final void method158(byte arg0) {
        if (arg0 != 6) {
            field4409 = -28;
        }
        ++field4416;
        if (this.field4428 != null) {
            this.field4428.method587();
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(Lnr;Z)Lg;", line = 17)
    public final class433 method145(class437 arg0, boolean arg1) {
        ++field4417;
        if (this.field4428 == null) {
            return null;
        } else {
            if (arg1) {
                this.method154(13, (class437) null);
            }
            class116 var3 = arg0.method2026();
            var3.method809(super.field2133 + super.field2132, super.field2129, super.field2135 + super.field2127);
            class433 var4 = null;
            if (this.field4434) {
                var4 = class436.method2758(1, 12300);
            }
            this.field4428.method602(var3, var4 != null ? var4.field6381[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "([[BILnr;[ZLtc;[[BII[[BIILlf;II)V", line = 42)
    public static final void method1931(byte[][] arg0, int arg1, class437 arg2, boolean[] arg3, class291 arg4, byte[][] arg5, int arg6, int arg7, byte[][] arg8, int arg9, int arg10, class340 arg11, int arg12, int arg13) {
        if (arg4 != null && arg11 != null || arg11 != null && arg1 == 12 || arg4 != null && ~arg1 == -1) {
            boolean[] var14 = arg4 != null && arg4.field4218 ? class226.field3187[arg1] : class171.field2255[arg1];
            if (arg9 > 0) {
                if (~arg13 < -1) {
                    int var15 = 255 & arg5[arg13 + -1][arg9 + -1];
                    if (var15 > 0) {
                        class291 var16 = class404.method2623(false, var15 + -1);
                        if (var16.field4209 != -1 && var16.field4218) {
                            byte var17 = arg0[arg13 - 1][arg9 + -1];
                            int var18 = arg8[arg13 + -1][arg9 + -1] * 2 + 4 & 7;
                            int var19 = class451.method2820((byte) 50, arg2, var16);
                            if (class97.field1328[var17][var18]) {
                                class219.field3109[0] = var16.field4209;
                                class6.field63[0] = var19;
                                class184.field2494[0] = arg2.method2112() ? var16.field4203 : var16.field4208;
                                class74.field1002[0] = var16.field4216;
                                class23.field387[0] = var16.field4221;
                                class308.field4399[0] = 256;
                            }
                        }
                    }
                }
                if (~arg13 > ~(arg10 + -1)) {
                    int var20 = arg5[arg13 - -1][arg9 + -1] & 255;
                    if (var20 > 0) {
                        class291 var21 = class404.method2623(false, var20 + -1);
                        if (var21.field4209 != -1 && var21.field4218) {
                            byte var22 = arg0[arg13 + 1][arg9 + -1];
                            int var23 = arg8[arg13 + 1][arg9 - 1] * 2 + 6 & 7;
                            int var24 = class451.method2820((byte) 50, arg2, var21);
                            if (class97.field1328[var22][var23]) {
                                class219.field3109[2] = var21.field4209;
                                class6.field63[2] = var24;
                                class184.field2494[2] = arg2.method2112() ? var21.field4203 : var21.field4208;
                                class74.field1002[2] = var21.field4216;
                                class23.field387[2] = var21.field4221;
                                class308.field4399[2] = 512;
                            }
                        }
                    }
                }
            }
            if (~arg9 > ~(arg7 + -1)) {
                if (arg13 > 0) {
                    int var25 = arg5[arg13 + -1][arg9 + 1] & 255;
                    if (var25 > 0) {
                        class291 var26 = class404.method2623(false, var25 - 1);
                        if (~var26.field4209 != 0 && var26.field4218) {
                            byte var27 = arg0[arg13 + -1][arg9 + 1];
                            int var28 = arg8[arg13 - 1][arg9 - -1] * 2 + 2 & 7;
                            int var29 = class451.method2820((byte) 50, arg2, var26);
                            if (class97.field1328[var27][var28]) {
                                class219.field3109[6] = var26.field4209;
                                class6.field63[6] = var29;
                                class184.field2494[6] = arg2.method2112() ? var26.field4203 : var26.field4208;
                                class74.field1002[6] = var26.field4216;
                                class23.field387[6] = var26.field4221;
                                class308.field4399[6] = 64;
                            }
                        }
                    }
                }
                if (arg13 < arg10 + -1) {
                    int var30 = 255 & arg5[arg13 + 1][arg9 - -1];
                    if (var30 > 0) {
                        class291 var31 = class404.method2623(false, var30 + -1);
                        if (var31.field4209 != -1 && var31.field4218) {
                            byte var32 = arg0[arg13 + 1][arg9 + 1];
                            int var33 = 7 & arg8[arg13 + 1][arg9 - -1] * 2;
                            int var34 = class451.method2820((byte) 50, arg2, var31);
                            if (class97.field1328[var32][var33]) {
                                class219.field3109[4] = var31.field4209;
                                class6.field63[4] = var34;
                                class184.field2494[4] = !arg2.method2112() ? var31.field4208 : var31.field4203;
                                class74.field1002[4] = var31.field4216;
                                class23.field387[4] = var31.field4221;
                                class308.field4399[4] = 128;
                            }
                        }
                    }
                }
            }
            if (arg9 > 0) {
                int var35 = arg5[arg13][arg9 + -1] & 255;
                if (var35 > 0) {
                    class291 var36 = class404.method2623(false, var35 + -1);
                    if (~var36.field4209 != 0) {
                        byte var37 = arg0[arg13][arg9 + -1];
                        byte var38 = arg8[arg13][arg9 + -1];
                        if (!var36.field4218) {
                            if (!var14[arg6 & 3]) {
                                arg3[0] = class171.field2255[var37][class401.method2606(3, var38 + 2)];
                            }
                        } else {
                            int var39 = 2;
                            int var40 = var38 * 2 + 4;
                            int var41 = class451.method2820((byte) 50, arg2, var36);
                            for (int var42 = 0; var42 < 3; ++var42) {
                                var40 &= 7;
                                var39 &= 7;
                                if (class97.field1328[var37][var40] && class23.field387[var39] <= var36.field4221) {
                                    class219.field3109[var39] = var36.field4209;
                                    class6.field63[var39] = var41;
                                    class184.field2494[var39] = !arg2.method2112() ? var36.field4208 : var36.field4203;
                                    class74.field1002[var39] = var36.field4216;
                                    if (class23.field387[var39] != var36.field4221) {
                                        class308.field4399[var39] = 32;
                                    } else {
                                        class308.field4399[var39] = class128.method871(class308.field4399[var39], 32);
                                    }
                                    class23.field387[var39] = var36.field4221;
                                }
                                ++var40;
                                --var39;
                            }
                            if (!var14[arg6 & 3]) {
                                arg3[0] = class226.field3187[var37][class401.method2606(3, var38 + 2)];
                            }
                        }
                    }
                }
            }
            if (arg9 < arg7 + -1) {
                int var43 = 255 & arg5[arg13][arg9 - -1];
                if (var43 > 0) {
                    class291 var44 = class404.method2623(false, var43 - 1);
                    if (~var44.field4209 != 0) {
                        byte var45 = arg0[arg13][arg9 + 1];
                        byte var46 = arg8[arg13][arg9 - -1];
                        if (!var44.field4218) {
                            if (!var14[3 & arg6 + 2]) {
                                arg3[2] = class171.field2255[var45][class401.method2606(var46, 3)];
                            }
                        } else {
                            int var47 = 4;
                            int var48 = 2 - -(var46 * 2);
                            int var49 = class451.method2820((byte) 50, arg2, var44);
                            for (int var50 = 0; var50 < 3; ++var50) {
                                var47 &= 7;
                                var48 &= 7;
                                if (class97.field1328[var45][var48] && ~var44.field4221 <= ~class23.field387[var47]) {
                                    class219.field3109[var47] = var44.field4209;
                                    class6.field63[var47] = var49;
                                    class184.field2494[var47] = arg2.method2112() ? var44.field4203 : var44.field4208;
                                    class74.field1002[var47] = var44.field4216;
                                    if (~class23.field387[var47] != ~var44.field4221) {
                                        class308.field4399[var47] = 16;
                                    } else {
                                        class308.field4399[var47] = class128.method871(class308.field4399[var47], 16);
                                    }
                                    class23.field387[var47] = var44.field4221;
                                }
                                --var48;
                                ++var47;
                            }
                            if (!var14[3 & 2 - -arg6]) {
                                arg3[2] = class226.field3187[var45][class401.method2606(var46, 3)];
                            }
                        }
                    }
                }
            }
            if (arg13 > 0) {
                int var51 = arg5[arg13 + -1][arg9] & 255;
                if (var51 > 0) {
                    class291 var52 = class404.method2623(false, var51 + -1);
                    if (var52.field4209 != -1) {
                        byte var53 = arg0[arg13 - 1][arg9];
                        byte var54 = arg8[arg13 - 1][arg9];
                        if (!var52.field4218) {
                            if (!var14[3 - -arg6 & 3]) {
                                arg3[3] = class171.field2255[var53][class401.method2606(var54 + 1, 3)];
                            }
                        } else {
                            int var55 = 6;
                            int var56 = 4 - -(var54 * 2);
                            int var57 = class451.method2820((byte) 50, arg2, var52);
                            for (int var58 = 0; ~var58 > -4; ++var58) {
                                var55 &= 7;
                                var56 &= 7;
                                if (class97.field1328[var53][var56] && class23.field387[var55] <= var52.field4221) {
                                    class219.field3109[var55] = var52.field4209;
                                    class6.field63[var55] = var57;
                                    class184.field2494[var55] = !arg2.method2112() ? var52.field4208 : var52.field4203;
                                    class74.field1002[var55] = var52.field4216;
                                    if (class23.field387[var55] == var52.field4221) {
                                        class308.field4399[var55] = class128.method871(class308.field4399[var55], 8);
                                    } else {
                                        class308.field4399[var55] = 8;
                                    }
                                    class23.field387[var55] = var52.field4221;
                                }
                                --var56;
                                ++var55;
                            }
                            if (!var14[3 & arg6 + 3]) {
                                arg3[3] = class226.field3187[var53][class401.method2606(3, var54 + 1)];
                            }
                        }
                    }
                }
            }
            if (~(arg10 + -1) < ~arg13) {
                int var59 = 255 & arg5[arg13 + 1][arg9];
                if (var59 > 0) {
                    class291 var60 = class404.method2623(false, var59 + -1);
                    if (var60.field4209 != -1) {
                        byte var61 = arg0[arg13 + 1][arg9];
                        byte var62 = arg8[arg13 + 1][arg9];
                        if (!var60.field4218) {
                            if (!var14[1 - -arg6 & 3]) {
                                arg3[1] = class171.field2255[var61][class401.method2606(3, var62 + 3)];
                            }
                        } else {
                            int var63 = 4;
                            int var64 = 6 - -(var62 * 2);
                            int var65 = class451.method2820((byte) 50, arg2, var60);
                            for (int var66 = 0; var66 < 3; ++var66) {
                                var64 &= 7;
                                var63 &= 7;
                                if (class97.field1328[var61][var64] && var60.field4221 >= class23.field387[var63]) {
                                    class219.field3109[var63] = var60.field4209;
                                    class6.field63[var63] = var65;
                                    class184.field2494[var63] = arg2.method2112() ? var60.field4203 : var60.field4208;
                                    class74.field1002[var63] = var60.field4216;
                                    if (class23.field387[var63] != var60.field4221) {
                                        class308.field4399[var63] = 4;
                                    } else {
                                        class308.field4399[var63] = class128.method871(class308.field4399[var63], 4);
                                    }
                                    class23.field387[var63] = var60.field4221;
                                }
                                ++var64;
                                --var63;
                            }
                            if (!var14[arg6 + 1 & 3]) {
                                arg3[1] = class226.field3187[var61][class401.method2606(var62 + 3, 3)];
                            }
                        }
                    }
                }
            }
        }
        ++field4422;
        if (arg4 != null) {
            int var67 = class451.method2820((byte) 50, arg2, arg4);
            if (arg4.field4218) {
                for (int var68 = 0; ~var68 > -9; ++var68) {
                    int var69 = -(arg6 * 2) + var68 & 7;
                    if (class97.field1328[arg1][var68] && arg4.field4221 >= class23.field387[var69]) {
                        class219.field3109[var69] = arg4.field4209;
                        class6.field63[var69] = var67;
                        class184.field2494[var69] = arg2.method2112() ? arg4.field4203 : arg4.field4208;
                        class74.field1002[var69] = arg4.field4216;
                        if (class23.field387[var69] != arg4.field4221) {
                            class308.field4399[var69] = 2;
                        } else {
                            class308.field4399[var69] = class128.method871(class308.field4399[var69], 2);
                        }
                        class23.field387[var69] = arg4.field4221;
                    }
                }
            }
        }
        if (arg12 != 1) {
            field4426 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIILnr;)V", line = 513)
    public static final void method1932(int arg0, int arg1, int arg2, class437 arg3) {
        ++field4415;
        class416.field6195 = new class262[arg1][arg0];
        class24.field417 = arg3;
        if (class65.field921 != null) {
            class300.field4316 = class258.method1624((byte) -17, class65.field921[3], class65.field921[1], class65.field921[5], class65.field921[4], class65.field921[0], class65.field921[2]);
        }
        if (arg2 <= 101) {
            field4435 = null;
        }
        class152.field1987 = new class262();
        class184.method1137(7716);
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lnr;Lta;IIIIZIIIII)V", line = 532)
    public class309(class437 arg0, class404 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class6.method49(arg10, (byte) 115, arg11));
        this.field4421 = (byte) arg2;
        super.field2132 = (short) arg3;
        this.field4411 = arg6;
        super.field2135 = (short) arg5;
        this.field4418 = (short) arg1.field6059;
        this.field4433 = (byte) arg11;
        this.field4420 = (byte) arg10;
        this.field4434 = arg1.field6009 != 0 && !arg6;
        this.field4430 = arg0.method2086() && arg1.field6081 && !this.field4411 && ~class176.field2300 != -1;
        class284 var13 = this.method1933((byte) 121, 1024, arg0, this.field4430);
        if (var13 != null) {
            this.field4413 = var13.field4143;
            this.field4428 = var13.field4144;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BILnr;Z)Lbc;", line = 556)
    private final class284 method1933(byte arg0, int arg1, class437 arg2, boolean arg3) {
        ++field4423;
        class404 var5 = class165.method1020(this.field4418 & 65535, -18);
        if (arg0 != 121) {
            this.method1933((byte) 80, 36, (class437) null, false);
        }
        class337 var6;
        class337 var7;
        if (this.field4411) {
            var6 = class198.field2829[0];
            var7 = class425.field6324[this.field4421];
        } else {
            var7 = class198.field2829[this.field4421];
            if (~this.field4421 > -4) {
                var6 = class198.field2829[this.field4421 + 1];
            } else {
                var6 = null;
            }
        }
        return var5.method2622(this.field4420, arg2, var7, this.field4433, super.field2135, super.field2132, super.field2129, arg1, var6, arg0 ^ 1, arg3);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BILnr;)Lqc;", line = 589)
    public final class95 method147(byte arg0, int arg1, class437 arg2) {
        ++field4406;
        int var4 = -24 % ((arg0 - -32) / 61);
        return this.method1934(0, arg2, arg1);
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)I", line = 599)
    public final int method150(byte arg0) {
        if (arg0 >= -110) {
            method1931((byte[][]) null, -108, (class437) null, (boolean[]) null, (class291) null, (byte[][]) null, 51, 25, (byte[][]) null, 120, 86, (class340) null, -16, 23);
        }
        ++field4408;
        return this.field4418 & 65535;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILnr;I)Lqc;", line = 610)
    private final class95 method1934(int arg0, class437 arg1, int arg2) {
        ++field4419;
        if (arg0 != 0) {
            return null;
        } else if (this.field4428 != null && arg1.method2132(this.field4428.method594(), arg2) == 0) {
            return this.field4428;
        } else {
            class284 var4 = this.method1933((byte) 121, arg2, arg1, false);
            return var4 != null ? var4.field4144 : null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lnr;Z)V", line = 638)
    public final void method156(class437 arg0, boolean arg1) {
        ++field4427;
        Object var3 = null;
        class93 var5;
        if (this.field4413 == null && this.field4430) {
            class284 var4 = this.method1933((byte) 121, 131072, arg0, true);
            var5 = var4 == null ? null : var4.field4143;
        } else {
            var5 = this.field4413;
            this.field4413 = null;
        }
        if (var5 != null) {
            class132.method897(var5, this.field4421, super.field2132, super.field2135, (boolean[]) null);
        }
        if (arg1) {
            field4431 = false;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)Z", line = 666)
    public final boolean method146(byte arg0) {
        if (arg0 < 102) {
            return false;
        } else {
            ++field4412;
            return this.field4430;
        }
    }

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "(I)I", line = 678)
    public final int method293(int arg0) {
        int var2 = -16 / ((arg0 - 39) / 50);
        ++field4405;
        return this.field4428 != null ? this.field4428.method597() : 0;
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(B)I", line = 695)
    public final int method148(byte arg0) {
        ++field4429;
        if (arg0 != -68) {
            this.field4411 = false;
        }
        return this.field4433;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)I", line = 713)
    public final int method160(int arg0) {
        ++field4432;
        return arg0 != -22056 ? 74 : this.field4420;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILnr;II)Z", line = 725)
    public final boolean method159(int arg0, class437 arg1, int arg2, int arg3) {
        ++field4425;
        class95 var5 = this.method1934(0, arg1, 65536);
        if (var5 != null) {
            class116 var6 = arg1.method2026();
            var6.method809(super.field2132, super.field2129, super.field2135);
            return var5.method619(arg2, arg0, var6, false);
        } else {
            if (arg3 < 12) {
                this.field4411 = true;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILnr;)V", line = 751)
    public final void method154(int arg0, class437 arg1) {
        if (arg0 != 25510) {
            this.method160(-44);
        }
        ++field4424;
        Object var3 = null;
        class93 var5;
        if (this.field4413 == null && this.field4430) {
            class284 var4 = this.method1933((byte) 121, 131072, arg1, true);
            var5 = var4 != null ? var4.field4143 : null;
        } else {
            var5 = this.field4413;
            this.field4413 = null;
        }
        if (var5 != null) {
            class8.method61(var5, this.field4421, super.field2132, super.field2135, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lnr;I)V", line = 786)
    public final void method161(class437 arg0, int arg1) {
        ++field4410;
        if (arg1 != 0) {
            field4426 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V", line = 798)
    public static void method1935(boolean arg0) {
        field4426 = null;
        field4435 = null;
        field4407 = null;
        if (!arg0) {
            method1935(true);
        }
    }
}
