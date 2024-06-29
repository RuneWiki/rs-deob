import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class152 {

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "Ldl;")
    public static class31 field2871 = new class31(32);

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "[I")
    public static int[] field2877 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "Lli;")
    public static class185 field2880 = class245.method1649("l", 122);

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "Lfl;")
    public static class191 field2882 = new class191();

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "Z")
    public static boolean field2884 = true;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    public int field2875;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "Lai;")
    public class106 field2876;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "Lmh;")
    public static class114 field2883;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "[B")
    public static byte[] field2879;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "[I")
    public int[] field2878;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)Lli;")
    public static final class185 method1078(int arg0, int arg1) {
        field2872++;
        class185 var2 = class90.method591(arg1, arg0);
        for (int var3 = var2.method1311((byte) 49) - 3; var3 > 0; var3 -= 3) {
            var2 = class87.method567(-11039, new class185[] { var2.method1301((byte) -112, var3, 0), class179.field3297, var2.method1310(arg0 + 39, var3) });
        }
        if (var2.method1311((byte) 49) > 9) {
            return class87.method567(-11039, new class185[] { class176.field3211, var2.method1301((byte) -119, var2.method1311((byte) 49) - 8, 0), class205.field3764, class193.field3565, var2, class273.field4847 });
        } else if (var2.method1311((byte) 49) > 6) {
            return class87.method567(-11039, new class185[] { class262.field4650, var2.method1301((byte) -86, var2.method1311((byte) 49) - 4, 0), class278.field4942, class193.field3565, var2, class273.field4847 });
        } else {
            return class87.method567(-11039, new class185[] { class207.field3796, var2, class181.field3333 });
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
    public static void method1079(byte arg0) {
        field2871 = null;
        if (arg0 > -117) {
            field2882 = null;
        }
        field2882 = null;
        field2883 = null;
        field2879 = null;
        field2877 = null;
        field2880 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILhf;)V")
    public static final void method1080(int arg0, class168 arg1) {
        field2881++;
        arg1.field3126 = false;
        if (arg1.field3124 != null) {
            arg1.field3124.field1098 = 0;
        }
        if (arg0 != 0) {
            field2877 = null;
        }
        for (class168 var2 = arg1.method342(); var2 != null; var2 = arg1.method336()) {
            method1080(0, var2);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IB)Ldc;")
    public static final class90 method1081(int arg0, byte arg1) {
        field2874++;
        class90 var2 = (class90) class77.field1341.method1615(arg1 ^ 0x6E50, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class189.field3524.method1688(0, arg0, 11);
        class90 var4 = new class90();
        if (var3 != null) {
            var4.method592(arg1 ^ 0xFFFFFFAA, new class118(var3));
        }
        class77.field1341.method1620(var4, (byte) 49, (long) arg0);
        if (arg1 != -86) {
            field2884 = false;
        }
        return var4;
    }
}
