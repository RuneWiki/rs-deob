import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class93 extends class291 {

    @OriginalMember(owner = "client!em", name = "U", descriptor = "[B")
    private byte[] field1233;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IB)V", line = 4)
    public final void method670(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field1233[var10001] = (byte) (var4 * 3 >> 5);
        this.field1233[var5] = (byte) (var4 >> 2);
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V", line = 11)
    public class93() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(III)[B", line = 15)
    public final byte[] method671(int arg0, int arg1, int arg2) {
        this.field1233 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1140(arg0, arg2, arg1, 65);
        return this.field1233;
    }
}
