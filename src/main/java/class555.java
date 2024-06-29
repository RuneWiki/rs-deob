import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class555 extends class67 {

    @OriginalMember(owner = "client!lc", name = "ob", descriptor = "Lid;")
    public static class502 field8258 = new class502(0, 0);

    @OriginalMember(owner = "client!lc", name = "Eb", descriptor = "I")
    public static int field8274 = 0;

    @OriginalMember(owner = "client!lc", name = "nb", descriptor = "I")
    public static int field8257;

    @OriginalMember(owner = "client!lc", name = "pb", descriptor = "I")
    public static int field8259;

    @OriginalMember(owner = "client!lc", name = "qb", descriptor = "I")
    public static int field8260;

    @OriginalMember(owner = "client!lc", name = "rb", descriptor = "I")
    public static int field8261;

    @OriginalMember(owner = "client!lc", name = "sb", descriptor = "I")
    public static int field8262;

    @OriginalMember(owner = "client!lc", name = "tb", descriptor = "I")
    public static int field8263;

    @OriginalMember(owner = "client!lc", name = "ub", descriptor = "I")
    public static int field8264;

    @OriginalMember(owner = "client!lc", name = "vb", descriptor = "I")
    public static int field8265;

    @OriginalMember(owner = "client!lc", name = "wb", descriptor = "I")
    public static int field8266;

    @OriginalMember(owner = "client!lc", name = "xb", descriptor = "I")
    public static int field8267;

    @OriginalMember(owner = "client!lc", name = "yb", descriptor = "I")
    public static int field8268;

    @OriginalMember(owner = "client!lc", name = "zb", descriptor = "I")
    public static int field8269;

    @OriginalMember(owner = "client!lc", name = "Bb", descriptor = "I")
    public static int field8271;

    @OriginalMember(owner = "client!lc", name = "Cb", descriptor = "I")
    public static int field8272;

    @OriginalMember(owner = "client!lc", name = "Db", descriptor = "I")
    public static int field8273;

    @OriginalMember(owner = "client!lc", name = "Ab", descriptor = "[[I")
    public static int[][] field8270;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 4)
    public final void method503(Canvas arg0) {
        ++field8260;
        class6 var2 = (class6) super.field815.method2799((long) arg0.hashCode(), true);
        if (var2 != null) {
            var2.method2457(-8422);
            class6 var3 = class440.method2561(arg0, (byte) -124);
            super.field815.method2797(-4234, var3, (long) arg0.hashCode());
            if (super.field812 == arg0 && super.field828 == null) {
                super.field823 = var3.field48;
                super.field846 = var3.field50;
                super.field858 = var3.field54;
                super.field813 = var3;
                this.method509();
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V", line = 35)
    public final void method459(int arg0) {
        ++field8273;
        super.field827[arg0].method204(false, Thread.currentThread());
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ln;)V", line = 49)
    public class555(Canvas arg0, class17 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([Lr;Lm;[Lpr;I)V", line = 53)
    public final void method507(class159[] arg0, class165 arg1, class381[] arg2, int arg3) {
        ++field8264;
        class318[] var5 = new class318[arg0.length];
        for (int var6 = 0; ~var6 > ~arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class318) arg0[var6];
            }
        }
        class318 var7 = class318.method1924(this, var5);
        var7.method562(arg1, arg2 == null ? null : arg2[0], (class283) null, arg3);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIIIIII)V", line = 75)
    public final void method523(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field8263;
        class240 var11 = (class240) this.method505(Thread.currentThread());
        class535 var12 = var11.field3455;
        var12.field7951 = false;
        var12.field7955 = true;
        int var13 = arg6 >>> 24;
        if (~arg9 == -1 || arg9 == 1 && ~var13 == -256) {
            var12.field7952 = 0;
            var12.field7950 = false;
            var12.method3236(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else if (arg9 == 1) {
            var12.field7950 = false;
            var12.field7952 = -var13 + 255;
            var12.method3236(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else {
            if (~arg9 != -3) {
                throw new IllegalArgumentException();
            }
            var12.field7950 = true;
            var12.field7952 = 128;
            var12.method3236(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        }
        var12.field7951 = true;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/Runnable;)Lrk;", line = 116)
    public final class30 method505(Runnable arg0) {
        ++field8267;
        for (int var2 = 0; var2 < super.field839; ++var2) {
            if (super.field827[var2].field339 == arg0) {
                return super.field827[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([Lr;Lrd;Lm;[Lpr;I)V", line = 135)
    public final void method452(class159[] arg0, class283 arg1, class165 arg2, class381[] arg3, int arg4) {
        ++field8269;
        class318[] var6 = new class318[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class318) arg0[var7];
            }
        }
        class318 var8 = class318.method1924(this, var6);
        var8.method562(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(II)Z", line = 157)
    public static final boolean method3354(int arg0, int arg1) {
        ++field8271;
        int var2 = -63 / ((arg0 - 74) / 52);
        if (~arg1 != -46 && ~arg1 != -47 && ~arg1 != -48 && arg1 != 11 && arg1 != 3) {
            return ~arg1 == -31 || ~arg1 == -1007;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIII)V", line = 179)
    public final void method467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field8266;
        class240 var8 = (class240) this.method505(Thread.currentThread());
        class535 var9 = var8.field3455;
        int var10 = arg2 - arg0;
        int var11 = -arg1 + arg3;
        int var12 = ~var10 <= -1 ? var10 : -var10;
        int var13 = var11 < 0 ? -var11 : var11;
        int var14 = var12;
        if (var12 < var13) {
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
            int var22 = arg0 - var9.method3234();
            int var23 = arg5 * var15 + 1 >> 17;
            int var24 = arg1 - var9.method3231();
            int var25 = var19 + var22;
            int var26 = -var20 + var22;
            int var27 = -var20 + var17 + var22;
            int var28 = var19 + var22 + var17;
            int var29 = var21 + var24;
            int var30 = -var23 + var24;
            int var31 = var24 - -var18 - var23;
            int var32 = var24 - -var18 + var21;
            if (arg6 != 0) {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field7952 = 255 - (arg4 >>> 24);
            } else {
                var9.field7952 = 0;
            }
            var9.field7955 = var25 < 0 || ~var25 < ~var9.field7948 || var26 < 0 || var9.field7948 < var26 || var27 < 0 || var27 > var9.field7948;
            var9.method3244(var29, var30, var31, var25, var26, var27, arg4);
            var9.field7955 = var25 < 0 || var9.field7948 < var25 || ~var26 > -1 || var9.field7948 < var26 || var28 < 0 || ~var9.field7948 > ~var28;
            var9.method3244(var29, var31, var32, var25, var27, var28, arg4);
        }
    }

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "(I)V", line = 258)
    public final void method502(int arg0) {
        ++field8268;
        super.field839 = arg0;
        super.field827 = new class240[super.field839];
        for (int var2 = 0; super.field839 > var2; ++var2) {
            super.field827[var2] = new class240(this);
        }
    }

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "()V", line = 276)
    public final void method425() {
        super.field842 = -super.field850 + super.field838;
        super.field840 = -super.field821 + super.field835;
        super.field855 = -super.field821 + super.field824;
        super.field857 = super.field831 - super.field850;
        ++field8265;
        for (int var1 = 0; ~var1 > ~super.field839; ++var1) {
            class535 var5 = ((class240) super.field827[var1]).field3455;
            var5.field7961 = -super.field824 + super.field821;
            var5.field7949 = super.field835 - super.field824;
            var5.field7954 = -super.field838 + super.field850;
            var5.field7948 = -super.field838 + super.field831;
        }
        int var2 = super.field824 * super.field823 - -super.field838;
        for (int var3 = super.field824; var3 < super.field835; ++var3) {
            for (int var4 = 0; ~super.field839 < ~var4; ++var4) {
                ((class240) super.field827[var4]).field3455.field7958[var3 - super.field824] = var2;
            }
            var2 += super.field823;
        }
    }

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "()Z", line = 321)
    public final boolean method499() {
        ++field8262;
        return false;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II[[I[[IIII)Lsa;", line = 329)
    public final class176 method458(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field8261;
        return new class324(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "(I)V", line = 337)
    public static void method3355(int arg0) {
        field8258 = null;
        if (arg0 != -305900624) {
            field8274 = -110;
        }
        field8270 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V", line = 349)
    public final void method461(int arg0) {
        super.field827[arg0].method204(false, (Runnable) null);
        ++field8259;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 357)
    public final void method444(Canvas arg0) {
        ++field8272;
        if (arg0 != null) {
            class6 var2 = (class6) super.field815.method2799((long) arg0.hashCode(), true);
            if (var2 != null) {
                super.field813 = var2;
                super.field812 = arg0;
                if (super.field828 == null) {
                    super.field846 = var2.field50;
                    super.field823 = var2.field48;
                    super.field858 = var2.field54;
                    this.method509();
                    return;
                }
            }
        } else {
            super.field812 = null;
            super.field813 = null;
            if (super.field828 != null) {
                return;
            }
            super.field858 = null;
            super.field823 = super.field846 = 1;
            this.method509();
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lfd;IIII)Lr;", line = 397)
    public final class159 method491(class451 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8257;
        return new class318(this, arg0, arg1, arg3, arg4, arg2);
    }
}
