import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class383 {

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public int field5257;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field5256;

    static {
        new class151("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
        new class151("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V", line = 4)
    public static final void method2334(int arg0) {
        field5255++;
        if (arg0 == -12001) {
            class349.field4808 = new class92();
        }
    }

    @OriginalMember(owner = "client!jd", name = "toString", descriptor = "()Ljava/lang/String;", line = 15)
    public final String toString() {
        field5256++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 39)
    public class383(String arg0, int arg1) {
        this.field5257 = arg1;
    }
}
