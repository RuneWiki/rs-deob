import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class298 extends class277 {

    @OriginalMember(owner = "client!af", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4108;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(III)[B")
    public final byte[] method1565(int arg0, int arg1, int arg2) {
        byte[] var4 = new byte[arg2];
        this.field4108.position(arg0);
        this.field4108.get(var4, arg1, arg2);
        return var4;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([BB)V")
    public final void method1567(byte[] arg0, byte arg1) {
        if (arg1 != 60) {
            this.field4108 = null;
        }
        this.field4108 = ByteBuffer.allocateDirect(arg0.length);
        this.field4108.position(0);
        this.field4108.put(arg0);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)[B")
    public final byte[] method1566(int arg0) {
        byte[] var2 = new byte[this.field4108.capacity()];
        this.field4108.position(0);
        this.field4108.get(var2);
        return arg0 <= 63 ? (byte[]) null : var2;
    }
}
