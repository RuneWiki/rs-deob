import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class547 extends class274 {

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "F")
    private float field7812 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!bh", name = "U", descriptor = "F")
    private float field7837 = -3.4028235E38F;

    @OriginalMember(owner = "client!bh", name = "H", descriptor = "Lgk;")
    private class616 field7824 = new class616();

    @OriginalMember(owner = "client!bh", name = "Q", descriptor = "Lmj;")
    public class344 field7833;

    @OriginalMember(owner = "client!bh", name = "K", descriptor = "I")
    private int field7827;

    @OriginalMember(owner = "client!bh", name = "eb", descriptor = "[[F")
    private float[][] field7847;

    @OriginalMember(owner = "client!bh", name = "J", descriptor = "[[[I")
    public int[][][] field7826;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "[[[I")
    private int[][][] field7805;

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "I")
    public int field7816;

    @OriginalMember(owner = "client!bh", name = "L", descriptor = "[[[I")
    public int[][][] field7828;

    @OriginalMember(owner = "client!bh", name = "A", descriptor = "[[[Ldn;")
    private class280[][][] field7817;

    @OriginalMember(owner = "client!bh", name = "B", descriptor = "[[[I")
    public int[][][] field7818;

    @OriginalMember(owner = "client!bh", name = "cb", descriptor = "[[B")
    private byte[][] field7845;

    @OriginalMember(owner = "client!bh", name = "Y", descriptor = "[[F")
    private float[][] field7841;

    @OriginalMember(owner = "client!bh", name = "N", descriptor = "[[[I")
    private int[][][] field7830;

    @OriginalMember(owner = "client!bh", name = "gb", descriptor = "[[F")
    private float[][] field7849;

    @OriginalMember(owner = "client!bh", name = "P", descriptor = "I")
    private int field7832;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "[[S")
    public short[][] field7809;

    @OriginalMember(owner = "client!bh", name = "R", descriptor = "[[B")
    private byte[][] field7834;

    @OriginalMember(owner = "client!bh", name = "db", descriptor = "Lwa;")
    private class661 field7846;

    @OriginalMember(owner = "client!bh", name = "E", descriptor = "Lws;")
    private class580 field7821;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "Lht;")
    public static class607 field7808 = new class607("", 15);

    @OriginalMember(owner = "client!bh", name = "V", descriptor = "Ljd;")
    public static class539 field7838 = new class539();

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
    private int field7804;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
    public static int field7806;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
    public static int field7807;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
    public static int field7811;

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "I")
    public static int field7813;

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "I")
    public static int field7814;

    @OriginalMember(owner = "client!bh", name = "y", descriptor = "I")
    private int field7815;

    @OriginalMember(owner = "client!bh", name = "C", descriptor = "I")
    public static int field7819;

    @OriginalMember(owner = "client!bh", name = "D", descriptor = "I")
    public static int field7820;

    @OriginalMember(owner = "client!bh", name = "F", descriptor = "I")
    public static int field7822;

    @OriginalMember(owner = "client!bh", name = "G", descriptor = "I")
    public static int field7823;

    @OriginalMember(owner = "client!bh", name = "I", descriptor = "I")
    public static int field7825;

    @OriginalMember(owner = "client!bh", name = "M", descriptor = "I")
    public static int field7829;

    @OriginalMember(owner = "client!bh", name = "O", descriptor = "I")
    public static int field7831;

    @OriginalMember(owner = "client!bh", name = "S", descriptor = "I")
    public static int field7835;

    @OriginalMember(owner = "client!bh", name = "T", descriptor = "I")
    public static int field7836;

    @OriginalMember(owner = "client!bh", name = "W", descriptor = "I")
    private int field7839;

    @OriginalMember(owner = "client!bh", name = "fb", descriptor = "I")
    public static int field7848;

    @OriginalMember(owner = "client!bh", name = "hb", descriptor = "I")
    private int field7850;

    @OriginalMember(owner = "client!bh", name = "Z", descriptor = "Lsu;")
    private class155 field7842;

    @OriginalMember(owner = "client!bh", name = "ab", descriptor = "Lsu;")
    private class155 field7843;

    @OriginalMember(owner = "client!bh", name = "X", descriptor = "Lada;")
    public class278 field7840;

    @OriginalMember(owner = "client!bh", name = "bb", descriptor = "[Ldn;")
    private class280[] field7844;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "[[[I")
    private int[][][] field7810;

    @OriginalMember(owner = "client!bh", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method387(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field7823;
        if (arg5 != null && this.field7810 == null) {
            this.field7810 = new int[super.field3428][super.field3426][];
        }
        if (arg3 != null && this.field7805 == null) {
            this.field7805 = new int[super.field3428][super.field3426][];
        }
        this.field7828[arg0][arg1] = arg2;
        this.field7826[arg0][arg1] = arg4;
        this.field7818[arg0][arg1] = arg6;
        this.field7830[arg0][arg1] = arg7;
        if (this.field7810 != null) {
            this.field7810[arg0][arg1] = arg5;
        }
        if (this.field7805 != null) {
            this.field7805[arg0][arg1] = arg3;
        }
        class280[] var15 = this.field7817[arg0][arg1] = new class280[arg6.length];
        for (int var16 = 0; ~var16 > ~arg6.length; ++var16) {
            long var17 = (long) arg8[var16] | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) (arg9[var16] << 14);
            class333 var19;
            for (var19 = this.field7846.method3669(var17, -1); var19 != null; var19 = this.field7846.method3673((byte) 124)) {
                class280 var20 = (class280) var19;
                if (~arg8[var16] == ~var20.field3483 && (float) arg9[var16] == var20.field3478 && var20.field3489 == arg10 && ~var20.field3488 == ~arg11 && ~var20.field3487 == ~arg12) {
                    break;
                }
            }
            if (var19 != null) {
                var15[var16] = (class280) var19;
            } else {
                var15[var16] = new class280(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field7846.method3671(false, var15[var16], var17);
            }
        }
        if (arg13) {
            this.field7834[arg0][arg1] = (byte) class422.method2436(this.field7834[arg0][arg1], 1);
        }
        if (arg6.length > this.field7839) {
            this.field7839 = arg6.length;
        }
        this.field7850 += arg6.length;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V")
    public final void method383(int arg0, int arg1) {
        ++field7836;
    }

    @OriginalMember(owner = "client!bh", name = "BA", descriptor = "()V")
    public final void method392() {
        ++field7848;
        if (~this.field7850 < -1) {
            byte[][] var1 = new byte[super.field3428 + 1][super.field3426 + 1];
            for (int var2 = 1; ~super.field3428 < ~var2; ++var2) {
                for (int var107 = 1; ~super.field3426 < ~var107; ++var107) {
                    var1[var2][var107] = (byte) ((this.field7845[var2][var107 - -1] >> 3) + (this.field7845[var2][var107 + -1] >> 2) + (this.field7845[var2][var107] >> 1) + (this.field7845[var2 - -1][var107] >> 3) + (this.field7845[var2 + -1][var107] >> 2));
                }
            }
            class280[] var3 = new class280[this.field7846.method3668(false)];
            this.field7846.method3675(var3, (byte) 114);
            for (int var4 = 0; var4 < var3.length; ++var4) {
                var3[var4].method1636(false, this.field7850);
            }
            int var5 = 20;
            if (this.field7810 != null) {
                var5 += 4;
            }
            if ((7 & this.field7816) != 0) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field7833.field4407.method3462(this.field7850 * 4, false);
            NativeHeapBuffer var7 = this.field7833.field4407.method3462(this.field7850 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class280[] var10 = new class280[this.field7850];
            int var11 = class668.method3699(28069, this.field7850 / 4);
            if (~var11 > -2) {
                var11 = 1;
            }
            class661 var12 = new class661(var11);
            class280[] var13 = new class280[this.field7839];
            for (int var14 = 0; var14 < super.field3428; ++var14) {
                for (int var34 = 0; var34 < super.field3426; ++var34) {
                    if (this.field7818[var14][var34] != null) {
                        class280[] var35 = this.field7817[var14][var34];
                        int[] var36 = this.field7828[var14][var34];
                        int[] var37 = this.field7826[var14][var34];
                        int[] var38 = this.field7830[var14][var34];
                        int[] var39 = this.field7818[var14][var34];
                        int[] var40 = this.field7805 == null ? null : this.field7805[var14][var34];
                        if (var38 == null) {
                            var38 = var39;
                        }
                        int[] var41 = this.field7810 == null ? null : this.field7810[var14][var34];
                        float var42 = this.field7841[var14][var34];
                        float var43 = this.field7847[var14][var34];
                        float var44 = this.field7849[var14][var34];
                        float var45 = this.field7841[var14][var34 + 1];
                        float var46 = this.field7847[var14][var34 - -1];
                        float var47 = this.field7849[var14][var34 - -1];
                        float var48 = this.field7841[var14 - -1][var34 + 1];
                        float var49 = this.field7847[var14 + 1][var34 + 1];
                        float var50 = this.field7849[var14 - -1][var34 - -1];
                        float var51 = this.field7841[var14 + 1][var34];
                        float var52 = this.field7847[var14 - -1][var34];
                        float var53 = this.field7849[var14 + 1][var34];
                        int var54 = 255 & var1[var14][var34];
                        int var55 = 255 & var1[var14][var34 + 1];
                        int var56 = 255 & var1[var14 - -1][var34 + 1];
                        int var57 = 255 & var1[var14 + 1][var34];
                        int var58 = 0;
                        label360: for (int var59 = 0; var59 < var39.length; ++var59) {
                            class280 var105 = var35[var59];
                            for (int var106 = 0; ~var58 < ~var106; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label360;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field7809[super.field3428 * var34 + var14] = new short[var39.length];
                        for (int var61 = 0; ~var39.length < ~var61; ++var61) {
                            int var62 = (var14 << super.field3430) + var36[var61];
                            int var63 = (var34 << super.field3430) - -var37[var61];
                            int var64 = var62 >> this.field7827;
                            int var65 = var63 >> this.field7827;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 != null ? var40[var61] : 0;
                            long var69 = (long) var66 << 32 | (long) var67 << 48 | (long) (var64 << 16) | (long) var65;
                            int var71 = var36[var61];
                            int var72 = var37[var61];
                            byte var73 = 74;
                            int var74 = 0;
                            float var75 = 1.0F;
                            float var76;
                            float var77;
                            float var78;
                            int var79;
                            if (var71 == 0 && var72 == 0) {
                                var76 = var42;
                                var77 = var43;
                                var78 = var44;
                                var79 = var73 - var54;
                            } else if (var71 == 0 && ~super.field3424 == ~var72) {
                                var79 = var73 - var55;
                                var77 = var46;
                                var76 = var45;
                                var78 = var47;
                            } else if (super.field3424 == var71 && ~super.field3424 == ~var72) {
                                var76 = var48;
                                var77 = var49;
                                var79 = var73 - var56;
                                var78 = var50;
                            } else if (~super.field3424 == ~var71 && ~var72 == -1) {
                                var77 = var52;
                                var76 = var51;
                                var79 = var73 - var57;
                                var78 = var53;
                            } else {
                                float var80 = (float) var71 / (float) super.field3424;
                                float var81 = (float) var72 / (float) super.field3424;
                                float var82 = (var51 - var42) * var80 + var42;
                                float var83 = (var52 - var43) * var80 + var43;
                                float var84 = (-var44 + var53) * var80 + var44;
                                float var85 = (-var45 + var48) * var80 + var45;
                                float var86 = (-var46 + var49) * var80 + var46;
                                float var87 = (-var47 + var50) * var80 + var47;
                                var76 = (var85 - var82) * var81 + var82;
                                var77 = (-var83 + var86) * var81 + var83;
                                var78 = (-var84 + var87) * var81 + var84;
                                int var88 = ((-var54 + var57) * var71 >> super.field3430) + var54;
                                int var89 = ((-var55 + var56) * var71 >> super.field3430) + var55;
                                var79 = var73 - (((-var88 + var89) * var72 >> super.field3430) + var88);
                            }
                            if (~var66 != 0) {
                                int var90 = (127 & var66) * var79 >> 7;
                                if (~var90 > -3) {
                                    var90 = 2;
                                } else if (~var90 < -127) {
                                    var90 = 126;
                                }
                                if ((this.field7816 & 7) == 0) {
                                    float var91 = this.field7833.field4563[2] * var78 + this.field7833.field4563[1] * var77 + this.field7833.field4563[0] * var76;
                                    var75 = var91 * (var91 > 0.0F ? this.field7833.field4602 : this.field7833.field4593) + this.field7833.field4596;
                                }
                                var74 = class194.field2239[var90 | var66 & 65408];
                            }
                            class333 var92 = null;
                            if ((var62 & this.field7832 + -1) == 0 && (var63 & this.field7832 - 1) == 0) {
                                var92 = var12.method3669(var69, -1);
                            }
                            int var103;
                            if (var92 == null) {
                                int var93;
                                if (~var66 == ~var67) {
                                    var93 = var74;
                                } else {
                                    int var94 = (127 & var67) * var79 >> 7;
                                    if (var94 >= 2) {
                                        if (var94 > 126) {
                                            var94 = 126;
                                        }
                                    } else {
                                        var94 = 2;
                                    }
                                    var93 = class194.field2239[var94 | var67 & 65408];
                                    if (~(this.field7816 & 7) == -1) {
                                        float var95 = this.field7833.field4563[2] * var78 + this.field7833.field4563[1] * var77 + this.field7833.field4563[0] * var76;
                                        float var96 = (var75 > 0.0F ? this.field7833.field4602 : this.field7833.field4593) * var75 + this.field7833.field4596;
                                        int var97 = var93 >> 16 & 255;
                                        int var98 = (65350 & var93) >> 8;
                                        int var99 = var93 & 255;
                                        int var100 = (int) ((float) var97 * var96);
                                        int var101 = (int) ((float) var98 * var96);
                                        if (var100 < 0) {
                                            var100 = 0;
                                        } else if (var100 > 255) {
                                            var100 = 255;
                                        }
                                        int var102 = (int) ((float) var99 * var96);
                                        if (~var101 <= -1) {
                                            if (~var101 < -256) {
                                                var101 = 255;
                                            }
                                        } else {
                                            var101 = 0;
                                        }
                                        if (var102 >= 0) {
                                            if (var102 > 255) {
                                                var102 = 255;
                                            }
                                        } else {
                                            var102 = 0;
                                        }
                                        var93 = var101 << 8 | var100 << 16 | var102;
                                    }
                                }
                                if (Stream.method3480()) {
                                    var8.method3469((float) var62);
                                    var8.method3469((float) (var68 + this.method1610(var62, 121, var63)));
                                    var8.method3469((float) var63);
                                    var8.method3469((float) var62);
                                    var8.method3469((float) var63);
                                    if (this.field7810 != null) {
                                        var8.method3469((float) (var41 == null ? 0 : var41[var61] - 1));
                                    }
                                    if ((7 & this.field7816) != 0) {
                                        var8.method3469(var76);
                                        var8.method3469(var77);
                                        var8.method3469(var78);
                                    }
                                } else {
                                    var8.method3475((float) var62);
                                    var8.method3475((float) (var68 + this.method1610(var62, 106, var63)));
                                    var8.method3475((float) var63);
                                    var8.method3475((float) var62);
                                    var8.method3475((float) var63);
                                    if (this.field7810 != null) {
                                        var8.method3475((float) (var41 != null ? var41[var61] + -1 : 0));
                                    }
                                    if ((this.field7816 & 7) != 0) {
                                        var8.method3475(var76);
                                        var8.method3475(var77);
                                        var8.method3475(var78);
                                    }
                                }
                                if (this.field7833.field4519 == 0) {
                                    var9.method3470(-16777216 | var93);
                                } else {
                                    var9.method3467(-16777216 | var93);
                                }
                                var103 = this.field7815++;
                                var60[var61] = (short) var103;
                                if (~var66 != 0) {
                                    var10[var103] = var35[var61];
                                }
                                var12.method3671(false, new class331(var60[var61]), var69);
                            } else {
                                var60[var61] = ((class331) var92).field4164;
                                var103 = 65535 & var60[var61];
                                if (var66 != -1 && var10[var103].field4176 > var35[var61].field4176) {
                                    var10[var103] = var35[var61];
                                }
                            }
                            for (int var104 = 0; ~var58 < ~var104; ++var104) {
                                var13[var104].method1634(var79, var75, 17532, var103, var74);
                            }
                            ++this.field7804;
                        }
                    }
                }
            }
            for (int var15 = 0; ~this.field7815 < ~var15; ++var15) {
                class280 var33 = var10[var15];
                if (var33 != null) {
                    var33.method1632(var15, -102);
                }
            }
            for (int var16 = 0; ~super.field3428 < ~var16; ++var16) {
                for (int var22 = 0; super.field3426 > var22; ++var22) {
                    short[] var23 = this.field7809[super.field3428 * var22 + var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (~var23.length < ~var25) {
                            int var26 = 65535 & var23[var25++];
                            int var27 = var23[var25++] & 65535;
                            int var28 = 65535 & var23[var25++];
                            class280 var29 = var10[var26];
                            class280 var30 = var10[var27];
                            class280 var31 = var10[var28];
                            class280 var32 = null;
                            if (var29 != null) {
                                var32 = var29;
                                var29.method1635(var24, (byte) 73, var16, var22);
                            }
                            if (var30 != null) {
                                var30.method1635(var24, (byte) 73, var16, var22);
                                if (var32 == null || var32.field4176 > var30.field4176) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method1635(var24, (byte) 73, var16, var22);
                                if (var32 == null || ~var32.field4176 < ~var31.field4176) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method1632(var26, -108);
                                }
                                if (var30 != null) {
                                    var32.method1632(var27, -109);
                                }
                                if (var31 != null) {
                                    var32.method1632(var28, -106);
                                }
                                var32.method1635(var24, (byte) 73, var16, var22);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method3472();
            var9.method3472();
            this.field7842 = this.field7833.method1283(false, -1);
            this.field7842.method355(-26863, 4, var6, this.field7815 * 4);
            this.field7843 = this.field7833.method1283(false, -1);
            this.field7843.method355(-26863, var5, var7, this.field7815 * var5);
            if (~(7 & this.field7816) != -1) {
                if (this.field7810 != null) {
                    this.field7840 = this.field7833.method1279(110, new class436[] { new class436(new class615[] { class615.field8653, class615.field8665, class615.field8664, class615.field8658 }), new class436(class615.field8663) });
                } else {
                    this.field7840 = this.field7833.method1279(124, new class436[] { new class436(new class615[] { class615.field8653, class615.field8665, class615.field8658 }), new class436(class615.field8663) });
                }
            } else if (this.field7810 != null) {
                this.field7840 = this.field7833.method1279(116, new class436[] { new class436(new class615[] { class615.field8653, class615.field8665, class615.field8664 }), new class436(class615.field8663) });
            } else {
                this.field7840 = this.field7833.method1279(87, new class436[] { new class436(new class615[] { class615.field8653, class615.field8665 }), new class436(class615.field8663) });
            }
            int var17 = 0;
            for (int var18 = 0; ~var18 > ~var3.length; ++var18) {
                if (var3[var18].field3476 > 0) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field7844 = new class280[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; var20 < var17; ++var20) {
                class280 var21 = var3[var20];
                var19[var20] = var21.field4176;
                this.field7844[var20] = var21;
                var21.method1631((byte) 110, this.field7815);
            }
            class112.method596((byte) -121, var19, this.field7844);
            if (this.field7821 != null) {
                this.field7821.method3284(1);
            }
        } else {
            this.field7821 = null;
        }
        this.field7818 = null;
        this.field7817 = null;
        this.field7841 = this.field7847 = this.field7849 = null;
        this.field7828 = this.field7826 = null;
        this.field7830 = null;
        this.field7805 = null;
        this.field7810 = null;
        this.field7846 = null;
        this.field7845 = null;
    }

    @OriginalMember(owner = "client!bh", name = "E", descriptor = "(Lha;IIIIZ)V")
    public final void method390(class120 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7822;
        if (this.field7821 != null && arg0 != null) {
            int var7 = -(this.field7833.field4568 * arg2 >> 8) + arg1 >> this.field7833.field4594;
            int var8 = -(this.field7833.field4609 * arg2 >> 8) + arg3 >> this.field7833.field4594;
            this.field7821.method3278(var7, arg0, 52, var8);
        }
    }

    @OriginalMember(owner = "client!bh", name = "DA", descriptor = "(Lha;IIIIZ)V")
    public final void method385(class120 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7825;
        if (this.field7821 != null && arg0 != null) {
            int var7 = arg1 - (this.field7833.field4568 * arg2 >> 8) >> this.field7833.field4594;
            int var8 = -(this.field7833.field4609 * arg2 >> 8) + arg3 >> this.field7833.field4594;
            this.field7821.method3280(-103, var7, var8, arg0);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method391(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field7811;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 == null ? null : new int[var18 * 3];
        int[] var26 = arg5 == null ? null : new int[var18 * 3];
        int var27 = 0;
        for (int var28 = 0; ~var18 < ~var28; ++var28) {
            int var29 = arg6[var28];
            int var30 = arg7[var28];
            int var31 = arg8[var28];
            var19[var27] = arg2[var29];
            var20[var27] = arg4[var29];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 == null ? arg9[var28] : arg10[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var29];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var29];
            }
            ++var27;
            var19[var27] = arg2[var30];
            var20[var27] = arg4[var30];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 == null ? arg9[var28] : arg10[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var30];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var30];
            }
            ++var27;
            var19[var27] = arg2[var31];
            var20[var27] = arg4[var31];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method387(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILre;II)V")
    private final void method3101(int arg0, class634 arg1, int arg2, int arg3) {
        ++field7814;
        int[] var5 = this.field7828[arg3][arg2];
        int[] var6 = this.field7826[arg3][arg2];
        int var7 = var5.length;
        if (var7 > class633.field8924.length) {
            class633.field8924 = new int[var7];
            class242.field2999 = new int[var7];
        }
        for (int var8 = 0; var7 > var8; ++var8) {
            class633.field8924[var8] = var5[var8] >> this.field7833.field4594;
            class242.field2999[var8] = var6[var8] >> this.field7833.field4594;
        }
        int var9 = arg0;
        while (var7 > var9) {
            int var10 = class633.field8924[var9];
            int var11 = class242.field2999[var9++];
            int var12 = class633.field8924[var9];
            int var13 = class242.field2999[var9++];
            int var14 = class633.field8924[var9];
            int var15 = class242.field2999[var9++];
            if ((var10 - var12) * (var13 - var15) - (var13 - var11) * (var14 - var12) > 0) {
                arg1.method3563(var11, var12, var15, var10, var13, arg0 + 2, var14);
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(III[[ZZ)V")
    public final void method376(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        ++field7835;
        this.method3102(arg2, arg3, (byte) -119, arg0, arg4, -1, arg1);
    }

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "(IILha;)Lha;")
    public final class120 method388(int arg0, int arg1, class120 arg2) {
        ++field7829;
        if ((1 & this.field7834[arg0][arg1]) == 0) {
            return null;
        } else {
            int var4 = super.field3424 >> this.field7833.field4594;
            class634 var5 = (class634) arg2;
            class634 var6;
            if (var5 != null && var5.method3562(var4, (byte) -46, var4)) {
                var6 = var5;
                var5.method3565((byte) -71);
            } else {
                var6 = new class634(this.field7833, var4, var4);
            }
            var6.method3567(var4, 0, 0, 95, var4);
            this.method3101(0, var6, arg1, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method378(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field7820;
        if (this.field7850 > 0) {
            class17 var9 = this.field7833.method1989(this.field7804, 106);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; var13 < 4; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method75(true, 21281);
                if (var14 != null) {
                    Stream var15 = this.field7833.method1980((byte) -74, var14);
                    if (!Stream.method3480()) {
                        for (int var16 = arg4; ~arg6 < ~var16; ++var16) {
                            int var17 = super.field3428 * var16 - -arg3;
                            for (int var18 = arg3; ~arg5 < ~var18; ++var18) {
                                if (arg7[var18 - arg3][-arg4 + var16]) {
                                    short[] var19 = this.field7809[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; var19.length > var20; ++var20) {
                                            int var21 = var19[var20] & 65535;
                                            var15.method3478(var21);
                                            ++var10;
                                            if (~var21 > ~var11) {
                                                var11 = var21;
                                            }
                                            if (~var12 > ~var21) {
                                                var12 = var21;
                                            }
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; arg6 > var22; ++var22) {
                            int var25 = super.field3428 * var22 + arg3;
                            for (int var26 = arg3; arg5 > var26; ++var26) {
                                if (arg7[-arg3 + var26][-arg4 + var22]) {
                                    short[] var27 = this.field7809[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; var27.length > var28; ++var28) {
                                            int var29 = 65535 & var27[var28];
                                            if (var29 < var11) {
                                                var11 = var29;
                                            }
                                            if (var29 > var12) {
                                                var12 = var29;
                                            }
                                            ++var10;
                                            var15.method3468(var29);
                                        }
                                    }
                                }
                                ++var25;
                            }
                        }
                    }
                    var15.method3472();
                    if (var9.method71(-26305)) {
                        break;
                    }
                }
            }
            if (~var10 < -1) {
                this.field7833.method2019((byte) -123);
                this.field7833.method2027(false, false);
                this.field7833.method1984(false, (byte) -123);
                this.field7833.method2001(false, (byte) -82);
                this.field7833.method2029(7, false);
                this.field7833.method2051(0, (byte) -65);
                this.field7833.method2008(false, 87, -2, false);
                this.field7833.method1997(127, (class686) null);
                class537 var23 = this.field7833.method2014(390);
                float[] var24 = this.field7833.method1991(1);
                var24[7] = 0.0F;
                var24[5] = (float) arg2 / ((float) super.field3424 * 128.0F * (float) this.field7833.field4458);
                var24[3] = 0.0F;
                var24[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field7833.field4458) + 1.0F;
                var24[15] = 1.0F;
                var24[11] = 0.0F;
                var24[9] = 0.0F;
                var24[4] = 0.0F;
                var24[14] = -this.field7812 / (-this.field7812 + this.field7837);
                var24[2] = 0.0F;
                var24[0] = (float) arg2 / ((float) super.field3424 * 128.0F * (float) this.field7833.field4332);
                var24[1] = 0.0F;
                var24[6] = 0.0F;
                var24[10] = 1.0F / (this.field7837 - this.field7812);
                var24[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field7833.field4332;
                var24[8] = 0.0F;
                var23.method3022(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, -498, 1.0F, 0.0F, 0.0F, 0.0F);
                this.field7833.method2040(-6199);
                this.field7833.method2033((byte) 101);
                if (~(this.field7816 & 7) != -1) {
                    this.field7833.method1984(true, (byte) -80);
                    this.field7833.method1301(true);
                } else {
                    this.field7833.method1984(false, (byte) -22);
                }
                this.field7833.method1278(false, (byte) -109);
                this.field7833.method1281(this.field7843, 0, 123);
                this.field7833.method1281(this.field7842, 1, 109);
                this.field7833.method1285(true, this.field7840);
                this.field7833.method1276(0, var10 / 3, -var11 + var12 + 1, false, class538.field7582, var9, var11);
                this.field7833.method1278(true, (byte) -109);
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lha;IIIIZ)Z")
    public final boolean method389(class120 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7807;
        if (this.field7821 != null && arg0 != null) {
            int var7 = -(this.field7833.field4568 * arg2 >> 8) + arg1 >> this.field7833.field4594;
            int var8 = arg3 - (this.field7833.field4609 * arg2 >> 8) >> this.field7833.field4594;
            return this.field7821.method3282(var7, arg0, 24613, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lmj;IIII[[I[[II)V")
    public class547(class344 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field7833 = arg0;
        this.field7827 = super.field3430 - 2;
        this.field7847 = new float[super.field3428 - -1][super.field3426 + 1];
        this.field7826 = new int[arg3][arg4][];
        this.field7805 = new int[arg3][arg4][];
        this.field7816 = arg2;
        this.field7828 = new int[arg3][arg4][];
        this.field7817 = new class280[arg3][arg4][];
        this.field7818 = new int[arg3][arg4][];
        this.field7845 = new byte[arg3 + 1][arg4 - -1];
        this.field7841 = new float[super.field3428 + 1][super.field3426 + 1];
        this.field7830 = new int[arg3][arg4][];
        this.field7849 = new float[super.field3428 - -1][super.field3426 + 1];
        this.field7832 = 1 << this.field7827;
        this.field7809 = new short[arg3 * arg4][];
        this.field7834 = new byte[arg3][arg4];
        for (int var9 = 0; ~super.field3426 <= ~var9; ++var9) {
            for (int var10 = 0; var10 <= super.field3428; ++var10) {
                int var11 = super.field3423[var10][var9];
                if (this.field7812 > (float) var11) {
                    this.field7812 = (float) var11;
                }
                if ((float) var11 > this.field7837) {
                    this.field7837 = (float) var11;
                }
                if (var10 > 0 && ~var9 < -1 && var10 < super.field3428 && ~var9 > ~super.field3426) {
                    int var12 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                    int var13 = arg6[var10][var9 + 1] + -arg6[var10][var9 - 1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (var13 * var13 + arg7 * 4 * arg7 + var12 * var12)));
                    this.field7841[var10][var9] = (float) var12 * var14;
                    this.field7847[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field7849[var10][var9] = (float) var13 * var14;
                }
            }
        }
        --this.field7812;
        ++this.field7837;
        this.field7846 = new class661(128);
        if (~(16 & this.field7816) != -1) {
            this.field7821 = new class580(this.field7833, this);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)V")
    public final void method379(int arg0, int arg1, int arg2) {
        ++field7806;
        if (arg2 > (255 & this.field7845[arg0][arg1])) {
            this.field7845[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I[[ZBIZII)V")
    private final void method3102(int arg0, boolean[][] arg1, byte arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (this.field7844 != null) {
            int var8 = arg0 - -1 + arg0;
            int var9 = var8 * var8;
            if (~class265.field3300.length > ~var9) {
                class265.field3300 = new int[var9];
            }
            int var10 = arg3 - arg0;
            int var11 = var10;
            if (~var10 > -1) {
                var10 = 0;
            }
            int var12 = -arg0 + arg6;
            int var13 = var12;
            if (var12 < 0) {
                var12 = 0;
            }
            int var14 = arg0 + arg3;
            if (var14 > super.field3428 - 1) {
                var14 = super.field3428 + -1;
            }
            int var15 = arg0 + arg6;
            if (super.field3426 - 1 < var15) {
                var15 = super.field3426 + -1;
            }
            class209.field2469 = 0;
            for (int var16 = var10; var16 <= var14; ++var16) {
                boolean[] var23 = arg1[-var11 + var16];
                for (int var24 = var12; var15 >= var24; ++var24) {
                    if (var23[var24 - var13]) {
                        class265.field3300[class209.field2469++] = super.field3428 * var24 + var16;
                    }
                }
            }
            if (~arg5 == 0) {
                this.field7833.method2021(0);
            } else {
                this.field7833.method2016(9, (float) arg5);
                this.field7833.method2003(16);
            }
            this.field7833.method2011(false);
            this.field7833.method1984((7 & this.field7816) != 0, (byte) -99);
            this.field7833.method2008(false, 70, -1, false);
            this.field7833.method1281(this.field7843, 0, 125);
            for (int var17 = 0; ~var17 > ~this.field7844.length; ++var17) {
                this.field7844[var17].method1630((byte) -39, class265.field3300, class209.field2469);
            }
            class537 var18 = this.field7833.method2014(390);
            var18.method23(0, -1, 0);
            this.field7833.method2033((byte) 101);
            if (!this.field7824.method3439((byte) 111)) {
                int var19 = this.field7833.field4565;
                int var20 = this.field7833.field4536;
                this.field7833.method937(0, var20, this.field7833.field4566);
                this.field7833.method1984(false, (byte) -116);
                this.field7833.method2029(7, false);
                this.field7833.method2051(128, (byte) -116);
                this.field7833.method2008(false, 60, -2, false);
                this.field7833.method1997(126, this.field7833.field4582);
                this.field7833.method1994(-30, class428.field6081, class250.field3133);
                this.field7833.method2012((byte) -100, 0, class107.field1154);
                this.field7833.method1979(0, class590.field8337, (byte) -8);
                for (class333 var21 = this.field7824.method3434((byte) 2); var21 != null; var21 = this.field7824.method3430(true)) {
                    class597 var22 = (class597) var21;
                    var22.method3346(-126, arg0, arg6, arg1, arg3);
                }
                this.field7833.method2012((byte) -99, 0, class304.field3769);
                this.field7833.method1979(0, class304.field3769, (byte) -101);
                this.field7833.method1997(126, (class686) null);
                this.field7833.method937(var19, var20, this.field7833.field4566);
            }
            if (this.field7821 != null) {
                this.field7833.method1281(this.field7843, 0, 125);
                this.field7833.method1281(this.field7842, 1, 126);
                this.field7833.method1285(true, this.field7840);
                this.field7821.method3281(arg3, -175, arg4, arg0, arg6, arg1);
            }
        }
        int var25 = -30 % ((-62 - arg2) / 50);
        ++field7831;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
    public static void method3103(int arg0) {
        if (arg0 == 32348) {
            field7808 = null;
            field7838 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Leq;[I)V")
    public final void method381(class670 arg0, int[] arg1) {
        ++field7813;
        this.field7824.method3425(new class597(this.field7833, this, arg0, arg1), false);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(III[[ZZI)V")
    public final void method380(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        ++field7819;
        this.method3102(arg2, arg3, (byte) 17, arg0, arg4, arg5, arg1);
    }
}
