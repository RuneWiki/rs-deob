import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class301 implements class294 {

    @OriginalMember(owner = "client!or", name = "d", descriptor = "Lbu;")
    private class407 field4823 = new class407(128);

    @OriginalMember(owner = "client!or", name = "c", descriptor = "[I")
    public int[] field4822 = new int[class338.field5296.field6345];

    @OriginalMember(owner = "client!or", name = "j", descriptor = "[I")
    private int[] field4829 = new int[class338.field5296.field6345];

    @OriginalMember(owner = "client!or", name = "n", descriptor = "[I")
    public static int[] field4833 = new int[14];

    @OriginalMember(owner = "client!or", name = "a", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!or", name = "b", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!or", name = "e", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!or", name = "f", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!or", name = "g", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!or", name = "h", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!or", name = "i", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!or", name = "k", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!or", name = "l", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!or", name = "m", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!or", name = "o", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V", line = 6)
    public static final void method1923(byte arg0) {
        field4831++;
        if (class164.field2603 != null) {
            return;
        }
        class164.field2603 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        if (arg0 != -70) {
            field4833 = null;
        }
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) (var3 >> 10 & 0x3F) / 64.0D + 0.0078125D;
            double var6 = (double) ((var3 & 0x3D7) >> 7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if ((var8 < 0.5D)) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - (var6 * var8);
                }
                double var18 = var8 * 2.0D - var16;
                double var20 = var4 + 0.3333333333333333D;
                if (var20 > 1.0D) {
                    var20--;
                }
                double var24 = var4 - 0.3333333333333333D;
                if (var24 < 0.0D) {
                    var24++;
                }
                if ((var4 * 6.0D < 1.0D)) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if ((var4 * 2.0D < 1.0D)) {
                    var12 = var16;
                } else if (var4 * 3.0D < 2.0D) {
                    var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if (var20 * 6.0D < 1.0D) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if (var20 * 2.0D < 1.0D) {
                    var10 = var16;
                } else if (var20 * 3.0D < 2.0D) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if ((var24 * 6.0D < 1.0D)) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if ((var24 * 2.0D < 1.0D)) {
                    var14 = var16;
                } else if ((var24 * 3.0D < 2.0D)) {
                    var14 = (0.6666666666666666D - var24) * (var16 - var18) * 6.0D + var18;
                } else {
                    var14 = var18;
                }
            }
            double var26 = Math.pow(var10, var1);
            double var28 = Math.pow(var12, var1);
            double var30 = Math.pow(var14, var1);
            int var32 = (int) (var26 * 256.0D);
            int var33 = (int) (var28 * 256.0D);
            int var34 = (int) (var30 * 256.0D);
            int var35 = (var33 << 8) + ((var32 << 16) + var34);
            class164.field2603[var3] = var35;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IB)I", line = 126)
    public final int method1886(int arg0, byte arg1) {
        field4820++;
        class376 var3 = class189.field2953.method2903(arg0, (byte) 62);
        if (arg1 > -95) {
            return -87;
        }
        int var4 = var3.field5860;
        int var5 = var3.field5859;
        int var6 = var3.field5858;
        int var7 = class123.field2153[var6 - var5];
        return this.field4822[var4] >> var5 & var7;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(II)I", line = 147)
    public final int method1887(int arg0, int arg1) {
        if (arg0 == -1719) {
            field4834++;
            return this.field4822[arg1];
        } else {
            return -5;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IBI)V", line = 158)
    public final void method1924(int arg0, byte arg1, int arg2) {
        field4826++;
        class376 var4 = class189.field2953.method2903(arg2, (byte) 76);
        int var5 = var4.field5860;
        int var6 = var4.field5859;
        if (arg1 != 22) {
            this.field4822 = null;
        }
        int var7 = var4.field5858;
        int var8 = class123.field2153[var7 - var6];
        if (arg0 < 0 || var8 < arg0) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method1931((byte) 87, ~var9 & this.field4822[var5] | arg0 << var6 & var9, var5);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(BII)I", line = 188)
    public static final int method1925(byte arg0, int arg1, int arg2) {
        field4830++;
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (arg0 != 33) {
            return 50;
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(IBI)V", line = 208)
    public final void method1926(int arg0, byte arg1, int arg2) {
        field4825++;
        class376 var4 = class189.field2953.method2903(arg0, (byte) 105);
        int var5 = var4.field5860;
        int var6 = var4.field5859;
        int var7 = var4.field5858;
        int var8 = class123.field2153[var7 - var6];
        if (arg2 < 0 || var8 < arg2) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method1930(var5, ~var9 & this.field4829[var5] | var9 & arg2 << var6, (byte) 104);
        if (arg1 != 89) {
            this.field4823 = null;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ZI)I", line = 238)
    public final int method1927(boolean arg0, int arg1) {
        if (arg1 != 0) {
            this.method1886(-33, (byte) 51);
        }
        field4824++;
        long var3 = class19.method91((byte) 78);
        for (class207 var5 = arg0 ? (class207) this.field4823.method2518(98) : (class207) this.field4823.method2524(0); var5 != null; var5 = (class207) this.field4823.method2524(0)) {
            if (var3 > (var5.field3269 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var5.field3269 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field4542;
                    this.field4822[var6] = this.field4829[var6];
                    var5.method1821((byte) 13);
                    return var6;
                }
                var5.method1821((byte) -76);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V", line = 277)
    public static void method1928(int arg0) {
        if (arg0 == -22407) {
            field4833 = null;
        }
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(B)V", line = 288)
    public final void method1929(byte arg0) {
        field4821++;
        for (int var2 = 0; var2 < class338.field5296.field6345; var2++) {
            class299 var3 = class338.field5296.method2580(var2, -16);
            if (var3 != null && var3.field4801 == 0) {
                this.field4829[var2] = 0;
                this.field4822[var2] = 0;
            }
        }
        this.field4823 = new class407(128);
        if (arg0 >= -33) {
            this.field4829 = null;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IIB)V", line = 322)
    public final void method1930(int arg0, int arg1, byte arg2) {
        this.field4829[arg0] = arg1;
        field4827++;
        class207 var4 = (class207) this.field4823.method2516((long) arg0, -1);
        if (arg2 != 104) {
            return;
        }
        if (var4 == null) {
            class207 var5 = new class207(4611686018427387905L);
            this.field4823.method2517(var5, (long) arg0, (byte) -112);
        } else if (var4.field3269 != 4611686018427387905L) {
            var4.field3269 = class19.method91((byte) 114) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(BII)V", line = 358)
    public final void method1931(byte arg0, int arg1, int arg2) {
        this.field4822[arg2] = arg1;
        if (arg0 != 87) {
            this.method1929((byte) 115);
        }
        field4832++;
        class207 var4 = (class207) this.field4823.method2516((long) arg2, arg0 - 88);
        if (var4 == null) {
            class207 var5 = new class207(class19.method91((byte) 97) + 500L);
            this.field4823.method2517(var5, (long) arg2, (byte) -107);
        } else {
            var4.field3269 = class19.method91((byte) 123) + 500L;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 385)
    public static final void method1932(String arg0, int arg1) {
        field4828++;
        if (!class508.field7386) {
            return;
        }
        boolean var2 = false;
        int var3 = class151.field2425;
        int[] var4 = class45.field734;
        for (int var5 = 0; var5 < var3; var5++) {
            class166 var6 = class435.field6489[var4[var5]];
            if (var6 != null && class302.field4850 != var6 && var6.field2652 != null && var6.field2652.equalsIgnoreCase(arg0)) {
                class265.method1775(-2, class14.field162);
                class130.field2228++;
                class261.field4357.method122(30393, class345.field5413);
                class261.field4357.method178(var4[var5], (byte) -110);
                class261.field4357.method178(class75.field1309, (byte) -77);
                class261.field4357.method178(class421.field6365, (byte) 104);
                class261.field4357.method130(0, -78);
                class452.method2703(0, -2, var6.field3159[0], var6.field3158[0], 0, (byte) -126, true, var6.method1143(0), var6.method1143(0));
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class467.method2774(class462.field6874.method1954(class300.field4813, -30366) + arg0, (byte) 100);
        }
        if (class508.field7386) {
            class467.method2772(false);
        }
        if (arg1 > -96) {
            field4833 = null;
        }
    }
}
