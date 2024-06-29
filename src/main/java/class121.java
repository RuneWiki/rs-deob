import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class121 extends class344 {

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    private int field1569 = -1;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public int field1570;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public int field1568;

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lse;IIIII)V")
    public class121(class282 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field1570 = arg4;
        this.field1568 = arg5;
        opengl var7 = arg0.field4140;
        int var8 = this.field5130.method1909().method140() - (arg3 + arg5);
        this.field5130.method1915(this);
        var7.glCopyTexImage2D(this.field5129, 0, this.field5131, arg2, var8, arg4, arg5, 0);
        this.method2277(true);
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lse;IIII)V")
    public class121(class282 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field1570 = arg3;
        this.field1568 = arg4;
        opengl var6 = arg0.field4140;
        this.field5130.method1915(this);
        var6.glTexImage2D(this.field5129, 0, this.field5131, arg3, arg4, 0, method2272(this.field5131), this.field5130.field4256, (Buffer) null);
        this.method2277(true);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII[BIIIZ)V")
    public final void method869(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, boolean arg8) {
        opengl var10 = this.field5130.field4140;
        int var11 = method2279(arg5) * arg2;
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
        this.field5130.method1915(this);
        var10.glPixelStorei(3317, 1);
        if (arg7 != var11) {
            var10.glPixelStorei(3314, arg7);
        }
        var10.glTexSubImage2D(this.field5129, 0, arg0, arg1, arg2, arg3, arg5, 5121, ByteBuffer.wrap(arg4, arg6, arg4.length - arg6));
        if (arg7 != var11) {
            var10.glPixelStorei(3314, 0);
        }
        var10.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lse;IIIIZ[IZ)V")
    public class121(class282 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field1570 = arg3;
        this.field1568 = arg4;
        opengl var9 = arg0.field4140;
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
        this.field5130.method1915(this);
        if (arg5 && this.field5129 != 34037) {
            method2276(var9, this.field5129, this.field5131, this.field1570, this.field1568, 32993, this.field5130.field4256, arg6);
            this.method2280(true);
        } else {
            var9.glTexImage2D(this.field5129, 0, this.field5131, this.field1570, this.field1568, 0, 32993, this.field5130.field4256, IntBuffer.wrap(arg6));
            this.method2280(false);
        }
        this.method2277(true);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)V")
    public final void method870(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field5130.method1909().method140() - (arg3 + arg5);
        this.field5130.method1915(this);
        this.field5130.field4140.glCopyTexSubImage2D(this.field5129, 0, arg0, this.field1568 - (arg1 + arg3), arg4, var7, arg2, arg3);
        this.field5130.field4140.glFlush();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)V")
    public final void method871(int arg0, int arg1) {
        this.field5130.field4140.glFramebufferTexture2DEXT(36160, arg0, this.field5129, this.field5127, arg1);
        this.field1569 = arg0;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lse;IIIIZ[FI)V")
    public class121(class282 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field1570 = arg3;
        this.field1568 = arg4;
        opengl var9 = arg0.field4140;
        this.field5130.method1915(this);
        if (arg5 && this.field5129 != 34037) {
            method2282(var9, arg1, arg2, arg3, arg4, arg7, arg6);
            this.method2280(true);
        } else {
            var9.glTexImage2D(this.field5129, 0, this.field5131, this.field1570, this.field1568, 0, arg7, 5126, FloatBuffer.wrap(arg6));
            this.method2280(false);
        }
        this.method2277(true);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZZ)V")
    public final void method872(boolean arg0, boolean arg1) {
        opengl var3 = this.field5130.field4140;
        if (this.field5129 == 3553) {
            this.field5130.method1915(this);
            var3.glTexParameteri(this.field5129, 10242, arg0 ? 10497 : 33071);
            var3.glTexParameteri(this.field5129, 10243, arg1 ? 10497 : 33071);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII[IIIZ)V")
    public final void method873(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, boolean arg7) {
        opengl var9 = this.field5130.field4140;
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
        this.field5130.method1915(this);
        if (this.field1570 != arg6) {
            var9.glPixelStorei(3314, arg6);
        }
        var9.glTexSubImage2D(this.field5129, 0, arg0, arg1, arg2, arg3, 32993, this.field5130.field4256, IntBuffer.wrap(arg4, arg5, arg4.length - arg5));
        if (this.field1570 != arg6) {
            var9.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lse;IIIIZ[BIZ)V")
    public class121(class282 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field1570 = arg3;
        this.field1568 = arg4;
        opengl var10 = arg0.field4140;
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
        this.field5130.method1915(this);
        var10.glPixelStorei(3317, 1);
        if (arg5 && this.field5129 != 34037) {
            method2281(var10, arg1, arg2, arg3, arg4, arg7, arg6);
            this.method2280(true);
        } else {
            var10.glTexImage2D(this.field5129, 0, this.field5131, this.field1570, this.field1568, 0, arg7, 5121, ByteBuffer.wrap(arg6));
            this.method2280(false);
        }
        var10.glPixelStorei(3317, 4);
        this.method2277(true);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()V")
    public final void method28() {
        this.field5130.field4140.glFramebufferTexture2DEXT(36160, this.field1569, this.field5129, 0, 0);
        this.field1569 = -1;
    }
}
