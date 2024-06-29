import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class556 extends class417 {

    @OriginalMember(owner = "client!og", name = "l", descriptor = "I")
    public int field8278;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "Lh;")
    public static class572 field8277 = new class572("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!og", name = "m", descriptor = "Lada;")
    public static class144 field8279 = new class144(7, 2);

    @OriginalMember(owner = "client!og", name = "o", descriptor = "I")
    public static int field8281 = 0;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "I")
    public static int field8275;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public static int field8276;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "Luda;")
    public static class385 field8280;

    static {
        new class572("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V", line = 8)
    public static void method3356(int arg0) {
        field8279 = null;
        field8277 = null;
        field8280 = null;
        if (arg0 != 9216) {
            method3356(-24);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lee;Z)I", line = 20)
    public static final int method3357(class582 arg0, boolean arg1) {
        if (arg1) {
            field8279 = null;
        }
        field8275++;
        if (class36.field433 == arg0) {
            return 9216;
        } else if (class502.field7115 == arg0) {
            return 34065;
        } else if (class253.field3653 == arg0) {
            return 34066;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)Lcu;", line = 43)
    public static final class187 method3358(byte arg0) {
        class606.field9007 = 0;
        field8276++;
        int var1 = -3 / ((arg0 - 9) / 48);
        return class87.method660(103);
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V", line = 62)
    public class556() {
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(I)V", line = 64)
    public class556(int arg0) {
        this.field8278 = arg0;
    }
}
