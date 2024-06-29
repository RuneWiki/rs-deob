import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class45 {

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "Ljava/lang/String;")
    public static String field631 = "Use";

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "J")
    public static long field633 = 0L;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    public static int field638 = 1;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    public static int field640 = 0;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "Lvh;")
    public static class108 field632;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "Lvh;")
    public static class108 field636;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "Lgb;")
    public static class64 field634;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "[[[I")
    public static int[][][] field635;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(CI)B")
    public static final byte method276(char arg0, int arg1) {
        field639++;
        byte var2;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            var2 = (byte) arg0;
        } else if (arg0 == '€') {
            var2 = -128;
        } else if (arg0 == '‚') {
            var2 = -126;
        } else if (arg0 == 'ƒ') {
            var2 = -125;
        } else if (arg0 == '„') {
            var2 = -124;
        } else if (arg0 == '…') {
            var2 = -123;
        } else if (arg0 == '†') {
            var2 = -122;
        } else if (arg0 == '‡') {
            var2 = -121;
        } else if (arg0 == 'ˆ') {
            var2 = -120;
        } else if (arg0 == '‰') {
            var2 = -119;
        } else if (arg0 == 'Š') {
            var2 = -118;
        } else if (arg0 == '‹') {
            var2 = -117;
        } else if (arg0 == 'Œ') {
            var2 = -116;
        } else if (arg0 == 'Ž') {
            var2 = -114;
        } else if (arg0 == '‘') {
            var2 = -111;
        } else if (arg0 == '’') {
            var2 = -110;
        } else if (arg0 == '“') {
            var2 = -109;
        } else if (arg0 == '”') {
            var2 = -108;
        } else if (arg0 == '•') {
            var2 = -107;
        } else if (arg0 == '–') {
            var2 = -106;
        } else if (arg0 == '—') {
            var2 = -105;
        } else if (arg0 == '˜') {
            var2 = -104;
        } else if (arg0 == '™') {
            var2 = -103;
        } else if (arg0 == 'š') {
            var2 = -102;
        } else if (arg0 == '›') {
            var2 = -101;
        } else if (arg0 == 'œ') {
            var2 = -100;
        } else if (arg0 == 'ž') {
            var2 = -98;
        } else if (arg0 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        int var3 = 59 / ((-arg1 - 30) / 47);
        return var2;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public static void method277(int arg0) {
        field631 = null;
        field636 = null;
        if (arg0 >= 8) {
            field634 = null;
            field635 = null;
            field632 = null;
        }
    }
}
