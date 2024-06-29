import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class190 {

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "Lmga;")
    public static class666 field2793 = new class666(4);

    @OriginalMember(owner = "client!tw", name = "f", descriptor = "Lcu;")
    public static class206 field2798 = new class206(81, 3);

    @OriginalMember(owner = "client!tw", name = "g", descriptor = "Lcu;")
    public static class206 field2799 = new class206(48, 4);

    @OriginalMember(owner = "client!tw", name = "i", descriptor = "Z")
    public static boolean field2801 = false;

    @OriginalMember(owner = "client!tw", name = "h", descriptor = "[I")
    public static int[] field2800 = new int[1000];

    @OriginalMember(owner = "client!tw", name = "j", descriptor = "I")
    public static int field2802 = 0;

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!tw", name = "d", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!tw", name = "e", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)V", line = 4)
    public static void method1240(int arg0) {
        field2800 = null;
        field2793 = null;
        field2799 = null;
        if (arg0 != 48) {
            method1242(-46, (byte) -42);
        }
        field2798 = null;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIII)V", line = 20)
    public static final void method1241(int arg0, int arg1, int arg2, int arg3) {
        field2796++;
        class382 var4 = class396.method2276(108, 11, arg2);
        var4.method2232(-13);
        var4.field5099 = arg0;
        var4.field5106 = arg1;
        if (arg3 != 0) {
            method1244(null, -119, -21, -23);
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(IB)V", line = 36)
    public static final void method1242(int arg0, byte arg1) {
        field2795++;
        class382 var2 = class396.method2276(-114, 8, arg0);
        var2.method2228((byte) -55);
        if (arg1 != -84) {
            method1242(-79, (byte) 114);
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIIIIII)V", line = 52)
    public static final void method1243(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 28779) {
            field2793 = null;
        }
        for (class199 var7 = (class199) class346.field4757.method328(0); var7 != null; var7 = (class199) class346.field4757.method331((byte) -100)) {
            if (var7.field2896 <= class642.field8626) {
                var7.method2787(false);
            } else {
                class164.method1129(true, var7.field2889, arg5 >> 1, arg0, arg4 >> 1, (var7.field2890 << 9) + 256, arg3, (var7.field2893 << 9) + 256, var7.field2891 * 2);
                class450.field6177.method1303(var7.field2894, arg6 + class601.field7980[0], arg1 - -class601.field7980[1], var7.field2895 | 0xFF000000, 8364, 0);
            }
        }
        field2794++;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "([BIII)Ljava/lang/String;", line = 84)
    public static final String method1244(byte[] arg0, int arg1, int arg2, int arg3) {
        field2797++;
        char[] var4 = new char[arg2];
        int var5 = 0;
        int var6 = -8 / ((-arg3 - 38) / 49);
        for (int var7 = 0; var7 < arg2; var7++) {
            int var8 = arg0[arg1 + var7] & 0xFF;
            if (var8 != 0) {
                if (var8 >= 128 && var8 < 160) {
                    char var9 = class104.field1562[var8 - 128];
                    if (var9 == '\u0000') {
                        var9 = '?';
                    }
                    var8 = var9;
                }
                var4[var5++] = (char) var8;
            }
        }
        return new String(var4, 0, var5);
    }
}
