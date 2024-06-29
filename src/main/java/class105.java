import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class105 extends class14 {

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2433;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)[B")
    public final byte[] method117(byte arg0) {
        if (arg0 <= 119) {
            this.field2433 = null;
        }
        byte[] var2 = new byte[this.field2433.capacity()];
        this.field2433.position(0);
        this.field2433.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[B)V")
    public final void method116(int arg0, byte[] arg1) {
        if (arg0 != 21370) {
            this.method117((byte) 88);
        }
        this.field2433 = ByteBuffer.allocateDirect(arg1.length);
        this.field2433.position(0);
        this.field2433.put(arg1);
    }
}
