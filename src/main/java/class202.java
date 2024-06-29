import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class202 extends class120 {

    @OriginalMember(owner = "client!el", name = "n", descriptor = "Ljava/lang/String;")
    public static String field3161 = "Loaded update list";

    @OriginalMember(owner = "client!el", name = "l", descriptor = "[I")
    public static int[] field3159 = new int[4096];

    @OriginalMember(owner = "client!el", name = "u", descriptor = "Lpk;")
    public static class100 field3168;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "I")
    public int field3162;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "I")
    public int field3164;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!el", name = "t", descriptor = "I")
    public int field3167;

    @OriginalMember(owner = "client!el", name = "w", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!el", name = "v", descriptor = "[I")
    public static int[] field3169;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ZZII)Ljava/lang/String;")
    public static final String method1388(boolean arg0, boolean arg1, int arg2, int arg3) {
        field3163++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        } else if (arg0 && arg3 >= 0) {
            int var4 = arg3 / arg2;
            int var5 = 2;
            while (var4 != 0) {
                var4 /= arg2;
                var5++;
            }
            char[] var6 = new char[var5];
            if (!arg1) {
                return null;
            }
            var6[0] = '+';
            for (int var7 = var5 - 1; var7 > 0; var7--) {
                int var8 = arg3;
                arg3 /= arg2;
                int var9 = var8 - (arg2 * arg3);
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BI)V")
    public static final void method1389(byte arg0, int arg1) {
        field3165++;
        if (arg0 >= 27) {
            class33 var2 = (class33) class82.field1233.method665((byte) 126, (long) arg1);
            if (var2 != null) {
                var2.method784(false);
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lnj;B)V")
    public static final void method1390(class142 arg0, byte arg1) {
        class145.method967(arg0, 200000, 2);
        int var2 = -46 % ((arg1 + 1) / 63);
        field3160++;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V")
    public static final void method1391(byte arg0) {
        field3166++;
        if (!class192.field3036) {
            return;
        }
        class121.field1758 = null;
        class192.field3036 = false;
        class66.field915 = null;
        if (arg0 != 70) {
            field3168 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(I)V")
    public static void method1392(int arg0) {
        field3169 = null;
        field3159 = null;
        if (arg0 != 0) {
            field3159 = null;
        }
        field3161 = null;
        field3168 = null;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field3159[var0] = class290.method1926(-24422, var0);
        }
        field3168 = new class100(16);
    }
}
