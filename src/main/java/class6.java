import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class6 {

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "Llf;")
    private class250 field45;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public int field41;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "[[Z")
    public static boolean[][] field46 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field47 = 0;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)V")
    public static void method34(boolean arg0) {
        field46 = null;
        if (arg0) {
            field46 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field45.method1565(this.field41, 101);
        field42++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Llf;II)V")
    public class6(class250 arg0, int arg1, int arg2) {
        this.field45 = arg0;
        this.field41 = arg2;
    }
}
