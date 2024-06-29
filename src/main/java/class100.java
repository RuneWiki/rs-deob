import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class100 {

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "[I")
    public static int[] field1662 = new int[2048];

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "F")
    public static float field1663;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "Lkl;")
    public class100 field1659;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "Lkl;")
    public class100 field1660;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "Lst;")
    public static class473 field1664;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "Lbq;")
    public static class487 field1657;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IZLnv;)I")
    public static final int method691(int arg0, boolean arg1, class493 arg2) {
        field1661++;
        return arg1 ? 44 : -1;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V")
    public static final void method692(byte arg0) {
        if (arg0 != 29) {
            return;
        }
        field1656++;
        for (int var1 = 0; var1 < 5; var1++) {
            class533.field7838[var1] = false;
        }
        class112.field1977 = -1;
        class199.field3164 = 0;
        class190.field2963 = 1;
        class328.field5176 = -1;
        class204.field3227 = 0;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)V")
    public static final void method693(int arg0, int arg1) {
        class1.field10 = arg1;
        if (arg0 != 0) {
            method692((byte) 5);
        }
        field1655++;
        class187.field2933 = 100;
        class536.field7876 = -1;
        class461.field6825 = 3;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)V")
    public static void method694(boolean arg0) {
        if (!arg0) {
            field1662 = null;
            field1657 = null;
            field1664 = null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V")
    public final void method695(int arg0) {
        field1658++;
        if (this.field1660 == null) {
            return;
        }
        this.field1660.field1659 = this.field1659;
        this.field1659.field1660 = this.field1660;
        this.field1659 = null;
        this.field1660 = null;
        int var2 = 34 % ((-arg0 - 47) / 48);
    }

    static {
        new class306("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field1663 = 0.0F;
    }
}
