import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class150 extends class378 implements class50 {

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    private int field2051;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(Lgm;)V", line = 4)
    public final void method351(class336 arg0) {
        this.field5497.field3634.glNormalPointer(arg0.field4852, this.field2051, this.field5496.position(arg0.field4851));
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "()I", line = 7)
    public final int method139() {
        return 0;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I[BI)V", line = 10)
    public final void method354(int arg0, byte[] arg1, int arg2) {
        this.method2449(arg1, arg2);
        this.field2051 = arg0;
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lnf;I[BI)V", line = 14)
    public class150(class256 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field2051 = arg1;
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(Lgm;)V", line = 19)
    public final void method352(class336 arg0) {
        this.field5497.field3634.glTexCoordPointer(arg0.field4850, arg0.field4852, this.field2051, this.field5496.position(arg0.field4851));
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lnf;ILjava/nio/ByteBuffer;)V", line = 22)
    public class150(class256 arg0, int arg1, ByteBuffer arg2) {
        super(arg0, arg2);
        this.field2051 = arg1;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lgm;)V", line = 26)
    public final void method350(class336 arg0) {
        this.field5497.field3634.glVertexPointer(arg0.field4850, arg0.field4852, this.field2051, this.field5496.position(arg0.field4851));
    }

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "(Lgm;)V", line = 29)
    public final void method353(class336 arg0) {
        this.field5497.field3634.glColorPointer(arg0.field4850, arg0.field4852, this.field2051, this.field5496.position(arg0.field4851));
    }
}
