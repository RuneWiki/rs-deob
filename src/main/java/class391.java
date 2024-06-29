import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class391 {

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "[Ljava/lang/String;")
    private String[] field5234 = new String[0];

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "Z")
    private boolean field5236 = false;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    private int field5235 = -1;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    private int field5237;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "Lfca;")
    public static class75 field5229 = new class75(4);

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "[Lbi;")
    public static class446[] field5240 = new class446[75];

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)Z", line = 5)
    public static final boolean method2286(int arg0, int arg1, int arg2) {
        if (arg1 != -32320) {
            method2286(33, 11, -93);
        }
        field5230++;
        return (arg2 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V", line = 24)
    public static void method2287(byte arg0) {
        field5229 = null;
        field5240 = null;
        if (arg0 > -71) {
            field5243 = 65;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)[Ljava/lang/String;", line = 35)
    public final String[] method2288(int arg0) {
        field5233++;
        if (arg0 <= 95) {
            this.field5234 = null;
        }
        String[] var2 = new String[this.field5235 + 1];
        class252.method1540(this.field5234, 0, var2, 0, this.field5235 + 1);
        return var2;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 49)
    public final void method2289(String arg0, byte arg1) {
        int var3 = 127 % ((arg1 - 41) / 37);
        this.method2291(this.field5235 + 1, (byte) 18, arg0);
        field5232++;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)V", line = 59)
    private final void method2290(byte arg0, int arg1) {
        if (arg0 < 27) {
            field5243 = -47;
        }
        field5231++;
        String[] var3 = new String[this.method2293((byte) 125, arg1)];
        class252.method1540(this.field5234, 0, var3, 0, this.field5234.length);
        this.field5234 = var3;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IBLjava/lang/String;)V", line = 80)
    private final void method2291(int arg0, byte arg1, String arg2) {
        field5239++;
        if (arg1 != 18) {
            return;
        }
        if (arg0 > this.field5235) {
            this.field5235 = arg0;
        }
        if (arg0 >= this.field5234.length) {
            this.method2290((byte) 99, arg0);
        }
        this.field5234[arg0] = arg2;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(CIB)C", line = 99)
    public static final char method2292(char arg0, int arg1, byte arg2) {
        field5242++;
        if (arg0 >= 'À' && arg0 <= 'ÿ') {
            if (arg0 >= 'À' && arg0 <= 'Æ') {
                return 'A';
            }
            if (arg0 == 'Ç') {
                return 'C';
            }
            if (arg0 >= 'È' && arg0 <= 'Ë') {
                return 'E';
            }
            if (arg0 >= 'Ì' && arg0 <= 'Ï') {
                return 'I';
            }
            if (arg0 >= 'Ò' && arg0 <= 'Ö') {
                return 'O';
            }
            if (arg0 >= 'Ù' && arg0 <= 'Ü') {
                return 'U';
            }
            if (arg0 == 'Ý') {
                return 'Y';
            }
            if (arg0 == 'ß') {
                return 's';
            }
            if (arg0 >= 'à' && arg0 <= 'æ') {
                return 'a';
            }
            if (arg0 == 'ç') {
                return 'c';
            }
            if (arg0 >= 'è' && arg0 <= 'ë') {
                return 'e';
            }
            if (arg0 >= 'ì' && arg0 <= 'ï') {
                return 'i';
            }
            if (arg0 >= 'ò' && arg0 <= 'ö') {
                return 'o';
            }
            if (arg0 >= 'ù' && arg0 <= 'ü') {
                return 'u';
            }
            if (arg0 == 'ý' || arg0 == 'ÿ') {
                return 'y';
            }
        }
        if (arg0 == 'Œ') {
            return 'O';
        }
        int var3 = -45 / ((-arg2 - 29) / 52);
        if (arg0 == 'œ') {
            return 'o';
        } else if (arg0 == 'Ÿ') {
            return 'Y';
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ad", name = "toString", descriptor = "()Ljava/lang/String;", line = 174)
    public final String toString() {
        field5238++;
        StringBuffer var1 = new StringBuffer();
        var1.append("[");
        for (int var2 = 0; var2 < this.field5235; var2++) {
            if (var2 != 0) {
                var1.append(", ");
            }
            var1.append(this.field5234[var2]);
        }
        var1.append("]");
        return var1.toString();
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(IZ)V", line = 241)
    public class391(int arg0, boolean arg1) {
        this.field5236 = arg1;
        this.field5237 = arg0;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(BI)I", line = 215)
    private final int method2293(byte arg0, int arg1) {
        field5241++;
        int var3 = this.field5234.length;
        int var4 = -127 % ((34 - arg0) / 42);
        while (var3 <= arg1) {
            if (!this.field5236) {
                var3 += this.field5237;
            } else if (var3 == 0) {
                var3 = 1;
            } else {
                var3 = this.field5237 * var3;
            }
        }
        return var3;
    }
}
