import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class35 {

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "Lfc;")
    public static class34 field845 = new class34(64);

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "[I")
    public static int[] field847 = new int[500];

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "Lhb;")
    private static class44 field854 = class102.method810(" is already on your friend list", -28606);

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "Lhb;")
    private static class44 field852 = class102.method810("Service unavailable)3", -28606);

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "Lhb;")
    public static class44 field850 = field852;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public static int field853 = 0;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public static int field855 = 0;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    public static int field856 = 0;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "Lhb;")
    public static class44 field846 = field854;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "Ltd;")
    public static class116 field848;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLm;)Z", line = 10)
    public static final boolean method337(byte arg0, class72 arg1) {
        field844++;
        int var2 = arg1.field1800;
        if (class105.field2686 == 2) {
            if (var2 == 201) {
                class51.field1232 = class85.field2164;
                class51.field1238 = class51.field1274;
                class9.field172 = 1;
                class16.field306 = true;
                class79.field1990 = 0;
                class116.field2843 = true;
            }
            if (var2 == 202) {
                class16.field306 = true;
                class79.field1990 = 0;
                class51.field1238 = class51.field1274;
                class116.field2843 = true;
                class51.field1232 = class15.field291;
                class9.field172 = 2;
            }
        }
        if (var2 == 205) {
            class125.field3027 = 250;
            return true;
        }
        if (var2 == 501) {
            class51.field1238 = class51.field1274;
            class51.field1232 = class61.field1541;
            class9.field172 = 4;
            class79.field1990 = 0;
            class16.field306 = true;
            class116.field2843 = true;
        }
        if (var2 == 502) {
            class51.field1232 = class62.field1583;
            class51.field1238 = class51.field1274;
            class79.field1990 = 0;
            class116.field2843 = true;
            class16.field306 = true;
            class9.field172 = 5;
        }
        if (var2 >= 300 && var2 <= 313) {
            int var3 = var2 & 0x1;
            int var4 = (var2 - 300) / 2;
            class95.field2413.method170(false, var4, var3 == 1);
        }
        if (var2 >= 314 && var2 <= 323) {
            int var5 = (var2 - 314) / 2;
            int var6 = var2 & 0x1;
            class95.field2413.method169(var6 == 1, (byte) -59, var5);
        }
        if (var2 == 324) {
            class95.field2413.method166(false, arg0 ^ 0xFFFFFF92);
        }
        if (var2 == 325) {
            class95.field2413.method166(true, -1);
        }
        if (var2 == 326) {
            class92.field2333.method702(true, 157);
            class95.field2413.method168(85, class92.field2333);
            client.field379++;
            return true;
        }
        if (var2 == 620) {
            class16.field310 = !class16.field310;
        }
        if (var2 >= 601 && var2 <= 613) {
            class85.method688((byte) -25);
            if (class51.field1255.method414((byte) 10) > 0) {
                class64.field1639++;
                class92.field2333.method702(true, 78);
                class92.field2333.method1018(class51.field1255.method407(true), -5952);
                class92.field2333.method993(19579, var2 - 601);
                class92.field2333.method993(arg0 + 19470, class16.field310 ? 1 : 0);
            }
        }
        if (arg0 != 109) {
            field850 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V", line = 139)
    public static void method338(int arg0) {
        field854 = null;
        field848 = null;
        if (arg0 != -7502) {
            field850 = null;
        }
        field847 = null;
        field846 = null;
        field850 = null;
        field845 = null;
        field852 = null;
    }
}
