import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class609 extends class437 {

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Ljava/awt/Canvas;Le;)V", line = 3)
    public class609(Canvas arg0, class498 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "()Z", line = 6)
    public final boolean method396() {
        return false;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(IIIIIIIIII)V", line = 9)
    public final void method2489(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 0 && arg4 != 0) {
            if (arg6 != 65535 && !super.field8808.method2760(arg6, 21351).field4930) {
                if (super.field6024 != arg6) {
                    class468 var11 = (class468) super.field6022.method3750((long) arg6, false);
                    if (var11 == null) {
                        int[] var12 = this.method2490(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = this.method2480(arg6) ? 64 : 128;
                        var11 = this.method374(var12, 0, var13, var13, var13);
                        super.field6022.method3745(1, (long) arg6, var11);
                    }
                    super.field6024 = arg6;
                    super.field6023 = var11;
                }
                super.field6023.method274(arg0 - arg3, arg1 - arg4, arg3 << 1, arg4 << 1, arg8, arg7, arg9);
            } else {
                this.method436(arg0, arg1, arg3, arg7, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIIIIII)V", line = 43)
    public final void method448(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class232 var11 = (class232) this.method2478(Thread.currentThread());
        class359 var12 = var11.field3257;
        var12.field4856 = false;
        var12.field4861 = true;
        int var13 = arg0 - super.field6000;
        int var14 = arg2 - super.field6000;
        int var15 = arg4 - super.field6000;
        int var16 = arg1 - super.field6018;
        int var17 = arg3 - super.field6018;
        int var18 = arg5 - super.field6018;
        int var19 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var19 == 255) {
            var12.field4857 = 0;
            var12.field4855 = false;
            var12.method2128(var16, var17, var18, var13, var14, var15, arg6, arg7, arg8);
        } else if (arg9 == 1) {
            var12.field4857 = 255 - var19;
            var12.field4855 = false;
            var12.method2128(var16, var17, var18, var13, var14, var15, arg6, arg7, arg8);
        } else {
            if (arg9 != 2) {
                throw new IllegalArgumentException();
            }
            var12.field4857 = 128;
            var12.field4855 = true;
            var12.method2128(var16, var17, var18, var13, var14, var15, arg6, arg7, arg8);
        }
        var12.field4856 = true;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ldi;IIII)V", line = 85)
    public final void method2481(class115 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg0.field1982;
        int var8 = arg4 << 1;
        if (var6 == -1) {
            this.method436(arg1, arg2, arg4, arg0.field1979, 1);
        } else {
            if (super.field6024 != var6) {
                class468 var9 = (class468) super.field6022.method3750((long) var6, false);
                if (var9 == null) {
                    int[] var10 = this.method2490(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = this.method2480(var6) ? 64 : 128;
                    var9 = this.method374(var10, 0, var11, var11, var11);
                    super.field6022.method3745(1, (long) var6, var9);
                }
                super.field6024 = var6;
                super.field6023 = var9;
            }
            ++var8;
            super.field6023.method274(arg1 - arg4, arg2 - arg4, var8, var8, 0, arg0.field1979, 1);
        }
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(I)V", line = 123)
    public final void method425(int arg0) {
        super.field6016[arg0].method1661(Thread.currentThread(), 10);
    }

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "()V", line = 126)
    public final void method2479() {
        super.field6000 = super.field5999 - super.field6015;
        super.field6008 = super.field6014 - super.field6015;
        super.field6018 = super.field5985 - super.field6007;
        super.field5989 = super.field6001 - super.field6007;
        for (int var1 = 0; var1 < super.field6013; ++var1) {
            class359 var5 = ((class232) super.field6016[var1]).field3257;
            var5.field4862 = super.field6015 - super.field5999;
            var5.field4852 = super.field6007 - super.field5985;
            var5.field4853 = super.field6014 - super.field5999;
            var5.field4860 = super.field6001 - super.field5985;
        }
        int var2 = super.field5995 * super.field5985 + super.field5999;
        for (int var3 = super.field5985; var3 < super.field6001; ++var3) {
            for (int var4 = 0; var4 < super.field6013; ++var4) {
                ((class232) super.field6016[var4]).field3257.field4850[var3 - super.field5985] = var2;
            }
            var2 += super.field5995;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIII)V", line = 165)
    public final void method399(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class232 var8 = (class232) this.method2478(Thread.currentThread());
        class359 var9 = var8.field3257;
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
            int var23 = arg0 - var9.method2129();
            int var24 = arg1 - var9.method2126();
            int var25 = var19 + var23;
            int var26 = var23 - var20;
            int var27 = var17 + var23 - var20;
            int var28 = var17 + var23 + var19;
            int var29 = var21 + var24;
            int var30 = var24 - var22;
            int var31 = var18 + var24 - var22;
            int var32 = var18 + var24 + var21;
            if (arg6 == 0) {
                var9.field4857 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field4857 = 255 - (arg4 >>> 24);
            }
            var9.field4861 = var25 < 0 || var25 > var9.field4853 || var26 < 0 || var26 > var9.field4853 || var27 < 0 || var27 > var9.field4853;
            var9.method2119(var29, var30, var31, var25, var26, var27, arg4);
            var9.field4861 = var25 < 0 || var25 > var9.field4853 || var27 < 0 || var27 > var9.field4853 || var28 < 0 || var28 > var9.field4853;
            var9.method2119(var29, var31, var32, var25, var27, var28, arg4);
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "()V", line = 236)
    public final void method107() {
        if (super.field5975 != null) {
            super.field5986 = super.field5979.field2221;
            super.field5995 = super.field5979.field2223;
            super.field5996 = super.field5979.field2220;
        } else {
            super.field5995 = 1;
            super.field5996 = 1;
            super.field5986 = null;
        }
        super.field5997 = null;
        this.method2486();
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(Z)V", line = 252)
    public final void method407(boolean arg0) {
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "([Lba;Lc;Lq;[Lot;I)V", line = 256)
    public final void method429(class358[] arg0, class174 arg1, class397 arg2, class552[] arg3, int arg4) {
        class248[] var6 = new class248[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class248) arg0[var7];
            }
        }
        class248 var8 = class248.method1520(this, var6);
        var8.method1944(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/Runnable;)Leo;", line = 273)
    public final class274 method2478(Runnable arg0) {
        for (int var2 = 0; var2 < super.field6013; ++var2) {
            if (super.field6016[var2].field3801 == arg0) {
                return super.field6016[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lpf;IIII)Lba;", line = 285)
    public final class358 method443(class545 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class248(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 289)
    public final void method370(Canvas arg0) {
        if (arg0 != null) {
            class137 var2 = (class137) super.field5980.method2918((long) arg0.hashCode(), (byte) -128);
            if (var2 != null) {
                super.field5975 = arg0;
                super.field5979 = var2;
                if (super.field5997 == null) {
                    super.field5986 = var2.field2221;
                    super.field5995 = var2.field2223;
                    super.field5996 = var2.field2220;
                    this.method2486();
                    return;
                }
            }
        } else {
            super.field5975 = null;
            super.field5979 = null;
            if (super.field5997 == null) {
                super.field5986 = null;
                super.field5995 = super.field5996 = 1;
                this.method2486();
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "(I)V", line = 323)
    public final void method409(int arg0) {
        super.field6013 = arg0;
        super.field6016 = new class232[super.field6013];
        for (int var2 = 0; var2 < super.field6013; ++var2) {
            super.field6016[var2] = new class232(this);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "([Lba;Lq;[Lot;I)V", line = 337)
    public final void method418(class358[] arg0, class397 arg1, class552[] arg2, int arg3) {
        class248[] var5 = new class248[arg0.length];
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class248) arg0[var6];
            }
        }
        class248 var7 = class248.method1520(this, var5);
        var7.method1944(arg1, arg2 != null ? arg2[0] : null, (class174) null, arg3);
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 353)
    public final void method447(Canvas arg0) {
        class137 var2 = (class137) super.field5980.method2918((long) arg0.hashCode(), (byte) -7);
        if (var2 != null) {
            var2.method2797(-101);
            class137 var3 = class116.method919(0, arg0);
            super.field5980.method2911((long) arg0.hashCode(), var3, (byte) -28);
            if (super.field5975 == arg0 && super.field5997 == null) {
                super.field5979 = var3;
                super.field5986 = var3.field2221;
                super.field5995 = var3.field2223;
                super.field5996 = var3.field2220;
                this.method2486();
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V", line = 372)
    public final void method378(int arg0) {
        super.field6016[arg0].method1661((Runnable) null, 10);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lxa;Z)V", line = 375)
    public final void method80(class468 arg0, boolean arg1) {
        if (arg0 instanceof class622) {
            class622 var3 = (class622) arg0;
            super.field5995 = var3.field4090;
            super.field5996 = var3.field4083;
            super.field5986 = var3.field8241;
            super.field5997 = arg0;
        } else {
            if (!(arg0 instanceof class35)) {
                throw new RuntimeException();
            }
            class35 var4 = (class35) arg0;
            super.field5995 = var4.field4090;
            super.field5996 = var4.field4083;
            super.field5986 = var4.field533;
            super.field5997 = arg0;
        }
        this.method2486();
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II[[I[[IIII)Ld;", line = 401)
    public final class139 method402(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class3(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }
}
