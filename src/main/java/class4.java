import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 extends class129 {

    @OriginalMember(owner = "client!ft", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field39;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I[B)V", line = 8)
    public final void method36(int arg0, byte[] arg1) {
        this.field39 = ByteBuffer.allocateDirect(arg1.length);
        this.field39.position(0);
        if (arg0 >= 72) {
            this.field39.put(arg1);
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)[B", line = 21)
    public final byte[] method37(byte arg0) {
        byte[] var2 = new byte[this.field39.capacity()];
        this.field39.position(0);
        this.field39.get(var2);
        int var3 = 39 % ((arg0 - 79) / 46);
        return var2;
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(IBI)[B", line = 35)
    public final byte[] method38(int arg0, byte arg1, int arg2) {
        this.field39.position(arg2);
        int var4 = 59 / ((64 - arg1) / 62);
        byte[] var5 = new byte[arg0];
        this.field39.get(var5, 0, arg0);
        return var5;
    }
}
