import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class7 {

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "B")
    private byte field78;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public int field82;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public int field83;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public int field84;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public int field86;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public int field79;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z[B)[B", line = 4)
    public static final byte[] method44(boolean arg0, byte[] arg1) {
        if (arg0) {
            return null;
        }
        field88++;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class85.method613(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)I", line = 20)
    public final int method45(byte arg0) {
        int var2 = 105 / ((12 - arg0) / 52);
        field85++;
        return this.field78 & 0x7;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IBI)I", line = 30)
    public static final int method46(int arg0, byte arg1, int arg2) {
        if (arg1 != 72) {
            return -128;
        }
        field87++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)I", line = 56)
    public final int method47(boolean arg0) {
        if (!arg0) {
            method48((byte) -68, 102);
        }
        field81++;
        return (this.field78 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V", line = 74)
    public class7() {
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)Z", line = 77)
    public static final boolean method48(byte arg0, int arg1) {
        if (arg0 > -111) {
            return true;
        } else {
            field80++;
            return arg1 == 6 || arg1 == 7 || arg1 == 8;
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lia;)V", line = 88)
    public class7(class23 arg0) {
        this.field78 = arg0.method167(-2);
        this.field82 = arg0.method132(39);
        this.field83 = arg0.method143(-3230);
        this.field84 = arg0.method143(-3230);
        this.field86 = arg0.method143(-3230);
        this.field79 = arg0.method143(-3230);
    }
}
