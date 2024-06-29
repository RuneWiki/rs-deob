import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public abstract class class478 {

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "I")
    public int field6794;

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
    public int field6796;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "I")
    public int field6795;

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
    public static int field6798;

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "I")
    public static int field6799;

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field6797;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)V", line = 3)
    public static void method2800(byte arg0) {
        if (arg0 != 89) {
            method2800((byte) -20);
        }
        field6797 = null;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(BC)C", line = 17)
    public static final char method2801(byte arg0, char arg1) {
        field6798++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else {
            if (arg0 <= 25) {
                field6797 = null;
            }
            if (arg1 == 'Œ') {
                return 'E';
            } else {
                return (char) (arg1 == 'œ' ? 'e' : '\u0000');
            }
        }
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(III)V", line = 52)
    public class478(int arg0, int arg1, int arg2) {
        this.field6794 = arg2;
        this.field6796 = arg0;
        this.field6795 = arg1;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IBI)V")
    public abstract void method1343(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)V")
    public abstract void method1340(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(III)V")
    public abstract void method1339(int arg0, int arg1, int arg2);
}
