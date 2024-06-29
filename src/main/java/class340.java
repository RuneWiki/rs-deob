import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public abstract class class340 {

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "Ltb;")
    public class227 field4655;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    private int field4653;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    private int field4656;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "Z")
    private boolean field4657;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    private int field4654;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "[I")
    private static int[] field4658 = new int[1];

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "([BI)V", line = 13)
    public final void method2164(byte[] arg0, int arg1) {
        this.method389();
        if (arg1 > this.field4656) {
            this.field4655.field3184.glBufferDataARB(this.field4653, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.field4657 ? 35040 : 35044);
            this.field4655.field3195 += arg1 - this.field4656;
            this.field4656 = arg1;
        } else {
            this.field4655.field3184.glBufferSubDataARB(this.field4653, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
        }
    }

    @OriginalMember(owner = "client!hj", name = "finalize", descriptor = "()V", line = 27)
    protected final void finalize() throws Throwable {
        this.field4655.method1539(this.field4654, this.field4656);
        super.finalize();
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Ltb;I[BIZ)V", line = 37)
    public class340(class227 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field4655 = arg0;
        this.field4653 = arg1;
        this.field4656 = arg3;
        this.field4657 = arg4;
        opengl var6 = arg0.field3184;
        var6.glGenBuffersARB(1, field4658, 0);
        this.field4654 = field4658[0];
        this.method389();
        var6.glBufferDataARB(arg1, this.field4656, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.field4656), this.field4657 ? 35040 : 35044);
        this.field4655.field3195 += this.field4656;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "()I", line = 55)
    public int method392() {
        return this.field4654;
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Ltb;ILjava/nio/ByteBuffer;Z)V", line = 57)
    public class340(class227 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        this.field4655 = arg0;
        this.field4653 = arg1;
        this.field4656 = arg2.limit();
        this.field4657 = arg3;
        opengl var5 = arg0.field3184;
        var5.glGenBuffersARB(1, field4658, 0);
        this.field4654 = field4658[0];
        this.method389();
        var5.glBufferDataARB(arg1, this.field4656, arg2, this.field4657 ? 35040 : 35044);
        this.field4655.field3195 += this.field4656;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "()V")
    public abstract void method389();
}
