import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class213 {

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "[[S")
    public static short[][] field3823 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field3821 = 0;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "Ldj;")
    public static class44 field3820 = class89.method650(255, "RuneScape wurde aktualisiert(Q");

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field3824 = 0;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field3822 = 0;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field3825 = -1;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "Ldj;")
    public static class44 field3827 = class89.method650(255, "Registrierter Benutzer");

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "Ldj;")
    private static class44 field3828 = class89.method650(255, "Please wait )2 attempting to reestablish)3");

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "Ldj;")
    public static class44 field3829 = field3828;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public static void method1377(int arg0) {
        field3823 = null;
        field3828 = null;
        if (arg0 != 1) {
            field3829 = null;
        }
        field3827 = null;
        field3820 = null;
        field3829 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)V")
    public static final void method1378(int arg0, int arg1, int arg2) {
        class72.field1374 = true;
        class45.field860 = arg0;
        class216.field3938 = arg1;
        class104.field1897 = arg2;
        class31.field546 = -1;
        class157.field2725 = -1;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)Lvc;")
    public static final class223 method1379(int arg0, int arg1) {
        field3826++;
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class4.field52[var2] == null || class4.field52[var2][var3] == null) {
            boolean var4 = class122.method835(var2, 31);
            if (!var4) {
                return null;
            }
        }
        if (arg1 != -10051) {
            method1377(-54);
        }
        return class4.field52[var2][var3];
    }
}
