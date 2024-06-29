import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class204 extends class136 {

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3059;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)[B")
    public final byte[] method855(int arg0) {
        if (arg0 <= 56) {
            this.method858(10, (byte[]) null);
        }
        byte[] var2 = new byte[this.field3059.capacity()];
        this.field3059.position(0);
        this.field3059.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I[B)V")
    public final void method858(int arg0, byte[] arg1) {
        this.field3059 = ByteBuffer.allocateDirect(arg1.length);
        int var3 = -49 / ((-arg0 - 28) / 52);
        this.field3059.position(0);
        this.field3059.put(arg1);
    }
}
