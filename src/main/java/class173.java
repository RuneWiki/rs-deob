import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class173 extends class210 {

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2981;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(B)[B", line = 6)
    public final byte[] method1355(byte arg0) {
        if (arg0 != -98) {
            this.method1356((byte[]) null, -8);
        }
        byte[] var2 = new byte[this.field2981.capacity()];
        this.field2981.position(0);
        this.field2981.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "([BI)V", line = 23)
    public final void method1356(byte[] arg0, int arg1) {
        if (arg1 != 1215096351) {
            this.field2981 = (ByteBuffer) null;
        }
        this.field2981 = ByteBuffer.allocateDirect(arg0.length);
        this.field2981.position(0);
        this.field2981.put(arg0);
    }
}
