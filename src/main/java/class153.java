import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class153 extends class235 {

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2550;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)[B")
    public final byte[] method991(int arg0) {
        byte[] var2 = new byte[this.field2550.capacity()];
        this.field2550.position(arg0);
        this.field2550.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I[B)V")
    public final void method992(int arg0, byte[] arg1) {
        this.field2550 = ByteBuffer.allocateDirect(arg1.length);
        if (arg0 != 128) {
            this.method991(-78);
        }
        this.field2550.position(0);
        this.field2550.put(arg1);
    }
}
