import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class49 extends class58 implements class171 {

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    private int field733;

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lfu;I[BI)V")
    public class49(class42 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field733 = arg1;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lfm;)V")
    public final void method463(class170 arg0) {
        this.field841.field557.glTexCoordPointer(arg0.field2461, arg0.field2463, this.field733, this.field842.position(arg0.field2462));
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I[BI)V")
    public final void method467(int arg0, byte[] arg1, int arg2) {
        this.method525(arg1, arg2);
        this.field733 = arg0;
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(Lfm;)V")
    public final void method465(class170 arg0) {
        this.field841.field557.glNormalPointer(arg0.field2463, this.field733, this.field842.position(arg0.field2462));
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(Lfm;)V")
    public final void method466(class170 arg0) {
        this.field841.field557.glVertexPointer(arg0.field2461, arg0.field2463, this.field733, this.field842.position(arg0.field2462));
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lfu;ILjava/nio/ByteBuffer;)V")
    public class49(class42 arg0, int arg1, ByteBuffer arg2) {
        super(arg0, arg2);
        this.field733 = arg1;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "()I")
    public final int method464() {
        return 0;
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(Lfm;)V")
    public final void method462(class170 arg0) {
        this.field841.field557.glColorPointer(arg0.field2461, arg0.field2463, this.field733, this.field842.position(arg0.field2462));
    }
}
