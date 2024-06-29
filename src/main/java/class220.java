import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class220 extends class267 {

    @OriginalMember(owner = "client!md", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3870;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(B)[B")
    public final byte[] method1486(byte arg0) {
        byte[] var2 = new byte[this.field3870.capacity()];
        this.field3870.position(0);
        int var3 = 111 / ((40 - arg0) / 58);
        this.field3870.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B[B)V")
    public final void method1487(byte arg0, byte[] arg1) {
        if (arg0 == 60) {
            this.field3870 = ByteBuffer.allocateDirect(arg1.length);
            this.field3870.position(0);
            this.field3870.put(arg1);
        }
    }
}
