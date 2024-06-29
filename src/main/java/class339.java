import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class339 extends class22 {

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4652;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I[B)V", line = 6)
    public final void method287(int arg0, byte[] arg1) {
        this.field4652 = ByteBuffer.allocateDirect(arg1.length);
        this.field4652.position(0);
        if (arg0 != 200) {
            this.method284(-110);
        }
        this.field4652.put(arg1);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)[B", line = 21)
    public final byte[] method284(int arg0) {
        if (arg0 != -17912) {
            this.field4652 = (ByteBuffer) null;
        }
        byte[] var2 = new byte[this.field4652.capacity()];
        this.field4652.position(0);
        this.field4652.get(var2);
        return var2;
    }
}
