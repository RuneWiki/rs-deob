import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public class class623 extends class37 {

    @OriginalMember(owner = "client!vfa", name = "T", descriptor = "Lwba;")
    private class46 field8728 = new class46();

    @OriginalMember(owner = "client!vfa", name = "K", descriptor = "I")
    private int field8719 = this.field625 + -2;

    @OriginalMember(owner = "client!vfa", name = "z", descriptor = "Lok;")
    public class228 field8708;

    @OriginalMember(owner = "client!vfa", name = "db", descriptor = "[[F")
    private float[][] field8738;

    @OriginalMember(owner = "client!vfa", name = "D", descriptor = "[[B")
    private byte[][] field8712;

    @OriginalMember(owner = "client!vfa", name = "L", descriptor = "[[[I")
    private int[][][] field8720;

    @OriginalMember(owner = "client!vfa", name = "Z", descriptor = "[[B")
    private byte[][] field8734;

    @OriginalMember(owner = "client!vfa", name = "cb", descriptor = "[[F")
    private float[][] field8737;

    @OriginalMember(owner = "client!vfa", name = "U", descriptor = "[[[I")
    public int[][][] field8729;

    @OriginalMember(owner = "client!vfa", name = "Q", descriptor = "[[[I")
    public int[][][] field8725;

    @OriginalMember(owner = "client!vfa", name = "w", descriptor = "I")
    private int field8705;

    @OriginalMember(owner = "client!vfa", name = "F", descriptor = "[[[I")
    private int[][][] field8714;

    @OriginalMember(owner = "client!vfa", name = "J", descriptor = "[[[I")
    public int[][][] field8718;

    @OriginalMember(owner = "client!vfa", name = "H", descriptor = "[[[Lnm;")
    private class436[][][] field8716;

    @OriginalMember(owner = "client!vfa", name = "p", descriptor = "I")
    public int field8698;

    @OriginalMember(owner = "client!vfa", name = "ib", descriptor = "[[F")
    private float[][] field8743;

    @OriginalMember(owner = "client!vfa", name = "B", descriptor = "[[S")
    public short[][] field8710;

    @OriginalMember(owner = "client!vfa", name = "mb", descriptor = "Lkea;")
    private class213 field8747;

    @OriginalMember(owner = "client!vfa", name = "G", descriptor = "Lfda;")
    private class289 field8715;

    @OriginalMember(owner = "client!vfa", name = "S", descriptor = "Lff;")
    public static class9 field8727 = new class9(12, 0, 1, 0);

    @OriginalMember(owner = "client!vfa", name = "W", descriptor = "Z")
    public static boolean field8731 = false;

    @OriginalMember(owner = "client!vfa", name = "gb", descriptor = "Lba;")
    public static class351 field8741 = new class351(1);

    @OriginalMember(owner = "client!vfa", name = "o", descriptor = "I")
    public static int field8697;

    @OriginalMember(owner = "client!vfa", name = "q", descriptor = "I")
    public static int field8699;

    @OriginalMember(owner = "client!vfa", name = "r", descriptor = "I")
    public static int field8700;

    @OriginalMember(owner = "client!vfa", name = "s", descriptor = "I")
    private int field8701;

    @OriginalMember(owner = "client!vfa", name = "t", descriptor = "I")
    public static int field8702;

    @OriginalMember(owner = "client!vfa", name = "u", descriptor = "I")
    public static int field8703;

    @OriginalMember(owner = "client!vfa", name = "v", descriptor = "I")
    public static int field8704;

    @OriginalMember(owner = "client!vfa", name = "x", descriptor = "I")
    public static int field8706;

    @OriginalMember(owner = "client!vfa", name = "A", descriptor = "I")
    public static int field8709;

    @OriginalMember(owner = "client!vfa", name = "C", descriptor = "I")
    public static int field8711;

    @OriginalMember(owner = "client!vfa", name = "E", descriptor = "I")
    public static int field8713;

    @OriginalMember(owner = "client!vfa", name = "I", descriptor = "I")
    public static int field8717;

    @OriginalMember(owner = "client!vfa", name = "M", descriptor = "I")
    public static int field8721;

    @OriginalMember(owner = "client!vfa", name = "N", descriptor = "I")
    private int field8722;

    @OriginalMember(owner = "client!vfa", name = "O", descriptor = "I")
    public static int field8723;

    @OriginalMember(owner = "client!vfa", name = "P", descriptor = "I")
    public static int field8724;

    @OriginalMember(owner = "client!vfa", name = "R", descriptor = "I")
    public static int field8726;

    @OriginalMember(owner = "client!vfa", name = "V", descriptor = "I")
    public static int field8730;

    @OriginalMember(owner = "client!vfa", name = "X", descriptor = "I")
    public static int field8732;

    @OriginalMember(owner = "client!vfa", name = "hb", descriptor = "I")
    private int field8742;

    @OriginalMember(owner = "client!vfa", name = "kb", descriptor = "I")
    public static int field8745;

    @OriginalMember(owner = "client!vfa", name = "lb", descriptor = "I")
    private int field8746;

    @OriginalMember(owner = "client!vfa", name = "eb", descriptor = "Lcd;")
    private class283 field8739;

    @OriginalMember(owner = "client!vfa", name = "Y", descriptor = "Llq;")
    private class512 field8733;

    @OriginalMember(owner = "client!vfa", name = "ab", descriptor = "Llq;")
    public class512 field8735;

    @OriginalMember(owner = "client!vfa", name = "bb", descriptor = "Llq;")
    public class512 field8736;

    @OriginalMember(owner = "client!vfa", name = "fb", descriptor = "Llq;")
    public class512 field8740;

    @OriginalMember(owner = "client!vfa", name = "jb", descriptor = "[Lnm;")
    private class436[] field8744;

    @OriginalMember(owner = "client!vfa", name = "y", descriptor = "[[[I")
    private int[][][] field8707;

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IIB)Z", line = 5)
    public static final boolean method3460(int arg0, int arg1, byte arg2) {
        if (arg2 != -128) {
            return false;
        } else {
            ++field8745;
            boolean var3 = (55 & arg1) == 0 ? class328.method2064(arg1, arg0, 128) : class399.method2443(arg1, arg0, 123);
            return var3 | (arg0 & 65536) != 0 | class272.method1797(544, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "BA", descriptor = "()V", line = 22)
    public final void method436() {
        ++field8704;
        if (~this.field8742 < -1) {
            byte[][] var1 = new byte[super.field631 + 1][super.field632 - -1];
            for (int var2 = 1; ~var2 > ~super.field631; ++var2) {
                for (int var103 = 1; var103 < super.field632; ++var103) {
                    var1[var2][var103] = (byte) ((this.field8734[var2][var103 + 1] >> 3) + (this.field8734[var2][var103 + -1] >> 2) + (this.field8734[var2 - -1][var103] >> 3) + (this.field8734[var2 - 1][var103] >> 2) + (this.field8734[var2][var103] >> 1));
                }
            }
            this.field8744 = new class436[this.field8747.method1404((byte) -76)];
            this.field8747.method1410(this.field8744, (byte) 46);
            for (int var3 = 0; var3 < this.field8744.length; ++var3) {
                this.field8744[var3].method2591((byte) 92, this.field8742);
            }
            int var4 = 24;
            if (this.field8707 != null) {
                var4 += 4;
            }
            if ((this.field8698 & 7) != 0) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field8708.field3406.method3468(this.field8742 * var4, false);
            Stream var6 = new Stream(var5);
            class436[] var7 = new class436[this.field8742];
            int var8 = class405.method2458(this.field8742 / 4, -619912415);
            if (~var8 > -2) {
                var8 = 1;
            }
            class213 var9 = new class213(var8);
            class436[] var10 = new class436[this.field8746];
            for (int var11 = 0; ~super.field631 < ~var11; ++var11) {
                for (int var30 = 0; var30 < super.field632; ++var30) {
                    if (this.field8729[var11][var30] != null) {
                        class436[] var31 = this.field8716[var11][var30];
                        int[] var32 = this.field8725[var11][var30];
                        int[] var33 = this.field8718[var11][var30];
                        int[] var34 = this.field8720[var11][var30];
                        int[] var35 = this.field8729[var11][var30];
                        int[] var36 = this.field8714 == null ? null : this.field8714[var11][var30];
                        if (var34 == null) {
                            var34 = var35;
                        }
                        int[] var37 = this.field8707 == null ? null : this.field8707[var11][var30];
                        float var38 = this.field8743[var11][var30];
                        float var39 = this.field8737[var11][var30];
                        float var40 = this.field8738[var11][var30];
                        float var41 = this.field8743[var11][var30 + 1];
                        float var42 = this.field8737[var11][var30 + 1];
                        float var43 = this.field8738[var11][var30 - -1];
                        float var44 = this.field8743[var11 + 1][var30 + 1];
                        float var45 = this.field8737[var11 - -1][var30 - -1];
                        float var46 = this.field8738[var11 + 1][var30 - -1];
                        float var47 = this.field8743[var11 + 1][var30];
                        float var48 = this.field8737[var11 + 1][var30];
                        float var49 = this.field8738[var11 + 1][var30];
                        int var50 = 255 & var1[var11][var30];
                        int var51 = var1[var11][var30 + 1] & 255;
                        int var52 = 255 & var1[var11 - -1][var30 + 1];
                        int var53 = 255 & var1[var11 + 1][var30];
                        int var54 = 0;
                        label339: for (int var55 = 0; var35.length > var55; ++var55) {
                            class436 var101 = var31[var55];
                            for (int var102 = 0; var54 > var102; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label339;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field8710[super.field631 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; ~var57 > ~var35.length; ++var57) {
                            int var58 = (var11 << super.field625) + var32[var57];
                            int var59 = (var30 << super.field625) - -var33[var57];
                            int var60 = var58 >> this.field8719;
                            int var61 = var59 >> this.field8719;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 == null ? 0 : var36[var57];
                            long var65 = (long) var63 << 48 | (long) var62 << 32 | (long) (var60 << 16) | (long) var61;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71 = 1.0F;
                            int var72;
                            float var73;
                            float var74;
                            float var75;
                            if (var67 == 0 && ~var68 == -1) {
                                var72 = var69 - var50;
                                var73 = var38;
                                var74 = var40;
                                var75 = var39;
                            } else if (~var67 == -1 && super.field629 == var68) {
                                var75 = var42;
                                var74 = var43;
                                var73 = var41;
                                var72 = var69 - var51;
                            } else if (super.field629 == var67 && ~super.field629 == ~var68) {
                                var74 = var46;
                                var72 = var69 - var52;
                                var75 = var45;
                                var73 = var44;
                            } else if (~super.field629 == ~var67 && var68 == 0) {
                                var74 = var49;
                                var72 = var69 - var53;
                                var75 = var48;
                                var73 = var47;
                            } else {
                                float var76 = (float) var67 / (float) super.field629;
                                float var77 = (float) var68 / (float) super.field629;
                                float var78 = (var47 - var38) * var76 + var38;
                                float var79 = (-var39 + var48) * var76 + var39;
                                float var80 = (-var40 + var49) * var76 + var40;
                                float var81 = (var44 - var41) * var76 + var41;
                                float var82 = (-var42 + var45) * var76 + var42;
                                var75 = (-var79 + var82) * var77 + var79;
                                float var83 = (var46 - var43) * var76 + var43;
                                var73 = (-var78 + var81) * var77 + var78;
                                var74 = (-var80 + var83) * var77 + var80;
                                int var84 = ((-var50 + var53) * var67 >> super.field625) + var50;
                                int var85 = ((-var51 + var52) * var67 >> super.field625) + var51;
                                var72 = var69 - (((-var84 + var85) * var68 >> super.field625) + var84);
                            }
                            if (~var62 != 0) {
                                int var86 = (var62 & 127) * var72 >> 7;
                                if (~var86 > -3) {
                                    var86 = 2;
                                } else if (~var86 < -127) {
                                    var86 = 126;
                                }
                                var70 = class437.field6386[var86 | var62 & 65408];
                                if ((this.field8698 & 7) == 0) {
                                    float var87 = this.field8708.field3517[2] * var74 + this.field8708.field3517[1] * var75 + this.field8708.field3517[0] * var73;
                                    var71 = var87 * (var87 > 0.0F ? this.field8708.field3455 : this.field8708.field3466) + this.field8708.field3538;
                                }
                            }
                            class665 var88 = null;
                            if (~(this.field8705 + -1 & var58) == -1 && (var59 & this.field8705 - 1) == 0) {
                                var88 = var9.method1405(var65, (byte) -111);
                            }
                            int var89;
                            if (var88 != null) {
                                var56[var57] = ((class134) var88).field1974;
                                var89 = var56[var57] & 65535;
                                if (var62 != -1 && var7[var89].field9386 > var31[var57].field9386) {
                                    var7[var89] = var31[var57];
                                }
                            } else {
                                int var90;
                                if (var62 == var63) {
                                    var90 = var70;
                                } else {
                                    int var91 = (var63 & 127) * var72 >> 7;
                                    if (~var91 > -3) {
                                        var91 = 2;
                                    } else if (var91 > 126) {
                                        var91 = 126;
                                    }
                                    var90 = class437.field6386[var91 | var63 & 65408];
                                    if ((this.field8698 & 7) == 0) {
                                        float var92 = this.field8708.field3517[2] * var74 + this.field8708.field3517[0] * var73 + this.field8708.field3517[1] * var75;
                                        float var93 = (!(var71 > 0.0F) ? this.field8708.field3466 : this.field8708.field3455) * var71 + this.field8708.field3538;
                                        int var94 = (var90 & 16731197) >> 16;
                                        int var95 = (65427 & var90) >> 8;
                                        int var96 = (int) ((float) var94 * var93);
                                        int var97 = 255 & var90;
                                        if (~var96 > -1) {
                                            var96 = 0;
                                        } else if (var96 > 255) {
                                            var96 = 255;
                                        }
                                        int var98 = (int) ((float) var95 * var93);
                                        if (~var98 > -1) {
                                            var98 = 0;
                                        } else if (~var98 < -256) {
                                            var98 = 255;
                                        }
                                        int var99 = (int) ((float) var97 * var93);
                                        if (var99 >= 0) {
                                            if (var99 > 255) {
                                                var99 = 255;
                                            }
                                        } else {
                                            var99 = 0;
                                        }
                                        var90 = var98 << 8 | var96 << 16 | var99;
                                    }
                                }
                                if (this.field8708.field3514) {
                                    var6.method3474((float) var58);
                                    var6.method3474((float) (this.method442(var58, true, var59) - -var64));
                                    var6.method3474((float) var59);
                                    var6.method3485((byte) (var90 >> 16));
                                    var6.method3485((byte) (var90 >> 8));
                                    var6.method3485((byte) var90);
                                    var6.method3485(-1);
                                    var6.method3474((float) var58);
                                    var6.method3474((float) var59);
                                    if (this.field8707 != null) {
                                        var6.method3474((float) (var37 == null ? 0 : var37[var57] - 1));
                                    }
                                    if ((7 & this.field8698) != 0) {
                                        var6.method3474(var73);
                                        var6.method3474(var75);
                                        var6.method3474(var74);
                                    }
                                } else {
                                    var6.method3476((float) var58);
                                    var6.method3476((float) (this.method442(var58, true, var59) - -var64));
                                    var6.method3476((float) var59);
                                    var6.method3485((byte) (var90 >> 16));
                                    var6.method3485((byte) (var90 >> 8));
                                    var6.method3485((byte) var90);
                                    var6.method3485(-1);
                                    var6.method3476((float) var58);
                                    var6.method3476((float) var59);
                                    if (this.field8707 != null) {
                                        var6.method3476((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if (~(this.field8698 & 7) != -1) {
                                        var6.method3476(var73);
                                        var6.method3476(var75);
                                        var6.method3476(var74);
                                    }
                                }
                                var89 = this.field8722++;
                                var56[var57] = (short) var89;
                                if (~var62 != 0) {
                                    var7[var89] = var31[var57];
                                }
                                var9.method1403((byte) -18, new class134(var56[var57]), var65);
                            }
                            for (int var100 = 0; ~var100 > ~var54; ++var100) {
                                var10[var100].method2595(var89, true, var71, var70, var72);
                            }
                            ++this.field8701;
                        }
                    }
                }
            }
            for (int var12 = 0; ~var12 > ~this.field8722; ++var12) {
                class436 var29 = var7[var12];
                if (var29 != null) {
                    var29.method2588((byte) -111, var12);
                }
            }
            for (int var13 = 0; ~var13 > ~super.field631; ++var13) {
                for (int var18 = 0; ~super.field632 < ~var18; ++var18) {
                    short[] var19 = this.field8710[super.field631 * var18 - -var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (var21 < var19.length) {
                            int var22 = var19[var21++] & 65535;
                            int var23 = 65535 & var19[var21++];
                            int var24 = 65535 & var19[var21++];
                            class436 var25 = var7[var22];
                            class436 var26 = var7[var23];
                            class436 var27 = var7[var24];
                            class436 var28 = null;
                            if (var25 != null) {
                                var28 = var25;
                                var25.method2597(var18, var20, var13, -12405);
                            }
                            if (var26 != null) {
                                var26.method2597(var18, var20, var13, -12405);
                                if (var28 == null || var28.field9386 > var26.field9386) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method2597(var18, var20, var13, -12405);
                                if (var28 == null || var28.field9386 > var27.field9386) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method2588((byte) -67, var22);
                                }
                                if (var26 != null) {
                                    var28.method2588((byte) -72, var23);
                                }
                                if (var27 != null) {
                                    var28.method2588((byte) -95, var24);
                                }
                                var28.method2597(var18, var20, var13, -12405);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method3471();
            this.field8739 = this.field8708.method1533(var5, var6.method3481(), var4, (byte) 36, false);
            this.field8735 = new class512(this.field8739, 5126, 3, 0);
            this.field8733 = new class512(this.field8739, 5121, 4, 12);
            byte var14;
            if (this.field8707 == null) {
                var14 = 24;
                this.field8736 = new class512(this.field8739, 5126, 2, 16);
            } else {
                var14 = 28;
                this.field8736 = new class512(this.field8739, 5126, 3, 16);
            }
            if ((this.field8698 & 7) != 0) {
                this.field8740 = new class512(this.field8739, 5126, 3, var14);
            }
            long[] var15 = new long[this.field8744.length];
            for (int var16 = 0; ~var16 > ~this.field8744.length; ++var16) {
                class436 var17 = this.field8744[var16];
                var15[var16] = var17.field9386;
                var17.method2594(this.field8722, (byte) 36);
            }
            class151.method1064(var15, this.field8744, (byte) 62);
            if (this.field8715 != null) {
                this.field8715.method1843((byte) 85);
            }
        } else {
            this.field8715 = null;
        }
        this.field8707 = null;
        this.field8743 = this.field8737 = this.field8738 = null;
        this.field8725 = this.field8718 = null;
        this.field8729 = null;
        this.field8734 = null;
        this.field8716 = null;
        this.field8720 = null;
        this.field8714 = null;
        this.field8747 = null;
    }

    @OriginalMember(owner = "client!vfa", name = "v", descriptor = "(IILha;)Lha;", line = 600)
    public final class54 method441(int arg0, int arg1, class54 arg2) {
        ++field8713;
        if (~(this.field8712[arg0][arg1] & 1) == -1) {
            return null;
        } else {
            int var4 = super.field629 >> this.field8708.field3404;
            class520 var5 = (class520) arg2;
            class520 var6;
            if (var5 != null && var5.method2969(var4, true, var4)) {
                var6 = var5;
                var5.method2970(false);
            } else {
                var6 = new class520(this.field8708, var4, var4);
            }
            var6.method2967((byte) -120, var4, 0, var4, 0);
            this.method3462((byte) -93, arg0, arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IIIIIII[[Z)V", line = 628)
    public final void method438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field8723;
        if (~this.field8742 < -1) {
            this.field8708.method1528(-118);
            this.field8708.method1539(false, false);
            this.field8708.method1493(false, -114);
            this.field8708.method1571(false, 1);
            this.field8708.method1534(35, false);
            this.field8708.method1536(0, 0);
            this.field8708.method1510((byte) 126, -2);
            this.field8708.method1505(-2, (class657) null);
            class668.field9447[14] = 0.0F;
            class668.field9447[7] = 0.0F;
            class668.field9447[4] = 0.0F;
            class668.field9447[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field8708.field3332) + 1.0F;
            class668.field9447[3] = 0.0F;
            class668.field9447[10] = 0.0F;
            class668.field9447[6] = 0.0F;
            class668.field9447[9] = 0.0F;
            class668.field9447[1] = 0.0F;
            class668.field9447[15] = 1.0F;
            class668.field9447[5] = (float) arg2 / ((float) super.field629 * 128.0F * (float) this.field8708.field3332);
            class668.field9447[8] = 0.0F;
            class668.field9447[11] = 0.0F;
            class668.field9447[0] = (float) arg2 / ((float) super.field629 * 128.0F * (float) this.field8708.field3232);
            class668.field9447[12] = -(((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field8708.field3232) + -1.0F;
            class668.field9447[2] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class668.field9447, 0);
            class668.field9447[6] = 1.0F;
            class668.field9447[0] = 1.0F;
            class668.field9447[1] = 0.0F;
            class668.field9447[11] = 0.0F;
            class668.field9447[5] = 0.0F;
            class668.field9447[8] = 0.0F;
            class668.field9447[2] = 0.0F;
            class668.field9447[9] = 1.0F;
            class668.field9447[14] = 0.0F;
            class668.field9447[15] = 1.0F;
            class668.field9447[3] = 0.0F;
            class668.field9447[7] = 0.0F;
            class668.field9447[12] = 0.0F;
            class668.field9447[4] = 0.0F;
            class668.field9447[13] = 0.0F;
            class668.field9447[10] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class668.field9447, 0);
            if ((7 & this.field8698) != 0) {
                this.field8708.method1493(true, -29);
                this.field8708.method1517(4);
            } else {
                this.field8708.method1493(false, -96);
            }
            this.field8708.method1562((byte) -12, this.field8736, this.field8740, this.field8733, this.field8735);
            if (~this.field8708.field3510.field9796.length > ~(this.field8701 * 2)) {
                this.field8708.field3510 = new class231(this.field8701 * 2);
            } else {
                this.field8708.field3510.field9761 = 0;
            }
            int var9 = 0;
            class231 var10 = this.field8708.field3510;
            if (!this.field8708.field3514) {
                for (int var11 = arg4; ~arg6 < ~var11; ++var11) {
                    int var12 = super.field631 * var11 + arg3;
                    for (int var13 = arg3; var13 < arg5; ++var13) {
                        if (arg7[-arg3 + var13][-arg4 + var11]) {
                            short[] var14 = this.field8710[var12];
                            if (var14 != null) {
                                for (int var15 = 0; ~var15 > ~var14.length; ++var15) {
                                    ++var9;
                                    var10.method3843(var14[var15] & 65535, true);
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; var16 < arg6; ++var16) {
                    int var18 = super.field631 * var16 + arg3;
                    for (int var19 = arg3; arg5 > var19; ++var19) {
                        if (arg7[-arg3 + var19][var16 - arg4]) {
                            short[] var20 = this.field8710[var18];
                            if (var20 != null) {
                                for (int var21 = 0; ~var20.length < ~var21; ++var21) {
                                    ++var9;
                                    var10.method3852(false, 65535 & var20[var21]);
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (~var9 < -1) {
                class636 var17 = new class636(this.field8708, 5123, var10.field9796, var10.field9761);
                this.field8708.method1522((byte) 31, 0, 4, var17, var9);
            }
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 800)
    public static final void method3461(String arg0, int arg1) {
        System.exit(1);
        if (arg1 == -25643) {
            ++field8702;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 813)
    public final void method434(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field8730;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 != null ? new int[var18 * 3] : null;
        int[] var26 = arg5 != null ? new int[var18 * 3] : null;
        int var27 = 0;
        for (int var28 = 0; ~var28 > ~var18; ++var28) {
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
            var22[var27] = arg10 == null ? arg9[var28] : arg10[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method433(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Lrc;[I)V", line = 901)
    public final void method429(class498 arg0, int[] arg1) {
        this.field8728.method474(new class646(this.field8708, this, arg0, arg1), 6);
        ++field8697;
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(III[[ZZI)V", line = 911)
    public final void method443(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        ++field8709;
        this.method3463(arg1, arg2, arg3, arg0, arg5, 16, arg4);
    }

    @OriginalMember(owner = "client!vfa", name = "DA", descriptor = "(Lha;IIIIZ)V", line = 922)
    public final void method437(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field8724;
        if (this.field8715 != null && arg0 != null) {
            int var7 = -(this.field8708.field3516 * arg2 >> 8) + arg1 >> this.field8708.field3404;
            int var8 = -(this.field8708.field3518 * arg2 >> 8) + arg3 >> this.field8708.field3404;
            this.field8715.method1842(arg0, var7, var8, (byte) 126);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 939)
    public final void method433(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg5 != null && this.field8707 == null) {
            this.field8707 = new int[super.field631][super.field632][];
        }
        ++field8711;
        if (arg3 != null && this.field8714 == null) {
            this.field8714 = new int[super.field631][super.field632][];
        }
        this.field8725[arg0][arg1] = arg2;
        this.field8718[arg0][arg1] = arg4;
        this.field8729[arg0][arg1] = arg6;
        this.field8720[arg0][arg1] = arg7;
        if (this.field8707 != null) {
            this.field8707[arg0][arg1] = arg5;
        }
        if (this.field8714 != null) {
            this.field8714[arg0][arg1] = arg3;
        }
        class436[] var15 = this.field8716[arg0][arg1] = new class436[arg6.length];
        for (int var16 = 0; ~var16 > ~arg6.length; ++var16) {
            long var17 = (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) (arg9[var16] << 14) | (long) arg8[var16];
            class665 var19;
            for (var19 = this.field8747.method1405(var17, (byte) -37); var19 != null; var19 = this.field8747.method1411((byte) 49)) {
                class436 var20 = (class436) var19;
                if (arg8[var16] == var20.field6374 && (float) arg9[var16] == var20.field6373 && var20.field6363 == arg10 && ~var20.field6367 == ~arg11 && var20.field6365 == arg12) {
                    break;
                }
            }
            if (var19 == null) {
                var15[var16] = new class436(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field8747.method1403((byte) -18, var15[var16], var17);
            } else {
                var15[var16] = (class436) var19;
            }
        }
        if (arg13) {
            this.field8712[arg0][arg1] = (byte) class486.method2826(this.field8712[arg0][arg1], 1);
        }
        if (this.field8746 < arg6.length) {
            this.field8746 = arg6.length;
        }
        this.field8742 += arg6.length;
    }

    @OriginalMember(owner = "client!vfa", name = "E", descriptor = "(Lha;IIIIZ)V", line = 1006)
    public final void method446(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field8700;
        if (this.field8715 != null && arg0 != null) {
            int var7 = arg1 - (this.field8708.field3516 * arg2 >> 8) >> this.field8708.field3404;
            int var8 = -(this.field8708.field3518 * arg2 >> 8) + arg3 >> this.field8708.field3404;
            this.field8715.method1841(arg0, var7, var8, (byte) 107);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(III[[ZZ)V", line = 1023)
    public final void method445(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method3463(arg1, arg2, arg3, arg0, -1, 16, arg4);
        ++field8717;
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Lha;IIIIZ)Z", line = 1038)
    public final boolean method430(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field8726;
        if (this.field8715 != null && arg0 != null) {
            int var7 = -(this.field8708.field3516 * arg2 >> 8) + arg1 >> this.field8708.field3404;
            int var8 = -(this.field8708.field3518 * arg2 >> 8) + arg3 >> this.field8708.field3404;
            return this.field8715.method1847(var8, var7, arg0, 98);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(III)V", line = 1059)
    public final void method440(int arg0, int arg1, int arg2) {
        ++field8706;
        if (~(this.field8734[arg0][arg1] & 255) > ~arg2) {
            this.field8734[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(BIILtv;)V", line = 1075)
    private final void method3462(byte arg0, int arg1, int arg2, class520 arg3) {
        ++field8699;
        int[] var5 = this.field8725[arg1][arg2];
        int[] var6 = this.field8718[arg1][arg2];
        int var7 = var5.length;
        if (this.field8708.field3556.length < var7) {
            this.field8708.field3557 = new int[var7];
            this.field8708.field3556 = new int[var7];
        }
        int[] var8 = this.field8708.field3556;
        int[] var9 = this.field8708.field3557;
        for (int var10 = 0; var10 < var7; ++var10) {
            var8[var10] = var5[var10] >> this.field8708.field3404;
            var9[var10] = var6[var10] >> this.field8708.field3404;
        }
        if (arg0 != -93) {
            this.field8714 = null;
        }
        int var11 = 0;
        while (~var7 < ~var11) {
            int var12 = var8[var11];
            int var13 = var9[var11++];
            int var14 = var8[var11];
            int var15 = var9[var11++];
            int var16 = var8[var11];
            int var17 = var9[var11++];
            if ((var12 - var14) * (-var17 + var15) - (-var13 + var15) * (-var14 + var16) > 0) {
                arg3.method2971(var16, var12, var14, var17, var13, var15, arg0 + 25316);
            }
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(II)V", line = 1139)
    public final void method439(int arg0, int arg1) {
        ++field8732;
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(II[[ZIIIZ)V", line = 1146)
    private final void method3463(int arg0, int arg1, boolean[][] arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg5 != 16) {
            this.field8715 = null;
        }
        ++field8721;
        if (this.field8744 != null) {
            int var8 = arg1 + arg1 + 1;
            int var9 = var8 * var8;
            if (~this.field8708.field3555.length > ~var9) {
                this.field8708.field3555 = new int[var9];
            }
            if (~this.field8708.field3510.field9796.length > ~(this.field8701 * 2)) {
                this.field8708.field3510 = new class231(this.field8701 * 2);
            }
            int var10 = arg3 - arg1;
            int var11 = var10;
            if (var10 < 0) {
                var10 = 0;
            }
            int var12 = -arg1 + arg0;
            int var13 = var12;
            if (var12 < 0) {
                var12 = 0;
            }
            int var14 = arg1 + arg3;
            if (~var14 < ~(super.field631 - 1)) {
                var14 = super.field631 + -1;
            }
            int var15 = arg0 + arg1;
            if (var15 > super.field632 + -1) {
                var15 = super.field632 + -1;
            }
            int var16 = 0;
            int[] var17 = this.field8708.field3555;
            for (int var18 = var10; var14 >= var18; ++var18) {
                boolean[] var24 = arg2[-var11 + var18];
                for (int var25 = var12; var15 >= var25; ++var25) {
                    if (var24[-var13 + var25]) {
                        var17[var16++] = super.field631 * var25 + var18;
                    }
                }
            }
            if (~arg4 != 0) {
                this.field8708.method1511(arg5 + 31297, (float) arg4);
                this.field8708.method1499(1);
            } else {
                this.field8708.method1561(arg5 + -15);
            }
            this.field8708.method1493((7 & this.field8698) != 0, -84);
            for (int var19 = 0; ~var19 > ~this.field8744.length; ++var19) {
                this.field8744[var19].method2590(var17, var16, -50);
            }
            if (!this.field8728.method481((byte) -57)) {
                int var20 = this.field8708.field3506;
                int var21 = this.field8708.field3442;
                this.field8708.method122(0, var21, this.field8708.field3483);
                this.field8708.method1493(false, arg5 + -51);
                this.field8708.method1534(arg5 ^ 50, false);
                this.field8708.method1536(arg5 + -16, 128);
                this.field8708.method1510((byte) -118, -2);
                this.field8708.method1505(-2, this.field8708.field3544);
                this.field8708.method1527(1, 8448, 7681);
                this.field8708.method1503(0, 34166, (byte) 2, 770);
                this.field8708.method1574(34167, (byte) -128, 770, 0);
                for (class665 var22 = this.field8728.method472((byte) -20); var22 != null; var22 = this.field8728.method482(arg5 + 110)) {
                    class646 var23 = (class646) var22;
                    var23.method3584(arg5 + -16, arg3, arg1, arg0, arg2);
                }
                this.field8708.method1503(0, 5890, (byte) 2, 768);
                this.field8708.method1574(5890, (byte) -128, 770, 0);
                this.field8708.method1505(arg5 + -18, (class657) null);
                this.field8708.method122(var20, var21, this.field8708.field3483);
            }
            if (this.field8715 != null) {
                OpenGL.glPushMatrix();
                OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
                this.field8708.method1562((byte) -12, this.field8736, (class512) null, (class512) null, this.field8735);
                this.field8715.method1849(arg1, -1, arg0, arg3, arg2, arg6);
                OpenGL.glPopMatrix();
                return;
            }
        }
    }

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "(I)V", line = 1289)
    public static void method3464(int arg0) {
        field8727 = null;
        field8741 = null;
        if (arg0 != 16566) {
            method3460(110, 27, (byte) -128);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "c", descriptor = "(I)V", line = 1301)
    public static final void method3465(int arg0) {
        ++field8703;
        if (~class450.field6492 != 0 && ~class200.field2825 != 0) {
            int var1 = ((-class279.field4217 + class668.field9446) * class311.field4612 >> 16) + class279.field4217;
            class311.field4612 += var1;
            if (~class311.field4612 > -65536) {
                class210.field2934 = false;
                class173.field2465 = false;
            } else {
                if (!class210.field2934) {
                    class173.field2465 = true;
                } else {
                    class173.field2465 = false;
                }
                class311.field4612 = 65535;
                class210.field2934 = true;
            }
            float var2 = (float) class311.field4612 / 65535.0F;
            if (arg0 == 28519) {
                float[] var3 = new float[3];
                int var4 = class321.field4719 * 2;
                for (int var5 = 0; ~var5 > -4; ++var5) {
                    int var21 = class131.field1940[class450.field6492][var4][var5] * 3;
                    int var22 = class131.field1940[class450.field6492][var4 - -1][var5] * 3;
                    int var23 = (class131.field1940[class450.field6492][var4 + 2][var5] - (class131.field1940[class450.field6492][var4 + 3][var5] + -class131.field1940[class450.field6492][var4 + 2][var5])) * 3;
                    int var24 = class131.field1940[class450.field6492][var4][var5];
                    int var25 = -var21 + var22;
                    int var26 = -(var22 * 2) + var21 + var23;
                    int var27 = class131.field1940[class450.field6492][var4 + 2][var5] - var23 + -var24 + var22;
                    var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
                }
                class131.field1928 = (int) var3[0] + -(class109.field1672 * 512);
                class568.field7998 = (int) var3[1] * -1;
                class413.field6011 = (int) var3[2] + -(class203.field2874 * 512);
                float[] var6 = new float[3];
                int var7 = class389.field5775 * 2;
                for (int var8 = 0; ~var8 > -4; ++var8) {
                    int var14 = class131.field1940[class200.field2825][var7][var8] * 3;
                    int var15 = class131.field1940[class200.field2825][var7 + 1][var8] * 3;
                    int var16 = (class131.field1940[class200.field2825][var7 - -2][var8] + -class131.field1940[class200.field2825][var7 + 3][var8] + class131.field1940[class200.field2825][var7 - -2][var8]) * 3;
                    int var17 = class131.field1940[class200.field2825][var7][var8];
                    int var18 = -var14 + var15;
                    int var19 = var14 + var16 + -(var15 * 2);
                    int var20 = -var17 + var15 - var16 + class131.field1940[class200.field2825][var7 - -2][var8];
                    var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
                }
                float var9 = var6[0] + -var3[0];
                float var10 = (var6[1] + -var3[1]) * -1.0F;
                float var11 = var6[2] + -var3[2];
                double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
                class544.field7662 = 16383 & (int) (2607.5945876176133D * Math.atan2((double) var10, var12));
                class637.field9001 = (int) (2607.5945876176133D * -Math.atan2((double) var9, (double) var11)) & 16383;
                class300.field4472 = ((class131.field1940[class450.field6492][var4 - -2][3] + -class131.field1940[class450.field6492][var4][3]) * class311.field4612 >> 16) + class131.field1940[class450.field6492][var4][3];
            }
        }
    }

    @OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(Lok;IIII[[I[[II)V", line = 1405)
    public class623(class228 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field8708 = arg0;
        this.field8738 = new float[super.field631 + 1][super.field632 + 1];
        this.field8712 = new byte[arg3][arg4];
        this.field8720 = new int[arg3][arg4][];
        this.field8734 = new byte[arg3 - -1][arg4 + 1];
        this.field8737 = new float[super.field631 - -1][super.field632 - -1];
        this.field8729 = new int[arg3][arg4][];
        this.field8725 = new int[arg3][arg4][];
        this.field8705 = 1 << this.field8719;
        this.field8714 = new int[arg3][arg4][];
        this.field8718 = new int[arg3][arg4][];
        this.field8716 = new class436[arg3][arg4][];
        this.field8698 = arg2;
        this.field8743 = new float[super.field631 + 1][super.field632 + 1];
        this.field8710 = new short[arg3 * arg4][];
        for (int var9 = 1; ~var9 > ~super.field632; ++var9) {
            for (int var10 = 1; ~super.field631 < ~var10; ++var10) {
                int var11 = arg6[var10 + 1][var9] - arg6[var10 - 1][var9];
                int var12 = arg6[var10][var9 - -1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (arg7 * arg7 * 4 + var11 * var11 + var12 * var12)));
                this.field8743[var10][var9] = (float) var11 * var13;
                this.field8737[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field8738[var10][var9] = (float) var12 * var13;
            }
        }
        this.field8747 = new class213(128);
        if (~(this.field8698 & 16) != -1) {
            this.field8715 = new class289(this.field8708, this);
        }
    }
}
