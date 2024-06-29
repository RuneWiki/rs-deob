import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class64 extends class260 {

    @OriginalMember(owner = "client!jf", name = "J", descriptor = "I")
    private int field1058 = -32768;

    @OriginalMember(owner = "client!jf", name = "C", descriptor = "I")
    private int field1051 = 0;

    @OriginalMember(owner = "client!jf", name = "W", descriptor = "I")
    private int field1071 = -1;

    @OriginalMember(owner = "client!jf", name = "db", descriptor = "Z")
    private boolean field1078 = false;

    @OriginalMember(owner = "client!jf", name = "I", descriptor = "I")
    private int field1057 = 0;

    @OriginalMember(owner = "client!jf", name = "S", descriptor = "I")
    private int field1067;

    @OriginalMember(owner = "client!jf", name = "H", descriptor = "I")
    public int field1056;

    @OriginalMember(owner = "client!jf", name = "cb", descriptor = "I")
    private int field1077;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
    public int field1040;

    @OriginalMember(owner = "client!jf", name = "O", descriptor = "I")
    private int field1063;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "I")
    private int field1043;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "I")
    private int field1044;

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "I")
    public int field1048;

    @OriginalMember(owner = "client!jf", name = "ab", descriptor = "I")
    public int field1075;

    @OriginalMember(owner = "client!jf", name = "T", descriptor = "I")
    private int field1068;

    @OriginalMember(owner = "client!jf", name = "V", descriptor = "I")
    public int field1070;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "Ltg;")
    private class181 field1038;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "[I")
    public static int[] field1035 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!jf", name = "Q", descriptor = "Laf;")
    public static class68 field1065 = new class68(64);

    @OriginalMember(owner = "client!jf", name = "X", descriptor = "[Lqi;")
    public static class129[] field1072 = new class129[14];

    @OriginalMember(owner = "client!jf", name = "Y", descriptor = "I")
    public static int field1073 = 0;

    @OriginalMember(owner = "client!jf", name = "bb", descriptor = "[Ljava/lang/String;")
    public static String[] field1076 = new String[100];

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "D")
    public double field1041;

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "D")
    private double field1047;

    @OriginalMember(owner = "client!jf", name = "A", descriptor = "D")
    private double field1049;

    @OriginalMember(owner = "client!jf", name = "E", descriptor = "D")
    private double field1053;

    @OriginalMember(owner = "client!jf", name = "F", descriptor = "D")
    public double field1054;

    @OriginalMember(owner = "client!jf", name = "G", descriptor = "D")
    private double field1055;

    @OriginalMember(owner = "client!jf", name = "K", descriptor = "D")
    public double field1059;

    @OriginalMember(owner = "client!jf", name = "U", descriptor = "D")
    private double field1069;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "I")
    private int field1045;

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!jf", name = "B", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!jf", name = "D", descriptor = "I")
    public int field1052;

    @OriginalMember(owner = "client!jf", name = "L", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!jf", name = "M", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!jf", name = "N", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!jf", name = "R", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!jf", name = "P", descriptor = "Llb;")
    private class130 field1064;

    @OriginalMember(owner = "client!jf", name = "Z", descriptor = "[I")
    public static int[] field1074;

    @OriginalMember(owner = "client!jf", name = "eb", descriptor = "[I")
    public static int[] field1079;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IJ)V")
    public static final void method450(int arg0, long arg1) {
        field1037++;
        if (arg0 != -5666) {
            method455(42, 46);
        }
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class239.field3875; var3++) {
            if (class60.field992[var3] == arg1) {
                class68.field1124++;
                class239.field3875--;
                for (int var4 = var3; var4 < class239.field3875; var4++) {
                    class86.field1379[var4] = class86.field1379[var4 + 1];
                    class141.field2288[var4] = class141.field2288[var4 + 1];
                    class239.field3878[var4] = class239.field3878[var4 + 1];
                    class60.field992[var4] = class60.field992[var4 + 1];
                    class137.field2263[var4] = class137.field2263[var4 + 1];
                    class197.field3132[var4] = class197.field3132[var4 + 1];
                }
                class99.field1633 = class66.field1094;
                class68.field1113.method534((byte) 51, 232);
                class68.field1113.method1502((byte) 125, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(IIIII)V")
    public final void method451(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1061++;
        if (!this.field1078) {
            double var6 = (double) (arg0 - this.field1043);
            double var8 = (double) (arg1 - this.field1063);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1059 = (double) this.field1077 * var8 / var10 + (double) this.field1063;
            this.field1054 = (double) this.field1044;
            this.field1041 = (double) this.field1077 * var6 / var10 + (double) this.field1043;
        }
        double var12 = (double) (this.field1070 - arg3 - arg4);
        this.field1053 = ((double) arg1 - this.field1059) / var12;
        this.field1049 = ((double) arg0 - this.field1041) / var12;
        this.field1047 = Math.sqrt(this.field1053 * this.field1053 + this.field1049 * this.field1049);
        if (this.field1067 == -1) {
            this.field1055 = ((double) arg2 - this.field1054) / var12;
        } else {
            if (!this.field1078) {
                this.field1055 = -this.field1047 * Math.tan((double) this.field1067 * 0.02454369D);
            }
            this.field1069 = ((double) arg2 - this.field1054 - this.field1055 * var12) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BLbl;)I")
    public static final int method452(byte arg0, class33 arg1) {
        int var2 = arg1.field513;
        if (arg0 != 88) {
            field1035 = null;
        }
        field1066++;
        class252 var3 = arg1.method1435(0);
        if (arg1.field3338 == var3.field3988) {
            var2 = arg1.field511;
        } else if (arg1.field3338 == var3.field4021 || arg1.field3338 == var3.field4016 || arg1.field3338 == var3.field3996 || arg1.field3338 == var3.field3998) {
            var2 = arg1.field504;
        } else if (arg1.field3338 == var3.field4001 || arg1.field3338 == var3.field4023 || arg1.field3338 == var3.field4000 || arg1.field3338 == var3.field3992) {
            var2 = arg1.field524;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIIIIJILlb;)V")
    public final void method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class130 arg10) {
        field1042++;
        class80 var13 = this.method453((byte) -112);
        if (var13 != null) {
            var13.method117(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1064);
            this.field1058 = var13.method119();
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)Loi;")
    private final class80 method453(byte arg0) {
        field1060++;
        class188 var2 = class277.method1862(this.field1068, 108);
        class80 var3 = var2.method1283(this.field1071, true, this.field1051, this.field1057);
        if (var3 == null) {
            return null;
        }
        var3.method565(this.field1045);
        if (arg0 > -18) {
            this.field1077 = 112;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)V")
    public static void method454(byte arg0) {
        field1035 = null;
        field1079 = null;
        if (arg0 > 103) {
            field1074 = null;
            field1076 = null;
            field1065 = null;
            field1072 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)Lf;")
    public static final class36 method455(int arg0, int arg1) {
        if (arg1 != 592427152) {
            method454((byte) -121);
        }
        field1036++;
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class136.field2250[var2] == null || class136.field2250[var2][var3] == null) {
            boolean var4 = class228.method1606(-1, var2);
            if (!var4) {
                return null;
            }
        }
        return class136.field2250[var2][var3];
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIII)V")
    public final void method116(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1050++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "()I")
    public final int method119() {
        field1062++;
        return this.field1058;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BI)I")
    public static final int method456(byte arg0, int arg1) {
        field1039++;
        int var2 = 23 / ((-arg0 - 56) / 62);
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(II)V")
    public final void method457(int arg0, int arg1) {
        this.field1078 = true;
        int var3 = -42 / ((-arg1 - 20) / 62);
        field1046++;
        this.field1059 += (double) arg0 * this.field1053;
        if (this.field1067 == -1) {
            this.field1054 += (double) arg0 * this.field1055;
        } else {
            this.field1054 += this.field1069 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1055;
            this.field1055 += (double) arg0 * this.field1069;
        }
        this.field1041 += (double) arg0 * this.field1049;
        this.field1052 = (int) (Math.atan2(this.field1049, this.field1053) * 325.949D) + 1024 & 0x7FF;
        this.field1045 = (int) (Math.atan2(this.field1055, this.field1047) * 325.949D) & 0x7FF;
        if (this.field1038 == null) {
            return;
        }
        this.field1057 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1038.field2836[this.field1051] >= this.field1057) {
                        return;
                    }
                    this.field1057 -= this.field1038.field2836[this.field1051];
                    this.field1051++;
                    if (this.field1038.field2848.length <= this.field1051) {
                        this.field1051 -= this.field1038.field2858;
                        if (this.field1051 < 0 || this.field1038.field2848.length <= this.field1051) {
                            this.field1051 = 0;
                        }
                    }
                    this.field1071 = this.field1051 + 1;
                } while (this.field1038.field2848.length > this.field1071);
                this.field1071 -= this.field1038.field2858;
            } while (this.field1071 >= 0 && this.field1038.field2848.length > this.field1071);
            this.field1071 = -1;
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class64(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1067 = arg7;
        this.field1056 = arg9;
        this.field1077 = arg8;
        this.field1040 = arg5;
        this.field1078 = false;
        this.field1063 = arg3;
        this.field1043 = arg2;
        this.field1044 = arg4;
        this.field1048 = arg10;
        this.field1075 = arg1;
        this.field1068 = arg0;
        this.field1070 = arg6;
        int var12 = class277.method1862(this.field1068, 44).field3050;
        if (var12 == -1) {
            this.field1038 = null;
        } else {
            this.field1038 = class49.method384(var12, -92);
        }
    }
}
