import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class67 extends class353 {

    @OriginalMember(owner = "client!kl", name = "Q", descriptor = "I")
    public static int field648 = 0;

    @OriginalMember(owner = "client!kl", name = "N", descriptor = "Lvj;")
    public static class373 field647 = new class373(87, -1);

    @OriginalMember(owner = "client!kl", name = "S", descriptor = "Lrg;")
    public static class548 field650 = new class548(27, 8);

    @OriginalMember(owner = "client!kl", name = "R", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)V", line = 8)
    public static void method375(int arg0) {
        field647 = null;
        field650 = null;
        if (arg0 >= -13) {
            method375(37);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BB)C", line = 23)
    public static final char method376(byte arg0, byte arg1) {
        field649++;
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (arg0 > -9) {
            method375(-7);
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class88.field1082[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }
}
