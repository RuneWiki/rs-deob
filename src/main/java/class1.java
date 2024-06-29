import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class1 extends class257 {

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)[B", line = 6)
    public final byte[] method1(int arg0) {
        byte[] var2 = new byte[this.field1.capacity()];
        this.field1.position(0);
        int var3 = -2 % ((arg0 - 51) / 63);
        this.field1.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "([BI)V", line = 18)
    public final void method2(byte[] arg0, int arg1) {
        if (arg1 != 2141342146) {
            this.method1(5);
        }
        this.field1 = ByteBuffer.allocateDirect(arg0.length);
        this.field1.position(0);
        this.field1.put(arg0);
    }
}
