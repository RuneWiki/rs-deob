import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class106 extends class102 {

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2446;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B[B)V")
    public final void method823(byte arg0, byte[] arg1) {
        this.field2446 = ByteBuffer.allocateDirect(arg1.length);
        if (arg0 < 69) {
            this.method822(-100);
        }
        this.field2446.position(0);
        this.field2446.put(arg1);
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)[B")
    public final byte[] method822(int arg0) {
        byte[] var2 = new byte[this.field2446.capacity()];
        this.field2446.position(0);
        this.field2446.get(var2);
        return arg0 == 1000 ? var2 : (byte[]) null;
    }
}
