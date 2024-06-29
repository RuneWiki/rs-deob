import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class216 extends class162 {

    @OriginalMember(owner = "client!js", name = "s", descriptor = "Z")
    private boolean field3128;

    @OriginalMember(owner = "client!js", name = "q", descriptor = "Z")
    private boolean field3126;

    @OriginalMember(owner = "client!js", name = "r", descriptor = "Lwa;")
    private class433 field3127;

    @OriginalMember(owner = "client!js", name = "w", descriptor = "Z")
    public boolean field3132;

    @OriginalMember(owner = "client!js", name = "y", descriptor = "I")
    public int field3134;

    @OriginalMember(owner = "client!js", name = "D", descriptor = "I")
    public int field3139;

    @OriginalMember(owner = "client!js", name = "G", descriptor = "I")
    public int field3142;

    @OriginalMember(owner = "client!js", name = "K", descriptor = "I")
    public int field3146;

    @OriginalMember(owner = "client!js", name = "N", descriptor = "I")
    public int field3149;

    @OriginalMember(owner = "client!js", name = "H", descriptor = "I")
    public int field3143;

    @OriginalMember(owner = "client!js", name = "S", descriptor = "I")
    private int field3154;

    @OriginalMember(owner = "client!js", name = "J", descriptor = "I")
    public int field3145;

    @OriginalMember(owner = "client!js", name = "I", descriptor = "I")
    public int field3144;

    @OriginalMember(owner = "client!js", name = "z", descriptor = "I")
    private int field3135;

    @OriginalMember(owner = "client!js", name = "Q", descriptor = "I")
    public int field3152;

    @OriginalMember(owner = "client!js", name = "U", descriptor = "I")
    public int field3156;

    @OriginalMember(owner = "client!js", name = "T", descriptor = "I")
    public int field3155;

    @OriginalMember(owner = "client!js", name = "C", descriptor = "I")
    private int field3138;

    @OriginalMember(owner = "client!js", name = "bb", descriptor = "Z")
    private boolean field3163;

    @OriginalMember(owner = "client!js", name = "Z", descriptor = "I")
    public int field3161;

    @OriginalMember(owner = "client!js", name = "E", descriptor = "I")
    public int field3140;

    @OriginalMember(owner = "client!js", name = "A", descriptor = "I")
    public int field3136;

    @OriginalMember(owner = "client!js", name = "ab", descriptor = "I")
    public int field3162;

    @OriginalMember(owner = "client!js", name = "ib", descriptor = "I")
    private int field3170;

    @OriginalMember(owner = "client!js", name = "gb", descriptor = "Lng;")
    private class226 field3168;

    @OriginalMember(owner = "client!js", name = "mb", descriptor = "I")
    private int field3174;

    @OriginalMember(owner = "client!js", name = "M", descriptor = "Lng;")
    private class226 field3148;

    @OriginalMember(owner = "client!js", name = "x", descriptor = "Lcm;")
    public class510 field3133;

    @OriginalMember(owner = "client!js", name = "P", descriptor = "F")
    private float field3151;

    @OriginalMember(owner = "client!js", name = "R", descriptor = "F")
    private float field3153;

    @OriginalMember(owner = "client!js", name = "t", descriptor = "I")
    private int field3129;

    @OriginalMember(owner = "client!js", name = "B", descriptor = "I")
    public int field3137;

    @OriginalMember(owner = "client!js", name = "F", descriptor = "I")
    public int field3141;

    @OriginalMember(owner = "client!js", name = "L", descriptor = "I")
    public int field3147;

    @OriginalMember(owner = "client!js", name = "V", descriptor = "I")
    public int field3157;

    @OriginalMember(owner = "client!js", name = "W", descriptor = "I")
    public int field3158;

    @OriginalMember(owner = "client!js", name = "X", descriptor = "I")
    public int field3159;

    @OriginalMember(owner = "client!js", name = "Y", descriptor = "I")
    public int field3160;

    @OriginalMember(owner = "client!js", name = "cb", descriptor = "I")
    public int field3164;

    @OriginalMember(owner = "client!js", name = "fb", descriptor = "I")
    public int field3167;

    @OriginalMember(owner = "client!js", name = "hb", descriptor = "I")
    private int field3169;

    @OriginalMember(owner = "client!js", name = "jb", descriptor = "I")
    public int field3171;

    @OriginalMember(owner = "client!js", name = "lb", descriptor = "I")
    public int field3173;

    @OriginalMember(owner = "client!js", name = "v", descriptor = "Lab;")
    private class472 field3131;

    @OriginalMember(owner = "client!js", name = "eb", descriptor = "Lf;")
    private class529 field3166;

    @OriginalMember(owner = "client!js", name = "nb", descriptor = "Lf;")
    private class529 field3175;

    @OriginalMember(owner = "client!js", name = "u", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3130;

    @OriginalMember(owner = "client!js", name = "O", descriptor = "Z")
    public boolean field3150;

    @OriginalMember(owner = "client!js", name = "db", descriptor = "[I")
    public int[] field3165;

    @OriginalMember(owner = "client!js", name = "kb", descriptor = "[Lpa;")
    private class248[] field3172;

    @OriginalMember(owner = "client!js", name = "la", descriptor = "()F", line = 3)
    public final float method1026() {
        return this.field3151;
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "()V", line = 6)
    public final void method1024() {
        this.field3148.method1540(0);
    }

    @OriginalMember(owner = "client!js", name = "q", descriptor = "()V", line = 9)
    public final void method1094() {
        if (this.field3126) {
            class318.method1985((byte) 49, true, false);
            this.field3126 = false;
        }
        this.field3131 = null;
        this.field3130 = null;
        this.field3127 = null;
        this.field3128 = true;
    }

    @OriginalMember(owner = "client!js", name = "ba", descriptor = "(IIII)V", line = 21)
    public final void method1021(int arg0, int arg1, int arg2, int arg3) {
        this.field3162 = arg0;
        this.field3155 = arg1;
        this.field3145 = arg2;
    }

    @OriginalMember(owner = "client!js", name = "o", descriptor = "(FF)V", line = 26)
    public final void method1039(float arg0, float arg1) {
        this.field3151 = arg0;
        this.field3153 = arg1;
        this.method1498();
    }

    @OriginalMember(owner = "client!js", name = "fa", descriptor = "(IIII)V", line = 31)
    public final void method1120(int arg0, int arg1, int arg2, int arg3) {
        this.field3135 = this.field3155;
        this.field3162 = arg0;
        this.field3155 = arg1;
        this.field3145 = arg2;
        this.field3132 = true;
    }

    @OriginalMember(owner = "client!js", name = "c", descriptor = "(II)I", line = 39)
    public final int method1122(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!js", name = "d", descriptor = "()I", line = 43)
    public final int method1076() {
        return this.field3142;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "()V", line = 46)
    public final void method1019() {
        if (this.field3130 != null && this.field3131 != null) {
            try {
                Graphics var1 = this.field3130.getGraphics();
                this.field3131.method964((byte) -95, var1, 0, 0);
            } catch (Exception var2) {
                this.field3130.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!js", name = "l", descriptor = "()Z", line = 62)
    public final boolean method1075() {
        return false;
    }

    @OriginalMember(owner = "client!js", name = "h", descriptor = "(I)Z", line = 65)
    public final boolean method1494(int arg0) {
        return super.field2379.method838(true, arg0).field4596;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIIZ)Lf;", line = 69)
    public final class529 method1067(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field3141 * arg1 + arg0;
        int var8 = this.field3141 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field3165[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class492(this, var6, arg2, arg3);
        } else {
            return new class254(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!js", name = "pa", descriptor = "(IIII)V", line = 101)
    public final void method1098(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field3141) {
            arg2 = this.field3141;
        }
        if (arg3 > this.field3169) {
            arg3 = this.field3169;
        }
        this.field3161 = arg0;
        this.field3144 = arg2;
        this.field3156 = arg1;
        this.field3139 = arg3;
        this.method1499();
    }

    @OriginalMember(owner = "client!js", name = "NA", descriptor = "(IIIIII)V", line = 120)
    public final void method1036(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field3161) {
            arg2 -= this.field3161 - arg0;
            arg0 = this.field3161;
        }
        if (arg1 < this.field3156) {
            arg3 -= this.field3156 - arg1;
            arg1 = this.field3156;
        }
        if (arg0 + arg2 > this.field3144) {
            arg2 = this.field3144 - arg0;
        }
        if (arg1 + arg3 > this.field3139) {
            arg3 = this.field3139 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field3144 && arg1 <= this.field3139) {
            int var7 = this.field3141 - arg2;
            int var8 = this.field3141 * arg1 + arg0;
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
                            this.field3165[var24] = arg4;
                            ++var24;
                            this.field3165[var24] = arg4;
                            ++var24;
                            this.field3165[var24] = arg4;
                            ++var24;
                            this.field3165[var24] = arg4;
                            ++var24;
                            this.field3165[var24] = arg4;
                            ++var24;
                            this.field3165[var24] = arg4;
                            ++var24;
                            this.field3165[var24] = arg4;
                            ++var24;
                            this.field3165[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field3165[var24] = arg4;
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
                        int var14 = this.field3165[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + ((var14 & 65280) * var11 >> 8 & 65280);
                        this.field3165[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field3165[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field3165[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!js", name = "SA", descriptor = "(IIIIII)Z", line = 257)
    public final boolean method1105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (this.field3133.field7441 * arg2 + this.field3133.field7444 * arg1 + this.field3133.field7439 * arg0 >> 15) + this.field3133.field7443;
        if (var7 < 1) {
            var7 = 1;
        }
        int var8 = (this.field3133.field7441 * arg5 + this.field3133.field7444 * arg4 + this.field3133.field7439 * arg3 >> 15) + this.field3133.field7443;
        if (var8 < 1) {
            var8 = 1;
        }
        if ((var7 >= this.field3142 || var8 >= this.field3142) && (var7 <= this.field3138 || var8 <= this.field3138)) {
            int var9 = ((this.field3133.field7448 * arg2 + this.field3133.field7446 * arg0 + this.field3133.field7440 * arg1 >> 15) + this.field3133.field7442) * this.field3149 / var7;
            int var10 = ((this.field3133.field7448 * arg5 + this.field3133.field7446 * arg3 + this.field3133.field7440 * arg4 >> 15) + this.field3133.field7442) * this.field3149 / var8;
            if (var9 < this.field3160 && var10 < this.field3160 || var9 > this.field3157 && var10 > this.field3157) {
                return false;
            } else {
                int var11 = ((this.field3133.field7437 * arg2 + this.field3133.field7447 * arg0 + this.field3133.field7445 * arg1 >> 15) + this.field3133.field7438) * this.field3143 / var7;
                int var12 = ((this.field3133.field7437 * arg5 + this.field3133.field7447 * arg3 + this.field3133.field7445 * arg4 >> 15) + this.field3133.field7438) * this.field3143 / var8;
                return (var11 >= this.field3173 || var12 >= this.field3173) && (var11 <= this.field3164 || var12 <= this.field3164);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!js", name = "e", descriptor = "(IIIIII)V", line = 286)
    public final void method1113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method1092(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method1092(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method1023(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method1023(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field3161) {
                    var10 += (this.field3161 - arg0) * var12;
                    arg0 = this.field3161;
                }
                if (var13 >= this.field3144) {
                    var13 = this.field3144 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field3156 && var17 < this.field3139) {
                                int var18 = this.field3141 * var17 + arg0;
                                int var19 = this.field3165[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field3165[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field3156 && var21 < this.field3139) {
                                int var22 = this.field3141 * var21 + arg0;
                                int var23 = this.field3165[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field3165[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field3156 && var27 < this.field3139) {
                            this.field3165[this.field3141 * var27 + arg0] = arg4;
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
                if (arg1 < this.field3156) {
                    var29 += (this.field3156 - arg1) * var31;
                    arg1 = this.field3156;
                }
                if (var32 >= this.field3139) {
                    var32 = this.field3139 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field3161 && var46 < this.field3144) {
                            this.field3165[this.field3141 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field3161 && var36 < this.field3144) {
                            int var37 = this.field3141 * arg1 + var36;
                            int var38 = this.field3165[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field3165[this.field3141 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field3161 && var40 < this.field3144) {
                            int var41 = this.field3141 * arg1 + var40;
                            int var42 = this.field3165[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field3165[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIIIIIII)V", line = 499)
    public final void method1495(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2 != 0 && arg3 != 0) {
            if (arg5 != 65535 && !super.field2379.method838(true, arg5).field4593) {
                if (this.field3174 != arg5) {
                    class529 var10 = (class529) this.field3168.method1536((long) arg5, 0);
                    if (var10 == null) {
                        int[] var11 = this.method1501(arg5);
                        if (var11 == null) {
                            return;
                        }
                        int var12 = this.method1506(arg5) ? 64 : 128;
                        var10 = this.method1078(var11, 0, var12, var12, var12);
                        this.field3168.method1542(var10, (byte) 112, (long) arg5);
                    }
                    this.field3174 = arg5;
                    this.field3175 = var10;
                }
                this.field3175.method106(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
            } else {
                this.method1048(arg0, arg1, arg2, arg6, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!js", name = "f", descriptor = "()Z", line = 532)
    public final boolean method1037() {
        return false;
    }

    @OriginalMember(owner = "client!js", name = "c", descriptor = "(Z)V", line = 534)
    public final void method1110(boolean arg0) {
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Z)V", line = 536)
    public final void method1053(boolean arg0) {
    }

    @OriginalMember(owner = "client!js", name = "V", descriptor = "(III)V", line = 539)
    public final void method1052(int arg0, int arg1, int arg2) {
        this.field3155 = arg0 & 16777215;
        int var4 = this.field3155 >>> 16 & 255;
        if (var4 < 2) {
            var4 = 2;
        }
        int var5 = this.field3155 >> 8 & 255;
        if (var5 < 2) {
            var5 = 2;
        }
        int var6 = this.field3155 & 255;
        if (var6 < 2) {
            var6 = 2;
        }
        this.field3155 = var4 << 16 | var5 << 8 | var6;
        if (arg1 < 0) {
            this.field3150 = false;
        } else {
            this.field3150 = true;
        }
    }

    @OriginalMember(owner = "client!js", name = "y", descriptor = "()Z", line = 563)
    public final boolean method1119() {
        return false;
    }

    @OriginalMember(owner = "client!js", name = "e", descriptor = "()V", line = 565)
    public final void method1032() {
    }

    @OriginalMember(owner = "client!js", name = "s", descriptor = "()Z", line = 568)
    public final boolean method1097() {
        return true;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 571)
    public final void method1080(Rectangle[] arg0, int arg1) {
        if (this.field3130 != null && this.field3131 != null) {
            try {
                Graphics var3 = this.field3130.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field3141 && var5.y <= this.field3169 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field3131.method963(var3, (byte) 71, var5.height, var5.x, var5.width, var5.y);
                    }
                }
            } catch (Exception var6) {
                this.field3130.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!js", name = "n", descriptor = "()Z", line = 600)
    public final boolean method1088() {
        return false;
    }

    @OriginalMember(owner = "client!js", name = "A", descriptor = "()Z", line = 604)
    public final boolean method1496() {
        return this.field3128;
    }

    @OriginalMember(owner = "client!js", name = "ua", descriptor = "(F)V", line = 607)
    public final void method1111(float arg0) {
        this.field3146 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Ltl;)V", line = 609)
    public final void method1083(class436 arg0) {
    }

    @OriginalMember(owner = "client!js", name = "i", descriptor = "(I)Z", line = 612)
    public final boolean method1497(int arg0) {
        return super.field2379.method839(arg0, (byte) 29);
    }

    @OriginalMember(owner = "client!js", name = "S", descriptor = "()V", line = 615)
    public final void method1116() {
        this.field3155 = this.field3135;
        this.field3132 = false;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(II[I[I)Lea;", line = 619)
    public final class381 method1093(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class437(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!js", name = "D", descriptor = "()V", line = 622)
    private final void method1498() {
        if (this.field3153 != 0.0F) {
            float var1 = (float) this.field3138;
            float var2 = (float) this.field3142;
            float var3 = -(var2 * 2.0F * var1) / (var1 - var2);
            float var4 = this.field3151 / (this.field3153 + this.field3151);
            float var5 = var4 * var4;
            float var6 = (1.0F - var4) * -var3 * (1.0F - var4) / this.field3153;
            this.field3134 = (int) (((float) this.field3138 - var3 * var5) / ((var1 + var2) / (var1 - var2) - var6) + 0.5F);
        } else {
            this.field3134 = this.field3138;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(II)I", line = 644)
    public final int method1051(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIII)V", line = 648)
    public final void method1033(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!js", name = "E", descriptor = "()V", line = 652)
    private final void method1499() {
        this.field3160 = this.field3161 - this.field3137;
        this.field3157 = this.field3144 - this.field3137;
        this.field3173 = this.field3156 - this.field3159;
        this.field3164 = this.field3139 - this.field3159;
        for (int var1 = 0; var1 < this.field3171; ++var1) {
            class103 var5 = this.field3172[var1].field3647;
            var5.field1486 = this.field3137 - this.field3161;
            var5.field1487 = this.field3159 - this.field3156;
            var5.field1477 = this.field3144 - this.field3161;
            var5.field1489 = this.field3139 - this.field3156;
        }
        int var2 = this.field3156 * this.field3141 + this.field3161;
        for (int var3 = this.field3156; var3 < this.field3139; ++var3) {
            for (int var4 = 0; var4 < this.field3171; ++var4) {
                this.field3172[var4].field3647.field1485[var3 - this.field3156] = var2;
            }
            var2 += this.field3141;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "([Lc;Lpo;Lia;[Lvk;I)V", line = 691)
    public final void method1038(class121[] arg0, class389 arg1, class414 arg2, class247[] arg3, int arg4) {
        class112[] var6 = new class112[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class112) arg0[var7];
            }
        }
        class112 var8 = class112.method737(this, var6);
        var8.method729(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!js", name = "B", descriptor = "()Z", line = 706)
    public final boolean method1125() {
        return false;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(II[[I[[IIII)Lna;", line = 709)
    public final class35 method1061(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class174(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!js", name = "U", descriptor = "(IIIII)V", line = 712)
    public final void method1092(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field3156 && arg1 < this.field3139) {
            if (arg0 < this.field3161) {
                arg2 -= this.field3161 - arg0;
                arg0 = this.field3161;
            }
            if (arg0 + arg2 > this.field3144) {
                arg2 = this.field3144 - arg0;
            }
            int var6 = this.field3141 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field3165[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field3165[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field3165[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field3165[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field3165[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!js", name = "o", descriptor = "()V", line = 785)
    public final void method1089() {
    }

    @OriginalMember(owner = "client!js", name = "r", descriptor = "()Z", line = 788)
    public final boolean method1096() {
        return false;
    }

    @OriginalMember(owner = "client!js", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 791)
    public final void method1085(Canvas arg0) {
        if (this.field3130 == arg0) {
            this.method1066((Canvas) null);
        }
        class472 var2 = (class472) this.field3127.method2605(false, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method2049(-67);
        }
    }

    @OriginalMember(owner = "client!js", name = "va", descriptor = "()V", line = 801)
    public final void method1112() {
        this.field3161 = 0;
        this.field3156 = 0;
        this.field3144 = this.field3141;
        this.field3139 = this.field3169;
        this.method1499();
    }

    @OriginalMember(owner = "client!js", name = "c", descriptor = "()Z", line = 808)
    public final boolean method1025() {
        return false;
    }

    @OriginalMember(owner = "client!js", name = "j", descriptor = "(ILea;II)V", line = 812)
    public final void method1034(int arg0, class381 arg1, int arg2, int arg3) {
        class437 var5 = (class437) arg1;
        int[] var6 = var5.field6532;
        int[] var7 = var5.field6529;
        int var8;
        if (this.field3139 < var6.length + arg3) {
            var8 = this.field3139 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field3156 > arg3) {
            var9 = this.field3156 - arg3;
            arg3 = this.field3156;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field3141 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field3161 > var12) {
                    var13 -= this.field3161 - var12;
                    var12 = this.field3161;
                }
                if (this.field3144 < var12 + var13) {
                    var13 = this.field3144 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field3165[var14++] = arg0;
                }
                var10 += this.field3141;
            }
        }
    }

    @OriginalMember(owner = "client!js", name = "u", descriptor = "([I)V", line = 869)
    public final void method1062(int[] arg0) {
        arg0[0] = this.field3161;
        arg0[1] = this.field3156;
        arg0[2] = this.field3144;
        arg0[3] = this.field3139;
    }

    @OriginalMember(owner = "client!js", name = "e", descriptor = "(I)V", line = 876)
    public final void method1103(int arg0) {
        this.field3172[arg0].method1663(Thread.currentThread(), (byte) 82);
    }

    @OriginalMember(owner = "client!js", name = "w", descriptor = "()F", line = 879)
    public final float method1020() {
        return this.field3153;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIIIF)Lkt;", line = 882)
    public final class107 method1084(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(IIIIII)Ltl;", line = 885)
    public final class436 method1065(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Lar;III)V", line = 889)
    public final void method1500(class479 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0.field7036;
        int var6 = arg3 >> 1;
        if (var5 == -1) {
            this.method1048(arg1, arg2, var6, arg0.field7039, 1);
        } else {
            if (this.field3174 != var5) {
                class529 var7 = (class529) this.field3168.method1536((long) var5, 0);
                if (var7 == null) {
                    int[] var8 = this.method1501(var5);
                    if (var8 == null) {
                        return;
                    }
                    int var9 = this.method1506(var5) ? 64 : 128;
                    var7 = this.method1078(var8, 0, var9, var9, var9);
                    this.field3168.method1542(var7, (byte) 112, (long) var5);
                }
                this.field3174 = var5;
                this.field3175 = var7;
            }
            if (this.field3175.method105() == 64) {
                arg3 <<= 1;
                var6 <<= 1;
            }
            this.field3175.method106(arg1 - var6, arg2 - var6, arg3, arg3, 0, arg0.field7039, 1);
        }
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(I)V", line = 933)
    public final void method1035(int arg0) {
        int var2 = arg0 - this.field3129;
        for (Object var3 = this.field3148.method1545(-29); var3 != null; var3 = this.field3148.method1538((byte) -109)) {
            class161 var4 = (class161) var3;
            if (var4.field2358) {
                var4.field2363 += var2;
                int var5 = var4.field2363 / 20;
                if (var5 > 0) {
                    class321 var6 = super.field2379.method838(true, var4.field2362);
                    var4.method1017(var6.field4583 * var2 * 50 / 1000, var6.field4581 * var2 * 50 / 1000);
                    var4.field2363 -= var5 * 20;
                }
                var4.field2358 = false;
            }
        }
        this.field3129 = arg0;
        this.field3168.method1534(0, 5);
    }

    @OriginalMember(owner = "client!js", name = "IA", descriptor = "(IIII)[I", line = 965)
    public final int[] method1063(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field3141 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field3165[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!js", name = "z", descriptor = "()Z", line = 990)
    public final boolean method1121() {
        return false;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "([Lc;Lia;[Lvk;I)V", line = 994)
    public final void method1031(class121[] arg0, class414 arg1, class247[] arg2, int arg3) {
        class112[] var5 = new class112[arg0.length];
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class112) arg0[var6];
            }
        }
        class112 var7 = class112.method737(this, var5);
        var7.method729(arg1, arg2 != null ? arg2[0] : null, (class389) null, arg3);
    }

    @OriginalMember(owner = "client!js", name = "j", descriptor = "(I)[I", line = 1010)
    private final int[] method1501(int arg0) {
        class226 var2 = this.field3148;
        class161 var3;
        synchronized (this.field3148) {
            var3 = (class161) this.field3148.method1536((long) arg0, 0);
            if (var3 == null) {
                if (!super.field2379.method839(arg0, (byte) 76)) {
                    return null;
                }
                class321 var5 = super.field2379.method838(true, arg0);
                int var6 = !var5.field4590 && !this.field3163 ? 128 : 64;
                var3 = new class161(arg0, var6, super.field2379.method836(true, var6, var6, 41, arg0, 0.7F), var5.field4605);
                this.field3148.method1542(var3, (byte) 112, (long) arg0);
            }
        }
        var3.field2358 = true;
        return var3.method1016();
    }

    @OriginalMember(owner = "client!js", name = "aa", descriptor = "(IIIIII[BII)V", line = 1030)
    public final void method1059(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field3141 * arg1 + arg0;
            int var15 = this.field3141 - arg2;
            if (arg1 + arg3 > this.field3139) {
                arg3 -= arg1 + arg3 - this.field3139;
            }
            if (arg1 < this.field3156) {
                int var16 = this.field3156 - arg1;
                arg3 -= var16;
                var14 += this.field3141 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field3144) {
                int var17 = arg0 + arg2 - this.field3144;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field3161) {
                int var18 = this.field3161 - arg0;
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
                            int var28 = this.field3165[var14];
                            this.field3165[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field3165[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field3165[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field3165[var14++] = arg5;
                        } else {
                            this.field3165[var14++] = arg4;
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

    @OriginalMember(owner = "client!js", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 1206)
    public final void method1071(Canvas arg0) {
        class472 var2 = (class472) this.field3127.method2605(false, (long) arg0.hashCode());
        if (var2 == null) {
            class472 var3 = class279.method1819(true, arg0);
            this.field3127.method2606(var3, (long) arg0.hashCode(), 0);
        }
    }

    @OriginalMember(owner = "client!js", name = "k", descriptor = "()Z", line = 1215)
    public final boolean method1073() {
        return false;
    }

    @OriginalMember(owner = "client!js", name = "c", descriptor = "(I)V", line = 1218)
    public final void method1043(int arg0) {
        if (this.field3171 != arg0) {
            this.field3171 = arg0;
            this.field3172 = new class248[this.field3171];
            for (int var2 = 0; var2 < this.field3171; ++var2) {
                this.field3172[var2] = new class248(this);
            }
        }
    }

    @OriginalMember(owner = "client!js", name = "m", descriptor = "()Z", line = 1234)
    public final boolean method1079() {
        return true;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIIIIIIII)V", line = 1238)
    public final void method1101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class248 var11 = this.method1504(Thread.currentThread());
        class103 var12 = var11.field3647;
        var12.field1483 = false;
        int var13 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var13 == 255) {
            var12.field1483 = false;
            var12.field1488 = 0;
            var12.field1481 = true;
            var12.method628(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else {
            if (arg9 != 1) {
                if (arg9 == 2) {
                    throw new IllegalStateException();
                }
                throw new IllegalArgumentException();
            }
            var12.field1483 = false;
            var12.field1488 = 255 - var13;
            var12.field1481 = true;
            var12.method628(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        }
        var12.field1483 = true;
    }

    @OriginalMember(owner = "client!js", name = "F", descriptor = "()V", line = 1274)
    private final void method1502() {
        for (int var1 = 0; var1 < this.field3171; ++var1) {
            this.field3172[var1].method1666(0);
        }
        this.method1112();
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(FFF)V", line = 1281)
    public final void method1040(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Lpo;)V", line = 1285)
    public final void method1095(class389 arg0) {
        class525 var2 = arg0.field5869.field3052;
        for (class525 var3 = var2.field7768; var2 != var3; var3 = var3.field7768) {
            class479 var4 = (class479) var3;
            int var5 = var4.field7041 >> 12;
            int var6 = var4.field7030 >> 12;
            int var7 = var4.field7031 >> 12;
            int var8 = (this.field3133.field7441 * var7 + this.field3133.field7444 * var6 + this.field3133.field7439 * var5 >> 15) + this.field3133.field7443;
            if (var8 >= this.field3142 && var8 <= this.field3136) {
                int var9 = ((this.field3133.field7448 * var7 + this.field3133.field7446 * var5 + this.field3133.field7440 * var6 >> 15) + this.field3133.field7442) * this.field3149 / var8 + this.field3137;
                int var10 = ((this.field3133.field7437 * var7 + this.field3133.field7447 * var5 + this.field3133.field7445 * var6 >> 15) + this.field3133.field7438) * this.field3143 / var8 + this.field3159;
                if (var9 >= this.field3161 && var9 <= this.field3144 && var10 >= this.field3156 && var10 <= this.field3139) {
                    if (var8 == 0) {
                        var8 = 1;
                    }
                    this.method1500(var4, var9, var10, (var4.field7032 >> 2) / var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIIIII)V", line = 1323)
    public final void method1047(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class248 var8 = this.method1504(Thread.currentThread());
        class103 var9 = var8.field3647;
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
            int var21 = arg0 - var9.method630();
            int var22 = arg1 - var9.method631();
            int var23 = var17 + var21;
            int var24 = var21 - var18;
            int var25 = var10 + var21 - var18;
            int var26 = var10 + var21 + var17;
            int var27 = var19 + var22;
            int var28 = var22 - var20;
            int var29 = var11 + var22 - var20;
            int var30 = var11 + var22 + var19;
            if (arg6 == 0) {
                var9.field1488 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field1488 = 255 - (arg4 >> 24);
            }
            var9.field1481 = var23 < 0 || var23 > var9.field1477 || var24 < 0 || var24 > var9.field1477 || var25 < 0 || var25 > var9.field1477;
            var9.method635(var27, var28, var29, var23, var24, var25, arg4);
            var9.field1481 = var23 < 0 || var23 > var9.field1477 || var24 < 0 || var24 > var9.field1477 || var26 < 0 || var26 > var9.field1477;
            var9.method635(var27, var29, var30, var23, var25, var26, arg4);
        }
    }

    @OriginalMember(owner = "client!js", name = "j", descriptor = "()I", line = 1392)
    public final int method1056() {
        return 0;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Ll;)V", line = 1394)
    public final void method1117(class16 arg0) {
    }

    @OriginalMember(owner = "client!js", name = "M", descriptor = "(I)V", line = 1397)
    public final void method1044(int arg0) {
        this.method1036(0, 0, this.field3141, this.field3169, arg0, 0);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIIIILea;II)V", line = 1401)
    public final void method1058(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class381 arg6, int arg7, int arg8) {
        class437 var10 = (class437) arg6;
        int[] var11 = var10.field6532;
        int[] var12 = var10.field6529;
        int var13 = this.field3156 > arg8 ? this.field3156 : arg8;
        int var14 = this.field3139 < var11.length + arg8 ? this.field3139 : var11.length + arg8;
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
            if (arg0 < this.field3161) {
                var18 += (this.field3161 - arg0) * var20;
                arg0 = this.field3161;
            }
            if (var21 >= this.field3144) {
                var21 = this.field3144 - 1;
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
                                int var28 = this.field3141 * var25 + arg0;
                                int var29 = this.field3165[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field3165[var28] = var23 + var30;
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
                                int var34 = this.field3141 * var31 + arg0;
                                int var35 = this.field3165[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field3165[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field3165[this.field3141 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field3161 && var64 < this.field3144 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field3165[this.field3141 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field3161 && var50 < this.field3144 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field3141 * arg1 + var50;
                        int var54 = this.field3165[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field3165[this.field3141 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field3161 && var56 < this.field3144 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field3141 * arg1 + var56;
                        int var60 = this.field3165[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field3165[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!js", name = "t", descriptor = "()Z", line = 1639)
    public final boolean method1106() {
        return true;
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 1642)
    public final void method1066(Canvas arg0) {
        if (arg0 != null) {
            class472 var2 = (class472) this.field3127.method2605(false, (long) arg0.hashCode());
            if (var2 != null) {
                this.field3130 = arg0;
                this.field3131 = var2;
                if (this.field3166 == null) {
                    this.field3165 = var2.field6950;
                    this.field3141 = var2.field6952;
                    this.field3169 = var2.field6953;
                    this.method1502();
                    return;
                }
            }
        } else {
            this.field3130 = null;
            this.field3131 = null;
            if (this.field3166 == null) {
                this.field3165 = null;
                this.field3141 = this.field3169 = 1;
                this.method1502();
            }
        }
    }

    @OriginalMember(owner = "client!js", name = "O", descriptor = "(IIIII)V", line = 1676)
    public final void method1048(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field3156) {
            var6 = this.field3156;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field3139) {
            var7 = this.field3139;
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
                if (var64 < this.field3161) {
                    var64 = this.field3161;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field3144) {
                    var65 = this.field3144;
                }
                int var66 = this.field3141 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field3165[var66++] = arg3;
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
                if (var60 < this.field3161) {
                    var60 = this.field3161;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field3144 - 1) {
                    var61 = this.field3144 - 1;
                }
                int var62 = this.field3141 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field3165[var62++] = arg3;
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
                if (var28 < this.field3161) {
                    var28 = this.field3161;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field3144) {
                    var29 = this.field3144;
                }
                int var30 = this.field3141 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field3165[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field3165[var30++] = var15 + var33;
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
                if (var22 < this.field3161) {
                    var22 = this.field3161;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field3144 - 1) {
                    var23 = this.field3144 - 1;
                }
                int var24 = this.field3141 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field3165[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field3165[var24++] = var15 + var27;
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
                if (var47 < this.field3161) {
                    var47 = this.field3161;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field3144) {
                    var48 = this.field3144;
                }
                int var49 = this.field3141 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field3165[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field3165[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field3161) {
                    var39 = this.field3161;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field3144 - 1) {
                    var40 = this.field3144 - 1;
                }
                int var41 = this.field3141 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field3165[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field3165[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I[Lkt;)V", line = 1961)
    public final void method1068(int arg0, class107[] arg1) {
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)Ll;", line = 1964)
    public final class16 method1028(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!js", name = "k", descriptor = "(I)[I", line = 1968)
    public final int[] method1503(int arg0) {
        class226 var2 = this.field3148;
        class161 var3;
        synchronized (this.field3148) {
            var3 = (class161) this.field3148.method1536((long) arg0, 0);
            if (var3 == null) {
                if (!super.field2379.method839(arg0, (byte) 104)) {
                    return null;
                }
                class321 var5 = super.field2379.method838(true, arg0);
                int var6 = !var5.field4590 && !this.field3163 ? 128 : 64;
                var3 = new class161(arg0, var6, super.field2379.method837(var6, true, var6, 0.7F, (byte) -69, arg0), var5.field4605);
                this.field3148.method1542(var3, (byte) 112, (long) arg0);
            }
        }
        var3.field2358 = true;
        return var3.method1016();
    }

    @OriginalMember(owner = "client!js", name = "d", descriptor = "(I)V", line = 1988)
    public final void method1100(int arg0) {
        this.field3172[arg0].method1663((Runnable) null, (byte) 18);
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(Z)V", line = 1991)
    public final void method1070(boolean arg0) {
        this.field3163 = arg0;
        this.field3148.method1540(0);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 1997)
    public final void method1042(Canvas arg0) {
        class472 var2 = (class472) this.field3127.method2605(false, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method2049(-68);
            class472 var3 = class279.method1819(true, arg0);
            this.field3127.method2606(var3, (long) arg0.hashCode(), 0);
            if (this.field3130 == arg0 && this.field3166 == null) {
                this.field3131 = var3;
                this.field3165 = var3.field6950;
                this.field3141 = var3.field6952;
                this.field3169 = var3.field6953;
                this.method1502();
            }
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Ljava/lang/Runnable;)Lpa;", line = 2018)
    public final class248 method1504(Runnable arg0) {
        for (int var2 = 0; var2 < this.field3171; ++var2) {
            if (this.field3172[var2].field3643 == arg0) {
                return this.field3172[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!js", name = "ia", descriptor = "(III[I)V", line = 2031)
    public final void method1074(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (this.field3133.field7441 * arg2 + this.field3133.field7444 * arg1 + this.field3133.field7439 * arg0 >> 15) + this.field3133.field7443;
        if (var5 >= this.field3142 && var5 <= this.field3138) {
            int var6 = ((this.field3133.field7448 * arg2 + this.field3133.field7446 * arg0 + this.field3133.field7440 * arg1 >> 15) + this.field3133.field7442) * this.field3149 / var5;
            int var7 = ((this.field3133.field7437 * arg2 + this.field3133.field7447 * arg0 + this.field3133.field7445 * arg1 >> 15) + this.field3133.field7438) * this.field3143 / var5;
            if (var6 >= this.field3160 && var6 <= this.field3157 && var7 >= this.field3173 && var7 <= this.field3164) {
                arg3[0] = var6 - this.field3160;
                arg3[1] = var7 - this.field3173;
                arg3[2] = var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!js", name = "na", descriptor = "(I)V", line = 2055)
    public final void method1022(int arg0) {
    }

    @OriginalMember(owner = "client!js", name = "g", descriptor = "(I)V", line = 2057)
    public final void method1123(int arg0) {
    }

    @OriginalMember(owner = "client!js", name = "m", descriptor = "(Lia;)V", line = 2061)
    public final void method1082(class414 arg0) {
        this.field3133 = (class510) arg0;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Lje;[Lgu;Z)Loa;", line = 2066)
    public final class489 method1081(class275 arg0, class408[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field6147;
            var5[var7] = arg1[var7].field6151;
            if (arg1[var7].field6149 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            return new class53(this, arg0, arg1, var4, var5);
        } else if (var6) {
            return new class311(this, arg0, arg1, var4, var5);
        } else {
            return new class516(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!js", name = "GA", descriptor = "(IIII)V", line = 2095)
    public final void method1050(int arg0, int arg1, int arg2, int arg3) {
        this.field3137 = arg0;
        this.field3159 = arg1;
        this.field3149 = arg2;
        this.field3143 = arg3;
        this.method1499();
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Lgu;Z)Lf;", line = 2104)
    public final class529 method1030(class408 arg0, boolean arg1) {
        int[] var3 = arg0.field6152;
        byte[] var4 = arg0.field6146;
        int var5 = arg0.field6147;
        int var6 = arg0.field6151;
        class368 var11;
        if (arg1 && arg0.field6149 == null) {
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
            var11 = new class240(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field6149;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class492(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var21 = var5 * var19;
                    for (int var22 = 0; var22 < var5; ++var22) {
                        var14[var21 + var22] = var3[var4[var21 + var22] & 255];
                    }
                }
                new class492(this, var14, var5, var6);
                var11 = new class254(this, var14, var5, var6);
            }
        }
        var11.method96(arg0.field6148, arg0.field6144, arg0.field6150, arg0.field6145);
        return var11;
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lm;)V", line = 2208)
    public class216(int arg0, Canvas arg1, class126 arg2) {
        this(arg0, arg2);
        this.method1071(arg1);
        this.method1066(arg1);
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(ILm;)V", line = 2219)
    private class216(int arg0, class126 arg1) {
        super(arg0, arg1);
        this.field3128 = false;
        this.field3126 = false;
        this.field3127 = new class433(4);
        this.field3132 = false;
        this.field3134 = 3500;
        this.field3139 = 0;
        this.field3142 = 50;
        this.field3146 = 75518;
        this.field3149 = 512;
        this.field3143 = 512;
        this.field3154 = 0;
        this.field3145 = 0;
        this.field3144 = 0;
        this.field3135 = 0;
        this.field3152 = 45823;
        this.field3156 = 0;
        this.field3155 = 0;
        this.field3138 = 3500;
        this.field3163 = false;
        this.field3161 = 0;
        this.field3140 = 78642;
        this.field3136 = this.field3138 - 255;
        this.field3162 = 0;
        this.field3170 = 0;
        this.field3168 = new class226(16);
        this.field3174 = -1;
        this.field3148 = new class226(20);
        this.field3133 = new class510();
        this.method1043(1);
        this.method1103(0);
        class493.method2956(127, true, false);
        this.field3126 = true;
    }

    @OriginalMember(owner = "client!js", name = "v", descriptor = "()Z", line = 2228)
    public final boolean method1109() {
        return false;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "([IIIII)Lf;", line = 2233)
    public final class529 method1078(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class492(this, arg0, arg1, arg2, arg3, arg4) : new class254(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class492(this, arg0, arg1, arg2, arg3, arg4) : new class254(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!js", name = "C", descriptor = "()Lia;", line = 2268)
    public final class414 method1126() {
        return new class510();
    }

    @OriginalMember(owner = "client!js", name = "FA", descriptor = "()I", line = 2271)
    public final int method1114() {
        return 0;
    }

    @OriginalMember(owner = "client!js", name = "JA", descriptor = "(II)V", line = 2274)
    public final void method1102(int arg0, int arg1) {
        this.field3142 = arg0;
        this.field3138 = arg1;
        this.field3136 = this.field3138 - 255;
        this.method1498();
    }

    @OriginalMember(owner = "client!js", name = "XA", descriptor = "(IFFFFF)V", line = 2281)
    public final void method1049(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field3152 = (int) (arg1 * 65535.0F);
        this.field3140 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field3147 = (int) (arg3 * 65535.0F / var7);
        this.field3167 = (int) (arg4 * 65535.0F / var7);
        this.field3158 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!js", name = "xa", descriptor = "()I", line = 2291)
    public final int method1057() {
        int var1 = this.field3154;
        this.field3154 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!js", name = "x", descriptor = "()Lia;", line = 2301)
    public final class414 method1115() {
        class248 var1 = this.method1504(Thread.currentThread());
        return var1.field3638;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Ltl;Ltl;FLtl;)Ltl;", line = 2305)
    public final class436 method1086(class436 arg0, class436 arg1, float arg2, class436 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!js", name = "p", descriptor = "()Z", line = 2308)
    public final boolean method1091() {
        return false;
    }

    @OriginalMember(owner = "client!js", name = "i", descriptor = "()V", line = 2310)
    public final void method1054() {
    }

    @OriginalMember(owner = "client!js", name = "g", descriptor = "()I", line = 2314)
    public final int method1099() {
        int var1 = this.field3170;
        this.field3170 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!js", name = "h", descriptor = "()V", line = 2318)
    public final void method1041() {
    }

    @OriginalMember(owner = "client!js", name = "Z", descriptor = "(IIII)V", line = 2321)
    public final void method1069(int arg0, int arg1, int arg2, int arg3) {
        if (this.field3161 < arg0) {
            this.field3161 = arg0;
        }
        if (this.field3156 < arg1) {
            this.field3156 = arg1;
        }
        if (this.field3144 > arg2) {
            this.field3144 = arg2;
        }
        if (this.field3139 > arg3) {
            this.field3139 = arg3;
        }
        this.method1499();
    }

    @OriginalMember(owner = "client!js", name = "W", descriptor = "()I", line = 2336)
    public final int method1060() {
        return this.field3138;
    }

    @OriginalMember(owner = "client!js", name = "d", descriptor = "(IIIIII)V", line = 2339)
    public final void method1104(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1092(arg0, arg1, arg2, arg4, arg5);
        this.method1092(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method1023(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method1023(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Lqc;IIII)Lc;", line = 2345)
    public final class121 method1118(class521 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class112(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!js", name = "u", descriptor = "()Z", line = 2348)
    public final boolean method1107() {
        return true;
    }

    @OriginalMember(owner = "client!js", name = "da", descriptor = "(IIIII)V", line = 2351)
    public final void method1023(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field3161 && arg0 < this.field3144) {
            if (arg1 < this.field3156) {
                arg2 -= this.field3156 - arg1;
                arg1 = this.field3156;
            }
            if (arg1 + arg2 > this.field3139) {
                arg2 = this.field3139 - arg1;
            }
            int var6 = this.field3141 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field3141 * var10 + var6;
                        int var12 = this.field3165[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field3165[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field3141 * var14 + var6;
                        int var16 = this.field3165[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field3165[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field3165[this.field3141 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!js", name = "l", descriptor = "(I)I", line = 2429)
    public final int method1505(int arg0) {
        return super.field2379.method838(true, arg0).field4602 & 65535;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Lc;Lpo;Lia;Lvk;I)V", line = 2432)
    public final void method1055(class121 arg0, class389 arg1, class414 arg2, class247 arg3, int arg4) {
        ((class112) arg0).method729(arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!js", name = "m", descriptor = "(I)Z", line = 2435)
    public final boolean method1506(int arg0) {
        return this.field3163 || super.field2379.method838(true, arg0).field4590;
    }
}
