import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class400 extends class200 {

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field5957;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I[B)V")
    public final void method1403(int arg0, byte[] arg1) {
        this.field5957 = ByteBuffer.allocateDirect(arg1.length);
        if (arg0 != 28904) {
            this.method1400(73);
        }
        this.field5957.position(0);
        this.field5957.put(arg1);
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)[B")
    public final byte[] method1400(int arg0) {
        byte[] var2 = new byte[this.field5957.capacity()];
        this.field5957.position(0);
        this.field5957.get(var2);
        int var3 = -23 % ((arg0 + 6) / 58);
        return var2;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(III)[B")
    public final byte[] method1399(int arg0, int arg1, int arg2) {
        this.field5957.position(arg1);
        byte[] var4 = new byte[arg0];
        this.field5957.get(var4, 0, arg0);
        return arg2 == -26915 ? var4 : (byte[]) null;
    }
}
