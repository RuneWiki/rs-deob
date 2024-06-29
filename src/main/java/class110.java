import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class110 extends class80 {

    @OriginalMember(owner = "client!oe", name = "H", descriptor = "[B")
    private byte[] field1615;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)[B")
    public final byte[] method736(int arg0, int arg1, int arg2) {
        this.field1615 = new byte[arg0 * arg1 * arg2 * 2];
        this.method2322(-6496, arg0, arg2, arg1);
        return this.field1615;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
    public class110() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)V")
    public final void method572(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field1615[var10001] = var4;
        this.field1615[var5] = var4;
    }
}
