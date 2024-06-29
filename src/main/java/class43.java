import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class43 extends class184 {

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "I")
    public int field564;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "I")
    public int field563;

    @OriginalMember(owner = "client!cg", name = "B", descriptor = "I")
    public static int field569 = 0;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "Lsf;")
    public static class108 field565 = class140.method973(255, "Chargement en cours)3)3)3");

    @OriginalMember(owner = "client!cg", name = "A", descriptor = "Lsf;")
    public static class108 field568 = class140.method973(255, "Chargement de la liste des serveurs");

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "Lcd;")
    public static class69 field566 = new class69(64);

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!cg", name = "C", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(II)V", line = 23)
    public class43(int arg0, int arg1) {
        this.field564 = arg1;
        this.field563 = arg0;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(Z)V", line = 34)
    public static void method281(boolean arg0) {
        if (!arg0) {
            field568 = (class108) null;
        }
        field565 = null;
        field566 = null;
        field568 = null;
    }
}
