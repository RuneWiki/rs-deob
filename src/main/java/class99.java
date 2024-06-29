import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class99 extends class307 {

    @OriginalMember(owner = "client!in", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1104;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(BII)[B", line = 7)
    public final byte[] method822(byte arg0, int arg1, int arg2) {
        this.field1104.position(arg2);
        int var4 = 46 % ((arg0 - 66) / 39);
        byte[] var5 = new byte[arg1];
        this.field1104.get(var5, 0, arg1);
        return var5;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "([BI)V", line = 20)
    public final void method823(byte[] arg0, int arg1) {
        this.field1104 = ByteBuffer.allocateDirect(arg0.length);
        this.field1104.position(0);
        this.field1104.put(arg0);
        if (arg1 != 14) {
            this.field1104 = null;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(B)[B", line = 35)
    public final byte[] method824(byte arg0) {
        byte[] var2 = new byte[this.field1104.capacity()];
        this.field1104.position(0);
        if (arg0 != -12) {
            this.field1104 = null;
        }
        this.field1104.get(var2);
        return var2;
    }
}
