import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hia")
public class class46 extends class304 implements class620 {

    @OriginalMember(owner = "client!hia", name = "J", descriptor = "I")
    private int field683;

    @OriginalMember(owner = "client!hia", name = "I", descriptor = "I")
    private int field682;

    @OriginalMember(owner = "client!hia", name = "A", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!hia", name = "B", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!hia", name = "C", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!hia", name = "D", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!hia", name = "E", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!hia", name = "F", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!hia", name = "G", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!hia", name = "H", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!hia", name = "K", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!hia", name = "M", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!hia", name = "L", descriptor = "[I")
    public static int[] field685;

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(IBIIII[I)V", line = 4)
    public final void method372(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        ++field686;
        int[] var8 = new int[this.field683 * this.field682];
        super.field3921.method3711(false, this);
        OpenGL.glGetTexImagei(super.field3911, 0, 32993, 5121, var8, 0);
        for (int var9 = 0; ~var9 > ~arg0; ++var9) {
            class617.method3391(var8, (arg2 + -1 + arg0 - var9) * this.field682, arg6, arg5 * var9 + arg3, arg5);
        }
        int var10 = 76 % ((-28 - arg1) / 56);
    }

    @OriginalMember(owner = "client!hia", name = "b", descriptor = "(I)I", line = 26)
    public final int method373(int arg0) {
        if (arg0 != -15836) {
            return -3;
        } else {
            ++field676;
            return this.field683;
        }
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(FZ)F", line = 38)
    public final float method374(float arg0, boolean arg1) {
        if (!arg1) {
            this.method376(0.42114928F, -13);
        }
        ++field677;
        return arg0;
    }

    @OriginalMember(owner = "client!hia", name = "<init>", descriptor = "(Lck;Lem;Lew;II)V", line = 54)
    public class46(class221 arg0, class610 arg1, class240 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field683 = arg4;
        this.field682 = arg3;
        super.field3921.method3711(false, this);
        OpenGL.glTexImage2Dub(super.field3911, 0, this.method1798(-51), arg3, arg4, 0, class436.method2578(6145, super.field3923), class496.method2883((byte) -60, super.field3926), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(B)Z", line = 65)
    public final boolean method375(byte arg0) {
        ++field684;
        if (arg0 != 35) {
            field685 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(FI)F", line = 76)
    public final float method376(float arg0, int arg1) {
        ++field681;
        return arg1 != -31566 ? 1.1705538F : arg0;
    }

    @OriginalMember(owner = "client!hia", name = "h", descriptor = "(I)I", line = 90)
    public static final int method377(int arg0) {
        if (arg0 <= 95) {
            field685 = null;
        }
        ++field675;
        return ~class709.field9973 == -2 ? class162.field2073 : class210.field2691;
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(I)I", line = 106)
    public final int method378(int arg0) {
        ++field679;
        return arg0 != 3631 ? -127 : this.field682;
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "([BIBIIILem;II)V", line = 117)
    public final void method379(byte[] arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, class610 arg6, int arg7, int arg8) {
        if (~arg8 == -1) {
            arg8 = arg1;
        }
        super.field3921.method3711(false, this);
        ++field680;
        OpenGL.glPixelStorei(3317, 1);
        if (arg1 != arg8) {
            OpenGL.glPixelStorei(3314, arg8);
        }
        OpenGL.glTexSubImage2Dub(super.field3911, 0, arg7, arg4, arg1, arg5, class436.method2578(6145, arg6), 5121, arg0, arg3);
        if (arg1 != arg8) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
        if (arg2 != -68) {
            this.method375((byte) -93);
        }
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(III[IIIII)V", line = 143)
    public final void method380(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field678;
        super.field3921.method3711(false, this);
        if (~arg7 == -1) {
            arg7 = arg0;
        }
        if (arg0 != arg7) {
            OpenGL.glPixelStorei(3314, arg7);
        }
        OpenGL.glTexSubImage2Di(super.field3911, 0, arg6, arg2, arg0, arg1, 32993, super.field3921.field2901, arg3, arg4);
        if (~arg0 != ~arg7) {
            OpenGL.glPixelStorei(3314, 0);
        }
        if (arg5 != -19156) {
            this.method375((byte) 102);
        }
    }

    @OriginalMember(owner = "client!hia", name = "<init>", descriptor = "(Lck;Lem;II[BII)V", line = 170)
    public class46(class221 arg0, class610 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class240.field3093, arg2 * arg3, false);
        this.field683 = arg3;
        this.field682 = arg2;
        super.field3921.method3711(false, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field3911, 0, this.method1798(-43), arg2, arg3, 0, class436.method2578(6145, super.field3923), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!hia", name = "<init>", descriptor = "(Lck;Lem;II[FII)V", line = 187)
    public class46(class221 arg0, class610 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class240.field3097, arg2 * arg3, false);
        this.field682 = arg2;
        this.field683 = arg3;
        super.field3921.method3711(false, this);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field3911, 0, this.method1798(-86), arg2, arg3, 0, class436.method2578(6145, super.field3923), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(ZIZ)V", line = 200)
    public final void method381(boolean arg0, int arg1, boolean arg2) {
        if (arg1 != -13021) {
            this.field682 = 99;
        }
        ++field674;
    }

    @OriginalMember(owner = "client!hia", name = "<init>", descriptor = "(Lck;II[III)V", line = 210)
    public class46(class221 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class440.field6178, class240.field3093, arg1 * arg2, false);
        this.field683 = arg2;
        this.field682 = arg1;
        super.field3921.method3711(false, this);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field3911, 0, 6408, this.field682, this.field683, 0, 32993, super.field3921.field2901, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!hia", name = "i", descriptor = "(I)V", line = 223)
    public static void method382(int arg0) {
        if (arg0 == 3314) {
            field685 = null;
        }
    }
}
