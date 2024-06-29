import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class45 extends class309 {

    @OriginalMember(owner = "client!jca", name = "Jb", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!jca", name = "Kb", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!jca", name = "Nb", descriptor = "[I")
    public static int[] field638;

    @OriginalMember(owner = "client!jca", name = "sb", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!jca", name = "tb", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!jca", name = "ub", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!jca", name = "vb", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!jca", name = "wb", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!jca", name = "xb", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!jca", name = "yb", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!jca", name = "zb", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!jca", name = "Ab", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!jca", name = "Bb", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!jca", name = "Cb", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!jca", name = "Db", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!jca", name = "Eb", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!jca", name = "Fb", descriptor = "I")
    private int field630;

    @OriginalMember(owner = "client!jca", name = "Gb", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!jca", name = "Hb", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!jca", name = "Ib", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!jca", name = "Lb", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!jca", name = "Mb", descriptor = "I")
    private int field637;

    @OriginalMember(owner = "client!jca", name = "rb", descriptor = "[I")
    public int[] field616;

    static {
        new class567("Adventurer", "Abenteurer", "Aventurier", "Aventureiro");
        field634 = 0;
        field635 = 0;
        field638 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIIIIII)V", line = 5)
    public final void method393(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field633;
        class421 var8 = (class421) this.method395(Thread.currentThread());
        class348 var9 = var8.field6187;
        int var10 = -arg0 + arg2;
        int var11 = -arg1 + arg3;
        int var12 = var10 >= 0 ? var10 : -var10;
        int var13 = ~var11 > -1 ? -var11 : var11;
        int var14 = var12;
        if (var12 < var13) {
            var14 = var13;
        }
        if (~var14 != -1) {
            int var15 = (var10 << 16) / var14;
            int var16 = (var11 << 16) / var14;
            int var17 = (var15 >> 16) + var10;
            int var18 = (var16 >> 16) + var11;
            if (~var15 > ~var16) {
                var16 = -var16;
            } else {
                var15 = -var15;
            }
            int var19 = arg5 * var16 >> 17;
            int var20 = arg5 * var16 + 1 >> 17;
            int var21 = arg5 * var15 >> 17;
            int var22 = arg0 - var9.method2113();
            int var23 = arg5 * var15 + 1 >> 17;
            int var24 = arg1 - var9.method2122();
            int var25 = var19 + var22;
            int var26 = -var20 + var22;
            int var27 = -var20 + var22 + var17;
            int var28 = var17 + var22 + var19;
            int var29 = var21 + var24;
            int var30 = -var23 + var24;
            int var31 = var18 + var24 + -var23;
            int var32 = var18 + var24 - -var21;
            if (arg6 != 0) {
                if (~arg6 != -2) {
                    throw new IllegalArgumentException();
                }
                var9.field4991 = 255 - (arg4 >>> 24);
            } else {
                var9.field4991 = 0;
            }
            var9.field4989 = ~var25 > -1 || var25 > var9.field4988 || var26 < 0 || ~var26 < ~var9.field4988 || ~var27 > -1 || var9.field4988 < var27;
            var9.method2115(var29, var30, var31, var25, var26, var27, 0, 0, 0, arg4);
            var9.field4989 = var25 < 0 || ~var9.field4988 > ~var25 || ~var26 > -1 || ~var9.field4988 > ~var26 || var28 < 0 || var28 > var9.field4988;
            var9.method2115(var29, var31, var32, var25, var27, var28, 0, 0, 0, arg4);
        }
    }

    @OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ln;)V", line = 83)
    public class45(Canvas arg0, class472 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 94)
    public final void method394(Canvas arg0) {
        if (arg0 != null) {
            class453 var2 = (class453) super.field4474.method740(0, (long) arg0.hashCode());
            if (var2 != null) {
                super.field4471 = var2;
                super.field4475 = arg0;
                if (super.field4517 == null) {
                    super.field4497 = var2.field6566;
                    super.field4515 = var2.field6564;
                    super.field4481 = var2.field6565;
                    if (~this.field630 != ~super.field4481 || ~this.field637 != ~super.field4497) {
                        this.field637 = super.field4497;
                        this.field630 = super.field4481;
                        this.field616 = new int[this.field637 * this.field630];
                    }
                    this.method1930();
                }
            }
        } else {
            super.field4475 = null;
            super.field4471 = null;
            if (super.field4517 == null) {
                super.field4515 = null;
                super.field4481 = super.field4497 = 1;
                this.field630 = this.field637 = 1;
                this.method1930();
            }
        }
        ++field627;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(Ljava/lang/Runnable;)Lkw;", line = 145)
    public final class174 method395(Runnable arg0) {
        ++field617;
        for (int var2 = 0; super.field4502 > var2; ++var2) {
            if (super.field4499[var2].field2516 == arg0) {
                return super.field4499[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!jca", name = "E", descriptor = "()V", line = 165)
    public final void method396() {
        super.field4516 = -super.field4489 + super.field4501;
        super.field4514 = super.field4484 - super.field4489;
        super.field4509 = -super.field4511 + super.field4483;
        ++field625;
        super.field4510 = -super.field4511 + super.field4512;
        for (int var1 = 0; ~var1 > ~super.field4502; ++var1) {
            class348 var5 = ((class421) super.field4499[var1]).field6187;
            var5.field4987 = -super.field4484 + super.field4489;
            var5.field4988 = -super.field4484 + super.field4501;
            var5.field4992 = -super.field4512 + super.field4511;
            var5.field4985 = super.field4483 - super.field4512;
        }
        int var2 = super.field4512 * super.field4481 + super.field4484;
        for (int var3 = super.field4512; ~var3 > ~super.field4483; ++var3) {
            for (int var4 = 0; var4 < super.field4502; ++var4) {
                ((class421) super.field4499[var4]).field6187.field4990[-super.field4512 + var3] = var2;
            }
            var2 += super.field4481;
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "([Lr;Lsh;Lm;[Lpaa;I)V", line = 208)
    public final void method397(class519[] arg0, class616 arg1, class105 arg2, class315[] arg3, int arg4) {
        ++field623;
        class84[] var6 = new class84[arg0.length];
        for (int var7 = 0; ~var7 > ~arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class84) arg0[var7];
            }
        }
        class84 var8 = class84.method764(this, var6);
        var8.method1446(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
    }

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "(I)V", line = 229)
    public final void method398(int arg0) {
        ++field626;
        super.field4499[arg0].method1198(Thread.currentThread(), 8);
    }

    @OriginalMember(owner = "client!jca", name = "h", descriptor = "(I)V", line = 240)
    public final void method399(int arg0) {
        super.field4499[arg0].method1198((Runnable) null, 8);
        ++field629;
    }

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "()V", line = 251)
    public final void method142() {
        ++field620;
        int var1 = this.field616.length;
        int var2 = 7 & -var1 + var1;
        int var3 = 0;
        while (~var2 < ~var3) {
            this.field616[var3++] = Integer.MAX_VALUE;
            this.field616[var3++] = Integer.MAX_VALUE;
            this.field616[var3++] = Integer.MAX_VALUE;
            this.field616[var3++] = Integer.MAX_VALUE;
            this.field616[var3++] = Integer.MAX_VALUE;
            this.field616[var3++] = Integer.MAX_VALUE;
            this.field616[var3++] = Integer.MAX_VALUE;
            this.field616[var3++] = Integer.MAX_VALUE;
        }
        while (~var1 < ~var3) {
            this.field616[var3++] = Integer.MAX_VALUE;
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lld;IIII)Lr;", line = 280)
    public final class519 method400(class560 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field628;
        return new class84(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!jca", name = "p", descriptor = "(I)V", line = 288)
    public static void method401(int arg0) {
        if (arg0 != 99) {
            method401(-28);
        }
        field638 = null;
    }

    @OriginalMember(owner = "client!jca", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 299)
    public final void method402(Canvas arg0) {
        ++field621;
        class453 var2 = (class453) super.field4474.method740(0, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method911(-52);
            class453 var3 = class509.method2862(arg0, true);
            super.field4474.method737((long) arg0.hashCode(), (byte) 92, var3);
            if (super.field4475 == arg0 && super.field4517 == null) {
                super.field4471 = var3;
                super.field4515 = var3.field6564;
                super.field4497 = var3.field6566;
                super.field4481 = var3.field6565;
                this.method1930();
                return;
            }
        }
    }

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "(I)V", line = 334)
    public final void method403(int arg0) {
        ++field622;
        super.field4502 = arg0;
        super.field4499 = new class421[super.field4502];
        for (int var2 = 0; ~super.field4502 < ~var2; ++var2) {
            super.field4499[var2] = new class421(this);
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIIIIIIIII)V", line = 352)
    public final void method404(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field636;
        class421 var11 = (class421) this.method395(Thread.currentThread());
        class348 var12 = var11.field6187;
        var12.field4989 = true;
        var12.field4982 = false;
        int var13 = arg6 >>> 24;
        if (~arg9 == -1 || arg9 == 1 && var13 == 255) {
            var12.field4991 = 0;
            var12.field4981 = false;
            var12.method2108(arg1, arg3, arg5, arg0, arg2, arg4, 0, 0, 0, arg6, arg7, arg8);
        } else if (arg9 == 1) {
            var12.field4981 = false;
            var12.field4991 = 255 - var13;
            var12.method2108(arg1, arg3, arg5, arg0, arg2, arg4, 0, 0, 0, arg6, arg7, arg8);
        } else {
            if (arg9 != 2) {
                throw new IllegalArgumentException();
            }
            var12.field4991 = 128;
            var12.field4981 = true;
            var12.method2108(arg1, arg3, arg5, arg0, arg2, arg4, 0, 0, 0, arg6, arg7, arg8);
        }
        var12.field4982 = true;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(II[[I[[IIII)Lsa;", line = 398)
    public final class542 method405(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field631;
        return new class557(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "([Lr;Lm;[Lpaa;I)V", line = 408)
    public final void method406(class519[] arg0, class105 arg1, class315[] arg2, int arg3) {
        for (int var5 = 0; var5 < arg0.length; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method1379(arg1, arg2 != null ? arg2[0] : null, arg3);
            }
        }
        ++field618;
    }

    @OriginalMember(owner = "client!jca", name = "B", descriptor = "()Z", line = 424)
    public final boolean method407() {
        ++field632;
        return true;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IBI)I", line = 432)
    public static final int method408(int arg0, byte arg1, int arg2) {
        if (arg1 != 31) {
            field635 = 125;
        }
        ++field619;
        return arg2 != 1 && ~arg2 != -4 ? class300.field4331[arg0 & 3] : class440.field6423[3 & arg0];
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IILjava/lang/String;)V", line = 449)
    public static final void method409(int arg0, int arg1, String arg2) {
        if (arg0 >= 4) {
            ++field624;
            class21 var3 = class601.method3413(arg1, 2, (byte) 102);
            var3.method230(18340);
            var3.field299 = arg2;
        }
    }
}
