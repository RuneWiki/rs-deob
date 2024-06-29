import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class610 extends class287 {

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field8455;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[B)V", line = 5)
    public final void method1704(int arg0, byte[] arg1) {
        this.field8455 = ByteBuffer.allocateDirect(arg1.length);
        this.field8455.position(arg0);
        this.field8455.put(arg1);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIB)[B", line = 19)
    public final byte[] method1705(int arg0, int arg1, byte arg2) {
        this.field8455.position(arg0);
        byte[] var4 = new byte[arg1];
        this.field8455.get(var4, 0, arg1);
        if (arg2 != -8) {
            this.field8455 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)[B", line = 33)
    public final byte[] method1709(byte arg0) {
        byte[] var2 = new byte[this.field8455.capacity()];
        int var3 = -35 / ((59 - arg0) / 63);
        this.field8455.position(0);
        this.field8455.get(var2);
        return var2;
    }
}
