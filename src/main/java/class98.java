import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class98 extends class168 {

    @OriginalMember(owner = "client!in", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1360;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I[B)V")
    public final void method764(int arg0, byte[] arg1) {
        if (arg0 != 13) {
            this.field1360 = null;
        }
        this.field1360 = ByteBuffer.allocateDirect(arg1.length);
        this.field1360.position(0);
        this.field1360.put(arg1);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)[B")
    public final byte[] method765(int arg0) {
        byte[] var2 = new byte[this.field1360.capacity()];
        this.field1360.position(0);
        this.field1360.get(var2);
        if (arg0 > -83) {
            this.field1360 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(III)[B")
    public final byte[] method766(int arg0, int arg1, int arg2) {
        byte[] var4 = new byte[arg0];
        int var5 = -19 / ((arg2 + 73) / 34);
        this.field1360.position(arg1);
        this.field1360.get(var4, 0, arg0);
        return var4;
    }
}
