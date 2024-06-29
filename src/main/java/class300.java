import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class300 extends class633 {

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lrf;IIII)Lba;", line = 4)
    public final class629 method1784(class238 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class591(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!gk", name = "G", descriptor = "()V", line = 7)
    public final void method1785() {
        super.field8594 = super.field8620 - super.field8606;
        super.field8613 = super.field8596 - super.field8606;
        super.field8622 = super.field8612 - super.field8632;
        super.field8619 = super.field8624 - super.field8632;
        for (int var1 = 0; var1 < super.field8597; ++var1) {
            class295 var5 = ((class644) super.field8608[var1]).field9124;
            var5.field3961 = super.field8606 - super.field8620;
            var5.field3964 = super.field8632 - super.field8612;
            var5.field3956 = super.field8596 - super.field8620;
            var5.field3955 = super.field8624 - super.field8612;
        }
        int var2 = super.field8633 * super.field8612 + super.field8620;
        for (int var3 = super.field8612; var3 < super.field8624; ++var3) {
            for (int var4 = 0; var4 < super.field8597; ++var4) {
                ((class644) super.field8608[var4]).field9124.field3959[var3 - super.field8612] = var2;
            }
            var2 += super.field8633;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 45)
    public final void method1786(Canvas arg0) {
        if (arg0 != null) {
            class7 var2 = (class7) super.field8587.method2506(95, (long) arg0.hashCode());
            if (var2 != null) {
                super.field8589 = arg0;
                super.field8588 = var2;
                if (super.field8627 == null) {
                    super.field8599 = var2.field64;
                    super.field8633 = var2.field66;
                    super.field8604 = var2.field65;
                    this.method3448();
                    return;
                }
            }
        } else {
            super.field8589 = null;
            super.field8588 = null;
            if (super.field8627 == null) {
                super.field8599 = null;
                super.field8633 = super.field8604 = 1;
                this.method3448();
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II[[I[[IIII)Ld;", line = 79)
    public final class176 method1787(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class71(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lpl;IIII)V", line = 83)
    public final void method1788(class220 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg0.field2864;
        int var8 = arg4 << 1;
        if (var6 == -1) {
            this.method2008(arg1, arg2, arg4, arg0.field2859, 1);
        } else {
            if (super.field8635 != var6) {
                class424 var9 = (class424) super.field8593.method3134((long) var6, -94);
                if (var9 == null) {
                    int[] var10 = this.method3455(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = this.method3453(var6) ? 64 : 128;
                    var9 = this.method1894(var10, 0, var11, var11, var11);
                    super.field8593.method3130((long) var6, true, var9);
                }
                super.field8635 = var6;
                super.field8634 = var9;
            }
            ++var8;
            super.field8634.method65(arg1 - arg4, arg2 - arg4, var8, var8, 0, arg0.field2859, 1);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljava/lang/Runnable;)Lhi;", line = 124)
    public final class372 method1789(Runnable arg0) {
        for (int var2 = 0; var2 < super.field8597; ++var2) {
            if (super.field8608[var2].field5331 == arg0) {
                return super.field8608[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 137)
    public final void method1790(Canvas arg0) {
        class7 var2 = (class7) super.field8587.method2506(62, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method175(30604);
            class7 var3 = class624.method3410(arg0, true);
            super.field8587.method2504((long) arg0.hashCode(), 4, var3);
            if (super.field8589 == arg0 && super.field8627 == null) {
                super.field8588 = var3;
                super.field8599 = var3.field64;
                super.field8633 = var3.field66;
                super.field8604 = var3.field65;
                this.method3448();
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "()Z", line = 156)
    public final boolean method1791() {
        return false;
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Ljava/awt/Canvas;Le;)V", line = 160)
    public class300(Canvas arg0, class479 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIIIIII)V", line = 164)
    public final void method1792(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class644 var11 = (class644) this.method1789(Thread.currentThread());
        class295 var12 = var11.field9124;
        var12.field3953 = false;
        var12.field3966 = true;
        int var13 = arg0 - super.field8594;
        int var14 = arg2 - super.field8594;
        int var15 = arg4 - super.field8594;
        int var16 = arg1 - super.field8622;
        int var17 = arg3 - super.field8622;
        int var18 = arg5 - super.field8622;
        int var19 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var19 == 255) {
            var12.field3954 = 0;
            var12.field3960 = false;
            var12.method1757(var16, var17, var18, var13, var14, var15, arg6, arg7, arg8);
        } else if (arg9 == 1) {
            var12.field3954 = 255 - var19;
            var12.field3960 = false;
            var12.method1757(var16, var17, var18, var13, var14, var15, arg6, arg7, arg8);
        } else {
            if (arg9 != 2) {
                throw new IllegalArgumentException();
            }
            var12.field3954 = 128;
            var12.field3960 = true;
            var12.method1757(var16, var17, var18, var13, var14, var15, arg6, arg7, arg8);
        }
        var12.field3953 = true;
    }

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "(I)V", line = 205)
    public final void method1793(int arg0) {
        super.field8597 = arg0;
        super.field8608 = new class644[super.field8597];
        for (int var2 = 0; var2 < super.field8597; ++var2) {
            super.field8608[var2] = new class644(this);
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V", line = 219)
    public final void method1794(int arg0) {
        super.field8608[arg0].method2275((Runnable) null, true);
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(IIIIIIIIII)V", line = 222)
    public final void method1795(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 0 && arg4 != 0) {
            if (arg6 != 65535 && !super.field9731.method1728(-106, arg6).field7857) {
                if (super.field8635 != arg6) {
                    class424 var11 = (class424) super.field8593.method3134((long) arg6, -32);
                    if (var11 == null) {
                        int[] var12 = this.method3455(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = this.method3453(arg6) ? 64 : 128;
                        var11 = this.method1894(var12, 0, var13, var13, var13);
                        super.field8593.method3130((long) arg6, true, var11);
                    }
                    super.field8635 = arg6;
                    super.field8634 = var11;
                }
                super.field8634.method65(arg0 - arg3, arg1 - arg4, arg3 << 1, arg4 << 1, arg8, arg7, arg9);
            } else {
                this.method2008(arg0, arg1, arg3, arg7, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([Lba;Lob;Lq;[Lqn;I)V", line = 256)
    public final void method1796(class629[] arg0, class309 arg1, class111 arg2, class455[] arg3, int arg4) {
        class591[] var6 = new class591[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class591) arg0[var7];
            }
        }
        class591 var8 = class591.method3293(this, var6);
        var8.method685(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "(I)V", line = 271)
    public final void method1797(int arg0) {
        super.field8608[arg0].method2275(Thread.currentThread(), true);
    }

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "(Z)V", line = 273)
    public final void method1798(boolean arg0) {
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([Lba;Lq;[Lqn;I)V", line = 277)
    public final void method1799(class629[] arg0, class111 arg1, class455[] arg2, int arg3) {
        class591[] var5 = new class591[arg0.length];
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class591) arg0[var6];
            }
        }
        class591 var7 = class591.method3293(this, var5);
        var7.method685(arg1, arg2 != null ? arg2[0] : null, (class309) null, arg3);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIII)V", line = 293)
    public final void method1800(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class644 var8 = (class644) this.method1789(Thread.currentThread());
        class295 var9 = var8.field9124;
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
            int var23 = arg0 - var9.method1753();
            int var24 = arg1 - var9.method1751();
            int var25 = var19 + var23;
            int var26 = var23 - var20;
            int var27 = var17 + var23 - var20;
            int var28 = var17 + var23 + var19;
            int var29 = var21 + var24;
            int var30 = var24 - var22;
            int var31 = var18 + var24 - var22;
            int var32 = var18 + var24 + var21;
            if (arg6 == 0) {
                var9.field3954 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field3954 = 255 - (arg4 >>> 24);
            }
            var9.field3966 = var25 < 0 || var25 > var9.field3956 || var26 < 0 || var26 > var9.field3956 || var27 < 0 || var27 > var9.field3956;
            var9.method1764(var29, var30, var31, var25, var26, var27, arg4);
            var9.field3966 = var25 < 0 || var25 > var9.field3956 || var27 < 0 || var27 > var9.field3956 || var28 < 0 || var28 > var9.field3956;
            var9.method1764(var29, var31, var32, var25, var27, var28, arg4);
        }
    }
}
