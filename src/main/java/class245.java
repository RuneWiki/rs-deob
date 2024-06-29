import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class245 extends class53 {

    @OriginalMember(owner = "client!id", name = "S", descriptor = "Lwa;")
    public static class75 field4125 = class66.method560("sl_stars", false);

    @OriginalMember(owner = "client!id", name = "U", descriptor = "Lwa;")
    public static class75 field4127 = class66.method560("Sprites geladen)3", false);

    @OriginalMember(owner = "client!id", name = "V", descriptor = "Lwa;")
    private static class75 field4128 = class66.method560("Examine", false);

    @OriginalMember(owner = "client!id", name = "P", descriptor = "Lwa;")
    public static class75 field4122 = field4128;

    @OriginalMember(owner = "client!id", name = "N", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!id", name = "O", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!id", name = "R", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!id", name = "T", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!id", name = "W", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!id", name = "M", descriptor = "Lul;")
    public static class39 field4119;

    @OriginalMember(owner = "client!id", name = "Q", descriptor = "[[[B")
    public static byte[][][] field4123;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(II)[I", line = 11)
    public final int[] method59(int arg0, int arg1) {
        if (arg0 != -15196) {
            method1771((byte) 35);
        }
        int[] var3 = this.field878.method1603(arg1, (byte) 115);
        if (this.field878.field3749) {
            int var4 = class50.field814[arg1];
            for (int var5 = 0; var5 < class269.field4644; var5++) {
                var3[var5] = this.method1772(class67.field1178[var5], 74, var4) % 4096;
            }
        }
        field4126++;
        return var3;
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(B)V", line = 61)
    public static void method1771(byte arg0) {
        if (arg0 < 66) {
            method1773(101, 110, -47);
        }
        field4119 = null;
        field4122 = null;
        field4125 = null;
        field4128 = null;
        field4123 = (byte[][][]) null;
        field4127 = null;
    }

    @OriginalMember(owner = "client!id", name = "e", descriptor = "(III)I", line = 78)
    private final int method1772(int arg0, int arg1, int arg2) {
        if (arg1 <= 43) {
            return -70;
        } else {
            int var4 = arg0 + (arg2 * 57);
            int var5 = var4 << 1 ^ var4;
            field4129++;
            return 4096 - (((var5 * 15731 * var5 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144);
        }
    }

    @OriginalMember(owner = "client!id", name = "f", descriptor = "(III)I", line = 91)
    public static final int method1773(int arg0, int arg1, int arg2) {
        field4124++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg0 & 0x7F) * arg2 >> 7;
            if (arg1 > var3) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V", line = 141)
    public class245() {
        super(0, true);
    }
}
