import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class309 extends class88 {

    @OriginalMember(owner = "client!c", name = "V", descriptor = "[B")
    private byte[] field5354;

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V", line = 3)
    public class309() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(IB)V", line = 8)
    public final void method600(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field5354[var10001] = (byte) (var4 * 3 >> 5);
        this.field5354[var5] = (byte) (var4 >> 2);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III)[B", line = 15)
    public final byte[] method2160(int arg0, int arg1, int arg2) {
        this.field5354 = new byte[arg0 * arg1 * arg2 * 2];
        this.method2136(-78, arg2, arg0, arg1);
        return this.field5354;
    }
}
