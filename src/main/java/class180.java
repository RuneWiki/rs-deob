import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class180 extends class247 {

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "Luf;")
    public static class168 field2897 = class148.method1019(-1720, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "Luf;")
    private static class168 field2899 = class148.method1019(-1720, "");

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "Luf;")
    public static class168 field2898 = field2899;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
    public static int field2904 = 0;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "Luf;")
    public static class168 field2903 = class148.method1019(-1720, "sl_back");

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "Luf;")
    public static class168 field2905 = class148.method1019(-1720, "Starte 3D)2Softwarebibliothek)3");

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1289(int arg0) {
        field2906++;
        if (arg0 != 0) {
            field2897 = (class168) null;
        }
        if (!class155.method1102(126) && class79.field1127 != class199.field3288) {
            class114.method834(class266.field4489.field3033[0], class266.field4489.field3020[0], class282.field4739, class79.field1127, false, 121, class144.field2221);
        } else if (class79.field1127 != class124.field1923) {
            class124.field1923 = class79.field1127;
            class114.method835(class79.field1127, 123);
            class118.method855(false);
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(B)V", line = 31)
    public static void method1290(byte arg0) {
        field2903 = null;
        field2897 = null;
        field2905 = null;
        field2899 = null;
        if (arg0 < 99) {
            method1294(true, 115);
        }
        field2898 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)Lmf;", line = 64)
    public static final class28 method1291(int arg0, int arg1, int arg2) {
        class127 var3 = class92.field1424[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class28 var4 = var3.field1981;
            var3.field1981 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIZ)I", line = 77)
    public static final int method1292(int arg0, int arg1, boolean arg2) {
        field2900++;
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        if (!arg2) {
            field2899 = (class168) null;
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(B)V", line = 103)
    public static final void method1293(byte arg0) {
        class117 var1 = (class117) class31.field369.method442(65293);
        if (arg0 < 82) {
            field2898 = (class168) null;
        }
        field2901++;
        while (var1 != null) {
            if (var1.field1831 == -1) {
                var1.field1817 = 0;
                class293.method2017(false, var1);
            } else {
                var1.method124((byte) 39);
            }
            var1 = (class117) class31.field369.method440(3);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZI)I", line = 134)
    public static final int method1294(boolean arg0, int arg1) {
        field2907++;
        int var7 = arg1 - 1;
        if (!arg0) {
            field2897 = (class168) null;
        }
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)I", line = 156)
    public static final int method1295(int arg0) {
        if (arg0 == -39014264) {
            field2902++;
            return class68.field902;
        } else {
            return -14;
        }
    }
}
