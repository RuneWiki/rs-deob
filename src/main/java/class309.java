import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public abstract class class309 extends class167 {

    @OriginalMember(owner = "client!vda", name = "v", descriptor = "Z")
    private boolean field4472;

    @OriginalMember(owner = "client!vda", name = "w", descriptor = "Z")
    private boolean field4473;

    @OriginalMember(owner = "client!vda", name = "x", descriptor = "Lcb;")
    public class78 field4474;

    @OriginalMember(owner = "client!vda", name = "G", descriptor = "I")
    public int field4483;

    @OriginalMember(owner = "client!vda", name = "H", descriptor = "I")
    public int field4484;

    @OriginalMember(owner = "client!vda", name = "z", descriptor = "I")
    public int field4476;

    @OriginalMember(owner = "client!vda", name = "J", descriptor = "I")
    public int field4486;

    @OriginalMember(owner = "client!vda", name = "N", descriptor = "I")
    public int field4490;

    @OriginalMember(owner = "client!vda", name = "Q", descriptor = "Z")
    public boolean field4493;

    @OriginalMember(owner = "client!vda", name = "D", descriptor = "I")
    private int field4480;

    @OriginalMember(owner = "client!vda", name = "P", descriptor = "I")
    public int field4492;

    @OriginalMember(owner = "client!vda", name = "X", descriptor = "I")
    public int field4500;

    @OriginalMember(owner = "client!vda", name = "K", descriptor = "Z")
    private boolean field4487;

    @OriginalMember(owner = "client!vda", name = "O", descriptor = "I")
    private int field4491;

    @OriginalMember(owner = "client!vda", name = "Y", descriptor = "I")
    public int field4501;

    @OriginalMember(owner = "client!vda", name = "cb", descriptor = "I")
    public int field4505;

    @OriginalMember(owner = "client!vda", name = "A", descriptor = "I")
    public int field4477;

    @OriginalMember(owner = "client!vda", name = "db", descriptor = "I")
    public int field4506;

    @OriginalMember(owner = "client!vda", name = "ab", descriptor = "I")
    private int field4503;

    @OriginalMember(owner = "client!vda", name = "I", descriptor = "I")
    public int field4485;

    @OriginalMember(owner = "client!vda", name = "T", descriptor = "I")
    public int field4496;

    @OriginalMember(owner = "client!vda", name = "jb", descriptor = "I")
    public int field4512;

    @OriginalMember(owner = "client!vda", name = "F", descriptor = "I")
    public int field4482;

    @OriginalMember(owner = "client!vda", name = "S", descriptor = "I")
    private int field4495;

    @OriginalMember(owner = "client!vda", name = "L", descriptor = "Luaa;")
    private class395 field4488;

    @OriginalMember(owner = "client!vda", name = "pb", descriptor = "I")
    private int field4518;

    @OriginalMember(owner = "client!vda", name = "B", descriptor = "Luaa;")
    private class395 field4478;

    @OriginalMember(owner = "client!vda", name = "kb", descriptor = "Lkv;")
    public class199 field4513;

    @OriginalMember(owner = "client!vda", name = "C", descriptor = "F")
    private float field4479;

    @OriginalMember(owner = "client!vda", name = "eb", descriptor = "F")
    private float field4507;

    @OriginalMember(owner = "client!vda", name = "t", descriptor = "I")
    private int field4470;

    @OriginalMember(owner = "client!vda", name = "E", descriptor = "I")
    public int field4481;

    @OriginalMember(owner = "client!vda", name = "M", descriptor = "I")
    public int field4489;

    @OriginalMember(owner = "client!vda", name = "R", descriptor = "I")
    public int field4494;

    @OriginalMember(owner = "client!vda", name = "U", descriptor = "I")
    public int field4497;

    @OriginalMember(owner = "client!vda", name = "Z", descriptor = "I")
    public int field4502;

    @OriginalMember(owner = "client!vda", name = "bb", descriptor = "I")
    public int field4504;

    @OriginalMember(owner = "client!vda", name = "fb", descriptor = "I")
    public int field4508;

    @OriginalMember(owner = "client!vda", name = "gb", descriptor = "I")
    public int field4509;

    @OriginalMember(owner = "client!vda", name = "hb", descriptor = "I")
    public int field4510;

    @OriginalMember(owner = "client!vda", name = "ib", descriptor = "I")
    public int field4511;

    @OriginalMember(owner = "client!vda", name = "lb", descriptor = "I")
    public int field4514;

    @OriginalMember(owner = "client!vda", name = "nb", descriptor = "I")
    public int field4516;

    @OriginalMember(owner = "client!vda", name = "ob", descriptor = "Lha;")
    public class116 field4517;

    @OriginalMember(owner = "client!vda", name = "qb", descriptor = "Lha;")
    private class116 field4519;

    @OriginalMember(owner = "client!vda", name = "u", descriptor = "Lnt;")
    public class453 field4471;

    @OriginalMember(owner = "client!vda", name = "y", descriptor = "Ljava/awt/Canvas;")
    public Canvas field4475;

    @OriginalMember(owner = "client!vda", name = "V", descriptor = "Z")
    public boolean field4498;

    @OriginalMember(owner = "client!vda", name = "mb", descriptor = "[I")
    public int[] field4515;

    @OriginalMember(owner = "client!vda", name = "W", descriptor = "[Lkw;")
    public class174[] field4499;

    @OriginalMember(owner = "client!vda", name = "B", descriptor = "(IIIIII)Z")
    public final boolean method558(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (this.field4513.field2834 * arg2 + this.field4513.field2835 * arg1 + this.field4513.field2833 * arg0 >> 15) + this.field4513.field2832;
        if (var7 < 1) {
            var7 = 1;
        }
        int var8 = (this.field4513.field2834 * arg5 + this.field4513.field2835 * arg4 + this.field4513.field2833 * arg3 >> 15) + this.field4513.field2832;
        if (var8 < 1) {
            var8 = 1;
        }
        if ((var7 >= this.field4490 || var8 >= this.field4490) && (var7 <= this.field4480 || var8 <= this.field4480)) {
            int var9 = ((this.field4513.field2827 * arg2 + this.field4513.field2828 * arg1 + this.field4513.field2826 * arg0 >> 15) + this.field4513.field2830) * this.field4485 / var7;
            int var10 = ((this.field4513.field2827 * arg5 + this.field4513.field2828 * arg4 + this.field4513.field2826 * arg3 >> 15) + this.field4513.field2830) * this.field4485 / var8;
            if (var9 < this.field4514 && var10 < this.field4514 || var9 > this.field4516 && var10 > this.field4516) {
                return false;
            } else {
                int var11 = ((this.field4513.field2829 * arg2 + this.field4513.field2836 * arg0 + this.field4513.field2825 * arg1 >> 15) + this.field4513.field2831) * this.field4505 / var7;
                int var12 = ((this.field4513.field2829 * arg5 + this.field4513.field2836 * arg3 + this.field4513.field2825 * arg4 >> 15) + this.field4513.field2831) * this.field4505 / var8;
                return (var11 >= this.field4510 || var12 >= this.field4510) && (var11 <= this.field4509 || var12 <= this.field4509);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)V")
    public final void method521(int arg0) {
    }

    @OriginalMember(owner = "client!vda", name = "D", descriptor = "()V")
    public final void method122() {
    }

    @OriginalMember(owner = "client!vda", name = "j", descriptor = "(I)Z")
    public final boolean method1920(int arg0) {
        return this.field4487 || super.field2443.method2387((byte) 127, arg0).field8205;
    }

    @OriginalMember(owner = "client!vda", name = "N", descriptor = "(IIII)V")
    public final void method615(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field4481) {
            arg2 = this.field4481;
        }
        if (arg3 > this.field4497) {
            arg3 = this.field4497;
        }
        this.field4484 = arg0;
        this.field4501 = arg2;
        this.field4512 = arg1;
        this.field4483 = arg3;
        this.method396();
    }

    @OriginalMember(owner = "client!vda", name = "q", descriptor = "()Z")
    public final boolean method141() {
        return false;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method393(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!vda", name = "ta", descriptor = "(II)V")
    public final void method557(int arg0, int arg1) {
        this.field4490 = arg0;
        this.field4480 = arg1;
        this.field4496 = this.field4480 - 255;
        this.method1921();
    }

    @OriginalMember(owner = "client!vda", name = "f", descriptor = "()Z")
    public final boolean method559() {
        return false;
    }

    @OriginalMember(owner = "client!vda", name = "v", descriptor = "(IIII)[I")
    public final int[] method103(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field4481 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field4515[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIIIZ)Lha;")
    public final class116 method580(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field4481 * arg1 + arg0;
        int var8 = this.field4481 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field4515[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class176(this, var6, arg2, arg3);
        } else {
            return new class67(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "()V")
    public void method142() {
    }

    @OriginalMember(owner = "client!vda", name = "f", descriptor = "(IIIIII)V")
    public final void method653(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field4484) {
            arg2 -= this.field4484 - arg0;
            arg0 = this.field4484;
        }
        if (arg1 < this.field4512) {
            arg3 -= this.field4512 - arg1;
            arg1 = this.field4512;
        }
        if (arg0 + arg2 > this.field4501) {
            arg2 = this.field4501 - arg0;
        }
        if (arg1 + arg3 > this.field4483) {
            arg3 = this.field4483 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field4501 && arg1 <= this.field4483) {
            int var7 = this.field4481 - arg2;
            int var8 = this.field4481 * arg1 + arg0;
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
                            this.field4515[var24] = arg4;
                            ++var24;
                            this.field4515[var24] = arg4;
                            ++var24;
                            this.field4515[var24] = arg4;
                            ++var24;
                            this.field4515[var24] = arg4;
                            ++var24;
                            this.field4515[var24] = arg4;
                            ++var24;
                            this.field4515[var24] = arg4;
                            ++var24;
                            this.field4515[var24] = arg4;
                            ++var24;
                            this.field4515[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field4515[var24] = arg4;
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
                        int var14 = this.field4515[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                        this.field4515[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field4515[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field4515[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(Z)V")
    public final void method131(boolean arg0) {
    }

    @OriginalMember(owner = "client!vda", name = "d", descriptor = "(I)Lu;")
    public final class424 method614(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(II[I[I)Lpa;")
    public final class593 method582(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class603(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ln;)V")
    public class309(Canvas arg0, class472 arg1) {
        this(arg1);
        this.method624(arg0);
        this.method394(arg0);
    }

    @OriginalMember(owner = "client!vda", name = "w", descriptor = "()V")
    private final void method1921() {
        if (this.field4479 != 0.0F) {
            float var1 = (float) this.field4480;
            float var2 = (float) this.field4490;
            float var3 = -(var2 * 2.0F * var1) / (var1 - var2);
            float var4 = this.field4507 / (this.field4507 + this.field4479);
            float var5 = var4 * var4;
            float var6 = (1.0F - var4) * -var3 * (1.0F - var4) / this.field4479;
            this.field4506 = (int) (((float) this.field4480 - var3 * var5) / ((var1 + var2) / (var1 - var2) - var6) + 0.5F);
        } else {
            this.field4506 = this.field4480;
        }
    }

    @OriginalMember(owner = "client!vda", name = "JA", descriptor = "(IIII)V")
    public final void method572(int arg0, int arg1, int arg2, int arg3) {
        this.field4476 = arg0;
        this.field4500 = arg1;
        this.field4486 = arg2;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Ljava/lang/Runnable;)Lkw;")
    public abstract class174 method395(Runnable arg0);

    @OriginalMember(owner = "client!vda", name = "L", descriptor = "(I)V")
    public final void method642(int arg0) {
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "([IIIII)Lha;")
    public final class116 method528(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class176(this, arg0, arg1, arg2, arg3, arg4) : new class67(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class176(this, arg0, arg1, arg2, arg3, arg4) : new class67(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!vda", name = "z", descriptor = "()Z")
    public final boolean method595() {
        return false;
    }

    @OriginalMember(owner = "client!vda", name = "U", descriptor = "()I")
    public final int method565() {
        return 0;
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method394(Canvas arg0);

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "(IIIIII)Lkk;")
    public final class149 method515(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!vda", name = "m", descriptor = "()Z")
    public final boolean method629() {
        return false;
    }

    @OriginalMember(owner = "client!vda", name = "E", descriptor = "()V")
    public abstract void method396();

    @OriginalMember(owner = "client!vda", name = "h", descriptor = "(I)V")
    public abstract void method399(int arg0);

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "([Lr;Lsh;Lm;[Lpaa;I)V")
    public abstract void method397(class519[] arg0, class616 arg1, class105 arg2, class315[] arg3, int arg4);

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lld;IIII)Lr;")
    public abstract class519 method400(class560 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!vda", name = "Z", descriptor = "(I)V")
    public final void method121(int arg0) {
        this.method653(0, 0, this.field4481, this.field4497, arg0, 0);
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "()Lm;")
    public final class105 method637() {
        class174 var1 = this.method395(Thread.currentThread());
        return var1.field2523;
    }

    @OriginalMember(owner = "client!vda", name = "o", descriptor = "()V")
    public final void method94() throws class354 {
        if (this.field4475 != null && this.field4471 != null) {
            try {
                Graphics var1 = this.field4475.getGraphics();
                this.field4471.method1291(0, var1, 26356, 0);
            } catch (Exception var2) {
                this.field4475.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lrl;[Lfba;Z)Lra;")
    public final class259 method626(class633 arg0, class518[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field7202;
            var5[var7] = arg1[var7].field7195;
            if (arg1[var7].field7196 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                return new class428(this, arg0, arg1, var4, var5);
            } else {
                return new class450(this, arg0, arg1, var4, var5);
            }
        } else if (var6) {
            throw new IllegalArgumentException("");
        } else {
            return new class452(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method1922(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2 != 0 && arg3 != 0) {
            if (arg5 != 65535 && !super.field2443.method2387((byte) 127, arg5).field8222) {
                if (this.field4518 != arg5) {
                    class116 var10 = (class116) this.field4488.method2407(false, (long) arg5);
                    if (var10 == null) {
                        int[] var11 = this.method1924(arg5);
                        if (var11 == null) {
                            return;
                        }
                        int var12 = this.method1920(arg5) ? 64 : 128;
                        var10 = this.method528(var11, 0, var12, var12, var12);
                        this.field4488.method2408(var10, (long) arg5, -118);
                    }
                    this.field4518 = arg5;
                    this.field4519 = var10;
                }
                this.field4519.method664(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
            } else {
                this.method652(arg0, arg1, arg2, arg6, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!vda", name = "p", descriptor = "()Z")
    public final boolean method157() {
        return false;
    }

    @OriginalMember(owner = "client!vda", name = "k", descriptor = "(I)Z")
    public final boolean method1923(int arg0) {
        return super.field2443.method2387((byte) 127, arg0).field8213;
    }

    @OriginalMember(owner = "client!vda", name = "ba", descriptor = "()I")
    public final int method604() {
        int var1 = this.field4491;
        this.field4491 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(FFF)V")
    public final void method139(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!vda", name = "s", descriptor = "()V")
    public final void method83() {
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method158(Rectangle[] arg0, int arg1) throws class354 {
        if (this.field4475 != null && this.field4471 != null) {
            try {
                Graphics var3 = this.field4475.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field4481 && var5.y <= this.field4497 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field4471.method1290(var5.y, var5.width, var5.x, -9600, var3, var5.height);
                    }
                }
            } catch (Exception var6) {
                this.field4475.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!vda", name = "u", descriptor = "()V")
    public final void method153() {
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(IIIIII)V")
    public final void method628(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method589(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method589(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method573(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method573(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field4484) {
                    var10 += (this.field4484 - arg0) * var12;
                    arg0 = this.field4484;
                }
                if (var13 >= this.field4501) {
                    var13 = this.field4501 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field4512 && var17 < this.field4483) {
                                int var18 = this.field4481 * var17 + arg0;
                                int var19 = this.field4515[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field4515[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field4512 && var21 < this.field4483) {
                                int var22 = this.field4481 * var21 + arg0;
                                int var23 = this.field4515[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field4515[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field4512 && var27 < this.field4483) {
                            this.field4515[this.field4481 * var27 + arg0] = arg4;
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
                if (arg1 < this.field4512) {
                    var29 += (this.field4512 - arg1) * var31;
                    arg1 = this.field4512;
                }
                if (var32 >= this.field4483) {
                    var32 = this.field4483 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field4484 && var46 < this.field4501) {
                            this.field4515[this.field4481 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field4484 && var36 < this.field4501) {
                            int var37 = this.field4481 * arg1 + var36;
                            int var38 = this.field4515[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field4515[this.field4481 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field4484 && var40 < this.field4501) {
                            int var41 = this.field4481 * arg1 + var40;
                            int var42 = this.field4515[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field4515[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lkk;)V")
    public final void method556(class149 arg0) {
    }

    @OriginalMember(owner = "client!vda", name = "E", descriptor = "(III)V")
    public final void method562(int arg0, int arg1, int arg2) {
        this.field4500 = arg0 & 16777215;
        int var4 = this.field4500 >>> 16 & 255;
        if (var4 < 2) {
            var4 = 2;
        }
        int var5 = this.field4500 >> 8 & 255;
        if (var5 < 2) {
            var5 = 2;
        }
        int var6 = this.field4500 & 255;
        if (var6 < 2) {
            var6 = 2;
        }
        this.field4500 = var4 << 16 | var5 << 8 | var6;
        if (arg1 < 0) {
            this.field4498 = false;
        } else {
            this.field4498 = true;
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method404(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!vda", name = "q", descriptor = "(IIII)V")
    public final void method658(int arg0, int arg1, int arg2, int arg3) {
        this.field4503 = this.field4500;
        this.field4476 = arg0;
        this.field4500 = arg1;
        this.field4486 = arg2;
        this.field4493 = true;
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(II)I")
    public final int method649(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Z)V")
    public final void method621(boolean arg0) {
    }

    @OriginalMember(owner = "client!vda", name = "e", descriptor = "()V")
    public final void method124() {
    }

    @OriginalMember(owner = "client!vda", name = "l", descriptor = "(I)[I")
    private final int[] method1924(int arg0) {
        class395 var2 = this.field4478;
        class178 var3;
        synchronized (this.field4478) {
            var3 = (class178) this.field4478.method2407(false, (long) arg0);
            if (var3 == null) {
                if (!super.field2443.method2389(-103, arg0)) {
                    return null;
                }
                class576 var5 = super.field2443.method2387((byte) 127, arg0);
                int var6 = !var5.field8205 && !this.field4487 ? 128 : 64;
                var3 = new class178(arg0, var6, super.field2443.method2385(0.7F, var6, true, arg0, true, var6), var5.field8219);
                this.field4478.method2408(var3, (long) arg0, -116);
            }
        }
        var3.field2597 = true;
        return var3.method1211();
    }

    @OriginalMember(owner = "client!vda", name = "n", descriptor = "()V")
    public final void method657() {
        this.field4484 = 0;
        this.field4512 = 0;
        this.field4501 = this.field4481;
        this.field4483 = this.field4497;
        this.method396();
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(II)I")
    public final int method560(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!vda", name = "UA", descriptor = "(IIIII)V")
    public final void method589(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field4512 && arg1 < this.field4483) {
            if (arg0 < this.field4484) {
                arg2 -= this.field4484 - arg0;
                arg0 = this.field4484;
            }
            if (arg0 + arg2 > this.field4501) {
                arg2 = this.field4501 - arg0;
            }
            int var6 = this.field4481 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field4515[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field4515[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field4515[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field4515[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field4515[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "(I)V")
    public void method398(int arg0) {
        this.field4499[arg0].method1198(Thread.currentThread(), 8);
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIIIIF)Luca;")
    public final class637 method601(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!vda", name = "xa", descriptor = "()V")
    public final void method585() {
        this.field4500 = this.field4503;
        this.field4493 = false;
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(I)V")
    public abstract void method403(int arg0);

    @OriginalMember(owner = "client!vda", name = "ra", descriptor = "()F")
    public final float method613() {
        return this.field4479;
    }

    @OriginalMember(owner = "client!vda", name = "m", descriptor = "(I)I")
    public final int method1925(int arg0) {
        return super.field2443.method2387((byte) 127, arg0).field8209 & 65535;
    }

    @OriginalMember(owner = "client!vda", name = "F", descriptor = "()Z")
    public final boolean method1926() {
        return this.field4473;
    }

    @OriginalMember(owner = "client!vda", name = "YA", descriptor = "()I")
    public final int method120() {
        int var1 = this.field4495;
        this.field4495 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!vda", name = "l", descriptor = "()V")
    public final void method567() {
        this.field4478.method2406(24);
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(II[[I[[IIII)Lsa;")
    public abstract class542 method405(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!vda", name = "d", descriptor = "([I)V")
    public final void method640(int[] arg0) {
        arg0[0] = this.field4484;
        arg0[1] = this.field4512;
        arg0[2] = this.field4501;
        arg0[3] = this.field4483;
    }

    @OriginalMember(owner = "client!vda", name = "CA", descriptor = "()I")
    public final int method531() {
        return this.field4480;
    }

    @OriginalMember(owner = "client!vda", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method402(Canvas arg0);

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lm;)V")
    public final void method587(class105 arg0) {
        this.field4513 = (class199) arg0;
    }

    @OriginalMember(owner = "client!vda", name = "g", descriptor = "(I)V")
    public final void method101(int arg0) {
        int var2 = arg0 - this.field4470;
        for (Object var3 = this.field4478.method2405(55); var3 != null; var3 = this.field4478.method2395(true)) {
            class178 var4 = (class178) var3;
            if (var4.field2597) {
                var4.field2598 += var2;
                int var5 = var4.field2598 / 20;
                if (var5 > 0) {
                    class576 var6 = super.field2443.method2387((byte) 127, var4.field2594);
                    var4.method1212(var6.field8215 * var2 * 50 / 1000, var6.field8214 * var2 * 50 / 1000);
                    var4.field2598 -= var5 * 20;
                }
                var4.field2597 = false;
            }
        }
        this.field4470 = arg0;
        this.field4488.method2397(5, (byte) -84);
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "([Lr;Lm;[Lpaa;I)V")
    public abstract void method406(class519[] arg0, class105 arg1, class315[] arg2, int arg3);

    @OriginalMember(owner = "client!vda", name = "G", descriptor = "(ILpa;II)V")
    public final void method592(int arg0, class593 arg1, int arg2, int arg3) {
        class603 var5 = (class603) arg1;
        int[] var6 = var5.field8585;
        int[] var7 = var5.field8582;
        int var8;
        if (this.field4483 < var6.length + arg3) {
            var8 = this.field4483 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field4512 > arg3) {
            var9 = this.field4512 - arg3;
            arg3 = this.field4512;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field4481 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field4484 > var12) {
                    var13 -= this.field4484 - var12;
                    var12 = this.field4484;
                }
                if (this.field4501 < var12 + var13) {
                    var13 = this.field4501 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field4515[var14++] = arg0;
                }
                var10 += this.field4481;
            }
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Ltl;III)V")
    public final void method1927(class521 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0.field7243;
        int var7 = arg3 << 1;
        if (var5 == -1) {
            this.method652(arg1, arg2, arg3, arg0.field7235, 1);
        } else {
            if (this.field4518 != var5) {
                class116 var8 = (class116) this.field4488.method2407(false, (long) var5);
                if (var8 == null) {
                    int[] var9 = this.method1924(var5);
                    if (var9 == null) {
                        return;
                    }
                    int var10 = this.method1920(var5) ? 64 : 128;
                    var8 = this.method528(var9, 0, var10, var10, var10);
                    this.field4488.method2408(var8, (long) var5, -127);
                }
                this.field4518 = var5;
                this.field4519 = var8;
            }
            ++var7;
            this.field4519.method664(arg1 - arg3, arg2 - arg3, var7, var7, 0, arg0.field7235, 1);
        }
    }

    @OriginalMember(owner = "client!vda", name = "j", descriptor = "()Z")
    public final boolean method660() {
        return true;
    }

    @OriginalMember(owner = "client!vda", name = "g", descriptor = "()Z")
    public final boolean method618() {
        return false;
    }

    @OriginalMember(owner = "client!vda", name = "n", descriptor = "(I)Z")
    public final boolean method1928(int arg0) {
        return super.field2443.method2389(-16, arg0);
    }

    @OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Ln;)V")
    private class309(class472 arg0) {
        super(arg0);
        this.field4472 = false;
        this.field4473 = false;
        this.field4474 = new class78(4);
        this.field4483 = 0;
        this.field4484 = 0;
        this.field4476 = 0;
        this.field4486 = 0;
        this.field4490 = 50;
        this.field4493 = false;
        this.field4480 = 3500;
        this.field4492 = 45823;
        this.field4500 = 0;
        this.field4487 = false;
        this.field4491 = 0;
        this.field4501 = 0;
        this.field4505 = 512;
        this.field4477 = 75518;
        this.field4506 = 3500;
        this.field4503 = 0;
        this.field4485 = 512;
        this.field4496 = this.field4480 - 255;
        this.field4512 = 0;
        this.field4482 = 78642;
        this.field4495 = 0;
        this.field4488 = new class395(16);
        this.field4518 = -1;
        this.field4478 = new class395(20);
        this.field4513 = new class199();
        this.method403(1);
        this.method398(0);
        class327.method2034(2, false, true);
        this.field4472 = true;
    }

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "(Z)V")
    public final void method525(boolean arg0) {
        this.field4487 = arg0;
        this.field4478.method2406(-121);
    }

    @OriginalMember(owner = "client!vda", name = "e", descriptor = "(IIIII)V")
    public final void method573(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field4484 && arg0 < this.field4501) {
            if (arg1 < this.field4512) {
                arg2 -= this.field4512 - arg1;
                arg1 = this.field4512;
            }
            if (arg1 + arg2 > this.field4483) {
                arg2 = this.field4483 - arg1;
            }
            int var6 = this.field4481 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field4481 * var10 + var6;
                        int var12 = this.field4515[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field4515[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field4481 * var14 + var6;
                        int var16 = this.field4515[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field4515[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field4515[this.field4481 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vda", name = "IA", descriptor = "(III[I)V")
    public final void method568(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (this.field4513.field2834 * arg2 + this.field4513.field2835 * arg1 + this.field4513.field2833 * arg0 >> 15) + this.field4513.field2832;
        if (var5 >= this.field4490 && var5 <= this.field4480) {
            int var6 = ((this.field4513.field2827 * arg2 + this.field4513.field2828 * arg1 + this.field4513.field2826 * arg0 >> 15) + this.field4513.field2830) * this.field4485 / var5;
            int var7 = ((this.field4513.field2829 * arg2 + this.field4513.field2836 * arg0 + this.field4513.field2825 * arg1 >> 15) + this.field4513.field2831) * this.field4505 / var5;
            if (var6 >= this.field4514 && var6 <= this.field4516 && var7 >= this.field4510 && var7 <= this.field4509) {
                arg3[0] = var6 - this.field4514;
                arg3[1] = var7 - this.field4510;
                arg3[2] = var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lsh;)V")
    public final void method563(class616 arg0) {
        class327 var2 = arg0.field8719.field6889;
        for (class327 var3 = var2.field4709; var2 != var3; var3 = var3.field4709) {
            class521 var4 = (class521) var3;
            int var5 = var4.field7240 >> 12;
            int var6 = var4.field7242 >> 12;
            int var7 = var4.field7246 >> 12;
            int var8 = (this.field4513.field2834 * var7 + this.field4513.field2835 * var6 + this.field4513.field2833 * var5 >> 15) + this.field4513.field2832;
            if (var8 >= this.field4490 && var8 <= this.field4496) {
                int var9 = ((this.field4513.field2827 * var7 + this.field4513.field2828 * var6 + this.field4513.field2826 * var5 >> 15) + this.field4513.field2830) * this.field4485 / var8 + this.field4489;
                int var10 = ((this.field4513.field2829 * var7 + this.field4513.field2836 * var5 + this.field4513.field2825 * var6 >> 15) + this.field4513.field2831) * this.field4505 / var8 + this.field4511;
                if (var9 >= this.field4484 && var9 <= this.field4501 && var10 >= this.field4512 && var10 <= this.field4483) {
                    if (var8 == 0) {
                        var8 = 1;
                    }
                    this.method1927(var4, var9, var10, (this.field4485 * var4.field7237 >> 12) / var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vda", name = "B", descriptor = "()Z")
    public abstract boolean method407();

    @OriginalMember(owner = "client!vda", name = "o", descriptor = "(I)[I")
    public final int[] method1929(int arg0) {
        class395 var2 = this.field4478;
        class178 var3;
        synchronized (this.field4478) {
            var3 = (class178) this.field4478.method2407(false, (long) arg0);
            if (var3 == null) {
                if (!super.field2443.method2389(-117, arg0)) {
                    return null;
                }
                class576 var5 = super.field2443.method2387((byte) 127, arg0);
                int var6 = !var5.field8205 && !this.field4487 ? 128 : 64;
                var3 = new class178(arg0, var6, super.field2443.method2388(var6, var6, true, arg0, 0.7F, (byte) -64), var5.field8219);
                this.field4478.method2408(var3, (long) arg0, -125);
            }
        }
        var3.field2597 = true;
        return var3.method1211();
    }

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "()I")
    public final int method537() {
        return this.field4490;
    }

    @OriginalMember(owner = "client!vda", name = "y", descriptor = "()Z")
    public final boolean method635() {
        return true;
    }

    @OriginalMember(owner = "client!vda", name = "A", descriptor = "()Z")
    public final boolean method524() {
        return false;
    }

    @OriginalMember(owner = "client!vda", name = "m", descriptor = "(IFFFFF)V")
    public final void method600(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field4492 = (int) (arg1 * 65535.0F);
        this.field4482 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field4504 = (int) (arg3 * 65535.0F / var7);
        this.field4494 = (int) (arg4 * 65535.0F / var7);
        this.field4508 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lkk;Lkk;FLkk;)Lkk;")
    public final class149 method104(class149 arg0, class149 arg1, float arg2, class149 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!vda", name = "A", descriptor = "(IIIII)V")
    public final void method652(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field4512) {
            var6 = this.field4512;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field4483) {
            var7 = this.field4483;
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
                if (var64 < this.field4484) {
                    var64 = this.field4484;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field4501) {
                    var65 = this.field4501;
                }
                int var66 = this.field4481 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field4515[var66++] = arg3;
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
                if (var60 < this.field4484) {
                    var60 = this.field4484;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field4501 - 1) {
                    var61 = this.field4501 - 1;
                }
                int var62 = this.field4481 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field4515[var62++] = arg3;
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
                if (var28 < this.field4484) {
                    var28 = this.field4484;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field4501) {
                    var29 = this.field4501;
                }
                int var30 = this.field4481 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field4515[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field4515[var30++] = var15 + var33;
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
                if (var22 < this.field4484) {
                    var22 = this.field4484;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field4501 - 1) {
                    var23 = this.field4501 - 1;
                }
                int var24 = this.field4481 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field4515[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field4515[var24++] = var15 + var27;
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
                if (var47 < this.field4484) {
                    var47 = this.field4484;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field4501) {
                    var48 = this.field4501;
                }
                int var49 = this.field4481 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field4515[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field4515[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field4484) {
                    var39 = this.field4484;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field4501 - 1) {
                    var40 = this.field4501 - 1;
                }
                int var41 = this.field4481 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field4515[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field4515[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(IIII)V")
    public final void method519(int arg0, int arg1, int arg2, int arg3) {
        this.field4489 = arg0;
        this.field4511 = arg1;
        this.field4485 = arg2;
        this.field4505 = arg3;
        this.method396();
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lu;)V")
    public final void method593(class424 arg0) {
    }

    @OriginalMember(owner = "client!vda", name = "P", descriptor = "()F")
    public final float method542() {
        return this.field4507;
    }

    @OriginalMember(owner = "client!vda", name = "za", descriptor = "(IIIIII[BII)V")
    public final void method661(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field4481 * arg1 + arg0;
            int var15 = this.field4481 - arg2;
            if (arg1 + arg3 > this.field4483) {
                arg3 -= arg1 + arg3 - this.field4483;
            }
            if (arg1 < this.field4512) {
                int var16 = this.field4512 - arg1;
                arg3 -= var16;
                var14 += this.field4481 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field4501) {
                int var17 = arg0 + arg2 - this.field4501;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field4484) {
                int var18 = this.field4484 - arg0;
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
                            int var28 = this.field4515[var14];
                            this.field4515[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field4515[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field4515[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field4515[var14++] = arg5;
                        } else {
                            this.field4515[var14++] = arg4;
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

    @OriginalMember(owner = "client!vda", name = "C", descriptor = "()Z")
    public final boolean method555() {
        return false;
    }

    @OriginalMember(owner = "client!vda", name = "d", descriptor = "()Z")
    public final boolean method650() {
        return true;
    }

    @OriginalMember(owner = "client!vda", name = "t", descriptor = "()V")
    public final void method95() {
        if (this.field4472) {
            class246.method1560((byte) -65, true, false);
            this.field4472 = false;
        }
        this.field4471 = null;
        this.field4475 = null;
        this.field4474 = null;
        this.field4473 = true;
    }

    @OriginalMember(owner = "client!vda", name = "v", descriptor = "()Z")
    public final boolean method529() {
        return true;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lr;Lsh;Lm;Lpaa;I)V")
    public final void method553(class519 arg0, class616 arg1, class105 arg2, class315 arg3, int arg4) {
        ((class213) arg0).method1446(arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!vda", name = "h", descriptor = "()Lm;")
    public final class105 method623() {
        return new class199();
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIIIII)V")
    public final void method638(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method589(arg0, arg1, arg2, arg4, arg5);
        this.method589(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method573(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method573(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!vda", name = "i", descriptor = "()Ldp;")
    public final class425 method85() {
        return new class425(0, "Pure Java", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(I[Luca;)V")
    public final void method586(int arg0, class637[] arg1) {
    }

    @OriginalMember(owner = "client!vda", name = "G", descriptor = "()V")
    public final void method1930() {
        for (int var1 = 0; var1 < this.field4502; ++var1) {
            this.field4499[var1].method1197((byte) -107);
        }
        this.method657();
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIII)V")
    public final void method99(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lfba;Z)Lha;")
    public final class116 method548(class518 arg0, boolean arg1) {
        int[] var3 = arg0.field7198;
        byte[] var4 = arg0.field7197;
        int var5 = arg0.field7202;
        int var6 = arg0.field7195;
        class283 var11;
        if (arg1 && arg0.field7196 == null) {
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
            var11 = new class171(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field7196;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class176(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var20 = var5 * var19;
                    for (int var21 = 0; var21 < var5; ++var21) {
                        int var22 = var3[var4[var20 + var21] & 255];
                        var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
                    }
                }
                var11 = new class67(this, var14, var5, var6);
            }
        }
        var11.method963(arg0.field7199, arg0.field7200, arg0.field7203, arg0.field7201);
        return var11;
    }

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method624(Canvas arg0) {
        class453 var2 = (class453) this.field4474.method740(0, (long) arg0.hashCode());
        if (var2 == null) {
            class453 var3 = class509.method2862(arg0, true);
            this.field4474.method737((long) arg0.hashCode(), (byte) 92, var3);
        }
    }

    @OriginalMember(owner = "client!vda", name = "F", descriptor = "(IIII)V")
    public final void method581(int arg0, int arg1, int arg2, int arg3) {
        if (this.field4484 < arg0) {
            this.field4484 = arg0;
        }
        if (this.field4512 < arg1) {
            this.field4512 = arg1;
        }
        if (this.field4501 > arg2) {
            this.field4501 = arg2;
        }
        if (this.field4483 > arg3) {
            this.field4483 = arg3;
        }
        this.method396();
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIIIIILpa;II)V")
    public final void method633(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class593 arg6, int arg7, int arg8) {
        class603 var10 = (class603) arg6;
        int[] var11 = var10.field8585;
        int[] var12 = var10.field8582;
        int var13 = this.field4512 > arg8 ? this.field4512 : arg8;
        int var14 = this.field4483 < var11.length + arg8 ? this.field4483 : var11.length + arg8;
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
            if (arg0 < this.field4484) {
                var18 += (this.field4484 - arg0) * var20;
                arg0 = this.field4484;
            }
            if (var21 >= this.field4501) {
                var21 = this.field4501 - 1;
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
                                int var28 = this.field4481 * var25 + arg0;
                                int var29 = this.field4515[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field4515[var28] = var23 + var30;
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
                                int var34 = this.field4481 * var31 + arg0;
                                int var35 = this.field4515[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field4515[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field4515[this.field4481 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field4484 && var64 < this.field4501 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field4515[this.field4481 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field4484 && var50 < this.field4501 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field4481 * arg1 + var50;
                        int var54 = this.field4515[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field4515[this.field4481 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field4484 && var56 < this.field4501 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field4481 * arg1 + var56;
                        int var60 = this.field4515[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field4515[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method605(Canvas arg0) {
        if (this.field4475 == arg0) {
            this.method394((Canvas) null);
        }
        class453 var2 = (class453) this.field4474.method740(0, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method911(-52);
        }
    }

    @OriginalMember(owner = "client!vda", name = "M", descriptor = "(F)V")
    public final void method569(float arg0) {
        this.field4477 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!vda", name = "x", descriptor = "()Z")
    public final boolean method594() {
        return false;
    }

    @OriginalMember(owner = "client!vda", name = "k", descriptor = "()Z")
    public final boolean method645() {
        return false;
    }

    @OriginalMember(owner = "client!vda", name = "la", descriptor = "(FF)V")
    public final void method517(float arg0, float arg1) {
        this.field4507 = arg0;
        this.field4479 = arg1;
        this.method1921();
    }

    @OriginalMember(owner = "client!vda", name = "r", descriptor = "()I")
    public final int method612() {
        return 0;
    }
}
