import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class272 extends class232 {

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4200;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "([BI)V")
    public final void method1533(byte[] arg0, int arg1) {
        this.field4200 = ByteBuffer.allocateDirect(arg0.length);
        this.field4200.position(0);
        if (arg1 != -3) {
            this.field4200 = (ByteBuffer) null;
        }
        this.field4200.put(arg0);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)[B")
    public final byte[] method1530(int arg0) {
        byte[] var2 = new byte[this.field4200.capacity()];
        this.field4200.position(0);
        this.field4200.get(var2);
        if (arg0 >= -100) {
            this.field4200 = (ByteBuffer) null;
        }
        return var2;
    }
}
