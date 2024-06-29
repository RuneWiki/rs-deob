import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class9 extends class95 implements class415 {

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    private int field123;

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lh;ILjava/nio/ByteBuffer;)V", line = 5)
    public class9(class327 arg0, int arg1, ByteBuffer arg2) {
        super(arg0, arg2);
        this.field123 = arg1;
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(Lig;)V", line = 9)
    public final void method44(class205 arg0) {
        this.field1114.field4363.glTexCoordPointer(arg0.field2496, arg0.field2494, this.field123, this.field1115.position(arg0.field2493));
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(Lig;)V", line = 12)
    public final void method45(class205 arg0) {
        this.field1114.field4363.glVertexPointer(arg0.field2496, arg0.field2494, this.field123, this.field1115.position(arg0.field2493));
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I[BI)V", line = 15)
    public final void method46(int arg0, byte[] arg1, int arg2) {
        this.method593(arg1, arg2);
        this.field123 = arg0;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(Lig;)V", line = 19)
    public final void method47(class205 arg0) {
        this.field1114.field4363.glColorPointer(arg0.field2496, arg0.field2494, this.field123, this.field1115.position(arg0.field2493));
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lig;)V", line = 22)
    public final void method48(class205 arg0) {
        this.field1114.field4363.glNormalPointer(arg0.field2494, this.field123, this.field1115.position(arg0.field2493));
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lh;I[BI)V", line = 26)
    public class9(class327 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field123 = arg1;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "()I", line = 30)
    public final int method49() {
        return 0;
    }
}
