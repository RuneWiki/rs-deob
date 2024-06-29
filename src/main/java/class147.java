import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class147 extends class292 {

    @OriginalMember(owner = "client!dl", name = "O", descriptor = "[B")
    private byte[] field2047;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)[B", line = 3)
    public final byte[] method1135(int arg0, int arg1, int arg2) {
        this.field2047 = new byte[arg0 * arg1 * arg2 * 2];
        this.method532(arg0, (byte) 103, arg1, arg2);
        return this.field2047;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IB)V", line = 10)
    public final void method1136(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field2047[var10001] = (byte) (var4 * 3 >> 5);
        this.field2047[var5] = (byte) (var4 >> 2);
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V", line = 17)
    public class147() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
