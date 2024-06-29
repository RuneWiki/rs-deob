import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class44 extends class68 {

    @OriginalMember(owner = "client!jj", name = "D", descriptor = "J")
    public long field688;

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "Lce;")
    private static class126 field680 = class206.method1445(-7923, "Discard");

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "Lce;")
    public static class126 field678 = class206.method1445(-7923, "Vous ne pouvez pas ajouter votre nom -9 votre liste noire)3");

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "Z")
    public static boolean field684 = true;

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "Lce;")
    public static class126 field679 = field680;

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "Z")
    public static boolean field677 = true;

    @OriginalMember(owner = "client!jj", name = "x", descriptor = "Lce;")
    public static class126 field683 = class206.method1445(-7923, ":allyreq:");

    @OriginalMember(owner = "client!jj", name = "v", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!jj", name = "w", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!jj", name = "B", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!jj", name = "C", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!jj", name = "E", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "Loc;")
    public static class78 field685;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lcc;I)I", line = 6)
    public static final int method272(class313 arg0, int arg1) {
        field682++;
        int var2 = 0;
        if (arg0.method2166(-28257, class291.field4822)) {
            var2++;
        }
        if (arg0.method2166(-28257, class129.field2218)) {
            var2++;
        }
        if (arg0.method2166(-28257, class305.field5126)) {
            var2++;
        }
        if (arg0.method2166(-28257, class159.field2878)) {
            var2++;
        }
        if (arg0.method2166(-28257, class226.field3809)) {
            var2++;
        }
        if (arg0.method2166(-28257, class290.field4811)) {
            var2++;
        }
        if (arg0.method2166(-28257, class283.field4703)) {
            var2++;
        }
        if (arg0.method2166(-28257, class112.field1873)) {
            var2++;
        }
        if (arg0.method2166(-28257, class93.field1459)) {
            var2++;
        }
        if (arg1 != 2) {
            field680 = (class126) null;
        }
        if (arg0.method2166(arg1 ^ 0xFFFF919D, class59.field952)) {
            var2++;
        }
        if (arg0.method2166(-28257, class182.field3172)) {
            var2++;
        }
        if (arg0.method2166(-28257, class304.field5082)) {
            var2++;
        }
        if (arg0.method2166(arg1 ^ 0xFFFF919D, class300.field4971)) {
            var2++;
        }
        if (arg0.method2166(-28257, class194.field3301)) {
            var2++;
        }
        if (arg0.method2166(-28257, class140.field2566)) {
            var2++;
        }
        if (arg0.method2166(arg1 ^ 0xFFFF919D, class103.field1650)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(JI)V", line = 78)
    public static final void method273(long arg0, int arg1) {
        int var3 = -102 / ((-arg1 - 55) / 44);
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var5) {
        }
        field681++;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BLcc;Lcc;)V", line = 94)
    public static final void method274(byte arg0, class313 arg1, class313 arg2) {
        field687++;
        class118.field1987 = class209.method1460(arg1, arg2, 0, (byte) -123, class157.field2833);
        if (class56.field846) {
            class209.field3592 = class118.method779(0, arg2, -120, class157.field2833, arg1);
        } else {
            class209.field3592 = (class275) class118.field1987;
        }
        if (arg0 > 71) {
            class174.field3077 = class209.method1460(arg1, arg2, 0, (byte) -124, class85.field1349);
            class200.field3414 = class209.method1460(arg1, arg2, 0, (byte) -118, class300.field4966);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IILce;)V", line = 117)
    public static final void method275(int arg0, int arg1, class126 arg2) {
        field686++;
        class245 var3 = class139.method1022(2, (byte) -109, arg1);
        var3.method1683(arg0);
        var3.field4148 = arg2;
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(II)Lfd;", line = 143)
    public static final class219 method276(int arg0, int arg1) {
        if (arg1 > -4) {
            method273(-44L, 108);
        }
        field689++;
        class219 var2 = (class219) class223.field3756.method1173(-19839, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        class219 var3 = class64.method467(0, class33.field481, false, arg0, class273.field4591);
        if (var3 != null) {
            class223.field3756.method1179(var3, (long) arg0, (byte) -72);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V", line = 176)
    public static void method277(int arg0) {
        field685 = null;
        field683 = null;
        if (arg0 != 2) {
            method275(66, -91, (class126) null);
        }
        field678 = null;
        field680 = null;
        field679 = null;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V", line = 197)
    public class44() {
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(J)V", line = 199)
    public class44(long arg0) {
        this.field688 = arg0;
    }
}
