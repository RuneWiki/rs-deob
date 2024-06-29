import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class355 extends class293 {

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    private int field5454 = -1;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
    public int field5455;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    public int field5456;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIII)V", line = 7)
    public final void method2308(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field4690.method611().method422() - (arg3 + arg5);
        this.field4690.method688(this);
        this.field4690.field1156.glCopyTexSubImage2D(this.field4695, 0, arg0, this.field5456 - (arg1 + arg3), arg4, var7, arg2, arg3);
        this.field4690.field1156.glFlush();
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZZ)V", line = 14)
    public final void method2309(boolean arg0, boolean arg1) {
        opengl var3 = this.field4690.field1156;
        if (this.field4695 == 3553) {
            this.field4690.method688(this);
            var3.glTexParameteri(this.field4695, 10242, arg0 ? 10497 : 33071);
            var3.glTexParameteri(this.field4695, 10243, arg1 ? 10497 : 33071);
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lsq;IIII)V", line = 24)
    public class355(class96 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field5455 = arg3;
        this.field5456 = arg4;
        opengl var6 = arg0.field1156;
        this.field4690.method688(this);
        var6.glTexImage2D(this.field4695, 0, this.field4696, arg3, arg4, 0, method1979(this.field4696), 5121, (Buffer) null);
        this.method1980(true);
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lsq;IIIII)V", line = 34)
    public class355(class96 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field5455 = arg4;
        this.field5456 = arg5;
        opengl var7 = arg0.field1156;
        int var8 = this.field4690.method611().method422() - (arg3 + arg5);
        this.field4690.method688(this);
        var7.glCopyTexImage2D(this.field4695, 0, this.field4696, arg2, var8, arg4, arg5, 0);
        this.method1980(true);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIII[IIIZ)V", line = 50)
    public final void method2310(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, boolean arg7) {
        opengl var9 = this.field4690.field1156;
        if (arg6 == 0) {
            arg6 = arg2;
        }
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
        this.field4690.method688(this);
        if (arg2 != arg6) {
            var9.glPixelStorei(3314, arg6);
        }
        var9.glTexSubImage2D(this.field4695, 0, arg0, arg1, arg2, arg3, 32993, this.field4690.field1256, IntBuffer.wrap(arg4, arg5, arg4.length - arg5));
        if (arg2 != arg6) {
            var9.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lsq;IIIIZ[FI)V", line = 99)
    public class355(class96 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field5455 = arg3;
        this.field5456 = arg4;
        opengl var9 = arg0.field1156;
        this.field4690.method688(this);
        if (arg5 && this.field4695 != 34037) {
            method1983(var9, arg1, arg2, arg3, arg4, arg7, arg6);
            this.method1981(true);
        } else {
            var9.glTexImage2D(this.field4695, 0, this.field4696, this.field5455, this.field5456, 0, arg7, 5126, FloatBuffer.wrap(arg6));
            this.method1981(false);
        }
        this.method1980(true);
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lsq;IIIIZ[IZ)V", line = 174)
    public class355(class96 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field5455 = arg3;
        this.field5456 = arg4;
        opengl var9 = arg0.field1156;
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
        this.field4690.method688(this);
        if (arg5 && this.field4695 != 34037) {
            method1971(var9, this.field4695, this.field4696, this.field5455, this.field5456, 32993, this.field4690.field1256, arg6);
            this.method1981(true);
        } else {
            var9.glTexImage2D(this.field4695, 0, this.field4696, this.field5455, this.field5456, 0, 32993, this.field4690.field1256, IntBuffer.wrap(arg6));
            this.method1981(false);
        }
        this.method1980(true);
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lsq;IIIIZ[BIZ)V", line = 222)
    public class355(class96 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field5455 = arg3;
        this.field5456 = arg4;
        opengl var10 = arg0.field1156;
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
        this.field4690.method688(this);
        var10.glPixelStorei(3317, 1);
        if (arg5 && this.field4695 != 34037) {
            method1977(var10, arg1, arg2, arg3, arg4, arg7, arg6);
            this.method1981(true);
        } else {
            var10.glTexImage2D(this.field4695, 0, this.field4696, this.field5455, this.field5456, 0, arg7, 5121, ByteBuffer.wrap(arg6));
            this.method1981(false);
        }
        var10.glPixelStorei(3317, 4);
        this.method1980(true);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "()V", line = 95)
    public final void method1824() {
        this.field4690.field1156.glFramebufferTexture2DEXT(36160, this.field5454, this.field4695, 0, 0);
        this.field5454 = -1;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)V", line = 119)
    public final void method2311(int arg0, int arg1) {
        this.field4690.field1156.glFramebufferTexture2DEXT(36160, arg0, this.field4695, this.field4692, arg1);
        this.field5454 = arg0;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIII[BIIIZ)V", line = 124)
    public final void method2312(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, boolean arg8) {
        opengl var10 = this.field4690.field1156;
        if (arg7 == 0) {
            arg7 = arg2;
        }
        if (arg8) {
            int var11 = method1975(arg5);
            int var12 = arg2 * var11;
            int var13 = arg7 * var11;
            byte[] var14 = new byte[arg3 * var12];
            for (int var15 = 0; var15 < arg3; var15++) {
                int var16 = var12 * var15;
                int var17 = (arg3 - var15 - 1) * var13 + arg6;
                for (int var18 = 0; var18 < var12; var18++) {
                    var14[var16++] = arg4[var17++];
                }
            }
            arg4 = var14;
        }
        this.field4690.method688(this);
        var10.glPixelStorei(3317, 1);
        if (arg2 != arg7) {
            var10.glPixelStorei(3314, arg7);
        }
        var10.glTexSubImage2D(this.field4695, 0, arg0, arg1, arg2, arg3, arg5, 5121, ByteBuffer.wrap(arg4, arg6, arg4.length - arg6));
        if (arg2 != arg7) {
            var10.glPixelStorei(3314, 0);
        }
        var10.glPixelStorei(3317, 4);
    }
}
