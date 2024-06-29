import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class159 extends class438 {

    @OriginalMember(owner = "client!bq", name = "N", descriptor = "[B")
    private byte[] field2313;

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(III)[B")
    public final byte[] method1155(int arg0, int arg1, int arg2) {
        this.field2313 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1786(arg0, arg2, arg1, -123);
        return this.field2313;
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "()V")
    public class159() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IB)V")
    public final void method1156(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field2313[var10001] = (byte) (var4 * 3 >> 5);
        this.field2313[var5] = (byte) (var4 * 3 >> 5);
    }
}
