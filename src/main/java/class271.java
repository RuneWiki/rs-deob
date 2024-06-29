import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class271 extends class389 implements class203 {

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    private int field3647;

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lhd;ILjava/nio/ByteBuffer;)V")
    public class271(class17 arg0, int arg1, ByteBuffer arg2) {
        super(arg0, arg2);
        this.field3647 = arg1;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(Lrs;)V")
    public final void method822(class240 arg0) {
        this.field5465.field198.glVertexPointer(arg0.field3321, arg0.field3320, this.field3647, this.field5466.position(arg0.field3323));
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I[BI)V")
    public final void method821(int arg0, byte[] arg1, int arg2) {
        this.method2402(arg1, arg2);
        this.field3647 = arg0;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lrs;)V")
    public final void method826(class240 arg0) {
        this.field5465.field198.glColorPointer(arg0.field3321, arg0.field3320, this.field3647, this.field5466.position(arg0.field3323));
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lhd;I[BI)V")
    public class271(class17 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field3647 = arg1;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILrs;)V")
    public final void method823(int arg0, class240 arg1) {
        this.field5465.field198.glClientActiveTexture(arg0 + 33984);
        this.field5465.field198.glTexCoordPointer(arg1.field3321, arg1.field3320, this.field3647, this.field5466.position(arg1.field3323));
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "()I")
    public final int method353() {
        return 0;
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(Lrs;)V")
    public final void method824(class240 arg0) {
        this.field5465.field198.glNormalPointer(arg0.field3320, this.field3647, this.field5466.position(arg0.field3323));
    }
}
