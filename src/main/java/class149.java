import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public abstract class class149 {

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "Z")
    public static boolean field2263 = false;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "Z")
    public static boolean field2261 = false;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BI)C")
    public static final char method1074(byte arg0, int arg1) {
        field2262++;
        int var2 = arg0 & 0xFF;
        if (arg1 != -9345) {
            method1074((byte) 115, 107);
        }
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class609.field8662[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }
}
