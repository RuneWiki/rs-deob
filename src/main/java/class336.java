import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class336 extends class190 {

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field5270;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)[B", line = 5)
    public final byte[] method1281(byte arg0) {
        if (arg0 != 42) {
            this.method1283(86, (byte) -78, -75);
        }
        byte[] var2 = new byte[this.field5270.capacity()];
        this.field5270.position(0);
        this.field5270.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IBI)[B", line = 20)
    public final byte[] method1283(int arg0, byte arg1, int arg2) {
        this.field5270.position(arg0);
        byte[] var4 = new byte[arg2];
        this.field5270.get(var4, 0, arg2);
        int var5 = -65 / ((-arg1 - 32) / 54);
        return var4;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "([BB)V", line = 34)
    public final void method1284(byte[] arg0, byte arg1) {
        this.field5270 = ByteBuffer.allocateDirect(arg0.length);
        this.field5270.position(0);
        this.field5270.put(arg0);
        int var3 = -22 % ((arg1 - 34) / 59);
    }
}
