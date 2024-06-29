import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class98 extends class349 implements class203 {

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    private int field1407;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I[BI)V", line = 4)
    public final void method821(int arg0, byte[] arg1, int arg2) {
        this.method2203(arg1, arg2);
        this.field1407 = arg0;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "()I", line = 8)
    public final int method353() {
        return super.method353();
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(Lrs;)V", line = 11)
    public final void method822(class240 arg0) {
        this.field4727.field198.glVertexPointer(arg0.field3321, arg0.field3320, this.field1407, (long) arg0.field3323);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILrs;)V", line = 14)
    public final void method823(int arg0, class240 arg1) {
        this.field4727.field198.glClientActiveTexture(arg0 + 33984);
        this.field4727.field198.glTexCoordPointer(arg1.field3321, arg1.field3320, this.field1407, (long) arg1.field3323);
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(Lrs;)V", line = 18)
    public final void method824(class240 arg0) {
        this.field4727.field198.glNormalPointer(arg0.field3320, this.field1407, (long) arg0.field3323);
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "()V", line = 21)
    public final void method825() {
        this.field4727.method157(this);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lrs;)V", line = 24)
    public final void method826(class240 arg0) {
        this.field4727.field198.glColorPointer(arg0.field3321, arg0.field3320, this.field1407, (long) arg0.field3323);
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lhd;ILjava/nio/ByteBuffer;Z)V", line = 27)
    public class98(class17 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        super(arg0, 34962, arg2, arg3);
        this.field1407 = arg1;
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lhd;I[BIZ)V", line = 33)
    public class98(class17 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field1407 = arg1;
    }
}
