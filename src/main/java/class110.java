import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class110 extends class211 {

    @OriginalMember(owner = "client!bc", name = "E", descriptor = "[B")
    private byte[] field1860;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)V", line = 5)
    public final void method844(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field1860[var10001] = var4;
        this.field1860[var5] = var4;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V", line = 11)
    public class110() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(III)[B", line = 14)
    public final byte[] method845(int arg0, int arg1, int arg2) {
        this.field1860 = new byte[arg0 * arg1 * arg2 * 2];
        this.method742((byte) 85, arg1, arg0, arg2);
        return this.field1860;
    }
}
