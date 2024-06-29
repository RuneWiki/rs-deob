import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class219 extends class375 {

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3074;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "([BZ)V")
    public final void method1226(byte[] arg0, boolean arg1) {
        this.field3074 = ByteBuffer.allocateDirect(arg0.length);
        if (!arg1) {
            this.field3074 = (ByteBuffer) null;
        }
        this.field3074.position(0);
        this.field3074.put(arg0);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)[B")
    public final byte[] method1227(int arg0) {
        byte[] var2 = new byte[this.field3074.capacity()];
        if (arg0 > -110) {
            this.field3074 = (ByteBuffer) null;
        }
        this.field3074.position(0);
        this.field3074.get(var2);
        return var2;
    }
}
