import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class10 extends class127 {

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
    public int field177;

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "I")
    private int field176;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(III)V", line = 7)
    public final void method151(int arg0, int arg1, int arg2) {
        this.field1787.field3184.glFramebufferTexture2DEXT(36160, arg0, arg2, this.field1788, arg1);
        this.field176 = arg0;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "()V", line = 12)
    public final void method152() {
        this.field1787.field3184.glFramebufferTexture2DEXT(36160, this.field176, 3553, 0, 0);
        this.field176 = -1;
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Ltb;II)V", line = 16)
    public class10(class227 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        opengl var4 = this.field1787.field3184;
        this.field177 = arg2;
        this.field1787.method1559(this);
        for (int var5 = 0; var5 < 6; var5++) {
            var4.glTexImage2D(var5 + 34069, 0, this.field1790, arg2, arg2, 0, 32993, this.field1787.field3239, (Buffer) null);
        }
        this.method868(true);
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Ltb;IIZ[[I)V", line = 32)
    public class10(class227 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var6 = this.field1787.field3184;
        this.field177 = arg2;
        this.field1787.method1559(this);
        if (arg3) {
            for (int var7 = 0; var7 < 6; var7++) {
                method870(var6, var7 + 34069, this.field1790, arg2, arg2, 32993, this.field1787.field3239, arg4[var7]);
            }
        } else {
            for (int var8 = 0; var8 < 6; var8++) {
                var6.glTexImage2D(var8 + 34069, 0, this.field1790, arg2, arg2, 0, 32993, this.field1787.field3239, IntBuffer.wrap(arg4[var8]));
            }
        }
        this.method868(true);
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Ltb;IIZ[[BI)V", line = 62)
    public class10(class227 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var7 = this.field1787.field3184;
        this.field177 = arg2;
        this.field1787.method1559(this);
        for (int var8 = 0; var8 < 6; var8++) {
            var7.glTexImage2D(var8 + 34069, 0, this.field1790, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[var8]));
        }
        this.method868(true);
    }
}
