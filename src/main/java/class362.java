import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class362 extends class659 implements class103 {

    @OriginalMember(owner = "client!wj", name = "K", descriptor = "I")
    private int field4818;

    @OriginalMember(owner = "client!wj", name = "H", descriptor = "I")
    private int field4815;

    @OriginalMember(owner = "client!wj", name = "C", descriptor = "Lwo;")
    public static class690 field4810 = new class690(53, 2);

    @OriginalMember(owner = "client!wj", name = "M", descriptor = "Lwaa;")
    public static class652 field4820 = new class652(16);

    @OriginalMember(owner = "client!wj", name = "O", descriptor = "I")
    public static int field4822 = 13156520;

    @OriginalMember(owner = "client!wj", name = "z", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!wj", name = "A", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!wj", name = "B", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!wj", name = "D", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!wj", name = "E", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!wj", name = "F", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!wj", name = "G", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!wj", name = "I", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!wj", name = "J", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!wj", name = "L", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!wj", name = "N", descriptor = "[[Ln;")
    public static class17[][] field4821;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIII)V")
    public static final void method2062(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4808;
        int var6 = 0;
        int var7 = arg0;
        int var8 = arg2 * arg2;
        int var9 = arg0 * arg0;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg0 << 1;
        int var13 = (-var12 + arg4) * var8 + var10;
        int var14 = -((var12 + -1) * var11) + var9;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg0 << 1) + -3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg0 + -1) * var15;
        if (class598.field8632 <= arg1 && ~arg1 >= ~class288.field3883) {
            int var21 = class396.method2393(class587.field8513, class221.field2866, 5890, arg2 + arg5);
            int var22 = class396.method2393(class587.field8513, class221.field2866, 5890, -arg2 + arg5);
            class359.method2018(class678.field9722[arg1], var21, 62, arg3, var22);
        }
        while (~var7 < -1) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    ++var6;
                    var17 += var16;
                    var19 += var16;
                }
            }
            if (~var14 > -1) {
                var13 += var17;
                var14 += var19;
                var19 += var16;
                ++var6;
                var17 += var16;
            }
            var14 += -var18;
            var13 += -var20;
            var18 -= var15;
            var20 -= var15;
            --var7;
            int var23 = -var7 + arg1;
            int var24 = arg1 + var7;
            if (var24 >= class598.field8632 && ~var23 >= ~class288.field3883) {
                int var25 = class396.method2393(class587.field8513, class221.field2866, arg4 ^ 5891, arg5 + var6);
                int var26 = class396.method2393(class587.field8513, class221.field2866, 5890, -var6 + arg5);
                if (~class598.field8632 >= ~var23) {
                    class359.method2018(class678.field9722[var23], var25, arg4 + -34, arg3, var26);
                }
                if (class288.field3883 >= var24) {
                    class359.method2018(class678.field9722[var24], var25, 94, arg3, var26);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IF)F")
    public final float method758(int arg0, float arg1) {
        ++field4816;
        return arg0 != 12943 ? -0.03880803F : arg1;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BI)I")
    public static final int method2063(byte arg0, int arg1) {
        int var2 = 48 / ((arg0 - 28) / 55);
        ++field4807;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)I")
    public final int method764(boolean arg0) {
        ++field4811;
        if (arg0) {
            field4820 = null;
        }
        return this.field4818;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIII[IIII)V")
    public final void method763(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7) {
        ++field4814;
        super.field9354.method2316((byte) 113, this);
        if (~arg6 == -1) {
            arg6 = arg3;
        }
        if (arg3 != arg6) {
            OpenGL.glPixelStorei(3314, arg6);
        }
        OpenGL.glTexSubImage2Di(super.field9349, 0, arg2, arg5, arg3, arg1, 32993, super.field9354.field4666, arg4, arg7);
        if (arg0 != -28726) {
            this.method763(-40, 101, -114, -119, (int[]) null, -109, -125, -60);
        }
        if (arg3 != arg6) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZZI)V")
    public final void method757(boolean arg0, boolean arg1, int arg2) {
        ++field4819;
        if (arg2 >= -58) {
            method2063((byte) -29, 68);
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Ldda;Lfca;II[FII)V")
    public class362(class349 arg0, class75 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class279.field3797, arg2 * arg3, false);
        this.field4818 = arg3;
        this.field4815 = arg2;
        super.field9354.method2316((byte) 123, this);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field9349, 0, this.method3735(-8573), arg2, arg3, 0, class499.method2903(7491, super.field9372), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "(I)V")
    public static void method2064(int arg0) {
        field4810 = null;
        field4821 = null;
        field4820 = null;
        if (arg0 <= 36) {
            method2062(52, 11, 66, 9, -39, 110);
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Ldda;Lfca;Lbv;II)V")
    public class362(class349 arg0, class75 arg1, class279 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field4815 = arg3;
        this.field4818 = arg4;
        super.field9354.method2316((byte) 112, this);
        OpenGL.glTexImage2Dub(super.field9349, 0, this.method3735(-8573), arg3, arg4, 0, class499.method2903(7491, super.field9372), class533.method3131(-17966, super.field9369), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)Z")
    public final boolean method759(int arg0) {
        ++field4809;
        if (arg0 != 18483) {
            field4822 = -124;
        }
        return false;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZIIIIIILfca;[B)V")
    public final void method762(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class75 arg7, byte[] arg8) {
        super.field9354.method2316((byte) 90, this);
        if (arg0) {
            field4822 = 124;
        }
        ++field4812;
        if (arg2 == 0) {
            arg2 = arg4;
        }
        OpenGL.glPixelStorei(3317, 1);
        if (~arg2 != ~arg4) {
            OpenGL.glPixelStorei(3314, arg2);
        }
        OpenGL.glTexSubImage2Dub(super.field9349, 0, arg1, arg5, arg4, arg3, class499.method2903(7491, arg7), 5121, arg8, arg6);
        if (~arg2 != ~arg4) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(FI)F")
    public final float method761(float arg0, int arg1) {
        ++field4817;
        if (arg1 != -22297) {
            this.method761(-0.37455076F, -87);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Ldda;Lfca;II[BII)V")
    public class362(class349 arg0, class75 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class279.field3793, arg2 * arg3, false);
        this.field4818 = arg3;
        this.field4815 = arg2;
        super.field9354.method2316((byte) 120, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field9349, 0, this.method3735(-8573), arg2, arg3, 0, class499.method2903(7491, super.field9372), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Ldda;II[III)V")
    public class362(class349 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class391.field5229, class279.field3793, arg1 * arg2, false);
        this.field4818 = arg2;
        this.field4815 = arg1;
        super.field9354.method2316((byte) 99, this);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field9349, 0, 6408, this.field4815, this.field4818, 0, 32993, super.field9354.field4666, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)I")
    public final int method760(byte arg0) {
        if (arg0 >= -55) {
            return -109;
        } else {
            ++field4813;
            return this.field4815;
        }
    }
}
