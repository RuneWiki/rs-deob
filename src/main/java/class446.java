import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class446 extends class412 {

    @OriginalMember(owner = "client!kp", name = "A", descriptor = "I")
    private int field6129 = -1;

    @OriginalMember(owner = "client!kp", name = "z", descriptor = "I")
    private int field6128 = -1;

    @OriginalMember(owner = "client!kp", name = "w", descriptor = "I")
    public int field6125;

    @OriginalMember(owner = "client!kp", name = "B", descriptor = "I")
    public int field6130;

    @OriginalMember(owner = "client!kp", name = "F", descriptor = "[I")
    public static int[] field6134 = new int[32];

    @OriginalMember(owner = "client!kp", name = "x", descriptor = "I")
    public static int field6126;

    @OriginalMember(owner = "client!kp", name = "y", descriptor = "I")
    public static int field6127;

    @OriginalMember(owner = "client!kp", name = "C", descriptor = "I")
    public static int field6131;

    @OriginalMember(owner = "client!kp", name = "D", descriptor = "I")
    public static int field6132;

    @OriginalMember(owner = "client!kp", name = "E", descriptor = "I")
    public static int field6133;

    @OriginalMember(owner = "client!kp", name = "G", descriptor = "I")
    public static int field6135;

    @OriginalMember(owner = "client!kp", name = "H", descriptor = "I")
    public static int field6136;

    @OriginalMember(owner = "client!kp", name = "I", descriptor = "I")
    public static int field6137;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field6134[var1] = var0 + -1;
            var0 += var0;
        }
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lap;IIIIZ[IZ)V", line = 4)
    public class446(class435 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field6125 = arg4;
        this.field6130 = arg3;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; ~var10 > ~arg4; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (-var10 + -1 + arg4) * arg3;
                for (int var13 = 0; var13 < arg3; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field5478.method2388((byte) 87, this);
        if (arg5 && super.field5464 != 34037) {
            class484.method2813(super.field5470, arg6, this.field6125, this.field6130, super.field5478.field6036, (byte) -81, super.field5464, 32993);
            this.method2232((byte) -3, true);
        } else {
            OpenGL.glTexImage2Di(super.field5464, 0, super.field5470, this.field6130, this.field6125, 0, 32993, super.field5478.field6036, arg6, 0);
            this.method2232((byte) -3, false);
        }
        this.method2233((byte) -99, true);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZZI)V", line = 55)
    public final void method2467(boolean arg0, boolean arg1, int arg2) {
        ++field6132;
        if (~super.field5464 == -3554) {
            super.field5478.method2388((byte) 102, this);
            OpenGL.glTexParameteri(super.field5464, 10242, arg1 ? 10497 : 33071);
            OpenGL.glTexParameteri(super.field5464, 10243, arg0 ? 10497 : 33071);
        }
        if (arg2 < 7) {
            this.method2470(37, 33, 40, -109, 76, -38, false);
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIII)V", line = 76)
    public final void method2468(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glFramebufferTexture2DEXT(arg2, arg3, super.field5464, super.field5466, arg1);
        ++field6137;
        if (arg0 != 27783) {
            this.method2472(23, (int[]) null, -91, 54, -71, -78, true, -26, 87);
        }
        this.field6128 = arg2;
        this.field6129 = arg3;
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lap;IIIII)V", line = 94)
    public class446(class435 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field6125 = arg5;
        this.field6130 = arg4;
        int var7 = -arg5 - (arg3 - super.field5478.field5907);
        super.field5478.method2388((byte) 104, this);
        OpenGL.glCopyTexImage2D(super.field5464, 0, super.field5470, arg2, var7, arg4, arg5, 0);
        this.method2233((byte) -99, true);
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lap;IIII)V", line = 121)
    public class446(class435 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field6125 = arg4;
        this.field6130 = arg3;
        super.field5478.method2388((byte) -93, this);
        OpenGL.glTexImage2Dub(super.field5464, 0, super.field5470, arg3, arg4, 0, class282.method1611(-99, super.field5470), 5121, (byte[]) null, 0);
        this.method2233((byte) -99, true);
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lap;IIIIZ[FI)V", line = 135)
    public class446(class435 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field6130 = arg3;
        this.field6125 = arg4;
        super.field5478.method2388((byte) 91, this);
        if (arg5 && super.field5464 != 34037) {
            class212.method1271(arg2, -39, arg6, arg4, arg1, arg3, arg7);
            this.method2232((byte) -3, true);
        } else {
            OpenGL.glTexImage2Df(super.field5464, 0, super.field5470, this.field6130, this.field6125, 0, arg7, 5126, arg6, 0);
            this.method2232((byte) -3, false);
        }
        this.method2233((byte) -99, true);
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lap;IIIIZ[BIZ)V", line = 291)
    public class446(class435 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field6125 = arg4;
        this.field6130 = arg3;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; ~var11 > ~arg4; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (arg4 - (var11 - -1)) * arg3;
                for (int var14 = 0; ~arg3 < ~var14; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field5478.method2388((byte) 79, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && super.field5464 != 34037) {
            class376.method2067(arg3, arg1, arg7, arg4, arg6, arg2, 1);
            this.method2232((byte) -3, true);
        } else {
            OpenGL.glTexImage2Dub(super.field5464, 0, super.field5470, this.field6130, this.field6125, 0, arg7, 5121, arg6, 0);
            this.method2232((byte) -3, false);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method2233((byte) -99, true);
    }

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "(I)V", line = 108)
    public static void method2469(int arg0) {
        if (arg0 == 1) {
            field6134 = null;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIIIIZ)V", line = 159)
    public final void method2470(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (!arg6) {
            ++field6127;
            int var8 = -arg2 - arg0 + super.field5478.field5907;
            super.field5478.method2388((byte) -101, this);
            OpenGL.glCopyTexSubImage2D(super.field5464, 0, arg1, -arg3 + this.field6125 - arg2, arg5, var8, arg4, arg2);
            OpenGL.glFlush();
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "([BIIIIIIZII)V", line = 175)
    public final void method2471(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        ++field6133;
        if (arg5 == 0) {
            arg5 = arg8;
        }
        if (arg7) {
            int var11 = class488.method2824(arg9, 10807);
            int var12 = arg8 * var11;
            int var13 = arg5 * var11;
            byte[] var14 = new byte[arg6 * var12];
            for (int var15 = 0; var15 < arg6; ++var15) {
                int var16 = var12 * var15;
                int var17 = (-var15 + -1 + arg6) * var13 - -arg4;
                for (int var18 = 0; var12 > var18; ++var18) {
                    var14[var16++] = arg0[var17++];
                }
            }
            arg0 = var14;
        }
        super.field5478.method2388((byte) 114, this);
        if (arg1 > 4) {
            OpenGL.glPixelStorei(3317, 1);
            if (arg5 != arg8) {
                OpenGL.glPixelStorei(3314, arg5);
            }
            OpenGL.glTexSubImage2Dub(super.field5464, 0, arg3, arg2, arg8, arg6, arg9, 5121, arg0, arg4);
            if (~arg5 != ~arg8) {
                OpenGL.glPixelStorei(3314, 0);
            }
            OpenGL.glPixelStorei(3317, 4);
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I[IIIIIZII)V", line = 237)
    public final void method2472(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        if (arg2 == 0) {
            arg2 = arg4;
        }
        ++field6135;
        if (arg6) {
            int[] var10 = new int[arg4 * arg8];
            for (int var11 = 0; ~var11 > ~arg8; ++var11) {
                int var12 = arg4 * var11;
                int var13 = (-var11 + arg8 + -1) * arg2 + arg3;
                for (int var14 = 0; var14 < arg4; ++var14) {
                    var10[var12++] = arg1[var13++];
                }
            }
            arg1 = var10;
        }
        super.field5478.method2388((byte) -58, this);
        if (arg2 != arg4) {
            OpenGL.glPixelStorei(3314, arg2);
        }
        OpenGL.glTexSubImage2Di(super.field5464, 0, arg0, arg7, arg4, arg8, 32993, super.field5478.field6036, arg1, arg3);
        if (arg5 < 125) {
            this.method2468(-37, 40, 110, -7);
        }
        if (~arg2 != ~arg4) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 343)
    public static final void method2473(String arg0, byte arg1) {
        ++field6131;
        if (class535.field7652 == null) {
            class273.method1561(2);
        }
        String[] var2 = class107.method674(arg0, 1, '\n');
        if (arg1 < 90) {
            field6134 = null;
        }
        for (int var3 = 0; var2.length > var3; ++var3) {
            for (int var4 = class37.field413; var4 > 0; --var4) {
                class535.field7652[var4] = class535.field7652[var4 + -1];
            }
            class535.field7652[0] = var2[var3];
            if (~class37.field413 > ~(class535.field7652.length + -1)) {
                if (class154.field1735 > 0) {
                    ++class154.field1735;
                }
                ++class37.field413;
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)V", line = 388)
    public final void method260(byte arg0) {
        int var2 = 86 / (arg0 / 38);
        ++field6126;
        OpenGL.glFramebufferTexture2DEXT(this.field6128, this.field6129, super.field5464, 0, 0);
        this.field6129 = -1;
        this.field6128 = -1;
    }
}
