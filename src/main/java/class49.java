import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class49 extends class425 {

    @OriginalMember(owner = "client!tn", name = "G", descriptor = "Ler;")
    private class55 field651;

    @OriginalMember(owner = "client!tn", name = "v", descriptor = "Lpc;")
    private class402 field640;

    @OriginalMember(owner = "client!tn", name = "p", descriptor = "Lig;")
    private class132 field634;

    @OriginalMember(owner = "client!tn", name = "s", descriptor = "I")
    private int field637;

    @OriginalMember(owner = "client!tn", name = "o", descriptor = "I")
    private int field633;

    @OriginalMember(owner = "client!tn", name = "F", descriptor = "I")
    private int field650;

    @OriginalMember(owner = "client!tn", name = "z", descriptor = "I")
    private int field644;

    @OriginalMember(owner = "client!tn", name = "w", descriptor = "[[F")
    private float[][] field641;

    @OriginalMember(owner = "client!tn", name = "C", descriptor = "[[F")
    private float[][] field647;

    @OriginalMember(owner = "client!tn", name = "A", descriptor = "[[F")
    private float[][] field645;

    @OriginalMember(owner = "client!tn", name = "q", descriptor = "Llf;")
    private class130 field635;

    @OriginalMember(owner = "client!tn", name = "x", descriptor = "Llb;")
    private class322 field642;

    @OriginalMember(owner = "client!tn", name = "u", descriptor = "Ldj;")
    private class191 field639;

    @OriginalMember(owner = "client!tn", name = "D", descriptor = "Lis;")
    private class292 field648;

    @OriginalMember(owner = "client!tn", name = "r", descriptor = "Lmp;")
    private class454 field636;

    @OriginalMember(owner = "client!tn", name = "y", descriptor = "Lwi;")
    private class273 field643;

    @OriginalMember(owner = "client!tn", name = "E", descriptor = "Lwi;")
    private class273 field649;

    @OriginalMember(owner = "client!tn", name = "t", descriptor = "I")
    private int field638;

    @OriginalMember(owner = "client!tn", name = "B", descriptor = "I")
    private int field646;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIIIII)V", line = 7)
    private final void method314(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        long var8 = (long) arg4;
        int var10 = (arg1 << this.field651.field722) + arg0;
        int var11 = arg6 + (arg3 << this.field651.field722);
        int var12 = this.field651.method360(var10, var11);
        if ((arg0 & 0x7F) == 0 || (arg6 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | ((long) var11 & 0xFFFFL) << 16;
            class425 var13 = this.field639.method1373(var8, -3);
            if (var13 != null) {
                this.method316(((class51) var13).field662, true);
                return;
            }
        }
        short var14 = (short) (this.field638++);
        if (var8 != -1L) {
            this.field639.method1376(new class51(var14), var8, 93);
        }
        float var15;
        float var16;
        float var17;
        if (arg0 == 0 && arg6 == 0) {
            var15 = this.field647[arg5][arg2];
            var16 = this.field645[arg5][arg2];
            var17 = this.field641[arg5][arg2];
        } else if (this.field651.field712 == arg0 && arg6 == 0) {
            var15 = this.field647[arg5 + 1][arg2];
            var17 = this.field641[arg5 + 1][arg2];
            var16 = this.field645[arg5 + 1][arg2];
        } else if (this.field651.field712 == arg0 && this.field651.field712 == arg6) {
            var17 = this.field641[arg5 + 1][arg2 + 1];
            var16 = this.field645[arg5 + 1][arg2 + 1];
            var15 = this.field647[arg5 + 1][arg2 + 1];
        } else if (arg0 == 0 && this.field651.field712 == arg6) {
            var16 = this.field645[arg5][arg2 + 1];
            var15 = this.field647[arg5][arg2 + 1];
            var17 = this.field641[arg5][arg2 + 1];
        } else {
            float var18 = (float) arg0 / (float) this.field651.field712;
            float var19 = (float) arg6 / (float) this.field651.field712;
            float var20 = this.field647[arg5][arg2];
            float var21 = this.field645[arg5][arg2];
            float var22 = this.field641[arg5][arg2];
            float var23 = this.field647[arg5 + 1][arg2];
            float var24 = this.field645[arg5 + 1][arg2];
            float var25 = (this.field645[arg5 + 1][arg2 + 1] - var24) * var18 + var24;
            float var26 = this.field641[arg5 + 1][arg2];
            float var27 = (this.field647[arg5][arg2 + 1] - var20) * var18 + var20;
            float var28 = (this.field645[arg5][arg2 + 1] - var21) * var18 + var21;
            float var29 = (this.field647[arg5 + 1][arg2 + 1] - var23) * var18 + var23;
            float var30 = (this.field641[arg5][arg2 + 1] - var22) * var18 + var22;
            var15 = (var29 - var27) * var19 + var27;
            float var31 = (this.field641[arg5 + 1][arg2 + 1] - var26) * var18 + var26;
            var16 = (var25 - var28) * var19 + var28;
            var17 = (var31 - var30) * var19 + var30;
        }
        float var32 = (float) (this.field640.field5644 - var10);
        float var33 = (float) (this.field640.field5643 - var12);
        float var34 = (float) (this.field640.field5647 - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var32 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field640.field5639;
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var37 + var15 * var38 + var16 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field640.field5641;
        int var45 = (int) ((float) ((var44 & 0xFFC9A0) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field634.field1998) {
            this.field642.method2135((byte) 122, (float) var10);
            this.field642.method2135((byte) 122, (float) var12);
            this.field642.method2135((byte) 122, (float) var11);
        } else {
            this.field642.method2134(-59, (float) var10);
            this.field642.method2134(arg4 - 90, (float) var12);
            this.field642.method2134(-76, (float) var11);
        }
        this.field642.method831(var45, (byte) -50);
        this.field642.method831(var46, (byte) -123);
        this.field642.method831(var47, (byte) -24);
        this.field642.method831(255, (byte) 118);
        this.method316(var14, true);
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(II[[ZII)V", line = 178)
    public final void method315(int arg0, int arg1, boolean[][] arg2, int arg3, int arg4) {
        if (this.field648 == null || (arg1 + arg4) < this.field637 || this.field633 < arg4 - arg1 || arg1 + arg3 < this.field650 || arg3 - arg1 > this.field644) {
            return;
        }
        int var6 = -34 / ((arg0 + 78) / 42);
        for (int var7 = this.field650; var7 <= this.field644; var7++) {
            for (int var8 = this.field637; var8 <= this.field633; var8++) {
                int var9 = var8 - arg4;
                int var10 = var7 - arg3;
                if (var9 > -arg1 && var9 < arg1 && (-arg1) < var10 && var10 < arg1 && arg2[var9 + arg1][arg1 + var10]) {
                    this.field634.method987((int) (this.field640.field5640 * 255.0F) << 24);
                    this.field634.method961(this.field643, (class273) null, this.field649, (class273) null);
                    this.field634.method982(this.field648, 4, 0, this.field646);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(SZ)V", line = 232)
    private final void method316(short arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        if (this.field634.field1998) {
            this.field635.method799(arg0, 68);
        } else {
            this.field635.method827(arg0, 125);
        }
        this.field646++;
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lig;Ler;Lpc;[I)V", line = 253)
    public class49(class132 arg0, class55 arg1, class402 arg2, int[] arg3) {
        this.field651 = arg1;
        this.field640 = arg2;
        this.field634 = arg0;
        int var5 = this.field640.field5639 - (arg1.field712 >> 1);
        this.field637 = this.field640.field5644 - var5 >> arg1.field722;
        this.field633 = this.field640.field5644 + var5 >> arg1.field722;
        this.field650 = this.field640.field5647 - var5 >> arg1.field722;
        this.field644 = this.field640.field5647 + var5 >> arg1.field722;
        int var6 = this.field633 + 1 - this.field637;
        int var7 = this.field644 + 1 - this.field650;
        this.field641 = new float[var6 + 1][var7 + 1];
        this.field647 = new float[var6 + 1][var7 + 1];
        this.field645 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var9 = this.field650 + var8;
            if (var9 > 0 && var9 < this.field651.field1183 - 1) {
                for (int var10 = 0; var10 <= var6; var10++) {
                    int var11 = this.field637 + var10;
                    if (var11 > 0 && var11 < this.field651.field1187 - 1) {
                        int var12 = arg1.method359(var11 + 1, var9) - arg1.method359(var11 - 1, var9);
                        int var13 = arg1.method359(var11, var9 + 1) - arg1.method359(var11, var9 - 1);
                        float var14 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + var13 * var13 + 65536)));
                        this.field647[var10][var8] = (float) var12 * var14;
                        this.field645[var10][var8] = var14 * -256.0F;
                        this.field641[var10][var8] = (float) var13 * var14;
                    }
                }
            }
        }
        int var15 = 0;
        int var16 = 0;
        for (int var17 = this.field650; var17 <= this.field644; var17++) {
            if (var17 >= 0 && var17 < arg1.field1183) {
                for (int var18 = this.field637; var18 <= this.field633; var18++) {
                    if (var18 >= 0 && var18 < arg1.field1187) {
                        int var19 = arg3[var16];
                        int[] var20 = arg1.field708[var18][var17];
                        if (var20 != null && var19 != 0) {
                            if (var19 == 1) {
                                var15 += var20.length;
                            } else {
                                var15 += 3;
                            }
                        }
                    }
                    var16++;
                }
            } else {
                var16 += this.field633 - this.field637;
            }
        }
        if (var15 > 0) {
            this.field635 = new class130(var15 * 2);
            this.field642 = new class322(var15 * 16);
            this.field639 = new class191(class258.method1787(-122, var15));
            int var21 = 0;
            int var22 = 0;
            for (int var23 = this.field650; var23 <= this.field644; var23++) {
                if (var23 >= 0 && arg1.field1183 > var23) {
                    int var24 = 0;
                    for (int var25 = this.field637; var25 <= this.field633; var25++) {
                        if (var25 >= 0 && var25 < arg1.field1187) {
                            int var26 = arg3[var22];
                            int[] var27 = arg1.field708[var25][var23];
                            int[] var28 = arg1.field711[var25][var23];
                            if (var27 != null && var26 != 0) {
                                if (var26 == 1) {
                                    for (int var29 = 0; var29 < var27.length; var29++) {
                                        this.method314(var27[var29], var25, var21, var23, -1, var24, var28[var29]);
                                    }
                                } else if (var26 == 3) {
                                    this.method314(0, var25, var21, var23, -1, var24, 0);
                                    this.method314(arg1.field712, var25, var21, var23, -1, var24, 0);
                                    this.method314(0, var25, var21, var23, -1, var24, arg1.field712);
                                } else if (var26 == 2) {
                                    this.method314(arg1.field712, var25, var21, var23, -1, var24, 0);
                                    this.method314(arg1.field712, var25, var21, var23, -1, var24, arg1.field712);
                                    this.method314(0, var25, var21, var23, -1, var24, 0);
                                } else if (var26 == 5) {
                                    this.method314(arg1.field712, var25, var21, var23, -1, var24, arg1.field712);
                                    this.method314(0, var25, var21, var23, -1, var24, arg1.field712);
                                    this.method314(arg1.field712, var25, var21, var23, -1, var24, 0);
                                } else if (var26 == 4) {
                                    this.method314(0, var25, var21, var23, -1, var24, arg1.field712);
                                    this.method314(0, var25, var21, var23, -1, var24, 0);
                                    this.method314(arg1.field712, var25, var21, var23, -1, var24, arg1.field712);
                                }
                            }
                        }
                        var22++;
                        var24++;
                    }
                } else {
                    var22 += this.field633 - this.field637;
                }
                var21++;
            }
            this.field648 = this.field634.method986(5123, this.field635.field1851, this.field635.field1880, false);
            this.field636 = this.field634.method915(16, this.field642.field1851, this.field642.field1880, false);
            this.field643 = new class273(this.field634, this.field636, 5126, 3, 0);
            this.field649 = new class273(this.field634, this.field636, 5121, 4, 12);
        } else {
            this.field643 = null;
            this.field649 = null;
            this.field636 = null;
            this.field648 = null;
        }
        this.field639 = null;
        this.field642 = null;
        this.field635 = null;
        this.field647 = this.field645 = this.field641 = (float[][]) null;
    }
}
