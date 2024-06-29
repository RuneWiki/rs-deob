import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class74 extends class61 {

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1484;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)[B")
    public final byte[] method435(int arg0) {
        byte[] var2 = new byte[this.field1484.capacity()];
        this.field1484.position(arg0);
        this.field1484.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "([BB)V")
    public final void method437(byte[] arg0, byte arg1) {
        this.field1484 = ByteBuffer.allocateDirect(arg0.length);
        this.field1484.position(0);
        this.field1484.put(arg0);
        if (arg1 != 31) {
            this.field1484 = (ByteBuffer) null;
        }
    }
}
