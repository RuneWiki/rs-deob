import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class179 extends class76 {

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3111;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)[B")
    public final byte[] method565(byte arg0) {
        if (arg0 != 35) {
            this.method565((byte) 49);
        }
        byte[] var2 = new byte[this.field3111.capacity()];
        this.field3111.position(0);
        this.field3111.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([BB)V")
    public final void method567(byte[] arg0, byte arg1) {
        this.field3111 = ByteBuffer.allocateDirect(arg0.length);
        int var3 = -71 / ((-arg1 - 15) / 58);
        this.field3111.position(0);
        this.field3111.put(arg0);
    }
}
