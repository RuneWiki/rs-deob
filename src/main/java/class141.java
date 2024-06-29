import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class141 {

    @OriginalMember(owner = "client!si", name = "c", descriptor = "Lmr;")
    private class221 field1555;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "J")
    public long field1557;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "Lgk;")
    public static class616 field1554 = new class616();

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public static int field1559 = 1;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field1556 = 0;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V")
    public static void method782(boolean arg0) {
        if (!arg0) {
            field1556 = 43;
        }
        field1554 = null;
    }

    @OriginalMember(owner = "client!si", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field1555.method1324(this.field1557, 126);
        field1553++;
        super.finalize();
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)Ljava/lang/String;")
    public static final String method783(int arg0) {
        field1558++;
        if (arg0 != 0) {
            field1559 = 95;
        }
        String var1 = "www";
        if (class407.field5437 == class337.field4237) {
            var1 = "www-wtrc";
        } else if (class337.field4237 == class295.field3686) {
            var1 = "www-wtqa";
        } else if (class337.field4237 == class193.field2235) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (class208.field2464 != null) {
            var2 = "/p=" + class208.field2464;
        }
        return "http://" + var1 + "." + class246.field3031.field3940 + ".com/l=" + class504.field7267 + "/a=" + class112.field1186 + var2 + "/";
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Lmr;JI)V")
    public class141(class221 arg0, long arg1, int arg2) {
        this.field1555 = arg0;
        this.field1557 = arg1;
    }
}
