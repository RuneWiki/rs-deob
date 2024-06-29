import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class48 {

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field799 = 0;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "[J")
    public static long[] field798 = new long[200];

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field800 = 0;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "Z")
    public static boolean field804 = true;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "[I")
    public static int[] field810 = new int[128];

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "Lhh;")
    public static class163 field807 = class137.method1065(")3", 17);

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "Lhh;")
    public static class163 field809 = class137.method1065(")4", 17);

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "Lhh;")
    public static class163 field811 = class137.method1065("rect_debug=", 17);

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "Lie;")
    public static class221 field801;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "[[Z")
    public static boolean[][] field808;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public static void method342(int arg0) {
        field809 = null;
        field810 = null;
        field807 = null;
        field811 = null;
        field798 = null;
        field808 = null;
        field801 = null;
        if (arg0 != -3061) {
            method342(-35);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)Lqi;")
    public static final class132 method343(int arg0, int arg1, int arg2) {
        class144 var3 = class259.field4542[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field2741; var4++) {
            class132 var5 = var3.field2746[var4];
            if ((var5.field2568 >> 29 & 0x3L) == 2L && var5.field2555 == arg1 && var5.field2550 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
    public static final void method344(int arg0) {
        if (arg0 != 0) {
            field809 = null;
        }
        field812++;
        class122.field2326.method120((byte) -103);
        class162.field2964.method120((byte) -99);
        class18.field285.method120((byte) -118);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V")
    public static final void method345(boolean arg0) {
        class151.field2828 = null;
        class160.field2947 = 0;
        class231.field4151 = null;
        class75.field1409 = null;
        class38.field633 = null;
        class55.field911 = null;
        class32.field495 = null;
        class87.field1630 = null;
        if (arg0) {
            return;
        }
        class203.field3683 = null;
        class215.field3917 = null;
        class253.field4430 = null;
        field806++;
        class19.field300 = null;
        class40.field662.method1021((byte) -123);
        class51.field859 = null;
        class43.field734 = null;
        class127.field2477 = null;
        class127.field2469 = null;
        class181.field3306 = null;
        class82.field1588 = null;
        class10.field163 = null;
        class64.field1081 = null;
        class239.field4245 = null;
        class253.field4433 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZZIZ)Lv;")
    public static final class22 method346(int arg0, boolean arg1, boolean arg2, int arg3, boolean arg4) {
        field803++;
        if (arg0 != 1000000) {
            return null;
        }
        class262 var5 = null;
        if (class134.field2597 != null) {
            var5 = new class262(arg3, class134.field2597, class131.field2540[arg3], 1000000);
        }
        return new class22(var5, class246.field4334, arg3, arg2, arg4, arg1);
    }
}
