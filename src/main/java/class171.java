import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class171 extends class152 {

    @OriginalMember(owner = "client!g", name = "G", descriptor = "[B")
    private byte[] field2731;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(III)[B", line = 3)
    public final byte[] method1173(int arg0, int arg1, int arg2) {
        this.field2731 = new byte[arg0 * arg1 * arg2 * 2];
        this.method2318(arg0, (byte) 99, arg1, arg2);
        return this.field2731;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(IB)V", line = 9)
    public final void method1064(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field2731[var10001] = var4;
        this.field2731[var5] = var4;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V", line = 16)
    public class171() {
        super(12, 5, 16, 2, 2, 0.45F);
    }
}
