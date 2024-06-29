import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public class class69 extends class242 {

    @OriginalMember(owner = "client!ifa", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field944;

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Z)[B", line = 7)
    public final byte[] method524(boolean arg0) {
        byte[] var2 = new byte[this.field944.capacity()];
        if (!arg0) {
            this.method524(false);
        }
        this.field944.position(0);
        this.field944.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I[B)V", line = 20)
    public final void method525(int arg0, byte[] arg1) {
        if (arg0 != 1) {
            this.field944 = null;
        }
        this.field944 = ByteBuffer.allocateDirect(arg1.length);
        this.field944.position(0);
        this.field944.put(arg1);
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(III)[B", line = 35)
    public final byte[] method526(int arg0, int arg1, int arg2) {
        if (arg0 >= -23) {
            this.method524(false);
        }
        this.field944.position(arg2);
        byte[] var4 = new byte[arg1];
        this.field944.get(var4, 0, arg1);
        return var4;
    }
}
