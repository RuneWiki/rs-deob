import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class180 extends class321 {

    @OriginalMember(owner = "client!fq", name = "i", descriptor = "I")
    public int field2553;

    @OriginalMember(owner = "client!fq", name = "j", descriptor = "I")
    private int field2554;

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lmm;II)V")
    public class180(class357 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        opengl var4 = this.field4370.field4794;
        this.field2553 = arg2;
        this.field4370.method2180(this);
        for (int var5 = 0; var5 < 6; var5++) {
            var4.glTexImage2D(var5 + 34069, 0, this.field4364, arg2, arg2, 0, 32993, this.field4370.field4862, (Buffer) null);
        }
        this.method1954(true);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "()V")
    public final void method377() {
        this.field4370.field4794.glFramebufferTexture2DEXT(36160, this.field2554, 3553, 0, 0);
        this.field2554 = -1;
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lmm;IIZ[[I)V")
    public class180(class357 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var6 = this.field4370.field4794;
        this.field2553 = arg2;
        this.field4370.method2180(this);
        if (arg3) {
            for (int var7 = 0; var7 < 6; var7++) {
                method1958(var6, var7 + 34069, this.field4364, arg2, arg2, 32993, this.field4370.field4862, arg4[var7]);
            }
        } else {
            for (int var8 = 0; var8 < 6; var8++) {
                var6.glTexImage2D(var8 + 34069, 0, this.field4364, arg2, arg2, 0, 32993, this.field4370.field4862, IntBuffer.wrap(arg4[var8]));
            }
        }
        this.method1954(true);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(III)V")
    public final void method1268(int arg0, int arg1, int arg2) {
        this.field4370.field4794.glFramebufferTexture2DEXT(36160, arg0, arg2, this.field4365, arg1);
        this.field2554 = arg0;
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lmm;IIZ[[BI)V")
    public class180(class357 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var7 = this.field4370.field4794;
        this.field2553 = arg2;
        this.field4370.method2180(this);
        for (int var8 = 0; var8 < 6; var8++) {
            var7.glTexImage2D(var8 + 34069, 0, this.field4364, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[var8]));
        }
        this.method1954(true);
    }
}
