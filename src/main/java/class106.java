import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class106 extends class364 {

    @OriginalMember(owner = "client!me", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1582;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([BI)V")
    public final void method722(byte[] arg0, int arg1) {
        this.field1582 = ByteBuffer.allocateDirect(arg0.length);
        if (arg1 != 23067) {
            this.method723((byte) -118);
        }
        this.field1582.position(0);
        this.field1582.put(arg0);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)[B")
    public final byte[] method723(byte arg0) {
        byte[] var2 = new byte[this.field1582.capacity()];
        this.field1582.position(0);
        this.field1582.get(var2);
        if (arg0 < 124) {
            this.field1582 = (ByteBuffer) null;
        }
        return var2;
    }
}
