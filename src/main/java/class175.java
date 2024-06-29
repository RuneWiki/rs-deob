import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class175 extends class309 {

    @OriginalMember(owner = "client!dg", name = "E", descriptor = "[B")
    private byte[] field2599;

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V", line = 3)
    public class175() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(III)[B", line = 6)
    public final byte[] method1215(int arg0, int arg1, int arg2) {
        this.field2599 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1628(arg2, arg0, arg1, 255);
        return this.field2599;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)V", line = 12)
    public final void method1216(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field2599[var10001] = var4;
        this.field2599[var5] = var4;
    }
}
