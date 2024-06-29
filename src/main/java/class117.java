import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class117 extends class30 {

    @OriginalMember(owner = "client!qca", name = "C", descriptor = "Lkg;")
    public static class275 field1887 = new class275(0, 2, 2, 1);

    @OriginalMember(owner = "client!qca", name = "I", descriptor = "I")
    public static int field1892 = -1;

    @OriginalMember(owner = "client!qca", name = "B", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!qca", name = "D", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!qca", name = "F", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!qca", name = "H", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!qca", name = "J", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!qca", name = "G", descriptor = "[B")
    private byte[] field1890;

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "(IIII)[B", line = 6)
    public final byte[] method959(int arg0, int arg1, int arg2, int arg3) {
        field1886++;
        if (arg3 != 4096) {
            field1887 = null;
        }
        this.field1890 = new byte[arg0 * arg1 * arg2 * 2];
        this.method3292(arg0, arg2, arg1, 0);
        return this.field1890;
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(IZB)V", line = 19)
    public final void method269(int arg0, boolean arg1, byte arg2) {
        field1889++;
        byte var4 = (byte) ((arg2 >> 1 & 0x7F) + 127);
        int var5 = arg0 * 2;
        if (arg1) {
            field1888 = 119;
        }
        this.field1890[var5++] = var4;
        this.field1890[var5] = var4;
    }

    @OriginalMember(owner = "client!qca", name = "<init>", descriptor = "()V", line = 34)
    public class117() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!qca", name = "e", descriptor = "(I)V", line = 43)
    public static void method960(int arg0) {
        int var1 = -1 / ((-arg0 - 74) / 48);
        field1887 = null;
    }
}
