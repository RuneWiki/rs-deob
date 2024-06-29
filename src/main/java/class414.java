import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class414 {

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public int field5857;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "Ljava/lang/String;")
    public String field5862;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "[I")
    public static int[] field5858 = new int[8];

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "[Lkba;")
    public static class91[] field5863 = new class91[16];

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field5859;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field5860;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field5861;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static void method2401(int arg0) {
        if (arg0 != 97) {
            method2401(2);
        }
        field5858 = null;
        field5863 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)[I")
    public static final int[] method2402(byte arg0) {
        field5861++;
        return arg0 < 111 ? null : new int[] { class243.field3306, class392.field5549, class230.field3187 };
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(CII)C")
    public static final char method2403(char arg0, int arg1, int arg2) {
        field5860++;
        if (arg0 >= 'À' && arg0 <= 'ÿ') {
            if (arg0 >= 'À' && arg0 <= 'Æ') {
                return 'A';
            }
            if (arg0 == 'Ç') {
                return 'C';
            }
            if (arg0 >= 'È' && arg0 <= 'Ë') {
                return 'E';
            }
            if (arg0 >= 'Ì' && arg0 <= 'Ï') {
                return 'I';
            }
            if (arg0 >= 'Ò' && arg0 <= 'Ö') {
                return 'O';
            }
            if (arg0 >= 'Ù' && arg0 <= 'Ü') {
                return 'U';
            }
            if (arg0 == 'Ý') {
                return 'Y';
            }
            if (arg0 == 'ß') {
                return 's';
            }
            if (arg0 >= 'à' && arg0 <= 'æ') {
                return 'a';
            }
            if (arg0 == 'ç') {
                return 'c';
            }
            if (arg0 >= 'è' && arg0 <= 'ë') {
                return 'e';
            }
            if (arg0 >= 'ì' && arg0 <= 'ï') {
                return 'i';
            }
            if (arg0 >= 'ò' && arg0 <= 'ö') {
                return 'o';
            }
            if (arg0 >= 'ù' && arg0 <= 'ü') {
                return 'u';
            }
            if (arg0 == 'ý' || arg0 == 'ÿ') {
                return 'y';
            }
        }
        if (arg0 == 'Œ') {
            return 'O';
        } else if (arg0 == 'œ') {
            return 'o';
        } else {
            if (arg2 != 99) {
                field5858 = null;
            }
            if (arg0 == 'Ÿ') {
                return 'Y';
            } else {
                return arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class414(String arg0, int arg1) {
        this.field5857 = arg1;
        this.field5862 = arg0;
    }

    @OriginalMember(owner = "client!ci", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5859++;
        throw new IllegalStateException();
    }
}
