import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class279 extends class608 {

    @OriginalMember(owner = "client!mda", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3259;

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "(I)[B", line = 7)
    public final byte[] method1618(int arg0) {
        byte[] var2 = new byte[this.field3259.capacity()];
        this.field3259.position(arg0);
        this.field3259.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(I[B)V", line = 20)
    public final void method1619(int arg0, byte[] arg1) {
        this.field3259 = ByteBuffer.allocateDirect(arg1.length);
        this.field3259.position(arg0);
        this.field3259.put(arg1);
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(III)[B", line = 30)
    public final byte[] method1620(int arg0, int arg1, int arg2) {
        byte[] var4 = new byte[arg1];
        this.field3259.position(arg2);
        this.field3259.get(var4, arg0, arg1);
        return var4;
    }
}
