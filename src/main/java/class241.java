import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class241 extends class110 {

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "[B")
    private byte[] field4196;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(IB)V", line = 4)
    public final void method798(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field4196[var10001] = var4;
        this.field4196[var5] = var4;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V", line = 10)
    public class241() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(III)[B", line = 13)
    public final byte[] method1671(int arg0, int arg1, int arg2) {
        this.field4196 = new byte[arg0 * arg1 * arg2 * 2];
        this.method2136(-99, arg2, arg0, arg1);
        return this.field4196;
    }
}
