import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class208 extends class287 {

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "Z")
    private boolean field2736;

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "Z")
    private boolean field2738;

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "Lqh;")
    private class50 field2739;

    @OriginalMember(owner = "client!cd", name = "N", descriptor = "I")
    public int field2754;

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "I")
    private int field2750;

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
    public int field2741;

    @OriginalMember(owner = "client!cd", name = "H", descriptor = "I")
    public int field2749;

    @OriginalMember(owner = "client!cd", name = "S", descriptor = "I")
    public int field2759;

    @OriginalMember(owner = "client!cd", name = "E", descriptor = "I")
    public int field2746;

    @OriginalMember(owner = "client!cd", name = "bb", descriptor = "I")
    public int field2768;

    @OriginalMember(owner = "client!cd", name = "W", descriptor = "I")
    public int field2763;

    @OriginalMember(owner = "client!cd", name = "X", descriptor = "I")
    private int field2764;

    @OriginalMember(owner = "client!cd", name = "Q", descriptor = "Z")
    private boolean field2757;

    @OriginalMember(owner = "client!cd", name = "db", descriptor = "I")
    public int field2770;

    @OriginalMember(owner = "client!cd", name = "cb", descriptor = "I")
    public int field2769;

    @OriginalMember(owner = "client!cd", name = "F", descriptor = "I")
    private int field2747;

    @OriginalMember(owner = "client!cd", name = "V", descriptor = "I")
    public int field2762;

    @OriginalMember(owner = "client!cd", name = "Z", descriptor = "I")
    private int field2766;

    @OriginalMember(owner = "client!cd", name = "lb", descriptor = "I")
    public int field2778;

    @OriginalMember(owner = "client!cd", name = "hb", descriptor = "I")
    public int field2774;

    @OriginalMember(owner = "client!cd", name = "mb", descriptor = "Z")
    public boolean field2779;

    @OriginalMember(owner = "client!cd", name = "pb", descriptor = "I")
    public int field2782;

    @OriginalMember(owner = "client!cd", name = "gb", descriptor = "I")
    public int field2773;

    @OriginalMember(owner = "client!cd", name = "ob", descriptor = "I")
    public int field2781;

    @OriginalMember(owner = "client!cd", name = "ab", descriptor = "Lhn;")
    private class509 field2767;

    @OriginalMember(owner = "client!cd", name = "rb", descriptor = "I")
    private int field2784;

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "Lhn;")
    private class509 field2745;

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "Lcn;")
    public class359 field2742;

    @OriginalMember(owner = "client!cd", name = "P", descriptor = "F")
    private float field2756;

    @OriginalMember(owner = "client!cd", name = "fb", descriptor = "F")
    private float field2772;

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "I")
    private int field2737;

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "I")
    public int field2744;

    @OriginalMember(owner = "client!cd", name = "G", descriptor = "I")
    public int field2748;

    @OriginalMember(owner = "client!cd", name = "L", descriptor = "I")
    public int field2752;

    @OriginalMember(owner = "client!cd", name = "M", descriptor = "I")
    public int field2753;

    @OriginalMember(owner = "client!cd", name = "O", descriptor = "I")
    public int field2755;

    @OriginalMember(owner = "client!cd", name = "T", descriptor = "I")
    public int field2760;

    @OriginalMember(owner = "client!cd", name = "U", descriptor = "I")
    public int field2761;

    @OriginalMember(owner = "client!cd", name = "Y", descriptor = "I")
    public int field2765;

    @OriginalMember(owner = "client!cd", name = "eb", descriptor = "I")
    public int field2771;

    @OriginalMember(owner = "client!cd", name = "ib", descriptor = "I")
    public int field2775;

    @OriginalMember(owner = "client!cd", name = "jb", descriptor = "I")
    private int field2776;

    @OriginalMember(owner = "client!cd", name = "kb", descriptor = "I")
    public int field2777;

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "Lo;")
    private class24 field2743;

    @OriginalMember(owner = "client!cd", name = "qb", descriptor = "Lo;")
    private class24 field2783;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "Lwe;")
    private class281 field2735;

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2740;

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "Z")
    public boolean field2751;

    @OriginalMember(owner = "client!cd", name = "R", descriptor = "[I")
    public int[] field2758;

    @OriginalMember(owner = "client!cd", name = "nb", descriptor = "[Llb;")
    private class382[] field2780;

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "()V", line = 3)
    public final void method1208() {
        if (this.field2740 != null && this.field2735 != null) {
            try {
                Graphics var1 = this.field2740.getGraphics();
                this.field2735.method1700(var1, (byte) -57, 0, 0);
            } catch (Exception var2) {
                this.field2740.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(Z)V", line = 19)
    public final void method1166(boolean arg0) {
        this.field2757 = arg0;
        this.field2745.method3045(48);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIIIII)V", line = 23)
    public final void method1313(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2 != 0 && arg3 != 0) {
            if (arg5 != 65535 && !super.field3772.method94(arg5, (byte) -72).field6305) {
                if (this.field2784 != arg5) {
                    class24 var10 = (class24) this.field2767.method3032(3589, (long) arg5);
                    if (var10 == null) {
                        int[] var11 = this.method1316(arg5);
                        if (var11 == null) {
                            return;
                        }
                        int var12 = this.method1319(arg5) ? 64 : 128;
                        var10 = this.method1218(var11, 0, var12, var12, var12);
                        this.field2767.method3046((long) arg5, var10, 1);
                    }
                    this.field2784 = arg5;
                    this.field2783 = var10;
                }
                this.field2783.method6(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
            } else {
                this.method1136(arg0, arg1, arg2, arg6, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)I", line = 57)
    public final int method1191(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(IIIIII)V", line = 63)
    public final void method1157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1128(arg0, arg1, arg2, arg4, arg5);
        this.method1128(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method1185(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method1185(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V", line = 70)
    public final void method1187(int arg0) {
        this.field2780[arg0].method2332(10000, Thread.currentThread());
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(II)V", line = 73)
    public final void method1200(int arg0, int arg1) {
        this.field2762 = arg0;
        this.field2747 = arg1;
        this.field2774 = this.field2747 - 255;
        this.method1315();
    }

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "(I)Z", line = 79)
    public final boolean method1314(int arg0) {
        return super.field3772.method94(arg0, (byte) -72).field6311;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V", line = 83)
    public final void method1143(int arg0) {
        int var2 = arg0 - this.field2737;
        for (Object var3 = this.field2745.method3043(-2679); var3 != null; var3 = this.field2745.method3047(-5)) {
            class353 var4 = (class353) var3;
            if (var4.field4702) {
                var4.field4704 += var2;
                int var5 = var4.field4704 / 20;
                if (var5 > 0) {
                    class433 var6 = super.field3772.method94(var4.field4706, (byte) -72);
                    var4.method2066(var6.field6315 * var2 * 50 / 1000, var6.field6313 * var2 * 50 / 1000);
                    var4.field4704 -= var5 * 20;
                }
                var4.field4702 = false;
            }
        }
        this.field2737 = arg0;
        this.field2767.method3036(5, (byte) -42);
    }

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "()Z", line = 114)
    public final boolean method1237() {
        return false;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lpq;IIII)Le;", line = 118)
    public final class373 method1213(class131 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class356(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!cd", name = "MA", descriptor = "([I)V", line = 121)
    public final void method1163(int[] arg0) {
        arg0[0] = this.field2781;
        arg0[1] = this.field2749;
        arg0[2] = this.field2778;
        arg0[3] = this.field2773;
    }

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "()Z", line = 127)
    public final boolean method1193() {
        return false;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)I", line = 130)
    public final int method1211(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "()V", line = 133)
    private final void method1315() {
        if (this.field2772 != 0.0F) {
            float var1 = (float) this.field2747;
            float var2 = (float) this.field2762;
            float var3 = -(var2 * 2.0F * var1) / (var1 - var2);
            float var4 = this.field2756 / (this.field2772 + this.field2756);
            float var5 = var4 * var4;
            float var6 = (1.0F - var4) * -var3 * (1.0F - var4) / this.field2772;
            this.field2770 = (int) (((float) this.field2747 - var3 * var5) / ((var1 + var2) / (var1 - var2) - var6) + 0.5F);
        } else {
            this.field2770 = this.field2747;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[Lbn;)V", line = 153)
    public final void method1146(int arg0, class309[] arg1) {
    }

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "(IIIIII[BII)V", line = 156)
    public final void method1172(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field2761 * arg1 + arg0;
            int var15 = this.field2761 - arg2;
            if (arg1 + arg3 > this.field2773) {
                arg3 -= arg1 + arg3 - this.field2773;
            }
            if (arg1 < this.field2749) {
                int var16 = this.field2749 - arg1;
                arg3 -= var16;
                var14 += this.field2761 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field2778) {
                int var17 = arg0 + arg2 - this.field2778;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field2781) {
                int var18 = this.field2781 - arg0;
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
                            int var28 = this.field2758[var14];
                            this.field2758[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field2758[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field2758[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field2758[var14++] = arg5;
                        } else {
                            this.field2758[var14++] = arg4;
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

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIILta;II)V", line = 332)
    public final void method1126(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class144 arg6, int arg7, int arg8) {
        class217 var10 = (class217) arg6;
        int[] var11 = var10.field2954;
        int[] var12 = var10.field2953;
        int var13 = this.field2749 > arg8 ? this.field2749 : arg8;
        int var14 = this.field2773 < var11.length + arg8 ? this.field2773 : var11.length + arg8;
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
            if (arg0 < this.field2781) {
                var18 += (this.field2781 - arg0) * var20;
                arg0 = this.field2781;
            }
            if (var21 >= this.field2778) {
                var21 = this.field2778 - 1;
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
                                int var28 = this.field2761 * var25 + arg0;
                                int var29 = this.field2758[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field2758[var28] = var23 + var30;
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
                                int var34 = this.field2761 * var31 + arg0;
                                int var35 = this.field2758[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field2758[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field2758[this.field2761 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field2781 && var64 < this.field2778 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field2758[this.field2761 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field2781 && var50 < this.field2778 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field2761 * arg1 + var50;
                        int var54 = this.field2758[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field2758[this.field2761 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field2781 && var56 < this.field2778 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field2761 * arg1 + var56;
                        int var60 = this.field2758[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field2758[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "IA", descriptor = "(IIIII)V", line = 570)
    public final void method1185(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field2781 && arg0 < this.field2778) {
            if (arg1 < this.field2749) {
                arg2 -= this.field2749 - arg1;
                arg1 = this.field2749;
            }
            if (arg1 + arg2 > this.field2773) {
                arg2 = this.field2773 - arg1;
            }
            int var6 = this.field2761 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field2761 * var10 + var6;
                        int var12 = this.field2758[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field2758[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field2761 * var14 + var6;
                        int var16 = this.field2758[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field2758[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field2758[this.field2761 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(ILjava/awt/Canvas;Ll;)V", line = 647)
    public class208(int arg0, Canvas arg1, class16 arg2) {
        this(arg0, arg2);
        this.method1217(arg1);
        this.method1161(arg1);
    }

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "(IIII)V", line = 652)
    public final void method1180(int arg0, int arg1, int arg2, int arg3) {
        this.field2766 = this.field2763;
        this.field2746 = arg0;
        this.field2763 = arg1;
        this.field2741 = arg2;
        this.field2779 = true;
    }

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "(I)[I", line = 660)
    private final int[] method1316(int arg0) {
        class509 var2 = this.field2745;
        class353 var3;
        synchronized (this.field2745) {
            var3 = (class353) this.field2745.method3032(3589, (long) arg0);
            if (var3 == null) {
                if (!super.field3772.method91(arg0, -1221)) {
                    return null;
                }
                class433 var5 = super.field3772.method94(arg0, (byte) -72);
                int var6 = !var5.field6302 && !this.field2757 ? 128 : 64;
                var3 = new class353(arg0, var6, super.field3772.method92(2384, var6, var6, arg0, 0.7F, true), var5.field6324);
                this.field2745.method3046((long) arg0, var3, 1);
            }
        }
        var3.field4702 = true;
        return var3.method2064();
    }

    @OriginalMember(owner = "client!cd", name = "SA", descriptor = "(Lc;)V", line = 680)
    public final void method1227(class124 arg0) {
        this.field2742 = (class359) arg0;
    }

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "()Z", line = 683)
    public final boolean method1235() {
        return false;
    }

    @OriginalMember(owner = "client!cd", name = "P", descriptor = "(IIIIII)V", line = 686)
    public final void method1153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field2781) {
            arg2 -= this.field2781 - arg0;
            arg0 = this.field2781;
        }
        if (arg1 < this.field2749) {
            arg3 -= this.field2749 - arg1;
            arg1 = this.field2749;
        }
        if (arg0 + arg2 > this.field2778) {
            arg2 = this.field2778 - arg0;
        }
        if (arg1 + arg3 > this.field2773) {
            arg3 = this.field2773 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field2778 && arg1 <= this.field2773) {
            int var7 = this.field2761 - arg2;
            int var8 = this.field2761 * arg1 + arg0;
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
                            this.field2758[var24] = arg4;
                            ++var24;
                            this.field2758[var24] = arg4;
                            ++var24;
                            this.field2758[var24] = arg4;
                            ++var24;
                            this.field2758[var24] = arg4;
                            ++var24;
                            this.field2758[var24] = arg4;
                            ++var24;
                            this.field2758[var24] = arg4;
                            ++var24;
                            this.field2758[var24] = arg4;
                            ++var24;
                            this.field2758[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field2758[var24] = arg4;
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
                        int var14 = this.field2758[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + ((var14 & 65280) * var11 >> 8 & 65280);
                        this.field2758[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field2758[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field2758[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "()Z", line = 821)
    public final boolean method1135() {
        return false;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "()Z", line = 825)
    public final boolean method1154() {
        return true;
    }

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "(I)[I", line = 829)
    public final int[] method1317(int arg0) {
        class509 var2 = this.field2745;
        class353 var3;
        synchronized (this.field2745) {
            var3 = (class353) this.field2745.method3032(3589, (long) arg0);
            if (var3 == null) {
                if (!super.field3772.method91(arg0, -1221)) {
                    return null;
                }
                class433 var5 = super.field3772.method94(arg0, (byte) -72);
                int var6 = !var5.field6302 && !this.field2757 ? 128 : 64;
                var3 = new class353(arg0, var6, super.field3772.method90(0.7F, true, false, arg0, var6, var6), var5.field6324);
                this.field2745.method3046((long) arg0, var3, 1);
            }
        }
        var3.field4702 = true;
        return var3.method2064();
    }

    @OriginalMember(owner = "client!cd", name = "Q", descriptor = "(III)V", line = 849)
    public final void method1167(int arg0, int arg1, int arg2) {
        this.field2763 = arg0 & 16777215;
        int var4 = this.field2763 >>> 16 & 255;
        if (var4 < 2) {
            var4 = 2;
        }
        int var5 = this.field2763 >> 8 & 255;
        if (var5 < 2) {
            var5 = 2;
        }
        int var6 = this.field2763 & 255;
        if (var6 < 2) {
            var6 = 2;
        }
        this.field2763 = var4 << 16 | var5 << 8 | var6;
        if (arg1 < 0) {
            this.field2751 = false;
        } else {
            this.field2751 = true;
        }
    }

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "()V", line = 876)
    private final void method1318() {
        for (int var1 = 0; var1 < this.field2744; ++var1) {
            this.field2780[var1].method2334(false);
        }
        this.method1206();
    }

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "(I)Z", line = 884)
    public final boolean method1319(int arg0) {
        return this.field2757 || super.field3772.method94(arg0, (byte) -72).field6302;
    }

    @OriginalMember(owner = "client!cd", name = "AA", descriptor = "()I", line = 891)
    public final int method1234() {
        return this.field2762;
    }

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "(III[I)V", line = 896)
    public final void method1207(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (this.field2742.field4881 * arg2 + this.field2742.field4882 * arg1 + this.field2742.field4876 * arg0 >> 15) + this.field2742.field4874;
        if (var5 >= this.field2762 && var5 <= this.field2747) {
            int var6 = ((this.field2742.field4884 * arg2 + this.field2742.field4885 * arg0 + this.field2742.field4878 * arg1 >> 15) + this.field2742.field4883) * this.field2782 / var5;
            int var7 = ((this.field2742.field4880 * arg2 + this.field2742.field4879 * arg0 + this.field2742.field4875 * arg1 >> 15) + this.field2742.field4877) * this.field2754 / var5;
            if (var6 >= this.field2755 && var6 <= this.field2777 && var7 >= this.field2752 && var7 <= this.field2753) {
                arg3[0] = var6 - this.field2755;
                arg3[1] = var7 - this.field2752;
                arg3[2] = var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "(IFFFFF)V", line = 920)
    public final void method1181(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field2768 = (int) (arg1 * 65535.0F);
        this.field2759 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field2775 = (int) (arg3 * 65535.0F / var7);
        this.field2765 = (int) (arg4 * 65535.0F / var7);
        this.field2748 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!cd", name = "ya", descriptor = "(I)V", line = 929)
    public final void method1130(int arg0) {
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(IIIIII)V", line = 932)
    public final void method1228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method1128(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method1128(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method1185(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method1185(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field2781) {
                    var10 += (this.field2781 - arg0) * var12;
                    arg0 = this.field2781;
                }
                if (var13 >= this.field2778) {
                    var13 = this.field2778 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field2749 && var17 < this.field2773) {
                                int var18 = this.field2761 * var17 + arg0;
                                int var19 = this.field2758[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field2758[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field2749 && var21 < this.field2773) {
                                int var22 = this.field2761 * var21 + arg0;
                                int var23 = this.field2758[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field2758[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field2749 && var27 < this.field2773) {
                            this.field2758[this.field2761 * var27 + arg0] = arg4;
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
                if (arg1 < this.field2749) {
                    var29 += (this.field2749 - arg1) * var31;
                    arg1 = this.field2749;
                }
                if (var32 >= this.field2773) {
                    var32 = this.field2773 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field2781 && var46 < this.field2778) {
                            this.field2758[this.field2761 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field2781 && var36 < this.field2778) {
                            int var37 = this.field2761 * arg1 + var36;
                            int var38 = this.field2758[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field2758[this.field2761 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field2781 && var40 < this.field2778) {
                            int var41 = this.field2761 * arg1 + var40;
                            int var42 = this.field2758[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field2758[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)V", line = 1145)
    public final void method1173(int arg0) {
        if (this.field2744 != arg0) {
            this.field2744 = arg0;
            this.field2780 = new class382[this.field2744];
            for (int var2 = 0; var2 < this.field2744; ++var2) {
                this.field2780[var2] = new class382(this);
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "()Z", line = 1162)
    public final boolean method1142() {
        return false;
    }

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "()V", line = 1165)
    private final void method1320() {
        this.field2755 = this.field2781 - this.field2760;
        this.field2777 = this.field2778 - this.field2760;
        this.field2752 = this.field2749 - this.field2771;
        this.field2753 = this.field2773 - this.field2771;
        for (int var1 = 0; var1 < this.field2744; ++var1) {
            class441 var5 = this.field2780[var1].field5531;
            var5.field6403 = this.field2760 - this.field2781;
            var5.field6395 = this.field2771 - this.field2749;
            var5.field6401 = this.field2778 - this.field2781;
            var5.field6399 = this.field2773 - this.field2749;
        }
        int var2 = this.field2761 * this.field2749 + this.field2781;
        for (int var3 = this.field2749; var3 < this.field2773; ++var3) {
            for (int var4 = 0; var4 < this.field2744; ++var4) {
                this.field2780[var4].field5531.field6398[var3 - this.field2749] = var2;
            }
            var2 += this.field2761;
        }
    }

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "()V", line = 1204)
    public final void method1188() {
    }

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "()Z", line = 1207)
    public final boolean method1229() {
        return true;
    }

    @OriginalMember(owner = "client!cd", name = "sa", descriptor = "(IIII)[I", line = 1212)
    public final int[] method1151(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field2761 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field2758[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!cd", name = "ba", descriptor = "(IIII)V", line = 1238)
    public final void method1182(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field2761) {
            arg2 = this.field2761;
        }
        if (arg3 > this.field2776) {
            arg3 = this.field2776;
        }
        this.field2781 = arg0;
        this.field2778 = arg2;
        this.field2749 = arg1;
        this.field2773 = arg3;
        this.method1320();
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIII)V", line = 1258)
    public final void method1197(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class382 var8 = this.method1323(Thread.currentThread());
        class441 var9 = var8.field5531;
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
            int var21 = arg0 - var9.method2698();
            int var22 = arg1 - var9.method2707();
            int var23 = var17 + var21;
            int var24 = var21 - var18;
            int var25 = var10 + var21 - var18;
            int var26 = var10 + var21 + var17;
            int var27 = var19 + var22;
            int var28 = var22 - var20;
            int var29 = var11 + var22 - var20;
            int var30 = var11 + var22 + var19;
            if (arg6 == 0) {
                var9.field6394 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field6394 = 255 - (arg4 >> 24);
            }
            var9.field6392 = var23 < 0 || var23 > var9.field6401 || var24 < 0 || var24 > var9.field6401 || var25 < 0 || var25 > var9.field6401;
            var9.method2706(var27, var28, var29, var23, var24, var25, arg4);
            var9.field6392 = var23 < 0 || var23 > var9.field6401 || var24 < 0 || var24 > var9.field6401 || var26 < 0 || var26 > var9.field6401;
            var9.method2706(var27, var29, var30, var23, var25, var26, arg4);
        }
    }

    @OriginalMember(owner = "client!cd", name = "va", descriptor = "()V", line = 1327)
    public final void method1206() {
        this.field2781 = 0;
        this.field2749 = 0;
        this.field2778 = this.field2761;
        this.field2773 = this.field2776;
        this.method1320();
    }

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "()Z", line = 1335)
    public final boolean method1129() {
        return false;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIII)V", line = 1338)
    public final void method1137(int arg0, int arg1, int arg2, int arg3) {
        this.field2746 = arg0;
        this.field2763 = arg1;
        this.field2741 = arg2;
    }

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "()V", line = 1342)
    public final void method1196() {
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "()Z", line = 1345)
    public final boolean method1202() {
        return false;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 1349)
    public final void method1195(Canvas arg0) {
        class281 var2 = (class281) this.field2739.method295((long) arg0.hashCode(), -95);
        if (var2 != null) {
            var2.method2674(true);
            class281 var3 = class525.method3123(true, arg0);
            this.field2739.method291((long) arg0.hashCode(), var3, -67);
            if (this.field2740 == arg0 && this.field2743 == null) {
                this.field2735 = var3;
                this.field2758 = var3.field3725;
                this.field2761 = var3.field3721;
                this.field2776 = var3.field3718;
                this.method1318();
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "(I)V", line = 1368)
    public final void method1145(int arg0) {
        this.method1153(0, 0, this.field2761, this.field2776, arg0, 0);
    }

    @OriginalMember(owner = "client!cd", name = "HA", descriptor = "(IIII)V", line = 1372)
    public final void method1134(int arg0, int arg1, int arg2, int arg3) {
        if (this.field2781 < arg0) {
            this.field2781 = arg0;
        }
        if (this.field2749 < arg1) {
            this.field2749 = arg1;
        }
        if (this.field2778 > arg2) {
            this.field2778 = arg2;
        }
        if (this.field2773 > arg3) {
            this.field2773 = arg3;
        }
        this.method1320();
    }

    @OriginalMember(owner = "client!cd", name = "ma", descriptor = "(IIIII)V", line = 1387)
    public final void method1128(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field2749 && arg1 < this.field2773) {
            if (arg0 < this.field2781) {
                arg2 -= this.field2781 - arg0;
                arg0 = this.field2781;
            }
            if (arg0 + arg2 > this.field2778) {
                arg2 = this.field2778 - arg0;
            }
            int var6 = this.field2761 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field2758[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field2758[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field2758[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field2758[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field2758[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "(I)Z", line = 1459)
    public final boolean method1321(int arg0) {
        return super.field3772.method91(arg0, -1221);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II[I[I)Lta;", line = 1462)
    public final class144 method1215(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class217(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lob;Lob;FLob;)Lob;", line = 1465)
    public final class521 method1162(class521 arg0, class521 arg1, float arg2, class521 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!cd", name = "ZA", descriptor = "(IIIII)V", line = 1468)
    public final void method1136(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field2749) {
            var6 = this.field2749;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field2773) {
            var7 = this.field2773;
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
                if (var64 < this.field2781) {
                    var64 = this.field2781;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field2778) {
                    var65 = this.field2778;
                }
                int var66 = this.field2761 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field2758[var66++] = arg3;
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
                if (var60 < this.field2781) {
                    var60 = this.field2781;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field2778 - 1) {
                    var61 = this.field2778 - 1;
                }
                int var62 = this.field2761 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field2758[var62++] = arg3;
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
                if (var28 < this.field2781) {
                    var28 = this.field2781;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field2778) {
                    var29 = this.field2778;
                }
                int var30 = this.field2761 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field2758[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field2758[var30++] = var15 + var33;
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
                if (var22 < this.field2781) {
                    var22 = this.field2781;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field2778 - 1) {
                    var23 = this.field2778 - 1;
                }
                int var24 = this.field2761 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field2758[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field2758[var24++] = var15 + var27;
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
                if (var47 < this.field2781) {
                    var47 = this.field2781;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field2778) {
                    var48 = this.field2778;
                }
                int var49 = this.field2761 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field2758[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field2758[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field2781) {
                    var39 = this.field2781;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field2778 - 1) {
                    var40 = this.field2778 - 1;
                }
                int var41 = this.field2761 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field2758[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field2758[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "da", descriptor = "(FF)V", line = 1754)
    public final void method1140(float arg0, float arg1) {
        this.field2756 = arg0;
        this.field2772 = arg1;
        this.method1315();
    }

    @OriginalMember(owner = "client!cd", name = "GA", descriptor = "(IIII)V", line = 1759)
    public final void method1221(int arg0, int arg1, int arg2, int arg3) {
        this.field2760 = arg0;
        this.field2771 = arg1;
        this.field2782 = arg2;
        this.field2754 = arg3;
        this.method1320();
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II[[I[[IIII)Lya;", line = 1766)
    public final class38 method1214(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class535(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIF)Lbn;", line = 1770)
    public final class309 method1231(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "()Z", line = 1773)
    public final boolean method1132() {
        return false;
    }

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "()Z", line = 1777)
    public final boolean method1199() {
        return true;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lob;)V", line = 1779)
    public final void method1159(class521 arg0) {
    }

    @OriginalMember(owner = "client!cd", name = "T", descriptor = "()F", line = 1782)
    public final float method1223() {
        return this.field2756;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lgf;[Lev;Z)Lla;", line = 1786)
    public final class316 method1201(class183 arg0, class491[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field7196;
            var5[var7] = arg1[var7].field7191;
            if (arg1[var7].field7198 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            return new class369(this, arg0, arg1, var4, var5);
        } else if (var6) {
            return new class150(this, arg0, arg1, var4, var5);
        } else {
            return new class503(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "()Z", line = 1815)
    public final boolean method1190() {
        return false;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(IIIIII)Lob;", line = 1819)
    public final class521 method1230(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!cd", name = "Y", descriptor = "()I", line = 1823)
    public final int method1210() {
        int var1 = this.field2764;
        this.field2764 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!cd", name = "VA", descriptor = "(IIIIII)Z", line = 1829)
    public final boolean method1209(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (this.field2742.field4881 * arg2 + this.field2742.field4882 * arg1 + this.field2742.field4876 * arg0 >> 15) + this.field2742.field4874;
        if (var7 < 1) {
            var7 = 1;
        }
        int var8 = (this.field2742.field4881 * arg5 + this.field2742.field4882 * arg4 + this.field2742.field4876 * arg3 >> 15) + this.field2742.field4874;
        if (var8 < 1) {
            var8 = 1;
        }
        if ((var7 >= this.field2762 || var8 >= this.field2762) && (var7 <= this.field2747 || var8 <= this.field2747)) {
            int var9 = ((this.field2742.field4884 * arg2 + this.field2742.field4885 * arg0 + this.field2742.field4878 * arg1 >> 15) + this.field2742.field4883) * this.field2782 / var7;
            int var10 = ((this.field2742.field4884 * arg5 + this.field2742.field4885 * arg3 + this.field2742.field4878 * arg4 >> 15) + this.field2742.field4883) * this.field2782 / var8;
            if (var9 < this.field2755 && var10 < this.field2755 || var9 > this.field2777 && var10 > this.field2777) {
                return false;
            } else {
                int var11 = ((this.field2742.field4880 * arg2 + this.field2742.field4879 * arg0 + this.field2742.field4875 * arg1 >> 15) + this.field2742.field4877) * this.field2754 / var7;
                int var12 = ((this.field2742.field4880 * arg5 + this.field2742.field4879 * arg3 + this.field2742.field4875 * arg4 >> 15) + this.field2742.field4877) * this.field2754 / var8;
                return (var11 >= this.field2752 || var12 >= this.field2752) && (var11 <= this.field2753 || var12 <= this.field2753);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "()V", line = 1858)
    public final void method1147() {
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([Le;Leu;Lc;[Lut;I)V", line = 1862)
    public final void method1156(class373[] arg0, class336 arg1, class124 arg2, class82[] arg3, int arg4) {
        class356[] var6 = new class356[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class356) arg0[var7];
            }
        }
        class356 var8 = class356.method2109(this, var6);
        var8.method2112(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "()Z", line = 1877)
    public final boolean method1149() {
        return true;
    }

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)V", line = 1879)
    public final void method1233(int arg0) {
    }

    @OriginalMember(owner = "client!cd", name = "E", descriptor = "()Z", line = 1882)
    public final boolean method1322() {
        return this.field2738;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(ILl;)V", line = 2004)
    private class208(int arg0, class16 arg1) {
        super(arg0, arg1);
        this.field2736 = false;
        this.field2738 = false;
        this.field2739 = new class50(4);
        this.field2754 = 512;
        this.field2750 = 0;
        this.field2741 = 0;
        this.field2749 = 0;
        this.field2759 = 78642;
        this.field2746 = 0;
        this.field2768 = 45823;
        this.field2763 = 0;
        this.field2764 = 0;
        this.field2757 = false;
        this.field2770 = 3500;
        this.field2769 = 75518;
        this.field2747 = 3500;
        this.field2762 = 50;
        this.field2766 = 0;
        this.field2778 = 0;
        this.field2774 = this.field2747 - 255;
        this.field2779 = false;
        this.field2782 = 512;
        this.field2773 = 0;
        this.field2781 = 0;
        this.field2767 = new class509(16);
        this.field2784 = -1;
        this.field2745 = new class509(20);
        this.field2742 = new class359();
        this.method1173(1);
        this.method1187(0);
        class66.method388(true, false, 0);
        this.field2736 = true;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(Z)V", line = 1887)
    public final void method1175(boolean arg0) {
    }

    @OriginalMember(owner = "client!cd", name = "JA", descriptor = "(F)V", line = 1890)
    public final void method1139(float arg0) {
        this.field2769 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(IIII)V", line = 1892)
    public final void method1189(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lev;Z)Lo;", line = 1896)
    public final class24 method1236(class491 arg0, boolean arg1) {
        int[] var3 = arg0.field7197;
        byte[] var4 = arg0.field7192;
        int var5 = arg0.field7196;
        int var6 = arg0.field7191;
        class301 var11;
        if (arg1 && arg0.field7198 == null) {
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
            var11 = new class526(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field7198;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class112(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var21 = var5 * var19;
                    for (int var22 = 0; var22 < var5; ++var22) {
                        var14[var21 + var22] = var3[var4[var21 + var22] & 255];
                    }
                }
                new class112(this, var14, var5, var6);
                var11 = new class3(this, var14, var5, var6);
            }
        }
        var11.method147(arg0.field7195, arg0.field7199, arg0.field7193, arg0.field7194);
        return var11;
    }

    @OriginalMember(owner = "client!cd", name = "OA", descriptor = "()I", line = 1999)
    public final int method1169() {
        int var1 = this.field2750;
        this.field2750 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 2013)
    public final void method1152(Rectangle[] arg0, int arg1) {
        if (this.field2740 != null && this.field2735 != null) {
            try {
                Graphics var3 = this.field2740.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field2761 && var5.y <= this.field2776 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field2735.method1699(var3, var5.height, (byte) -58, var5.x, var5.y, var5.width);
                    }
                }
            } catch (Exception var6) {
                this.field2740.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIIIIII)V", line = 2043)
    public final void method1212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class382 var11 = this.method1323(Thread.currentThread());
        class441 var12 = var11.field5531;
        var12.field6400 = false;
        int var13 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var13 == 255) {
            var12.field6400 = false;
            var12.field6394 = 0;
            var12.field6392 = true;
            var12.method2703(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else {
            if (arg9 != 1) {
                if (arg9 == 2) {
                    throw new IllegalStateException();
                }
                throw new IllegalArgumentException();
            }
            var12.field6400 = false;
            var12.field6394 = 255 - var13;
            var12.field6392 = true;
            var12.method2703(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        }
        var12.field6400 = true;
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "()Lc;", line = 2078)
    public final class124 method1125() {
        return new class359();
    }

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "()I", line = 2081)
    public final int method1176() {
        return 0;
    }

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "()V", line = 2084)
    public final void method1179() {
        if (this.field2736) {
            class392.method2366(true, (byte) -112, false);
            this.field2736 = false;
        }
        this.field2735 = null;
        this.field2740 = null;
        this.field2739 = null;
        this.field2738 = true;
    }

    @OriginalMember(owner = "client!cd", name = "aa", descriptor = "()F", line = 2097)
    public final float method1155() {
        return this.field2772;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ln;)V", line = 2099)
    public final void method1225(class15 arg0) {
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/lang/Runnable;)Llb;", line = 2104)
    public final class382 method1323(Runnable arg0) {
        for (int var2 = 0; var2 < this.field2744; ++var2) {
            if (this.field2780[var2].field5529 == arg0) {
                return this.field2780[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 2117)
    public final void method1205(Canvas arg0) {
        if (this.field2740 == arg0) {
            this.method1161((Canvas) null);
        }
        class281 var2 = (class281) this.field2739.method295((long) arg0.hashCode(), -109);
        if (var2 != null) {
            var2.method2674(true);
        }
    }

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "()I", line = 2127)
    public final int method1141() {
        return this.field2747;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 2131)
    public final void method1217(Canvas arg0) {
        class281 var2 = (class281) this.field2739.method295((long) arg0.hashCode(), -94);
        if (var2 == null) {
            class281 var3 = class525.method3123(true, arg0);
            this.field2739.method291((long) arg0.hashCode(), var3, -46);
        }
    }

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "()V", line = 2139)
    public final void method1198() {
    }

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "(I)Ln;", line = 2142)
    public final class15 method1204(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "()V", line = 2145)
    public final void method1158() {
        this.field2745.method3045(48);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(FFF)V", line = 2147)
    public final void method1177(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!cd", name = "ra", descriptor = "(ILta;II)V", line = 2152)
    public final void method1220(int arg0, class144 arg1, int arg2, int arg3) {
        class217 var5 = (class217) arg1;
        int[] var6 = var5.field2954;
        int[] var7 = var5.field2953;
        int var8;
        if (this.field2773 < var6.length + arg3) {
            var8 = this.field2773 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field2749 > arg3) {
            var9 = this.field2749 - arg3;
            arg3 = this.field2749;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field2761 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field2781 > var12) {
                    var13 -= this.field2781 - var12;
                    var12 = this.field2781;
                }
                if (this.field2778 < var12 + var13) {
                    var13 = this.field2778 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field2758[var14++] = arg0;
                }
                var10 += this.field2761;
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)V", line = 2209)
    public final void method1171(int arg0) {
        this.field2780[arg0].method2332(10000, (Runnable) null);
    }

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "()V", line = 2212)
    public final void method1232() {
        this.field2763 = this.field2766;
        this.field2779 = false;
    }

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "(I)I", line = 2216)
    public final int method1324(int arg0) {
        return super.field3772.method94(arg0, (byte) -72).field6309 & 65535;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([IIIII)Lo;", line = 2220)
    public final class24 method1218(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class112(this, arg0, arg1, arg2, arg3, arg4) : new class3(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class112(this, arg0, arg1, arg2, arg3, arg4) : new class3(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Le;Leu;Lc;Lut;I)V", line = 2255)
    public final void method1203(class373 arg0, class336 arg1, class124 arg2, class82 arg3, int arg4) {
        ((class356) arg0).method2112(arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "()Z", line = 2258)
    public final boolean method1168() {
        return false;
    }

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "()Lc;", line = 2262)
    public final class124 method1183() {
        class382 var1 = this.method1323(Thread.currentThread());
        return var1.field5528;
    }

    @OriginalMember(owner = "client!cd", name = "pa", descriptor = "()I", line = 2266)
    public final int method1165() {
        return 0;
    }

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "()Z", line = 2269)
    public final boolean method1144() {
        return false;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([Le;Lc;[Lut;I)V", line = 2273)
    public final void method1170(class373[] arg0, class124 arg1, class82[] arg2, int arg3) {
        class356[] var5 = new class356[arg0.length];
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class356) arg0[var6];
            }
        }
        class356 var7 = class356.method2109(this, var5);
        var7.method2112(arg1, arg2 != null ? arg2[0] : null, (class336) null, arg3);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lls;III)V", line = 2294)
    public final void method1325(class94 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0.field1124;
        int var6 = arg3 >> 1;
        if (var5 == -1) {
            this.method1136(arg1, arg2, var6, arg0.field1133, 1);
        } else {
            if (this.field2784 != var5) {
                class24 var7 = (class24) this.field2767.method3032(3589, (long) var5);
                if (var7 == null) {
                    int[] var8 = this.method1316(var5);
                    if (var8 == null) {
                        return;
                    }
                    int var9 = this.method1319(var5) ? 64 : 128;
                    var7 = this.method1218(var8, 0, var9, var9, var9);
                    this.field2767.method3046((long) var5, var7, 1);
                }
                this.field2784 = var5;
                this.field2783 = var7;
            }
            if (this.field2783.method155() == 64) {
                arg3 <<= 1;
                var6 <<= 1;
            }
            this.field2783.method6(arg1 - var6, arg2 - var6, arg3, arg3, 0, arg0.field1133, 1);
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(IIIIZ)Lo;", line = 2337)
    public final class24 method1216(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field2761 * arg1 + arg0;
        int var8 = this.field2761 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field2758[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class112(this, var6, arg2, arg3);
        } else {
            return new class3(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V", line = 2368)
    public final void method1184(boolean arg0) {
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Leu;)V", line = 2372)
    public final void method1131(class336 arg0) {
        class380 var2 = arg0.field4453.field5890;
        for (class380 var3 = var2.field5500; var2 != var3; var3 = var3.field5500) {
            class94 var4 = (class94) var3;
            int var5 = var4.field1130 >> 12;
            int var6 = var4.field1135 >> 12;
            int var7 = var4.field1122 >> 12;
            int var8 = (this.field2742.field4881 * var7 + this.field2742.field4882 * var6 + this.field2742.field4876 * var5 >> 15) + this.field2742.field4874;
            if (var8 >= this.field2762 && var8 <= this.field2774) {
                int var9 = ((this.field2742.field4884 * var7 + this.field2742.field4885 * var5 + this.field2742.field4878 * var6 >> 15) + this.field2742.field4883) * this.field2782 / var8 + this.field2760;
                int var10 = ((this.field2742.field4880 * var7 + this.field2742.field4879 * var5 + this.field2742.field4875 * var6 >> 15) + this.field2742.field4877) * this.field2754 / var8 + this.field2771;
                if (var9 >= this.field2781 && var9 <= this.field2778 && var10 >= this.field2749 && var10 <= this.field2773) {
                    if (var8 == 0) {
                        var8 = 1;
                    }
                    this.method1325(var4, var9, var10, (var4.field1129 >> 2) / var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 2418)
    public final void method1161(Canvas arg0) {
        if (arg0 != null) {
            class281 var2 = (class281) this.field2739.method295((long) arg0.hashCode(), -122);
            if (var2 != null) {
                this.field2740 = arg0;
                this.field2735 = var2;
                if (this.field2743 == null) {
                    this.field2758 = var2.field3725;
                    this.field2761 = var2.field3721;
                    this.field2776 = var2.field3718;
                    this.method1318();
                    return;
                }
            }
        } else {
            this.field2740 = null;
            this.field2735 = null;
            if (this.field2743 == null) {
                this.field2758 = null;
                this.field2761 = this.field2776 = 1;
                this.method1318();
            }
        }
    }
}
