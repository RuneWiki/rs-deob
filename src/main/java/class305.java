import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class305 extends class312 {

    @OriginalMember(owner = "client!b", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4065;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)[B", line = 8)
    public final byte[] method1809(boolean arg0) {
        byte[] var2 = new byte[this.field4065.capacity()];
        this.field4065.position(0);
        this.field4065.get(var2);
        if (!arg0) {
            this.method1810(-50, -74, -94);
        }
        return var2;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(III)[B", line = 22)
    public final byte[] method1810(int arg0, int arg1, int arg2) {
        if (arg0 == 4520) {
            byte[] var4 = new byte[arg2];
            this.field4065.position(arg1);
            this.field4065.get(var4, 0, arg2);
            return var4;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I[B)V", line = 37)
    public final void method1811(int arg0, byte[] arg1) {
        this.field4065 = ByteBuffer.allocateDirect(arg1.length);
        this.field4065.position(0);
        this.field4065.put(arg1);
        if (arg0 != -28736) {
            this.method1811(-44, null);
        }
    }
}
