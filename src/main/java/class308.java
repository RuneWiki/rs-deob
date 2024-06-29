import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class308 extends class281 {

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4298;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZI)[B")
    public final byte[] method1846(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.method1846(82, false, 85);
        }
        byte[] var4 = new byte[arg0];
        this.field4298.position(arg2);
        this.field4298.get(var4, 0, arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)[B")
    public final byte[] method1849(int arg0) {
        if (arg0 < 117) {
            this.field4298 = null;
        }
        byte[] var2 = new byte[this.field4298.capacity()];
        this.field4298.position(0);
        this.field4298.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I[B)V")
    public final void method1848(int arg0, byte[] arg1) {
        if (arg0 != 14) {
            this.method1848(39, null);
        }
        this.field4298 = ByteBuffer.allocateDirect(arg1.length);
        this.field4298.position(0);
        this.field4298.put(arg1);
    }
}
