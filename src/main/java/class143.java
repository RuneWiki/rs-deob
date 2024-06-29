import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class143 extends class199 {

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2115;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I[B)V")
    public final void method1026(int arg0, byte[] arg1) {
        this.field2115 = ByteBuffer.allocateDirect(arg1.length);
        this.field2115.position(0);
        int var3 = 76 / ((arg0 + 35) / 44);
        this.field2115.put(arg1);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IZI)[B")
    public final byte[] method1027(int arg0, boolean arg1, int arg2) {
        this.field2115.position(arg0);
        if (arg1) {
            this.field2115 = null;
        }
        byte[] var4 = new byte[arg2];
        this.field2115.get(var4, 0, arg2);
        return var4;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)[B")
    public final byte[] method1028(int arg0) {
        if (arg0 != -24533) {
            this.field2115 = null;
        }
        byte[] var2 = new byte[this.field2115.capacity()];
        this.field2115.position(0);
        this.field2115.get(var2);
        return var2;
    }
}
