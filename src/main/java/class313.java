import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class313 extends class210 implements class454 {

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    private int field4618;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "()I", line = 4)
    public final int method34() {
        return super.method34();
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(Lwi;)V", line = 7)
    public final void method32(class273 arg0) {
        this.field2997.field1918.glVertexPointer(arg0.field3965, arg0.field3962, this.field4618, (long) arg0.field3963);
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(Lwi;)V", line = 10)
    public final void method37(class273 arg0) {
        this.field2997.field1918.glNormalPointer(arg0.field3962, this.field4618, (long) arg0.field3963);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I[BI)V", line = 13)
    public final void method35(int arg0, byte[] arg1, int arg2) {
        this.method1488(arg1, arg2);
        this.field4618 = arg0;
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Lig;I[BIZ)V", line = 18)
    public class313(class132 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field4618 = arg1;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "()V", line = 22)
    public final void method1487() {
        this.field2997.method974(this);
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Lig;ILjava/nio/ByteBuffer;Z)V", line = 26)
    public class313(class132 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        super(arg0, 34962, arg2, arg3);
        this.field4618 = arg1;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lwi;)V", line = 30)
    public final void method36(class273 arg0) {
        this.field2997.field1918.glColorPointer(arg0.field3965, arg0.field3962, this.field4618, (long) arg0.field3963);
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(Lwi;)V", line = 33)
    public final void method33(class273 arg0) {
        this.field2997.field1918.glTexCoordPointer(arg0.field3965, arg0.field3962, this.field4618, (long) arg0.field3963);
    }
}
