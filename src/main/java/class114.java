import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class114 {

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public static int field2130 = 0;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "Lkh;")
    public static class117 field2131 = class224.method1450((byte) 12, "oberen Rand der Webseite ausw-=hlen)3");

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field2128 = -1;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "Lkh;")
    public static class117 field2132 = class224.method1450((byte) -115, "Eingabeprozedur geladen)3");

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "[Lnc;")
    public static class145[] field2135 = new class145[2048];

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "Lkh;")
    private static class117 field2133 = class224.method1450((byte) -35, "Drop");

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "Lkh;")
    public static class117 field2134 = class224.method1450((byte) 124, "leuchten3:");

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "Lkh;")
    public static class117 field2122 = field2133;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "Lic;")
    public static class91 field2124;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIII[I)V")
    public static final void method762(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field2123++;
        arg0--;
        int var11 = arg2 - 1;
        int var5 = var11 - 7;
        while (arg0 < var5) {
            int var6 = arg0 + 1;
            arg4[var6] = arg3;
            int var7 = var6 + 1;
            arg4[var7] = arg3;
            int var8 = var7 + 1;
            arg4[var8] = arg3;
            int var9 = var8 + 1;
            arg4[var9] = arg3;
            int var10 = var9 + 1;
            arg4[var10] = arg3;
            int var12 = var10 + 1;
            arg4[var12] = arg3;
            int var13 = var12 + 1;
            arg4[var13] = arg3;
            arg0 = var13 + 1;
            arg4[arg0] = arg3;
        }
        while (var11 > arg0) {
            arg0++;
            arg4[arg0] = arg3;
        }
        if (arg1 <= 65) {
            field2130 = -79;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BJ)V")
    public static final void method763(byte arg0, long arg1) {
        field2125++;
        if (arg1 == 0L || arg0 <= 12) {
            return;
        }
        if (class151.field2744 >= 100 && class196.field3507 != 1 || class151.field2744 >= 200) {
            class14.method129(class169.field3042, class105.field1912, 0, 0);
            return;
        }
        class117 var3 = class162.method1156(arg1, (byte) -52).method796((byte) -40);
        for (int var4 = 0; var4 < class151.field2744; var4++) {
            if (class32.field751[var4] == arg1) {
                class14.method129(class169.field3042, class36.method316((byte) -34, new class117[] { var3, class127.field2353 }), 0, 0);
                return;
            }
        }
        for (int var5 = 0; var5 < class85.field1613; var5++) {
            if (class158.field2873[var5] == arg1) {
                class14.method129(class169.field3042, class36.method316((byte) -34, new class117[] { class186.field3335, var3, class196.field3531 }), 0, 0);
                return;
            }
        }
        if (var3.method810((byte) -50, class93.field1712.field1141)) {
            class14.method129(class169.field3042, class215.field3906, 0, 0);
            return;
        }
        class9.field208++;
        class68.field1301[class151.field2744] = var3;
        class32.field751[class151.field2744] = arg1;
        class99.field1813[class151.field2744] = 0;
        class190.field3384[class151.field2744] = class169.field3042;
        class239.field4330[class151.field2744] = 0;
        class148.field2706[class151.field2744] = false;
        class151.field2744++;
        class204.field3688 = class194.field3470;
        class105.field1911.method400(82, 8);
        class105.field1911.method1000((byte) 70, arg1);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
    public static void method764(int arg0) {
        field2132 = null;
        int var1 = -85 % ((arg0 + 59) / 41);
        field2124 = null;
        field2134 = null;
        field2122 = null;
        field2131 = null;
        field2133 = null;
        field2135 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Ljd;")
    public static final class102 method765(Throwable arg0, String arg1) {
        field2129++;
        class102 var2;
        if (arg0 instanceof class102) {
            var2 = (class102) arg0;
            var2.field1859 = var2.field1859 + ' ' + arg1;
        } else {
            var2 = new class102(arg0, arg1);
        }
        return var2;
    }
}
