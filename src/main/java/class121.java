import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class121 extends class68 implements class182 {

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    private int field1620;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "(Lam;)V", line = 5)
    public final void method85(class287 arg0) {
        this.field948.field4741.glColorPointer(arg0.field4170, arg0.field4174, this.field1620, (long) arg0.field4171);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "()I", line = 8)
    public final int method90() {
        return super.method90();
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(Lam;)V", line = 11)
    public final void method89(class287 arg0) {
        this.field948.field4741.glNormalPointer(arg0.field4174, this.field1620, (long) arg0.field4171);
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "()V", line = 14)
    public final void method437() {
        this.field948.method2035(this);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lam;)V", line = 17)
    public final void method88(class287 arg0) {
        this.field948.field4741.glVertexPointer(arg0.field4170, arg0.field4174, this.field1620, (long) arg0.field4171);
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lih;I[BIZ)V", line = 21)
    public class121(class330 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field1620 = arg1;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lih;ILjava/nio/ByteBuffer;Z)V", line = 25)
    public class121(class330 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        super(arg0, 34962, arg2, arg3);
        this.field1620 = arg1;
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(Lam;)V", line = 29)
    public final void method86(class287 arg0) {
        this.field948.field4741.glTexCoordPointer(arg0.field4170, arg0.field4174, this.field1620, (long) arg0.field4171);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I[BI)V", line = 32)
    public final void method87(int arg0, byte[] arg1, int arg2) {
        this.method438(arg1, arg2);
        this.field1620 = arg0;
    }
}
