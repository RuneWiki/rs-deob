import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class42 extends class41 {

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field944;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([BI)V")
    public final void method314(byte[] arg0, int arg1) {
        if (arg1 != 9896) {
            this.field944 = null;
        }
        this.field944 = ByteBuffer.allocateDirect(arg0.length);
        this.field944.position(0);
        this.field944.put(arg0);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)[B")
    public final byte[] method310(int arg0) {
        int var2 = 62 % ((arg0 - 3) / 51);
        byte[] var3 = new byte[this.field944.capacity()];
        this.field944.position(0);
        this.field944.get(var3);
        return var3;
    }
}
