import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class279 extends class62 {

    @OriginalMember(owner = "client!gm", name = "m", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4561;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)[B")
    public final byte[] method396(int arg0) {
        byte[] var2 = new byte[this.field4561.capacity()];
        this.field4561.position(0);
        this.field4561.get(var2);
        return arg0 == 16747 ? var2 : (byte[]) null;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "([BI)V")
    public final void method401(byte[] arg0, int arg1) {
        if (arg1 > -48) {
            this.field4561 = (ByteBuffer) null;
        }
        this.field4561 = ByteBuffer.allocateDirect(arg0.length);
        this.field4561.position(0);
        this.field4561.put(arg0);
    }
}
