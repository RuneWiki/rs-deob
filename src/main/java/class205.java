import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class205 extends class202 {

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4050;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)[B")
    public final byte[] method1335(int arg0) {
        int var2 = -86 / ((arg0 - 83) / 43);
        byte[] var3 = new byte[this.field4050.capacity()];
        this.field4050.position(0);
        this.field4050.get(var3);
        return var3;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I[B)V")
    public final void method1331(int arg0, byte[] arg1) {
        this.field4050 = ByteBuffer.allocateDirect(arg1.length);
        this.field4050.position(0);
        if (arg0 == -103) {
            this.field4050.put(arg1);
        }
    }
}
