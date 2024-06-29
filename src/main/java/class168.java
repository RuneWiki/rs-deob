import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class168 {

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "J")
    public static long field2830 = 0L;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public static int field2833 = 0;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "Lgb;")
    public static class158 field2827 = new class158(50);

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "Loh;")
    public static class15 field2834;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "Lre;")
    public static class262 field2835;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "Lcb;")
    public static class267 field2831;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "[Lbh;")
    public static class258[] field2836;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V", line = 14)
    public static final void method1242(byte arg0) {
        field2828++;
        if (arg0 != -68) {
            return;
        }
        class230 var1 = new class230();
        for (int var2 = 0; var2 < 13; var2++) {
            for (int var3 = 0; var3 < 13; var3++) {
                class213.field3629[var2][var3] = var1;
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZJ)V", line = 42)
    public static final void method1243(boolean arg0, long arg1) {
        if (!arg0) {
            method1245((byte) 16, -67);
        }
        field2832++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class205.field3472; var3++) {
            if (class66.field1152[var3] == arg1) {
                class205.field3472--;
                class152.field2614++;
                for (int var4 = var3; var4 < class205.field3472; var4++) {
                    class66.field1152[var4] = class66.field1152[var4 + 1];
                    class244.field4114[var4] = class244.field4114[var4 + 1];
                }
                class166.field2793 = class187.field3128;
                class89.field1470.method87(65280, 86);
                class89.field1470.method514(30009, arg1);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)V", line = 101)
    public static void method1244(byte arg0) {
        field2827 = null;
        if (arg0 > 72) {
            field2835 = null;
            field2831 = null;
            field2836 = null;
            field2834 = null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BI)Lwa;", line = 125)
    public static final class75 method1245(byte arg0, int arg1) {
        if (arg0 <= 120) {
            method1244((byte) 63);
        }
        field2829++;
        return class66.method562((byte) 116, new class75[] { class67.method565(41, arg1 >> 24 & 0xFF), class219.field3751, class67.method565(67, arg1 >> 16 & 0xFF), class219.field3751, class67.method565(109, arg1 >> 8 & 0xFF), class219.field3751, class67.method565(112, arg1 & 0xFF) });
    }
}
