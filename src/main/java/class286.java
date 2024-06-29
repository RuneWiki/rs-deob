import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class286 extends class386 {

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
    public int field3873;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    private int field3874;

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lbf;II)V")
    public class286(class344 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        opengl var4 = this.field5346.field4604;
        this.field3873 = arg2;
        this.field5346.method2106(this);
        for (int var5 = 0; var5 < 6; var5++) {
            var4.glTexImage2D(var5 + 34069, 0, this.field5343, arg2, arg2, 0, 32993, this.field5346.field4652, (Buffer) null);
        }
        this.method2370(true);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "()V")
    public final void method411() {
        this.field5346.field4604.glFramebufferTexture2DEXT(36160, this.field3874, 3553, 0, 0);
        this.field3874 = -1;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lbf;IIZ[[BI)V")
    public class286(class344 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var7 = this.field5346.field4604;
        this.field3873 = arg2;
        this.field5346.method2106(this);
        for (int var8 = 0; var8 < 6; var8++) {
            var7.glTexImage2D(var8 + 34069, 0, this.field5343, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[var8]));
        }
        this.method2370(true);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)V")
    public final void method1618(int arg0, int arg1, int arg2) {
        this.field5346.field4604.glFramebufferTexture2DEXT(36160, arg0, arg2, this.field5341, arg1);
        this.field3874 = arg0;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lbf;IIZ[[I)V")
    public class286(class344 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var6 = this.field5346.field4604;
        this.field3873 = arg2;
        this.field5346.method2106(this);
        if (arg3) {
            for (int var7 = 0; var7 < 6; var7++) {
                method2374(var6, var7 + 34069, this.field5343, arg2, arg2, 32993, this.field5346.field4652, arg4[var7]);
            }
        } else {
            for (int var8 = 0; var8 < 6; var8++) {
                var6.glTexImage2D(var8 + 34069, 0, this.field5343, arg2, arg2, 0, 32993, this.field5346.field4652, IntBuffer.wrap(arg4[var8]));
            }
        }
        this.method2370(true);
    }
}
