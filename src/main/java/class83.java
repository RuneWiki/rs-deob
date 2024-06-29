import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class83 extends class64 {

    @OriginalMember(owner = "client!tn", name = "C", descriptor = "[B")
    private byte[] field1590;

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "()V", line = 4)
    public class83() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(III)[B", line = 7)
    public final byte[] method590(int arg0, int arg1, int arg2) {
        this.field1590 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1006(1023, arg1, arg2, arg0);
        return this.field1590;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IB)V", line = 13)
    public final void method487(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field1590[var10001] = var4;
        this.field1590[var5] = var4;
    }
}
