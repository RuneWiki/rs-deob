import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class85 extends class110 {

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1497;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)[B", line = 6)
    public final byte[] method541(int arg0) {
        byte[] var2 = new byte[this.field1497.capacity()];
        if (arg0 != -12635) {
            this.method541(-83);
        }
        this.field1497.position(0);
        this.field1497.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([BI)V", line = 23)
    public final void method542(byte[] arg0, int arg1) {
        this.field1497 = ByteBuffer.allocateDirect(arg0.length);
        this.field1497.position(0);
        this.field1497.put(arg0);
        if (arg1 != 6592) {
            this.method541(-75);
        }
    }
}
