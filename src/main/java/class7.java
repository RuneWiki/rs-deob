import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class7 extends class651 implements class166 {

    @OriginalMember(owner = "client!il", name = "O", descriptor = "I")
    private int field78;

    @OriginalMember(owner = "client!il", name = "B", descriptor = "I")
    private int field68;

    @OriginalMember(owner = "client!il", name = "F", descriptor = "I")
    public static int field71 = -1;

    @OriginalMember(owner = "client!il", name = "z", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!il", name = "A", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!il", name = "C", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!il", name = "E", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!il", name = "G", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!il", name = "I", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!il", name = "J", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!il", name = "L", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!il", name = "M", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!il", name = "N", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!il", name = "Q", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!il", name = "P", descriptor = "Lcb;")
    public static class544 field79;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)I")
    public final int method34(byte arg0) {
        if (arg0 != -109) {
            return -29;
        } else {
            ++field77;
            return this.field78;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lwq;B)V")
    public static final void method35(class176 arg0, byte arg1) {
        if (~arg0.field2560 == -6 && arg0.field2540 != -1) {
            class673.method3821(-16777216, arg0, class638.field8979);
        }
        if (arg1 <= 101) {
            method45(-41, 8, (class544) null, 106);
        }
        ++field74;
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Log;II[III)V")
    public class7(class673 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class12.field247, class770.field10614, arg1 * arg2, false);
        this.field78 = arg1;
        this.field68 = arg2;
        super.field9169.method1104(true, this);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field9160, 0, 6408, this.field78, this.field68, 0, 32993, super.field9169.field9539, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(IF)F")
    public final float method36(int arg0, float arg1) {
        int var3 = 27 % ((arg0 - 65) / 61);
        ++field76;
        return arg1;
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Log;Lofa;Lkn;II)V")
    public class7(class673 arg0, class345 arg1, class770 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field78 = arg3;
        this.field68 = arg4;
        super.field9169.method1104(true, this);
        OpenGL.glTexImage2Dub(super.field9160, 0, this.method3733(-75), arg3, arg4, 0, class379.method2342(super.field9176, 6410), class728.method4086(super.field9179, true), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "([IZIIIII)V")
    public final void method37(int[] arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field73;
        int[] var8 = new int[this.field78 * this.field68];
        super.field9169.method1104(arg1, this);
        OpenGL.glGetTexImagei(super.field9160, 0, 32993, 5121, var8, 0);
        for (int var9 = 0; ~var9 > ~arg5; ++var9) {
            class42.method289(var8, (arg4 + arg5 - 1 + -var9) * this.field78, arg0, arg3 * var9 + arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)I")
    public final int method38(int arg0) {
        ++field72;
        int var2 = 96 / ((45 - arg0) / 51);
        return this.field68;
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Log;Lofa;II[BII)V")
    public class7(class673 arg0, class345 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class770.field10614, arg2 * arg3, false);
        this.field68 = arg3;
        this.field78 = arg2;
        super.field9169.method1104(true, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field9160, 0, this.method3733(-113), arg2, arg3, 0, class379.method2342(super.field9176, 6410), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IF)F")
    public final float method39(int arg0, float arg1) {
        if (arg0 != 2170) {
            this.method37((int[]) null, true, 76, -53, 33, -108, -104);
        }
        ++field69;
        return arg1;
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(I)Z")
    public final boolean method40(int arg0) {
        if (arg0 != 27610) {
            return true;
        } else {
            ++field70;
            return false;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIIZI[I)V")
    public final void method41(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        if (arg5) {
            this.method36(37, 0.345572F);
        }
        if (arg2 == 0) {
            arg2 = arg1;
        }
        super.field9169.method1104(true, this);
        ++field66;
        if (arg1 != arg2) {
            OpenGL.glPixelStorei(3314, arg2);
        }
        OpenGL.glTexSubImage2Di(super.field9160, 0, arg3, arg6, arg1, arg4, 32993, super.field9169.field9539, arg7, arg0);
        if (arg1 != arg2) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZBZ)V")
    public final void method42(boolean arg0, byte arg1, boolean arg2) {
        if (arg1 >= -111) {
            this.method34((byte) 71);
        }
        ++field67;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIILofa;[BIZI)V")
    public final void method43(int arg0, int arg1, int arg2, int arg3, class345 arg4, byte[] arg5, int arg6, boolean arg7, int arg8) {
        if (~arg2 == -1) {
            arg2 = arg6;
        }
        ++field75;
        super.field9169.method1104(true, this);
        if (!arg7) {
            OpenGL.glPixelStorei(3317, 1);
            if (~arg2 != ~arg6) {
                OpenGL.glPixelStorei(3314, arg2);
            }
            OpenGL.glTexSubImage2Dub(super.field9160, 0, arg8, arg0, arg6, arg3, class379.method2342(arg4, 6410), 5121, arg5, arg1);
            if (arg2 != arg6) {
                OpenGL.glPixelStorei(3314, 0);
            }
            OpenGL.glPixelStorei(3317, 4);
        }
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(B)V")
    public static void method44(byte arg0) {
        if (arg0 <= 64) {
            method45(71, -39, (class544) null, 90);
        }
        field79 = null;
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Log;Lofa;II[FII)V")
    public class7(class673 arg0, class345 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class770.field10618, arg2 * arg3, false);
        this.field68 = arg3;
        this.field78 = arg2;
        super.field9169.method1104(true, this);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field9160, 0, this.method3733(-87), arg2, arg3, 0, class379.method2342(super.field9176, 6410), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IILcb;I)Lkf;")
    public static final class263 method45(int arg0, int arg1, class544 arg2, int arg3) {
        if (arg1 != 18925) {
            field71 = -4;
        }
        ++field80;
        byte[] var4 = arg2.method3150(arg0, -118, arg3);
        return var4 == null ? null : new class263(var4);
    }
}
