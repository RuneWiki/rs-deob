import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class309 extends class373 {

    @OriginalMember(owner = "client!bi", name = "E", descriptor = "[B")
    private byte[] field4385;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)V")
    public final void method1920(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field4385[var10001] = (byte) (var4 * 3 >> 5);
        this.field4385[var5] = (byte) (var4 * 3 >> 5);
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V")
    public class309() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)[B")
    public final byte[] method1921(int arg0, int arg1, int arg2) {
        this.field4385 = new byte[arg0 * arg1 * arg2 * 2];
        this.method2187((byte) 110, arg2, arg0, arg1);
        return this.field4385;
    }
}
