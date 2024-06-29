import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class131 extends class523 {

    @OriginalMember(owner = "client!ao", name = "H", descriptor = "Lcb;")
    public static class318 field1674 = new class318(58, 7);

    @OriginalMember(owner = "client!ao", name = "J", descriptor = "I")
    public static int field1676 = 0;

    @OriginalMember(owner = "client!ao", name = "F", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!ao", name = "G", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!ao", name = "I", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!ao", name = "E", descriptor = "[B")
    private byte[] field1671;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(BII)V", line = 3)
    public final void method861(byte arg0, int arg1, int arg2) {
        if (arg2 != 768203713) {
            field1674 = null;
        }
        field1673++;
        byte var4 = (byte) ((arg0 >> 1 & 0x7F) + 127);
        int var5 = arg1 * 2;
        int var10001 = var5;
        int var6 = var5 + 1;
        this.field1671[var10001] = var4;
        this.field1671[var6] = var4;
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "()V", line = 21)
    public class131() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIB)[B", line = 24)
    public final byte[] method862(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 66) {
            this.field1671 = null;
        }
        field1675++;
        this.field1671 = new byte[arg0 * arg1 * 2 * arg2];
        this.method3645(arg0, arg2, arg1, -23747);
        return this.field1671;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V", line = 43)
    public static void method863(int arg0) {
        if (arg0 == -9027) {
            field1674 = null;
        }
    }
}
