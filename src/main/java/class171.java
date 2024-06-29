import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class171 extends class144 {

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "Lal;")
    public class67 field2770;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "Ls;")
    public static class186 field2772;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "Z")
    public static boolean field2774;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "Los;")
    public static class309 field2775;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "Lo;")
    public static class24 field2773;

    static {
        new class309("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
        field2772 = new class186(91, -1);
        field2774 = false;
        field2775 = new class309("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V", line = 3)
    public static void method1192(int arg0) {
        field2773 = null;
        field2775 = null;
        field2772 = null;
        if (arg0 != 9977) {
            method1193(-55);
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V", line = 17)
    public static final void method1193(int arg0) {
        field2771++;
        if (arg0 > 58) {
            class459.method2765(class493.field7218, (byte) 87);
            class285.field4288++;
            class335.field5062.method1865(class71.field1418, 812856296);
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lda;II[B)V", line = 29)
    public class171(class44 arg0, int arg1, int arg2, byte[] arg3) {
        this.field2770 = class301.method1938(-88, arg1, 6406, arg0, 6406, false, arg3, arg2);
        this.field2770.method967(8276, false, false);
    }
}
