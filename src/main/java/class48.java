import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class48 extends class210 {

    @OriginalMember(owner = "client!fl", name = "K", descriptor = "[B")
    private byte[] field758;

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V", line = 3)
    public class48() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(III)[B", line = 6)
    public final byte[] method353(int arg0, int arg1, int arg2) {
        this.field758 = new byte[arg0 * arg1 * arg2 * 2];
        this.method917(arg0, 105, arg2, arg1);
        return this.field758;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IB)V", line = 13)
    public final void method354(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field758[var10001] = var4;
        this.field758[var5] = var4;
    }
}
