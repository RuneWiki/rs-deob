import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class266 extends class223 {

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public int field3921;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    private int field3920;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)V", line = 11)
    public final void method1724(int arg0, int arg1, int arg2) {
        this.field3152.field4741.glFramebufferTexture2DEXT(36160, arg0, arg2, this.field3154, arg1);
        this.field3920 = arg0;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lih;IIZ[[I)V", line = 15)
    public class266(class330 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var6 = this.field3152.field4741;
        this.field3921 = arg2;
        this.field3152.method2186(this);
        if (arg3) {
            for (int var7 = 0; var7 < 6; var7++) {
                method1383(var6, var7 + 34069, this.field3151, arg2, arg2, 32993, this.field3152.field4869, arg4[var7]);
            }
        } else {
            for (int var8 = 0; var8 < 6; var8++) {
                var6.glTexImage2D(var8 + 34069, 0, this.field3151, arg2, arg2, 0, 32993, this.field3152.field4869, IntBuffer.wrap(arg4[var8]));
            }
        }
        this.method1390(true);
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lih;IIZ[[BI)V", line = 45)
    public class266(class330 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var7 = this.field3152.field4741;
        this.field3921 = arg2;
        this.field3152.method2186(this);
        for (int var8 = 0; var8 < 6; var8++) {
            var7.glTexImage2D(var8 + 34069, 0, this.field3151, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[var8]));
        }
        this.method1390(true);
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lih;II)V", line = 62)
    public class266(class330 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        opengl var4 = this.field3152.field4741;
        this.field3921 = arg2;
        this.field3152.method2186(this);
        for (int var5 = 0; var5 < 6; var5++) {
            var4.glTexImage2D(var5 + 34069, 0, this.field3151, arg2, arg2, 0, 32993, this.field3152.field4869, (Buffer) null);
        }
        this.method1390(true);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "()V", line = 77)
    public final void method570() {
        this.field3152.field4741.glFramebufferTexture2DEXT(36160, this.field3920, 3553, 0, 0);
        this.field3920 = -1;
    }
}
