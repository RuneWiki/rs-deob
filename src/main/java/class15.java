import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public abstract class class15 extends class498 {

    @OriginalMember(owner = "client!n", name = "n", descriptor = "I")
    public static int field189 = 0;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "[I")
    public static int[] field191 = new int[1000];

    @OriginalMember(owner = "client!n", name = "o", descriptor = "Lkn;")
    public static class530 field190 = new class530("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

    @OriginalMember(owner = "client!n", name = "s", descriptor = "Leh;")
    public static class246 field194 = new class246(13, 0);

    @OriginalMember(owner = "client!n", name = "u", descriptor = "I")
    public static int field196 = -1;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "Lwd;")
    public static class183 field192;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "Leh;")
    public static class246 field195;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V", line = 19)
    public static void method78(int arg0) {
        field194 = null;
        field195 = null;
        field192 = null;
        field191 = null;
        if (arg0 != -1) {
            method78(-118);
        }
        field190 = null;
    }
}
