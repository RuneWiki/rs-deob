import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class48 extends class18 {

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field968;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)[B")
    public final byte[] method152(int arg0) {
        byte[] var2 = new byte[this.field968.capacity()];
        this.field968.position(arg0);
        this.field968.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "([BI)V")
    public final void method151(byte[] arg0, int arg1) {
        this.field968 = ByteBuffer.allocateDirect(arg0.length);
        if (arg1 == -4532) {
            this.field968.position(0);
            this.field968.put(arg0);
        }
    }
}
