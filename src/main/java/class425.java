import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class425 {

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "[B")
    public static byte[] field5841 = new byte[2048];

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "Lqw;")
    public static class71 field5846 = new class71(7, 4);

    @OriginalMember(owner = "client!gt", name = "h", descriptor = "Ldb;")
    public static class298 field5848 = new class298(99, -2);

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "I")
    public static int field5842;

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "I")
    public static int field5843;

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "I")
    public static int field5844;

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "I")
    public static int field5845;

    @OriginalMember(owner = "client!gt", name = "g", descriptor = "I")
    public static int field5847;

    @OriginalMember(owner = "client!gt", name = "i", descriptor = "I")
    public static int field5849;

    @OriginalMember(owner = "client!gt", name = "toString", descriptor = "()Ljava/lang/String;", line = 6)
    public final String toString() {
        field5843++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)Z", line = 15)
    public final boolean method2430(int arg0) {
        if (arg0 == 0) {
            field5845++;
            return class623.field8246 == this | class260.field3573 == this;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIII)V", line = 26)
    public static final void method2431(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class344.field4718.field5445 * arg0 >> 8;
        field5844++;
        if (~arg2 == arg1 && !class137.field2225) {
            class223.method1397(arg1 ^ 0x1);
        } else if (arg2 != -1 && (class416.field5694 != arg2 || !class220.method1392(arg1 + 5888)) && var4 != 0 && !class137.field2225) {
            class389.method2249(1, arg3, class603.field8016, var4, 0, false, arg2);
        }
        class416.field5694 = arg2;
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)V", line = 49)
    public static void method2432(int arg0) {
        field5841 = null;
        field5846 = null;
        if (arg0 >= 8) {
            field5848 = null;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIILl;Ll;)V", line = 63)
    public static final void method2433(int arg0, int arg1, int arg2, class18 arg3, class18 arg4) {
        class24 var5 = class457.method2610(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field396 = arg3;
            var5.field413 = arg4;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILjava/io/File;Ljava/lang/String;)V", line = 81)
    public static final void method2434(int arg0, File arg1, String arg2) {
        class400.field5311.put(arg2, arg1);
        field5842++;
        if (arg0 == 0) {
            ;
        }
    }
}
