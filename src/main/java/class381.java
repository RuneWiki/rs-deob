import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class381 {

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "Lkf;")
    public static class229 field5355 = new class229(1);

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "[I")
    public static int[] field5359 = new int[1000];

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "Lwn;")
    public static class663 field5356;

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "[Lxa;")
    public static class461[] field5358;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)V")
    public static final void method2203(int arg0) {
        field5357++;
        class328 var1 = class44.field661;
        synchronized (class44.field661) {
            if (arg0 >= -6) {
                field5358 = null;
            }
            class44.field661.method1987(-31085);
        }
        class328 var2 = class533.field7259;
        synchronized (class533.field7259) {
            class533.field7259.method1987(-31085);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)V")
    public static void method2204(byte arg0) {
        if (arg0 != -27) {
            method2203(-91);
        }
        field5359 = null;
        field5358 = null;
        field5355 = null;
        field5356 = null;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(III)V")
    public static final void method2205(int arg0, int arg1, int arg2) {
        class486 var3 = class658.field9266[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field6729 != null) {
            var3.field6729 = null;
        }
        if (var3.field6728 != null) {
            var3.field6728 = null;
        }
    }
}
