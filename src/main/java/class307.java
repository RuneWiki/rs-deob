import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class307 extends class37 implements class89 {

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    private int field4571;

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lse;I[BIZ)V")
    public class307(class282 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field4571 = arg1;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "()I")
    public final int method282() {
        return super.method282();
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I[BI)V")
    public final void method714(int arg0, byte[] arg1, int arg2) {
        this.method284(arg1, arg2);
        this.field4571 = arg0;
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lse;ILjava/nio/ByteBuffer;Z)V")
    public class307(class282 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        super(arg0, 34962, arg2, arg3);
        this.field4571 = arg1;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILkr;)V")
    public final void method715(int arg0, class26 arg1) {
        this.field560.field4140.glClientActiveTexture(arg0 + 33984);
        this.field560.field4140.glTexCoordPointer(arg1.field454, arg1.field456, this.field4571, (long) arg1.field457);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lkr;)V")
    public final void method711(class26 arg0) {
        this.field560.field4140.glVertexPointer(arg0.field454, arg0.field456, this.field4571, (long) arg0.field457);
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "()V")
    public final void method283() {
        this.field560.method1913(this);
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(Lkr;)V")
    public final void method712(class26 arg0) {
        this.field560.field4140.glColorPointer(arg0.field454, arg0.field456, this.field4571, (long) arg0.field457);
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(Lkr;)V")
    public final void method713(class26 arg0) {
        this.field560.field4140.glNormalPointer(arg0.field456, this.field4571, (long) arg0.field457);
    }
}
