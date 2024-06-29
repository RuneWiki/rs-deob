import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class104 {

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field1713 = 2;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "F")
    public static float field1712 = 0.0F;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field1719 = 0;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "[Ldi;")
    public static class161[] field1715;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "[[[Lsg;")
    public static class42[][][] field1716;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V", line = 4)
    public static void method841(int arg0) {
        field1715 = null;
        field1716 = (class42[][][]) null;
        if (arg0 <= 22) {
            method842((byte) -17);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V", line = 18)
    public static final void method842(byte arg0) {
        field1717++;
        if (arg0 < 109) {
            method842((byte) -19);
        }
        int[] var1 = new int[class216.field3356];
        int var2 = 0;
        for (int var3 = 0; var3 < class216.field3356; var3++) {
            class135 var4 = class188.method1361(true, var3);
            if (var4.field2193 >= 0 || var4.field2137 >= 0) {
                var1[var2++] = var3;
            }
        }
        class216.field3361 = new int[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            class216.field3361[var5] = var1[var5];
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)V", line = 64)
    public static final void method843(byte arg0) {
        field1718++;
        if (arg0 < 26) {
            field1716 = (class42[][][]) ((class42[][][]) null);
        }
        for (int var1 = -1; var1 < class45.field703; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class325.field5068[var1];
            }
            class92 var3 = class74.field1140[var2];
            if (var3 != null) {
                class122.method974(var3.method738(-6421), var3, 117);
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "([IBIJ)Ljava/lang/String;", line = 99)
    public static final String method844(int[] arg0, byte arg1, int arg2, long arg3) {
        field1714++;
        if (class36.field550 != null) {
            String var5 = class36.field550.method228(-121, arg2, arg0, arg3);
            if (var5 != null) {
                return var5;
            }
        }
        if (arg1 > -104) {
            method844((int[]) null, (byte) 81, -49, -122L);
        }
        return Long.toString(arg3);
    }
}
