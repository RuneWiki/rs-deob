import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class267 extends class26 {

    @OriginalMember(owner = "client!mi", name = "H", descriptor = "[B")
    private byte[] field4802;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(III)[B", line = 3)
    public final byte[] method1910(int arg0, int arg1, int arg2) {
        this.field4802 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1308(arg2, (byte) 85, arg1, arg0);
        return this.field4802;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V", line = 8)
    public class267() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IB)V", line = 12)
    public final void method227(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field4802[var10001] = (byte) (var4 * 3 >> 5);
        this.field4802[var5] = (byte) (var4 >> 2);
    }
}
