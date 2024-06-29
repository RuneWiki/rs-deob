import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class504 extends class377 {

    @OriginalMember(owner = "client!wi", name = "z", descriptor = "I")
    private int field6920 = -1;

    @OriginalMember(owner = "client!wi", name = "H", descriptor = "I")
    private int field6928 = -1;

    @OriginalMember(owner = "client!wi", name = "F", descriptor = "I")
    public int field6926;

    @OriginalMember(owner = "client!wi", name = "G", descriptor = "I")
    public int field6927;

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "Lgca;")
    public static class705 field6917 = new class705();

    @OriginalMember(owner = "client!wi", name = "A", descriptor = "I")
    public static int field6921 = 0;

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "I")
    public static int field6916;

    @OriginalMember(owner = "client!wi", name = "y", descriptor = "I")
    public static int field6919;

    @OriginalMember(owner = "client!wi", name = "B", descriptor = "I")
    public static int field6922;

    @OriginalMember(owner = "client!wi", name = "C", descriptor = "I")
    public static int field6923;

    @OriginalMember(owner = "client!wi", name = "D", descriptor = "I")
    public static int field6924;

    @OriginalMember(owner = "client!wi", name = "E", descriptor = "I")
    public static int field6925;

    @OriginalMember(owner = "client!wi", name = "I", descriptor = "I")
    public static int field6929;

    @OriginalMember(owner = "client!wi", name = "J", descriptor = "I")
    public static int field6930;

    @OriginalMember(owner = "client!wi", name = "x", descriptor = "Luf;")
    public static class519 field6918;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BI)Z", line = 4)
    public static final boolean method2945(byte arg0, int arg1) {
        ++field6919;
        int var2 = 101 / ((arg0 - 57) / 45);
        return arg1 >= 12 && ~arg1 >= -18;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "([IIIIIZIIZ)V", line = 15)
    public final void method2946(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, boolean arg8) {
        if (~arg2 == -1) {
            arg2 = arg1;
        }
        ++field6924;
        if (arg8) {
            int[] var10 = new int[arg1 * arg6];
            for (int var11 = 0; arg6 > var11; ++var11) {
                int var12 = arg1 * var11;
                int var13 = (arg6 + -1 + -var11) * arg2 + arg7;
                for (int var14 = 0; ~var14 > ~arg1; ++var14) {
                    var10[var12++] = arg0[var13++];
                }
            }
            arg0 = var10;
        }
        super.field5288.method3384(this, (byte) 66);
        if (arg1 != arg2) {
            OpenGL.glPixelStorei(3314, arg2);
        }
        OpenGL.glTexSubImage2Di(super.field5298, 0, arg4, -arg6 + this.field6927 + -arg3, arg1, arg6, 32993, super.field5288.field8234, arg0, arg7);
        if (!arg5) {
            this.method2949(-82, -87, 126, -122, true, 100, -17);
        }
        if (~arg1 != ~arg2) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(I)V", line = 66)
    public static void method2947(int arg0) {
        field6917 = null;
        field6918 = null;
        if (arg0 != 22140) {
            field6918 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Llea;IIIIZ[FI)V", line = 77)
    public class504(class573 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field6926 = arg3;
        this.field6927 = arg4;
        super.field5288.method3384(this, (byte) 92);
        if (arg5 && super.field5298 != 34037) {
            class236.method1597(arg1, arg2, arg6, arg3, arg7, true, arg4);
            this.method2271((byte) 59, true);
        } else {
            OpenGL.glTexImage2Df(super.field5298, 0, super.field5289, this.field6926, this.field6927, 0, arg7, 5126, arg6, 0);
            this.method2271((byte) 59, false);
        }
        this.method2266(55, true);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V", line = 100)
    public final void method1359(int arg0) {
        ++field6922;
        OpenGL.glFramebufferTexture2DEXT(this.field6920, this.field6928, super.field5298, 0, 0);
        if (arg0 != 3314) {
            field6918 = null;
        }
        this.field6928 = -1;
        this.field6920 = -1;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZLha;II)Leg;", line = 113)
    public static final class406 method2948(boolean arg0, class475 arg1, int arg2, int arg3) {
        ++field6930;
        if (arg2 == arg3) {
            return null;
        } else {
            if (class40.field468 != null) {
                for (int var4 = 0; ~class40.field468.length < ~var4; ++var4) {
                    if (~class40.field468[var4] == ~arg2) {
                        return class208.field3039[var4];
                    }
                }
            }
            class406 var5 = (class406) class100.field1486.method2882((long) arg2, (byte) -40);
            if (var5 != null) {
                if (arg0 && var5.field5593 == null) {
                    class470 var6 = class478.method2833(arg3 + 89, class447.field6172, arg2);
                    if (var6 == null) {
                        return null;
                    }
                    var5.field5593 = var6;
                }
                return var5;
            } else {
                class418[] var7 = class418.method2474(class651.field9226, arg2);
                if (var7 == null) {
                    return null;
                } else {
                    class470 var8 = class478.method2833(59, class447.field6172, arg2);
                    if (var8 == null) {
                        return null;
                    } else {
                        class406 var9;
                        if (arg0) {
                            var9 = new class406(arg1.method491(var8, var7, true), var8);
                        } else {
                            var9 = new class406(arg1.method491(var8, var7, true));
                        }
                        class100.field1486.method2890(-7307, (long) arg2, var9);
                        return var9;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIZII)V", line = 180)
    public final void method2949(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        ++field6916;
        int var8 = -arg1 - arg5 + super.field5288.field8015;
        super.field5288.method3384(this, (byte) 104);
        OpenGL.glCopyTexSubImage2D(super.field5298, 0, arg6, -arg5 - arg3 + this.field6927, arg2, var8, arg0, arg5);
        if (!arg4) {
            OpenGL.glFlush();
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IBIZI[BIIII)V", line = 196)
    public final void method2950(int arg0, byte arg1, int arg2, boolean arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg7 == 0) {
            arg7 = arg9;
        }
        ++field6923;
        if (arg3) {
            int var11 = class752.method4155(arg2, (byte) -116);
            int var12 = arg9 * var11;
            int var13 = arg7 * var11;
            byte[] var14 = new byte[arg0 * var12];
            for (int var15 = 0; var15 < arg0; ++var15) {
                int var16 = var12 * var15;
                int var17 = (arg0 - (var15 + 1)) * var13 + arg4;
                for (int var18 = 0; ~var18 > ~var12; ++var18) {
                    var14[var16++] = arg5[var17++];
                }
            }
            arg5 = var14;
        }
        super.field5288.method3384(this, (byte) 126);
        OpenGL.glPixelStorei(3317, 1);
        if (arg1 >= 22) {
            if (arg7 != arg9) {
                OpenGL.glPixelStorei(3314, arg7);
            }
            OpenGL.glTexSubImage2Dub(super.field5298, 0, arg6, arg8, arg9, arg0, arg2, 5121, arg5, arg4);
            if (arg7 != arg9) {
                OpenGL.glPixelStorei(3314, 0);
            }
            OpenGL.glPixelStorei(3317, 4);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIII)V", line = 255)
    public final void method2951(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glFramebufferTexture2DEXT(arg0, arg2, super.field5298, super.field5284, arg3);
        ++field6925;
        this.field6928 = arg2;
        this.field6920 = arg0;
        if (arg1 != 3314) {
            this.field6927 = -15;
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Llea;IIIII)V", line = 272)
    public class504(class573 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field6926 = arg4;
        this.field6927 = arg5;
        int var7 = super.field5288.field8015 - arg5 - arg3;
        super.field5288.method3384(this, (byte) 119);
        OpenGL.glCopyTexImage2D(super.field5298, 0, super.field5289, arg2, var7, arg4, arg5, 0);
        this.method2266(50, true);
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Llea;IIIIZ[BIZ)V", line = 291)
    public class504(class573 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field6927 = arg4;
        this.field6926 = arg3;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; var11 < arg4; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (arg4 + -1 + -var11) * arg3;
                for (int var14 = 0; arg3 > var14; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field5288.method3384(this, (byte) 74);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && ~super.field5298 != -34038) {
            class560.method3261(arg3, arg7, arg2, -24523, arg6, arg4, arg1);
            this.method2271((byte) 59, true);
        } else {
            OpenGL.glTexImage2Dub(super.field5298, 0, super.field5289, this.field6926, this.field6927, 0, arg7, 5121, arg6, 0);
            this.method2271((byte) 59, false);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method2266(60, true);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZZZ)V", line = 343)
    public final void method2952(boolean arg0, boolean arg1, boolean arg2) {
        if (!arg2) {
            ++field6929;
            if (~super.field5298 == -3554) {
                super.field5288.method3384(this, (byte) 68);
                OpenGL.glTexParameteri(super.field5298, 10242, arg0 ? 10497 : 33071);
                OpenGL.glTexParameteri(super.field5298, 10243, !arg1 ? 33071 : 10497);
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Llea;IIII)V", line = 368)
    public class504(class573 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field6926 = arg3;
        this.field6927 = arg4;
        super.field5288.method3384(this, (byte) 56);
        OpenGL.glTexImage2Dub(super.field5298, 0, super.field5289, arg3, arg4, 0, class137.method1128(super.field5289, 76), 5121, (byte[]) null, 0);
        this.method2266(67, true);
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Llea;IIIIZ[IIIZ)V", line = 380)
    public class504(class573 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8, boolean arg9) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field6927 = arg4;
        this.field6926 = arg3;
        if (arg9) {
            int[] var11 = new int[arg6.length];
            for (int var12 = 0; ~arg4 < ~var12; ++var12) {
                int var13 = arg3 * var12;
                int var14 = (arg4 + -1 + -var12) * arg3;
                for (int var15 = 0; ~var15 > ~arg3; ++var15) {
                    var11[var13++] = arg6[var14++];
                }
            }
            arg6 = var11;
        }
        super.field5288.method3384(this, (byte) 117);
        if (~super.field5298 != -34038 && arg5 && arg7 == 0 && ~arg8 == -1) {
            class296.method1865(super.field5298, (byte) -29, this.field6926, this.field6927, super.field5288.field8234, 32993, super.field5289, arg6);
            this.method2271((byte) 59, true);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Di(super.field5298, 0, super.field5289, this.field6926, this.field6927, 0, 32993, super.field5288.field8234, arg6, arg8 * 4);
            OpenGL.glPixelStorei(3314, 0);
            this.method2271((byte) 59, false);
        }
        this.method2266(46, true);
    }
}
