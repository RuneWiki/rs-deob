import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class535 extends class277 {

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field7497;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([BI)V")
    public final void method1617(byte[] arg0, int arg1) {
        this.field7497 = ByteBuffer.allocateDirect(arg0.length);
        this.field7497.position(0);
        this.field7497.put(arg0);
        if (arg1 != -1250804670) {
            this.method1620((byte) -81);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)[B")
    public final byte[] method1620(byte arg0) {
        byte[] var2 = new byte[this.field7497.capacity()];
        this.field7497.position(0);
        if (arg0 < 99) {
            this.method1617(null, 5);
        }
        this.field7497.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BII)[B")
    public final byte[] method1616(byte arg0, int arg1, int arg2) {
        if (arg0 == 80) {
            this.field7497.position(arg2);
            byte[] var4 = new byte[arg1];
            this.field7497.get(var4, 0, arg1);
            return var4;
        } else {
            return (byte[]) null;
        }
    }
}
