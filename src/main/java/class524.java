import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class524 extends class148 {

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Ljava/awt/Canvas;Le;)V", line = 3)
    public class524(Canvas arg0, class486 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!cr", name = "H", descriptor = "()V", line = 6)
    public final void method815() {
        super.field1690 = super.field1667 - super.field1666;
        super.field1659 = super.field1676 - super.field1666;
        super.field1661 = super.field1669 - super.field1680;
        super.field1693 = super.field1692 - super.field1680;
        for (int var1 = 0; var1 < super.field1658; ++var1) {
            class26 var5 = ((class163) super.field1657[var1]).field1941;
            var5.field318 = super.field1666 - super.field1667;
            var5.field322 = super.field1680 - super.field1669;
            var5.field327 = super.field1676 - super.field1667;
            var5.field315 = super.field1692 - super.field1669;
        }
        int var2 = super.field1694 * super.field1669 + super.field1667;
        for (int var3 = super.field1669; var3 < super.field1692; ++var3) {
            for (int var4 = 0; var4 < super.field1658; ++var4) {
                ((class163) super.field1657[var4]).field1941.field316[var3 - super.field1669] = var2;
            }
            var2 += super.field1694;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "([Lba;Ltg;Lq;[Lmr;I)V", line = 46)
    public final void method373(class350[] arg0, class211 arg1, class389 arg2, class130[] arg3, int arg4) {
        class262[] var6 = new class262[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class262) arg0[var7];
            }
        }
        class262 var8 = class262.method1490(this, var6);
        var8.method907(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "(I)V", line = 61)
    public final void method322(int arg0) {
        super.field1657[arg0].method1617(8191, (Runnable) null);
    }

    @OriginalMember(owner = "client!cr", name = "A", descriptor = "()Z", line = 64)
    public final boolean method315() {
        return false;
    }

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "(I)V", line = 68)
    public final void method288(int arg0) {
        super.field1657[arg0].method1617(8191, Thread.currentThread());
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIIIIIIII)V", line = 72)
    public final void method300(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class163 var11 = (class163) this.method814(Thread.currentThread());
        class26 var12 = var11.field1941;
        var12.field320 = false;
        var12.field326 = true;
        int var13 = arg0 - super.field1690;
        int var14 = arg2 - super.field1690;
        int var15 = arg4 - super.field1690;
        int var16 = arg1 - super.field1661;
        int var17 = arg3 - super.field1661;
        int var18 = arg5 - super.field1661;
        int var19 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var19 == 255) {
            var12.field319 = 0;
            var12.field323 = false;
            var12.method143(var16, var17, var18, var13, var14, var15, arg6, arg7, arg8);
        } else if (arg9 == 1) {
            var12.field319 = 255 - var19;
            var12.field323 = false;
            var12.method143(var16, var17, var18, var13, var14, var15, arg6, arg7, arg8);
        } else {
            if (arg9 != 2) {
                throw new IllegalArgumentException();
            }
            var12.field319 = 128;
            var12.field323 = true;
            var12.method143(var16, var17, var18, var13, var14, var15, arg6, arg7, arg8);
        }
        var12.field320 = true;
    }

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "(Z)V", line = 112)
    public final void method329(boolean arg0) {
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)V", line = 115)
    public final void method333(int arg0) {
        super.field1658 = arg0;
        super.field1657 = new class163[super.field1658];
        for (int var2 = 0; var2 < super.field1658; ++var2) {
            super.field1657[var2] = new class163(this);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Ljava/lang/Runnable;)Luea;", line = 130)
    public final class285 method814(Runnable arg0) {
        for (int var2 = 0; var2 < super.field1658; ++var2) {
            if (super.field1657[var2].field3606 == arg0) {
                return super.field1657[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIIIII)V", line = 143)
    public final void method354(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class163 var8 = (class163) this.method814(Thread.currentThread());
        class26 var9 = var8.field1941;
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
            int var23 = arg0 - var9.method142();
            int var24 = arg1 - var9.method145();
            int var25 = var19 + var23;
            int var26 = var23 - var20;
            int var27 = var17 + var23 - var20;
            int var28 = var17 + var23 + var19;
            int var29 = var21 + var24;
            int var30 = var24 - var22;
            int var31 = var18 + var24 - var22;
            int var32 = var18 + var24 + var21;
            if (arg6 == 0) {
                var9.field319 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field319 = 255 - (arg4 >>> 24);
            }
            var9.field326 = var25 < 0 || var25 > var9.field327 || var26 < 0 || var26 > var9.field327 || var27 < 0 || var27 > var9.field327;
            var9.method133(var29, var30, var31, var25, var26, var27, arg4);
            var9.field326 = var25 < 0 || var25 > var9.field327 || var27 < 0 || var27 > var9.field327 || var28 < 0 || var28 > var9.field327;
            var9.method133(var29, var31, var32, var25, var27, var28, arg4);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Laca;IIII)V", line = 216)
    public final void method806(class663 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg0.field9425;
        int var8 = arg4 << 1;
        if (var6 == -1) {
            this.method370(arg1, arg2, arg4, arg0.field9427, 1);
        } else {
            if (super.field1698 != var6) {
                class458 var9 = (class458) super.field1691.method3690((byte) -35, (long) var6);
                if (var9 == null) {
                    int[] var10 = this.method811(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = this.method804(var6) ? 64 : 128;
                    var9 = this.method326(var10, 0, var11, var11, var11);
                    super.field1691.method3683(var9, (byte) -82, (long) var6);
                }
                super.field1698 = var6;
                super.field1699 = var9;
            }
            ++var8;
            super.field1699.method413(arg1 - arg4, arg2 - arg4, var8, var8, 0, arg0.field9427, 1);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 255)
    public final void method325(Canvas arg0) {
        class309 var2 = (class309) super.field1650.method3234((byte) -124, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method1519((byte) 121);
            class309 var3 = class292.method1647(arg0, (byte) 99);
            super.field1650.method3235((long) arg0.hashCode(), -1, var3);
            if (super.field1652 == arg0 && super.field1684 == null) {
                super.field1653 = var3;
                super.field1686 = var3.field4007;
                super.field1694 = var3.field4012;
                super.field1670 = var3.field4013;
                this.method810();
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 274)
    public final void method284(Canvas arg0) {
        if (arg0 != null) {
            class309 var2 = (class309) super.field1650.method3234((byte) -44, (long) arg0.hashCode());
            if (var2 != null) {
                super.field1652 = arg0;
                super.field1653 = var2;
                if (super.field1684 == null) {
                    super.field1686 = var2.field4007;
                    super.field1694 = var2.field4012;
                    super.field1670 = var2.field4013;
                    this.method810();
                    return;
                }
            }
        } else {
            super.field1652 = null;
            super.field1653 = null;
            if (super.field1684 == null) {
                super.field1686 = null;
                super.field1694 = super.field1670 = 1;
                this.method810();
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "([Lba;Lq;[Lmr;I)V", line = 309)
    public final void method381(class350[] arg0, class389 arg1, class130[] arg2, int arg3) {
        class262[] var5 = new class262[arg0.length];
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class262) arg0[var6];
            }
        }
        class262 var7 = class262.method1490(this, var5);
        var7.method907(arg1, arg2 != null ? arg2[0] : null, (class211) null, arg3);
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(IIIIIIIIII)V", line = 324)
    public final void method809(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 0 && arg4 != 0) {
            if (arg6 != 65535 && !super.field8990.method846((byte) -107, arg6).field5492) {
                if (super.field1698 != arg6) {
                    class458 var11 = (class458) super.field1691.method3690((byte) -3, (long) arg6);
                    if (var11 == null) {
                        int[] var12 = this.method811(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = this.method804(arg6) ? 64 : 128;
                        var11 = this.method326(var12, 0, var13, var13, var13);
                        super.field1691.method3683(var11, (byte) 96, (long) arg6);
                    }
                    super.field1698 = arg6;
                    super.field1699 = var11;
                }
                super.field1699.method413(arg0 - arg3, arg1 - arg4, arg3 << 1, arg4 << 1, arg8, arg7, arg9);
            } else {
                this.method370(arg0, arg1, arg3, arg7, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(II[[I[[IIII)Ld;", line = 357)
    public final class137 method282(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class632(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lqda;IIII)Lba;", line = 360)
    public final class350 method375(class90 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class262(this, arg0, arg1, arg3, arg4, arg2);
    }
}
