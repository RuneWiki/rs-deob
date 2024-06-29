import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class341 extends class520 {

    @OriginalMember(owner = "client!np", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4514;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "([BZ)V", line = 5)
    public final void method1984(byte[] arg0, boolean arg1) {
        this.field4514 = ByteBuffer.allocateDirect(arg0.length);
        if (arg1) {
            this.field4514 = null;
        }
        this.field4514.position(0);
        this.field4514.put(arg0);
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)[B", line = 18)
    public final byte[] method1985(int arg0) {
        byte[] var2 = new byte[this.field4514.capacity()];
        if (arg0 != -2928) {
            this.field4514 = null;
        }
        this.field4514.position(0);
        this.field4514.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(III)[B", line = 31)
    public final byte[] method1986(int arg0, int arg1, int arg2) {
        if (arg0 == 64) {
            this.field4514.position(arg2);
            byte[] var4 = new byte[arg1];
            this.field4514.get(var4, 0, arg1);
            return var4;
        } else {
            return (byte[]) null;
        }
    }
}
