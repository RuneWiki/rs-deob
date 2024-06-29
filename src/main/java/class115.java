import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class115 extends class181 {

    @OriginalMember(owner = "client!pq", name = "H", descriptor = "[B")
    private byte[] field1606;

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(III)[B")
    public final byte[] method906(int arg0, int arg1, int arg2) {
        this.field1606 = new byte[arg0 * arg1 * arg2 * 2];
        this.method65(arg2, arg1, arg0, (byte) 89);
        return this.field1606;
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "()V")
    public class115() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IB)V")
    public final void method907(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field1606[var10001] = (byte) (var4 * 3 >> 5);
        this.field1606[var5] = (byte) (var4 * 3 >> 5);
    }
}
