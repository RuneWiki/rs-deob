import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ve")
public class class198 extends class146 {

    @OriginalMember(owner = "ve", name = "l", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3779;

    @OriginalMember(owner = "ve", name = "a", descriptor = "(B[B)V")
    public final void method1022(byte arg0, byte[] arg1) {
        this.field3779 = ByteBuffer.allocateDirect(arg1.length);
        this.field3779.position(0);
        int var3 = 76 / ((47 - arg0) / 52);
        this.field3779.put(arg1);
    }

    @OriginalMember(owner = "ve", name = "b", descriptor = "(B)[B")
    public final byte[] method1026(byte arg0) {
        byte[] var2 = new byte[this.field3779.capacity()];
        if (arg0 < 104) {
            this.method1022((byte) -90, null);
        }
        this.field3779.position(0);
        this.field3779.get(var2);
        return var2;
    }
}
