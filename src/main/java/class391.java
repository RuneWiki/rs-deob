import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class class391 extends class645 implements class60 {

    @OriginalMember(owner = "client!ica", name = "J", descriptor = "I")
    private int field5636;

    @OriginalMember(owner = "client!ica", name = "C", descriptor = "I")
    private int field5630;

    @OriginalMember(owner = "client!ica", name = "H", descriptor = "Lmp;")
    public static class315 field5635 = new class315("runescape", 0);

    @OriginalMember(owner = "client!ica", name = "Q", descriptor = "Lfw;")
    public static class215 field5643 = new class215();

    @OriginalMember(owner = "client!ica", name = "S", descriptor = "Llc;")
    public static class435 field5645 = new class435(107, 3);

    @OriginalMember(owner = "client!ica", name = "z", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!ica", name = "A", descriptor = "I")
    public static int field5628;

    @OriginalMember(owner = "client!ica", name = "B", descriptor = "I")
    public static int field5629;

    @OriginalMember(owner = "client!ica", name = "D", descriptor = "I")
    public static int field5631;

    @OriginalMember(owner = "client!ica", name = "E", descriptor = "I")
    public static int field5632;

    @OriginalMember(owner = "client!ica", name = "F", descriptor = "I")
    public static int field5633;

    @OriginalMember(owner = "client!ica", name = "G", descriptor = "I")
    public static int field5634;

    @OriginalMember(owner = "client!ica", name = "K", descriptor = "I")
    public static int field5637;

    @OriginalMember(owner = "client!ica", name = "L", descriptor = "I")
    public static int field5638;

    @OriginalMember(owner = "client!ica", name = "M", descriptor = "I")
    public static int field5639;

    @OriginalMember(owner = "client!ica", name = "N", descriptor = "I")
    public static int field5640;

    @OriginalMember(owner = "client!ica", name = "O", descriptor = "I")
    public static int field5641;

    @OriginalMember(owner = "client!ica", name = "P", descriptor = "I")
    public static int field5642;

    @OriginalMember(owner = "client!ica", name = "R", descriptor = "Lha;")
    public static class543 field5644;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(FI)F", line = 3)
    public final float method567(float arg0, int arg1) {
        if (arg1 != 17714) {
            field5635 = null;
        }
        ++field5632;
        return arg0 / (float) this.field5630;
    }

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "(B)I", line = 14)
    public final int method563(byte arg0) {
        ++field5628;
        return arg0 > -2 ? 98 : this.field5630;
    }

    @OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(Lmba;Lkca;Lwq;II)V", line = 25)
    public class391(class643 arg0, class755 arg1, class674 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field5636 = arg3;
        this.field5630 = arg4;
        super.field9272.method264(this, -2);
        OpenGL.glTexImage2Dub(super.field9284, 0, this.method3720(9728), arg3, arg4, 0, class397.method2411(6145, super.field9283), class523.method3182(super.field9287, 79), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(BC)I", line = 37)
    public static final int method2392(byte arg0, char arg1) {
        ++field5631;
        if (arg1 >= 0 && ~arg1 > ~class39.field671.length) {
            return class39.field671[arg1];
        } else {
            return arg0 != 40 ? 30 : -1;
        }
    }

    @OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(Lmba;Lkca;IIZ[BII)V", line = 51)
    public class391(class643 arg0, class755 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class674.field9590, arg2 * arg3, arg4);
        this.field5636 = arg2;
        this.field5630 = arg3;
        super.field9272.method264(this, -2);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && arg7 == 0 && arg6 == 0) {
            this.method3719(super.field9284, arg2, arg5, 77, arg3);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field9284, 0, this.method3720(9728), arg2, arg3, 0, class397.method2411(6145, super.field9283), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(Lkca;[BIIIIIII)V", line = 72)
    public final void method565(class755 arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg8 != -19479) {
            method2394(25, 70, (byte) 66);
        }
        ++field5640;
        super.field9272.method264(this, -2);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg4);
        OpenGL.glTexSubImage2Dub(super.field9284, 0, arg6, arg7, arg5, arg2, class397.method2411(6145, arg0), 5121, arg1, arg3);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(Lmba;Lkca;IIZ[FII)V", line = 90)
    public class391(class643 arg0, class755 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class674.field9594, arg2 * arg3, arg4);
        this.field5636 = arg2;
        this.field5630 = arg3;
        super.field9272.method264(this, -2);
        if (!arg4 && arg7 == 0 && ~arg6 == -1) {
            this.method3724(arg3, 0, super.field9284, arg2, arg5);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field9284, 0, this.method3720(9728), arg2, arg3, 0, class397.method2411(6145, super.field9283), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)I", line = 109)
    public final int method568(int arg0) {
        ++field5642;
        if (arg0 != 22505) {
            this.method565((class755) null, (byte[]) null, -81, -33, -28, 86, 83, -104, -12);
        }
        return this.field5636;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "([IIIIBIII)V", line = 120)
    public final void method562(int[] arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        super.field9272.method264(this, -2);
        ++field5637;
        OpenGL.glPixelStorei(3314, arg2);
        if (arg4 > 90) {
            OpenGL.glTexSubImage2Di(super.field9284, 0, arg7, arg3, arg1, arg5, 32993, super.field9272.field9253, arg0, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!ica", name = "e", descriptor = "(I)V", line = 136)
    public static void method2393(int arg0) {
        field5635 = null;
        field5644 = null;
        if (arg0 == -3724) {
            field5645 = null;
            field5643 = null;
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "([IIIIIII)V", line = 149)
    public final void method564(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5639;
        int[] var8 = new int[this.field5636 * this.field5630];
        super.field9272.method264(this, -2);
        OpenGL.glGetTexImagei(super.field9284, 0, 32993, 5121, var8, 0);
        if (arg3 < 13) {
            this.method2395(84, -76, 94, -65, (class755) null, -12, (byte) 106, (float[]) null, 83);
        }
        for (int var9 = 0; ~arg2 < ~var9; ++var9) {
            class85.method684(var8, (arg5 + -1 + -var9 + arg2) * this.field5636, arg0, arg1 * var9 + arg6, arg1);
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(BF)F", line = 175)
    public final float method561(byte arg0, float arg1) {
        int var3 = 45 / (arg0 / 47);
        ++field5633;
        return arg1 / (float) this.field5636;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(ZIZ)V", line = 185)
    public final void method560(boolean arg0, int arg1, boolean arg2) {
        ++field5627;
        super.field9272.method264(this, arg1 + -16611);
        OpenGL.glTexParameteri(super.field9284, 10242, arg0 ? 10497 : 33071);
        OpenGL.glTexParameteri(super.field9284, 10243, arg2 ? 10497 : 33071);
        if (arg1 != 16609) {
            method2392((byte) -2, '=');
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIB)V", line = 201)
    public static final void method2394(int arg0, int arg1, byte arg2) {
        ++field5638;
        class503 var3 = class512.method3112(7, arg0, arg2 + 47);
        var3.method3075((byte) -52);
        var3.field7310 = arg1;
        if (arg2 != -47) {
            field5643 = null;
        }
    }

    @OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(Lmba;IIZ[III)V", line = 219)
    public class391(class643 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class482.field6922, class674.field9590, arg1 * arg2, arg3);
        this.field5630 = arg2;
        this.field5636 = arg1;
        super.field9272.method264(this, -2);
        if (arg3 && arg6 == 0 && arg5 == 0) {
            this.method3721(arg1, super.field9284, arg2, -112, arg4);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field9284, 0, 6408, this.field5636, this.field5630, 0, 32993, super.field9272.field9253, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!ica", name = "c", descriptor = "(B)Z", line = 238)
    public final boolean method566(byte arg0) {
        if (arg0 <= 0) {
            this.method565((class755) null, (byte[]) null, 64, -5, -115, -95, -103, 112, -48);
        }
        ++field5634;
        return true;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIIILkca;IB[FI)V", line = 249)
    public final void method2395(int arg0, int arg1, int arg2, int arg3, class755 arg4, int arg5, byte arg6, float[] arg7, int arg8) {
        ++field5641;
        super.field9272.method264(this, -2);
        if (arg6 >= -19) {
            field5645 = null;
        }
        OpenGL.glPixelStorei(3314, arg1);
        OpenGL.glTexSubImage2Df(super.field9284, 0, arg3, arg8, arg0, arg2, class397.method2411(6145, arg4), 5121, arg7, arg5);
        OpenGL.glPixelStorei(3314, 0);
    }
}
