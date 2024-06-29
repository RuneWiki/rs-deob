import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class231 extends class4 {

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    private int field3194 = -1;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    public int field3193;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public int field3192;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIII[IIIZ)V", line = 7)
    public final void method1542(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, boolean arg7) {
        opengl var9 = this.field24.field198;
        if (arg7) {
            int[] var10 = new int[arg2 * arg3];
            for (int var11 = 0; var11 < arg3; var11++) {
                int var12 = arg2 * var11;
                int var13 = (arg3 - var11 - 1) * arg6 + arg5;
                for (int var14 = 0; var14 < arg2; var14++) {
                    var10[var12++] = arg4[var13++];
                }
            }
            arg4 = var10;
        }
        this.field24.method207(this);
        if (this.field3193 != arg6) {
            var9.glPixelStorei(3314, arg6);
        }
        var9.glTexSubImage2D(this.field26, 0, arg0, arg1, arg2, arg3, 32993, this.field24.field340, IntBuffer.wrap(arg4, arg5, arg4.length - arg5));
        if (this.field3193 != arg6) {
            var9.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lhd;IIIII)V", line = 46)
    public class231(class17 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field3193 = arg4;
        this.field3192 = arg5;
        opengl var7 = arg0.field198;
        int var8 = this.field24.method225().method185() - (arg3 + arg5);
        this.field24.method207(this);
        var7.glCopyTexImage2D(this.field26, 0, this.field27, arg2, var8, arg4, arg5, 0);
        this.method17(true);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZZ)V", line = 59)
    public final void method1543(boolean arg0, boolean arg1) {
        opengl var3 = this.field24.field198;
        if (this.field26 == 3553) {
            this.field24.method207(this);
            var3.glTexParameteri(this.field26, 10242, arg0 ? 10497 : 33071);
            var3.glTexParameteri(this.field26, 10243, arg1 ? 10497 : 33071);
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lhd;IIIIZ[BIZ)V", line = 70)
    public class231(class17 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3193 = arg3;
        this.field3192 = arg4;
        opengl var10 = arg0.field198;
        if (arg8) {
            byte[] var11 = new byte[arg6.length];
            for (int var12 = 0; var12 < arg4; var12++) {
                int var13 = arg3 * var12;
                int var14 = (arg4 - var12 - 1) * arg3;
                for (int var15 = 0; var15 < arg3; var15++) {
                    var11[var13++] = arg6[var14++];
                }
            }
            arg6 = var11;
        }
        this.field24.method207(this);
        var10.glPixelStorei(3317, 1);
        if (arg5 && this.field26 != 34037) {
            method28(var10, arg1, arg2, arg3, arg4, arg7, arg6);
            this.method16(true);
        } else {
            var10.glTexImage2D(this.field26, 0, this.field27, this.field3193, this.field3192, 0, arg7, 5121, ByteBuffer.wrap(arg6));
            this.method16(false);
        }
        var10.glPixelStorei(3317, 4);
        this.method17(true);
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lhd;IIIIZ[IZ)V", line = 120)
    public class231(class17 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3193 = arg3;
        this.field3192 = arg4;
        opengl var9 = arg0.field198;
        if (arg7) {
            int[] var10 = new int[arg6.length];
            for (int var11 = 0; var11 < arg4; var11++) {
                int var12 = arg3 * var11;
                int var13 = (arg4 - var11 - 1) * arg3;
                for (int var14 = 0; var14 < arg3; var14++) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        this.field24.method207(this);
        if (arg5 && this.field26 != 34037) {
            method20(var9, this.field26, this.field27, this.field3193, this.field3192, 32993, this.field24.field340, arg6);
            this.method16(true);
        } else {
            var9.glTexImage2D(this.field26, 0, this.field27, this.field3193, this.field3192, 0, 32993, this.field24.field340, IntBuffer.wrap(arg6));
            this.method16(false);
        }
        this.method17(true);
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lhd;IIII)V", line = 168)
    public class231(class17 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field3193 = arg3;
        this.field3192 = arg4;
        opengl var6 = arg0.field198;
        this.field24.method207(this);
        var6.glTexImage2D(this.field26, 0, this.field27, arg3, arg4, 0, method18(this.field27), this.field24.field340, (Buffer) null);
        this.method17(true);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIII[BIIIZ)V", line = 180)
    public final void method1544(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, boolean arg8) {
        opengl var10 = this.field24.field198;
        int var11 = method24(arg5) * arg2;
        if (arg7 == 0) {
            arg7 = var11;
        }
        if (arg8) {
            byte[] var12 = new byte[arg3 * var11];
            for (int var13 = 0; var13 < arg3; var13++) {
                int var14 = var11 * var13;
                int var15 = (arg3 - var13 - 1) * arg7 + arg6;
                for (int var16 = 0; var16 < var11; var16++) {
                    var12[var14++] = arg4[var15++];
                }
            }
            arg4 = var12;
        }
        this.field24.method207(this);
        var10.glPixelStorei(3317, 1);
        if (arg7 != var11) {
            var10.glPixelStorei(3314, arg7);
        }
        var10.glTexSubImage2D(this.field26, 0, arg0, arg1, arg2, arg3, arg5, 5121, ByteBuffer.wrap(arg4, arg6, arg4.length - arg6));
        if (arg7 != var11) {
            var10.glPixelStorei(3314, 0);
        }
        var10.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "()V", line = 226)
    public final void method889() {
        this.field24.field198.glFramebufferTexture2DEXT(36160, this.field3194, this.field26, 0, 0);
        this.field3194 = -1;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lhd;IIIIZ[FI)V", line = 231)
    public class231(class17 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3193 = arg3;
        this.field3192 = arg4;
        opengl var9 = arg0.field198;
        this.field24.method207(this);
        if (arg5 && this.field26 != 34037) {
            method21(var9, arg1, arg2, arg3, arg4, arg7, arg6);
            this.method16(true);
        } else {
            var9.glTexImage2D(this.field26, 0, this.field27, this.field3193, this.field3192, 0, arg7, 5126, FloatBuffer.wrap(arg6));
            this.method16(false);
        }
        this.method17(true);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIII)V", line = 255)
    public final void method1545(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field24.method225().method185() - (arg3 + arg5);
        this.field24.method207(this);
        this.field24.field198.glCopyTexSubImage2D(this.field26, 0, arg0, this.field3192 - (arg1 + arg3), arg4, var7, arg2, arg3);
        this.field24.field198.glFlush();
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)V", line = 261)
    public final void method1546(int arg0, int arg1) {
        this.field24.field198.glFramebufferTexture2DEXT(36160, arg0, this.field26, this.field28, arg1);
        this.field3194 = arg0;
    }
}
