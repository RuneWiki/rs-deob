import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class263 extends class199 implements class226 {

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    private int field4020;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "()I")
    public final int method586() {
        return 0;
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(Ltf;)V")
    public final void method1372(class464 arg0) {
        this.field3009.field5783.glColorPointer(arg0.field6837, arg0.field6836, this.field4020, this.field3008.position(arg0.field6835));
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ltf;)V")
    public final void method1369(class464 arg0) {
        this.field3009.field5783.glNormalPointer(arg0.field6836, this.field4020, this.field3008.position(arg0.field6835));
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lcg;I[BI)V")
    public class263(class393 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field4020 = arg1;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(Ltf;)V")
    public final void method1370(class464 arg0) {
        this.field3009.field5783.glTexCoordPointer(arg0.field6837, arg0.field6836, this.field4020, this.field3008.position(arg0.field6835));
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lcg;ILjava/nio/ByteBuffer;)V")
    public class263(class393 arg0, int arg1, ByteBuffer arg2) {
        super(arg0, arg2);
        this.field4020 = arg1;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I[BI)V")
    public final void method1371(int arg0, byte[] arg1, int arg2) {
        this.method1194(arg1, arg2);
        this.field4020 = arg0;
    }

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "(Ltf;)V")
    public final void method1373(class464 arg0) {
        this.field3009.field5783.glVertexPointer(arg0.field6837, arg0.field6836, this.field4020, this.field3008.position(arg0.field6835));
    }
}
