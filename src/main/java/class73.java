import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class73 {

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)I")
    public static int method578(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IC)C")
    public static final char method579(int arg0, char arg1) {
        if (arg0 != 101) {
            return (char) 65423;
        }
        field1184++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else if (arg1 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg1 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public static final void method580(int arg0) {
        class483.field6809.method3246(false);
        field1183++;
        if (arg0 != 198) {
            method580(-15);
        }
    }
}
