import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class216 extends class360 {

    @OriginalMember(owner = "client!ir", name = "j", descriptor = "I")
    private int field2875 = -1;

    @OriginalMember(owner = "client!ir", name = "i", descriptor = "I")
    public int field2874;

    @OriginalMember(owner = "client!ir", name = "k", descriptor = "I")
    public int field2876;

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lnf;IIII)V", line = 6)
    public class216(class256 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field2874 = arg3;
        this.field2876 = arg4;
        opengl var6 = arg0.field3634;
        this.field5209.method1669(this);
        var6.glTexImage2D(this.field5204, 0, this.field5203, arg3, arg4, 0, method2357(this.field5203), 5121, (Buffer) null);
        this.method2351(true);
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lnf;IIIIZ[IZ)V", line = 16)
    public class216(class256 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field2874 = arg3;
        this.field2876 = arg4;
        opengl var9 = arg0.field3634;
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
        this.field5209.method1669(this);
        if (arg5 && this.field5204 != 34037) {
            method2353(var9, this.field5204, this.field5203, this.field2874, this.field2876, 32993, this.field5209.field3751, arg6);
            this.method2352(true);
        } else {
            var9.glTexImage2D(this.field5204, 0, this.field5203, this.field2874, this.field2876, 0, 32993, this.field5209.field3751, IntBuffer.wrap(arg6));
            this.method2352(false);
        }
        this.method2351(true);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIII[IIIZ)V", line = 65)
    public final void method1268(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, boolean arg7) {
        opengl var9 = this.field5209.field3634;
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
        this.field5209.method1669(this);
        if (arg2 != arg6) {
            var9.glPixelStorei(3314, arg6);
        }
        var9.glTexSubImage2D(this.field5204, 0, arg0, arg1, arg2, arg3, 32993, this.field5209.field3751, IntBuffer.wrap(arg4, arg5, arg4.length - arg5));
        if (arg2 != arg6) {
            var9.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)V", line = 109)
    public final void method1269(int arg0, int arg1) {
        this.field5209.field3634.glFramebufferTexture2DEXT(36160, arg0, this.field5204, this.field5202, arg1);
        this.field2875 = arg0;
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lnf;IIIIZ[FI)V", line = 179)
    public class216(class256 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field2874 = arg3;
        this.field2876 = arg4;
        opengl var9 = arg0.field3634;
        this.field5209.method1669(this);
        if (arg5 && this.field5204 != 34037) {
            method2355(var9, arg1, arg2, arg3, arg4, arg7, arg6);
            this.method2352(true);
        } else {
            var9.glTexImage2D(this.field5204, 0, this.field5203, this.field2874, this.field2876, 0, arg7, 5126, FloatBuffer.wrap(arg6));
            this.method2352(false);
        }
        this.method2351(true);
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lnf;IIIIZ[BIZ)V", line = 199)
    public class216(class256 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field2874 = arg3;
        this.field2876 = arg4;
        opengl var10 = arg0.field3634;
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
        this.field5209.method1669(this);
        var10.glPixelStorei(3317, 1);
        if (arg5 && this.field5204 != 34037) {
            method2349(var10, arg1, arg2, arg3, arg4, arg7, arg6);
            this.method2352(true);
        } else {
            var10.glTexImage2D(this.field5204, 0, this.field5203, this.field2874, this.field2876, 0, arg7, 5121, ByteBuffer.wrap(arg6));
            this.method2352(false);
        }
        var10.glPixelStorei(3317, 4);
        this.method2351(true);
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lnf;IIIII)V", line = 260)
    public class216(class256 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field2874 = arg4;
        this.field2876 = arg5;
        opengl var7 = arg0.field3634;
        int var8 = this.field5209.method1655().method541() - (arg3 + arg5);
        this.field5209.method1669(this);
        var7.glCopyTexImage2D(this.field5204, 0, this.field5203, arg2, var8, arg4, arg5, 0);
        this.method2351(true);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIII[BIIIZ)V", line = 117)
    public final void method1270(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, boolean arg8) {
        opengl var10 = this.field5209.field3634;
        if (arg7 == 0) {
            arg7 = arg2;
        }
        if (arg8) {
            int var11 = method2347(arg5);
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
        this.field5209.method1669(this);
        var10.glPixelStorei(3317, 1);
        if (arg2 != arg7) {
            var10.glPixelStorei(3314, arg7);
        }
        var10.glTexSubImage2D(this.field5204, 0, arg0, arg1, arg2, arg3, arg5, 5121, ByteBuffer.wrap(arg4, arg6, arg4.length - arg6));
        if (arg2 != arg7) {
            var10.glPixelStorei(3314, 0);
        }
        var10.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZZ)V", line = 169)
    public final void method1271(boolean arg0, boolean arg1) {
        opengl var3 = this.field5209.field3634;
        if (this.field5204 == 3553) {
            this.field5209.method1669(this);
            var3.glTexParameteri(this.field5204, 10242, arg0 ? 10497 : 33071);
            var3.glTexParameteri(this.field5204, 10243, arg1 ? 10497 : 33071);
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIIIII)V", line = 250)
    public final void method1272(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field5209.method1655().method541() - (arg3 + arg5);
        this.field5209.method1669(this);
        this.field5209.field3634.glCopyTexSubImage2D(this.field5204, 0, arg0, this.field2876 - (arg1 + arg3), arg4, var7, arg2, arg3);
        this.field5209.field3634.glFlush();
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "()V", line = 256)
    public final void method93() {
        this.field5209.field3634.glFramebufferTexture2DEXT(36160, this.field2875, this.field5204, 0, 0);
        this.field2875 = -1;
    }
}
