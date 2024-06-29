import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class130 extends class61 {

    @OriginalMember(owner = "client!t", name = "u", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3286;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)[B", line = 6)
    public final byte[] method605(int arg0) {
        if (arg0 == 26524) {
            byte[] var2 = new byte[this.field3286.capacity()];
            this.field3286.position(0);
            this.field3286.get(var2);
            return var2;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I[B)V", line = 20)
    public final void method604(int arg0, byte[] arg1) {
        this.field3286 = ByteBuffer.allocateDirect(arg1.length);
        this.field3286.position(0);
        int var3 = -78 / ((8 - arg0) / 43);
        this.field3286.put(arg1);
    }
}
