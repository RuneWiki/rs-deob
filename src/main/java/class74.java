import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class74 extends class102 {

    @OriginalMember(owner = "client!ps", name = "C", descriptor = "[B")
    private byte[] field1061;

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(III)[B", line = 4)
    public final byte[] method503(int arg0, int arg1, int arg2) {
        this.field1061 = new byte[arg0 * arg1 * arg2 * 2];
        this.method2628(arg1, arg0, false, arg2);
        return this.field1061;
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "()V", line = 9)
    public class74() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IB)V", line = 13)
    public final void method504(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field1061[var10001] = var4;
        this.field1061[var5] = var4;
    }
}
