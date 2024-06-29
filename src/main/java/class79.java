import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class79 {

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field2112 = 0;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "Lrd;")
    public static class117 field2114 = class95.method812("Schrifts-=tze geladen)3", (byte) 8);

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "Lrd;")
    private static class117 field2118 = class95.method812("Prepared visibility map", (byte) 8);

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "Lrd;")
    public static class117 field2124 = field2118;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "Lrd;")
    public static class117 field2120 = class95.method812("(U2", (byte) 8);

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public static int field2123 = 0;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "[I")
    public static int[] field2119 = new int[500];

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "Z")
    public static boolean field2122 = false;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "Lke;")
    public static class74 field2117;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "[Lra;")
    public static class114[] field2113;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLjava/awt/event/KeyEvent;)I")
    public static final int method742(byte arg0, KeyEvent arg1) {
        int var2 = -127 % ((arg0 - 59) / 62);
        int var3 = arg1.getKeyChar();
        if (var3 <= 0 || var3 >= 256) {
            var3 = -1;
        }
        field2116++;
        return var3;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIB)I")
    public static final int method743(int arg0, int arg1, byte arg2) {
        field2121++;
        if (arg2 < 6) {
            field2122 = true;
        }
        class45 var3 = (class45) class84.field2191.method20((long) arg0, true);
        if (var3 == null) {
            return -1;
        } else if (arg1 >= 0 && var3.field1269.length > arg1) {
            return var3.field1269[arg1];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public static void method744(int arg0) {
        field2113 = null;
        field2118 = null;
        if (arg0 <= 67) {
            return;
        }
        field2120 = null;
        field2114 = null;
        field2124 = null;
        field2117 = null;
        field2119 = null;
    }
}
