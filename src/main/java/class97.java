import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public abstract class class97 extends class476 {

    @OriginalMember(owner = "client!dw", name = "k", descriptor = "Lnq;")
    public static class495 field1555;

    @OriginalMember(owner = "client!dw", name = "l", descriptor = "[I")
    public static int[] field1556;

    @OriginalMember(owner = "client!dw", name = "m", descriptor = "S")
    public static short field1557;

    @OriginalMember(owner = "client!dw", name = "j", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!dw", name = "i", descriptor = "Lo;")
    public static class359 field1553;

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(I)V")
    public static void method776(int arg0) {
        if (arg0 != -983) {
            field1557 = 14;
        }
        field1555 = null;
        field1553 = null;
        field1556 = null;
    }

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "(I)I")
    public abstract int method777(int arg0);

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "(I)I")
    public abstract int method778(int arg0);

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "(B)I")
    public abstract int method779(byte arg0);

    @OriginalMember(owner = "client!dw", name = "e", descriptor = "(I)J")
    public abstract long method780(int arg0);

    static {
        new class157("Player ", "Spieler ", "Joueur ", "Jogador ");
        field1555 = new class495();
        field1556 = new int[] { 1, 2, 4, 8 };
        field1557 = 320;
    }
}
