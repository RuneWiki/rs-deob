import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class534 extends class184 implements class679 {

    @OriginalMember(owner = "client!uo", name = "F", descriptor = "I")
    private int field7222;

    @OriginalMember(owner = "client!uo", name = "G", descriptor = "I")
    private int field7223;

    @OriginalMember(owner = "client!uo", name = "C", descriptor = "[I")
    public static int[] field7219 = new int[32];

    @OriginalMember(owner = "client!uo", name = "z", descriptor = "I")
    public static int field7216 = 0;

    @OriginalMember(owner = "client!uo", name = "H", descriptor = "[I")
    public static int[] field7224 = new int[5];

    @OriginalMember(owner = "client!uo", name = "I", descriptor = "Lgo;")
    public static class581 field7225 = new class581(14, 0, 4, 1);

    @OriginalMember(owner = "client!uo", name = "O", descriptor = "[Ljava/lang/String;")
    public static String[] field7231 = new String[100];

    @OriginalMember(owner = "client!uo", name = "A", descriptor = "I")
    public static int field7217;

    @OriginalMember(owner = "client!uo", name = "B", descriptor = "I")
    public static int field7218;

    @OriginalMember(owner = "client!uo", name = "D", descriptor = "I")
    public static int field7220;

    @OriginalMember(owner = "client!uo", name = "E", descriptor = "I")
    public static int field7221;

    @OriginalMember(owner = "client!uo", name = "J", descriptor = "I")
    public static int field7226;

    @OriginalMember(owner = "client!uo", name = "K", descriptor = "I")
    public static int field7227;

    @OriginalMember(owner = "client!uo", name = "L", descriptor = "I")
    public static int field7228;

    @OriginalMember(owner = "client!uo", name = "M", descriptor = "I")
    public static int field7229;

    @OriginalMember(owner = "client!uo", name = "N", descriptor = "I")
    public static int field7230;

    @OriginalMember(owner = "client!uo", name = "P", descriptor = "I")
    public static int field7232;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(BF)F")
    public final float method2135(byte arg0, float arg1) {
        ++field7226;
        return arg0 != -84 ? 0.009146209F : arg1 / (float) this.field7223;
    }

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "(I)V")
    public static void method3029(int arg0) {
        field7219 = null;
        field7231 = null;
        field7225 = null;
        if (arg0 == 10471) {
            field7224 = null;
        }
    }

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "(I)V")
    public static final void method3030(int arg0) {
        if (arg0 >= 102) {
            class623.field8642.method3749(7648);
            ++field7220;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIZILpn;I[B)V")
    public final void method2136(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, class692 arg6, int arg7, byte[] arg8) {
        ++field7218;
        if (!arg4) {
            this.method2139(-89);
        }
        super.field2672.method2241(this, (byte) 44);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg0);
        OpenGL.glTexSubImage2Dub(super.field2661, 0, arg3, arg2, arg1, arg7, class216.method1395(arg6, (byte) -98), 5121, arg8, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Ltba;Lpn;IIZ[BII)V")
    public class534(class147 arg0, class692 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class309.field4271, arg2 * arg3, arg4);
        this.field7222 = arg3;
        this.field7223 = arg2;
        super.field2672.method2241(this, (byte) 44);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && ~arg7 == -1 && arg6 == 0) {
            this.method1263(arg2, arg5, arg3, 5, super.field2661);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field2661, 0, this.method1262(-114), arg2, arg3, 0, class216.method1395(super.field2651, (byte) -94), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(I)I")
    public final int method2141(int arg0) {
        ++field7221;
        if (arg0 != 4845) {
            method3030(-72);
        }
        return this.field7222;
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Ltba;IIZ[III)V")
    public class534(class147 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class129.field1851, class309.field4271, arg1 * arg2, arg3);
        this.field7223 = arg1;
        this.field7222 = arg2;
        super.field2672.method2241(this, (byte) 44);
        if (arg3 && arg6 == 0 && ~arg5 == -1) {
            this.method1264(super.field2661, arg2, arg1, true, arg4);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field2661, 0, 6408, this.field7223, this.field7222, 0, 32993, super.field2672.field2176, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(I)I")
    public final int method2139(int arg0) {
        ++field7217;
        int var2 = -11 % ((-34 - arg0) / 42);
        return this.field7223;
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(BF)F")
    public final float method2138(byte arg0, float arg1) {
        ++field7229;
        return arg0 <= 94 ? 0.97380596F : arg1 / (float) this.field7222;
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Ltba;Lpn;Ljg;II)V")
    public class534(class147 arg0, class692 arg1, class309 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field7223 = arg3;
        this.field7222 = arg4;
        super.field2672.method2241(this, (byte) 44);
        OpenGL.glTexImage2Dub(super.field2661, 0, this.method1262(-123), arg3, arg4, 0, class216.method1395(super.field2651, (byte) -76), class58.method484(5120, super.field2666), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)Z")
    public final boolean method2140(int arg0) {
        if (arg0 != 17615) {
            this.field7223 = -33;
        }
        ++field7228;
        return true;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(III[IIIII)V")
    public final void method2134(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field7230;
        super.field2672.method2241(this, (byte) 44);
        OpenGL.glPixelStorei(3314, arg7);
        if (arg2 == 19390) {
            OpenGL.glTexSubImage2Di(super.field2661, 0, arg5, arg4, arg6, arg1, 32993, super.field2672.field2176, arg3, arg0);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ZIZ)V")
    public final void method2137(boolean arg0, int arg1, boolean arg2) {
        super.field2672.method2241(this, (byte) 44);
        ++field7227;
        OpenGL.glTexParameteri(super.field2661, 10242, !arg0 ? 33071 : 10497);
        if (arg1 <= 28) {
            field7231 = null;
        }
        OpenGL.glTexParameteri(super.field2661, 10243, !arg2 ? 33071 : 10497);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIIII[FLpn;)V")
    public final void method3031(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, class692 arg8) {
        if (arg1 != 6644) {
            field7231 = null;
        }
        super.field2672.method2241(this, (byte) 44);
        ++field7232;
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexSubImage2Df(super.field2661, 0, arg3, arg4, arg6, arg2, class216.method1395(arg8, (byte) -90), 5121, arg7, arg0);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Ltba;Lpn;IIZ[FII)V")
    public class534(class147 arg0, class692 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class309.field4275, arg2 * arg3, arg4);
        this.field7222 = arg3;
        this.field7223 = arg2;
        super.field2672.method2241(this, (byte) 44);
        if (!arg4 && arg7 == 0 && arg6 == 0) {
            this.method1268((byte) 57, arg5, arg3, arg2, super.field2661);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field2661, 0, this.method1262(-117), arg2, arg3, 0, class216.method1395(super.field2651, (byte) -102), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }
}
