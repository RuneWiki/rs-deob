import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class227 extends class48 {

    @OriginalMember(owner = "client!hm", name = "Q", descriptor = "[B")
    private byte[] field3628;

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "()V", line = 3)
    public class227() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IB)V", line = 8)
    public final void method345(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field3628[var10001] = var4;
        this.field3628[var5] = var4;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(III)[B", line = 14)
    public final byte[] method1629(int arg0, int arg1, int arg2) {
        this.field3628 = new byte[arg0 * arg1 * arg2 * 2];
        this.method739(arg2, 4, arg0, arg1);
        return this.field3628;
    }
}
