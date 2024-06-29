import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class449 extends class163 implements class233 {

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
    private int field6530;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "()V", line = 4)
    public final void method1267() {
        this.field2460.method872(this);
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(Ljm;)V", line = 7)
    public final void method1275(class160 arg0) {
        this.field2460.field1604.glColorPointer(arg0.field2430, arg0.field2429, this.field6530, (long) arg0.field2432);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "()I", line = 10)
    public final int method978() {
        return super.method978();
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lge;I[BIZ)V", line = 13)
    public class449(class104 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field6530 = arg1;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILjm;)V", line = 17)
    public final void method1278(int arg0, class160 arg1) {
        this.field2460.field1604.glClientActiveTexture(arg0 + 33984);
        this.field2460.field1604.glTexCoordPointer(arg1.field2430, arg1.field2429, this.field6530, (long) arg1.field2432);
    }

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "(Ljm;)V", line = 21)
    public final void method1276(class160 arg0) {
        this.field2460.field1604.glVertexPointer(arg0.field2430, arg0.field2429, this.field6530, (long) arg0.field2432);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ljm;)V", line = 24)
    public final void method1279(class160 arg0) {
        this.field2460.field1604.glNormalPointer(arg0.field2429, this.field6530, (long) arg0.field2432);
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lge;ILjava/nio/ByteBuffer;Z)V", line = 28)
    public class449(class104 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        super(arg0, 34962, arg2, arg3);
        this.field6530 = arg1;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I[BI)V", line = 32)
    public final void method1277(int arg0, byte[] arg1, int arg2) {
        this.method1268(arg1, arg2);
        this.field6530 = arg0;
    }
}
