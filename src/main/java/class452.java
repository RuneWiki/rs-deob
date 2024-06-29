import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class452 extends class221 implements class50 {

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    private int field6588;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "()V")
    public final void method1289() {
        this.field2910.method1711(this);
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(Lgm;)V")
    public final void method353(class336 arg0) {
        this.field2910.field3634.glColorPointer(arg0.field4850, arg0.field4852, this.field6588, (long) arg0.field4851);
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(Lgm;)V")
    public final void method352(class336 arg0) {
        this.field2910.field3634.glTexCoordPointer(arg0.field4850, arg0.field4852, this.field6588, (long) arg0.field4851);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lgm;)V")
    public final void method350(class336 arg0) {
        this.field2910.field3634.glVertexPointer(arg0.field4850, arg0.field4852, this.field6588, (long) arg0.field4851);
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(Lgm;)V")
    public final void method351(class336 arg0) {
        this.field2910.field3634.glNormalPointer(arg0.field4852, this.field6588, (long) arg0.field4851);
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lnf;ILjava/nio/ByteBuffer;Z)V")
    public class452(class256 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        super(arg0, 34962, arg2, arg3);
        this.field6588 = arg1;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "()I")
    public final int method139() {
        return super.method139();
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lnf;I[BIZ)V")
    public class452(class256 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field6588 = arg1;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I[BI)V")
    public final void method354(int arg0, byte[] arg1, int arg2) {
        this.method1288(arg1, arg2);
        this.field6588 = arg0;
    }
}
