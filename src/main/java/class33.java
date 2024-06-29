import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class33 extends class351 {

    @OriginalMember(owner = "client!he", name = "E", descriptor = "[B")
    private byte[] field412;

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
    public class33() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(III)[B")
    public final byte[] method171(int arg0, int arg1, int arg2) {
        this.field412 = new byte[arg0 * arg1 * arg2 * 2];
        this.method2615(arg0, arg1, (byte) 122, arg2);
        return this.field412;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IB)V")
    public final void method172(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field412[var10001] = var4;
        this.field412[var5] = var4;
    }
}
