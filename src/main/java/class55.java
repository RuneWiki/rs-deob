import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class55 extends class154 {

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1255;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)[B")
    public final byte[] method395(int arg0) {
        byte[] var2 = new byte[this.field1255.capacity()];
        this.field1255.position(0);
        this.field1255.get(var2);
        return arg0 >= -9 ? (byte[]) null : var2;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "([BI)V")
    public final void method396(byte[] arg0, int arg1) {
        this.field1255 = ByteBuffer.allocateDirect(arg0.length);
        this.field1255.position(0);
        if (arg1 < -67) {
            this.field1255.put(arg0);
        }
    }
}
