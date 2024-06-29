import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class177 extends class253 implements class371 {

    @OriginalMember(owner = "client!hs", name = "g", descriptor = "I")
    private int field2915;

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "(Lqd;)V")
    public final void method84(class259 arg0) {
        this.field4117.field1156.glNormalPointer(arg0.field4187, this.field2915, (long) arg0.field4184);
    }

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "(Lqd;)V")
    public final void method81(class259 arg0) {
        this.field4117.field1156.glColorPointer(arg0.field4186, arg0.field4187, this.field2915, (long) arg0.field4184);
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lsq;I[BIZ)V")
    public class177(class96 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field2915 = arg1;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "()I")
    public final int method85() {
        return super.method85();
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lsq;ILjava/nio/ByteBuffer;Z)V")
    public class177(class96 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        super(arg0, 34962, arg2, arg3);
        this.field2915 = arg1;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I[BI)V")
    public final void method83(int arg0, byte[] arg1, int arg2) {
        this.method1754(arg1, arg2);
        this.field2915 = arg0;
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(Lqd;)V")
    public final void method82(class259 arg0) {
        this.field4117.field1156.glTexCoordPointer(arg0.field4186, arg0.field4187, this.field2915, (long) arg0.field4184);
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "()V")
    public final void method1224() {
        this.field4117.method627(this);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lqd;)V")
    public final void method86(class259 arg0) {
        this.field4117.field1156.glVertexPointer(arg0.field4186, arg0.field4187, this.field2915, (long) arg0.field4184);
    }
}
