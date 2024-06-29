import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class515 {

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "S")
    public static short field7498 = 32767;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "Lpn;")
    public static class49 field7497 = new class49(46, 3);

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field7500 = 0;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field7499;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BB)C")
    public static final char method3052(byte arg0, byte arg1) {
        field7499++;
        if (arg0 > -80) {
            method3053((byte) -20);
        }
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class348.field5198[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
    public static void method3053(byte arg0) {
        if (arg0 != -39) {
            method3052((byte) 5, (byte) 6);
        }
        field7497 = null;
    }
}
