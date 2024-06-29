import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class708 extends class463 {

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field9966;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(B[B)V")
    public final void method2821(byte arg0, byte[] arg1) {
        int var3 = 94 % ((arg0 - 41) / 57);
        this.field9966 = ByteBuffer.allocateDirect(arg1.length);
        this.field9966.position(0);
        this.field9966.put(arg1);
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(III)[B")
    public final byte[] method2822(int arg0, int arg1, int arg2) {
        int var4 = -48 / ((41 - arg0) / 55);
        byte[] var5 = new byte[arg1];
        this.field9966.position(arg2);
        this.field9966.get(var5, 0, arg1);
        return var5;
    }

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "(B)[B")
    public final byte[] method2823(byte arg0) {
        byte[] var2 = new byte[this.field9966.capacity()];
        if (arg0 == 9) {
            this.field9966.position(0);
            this.field9966.get(var2);
            return var2;
        } else {
            return (byte[]) null;
        }
    }
}
