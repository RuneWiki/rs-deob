import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class257 extends class551 {

    @OriginalMember(owner = "client!kj", name = "y", descriptor = "Lkv;")
    public class200 field3753;

    @OriginalMember(owner = "client!kj", name = "A", descriptor = "Lto;")
    public class216 field3755;

    @OriginalMember(owner = "client!kj", name = "B", descriptor = "Z")
    public static boolean field3756 = false;

    @OriginalMember(owner = "client!kj", name = "D", descriptor = "[Lnt;")
    public static class454[] field3758 = new class454[75];

    @OriginalMember(owner = "client!kj", name = "F", descriptor = "Lqp;")
    public static class586 field3760;

    @OriginalMember(owner = "client!kj", name = "H", descriptor = "Lpm;")
    public static class129 field3762;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!kj", name = "w", descriptor = "I")
    public int field3751;

    @OriginalMember(owner = "client!kj", name = "x", descriptor = "I")
    public int field3752;

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "I")
    public int field3754;

    @OriginalMember(owner = "client!kj", name = "C", descriptor = "I")
    public int field3757;

    @OriginalMember(owner = "client!kj", name = "E", descriptor = "I")
    public int field3759;

    @OriginalMember(owner = "client!kj", name = "G", descriptor = "Lha;")
    public static class116 field3761;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "[I")
    public static int[] field3747;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(III)Z")
    public static final boolean method1623(int arg0, int arg1, int arg2) {
        if (arg1 != 32768) {
            method1623(-30, 18, -44);
        }
        field3749++;
        return (arg2 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "(I)V")
    public final void method1624(int arg0) {
        this.field3754 = this.field3753.field3002;
        this.field3757 = this.field3753.field3000;
        field3748++;
        this.field3751 = this.field3753.field2994;
        if (this.field3753.field2989 != null) {
            this.field3753.field2989.method612(this.field3755.field3191, this.field3755.field3187, this.field3755.field3181, class517.field7690);
        }
        if (arg0 != -18733) {
            method1623(-128, 104, -62);
        }
        this.field3752 = class517.field7690[0];
        this.field3759 = class517.field7690[2];
    }

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "(I)V")
    public static void method1625(int arg0) {
        field3758 = null;
        field3760 = null;
        if (arg0 <= 19) {
            method1625(-79);
        }
        field3761 = null;
        field3747 = null;
        field3762 = null;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lkv;Lqv;)V")
    public class257(class200 arg0, class96 arg1) {
        this.field3753 = arg0;
        this.field3755 = this.field3753.method1295(17);
        this.method1624(-18733);
    }

    static {
        new class487("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
        field3760 = new class586(32, -1);
        field3762 = new class129();
    }
}
