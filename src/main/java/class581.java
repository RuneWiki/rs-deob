import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class581 extends class691 {

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field8513;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(III)[B", line = 6)
    public final byte[] method3364(int arg0, int arg1, int arg2) {
        byte[] var4 = new byte[arg0];
        this.field8513.position(arg1);
        this.field8513.get(var4, 0, arg0);
        return arg2 == 30164 ? var4 : (byte[]) null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)[B", line = 20)
    public final byte[] method3365(byte arg0) {
        byte[] var2 = new byte[this.field8513.capacity()];
        if (arg0 == -68) {
            this.field8513.position(0);
            this.field8513.get(var2);
            return var2;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I[B)V", line = 35)
    public final void method3366(int arg0, byte[] arg1) {
        this.field8513 = ByteBuffer.allocateDirect(arg1.length);
        this.field8513.position(0);
        if (arg0 >= 6) {
            this.field8513.put(arg1);
        }
    }
}
