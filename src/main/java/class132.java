import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class132 extends class239 {

    @OriginalMember(owner = "client!sg", name = "H", descriptor = "[B")
    private byte[] field2225;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IB)V", line = 4)
    public final void method1132(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field2225[var10001] = var4;
        this.field2225[var5] = var4;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V", line = 10)
    public class132() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(III)[B", line = 13)
    public final byte[] method1133(int arg0, int arg1, int arg2) {
        this.field2225 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1050(0, arg1, arg0, arg2);
        return this.field2225;
    }
}
