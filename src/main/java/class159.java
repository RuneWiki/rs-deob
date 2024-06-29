import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class159 extends class300 {

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2584;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I[B)V", line = 7)
    public final void method1130(int arg0, byte[] arg1) {
        int var3 = -18 / ((arg0 + 39) / 38);
        this.field2584 = ByteBuffer.allocateDirect(arg1.length);
        this.field2584.position(0);
        this.field2584.put(arg1);
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)[B", line = 18)
    public final byte[] method1131(byte arg0) {
        int var2 = 59 % ((-arg0 - 27) / 58);
        byte[] var3 = new byte[this.field2584.capacity()];
        this.field2584.position(0);
        this.field2584.get(var3);
        return var3;
    }
}
