import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class283 extends class185 {

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4931;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "(I)[B")
    public final byte[] method1271(int arg0) {
        byte[] var2 = new byte[this.field4931.capacity()];
        if (arg0 != 255) {
            this.method1265((byte[]) null, false);
        }
        this.field4931.position(0);
        this.field4931.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "([BZ)V")
    public final void method1265(byte[] arg0, boolean arg1) {
        this.field4931 = ByteBuffer.allocateDirect(arg0.length);
        this.field4931.position(0);
        this.field4931.put(arg0);
        if (!arg1) {
            this.method1265((byte[]) null, true);
        }
    }
}
