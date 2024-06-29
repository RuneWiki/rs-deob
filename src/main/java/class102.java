import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class102 extends class407 implements class483 {

    @OriginalMember(owner = "client!uaa", name = "y", descriptor = "I")
    private int field1379;

    @OriginalMember(owner = "client!uaa", name = "I", descriptor = "I")
    private int field1388;

    @OriginalMember(owner = "client!uaa", name = "A", descriptor = "[[I")
    public static int[][] field1381 = new int[6][];

    @OriginalMember(owner = "client!uaa", name = "F", descriptor = "F")
    public static float field1385 = 1.0F;

    @OriginalMember(owner = "client!uaa", name = "z", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!uaa", name = "B", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!uaa", name = "C", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!uaa", name = "D", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!uaa", name = "G", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!uaa", name = "H", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!uaa", name = "J", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!uaa", name = "K", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!uaa", name = "L", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(B)I", line = 3)
    public final int method780(byte arg0) {
        if (arg0 != -93) {
            return -90;
        } else {
            ++field1382;
            return this.field1379;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(Lmc;Lkf;II[FII)V", line = 15)
    public class102(class120 arg0, class229 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class82.field1151, arg2 * arg3, false);
        this.field1379 = arg2;
        this.field1388 = arg3;
        super.field5749.method3232(false, this);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field5733, 0, this.method2322(false), arg2, arg3, 0, class422.method2400((byte) 61, super.field5740), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(FI)F", line = 28)
    public final float method781(float arg0, int arg1) {
        if (arg1 != -8639) {
            return -0.3711798F;
        } else {
            ++field1380;
            return arg0;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IIIII[III)V", line = 39)
    public final void method782(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7) {
        ++field1384;
        if (arg3 == 0) {
            arg3 = arg1;
        }
        super.field5749.method3232(false, this);
        if (~arg1 != ~arg3) {
            OpenGL.glPixelStorei(3314, arg3);
        }
        int var9 = 38 / ((62 - arg7) / 56);
        OpenGL.glTexSubImage2Di(super.field5733, 0, arg0, arg2, arg1, arg6, 32993, super.field5749.field1666, arg5, arg4);
        if (~arg1 != ~arg3) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "([BIIILkf;ZIII)V", line = 60)
    public final void method783(byte[] arg0, int arg1, int arg2, int arg3, class229 arg4, boolean arg5, int arg6, int arg7, int arg8) {
        ++field1386;
        super.field5749.method3232(false, this);
        if (~arg8 == -1) {
            arg8 = arg2;
        }
        OpenGL.glPixelStorei(3317, 1);
        if (arg2 != arg8) {
            OpenGL.glPixelStorei(3314, arg8);
        }
        if (arg5) {
            OpenGL.glTexSubImage2Dub(super.field5733, 0, arg6, arg1, arg2, arg3, class422.method2400((byte) 61, arg4), 5121, arg0, arg7);
            if (arg2 != arg8) {
                OpenGL.glPixelStorei(3314, 0);
            }
            OpenGL.glPixelStorei(3317, 4);
        }
    }

    @OriginalMember(owner = "client!uaa", name = "f", descriptor = "(I)Z", line = 88)
    public static final boolean method784(int arg0) {
        ++field1390;
        int var1 = 98 % ((-5 - arg0) / 37);
        if (class413.field5848) {
            try {
                if ((Boolean) class2.method11("showingVideoAd", class188.field2779, 21190)) {
                    return false;
                }
                return true;
            } catch (Throwable var2) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)I", line = 107)
    public final int method785(int arg0) {
        if (arg0 >= -55) {
            return 25;
        } else {
            ++field1391;
            return this.field1388;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ZIZ)V", line = 119)
    public final void method786(boolean arg0, int arg1, boolean arg2) {
        if (arg1 != 27469) {
            this.method787(0.7959194F, (byte) -4);
        }
        ++field1383;
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(FB)F", line = 130)
    public final float method787(float arg0, byte arg1) {
        if (arg1 <= 24) {
            return 0.07406468F;
        } else {
            ++field1387;
            return arg0;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Z)Z", line = 145)
    public final boolean method788(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            ++field1389;
            return false;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(Lmc;II[III)V", line = 156)
    public class102(class120 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class583.field8126, class82.field1147, arg1 * arg2, false);
        this.field1388 = arg2;
        this.field1379 = arg1;
        super.field5749.method3232(false, this);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field5733, 0, 6408, this.field1379, this.field1388, 0, 32993, super.field5749.field1666, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "(B)V", line = 169)
    public static void method789(byte arg0) {
        if (arg0 == -70) {
            field1381 = null;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(Lmc;Lkf;II[BII)V", line = 189)
    public class102(class120 arg0, class229 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class82.field1147, arg2 * arg3, false);
        this.field1379 = arg2;
        this.field1388 = arg3;
        super.field5749.method3232(false, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field5733, 0, this.method2322(false), arg2, arg3, 0, class422.method2400((byte) 61, super.field5740), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(Lmc;Lkf;Lps;II)V", line = 205)
    public class102(class120 arg0, class229 arg1, class82 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field1379 = arg3;
        this.field1388 = arg4;
        super.field5749.method3232(false, this);
        OpenGL.glTexImage2Dub(super.field5733, 0, this.method2322(false), arg3, arg4, 0, class422.method2400((byte) 61, super.field5740), class388.method2235(super.field5732, 124), (byte[]) null, 0);
    }
}
