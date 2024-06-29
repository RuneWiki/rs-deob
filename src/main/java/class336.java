import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class336 extends class52 implements class89 {

    @OriginalMember(owner = "client!es", name = "c", descriptor = "I")
    private int field4975;

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lse;ILjava/nio/ByteBuffer;)V", line = 4)
    public class336(class282 arg0, int arg1, ByteBuffer arg2) {
        super(arg0, arg2);
        this.field4975 = arg1;
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lse;I[BI)V", line = 8)
    public class336(class282 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field4975 = arg1;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(I[BI)V", line = 12)
    public final void method714(int arg0, byte[] arg1, int arg2) {
        this.method382(arg1, arg2);
        this.field4975 = arg0;
    }

    @OriginalMember(owner = "client!es", name = "c", descriptor = "(Lkr;)V", line = 17)
    public final void method713(class26 arg0) {
        this.field813.field4140.glNormalPointer(arg0.field456, this.field4975, this.field812.position(arg0.field457));
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "()I", line = 20)
    public final int method282() {
        return 0;
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(Lkr;)V", line = 23)
    public final void method712(class26 arg0) {
        this.field813.field4140.glColorPointer(arg0.field454, arg0.field456, this.field4975, this.field812.position(arg0.field457));
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Lkr;)V", line = 27)
    public final void method711(class26 arg0) {
        this.field813.field4140.glVertexPointer(arg0.field454, arg0.field456, this.field4975, this.field812.position(arg0.field457));
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(ILkr;)V", line = 30)
    public final void method715(int arg0, class26 arg1) {
        this.field813.field4140.glClientActiveTexture(arg0 + 33984);
        this.field813.field4140.glTexCoordPointer(arg1.field454, arg1.field456, this.field4975, this.field812.position(arg1.field457));
    }
}
