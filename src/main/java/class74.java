import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class74 extends class159 {

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1597;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I[B)V")
    public final void method534(int arg0, byte[] arg1) {
        if (arg0 <= -118) {
            this.field1597 = ByteBuffer.allocateDirect(arg1.length);
            this.field1597.position(0);
            this.field1597.put(arg1);
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)[B")
    public final byte[] method535(int arg0) {
        if (arg0 < 112) {
            this.method534(65, null);
        }
        byte[] var2 = new byte[this.field1597.capacity()];
        this.field1597.position(0);
        this.field1597.get(var2);
        return var2;
    }
}
