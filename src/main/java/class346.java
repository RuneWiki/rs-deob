import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class346 extends class9 {

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "[I")
    public static int[] field5520 = new int[100];

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    public static int field5524 = 0;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "Ll;")
    public static class328 field5527 = new class328(16);

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "Z")
    public static boolean field5529 = false;

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "Ljava/lang/String;")
    public static String field5528 = "rating: ";

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public static int field5519;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field5523;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field5522;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIII)I", line = 16)
    public static final int method2465(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5519++;
        if (arg4 != 25004) {
            field5529 = false;
        }
        int var5 = arg2 & 0xF;
        int var6 = var5 < 8 ? arg0 : arg3;
        int var7 = var5 < 4 ? arg3 : (var5 == 12 || var5 == 14 ? arg0 : arg1);
        return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lje;BZ)V", line = 33)
    public static final void method2466(class84 arg0, byte arg1, boolean arg2) {
        field5523++;
        if (class241.field4016 || arg2) {
            int var3 = class287.field4696;
            int var4 = var3 * 956 / 503;
            class135.field2319.method569((class133.field2287 - var4) / 2, 0, var4, var3);
            class7.field240.method34(class133.field2287 / 2 - (class7.field240.field5229 / 2), 18);
        }
        arg0.method629(class141.field2383 == 1 ? class235.field3848 : class132.field2269, class133.field2287 / 2, class287.field4696 / 2 - 26, 16777215, -1);
        int var5 = class287.field4696 / 2 - 18;
        if (arg1 < 101) {
            return;
        }
        if (class241.field4016) {
            class337.method2387(class133.field2287 / 2 - 152, var5, 304, 34, 9179409);
            class337.method2387(class133.field2287 / 2 - 151, var5 + 1, 302, 32, 0);
            class337.method2378(class133.field2287 / 2 - 150, var5 + 2, class61.field1192 * 3, 30, 9179409);
            class337.method2378(class61.field1192 * 3 + class133.field2287 / 2 - 150, var5 + 2, 300 - (class61.field1192 * 3), 30, 0);
        } else {
            class270.method1904(class133.field2287 / 2 - 152, var5, 304, 34, 9179409);
            class270.method1904(class133.field2287 / 2 - 151, var5 + 1, 302, 32, 0);
            class270.method1894(class133.field2287 / 2 - 150, var5 + 2, class61.field1192 * 3, 30, 9179409);
            class270.method1894(class133.field2287 / 2 + (class61.field1192 * 3) - 150, var5 + 2, 300 - (class61.field1192 * 3), 30, 0);
        }
        arg0.method629(class213.field3522, class133.field2287 / 2, class287.field4696 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)Lwg;", line = 76)
    public static final class321 method2467(int arg0, int arg1) {
        field5525++;
        class321 var2 = (class321) class124.field2185.method487(81, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class25.field656.method1404(arg1, arg0, (byte) -112);
        class321 var4 = new class321();
        if (var3 != null) {
            var4.method2308(0, new class146(var3));
        }
        class124.field2185.method491((long) arg0, arg1 ^ 0xFFFFFFF4, var4);
        return var4;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)V", line = 102)
    public static void method2468(boolean arg0) {
        if (!arg0) {
            field5520 = null;
            field5528 = null;
            field5527 = null;
            field5522 = null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILjava/lang/String;)I", line = 120)
    public static final int method2469(int arg0, String arg1) {
        field5526++;
        if (arg0 <= 5) {
            return 119;
        }
        for (int var2 = 0; var2 < class250.field4100.length; var2++) {
            if (class250.field4100[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
        }
        return -1;
    }
}
