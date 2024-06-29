import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class167 extends class55 {

    @OriginalMember(owner = "client!id", name = "C", descriptor = "[B")
    private byte[] field2397;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(III)[B")
    public final byte[] method1169(int arg0, int arg1, int arg2) {
        this.field2397 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1243(arg1, arg2, -1, arg0);
        return this.field2397;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)V")
    public final void method398(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field2397[var10001] = (byte) (var4 * 3 >> 5);
        this.field2397[var5] = (byte) (var4 * 3 >> 5);
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
    public class167() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
