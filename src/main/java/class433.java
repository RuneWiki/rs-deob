import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class433 extends class50 {

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public int field6343;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    private int field6344;

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lql;IIZ[[I)V", line = 7)
    public class433(class346 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var6 = this.field482.field4697;
        this.field6343 = arg2;
        this.field482.method2032(this);
        if (arg3) {
            for (int var7 = 0; var7 < 6; var7++) {
                method231(var6, var7 + 34069, this.field481, arg2, arg2, 32993, this.field482.field4811, arg4[var7]);
            }
        } else {
            for (int var8 = 0; var8 < 6; var8++) {
                var6.glTexImage2D(var8 + 34069, 0, this.field481, arg2, arg2, 0, 32993, this.field482.field4811, IntBuffer.wrap(arg4[var8]));
            }
        }
        this.method242(true);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(III)V", line = 37)
    public final void method2680(int arg0, int arg1, int arg2) {
        this.field482.field4697.glFramebufferTexture2DEXT(36160, arg0, arg2, this.field486, arg1);
        this.field6344 = arg0;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lql;II)V", line = 43)
    public class433(class346 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        opengl var4 = this.field482.field4697;
        this.field6343 = arg2;
        this.field482.method2032(this);
        for (int var5 = 0; var5 < 6; var5++) {
            var4.glTexImage2D(var5 + 34069, 0, this.field481, arg2, arg2, 0, 32993, this.field482.field4811, (Buffer) null);
        }
        this.method242(true);
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lql;IIZ[[BI)V", line = 58)
    public class433(class346 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var7 = this.field482.field4697;
        this.field6343 = arg2;
        this.field482.method2032(this);
        for (int var8 = 0; var8 < 6; var8++) {
            var7.glTexImage2D(var8 + 34069, 0, this.field481, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[var8]));
        }
        this.method242(true);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "()V", line = 76)
    public final void method119() {
        this.field482.field4697.glFramebufferTexture2DEXT(36160, this.field6344, 3553, 0, 0);
        this.field6344 = -1;
    }
}
