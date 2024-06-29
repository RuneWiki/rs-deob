import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class125 extends class438 implements class101 {

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    private int field1711;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(Ljt;)V")
    public final void method113(class377 arg0) {
        this.field6185.field3648.glColorPointer(arg0.field5613, arg0.field5611, this.field1711, (long) arg0.field5609);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I[BI)V")
    public final void method115(int arg0, byte[] arg1, int arg2) {
        this.method2550(arg1, arg2);
        this.field1711 = arg0;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lnm;I[BIZ)V")
    public class125(class254 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field1711 = arg1;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "()I")
    public final int method114() {
        return super.method114();
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "()V")
    public final void method871() {
        this.field6185.method1661(this);
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(Ljt;)V")
    public final void method112(class377 arg0) {
        this.field6185.field3648.glVertexPointer(arg0.field5613, arg0.field5611, this.field1711, (long) arg0.field5609);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ljt;)V")
    public final void method116(class377 arg0) {
        this.field6185.field3648.glTexCoordPointer(arg0.field5613, arg0.field5611, this.field1711, (long) arg0.field5609);
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lnm;ILjava/nio/ByteBuffer;Z)V")
    public class125(class254 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        super(arg0, 34962, arg2, arg3);
        this.field1711 = arg1;
    }

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "(Ljt;)V")
    public final void method111(class377 arg0) {
        this.field6185.field3648.glNormalPointer(arg0.field5611, this.field1711, (long) arg0.field5609);
    }
}
