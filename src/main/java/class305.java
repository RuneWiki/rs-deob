import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class305 extends class77 {

    @OriginalMember(owner = "client!ni", name = "C", descriptor = "[B")
    private byte[] field5242;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IB)V", line = 4)
    public final void method597(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field5242[var10001] = (byte) (var4 * 3 >> 5);
        this.field5242[var5] = (byte) (var4 >> 2);
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(III)[B", line = 11)
    public final byte[] method2086(int arg0, int arg1, int arg2) {
        this.field5242 = new byte[arg0 * arg1 * arg2 * 2];
        this.method956(arg0, arg1, arg2, (byte) -86);
        return this.field5242;
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V", line = 16)
    public class305() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
