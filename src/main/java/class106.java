import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class106 extends class62 {

    @OriginalMember(owner = "client!ok", name = "N", descriptor = "[B")
    private byte[] field1793;

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V", line = 4)
    public class106() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IB)V", line = 8)
    public final void method512(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field1793[var10001] = (byte) (var4 * 3 >> 5);
        this.field1793[var5] = (byte) (var4 >> 2);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)[B", line = 15)
    public final byte[] method800(int arg0, int arg1, int arg2) {
        this.field1793 = new byte[arg0 * arg1 * arg2 * 2];
        this.method917(arg0, 108, arg2, arg1);
        return this.field1793;
    }
}
