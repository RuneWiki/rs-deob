import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class521 {

    @OriginalMember(owner = "client!iq", name = "q", descriptor = "Lada;")
    public static class144 field7433;

    @OriginalMember(owner = "client!iq", name = "v", descriptor = "Z")
    public static boolean field7438;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "I")
    public int field7417;

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "I")
    public int field7418;

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "I")
    public static int field7419;

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "I")
    public int field7420;

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "I")
    public int field7421;

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "I")
    public int field7422;

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "I")
    public int field7423;

    @OriginalMember(owner = "client!iq", name = "h", descriptor = "I")
    public int field7424;

    @OriginalMember(owner = "client!iq", name = "i", descriptor = "I")
    public int field7425;

    @OriginalMember(owner = "client!iq", name = "j", descriptor = "I")
    public int field7426;

    @OriginalMember(owner = "client!iq", name = "k", descriptor = "I")
    public int field7427;

    @OriginalMember(owner = "client!iq", name = "l", descriptor = "I")
    public int field7428;

    @OriginalMember(owner = "client!iq", name = "m", descriptor = "I")
    public int field7429;

    @OriginalMember(owner = "client!iq", name = "n", descriptor = "I")
    public int field7430;

    @OriginalMember(owner = "client!iq", name = "o", descriptor = "I")
    public int field7431;

    @OriginalMember(owner = "client!iq", name = "p", descriptor = "I")
    public int field7432;

    @OriginalMember(owner = "client!iq", name = "r", descriptor = "I")
    public int field7434;

    @OriginalMember(owner = "client!iq", name = "s", descriptor = "I")
    public int field7435;

    @OriginalMember(owner = "client!iq", name = "t", descriptor = "I")
    public static int field7436;

    @OriginalMember(owner = "client!iq", name = "u", descriptor = "I")
    public int field7437;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V")
    public static void method3077(int arg0) {
        if (arg0 == 942) {
            field7433 = null;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(II)I")
    public static final int method3078(int arg0, int arg1) {
        field7419++;
        if (arg1 != -5165) {
            method3078(-29, 92);
        }
        return arg0 >>> 8;
    }

    static {
        new class572("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
        field7433 = new class144(79, -2);
        field7438 = false;
    }
}
