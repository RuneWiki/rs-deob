import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class294 {

    @OriginalMember(owner = "client!g", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4564 = "M";

    @OriginalMember(owner = "client!g", name = "i", descriptor = "Z")
    public static boolean field4571 = false;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "[I")
    public static int[] field4569 = new int[2];

    @OriginalMember(owner = "client!g", name = "h", descriptor = "[B")
    public static byte[] field4570 = new byte[520];

    @OriginalMember(owner = "client!g", name = "j", descriptor = "Ljava/lang/String;")
    public static String field4572 = "wave2:";

    @OriginalMember(owner = "client!g", name = "l", descriptor = "I")
    public static int field4574 = 0;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILub;)V")
    public static final void method1946(int arg0, class92 arg1) {
        field4567++;
        if (class69.field1090) {
            return;
        }
        class66.method534();
        class52.field826 = class42.method369(98, arg1, class101.field1580);
        int var2 = 41 % ((-arg0 - 61) / 52);
        int var3 = class163.field2449;
        int var4 = var3 * 956 / 503;
        class52.field826.method431((class179.field2816 - var4) / 2, 0, var4, var3);
        class154.field2294 = class125.method941(arg1, class236.field3731, (byte) -121);
        class154.field2294.method57(class179.field2816 / 2 - (class154.field2294.field157 / 2), 18);
        class69.field1090 = true;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
    public static final void method1947(int arg0) {
        field4573++;
        if (!class110.method819(false) && class230.field3649 != class130.field1941) {
            class207.method1450(false, class130.field1941, class303.field4870, false, class263.field4168.field4749[0], class279.field4424, class263.field4168.field4673[0], true);
        } else if (arg0 <= -56 && class195.field3057 != class130.field1941 && class270.method1831(class130.field1941, (byte) -39)) {
            class195.field3057 = class130.field1941;
            class166.method1207((byte) -76);
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
    public static void method1948(int arg0) {
        field4564 = null;
        if (arg0 != -3063) {
            field4572 = null;
        }
        field4572 = null;
        field4569 = null;
        field4570 = null;
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V")
    public static final void method1949(int arg0) {
        class236.field3724 = 0;
        if (arg0 != -6783) {
            method1946(-95, (class92) null);
        }
        field4563++;
        int var1 = (class263.field4168.field4725 >> 7) + class138.field2072;
        int var2 = (class263.field4168.field4709 >> 7) + class159.field2379;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class236.field3724 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class236.field3724 = 1;
        }
        if (class236.field3724 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class236.field3724 = 0;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
    public static final void method1950(boolean arg0) {
        if (arg0) {
            field4566++;
            class138.field2069.method1172((byte) 114);
        }
    }
}
