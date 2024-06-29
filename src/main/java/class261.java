import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class261 extends class86 implements class49 {

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "I")
    private int field3567;

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lql;ILjava/nio/ByteBuffer;Z)V", line = 4)
    public class261(class346 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        super(arg0, 34962, arg2, arg3);
        this.field3567 = arg1;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "()I", line = 8)
    public final int method225() {
        return super.method225();
    }

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "(Lbb;)V", line = 11)
    public final void method229(class135 arg0) {
        this.field959.field4697.glNormalPointer(arg0.field1729, this.field3567, (long) arg0.field1727);
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(Lbb;)V", line = 15)
    public final void method228(class135 arg0) {
        this.field959.field4697.glVertexPointer(arg0.field1728, arg0.field1729, this.field3567, (long) arg0.field1727);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ILbb;)V", line = 19)
    public final void method226(int arg0, class135 arg1) {
        this.field959.field4697.glClientActiveTexture(arg0 + 33984);
        this.field959.field4697.glTexCoordPointer(arg1.field1728, arg1.field1729, this.field3567, (long) arg1.field1727);
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "()V", line = 23)
    public final void method469() {
        this.field959.method2046(this);
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lql;I[BIZ)V", line = 26)
    public class261(class346 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field3567 = arg1;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I[BI)V", line = 30)
    public final void method227(int arg0, byte[] arg1, int arg2) {
        this.method470(arg1, arg2);
        this.field3567 = arg0;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lbb;)V", line = 34)
    public final void method224(class135 arg0) {
        this.field959.field4697.glColorPointer(arg0.field1728, arg0.field1729, this.field3567, (long) arg0.field1727);
    }
}
