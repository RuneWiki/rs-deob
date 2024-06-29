import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class82 {

    @OriginalMember(owner = "client!i", name = "a", descriptor = "Lql;")
    public class346 field905;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field906;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([BI)V", line = 9)
    public final void method448(byte[] arg0, int arg1) {
        if (this.field906 == null || this.field906.capacity() < arg1) {
            this.field906 = ByteBuffer.allocateDirect(arg1);
        } else {
            this.field906.clear();
        }
        this.field906.put(arg0, 0, arg1);
        this.field906.flip();
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lql;[BI)V", line = 18)
    public class82(class346 arg0, byte[] arg1, int arg2) {
        this.field905 = arg0;
        this.field906 = ByteBuffer.allocateDirect(arg2);
        if (arg1 != null) {
            this.field906.put(arg1, 0, arg2);
        }
        this.field906.flip();
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lql;Ljava/nio/ByteBuffer;)V", line = 28)
    public class82(class346 arg0, ByteBuffer arg1) {
        this.field905 = arg0;
        this.field906 = arg1;
    }
}
