import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class359 extends class5 {

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public int field5175;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    private int field5174;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)V", line = 5)
    public final void method2191(int arg0, int arg1, int arg2) {
        this.field55.field3342.glFramebufferTexture2DEXT(36160, arg0, arg2, this.field58, arg1);
        this.field5174 = arg0;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lic;IIZ[[I)V", line = 9)
    public class359(class246 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var6 = this.field55.field3342;
        this.field5175 = arg2;
        this.field55.method1379(this);
        if (arg3) {
            for (int var7 = 0; var7 < 6; var7++) {
                method44(var6, var7 + 34069, this.field53, arg2, arg2, 32993, this.field55.field3451, arg4[var7]);
            }
        } else {
            for (int var8 = 0; var8 < 6; var8++) {
                var6.glTexImage2D(var8 + 34069, 0, this.field53, arg2, arg2, 0, 32993, this.field55.field3451, IntBuffer.wrap(arg4[var8]));
            }
        }
        this.method46(true);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "()V", line = 41)
    public final void method47() {
        this.field55.field3342.glFramebufferTexture2DEXT(36160, this.field5174, 3553, 0, 0);
        this.field5174 = -1;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lic;II)V", line = 47)
    public class359(class246 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        opengl var4 = this.field55.field3342;
        this.field5175 = arg2;
        this.field55.method1379(this);
        for (int var5 = 0; var5 < 6; var5++) {
            var4.glTexImage2D(var5 + 34069, 0, this.field53, arg2, arg2, 0, 32993, this.field55.field3451, (Buffer) null);
        }
        this.method46(true);
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lic;IIZ[[BI)V", line = 62)
    public class359(class246 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var7 = this.field55.field3342;
        this.field5175 = arg2;
        this.field55.method1379(this);
        for (int var8 = 0; var8 < 6; var8++) {
            var7.glTexImage2D(var8 + 34069, 0, this.field53, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[var8]));
        }
        this.method46(true);
    }
}
