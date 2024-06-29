import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class420 extends class66 {

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field5822;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)[B", line = 6)
    public final byte[] method624(byte arg0) {
        byte[] var2 = new byte[this.field5822.capacity()];
        this.field5822.position(0);
        int var3 = -25 % ((38 - arg0) / 61);
        this.field5822.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "([BB)V", line = 22)
    public final void method621(byte[] arg0, byte arg1) {
        this.field5822 = ByteBuffer.allocateDirect(arg0.length);
        if (arg1 == 125) {
            this.field5822.position(0);
            this.field5822.put(arg0);
        }
    }
}
