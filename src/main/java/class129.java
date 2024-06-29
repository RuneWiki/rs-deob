import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public abstract class class129 {

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "Z")
    public static boolean field2937 = false;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "[I")
    public static int[] field2940 = new int[5];

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "Lid;")
    public static class60 field2946 = class11.method72("blinken2:", (byte) 117);

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field2941 = 0;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "Z")
    public static boolean field2938 = false;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "Lid;")
    private static class60 field2949 = class11.method72("Loaded title screen", (byte) 106);

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "Lid;")
    public static class60 field2948 = class11.method72(" zuerst von Ihrer Freunde)2Liste(Q", (byte) -27);

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "Lid;")
    private static class60 field2952 = class11.method72("Members object", (byte) -98);

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "Lid;")
    public static class60 field2953 = field2949;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "[S")
    public static short[] field2951 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "Lid;")
    public static class60 field2942 = field2952;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "Lid;")
    public static class60 field2956 = class11.method72("<)4col>", (byte) -96);

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "Lid;")
    public static class60 field2955 = class11.method72("Startseite auf (WSpielkonto wiederherstellen(W)3", (byte) 108);

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "Lke;")
    public static class74 field2944;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)V")
    public static final void method1011(int arg0, int arg1, int arg2) {
        class66 var3 = class107.field2637[class46.field1222][arg1][arg2];
        field2939++;
        if (var3 == null) {
            class43.field1151.method591(class46.field1222, arg1, arg2);
            return;
        }
        int var4 = -99999999;
        class97 var5 = null;
        for (class97 var6 = (class97) var3.method496(10153); var6 != null; var6 = (class97) var3.method500(-1)) {
            class85 var11 = class85.method710(var6.field2386, 10);
            int var12 = var11.field2097;
            if (var11.field2098 == 1) {
                var12 = (var6.field2375 + 1) * var12;
            }
            if (var4 < var12) {
                var5 = var6;
                var4 = var12;
            }
        }
        if (var5 == null) {
            class43.field1151.method591(class46.field1222, arg1, arg2);
            return;
        }
        class97 var7 = null;
        if (arg0 != 28794) {
            method1011(-59, -81, -44);
        }
        int var8 = arg1 + (arg2 << 7) + 1610612736;
        var3.method505(var5, 10);
        class97 var9 = (class97) var3.method496(arg0 ^ 0x57D3);
        class97 var10 = null;
        while (var9 != null) {
            if (var5.field2386 != var9.field2386) {
                if (var10 == null) {
                    var10 = var9;
                }
                if (var9.field2386 != var10.field2386 && var7 == null) {
                    var7 = var9;
                }
            }
            var9 = (class97) var3.method500(-1);
        }
        class43.field1151.method621(class46.field1222, arg1, arg2, class50.method381(class46.field1222, arg2 * 128 + 64, arg1 * 128 + 64, (byte) 10), var5, var8, var10, var7);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B[B)V")
    public abstract void method925(byte arg0, byte[] arg1);

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V")
    public static void method1012(boolean arg0) {
        field2951 = null;
        if (arg0) {
            return;
        }
        field2952 = null;
        field2956 = null;
        field2944 = null;
        field2942 = null;
        field2948 = null;
        field2955 = null;
        field2953 = null;
        field2946 = null;
        field2949 = null;
        field2940 = null;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(III)I")
    public static final int method1013(int arg0, int arg1, int arg2) {
        field2954++;
        int var3 = arg0;
        while (arg2 > 0) {
            var3 = var3 << 1 | arg1 & 0x1;
            arg1 >>>= 0x1;
            arg2--;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)[B")
    public abstract byte[] method924(int arg0);

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
    public static final void method1014(int arg0) {
        class93.field2299 = null;
        class52.field1327 = null;
        field2950++;
        if (arg0 != 14179) {
            method1012(false);
        }
        class59.field1425 = null;
    }
}
