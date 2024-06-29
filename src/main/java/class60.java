import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class60 extends class26 {

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public int field832;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    private int field831;

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lnm;IIZ[[I)V")
    public class60(class254 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var6 = this.field329.field3648;
        this.field832 = arg2;
        this.field329.method1653(this);
        if (arg3) {
            for (int var7 = 0; var7 < 6; var7++) {
                method224(var6, var7 + 34069, this.field331, arg2, arg2, 32993, this.field329.field3741, arg4[var7]);
            }
        } else {
            for (int var8 = 0; var8 < 6; var8++) {
                var6.glTexImage2D(var8 + 34069, 0, this.field331, arg2, arg2, 0, 32993, this.field329.field3741, IntBuffer.wrap(arg4[var8]));
            }
        }
        this.method228(true);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)V")
    public final void method468(int arg0, int arg1, int arg2) {
        this.field329.field3648.glFramebufferTexture2DEXT(36160, arg0, arg2, this.field327, arg1);
        this.field831 = arg0;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lnm;II)V")
    public class60(class254 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        opengl var4 = this.field329.field3648;
        this.field832 = arg2;
        this.field329.method1653(this);
        for (int var5 = 0; var5 < 6; var5++) {
            var4.glTexImage2D(var5 + 34069, 0, this.field331, arg2, arg2, 0, 32993, this.field329.field3741, (Buffer) null);
        }
        this.method228(true);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "()V")
    public final void method309() {
        this.field329.field3648.glFramebufferTexture2DEXT(36160, this.field831, 3553, 0, 0);
        this.field831 = -1;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lnm;IIZ[[BI)V")
    public class60(class254 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var7 = this.field329.field3648;
        this.field832 = arg2;
        this.field329.method1653(this);
        for (int var8 = 0; var8 < 6; var8++) {
            var7.glTexImage2D(var8 + 34069, 0, this.field331, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[var8]));
        }
        this.method228(true);
    }
}
