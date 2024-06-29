import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class689 extends class517 {

    @OriginalMember(owner = "client!bca", name = "F", descriptor = "I")
    private int field9981 = -1;

    @OriginalMember(owner = "client!bca", name = "x", descriptor = "I")
    private int field9987 = -1;

    @OriginalMember(owner = "client!bca", name = "w", descriptor = "I")
    public int field9982;

    @OriginalMember(owner = "client!bca", name = "D", descriptor = "I")
    public int field9988;

    @OriginalMember(owner = "client!bca", name = "I", descriptor = "[Ljava/lang/String;")
    private static final String[] field9993 = new String[] { method5051(method5050("Pbq=\u0005\u001a")), method5051(method5050("\\t|\u007f")), method5051(method5050("Pbq=p[oygr\u001a")), method5051(method5050("I/>=1")), method5051(method5050("Pbq=\b\u001a")), method5051(method5050("Pbq=\n\u001a")), method5051(method5050("Pbq=\t\u001a")), method5051(method5050("Pbq=\u000b\u001a")), method5051(method5050("Pbq=\u0006\u001a")), method5051(method5050("Pbq=\u0004\u001a")) };

    @OriginalMember(owner = "client!bca", name = "z", descriptor = "[[Z")
    public static boolean[][] field9985 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!bca", name = "C", descriptor = "[J")
    public static long[] field9983 = new long[100];

    @OriginalMember(owner = "client!bca", name = "B", descriptor = "I")
    public static int field9984;

    @OriginalMember(owner = "client!bca", name = "H", descriptor = "I")
    public static int field9986;

    @OriginalMember(owner = "client!bca", name = "E", descriptor = "I")
    public static int field9989;

    @OriginalMember(owner = "client!bca", name = "G", descriptor = "I")
    public static int field9990;

    @OriginalMember(owner = "client!bca", name = "y", descriptor = "I")
    public static int field9991;

    @OriginalMember(owner = "client!bca", name = "A", descriptor = "I")
    public static int field9992;

    @OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(Lffa;IIIII)V", line = 3)
    public class689(class197 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        try {
            this.field9982 = arg4;
            this.field9988 = arg5;
            int var7 = -arg3 + -arg5 + super.field7474.field2687;
            super.field7474.method1733(this, 17237);
            OpenGL.glCopyTexImage2D(super.field7473, 0, super.field7464, arg2, var7, arg4, arg5, 0);
            this.method3923(25768, true);
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field9993[2] + (arg0 != null ? field9993[3] : field9993[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(I)V", line = 19)
    public final void method705(int arg0) {
        try {
            OpenGL.glFramebufferTexture2DEXT(this.field9981, this.field9987, super.field7473, 0, 0);
            ++field9990;
            this.field9987 = -1;
            if (arg0 > -115) {
                method5047(-91);
            }
            this.field9981 = -1;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9993[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(Lffa;IIII)V", line = 33)
    public class689(class197 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        try {
            this.field9982 = arg3;
            this.field9988 = arg4;
            super.field7474.method1733(this, 17237);
            OpenGL.glTexImage2Dub(super.field7473, 0, super.field7464, arg3, arg4, 0, class330.method2790(true, super.field7464), 5121, (byte[]) null, 0);
            this.method3923(25768, true);
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field9993[2] + (arg0 != null ? field9993[3] : field9993[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(IIIBIII)V", line = 46)
    public final void method5044(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        try {
            ++field9991;
            int var8 = -arg0 + -arg4 + super.field7474.field2687;
            super.field7474.method1733(this, 17237);
            OpenGL.glCopyTexSubImage2D(super.field7473, 0, arg1, this.field9988 - arg5 - arg4, arg6, var8, arg2, arg4);
            OpenGL.glFlush();
            if (arg3 != 0) {
                this.method5045(113, -31, 124, 95);
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field9993[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(IIII)V", line = 67)
    public final void method5045(int arg0, int arg1, int arg2, int arg3) {
        try {
            OpenGL.glFramebufferTexture2DEXT(arg2, arg1, super.field7473, super.field7463, arg3);
            ++field9992;
            if (arg0 != 5121) {
                this.method705(-14);
            }
            this.field9981 = arg2;
            this.field9987 = arg1;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field9993[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(Lffa;IIIIZ[FI)V", line = 84)
    public class689(class197 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        try {
            this.field9982 = arg3;
            this.field9988 = arg4;
            super.field7474.method1733(this, 17237);
            if (arg5 && ~super.field7473 != -34038) {
                class381.method3053(arg1, arg4, arg3, arg7, -2, arg6, arg2);
                this.method3929(-1, true);
            } else {
                OpenGL.glTexImage2Df(super.field7473, 0, super.field7464, this.field9982, this.field9988, 0, arg7, 5126, arg6, 0);
                this.method3929(-1, false);
            }
            this.method3923(25768, true);
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field9993[2] + (arg0 != null ? field9993[3] : field9993[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field9993[3] : field9993[1]) + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(Lffa;IIIIZ[BIZ)V", line = 131)
    public class689(class197 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        try {
            this.field9982 = arg3;
            this.field9988 = arg4;
            if (arg8) {
                byte[] var10 = new byte[arg6.length];
                for (int var11 = 0; arg4 > var11; ++var11) {
                    int var12 = arg3 * var11;
                    int var13 = (-var11 + -1 + arg4) * arg3;
                    for (int var14 = 0; var14 < arg3; ++var14) {
                        var10[var12++] = arg6[var13++];
                    }
                }
                arg6 = var10;
            }
            super.field7474.method1733(this, 17237);
            OpenGL.glPixelStorei(3317, 1);
            if (arg5 && super.field7473 != 34037) {
                class86.method727(arg7, (byte) 108, arg2, arg3, arg1, arg4, arg6);
                this.method3929(-1, true);
            } else {
                OpenGL.glTexImage2Dub(super.field7473, 0, super.field7464, this.field9982, this.field9988, 0, arg7, 5121, arg6, 0);
                this.method3929(-1, false);
            }
            OpenGL.glPixelStorei(3317, 4);
            this.method3923(25768, true);
        } catch (RuntimeException var16) {
            throw class759.method5498(var16, field9993[2] + (arg0 != null ? field9993[3] : field9993[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field9993[3] : field9993[1]) + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(Lffa;IIIIZ[IIIZ)V", line = 189)
    public class689(class197 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8, boolean arg9) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        try {
            this.field9982 = arg3;
            this.field9988 = arg4;
            if (arg9) {
                int[] var11 = new int[arg6.length];
                for (int var12 = 0; arg4 > var12; ++var12) {
                    int var13 = arg3 * var12;
                    int var14 = (arg4 + -1 - var12) * arg3;
                    for (int var15 = 0; var15 < arg3; ++var15) {
                        var11[var13++] = arg6[var14++];
                    }
                }
                arg6 = var11;
            }
            super.field7474.method1733(this, 17237);
            if (super.field7473 != 34037 && arg5 && arg7 == 0 && ~arg8 == -1) {
                class451.method3462(32993, super.field7464, this.field9988, 118, super.field7474.field2889, this.field9982, super.field7473, arg6);
                this.method3929(-1, true);
            } else {
                OpenGL.glPixelStorei(3314, arg7);
                OpenGL.glTexImage2Di(super.field7473, 0, super.field7464, this.field9982, this.field9988, 0, 32993, super.field7474.field2889, arg6, arg8 * 4);
                OpenGL.glPixelStorei(3314, 0);
                this.method3929(-1, false);
            }
            this.method3923(25768, true);
        } catch (RuntimeException var17) {
            throw class759.method5498(var17, field9993[2] + (arg0 != null ? field9993[3] : field9993[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field9993[3] : field9993[1]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(ZBZ)V", line = 114)
    public final void method5046(boolean arg0, byte arg1, boolean arg2) {
        try {
            ++field9989;
            if (super.field7473 == 3553) {
                super.field7474.method1733(this, 17237);
                OpenGL.glTexParameteri(super.field7473, 10242, !arg0 ? 33071 : 10497);
                OpenGL.glTexParameteri(super.field7473, 10243, arg2 ? 10497 : 33071);
            }
            if (arg1 >= -99) {
                this.field9988 = 31;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field9993[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!bca", name = "e", descriptor = "(I)V", line = 241)
    public static void method5047(int arg0) {
        try {
            field9985 = null;
            if (arg0 != -29971) {
                field9985 = null;
            }
            field9983 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9993[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(III[IIIZIZ)V", line = 252)
    public final void method5048(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        try {
            if (arg7 == 0) {
                arg7 = arg1;
            }
            ++field9984;
            if (arg8) {
                int[] var10 = new int[arg0 * arg1];
                for (int var11 = 0; var11 < arg0; ++var11) {
                    int var12 = arg1 * var11;
                    int var13 = (-var11 + arg0 + -1) * arg7 + arg5;
                    for (int var14 = 0; ~var14 > ~arg1; ++var14) {
                        var10[var12++] = arg3[var13++];
                    }
                }
                arg3 = var10;
            }
            super.field7474.method1733(this, 17237);
            if (arg1 != arg7) {
                OpenGL.glPixelStorei(3314, arg7);
            }
            OpenGL.glTexSubImage2Di(super.field7473, 0, arg2, this.field9988 - arg4 + -arg0, arg1, arg0, 32993, super.field7474.field2889, arg3, arg5);
            if (~arg1 != ~arg7) {
                OpenGL.glPixelStorei(3314, 0);
            }
            if (!arg6) {
                this.method5045(-105, 24, 121, 90);
            }
        } catch (RuntimeException var16) {
            throw class759.method5498(var16, field9993[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9993[3] : field9993[1]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "([BIZIIIIIII)V", line = 302)
    public final void method5049(byte[] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        try {
            if (~arg7 == -1) {
                arg7 = arg8;
            }
            if (arg5 > -64) {
                this.method5049((byte[]) null, 119, true, 24, 85, -6, -46, 102, 75, -127);
            }
            ++field9986;
            if (arg2) {
                int var11 = class673.method4947(arg1, true);
                int var12 = arg8 * var11;
                int var13 = arg7 * var11;
                byte[] var14 = new byte[arg4 * var12];
                for (int var15 = 0; ~arg4 < ~var15; ++var15) {
                    int var16 = var12 * var15;
                    int var17 = (arg4 - 1 + -var15) * var13 + arg9;
                    for (int var18 = 0; ~var12 < ~var18; ++var18) {
                        var14[var16++] = arg0[var17++];
                    }
                }
                arg0 = var14;
            }
            super.field7474.method1733(this, 17237);
            OpenGL.glPixelStorei(3317, 1);
            if (~arg7 != ~arg8) {
                OpenGL.glPixelStorei(3314, arg7);
            }
            OpenGL.glTexSubImage2Dub(super.field7473, 0, arg6, arg3, arg8, arg4, arg1, 5121, arg0, arg9);
            if (~arg7 != ~arg8) {
                OpenGL.glPixelStorei(3314, 0);
            }
            OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException var20) {
            throw class759.method5498(var20, field9993[7] + (arg0 != null ? field9993[3] : field9993[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!bca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5050(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 76);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5051(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 50;
                    break;
                case 1:
                    var10005 = 1;
                    break;
                case 2:
                    var10005 = 16;
                    break;
                case 3:
                    var10005 = 19;
                    break;
                default:
                    var10005 = 76;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
