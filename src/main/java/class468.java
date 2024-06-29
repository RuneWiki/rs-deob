import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class468 extends class476 {

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field6941;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)[B")
    public final byte[] method2799(int arg0) {
        byte[] var2 = new byte[this.field6941.capacity()];
        this.field6941.position(0);
        this.field6941.get(var2);
        if (arg0 != -13873) {
            this.field6941 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)[B")
    public final byte[] method2800(int arg0, int arg1, int arg2) {
        this.field6941.position(arg0);
        byte[] var4 = new byte[arg1];
        this.field6941.get(var4, arg2, arg1);
        return var4;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "([BB)V")
    public final void method2801(byte[] arg0, byte arg1) {
        this.field6941 = ByteBuffer.allocateDirect(arg0.length);
        if (arg1 != 77) {
            this.method2801(null, (byte) 83);
        }
        this.field6941.position(0);
        this.field6941.put(arg0);
    }
}
