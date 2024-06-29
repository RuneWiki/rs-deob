import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class430 extends class353 {

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field5994;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "([BB)V", line = 7)
    public final void method2219(byte[] arg0, byte arg1) {
        this.field5994 = ByteBuffer.allocateDirect(arg0.length);
        int var3 = 29 / ((-arg1 - 58) / 32);
        this.field5994.position(0);
        this.field5994.put(arg0);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)[B", line = 19)
    public final byte[] method2223(int arg0) {
        byte[] var2 = new byte[this.field5994.capacity()];
        this.field5994.position(0);
        this.field5994.get(var2);
        if (arg0 != 16383) {
            this.field5994 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)[B", line = 35)
    public final byte[] method2220(int arg0, int arg1, int arg2) {
        byte[] var4 = new byte[arg2];
        if (arg0 > -36) {
            this.method2220(-88, 23, 62);
        }
        this.field5994.position(arg1);
        this.field5994.get(var4, 0, arg2);
        return var4;
    }
}
