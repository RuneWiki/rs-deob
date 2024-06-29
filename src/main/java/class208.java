import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class208 extends class195 {

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    private int field3040 = -1;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public int field3038;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public int field3039;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIII[IIIZ)V", line = 7)
    public final void method1570(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, boolean arg7) {
        opengl var9 = this.field2858.field1604;
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
        this.field2858.method929(this);
        if (this.field3038 != arg6) {
            var9.glPixelStorei(3314, arg6);
        }
        var9.glTexSubImage2D(this.field2860, 0, arg0, arg1, arg2, arg3, 32993, this.field2858.field1709, IntBuffer.wrap(arg4, arg5, arg4.length - arg5));
        if (this.field3038 != arg6) {
            var9.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lge;IIII)V", line = 46)
    public class208(class104 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field3038 = arg3;
        this.field3039 = arg4;
        opengl var6 = arg0.field1604;
        this.field2858.method929(this);
        var6.glTexImage2D(this.field2860, 0, this.field2862, arg3, arg4, 0, method1495(this.field2862), this.field2858.field1709, (Buffer) null);
        this.method1499(true);
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lge;IIIIZ[IZ)V", line = 56)
    public class208(class104 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3038 = arg3;
        this.field3039 = arg4;
        opengl var9 = arg0.field1604;
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
        this.field2858.method929(this);
        if (arg5 && this.field2860 != 34037) {
            method1496(var9, this.field2860, this.field2862, this.field3038, this.field3039, 32993, this.field2858.field1709, arg6);
            this.method1498(true);
        } else {
            var9.glTexImage2D(this.field2860, 0, this.field2862, this.field3038, this.field3039, 0, 32993, this.field2858.field1709, IntBuffer.wrap(arg6));
            this.method1498(false);
        }
        this.method1499(true);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIII[BIIIZ)V", line = 105)
    public final void method1571(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, boolean arg8) {
        opengl var10 = this.field2858.field1604;
        int var11 = method1500(arg5) * arg2;
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
        this.field2858.method929(this);
        var10.glPixelStorei(3317, 1);
        if (arg7 != var11) {
            var10.glPixelStorei(3314, arg7);
        }
        var10.glTexSubImage2D(this.field2860, 0, arg0, arg1, arg2, arg3, arg5, 5121, ByteBuffer.wrap(arg4, arg6, arg4.length - arg6));
        if (arg7 != var11) {
            var10.glPixelStorei(3314, 0);
        }
        var10.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lge;IIIIZ[FI)V", line = 151)
    public class208(class104 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3038 = arg3;
        this.field3039 = arg4;
        opengl var9 = arg0.field1604;
        this.field2858.method929(this);
        if (arg5 && this.field2860 != 34037) {
            method1490(var9, arg1, arg2, arg3, arg4, arg7, arg6);
            this.method1498(true);
        } else {
            var9.glTexImage2D(this.field2860, 0, this.field2862, this.field3038, this.field3039, 0, arg7, 5126, FloatBuffer.wrap(arg6));
            this.method1498(false);
        }
        this.method1499(true);
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lge;IIIII)V", line = 172)
    public class208(class104 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field3038 = arg4;
        this.field3039 = arg5;
        opengl var7 = arg0.field1604;
        int var8 = this.field2858.method859().method898() - (arg3 + arg5);
        this.field2858.method929(this);
        var7.glCopyTexImage2D(this.field2860, 0, this.field2862, arg2, var8, arg4, arg5, 0);
        this.method1499(true);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIII)V", line = 185)
    public final void method1572(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field2858.method859().method898() - (arg3 + arg5);
        this.field2858.method929(this);
        this.field2858.field1604.glCopyTexSubImage2D(this.field2860, 0, arg0, this.field3039 - (arg1 + arg3), arg4, var7, arg2, arg3);
        this.field2858.field1604.glFlush();
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)V", line = 191)
    public final void method1573(int arg0, int arg1) {
        this.field2858.field1604.glFramebufferTexture2DEXT(36160, arg0, this.field2860, this.field2859, arg1);
        this.field3040 = arg0;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "()V", line = 195)
    public final void method658() {
        this.field2858.field1604.glFramebufferTexture2DEXT(36160, this.field3040, this.field2860, 0, 0);
        this.field3040 = -1;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lge;IIIIZ[BIZ)V", line = 200)
    public class208(class104 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3038 = arg3;
        this.field3039 = arg4;
        opengl var10 = arg0.field1604;
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
        this.field2858.method929(this);
        var10.glPixelStorei(3317, 1);
        if (arg5 && this.field2860 != 34037) {
            method1493(var10, arg1, arg2, arg3, arg4, arg7, arg6);
            this.method1498(true);
        } else {
            var10.glTexImage2D(this.field2860, 0, this.field2862, this.field3038, this.field3039, 0, arg7, 5121, ByteBuffer.wrap(arg6));
            this.method1498(false);
        }
        var10.glPixelStorei(3317, 4);
        this.method1499(true);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZZ)V", line = 251)
    public final void method1574(boolean arg0, boolean arg1) {
        opengl var3 = this.field2858.field1604;
        if (this.field2860 == 3553) {
            this.field2858.method929(this);
            var3.glTexParameteri(this.field2860, 10242, arg0 ? 10497 : 33071);
            var3.glTexParameteri(this.field2860, 10243, arg1 ? 10497 : 33071);
        }
    }
}
