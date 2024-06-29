import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class346 extends class24 {

    @OriginalMember(owner = "client!ak", name = "J", descriptor = "[B")
    private byte[] field5514;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(III)[B", line = 3)
    public final byte[] method2431(int arg0, int arg1, int arg2) {
        this.field5514 = new byte[arg0 * arg1 * arg2 * 2];
        this.method2272(1714362860, arg0, arg2, arg1);
        return this.field5514;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IB)V", line = 10)
    public final void method155(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field5514[var10001] = var4;
        this.field5514[var5] = var4;
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V", line = 16)
    public class346() {
        super(12, 5, 16, 2, 2, 0.45F);
    }
}
