import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class300 extends class46 {

    @OriginalMember(owner = "client!ak", name = "U", descriptor = "[B")
    private byte[] field5164;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(IB)V", line = 4)
    public final void method350(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field5164[var10001] = (byte) (var4 * 3 >> 5);
        this.field5164[var5] = (byte) (var4 >> 2);
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V", line = 12)
    public class300() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(III)[B", line = 15)
    public final byte[] method2094(int arg0, int arg1, int arg2) {
        this.field5164 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1933(-32247, arg2, arg1, arg0);
        return this.field5164;
    }
}
