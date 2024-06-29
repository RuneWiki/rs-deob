import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class72 extends class42 {

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1255;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)[B")
    public final byte[] method276(int arg0) {
        byte[] var2 = new byte[this.field1255.capacity()];
        this.field1255.position(0);
        this.field1255.get(var2);
        if (arg0 != 7752) {
            this.method276(-31);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([BI)V")
    public final void method277(byte[] arg0, int arg1) {
        this.field1255 = ByteBuffer.allocateDirect(arg0.length);
        this.field1255.position(0);
        this.field1255.put(arg0);
        if (arg1 >= -94) {
            this.method277((byte[]) null, 68);
        }
    }
}
