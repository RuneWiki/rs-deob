import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class60 {

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "I")
    public static int field718 = 0;

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "Lak;")
    public static class234 field715 = new class234("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "Lrr;")
    public static class245 field720;

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "[I")
    public static int[] field716;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "[[B")
    public static byte[][] field719;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "[[Z")
    public static boolean[][] field721;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(JI)V")
    public static final void method527(long arg0, int arg1) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        if (arg1 == 0) {
            field717++;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)V")
    public static void method528(byte arg0) {
        field716 = null;
        field721 = null;
        field719 = null;
        field715 = null;
        field720 = null;
        int var1 = -87 % ((30 - arg0) / 63);
    }
}
