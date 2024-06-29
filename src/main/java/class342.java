import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class342 extends class127 {

    @OriginalMember(owner = "client!im", name = "k", descriptor = "I")
    private int field4669 = -1;

    @OriginalMember(owner = "client!im", name = "j", descriptor = "I")
    public int field4668;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "I")
    public int field4667;

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Ltb;IIII)V")
    public class342(class227 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field4668 = arg3;
        this.field4667 = arg4;
        opengl var6 = arg0.field3184;
        this.field1787.method1559(this);
        var6.glTexImage2D(this.field1789, 0, this.field1790, arg3, arg4, 0, method873(this.field1790), 5121, (Buffer) null);
        this.method868(true);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIII)V")
    public final void method2170(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field1787.method1553().method660() - (arg3 + arg5);
        this.field1787.method1559(this);
        this.field1787.field3184.glCopyTexSubImage2D(this.field1789, 0, arg0, this.field4667 - (arg1 + arg3), arg4, var7, arg2, arg3);
        this.field1787.field3184.glFlush();
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(II)V")
    public final void method2171(int arg0, int arg1) {
        this.field1787.field3184.glFramebufferTexture2DEXT(36160, arg0, this.field1789, this.field1788, arg1);
        this.field4669 = arg0;
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Ltb;IIIIZ[IZ)V")
    public class342(class227 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field4668 = arg3;
        this.field4667 = arg4;
        opengl var9 = arg0.field3184;
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
        this.field1787.method1559(this);
        if (arg5 && this.field1789 != 34037) {
            method870(var9, this.field1789, this.field1790, this.field4668, this.field4667, 32993, this.field1787.field3239, arg6);
            this.method865(true);
        } else {
            var9.glTexImage2D(this.field1789, 0, this.field1790, this.field4668, this.field4667, 0, 32993, this.field1787.field3239, IntBuffer.wrap(arg6));
            this.method865(false);
        }
        this.method868(true);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIII[BIIIZ)V")
    public final void method2172(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, boolean arg8) {
        opengl var10 = this.field1787.field3184;
        if (arg7 == 0) {
            arg7 = arg2;
        }
        if (arg8) {
            int var11 = method866(arg5);
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
        this.field1787.method1559(this);
        var10.glPixelStorei(3317, 1);
        if (arg2 != arg7) {
            var10.glPixelStorei(3314, arg7);
        }
        var10.glTexSubImage2D(this.field1789, 0, arg0, arg1, arg2, arg3, arg5, 5121, ByteBuffer.wrap(arg4, arg6, arg4.length - arg6));
        if (arg2 != arg7) {
            var10.glPixelStorei(3314, 0);
        }
        var10.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIII[IIIZ)V")
    public final void method2173(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, boolean arg7) {
        opengl var9 = this.field1787.field3184;
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
        this.field1787.method1559(this);
        if (arg2 != arg6) {
            var9.glPixelStorei(3314, arg6);
        }
        var9.glTexSubImage2D(this.field1789, 0, arg0, arg1, arg2, arg3, 32993, this.field1787.field3239, IntBuffer.wrap(arg4, arg5, arg4.length - arg5));
        if (arg2 != arg6) {
            var9.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Ltb;IIIIZ[FI)V")
    public class342(class227 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field4668 = arg3;
        this.field4667 = arg4;
        opengl var9 = arg0.field3184;
        this.field1787.method1559(this);
        if (arg5 && this.field1789 != 34037) {
            method874(var9, arg1, arg2, arg3, arg4, arg7, arg6);
            this.method865(true);
        } else {
            var9.glTexImage2D(this.field1789, 0, this.field1790, this.field4668, this.field4667, 0, arg7, 5126, FloatBuffer.wrap(arg6));
            this.method865(false);
        }
        this.method868(true);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "()V")
    public final void method152() {
        this.field1787.field3184.glFramebufferTexture2DEXT(36160, this.field4669, this.field1789, 0, 0);
        this.field4669 = -1;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ZZ)V")
    public final void method2174(boolean arg0, boolean arg1) {
        opengl var3 = this.field1787.field3184;
        if (this.field1789 == 3553) {
            this.field1787.method1559(this);
            var3.glTexParameteri(this.field1789, 10242, arg0 ? 10497 : 33071);
            var3.glTexParameteri(this.field1789, 10243, arg1 ? 10497 : 33071);
        }
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Ltb;IIIIZ[BIZ)V")
    public class342(class227 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field4668 = arg3;
        this.field4667 = arg4;
        opengl var10 = arg0.field3184;
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
        this.field1787.method1559(this);
        var10.glPixelStorei(3317, 1);
        if (arg5 && this.field1789 != 34037) {
            method869(var10, arg1, arg2, arg3, arg4, arg7, arg6);
            this.method865(true);
        } else {
            var10.glTexImage2D(this.field1789, 0, this.field1790, this.field4668, this.field4667, 0, arg7, 5121, ByteBuffer.wrap(arg6));
            this.method865(false);
        }
        var10.glPixelStorei(3317, 4);
        this.method868(true);
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Ltb;IIIII)V")
    public class342(class227 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field4668 = arg4;
        this.field4667 = arg5;
        opengl var7 = arg0.field3184;
        int var8 = this.field1787.method1553().method660() - (arg3 + arg5);
        this.field1787.method1559(this);
        var7.glCopyTexImage2D(this.field1789, 0, this.field1790, arg2, var8, arg4, arg5, 0);
        this.method868(true);
    }
}
