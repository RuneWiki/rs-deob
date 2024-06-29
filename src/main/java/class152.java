import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class152 {

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    private int field2160;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "J")
    private long field2158;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2162 = null;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "[I")
    public static int[] field2159 = new int[2];

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "Lul;")
    public static class597 field2154;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "Lwia;")
    public static class791 field2163;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IB)Liq;", line = 5)
    public final class631 method1044(int arg0, byte arg1) {
        if (arg1 < 91) {
            field2163 = null;
        }
        field2165++;
        return class631.method3617((byte) -120, this.method1048((byte) -113, arg0));
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BC)C", line = 18)
    public static final char method1045(byte arg0, char arg1) {
        field2164++;
        int var2 = -8 % ((arg0 + 57) / 35);
        if (arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-') {
            return '_';
        } else if (arg1 == '[' || arg1 == ']' || arg1 == '#') {
            return arg1;
        } else if (arg1 == 'à' || arg1 == 'á' || arg1 == 'â' || arg1 == 'ä' || arg1 == 'ã' || arg1 == 'À' || arg1 == 'Á' || arg1 == 'Â' || arg1 == 'Ä' || arg1 == 'Ã') {
            return 'a';
        } else if (arg1 == 'è' || arg1 == 'é' || arg1 == 'ê' || arg1 == 'ë' || arg1 == 'È' || arg1 == 'É' || arg1 == 'Ê' || arg1 == 'Ë') {
            return 'e';
        } else if (arg1 == 'í' || arg1 == 'î' || arg1 == 'ï' || arg1 == 'Í' || arg1 == 'Î' || arg1 == 'Ï') {
            return 'i';
        } else if (arg1 == 'ò' || arg1 == 'ó' || arg1 == 'ô' || arg1 == 'ö' || arg1 == 'õ' || arg1 == 'Ò' || arg1 == 'Ó' || arg1 == 'Ô' || arg1 == 'Ö' || arg1 == 'Õ') {
            return 'o';
        } else if (arg1 == 'ù' || arg1 == 'ú' || arg1 == 'û' || arg1 == 'ü' || arg1 == 'Ù' || arg1 == 'Ú' || arg1 == 'Û' || arg1 == 'Ü') {
            return 'u';
        } else if (arg1 == 'ç' || arg1 == 'Ç') {
            return 'c';
        } else if (arg1 == 'ÿ' || arg1 == 'Ÿ') {
            return 'y';
        } else if (arg1 == 'ñ' || arg1 == 'Ñ') {
            return 'n';
        } else if (arg1 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg1);
        }
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Liq;)V", line = 417)
    public class152(class631 arg0) {
        this.field2160 = 1;
        this.field2158 = arg0.field8862;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V", line = 430)
    public static void method1046(int arg0) {
        field2159 = null;
        field2162 = null;
        field2163 = null;
        int var1 = -9 / ((75 - arg0) / 50);
        field2154 = null;
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "([Liq;)V", line = 441)
    public class152(class631[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method1047(-4792, arg0[var2]);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILiq;)V", line = 460)
    private final void method1047(int arg0, class631 arg1) {
        this.field2158 |= (arg1.field8862 << class631.field8873 * this.field2160++);
        field2157++;
        if (arg0 != -4792) {
            field2159 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BI)I", line = 471)
    private final int method1048(byte arg0, int arg1) {
        field2156++;
        if (arg0 > -87) {
            this.method1048((byte) 30, 101);
        }
        return (int) (this.field2158 >> class631.field8873 * arg1) & 0xF;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)I", line = 484)
    public final int method1049(boolean arg0) {
        if (arg0) {
            field2163 = null;
        }
        field2161++;
        return this.field2160;
    }
}
