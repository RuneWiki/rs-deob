import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class472 extends class379 {

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "[I")
    public static int[] field6966 = new int[100];

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "Lbg;")
    public static class324 field6965 = new class324(5, 8);

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "Lgk;")
    public static class331 field6969 = new class331("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "Lcw;")
    public static class120 field6970 = new class120(5000);

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    public static int field6964;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
    public static int field6971;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "Lab;")
    public class472 field6967;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "Lab;")
    public class472 field6968;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)V", line = 5)
    public final void method2858(int arg0) {
        field6964++;
        if (arg0 != 10009) {
            this.field6968 = null;
        }
        if (this.field6967 != null) {
            this.field6967.field6968 = this.field6968;
            this.field6968.field6967 = this.field6967;
            this.field6968 = null;
            this.field6967 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V", line = 33)
    public static void method2859(byte arg0) {
        field6970 = null;
        if (arg0 == -32) {
            field6966 = null;
            field6969 = null;
            field6965 = null;
        }
    }
}
