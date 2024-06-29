import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class473 extends class91 {

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field7078;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)[B")
    public final byte[] method709(int arg0, int arg1, int arg2) {
        if (arg1 != 32259) {
            this.method710(null, 80);
        }
        this.field7078.position(arg2);
        byte[] var4 = new byte[arg0];
        this.field7078.get(var4, 0, arg0);
        return var4;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(Z)[B")
    public final byte[] method711(boolean arg0) {
        if (arg0) {
            byte[] var2 = new byte[this.field7078.capacity()];
            this.field7078.position(0);
            this.field7078.get(var2);
            return var2;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([BI)V")
    public final void method710(byte[] arg0, int arg1) {
        this.field7078 = ByteBuffer.allocateDirect(arg0.length);
        this.field7078.position(arg1);
        this.field7078.put(arg0);
    }
}
