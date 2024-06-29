import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class420 extends class151 implements class226 {

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    private int field6066;

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lhj;ILjava/nio/ByteBuffer;)V")
    public class420(class338 arg0, int arg1, ByteBuffer arg2) {
        super(arg0, arg2);
        this.field6066 = arg1;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(Lln;)V")
    public final void method1431(class212 arg0) {
        this.field2150.field4607.glColorPointer(arg0.field2840, arg0.field2839, this.field6066, this.field2151.position(arg0.field2838));
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lhj;I[BI)V")
    public class420(class338 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field6066 = arg1;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "()I")
    public final int method641() {
        return 0;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I[BI)V")
    public final void method1433(int arg0, byte[] arg1, int arg2) {
        this.method1027(arg1, arg2);
        this.field6066 = arg0;
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(Lln;)V")
    public final void method1432(class212 arg0) {
        this.field2150.field4607.glNormalPointer(arg0.field2839, this.field6066, this.field2151.position(arg0.field2838));
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lln;)V")
    public final void method1430(class212 arg0) {
        this.field2150.field4607.glVertexPointer(arg0.field2840, arg0.field2839, this.field6066, this.field2151.position(arg0.field2838));
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(Lln;)V")
    public final void method1434(class212 arg0) {
        this.field2150.field4607.glTexCoordPointer(arg0.field2840, arg0.field2839, this.field6066, this.field2151.position(arg0.field2838));
    }
}
