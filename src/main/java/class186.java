import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class186 extends class26 {

    @OriginalMember(owner = "client!si", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3091;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)[B")
    public final byte[] method139(int arg0) {
        byte[] var2 = new byte[this.field3091.capacity()];
        if (arg0 == 22990) {
            this.field3091.position(0);
            this.field3091.get(var2);
            return var2;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I[B)V")
    public final void method137(int arg0, byte[] arg1) {
        this.field3091 = ByteBuffer.allocateDirect(arg1.length);
        this.field3091.position(0);
        if (arg0 == 207) {
            this.field3091.put(arg1);
        }
    }
}
