import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class166 {

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "[S")
    public static short[] field2542 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "J")
    public static long field2545 = 0L;

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "Lka;")
    public static class473 field2543 = new class473(64);

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "Lrb;")
    public static class283 field2547 = new class283(93, -2);

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!ot", name = "g", descriptor = "[Lo;")
    public static class359[] field2548;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)Z", line = 3)
    public static final boolean method1157(int arg0) {
        field2544++;
        try {
            if (arg0 != -8978) {
                return true;
            }
            if (class87.field1418 == 2) {
                if (class54.field777 == null) {
                    class54.field777 = class524.method3115(class135.field2056, class320.field4400, class428.field6223);
                    if (class54.field777 == null) {
                        return false;
                    }
                }
                if (class387.field5572 == null) {
                    class387.field5572 = new class514(class133.field2027, class488.field7069);
                }
                if (class443.field6380.method1038(class349.field5062, class387.field5572, 22050, class54.field777, -122)) {
                    class443.field6380.method1030((byte) -112);
                    class443.field6380.method1014(-129, class390.field5635);
                    class443.field6380.method1017(class238.field3287, arg0 + 8849, class54.field777);
                    class387.field5572 = null;
                    class54.field777 = null;
                    class135.field2056 = null;
                    class87.field1418 = 0;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class443.field6380.method1012((byte) 82);
            class387.field5572 = null;
            class87.field1418 = 0;
            class135.field2056 = null;
            class54.field777 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZI)I", line = 59)
    public static final int method1158(boolean arg0, int arg1) {
        field2546++;
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        if (!arg0) {
            return 126;
        }
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return arg1 & ~var7;
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(I)V", line = 82)
    public static void method1159(int arg0) {
        field2542 = null;
        field2547 = null;
        field2543 = null;
        if (arg0 != 957) {
            field2547 = null;
        }
        field2548 = null;
    }
}
