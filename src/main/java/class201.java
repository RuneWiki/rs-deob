import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class201 extends class67 {

    @OriginalMember(owner = "client!lf", name = "sb", descriptor = "[I")
    public static int[] field2973 = new int[4];

    @OriginalMember(owner = "client!lf", name = "Cb", descriptor = "Lbw;")
    public static class591 field2983 = new class591(0, 0);

    @OriginalMember(owner = "client!lf", name = "Gb", descriptor = "Z")
    public static boolean field2987 = true;

    @OriginalMember(owner = "client!lf", name = "Ib", descriptor = "[I")
    public static int[] field2989 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!lf", name = "ob", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!lf", name = "pb", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!lf", name = "qb", descriptor = "I")
    private int field2971;

    @OriginalMember(owner = "client!lf", name = "rb", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!lf", name = "tb", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!lf", name = "ub", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!lf", name = "vb", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!lf", name = "wb", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!lf", name = "xb", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!lf", name = "yb", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!lf", name = "zb", descriptor = "I")
    private int field2980;

    @OriginalMember(owner = "client!lf", name = "Ab", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!lf", name = "Bb", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!lf", name = "Db", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!lf", name = "Eb", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!lf", name = "Fb", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!lf", name = "Hb", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!lf", name = "nb", descriptor = "[I")
    public int[] field2968;

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "()V")
    public final void method425() {
        ++field2972;
        super.field842 = -super.field850 + super.field838;
        super.field840 = super.field835 - super.field821;
        super.field855 = -super.field821 + super.field824;
        super.field857 = -super.field850 + super.field831;
        for (int var1 = 0; var1 < super.field839; ++var1) {
            class543 var5 = ((class484) super.field827[var1]).field6902;
            var5.field8129 = super.field835 - super.field824;
            var5.field8133 = -super.field824 + super.field821;
            var5.field8126 = -super.field838 + super.field831;
            var5.field8131 = -super.field838 + super.field850;
        }
        int var2 = super.field824 * super.field823 + super.field838;
        for (int var3 = super.field824; var3 < super.field835; ++var3) {
            for (int var4 = 0; ~super.field839 < ~var4; ++var4) {
                ((class484) super.field827[var4]).field6902.field8138[-super.field824 + var3] = var2;
            }
            var2 += super.field823;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
    public final void method461(int arg0) {
        ++field2969;
        super.field827[arg0].method204(false, (Runnable) null);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II[[I[[IIII)Lsa;")
    public final class176 method458(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field2976;
        return new class72(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ln;)V")
    public class201(Canvas arg0, class17 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lfd;IIII)Lr;")
    public final class159 method491(class451 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2981;
        return new class265(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "()V")
    public final void method465() {
        ++field2988;
        int var1 = this.field2968.length;
        int var2 = var1 - var1 & 7;
        int var3 = 0;
        while (~var3 > ~var2) {
            this.field2968[var3++] = Integer.MAX_VALUE;
            this.field2968[var3++] = Integer.MAX_VALUE;
            this.field2968[var3++] = Integer.MAX_VALUE;
            this.field2968[var3++] = Integer.MAX_VALUE;
            this.field2968[var3++] = Integer.MAX_VALUE;
            this.field2968[var3++] = Integer.MAX_VALUE;
            this.field2968[var3++] = Integer.MAX_VALUE;
            this.field2968[var3++] = Integer.MAX_VALUE;
        }
        while (var1 > var3) {
            this.field2968[var3++] = Integer.MAX_VALUE;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method523(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field2975;
        class484 var11 = (class484) this.method505(Thread.currentThread());
        class543 var12 = var11.field6902;
        var12.field8135 = false;
        var12.field8137 = true;
        int var13 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var13 == 255) {
            var12.field8130 = 0;
            var12.field8139 = false;
            var12.method3297(arg1, arg3, arg5, arg0, arg2, arg4, 0, 0, 0, arg6, arg7, arg8);
        } else if (~arg9 != -2) {
            if (~arg9 != -3) {
                throw new IllegalArgumentException();
            }
            var12.field8139 = true;
            var12.field8130 = 128;
            var12.method3297(arg1, arg3, arg5, arg0, arg2, arg4, 0, 0, 0, arg6, arg7, arg8);
        } else {
            var12.field8139 = false;
            var12.field8130 = 255 - var13;
            var12.method3297(arg1, arg3, arg5, arg0, arg2, arg4, 0, 0, 0, arg6, arg7, arg8);
        }
        var12.field8135 = true;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "([Lr;Lrd;Lm;[Lpr;I)V")
    public final void method452(class159[] arg0, class283 arg1, class165 arg2, class381[] arg3, int arg4) {
        ++field2984;
        class265[] var6 = new class265[arg0.length];
        for (int var7 = 0; ~var7 > ~arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class265) arg0[var7];
            }
        }
        class265 var8 = class265.method1669(this, var6);
        var8.method562(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "(I)V")
    public static void method1346(int arg0) {
        if (arg0 != -1) {
            method1346(-75);
        }
        field2989 = null;
        field2973 = null;
        field2983 = null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "([Lr;Lm;[Lpr;I)V")
    public final void method507(class159[] arg0, class165 arg1, class381[] arg2, int arg3) {
        ++field2979;
        for (int var5 = 0; arg0.length > var5; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method93(arg1, arg2 != null ? arg2[0] : null, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)V")
    public final void method459(int arg0) {
        super.field827[arg0].method204(false, Thread.currentThread());
        ++field2977;
    }

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "(I)V")
    public final void method502(int arg0) {
        super.field839 = arg0;
        ++field2974;
        super.field827 = new class484[super.field839];
        for (int var2 = 0; ~super.field839 < ~var2; ++var2) {
            super.field827[var2] = new class484(this);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/Runnable;)Lrk;")
    public final class30 method505(Runnable arg0) {
        ++field2985;
        for (int var2 = 0; super.field839 > var2; ++var2) {
            if (super.field827[var2].field339 == arg0) {
                return super.field827[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method503(Canvas arg0) {
        ++field2970;
        class6 var2 = (class6) super.field815.method2799((long) arg0.hashCode(), true);
        if (var2 != null) {
            var2.method2457(-8422);
            class6 var3 = class440.method2561(arg0, (byte) -126);
            super.field815.method2797(-4234, var3, (long) arg0.hashCode());
            if (super.field812 == arg0 && super.field828 == null) {
                super.field813 = var3;
                super.field823 = var3.field48;
                super.field846 = var3.field50;
                super.field858 = var3.field54;
                this.method509();
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method444(Canvas arg0) {
        ++field2986;
        if (arg0 != null) {
            class6 var2 = (class6) super.field815.method2799((long) arg0.hashCode(), true);
            if (var2 != null) {
                super.field812 = arg0;
                super.field813 = var2;
                if (super.field828 == null) {
                    super.field823 = var2.field48;
                    super.field846 = var2.field50;
                    super.field858 = var2.field54;
                    if (super.field823 != this.field2980 || ~super.field846 != ~this.field2971) {
                        this.field2980 = super.field823;
                        this.field2971 = super.field846;
                        this.field2968 = new int[this.field2980 * this.field2971];
                    }
                    this.method509();
                    return;
                }
            }
        } else {
            super.field813 = null;
            super.field812 = null;
            if (super.field828 != null) {
                return;
            }
            super.field858 = null;
            this.field2980 = this.field2971 = 1;
            super.field823 = super.field846 = 1;
            this.method509();
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIII)V")
    public final void method467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2982;
        class484 var8 = (class484) this.method505(Thread.currentThread());
        class543 var9 = var8.field6902;
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
            int var16 = (var15 >> 16) + var10;
            int var17 = (var11 << 16) / var14;
            int var18 = (var17 >> 16) + var11;
            if (var15 >= var17) {
                var15 = -var15;
            } else {
                var17 = -var17;
            }
            int var19 = arg5 * var17 >> 17;
            int var20 = arg5 * var17 + 1 >> 17;
            int var21 = arg5 * var15 >> 17;
            int var22 = arg0 - var9.method3298();
            int var23 = arg5 * var15 + 1 >> 17;
            int var24 = arg1 - var9.method3300();
            int var25 = var19 + var22;
            int var26 = var22 - var20;
            int var27 = var22 - -var16 + -var20;
            int var28 = var16 + var22 + var19;
            int var29 = var21 + var24;
            int var30 = -var23 + var24;
            int var31 = -var23 + var24 - -var18;
            int var32 = var18 + var24 - -var21;
            if (~arg6 == -1) {
                var9.field8130 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field8130 = -(arg4 >>> 24) + 255;
            }
            var9.field8137 = ~var25 > -1 || ~var25 < ~var9.field8126 || var26 < 0 || ~var26 < ~var9.field8126 || var27 < 0 || ~var9.field8126 > ~var27;
            var9.method3302(var29, var30, var31, var25, var26, var27, 0, 0, 0, arg4);
            var9.field8137 = var25 < 0 || var9.field8126 < var25 || var26 < 0 || var26 > var9.field8126 || ~var28 > -1 || ~var9.field8126 > ~var28;
            var9.method3302(var29, var31, var32, var25, var27, var28, 0, 0, 0, arg4);
        }
    }

    @OriginalMember(owner = "client!lf", name = "B", descriptor = "()Z")
    public final boolean method499() {
        ++field2978;
        return true;
    }
}
