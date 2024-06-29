import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class74 extends class306 implements class205 {

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    private int field1061;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(Lvl;)V")
    public final void method572(class376 arg0) {
        this.field4157.field4794.glVertexPointer(arg0.field5220, arg0.field5224, this.field1061, (long) arg0.field5222);
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(Lvl;)V")
    public final void method573(class376 arg0) {
        this.field4157.field4794.glNormalPointer(arg0.field5224, this.field1061, (long) arg0.field5222);
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lmm;I[BIZ)V")
    public class74(class357 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field1061 = arg1;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "()V")
    public final void method574() {
        this.field4157.method2202(this);
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lmm;ILjava/nio/ByteBuffer;Z)V")
    public class74(class357 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        super(arg0, 34962, arg2, arg3);
        this.field1061 = arg1;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lvl;)V")
    public final void method575(class376 arg0) {
        this.field4157.field4794.glColorPointer(arg0.field5220, arg0.field5224, this.field1061, (long) arg0.field5222);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I[BI)V")
    public final void method576(int arg0, byte[] arg1, int arg2) {
        this.method1847(arg1, arg2);
        this.field1061 = arg0;
    }

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "(Lvl;)V")
    public final void method577(class376 arg0) {
        this.field4157.field4794.glTexCoordPointer(arg0.field5220, arg0.field5224, this.field1061, (long) arg0.field5222);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "()I")
    public final int method578() {
        return super.method578();
    }
}
