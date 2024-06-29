import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class290 extends class39 {

    @OriginalMember(owner = "client!c", name = "l", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4882;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)[B", line = 9)
    public final byte[] method216(int arg0) {
        int var2 = -82 % ((arg0 - 11) / 48);
        byte[] var3 = new byte[this.field4882.capacity()];
        this.field4882.position(0);
        this.field4882.get(var3);
        return var3;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([BI)V", line = 22)
    public final void method217(byte[] arg0, int arg1) {
        this.field4882 = ByteBuffer.allocateDirect(arg0.length);
        this.field4882.position(0);
        if (arg1 != -1) {
            this.method216(-35);
        }
        this.field4882.put(arg0);
    }
}
