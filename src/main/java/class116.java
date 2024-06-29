import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class116 extends class23 {

    @OriginalMember(owner = "client!eb", name = "U", descriptor = "[B")
    private byte[] field2084;

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V", line = 3)
    public class116() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(III)[B", line = 6)
    public final byte[] method830(int arg0, int arg1, int arg2) {
        this.field2084 = new byte[arg0 * arg1 * arg2 * 2];
        this.method2069(arg1, arg2, (byte) 63, arg0);
        return this.field2084;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)V", line = 13)
    public final void method216(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field2084[var10001] = (byte) (var4 * 3 >> 5);
        this.field2084[var5] = (byte) (var4 >> 2);
    }
}
