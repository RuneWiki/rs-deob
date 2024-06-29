import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class536 extends class418 {

    @OriginalMember(owner = "client!mp", name = "n", descriptor = "I")
    private int field7879;

    @OriginalMember(owner = "client!mp", name = "p", descriptor = "I")
    private int field7881;

    @OriginalMember(owner = "client!mp", name = "k", descriptor = "I")
    private int field7876;

    @OriginalMember(owner = "client!mp", name = "l", descriptor = "I")
    private int field7877;

    @OriginalMember(owner = "client!mp", name = "o", descriptor = "Lbj;")
    public static class162 field7880;

    @OriginalMember(owner = "client!mp", name = "q", descriptor = "Los;")
    public static class309 field7882;

    @OriginalMember(owner = "client!mp", name = "i", descriptor = "I")
    public static int field7874;

    @OriginalMember(owner = "client!mp", name = "j", descriptor = "I")
    public static int field7875;

    @OriginalMember(owner = "client!mp", name = "m", descriptor = "I")
    public static int field7878;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(III)V")
    public final void method1301(int arg0, int arg1, int arg2) {
        ++field7875;
        int var4 = this.field7877 * arg1 >> 12;
        int var5 = -112 % ((arg0 - -67) / 57);
        int var6 = this.field7876 * arg1 >> 12;
        int var7 = this.field7881 * arg2 >> 12;
        int var8 = this.field7879 * arg2 >> 12;
        class225.method1504(var6, super.field6297, super.field6294, 3, super.field6295, var8, var4, var7);
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)V")
    public static void method3170(byte arg0) {
        int var1 = -38 / ((27 - arg0) / 34);
        field7882 = null;
        field7880 = null;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IZI)V")
    public final void method1302(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            ++field7874;
        }
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(IIIIIII)V")
    public class536(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field7879 = arg3;
        this.field7881 = arg1;
        this.field7876 = arg2;
        this.field7877 = arg0;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(BII)V")
    public final void method1300(byte arg0, int arg1, int arg2) {
        if (arg0 <= 12) {
            this.field7876 = -17;
        }
        ++field7878;
        int var4 = this.field7877 * arg1 >> 12;
        int var5 = this.field7876 * arg1 >> 12;
        int var6 = this.field7881 * arg2 >> 12;
        int var7 = this.field7879 * arg2 >> 12;
        class533.method3149(var6, super.field6294, var4, (byte) 18, var5, var7);
    }

    static {
        new class309("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
        field7880 = new class162(73, -1);
        field7882 = new class309("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");
    }
}
