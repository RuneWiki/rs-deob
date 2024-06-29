import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class317 extends class641 {

    @OriginalMember(owner = "client!nw", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4616;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(III)[B", line = 6)
    public final byte[] method1949(int arg0, int arg1, int arg2) {
        if (arg2 != -10057) {
            this.field4616 = null;
        }
        this.field4616.position(arg1);
        byte[] var4 = new byte[arg0];
        this.field4616.get(var4, 0, arg0);
        return var4;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "([BI)V", line = 19)
    public final void method1950(byte[] arg0, int arg1) {
        this.field4616 = ByteBuffer.allocateDirect(arg0.length);
        this.field4616.position(0);
        this.field4616.put(arg0);
        if (arg1 < 46) {
            this.method1949(108, 93, -122);
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)[B", line = 32)
    public final byte[] method1951(int arg0) {
        byte[] var2 = new byte[this.field4616.capacity()];
        this.field4616.position(0);
        if (arg0 != 2048) {
            this.method1951(-26);
        }
        this.field4616.get(var2);
        return var2;
    }
}
