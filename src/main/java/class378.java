import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class378 {

    @OriginalMember(owner = "client!d", name = "b", descriptor = "Lnf;")
    public class256 field5497;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field5496;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([BI)V")
    public final void method2449(byte[] arg0, int arg1) {
        if (this.field5496 == null || this.field5496.capacity() < arg1) {
            this.field5496 = ByteBuffer.allocateDirect(arg1);
        } else {
            this.field5496.clear();
        }
        this.field5496.put(arg0, 0, arg1);
        this.field5496.flip();
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lnf;[BI)V")
    public class378(class256 arg0, byte[] arg1, int arg2) {
        this.field5497 = arg0;
        this.field5496 = ByteBuffer.allocateDirect(arg2);
        if (arg1 != null) {
            this.field5496.put(arg1, 0, arg2);
        }
        this.field5496.flip();
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lnf;Ljava/nio/ByteBuffer;)V")
    public class378(class256 arg0, ByteBuffer arg1) {
        this.field5497 = arg0;
        this.field5496 = arg1;
    }
}
