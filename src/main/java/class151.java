import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class151 extends class167 {

    @OriginalMember(owner = "client!ni", name = "X", descriptor = "Lkh;")
    private static class117 field2742 = class224.method1450((byte) 124, "Allocating memory");

    @OriginalMember(owner = "client!ni", name = "Y", descriptor = "I")
    public static int field2743 = -1;

    @OriginalMember(owner = "client!ni", name = "db", descriptor = "Lkh;")
    private static class117 field2748 = class224.method1450((byte) 119, "glow2:");

    @OriginalMember(owner = "client!ni", name = "Z", descriptor = "I")
    public static int field2744 = 0;

    @OriginalMember(owner = "client!ni", name = "gb", descriptor = "Lkh;")
    public static class117 field2751 = field2748;

    @OriginalMember(owner = "client!ni", name = "cb", descriptor = "Lkh;")
    public static class117 field2747 = class224.method1450((byte) -2, "hint_mapedge");

    @OriginalMember(owner = "client!ni", name = "T", descriptor = "Lkh;")
    public static class117 field2738 = field2748;

    @OriginalMember(owner = "client!ni", name = "bb", descriptor = "Lkh;")
    public static class117 field2746 = class224.method1450((byte) -100, "::noclip");

    @OriginalMember(owner = "client!ni", name = "hb", descriptor = "Lkh;")
    public static class117 field2752 = field2742;

    @OriginalMember(owner = "client!ni", name = "eb", descriptor = "I")
    public static int field2749 = -1;

    @OriginalMember(owner = "client!ni", name = "U", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!ni", name = "V", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!ni", name = "ab", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!ni", name = "fb", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!ni", name = "W", descriptor = "Lme;")
    public static class136 field2741;

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V")
    public class151() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BI)[I")
    public final int[] method53(byte arg0, int arg1) {
        if (arg0 != -96) {
            method1077((byte) -78, 62L);
        }
        ++field2750;
        int[] var3 = super.field3013.method1463((byte) -115, arg1);
        if (super.field3013.field4085) {
            class2.method8(var3, 0, class115.field2146, class143.field2583[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(III)V")
    public static final void method1075(int arg0, int arg1, int arg2) {
        class170 var3 = class109.field2063[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field3067 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)V")
    public static void method1076(boolean arg0) {
        field2748 = null;
        field2742 = null;
        field2746 = null;
        if (arg0) {
            method1075(115, 85, 48);
        }
        field2747 = null;
        field2752 = null;
        field2738 = null;
        field2751 = null;
        field2741 = null;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(BJ)Lkh;")
    public static final class117 method1077(byte arg0, long arg1) {
        if (arg0 != -128) {
            return null;
        } else {
            ++field2740;
            return class175.method1223(arg1, false, 10, (byte) -96);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IBILkh;Lkh;Lkh;)V")
    public static final void method1078(int arg0, byte arg1, int arg2, class117 arg3, class117 arg4, class117 arg5) {
        for (int var6 = 99; var6 > 0; --var6) {
            class96.field1766[var6] = class96.field1766[var6 + -1];
            class229.field4118[var6] = class229.field4118[var6 + -1];
            class6.field99[var6] = class6.field99[var6 - 1];
            class106.field1939[var6] = class106.field1939[var6 + -1];
            class90.field1664[var6] = class90.field1664[var6 + -1];
        }
        class229.field4118[0] = arg3;
        if (arg1 != 119) {
            method1076(false);
        }
        class96.field1766[0] = arg2;
        ++class143.field2589;
        class6.field99[0] = arg5;
        class228.field4111 = class194.field3470;
        class106.field1939[0] = arg4;
        ++field2739;
        class90.field1664[0] = arg0;
    }
}
