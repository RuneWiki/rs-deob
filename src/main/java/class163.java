import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class163 {

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "Leh;")
    public static class47 field3173 = class195.method1282((byte) -4, "Bitte warten Sie eine Minute");

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "Leh;")
    public static class47 field3171 = class195.method1282((byte) -4, ": ");

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "Leh;")
    private static class47 field3174 = class195.method1282((byte) -4, "Loading config )2 ");

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "Leh;")
    public static class47 field3172 = class195.method1282((byte) -4, "blaugr-Un:");

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "Leh;")
    public static class47 field3176 = class195.method1282((byte) -4, "(U2");

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "Leh;")
    public static class47 field3175 = class195.method1282((byte) -4, "AUS");

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "Leh;")
    public static class47 field3178 = field3174;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "Leh;")
    public static class47 field3180 = class195.method1282((byte) -4, "Titelbild geladen)3");

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
    public static final void method1111(int arg0) {
        field3177++;
        for (class86 var1 = (class86) class191.field3692.method345(-120); var1 != null; var1 = (class86) class191.field3692.method348(13949)) {
            if (class196.field3827 != var1.field1829 || var1.field1823 < class18.field362) {
                var1.method885(3);
            } else if (var1.field1840 <= class18.field362) {
                if (var1.field1822 > 0) {
                    class72 var2 = class133.field2626[var1.field1822 - 1];
                    if (var2 != null && var2.field3291 >= 0 && var2.field3291 < 13312 && var2.field3281 >= 0 && var2.field3281 < 13312) {
                        var1.method707(class39.method335(var2.field3291, var1.field1829, var2.field3281, arg0 ^ 0xFFFFAE5F) - var1.field1846, (byte) -95, var2.field3281, class18.field362, var2.field3291);
                    }
                }
                if (var1.field1822 < 0) {
                    int var3 = -var1.field1822 - 1;
                    class32 var4;
                    if (class180.field3443 == var3) {
                        var4 = class123.field2489;
                    } else {
                        var4 = class40.field795[var3];
                    }
                    if (var4 != null && var4.field3291 >= 0 && var4.field3291 < 13312 && var4.field3281 >= 0 && var4.field3281 < 13312) {
                        var1.method707(class39.method335(var4.field3291, var1.field1829, var4.field3281, 20896) - var1.field1846, (byte) -73, var4.field3281, class18.field362, var4.field3291);
                    }
                }
                var1.method706(0, class190.field3677);
                class74.method652(class196.field3827, (int) var1.field1827, (int) var1.field1814, (int) var1.field1839, 60, var1, var1.field1847, -1L, false);
            }
        }
        if (arg0 != -1) {
            field3171 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V")
    public static void method1112(boolean arg0) {
        field3174 = null;
        field3176 = null;
        if (!arg0) {
            method1113(true, -64);
        }
        field3171 = null;
        field3180 = null;
        field3175 = null;
        field3178 = null;
        field3173 = null;
        field3172 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZI)Z")
    public static final boolean method1113(boolean arg0, int arg1) {
        if (arg0) {
            return true;
        } else {
            field3179++;
            return arg1 >= 97 && arg1 <= 122 || arg1 >= 65 && arg1 <= 90;
        }
    }
}
