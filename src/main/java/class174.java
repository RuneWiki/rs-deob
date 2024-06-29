import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class174 extends class76 {

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2484;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "([BB)V")
    public final void method505(byte[] arg0, byte arg1) {
        this.field2484 = ByteBuffer.allocateDirect(arg0.length);
        this.field2484.position(0);
        this.field2484.put(arg0);
        int var3 = -95 / ((arg1 - 8) / 35);
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)[B")
    public final byte[] method507(int arg0) {
        byte[] var2 = new byte[this.field2484.capacity()];
        this.field2484.position(arg0);
        this.field2484.get(var2);
        return var2;
    }
}
