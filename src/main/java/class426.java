import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class426 extends class192 {

    @OriginalMember(owner = "client!nd", name = "M", descriptor = "[B")
    private byte[] field6134;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IB)V", line = 4)
    public final void method1336(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field6134[var10001] = (byte) (var4 * 3 >> 5);
        this.field6134[var5] = (byte) (var4 * 3 >> 5);
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V", line = 11)
    public class426() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)[B", line = 14)
    public final byte[] method2616(int arg0, int arg1, int arg2) {
        this.field6134 = new byte[arg0 * arg1 * arg2 * 2];
        this.method384(arg2, (byte) 126, arg1, arg0);
        return this.field6134;
    }
}
