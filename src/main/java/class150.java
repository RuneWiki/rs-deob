import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class150 extends class574 {

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "(Z)V")
    public final void method455(boolean arg0) {
    }

    @OriginalMember(owner = "client!aq", name = "G", descriptor = "()V")
    public final void method934() {
        super.field7347 = super.field7374 - super.field7352;
        super.field7348 = super.field7350 - super.field7352;
        super.field7338 = super.field7357 - super.field7365;
        super.field7345 = super.field7367 - super.field7365;
        for (int var1 = 0; var1 < super.field7362; ++var1) {
            class123 var5 = ((class596) super.field7366[var1]).field7995;
            var5.field1497 = super.field7352 - super.field7374;
            var5.field1494 = super.field7365 - super.field7357;
            var5.field1495 = super.field7350 - super.field7374;
            var5.field1499 = super.field7367 - super.field7357;
        }
        int var2 = super.field7357 * super.field7339 + super.field7374;
        for (int var3 = super.field7357; var3 < super.field7367; ++var3) {
            for (int var4 = 0; var4 < super.field7362; ++var4) {
                ((class596) super.field7366[var4]).field7995.field1501[var3 - super.field7357] = var2;
            }
            var2 += super.field7339;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "([Lba;Lq;[Lpo;I)V")
    public final void method491(class359[] arg0, class396 arg1, class524[] arg2, int arg3) {
        class155[] var5 = new class155[arg0.length];
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class155) arg0[var6];
            }
        }
        class155 var7 = class155.method947(this, var5);
        var7.method3638(arg1, arg2 != null ? arg2[0] : null, (class228) null, arg3);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "([Lba;Lig;Lq;[Lpo;I)V")
    public final void method480(class359[] arg0, class228 arg1, class396 arg2, class524[] arg3, int arg4) {
        class155[] var6 = new class155[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class155) arg0[var7];
            }
        }
        class155 var8 = class155.method947(this, var6);
        var8.method3638(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(I)V")
    public final void method476(int arg0) {
        super.field7366[arg0].method3775(108, (Runnable) null);
    }

    @OriginalMember(owner = "client!aq", name = "r", descriptor = "()V")
    public final void method336() {
        if (super.field7330 != null) {
            super.field7376 = super.field7332.field4472;
            super.field7339 = super.field7332.field4469;
            super.field7373 = super.field7332.field4473;
        } else {
            super.field7339 = 1;
            super.field7373 = 1;
            super.field7376 = null;
        }
        super.field7349 = null;
        this.method3102();
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lnj;IIII)Lba;")
    public final class359 method408(class229 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class155(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "(I)V")
    public final void method494(int arg0) {
        super.field7366[arg0].method3775(101, Thread.currentThread());
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(IIIIIIIIII)V")
    public final void method935(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 0 && arg4 != 0) {
            if (arg6 != 65535 && !super.field8781.method2718(arg6, (byte) 72).field1818) {
                if (super.field7378 != arg6) {
                    class468 var11 = (class468) super.field7361.method1221((long) arg6, true);
                    if (var11 == null) {
                        int[] var12 = this.method3103(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = this.method3109(arg6) ? 64 : 128;
                        var11 = this.method428(var12, 0, var13, var13, var13);
                        super.field7361.method1230((byte) 26, (long) arg6, var11);
                    }
                    super.field7378 = arg6;
                    super.field7379 = var11;
                }
                super.field7379.method1553(arg0 - arg3, arg1 - arg4, arg3 << 1, arg4 << 1, arg8, arg7, arg9);
            } else {
                this.method453(arg0, arg1, arg3, arg7, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lxa;Z)V")
    public final void method369(class468 arg0, boolean arg1) {
        if (arg0 instanceof class533) {
            class533 var3 = (class533) arg0;
            super.field7339 = var3.field5292;
            super.field7373 = var3.field5317;
            super.field7376 = var3.field6731;
            super.field7349 = arg0;
        } else {
            if (!(arg0 instanceof class298)) {
                throw new RuntimeException();
            }
            class298 var4 = (class298) arg0;
            super.field7339 = var4.field5292;
            super.field7373 = var4.field5317;
            super.field7376 = var4.field3799;
            super.field7349 = arg0;
        }
        this.method3102();
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(II[[I[[IIII)Ld;")
    public final class140 method412(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class628(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method405(Canvas arg0) {
        class348 var2 = (class348) super.field7333.method3828((long) arg0.hashCode(), (byte) -91);
        if (var2 != null) {
            var2.method1566(-75);
            class348 var3 = class681.method3760(arg0, (byte) -88);
            super.field7333.method3832(var3, (long) arg0.hashCode(), 44);
            if (super.field7330 == arg0 && super.field7349 == null) {
                super.field7332 = var3;
                super.field7376 = var3.field4472;
                super.field7339 = var3.field4469;
                super.field7373 = var3.field4473;
                this.method3102();
            }
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method457(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class596 var11 = (class596) this.method937(Thread.currentThread());
        class123 var12 = var11.field7995;
        var12.field1502 = false;
        var12.field1500 = true;
        int var13 = arg0 - super.field7347;
        int var14 = arg2 - super.field7347;
        int var15 = arg4 - super.field7347;
        int var16 = arg1 - super.field7338;
        int var17 = arg3 - super.field7338;
        int var18 = arg5 - super.field7338;
        int var19 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var19 == 255) {
            var12.field1496 = 0;
            var12.field1507 = false;
            var12.method816(var16, var17, var18, var13, var14, var15, arg6, arg7, arg8);
        } else if (arg9 == 1) {
            var12.field1496 = 255 - var19;
            var12.field1507 = false;
            var12.method816(var16, var17, var18, var13, var14, var15, arg6, arg7, arg8);
        } else {
            if (arg9 != 2) {
                throw new IllegalArgumentException();
            }
            var12.field1496 = 128;
            var12.field1507 = true;
            var12.method816(var16, var17, var18, var13, var14, var15, arg6, arg7, arg8);
        }
        var12.field1502 = true;
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Ljava/awt/Canvas;Le;)V")
    public class150(Canvas arg0, class498 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method411(Canvas arg0) {
        if (arg0 != null) {
            class348 var2 = (class348) super.field7333.method3828((long) arg0.hashCode(), (byte) -91);
            if (var2 != null) {
                super.field7330 = arg0;
                super.field7332 = var2;
                if (super.field7349 == null) {
                    super.field7376 = var2.field4472;
                    super.field7339 = var2.field4469;
                    super.field7373 = var2.field4473;
                    this.method3102();
                    return;
                }
            }
        } else {
            super.field7330 = null;
            super.field7332 = null;
            if (super.field7349 == null) {
                super.field7376 = null;
                super.field7339 = super.field7373 = 1;
                this.method3102();
            }
        }
    }

    @OriginalMember(owner = "client!aq", name = "g", descriptor = "(I)V")
    public final void method413(int arg0) {
        super.field7362 = arg0;
        super.field7366 = new class596[super.field7362];
        for (int var2 = 0; var2 < super.field7362; ++var2) {
            super.field7366[var2] = new class596(this);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lfm;IIII)V")
    public final void method936(class688 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg0.field9483;
        int var8 = arg4 << 1;
        if (var6 == -1) {
            this.method453(arg1, arg2, arg4, arg0.field9476, 1);
        } else {
            if (super.field7378 != var6) {
                class468 var9 = (class468) super.field7361.method1221((long) var6, true);
                if (var9 == null) {
                    int[] var10 = this.method3103(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = this.method3109(var6) ? 64 : 128;
                    var9 = this.method428(var10, 0, var11, var11, var11);
                    super.field7361.method1230((byte) -119, (long) var6, var9);
                }
                super.field7378 = var6;
                super.field7379 = var9;
            }
            ++var8;
            super.field7379.method1553(arg1 - arg4, arg2 - arg4, var8, var8, 0, arg0.field9476, 1);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIIII)V")
    public final void method448(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class596 var8 = (class596) this.method937(Thread.currentThread());
        class123 var9 = var8.field7995;
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
            int var23 = arg0 - var9.method821();
            int var24 = arg1 - var9.method810();
            int var25 = var19 + var23;
            int var26 = var23 - var20;
            int var27 = var17 + var23 - var20;
            int var28 = var17 + var23 + var19;
            int var29 = var21 + var24;
            int var30 = var24 - var22;
            int var31 = var18 + var24 - var22;
            int var32 = var18 + var24 + var21;
            if (arg6 == 0) {
                var9.field1496 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field1496 = 255 - (arg4 >>> 24);
            }
            var9.field1500 = var25 < 0 || var25 > var9.field1495 || var26 < 0 || var26 > var9.field1495 || var27 < 0 || var27 > var9.field1495;
            var9.method820(var29, var30, var31, var25, var26, var27, arg4);
            var9.field1500 = var25 < 0 || var25 > var9.field1495 || var27 < 0 || var27 > var9.field1495 || var28 < 0 || var28 > var9.field1495;
            var9.method820(var29, var31, var32, var25, var27, var28, arg4);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Ljava/lang/Runnable;)Lcm;")
    public final class683 method937(Runnable arg0) {
        for (int var2 = 0; var2 < super.field7362; ++var2) {
            if (super.field7366[var2].field9307 == arg0) {
                return super.field7366[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!aq", name = "u", descriptor = "()Z")
    public final boolean method419() {
        return false;
    }
}
