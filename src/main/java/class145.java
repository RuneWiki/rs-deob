import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class145 extends OutputStream {

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "Lli;")
    private static class185 field2751 = class245.method1649(" has logged out)3", -124);

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "Lli;")
    private static class185 field2756 = class245.method1649("Close", -28);

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "Lli;")
    public static class185 field2753 = field2756;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "Lli;")
    public static class185 field2752 = field2751;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public static int field2754 = 1;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "[[[I")
    public static int[][][] field2760 = new int[4][13][13];

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "Lli;")
    public static class185 field2762 = class245.method1649("overlay2", -64);

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "Lli;")
    public static class185 field2763 = class245.method1649("null", -48);

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "Lli;")
    public static class185 field2765 = class245.method1649(" )2> <col=ffffff>", -89);

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "[I")
    public static int[] field2766;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "[[I")
    public static int[][] field2757;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1037(int arg0, String arg1) {
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        field2764++;
        System.exit(arg0);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)Z")
    public static final boolean method1038(int arg0, int arg1, int arg2) {
        field2761++;
        if (arg2 != 15975) {
            field2759 = -98;
        }
        return (arg1 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;Z)I")
    public static final int method1039(KeyEvent arg0, boolean arg1) {
        field2755++;
        int var2 = arg0.getKeyChar();
        if (var2 == 8364) {
            return 128;
        }
        if (!arg1) {
            field2753 = null;
        }
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
    public static void method1040(int arg0) {
        field2753 = null;
        field2765 = null;
        field2752 = null;
        field2756 = null;
        field2763 = null;
        if (arg0 != -16682) {
            method1040(-119);
        }
        field2751 = null;
        field2762 = null;
        field2766 = null;
        field2757 = null;
        field2760 = null;
    }

    @OriginalMember(owner = "client!hg", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field2758++;
        throw new IOException();
    }
}
