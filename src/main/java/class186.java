import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class186 extends class93 {

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3458;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)[B")
    public final byte[] method605(int arg0) {
        byte[] var2 = new byte[this.field3458.capacity()];
        if (arg0 != 32030) {
            this.method605(113);
        }
        this.field3458.position(0);
        this.field3458.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "([BB)V")
    public final void method607(byte[] arg0, byte arg1) {
        this.field3458 = ByteBuffer.allocateDirect(arg0.length);
        this.field3458.position(0);
        this.field3458.put(arg0);
        if (arg1 >= -102) {
            this.method605(-33);
        }
    }
}
