import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class210 extends class541 {

    @OriginalMember(owner = "client!ot", name = "F", descriptor = "I")
    private int field3107 = -1;

    @OriginalMember(owner = "client!ot", name = "K", descriptor = "I")
    private int field3112 = -1;

    @OriginalMember(owner = "client!ot", name = "x", descriptor = "I")
    public int field3099;

    @OriginalMember(owner = "client!ot", name = "y", descriptor = "I")
    public int field3100;

    @OriginalMember(owner = "client!ot", name = "D", descriptor = "I")
    public static int field3105 = 0;

    @OriginalMember(owner = "client!ot", name = "B", descriptor = "F")
    public static float field3103;

    @OriginalMember(owner = "client!ot", name = "w", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!ot", name = "z", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!ot", name = "A", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!ot", name = "C", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!ot", name = "G", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!ot", name = "H", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!ot", name = "I", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!ot", name = "J", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!ot", name = "E", descriptor = "Lts;")
    public static class53 field3106;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "([BI)[B")
    public static final byte[] method1358(byte[] arg0, int arg1) {
        if (arg1 >= -73) {
            method1365(false, 110);
        }
        ++field3109;
        class428 var2 = new class428(arg0);
        int var3 = var2.method2561((byte) 107);
        int var4 = var2.method2589(-11179);
        if (~var4 <= -1 && (~class346.field5040 == -1 || var4 <= class346.field5040)) {
            if (var3 == 0) {
                byte[] var8 = new byte[var4];
                var2.method2575(28637, var4, var8, 0);
                return var8;
            } else {
                int var5 = var2.method2589(-11179);
                if (~var5 > -1 || class346.field5040 != 0 && var5 > class346.field5040) {
                    throw new RuntimeException();
                } else {
                    byte[] var6 = new byte[var5];
                    if (var3 != 1) {
                        class603 var7 = class491.field7426;
                        synchronized (class491.field7426) {
                            class491.field7426.method3509((byte) 96, var2, var6);
                        }
                    } else {
                        class363.method2226(var6, var5, arg0, var4, 9);
                    }
                    return var6;
                }
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IZZ)V")
    public final void method1359(int arg0, boolean arg1, boolean arg2) {
        ++field3098;
        if (arg0 == 10497) {
            if (~super.field8096 == -3554) {
                super.field8091.method2811(this, -2);
                OpenGL.glTexParameteri(super.field8096, 10242, arg2 ? 10497 : 33071);
                OpenGL.glTexParameteri(super.field8096, 10243, arg1 ? 10497 : 33071);
            }
        }
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Los;IIIII)V")
    public class210(class468 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field3099 = arg5;
        this.field3100 = arg4;
        int var7 = -arg3 + super.field8091.field6936 + -arg5;
        super.field8091.method2811(this, -2);
        OpenGL.glCopyTexImage2D(super.field8096, 0, super.field8095, arg2, var7, arg4, arg5, 0);
        this.method3174(true, -17759);
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIIIII)V")
    public final void method1360(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3101;
        int var8 = -arg5 + super.field8091.field6936 + -arg2;
        super.field8091.method2811(this, arg1 + -2);
        OpenGL.glCopyTexSubImage2D(super.field8096, arg1, arg4, -arg0 + this.field3099 + -arg2, arg6, var8, arg3, arg2);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIII)V")
    public final void method1361(int arg0, int arg1, int arg2, int arg3) {
        ++field3110;
        OpenGL.glFramebufferTexture2DEXT(arg0, arg3, super.field8096, super.field8088, arg1);
        this.field3112 = arg0;
        this.field3107 = arg3;
        if (arg2 != 24456) {
            method1364((byte) 53);
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(III[IZIIII)V")
    public final void method1362(int arg0, int arg1, int arg2, int[] arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg5 >= -58) {
            this.field3107 = -62;
        }
        ++field3104;
        if (~arg7 == -1) {
            arg7 = arg2;
        }
        if (arg4) {
            int[] var10 = new int[arg2 * arg8];
            for (int var11 = 0; arg8 > var11; ++var11) {
                int var12 = arg2 * var11;
                int var13 = (-var11 + arg8 + -1) * arg7 + arg6;
                for (int var14 = 0; arg2 > var14; ++var14) {
                    var10[var12++] = arg3[var13++];
                }
            }
            arg3 = var10;
        }
        super.field8091.method2811(this, -2);
        if (~arg2 != ~arg7) {
            OpenGL.glPixelStorei(3314, arg7);
        }
        OpenGL.glTexSubImage2Di(super.field8096, 0, arg1, arg0, arg2, arg8, 32993, super.field8091.field7019, arg3, arg6);
        if (arg2 != arg7) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(B)V")
    public final void method1363(byte arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field3112, this.field3107, super.field8096, 0, 0);
        ++field3111;
        if (arg0 == -19) {
            this.field3112 = -1;
            this.field3107 = -1;
        }
    }

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "(B)V")
    public static void method1364(byte arg0) {
        field3106 = null;
        if (arg0 != -15) {
            method1364((byte) 107);
        }
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(ZI)Llb;")
    public static final class239 method1365(boolean arg0, int arg1) {
        ++field3108;
        class126[] var2 = class184.field2797;
        synchronized (class184.field2797) {
            if (arg0) {
                return null;
            } else {
                class239 var4;
                if (~class184.field2797.length < ~arg1 && !class184.field2797[arg1].method768((byte) -36)) {
                    var4 = (class239) class184.field2797[arg1].method777(112);
                    var4.method736((byte) -128);
                    int var10002 = class435.field6376[arg1]--;
                } else {
                    var4 = new class239();
                    var4.field3503 = new class525[arg1];
                    for (int var5 = 0; ~arg1 < ~var5; ++var5) {
                        var4.field3503[var5] = new class525();
                    }
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Los;IIIIZ[BIZ)V")
    public class210(class468 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3100 = arg3;
        this.field3099 = arg4;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; arg4 > var11; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (-var11 - 1 + arg4) * arg3;
                for (int var14 = 0; arg3 > var14; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field8091.method2811(this, -2);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && ~super.field8096 != -34038) {
            class83.method486(arg6, arg3, arg4, arg2, arg1, arg7, 28007);
            this.method3181(true, (byte) 86);
        } else {
            OpenGL.glTexImage2Dub(super.field8096, 0, super.field8095, this.field3100, this.field3099, 0, arg7, 5121, arg6, 0);
            this.method3181(false, (byte) -86);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method3174(true, -17759);
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Los;IIIIZ[FI)V")
    public class210(class468 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3099 = arg4;
        this.field3100 = arg3;
        super.field8091.method2811(this, -2);
        if (arg5 && super.field8096 != 34037) {
            class636.method3687(arg2, arg3, arg6, arg7, arg4, true, arg1);
            this.method3181(true, (byte) 89);
        } else {
            OpenGL.glTexImage2Df(super.field8096, 0, super.field8095, this.field3100, this.field3099, 0, arg7, 5126, arg6, 0);
            this.method3181(false, (byte) 88);
        }
        this.method3174(true, -17759);
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Los;IIII)V")
    public class210(class468 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field3100 = arg3;
        this.field3099 = arg4;
        super.field8091.method2811(this, -2);
        OpenGL.glTexImage2Dub(super.field8096, 0, super.field8095, arg3, arg4, 0, class128.method802(super.field8095, 1), 5121, (byte[]) null, 0);
        this.method3174(true, -17759);
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIZ[BIZIIII)V")
    public final void method1366(int arg0, int arg1, boolean arg2, byte[] arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field3102;
        if (~arg4 == -1) {
            arg4 = arg1;
        }
        if (arg2) {
            int var11 = class425.method2513((byte) -91, arg6);
            int var12 = arg1 * var11;
            int var13 = arg4 * var11;
            byte[] var14 = new byte[arg7 * var12];
            for (int var15 = 0; ~var15 > ~arg7; ++var15) {
                int var16 = var12 * var15;
                int var17 = (-var15 + arg7 - 1) * var13 + arg0;
                for (int var18 = 0; var18 < var12; ++var18) {
                    var14[var16++] = arg3[var17++];
                }
            }
            arg3 = var14;
        }
        super.field8091.method2811(this, -2);
        if (!arg5) {
            this.method1360(56, -8, 33, -42, 57, -60, -66);
        }
        OpenGL.glPixelStorei(3317, 1);
        if (arg1 != arg4) {
            OpenGL.glPixelStorei(3314, arg4);
        }
        OpenGL.glTexSubImage2Dub(super.field8096, 0, arg9, arg8, arg1, arg7, arg6, 5121, arg3, arg0);
        if (arg1 != arg4) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Los;IIIIZ[IZ)V")
    public class210(class468 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3100 = arg3;
        this.field3099 = arg4;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; arg4 > var10; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (arg4 - 1 + -var10) * arg3;
                for (int var13 = 0; ~var13 > ~arg3; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field8091.method2811(this, -2);
        if (arg5 && ~super.field8096 != -34038) {
            class336.method2096(super.field8095, super.field8096, this.field3100, this.field3099, super.field8091.field7019, 32993, 477614584, arg6);
            this.method3181(true, (byte) 117);
        } else {
            OpenGL.glTexImage2Di(super.field8096, 0, super.field8095, this.field3100, this.field3099, 0, 32993, super.field8091.field7019, arg6, 0);
            this.method3181(false, (byte) 85);
        }
        this.method3174(true, -17759);
    }
}
