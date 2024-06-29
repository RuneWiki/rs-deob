import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class11 {

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public int field172 = 0;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
    public int field184 = 0;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "Z")
    public static boolean field181 = false;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public static int field180 = 50;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "[I")
    public static int[] field173 = new int[field180];

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "[I")
    public static int[] field188 = new int[field180];

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "[I")
    public static int[] field179 = new int[field180];

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "Lrd;")
    private static class114 field185 = class84.method656("This world is running a closed Beta)3", (byte) 117);

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "Lrd;")
    private static class114 field189 = class84.method656("Enter amount:", (byte) 115);

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "[Lrd;")
    public static class114[] field171 = new class114[field180];

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "[I")
    public static int[] field175 = new int[field180];

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "[I")
    public static int[] field197 = new int[field180];

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "Lrd;")
    public static class114 field177 = field185;

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "I")
    public static int field195 = 0;

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "[I")
    public static int[] field192 = new int[field180];

    @OriginalMember(owner = "client!bc", name = "E", descriptor = "Lrd;")
    public static class114 field201 = field189;

    @OriginalMember(owner = "client!bc", name = "G", descriptor = "[I")
    public static int[] field203 = new int[field180];

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public int field176;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public int field178;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!bc", name = "B", descriptor = "I")
    public int field198;

    @OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
    public int field199;

    @OriginalMember(owner = "client!bc", name = "D", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!bc", name = "F", descriptor = "I")
    public int field202;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "Leb;")
    public static class31 field190;

    @OriginalMember(owner = "client!bc", name = "H", descriptor = "Lee;")
    public static class34 field204;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "Lha;")
    public class50 field183;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "Ljd;")
    public static class66 field187;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
    public static final int method85(KeyEvent arg0, int arg1) {
        field200++;
        int var2 = arg0.getKeyChar();
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        return arg1 <= 15 ? 63 : var2;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
    public static void method86(byte arg0) {
        field179 = null;
        field185 = null;
        field189 = null;
        field188 = null;
        if (arg0 < 113) {
            field179 = null;
        }
        field192 = null;
        field171 = null;
        field177 = null;
        field203 = null;
        field187 = null;
        field175 = null;
        field197 = null;
        field173 = null;
        field201 = null;
        field204 = null;
        field190 = null;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V")
    public static final void method87(byte arg0) {
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
        field194++;
        System.exit(1);
        if (arg0 != 11) {
            method86((byte) -62);
        }
    }
}
