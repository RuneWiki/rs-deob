import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class408 {

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public static int field5588 = 0;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "Lsq;")
    public static class178 field5586 = new class178(12, 0, 1, 0);

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public static int field5587;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "[[I")
    public static int[][] field5585;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ltp;Z)Ltp;", line = 4)
    public static final class532 method2510(class532 arg0, boolean arg1) {
        field5587++;
        if (!arg1) {
            method2511(72);
        }
        class532 var2 = client.method1778(arg0);
        if (var2 == null) {
            var2 = arg0.field7698;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V", line = 31)
    public static void method2511(int arg0) {
        field5585 = null;
        if (arg0 == 23628) {
            field5586 = null;
        }
    }
}
