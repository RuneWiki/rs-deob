import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public abstract class class190 {

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "Lrs;")
    public class166 field3195;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field3194 = 0;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIB)V")
    public abstract void method914(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)V")
    public static final void method1437(int arg0, int arg1, int arg2) {
        field3196++;
        class22 var3 = class121.field1865[arg2][arg0];
        if (arg1 != 0) {
            return;
        }
        if (var3 != null) {
            class60.field944 = var3.field219;
            class100.field1476 = var3.field212;
            class96.field1420 = var3.field216;
        }
        class321.method2083((byte) -114);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZ)V")
    public abstract void method909(int arg0, boolean arg1);

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZI)V")
    public abstract void method915(boolean arg0, int arg1);

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lrs;)V")
    public class190(class166 arg0) {
        this.field3195 = arg0;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILnba;I)V")
    public abstract void method911(int arg0, class487 arg1, int arg2);

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)Z")
    public abstract boolean method908(int arg0);

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)V")
    public abstract void method910(boolean arg0);
}
