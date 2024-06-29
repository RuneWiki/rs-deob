import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class189 extends class294 {

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2727;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)[B")
    public final byte[] method1185(int arg0) {
        byte[] var2 = new byte[this.field2727.capacity()];
        this.field2727.position(0);
        int var3 = 118 % ((-arg0 - 24) / 46);
        this.field2727.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IBI)[B")
    public final byte[] method1186(int arg0, byte arg1, int arg2) {
        if (arg1 <= 118) {
            this.field2727 = null;
        }
        byte[] var4 = new byte[arg0];
        this.field2727.position(arg2);
        this.field2727.get(var4, 0, arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "([BI)V")
    public final void method1187(byte[] arg0, int arg1) {
        this.field2727 = ByteBuffer.allocateDirect(arg0.length);
        if (arg1 >= 92) {
            this.field2727.position(0);
            this.field2727.put(arg0);
        }
    }
}
