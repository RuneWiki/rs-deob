import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class283 extends class281 {

    @OriginalMember(owner = "client!kp", name = "r", descriptor = "I")
    public int field3869 = 0;

    @OriginalMember(owner = "client!kp", name = "t", descriptor = "Z")
    public boolean field3871 = false;

    @OriginalMember(owner = "client!kp", name = "H", descriptor = "I")
    public int field3885 = 0;

    @OriginalMember(owner = "client!kp", name = "y", descriptor = "I")
    public int field3876 = 0;

    @OriginalMember(owner = "client!kp", name = "x", descriptor = "I")
    public int field3875 = 0;

    @OriginalMember(owner = "client!kp", name = "O", descriptor = "I")
    public int field3892 = 50;

    @OriginalMember(owner = "client!kp", name = "A", descriptor = "I")
    public int field3878 = 78642;

    @OriginalMember(owner = "client!kp", name = "s", descriptor = "I")
    private int field3870 = 0;

    @OriginalMember(owner = "client!kp", name = "z", descriptor = "I")
    public int field3877 = 0;

    @OriginalMember(owner = "client!kp", name = "R", descriptor = "I")
    private int field3895 = 0;

    @OriginalMember(owner = "client!kp", name = "w", descriptor = "Z")
    private boolean field3874 = false;

    @OriginalMember(owner = "client!kp", name = "db", descriptor = "I")
    public int field3906 = 45823;

    @OriginalMember(owner = "client!kp", name = "B", descriptor = "I")
    public int field3879 = 3500;

    @OriginalMember(owner = "client!kp", name = "S", descriptor = "I")
    public int field3896 = 0;

    @OriginalMember(owner = "client!kp", name = "Y", descriptor = "I")
    private int field3901 = 3500;

    @OriginalMember(owner = "client!kp", name = "T", descriptor = "I")
    public int field3897 = 75518;

    @OriginalMember(owner = "client!kp", name = "Z", descriptor = "I")
    public int field3902 = this.field3901 - 255;

    @OriginalMember(owner = "client!kp", name = "v", descriptor = "I")
    public int field3873 = 0;

    @OriginalMember(owner = "client!kp", name = "lb", descriptor = "Z")
    private boolean field3914 = false;

    @OriginalMember(owner = "client!kp", name = "N", descriptor = "I")
    private int field3891 = 0;

    @OriginalMember(owner = "client!kp", name = "gb", descriptor = "I")
    public int field3909 = 512;

    @OriginalMember(owner = "client!kp", name = "I", descriptor = "I")
    public int field3886 = 512;

    @OriginalMember(owner = "client!kp", name = "ib", descriptor = "Z")
    private boolean field3911 = false;

    @OriginalMember(owner = "client!kp", name = "M", descriptor = "Lng;")
    private class190 field3890 = new class190(16);

    @OriginalMember(owner = "client!kp", name = "E", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3882;

    @OriginalMember(owner = "client!kp", name = "X", descriptor = "Lsr;")
    public class136 field3900;

    @OriginalMember(owner = "client!kp", name = "G", descriptor = "Lra;")
    private class57 field3884;

    @OriginalMember(owner = "client!kp", name = "cb", descriptor = "[I")
    public int[] field3905;

    @OriginalMember(owner = "client!kp", name = "P", descriptor = "I")
    public int field3893;

    @OriginalMember(owner = "client!kp", name = "J", descriptor = "I")
    private int field3887;

    @OriginalMember(owner = "client!kp", name = "L", descriptor = "F")
    private float field3889;

    @OriginalMember(owner = "client!kp", name = "W", descriptor = "F")
    private float field3899;

    @OriginalMember(owner = "client!kp", name = "u", descriptor = "I")
    public int field3872;

    @OriginalMember(owner = "client!kp", name = "F", descriptor = "I")
    public int field3883;

    @OriginalMember(owner = "client!kp", name = "Q", descriptor = "I")
    public int field3894;

    @OriginalMember(owner = "client!kp", name = "V", descriptor = "I")
    public int field3898;

    @OriginalMember(owner = "client!kp", name = "ab", descriptor = "I")
    public int field3903;

    @OriginalMember(owner = "client!kp", name = "eb", descriptor = "I")
    public int field3907;

    @OriginalMember(owner = "client!kp", name = "fb", descriptor = "I")
    public int field3908;

    @OriginalMember(owner = "client!kp", name = "hb", descriptor = "I")
    public int field3910;

    @OriginalMember(owner = "client!kp", name = "jb", descriptor = "I")
    private int field3912;

    @OriginalMember(owner = "client!kp", name = "kb", descriptor = "I")
    public int field3913;

    @OriginalMember(owner = "client!kp", name = "mb", descriptor = "I")
    public int field3915;

    @OriginalMember(owner = "client!kp", name = "bb", descriptor = "Lng;")
    private class190 field3904;

    @OriginalMember(owner = "client!kp", name = "nb", descriptor = "Lna;")
    private class30 field3916;

    @OriginalMember(owner = "client!kp", name = "D", descriptor = "Lji;")
    public class363 field3881;

    @OriginalMember(owner = "client!kp", name = "K", descriptor = "Z")
    public boolean field3888;

    @OriginalMember(owner = "client!kp", name = "C", descriptor = "[Lkj;")
    private class336[] field3880;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIIZ)Llf;", line = 4)
    public final class130 method1751(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field3893 * arg1 + arg0;
        int var8 = this.field3893 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field3905[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class348(this, var6, arg2, arg3);
        } else {
            return new class119(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!kp", name = "F", descriptor = "()Z", line = 36)
    public final boolean method1806() {
        return false;
    }

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "(IIIIII)V", line = 39)
    public final void method1752(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method1771(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method1771(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method1810(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method1810(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field3877) {
                    var10 += (this.field3877 - arg0) * var12;
                    arg0 = this.field3877;
                }
                if (var13 >= this.field3896) {
                    var13 = this.field3896 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field3885 && var17 < this.field3873) {
                                int var18 = this.field3893 * var17 + arg0;
                                int var19 = this.field3905[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field3905[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field3885 && var21 < this.field3873) {
                                int var22 = this.field3893 * var21 + arg0;
                                int var23 = this.field3905[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field3905[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field3885 && var27 < this.field3873) {
                            this.field3905[this.field3893 * var27 + arg0] = arg4;
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
                if (arg1 < this.field3885) {
                    var29 += (this.field3885 - arg1) * var31;
                    arg1 = this.field3885;
                }
                if (var32 >= this.field3873) {
                    var32 = this.field3873 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field3877 && var46 < this.field3896) {
                            this.field3905[this.field3893 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field3877 && var36 < this.field3896) {
                            int var37 = this.field3893 * arg1 + var36;
                            int var38 = this.field3905[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field3905[this.field3893 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field3877 && var40 < this.field3896) {
                            int var41 = this.field3893 * arg1 + var40;
                            int var42 = this.field3905[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field3905[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "([Lhc;Lci;[Lbd;I)V", line = 253)
    public final void method1770(class75[] arg0, class261 arg1, class38[] arg2, int arg3) {
        class239[] var5 = new class239[arg0.length];
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class239) arg0[var6];
            }
        }
        class239 var7 = class239.method1500(this, var5);
        var7.method1509(arg1, arg2 != null ? arg2[0] : null, (class260) null, arg3);
    }

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "(IIIIII)Lvm;", line = 268)
    public final class407 method1818(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "()Z", line = 272)
    public final boolean method1728() {
        return true;
    }

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "(I)Ler;", line = 277)
    public final class55 method1760(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "()V", line = 280)
    private final void method1830() {
        this.field3883 = this.field3877 - this.field3910;
        this.field3903 = this.field3896 - this.field3910;
        this.field3913 = this.field3885 - this.field3915;
        this.field3907 = this.field3873 - this.field3915;
        for (int var1 = 0; var1 < this.field3894; ++var1) {
            class335 var5 = this.field3880[var1].field4535;
            var5.field4531 = this.field3910 - this.field3877;
            var5.field4522 = this.field3915 - this.field3885;
            var5.field4529 = this.field3896 - this.field3877;
            var5.field4521 = this.field3873 - this.field3885;
        }
        int var2 = this.field3893 * this.field3885 + this.field3877;
        for (int var3 = this.field3885; var3 < this.field3873; ++var3) {
            for (int var4 = 0; var4 < this.field3894; ++var4) {
                this.field3880[var4].field4535.field4526[var3 - this.field3885] = var2;
            }
            var2 += this.field3893;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "([I)V", line = 320)
    public final void method1796(int[] arg0) {
        arg0[0] = this.field3877;
        arg0[1] = this.field3885;
        arg0[2] = this.field3896;
        arg0[3] = this.field3873;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Ler;)V", line = 325)
    public final void method1823(class55 arg0) {
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(II)V", line = 328)
    public final void method1765(int arg0, int arg1) {
        this.field3892 = arg0;
        this.field3901 = arg1;
        this.field3902 = this.field3901 - 255;
        this.method1835();
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lap;IIII)Lhc;", line = 335)
    public final class75 method1736(class279 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class239(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(III)V", line = 338)
    public final void method1766(int arg0, int arg1, int arg2) {
        this.field3876 = arg0;
        this.field3875 = arg1;
        this.field3869 = arg2;
    }

    @OriginalMember(owner = "client!kp", name = "r", descriptor = "()Z", line = 344)
    public final boolean method1759() {
        return true;
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lsr;I)V", line = 2419)
    public class283(Canvas arg0, class136 arg1, int arg2) {
        this.field3882 = arg0;
        this.field3900 = arg1;
        super.field3847 = arg2;
        this.field3884 = class57.method383(this.field3882, 1);
        this.field3905 = this.field3884.field819;
        this.field3893 = this.field3884.field816;
        this.field3887 = this.field3884.field820;
        this.method1831();
    }

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "()Z", line = 357)
    public final boolean method1723() {
        return false;
    }

    @OriginalMember(owner = "client!kp", name = "A", descriptor = "()Z", line = 360)
    public final boolean method1790() {
        return false;
    }

    @OriginalMember(owner = "client!kp", name = "K", descriptor = "()V", line = 363)
    public final void method1816() {
    }

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "(I)V", line = 366)
    public final void method1794(int arg0) {
        this.method1785(0, 0, this.field3893, this.field3887, arg0, 0);
    }

    @OriginalMember(owner = "client!kp", name = "l", descriptor = "()Z", line = 369)
    public final boolean method1746() {
        return false;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lqd;)V", line = 374)
    public final void method1737(class260 arg0) {
        class299 var2 = arg0.field3559.field6401;
        for (class299 var3 = var2.field4138; var2 != var3; var3 = var3.field4138) {
            class446 var4 = (class446) var3;
            int var5 = var4.field6432 >> 12;
            int var6 = var4.field6427 >> 12;
            int var7 = var4.field6430 >> 12;
            int var8 = (this.field3881.field5094 * var7 + this.field3881.field5093 * var6 + this.field3881.field5090 * var5 >> 15) + this.field3881.field5092;
            if (var8 >= this.field3892 && var8 <= this.field3901) {
                int var9 = ((this.field3881.field5095 * var7 + this.field3881.field5097 * var6 + this.field3881.field5096 * var5 >> 15) + this.field3881.field5089) * this.field3909 / var8 + this.field3910;
                int var10 = ((this.field3881.field5088 * var7 + this.field3881.field5099 * var5 + this.field3881.field5091 * var6 >> 15) + this.field3881.field5098) * this.field3886 / var8 + this.field3915;
                if (var9 >= this.field3877 && var9 <= this.field3896 && var10 >= this.field3885 && var10 <= this.field3873) {
                    if (var8 == 0) {
                        var8 = 1;
                    }
                    this.method1841(var4, var9, var10, (var4.field6426 >> 2) / var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "t", descriptor = "()F", line = 410)
    public final float method1767() {
        return this.field3899;
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "()V", line = 416)
    private final void method1831() {
        this.field3904 = new class190(20);
        this.field3881 = new class363();
        class396.method2566(true, false, -16653);
        this.field3911 = true;
        this.method1801(1);
        this.method1798(0);
        this.method1812();
    }

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "(I)Z", line = 425)
    public final boolean method1832(int arg0) {
        return this.field3874 || this.field3900.method607(false, arg0).field2301;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IFFFFF)V", line = 431)
    public final void method1814(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field3906 = (int) (arg1 * 65535.0F);
        this.field3878 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field3898 = (int) (arg3 * 65535.0F / var7);
        this.field3908 = (int) (arg4 * 65535.0F / var7);
        this.field3872 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "(IIII)V", line = 440)
    public final void method1763(int arg0, int arg1, int arg2, int arg3) {
        this.field3910 = arg0;
        this.field3915 = arg1;
        this.field3909 = arg2;
        this.field3886 = arg3;
        this.method1830();
    }

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "(I)I", line = 447)
    public final int method1833(int arg0) {
        return this.field3900.method607(false, arg0).field2303 & 65535;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lvm;Lvm;FLvm;)Lvm;", line = 452)
    public final class407 method1808(class407 arg0, class407 arg1, float arg2, class407 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(IIIII)V", line = 456)
    public final void method1771(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field3885 && arg1 < this.field3873) {
            if (arg0 < this.field3877) {
                arg2 -= this.field3877 - arg0;
                arg0 = this.field3877;
            }
            if (arg0 + arg2 > this.field3896) {
                arg2 = this.field3896 - arg0;
            }
            int var6 = this.field3893 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field3905[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field3905[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field3905[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field3905[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field3905[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "D", descriptor = "()F", line = 529)
    public final float method1802() {
        return this.field3889;
    }

    @OriginalMember(owner = "client!kp", name = "k", descriptor = "()V", line = 533)
    public final void method1741() {
        this.field3875 = this.field3891;
        this.field3871 = false;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lci;)V", line = 537)
    public final void method1724(class261 arg0) {
        this.field3881 = (class363) arg0;
    }

    @OriginalMember(owner = "client!kp", name = "E", descriptor = "()V", line = 539)
    public final void method1804() {
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(Z)V", line = 544)
    public final void method1789(boolean arg0) {
        this.field3874 = arg0;
        this.field3904.method1249(1);
    }

    @OriginalMember(owner = "client!kp", name = "o", descriptor = "()I", line = 549)
    public final int method1750() {
        int var1 = this.field3895;
        this.field3895 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "(I)V", line = 554)
    public final void method1801(int arg0) {
        if (this.field3894 != arg0) {
            this.field3894 = arg0;
            this.field3880 = new class336[this.field3894];
            for (int var2 = 0; var2 < this.field3894; ++var2) {
                this.field3880[var2] = new class336(this);
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "()Z", line = 570)
    public final boolean method1834() {
        return this.field3914;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 573)
    public final void method1772(Canvas arg0) {
        this.field3882 = arg0;
        this.method1761();
    }

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "(IIII)[I", line = 578)
    public final int[] method1744(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field3893 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field3905[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!kp", name = "M", descriptor = "()V", line = 606)
    private final void method1835() {
        if (this.field3899 != 0.0F) {
            float var1 = (float) this.field3901;
            float var2 = (float) this.field3892;
            float var3 = -(var2 * 2.0F * var1) / (var1 - var2);
            float var4 = this.field3889 / (this.field3899 + this.field3889);
            float var5 = var4 * var4;
            float var6 = (1.0F - var4) * -var3 * (1.0F - var4) / this.field3899;
            this.field3879 = (int) (((float) this.field3901 - var3 * var5) / ((var1 + var2) / (var1 - var2) - var6) + 0.5F);
        } else {
            this.field3879 = this.field3901;
        }
    }

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "(IIIII)V", line = 629)
    public final void method1810(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field3877 && arg0 < this.field3896) {
            if (arg1 < this.field3885) {
                arg2 -= this.field3885 - arg1;
                arg1 = this.field3885;
            }
            if (arg1 + arg2 > this.field3873) {
                arg2 = this.field3873 - arg1;
            }
            int var6 = this.field3893 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field3893 * var10 + var6;
                        int var12 = this.field3905[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field3905[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field3893 * var14 + var6;
                        int var16 = this.field3905[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field3905[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field3905[this.field3893 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "j", descriptor = "()Z", line = 705)
    public final boolean method1740() {
        return true;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I[Lvb;)V", line = 710)
    public final void method1745(int arg0, class107[] arg1) {
    }

    @OriginalMember(owner = "client!kp", name = "m", descriptor = "()I", line = 716)
    public final int method1747() {
        return 0;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIIII)Z", line = 720)
    public final boolean method1743(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (this.field3881.field5094 * arg2 + this.field3881.field5093 * arg1 + this.field3881.field5090 * arg0 >> 15) + this.field3881.field5092;
        if (var7 < 1) {
            var7 = 1;
        }
        int var8 = (this.field3881.field5094 * arg5 + this.field3881.field5093 * arg4 + this.field3881.field5090 * arg3 >> 15) + this.field3881.field5092;
        if (var8 < 1) {
            var8 = 1;
        }
        if ((var7 >= this.field3892 || var8 >= this.field3892) && (var7 <= this.field3901 || var8 <= this.field3901)) {
            int var9 = ((this.field3881.field5095 * arg2 + this.field3881.field5097 * arg1 + this.field3881.field5096 * arg0 >> 15) + this.field3881.field5089) * this.field3909 / var7;
            int var10 = ((this.field3881.field5095 * arg5 + this.field3881.field5097 * arg4 + this.field3881.field5096 * arg3 >> 15) + this.field3881.field5089) * this.field3909 / var8;
            if (var9 < this.field3883 && var10 < this.field3883 || var9 > this.field3903 && var10 > this.field3903) {
                return false;
            } else {
                int var11 = ((this.field3881.field5088 * arg2 + this.field3881.field5099 * arg0 + this.field3881.field5091 * arg1 >> 15) + this.field3881.field5098) * this.field3886 / var7;
                int var12 = ((this.field3881.field5088 * arg5 + this.field3881.field5099 * arg3 + this.field3881.field5091 * arg4 >> 15) + this.field3881.field5098) * this.field3886 / var8;
                return (var11 >= this.field3913 || var12 >= this.field3913) && (var11 <= this.field3907 || var12 <= this.field3907);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Ljava/lang/Runnable;)Lkj;", line = 751)
    public final class336 method1836(Runnable arg0) {
        for (int var2 = 0; var2 < this.field3894; ++var2) {
            if (this.field3880[var2].field4532 == arg0) {
                return this.field3880[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(FF)V", line = 763)
    public final void method1805(float arg0, float arg1) {
        this.field3889 = arg0;
        this.field3899 = arg1;
        this.method1835();
    }

    @OriginalMember(owner = "client!kp", name = "i", descriptor = "(I)Z", line = 768)
    public final boolean method1837(int arg0) {
        return this.field3900.method610((byte) 0, arg0);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(FFF)V", line = 771)
    public final void method1733(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(III)V", line = 774)
    public final void method1817(int arg0, int arg1, int arg2) {
        this.field3891 = this.field3875;
        this.field3876 = arg0;
        this.field3875 = arg1;
        this.field3869 = arg2;
        this.field3871 = true;
    }

    @OriginalMember(owner = "client!kp", name = "j", descriptor = "(I)[I", line = 782)
    public final int[] method1838(int arg0) {
        class190 var2 = this.field3904;
        class316 var3;
        synchronized (this.field3904) {
            var3 = (class316) this.field3904.method1246((byte) -116, (long) arg0);
            if (var3 == null) {
                if (!this.field3900.method610((byte) 0, arg0)) {
                    return null;
                }
                class164 var5 = this.field3900.method607(false, arg0);
                int var6 = !var5.field2301 && !this.field3874 ? 128 : 64;
                var3 = new class316(arg0, var6, this.field3900.method613(0.7F, arg0, var6, (byte) 115, true, var6), var5.field2314);
                this.field3904.method1247((long) arg0, (byte) 46, var3);
            }
        }
        var3.field4360 = true;
        return var3.method2013();
    }

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "(II)I", line = 802)
    public final int method1777(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 807)
    public final void method1799(Rectangle[] arg0, int arg1) {
        if (this.field3882 != null && this.field3884 != null) {
            try {
                Graphics var3 = this.field3882.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field3893 && var5.y <= this.field3887 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field3884.method380(var5.height, 81, var5.x, var5.width, var3, var5.y);
                    }
                }
            } catch (Exception var6) {
                this.field3882.repaint();
            }
        } else {
            throw new IllegalStateException("Can't flip an offscreen toolkit");
        }
    }

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "()Z", line = 834)
    public final boolean method1729() {
        return false;
    }

    @OriginalMember(owner = "client!kp", name = "k", descriptor = "(I)Z", line = 837)
    public final boolean method1839(int arg0) {
        return this.field3900.method607(false, arg0).field2300;
    }

    @OriginalMember(owner = "client!kp", name = "y", descriptor = "()Z", line = 840)
    public final boolean method1780() {
        return false;
    }

    @OriginalMember(owner = "client!kp", name = "C", descriptor = "()I", line = 843)
    public final int method1797() {
        return 0;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Z)V", line = 846)
    public final void method1764(boolean arg0) {
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V", line = 853)
    public final void method1726(int arg0) {
        int var2 = arg0 - this.field3912;
        for (Object var3 = this.field3904.method1248(2); var3 != null; var3 = this.field3904.method1257((byte) -28)) {
            class316 var4 = (class316) var3;
            if (var4.field4360) {
                var4.field4359 += var2;
                int var5 = var4.field4359 / 20;
                if (var5 > 0) {
                    class164 var6 = this.field3900.method607(false, var4.field4361);
                    var4.method2015(var6.field2315 * var2 * 50 / 1000, var6.field2309 * var2 * 50 / 1000);
                    var4.field4359 -= var5 * 20;
                }
                var4.field4360 = false;
            }
        }
        this.field3912 = arg0;
        this.field3890.method1254(5, -56);
    }

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "(IIIIII)V", line = 886)
    public final void method1785(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field3877) {
            arg2 -= this.field3877 - arg0;
            arg0 = this.field3877;
        }
        if (arg1 < this.field3885) {
            arg3 -= this.field3885 - arg1;
            arg1 = this.field3885;
        }
        if (arg0 + arg2 > this.field3896) {
            arg2 = this.field3896 - arg0;
        }
        if (arg1 + arg3 > this.field3873) {
            arg3 = this.field3873 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field3896 && arg1 <= this.field3873) {
            int var7 = this.field3893 - arg2;
            int var8 = this.field3893 * arg1 + arg0;
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
                            this.field3905[var24] = arg4;
                            ++var24;
                            this.field3905[var24] = arg4;
                            ++var24;
                            this.field3905[var24] = arg4;
                            ++var24;
                            this.field3905[var24] = arg4;
                            ++var24;
                            this.field3905[var24] = arg4;
                            ++var24;
                            this.field3905[var24] = arg4;
                            ++var24;
                            this.field3905[var24] = arg4;
                            ++var24;
                            this.field3905[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field3905[var24] = arg4;
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
                        int var14 = this.field3905[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + ((var14 & 65280) * var11 >> 8 & 65280);
                        this.field3905[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field3905[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field3905[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "(IIIII)V", line = 1021)
    public final void method1824(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field3885) {
            var6 = this.field3885;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field3873) {
            var7 = this.field3873;
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
                if (var64 < this.field3877) {
                    var64 = this.field3877;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field3896) {
                    var65 = this.field3896;
                }
                int var66 = this.field3893 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field3905[var66++] = arg3;
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
                if (var60 < this.field3877) {
                    var60 = this.field3877;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field3896 - 1) {
                    var61 = this.field3896 - 1;
                }
                int var62 = this.field3893 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field3905[var62++] = arg3;
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
                if (var28 < this.field3877) {
                    var28 = this.field3877;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field3896) {
                    var29 = this.field3896;
                }
                int var30 = this.field3893 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field3905[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field3905[var30++] = var15 + var33;
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
                if (var22 < this.field3877) {
                    var22 = this.field3877;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field3896 - 1) {
                    var23 = this.field3896 - 1;
                }
                int var24 = this.field3893 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field3905[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field3905[var24++] = var15 + var27;
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
                if (var47 < this.field3877) {
                    var47 = this.field3877;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field3896) {
                    var48 = this.field3896;
                }
                int var49 = this.field3893 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field3905[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field3905[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field3877) {
                    var39 = this.field3877;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field3896 - 1) {
                    var40 = this.field3896 - 1;
                }
                int var41 = this.field3893 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field3905[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field3905[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "()Z", line = 1307)
    public final boolean method1725() {
        return false;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIIIII)V", line = 1318)
    public final void method1758(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class336 var8 = this.method1836(Thread.currentThread());
        class335 var9 = var8.field4535;
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
            int var21 = arg0 - var9.method2083();
            int var22 = arg1 - var9.method2082();
            int var23 = var17 + var21;
            int var24 = var21 - var18;
            int var25 = var10 + var21 - var18;
            int var26 = var10 + var21 + var17;
            int var27 = var19 + var22;
            int var28 = var22 - var20;
            int var29 = var11 + var22 - var20;
            int var30 = var11 + var22 + var19;
            if (arg6 == 0) {
                var9.field4520 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field4520 = 255 - (arg4 >> 24);
            }
            var9.field4525 = var23 < 0 || var23 > var9.field4529 || var24 < 0 || var24 > var9.field4529 || var25 < 0 || var25 > var9.field4529;
            var9.method2084(var27, var28, var29, var23, var24, var25, arg4);
            var9.field4525 = var23 < 0 || var23 > var9.field4529 || var24 < 0 || var24 > var9.field4529 || var26 < 0 || var26 > var9.field4529;
            var9.method2084(var27, var29, var30, var23, var25, var26, arg4);
        }
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)V", line = 1387)
    public final void method1757(int arg0) {
        this.field3880[arg0].method2095((Runnable) null, (byte) -37);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lvm;)V", line = 1392)
    public final void method1756(class407 arg0) {
    }

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "(Z)V", line = 1396)
    public final void method1822(boolean arg0) {
    }

    @OriginalMember(owner = "client!kp", name = "q", descriptor = "()Z", line = 1400)
    public final boolean method1755() {
        return false;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(II[I[I)Ltm;", line = 1404)
    public final class220 method1784(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class105(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!kp", name = "p", descriptor = "()Z", line = 1407)
    public final boolean method1753() {
        return false;
    }

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "(I)V", line = 1411)
    public final void method1798(int arg0) {
        this.field3880[arg0].method2095(Thread.currentThread(), (byte) -99);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "([IIIII)Llf;", line = 1421)
    public final class130 method1773(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class348(this, arg0, arg1, arg2, arg3, arg4) : new class119(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class348(this, arg0, arg1, arg2, arg3, arg4) : new class119(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(II[[I[[IIII)Lsm;", line = 1462)
    public final class156 method1821(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class345(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!kp", name = "l", descriptor = "(I)[I", line = 1470)
    private final int[] method1840(int arg0) {
        class190 var2 = this.field3904;
        class316 var3;
        synchronized (this.field3904) {
            var3 = (class316) this.field3904.method1246((byte) -81, (long) arg0);
            if (var3 == null) {
                if (!this.field3900.method610((byte) 0, arg0)) {
                    return null;
                }
                class164 var5 = this.field3900.method607(false, arg0);
                int var6 = !var5.field2301 && !this.field3874 ? 128 : 64;
                var3 = new class316(arg0, var6, this.field3900.method608(arg0, 0.7F, var6, true, -97, var6), var5.field2314);
                this.field3904.method1247((long) arg0, (byte) 70, var3);
            }
        }
        var3.field4360 = true;
        return var3.method2013();
    }

    @OriginalMember(owner = "client!kp", name = "G", descriptor = "()V", line = 1493)
    public final void method1811() {
        this.field3904.method1249(1);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Ldi;[Lnc;Z)Lrj;", line = 1501)
    public final class352 method1791(class65 arg0, class18[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field247;
            var5[var7] = arg1[var7].field242;
            if (arg1[var7].field243 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            return new class425(this, arg0, arg1, var4, var5);
        } else if (var6) {
            return new class104(this, arg0, arg1, var4, var5);
        } else {
            return new class273(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "(II)V", line = 1536)
    public final void method1787(int arg0, int arg1) {
        this.field3875 = arg0 & 16777215;
        int var3 = this.field3875 >>> 16 & 255;
        if (var3 < 2) {
            var3 = 2;
        }
        int var4 = this.field3875 >> 8 & 255;
        if (var4 < 2) {
            var4 = 2;
        }
        int var5 = this.field3875 & 255;
        if (var5 < 2) {
            var5 = 2;
        }
        this.field3875 = var3 << 16 | var4 << 8 | var5;
        if (arg1 < 0) {
            this.field3888 = false;
        } else {
            this.field3888 = true;
        }
    }

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "(IIII)V", line = 1563)
    public final void method1776(int arg0, int arg1, int arg2, int arg3) {
        if (this.field3877 < arg0) {
            this.field3877 = arg0;
        }
        if (this.field3885 < arg1) {
            this.field3885 = arg1;
        }
        if (this.field3896 > arg2) {
            this.field3896 = arg2;
        }
        if (this.field3873 > arg3) {
            this.field3873 = arg3;
        }
        this.method1830();
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIIII[BII)V", line = 1579)
    public final void method1793(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field3893 * arg1 + arg0;
            int var15 = this.field3893 - arg2;
            if (arg1 + arg3 > this.field3873) {
                arg3 -= arg1 + arg3 - this.field3873;
            }
            if (arg1 < this.field3885) {
                int var16 = this.field3885 - arg1;
                arg3 -= var16;
                var14 += this.field3893 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field3896) {
                int var17 = arg0 + arg2 - this.field3896;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field3877) {
                int var18 = this.field3877 - arg0;
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
                            int var28 = this.field3905[var14];
                            this.field3905[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field3905[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field3905[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field3905[var14++] = arg5;
                        } else {
                            this.field3905[var14++] = arg4;
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

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lnh;III)V", line = 1755)
    public final void method1841(class446 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 >> 1;
        int var6 = arg0.field6431;
        if (var6 == -1) {
            this.method1824(arg1, arg2, var5, arg0.field6437, 1);
        } else {
            if (this.field3916 == null || (long) var6 != this.field3916.field5363) {
                this.field3916 = (class30) this.field3890.method1246((byte) -91, (long) var6);
            }
            if (this.field3916 == null) {
                int[] var7 = this.method1840(var6);
                if (var7 == null) {
                    return;
                }
                this.field3916 = new class30();
                this.field3916.field465 = this.method1832(var6);
                int var8 = this.field3916.field465 ? 64 : 128;
                this.field3916.field464 = this.method1773(var7, 0, var8, var8, var8);
                this.field3890.method1247((long) var6, (byte) 108, this.field3916);
            }
            if (this.field3916.field465) {
                var5 <<= 1;
                arg3 <<= 1;
            }
            this.field3916.field464.method807(arg1 - var5, arg2 - var5, arg3, arg3, 1, arg0.field6437, 1);
        }
    }

    @OriginalMember(owner = "client!kp", name = "x", descriptor = "()V", line = 1793)
    public final void method1779() {
    }

    @OriginalMember(owner = "client!kp", name = "n", descriptor = "()V", line = 1803)
    public final void method1749() {
        if (this.field3882 != null && this.field3884 != null) {
            try {
                Graphics var1 = this.field3882.getGraphics();
                this.field3884.method375(0, (byte) -120, var1, 0);
            } catch (Exception var2) {
                this.field3882.repaint();
            }
        } else {
            throw new IllegalStateException("Can't flip an offscreen toolkit");
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lnc;Z)Llf;", line = 1816)
    public final class130 method1807(class18 arg0, boolean arg1) {
        int[] var3 = arg0.field246;
        byte[] var4 = arg0.field240;
        int var5 = arg0.field247;
        int var6 = arg0.field242;
        class292 var11;
        if (arg1 && arg0.field243 == null) {
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
            var11 = new class400(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field243;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class348(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var21 = var5 * var19;
                    for (int var22 = 0; var22 < var5; ++var22) {
                        var14[var21 + var22] = var3[var4[var21 + var22] & 255];
                    }
                }
                new class348(this, var14, var5, var6);
                var11 = new class119(this, var14, var5, var6);
            }
        }
        var11.method868(arg0.field244, arg0.field245, arg0.field241, arg0.field248);
        return var11;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "([Lhc;Lqd;Lci;[Lbd;I)V", line = 1919)
    public final void method1803(class75[] arg0, class260 arg1, class261 arg2, class38[] arg3, int arg4) {
        class239[] var6 = new class239[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class239) arg0[var7];
            }
        }
        class239 var8 = class239.method1500(this, var6);
        var8.method1509(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!kp", name = "u", descriptor = "()Lci;", line = 1939)
    public final class261 method1769() {
        class336 var1 = this.method1836(Thread.currentThread());
        return var1.field4537;
    }

    @OriginalMember(owner = "client!kp", name = "s", descriptor = "()V", line = 1943)
    public final void method1761() {
        this.field3884 = class57.method383(this.field3882, 1);
        this.field3905 = this.field3884.field819;
        this.field3893 = this.field3884.field816;
        this.field3887 = this.field3884.field820;
        for (int var1 = 0; var1 < this.field3894; ++var1) {
            this.field3880[var1].method2093(true);
        }
        this.method1812();
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(IIII)V", line = 1956)
    public final void method1731(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(III[I)V", line = 1960)
    public final void method1742(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (this.field3881.field5094 * arg2 + this.field3881.field5093 * arg1 + this.field3881.field5090 * arg0 >> 15) + this.field3881.field5092;
        if (var5 >= this.field3892 && var5 <= this.field3901) {
            int var6 = ((this.field3881.field5095 * arg2 + this.field3881.field5097 * arg1 + this.field3881.field5096 * arg0 >> 15) + this.field3881.field5089) * this.field3909 / var5;
            int var7 = ((this.field3881.field5088 * arg2 + this.field3881.field5099 * arg0 + this.field3881.field5091 * arg1 >> 15) + this.field3881.field5098) * this.field3886 / var5;
            if (var6 >= this.field3883 && var6 <= this.field3903 && var7 >= this.field3913 && var7 <= this.field3907) {
                arg3[0] = var6 - this.field3883;
                arg3[1] = var7 - this.field3913;
                arg3[2] = var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!kp", name = "i", descriptor = "()I", line = 1988)
    public final int method1738() {
        int var1 = this.field3870;
        this.field3870 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!kp", name = "B", descriptor = "()I", line = 1993)
    public final int method1792() {
        return this.field3901;
    }

    @OriginalMember(owner = "client!kp", name = "w", descriptor = "()Z", line = 1997)
    public final boolean method1778() {
        return true;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)I", line = 2003)
    public final int method1732(int arg0, int arg1) {
        int var3 = arg0 | 66560;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIIIIIIII)V", line = 2008)
    public final void method1800(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class336 var11 = this.method1836(Thread.currentThread());
        class335 var12 = var11.field4535;
        var12.field4524 = false;
        int var13 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var13 == 255) {
            var12.field4524 = false;
            var12.field4520 = 0;
            var12.field4525 = true;
            var12.method2078(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else {
            if (arg9 != 1) {
                if (arg9 == 2) {
                    throw new IllegalStateException();
                }
                throw new IllegalArgumentException();
            }
            var12.field4524 = false;
            var12.field4520 = 255 - var13;
            var12.field4525 = true;
            var12.method2078(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        }
        var12.field4524 = true;
    }

    @OriginalMember(owner = "client!kp", name = "H", descriptor = "()V", line = 2042)
    public final void method1812() {
        this.field3877 = 0;
        this.field3885 = 0;
        this.field3896 = this.field3893;
        this.field3873 = this.field3887;
        this.method1830();
    }

    @OriginalMember(owner = "client!kp", name = "v", descriptor = "()Z", line = 2049)
    public final boolean method1774() {
        return false;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILtm;II)V", line = 2053)
    public final void method1819(int arg0, class220 arg1, int arg2, int arg3) {
        class105 var5 = (class105) arg1;
        int[] var6 = var5.field1570;
        int[] var7 = var5.field1568;
        int var8;
        if (this.field3873 < var6.length + arg3) {
            var8 = this.field3873 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field3885 > arg3) {
            var9 = this.field3885 - arg3;
            arg3 = this.field3885;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field3893 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field3877 > var12) {
                    var13 -= this.field3877 - var12;
                    var12 = this.field3877;
                }
                if (this.field3896 < var12 + var13) {
                    var13 = this.field3896 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field3905[var14++] = arg0;
                }
                var10 += this.field3893;
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(F)V", line = 2110)
    public final void method1826(float arg0) {
        this.field3897 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lhc;Lqd;Lci;Lbd;I)V", line = 2117)
    public final void method1721(class75 arg0, class260 arg1, class261 arg2, class38 arg3, int arg4) {
        ((class239) arg0).method1509(arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "(IIII)V", line = 2126)
    public final void method1735(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field3893) {
            arg2 = this.field3893;
        }
        if (arg3 > this.field3887) {
            arg3 = this.field3887;
        }
        this.field3877 = arg0;
        this.field3896 = arg2;
        this.field3885 = arg1;
        this.field3873 = arg3;
        this.method1830();
    }

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "()Z", line = 2145)
    public final boolean method1722() {
        return false;
    }

    @OriginalMember(owner = "client!kp", name = "L", descriptor = "()I", line = 2154)
    public final int method1825() {
        return this.field3892;
    }

    @OriginalMember(owner = "client!kp", name = "I", descriptor = "()V", line = 2156)
    public final void method1813() {
    }

    @OriginalMember(owner = "client!kp", name = "z", descriptor = "()Lci;", line = 2159)
    public final class261 method1783() {
        return new class363();
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIIIILtm;II)V", line = 2163)
    public final void method1781(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class220 arg6, int arg7, int arg8) {
        class105 var10 = (class105) arg6;
        int[] var11 = var10.field1570;
        int[] var12 = var10.field1568;
        int var13 = this.field3885 > arg8 ? this.field3885 : arg8;
        int var14 = this.field3873 < var11.length + arg8 ? this.field3873 : var11.length + arg8;
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
            if (arg0 < this.field3877) {
                var18 += (this.field3877 - arg0) * var20;
                arg0 = this.field3877;
            }
            if (var21 >= this.field3896) {
                var21 = this.field3896 - 1;
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
                                int var28 = this.field3893 * var25 + arg0;
                                int var29 = this.field3905[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field3905[var28] = var23 + var30;
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
                                int var34 = this.field3893 * var31 + arg0;
                                int var35 = this.field3905[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field3905[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field3905[this.field3893 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field3877 && var64 < this.field3896 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field3905[this.field3893 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field3877 && var50 < this.field3896 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field3893 * arg1 + var50;
                        int var54 = this.field3905[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field3905[this.field3893 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field3877 && var56 < this.field3896 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field3893 * arg1 + var56;
                        int var60 = this.field3905[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field3905[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "J", descriptor = "()V", line = 2402)
    public final void method1815() {
        if (this.field3911) {
            class236.method1488((byte) -114, false, true);
            this.field3911 = false;
        }
        this.field3882 = null;
        this.field3900 = null;
        this.field3884 = null;
        this.field3914 = true;
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(IIIIII)V", line = 2414)
    public final void method1748(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1771(arg0, arg1, arg2, arg4, arg5);
        this.method1771(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method1810(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method1810(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }
}
