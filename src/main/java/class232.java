import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class232 {

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "Loh;")
    public static class263 field4059 = class253.method1681(-125, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public static int field4061 = 0;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "Lti;")
    public static class5 field4057 = new class5(16);

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    public static int field4063 = -1;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "Lti;")
    public static class5 field4056;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "[I")
    public static int[] field4062;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "[Lpc;")
    public static class21[] field4054;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "[[[B")
    public static byte[][][] field4052;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)I")
    public static final int method1557(byte arg0, int arg1) {
        if (arg0 != 24) {
            field4063 = 36;
        }
        field4058++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    public static final void method1558(int arg0) {
        field4060++;
        class161.method1057(5, -89);
        class198.method1344(arg0, arg0 ^ 0x5);
        class204.method1410(5, true);
        class126.method819(arg0 ^ 0x70, 5);
        class66.method424(5, false);
        class108.method724(40, 5);
        class268.method1815((byte) 109, 5);
        class30.method198(5, (byte) -2);
        class226.method1537(arg0 ^ 0x5, 5);
        class79.method538(5, arg0 - 5);
        class47.method300(5, 2047);
        class266.method1797((byte) 21, 50);
        class174.method1151(arg0 ^ 0xFFFF8264, 5);
        class269.method1822(true, 5);
        class102.field1946.method829(5, (byte) 102);
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V")
    public static void method1559(int arg0) {
        if (arg0 != 5) {
            field4057 = null;
        }
        field4057 = null;
        field4054 = null;
        field4062 = null;
        field4052 = null;
        field4056 = null;
        field4059 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIII)V")
    public static final void method1560(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4053++;
        int var6 = class98.method672(-257, class276.field4831, arg2, class11.field249);
        int var7 = class98.method672(-257, class276.field4831, arg0, class11.field249);
        int var8 = class98.method672(-257, class198.field3587, arg4, class51.field1099);
        if (arg5 == 5) {
            int var9 = class98.method672(-257, class198.field3587, arg1, class51.field1099);
            for (int var10 = var6; var10 <= var7; var10++) {
                class191.method1255(var8, arg3, var9, 63, class38.field870[var10]);
            }
        }
    }
}
