import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class416 extends class133 {

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
    public int field6021;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
    private int field6022;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)V")
    public final void method2656(int arg0, int arg1, int arg2) {
        this.field1844.field4607.glFramebufferTexture2DEXT(36160, arg0, arg2, this.field1842, arg1);
        this.field6022 = arg0;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lhj;IIZ[[I)V")
    public class416(class338 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var6 = this.field1844.field4607;
        this.field6021 = arg2;
        this.field1844.method2165(this);
        if (arg3) {
            for (int var7 = 0; var7 < 6; var7++) {
                method913(var6, var7 + 34069, this.field1845, arg2, arg2, 32993, this.field1844.field4655, arg4[var7]);
            }
        } else {
            for (int var8 = 0; var8 < 6; var8++) {
                var6.glTexImage2D(var8 + 34069, 0, this.field1845, arg2, arg2, 0, 32993, this.field1844.field4655, IntBuffer.wrap(arg4[var8]));
            }
        }
        this.method915(true);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "()V")
    public final void method333() {
        this.field1844.field4607.glFramebufferTexture2DEXT(36160, this.field6022, 3553, 0, 0);
        this.field6022 = -1;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lhj;II)V")
    public class416(class338 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        opengl var4 = this.field1844.field4607;
        this.field6021 = arg2;
        this.field1844.method2165(this);
        for (int var5 = 0; var5 < 6; var5++) {
            var4.glTexImage2D(var5 + 34069, 0, this.field1845, arg2, arg2, 0, 32993, this.field1844.field4655, (Buffer) null);
        }
        this.method915(true);
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lhj;IIZ[[BI)V")
    public class416(class338 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var7 = this.field1844.field4607;
        this.field6021 = arg2;
        this.field1844.method2165(this);
        for (int var8 = 0; var8 < 6; var8++) {
            var7.glTexImage2D(var8 + 34069, 0, this.field1845, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[var8]));
        }
        this.method915(true);
    }
}
