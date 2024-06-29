import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class6 extends class159 implements class371 {

    @OriginalMember(owner = "client!to", name = "c", descriptor = "I")
    private int field85;

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(Lqd;)V", line = 4)
    public final void method81(class259 arg0) {
        this.field2525.field1156.glColorPointer(arg0.field4186, arg0.field4187, this.field85, this.field2526.position(arg0.field4184));
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(Lqd;)V", line = 7)
    public final void method82(class259 arg0) {
        this.field2525.field1156.glTexCoordPointer(arg0.field4186, arg0.field4187, this.field85, this.field2526.position(arg0.field4184));
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I[BI)V", line = 10)
    public final void method83(int arg0, byte[] arg1, int arg2) {
        this.method1114(arg1, arg2);
        this.field85 = arg0;
    }

    @OriginalMember(owner = "client!to", name = "d", descriptor = "(Lqd;)V", line = 14)
    public final void method84(class259 arg0) {
        this.field2525.field1156.glNormalPointer(arg0.field4187, this.field85, this.field2526.position(arg0.field4184));
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "()I", line = 17)
    public final int method85() {
        return 0;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lqd;)V", line = 20)
    public final void method86(class259 arg0) {
        this.field2525.field1156.glVertexPointer(arg0.field4186, arg0.field4187, this.field85, this.field2526.position(arg0.field4184));
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lsq;I[BI)V", line = 24)
    public class6(class96 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field85 = arg1;
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lsq;ILjava/nio/ByteBuffer;)V", line = 28)
    public class6(class96 arg0, int arg1, ByteBuffer arg2) {
        super(arg0, arg2);
        this.field85 = arg1;
    }
}
