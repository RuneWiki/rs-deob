import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class144 {

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "Lkn;")
    public static class442 field2058 = new class442("flash3:", "blinken3:", "clignotant3:", "brilho3:");

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "Z")
    public static volatile boolean field2062;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "Lsg;")
    public static class226 field2061;

    static {
        new class442((String) null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", (String) null, (String) null);
        field2062 = false;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V", line = 3)
    public static void method986(byte arg0) {
        field2061 = null;
        field2058 = null;
        int var1 = -75 / ((arg0 + 2) / 42);
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(B)V", line = 21)
    public static final void method987(byte arg0) {
        if (class387.field5552 <= 0) {
            class175.field2395 = "";
        } else {
            int var1 = 0;
            for (int var2 = 0; var2 < class399.field5695.length; var2++) {
                if (class399.field5695[var2].startsWith("--> ")) {
                    var1++;
                    if (class387.field5552 == var1) {
                        class175.field2395 = class399.field5695[var2].substring(4);
                        break;
                    }
                }
            }
        }
        field2060++;
        if (arg0 < 37) {
            method987((byte) 72);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lqa;I)I", line = 59)
    public static final int method988(class134 arg0, int arg1) {
        if (arg1 <= 1) {
            method986((byte) 22);
        }
        field2059++;
        int var2 = arg0.field1921;
        class428 var3 = arg0.method2388(35);
        if (arg0.field5280) {
            var2 = arg0.field1954;
        } else if (arg0.field5297 == var3.field6061 || arg0.field5297 == var3.field6046 || arg0.field5297 == var3.field6031 || arg0.field5297 == var3.field6047) {
            var2 = arg0.field1959;
        } else if (arg0.field5297 == var3.field6065 || arg0.field5297 == var3.field6025 || arg0.field5297 == var3.field6070 || arg0.field5297 == var3.field6040) {
            var2 = arg0.field1953;
        }
        return var2;
    }
}
