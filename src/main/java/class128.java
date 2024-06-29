import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class128 extends class167 {

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "Z")
    private boolean field2074;

    @OriginalMember(owner = "client!wk", name = "u", descriptor = "Z")
    private boolean field2077;

    @OriginalMember(owner = "client!wk", name = "t", descriptor = "Lsba;")
    private class200 field2076;

    @OriginalMember(owner = "client!wk", name = "y", descriptor = "I")
    public int field2081;

    @OriginalMember(owner = "client!wk", name = "D", descriptor = "I")
    public int field2086;

    @OriginalMember(owner = "client!wk", name = "H", descriptor = "I")
    public int field2090;

    @OriginalMember(owner = "client!wk", name = "w", descriptor = "I")
    public int field2079;

    @OriginalMember(owner = "client!wk", name = "A", descriptor = "I")
    public int field2083;

    @OriginalMember(owner = "client!wk", name = "N", descriptor = "I")
    public int field2096;

    @OriginalMember(owner = "client!wk", name = "V", descriptor = "I")
    public int field2104;

    @OriginalMember(owner = "client!wk", name = "cb", descriptor = "Z")
    private boolean field2111;

    @OriginalMember(owner = "client!wk", name = "B", descriptor = "I")
    public int field2084;

    @OriginalMember(owner = "client!wk", name = "L", descriptor = "I")
    public int field2094;

    @OriginalMember(owner = "client!wk", name = "Z", descriptor = "I")
    public int field2108;

    @OriginalMember(owner = "client!wk", name = "db", descriptor = "I")
    public int field2112;

    @OriginalMember(owner = "client!wk", name = "eb", descriptor = "I")
    private int field2113;

    @OriginalMember(owner = "client!wk", name = "W", descriptor = "I")
    private int field2105;

    @OriginalMember(owner = "client!wk", name = "S", descriptor = "Lvg;")
    private class49 field2101;

    @OriginalMember(owner = "client!wk", name = "gb", descriptor = "I")
    private int field2115;

    @OriginalMember(owner = "client!wk", name = "G", descriptor = "Lvg;")
    private class49 field2089;

    @OriginalMember(owner = "client!wk", name = "z", descriptor = "Lmda;")
    public class243 field2082;

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "I")
    private int field2073;

    @OriginalMember(owner = "client!wk", name = "x", descriptor = "I")
    public int field2080;

    @OriginalMember(owner = "client!wk", name = "C", descriptor = "I")
    public int field2085;

    @OriginalMember(owner = "client!wk", name = "F", descriptor = "I")
    public int field2088;

    @OriginalMember(owner = "client!wk", name = "J", descriptor = "I")
    public int field2092;

    @OriginalMember(owner = "client!wk", name = "K", descriptor = "I")
    public int field2093;

    @OriginalMember(owner = "client!wk", name = "M", descriptor = "I")
    public int field2095;

    @OriginalMember(owner = "client!wk", name = "O", descriptor = "I")
    public int field2097;

    @OriginalMember(owner = "client!wk", name = "P", descriptor = "I")
    private int field2098;

    @OriginalMember(owner = "client!wk", name = "Q", descriptor = "I")
    public int field2099;

    @OriginalMember(owner = "client!wk", name = "R", descriptor = "I")
    public int field2100;

    @OriginalMember(owner = "client!wk", name = "T", descriptor = "I")
    public int field2102;

    @OriginalMember(owner = "client!wk", name = "U", descriptor = "I")
    private int field2103;

    @OriginalMember(owner = "client!wk", name = "X", descriptor = "I")
    public int field2106;

    @OriginalMember(owner = "client!wk", name = "bb", descriptor = "I")
    private int field2110;

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "Lbc;")
    private class335 field2075;

    @OriginalMember(owner = "client!wk", name = "Y", descriptor = "Lf;")
    private class702 field2107;

    @OriginalMember(owner = "client!wk", name = "fb", descriptor = "Lf;")
    private class702 field2114;

    @OriginalMember(owner = "client!wk", name = "v", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2078;

    @OriginalMember(owner = "client!wk", name = "I", descriptor = "[I")
    public int[] field2091;

    @OriginalMember(owner = "client!wk", name = "ab", descriptor = "[I")
    public int[] field2109;

    @OriginalMember(owner = "client!wk", name = "E", descriptor = "[Lmf;")
    private class384[] field2087;

    @OriginalMember(owner = "client!wk", name = "XA", descriptor = "(IIIII)V", line = 3)
    public final void method279(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field2079 && arg1 < this.field2104) {
            if (arg0 < this.field2112) {
                arg2 -= this.field2112 - arg0;
                arg0 = this.field2112;
            }
            if (arg0 + arg2 > this.field2108) {
                arg2 = this.field2108 - arg0;
            }
            int var6 = this.field2092 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field2091[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field2091[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field2091[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field2091[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field2091[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)V", line = 75)
    public final void method300(boolean arg0) {
        this.field2111 = arg0;
        this.field2089.method569(0);
    }

    @OriginalMember(owner = "client!wk", name = "B", descriptor = "()Z", line = 80)
    public final boolean method355() {
        return true;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(IIIIII)V", line = 83)
    public final void method345(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method279(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method279(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method356(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method356(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field2112) {
                    var10 += (this.field2112 - arg0) * var12;
                    arg0 = this.field2112;
                }
                if (var13 >= this.field2108) {
                    var13 = this.field2108 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field2079 && var17 < this.field2104) {
                                int var18 = this.field2092 * var17 + arg0;
                                int var19 = this.field2091[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field2091[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field2079 && var21 < this.field2104) {
                                int var22 = this.field2092 * var21 + arg0;
                                int var23 = this.field2091[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field2091[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field2079 && var27 < this.field2104) {
                            this.field2091[this.field2092 * var27 + arg0] = arg4;
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
                if (arg1 < this.field2079) {
                    var29 += (this.field2079 - arg1) * var31;
                    arg1 = this.field2079;
                }
                if (var32 >= this.field2104) {
                    var32 = this.field2104 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field2112 && var46 < this.field2108) {
                            this.field2091[this.field2092 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field2112 && var36 < this.field2108) {
                            int var37 = this.field2092 * arg1 + var36;
                            int var38 = this.field2091[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field2091[this.field2092 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field2112 && var40 < this.field2108) {
                            int var41 = this.field2092 * arg1 + var40;
                            int var42 = this.field2091[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field2091[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!wk", name = "pa", descriptor = "(III)V", line = 298)
    public final void method313(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2087.length; ++var4) {
            class384 var5 = this.field2087[var4];
            var5.field5933 = arg0 & 16777215;
            int var6 = var5.field5933 >>> 16 & 255;
            if (var6 < 2) {
                var6 = 2;
            }
            int var7 = var5.field5933 >> 8 & 255;
            if (var7 < 2) {
                var7 = 2;
            }
            int var8 = var5.field5933 & 255;
            if (var8 < 2) {
                var8 = 2;
            }
            var5.field5933 = var6 << 16 | var7 << 8 | var8;
            if (arg1 < 0) {
                var5.field5939 = false;
            } else {
                var5.field5939 = true;
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "u", descriptor = "()Z", line = 330)
    public final boolean method288() {
        return false;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIII)V", line = 334)
    public final void method280(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class384 var8 = this.method1122(Thread.currentThread());
        class431 var9 = var8.field5969;
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
            int var23 = arg0 - var9.method2735();
            int var24 = arg1 - var9.method2733();
            int var25 = var19 + var23;
            int var26 = var23 - var20;
            int var27 = var17 + var23 - var20;
            int var28 = var17 + var23 + var19;
            int var29 = var21 + var24;
            int var30 = var24 - var22;
            int var31 = var18 + var24 - var22;
            int var32 = var18 + var24 + var21;
            if (arg6 == 0) {
                var9.field6568 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field6568 = 255 - (arg4 >>> 24);
            }
            this.method334(false);
            var9.field6556 = var25 < 0 || var25 > var9.field6566 || var26 < 0 || var26 > var9.field6566 || var27 < 0 || var27 > var9.field6566;
            var9.method2722(var29, var30, var31, var25, var26, var27, 100, 100, 100, arg4);
            var9.field6556 = var25 < 0 || var25 > var9.field6566 || var27 < 0 || var27 > var9.field6566 || var28 < 0 || var28 > var9.field6566;
            var9.method2722(var29, var31, var32, var25, var27, var28, 100, 100, 100, arg4);
            this.method334(true);
        }
    }

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "(I)V", line = 407)
    public final void method341(int arg0) {
        this.field2087[arg0].method2505(-120, (Runnable) null);
    }

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "()V", line = 410)
    public final void method308() {
        this.field2089.method569(0);
        this.field2101.method569(0);
    }

    @OriginalMember(owner = "client!wk", name = "da", descriptor = "(IIII)V", line = 414)
    public final void method352(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field2092) {
            arg2 = this.field2092;
        }
        if (arg3 > this.field2110) {
            arg3 = this.field2110;
        }
        this.field2112 = arg0;
        this.field2108 = arg2;
        this.field2079 = arg1;
        this.field2104 = arg3;
        this.method1119();
    }

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "()Lfe;", line = 433)
    public final class530 method160() {
        return new class530(0, "Pure Java", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "()Z", line = 436)
    public final boolean method134() {
        return false;
    }

    @OriginalMember(owner = "client!wk", name = "JA", descriptor = "()V", line = 439)
    public final void method281() {
        this.field2112 = 0;
        this.field2079 = 0;
        this.field2108 = this.field2092;
        this.field2104 = this.field2110;
        this.method1119();
    }

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "()V", line = 445)
    public final void method182() {
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lufa;[Lwt;Z)Lla;", line = 450)
    public final class418 method347(class632 arg0, class284[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field4535;
            var5[var7] = arg1[var7].field4537;
            if (arg1[var7].field4539 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                return new class363(this, arg0, arg1, var4, var5);
            } else {
                return new class269(this, arg0, arg1, var4, var5);
            }
        } else if (var6) {
            throw new IllegalArgumentException("");
        } else {
            return new class421(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "()Lq;", line = 488)
    public final class393 method339() {
        class384 var1 = this.method1122(Thread.currentThread());
        return var1.field5934;
    }

    @OriginalMember(owner = "client!wk", name = "O", descriptor = "(IIIIII)Z", line = 493)
    public final boolean method321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg2 * this.field2082.field3877 + (float) arg0 * this.field2082.field3873 + (float) arg1 * this.field2082.field3882 + this.field2082.field3880;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field2082.field3877 + (float) arg3 * this.field2082.field3873 + (float) arg4 * this.field2082.field3882 + this.field2082.field3880;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field2084) || !(var8 < (float) this.field2084)) && (!(var7 > (float) this.field2096) || !(var8 > (float) this.field2096))) {
            int var9 = (int) (((float) arg2 * this.field2082.field3861 + (float) arg0 * this.field2082.field3881 + (float) arg1 * this.field2082.field3876 + this.field2082.field3852) * (float) this.field2086 / var7);
            int var10 = (int) (((float) arg5 * this.field2082.field3861 + (float) arg3 * this.field2082.field3881 + (float) arg4 * this.field2082.field3876 + this.field2082.field3852) * (float) this.field2086 / var8);
            if (var9 < this.field2088 && var10 < this.field2088 || var9 > this.field2102 && var10 > this.field2102) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field2082.field3869 + (float) arg0 * this.field2082.field3856 + (float) arg1 * this.field2082.field3862 + this.field2082.field3851) * (float) this.field2083 / var7);
                int var12 = (int) (((float) arg5 * this.field2082.field3869 + (float) arg3 * this.field2082.field3856 + (float) arg4 * this.field2082.field3862 + this.field2082.field3851) * (float) this.field2083 / var8);
                return (var11 >= this.field2106 || var12 >= this.field2106) && (var11 <= this.field2099 || var12 <= this.field2099);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "(I)V", line = 524)
    public final void method293(int arg0) {
        this.field2087[arg0].method2505(-105, Thread.currentThread());
    }

    @OriginalMember(owner = "client!wk", name = "y", descriptor = "()V", line = 527)
    public final void method122() throws class529 {
        if (this.field2078 != null && this.field2075 != null) {
            try {
                Graphics var1 = this.field2078.getGraphics();
                this.field2075.method1191(var1, (byte) -97, 0, 0);
            } catch (Exception var2) {
                this.field2078.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "([IIIII)Lf;", line = 545)
    public final class702 method306(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class630(this, arg0, arg1, arg2, arg3, arg4) : new class308(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class630(this, arg0, arg1, arg2, arg3, arg4) : new class308(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!wk", name = "x", descriptor = "()V", line = 580)
    public final void method132() {
        if (this.field2074) {
            class655.method3770(false, true, 0);
            this.field2074 = false;
        }
        this.field2075 = null;
        this.field2078 = null;
        this.field2076 = null;
        this.field2077 = true;
    }

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "()Z", line = 593)
    public final boolean method305() {
        return false;
    }

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 596)
    public final void method298(Canvas arg0) {
        if (arg0 != null) {
            class335 var2 = (class335) this.field2076.method1558((long) arg0.hashCode(), (byte) -93);
            if (var2 != null) {
                this.field2078 = arg0;
                this.field2075 = var2;
                if (this.field2107 == null) {
                    this.field2091 = var2.field5477;
                    this.field2092 = var2.field5476;
                    this.field2110 = var2.field5480;
                    if (this.field2098 != this.field2092 || this.field2110 != this.field2103) {
                        this.field2098 = this.field2092;
                        this.field2103 = this.field2110;
                        this.field2109 = new int[this.field2103 * this.field2098];
                    }
                    this.method1115();
                    return;
                }
            }
        } else {
            this.field2078 = null;
            this.field2075 = null;
            if (this.field2107 == null) {
                this.field2091 = null;
                this.field2092 = this.field2110 = 1;
                this.field2098 = this.field2103 = 1;
                this.method1115();
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "v", descriptor = "()[I", line = 638)
    public final int[] method353() {
        return new int[] { this.field2093, this.field2100, this.field2086, this.field2083 };
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)V", line = 641)
    public final void method336(int arg0) {
        this.field2085 = arg0;
        this.field2087 = new class384[this.field2085];
        for (int var2 = 0; var2 < this.field2085; ++var2) {
            this.field2087[var2] = new class384(this);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ltt;)V", line = 655)
    public final void method354(class79 arg0) {
        class384 var2 = this.method1122(Thread.currentThread());
        class253 var3 = arg0.field999.field4346;
        for (class253 var4 = var3.field4042; var3 != var4; var4 = var4.field4042) {
            class440 var5 = (class440) var4;
            int var6 = var5.field6711 >> 12;
            int var7 = var5.field6705 >> 12;
            int var8 = var5.field6710 >> 12;
            float var9 = (float) var8 * this.field2082.field3877 + (float) var6 * this.field2082.field3873 + (float) var7 * this.field2082.field3882 + this.field2082.field3880;
            if (!(var9 < (float) this.field2084) && !(var9 > (float) var2.field5946)) {
                int var10 = (int) (((float) var8 * this.field2082.field3861 + (float) var6 * this.field2082.field3881 + (float) var7 * this.field2082.field3876 + this.field2082.field3852) * (float) this.field2086 / var9) + this.field2093;
                int var11 = (int) (((float) var8 * this.field2082.field3869 + (float) var6 * this.field2082.field3856 + (float) var7 * this.field2082.field3862 + this.field2082.field3851) * (float) this.field2083 / var9) + this.field2100;
                if (var10 >= this.field2112 && var10 <= this.field2108 && var11 >= this.field2079 && var11 <= this.field2104) {
                    if (var9 == 0.0F) {
                        var9 = 1.0F;
                    }
                    this.method1114(var5, var10, var11, (int) var9, (int) ((float) (this.field2086 * var5.field6709 >> 12) / var9));
                }
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "()Lq;", line = 693)
    public final class393 method272() {
        return new class243();
    }

    @OriginalMember(owner = "client!wk", name = "ra", descriptor = "(F)V", line = 696)
    public final void method342(float arg0) {
        this.field2090 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIZ)Lf;", line = 702)
    public final class702 method282(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field2092 * arg1 + arg0;
        int var8 = this.field2092 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field2091[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class630(this, var6, arg2, arg3);
        } else {
            return new class308(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "()Z", line = 735)
    public final boolean method307() {
        return false;
    }

    @OriginalMember(owner = "client!wk", name = "D", descriptor = "()Z", line = 739)
    public final boolean method1111() {
        return this.field2077;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lwt;Z)Lf;", line = 743)
    public final class702 method265(class284 arg0, boolean arg1) {
        int[] var3 = arg0.field4538;
        byte[] var4 = arg0.field4532;
        int var5 = arg0.field4535;
        int var6 = arg0.field4537;
        class242 var11;
        if (arg1 && arg0.field4539 == null) {
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
            var11 = new class670(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field4539;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class630(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var20 = var5 * var19;
                    for (int var21 = 0; var21 < var5; ++var21) {
                        int var22 = var3[var4[var20 + var21] & 255];
                        var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
                    }
                }
                var11 = new class308(this, var14, var5, var6);
            }
        }
        var11.method1085(arg0.field4533, arg0.field4540, arg0.field4534, arg0.field4536);
        return var11;
    }

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "(IIIIII)V", line = 846)
    private final void method1112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 0) {
            arg3 = -arg3;
        }
        int var7 = arg2 << 8;
        int var8 = arg1 - arg3;
        if (var8 < this.field2079) {
            var8 = this.field2079;
        }
        int var9 = arg1 + arg3 + 1;
        if (var9 > this.field2104) {
            var9 = this.field2104;
        }
        int var10 = var8;
        int var11 = arg3 * arg3;
        int var12 = 0;
        int var13 = arg1 - var8;
        int var14 = var13 * var13;
        int var15 = var14 - var13;
        if (arg1 > var9) {
            arg1 = var9;
        }
        int var16 = arg4 >>> 24;
        if (arg5 == 0 || arg5 == 1 && var16 == 255) {
            while (var10 < arg1) {
                while (var15 <= var11 || var14 <= var11) {
                    var14 += var12 + var12;
                    var15 += var12++ + var12;
                }
                int var66 = arg0 - var12 + 1;
                if (var66 < this.field2112) {
                    var66 = this.field2112;
                }
                int var67 = arg0 + var12;
                if (var67 > this.field2108) {
                    var67 = this.field2108;
                }
                int var68 = this.field2092 * var10 + var66;
                for (int var69 = var66; var69 < var67; ++var69) {
                    if (var7 < this.field2109[var68]) {
                        this.field2091[var68] = arg4;
                    }
                    ++var68;
                }
                ++var10;
                var14 -= var13-- + var13;
                var15 -= var13 + var13;
            }
            int var57 = arg3;
            int var58 = var10 - arg1;
            int var59 = var58 * var58 + var11;
            int var60 = var59 - arg3;
            int var61 = var59 - var58;
            while (var10 < var9) {
                while (var61 > var11 && var60 > var11) {
                    var61 -= var57-- + var57;
                    var60 -= var57 + var57;
                }
                int var62 = arg0 - var57;
                if (var62 < this.field2112) {
                    var62 = this.field2112;
                }
                int var63 = arg0 + var57;
                if (var63 > this.field2108 - 1) {
                    var63 = this.field2108 - 1;
                }
                int var64 = this.field2092 * var10 + var62;
                for (int var65 = var62; var65 <= var63; ++var65) {
                    if (var7 < this.field2109[var64]) {
                        this.field2091[var64] = arg4;
                    }
                    ++var64;
                }
                ++var10;
                var61 += var58 + var58;
                var60 += var58++ + var58;
            }
        } else if (arg5 == 1) {
            int var17 = (var16 << 24) + ((arg4 & 16711935) * var16 >> 8 & 16711935) + ((arg4 & 65280) * var16 >> 8 & 65280);
            int var18 = 256 - var16;
            while (var10 < arg1) {
                while (var15 <= var11 || var14 <= var11) {
                    var14 += var12 + var12;
                    var15 += var12++ + var12;
                }
                int var30 = arg0 - var12 + 1;
                if (var30 < this.field2112) {
                    var30 = this.field2112;
                }
                int var31 = arg0 + var12;
                if (var31 > this.field2108) {
                    var31 = this.field2108;
                }
                int var32 = this.field2092 * var10 + var30;
                for (int var33 = var30; var33 < var31; ++var33) {
                    if (var7 < this.field2109[var32]) {
                        int var34 = this.field2091[var32];
                        int var35 = ((var34 & 16711935) * var18 >> 8 & 16711935) + ((var34 & 65280) * var18 >> 8 & 65280);
                        this.field2091[var32] = var17 + var35;
                    }
                    ++var32;
                }
                ++var10;
                var14 -= var13-- + var13;
                var15 -= var13 + var13;
            }
            int var19 = arg3;
            int var20 = -var13;
            int var21 = var20 * var20 + var11;
            int var22 = var21 - arg3;
            int var23 = var21 - var20;
            while (var10 < var9) {
                while (var23 > var11 && var22 > var11) {
                    var23 -= var19-- + var19;
                    var22 -= var19 + var19;
                }
                int var24 = arg0 - var19;
                if (var24 < this.field2112) {
                    var24 = this.field2112;
                }
                int var25 = arg0 + var19;
                if (var25 > this.field2108 - 1) {
                    var25 = this.field2108 - 1;
                }
                int var26 = this.field2092 * var10 + var24;
                for (int var27 = var24; var27 <= var25; ++var27) {
                    if (var7 < this.field2109[var26]) {
                        int var28 = this.field2091[var26];
                        int var29 = ((var28 & 16711935) * var18 >> 8 & 16711935) + ((var28 & 65280) * var18 >> 8 & 65280);
                        this.field2091[var26] = var17 + var29;
                    }
                    ++var26;
                }
                ++var10;
                var23 += var20 + var20;
                var22 += var20++ + var20;
            }
        } else if (arg5 != 2) {
            throw new IllegalArgumentException();
        } else {
            while (var10 < arg1) {
                while (var15 <= var11 || var14 <= var11) {
                    var14 += var12 + var12;
                    var15 += var12++ + var12;
                }
                int var49 = arg0 - var12 + 1;
                if (var49 < this.field2112) {
                    var49 = this.field2112;
                }
                int var50 = arg0 + var12;
                if (var50 > this.field2108) {
                    var50 = this.field2108;
                }
                int var51 = this.field2092 * var10 + var49;
                for (int var52 = var49; var52 < var50; ++var52) {
                    if (var7 < this.field2109[var51]) {
                        int var53 = this.field2091[var51];
                        int var54 = arg4 + var53;
                        int var55 = (arg4 & 16711935) + (var53 & 16711935);
                        int var56 = (var54 - var55 & 65536) + (var55 & 16777472);
                        this.field2091[var51] = var54 - var56 | var56 - (var56 >>> 8);
                    }
                    ++var51;
                }
                ++var10;
                var14 -= var13-- + var13;
                var15 -= var13 + var13;
            }
            int var36 = arg3;
            int var37 = -var13;
            int var38 = var37 * var37 + var11;
            int var39 = var38 - arg3;
            int var40 = var38 - var37;
            while (var10 < var9) {
                while (var40 > var11 && var39 > var11) {
                    var40 -= var36-- + var36;
                    var39 -= var36 + var36;
                }
                int var41 = arg0 - var36;
                if (var41 < this.field2112) {
                    var41 = this.field2112;
                }
                int var42 = arg0 + var36;
                if (var42 > this.field2108 - 1) {
                    var42 = this.field2108 - 1;
                }
                int var43 = this.field2092 * var10 + var41;
                for (int var44 = var41; var44 <= var42; ++var44) {
                    if (var7 < this.field2109[var43]) {
                        int var45 = this.field2091[var43];
                        int var46 = arg4 + var45;
                        int var47 = (arg4 & 16711935) + (var45 & 16711935);
                        int var48 = (var46 - var47 & 65536) + (var47 & 16777472);
                        this.field2091[var43] = var46 - var48 | var48 - (var48 >>> 8);
                    }
                    ++var43;
                }
                ++var10;
                var40 += var37 + var37;
                var39 += var37++ + var37;
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lfa;)V", line = 1163)
    private class128(class214 arg0) {
        super(arg0);
        this.field2074 = false;
        this.field2077 = false;
        this.field2076 = new class200(4);
        this.field2081 = 78642;
        this.field2086 = 512;
        this.field2090 = 75518;
        this.field2079 = 0;
        this.field2083 = 512;
        this.field2096 = 3500;
        this.field2104 = 0;
        this.field2111 = false;
        this.field2084 = 50;
        this.field2094 = 45823;
        this.field2108 = 0;
        this.field2112 = 0;
        this.field2113 = 0;
        this.field2105 = 0;
        this.field2101 = new class49(16);
        this.field2115 = -1;
        this.field2089 = new class49(256);
        this.field2082 = new class243();
        this.method336(1);
        this.method293(0);
        class597.method3480(false, true, (byte) 48);
        this.field2074 = true;
        this.field2073 = (int) class112.method1033(-11752);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lf;Z)V", line = 1173)
    public final void method158(class702 arg0, boolean arg1) {
        if (arg0 instanceof class308) {
            class308 var3 = (class308) arg0;
            this.field2092 = var3.field3848;
            this.field2110 = var3.field3831;
            this.field2091 = var3.field4838;
            this.field2107 = arg0;
        } else {
            if (!(arg0 instanceof class630)) {
                throw new RuntimeException();
            }
            class630 var4 = (class630) arg0;
            this.field2092 = var4.field3848;
            this.field2110 = var4.field3831;
            this.field2091 = var4.field8878;
            this.field2107 = arg0;
        }
        this.method1115();
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIILua;II)V", line = 1200)
    public final void method316(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class617 arg6, int arg7, int arg8) {
        class123 var10 = (class123) arg6;
        int[] var11 = var10.field2044;
        int[] var12 = var10.field2042;
        int var13 = this.field2079 > arg8 ? this.field2079 : arg8;
        int var14 = this.field2104 < var11.length + arg8 ? this.field2104 : var11.length + arg8;
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
            if (arg0 < this.field2112) {
                var18 += (this.field2112 - arg0) * var20;
                arg0 = this.field2112;
            }
            if (var21 >= this.field2108) {
                var21 = this.field2108 - 1;
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
                                int var28 = this.field2092 * var25 + arg0;
                                int var29 = this.field2091[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field2091[var28] = var23 + var30;
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
                                int var34 = this.field2092 * var31 + arg0;
                                int var35 = this.field2091[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field2091[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field2091[this.field2092 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field2112 && var64 < this.field2108 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field2091[this.field2092 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field2112 && var50 < this.field2108 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field2092 * arg1 + var50;
                        int var54 = this.field2091[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field2091[this.field2092 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field2112 && var56 < this.field2108 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field2092 * arg1 + var56;
                        int var60 = this.field2091[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field2091[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "(I)Z", line = 1438)
    public final boolean method1113(int arg0) {
        return this.field2111 || super.field2812.method1610(18904, arg0).field4137;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIZ)Lf;", line = 1444)
    public final class702 method350(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class630(this, arg0, arg1) : new class308(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "()Z", line = 1450)
    public final boolean method289() {
        return false;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)Le;", line = 1453)
    public final class493 method290(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!wk", name = "IA", descriptor = "(IIIIII[BII)V", line = 1456)
    public final void method283(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field2092 * arg1 + arg0;
            int var15 = this.field2092 - arg2;
            if (arg1 + arg3 > this.field2104) {
                arg3 -= arg1 + arg3 - this.field2104;
            }
            if (arg1 < this.field2079) {
                int var16 = this.field2079 - arg1;
                arg3 -= var16;
                var14 += this.field2092 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field2108) {
                int var17 = arg0 + arg2 - this.field2108;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field2112) {
                int var18 = this.field2112 - arg0;
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
                            int var28 = this.field2091[var14];
                            this.field2091[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field2091[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field2091[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field2091[var14++] = arg5;
                        } else {
                            this.field2091[var14++] = arg4;
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

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIIIIII)V", line = 1633)
    public final void method299(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class384 var11 = this.method1122(Thread.currentThread());
        class431 var12 = var11.field5969;
        var12.field6558 = false;
        int var13 = arg0 - this.field2088;
        int var14 = arg2 - this.field2088;
        int var15 = arg4 - this.field2088;
        int var16 = arg1 - this.field2106;
        int var17 = arg3 - this.field2106;
        int var18 = arg5 - this.field2106;
        var12.field6556 = var13 < 0 || var13 > var12.field6566 || var14 < 0 || var14 > var12.field6566 || var15 < 0 || var15 > var12.field6566;
        var12.field6564 = true;
        int var19 = arg6 >>> 24;
        if (arg9 != 0 && (arg9 != 1 || var19 != 255)) {
            if (arg9 == 1) {
                var12.field6568 = 255 - var19;
                var12.field6551 = false;
                var12.method2741(var16, var17, var18, var13, var14, var15, 0, 0, 0, arg6, arg7, arg8);
            } else {
                if (arg9 != 2) {
                    throw new IllegalArgumentException();
                }
                var12.field6568 = 128;
                var12.field6551 = true;
                var12.method2741(var16, var17, var18, var13, var14, var15, 0, 0, 0, arg6, arg7, arg8);
            }
        } else {
            var12.field6568 = 0;
            var12.field6551 = false;
            var12.method2741(var16, var17, var18, var13, var14, var15, 0, 0, 0, arg6, arg7, arg8);
        }
        var12.field6558 = true;
        var12.field6564 = false;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lgk;IIII)V", line = 1677)
    private final void method1114(class440 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg0.field6701;
        int var8 = arg4 << 1;
        if (var6 == -1) {
            this.method1112(arg1, arg2, arg3, arg4, arg0.field6708, 1);
        } else {
            if (this.field2115 != var6) {
                class702 var9 = (class702) this.field2101.method560(false, (long) var6);
                if (var9 == null) {
                    int[] var10 = this.method1116(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = this.method1113(var6) ? 64 : 128;
                    var9 = this.method306(var10, 0, var11, var11, var11);
                    this.field2101.method559(var9, (long) var6, 0);
                }
                this.field2115 = var6;
                this.field2114 = var9;
            }
            ++var8;
            ((class242) this.field2114).method1735(arg1 - arg4, arg2 - arg4, arg3, var8, var8, 0, arg0.field6708, 1, 1);
        }
    }

    @OriginalMember(owner = "client!wk", name = "z", descriptor = "()Z", line = 1717)
    public final boolean method168() {
        return false;
    }

    @OriginalMember(owner = "client!wk", name = "C", descriptor = "()Z", line = 1721)
    public final boolean method326() {
        return true;
    }

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "()Z", line = 1724)
    public final boolean method324() {
        return false;
    }

    @OriginalMember(owner = "client!wk", name = "t", descriptor = "()Z", line = 1728)
    public final boolean method262() {
        return false;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Luo;IIII)Lda;", line = 1731)
    public final class55 method287(class534 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class179(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIF)Lcp;", line = 1734)
    public final class674 method325(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(IIIIII)Ldd;", line = 1737)
    public final class654 method348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!wk", name = "CA", descriptor = "(IIII)V", line = 1742)
    public final void method332(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field2087.length; ++var5) {
            this.field2087[var5].field5941 = this.field2087[var5].field5933;
            this.field2087[var5].field5930 = arg0;
            this.field2087[var5].field5933 = arg1;
            this.field2087[var5].field5940 = arg2;
            this.field2087[var5].field5935 = true;
        }
    }

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "()V", line = 1754)
    public final void method170() {
    }

    @OriginalMember(owner = "client!wk", name = "ZA", descriptor = "(Z)V", line = 1759)
    public final void method334(boolean arg0) {
        class384 var2 = this.method1122(Thread.currentThread());
        var2.field5936 = arg0;
    }

    @OriginalMember(owner = "client!wk", name = "U", descriptor = "()I", line = 1764)
    public final int method315() {
        return this.field2096;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(Z)V", line = 1766)
    public final void method114(boolean arg0) {
    }

    @OriginalMember(owner = "client!wk", name = "J", descriptor = "(IIIIII)V", line = 1769)
    public final void method335(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field2112) {
            arg2 -= this.field2112 - arg0;
            arg0 = this.field2112;
        }
        if (arg1 < this.field2079) {
            arg3 -= this.field2079 - arg1;
            arg1 = this.field2079;
        }
        if (arg0 + arg2 > this.field2108) {
            arg2 = this.field2108 - arg0;
        }
        if (arg1 + arg3 > this.field2104) {
            arg3 = this.field2104 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field2108 && arg1 <= this.field2104) {
            int var7 = this.field2092 - arg2;
            int var8 = this.field2092 * arg1 + arg0;
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
                            this.field2091[var24] = arg4;
                            ++var24;
                            this.field2091[var24] = arg4;
                            ++var24;
                            this.field2091[var24] = arg4;
                            ++var24;
                            this.field2091[var24] = arg4;
                            ++var24;
                            this.field2091[var24] = arg4;
                            ++var24;
                            this.field2091[var24] = arg4;
                            ++var24;
                            this.field2091[var24] = arg4;
                            ++var24;
                            this.field2091[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field2091[var24] = arg4;
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
                        int var14 = this.field2091[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                        this.field2091[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field2091[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field2091[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "DA", descriptor = "()I", line = 1905)
    public final int method131() {
        int var1 = this.field2105;
        this.field2105 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!wk", name = "va", descriptor = "(I)V", line = 1909)
    public final void method328(int arg0) {
    }

    @OriginalMember(owner = "client!wk", name = "L", descriptor = "()V", line = 1914)
    public final void method314() {
        for (int var1 = 0; var1 < this.field2087.length; ++var1) {
            this.field2087[var1].field5933 = this.field2087[var1].field5941;
            this.field2087[var1].field5935 = false;
        }
    }

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "()I", line = 1924)
    public final int method267() {
        return 0;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I[Lcp;)V", line = 1927)
    public final void method327(int arg0, class674[] arg1) {
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Le;)V", line = 1929)
    public final void method277(class493 arg0) {
    }

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "()Z", line = 1932)
    public final boolean method261() {
        return false;
    }

    @OriginalMember(owner = "client!wk", name = "la", descriptor = "(IIII)V", line = 1935)
    public final void method318(int arg0, int arg1, int arg2, int arg3) {
        this.field2093 = arg0;
        this.field2100 = arg1;
        this.field2086 = arg2;
        this.field2083 = arg3;
        this.method1119();
    }

    @OriginalMember(owner = "client!wk", name = "ya", descriptor = "()V", line = 1942)
    public final void method136() {
        if (this.field2112 == 0 && this.field2108 == this.field2092 && this.field2079 == 0 && this.field2110 == this.field2104) {
            int var1 = this.field2109.length;
            int var2 = var1 - (var1 & 7);
            int var3 = 0;
            while (var3 < var2) {
                this.field2109[var3++] = Integer.MAX_VALUE;
                this.field2109[var3++] = Integer.MAX_VALUE;
                this.field2109[var3++] = Integer.MAX_VALUE;
                this.field2109[var3++] = Integer.MAX_VALUE;
                this.field2109[var3++] = Integer.MAX_VALUE;
                this.field2109[var3++] = Integer.MAX_VALUE;
                this.field2109[var3++] = Integer.MAX_VALUE;
                this.field2109[var3++] = Integer.MAX_VALUE;
            }
            while (var3 < var1) {
                this.field2109[var3++] = Integer.MAX_VALUE;
            }
        } else {
            int var4 = this.field2108 - this.field2112;
            int var5 = this.field2104 - this.field2079;
            int var6 = this.field2092 - var4;
            int var7 = this.field2092 * this.field2079 + this.field2112;
            int var8 = var4 >> 3;
            int var9 = var4 & 7;
            int var10 = var7 - 1;
            for (int var11 = -var5; var11 < 0; ++var11) {
                if (var8 > 0) {
                    int var12 = var8;
                    do {
                        ++var10;
                        this.field2109[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field2109[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field2109[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field2109[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field2109[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field2109[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field2109[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field2109[var10] = Integer.MAX_VALUE;
                        --var12;
                    } while (var12 > 0);
                }
                if (var9 > 0) {
                    int var13 = var9;
                    do {
                        ++var10;
                        this.field2109[var10] = Integer.MAX_VALUE;
                        --var13;
                    } while (var13 > 0);
                }
                var10 += var6;
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "MA", descriptor = "(III[I)V", line = 2023)
    public final void method330(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field2082.field3877 + (float) arg0 * this.field2082.field3873 + (float) arg1 * this.field2082.field3882 + this.field2082.field3880;
        if (!(var5 < (float) this.field2084) && !(var5 > (float) this.field2096)) {
            int var6 = (int) (((float) arg2 * this.field2082.field3861 + (float) arg0 * this.field2082.field3881 + (float) arg1 * this.field2082.field3876 + this.field2082.field3852) * (float) this.field2086 / var5);
            int var7 = (int) (((float) arg2 * this.field2082.field3869 + (float) arg0 * this.field2082.field3856 + (float) arg1 * this.field2082.field3862 + this.field2082.field3851) * (float) this.field2083 / var5);
            arg3[0] = var6 - this.field2088;
            arg3[1] = var7 - this.field2106;
            arg3[2] = (int) var5;
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)I", line = 2039)
    public final int method286(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lq;)V", line = 2042)
    public final void method346(class393 arg0) {
        this.field2082 = (class243) arg0;
    }

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "()V", line = 2044)
    public final void method135() {
    }

    @OriginalMember(owner = "client!wk", name = "E", descriptor = "()V", line = 2050)
    private final void method1115() {
        for (int var1 = 0; var1 < this.field2085; ++var1) {
            this.field2087[var1].method2504(false);
        }
        this.method281();
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ltt;I)V", line = 2059)
    public final void method320(class79 arg0, int arg1) {
        class384 var3 = this.method1122(Thread.currentThread());
        class253 var4 = arg0.field999.field4346;
        for (class253 var5 = var4.field4042; var4 != var5; var5 = var5.field4042) {
            class440 var6 = (class440) var5;
            int var7 = var6.field6711 >> 12;
            int var8 = var6.field6705 >> 12;
            int var9 = var6.field6710 >> 12;
            float var10 = (float) var9 * this.field2082.field3877 + (float) var7 * this.field2082.field3873 + (float) var8 * this.field2082.field3882 + this.field2082.field3880;
            if (!(var10 < (float) this.field2084) && !(var10 > (float) var3.field5946)) {
                int var11 = (int) (((float) var9 * this.field2082.field3861 + (float) var7 * this.field2082.field3881 + (float) var8 * this.field2082.field3876 + this.field2082.field3852) * (float) this.field2086 / (float) arg1) + this.field2093;
                int var12 = (int) (((float) var9 * this.field2082.field3869 + (float) var7 * this.field2082.field3856 + (float) var8 * this.field2082.field3862 + this.field2082.field3851) * (float) this.field2083 / (float) arg1) + this.field2100;
                if (var11 >= this.field2112 && var11 <= this.field2108 && var12 >= this.field2079 && var12 <= this.field2104) {
                    if (var10 == 0.0F) {
                        var10 = 1.0F;
                    }
                    this.method1114(var6, var11, var12, (int) var10, (this.field2086 * var6.field6709 >> 12) / arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "ja", descriptor = "(I)V", line = 2097)
    public final void method121(int arg0) {
        this.method335(0, 0, this.field2092, this.field2110, arg0, 0);
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "()I", line = 2100)
    public final int method338() {
        return 0;
    }

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "(I)[I", line = 2104)
    private final int[] method1116(int arg0) {
        class49 var2 = this.field2089;
        class593 var3;
        synchronized (this.field2089) {
            var3 = (class593) this.field2089.method560(false, (long) arg0);
            if (var3 == null) {
                if (!super.field2812.method1608(-20340, arg0)) {
                    return null;
                }
                class258 var5 = super.field2812.method1610(18904, arg0);
                int var6 = !var5.field4137 && !this.field2111 ? 128 : 64;
                var3 = new class593(arg0, var6, super.field2812.method1609(0.7F, true, arg0, (byte) -59, var6, var6), var5.field4121);
                this.field2089.method559(var3, (long) arg0, 0);
            }
        }
        var3.field8418 = true;
        return var3.method3462();
    }

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "(I)[I", line = 2125)
    public final int[] method1117(int arg0) {
        class49 var2 = this.field2089;
        class593 var3;
        synchronized (this.field2089) {
            var3 = (class593) this.field2089.method560(false, (long) arg0);
            if (var3 == null) {
                if (!super.field2812.method1608(-20340, arg0)) {
                    return null;
                }
                class258 var5 = super.field2812.method1610(18904, arg0);
                int var6 = !var5.field4137 && !this.field2111 ? 128 : 64;
                var3 = new class593(arg0, var6, super.field2812.method1607(var6, arg0, -20490, true, var6, 0.7F), var5.field4121);
                this.field2089.method559(var3, (long) arg0, 0);
            }
        }
        var3.field8418 = true;
        return var3.method3462();
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ldd;)V", line = 2144)
    public final void method264(class654 arg0) {
    }

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "(IIII)[I", line = 2148)
    public final int[] method146(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field2092 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field2091[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "(I)Z", line = 2173)
    public final boolean method1118(int arg0) {
        return super.field2812.method1608(-20340, arg0);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ldd;Ldd;FLdd;)Ldd;", line = 2176)
    public final class654 method119(class654 arg0, class654 arg1, float arg2, class654 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 2180)
    public final void method297(Canvas arg0) {
        class335 var2 = (class335) this.field2076.method1558((long) arg0.hashCode(), (byte) -93);
        if (var2 == null) {
            class335 var3 = class47.method551(arg0, (byte) -30);
            this.field2076.method1564((long) arg0.hashCode(), var3, (byte) 88);
        }
    }

    @OriginalMember(owner = "client!wk", name = "VA", descriptor = "(IFFFFF)V", line = 2189)
    public final void method296(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field2094 = (int) (arg1 * 65535.0F);
        this.field2081 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field2080 = (int) (arg3 * 65535.0F / var7);
        this.field2097 = (int) (arg4 * 65535.0F / var7);
        this.field2095 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!wk", name = "F", descriptor = "()V", line = 2201)
    private final void method1119() {
        this.field2088 = this.field2112 - this.field2093;
        this.field2102 = this.field2108 - this.field2093;
        this.field2106 = this.field2079 - this.field2100;
        this.field2099 = this.field2104 - this.field2100;
        for (int var1 = 0; var1 < this.field2085; ++var1) {
            class431 var5 = this.field2087[var1].field5969;
            var5.field6557 = this.field2093 - this.field2112;
            var5.field6563 = this.field2100 - this.field2079;
            var5.field6566 = this.field2108 - this.field2112;
            var5.field6561 = this.field2104 - this.field2079;
        }
        int var2 = this.field2092 * this.field2079 + this.field2112;
        for (int var3 = this.field2079; var3 < this.field2104; ++var3) {
            for (int var4 = 0; var4 < this.field2085; ++var4) {
                this.field2087[var4].field5969.field6553[var3 - this.field2079] = var2;
            }
            var2 += this.field2092;
        }
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lfa;)V", line = 2242)
    public class128(Canvas arg0, class214 arg1) {
        this(arg1);
        this.method297(arg0);
        this.method298(arg0);
    }

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "(IIIII)V", line = 2247)
    public final void method329(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field2079) {
            var6 = this.field2079;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field2104) {
            var7 = this.field2104;
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
                if (var64 < this.field2112) {
                    var64 = this.field2112;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field2108) {
                    var65 = this.field2108;
                }
                int var66 = this.field2092 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field2091[var66++] = arg3;
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
                if (var60 < this.field2112) {
                    var60 = this.field2112;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field2108 - 1) {
                    var61 = this.field2108 - 1;
                }
                int var62 = this.field2092 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field2091[var62++] = arg3;
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
                if (var28 < this.field2112) {
                    var28 = this.field2112;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field2108) {
                    var29 = this.field2108;
                }
                int var30 = this.field2092 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field2091[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field2091[var30++] = var15 + var33;
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
                if (var22 < this.field2112) {
                    var22 = this.field2112;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field2108 - 1) {
                    var23 = this.field2108 - 1;
                }
                int var24 = this.field2092 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field2091[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field2091[var24++] = var15 + var27;
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
                if (var47 < this.field2112) {
                    var47 = this.field2112;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field2108) {
                    var48 = this.field2108;
                }
                int var49 = this.field2092 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field2091[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field2091[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field2112) {
                    var39 = this.field2112;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field2108 - 1) {
                    var40 = this.field2108 - 1;
                }
                int var41 = this.field2092 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field2091[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field2091[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 2533)
    public final void method103(Rectangle[] arg0, int arg1) throws class529 {
        if (this.field2078 != null && this.field2075 != null) {
            try {
                Graphics var3 = this.field2078.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field2092 && var5.y <= this.field2110 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field2075.method1197(var5.y, var5.x, var5.height, var3, var5.width, 0);
                    }
                }
            } catch (Exception var6) {
                this.field2078.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "([I)V", line = 2563)
    public final void method268(int[] arg0) {
        arg0[0] = this.field2092;
        arg0[1] = this.field2110;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "()Z", line = 2568)
    public final boolean method266() {
        return true;
    }

    @OriginalMember(owner = "client!wk", name = "BA", descriptor = "()I", line = 2571)
    public final int method322() {
        return this.field2084;
    }

    @OriginalMember(owner = "client!wk", name = "GA", descriptor = "(II)V", line = 2575)
    public final void method284(int arg0, int arg1) {
        class384 var3 = this.method1122(Thread.currentThread());
        this.field2084 = arg0;
        this.field2096 = arg1;
        var3.field5946 = this.field2096 - 255;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II[[I[[IIII)Li;", line = 2581)
    public final class37 method275(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class60(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II[I[I)Lua;", line = 2584)
    public final class617 method317(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class123(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "(I)I", line = 2588)
    public final int method1120(int arg0) {
        return super.field2812.method1610(18904, arg0).field4120 & 65535;
    }

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "()V", line = 2590)
    public final void method143() {
    }

    @OriginalMember(owner = "client!wk", name = "AA", descriptor = "(III[I)V", line = 2594)
    public final void method292(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field2082.field3877 + (float) arg0 * this.field2082.field3873 + (float) arg1 * this.field2082.field3882 + this.field2082.field3880;
        if (!(var5 < (float) this.field2084) && !(var5 > (float) this.field2096)) {
            int var6 = (int) (((float) arg2 * this.field2082.field3861 + (float) arg0 * this.field2082.field3881 + (float) arg1 * this.field2082.field3876 + this.field2082.field3852) * (float) this.field2086 / var5);
            int var7 = (int) (((float) arg2 * this.field2082.field3869 + (float) arg0 * this.field2082.field3856 + (float) arg1 * this.field2082.field3862 + this.field2082.field3851) * (float) this.field2083 / var5);
            if (var6 >= this.field2088 && var6 <= this.field2102 && var7 >= this.field2106 && var7 <= this.field2099) {
                arg3[0] = var6 - this.field2088;
                arg3[1] = var7 - this.field2106;
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!wk", name = "oa", descriptor = "([I)V", line = 2618)
    public final void method343(int[] arg0) {
        arg0[0] = this.field2112;
        arg0[1] = this.field2079;
        arg0[2] = this.field2108;
        arg0[3] = this.field2104;
    }

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "(I)Z", line = 2624)
    public final boolean method1121(int arg0) {
        return super.field2812.method1610(18904, arg0).field4118;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V", line = 2628)
    public final void method155(int arg0) {
        int var2 = arg0 - this.field2073;
        for (Object var3 = this.field2089.method565(-80); var3 != null; var3 = this.field2089.method571((byte) 95)) {
            class593 var4 = (class593) var3;
            if (var4.field8418) {
                var4.field8414 += var2;
                int var5 = var4.field8414 / 20;
                if (var5 > 0) {
                    class258 var6 = super.field2812.method1610(18904, var4.field8415);
                    var4.method3461(var6.field4123 * var2 * 50 / 1000, var6.field4116 * var2 * 50 / 1000);
                    var4.field8414 -= var5 * 20;
                }
                var4.field8418 = false;
            }
        }
        this.field2073 = arg0;
        this.field2101.method573((byte) 124, 5);
        this.field2089.method573((byte) 120, 5);
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 2660)
    public final void method304(Canvas arg0) {
        if (this.field2078 == arg0) {
            this.method298((Canvas) null);
        }
        class335 var2 = (class335) this.field2076.method1558((long) arg0.hashCode(), (byte) -93);
        if (var2 != null) {
            var2.method707((byte) -21);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ljava/lang/Runnable;)Lmf;", line = 2672)
    public final class384 method1122(Runnable arg0) {
        for (int var2 = 0; var2 < this.field2085; ++var2) {
            if (this.field2087[var2].field5932 == arg0) {
                return this.field2087[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIII)V", line = 2684)
    public final void method344(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method279(arg0, arg1, arg2, arg4, arg5);
        this.method279(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method356(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method356(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIII)V", line = 2689)
    public final void method110(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "(I)V", line = 2691)
    public final void method301(int arg0) {
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(IIIIIIIIII)V", line = 2694)
    public final void method1123(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 0 && arg4 != 0) {
            if (arg6 != 65535 && !super.field2812.method1610(18904, arg6).field4117) {
                if (this.field2115 != arg6) {
                    class702 var11 = (class702) this.field2101.method560(false, (long) arg6);
                    if (var11 == null) {
                        int[] var12 = this.method1116(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = this.method1113(arg6) ? 64 : 128;
                        var11 = this.method306(var12, 0, var13, var13, var13);
                        this.field2101.method559(var11, (long) arg6, 0);
                    }
                    this.field2115 = arg6;
                    this.field2114 = var11;
                }
                ((class242) this.field2114).method1735(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
            } else {
                this.method1112(arg0, arg1, arg2, arg3, arg7, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "A", descriptor = "()V", line = 2727)
    public final void method176() {
        if (this.field2078 != null) {
            this.field2091 = this.field2075.field5477;
            this.field2092 = this.field2075.field5476;
            this.field2110 = this.field2075.field5480;
        } else {
            this.field2092 = 1;
            this.field2110 = 1;
            this.field2091 = null;
        }
        this.field2107 = null;
        this.method1115();
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(II)I", line = 2746)
    public final int method323(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!wk", name = "FA", descriptor = "(ILua;II)V", line = 2751)
    public final void method310(int arg0, class617 arg1, int arg2, int arg3) {
        class123 var5 = (class123) arg1;
        int[] var6 = var5.field2044;
        int[] var7 = var5.field2042;
        int var8;
        if (this.field2104 < var6.length + arg3) {
            var8 = this.field2104 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field2079 > arg3) {
            var9 = this.field2079 - arg3;
            arg3 = this.field2079;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field2092 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field2112 > var12) {
                    var13 -= this.field2112 - var12;
                    var12 = this.field2112;
                }
                if (this.field2108 < var12 + var13) {
                    var13 = this.field2108 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field2091[var14++] = arg0;
                }
                var10 += this.field2092;
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "(IIIII)V", line = 2808)
    public final void method356(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field2112 && arg0 < this.field2108) {
            if (arg1 < this.field2079) {
                arg2 -= this.field2079 - arg1;
                arg1 = this.field2079;
            }
            if (arg1 + arg2 > this.field2104) {
                arg2 = this.field2104 - arg1;
            }
            int var6 = this.field2092 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field2092 * var10 + var6;
                        int var12 = this.field2091[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field2091[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field2092 * var14 + var6;
                        int var16 = this.field2091[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field2091[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field2091[this.field2092 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "()Z", line = 2884)
    public final boolean method294() {
        return true;
    }

    @OriginalMember(owner = "client!wk", name = "T", descriptor = "()I", line = 2888)
    public final int method340() {
        int var1 = this.field2113;
        this.field2113 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(FFF)V", line = 2892)
    public final void method144(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!wk", name = "YA", descriptor = "(IIII)V", line = 2897)
    public final void method309(int arg0, int arg1, int arg2, int arg3) {
        class384 var5 = this.method1122(Thread.currentThread());
        var5.field5930 = arg0;
        var5.field5933 = arg1;
        var5.field5940 = arg2;
    }

    @OriginalMember(owner = "client!wk", name = "V", descriptor = "(IIII)V", line = 2914)
    public final void method271(int arg0, int arg1, int arg2, int arg3) {
        if (this.field2112 < arg0) {
            this.field2112 = arg0;
        }
        if (this.field2079 < arg1) {
            this.field2079 = arg1;
        }
        if (this.field2108 > arg2) {
            this.field2108 = arg2;
        }
        if (this.field2104 > arg3) {
            this.field2104 = arg3;
        }
        this.method1119();
    }

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "()Z", line = 2940)
    public final boolean method319() {
        return false;
    }

    @OriginalMember(owner = "client!wk", name = "w", descriptor = "()Lq;", line = 2950)
    public final class393 method259() {
        return this.field2082;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 2962)
    public final void method291(Canvas arg0) {
        class335 var2 = (class335) this.field2076.method1558((long) arg0.hashCode(), (byte) -93);
        if (var2 != null) {
            var2.method707((byte) -80);
            class335 var3 = class47.method551(arg0, (byte) -30);
            this.field2076.method1564((long) arg0.hashCode(), var3, (byte) 123);
            if (this.field2078 == arg0 && this.field2107 == null) {
                this.field2075 = var3;
                this.field2091 = var3.field5477;
                this.field2092 = var3.field5476;
                this.field2110 = var3.field5480;
                if (this.field2098 != this.field2092 || this.field2110 != this.field2103) {
                    this.field2098 = this.field2092;
                    this.field2103 = this.field2110;
                    this.field2109 = new int[this.field2103 * this.field2098];
                }
                this.method1115();
            }
        }
    }
}
