import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class10 {

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "[C")
    private static char[] field98 = new char[64];

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "I")
    public static int field100;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field98[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field98[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field98[var2] = (char) (var2 + 48 - 52);
        }
        field98[63] = '-';
        field98[62] = '*';
        field99 = -1;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lub;)V", line = 3)
    public static final void method57(class20 arg0) {
        class298.field4017.method322(arg0.field530, arg0.field527 + (arg0.method173(32249) >> 1), arg0.field531, class326.field4352);
        arg0.field534 = class326.field4352[0];
        arg0.field537 = class326.field4352[1];
        arg0.field536 = class326.field4352[2];
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(B)V", line = 9)
    public static void method58(byte arg0) {
        int var1 = 126 / ((arg0 - 41) / 48);
        field98 = null;
    }
}
