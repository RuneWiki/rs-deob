import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class58 {

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    private int field830;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "J")
    private long field829;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "S")
    public static short field824 = 256;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "Z")
    public static boolean field823;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)I")
    public final int method468(int arg0) {
        field827++;
        if (arg0 != 256) {
            this.method471(null, -5);
        }
        return this.field830;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)I")
    private final int method469(int arg0, int arg1) {
        if (arg1 != 15) {
            this.field830 = 7;
        }
        field825++;
        return (int) (this.field829 >> class109.field1822 * arg0) & 0xF;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZ)Lrf;")
    public final class109 method470(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            field826++;
            return class109.method916(4)[this.method469(arg0, 15)];
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lrf;)V")
    public class58(class109 arg0) {
        this.field830 = 1;
        this.field829 = arg0.field1812;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lrf;I)V")
    private final void method471(class109 arg0, int arg1) {
        if (arg1 == 32011) {
            this.field829 |= (arg0.field1812 << class109.field1822 * this.field830++);
            field828++;
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "([Lrf;)V")
    public class58(class109[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method471(arg0[var2], 32011);
        }
    }

    static {
        new class567("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
    }
}
