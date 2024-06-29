import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class350 extends class265 implements class122 {

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    private int field4809;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "()I", line = 4)
    public final int method392() {
        return 0;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lq;)V", line = 7)
    public final void method815(class246 arg0) {
        this.field3689.field3184.glColorPointer(arg0.field3471, arg0.field3473, this.field4809, this.field3690.position(arg0.field3472));
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(Lq;)V", line = 11)
    public final void method816(class246 arg0) {
        this.field3689.field3184.glNormalPointer(arg0.field3473, this.field4809, this.field3690.position(arg0.field3472));
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Ltb;ILjava/nio/ByteBuffer;)V", line = 14)
    public class350(class227 arg0, int arg1, ByteBuffer arg2) {
        super(arg0, arg2);
        this.field4809 = arg1;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I[BI)V", line = 18)
    public final void method814(int arg0, byte[] arg1, int arg2) {
        this.method1729(arg1, arg2);
        this.field4809 = arg0;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(Lq;)V", line = 22)
    public final void method813(class246 arg0) {
        this.field3689.field3184.glVertexPointer(arg0.field3471, arg0.field3473, this.field4809, this.field3690.position(arg0.field3472));
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Ltb;I[BI)V", line = 25)
    public class350(class227 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field4809 = arg1;
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(Lq;)V", line = 29)
    public final void method817(class246 arg0) {
        this.field3689.field3184.glTexCoordPointer(arg0.field3471, arg0.field3473, this.field4809, this.field3690.position(arg0.field3472));
    }
}
