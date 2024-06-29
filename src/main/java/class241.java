import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aia")
public class class241 extends class102 {

    @OriginalMember(owner = "client!aia", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3180;

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(III)[B")
    public final byte[] method791(int arg0, int arg1, int arg2) {
        this.field3180.position(arg1);
        byte[] var4 = new byte[arg2];
        this.field3180.get(var4, arg0, arg2);
        return var4;
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "([BI)V")
    public final void method789(byte[] arg0, int arg1) {
        this.field3180 = ByteBuffer.allocateDirect(arg0.length);
        if (arg1 > -79) {
            this.method789(null, 125);
        }
        this.field3180.position(0);
        this.field3180.put(arg0);
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(I)[B")
    public final byte[] method790(int arg0) {
        if (arg0 >= -40) {
            this.field3180 = null;
        }
        byte[] var2 = new byte[this.field3180.capacity()];
        this.field3180.position(0);
        this.field3180.get(var2);
        return var2;
    }
}
