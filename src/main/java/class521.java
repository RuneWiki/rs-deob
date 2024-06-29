import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class521 extends class545 {

    @OriginalMember(owner = "client!ii", name = "A", descriptor = "Z")
    private boolean field7277;

    @OriginalMember(owner = "client!ii", name = "F", descriptor = "Z")
    private boolean field7282;

    @OriginalMember(owner = "client!ii", name = "B", descriptor = "Lgca;")
    private class209 field7278;

    @OriginalMember(owner = "client!ii", name = "I", descriptor = "I")
    private int field7285;

    @OriginalMember(owner = "client!ii", name = "H", descriptor = "I")
    public int field7284;

    @OriginalMember(owner = "client!ii", name = "O", descriptor = "I")
    public int field7291;

    @OriginalMember(owner = "client!ii", name = "G", descriptor = "I")
    public int field7283;

    @OriginalMember(owner = "client!ii", name = "X", descriptor = "I")
    public int field7300;

    @OriginalMember(owner = "client!ii", name = "gb", descriptor = "I")
    public int field7309;

    @OriginalMember(owner = "client!ii", name = "cb", descriptor = "I")
    public int field7305;

    @OriginalMember(owner = "client!ii", name = "Y", descriptor = "I")
    public int field7301;

    @OriginalMember(owner = "client!ii", name = "N", descriptor = "I")
    public int field7290;

    @OriginalMember(owner = "client!ii", name = "db", descriptor = "I")
    public int field7306;

    @OriginalMember(owner = "client!ii", name = "pb", descriptor = "I")
    public int field7318;

    @OriginalMember(owner = "client!ii", name = "U", descriptor = "Z")
    private boolean field7297;

    @OriginalMember(owner = "client!ii", name = "lb", descriptor = "I")
    public int field7314;

    @OriginalMember(owner = "client!ii", name = "sb", descriptor = "I")
    private int field7321;

    @OriginalMember(owner = "client!ii", name = "rb", descriptor = "I")
    public int field7320;

    @OriginalMember(owner = "client!ii", name = "jb", descriptor = "Lbh;")
    private class538 field7312;

    @OriginalMember(owner = "client!ii", name = "tb", descriptor = "I")
    private int field7322;

    @OriginalMember(owner = "client!ii", name = "W", descriptor = "Lbh;")
    private class538 field7299;

    @OriginalMember(owner = "client!ii", name = "fb", descriptor = "Lmda;")
    public class349 field7308;

    @OriginalMember(owner = "client!ii", name = "y", descriptor = "I")
    private int field7275;

    @OriginalMember(owner = "client!ii", name = "C", descriptor = "I")
    private int field7279;

    @OriginalMember(owner = "client!ii", name = "E", descriptor = "I")
    private int field7281;

    @OriginalMember(owner = "client!ii", name = "J", descriptor = "I")
    private int field7286;

    @OriginalMember(owner = "client!ii", name = "L", descriptor = "I")
    public int field7288;

    @OriginalMember(owner = "client!ii", name = "M", descriptor = "I")
    public int field7289;

    @OriginalMember(owner = "client!ii", name = "Q", descriptor = "I")
    private int field7293;

    @OriginalMember(owner = "client!ii", name = "R", descriptor = "I")
    public int field7294;

    @OriginalMember(owner = "client!ii", name = "S", descriptor = "I")
    public int field7295;

    @OriginalMember(owner = "client!ii", name = "T", descriptor = "I")
    public int field7296;

    @OriginalMember(owner = "client!ii", name = "V", descriptor = "I")
    public int field7298;

    @OriginalMember(owner = "client!ii", name = "bb", descriptor = "I")
    public int field7304;

    @OriginalMember(owner = "client!ii", name = "eb", descriptor = "I")
    public int field7307;

    @OriginalMember(owner = "client!ii", name = "hb", descriptor = "I")
    private int field7310;

    @OriginalMember(owner = "client!ii", name = "ib", descriptor = "I")
    private int field7311;

    @OriginalMember(owner = "client!ii", name = "kb", descriptor = "I")
    public int field7313;

    @OriginalMember(owner = "client!ii", name = "mb", descriptor = "I")
    public int field7315;

    @OriginalMember(owner = "client!ii", name = "ob", descriptor = "I")
    private int field7317;

    @OriginalMember(owner = "client!ii", name = "qb", descriptor = "I")
    public int field7319;

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "Lsfa;")
    public class125 field7276;

    @OriginalMember(owner = "client!ii", name = "ub", descriptor = "Lcw;")
    private class21 field7323;

    @OriginalMember(owner = "client!ii", name = "Z", descriptor = "Lwc;")
    private class724 field7302;

    @OriginalMember(owner = "client!ii", name = "D", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7280;

    @OriginalMember(owner = "client!ii", name = "K", descriptor = "[F")
    public float[] field7287;

    @OriginalMember(owner = "client!ii", name = "ab", descriptor = "[F")
    public float[] field7303;

    @OriginalMember(owner = "client!ii", name = "P", descriptor = "[I")
    public int[] field7292;

    @OriginalMember(owner = "client!ii", name = "nb", descriptor = "[Lae;")
    private class351[] field7316;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIII)V", line = 4)
    public final void method2188(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class351 var8 = this.method3097(Thread.currentThread());
        class239 var9 = var8.field4494;
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
            int var23 = arg0 - var9.method1528();
            int var24 = arg1 - var9.method1519();
            int var25 = var19 + var23;
            int var26 = var23 - var20;
            int var27 = var17 + var23 - var20;
            int var28 = var17 + var23 + var19;
            int var29 = var21 + var24;
            int var30 = var24 - var22;
            int var31 = var18 + var24 - var22;
            int var32 = var18 + var24 + var21;
            if (arg6 == 0) {
                var9.field3329 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field3329 = 255 - (arg4 >>> 24);
            }
            this.method2148(false);
            var9.field3317 = var25 < 0 || var25 > var9.field3324 || var26 < 0 || var26 > var9.field3324 || var27 < 0 || var27 > var9.field3324;
            var9.method1518((float) var29, (float) var30, (float) var31, (float) var25, (float) var26, (float) var27, 100.0F, 100.0F, 100.0F, arg4);
            var9.field3317 = var25 < 0 || var25 > var9.field3324 || var27 < 0 || var27 > var9.field3324 || var28 < 0 || var28 > var9.field3324;
            var9.method1518((float) var29, (float) var31, (float) var32, (float) var25, (float) var27, (float) var28, 100.0F, 100.0F, 100.0F, arg4);
            this.method2148(true);
        }
    }

    @OriginalMember(owner = "client!ii", name = "A", descriptor = "()V", line = 76)
    public final void method625() {
    }

    @OriginalMember(owner = "client!ii", name = "F", descriptor = "(II)V", line = 80)
    public final void method572(int arg0, int arg1) {
        int var3 = this.field7315 * arg1 + arg0;
        int var4 = this.field7311 * arg1 + arg0;
        if (var3 != 0 || var4 != 0) {
            int[] var5 = this.field7292;
            float[] var6 = this.field7287;
            if (var3 < 0) {
                int var7 = var5.length + var3;
                class34.method244(var5, -var3, var5, 0, var7);
            } else if (var3 > 0) {
                int var8 = var5.length - var3;
                class34.method244(var5, 0, var5, var3, var8);
            }
            if (var4 < 0) {
                int var9 = var6.length + var4;
                class34.method243(var6, -var4, var6, 0, var9);
            } else {
                if (var4 > 0) {
                    int var10 = var6.length - var4;
                    class34.method243(var6, 0, var6, var4, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ltba;Z)Lcw;", line = 123)
    public final class21 method2126(class320 arg0, boolean arg1) {
        int[] var3 = arg0.field4128;
        byte[] var4 = arg0.field4125;
        int var5 = arg0.field4122;
        int var6 = arg0.field4121;
        class44 var11;
        if (arg1 && arg0.field4124 == null) {
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
            var11 = new class385(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field4124;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class546(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var20 = var5 * var19;
                    for (int var21 = 0; var21 < var5; ++var21) {
                        int var22 = var3[var4[var20 + var21] & 255];
                        var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
                    }
                }
                var11 = new class715(this, var14, var5, var6);
            }
        }
        var11.method106(arg0.field4127, arg0.field4123, arg0.field4126, arg0.field4120);
        return var11;
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(I)[I", line = 227)
    public final int[] method3095(int arg0) {
        class538 var2 = this.field7299;
        class618 var3;
        synchronized (this.field7299) {
            var3 = (class618) this.field7299.method3200((long) arg0 | Long.MIN_VALUE, -19983);
            if (var3 == null) {
                if (!super.field7694.method86((byte) 117, arg0)) {
                    return null;
                }
                class468 var5 = super.field7694.method91(arg0, -22805);
                int var6 = !var5.field6391 && !this.field7297 ? this.field7314 : 64;
                var3 = new class618(arg0, var6, super.field7694.method89(0.7F, true, true, var6, arg0, var6), var5.field6393 != 1);
                this.field7299.method3199((byte) 78, var3, (long) arg0 | Long.MIN_VALUE);
            }
        }
        var3.field8789 = true;
        return var3.method3624();
    }

    @OriginalMember(owner = "client!ii", name = "KA", descriptor = "(IIII)V", line = 247)
    public final void method2097(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field7315) {
            arg2 = this.field7315;
        }
        if (arg3 > this.field7286) {
            arg3 = this.field7286;
        }
        this.field7291 = arg0;
        this.field7283 = arg2;
        this.field7309 = arg1;
        this.field7320 = arg3;
        this.method3104();
    }

    @OriginalMember(owner = "client!ii", name = "ya", descriptor = "()V", line = 266)
    public final void method610() {
        if (this.field7291 == 0 && this.field7315 == this.field7283 && this.field7309 == 0 && this.field7320 == this.field7286) {
            int var1 = this.field7287.length;
            int var2 = var1 - (var1 & 7);
            int var3 = 0;
            while (var3 < var2) {
                this.field7287[var3++] = 2.1474836E9F;
                this.field7287[var3++] = 2.1474836E9F;
                this.field7287[var3++] = 2.1474836E9F;
                this.field7287[var3++] = 2.1474836E9F;
                this.field7287[var3++] = 2.1474836E9F;
                this.field7287[var3++] = 2.1474836E9F;
                this.field7287[var3++] = 2.1474836E9F;
                this.field7287[var3++] = 2.1474836E9F;
            }
            while (var3 < var1) {
                this.field7287[var3++] = 2.1474836E9F;
            }
        } else {
            int var4 = this.field7283 - this.field7291;
            int var5 = this.field7320 - this.field7309;
            int var6 = this.field7315 - var4;
            int var7 = this.field7315 * this.field7309 + this.field7291;
            int var8 = var4 >> 3;
            int var9 = var4 & 7;
            int var10 = var7 - 1;
            for (int var11 = -var5; var11 < 0; ++var11) {
                if (var8 > 0) {
                    int var12 = var8;
                    do {
                        ++var10;
                        this.field7287[var10] = 2.1474836E9F;
                        ++var10;
                        this.field7287[var10] = 2.1474836E9F;
                        ++var10;
                        this.field7287[var10] = 2.1474836E9F;
                        ++var10;
                        this.field7287[var10] = 2.1474836E9F;
                        ++var10;
                        this.field7287[var10] = 2.1474836E9F;
                        ++var10;
                        this.field7287[var10] = 2.1474836E9F;
                        ++var10;
                        this.field7287[var10] = 2.1474836E9F;
                        ++var10;
                        this.field7287[var10] = 2.1474836E9F;
                        --var12;
                    } while (var12 > 0);
                }
                if (var9 > 0) {
                    int var13 = var9;
                    do {
                        ++var10;
                        this.field7287[var10] = 2.1474836E9F;
                        --var13;
                    } while (var13 > 0);
                }
                var10 += var6;
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 347)
    public final void method2224(Canvas arg0, int arg1, int arg2) {
        class125 var4 = (class125) this.field7278.method1381(true, (long) arg0.hashCode());
        if (var4 != null) {
            var4.method3065(-17363);
            class125 var5 = class511.method3049(arg2, (byte) 126, arg1, arg0);
            this.field7278.method1387(var5, (long) arg0.hashCode(), (byte) -128);
            if (this.field7280 == arg0 && this.field7302 == null) {
                Dimension var6 = arg0.getSize();
                this.field7281 = var6.width;
                this.field7279 = var6.height;
                this.field7276 = var5;
                this.field7292 = var5.field1703;
                this.field7315 = var5.field1701;
                this.field7286 = var5.field1700;
                if (this.field7315 != this.field7311 || this.field7310 != this.field7286) {
                    this.field7317 = this.field7311 = this.field7315;
                    this.field7293 = this.field7310 = this.field7286;
                    this.field7303 = this.field7287 = new float[this.field7311 * this.field7310];
                }
                this.method3108();
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "xa", descriptor = "(F)V", line = 377)
    public final void method2132(float arg0) {
        this.field7290 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lza;)V", line = 380)
    public final void method2177(class256 arg0) {
    }

    @OriginalMember(owner = "client!ii", name = "M", descriptor = "()I", line = 386)
    public final int method2223() {
        int var1 = this.field7285;
        this.field7285 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I[Lkb;)V", line = 390)
    public final void method2106(int arg0, class757[] arg1) {
    }

    @OriginalMember(owner = "client!ii", name = "C", descriptor = "(Z)V", line = 394)
    public final void method2148(boolean arg0) {
        class351 var2 = this.method3097(Thread.currentThread());
        var2.field4457 = arg0;
    }

    @OriginalMember(owner = "client!ii", name = "da", descriptor = "(III[I)V", line = 399)
    public final void method2123(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field7308.field4445 + (float) arg0 * this.field7308.field4435 + (float) arg1 * this.field7308.field4419 + this.field7308.field4428;
        if (!(var5 < (float) this.field7300) && !(var5 > (float) this.field7301)) {
            int var6 = (int) (((float) arg2 * this.field7308.field4440 + (float) arg0 * this.field7308.field4446 + (float) arg1 * this.field7308.field4436 + this.field7308.field4424) * (float) this.field7305 / var5);
            int var7 = (int) (((float) arg2 * this.field7308.field4442 + (float) arg0 * this.field7308.field4438 + (float) arg1 * this.field7308.field4433 + this.field7308.field4439) * (float) this.field7318 / var5);
            if (var6 >= this.field7307 && var6 <= this.field7288 && var7 >= this.field7319 && var7 <= this.field7294) {
                arg3[0] = var6 - this.field7307;
                arg3[1] = var7 - this.field7319;
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lhs;Lmp;)Lcha;", line = 423)
    public final class279 method584(class358 arg0, class315 arg1) {
        return new class724(this, (class21) arg0, (class333) arg1);
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(II)Lmp;", line = 427)
    public final class315 method628(int arg0, int arg1) {
        return new class333(arg0, arg1);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIZ)Lcw;", line = 432)
    public final class21 method2119(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field7315 * arg1 + arg0;
        int var8 = this.field7315 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field7292[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class546(this, var6, arg2, arg3);
        } else {
            return new class715(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!ii", name = "XA", descriptor = "()I", line = 464)
    public final int method2160() {
        return this.field7301;
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(IIIIII)V", line = 467)
    public final void method2166(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2173(arg0, arg1, arg2, arg4, arg5);
        this.method2173(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method2191(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method2191(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "([IIIIIZ)Lcw;", line = 474)
    public final class21 method2070(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        boolean var7 = false;
        int var8 = arg1;
        for (int var9 = 0; var9 < arg4; ++var9) {
            for (int var10 = 0; var10 < arg3; ++var10) {
                int var11 = arg0[var8++] >>> 24;
                if (var11 != 0 && var11 != 255) {
                    var7 = true;
                    return var7 ? new class546(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class715(this, arg0, arg1, arg2, arg3, arg4, arg5);
                }
            }
        }
        return var7 ? new class546(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class715(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIF)Lkb;", line = 509)
    public final class757 method2225(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIIII)V", line = 513)
    private final void method3096(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 >= this.field7291 && arg0 < this.field7283) {
            int var9 = this.field7315 * arg1 + arg0;
            int var10 = arg3 >>> 24;
            int var11 = arg5 + arg6;
            int var12 = arg7 % var11;
            if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
                if (arg4 == 1) {
                    int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
                    int var14 = 256 - var10;
                    int var15 = 0;
                    while (var15 < arg2) {
                        if (arg1 + var15 >= this.field7309 && arg1 + var15 < this.field7320 && var12 < arg5) {
                            int var16 = this.field7315 * var15 + var9;
                            int var17 = this.field7292[var16];
                            int var18 = ((var17 & 16711935) * var14 >> 8 & 16711935) + ((var17 & 65280) * var14 >> 8 & 65280);
                            this.field7292[var16] = var13 + var18;
                        }
                        ++var15;
                        ++var12;
                        var12 %= var11;
                    }
                } else if (arg4 == 2) {
                    int var19 = 0;
                    while (var19 < arg2) {
                        if (arg1 + var19 >= this.field7309 && arg1 + var19 < this.field7320 && var12 < arg5) {
                            int var20 = this.field7315 * var19 + var9;
                            int var21 = this.field7292[var20];
                            int var22 = arg3 + var21;
                            int var23 = (arg3 & 16711935) + (var21 & 16711935);
                            int var24 = (var22 - var23 & 65536) + (var23 & 16777472);
                            this.field7292[var20] = var22 - var24 | var24 - (var24 >>> 8);
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
                    if (arg1 + var25 >= this.field7309 && arg1 + var25 < this.field7320 && var12 < arg5) {
                        this.field7292[this.field7315 * var25 + var9] = arg3;
                    }
                    ++var25;
                    ++var12;
                    var12 %= var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/lang/Runnable;)Lae;", line = 600)
    public final class351 method3097(Runnable arg0) {
        for (int var2 = 0; var2 < this.field7313; ++var2) {
            if (this.field7316[var2].field4468 == arg0) {
                return this.field7316[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ii", name = "JA", descriptor = "(IIIIII)I", line = 614)
    public final int method2189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = 0;
        float var8 = (float) arg2 * this.field7308.field4445 + (float) arg0 * this.field7308.field4435 + (float) arg1 * this.field7308.field4419 + this.field7308.field4428;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field7308.field4445 + (float) arg3 * this.field7308.field4435 + (float) arg4 * this.field7308.field4419 + this.field7308.field4428;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if (var8 < (float) this.field7300 && var9 < (float) this.field7300) {
            var7 |= 16;
        } else if (var8 > (float) this.field7301 && var9 > (float) this.field7301) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field7308.field4440 + (float) arg0 * this.field7308.field4446 + (float) arg1 * this.field7308.field4436 + this.field7308.field4424) * (float) this.field7305 / var8);
        int var11 = (int) (((float) arg5 * this.field7308.field4440 + (float) arg3 * this.field7308.field4446 + (float) arg4 * this.field7308.field4436 + this.field7308.field4424) * (float) this.field7305 / var9);
        if (var10 < this.field7307 && var11 < this.field7307) {
            var7 |= 1;
        } else if (var10 > this.field7288 && var11 > this.field7288) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field7308.field4442 + (float) arg0 * this.field7308.field4438 + (float) arg1 * this.field7308.field4433 + this.field7308.field4439) * (float) this.field7318 / var8);
        int var13 = (int) (((float) arg5 * this.field7308.field4442 + (float) arg3 * this.field7308.field4438 + (float) arg4 * this.field7308.field4433 + this.field7308.field4439) * (float) this.field7318 / var9);
        if (var12 < this.field7319 && var13 < this.field7319) {
            var7 |= 4;
        } else if (var12 > this.field7294 && var13 > this.field7294) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "()Luha;", line = 657)
    public final class723 method2135() {
        return this.field7308;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lkda;IIII)Lka;", line = 661)
    public final class283 method2222(class64 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class180(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "()Z", line = 664)
    public final boolean method2086() {
        return false;
    }

    @OriginalMember(owner = "client!ii", name = "Y", descriptor = "()[I", line = 667)
    public final int[] method2107() {
        return new int[] { this.field7296, this.field7295, this.field7305, this.field7318 };
    }

    @OriginalMember(owner = "client!ii", name = "L", descriptor = "(III)V", line = 672)
    public final void method2069(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field7316.length; ++var4) {
            class351 var5 = this.field7316[var4];
            var5.field4459 = arg0 & 16777215;
            int var6 = var5.field4459 >>> 16 & 255;
            if (var6 < 2) {
                var6 = 2;
            }
            int var7 = var5.field4459 >> 8 & 255;
            if (var7 < 2) {
                var7 = 2;
            }
            int var8 = var5.field4459 & 255;
            if (var8 < 2) {
                var8 = 2;
            }
            var5.field4459 = var6 << 16 | var7 << 8 | var8;
            if (arg1 < 0) {
                var5.field4470 = false;
            } else {
                var5.field4470 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "r", descriptor = "(IIIIIII)I", line = 705)
    public final int method2156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        float var8 = (float) arg2 * this.field7308.field4445 + (float) arg0 * this.field7308.field4435 + (float) arg1 * this.field7308.field4419 + this.field7308.field4428;
        float var9 = (float) arg5 * this.field7308.field4445 + (float) arg3 * this.field7308.field4435 + (float) arg4 * this.field7308.field4419 + this.field7308.field4428;
        int var10 = 0;
        if (var8 < (float) this.field7300 && var9 < (float) this.field7300) {
            var10 |= 16;
        } else if (var8 > (float) this.field7301 && var9 > (float) this.field7301) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field7308.field4440 + (float) arg0 * this.field7308.field4446 + (float) arg1 * this.field7308.field4436 + this.field7308.field4424) * (float) this.field7305 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field7308.field4440 + (float) arg3 * this.field7308.field4446 + (float) arg4 * this.field7308.field4436 + this.field7308.field4424) * (float) this.field7305 / (float) arg6);
        if (var11 < this.field7307 && var12 < this.field7307) {
            var10 |= 1;
        } else if (var11 > this.field7288 && var12 > this.field7288) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field7308.field4442 + (float) arg0 * this.field7308.field4438 + (float) arg1 * this.field7308.field4433 + this.field7308.field4439) * (float) this.field7318 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field7308.field4442 + (float) arg3 * this.field7308.field4438 + (float) arg4 * this.field7308.field4433 + this.field7308.field4439) * (float) this.field7318 / (float) arg6);
        if (var13 < this.field7319 && var14 < this.field7319) {
            var10 |= 4;
        } else if (var13 > this.field7294 && var14 > this.field7294) {
            var10 |= 8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 742)
    public final void method2095(Canvas arg0) {
        if (arg0 != null) {
            class125 var2 = (class125) this.field7278.method1381(true, (long) arg0.hashCode());
            if (var2 != null) {
                this.field7280 = arg0;
                Dimension var3 = arg0.getSize();
                this.field7281 = var3.width;
                this.field7279 = var3.height;
                this.field7276 = var2;
                if (this.field7302 == null) {
                    this.field7292 = var2.field1703;
                    this.field7315 = var2.field1701;
                    this.field7286 = var2.field1700;
                    if (this.field7315 != this.field7311 || this.field7310 != this.field7286) {
                        this.field7317 = this.field7311 = this.field7315;
                        this.field7293 = this.field7310 = this.field7286;
                        this.field7303 = this.field7287 = new float[this.field7311 * this.field7310];
                    }
                    this.method3108();
                    return;
                }
            }
        } else {
            this.field7280 = null;
            this.field7276 = null;
            if (this.field7302 == null) {
                this.field7292 = null;
                this.field7315 = this.field7286 = 1;
                this.field7311 = this.field7310 = 1;
                this.method3108();
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "()Z", line = 788)
    public final boolean method3098() {
        return this.field7282;
    }

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "()Z", line = 791)
    public final boolean method2214() {
        return false;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lsm;IIII)V", line = 795)
    private final void method3099(class387 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg0.field5401;
        int var8 = arg4 << 1;
        if (var6 == -1) {
            this.method3110(arg1, arg2, arg3, arg4, arg0.field5407, 1);
        } else {
            if (this.field7322 != var6) {
                class21 var9 = (class21) this.field7312.method3200((long) var6, -19983);
                if (var9 == null) {
                    int[] var10 = this.method3095(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = this.method3102(var6) ? 64 : this.field7314;
                    var9 = this.method3258(var10, 1, 0, var11, var11, var11);
                    this.field7312.method3199((byte) 78, var9, (long) var6);
                }
                this.field7322 = var6;
                this.field7323 = var9;
            }
            ++var8;
            ((class44) this.field7323).method303(arg1 - arg4, arg2 - arg4, arg3, var8, var8, 0, arg0.field5407, 1, 1);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lcd;Lcd;FLcd;)Lcd;", line = 833)
    public final class22 method631(class22 arg0, class22 arg1, float arg2, class22 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "()Z", line = 836)
    public final boolean method2140() {
        return true;
    }

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "()V", line = 838)
    public final void method556() {
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIII)V", line = 841)
    public final void method2168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method2173(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method2173(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method2191(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method2191(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field7291) {
                    var10 += (this.field7291 - arg0) * var12;
                    arg0 = this.field7291;
                }
                if (var13 >= this.field7283) {
                    var13 = this.field7283 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field7309 && var17 < this.field7320) {
                                int var18 = this.field7315 * var17 + arg0;
                                int var19 = this.field7292[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field7292[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field7309 && var21 < this.field7320) {
                                int var22 = this.field7315 * var21 + arg0;
                                int var23 = this.field7292[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field7292[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field7309 && var27 < this.field7320) {
                            this.field7292[this.field7315 * var27 + arg0] = arg4;
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
                if (arg1 < this.field7309) {
                    var29 += (this.field7309 - arg1) * var31;
                    arg1 = this.field7309;
                }
                if (var32 >= this.field7320) {
                    var32 = this.field7320 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field7291 && var46 < this.field7283) {
                            this.field7292[this.field7315 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field7291 && var36 < this.field7283) {
                            int var37 = this.field7315 * arg1 + var36;
                            int var38 = this.field7292[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field7292[this.field7315 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field7291 && var40 < this.field7283) {
                            int var41 = this.field7315 * arg1 + var40;
                            int var42 = this.field7292[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field7292[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!ii", name = "I", descriptor = "()I", line = 1055)
    public final int method593() {
        int var1 = this.field7321;
        this.field7321 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(Z)V", line = 1060)
    public final void method2149(boolean arg0) {
        this.field7297 = arg0;
        this.field7299.method3210(false);
    }

    @OriginalMember(owner = "client!ii", name = "w", descriptor = "()V", line = 1065)
    public final void method635() {
        if (this.field7280 != null) {
            this.field7292 = this.field7276.field1703;
            this.field7315 = this.field7276.field1701;
            this.field7286 = this.field7276.field1700;
            this.field7287 = this.field7303;
            this.field7311 = this.field7317;
            this.field7310 = this.field7293;
        } else {
            this.field7315 = 1;
            this.field7286 = 1;
            this.field7292 = null;
            this.field7311 = 1;
            this.field7310 = 1;
            this.field7287 = null;
        }
        this.field7302 = null;
        this.method3108();
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 1089)
    public final void method2110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        class351 var14 = this.method3097(Thread.currentThread());
        class239 var15 = var14.field4494;
        var15.field3325 = false;
        int var16 = arg0 - this.field7307;
        int var17 = arg3 - this.field7307;
        int var18 = arg6 - this.field7307;
        int var19 = arg1 - this.field7319;
        int var20 = arg4 - this.field7319;
        int var21 = arg7 - this.field7319;
        var15.field3317 = var16 < 0 || var16 > var15.field3324 || var17 < 0 || var17 > var15.field3324 || var18 < 0 || var18 > var15.field3324;
        int var22 = arg9 >>> 24;
        if (arg12 != 0 && (arg12 != 1 || var22 != 255)) {
            if (arg12 == 1) {
                var15.field3329 = 255 - var22;
                var15.field3327 = false;
                var15.method1526((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
            } else {
                if (arg12 != 2) {
                    throw new IllegalArgumentException();
                }
                var15.field3329 = 128;
                var15.field3327 = true;
                var15.method1526((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
            }
        } else {
            var15.field3329 = 0;
            var15.field3327 = false;
            var15.method1526((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
        }
        var15.field3325 = true;
    }

    @OriginalMember(owner = "client!ii", name = "K", descriptor = "([I)V", line = 1130)
    public final void method2163(int[] arg0) {
        arg0[0] = this.field7291;
        arg0[1] = this.field7309;
        arg0[2] = this.field7283;
        arg0[3] = this.field7320;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(IIIID)V", line = 1137)
    public final void method614(int arg0, int arg1, int arg2, int arg3, double arg4) {
        int var7 = this.field7311 - arg2;
        int var8 = this.field7311 * arg1 + arg0;
        float[] var9 = this.field7287;
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

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)Lhs;", line = 1165)
    public final class358 method600(int arg0, int arg1) {
        return this.method2113(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "()Z", line = 1168)
    public final boolean method2079() {
        return false;
    }

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "()Z", line = 1171)
    public final boolean method569() {
        return false;
    }

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "(I)V", line = 1174)
    public final void method2178(int arg0) {
        this.field7316[arg0].method1996((byte) 114, (Runnable) null);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIILaa;II)V", line = 1178)
    public final void method2072(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class571 arg6, int arg7, int arg8) {
        class293 var10 = (class293) arg6;
        int[] var11 = var10.field3826;
        int[] var12 = var10.field3828;
        int var13 = this.field7309 > arg8 ? this.field7309 : arg8;
        int var14 = this.field7320 < var11.length + arg8 ? this.field7320 : var11.length + arg8;
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
            if (arg0 < this.field7291) {
                var18 += (this.field7291 - arg0) * var20;
                arg0 = this.field7291;
            }
            if (var21 >= this.field7283) {
                var21 = this.field7283 - 1;
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
                                int var28 = this.field7315 * var25 + arg0;
                                int var29 = this.field7292[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field7292[var28] = var23 + var30;
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
                                int var34 = this.field7315 * var31 + arg0;
                                int var35 = this.field7292[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field7292[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field7292[this.field7315 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field7291 && var64 < this.field7283 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field7292[this.field7315 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field7291 && var50 < this.field7283 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field7315 * arg1 + var50;
                        int var54 = this.field7292[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field7292[this.field7315 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field7291 && var56 < this.field7283 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field7315 * arg1 + var56;
                        int var60 = this.field7292[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field7292[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "()V", line = 1416)
    public final void method2203() {
        this.field7299.method3210(false);
        this.field7312.method3210(false);
    }

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "(I)V", line = 1420)
    public final void method2073(int arg0) {
        this.field7314 = arg0;
        this.field7299.method3210(false);
    }

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "(II)I", line = 1424)
    public final int method2101(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "()Z", line = 1428)
    public final boolean method2170() {
        return true;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(IIIIII)Lcd;", line = 1431)
    public final class22 method2134(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lev;)V", line = 1435)
    public final void method2122(class347 arg0) {
        class351 var2 = this.method3097(Thread.currentThread());
        class467 var3 = arg0.field4410.field6953;
        for (class467 var4 = var3.field6370; var3 != var4; var4 = var4.field6370) {
            class387 var5 = (class387) var4;
            int var6 = var5.field5402 >> 12;
            int var7 = var5.field5411 >> 12;
            int var8 = var5.field5404 >> 12;
            float var9 = (float) var8 * this.field7308.field4445 + (float) var6 * this.field7308.field4435 + (float) var7 * this.field7308.field4419 + this.field7308.field4428;
            if (!(var9 < (float) this.field7300) && !(var9 > (float) var2.field4455)) {
                int var10 = (int) (((float) var8 * this.field7308.field4440 + (float) var6 * this.field7308.field4446 + (float) var7 * this.field7308.field4436 + this.field7308.field4424) * (float) this.field7305 / var9) + this.field7296;
                int var11 = (int) (((float) var8 * this.field7308.field4442 + (float) var6 * this.field7308.field4438 + (float) var7 * this.field7308.field4433 + this.field7308.field4439) * (float) this.field7318 / var9) + this.field7295;
                if (var10 >= this.field7291 && var10 <= this.field7283 && var11 >= this.field7309 && var11 <= this.field7320) {
                    if (var9 == 0.0F) {
                        var9 = 1.0F;
                    }
                    this.method3099(var5, var10, var11, (int) var9, (int) ((float) (this.field7305 * var5.field5406 >> 12) / var9));
                }
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "()Z", line = 1473)
    public final boolean method2174() {
        return false;
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(II)V", line = 1476)
    public final void method632(int arg0, int arg1) throws class425 {
        if (this.field7280 != null && this.field7276 != null) {
            try {
                Graphics var3 = this.field7280.getGraphics();
                this.field7276.method798(arg0, this.field7281, (byte) -63, var3, 0, this.field7279, 0, arg1);
            } catch (Exception var4) {
                this.field7280.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!ii", name = "E", descriptor = "()I", line = 1492)
    public final int method2179() {
        return 0;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II[I[I)Laa;", line = 1495)
    public final class571 method2092(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class293(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)V", line = 1497)
    public final void method559(boolean arg0) {
    }

    @OriginalMember(owner = "client!ii", name = "HA", descriptor = "(IIII[I)V", line = 1501)
    public final void method2195(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        float var6 = (float) arg2 * this.field7308.field4445 + (float) arg0 * this.field7308.field4435 + (float) arg1 * this.field7308.field4419 + this.field7308.field4428;
        if (!(var6 < (float) this.field7300) && !(var6 > (float) this.field7301)) {
            int var7 = (int) (((float) arg2 * this.field7308.field4440 + (float) arg0 * this.field7308.field4446 + (float) arg1 * this.field7308.field4436 + this.field7308.field4424) * (float) this.field7305 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field7308.field4442 + (float) arg0 * this.field7308.field4438 + (float) arg1 * this.field7308.field4433 + this.field7308.field4439) * (float) this.field7318 / (float) arg3);
            if (var7 >= this.field7307 && var7 <= this.field7288 && var8 >= this.field7319 && var8 <= this.field7294) {
                arg4[0] = var7 - this.field7307;
                arg4[1] = var8 - this.field7319;
                arg4[2] = (int) var6;
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lev;I)V", line = 1526)
    public final void method2112(class347 arg0, int arg1) {
        class351 var3 = this.method3097(Thread.currentThread());
        class467 var4 = arg0.field4410.field6953;
        for (class467 var5 = var4.field6370; var4 != var5; var5 = var5.field6370) {
            class387 var6 = (class387) var5;
            int var7 = var6.field5402 >> 12;
            int var8 = var6.field5411 >> 12;
            int var9 = var6.field5404 >> 12;
            float var10 = (float) var9 * this.field7308.field4445 + (float) var7 * this.field7308.field4435 + (float) var8 * this.field7308.field4419 + this.field7308.field4428;
            if (!(var10 < (float) this.field7300) && !(var10 > (float) var3.field4455)) {
                int var11 = (int) (((float) var9 * this.field7308.field4440 + (float) var7 * this.field7308.field4446 + (float) var8 * this.field7308.field4436 + this.field7308.field4424) * (float) this.field7305 / (float) arg1) + this.field7296;
                int var12 = (int) (((float) var9 * this.field7308.field4442 + (float) var7 * this.field7308.field4438 + (float) var8 * this.field7308.field4433 + this.field7308.field4439) * (float) this.field7318 / (float) arg1) + this.field7295;
                if (var11 >= this.field7291 && var11 <= this.field7283 && var12 >= this.field7309 && var12 <= this.field7320) {
                    if (var10 == 0.0F) {
                        var10 = 1.0F;
                    }
                    this.method3099(var6, var11, var12, (int) var10, (this.field7305 * var6.field5406 >> 12) / arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "()Z", line = 1564)
    public final boolean method2100() {
        return false;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIIIIII)V", line = 1567)
    public final void method3100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 0 && arg4 != 0) {
            if (arg6 != 65535 && !super.field7694.method91(arg6, -22805).field6389) {
                if (this.field7322 != arg6) {
                    class21 var11 = (class21) this.field7312.method3200((long) arg6, -19983);
                    if (var11 == null) {
                        int[] var12 = this.method3095(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = this.method3102(arg6) ? 64 : this.field7314;
                        var11 = this.method3258(var12, 1, 0, var13, var13, var13);
                        this.field7312.method3199((byte) 78, var11, (long) arg6);
                    }
                    this.field7322 = arg6;
                    this.field7323 = var11;
                }
                ((class44) this.field7323).method303(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
            } else {
                this.method3110(arg0, arg1, arg2, arg3, arg7, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "(I)V", line = 1602)
    public final void method2147(int arg0) {
        this.field7313 = arg0;
        this.field7316 = new class351[this.field7313];
        for (int var2 = 0; var2 < this.field7313; ++var2) {
            this.field7316[var2] = new class351(this);
        }
    }

    @OriginalMember(owner = "client!ii", name = "P", descriptor = "(IIIII)V", line = 1615)
    public final void method2191(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field7291 && arg0 < this.field7283) {
            if (arg1 < this.field7309) {
                arg2 -= this.field7309 - arg1;
                arg1 = this.field7309;
            }
            if (arg1 + arg2 > this.field7320) {
                arg2 = this.field7320 - arg1;
            }
            int var6 = this.field7315 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field7315 * var10 + var6;
                        int var12 = this.field7292[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field7292[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field7315 * var14 + var6;
                        int var16 = this.field7292[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field7292[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field7292[this.field7315 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "(I)I", line = 1692)
    public final int method3101(int arg0) {
        return super.field7694.method91(arg0, -22805).field6394 & 65535;
    }

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "()Lgba;", line = 1695)
    public final class702 method568() {
        return new class702(0, "Pure Java", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!ii", name = "za", descriptor = "(IIIII)V", line = 1699)
    public final void method2091(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field7309) {
            var6 = this.field7309;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field7320) {
            var7 = this.field7320;
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
                if (var64 < this.field7291) {
                    var64 = this.field7291;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field7283) {
                    var65 = this.field7283;
                }
                int var66 = this.field7315 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field7292[var66++] = arg3;
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
                if (var60 < this.field7291) {
                    var60 = this.field7291;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field7283 - 1) {
                    var61 = this.field7283 - 1;
                }
                int var62 = this.field7315 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field7292[var62++] = arg3;
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
                if (var28 < this.field7291) {
                    var28 = this.field7291;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field7283) {
                    var29 = this.field7283;
                }
                int var30 = this.field7315 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field7292[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field7292[var30++] = var15 + var33;
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
                if (var22 < this.field7291) {
                    var22 = this.field7291;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field7283 - 1) {
                    var23 = this.field7283 - 1;
                }
                int var24 = this.field7315 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field7292[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field7292[var24++] = var15 + var27;
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
                if (var47 < this.field7291) {
                    var47 = this.field7291;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field7283) {
                    var48 = this.field7283;
                }
                int var49 = this.field7315 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field7292[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field7292[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field7291) {
                    var39 = this.field7291;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field7283 - 1) {
                    var40 = this.field7283 - 1;
                }
                int var41 = this.field7315 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field7292[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field7292[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "(I)Z", line = 1985)
    public final boolean method3102(int arg0) {
        return this.field7297 || super.field7694.method91(arg0, -22805).field6391;
    }

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "(I)Z", line = 1991)
    public final boolean method3103(int arg0) {
        return super.field7694.method91(arg0, -22805).field6387 || super.field7694.method91(arg0, -22805).field6380;
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V", line = 1994)
    public final void method2098(int arg0) {
        class180.field2595 = arg0;
        class180.field2612 = arg0;
        if (this.field7313 > 1) {
            throw new IllegalStateException("No MT");
        } else {
            this.method2147(this.field7313);
            this.method2071(0);
        }
    }

    @OriginalMember(owner = "client!ii", name = "T", descriptor = "(IIII)V", line = 2003)
    public final void method2090(int arg0, int arg1, int arg2, int arg3) {
        if (this.field7291 < arg0) {
            this.field7291 = arg0;
        }
        if (this.field7309 < arg1) {
            this.field7309 = arg1;
        }
        if (this.field7283 > arg2) {
            this.field7283 = arg2;
        }
        if (this.field7320 > arg3) {
            this.field7320 = arg3;
        }
        this.method3104();
    }

    @OriginalMember(owner = "client!ii", name = "B", descriptor = "()V", line = 2018)
    private final void method3104() {
        this.field7307 = this.field7291 - this.field7296;
        this.field7288 = this.field7283 - this.field7296;
        this.field7319 = this.field7309 - this.field7295;
        this.field7294 = this.field7320 - this.field7295;
        for (int var1 = 0; var1 < this.field7313; ++var1) {
            class239 var5 = this.field7316[var1].field4494;
            var5.field3322 = this.field7296 - this.field7291;
            var5.field3326 = this.field7295 - this.field7309;
            var5.field3324 = this.field7283 - this.field7291;
            var5.field3319 = this.field7320 - this.field7309;
        }
        int var2 = this.field7315 * this.field7309 + this.field7291;
        for (int var3 = this.field7309; var3 < this.field7320; ++var3) {
            for (int var4 = 0; var4 < this.field7313; ++var4) {
                this.field7316[var4].field4494.field3321[var3 - this.field7309] = var2;
            }
            var2 += this.field7315;
        }
    }

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "()Z", line = 2056)
    public final boolean method2162() {
        return false;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Luha;)V", line = 2059)
    public final void method2068(class723 arg0) {
        this.field7308 = (class349) arg0;
    }

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "()Z", line = 2062)
    public final boolean method2099() {
        return true;
    }

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "(I)[I", line = 2066)
    public final int[] method3105(int arg0) {
        class538 var2 = this.field7299;
        class618 var3;
        synchronized (this.field7299) {
            var3 = (class618) this.field7299.method3200((long) arg0, -19983);
            if (var3 == null) {
                if (!super.field7694.method86((byte) 117, arg0)) {
                    return null;
                }
                class468 var5 = super.field7694.method91(arg0, -22805);
                int var6 = !var5.field6391 && !this.field7297 ? this.field7314 : 64;
                var3 = new class618(arg0, var6, super.field7694.method87(true, var6, 0.7F, var6, true, arg0), var5.field6393 != 1);
                this.field7299.method3199((byte) 78, var3, (long) arg0);
            }
        }
        var3.field8789 = true;
        return var3.method3624();
    }

    @OriginalMember(owner = "client!ii", name = "A", descriptor = "(ILaa;II)V", line = 2087)
    public final void method2093(int arg0, class571 arg1, int arg2, int arg3) {
        class293 var5 = (class293) arg1;
        int[] var6 = var5.field3826;
        int[] var7 = var5.field3828;
        int var8;
        if (this.field7320 < var6.length + arg3) {
            var8 = this.field7320 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field7309 > arg3) {
            var9 = this.field7309 - arg3;
            arg3 = this.field7309;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field7315 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field7291 > var12) {
                    var13 -= this.field7291 - var12;
                    var12 = this.field7291;
                }
                if (this.field7283 < var12 + var13) {
                    var13 = this.field7283 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field7292[var14++] = arg0;
                }
                var10 += this.field7315;
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "(I)Lza;", line = 2144)
    public final class256 method2226(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!ii", name = "aa", descriptor = "(IIIIII)V", line = 2147)
    public final void method2194(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field7291) {
            arg2 -= this.field7291 - arg0;
            arg0 = this.field7291;
        }
        if (arg1 < this.field7309) {
            arg3 -= this.field7309 - arg1;
            arg1 = this.field7309;
        }
        if (arg0 + arg2 > this.field7283) {
            arg2 = this.field7283 - arg0;
        }
        if (arg1 + arg3 > this.field7320) {
            arg3 = this.field7320 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field7283 && arg1 <= this.field7320) {
            int var7 = this.field7315 - arg2;
            int var8 = this.field7315 * arg1 + arg0;
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
                            this.field7292[var24] = arg4;
                            ++var24;
                            this.field7292[var24] = arg4;
                            ++var24;
                            this.field7292[var24] = arg4;
                            ++var24;
                            this.field7292[var24] = arg4;
                            ++var24;
                            this.field7292[var24] = arg4;
                            ++var24;
                            this.field7292[var24] = arg4;
                            ++var24;
                            this.field7292[var24] = arg4;
                            ++var24;
                            this.field7292[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field7292[var24] = arg4;
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
                        int var14 = this.field7292[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                        this.field7292[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field7292[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field7292[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 2282)
    public final void method2211(Canvas arg0) {
        if (this.field7280 == arg0) {
            this.method2095((Canvas) null);
        }
        class125 var2 = (class125) this.field7278.method1381(true, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method3065(-17363);
        }
    }

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "()Z", line = 2292)
    public final boolean method2157() {
        return false;
    }

    @OriginalMember(owner = "client!ii", name = "Q", descriptor = "(IIIIII[BII)V", line = 2295)
    public final void method2115(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field7315 * arg1 + arg0;
            int var15 = this.field7315 - arg2;
            if (arg1 + arg3 > this.field7320) {
                arg3 -= arg1 + arg3 - this.field7320;
            }
            if (arg1 < this.field7309) {
                int var16 = this.field7309 - arg1;
                arg3 -= var16;
                var14 += this.field7315 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field7283) {
                int var17 = arg0 + arg2 - this.field7283;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field7291) {
                int var18 = this.field7291 - arg0;
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
                            int var28 = this.field7292[var14];
                            this.field7292[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field7292[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field7292[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field7292[var14++] = arg5;
                        } else {
                            this.field7292[var14++] = arg4;
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

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 2470)
    public final void method622(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class425 {
        if (this.field7280 != null && this.field7276 != null) {
            try {
                Graphics var5 = this.field7280.getGraphics();
                for (int var6 = 0; var6 < arg1; ++var6) {
                    Rectangle var7 = arg0[var6];
                    if (var7.x + arg2 <= this.field7315 && var7.y + arg3 <= this.field7286 && var7.x + arg2 + var7.width > 0 && var7.y + arg3 + var7.height > 0) {
                        this.field7276.method798(var7.x + arg2, var7.width, (byte) -63, var5, var7.x, var7.height, var7.y, var7.y + arg3);
                    }
                }
            } catch (Exception var8) {
                this.field7280.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(FFF)V", line = 2498)
    public final void method570(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lcha;)V", line = 2502)
    public final void method595(class279 arg0) {
        class724 var2 = (class724) arg0;
        this.field7315 = var2.field10191;
        this.field7286 = var2.field10203;
        this.field7292 = var2.field10202;
        this.field7302 = var2;
        this.field7311 = var2.field10191;
        this.field7310 = var2.field10203;
        this.field7287 = var2.field10205;
        this.method3108();
    }

    @OriginalMember(owner = "client!ii", name = "pa", descriptor = "()V", line = 2515)
    public final void method2200() {
        for (int var1 = 0; var1 < this.field7316.length; ++var1) {
            this.field7316[var1].field4459 = this.field7316[var1].field4462;
            this.field7316[var1].field4461 = false;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "([I)V", line = 2525)
    public final void method2127(int[] arg0) {
        arg0[0] = this.field7315;
        arg0[1] = this.field7286;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIII)V", line = 2528)
    public final void method574(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "()Luha;", line = 2532)
    public final class723 method2087() {
        class351 var1 = this.method3097(Thread.currentThread());
        return var1.field4469;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 2536)
    public final class339 method2213(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class84(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lcd;)V", line = 2538)
    public final void method2136(class22 arg0) {
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIIIII)V", line = 2541)
    public final void method2201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg2 - arg0;
        int var11 = arg3 - arg1;
        if (var11 == 0) {
            if (var10 >= 0) {
                this.method3109(arg0, arg1, var10 + 1, arg4, arg5, arg6, arg7, arg8);
            } else {
                int var12 = arg6 + arg7;
                int var13 = arg8 % var12;
                int var14 = arg6 + var12 - var13 - (-var10 + 1) % var12;
                int var15 = var14 % var12;
                if (var15 < 0) {
                    var15 += var12;
                }
                this.method3109(arg0 + var10, arg1, -var10 + 1, arg4, arg5, arg6, arg7, var15);
            }
        } else if (var10 == 0) {
            if (var11 >= 0) {
                this.method3096(arg0, arg1, var11 + 1, arg4, arg5, arg6, arg7, arg8);
            } else {
                int var16 = arg6 + arg7;
                int var17 = arg8 % var16;
                int var18 = arg6 + var16 - var17 - (-var11 + 1) % var16;
                int var19 = var18 % var16;
                if (var19 < 0) {
                    var19 += var16;
                }
                this.method3096(arg0, arg1 + var11, -var11 + 1, arg4, arg5, arg6, arg7, var19);
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
                            if (arg0 >= this.field7291 && arg0 < this.field7283 && var37 >= this.field7309 && var37 < this.field7320 && var24 < var21) {
                                int var38 = this.field7315 * var37 + arg0;
                                int var39 = this.field7292[var38];
                                int var40 = ((var39 & 16711935) * var36 >> 8 & 16711935) + ((var39 & 65280) * var36 >> 8 & 65280);
                                this.field7292[var38] = var35 + var40;
                            }
                            var29 += var31;
                            ++arg0;
                            int var41 = var24 + var34;
                            var24 = var41 % var23;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var32) {
                            int var42 = var29 >> 16;
                            if (arg0 >= this.field7291 && arg0 < this.field7283 && var42 >= this.field7309 && var42 < this.field7320 && var24 < var21) {
                                int var43 = this.field7315 * var42 + arg0;
                                int var44 = this.field7292[var43];
                                int var45 = arg4 + var44;
                                int var46 = (arg4 & 16711935) + (var44 & 16711935);
                                int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                                this.field7292[var43] = var45 - var47 | var47 - (var47 >>> 8);
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
                        if (arg0 >= this.field7291 && arg0 < this.field7283 && var49 >= this.field7309 && var49 < this.field7320 && var24 < var21) {
                            this.field7292[this.field7315 * var49 + arg0] = arg4;
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
                            if (arg1 >= this.field7309 && arg1 < this.field7320 && var60 >= this.field7291 && var60 < this.field7283 && var24 < var21) {
                                int var61 = this.field7315 * arg1 + var60;
                                int var62 = this.field7292[var61];
                                int var63 = ((var62 & 16711935) * var59 >> 8 & 16711935) + ((var62 & 65280) * var59 >> 8 & 65280);
                                this.field7292[this.field7315 * arg1 + var60] = var58 + var63;
                            }
                            var52 += var54;
                            ++arg1;
                            int var64 = var24 + var57;
                            var24 = var64 % var23;
                        }
                    } else if (arg5 == 2) {
                        while (arg1 <= var55) {
                            int var65 = var52 >> 16;
                            if (arg1 >= this.field7309 && arg1 < this.field7320 && var65 >= this.field7291 && var65 < this.field7283 && var24 < var21) {
                                int var66 = this.field7315 * arg1 + var65;
                                int var67 = this.field7292[var66];
                                int var68 = arg4 + var67;
                                int var69 = (arg4 & 16711935) + (var67 & 16711935);
                                int var70 = (var68 - var69 & 65536) + (var69 & 16777472);
                                this.field7292[var66] = var68 - var70 | var70 - (var70 >>> 8);
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
                        if (arg1 >= this.field7309 && arg1 < this.field7320 && var72 >= this.field7291 && var72 < this.field7283 && var24 < var21) {
                            this.field7292[this.field7315 * arg1 + var72] = arg4;
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

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "(II)V", line = 2788)
    public final void method2143(int arg0, int arg1) {
        class351 var3 = this.method3097(Thread.currentThread());
        this.field7300 = arg0;
        this.field7301 = arg1;
        var3.field4455 = this.field7301 - 255;
    }

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "()V", line = 2794)
    public final void method587() {
        if (this.field7277) {
            class729.method4066(false, true, -2679);
            this.field7277 = false;
        }
        this.field7276 = null;
        this.field7280 = null;
        this.field7281 = 0;
        this.field7279 = 0;
        this.field7278 = null;
        this.field7282 = true;
    }

    @OriginalMember(owner = "client!ii", name = "r", descriptor = "()V", line = 2807)
    public final void method617() {
    }

    @OriginalMember(owner = "client!ii", name = "U", descriptor = "(IIIII)V", line = 2810)
    public final void method2173(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field7309 && arg1 < this.field7320) {
            if (arg0 < this.field7291) {
                arg2 -= this.field7291 - arg0;
                arg0 = this.field7291;
            }
            if (arg0 + arg2 > this.field7283) {
                arg2 = this.field7283 - arg0;
            }
            int var6 = this.field7315 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field7292[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field7292[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field7292[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field7292[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field7292[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Loq;[Ltba;Z)Lda;", line = 2883)
    public final class400 method2085(class742 arg0, class320[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field4122;
            var5[var7] = arg1[var7].field4121;
            if (arg1[var7].field4124 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                return new class115(this, arg0, arg1, var4, var5);
            } else {
                return new class415(this, arg0, arg1, var4, var5);
            }
        } else if (var6) {
            throw new IllegalArgumentException("");
        } else {
            return new class43(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V", line = 2920)
    public class521(Canvas arg0, class268 arg1, int arg2, int arg3) {
        this(arg1);
        this.method2137(arg0, arg2, arg3);
        this.method2095(arg0);
    }

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "(I)I", line = 2925)
    public final int method3106(int arg0) {
        return super.field7694.method91(arg0, -22805).field6393;
    }

    @OriginalMember(owner = "client!ii", name = "la", descriptor = "()V", line = 2928)
    public final void method2198() {
        this.field7291 = 0;
        this.field7309 = 0;
        this.field7283 = this.field7315;
        this.field7320 = this.field7286;
        this.method3104();
    }

    @OriginalMember(owner = "client!ii", name = "u", descriptor = "()I", line = 2935)
    public final int method2124() {
        return 0;
    }

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "()I", line = 2938)
    public final int method2230() {
        return this.field7300;
    }

    @OriginalMember(owner = "client!ii", name = "ra", descriptor = "(IIII)V", line = 2944)
    public final void method2151(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field7316.length; ++var5) {
            this.field7316[var5].field4462 = this.field7316[var5].field4459;
            this.field7316[var5].field4463 = arg0;
            this.field7316[var5].field4459 = arg1;
            this.field7316[var5].field4454 = arg2;
            this.field7316[var5].field4461 = true;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)I", line = 2957)
    public final int method2105(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 2962)
    public final void method2137(Canvas arg0, int arg1, int arg2) {
        class125 var4 = (class125) this.field7278.method1381(true, (long) arg0.hashCode());
        if (var4 == null) {
            class125 var5 = class511.method3049(arg2, (byte) 126, arg1, arg0);
            this.field7278.method1387(var5, (long) arg0.hashCode(), (byte) -117);
        } else {
            if (var4.field1701 != arg1 || var4.field1700 != arg2) {
                this.method2224(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 2976)
    public final void method2221(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class571 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        class293 var13 = (class293) arg6;
        int[] var14 = var13.field3826;
        int[] var15 = var13.field3828;
        int var16 = this.field7309 > arg8 ? this.field7309 : arg8;
        int var17 = this.field7320 < var14.length + arg8 ? this.field7320 : var14.length + arg8;
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
                        if (arg0 >= this.field7291 && arg0 < this.field7283 && var37 >= var16 && var37 < var17 && var22 < var19) {
                            int var39 = var14[var38] + arg7;
                            if (arg0 >= var39 && arg0 < var15[var38] + var39) {
                                int var40 = this.field7315 * var37 + arg0;
                                int var41 = this.field7292[var40];
                                int var42 = ((var41 & 16711935) * var36 >> 8 & 16711935) + ((var41 & 65280) * var36 >> 8 & 65280);
                                this.field7292[var40] = var35 + var42;
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
                        if (arg0 >= this.field7291 && arg0 < this.field7283 && var44 >= var16 && var44 < var17 && var22 < var19) {
                            int var46 = var14[var45] + arg7;
                            if (arg0 >= var46 && arg0 < var15[var45] + var46) {
                                int var47 = this.field7315 * var44 + arg0;
                                int var48 = this.field7292[var47];
                                int var49 = arg4 + var48;
                                int var50 = (arg4 & 16711935) + (var48 & 16711935);
                                int var51 = (var49 - var50 & 65536) + (var50 & 16777472);
                                this.field7292[var47] = var49 - var51 | var51 - (var51 >>> 8);
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
                    if (arg0 >= this.field7291 && arg0 < this.field7283 && var53 >= var16 && var53 < var17 && var22 < var19) {
                        int var55 = var14[var54] + arg7;
                        if (arg0 >= var55 && arg0 < var15[var54] + var55) {
                            this.field7292[this.field7315 * var53 + arg0] = arg4;
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
                    if (arg1 >= var16 && arg1 < var17 && var80 >= this.field7291 && var80 < this.field7283 && var22 < var19 && var80 >= var14[var81] + arg7 && var80 < var14[var81] + arg7 + var15[var81]) {
                        this.field7292[this.field7315 * arg1 + var80] = arg4;
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
                    if (arg1 >= var16 && arg1 < var17 && var66 >= this.field7291 && var66 < this.field7283 && var22 < var19 && var66 >= var14[var67] + arg7 && var66 < var14[var67] + arg7 + var15[var67]) {
                        int var68 = this.field7315 * arg1 + var66;
                        int var69 = this.field7292[var68];
                        int var70 = ((var69 & 16711935) * var65 >> 8 & 16711935) + ((var69 & 65280) * var65 >> 8 & 65280);
                        this.field7292[this.field7315 * arg1 + var66] = var64 + var70;
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
                    if (arg1 >= var16 && arg1 < var17 && var72 >= this.field7291 && var72 < this.field7283 && var22 < var19 && var72 >= var14[var73] + arg7 && var72 < var14[var73] + arg7 + var15[var73]) {
                        int var74 = this.field7315 * arg1 + var72;
                        int var75 = this.field7292[var74];
                        int var76 = arg4 + var75;
                        int var77 = (arg4 & 16711935) + (var75 & 16711935);
                        int var78 = (var76 - var77 & 65536) + (var77 & 16777472);
                        this.field7292[var74] = var76 - var78 | var78 - (var78 >>> 8);
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

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "(I)V", line = 3221)
    public final void method2071(int arg0) {
        this.field7316[arg0].method1996((byte) 107, Thread.currentThread());
    }

    @OriginalMember(owner = "client!ii", name = "ZA", descriptor = "(IFFFFF)V", line = 3224)
    public final void method2161(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field7306 = (int) (arg1 * 65535.0F);
        this.field7284 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field7304 = (int) (arg3 * 65535.0F / var7);
        this.field7298 = (int) (arg4 * 65535.0F / var7);
        this.field7289 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "(I)Z", line = 3233)
    public final boolean method3107(int arg0) {
        return super.field7694.method86((byte) 117, arg0);
    }

    @OriginalMember(owner = "client!ii", name = "x", descriptor = "()Luha;", line = 3238)
    public final class723 method2141() {
        return new class349();
    }

    @OriginalMember(owner = "client!ii", name = "na", descriptor = "(IIII)[I", line = 3242)
    public final int[] method590(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field7315 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field7292[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ii", name = "C", descriptor = "()V", line = 3269)
    private final void method3108() {
        for (int var1 = 0; var1 < this.field7313; ++var1) {
            this.field7316[var1].method1998(123);
        }
        this.method2198();
    }

    @OriginalMember(owner = "client!ii", name = "H", descriptor = "(III[I)V", line = 3279)
    public final void method2131(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field7308.field4445 + (float) arg0 * this.field7308.field4435 + (float) arg1 * this.field7308.field4419 + this.field7308.field4428;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field7308.field4440 + (float) arg0 * this.field7308.field4446 + (float) arg1 * this.field7308.field4436 + this.field7308.field4424) * (float) this.field7305 / var5);
            int var7 = (int) (((float) arg2 * this.field7308.field4442 + (float) arg0 * this.field7308.field4438 + (float) arg1 * this.field7308.field4433 + this.field7308.field4439) * (float) this.field7318 / var5);
            arg3[0] = var6 - this.field7307;
            arg3[1] = var7 - this.field7319;
            arg3[2] = (int) var5;
        }
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Ld;)V", line = 3295)
    private class521(class268 arg0) {
        super(arg0);
        this.field7277 = false;
        this.field7282 = false;
        this.field7278 = new class209(4);
        this.field7285 = 0;
        this.field7284 = 78642;
        this.field7291 = 0;
        this.field7283 = 0;
        this.field7300 = 50;
        this.field7309 = 0;
        this.field7305 = 512;
        this.field7301 = 3500;
        this.field7290 = 75518;
        this.field7306 = 45823;
        this.field7318 = 512;
        this.field7297 = false;
        this.field7314 = 128;
        this.field7321 = 0;
        this.field7320 = 0;
        this.field7312 = new class538(16);
        this.field7322 = -1;
        this.field7299 = new class538(256);
        this.field7308 = new class349();
        this.method2147(1);
        this.method2071(0);
        class594.method3523(true, (byte) 112, true);
        this.field7277 = true;
        this.field7275 = (int) class224.method1457((byte) -62);
    }

    @OriginalMember(owner = "client!ii", name = "GA", descriptor = "(I)V", line = 3305)
    public final void method563(int arg0) {
        this.method2194(0, 0, this.field7315, this.field7286, arg0, 0);
    }

    @OriginalMember(owner = "client!ii", name = "y", descriptor = "()Z", line = 3308)
    public final boolean method2180() {
        return true;
    }

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "()Z", line = 3312)
    public final boolean method608() {
        return false;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(IIIIIIII)V", line = 3315)
    private final void method3109(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 >= this.field7309 && arg1 < this.field7320) {
            int var9 = this.field7315 * arg1 + arg0;
            int var10 = arg3 >>> 24;
            int var11 = arg5 + arg6;
            int var12 = arg7 % var11;
            if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
                if (arg4 == 1) {
                    int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
                    int var14 = 256 - var10;
                    int var15 = 0;
                    while (var15 < arg2) {
                        if (arg0 + var15 >= this.field7291 && arg0 + var15 < this.field7283 && var12 < arg5) {
                            int var16 = this.field7292[var9 + var15];
                            int var17 = ((var16 & 16711935) * var14 >> 8 & 16711935) + ((var16 & 65280) * var14 >> 8 & 65280);
                            this.field7292[var9 + var15] = var13 + var17;
                        }
                        ++var15;
                        ++var12;
                        var12 %= var11;
                    }
                } else if (arg4 == 2) {
                    int var18 = 0;
                    while (var18 < arg2) {
                        if (arg0 + var18 >= this.field7291 && arg0 + var18 < this.field7283 && var12 < arg5) {
                            int var19 = this.field7292[var9 + var18];
                            int var20 = arg3 + var19;
                            int var21 = (arg3 & 16711935) + (var19 & 16711935);
                            int var22 = (var20 - var21 & 65536) + (var21 & 16777472);
                            this.field7292[var9 + var18] = var20 - var22 | var22 - (var22 >>> 8);
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
                    if (arg0 + var23 >= this.field7291 && arg0 + var23 < this.field7283 && var12 < arg5) {
                        this.field7292[var9 + var23] = arg3;
                    }
                    ++var23;
                    ++var12;
                    var12 %= var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "()V", line = 3394)
    public final void method589() {
    }

    @OriginalMember(owner = "client!ii", name = "X", descriptor = "(I)V", line = 3396)
    public final void method2104(int arg0) {
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V", line = 3400)
    public final void method639(int arg0) {
        int var2 = arg0 - this.field7275;
        for (Object var3 = this.field7299.method3207(false); var3 != null; var3 = this.field7299.method3205(512)) {
            class618 var4 = (class618) var3;
            if (var4.field8789) {
                var4.field8786 += var2;
                int var5 = var4.field8786 / 20;
                if (var5 > 0) {
                    class468 var6 = super.field7694.method91(var4.field8790, -22805);
                    var4.method3626(var6.field6388 * var2 * 50 / 1000, var6.field6390 * var2 * 50 / 1000);
                    var4.field8786 -= var5 * 20;
                }
                var4.field8789 = false;
            }
        }
        this.field7275 = arg0;
        this.field7312.method3204((byte) -76, 5);
        this.field7299.method3204((byte) -115, 5);
    }

    @OriginalMember(owner = "client!ii", name = "EA", descriptor = "(IIII)V", line = 3433)
    public final void method2186(int arg0, int arg1, int arg2, int arg3) {
        class351 var5 = this.method3097(Thread.currentThread());
        var5.field4463 = arg0;
        var5.field4459 = arg1;
        var5.field4454 = arg2;
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(IIIIII)V", line = 3441)
    private final void method3110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 0) {
            arg3 = -arg3;
        }
        int var7 = arg1 - arg3;
        if (var7 < this.field7309) {
            var7 = this.field7309;
        }
        int var8 = arg1 + arg3 + 1;
        if (var8 > this.field7320) {
            var8 = this.field7320;
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
                if (var65 < this.field7291) {
                    var65 = this.field7291;
                }
                int var66 = arg0 + var11;
                if (var66 > this.field7283) {
                    var66 = this.field7283;
                }
                int var67 = this.field7315 * var9 + var65;
                for (int var68 = var65; var68 < var66; ++var68) {
                    if ((float) arg2 < this.field7287[var67]) {
                        this.field7292[var67] = arg4;
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
                if (var61 < this.field7291) {
                    var61 = this.field7291;
                }
                int var62 = arg0 + var56;
                if (var62 > this.field7283 - 1) {
                    var62 = this.field7283 - 1;
                }
                int var63 = this.field7315 * var9 + var61;
                for (int var64 = var61; var64 <= var62; ++var64) {
                    if ((float) arg2 < this.field7287[var63]) {
                        this.field7292[var63] = arg4;
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
                if (var29 < this.field7291) {
                    var29 = this.field7291;
                }
                int var30 = arg0 + var11;
                if (var30 > this.field7283) {
                    var30 = this.field7283;
                }
                int var31 = this.field7315 * var9 + var29;
                for (int var32 = var29; var32 < var30; ++var32) {
                    if ((float) arg2 < this.field7287[var31]) {
                        int var33 = this.field7292[var31];
                        int var34 = ((var33 & 16711935) * var17 >> 8 & 16711935) + ((var33 & 65280) * var17 >> 8 & 65280);
                        this.field7292[var31] = var16 + var34;
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
                if (var23 < this.field7291) {
                    var23 = this.field7291;
                }
                int var24 = arg0 + var18;
                if (var24 > this.field7283 - 1) {
                    var24 = this.field7283 - 1;
                }
                int var25 = this.field7315 * var9 + var23;
                for (int var26 = var23; var26 <= var24; ++var26) {
                    if ((float) arg2 < this.field7287[var25]) {
                        int var27 = this.field7292[var25];
                        int var28 = ((var27 & 16711935) * var17 >> 8 & 16711935) + ((var27 & 65280) * var17 >> 8 & 65280);
                        this.field7292[var25] = var16 + var28;
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
                if (var48 < this.field7291) {
                    var48 = this.field7291;
                }
                int var49 = arg0 + var11;
                if (var49 > this.field7283) {
                    var49 = this.field7283;
                }
                int var50 = this.field7315 * var9 + var48;
                for (int var51 = var48; var51 < var49; ++var51) {
                    if ((float) arg2 < this.field7287[var50]) {
                        int var52 = this.field7292[var50];
                        int var53 = arg4 + var52;
                        int var54 = (arg4 & 16711935) + (var52 & 16711935);
                        int var55 = (var53 - var54 & 65536) + (var54 & 16777472);
                        this.field7292[var50] = var53 - var55 | var55 - (var55 >>> 8);
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
                if (var40 < this.field7291) {
                    var40 = this.field7291;
                }
                int var41 = arg0 + var35;
                if (var41 > this.field7283 - 1) {
                    var41 = this.field7283 - 1;
                }
                int var42 = this.field7315 * var9 + var40;
                for (int var43 = var40; var43 <= var41; ++var43) {
                    if ((float) arg2 < this.field7287[var42]) {
                        int var44 = this.field7292[var42];
                        int var45 = arg4 + var44;
                        int var46 = (arg4 & 16711935) + (var44 & 16711935);
                        int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                        this.field7292[var42] = var45 - var47 | var47 - (var47 >>> 8);
                    }
                    ++var42;
                }
                ++var9;
                var39 += var36 + var36;
                var38 += var36++ + var36;
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "DA", descriptor = "(IIII)V", line = 3761)
    public final void method2081(int arg0, int arg1, int arg2, int arg3) {
        this.field7296 = arg0;
        this.field7295 = arg1;
        this.field7305 = arg2;
        this.field7318 = arg3;
        this.method3104();
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIZ)Lcw;", line = 3769)
    public final class21 method2113(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class546(this, arg0, arg1) : new class715(this, arg0, arg1);
    }
}
