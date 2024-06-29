import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class54 {

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field881 = 0;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
    public static int field889 = -1;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "Loa;")
    private static class99 field887 = class221.method1463(2844, "");

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
    public static int field892 = 0;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "Loa;")
    public static class99 field895 = class221.method1463(2844, "_labels");

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "Loa;")
    public static class99 field890 = field887;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "[I")
    public static int[] field891 = new int[200];

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "[Z")
    public static boolean[] field897 = new boolean[8];

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "Z")
    public static boolean field896 = false;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public int field883;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "Ltg;")
    public static class182 field878;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "Lqc;")
    public class63 field885;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "[I")
    public static int[] field879;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "[I")
    public int[] field893;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public static void method368(int arg0) {
        field890 = null;
        field895 = null;
        field897 = null;
        field887 = null;
        if (arg0 != 302) {
            field887 = null;
        }
        field878 = null;
        field891 = null;
        field879 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)Loa;")
    public static final class99 method369(int arg0, byte arg1) {
        field886++;
        if (arg1 == -39) {
            return arg0 < 999999999 ? class198.method1333(-121, arg0) : class19.field216;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZLge;B)V")
    public static final void method370(boolean arg0, class70 arg1, byte arg2) {
        field880++;
        if (arg0) {
            int var3 = class24.field373;
            int var4 = var3 * 956 / 503;
            class160.field2837.method30((class199.field3458 - var4) / 2, 0, var4, var3);
            class190.field3349.method751(class199.field3458 / 2 - (class190.field3349.field3023 / 2), 18);
        }
        arg1.method481(class73.field1222, class199.field3458 / 2, class24.field373 / 2 - 26, 16777215, -1);
        int var5 = class24.field373 / 2 - 18;
        class68.method447(class199.field3458 / 2 - 152, var5, 304, 34, 9179409);
        if (arg2 >= -118) {
            field896 = false;
        }
        class68.method447(class199.field3458 / 2 - 151, var5 + 1, 302, 32, 0);
        class68.method465(class199.field3458 / 2 - 150, var5 - -2, class244.field4217 * 3, 30, 9179409);
        class68.method465(class244.field4217 * 3 + (class199.field3458 / 2 - 150), var5 + 2, 300 - (class244.field4217 * 3), 30, 0);
        arg1.method481(field890, class199.field3458 / 2, class24.field373 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZI)V")
    public static final void method371(boolean arg0, int arg1) {
        if (arg0) {
            method368(-126);
        }
        field894++;
        class201.field3489.method1809(arg1, (byte) 114);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Loa;B)V")
    public static final void method372(class99 arg0, byte arg1) {
        field882++;
        if (class56.field917 == null) {
            return;
        }
        int var2 = 0;
        long var3 = arg0.method697(-23666);
        if (var3 == 0L) {
            return;
        }
        while (class56.field917.length > var2 && class56.field917[var2].field2187 != var3) {
            var2++;
        }
        if (class56.field917.length <= var2 || class56.field917[var2] == null) {
            return;
        }
        class121.field2130++;
        class131.field2277.method966((byte) 49, 120);
        class131.field2277.method1699(class56.field917[var2].field2187, 92);
        if (arg1 != 25) {
            field887 = null;
        }
    }
}
