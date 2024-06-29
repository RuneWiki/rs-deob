import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class58 {

    @OriginalMember(owner = "client!db", name = "a", descriptor = "Lfu;")
    public class42 field841;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field842;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "([BI)V")
    public final void method525(byte[] arg0, int arg1) {
        if (this.field842 == null || this.field842.capacity() < arg1) {
            this.field842 = ByteBuffer.allocateDirect(arg1);
        } else {
            this.field842.clear();
        }
        this.field842.put(arg0, 0, arg1);
        this.field842.flip();
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lfu;[BI)V")
    public class58(class42 arg0, byte[] arg1, int arg2) {
        this.field841 = arg0;
        this.field842 = ByteBuffer.allocateDirect(arg2);
        if (arg1 != null) {
            this.field842.put(arg1, 0, arg2);
        }
        this.field842.flip();
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lfu;Ljava/nio/ByteBuffer;)V")
    public class58(class42 arg0, ByteBuffer arg1) {
        this.field841 = arg0;
        this.field842 = arg1;
    }
}
