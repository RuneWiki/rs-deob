import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class272 {

    @OriginalMember(owner = "client!taa", name = "d", descriptor = "Lrk;")
    public static class419 field4014 = new class419();

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "I")
    public int field4011;

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "I")
    public int field4012;

    @OriginalMember(owner = "client!taa", name = "c", descriptor = "I")
    public int field4013;

    @OriginalMember(owner = "client!taa", name = "e", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!taa", name = "f", descriptor = "I")
    public int field4016;

    @OriginalMember(owner = "client!taa", name = "g", descriptor = "I")
    public int field4017;

    @OriginalMember(owner = "client!taa", name = "h", descriptor = "I")
    public int field4018;

    @OriginalMember(owner = "client!taa", name = "i", descriptor = "I")
    public int field4019;

    @OriginalMember(owner = "client!taa", name = "j", descriptor = "I")
    public int field4020;

    @OriginalMember(owner = "client!taa", name = "k", descriptor = "I")
    public int field4021;

    @OriginalMember(owner = "client!taa", name = "l", descriptor = "I")
    public int field4022;

    @OriginalMember(owner = "client!taa", name = "m", descriptor = "I")
    public int field4023;

    @OriginalMember(owner = "client!taa", name = "n", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!taa", name = "o", descriptor = "I")
    public int field4025;

    @OriginalMember(owner = "client!taa", name = "p", descriptor = "I")
    public int field4026;

    @OriginalMember(owner = "client!taa", name = "q", descriptor = "I")
    public int field4027;

    @OriginalMember(owner = "client!taa", name = "r", descriptor = "I")
    public int field4028;

    @OriginalMember(owner = "client!taa", name = "s", descriptor = "I")
    public int field4029;

    @OriginalMember(owner = "client!taa", name = "t", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!taa", name = "u", descriptor = "I")
    public int field4031;

    @OriginalMember(owner = "client!taa", name = "v", descriptor = "I")
    public int field4032;

    @OriginalMember(owner = "client!taa", name = "w", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(Z)V")
    public static void method1722(boolean arg0) {
        if (!arg0) {
            field4014 = null;
        }
        field4014 = null;
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(ILwca;)Lwca;")
    public static final class311 method1723(int arg0, class311 arg1) {
        field4024++;
        if (arg1.field4551 != arg0) {
            return class436.method2659(true, arg1.field4551);
        }
        int var2 = arg1.field4667 >>> 16;
        class133 var3 = new class133(class600.field8865);
        for (class184 var4 = (class184) var3.method817(26858); var4 != null; var4 = (class184) var3.method813(124)) {
            if (var4.field2796 == var2) {
                return class436.method2659(true, (int) var4.field7465);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(IIZI)V")
    public static final void method1724(int arg0, int arg1, boolean arg2, int arg3) {
        int var4 = arg1 << 3;
        int var5 = arg0 << 3;
        field4015++;
        int var6 = arg3 << 3;
        class591.field8752 = var6;
        if (class287.field4232 == 2) {
            class495.field7464 = var4;
            class151.field1935 = var5;
            class543.field8120 = var6;
        }
        class578.field8523 = var5;
        class437.method2680(19950);
        class120.field1561 = arg2;
    }
}
