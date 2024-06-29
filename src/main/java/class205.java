import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class205 extends class439 {

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public int field2801;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    private int field2800;

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lpo;II)V", line = 10)
    public class205(class332 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        opengl var4 = this.field6436.field4752;
        this.field2801 = arg2;
        this.field6436.method2085(this);
        for (int var5 = 0; var5 < 6; var5++) {
            var4.glTexImage2D(var5 + 34069, 0, this.field6434, arg2, arg2, 0, 32993, this.field6436.field4857, (Buffer) null);
        }
        this.method2725(true);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "()V", line = 25)
    public final void method460() {
        this.field6436.field4752.glFramebufferTexture2DEXT(36160, this.field2800, 3553, 0, 0);
        this.field2800 = -1;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)V", line = 29)
    public final void method1303(int arg0, int arg1, int arg2) {
        this.field6436.field4752.glFramebufferTexture2DEXT(36160, arg0, arg2, this.field6437, arg1);
        this.field2800 = arg0;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lpo;IIZ[[I)V", line = 33)
    public class205(class332 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var6 = this.field6436.field4752;
        this.field2801 = arg2;
        this.field6436.method2085(this);
        if (arg3) {
            for (int var7 = 0; var7 < 6; var7++) {
                method2732(var6, var7 + 34069, this.field6434, arg2, arg2, 32993, this.field6436.field4857, arg4[var7]);
            }
        } else {
            for (int var8 = 0; var8 < 6; var8++) {
                var6.glTexImage2D(var8 + 34069, 0, this.field6434, arg2, arg2, 0, 32993, this.field6436.field4857, IntBuffer.wrap(arg4[var8]));
            }
        }
        this.method2725(true);
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lpo;IIZ[[BI)V", line = 65)
    public class205(class332 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var7 = this.field6436.field4752;
        this.field2801 = arg2;
        this.field6436.method2085(this);
        for (int var8 = 0; var8 < 6; var8++) {
            var7.glTexImage2D(var8 + 34069, 0, this.field6434, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[var8]));
        }
        this.method2725(true);
    }
}
