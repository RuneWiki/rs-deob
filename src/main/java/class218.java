import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class218 {

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2880 = "Loading config - ";

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field2878 = 0;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public int field2881;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "Lba;")
    public class218 field2884;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "Lcp;")
    public class430 field2882;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lqj;Lbe;ZLqj;Lqj;)Z")
    public static final boolean method1385(class296 arg0, class25 arg1, boolean arg2, class296 arg3, class296 arg4) {
        if (arg2) {
            return true;
        }
        field2877++;
        class387.field5636 = arg0;
        class181.field2537 = arg3;
        class139.field1972 = arg4;
        class225.field3024 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZILcp;)Lba;")
    public static final class218 method1386(boolean arg0, int arg1, class430 arg2) {
        field2883++;
        class218 var3;
        if (class419.field6062 == null) {
            var3 = new class218();
        } else {
            var3 = class419.field6062;
            class419.field6062 = class419.field6062.field2884;
            var3.field2884 = null;
            class257.field3500--;
        }
        if (arg0) {
            method1389(107, -96, -28, 45, -109);
        }
        var3.field2881 = arg1;
        var3.field2882 = arg2;
        return var3;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    public static void method1387(int arg0) {
        if (arg0 != 0) {
            field2878 = 50;
        }
        field2880 = null;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
    public final void method1388(int arg0) {
        field2876++;
        if (class257.field3500 >= 500) {
            return;
        }
        this.field2882 = null;
        this.field2884 = class419.field6062;
        this.field2881 = arg0;
        class419.field6062 = this;
        class257.field3500++;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIII)V")
    public static final void method1389(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -501) {
            return;
        }
        field2879++;
        if (arg0 < arg2) {
            class73.method486(arg0, class84.field1286[arg1], arg4, -119, arg2);
        } else {
            class73.method486(arg2, class84.field1286[arg1], arg4, arg3 ^ 0xFFFFFE00, arg0);
        }
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
    private class218() {
    }
}
