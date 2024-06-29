import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class420 extends class89 implements class226 {

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
    private int field6205;

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lcg;ILjava/nio/ByteBuffer;Z)V")
    public class420(class393 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        super(arg0, 34962, arg2, arg3);
        this.field6205 = arg1;
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(Ltf;)V")
    public final void method1372(class464 arg0) {
        this.field1264.field5783.glColorPointer(arg0.field6837, arg0.field6836, this.field6205, (long) arg0.field6835);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ltf;)V")
    public final void method1369(class464 arg0) {
        this.field1264.field5783.glNormalPointer(arg0.field6836, this.field6205, (long) arg0.field6835);
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(Ltf;)V")
    public final void method1370(class464 arg0) {
        this.field1264.field5783.glTexCoordPointer(arg0.field6837, arg0.field6836, this.field6205, (long) arg0.field6835);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "()I")
    public final int method586() {
        return super.method586();
    }

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "(Ltf;)V")
    public final void method1373(class464 arg0) {
        this.field1264.field5783.glVertexPointer(arg0.field6837, arg0.field6836, this.field6205, (long) arg0.field6835);
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lcg;I[BIZ)V")
    public class420(class393 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field6205 = arg1;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "()V")
    public final void method587() {
        this.field1264.method2463(this);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I[BI)V")
    public final void method1371(int arg0, byte[] arg1, int arg2) {
        this.method588(arg1, arg2);
        this.field6205 = arg0;
    }
}
