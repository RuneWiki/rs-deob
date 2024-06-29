import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class186 extends class245 {

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2935;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)[B", line = 6)
    public final byte[] method1178(int arg0) {
        byte[] var2 = new byte[this.field2935.capacity()];
        this.field2935.position(0);
        int var3 = 67 % ((arg0 + 10) / 55);
        this.field2935.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "([BI)V", line = 18)
    public final void method1179(byte[] arg0, int arg1) {
        this.field2935 = ByteBuffer.allocateDirect(arg0.length);
        this.field2935.position(0);
        this.field2935.put(arg0);
        int var3 = 4 / ((arg1 - 30) / 43);
    }
}
