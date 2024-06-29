import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class343 extends class70 {

    @OriginalMember(owner = "client!at", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field5023;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(III)[B", line = 10)
    public final byte[] method684(int arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            this.method679(null, -89);
        }
        byte[] var4 = new byte[arg1];
        this.field5023.position(arg0);
        this.field5023.get(var4, 0, arg1);
        return var4;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "([BI)V", line = 23)
    public final void method679(byte[] arg0, int arg1) {
        this.field5023 = ByteBuffer.allocateDirect(arg0.length);
        this.field5023.position(0);
        if (arg1 != -1) {
            this.field5023 = null;
        }
        this.field5023.put(arg0);
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(I)[B", line = 36)
    public final byte[] method685(int arg0) {
        byte[] var2 = new byte[this.field5023.capacity()];
        this.field5023.position(0);
        this.field5023.get(var2);
        int var3 = 6 / ((arg0 - 23) / 61);
        return var2;
    }
}
