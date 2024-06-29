import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class89 extends class205 {

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    private int field1095 = -1;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public int field1094;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public int field1093;

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lks;IIIIZ[IZ)V", line = 6)
    public class89(class173 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field1094 = arg3;
        this.field1093 = arg4;
        opengl var9 = arg0.field2253;
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
        this.field2875.method1160(this);
        if (arg5 && this.field2878 != 34037) {
            method1403(var9, this.field2878, this.field2876, this.field1094, this.field1093, 32993, this.field2875.field2385, arg6);
            this.method1410(true);
        } else {
            var9.glTexImage2D(this.field2878, 0, this.field2876, this.field1094, this.field1093, 0, 32993, this.field2875.field2385, IntBuffer.wrap(arg6));
            this.method1410(false);
        }
        this.method1405(true);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)V", line = 54)
    public final void method595(int arg0, int arg1) {
        this.field2875.field2253.glFramebufferTexture2DEXT(36160, arg0, this.field2878, this.field2877, arg1);
        this.field1095 = arg0;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lks;IIIIZ[BIZ)V", line = 59)
    public class89(class173 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field1094 = arg3;
        this.field1093 = arg4;
        opengl var10 = arg0.field2253;
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
        this.field2875.method1160(this);
        var10.glPixelStorei(3317, 1);
        if (arg5 && this.field2878 != 34037) {
            method1412(var10, arg1, arg2, arg3, arg4, arg7, arg6);
            this.method1410(true);
        } else {
            var10.glTexImage2D(this.field2878, 0, this.field2876, this.field1094, this.field1093, 0, arg7, 5121, ByteBuffer.wrap(arg6));
            this.method1410(false);
        }
        var10.glPixelStorei(3317, 4);
        this.method1405(true);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIII)V", line = 110)
    public final void method596(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field2875.method1155().method1147() - (arg3 + arg5);
        this.field2875.method1160(this);
        this.field2875.field2253.glCopyTexSubImage2D(this.field2878, 0, arg0, this.field1093 - (arg1 + arg3), arg4, var7, arg2, arg3);
        this.field2875.field2253.glFlush();
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lks;IIII)V", line = 116)
    public class89(class173 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field1094 = arg3;
        this.field1093 = arg4;
        opengl var6 = arg0.field2253;
        this.field2875.method1160(this);
        var6.glTexImage2D(this.field2878, 0, this.field2876, arg3, arg4, 0, method1411(this.field2876), 5121, (Buffer) null);
        this.method1405(true);
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lks;IIIII)V", line = 126)
    public class89(class173 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field1094 = arg4;
        this.field1093 = arg5;
        opengl var7 = arg0.field2253;
        int var8 = this.field2875.method1155().method1147() - (arg3 + arg5);
        this.field2875.method1160(this);
        var7.glCopyTexImage2D(this.field2878, 0, this.field2876, arg2, var8, arg4, arg5, 0);
        this.method1405(true);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIII[BIIIZ)V", line = 139)
    public final void method597(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, boolean arg8) {
        opengl var10 = this.field2875.field2253;
        if (arg7 == 0) {
            arg7 = arg2;
        }
        if (arg8) {
            int var11 = method1404(arg5);
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
        this.field2875.method1160(this);
        var10.glPixelStorei(3317, 1);
        if (arg2 != arg7) {
            var10.glPixelStorei(3314, arg7);
        }
        var10.glTexSubImage2D(this.field2878, 0, arg0, arg1, arg2, arg3, arg5, 5121, ByteBuffer.wrap(arg4, arg6, arg4.length - arg6));
        if (arg2 != arg7) {
            var10.glPixelStorei(3314, 0);
        }
        var10.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "()V", line = 189)
    public final void method419() {
        this.field2875.field2253.glFramebufferTexture2DEXT(36160, this.field1095, this.field2878, 0, 0);
        this.field1095 = -1;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lks;IIIIZ[FI)V", line = 193)
    public class89(class173 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field1094 = arg3;
        this.field1093 = arg4;
        opengl var9 = arg0.field2253;
        this.field2875.method1160(this);
        if (arg5 && this.field2878 != 34037) {
            method1406(var9, arg1, arg2, arg3, arg4, arg7, arg6);
            this.method1410(true);
        } else {
            var9.glTexImage2D(this.field2878, 0, this.field2876, this.field1094, this.field1093, 0, arg7, 5126, FloatBuffer.wrap(arg6));
            this.method1410(false);
        }
        this.method1405(true);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIII[IIIZ)V", line = 215)
    public final void method598(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, boolean arg7) {
        opengl var9 = this.field2875.field2253;
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
        this.field2875.method1160(this);
        if (arg2 != arg6) {
            var9.glPixelStorei(3314, arg6);
        }
        var9.glTexSubImage2D(this.field2878, 0, arg0, arg1, arg2, arg3, 32993, this.field2875.field2385, IntBuffer.wrap(arg4, arg5, arg4.length - arg5));
        if (arg2 != arg6) {
            var9.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZZ)V", line = 258)
    public final void method599(boolean arg0, boolean arg1) {
        opengl var3 = this.field2875.field2253;
        if (this.field2878 == 3553) {
            this.field2875.method1160(this);
            var3.glTexParameteri(this.field2878, 10242, arg0 ? 10497 : 33071);
            var3.glTexParameteri(this.field2878, 10243, arg1 ? 10497 : 33071);
        }
    }
}
