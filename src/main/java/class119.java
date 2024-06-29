import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class119 extends class343 {

    @OriginalMember(owner = "client!gf", name = "N", descriptor = "[B")
    private byte[] field1848;

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V", line = 3)
    public class119() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(III)[B", line = 6)
    public final byte[] method905(int arg0, int arg1, int arg2) {
        this.field1848 = new byte[arg0 * arg1 * arg2 * 2];
        this.method873(arg1, (byte) -126, arg0, arg2);
        return this.field1848;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(IB)V", line = 12)
    public final void method906(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field1848[var10001] = (byte) (var4 * 3 >> 5);
        this.field1848[var5] = (byte) (var4 >> 2);
    }
}
