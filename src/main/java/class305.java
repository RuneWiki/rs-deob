import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class305 {

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "Lih;")
    public class330 field4361;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field4362;

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lih;[BI)V")
    public class305(class330 arg0, byte[] arg1, int arg2) {
        this.field4361 = arg0;
        this.field4362 = ByteBuffer.allocateDirect(arg2);
        if (arg1 != null) {
            this.field4362.put(arg1, 0, arg2);
        }
        this.field4362.flip();
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "([BI)V")
    public final void method1921(byte[] arg0, int arg1) {
        if (this.field4362 == null || this.field4362.capacity() < arg1) {
            this.field4362 = ByteBuffer.allocateDirect(arg1);
        } else {
            this.field4362.clear();
        }
        this.field4362.put(arg0, 0, arg1);
        this.field4362.flip();
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lih;Ljava/nio/ByteBuffer;)V")
    public class305(class330 arg0, ByteBuffer arg1) {
        this.field4361 = arg0;
        this.field4362 = arg1;
    }
}
