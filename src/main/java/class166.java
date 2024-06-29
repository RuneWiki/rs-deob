import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class166 extends class67 implements class233 {

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    private int field2481;

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lge;I[BI)V", line = 4)
    public class166(class104 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field2481 = arg1;
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lge;ILjava/nio/ByteBuffer;)V", line = 8)
    public class166(class104 arg0, int arg1, ByteBuffer arg2) {
        super(arg0, arg2);
        this.field2481 = arg1;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "()I", line = 12)
    public final int method978() {
        return 0;
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(Ljm;)V", line = 15)
    public final void method1275(class160 arg0) {
        this.field1118.field1604.glColorPointer(arg0.field2430, arg0.field2429, this.field2481, this.field1117.position(arg0.field2432));
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "(Ljm;)V", line = 18)
    public final void method1276(class160 arg0) {
        this.field1118.field1604.glVertexPointer(arg0.field2430, arg0.field2429, this.field2481, this.field1117.position(arg0.field2432));
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I[BI)V", line = 22)
    public final void method1277(int arg0, byte[] arg1, int arg2) {
        this.method507(arg1, arg2);
        this.field2481 = arg0;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILjm;)V", line = 26)
    public final void method1278(int arg0, class160 arg1) {
        this.field1118.field1604.glClientActiveTexture(arg0 + 33984);
        this.field1118.field1604.glTexCoordPointer(arg1.field2430, arg1.field2429, this.field2481, this.field1117.position(arg1.field2432));
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Ljm;)V", line = 30)
    public final void method1279(class160 arg0) {
        this.field1118.field1604.glNormalPointer(arg0.field2429, this.field2481, this.field1117.position(arg0.field2432));
    }
}
