import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class66 extends class181 {

    @OriginalMember(owner = "client!wh", name = "E", descriptor = "[B")
    private byte[] field961;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)[B", line = 3)
    public final byte[] method459(int arg0, int arg1, int arg2) {
        this.field961 = new byte[arg0 * arg1 * arg2 * 2];
        this.method58(arg2, arg0, (byte) 74, arg1);
        return this.field961;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(IB)V", line = 9)
    public final void method460(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field961[var10001] = var4;
        this.field961[var5] = var4;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V", line = 15)
    public class66() {
        super(12, 5, 16, 2, 2, 0.45F);
    }
}
