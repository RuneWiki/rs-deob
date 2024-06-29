import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class532 extends class164 {

    @OriginalMember(owner = "client!ef", name = "zb", descriptor = "Lqu;")
    public static class364 field7885 = new class364(60, -1);

    @OriginalMember(owner = "client!ef", name = "Db", descriptor = "[I")
    public static int[] field7889 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ef", name = "Cb", descriptor = "[Lko;")
    public static class241[] field7888 = new class241[32];

    @OriginalMember(owner = "client!ef", name = "mb", descriptor = "I")
    public static int field7872;

    @OriginalMember(owner = "client!ef", name = "nb", descriptor = "I")
    public static int field7873;

    @OriginalMember(owner = "client!ef", name = "ob", descriptor = "I")
    public static int field7874;

    @OriginalMember(owner = "client!ef", name = "pb", descriptor = "I")
    public static int field7875;

    @OriginalMember(owner = "client!ef", name = "qb", descriptor = "I")
    public static int field7876;

    @OriginalMember(owner = "client!ef", name = "rb", descriptor = "I")
    public static int field7877;

    @OriginalMember(owner = "client!ef", name = "tb", descriptor = "I")
    public static int field7879;

    @OriginalMember(owner = "client!ef", name = "ub", descriptor = "I")
    public static int field7880;

    @OriginalMember(owner = "client!ef", name = "vb", descriptor = "I")
    public static int field7881;

    @OriginalMember(owner = "client!ef", name = "wb", descriptor = "I")
    public static int field7882;

    @OriginalMember(owner = "client!ef", name = "xb", descriptor = "I")
    public static int field7883;

    @OriginalMember(owner = "client!ef", name = "yb", descriptor = "I")
    public static int field7884;

    @OriginalMember(owner = "client!ef", name = "Ab", descriptor = "I")
    public static int field7886;

    @OriginalMember(owner = "client!ef", name = "Bb", descriptor = "I")
    public static int field7887;

    @OriginalMember(owner = "client!ef", name = "Eb", descriptor = "I")
    public static int field7890;

    @OriginalMember(owner = "client!ef", name = "Fb", descriptor = "I")
    public static int field7891;

    @OriginalMember(owner = "client!ef", name = "sb", descriptor = "Lha;")
    public static class116 field7878;

    @OriginalMember(owner = "client!ef", name = "G", descriptor = "()V", line = 4)
    public final void method1036() {
        super.field2190 = -super.field2231 + super.field2215;
        ++field7881;
        super.field2218 = -super.field2231 + super.field2227;
        super.field2207 = super.field2195 - super.field2213;
        super.field2221 = -super.field2213 + super.field2208;
        for (int var1 = 0; super.field2192 > var1; ++var1) {
            class134 var5 = ((class157) super.field2196[var1]).field2007;
            var5.field1782 = -super.field2195 + super.field2213;
            var5.field1777 = -super.field2227 + super.field2215;
            var5.field1783 = -super.field2227 + super.field2231;
            var5.field1774 = -super.field2195 + super.field2208;
        }
        int var2 = super.field2206 * super.field2195 + super.field2227;
        for (int var3 = super.field2195; super.field2208 > var3; ++var3) {
            for (int var4 = 0; var4 < super.field2192; ++var4) {
                ((class157) super.field2196[var4]).field2007.field1775[-super.field2195 + var3] = var2;
            }
            var2 += super.field2206;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II[[I[[IIII)Lsa;", line = 47)
    public final class543 method965(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field7877;
        return new class545(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIIIIII)V", line = 55)
    public final void method1039(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field7875;
        class157 var11 = (class157) this.method963(Thread.currentThread());
        class134 var12 = var11.field2007;
        var12.field1778 = false;
        var12.field1784 = true;
        int var13 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && ~var13 == -256) {
            var12.field1771 = false;
            var12.field1779 = 0;
            var12.method820(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else if (~arg9 == -2) {
            var12.field1771 = false;
            var12.field1779 = -var13 + 255;
            var12.method820(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else {
            if (~arg9 != -3) {
                throw new IllegalArgumentException();
            }
            var12.field1779 = 128;
            var12.field1771 = true;
            var12.method820(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        }
        var12.field1778 = true;
    }

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "(I)V", line = 96)
    public final void method1044(int arg0) {
        ++field7891;
        super.field2192 = arg0;
        super.field2196 = new class157[super.field2192];
        for (int var2 = 0; ~super.field2192 < ~var2; ++var2) {
            super.field2196[var2] = new class157(this);
        }
    }

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "(I)V", line = 116)
    public final void method981(int arg0) {
        super.field2196[arg0].method1750(Thread.currentThread(), -127);
        ++field7887;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lbt;IIII)Lr;", line = 127)
    public final class520 method954(class114 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7890;
        return new class607(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILdda;I)Ldd;", line = 136)
    public static final class166 method3131(int arg0, class597 arg1, int arg2) {
        if (arg2 <= 29) {
            method3133(40, 49, -75, (class311) null);
        }
        ++field7872;
        byte[] var3 = arg1.method3469(arg0, 127);
        return var3 == null ? null : new class166(var3);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIII)V", line = 157)
    public final void method997(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7882;
        class157 var8 = (class157) this.method963(Thread.currentThread());
        class134 var9 = var8.field2007;
        int var10 = -arg0 + arg2;
        int var11 = -arg1 + arg3;
        int var12 = ~var10 <= -1 ? var10 : -var10;
        int var13 = var11 < 0 ? -var11 : var11;
        int var14 = var12;
        if (~var13 < ~var12) {
            var14 = var13;
        }
        if (var14 != 0) {
            int var15 = (var10 << 16) / var14;
            int var16 = (var15 >> 16) + var10;
            int var17 = (var11 << 16) / var14;
            int var18 = (var17 >> 16) + var11;
            if (~var15 <= ~var17) {
                var15 = -var15;
            } else {
                var17 = -var17;
            }
            int var19 = arg5 * var17 >> 17;
            int var20 = arg5 * var17 + 1 >> 17;
            int var21 = arg5 * var15 >> 17;
            int var22 = arg5 * var15 - -1 >> 17;
            int var23 = arg0 - var9.method830();
            int var24 = arg1 - var9.method832();
            int var25 = var19 + var23;
            int var26 = var23 - var20;
            int var27 = -var20 + var23 + var16;
            int var28 = var16 + var23 + var19;
            int var29 = var21 + var24;
            int var30 = -var22 + var24;
            int var31 = -var22 + var24 + var18;
            int var32 = var21 + var24 - -var18;
            if (~arg6 != -1) {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field1779 = -(arg4 >>> 24) + 255;
            } else {
                var9.field1779 = 0;
            }
            var9.field1784 = var25 < 0 || ~var9.field1777 > ~var25 || var26 < 0 || ~var26 < ~var9.field1777 || var27 < 0 || var27 > var9.field1777;
            var9.method829(var29, var30, var31, var25, var26, var27, arg4);
            var9.field1784 = var25 < 0 || var9.field1777 < var25 || var26 < 0 || var26 > var9.field1777 || var28 < 0 || var28 > var9.field1777;
            var9.method829(var29, var31, var32, var25, var27, var28, arg4);
        }
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ln;)V", line = 234)
    public class532(Canvas arg0, class472 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "()Z", line = 237)
    public final boolean method976() {
        ++field7876;
        return false;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 247)
    public final void method964(Canvas arg0) {
        ++field7874;
        if (arg0 != null) {
            class47 var2 = (class47) super.field2188.method1333((long) arg0.hashCode(), false);
            if (var2 != null) {
                super.field2186 = var2;
                super.field2184 = arg0;
                if (super.field2225 == null) {
                    super.field2197 = var2.field555;
                    super.field2226 = var2.field556;
                    super.field2206 = var2.field554;
                    this.method1035();
                    return;
                }
            }
        } else {
            super.field2184 = null;
            super.field2186 = null;
            if (super.field2225 != null) {
                return;
            }
            super.field2226 = null;
            super.field2206 = super.field2197 = 1;
            this.method1035();
        }
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 290)
    public final void method1023(Canvas arg0) {
        ++field7883;
        class47 var2 = (class47) super.field2188.method1333((long) arg0.hashCode(), false);
        if (var2 != null) {
            var2.method2997(1);
            class47 var3 = class613.method3567(arg0, -1);
            super.field2188.method1341(var3, (byte) -107, (long) arg0.hashCode());
            if (super.field2184 == arg0 && super.field2225 == null) {
                super.field2197 = var3.field555;
                super.field2206 = var3.field554;
                super.field2186 = var3;
                super.field2226 = var3.field556;
                this.method1035();
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "([Lr;Loaa;Lm;[Lgr;I)V", line = 318)
    public final void method958(class520[] arg0, class510 arg1, class105 arg2, class525[] arg3, int arg4) {
        ++field7873;
        class607[] var6 = new class607[arg0.length];
        for (int var7 = 0; arg0.length > var7; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class607) arg0[var7];
            }
        }
        class607 var8 = class607.method3534(this, var6);
        var8.method2288(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ljava/lang/Runnable;)Lrs;", line = 340)
    public final class277 method963(Runnable arg0) {
        ++field7886;
        for (int var2 = 0; ~super.field2192 < ~var2; ++var2) {
            if (super.field2196[var2].field4070 == arg0) {
                return super.field2196[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "([Lr;Lm;[Lgr;I)V", line = 359)
    public final void method967(class520[] arg0, class105 arg1, class525[] arg2, int arg3) {
        ++field7884;
        class607[] var5 = new class607[arg0.length];
        for (int var6 = 0; ~var6 > ~arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class607) arg0[var6];
            }
        }
        class607 var7 = class607.method3534(this, var5);
        var7.method2288(arg1, arg2 == null ? null : arg2[0], (class510) null, arg3);
    }

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "(I)V", line = 383)
    public static void method3132(int arg0) {
        field7878 = null;
        if (arg0 != 0) {
            field7885 = null;
        }
        field7885 = null;
        field7889 = null;
        field7888 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIILwca;)V", line = 397)
    public static final void method3133(int arg0, int arg1, int arg2, class311 arg3) {
        if (arg2 <= -72) {
            ++field7880;
            if (class369.field5337) {
                class173 var4 = class437.field6433 != -1 ? class8.field74.method3290(class437.field6433, 30883) : null;
                if (client.method3619(arg3).method3516(-1) && ~(class270.field4003 & 32) != -1) {
                    if (var4 == null || ~arg3.method1913((byte) 112, var4.field2339, class437.field6433) != ~var4.field2339) {
                        ++class137.field1814;
                        class436.method2670(0L, arg3.field4661, 15, arg3.field4667, true, (byte) -5, class479.field7270, arg3.field4558, class323.field4798 + " -> " + arg3.field4531, class425.field6074, false);
                    }
                    return;
                }
            } else {
                for (int var5 = 9; ~var5 <= -6; --var5) {
                    String var9 = class519.method3080(var5, (byte) 78, arg3);
                    if (var9 != null) {
                        class436.method2670((long) (var5 + 1), arg3.field4661, 1001, arg3.field4667, true, (byte) -5, var9, arg3.field4558, arg3.field4531, class240.method1541(arg3, var5, -40), false);
                        ++class177.field2687;
                    }
                }
                String var6 = class142.method854(22227, arg3);
                if (var6 != null) {
                    ++class342.field5004;
                    class436.method2670(0L, arg3.field4661, 18, arg3.field4667, true, (byte) -5, var6, arg3.field4558, arg3.field4531, arg3.field4585, false);
                }
                for (int var7 = 4; var7 >= 0; --var7) {
                    String var8 = class519.method3080(var7, (byte) 78, arg3);
                    if (var8 != null) {
                        ++class177.field2687;
                        class436.method2670((long) (var7 + 1), arg3.field4661, 2, arg3.field4667, true, (byte) -5, var8, arg3.field4558, arg3.field4531, class240.method1541(arg3, var7, -16), false);
                    }
                }
                if (!client.method3619(arg3).method3520((byte) -23)) {
                    return;
                }
                ++class620.field9063;
                if (arg3.field4602 != null) {
                    class436.method2670(0L, arg3.field4661, 13, arg3.field4667, true, (byte) -5, arg3.field4602, arg3.field4558, "", -1, false);
                    return;
                }
                class436.method2670(0L, arg3.field4661, 13, arg3.field4667, true, (byte) -5, class522.field7731.method2953(3181, class77.field889), arg3.field4558, "", -1, false);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)V", line = 478)
    public final void method970(int arg0) {
        super.field2196[arg0].method1750((Runnable) null, -105);
        ++field7879;
    }
}
