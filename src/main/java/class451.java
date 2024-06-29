import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class451 {

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public int field6511;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "Lkd;")
    private class700 field6513;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field6507;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field6508;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field6510;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field6512;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "[Lcg;")
    public static class11[] field6509;

    @OriginalMember(owner = "client!tb", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() throws Throwable {
        this.field6513.method3930(8960, this.field6511);
        field6507++;
        super.finalize();
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V", line = 23)
    public static void method2652(boolean arg0) {
        if (arg0) {
            field6509 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 33)
    public static final boolean method2653(String arg0, int arg1) {
        field6508++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class356.field5266; var2++) {
            if (arg0.equalsIgnoreCase(class205.field2796[var2])) {
                return true;
            }
        }
        if (arg1 != -30963) {
            method2652(false);
        }
        return arg0.equalsIgnoreCase(class321.field4681.field1094);
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lkd;II)V", line = 62)
    public class451(class700 arg0, int arg1, int arg2) {
        this.field6511 = arg2;
        this.field6513 = arg0;
    }
}
