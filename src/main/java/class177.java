import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class177 extends class259 {

    @OriginalMember(owner = "client!ig", name = "B", descriptor = "[B")
    private byte[] field2842;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(III)[B", line = 3)
    public final byte[] method1176(int arg0, int arg1, int arg2) {
        this.field2842 = new byte[arg0 * arg1 * arg2 * 2];
        this.method577(85, arg1, arg2, arg0);
        return this.field2842;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IB)V", line = 9)
    public final void method1177(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field2842[var10001] = var4;
        this.field2842[var5] = var4;
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V", line = 15)
    public class177() {
        super(12, 5, 16, 2, 2, 0.45F);
    }
}
