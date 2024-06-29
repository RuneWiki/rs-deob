import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class61 extends class205 {

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public int field812;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    private int field811;

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lks;IIZ[[BI)V")
    public class61(class173 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var7 = this.field2875.field2253;
        this.field812 = arg2;
        this.field2875.method1160(this);
        for (int var8 = 0; var8 < 6; var8++) {
            var7.glTexImage2D(var8 + 34069, 0, this.field2876, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[var8]));
        }
        this.method1405(true);
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lks;IIZ[[I)V")
    public class61(class173 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var6 = this.field2875.field2253;
        this.field812 = arg2;
        this.field2875.method1160(this);
        if (arg3) {
            for (int var7 = 0; var7 < 6; var7++) {
                method1403(var6, var7 + 34069, this.field2876, arg2, arg2, 32993, this.field2875.field2385, arg4[var7]);
            }
        } else {
            for (int var8 = 0; var8 < 6; var8++) {
                var6.glTexImage2D(var8 + 34069, 0, this.field2876, arg2, arg2, 0, 32993, this.field2875.field2385, IntBuffer.wrap(arg4[var8]));
            }
        }
        this.method1405(true);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)V")
    public final void method459(int arg0, int arg1, int arg2) {
        this.field2875.field2253.glFramebufferTexture2DEXT(36160, arg0, arg2, this.field2877, arg1);
        this.field811 = arg0;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "()V")
    public final void method419() {
        this.field2875.field2253.glFramebufferTexture2DEXT(36160, this.field811, 3553, 0, 0);
        this.field811 = -1;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lks;II)V")
    public class61(class173 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        opengl var4 = this.field2875.field2253;
        this.field812 = arg2;
        this.field2875.method1160(this);
        for (int var5 = 0; var5 < 6; var5++) {
            var4.glTexImage2D(var5 + 34069, 0, this.field2876, arg2, arg2, 0, 32993, this.field2875.field2385, (Buffer) null);
        }
        this.method1405(true);
    }
}
