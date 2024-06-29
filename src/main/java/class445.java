import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public class class445 extends class272 {

    @OriginalMember(owner = "client!dga", name = "Q", descriptor = "Lae;")
    private class40 field5641 = new class40();

    @OriginalMember(owner = "client!dga", name = "z", descriptor = "I")
    private int field5624 = this.field3437 - 2;

    @OriginalMember(owner = "client!dga", name = "F", descriptor = "Lqj;")
    public class548 field5630;

    @OriginalMember(owner = "client!dga", name = "M", descriptor = "[[[I")
    private int[][][] field5637;

    @OriginalMember(owner = "client!dga", name = "T", descriptor = "[[[Lci;")
    private class155[][][] field5644;

    @OriginalMember(owner = "client!dga", name = "V", descriptor = "[[[I")
    public int[][][] field5646;

    @OriginalMember(owner = "client!dga", name = "Z", descriptor = "[[F")
    private float[][] field5650;

    @OriginalMember(owner = "client!dga", name = "n", descriptor = "[[[I")
    public int[][][] field5612;

    @OriginalMember(owner = "client!dga", name = "hb", descriptor = "[[F")
    private float[][] field5658;

    @OriginalMember(owner = "client!dga", name = "D", descriptor = "I")
    public int field5628;

    @OriginalMember(owner = "client!dga", name = "y", descriptor = "I")
    private int field5623;

    @OriginalMember(owner = "client!dga", name = "I", descriptor = "[[[I")
    public int[][][] field5633;

    @OriginalMember(owner = "client!dga", name = "p", descriptor = "[[S")
    public short[][] field5614;

    @OriginalMember(owner = "client!dga", name = "eb", descriptor = "[[F")
    private float[][] field5655;

    @OriginalMember(owner = "client!dga", name = "ib", descriptor = "[[B")
    private byte[][] field5659;

    @OriginalMember(owner = "client!dga", name = "X", descriptor = "[[B")
    private byte[][] field5648;

    @OriginalMember(owner = "client!dga", name = "E", descriptor = "[[[I")
    private int[][][] field5629;

    @OriginalMember(owner = "client!dga", name = "jb", descriptor = "Lil;")
    private class68 field5660;

    @OriginalMember(owner = "client!dga", name = "U", descriptor = "Liu;")
    private class564 field5645;

    @OriginalMember(owner = "client!dga", name = "w", descriptor = "I")
    public static int field5621 = 0;

    @OriginalMember(owner = "client!dga", name = "m", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!dga", name = "o", descriptor = "I")
    public static int field5613;

    @OriginalMember(owner = "client!dga", name = "q", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!dga", name = "r", descriptor = "I")
    public static int field5616;

    @OriginalMember(owner = "client!dga", name = "s", descriptor = "I")
    public static int field5617;

    @OriginalMember(owner = "client!dga", name = "t", descriptor = "I")
    public static int field5618;

    @OriginalMember(owner = "client!dga", name = "u", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!dga", name = "v", descriptor = "I")
    public static int field5620;

    @OriginalMember(owner = "client!dga", name = "x", descriptor = "I")
    public static int field5622;

    @OriginalMember(owner = "client!dga", name = "A", descriptor = "I")
    private int field5625;

    @OriginalMember(owner = "client!dga", name = "B", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!dga", name = "C", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!dga", name = "H", descriptor = "I")
    public static int field5632;

    @OriginalMember(owner = "client!dga", name = "J", descriptor = "I")
    public static int field5634;

    @OriginalMember(owner = "client!dga", name = "K", descriptor = "I")
    public static int field5635;

    @OriginalMember(owner = "client!dga", name = "L", descriptor = "I")
    public static int field5636;

    @OriginalMember(owner = "client!dga", name = "N", descriptor = "I")
    public static int field5638;

    @OriginalMember(owner = "client!dga", name = "P", descriptor = "I")
    public static int field5640;

    @OriginalMember(owner = "client!dga", name = "R", descriptor = "I")
    private int field5642;

    @OriginalMember(owner = "client!dga", name = "S", descriptor = "I")
    public static int field5643;

    @OriginalMember(owner = "client!dga", name = "W", descriptor = "I")
    public static int field5647;

    @OriginalMember(owner = "client!dga", name = "ab", descriptor = "I")
    private int field5651;

    @OriginalMember(owner = "client!dga", name = "gb", descriptor = "I")
    private int field5657;

    @OriginalMember(owner = "client!dga", name = "Y", descriptor = "Lgv;")
    private class325 field5649;

    @OriginalMember(owner = "client!dga", name = "bb", descriptor = "Lgv;")
    public class325 field5652;

    @OriginalMember(owner = "client!dga", name = "db", descriptor = "Lgv;")
    public class325 field5654;

    @OriginalMember(owner = "client!dga", name = "fb", descriptor = "Lgv;")
    public class325 field5656;

    @OriginalMember(owner = "client!dga", name = "kb", descriptor = "Lnl;")
    private class585 field5661;

    @OriginalMember(owner = "client!dga", name = "G", descriptor = "Lpl;")
    public static class612 field5631;

    @OriginalMember(owner = "client!dga", name = "cb", descriptor = "[Lci;")
    private class155[] field5653;

    @OriginalMember(owner = "client!dga", name = "O", descriptor = "[[[I")
    private int[][][] field5639;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lgga;[I)V", line = 3)
    public final void method1289(class332 arg0, int[] arg1) {
        ++field5611;
        this.field5641.method239(new class86(this.field5630, this, arg0, arg1), (byte) 93);
    }

    @OriginalMember(owner = "client!dga", name = "BA", descriptor = "()V", line = 15)
    public final void method1288() {
        if (this.field5651 <= 0) {
            this.field5645 = null;
        } else {
            byte[][] var1 = new byte[super.field3441 + 1][super.field3440 + 1];
            for (int var2 = 1; ~var2 > ~super.field3441; ++var2) {
                for (int var103 = 1; super.field3440 > var103; ++var103) {
                    var1[var2][var103] = (byte) ((this.field5659[var2][var103] >> 1) + (this.field5659[var2][var103 - -1] >> 3) + (this.field5659[var2 + -1][var103] >> 2) + (this.field5659[var2][var103 + -1] >> 2) + (this.field5659[var2 + 1][var103] >> 3));
                }
            }
            this.field5653 = new class155[this.field5660.method404((byte) -26)];
            this.field5660.method400(this.field5653, (byte) -53);
            for (int var3 = 0; var3 < this.field5653.length; ++var3) {
                this.field5653[var3].method884((byte) -56, this.field5651);
            }
            int var4 = 24;
            if (this.field5639 != null) {
                var4 += 4;
            }
            if (~(7 & this.field5628) != -1) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field5630.field7481.method3414(this.field5651 * var4, false);
            Stream var6 = new Stream(var5);
            class155[] var7 = new class155[this.field5651];
            int var8 = class257.method1497((byte) 114, this.field5651 / 4);
            if (var8 < 1) {
                var8 = 1;
            }
            class68 var9 = new class68(var8);
            class155[] var10 = new class155[this.field5657];
            for (int var11 = 0; super.field3441 > var11; ++var11) {
                for (int var30 = 0; var30 < super.field3440; ++var30) {
                    if (this.field5633[var11][var30] != null) {
                        class155[] var31 = this.field5644[var11][var30];
                        int[] var32 = this.field5612[var11][var30];
                        int[] var33 = this.field5646[var11][var30];
                        int[] var34 = this.field5629[var11][var30];
                        int[] var35 = this.field5633[var11][var30];
                        int[] var36 = this.field5637 != null ? this.field5637[var11][var30] : null;
                        if (var34 == null) {
                            var34 = var35;
                        }
                        int[] var37 = this.field5639 == null ? null : this.field5639[var11][var30];
                        float var38 = this.field5658[var11][var30];
                        float var39 = this.field5650[var11][var30];
                        float var40 = this.field5655[var11][var30];
                        float var41 = this.field5658[var11][var30 - -1];
                        float var42 = this.field5650[var11][var30 + 1];
                        float var43 = this.field5655[var11][var30 + 1];
                        float var44 = this.field5658[var11 + 1][var30 + 1];
                        float var45 = this.field5650[var11 + 1][var30 + 1];
                        float var46 = this.field5655[var11 + 1][var30 + 1];
                        float var47 = this.field5658[var11 + 1][var30];
                        float var48 = this.field5650[var11 + 1][var30];
                        float var49 = this.field5655[var11 + 1][var30];
                        int var50 = 255 & var1[var11][var30];
                        int var51 = 255 & var1[var11][var30 + 1];
                        int var52 = var1[var11 + 1][var30 + 1] & 255;
                        int var53 = var1[var11 - -1][var30] & 255;
                        int var54 = 0;
                        label339: for (int var55 = 0; var55 < var35.length; ++var55) {
                            class155 var101 = var31[var55];
                            for (int var102 = 0; var102 < var54; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label339;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field5614[super.field3441 * var30 - -var11] = new short[var35.length];
                        for (int var57 = 0; ~var35.length < ~var57; ++var57) {
                            int var58 = (var11 << super.field3437) + var32[var57];
                            int var59 = (var30 << super.field3437) + var33[var57];
                            int var60 = var58 >> this.field5624;
                            int var61 = var59 >> this.field5624;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 == null ? 0 : var36[var57];
                            long var65 = (long) (var60 << 16) | (long) var63 << 48 | (long) var62 << 32 | (long) var61;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71;
                            float var72;
                            int var73;
                            float var74;
                            if (~var67 == -1 && var68 == 0) {
                                var71 = var40;
                                var72 = var39;
                                var73 = var69 - var50;
                                var74 = var38;
                            } else if (~var67 == -1 && ~super.field3432 == ~var68) {
                                var72 = var42;
                                var71 = var43;
                                var73 = var69 - var51;
                                var74 = var41;
                            } else if (super.field3432 == var67 && super.field3432 == var68) {
                                var74 = var44;
                                var72 = var45;
                                var73 = var69 - var52;
                                var71 = var46;
                            } else if (super.field3432 == var67 && var68 == 0) {
                                var74 = var47;
                                var71 = var49;
                                var72 = var48;
                                var73 = var69 - var53;
                            } else {
                                float var75 = (float) var67 / (float) super.field3432;
                                float var76 = (float) var68 / (float) super.field3432;
                                float var77 = (var47 - var38) * var75 + var38;
                                float var78 = (-var39 + var48) * var75 + var39;
                                float var79 = (-var40 + var49) * var75 + var40;
                                float var80 = (var44 - var41) * var75 + var41;
                                float var81 = (var45 - var42) * var75 + var42;
                                var72 = (var81 - var78) * var76 + var78;
                                var74 = (var80 - var77) * var76 + var77;
                                float var82 = (var46 - var43) * var75 + var43;
                                var71 = (var82 - var79) * var76 + var79;
                                int var83 = ((-var50 + var53) * var67 >> super.field3437) + var50;
                                int var84 = var51 - -((var52 - var51) * var67 >> super.field3437);
                                var73 = var69 - (((-var83 + var84) * var68 >> super.field3437) + var83);
                            }
                            float var85 = 1.0F;
                            if (~var62 != 0) {
                                int var86 = (var62 & 127) * var73 >> 7;
                                if (var86 < 2) {
                                    var86 = 2;
                                } else if (var86 > 126) {
                                    var86 = 126;
                                }
                                var70 = class344.field4422[var62 & 65408 | var86];
                                if ((7 & this.field5628) == 0) {
                                    float var87 = this.field5630.field7610[2] * var71 + this.field5630.field7610[0] * var74 + this.field5630.field7610[1] * var72;
                                    var85 = var87 * (!(var87 > 0.0F) ? this.field5630.field7553 : this.field5630.field7530) + this.field5630.field7568;
                                }
                            }
                            class329 var88 = null;
                            if ((var58 & this.field5623 + -1) == 0 && ~(var59 & this.field5623 + -1) == -1) {
                                var88 = var9.method399(-32748, var65);
                            }
                            int var99;
                            if (var88 == null) {
                                int var89;
                                if (~var62 == ~var63) {
                                    var89 = var70;
                                } else {
                                    int var90 = (127 & var63) * var73 >> 7;
                                    if (~var90 <= -3) {
                                        if (var90 > 126) {
                                            var90 = 126;
                                        }
                                    } else {
                                        var90 = 2;
                                    }
                                    var89 = class344.field4422[var63 & 65408 | var90];
                                    if (~(7 & this.field5628) == -1) {
                                        float var91 = this.field5630.field7610[2] * var71 + this.field5630.field7610[1] * var72 + this.field5630.field7610[0] * var74;
                                        float var92 = this.field5630.field7568 + var85 * (var85 > 0.0F ? this.field5630.field7530 : this.field5630.field7553);
                                        int var93 = var89 >> 16 & 255;
                                        int var94 = 255 & var89 >> 8;
                                        int var95 = var89 & 255;
                                        int var96 = (int) ((float) var93 * var92);
                                        int var97 = (int) ((float) var94 * var92);
                                        if (var96 >= 0) {
                                            if (var96 > 255) {
                                                var96 = 255;
                                            }
                                        } else {
                                            var96 = 0;
                                        }
                                        int var98 = (int) ((float) var95 * var92);
                                        if (var97 >= 0) {
                                            if (~var97 < -256) {
                                                var97 = 255;
                                            }
                                        } else {
                                            var97 = 0;
                                        }
                                        if (var98 < 0) {
                                            var98 = 0;
                                        } else if (var98 > 255) {
                                            var98 = 255;
                                        }
                                        var89 = var98 | var96 << 16 | var97 << 8;
                                    }
                                }
                                if (!this.field5630.field7579) {
                                    var6.method3427((float) var58);
                                    var6.method3427((float) (var64 + this.method1565(var59, var58, true)));
                                    var6.method3427((float) var59);
                                    var6.method3426((byte) (var89 >> 16));
                                    var6.method3426((byte) (var89 >> 8));
                                    var6.method3426((byte) var89);
                                    var6.method3426(-1);
                                    var6.method3427((float) var58);
                                    var6.method3427((float) var59);
                                    if (this.field5639 != null) {
                                        var6.method3427((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if (~(7 & this.field5628) != -1) {
                                        var6.method3427(var74);
                                        var6.method3427(var72);
                                        var6.method3427(var71);
                                    }
                                } else {
                                    var6.method3418((float) var58);
                                    var6.method3418((float) (var64 + this.method1565(var59, var58, true)));
                                    var6.method3418((float) var59);
                                    var6.method3426((byte) (var89 >> 16));
                                    var6.method3426((byte) (var89 >> 8));
                                    var6.method3426((byte) var89);
                                    var6.method3426(-1);
                                    var6.method3418((float) var58);
                                    var6.method3418((float) var59);
                                    if (this.field5639 != null) {
                                        var6.method3418((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if ((7 & this.field5628) != 0) {
                                        var6.method3418(var74);
                                        var6.method3418(var72);
                                        var6.method3418(var71);
                                    }
                                }
                                var99 = this.field5642++;
                                var56[var57] = (short) var99;
                                if (~var62 != 0) {
                                    var7[var99] = var31[var57];
                                }
                                var9.method402(new class423(var56[var57]), (byte) -88, var65);
                            } else {
                                var56[var57] = ((class423) var88).field5313;
                                var99 = 65535 & var56[var57];
                                if (~var62 != 0 && ~var7[var99].field4199 < ~var31[var57].field4199) {
                                    var7[var99] = var31[var57];
                                }
                            }
                            for (int var100 = 0; ~var54 < ~var100; ++var100) {
                                var10[var100].method886(var73, var99, (byte) -80, var70, var85);
                            }
                            ++this.field5625;
                        }
                    }
                }
            }
            for (int var12 = 0; ~this.field5642 < ~var12; ++var12) {
                class155 var29 = var7[var12];
                if (var29 != null) {
                    var29.method889((byte) 6, var12);
                }
            }
            for (int var13 = 0; var13 < super.field3441; ++var13) {
                for (int var18 = 0; ~super.field3440 < ~var18; ++var18) {
                    short[] var19 = this.field5614[super.field3441 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (var21 < var19.length) {
                            int var22 = var19[var21++] & 65535;
                            int var23 = var19[var21++] & 65535;
                            int var24 = 65535 & var19[var21++];
                            class155 var25 = var7[var22];
                            class155 var26 = var7[var23];
                            class155 var27 = var7[var24];
                            class155 var28 = null;
                            if (var25 != null) {
                                var28 = var25;
                                var25.method891(var13, var20, false, var18);
                            }
                            if (var26 != null) {
                                var26.method891(var13, var20, false, var18);
                                if (var28 == null || ~var28.field4199 < ~var26.field4199) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method891(var13, var20, false, var18);
                                if (var28 == null || ~var28.field4199 < ~var27.field4199) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method889((byte) 6, var22);
                                }
                                if (var26 != null) {
                                    var28.method889((byte) 6, var23);
                                }
                                if (var27 != null) {
                                    var28.method889((byte) 6, var24);
                                }
                                var28.method891(var13, var20, false, var18);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method3424();
            this.field5661 = this.field5630.method2975(var4, false, var6.method3423(), var5, 3);
            this.field5652 = new class325(this.field5661, 5126, 3, 0);
            this.field5649 = new class325(this.field5661, 5121, 4, 12);
            byte var14;
            if (this.field5639 != null) {
                var14 = 28;
                this.field5656 = new class325(this.field5661, 5126, 3, 16);
            } else {
                this.field5656 = new class325(this.field5661, 5126, 2, 16);
                var14 = 24;
            }
            if ((this.field5628 & 7) != 0) {
                this.field5654 = new class325(this.field5661, 5126, 3, var14);
            }
            long[] var15 = new long[this.field5653.length];
            for (int var16 = 0; var16 < this.field5653.length; ++var16) {
                class155 var17 = this.field5653[var16];
                var15[var16] = var17.field4199;
                var17.method888((byte) -33, this.field5642);
            }
            class364.method1998(var15, 0, this.field5653);
            if (this.field5645 != null) {
                this.field5645.method3095(74);
            }
        }
        ++field5638;
        this.field5629 = null;
        this.field5633 = null;
        this.field5639 = null;
        this.field5644 = null;
        this.field5660 = null;
        this.field5659 = null;
        this.field5637 = null;
        this.field5658 = this.field5650 = this.field5655 = null;
        this.field5612 = this.field5646 = null;
    }

    @OriginalMember(owner = "client!dga", name = "DA", descriptor = "(Lha;IIIIZ)V", line = 594)
    public final void method1274(class119 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5616;
        if (this.field5645 != null && arg0 != null) {
            int var7 = -(this.field5630.field7601 * arg2 >> 8) + arg1 >> this.field5630.field7479;
            int var8 = -(this.field5630.field7602 * arg2 >> 8) + arg3 >> this.field5630.field7479;
            this.field5645.method3098(arg0, var8, var7, -1);
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(III[[ZZI)V", line = 617)
    public final void method1277(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        ++field5619;
        this.method2379(arg2, arg4, arg3, arg5, arg1, (byte) 87, arg0);
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIIIIII[[Z)V", line = 626)
    public final void method1280(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field5635;
        if (this.field5651 > 0) {
            this.field5630.method3016(-13);
            this.field5630.method2971(false, (byte) -121);
            this.field5630.method3010((byte) 127, false);
            this.field5630.method3007(-91, false);
            this.field5630.method2953(false, 117);
            this.field5630.method3017((byte) 89, 0);
            this.field5630.method2961(-2, (byte) -48);
            this.field5630.method2960((class615) null, -2);
            class153.field1973[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field5630.field7320;
            class153.field1973[8] = 0.0F;
            class153.field1973[0] = (float) arg2 / ((float) super.field3432 * 128.0F * (float) this.field5630.field7430);
            class153.field1973[5] = (float) arg2 / ((float) super.field3432 * 128.0F * (float) this.field5630.field7320);
            class153.field1973[2] = 0.0F;
            class153.field1973[4] = 0.0F;
            class153.field1973[12] = -(((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field5630.field7430) + -1.0F;
            class153.field1973[15] = 1.0F;
            class153.field1973[11] = 0.0F;
            class153.field1973[7] = 0.0F;
            class153.field1973[10] = 0.0F;
            class153.field1973[1] = 0.0F;
            class153.field1973[14] = 0.0F;
            class153.field1973[6] = 0.0F;
            class153.field1973[3] = 0.0F;
            class153.field1973[9] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class153.field1973, 0);
            class153.field1973[4] = 0.0F;
            class153.field1973[10] = 0.0F;
            class153.field1973[6] = 1.0F;
            class153.field1973[1] = 0.0F;
            class153.field1973[11] = 0.0F;
            class153.field1973[2] = 0.0F;
            class153.field1973[9] = 1.0F;
            class153.field1973[5] = 0.0F;
            class153.field1973[7] = 0.0F;
            class153.field1973[3] = 0.0F;
            class153.field1973[12] = 0.0F;
            class153.field1973[14] = 0.0F;
            class153.field1973[8] = 0.0F;
            class153.field1973[0] = 1.0F;
            class153.field1973[15] = 1.0F;
            class153.field1973[13] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class153.field1973, 0);
            if ((this.field5628 & 7) != 0) {
                this.field5630.method3010((byte) 105, true);
                this.field5630.method2962(13211);
            } else {
                this.field5630.method3010((byte) 101, false);
            }
            this.field5630.method2985(this.field5652, (byte) 91, this.field5649, this.field5656, this.field5654);
            if (this.field5625 * 2 <= this.field5630.field7570.field8804.length) {
                this.field5630.field7570.field8812 = 0;
            } else {
                this.field5630.field7570 = new class458(this.field5625 * 2);
            }
            int var9 = 0;
            class458 var10 = this.field5630.field7570;
            if (!this.field5630.field7579) {
                for (int var11 = arg4; ~var11 > ~arg6; ++var11) {
                    int var12 = super.field3441 * var11 + arg3;
                    for (int var13 = arg3; arg5 > var13; ++var13) {
                        if (arg7[-arg3 + var13][var11 - arg4]) {
                            short[] var14 = this.field5614[var12];
                            if (var14 != null) {
                                for (int var15 = 0; ~var15 > ~var14.length; ++var15) {
                                    var10.method3484(65535 & var14[var15], (byte) 0);
                                    ++var9;
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; ~arg6 < ~var16; ++var16) {
                    int var18 = super.field3441 * var16 + arg3;
                    for (int var19 = arg3; ~var19 > ~arg5; ++var19) {
                        if (arg7[var19 - arg3][var16 - arg4]) {
                            short[] var20 = this.field5614[var18];
                            if (var20 != null) {
                                for (int var21 = 0; var21 < var20.length; ++var21) {
                                    ++var9;
                                    var10.method3526(65535 & var20[var21], 13469);
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (var9 > 0) {
                class442 var17 = new class442(this.field5630, 5123, var10.field8804, var10.field8812);
                this.field5630.method2978(var9, 0, 4, var17, 255);
            }
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(III[[ZZ)V", line = 795)
    public final void method1278(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method2379(arg2, arg4, arg3, -1, arg1, (byte) 124, arg0);
        ++field5632;
    }

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "(III)Z", line = 803)
    public static final boolean method2378(int arg0, int arg1, int arg2) {
        int var3 = 72 % ((arg0 - 19) / 59);
        ++field5613;
        return (52 & arg1) != 0;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(IZ[[ZIIBI)V", line = 816)
    private final void method2379(int arg0, boolean arg1, boolean[][] arg2, int arg3, int arg4, byte arg5, int arg6) {
        int var8 = 107 % ((-10 - arg5) / 43);
        if (this.field5653 != null) {
            int var9 = arg0 - -arg0 + 1;
            int var10 = var9 * var9;
            if (var10 > this.field5630.field7631.length) {
                this.field5630.field7631 = new int[var10];
            }
            if (this.field5630.field7570.field8804.length < this.field5625 * 2) {
                this.field5630.field7570 = new class458(this.field5625 * 2);
            }
            int var11 = -arg0 + arg6;
            int var12 = var11;
            if (var11 < 0) {
                var11 = 0;
            }
            int var13 = -arg0 + arg4;
            int var14 = var13;
            if (~var13 > -1) {
                var13 = 0;
            }
            int var15 = arg0 + arg6;
            if (~var15 < ~(super.field3441 - 1)) {
                var15 = super.field3441 + -1;
            }
            int var16 = arg0 + arg4;
            if (~(super.field3440 + -1) > ~var16) {
                var16 = super.field3440 + -1;
            }
            int var17 = 0;
            int[] var18 = this.field5630.field7631;
            for (int var19 = var11; var19 <= var15; ++var19) {
                boolean[] var25 = arg2[-var12 + var19];
                for (int var26 = var13; var26 <= var16; ++var26) {
                    if (var25[-var14 + var26]) {
                        var18[var17++] = super.field3441 * var26 + var19;
                    }
                }
            }
            if (arg3 == -1) {
                this.field5630.method2988(-98);
            } else {
                this.field5630.method2977((byte) 95, (float) arg3);
                this.field5630.method2950(379);
            }
            this.field5630.method3010((byte) 110, ~(this.field5628 & 7) != -1);
            for (int var20 = 0; this.field5653.length > var20; ++var20) {
                this.field5653[var20].method887(var17, 0, var18);
            }
            if (!this.field5641.method246(true)) {
                int var21 = this.field5630.field7532;
                int var22 = this.field5630.field7521;
                this.field5630.method1075(0, var22, this.field5630.field7522);
                this.field5630.method3010((byte) 117, false);
                this.field5630.method2953(false, -102);
                this.field5630.method3017((byte) 74, 128);
                this.field5630.method2961(-2, (byte) -93);
                this.field5630.method2960(this.field5630.field7569, -2);
                this.field5630.method2983(8448, -465309136, 7681);
                this.field5630.method2966(0, 770, 768, 34166);
                this.field5630.method3015(34167, 770, 0, true);
                for (class329 var23 = this.field5641.method237(125); var23 != null; var23 = this.field5641.method245((byte) 80)) {
                    class86 var24 = (class86) var23;
                    var24.method495(114, arg2, arg6, arg0, arg4);
                }
                this.field5630.method2966(0, 768, 768, 5890);
                this.field5630.method3015(5890, 770, 0, true);
                this.field5630.method2960((class615) null, -2);
                this.field5630.method1075(var21, var22, this.field5630.field7522);
            }
            if (this.field5645 != null) {
                OpenGL.glPushMatrix();
                OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
                this.field5630.method2985(this.field5652, (byte) 27, (class325) null, this.field5656, (class325) null);
                this.field5645.method3093(arg6, arg4, arg2, true, arg1, arg0);
                OpenGL.glPopMatrix();
            }
        }
        ++field5643;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lha;IIIIZ)Z", line = 968)
    public final boolean method1286(class119 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5647;
        if (this.field5645 != null && arg0 != null) {
            int var7 = -(this.field5630.field7601 * arg2 >> 8) + arg1 >> this.field5630.field7479;
            int var8 = -(this.field5630.field7602 * arg2 >> 8) + arg3 >> this.field5630.field7479;
            return this.field5645.method3094(arg0, var8, var7, -11578);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(I[BLlm;B)Lcb;", line = 988)
    public static final class80 method2380(int arg0, byte[] arg1, class337 arg2, byte arg3) {
        ++field5636;
        long var4 = OpenGL.glCreateShaderObjectARB(arg0);
        int var6 = -86 / ((arg3 - 32) / 53);
        OpenGL.glShaderSourceRawARB(var4, arg1);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class212.field2646, 0);
        if (~class212.field2646[0] == -1) {
            if (class212.field2646[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class212.field2646, 1);
            if (class212.field2646[1] > 1) {
                byte[] var7 = new byte[class212.field2646[1]];
                OpenGL.glGetInfoLogARB(var4, class212.field2646[1], class212.field2646, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class212.field2646[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class80(arg2, var4, arg0);
    }

    @OriginalMember(owner = "client!dga", name = "E", descriptor = "(Lha;IIIIZ)V", line = 1027)
    public final void method1284(class119 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5615;
        if (this.field5645 != null && arg0 != null) {
            int var7 = -(this.field5630.field7601 * arg2 >> 8) + arg1 >> this.field5630.field7479;
            int var8 = -(this.field5630.field7602 * arg2 >> 8) + arg3 >> this.field5630.field7479;
            this.field5645.method3096(var7, arg0, true, var8);
        }
    }

    @OriginalMember(owner = "client!dga", name = "v", descriptor = "(IILha;)Lha;", line = 1045)
    public final class119 method1285(int arg0, int arg1, class119 arg2) {
        ++field5622;
        if ((this.field5648[arg0][arg1] & 1) == 0) {
            return null;
        } else {
            int var4 = super.field3432 >> this.field5630.field7479;
            class77 var5 = (class77) arg2;
            class77 var6;
            if (var5 != null && var5.method461(var4, 93, var4)) {
                var6 = var5;
                var5.method458(-24051);
            } else {
                var6 = new class77(this.field5630, var4, var4);
            }
            var6.method457(0, 0, var4, true, var4);
            this.method2381(arg1, arg0, 0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!dga", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 1074)
    public final void method1275(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg5 != null && this.field5639 == null) {
            this.field5639 = new int[super.field3441][super.field3440][];
        }
        if (arg3 != null && this.field5637 == null) {
            this.field5637 = new int[super.field3441][super.field3440][];
        }
        ++field5617;
        this.field5612[arg0][arg1] = arg2;
        this.field5646[arg0][arg1] = arg4;
        this.field5633[arg0][arg1] = arg6;
        this.field5629[arg0][arg1] = arg7;
        if (this.field5639 != null) {
            this.field5639[arg0][arg1] = arg5;
        }
        if (this.field5637 != null) {
            this.field5637[arg0][arg1] = arg3;
        }
        class155[] var15 = this.field5644[arg0][arg1] = new class155[arg6.length];
        for (int var16 = 0; ~var16 > ~arg6.length; ++var16) {
            long var17 = (long) arg8[var16] | (long) (arg9[var16] << 14) | (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28;
            class329 var19;
            for (var19 = this.field5660.method399(-32748, var17); var19 != null; var19 = this.field5660.method408((byte) 109)) {
                class155 var20 = (class155) var19;
                if (~arg8[var16] == ~var20.field2031 && (float) arg9[var16] == var20.field2020 && ~var20.field2030 == ~arg10 && var20.field2032 == arg11 && ~var20.field2026 == ~arg12) {
                    break;
                }
            }
            if (var19 != null) {
                var15[var16] = (class155) var19;
            } else {
                var15[var16] = new class155(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field5660.method402(var15[var16], (byte) -87, var17);
            }
        }
        if (arg13) {
            this.field5648[arg0][arg1] = (byte) class444.method2376(this.field5648[arg0][arg1], 1);
        }
        if (arg6.length > this.field5657) {
            this.field5657 = arg6.length;
        }
        this.field5651 += arg6.length;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 1145)
    public final void method1276(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field5634;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 != null ? new int[var18 * 3] : null;
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
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
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
        this.method1275(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIILvg;)V", line = 1232)
    private final void method2381(int arg0, int arg1, int arg2, class77 arg3) {
        ++field5627;
        int[] var5 = this.field5612[arg1][arg0];
        int[] var6 = this.field5646[arg1][arg0];
        int var7 = var5.length;
        if (var7 > this.field5630.field7632.length) {
            this.field5630.field7630 = new int[var7];
            this.field5630.field7632 = new int[var7];
        }
        int[] var8 = this.field5630.field7632;
        int[] var9 = this.field5630.field7630;
        for (int var10 = 0; ~var7 < ~var10; ++var10) {
            var8[var10] = var5[var10] >> this.field5630.field7479;
            var9[var10] = var6[var10] >> this.field5630.field7479;
        }
        int var11 = arg2;
        while (~var11 > ~var7) {
            int var12 = var8[var11];
            int var13 = var9[var11++];
            int var14 = var8[var11];
            int var15 = var9[var11++];
            int var16 = var8[var11];
            int var17 = var9[var11++];
            if (~((-var14 + var12) * (-var17 + var15) + -((-var13 + var15) * (-var14 + var16))) < -1) {
                arg3.method460(var17, var12, var16, var14, var13, 112, var15);
            }
        }
    }

    @OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(Lqj;IIII[[I[[II)V", line = 1291)
    public class445(class548 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field5630 = arg0;
        this.field5637 = new int[arg3][arg4][];
        this.field5644 = new class155[arg3][arg4][];
        this.field5646 = new int[arg3][arg4][];
        this.field5650 = new float[super.field3441 + 1][super.field3440 + 1];
        this.field5612 = new int[arg3][arg4][];
        this.field5658 = new float[super.field3441 + 1][super.field3440 - -1];
        this.field5628 = arg2;
        this.field5623 = 1 << this.field5624;
        this.field5633 = new int[arg3][arg4][];
        this.field5614 = new short[arg3 * arg4][];
        this.field5655 = new float[super.field3441 + 1][super.field3440 - -1];
        this.field5659 = new byte[arg3 + 1][arg4 + 1];
        this.field5648 = new byte[arg3][arg4];
        this.field5629 = new int[arg3][arg4][];
        for (int var9 = 1; var9 < super.field3440; ++var9) {
            for (int var10 = 1; var10 < super.field3441; ++var10) {
                int var11 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (arg7 * 4 * arg7 + (var11 * var11 - -(var12 * var12)))));
                this.field5658[var10][var9] = (float) var11 * var13;
                this.field5650[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field5655[var10][var9] = (float) var12 * var13;
            }
        }
        this.field5660 = new class68(128);
        if (~(this.field5628 & 16) != -1) {
            this.field5645 = new class564(this.field5630, this);
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(II)V", line = 1347)
    public final void method1282(int arg0, int arg1) {
        ++field5618;
    }

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "(I)V", line = 1362)
    public static void method2382(int arg0) {
        if (arg0 != 1135849320) {
            field5631 = null;
        }
        field5631 = null;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(III)V", line = 1373)
    public final void method1281(int arg0, int arg1, int arg2) {
        if (~arg2 < ~(255 & this.field5659[arg0][arg1])) {
            this.field5659[arg0][arg1] = (byte) arg2;
        }
        ++field5620;
    }
}
