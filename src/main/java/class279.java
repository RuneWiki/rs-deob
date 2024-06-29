import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class279 extends class304 implements class620 {

    @OriginalMember(owner = "client!ou", name = "P", descriptor = "I")
    private int field3545;

    @OriginalMember(owner = "client!ou", name = "G", descriptor = "I")
    private int field3536;

    @OriginalMember(owner = "client!ou", name = "N", descriptor = "[I")
    public static int[] field3543 = new int[8];

    @OriginalMember(owner = "client!ou", name = "A", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!ou", name = "B", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!ou", name = "C", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!ou", name = "D", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!ou", name = "E", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!ou", name = "F", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!ou", name = "H", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!ou", name = "I", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!ou", name = "J", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!ou", name = "K", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!ou", name = "L", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!ou", name = "M", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!ou", name = "O", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!ou", name = "Q", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(FZ)F")
    public final float method374(float arg0, boolean arg1) {
        if (!arg1) {
            return 1.3170503F;
        } else {
            ++field3538;
            return arg0 / (float) this.field3545;
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Llea;III)V")
    public static final void method1668(class546 arg0, int arg1, int arg2, int arg3) {
        ++field3540;
        int[] var4 = new int[4];
        class617.method3388(var4, 0, var4.length, arg2);
        if (arg3 != 1) {
            method1669((byte) -69, 125);
        }
        class177.method1086(2, var4, arg0, arg1);
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(ZIZ)V")
    public final void method381(boolean arg0, int arg1, boolean arg2) {
        ++field3542;
        super.field3921.method3711(false, this);
        OpenGL.glTexParameteri(super.field3911, 10242, arg0 ? 10497 : 33071);
        OpenGL.glTexParameteri(super.field3911, 10243, !arg2 ? 33071 : 10497);
        if (arg1 != -13021) {
            method1670(45, (class600) null, 124);
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(BI)V")
    public static final void method1669(byte arg0, int arg1) {
        ++field3533;
        if (class666.method3606(31, arg1)) {
            class460[] var2 = class323.field4125[arg1];
            for (int var3 = 0; ~var2.length < ~var3; ++var3) {
                class460 var5 = var2[var3];
                if (var5 != null) {
                    var5.field6622 = 1;
                    var5.field6498 = 0;
                    var5.field6564 = 0;
                }
            }
            int var4 = -73 % ((arg0 - -20) / 50);
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(FI)F")
    public final float method376(float arg0, int arg1) {
        if (arg1 != -31566) {
            method1669((byte) -127, -19);
        }
        ++field3534;
        return arg0 / (float) this.field3536;
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lck;Lem;IIZ[BII)V")
    public class279(class221 arg0, class610 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class240.field3093, arg2 * arg3, arg4);
        this.field3545 = arg3;
        this.field3536 = arg2;
        super.field3921.method3711(false, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && ~arg7 == -1 && arg6 == 0) {
            this.method1792(arg5, 56, super.field3911, arg3, arg2);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field3911, 0, this.method1798(-109), arg2, arg3, 0, class436.method2578(6145, super.field3923), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(ILfba;I)Z")
    public static final boolean method1670(int arg0, class600 arg1, int arg2) {
        class716.field10107.method1971(arg1.field8337[arg0], arg1.field8342[arg0], arg1.field8336[arg0], class63.field850);
        ++field3544;
        int var3 = class63.field850[2];
        if (var3 < 50) {
            return false;
        } else {
            arg1.field8343[arg0] = (short) (class63.field850[0] * class458.field6401 / var3 + class302.field3889);
            if (arg2 != -25367) {
                method1673(-58);
            }
            arg1.field8345[arg0] = (short) (class63.field850[1] * class127.field1538 / var3 + class225.field2974);
            arg1.field8338[arg0] = (short) var3;
            return true;
        }
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lck;IIZ[III)V")
    public class279(class221 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class440.field6178, class240.field3093, arg1 * arg2, arg3);
        this.field3536 = arg1;
        this.field3545 = arg2;
        super.field3921.method3711(false, this);
        if (arg3 && arg6 == 0 && ~arg5 == -1) {
            this.method1785(arg4, arg2, arg1, 1, super.field3911);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field3911, 0, 6408, this.field3536, this.field3545, 0, 32993, super.field3921.field2901, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)Z")
    public final boolean method375(byte arg0) {
        if (arg0 != 35) {
            this.method375((byte) 73);
        }
        ++field3537;
        return true;
    }

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "(B)V")
    public static final void method1671(byte arg0) {
        ++field3532;
        class4.field33.method3114(true);
        if (arg0 != -43) {
            method1673(-23);
        }
        class756.field10532 = 0;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIIIBLem;II[F)V")
    public final void method1672(int arg0, int arg1, int arg2, int arg3, byte arg4, class610 arg5, int arg6, int arg7, float[] arg8) {
        ++field3531;
        if (arg4 != 48) {
            method1669((byte) -62, 78);
        }
        super.field3921.method3711(false, this);
        OpenGL.glPixelStorei(3314, arg2);
        OpenGL.glTexSubImage2Df(super.field3911, 0, arg3, arg6, arg1, arg7, class436.method2578(6145, arg5), 5121, arg8, arg0);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(III[IIIII)V")
    public final void method380(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg5 != -19156) {
            this.method379((byte[]) null, -81, (byte) -59, -50, -95, 83, (class610) null, 110, -42);
        }
        super.field3921.method3711(false, this);
        ++field3546;
        OpenGL.glPixelStorei(3314, arg7);
        OpenGL.glTexSubImage2Di(super.field3911, 0, arg6, arg2, arg0, arg1, 32993, super.field3921.field2901, arg3, arg4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lck;Lem;IIZ[FII)V")
    public class279(class221 arg0, class610 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class240.field3097, arg2 * arg3, arg4);
        this.field3545 = arg3;
        this.field3536 = arg2;
        super.field3921.method3711(false, this);
        if (!arg4 && ~arg7 == -1 && ~arg6 == -1) {
            this.method1795(arg2, arg5, arg3, -379199231, super.field3911);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field3911, 0, this.method1798(-71), arg2, arg3, 0, class436.method2578(6145, super.field3923), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lck;Lem;Lew;II)V")
    public class279(class221 arg0, class610 arg1, class240 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field3536 = arg3;
        this.field3545 = arg4;
        super.field3921.method3711(false, this);
        OpenGL.glTexImage2Dub(super.field3911, 0, this.method1798(-65), arg3, arg4, 0, class436.method2578(6145, super.field3923), class496.method2883((byte) -58, super.field3926), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!ou", name = "h", descriptor = "(I)V")
    public static void method1673(int arg0) {
        field3543 = null;
        if (arg0 != -29280) {
            field3543 = null;
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IBIIII[I)V")
    public final void method372(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        ++field3541;
        int[] var8 = new int[this.field3545 * this.field3536];
        super.field3921.method3711(false, this);
        OpenGL.glGetTexImagei(super.field3911, 0, 32993, 5121, var8, 0);
        int var9 = -112 / ((-28 - arg1) / 56);
        for (int var10 = 0; var10 < arg0; ++var10) {
            class617.method3391(var8, (arg2 - var10 + arg0 + -1) * this.field3536, arg6, arg5 * var10 + arg3, arg5);
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)I")
    public final int method378(int arg0) {
        if (arg0 != 3631) {
            method1669((byte) -54, 36);
        }
        ++field3539;
        return this.field3536;
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)I")
    public final int method373(int arg0) {
        ++field3535;
        return arg0 != -15836 ? -25 : this.field3545;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "([BIBIIILem;II)V")
    public final void method379(byte[] arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, class610 arg6, int arg7, int arg8) {
        if (arg2 == -68) {
            super.field3921.method3711(false, this);
            ++field3530;
            OpenGL.glPixelStorei(3317, 1);
            OpenGL.glPixelStorei(3314, arg8);
            OpenGL.glTexSubImage2Dub(super.field3911, 0, arg7, arg4, arg1, arg5, class436.method2578(6145, arg6), 5121, arg0, arg3);
            OpenGL.glPixelStorei(3314, 0);
            OpenGL.glPixelStorei(3317, 4);
        }
    }
}
