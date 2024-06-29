import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class117 extends class129 {

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2740;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)[B")
    public final byte[] method924(int arg0) {
        byte[] var2 = new byte[this.field2740.capacity()];
        this.field2740.position(0);
        this.field2740.get(var2);
        int var3 = 101 % ((arg0 - 15) / 50);
        return var2;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B[B)V")
    public final void method925(byte arg0, byte[] arg1) {
        if (arg0 <= 64) {
            this.method924(88);
        }
        this.field2740 = ByteBuffer.allocateDirect(arg1.length);
        this.field2740.position(0);
        this.field2740.put(arg1);
    }
}
