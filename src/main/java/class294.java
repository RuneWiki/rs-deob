import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class294 extends class425 {

    @OriginalMember(owner = "client!nq", name = "j", descriptor = "I")
    public int field4258;

    @OriginalMember(owner = "client!nq", name = "i", descriptor = "I")
    private int field4257;

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lmi;IIZ[[BI)V")
    public class294(class315 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var7 = this.field5957.field4445;
        this.field4258 = arg2;
        this.field5957.method1967(this);
        for (int var8 = 0; var8 < 6; var8++) {
            var7.glTexImage2D(var8 + 34069, 0, this.field5960, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[var8]));
        }
        this.method2501(true);
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lmi;IIZ[[I)V")
    public class294(class315 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var6 = this.field5957.field4445;
        this.field4258 = arg2;
        this.field5957.method1967(this);
        if (arg3) {
            for (int var7 = 0; var7 < 6; var7++) {
                method2505(var6, var7 + 34069, this.field5960, arg2, arg2, 32993, this.field5957.field4550, arg4[var7]);
            }
        } else {
            for (int var8 = 0; var8 < 6; var8++) {
                var6.glTexImage2D(var8 + 34069, 0, this.field5960, arg2, arg2, 0, 32993, this.field5957.field4550, IntBuffer.wrap(arg4[var8]));
            }
        }
        this.method2501(true);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(III)V")
    public final void method1828(int arg0, int arg1, int arg2) {
        this.field5957.field4445.glFramebufferTexture2DEXT(36160, arg0, arg2, this.field5964, arg1);
        this.field4257 = arg0;
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lmi;II)V")
    public class294(class315 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        opengl var4 = this.field5957.field4445;
        this.field4258 = arg2;
        this.field5957.method1967(this);
        for (int var5 = 0; var5 < 6; var5++) {
            var4.glTexImage2D(var5 + 34069, 0, this.field5960, arg2, arg2, 0, 32993, this.field5957.field4550, (Buffer) null);
        }
        this.method2501(true);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "()V")
    public final void method95() {
        this.field5957.field4445.glFramebufferTexture2DEXT(36160, this.field4257, 3553, 0, 0);
        this.field4257 = -1;
    }
}
