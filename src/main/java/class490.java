import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class490 extends class602 {

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field6496;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I[B)V")
    public final void method2680(int arg0, byte[] arg1) {
        if (arg0 != -12107) {
            this.field6496 = null;
        }
        this.field6496 = ByteBuffer.allocateDirect(arg1.length);
        this.field6496.position(0);
        this.field6496.put(arg1);
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(B)[B")
    public final byte[] method2681(byte arg0) {
        if (arg0 != -49) {
            this.method2681((byte) -29);
        }
        byte[] var2 = new byte[this.field6496.capacity()];
        this.field6496.position(0);
        this.field6496.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)[B")
    public final byte[] method2682(int arg0, int arg1, int arg2) {
        byte[] var4 = new byte[arg2];
        this.field6496.position(arg1);
        this.field6496.get(var4, arg0, arg2);
        return var4;
    }
}
