import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class16 extends class422 {

    @OriginalMember(owner = "client!qo", name = "Z", descriptor = "[B")
    private byte[] field205;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(III)[B")
    public final byte[] method132(int arg0, int arg1, int arg2) {
        this.field205 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1593((byte) 66, arg1, arg0, arg2);
        return this.field205;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IB)V")
    public final void method133(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field205[var10001] = (byte) (var4 * 3 >> 5);
        this.field205[var5] = (byte) (var4 * 3 >> 5);
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "()V")
    public class16() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
