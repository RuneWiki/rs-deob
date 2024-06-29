import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class244 extends class407 implements class483 {

    @OriginalMember(owner = "client!kv", name = "D", descriptor = "I")
    private int field3473;

    @OriginalMember(owner = "client!kv", name = "N", descriptor = "I")
    private int field3483;

    @OriginalMember(owner = "client!kv", name = "B", descriptor = "Luc;")
    public static class27 field3471 = new class27(36, 6);

    @OriginalMember(owner = "client!kv", name = "L", descriptor = "Z")
    public static boolean field3481 = false;

    @OriginalMember(owner = "client!kv", name = "y", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!kv", name = "z", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!kv", name = "A", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!kv", name = "C", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!kv", name = "F", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!kv", name = "G", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!kv", name = "H", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!kv", name = "I", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!kv", name = "J", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!kv", name = "K", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!kv", name = "M", descriptor = "[Lxa;")
    public static class461[] field3482;

    @OriginalMember(owner = "client!kv", name = "E", descriptor = "[Ljava/lang/String;")
    public static String[] field3474;

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lmc;IIZ[III)V", line = 4)
    public class244(class120 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class583.field8126, class82.field1147, arg1 * arg2, arg3);
        this.field3473 = arg2;
        this.field3483 = arg1;
        super.field5749.method3232(false, this);
        if (arg3 && arg6 == 0 && ~arg5 == -1) {
            this.method2323(arg2, arg1, 16384, arg4, super.field5733);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field5733, 0, 6408, this.field3483, this.field3473, 0, 32993, super.field5749.field1666, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "(I)V", line = 23)
    public static void method1512(int arg0) {
        if (arg0 != 3553) {
            method1513(-103, (class132) null);
        }
        field3474 = null;
        field3471 = null;
        field3482 = null;
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lmc;Lkf;IIZ[BII)V", line = 35)
    public class244(class120 arg0, class229 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class82.field1147, arg2 * arg3, arg4);
        this.field3473 = arg3;
        this.field3483 = arg2;
        super.field5749.method3232(false, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && ~arg7 == -1 && arg6 == 0) {
            this.method2318(arg3, 1, super.field5733, arg2, arg5);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field5733, 0, this.method2322(false), arg2, arg3, 0, class422.method2400((byte) 61, super.field5740), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Z)Z", line = 58)
    public final boolean method788(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            ++field3476;
            return true;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(FB)F", line = 72)
    public final float method787(float arg0, byte arg1) {
        ++field3468;
        return arg1 < 24 ? -0.7187196F : arg0 / (float) this.field3473;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(ZIZ)V", line = 83)
    public final void method786(boolean arg0, int arg1, boolean arg2) {
        super.field5749.method3232(false, this);
        ++field3478;
        if (arg1 != 27469) {
            this.field3473 = 21;
        }
        OpenGL.glTexParameteri(super.field5733, 10242, !arg0 ? 33071 : 10497);
        OpenGL.glTexParameteri(super.field5733, 10243, !arg2 ? 33071 : 10497);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(ILpj;)V", line = 97)
    public static final void method1513(int arg0, class132 arg1) {
        ++field3472;
        class459.field6499 = arg1.method920(2, "p11_full");
        class97.field1322 = arg1.method920(2, "p12_full");
        int var2 = -21 % ((arg0 - -57) / 57);
        class235.field3396 = arg1.method920(2, "b12_full");
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)I", line = 111)
    public final int method785(int arg0) {
        ++field3475;
        if (arg0 > -55) {
            this.field3483 = -82;
        }
        return this.field3473;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(I[FIIILkf;IIB)V", line = 123)
    public final void method1514(int arg0, float[] arg1, int arg2, int arg3, int arg4, class229 arg5, int arg6, int arg7, byte arg8) {
        super.field5749.method3232(false, this);
        ++field3469;
        if (arg8 > -66) {
            this.method780((byte) -98);
        }
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexSubImage2Df(super.field5733, 0, arg0, arg4, arg3, arg7, class422.method2400((byte) 61, arg5), 5121, arg1, arg2);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIII[III)V", line = 137)
    public final void method782(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7) {
        ++field3479;
        super.field5749.method3232(false, this);
        OpenGL.glPixelStorei(3314, arg3);
        int var9 = 82 % ((arg7 - 62) / 56);
        OpenGL.glTexSubImage2Di(super.field5733, 0, arg0, arg2, arg1, arg6, 32993, super.field5749.field1666, arg5, arg4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lmc;Lkf;IIZ[FII)V", line = 153)
    public class244(class120 arg0, class229 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class82.field1151, arg2 * arg3, arg4);
        this.field3473 = arg3;
        this.field3483 = arg2;
        super.field5749.method3232(false, this);
        if (!arg4 && arg7 == 0 && arg6 == 0) {
            this.method2317(arg3, arg5, arg2, super.field5733, (byte) -125);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field5733, 0, this.method2322(false), arg2, arg3, 0, class422.method2400((byte) 61, super.field5740), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(FI)F", line = 172)
    public final float method781(float arg0, int arg1) {
        ++field3480;
        if (arg1 != -8639) {
            method1513(57, (class132) null);
        }
        return arg0 / (float) this.field3483;
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lmc;Lkf;Lps;II)V", line = 183)
    public class244(class120 arg0, class229 arg1, class82 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field3483 = arg3;
        this.field3473 = arg4;
        super.field5749.method3232(false, this);
        OpenGL.glTexImage2Dub(super.field5733, 0, this.method2322(false), arg3, arg4, 0, class422.method2400((byte) 61, super.field5740), class388.method2235(super.field5732, -119), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "([BIIILkf;ZIII)V", line = 194)
    public final void method783(byte[] arg0, int arg1, int arg2, int arg3, class229 arg4, boolean arg5, int arg6, int arg7, int arg8) {
        ++field3470;
        super.field5749.method3232(false, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg8);
        OpenGL.glTexSubImage2Dub(super.field5733, 0, arg6, arg1, arg2, arg3, class422.method2400((byte) 61, arg4), 5121, arg0, arg7);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
        if (!arg5) {
            field3481 = false;
        }
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(B)I", line = 211)
    public final int method780(byte arg0) {
        ++field3477;
        return arg0 != -93 ? 120 : this.field3483;
    }
}
