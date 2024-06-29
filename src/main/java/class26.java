import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class26 {

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "Loa;")
    private static class98 field625 = class38.method349(255, "Enter name of player to delete from list");

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "Loa;")
    public static class98 field631 = class38.method349(255, ":: (X");

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "Loa;")
    public static class98 field628 = class38.method349(255, "Die Adresse dieses Computers wurde gesperrt)1");

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "Loa;")
    public static class98 field630 = class38.method349(255, "runes");

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "[Lub;")
    public static class136[] field634 = new class136[50];

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "Loa;")
    public static class98 field633 = class38.method349(255, " Sekunde(Xn(Y -Ubertragen)3");

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "Loa;")
    private static class98 field638 = class38.method349(255, "yellow:");

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "Loa;")
    public static class98 field624 = field625;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public static int field635 = 0;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "Loa;")
    public static class98 field629 = field638;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "Loa;")
    public static class98 field632 = field638;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "Loc;")
    public static class100 field622;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "Loc;")
    public static class100 field637;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "Ltb;")
    public static class130 field639;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "Z")
    public static boolean field627;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)I")
    public static final int method276(int arg0, int arg1) {
        int var2 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0xD5555555);
        int var3 = (var2 >>> 2 & 0xF3333333) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        field626++;
        int var5 = (var4 >>> 8) + var4;
        if (arg1 == 1021849956) {
            int var6 = (var5 >>> 16) + var5;
            return var6 & 0xFF;
        } else {
            return 94;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public static void method277(byte arg0) {
        field634 = null;
        field628 = null;
        field629 = null;
        field622 = null;
        field633 = null;
        field625 = null;
        field631 = null;
        field638 = null;
        field632 = null;
        field630 = null;
        if (arg0 <= 90) {
            field631 = null;
        }
        field637 = null;
        field639 = null;
        field624 = null;
    }
}
