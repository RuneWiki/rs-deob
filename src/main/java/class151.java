import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class151 {

    @OriginalMember(owner = "client!io", name = "a", descriptor = "Lvt;")
    public static class344 field1989 = new class344("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

    @OriginalMember(owner = "client!io", name = "d", descriptor = "I")
    public static int field1992 = 0;

    @OriginalMember(owner = "client!io", name = "c", descriptor = "Lim;")
    public static class353 field1991 = new class353(49, -2);

    @OriginalMember(owner = "client!io", name = "f", descriptor = "[Lpm;")
    public static class129[] field1994 = new class129[75];

    @OriginalMember(owner = "client!io", name = "b", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!io", name = "g", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!io", name = "e", descriptor = "J")
    public static long field1993;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
    public static void method828(int arg0) {
        field1991 = null;
        field1989 = null;
        field1994 = null;
        if (arg0 != 49) {
            method828(40);
        }
    }
}
