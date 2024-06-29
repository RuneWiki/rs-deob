import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class450 extends class422 implements class498 {

    @OriginalMember(owner = "client!li", name = "A", descriptor = "I")
    private int field6151;

    @OriginalMember(owner = "client!li", name = "H", descriptor = "I")
    private int field6158;

    @OriginalMember(owner = "client!li", name = "K", descriptor = "Lsaa;")
    public static class345 field6161 = new class345(3, 2);

    @OriginalMember(owner = "client!li", name = "O", descriptor = "I")
    public static int field6165 = -1;

    @OriginalMember(owner = "client!li", name = "F", descriptor = "F")
    public static float field6156;

    @OriginalMember(owner = "client!li", name = "z", descriptor = "I")
    public static int field6150;

    @OriginalMember(owner = "client!li", name = "B", descriptor = "I")
    public static int field6152;

    @OriginalMember(owner = "client!li", name = "C", descriptor = "I")
    public static int field6153;

    @OriginalMember(owner = "client!li", name = "D", descriptor = "I")
    public static int field6154;

    @OriginalMember(owner = "client!li", name = "E", descriptor = "I")
    public static int field6155;

    @OriginalMember(owner = "client!li", name = "G", descriptor = "I")
    public static int field6157;

    @OriginalMember(owner = "client!li", name = "I", descriptor = "I")
    public static int field6159;

    @OriginalMember(owner = "client!li", name = "J", descriptor = "I")
    public static int field6160;

    @OriginalMember(owner = "client!li", name = "L", descriptor = "I")
    public static int field6162;

    @OriginalMember(owner = "client!li", name = "M", descriptor = "I")
    public static int field6163;

    @OriginalMember(owner = "client!li", name = "N", descriptor = "I")
    public static int field6164;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIBI[III)V")
    public final void method2020(int arg0, int arg1, int arg2, byte arg3, int arg4, int[] arg5, int arg6, int arg7) {
        ++field6153;
        super.field5775.method1118(0, this);
        OpenGL.glPixelStorei(3314, arg1);
        OpenGL.glTexSubImage2Di(super.field5768, 0, arg4, arg2, arg0, arg6, 32993, super.field5775.field7672, arg5, arg7);
        OpenGL.glPixelStorei(3314, 0);
        if (arg3 > -68) {
            this.field6158 = 109;
        }
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(B)V")
    public static void method2679(byte arg0) {
        field6161 = null;
        if (arg0 != 76) {
            method2679((byte) -3);
        }
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lko;Lvea;IIZ[BII)V")
    public class450(class529 arg0, class288 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class34.field457, arg2 * arg3, arg4);
        this.field6151 = arg3;
        this.field6158 = arg2;
        super.field5775.method1118(0, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && ~arg7 == -1 && arg6 == 0) {
            this.method2553(arg2, 14555, arg5, arg3, super.field5768);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field5768, 0, this.method2556(-120), arg2, arg3, 0, class511.method3090(super.field5773, (byte) -39), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lko;IIZ[III)V")
    public class450(class529 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class691.field9659, class34.field457, arg1 * arg2, arg3);
        this.field6158 = arg1;
        this.field6151 = arg2;
        super.field5775.method1118(0, this);
        if (arg3 && arg6 == 0 && arg5 == 0) {
            this.method2557(arg1, 0, super.field5768, arg2, arg4);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field5768, 0, 6408, this.field6158, this.field6151, 0, 32993, super.field5775.field7672, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lko;Lvea;IIZ[FII)V")
    public class450(class529 arg0, class288 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class34.field461, arg2 * arg3, arg4);
        this.field6158 = arg2;
        this.field6151 = arg3;
        super.field5775.method1118(0, this);
        if (!arg4 && arg7 == 0 && arg6 == 0) {
            this.method2559(super.field5768, arg3, 0, arg2, arg5);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field5768, 0, this.method2556(-112), arg2, arg3, 0, class511.method3090(super.field5773, (byte) -39), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IILvea;IIII[BI)V")
    public final void method2023(int arg0, int arg1, class288 arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8) {
        ++field6159;
        super.field5775.method1118(0, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg5);
        if (arg6 != 8409) {
            this.method2019((byte) -38);
        }
        OpenGL.glTexSubImage2Dub(super.field5768, 0, arg3, arg1, arg0, arg4, class511.method3090(arg2, (byte) -39), 5121, arg7, arg8);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lko;Lvea;Lbja;II)V")
    public class450(class529 arg0, class288 arg1, class34 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field6151 = arg4;
        this.field6158 = arg3;
        super.field5775.method1118(0, this);
        OpenGL.glTexImage2Dub(super.field5768, 0, this.method2556(-121), arg3, arg4, 0, class511.method3090(super.field5773, (byte) -39), class256.method1669(30926, super.field5762), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)I")
    public final int method2015(int arg0) {
        int var2 = 41 % ((arg0 - 34) / 57);
        ++field6155;
        return this.field6151;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lvea;I[FIIIIII)V")
    public final void method2680(class288 arg0, int arg1, float[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field6157;
        super.field5775.method1118(0, this);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexSubImage2Df(super.field5768, 0, arg5, arg4, arg1, arg3, class511.method3090(arg0, (byte) -39), 5121, arg2, arg7);
        OpenGL.glPixelStorei(3314, 0);
        if (arg8 != 19352) {
            this.field6151 = 65;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZZB)V")
    public final void method2021(boolean arg0, boolean arg1, byte arg2) {
        ++field6152;
        super.field5775.method1118(0, this);
        OpenGL.glTexParameteri(super.field5768, 10242, arg1 ? 10497 : 33071);
        if (arg2 == 23) {
            OpenGL.glTexParameteri(super.field5768, 10243, arg0 ? 10497 : 33071);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)I")
    public final int method2019(byte arg0) {
        ++field6164;
        if (arg0 != 61) {
            this.method2015(-62);
        }
        return this.field6158;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(FI)F")
    public final float method2024(float arg0, int arg1) {
        if (arg1 != -23091) {
            this.field6158 = 45;
        }
        ++field6154;
        return arg0 / (float) this.field6158;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIBI[III)V")
    public final void method2018(int arg0, int arg1, byte arg2, int arg3, int[] arg4, int arg5, int arg6) {
        ++field6163;
        int[] var8 = new int[this.field6158 * this.field6151];
        if (arg2 >= -93) {
            this.method2021(true, false, (byte) 118);
        }
        super.field5775.method1118(0, this);
        OpenGL.glGetTexImagei(super.field5768, 0, 32993, 5121, var8, 0);
        for (int var9 = 0; ~var9 > ~arg6; ++var9) {
            class595.method3473(var8, (arg5 + -1 + -var9 + arg6) * this.field6158, arg4, arg3 * var9 + arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(FI)F")
    public final float method2022(float arg0, int arg1) {
        ++field6160;
        if (arg1 != 16678) {
            this.method2022(0.94347316F, -24);
        }
        return arg0 / (float) this.field6151;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)Z")
    public final boolean method2016(boolean arg0) {
        if (!arg0) {
            field6161 = null;
        }
        ++field6150;
        return true;
    }
}
