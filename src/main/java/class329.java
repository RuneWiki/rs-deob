import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class329 extends class311 {

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field5138;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)[B", line = 6)
    public final byte[] method2198(byte arg0) {
        byte[] var2 = new byte[this.field5138.capacity()];
        this.field5138.position(0);
        if (arg0 == -24) {
            this.field5138.get(var2);
            return var2;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "([BI)V", line = 20)
    public final void method2195(byte[] arg0, int arg1) {
        this.field5138 = ByteBuffer.allocateDirect(arg0.length);
        this.field5138.position(0);
        if (arg1 >= 90) {
            this.field5138.put(arg0);
        }
    }
}
