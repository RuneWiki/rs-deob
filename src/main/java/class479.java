import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class479 extends class33 {

    @OriginalMember(owner = "client!cv", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field7058;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)[B")
    public final byte[] method282(int arg0) {
        byte[] var2 = new byte[this.field7058.capacity()];
        if (arg0 != -15691) {
            this.field7058 = null;
        }
        this.field7058.position(0);
        this.field7058.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "([BI)V")
    public final void method284(byte[] arg0, int arg1) {
        if (arg1 >= 123) {
            this.field7058 = ByteBuffer.allocateDirect(arg0.length);
            this.field7058.position(0);
            this.field7058.put(arg0);
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(III)[B")
    public final byte[] method283(int arg0, int arg1, int arg2) {
        this.field7058.position(arg2);
        if (arg1 != 3) {
            this.method283(28, -23, -59);
        }
        byte[] var4 = new byte[arg0];
        this.field7058.get(var4, 0, arg0);
        return var4;
    }
}
