import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class112 extends class121 implements class340 {

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
    private int field1543;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "()I")
    public final int method49() {
        return super.method49();
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(Lpa;)V")
    public final void method371(class352 arg0) {
        this.field1614.field2253.glColorPointer(arg0.field5137, arg0.field5138, this.field1543, (long) arg0.field5136);
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lks;ILjava/nio/ByteBuffer;Z)V")
    public class112(class173 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        super(arg0, 34962, arg2, arg3);
        this.field1543 = arg1;
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lks;I[BIZ)V")
    public class112(class173 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field1543 = arg1;
    }

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "(Lpa;)V")
    public final void method375(class352 arg0) {
        this.field1614.field2253.glVertexPointer(arg0.field5137, arg0.field5138, this.field1543, (long) arg0.field5136);
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I[BI)V")
    public final void method373(int arg0, byte[] arg1, int arg2) {
        this.method820(arg1, arg2);
        this.field1543 = arg0;
    }

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "(Lpa;)V")
    public final void method374(class352 arg0) {
        this.field1614.field2253.glTexCoordPointer(arg0.field5137, arg0.field5138, this.field1543, (long) arg0.field5136);
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "()V")
    public final void method52() {
        this.field1614.method1172(this);
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lpa;)V")
    public final void method372(class352 arg0) {
        this.field1614.field2253.glNormalPointer(arg0.field5138, this.field1543, (long) arg0.field5136);
    }
}
