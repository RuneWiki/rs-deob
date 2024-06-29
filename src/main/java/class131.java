import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class131 extends class74 {

    @OriginalMember(owner = "client!na", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2300;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "([BB)V", line = 6)
    public final void method548(byte[] arg0, byte arg1) {
        int var3 = -57 / ((15 - arg1) / 62);
        this.field2300 = ByteBuffer.allocateDirect(arg0.length);
        this.field2300.position(0);
        this.field2300.put(arg0);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)[B", line = 18)
    public final byte[] method545(int arg0) {
        byte[] var2 = new byte[this.field2300.capacity()];
        this.field2300.position(0);
        if (arg0 >= -27) {
            this.method545(45);
        }
        this.field2300.get(var2);
        return var2;
    }
}
