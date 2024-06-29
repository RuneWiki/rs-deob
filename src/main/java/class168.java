import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class168 extends class73 {

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2962;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)[B")
    public final byte[] method577(int arg0) {
        byte[] var2 = new byte[this.field2962.capacity()];
        this.field2962.position(0);
        this.field2962.get(var2);
        if (arg0 != 127) {
            this.method577(-107);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "([BI)V")
    public final void method576(byte[] arg0, int arg1) {
        this.field2962 = ByteBuffer.allocateDirect(arg0.length);
        this.field2962.position(0);
        int var3 = 10 % ((-arg1 - 32) / 63);
        this.field2962.put(arg0);
    }
}
