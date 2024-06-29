import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class175 {

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "Z")
    public static boolean field3258 = false;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "Lsg;")
    public static class30 field3263 = class167.method1221((byte) 33, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "Lmc;")
    public static class151 field3260;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "Lu;")
    public static class212 field3261;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "Lwi;")
    public static class218 field3255;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "[S")
    public static short[] field3265;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V")
    public static final void method1285(byte arg0) {
        class142.field2752 = null;
        class37.field895 = null;
        class2.field33 = null;
        field3259++;
        if (arg0 != 53) {
            method1286((byte) -113);
        }
        class222.field3992 = null;
        class62.field1329 = null;
        class191.field3475 = null;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)V")
    public static void method1286(byte arg0) {
        field3263 = null;
        field3261 = null;
        if (arg0 == 32) {
            field3265 = null;
            field3260 = null;
            field3255 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lwe;IIII)V")
    public static final void method1287(class40 arg0, int arg1, int arg2, int arg3, int arg4) {
        field3266++;
        class91 var5 = (class91) class167.field3084.method478(0);
        int var6 = -115 % ((arg2 - 34) / 57);
        while (var5 != null) {
            if (var5.field1844 == arg4 && (arg3 * 128) == var5.field1834 && (arg1 * 128) == var5.field1828 && var5.field1853.field989 == arg0.field989) {
                if (var5.field1829 != null) {
                    class127.field2469.method186(var5.field1829);
                    var5.field1829 = null;
                }
                if (var5.field1848 != null) {
                    class127.field2469.method186(var5.field1848);
                    var5.field1848 = null;
                }
                var5.method1681(false);
                return;
            }
            var5 = (class91) class167.field3084.method476((byte) 13);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(III)Lsk;")
    public static final class104 method1288(int arg0, int arg1, int arg2) {
        class195 var3 = class71.field1613[arg0][arg1][arg2];
        return var3 == null || var3.field3541 == null ? null : var3.field3541;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILcc;Z)V")
    public static final void method1289(int arg0, class206 arg1, boolean arg2) {
        field3262++;
        if (arg2) {
            int var3 = class238.field4238;
            int var4 = var3 * 956 / 503;
            class172.field3218.method449((class15.field324 - var4) / 2, 0, var4, var3);
            class75.field1669.method1387(class15.field324 / 2 - (class75.field1669.field4679 / 2), 18);
        }
        arg1.method1472(class245.field4378, class15.field324 / 2, class238.field4238 / 2 - 26, 16777215, -1);
        int var5 = class238.field4238 / 2 - 18;
        class188.method1354(class15.field324 / 2 - 152, var5, 304, 34, 9179409);
        class188.method1354(class15.field324 / 2 - 151, var5 + 1, 302, 32, 0);
        class188.method1361(class15.field324 / 2 - arg0, var5 + 2, class82.field1752 * 3, 30, 9179409);
        class188.method1361(class15.field324 / 2 + class82.field1752 * 3 - 150, var5 + 2, 300 - (class82.field1752 * 3), 30, 0);
        arg1.method1472(class225.field4024, class15.field324 / 2, class238.field4238 / 2 + 4, 16777215, -1);
    }
}
