import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class545 extends class66 {

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "Z")
    private boolean field7659;

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "Z")
    private boolean field7655;

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "Ltga;")
    private class64 field7657;

    @OriginalMember(owner = "client!ni", name = "E", descriptor = "I")
    private int field7668;

    @OriginalMember(owner = "client!ni", name = "J", descriptor = "I")
    public int field7673;

    @OriginalMember(owner = "client!ni", name = "K", descriptor = "I")
    public int field7674;

    @OriginalMember(owner = "client!ni", name = "R", descriptor = "I")
    public int field7681;

    @OriginalMember(owner = "client!ni", name = "D", descriptor = "I")
    public int field7667;

    @OriginalMember(owner = "client!ni", name = "X", descriptor = "I")
    public int field7687;

    @OriginalMember(owner = "client!ni", name = "O", descriptor = "I")
    public int field7678;

    @OriginalMember(owner = "client!ni", name = "Q", descriptor = "I")
    public int field7680;

    @OriginalMember(owner = "client!ni", name = "A", descriptor = "I")
    public int field7664;

    @OriginalMember(owner = "client!ni", name = "cb", descriptor = "Z")
    private boolean field7692;

    @OriginalMember(owner = "client!ni", name = "M", descriptor = "I")
    public int field7676;

    @OriginalMember(owner = "client!ni", name = "fb", descriptor = "I")
    public int field7695;

    @OriginalMember(owner = "client!ni", name = "hb", descriptor = "I")
    private int field7697;

    @OriginalMember(owner = "client!ni", name = "S", descriptor = "I")
    public int field7682;

    @OriginalMember(owner = "client!ni", name = "lb", descriptor = "I")
    public int field7701;

    @OriginalMember(owner = "client!ni", name = "N", descriptor = "Lpa;")
    private class387 field7677;

    @OriginalMember(owner = "client!ni", name = "mb", descriptor = "I")
    private int field7702;

    @OriginalMember(owner = "client!ni", name = "jb", descriptor = "Lpa;")
    private class387 field7699;

    @OriginalMember(owner = "client!ni", name = "C", descriptor = "Lcf;")
    public class628 field7666;

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "I")
    private int field7661;

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "I")
    private int field7660;

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "I")
    private int field7662;

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "I")
    public int field7663;

    @OriginalMember(owner = "client!ni", name = "B", descriptor = "I")
    private int field7665;

    @OriginalMember(owner = "client!ni", name = "F", descriptor = "I")
    private int field7669;

    @OriginalMember(owner = "client!ni", name = "G", descriptor = "I")
    public int field7670;

    @OriginalMember(owner = "client!ni", name = "H", descriptor = "I")
    public int field7671;

    @OriginalMember(owner = "client!ni", name = "L", descriptor = "I")
    public int field7675;

    @OriginalMember(owner = "client!ni", name = "P", descriptor = "I")
    public int field7679;

    @OriginalMember(owner = "client!ni", name = "U", descriptor = "I")
    public int field7684;

    @OriginalMember(owner = "client!ni", name = "V", descriptor = "I")
    private int field7685;

    @OriginalMember(owner = "client!ni", name = "W", descriptor = "I")
    public int field7686;

    @OriginalMember(owner = "client!ni", name = "Y", descriptor = "I")
    private int field7688;

    @OriginalMember(owner = "client!ni", name = "Z", descriptor = "I")
    public int field7689;

    @OriginalMember(owner = "client!ni", name = "ab", descriptor = "I")
    public int field7690;

    @OriginalMember(owner = "client!ni", name = "bb", descriptor = "I")
    public int field7691;

    @OriginalMember(owner = "client!ni", name = "db", descriptor = "I")
    public int field7693;

    @OriginalMember(owner = "client!ni", name = "kb", descriptor = "I")
    private int field7700;

    @OriginalMember(owner = "client!ni", name = "nb", descriptor = "Lqda;")
    private class112 field7703;

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "Lrs;")
    public class677 field7656;

    @OriginalMember(owner = "client!ni", name = "gb", descriptor = "Lhd;")
    private class772 field7696;

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7658;

    @OriginalMember(owner = "client!ni", name = "T", descriptor = "[F")
    public float[] field7683;

    @OriginalMember(owner = "client!ni", name = "ib", descriptor = "[F")
    public float[] field7698;

    @OriginalMember(owner = "client!ni", name = "eb", descriptor = "[I")
    public int[] field7694;

    @OriginalMember(owner = "client!ni", name = "I", descriptor = "[Llda;")
    private class509[] field7672;

    @OriginalMember(owner = "client!ni", name = "L", descriptor = "(III)V")
    public final void method435(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field7672.length; ++var4) {
            class509 var5 = this.field7672[var4];
            var5.field7249 = arg0 & 16777215;
            int var6 = var5.field7249 >>> 16 & 255;
            if (var6 < 2) {
                var6 = 2;
            }
            int var7 = var5.field7249 >> 8 & 255;
            if (var7 < 2) {
                var7 = 2;
            }
            int var8 = var5.field7249 & 255;
            if (var8 < 2) {
                var8 = 2;
            }
            var5.field7249 = var6 << 16 | var7 << 8 | var8;
            if (arg1 < 0) {
                var5.field7248 = false;
            } else {
                var5.field7248 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "()Z")
    public final boolean method434() {
        return false;
    }

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "()Lrda;")
    public final class689 method483() {
        return new class689(0, "Pure Java", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIIII)V")
    private final void method3160(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 >= this.field7678 && arg1 < this.field7673) {
            int var9 = this.field7686 * arg1 + arg0;
            int var10 = arg3 >>> 24;
            int var11 = arg5 + arg6;
            int var12 = arg7 % var11;
            if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
                if (arg4 == 1) {
                    int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
                    int var14 = 256 - var10;
                    int var15 = 0;
                    while (var15 < arg2) {
                        if (arg0 + var15 >= this.field7681 && arg0 + var15 < this.field7695 && var12 < arg5) {
                            int var16 = this.field7694[var9 + var15];
                            int var17 = ((var16 & 16711935) * var14 >> 8 & 16711935) + ((var16 & 65280) * var14 >> 8 & 65280);
                            this.field7694[var9 + var15] = var13 + var17;
                        }
                        ++var15;
                        ++var12;
                        var12 %= var11;
                    }
                } else if (arg4 == 2) {
                    int var18 = 0;
                    while (var18 < arg2) {
                        if (arg0 + var18 >= this.field7681 && arg0 + var18 < this.field7695 && var12 < arg5) {
                            int var19 = this.field7694[var9 + var18];
                            int var20 = arg3 + var19;
                            int var21 = (arg3 & 16711935) + (var19 & 16711935);
                            int var22 = (var20 - var21 & 65536) + (var21 & 16777472);
                            this.field7694[var9 + var18] = var20 - var22 | var22 - (var22 >>> 8);
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
                    if (arg0 + var23 >= this.field7681 && arg0 + var23 < this.field7695 && var12 < arg5) {
                        this.field7694[var9 + var23] = arg3;
                    }
                    ++var23;
                    ++var12;
                    var12 %= var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)I")
    public final int method3161(int arg0) {
        return super.field883.method1263(arg0, (byte) 118).field2751;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIII)V")
    public final void method415(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class509 var8 = this.method3167(Thread.currentThread());
        class765 var9 = var8.field7291;
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
            int var23 = arg0 - var9.method4211();
            int var24 = arg1 - var9.method4209();
            int var25 = var19 + var23;
            int var26 = var23 - var20;
            int var27 = var17 + var23 - var20;
            int var28 = var17 + var23 + var19;
            int var29 = var21 + var24;
            int var30 = var24 - var22;
            int var31 = var18 + var24 - var22;
            int var32 = var18 + var24 + var21;
            if (arg6 == 0) {
                var9.field10517 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field10517 = 255 - (arg4 >>> 24);
            }
            this.method408(false);
            var9.field10521 = var25 < 0 || var25 > var9.field10524 || var26 < 0 || var26 > var9.field10524 || var27 < 0 || var27 > var9.field10524;
            var9.method4200((float) var29, (float) var30, (float) var31, (float) var25, (float) var26, (float) var27, 100.0F, 100.0F, 100.0F, arg4);
            var9.field10521 = var25 < 0 || var25 > var9.field10524 || var27 < 0 || var27 > var9.field10524 || var28 < 0 || var28 > var9.field10524;
            var9.method4200((float) var29, (float) var31, (float) var32, (float) var25, (float) var27, (float) var28, 100.0F, 100.0F, 100.0F, arg4);
            this.method408(true);
        }
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V")
    public class545(Canvas arg0, class159 arg1, int arg2, int arg3) {
        this(arg1);
        try {
            this.method498(arg0, arg2, arg3);
            this.method510(arg0);
        } catch (Throwable var6) {
            var6.printStackTrace();
            this.method450(1);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method405(Canvas arg0) {
        if (this.field7658 == arg0) {
            this.method510((Canvas) null);
        }
        class677 var2 = (class677) this.field7657.method380((byte) -3, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method3117((byte) 19);
        }
    }

    @OriginalMember(owner = "client!ni", name = "ya", descriptor = "()V")
    public final void method449() {
        if (this.field7681 == 0 && this.field7695 == this.field7686 && this.field7678 == 0 && this.field7685 == this.field7673) {
            int var1 = this.field7698.length;
            int var2 = var1 - (var1 & 7);
            int var3 = 0;
            while (var3 < var2) {
                this.field7698[var3++] = 2.1474836E9F;
                this.field7698[var3++] = 2.1474836E9F;
                this.field7698[var3++] = 2.1474836E9F;
                this.field7698[var3++] = 2.1474836E9F;
                this.field7698[var3++] = 2.1474836E9F;
                this.field7698[var3++] = 2.1474836E9F;
                this.field7698[var3++] = 2.1474836E9F;
                this.field7698[var3++] = 2.1474836E9F;
            }
            while (var3 < var1) {
                this.field7698[var3++] = 2.1474836E9F;
            }
        } else {
            int var4 = this.field7695 - this.field7681;
            int var5 = this.field7673 - this.field7678;
            int var6 = this.field7686 - var4;
            int var7 = this.field7686 * this.field7678 + this.field7681;
            int var8 = var4 >> 3;
            int var9 = var4 & 7;
            int var10 = var7 - 1;
            for (int var11 = -var5; var11 < 0; ++var11) {
                if (var8 > 0) {
                    int var12 = var8;
                    do {
                        ++var10;
                        this.field7698[var10] = 2.1474836E9F;
                        ++var10;
                        this.field7698[var10] = 2.1474836E9F;
                        ++var10;
                        this.field7698[var10] = 2.1474836E9F;
                        ++var10;
                        this.field7698[var10] = 2.1474836E9F;
                        ++var10;
                        this.field7698[var10] = 2.1474836E9F;
                        ++var10;
                        this.field7698[var10] = 2.1474836E9F;
                        ++var10;
                        this.field7698[var10] = 2.1474836E9F;
                        ++var10;
                        this.field7698[var10] = 2.1474836E9F;
                        --var12;
                    } while (var12 > 0);
                }
                if (var9 > 0) {
                    int var13 = var9;
                    do {
                        ++var10;
                        this.field7698[var10] = 2.1474836E9F;
                        --var13;
                    } while (var13 > 0);
                }
                var10 += var6;
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method499(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field7680 = (int) (arg1 * 65535.0F);
        this.field7674 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field7691 = (int) (arg3 * 65535.0F / var7);
        this.field7693 = (int) (arg4 * 65535.0F / var7);
        this.field7690 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!ni", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method511(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field7686 * arg1 + arg0;
            int var15 = this.field7686 - arg2;
            if (arg1 + arg3 > this.field7673) {
                arg3 -= arg1 + arg3 - this.field7673;
            }
            if (arg1 < this.field7678) {
                int var16 = this.field7678 - arg1;
                arg3 -= var16;
                var14 += this.field7686 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field7695) {
                int var17 = arg0 + arg2 - this.field7695;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field7681) {
                int var18 = this.field7681 - arg0;
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
                            int var28 = this.field7694[var14];
                            this.field7694[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field7694[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field7694[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field7694[var14++] = arg5;
                        } else {
                            this.field7694[var14++] = arg4;
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

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "()Leh;")
    public final class378 method493() {
        return this.field7666;
    }

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "(I)Lza;")
    public final class432 method508(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public final void method398(int arg0) {
        this.field7672[arg0].method2980((Runnable) null, (byte) 89);
    }

    @OriginalMember(owner = "client!ni", name = "C", descriptor = "(Z)V")
    public final void method408(boolean arg0) {
        class509 var2 = this.method3167(Thread.currentThread());
        var2.field7263 = arg0;
    }

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "()Z")
    public final boolean method3162() {
        return this.field7659;
    }

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "(II)Lnea;")
    public final class742 method501(int arg0, int arg1) {
        return this.method502(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method472(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class138 {
        if (this.field7658 != null && this.field7656 != null) {
            try {
                Graphics var5 = this.field7658.getGraphics();
                for (int var6 = 0; var6 < arg1; ++var6) {
                    Rectangle var7 = arg0[var6];
                    if (var7.x + arg2 <= this.field7686 && var7.y + arg3 <= this.field7685 && var7.x + arg2 + var7.width > 0 && var7.y + arg3 + var7.height > 0) {
                        this.field7656.method911(var7.y, var7.x, var7.x + arg2, var7.width, var5, 77, var7.y + arg3, var7.height);
                    }
                }
            } catch (Exception var8) {
                this.field7658.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "()Z")
    public final boolean method461() {
        return false;
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(II)I")
    public final int method451(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "()V")
    public final void method447() {
        if (this.field7655) {
            class209.method1485(true, (byte) 30, false);
            this.field7655 = false;
        }
        this.field7656 = null;
        this.field7658 = null;
        this.field7662 = 0;
        this.field7660 = 0;
        this.field7657 = null;
        this.field7659 = true;
    }

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "(I)Z")
    public final boolean method3163(int arg0) {
        return super.field883.method1262(arg0, (byte) 73);
    }

    @OriginalMember(owner = "client!ni", name = "EA", descriptor = "(IIII)V")
    public final void method411(int arg0, int arg1, int arg2, int arg3) {
        class509 var5 = this.method3167(Thread.currentThread());
        var5.field7261 = arg0;
        var5.field7249 = arg1;
        var5.field7255 = arg2;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIII)V")
    public final void method401(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!ni", name = "I", descriptor = "()I")
    public final int method404() {
        int var1 = this.field7668;
        this.field7668 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method505(Canvas arg0, int arg1, int arg2) {
        class677 var4 = (class677) this.field7657.method380((byte) -3, (long) arg0.hashCode());
        if (var4 != null) {
            var4.method3117((byte) -122);
            class677 var5 = class438.method2645(arg1, arg2, 0, arg0);
            this.field7657.method384((long) arg0.hashCode(), var5, false);
            if (this.field7658 == arg0 && this.field7696 == null) {
                Dimension var6 = arg0.getSize();
                this.field7662 = var6.width;
                this.field7660 = var6.height;
                this.field7656 = var5;
                this.field7694 = var5.field9631;
                this.field7686 = var5.field9635;
                this.field7685 = var5.field9632;
                if (this.field7686 != this.field7669 || this.field7685 != this.field7665) {
                    this.field7700 = this.field7669 = this.field7686;
                    this.field7688 = this.field7665 = this.field7685;
                    this.field7683 = this.field7698 = new float[this.field7669 * this.field7665];
                }
                this.method3168();
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "(IIIIIII)I")
    public final int method452(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        float var8 = (float) arg2 * this.field7666.field8895 + (float) arg0 * this.field7666.field8876 + (float) arg1 * this.field7666.field8897 + this.field7666.field8879;
        float var9 = (float) arg5 * this.field7666.field8895 + (float) arg3 * this.field7666.field8876 + (float) arg4 * this.field7666.field8897 + this.field7666.field8879;
        int var10 = 0;
        if (var8 < (float) this.field7701 && var9 < (float) this.field7701) {
            var10 |= 16;
        } else if (var8 > (float) this.field7687 && var9 > (float) this.field7687) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field7666.field8877 + (float) arg0 * this.field7666.field8896 + (float) arg1 * this.field7666.field8870 + this.field7666.field8873) * (float) this.field7682 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field7666.field8877 + (float) arg3 * this.field7666.field8896 + (float) arg4 * this.field7666.field8870 + this.field7666.field8873) * (float) this.field7682 / (float) arg6);
        if (var11 < this.field7671 && var12 < this.field7671) {
            var10 |= 1;
        } else if (var11 > this.field7689 && var12 > this.field7689) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field7666.field8886 + (float) arg0 * this.field7666.field8880 + (float) arg1 * this.field7666.field8875 + this.field7666.field8885) * (float) this.field7667 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field7666.field8886 + (float) arg3 * this.field7666.field8880 + (float) arg4 * this.field7666.field8875 + this.field7666.field8885) * (float) this.field7667 / (float) arg6);
        if (var13 < this.field7684 && var14 < this.field7684) {
            var10 |= 4;
        } else if (var13 > this.field7679 && var14 > this.field7679) {
            var10 |= 8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "()V")
    public final void method443() {
    }

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "()Z")
    public final boolean method423() {
        return false;
    }

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "()Leh;")
    public final class378 method433() {
        class509 var1 = this.method3167(Thread.currentThread());
        return var1.field7247;
    }

    @OriginalMember(owner = "client!ni", name = "M", descriptor = "()I")
    public final int method432() {
        int var1 = this.field7697;
        this.field7697 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lag;Lag;FLag;)Lag;")
    public final class710 method507(class710 arg0, class710 arg1, float arg2, class710 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Ld;)V")
    private class545(class159 arg0) {
        super(arg0);
        this.field7659 = false;
        this.field7655 = false;
        this.field7657 = new class64(4);
        this.field7668 = 0;
        this.field7673 = 0;
        this.field7674 = 78642;
        this.field7681 = 0;
        this.field7667 = 512;
        this.field7687 = 3500;
        this.field7678 = 0;
        this.field7680 = 45823;
        this.field7664 = 128;
        this.field7692 = false;
        this.field7676 = 75518;
        this.field7695 = 0;
        this.field7697 = 0;
        this.field7682 = 512;
        this.field7701 = 50;
        this.field7677 = new class387(16);
        this.field7702 = -1;
        try {
            this.field7699 = new class387(256);
            this.field7666 = new class628();
            this.method489(1);
            this.method441(0);
            class211.method1486(true, true, (byte) -14);
            this.field7655 = true;
            this.field7661 = (int) class109.method731(108);
        } catch (Throwable var3) {
            var3.printStackTrace();
            this.method450(1);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "()Z")
    public final boolean method475() {
        return false;
    }

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "()V")
    public final void method444() {
    }

    @OriginalMember(owner = "client!ni", name = "za", descriptor = "(IIIII)V")
    public final void method487(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field7678) {
            var6 = this.field7678;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field7673) {
            var7 = this.field7673;
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
                if (var64 < this.field7681) {
                    var64 = this.field7681;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field7695) {
                    var65 = this.field7695;
                }
                int var66 = this.field7686 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field7694[var66++] = arg3;
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
                if (var60 < this.field7681) {
                    var60 = this.field7681;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field7695 - 1) {
                    var61 = this.field7695 - 1;
                }
                int var62 = this.field7686 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field7694[var62++] = arg3;
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
                if (var28 < this.field7681) {
                    var28 = this.field7681;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field7695) {
                    var29 = this.field7695;
                }
                int var30 = this.field7686 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field7694[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field7694[var30++] = var15 + var33;
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
                if (var22 < this.field7681) {
                    var22 = this.field7681;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field7695 - 1) {
                    var23 = this.field7695 - 1;
                }
                int var24 = this.field7686 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field7694[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field7694[var24++] = var15 + var27;
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
                if (var47 < this.field7681) {
                    var47 = this.field7681;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field7695) {
                    var48 = this.field7695;
                }
                int var49 = this.field7686 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field7694[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field7694[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field7681) {
                    var39 = this.field7681;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field7695 - 1) {
                    var40 = this.field7695 - 1;
                }
                int var41 = this.field7686 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field7694[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field7694[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "()Z")
    public final boolean method454() {
        return false;
    }

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "(I)V")
    public final void method489(int arg0) {
        this.field7675 = arg0;
        this.field7672 = new class509[this.field7675];
        for (int var2 = 0; var2 < this.field7675; ++var2) {
            this.field7672[var2] = new class509(this);
        }
    }

    @OriginalMember(owner = "client!ni", name = "P", descriptor = "(IIIII)V")
    public final void method431(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field7681 && arg0 < this.field7695) {
            if (arg1 < this.field7678) {
                arg2 -= this.field7678 - arg1;
                arg1 = this.field7678;
            }
            if (arg1 + arg2 > this.field7673) {
                arg2 = this.field7673 - arg1;
            }
            int var6 = this.field7686 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field7686 * var10 + var6;
                        int var12 = this.field7694[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field7694[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field7686 * var14 + var6;
                        int var16 = this.field7694[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field7694[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field7694[this.field7686 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "(I)I")
    public final int method3164(int arg0) {
        return super.field883.method1263(arg0, (byte) 114).field2747 & 65535;
    }

    @OriginalMember(owner = "client!ni", name = "K", descriptor = "([I)V")
    public final void method428(int[] arg0) {
        arg0[0] = this.field7681;
        arg0[1] = this.field7678;
        arg0[2] = this.field7695;
        arg0[3] = this.field7673;
    }

    @OriginalMember(owner = "client!ni", name = "da", descriptor = "(III[I)V")
    public final void method500(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field7666.field8895 + (float) arg0 * this.field7666.field8876 + (float) arg1 * this.field7666.field8897 + this.field7666.field8879;
        if (!(var5 < (float) this.field7701) && !(var5 > (float) this.field7687)) {
            int var6 = (int) (((float) arg2 * this.field7666.field8877 + (float) arg0 * this.field7666.field8896 + (float) arg1 * this.field7666.field8870 + this.field7666.field8873) * (float) this.field7682 / var5);
            int var7 = (int) (((float) arg2 * this.field7666.field8886 + (float) arg0 * this.field7666.field8880 + (float) arg1 * this.field7666.field8875 + this.field7666.field8885) * (float) this.field7667 / var5);
            if (var6 >= this.field7671 && var6 <= this.field7689 && var7 >= this.field7684 && var7 <= this.field7679) {
                arg3[0] = var6 - this.field7671;
                arg3[1] = var7 - this.field7684;
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(II)I")
    public final int method421(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lre;Z)Lqda;")
    public final class112 method482(class625 arg0, boolean arg1) {
        int[] var3 = arg0.field8823;
        byte[] var4 = arg0.field8828;
        int var5 = arg0.field8827;
        int var6 = arg0.field8822;
        class740 var11;
        if (arg1 && arg0.field8820 == null) {
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
            var11 = new class720(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field8820;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class629(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var20 = var5 * var19;
                    for (int var21 = 0; var21 < var5; ++var21) {
                        int var22 = var3[var4[var20 + var21] & 255];
                        var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
                    }
                }
                var11 = new class589(this, var14, var5, var6);
            }
        }
        var11.method790(arg0.field8826, arg0.field8825, arg0.field8824, arg0.field8821);
        return var11;
    }

    @OriginalMember(owner = "client!ni", name = "U", descriptor = "(IIIII)V")
    public final void method440(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field7678 && arg1 < this.field7673) {
            if (arg0 < this.field7681) {
                arg2 -= this.field7681 - arg0;
                arg0 = this.field7681;
            }
            if (arg0 + arg2 > this.field7695) {
                arg2 = this.field7695 - arg0;
            }
            int var6 = this.field7686 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field7694[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field7694[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field7694[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field7694[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field7694[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(IIIIII)V")
    public final void method438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method440(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method440(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method431(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method431(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field7681) {
                    var10 += (this.field7681 - arg0) * var12;
                    arg0 = this.field7681;
                }
                if (var13 >= this.field7695) {
                    var13 = this.field7695 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field7678 && var17 < this.field7673) {
                                int var18 = this.field7686 * var17 + arg0;
                                int var19 = this.field7694[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field7694[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field7678 && var21 < this.field7673) {
                                int var22 = this.field7686 * var21 + arg0;
                                int var23 = this.field7694[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field7694[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field7678 && var27 < this.field7673) {
                            this.field7694[this.field7686 * var27 + arg0] = arg4;
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
                if (arg1 < this.field7678) {
                    var29 += (this.field7678 - arg1) * var31;
                    arg1 = this.field7678;
                }
                if (var32 >= this.field7673) {
                    var32 = this.field7673 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field7681 && var46 < this.field7695) {
                            this.field7694[this.field7686 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field7681 && var36 < this.field7695) {
                            int var37 = this.field7686 * arg1 + var36;
                            int var38 = this.field7694[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field7694[this.field7686 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field7681 && var40 < this.field7695) {
                            int var41 = this.field7686 * arg1 + var40;
                            int var42 = this.field7694[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field7694[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!ni", name = "Y", descriptor = "()[I")
    public final int[] method469() {
        return new int[] { this.field7670, this.field7663, this.field7682, this.field7667 };
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lag;)V")
    public final void method484(class710 arg0) {
    }

    @OriginalMember(owner = "client!ni", name = "HA", descriptor = "(IIII[I)V")
    public final void method513(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        float var6 = (float) arg2 * this.field7666.field8895 + (float) arg0 * this.field7666.field8876 + (float) arg1 * this.field7666.field8897 + this.field7666.field8879;
        if (!(var6 < (float) this.field7701) && !(var6 > (float) this.field7687)) {
            int var7 = (int) (((float) arg2 * this.field7666.field8877 + (float) arg0 * this.field7666.field8896 + (float) arg1 * this.field7666.field8870 + this.field7666.field8873) * (float) this.field7682 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field7666.field8886 + (float) arg0 * this.field7666.field8880 + (float) arg1 * this.field7666.field8875 + this.field7666.field8885) * (float) this.field7667 / (float) arg3);
            if (var7 >= this.field7671 && var7 <= this.field7689 && var8 >= this.field7684 && var8 <= this.field7679) {
                arg4[0] = var7 - this.field7671;
                arg4[1] = var8 - this.field7684;
                arg4[2] = (int) var6;
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ni", name = "GA", descriptor = "(I)V")
    public final void method417(int arg0) {
        this.method474(0, 0, this.field7686, this.field7685, arg0, 0);
    }

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "(I)V")
    public final void method458(int arg0) {
        this.field7664 = arg0;
        this.field7699.method2364(1);
    }

    @OriginalMember(owner = "client!ni", name = "KA", descriptor = "(IIII)V")
    public final void method455(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field7686) {
            arg2 = this.field7686;
        }
        if (arg3 > this.field7685) {
            arg3 = this.field7685;
        }
        this.field7681 = arg0;
        this.field7695 = arg2;
        this.field7678 = arg1;
        this.field7673 = arg3;
        this.method3169();
    }

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "(I)V")
    public final void method473(int arg0) {
        int var2 = arg0 - this.field7661;
        for (Object var3 = this.field7699.method2375(-69); var3 != null; var3 = this.field7699.method2365((byte) 59)) {
            class473 var4 = (class473) var3;
            if (var4.field6745) {
                var4.field6746 += var2;
                int var5 = var4.field6746 / 20;
                if (var5 > 0) {
                    class181 var6 = super.field883.method1263(var4.field6744, (byte) 110);
                    var4.method2795(var6.field2740 * var2 * 50 / 1000, var6.field2736 * var2 * 50 / 1000);
                    var4.field6746 -= var5 * 20;
                }
                var4.field6745 = false;
            }
        }
        this.field7661 = arg0;
        this.field7677.method2366(5, 116);
        this.field7699.method2366(5, 118);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lqja;IIII)V")
    private final void method3165(class324 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg0.field4853;
        int var8 = arg4 << 1;
        if (var6 == -1) {
            this.method3170(arg1, arg2, arg3, arg4, arg0.field4861, 1);
        } else {
            if (this.field7702 != var6) {
                class112 var9 = (class112) this.field7677.method2373((long) var6, 103);
                if (var9 == null) {
                    int[] var10 = this.method3166(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = this.method3175(var6) ? 64 : this.field7664;
                    var9 = this.method476(0, var11, var11, true, var11, var10);
                    this.field7677.method2362(var9, 0, (long) var6);
                }
                this.field7702 = var6;
                this.field7703 = var9;
            }
            ++var8;
            ((class740) this.field7703).method3410(arg1 - arg4, arg2 - arg4, arg3, var8, var8, 0, arg0.field4861, 1, 1);
        }
    }

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "(I)[I")
    public final int[] method3166(int arg0) {
        class387 var2 = this.field7699;
        class473 var3;
        synchronized (this.field7699) {
            var3 = (class473) this.field7699.method2373((long) arg0 | Long.MIN_VALUE, 103);
            if (var3 == null) {
                if (!super.field883.method1262(arg0, (byte) 48)) {
                    return null;
                }
                class181 var5 = super.field883.method1263(arg0, (byte) 115);
                int var6 = !var5.field2742 && !this.field7692 ? this.field7664 : 64;
                var3 = new class473(arg0, var6, super.field883.method1259(arg0, var6, 30767, 0.7F, true, var6), var5.field2751 != 1);
                this.field7699.method2362(var3, 0, (long) arg0 | Long.MIN_VALUE);
            }
        }
        var3.field6745 = true;
        return var3.method2794();
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class292 method477(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class570(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/lang/Runnable;)Llda;")
    public final class509 method3167(Runnable arg0) {
        for (int var2 = 0; var2 < this.field7675; ++var2) {
            if (this.field7672[var2].field7258 == arg0) {
                return this.field7672[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "()Z")
    public final boolean method436() {
        return true;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lnea;Lvu;)Lcp;")
    public final class753 method456(class742 arg0, class354 arg1) {
        return new class772(this, (class112) arg0, (class372) arg1);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method490(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        class509 var14 = this.method3167(Thread.currentThread());
        class765 var15 = var14.field7291;
        var15.field10515 = false;
        int var16 = arg0 - this.field7671;
        int var17 = arg3 - this.field7671;
        int var18 = arg6 - this.field7671;
        int var19 = arg1 - this.field7684;
        int var20 = arg4 - this.field7684;
        int var21 = arg7 - this.field7684;
        var15.field10521 = var16 < 0 || var16 > var15.field10524 || var17 < 0 || var17 > var15.field10524 || var18 < 0 || var18 > var15.field10524;
        int var22 = arg9 >>> 24;
        if (arg12 != 0 && (arg12 != 1 || var22 != 255)) {
            if (arg12 == 1) {
                var15.field10517 = 255 - var22;
                var15.field10520 = false;
                var15.method4212((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
            } else {
                if (arg12 != 2) {
                    throw new IllegalArgumentException();
                }
                var15.field10517 = 128;
                var15.field10520 = true;
                var15.method4212((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
            }
        } else {
            var15.field10517 = 0;
            var15.field10520 = false;
            var15.method4212((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
        }
        var15.field10515 = true;
    }

    @OriginalMember(owner = "client!ni", name = "X", descriptor = "(I)V")
    public final void method459(int arg0) {
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([I)V")
    public final void method470(int[] arg0) {
        arg0[0] = this.field7686;
        arg0[1] = this.field7685;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIZ)Lqda;")
    public final class112 method502(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class629(this, arg0, arg1) : new class589(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([IIIIIZ)Lqda;")
    public final class112 method481(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        boolean var7 = false;
        int var8 = arg1;
        for (int var9 = 0; var9 < arg4; ++var9) {
            for (int var10 = 0; var10 < arg3; ++var10) {
                int var11 = arg0[var8++] >>> 24;
                if (var11 != 0 && var11 != 255) {
                    var7 = true;
                    return var7 ? new class629(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class589(this, arg0, arg1, arg2, arg3, arg4, arg5);
                }
            }
        }
        return var7 ? new class629(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class589(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)V")
    public final void method393(boolean arg0) {
        this.field7692 = arg0;
        this.field7699.method2364(1);
    }

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "(II)V")
    public final void method446(int arg0, int arg1) {
        class509 var3 = this.method3167(Thread.currentThread());
        this.field7701 = arg0;
        this.field7687 = arg1;
        var3.field7260 = this.field7687 - 255;
    }

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "()I")
    public final int method460() {
        return this.field7701;
    }

    @OriginalMember(owner = "client!ni", name = "aa", descriptor = "(IIIIII)V")
    public final void method474(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field7681) {
            arg2 -= this.field7681 - arg0;
            arg0 = this.field7681;
        }
        if (arg1 < this.field7678) {
            arg3 -= this.field7678 - arg1;
            arg1 = this.field7678;
        }
        if (arg0 + arg2 > this.field7695) {
            arg2 = this.field7695 - arg0;
        }
        if (arg1 + arg3 > this.field7673) {
            arg3 = this.field7673 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field7695 && arg1 <= this.field7673) {
            int var7 = this.field7686 - arg2;
            int var8 = this.field7686 * arg1 + arg0;
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
                            this.field7694[var24] = arg4;
                            ++var24;
                            this.field7694[var24] = arg4;
                            ++var24;
                            this.field7694[var24] = arg4;
                            ++var24;
                            this.field7694[var24] = arg4;
                            ++var24;
                            this.field7694[var24] = arg4;
                            ++var24;
                            this.field7694[var24] = arg4;
                            ++var24;
                            this.field7694[var24] = arg4;
                            ++var24;
                            this.field7694[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field7694[var24] = arg4;
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
                        int var14 = this.field7694[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                        this.field7694[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field7694[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field7694[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "B", descriptor = "()V")
    private final void method3168() {
        for (int var1 = 0; var1 < this.field7675; ++var1) {
            this.field7672[var1].method2978(false);
        }
        this.method463();
    }

    @OriginalMember(owner = "client!ni", name = "la", descriptor = "()V")
    public final void method463() {
        this.field7681 = 0;
        this.field7678 = 0;
        this.field7695 = this.field7686;
        this.field7673 = this.field7685;
        this.method3169();
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(IIIID)V")
    public final void method410(int arg0, int arg1, int arg2, int arg3, double arg4) {
        int var7 = this.field7669 - arg2;
        int var8 = this.field7669 * arg1 + arg0;
        float[] var9 = this.field7698;
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

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(IIIIZ)Lqda;")
    public final class112 method504(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field7686 * arg1 + arg0;
        int var8 = this.field7686 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field7694[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class629(this, var6, arg2, arg3);
        } else {
            return new class589(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "()Z")
    public final boolean method426() {
        return true;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lza;)V")
    public final void method439(class432 arg0) {
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II[I[I)Laa;")
    public final class510 method430(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class70(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lkf;[Lre;Z)Lda;")
    public final class67 method403(class263 arg0, class625[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field8827;
            var5[var7] = arg1[var7].field8822;
            if (arg1[var7].field8820 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                return new class142(this, arg0, arg1, var4, var5);
            } else {
                return new class608(this, arg0, arg1, var4, var5);
            }
        } else if (var6) {
            throw new IllegalArgumentException("");
        } else {
            return new class128(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method427(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg2 - arg0;
        int var11 = arg3 - arg1;
        if (var11 == 0) {
            if (var10 >= 0) {
                this.method3160(arg0, arg1, var10 + 1, arg4, arg5, arg6, arg7, arg8);
            } else {
                int var12 = arg6 + arg7;
                int var13 = arg8 % var12;
                int var14 = arg6 + var12 - var13 - (-var10 + 1) % var12;
                int var15 = var14 % var12;
                if (var15 < 0) {
                    var15 += var12;
                }
                this.method3160(arg0 + var10, arg1, -var10 + 1, arg4, arg5, arg6, arg7, var15);
            }
        } else if (var10 == 0) {
            if (var11 >= 0) {
                this.method3172(arg0, arg1, var11 + 1, arg4, arg5, arg6, arg7, arg8);
            } else {
                int var16 = arg6 + arg7;
                int var17 = arg8 % var16;
                int var18 = arg6 + var16 - var17 - (-var11 + 1) % var16;
                int var19 = var18 % var16;
                if (var19 < 0) {
                    var19 += var16;
                }
                this.method3172(arg0, arg1 + var11, -var11 + 1, arg4, arg5, arg6, arg7, var19);
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
                            if (arg0 >= this.field7681 && arg0 < this.field7695 && var37 >= this.field7678 && var37 < this.field7673 && var24 < var21) {
                                int var38 = this.field7686 * var37 + arg0;
                                int var39 = this.field7694[var38];
                                int var40 = ((var39 & 16711935) * var36 >> 8 & 16711935) + ((var39 & 65280) * var36 >> 8 & 65280);
                                this.field7694[var38] = var35 + var40;
                            }
                            var29 += var31;
                            ++arg0;
                            int var41 = var24 + var34;
                            var24 = var41 % var23;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var32) {
                            int var42 = var29 >> 16;
                            if (arg0 >= this.field7681 && arg0 < this.field7695 && var42 >= this.field7678 && var42 < this.field7673 && var24 < var21) {
                                int var43 = this.field7686 * var42 + arg0;
                                int var44 = this.field7694[var43];
                                int var45 = arg4 + var44;
                                int var46 = (arg4 & 16711935) + (var44 & 16711935);
                                int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                                this.field7694[var43] = var45 - var47 | var47 - (var47 >>> 8);
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
                        if (arg0 >= this.field7681 && arg0 < this.field7695 && var49 >= this.field7678 && var49 < this.field7673 && var24 < var21) {
                            this.field7694[this.field7686 * var49 + arg0] = arg4;
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
                            if (arg1 >= this.field7678 && arg1 < this.field7673 && var60 >= this.field7681 && var60 < this.field7695 && var24 < var21) {
                                int var61 = this.field7686 * arg1 + var60;
                                int var62 = this.field7694[var61];
                                int var63 = ((var62 & 16711935) * var59 >> 8 & 16711935) + ((var62 & 65280) * var59 >> 8 & 65280);
                                this.field7694[this.field7686 * arg1 + var60] = var58 + var63;
                            }
                            var52 += var54;
                            ++arg1;
                            int var64 = var24 + var57;
                            var24 = var64 % var23;
                        }
                    } else if (arg5 == 2) {
                        while (arg1 <= var55) {
                            int var65 = var52 >> 16;
                            if (arg1 >= this.field7678 && arg1 < this.field7673 && var65 >= this.field7681 && var65 < this.field7695 && var24 < var21) {
                                int var66 = this.field7686 * arg1 + var65;
                                int var67 = this.field7694[var66];
                                int var68 = arg4 + var67;
                                int var69 = (arg4 & 16711935) + (var67 & 16711935);
                                int var70 = (var68 - var69 & 65536) + (var69 & 16777472);
                                this.field7694[var66] = var68 - var70 | var70 - (var70 >>> 8);
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
                        if (arg1 >= this.field7678 && arg1 < this.field7673 && var72 >= this.field7681 && var72 < this.field7695 && var24 < var21) {
                            this.field7694[this.field7686 * arg1 + var72] = arg4;
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

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(IIIIII)V")
    public final void method457(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method440(arg0, arg1, arg2, arg4, arg5);
        this.method440(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method431(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method431(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!ni", name = "ra", descriptor = "(IIII)V")
    public final void method468(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field7672.length; ++var5) {
            this.field7672[var5].field7251 = this.field7672[var5].field7249;
            this.field7672[var5].field7261 = arg0;
            this.field7672[var5].field7249 = arg1;
            this.field7672[var5].field7255 = arg2;
            this.field7672[var5].field7257 = true;
        }
    }

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "()Z")
    public final boolean method465() {
        return true;
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(II)Lvu;")
    public final class354 method442(int arg0, int arg1) {
        return new class372(arg0, arg1);
    }

    @OriginalMember(owner = "client!ni", name = "C", descriptor = "()V")
    private final void method3169() {
        this.field7671 = this.field7681 - this.field7670;
        this.field7689 = this.field7695 - this.field7670;
        this.field7684 = this.field7678 - this.field7663;
        this.field7679 = this.field7673 - this.field7663;
        for (int var1 = 0; var1 < this.field7675; ++var1) {
            class765 var5 = this.field7672[var1].field7291;
            var5.field10526 = this.field7670 - this.field7681;
            var5.field10527 = this.field7663 - this.field7678;
            var5.field10524 = this.field7695 - this.field7681;
            var5.field10523 = this.field7673 - this.field7678;
        }
        int var2 = this.field7686 * this.field7678 + this.field7681;
        for (int var3 = this.field7678; var3 < this.field7673; ++var3) {
            for (int var4 = 0; var4 < this.field7675; ++var4) {
                this.field7672[var4].field7291.field10514[var3 - this.field7678] = var2;
            }
            var2 += this.field7686;
        }
    }

    @OriginalMember(owner = "client!ni", name = "XA", descriptor = "()I")
    public final int method425() {
        return this.field7687;
    }

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "(IIIIII)V")
    private final void method3170(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 0) {
            arg3 = -arg3;
        }
        int var7 = arg1 - arg3;
        if (var7 < this.field7678) {
            var7 = this.field7678;
        }
        int var8 = arg1 + arg3 + 1;
        if (var8 > this.field7673) {
            var8 = this.field7673;
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
                if (var65 < this.field7681) {
                    var65 = this.field7681;
                }
                int var66 = arg0 + var11;
                if (var66 > this.field7695) {
                    var66 = this.field7695;
                }
                int var67 = this.field7686 * var9 + var65;
                for (int var68 = var65; var68 < var66; ++var68) {
                    if ((float) arg2 < this.field7698[var67]) {
                        this.field7694[var67] = arg4;
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
                if (var61 < this.field7681) {
                    var61 = this.field7681;
                }
                int var62 = arg0 + var56;
                if (var62 > this.field7695 - 1) {
                    var62 = this.field7695 - 1;
                }
                int var63 = this.field7686 * var9 + var61;
                for (int var64 = var61; var64 <= var62; ++var64) {
                    if ((float) arg2 < this.field7698[var63]) {
                        this.field7694[var63] = arg4;
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
                if (var29 < this.field7681) {
                    var29 = this.field7681;
                }
                int var30 = arg0 + var11;
                if (var30 > this.field7695) {
                    var30 = this.field7695;
                }
                int var31 = this.field7686 * var9 + var29;
                for (int var32 = var29; var32 < var30; ++var32) {
                    if ((float) arg2 < this.field7698[var31]) {
                        int var33 = this.field7694[var31];
                        int var34 = ((var33 & 16711935) * var17 >> 8 & 16711935) + ((var33 & 65280) * var17 >> 8 & 65280);
                        this.field7694[var31] = var16 + var34;
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
                if (var23 < this.field7681) {
                    var23 = this.field7681;
                }
                int var24 = arg0 + var18;
                if (var24 > this.field7695 - 1) {
                    var24 = this.field7695 - 1;
                }
                int var25 = this.field7686 * var9 + var23;
                for (int var26 = var23; var26 <= var24; ++var26) {
                    if ((float) arg2 < this.field7698[var25]) {
                        int var27 = this.field7694[var25];
                        int var28 = ((var27 & 16711935) * var17 >> 8 & 16711935) + ((var27 & 65280) * var17 >> 8 & 65280);
                        this.field7694[var25] = var16 + var28;
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
                if (var48 < this.field7681) {
                    var48 = this.field7681;
                }
                int var49 = arg0 + var11;
                if (var49 > this.field7695) {
                    var49 = this.field7695;
                }
                int var50 = this.field7686 * var9 + var48;
                for (int var51 = var48; var51 < var49; ++var51) {
                    if ((float) arg2 < this.field7698[var50]) {
                        int var52 = this.field7694[var50];
                        int var53 = arg4 + var52;
                        int var54 = (arg4 & 16711935) + (var52 & 16711935);
                        int var55 = (var53 - var54 & 65536) + (var54 & 16777472);
                        this.field7694[var50] = var53 - var55 | var55 - (var55 >>> 8);
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
                if (var40 < this.field7681) {
                    var40 = this.field7681;
                }
                int var41 = arg0 + var35;
                if (var41 > this.field7695 - 1) {
                    var41 = this.field7695 - 1;
                }
                int var42 = this.field7686 * var9 + var40;
                for (int var43 = var40; var43 <= var41; ++var43) {
                    if ((float) arg2 < this.field7698[var42]) {
                        int var44 = this.field7694[var42];
                        int var45 = arg4 + var44;
                        int var46 = (arg4 & 16711935) + (var44 & 16711935);
                        int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                        this.field7694[var42] = var45 - var47 | var47 - (var47 >>> 8);
                    }
                    ++var42;
                }
                ++var9;
                var39 += var36 + var36;
                var38 += var36++ + var36;
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "A", descriptor = "()Z")
    public final boolean method509() {
        return true;
    }

    @OriginalMember(owner = "client!ni", name = "H", descriptor = "(III[I)V")
    public final void method407(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field7666.field8895 + (float) arg0 * this.field7666.field8876 + (float) arg1 * this.field7666.field8897 + this.field7666.field8879;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field7666.field8877 + (float) arg0 * this.field7666.field8896 + (float) arg1 * this.field7666.field8870 + this.field7666.field8873) * (float) this.field7682 / var5);
            int var7 = (int) (((float) arg2 * this.field7666.field8886 + (float) arg0 * this.field7666.field8880 + (float) arg1 * this.field7666.field8875 + this.field7666.field8885) * (float) this.field7667 / var5);
            arg3[0] = var6 - this.field7671;
            arg3[1] = var7 - this.field7684;
            arg3[2] = (int) var5;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(FFF)V")
    public final void method396(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I[Ljw;)V")
    public final void method429(int arg0, class578[] arg1) {
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIF)Ljw;")
    public final class578 method492(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method510(Canvas arg0) {
        if (arg0 != null) {
            class677 var2 = (class677) this.field7657.method380((byte) -3, (long) arg0.hashCode());
            if (var2 != null) {
                this.field7658 = arg0;
                Dimension var3 = arg0.getSize();
                this.field7662 = var3.width;
                this.field7660 = var3.height;
                this.field7656 = var2;
                if (this.field7696 == null) {
                    this.field7694 = var2.field9631;
                    this.field7686 = var2.field9635;
                    this.field7685 = var2.field9632;
                    if (this.field7686 != this.field7669 || this.field7685 != this.field7665) {
                        this.field7700 = this.field7669 = this.field7686;
                        this.field7688 = this.field7665 = this.field7685;
                        this.field7683 = this.field7698 = new float[this.field7669 * this.field7665];
                    }
                    this.method3168();
                    return;
                }
            }
        } else {
            this.field7658 = null;
            this.field7656 = null;
            if (this.field7696 == null) {
                this.field7694 = null;
                this.field7686 = this.field7685 = 1;
                this.field7669 = this.field7665 = 1;
                this.method3168();
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIII)Lag;")
    public final class710 method399(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "()Z")
    public final boolean method424() {
        return false;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lhea;I)V")
    public final void method464(class443 arg0, int arg1) {
        class509 var3 = this.method3167(Thread.currentThread());
        class214 var4 = arg0.field6311.field1864;
        for (class214 var5 = var4.field3084; var4 != var5; var5 = var5.field3084) {
            class324 var6 = (class324) var5;
            int var7 = var6.field4854 >> 12;
            int var8 = var6.field4857 >> 12;
            int var9 = var6.field4855 >> 12;
            float var10 = (float) var9 * this.field7666.field8895 + (float) var7 * this.field7666.field8876 + (float) var8 * this.field7666.field8897 + this.field7666.field8879;
            if (!(var10 < (float) this.field7701) && !(var10 > (float) var3.field7260)) {
                int var11 = (int) (((float) var9 * this.field7666.field8877 + (float) var7 * this.field7666.field8896 + (float) var8 * this.field7666.field8870 + this.field7666.field8873) * (float) this.field7682 / (float) arg1) + this.field7670;
                int var12 = (int) (((float) var9 * this.field7666.field8886 + (float) var7 * this.field7666.field8880 + (float) var8 * this.field7666.field8875 + this.field7666.field8885) * (float) this.field7667 / (float) arg1) + this.field7663;
                if (var11 >= this.field7681 && var11 <= this.field7695 && var12 >= this.field7678 && var12 <= this.field7673) {
                    if (var10 == 0.0F) {
                        var10 = 1.0F;
                    }
                    this.method3165(var6, var11, var12, (int) var10, (this.field7682 * var6.field4860 >> 12) / arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lhm;IIII)Lka;")
    public final class495 method420(class229 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class429(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "(I)[I")
    public final int[] method3171(int arg0) {
        class387 var2 = this.field7699;
        class473 var3;
        synchronized (this.field7699) {
            var3 = (class473) this.field7699.method2373((long) arg0, 103);
            if (var3 == null) {
                if (!super.field883.method1262(arg0, (byte) 68)) {
                    return null;
                }
                class181 var5 = super.field883.method1263(arg0, (byte) 112);
                int var6 = !var5.field2742 && !this.field7692 ? this.field7664 : 64;
                var3 = new class473(arg0, var6, super.field883.method1261(arg0, var6, -13756, true, 0.7F, var6), var5.field2751 != 1);
                this.field7699.method2362(var3, 0, (long) arg0);
            }
        }
        var3.field6745 = true;
        return var3.method2794();
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method498(Canvas arg0, int arg1, int arg2) {
        class677 var4 = (class677) this.field7657.method380((byte) -3, (long) arg0.hashCode());
        if (var4 == null) {
            class677 var5 = class438.method2645(arg1, arg2, 0, arg0);
            this.field7657.method384((long) arg0.hashCode(), var5, false);
        } else {
            if (var4.field9635 != arg1 || var4.field9632 != arg2) {
                this.method505(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "()V")
    public final void method397() {
    }

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "()Z")
    public final boolean method422() {
        return false;
    }

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "()Leh;")
    public final class378 method462() {
        return new class628();
    }

    @OriginalMember(owner = "client!ni", name = "A", descriptor = "(ILaa;II)V")
    public final void method494(int arg0, class510 arg1, int arg2, int arg3) {
        class70 var5 = (class70) arg1;
        int[] var6 = var5.field957;
        int[] var7 = var5.field956;
        int var8;
        if (this.field7673 < var6.length + arg3) {
            var8 = this.field7673 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field7678 > arg3) {
            var9 = this.field7678 - arg3;
            arg3 = this.field7678;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field7686 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field7681 > var12) {
                    var13 -= this.field7681 - var12;
                    var12 = this.field7681;
                }
                if (this.field7695 < var12 + var13) {
                    var13 = this.field7695 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field7694[var14++] = arg0;
                }
                var10 += this.field7686;
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method479(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class510 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        class70 var13 = (class70) arg6;
        int[] var14 = var13.field957;
        int[] var15 = var13.field956;
        int var16 = this.field7678 > arg8 ? this.field7678 : arg8;
        int var17 = this.field7673 < var14.length + arg8 ? this.field7673 : var14.length + arg8;
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
                        if (arg0 >= this.field7681 && arg0 < this.field7695 && var37 >= var16 && var37 < var17 && var22 < var19) {
                            int var39 = var14[var38] + arg7;
                            if (arg0 >= var39 && arg0 < var15[var38] + var39) {
                                int var40 = this.field7686 * var37 + arg0;
                                int var41 = this.field7694[var40];
                                int var42 = ((var41 & 16711935) * var36 >> 8 & 16711935) + ((var41 & 65280) * var36 >> 8 & 65280);
                                this.field7694[var40] = var35 + var42;
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
                        if (arg0 >= this.field7681 && arg0 < this.field7695 && var44 >= var16 && var44 < var17 && var22 < var19) {
                            int var46 = var14[var45] + arg7;
                            if (arg0 >= var46 && arg0 < var15[var45] + var46) {
                                int var47 = this.field7686 * var44 + arg0;
                                int var48 = this.field7694[var47];
                                int var49 = arg4 + var48;
                                int var50 = (arg4 & 16711935) + (var48 & 16711935);
                                int var51 = (var49 - var50 & 65536) + (var50 & 16777472);
                                this.field7694[var47] = var49 - var51 | var51 - (var51 >>> 8);
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
                    if (arg0 >= this.field7681 && arg0 < this.field7695 && var53 >= var16 && var53 < var17 && var22 < var19) {
                        int var55 = var14[var54] + arg7;
                        if (arg0 >= var55 && arg0 < var15[var54] + var55) {
                            this.field7694[this.field7686 * var53 + arg0] = arg4;
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
                    if (arg1 >= var16 && arg1 < var17 && var80 >= this.field7681 && var80 < this.field7695 && var22 < var19 && var80 >= var14[var81] + arg7 && var80 < var14[var81] + arg7 + var15[var81]) {
                        this.field7694[this.field7686 * arg1 + var80] = arg4;
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
                    if (arg1 >= var16 && arg1 < var17 && var66 >= this.field7681 && var66 < this.field7695 && var22 < var19 && var66 >= var14[var67] + arg7 && var66 < var14[var67] + arg7 + var15[var67]) {
                        int var68 = this.field7686 * arg1 + var66;
                        int var69 = this.field7694[var68];
                        int var70 = ((var69 & 16711935) * var65 >> 8 & 16711935) + ((var69 & 65280) * var65 >> 8 & 65280);
                        this.field7694[this.field7686 * arg1 + var66] = var64 + var70;
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
                    if (arg1 >= var16 && arg1 < var17 && var72 >= this.field7681 && var72 < this.field7695 && var22 < var19 && var72 >= var14[var73] + arg7 && var72 < var14[var73] + arg7 + var15[var73]) {
                        int var74 = this.field7686 * arg1 + var72;
                        int var75 = this.field7694[var74];
                        int var76 = arg4 + var75;
                        int var77 = (arg4 & 16711935) + (var75 & 16711935);
                        int var78 = (var76 - var77 & 65536) + (var77 & 16777472);
                        this.field7694[var74] = var76 - var78 | var78 - (var78 >>> 8);
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

    @OriginalMember(owner = "client!ni", name = "xa", descriptor = "(F)V")
    public final void method506(float arg0) {
        this.field7676 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(IIIIIIII)V")
    private final void method3172(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 >= this.field7681 && arg0 < this.field7695) {
            int var9 = this.field7686 * arg1 + arg0;
            int var10 = arg3 >>> 24;
            int var11 = arg5 + arg6;
            int var12 = arg7 % var11;
            if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
                if (arg4 == 1) {
                    int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
                    int var14 = 256 - var10;
                    int var15 = 0;
                    while (var15 < arg2) {
                        if (arg1 + var15 >= this.field7678 && arg1 + var15 < this.field7673 && var12 < arg5) {
                            int var16 = this.field7686 * var15 + var9;
                            int var17 = this.field7694[var16];
                            int var18 = ((var17 & 16711935) * var14 >> 8 & 16711935) + ((var17 & 65280) * var14 >> 8 & 65280);
                            this.field7694[var16] = var13 + var18;
                        }
                        ++var15;
                        ++var12;
                        var12 %= var11;
                    }
                } else if (arg4 == 2) {
                    int var19 = 0;
                    while (var19 < arg2) {
                        if (arg1 + var19 >= this.field7678 && arg1 + var19 < this.field7673 && var12 < arg5) {
                            int var20 = this.field7686 * var19 + var9;
                            int var21 = this.field7694[var20];
                            int var22 = arg3 + var21;
                            int var23 = (arg3 & 16711935) + (var21 & 16711935);
                            int var24 = (var22 - var23 & 65536) + (var23 & 16777472);
                            this.field7694[var20] = var22 - var24 | var24 - (var24 >>> 8);
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
                    if (arg1 + var25 >= this.field7678 && arg1 + var25 < this.field7673 && var12 < arg5) {
                        this.field7694[this.field7686 * var25 + var9] = arg3;
                    }
                    ++var25;
                    ++var12;
                    var12 %= var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "JA", descriptor = "(IIIIII)I")
    public final int method394(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = 0;
        float var8 = (float) arg2 * this.field7666.field8895 + (float) arg0 * this.field7666.field8876 + (float) arg1 * this.field7666.field8897 + this.field7666.field8879;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field7666.field8895 + (float) arg3 * this.field7666.field8876 + (float) arg4 * this.field7666.field8897 + this.field7666.field8879;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if (var8 < (float) this.field7701 && var9 < (float) this.field7701) {
            var7 |= 16;
        } else if (var8 > (float) this.field7687 && var9 > (float) this.field7687) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field7666.field8877 + (float) arg0 * this.field7666.field8896 + (float) arg1 * this.field7666.field8870 + this.field7666.field8873) * (float) this.field7682 / var8);
        int var11 = (int) (((float) arg5 * this.field7666.field8877 + (float) arg3 * this.field7666.field8896 + (float) arg4 * this.field7666.field8870 + this.field7666.field8873) * (float) this.field7682 / var9);
        if (var10 < this.field7671 && var11 < this.field7671) {
            var7 |= 1;
        } else if (var10 > this.field7689 && var11 > this.field7689) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field7666.field8886 + (float) arg0 * this.field7666.field8880 + (float) arg1 * this.field7666.field8875 + this.field7666.field8885) * (float) this.field7667 / var8);
        int var13 = (int) (((float) arg5 * this.field7666.field8886 + (float) arg3 * this.field7666.field8880 + (float) arg4 * this.field7666.field8875 + this.field7666.field8885) * (float) this.field7667 / var9);
        if (var12 < this.field7684 && var13 < this.field7684) {
            var7 |= 4;
        } else if (var12 > this.field7679 && var13 > this.field7679) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ni", name = "na", descriptor = "(IIII)[I")
    public final int[] method400(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field7686 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field7694[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ni", name = "pa", descriptor = "()V")
    public final void method418() {
        for (int var1 = 0; var1 < this.field7672.length; ++var1) {
            this.field7672[var1].field7249 = this.field7672[var1].field7251;
            this.field7672[var1].field7257 = false;
        }
    }

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "()I")
    public final int method471() {
        return 0;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lcp;)V")
    public final void method485(class753 arg0) {
        class772 var2 = (class772) arg0;
        this.field7686 = var2.field10651;
        this.field7685 = var2.field10650;
        this.field7694 = var2.field10647;
        this.field7696 = var2;
        this.field7669 = var2.field10651;
        this.field7665 = var2.field10650;
        this.field7698 = var2.field10652;
        this.method3168();
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
    public final void method441(int arg0) {
        this.field7672[arg0].method2980(Thread.currentThread(), (byte) 89);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "()V")
    public final void method392() {
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "()V")
    public final void method413() {
        if (this.field7658 != null) {
            this.field7694 = this.field7656.field9631;
            this.field7686 = this.field7656.field9635;
            this.field7685 = this.field7656.field9632;
            this.field7698 = this.field7683;
            this.field7669 = this.field7700;
            this.field7665 = this.field7688;
        } else {
            this.field7686 = 1;
            this.field7685 = 1;
            this.field7694 = null;
            this.field7669 = 1;
            this.field7665 = 1;
            this.field7698 = null;
        }
        this.field7696 = null;
        this.method3168();
    }

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "(I)Z")
    public final boolean method3173(int arg0) {
        return super.field883.method1263(arg0, (byte) 127).field2752 || super.field883.method1263(arg0, (byte) 124).field2755;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method3174(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 0 && arg4 != 0) {
            if (arg6 != 65535 && !super.field883.method1263(arg6, (byte) 123).field2744) {
                if (this.field7702 != arg6) {
                    class112 var11 = (class112) this.field7677.method2373((long) arg6, 103);
                    if (var11 == null) {
                        int[] var12 = this.method3166(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = this.method3175(arg6) ? 64 : this.field7664;
                        var11 = this.method476(0, var13, var13, true, var13, var12);
                        this.field7677.method2362(var11, 0, (long) arg6);
                    }
                    this.field7702 = arg6;
                    this.field7703 = var11;
                }
                ((class740) this.field7703).method3410(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
            } else {
                this.method3170(arg0, arg1, arg2, arg3, arg7, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Leh;)V")
    public final void method445(class378 arg0) {
        this.field7666 = (class628) arg0;
    }

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "()Z")
    public final boolean method448() {
        return false;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(Z)V")
    public final void method412(boolean arg0) {
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method414(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class510 arg6, int arg7, int arg8) {
        class70 var10 = (class70) arg6;
        int[] var11 = var10.field957;
        int[] var12 = var10.field956;
        int var13 = this.field7678 > arg8 ? this.field7678 : arg8;
        int var14 = this.field7673 < var11.length + arg8 ? this.field7673 : var11.length + arg8;
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
            if (arg0 < this.field7681) {
                var18 += (this.field7681 - arg0) * var20;
                arg0 = this.field7681;
            }
            if (var21 >= this.field7695) {
                var21 = this.field7695 - 1;
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
                                int var28 = this.field7686 * var25 + arg0;
                                int var29 = this.field7694[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field7694[var28] = var23 + var30;
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
                                int var34 = this.field7686 * var31 + arg0;
                                int var35 = this.field7694[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field7694[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field7694[this.field7686 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field7681 && var64 < this.field7695 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field7694[this.field7686 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field7681 && var50 < this.field7695 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field7686 * arg1 + var50;
                        int var54 = this.field7694[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field7694[this.field7686 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field7681 && var56 < this.field7695 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field7686 * arg1 + var56;
                        int var60 = this.field7694[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field7694[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "T", descriptor = "(IIII)V")
    public final void method453(int arg0, int arg1, int arg2, int arg3) {
        if (this.field7681 < arg0) {
            this.field7681 = arg0;
        }
        if (this.field7678 < arg1) {
            this.field7678 = arg1;
        }
        if (this.field7695 > arg2) {
            this.field7695 = arg2;
        }
        if (this.field7673 > arg3) {
            this.field7673 = arg3;
        }
        this.method3169();
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "()V")
    public final void method395() {
        this.field7699.method2364(1);
        this.field7677.method2364(1);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)V")
    public final void method406(int arg0, int arg1) throws class138 {
        if (this.field7658 != null && this.field7656 != null) {
            try {
                Graphics var3 = this.field7658.getGraphics();
                this.field7656.method911(0, 0, arg0, this.field7662, var3, -114, arg1, this.field7660);
            } catch (Exception var4) {
                this.field7658.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "(I)Z")
    public final boolean method3175(int arg0) {
        return this.field7692 || super.field883.method1263(arg0, (byte) 125).field2742;
    }

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "()Z")
    public final boolean method497() {
        return false;
    }

    @OriginalMember(owner = "client!ni", name = "E", descriptor = "()I")
    public final int method466() {
        return 0;
    }

    @OriginalMember(owner = "client!ni", name = "F", descriptor = "(II)V")
    public final void method512(int arg0, int arg1) {
        int var3 = this.field7686 * arg1 + arg0;
        int var4 = this.field7669 * arg1 + arg0;
        if (var3 != 0 || var4 != 0) {
            int[] var5 = this.field7694;
            float[] var6 = this.field7698;
            if (var3 < 0) {
                int var7 = var5.length + var3;
                class42.method289(var5, -var3, var5, 0, var7);
            } else if (var3 > 0) {
                int var8 = var5.length - var3;
                class42.method289(var5, 0, var5, var3, var8);
            }
            if (var4 < 0) {
                int var9 = var6.length + var4;
                class42.method286(var6, -var4, var6, 0, var9);
            } else {
                if (var4 > 0) {
                    int var10 = var6.length - var4;
                    class42.method286(var6, 0, var6, var4, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lhea;)V")
    public final void method437(class443 arg0) {
        class509 var2 = this.method3167(Thread.currentThread());
        class214 var3 = arg0.field6311.field1864;
        for (class214 var4 = var3.field3084; var3 != var4; var4 = var4.field3084) {
            class324 var5 = (class324) var4;
            int var6 = var5.field4854 >> 12;
            int var7 = var5.field4857 >> 12;
            int var8 = var5.field4855 >> 12;
            float var9 = (float) var8 * this.field7666.field8895 + (float) var6 * this.field7666.field8876 + (float) var7 * this.field7666.field8897 + this.field7666.field8879;
            if (!(var9 < (float) this.field7701) && !(var9 > (float) var2.field7260)) {
                int var10 = (int) (((float) var8 * this.field7666.field8877 + (float) var6 * this.field7666.field8896 + (float) var7 * this.field7666.field8870 + this.field7666.field8873) * (float) this.field7682 / var9) + this.field7670;
                int var11 = (int) (((float) var8 * this.field7666.field8886 + (float) var6 * this.field7666.field8880 + (float) var7 * this.field7666.field8875 + this.field7666.field8885) * (float) this.field7667 / var9) + this.field7663;
                if (var10 >= this.field7681 && var10 <= this.field7695 && var11 >= this.field7678 && var11 <= this.field7673) {
                    if (var9 == 0.0F) {
                        var9 = 1.0F;
                    }
                    this.method3165(var5, var10, var11, (int) var9, (int) ((float) (this.field7682 * var5.field4860 >> 12) / var9));
                }
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "(I)V")
    public final void method495(int arg0) {
        class429.field6093 = arg0;
        class429.field6097 = arg0;
        if (this.field7675 > 1) {
            throw new IllegalStateException("No MT");
        } else {
            this.method489(this.field7675);
            this.method441(0);
        }
    }

    @OriginalMember(owner = "client!ni", name = "DA", descriptor = "(IIII)V")
    public final void method409(int arg0, int arg1, int arg2, int arg3) {
        this.field7670 = arg0;
        this.field7663 = arg1;
        this.field7682 = arg2;
        this.field7667 = arg3;
        this.method3169();
    }
}
