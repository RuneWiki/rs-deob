import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class155 extends class170 {

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3141;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([BI)V")
    public final void method985(byte[] arg0, int arg1) {
        this.field3141 = ByteBuffer.allocateDirect(arg0.length);
        this.field3141.position(0);
        this.field3141.put(arg0);
        if (arg1 != 64) {
            this.method986(57);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)[B")
    public final byte[] method986(int arg0) {
        byte[] var2 = new byte[this.field3141.capacity()];
        this.field3141.position(0);
        this.field3141.get(var2);
        return arg0 == 64 ? var2 : (byte[]) null;
    }
}
