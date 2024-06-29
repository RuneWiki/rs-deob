import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class264 {

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "J")
    public long field3979 = 0L;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field3967 = 2;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "[I")
    public static int[] field3983 = new int[256];

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public static int field3973 = 0;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "[[S")
    public static short[][] field3981 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!jg", name = "w", descriptor = "I")
    public static int field3989 = 0;

    @OriginalMember(owner = "client!jg", name = "v", descriptor = "I")
    public static int field3988 = 99;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public int field3968;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public int field3969;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
    public int field3978;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
    public int field3980;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "I")
    public int field3984;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "I")
    public int field3986;

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "I")
    public int field3987;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "Ltk;")
    public class219 field3970;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "Ltk;")
    public class219 field3974;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "Lve;")
    public static class233 field3977;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "[[[Lok;")
    public static class131[][][] field3985;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(III)I")
    public static final int method1753(int arg0, int arg1, int arg2) {
        field3971++;
        int var3 = class217.method1399(arg0 + 91923, -111, arg1 + 45365, 4) - (128 - (class217.method1399(arg0 + 37821, arg2 ^ 0xFFFFD4FD, arg1 + 10294, 2) - 128 >> 1)) + (class217.method1399(arg0, -110, arg1, 1) - 128 >> 2);
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        if (arg2 != 11096) {
            field3985 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
    public static void method1754(byte arg0) {
        field3985 = null;
        field3977 = null;
        field3983 = null;
        if (arg0 != -1) {
            field3983 = null;
        }
        field3981 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method1755(String arg0, int arg1) {
        field3972++;
        if (arg0 == null) {
            return false;
        }
        if (arg1 >= -19) {
            method1753(-75, -71, -17);
        }
        for (int var2 = 0; var2 < class55.field836; var2++) {
            if (arg0.equalsIgnoreCase(class70.field1089[var2])) {
                return true;
            }
        }
        return arg0.equalsIgnoreCase(class55.field847.field766);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)I")
    public static final int method1756(int arg0) {
        if (arg0 != 412) {
            field3985 = null;
        }
        field3976++;
        return class115.field1712;
    }
}
