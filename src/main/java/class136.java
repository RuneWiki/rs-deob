import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class136 extends class123 {

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2394;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)[B")
    public final byte[] method894(byte arg0) {
        byte[] var2 = new byte[this.field2394.capacity()];
        if (arg0 > 0) {
            this.method894((byte) -87);
        }
        this.field2394.position(0);
        this.field2394.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[B)V")
    public final void method895(int arg0, byte[] arg1) {
        this.field2394 = ByteBuffer.allocateDirect(arg1.length);
        int var3 = 5 / ((arg0 + 10) / 45);
        this.field2394.position(0);
        this.field2394.put(arg1);
    }
}
