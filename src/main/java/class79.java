import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class79 extends class205 {

    @OriginalMember(owner = "client!oe", name = "B", descriptor = "[B")
    private byte[] field1015;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)[B", line = 3)
    public final byte[] method561(int arg0, int arg1, int arg2) {
        this.field1015 = new byte[arg0 * arg1 * arg2 * 2];
        this.method532(arg0, (byte) 121, arg1, arg2);
        return this.field1015;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)V", line = 9)
    public final void method562(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field1015[var10001] = var4;
        this.field1015[var5] = var4;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V", line = 16)
    public class79() {
        super(12, 5, 16, 2, 2, 0.45F);
    }
}
