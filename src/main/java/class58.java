import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class58 extends class386 {

    @OriginalMember(owner = "client!al", name = "k", descriptor = "I")
    private int field784 = -1;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "I")
    public int field782;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "I")
    public int field783;

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lbf;IIIIZ[FI)V", line = 6)
    public class58(class344 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field782 = arg3;
        this.field783 = arg4;
        opengl var9 = arg0.field4604;
        this.field5346.method2106(this);
        if (arg5 && this.field5342 != 34037) {
            method2363(var9, arg1, arg2, arg3, arg4, arg7, arg6);
            this.method2375(true);
        } else {
            var9.glTexImage2D(this.field5342, 0, this.field5343, this.field782, this.field783, 0, arg7, 5126, FloatBuffer.wrap(arg6));
            this.method2375(false);
        }
        this.method2370(true);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "()V", line = 27)
    public final void method411() {
        this.field5346.field4604.glFramebufferTexture2DEXT(36160, this.field784, this.field5342, 0, 0);
        this.field784 = -1;
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lbf;IIIIZ[IZ)V", line = 31)
    public class58(class344 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field782 = arg3;
        this.field783 = arg4;
        opengl var9 = arg0.field4604;
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
        this.field5346.method2106(this);
        if (arg5 && this.field5342 != 34037) {
            method2374(var9, this.field5342, this.field5343, this.field782, this.field783, 32993, this.field5346.field4652, arg6);
            this.method2375(true);
        } else {
            var9.glTexImage2D(this.field5342, 0, this.field5343, this.field782, this.field783, 0, 32993, this.field5346.field4652, IntBuffer.wrap(arg6));
            this.method2375(false);
        }
        this.method2370(true);
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lbf;IIII)V", line = 79)
    public class58(class344 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field782 = arg3;
        this.field783 = arg4;
        opengl var6 = arg0.field4604;
        this.field5346.method2106(this);
        var6.glTexImage2D(this.field5342, 0, this.field5343, arg3, arg4, 0, method2365(this.field5343), 5121, (Buffer) null);
        this.method2370(true);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIII[BIIIZ)V", line = 90)
    public final void method412(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, boolean arg8) {
        opengl var10 = this.field5346.field4604;
        if (arg7 == 0) {
            arg7 = arg2;
        }
        if (arg8) {
            int var11 = method2373(arg5);
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
        this.field5346.method2106(this);
        var10.glPixelStorei(3317, 1);
        if (arg2 != arg7) {
            var10.glPixelStorei(3314, arg7);
        }
        var10.glTexSubImage2D(this.field5342, 0, arg0, arg1, arg2, arg3, arg5, 5121, ByteBuffer.wrap(arg4, arg6, arg4.length - arg6));
        if (arg2 != arg7) {
            var10.glPixelStorei(3314, 0);
        }
        var10.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lbf;IIIIZ[BIZ)V", line = 140)
    public class58(class344 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field782 = arg3;
        this.field783 = arg4;
        opengl var10 = arg0.field4604;
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
        this.field5346.method2106(this);
        var10.glPixelStorei(3317, 1);
        if (arg5 && this.field5342 != 34037) {
            method2367(var10, arg1, arg2, arg3, arg4, arg7, arg6);
            this.method2375(true);
        } else {
            var10.glTexImage2D(this.field5342, 0, this.field5343, this.field782, this.field783, 0, arg7, 5121, ByteBuffer.wrap(arg6));
            this.method2375(false);
        }
        var10.glPixelStorei(3317, 4);
        this.method2370(true);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIII)V", line = 191)
    public final void method413(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field5346.method2049().method1497() - (arg3 + arg5);
        this.field5346.method2106(this);
        this.field5346.field4604.glCopyTexSubImage2D(this.field5342, 0, arg0, this.field783 - (arg1 + arg3), arg4, var7, arg2, arg3);
        this.field5346.field4604.glFlush();
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIII[IIIZ)V", line = 198)
    public final void method414(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, boolean arg7) {
        opengl var9 = this.field5346.field4604;
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
        this.field5346.method2106(this);
        if (arg2 != arg6) {
            var9.glPixelStorei(3314, arg6);
        }
        var9.glTexSubImage2D(this.field5342, 0, arg0, arg1, arg2, arg3, 32993, this.field5346.field4652, IntBuffer.wrap(arg4, arg5, arg4.length - arg5));
        if (arg2 != arg6) {
            var9.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lbf;IIIII)V", line = 241)
    public class58(class344 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field782 = arg4;
        this.field783 = arg5;
        opengl var7 = arg0.field4604;
        int var8 = this.field5346.method2049().method1497() - (arg3 + arg5);
        this.field5346.method2106(this);
        var7.glCopyTexImage2D(this.field5342, 0, this.field5343, arg2, var8, arg4, arg5, 0);
        this.method2370(true);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZZ)V", line = 254)
    public final void method415(boolean arg0, boolean arg1) {
        opengl var3 = this.field5346.field4604;
        if (this.field5342 == 3553) {
            this.field5346.method2106(this);
            var3.glTexParameteri(this.field5342, 10242, arg0 ? 10497 : 33071);
            var3.glTexParameteri(this.field5342, 10243, arg1 ? 10497 : 33071);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)V", line = 264)
    public final void method416(int arg0, int arg1) {
        this.field5346.field4604.glFramebufferTexture2DEXT(36160, arg0, this.field5342, this.field5341, arg1);
        this.field784 = arg0;
    }
}
