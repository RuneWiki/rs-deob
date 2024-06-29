import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class34 {

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field727 = 0;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "Ljava/util/Calendar;")
    public static Calendar field728 = Calendar.getInstance();

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "Lmh;")
    private static class128 field735 = class22.method156(127, "Loading textures )2 ");

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "Lmh;")
    public static class128 field734 = field735;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "Lmh;")
    public static class128 field730 = class22.method156(125, "Starte 3D)2Softwarebibliothek)3");

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "Lmh;")
    public static class128 field736 = class22.method156(123, "::tele ");

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "Lmh;")
    public static class128 field737 = class22.method156(124, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "[J")
    public static long[] field738 = new long[200];

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "[I")
    public static int[] field732 = new int[2000];

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "Lcj;")
    public static class305 field724;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "[[B")
    public static byte[][] field733;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "([Lmh;[SI)V", line = 22)
    public static final void method240(class128[] arg0, short[] arg1, int arg2) {
        class153.method1021(arg0.length - 1, arg0, false, 0, arg1);
        field726++;
        if (arg2 <= 56) {
            field737 = (class128) null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BI)Lmh;", line = 34)
    public static final class128 method241(byte arg0, int arg1) {
        class128 var2 = class257.method1811(arg1, (byte) -116);
        if (arg0 <= 31) {
            method242(42, -60, -42, 103, (byte) 47);
        }
        for (int var3 = var2.method865((byte) 61) - 3; var3 > 0; var3 -= 3) {
            var2 = class28.method177((byte) -124, new class128[] { var2.method848(0, 121, var3), class97.field1677, var2.method829(var3, (byte) 116) });
        }
        field725++;
        if (var2.method865((byte) -58) <= 9) {
            return var2.method865((byte) -122) <= 6 ? class28.method177((byte) -119, new class128[] { class144.field2452, var2, class115.field1932 }) : class28.method177((byte) -92, new class128[] { class30.field679, var2.method848(0, 105, var2.method865((byte) -58) - 4), class293.field5022, class176.field3104, var2, class294.field5029 });
        } else {
            return class28.method177((byte) -61, new class128[] { class252.field4353, var2.method848(0, 92, var2.method865((byte) -98) - 8), class241.field4113, class176.field3104, var2, class294.field5029 });
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIB)V", line = 72)
    public static final void method242(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field729++;
        if (field727 == 1) {
            class112.field1879[class148.field2549 / 100].method273(class240.field4097 - 8, class97.field1685 + -8);
        }
        if (field727 == 2) {
            class112.field1879[(class148.field2549 / 100) + 4].method273(class240.field4097 - 8, class97.field1685 - 8);
        }
        if (arg4 == -28) {
            class229.method1569((byte) 121);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BZLcj;)V", line = 106)
    public static final void method243(byte arg0, boolean arg1, class305 arg2) {
        if (class247.field4247 || arg1) {
            int var3 = class16.field420;
            int var4 = var3 * 956 / 503;
            class275.field4772.method283((class199.field3465 - var4) / 2, 0, var4, var3);
            class147.field2534.method448(class199.field3465 / 2 - (class147.field2534.field2625 / 2), 18);
        }
        arg2.method2082(class268.field4654, class199.field3465 / 2, class16.field420 / 2 - 26, 16777215, -1);
        field723++;
        int var5 = class16.field420 / 2 - 18;
        if (class247.field4247) {
            class269.method1871(class199.field3465 / 2 - 152, var5, 304, 34, 9179409);
            class269.method1871(class199.field3465 / 2 - 151, var5 + 1, 302, 32, 0);
            class269.method1878(class199.field3465 / 2 - 150, var5 - -2, class10.field318 * 3, 30, 9179409);
            class269.method1878(class10.field318 * 3 + (class199.field3465 / 2 - 150), var5 + 2, 300 - (class10.field318 * 3), 30, 0);
        } else {
            class213.method1463(class199.field3465 / 2 - 152, var5, 304, 34, 9179409);
            class213.method1463(class199.field3465 / 2 - 151, var5 + 1, 302, 32, 0);
            class213.method1464(class199.field3465 / 2 - 150, var5 + 2, class10.field318 * 3, 30, 9179409);
            class213.method1464(class199.field3465 / 2 + (class10.field318 * 3) - 150, var5 + 2, 300 - (class10.field318 * 3), 30, 0);
        }
        if (arg0 != -17) {
            field734 = (class128) null;
        }
        arg2.method2082(class205.field3620, class199.field3465 / 2, class16.field420 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V", line = 158)
    public static void method244(int arg0) {
        field728 = null;
        if (arg0 < 117) {
            field735 = (class128) null;
        }
        field732 = null;
        field730 = null;
        field724 = null;
        field733 = (byte[][]) null;
        field735 = null;
        field738 = null;
        field736 = null;
        field737 = null;
        field734 = null;
    }
}
