import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class403 extends class82 implements class49 {

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    private int field5880;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(Lbb;)V")
    public final void method229(class135 arg0) {
        this.field905.field4697.glNormalPointer(arg0.field1729, this.field5880, this.field906.position(arg0.field1727));
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILbb;)V")
    public final void method226(int arg0, class135 arg1) {
        this.field905.field4697.glClientActiveTexture(arg0 + 33984);
        this.field905.field4697.glTexCoordPointer(arg1.field1728, arg1.field1729, this.field5880, this.field906.position(arg1.field1727));
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "()I")
    public final int method225() {
        return 0;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lql;ILjava/nio/ByteBuffer;)V")
    public class403(class346 arg0, int arg1, ByteBuffer arg2) {
        super(arg0, arg2);
        this.field5880 = arg1;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(Lbb;)V")
    public final void method228(class135 arg0) {
        this.field905.field4697.glVertexPointer(arg0.field1728, arg0.field1729, this.field5880, this.field906.position(arg0.field1727));
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lql;I[BI)V")
    public class403(class346 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field5880 = arg1;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I[BI)V")
    public final void method227(int arg0, byte[] arg1, int arg2) {
        this.method448(arg1, arg2);
        this.field5880 = arg0;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lbb;)V")
    public final void method224(class135 arg0) {
        this.field905.field4697.glColorPointer(arg0.field1728, arg0.field1729, this.field5880, this.field906.position(arg0.field1727));
    }
}
