import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class92 extends class325 {

    @OriginalMember(owner = "client!gm", name = "j", descriptor = "I")
    public int field1294;

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "I")
    private int field1293;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(III)V")
    public final void method600(int arg0, int arg1, int arg2) {
        this.field4883.field5783.glFramebufferTexture2DEXT(36160, arg0, arg2, this.field4877, arg1);
        this.field1293 = arg0;
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lcg;II)V")
    public class92(class393 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        opengl var4 = this.field4883.field5783;
        this.field1294 = arg2;
        this.field4883.method2460(this);
        for (int var5 = 0; var5 < 6; var5++) {
            var4.glTexImage2D(var5 + 34069, 0, this.field4878, arg2, arg2, 0, 32993, this.field4883.field5876, (Buffer) null);
        }
        this.method2001(true);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "()V")
    public final void method70() {
        this.field4883.field5783.glFramebufferTexture2DEXT(36160, this.field1293, 3553, 0, 0);
        this.field1293 = -1;
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lcg;IIZ[[BI)V")
    public class92(class393 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var7 = this.field4883.field5783;
        this.field1294 = arg2;
        this.field4883.method2460(this);
        for (int var8 = 0; var8 < 6; var8++) {
            var7.glTexImage2D(var8 + 34069, 0, this.field4878, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[var8]));
        }
        this.method2001(true);
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lcg;IIZ[[I)V")
    public class92(class393 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var6 = this.field4883.field5783;
        this.field1294 = arg2;
        this.field4883.method2460(this);
        if (arg3) {
            for (int var7 = 0; var7 < 6; var7++) {
                method1998(var6, var7 + 34069, this.field4878, arg2, arg2, 32993, this.field4883.field5876, arg4[var7]);
            }
        } else {
            for (int var8 = 0; var8 < 6; var8++) {
                var6.glTexImage2D(var8 + 34069, 0, this.field4878, arg2, arg2, 0, 32993, this.field4883.field5876, IntBuffer.wrap(arg4[var8]));
            }
        }
        this.method2001(true);
    }
}
