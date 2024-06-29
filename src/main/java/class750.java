import jaggl.OpenGL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class750 extends class83 implements class28 {

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
    private int field10349;

    @OriginalMember(owner = "client!jb", name = "L", descriptor = "I")
    private int field10355;

    @OriginalMember(owner = "client!jb", name = "P", descriptor = "Lov;")
    public static class31 field10359 = new class31(8);

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "I")
    public static int field10345;

    @OriginalMember(owner = "client!jb", name = "C", descriptor = "I")
    public static int field10346;

    @OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
    public static int field10347;

    @OriginalMember(owner = "client!jb", name = "E", descriptor = "I")
    public static int field10348;

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
    public static int field10350;

    @OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
    public static int field10351;

    @OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
    public static int field10352;

    @OriginalMember(owner = "client!jb", name = "J", descriptor = "I")
    public static int field10353;

    @OriginalMember(owner = "client!jb", name = "K", descriptor = "I")
    public static int field10354;

    @OriginalMember(owner = "client!jb", name = "M", descriptor = "I")
    public static int field10356;

    @OriginalMember(owner = "client!jb", name = "N", descriptor = "I")
    public static int field10357;

    @OriginalMember(owner = "client!jb", name = "O", descriptor = "I")
    public static int field10358;

    @OriginalMember(owner = "client!jb", name = "R", descriptor = "I")
    public static int field10361;

    @OriginalMember(owner = "client!jb", name = "Q", descriptor = "Liv;")
    public static class634 field10360;

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Loaa;IIZ[III)V")
    public class750(class556 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class75.field837, class612.field8616, arg1 * arg2, arg3);
        this.field10349 = arg1;
        this.field10355 = arg2;
        super.field1006.method1492(this, 2);
        if (arg3 && arg6 == 0 && arg5 == 0) {
            this.method628(-16908, arg1, super.field1016, arg4, arg2);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field1016, 0, 6408, this.field10349, this.field10355, 0, 32993, super.field1006.field7816, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II[BLpb;IIIII)V")
    public final void method127(int arg0, int arg1, byte[] arg2, class2 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field10354;
        super.field1006.method1492(this, 2);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg1);
        OpenGL.glTexSubImage2Dub(super.field1016, 0, arg6, arg8, arg4, arg7, class723.method4029(57, arg3), 5121, arg2, arg0);
        if (arg5 == 22217) {
            OpenGL.glPixelStorei(3314, 0);
            OpenGL.glPixelStorei(3317, 4);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)[B")
    public static final byte[] method4151(int arg0, int arg1) {
        ++field10348;
        class715 var2 = (class715) class56.field661.method1800(-1, (long) arg1);
        if (arg0 != 0) {
            field10359 = null;
        }
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; ++var5) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; ++var6) {
                int var7 = -var6 + 255;
                int var8 = class427.method2573(var4, var7, -103);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[-var6 + 511] = var9;
            }
            var2 = new class715(var3);
            class56.field661.method1799(var2, -1, (long) arg1);
        }
        return var2.field9933;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I[IIIIZII)V")
    public final void method131(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        ++field10347;
        if (arg5) {
            this.method129(false, true, false);
        }
        super.field1006.method1492(this, 2);
        OpenGL.glPixelStorei(3314, arg2);
        OpenGL.glTexSubImage2Di(super.field1016, 0, arg3, arg6, arg7, arg4, 32993, super.field1006.field7816, arg1, arg0);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Loaa;Lpb;IIZ[FII)V")
    public class750(class556 arg0, class2 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class612.field8620, arg2 * arg3, arg4);
        this.field10355 = arg3;
        this.field10349 = arg2;
        super.field1006.method1492(this, 2);
        if (!arg4 && arg7 == 0 && arg6 == 0) {
            this.method635(108, arg3, arg2, arg5, super.field1016);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field1016, 0, this.method631(-111), arg2, arg3, 0, class723.method4029(70, super.field994), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILjava/lang/String;IIIII)V")
    public static final void method4152(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 <= 111) {
            method4152(-92, 23, (String) null, -104, 21, 20, -4, 88);
        }
        ++field10351;
        class726 var8 = new class726();
        var8.field10038 = arg1;
        var8.field10040 = arg0;
        var8.field10045 = arg6;
        var8.field10047 = arg7;
        var8.field10048 = arg2;
        var8.field10039 = arg5;
        var8.field10044 = class533.field7336 + arg4;
        class190.field2376.method3100(var8, true);
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)I")
    public final int method130(byte arg0) {
        ++field10356;
        if (arg0 != 11) {
            field10359 = null;
        }
        return this.field10349;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZZZ)V")
    public final void method129(boolean arg0, boolean arg1, boolean arg2) {
        super.field1006.method1492(this, 2);
        ++field10357;
        OpenGL.glTexParameteri(super.field1016, 10242, arg0 ? 10497 : 33071);
        OpenGL.glTexParameteri(super.field1016, 10243, arg2 ? 10497 : 33071);
        if (!arg1) {
            this.method132(87);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII[FLpb;III)V")
    public final void method4153(int arg0, int arg1, int arg2, int arg3, float[] arg4, class2 arg5, int arg6, int arg7, int arg8) {
        ++field10350;
        super.field1006.method1492(this, 2);
        OpenGL.glPixelStorei(3314, arg1);
        OpenGL.glTexSubImage2Df(super.field1016, arg3, arg2, arg8, arg7, arg6, class723.method4029(75, arg5), 5121, arg4, arg0);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(FI)F")
    public final float method126(float arg0, int arg1) {
        ++field10345;
        if (arg1 != 5263) {
            this.method129(true, false, false);
        }
        return arg0 / (float) this.field10349;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)Z")
    public final boolean method132(int arg0) {
        ++field10358;
        if (arg0 < 32) {
            this.method132(-95);
        }
        return true;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(FZ)F")
    public final float method128(float arg0, boolean arg1) {
        ++field10352;
        return !arg1 ? -2.8800128F : arg0 / (float) this.field10355;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII[III)V")
    public final void method125(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        ++field10346;
        if (arg0 != -15104) {
            method4152(-76, 74, (String) null, -54, -86, -24, 86, 99);
        }
        int[] var8 = new int[this.field10355 * this.field10349];
        super.field1006.method1492(this, arg0 + 15106);
        OpenGL.glGetTexImagei(super.field1016, 0, 32993, 5121, var8, 0);
        for (int var9 = 0; ~var9 > ~arg3; ++var9) {
            class335.method2124(var8, (arg1 + arg3 - 1 + -var9) * this.field10349, arg4, arg5 * var9 + arg2, arg5);
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Loaa;Lpb;IIZ[BII)V")
    public class750(class556 arg0, class2 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class612.field8616, arg2 * arg3, arg4);
        this.field10349 = arg2;
        this.field10355 = arg3;
        super.field1006.method1492(this, 2);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && arg7 == 0 && ~arg6 == -1) {
            this.method637(arg5, arg3, arg2, -128, super.field1016);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field1016, 0, this.method631(64), arg2, arg3, 0, class723.method4029(24, super.field994), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "(I)V")
    public static void method4154(int arg0) {
        field10359 = null;
        if (arg0 != 3314) {
            field10359 = null;
        }
        field10360 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)I")
    public final int method124(byte arg0) {
        if (arg0 != 95) {
            return 72;
        } else {
            ++field10353;
            return this.field10355;
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Loaa;Lpb;Loea;II)V")
    public class750(class556 arg0, class2 arg1, class612 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field10355 = arg4;
        this.field10349 = arg3;
        super.field1006.method1492(this, 2);
        OpenGL.glTexImage2Dub(super.field1016, 0, this.method631(99), arg3, arg4, 0, class723.method4029(49, super.field994), class402.method2466(super.field1017, false), (byte[]) null, 0);
    }
}
