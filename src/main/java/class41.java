import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class41 {

    @OriginalMember(owner = "client!da", name = "c", descriptor = "Z")
    public static boolean field624 = false;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "Liu;")
    public static class390 field627;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "[I")
    public static int[] field630;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "B")
    public static byte field631;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public int field622;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public int field623;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public int field625;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public int field626;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "[[I")
    public static int[][] field629;

    static {
        new class194("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
        field627 = new class390(93, 12);
        field630 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 5)
    public static void method310(int arg0) {
        if (arg0 != 0) {
            method310(-115);
        }
        field629 = null;
        field627 = null;
        field630 = null;
    }
}
