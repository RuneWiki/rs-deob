import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class164 extends class210 {

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2530;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "([BZ)V")
    public final void method1181(byte[] arg0, boolean arg1) {
        this.field2530 = ByteBuffer.allocateDirect(arg0.length);
        this.field2530.position(0);
        if (!arg1) {
            this.field2530.put(arg0);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)[B")
    public final byte[] method1182(int arg0) {
        byte[] var2 = new byte[this.field2530.capacity()];
        this.field2530.position(0);
        if (arg0 != 11635) {
            this.method1182(15);
        }
        this.field2530.get(var2);
        return var2;
    }
}
