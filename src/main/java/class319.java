import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class319 {

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "Lgk;")
    public static class331 field4517 = new class331("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "[[I")
    public static int[][] field4519 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "Lgk;")
    public static class331 field4520 = new class331("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "Ldv;")
    public static class467 field4516;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
    public static void method1985(int arg0) {
        field4520 = null;
        int var1 = 29 / ((38 - arg0) / 48);
        field4517 = null;
        field4516 = null;
        field4519 = null;
    }
}
