import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class566 extends class291 {

    @OriginalMember(owner = "client!dv", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field8371;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(BII)[B", line = 7)
    public final byte[] method1791(byte arg0, int arg1, int arg2) {
        if (arg0 != -11) {
            this.method1792(99);
        }
        byte[] var4 = new byte[arg1];
        this.field8371.position(arg2);
        this.field8371.get(var4, 0, arg1);
        return var4;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)[B", line = 23)
    public final byte[] method1792(int arg0) {
        if (arg0 == 87) {
            byte[] var2 = new byte[this.field8371.capacity()];
            this.field8371.position(0);
            this.field8371.get(var2);
            return var2;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I[B)V", line = 37)
    public final void method1794(int arg0, byte[] arg1) {
        this.field8371 = ByteBuffer.allocateDirect(arg1.length);
        this.field8371.position(0);
        if (arg0 != 21) {
            this.field8371 = null;
        }
        this.field8371.put(arg1);
    }
}
