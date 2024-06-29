import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class246 extends class171 {

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "I")
    private int field4135 = 0;

    @OriginalMember(owner = "client!sc", name = "S", descriptor = "I")
    private int field4162 = 0;

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "I")
    private int field4149 = -32768;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "Z")
    private boolean field4138 = false;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    public int field4133;

    @OriginalMember(owner = "client!sc", name = "O", descriptor = "I")
    public int field4158;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    private int field4130;

    @OriginalMember(owner = "client!sc", name = "bb", descriptor = "I")
    private int field4171;

    @OriginalMember(owner = "client!sc", name = "ab", descriptor = "I")
    public int field4170;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "I")
    private int field4137;

    @OriginalMember(owner = "client!sc", name = "X", descriptor = "I")
    public int field4167;

    @OriginalMember(owner = "client!sc", name = "L", descriptor = "I")
    private int field4155;

    @OriginalMember(owner = "client!sc", name = "W", descriptor = "I")
    private int field4166;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
    private int field4131;

    @OriginalMember(owner = "client!sc", name = "N", descriptor = "I")
    public int field4157;

    @OriginalMember(owner = "client!sc", name = "G", descriptor = "Lhj;")
    private class28 field4151;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "Z")
    public static boolean field4140 = true;

    @OriginalMember(owner = "client!sc", name = "Q", descriptor = "I")
    public static int field4160 = 1;

    @OriginalMember(owner = "client!sc", name = "K", descriptor = "Lwa;")
    public static class75 field4154 = class66.method560("Suche nach Updates )2 ", false);

    @OriginalMember(owner = "client!sc", name = "U", descriptor = "Lwa;")
    public static class75 field4164 = class66.method560(")4", false);

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "D")
    public double field4132;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "D")
    public double field4134;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "D")
    private double field4136;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "D")
    private double field4142;

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "D")
    private double field4144;

    @OriginalMember(owner = "client!sc", name = "C", descriptor = "D")
    private double field4147;

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "D")
    public double field4148;

    @OriginalMember(owner = "client!sc", name = "F", descriptor = "D")
    private double field4150;

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!sc", name = "B", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!sc", name = "H", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!sc", name = "P", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!sc", name = "R", descriptor = "I")
    public int field4161;

    @OriginalMember(owner = "client!sc", name = "T", descriptor = "I")
    private int field4163;

    @OriginalMember(owner = "client!sc", name = "V", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!sc", name = "Z", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!sc", name = "Y", descriptor = "[Lqj;")
    public static class238[] field4168;

    @OriginalMember(owner = "client!sc", name = "M", descriptor = "[Lbh;")
    public static class258[] field4156;

    @OriginalMember(owner = "client!sc", name = "J", descriptor = "[Lje;")
    public static class68[] field4153;

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 335)
    public class246(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field4133 = arg10;
        this.field4158 = arg9;
        this.field4130 = arg3;
        this.field4171 = arg0;
        this.field4170 = arg1;
        this.field4137 = arg2;
        this.field4167 = arg5;
        this.field4155 = arg8;
        this.field4138 = false;
        this.field4166 = arg7;
        this.field4131 = arg4;
        this.field4157 = arg6;
        int var12 = class65.method556(this.field4171, -108).field4550;
        if (var12 == -1) {
            this.field4151 = null;
        } else {
            this.field4151 = class302.method2082(var12, 35);
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(III)Leg;", line = 16)
    public static final class285 method1774(int arg0, int arg1, int arg2) {
        class242 var3 = class271.field4681[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field4086; var4++) {
            class285 var5 = var3.field4083[var4];
            if ((var5.field4914 >> 29 & 0x3L) == 2L && var5.field4907 == arg1 && var5.field4895 == arg2) {
                class130.method1019(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)Lcc;", line = 43)
    private final class234 method1775(int arg0) {
        class263 var2 = class65.method556(this.field4171, arg0 - 76);
        if (arg0 != 0) {
            return (class234) null;
        }
        field4146++;
        class234 var3 = var2.method1881(this.field4135, (byte) -56);
        if (var3 == null) {
            return null;
        } else {
            var3.method407(this.field4163);
            return var3;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIIIILpj;IZJ)Z", line = 61)
    public static final boolean method1776(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class171 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class53.field879 == class156.field2669;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class150.field2573 || var16 >= class262.field4440) {
                    return false;
                }
                class242 var17 = class271.field4681[arg0][var15][var16];
                if (var17 != null && var17.field4086 >= 5) {
                    return false;
                }
            }
        }
        class285 var18 = new class285();
        var18.field4914 = arg11;
        var18.field4904 = arg0;
        var18.field4908 = arg5;
        var18.field4899 = arg6;
        var18.field4900 = arg7;
        var18.field4898 = arg8;
        var18.field4893 = arg9;
        var18.field4907 = arg1;
        var18.field4895 = arg2;
        var18.field4911 = arg1 + arg3 - 1;
        var18.field4896 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class271.field4681[var22][var19][var20] == null) {
                        class271.field4681[var22][var19][var20] = new class242(var22, var19, var20);
                    }
                }
                class242 var23 = class271.field4681[arg0][var19][var20];
                var23.field4083[var23.field4086] = var18;
                var23.field4099[var23.field4086] = var21;
                var23.field4097 |= var21;
                var23.field4086++;
                if (var13 && class259.field4342[var19][var20] != 0) {
                    var14 = class259.field4342[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class259.field4342[var24][var25] == 0) {
                        class259.field4342[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class203.field3435[class85.field1400++] = var18;
        }
        return true;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIII)V", line = 184)
    public final void method1777(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field4138) {
            double var6 = (double) (arg1 - this.field4137);
            double var8 = (double) (arg3 - this.field4130);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field4134 = (double) this.field4155 * var8 / var10 + (double) this.field4130;
            this.field4132 = (double) this.field4155 * var6 / var10 + (double) this.field4137;
            this.field4148 = (double) this.field4131;
        }
        field4165++;
        double var12 = (double) (this.field4157 + arg0 - arg2);
        this.field4150 = ((double) arg1 - this.field4132) / var12;
        this.field4136 = ((double) arg3 - this.field4134) / var12;
        this.field4142 = Math.sqrt(this.field4150 * this.field4150 + this.field4136 * this.field4136);
        if (!this.field4138) {
            this.field4147 = -this.field4142 * Math.tan((double) this.field4166 * 0.02454369D);
        }
        this.field4144 = ((double) arg4 - this.field4148 - (this.field4147 * var12)) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V", line = 213)
    public static final void method1778(int arg0) {
        field4145++;
        if (class64.field1112 != null) {
            class64.field1112.method1476(false);
        }
        if (class176.field2965 != null) {
            class176.field2965.method1476(false);
        }
        class279.method1989(class151.field2599, 2, 0, 22050);
        if (arg0 > -87) {
            field4154 = (class75) null;
        }
        class64.field1112 = class89.method705(27095, class210.field3585, 0, 22050, class237.field3991);
        class64.field1112.method1486(-25077, class89.field1465);
        class176.field2965 = class89.method705(27095, class210.field3585, 1, 2048, class237.field3991);
        class176.field2965.method1486(-25077, class94.field1527);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)I", line = 247)
    public static final int method1779(int arg0, int arg1) {
        if (arg1 == 1552403112) {
            field4139++;
            return arg0 >>> 8;
        } else {
            return 47;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "()I", line = 264)
    public final int method443() {
        field4169++;
        return this.field4149;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIIIIJ)V", line = 272)
    public final void method409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field4159++;
        class234 var11 = this.method1775(0);
        if (var11 != null) {
            var11.method409(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field4149 = var11.method443();
        }
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)V", line = 320)
    public static void method1780(int arg0) {
        field4156 = null;
        field4154 = null;
        field4168 = null;
        if (arg0 != -32768) {
            field4164 = (class75) null;
        }
        field4153 = null;
        field4164 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)V", line = 362)
    public final void method1781(byte arg0, int arg1) {
        this.field4138 = true;
        this.field4134 += (double) arg1 * this.field4136;
        field4143++;
        this.field4132 += (double) arg1 * this.field4150;
        this.field4148 += this.field4144 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field4147;
        if (arg0 >= -107) {
            return;
        }
        this.field4147 += (double) arg1 * this.field4144;
        this.field4161 = (int) (Math.atan2(this.field4150, this.field4136) * 325.949D) + 1024 & 0x7FF;
        this.field4163 = (int) (Math.atan2(this.field4147, this.field4142) * 325.949D) & 0x7FF;
        if (this.field4151 == null) {
            return;
        }
        this.field4162 += arg1;
        while (true) {
            do {
                do {
                    if (this.field4162 <= this.field4151.field361[this.field4135]) {
                        return;
                    }
                    this.field4162 -= this.field4151.field361[this.field4135];
                    this.field4135++;
                } while (this.field4135 < this.field4151.field368.length);
                this.field4135 -= this.field4151.field384;
            } while (this.field4135 >= 0 && this.field4135 < this.field4151.field368.length);
            this.field4135 = 0;
        }
    }
}
