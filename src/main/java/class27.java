import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class27 extends class112 {

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field352;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([BB)V", line = 5)
    public final void method178(byte[] arg0, byte arg1) {
        this.field352 = ByteBuffer.allocateDirect(arg0.length);
        int var3 = -97 / ((arg1 + 47) / 48);
        this.field352.position(0);
        this.field352.put(arg0);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)[B", line = 17)
    public final byte[] method179(byte arg0) {
        byte[] var2 = new byte[this.field352.capacity()];
        if (arg0 == 121) {
            this.field352.position(0);
            this.field352.get(var2);
            return var2;
        } else {
            return (byte[]) null;
        }
    }
}
