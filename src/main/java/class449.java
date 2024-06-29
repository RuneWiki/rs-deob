import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class449 extends class173 {

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "([Lba;Lq;[Lht;I)V", line = 4)
    public final void method366(class107[] arg0, class151 arg1, class108[] arg2, int arg3) {
        class404[] var5 = new class404[arg0.length];
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class404) arg0[var6];
            }
        }
        class404 var7 = class404.method2297(this, var5);
        var7.method1223(arg1, arg2 != null ? arg2[0] : null, (class282) null, arg3);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lxa;Z)V", line = 19)
    public final void method234(class511 arg0, boolean arg1) {
        if (arg0 instanceof class464) {
            class464 var3 = (class464) arg0;
            super.field2167 = var3.field3165;
            super.field2169 = var3.field3154;
            super.field2139 = var3.field6065;
            super.field2148 = arg0;
        } else {
            if (!(arg0 instanceof class334)) {
                throw new RuntimeException();
            }
            class334 var4 = (class334) arg0;
            super.field2167 = var4.field3165;
            super.field2169 = var4.field3154;
            super.field2139 = var4.field4328;
            super.field2148 = arg0;
        }
        this.method1172();
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 48)
    public final void method367(Canvas arg0) {
        class298 var2 = (class298) super.field2129.method39((long) arg0.hashCode(), 31750);
        if (var2 != null) {
            var2.method2438((byte) 123);
            class298 var3 = class577.method3165(false, arg0);
            super.field2129.method38(var3, -128, (long) arg0.hashCode());
            if (super.field2131 == arg0 && super.field2148 == null) {
                super.field2132 = var3;
                super.field2139 = var3.field3895;
                super.field2167 = var3.field3899;
                super.field2169 = var3.field3894;
                this.method1172();
            }
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lfu;IIII)V", line = 68)
    public final void method847(class66 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg0.field905;
        int var8 = arg4 << 1;
        if (var6 == -1) {
            this.method411(arg1, arg2, arg4, arg0.field902, 1);
        } else {
            if (super.field2177 != var6) {
                class511 var9 = (class511) super.field2154.method3655(-125, (long) var6);
                if (var9 == null) {
                    int[] var10 = this.method1173(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = this.method1170(var6) ? 64 : 128;
                    var9 = this.method381(var10, 0, var11, var11, var11);
                    super.field2154.method3650((long) var6, -123, var9);
                }
                super.field2177 = var6;
                super.field2178 = var9;
            }
            ++var8;
            super.field2178.method604(arg1 - arg4, arg2 - arg4, var8, var8, 0, arg0.field902, 1);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIIIIIIII)V", line = 107)
    public final void method352(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class669 var11 = (class669) this.method846(Thread.currentThread());
        class312 var12 = var11.field9291;
        var12.field4044 = false;
        var12.field4045 = true;
        int var13 = arg0 - super.field2137;
        int var14 = arg2 - super.field2137;
        int var15 = arg4 - super.field2137;
        int var16 = arg1 - super.field2173;
        int var17 = arg3 - super.field2173;
        int var18 = arg5 - super.field2173;
        int var19 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var19 == 255) {
            var12.field4047 = 0;
            var12.field4049 = false;
            var12.method1822(var16, var17, var18, var13, var14, var15, arg6, arg7, arg8);
        } else if (arg9 == 1) {
            var12.field4047 = 255 - var19;
            var12.field4049 = false;
            var12.method1822(var16, var17, var18, var13, var14, var15, arg6, arg7, arg8);
        } else {
            if (arg9 != 2) {
                throw new IllegalArgumentException();
            }
            var12.field4047 = 128;
            var12.field4049 = true;
            var12.method1822(var16, var17, var18, var13, var14, var15, arg6, arg7, arg8);
        }
        var12.field4044 = true;
    }

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "()Z", line = 148)
    public final boolean method340() {
        return false;
    }

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "(I)V", line = 151)
    public final void method398(int arg0) {
        super.field2142[arg0].method2478(64, (Runnable) null);
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(Z)V", line = 153)
    public final void method391(boolean arg0) {
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/lang/Runnable;)Ltv;", line = 158)
    public final class434 method846(Runnable arg0) {
        for (int var2 = 0; var2 < super.field2141; ++var2) {
            if (super.field2142[var2].field5590 == arg0) {
                return super.field2142[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIIIII)V", line = 171)
    public final void method368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class669 var8 = (class669) this.method846(Thread.currentThread());
        class312 var9 = var8.field9291;
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
            int var23 = arg0 - var9.method1816();
            int var24 = arg1 - var9.method1812();
            int var25 = var19 + var23;
            int var26 = var23 - var20;
            int var27 = var17 + var23 - var20;
            int var28 = var17 + var23 + var19;
            int var29 = var21 + var24;
            int var30 = var24 - var22;
            int var31 = var18 + var24 - var22;
            int var32 = var18 + var24 + var21;
            if (arg6 == 0) {
                var9.field4047 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field4047 = 255 - (arg4 >>> 24);
            }
            var9.field4045 = var25 < 0 || var25 > var9.field4043 || var26 < 0 || var26 > var9.field4043 || var27 < 0 || var27 > var9.field4043;
            var9.method1820(var29, var30, var31, var25, var26, var27, arg4);
            var9.field4045 = var25 < 0 || var25 > var9.field4043 || var27 < 0 || var27 > var9.field4043 || var28 < 0 || var28 > var9.field4043;
            var9.method1820(var29, var31, var32, var25, var27, var28, arg4);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lfca;IIII)Lba;", line = 242)
    public final class107 method410(class645 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class404(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "(I)V", line = 245)
    public final void method373(int arg0) {
        super.field2142[arg0].method2478(64, Thread.currentThread());
    }

    @OriginalMember(owner = "client!ap", name = "G", descriptor = "()V", line = 248)
    public final void method841() {
        super.field2137 = super.field2144 - super.field2149;
        super.field2135 = super.field2157 - super.field2149;
        super.field2173 = super.field2136 - super.field2143;
        super.field2163 = super.field2140 - super.field2143;
        for (int var1 = 0; var1 < super.field2141; ++var1) {
            class312 var5 = ((class669) super.field2142[var1]).field9291;
            var5.field4051 = super.field2149 - super.field2144;
            var5.field4046 = super.field2143 - super.field2136;
            var5.field4043 = super.field2157 - super.field2144;
            var5.field4050 = super.field2140 - super.field2136;
        }
        int var2 = super.field2167 * super.field2136 + super.field2144;
        for (int var3 = super.field2136; var3 < super.field2140; ++var3) {
            for (int var4 = 0; var4 < super.field2141; ++var4) {
                ((class669) super.field2142[var4]).field9291.field4042[var3 - super.field2136] = var2;
            }
            var2 += super.field2167;
        }
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(IIIIIIIIII)V", line = 286)
    public final void method848(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 0 && arg4 != 0) {
            if (arg6 != 65535 && !super.field598.method3162((byte) -104, arg6).field799) {
                if (super.field2177 != arg6) {
                    class511 var11 = (class511) super.field2154.method3655(-33, (long) arg6);
                    if (var11 == null) {
                        int[] var12 = this.method1173(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = this.method1170(arg6) ? 64 : 128;
                        var11 = this.method381(var12, 0, var13, var13, var13);
                        super.field2154.method3650((long) arg6, -107, var11);
                    }
                    super.field2177 = arg6;
                    super.field2178 = var11;
                }
                super.field2178.method604(arg0 - arg3, arg1 - arg4, arg3 << 1, arg4 << 1, arg8, arg7, arg9);
            } else {
                this.method411(arg0, arg1, arg3, arg7, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Ljava/awt/Canvas;Le;)V", line = 319)
    public class449(Canvas arg0, class702 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "([Lba;Lqu;Lq;[Lht;I)V", line = 323)
    public final void method349(class107[] arg0, class282 arg1, class151 arg2, class108[] arg3, int arg4) {
        class404[] var6 = new class404[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class404) arg0[var7];
            }
        }
        class404 var8 = class404.method2297(this, var6);
        var8.method1223(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!ap", name = "n", descriptor = "()V", line = 338)
    public final void method173() {
        if (super.field2131 != null) {
            super.field2139 = super.field2132.field3895;
            super.field2167 = super.field2132.field3899;
            super.field2169 = super.field2132.field3894;
        } else {
            super.field2167 = 1;
            super.field2169 = 1;
            super.field2139 = null;
        }
        super.field2148 = null;
        this.method1172();
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(II[[I[[IIII)Ld;", line = 355)
    public final class88 method413(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class673(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 358)
    public final void method374(Canvas arg0) {
        if (arg0 != null) {
            class298 var2 = (class298) super.field2129.method39((long) arg0.hashCode(), 31750);
            if (var2 != null) {
                super.field2131 = arg0;
                super.field2132 = var2;
                if (super.field2148 == null) {
                    super.field2139 = var2.field3895;
                    super.field2167 = var2.field3899;
                    super.field2169 = var2.field3894;
                    this.method1172();
                    return;
                }
            }
        } else {
            super.field2131 = null;
            super.field2132 = null;
            if (super.field2148 == null) {
                super.field2139 = null;
                super.field2167 = super.field2169 = 1;
                this.method1172();
            }
        }
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(I)V", line = 392)
    public final void method359(int arg0) {
        super.field2141 = arg0;
        super.field2142 = new class669[super.field2141];
        for (int var2 = 0; var2 < super.field2141; ++var2) {
            super.field2142[var2] = new class669(this);
        }
    }
}
