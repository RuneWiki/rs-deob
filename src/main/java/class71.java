import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class71 extends class184 {

    @OriginalMember(owner = "client!fg", name = "z", descriptor = "I")
    private int field1158 = -1;

    @OriginalMember(owner = "client!fg", name = "K", descriptor = "I")
    private int field1169 = -32768;

    @OriginalMember(owner = "client!fg", name = "S", descriptor = "I")
    private int field1176 = 0;

    @OriginalMember(owner = "client!fg", name = "L", descriptor = "Z")
    private boolean field1170 = false;

    @OriginalMember(owner = "client!fg", name = "t", descriptor = "I")
    private int field1152 = 0;

    @OriginalMember(owner = "client!fg", name = "B", descriptor = "I")
    private int field1160;

    @OriginalMember(owner = "client!fg", name = "T", descriptor = "I")
    public int field1177;

    @OriginalMember(owner = "client!fg", name = "D", descriptor = "I")
    private int field1162;

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
    private int field1148;

    @OriginalMember(owner = "client!fg", name = "F", descriptor = "I")
    public int field1164;

    @OriginalMember(owner = "client!fg", name = "Y", descriptor = "I")
    public int field1181;

    @OriginalMember(owner = "client!fg", name = "R", descriptor = "I")
    private int field1175;

    @OriginalMember(owner = "client!fg", name = "N", descriptor = "I")
    public int field1172;

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "I")
    private int field1147;

    @OriginalMember(owner = "client!fg", name = "Z", descriptor = "I")
    private int field1182;

    @OriginalMember(owner = "client!fg", name = "bb", descriptor = "I")
    public int field1184;

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "Lpb;")
    private class167 field1149;

    @OriginalMember(owner = "client!fg", name = "E", descriptor = "I")
    public static int field1163 = 0;

    @OriginalMember(owner = "client!fg", name = "H", descriptor = "I")
    public static int field1166 = 0;

    @OriginalMember(owner = "client!fg", name = "r", descriptor = "D")
    public double field1150;

    @OriginalMember(owner = "client!fg", name = "v", descriptor = "D")
    private double field1154;

    @OriginalMember(owner = "client!fg", name = "w", descriptor = "D")
    private double field1155;

    @OriginalMember(owner = "client!fg", name = "I", descriptor = "D")
    public double field1167;

    @OriginalMember(owner = "client!fg", name = "P", descriptor = "D")
    private double field1173;

    @OriginalMember(owner = "client!fg", name = "Q", descriptor = "D")
    public double field1174;

    @OriginalMember(owner = "client!fg", name = "X", descriptor = "D")
    private double field1180;

    @OriginalMember(owner = "client!fg", name = "ab", descriptor = "D")
    private double field1183;

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "I")
    public int field1146;

    @OriginalMember(owner = "client!fg", name = "s", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!fg", name = "x", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!fg", name = "y", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!fg", name = "A", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!fg", name = "C", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!fg", name = "G", descriptor = "I")
    private int field1165;

    @OriginalMember(owner = "client!fg", name = "J", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!fg", name = "M", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!fg", name = "U", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!fg", name = "W", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!fg", name = "u", descriptor = "Lgh;")
    private class32 field1153;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IB)V")
    public final void method429(int arg0, byte arg1) {
        this.field1150 += (double) arg0 * this.field1173;
        this.field1167 += (double) arg0 * this.field1154;
        this.field1170 = true;
        if (this.field1175 == -1) {
            this.field1174 += (double) arg0 * this.field1180;
        } else {
            this.field1174 += this.field1183 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1180;
            this.field1180 += (double) arg0 * this.field1183;
        }
        this.field1146 = (int) (Math.atan2(this.field1173, this.field1154) * 325.949D) + 1024 & 0x7FF;
        this.field1165 = (int) (Math.atan2(this.field1180, this.field1155) * 325.949D) & 0x7FF;
        if (this.field1149 != null) {
            this.field1152 += arg0;
            label45: while (true) {
                do {
                    do {
                        if (this.field1152 <= this.field1149.field2751[this.field1176]) {
                            break label45;
                        }
                        this.field1152 -= this.field1149.field2751[this.field1176];
                        this.field1176++;
                        if (this.field1149.field2736.length <= this.field1176) {
                            this.field1176 -= this.field1149.field2725;
                            if (this.field1176 < 0 || this.field1149.field2736.length <= this.field1176) {
                                this.field1176 = 0;
                            }
                        }
                        this.field1158 = this.field1176 + 1;
                    } while (this.field1158 < this.field1149.field2736.length);
                    this.field1158 -= this.field1149.field2725;
                } while (this.field1158 >= 0 && this.field1158 < this.field1149.field2736.length);
                this.field1158 = -1;
            }
        }
        if (arg1 >= 126) {
            field1178++;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "()I")
    public final int method110() {
        field1157++;
        return this.field1169;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIII)V")
    public final void method226(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1171++;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V")
    public static final void method430(int arg0) {
        if (arg0 != -1) {
            method430(-14);
        }
        class24.field382.method58(0);
        field1159++;
        class247.field4056.method58(0);
        class229.field3855.method58(0);
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(I)Lba;")
    private final class279 method431(int arg0) {
        class121 var2 = class189.method1243(65536, this.field1182);
        field1161++;
        class279 var3 = var2.method830(arg0 ^ 0x7AE7, this.field1158, this.field1176, this.field1152);
        if (var3 == null) {
            return null;
        }
        if (arg0 != 31462) {
            method430(-16);
        }
        var3.method128(this.field1165);
        return var3;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lvh;ILvh;)I")
    public static final int method432(class108 arg0, int arg1, class108 arg2) {
        field1156++;
        int var3 = 0;
        if (arg0.method727(class182.field2970, (byte) -114)) {
            var3++;
        }
        if (arg0.method727(class110.field1989, (byte) -124)) {
            var3++;
        }
        if (arg0.method727(class239.field3918, (byte) -123)) {
            var3++;
        }
        if (arg1 != 25353) {
            return -2;
        }
        if (arg2.method727(class182.field2970, (byte) -102)) {
            var3++;
        }
        if (arg2.method727(class110.field1989, (byte) -115)) {
            var3++;
        }
        if (arg2.method727(class239.field3918, (byte) -109)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(IIIII)V")
    public final void method433(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1168++;
        int var6 = 78 / ((arg3 + 84) / 32);
        if (!this.field1170) {
            double var7 = (double) (arg0 - this.field1160);
            double var9 = (double) (arg2 - this.field1148);
            double var11 = Math.sqrt(var7 * var7 + var9 * var9);
            this.field1174 = (double) this.field1147;
            this.field1150 = (double) this.field1162 * var9 / var11 + (double) this.field1148;
            this.field1167 = (double) this.field1162 * var7 / var11 + (double) this.field1160;
        }
        double var13 = (double) (this.field1181 + 1 - arg4);
        this.field1154 = ((double) arg0 - this.field1167) / var13;
        this.field1173 = ((double) arg2 - this.field1150) / var13;
        this.field1155 = Math.sqrt(this.field1173 * this.field1173 + this.field1154 * this.field1154);
        if (this.field1175 == -1) {
            this.field1180 = ((double) arg1 - this.field1174) / var13;
        } else {
            if (!this.field1170) {
                this.field1180 = -this.field1155 * Math.tan((double) this.field1175 * 0.02454369D);
            }
            this.field1183 = ((double) arg1 - this.field1174 - (this.field1180 * var13)) * 2.0D / (var13 * var13);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIIIIIJILgh;)V")
    public final void method120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class32 arg10) {
        class279 var13 = this.method431(31462);
        field1151++;
        if (var13 != null) {
            var13.method120(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1153);
            this.field1169 = var13.method110();
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILuk;)V")
    public static final void method434(int arg0, class198 arg1) {
        field1179++;
        class140.method983(false, arg1, 200000);
        if (arg0 != -10521) {
            field1163 = 88;
        }
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class71(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1160 = arg3;
        this.field1177 = arg5;
        this.field1170 = false;
        this.field1162 = arg8;
        this.field1148 = arg2;
        this.field1164 = arg9;
        this.field1181 = arg6;
        this.field1175 = arg7;
        this.field1172 = arg10;
        this.field1147 = arg4;
        this.field1182 = arg0;
        this.field1184 = arg1;
        int var12 = class189.method1243(65536, this.field1182).field2138;
        if (var12 == -1) {
            this.field1149 = null;
        } else {
            this.field1149 = class105.method714(var12, (byte) 12);
        }
    }
}
