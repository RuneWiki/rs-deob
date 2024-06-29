import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public class class615 extends class210 {

    @OriginalMember(owner = "client!mfa", name = "E", descriptor = "I")
    private int field8609 = -1;

    @OriginalMember(owner = "client!mfa", name = "N", descriptor = "I")
    private int field8618 = -1;

    @OriginalMember(owner = "client!mfa", name = "z", descriptor = "I")
    public int field8604;

    @OriginalMember(owner = "client!mfa", name = "F", descriptor = "I")
    public int field8610;

    @OriginalMember(owner = "client!mfa", name = "y", descriptor = "I")
    public static int field8603;

    @OriginalMember(owner = "client!mfa", name = "B", descriptor = "I")
    public static int field8606;

    @OriginalMember(owner = "client!mfa", name = "C", descriptor = "I")
    public static int field8607;

    @OriginalMember(owner = "client!mfa", name = "D", descriptor = "I")
    public static int field8608;

    @OriginalMember(owner = "client!mfa", name = "G", descriptor = "I")
    public static int field8611;

    @OriginalMember(owner = "client!mfa", name = "I", descriptor = "I")
    public static int field8613;

    @OriginalMember(owner = "client!mfa", name = "J", descriptor = "I")
    public static int field8614;

    @OriginalMember(owner = "client!mfa", name = "K", descriptor = "I")
    public static int field8615;

    @OriginalMember(owner = "client!mfa", name = "L", descriptor = "I")
    public static int field8616;

    @OriginalMember(owner = "client!mfa", name = "M", descriptor = "I")
    public static int field8617;

    @OriginalMember(owner = "client!mfa", name = "A", descriptor = "Lkr;")
    public static class744 field8605;

    @OriginalMember(owner = "client!mfa", name = "H", descriptor = "[[[I")
    public static int[][][] field8612;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IIII)V", line = 5)
    public final void method3439(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.field2781, super.field2762, arg3);
        ++field8607;
        this.field8618 = arg1;
        this.field8609 = arg0;
        if (arg2 != -1) {
            this.method3439(12, -106, -93, 21);
        }
    }

    @OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(Leea;IIII)V", line = 20)
    public class615(class131 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field8604 = arg3;
        this.field8610 = arg4;
        super.field2761.method926(this, 55);
        OpenGL.glTexImage2Dub(super.field2781, 0, super.field2776, arg3, arg4, 0, class240.method1529(true, super.field2776), 5121, (byte[]) null, 0);
        this.method1297(true, false);
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(II[IZIIIII)V", line = 32)
    public final void method3440(int arg0, int arg1, int[] arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field8606;
        if (arg1 == 0) {
            arg1 = arg4;
        }
        if (arg3) {
            int[] var10 = new int[arg4 * arg8];
            for (int var11 = 0; var11 < arg8; ++var11) {
                int var12 = arg4 * var11;
                int var13 = (-var11 + -1 + arg8) * arg1 + arg7;
                for (int var14 = 0; ~var14 > ~arg4; ++var14) {
                    var10[var12++] = arg2[var13++];
                }
            }
            arg2 = var10;
        }
        super.field2761.method926(this, 42);
        if (~arg1 != ~arg4) {
            OpenGL.glPixelStorei(3314, arg1);
        }
        if (arg6 > -39) {
            this.field8609 = 43;
        }
        OpenGL.glTexSubImage2Di(super.field2781, 0, arg5, arg0, arg4, arg8, 32993, super.field2761.field1849, arg2, arg7);
        if (arg1 != arg4) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Ljava/lang/String;IBZ)V", line = 86)
    public static final void method3441(String arg0, int arg1, byte arg2, boolean arg3) {
        ++field8616;
        class721.method4051(-19310);
        class305.method1999(-26159);
        class737.method4123(110);
        class383.method2429(arg1, (byte) -21, arg3, arg0);
        class182.method1152((byte) 38);
        class42.method278(255, class268.field3831);
        class84.method644(class268.field3831, (byte) 124);
        class705.method3965(class268.field3831, false, class374.field5245);
        if (arg2 >= -23) {
            method3441((String) null, -12, (byte) 26, false);
        }
        class299.method1944((byte) -126);
        class586.method3325(class716.field9948, -122);
        class350.method2257(-101);
        class43.method289((byte) -109);
        if (~class222.field2897 == -4) {
            class60.method514(false, 4);
        } else if (~class222.field2897 == -8) {
            class60.method514(false, 8);
        } else if (class222.field2897 == 10) {
            class60.method514(false, 11);
        } else {
            if (class222.field2897 == 1 || class222.field2897 == 2) {
                class655.method3603(0);
            }
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(ZIII)V", line = 124)
    public static final void method3442(boolean arg0, int arg1, int arg2, int arg3) {
        ++field8613;
        if (arg3 < 52) {
            field8605 = null;
        }
        if (arg1 >= 8000 && arg1 <= 48000) {
            class673.field9127 = arg0;
            class68.field831 = arg1;
            class155.field2172 = arg2;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(Leea;IIIII)V", line = 141)
    public class615(class131 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field8604 = arg4;
        this.field8610 = arg5;
        int var7 = super.field2761.field1658 - (arg3 + arg5);
        super.field2761.method926(this, 100);
        OpenGL.glCopyTexImage2D(super.field2781, 0, super.field2776, arg2, var7, arg4, arg5, 0);
        this.method1297(true, false);
    }

    @OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(Leea;IIIIZ[BIZ)V", line = 157)
    public class615(class131 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field8604 = arg3;
        this.field8610 = arg4;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; ~var11 > ~arg4; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (arg4 + -1 + -var11) * arg3;
                for (int var14 = 0; var14 < arg3; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field2761.method926(this, 100);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && super.field2781 != 34037) {
            class739.method4128(arg4, arg1, arg3, 79, arg2, arg7, arg6);
            this.method1288(10240, true);
        } else {
            OpenGL.glTexImage2Dub(super.field2781, 0, super.field2776, this.field8604, this.field8610, 0, arg7, 5121, arg6, 0);
            this.method1288(10240, false);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method1297(true, false);
    }

    @OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(Leea;IIIIZ[IIIZ)V", line = 228)
    public class615(class131 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8, boolean arg9) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field8610 = arg4;
        this.field8604 = arg3;
        if (arg9) {
            int[] var11 = new int[arg6.length];
            for (int var12 = 0; ~var12 > ~arg4; ++var12) {
                int var13 = arg3 * var12;
                int var14 = (-var12 + -1 + arg4) * arg3;
                for (int var15 = 0; ~arg3 < ~var15; ++var15) {
                    var11[var13++] = arg6[var14++];
                }
            }
            arg6 = var11;
        }
        super.field2761.method926(this, 91);
        if (super.field2781 != 34037 && arg5 && arg7 == 0 && ~arg8 == -1) {
            class180.method1137(super.field2781, (byte) -90, arg6, this.field8604, 32993, this.field8610, super.field2776, super.field2761.field1849);
            this.method1288(10240, true);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Di(super.field2781, 0, super.field2776, this.field8604, this.field8610, 0, 32993, super.field2761.field1849, arg6, arg8 * 4);
            OpenGL.glPixelStorei(3314, 0);
            this.method1288(10240, false);
        }
        this.method1297(true, false);
    }

    @OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(Leea;IIIIZ[FI)V", line = 294)
    public class615(class131 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field8610 = arg4;
        this.field8604 = arg3;
        super.field2761.method926(this, 125);
        if (arg5 && super.field2781 != 34037) {
            class68.method564(arg7, 114, arg3, arg6, arg1, arg2, arg4);
            this.method1288(10240, true);
        } else {
            OpenGL.glTexImage2Df(super.field2781, 0, super.field2776, this.field8604, this.field8610, 0, arg7, 5126, arg6, 0);
            this.method1288(10240, false);
        }
        this.method1297(true, false);
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(I)V", line = 215)
    public final void method1299(int arg0) {
        if (arg0 < -38) {
            ++field8603;
            OpenGL.glFramebufferTexture2DEXT(this.field8618, this.field8609, super.field2781, 0, 0);
            this.field8609 = -1;
            this.field8618 = -1;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "f", descriptor = "(I)V", line = 281)
    public static void method3443(int arg0) {
        field8605 = null;
        field8612 = null;
        if (arg0 != 14701) {
            field8612 = null;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IIIIIII)V", line = 316)
    public final void method3444(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field8615;
        int var8 = super.field2761.field1658 - (arg2 + arg5);
        super.field2761.method926(this, 51);
        OpenGL.glCopyTexSubImage2D(super.field2781, 0, arg4, -arg3 + -arg5 + this.field8610, arg1, var8, arg6, arg5);
        OpenGL.glFlush();
        if (arg0 != 28490) {
            this.method3439(-19, -113, 115, 44);
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(ZZI)V", line = 332)
    public final void method3445(boolean arg0, boolean arg1, int arg2) {
        if (arg2 >= 68) {
            if (super.field2781 == 3553) {
                super.field2761.method926(this, 93);
                OpenGL.glTexParameteri(super.field2781, 10242, !arg1 ? 33071 : 10497);
                OpenGL.glTexParameteri(super.field2781, 10243, !arg0 ? 33071 : 10497);
            }
            ++field8617;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IZIZI[BIIII)V", line = 352)
    public final void method3446(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 == 0) {
            arg2 = arg0;
        }
        ++field8611;
        if (arg1) {
            int var11 = class21.method133(arg4, true);
            int var12 = arg0 * var11;
            int var13 = arg2 * var11;
            byte[] var14 = new byte[arg7 * var12];
            for (int var15 = 0; arg7 > var15; ++var15) {
                int var16 = var12 * var15;
                int var17 = (-var15 + arg7 - 1) * var13 + arg8;
                for (int var18 = 0; var12 > var18; ++var18) {
                    var14[var16++] = arg5[var17++];
                }
            }
            arg5 = var14;
        }
        super.field2761.method926(this, 88);
        OpenGL.glPixelStorei(3317, 1);
        if (arg3) {
            field8612 = null;
        }
        if (~arg0 != ~arg2) {
            OpenGL.glPixelStorei(3314, arg2);
        }
        OpenGL.glTexSubImage2Dub(super.field2781, 0, arg9, arg6, arg0, arg7, arg4, 5121, arg5, arg8);
        if (~arg0 != ~arg2) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }
}
