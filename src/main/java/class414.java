import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class414 extends class195 {

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public int field6003;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    private int field6004;

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lge;IIZ[[I)V")
    public class414(class104 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var6 = this.field2858.field1604;
        this.field6003 = arg2;
        this.field2858.method929(this);
        if (arg3) {
            for (int var7 = 0; var7 < 6; var7++) {
                method1496(var6, var7 + 34069, this.field2862, arg2, arg2, 32993, this.field2858.field1709, arg4[var7]);
            }
        } else {
            for (int var8 = 0; var8 < 6; var8++) {
                var6.glTexImage2D(var8 + 34069, 0, this.field2862, arg2, arg2, 0, 32993, this.field2858.field1709, IntBuffer.wrap(arg4[var8]));
            }
        }
        this.method1499(true);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)V")
    public final void method2595(int arg0, int arg1, int arg2) {
        this.field2858.field1604.glFramebufferTexture2DEXT(36160, arg0, arg2, this.field2859, arg1);
        this.field6004 = arg0;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "()V")
    public final void method658() {
        this.field2858.field1604.glFramebufferTexture2DEXT(36160, this.field6004, 3553, 0, 0);
        this.field6004 = -1;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lge;II)V")
    public class414(class104 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        opengl var4 = this.field2858.field1604;
        this.field6003 = arg2;
        this.field2858.method929(this);
        for (int var5 = 0; var5 < 6; var5++) {
            var4.glTexImage2D(var5 + 34069, 0, this.field2862, arg2, arg2, 0, 32993, this.field2858.field1709, (Buffer) null);
        }
        this.method1499(true);
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lge;IIZ[[BI)V")
    public class414(class104 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var7 = this.field2858.field1604;
        this.field6003 = arg2;
        this.field2858.method929(this);
        for (int var8 = 0; var8 < 6; var8++) {
            var7.glTexImage2D(var8 + 34069, 0, this.field2862, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[var8]));
        }
        this.method1499(true);
    }
}
