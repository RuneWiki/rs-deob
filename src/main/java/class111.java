import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class111 {

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field2762 = 0;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "Lhb;")
    public static class44 field2759 = class102.method810("mapback", -28606);

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "Lhb;")
    private static class44 field2766 = class102.method810("Login", -28606);

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "Lhb;")
    public static class44 field2764 = field2766;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "Lfc;")
    public static class34 field2763 = new class34(200);

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "Lhb;")
    public static class44 field2767 = class102.method810("Ung-Ultige Session)2ID)3", -28606);

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public static int field2768 = 0;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "Lhb;")
    public static class44 field2769 = class102.method810("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", -28606);

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "Lne;")
    public static class83 field2761;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V", line = 6)
    public static void method848(byte arg0) {
        field2764 = null;
        if (arg0 < 119) {
            method848((byte) 125);
        }
        field2767 = null;
        field2769 = null;
        field2763 = null;
        field2759 = null;
        field2761 = null;
        field2766 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BZI[B)V", line = 40)
    public static final void method849(byte arg0, boolean arg1, int arg2, byte[] arg3) {
        field2760++;
        if (class103.field2635 == null || arg0 <= 88) {
            return;
        }
        if (class44.field1122 >= 0) {
            class103.field2635.method47(116);
            class18.field352 = 20;
            class92.field2317 = 0;
            class44.field1122 = -1;
            class25.field582 = null;
        }
        if (arg3 == null) {
            return;
        }
        if (class18.field352 > 0) {
            class103.field2635.method49(false, arg2);
            class18.field352 = 0;
        }
        class44.field1122 = arg2;
        class103.field2635.method46(arg1, (byte) -72, arg2, arg3);
    }
}
