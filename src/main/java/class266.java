import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class266 extends class377 {

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3847;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I[B)V", line = 5)
    public final void method1821(int arg0, byte[] arg1) {
        this.field3847 = ByteBuffer.allocateDirect(arg1.length);
        this.field3847.position(arg0);
        this.field3847.put(arg1);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)[B", line = 15)
    public final byte[] method1822(int arg0) {
        if (arg0 == 2) {
            byte[] var2 = new byte[this.field3847.capacity()];
            this.field3847.position(0);
            this.field3847.get(var2);
            return var2;
        } else {
            return (byte[]) null;
        }
    }
}
