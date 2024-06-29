import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class372 {

    @OriginalMember(owner = "client!no", name = "a", descriptor = "I")
    public static int field5599;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "I")
    public static int field5600;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(BB)C")
    public static final char method2308(byte arg0, byte arg1) {
        field5599++;
        if (arg1 != -70) {
            method2308((byte) 39, (byte) -87);
        }
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class271.field4082[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }
}
