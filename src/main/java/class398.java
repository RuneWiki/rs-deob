import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class398 extends class16 implements class307 {

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    private int field5691;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "()I", line = 4)
    public final int method461() {
        return 0;
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(Lhf;)V", line = 7)
    public final void method1544(class224 arg0) {
        this.field193.field1927.glVertexPointer(arg0.field3140, arg0.field3142, this.field5691, this.field192.position(arg0.field3141));
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lhf;)V", line = 10)
    public final void method1545(class224 arg0) {
        this.field193.field1927.glNormalPointer(arg0.field3142, this.field5691, this.field192.position(arg0.field3141));
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Lao;I[BI)V", line = 13)
    public class398(class157 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field5691 = arg1;
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(Lhf;)V", line = 18)
    public final void method1549(class224 arg0) {
        this.field193.field1927.glTexCoordPointer(arg0.field3140, arg0.field3142, this.field5691, this.field192.position(arg0.field3141));
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I[BI)V", line = 21)
    public final void method1547(int arg0, byte[] arg1, int arg2) {
        this.method109(arg1, arg2);
        this.field5691 = arg0;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(Lhf;)V", line = 26)
    public final void method1546(class224 arg0) {
        this.field193.field1927.glColorPointer(arg0.field3140, arg0.field3142, this.field5691, this.field192.position(arg0.field3141));
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Lao;ILjava/nio/ByteBuffer;)V", line = 29)
    public class398(class157 arg0, int arg1, ByteBuffer arg2) {
        super(arg0, arg2);
        this.field5691 = arg1;
    }
}
