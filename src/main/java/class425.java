import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class425 extends class391 {

    @OriginalMember(owner = "client!vn", name = "B", descriptor = "I")
    private int field5981 = 0;

    @OriginalMember(owner = "client!vn", name = "r", descriptor = "I")
    public int field5971 = 0;

    @OriginalMember(owner = "client!vn", name = "z", descriptor = "I")
    public int field5979 = 50;

    @OriginalMember(owner = "client!vn", name = "x", descriptor = "I")
    public int field5977 = 0;

    @OriginalMember(owner = "client!vn", name = "O", descriptor = "I")
    public int field5994 = 0;

    @OriginalMember(owner = "client!vn", name = "M", descriptor = "I")
    public int field5992 = 3500;

    @OriginalMember(owner = "client!vn", name = "K", descriptor = "I")
    public int field5990 = 512;

    @OriginalMember(owner = "client!vn", name = "P", descriptor = "I")
    public int field5995 = 75518;

    @OriginalMember(owner = "client!vn", name = "E", descriptor = "Z")
    private boolean field5984 = false;

    @OriginalMember(owner = "client!vn", name = "H", descriptor = "I")
    public int field5987 = 45823;

    @OriginalMember(owner = "client!vn", name = "I", descriptor = "Z")
    private boolean field5988 = false;

    @OriginalMember(owner = "client!vn", name = "S", descriptor = "I")
    private int field5998 = 3500;

    @OriginalMember(owner = "client!vn", name = "W", descriptor = "Z")
    private boolean field6002 = false;

    @OriginalMember(owner = "client!vn", name = "G", descriptor = "I")
    public int field5986 = 0;

    @OriginalMember(owner = "client!vn", name = "D", descriptor = "Z")
    public boolean field5983 = false;

    @OriginalMember(owner = "client!vn", name = "ab", descriptor = "I")
    public int field6006 = 512;

    @OriginalMember(owner = "client!vn", name = "db", descriptor = "I")
    private int field6009 = 0;

    @OriginalMember(owner = "client!vn", name = "eb", descriptor = "I")
    private int field6010 = 0;

    @OriginalMember(owner = "client!vn", name = "U", descriptor = "I")
    public int field6000 = 78642;

    @OriginalMember(owner = "client!vn", name = "R", descriptor = "I")
    public int field5997 = 0;

    @OriginalMember(owner = "client!vn", name = "hb", descriptor = "I")
    public int field6013 = 0;

    @OriginalMember(owner = "client!vn", name = "gb", descriptor = "I")
    public int field6012 = 0;

    @OriginalMember(owner = "client!vn", name = "A", descriptor = "I")
    public int field5980 = this.field5998 - 255;

    @OriginalMember(owner = "client!vn", name = "C", descriptor = "Lik;")
    private class410 field5982 = new class410(16);

    @OriginalMember(owner = "client!vn", name = "T", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5999;

    @OriginalMember(owner = "client!vn", name = "Z", descriptor = "Lpg;")
    public class112 field6005;

    @OriginalMember(owner = "client!vn", name = "ib", descriptor = "Lfl;")
    private class386 field6014;

    @OriginalMember(owner = "client!vn", name = "J", descriptor = "[I")
    public int[] field5989;

    @OriginalMember(owner = "client!vn", name = "q", descriptor = "I")
    public int field5970;

    @OriginalMember(owner = "client!vn", name = "X", descriptor = "I")
    private int field6003;

    @OriginalMember(owner = "client!vn", name = "p", descriptor = "F")
    private float field5969;

    @OriginalMember(owner = "client!vn", name = "cb", descriptor = "F")
    private float field6008;

    @OriginalMember(owner = "client!vn", name = "s", descriptor = "I")
    public int field5972;

    @OriginalMember(owner = "client!vn", name = "t", descriptor = "I")
    public int field5973;

    @OriginalMember(owner = "client!vn", name = "u", descriptor = "I")
    private int field5974;

    @OriginalMember(owner = "client!vn", name = "v", descriptor = "I")
    public int field5975;

    @OriginalMember(owner = "client!vn", name = "y", descriptor = "I")
    public int field5978;

    @OriginalMember(owner = "client!vn", name = "L", descriptor = "I")
    public int field5991;

    @OriginalMember(owner = "client!vn", name = "N", descriptor = "I")
    public int field5993;

    @OriginalMember(owner = "client!vn", name = "Q", descriptor = "I")
    public int field5996;

    @OriginalMember(owner = "client!vn", name = "Y", descriptor = "I")
    public int field6004;

    @OriginalMember(owner = "client!vn", name = "bb", descriptor = "I")
    public int field6007;

    @OriginalMember(owner = "client!vn", name = "fb", descriptor = "I")
    public int field6011;

    @OriginalMember(owner = "client!vn", name = "jb", descriptor = "Lod;")
    private class138 field6015;

    @OriginalMember(owner = "client!vn", name = "V", descriptor = "Lfd;")
    public class196 field6001;

    @OriginalMember(owner = "client!vn", name = "o", descriptor = "Lik;")
    private class410 field5968;

    @OriginalMember(owner = "client!vn", name = "w", descriptor = "Z")
    public boolean field5976;

    @OriginalMember(owner = "client!vn", name = "F", descriptor = "[Lcd;")
    private class43[] field5985;

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "(I)Z")
    public final boolean method2607(int arg0) {
        return this.field6005.method917((byte) 126, arg0).field1701;
    }

    @OriginalMember(owner = "client!vn", name = "u", descriptor = "()Lmk;")
    public final class156 method239() {
        return new class196();
    }

    @OriginalMember(owner = "client!vn", name = "z", descriptor = "()Z")
    public final boolean method203() {
        return true;
    }

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "()Z")
    public final boolean method227() {
        return false;
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(Z)V")
    public final void method152(boolean arg0) {
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(III[I)V")
    public final void method171(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (this.field6001.field2805 * arg2 + this.field6001.field2803 * arg1 + this.field6001.field2796 * arg0 >> 15) + this.field6001.field2797;
        if (var5 >= this.field5979 && var5 <= this.field5998) {
            int var6 = ((this.field6001.field2800 * arg2 + this.field6001.field2806 * arg0 + this.field6001.field2802 * arg1 >> 15) + this.field6001.field2804) * this.field5990 / var5;
            int var7 = ((this.field6001.field2807 * arg2 + this.field6001.field2801 * arg0 + this.field6001.field2799 * arg1 >> 15) + this.field6001.field2798) * this.field6006 / var5;
            if (var6 >= this.field5973 && var6 <= this.field5975 && var7 >= this.field5996 && var7 <= this.field5978) {
                arg3[0] = var6 - this.field5973;
                arg3[1] = var7 - this.field5996;
                arg3[2] = var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(IIIIII)Lk;")
    public final class293 method155(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!vn", name = "n", descriptor = "()V")
    public final void method122() {
        this.field5994 = 0;
        this.field5977 = 0;
        this.field6012 = this.field5970;
        this.field5997 = this.field6003;
        this.method2616();
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIII)[I")
    public final int[] method197(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field5970 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field5989[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "([I)V")
    public final void method90(int[] arg0) {
        arg0[0] = this.field5994;
        arg0[1] = this.field5977;
        arg0[2] = this.field6012;
        arg0[3] = this.field5997;
    }

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "()Z")
    public final boolean method99() {
        return true;
    }

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "(I)Z")
    public final boolean method2608(int arg0) {
        return this.field6005.method918(arg0, -567);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method103(Rectangle[] arg0, int arg1) {
        if (this.field5999 != null && this.field6014 != null) {
            try {
                Graphics var3 = this.field5999.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field5970 && var5.y <= this.field6003 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field6014.method1608(var5.x, var3, var5.height, var5.width, var5.y, (byte) 99);
                    }
                }
            } catch (Exception var6) {
                this.field5999.repaint();
            }
        } else {
            throw new IllegalStateException("Can't flip an offscreen toolkit");
        }
    }

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "(IIIIII)V")
    public final void method219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method259(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method259(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method192(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method192(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field5994) {
                    var10 += (this.field5994 - arg0) * var12;
                    arg0 = this.field5994;
                }
                if (var13 >= this.field6012) {
                    var13 = this.field6012 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field5977 && var17 < this.field5997) {
                                int var18 = this.field5970 * var17 + arg0;
                                int var19 = this.field5989[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field5989[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field5977 && var21 < this.field5997) {
                                int var22 = this.field5970 * var21 + arg0;
                                int var23 = this.field5989[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field5989[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field5977 && var27 < this.field5997) {
                            this.field5989[this.field5970 * var27 + arg0] = arg4;
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
                if (arg1 < this.field5977) {
                    var29 += (this.field5977 - arg1) * var31;
                    arg1 = this.field5977;
                }
                if (var32 >= this.field5997) {
                    var32 = this.field5997 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field5994 && var46 < this.field6012) {
                            this.field5989[this.field5970 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field5994 && var36 < this.field6012) {
                            int var37 = this.field5970 * arg1 + var36;
                            int var38 = this.field5989[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field5989[this.field5970 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field5994 && var40 < this.field6012) {
                            int var41 = this.field5970 * arg1 + var40;
                            int var42 = this.field5989[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field5989[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(IIII)V")
    public final void method142(int arg0, int arg1, int arg2, int arg3) {
        this.field5991 = arg0;
        this.field6011 = arg1;
        this.field5990 = arg2;
        this.field6006 = arg3;
        this.method2616();
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "([IIIII)Lkb;")
    public final class80 method188(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class225(this, arg0, arg1, arg2, arg3, arg4) : new class201(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class225(this, arg0, arg1, arg2, arg3, arg4) : new class201(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "(II)V")
    public final void method100(int arg0, int arg1) {
        this.field5986 = arg0 & 16777215;
        int var3 = this.field5986 >>> 16 & 255;
        if (var3 < 2) {
            var3 = 2;
        }
        int var4 = this.field5986 >> 8 & 255;
        if (var4 < 2) {
            var4 = 2;
        }
        int var5 = this.field5986 & 255;
        if (var5 < 2) {
            var5 = 2;
        }
        this.field5986 = var3 << 16 | var4 << 8 | var5;
        if (arg1 < 0) {
            this.field5976 = false;
        } else {
            this.field5976 = true;
        }
    }

    @OriginalMember(owner = "client!vn", name = "m", descriptor = "()F")
    public final float method114() {
        return this.field6008;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lmk;)V")
    public final void method189(class156 arg0) {
        this.field6001 = (class196) arg0;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lbg;)V")
    public final void method182(class374 arg0) {
        class422 var2 = arg0.field5256.field3518;
        for (class422 var3 = var2.field5911; var2 != var3; var3 = var3.field5911) {
            class383 var4 = (class383) var3;
            int var5 = var4.field5371 >> 12;
            int var6 = var4.field5367 >> 12;
            int var7 = var4.field5365 >> 12;
            int var8 = (this.field6001.field2805 * var7 + this.field6001.field2803 * var6 + this.field6001.field2796 * var5 >> 15) + this.field6001.field2797;
            if (var8 >= this.field5979 && var8 <= this.field5998) {
                int var9 = ((this.field6001.field2800 * var7 + this.field6001.field2806 * var5 + this.field6001.field2802 * var6 >> 15) + this.field6001.field2804) * this.field5990 / var8 + this.field5991;
                int var10 = ((this.field6001.field2807 * var7 + this.field6001.field2801 * var5 + this.field6001.field2799 * var6 >> 15) + this.field6001.field2798) * this.field6006 / var8 + this.field6011;
                if (var9 >= this.field5994 && var9 <= this.field6012 && var10 >= this.field5977 && var10 <= this.field5997) {
                    if (var8 == 0) {
                        var8 = 1;
                    }
                    this.method2613(var4, var9, var10, (var4.field5372 >> 2) / var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "()Z")
    public final boolean method173() {
        return false;
    }

    @OriginalMember(owner = "client!vn", name = "C", descriptor = "()Z")
    public final boolean method115() {
        return true;
    }

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "(I)V")
    public final void method92(int arg0) {
        this.field5985[arg0].method409((Runnable) null, 985);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(F)V")
    public final void method211(float arg0) {
        this.field5995 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Z)V")
    public final void method236(boolean arg0) {
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "()V")
    private final void method2609() {
        this.field5968 = new class410(20);
        this.field6001 = new class196();
        class134.method1073(false, (byte) -96, true);
        this.field5988 = true;
        this.method98(1);
        this.method210(0);
        this.method122();
    }

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "(I)[I")
    public final int[] method2610(int arg0) {
        class410 var2 = this.field5968;
        class405 var3;
        synchronized (this.field5968) {
            var3 = (class405) this.field5968.method2537(-120, (long) arg0);
            if (var3 == null) {
                if (!this.field6005.method918(arg0, -567)) {
                    return null;
                }
                class122 var5 = this.field6005.method917((byte) 101, arg0);
                int var6 = !var5.field1703 && !this.field6002 ? 128 : 64;
                var3 = new class405(arg0, var6, this.field6005.method919(-98, var6, var6, arg0, true, 0.7F), var5.field1713);
                this.field5968.method2542(var3, (byte) 75, (long) arg0);
            }
        }
        var3.field5630 = true;
        return var3.method2482();
    }

    @OriginalMember(owner = "client!vn", name = "m", descriptor = "(I)[I")
    private final int[] method2611(int arg0) {
        class410 var2 = this.field5968;
        class405 var3;
        synchronized (this.field5968) {
            var3 = (class405) this.field5968.method2537(-108, (long) arg0);
            if (var3 == null) {
                if (!this.field6005.method918(arg0, -567)) {
                    return null;
                }
                class122 var5 = this.field6005.method917((byte) 126, arg0);
                int var6 = !var5.field1703 && !this.field6002 ? 128 : 64;
                var3 = new class405(arg0, var6, this.field6005.method916(0.7F, 95, arg0, true, var6, var6), var5.field1713);
                this.field5968.method2542(var3, (byte) -123, (long) arg0);
            }
        }
        var3.field5630 = true;
        return var3.method2482();
    }

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "()V")
    public final void method246() {
        if (this.field5999 != null && this.field6014 != null) {
            try {
                Graphics var1 = this.field5999.getGraphics();
                this.field6014.method1607(-112, 0, 0, var1);
            } catch (Exception var2) {
                this.field5999.repaint();
            }
        } else {
            throw new IllegalStateException("Can't flip an offscreen toolkit");
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIII[BII)V")
    public final void method153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field5970 * arg1 + arg0;
            int var15 = this.field5970 - arg2;
            if (arg1 + arg3 > this.field5997) {
                arg3 -= arg1 + arg3 - this.field5997;
            }
            if (arg1 < this.field5977) {
                int var16 = this.field5977 - arg1;
                arg3 -= var16;
                var14 += this.field5970 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field6012) {
                int var17 = arg0 + arg2 - this.field6012;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field5994) {
                int var18 = this.field5994 - arg0;
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
                            int var28 = this.field5989[var14];
                            this.field5989[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field5989[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field5989[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field5989[var14++] = arg5;
                        } else {
                            this.field5989[var14++] = arg4;
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

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Ldr;Z)Lkb;")
    public final class80 method213(class214 arg0, boolean arg1) {
        int[] var3 = arg0.field2972;
        byte[] var4 = arg0.field2971;
        int var5 = arg0.field2973;
        int var6 = arg0.field2974;
        class439 var11;
        if (arg1 && arg0.field2975 == null) {
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
            var11 = new class211(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field2975;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class225(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var21 = var5 * var19;
                    for (int var22 = 0; var22 < var5; ++var22) {
                        var14[var21 + var22] = var3[var4[var21 + var22] & 255];
                    }
                }
                new class225(this, var14, var5, var6);
                var11 = new class201(this, var14, var5, var6);
            }
        }
        var11.method738(arg0.field2968, arg0.field2970, arg0.field2967, arg0.field2969);
        return var11;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lsj;Lbg;Lmk;Lmo;I)V")
    public final void method166(class73 arg0, class374 arg1, class156 arg2, class197 arg3, int arg4) {
        ((class46) arg0).method446(arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "()Z")
    public final boolean method172() {
        return false;
    }

    @OriginalMember(owner = "client!vn", name = "D", descriptor = "()Z")
    public final boolean method168() {
        return false;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I[Lj;)V")
    public final void method141(int arg0, class269[] arg1) {
    }

    @OriginalMember(owner = "client!vn", name = "n", descriptor = "(I)Z")
    public final boolean method2612(int arg0) {
        return this.field6002 || this.field6005.method917((byte) 123, arg0).field1703;
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(IIII)V")
    public final void method111(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field5970) {
            arg2 = this.field5970;
        }
        if (arg3 > this.field6003) {
            arg3 = this.field6003;
        }
        this.field5994 = arg0;
        this.field6012 = arg2;
        this.field5977 = arg1;
        this.field5997 = arg3;
        this.method2616();
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(FF)V")
    public final void method108(float arg0, float arg1) {
        this.field6008 = arg0;
        this.field5969 = arg1;
        this.method2617();
    }

    @OriginalMember(owner = "client!vn", name = "L", descriptor = "()Z")
    public final boolean method146() {
        return false;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Leb;III)V")
    public final void method2613(class383 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 >> 1;
        int var6 = arg0.field5368;
        if (var6 == -1) {
            this.method191(arg1, arg2, var5, arg0.field5376, 1);
        } else {
            if (this.field6015 == null || (long) var6 != this.field6015.field5349) {
                this.field6015 = (class138) this.field5982.method2537(-27, (long) var6);
            }
            if (this.field6015 == null) {
                int[] var7 = this.method2611(var6);
                if (var7 == null) {
                    return;
                }
                this.field6015 = new class138();
                this.field6015.field1952 = this.method2612(var6);
                int var8 = this.field6015.field1952 ? 64 : 128;
                this.field6015.field1951 = this.method188(var7, 0, var8, var8, var8);
                this.field5982.method2542(this.field6015, (byte) 87, (long) var6);
            }
            if (this.field6015.field1952) {
                var5 <<= 1;
                arg3 <<= 1;
            }
            this.field6015.field1951.method726(arg1 - var5, arg2 - var5, arg3, arg3, 1, arg0.field5376, 1);
        }
    }

    @OriginalMember(owner = "client!vn", name = "w", descriptor = "()Z")
    public final boolean method250() {
        return false;
    }

    @OriginalMember(owner = "client!vn", name = "q", descriptor = "()V")
    public final void method181() {
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "()Z")
    public final boolean method2614() {
        return this.field5984;
    }

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "()I")
    public final int method199() {
        return 0;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IFFFFF)V")
    public final void method151(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field5987 = (int) (arg1 * 65535.0F);
        this.field6000 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field5993 = (int) (arg3 * 65535.0F / var7);
        this.field5972 = (int) (arg4 * 65535.0F / var7);
        this.field6007 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!vn", name = "o", descriptor = "(I)I")
    public final int method2615(int arg0) {
        return this.field6005.method917((byte) 108, arg0).field1707 & 65535;
    }

    @OriginalMember(owner = "client!vn", name = "x", descriptor = "()V")
    public final void method217() {
        if (this.field5988) {
            class370.method2311(-1, false, true);
            this.field5988 = false;
        }
        this.field5999 = null;
        this.field6005 = null;
        this.field6014 = null;
        this.field5984 = true;
    }

    @OriginalMember(owner = "client!vn", name = "A", descriptor = "()Z")
    public final boolean method91() {
        return true;
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(Z)V")
    public final void method120(boolean arg0) {
        this.field6002 = arg0;
        this.field5968.method2533(0);
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "()V")
    private final void method2616() {
        this.field5973 = this.field5994 - this.field5991;
        this.field5975 = this.field6012 - this.field5991;
        this.field5996 = this.field5977 - this.field6011;
        this.field5978 = this.field5997 - this.field6011;
        for (int var1 = 0; var1 < this.field6004; ++var1) {
            class274 var5 = this.field5985[var1].field647;
            var5.field3674 = this.field5991 - this.field5994;
            var5.field3675 = this.field6011 - this.field5977;
            var5.field3681 = this.field6012 - this.field5994;
            var5.field3672 = this.field5997 - this.field5977;
        }
        int var2 = this.field5977 * this.field5970 + this.field5994;
        for (int var3 = this.field5977; var3 < this.field5997; ++var3) {
            for (int var4 = 0; var4 < this.field6004; ++var4) {
                this.field5985[var4].field647.field3683[var3 - this.field5977] = var2;
            }
            var2 += this.field5970;
        }
    }

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "()V")
    public final void method177() {
        this.field5968.method2533(0);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lmr;IIII)Lsj;")
    public final class73 method237(class84 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class46(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "()I")
    public final int method200() {
        return 0;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)I")
    public final int method183(int arg0, int arg1) {
        int var3 = arg0 | 66560;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(III)V")
    public final void method129(int arg0, int arg1, int arg2) {
        this.field5971 = arg0;
        this.field5986 = arg1;
        this.field6013 = arg2;
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(II)I")
    public final int method163(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lvm;[Ldr;Z)Lhq;")
    public final class175 method89(class323 arg0, class214[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field2973;
            var5[var7] = arg1[var7].field2974;
            if (arg1[var7].field2975 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            return new class351(this, arg0, arg1, var4, var5);
        } else if (var6) {
            return new class93(this, arg0, arg1, var4, var5);
        } else {
            return new class248(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "([Lsj;Lmk;[Lmo;I)V")
    public final void method245(class73[] arg0, class156 arg1, class197[] arg2, int arg3) {
        class46[] var5 = new class46[arg0.length];
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class46) arg0[var6];
            }
        }
        class46 var7 = class46.method461(this, var5);
        var7.method446(arg1, arg2 != null ? arg2[0] : null, (class374) null, arg3);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(FFF)V")
    public final void method254(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(IIIIII)Z")
    public final boolean method228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (this.field6001.field2805 * arg2 + this.field6001.field2803 * arg1 + this.field6001.field2796 * arg0 >> 15) + this.field6001.field2797;
        if (var7 < 1) {
            var7 = 1;
        }
        int var8 = (this.field6001.field2805 * arg5 + this.field6001.field2803 * arg4 + this.field6001.field2796 * arg3 >> 15) + this.field6001.field2797;
        if (var8 < 1) {
            var8 = 1;
        }
        if ((var7 >= this.field5979 || var8 >= this.field5979) && (var7 <= this.field5998 || var8 <= this.field5998)) {
            int var9 = ((this.field6001.field2800 * arg2 + this.field6001.field2806 * arg0 + this.field6001.field2802 * arg1 >> 15) + this.field6001.field2804) * this.field5990 / var7;
            int var10 = ((this.field6001.field2800 * arg5 + this.field6001.field2806 * arg3 + this.field6001.field2802 * arg4 >> 15) + this.field6001.field2804) * this.field5990 / var8;
            if (var9 < this.field5973 && var10 < this.field5973 || var9 > this.field5975 && var10 > this.field5975) {
                return false;
            } else {
                int var11 = ((this.field6001.field2807 * arg2 + this.field6001.field2801 * arg0 + this.field6001.field2799 * arg1 >> 15) + this.field6001.field2798) * this.field6006 / var7;
                int var12 = ((this.field6001.field2807 * arg5 + this.field6001.field2801 * arg3 + this.field6001.field2799 * arg4 >> 15) + this.field6001.field2798) * this.field6006 / var8;
                return (var11 >= this.field5996 || var12 >= this.field5996) && (var11 <= this.field5978 || var12 <= this.field5978);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vn", name = "t", descriptor = "()Z")
    public final boolean method133() {
        return false;
    }

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "(IIIIII)V")
    public final void method167(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method259(arg0, arg1, arg2, arg4, arg5);
        this.method259(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method192(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method192(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!vn", name = "M", descriptor = "()V")
    private final void method2617() {
        if (this.field5969 != 0.0F) {
            float var1 = (float) this.field5998;
            float var2 = (float) this.field5979;
            float var3 = -(var2 * 2.0F * var1) / (var1 - var2);
            float var4 = this.field6008 / (this.field6008 + this.field5969);
            float var5 = var4 * var4;
            float var6 = (1.0F - var4) * -var3 * (1.0F - var4) / this.field5969;
            this.field5992 = (int) (((float) this.field5998 - var3 * var5) / ((var1 + var2) / (var1 - var2) - var6) + 0.5F);
        } else {
            this.field5992 = this.field5998;
        }
    }

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "(IIII)V")
    public final void method186(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method194(Canvas arg0) {
        this.field5999 = arg0;
        this.method174();
    }

    @OriginalMember(owner = "client!vn", name = "I", descriptor = "()F")
    public final float method208() {
        return this.field5969;
    }

    @OriginalMember(owner = "client!vn", name = "p", descriptor = "()Z")
    public final boolean method106() {
        return false;
    }

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "()I")
    public final int method234() {
        int var1 = this.field6010;
        this.field6010 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!vn", name = "B", descriptor = "()V")
    public final void method235() {
    }

    @OriginalMember(owner = "client!vn", name = "s", descriptor = "()V")
    public final void method174() {
        this.field6014 = class235.method1571(-1, this.field5999);
        this.field5989 = this.field6014.field5436;
        this.field5970 = this.field6014.field5435;
        this.field6003 = this.field6014.field5432;
        for (int var1 = 0; var1 < this.field6004; ++var1) {
            this.field5985[var1].method406((byte) 69);
        }
        this.method122();
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method232(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class43 var11 = this.method2618(Thread.currentThread());
        class274 var12 = var11.field647;
        var12.field3671 = false;
        int var13 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var13 == 255) {
            var12.field3671 = false;
            var12.field3673 = 0;
            var12.field3676 = true;
            var12.method1759(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else {
            if (arg9 != 1) {
                if (arg9 == 2) {
                    throw new IllegalStateException();
                }
                throw new IllegalArgumentException();
            }
            var12.field3671 = false;
            var12.field3673 = 255 - var13;
            var12.field3676 = true;
            var12.method1759(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        }
        var12.field3671 = true;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIII)V")
    public final void method259(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field5977 && arg1 < this.field5997) {
            if (arg0 < this.field5994) {
                arg2 -= this.field5994 - arg0;
                arg0 = this.field5994;
            }
            if (arg0 + arg2 > this.field6012) {
                arg2 = this.field6012 - arg0;
            }
            int var6 = this.field5970 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field5989[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field5989[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field5989[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field5989[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field5989[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "(I)V")
    public final void method104(int arg0) {
        this.method95(0, 0, this.field5970, this.field6003, arg0, 0);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIIII)V")
    public final void method196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class43 var8 = this.method2618(Thread.currentThread());
        class274 var9 = var8.field647;
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
            int var21 = arg0 - var9.method1758();
            int var22 = arg1 - var9.method1752();
            int var23 = var17 + var21;
            int var24 = var21 - var18;
            int var25 = var10 + var21 - var18;
            int var26 = var10 + var21 + var17;
            int var27 = var19 + var22;
            int var28 = var22 - var20;
            int var29 = var11 + var22 - var20;
            int var30 = var11 + var22 + var19;
            if (arg6 == 0) {
                var9.field3673 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field3673 = 255 - (arg4 >> 24);
            }
            var9.field3676 = var23 < 0 || var23 > var9.field3681 || var24 < 0 || var24 > var9.field3681 || var25 < 0 || var25 > var9.field3681;
            var9.method1746(var27, var28, var29, var23, var24, var25, arg4);
            var9.field3676 = var23 < 0 || var23 > var9.field3681 || var24 < 0 || var24 > var9.field3681 || var26 < 0 || var26 > var9.field3681;
            var9.method1746(var27, var29, var30, var23, var25, var26, arg4);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lk;Lk;FLk;)Lk;")
    public final class293 method229(class293 arg0, class293 arg1, float arg2, class293 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "(IIIIII)V")
    public final void method95(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field5994) {
            arg2 -= this.field5994 - arg0;
            arg0 = this.field5994;
        }
        if (arg1 < this.field5977) {
            arg3 -= this.field5977 - arg1;
            arg1 = this.field5977;
        }
        if (arg0 + arg2 > this.field6012) {
            arg2 = this.field6012 - arg0;
        }
        if (arg1 + arg3 > this.field5997) {
            arg3 = this.field5997 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field6012 && arg1 <= this.field5997) {
            int var7 = this.field5970 - arg2;
            int var8 = this.field5970 * arg1 + arg0;
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
                            this.field5989[var24] = arg4;
                            ++var24;
                            this.field5989[var24] = arg4;
                            ++var24;
                            this.field5989[var24] = arg4;
                            ++var24;
                            this.field5989[var24] = arg4;
                            ++var24;
                            this.field5989[var24] = arg4;
                            ++var24;
                            this.field5989[var24] = arg4;
                            ++var24;
                            this.field5989[var24] = arg4;
                            ++var24;
                            this.field5989[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field5989[var24] = arg4;
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
                        int var14 = this.field5989[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + ((var14 & 65280) * var11 >> 8 & 65280);
                        this.field5989[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field5989[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field5989[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vn", name = "K", descriptor = "()Z")
    public final boolean method258() {
        return false;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Li;)V")
    public final void method256(class83 arg0) {
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)Li;")
    public final class83 method206(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(II[I[I)Lvj;")
    public final class179 method221(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class280(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "(I)V")
    public final void method248(int arg0) {
        int var2 = arg0 - this.field5974;
        for (Object var3 = this.field5968.method2540(-1); var3 != null; var3 = this.field5968.method2535((byte) 44)) {
            class405 var4 = (class405) var3;
            if (var4.field5630) {
                var4.field5631 += var2;
                int var5 = var4.field5631 / 20;
                if (var5 > 0) {
                    class122 var6 = this.field6005.method917((byte) 105, var4.field5634);
                    var4.method2483(var6.field1710 * var2 * 50 / 1000, var6.field1711 * var2 * 50 / 1000);
                    var4.field5631 -= var5 * 20;
                }
                var4.field5630 = false;
            }
        }
        this.field5974 = arg0;
        this.field5982.method2534(0, 5);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "([Lsj;Lbg;Lmk;[Lmo;I)V")
    public final void method212(class73[] arg0, class374 arg1, class156 arg2, class197[] arg3, int arg4) {
        class46[] var6 = new class46[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class46) arg0[var7];
            }
        }
        class46 var8 = class46.method461(this, var6);
        var8.method446(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(II)V")
    public final void method124(int arg0, int arg1) {
        this.field5979 = arg0;
        this.field5998 = arg1;
        this.field5980 = this.field5998 - 255;
        this.method2617();
    }

    @OriginalMember(owner = "client!vn", name = "r", descriptor = "()V")
    public final void method101() {
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(IIIIZ)Lkb;")
    public final class80 method178(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field5970 * arg1 + arg0;
        int var8 = this.field5970 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field5989[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class225(this, var6, arg2, arg3);
        } else {
            return new class201(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "(I)V")
    public final void method210(int arg0) {
        this.field5985[arg0].method409(Thread.currentThread(), 985);
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)V")
    public final void method98(int arg0) {
        if (this.field6004 != arg0) {
            this.field6004 = arg0;
            this.field5985 = new class43[this.field6004];
            for (int var2 = 0; var2 < this.field6004; ++var2) {
                this.field5985[var2] = new class43(this);
            }
        }
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(IIIII)V")
    public final void method191(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field5977) {
            var6 = this.field5977;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field5997) {
            var7 = this.field5997;
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
                if (var64 < this.field5994) {
                    var64 = this.field5994;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field6012) {
                    var65 = this.field6012;
                }
                int var66 = this.field5970 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field5989[var66++] = arg3;
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
                if (var60 < this.field5994) {
                    var60 = this.field5994;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field6012 - 1) {
                    var61 = this.field6012 - 1;
                }
                int var62 = this.field5970 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field5989[var62++] = arg3;
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
                if (var28 < this.field5994) {
                    var28 = this.field5994;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field6012) {
                    var29 = this.field6012;
                }
                int var30 = this.field5970 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field5989[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field5989[var30++] = var15 + var33;
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
                if (var22 < this.field5994) {
                    var22 = this.field5994;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field6012 - 1) {
                    var23 = this.field6012 - 1;
                }
                int var24 = this.field5970 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field5989[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field5989[var24++] = var15 + var27;
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
                if (var47 < this.field5994) {
                    var47 = this.field5994;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field6012) {
                    var48 = this.field6012;
                }
                int var49 = this.field5970 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field5989[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field5989[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field5994) {
                    var39 = this.field5994;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field6012 - 1) {
                    var40 = this.field6012 - 1;
                }
                int var41 = this.field5970 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field5989[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field5989[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Ljava/lang/Runnable;)Lcd;")
    public final class43 method2618(Runnable arg0) {
        for (int var2 = 0; var2 < this.field6004; ++var2) {
            if (this.field5985[var2].field654 == arg0) {
                return this.field5985[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILvj;II)V")
    public final void method154(int arg0, class179 arg1, int arg2, int arg3) {
        class280 var5 = (class280) arg1;
        int[] var6 = var5.field3748;
        int[] var7 = var5.field3751;
        int var8;
        if (this.field5997 < var6.length + arg3) {
            var8 = this.field5997 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field5977 > arg3) {
            var9 = this.field5977 - arg3;
            arg3 = this.field5977;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field5970 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field5994 > var12) {
                    var13 -= this.field5994 - var12;
                    var12 = this.field5994;
                }
                if (this.field6012 < var12 + var13) {
                    var13 = this.field6012 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field5989[var14++] = arg0;
                }
                var10 += this.field5970;
            }
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIIILvj;II)V")
    public final void method220(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class179 arg6, int arg7, int arg8) {
        class280 var10 = (class280) arg6;
        int[] var11 = var10.field3748;
        int[] var12 = var10.field3751;
        int var13 = this.field5977 > arg8 ? this.field5977 : arg8;
        int var14 = this.field5997 < var11.length + arg8 ? this.field5997 : var11.length + arg8;
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
            if (arg0 < this.field5994) {
                var18 += (this.field5994 - arg0) * var20;
                arg0 = this.field5994;
            }
            if (var21 >= this.field6012) {
                var21 = this.field6012 - 1;
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
                                int var28 = this.field5970 * var25 + arg0;
                                int var29 = this.field5989[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field5989[var28] = var23 + var30;
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
                                int var34 = this.field5970 * var31 + arg0;
                                int var35 = this.field5989[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field5989[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field5989[this.field5970 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field5994 && var64 < this.field6012 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field5989[this.field5970 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field5994 && var50 < this.field6012 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field5970 * arg1 + var50;
                        int var54 = this.field5989[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field5989[this.field5970 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field5994 && var56 < this.field6012 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field5970 * arg1 + var56;
                        int var60 = this.field5989[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field5989[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!vn", name = "H", descriptor = "()Z")
    public final boolean method231() {
        return false;
    }

    @OriginalMember(owner = "client!vn", name = "E", descriptor = "()I")
    public final int method224() {
        int var1 = this.field5981;
        this.field5981 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!vn", name = "G", descriptor = "()V")
    public final void method148() {
        this.field5986 = this.field6009;
        this.field5983 = false;
    }

    @OriginalMember(owner = "client!vn", name = "J", descriptor = "()V")
    public final void method110() {
    }

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "(IIII)V")
    public final void method218(int arg0, int arg1, int arg2, int arg3) {
        if (this.field5994 < arg0) {
            this.field5994 = arg0;
        }
        if (this.field5977 < arg1) {
            this.field5977 = arg1;
        }
        if (this.field6012 > arg2) {
            this.field6012 = arg2;
        }
        if (this.field5997 > arg3) {
            this.field5997 = arg3;
        }
        this.method2616();
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(III)V")
    public final void method137(int arg0, int arg1, int arg2) {
        this.field6009 = this.field5986;
        this.field5971 = arg0;
        this.field5986 = arg1;
        this.field6013 = arg2;
        this.field5983 = true;
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(IIIII)V")
    public final void method192(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field5994 && arg0 < this.field6012) {
            if (arg1 < this.field5977) {
                arg2 -= this.field5977 - arg1;
                arg1 = this.field5977;
            }
            if (arg1 + arg2 > this.field5997) {
                arg2 = this.field5997 - arg1;
            }
            int var6 = this.field5970 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field5970 * var10 + var6;
                        int var12 = this.field5989[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field5989[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field5970 * var14 + var6;
                        int var16 = this.field5989[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field5989[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field5989[this.field5970 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(II[[I[[IIII)Lsa;")
    public final class411 method105(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class222(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!vn", name = "F", descriptor = "()Z")
    public final boolean method202() {
        return false;
    }

    @OriginalMember(owner = "client!vn", name = "o", descriptor = "()Lmk;")
    public final class156 method226() {
        class43 var1 = this.method2618(Thread.currentThread());
        return var1.field643;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lk;)V")
    public final void method170(class293 arg0) {
    }

    @OriginalMember(owner = "client!vn", name = "y", descriptor = "()I")
    public final int method147() {
        return this.field5998;
    }

    @OriginalMember(owner = "client!vn", name = "v", descriptor = "()I")
    public final int method116() {
        return this.field5979;
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lpg;I)V")
    public class425(Canvas arg0, class112 arg1, int arg2) {
        this.field5999 = arg0;
        this.field6005 = arg1;
        super.field5484 = arg2;
        this.field6014 = class235.method1571(-1, this.field5999);
        this.field5989 = this.field6014.field5436;
        this.field5970 = this.field6014.field5435;
        this.field6003 = this.field6014.field5432;
        this.method2609();
    }
}
