import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class517 extends class392 {

    @OriginalMember(owner = "client!dn", name = "v", descriptor = "[B")
    public byte[] field6969;

    @OriginalMember(owner = "client!dn", name = "w", descriptor = "[C")
    private static char[] field6970 = new char[64];

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "([B)V")
    public class517(byte[] arg0) {
        this.field6969 = arg0;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V")
    public static void method2850(byte arg0) {
        field6970 = null;
        if (arg0 != -28) {
            field6970 = null;
        }
    }

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field6970[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field6970[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field6970[var2] = (char) (var2 + 48 - 52);
        }
        field6970[62] = '*';
        field6970[63] = '-';
    }
}
