import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class273 extends class208 {

    @OriginalMember(owner = "client!tj", name = "I", descriptor = "[B")
    private byte[] field4747;

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V", line = 3)
    public class273() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IB)V", line = 7)
    public final void method1372(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field4747[var10001] = var4;
        this.field4747[var5] = var4;
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(III)[B", line = 13)
    public final byte[] method1927(int arg0, int arg1, int arg2) {
        this.field4747 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1261(arg2, arg1, arg0, (byte) 19);
        return this.field4747;
    }
}
