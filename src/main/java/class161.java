import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class161 {

    @OriginalMember(owner = "client!io", name = "a", descriptor = "[I")
    public static int[] field1798 = new int[] { 7500, 500 };

    @OriginalMember(owner = "client!io", name = "c", descriptor = "I")
    public static int field1800 = 0;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
    public static void method875(int arg0) {
        field1798 = null;
        if (arg0 != 0) {
            field1798 = null;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(BB)C")
    public static final char method876(byte arg0, byte arg1) {
        field1799++;
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        int var3 = 51 % ((-arg0 - 44) / 37);
        if (var2 >= 128 && var2 < 160) {
            char var4 = class369.field5052[var2 - 128];
            if (var4 == '\u0000') {
                var4 = '?';
            }
            var2 = var4;
        }
        return (char) var2;
    }
}
