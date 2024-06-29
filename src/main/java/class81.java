import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class81 extends class407 {

    @OriginalMember(owner = "client!ia", name = "H", descriptor = "Z")
    private boolean field1111 = false;

    @OriginalMember(owner = "client!ia", name = "G", descriptor = "I")
    private int field1110 = 0;

    @OriginalMember(owner = "client!ia", name = "ab", descriptor = "I")
    private int field1130 = -32768;

    @OriginalMember(owner = "client!ia", name = "cb", descriptor = "I")
    private int field1132 = -1;

    @OriginalMember(owner = "client!ia", name = "T", descriptor = "I")
    private int field1123 = 0;

    @OriginalMember(owner = "client!ia", name = "ob", descriptor = "I")
    public int field1144;

    @OriginalMember(owner = "client!ia", name = "M", descriptor = "I")
    private int field1116;

    @OriginalMember(owner = "client!ia", name = "I", descriptor = "I")
    public int field1112;

    @OriginalMember(owner = "client!ia", name = "eb", descriptor = "I")
    public int field1134;

    @OriginalMember(owner = "client!ia", name = "mb", descriptor = "I")
    private int field1142;

    @OriginalMember(owner = "client!ia", name = "J", descriptor = "I")
    public int field1113;

    @OriginalMember(owner = "client!ia", name = "Z", descriptor = "I")
    private int field1129;

    @OriginalMember(owner = "client!ia", name = "Y", descriptor = "Lmd;")
    private class233 field1128;

    @OriginalMember(owner = "client!ia", name = "D", descriptor = "[[I")
    public static int[][] field1108 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!ia", name = "B", descriptor = "D")
    private double field1106;

    @OriginalMember(owner = "client!ia", name = "O", descriptor = "D")
    private double field1118;

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "D")
    private double field1121;

    @OriginalMember(owner = "client!ia", name = "S", descriptor = "D")
    private double field1122;

    @OriginalMember(owner = "client!ia", name = "U", descriptor = "D")
    private double field1124;

    @OriginalMember(owner = "client!ia", name = "db", descriptor = "D")
    private double field1133;

    @OriginalMember(owner = "client!ia", name = "gb", descriptor = "D")
    private double field1136;

    @OriginalMember(owner = "client!ia", name = "ib", descriptor = "D")
    private double field1138;

    @OriginalMember(owner = "client!ia", name = "C", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!ia", name = "K", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!ia", name = "L", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!ia", name = "P", descriptor = "I")
    private int field1119;

    @OriginalMember(owner = "client!ia", name = "Q", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!ia", name = "W", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!ia", name = "X", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!ia", name = "bb", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!ia", name = "fb", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!ia", name = "hb", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!ia", name = "jb", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!ia", name = "kb", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!ia", name = "lb", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!ia", name = "nb", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!ia", name = "pb", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!ia", name = "qb", descriptor = "I")
    private int field1146;

    @OriginalMember(owner = "client!ia", name = "N", descriptor = "Lir;")
    public static class185 field1117;

    @OriginalMember(owner = "client!ia", name = "V", descriptor = "Lnd;")
    private class411 field1125;

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
        this.field1111 = false;
        this.field1144 = arg9;
        this.field1116 = arg7;
        this.field1112 = arg10;
        this.field1134 = arg6;
        this.field1142 = arg8;
        this.field1113 = arg5;
        this.field1129 = arg0;
        int var12 = class263.method1762(this.field1129, false).field3271;
        if (~var12 == 0) {
            this.field1128 = null;
        } else {
            this.field1128 = class73.method597(var12, -1);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BLtj;)V")
    public final void method126(byte arg0, class298 arg1) {
        ++field1120;
        class257 var3 = this.method635(0, arg1, (byte) 0);
        if (var3 != null) {
            class118 var4 = arg1.method519();
            var4.method270(this.field1146);
            var4.method277(this.field1119);
            var4.method271((int) this.field1118, (int) this.field1121, (int) this.field1133);
            this.field1130 = var3.method1688();
            if (arg0 != 50) {
                this.field1136 = -0.7906721529347586D;
            }
            this.method631(arg1, (byte) -49, var3);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ltj;I)Lri;")
    public final class372 method118(class298 arg0, int arg1) {
        if (arg1 != 18630) {
            this.method635(-96, (class298) null, (byte) -59);
        }
        ++field1135;
        class257 var3 = this.method635(1024, arg0, (byte) 0);
        if (var3 == null) {
            return null;
        } else {
            class118 var4 = arg0.method519();
            var4.method270(this.field1146);
            var4.method277(this.field1119);
            var4.method271((int) this.field1118, (int) this.field1121, (int) this.field1133);
            if (this.field1125 == null) {
                var3.method1661(var4, (class137) null, 0);
            } else {
                class305 var5 = this.field1125.method2597();
                arg0.method453(var3, var5, var4, (class137) null, 0);
            }
            this.field1130 = var3.method1688();
            this.method631(arg0, (byte) -82, var3);
            return null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ltj;BLqb;)V")
    private final void method631(class298 arg0, byte arg1, class257 arg2) {
        ++field1109;
        class230[] var4 = arg2.method1656();
        class1[] var5 = arg2.method1694();
        if (arg1 > -23) {
            this.finalize();
        }
        if ((this.field1125 == null || this.field1125.field5959) && (var4 != null || var5 != null)) {
            this.field1125 = new class411(class231.field3179);
        }
        if (this.field1125 != null) {
            this.field1125.method2601(arg0, (long) class231.field3179, var4, var5, false);
            this.field1125.method2598(super.field5922, super.field5917, super.field5924, super.field5918, super.field5920);
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)Z")
    public final boolean method107(byte arg0) {
        ++field1131;
        if (arg0 <= 119) {
            this.method126((byte) 120, (class298) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZI)V")
    public final void method632(boolean arg0, int arg1) {
        this.field1133 += (double) arg1 * this.field1122;
        this.field1118 += (double) arg1 * this.field1136;
        this.field1111 = true;
        if (!arg0) {
            ++field1107;
            if (this.field1116 == -1) {
                this.field1121 += (double) arg1 * this.field1106;
            } else {
                this.field1121 += this.field1124 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field1106;
                this.field1106 += (double) arg1 * this.field1124;
            }
            this.field1119 = 16383 & 8192 + (int) (Math.atan2(this.field1136, this.field1122) * 2607.5945876176133D);
            this.field1146 = 16383 & (int) (2607.5945876176133D * Math.atan2(this.field1106, this.field1138));
            if (this.field1128 != null) {
                this.field1110 += arg1;
                while (true) {
                    do {
                        do {
                            if (this.field1110 <= this.field1128.field3248[this.field1123]) {
                                return;
                            }
                            this.field1110 -= this.field1128.field3248[this.field1123];
                            ++this.field1123;
                            if (this.field1128.field3242.length <= this.field1123) {
                                this.field1123 -= this.field1128.field3244;
                                if (this.field1123 < 0 || this.field1128.field3242.length <= this.field1123) {
                                    this.field1123 = 0;
                                }
                            }
                            this.field1132 = this.field1123 + 1;
                        } while (this.field1128.field3242.length > this.field1132);
                        this.field1132 -= this.field1128.field3244;
                    } while (this.field1132 >= 0 && this.field1128.field3242.length > this.field1132);
                    this.field1132 = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "(I)I")
    public final int method345(int arg0) {
        if (arg0 < 14) {
            this.field1116 = 106;
        }
        ++field1115;
        return this.field1130;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V")
    public static final void method633(boolean arg0) {
        ++field1137;
        if (~class395.field5738 == -6) {
            if (arg0) {
                method633(true);
            }
            class395.field5738 = 6;
        }
    }

    @OriginalMember(owner = "client!ia", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field1127;
        if (this.field1125 != null) {
            this.field1125.method2596();
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public static void method634(byte arg0) {
        field1117 = null;
        field1108 = null;
        if (arg0 <= 2) {
            field1117 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILtj;II)Z")
    public final boolean method120(int arg0, class298 arg1, int arg2, int arg3) {
        ++field1143;
        if (arg3 != 0) {
            field1117 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILtj;B)Lqb;")
    private final class257 method635(int arg0, class298 arg1, byte arg2) {
        ++field1141;
        if (arg2 != 0) {
            return null;
        } else {
            class235 var4 = class263.method1762(this.field1129, false);
            return var4.method1524(this.field1132, arg0, 20, arg1, this.field1110, this.field1123);
        }
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(B)V")
    public final void method636(byte arg0) {
        int var2 = 20 % ((-37 - arg0) / 35);
        ++field1114;
        super.field5917 = super.field5924 = (short) ((int) (this.field1118 / 128.0D));
        super.field5918 = super.field5920 = (short) ((int) (this.field1133 / 128.0D));
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILtj;BIZLkm;I)V")
    public final void method112(int arg0, class298 arg1, byte arg2, int arg3, boolean arg4, class402 arg5, int arg6) {
        int var8 = 86 % ((arg2 - 46) / 45);
        ++field1139;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(B)V")
    public final void method637(byte arg0) {
        if (this.field1125 != null) {
            this.field1125.method2596();
        }
        if (arg0 <= -14) {
            ++field1126;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIBI)V")
    public final void method638(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field1140;
        if (!this.field1111) {
            double var6 = (double) (-super.field5921 + arg2);
            double var8 = (double) (-super.field5930 + arg1);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1121 = (double) super.field5932;
            this.field1118 = (double) this.field1142 * var6 / var10 + (double) super.field5921;
            this.field1133 = (double) this.field1142 * var8 / var10 + (double) super.field5930;
        }
        double var12 = (double) (this.field1134 - -1 + -arg0);
        this.field1122 = ((double) arg1 - this.field1133) / var12;
        this.field1136 = ((double) arg2 + -this.field1118) / var12;
        if (arg3 < -40) {
            this.field1138 = Math.sqrt(this.field1136 * this.field1136 + this.field1122 * this.field1122);
            if (~this.field1116 == 0) {
                this.field1106 = ((double) arg4 - this.field1121) / var12;
            } else {
                if (!this.field1111) {
                    this.field1106 = -this.field1138 * Math.tan((double) this.field1116 * 0.02454369D);
                }
                this.field1124 = ((double) arg4 + -this.field1121 + -(this.field1106 * var12)) * 2.0D / (var12 * var12);
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)V")
    public final void method114(int arg0) {
        if (arg0 == 2) {
            ++field1145;
            throw new IllegalStateException();
        }
    }
}
