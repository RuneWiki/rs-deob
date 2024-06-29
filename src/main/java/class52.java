import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class52 extends class151 {

    @OriginalMember(owner = "client!al", name = "H", descriptor = "[B")
    private byte[] field615;

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V")
    public class52() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(III)[B")
    public final byte[] method302(int arg0, int arg1, int arg2) {
        this.field615 = new byte[arg0 * arg1 * arg2 * 2];
        this.method398(arg0, arg1, arg2, -32442);
        return this.field615;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IB)V")
    public final void method303(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field615[var10001] = var4;
        this.field615[var5] = var4;
    }
}
