import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class600 {

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "I")
    public int field8766;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "Lad;")
    private class362 field8762;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "Lig;")
    public static class206 field8759 = new class206(96, 7);

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "Lkca;")
    public static class73 field8760 = new class73(15, 7);

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
    public static int field8763 = -1;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "Z")
    public static boolean field8764 = false;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "Lea;")
    public static class474 field8765 = new class474("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "[I")
    public static int[] field8767 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field8758;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
    public static int field8761;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(III)Z", line = 5)
    public static final boolean method3484(int arg0, int arg1, int arg2) {
        if (arg1 < 47) {
            field8760 = null;
        }
        field8758++;
        return (arg0 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V", line = 18)
    public static void method3485(int arg0) {
        field8760 = null;
        field8767 = null;
        if (arg0 <= -74) {
            field8765 = null;
            field8759 = null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "finalize", descriptor = "()V", line = 33)
    protected final void finalize() throws Throwable {
        field8761++;
        this.field8762.method2324(2, this.field8766);
        super.finalize();
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lad;II)V", line = 57)
    public class600(class362 arg0, int arg1, int arg2) {
        this.field8766 = arg2;
        this.field8762 = arg0;
    }
}
