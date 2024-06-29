import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class267 extends class160 {

    @OriginalMember(owner = "client!of", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4791;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)[B")
    public final byte[] method1108(byte arg0) {
        byte[] var2 = new byte[this.field4791.capacity()];
        this.field4791.position(0);
        this.field4791.get(var2);
        if (arg0 > -13) {
            this.field4791 = (ByteBuffer) null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "([BB)V")
    public final void method1106(byte[] arg0, byte arg1) {
        this.field4791 = ByteBuffer.allocateDirect(arg0.length);
        int var3 = -16 / ((arg1 - 42) / 54);
        this.field4791.position(0);
        this.field4791.put(arg0);
    }
}
