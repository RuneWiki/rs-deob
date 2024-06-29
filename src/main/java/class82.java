import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class82 extends class160 {

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1951;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)[B")
    public final byte[] method703(int arg0) {
        if (arg0 != -1) {
            this.field1951 = null;
        }
        byte[] var2 = new byte[this.field1951.capacity()];
        this.field1951.position(0);
        this.field1951.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([BB)V")
    public final void method704(byte[] arg0, byte arg1) {
        this.field1951 = ByteBuffer.allocateDirect(arg0.length);
        this.field1951.position(0);
        this.field1951.put(arg0);
        int var3 = -44 / ((arg1 - 57) / 33);
    }
}
