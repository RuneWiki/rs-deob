import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class342 extends class300 implements class212 {

    @OriginalMember(owner = "client!vk", name = "B", descriptor = "I")
    private int field4357;

    @OriginalMember(owner = "client!vk", name = "z", descriptor = "I")
    private int field4355;

    @OriginalMember(owner = "client!vk", name = "y", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!vk", name = "A", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!vk", name = "C", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!vk", name = "D", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!vk", name = "F", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!vk", name = "G", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!vk", name = "H", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!vk", name = "I", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!vk", name = "J", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!vk", name = "K", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZZI)V", line = 4)
    public final void method40(boolean arg0, boolean arg1, int arg2) {
        if (arg2 == 7220) {
            ++field4359;
        }
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lel;Lnh;II[BII)V", line = 14)
    public class342(class513 arg0, class699 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class100.field1288, arg2 * arg3, false);
        this.field4357 = arg2;
        this.field4355 = arg3;
        super.field3828.method1349(this, false);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field3816, 0, this.method1787(92), arg2, arg3, 0, class237.method1429(super.field3827, 1002608112), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)I", line = 30)
    public final int method36(int arg0) {
        ++field4358;
        if (arg0 != -24981) {
            this.field4355 = -19;
        }
        return this.field4355;
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)I", line = 41)
    public final int method37(int arg0) {
        ++field4362;
        return arg0 != -18693 ? 75 : this.field4357;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(BF)F", line = 54)
    public final float method42(byte arg0, float arg1) {
        ++field4356;
        if (arg0 <= 125) {
            this.method34(4, -96, -73, true, -124, 124, (class699) null, 71, (byte[]) null);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)I", line = 66)
    public static final int method1954(int arg0, int arg1) {
        ++field4354;
        return arg0 != 5121 ? -42 : (261898 & arg1) >> 11;
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lel;Lnh;Ljr;II)V", line = 77)
    public class342(class513 arg0, class699 arg1, class100 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field4355 = arg4;
        this.field4357 = arg3;
        super.field3828.method1349(this, false);
        OpenGL.glTexImage2Dub(super.field3816, 0, this.method1787(99), arg3, arg4, 0, class237.method1429(super.field3827, 1002608112), class111.method772((byte) -121, super.field3815), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "(I)Lfca;", line = 92)
    public static final class79 method1955(int arg0) {
        ++field4363;
        if (class604.field8112 != null && class256.field3286 != null) {
            class256.field3286.method1607(class604.field8112, (byte) 121);
            class79 var1 = (class79) class256.field3286.method1608(3);
            if (var1 == null) {
                return null;
            } else {
                if (arg0 >= -67) {
                    method1954(96, -62);
                }
                class663 var2 = class604.field8104.method93(var1.field1034, (byte) 110);
                return var2 != null && var2.field8977 && var2.method3688((byte) 126, class604.field8100) ? var1 : class581.method3214(false);
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)Z", line = 121)
    public final boolean method38(byte arg0) {
        ++field4365;
        if (arg0 < 91) {
            this.field4357 = 12;
        }
        return false;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIZIILnh;I[B)V", line = 132)
    public final void method34(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, class699 arg6, int arg7, byte[] arg8) {
        if (arg7 == 0) {
            arg7 = arg1;
        }
        if (arg3) {
            this.field4355 = 79;
        }
        super.field3828.method1349(this, arg3);
        ++field4360;
        OpenGL.glPixelStorei(3317, 1);
        if (~arg1 != ~arg7) {
            OpenGL.glPixelStorei(3314, arg7);
        }
        OpenGL.glTexSubImage2Dub(super.field3816, 0, arg2, arg4, arg1, arg5, class237.method1429(arg6, 1002608112), 5121, arg8, arg0);
        if (~arg1 != ~arg7) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(FI)F", line = 159)
    public final float method39(float arg0, int arg1) {
        if (arg1 >= -79) {
            method1955(106);
        }
        ++field4361;
        return arg0;
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lel;Lnh;II[FII)V", line = 170)
    public class342(class513 arg0, class699 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class100.field1292, arg2 * arg3, false);
        this.field4355 = arg3;
        this.field4357 = arg2;
        super.field3828.method1349(this, false);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field3816, 0, this.method1787(115), arg2, arg3, 0, class237.method1429(super.field3827, 1002608112), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lel;II[III)V", line = 183)
    public class342(class513 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class556.field6946, class100.field1288, arg1 * arg2, false);
        this.field4355 = arg2;
        this.field4357 = arg1;
        super.field3828.method1349(this, false);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field3816, 0, 6408, this.field4357, this.field4355, 0, 32993, super.field3828.field6530, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "([IIIIIIII)V", line = 198)
    public final void method35(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (~arg5 == -1) {
            arg5 = arg3;
        }
        int var9 = -22 / ((arg6 - -8) / 47);
        ++field4364;
        super.field3828.method1349(this, false);
        if (arg3 != arg5) {
            OpenGL.glPixelStorei(3314, arg5);
        }
        OpenGL.glTexSubImage2Di(super.field3816, 0, arg7, arg4, arg3, arg2, 32993, super.field3828.field6530, arg0, arg1);
        if (~arg3 != ~arg5) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }
}
