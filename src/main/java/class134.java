import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class134 extends class46 {

    @OriginalMember(owner = "client!th", name = "E", descriptor = "[B")
    private byte[] field1883;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(III)[B", line = 3)
    public final byte[] method809(int arg0, int arg1, int arg2) {
        this.field1883 = new byte[arg0 * arg1 * arg2 * 2];
        this.method2628(arg1, arg0, false, arg2);
        return this.field1883;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IB)V", line = 9)
    public final void method366(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field1883[var10001] = (byte) (var4 * 3 >> 5);
        this.field1883[var5] = (byte) (var4 * 3 >> 5);
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V", line = 17)
    public class134() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
