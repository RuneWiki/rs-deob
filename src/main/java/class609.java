import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class609 extends class65 {

    @OriginalMember(owner = "client!pm", name = "B", descriptor = "Z")
    private boolean field8529;

    @OriginalMember(owner = "client!pm", name = "x", descriptor = "Z")
    private boolean field8525;

    @OriginalMember(owner = "client!pm", name = "z", descriptor = "Ljo;")
    private class353 field8527;

    @OriginalMember(owner = "client!pm", name = "F", descriptor = "I")
    private int field8533;

    @OriginalMember(owner = "client!pm", name = "R", descriptor = "I")
    public int field8545;

    @OriginalMember(owner = "client!pm", name = "P", descriptor = "I")
    public int field8543;

    @OriginalMember(owner = "client!pm", name = "ab", descriptor = "I")
    public int field8554;

    @OriginalMember(owner = "client!pm", name = "gb", descriptor = "I")
    private int field8560;

    @OriginalMember(owner = "client!pm", name = "ib", descriptor = "I")
    public int field8562;

    @OriginalMember(owner = "client!pm", name = "jb", descriptor = "I")
    public int field8563;

    @OriginalMember(owner = "client!pm", name = "H", descriptor = "Z")
    private boolean field8535;

    @OriginalMember(owner = "client!pm", name = "hb", descriptor = "I")
    public int field8561;

    @OriginalMember(owner = "client!pm", name = "eb", descriptor = "I")
    public int field8558;

    @OriginalMember(owner = "client!pm", name = "L", descriptor = "I")
    public int field8539;

    @OriginalMember(owner = "client!pm", name = "mb", descriptor = "I")
    public int field8566;

    @OriginalMember(owner = "client!pm", name = "nb", descriptor = "I")
    public int field8567;

    @OriginalMember(owner = "client!pm", name = "ob", descriptor = "I")
    public int field8568;

    @OriginalMember(owner = "client!pm", name = "qb", descriptor = "I")
    public int field8570;

    @OriginalMember(owner = "client!pm", name = "lb", descriptor = "Loo;")
    private class652 field8565;

    @OriginalMember(owner = "client!pm", name = "sb", descriptor = "I")
    private int field8572;

    @OriginalMember(owner = "client!pm", name = "N", descriptor = "Loo;")
    private class652 field8541;

    @OriginalMember(owner = "client!pm", name = "X", descriptor = "Lhda;")
    public class781 field8551;

    @OriginalMember(owner = "client!pm", name = "C", descriptor = "I")
    private int field8530;

    @OriginalMember(owner = "client!pm", name = "y", descriptor = "I")
    private int field8526;

    @OriginalMember(owner = "client!pm", name = "D", descriptor = "I")
    private int field8531;

    @OriginalMember(owner = "client!pm", name = "J", descriptor = "I")
    private int field8537;

    @OriginalMember(owner = "client!pm", name = "K", descriptor = "I")
    public int field8538;

    @OriginalMember(owner = "client!pm", name = "M", descriptor = "I")
    private int field8540;

    @OriginalMember(owner = "client!pm", name = "O", descriptor = "I")
    public int field8542;

    @OriginalMember(owner = "client!pm", name = "S", descriptor = "I")
    public int field8546;

    @OriginalMember(owner = "client!pm", name = "T", descriptor = "I")
    private int field8547;

    @OriginalMember(owner = "client!pm", name = "U", descriptor = "I")
    private int field8548;

    @OriginalMember(owner = "client!pm", name = "V", descriptor = "I")
    public int field8549;

    @OriginalMember(owner = "client!pm", name = "W", descriptor = "I")
    public int field8550;

    @OriginalMember(owner = "client!pm", name = "Y", descriptor = "I")
    public int field8552;

    @OriginalMember(owner = "client!pm", name = "Z", descriptor = "I")
    public int field8553;

    @OriginalMember(owner = "client!pm", name = "bb", descriptor = "I")
    public int field8555;

    @OriginalMember(owner = "client!pm", name = "db", descriptor = "I")
    public int field8557;

    @OriginalMember(owner = "client!pm", name = "kb", descriptor = "I")
    private int field8564;

    @OriginalMember(owner = "client!pm", name = "pb", descriptor = "I")
    public int field8569;

    @OriginalMember(owner = "client!pm", name = "rb", descriptor = "I")
    public int field8571;

    @OriginalMember(owner = "client!pm", name = "Q", descriptor = "Ljf;")
    private class227 field8544;

    @OriginalMember(owner = "client!pm", name = "A", descriptor = "Lub;")
    public class22 field8528;

    @OriginalMember(owner = "client!pm", name = "tb", descriptor = "Ljd;")
    private class241 field8573;

    @OriginalMember(owner = "client!pm", name = "E", descriptor = "Ljava/awt/Canvas;")
    private Canvas field8532;

    @OriginalMember(owner = "client!pm", name = "G", descriptor = "[F")
    public float[] field8534;

    @OriginalMember(owner = "client!pm", name = "cb", descriptor = "[F")
    public float[] field8556;

    @OriginalMember(owner = "client!pm", name = "I", descriptor = "[I")
    public int[] field8536;

    @OriginalMember(owner = "client!pm", name = "fb", descriptor = "[Ldv;")
    private class685[] field8559;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "(I)V", line = 4)
    public final void method497(int arg0) {
        this.field8569 = arg0;
        this.field8559 = new class685[this.field8569];
        for (int var2 = 0; var2 < this.field8569; ++var2) {
            this.field8559[var2] = new class685(this);
        }
    }

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "()Z", line = 17)
    public final boolean method3531() {
        return this.field8525;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIIILaa;II)V", line = 21)
    public final void method539(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class511 arg6, int arg7, int arg8) {
        class386 var10 = (class386) arg6;
        int[] var11 = var10.field5351;
        int[] var12 = var10.field5350;
        int var13 = this.field8543 > arg8 ? this.field8543 : arg8;
        int var14 = this.field8539 < var11.length + arg8 ? this.field8539 : var11.length + arg8;
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
            if (arg0 < this.field8568) {
                var18 += (this.field8568 - arg0) * var20;
                arg0 = this.field8568;
            }
            if (var21 >= this.field8567) {
                var21 = this.field8567 - 1;
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
                                int var28 = this.field8557 * var25 + arg0;
                                int var29 = this.field8536[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field8536[var28] = var23 + var30;
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
                                int var34 = this.field8557 * var31 + arg0;
                                int var35 = this.field8536[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field8536[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field8536[this.field8557 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field8568 && var64 < this.field8567 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field8536[this.field8557 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field8568 && var50 < this.field8567 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field8557 * arg1 + var50;
                        int var54 = this.field8536[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field8536[this.field8557 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field8568 && var56 < this.field8567 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field8557 * arg1 + var56;
                        int var60 = this.field8536[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field8536[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "(I)Z", line = 260)
    public final boolean method3532(int arg0) {
        return super.field774.method1208((byte) 47, arg0).field6572 || super.field774.method1208((byte) 47, arg0).field6566;
    }

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "()Z", line = 263)
    public final boolean method451() {
        return false;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lqaa;Lqaa;FLqaa;)Lqaa;", line = 266)
    public final class29 method470(class29 arg0, class29 arg1, float arg2, class29 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!pm", name = "A", descriptor = "()Lcq;", line = 270)
    public final class491 method553() {
        return new class491(0, "Pure Java", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lon;IIII)V", line = 275)
    private final void method3533(class354 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg0.field4987;
        int var8 = arg4 << 1;
        if (var6 == -1) {
            this.method3538(arg1, arg2, arg3, arg4, arg0.field4988, 1);
        } else {
            if (this.field8572 != var6) {
                class241 var9 = (class241) this.field8565.method3742((byte) 67, (long) var6);
                if (var9 == null) {
                    int[] var10 = this.method3542(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = this.method3545(var6) ? 64 : this.field8563;
                    var9 = this.method458((byte) -119, var11, var11, var10, var11, 0);
                    this.field8565.method3739((long) var6, (byte) 102, var9);
                }
                this.field8572 = var6;
                this.field8573 = var9;
            }
            ++var8;
            ((class412) this.field8573).method363(arg1 - arg4, arg2 - arg4, arg3, var8, var8, 0, arg0.field4988, 1, 1);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V", line = 313)
    public final void method473(boolean arg0) {
        this.field8535 = arg0;
        this.field8541.method3735(2);
    }

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "(I)Z", line = 317)
    public final boolean method3534(int arg0) {
        return super.field774.method1212(122, arg0);
    }

    @OriginalMember(owner = "client!pm", name = "z", descriptor = "()V", line = 319)
    public final void method548() {
    }

    @OriginalMember(owner = "client!pm", name = "za", descriptor = "(IIIII)V", line = 322)
    public final void method500(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field8543) {
            var6 = this.field8543;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field8539) {
            var7 = this.field8539;
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
                if (var64 < this.field8568) {
                    var64 = this.field8568;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field8567) {
                    var65 = this.field8567;
                }
                int var66 = this.field8557 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field8536[var66++] = arg3;
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
                if (var60 < this.field8568) {
                    var60 = this.field8568;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field8567 - 1) {
                    var61 = this.field8567 - 1;
                }
                int var62 = this.field8557 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field8536[var62++] = arg3;
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
                if (var28 < this.field8568) {
                    var28 = this.field8568;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field8567) {
                    var29 = this.field8567;
                }
                int var30 = this.field8557 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field8536[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field8536[var30++] = var15 + var33;
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
                if (var22 < this.field8568) {
                    var22 = this.field8568;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field8567 - 1) {
                    var23 = this.field8567 - 1;
                }
                int var24 = this.field8557 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field8536[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field8536[var24++] = var15 + var27;
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
                if (var47 < this.field8568) {
                    var47 = this.field8568;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field8567) {
                    var48 = this.field8567;
                }
                int var49 = this.field8557 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field8536[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field8536[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field8568) {
                    var39 = this.field8568;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field8567 - 1) {
                    var40 = this.field8567 - 1;
                }
                int var41 = this.field8557 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field8536[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field8536[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "da", descriptor = "(III[I)V", line = 609)
    public final void method485(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field8551.field10713 + (float) arg0 * this.field8551.field10716 + (float) arg1 * this.field8551.field10712 + this.field8551.field10727;
        if (!(var5 < (float) this.field8566) && !(var5 > (float) this.field8554)) {
            int var6 = (int) (((float) arg2 * this.field8551.field10714 + (float) arg0 * this.field8551.field10732 + (float) arg1 * this.field8551.field10729 + this.field8551.field10740) * (float) this.field8558 / var5);
            int var7 = (int) (((float) arg2 * this.field8551.field10725 + (float) arg0 * this.field8551.field10723 + (float) arg1 * this.field8551.field10733 + this.field8551.field10720) * (float) this.field8562 / var5);
            if (var6 >= this.field8550 && var6 <= this.field8571 && var7 >= this.field8546 && var7 <= this.field8538) {
                arg3[0] = var6 - this.field8550;
                arg3[1] = var7 - this.field8546;
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!pm", name = "F", descriptor = "(II)V", line = 634)
    public final void method450(int arg0, int arg1) {
        int var3 = this.field8557 * arg1 + arg0;
        int var4 = this.field8548 * arg1 + arg0;
        if (var3 != 0 || var4 != 0) {
            int[] var5 = this.field8536;
            float[] var6 = this.field8556;
            if (var3 < 0) {
                int var7 = var5.length + var3;
                class595.method3473(var5, -var3, var5, 0, var7);
            } else if (var3 > 0) {
                int var8 = var5.length - var3;
                class595.method3473(var5, 0, var5, var3, var8);
            }
            if (var4 < 0) {
                int var9 = var6.length + var4;
                class595.method3468(var6, -var4, var6, 0, var9);
            } else {
                if (var4 > 0) {
                    int var10 = var6.length - var4;
                    class595.method3468(var6, 0, var6, var4, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "()V", line = 676)
    public final void method447() {
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lkd;I)V", line = 680)
    public final void method541(class296 arg0, int arg1) {
        class685 var3 = this.method3536(Thread.currentThread());
        class745 var4 = arg0.field4304.field10683;
        for (class745 var5 = var4.field10320; var4 != var5; var5 = var5.field10320) {
            class354 var6 = (class354) var5;
            int var7 = var6.field4979 >> 12;
            int var8 = var6.field4976 >> 12;
            int var9 = var6.field4986 >> 12;
            float var10 = (float) var9 * this.field8551.field10713 + (float) var7 * this.field8551.field10716 + (float) var8 * this.field8551.field10712 + this.field8551.field10727;
            if (!(var10 < (float) this.field8566) && !(var10 > (float) var3.field9475)) {
                int var11 = (int) (((float) var9 * this.field8551.field10714 + (float) var7 * this.field8551.field10732 + (float) var8 * this.field8551.field10729 + this.field8551.field10740) * (float) this.field8558 / (float) arg1) + this.field8549;
                int var12 = (int) (((float) var9 * this.field8551.field10725 + (float) var7 * this.field8551.field10723 + (float) var8 * this.field8551.field10733 + this.field8551.field10720) * (float) this.field8562 / (float) arg1) + this.field8542;
                if (var11 >= this.field8568 && var11 <= this.field8567 && var12 >= this.field8543 && var12 <= this.field8539) {
                    if (var10 == 0.0F) {
                        var10 = 1.0F;
                    }
                    this.method3533(var6, var11, var12, (int) var10, (this.field8558 * var6.field4985 >> 12) / arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lqja;)V", line = 718)
    public final void method550(class326 arg0) {
        this.field8551 = (class781) arg0;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 721)
    public final void method498(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class736 {
        if (this.field8532 != null && this.field8528 != null) {
            try {
                Graphics var5 = this.field8532.getGraphics();
                for (int var6 = 0; var6 < arg1; ++var6) {
                    Rectangle var7 = arg0[var6];
                    if (var7.x + arg2 <= this.field8557 && var7.y + arg3 <= this.field8537 && var7.x + arg2 + var7.width > 0 && var7.y + arg3 + var7.height > 0) {
                        this.field8528.method223(var7.height, var7.y + arg3, var7.width, (byte) -32, var7.x, var5, var7.x + arg2, var7.y);
                    }
                }
            } catch (Exception var8) {
                this.field8532.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!pm", name = "v", descriptor = "()Z", line = 750)
    public final boolean method516() {
        return false;
    }

    @OriginalMember(owner = "client!pm", name = "xa", descriptor = "(F)V", line = 754)
    public final void method515(float arg0) {
        this.field8570 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!pm", name = "XA", descriptor = "()I", line = 757)
    public final int method513() {
        return this.field8554;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 760)
    public final void method537(Canvas arg0) {
        if (arg0 != null) {
            class22 var2 = (class22) this.field8527.method2242((long) arg0.hashCode(), -1);
            if (var2 != null) {
                this.field8532 = arg0;
                Dimension var3 = arg0.getSize();
                this.field8531 = var3.width;
                this.field8526 = var3.height;
                this.field8528 = var2;
                if (this.field8544 == null) {
                    this.field8536 = var2.field356;
                    this.field8557 = var2.field358;
                    this.field8537 = var2.field361;
                    if (this.field8557 != this.field8548 || this.field8540 != this.field8537) {
                        this.field8564 = this.field8548 = this.field8557;
                        this.field8547 = this.field8540 = this.field8537;
                        this.field8534 = this.field8556 = new float[this.field8548 * this.field8540];
                    }
                    this.method3541();
                    return;
                }
            }
        } else {
            this.field8532 = null;
            this.field8528 = null;
            if (this.field8544 == null) {
                this.field8536 = null;
                this.field8557 = this.field8537 = 1;
                this.field8548 = this.field8540 = 1;
                this.method3541();
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "I", descriptor = "()I", line = 807)
    public final int method476() {
        int var1 = this.field8560;
        this.field8560 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!pm", name = "EA", descriptor = "(IIII)V", line = 813)
    public final void method526(int arg0, int arg1, int arg2, int arg3) {
        class685 var5 = this.method3536(Thread.currentThread());
        var5.field9484 = arg0;
        var5.field9471 = arg1;
        var5.field9472 = arg2;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(Z)V", line = 821)
    public final void method554(boolean arg0) {
    }

    @OriginalMember(owner = "client!pm", name = "E", descriptor = "()I", line = 824)
    public final int method433() {
        return 0;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 830)
    public final void method522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        class685 var14 = this.method3536(Thread.currentThread());
        class482 var15 = var14.field9487;
        var15.field6770 = false;
        int var16 = arg0 - this.field8550;
        int var17 = arg3 - this.field8550;
        int var18 = arg6 - this.field8550;
        int var19 = arg1 - this.field8546;
        int var20 = arg4 - this.field8546;
        int var21 = arg7 - this.field8546;
        var15.field6772 = var16 < 0 || var16 > var15.field6780 || var17 < 0 || var17 > var15.field6780 || var18 < 0 || var18 > var15.field6780;
        int var22 = arg9 >>> 24;
        if (arg12 != 0 && (arg12 != 1 || var22 != 255)) {
            if (arg12 == 1) {
                var15.field6768 = 255 - var22;
                var15.field6771 = false;
                var15.method2879((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
            } else {
                if (arg12 != 2) {
                    throw new IllegalArgumentException();
                }
                var15.field6768 = 128;
                var15.field6771 = true;
                var15.method2879((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
            }
        } else {
            var15.field6768 = 0;
            var15.field6771 = false;
            var15.method2879((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
        }
        var15.field6770 = true;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "()Z", line = 871)
    public final boolean method432() {
        return false;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lza;)V", line = 873)
    public final void method501(class434 arg0) {
    }

    @OriginalMember(owner = "client!pm", name = "GA", descriptor = "(I)V", line = 876)
    public final void method509(int arg0) {
        this.method495(0, 0, this.field8557, this.field8537, arg0, 0);
    }

    @OriginalMember(owner = "client!pm", name = "y", descriptor = "()V", line = 878)
    public final void method546() {
    }

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "()Z", line = 881)
    public final boolean method455() {
        return true;
    }

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "(I)I", line = 884)
    public final int method3535(int arg0) {
        return super.field774.method1208((byte) 47, arg0).field6581;
    }

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "()Z", line = 889)
    public final boolean method483() {
        return false;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(II)Lkfa;", line = 892)
    public final class627 method481(int arg0, int arg1) {
        return this.method517(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!pm", name = "pa", descriptor = "()V", line = 897)
    public final void method489() {
        for (int var1 = 0; var1 < this.field8559.length; ++var1) {
            this.field8559[var1].field9471 = this.field8559[var1].field9470;
            this.field8559[var1].field9482 = false;
        }
    }

    @OriginalMember(owner = "client!pm", name = "t", descriptor = "()V", line = 906)
    public final void method506() {
    }

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "(IIIIII)Lqaa;", line = 910)
    public final class29 method521(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!pm", name = "x", descriptor = "()I", line = 913)
    public final int method535() {
        return 0;
    }

    @OriginalMember(owner = "client!pm", name = "Q", descriptor = "(IIIIII[BII)V", line = 916)
    public final void method438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field8557 * arg1 + arg0;
            int var15 = this.field8557 - arg2;
            if (arg1 + arg3 > this.field8539) {
                arg3 -= arg1 + arg3 - this.field8539;
            }
            if (arg1 < this.field8543) {
                int var16 = this.field8543 - arg1;
                arg3 -= var16;
                var14 += this.field8557 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field8567) {
                int var17 = arg0 + arg2 - this.field8567;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field8568) {
                int var18 = this.field8568 - arg0;
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
                            int var28 = this.field8536[var14];
                            this.field8536[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field8536[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field8536[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field8536[var14++] = arg5;
                        } else {
                            this.field8536[var14++] = arg4;
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

    @OriginalMember(owner = "client!pm", name = "U", descriptor = "(IIIII)V", line = 1091)
    public final void method529(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field8543 && arg1 < this.field8539) {
            if (arg0 < this.field8568) {
                arg2 -= this.field8568 - arg0;
                arg0 = this.field8568;
            }
            if (arg0 + arg2 > this.field8567) {
                arg2 = this.field8567 - arg0;
            }
            int var6 = this.field8557 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field8536[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field8536[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field8536[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field8536[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field8536[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "()Z", line = 1163)
    public final boolean method477() {
        return true;
    }

    @OriginalMember(owner = "client!pm", name = "Y", descriptor = "()[I", line = 1166)
    public final int[] method510() {
        return new int[] { this.field8549, this.field8542, this.field8558, this.field8562 };
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(IIIIII)V", line = 1169)
    public final void method520(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method529(arg0, arg1, arg2, arg4, arg5);
        this.method529(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method478(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method478(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I[Lqm;)V", line = 1174)
    public final void method461(int arg0, class154[] arg1) {
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/lang/Runnable;)Ldv;", line = 1179)
    public final class685 method3536(Runnable arg0) {
        for (int var2 = 0; var2 < this.field8569; ++var2) {
            if (this.field8559[var2].field9473 == arg0) {
                return this.field8559[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIIIII)V", line = 1191)
    private final void method3537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 >= this.field8543 && arg1 < this.field8539) {
            int var9 = this.field8557 * arg1 + arg0;
            int var10 = arg3 >>> 24;
            int var11 = arg5 + arg6;
            int var12 = arg7 % var11;
            if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
                if (arg4 == 1) {
                    int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
                    int var14 = 256 - var10;
                    int var15 = 0;
                    while (var15 < arg2) {
                        if (arg0 + var15 >= this.field8568 && arg0 + var15 < this.field8567 && var12 < arg5) {
                            int var16 = this.field8536[var9 + var15];
                            int var17 = ((var16 & 16711935) * var14 >> 8 & 16711935) + ((var16 & 65280) * var14 >> 8 & 65280);
                            this.field8536[var9 + var15] = var13 + var17;
                        }
                        ++var15;
                        ++var12;
                        var12 %= var11;
                    }
                } else if (arg4 == 2) {
                    int var18 = 0;
                    while (var18 < arg2) {
                        if (arg0 + var18 >= this.field8568 && arg0 + var18 < this.field8567 && var12 < arg5) {
                            int var19 = this.field8536[var9 + var18];
                            int var20 = arg3 + var19;
                            int var21 = (arg3 & 16711935) + (var19 & 16711935);
                            int var22 = (var20 - var21 & 65536) + (var21 & 16777472);
                            this.field8536[var9 + var18] = var20 - var22 | var22 - (var22 >>> 8);
                        }
                        ++var18;
                        ++var12;
                        var12 %= var11;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                int var23 = 0;
                while (var23 < arg2) {
                    if (arg0 + var23 >= this.field8568 && arg0 + var23 < this.field8567 && var12 < arg5) {
                        this.field8536[var9 + var23] = arg3;
                    }
                    ++var23;
                    ++var12;
                    var12 %= var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lkfa;Lts;)Lpt;", line = 1271)
    public final class555 method443(class627 arg0, class560 arg1) {
        return new class227(this, (class241) arg0, (class515) arg1);
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Ld;)V", line = 1274)
    private class609(class160 arg0) {
        super(arg0);
        this.field8529 = false;
        this.field8525 = false;
        this.field8527 = new class353(4);
        this.field8533 = 0;
        this.field8545 = 45823;
        this.field8543 = 0;
        this.field8554 = 3500;
        this.field8560 = 0;
        this.field8562 = 512;
        this.field8563 = 128;
        this.field8535 = false;
        this.field8561 = 78642;
        this.field8558 = 512;
        this.field8539 = 0;
        this.field8566 = 50;
        this.field8567 = 0;
        this.field8568 = 0;
        this.field8570 = 75518;
        this.field8565 = new class652(16);
        this.field8572 = -1;
        try {
            this.field8541 = new class652(256);
            this.field8551 = new class781();
            this.method497(1);
            this.method519(0);
            class486.method2895(true, true, (byte) 121);
            this.field8529 = true;
            this.field8530 = (int) class459.method2731(113);
        } catch (Throwable var3) {
            var3.printStackTrace();
            this.method533(59);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(FFF)V", line = 1289)
    public final void method499(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ldba;IIII)Lka;", line = 1292)
    public final class496 method480(class100 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class201(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "(II)I", line = 1296)
    public final int method542(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lie;[Lus;Z)Lda;", line = 1300)
    public final class66 method437(class6 arg0, class1[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field4;
            var5[var7] = arg1[var7].field7;
            if (arg1[var7].field2 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                return new class608(this, arg0, arg1, var4, var5);
            } else {
                return new class638(this, arg0, arg1, var4, var5);
            }
        } else if (var6) {
            throw new IllegalArgumentException("");
        } else {
            return new class146(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "(I)V", line = 1338)
    public final void method525(int arg0) {
        this.field8563 = arg0;
        this.field8541.method3735(2);
    }

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "(II)Lts;", line = 1342)
    public final class560 method532(int arg0, int arg1) {
        return new class515(arg0, arg1);
    }

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "(IIIIII)V", line = 1345)
    private final void method3538(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 0) {
            arg3 = -arg3;
        }
        int var7 = arg1 - arg3;
        if (var7 < this.field8543) {
            var7 = this.field8543;
        }
        int var8 = arg1 + arg3 + 1;
        if (var8 > this.field8539) {
            var8 = this.field8539;
        }
        int var9 = var7;
        int var10 = arg3 * arg3;
        int var11 = 0;
        int var12 = arg1 - var7;
        int var13 = var12 * var12;
        int var14 = var13 - var12;
        if (arg1 > var8) {
            arg1 = var8;
        }
        int var15 = arg4 >>> 24;
        if (arg5 == 0 || arg5 == 1 && var15 == 255) {
            while (var9 < arg1) {
                while (var14 <= var10 || var13 <= var10) {
                    var13 += var11 + var11;
                    var14 += var11++ + var11;
                }
                int var65 = arg0 - var11 + 1;
                if (var65 < this.field8568) {
                    var65 = this.field8568;
                }
                int var66 = arg0 + var11;
                if (var66 > this.field8567) {
                    var66 = this.field8567;
                }
                int var67 = this.field8557 * var9 + var65;
                for (int var68 = var65; var68 < var66; ++var68) {
                    if ((float) arg2 < this.field8556[var67]) {
                        this.field8536[var67] = arg4;
                    }
                    ++var67;
                }
                ++var9;
                var13 -= var12-- + var12;
                var14 -= var12 + var12;
            }
            int var56 = arg3;
            int var57 = var9 - arg1;
            int var58 = var57 * var57 + var10;
            int var59 = var58 - arg3;
            int var60 = var58 - var57;
            while (var9 < var8) {
                while (var60 > var10 && var59 > var10) {
                    var60 -= var56-- + var56;
                    var59 -= var56 + var56;
                }
                int var61 = arg0 - var56;
                if (var61 < this.field8568) {
                    var61 = this.field8568;
                }
                int var62 = arg0 + var56;
                if (var62 > this.field8567 - 1) {
                    var62 = this.field8567 - 1;
                }
                int var63 = this.field8557 * var9 + var61;
                for (int var64 = var61; var64 <= var62; ++var64) {
                    if ((float) arg2 < this.field8556[var63]) {
                        this.field8536[var63] = arg4;
                    }
                    ++var63;
                }
                ++var9;
                var60 += var57 + var57;
                var59 += var57++ + var57;
            }
        } else if (arg5 == 1) {
            int var16 = (var15 << 24) + ((arg4 & 16711935) * var15 >> 8 & 16711935) + ((arg4 & 65280) * var15 >> 8 & 65280);
            int var17 = 256 - var15;
            while (var9 < arg1) {
                while (var14 <= var10 || var13 <= var10) {
                    var13 += var11 + var11;
                    var14 += var11++ + var11;
                }
                int var29 = arg0 - var11 + 1;
                if (var29 < this.field8568) {
                    var29 = this.field8568;
                }
                int var30 = arg0 + var11;
                if (var30 > this.field8567) {
                    var30 = this.field8567;
                }
                int var31 = this.field8557 * var9 + var29;
                for (int var32 = var29; var32 < var30; ++var32) {
                    if ((float) arg2 < this.field8556[var31]) {
                        int var33 = this.field8536[var31];
                        int var34 = ((var33 & 16711935) * var17 >> 8 & 16711935) + ((var33 & 65280) * var17 >> 8 & 65280);
                        this.field8536[var31] = var16 + var34;
                    }
                    ++var31;
                }
                ++var9;
                var13 -= var12-- + var12;
                var14 -= var12 + var12;
            }
            int var18 = arg3;
            int var19 = -var12;
            int var20 = var19 * var19 + var10;
            int var21 = var20 - arg3;
            int var22 = var20 - var19;
            while (var9 < var8) {
                while (var22 > var10 && var21 > var10) {
                    var22 -= var18-- + var18;
                    var21 -= var18 + var18;
                }
                int var23 = arg0 - var18;
                if (var23 < this.field8568) {
                    var23 = this.field8568;
                }
                int var24 = arg0 + var18;
                if (var24 > this.field8567 - 1) {
                    var24 = this.field8567 - 1;
                }
                int var25 = this.field8557 * var9 + var23;
                for (int var26 = var23; var26 <= var24; ++var26) {
                    if ((float) arg2 < this.field8556[var25]) {
                        int var27 = this.field8536[var25];
                        int var28 = ((var27 & 16711935) * var17 >> 8 & 16711935) + ((var27 & 65280) * var17 >> 8 & 65280);
                        this.field8536[var25] = var16 + var28;
                    }
                    ++var25;
                }
                ++var9;
                var22 += var19 + var19;
                var21 += var19++ + var19;
            }
        } else if (arg5 != 2) {
            throw new IllegalArgumentException();
        } else {
            while (var9 < arg1) {
                while (var14 <= var10 || var13 <= var10) {
                    var13 += var11 + var11;
                    var14 += var11++ + var11;
                }
                int var48 = arg0 - var11 + 1;
                if (var48 < this.field8568) {
                    var48 = this.field8568;
                }
                int var49 = arg0 + var11;
                if (var49 > this.field8567) {
                    var49 = this.field8567;
                }
                int var50 = this.field8557 * var9 + var48;
                for (int var51 = var48; var51 < var49; ++var51) {
                    if ((float) arg2 < this.field8556[var50]) {
                        int var52 = this.field8536[var50];
                        int var53 = arg4 + var52;
                        int var54 = (arg4 & 16711935) + (var52 & 16711935);
                        int var55 = (var53 - var54 & 65536) + (var54 & 16777472);
                        this.field8536[var50] = var53 - var55 | var55 - (var55 >>> 8);
                    }
                    ++var50;
                }
                ++var9;
                var13 -= var12-- + var12;
                var14 -= var12 + var12;
            }
            int var35 = arg3;
            int var36 = -var12;
            int var37 = var36 * var36 + var10;
            int var38 = var37 - arg3;
            int var39 = var37 - var36;
            while (var9 < var8) {
                while (var39 > var10 && var38 > var10) {
                    var39 -= var35-- + var35;
                    var38 -= var35 + var35;
                }
                int var40 = arg0 - var35;
                if (var40 < this.field8568) {
                    var40 = this.field8568;
                }
                int var41 = arg0 + var35;
                if (var41 > this.field8567 - 1) {
                    var41 = this.field8567 - 1;
                }
                int var42 = this.field8557 * var9 + var40;
                for (int var43 = var40; var43 <= var41; ++var43) {
                    if ((float) arg2 < this.field8556[var42]) {
                        int var44 = this.field8536[var42];
                        int var45 = arg4 + var44;
                        int var46 = (arg4 & 16711935) + (var44 & 16711935);
                        int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                        this.field8536[var42] = var45 - var47 | var47 - (var47 >>> 8);
                    }
                    ++var42;
                }
                ++var9;
                var39 += var36 + var36;
                var38 += var36++ + var36;
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "()Z", line = 1661)
    public final boolean method462() {
        return false;
    }

    @OriginalMember(owner = "client!pm", name = "u", descriptor = "()Lqja;", line = 1665)
    public final class326 method514() {
        class685 var1 = this.method3536(Thread.currentThread());
        return var1.field9468;
    }

    @OriginalMember(owner = "client!pm", name = "w", descriptor = "()Z", line = 1669)
    public final boolean method534() {
        return false;
    }

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "()Z", line = 1672)
    public final boolean method452() {
        return false;
    }

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "(I)V", line = 1675)
    public final void method519(int arg0) {
        this.field8559[arg0].method3862(10, Thread.currentThread());
    }

    @OriginalMember(owner = "client!pm", name = "H", descriptor = "(III[I)V", line = 1679)
    public final void method474(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field8551.field10713 + (float) arg0 * this.field8551.field10716 + (float) arg1 * this.field8551.field10712 + this.field8551.field10727;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field8551.field10714 + (float) arg0 * this.field8551.field10732 + (float) arg1 * this.field8551.field10729 + this.field8551.field10740) * (float) this.field8558 / var5);
            int var7 = (int) (((float) arg2 * this.field8551.field10725 + (float) arg0 * this.field8551.field10723 + (float) arg1 * this.field8551.field10733 + this.field8551.field10720) * (float) this.field8562 / var5);
            arg3[0] = var6 - this.field8550;
            arg3[1] = var7 - this.field8546;
            arg3[2] = (int) var5;
        }
    }

    @OriginalMember(owner = "client!pm", name = "KA", descriptor = "(IIII)V", line = 1695)
    public final void method434(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field8557) {
            arg2 = this.field8557;
        }
        if (arg3 > this.field8537) {
            arg3 = this.field8537;
        }
        this.field8568 = arg0;
        this.field8567 = arg2;
        this.field8543 = arg1;
        this.field8539 = arg3;
        this.method3544();
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 1715)
    public final void method507(Canvas arg0, int arg1, int arg2) {
        class22 var4 = (class22) this.field8527.method2242((long) arg0.hashCode(), -1);
        if (var4 == null) {
            class22 var5 = class611.method3553(arg2, arg0, arg1, -8344);
            this.field8527.method2241(-112, (long) arg0.hashCode(), var5);
        } else {
            if (var4.field358 != arg1 || var4.field361 != arg2) {
                this.method475(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIZ)Ljd;", line = 1729)
    public final class241 method479(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field8557 * arg1 + arg0;
        int var8 = this.field8557 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field8536[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class501(this, var6, arg2, arg3);
        } else {
            return new class52(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!pm", name = "HA", descriptor = "(IIII[I)V", line = 1762)
    public final void method435(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        float var6 = (float) arg2 * this.field8551.field10713 + (float) arg0 * this.field8551.field10716 + (float) arg1 * this.field8551.field10712 + this.field8551.field10727;
        if (!(var6 < (float) this.field8566) && !(var6 > (float) this.field8554)) {
            int var7 = (int) (((float) arg2 * this.field8551.field10714 + (float) arg0 * this.field8551.field10732 + (float) arg1 * this.field8551.field10729 + this.field8551.field10740) * (float) this.field8558 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field8551.field10725 + (float) arg0 * this.field8551.field10723 + (float) arg1 * this.field8551.field10733 + this.field8551.field10720) * (float) this.field8562 / (float) arg3);
            if (var7 >= this.field8550 && var7 <= this.field8571 && var8 >= this.field8546 && var8 <= this.field8538) {
                arg4[0] = var7 - this.field8550;
                arg4[1] = var8 - this.field8546;
                arg4[2] = (int) var6;
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "([IIIIIZ)Ljd;", line = 1787)
    public final class241 method536(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        boolean var7 = false;
        int var8 = arg1;
        for (int var9 = 0; var9 < arg4; ++var9) {
            for (int var10 = 0; var10 < arg3; ++var10) {
                int var11 = arg0[var8++] >>> 24;
                if (var11 != 0 && var11 != 255) {
                    var7 = true;
                    return var7 ? new class501(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class52(this, arg0, arg1, arg2, arg3, arg4, arg5);
                }
            }
        }
        return var7 ? new class501(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class52(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIIIIIII)V", line = 1823)
    public final void method3539(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 0 && arg4 != 0) {
            if (arg6 != 65535 && !super.field774.method1208((byte) 47, arg6).field6570) {
                if (this.field8572 != arg6) {
                    class241 var11 = (class241) this.field8565.method3742((byte) 67, (long) arg6);
                    if (var11 == null) {
                        int[] var12 = this.method3542(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = this.method3545(arg6) ? 64 : this.field8563;
                        var11 = this.method458((byte) 109, var13, var13, var12, var13, 0);
                        this.field8565.method3739((long) arg6, (byte) 43, var11);
                    }
                    this.field8572 = arg6;
                    this.field8573 = var11;
                }
                ((class412) this.field8573).method363(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
            } else {
                this.method3538(arg0, arg1, arg2, arg3, arg7, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "s", descriptor = "()Lqja;", line = 1857)
    public final class326 method505() {
        return new class781();
    }

    @OriginalMember(owner = "client!pm", name = "DA", descriptor = "(IIII)V", line = 1860)
    public final void method503(int arg0, int arg1, int arg2, int arg3) {
        this.field8549 = arg0;
        this.field8542 = arg1;
        this.field8558 = arg2;
        this.field8562 = arg3;
        this.method3544();
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lus;Z)Ljd;", line = 1868)
    public final class241 method551(class1 arg0, boolean arg1) {
        int[] var3 = arg0.field6;
        byte[] var4 = arg0.field3;
        int var5 = arg0.field4;
        int var6 = arg0.field7;
        class412 var11;
        if (arg1 && arg0.field2 == null) {
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
            var11 = new class755(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field2;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class501(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var20 = var5 * var19;
                    for (int var21 = 0; var21 < var5; ++var21) {
                        int var22 = var3[var4[var20 + var21] & 255];
                        var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
                    }
                }
                var11 = new class52(this, var14, var5, var6);
            }
        }
        var11.method1506(arg0.field1, arg0.field5, arg0.field8, arg0.field9);
        return var11;
    }

    @OriginalMember(owner = "client!pm", name = "JA", descriptor = "(IIIIII)I", line = 1972)
    public final int method531(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = 0;
        float var8 = (float) arg2 * this.field8551.field10713 + (float) arg0 * this.field8551.field10716 + (float) arg1 * this.field8551.field10712 + this.field8551.field10727;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field8551.field10713 + (float) arg3 * this.field8551.field10716 + (float) arg4 * this.field8551.field10712 + this.field8551.field10727;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if (var8 < (float) this.field8566 && var9 < (float) this.field8566) {
            var7 |= 16;
        } else if (var8 > (float) this.field8554 && var9 > (float) this.field8554) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field8551.field10714 + (float) arg0 * this.field8551.field10732 + (float) arg1 * this.field8551.field10729 + this.field8551.field10740) * (float) this.field8558 / var8);
        int var11 = (int) (((float) arg5 * this.field8551.field10714 + (float) arg3 * this.field8551.field10732 + (float) arg4 * this.field8551.field10729 + this.field8551.field10740) * (float) this.field8558 / var9);
        if (var10 < this.field8550 && var11 < this.field8550) {
            var7 |= 1;
        } else if (var10 > this.field8571 && var11 > this.field8571) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field8551.field10725 + (float) arg0 * this.field8551.field10723 + (float) arg1 * this.field8551.field10733 + this.field8551.field10720) * (float) this.field8562 / var8);
        int var13 = (int) (((float) arg5 * this.field8551.field10725 + (float) arg3 * this.field8551.field10723 + (float) arg4 * this.field8551.field10733 + this.field8551.field10720) * (float) this.field8562 / var9);
        if (var12 < this.field8546 && var13 < this.field8546) {
            var7 |= 4;
        } else if (var12 > this.field8538 && var13 > this.field8538) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lkd;)V", line = 2016)
    public final void method504(class296 arg0) {
        class685 var2 = this.method3536(Thread.currentThread());
        class745 var3 = arg0.field4304.field10683;
        for (class745 var4 = var3.field10320; var3 != var4; var4 = var4.field10320) {
            class354 var5 = (class354) var4;
            int var6 = var5.field4979 >> 12;
            int var7 = var5.field4976 >> 12;
            int var8 = var5.field4986 >> 12;
            float var9 = (float) var8 * this.field8551.field10713 + (float) var6 * this.field8551.field10716 + (float) var7 * this.field8551.field10712 + this.field8551.field10727;
            if (!(var9 < (float) this.field8566) && !(var9 > (float) var2.field9475)) {
                int var10 = (int) (((float) var8 * this.field8551.field10714 + (float) var6 * this.field8551.field10732 + (float) var7 * this.field8551.field10729 + this.field8551.field10740) * (float) this.field8558 / var9) + this.field8549;
                int var11 = (int) (((float) var8 * this.field8551.field10725 + (float) var6 * this.field8551.field10723 + (float) var7 * this.field8551.field10733 + this.field8551.field10720) * (float) this.field8562 / var9) + this.field8542;
                if (var10 >= this.field8568 && var10 <= this.field8567 && var11 >= this.field8543 && var11 <= this.field8539) {
                    if (var9 == 0.0F) {
                        var9 = 1.0F;
                    }
                    this.method3533(var5, var10, var11, (int) var9, (int) ((float) (this.field8558 * var5.field4985 >> 12) / var9));
                }
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V", line = 2054)
    public class609(Canvas arg0, class160 arg1, int arg2, int arg3) {
        this(arg1);
        try {
            this.method507(arg0, arg2, arg3);
            this.method537(arg0);
        } catch (Throwable var6) {
            var6.printStackTrace();
            this.method533(117);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!pm", name = "C", descriptor = "(Z)V", line = 2066)
    public final void method544(boolean arg0) {
        class685 var2 = this.method3536(Thread.currentThread());
        var2.field9477 = arg0;
    }

    @OriginalMember(owner = "client!pm", name = "L", descriptor = "(III)V", line = 2072)
    public final void method502(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field8559.length; ++var4) {
            class685 var5 = this.field8559[var4];
            var5.field9471 = arg0 & 16777215;
            int var6 = var5.field9471 >>> 16 & 255;
            if (var6 < 2) {
                var6 = 2;
            }
            int var7 = var5.field9471 >> 8 & 255;
            if (var7 < 2) {
                var7 = 2;
            }
            int var8 = var5.field9471 & 255;
            if (var8 < 2) {
                var8 = 2;
            }
            var5.field9471 = var6 << 16 | var7 << 8 | var8;
            if (arg1 < 0) {
                var5.field9469 = false;
            } else {
                var5.field9469 = true;
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "()V", line = 2104)
    public final void method484() {
        if (this.field8529) {
            class467.method2791(false, true, (byte) -127);
            this.field8529 = false;
        }
        this.field8528 = null;
        this.field8532 = null;
        this.field8531 = 0;
        this.field8526 = 0;
        this.field8527 = null;
        this.field8525 = true;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V", line = 2119)
    public final void method454(int arg0) {
        int var2 = arg0 - this.field8530;
        for (Object var3 = this.field8541.method3740((byte) 98); var3 != null; var3 = this.field8541.method3738(97)) {
            class420 var4 = (class420) var3;
            if (var4.field5736) {
                var4.field5737 += var2;
                int var5 = var4.field5737 / 20;
                if (var5 > 0) {
                    class467 var6 = super.field774.method1208((byte) 47, var4.field5739);
                    var4.method2543(var6.field6577 * var2 * 50 / 1000, var6.field6569 * var2 * 50 / 1000);
                    var4.field5737 -= var5 * 20;
                }
                var4.field5736 = false;
            }
        }
        this.field8530 = arg0;
        this.field8565.method3741(5, 0);
        this.field8541.method3741(5, 0);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 2152)
    public final void method475(Canvas arg0, int arg1, int arg2) {
        class22 var4 = (class22) this.field8527.method2242((long) arg0.hashCode(), -1);
        if (var4 != null) {
            var4.method3387((byte) -41);
            class22 var5 = class611.method3553(arg2, arg0, arg1, -8344);
            this.field8527.method2241(-59, (long) arg0.hashCode(), var5);
            if (this.field8532 == arg0 && this.field8544 == null) {
                Dimension var6 = arg0.getSize();
                this.field8531 = var6.width;
                this.field8526 = var6.height;
                this.field8528 = var5;
                this.field8536 = var5.field356;
                this.field8557 = var5.field358;
                this.field8537 = var5.field361;
                if (this.field8557 != this.field8548 || this.field8540 != this.field8537) {
                    this.field8564 = this.field8548 = this.field8557;
                    this.field8547 = this.field8540 = this.field8537;
                    this.field8534 = this.field8556 = new float[this.field8548 * this.field8540];
                }
                this.method3541();
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II[I[I)Laa;", line = 2182)
    public final class511 method552(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class386(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "([I)V", line = 2185)
    public final void method549(int[] arg0) {
        arg0[0] = this.field8557;
        arg0[1] = this.field8537;
    }

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "()I", line = 2189)
    public final int method457() {
        return this.field8566;
    }

    @OriginalMember(owner = "client!pm", name = "ra", descriptor = "(IIII)V", line = 2194)
    public final void method442(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field8559.length; ++var5) {
            this.field8559[var5].field9470 = this.field8559[var5].field9471;
            this.field8559[var5].field9484 = arg0;
            this.field8559[var5].field9471 = arg1;
            this.field8559[var5].field9472 = arg2;
            this.field8559[var5].field9482 = true;
        }
    }

    @OriginalMember(owner = "client!pm", name = "P", descriptor = "(IIIII)V", line = 2207)
    public final void method478(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field8568 && arg0 < this.field8567) {
            if (arg1 < this.field8543) {
                arg2 -= this.field8543 - arg1;
                arg1 = this.field8543;
            }
            if (arg1 + arg2 > this.field8539) {
                arg2 = this.field8539 - arg1;
            }
            int var6 = this.field8557 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field8557 * var10 + var6;
                        int var12 = this.field8536[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field8536[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field8557 * var14 + var6;
                        int var16 = this.field8536[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field8536[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field8536[this.field8557 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lpt;)V", line = 2284)
    public final void method528(class555 arg0) {
        class227 var2 = (class227) arg0;
        this.field8557 = var2.field3491;
        this.field8537 = var2.field3490;
        this.field8536 = var2.field3487;
        this.field8544 = var2;
        this.field8548 = var2.field3491;
        this.field8540 = var2.field3490;
        this.field8556 = var2.field3488;
        this.method3541();
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(IIIIII)V", line = 2295)
    public final void method487(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method529(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method529(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method478(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method478(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field8568) {
                    var10 += (this.field8568 - arg0) * var12;
                    arg0 = this.field8568;
                }
                if (var13 >= this.field8567) {
                    var13 = this.field8567 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field8543 && var17 < this.field8539) {
                                int var18 = this.field8557 * var17 + arg0;
                                int var19 = this.field8536[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field8536[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field8543 && var21 < this.field8539) {
                                int var22 = this.field8557 * var21 + arg0;
                                int var23 = this.field8536[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field8536[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field8543 && var27 < this.field8539) {
                            this.field8536[this.field8557 * var27 + arg0] = arg4;
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
                if (arg1 < this.field8543) {
                    var29 += (this.field8543 - arg1) * var31;
                    arg1 = this.field8543;
                }
                if (var32 >= this.field8539) {
                    var32 = this.field8539 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field8568 && var46 < this.field8567) {
                            this.field8536[this.field8557 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field8568 && var36 < this.field8567) {
                            int var37 = this.field8557 * arg1 + var36;
                            int var38 = this.field8536[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field8536[this.field8557 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field8568 && var40 < this.field8567) {
                            int var41 = this.field8557 * arg1 + var40;
                            int var42 = this.field8536[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field8536[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "()Z", line = 2509)
    public final boolean method441() {
        return true;
    }

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "(I)I", line = 2513)
    public final int method3540(int arg0) {
        return super.field774.method1208((byte) 47, arg0).field6571 & 65535;
    }

    @OriginalMember(owner = "client!pm", name = "na", descriptor = "(IIII)[I", line = 2518)
    public final int[] method467(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field8557 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field8536[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!pm", name = "ya", descriptor = "()V", line = 2543)
    public final void method518() {
        if (this.field8568 == 0 && this.field8567 == this.field8557 && this.field8543 == 0 && this.field8539 == this.field8537) {
            int var1 = this.field8556.length;
            int var2 = var1 - (var1 & 7);
            int var3 = 0;
            while (var3 < var2) {
                this.field8556[var3++] = 2.1474836E9F;
                this.field8556[var3++] = 2.1474836E9F;
                this.field8556[var3++] = 2.1474836E9F;
                this.field8556[var3++] = 2.1474836E9F;
                this.field8556[var3++] = 2.1474836E9F;
                this.field8556[var3++] = 2.1474836E9F;
                this.field8556[var3++] = 2.1474836E9F;
                this.field8556[var3++] = 2.1474836E9F;
            }
            while (var3 < var1) {
                this.field8556[var3++] = 2.1474836E9F;
            }
        } else {
            int var4 = this.field8567 - this.field8568;
            int var5 = this.field8539 - this.field8543;
            int var6 = this.field8557 - var4;
            int var7 = this.field8557 * this.field8543 + this.field8568;
            int var8 = var4 >> 3;
            int var9 = var4 & 7;
            int var10 = var7 - 1;
            for (int var11 = -var5; var11 < 0; ++var11) {
                if (var8 > 0) {
                    int var12 = var8;
                    do {
                        ++var10;
                        this.field8556[var10] = 2.1474836E9F;
                        ++var10;
                        this.field8556[var10] = 2.1474836E9F;
                        ++var10;
                        this.field8556[var10] = 2.1474836E9F;
                        ++var10;
                        this.field8556[var10] = 2.1474836E9F;
                        ++var10;
                        this.field8556[var10] = 2.1474836E9F;
                        ++var10;
                        this.field8556[var10] = 2.1474836E9F;
                        ++var10;
                        this.field8556[var10] = 2.1474836E9F;
                        ++var10;
                        this.field8556[var10] = 2.1474836E9F;
                        --var12;
                    } while (var12 > 0);
                }
                if (var9 > 0) {
                    int var13 = var9;
                    do {
                        ++var10;
                        this.field8556[var10] = 2.1474836E9F;
                        --var13;
                    } while (var13 > 0);
                }
                var10 += var6;
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "B", descriptor = "()V", line = 2625)
    private final void method3541() {
        for (int var1 = 0; var1 < this.field8569; ++var1) {
            this.field8559[var1].method3861((byte) 20);
        }
        this.method511();
    }

    @OriginalMember(owner = "client!pm", name = "r", descriptor = "(IIIIIII)I", line = 2634)
    public final int method491(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        float var8 = (float) arg2 * this.field8551.field10713 + (float) arg0 * this.field8551.field10716 + (float) arg1 * this.field8551.field10712 + this.field8551.field10727;
        float var9 = (float) arg5 * this.field8551.field10713 + (float) arg3 * this.field8551.field10716 + (float) arg4 * this.field8551.field10712 + this.field8551.field10727;
        int var10 = 0;
        if (var8 < (float) this.field8566 && var9 < (float) this.field8566) {
            var10 |= 16;
        } else if (var8 > (float) this.field8554 && var9 > (float) this.field8554) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field8551.field10714 + (float) arg0 * this.field8551.field10732 + (float) arg1 * this.field8551.field10729 + this.field8551.field10740) * (float) this.field8558 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field8551.field10714 + (float) arg3 * this.field8551.field10732 + (float) arg4 * this.field8551.field10729 + this.field8551.field10740) * (float) this.field8558 / (float) arg6);
        if (var11 < this.field8550 && var12 < this.field8550) {
            var10 |= 1;
        } else if (var11 > this.field8571 && var12 > this.field8571) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field8551.field10725 + (float) arg0 * this.field8551.field10723 + (float) arg1 * this.field8551.field10733 + this.field8551.field10720) * (float) this.field8562 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field8551.field10725 + (float) arg3 * this.field8551.field10723 + (float) arg4 * this.field8551.field10733 + this.field8551.field10720) * (float) this.field8562 / (float) arg6);
        if (var13 < this.field8546 && var14 < this.field8546) {
            var10 |= 4;
        } else if (var13 > this.field8538 && var14 > this.field8538) {
            var10 |= 8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIIII)V", line = 2672)
    public final void method466(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class685 var8 = this.method3536(Thread.currentThread());
        class482 var9 = var8.field9487;
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
            int var17 = (var15 >> 16) + var10;
            int var18 = (var16 >> 16) + var11;
            if (var16 <= var15) {
                var15 = -var15;
            } else {
                var16 = -var16;
            }
            int var19 = arg5 * var16 >> 17;
            int var20 = arg5 * var16 + 1 >> 17;
            int var21 = arg5 * var15 >> 17;
            int var22 = arg5 * var15 + 1 >> 17;
            int var23 = arg0 - var9.method2878();
            int var24 = arg1 - var9.method2865();
            int var25 = var19 + var23;
            int var26 = var23 - var20;
            int var27 = var17 + var23 - var20;
            int var28 = var17 + var23 + var19;
            int var29 = var21 + var24;
            int var30 = var24 - var22;
            int var31 = var18 + var24 - var22;
            int var32 = var18 + var24 + var21;
            if (arg6 == 0) {
                var9.field6768 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field6768 = 255 - (arg4 >>> 24);
            }
            this.method544(false);
            var9.field6772 = var25 < 0 || var25 > var9.field6780 || var26 < 0 || var26 > var9.field6780 || var27 < 0 || var27 > var9.field6780;
            var9.method2871((float) var29, (float) var30, (float) var31, (float) var25, (float) var26, (float) var27, 100.0F, 100.0F, 100.0F, arg4);
            var9.field6772 = var25 < 0 || var25 > var9.field6780 || var27 < 0 || var27 > var9.field6780 || var28 < 0 || var28 > var9.field6780;
            var9.method2871((float) var29, (float) var31, (float) var32, (float) var25, (float) var27, (float) var28, 100.0F, 100.0F, 100.0F, arg4);
            this.method544(true);
        }
    }

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "(I)[I", line = 2747)
    public final int[] method3542(int arg0) {
        class652 var2 = this.field8541;
        class420 var3;
        synchronized (this.field8541) {
            var3 = (class420) this.field8541.method3742((byte) 67, (long) arg0 | Long.MIN_VALUE);
            if (var3 == null) {
                if (!super.field774.method1212(117, arg0)) {
                    return null;
                }
                class467 var5 = super.field774.method1208((byte) 47, arg0);
                int var6 = !var5.field6574 && !this.field8535 ? this.field8563 : 64;
                var3 = new class420(arg0, var6, super.field774.method1207((byte) -14, true, arg0, var6, var6, 0.7F), var5.field6581 != 1);
                this.field8541.method3739((long) arg0 | Long.MIN_VALUE, (byte) 91, var3);
            }
        }
        var3.field5736 = true;
        return var3.method2542();
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)V", line = 2767)
    public final void method471(int arg0) {
        this.field8559[arg0].method3862(10, (Runnable) null);
    }

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "()V", line = 2770)
    public final void method486() {
        this.field8541.method3735(2);
        this.field8565.method3735(2);
    }

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "()V", line = 2774)
    public final void method468() {
        if (this.field8532 != null) {
            this.field8536 = this.field8528.field356;
            this.field8557 = this.field8528.field358;
            this.field8537 = this.field8528.field361;
            this.field8556 = this.field8534;
            this.field8548 = this.field8564;
            this.field8540 = this.field8547;
        } else {
            this.field8557 = 1;
            this.field8537 = 1;
            this.field8536 = null;
            this.field8548 = 1;
            this.field8540 = 1;
            this.field8556 = null;
        }
        this.field8544 = null;
        this.method3541();
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIZ)Ljd;", line = 2797)
    public final class241 method517(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class501(this, arg0, arg1) : new class52(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 2803)
    public final class294 method488(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class332(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "(II)V", line = 2807)
    public final void method530(int arg0, int arg1) {
        class685 var3 = this.method3536(Thread.currentThread());
        this.field8566 = arg0;
        this.field8554 = arg1;
        var3.field9475 = this.field8554 - 255;
    }

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "(I)[I", line = 2814)
    public final int[] method3543(int arg0) {
        class652 var2 = this.field8541;
        class420 var3;
        synchronized (this.field8541) {
            var3 = (class420) this.field8541.method3742((byte) 67, (long) arg0);
            if (var3 == null) {
                if (!super.field774.method1212(107, arg0)) {
                    return null;
                }
                class467 var5 = super.field774.method1208((byte) 47, arg0);
                int var6 = !var5.field6574 && !this.field8535 ? this.field8563 : 64;
                var3 = new class420(arg0, var6, super.field774.method1211((byte) 22, var6, var6, true, arg0, 0.7F), var5.field6581 != 1);
                this.field8541.method3739((long) arg0, (byte) 42, var3);
            }
        }
        var3.field5736 = true;
        return var3.method2542();
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 2835)
    public final void method459(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class511 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        class386 var13 = (class386) arg6;
        int[] var14 = var13.field5351;
        int[] var15 = var13.field5350;
        int var16 = this.field8543 > arg8 ? this.field8543 : arg8;
        int var17 = this.field8539 < var14.length + arg8 ? this.field8539 : var14.length + arg8;
        int var18 = arg11 << 8;
        int var19 = arg9 << 8;
        int var20 = arg10 << 8;
        int var21 = var19 + var20;
        int var22 = var18 % var21;
        int var23 = arg2 - arg0;
        int var24 = arg3 - arg1;
        if (var23 + var24 < 0) {
            int var25 = (int) (Math.sqrt((double) (var23 * var23 + var24 * var24)) * 256.0D);
            int var26 = var25 % var21;
            int var27 = var19 + var21 - var22 - var26;
            var22 = var27 % var21;
            if (var22 < 0) {
                var22 += var21;
            }
            arg0 += var23;
            var23 = -var23;
            arg1 += var24;
            var24 = -var24;
        }
        if (var23 > var24) {
            int var28 = arg1 << 16;
            int var29 = var28 + 32768;
            int var30 = var24 << 16;
            int var31 = (int) Math.floor((double) var30 / (double) var23 + 0.5D);
            int var32 = arg0 + var23;
            int var33 = arg4 >>> 24;
            int var34 = (int) Math.sqrt((double) ((var31 >> 8) * (var31 >> 8) + 65536));
            if (arg5 != 0 && (arg5 != 1 || var33 != 255)) {
                if (arg5 == 1) {
                    int var35 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var36 = 256 - var33;
                    while (arg0 <= var32) {
                        int var37 = var29 >> 16;
                        int var38 = var37 - arg8;
                        if (arg0 >= this.field8568 && arg0 < this.field8567 && var37 >= var16 && var37 < var17 && var22 < var19) {
                            int var39 = var14[var38] + arg7;
                            if (arg0 >= var39 && arg0 < var15[var38] + var39) {
                                int var40 = this.field8557 * var37 + arg0;
                                int var41 = this.field8536[var40];
                                int var42 = ((var41 & 16711935) * var36 >> 8 & 16711935) + ((var41 & 65280) * var36 >> 8 & 65280);
                                this.field8536[var40] = var35 + var42;
                            }
                        }
                        var29 += var31;
                        ++arg0;
                        int var43 = var22 + var34;
                        var22 = var43 % var21;
                    }
                } else if (arg5 == 2) {
                    while (arg0 <= var32) {
                        int var44 = var29 >> 16;
                        int var45 = var44 - arg8;
                        if (arg0 >= this.field8568 && arg0 < this.field8567 && var44 >= var16 && var44 < var17 && var22 < var19) {
                            int var46 = var14[var45] + arg7;
                            if (arg0 >= var46 && arg0 < var15[var45] + var46) {
                                int var47 = this.field8557 * var44 + arg0;
                                int var48 = this.field8536[var47];
                                int var49 = arg4 + var48;
                                int var50 = (arg4 & 16711935) + (var48 & 16711935);
                                int var51 = (var49 - var50 & 65536) + (var50 & 16777472);
                                this.field8536[var47] = var49 - var51 | var51 - (var51 >>> 8);
                            }
                        }
                        var29 += var31;
                        ++arg0;
                        int var52 = var22 + var34;
                        var22 = var52 % var21;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                while (arg0 <= var32) {
                    int var53 = var29 >> 16;
                    int var54 = var53 - arg8;
                    if (arg0 >= this.field8568 && arg0 < this.field8567 && var53 >= var16 && var53 < var17 && var22 < var19) {
                        int var55 = var14[var54] + arg7;
                        if (arg0 >= var55 && arg0 < var15[var54] + var55) {
                            this.field8536[this.field8557 * var53 + arg0] = arg4;
                        }
                    }
                    var29 += var31;
                    ++arg0;
                    int var56 = var22 + var34;
                    var22 = var56 % var21;
                }
            }
        } else {
            int var57 = arg0 << 16;
            int var58 = var57 + 32768;
            int var59 = var23 << 16;
            int var60 = (int) Math.floor((double) var59 / (double) var24 + 0.5D);
            int var61 = (int) Math.sqrt((double) ((var60 >> 8) * (var60 >> 8) + 65536));
            int var62 = arg1 + var24;
            int var63 = arg4 >>> 24;
            if (arg5 == 0 || arg5 == 1 && var63 == 255) {
                while (arg1 <= var62) {
                    int var80 = var58 >> 16;
                    int var81 = arg1 - arg8;
                    if (arg1 >= var16 && arg1 < var17 && var80 >= this.field8568 && var80 < this.field8567 && var22 < var19 && var80 >= var14[var81] + arg7 && var80 < var14[var81] + arg7 + var15[var81]) {
                        this.field8536[this.field8557 * arg1 + var80] = arg4;
                    }
                    var58 += var60;
                    ++arg1;
                    int var82 = var22 + var61;
                    var22 = var82 % var21;
                }
            } else if (arg5 == 1) {
                int var64 = (var63 << 24) + ((arg4 & 16711935) * var63 >> 8 & 16711935) + ((arg4 & 65280) * var63 >> 8 & 65280);
                int var65 = 256 - var63;
                while (arg1 <= var62) {
                    int var66 = var58 >> 16;
                    int var67 = arg1 - arg8;
                    if (arg1 >= var16 && arg1 < var17 && var66 >= this.field8568 && var66 < this.field8567 && var22 < var19 && var66 >= var14[var67] + arg7 && var66 < var14[var67] + arg7 + var15[var67]) {
                        int var68 = this.field8557 * arg1 + var66;
                        int var69 = this.field8536[var68];
                        int var70 = ((var69 & 16711935) * var65 >> 8 & 16711935) + ((var69 & 65280) * var65 >> 8 & 65280);
                        this.field8536[this.field8557 * arg1 + var66] = var64 + var70;
                    }
                    var58 += var60;
                    ++arg1;
                    int var71 = var22 + var61;
                    var22 = var71 % var21;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var62) {
                    int var72 = var58 >> 16;
                    int var73 = arg1 - arg8;
                    if (arg1 >= var16 && arg1 < var17 && var72 >= this.field8568 && var72 < this.field8567 && var22 < var19 && var72 >= var14[var73] + arg7 && var72 < var14[var73] + arg7 + var15[var73]) {
                        int var74 = this.field8557 * arg1 + var72;
                        int var75 = this.field8536[var74];
                        int var76 = arg4 + var75;
                        int var77 = (arg4 & 16711935) + (var75 & 16711935);
                        int var78 = (var76 - var77 & 65536) + (var77 & 16777472);
                        this.field8536[var74] = var76 - var78 | var78 - (var78 >>> 8);
                    }
                    var58 += var60;
                    ++arg1;
                    int var79 = var22 + var61;
                    var22 = var79 % var21;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)Lza;", line = 3085)
    public final class434 method444(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!pm", name = "q", descriptor = "()Z", line = 3088)
    public final boolean method492() {
        return false;
    }

    @OriginalMember(owner = "client!pm", name = "C", descriptor = "()V", line = 3091)
    private final void method3544() {
        this.field8550 = this.field8568 - this.field8549;
        this.field8571 = this.field8567 - this.field8549;
        this.field8546 = this.field8543 - this.field8542;
        this.field8538 = this.field8539 - this.field8542;
        for (int var1 = 0; var1 < this.field8569; ++var1) {
            class482 var5 = this.field8559[var1].field9487;
            var5.field6775 = this.field8549 - this.field8568;
            var5.field6776 = this.field8542 - this.field8543;
            var5.field6780 = this.field8567 - this.field8568;
            var5.field6777 = this.field8539 - this.field8543;
        }
        int var2 = this.field8557 * this.field8543 + this.field8568;
        for (int var3 = this.field8543; var3 < this.field8539; ++var3) {
            for (int var4 = 0; var4 < this.field8569; ++var4) {
                this.field8559[var4].field9487.field6773[var3 - this.field8543] = var2;
            }
            var2 += this.field8557;
        }
    }

    @OriginalMember(owner = "client!pm", name = "M", descriptor = "()I", line = 3130)
    public final int method538() {
        int var1 = this.field8533;
        this.field8533 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!pm", name = "T", descriptor = "(IIII)V", line = 3135)
    public final void method453(int arg0, int arg1, int arg2, int arg3) {
        if (this.field8568 < arg0) {
            this.field8568 = arg0;
        }
        if (this.field8543 < arg1) {
            this.field8543 = arg1;
        }
        if (this.field8567 > arg2) {
            this.field8567 = arg2;
        }
        if (this.field8539 > arg3) {
            this.field8539 = arg3;
        }
        this.method3544();
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIIIIII)V", line = 3150)
    public final void method527(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg2 - arg0;
        int var11 = arg3 - arg1;
        if (var11 == 0) {
            if (var10 >= 0) {
                this.method3537(arg0, arg1, var10 + 1, arg4, arg5, arg6, arg7, arg8);
            } else {
                int var12 = arg6 + arg7;
                int var13 = arg8 % var12;
                int var14 = arg6 + var12 - var13 - (-var10 + 1) % var12;
                int var15 = var14 % var12;
                if (var15 < 0) {
                    var15 += var12;
                }
                this.method3537(arg0 + var10, arg1, -var10 + 1, arg4, arg5, arg6, arg7, var15);
            }
        } else if (var10 == 0) {
            if (var11 >= 0) {
                this.method3546(arg0, arg1, var11 + 1, arg4, arg5, arg6, arg7, arg8);
            } else {
                int var16 = arg6 + arg7;
                int var17 = arg8 % var16;
                int var18 = arg6 + var16 - var17 - (-var11 + 1) % var16;
                int var19 = var18 % var16;
                if (var19 < 0) {
                    var19 += var16;
                }
                this.method3546(arg0, arg1 + var11, -var11 + 1, arg4, arg5, arg6, arg7, var19);
            }
        } else {
            int var20 = arg8 << 8;
            int var21 = arg6 << 8;
            int var22 = arg7 << 8;
            int var23 = var21 + var22;
            int var24 = var20 % var23;
            if (var10 + var11 < 0) {
                int var25 = (int) (Math.sqrt((double) (var10 * var10 + var11 * var11)) * 256.0D);
                int var26 = var25 % var23;
                int var27 = var21 + var23 - var24 - var26;
                var24 = var27 % var23;
                if (var24 < 0) {
                    var24 += var23;
                }
                arg0 += var10;
                var10 = -var10;
                arg1 += var11;
                var11 = -var11;
            }
            if (var10 > var11) {
                int var28 = arg1 << 16;
                int var29 = var28 + 32768;
                int var30 = var11 << 16;
                int var31 = (int) Math.floor((double) var30 / (double) var10 + 0.5D);
                int var32 = arg0 + var10;
                int var33 = arg4 >>> 24;
                int var34 = (int) Math.sqrt((double) ((var31 >> 8) * (var31 >> 8) + 65536));
                if (arg5 != 0 && (arg5 != 1 || var33 != 255)) {
                    if (arg5 == 1) {
                        int var35 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                        int var36 = 256 - var33;
                        while (arg0 <= var32) {
                            int var37 = var29 >> 16;
                            if (arg0 >= this.field8568 && arg0 < this.field8567 && var37 >= this.field8543 && var37 < this.field8539 && var24 < var21) {
                                int var38 = this.field8557 * var37 + arg0;
                                int var39 = this.field8536[var38];
                                int var40 = ((var39 & 16711935) * var36 >> 8 & 16711935) + ((var39 & 65280) * var36 >> 8 & 65280);
                                this.field8536[var38] = var35 + var40;
                            }
                            var29 += var31;
                            ++arg0;
                            int var41 = var24 + var34;
                            var24 = var41 % var23;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var32) {
                            int var42 = var29 >> 16;
                            if (arg0 >= this.field8568 && arg0 < this.field8567 && var42 >= this.field8543 && var42 < this.field8539 && var24 < var21) {
                                int var43 = this.field8557 * var42 + arg0;
                                int var44 = this.field8536[var43];
                                int var45 = arg4 + var44;
                                int var46 = (arg4 & 16711935) + (var44 & 16711935);
                                int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                                this.field8536[var43] = var45 - var47 | var47 - (var47 >>> 8);
                            }
                            var29 += var31;
                            ++arg0;
                            int var48 = var24 + var34;
                            var24 = var48 % var23;
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    while (arg0 <= var32) {
                        int var49 = var29 >> 16;
                        if (arg0 >= this.field8568 && arg0 < this.field8567 && var49 >= this.field8543 && var49 < this.field8539 && var24 < var21) {
                            this.field8536[this.field8557 * var49 + arg0] = arg4;
                        }
                        var29 += var31;
                        ++arg0;
                        int var50 = var24 + var34;
                        var24 = var50 % var23;
                    }
                }
            } else {
                int var51 = arg0 << 16;
                int var52 = var51 + 32768;
                int var53 = var10 << 16;
                int var54 = (int) Math.floor((double) var53 / (double) var11 + 0.5D);
                int var55 = arg1 + var11;
                int var56 = arg4 >>> 24;
                int var57 = (int) Math.sqrt((double) ((var54 >> 8) * (var54 >> 8) + 65536));
                if (arg5 != 0 && (arg5 != 1 || var56 != 255)) {
                    if (arg5 == 1) {
                        int var58 = (var56 << 24) + ((arg4 & 16711935) * var56 >> 8 & 16711935) + ((arg4 & 65280) * var56 >> 8 & 65280);
                        int var59 = 256 - var56;
                        while (arg1 <= var55) {
                            int var60 = var52 >> 16;
                            if (arg1 >= this.field8543 && arg1 < this.field8539 && var60 >= this.field8568 && var60 < this.field8567 && var24 < var21) {
                                int var61 = this.field8557 * arg1 + var60;
                                int var62 = this.field8536[var61];
                                int var63 = ((var62 & 16711935) * var59 >> 8 & 16711935) + ((var62 & 65280) * var59 >> 8 & 65280);
                                this.field8536[this.field8557 * arg1 + var60] = var58 + var63;
                            }
                            var52 += var54;
                            ++arg1;
                            int var64 = var24 + var57;
                            var24 = var64 % var23;
                        }
                    } else if (arg5 == 2) {
                        while (arg1 <= var55) {
                            int var65 = var52 >> 16;
                            if (arg1 >= this.field8543 && arg1 < this.field8539 && var65 >= this.field8568 && var65 < this.field8567 && var24 < var21) {
                                int var66 = this.field8557 * arg1 + var65;
                                int var67 = this.field8536[var66];
                                int var68 = arg4 + var67;
                                int var69 = (arg4 & 16711935) + (var67 & 16711935);
                                int var70 = (var68 - var69 & 65536) + (var69 & 16777472);
                                this.field8536[var66] = var68 - var70 | var70 - (var70 >>> 8);
                            }
                            var52 += var54;
                            ++arg1;
                            int var71 = var24 + var57;
                            var24 = var71 % var23;
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    while (arg1 <= var55) {
                        int var72 = var52 >> 16;
                        if (arg1 >= this.field8543 && arg1 < this.field8539 && var72 >= this.field8568 && var72 < this.field8567 && var24 < var21) {
                            this.field8536[this.field8557 * arg1 + var72] = arg4;
                        }
                        var52 += var54;
                        ++arg1;
                        int var73 = var24 + var57;
                        var24 = var73 % var23;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lqaa;)V", line = 3395)
    public final void method464(class29 arg0) {
    }

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "(I)Z", line = 3401)
    public final boolean method3545(int arg0) {
        return this.field8535 || super.field774.method1208((byte) 47, arg0).field6574;
    }

    @OriginalMember(owner = "client!pm", name = "A", descriptor = "(ILaa;II)V", line = 3408)
    public final void method490(int arg0, class511 arg1, int arg2, int arg3) {
        class386 var5 = (class386) arg1;
        int[] var6 = var5.field5351;
        int[] var7 = var5.field5350;
        int var8;
        if (this.field8539 < var6.length + arg3) {
            var8 = this.field8539 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field8543 > arg3) {
            var9 = this.field8543 - arg3;
            arg3 = this.field8543;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field8557 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field8568 > var12) {
                    var13 -= this.field8568 - var12;
                    var12 = this.field8568;
                }
                if (this.field8567 < var12 + var13) {
                    var13 = this.field8567 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field8536[var14++] = arg0;
                }
                var10 += this.field8557;
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIIF)Lqm;", line = 3465)
    public final class154 method439(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!pm", name = "r", descriptor = "()Z", line = 3469)
    public final boolean method494() {
        return true;
    }

    @OriginalMember(owner = "client!pm", name = "aa", descriptor = "(IIIIII)V", line = 3472)
    public final void method495(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field8568) {
            arg2 -= this.field8568 - arg0;
            arg0 = this.field8568;
        }
        if (arg1 < this.field8543) {
            arg3 -= this.field8543 - arg1;
            arg1 = this.field8543;
        }
        if (arg0 + arg2 > this.field8567) {
            arg2 = this.field8567 - arg0;
        }
        if (arg1 + arg3 > this.field8539) {
            arg3 = this.field8539 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field8567 && arg1 <= this.field8539) {
            int var7 = this.field8557 - arg2;
            int var8 = this.field8557 * arg1 + arg0;
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
                            this.field8536[var24] = arg4;
                            ++var24;
                            this.field8536[var24] = arg4;
                            ++var24;
                            this.field8536[var24] = arg4;
                            ++var24;
                            this.field8536[var24] = arg4;
                            ++var24;
                            this.field8536[var24] = arg4;
                            ++var24;
                            this.field8536[var24] = arg4;
                            ++var24;
                            this.field8536[var24] = arg4;
                            ++var24;
                            this.field8536[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field8536[var24] = arg4;
                            --var27;
                        } while (var27 > 0);
                    }
                    var24 += var7;
                }
            } else if (arg5 == 1) {
                int var10 = ((arg4 & 16711935) * var9 >> 8 & 16711935) + (((arg4 & -16711936) >>> 8) * var9 & -16711936);
                int var11 = 256 - var9;
                for (int var12 = 0; var12 < arg3; ++var12) {
                    for (int var13 = -arg2; var13 < 0; ++var13) {
                        int var14 = this.field8536[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                        this.field8536[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field8536[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field8536[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "K", descriptor = "([I)V", line = 3607)
    public final void method449(int[] arg0) {
        arg0[0] = this.field8568;
        arg0[1] = this.field8543;
        arg0[2] = this.field8567;
        arg0[3] = this.field8539;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIII)V", line = 3628)
    public final void method448(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(IIIID)V", line = 3634)
    public final void method460(int arg0, int arg1, int arg2, int arg3, double arg4) {
        int var7 = this.field8548 - arg2;
        int var8 = this.field8548 * arg1 + arg0;
        float[] var9 = this.field8556;
        int var10 = 0;
        while (var10 < arg3) {
            int var11 = 0;
            while (var11 < arg2) {
                float var12 = var9[var8];
                if (var12 != 2.1474836E9F) {
                    var9[var8] = (float) ((double) var12 + arg4);
                }
                ++var11;
                ++var8;
            }
            ++var10;
            var8 += var7;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)V", line = 3664)
    public final void method463(int arg0, int arg1) throws class736 {
        if (this.field8532 != null && this.field8528 != null) {
            try {
                Graphics var3 = this.field8532.getGraphics();
                this.field8528.method223(this.field8526, arg1, this.field8531, (byte) -38, 0, var3, arg0, 0);
            } catch (Exception var4) {
                this.field8532.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(IIIIIIII)V", line = 3683)
    private final void method3546(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 >= this.field8568 && arg0 < this.field8567) {
            int var9 = this.field8557 * arg1 + arg0;
            int var10 = arg3 >>> 24;
            int var11 = arg5 + arg6;
            int var12 = arg7 % var11;
            if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
                if (arg4 == 1) {
                    int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
                    int var14 = 256 - var10;
                    int var15 = 0;
                    while (var15 < arg2) {
                        if (arg1 + var15 >= this.field8543 && arg1 + var15 < this.field8539 && var12 < arg5) {
                            int var16 = this.field8557 * var15 + var9;
                            int var17 = this.field8536[var16];
                            int var18 = ((var17 & 16711935) * var14 >> 8 & 16711935) + ((var17 & 65280) * var14 >> 8 & 65280);
                            this.field8536[var16] = var13 + var18;
                        }
                        ++var15;
                        ++var12;
                        var12 %= var11;
                    }
                } else if (arg4 == 2) {
                    int var19 = 0;
                    while (var19 < arg2) {
                        if (arg1 + var19 >= this.field8543 && arg1 + var19 < this.field8539 && var12 < arg5) {
                            int var20 = this.field8557 * var19 + var9;
                            int var21 = this.field8536[var20];
                            int var22 = arg3 + var21;
                            int var23 = (arg3 & 16711935) + (var21 & 16711935);
                            int var24 = (var22 - var23 & 65536) + (var23 & 16777472);
                            this.field8536[var20] = var22 - var24 | var24 - (var24 >>> 8);
                        }
                        ++var19;
                        ++var12;
                        var12 %= var11;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                int var25 = 0;
                while (var25 < arg2) {
                    if (arg1 + var25 >= this.field8543 && arg1 + var25 < this.field8539 && var12 < arg5) {
                        this.field8536[this.field8557 * var25 + var9] = arg3;
                    }
                    ++var25;
                    ++var12;
                    var12 %= var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "la", descriptor = "()V", line = 3786)
    public final void method511() {
        this.field8568 = 0;
        this.field8543 = 0;
        this.field8567 = this.field8557;
        this.field8539 = this.field8537;
        this.method3544();
    }

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "(I)V", line = 3794)
    public final void method524(int arg0) {
        class201.field3134 = arg0;
        class201.field3070 = arg0;
        if (this.field8569 > 1) {
            throw new IllegalStateException("No MT");
        } else {
            this.method497(this.field8569);
            this.method519(0);
        }
    }

    @OriginalMember(owner = "client!pm", name = "X", descriptor = "(I)V", line = 3821)
    public final void method523(int arg0) {
    }

    @OriginalMember(owner = "client!pm", name = "ZA", descriptor = "(IFFFFF)V", line = 3824)
    public final void method469(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field8545 = (int) (arg1 * 65535.0F);
        this.field8561 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field8553 = (int) (arg3 * 65535.0F / var7);
        this.field8552 = (int) (arg4 * 65535.0F / var7);
        this.field8555 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "()Z", line = 3833)
    public final boolean method431() {
        return false;
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(II)I", line = 3836)
    public final int method512(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "()Lqja;", line = 3850)
    public final class326 method440() {
        return this.field8551;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 3869)
    public final void method493(Canvas arg0) {
        if (this.field8532 == arg0) {
            this.method537((Canvas) null);
        }
        class22 var2 = (class22) this.field8527.method2242((long) arg0.hashCode(), -1);
        if (var2 != null) {
            var2.method3387((byte) 111);
        }
    }
}
