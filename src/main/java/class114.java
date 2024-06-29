import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class114 extends class273 {

    @OriginalMember(owner = "client!je", name = "G", descriptor = "[B")
    private byte[] field1677;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III)[B", line = 3)
    public final byte[] method822(int arg0, int arg1, int arg2) {
        this.field1677 = new byte[arg0 * arg1 * arg2 * 2];
        this.method739(arg2, 4, arg0, arg1);
        return this.field1677;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IB)V", line = 9)
    public final void method823(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field1677[var10001] = (byte) (var4 * 3 >> 5);
        this.field1677[var5] = (byte) (var4 >> 2);
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V", line = 16)
    public class114() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
