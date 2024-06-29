import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class273 extends class134 {

    @OriginalMember(owner = "client!lg", name = "y", descriptor = "Z")
    private boolean field3864;

    @OriginalMember(owner = "client!lg", name = "x", descriptor = "Z")
    private boolean field3863;

    @OriginalMember(owner = "client!lg", name = "w", descriptor = "Lfe;")
    private class384 field3862;

    @OriginalMember(owner = "client!lg", name = "B", descriptor = "I")
    public int field3867;

    @OriginalMember(owner = "client!lg", name = "N", descriptor = "I")
    public int field3879;

    @OriginalMember(owner = "client!lg", name = "E", descriptor = "I")
    private int field3870;

    @OriginalMember(owner = "client!lg", name = "V", descriptor = "I")
    public int field3887;

    @OriginalMember(owner = "client!lg", name = "K", descriptor = "I")
    private int field3876;

    @OriginalMember(owner = "client!lg", name = "X", descriptor = "I")
    public int field3889;

    @OriginalMember(owner = "client!lg", name = "Q", descriptor = "I")
    private int field3882;

    @OriginalMember(owner = "client!lg", name = "J", descriptor = "I")
    public int field3875;

    @OriginalMember(owner = "client!lg", name = "G", descriptor = "I")
    public int field3872;

    @OriginalMember(owner = "client!lg", name = "eb", descriptor = "Z")
    public boolean field3896;

    @OriginalMember(owner = "client!lg", name = "T", descriptor = "I")
    public int field3885;

    @OriginalMember(owner = "client!lg", name = "Y", descriptor = "I")
    public int field3890;

    @OriginalMember(owner = "client!lg", name = "hb", descriptor = "I")
    public int field3899;

    @OriginalMember(owner = "client!lg", name = "lb", descriptor = "I")
    public int field3903;

    @OriginalMember(owner = "client!lg", name = "ib", descriptor = "I")
    private int field3900;

    @OriginalMember(owner = "client!lg", name = "jb", descriptor = "I")
    public int field3901;

    @OriginalMember(owner = "client!lg", name = "kb", descriptor = "I")
    public int field3902;

    @OriginalMember(owner = "client!lg", name = "ob", descriptor = "I")
    public int field3906;

    @OriginalMember(owner = "client!lg", name = "U", descriptor = "Z")
    private boolean field3886;

    @OriginalMember(owner = "client!lg", name = "mb", descriptor = "I")
    public int field3904;

    @OriginalMember(owner = "client!lg", name = "qb", descriptor = "I")
    public int field3908;

    @OriginalMember(owner = "client!lg", name = "I", descriptor = "Ldc;")
    private class5 field3874;

    @OriginalMember(owner = "client!lg", name = "rb", descriptor = "I")
    private int field3909;

    @OriginalMember(owner = "client!lg", name = "W", descriptor = "Ldc;")
    private class5 field3888;

    @OriginalMember(owner = "client!lg", name = "pb", descriptor = "Lad;")
    public class279 field3907;

    @OriginalMember(owner = "client!lg", name = "L", descriptor = "F")
    private float field3877;

    @OriginalMember(owner = "client!lg", name = "bb", descriptor = "F")
    private float field3893;

    @OriginalMember(owner = "client!lg", name = "v", descriptor = "I")
    private int field3861;

    @OriginalMember(owner = "client!lg", name = "C", descriptor = "I")
    public int field3868;

    @OriginalMember(owner = "client!lg", name = "D", descriptor = "I")
    public int field3869;

    @OriginalMember(owner = "client!lg", name = "H", descriptor = "I")
    public int field3873;

    @OriginalMember(owner = "client!lg", name = "M", descriptor = "I")
    public int field3878;

    @OriginalMember(owner = "client!lg", name = "O", descriptor = "I")
    public int field3880;

    @OriginalMember(owner = "client!lg", name = "P", descriptor = "I")
    public int field3881;

    @OriginalMember(owner = "client!lg", name = "S", descriptor = "I")
    private int field3884;

    @OriginalMember(owner = "client!lg", name = "Z", descriptor = "I")
    public int field3891;

    @OriginalMember(owner = "client!lg", name = "ab", descriptor = "I")
    public int field3892;

    @OriginalMember(owner = "client!lg", name = "cb", descriptor = "I")
    public int field3894;

    @OriginalMember(owner = "client!lg", name = "db", descriptor = "I")
    public int field3895;

    @OriginalMember(owner = "client!lg", name = "fb", descriptor = "I")
    public int field3897;

    @OriginalMember(owner = "client!lg", name = "z", descriptor = "Lsr;")
    private class157 field3865;

    @OriginalMember(owner = "client!lg", name = "gb", descriptor = "Lqg;")
    private class307 field3898;

    @OriginalMember(owner = "client!lg", name = "sb", descriptor = "Lqg;")
    private class307 field3910;

    @OriginalMember(owner = "client!lg", name = "A", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3866;

    @OriginalMember(owner = "client!lg", name = "R", descriptor = "Z")
    public boolean field3883;

    @OriginalMember(owner = "client!lg", name = "F", descriptor = "[I")
    public int[] field3871;

    @OriginalMember(owner = "client!lg", name = "nb", descriptor = "[Ljs;")
    private class207[] field3905;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(IIIIII)V", line = 3)
    public final void method770(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field3887) {
            arg2 -= this.field3887 - arg0;
            arg0 = this.field3887;
        }
        if (arg1 < this.field3899) {
            arg3 -= this.field3899 - arg1;
            arg1 = this.field3899;
        }
        if (arg0 + arg2 > this.field3901) {
            arg2 = this.field3901 - arg0;
        }
        if (arg1 + arg3 > this.field3875) {
            arg3 = this.field3875 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field3901 && arg1 <= this.field3875) {
            int var7 = this.field3880 - arg2;
            int var8 = this.field3880 * arg1 + arg0;
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
                            this.field3871[var24] = arg4;
                            ++var24;
                            this.field3871[var24] = arg4;
                            ++var24;
                            this.field3871[var24] = arg4;
                            ++var24;
                            this.field3871[var24] = arg4;
                            ++var24;
                            this.field3871[var24] = arg4;
                            ++var24;
                            this.field3871[var24] = arg4;
                            ++var24;
                            this.field3871[var24] = arg4;
                            ++var24;
                            this.field3871[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field3871[var24] = arg4;
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
                        int var14 = this.field3871[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + ((var14 & 65280) * var11 >> 8 & 65280);
                        this.field3871[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field3871[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field3871[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "w", descriptor = "()Z", line = 138)
    public final boolean method797() {
        return false;
    }

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "()I", line = 141)
    public final int method757() {
        return this.field3904;
    }

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "(I)I", line = 144)
    public final int method1667(int arg0) {
        return super.field1695.method432(arg0, true).field1532 & 65535;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)V", line = 147)
    public final void method775(int arg0, int arg1, int arg2) {
        this.field3890 = arg0 & 16777215;
        int var4 = this.field3890 >>> 16 & 255;
        if (var4 < 2) {
            var4 = 2;
        }
        int var5 = this.field3890 >> 8 & 255;
        if (var5 < 2) {
            var5 = 2;
        }
        int var6 = this.field3890 & 255;
        if (var6 < 2) {
            var6 = 2;
        }
        this.field3890 = var4 << 16 | var5 << 8 | var6;
        if (arg1 < 0) {
            this.field3883 = false;
        } else {
            this.field3883 = true;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 171)
    public final void method734(Canvas arg0) {
        if (arg0 != null) {
            class157 var2 = (class157) this.field3862.method2310((byte) 104, (long) arg0.hashCode());
            if (var2 != null) {
                this.field3866 = arg0;
                this.field3865 = var2;
                if (this.field3898 == null) {
                    this.field3871 = var2.field2052;
                    this.field3880 = var2.field2049;
                    this.field3884 = var2.field2054;
                    this.method1674();
                    return;
                }
            }
        } else {
            this.field3866 = null;
            this.field3865 = null;
            if (this.field3898 == null) {
                this.field3871 = null;
                this.field3880 = this.field3884 = 1;
                this.method1674();
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(ILps;)V", line = 205)
    private class273(int arg0, class59 arg1) {
        super(arg0, arg1);
        this.field3864 = false;
        this.field3863 = false;
        this.field3862 = new class384(4);
        this.field3867 = 3500;
        this.field3879 = 75518;
        this.field3870 = 0;
        this.field3887 = 0;
        this.field3876 = 0;
        this.field3889 = 0;
        this.field3882 = 0;
        this.field3875 = 0;
        this.field3872 = 512;
        this.field3896 = false;
        this.field3885 = 78642;
        this.field3890 = 0;
        this.field3899 = 0;
        this.field3903 = 0;
        this.field3900 = 3500;
        this.field3901 = 0;
        this.field3902 = this.field3900 - 255;
        this.field3906 = 512;
        this.field3886 = false;
        this.field3904 = 50;
        this.field3908 = 45823;
        this.field3874 = new class5(16);
        this.field3909 = -1;
        this.field3888 = new class5(20);
        this.field3907 = new class279();
        this.method786(1);
        this.method813(0);
        class33.method277(false, 57, true);
        this.field3863 = true;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIII)V", line = 216)
    public final void method738(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method793(arg0, arg1, arg2, arg4, arg5);
        this.method793(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method740(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method740(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "(I)V", line = 222)
    public final void method839(int arg0) {
        this.field3905[arg0].method1281((Runnable) null, 8191);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)V", line = 225)
    public final void method733(boolean arg0) {
        this.field3886 = arg0;
        this.field3888.method38((byte) -88);
    }

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "()I", line = 231)
    public final int method752() {
        return this.field3900;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II[I[I)Lfs;", line = 235)
    public final class372 method763(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class277(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!lg", name = "I", descriptor = "()V", line = 238)
    private final void method1668() {
        if (this.field3877 != 0.0F) {
            float var1 = (float) this.field3900;
            float var2 = (float) this.field3904;
            float var3 = -(var2 * 2.0F * var1) / (var1 - var2);
            float var4 = this.field3893 / (this.field3893 + this.field3877);
            float var5 = var4 * var4;
            float var6 = (1.0F - var4) * -var3 * (1.0F - var4) / this.field3877;
            this.field3867 = (int) (((float) this.field3900 - var3 * var5) / ((var1 + var2) / (var1 - var2) - var6) + 0.5F);
        } else {
            this.field3867 = this.field3900;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIIIIII)V", line = 260)
    public final void method827(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class207 var11 = this.method1671(Thread.currentThread());
        class421 var12 = var11.field2871;
        var12.field6221 = false;
        int var13 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var13 == 255) {
            var12.field6221 = false;
            var12.field6219 = 0;
            var12.field6210 = true;
            var12.method2497(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else {
            if (arg9 != 1) {
                if (arg9 == 2) {
                    throw new IllegalStateException();
                }
                throw new IllegalArgumentException();
            }
            var12.field6221 = false;
            var12.field6219 = 255 - var13;
            var12.field6210 = true;
            var12.method2497(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        }
        var12.field6221 = true;
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(Z)V", line = 293)
    public final void method773(boolean arg0) {
    }

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "()F", line = 296)
    public final float method781() {
        return this.field3877;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIF)Ldq;", line = 299)
    public final class472 method747(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!lg", name = "v", descriptor = "()Z", line = 302)
    public final boolean method795() {
        return true;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(FF)V", line = 305)
    public final void method821(float arg0, float arg1) {
        this.field3893 = arg0;
        this.field3877 = arg1;
        this.method1668();
    }

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "(I)Z", line = 310)
    public final boolean method1669(int arg0) {
        return super.field1695.method432(arg0, true).field1523;
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "()Z", line = 313)
    public final boolean method742() {
        return true;
    }

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "()Z", line = 316)
    public final boolean method744() {
        return true;
    }

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "(I)V", line = 320)
    public final void method833(int arg0) {
        int var2 = arg0 - this.field3861;
        for (Object var3 = this.field3888.method32(-108); var3 != null; var3 = this.field3888.method37((byte) 20)) {
            class24 var4 = (class24) var3;
            if (var4.field408) {
                var4.field407 += var2;
                int var5 = var4.field407 / 20;
                if (var5 > 0) {
                    class118 var6 = super.field1695.method432(var4.field410, true);
                    var4.method213(var6.field1534 * var2 * 50 / 1000, var6.field1528 * var2 * 50 / 1000);
                    var4.field407 -= var5 * 20;
                }
                var4.field408 = false;
            }
        }
        this.field3861 = arg0;
        this.field3874.method39(false, 5);
    }

    @OriginalMember(owner = "client!lg", name = "D", descriptor = "()Z", line = 351)
    public final boolean method831() {
        return false;
    }

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "()V", line = 354)
    public final void method768() {
        this.field3890 = this.field3882;
        this.field3896 = false;
    }

    @OriginalMember(owner = "client!lg", name = "C", descriptor = "()Lgs;", line = 359)
    public final class33 method830() {
        class207 var1 = this.method1671(Thread.currentThread());
        return var1.field2866;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)V", line = 363)
    public final void method814(int arg0, int arg1) {
        this.field3904 = arg0;
        this.field3900 = arg1;
        this.field3902 = this.field3900 - 255;
        this.method1668();
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(IIIIII)V", line = 370)
    public final void method803(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method793(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method793(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method740(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method740(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field3887) {
                    var10 += (this.field3887 - arg0) * var12;
                    arg0 = this.field3887;
                }
                if (var13 >= this.field3901) {
                    var13 = this.field3901 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field3899 && var17 < this.field3875) {
                                int var18 = this.field3880 * var17 + arg0;
                                int var19 = this.field3871[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field3871[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field3899 && var21 < this.field3875) {
                                int var22 = this.field3880 * var21 + arg0;
                                int var23 = this.field3871[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field3871[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field3899 && var27 < this.field3875) {
                            this.field3871[this.field3880 * var27 + arg0] = arg4;
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
                if (arg1 < this.field3899) {
                    var29 += (this.field3899 - arg1) * var31;
                    arg1 = this.field3899;
                }
                if (var32 >= this.field3875) {
                    var32 = this.field3875 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field3887 && var46 < this.field3901) {
                            this.field3871[this.field3880 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field3887 && var36 < this.field3901) {
                            int var37 = this.field3880 * arg1 + var36;
                            int var38 = this.field3871[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field3871[this.field3880 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field3887 && var40 < this.field3901) {
                            int var41 = this.field3880 * arg1 + var40;
                            int var42 = this.field3871[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field3871[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!lg", name = "J", descriptor = "()V", line = 583)
    private final void method1670() {
        this.field3892 = this.field3887 - this.field3897;
        this.field3894 = this.field3901 - this.field3897;
        this.field3891 = this.field3899 - this.field3868;
        this.field3873 = this.field3875 - this.field3868;
        for (int var1 = 0; var1 < this.field3878; ++var1) {
            class421 var5 = this.field3905[var1].field2871;
            var5.field6212 = this.field3897 - this.field3887;
            var5.field6211 = this.field3868 - this.field3899;
            var5.field6215 = this.field3901 - this.field3887;
            var5.field6217 = this.field3875 - this.field3899;
        }
        int var2 = this.field3899 * this.field3880 + this.field3887;
        for (int var3 = this.field3899; var3 < this.field3875; ++var3) {
            for (int var4 = 0; var4 < this.field3878; ++var4) {
                this.field3905[var4].field2871.field6216[var3 - this.field3899] = var2;
            }
            var2 += this.field3880;
        }
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(I)V", line = 621)
    public final void method792(int arg0) {
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(IIII)V", line = 624)
    public final void method789(int arg0, int arg1, int arg2, int arg3) {
        if (this.field3887 < arg0) {
            this.field3887 = arg0;
        }
        if (this.field3899 < arg1) {
            this.field3899 = arg1;
        }
        if (this.field3901 > arg2) {
            this.field3901 = arg2;
        }
        if (this.field3875 > arg3) {
            this.field3875 = arg3;
        }
        this.method1670();
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIII)[I", line = 640)
    public final int[] method758(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field3880 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field3871[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!lg", name = "x", descriptor = "()V", line = 665)
    public final void method807() {
        if (this.field3863) {
            class30.method239(false, true, (byte) 47);
            this.field3863 = false;
        }
        this.field3865 = null;
        this.field3866 = null;
        this.field3862 = null;
        this.field3864 = true;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ljava/lang/Runnable;)Ljs;", line = 679)
    public final class207 method1671(Runnable arg0) {
        for (int var2 = 0; var2 < this.field3878; ++var2) {
            if (this.field3905[var2].field2872 == arg0) {
                return this.field3905[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "(IIIIII)Loi;", line = 691)
    public final class49 method829(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(II)I", line = 694)
    public final int method828(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!lg", name = "G", descriptor = "()I", line = 698)
    public final int method838() {
        int var1 = this.field3870;
        this.field3870 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "()Z", line = 703)
    public final boolean method765() {
        return false;
    }

    @OriginalMember(owner = "client!lg", name = "u", descriptor = "()F", line = 706)
    public final float method790() {
        return this.field3893;
    }

    @OriginalMember(owner = "client!lg", name = "K", descriptor = "()Z", line = 709)
    public final boolean method1672() {
        return this.field3864;
    }

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "(I)V", line = 712)
    public final void method811(int arg0) {
        this.method770(0, 0, this.field3880, this.field3884, arg0, 0);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IFFFFF)V", line = 715)
    public final void method799(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field3908 = (int) (arg1 * 65535.0F);
        this.field3885 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field3881 = (int) (arg3 * 65535.0F / var7);
        this.field3895 = (int) (arg4 * 65535.0F / var7);
        this.field3869 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lqd;)V", line = 723)
    public final void method794(class297 arg0) {
    }

    @OriginalMember(owner = "client!lg", name = "A", descriptor = "()Z", line = 726)
    public final boolean method822() {
        return false;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(F)V", line = 729)
    public final void method791(float arg0) {
        this.field3879 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(IIII)V", line = 733)
    public final void method769(int arg0, int arg1, int arg2, int arg3) {
        this.field3897 = arg0;
        this.field3868 = arg1;
        this.field3872 = arg2;
        this.field3906 = arg3;
        this.method1670();
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)V", line = 740)
    public final void method786(int arg0) {
        if (this.field3878 != arg0) {
            this.field3878 = arg0;
            this.field3905 = new class207[this.field3878];
            for (int var2 = 0; var2 < this.field3878; ++var2) {
                this.field3905[var2] = new class207(this);
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "F", descriptor = "()V", line = 756)
    public final void method836() {
        this.field3887 = 0;
        this.field3899 = 0;
        this.field3901 = this.field3880;
        this.field3875 = this.field3884;
        this.method1670();
    }

    @OriginalMember(owner = "client!lg", name = "B", descriptor = "()Lgs;", line = 763)
    public final class33 method823() {
        return new class279();
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 768)
    public final void method818(Canvas arg0) {
        class157 var2 = (class157) this.field3862.method2310((byte) 84, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method536(false);
            class157 var3 = class258.method1606(1, arg0);
            this.field3862.method2317(-1, (long) arg0.hashCode(), var3);
            if (this.field3866 == arg0 && this.field3898 == null) {
                this.field3865 = var3;
                this.field3871 = var3.field2052;
                this.field3880 = var3.field2049;
                this.field3884 = var3.field2054;
                this.method1674();
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "([Lva;Lgs;[Lla;I)V", line = 788)
    public final void method812(class327[] arg0, class33 arg1, class299[] arg2, int arg3) {
        class177[] var5 = new class177[arg0.length];
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class177) arg0[var6];
            }
        }
        class177 var7 = class177.method1124(this, var5);
        var7.method1130(arg1, arg2 != null ? arg2[0] : null, (class191) null, arg3);
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(Z)V", line = 803)
    public final void method762(boolean arg0) {
    }

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "(I)[I", line = 807)
    public final int[] method1673(int arg0) {
        class5 var2 = this.field3888;
        class24 var3;
        synchronized (this.field3888) {
            var3 = (class24) this.field3888.method40(0, (long) arg0);
            if (var3 == null) {
                if (!super.field1695.method428(-14471, arg0)) {
                    return null;
                }
                class118 var5 = super.field1695.method432(arg0, true);
                int var6 = !var5.field1524 && !this.field3886 ? 128 : 64;
                var3 = new class24(arg0, var6, super.field1695.method429(arg0, var6, true, 0.7F, -2472, var6), var5.field1545);
                this.field3888.method36(-20960, var3, (long) arg0);
            }
        }
        var3.field408 = true;
        return var3.method211();
    }

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "()I", line = 827)
    public final int method778() {
        return 0;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lgs;)V", line = 830)
    public final void method837(class33 arg0) {
        this.field3907 = (class279) arg0;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Loi;)V", line = 832)
    public final void method783(class49 arg0) {
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lbv;)V", line = 836)
    public final void method800(class191 arg0) {
        class354 var2 = arg0.field2704.field7580;
        for (class354 var3 = var2.field5112; var2 != var3; var3 = var3.field5112) {
            class335 var4 = (class335) var3;
            int var5 = var4.field4863 >> 12;
            int var6 = var4.field4853 >> 12;
            int var7 = var4.field4857 >> 12;
            int var8 = (this.field3907.field3973 * var7 + this.field3907.field3975 * var5 + this.field3907.field3967 * var6 >> 15) + this.field3907.field3974;
            if (var8 >= this.field3904 && var8 <= this.field3902) {
                int var9 = ((this.field3907.field3977 * var7 + this.field3907.field3978 * var6 + this.field3907.field3971 * var5 >> 15) + this.field3907.field3972) * this.field3872 / var8 + this.field3897;
                int var10 = ((this.field3907.field3968 * var7 + this.field3907.field3976 * var5 + this.field3907.field3970 * var6 >> 15) + this.field3907.field3969) * this.field3906 / var8 + this.field3868;
                if (var9 >= this.field3887 && var9 <= this.field3901 && var10 >= this.field3899 && var10 <= this.field3875) {
                    if (var8 == 0) {
                        var8 = 1;
                    }
                    this.method1677(var4, var9, var10, (var4.field4856 >> 2) / var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(III[I)V", line = 873)
    public final void method796(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (this.field3907.field3973 * arg2 + this.field3907.field3975 * arg0 + this.field3907.field3967 * arg1 >> 15) + this.field3907.field3974;
        if (var5 >= this.field3904 && var5 <= this.field3900) {
            int var6 = ((this.field3907.field3977 * arg2 + this.field3907.field3978 * arg1 + this.field3907.field3971 * arg0 >> 15) + this.field3907.field3972) * this.field3872 / var5;
            int var7 = ((this.field3907.field3968 * arg2 + this.field3907.field3976 * arg0 + this.field3907.field3970 * arg1 >> 15) + this.field3907.field3969) * this.field3906 / var5;
            if (var6 >= this.field3892 && var6 <= this.field3894 && var7 >= this.field3891 && var7 <= this.field3873) {
                arg3[0] = var6 - this.field3892;
                arg3[1] = var7 - this.field3891;
                arg3[2] = var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lps;)V", line = 897)
    public class273(int arg0, Canvas arg1, class59 arg2) {
        this(arg0, arg2);
        this.method746(arg1);
        this.method734(arg1);
    }

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "(IIII)V", line = 903)
    public final void method808(int arg0, int arg1, int arg2, int arg3) {
        this.field3882 = this.field3890;
        this.field3903 = arg0;
        this.field3890 = arg1;
        this.field3889 = arg2;
        this.field3896 = true;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "()Z", line = 910)
    public final boolean method736() {
        return false;
    }

    @OriginalMember(owner = "client!lg", name = "E", descriptor = "()V", line = 912)
    public final void method832() {
    }

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "()Z", line = 915)
    public final boolean method761() {
        return false;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "([I)V", line = 918)
    public final void method785(int[] arg0) {
        arg0[0] = this.field3887;
        arg0[1] = this.field3899;
        arg0[2] = this.field3901;
        arg0[3] = this.field3875;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Loi;Loi;FLoi;)Loi;", line = 924)
    public final class49 method817(class49 arg0, class49 arg1, float arg2, class49 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "(IIII)V", line = 927)
    public final void method810(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field3880) {
            arg2 = this.field3880;
        }
        if (arg3 > this.field3884) {
            arg3 = this.field3884;
        }
        this.field3887 = arg0;
        this.field3901 = arg2;
        this.field3899 = arg1;
        this.field3875 = arg3;
        this.method1670();
    }

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "()V", line = 945)
    public final void method776() {
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "()V", line = 948)
    public final void method739() {
        this.field3888.method38((byte) -113);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIII[BII)V", line = 951)
    public final void method755(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field3880 * arg1 + arg0;
            int var15 = this.field3880 - arg2;
            if (arg1 + arg3 > this.field3875) {
                arg3 -= arg1 + arg3 - this.field3875;
            }
            if (arg1 < this.field3899) {
                int var16 = this.field3899 - arg1;
                arg3 -= var16;
                var14 += this.field3880 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field3901) {
                int var17 = arg0 + arg2 - this.field3901;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field3887) {
                int var18 = this.field3887 - arg0;
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
                            int var28 = this.field3871[var14];
                            this.field3871[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field3871[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field3871[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field3871[var14++] = arg5;
                        } else {
                            this.field3871[var14++] = arg4;
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

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II[[I[[IIII)Log;", line = 1126)
    public final class441 method753(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class240(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(FFF)V", line = 1128)
    public final void method764(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "()Z", line = 1131)
    public final boolean method751() {
        return false;
    }

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "(IIII)V", line = 1134)
    public final void method826(int arg0, int arg1, int arg2, int arg3) {
        this.field3903 = arg0;
        this.field3890 = arg1;
        this.field3889 = arg2;
    }

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "()V", line = 1139)
    public final void method743() {
        if (this.field3866 != null && this.field3865 != null) {
            try {
                Graphics var1 = this.field3866.getGraphics();
                this.field3865.method1004(var1, (byte) 118, 0, 0);
            } catch (Exception var2) {
                this.field3866.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!lg", name = "L", descriptor = "()V", line = 1157)
    private final void method1674() {
        for (int var1 = 0; var1 < this.field3878; ++var1) {
            this.field3905[var1].method1280(-17546);
        }
        this.method836();
    }

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "(I)V", line = 1165)
    public final void method813(int arg0) {
        this.field3905[arg0].method1281(Thread.currentThread(), 8191);
    }

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "(I)Z", line = 1168)
    public final boolean method1675(int arg0) {
        return this.field3886 || super.field1695.method432(arg0, true).field1524;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "([Lva;Lbv;Lgs;[Lla;I)V", line = 1175)
    public final void method745(class327[] arg0, class191 arg1, class33 arg2, class299[] arg3, int arg4) {
        class177[] var6 = new class177[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class177) arg0[var7];
            }
        }
        class177 var8 = class177.method1124(this, var6);
        var8.method1130(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 1191)
    public final void method746(Canvas arg0) {
        class157 var2 = (class157) this.field3862.method2310((byte) -80, (long) arg0.hashCode());
        if (var2 == null) {
            class157 var3 = class258.method1606(1, arg0);
            this.field3862.method2317(-1, (long) arg0.hashCode(), var3);
        }
    }

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "(IIIII)V", line = 1200)
    public final void method825(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field3899) {
            var6 = this.field3899;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field3875) {
            var7 = this.field3875;
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
                if (var64 < this.field3887) {
                    var64 = this.field3887;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field3901) {
                    var65 = this.field3901;
                }
                int var66 = this.field3880 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field3871[var66++] = arg3;
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
                if (var60 < this.field3887) {
                    var60 = this.field3887;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field3901 - 1) {
                    var61 = this.field3901 - 1;
                }
                int var62 = this.field3880 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field3871[var62++] = arg3;
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
                if (var28 < this.field3887) {
                    var28 = this.field3887;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field3901) {
                    var29 = this.field3901;
                }
                int var30 = this.field3880 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field3871[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field3871[var30++] = var15 + var33;
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
                if (var22 < this.field3887) {
                    var22 = this.field3887;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field3901 - 1) {
                    var23 = this.field3901 - 1;
                }
                int var24 = this.field3880 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field3871[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field3871[var24++] = var15 + var27;
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
                if (var47 < this.field3887) {
                    var47 = this.field3887;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field3901) {
                    var48 = this.field3901;
                }
                int var49 = this.field3880 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field3871[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field3871[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field3887) {
                    var39 = this.field3887;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field3901 - 1) {
                    var40 = this.field3901 - 1;
                }
                int var41 = this.field3880 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field3871[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field3871[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lpi;Z)Lqg;", line = 1487)
    public final class307 method804(class328 arg0, boolean arg1) {
        int[] var3 = arg0.field4782;
        byte[] var4 = arg0.field4778;
        int var5 = arg0.field4776;
        int var6 = arg0.field4780;
        class11 var11;
        if (arg1 && arg0.field4781 == null) {
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
            var11 = new class377(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field4781;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class215(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var21 = var5 * var19;
                    for (int var22 = 0; var22 < var5; ++var22) {
                        var14[var21 + var22] = var3[var4[var21 + var22] & 255];
                    }
                }
                new class215(this, var14, var5, var6);
                var11 = new class302(this, var14, var5, var6);
            }
        }
        var11.method91(arg0.field4779, arg0.field4784, arg0.field4777, arg0.field4783);
        return var11;
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 1589)
    public final void method772(Canvas arg0) {
        if (this.field3866 == arg0) {
            this.method734((Canvas) null);
        }
        class157 var2 = (class157) this.field3862.method2310((byte) 58, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method536(false);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIIIII)V", line = 1599)
    public final void method1676(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2 != 0 && arg3 != 0) {
            if (arg5 != 65535 && !super.field1695.method432(arg5, true).field1543) {
                if (this.field3909 != arg5) {
                    class307 var10 = (class307) this.field3874.method40(0, (long) arg5);
                    if (var10 == null) {
                        int[] var11 = this.method1679(arg5);
                        if (var11 == null) {
                            return;
                        }
                        int var12 = this.method1675(arg5) ? 64 : 128;
                        var10 = this.method784(var11, 0, var12, var12, var12);
                        this.field3874.method36(-20960, var10, (long) arg5);
                    }
                    this.field3909 = arg5;
                    this.field3910 = var10;
                }
                this.field3910.method86(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
            } else {
                this.method825(arg0, arg1, arg2, arg6, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)Lqd;", line = 1632)
    public final class297 method735(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!lg", name = "t", descriptor = "()I", line = 1638)
    public final int method788() {
        int var1 = this.field3876;
        this.field3876 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lmq;III)V", line = 1644)
    public final void method1677(class335 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0.field4862;
        int var6 = arg3 >> 1;
        if (var5 == -1) {
            this.method825(arg1, arg2, var6, arg0.field4852, 1);
        } else {
            if (this.field3909 != var5) {
                class307 var7 = (class307) this.field3874.method40(0, (long) var5);
                if (var7 == null) {
                    int[] var8 = this.method1679(var5);
                    if (var8 == null) {
                        return;
                    }
                    int var9 = this.method1675(var5) ? 64 : 128;
                    var7 = this.method784(var8, 0, var9, var9, var9);
                    this.field3874.method36(-20960, var7, (long) var5);
                }
                this.field3909 = var5;
                this.field3910 = var7;
            }
            if (this.field3910.method87() == 64) {
                arg3 <<= 1;
                var6 <<= 1;
            }
            this.field3910.method86(arg1 - var6, arg2 - var6, arg3, arg3, 0, arg0.field4852, 1);
        }
    }

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "(I)Z", line = 1687)
    public final boolean method1678(int arg0) {
        return super.field1695.method428(-14471, arg0);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIZ)Lqg;", line = 1692)
    public final class307 method780(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field3880 * arg1 + arg0;
        int var8 = this.field3880 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field3871[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class215(this, var6, arg2, arg3);
        } else {
            return new class302(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "(IIIIII)Z", line = 1725)
    public final boolean method820(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (this.field3907.field3973 * arg2 + this.field3907.field3975 * arg0 + this.field3907.field3967 * arg1 >> 15) + this.field3907.field3974;
        if (var7 < 1) {
            var7 = 1;
        }
        int var8 = (this.field3907.field3973 * arg5 + this.field3907.field3975 * arg3 + this.field3907.field3967 * arg4 >> 15) + this.field3907.field3974;
        if (var8 < 1) {
            var8 = 1;
        }
        if ((var7 >= this.field3904 || var8 >= this.field3904) && (var7 <= this.field3900 || var8 <= this.field3900)) {
            int var9 = ((this.field3907.field3977 * arg2 + this.field3907.field3978 * arg1 + this.field3907.field3971 * arg0 >> 15) + this.field3907.field3972) * this.field3872 / var7;
            int var10 = ((this.field3907.field3977 * arg5 + this.field3907.field3978 * arg4 + this.field3907.field3971 * arg3 >> 15) + this.field3907.field3972) * this.field3872 / var8;
            if (var9 < this.field3892 && var10 < this.field3892 || var9 > this.field3894 && var10 > this.field3894) {
                return false;
            } else {
                int var11 = ((this.field3907.field3968 * arg2 + this.field3907.field3976 * arg0 + this.field3907.field3970 * arg1 >> 15) + this.field3907.field3969) * this.field3906 / var7;
                int var12 = ((this.field3907.field3968 * arg5 + this.field3907.field3976 * arg3 + this.field3907.field3970 * arg4 >> 15) + this.field3907.field3969) * this.field3906 / var8;
                return (var11 >= this.field3891 || var12 >= this.field3891) && (var11 <= this.field3873 || var12 <= this.field3873);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lmo;[Lpi;Z)Lhr;", line = 1755)
    public final class348 method802(class507 arg0, class328[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field4776;
            var5[var7] = arg1[var7].field4780;
            if (arg1[var7].field4781 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            return new class316(this, arg0, arg1, var4, var5);
        } else if (var6) {
            return new class257(this, arg0, arg1, var4, var5);
        } else {
            return new class101(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(IIIII)V", line = 1784)
    public final void method793(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field3899 && arg1 < this.field3875) {
            if (arg0 < this.field3887) {
                arg2 -= this.field3887 - arg0;
                arg0 = this.field3887;
            }
            if (arg0 + arg2 > this.field3901) {
                arg2 = this.field3901 - arg0;
            }
            int var6 = this.field3880 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field3871[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field3871[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field3871[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field3871[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field3871[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "(I)[I", line = 1857)
    private final int[] method1679(int arg0) {
        class5 var2 = this.field3888;
        class24 var3;
        synchronized (this.field3888) {
            var3 = (class24) this.field3888.method40(0, (long) arg0);
            if (var3 == null) {
                if (!super.field1695.method428(-14471, arg0)) {
                    return null;
                }
                class118 var5 = super.field1695.method432(arg0, true);
                int var6 = !var5.field1524 && !this.field3886 ? 128 : 64;
                var3 = new class24(arg0, var6, super.field1695.method430(0.7F, var6, true, var6, (byte) -21, arg0), var5.field1545);
                this.field3888.method36(-20960, var3, (long) arg0);
            }
        }
        var3.field408 = true;
        return var3.method211();
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lva;Lbv;Lgs;Lla;I)V", line = 1877)
    public final void method787(class327 arg0, class191 arg1, class33 arg2, class299 arg3, int arg4) {
        ((class177) arg0).method1130(arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "()V", line = 1880)
    public final void method732() {
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I[Ldq;)V", line = 1882)
    public final void method766(int arg0, class472[] arg1) {
    }

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "()Z", line = 1886)
    public final boolean method774() {
        return false;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIII)V", line = 1891)
    public final void method782(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class207 var8 = this.method1671(Thread.currentThread());
        class421 var9 = var8.field2871;
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
            int var21 = arg0 - var9.method2502();
            int var22 = arg1 - var9.method2494();
            int var23 = var17 + var21;
            int var24 = var21 - var18;
            int var25 = var10 + var21 - var18;
            int var26 = var10 + var21 + var17;
            int var27 = var19 + var22;
            int var28 = var22 - var20;
            int var29 = var11 + var22 - var20;
            int var30 = var11 + var22 + var19;
            if (arg6 == 0) {
                var9.field6219 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field6219 = 255 - (arg4 >> 24);
            }
            var9.field6210 = var23 < 0 || var23 > var9.field6215 || var24 < 0 || var24 > var9.field6215 || var25 < 0 || var25 > var9.field6215;
            var9.method2491(var27, var28, var29, var23, var24, var25, arg4);
            var9.field6210 = var23 < 0 || var23 > var9.field6215 || var24 < 0 || var24 > var9.field6215 || var26 < 0 || var26 > var9.field6215;
            var9.method2491(var27, var29, var30, var23, var25, var26, arg4);
        }
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(IIII)V", line = 1960)
    public final void method779(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 1964)
    public final void method760(Rectangle[] arg0, int arg1) {
        if (this.field3866 != null && this.field3865 != null) {
            try {
                Graphics var3 = this.field3866.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field3880 && var5.y <= this.field3884 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field3865.method1001(var3, var5.x, (byte) -6, var5.y, var5.width, var5.height);
                    }
                }
            } catch (Exception var6) {
                this.field3866.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(II)I", line = 1993)
    public final int method819(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!lg", name = "z", descriptor = "()Z", line = 1997)
    public final boolean method816() {
        return true;
    }

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "(I)V", line = 1999)
    public final void method798(int arg0) {
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "([IIIII)Lqg;", line = 2005)
    public final class307 method784(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class215(this, arg0, arg1, arg2, arg3, arg4) : new class302(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class215(this, arg0, arg1, arg2, arg3, arg4) : new class302(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIII)V", line = 2040)
    public final void method740(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field3887 && arg0 < this.field3901) {
            if (arg1 < this.field3899) {
                arg2 -= this.field3899 - arg1;
                arg1 = this.field3899;
            }
            if (arg1 + arg2 > this.field3875) {
                arg2 = this.field3875 - arg1;
            }
            int var6 = this.field3880 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field3880 * var10 + var6;
                        int var12 = this.field3871[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field3871[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field3880 * var14 + var6;
                        int var16 = this.field3871[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field3871[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field3871[this.field3880 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIILfs;II)V", line = 2118)
    public final void method834(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class372 arg6, int arg7, int arg8) {
        class277 var10 = (class277) arg6;
        int[] var11 = var10.field3956;
        int[] var12 = var10.field3958;
        int var13 = this.field3899 > arg8 ? this.field3899 : arg8;
        int var14 = this.field3875 < var11.length + arg8 ? this.field3875 : var11.length + arg8;
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
            if (arg0 < this.field3887) {
                var18 += (this.field3887 - arg0) * var20;
                arg0 = this.field3887;
            }
            if (var21 >= this.field3901) {
                var21 = this.field3901 - 1;
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
                                int var28 = this.field3880 * var25 + arg0;
                                int var29 = this.field3871[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field3871[var28] = var23 + var30;
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
                                int var34 = this.field3880 * var31 + arg0;
                                int var35 = this.field3871[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field3871[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field3871[this.field3880 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field3887 && var64 < this.field3901 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field3871[this.field3880 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field3887 && var50 < this.field3901 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field3880 * arg1 + var50;
                        int var54 = this.field3871[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field3871[this.field3880 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field3887 && var56 < this.field3901 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field3880 * arg1 + var56;
                        int var60 = this.field3871[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field3871[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "()I", line = 2356)
    public final int method750() {
        return 0;
    }

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "()Z", line = 2359)
    public final boolean method749() {
        return false;
    }

    @OriginalMember(owner = "client!lg", name = "H", descriptor = "()Z", line = 2363)
    public final boolean method840() {
        return false;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILfs;II)V", line = 2369)
    public final void method771(int arg0, class372 arg1, int arg2, int arg3) {
        class277 var5 = (class277) arg1;
        int[] var6 = var5.field3956;
        int[] var7 = var5.field3958;
        int var8;
        if (this.field3875 < var6.length + arg3) {
            var8 = this.field3875 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field3899 > arg3) {
            var9 = this.field3899 - arg3;
            arg3 = this.field3899;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field3880 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field3887 > var12) {
                    var13 -= this.field3887 - var12;
                    var12 = this.field3887;
                }
                if (this.field3901 < var12 + var13) {
                    var13 = this.field3901 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field3871[var14++] = arg0;
                }
                var10 += this.field3880;
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lfl;IIII)Lva;", line = 2427)
    public final class327 method737(class499 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class177(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!lg", name = "y", descriptor = "()Z", line = 2433)
    public final boolean method815() {
        return false;
    }

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "()V", line = 2436)
    public final void method756() {
    }
}
