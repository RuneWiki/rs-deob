import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class13 extends class305 implements class182 {

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    private int field145;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(Lam;)V", line = 4)
    public final void method85(class287 arg0) {
        this.field4361.field4741.glColorPointer(arg0.field4170, arg0.field4174, this.field145, this.field4362.position(arg0.field4171));
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lih;ILjava/nio/ByteBuffer;)V", line = 7)
    public class13(class330 arg0, int arg1, ByteBuffer arg2) {
        super(arg0, arg2);
        this.field145 = arg1;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(Lam;)V", line = 11)
    public final void method86(class287 arg0) {
        this.field4361.field4741.glTexCoordPointer(arg0.field4170, arg0.field4174, this.field145, this.field4362.position(arg0.field4171));
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I[BI)V", line = 14)
    public final void method87(int arg0, byte[] arg1, int arg2) {
        this.method1921(arg1, arg2);
        this.field145 = arg0;
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lih;I[BI)V", line = 19)
    public class13(class330 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field145 = arg1;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lam;)V", line = 24)
    public final void method88(class287 arg0) {
        this.field4361.field4741.glVertexPointer(arg0.field4170, arg0.field4174, this.field145, this.field4362.position(arg0.field4171));
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(Lam;)V", line = 27)
    public final void method89(class287 arg0) {
        this.field4361.field4741.glNormalPointer(arg0.field4174, this.field145, this.field4362.position(arg0.field4171));
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "()I", line = 30)
    public final int method90() {
        return 0;
    }
}
