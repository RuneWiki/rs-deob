import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class315 extends class426 implements class205 {

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    private int field4263;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I[BI)V", line = 4)
    public final void method576(int arg0, byte[] arg1, int arg2) {
        this.method2626(arg1, arg2);
        this.field4263 = arg0;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lmm;ILjava/nio/ByteBuffer;)V", line = 9)
    public class315(class357 arg0, int arg1, ByteBuffer arg2) {
        super(arg0, arg2);
        this.field4263 = arg1;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lvl;)V", line = 13)
    public final void method575(class376 arg0) {
        this.field5918.field4794.glColorPointer(arg0.field5220, arg0.field5224, this.field4263, this.field5919.position(arg0.field5222));
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "(Lvl;)V", line = 16)
    public final void method577(class376 arg0) {
        this.field5918.field4794.glTexCoordPointer(arg0.field5220, arg0.field5224, this.field4263, this.field5919.position(arg0.field5222));
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "()I", line = 20)
    public final int method578() {
        return 0;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(Lvl;)V", line = 23)
    public final void method572(class376 arg0) {
        this.field5918.field4794.glVertexPointer(arg0.field5220, arg0.field5224, this.field4263, this.field5919.position(arg0.field5222));
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lmm;I[BI)V", line = 26)
    public class315(class357 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field4263 = arg1;
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(Lvl;)V", line = 30)
    public final void method573(class376 arg0) {
        this.field5918.field4794.glNormalPointer(arg0.field5224, this.field4263, this.field5919.position(arg0.field5222));
    }
}
