import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class104 extends class63 {

    @OriginalMember(owner = "client!p", name = "p", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2518;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([BI)V")
    public final void method458(byte[] arg0, int arg1) {
        this.field2518 = ByteBuffer.allocateDirect(arg0.length);
        this.field2518.position(arg1);
        this.field2518.put(arg0);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)[B")
    public final byte[] method456(byte arg0) {
        byte[] var2 = new byte[this.field2518.capacity()];
        this.field2518.position(0);
        this.field2518.get(var2);
        if (arg0 < 37) {
            this.method458(null, -104);
        }
        return var2;
    }
}
