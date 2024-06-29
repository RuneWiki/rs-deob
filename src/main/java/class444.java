import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class444 extends class594 implements class190 {

    @OriginalMember(owner = "client!qq", name = "C", descriptor = "I")
    private int field6383;

    @OriginalMember(owner = "client!qq", name = "I", descriptor = "I")
    private int field6389;

    @OriginalMember(owner = "client!qq", name = "H", descriptor = "Z")
    public static boolean field6388 = false;

    @OriginalMember(owner = "client!qq", name = "T", descriptor = "Z")
    public static boolean field6400 = false;

    @OriginalMember(owner = "client!qq", name = "B", descriptor = "I")
    public static int field6382;

    @OriginalMember(owner = "client!qq", name = "D", descriptor = "I")
    public static int field6384;

    @OriginalMember(owner = "client!qq", name = "E", descriptor = "I")
    public static int field6385;

    @OriginalMember(owner = "client!qq", name = "F", descriptor = "I")
    public static int field6386;

    @OriginalMember(owner = "client!qq", name = "G", descriptor = "I")
    public static int field6387;

    @OriginalMember(owner = "client!qq", name = "J", descriptor = "I")
    public static int field6390;

    @OriginalMember(owner = "client!qq", name = "K", descriptor = "I")
    public static int field6391;

    @OriginalMember(owner = "client!qq", name = "L", descriptor = "I")
    public static int field6392;

    @OriginalMember(owner = "client!qq", name = "M", descriptor = "I")
    public static int field6393;

    @OriginalMember(owner = "client!qq", name = "N", descriptor = "I")
    public static int field6394;

    @OriginalMember(owner = "client!qq", name = "P", descriptor = "I")
    public static int field6396;

    @OriginalMember(owner = "client!qq", name = "Q", descriptor = "I")
    public static int field6397;

    @OriginalMember(owner = "client!qq", name = "R", descriptor = "I")
    public static int field6398;

    @OriginalMember(owner = "client!qq", name = "S", descriptor = "I")
    public static int field6399;

    @OriginalMember(owner = "client!qq", name = "O", descriptor = "Lom;")
    public static class344 field6395;

    @OriginalMember(owner = "client!qq", name = "U", descriptor = "Lmd;")
    public static class506 field6401;

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(I)I")
    public final int method472(int arg0) {
        ++field6399;
        if (arg0 != 19099) {
            field6382 = 127;
        }
        return this.field6383;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lus;I[I[IIZ)Lwg;")
    public static final class394 method2670(class1 arg0, int arg1, int[] arg2, int[] arg3, int arg4, boolean arg5) {
        ++field6392;
        byte[] var6 = new byte[arg1 * arg4];
        if (!arg5) {
            return null;
        } else {
            for (int var7 = 0; arg4 > var7; ++var7) {
                int var8 = arg1 * var7 + arg3[var7];
                for (int var9 = 0; ~arg2[var7] < ~var9; ++var9) {
                    var6[var8++] = -1;
                }
            }
            return new class394(arg0, arg1, arg4, var6);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lom;IZIII)V")
    public static final void method2671(class344 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg3 != 6408) {
            method2672(-43);
        }
        class76.method813(arg2, arg1, 18506, arg0, 0L, arg5, arg4);
        ++field6398;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)Z")
    public final boolean method473(int arg0) {
        if (arg0 != 27) {
            return false;
        } else {
            ++field6396;
            return false;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(FI)F")
    public final float method471(float arg0, int arg1) {
        if (arg1 != 5235) {
            return -1.1971244F;
        } else {
            ++field6393;
            return arg0;
        }
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Ljq;Lfda;II[FII)V")
    public class444(class475 arg0, class294 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class2.field376, arg2 * arg3, false);
        this.field6383 = arg3;
        this.field6389 = arg2;
        super.field8555.method3266(-2, this);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field8554, 0, this.method3387(-3), arg2, arg3, 0, class635.method3618(super.field8543, 1), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Ljq;Lfda;II[BII)V")
    public class444(class475 arg0, class294 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class2.field372, arg2 * arg3, false);
        this.field6389 = arg2;
        this.field6383 = arg3;
        super.field8555.method3266(-2, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field8554, 0, this.method3387(-3), arg2, arg3, 0, class635.method3618(super.field8543, 1), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZIZ)V")
    public final void method465(boolean arg0, int arg1, boolean arg2) {
        if (arg1 != 13321) {
            this.method470((class294) null, -23, 39, -80, 68, -120, (byte[]) null, true, 126);
        }
        ++field6386;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IBI[IIIII)V")
    public final void method464(int arg0, byte arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field6394;
        if (arg4 == 0) {
            arg4 = arg5;
        }
        super.field8555.method3266(-2, this);
        if (~arg4 != ~arg5) {
            OpenGL.glPixelStorei(3314, arg4);
        }
        OpenGL.glTexSubImage2Di(super.field8554, 0, arg2, arg6, arg5, arg7, 32993, super.field8555.field6838, arg3, arg0);
        int var9 = -104 / ((61 - arg1) / 43);
        if (~arg4 != ~arg5) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(FI)F")
    public final float method467(float arg0, int arg1) {
        if (arg1 != -13359) {
            field6395 = null;
        }
        ++field6385;
        return arg0;
    }

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "(I)V")
    public static void method2672(int arg0) {
        if (arg0 == -1) {
            field6401 = null;
            field6395 = null;
        }
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Ljq;Lfda;Lro;II)V")
    public class444(class475 arg0, class294 arg1, class2 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field6383 = arg4;
        this.field6389 = arg3;
        super.field8555.method3266(-2, this);
        OpenGL.glTexImage2Dub(super.field8554, 0, this.method3387(-3), arg3, arg4, 0, class635.method3618(super.field8543, 1), class89.method867(true, super.field8551), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Ljq;II[III)V")
    public class444(class475 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class121.field2214, class2.field372, arg1 * arg2, false);
        this.field6389 = arg1;
        this.field6383 = arg2;
        super.field8555.method3266(-2, this);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field8554, 0, 6408, this.field6389, this.field6383, 0, 32993, super.field8555.field6838, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "(I)V")
    public static final void method2673(int arg0) {
        ++field6384;
        if (class623.field9017.method98()) {
            class623.field9017.method23(class699.field9853);
            class85.method856((byte) -111);
            class623.field9017.method46(class699.field9853);
            class623.field9017.method185(class699.field9853);
        } else {
            class294.method1959((byte) 124, class90.field1654);
        }
        class293.method1954(arg0);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lfda;IIIII[BZI)V")
    public final void method470(class294 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, boolean arg7, int arg8) {
        if (~arg4 == -1) {
            arg4 = arg8;
        }
        super.field8555.method3266(-2, this);
        ++field6391;
        OpenGL.glPixelStorei(3317, 1);
        if (~arg4 != ~arg8) {
            OpenGL.glPixelStorei(3314, arg4);
        }
        OpenGL.glTexSubImage2Dub(super.field8554, 0, arg2, arg5, arg8, arg3, class635.method3618(arg0, 1), 5121, arg6, arg1);
        if (~arg4 != ~arg8) {
            OpenGL.glPixelStorei(3314, 0);
        }
        if (arg7) {
            field6397 = 73;
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)I")
    public final int method466(int arg0) {
        ++field6390;
        if (arg0 != -29159) {
            field6400 = true;
        }
        return this.field6389;
    }
}
