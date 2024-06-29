import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class323 extends class234 {

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4399;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(BII)[B", line = 6)
    public final byte[] method1634(byte arg0, int arg1, int arg2) {
        byte[] var4 = new byte[arg2];
        if (arg0 != 66) {
            this.field4399 = null;
        }
        this.field4399.position(arg1);
        this.field4399.get(var4, 0, arg2);
        return var4;
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(I)[B", line = 22)
    public final byte[] method1637(int arg0) {
        byte[] var2 = new byte[this.field4399.capacity()];
        this.field4399.position(0);
        int var3 = -128 % ((-arg0 - 34) / 40);
        this.field4399.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(I[B)V", line = 34)
    public final void method1632(int arg0, byte[] arg1) {
        this.field4399 = ByteBuffer.allocateDirect(arg1.length);
        this.field4399.position(0);
        this.field4399.put(arg1);
        if (arg0 >= -19) {
            this.method1634((byte) 117, 119, -59);
        }
    }
}
