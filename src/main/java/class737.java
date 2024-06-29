import jaggl.OpenGL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sia")
public class class737 extends class460 {

    @OriginalMember(owner = "client!sia", name = "x", descriptor = "I")
    private int field10186 = -1;

    @OriginalMember(owner = "client!sia", name = "B", descriptor = "I")
    private int field10190 = -1;

    @OriginalMember(owner = "client!sia", name = "C", descriptor = "I")
    public int field10191;

    @OriginalMember(owner = "client!sia", name = "G", descriptor = "I")
    public int field10195;

    @OriginalMember(owner = "client!sia", name = "D", descriptor = "I")
    public static int field10192 = -1;

    @OriginalMember(owner = "client!sia", name = "u", descriptor = "I")
    public static int field10183;

    @OriginalMember(owner = "client!sia", name = "v", descriptor = "I")
    public static int field10184;

    @OriginalMember(owner = "client!sia", name = "w", descriptor = "I")
    public static int field10185;

    @OriginalMember(owner = "client!sia", name = "y", descriptor = "I")
    public static int field10187;

    @OriginalMember(owner = "client!sia", name = "z", descriptor = "I")
    public static int field10188;

    @OriginalMember(owner = "client!sia", name = "A", descriptor = "I")
    public static int field10189;

    @OriginalMember(owner = "client!sia", name = "E", descriptor = "I")
    public static int field10193;

    @OriginalMember(owner = "client!sia", name = "F", descriptor = "I")
    public static int field10194;

    @OriginalMember(owner = "client!sia", name = "H", descriptor = "I")
    public static int field10196;

    @OriginalMember(owner = "client!sia", name = "I", descriptor = "I")
    public static int field10197;

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(BIIIIZ[III)V", line = 5)
    public final void method4112(byte arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8) {
        if (~arg7 == -1) {
            arg7 = arg1;
        }
        ++field10193;
        if (arg5) {
            int[] var10 = new int[arg1 * arg3];
            for (int var11 = 0; var11 < arg3; ++var11) {
                int var12 = arg1 * var11;
                int var13 = (arg3 + -1 + -var11) * arg7 + arg2;
                for (int var14 = 0; ~var14 > ~arg1; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        int var15 = 66 % ((arg0 - 45) / 60);
        super.field6291.method3639(-2, this);
        if (~arg1 != ~arg7) {
            OpenGL.glPixelStorei(3314, arg7);
        }
        OpenGL.glTexSubImage2Di(super.field6282, 0, arg8, this.field10191 - (arg3 + arg4), arg1, arg3, 32993, super.field6291.field9083, arg6, arg2);
        if (arg1 != arg7) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(IIBI)V", line = 54)
    public final void method4113(int arg0, int arg1, byte arg2, int arg3) {
        ++field10189;
        OpenGL.glFramebufferTexture2DEXT(arg0, arg3, super.field6282, super.field6293, arg1);
        this.field10190 = arg0;
        if (arg2 != 85) {
            method4117((Throwable) null, (String) null);
        }
        this.field10186 = arg3;
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(IIIIIII)V", line = 69)
    public final void method4114(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field10196;
        int var8 = -arg2 + super.field6291.field8746 + -arg0;
        if (arg4 != 34037) {
            this.method2032((byte) 84);
        }
        super.field6291.method3639(-2, this);
        OpenGL.glCopyTexSubImage2D(super.field6282, 0, arg6, -arg2 + this.field10191 + -arg3, arg5, var8, arg1, arg2);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(B)V", line = 84)
    public final void method2032(byte arg0) {
        if (arg0 > 106) {
            ++field10194;
            OpenGL.glFramebufferTexture2DEXT(this.field10190, this.field10186, super.field6282, 0, 0);
            this.field10186 = -1;
            this.field10190 = -1;
        }
    }

    @OriginalMember(owner = "client!sia", name = "b", descriptor = "(II)[B", line = 97)
    public static final byte[] method4115(int arg0, int arg1) {
        if (arg1 <= 74) {
            method4115(52, 7);
        }
        ++field10197;
        class283 var2 = (class283) class57.field685.method1988((long) arg0, -1);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; ~var5 > -256; ++var5) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; ~var6 > -256; ++var6) {
                int var7 = -var6 + 255;
                int var8 = class309.method1906(var7, -1, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[-var6 + 511] = var9;
            }
            var2 = new class283(var3);
            class57.field685.method1987((long) arg0, (byte) 98, var2);
        }
        return var2.field4000;
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(BZZ)V", line = 148)
    public final void method4116(byte arg0, boolean arg1, boolean arg2) {
        ++field10183;
        if (arg0 != -60) {
            method4115(-101, 116);
        }
        if (super.field6282 == 3553) {
            super.field6291.method3639(-2, this);
            OpenGL.glTexParameteri(super.field6282, 10242, arg2 ? 10497 : 33071);
            OpenGL.glTexParameteri(super.field6282, 10243, !arg1 ? 33071 : 10497);
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lph;", line = 166)
    public static final class644 method4117(Throwable arg0, String arg1) {
        ++field10188;
        class644 var2;
        if (arg0 instanceof class644) {
            var2 = (class644) arg0;
            var2.field8567 = var2.field8567 + ' ' + arg1;
        } else {
            var2 = new class644(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!sia", name = "<init>", descriptor = "(Lrda;IIII)V", line = 186)
    public class737(class663 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field10191 = arg4;
        this.field10195 = arg3;
        super.field6291.method3639(-2, this);
        OpenGL.glTexImage2Dub(super.field6282, 0, super.field6297, arg3, arg4, 0, class555.method3088(super.field6297, 121), 5121, (byte[]) null, 0);
        this.method2615(false, true);
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "([BIIIIIZIII)V", line = 198)
    public final void method4118(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        ++field10187;
        if (~arg3 == -1) {
            arg3 = arg9;
        }
        if (arg6) {
            int var11 = class131.method1023(arg1, (byte) -117);
            int var12 = arg9 * var11;
            int var13 = arg3 * var11;
            byte[] var14 = new byte[arg7 * var12];
            for (int var15 = 0; ~var15 > ~arg7; ++var15) {
                int var16 = var12 * var15;
                int var17 = (-var15 + arg7 + -1) * var13 - -arg4;
                for (int var18 = 0; ~var12 < ~var18; ++var18) {
                    var14[var16++] = arg0[var17++];
                }
            }
            arg0 = var14;
        }
        super.field6291.method3639(-2, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg3 != arg9) {
            OpenGL.glPixelStorei(3314, arg3);
        }
        OpenGL.glTexSubImage2Dub(super.field6282, 0, arg5, arg2, arg9, arg7, arg1, 5121, arg0, arg4);
        if (~arg3 != ~arg9) {
            OpenGL.glPixelStorei(3314, 0);
        }
        int var19 = -72 % ((-5 - arg8) / 57);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!sia", name = "<init>", descriptor = "(Lrda;IIIII)V", line = 258)
    public class737(class663 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field10195 = arg4;
        this.field10191 = arg5;
        int var7 = -arg3 + super.field6291.field8746 - arg5;
        super.field6291.method3639(-2, this);
        OpenGL.glCopyTexImage2D(super.field6282, 0, super.field6297, arg2, var7, arg4, arg5, 0);
        this.method2615(false, true);
    }

    @OriginalMember(owner = "client!sia", name = "<init>", descriptor = "(Lrda;IIIIZ[IIIZ)V", line = 272)
    public class737(class663 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8, boolean arg9) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field10195 = arg3;
        this.field10191 = arg4;
        if (arg9) {
            int[] var11 = new int[arg6.length];
            for (int var12 = 0; ~var12 > ~arg4; ++var12) {
                int var13 = arg3 * var12;
                int var14 = (-var12 + arg4 + -1) * arg3;
                for (int var15 = 0; ~arg3 < ~var15; ++var15) {
                    var11[var13++] = arg6[var14++];
                }
            }
            arg6 = var11;
        }
        super.field6291.method3639(-2, this);
        if (super.field6282 != 34037 && arg5 && arg7 == 0 && arg8 == 0) {
            class247.method1526(this.field10195, super.field6282, this.field10191, super.field6297, (byte) 87, arg6, 32993, super.field6291.field9083);
            this.method2614(true, 31005);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Di(super.field6282, 0, super.field6297, this.field10195, this.field10191, 0, 32993, super.field6291.field9083, arg6, arg8 * 4);
            OpenGL.glPixelStorei(3314, 0);
            this.method2614(false, 31005);
        }
        this.method2615(false, true);
    }

    @OriginalMember(owner = "client!sia", name = "<init>", descriptor = "(Lrda;IIIIZ[BIZ)V", line = 327)
    public class737(class663 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field10191 = arg4;
        this.field10195 = arg3;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; var11 < arg4; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (arg4 + -1 - var11) * arg3;
                for (int var14 = 0; arg3 > var14; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field6291.method3639(-2, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && ~super.field6282 != -34038) {
            class644.method3530(-23712, arg4, arg2, arg3, arg1, arg7, arg6);
            this.method2614(true, 31005);
        } else {
            OpenGL.glTexImage2Dub(super.field6282, 0, super.field6297, this.field10195, this.field10191, 0, arg7, 5121, arg6, 0);
            this.method2614(false, 31005);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method2615(false, true);
    }

    @OriginalMember(owner = "client!sia", name = "<init>", descriptor = "(Lrda;IIIIZ[FI)V", line = 384)
    public class737(class663 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field10195 = arg3;
        this.field10191 = arg4;
        super.field6291.method3639(-2, this);
        if (arg5 && super.field6282 != 34037) {
            class241.method1511(arg1, arg3, arg6, arg4, arg2, true, arg7);
            this.method2614(true, 31005);
        } else {
            OpenGL.glTexImage2Df(super.field6282, 0, super.field6297, this.field10195, this.field10191, 0, arg7, 5126, arg6, 0);
            this.method2614(false, 31005);
        }
        this.method2615(false, true);
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(IB)I", line = 412)
    public static final int method4119(int arg0, byte arg1) {
        ++field10184;
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        if (arg1 >= -127) {
            method4115(119, -100);
        }
        return var6 + 1;
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(CB)Z", line = 431)
    public static final boolean method4120(char arg0, byte arg1) {
        ++field10185;
        if (arg1 > -76) {
            return true;
        } else {
            return arg0 >= '0' && ~arg0 >= -58;
        }
    }
}
