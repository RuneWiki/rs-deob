import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class168 extends class3 {

    @OriginalMember(owner = "client!tf", name = "L", descriptor = "[B")
    private byte[] field2208;

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V", line = 4)
    public class168() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IB)V", line = 8)
    public final void method30(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field2208[var10001] = var4;
        this.field2208[var5] = var4;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)[B", line = 14)
    public final byte[] method1103(int arg0, int arg1, int arg2) {
        this.field2208 = new byte[arg0 * arg1 * arg2 * 2];
        this.method384(arg2, (byte) 119, arg1, arg0);
        return this.field2208;
    }
}
