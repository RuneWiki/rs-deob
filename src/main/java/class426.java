import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class426 extends class371 implements class74 {

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    private int field5778;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "(Lkj;)V")
    public final void method485(class366 arg0) {
        this.field5069.field4604.glNormalPointer(arg0.field5039, this.field5778, this.field5070.position(arg0.field5040));
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "()I")
    public final int method125() {
        return 0;
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lbf;ILjava/nio/ByteBuffer;)V")
    public class426(class344 arg0, int arg1, ByteBuffer arg2) {
        super(arg0, arg2);
        this.field5778 = arg1;
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(Lkj;)V")
    public final void method483(class366 arg0) {
        this.field5069.field4604.glTexCoordPointer(arg0.field5042, arg0.field5039, this.field5778, this.field5070.position(arg0.field5040));
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lbf;I[BI)V")
    public class426(class344 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field5778 = arg1;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lkj;)V")
    public final void method481(class366 arg0) {
        this.field5069.field4604.glVertexPointer(arg0.field5042, arg0.field5039, this.field5778, this.field5070.position(arg0.field5040));
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(Lkj;)V")
    public final void method482(class366 arg0) {
        this.field5069.field4604.glColorPointer(arg0.field5042, arg0.field5039, this.field5778, this.field5070.position(arg0.field5040));
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I[BI)V")
    public final void method484(int arg0, byte[] arg1, int arg2) {
        this.method2285(arg1, arg2);
        this.field5778 = arg0;
    }
}
