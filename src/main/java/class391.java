import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class391 extends class95 implements class226 {

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    private int field5741;

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lhj;ILjava/nio/ByteBuffer;Z)V", line = 4)
    public class391(class338 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        super(arg0, 34962, arg2, arg3);
        this.field5741 = arg1;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lhj;I[BIZ)V", line = 8)
    public class391(class338 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field5741 = arg1;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I[BI)V", line = 12)
    public final void method1433(int arg0, byte[] arg1, int arg2) {
        this.method643(arg1, arg2);
        this.field5741 = arg0;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lln;)V", line = 17)
    public final void method1430(class212 arg0) {
        this.field1411.field4607.glVertexPointer(arg0.field2840, arg0.field2839, this.field5741, (long) arg0.field2838);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "()I", line = 21)
    public final int method641() {
        return super.method641();
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(Lln;)V", line = 24)
    public final void method1434(class212 arg0) {
        this.field1411.field4607.glTexCoordPointer(arg0.field2840, arg0.field2839, this.field5741, (long) arg0.field2838);
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(Lln;)V", line = 27)
    public final void method1432(class212 arg0) {
        this.field1411.field4607.glNormalPointer(arg0.field2839, this.field5741, (long) arg0.field2838);
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(Lln;)V", line = 30)
    public final void method1431(class212 arg0) {
        this.field1411.field4607.glColorPointer(arg0.field2840, arg0.field2839, this.field5741, (long) arg0.field2838);
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "()V", line = 33)
    public final void method642() {
        this.field1411.method2148(this);
    }
}
