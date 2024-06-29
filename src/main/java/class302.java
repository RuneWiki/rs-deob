import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class302 extends class383 {

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4290;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIB)[B")
    public final byte[] method1858(int arg0, int arg1, byte arg2) {
        this.field4290.position(arg0);
        if (arg2 != 127) {
            this.method1860(22);
        }
        byte[] var4 = new byte[arg1];
        this.field4290.get(var4, 0, arg1);
        return var4;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z[B)V")
    public final void method1859(boolean arg0, byte[] arg1) {
        this.field4290 = ByteBuffer.allocateDirect(arg1.length);
        if (!arg0) {
            this.field4290.position(0);
            this.field4290.put(arg1);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)[B")
    public final byte[] method1860(int arg0) {
        byte[] var2 = new byte[this.field4290.capacity()];
        this.field4290.position(0);
        this.field4290.get(var2);
        int var3 = -125 / ((59 - arg0) / 54);
        return var2;
    }
}
