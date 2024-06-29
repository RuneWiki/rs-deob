import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class457 extends class384 implements class378 {

    @OriginalMember(owner = "client!no", name = "c", descriptor = "I")
    private int field6418;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(Lga;)V")
    public final void method841(class254 arg0) {
        this.field5466.field4445.glTexCoordPointer(arg0.field3725, arg0.field3727, this.field6418, this.field5465.position(arg0.field3724));
    }

    @OriginalMember(owner = "client!no", name = "d", descriptor = "(Lga;)V")
    public final void method839(class254 arg0) {
        this.field5466.field4445.glVertexPointer(arg0.field3725, arg0.field3727, this.field6418, this.field5465.position(arg0.field3724));
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(Lga;)V")
    public final void method838(class254 arg0) {
        this.field5466.field4445.glColorPointer(arg0.field3725, arg0.field3727, this.field6418, this.field5465.position(arg0.field3724));
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lga;)V")
    public final void method840(class254 arg0) {
        this.field5466.field4445.glNormalPointer(arg0.field3727, this.field6418, this.field5465.position(arg0.field3724));
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lmi;I[BI)V")
    public class457(class315 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field6418 = arg1;
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lmi;ILjava/nio/ByteBuffer;)V")
    public class457(class315 arg0, int arg1, ByteBuffer arg2) {
        super(arg0, arg2);
        this.field6418 = arg1;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "()I")
    public final int method434() {
        return 0;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I[BI)V")
    public final void method837(int arg0, byte[] arg1, int arg2) {
        this.method2315(arg1, arg2);
        this.field6418 = arg0;
    }
}
