import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class324 {

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field4715 = -1;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public static int field4719 = 0;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "Z")
    public static boolean field4717 = true;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field4718 = new String[100];

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4720 = null;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "Lvj;")
    public static class256 field4716;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "Lum;")
    public static class307 field4713;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V", line = 7)
    public static void method2142(byte arg0) {
        field4716 = null;
        field4718 = null;
        field4720 = null;
        if (arg0 > -6) {
            field4716 = null;
        }
        field4713 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lwq;", line = 20)
    public static final class93 method2143(Throwable arg0, String arg1) {
        field4714++;
        class93 var2;
        if ((arg0 instanceof class93)) {
            var2 = (class93) arg0;
            var2.field1191 = var2.field1191 + ' ' + arg1;
        } else {
            var2 = new class93(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIIII)V", line = 49)
    public static final void method2144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4721++;
        if (arg6 < 73) {
            return;
        }
        for (class264 var7 = (class264) class113.field1457.method1082(124); var7 != null; var7 = (class264) class113.field1457.method1078(false)) {
            if (class34.field434 >= var7.field3889) {
                var7.method674(-1);
            } else {
                class106.method626(arg2, (var7.field3886 << 7) + 64, arg1 >> 1, arg0, var7.field3883 * 2, -2237, arg3 >> 1, (var7.field3885 << 7) + 64);
                class154.field2285.method2194(-21811, -16777216 | var7.field3890, class212.field3004[1] + arg5, var7.field3887, 0, class212.field3004[0] + arg4);
            }
        }
    }
}
