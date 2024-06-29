import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class208 extends class511 {

    @OriginalMember(owner = "client!kw", name = "xb", descriptor = "I")
    public static int field2931 = 0;

    @OriginalMember(owner = "client!kw", name = "sb", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!kw", name = "tb", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!kw", name = "ub", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!kw", name = "vb", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!kw", name = "wb", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!kw", name = "yb", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!kw", name = "zb", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!kw", name = "Bb", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!kw", name = "Cb", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!kw", name = "Db", descriptor = "I")
    private int field2937;

    @OriginalMember(owner = "client!kw", name = "Eb", descriptor = "I")
    private int field2938;

    @OriginalMember(owner = "client!kw", name = "Gb", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!kw", name = "Hb", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!kw", name = "Ib", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!kw", name = "Jb", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!kw", name = "Lb", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!kw", name = "Mb", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!kw", name = "Nb", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!kw", name = "Ob", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!kw", name = "Pb", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!kw", name = "Qb", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!kw", name = "Kb", descriptor = "Lpu;")
    public static class483 field2944;

    @OriginalMember(owner = "client!kw", name = "Ab", descriptor = "[I")
    public static int[] field2934;

    @OriginalMember(owner = "client!kw", name = "Fb", descriptor = "[I")
    public int[] field2939;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(BI)Z")
    public static final boolean method1370(byte arg0, int arg1) {
        if (arg0 != 100) {
            method1370((byte) -11, 38);
        }
        ++field2945;
        return arg1 == 3 || arg1 == 4;
    }

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "(Z)V")
    public static void method1371(boolean arg0) {
        if (!arg0) {
            field2934 = null;
        }
        field2934 = null;
        field2944 = null;
    }

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "(I)V")
    public final void method1280(int arg0) {
        super.field7177[arg0].method2364(Thread.currentThread(), 8190);
        ++field2948;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lln;IIII)Lr;")
    public final class157 method1293(class317 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2930;
        return new class307(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1343(Canvas arg0) {
        ++field2946;
        if (arg0 == null) {
            super.field7149 = null;
            super.field7147 = null;
            if (super.field7181 == null) {
                this.field2938 = this.field2937 = 1;
                super.field7162 = null;
                super.field7182 = super.field7159 = 1;
                this.method2956();
            }
        } else {
            class316 var2 = (class316) super.field7145.method1242(0, (long) arg0.hashCode());
            if (var2 != null) {
                super.field7149 = arg0;
                super.field7147 = var2;
                if (super.field7181 == null) {
                    super.field7159 = var2.field4248;
                    super.field7162 = var2.field4242;
                    super.field7182 = var2.field4243;
                    if (super.field7182 != this.field2938 || super.field7159 != this.field2937) {
                        this.field2937 = super.field7159;
                        this.field2938 = super.field7182;
                        this.field2939 = new int[this.field2938 * this.field2937];
                    }
                    this.method2956();
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Ljava/lang/Runnable;)Lch;")
    public final class394 method1372(Runnable arg0) {
        ++field2935;
        for (int var2 = 0; super.field7178 > var2; ++var2) {
            if (super.field7177[var2].field5554 == arg0) {
                return super.field7177[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "()V")
    public final void method1265() {
        ++field2943;
        int var1 = this.field2939.length;
        int var2 = var1 - var1 & 7;
        int var3 = 0;
        while (~var2 < ~var3) {
            this.field2939[var3++] = Integer.MAX_VALUE;
            this.field2939[var3++] = Integer.MAX_VALUE;
            this.field2939[var3++] = Integer.MAX_VALUE;
            this.field2939[var3++] = Integer.MAX_VALUE;
            this.field2939[var3++] = Integer.MAX_VALUE;
            this.field2939[var3++] = Integer.MAX_VALUE;
            this.field2939[var3++] = Integer.MAX_VALUE;
            this.field2939[var3++] = Integer.MAX_VALUE;
        }
        while (var3 < var1) {
            this.field2939[var3++] = Integer.MAX_VALUE;
        }
    }

    @OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ln;)V")
    public class208(Canvas arg0, class17 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(III)Z")
    public static final boolean method1373(int arg0, int arg1, int arg2) {
        ++field2942;
        if (arg0 != 8827) {
            field2931 = -57;
        }
        return (arg2 & 2048) != 0;
    }

    @OriginalMember(owner = "client!kw", name = "G", descriptor = "()V")
    public final void method1374() {
        super.field7183 = super.field7165 - super.field7184;
        ++field2947;
        super.field7185 = super.field7160 - super.field7157;
        super.field7191 = super.field7173 - super.field7157;
        super.field7188 = -super.field7184 + super.field7170;
        for (int var1 = 0; var1 < super.field7178; ++var1) {
            class4 var5 = ((class282) super.field7177[var1]).field3897;
            var5.field52 = super.field7157 - super.field7160;
            var5.field49 = super.field7184 - super.field7165;
            var5.field47 = -super.field7160 + super.field7173;
            var5.field55 = super.field7170 - super.field7165;
        }
        int var2 = super.field7182 * super.field7160 + super.field7165;
        for (int var3 = super.field7160; ~super.field7173 < ~var3; ++var3) {
            for (int var4 = 0; ~super.field7178 < ~var4; ++var4) {
                ((class282) super.field7177[var4]).field3897.field51[-super.field7160 + var3] = var2;
            }
            var2 += super.field7182;
        }
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(I)V")
    public final void method1272(int arg0) {
        super.field7178 = arg0;
        ++field2949;
        super.field7177 = new class282[super.field7178];
        for (int var2 = 0; ~super.field7178 < ~var2; ++var2) {
            super.field7177[var2] = new class282(this);
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIIII)V")
    public final void method1278(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2928;
        class282 var8 = (class282) this.method1372(Thread.currentThread());
        class4 var9 = var8.field3897;
        int var10 = -arg0 + arg2;
        int var11 = -arg1 + arg3;
        int var12 = ~var10 > -1 ? -var10 : var10;
        int var13 = ~var11 > -1 ? -var11 : var11;
        int var14 = var12;
        if (var13 > var12) {
            var14 = var13;
        }
        if (var14 != 0) {
            int var15 = (var10 << 16) / var14;
            int var16 = (var15 >> 16) + var10;
            int var17 = (var11 << 16) / var14;
            int var18 = (var17 >> 16) + var11;
            if (~var17 >= ~var15) {
                var15 = -var15;
            } else {
                var17 = -var17;
            }
            int var19 = arg5 * var17 >> 17;
            int var20 = arg5 * var17 + 1 >> 17;
            int var21 = arg5 * var15 >> 17;
            int var22 = arg0 - var9.method17();
            int var23 = arg5 * var15 + 1 >> 17;
            int var24 = arg1 - var9.method18();
            int var25 = var22 - -var19;
            int var26 = var22 - var20;
            int var27 = -var20 + var22 + var16;
            int var28 = var16 + var19 + var22;
            int var29 = var24 - -var21;
            int var30 = var24 - var23;
            int var31 = -var23 + var24 - -var18;
            int var32 = var24 - -var21 + var18;
            if (arg6 != 0) {
                if (~arg6 != -2) {
                    throw new IllegalArgumentException();
                }
                var9.field58 = 255 - (arg4 >>> 24);
            } else {
                var9.field58 = 0;
            }
            var9.field54 = var25 < 0 || ~var25 < ~var9.field55 || ~var26 > -1 || ~var26 < ~var9.field55 || ~var27 > -1 || ~var9.field55 > ~var27;
            var9.method24(var29, var30, var31, var25, var26, var27, 0, 0, 0, arg4);
            var9.field54 = var25 < 0 || var25 > var9.field55 || var26 < 0 || var26 > var9.field55 || var28 < 0 || var28 > var9.field55;
            var9.method24(var29, var31, var32, var25, var27, var28, 0, 0, 0, arg4);
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(II[[I[[IIII)Lsa;")
    public final class174 method1270(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field2926;
        return new class275(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1275(Canvas arg0) {
        ++field2941;
        class316 var2 = (class316) super.field7145.method1242(0, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method1117(0);
            class316 var3 = class496.method2873(arg0, (byte) 24);
            super.field7145.method1241(var3, (long) arg0.hashCode(), -117);
            if (super.field7149 == arg0 && super.field7181 == null) {
                super.field7159 = var3.field4248;
                super.field7162 = var3.field4242;
                super.field7147 = var3;
                super.field7182 = var3.field4243;
                this.method2956();
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "([Lr;Lhp;Lm;[Lkn;I)V")
    public final void method1288(class157[] arg0, class274 arg1, class163 arg2, class631[] arg3, int arg4) {
        ++field2950;
        class307[] var6 = new class307[arg0.length];
        for (int var7 = 0; arg0.length > var7; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class307) arg0[var7];
            }
        }
        class307 var8 = class307.method1940(this, var6);
        var8.method289(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "([Lr;Lm;[Lkn;I)V")
    public final void method1360(class157[] arg0, class163 arg1, class631[] arg2, int arg3) {
        ++field2932;
        for (int var5 = 0; var5 < arg0.length; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method154(arg1, arg2 == null ? null : arg2[0], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "(I)V")
    public final void method1330(int arg0) {
        super.field7177[arg0].method2364((Runnable) null, 8190);
        ++field2936;
    }

    @OriginalMember(owner = "client!kw", name = "x", descriptor = "()Z")
    public final boolean method1340() {
        ++field2940;
        return true;
    }

    @OriginalMember(owner = "client!kw", name = "n", descriptor = "(I)V")
    public static final void method1375(int arg0) {
        ++field2927;
        if (arg0 != Integer.MAX_VALUE) {
            field2944 = null;
        }
        class529.field7414.method3248(arg0 + -2147483647);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method1341(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field2929;
        class282 var11 = (class282) this.method1372(Thread.currentThread());
        class4 var12 = var11.field3897;
        var12.field53 = false;
        var12.field54 = true;
        int var13 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var13 == 255) {
            var12.field58 = 0;
            var12.field50 = false;
            var12.method26(arg1, arg3, arg5, arg0, arg2, arg4, 0, 0, 0, arg6, arg7, arg8);
        } else if (arg9 == 1) {
            var12.field50 = false;
            var12.field58 = -var13 + 255;
            var12.method26(arg1, arg3, arg5, arg0, arg2, arg4, 0, 0, 0, arg6, arg7, arg8);
        } else {
            if (arg9 != 2) {
                throw new IllegalArgumentException();
            }
            var12.field50 = true;
            var12.field58 = 128;
            var12.method26(arg1, arg3, arg5, arg0, arg2, arg4, 0, 0, 0, arg6, arg7, arg8);
        }
        var12.field53 = true;
    }

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "(II)Lsc;")
    public static final class291 method1376(int arg0, int arg1) {
        ++field2933;
        class291 var2 = (class291) class99.field1508.method3252((long) arg0, (byte) 51);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class110.field1705.method240(0, arg0, (byte) -124);
            class291 var4 = new class291();
            if (var3 != null) {
                var4.method1876(new class11(var3), arg0, -2097814992);
            }
            class99.field1508.method3243(var4, (long) arg0, 49);
            return arg1 < 77 ? null : var4;
        }
    }
}
