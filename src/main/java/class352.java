import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class352 extends class293 {

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
    public int field5430;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
    private int field5431;

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lsq;II)V", line = 5)
    public class352(class96 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        opengl var4 = this.field4690.field1156;
        this.field5430 = arg2;
        this.field4690.method688(this);
        for (int var5 = 0; var5 < 6; var5++) {
            var4.glTexImage2D(var5 + 34069, 0, this.field4696, arg2, arg2, 0, 32993, this.field4690.field1256, (Buffer) null);
        }
        this.method1980(true);
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lsq;IIZ[[I)V", line = 24)
    public class352(class96 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var6 = this.field4690.field1156;
        this.field5430 = arg2;
        this.field4690.method688(this);
        if (arg3) {
            for (int var7 = 0; var7 < 6; var7++) {
                method1971(var6, var7 + 34069, this.field4696, arg2, arg2, 32993, this.field4690.field1256, arg4[var7]);
            }
        } else {
            for (int var8 = 0; var8 < 6; var8++) {
                var6.glTexImage2D(var8 + 34069, 0, this.field4696, arg2, arg2, 0, 32993, this.field4690.field1256, IntBuffer.wrap(arg4[var8]));
            }
        }
        this.method1980(true);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "()V", line = 56)
    public final void method1824() {
        this.field4690.field1156.glFramebufferTexture2DEXT(36160, this.field5431, 3553, 0, 0);
        this.field5431 = -1;
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lsq;IIZ[[BI)V", line = 60)
    public class352(class96 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var7 = this.field4690.field1156;
        this.field5430 = arg2;
        this.field4690.method688(this);
        for (int var8 = 0; var8 < 6; var8++) {
            var7.glTexImage2D(var8 + 34069, 0, this.field4696, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[var8]));
        }
        this.method1980(true);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)V", line = 78)
    public final void method2295(int arg0, int arg1, int arg2) {
        this.field4690.field1156.glFramebufferTexture2DEXT(36160, arg0, arg2, this.field4692, arg1);
        this.field5431 = arg0;
    }
}
