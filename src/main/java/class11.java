import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class11 extends class434 implements class101 {

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
    private int field156;

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lnm;ILjava/nio/ByteBuffer;)V")
    public class11(class254 arg0, int arg1, ByteBuffer arg2) {
        super(arg0, arg2);
        this.field156 = arg1;
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lnm;I[BI)V")
    public class11(class254 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field156 = arg1;
    }

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "(Ljt;)V")
    public final void method111(class377 arg0) {
        this.field6162.field3648.glNormalPointer(arg0.field5611, this.field156, this.field6161.position(arg0.field5609));
    }

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "(Ljt;)V")
    public final void method112(class377 arg0) {
        this.field6162.field3648.glVertexPointer(arg0.field5613, arg0.field5611, this.field156, this.field6161.position(arg0.field5609));
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(Ljt;)V")
    public final void method113(class377 arg0) {
        this.field6162.field3648.glColorPointer(arg0.field5613, arg0.field5611, this.field156, this.field6161.position(arg0.field5609));
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "()I")
    public final int method114() {
        return 0;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I[BI)V")
    public final void method115(int arg0, byte[] arg1, int arg2) {
        this.method2538(arg1, arg2);
        this.field156 = arg0;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Ljt;)V")
    public final void method116(class377 arg0) {
        this.field6162.field3648.glTexCoordPointer(arg0.field5613, arg0.field5611, this.field156, this.field6161.position(arg0.field5609));
    }
}
