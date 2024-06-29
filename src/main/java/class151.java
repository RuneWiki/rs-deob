import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class151 extends class324 {

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2755;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "([BB)V", line = 5)
    public final void method1201(byte[] arg0, byte arg1) {
        this.field2755 = ByteBuffer.allocateDirect(arg0.length);
        this.field2755.position(0);
        if (arg1 != 75) {
            this.method1201((byte[]) null, (byte) -105);
        }
        this.field2755.put(arg0);
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)[B", line = 19)
    public final byte[] method1202(int arg0) {
        if (arg0 > -38) {
            this.field2755 = (ByteBuffer) null;
        }
        byte[] var2 = new byte[this.field2755.capacity()];
        this.field2755.position(0);
        this.field2755.get(var2);
        return var2;
    }
}
