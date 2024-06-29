import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class159 extends class243 {

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2394;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)[B", line = 6)
    public final byte[] method1023(int arg0) {
        if (arg0 < 126) {
            this.field2394 = (ByteBuffer) null;
        }
        byte[] var2 = new byte[this.field2394.capacity()];
        this.field2394.position(0);
        this.field2394.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "([BB)V", line = 23)
    public final void method1024(byte[] arg0, byte arg1) {
        this.field2394 = ByteBuffer.allocateDirect(arg0.length);
        this.field2394.position(0);
        this.field2394.put(arg0);
        if (arg1 < 12) {
            this.field2394 = (ByteBuffer) null;
        }
    }
}
