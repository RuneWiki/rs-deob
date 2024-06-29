import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class265 {

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "Ltb;")
    public class227 field3689;

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field3690;

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Ltb;[BI)V")
    public class265(class227 arg0, byte[] arg1, int arg2) {
        this.field3689 = arg0;
        this.field3690 = ByteBuffer.allocateDirect(arg2);
        if (arg1 != null) {
            this.field3690.put(arg1, 0, arg2);
        }
        this.field3690.flip();
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Ltb;Ljava/nio/ByteBuffer;)V")
    public class265(class227 arg0, ByteBuffer arg1) {
        this.field3689 = arg0;
        this.field3690 = arg1;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "([BI)V")
    public final void method1729(byte[] arg0, int arg1) {
        if (this.field3690 == null || this.field3690.capacity() < arg1) {
            this.field3690 = ByteBuffer.allocateDirect(arg1);
        } else {
            this.field3690.clear();
        }
        this.field3690.put(arg0, 0, arg1);
        this.field3690.flip();
    }
}
