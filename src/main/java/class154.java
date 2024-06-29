import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class154 extends class312 {

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
    public int field2385 = 78642;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    public int field2387 = 0;

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "I")
    public int field2393 = 0;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "I")
    public int field2392 = 0;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
    private int field2386 = 0;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "I")
    public int field2390 = 0;

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "Z")
    private boolean field2402 = false;

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "I")
    public int field2397 = 0;

    @OriginalMember(owner = "client!kd", name = "W", descriptor = "I")
    public int field2411 = 512;

    @OriginalMember(owner = "client!kd", name = "V", descriptor = "I")
    public int field2410 = 75518;

    @OriginalMember(owner = "client!kd", name = "bb", descriptor = "Z")
    private boolean field2416 = false;

    @OriginalMember(owner = "client!kd", name = "Y", descriptor = "I")
    private int field2413 = 0;

    @OriginalMember(owner = "client!kd", name = "gb", descriptor = "I")
    public int field2421 = 0;

    @OriginalMember(owner = "client!kd", name = "ab", descriptor = "Z")
    public boolean field2415 = false;

    @OriginalMember(owner = "client!kd", name = "M", descriptor = "Z")
    private boolean field2401 = false;

    @OriginalMember(owner = "client!kd", name = "ib", descriptor = "I")
    public int field2423 = 3500;

    @OriginalMember(owner = "client!kd", name = "mb", descriptor = "I")
    private int field2427 = 0;

    @OriginalMember(owner = "client!kd", name = "nb", descriptor = "I")
    private int field2428 = 3500;

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "I")
    public int field2404 = 45823;

    @OriginalMember(owner = "client!kd", name = "kb", descriptor = "I")
    public int field2425 = 0;

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "I")
    public int field2394 = this.field2428 - 255;

    @OriginalMember(owner = "client!kd", name = "ob", descriptor = "I")
    public int field2429 = 50;

    @OriginalMember(owner = "client!kd", name = "hb", descriptor = "I")
    public int field2422 = 512;

    @OriginalMember(owner = "client!kd", name = "S", descriptor = "Lal;")
    private class52 field2407 = new class52(16);

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2389;

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "Lah;")
    public class215 field2395;

    @OriginalMember(owner = "client!kd", name = "Z", descriptor = "Lqi;")
    private class337 field2414;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "[I")
    public int[] field2384;

    @OriginalMember(owner = "client!kd", name = "lb", descriptor = "I")
    public int field2426;

    @OriginalMember(owner = "client!kd", name = "R", descriptor = "I")
    private int field2406;

    @OriginalMember(owner = "client!kd", name = "db", descriptor = "F")
    private float field2418;

    @OriginalMember(owner = "client!kd", name = "fb", descriptor = "F")
    private float field2420;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
    public int field2383;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
    public int field2388;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "I")
    public int field2391;

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "I")
    private int field2396;

    @OriginalMember(owner = "client!kd", name = "J", descriptor = "I")
    public int field2398;

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "I")
    public int field2399;

    @OriginalMember(owner = "client!kd", name = "L", descriptor = "I")
    public int field2400;

    @OriginalMember(owner = "client!kd", name = "T", descriptor = "I")
    public int field2408;

    @OriginalMember(owner = "client!kd", name = "U", descriptor = "I")
    public int field2409;

    @OriginalMember(owner = "client!kd", name = "X", descriptor = "I")
    public int field2412;

    @OriginalMember(owner = "client!kd", name = "jb", descriptor = "I")
    public int field2424;

    @OriginalMember(owner = "client!kd", name = "pb", descriptor = "Leo;")
    private class162 field2430;

    @OriginalMember(owner = "client!kd", name = "cb", descriptor = "Lek;")
    public class294 field2417;

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "Lal;")
    private class52 field2403;

    @OriginalMember(owner = "client!kd", name = "Q", descriptor = "Z")
    public boolean field2405;

    @OriginalMember(owner = "client!kd", name = "eb", descriptor = "[Luk;")
    private class141[] field2419;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(II)V")
    public final void method692(int arg0, int arg1) {
        this.field2387 = arg0 & 16777215;
        int var3 = this.field2387 >>> 16 & 255;
        if (var3 < 2) {
            var3 = 2;
        }
        int var4 = this.field2387 >> 8 & 255;
        if (var4 < 2) {
            var4 = 2;
        }
        int var5 = this.field2387 & 255;
        if (var5 < 2) {
            var5 = 2;
        }
        this.field2387 = var3 << 16 | var4 << 8 | var5;
        if (arg1 < 0) {
            this.field2405 = false;
        } else {
            this.field2405 = true;
        }
    }

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "()V")
    public final void method718() {
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method617(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class141 var11 = this.method1085(Thread.currentThread());
        class25 var12 = var11.field2193;
        var12.field300 = false;
        int var13 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var13 == 255) {
            var12.field300 = false;
            var12.field294 = 0;
            var12.field291 = true;
            var12.method171(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else {
            if (arg9 != 1) {
                if (arg9 == 2) {
                    throw new IllegalStateException();
                }
                throw new IllegalArgumentException();
            }
            var12.field300 = false;
            var12.field294 = 255 - var13;
            var12.field291 = true;
            var12.method171(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        }
        var12.field300 = true;
    }

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "()Z")
    public final boolean method648() {
        return false;
    }

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "()V")
    public final void method661() {
    }

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "()I")
    public final int method690() {
        return this.field2429;
    }

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "()V")
    public final void method558() {
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(IIII)V")
    public final void method682(int arg0, int arg1, int arg2, int arg3) {
        if (this.field2421 < arg0) {
            this.field2421 = arg0;
        }
        if (this.field2392 < arg1) {
            this.field2392 = arg1;
        }
        if (this.field2425 > arg2) {
            this.field2425 = arg2;
        }
        if (this.field2390 > arg3) {
            this.field2390 = arg3;
        }
        this.method1079();
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
    public final void method674(int arg0) {
        this.field2419[arg0].method1029(Thread.currentThread(), (byte) 122);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "()V")
    private final void method1077() {
        if (this.field2418 != 0.0F) {
            float var1 = (float) this.field2428;
            float var2 = (float) this.field2429;
            float var3 = -(var2 * 2.0F * var1) / (var1 - var2);
            float var4 = this.field2420 / (this.field2420 + this.field2418);
            float var5 = var4 * var4;
            float var6 = (1.0F - var4) * -var3 * (1.0F - var4) / this.field2418;
            this.field2423 = (int) (((float) this.field2428 - var3 * var5) / ((var1 + var2) / (var1 - var2) - var6) + 0.5F);
        } else {
            this.field2423 = this.field2428;
        }
    }

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "()Z")
    public final boolean method634() {
        return false;
    }

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "()F")
    public final float method629() {
        return this.field2418;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lg;IIII)Lid;")
    public final class348 method639(class86 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class122(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIII)V")
    public final void method560(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field2421 && arg0 < this.field2425) {
            if (arg1 < this.field2392) {
                arg2 -= this.field2392 - arg1;
                arg1 = this.field2392;
            }
            if (arg1 + arg2 > this.field2390) {
                arg2 = this.field2390 - arg1;
            }
            int var6 = this.field2426 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field2426 * var10 + var6;
                        int var12 = this.field2384[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field2384[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field2426 * var14 + var6;
                        int var16 = this.field2384[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field2384[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field2384[this.field2426 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "()V")
    public final void method715() {
        if (this.field2401) {
            class436.method2683(true, false, false);
            this.field2401 = false;
        }
        this.field2389 = null;
        this.field2395 = null;
        this.field2414 = null;
        this.field2416 = true;
    }

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "()V")
    public final void method591() {
        if (this.field2389 != null && this.field2414 != null) {
            try {
                Graphics var1 = this.field2389.getGraphics();
                this.field2414.method142(-4163, 0, var1, 0);
            } catch (Exception var2) {
                this.field2389.repaint();
            }
        } else {
            throw new IllegalStateException("Can't flip an offscreen toolkit");
        }
    }

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "()I")
    public final int method606() {
        return 0;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(IIII)V")
    public final void method671(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field2426) {
            arg2 = this.field2426;
        }
        if (arg3 > this.field2406) {
            arg3 = this.field2406;
        }
        this.field2421 = arg0;
        this.field2425 = arg2;
        this.field2392 = arg1;
        this.field2390 = arg3;
        this.method1079();
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(FF)V")
    public final void method619(float arg0, float arg1) {
        this.field2420 = arg0;
        this.field2418 = arg1;
        this.method1077();
    }

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "()F")
    public final float method583() {
        return this.field2420;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lpg;)V")
    public final void method693(class435 arg0) {
        this.field2417 = (class294) arg0;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(FFF)V")
    public final void method655(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "()Z")
    public final boolean method568() {
        return true;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method665(Rectangle[] arg0, int arg1) {
        if (this.field2389 != null && this.field2414 != null) {
            try {
                Graphics var3 = this.field2389.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field2426 && var5.y <= this.field2406 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field2414.method141(32, var5.width, var5.x, var5.height, var5.y, var3);
                    }
                }
            } catch (Exception var6) {
                this.field2389.repaint();
            }
        } else {
            throw new IllegalStateException("Can't flip an offscreen toolkit");
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIII)[I")
    public final int[] method675(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field2426 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field2384[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "()Z")
    public final boolean method615() {
        return true;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IFFFFF)V")
    public final void method683(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field2404 = (int) (arg1 * 65535.0F);
        this.field2385 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field2383 = (int) (arg3 * 65535.0F / var7);
        this.field2398 = (int) (arg4 * 65535.0F / var7);
        this.field2424 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([Lid;Lpg;[Lcd;I)V")
    public final void method668(class348[] arg0, class435 arg1, class170[] arg2, int arg3) {
        class122[] var5 = new class122[arg0.length];
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class122) arg0[var6];
            }
        }
        class122 var7 = class122.method889(this, var5);
        var7.method880(arg1, arg2 != null ? arg2[0] : null, (class198) null, arg3);
    }

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "(I)[I")
    public final int[] method1078(int arg0) {
        class52 var2 = this.field2403;
        class310 var3;
        synchronized (this.field2403) {
            var3 = (class310) this.field2403.method331((byte) 69, (long) arg0);
            if (var3 == null) {
                if (!this.field2395.method985(arg0, (byte) -16)) {
                    return null;
                }
                class266 var5 = this.field2395.method989(arg0, (byte) 81);
                int var6 = !var5.field4282 && !this.field2402 ? 128 : 64;
                var3 = new class310(arg0, var6, this.field2395.method983(arg0, 0.7F, var6, true, -28113, var6), var5.field4277);
                this.field2403.method341(111, (long) arg0, var3);
            }
        }
        var3.field4898 = true;
        return var3.method2078();
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIII)V")
    public final void method630(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class141 var8 = this.method1085(Thread.currentThread());
        class25 var9 = var8.field2193;
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
            int var21 = arg0 - var9.method172();
            int var22 = arg1 - var9.method163();
            int var23 = var17 + var21;
            int var24 = var21 - var18;
            int var25 = var10 + var21 - var18;
            int var26 = var10 + var21 + var17;
            int var27 = var19 + var22;
            int var28 = var22 - var20;
            int var29 = var11 + var22 - var20;
            int var30 = var11 + var22 + var19;
            if (arg6 == 0) {
                var9.field294 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field294 = 255 - (arg4 >> 24);
            }
            var9.field291 = var23 < 0 || var23 > var9.field293 || var24 < 0 || var24 > var9.field293 || var25 < 0 || var25 > var9.field293;
            var9.method176(var27, var28, var29, var23, var24, var25, arg4);
            var9.field291 = var23 < 0 || var23 > var9.field293 || var24 < 0 || var24 > var9.field293 || var26 < 0 || var26 > var9.field293;
            var9.method176(var27, var29, var30, var23, var25, var26, arg4);
        }
    }

    @OriginalMember(owner = "client!kd", name = "J", descriptor = "()Z")
    public final boolean method616() {
        return false;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([Lid;Ljp;Lpg;[Lcd;I)V")
    public final void method687(class348[] arg0, class198 arg1, class435 arg2, class170[] arg3, int arg4) {
        class122[] var6 = new class122[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class122) arg0[var7];
            }
        }
        class122 var8 = class122.method889(this, var6);
        var8.method880(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "()I")
    public final int method618() {
        int var1 = this.field2413;
        this.field2413 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III[I)V")
    public final void method573(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (this.field2417.field4701 * arg2 + this.field2417.field4707 * arg0 + this.field2417.field4704 * arg1 >> 15) + this.field2417.field4700;
        if (var5 >= this.field2429 && var5 <= this.field2428) {
            int var6 = ((this.field2417.field4699 * arg2 + this.field2417.field4709 * arg1 + this.field2417.field4705 * arg0 >> 15) + this.field2417.field4703) * this.field2422 / var5;
            int var7 = ((this.field2417.field4702 * arg2 + this.field2417.field4706 * arg0 + this.field2417.field4698 * arg1 >> 15) + this.field2417.field4708) * this.field2411 / var5;
            if (var6 >= this.field2400 && var6 <= this.field2391 && var7 >= this.field2412 && var7 <= this.field2408) {
                arg3[0] = var6 - this.field2400;
                arg3[1] = var7 - this.field2412;
                arg3[2] = var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(Z)V")
    public final void method571(boolean arg0) {
    }

    @OriginalMember(owner = "client!kd", name = "L", descriptor = "()Z")
    public final boolean method565() {
        return false;
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "()Z")
    public final boolean method621() {
        return true;
    }

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "(IIIIII)V")
    public final void method651(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method684(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method684(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method560(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method560(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field2421) {
                    var10 += (this.field2421 - arg0) * var12;
                    arg0 = this.field2421;
                }
                if (var13 >= this.field2425) {
                    var13 = this.field2425 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field2392 && var17 < this.field2390) {
                                int var18 = this.field2426 * var17 + arg0;
                                int var19 = this.field2384[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field2384[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field2392 && var21 < this.field2390) {
                                int var22 = this.field2426 * var21 + arg0;
                                int var23 = this.field2384[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field2384[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field2392 && var27 < this.field2390) {
                            this.field2384[this.field2426 * var27 + arg0] = arg4;
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
                if (arg1 < this.field2392) {
                    var29 += (this.field2392 - arg1) * var31;
                    arg1 = this.field2392;
                }
                if (var32 >= this.field2390) {
                    var32 = this.field2390 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field2421 && var46 < this.field2425) {
                            this.field2384[this.field2426 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field2421 && var36 < this.field2425) {
                            int var37 = this.field2426 * arg1 + var36;
                            int var38 = this.field2384[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field2384[this.field2426 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field2421 && var40 < this.field2425) {
                            int var41 = this.field2426 * arg1 + var40;
                            int var42 = this.field2384[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field2384[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "()V")
    private final void method1079() {
        this.field2400 = this.field2421 - this.field2388;
        this.field2391 = this.field2425 - this.field2388;
        this.field2412 = this.field2392 - this.field2409;
        this.field2408 = this.field2390 - this.field2409;
        for (int var1 = 0; var1 < this.field2399; ++var1) {
            class25 var5 = this.field2419[var1].field2193;
            var5.field301 = this.field2388 - this.field2421;
            var5.field296 = this.field2409 - this.field2392;
            var5.field293 = this.field2425 - this.field2421;
            var5.field297 = this.field2390 - this.field2392;
        }
        int var2 = this.field2426 * this.field2392 + this.field2421;
        for (int var3 = this.field2392; var3 < this.field2390; ++var3) {
            for (int var4 = 0; var4 < this.field2399; ++var4) {
                this.field2419[var4].field2193.field292[var3 - this.field2392] = var2;
            }
            var2 += this.field2426;
        }
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(IIIIII)V")
    public final void method563(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field2421) {
            arg2 -= this.field2421 - arg0;
            arg0 = this.field2421;
        }
        if (arg1 < this.field2392) {
            arg3 -= this.field2392 - arg1;
            arg1 = this.field2392;
        }
        if (arg0 + arg2 > this.field2425) {
            arg2 = this.field2425 - arg0;
        }
        if (arg1 + arg3 > this.field2390) {
            arg3 = this.field2390 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field2425 && arg1 <= this.field2390) {
            int var7 = this.field2426 - arg2;
            int var8 = this.field2426 * arg1 + arg0;
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
                            this.field2384[var24] = arg4;
                            ++var24;
                            this.field2384[var24] = arg4;
                            ++var24;
                            this.field2384[var24] = arg4;
                            ++var24;
                            this.field2384[var24] = arg4;
                            ++var24;
                            this.field2384[var24] = arg4;
                            ++var24;
                            this.field2384[var24] = arg4;
                            ++var24;
                            this.field2384[var24] = arg4;
                            ++var24;
                            this.field2384[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field2384[var24] = arg4;
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
                        int var14 = this.field2384[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + ((var14 & 65280) * var11 >> 8 & 65280);
                        this.field2384[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field2384[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field2384[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "()Z")
    public final boolean method711() {
        return false;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([I)V")
    public final void method654(int[] arg0) {
        arg0[0] = this.field2421;
        arg0[1] = this.field2392;
        arg0[2] = this.field2425;
        arg0[3] = this.field2390;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lvp;Z)Lgl;")
    public final class356 method641(class100 arg0, boolean arg1) {
        int[] var3 = arg0.field1396;
        byte[] var4 = arg0.field1400;
        int var5 = arg0.field1401;
        int var6 = arg0.field1399;
        class384 var11;
        if (arg1 && arg0.field1404 == null) {
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
            var11 = new class87(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field1404;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class399(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var21 = var5 * var19;
                    for (int var22 = 0; var22 < var5; ++var22) {
                        var14[var21 + var22] = var3[var4[var21 + var22] & 255];
                    }
                }
                new class399(this, var14, var5, var6);
                var11 = new class65(this, var14, var5, var6);
            }
        }
        var11.method2321(arg0.field1398, arg0.field1402, arg0.field1403, arg0.field1397);
        return var11;
    }

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "()Z")
    public final boolean method676() {
        return false;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "()Z")
    public final boolean method1080() {
        return this.field2416;
    }

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "(IIIIII)V")
    public final void method647(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method684(arg0, arg1, arg2, arg4, arg5);
        this.method684(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method560(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method560(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "()V")
    public final void method609() {
        this.field2421 = 0;
        this.field2392 = 0;
        this.field2425 = this.field2426;
        this.field2390 = this.field2406;
        this.method1079();
    }

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "()V")
    public final void method566() {
        this.field2414 = class264.method1810((byte) 100, this.field2389);
        this.field2384 = this.field2414.field5229;
        this.field2426 = this.field2414.field5230;
        this.field2406 = this.field2414.field5233;
        for (int var1 = 0; var1 < this.field2399; ++var1) {
            this.field2419[var1].method1027((byte) 81);
        }
        this.method609();
    }

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "()Lpg;")
    public final class435 method713() {
        class141 var1 = this.method1085(Thread.currentThread());
        return var1.field2183;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lka;)V")
    public final void method578(class275 arg0) {
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(IIIII)V")
    public final void method631(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field2392) {
            var6 = this.field2392;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field2390) {
            var7 = this.field2390;
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
                if (var64 < this.field2421) {
                    var64 = this.field2421;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field2425) {
                    var65 = this.field2425;
                }
                int var66 = this.field2426 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field2384[var66++] = arg3;
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
                if (var60 < this.field2421) {
                    var60 = this.field2421;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field2425 - 1) {
                    var61 = this.field2425 - 1;
                }
                int var62 = this.field2426 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field2384[var62++] = arg3;
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
                if (var28 < this.field2421) {
                    var28 = this.field2421;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field2425) {
                    var29 = this.field2425;
                }
                int var30 = this.field2426 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field2384[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field2384[var30++] = var15 + var33;
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
                if (var22 < this.field2421) {
                    var22 = this.field2421;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field2425 - 1) {
                    var23 = this.field2425 - 1;
                }
                int var24 = this.field2426 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field2384[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field2384[var24++] = var15 + var27;
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
                if (var47 < this.field2421) {
                    var47 = this.field2421;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field2425) {
                    var48 = this.field2425;
                }
                int var49 = this.field2426 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field2384[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field2384[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field2421) {
                    var39 = this.field2421;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field2425 - 1) {
                    var40 = this.field2425 - 1;
                }
                int var41 = this.field2426 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field2384[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field2384[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "()Z")
    public final boolean method594() {
        return false;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILq;II)V")
    public final void method632(int arg0, class245 arg1, int arg2, int arg3) {
        class111 var5 = (class111) arg1;
        int[] var6 = var5.field1539;
        int[] var7 = var5.field1538;
        int var8;
        if (this.field2390 < var6.length + arg3) {
            var8 = this.field2390 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field2392 > arg3) {
            var9 = this.field2392 - arg3;
            arg3 = this.field2392;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field2426 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field2421 > var12) {
                    var13 -= this.field2421 - var12;
                    var12 = this.field2421;
                }
                if (this.field2425 < var12 + var13) {
                    var13 = this.field2425 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field2384[var14++] = arg0;
                }
                var10 += this.field2426;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "(I)V")
    public final void method636(int arg0) {
        if (this.field2399 != arg0) {
            this.field2399 = arg0;
            this.field2419 = new class141[this.field2399];
            for (int var2 = 0; var2 < this.field2399; ++var2) {
                this.field2419[var2] = new class141(this);
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "(I)Z")
    public final boolean method1081(int arg0) {
        return this.field2395.method989(arg0, (byte) 58).field4267;
    }

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "(I)I")
    public final int method1082(int arg0) {
        return this.field2395.method989(arg0, (byte) 33).field4284 & 65535;
    }

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "()I")
    public final int method702() {
        return this.field2428;
    }

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "(I)Z")
    public final boolean method1083(int arg0) {
        return this.field2402 || this.field2395.method989(arg0, (byte) 39).field4282;
    }

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "()Z")
    public final boolean method710() {
        return false;
    }

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "()I")
    public final int method625() {
        return 0;
    }

    @OriginalMember(owner = "client!kd", name = "M", descriptor = "()V")
    private final void method1084() {
        this.field2403 = new class52(20);
        this.field2417 = new class294();
        class213.method1498(0, false, true);
        this.field2401 = true;
        this.method636(1);
        this.method674(0);
        this.method609();
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)V")
    public final void method575(int arg0, int arg1, int arg2) {
        this.field2386 = this.field2387;
        this.field2397 = arg0;
        this.field2387 = arg1;
        this.field2393 = arg2;
        this.field2415 = true;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIILq;II)V")
    public final void method602(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class245 arg6, int arg7, int arg8) {
        class111 var10 = (class111) arg6;
        int[] var11 = var10.field1539;
        int[] var12 = var10.field1538;
        int var13 = this.field2392 > arg8 ? this.field2392 : arg8;
        int var14 = this.field2390 < var11.length + arg8 ? this.field2390 : var11.length + arg8;
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
            if (arg0 < this.field2421) {
                var18 += (this.field2421 - arg0) * var20;
                arg0 = this.field2421;
            }
            if (var21 >= this.field2425) {
                var21 = this.field2425 - 1;
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
                                int var28 = this.field2426 * var25 + arg0;
                                int var29 = this.field2384[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field2384[var28] = var23 + var30;
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
                                int var34 = this.field2426 * var31 + arg0;
                                int var35 = this.field2384[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field2384[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field2384[this.field2426 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field2421 && var64 < this.field2425 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field2384[this.field2426 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field2421 && var50 < this.field2425 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field2426 * arg1 + var50;
                        int var54 = this.field2384[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field2384[this.field2426 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field2421 && var56 < this.field2425 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field2426 * arg1 + var56;
                        int var60 = this.field2384[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field2384[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lma;Lma;FLma;)Lma;")
    public final class8 method689(class8 arg0, class8 arg1, float arg2, class8 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lid;Ljp;Lpg;Lcd;I)V")
    public final void method561(class348 arg0, class198 arg1, class435 arg2, class170 arg3, int arg4) {
        ((class122) arg0).method880(arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(IIIIII)Lma;")
    public final class8 method601(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)V")
    public final void method582(int arg0, int arg1) {
        this.field2429 = arg0;
        this.field2428 = arg1;
        this.field2394 = this.field2428 - 255;
        this.method1077();
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lgh;[Lvp;Z)Lmp;")
    public final class452 method612(class325 arg0, class100[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field1401;
            var5[var7] = arg1[var7].field1399;
            if (arg1[var7].field1404 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            return new class242(this, arg0, arg1, var4, var5);
        } else if (var6) {
            return new class442(this, arg0, arg1, var4, var5);
        } else {
            return new class260(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public final void method635(int arg0) {
        this.method563(0, 0, this.field2426, this.field2406, arg0, 0);
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "()V")
    public final void method626() {
        this.field2403.method335((byte) 92);
    }

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "()I")
    public final int method643() {
        int var1 = this.field2427;
        this.field2427 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(III)V")
    public final void method659(int arg0, int arg1, int arg2) {
        this.field2397 = arg0;
        this.field2387 = arg1;
        this.field2393 = arg2;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/lang/Runnable;)Luk;")
    public final class141 method1085(Runnable arg0) {
        for (int var2 = 0; var2 < this.field2399; ++var2) {
            if (this.field2419[var2].field2192 == arg0) {
                return this.field2419[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)I")
    public final int method720(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([IIIII)Lgl;")
    public final class356 method703(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class399(this, arg0, arg1, arg2, arg3, arg4) : new class65(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class399(this, arg0, arg1, arg2, arg3, arg4) : new class65(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(II)I")
    public final int method579(int arg0, int arg1) {
        int var3 = arg0 | 66560;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "()V")
    public final void method590() {
    }

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "()Z")
    public final boolean method706() {
        return false;
    }

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "(I)Z")
    public final boolean method1086(int arg0) {
        return this.field2395.method985(arg0, (byte) -16);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II[[I[[IIII)Llf;")
    public final class129 method623(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class103(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method585(Canvas arg0) {
        this.field2389 = arg0;
        this.method566();
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
    public final void method567(int arg0) {
        int var2 = arg0 - this.field2396;
        for (Object var3 = this.field2403.method334(1); var3 != null; var3 = this.field2403.method332((byte) 93)) {
            class310 var4 = (class310) var3;
            if (var4.field4898) {
                var4.field4897 += var2;
                int var5 = var4.field4897 / 20;
                if (var5 > 0) {
                    class266 var6 = this.field2395.method989(var4.field4896, (byte) 49);
                    var4.method2076(var6.field4268 * var2 * 50 / 1000, var6.field4283 * var2 * 50 / 1000);
                    var4.field4897 -= var5 * 20;
                }
                var4.field4898 = false;
            }
        }
        this.field2396 = arg0;
        this.field2407.method337(5, (byte) -113);
    }

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "(I)[I")
    private final int[] method1087(int arg0) {
        class52 var2 = this.field2403;
        class310 var3;
        synchronized (this.field2403) {
            var3 = (class310) this.field2403.method331((byte) 69, (long) arg0);
            if (var3 == null) {
                if (!this.field2395.method985(arg0, (byte) -16)) {
                    return null;
                }
                class266 var5 = this.field2395.method989(arg0, (byte) 114);
                int var6 = !var5.field4282 && !this.field2402 ? 128 : 64;
                var3 = new class310(arg0, var6, this.field2395.method984(arg0, var6, true, false, 0.7F, var6), var5.field4277);
                this.field2403.method341(104, (long) arg0, var3);
            }
        }
        var3.field4898 = true;
        return var3.method2078();
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(F)V")
    public final void method714(float arg0) {
        this.field2410 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIII[BII)V")
    public final void method705(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field2426 * arg1 + arg0;
            int var15 = this.field2426 - arg2;
            if (arg1 + arg3 > this.field2390) {
                arg3 -= arg1 + arg3 - this.field2390;
            }
            if (arg1 < this.field2392) {
                int var16 = this.field2392 - arg1;
                arg3 -= var16;
                var14 += this.field2426 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field2425) {
                int var17 = arg0 + arg2 - this.field2425;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field2421) {
                int var18 = this.field2421 - arg0;
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
                            int var28 = this.field2384[var14];
                            this.field2384[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field2384[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field2384[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field2384[var14++] = arg5;
                        } else {
                            this.field2384[var14++] = arg4;
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

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljp;)V")
    public final void method624(class198 arg0) {
        class135 var2 = arg0.field3189.field5150;
        for (class135 var3 = var2.field2114; var2 != var3; var3 = var3.field2114) {
            class281 var4 = (class281) var3;
            int var5 = var4.field4506 >> 12;
            int var6 = var4.field4503 >> 12;
            int var7 = var4.field4494 >> 12;
            int var8 = (this.field2417.field4701 * var7 + this.field2417.field4707 * var5 + this.field2417.field4704 * var6 >> 15) + this.field2417.field4700;
            if (var8 >= this.field2429 && var8 <= this.field2428) {
                int var9 = ((this.field2417.field4699 * var7 + this.field2417.field4709 * var6 + this.field2417.field4705 * var5 >> 15) + this.field2417.field4703) * this.field2422 / var8 + this.field2388;
                int var10 = ((this.field2417.field4702 * var7 + this.field2417.field4706 * var5 + this.field2417.field4698 * var6 >> 15) + this.field2417.field4708) * this.field2411 / var8 + this.field2409;
                if (var9 >= this.field2421 && var9 <= this.field2425 && var10 >= this.field2392 && var10 <= this.field2390) {
                    if (var8 == 0) {
                        var8 = 1;
                    }
                    this.method1088(var4, var9, var10, (var4.field4505 >> 2) / var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Laa;III)V")
    public final void method1088(class281 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 >> 1;
        int var6 = arg0.field4495;
        if (var6 == -1) {
            this.method631(arg1, arg2, var5, arg0.field4496, 1);
        } else {
            if (this.field2430 == null || (long) var6 != this.field2430.field2539) {
                this.field2430 = (class162) this.field2407.method331((byte) 69, (long) var6);
            }
            if (this.field2430 == null) {
                int[] var7 = this.method1087(var6);
                if (var7 == null) {
                    return;
                }
                this.field2430 = new class162();
                this.field2430.field2550 = this.method1083(var6);
                int var8 = this.field2430.field2550 ? 64 : 128;
                this.field2430.field2545 = this.method703(var7, 0, var8, var8, var8);
                this.field2407.method341(77, (long) var6, this.field2430);
            }
            if (this.field2430.field2550) {
                var5 <<= 1;
                arg3 <<= 1;
            }
            this.field2430.field2545.method420(arg1 - var5, arg2 - var5, arg3, arg3, 1, arg0.field4496, 1);
        }
    }

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "()V")
    public final void method673() {
        this.field2387 = this.field2386;
        this.field2415 = false;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(Z)V")
    public final void method596(boolean arg0) {
        this.field2402 = arg0;
        this.field2403.method335((byte) -111);
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(IIIII)V")
    public final void method684(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field2392 && arg1 < this.field2390) {
            if (arg0 < this.field2421) {
                arg2 -= this.field2421 - arg0;
                arg0 = this.field2421;
            }
            if (arg0 + arg2 > this.field2425) {
                arg2 = this.field2425 - arg0;
            }
            int var6 = this.field2426 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field2384[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field2384[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field2384[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field2384[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field2384[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)V")
    public final void method652(boolean arg0) {
    }

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "()Z")
    public final boolean method581() {
        return false;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I[Lej;)V")
    public final void method613(int arg0, class62[] arg1) {
    }

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "()Z")
    public final boolean method657() {
        return false;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIZ)Lgl;")
    public final class356 method686(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field2426 * arg1 + arg0;
        int var8 = this.field2426 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field2384[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class399(this, var6, arg2, arg3);
        } else {
            return new class65(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II[I[I)Lq;")
    public final class245 method597(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class111(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)V")
    public final void method637(int arg0) {
        this.field2419[arg0].method1029((Runnable) null, (byte) 127);
    }

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "()Lpg;")
    public final class435 method704() {
        return new class294();
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(IIII)V")
    public final void method642(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)Lka;")
    public final class275 method696(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(IIII)V")
    public final void method589(int arg0, int arg1, int arg2, int arg3) {
        this.field2388 = arg0;
        this.field2409 = arg1;
        this.field2422 = arg2;
        this.field2411 = arg3;
        this.method1079();
    }

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "()Z")
    public final boolean method660() {
        return true;
    }

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "(IIIIII)Z")
    public final boolean method708(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (this.field2417.field4701 * arg2 + this.field2417.field4707 * arg0 + this.field2417.field4704 * arg1 >> 15) + this.field2417.field4700;
        if (var7 < 1) {
            var7 = 1;
        }
        int var8 = (this.field2417.field4701 * arg5 + this.field2417.field4707 * arg3 + this.field2417.field4704 * arg4 >> 15) + this.field2417.field4700;
        if (var8 < 1) {
            var8 = 1;
        }
        if ((var7 >= this.field2429 || var8 >= this.field2429) && (var7 <= this.field2428 || var8 <= this.field2428)) {
            int var9 = ((this.field2417.field4699 * arg2 + this.field2417.field4709 * arg1 + this.field2417.field4705 * arg0 >> 15) + this.field2417.field4703) * this.field2422 / var7;
            int var10 = ((this.field2417.field4699 * arg5 + this.field2417.field4709 * arg4 + this.field2417.field4705 * arg3 >> 15) + this.field2417.field4703) * this.field2422 / var8;
            if (var9 < this.field2400 && var10 < this.field2400 || var9 > this.field2391 && var10 > this.field2391) {
                return false;
            } else {
                int var11 = ((this.field2417.field4702 * arg2 + this.field2417.field4706 * arg0 + this.field2417.field4698 * arg1 >> 15) + this.field2417.field4708) * this.field2411 / var7;
                int var12 = ((this.field2417.field4702 * arg5 + this.field2417.field4706 * arg3 + this.field2417.field4698 * arg4 >> 15) + this.field2417.field4708) * this.field2411 / var8;
                return (var11 >= this.field2412 || var12 >= this.field2412) && (var11 <= this.field2408 || var12 <= this.field2408);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lma;)V")
    public final void method694(class8 arg0) {
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lah;I)V")
    public class154(Canvas arg0, class215 arg1, int arg2) {
        this.field2389 = arg0;
        this.field2395 = arg1;
        super.field4911 = arg2;
        this.field2414 = class264.method1810((byte) 107, this.field2389);
        this.field2384 = this.field2414.field5229;
        this.field2426 = this.field2414.field5230;
        this.field2406 = this.field2414.field5233;
        this.method1084();
    }
}
