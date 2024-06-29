import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class188 {

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    public int field2785;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
    private int field2782;

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "Lvp;")
    public static class123 field2786 = new class123(50, 4);

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "Lvp;")
    public static class123 field2788 = new class123(15, 16);

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!ao", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2783++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
    public static void method1300(int arg0) {
        field2786 = null;
        field2788 = null;
        int var1 = -60 % ((38 - arg0) / 35);
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(II)V")
    public class188(int arg0, int arg1) {
        this.field2785 = arg1;
        this.field2782 = arg0;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)I")
    public final int method1301(byte arg0) {
        field2784++;
        return arg0 == -100 ? this.field2782 : -59;
    }

    static {
        new class180("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
    }
}
