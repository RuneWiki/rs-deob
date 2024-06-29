import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class376 extends class407 {

    @OriginalMember(owner = "client!v", name = "x", descriptor = "[B")
    private byte[] field5190;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IB)V", line = 4)
    public final void method2313(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field5190[var10001] = var4;
        this.field5190[var5] = var4;
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V", line = 10)
    public class376() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(III)[B", line = 13)
    public final byte[] method2314(int arg0, int arg1, int arg2) {
        this.field5190 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1595(arg2, arg1, (byte) 119, arg0);
        return this.field5190;
    }
}
