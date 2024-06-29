import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class231 extends class434 {

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3289;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B[B)V", line = 5)
    public final void method1468(byte arg0, byte[] arg1) {
        this.field3289 = ByteBuffer.allocateDirect(arg1.length);
        this.field3289.position(0);
        this.field3289.put(arg1);
        if (arg0 >= -69) {
            this.method1469(-18, 111, 73);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)[B", line = 22)
    public final byte[] method1469(int arg0, int arg1, int arg2) {
        byte[] var4 = new byte[arg1];
        if (arg0 >= -34) {
            return (byte[]) null;
        } else {
            this.field3289.position(arg2);
            this.field3289.get(var4, 0, arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)[B", line = 36)
    public final byte[] method1470(int arg0) {
        byte[] var2 = new byte[this.field3289.capacity()];
        this.field3289.position(0);
        int var3 = 86 % ((26 - arg0) / 57);
        this.field3289.get(var2);
        return var2;
    }
}
