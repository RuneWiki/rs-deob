import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class60 extends class75 {

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1189;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "([BI)V")
    public final void method397(byte[] arg0, int arg1) {
        this.field1189 = ByteBuffer.allocateDirect(arg0.length);
        int var3 = -58 % (arg1 / 49);
        this.field1189.position(0);
        this.field1189.put(arg0);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)[B")
    public final byte[] method398(int arg0) {
        byte[] var2 = new byte[this.field1189.capacity()];
        this.field1189.position(0);
        this.field1189.get(var2);
        if (arg0 <= 100) {
            this.field1189 = null;
        }
        return var2;
    }
}
