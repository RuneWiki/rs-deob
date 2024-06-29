import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class235 extends class160 {

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4021;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)[B", line = 9)
    public final byte[] method1186(byte arg0) {
        if (arg0 != 6) {
            this.method1186((byte) 44);
        }
        byte[] var2 = new byte[this.field4021.capacity()];
        this.field4021.position(0);
        this.field4021.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "([BB)V", line = 23)
    public final void method1185(byte[] arg0, byte arg1) {
        this.field4021 = ByteBuffer.allocateDirect(arg0.length);
        this.field4021.position(0);
        this.field4021.put(arg0);
        if (arg1 != -90) {
            this.method1185((byte[]) null, (byte) -29);
        }
    }
}
