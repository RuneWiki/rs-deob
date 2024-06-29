import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class265 extends class246 {

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4297;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I[B)V")
    public final void method1649(int arg0, byte[] arg1) {
        this.field4297 = ByteBuffer.allocateDirect(arg1.length);
        int var3 = 115 % ((-arg0 - 68) / 37);
        this.field4297.position(0);
        this.field4297.put(arg1);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)[B")
    public final byte[] method1644(int arg0) {
        byte[] var2 = new byte[this.field4297.capacity()];
        if (arg0 != 32106) {
            this.field4297 = (ByteBuffer) null;
        }
        this.field4297.position(0);
        this.field4297.get(var2);
        return var2;
    }
}
