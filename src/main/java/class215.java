import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class215 extends class308 {

    @OriginalMember(owner = "client!kg", name = "O", descriptor = "[B")
    private byte[] field3166;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IB)V", line = 4)
    public final void method1632(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field3166[var10001] = var4;
        this.field3166[var5] = var4;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)[B", line = 11)
    public final byte[] method1633(int arg0, int arg1, int arg2) {
        this.field3166 = new byte[arg0 * arg1 * arg2 * 2];
        this.method2367(arg2, (byte) 94, arg0, arg1);
        return this.field3166;
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V", line = 16)
    public class215() {
        super(12, 5, 16, 2, 2, 0.45F);
    }
}
