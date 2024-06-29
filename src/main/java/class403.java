import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class403 extends class267 implements class112 {

    @OriginalMember(owner = "client!qq", name = "N", descriptor = "I")
    private int field5299;

    @OriginalMember(owner = "client!qq", name = "A", descriptor = "I")
    private int field5288;

    @OriginalMember(owner = "client!qq", name = "B", descriptor = "F")
    public static float field5289;

    @OriginalMember(owner = "client!qq", name = "z", descriptor = "I")
    public static int field5287;

    @OriginalMember(owner = "client!qq", name = "D", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!qq", name = "F", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!qq", name = "G", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!qq", name = "I", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!qq", name = "J", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!qq", name = "K", descriptor = "I")
    public static int field5296;

    @OriginalMember(owner = "client!qq", name = "L", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!qq", name = "M", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!qq", name = "O", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!qq", name = "C", descriptor = "Lra;")
    public static class90 field5290;

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Ltm;II[III)V")
    public class403(class327 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class10.field80, class160.field1932, arg1 * arg2, false);
        this.field5299 = arg1;
        this.field5288 = arg2;
        super.field3489.method2459(96, this);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field3482, 0, 6408, this.field5299, this.field5288, 0, 32993, super.field3489.field4261, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(FZ)F")
    public final float method646(float arg0, boolean arg1) {
        if (arg1) {
            this.method650((byte) 45, -51, -32, 43, (class135) null, 94, 32, -77, (byte[]) null);
        }
        ++field5297;
        return arg0;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)Z")
    public final boolean method653(int arg0) {
        ++field5287;
        if (arg0 != 11267) {
            method2302((class206) null, (class170) null, 38, 91, -27, -79, 97);
        }
        return false;
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Ltm;Lg;Lvp;II)V")
    public class403(class327 arg0, class135 arg1, class160 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field5288 = arg4;
        this.field5299 = arg3;
        super.field3489.method2459(79, this);
        OpenGL.glTexImage2Dub(super.field3482, 0, this.method1497((byte) 76), arg3, arg4, 0, class354.method1986(-80, super.field3465), class450.method2634(5122, super.field3475), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "([IIIIIIII)V")
    public final void method651(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg5 == 5826) {
            if (arg4 == 0) {
                arg4 = arg2;
            }
            super.field3489.method2459(76, this);
            ++field5291;
            if (~arg2 != ~arg4) {
                OpenGL.glPixelStorei(3314, arg4);
            }
            OpenGL.glTexSubImage2Di(super.field3482, 0, arg3, arg7, arg2, arg6, 32993, super.field3489.field4261, arg0, arg1);
            if (arg2 != arg4) {
                OpenGL.glPixelStorei(3314, 0);
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIFIFIBI[FFIII)V")
    public static final void method2300(int arg0, int arg1, float arg2, int arg3, float arg4, int arg5, byte arg6, int arg7, float[] arg8, float arg9, int arg10, int arg11, int arg12) {
        int var13 = arg3 - arg1;
        int var14 = arg11 - arg12;
        int var15 = arg0 - arg7;
        ++field5295;
        float var16 = arg8[2] * (float) var14 + arg8[1] * (float) var15 + arg8[0] * (float) var13;
        float var17 = arg8[5] * (float) var14 + arg8[3] * (float) var13 + arg8[4] * (float) var15;
        float var18 = arg8[8] * (float) var14 + arg8[7] * (float) var15 + arg8[6] * (float) var13;
        float var19;
        float var20;
        if (~arg10 == -1) {
            var19 = -var18 + arg4 + 0.5F;
            var20 = arg2 + var16 + 0.5F;
        } else if (arg10 == 1) {
            var19 = arg4 + var18 + 0.5F;
            var20 = arg2 + var16 + 0.5F;
        } else if (~arg10 == -3) {
            var20 = -var16 + arg2 + 0.5F;
            var19 = -var17 + arg9 + 0.5F;
        } else if (~arg10 != -4) {
            if (~arg10 != -5) {
                var20 = -var18 + arg4 + 0.5F;
                var19 = -var17 + arg9 + 0.5F;
            } else {
                var19 = -var17 + arg9 + 0.5F;
                var20 = arg4 + var18 + 0.5F;
            }
        } else {
            var20 = arg2 + var16 + 0.5F;
            var19 = -var17 + arg9 + 0.5F;
        }
        if (arg5 != 1) {
            if (~arg5 == -3) {
                var20 = -var20;
                var19 = -var19;
            } else if (arg5 == 3) {
                float var21 = var20;
                var20 = var19;
                var19 = -var21;
            }
        } else {
            float var22 = var20;
            var20 = -var19;
            var19 = var22;
        }
        class160.field1939 = var19;
        class244.field3142 = var20;
        if (arg6 != -111) {
            field5290 = null;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(BIIILg;III[B)V")
    public final void method650(byte arg0, int arg1, int arg2, int arg3, class135 arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        if (arg0 < 124) {
            field5292 = 5;
        }
        if (~arg3 == -1) {
            arg3 = arg7;
        }
        ++field5293;
        super.field3489.method2459(101, this);
        OpenGL.glPixelStorei(3317, 1);
        if (~arg3 != ~arg7) {
            OpenGL.glPixelStorei(3314, arg3);
        }
        OpenGL.glTexSubImage2Dub(super.field3482, 0, arg2, arg1, arg7, arg5, class354.method1986(-102, arg4), 5121, arg8, arg6);
        if (arg3 != arg7) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(BF)F")
    public final float method652(byte arg0, float arg1) {
        if (arg0 > -126) {
            return 2.2833908F;
        } else {
            ++field5300;
            return arg1;
        }
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(B)I")
    public final int method649(byte arg0) {
        if (arg0 >= -73) {
            this.field5299 = 7;
        }
        ++field5298;
        return this.field5299;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZZB)V")
    public final void method647(boolean arg0, boolean arg1, byte arg2) {
        if (arg2 >= 36) {
            ++field5296;
        }
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Ltm;Lg;II[FII)V")
    public class403(class327 arg0, class135 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class160.field1936, arg2 * arg3, false);
        this.field5288 = arg3;
        this.field5299 = arg2;
        super.field3489.method2459(91, this);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field3482, 0, this.method1497((byte) 76), arg2, arg3, 0, class354.method1986(-94, super.field3465), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "(B)V")
    public static void method2301(byte arg0) {
        field5290 = null;
        int var1 = -65 % ((33 - arg0) / 58);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lqa;Loe;IIIII)V")
    public static final void method2302(class206 arg0, class170 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; ++var12) {
            if (client.field3216 != var12) {
                for (int var13 = var8; var13 <= var9; ++var13) {
                    if (var13 >= 0 && var13 < class238.field2985) {
                        for (int var14 = var10; var14 <= var11; ++var14) {
                            if (var14 >= 0 && var14 < class548.field8061 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class349 var15 = class383.field5070[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class128.field1574[var12].method855(var13, var14) + class128.field1574[var12].method855(var13 + 1, var14) + class128.field1574[var12].method855(var13, var14 + 1) + class128.field1574[var12].method855(var13 + 1, var14 + 1)) / 4 - (class128.field1574[arg2].method855(arg3, arg4) + class128.field1574[arg2].method855(arg3 + 1, arg4) + class128.field1574[arg2].method855(arg3, arg4 + 1) + class128.field1574[arg2].method855(arg3 + 1, arg4 + 1)) / 4;
                                    class241 var17 = var15.field4496;
                                    class241 var18 = var15.field4497;
                                    if (var17 != null && var17.method317(64)) {
                                        arg1.method312(var7, var17, (var14 - arg4) * class79.field929 + (1 - arg6) * class410.field5342, arg0, var16, 13915, (var13 - arg3) * class79.field929 + (1 - arg5) * class410.field5342);
                                    }
                                    if (var18 != null && var18.method317(64)) {
                                        arg1.method312(var7, var18, (var14 - arg4) * class79.field929 + (1 - arg6) * class410.field5342, arg0, var16, 13915, (var13 - arg3) * class79.field929 + (1 - arg5) * class410.field5342);
                                    }
                                    for (class61 var19 = var15.field4499; var19 != null; var19 = var19.field595) {
                                        class598 var20 = var19.field589;
                                        if (var20 != null && var20.method317(64) && (var20.field8653 == var13 || var8 == var13) && (var20.field8650 == var14 || var10 == var14)) {
                                            int var21 = var20.field8663 - var20.field8653 + 1;
                                            int var22 = var20.field8654 - var20.field8650 + 1;
                                            arg1.method312(var7, var20, (var20.field8650 - arg4) * class79.field929 + (var22 - arg6) * class410.field5342, arg0, var16, 13915, (var20.field8653 - arg3) * class79.field929 + (var21 - arg5) * class410.field5342);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                --var8;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Ltm;Lg;II[BII)V")
    public class403(class327 arg0, class135 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class160.field1932, arg2 * arg3, false);
        this.field5299 = arg2;
        this.field5288 = arg3;
        super.field3489.method2459(95, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field3482, 0, this.method1497((byte) 76), arg2, arg3, 0, class354.method1986(-71, super.field3465), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)I")
    public final int method648(byte arg0) {
        ++field5294;
        if (arg0 != -118) {
            field5290 = null;
        }
        return this.field5288;
    }
}
