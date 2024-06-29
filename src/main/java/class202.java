import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class202 extends class109 {

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2938;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)[B", line = 5)
    public final byte[] method896(int arg0, int arg1, int arg2) {
        if (arg2 != 13) {
            this.field2938 = null;
        }
        this.field2938.position(arg0);
        byte[] var4 = new byte[arg1];
        this.field2938.get(var4, 0, arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)[B", line = 22)
    public final byte[] method897(byte arg0) {
        int var2 = 126 / ((arg0 - 66) / 55);
        byte[] var3 = new byte[this.field2938.capacity()];
        this.field2938.position(0);
        this.field2938.get(var3);
        return var3;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I[B)V", line = 33)
    public final void method898(int arg0, byte[] arg1) {
        this.field2938 = ByteBuffer.allocateDirect(arg1.length);
        this.field2938.position(0);
        if (arg0 == 2) {
            this.field2938.put(arg1);
        }
    }
}
