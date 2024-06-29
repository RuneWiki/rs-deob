import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class72 extends class282 {

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field843;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)[B", line = 10)
    public final byte[] method427(byte arg0) {
        byte[] var2 = new byte[this.field843.capacity()];
        this.field843.position(0);
        if (arg0 != 19) {
            this.field843 = null;
        }
        this.field843.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I[B)V", line = 23)
    public final void method428(int arg0, byte[] arg1) {
        this.field843 = ByteBuffer.allocateDirect(arg1.length);
        this.field843.position(0);
        this.field843.put(arg1);
        if (arg0 != -1) {
            this.method428(-40, null);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)[B", line = 36)
    public final byte[] method429(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            this.method428(-46, null);
        }
        byte[] var4 = new byte[arg1];
        this.field843.position(arg2);
        this.field843.get(var4, 0, arg1);
        return var4;
    }
}
