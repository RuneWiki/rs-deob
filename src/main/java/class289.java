import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class289 extends class278 {

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4353;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)[B", line = 6)
    public final byte[] method1939(int arg0) {
        byte[] var2 = new byte[this.field4353.capacity()];
        this.field4353.position(0);
        if (arg0 != 12186) {
            this.method1939(-99);
        }
        this.field4353.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "([BB)V", line = 22)
    public final void method1943(byte[] arg0, byte arg1) {
        this.field4353 = ByteBuffer.allocateDirect(arg0.length);
        if (arg1 == -32) {
            this.field4353.position(0);
            this.field4353.put(arg0);
        }
    }
}
