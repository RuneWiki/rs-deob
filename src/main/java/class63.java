import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class63 extends class108 {

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "Ljava/lang/String;")
    public String field862;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(CZ)C")
    public static final char method368(char arg0, boolean arg1) {
        field861++;
        if (arg0 == 'Æ') {
            return 'E';
        } else if (arg0 == 'æ') {
            return 'e';
        } else if (arg1) {
            return (char) 65432;
        } else if (arg0 == 'ß') {
            return 's';
        } else if (arg0 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg0 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIB)Z")
    public static final boolean method369(int arg0, int arg1, byte arg2) {
        field860++;
        int var3 = -127 / ((arg2 + 16) / 58);
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
    public class63() {
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class63(String arg0) {
        this.field862 = arg0;
    }
}
