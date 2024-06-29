import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class133 extends class73 implements class378 {

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "I")
    private int field1746;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I[BI)V")
    public final void method837(int arg0, byte[] arg1, int arg2) {
        this.method435(arg1, arg2);
        this.field1746 = arg0;
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "(Lga;)V")
    public final void method838(class254 arg0) {
        this.field900.field4445.glColorPointer(arg0.field3725, arg0.field3727, this.field1746, (long) arg0.field3724);
    }

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "(Lga;)V")
    public final void method839(class254 arg0) {
        this.field900.field4445.glVertexPointer(arg0.field3725, arg0.field3727, this.field1746, (long) arg0.field3724);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "()I")
    public final int method434() {
        return super.method434();
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lmi;ILjava/nio/ByteBuffer;Z)V")
    public class133(class315 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        super(arg0, 34962, arg2, arg3);
        this.field1746 = arg1;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lga;)V")
    public final void method840(class254 arg0) {
        this.field900.field4445.glNormalPointer(arg0.field3727, this.field1746, (long) arg0.field3724);
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "()V")
    public final void method433() {
        this.field900.method1983(this);
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lmi;I[BIZ)V")
    public class133(class315 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field1746 = arg1;
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(Lga;)V")
    public final void method841(class254 arg0) {
        this.field900.field4445.glTexCoordPointer(arg0.field3725, arg0.field3727, this.field1746, (long) arg0.field3724);
    }
}
