import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class507 extends class513 {

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "Loe;")
    public class183 field7422 = new class183();

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field7419 = 0;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "Ljk;")
    public static class585 field7420 = new class585(51, 7);

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field7418;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field7421;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIII)V")
    public static final void method3015(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7421++;
        if (arg1 != -128) {
            method3015(-115, 25, 94, 15, -118);
        }
        if (class587.field8513 <= arg3 && class221.field2866 >= arg3) {
            int var5 = class396.method2393(class598.field8632, class288.field3883, 5890, arg0);
            int var6 = class396.method2393(class598.field8632, class288.field3883, 5890, arg2);
            class9.method53(arg3, (byte) -122, var5, var6, arg4);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BB)C")
    public static final char method3016(byte arg0, byte arg1) {
        field7418++;
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class661.field9379[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) (arg0 == -88 ? (char) var2 : 65460);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V")
    public static void method3017(boolean arg0) {
        field7420 = null;
        if (arg0) {
            field7419 = 29;
        }
    }
}
