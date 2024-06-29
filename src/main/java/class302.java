import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class302 extends class734 {

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4347;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "([BB)V", line = 7)
    public final void method1951(byte[] arg0, byte arg1) {
        this.field4347 = ByteBuffer.allocateDirect(arg0.length);
        if (arg1 < 20) {
            this.field4347 = null;
        }
        this.field4347.position(0);
        this.field4347.put(arg0);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)[B", line = 20)
    public final byte[] method1952(int arg0) {
        byte[] var2 = new byte[this.field4347.capacity()];
        this.field4347.position(0);
        if (arg0 != -3427) {
            this.method1953(-48, (byte) -126, 32);
        }
        this.field4347.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IBI)[B", line = 36)
    public final byte[] method1953(int arg0, byte arg1, int arg2) {
        if (arg1 != 114) {
            this.field4347 = null;
        }
        byte[] var4 = new byte[arg0];
        this.field4347.position(arg2);
        this.field4347.get(var4, 0, arg0);
        return var4;
    }
}
