import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class279 extends class159 {

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
    public int field4035;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
    public int field4039;

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!rh", name = "w", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "[I")
    public int[] field4040;

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "[I")
    public int[] field4043;

    @OriginalMember(owner = "client!rh", name = "x", descriptor = "[I")
    public int[] field4048;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "[Lth;")
    public class621[] field4036;

    @OriginalMember(owner = "client!rh", name = "y", descriptor = "[Lth;")
    public class621[] field4049;

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "[[[B")
    public byte[][][] field4042;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIII)Lpja;")
    public static final class43 method1826(int arg0, int arg1, int arg2, int arg3) {
        field4045++;
        class43 var4 = null;
        if (arg3 == 0) {
            var4 = class492.method2903(class544.field7524, arg1 ^ 0xFFFF8BE1, class73.field983);
            class507.field7107++;
        }
        if (arg3 == 1) {
            var4 = class492.method2903(class531.field7337, 0, class73.field983);
            class660.field8889++;
        }
        var4.field457.method1697(arg0 + class259.field3849, true);
        var4.field457.method1718((byte) -34, arg2 + class120.field1625);
        var4.field457.method1725(class235.field3128.method983(101, 82) ? 1 : 0, 121);
        class15.field148 = arg0;
        class635.field8577 = false;
        if (arg1 != -29727) {
            method1827(null, -9);
        }
        class302.field4242 = arg2;
        class70.method581(-128);
        return var4;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ldt;I)Lvh;")
    public static final class379 method1827(class254 arg0, int arg1) {
        field4044++;
        int var2 = arg0.method1728((byte) 71);
        class673 var3 = class746.method4088((byte) 115)[arg0.method1731((byte) 64)];
        class705 var4 = class717.method3966((byte) 27)[arg0.method1731((byte) 64)];
        int var5 = arg0.method1695(423951304);
        if (arg1 == 82) {
            int var6 = arg0.method1695(423951304);
            return new class379(var2, var3, var4, var5, var6);
        } else {
            return null;
        }
    }
}
