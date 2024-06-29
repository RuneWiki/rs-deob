import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class255 {

    @OriginalMember(owner = "client!cga", name = "f", descriptor = "[I")
    public int[] field3520 = new int[100];

    @OriginalMember(owner = "client!cga", name = "h", descriptor = "[Lhc;")
    public class293[] field3522 = new class293[100];

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "[Lhj;")
    public class329[] field3515 = new class329[8];

    @OriginalMember(owner = "client!cga", name = "k", descriptor = "[I")
    public int[] field3525 = new int[3];

    @OriginalMember(owner = "client!cga", name = "e", descriptor = "Lcb;")
    public static class318 field3519 = new class318(56, -2);

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!cga", name = "c", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!cga", name = "i", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!cga", name = "j", descriptor = "I")
    public int field3524;

    @OriginalMember(owner = "client!cga", name = "g", descriptor = "Lcc;")
    public static class615 field3521;

    @OriginalMember(owner = "client!cga", name = "d", descriptor = "Ljava/lang/Object;")
    public Object field3518;

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(I)V")
    public static void method1596(int arg0) {
        field3519 = null;
        if (arg0 != Integer.MIN_VALUE) {
            method1597(-94, true, 94);
        }
        field3521 = null;
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(IZI)Ldca;")
    public static final class149 method1597(int arg0, boolean arg1, int arg2) {
        field3517++;
        long var3 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
        if (arg2 != 27628) {
            field3519 = null;
        }
        return (class149) class452.field6159.method2506(54, var3);
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(Lfca;B)V")
    public static final void method1598(class188 arg0, byte arg1) {
        field3516++;
        int var2 = -44 / ((arg1 + 76) / 49);
        class188 var3 = class672.method3719(0, arg0);
        int var4;
        int var5;
        if (var3 == null) {
            var4 = class211.field2763;
            var5 = class303.field4059;
        } else {
            var5 = var3.field2438;
            var4 = var3.field2371;
        }
        class244.method1496(arg0, var4, var5, false, (byte) -83);
        class654.method3624(var4, var5, arg0, (byte) -108);
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(ZZ)V")
    public static final void method1599(boolean arg0, boolean arg1) {
        class32.method195(-2, class316.field4599, class211.field2763, class303.field4059, arg0);
        if (!arg1) {
            method1599(true, false);
        }
        field3523++;
    }
}
