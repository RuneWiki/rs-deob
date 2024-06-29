import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public abstract class class207 {

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "Lij;")
    public static class50 field3439 = class78.method578(127, ")4a=");

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "Lkj;")
    public static class56 field3433 = new class56(16);

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "[I")
    public static int[] field3442 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "Lij;")
    public static class50 field3441 = class78.method578(124, "scrollbar");

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "I")
    public static int field3443 = 0;

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "I")
    public static int field3446 = 0;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public int field3426;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public int field3427;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public int field3429;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public int field3431;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public int field3432;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public int field3434;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "Lfb;")
    public static class9 field3445;

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "[I")
    public static int[] field3444;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)V")
    public static final void method1391(int arg0, int arg1) {
        class221.field3722.method770(true, arg1);
        field3437++;
        class42.field779.method770(true, arg1);
        if (arg0 != 0) {
            method1394(-58);
        }
        class104.field1893.method770(true, arg1);
        class122.field2140.method770(true, arg1);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public static void method1392(byte arg0) {
        field3439 = null;
        field3442 = null;
        field3445 = null;
        field3441 = null;
        field3433 = null;
        field3444 = null;
        int var1 = -40 / ((62 - arg0) / 52);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZ)V")
    public static final void method1393(int arg0, boolean arg1) {
        if (arg0 != 0) {
            field3442 = null;
        }
        class197.method1323(128, class1.field1, class48.field871, arg1, class136.field2370);
        field3428++;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public static final void method1394(int arg0) {
        if (class48.field871 != -1) {
            class100.method768(arg0, class48.field871);
        }
        for (int var1 = 0; var1 < class60.field1094; var1++) {
            if (class210.field3492[var1]) {
                class208.field3458[var1] = true;
            }
            class200.field3306[var1] = class210.field3492[var1];
            class210.field3492[var1] = false;
        }
        class56.field999 = -1;
        class45.field834 = null;
        field3435++;
        class56.field1007 = class244.field4245;
        class73.field1373 = arg0;
        if (class48.field871 != -1) {
            class60.field1094 = 0;
            class125.method902(0, 0, class48.field871, 0, -1, 0, 0, class1.field1, class136.field2370);
        }
        class158.method1101();
        class55.field988 = 0;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lda;IIZ)[Ljd;")
    public static final class85[] method1395(class22 arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            return null;
        } else {
            field3440++;
            return class79.method581((byte) -118, arg1, arg0, arg2) ? class206.method1388(126) : null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(II)V")
    public abstract void method516(int arg0, int arg1);

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BZ)I")
    public static final int method1396(byte arg0, boolean arg1) {
        field3438++;
        long var2 = class104.method785(-1);
        if (arg0 <= 12) {
            method1394(-37);
        }
        for (class101 var4 = arg1 ? (class101) field3433.method446(1) : (class101) field3433.method448((byte) 119); var4 != null; var4 = (class101) field3433.method448((byte) 59)) {
            if (var2 > (var4.field1860 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field1860 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field635;
                    class54.field968[var5] = class70.field1360[var5];
                    var4.method267(-105);
                    return var5;
                }
                var4.method267(124);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)V")
    public abstract void method510(int arg0, int arg1, int arg2);
}
