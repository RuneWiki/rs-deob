import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class192 extends class250 {

    @OriginalMember(owner = "client!td", name = "o", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3282;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I[B)V")
    public final void method1299(int arg0, byte[] arg1) {
        this.field3282 = ByteBuffer.allocateDirect(arg1.length);
        if (arg0 != 1) {
            this.field3282 = (ByteBuffer) null;
        }
        this.field3282.position(0);
        this.field3282.put(arg1);
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)[B")
    public final byte[] method1300(int arg0) {
        byte[] var2 = new byte[this.field3282.capacity()];
        int var3 = 73 / ((arg0 - 33) / 51);
        this.field3282.position(0);
        this.field3282.get(var2);
        return var2;
    }
}
