import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class66 extends class22 {

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1075;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)[B", line = 7)
    public final byte[] method115(int arg0) {
        byte[] var2 = new byte[this.field1075.capacity()];
        int var3 = 12 % ((arg0 + 76) / 50);
        this.field1075.position(0);
        this.field1075.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I[B)V", line = 19)
    public final void method112(int arg0, byte[] arg1) {
        this.field1075 = ByteBuffer.allocateDirect(arg1.length);
        this.field1075.position(0);
        this.field1075.put(arg1);
        if (arg0 != -13520) {
            this.method115(-25);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZII)[B", line = 32)
    public final byte[] method111(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            return (byte[]) null;
        } else {
            this.field1075.position(arg1);
            byte[] var4 = new byte[arg2];
            this.field1075.get(var4, 0, arg2);
            return var4;
        }
    }
}
