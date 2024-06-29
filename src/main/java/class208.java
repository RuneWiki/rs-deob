import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public class class208 extends class257 {

    @OriginalMember(owner = "client!nea", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2633;

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "([BZ)V", line = 5)
    public final void method1249(byte[] arg0, boolean arg1) {
        this.field2633 = ByteBuffer.allocateDirect(arg0.length);
        if (!arg1) {
            this.field2633 = null;
        }
        this.field2633.position(0);
        this.field2633.put(arg0);
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(B)[B", line = 22)
    public final byte[] method1250(byte arg0) {
        byte[] var2 = new byte[this.field2633.capacity()];
        this.field2633.position(0);
        this.field2633.get(var2);
        int var3 = -115 % ((-arg0 - 62) / 54);
        return var2;
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(BII)[B", line = 35)
    public final byte[] method1251(byte arg0, int arg1, int arg2) {
        this.field2633.position(arg2);
        byte[] var4 = new byte[arg1];
        this.field2633.get(var4, 0, arg1);
        if (arg0 != -112) {
            this.field2633 = null;
        }
        return var4;
    }
}
