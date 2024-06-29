import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class27 extends class256 {

    @OriginalMember(owner = "client!cd", name = "H", descriptor = "Lak;")
    public class134 field624;

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "I")
    public static int field614 = 0;

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "[I")
    public static int[] field616 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "Ljd;")
    public static class86 field618 = class122.method868("Starte 3D)2Softwarebibliothek)3", true);

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "Ljd;")
    public static class86 field620 = class122.method868("showingVideoAd", true);

    @OriginalMember(owner = "client!cd", name = "G", descriptor = "Ljd;")
    public static class86 field623 = class122.method868("_labels", true);

    @OriginalMember(owner = "client!cd", name = "E", descriptor = "I")
    public static int field621 = 1;

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "Ljd;")
    public static class86 field625 = class122.method868("Zugewiesener Speicher)3", true);

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "I")
    public static int field626 = 0;

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!cd", name = "F", descriptor = "Lbj;")
    public static class151 field622;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)V")
    public static void method181(int arg0) {
        if (arg0 != 16773818) {
            field622 = null;
        }
        field616 = null;
        field618 = null;
        field625 = null;
        field623 = null;
        field620 = null;
        field622 = null;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lak;)V")
    public class27(class134 arg0) {
        this.field624 = arg0;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lbj;I)V")
    public static final void method182(class151 arg0, int arg1) {
        if (arg1 == 1) {
            field617++;
            class87.field1727 = arg0;
        }
    }
}
