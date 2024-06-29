import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class80 extends class230 implements class254 {

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    private int field901;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I[BI)V")
    public final void method444(int arg0, byte[] arg1, int arg2) {
        this.method1473(arg1, arg2);
        this.field901 = arg0;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "()I")
    public final int method380() {
        return super.method380();
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lpo;I[BIZ)V")
    public class80(class332 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field901 = arg1;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lpo;ILjava/nio/ByteBuffer;Z)V")
    public class80(class332 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        super(arg0, 34962, arg2, arg3);
        this.field901 = arg1;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "()V")
    public final void method383() {
        this.field3122.method2055(this);
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(Lpe;)V")
    public final void method445(class363 arg0) {
        this.field3122.field4752.glNormalPointer(arg0.field5288, this.field901, (long) arg0.field5287);
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(Lpe;)V")
    public final void method446(class363 arg0) {
        this.field3122.field4752.glColorPointer(arg0.field5290, arg0.field5288, this.field901, (long) arg0.field5287);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lpe;)V")
    public final void method447(class363 arg0) {
        this.field3122.field4752.glVertexPointer(arg0.field5290, arg0.field5288, this.field901, (long) arg0.field5287);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILpe;)V")
    public final void method448(int arg0, class363 arg1) {
        this.field3122.field4752.glClientActiveTexture(arg0 + 33984);
        this.field3122.field4752.glTexCoordPointer(arg1.field5290, arg1.field5288, this.field901, (long) arg1.field5287);
    }
}
