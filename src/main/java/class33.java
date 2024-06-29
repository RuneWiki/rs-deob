import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class33 extends class647 {

    @OriginalMember(owner = "client!waa", name = "sb", descriptor = "Luda;")
    public static class509 field495 = new class509(1);

    @OriginalMember(owner = "client!waa", name = "pb", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!waa", name = "qb", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!waa", name = "rb", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!waa", name = "tb", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!waa", name = "ub", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!waa", name = "vb", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!waa", name = "wb", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!waa", name = "xb", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!waa", name = "yb", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!waa", name = "zb", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!waa", name = "Ab", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!waa", name = "Bb", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!waa", name = "Cb", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!waa", name = "Db", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!waa", name = "Eb", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!waa", name = "Gb", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!waa", name = "Hb", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!waa", name = "Fb", descriptor = "Log;")
    public static class98 field508;

    @OriginalMember(owner = "client!waa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method187(Canvas arg0) {
        ++field497;
        class179 var2 = (class179) super.field9356.method3476((long) arg0.hashCode(), (byte) 28);
        if (var2 != null) {
            var2.method589(-8880);
            class179 var3 = class232.method1467(arg0, (byte) 113);
            super.field9356.method3475(-125, var3, (long) arg0.hashCode());
            if (super.field9354 == arg0 && super.field9386 == null) {
                super.field9401 = var3.field2303;
                super.field9359 = var3;
                super.field9375 = var3.field2302;
                super.field9376 = var3.field2308;
                this.method3727();
                return;
            }
        }
    }

    @OriginalMember(owner = "client!waa", name = "E", descriptor = "()V")
    public final void method188() {
        super.field9373 = -super.field9365 + super.field9395;
        super.field9368 = -super.field9367 + super.field9385;
        ++field503;
        super.field9383 = -super.field9365 + super.field9380;
        super.field9393 = super.field9382 - super.field9367;
        for (int var1 = 0; ~var1 > ~super.field9398; ++var1) {
            class169 var5 = ((class567) super.field9397[var1]).field7928;
            var5.field2135 = -super.field9395 + super.field9365;
            var5.field2132 = -super.field9382 + super.field9385;
            var5.field2141 = super.field9380 - super.field9395;
            var5.field2139 = -super.field9382 + super.field9367;
        }
        int var2 = super.field9382 * super.field9375 + super.field9395;
        for (int var3 = super.field9382; ~var3 > ~super.field9385; ++var3) {
            for (int var4 = 0; ~var4 > ~super.field9398; ++var4) {
                ((class567) super.field9397[var4]).field7928.field2140[-super.field9382 + var3] = var2;
            }
            var2 += super.field9375;
        }
    }

    @OriginalMember(owner = "client!waa", name = "n", descriptor = "(I)V")
    public static final void method189(int arg0) {
        ++field509;
        int var1 = class512.field7133;
        if (arg0 != -1396164368) {
            field508 = null;
        }
        int[] var2 = class514.field7144;
        for (int var3 = 0; ~var3 > ~var1; ++var3) {
            class20 var9 = class364.field5092[var2[var3]];
            if (var9 != null && ~var9.field409 < -1) {
                --var9.field409;
                if (var9.field409 == 0) {
                    var9.field385 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class551.field7652; ++var4) {
            long var5 = (long) class286.field3739[var4];
            class480 var7 = (class480) class131.field1619.method3476(var5, (byte) 28);
            if (var7 != null) {
                class585 var8 = var7.field6729;
                if (var8.field409 > 0) {
                    --var8.field409;
                    if (~var8.field409 == -1) {
                        var8.field385 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!waa", name = "o", descriptor = "(I)V")
    public static void method190(int arg0) {
        if (arg0 == 1) {
            field495 = null;
            field508 = null;
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "([IZIZLuq;I)Lem;")
    public static final class600 method191(int[] arg0, boolean arg1, int arg2, boolean arg3, class313 arg4, int arg5) {
        if (!arg1) {
            field508 = null;
        }
        ++field504;
        if (!arg4.field4227 && (!class506.method2832(arg5, 3) || !class506.method2832(arg2, 3))) {
            return !arg4.field4243 ? new class600(arg4, arg5, arg2, class468.method2685(arg5, false), class468.method2685(arg2, false), arg0) : new class600(arg4, 34037, arg5, arg2, arg3, arg0);
        } else {
            return new class600(arg4, 3553, arg5, arg2, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ln;)V")
    public class33(Canvas arg0, class473 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(IIIIIII)V")
    public final void method192(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field506;
        class567 var8 = (class567) this.method199(Thread.currentThread());
        class169 var9 = var8.field7928;
        int var10 = -arg0 + arg2;
        int var11 = -arg1 + arg3;
        int var12 = var10 < 0 ? -var10 : var10;
        int var13 = var11 >= 0 ? var11 : -var11;
        int var14 = var12;
        if (~var13 < ~var12) {
            var14 = var13;
        }
        if (var14 != 0) {
            int var15 = (var10 << 16) / var14;
            int var16 = (var11 << 16) / var14;
            int var17 = (var15 >> 16) + var10;
            int var18 = (var16 >> 16) + var11;
            if (~var16 < ~var15) {
                var16 = -var16;
            } else {
                var15 = -var15;
            }
            int var19 = arg5 * var16 >> 17;
            int var20 = arg5 * var16 + 1 >> 17;
            int var21 = arg5 * var15 >> 17;
            int var22 = arg0 - var9.method1012();
            int var23 = arg5 * var15 + 1 >> 17;
            int var24 = arg1 - var9.method1009();
            int var25 = var19 + var22;
            int var26 = -var20 + var22;
            int var27 = var17 + var22 + -var20;
            int var28 = var19 + var22 + var17;
            int var29 = var21 + var24;
            int var30 = -var23 + var24;
            int var31 = -var23 + var24 + var18;
            int var32 = var21 + var24 + var18;
            if (arg6 != 0) {
                if (~arg6 != -2) {
                    throw new IllegalArgumentException();
                }
                var9.field2144 = 255 - (arg4 >>> 24);
            } else {
                var9.field2144 = 0;
            }
            var9.field2142 = var25 < 0 || ~var9.field2141 > ~var25 || var26 < 0 || var26 > var9.field2141 || var27 < 0 || var27 > var9.field2141;
            var9.method1008(var29, var30, var31, var25, var26, var27, arg4);
            var9.field2142 = ~var25 > -1 || var9.field2141 < var25 || var26 < 0 || ~var9.field2141 > ~var26 || ~var28 > -1 || var9.field2141 < var28;
            var9.method1008(var29, var31, var32, var25, var27, var28, arg4);
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "([Lr;Lkw;Lm;[Leca;I)V")
    public final void method193(class521[] arg0, class174 arg1, class105 arg2, class378[] arg3, int arg4) {
        ++field507;
        class469[] var6 = new class469[arg0.length];
        for (int var7 = 0; ~var7 > ~arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class469) arg0[var7];
            }
        }
        class469 var8 = class469.method2687(this, var6);
        var8.method1685(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
    }

    @OriginalMember(owner = "client!waa", name = "f", descriptor = "(I)V")
    public final void method194(int arg0) {
        super.field9398 = arg0;
        ++field493;
        super.field9397 = new class567[super.field9398];
        for (int var2 = 0; ~var2 > ~super.field9398; ++var2) {
            super.field9397[var2] = new class567(this);
        }
    }

    @OriginalMember(owner = "client!waa", name = "x", descriptor = "()Z")
    public final boolean method195() {
        ++field496;
        return false;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field500;
        class567 var11 = (class567) this.method199(Thread.currentThread());
        class169 var12 = var11.field7928;
        int var13 = arg0 - super.field9373;
        int var14 = arg4 - super.field9373;
        int var15 = arg1 - super.field9393;
        var12.field2136 = false;
        var12.field2142 = true;
        int var16 = arg3 - super.field9393;
        int var17 = arg5 - super.field9393;
        int var18 = arg2 - super.field9373;
        int var19 = arg6 >>> 24;
        if (arg9 == 0 || ~arg9 == -2 && var19 == 255) {
            var12.field2143 = false;
            var12.field2144 = 0;
            var12.method1007(var15, var16, var17, var13, var18, var14, arg6, arg7, arg8);
        } else if (arg9 == 1) {
            var12.field2143 = false;
            var12.field2144 = -var19 + 255;
            var12.method1007(var15, var16, var17, var13, var18, var14, arg6, arg7, arg8);
        } else {
            if (arg9 != 2) {
                throw new IllegalArgumentException();
            }
            var12.field2143 = true;
            var12.field2144 = 128;
            var12.method1007(var15, var16, var17, var13, var18, var14, arg6, arg7, arg8);
        }
        var12.field2136 = true;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lfp;IIII)Lr;")
    public final class521 method197(class528 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field498;
        return new class469(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!waa", name = "d", descriptor = "(I)V")
    public final void method198(int arg0) {
        ++field505;
        super.field9397[arg0].method2748(Thread.currentThread(), (byte) -79);
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Ljava/lang/Runnable;)Liw;")
    public final class489 method199(Runnable arg0) {
        ++field510;
        for (int var2 = 0; ~super.field9398 < ~var2; ++var2) {
            if (super.field9397[var2].field6808 == arg0) {
                return super.field9397[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(II[[I[[IIII)Lsa;")
    public final class544 method200(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field492;
        return new class198(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method201(Canvas arg0) {
        ++field501;
        if (arg0 == null) {
            super.field9354 = null;
            super.field9359 = null;
            if (super.field9386 == null) {
                super.field9376 = null;
                super.field9375 = super.field9401 = 1;
                this.method3727();
            }
        } else {
            class179 var2 = (class179) super.field9356.method3476((long) arg0.hashCode(), (byte) 28);
            if (var2 != null) {
                super.field9354 = arg0;
                super.field9359 = var2;
                if (super.field9386 == null) {
                    super.field9375 = var2.field2302;
                    super.field9376 = var2.field2308;
                    super.field9401 = var2.field2303;
                    this.method3727();
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "([Lr;Lm;[Leca;I)V")
    public final void method202(class521[] arg0, class105 arg1, class378[] arg2, int arg3) {
        ++field502;
        class469[] var5 = new class469[arg0.length];
        for (int var6 = 0; ~var6 > ~arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class469) arg0[var6];
            }
        }
        class469 var7 = class469.method2687(this, var5);
        var7.method1685(arg1, arg2 == null ? null : arg2[0], (class174) null, arg3);
    }

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "(I)V")
    public final void method203(int arg0) {
        super.field9397[arg0].method2748((Runnable) null, (byte) -127);
        ++field499;
    }
}
