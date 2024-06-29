import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class322 extends class360 {

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "I")
    public int field4735;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
    private int field4734;

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lnf;II)V", line = 8)
    public class322(class256 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        opengl var4 = this.field5209.field3634;
        this.field4735 = arg2;
        this.field5209.method1669(this);
        for (int var5 = 0; var5 < 6; var5++) {
            var4.glTexImage2D(var5 + 34069, 0, this.field5203, arg2, arg2, 0, 32993, this.field5209.field3751, (Buffer) null);
        }
        this.method2351(true);
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lnf;IIZ[[BI)V", line = 23)
    public class322(class256 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var7 = this.field5209.field3634;
        this.field4735 = arg2;
        this.field5209.method1669(this);
        for (int var8 = 0; var8 < 6; var8++) {
            var7.glTexImage2D(var8 + 34069, 0, this.field5203, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[var8]));
        }
        this.method2351(true);
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lnf;IIZ[[I)V", line = 41)
    public class322(class256 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var6 = this.field5209.field3634;
        this.field4735 = arg2;
        this.field5209.method1669(this);
        if (arg3) {
            for (int var7 = 0; var7 < 6; var7++) {
                method2353(var6, var7 + 34069, this.field5203, arg2, arg2, 32993, this.field5209.field3751, arg4[var7]);
            }
        } else {
            for (int var8 = 0; var8 < 6; var8++) {
                var6.glTexImage2D(var8 + 34069, 0, this.field5203, arg2, arg2, 0, 32993, this.field5209.field3751, IntBuffer.wrap(arg4[var8]));
            }
        }
        this.method2351(true);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "()V", line = 71)
    public final void method93() {
        this.field5209.field3634.glFramebufferTexture2DEXT(36160, this.field4734, 3553, 0, 0);
        this.field4734 = -1;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(III)V", line = 76)
    public final void method2167(int arg0, int arg1, int arg2) {
        this.field5209.field3634.glFramebufferTexture2DEXT(36160, arg0, arg2, this.field5202, arg1);
        this.field4734 = arg0;
    }
}
