import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rha")
public class class591 extends class483 {

    @OriginalMember(owner = "client!rha", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field8033;

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(I)[B", line = 6)
    public final byte[] method2941(int arg0) {
        byte[] var2 = new byte[this.field8033.capacity()];
        this.field8033.position(arg0);
        this.field8033.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(III)[B", line = 18)
    public final byte[] method2940(int arg0, int arg1, int arg2) {
        byte[] var4 = new byte[arg1];
        if (arg0 == 6684) {
            this.field8033.position(arg2);
            this.field8033.get(var4, 0, arg1);
            return var4;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "([BI)V", line = 32)
    public final void method2942(byte[] arg0, int arg1) {
        if (arg1 >= -58) {
            this.field8033 = null;
        }
        this.field8033 = ByteBuffer.allocateDirect(arg0.length);
        this.field8033.position(0);
        this.field8033.put(arg0);
    }
}
