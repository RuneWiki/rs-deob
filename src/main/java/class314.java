import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class314 extends class198 {

    @OriginalMember(owner = "client!ra", name = "I", descriptor = "[B")
    private byte[] field5353;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)[B", line = 3)
    public final byte[] method2198(int arg0, int arg1, int arg2) {
        this.field5353 = new byte[arg0 * arg1 * arg2 * 2];
        this.method158(arg0, arg2, (byte) -29, arg1);
        return this.field5353;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IB)V", line = 9)
    public final void method1526(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field5353[var10001] = var4;
        this.field5353[var5] = var4;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V", line = 15)
    public class314() {
        super(12, 5, 16, 2, 2, 0.45F);
    }
}
