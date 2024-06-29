import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class334 extends class493 implements class459 {

    @OriginalMember(owner = "client!ga", name = "G", descriptor = "I")
    private int field4252;

    @OriginalMember(owner = "client!ga", name = "K", descriptor = "I")
    private int field4256;

    @OriginalMember(owner = "client!ga", name = "C", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!ga", name = "D", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!ga", name = "F", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!ga", name = "H", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!ga", name = "I", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!ga", name = "J", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!ga", name = "L", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!ga", name = "M", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!ga", name = "N", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!ga", name = "O", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Llm;II[III)V", line = 7)
    public class334(class337 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class590.field8288, class117.field1509, arg1 * arg2, false);
        this.field4252 = arg2;
        this.field4256 = arg1;
        super.field6502.method2596(this, 0);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field6519, 0, 6408, this.field4256, this.field4252, 0, 32993, super.field6502.field4373, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Llm;Lec;II[FII)V", line = 22)
    public class334(class337 arg0, class146 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class117.field1513, arg2 * arg3, false);
        this.field4256 = arg2;
        this.field4252 = arg3;
        super.field6502.method2596(this, 0);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field6519, 0, this.method2658(26701), arg2, arg3, 0, class488.method2639(6407, super.field6513), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZIBIFII)[I", line = 35)
    public static final int[] method1889(int arg0, boolean arg1, int arg2, byte arg3, int arg4, float arg5, int arg6, int arg7) {
        ++field4249;
        int[] var8 = new int[arg0];
        class354 var9 = new class354();
        if (arg3 != -9) {
            return null;
        } else {
            var9.field4507 = arg7;
            var9.field4519 = arg1;
            var9.field4504 = arg4;
            var9.field4509 = arg6;
            var9.field4506 = (int) (arg5 * 4096.0F);
            var9.field4513 = arg2;
            var9.method46(-69);
            class386.method2076(1, (byte) -124, arg0);
            var9.method1944(0, (byte) 31, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(FB)F", line = 59)
    public final float method518(float arg0, byte arg1) {
        ++field4251;
        if (arg1 != -59) {
            this.field4256 = -23;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Llm;Lec;II[BII)V", line = 70)
    public class334(class337 arg0, class146 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class117.field1509, arg2 * arg3, false);
        this.field4252 = arg3;
        this.field4256 = arg2;
        super.field6502.method2596(this, 0);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field6519, 0, this.method2658(26701), arg2, arg3, 0, class488.method2639(6407, super.field6513), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)Z", line = 85)
    public final boolean method519(boolean arg0) {
        ++field4259;
        return !arg0;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BZZ)V", line = 97)
    public final void method525(byte arg0, boolean arg1, boolean arg2) {
        if (arg0 == -81) {
            ++field4248;
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Llm;Lec;Lbt;II)V", line = 107)
    public class334(class337 arg0, class146 arg1, class117 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field4256 = arg3;
        this.field4252 = arg4;
        super.field6502.method2596(this, 0);
        OpenGL.glTexImage2Dub(super.field6519, 0, this.method2658(26701), arg3, arg4, 0, class488.method2639(6407, super.field6513), class285.method1603(super.field6522, 93), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)I", line = 120)
    public final int method526(byte arg0) {
        if (arg0 < 53) {
            this.method526((byte) 115);
        }
        ++field4258;
        return this.field4256;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I[BLec;IIIIII)V", line = 132)
    public final void method523(int arg0, byte[] arg1, class146 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg6 == 996) {
            ++field4253;
            if (arg5 == 0) {
                arg5 = arg4;
            }
            super.field6502.method2596(this, 0);
            OpenGL.glPixelStorei(3317, 1);
            if (arg4 != arg5) {
                OpenGL.glPixelStorei(3314, arg5);
            }
            OpenGL.glTexSubImage2Dub(super.field6519, 0, arg8, arg3, arg4, arg7, class488.method2639(6407, arg2), 5121, arg1, arg0);
            if (arg4 != arg5) {
                OpenGL.glPixelStorei(3314, 0);
            }
            OpenGL.glPixelStorei(3317, 4);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIILjava/lang/String;I)V", line = 155)
    public static final void method1890(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6, int arg7) {
        ++field4257;
        class107 var8 = new class107();
        var8.field1422 = class133.field1735 + arg3;
        var8.field1423 = arg1;
        if (arg0 == 4) {
            var8.field1426 = arg2;
            var8.field1427 = arg4;
            var8.field1430 = arg6;
            var8.field1425 = arg5;
            var8.field1428 = arg7;
            class580.field8120.method801(var8, arg0 + 108);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IBI[IIIII)V", line = 175)
    public final void method520(int arg0, byte arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field4254;
        super.field6502.method2596(this, 0);
        if (~arg2 == -1) {
            arg2 = arg5;
        }
        if (arg2 != arg5) {
            OpenGL.glPixelStorei(3314, arg2);
        }
        if (arg1 == 75) {
            OpenGL.glTexSubImage2Di(super.field6519, 0, arg4, arg7, arg5, arg6, 32993, super.field6502.field4373, arg3, arg0);
            if (~arg2 != ~arg5) {
                OpenGL.glPixelStorei(3314, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)I", line = 196)
    public final int method517(int arg0) {
        ++field4260;
        if (arg0 != -3537) {
            this.field4256 = 69;
        }
        return this.field4252;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZF)F", line = 210)
    public final float method522(boolean arg0, float arg1) {
        ++field4250;
        if (arg0) {
            this.method523(82, (byte[]) null, (class146) null, 103, -69, -108, 18, -77, 64);
        }
        return arg1;
    }
}
