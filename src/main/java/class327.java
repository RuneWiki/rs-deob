import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public abstract class class327 extends class197 {

    @OriginalMember(owner = "client!gq", name = "k", descriptor = "I")
    public int field4364;

    @OriginalMember(owner = "client!gq", name = "h", descriptor = "I")
    public int field4361;

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "I")
    public int field4359;

    @OriginalMember(owner = "client!gq", name = "i", descriptor = "I")
    public int field4362;

    @OriginalMember(owner = "client!gq", name = "j", descriptor = "Lh;")
    public static class434 field4363 = new class434(103, 0);

    @OriginalMember(owner = "client!gq", name = "l", descriptor = "Lgd;")
    public static class206 field4365 = new class206("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

    @OriginalMember(owner = "client!gq", name = "m", descriptor = "[[I")
    public static int[][] field4366 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!gq", name = "n", descriptor = "Lgd;")
    public static class206 field4367 = new class206("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(CZ)Z")
    public static final boolean method1829(char arg0, boolean arg1) {
        field4360++;
        if (arg1) {
            method1829((char) 65433, false);
        }
        return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)V")
    public static void method1830(byte arg0) {
        if (arg0 >= 29) {
            field4367 = null;
            field4365 = null;
            field4363 = null;
            field4366 = null;
        }
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(IIII)V")
    public class327(int arg0, int arg1, int arg2, int arg3) {
        this.field4364 = arg0;
        this.field4361 = arg1;
        this.field4359 = arg3;
        this.field4362 = arg2;
    }
}
