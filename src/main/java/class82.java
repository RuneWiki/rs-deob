import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class82 extends class297 implements class415 {

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    private int field982;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(Lig;)V", line = 5)
    public final void method47(class205 arg0) {
        this.field3955.field4363.glColorPointer(arg0.field2496, arg0.field2494, this.field982, (long) arg0.field2493);
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(Lig;)V", line = 8)
    public final void method45(class205 arg0) {
        this.field3955.field4363.glVertexPointer(arg0.field2496, arg0.field2494, this.field982, (long) arg0.field2493);
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lh;ILjava/nio/ByteBuffer;Z)V", line = 11)
    public class82(class327 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        super(arg0, 34962, arg2, arg3);
        this.field982 = arg1;
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(Lig;)V", line = 15)
    public final void method44(class205 arg0) {
        this.field3955.field4363.glTexCoordPointer(arg0.field2496, arg0.field2494, this.field982, (long) arg0.field2493);
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "()V", line = 18)
    public final void method513() {
        this.field3955.method2052(this);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I[BI)V", line = 21)
    public final void method46(int arg0, byte[] arg1, int arg2) {
        this.method1885(arg1, arg2);
        this.field982 = arg0;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lig;)V", line = 25)
    public final void method48(class205 arg0) {
        this.field3955.field4363.glNormalPointer(arg0.field2494, this.field982, (long) arg0.field2493);
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lh;I[BIZ)V", line = 28)
    public class82(class327 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field982 = arg1;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "()I", line = 33)
    public final int method49() {
        return super.method49();
    }
}
