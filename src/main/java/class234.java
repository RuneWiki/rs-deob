import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class234 extends class353 implements class307 {

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
    private int field3288;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "(Lhf;)V", line = 4)
    public final void method1544(class224 arg0) {
        this.field4981.field1927.glVertexPointer(arg0.field3140, arg0.field3142, this.field3288, (long) arg0.field3141);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lhf;)V", line = 7)
    public final void method1545(class224 arg0) {
        this.field4981.field1927.glNormalPointer(arg0.field3142, this.field3288, (long) arg0.field3141);
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lao;ILjava/nio/ByteBuffer;Z)V", line = 10)
    public class234(class157 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        super(arg0, 34962, arg2, arg3);
        this.field3288 = arg1;
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(Lhf;)V", line = 14)
    public final void method1546(class224 arg0) {
        this.field4981.field1927.glColorPointer(arg0.field3140, arg0.field3142, this.field3288, (long) arg0.field3141);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I[BI)V", line = 17)
    public final void method1547(int arg0, byte[] arg1, int arg2) {
        this.method2249(arg1, arg2);
        this.field3288 = arg0;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "()I", line = 21)
    public final int method461() {
        return super.method461();
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lao;I[BIZ)V", line = 25)
    public class234(class157 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field3288 = arg1;
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "()V", line = 29)
    public final void method1548() {
        this.field4981.method980(this);
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "(Lhf;)V", line = 33)
    public final void method1549(class224 arg0) {
        this.field4981.field1927.glTexCoordPointer(arg0.field3140, arg0.field3142, this.field3288, (long) arg0.field3141);
    }
}
