import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class334 extends class271 {

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4460;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "([BI)V")
    public final void method1763(byte[] arg0, int arg1) {
        this.field4460 = ByteBuffer.allocateDirect(arg0.length);
        this.field4460.position(0);
        if (arg1 != 1000) {
            this.field4460 = null;
        }
        this.field4460.put(arg0);
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(III)[B")
    public final byte[] method1762(int arg0, int arg1, int arg2) {
        byte[] var4 = new byte[arg2];
        this.field4460.position(arg0);
        this.field4460.get(var4, 0, arg2);
        return arg1 == 1000 ? var4 : (byte[]) null;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)[B")
    public final byte[] method1764(int arg0) {
        byte[] var2 = new byte[this.field4460.capacity()];
        this.field4460.position(0);
        this.field4460.get(var2);
        if (arg0 != 1000) {
            this.field4460 = null;
        }
        return var2;
    }
}
