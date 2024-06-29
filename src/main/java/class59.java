import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class59 extends class16 {

    @OriginalMember(owner = "client!g", name = "E", descriptor = "Z")
    private boolean field1062 = false;

    @OriginalMember(owner = "client!g", name = "H", descriptor = "I")
    private int field1065 = -32768;

    @OriginalMember(owner = "client!g", name = "U", descriptor = "I")
    private int field1078 = 0;

    @OriginalMember(owner = "client!g", name = "x", descriptor = "I")
    private int field1055 = 0;

    @OriginalMember(owner = "client!g", name = "bb", descriptor = "I")
    public int field1085;

    @OriginalMember(owner = "client!g", name = "v", descriptor = "I")
    private int field1053;

    @OriginalMember(owner = "client!g", name = "u", descriptor = "I")
    public int field1052;

    @OriginalMember(owner = "client!g", name = "F", descriptor = "I")
    private int field1063;

    @OriginalMember(owner = "client!g", name = "R", descriptor = "I")
    private int field1075;

    @OriginalMember(owner = "client!g", name = "C", descriptor = "I")
    private int field1060;

    @OriginalMember(owner = "client!g", name = "K", descriptor = "I")
    public int field1068;

    @OriginalMember(owner = "client!g", name = "z", descriptor = "I")
    private int field1057;

    @OriginalMember(owner = "client!g", name = "eb", descriptor = "I")
    private int field1088;

    @OriginalMember(owner = "client!g", name = "L", descriptor = "I")
    public int field1069;

    @OriginalMember(owner = "client!g", name = "Q", descriptor = "I")
    public int field1074;

    @OriginalMember(owner = "client!g", name = "J", descriptor = "Lig;")
    private class186 field1067;

    @OriginalMember(owner = "client!g", name = "M", descriptor = "[J")
    public static long[] field1070 = new long[200];

    @OriginalMember(owner = "client!g", name = "B", descriptor = "Lij;")
    private static class50 field1059 = class78.method578(122, "");

    @OriginalMember(owner = "client!g", name = "r", descriptor = "Lij;")
    public static class50 field1049 = field1059;

    @OriginalMember(owner = "client!g", name = "S", descriptor = "Lwd;")
    public static class217 field1076 = new class217(8);

    @OriginalMember(owner = "client!g", name = "s", descriptor = "D")
    public double field1050;

    @OriginalMember(owner = "client!g", name = "w", descriptor = "D")
    public double field1054;

    @OriginalMember(owner = "client!g", name = "y", descriptor = "D")
    private double field1056;

    @OriginalMember(owner = "client!g", name = "D", descriptor = "D")
    private double field1061;

    @OriginalMember(owner = "client!g", name = "I", descriptor = "D")
    private double field1066;

    @OriginalMember(owner = "client!g", name = "N", descriptor = "D")
    private double field1071;

    @OriginalMember(owner = "client!g", name = "X", descriptor = "D")
    private double field1081;

    @OriginalMember(owner = "client!g", name = "Y", descriptor = "D")
    public double field1082;

    @OriginalMember(owner = "client!g", name = "t", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!g", name = "G", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!g", name = "O", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!g", name = "P", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!g", name = "T", descriptor = "I")
    public int field1077;

    @OriginalMember(owner = "client!g", name = "V", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!g", name = "W", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!g", name = "Z", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!g", name = "ab", descriptor = "I")
    private int field1084;

    @OriginalMember(owner = "client!g", name = "cb", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!g", name = "db", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!g", name = "A", descriptor = "Lda;")
    public static class22 field1058;

    @OriginalMember(owner = "client!g", name = "fb", descriptor = "[[[Lr;")
    public static class65[][][] field1089;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method129(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1079++;
        class98 var11 = this.method461(126);
        if (var11 != null) {
            var11.method129(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field1065 = var11.method126();
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BIIII)V")
    public final void method459(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field1083++;
        if (!this.field1062) {
            double var6 = (double) (arg4 - this.field1075);
            double var8 = (double) (arg1 - this.field1060);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1082 = (double) this.field1063 * var8 / var10 + (double) this.field1060;
            this.field1054 = (double) this.field1053;
            this.field1050 = (double) this.field1063 * var6 / var10 + (double) this.field1075;
        }
        if (arg0 != 11) {
            this.field1053 = 113;
        }
        double var12 = (double) (this.field1068 + 1 - arg2);
        this.field1066 = ((double) arg1 - this.field1082) / var12;
        this.field1061 = ((double) arg4 - this.field1050) / var12;
        this.field1071 = Math.sqrt(this.field1066 * this.field1066 + this.field1061 * this.field1061);
        if (!this.field1062) {
            this.field1056 = -this.field1071 * Math.tan((double) this.field1057 * 0.02454369D);
        }
        this.field1081 = ((double) arg3 - this.field1054 - (this.field1056 * var12)) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(II)V")
    public final void method460(int arg0, int arg1) {
        this.field1062 = true;
        this.field1050 += (double) arg0 * this.field1061;
        this.field1082 += (double) arg0 * this.field1066;
        this.field1054 += this.field1081 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1056;
        this.field1056 += (double) arg0 * this.field1081;
        this.field1077 = (int) (Math.atan2(this.field1066, this.field1061) * 325.949D) + 1024 & 0x7FF;
        this.field1084 = (int) (Math.atan2(this.field1056, this.field1071) * 325.949D) & 0x7FF;
        if (this.field1067 != null) {
            this.field1055 += arg0;
            label30: while (true) {
                do {
                    do {
                        if (this.field1067.field3038[this.field1078] >= this.field1055) {
                            break label30;
                        }
                        this.field1055 -= this.field1067.field3038[this.field1078];
                        this.field1078++;
                    } while (this.field1067.field3043.length > this.field1078);
                    this.field1078 -= this.field1067.field3030;
                } while (this.field1078 >= 0 && this.field1078 < this.field1067.field3043.length);
                this.field1078 = 0;
            }
        }
        field1080++;
        if (arg1 != 0) {
            this.method129(72, 68, 13, 45, -43, -13, 118, -113, -45L);
        }
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(I)Lwg;")
    private final class98 method461(int arg0) {
        if (arg0 != 126) {
            this.method129(-103, 107, 28, -5, 27, 37, 95, 86, 92L);
        }
        class109 var2 = class210.method1405(1, this.field1088);
        field1064++;
        class98 var3 = var2.method809(this.field1078, -1);
        if (var3 == null) {
            return null;
        } else {
            var3.method755(this.field1084);
            return var3;
        }
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(I)V")
    public static void method462(int arg0) {
        field1070 = null;
        if (arg0 != -32768) {
            return;
        }
        field1049 = null;
        field1089 = null;
        field1058 = null;
        field1076 = null;
        field1059 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)V")
    public static final void method463(int arg0, byte arg1) {
        field1072++;
        class137 var2 = client.method608(1, false, arg0);
        var2.method947(0);
        if (arg1 != 7) {
            field1087 = -35;
        }
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(II)I")
    public static final int method464(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "()I")
    public final int method126() {
        field1051++;
        return this.field1065;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class59(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1085 = arg5;
        this.field1053 = arg4;
        this.field1052 = arg1;
        this.field1063 = arg8;
        this.field1075 = arg3;
        this.field1060 = arg2;
        this.field1068 = arg6;
        this.field1057 = arg7;
        this.field1062 = false;
        this.field1088 = arg0;
        this.field1069 = arg10;
        this.field1074 = arg9;
        int var12 = class210.method1405(1, this.field1088).field1951;
        if (var12 == -1) {
            this.field1067 = null;
        } else {
            this.field1067 = class123.method891(-5664, var12);
        }
    }
}
