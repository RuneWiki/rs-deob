import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class529 extends class164 {

    @OriginalMember(owner = "client!cm", name = "ub", descriptor = "I")
    public static int field7847 = 0;

    @OriginalMember(owner = "client!cm", name = "yb", descriptor = "[I")
    public static int[] field7851 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!cm", name = "mb", descriptor = "I")
    public static int field7839;

    @OriginalMember(owner = "client!cm", name = "nb", descriptor = "I")
    public static int field7840;

    @OriginalMember(owner = "client!cm", name = "ob", descriptor = "I")
    public static int field7841;

    @OriginalMember(owner = "client!cm", name = "pb", descriptor = "I")
    public static int field7842;

    @OriginalMember(owner = "client!cm", name = "qb", descriptor = "I")
    public static int field7843;

    @OriginalMember(owner = "client!cm", name = "rb", descriptor = "I")
    public static int field7844;

    @OriginalMember(owner = "client!cm", name = "sb", descriptor = "I")
    public static int field7845;

    @OriginalMember(owner = "client!cm", name = "vb", descriptor = "I")
    public static int field7848;

    @OriginalMember(owner = "client!cm", name = "wb", descriptor = "I")
    public static int field7849;

    @OriginalMember(owner = "client!cm", name = "xb", descriptor = "I")
    private int field7850;

    @OriginalMember(owner = "client!cm", name = "zb", descriptor = "I")
    public static int field7852;

    @OriginalMember(owner = "client!cm", name = "Ab", descriptor = "I")
    public static int field7853;

    @OriginalMember(owner = "client!cm", name = "Bb", descriptor = "I")
    public static int field7854;

    @OriginalMember(owner = "client!cm", name = "Cb", descriptor = "I")
    public static int field7855;

    @OriginalMember(owner = "client!cm", name = "Db", descriptor = "I")
    public static int field7856;

    @OriginalMember(owner = "client!cm", name = "Eb", descriptor = "I")
    public static int field7857;

    @OriginalMember(owner = "client!cm", name = "Fb", descriptor = "I")
    private int field7858;

    @OriginalMember(owner = "client!cm", name = "Gb", descriptor = "I")
    public static int field7859;

    @OriginalMember(owner = "client!cm", name = "Hb", descriptor = "I")
    public static int field7860;

    @OriginalMember(owner = "client!cm", name = "Ib", descriptor = "I")
    public static int field7861;

    @OriginalMember(owner = "client!cm", name = "tb", descriptor = "[I")
    public int[] field7846;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Llb;I)V", line = 4)
    public static final void method3122(class239 arg0, int arg1) {
        arg0.field3498 = null;
        ++field7859;
        int var2 = arg0.field3503.length;
        for (int var3 = 0; var3 < var2; ++var3) {
            arg0.field3503[var3].field7771 = false;
        }
        class126[] var4 = class184.field2797;
        synchronized (class184.field2797) {
            if (~class184.field2797.length < ~var2 && ~class435.field6376[var2] > -201) {
                class184.field2797[var2].method770(-65537, arg0);
                int var10002 = class435.field6376[var2]++;
            }
            if (arg1 != 18605) {
                method3122((class239) null, -46);
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(II[[I[[IIII)Lsa;", line = 32)
    public final class543 method965(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field7861;
        return new class611(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "()Z", line = 46)
    public final boolean method976() {
        ++field7856;
        return true;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIIII)V", line = 54)
    public final void method997(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7849;
        class613 var8 = (class613) this.method963(Thread.currentThread());
        class199 var9 = var8.field8991;
        int var10 = arg2 - arg0;
        int var11 = -arg1 + arg3;
        int var12 = var10 < 0 ? -var10 : var10;
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
            if (var16 <= var15) {
                var15 = -var15;
            } else {
                var16 = -var16;
            }
            int var19 = arg5 * var16 >> 17;
            int var20 = arg5 * var16 - -1 >> 17;
            int var21 = arg5 * var15 >> 17;
            int var22 = arg0 - var9.method1281();
            int var23 = arg5 * var15 + 1 >> 17;
            int var24 = arg1 - var9.method1284();
            int var25 = var22 - -var19;
            int var26 = -var20 + var22;
            int var27 = var17 + var22 + -var20;
            int var28 = var17 + var19 + var22;
            int var29 = var21 + var24;
            int var30 = -var23 + var24;
            int var31 = var24 - -var18 + -var23;
            int var32 = var18 + var21 + var24;
            if (arg6 != 0) {
                if (~arg6 != -2) {
                    throw new IllegalArgumentException();
                }
                var9.field2980 = 255 - (arg4 >>> 24);
            } else {
                var9.field2980 = 0;
            }
            var9.field2981 = var25 < 0 || var25 > var9.field2975 || ~var26 > -1 || ~var26 < ~var9.field2975 || var27 < 0 || ~var27 < ~var9.field2975;
            var9.method1290(var29, var30, var31, var25, var26, var27, 0, 0, 0, arg4);
            var9.field2981 = var25 < 0 || ~var9.field2975 > ~var25 || ~var26 > -1 || ~var9.field2975 > ~var26 || var28 < 0 || ~var9.field2975 > ~var28;
            var9.method1290(var29, var31, var32, var25, var27, var28, 0, 0, 0, arg4);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(BI)V", line = 133)
    public static final void method3123(byte arg0, int arg1) {
        ++field7852;
        class621 var2 = class442.method2691(arg1, 11, true);
        if (arg0 != 11) {
            field7853 = 106;
        }
        var2.method3598(255);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIIIIIII)V", line = 147)
    public final void method1039(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field7860;
        class613 var11 = (class613) this.method963(Thread.currentThread());
        class199 var12 = var11.field8991;
        var12.field2981 = true;
        var12.field2976 = false;
        int var13 = arg6 >>> 24;
        if (~arg9 == -1 || arg9 == 1 && var13 == 255) {
            var12.field2980 = 0;
            var12.field2974 = false;
            var12.method1293(arg1, arg3, arg5, arg0, arg2, arg4, 0, 0, 0, arg6, arg7, arg8);
        } else if (~arg9 != -2) {
            if (arg9 != 2) {
                throw new IllegalArgumentException();
            }
            var12.field2974 = true;
            var12.field2980 = 128;
            var12.method1293(arg1, arg3, arg5, arg0, arg2, arg4, 0, 0, 0, arg6, arg7, arg8);
        } else {
            var12.field2980 = 255 - var13;
            var12.field2974 = false;
            var12.method1293(arg1, arg3, arg5, arg0, arg2, arg4, 0, 0, 0, arg6, arg7, arg8);
        }
        var12.field2976 = true;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)V", line = 191)
    public static void method3124(byte arg0) {
        field7851 = null;
        if (arg0 > -68) {
            field7847 = -101;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "([Lr;Lm;[Lgr;I)V", line = 202)
    public final void method967(class520[] arg0, class105 arg1, class525[] arg2, int arg3) {
        for (int var5 = 0; var5 < arg0.length; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method1965(arg1, arg2 != null ? arg2[0] : null, arg3);
            }
        }
        ++field7848;
    }

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "(I)V", line = 224)
    public final void method970(int arg0) {
        super.field2196[arg0].method1750((Runnable) null, -116);
        ++field7857;
    }

    @OriginalMember(owner = "client!cm", name = "u", descriptor = "()V", line = 233)
    public final void method322() {
        ++field7845;
        int var1 = this.field7846.length;
        int var2 = var1 - var1 & 7;
        int var3 = 0;
        while (var3 < var2) {
            this.field7846[var3++] = Integer.MAX_VALUE;
            this.field7846[var3++] = Integer.MAX_VALUE;
            this.field7846[var3++] = Integer.MAX_VALUE;
            this.field7846[var3++] = Integer.MAX_VALUE;
            this.field7846[var3++] = Integer.MAX_VALUE;
            this.field7846[var3++] = Integer.MAX_VALUE;
            this.field7846[var3++] = Integer.MAX_VALUE;
            this.field7846[var3++] = Integer.MAX_VALUE;
        }
        while (var1 > var3) {
            this.field7846[var3++] = Integer.MAX_VALUE;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lbt;IIII)Lr;", line = 263)
    public final class520 method954(class114 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7854;
        return new class58(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "(I)V", line = 271)
    public final void method1044(int arg0) {
        super.field2192 = arg0;
        ++field7855;
        super.field2196 = new class613[super.field2192];
        for (int var2 = 0; ~var2 > ~super.field2192; ++var2) {
            super.field2196[var2] = new class613(this);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Ljava/lang/Runnable;)Lrs;", line = 289)
    public final class277 method963(Runnable arg0) {
        ++field7843;
        for (int var2 = 0; var2 < super.field2192; ++var2) {
            if (super.field2196[var2].field4070 == arg0) {
                return super.field2196[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 310)
    public final void method964(Canvas arg0) {
        if (arg0 != null) {
            class47 var2 = (class47) super.field2188.method1333((long) arg0.hashCode(), false);
            if (var2 != null) {
                super.field2186 = var2;
                super.field2184 = arg0;
                if (super.field2225 == null) {
                    super.field2226 = var2.field556;
                    super.field2206 = var2.field554;
                    super.field2197 = var2.field555;
                    if (~this.field7858 != ~super.field2206 || ~this.field7850 != ~super.field2197) {
                        this.field7858 = super.field2206;
                        this.field7850 = super.field2197;
                        this.field7846 = new int[this.field7858 * this.field7850];
                    }
                    this.method1035();
                }
            }
        } else {
            super.field2186 = null;
            super.field2184 = null;
            if (super.field2225 == null) {
                this.field7858 = this.field7850 = 1;
                super.field2206 = super.field2197 = 1;
                super.field2226 = null;
                this.method1035();
            }
        }
        ++field7841;
    }

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 365)
    public final void method1023(Canvas arg0) {
        ++field7840;
        class47 var2 = (class47) super.field2188.method1333((long) arg0.hashCode(), false);
        if (var2 != null) {
            var2.method2997(1);
            class47 var3 = class613.method3567(arg0, -1);
            super.field2188.method1341(var3, (byte) 23, (long) arg0.hashCode());
            if (super.field2184 == arg0 && super.field2225 == null) {
                super.field2197 = var3.field555;
                super.field2186 = var3;
                super.field2206 = var3.field554;
                super.field2226 = var3.field556;
                this.method1035();
                return;
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "([Lr;Loaa;Lm;[Lgr;I)V", line = 392)
    public final void method958(class520[] arg0, class510 arg1, class105 arg2, class525[] arg3, int arg4) {
        ++field7842;
        class58[] var6 = new class58[arg0.length];
        for (int var7 = 0; arg0.length > var7; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class58) arg0[var7];
            }
        }
        class58 var8 = class58.method366(this, var6);
        var8.method2288(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
    }

    @OriginalMember(owner = "client!cm", name = "G", descriptor = "()V", line = 416)
    public final void method1036() {
        ++field7844;
        super.field2207 = -super.field2213 + super.field2195;
        super.field2190 = super.field2215 - super.field2231;
        super.field2218 = super.field2227 - super.field2231;
        super.field2221 = -super.field2213 + super.field2208;
        for (int var1 = 0; ~var1 > ~super.field2192; ++var1) {
            class199 var5 = ((class613) super.field2196[var1]).field8991;
            var5.field2975 = -super.field2227 + super.field2215;
            var5.field2977 = -super.field2195 + super.field2213;
            var5.field2985 = super.field2208 - super.field2195;
            var5.field2987 = -super.field2227 + super.field2231;
        }
        int var2 = super.field2206 * super.field2195 + super.field2227;
        for (int var3 = super.field2195; ~var3 > ~super.field2208; ++var3) {
            for (int var4 = 0; var4 < super.field2192; ++var4) {
                ((class613) super.field2196[var4]).field8991.field2979[-super.field2195 + var3] = var2;
            }
            var2 += super.field2206;
        }
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ln;)V", line = 460)
    public class529(Canvas arg0, class472 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "(I)V", line = 465)
    public final void method981(int arg0) {
        ++field7839;
        super.field2196[arg0].method1750(Thread.currentThread(), -87);
    }
}
