import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class309 extends class12 {

    @OriginalMember(owner = "client!qm", name = "S", descriptor = "[B")
    private byte[] field5178;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IB)V", line = 4)
    public final void method101(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field5178[var10001] = var4;
        this.field5178[var5] = var4;
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V", line = 10)
    public class309() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(III)[B", line = 14)
    public final byte[] method2093(int arg0, int arg1, int arg2) {
        this.field5178 = new byte[arg0 * arg1 * arg2 * 2];
        this.method698(arg1, arg0, arg2, 255);
        return this.field5178;
    }
}
