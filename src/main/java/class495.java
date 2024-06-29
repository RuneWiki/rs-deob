import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class495 extends class148 {

    @OriginalMember(owner = "client!ku", name = "z", descriptor = "I")
    private int field6895 = -1;

    @OriginalMember(owner = "client!ku", name = "N", descriptor = "I")
    private int field6908 = -1;

    @OriginalMember(owner = "client!ku", name = "J", descriptor = "I")
    public int field6904;

    @OriginalMember(owner = "client!ku", name = "H", descriptor = "I")
    public int field6902;

    @OriginalMember(owner = "client!ku", name = "F", descriptor = "Z")
    public static boolean field6900 = false;

    @OriginalMember(owner = "client!ku", name = "M", descriptor = "I")
    public static int field6907 = 0;

    @OriginalMember(owner = "client!ku", name = "y", descriptor = "I")
    public static int field6894;

    @OriginalMember(owner = "client!ku", name = "A", descriptor = "I")
    public static int field6896;

    @OriginalMember(owner = "client!ku", name = "B", descriptor = "I")
    public static int field6897;

    @OriginalMember(owner = "client!ku", name = "D", descriptor = "I")
    public static int field6898;

    @OriginalMember(owner = "client!ku", name = "E", descriptor = "I")
    public static int field6899;

    @OriginalMember(owner = "client!ku", name = "G", descriptor = "I")
    public static int field6901;

    @OriginalMember(owner = "client!ku", name = "I", descriptor = "I")
    public static int field6903;

    @OriginalMember(owner = "client!ku", name = "K", descriptor = "I")
    public static int field6905;

    @OriginalMember(owner = "client!ku", name = "L", descriptor = "I")
    public static int field6906;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IZZ)V")
    public final void method2776(int arg0, boolean arg1, boolean arg2) {
        if (super.field1907 == 3553) {
            super.field1926.method1884(this, -2);
            OpenGL.glTexParameteri(super.field1907, 10242, !arg1 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field1907, 10243, !arg2 ? 33071 : 10497);
        }
        ++field6899;
        if (arg0 > -22) {
            this.field6902 = 43;
        }
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Luq;IIII)V")
    public class495(class313 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field6904 = arg4;
        this.field6902 = arg3;
        super.field1926.method1884(this, -2);
        OpenGL.glTexImage2Dub(super.field1907, 0, super.field1916, arg3, arg4, 0, class642.method3707(19512, super.field1916), 5121, (byte[]) null, 0);
        this.method805(true, -119);
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)V")
    public final void method157(byte arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field6908, this.field6895, super.field1907, 0, 0);
        ++field6901;
        if (arg0 <= 97) {
            this.method2776(-73, false, true);
        }
        this.field6895 = -1;
        this.field6908 = -1;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IIIIIII)V")
    public final void method2777(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field6897;
        int var8 = -arg3 - arg6 + super.field1926.field4003;
        super.field1926.method1884(this, -2);
        OpenGL.glCopyTexSubImage2D(super.field1907, arg5, arg0, -arg2 - arg6 + this.field6904, arg4, var8, arg1, arg6);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IIIB)V")
    public final void method2778(int arg0, int arg1, int arg2, byte arg3) {
        OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.field1907, super.field1925, arg2);
        ++field6903;
        this.field6908 = arg1;
        this.field6895 = arg0;
        if (arg3 != 35) {
            this.field6904 = 111;
        }
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Luq;IIIII)V")
    public class495(class313 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field6904 = arg5;
        this.field6902 = arg4;
        int var7 = -arg3 + -arg5 + super.field1926.field4003;
        super.field1926.method1884(this, -2);
        OpenGL.glCopyTexImage2D(super.field1907, 0, super.field1916, arg2, var7, arg4, arg5, 0);
        this.method805(true, 113);
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IIC)C")
    public static final char method2779(int arg0, int arg1, char arg2) {
        if (arg1 != -250) {
            method2781(-80);
        }
        ++field6906;
        if (arg2 >= 192 && ~arg2 >= -256) {
            if (~arg2 <= -193 && arg2 <= 198) {
                return 'A';
            }
            if (arg2 == 199) {
                return 'C';
            }
            if (~arg2 <= -201 && ~arg2 >= -204) {
                return 'E';
            }
            if (arg2 >= 204 && ~arg2 >= -208) {
                return 'I';
            }
            if (~arg2 == -210 && ~arg0 != -1) {
                return 'N';
            }
            if (arg2 >= 210 && ~arg2 >= -215) {
                return 'O';
            }
            if (~arg2 <= -218 && ~arg2 >= -221) {
                return 'U';
            }
            if (~arg2 == -222) {
                return 'Y';
            }
            if (arg2 == 223) {
                return 's';
            }
            if (arg2 >= 224 && ~arg2 >= -231) {
                return 'a';
            }
            if (arg2 == 231) {
                return 'c';
            }
            if (~arg2 <= -233 && arg2 <= 235) {
                return 'e';
            }
            if (arg2 >= 236 && arg2 <= 239) {
                return 'i';
            }
            if (arg2 == 241 && ~arg0 != -1) {
                return 'n';
            }
            if (arg2 >= 242 && arg2 <= 246) {
                return 'o';
            }
            if (~arg2 <= -250 && ~arg2 >= -253) {
                return 'u';
            }
            if (~arg2 == -254 || ~arg2 == -256) {
                return 'y';
            }
        }
        if (arg2 == 338) {
            return 'O';
        } else if (arg2 == 339) {
            return 'o';
        } else if (~arg2 == -377) {
            return 'Y';
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(II[IIBZIII)V")
    public final void method2780(int arg0, int arg1, int[] arg2, int arg3, byte arg4, boolean arg5, int arg6, int arg7, int arg8) {
        if (~arg0 == -1) {
            arg0 = arg6;
        }
        if (arg4 <= 102) {
            this.field6895 = -85;
        }
        ++field6896;
        if (arg5) {
            int[] var10 = new int[arg6 * arg7];
            for (int var11 = 0; ~arg7 < ~var11; ++var11) {
                int var12 = arg6 * var11;
                int var13 = (-var11 + arg7 + -1) * arg0 + arg3;
                for (int var14 = 0; var14 < arg6; ++var14) {
                    var10[var12++] = arg2[var13++];
                }
            }
            arg2 = var10;
        }
        super.field1926.method1884(this, -2);
        if (~arg0 != ~arg6) {
            OpenGL.glPixelStorei(3314, arg0);
        }
        OpenGL.glTexSubImage2Di(super.field1907, 0, arg8, arg1, arg6, arg7, 32993, super.field1926.field4234, arg2, arg3);
        if (~arg0 != ~arg6) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "(I)V")
    public static final void method2781(int arg0) {
        ++field6894;
        class7 var1 = (class7) class644.field9336.method3188((byte) -100);
        boolean var2 = class15.field162 != null || ~class538.field7521 < -1;
        if (var2) {
            class396.field5469 = 1;
        }
        if (class592.field8560 && class634.field9227.method2004((byte) 99, 81) && class50.field673 > 2) {
            if (var2) {
                class228.field2928 = (class245) class57.field760.field7933.field1399.field1399;
            } else {
                class637.method3670(1, var1.method27(2), var1.method32(32679), (class245) class57.field760.field7933.field1399.field1399);
            }
        } else if (var2) {
            class228.field2928 = (class245) class57.field760.field7933.field1399;
        } else {
            class637.method3670(1, var1.method27(2), var1.method32(32679), (class245) class57.field760.field7933.field1399);
        }
        if (arg0 != 81) {
            method2779(107, 112, '#');
        }
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Luq;IIIIZ[IZ)V")
    public class495(class313 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field6902 = arg3;
        this.field6904 = arg4;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; arg4 > var10; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (arg4 - var10 + -1) * arg3;
                for (int var13 = 0; arg3 > var13; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field1926.method1884(this, -2);
        if (arg5 && super.field1907 != 34037) {
            class82.method463(32993, super.field1907, this.field6904, arg6, -32994, super.field1926.field4234, super.field1916, this.field6902);
            this.method809(true, 75);
        } else {
            OpenGL.glTexImage2Di(super.field1907, 0, super.field1916, this.field6902, this.field6904, 0, 32993, super.field1926.field4234, arg6, 0);
            this.method809(false, 125);
        }
        this.method805(true, 93);
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Luq;IIIIZ[BIZ)V")
    public class495(class313 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field6904 = arg4;
        this.field6902 = arg3;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; ~var11 > ~arg4; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (arg4 - 1 + -var11) * arg3;
                for (int var14 = 0; ~var14 > ~arg3; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field1926.method1884(this, -2);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && super.field1907 != 34037) {
            class330.method2077(arg7, arg6, 0, arg1, arg4, arg3, arg2);
            this.method809(true, 99);
        } else {
            OpenGL.glTexImage2Dub(super.field1907, 0, super.field1916, this.field6902, this.field6904, 0, arg7, 5121, arg6, 0);
            this.method809(false, 97);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method805(true, -85);
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Luq;IIIIZ[FI)V")
    public class495(class313 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field6904 = arg4;
        this.field6902 = arg3;
        super.field1926.method1884(this, -2);
        if (arg5 && super.field1907 != 34037) {
            class478.method2708(arg6, arg3, arg7, arg2, arg1, (byte) -35, arg4);
            this.method809(true, 117);
        } else {
            OpenGL.glTexImage2Df(super.field1907, 0, super.field1916, this.field6902, this.field6904, 0, arg7, 5126, arg6, 0);
            this.method809(false, 55);
        }
        this.method805(true, -79);
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(ZIB[BIIIIII)V")
    public final void method2782(boolean arg0, int arg1, byte arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field6905;
        if (~arg6 == -1) {
            arg6 = arg8;
        }
        if (arg0) {
            int var11 = class66.method382(1, arg7);
            int var12 = arg8 * var11;
            int var13 = arg6 * var11;
            byte[] var14 = new byte[arg1 * var12];
            for (int var15 = 0; var15 < arg1; ++var15) {
                int var16 = var12 * var15;
                int var17 = (arg1 - (var15 - -1)) * var13 + arg9;
                for (int var18 = 0; var12 > var18; ++var18) {
                    var14[var16++] = arg3[var17++];
                }
            }
            arg3 = var14;
        }
        super.field1926.method1884(this, -2);
        OpenGL.glPixelStorei(3317, 1);
        if (~arg6 != ~arg8) {
            OpenGL.glPixelStorei(3314, arg6);
        }
        OpenGL.glTexSubImage2Dub(super.field1907, 0, arg5, arg4, arg8, arg1, arg7, 5121, arg3, arg9);
        if (~arg6 != ~arg8) {
            OpenGL.glPixelStorei(3314, 0);
        }
        if (arg2 != -105) {
            this.field6902 = -25;
        }
        OpenGL.glPixelStorei(3317, 4);
    }
}
