import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class46 {

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "Lvc;")
    private static class137 field1030 = class45.method325("The server is being updated)3", -46);

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "Lvc;")
    public static class137 field1031 = field1030;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "Lvc;")
    private static class137 field1032 = class45.method325("Hide", -46);

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "Lvc;")
    public static class137 field1026 = class45.method325("-5berpr-Ufen Sie Ihr Mitteilungsfach)3", -46);

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "Lvc;")
    public static class137 field1029 = field1032;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "Lvc;")
    public static class137 field1039 = class45.method325("Aus", -46);

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "Lvc;")
    private static class137 field1033 = class45.method325("Report abuse", -46);

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "[I")
    public static int[] field1037 = new int[256];

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "Lvc;")
    public static class137 field1040 = field1033;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public static int field1035 = 0;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
    public static int field1041 = 0;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "Lvb;")
    public static class136 field1036;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "Z")
    public static boolean field1038;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "[Lme;")
    public static class85[] field1023;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
    public static void method333(byte arg0) {
        field1040 = null;
        field1026 = null;
        int var1 = -50 / ((6 - arg0) / 37);
        field1036 = null;
        field1030 = null;
        field1023 = null;
        field1039 = null;
        field1033 = null;
        field1031 = null;
        field1037 = null;
        field1029 = null;
        field1032 = null;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V")
    public static final void method334(byte arg0) {
        int var1 = 87 / ((-arg0 - 42) / 58);
        field1024++;
        if (class78.field1725 != null) {
            class70 var2 = class78.field1725;
            synchronized (class78.field1725) {
                class78.field1725 = null;
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public static final void method335(int arg0) {
        field1034++;
        class84 var1 = class48.field1071;
        synchronized (class48.field1071) {
            class131.field3049 = class12.field256;
            class126.field2956 = class110.field2605;
            int var2 = 51 / ((arg0 + 75) / 32);
            class32.field693 = class78.field1736;
            class78.field1747 = client.field493;
            class36.field788 = class78.field1748;
            class38.field835 = class127.field2993;
            class139.field3200 = class129.field3018;
            client.field493 = 0;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZI)I")
    public static final int method336(boolean arg0, int arg1) {
        field1027++;
        if (arg0) {
            method335(78);
        }
        return arg1 >> 17 & 0x7;
    }
}
