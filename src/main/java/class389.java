import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class389 extends class136 implements class416 {

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
    private int field5564;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lfh;)V")
    public final void method1299(class228 arg0) {
        this.field1638.field3342.glNormalPointer(arg0.field3164, this.field5564, this.field1639.position(arg0.field3166));
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lic;ILjava/nio/ByteBuffer;)V")
    public class389(class246 arg0, int arg1, ByteBuffer arg2) {
        super(arg0, arg2);
        this.field5564 = arg1;
    }

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "(Lfh;)V")
    public final void method1301(class228 arg0) {
        this.field1638.field3342.glColorPointer(arg0.field3165, arg0.field3164, this.field5564, this.field1639.position(arg0.field3166));
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(Lfh;)V")
    public final void method1300(class228 arg0) {
        this.field1638.field3342.glVertexPointer(arg0.field3165, arg0.field3164, this.field5564, this.field1639.position(arg0.field3166));
    }

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(Lfh;)V")
    public final void method1298(class228 arg0) {
        this.field1638.field3342.glTexCoordPointer(arg0.field3165, arg0.field3164, this.field5564, this.field1639.position(arg0.field3166));
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "()I")
    public final int method747() {
        return 0;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I[BI)V")
    public final void method1297(int arg0, byte[] arg1, int arg2) {
        this.method644(arg1, arg2);
        this.field5564 = arg0;
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lic;I[BI)V")
    public class389(class246 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field5564 = arg1;
    }
}
