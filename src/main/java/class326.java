import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class326 extends class406 {

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4129;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)[B")
    public final byte[] method1904(byte arg0) {
        byte[] var2 = new byte[this.field4129.capacity()];
        this.field4129.position(0);
        this.field4129.get(var2);
        if (arg0 != 21) {
            this.field4129 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([BZ)V")
    public final void method1905(byte[] arg0, boolean arg1) {
        if (!arg1) {
            this.field4129 = ByteBuffer.allocateDirect(arg0.length);
            this.field4129.position(0);
            this.field4129.put(arg0);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)[B")
    public final byte[] method1906(int arg0, int arg1, int arg2) {
        byte[] var4 = new byte[arg2];
        if (arg1 != 2) {
            this.field4129 = null;
        }
        this.field4129.position(arg0);
        this.field4129.get(var4, 0, arg2);
        return var4;
    }
}
