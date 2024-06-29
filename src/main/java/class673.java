import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nia")
public class class673 extends class753 implements class627 {

    @OriginalMember(owner = "client!nia", name = "D", descriptor = "I")
    private int field9338;

    @OriginalMember(owner = "client!nia", name = "K", descriptor = "I")
    private int field9345;

    @OriginalMember(owner = "client!nia", name = "H", descriptor = "Laca;")
    public static class758 field9342 = new class758(6, 1);

    @OriginalMember(owner = "client!nia", name = "N", descriptor = "I")
    public static int field9348 = 0;

    @OriginalMember(owner = "client!nia", name = "y", descriptor = "I")
    public static int field9333;

    @OriginalMember(owner = "client!nia", name = "z", descriptor = "I")
    public static int field9334;

    @OriginalMember(owner = "client!nia", name = "A", descriptor = "I")
    public static int field9335;

    @OriginalMember(owner = "client!nia", name = "B", descriptor = "I")
    public static int field9336;

    @OriginalMember(owner = "client!nia", name = "C", descriptor = "I")
    public static int field9337;

    @OriginalMember(owner = "client!nia", name = "E", descriptor = "I")
    public static int field9339;

    @OriginalMember(owner = "client!nia", name = "F", descriptor = "I")
    public static int field9340;

    @OriginalMember(owner = "client!nia", name = "G", descriptor = "I")
    public static int field9341;

    @OriginalMember(owner = "client!nia", name = "I", descriptor = "I")
    public static int field9343;

    @OriginalMember(owner = "client!nia", name = "J", descriptor = "I")
    public static int field9344;

    @OriginalMember(owner = "client!nia", name = "L", descriptor = "I")
    public static int field9346;

    @OriginalMember(owner = "client!nia", name = "M", descriptor = "I")
    public static int field9347;

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(IIZI[III)V", line = 3)
    public final void method2676(int arg0, int arg1, boolean arg2, int arg3, int[] arg4, int arg5, int arg6) {
        ++field9336;
        int[] var8 = new int[this.field9345 * this.field9338];
        super.field10392.method3090(this, (byte) 107);
        OpenGL.glGetTexImagei(super.field10396, 0, 32993, 5121, var8, 0);
        if (arg2) {
            for (int var9 = 0; ~var9 > ~arg6; ++var9) {
                class275.method1770(var8, (-var9 + arg0 - (-arg6 + 1)) * this.field9345, arg4, arg1 * var9 + arg3, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!nia", name = "<init>", descriptor = "(Loia;Lul;II[BII)V", line = 27)
    public class673(class97 arg0, class599 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class497.field6799, arg2 * arg3, false);
        this.field9338 = arg3;
        this.field9345 = arg2;
        super.field10392.method3090(this, (byte) 78);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field10396, 0, this.method4178(6409), arg2, arg3, 0, class298.method1917(-91, super.field10382), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "([IIIIIIII)V", line = 43)
    public final void method2671(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        super.field10392.method3090(this, (byte) -34);
        if (~arg4 == -1) {
            arg4 = arg7;
        }
        ++field9347;
        if (~arg4 != ~arg7) {
            OpenGL.glPixelStorei(3314, arg4);
        }
        OpenGL.glTexSubImage2Di(super.field10396, 0, arg3, arg1, arg7, arg6, 32993, super.field10392.field1590, arg0, arg5);
        if (arg2 != 9842) {
            this.method2672((byte[]) null, 123, 83, -2, (class599) null, 36, -26, 20, -106);
        }
        if (arg4 != arg7) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(Z)V", line = 67)
    public static void method3796(boolean arg0) {
        if (arg0) {
            method3796(false);
        }
        field9342 = null;
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(FB)F", line = 78)
    public final float method2675(float arg0, byte arg1) {
        if (arg1 <= 92) {
            return -0.5667188F;
        } else {
            ++field9334;
            return arg0;
        }
    }

    @OriginalMember(owner = "client!nia", name = "<init>", descriptor = "(Loia;Lul;Lso;II)V", line = 92)
    public class673(class97 arg0, class599 arg1, class497 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field9338 = arg4;
        this.field9345 = arg3;
        super.field10392.method3090(this, (byte) -32);
        OpenGL.glTexImage2Dub(super.field10396, 0, this.method4178(6409), arg3, arg4, 0, class298.method1917(-86, super.field10382), class383.method2325(true, super.field10390), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "(B)Z", line = 104)
    public final boolean method2680(byte arg0) {
        ++field9344;
        return arg0 <= 84;
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(ZI)V", line = 116)
    public static final void method3797(boolean arg0, int arg1) {
        for (class570 var2 = (class570) class503.field6872.method3589((byte) -128); var2 != null; var2 = (class570) class503.field6872.method3591(arg1 ^ 6408)) {
            if (var2.field8114 != null) {
                class456.field6213.method352(var2.field8114);
                var2.field8114 = null;
            }
            if (var2.field8119 != null) {
                class456.field6213.method352(var2.field8119);
                var2.field8119 = null;
            }
            var2.method1207(126);
        }
        if (arg1 != 6408) {
            method3797(false, 45);
        }
        ++field9343;
        if (arg0) {
            for (class570 var3 = (class570) class536.field7294.method3589((byte) -127); var3 != null; var3 = (class570) class536.field7294.method3591(0)) {
                if (var3.field8114 != null) {
                    class456.field6213.method352(var3.field8114);
                    var3.field8114 = null;
                }
                var3.method1207(94);
            }
            for (class570 var4 = (class570) class663.field9213.method335(-29067); var4 != null; var4 = (class570) class663.field9213.method336(125)) {
                if (var4.field8114 != null) {
                    class456.field6213.method352(var4.field8114);
                    var4.field8114 = null;
                }
                var4.method1207(94);
            }
        }
    }

    @OriginalMember(owner = "client!nia", name = "c", descriptor = "(B)I", line = 186)
    public final int method2678(byte arg0) {
        if (arg0 != 31) {
            field9348 = 101;
        }
        ++field9339;
        return this.field9338;
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "([BIIILul;IIII)V", line = 198)
    public final void method2672(byte[] arg0, int arg1, int arg2, int arg3, class599 arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field9337;
        super.field10392.method3090(this, (byte) -28);
        if (arg7 == 0) {
            arg7 = arg8;
        }
        if (arg5 != 32216) {
            method3797(false, -12);
        }
        OpenGL.glPixelStorei(3317, 1);
        if (~arg7 != ~arg8) {
            OpenGL.glPixelStorei(3314, arg7);
        }
        OpenGL.glTexSubImage2Dub(super.field10396, 0, arg1, arg3, arg8, arg2, class298.method1917(-68, arg4), 5121, arg0, arg6);
        if (arg7 != arg8) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(IF)F", line = 223)
    public final float method2669(int arg0, float arg1) {
        ++field9340;
        if (arg0 != 31463) {
            this.method2669(-99, 0.19973041F);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!nia", name = "<init>", descriptor = "(Loia;II[III)V", line = 234)
    public class673(class97 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class530.field7176, class497.field6799, arg1 * arg2, false);
        this.field9345 = arg1;
        this.field9338 = arg2;
        super.field10392.method3090(this, (byte) 110);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field10396, 0, 6408, this.field9345, this.field9338, 0, 32993, super.field10392.field1590, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(ZZI)V", line = 247)
    public final void method2679(boolean arg0, boolean arg1, int arg2) {
        ++field9346;
        if (arg2 != -17383) {
            this.field9345 = -93;
        }
    }

    @OriginalMember(owner = "client!nia", name = "<init>", descriptor = "(Loia;Lul;II[FII)V", line = 257)
    public class673(class97 arg0, class599 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class497.field6803, arg2 * arg3, false);
        this.field9338 = arg3;
        this.field9345 = arg2;
        super.field10392.method3090(this, (byte) 106);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field10396, 0, this.method4178(6409), arg2, arg3, 0, class298.method1917(-71, super.field10382), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(I)I", line = 272)
    public final int method2670(int arg0) {
        ++field9333;
        if (arg0 != -17271) {
            this.method2669(72, 1.2606449F);
        }
        return this.field9345;
    }

    @OriginalMember(owner = "client!nia", name = "e", descriptor = "(B)Z", line = 288)
    public static final boolean method3798(byte arg0) {
        ++field9335;
        try {
            class120 var1 = new class120();
            byte[] var2 = var1.method1055(class360.field4914, -21900);
            if (arg0 >= -56) {
                method3797(true, 52);
            }
            class474.method2723((byte) -21, var2);
            return true;
        } catch (Exception var3) {
            return false;
        }
    }
}
