import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dha")
public abstract class class732 {

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "I")
    public static int field10234 = 0;

    @OriginalMember(owner = "client!dha", name = "b", descriptor = "I")
    public static int field10235;

    @OriginalMember(owner = "client!dha", name = "c", descriptor = "I")
    public static int field10236;

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(IZ)V", line = 13)
    public static final void method4071(int arg0, boolean arg1) {
        if (arg0 != 0) {
            method4071(119, false);
        }
        for (class67 var2 = (class67) class154.field2122.method3118((byte) 73); var2 != null; var2 = (class67) class154.field2122.method3111(123)) {
            if (var2.field927 != null) {
                class237.field3299.method3761(var2.field927);
                var2.field927 = null;
            }
            if (var2.field919 != null) {
                class237.field3299.method3761(var2.field919);
                var2.field919 = null;
            }
            var2.method3065(-17363);
        }
        field10236++;
        if (!arg1) {
            return;
        }
        for (class67 var3 = (class67) class483.field6544.method3118((byte) 73); var3 != null; var3 = (class67) class483.field6544.method3111(119)) {
            if (var3.field927 != null) {
                class237.field3299.method3761(var3.field927);
                var3.field927 = null;
            }
            var3.method3065(-17363);
        }
        for (class67 var4 = (class67) class393.field5473.method1382(27901); var4 != null; var4 = (class67) class393.field5473.method1383(false)) {
            if (var4.field927 != null) {
                class237.field3299.method3761(var4.field927);
                var4.field927 = null;
            }
            var4.method3065(arg0 ^ 0xFFFFBC2D);
        }
    }
}
