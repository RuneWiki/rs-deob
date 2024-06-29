import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class240 extends class375 {

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
    public int field3509;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
    private int field3508;

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lfu;IIZ[[BI)V")
    public class240(class42 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var7 = this.field5186.field557;
        this.field3509 = arg2;
        this.field5186.method303(this);
        for (int var8 = 0; var8 < 6; var8++) {
            var7.glTexImage2D(var8 + 34069, 0, this.field5187, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[var8]));
        }
        this.method2297(true);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "()V")
    public final void method88() {
        this.field5186.field557.glFramebufferTexture2DEXT(36160, this.field3508, 3553, 0, 0);
        this.field3508 = -1;
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lfu;IIZ[[I)V")
    public class240(class42 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var6 = this.field5186.field557;
        this.field3509 = arg2;
        this.field5186.method303(this);
        if (arg3) {
            for (int var7 = 0; var7 < 6; var7++) {
                method2294(var6, var7 + 34069, this.field5187, arg2, arg2, 32993, this.field5186.field593, arg4[var7]);
            }
        } else {
            for (int var8 = 0; var8 < 6; var8++) {
                var6.glTexImage2D(var8 + 34069, 0, this.field5187, arg2, arg2, 0, 32993, this.field5186.field593, IntBuffer.wrap(arg4[var8]));
            }
        }
        this.method2297(true);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)V")
    public final void method1673(int arg0, int arg1, int arg2) {
        this.field5186.field557.glFramebufferTexture2DEXT(36160, arg0, arg2, this.field5182, arg1);
        this.field3508 = arg0;
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lfu;II)V")
    public class240(class42 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        opengl var4 = this.field5186.field557;
        this.field3509 = arg2;
        this.field5186.method303(this);
        for (int var5 = 0; var5 < 6; var5++) {
            var4.glTexImage2D(var5 + 34069, 0, this.field5187, arg2, arg2, 0, 32993, this.field5186.field593, (Buffer) null);
        }
        this.method2297(true);
    }
}
