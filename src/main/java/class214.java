import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class214 extends class237 {

    @OriginalMember(owner = "client!ca", name = "I", descriptor = "[B")
    private byte[] field3210;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(III)[B")
    public final byte[] method1432(int arg0, int arg1, int arg2) {
        this.field3210 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1243(arg1, arg2, -1, arg0);
        return this.field3210;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
    public class214() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IB)V")
    public final void method1433(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field3210[var10001] = var4;
        this.field3210[var5] = var4;
    }
}
