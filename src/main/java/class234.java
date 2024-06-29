import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class234 extends class404 {

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    public int field3452;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
    private int field3453;

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lig;IIZ[[BI)V")
    public class234(class132 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var7 = this.field5661.field1918;
        this.field3452 = arg2;
        this.field5661.method888(this);
        for (int var8 = 0; var8 < 6; var8++) {
            var7.glTexImage2D(var8 + 34069, 0, this.field5662, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[var8]));
        }
        this.method2524(true);
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lig;II)V")
    public class234(class132 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        opengl var4 = this.field5661.field1918;
        this.field3452 = arg2;
        this.field5661.method888(this);
        for (int var5 = 0; var5 < 6; var5++) {
            var4.glTexImage2D(var5 + 34069, 0, this.field5662, arg2, arg2, 0, 32993, this.field5661.field2033, (Buffer) null);
        }
        this.method2524(true);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(III)V")
    public final void method1616(int arg0, int arg1, int arg2) {
        this.field5661.field1918.glFramebufferTexture2DEXT(36160, arg0, arg2, this.field5660, arg1);
        this.field3453 = arg0;
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lig;IIZ[[I)V")
    public class234(class132 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var6 = this.field5661.field1918;
        this.field3452 = arg2;
        this.field5661.method888(this);
        if (arg3) {
            for (int var7 = 0; var7 < 6; var7++) {
                method2529(var6, var7 + 34069, this.field5662, arg2, arg2, 32993, this.field5661.field2033, arg4[var7]);
            }
        } else {
            for (int var8 = 0; var8 < 6; var8++) {
                var6.glTexImage2D(var8 + 34069, 0, this.field5662, arg2, arg2, 0, 32993, this.field5661.field2033, IntBuffer.wrap(arg4[var8]));
            }
        }
        this.method2524(true);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "()V")
    public final void method434() {
        this.field5661.field1918.glFramebufferTexture2DEXT(36160, this.field3453, 3553, 0, 0);
        this.field3453 = -1;
    }
}
