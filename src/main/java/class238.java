import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class238 extends class472 {

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "Lot;")
    public static class255 field3356 = new class255();

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "[B")
    public static byte[] field3357 = new byte[2048];

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
    public static int field3358 = 0;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "Lfn;")
    public static class52 field3359 = new class52(59, -1);

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "[C")
    public static char[] field3362 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!ok", name = "s", descriptor = "Ljava/lang/String;")
    public static String field3363 = null;

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "Ltm;")
    public static class112 field3361 = new class112("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

    @OriginalMember(owner = "client!ok", name = "u", descriptor = "I")
    public static int field3365 = -1;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "Lok;")
    public class238 field3354;

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "Lok;")
    public class238 field3360;

    @OriginalMember(owner = "client!ok", name = "t", descriptor = "[Ltq;")
    public static class478[] field3364;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)V")
    public final void method1495(int arg0) {
        field3355++;
        if (this.field3354 != null && arg0 == 19801) {
            this.field3354.field3360 = this.field3360;
            this.field3360.field3354 = this.field3354;
            this.field3354 = null;
            this.field3360 = null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(I)V")
    public static void method1496(int arg0) {
        field3357 = null;
        field3356 = null;
        field3363 = null;
        field3359 = null;
        field3362 = null;
        if (arg0 != -1858) {
            method1496(30);
        }
        field3364 = null;
        field3361 = null;
    }
}
