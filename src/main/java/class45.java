import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class45 extends class394 implements class340 {

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    private int field590;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(Lpa;)V")
    public final void method371(class352 arg0) {
        this.field5733.field2253.glColorPointer(arg0.field5137, arg0.field5138, this.field590, this.field5732.position(arg0.field5136));
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lpa;)V")
    public final void method372(class352 arg0) {
        this.field5733.field2253.glNormalPointer(arg0.field5138, this.field590, this.field5732.position(arg0.field5136));
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lks;I[BI)V")
    public class45(class173 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field590 = arg1;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[BI)V")
    public final void method373(int arg0, byte[] arg1, int arg2) {
        this.method2472(arg1, arg2);
        this.field590 = arg0;
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(Lpa;)V")
    public final void method374(class352 arg0) {
        this.field5733.field2253.glTexCoordPointer(arg0.field5137, arg0.field5138, this.field590, this.field5732.position(arg0.field5136));
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lks;ILjava/nio/ByteBuffer;)V")
    public class45(class173 arg0, int arg1, ByteBuffer arg2) {
        super(arg0, arg2);
        this.field590 = arg1;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "()I")
    public final int method49() {
        return 0;
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(Lpa;)V")
    public final void method375(class352 arg0) {
        this.field5733.field2253.glVertexPointer(arg0.field5137, arg0.field5138, this.field590, this.field5732.position(arg0.field5136));
    }
}
