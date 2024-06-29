import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class169 extends class609 {

    @OriginalMember(owner = "client!uq", name = "F", descriptor = "Lwq;")
    public static class176 field2433 = null;

    @OriginalMember(owner = "client!uq", name = "G", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!uq", name = "I", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!uq", name = "H", descriptor = "[B")
    private byte[] field2435;

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "(B)V", line = 5)
    public static void method1294(byte arg0) {
        field2433 = null;
        if (arg0 >= -66) {
            field2433 = null;
        }
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(IIII)[B", line = 16)
    public final byte[] method1295(int arg0, int arg1, int arg2, int arg3) {
        this.field2435 = new byte[arg1 * arg3 * 2 * arg2];
        field2436++;
        this.method1626(arg2, arg1, -114, arg3);
        if (arg0 != -1) {
            method1294((byte) -35);
        }
        return this.field2435;
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "()V", line = 29)
    public class169() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZBI)V", line = 32)
    public final void method1296(boolean arg0, byte arg1, int arg2) {
        if (!arg0) {
            field2433 = null;
        }
        field2434++;
        byte var4 = (byte) ((arg1 >> 1 & 0x7F) + 127);
        int var5 = arg2 * 2;
        int var10001 = var5;
        int var6 = var5 + 1;
        this.field2435[var10001] = var4;
        this.field2435[var6] = var4;
    }
}
