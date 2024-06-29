import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class330 extends class61 {

    @OriginalMember(owner = "client!be", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field5284;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)[B", line = 8)
    public final byte[] method498(byte arg0) {
        byte[] var2 = new byte[this.field5284.capacity()];
        this.field5284.position(0);
        if (arg0 >= -55) {
            this.method498((byte) -47);
        }
        this.field5284.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([BI)V", line = 23)
    public final void method497(byte[] arg0, int arg1) {
        this.field5284 = ByteBuffer.allocateDirect(arg0.length);
        if (arg1 != 10) {
            this.method497((byte[]) null, 39);
        }
        this.field5284.position(0);
        this.field5284.put(arg0);
    }
}
