import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class349 extends class364 {

    @OriginalMember(owner = "client!j", name = "u", descriptor = "I")
    public int field4803 = 512;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "I")
    private int field4800 = 3500;

    @OriginalMember(owner = "client!j", name = "A", descriptor = "Z")
    public boolean field4809 = false;

    @OriginalMember(owner = "client!j", name = "L", descriptor = "I")
    public int field4820 = 0;

    @OriginalMember(owner = "client!j", name = "J", descriptor = "I")
    public int field4818 = 75518;

    @OriginalMember(owner = "client!j", name = "D", descriptor = "I")
    public int field4812 = 3500;

    @OriginalMember(owner = "client!j", name = "E", descriptor = "Z")
    private boolean field4813 = false;

    @OriginalMember(owner = "client!j", name = "R", descriptor = "I")
    public int field4826 = 45823;

    @OriginalMember(owner = "client!j", name = "P", descriptor = "I")
    private int field4824 = 0;

    @OriginalMember(owner = "client!j", name = "K", descriptor = "I")
    public int field4819 = 0;

    @OriginalMember(owner = "client!j", name = "v", descriptor = "I")
    public int field4804 = 78642;

    @OriginalMember(owner = "client!j", name = "Q", descriptor = "I")
    public int field4825 = 0;

    @OriginalMember(owner = "client!j", name = "x", descriptor = "I")
    public int field4806 = 50;

    @OriginalMember(owner = "client!j", name = "I", descriptor = "I")
    public int field4817 = 512;

    @OriginalMember(owner = "client!j", name = "db", descriptor = "I")
    public int field4838 = 0;

    @OriginalMember(owner = "client!j", name = "ab", descriptor = "I")
    private int field4835 = 0;

    @OriginalMember(owner = "client!j", name = "T", descriptor = "I")
    public int field4828 = 0;

    @OriginalMember(owner = "client!j", name = "eb", descriptor = "I")
    public int field4839 = this.field4800 - 255;

    @OriginalMember(owner = "client!j", name = "jb", descriptor = "I")
    public int field4844 = 0;

    @OriginalMember(owner = "client!j", name = "hb", descriptor = "I")
    public int field4842 = 0;

    @OriginalMember(owner = "client!j", name = "gb", descriptor = "Z")
    private boolean field4841 = false;

    @OriginalMember(owner = "client!j", name = "ib", descriptor = "I")
    private int field4843 = 0;

    @OriginalMember(owner = "client!j", name = "kb", descriptor = "Z")
    private boolean field4845 = false;

    @OriginalMember(owner = "client!j", name = "cb", descriptor = "Lhu;")
    private class76 field4837 = new class76(16);

    @OriginalMember(owner = "client!j", name = "N", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4822;

    @OriginalMember(owner = "client!j", name = "M", descriptor = "Ltr;")
    private class176 field4821;

    @OriginalMember(owner = "client!j", name = "S", descriptor = "[I")
    public int[] field4827;

    @OriginalMember(owner = "client!j", name = "Y", descriptor = "I")
    public int field4833;

    @OriginalMember(owner = "client!j", name = "V", descriptor = "I")
    private int field4830;

    @OriginalMember(owner = "client!j", name = "t", descriptor = "F")
    private float field4802;

    @OriginalMember(owner = "client!j", name = "W", descriptor = "F")
    private float field4831;

    @OriginalMember(owner = "client!j", name = "s", descriptor = "I")
    public int field4801;

    @OriginalMember(owner = "client!j", name = "z", descriptor = "I")
    public int field4808;

    @OriginalMember(owner = "client!j", name = "B", descriptor = "I")
    public int field4810;

    @OriginalMember(owner = "client!j", name = "C", descriptor = "I")
    public int field4811;

    @OriginalMember(owner = "client!j", name = "F", descriptor = "I")
    public int field4814;

    @OriginalMember(owner = "client!j", name = "G", descriptor = "I")
    private int field4815;

    @OriginalMember(owner = "client!j", name = "H", descriptor = "I")
    public int field4816;

    @OriginalMember(owner = "client!j", name = "O", descriptor = "I")
    public int field4823;

    @OriginalMember(owner = "client!j", name = "U", descriptor = "I")
    public int field4829;

    @OriginalMember(owner = "client!j", name = "X", descriptor = "I")
    public int field4832;

    @OriginalMember(owner = "client!j", name = "bb", descriptor = "I")
    public int field4836;

    @OriginalMember(owner = "client!j", name = "Z", descriptor = "Lba;")
    public class240 field4834;

    @OriginalMember(owner = "client!j", name = "lb", descriptor = "Laa;")
    private class310 field4846;

    @OriginalMember(owner = "client!j", name = "fb", descriptor = "Lhu;")
    private class76 field4840;

    @OriginalMember(owner = "client!j", name = "w", descriptor = "Z")
    public boolean field4805;

    @OriginalMember(owner = "client!j", name = "y", descriptor = "[Lwq;")
    private class104[] field4807;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "(I)V")
    public final void method2064(int arg0) {
        this.method2003(0, 0, this.field4833, this.field4830, arg0, 0);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IFFFFF)V")
    public final void method2075(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field4826 = (int) (arg1 * 65535.0F);
        this.field4804 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field4810 = (int) (arg3 * 65535.0F / var7);
        this.field4801 = (int) (arg4 * 65535.0F / var7);
        this.field4816 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFF)V")
    public final void method2113(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!j", name = "h", descriptor = "(I)Z")
    public final boolean method2155(int arg0) {
        return super.field4988.method1621(18318, arg0).field310;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Ljava/lang/Runnable;)Lwq;")
    public final class104 method2156(Runnable arg0) {
        for (int var2 = 0; var2 < this.field4811; ++var2) {
            if (this.field4807[var2].field1517 == arg0) {
                return this.field4807[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!j", name = "p", descriptor = "()V")
    public final void method2111() {
        if (this.field4845) {
            class136.method823(false, -1, true);
            this.field4845 = false;
        }
        this.field4822 = null;
        this.field4821 = null;
        this.field4813 = true;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIII)V")
    public final void method2010(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class104 var8 = this.method2156(Thread.currentThread());
        class166 var9 = var8.field1508;
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
            int var21 = arg0 - var9.method967();
            int var22 = arg1 - var9.method977();
            int var23 = var17 + var21;
            int var24 = var21 - var18;
            int var25 = var10 + var21 - var18;
            int var26 = var10 + var21 + var17;
            int var27 = var19 + var22;
            int var28 = var22 - var20;
            int var29 = var11 + var22 - var20;
            int var30 = var11 + var22 + var19;
            if (arg6 == 0) {
                var9.field2293 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field2293 = 255 - (arg4 >> 24);
            }
            var9.field2298 = var23 < 0 || var23 > var9.field2295 || var24 < 0 || var24 > var9.field2295 || var25 < 0 || var25 > var9.field2295;
            var9.method968(var27, var28, var29, var23, var24, var25, arg4);
            var9.field2298 = var23 < 0 || var23 > var9.field2295 || var24 < 0 || var24 > var9.field2295 || var26 < 0 || var26 > var9.field2295;
            var9.method968(var27, var29, var30, var23, var25, var26, arg4);
        }
    }

    @OriginalMember(owner = "client!j", name = "i", descriptor = "(I)Z")
    public final boolean method2157(int arg0) {
        return super.field4988.method1620(-3810, arg0);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([Lgn;Lon;[Lau;I)V")
    public final void method2102(class456[] arg0, class203 arg1, class478[] arg2, int arg3) {
        class331[] var5 = new class331[arg0.length];
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class331) arg0[var6];
            }
        }
        class331 var7 = class331.method1892(this, var5);
        var7.method1870(arg1, arg2 != null ? arg2[0] : null, (class342) null, arg3);
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(II)V")
    public final void method2022(int arg0, int arg1) {
        this.field4806 = arg0;
        this.field4800 = arg1;
        this.field4839 = this.field4800 - 255;
        this.method2164();
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lrc;)V")
    public final void method2112(class346 arg0) {
    }

    @OriginalMember(owner = "client!j", name = "D", descriptor = "()I")
    public final int method1977() {
        return 0;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([I)V")
    public final void method2074(int[] arg0) {
        arg0[0] = this.field4842;
        arg0[1] = this.field4825;
        arg0[2] = this.field4820;
        arg0[3] = this.field4828;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIII)V")
    public final void method1969(int arg0, int arg1, int arg2, int arg3) {
        if (this.field4842 < arg0) {
            this.field4842 = arg0;
        }
        if (this.field4825 < arg1) {
            this.field4825 = arg1;
        }
        if (this.field4820 > arg2) {
            this.field4820 = arg2;
        }
        if (this.field4828 > arg3) {
            this.field4828 = arg3;
        }
        this.method2160();
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method1970(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class104 var11 = this.method2156(Thread.currentThread());
        class166 var12 = var11.field1508;
        var12.field2292 = false;
        int var13 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var13 == 255) {
            var12.field2292 = false;
            var12.field2293 = 0;
            var12.field2298 = true;
            var12.method975(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else {
            if (arg9 != 1) {
                if (arg9 == 2) {
                    throw new IllegalStateException();
                }
                throw new IllegalArgumentException();
            }
            var12.field2292 = false;
            var12.field2293 = 255 - var13;
            var12.field2298 = true;
            var12.method975(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        }
        var12.field2292 = true;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lkg;)V")
    public final void method2100(class163 arg0) {
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FF)V")
    public final void method1997(float arg0, float arg1) {
        this.field4802 = arg0;
        this.field4831 = arg1;
        this.method2164();
    }

    @OriginalMember(owner = "client!j", name = "j", descriptor = "(I)I")
    public final int method2158(int arg0) {
        return super.field4988.method1621(18318, arg0).field295 & 65535;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lgn;Ltp;Lon;Lau;I)V")
    public final void method2051(class456 arg0, class342 arg1, class203 arg2, class478 arg3, int arg4) {
        ((class331) arg0).method1870(arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)I")
    public final int method1979(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method2110(Canvas arg0) {
        this.field4822 = arg0;
        this.method1988();
    }

    @OriginalMember(owner = "client!j", name = "f", descriptor = "(I)Lkg;")
    public final class163 method1954(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIII[BII)V")
    public final void method2048(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field4833 * arg1 + arg0;
            int var15 = this.field4833 - arg2;
            if (arg1 + arg3 > this.field4828) {
                arg3 -= arg1 + arg3 - this.field4828;
            }
            if (arg1 < this.field4825) {
                int var16 = this.field4825 - arg1;
                arg3 -= var16;
                var14 += this.field4833 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field4820) {
                int var17 = arg0 + arg2 - this.field4820;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field4842) {
                int var18 = this.field4842 - arg0;
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
                            int var28 = this.field4827[var14];
                            this.field4827[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field4827[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field4827[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field4827[var14++] = arg5;
                        } else {
                            this.field4827[var14++] = arg4;
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

    @OriginalMember(owner = "client!j", name = "B", descriptor = "()V")
    public final void method1965() {
        this.field4819 = this.field4843;
        this.field4809 = false;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(Z)V")
    public final void method2023(boolean arg0) {
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "()F")
    public final float method2009() {
        return this.field4802;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lat;III)V")
    public final void method2159(class233 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 >> 1;
        int var6 = arg0.field3098;
        if (var6 == -1) {
            this.method2059(arg1, arg2, var5, arg0.field3093, 1);
        } else {
            if (this.field4846 == null || (long) var6 != this.field4846.field6047) {
                this.field4846 = (class310) this.field4837.method493((byte) 19, (long) var6);
            }
            if (this.field4846 == null) {
                int[] var7 = this.method2161(var6);
                if (var7 == null) {
                    return;
                }
                this.field4846 = new class310();
                this.field4846.field4094 = this.method2165(var6);
                int var8 = this.field4846.field4094 ? 64 : 128;
                this.field4846.field4092 = this.method1982(var7, 0, var8, var8, var8);
                this.field4837.method505((long) var6, this.field4846, 28);
            }
            if (this.field4846.field4094) {
                var5 <<= 1;
                arg3 <<= 1;
            }
            this.field4846.field4092.method773(arg1 - var5, arg2 - var5, arg3, arg3, 1, arg0.field3093, 1);
        }
    }

    @OriginalMember(owner = "client!j", name = "l", descriptor = "()V")
    public final void method2005() {
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIII)V")
    public final void method2031(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method2073(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method2073(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method2052(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method2052(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field4842) {
                    var10 += (this.field4842 - arg0) * var12;
                    arg0 = this.field4842;
                }
                if (var13 >= this.field4820) {
                    var13 = this.field4820 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field4825 && var17 < this.field4828) {
                                int var18 = this.field4833 * var17 + arg0;
                                int var19 = this.field4827[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field4827[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field4825 && var21 < this.field4828) {
                                int var22 = this.field4833 * var21 + arg0;
                                int var23 = this.field4827[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field4827[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field4825 && var27 < this.field4828) {
                            this.field4827[this.field4833 * var27 + arg0] = arg4;
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
                if (arg1 < this.field4825) {
                    var29 += (this.field4825 - arg1) * var31;
                    arg1 = this.field4825;
                }
                if (var32 >= this.field4828) {
                    var32 = this.field4828 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field4842 && var46 < this.field4820) {
                            this.field4827[this.field4833 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field4842 && var36 < this.field4820) {
                            int var37 = this.field4833 * arg1 + var36;
                            int var38 = this.field4827[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field4827[this.field4833 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field4842 && var40 < this.field4820) {
                            int var41 = this.field4833 * arg1 + var40;
                            int var42 = this.field4827[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field4827[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()V")
    private final void method2160() {
        this.field4814 = this.field4842 - this.field4823;
        this.field4836 = this.field4820 - this.field4823;
        this.field4808 = this.field4825 - this.field4829;
        this.field4832 = this.field4828 - this.field4829;
        for (int var1 = 0; var1 < this.field4811; ++var1) {
            class166 var5 = this.field4807[var1].field1508;
            var5.field2296 = this.field4823 - this.field4842;
            var5.field2291 = this.field4829 - this.field4825;
            var5.field2295 = this.field4820 - this.field4842;
            var5.field2299 = this.field4828 - this.field4825;
        }
        int var2 = this.field4833 * this.field4825 + this.field4842;
        for (int var3 = this.field4825; var3 < this.field4828; ++var3) {
            for (int var4 = 0; var4 < this.field4811; ++var4) {
                this.field4807[var4].field1508.field2302[var3 - this.field4825] = var2;
            }
            var2 += this.field4833;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lon;)V")
    public final void method1956(class203 arg0) {
        this.field4834 = (class240) arg0;
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(IIIII)V")
    public final void method2052(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field4842 && arg0 < this.field4820) {
            if (arg1 < this.field4825) {
                arg2 -= this.field4825 - arg1;
                arg1 = this.field4825;
            }
            if (arg1 + arg2 > this.field4828) {
                arg2 = this.field4828 - arg1;
            }
            int var6 = this.field4833 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field4833 * var10 + var6;
                        int var12 = this.field4827[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field4827[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field4833 * var14 + var6;
                        int var16 = this.field4827[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field4827[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field4827[this.field4833 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "s", descriptor = "()Z")
    public final boolean method1968() {
        return false;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II[[I[[IIII)Ltf;")
    public final class177 method2089(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class53(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "k", descriptor = "(I)[I")
    private final int[] method2161(int arg0) {
        class76 var2 = this.field4840;
        class254 var3;
        synchronized (this.field4840) {
            var3 = (class254) this.field4840.method493((byte) 19, (long) arg0);
            if (var3 == null) {
                if (!super.field4988.method1620(-3810, arg0)) {
                    return null;
                }
                class23 var5 = super.field4988.method1621(18318, arg0);
                int var6 = !var5.field309 && !this.field4841 ? 128 : 64;
                var3 = new class254(arg0, var6, super.field4988.method1619(0.7F, -6322, var6, true, var6, arg0), var5.field304);
                this.field4840.method505((long) arg0, var3, 37);
            }
        }
        var3.field3382 = true;
        return var3.method1427();
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIZ)Ljd;")
    public final class139 method2026(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field4833 * arg1 + arg0;
        int var8 = this.field4833 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field4827[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class201(this, var6, arg2, arg3);
        } else {
            return new class439(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!j", name = "J", descriptor = "()V")
    public final void method2006() {
        this.field4842 = 0;
        this.field4825 = 0;
        this.field4820 = this.field4833;
        this.field4828 = this.field4830;
        this.method2160();
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method1952(Rectangle[] arg0, int arg1) {
        if (this.field4822 != null && this.field4821 != null) {
            try {
                Graphics var3 = this.field4822.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field4833 && var5.y <= this.field4830 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field4821.method1010(var5.height, var5.x, var5.y, 7, var3, var5.width);
                    }
                }
            } catch (Exception var6) {
                this.field4822.repaint();
            }
        } else {
            throw new IllegalStateException("Can't flip an offscreen toolkit");
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lci;I)V")
    public class349(Canvas arg0, class287 arg1, int arg2) {
        super(arg2, arg1);
        this.field4822 = arg0;
        this.field4821 = class363.method2211(this.field4822, -1143953951);
        this.field4827 = this.field4821.field2397;
        this.field4833 = this.field4821.field2393;
        this.field4830 = this.field4821.field2401;
        this.method2166();
    }

    @OriginalMember(owner = "client!j", name = "j", descriptor = "()Z")
    public final boolean method1992() {
        return false;
    }

    @OriginalMember(owner = "client!j", name = "g", descriptor = "(I)V")
    public final void method2041(int arg0) {
        this.field4807[arg0].method630(126, Thread.currentThread());
    }

    @OriginalMember(owner = "client!j", name = "n", descriptor = "()Z")
    public final boolean method2043() {
        return false;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(IIII)V")
    public final void method1975(int arg0, int arg1, int arg2, int arg3) {
        this.field4823 = arg0;
        this.field4829 = arg1;
        this.field4817 = arg2;
        this.field4803 = arg3;
        this.method2160();
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V")
    public final void method2069(boolean arg0) {
    }

    @OriginalMember(owner = "client!j", name = "l", descriptor = "(I)[I")
    public final int[] method2162(int arg0) {
        class76 var2 = this.field4840;
        class254 var3;
        synchronized (this.field4840) {
            var3 = (class254) this.field4840.method493((byte) 19, (long) arg0);
            if (var3 == null) {
                if (!super.field4988.method1620(-3810, arg0)) {
                    return null;
                }
                class23 var5 = super.field4988.method1621(18318, arg0);
                int var6 = !var5.field309 && !this.field4841 ? 128 : 64;
                var3 = new class254(arg0, var6, super.field4988.method1622(arg0, true, -127, var6, 0.7F, var6), var5.field304);
                this.field4840.method505((long) arg0, var3, 62);
            }
        }
        var3.field3382 = true;
        return var3.method1427();
    }

    @OriginalMember(owner = "client!j", name = "h", descriptor = "(IIII)V")
    public final void method1981(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field4833) {
            arg2 = this.field4833;
        }
        if (arg3 > this.field4830) {
            arg3 = this.field4830;
        }
        this.field4842 = arg0;
        this.field4820 = arg2;
        this.field4825 = arg1;
        this.field4828 = arg3;
        this.method2160();
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(II)I")
    public final int method2103(int arg0, int arg1) {
        int var3 = arg0 | 66560;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!j", name = "v", descriptor = "()Z")
    public final boolean method1951() {
        return true;
    }

    @OriginalMember(owner = "client!j", name = "g", descriptor = "()Z")
    public final boolean method1991() {
        return true;
    }

    @OriginalMember(owner = "client!j", name = "r", descriptor = "()I")
    public final int method2047() {
        int var1 = this.field4824;
        this.field4824 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!j", name = "G", descriptor = "()Z")
    public final boolean method2109() {
        return false;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()Z")
    public final boolean method2163() {
        return this.field4813;
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(IIII)[I")
    public final int[] method2104(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field4833 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field4827[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(Z)V")
    public final void method2093(boolean arg0) {
        this.field4841 = arg0;
        this.field4840.method495(-110);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lpr;IIII)Lgn;")
    public final class456 method2094(class284 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class331(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(F)V")
    public final void method2087(float arg0) {
        this.field4818 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(I)V")
    public final void method2015(int arg0) {
        this.field4807[arg0].method630(125, (Runnable) null);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V")
    public final void method2059(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field4825) {
            var6 = this.field4825;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field4828) {
            var7 = this.field4828;
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
                if (var64 < this.field4842) {
                    var64 = this.field4842;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field4820) {
                    var65 = this.field4820;
                }
                int var66 = this.field4833 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field4827[var66++] = arg3;
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
                if (var60 < this.field4842) {
                    var60 = this.field4842;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field4820 - 1) {
                    var61 = this.field4820 - 1;
                }
                int var62 = this.field4833 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field4827[var62++] = arg3;
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
                if (var28 < this.field4842) {
                    var28 = this.field4842;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field4820) {
                    var29 = this.field4820;
                }
                int var30 = this.field4833 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field4827[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field4827[var30++] = var15 + var33;
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
                if (var22 < this.field4842) {
                    var22 = this.field4842;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field4820 - 1) {
                    var23 = this.field4820 - 1;
                }
                int var24 = this.field4833 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field4827[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field4827[var24++] = var15 + var27;
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
                if (var47 < this.field4842) {
                    var47 = this.field4842;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field4820) {
                    var48 = this.field4820;
                }
                int var49 = this.field4833 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field4827[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field4827[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field4842) {
                    var39 = this.field4842;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field4820 - 1) {
                    var40 = this.field4820 - 1;
                }
                int var41 = this.field4833 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field4827[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field4827[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(II)V")
    public final void method2108(int arg0, int arg1) {
        this.field4819 = arg0 & 16777215;
        int var3 = this.field4819 >>> 16 & 255;
        if (var3 < 2) {
            var3 = 2;
        }
        int var4 = this.field4819 >> 8 & 255;
        if (var4 < 2) {
            var4 = 2;
        }
        int var5 = this.field4819 & 255;
        if (var5 < 2) {
            var5 = 2;
        }
        this.field4819 = var3 << 16 | var4 << 8 | var5;
        if (arg1 < 0) {
            this.field4805 = false;
        } else {
            this.field4805 = true;
        }
    }

    @OriginalMember(owner = "client!j", name = "g", descriptor = "(IIII)V")
    public final void method1989(int arg0, int arg1, int arg2, int arg3) {
        this.field4843 = this.field4819;
        this.field4838 = arg0;
        this.field4819 = arg1;
        this.field4844 = arg2;
        this.field4809 = true;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II[I[I)Lkf;")
    public final class152 method2017(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class129(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!j", name = "E", descriptor = "()V")
    public final void method2083() {
    }

    @OriginalMember(owner = "client!j", name = "A", descriptor = "()Z")
    public final boolean method2011() {
        return false;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lvi;[Ldk;Z)Lur;")
    public final class345 method2084(class347 arg0, class325[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field4331;
            var5[var7] = arg1[var7].field4333;
            if (arg1[var7].field4330 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            return new class237(this, arg0, arg1, var4, var5);
        } else if (var6) {
            return new class457(this, arg0, arg1, var4, var5);
        } else {
            return new class333(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lrc;Lrc;FLrc;)Lrc;")
    public final class346 method2098(class346 arg0, class346 arg1, float arg2, class346 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!j", name = "x", descriptor = "()Z")
    public final boolean method2080() {
        return true;
    }

    @OriginalMember(owner = "client!j", name = "C", descriptor = "()V")
    public final void method1966() {
        if (this.field4822 != null && this.field4821 != null) {
            try {
                Graphics var1 = this.field4822.getGraphics();
                this.field4821.method1011(var1, 0, 0, 0);
            } catch (Exception var2) {
                this.field4822.repaint();
            }
        } else {
            throw new IllegalStateException("Can't flip an offscreen toolkit");
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Ltp;)V")
    public final void method1993(class342 arg0) {
        class447 var2 = arg0.field4574.field4314;
        for (class447 var3 = var2.field6079; var2 != var3; var3 = var3.field6079) {
            class233 var4 = (class233) var3;
            int var5 = var4.field3088 >> 12;
            int var6 = var4.field3094 >> 12;
            int var7 = var4.field3091 >> 12;
            int var8 = (this.field4834.field3200 * var7 + this.field4834.field3201 * var5 + this.field4834.field3199 * var6 >> 15) + this.field4834.field3198;
            if (var8 >= this.field4806 && var8 <= this.field4800) {
                int var9 = ((this.field4834.field3194 * var7 + this.field4834.field3202 * var5 + this.field4834.field3197 * var6 >> 15) + this.field4834.field3195) * this.field4817 / var8 + this.field4823;
                int var10 = ((this.field4834.field3196 * var7 + this.field4834.field3204 * var5 + this.field4834.field3203 * var6 >> 15) + this.field4834.field3193) * this.field4803 / var8 + this.field4829;
                if (var9 >= this.field4842 && var9 <= this.field4820 && var10 >= this.field4825 && var10 <= this.field4828) {
                    if (var8 == 0) {
                        var8 = 1;
                    }
                    this.method2159(var4, var9, var10, (var4.field3096 >> 2) / var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "f", descriptor = "()V")
    public final void method2019() {
    }

    @OriginalMember(owner = "client!j", name = "h", descriptor = "()Lon;")
    public final class203 method1960() {
        class104 var1 = this.method2156(Thread.currentThread());
        return var1.field1513;
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "()V")
    private final void method2164() {
        if (this.field4831 != 0.0F) {
            float var1 = (float) this.field4800;
            float var2 = (float) this.field4806;
            float var3 = -(var2 * 2.0F * var1) / (var1 - var2);
            float var4 = this.field4802 / (this.field4831 + this.field4802);
            float var5 = var4 * var4;
            float var6 = (1.0F - var4) * -var3 * (1.0F - var4) / this.field4831;
            this.field4812 = (int) (((float) this.field4800 - var3 * var5) / ((var1 + var2) / (var1 - var2) - var6) + 0.5F);
        } else {
            this.field4812 = this.field4800;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I[Lof;)V")
    public final void method1978(int arg0, class404[] arg1) {
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V")
    public final void method2062(int arg0) {
        if (this.field4811 != arg0) {
            this.field4811 = arg0;
            this.field4807 = new class104[this.field4811];
            for (int var2 = 0; var2 < this.field4811; ++var2) {
                this.field4807[var2] = new class104(this);
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "k", descriptor = "()I")
    public final int method1998() {
        return this.field4806;
    }

    @OriginalMember(owner = "client!j", name = "F", descriptor = "()Z")
    public final boolean method1996() {
        return false;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIILkf;II)V")
    public final void method1985(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class152 arg6, int arg7, int arg8) {
        class129 var10 = (class129) arg6;
        int[] var11 = var10.field1894;
        int[] var12 = var10.field1897;
        int var13 = this.field4825 > arg8 ? this.field4825 : arg8;
        int var14 = this.field4828 < var11.length + arg8 ? this.field4828 : var11.length + arg8;
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
            if (arg0 < this.field4842) {
                var18 += (this.field4842 - arg0) * var20;
                arg0 = this.field4842;
            }
            if (var21 >= this.field4820) {
                var21 = this.field4820 - 1;
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
                                int var28 = this.field4833 * var25 + arg0;
                                int var29 = this.field4827[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field4827[var28] = var23 + var30;
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
                                int var34 = this.field4833 * var31 + arg0;
                                int var35 = this.field4827[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field4827[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field4827[this.field4833 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field4842 && var64 < this.field4820 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field4827[this.field4833 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field4842 && var50 < this.field4820 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field4833 * arg1 + var50;
                        int var54 = this.field4827[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field4827[this.field4833 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field4842 && var56 < this.field4820 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field4833 * arg1 + var56;
                        int var60 = this.field4827[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field4827[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "q", descriptor = "()Z")
    public final boolean method2085() {
        return true;
    }

    @OriginalMember(owner = "client!j", name = "z", descriptor = "()I")
    public final int method1950() {
        return this.field4800;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III[I)V")
    public final void method1986(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (this.field4834.field3200 * arg2 + this.field4834.field3201 * arg0 + this.field4834.field3199 * arg1 >> 15) + this.field4834.field3198;
        if (var5 >= this.field4806 && var5 <= this.field4800) {
            int var6 = ((this.field4834.field3194 * arg2 + this.field4834.field3202 * arg0 + this.field4834.field3197 * arg1 >> 15) + this.field4834.field3195) * this.field4817 / var5;
            int var7 = ((this.field4834.field3196 * arg2 + this.field4834.field3204 * arg0 + this.field4834.field3203 * arg1 >> 15) + this.field4834.field3193) * this.field4803 / var5;
            if (var6 >= this.field4814 && var6 <= this.field4836 && var7 >= this.field4808 && var7 <= this.field4832) {
                arg3[0] = var6 - this.field4814;
                arg3[1] = var7 - this.field4808;
                arg3[2] = var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!j", name = "K", descriptor = "()I")
    public final int method2086() {
        return 0;
    }

    @OriginalMember(owner = "client!j", name = "w", descriptor = "()F")
    public final float method2107() {
        return this.field4831;
    }

    @OriginalMember(owner = "client!j", name = "o", descriptor = "()V")
    public final void method1964() {
    }

    @OriginalMember(owner = "client!j", name = "H", descriptor = "()Z")
    public final boolean method2097() {
        return false;
    }

    @OriginalMember(owner = "client!j", name = "i", descriptor = "()Z")
    public final boolean method2079() {
        return false;
    }

    @OriginalMember(owner = "client!j", name = "e", descriptor = "()V")
    public final void method1988() {
        this.field4821 = class363.method2211(this.field4822, -1143953951);
        this.field4827 = this.field4821.field2397;
        this.field4833 = this.field4821.field2393;
        this.field4830 = this.field4821.field2401;
        for (int var1 = 0; var1 < this.field4811; ++var1) {
            this.field4807[var1].method637(70);
        }
        this.method2006();
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([Lgn;Ltp;Lon;[Lau;I)V")
    public final void method2081(class456[] arg0, class342 arg1, class203 arg2, class478[] arg3, int arg4) {
        class331[] var6 = new class331[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class331) arg0[var7];
            }
        }
        class331 var8 = class331.method1892(this, var6);
        var8.method1870(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!j", name = "m", descriptor = "()I")
    public final int method2046() {
        int var1 = this.field4835;
        this.field4835 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!j", name = "f", descriptor = "(IIII)V")
    public final void method2066(int arg0, int arg1, int arg2, int arg3) {
        this.field4838 = arg0;
        this.field4819 = arg1;
        this.field4844 = arg2;
    }

    @OriginalMember(owner = "client!j", name = "u", descriptor = "()Z")
    public final boolean method1995() {
        return false;
    }

    @OriginalMember(owner = "client!j", name = "m", descriptor = "(I)Z")
    public final boolean method2165(int arg0) {
        return this.field4841 || super.field4988.method1621(18318, arg0).field309;
    }

    @OriginalMember(owner = "client!j", name = "t", descriptor = "()Z")
    public final boolean method2007() {
        return false;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Ldk;Z)Ljd;")
    public final class139 method2050(class325 arg0, boolean arg1) {
        int[] var3 = arg0.field4334;
        byte[] var4 = arg0.field4337;
        int var5 = arg0.field4331;
        int var6 = arg0.field4333;
        class126 var11;
        if (arg1 && arg0.field4330 == null) {
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
            var11 = new class328(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field4330;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class201(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var21 = var5 * var19;
                    for (int var22 = 0; var22 < var5; ++var22) {
                        var14[var21 + var22] = var3[var4[var21 + var22] & 255];
                    }
                }
                new class201(this, var14, var5, var6);
                var11 = new class439(this, var14, var5, var6);
            }
        }
        var11.method772(arg0.field4336, arg0.field4329, arg0.field4332, arg0.field4335);
        return var11;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
    public final void method2002(int arg0) {
        int var2 = arg0 - this.field4815;
        for (Object var3 = this.field4840.method500(-127); var3 != null; var3 = this.field4840.method499(true)) {
            class254 var4 = (class254) var3;
            if (var4.field3382) {
                var4.field3380 += var2;
                int var5 = var4.field3380 / 20;
                if (var5 > 0) {
                    class23 var6 = super.field4988.method1621(18318, var4.field3383);
                    var4.method1426(var6.field307 * var2 * 50 / 1000, var6.field311 * var2 * 50 / 1000);
                    var4.field3380 -= var5 * 20;
                }
                var4.field3382 = false;
            }
        }
        this.field4815 = arg0;
        this.field4837.method496(5, 123);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(IIIII)V")
    public final void method2073(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field4825 && arg1 < this.field4828) {
            if (arg0 < this.field4842) {
                arg2 -= this.field4842 - arg0;
                arg0 = this.field4842;
            }
            if (arg0 + arg2 > this.field4820) {
                arg2 = this.field4820 - arg0;
            }
            int var6 = this.field4833 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field4827[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field4827[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field4827[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field4827[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field4827[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "e", descriptor = "(IIII)V")
    public final void method2091(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!j", name = "L", descriptor = "()V")
    public final void method1987() {
        this.field4840.method495(-98);
    }

    @OriginalMember(owner = "client!j", name = "y", descriptor = "()Z")
    public final boolean method1999() {
        return false;
    }

    @OriginalMember(owner = "client!j", name = "h", descriptor = "(IIIIII)V")
    public final void method2003(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field4842) {
            arg2 -= this.field4842 - arg0;
            arg0 = this.field4842;
        }
        if (arg1 < this.field4825) {
            arg3 -= this.field4825 - arg1;
            arg1 = this.field4825;
        }
        if (arg0 + arg2 > this.field4820) {
            arg2 = this.field4820 - arg0;
        }
        if (arg1 + arg3 > this.field4828) {
            arg3 = this.field4828 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field4820 && arg1 <= this.field4828) {
            int var7 = this.field4833 - arg2;
            int var8 = this.field4833 * arg1 + arg0;
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
                            this.field4827[var24] = arg4;
                            ++var24;
                            this.field4827[var24] = arg4;
                            ++var24;
                            this.field4827[var24] = arg4;
                            ++var24;
                            this.field4827[var24] = arg4;
                            ++var24;
                            this.field4827[var24] = arg4;
                            ++var24;
                            this.field4827[var24] = arg4;
                            ++var24;
                            this.field4827[var24] = arg4;
                            ++var24;
                            this.field4827[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field4827[var24] = arg4;
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
                        int var14 = this.field4827[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + ((var14 & 65280) * var11 >> 8 & 65280);
                        this.field4827[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field4827[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field4827[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "g", descriptor = "(IIIIII)Lrc;")
    public final class346 method2039(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!j", name = "I", descriptor = "()Lon;")
    public final class203 method2012() {
        return new class240();
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(IIIIII)Z")
    public final boolean method2099(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (this.field4834.field3200 * arg2 + this.field4834.field3201 * arg0 + this.field4834.field3199 * arg1 >> 15) + this.field4834.field3198;
        if (var7 < 1) {
            var7 = 1;
        }
        int var8 = (this.field4834.field3200 * arg5 + this.field4834.field3201 * arg3 + this.field4834.field3199 * arg4 >> 15) + this.field4834.field3198;
        if (var8 < 1) {
            var8 = 1;
        }
        if ((var7 >= this.field4806 || var8 >= this.field4806) && (var7 <= this.field4800 || var8 <= this.field4800)) {
            int var9 = ((this.field4834.field3194 * arg2 + this.field4834.field3202 * arg0 + this.field4834.field3197 * arg1 >> 15) + this.field4834.field3195) * this.field4817 / var7;
            int var10 = ((this.field4834.field3194 * arg5 + this.field4834.field3202 * arg3 + this.field4834.field3197 * arg4 >> 15) + this.field4834.field3195) * this.field4817 / var8;
            if (var9 < this.field4814 && var10 < this.field4814 || var9 > this.field4836 && var10 > this.field4836) {
                return false;
            } else {
                int var11 = ((this.field4834.field3196 * arg2 + this.field4834.field3204 * arg0 + this.field4834.field3203 * arg1 >> 15) + this.field4834.field3193) * this.field4803 / var7;
                int var12 = ((this.field4834.field3196 * arg5 + this.field4834.field3204 * arg3 + this.field4834.field3203 * arg4 >> 15) + this.field4834.field3193) * this.field4803 / var8;
                return (var11 >= this.field4808 || var12 >= this.field4808) && (var11 <= this.field4832 || var12 <= this.field4832);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILkf;II)V")
    public final void method2029(int arg0, class152 arg1, int arg2, int arg3) {
        class129 var5 = (class129) arg1;
        int[] var6 = var5.field1894;
        int[] var7 = var5.field1897;
        int var8;
        if (this.field4828 < var6.length + arg3) {
            var8 = this.field4828 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field4825 > arg3) {
            var9 = this.field4825 - arg3;
            arg3 = this.field4825;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field4833 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field4842 > var12) {
                    var13 -= this.field4842 - var12;
                    var12 = this.field4842;
                }
                if (this.field4820 < var12 + var13) {
                    var13 = this.field4820 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field4827[var14++] = arg0;
                }
                var10 += this.field4833;
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "M", descriptor = "()V")
    private final void method2166() {
        this.field4840 = new class76(20);
        this.field4834 = new class240();
        class301.method1686((byte) 72, false, true);
        this.field4845 = true;
        this.method2062(1);
        this.method2041(0);
        this.method2006();
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(IIIIII)V")
    public final void method1973(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2073(arg0, arg1, arg2, arg4, arg5);
        this.method2073(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method2052(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method2052(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([IIIII)Ljd;")
    public final class139 method1982(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class201(this, arg0, arg1, arg2, arg3, arg4) : new class439(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class201(this, arg0, arg1, arg2, arg3, arg4) : new class439(this, arg0, arg1, arg2, arg3, arg4);
    }
}
