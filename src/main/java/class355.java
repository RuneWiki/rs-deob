import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class355 extends class61 implements class74 {

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    private int field4907;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "()I")
    public final int method125() {
        return super.method125();
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "()V")
    public final void method124() {
        this.field813.method1962(this);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lkj;)V")
    public final void method481(class366 arg0) {
        this.field813.field4604.glVertexPointer(arg0.field5042, arg0.field5039, this.field4907, (long) arg0.field5040);
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lbf;I[BIZ)V")
    public class355(class344 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field4907 = arg1;
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(Lkj;)V")
    public final void method483(class366 arg0) {
        this.field813.field4604.glTexCoordPointer(arg0.field5042, arg0.field5039, this.field4907, (long) arg0.field5040);
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(Lkj;)V")
    public final void method485(class366 arg0) {
        this.field813.field4604.glNormalPointer(arg0.field5039, this.field4907, (long) arg0.field5040);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I[BI)V")
    public final void method484(int arg0, byte[] arg1, int arg2) {
        this.method424(arg1, arg2);
        this.field4907 = arg0;
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lbf;ILjava/nio/ByteBuffer;Z)V")
    public class355(class344 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        super(arg0, 34962, arg2, arg3);
        this.field4907 = arg1;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(Lkj;)V")
    public final void method482(class366 arg0) {
        this.field813.field4604.glColorPointer(arg0.field5042, arg0.field5039, this.field4907, (long) arg0.field5040);
    }
}
