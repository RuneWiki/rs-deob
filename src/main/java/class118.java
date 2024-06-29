import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class118 extends class340 implements class122 {

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    private int field1680;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(Lq;)V", line = 4)
    public final void method813(class246 arg0) {
        this.field4655.field3184.glVertexPointer(arg0.field3471, arg0.field3473, this.field1680, (long) arg0.field3472);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I[BI)V", line = 7)
    public final void method814(int arg0, byte[] arg1, int arg2) {
        this.method2164(arg1, arg2);
        this.field1680 = arg0;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Ltb;ILjava/nio/ByteBuffer;Z)V", line = 11)
    public class118(class227 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        super(arg0, 34962, arg2, arg3);
        this.field1680 = arg1;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Ltb;I[BIZ)V", line = 15)
    public class118(class227 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field1680 = arg1;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "()V", line = 20)
    public final void method389() {
        this.field4655.method1568(this);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lq;)V", line = 23)
    public final void method815(class246 arg0) {
        this.field4655.field3184.glColorPointer(arg0.field3471, arg0.field3473, this.field1680, (long) arg0.field3472);
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(Lq;)V", line = 26)
    public final void method816(class246 arg0) {
        this.field4655.field3184.glNormalPointer(arg0.field3473, this.field1680, (long) arg0.field3472);
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(Lq;)V", line = 30)
    public final void method817(class246 arg0) {
        this.field4655.field3184.glTexCoordPointer(arg0.field3471, arg0.field3473, this.field1680, (long) arg0.field3472);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "()I", line = 33)
    public final int method392() {
        return super.method392();
    }
}
