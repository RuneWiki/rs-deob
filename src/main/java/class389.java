import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class389 {

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "Lhd;")
    public class17 field5465;

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field5466;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "([BI)V")
    public final void method2402(byte[] arg0, int arg1) {
        if (this.field5466 == null || this.field5466.capacity() < arg1) {
            this.field5466 = ByteBuffer.allocateDirect(arg1);
        } else {
            this.field5466.clear();
        }
        this.field5466.put(arg0, 0, arg1);
        this.field5466.flip();
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lhd;[BI)V")
    public class389(class17 arg0, byte[] arg1, int arg2) {
        this.field5465 = arg0;
        this.field5466 = ByteBuffer.allocateDirect(arg2);
        if (arg1 != null) {
            this.field5466.put(arg1, 0, arg2);
        }
        this.field5466.flip();
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lhd;Ljava/nio/ByteBuffer;)V")
    public class389(class17 arg0, ByteBuffer arg1) {
        this.field5465 = arg0;
        this.field5466 = arg1;
    }
}
