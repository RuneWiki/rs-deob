import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class199 {

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "Lcg;")
    public class393 field3009;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field3008;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([BI)V")
    public final void method1194(byte[] arg0, int arg1) {
        if (this.field3008 == null || this.field3008.capacity() < arg1) {
            this.field3008 = ByteBuffer.allocateDirect(arg1);
        } else {
            this.field3008.clear();
        }
        this.field3008.put(arg0, 0, arg1);
        this.field3008.flip();
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lcg;[BI)V")
    public class199(class393 arg0, byte[] arg1, int arg2) {
        this.field3009 = arg0;
        this.field3008 = ByteBuffer.allocateDirect(arg2);
        if (arg1 != null) {
            this.field3008.put(arg1, 0, arg2);
        }
        this.field3008.flip();
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lcg;Ljava/nio/ByteBuffer;)V")
    public class199(class393 arg0, ByteBuffer arg1) {
        this.field3009 = arg0;
        this.field3008 = arg1;
    }
}
