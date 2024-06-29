import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class393 extends class7 implements class422 {

    @OriginalMember(owner = "client!nq", name = "I", descriptor = "I")
    private int field5410;

    @OriginalMember(owner = "client!nq", name = "z", descriptor = "I")
    private int field5401;

    @OriginalMember(owner = "client!nq", name = "C", descriptor = "Ltda;")
    public static class546 field5404 = new class546(13, 0, 1, 0);

    @OriginalMember(owner = "client!nq", name = "H", descriptor = "[Ltt;")
    public static class78[] field5409 = new class78[14];

    @OriginalMember(owner = "client!nq", name = "v", descriptor = "I")
    public static int field5397;

    @OriginalMember(owner = "client!nq", name = "w", descriptor = "I")
    public static int field5398;

    @OriginalMember(owner = "client!nq", name = "x", descriptor = "I")
    public static int field5399;

    @OriginalMember(owner = "client!nq", name = "y", descriptor = "I")
    public static int field5400;

    @OriginalMember(owner = "client!nq", name = "A", descriptor = "I")
    public static int field5402;

    @OriginalMember(owner = "client!nq", name = "B", descriptor = "I")
    public static int field5403;

    @OriginalMember(owner = "client!nq", name = "D", descriptor = "I")
    public static int field5405;

    @OriginalMember(owner = "client!nq", name = "E", descriptor = "I")
    public static int field5406;

    @OriginalMember(owner = "client!nq", name = "G", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!nq", name = "J", descriptor = "I")
    public static int field5411;

    @OriginalMember(owner = "client!nq", name = "K", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!nq", name = "F", descriptor = "[Liq;")
    public static class521[] field5407;

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lag;Laq;II[FII)V")
    public class393(class587 arg0, class141 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class194.field2878, arg2 * arg3, false);
        this.field5410 = arg3;
        this.field5401 = arg2;
        super.field69.method2632(this, 0);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field78, 0, this.method29((byte) -86), arg2, arg3, 0, class546.method3319(30, super.field63), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "(I)V")
    public static void method2335(int arg0) {
        field5404 = null;
        field5409 = null;
        field5407 = null;
        if (arg0 != -10489) {
            field5407 = null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)Z")
    public final boolean method1652(byte arg0) {
        int var2 = 76 % ((-6 - arg0) / 48);
        ++field5411;
        return false;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZZZ)V")
    public final void method1648(boolean arg0, boolean arg1, boolean arg2) {
        ++field5408;
        if (!arg2) {
            this.field5410 = -117;
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(B)I")
    public final int method1655(byte arg0) {
        if (arg0 > -99) {
            return -6;
        } else {
            ++field5398;
            return this.field5401;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(III)Z")
    public static final boolean method2336(int arg0, int arg1, int arg2) {
        ++field5412;
        if (arg1 != -9359) {
            method2338(-70);
        }
        return ~(24 & arg0) != -1 | (544 & arg0) == 544;
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lag;Laq;II[BII)V")
    public class393(class587 arg0, class141 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class194.field2874, arg2 * arg3, false);
        this.field5401 = arg2;
        this.field5410 = arg3;
        super.field69.method2632(this, 0);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field78, 0, this.method29((byte) -86), arg2, arg3, 0, class546.method3319(123, super.field63), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2337(String arg0, int arg1) {
        if (arg1 != 1) {
            field5409 = null;
        }
        if (class540.field8106 == null) {
            class287.method1780(-78660991);
        }
        ++field5403;
        String[] var2 = class587.method3490('\n', 116, arg0);
        for (int var3 = 0; var3 < var2.length; ++var3) {
            for (int var4 = class33.field399; var4 > 0; --var4) {
                class540.field8106[var4] = class540.field8106[var4 + -1];
            }
            class540.field8106[0] = var2[var3];
            if (~(class540.field8106.length + -1) < ~class33.field399) {
                if (~class182.field2744 < -1) {
                    ++class182.field2744;
                }
                ++class33.field399;
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lag;Laq;Lui;II)V")
    public class393(class587 arg0, class141 arg1, class194 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field5401 = arg3;
        this.field5410 = arg4;
        super.field69.method2632(this, 0);
        OpenGL.glTexImage2Dub(super.field78, 0, this.method29((byte) -86), arg3, arg4, 0, class546.method3319(81, super.field63), class595.method3522(super.field66, (byte) -43), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(III[IIIIZ)V")
    public final void method1654(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, boolean arg7) {
        ++field5399;
        if (~arg2 == -1) {
            arg2 = arg6;
        }
        if (!arg7) {
            this.field5410 = 106;
        }
        super.field69.method2632(this, 0);
        if (arg2 != arg6) {
            OpenGL.glPixelStorei(3314, arg2);
        }
        OpenGL.glTexSubImage2Di(super.field78, 0, arg5, arg1, arg6, arg0, 32993, super.field69.field8711, arg3, arg4);
        if (arg2 != arg6) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(FI)F")
    public final float method1651(float arg0, int arg1) {
        ++field5406;
        int var3 = 99 / ((arg1 - -48) / 56);
        return arg0;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(FB)F")
    public final float method1653(float arg0, byte arg1) {
        ++field5397;
        int var3 = -14 / ((-6 - arg1) / 54);
        return arg0;
    }

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "(I)I")
    public static final int method2338(int arg0) {
        int var1 = 93 / ((28 - arg0) / 48);
        ++field5400;
        return 2;
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lag;II[III)V")
    public class393(class587 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class488.field6956, class194.field2874, arg1 * arg2, false);
        this.field5410 = arg2;
        this.field5401 = arg1;
        super.field69.method2632(this, 0);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field78, 0, 6408, this.field5401, this.field5410, 0, 32993, super.field69.field8711, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(II[BIIILaq;IB)V")
    public final void method1647(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, class141 arg6, int arg7, byte arg8) {
        if (arg5 == 0) {
            arg5 = arg7;
        }
        ++field5405;
        super.field69.method2632(this, 0);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 != arg7) {
            OpenGL.glPixelStorei(3314, arg5);
        }
        OpenGL.glTexSubImage2Dub(super.field78, 0, arg3, arg4, arg7, arg0, class546.method3319(56, arg6), 5121, arg2, arg1);
        if (~arg5 != ~arg7) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
        int var10 = -41 / ((arg8 - -53) / 32);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)I")
    public final int method1650(int arg0) {
        if (arg0 != 10264) {
            this.method1654(-34, 4, 95, (int[]) null, -113, 83, 17, false);
        }
        ++field5402;
        return this.field5410;
    }
}
