import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class254 extends class233 {

    @OriginalMember(owner = "client!hp", name = "i", descriptor = "I")
    public int field3308;

    @OriginalMember(owner = "client!hp", name = "j", descriptor = "I")
    private int field3309;

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lh;IIZ[[I)V")
    public class254(class327 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var6 = this.field3052.field4363;
        this.field3308 = arg2;
        this.field3052.method2088(this);
        if (arg3) {
            for (int var7 = 0; var7 < 6; var7++) {
                method1505(var6, var7 + 34069, this.field3055, arg2, arg2, 32993, this.field3052.field4406, arg4[var7]);
            }
        } else {
            for (int var8 = 0; var8 < 6; var8++) {
                var6.glTexImage2D(var8 + 34069, 0, this.field3055, arg2, arg2, 0, 32993, this.field3052.field4406, IntBuffer.wrap(arg4[var8]));
            }
        }
        this.method1507(true);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(III)V")
    public final void method1627(int arg0, int arg1, int arg2) {
        this.field3052.field4363.glFramebufferTexture2DEXT(36160, arg0, arg2, this.field3059, arg1);
        this.field3309 = arg0;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "()V")
    public final void method878() {
        this.field3052.field4363.glFramebufferTexture2DEXT(36160, this.field3309, 3553, 0, 0);
        this.field3309 = -1;
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lh;IIZ[[BI)V")
    public class254(class327 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var7 = this.field3052.field4363;
        this.field3308 = arg2;
        this.field3052.method2088(this);
        for (int var8 = 0; var8 < 6; var8++) {
            var7.glTexImage2D(var8 + 34069, 0, this.field3055, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[var8]));
        }
        this.method1507(true);
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lh;II)V")
    public class254(class327 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        opengl var4 = this.field3052.field4363;
        this.field3308 = arg2;
        this.field3052.method2088(this);
        for (int var5 = 0; var5 < 6; var5++) {
            var4.glTexImage2D(var5 + 34069, 0, this.field3055, arg2, arg2, 0, 32993, this.field3052.field4406, (Buffer) null);
        }
        this.method1507(true);
    }
}
