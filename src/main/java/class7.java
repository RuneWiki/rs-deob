import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class7 extends class193 implements class454 {

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    private int field96;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(Lwi;)V")
    public final void method32(class273 arg0) {
        this.field2789.field1918.glVertexPointer(arg0.field3965, arg0.field3962, this.field96, this.field2788.position(arg0.field3963));
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(Lwi;)V")
    public final void method33(class273 arg0) {
        this.field2789.field1918.glTexCoordPointer(arg0.field3965, arg0.field3962, this.field96, this.field2788.position(arg0.field3963));
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "()I")
    public final int method34() {
        return 0;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I[BI)V")
    public final void method35(int arg0, byte[] arg1, int arg2) {
        this.method1386(arg1, arg2);
        this.field96 = arg0;
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lig;I[BI)V")
    public class7(class132 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field96 = arg1;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lwi;)V")
    public final void method36(class273 arg0) {
        this.field2789.field1918.glColorPointer(arg0.field3965, arg0.field3962, this.field96, this.field2788.position(arg0.field3963));
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(Lwi;)V")
    public final void method37(class273 arg0) {
        this.field2789.field1918.glNormalPointer(arg0.field3962, this.field96, this.field2788.position(arg0.field3963));
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lig;ILjava/nio/ByteBuffer;)V")
    public class7(class132 arg0, int arg1, ByteBuffer arg2) {
        super(arg0, arg2);
        this.field96 = arg1;
    }
}
