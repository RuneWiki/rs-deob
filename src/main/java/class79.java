import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class79 extends class233 {

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
    private int field1090 = 0;

    @OriginalMember(owner = "client!oe", name = "v", descriptor = "Z")
    private boolean field1098 = false;

    @OriginalMember(owner = "client!oe", name = "R", descriptor = "I")
    private int field1118 = -32768;

    @OriginalMember(owner = "client!oe", name = "I", descriptor = "I")
    private int field1110 = 0;

    @OriginalMember(owner = "client!oe", name = "U", descriptor = "I")
    private int field1121 = -1;

    @OriginalMember(owner = "client!oe", name = "V", descriptor = "I")
    private int field1122;

    @OriginalMember(owner = "client!oe", name = "L", descriptor = "I")
    public int field1112;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public int field1088;

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "I")
    public int field1097;

    @OriginalMember(owner = "client!oe", name = "X", descriptor = "I")
    public int field1124;

    @OriginalMember(owner = "client!oe", name = "E", descriptor = "I")
    private int field1106;

    @OriginalMember(owner = "client!oe", name = "x", descriptor = "I")
    private int field1100;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    private int field1089;

    @OriginalMember(owner = "client!oe", name = "w", descriptor = "I")
    private int field1099;

    @OriginalMember(owner = "client!oe", name = "J", descriptor = "I")
    public int field1111;

    @OriginalMember(owner = "client!oe", name = "A", descriptor = "I")
    private int field1103;

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "Lof;")
    private class272 field1095;

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "Ljava/lang/String;")
    public static String field1102 = "Loaded textures";

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1087 = "Checking for updates - ";

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "D")
    private double field1092;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "D")
    public double field1094;

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "D")
    private double field1096;

    @OriginalMember(owner = "client!oe", name = "F", descriptor = "D")
    private double field1107;

    @OriginalMember(owner = "client!oe", name = "G", descriptor = "D")
    public double field1108;

    @OriginalMember(owner = "client!oe", name = "H", descriptor = "D")
    private double field1109;

    @OriginalMember(owner = "client!oe", name = "P", descriptor = "D")
    public double field1116;

    @OriginalMember(owner = "client!oe", name = "Q", descriptor = "D")
    private double field1117;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "I")
    public int field1093;

    @OriginalMember(owner = "client!oe", name = "y", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!oe", name = "B", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!oe", name = "C", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!oe", name = "M", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!oe", name = "N", descriptor = "I")
    private int field1114;

    @OriginalMember(owner = "client!oe", name = "O", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!oe", name = "S", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!oe", name = "W", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!oe", name = "Y", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!oe", name = "T", descriptor = "Lbh;")
    private class18 field1120;

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 322)
    public class79(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1122 = arg7;
        this.field1112 = arg10;
        this.field1088 = arg1;
        this.field1097 = arg5;
        this.field1098 = false;
        this.field1124 = arg6;
        this.field1106 = arg2;
        this.field1100 = arg0;
        this.field1089 = arg4;
        this.field1099 = arg8;
        this.field1111 = arg9;
        this.field1103 = arg3;
        int var12 = class8.method31(this.field1100, (byte) -126).field615;
        if (var12 == -1) {
            this.field1095 = null;
        } else {
            this.field1095 = class72.method468(var12, -118);
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)V", line = 11)
    public static void method530(byte arg0) {
        if (arg0 < 81) {
            method535(66, -23, (String) null);
        }
        field1102 = null;
        field1087 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V", line = 30)
    public static final void method531(int arg0) {
        class295.field4520 = new class192(arg0);
        field1113++;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIBI)V", line = 50)
    public final void method532(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (!this.field1098) {
            double var6 = (double) (arg1 - this.field1103);
            double var8 = (double) (arg2 - this.field1106);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1094 = (double) this.field1089;
            this.field1108 = (double) this.field1099 * var6 / var10 + (double) this.field1103;
            this.field1116 = (double) this.field1099 * var8 / var10 + (double) this.field1106;
        }
        field1115++;
        double var12 = (double) (this.field1124 + 1 - arg0);
        this.field1092 = ((double) arg2 - this.field1116) / var12;
        if (arg3 > -91) {
            return;
        }
        this.field1109 = ((double) arg1 - this.field1108) / var12;
        this.field1096 = Math.sqrt(this.field1109 * this.field1109 + this.field1092 * this.field1092);
        if (this.field1122 == -1) {
            this.field1117 = ((double) arg4 - this.field1094) / var12;
        } else {
            if (!this.field1098) {
                this.field1117 = -this.field1096 * Math.tan((double) this.field1122 * 0.02454369D);
            }
            this.field1107 = ((double) arg4 - this.field1094 - (this.field1117 * var12)) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIII)V", line = 94)
    public final void method108(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1123++;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIIIIIJILbh;)V", line = 101)
    public final void method111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class18 arg10) {
        field1104++;
        class100 var13 = this.method534(0);
        if (var13 != null) {
            var13.method111(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1120);
            this.field1118 = var13.method115();
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)V", line = 125)
    public final void method533(int arg0, byte arg1) {
        this.field1108 += (double) arg0 * this.field1109;
        this.field1116 += (double) arg0 * this.field1092;
        if (this.field1122 == -1) {
            this.field1094 += (double) arg0 * this.field1117;
        } else {
            this.field1094 += this.field1107 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1117;
            this.field1117 += (double) arg0 * this.field1107;
        }
        this.field1098 = true;
        this.field1093 = (int) (Math.atan2(this.field1092, this.field1109) * 325.949D) + 1024 & 0x7FF;
        int var3 = -42 / ((66 - arg1) / 58);
        this.field1114 = (int) (Math.atan2(this.field1117, this.field1096) * 325.949D) & 0x7FF;
        field1119++;
        if (this.field1095 == null) {
            return;
        }
        this.field1090 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1095.field4184[this.field1110] >= this.field1090) {
                        return;
                    }
                    this.field1090 -= this.field1095.field4184[this.field1110];
                    this.field1110++;
                    if (this.field1095.field4160.length <= this.field1110) {
                        this.field1110 -= this.field1095.field4166;
                        if (this.field1110 < 0 || this.field1110 >= this.field1095.field4160.length) {
                            this.field1110 = 0;
                        }
                    }
                    this.field1121 = this.field1110 + 1;
                } while (this.field1121 < this.field1095.field4160.length);
                this.field1121 -= this.field1095.field4166;
            } while (this.field1121 >= 0 && this.field1121 < this.field1095.field4160.length);
            this.field1121 = -1;
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)Lnj;", line = 184)
    private final class100 method534(int arg0) {
        field1105++;
        if (arg0 != 0) {
            this.field1090 = -102;
        }
        class48 var2 = class8.method31(this.field1100, (byte) -126);
        class100 var3 = var2.method331(this.field1090, true, this.field1110, this.field1121);
        if (var3 == null) {
            return null;
        } else {
            var3.method489(this.field1114);
            return var3;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IILjava/lang/String;)V", line = 207)
    public static final void method535(int arg0, int arg1, String arg2) {
        field1125++;
        boolean var3 = false;
        String var4 = class246.method1658(class72.method466(arg2, false), arg0 + 18242);
        if (arg0 != -18370) {
            return;
        }
        for (int var5 = 0; var5 < class56.field706; var5++) {
            class195 var6 = class241.field3592[class20.field239[var5]];
            if (var6 != null && var6.field2934 != null && var6.field2934.equalsIgnoreCase(var4)) {
                var3 = true;
                class55.method366(false, class114.field1750.field1541[0], 1, 2, 0, class114.field1750.field1516[0], var6.field1541[0], 1, var6.field1516[0], 0, 0, false);
                if (arg1 == 1) {
                    class234.field3507.method28(128, false);
                    class285.field4304++;
                    class234.field3507.method1823(class20.field239[var5], (byte) -99);
                } else if (arg1 == 4) {
                    class315.field4759++;
                    class234.field3507.method28(250, false);
                    class234.field3507.method1823(class20.field239[var5], (byte) -93);
                } else if (arg1 == 5) {
                    class234.field3507.method28(153, false);
                    class234.field3507.method1823(class20.field239[var5], (byte) -43);
                    class186.field2776++;
                } else if (arg1 == 6) {
                    class234.field3507.method28(49, false);
                    class301.field4600++;
                    class234.field3507.method1837(28160, class20.field239[var5]);
                } else if (arg1 == 7) {
                    class234.field3507.method28(178, false);
                    class234.field3507.method1817(true, class20.field239[var5]);
                    class19.field229++;
                }
                break;
            }
        }
        if (!var3) {
            class92.method656(0, class292.field4459 + var4, "", -1);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Llm;B)Z", line = 280)
    public static final boolean method536(class210 arg0, byte arg1) {
        if (arg1 > -57) {
            field1102 = (String) null;
        }
        field1091++;
        return arg0.method1431(class316.field4774, -91);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "()I", line = 314)
    public final int method115() {
        field1101++;
        return this.field1118;
    }
}
