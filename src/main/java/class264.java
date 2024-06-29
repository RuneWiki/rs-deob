import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class264 extends class115 {

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4182;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B[B)V", line = 5)
    public final void method742(byte arg0, byte[] arg1) {
        if (arg0 > 89) {
            this.field4182 = ByteBuffer.allocateDirect(arg1.length);
            this.field4182.position(0);
            this.field4182.put(arg1);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)[B", line = 22)
    public final byte[] method745(boolean arg0) {
        byte[] var2 = new byte[this.field4182.capacity()];
        if (arg0) {
            return (byte[]) null;
        } else {
            this.field4182.position(0);
            this.field4182.get(var2);
            return var2;
        }
    }
}
