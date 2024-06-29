import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class315 extends class422 implements class498 {

    @OriginalMember(owner = "client!w", name = "D", descriptor = "I")
    private int field4478;

    @OriginalMember(owner = "client!w", name = "J", descriptor = "I")
    private int field4483;

    @OriginalMember(owner = "client!w", name = "F", descriptor = "Lvea;")
    public static class288 field4480 = new class288(2);

    @OriginalMember(owner = "client!w", name = "L", descriptor = "I")
    public static int field4485 = 0;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!w", name = "C", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!w", name = "E", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!w", name = "H", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!w", name = "I", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!w", name = "K", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!w", name = "M", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!w", name = "N", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)I", line = 3)
    public final int method2015(int arg0) {
        int var2 = 2 / ((34 - arg0) / 57);
        ++field4482;
        return this.field4478;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)Z", line = 13)
    public final boolean method2016(boolean arg0) {
        if (!arg0) {
            this.method2015(-4);
        }
        ++field4484;
        return false;
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V", line = 24)
    public static void method2017(int arg0) {
        field4480 = null;
        if (arg0 != 3317) {
            field4480 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIBI[III)V", line = 37)
    public final void method2018(int arg0, int arg1, byte arg2, int arg3, int[] arg4, int arg5, int arg6) {
        ++field4479;
        int[] var8 = new int[this.field4483 * this.field4478];
        super.field5775.method1118(0, this);
        OpenGL.glGetTexImagei(super.field5768, 0, 32993, 5121, var8, 0);
        int var9 = 0;
        if (arg2 > -93) {
            this.method2019((byte) 15);
        }
        while (~var9 > ~arg6) {
            class595.method3473(var8, (arg5 - -arg6 + -var9 + -1) * this.field4483, arg4, arg3 * var9 + arg0, arg3);
            ++var9;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)I", line = 60)
    public final int method2019(byte arg0) {
        ++field4487;
        if (arg0 != 61) {
            this.method2020(13, -73, 42, (byte) -49, 72, (int[]) null, 18, 86);
        }
        return this.field4483;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIBI[III)V", line = 71)
    public final void method2020(int arg0, int arg1, int arg2, byte arg3, int arg4, int[] arg5, int arg6, int arg7) {
        if (arg3 >= -68) {
            field4485 = -63;
        }
        super.field5775.method1118(0, this);
        if (arg1 == 0) {
            arg1 = arg0;
        }
        ++field4476;
        if (~arg0 != ~arg1) {
            OpenGL.glPixelStorei(3314, arg1);
        }
        OpenGL.glTexSubImage2Di(super.field5768, 0, arg4, arg2, arg0, arg6, 32993, super.field5775.field7672, arg5, arg7);
        if (arg0 != arg1) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZZB)V", line = 93)
    public final void method2021(boolean arg0, boolean arg1, byte arg2) {
        ++field4477;
        if (arg2 != 23) {
            this.method2019((byte) -39);
        }
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lko;Lvea;Lbja;II)V", line = 109)
    public class315(class529 arg0, class288 arg1, class34 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field4478 = arg4;
        this.field4483 = arg3;
        super.field5775.method1118(0, this);
        OpenGL.glTexImage2Dub(super.field5768, 0, this.method2556(-110), arg3, arg4, 0, class511.method3090(super.field5773, (byte) -39), class256.method1669(30926, super.field5762), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lko;Lvea;II[FII)V", line = 120)
    public class315(class529 arg0, class288 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class34.field461, arg2 * arg3, false);
        this.field4478 = arg3;
        this.field4483 = arg2;
        super.field5775.method1118(0, this);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field5768, 0, this.method2556(-114), arg2, arg3, 0, class511.method3090(super.field5773, (byte) -39), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(FI)F", line = 133)
    public final float method2022(float arg0, int arg1) {
        ++field4475;
        return arg1 != 16678 ? 0.057721265F : arg0;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IILvea;IIII[BI)V", line = 144)
    public final void method2023(int arg0, int arg1, class288 arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8) {
        super.field5775.method1118(0, this);
        if (arg5 == 0) {
            arg5 = arg0;
        }
        if (arg6 == 8409) {
            ++field4481;
            OpenGL.glPixelStorei(3317, 1);
            if (~arg0 != ~arg5) {
                OpenGL.glPixelStorei(3314, arg5);
            }
            OpenGL.glTexSubImage2Dub(super.field5768, 0, arg3, arg1, arg0, arg4, class511.method3090(arg2, (byte) -39), 5121, arg7, arg8);
            if (~arg0 != ~arg5) {
                OpenGL.glPixelStorei(3314, 0);
            }
            OpenGL.glPixelStorei(3317, 4);
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(FI)F", line = 174)
    public final float method2024(float arg0, int arg1) {
        ++field4486;
        return arg1 != -23091 ? 1.3062749F : arg0;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lko;II[III)V", line = 189)
    public class315(class529 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class691.field9659, class34.field457, arg1 * arg2, false);
        this.field4478 = arg2;
        this.field4483 = arg1;
        super.field5775.method1118(0, this);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field5768, 0, 6408, this.field4483, this.field4478, 0, 32993, super.field5775.field7672, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lko;Lvea;II[BII)V", line = 206)
    public class315(class529 arg0, class288 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class34.field457, arg2 * arg3, false);
        this.field4483 = arg2;
        this.field4478 = arg3;
        super.field5775.method1118(0, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field5768, 0, this.method2556(-108), arg2, arg3, 0, class511.method3090(super.field5773, (byte) -39), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }
}
