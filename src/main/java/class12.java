import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class12 extends class9 {

    @OriginalMember(owner = "client!pm", name = "t", descriptor = "I")
    public int field164 = 50;

    @OriginalMember(owner = "client!pm", name = "s", descriptor = "I")
    public int field163 = 0;

    @OriginalMember(owner = "client!pm", name = "r", descriptor = "I")
    public int field162 = 3500;

    @OriginalMember(owner = "client!pm", name = "w", descriptor = "I")
    public int field167 = 0;

    @OriginalMember(owner = "client!pm", name = "x", descriptor = "I")
    public int field168 = 512;

    @OriginalMember(owner = "client!pm", name = "D", descriptor = "Z")
    private boolean field174 = false;

    @OriginalMember(owner = "client!pm", name = "y", descriptor = "I")
    private int field169 = 0;

    @OriginalMember(owner = "client!pm", name = "F", descriptor = "I")
    public int field176 = 78642;

    @OriginalMember(owner = "client!pm", name = "J", descriptor = "I")
    public int field180 = 0;

    @OriginalMember(owner = "client!pm", name = "N", descriptor = "Z")
    private boolean field184 = false;

    @OriginalMember(owner = "client!pm", name = "O", descriptor = "Z")
    private boolean field185 = false;

    @OriginalMember(owner = "client!pm", name = "R", descriptor = "I")
    public int field188 = 0;

    @OriginalMember(owner = "client!pm", name = "V", descriptor = "I")
    private int field192 = 0;

    @OriginalMember(owner = "client!pm", name = "W", descriptor = "I")
    public int field193 = 45823;

    @OriginalMember(owner = "client!pm", name = "ab", descriptor = "I")
    private int field197 = 3500;

    @OriginalMember(owner = "client!pm", name = "z", descriptor = "I")
    private int field170 = 0;

    @OriginalMember(owner = "client!pm", name = "gb", descriptor = "I")
    public int field203 = 512;

    @OriginalMember(owner = "client!pm", name = "hb", descriptor = "I")
    public int field204 = 75518;

    @OriginalMember(owner = "client!pm", name = "U", descriptor = "I")
    public int field191 = this.field197 - 255;

    @OriginalMember(owner = "client!pm", name = "ib", descriptor = "I")
    public int field205 = 0;

    @OriginalMember(owner = "client!pm", name = "eb", descriptor = "Z")
    public boolean field201 = false;

    @OriginalMember(owner = "client!pm", name = "jb", descriptor = "I")
    public int field206 = 0;

    @OriginalMember(owner = "client!pm", name = "db", descriptor = "I")
    public int field200 = 0;

    @OriginalMember(owner = "client!pm", name = "P", descriptor = "Lbt;")
    private class363 field186 = new class363(16);

    @OriginalMember(owner = "client!pm", name = "Z", descriptor = "Ljava/awt/Canvas;")
    private Canvas field196;

    @OriginalMember(owner = "client!pm", name = "L", descriptor = "Lic;")
    public class235 field182;

    @OriginalMember(owner = "client!pm", name = "I", descriptor = "Lue;")
    private class136 field179;

    @OriginalMember(owner = "client!pm", name = "Y", descriptor = "[I")
    public int[] field195;

    @OriginalMember(owner = "client!pm", name = "M", descriptor = "I")
    public int field183;

    @OriginalMember(owner = "client!pm", name = "bb", descriptor = "I")
    private int field198;

    @OriginalMember(owner = "client!pm", name = "K", descriptor = "F")
    private float field181;

    @OriginalMember(owner = "client!pm", name = "S", descriptor = "F")
    private float field189;

    @OriginalMember(owner = "client!pm", name = "u", descriptor = "I")
    private int field165;

    @OriginalMember(owner = "client!pm", name = "v", descriptor = "I")
    public int field166;

    @OriginalMember(owner = "client!pm", name = "A", descriptor = "I")
    public int field171;

    @OriginalMember(owner = "client!pm", name = "B", descriptor = "I")
    public int field172;

    @OriginalMember(owner = "client!pm", name = "C", descriptor = "I")
    public int field173;

    @OriginalMember(owner = "client!pm", name = "H", descriptor = "I")
    public int field178;

    @OriginalMember(owner = "client!pm", name = "Q", descriptor = "I")
    public int field187;

    @OriginalMember(owner = "client!pm", name = "T", descriptor = "I")
    public int field190;

    @OriginalMember(owner = "client!pm", name = "X", descriptor = "I")
    public int field194;

    @OriginalMember(owner = "client!pm", name = "cb", descriptor = "I")
    public int field199;

    @OriginalMember(owner = "client!pm", name = "fb", descriptor = "I")
    public int field202;

    @OriginalMember(owner = "client!pm", name = "kb", descriptor = "Loi;")
    public class122 field207;

    @OriginalMember(owner = "client!pm", name = "G", descriptor = "Lbt;")
    private class363 field177;

    @OriginalMember(owner = "client!pm", name = "mb", descriptor = "Lwo;")
    private class55 field209;

    @OriginalMember(owner = "client!pm", name = "lb", descriptor = "Z")
    public boolean field208;

    @OriginalMember(owner = "client!pm", name = "E", descriptor = "[Lnc;")
    private class130[] field175;

    @OriginalMember(owner = "client!pm", name = "z", descriptor = "()V", line = 2)
    public final void method131() {
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(IIIII)V", line = 5)
    public final void method115(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field206 && arg1 < this.field167) {
            if (arg0 < this.field188) {
                arg2 -= this.field188 - arg0;
                arg0 = this.field188;
            }
            if (arg0 + arg2 > this.field205) {
                arg2 = this.field205 - arg0;
            }
            int var6 = this.field183 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field195[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field195[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field195[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field195[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field195[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "D", descriptor = "()F", line = 77)
    public final float method149() {
        return this.field189;
    }

    @OriginalMember(owner = "client!pm", name = "w", descriptor = "()V", line = 80)
    public final void method119() {
        this.field177.method2313(97);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(III[I)V", line = 84)
    public final void method114(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (this.field207.field1628 * arg2 + this.field207.field1625 * arg0 + this.field207.field1623 * arg1 >> 15) + this.field207.field1622;
        if (var5 >= this.field164 && var5 <= this.field197) {
            int var6 = ((this.field207.field1627 * arg2 + this.field207.field1630 * arg0 + this.field207.field1629 * arg1 >> 15) + this.field207.field1624) * this.field203 / var5;
            int var7 = ((this.field207.field1621 * arg2 + this.field207.field1631 * arg0 + this.field207.field1620 * arg1 >> 15) + this.field207.field1626) * this.field168 / var5;
            if (var6 >= this.field166 && var6 <= this.field202 && var7 >= this.field187 && var7 <= this.field199) {
                arg3[0] = var6 - this.field166;
                arg3[1] = var7 - this.field187;
                arg3[2] = var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(Z)V", line = 107)
    public final void method148(boolean arg0) {
    }

    @OriginalMember(owner = "client!pm", name = "K", descriptor = "()Z", line = 110)
    public final boolean method165() {
        return false;
    }

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "()I", line = 114)
    public final int method91() {
        int var1 = this.field192;
        this.field192 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lic;I)V", line = 2419)
    public class12(Canvas arg0, class235 arg1, int arg2) {
        this.field196 = arg0;
        this.field182 = arg1;
        super.field120 = arg2;
        this.field179 = class31.method306(0, this.field196);
        this.field195 = this.field179.field1857;
        this.field183 = this.field179.field1863;
        this.field198 = this.field179.field1856;
        this.method191();
    }

    @OriginalMember(owner = "client!pm", name = "q", descriptor = "()I", line = 125)
    public final int method104() {
        return this.field164;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIIII)V", line = 129)
    public final void method134(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class130 var8 = this.method195(Thread.currentThread());
        class172 var9 = var8.field1725;
        int var10 = arg2 - arg0;
        int var11 = arg3 - arg1;
        int var12 = var10 >= 0 ? var10 : -var10;
        int var13 = var11 >= 0 ? var11 : -var11;
        int var14 = var12;
        if (var12 < var13) {
            var14 = var13;
        }
        if (var14 != 0) {
            int var15 = (var10 << 16) / var14;
            int var16 = (var11 << 16) / var14;
            if (var16 <= var15) {
                var15 = -var15;
            } else {
                var16 = -var16;
            }
            int var17 = arg5 * var16 >> 17;
            int var18 = arg5 * var16 + 1 >> 17;
            int var19 = arg5 * var15 >> 17;
            int var20 = arg5 * var15 + 1 >> 17;
            int var21 = arg0 - var9.method1125();
            int var22 = arg1 - var9.method1122();
            int var23 = var17 + var21;
            int var24 = var21 - var18;
            int var25 = var10 + var21 - var18;
            int var26 = var10 + var21 + var17;
            int var27 = var19 + var22;
            int var28 = var22 - var20;
            int var29 = var11 + var22 - var20;
            int var30 = var11 + var22 + var19;
            if (arg6 == 0) {
                var9.field2246 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field2246 = 255 - (arg4 >> 24);
            }
            var9.field2244 = var23 < 0 || var23 > var9.field2239 || var24 < 0 || var24 > var9.field2239 || var25 < 0 || var25 > var9.field2239;
            var9.method1111(var27, var28, var29, var23, var24, var25, arg4);
            var9.field2244 = var23 < 0 || var23 > var9.field2239 || var24 < 0 || var24 > var9.field2239 || var26 < 0 || var26 > var9.field2239;
            var9.method1111(var27, var29, var30, var23, var25, var26, arg4);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIII)V", line = 198)
    public final void method97(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field188 && arg0 < this.field205) {
            if (arg1 < this.field206) {
                arg2 -= this.field206 - arg1;
                arg1 = this.field206;
            }
            if (arg1 + arg2 > this.field167) {
                arg2 = this.field167 - arg1;
            }
            int var6 = this.field183 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field183 * var10 + var6;
                        int var12 = this.field195[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field195[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field183 * var14 + var6;
                        int var16 = this.field195[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field195[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field195[this.field183 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "(I)[I", line = 279)
    public final int[] method187(int arg0) {
        class363 var2 = this.field177;
        class21 var3;
        synchronized (this.field177) {
            var3 = (class21) this.field177.method2310((byte) -128, (long) arg0);
            if (var3 == null) {
                if (!this.field182.method463(arg0, -26564)) {
                    return null;
                }
                class17 var5 = this.field182.method468((byte) -37, arg0);
                int var6 = !var5.field271 && !this.field174 ? 128 : 64;
                var3 = new class21(arg0, var6, this.field182.method464(var6, true, var6, arg0, 4260, 0.7F), var5.field267);
                this.field177.method2299(true, var3, (long) arg0);
            }
        }
        var3.field302 = true;
        return var3.method237();
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "()Z", line = 302)
    public final boolean method188() {
        return this.field184;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Le;IIII)Lbi;", line = 308)
    public final class143 method163(class100 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class219(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "(I)V", line = 311)
    public final void method138(int arg0) {
        this.method164(0, 0, this.field183, this.field198, arg0, 0);
    }

    @OriginalMember(owner = "client!pm", name = "y", descriptor = "()V", line = 314)
    public final void method125() {
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)Lmk;", line = 317)
    public final class161 method99(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!pm", name = "s", descriptor = "()Z", line = 320)
    public final boolean method110() {
        return true;
    }

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "(I)Z", line = 323)
    public final boolean method189(int arg0) {
        return this.field182.method468((byte) -37, arg0).field262;
    }

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "()Lm;", line = 333)
    public final class187 method84() {
        return new class122();
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIIILtm;II)V", line = 337)
    public final void method96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class195 arg6, int arg7, int arg8) {
        class164 var10 = (class164) arg6;
        int[] var11 = var10.field2173;
        int[] var12 = var10.field2164;
        int var13 = this.field206 > arg8 ? this.field206 : arg8;
        int var14 = this.field167 < var11.length + arg8 ? this.field167 : var11.length + arg8;
        int var15 = arg2 - arg0;
        int var16 = arg3 - arg1;
        if (var15 + var16 < 0) {
            arg0 += var15;
            var15 = -var15;
            arg1 += var16;
            var16 = -var16;
        }
        if (var15 > var16) {
            int var17 = arg1 << 16;
            int var18 = var17 + 32768;
            int var19 = var16 << 16;
            int var20 = (int) Math.floor((double) var19 / (double) var15 + 0.5D);
            int var21 = arg0 + var15;
            if (arg0 < this.field188) {
                var18 += (this.field188 - arg0) * var20;
                arg0 = this.field188;
            }
            if (var21 >= this.field205) {
                var21 = this.field205 - 1;
            }
            int var22 = arg4 >>> 24;
            if (arg5 != 0 && (arg5 != 1 || var22 != 255)) {
                if (arg5 == 1) {
                    int var23 = (var22 << 24) + ((arg4 & 16711935) * var22 >> 8 & 16711935) + ((arg4 & 65280) * var22 >> 8 & 65280);
                    int var24 = 256 - var22;
                    while (arg0 <= var21) {
                        int var25 = var18 >> 16;
                        int var26 = var25 - arg8;
                        if (var25 >= var13 && var25 < var14) {
                            int var27 = var11[var26] + arg7;
                            if (arg0 >= var27 && arg0 < var12[var26] + var27) {
                                int var28 = this.field183 * var25 + arg0;
                                int var29 = this.field195[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field195[var28] = var23 + var30;
                            }
                        }
                        var18 += var20;
                        ++arg0;
                    }
                } else if (arg5 == 2) {
                    while (arg0 <= var21) {
                        int var31 = var18 >> 16;
                        int var32 = var31 - arg8;
                        if (var31 >= var13 && var31 < var14) {
                            int var33 = var11[var32] + arg7;
                            if (arg0 >= var33 && arg0 < var12[var32] + var33) {
                                int var34 = this.field183 * var31 + arg0;
                                int var35 = this.field195[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field195[var34] = var36 - var38 | var38 - (var38 >>> 8);
                            }
                        }
                        var18 += var20;
                        ++arg0;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                while (arg0 <= var21) {
                    int var39 = var18 >> 16;
                    int var40 = var39 - arg8;
                    if (var39 >= var13 && var39 < var14) {
                        int var41 = var11[var40] + arg7;
                        if (arg0 >= var41 && arg0 < var12[var40] + var41) {
                            this.field195[this.field183 * var39 + arg0] = arg4;
                        }
                    }
                    var18 += var20;
                    ++arg0;
                }
            }
        } else {
            int var42 = arg0 << 16;
            int var43 = var42 + 32768;
            int var44 = var15 << 16;
            int var45 = (int) Math.floor((double) var44 / (double) var16 + 0.5D);
            int var46 = arg1 + var16;
            if (arg1 < var13) {
                var43 += (var13 - arg1) * var45;
                arg1 = var13;
            }
            if (var46 >= var14) {
                var46 = var14 - 1;
            }
            int var47 = arg4 >>> 24;
            if (arg5 == 0 || arg5 == 1 && var47 == 255) {
                while (arg1 <= var46) {
                    int var64 = var43 >> 16;
                    int var65 = arg1 - arg8;
                    int var66 = var11[var65] + arg7;
                    if (var64 >= this.field188 && var64 < this.field205 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field195[this.field183 * arg1 + var64] = arg4;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 1) {
                int var48 = (var47 << 24) + ((arg4 & 16711935) * var47 >> 8 & 16711935) + ((arg4 & 65280) * var47 >> 8 & 65280);
                int var49 = 256 - var47;
                while (arg1 <= var46) {
                    int var50 = var43 >> 16;
                    int var51 = arg1 - arg8;
                    int var52 = var11[var51] + arg7;
                    if (var50 >= this.field188 && var50 < this.field205 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field183 * arg1 + var50;
                        int var54 = this.field195[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field195[this.field183 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field188 && var56 < this.field205 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field183 * arg1 + var56;
                        int var60 = this.field195[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field195[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "F", descriptor = "()I", line = 575)
    public final int method153() {
        return 0;
    }

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "()V", line = 578)
    public final void method102() {
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lci;)V", line = 582)
    public final void method70(class400 arg0) {
        class36 var2 = arg0.field5781.field5762;
        for (class36 var3 = var2.field510; var2 != var3; var3 = var3.field510) {
            class242 var4 = (class242) var3;
            int var5 = var4.field3593 >> 12;
            int var6 = var4.field3584 >> 12;
            int var7 = var4.field3587 >> 12;
            int var8 = (this.field207.field1628 * var7 + this.field207.field1625 * var5 + this.field207.field1623 * var6 >> 15) + this.field207.field1622;
            if (var8 >= this.field164 && var8 <= this.field197) {
                int var9 = ((this.field207.field1627 * var7 + this.field207.field1630 * var5 + this.field207.field1629 * var6 >> 15) + this.field207.field1624) * this.field203 / var8 + this.field194;
                int var10 = ((this.field207.field1621 * var7 + this.field207.field1631 * var5 + this.field207.field1620 * var6 >> 15) + this.field207.field1626) * this.field168 / var8 + this.field173;
                if (var9 >= this.field188 && var9 <= this.field205 && var10 >= this.field206 && var10 <= this.field167) {
                    if (var8 == 0) {
                        var8 = 1;
                    }
                    this.method196(var4, var9, var10, (var4.field3592 >> 2) / var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lm;)V", line = 624)
    public final void method107(class187 arg0) {
        this.field207 = (class122) arg0;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "()V", line = 628)
    private final void method190() {
        this.field166 = this.field188 - this.field194;
        this.field202 = this.field205 - this.field194;
        this.field187 = this.field206 - this.field173;
        this.field199 = this.field167 - this.field173;
        for (int var1 = 0; var1 < this.field190; ++var1) {
            class172 var5 = this.field175[var1].field1725;
            var5.field2249 = this.field194 - this.field188;
            var5.field2243 = this.field173 - this.field206;
            var5.field2239 = this.field205 - this.field188;
            var5.field2238 = this.field167 - this.field206;
        }
        int var2 = this.field206 * this.field183 + this.field188;
        for (int var3 = this.field206; var3 < this.field167; ++var3) {
            for (int var4 = 0; var4 < this.field190; ++var4) {
                this.field175[var4].field1725.field2248[var3 - this.field206] = var2;
            }
            var2 += this.field183;
        }
    }

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "(II)V", line = 666)
    public final void method140(int arg0, int arg1) {
        this.field163 = arg0 & 16777215;
        int var3 = this.field163 >>> 16 & 255;
        if (var3 < 2) {
            var3 = 2;
        }
        int var4 = this.field163 >> 8 & 255;
        if (var4 < 2) {
            var4 = 2;
        }
        int var5 = this.field163 & 255;
        if (var5 < 2) {
            var5 = 2;
        }
        this.field163 = var3 << 16 | var4 << 8 | var5;
        if (arg1 < 0) {
            this.field208 = false;
        } else {
            this.field208 = true;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V", line = 690)
    public final void method87(int arg0) {
        if (this.field190 != arg0) {
            this.field190 = arg0;
            this.field175 = new class130[this.field190];
            for (int var2 = 0; var2 < this.field190; ++var2) {
                this.field175[var2] = new class130(this);
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "B", descriptor = "()Z", line = 707)
    public final boolean method135() {
        return false;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I[Lap;)V", line = 709)
    public final void method68(int arg0, class298[] arg1) {
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(II)I", line = 712)
    public final int method139(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 715)
    public final void method157(Canvas arg0) {
        this.field196 = arg0;
        this.method83();
    }

    @OriginalMember(owner = "client!pm", name = "H", descriptor = "()Z", line = 719)
    public final boolean method159() {
        return false;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)I", line = 722)
    public final int method85(int arg0, int arg1) {
        int var3 = arg0 | 66560;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "()V", line = 726)
    private final void method191() {
        this.field177 = new class363(20);
        this.field207 = new class122();
        class375.method2374(-1, false, true);
        this.field185 = true;
        this.method87(1);
        this.method111(0);
        this.method162();
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIIIIIII)V", line = 736)
    public final void method121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class130 var11 = this.method195(Thread.currentThread());
        class172 var12 = var11.field1725;
        var12.field2245 = false;
        int var13 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var13 == 255) {
            var12.field2245 = false;
            var12.field2246 = 0;
            var12.field2244 = true;
            var12.method1120(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else {
            if (arg9 != 1) {
                if (arg9 == 2) {
                    throw new IllegalStateException();
                }
                throw new IllegalArgumentException();
            }
            var12.field2245 = false;
            var12.field2246 = 255 - var13;
            var12.field2244 = true;
            var12.method1120(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        }
        var12.field2245 = true;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "([I)V", line = 771)
    public final void method76(int[] arg0) {
        arg0[0] = this.field188;
        arg0[1] = this.field206;
        arg0[2] = this.field205;
        arg0[3] = this.field167;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lhi;[Ltr;Z)Ldf;", line = 779)
    public final class85 method122(class365 arg0, class144[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field1952;
            var5[var7] = arg1[var7].field1955;
            if (arg1[var7].field1953 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            return new class80(this, arg0, arg1, var4, var5);
        } else if (var6) {
            return new class65(this, arg0, arg1, var4, var5);
        } else {
            return new class415(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)V", line = 809)
    public final void method74(int arg0, int arg1, int arg2) {
        this.field200 = arg0;
        this.field163 = arg1;
        this.field180 = arg2;
    }

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "()I", line = 814)
    public final int method103() {
        return 0;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 817)
    public final void method143(Rectangle[] arg0, int arg1) {
        if (this.field196 != null && this.field179 != null) {
            try {
                Graphics var3 = this.field196.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field183 && var5.y <= this.field198 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field179.method859(var5.y, var5.width, (byte) 127, var5.x, var3, var5.height);
                    }
                }
            } catch (Exception var6) {
                this.field196.repaint();
            }
        } else {
            throw new IllegalStateException("Can't flip an offscreen toolkit");
        }
    }

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "(IIII)V", line = 843)
    public final void method170(int arg0, int arg1, int arg2, int arg3) {
        if (this.field188 < arg0) {
            this.field188 = arg0;
        }
        if (this.field206 < arg1) {
            this.field206 = arg1;
        }
        if (this.field205 > arg2) {
            this.field205 = arg2;
        }
        if (this.field167 > arg3) {
            this.field167 = arg3;
        }
        this.method190();
    }

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "()V", line = 858)
    public final void method83() {
        this.field179 = class31.method306(0, this.field196);
        this.field195 = this.field179.field1857;
        this.field183 = this.field179.field1863;
        this.field198 = this.field179.field1856;
        for (int var1 = 0; var1 < this.field190; ++var1) {
            this.field175[var1].method872(false);
        }
        this.method162();
    }

    @OriginalMember(owner = "client!pm", name = "r", descriptor = "()Z", line = 872)
    public final boolean method109() {
        return false;
    }

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "(I)Z", line = 875)
    public final boolean method192(int arg0) {
        return this.field174 || this.field182.method468((byte) -37, arg0).field271;
    }

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "()I", line = 881)
    public final int method80() {
        return this.field197;
    }

    @OriginalMember(owner = "client!pm", name = "C", descriptor = "()Lm;", line = 885)
    public final class187 method145() {
        class130 var1 = this.method195(Thread.currentThread());
        return var1.field1734;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(F)V", line = 890)
    public final void method161(float arg0) {
        this.field204 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(IIII)V", line = 893)
    public final void method77(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field183) {
            arg2 = this.field183;
        }
        if (arg3 > this.field198) {
            arg3 = this.field198;
        }
        this.field188 = arg0;
        this.field205 = arg2;
        this.field206 = arg1;
        this.field167 = arg3;
        this.method190();
    }

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "(I)V", line = 916)
    public final void method144(int arg0) {
        int var2 = arg0 - this.field165;
        for (Object var3 = this.field177.method2304(25); var3 != null; var3 = this.field177.method2302((byte) -120)) {
            class21 var4 = (class21) var3;
            if (var4.field302) {
                var4.field304 += var2;
                int var5 = var4.field304 / 20;
                if (var5 > 0) {
                    class17 var6 = this.field182.method468((byte) -37, var4.field299);
                    var4.method239(var6.field274 * var2 * 50 / 1000, var6.field266 * var2 * 50 / 1000);
                    var4.field304 -= var5 * 20;
                }
                var4.field302 = false;
            }
        }
        this.field165 = arg0;
        this.field186.method2300(5, true);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V", line = 948)
    public final void method79(boolean arg0) {
        this.field174 = arg0;
        this.field177.method2313(108);
    }

    @OriginalMember(owner = "client!pm", name = "u", descriptor = "()Z", line = 954)
    public final boolean method113() {
        return true;
    }

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "()Z", line = 957)
    public final boolean method86() {
        return false;
    }

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "(I)I", line = 961)
    public final int method193(int arg0) {
        return this.field182.method468((byte) -37, arg0).field259 & 65535;
    }

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "(I)Z", line = 964)
    public final boolean method194(int arg0) {
        return this.field182.method463(arg0, -26564);
    }

    @OriginalMember(owner = "client!pm", name = "L", descriptor = "()Z", line = 967)
    public final boolean method167() {
        return false;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/lang/Runnable;)Lnc;", line = 972)
    public final class130 method195(Runnable arg0) {
        for (int var2 = 0; var2 < this.field190; ++var2) {
            if (this.field175[var2].field1724 == arg0) {
                return this.field175[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!pm", name = "v", descriptor = "()Z", line = 984)
    public final boolean method117() {
        return false;
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(IIIIII)Z", line = 988)
    public final boolean method116(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (this.field207.field1628 * arg2 + this.field207.field1625 * arg0 + this.field207.field1623 * arg1 >> 15) + this.field207.field1622;
        if (var7 < 1) {
            var7 = 1;
        }
        int var8 = (this.field207.field1628 * arg5 + this.field207.field1625 * arg3 + this.field207.field1623 * arg4 >> 15) + this.field207.field1622;
        if (var8 < 1) {
            var8 = 1;
        }
        if ((var7 >= this.field164 || var8 >= this.field164) && (var7 <= this.field197 || var8 <= this.field197)) {
            int var9 = ((this.field207.field1627 * arg2 + this.field207.field1630 * arg0 + this.field207.field1629 * arg1 >> 15) + this.field207.field1624) * this.field203 / var7;
            int var10 = ((this.field207.field1627 * arg5 + this.field207.field1630 * arg3 + this.field207.field1629 * arg4 >> 15) + this.field207.field1624) * this.field203 / var8;
            if (var9 < this.field166 && var10 < this.field166 || var9 > this.field202 && var10 > this.field202) {
                return false;
            } else {
                int var11 = ((this.field207.field1621 * arg2 + this.field207.field1631 * arg0 + this.field207.field1620 * arg1 >> 15) + this.field207.field1626) * this.field168 / var7;
                int var12 = ((this.field207.field1621 * arg5 + this.field207.field1631 * arg3 + this.field207.field1620 * arg4 >> 15) + this.field207.field1626) * this.field168 / var8;
                return (var11 >= this.field187 || var12 >= this.field187) && (var11 <= this.field199 || var12 <= this.field199);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIII[BII)V", line = 1022)
    public final void method169(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field183 * arg1 + arg0;
            int var15 = this.field183 - arg2;
            if (arg1 + arg3 > this.field167) {
                arg3 -= arg1 + arg3 - this.field167;
            }
            if (arg1 < this.field206) {
                int var16 = this.field206 - arg1;
                arg3 -= var16;
                var14 += this.field183 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field205) {
                int var17 = arg0 + arg2 - this.field205;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field188) {
                int var18 = this.field188 - arg0;
                arg2 -= var18;
                var14 += var18;
                var10 += var12 * var18;
                var15 += var18;
            }
            int var19 = arg4 >>> 24;
            int var20 = arg5 >>> 24;
            if (arg8 != 0 && (arg8 != 1 || var19 != 255 || var20 != 255)) {
                if (arg8 == 1) {
                    int var21 = var10;
                    for (int var22 = -arg3; var22 < 0; ++var22) {
                        int var23 = (var11 >> 16) * arg7;
                        for (int var24 = -arg2; var24 < 0; ++var24) {
                            int var25 = arg4;
                            if (arg6[(var10 >> 16) + var23] != 0) {
                                var25 = arg5;
                            }
                            int var26 = var25 >>> 24;
                            int var27 = 255 - var26;
                            int var28 = this.field195[var14];
                            this.field195[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
                            var10 += var12;
                        }
                        var11 += var13;
                        var10 = var21;
                        var14 += var15;
                    }
                } else if (arg8 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    int var29 = var10;
                    for (int var30 = -arg3; var30 < 0; ++var30) {
                        int var31 = (var11 >> 16) * arg7;
                        for (int var32 = -arg2; var32 < 0; ++var32) {
                            int var33 = arg4;
                            if (arg6[(var10 >> 16) + var31] != 0) {
                                var33 = arg5;
                            }
                            if (var33 != 0) {
                                int var34 = this.field195[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field195[var14++] = var35 - var37 | var37 - (var37 >>> 8);
                            } else {
                                ++var14;
                            }
                            var10 += var12;
                        }
                        var11 += var13;
                        var10 = var29;
                        var14 += var15;
                    }
                }
            } else {
                int var38 = var10;
                for (int var39 = -arg3; var39 < 0; ++var39) {
                    int var40 = (var11 >> 16) * arg7;
                    for (int var41 = -arg2; var41 < 0; ++var41) {
                        if (arg6[(var10 >> 16) + var40] != 0) {
                            this.field195[var14++] = arg5;
                        } else {
                            this.field195[var14++] = arg4;
                        }
                        var10 += var12;
                    }
                    var11 += var13;
                    var10 = var38;
                    var14 += var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(Z)V", line = 1196)
    public final void method146(boolean arg0) {
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(IIII)V", line = 1205)
    public final void method101(int arg0, int arg1, int arg2, int arg3) {
        this.field194 = arg0;
        this.field173 = arg1;
        this.field203 = arg2;
        this.field168 = arg3;
        this.method190();
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILtm;II)V", line = 1217)
    public final void method105(int arg0, class195 arg1, int arg2, int arg3) {
        class164 var5 = (class164) arg1;
        int[] var6 = var5.field2173;
        int[] var7 = var5.field2164;
        int var8;
        if (this.field167 < var6.length + arg3) {
            var8 = this.field167 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field206 > arg3) {
            var9 = this.field206 - arg3;
            arg3 = this.field206;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field183 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field188 > var12) {
                    var13 -= this.field188 - var12;
                    var12 = this.field188;
                }
                if (this.field205 < var12 + var13) {
                    var13 = this.field205 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field195[var14++] = arg0;
                }
                var10 += this.field183;
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IFFFFF)V", line = 1274)
    public final void method133(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field193 = (int) (arg1 * 65535.0F);
        this.field176 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field171 = (int) (arg3 * 65535.0F / var7);
        this.field178 = (int) (arg4 * 65535.0F / var7);
        this.field172 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(FF)V", line = 1283)
    public final void method81(float arg0, float arg1) {
        this.field181 = arg0;
        this.field189 = arg1;
        this.method198();
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lw;III)V", line = 1290)
    public final void method196(class242 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 >> 1;
        int var6 = arg0.field3585;
        if (var6 == -1) {
            this.method106(arg1, arg2, var5, arg0.field3597, 1);
        } else {
            if (this.field209 == null || (long) var6 != this.field209.field3907) {
                this.field209 = (class55) this.field186.method2310((byte) -124, (long) var6);
            }
            if (this.field209 == null) {
                int[] var7 = this.method197(var6);
                if (var7 == null) {
                    return;
                }
                this.field209 = new class55();
                this.field209.field679 = this.method192(var6);
                int var8 = this.field209.field679 ? 64 : 128;
                this.field209.field676 = this.method98(var7, 0, var8, var8, var8);
                this.field186.method2299(true, this.field209, (long) var6);
            }
            if (this.field209.field679) {
                var5 <<= 1;
                arg3 <<= 1;
            }
            this.field209.field676.method929(arg1 - var5, arg2 - var5, arg3, arg3, 1, arg0.field3597, 1);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ltr;Z)Lae;", line = 1331)
    public final class285 method100(class144 arg0, boolean arg1) {
        int[] var3 = arg0.field1956;
        byte[] var4 = arg0.field1958;
        int var5 = arg0.field1952;
        int var6 = arg0.field1955;
        class273 var11;
        if (arg1 && arg0.field1953 == null) {
            int[] var7 = new int[var3.length];
            byte[] var8 = new byte[var5 * var6];
            for (int var9 = 0; var9 < var6; ++var9) {
                int var12 = var5 * var9;
                for (int var13 = 0; var13 < var5; ++var13) {
                    var8[var12 + var13] = var4[var12 + var13];
                }
            }
            for (int var10 = 0; var10 < var3.length; ++var10) {
                var7[var10] = var3[var10];
            }
            var11 = new class140(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field1953;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class221(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var21 = var5 * var19;
                    for (int var22 = 0; var22 < var5; ++var22) {
                        var14[var21 + var22] = var3[var4[var21 + var22] & 255];
                    }
                }
                new class221(this, var14, var5, var6);
                var11 = new class398(this, var14, var5, var6);
            }
        }
        var11.method1867(arg0.field1951, arg0.field1957, arg0.field1959, arg0.field1954);
        return var11;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "([IIIII)Lae;", line = 1434)
    public final class285 method98(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class221(this, arg0, arg1, arg2, arg3, arg4) : new class398(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class221(this, arg0, arg1, arg2, arg3, arg4) : new class398(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!pm", name = "t", descriptor = "()I", line = 1472)
    public final int method112() {
        int var1 = this.field170;
        this.field170 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "(IIIIII)V", line = 1477)
    public final void method164(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field188) {
            arg2 -= this.field188 - arg0;
            arg0 = this.field188;
        }
        if (arg1 < this.field206) {
            arg3 -= this.field206 - arg1;
            arg1 = this.field206;
        }
        if (arg0 + arg2 > this.field205) {
            arg2 = this.field205 - arg0;
        }
        if (arg1 + arg3 > this.field167) {
            arg3 = this.field167 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field205 && arg1 <= this.field167) {
            int var7 = this.field183 - arg2;
            int var8 = this.field183 * arg1 + arg0;
            int var9 = arg4 >>> 24;
            if (arg5 == 0 || arg5 == 1 && var9 == 255) {
                int var22 = arg2 >> 3;
                int var23 = arg2 & 7;
                int var24 = var8 - 1;
                for (int var25 = -arg3; var25 < 0; ++var25) {
                    if (var22 > 0) {
                        int var26 = var22;
                        do {
                            ++var24;
                            this.field195[var24] = arg4;
                            ++var24;
                            this.field195[var24] = arg4;
                            ++var24;
                            this.field195[var24] = arg4;
                            ++var24;
                            this.field195[var24] = arg4;
                            ++var24;
                            this.field195[var24] = arg4;
                            ++var24;
                            this.field195[var24] = arg4;
                            ++var24;
                            this.field195[var24] = arg4;
                            ++var24;
                            this.field195[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field195[var24] = arg4;
                            --var27;
                        } while (var27 > 0);
                    }
                    var24 += var7;
                }
            } else if (arg5 == 1) {
                int var10 = (var9 << 24) + ((arg4 & 16711935) * var9 >> 8 & 16711935) + ((arg4 & 65280) * var9 >> 8 & 65280);
                int var11 = 256 - var9;
                for (int var12 = 0; var12 < arg3; ++var12) {
                    for (int var13 = -arg2; var13 < 0; ++var13) {
                        int var14 = this.field195[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + ((var14 & 65280) * var11 >> 8 & 65280);
                        this.field195[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field195[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field195[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "A", descriptor = "()F", line = 1612)
    public final float method132() {
        return this.field181;
    }

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "(IIIIII)V", line = 1615)
    public final void method156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method115(arg0, arg1, arg2, arg4, arg5);
        this.method115(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method97(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method97(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "([Lbi;Lm;[Loo;I)V", line = 1622)
    public final void method147(class143[] arg0, class187 arg1, class396[] arg2, int arg3) {
        class219[] var5 = new class219[arg0.length];
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class219) arg0[var6];
            }
        }
        class219 var7 = class219.method1510(this, var5);
        var7.method1514(arg1, arg2 != null ? arg2[0] : null, (class400) null, arg3);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II[I[I)Ltm;", line = 1637)
    public final class195 method71(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class164(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "(I)V", line = 1641)
    public final void method129(int arg0) {
        this.field175[arg0].method875(125, (Runnable) null);
    }

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "()Z", line = 1645)
    public final boolean method69() {
        return true;
    }

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "()Z", line = 1648)
    public final boolean method89() {
        return false;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lbi;Lci;Lm;Loo;I)V", line = 1651)
    public final void method166(class143 arg0, class400 arg1, class187 arg2, class396 arg3, int arg4) {
        ((class219) arg0).method1514(arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "()V", line = 1654)
    public final void method72() {
        this.field163 = this.field169;
        this.field201 = false;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIII)Lsd;", line = 1658)
    public final class71 method82(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "(IIII)V", line = 1660)
    public final void method152(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(FFF)V", line = 1662)
    public final void method75(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "([Lbi;Lci;Lm;[Loo;I)V", line = 1671)
    public final void method108(class143[] arg0, class400 arg1, class187 arg2, class396[] arg3, int arg4) {
        class219[] var6 = new class219[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class219) arg0[var7];
            }
        }
        class219 var8 = class219.method1510(this, var6);
        var8.method1514(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lmk;)V", line = 1685)
    public final void method127(class161 arg0) {
    }

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "()Z", line = 1691)
    public final boolean method94() {
        return false;
    }

    @OriginalMember(owner = "client!pm", name = "I", descriptor = "()Z", line = 1702)
    public final boolean method160() {
        return false;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lsd;Lsd;FLsd;)Lsd;", line = 1705)
    public final class71 method142(class71 arg0, class71 arg1, float arg2, class71 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!pm", name = "G", descriptor = "()V", line = 1708)
    public final void method158() {
        if (this.field196 != null && this.field179 != null) {
            try {
                Graphics var1 = this.field196.getGraphics();
                this.field179.method860(0, var1, 0, (byte) -125);
            } catch (Exception var2) {
                this.field196.repaint();
            }
        } else {
            throw new IllegalStateException("Can't flip an offscreen toolkit");
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II[[I[[IIII)Lui;", line = 1720)
    public final class378 method92(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class460(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(IIIII)V", line = 1723)
    public final void method106(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field206) {
            var6 = this.field206;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field167) {
            var7 = this.field167;
        }
        int var8 = var6;
        int var9 = arg2 * arg2;
        int var10 = 0;
        int var11 = arg1 - var6;
        int var12 = var11 * var11;
        int var13 = var12 - var11;
        if (arg1 > var7) {
            arg1 = var7;
        }
        int var14 = arg3 >>> 24;
        if (arg4 == 0 || arg4 == 1 && var14 == 255) {
            while (var8 < arg1) {
                while (var13 <= var9 || var12 <= var9) {
                    var12 += var10 + var10;
                    var13 += var10++ + var10;
                }
                int var64 = arg0 - var10 + 1;
                if (var64 < this.field188) {
                    var64 = this.field188;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field205) {
                    var65 = this.field205;
                }
                int var66 = this.field183 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field195[var66++] = arg3;
                }
                ++var8;
                var12 -= var11-- + var11;
                var13 -= var11 + var11;
            }
            int var55 = arg2;
            int var56 = var8 - arg1;
            int var57 = var56 * var56 + var9;
            int var58 = var57 - arg2;
            int var59 = var57 - var56;
            while (var8 < var7) {
                while (var59 > var9 && var58 > var9) {
                    var59 -= var55-- + var55;
                    var58 -= var55 + var55;
                }
                int var60 = arg0 - var55;
                if (var60 < this.field188) {
                    var60 = this.field188;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field205 - 1) {
                    var61 = this.field205 - 1;
                }
                int var62 = this.field183 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field195[var62++] = arg3;
                }
                ++var8;
                var59 += var56 + var56;
                var58 += var56++ + var56;
            }
        } else if (arg4 == 1) {
            int var15 = (var14 << 24) + ((arg3 & 16711935) * var14 >> 8 & 16711935) + ((arg3 & 65280) * var14 >> 8 & 65280);
            int var16 = 256 - var14;
            while (var8 < arg1) {
                while (var13 <= var9 || var12 <= var9) {
                    var12 += var10 + var10;
                    var13 += var10++ + var10;
                }
                int var28 = arg0 - var10 + 1;
                if (var28 < this.field188) {
                    var28 = this.field188;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field205) {
                    var29 = this.field205;
                }
                int var30 = this.field183 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field195[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field195[var30++] = var15 + var33;
                }
                ++var8;
                var12 -= var11-- + var11;
                var13 -= var11 + var11;
            }
            int var17 = arg2;
            int var18 = -var11;
            int var19 = var18 * var18 + var9;
            int var20 = var19 - arg2;
            int var21 = var19 - var18;
            while (var8 < var7) {
                while (var21 > var9 && var20 > var9) {
                    var21 -= var17-- + var17;
                    var20 -= var17 + var17;
                }
                int var22 = arg0 - var17;
                if (var22 < this.field188) {
                    var22 = this.field188;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field205 - 1) {
                    var23 = this.field205 - 1;
                }
                int var24 = this.field183 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field195[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field195[var24++] = var15 + var27;
                }
                ++var8;
                var21 += var18 + var18;
                var20 += var18++ + var18;
            }
        } else if (arg4 != 2) {
            throw new IllegalArgumentException();
        } else {
            while (var8 < arg1) {
                while (var13 <= var9 || var12 <= var9) {
                    var12 += var10 + var10;
                    var13 += var10++ + var10;
                }
                int var47 = arg0 - var10 + 1;
                if (var47 < this.field188) {
                    var47 = this.field188;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field205) {
                    var48 = this.field205;
                }
                int var49 = this.field183 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field195[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field195[var49++] = var52 - var54 | var54 - (var54 >>> 8);
                }
                ++var8;
                var12 -= var11-- + var11;
                var13 -= var11 + var11;
            }
            int var34 = arg2;
            int var35 = -var11;
            int var36 = var35 * var35 + var9;
            int var37 = var36 - arg2;
            int var38 = var36 - var35;
            while (var8 < var7) {
                while (var38 > var9 && var37 > var9) {
                    var38 -= var34-- + var34;
                    var37 -= var34 + var34;
                }
                int var39 = arg0 - var34;
                if (var39 < this.field188) {
                    var39 = this.field188;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field205 - 1) {
                    var40 = this.field205 - 1;
                }
                int var41 = this.field183 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field195[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field195[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "x", descriptor = "()V", line = 2009)
    public final void method124() {
        if (this.field185) {
            class342.method2223(-10703, true, false);
            this.field185 = false;
        }
        this.field196 = null;
        this.field182 = null;
        this.field179 = null;
        this.field184 = true;
    }

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "()V", line = 2022)
    public final void method67() {
    }

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "(I)[I", line = 2026)
    private final int[] method197(int arg0) {
        class363 var2 = this.field177;
        class21 var3;
        synchronized (this.field177) {
            var3 = (class21) this.field177.method2310((byte) -127, (long) arg0);
            if (var3 == null) {
                if (!this.field182.method463(arg0, -26564)) {
                    return null;
                }
                class17 var5 = this.field182.method468((byte) -37, arg0);
                int var6 = !var5.field271 && !this.field174 ? 128 : 64;
                var3 = new class21(arg0, var6, this.field182.method461(arg0, true, var6, var6, 0.7F, (byte) -96), var5.field267);
                this.field177.method2299(true, var3, (long) arg0);
            }
        }
        var3.field302 = true;
        return var3.method237();
    }

    @OriginalMember(owner = "client!pm", name = "J", descriptor = "()V", line = 2047)
    public final void method162() {
        this.field188 = 0;
        this.field206 = 0;
        this.field205 = this.field183;
        this.field167 = this.field198;
        this.method190();
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(III)V", line = 2054)
    public final void method154(int arg0, int arg1, int arg2) {
        this.field169 = this.field163;
        this.field200 = arg0;
        this.field163 = arg1;
        this.field180 = arg2;
        this.field201 = true;
    }

    @OriginalMember(owner = "client!pm", name = "E", descriptor = "()V", line = 2073)
    private final void method198() {
        if (this.field189 != 0.0F) {
            float var1 = (float) this.field197;
            float var2 = (float) this.field164;
            float var3 = -(var2 * 2.0F * var1) / (var1 - var2);
            float var4 = this.field181 / (this.field189 + this.field181);
            float var5 = var4 * var4;
            float var6 = (1.0F - var4) * -var3 * (1.0F - var4) / this.field189;
            this.field162 = (int) (((float) this.field197 - var3 * var5) / ((var1 + var2) / (var1 - var2) - var6) + 0.5F);
        } else {
            this.field162 = this.field197;
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(II)V", line = 2095)
    public final void method93(int arg0, int arg1) {
        this.field164 = arg0;
        this.field197 = arg1;
        this.field191 = this.field197 - 255;
        this.method198();
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lsd;)V", line = 2104)
    public final void method118(class71 arg0) {
    }

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "(IIIIII)V", line = 2109)
    public final void method137(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method115(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method115(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method97(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method97(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
            }
        } else {
            if (var7 + var8 < 0) {
                arg0 += var7;
                var7 = -var7;
                arg1 += var8;
                var8 = -var8;
            }
            if (var7 > var8) {
                int var9 = arg1 << 16;
                int var10 = var9 + 32768;
                int var11 = var8 << 16;
                int var12 = (int) Math.floor((double) var11 / (double) var7 + 0.5D);
                int var13 = arg0 + var7;
                if (arg0 < this.field188) {
                    var10 += (this.field188 - arg0) * var12;
                    arg0 = this.field188;
                }
                if (var13 >= this.field205) {
                    var13 = this.field205 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field206 && var17 < this.field167) {
                                int var18 = this.field183 * var17 + arg0;
                                int var19 = this.field195[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field195[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field206 && var21 < this.field167) {
                                int var22 = this.field183 * var21 + arg0;
                                int var23 = this.field195[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field195[var22] = var24 - var26 | var26 - (var26 >>> 8);
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    while (arg0 <= var13) {
                        int var27 = var10 >> 16;
                        if (var27 >= this.field206 && var27 < this.field167) {
                            this.field195[this.field183 * var27 + arg0] = arg4;
                        }
                        var10 += var12;
                        ++arg0;
                    }
                }
            } else {
                int var28 = arg0 << 16;
                int var29 = var28 + 32768;
                int var30 = var7 << 16;
                int var31 = (int) Math.floor((double) var30 / (double) var8 + 0.5D);
                int var32 = arg1 + var8;
                if (arg1 < this.field206) {
                    var29 += (this.field206 - arg1) * var31;
                    arg1 = this.field206;
                }
                if (var32 >= this.field167) {
                    var32 = this.field167 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field188 && var46 < this.field205) {
                            this.field195[this.field183 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field188 && var36 < this.field205) {
                            int var37 = this.field183 * arg1 + var36;
                            int var38 = this.field195[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field195[this.field183 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field188 && var40 < this.field205) {
                            int var41 = this.field183 * arg1 + var40;
                            int var42 = this.field195[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field195[var41] = var43 - var45 | var45 - (var45 >>> 8);
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIZ)Lae;", line = 2327)
    public final class285 method123(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field183 * arg1 + arg0;
        int var8 = this.field183 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field195[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class221(this, var6, arg2, arg3);
        } else {
            return new class398(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "()Z", line = 2360)
    public final boolean method78() {
        return true;
    }

    @OriginalMember(owner = "client!pm", name = "M", descriptor = "()Z", line = 2366)
    public final boolean method168() {
        return false;
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)V", line = 2369)
    public final void method111(int arg0) {
        this.field175[arg0].method875(124, Thread.currentThread());
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIII)[I", line = 2387)
    public final int[] method73(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field183 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field195[var8 + var9];
            }
        }
        return var5;
    }
}
