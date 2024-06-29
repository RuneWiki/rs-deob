import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class41 extends class26 {

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
    private int field568 = -1;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
    public int field566;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    public int field567;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)V")
    public final void method307(int arg0, int arg1) {
        this.field329.field3648.glFramebufferTexture2DEXT(36160, arg0, this.field330, this.field327, arg1);
        this.field568 = arg0;
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lnm;IIII)V")
    public class41(class254 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field566 = arg3;
        this.field567 = arg4;
        opengl var6 = arg0.field3648;
        this.field329.method1653(this);
        var6.glTexImage2D(this.field330, 0, this.field331, arg3, arg4, 0, method223(this.field331), 5121, (Buffer) null);
        this.method228(true);
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lnm;IIIIZ[FI)V")
    public class41(class254 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field566 = arg3;
        this.field567 = arg4;
        opengl var9 = arg0.field3648;
        this.field329.method1653(this);
        if (arg5 && this.field330 != 34037) {
            method229(var9, arg1, arg2, arg3, arg4, arg7, arg6);
            this.method230(true);
        } else {
            var9.glTexImage2D(this.field330, 0, this.field331, this.field566, this.field567, 0, arg7, 5126, FloatBuffer.wrap(arg6));
            this.method230(false);
        }
        this.method228(true);
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lnm;IIIII)V")
    public class41(class254 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field566 = arg4;
        this.field567 = arg5;
        opengl var7 = arg0.field3648;
        int var8 = this.field329.method1641().method1382() - (arg3 + arg5);
        this.field329.method1653(this);
        var7.glCopyTexImage2D(this.field330, 0, this.field331, arg2, var8, arg4, arg5, 0);
        this.method228(true);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIII)V")
    public final void method308(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field329.method1641().method1382() - (arg3 + arg5);
        this.field329.method1653(this);
        this.field329.field3648.glCopyTexSubImage2D(this.field330, 0, arg0, this.field567 - (arg1 + arg3), arg4, var7, arg2, arg3);
        this.field329.field3648.glFlush();
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lnm;IIIIZ[IZ)V")
    public class41(class254 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field566 = arg3;
        this.field567 = arg4;
        opengl var9 = arg0.field3648;
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
        this.field329.method1653(this);
        if (arg5 && this.field330 != 34037) {
            method224(var9, this.field330, this.field331, this.field566, this.field567, 32993, this.field329.field3741, arg6);
            this.method230(true);
        } else {
            var9.glTexImage2D(this.field330, 0, this.field331, this.field566, this.field567, 0, 32993, this.field329.field3741, IntBuffer.wrap(arg6));
            this.method230(false);
        }
        this.method228(true);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "()V")
    public final void method309() {
        this.field329.field3648.glFramebufferTexture2DEXT(36160, this.field568, this.field330, 0, 0);
        this.field568 = -1;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIII[BIIIZ)V")
    public final void method310(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, boolean arg8) {
        opengl var10 = this.field329.field3648;
        if (arg7 == 0) {
            arg7 = arg2;
        }
        if (arg8) {
            int var11 = method225(arg5);
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
        this.field329.method1653(this);
        var10.glPixelStorei(3317, 1);
        if (arg2 != arg7) {
            var10.glPixelStorei(3314, arg7);
        }
        var10.glTexSubImage2D(this.field330, 0, arg0, arg1, arg2, arg3, arg5, 5121, ByteBuffer.wrap(arg4, arg6, arg4.length - arg6));
        if (arg2 != arg7) {
            var10.glPixelStorei(3314, 0);
        }
        var10.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIII[IIIZ)V")
    public final void method311(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, boolean arg7) {
        opengl var9 = this.field329.field3648;
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
        this.field329.method1653(this);
        if (arg2 != arg6) {
            var9.glPixelStorei(3314, arg6);
        }
        var9.glTexSubImage2D(this.field330, 0, arg0, arg1, arg2, arg3, 32993, this.field329.field3741, IntBuffer.wrap(arg4, arg5, arg4.length - arg5));
        if (arg2 != arg6) {
            var9.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lnm;IIIIZ[BIZ)V")
    public class41(class254 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field566 = arg3;
        this.field567 = arg4;
        opengl var10 = arg0.field3648;
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
        this.field329.method1653(this);
        var10.glPixelStorei(3317, 1);
        if (arg5 && this.field330 != 34037) {
            method226(var10, arg1, arg2, arg3, arg4, arg7, arg6);
            this.method230(true);
        } else {
            var10.glTexImage2D(this.field330, 0, this.field331, this.field566, this.field567, 0, arg7, 5121, ByteBuffer.wrap(arg6));
            this.method230(false);
        }
        var10.glPixelStorei(3317, 4);
        this.method228(true);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZZ)V")
    public final void method312(boolean arg0, boolean arg1) {
        opengl var3 = this.field329.field3648;
        if (this.field330 == 3553) {
            this.field329.method1653(this);
            var3.glTexParameteri(this.field330, 10242, arg0 ? 10497 : 33071);
            var3.glTexParameteri(this.field330, 10243, arg1 ? 10497 : 33071);
        }
    }
}
