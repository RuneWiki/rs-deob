import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class145 implements class121 {

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "Ljava/lang/String;")
    private String field1897;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field1894 = -1;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "Lbc;")
    public static class9 field1891 = new class9(16);

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "Z")
    private boolean field1896;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)Z")
    public final boolean method1080(byte arg0) {
        field1895++;
        if (arg0 != -118) {
            this.method901(true);
        }
        return this.field1896;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)I")
    public final int method901(boolean arg0) {
        field1893++;
        int var2 = class441.method2501(this.field1897, 0);
        if (arg0) {
            return -40;
        } else if (var2 >= 0 && var2 <= 100) {
            return var2;
        } else {
            this.field1896 = true;
            return 100;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIBII)Z")
    public static final boolean method1081(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg3 != -121) {
            return true;
        }
        field1892++;
        for (int var6 = arg0; var6 <= arg2; var6++) {
            for (int var7 = arg4; var7 <= arg1; var7++) {
                if (class554.field7252[var6][var7] == arg5 && class686.field9410[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)Lev;")
    public final class144 method900(int arg0) {
        field1898++;
        if (arg0 < 1) {
            method1083(true);
        }
        return class144.field1888;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/lang/String;B)[B")
    public static final byte[] method1082(String arg0, byte arg1) {
        field1899++;
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        int var4 = -51 % ((-arg1 - 11) / 62);
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg0.charAt(var5);
            if (!(var6 <= '\u0000' || var6 >= '\u0080') || !(var6 < ' ' || var6 > 'ÿ')) {
                var3[var5] = (byte) var6;
            } else if (var6 == '€') {
                var3[var5] = -128;
            } else if (var6 == '‚') {
                var3[var5] = -126;
            } else if (var6 == 'ƒ') {
                var3[var5] = -125;
            } else if (var6 == '„') {
                var3[var5] = -124;
            } else if (var6 == '…') {
                var3[var5] = -123;
            } else if (var6 == '†') {
                var3[var5] = -122;
            } else if (var6 == '‡') {
                var3[var5] = -121;
            } else if (var6 == 'ˆ') {
                var3[var5] = -120;
            } else if (var6 == '‰') {
                var3[var5] = -119;
            } else if (var6 == 'Š') {
                var3[var5] = -118;
            } else if (var6 == '‹') {
                var3[var5] = -117;
            } else if (var6 == 'Œ') {
                var3[var5] = -116;
            } else if (var6 == 'Ž') {
                var3[var5] = -114;
            } else if (var6 == '‘') {
                var3[var5] = -111;
            } else if (var6 == '’') {
                var3[var5] = -110;
            } else if (var6 == '“') {
                var3[var5] = -109;
            } else if (var6 == '”') {
                var3[var5] = -108;
            } else if (var6 == '•') {
                var3[var5] = -107;
            } else if (var6 == '–') {
                var3[var5] = -106;
            } else if (var6 == '—') {
                var3[var5] = -105;
            } else if (var6 == '˜') {
                var3[var5] = -104;
            } else if (var6 == '™') {
                var3[var5] = -103;
            } else if (var6 == 'š') {
                var3[var5] = -102;
            } else if (var6 == '›') {
                var3[var5] = -101;
            } else if (var6 == 'œ') {
                var3[var5] = -100;
            } else if (var6 == 'ž') {
                var3[var5] = -98;
            } else if (var6 == 'Ÿ') {
                var3[var5] = -97;
            } else {
                var3[var5] = 63;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class145(String arg0) {
        this.field1897 = arg0;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(Z)V")
    public static void method1083(boolean arg0) {
        if (arg0) {
            field1891 = null;
        }
    }
}
