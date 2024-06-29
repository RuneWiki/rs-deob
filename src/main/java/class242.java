import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class242 extends class143 {

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3850;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)[B")
    public final byte[] method1001(int arg0) {
        byte[] var2 = new byte[this.field3850.capacity()];
        if (arg0 == 6193) {
            this.field3850.position(0);
            this.field3850.get(var2);
            return var2;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([BI)V")
    public final void method1004(byte[] arg0, int arg1) {
        this.field3850 = ByteBuffer.allocateDirect(arg0.length);
        this.field3850.position(0);
        this.field3850.put(arg0);
        if (arg1 != -1) {
            this.field3850 = (ByteBuffer) null;
        }
    }
}
