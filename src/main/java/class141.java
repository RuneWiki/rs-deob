import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class141 extends class344 {

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "I")
    public int field1801;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    private int field1800;

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lse;IIZ[[I)V", line = 7)
    public class141(class282 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var6 = this.field5130.field4140;
        this.field1801 = arg2;
        this.field5130.method1915(this);
        if (arg3) {
            for (int var7 = 0; var7 < 6; var7++) {
                method2276(var6, var7 + 34069, this.field5131, arg2, arg2, 32993, this.field5130.field4256, arg4[var7]);
            }
        } else {
            for (int var8 = 0; var8 < 6; var8++) {
                var6.glTexImage2D(var8 + 34069, 0, this.field5131, arg2, arg2, 0, 32993, this.field5130.field4256, IntBuffer.wrap(arg4[var8]));
            }
        }
        this.method2277(true);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)V", line = 38)
    public final void method982(int arg0, int arg1, int arg2) {
        this.field5130.field4140.glFramebufferTexture2DEXT(36160, arg0, arg2, this.field5127, arg1);
        this.field1800 = arg0;
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lse;IIZ[[BI)V", line = 42)
    public class141(class282 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var7 = this.field5130.field4140;
        this.field1801 = arg2;
        this.field5130.method1915(this);
        for (int var8 = 0; var8 < 6; var8++) {
            var7.glTexImage2D(var8 + 34069, 0, this.field5131, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[var8]));
        }
        this.method2277(true);
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lse;II)V", line = 61)
    public class141(class282 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        opengl var4 = this.field5130.field4140;
        this.field1801 = arg2;
        this.field5130.method1915(this);
        for (int var5 = 0; var5 < 6; var5++) {
            var4.glTexImage2D(var5 + 34069, 0, this.field5131, arg2, arg2, 0, 32993, this.field5130.field4256, (Buffer) null);
        }
        this.method2277(true);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "()V", line = 76)
    public final void method28() {
        this.field5130.field4140.glFramebufferTexture2DEXT(36160, this.field1800, 3553, 0, 0);
        this.field1800 = -1;
    }
}
