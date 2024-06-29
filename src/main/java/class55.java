import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class55 extends class281 {

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "Ljava/lang/String;")
    public static String field830 = "Examine";

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "[Lee;")
    public static class246[] field837 = new class246[14];

    @OriginalMember(owner = "client!ja", name = "z", descriptor = "Z")
    public static boolean field840 = false;

    @OriginalMember(owner = "client!ja", name = "E", descriptor = "Ljava/lang/String;")
    public static String field845 = "M";

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "I")
    public static int field836 = 0;

    @OriginalMember(owner = "client!ja", name = "F", descriptor = "Ljava/lang/String;")
    public static String field846 = "Connection lost.";

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!ja", name = "x", descriptor = "I")
    public int field838;

    @OriginalMember(owner = "client!ja", name = "y", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!ja", name = "C", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!ja", name = "G", descriptor = "Lde;")
    public static class53 field847;

    @OriginalMember(owner = "client!ja", name = "A", descriptor = "Ljava/lang/String;")
    public String field841;

    @OriginalMember(owner = "client!ja", name = "D", descriptor = "Ljava/lang/String;")
    public String field844;

    @OriginalMember(owner = "client!ja", name = "B", descriptor = "[I")
    public static int[] field842;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V")
    public static final void method367(int arg0) {
        if (arg0 != -1) {
            field847 = null;
        }
        ++class227.field3406;
        ++field832;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V")
    public static final void method368(int arg0, int arg1, int arg2) {
        class237.field3573 = true;
        class145.field2080 = arg0;
        class57.field885 = arg1;
        class124.field1806 = arg2;
        class17.field245 = -1;
        class183.field2618 = -1;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III)V")
    public static final void method369(int arg0, int arg1, int arg2) {
        ++field843;
        class237 var3 = class10.method91(2, arg0);
        int var4 = var3.field3576;
        int var5 = var3.field3572;
        int var6 = 66 % ((arg2 - 4) / 56);
        int var7 = var3.field3570;
        int var8 = class290.field4577[var5 - var7];
        if (~arg1 > -1 || var8 < arg1) {
            arg1 = 0;
        }
        int var9 = var8 << var7;
        class120.method825(var4, -107, var9 & arg1 << var7 | class43.field616[var4] & ~var9);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIII)V")
    public static final void method370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class177.method1152(class93.field1418, class254.field3857, arg4, 108);
        ++field834;
        int var7 = class177.method1152(class93.field1418, class254.field3857, arg2, arg0 ^ 109);
        if (arg0 == 0) {
            int var8 = class177.method1152(class93.field1412, class142.field2061, arg3, 23);
            int var9 = class177.method1152(class93.field1412, class142.field2061, arg1, arg0 ^ 123);
            for (int var10 = var6; var7 >= var10; ++var10) {
                class183.method1181(arg5, (byte) -69, var9, class163.field2370[var10], var8);
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(II)V")
    public static final void method371(int arg0, int arg1) {
        ++field833;
        class255 var2 = (class255) class168.field2428.method1218((long) arg0, 121);
        if (var2 != null) {
            if (arg1 == 0) {
                var2.method1706(arg1 ^ -89);
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)Lbi;")
    public final class70 method372(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            ++field835;
            return class266.field4015[super.field4485];
        }
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V")
    public static void method373(int arg0) {
        if (arg0 != 14) {
            field836 = 44;
        }
        field846 = null;
        field845 = null;
        field830 = null;
        field842 = null;
        field847 = null;
        field837 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIZI)V")
    public static final void method374(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (~class93.field1412 >= ~(-arg4 + arg2) && ~class142.field2061 <= ~(arg2 + arg4) && ~(-arg4 + arg0) <= ~class93.field1418 && ~class254.field3857 <= ~(arg0 + arg4)) {
            class150.method1014(21, arg2, arg4, arg0, arg1);
        } else {
            class91.method617(arg0, arg2, 7472, arg4, arg1);
        }
        ++field831;
        if (arg3) {
            method368(75, -89, -41);
        }
    }
}
