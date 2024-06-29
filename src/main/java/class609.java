import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class609 extends class647 {

    @OriginalMember(owner = "client!hh", name = "Lb", descriptor = "Ldm;")
    public static class368 field8765 = new class368();

    @OriginalMember(owner = "client!hh", name = "pb", descriptor = "I")
    public static int field8743;

    @OriginalMember(owner = "client!hh", name = "qb", descriptor = "I")
    public static int field8744;

    @OriginalMember(owner = "client!hh", name = "rb", descriptor = "I")
    public static int field8745;

    @OriginalMember(owner = "client!hh", name = "sb", descriptor = "I")
    public static int field8746;

    @OriginalMember(owner = "client!hh", name = "tb", descriptor = "I")
    private int field8747;

    @OriginalMember(owner = "client!hh", name = "ub", descriptor = "I")
    public static int field8748;

    @OriginalMember(owner = "client!hh", name = "vb", descriptor = "I")
    public static int field8749;

    @OriginalMember(owner = "client!hh", name = "wb", descriptor = "I")
    public static int field8750;

    @OriginalMember(owner = "client!hh", name = "xb", descriptor = "I")
    public static int field8751;

    @OriginalMember(owner = "client!hh", name = "yb", descriptor = "I")
    public static int field8752;

    @OriginalMember(owner = "client!hh", name = "zb", descriptor = "I")
    public static int field8753;

    @OriginalMember(owner = "client!hh", name = "Bb", descriptor = "I")
    public static int field8755;

    @OriginalMember(owner = "client!hh", name = "Db", descriptor = "I")
    private int field8757;

    @OriginalMember(owner = "client!hh", name = "Eb", descriptor = "I")
    public static int field8758;

    @OriginalMember(owner = "client!hh", name = "Fb", descriptor = "I")
    public static int field8759;

    @OriginalMember(owner = "client!hh", name = "Gb", descriptor = "I")
    public static int field8760;

    @OriginalMember(owner = "client!hh", name = "Hb", descriptor = "I")
    public static int field8761;

    @OriginalMember(owner = "client!hh", name = "Ib", descriptor = "I")
    public static int field8762;

    @OriginalMember(owner = "client!hh", name = "Jb", descriptor = "I")
    public static int field8763;

    @OriginalMember(owner = "client!hh", name = "Kb", descriptor = "I")
    public static int field8764;

    @OriginalMember(owner = "client!hh", name = "Ab", descriptor = "Lok;")
    public static class97 field8754;

    @OriginalMember(owner = "client!hh", name = "Cb", descriptor = "[I")
    public int[] field8756;

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ln;)V")
    public class609(Canvas arg0, class473 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method201(Canvas arg0) {
        ++field8759;
        if (arg0 == null) {
            super.field9354 = null;
            super.field9359 = null;
            if (super.field9386 == null) {
                super.field9376 = null;
                this.field8757 = this.field8747 = 1;
                super.field9375 = super.field9401 = 1;
                this.method3727();
            }
        } else {
            class179 var2 = (class179) super.field9356.method3476((long) arg0.hashCode(), (byte) 28);
            if (var2 != null) {
                super.field9354 = arg0;
                super.field9359 = var2;
                if (super.field9386 == null) {
                    super.field9401 = var2.field2303;
                    super.field9375 = var2.field2302;
                    super.field9376 = var2.field2308;
                    if (super.field9375 != this.field8757 || ~super.field9401 != ~this.field8747) {
                        this.field8747 = super.field9401;
                        this.field8757 = super.field9375;
                        this.field8756 = new int[this.field8757 * this.field8747];
                    }
                    this.method3727();
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field8744;
        class298 var11 = (class298) this.method199(Thread.currentThread());
        class518 var12 = var11.field3899;
        int var13 = arg1 - super.field9393;
        int var14 = arg5 - super.field9393;
        int var15 = arg2 - super.field9373;
        int var16 = arg0 - super.field9373;
        var12.field7229 = false;
        var12.field7232 = true;
        int var17 = arg3 - super.field9393;
        int var18 = arg4 - super.field9373;
        int var19 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var19 == 255) {
            var12.field7224 = 0;
            var12.field7221 = false;
            var12.method2891(var13, var17, var14, var16, var15, var18, 0, 0, 0, arg6, arg7, arg8);
        } else if (arg9 == 1) {
            var12.field7221 = false;
            var12.field7224 = 255 - var19;
            var12.method2891(var13, var17, var14, var16, var15, var18, 0, 0, 0, arg6, arg7, arg8);
        } else {
            if (arg9 != 2) {
                throw new IllegalArgumentException();
            }
            var12.field7221 = true;
            var12.field7224 = 128;
            var12.method2891(var13, var17, var14, var16, var15, var18, 0, 0, 0, arg6, arg7, arg8);
        }
        var12.field7229 = true;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II[[I[[IIII)Lsa;")
    public final class544 method200(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field8762;
        return new class163(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V")
    public final void method198(int arg0) {
        ++field8751;
        super.field9397[arg0].method2748(Thread.currentThread(), (byte) -96);
    }

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "(I)V")
    public final void method194(int arg0) {
        ++field8760;
        super.field9398 = arg0;
        super.field9397 = new class298[super.field9398];
        for (int var2 = 0; var2 < super.field9398; ++var2) {
            super.field9397[var2] = new class298(this);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "([Lr;Lm;[Leca;I)V")
    public final void method202(class521[] arg0, class105 arg1, class378[] arg2, int arg3) {
        ++field8746;
        for (int var5 = 0; ~var5 > ~arg0.length; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method1595(arg1, arg2 == null ? null : arg2[0], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILge;)Lai;")
    public static final class429 method3484(int arg0, class551 arg1) {
        if (arg0 != -3236) {
            return null;
        } else {
            ++field8763;
            return new class429(arg1.method3087(true), arg1.method3087(true), arg1.method3087(true), arg1.method3087(true), arg1.method3043((byte) 49), arg1.method3045(-128));
        }
    }

    @OriginalMember(owner = "client!hh", name = "E", descriptor = "()V")
    public final void method188() {
        ++field8743;
        super.field9383 = super.field9380 - super.field9365;
        super.field9393 = -super.field9367 + super.field9382;
        super.field9368 = -super.field9367 + super.field9385;
        super.field9373 = -super.field9365 + super.field9395;
        for (int var1 = 0; ~var1 > ~super.field9398; ++var1) {
            class518 var5 = ((class298) super.field9397[var1]).field3899;
            var5.field7234 = super.field9367 - super.field9382;
            var5.field7235 = super.field9380 - super.field9395;
            var5.field7223 = -super.field9382 + super.field9385;
            var5.field7222 = -super.field9395 + super.field9365;
        }
        int var2 = super.field9382 * super.field9375 - -super.field9395;
        for (int var3 = super.field9382; ~var3 > ~super.field9385; ++var3) {
            for (int var4 = 0; ~super.field9398 < ~var4; ++var4) {
                ((class298) super.field9397[var4]).field3899.field7231[var3 - super.field9382] = var2;
            }
            var2 += super.field9375;
        }
    }

    @OriginalMember(owner = "client!hh", name = "x", descriptor = "()Z")
    public final boolean method195() {
        ++field8753;
        return true;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/lang/Runnable;)Liw;")
    public final class489 method199(Runnable arg0) {
        ++field8758;
        for (int var2 = 0; var2 < super.field9398; ++var2) {
            if (super.field9397[var2].field6808 == arg0) {
                return super.field9397[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!hh", name = "D", descriptor = "()V")
    public final void method996() {
        ++field8750;
        int var1 = this.field8756.length;
        int var2 = -var1 + var1 & 7;
        int var3 = 0;
        while (var2 > var3) {
            this.field8756[var3++] = Integer.MAX_VALUE;
            this.field8756[var3++] = Integer.MAX_VALUE;
            this.field8756[var3++] = Integer.MAX_VALUE;
            this.field8756[var3++] = Integer.MAX_VALUE;
            this.field8756[var3++] = Integer.MAX_VALUE;
            this.field8756[var3++] = Integer.MAX_VALUE;
            this.field8756[var3++] = Integer.MAX_VALUE;
            this.field8756[var3++] = Integer.MAX_VALUE;
        }
        while (var1 > var3) {
            this.field8756[var3++] = Integer.MAX_VALUE;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIILbu;Lqa;I)V")
    public static final void method3485(int arg0, int arg1, int arg2, class137 arg3, class167 arg4, int arg5) {
        ++field8748;
        if (arg5 <= 44) {
            field8765 = null;
        }
        class264 var6 = class376.field5232.method2485(3146, arg3.field1730);
        if (var6.field3365 != -1) {
            int var7;
            if (!arg3.field1746) {
                var7 = 0;
            } else {
                int var8 = arg3.field1721 + arg0;
                var7 = var8 & 3;
            }
            class116 var9 = var6.method1629(var7, arg3.field1739, arg4, (byte) 123);
            if (var9 != null) {
                int var10 = arg3.field1717;
                int var11 = arg3.field1670;
                if ((1 & var7) == 1) {
                    var11 = arg3.field1717;
                    var10 = arg3.field1670;
                }
                int var12 = var9.method627();
                int var13 = var9.method631();
                if (var6.field3363) {
                    var13 = var11 * 4;
                    var12 = var10 * 4;
                }
                if (~var6.field3372 == -1) {
                    var9.method638(arg2, -((var11 + -1) * 4) + arg1, var12, var13);
                } else {
                    var9.method625(arg2, -(var11 * 4) + 4 + arg1, var12, var13, 0, var6.field3372 | -16777216, 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "([Lr;Lkw;Lm;[Leca;I)V")
    public final void method193(class521[] arg0, class174 arg1, class105 arg2, class378[] arg3, int arg4) {
        ++field8752;
        class519[] var6 = new class519[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class519) arg0[var7];
            }
        }
        class519 var8 = class519.method2894(this, var6);
        var8.method1685(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(II)Ljq;")
    public static final class447 method3486(int arg0, int arg1) {
        ++field8755;
        int var2 = arg0 >> 16;
        int var3 = arg0 & 65535;
        if (class508.field7087[var2] == null || class508.field7087[var2][var3] == null) {
            boolean var4 = class134.method708(-44, var2);
            if (!var4) {
                return null;
            }
        }
        if (arg1 != 983030160) {
            field8754 = null;
        }
        return class508.field7087[var2][var3];
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method187(Canvas arg0) {
        ++field8745;
        class179 var2 = (class179) super.field9356.method3476((long) arg0.hashCode(), (byte) 28);
        if (var2 != null) {
            var2.method589(-8880);
            class179 var3 = class232.method1467(arg0, (byte) 126);
            super.field9356.method3475(-117, var3, (long) arg0.hashCode());
            if (super.field9354 == arg0 && super.field9386 == null) {
                super.field9359 = var3;
                super.field9401 = var3.field2303;
                super.field9376 = var3.field2308;
                super.field9375 = var3.field2302;
                this.method3727();
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "(I)V")
    public static void method3487(int arg0) {
        if (arg0 != -326298800) {
            method3484(50, (class551) null);
        }
        field8754 = null;
        field8765 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lfp;IIII)Lr;")
    public final class521 method197(class528 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8749;
        return new class519(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
    public final void method203(int arg0) {
        super.field9397[arg0].method2748((Runnable) null, (byte) -112);
        ++field8761;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIII)V")
    public final void method192(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field8764;
        class298 var8 = (class298) this.method199(Thread.currentThread());
        class518 var9 = var8.field3899;
        int var10 = -arg0 + arg2;
        int var11 = -arg1 + arg3;
        int var12 = var10 < 0 ? -var10 : var10;
        int var13 = ~var11 > -1 ? -var11 : var11;
        int var14 = var12;
        if (~var13 < ~var12) {
            var14 = var13;
        }
        if (~var14 != -1) {
            int var15 = (var10 << 16) / var14;
            int var16 = (var15 >> 16) + var10;
            int var17 = (var11 << 16) / var14;
            int var18 = (var17 >> 16) + var11;
            if (var15 < var17) {
                var17 = -var17;
            } else {
                var15 = -var15;
            }
            int var19 = arg5 * var17 >> 17;
            int var20 = arg5 * var17 + 1 >> 17;
            int var21 = arg5 * var15 >> 17;
            int var22 = arg0 - var9.method2879();
            int var23 = arg5 * var15 - -1 >> 17;
            int var24 = arg1 - var9.method2893();
            int var25 = var19 + var22;
            int var26 = -var20 + var22;
            int var27 = -var20 + var16 + var22;
            int var28 = var22 - -var16 - -var19;
            int var29 = var21 + var24;
            int var30 = -var23 + var24;
            int var31 = var18 + var24 - var23;
            int var32 = var18 + var24 - -var21;
            if (arg6 == 0) {
                var9.field7224 = 0;
            } else {
                if (~arg6 != -2) {
                    throw new IllegalArgumentException();
                }
                var9.field7224 = -(arg4 >>> 24) + 255;
            }
            var9.field7232 = ~var25 > -1 || var25 > var9.field7235 || ~var26 > -1 || var9.field7235 < var26 || var27 < 0 || ~var27 < ~var9.field7235;
            var9.method2885(var29, var30, var31, var25, var26, var27, 0, 0, 0, arg4);
            var9.field7232 = var25 < 0 || ~var9.field7235 > ~var25 || ~var26 > -1 || ~var26 < ~var9.field7235 || ~var28 > -1 || var9.field7235 < var28;
            var9.method2885(var29, var31, var32, var25, var27, var28, 0, 0, 0, arg4);
        }
    }
}
