import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public class class537 extends class165 {

    @OriginalMember(owner = "client!nga", name = "q", descriptor = "I")
    private int field7558 = -1;

    @OriginalMember(owner = "client!nga", name = "p", descriptor = "I")
    public static int field7557;

    @OriginalMember(owner = "client!nga", name = "r", descriptor = "I")
    public static int field7559;

    @OriginalMember(owner = "client!nga", name = "s", descriptor = "I")
    public static int field7560;

    @OriginalMember(owner = "client!nga", name = "t", descriptor = "I")
    public static int field7561;

    static {
        new class460("", 73);
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lrv;I)V", line = 4)
    public final void method614(class120 arg0, int arg1) {
        if (arg1 != 1070) {
            this.method614(null, -66);
        }
        this.field7558 = arg0.method898((byte) -106);
        field7560++;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(ILmia;)V", line = 17)
    public final void method612(int arg0, class69 arg1) {
        if (arg0 > -100) {
            this.field7558 = -79;
        }
        field7557++;
        arg1.method535(this.field7558, -1);
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(CI)C", line = 28)
    public static final char method3104(char arg0, int arg1) {
        field7559++;
        if (arg1 != 69) {
            return 'K';
        } else if (arg0 == 'Æ') {
            return 'E';
        } else if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else if (arg0 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg0 == 'œ' ? 'e' : '\u0000');
        }
    }
}
