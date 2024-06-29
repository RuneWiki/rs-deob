import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class260 {

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "Lrl;")
    private class487 field3719;

    @OriginalMember(owner = "client!mt", name = "e", descriptor = "J")
    public long field3723;

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "[Z")
    public static boolean[] field3720;

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)V")
    public static void method1614(int arg0) {
        field3720 = null;
        if (arg0 != 8) {
            method1614(36);
        }
    }

    @OriginalMember(owner = "client!mt", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field3719.method2870(true, this.field3723);
        field3722++;
        super.finalize();
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lrl;JI)V")
    public class260(class487 arg0, long arg1, int arg2) {
        this.field3719 = arg0;
        this.field3723 = arg1;
    }

    static {
        new class194("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
        field3720 = new boolean[8];
    }
}
