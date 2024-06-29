import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class99 extends class101 {

    @OriginalMember(owner = "client!la", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1577;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([BI)V")
    public final void method767(byte[] arg0, int arg1) {
        if (arg1 <= 49) {
            this.method768(93);
        }
        this.field1577 = ByteBuffer.allocateDirect(arg0.length);
        this.field1577.position(0);
        this.field1577.put(arg0);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)[B")
    public final byte[] method768(int arg0) {
        byte[] var2 = new byte[this.field1577.capacity()];
        this.field1577.position(0);
        this.field1577.get(var2);
        if (arg0 >= -45) {
            this.method768(34);
        }
        return var2;
    }
}
