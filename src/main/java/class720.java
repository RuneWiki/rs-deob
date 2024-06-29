import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class720 {

    @OriginalMember(owner = "client!dw", name = "e", descriptor = "Lno;")
    private class704 field10103;

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "I")
    public int field10100;

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "Lwp;")
    public static class180 field10102 = new class180();

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "I")
    public static int field10099;

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "I")
    public static int field10101;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)Z", line = 5)
    public static final boolean method4082(int arg0) {
        field10101++;
        class67 var1 = (class67) class195.field2969.method1195(arg0 ^ arg0);
        if (var1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < var1.field959; var2++) {
            if (var1.field954[var2] != null && var1.field954[var2].field2986 == 0) {
                return false;
            }
            if (var1.field962[var2] != null && var1.field962[var2].field2986 == 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!dw", name = "finalize", descriptor = "()V", line = 44)
    protected final void finalize() throws Throwable {
        field10099++;
        this.field10103.method4006(16386, this.field10100);
        super.finalize();
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(I)V", line = 55)
    public static void method4083(int arg0) {
        if (arg0 != 0) {
            method4082(-90);
        }
        field10102 = null;
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Lno;II)V", line = 69)
    public class720(class704 arg0, int arg1, int arg2) {
        this.field10103 = arg0;
        this.field10100 = arg2;
    }
}
