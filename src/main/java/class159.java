import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class159 extends class15 {

    @OriginalMember(owner = "client!jj", name = "N", descriptor = "[B")
    private byte[] field2437;

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V", line = 4)
    public class159() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(IB)V", line = 8)
    public final void method100(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field2437[var10001] = (byte) (var4 * 3 >> 5);
        this.field2437[var5] = (byte) (var4 >> 2);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)[B", line = 15)
    public final byte[] method1096(int arg0, int arg1, int arg2) {
        this.field2437 = new byte[arg0 * arg1 * arg2 * 2];
        this.method2318(arg0, (byte) 75, arg1, arg2);
        return this.field2437;
    }
}
