import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class32 extends class233 {

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "Lpk;")
    public static class43 field378 = null;

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "Z")
    public static boolean field380 = false;

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "I")
    public static int field381 = -1;

    @OriginalMember(owner = "client!gh", name = "y", descriptor = "Ljava/lang/String;")
    public static String field383 = "green:";

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!gh", name = "x", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "[I")
    public static int[] field379;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)V")
    public static void method200(int arg0) {
        if (arg0 == -30209) {
            field383 = null;
            field379 = null;
            field378 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IZ)V")
    public static final void method201(int arg0, boolean arg1) {
        if (arg1) {
            field378 = null;
        }
        class66 var2 = class6.method34(2, true, arg0);
        var2.method410(119);
        field377++;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(II)V")
    public static final void method202(int arg0, int arg1) {
        field382++;
        class112.field1496--;
        if (class112.field1496 == arg1) {
            return;
        }
        class194.method1259(class153.field2217, arg1 + 1, class153.field2217, arg1, class112.field1496 - arg1);
        class194.method1259(class240.field3482, arg1 + 1, class240.field3482, arg1, class112.field1496 - arg1);
        class194.method1262(class209.field2944, arg1 + 1, class209.field2944, arg1, class112.field1496 - arg1);
        class194.method1264(class190.field2749, arg1 + 1, class190.field2749, arg1, class112.field1496 - arg1);
        class194.method1263(class6.field72, arg1 + 1, class6.field72, arg1, class112.field1496 - arg1);
        class194.method1262(class240.field3485, arg1 + 1, class240.field3485, arg1, class112.field1496 - arg1);
        class194.method1262(class271.field3978, arg0 + arg1, class271.field3978, arg1, class112.field1496 - arg1);
    }
}
