import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class16 {

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "Ljava/lang/String;")
    public static String field197 = "glow3:";

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "[I")
    public static int[] field186 = new int[2];

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "[[I")
    public static int[][] field191 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public int field190;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    public int field192;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "I")
    public int field195;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "J")
    public long field187;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "Ljj;")
    public static class134 field188;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "Lli;")
    public class197 field185;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(CI)C")
    public static final char method116(char arg0, int arg1) {
        field193++;
        if (arg0 == 'Æ') {
            return 'E';
        } else if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else if (arg0 == 'Œ') {
            return 'E';
        } else if (arg0 == 'œ') {
            return 'e';
        } else {
            return (char) (arg1 > -2 ? 'k' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V")
    public static final void method117(byte arg0) {
        field194++;
        class12.field166.method1834(arg0 - 51);
        class147.field2366.method1834(0);
        if (arg0 != 51) {
            method118(true);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)V")
    public static final void method118(boolean arg0) {
        if (!arg0) {
            field186 = null;
        }
        field189++;
        class288.field4608 = new class48();
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)V")
    public static void method119(byte arg0) {
        field191 = null;
        if (arg0 == -57) {
            field197 = null;
            field188 = null;
            field186 = null;
        }
    }
}
