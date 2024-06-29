import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class45 extends class381 implements class171 {

    @OriginalMember(owner = "client!lp", name = "g", descriptor = "I")
    private int field705;

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "(Lfm;)V", line = 6)
    public final void method462(class170 arg0) {
        this.field5239.field557.glColorPointer(arg0.field2461, arg0.field2463, this.field705, (long) arg0.field2462);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lfm;)V", line = 9)
    public final void method463(class170 arg0) {
        this.field5239.field557.glTexCoordPointer(arg0.field2461, arg0.field2463, this.field705, (long) arg0.field2462);
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lfu;I[BIZ)V", line = 12)
    public class45(class42 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field705 = arg1;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "()I", line = 16)
    public final int method464() {
        return super.method464();
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lfu;ILjava/nio/ByteBuffer;Z)V", line = 19)
    public class45(class42 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        super(arg0, 34962, arg2, arg3);
        this.field705 = arg1;
    }

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "(Lfm;)V", line = 23)
    public final void method465(class170 arg0) {
        this.field5239.field557.glNormalPointer(arg0.field2463, this.field705, (long) arg0.field2462);
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(Lfm;)V", line = 26)
    public final void method466(class170 arg0) {
        this.field5239.field557.glVertexPointer(arg0.field2461, arg0.field2463, this.field705, (long) arg0.field2462);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I[BI)V", line = 29)
    public final void method467(int arg0, byte[] arg1, int arg2) {
        this.method2323(arg1, arg2);
        this.field705 = arg0;
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "()V", line = 33)
    public final void method468() {
        this.field5239.method411(this);
    }
}
