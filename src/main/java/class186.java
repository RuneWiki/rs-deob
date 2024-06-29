import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class186 {

    @OriginalMember(owner = "client!r", name = "d", descriptor = "Lkh;")
    private static class117 field3332 = class224.method1450((byte) 121, "Please remove ");

    @OriginalMember(owner = "client!r", name = "a", descriptor = "S")
    public static short field3329 = 256;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field3334 = 0;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "Lkh;")
    public static class117 field3342 = class224.method1450((byte) 4, "");

    @OriginalMember(owner = "client!r", name = "e", descriptor = "Lkh;")
    private static class117 field3333 = class224.method1450((byte) -85, "Username: ");

    @OriginalMember(owner = "client!r", name = "h", descriptor = "Lkh;")
    public static class117 field3336 = field3333;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "Lkh;")
    public static class117 field3346 = field3332;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "Lkh;")
    public static class117 field3335 = field3332;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public int field3330;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public int field3331;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public int field3337;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public int field3340;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public int field3341;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "I")
    public int field3345;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "Lai;")
    public static class10 field3343;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(III)V")
    public abstract void method1080(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZIII)I")
    public static final int method1265(boolean arg0, int arg1, int arg2, int arg3) {
        field3344++;
        if (!arg0) {
            field3342 = null;
        }
        int var4 = arg1 >> 7;
        int var5 = arg3 >> 7;
        if (var5 < 0 || var4 < 0 || var5 > 103 || var4 > 103) {
            return 0;
        }
        int var6 = arg2;
        if (arg2 < 3 && (class233.field4200[1][var5][var4] & 0x2) == 2) {
            var6 = arg2 + 1;
        }
        int var7 = arg1 & 0x7F;
        int var8 = arg3 & 0x7F;
        int var9 = (128 - var8) * class156.field2839[var6][var5][var4 + 1] + class156.field2839[var6][var5 + 1][var4 + 1] * var8 >> 7;
        int var10 = (128 - var8) * class156.field2839[var6][var5][var4] + class156.field2839[var6][var5 + 1][var4] * var8 >> 7;
        return (128 - var7) * var10 + var7 * var9 >> 7;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
    public static void method1266(boolean arg0) {
        field3343 = null;
        field3335 = null;
        field3333 = null;
        if (!arg0) {
            method1265(true, 116, 38, -3);
        }
        field3336 = null;
        field3346 = null;
        field3332 = null;
        field3342 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V")
    public abstract void method1084(int arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)I")
    public static final int method1267(int arg0) {
        if (arg0 == -1547629337) {
            field3338++;
            int var1 = method1265(true, field3339, class203.field3675, class19.field535);
            return var1 - class31.field732 >= 800 || (class233.field4200[class203.field3675][class19.field535 >> 7][field3339 >> 7] & 0x4) == 0 ? 3 : class203.field3675;
        } else {
            return 123;
        }
    }
}
