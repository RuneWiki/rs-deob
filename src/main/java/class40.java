import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class40 extends class581 {

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field646;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)[B")
    public final byte[] method283(int arg0, int arg1, int arg2) {
        this.field646.position(arg1);
        byte[] var4 = new byte[arg2];
        this.field646.get(var4, arg0, arg2);
        return var4;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)[B")
    public final byte[] method284(int arg0) {
        byte[] var2 = new byte[this.field646.capacity()];
        this.field646.position(arg0);
        this.field646.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I[B)V")
    public final void method285(int arg0, byte[] arg1) {
        this.field646 = ByteBuffer.allocateDirect(arg1.length);
        if (arg0 < -19) {
            this.field646.position(0);
            this.field646.put(arg1);
        }
    }
}
