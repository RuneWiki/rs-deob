import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class230 {

    @OriginalMember(owner = "client!w", name = "b", descriptor = "[I")
    public static int[] field4061 = new int[32];

    @OriginalMember(owner = "client!w", name = "e", descriptor = "[[[B")
    public static byte[][][] field4064;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "Lvf;")
    private static class265 field4069;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "Lvf;")
    public static class265 field4065;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public int field4067;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "Lvf;")
    public class265 field4063;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(III)V")
    public static final void method1555(int arg0, int arg1, int arg2) {
        class256.field4385[arg1] = arg0;
        if (arg2 != -16358) {
            method1555(-15, -91, 6);
        }
        class170 var3 = (class170) class150.field2779.method1842(arg2 ^ 0x3FE5, (long) arg1);
        if (var3 == null) {
            class170 var4 = new class170(class136.method950(arg2 + 25312) + 500L);
            class150.field2779.method1838((long) arg1, var4, (byte) 8);
        } else {
            var3.field3069 = class136.method950(arg2 + 25312) + 500L;
        }
        field4068++;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
    public static void method1556(byte arg0) {
        int var1 = 109 % ((22 - arg0) / 37);
        field4061 = null;
        field4064 = null;
        field4065 = null;
        field4069 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lfl;ZLfl;)V")
    public static final void method1557(class192 arg0, boolean arg1, class192 arg2) {
        class110.field1927 = arg0;
        if (arg1) {
            class143.field2671 = arg2;
            field4066++;
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field4061[var1] = var0 - 1;
            var0 += var0;
        }
        field4064 = new byte[4][104][104];
        field4069 = class87.method582(-46, "Your ignore list is full)3 Max of 100 users)3");
        field4065 = field4069;
    }
}
