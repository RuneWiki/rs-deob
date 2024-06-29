import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class303 {

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "[[I")
    private int[][] field5068;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
    private int field5070;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
    private int field5071;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public static int field5065 = -1;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "Lph;")
    public static class229 field5069 = class266.method1858("<img=0>", 0);

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    public static int field5072;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    public static int field5074;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    public static int field5075;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "J")
    public static long field5073;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "[I")
    public static int[] field5064;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "[Lcl;")
    public static class32[] field5060;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IB)I", line = 15)
    public final int method2042(int arg0, byte arg1) {
        if (arg1 != -66) {
            method2049(-14, -82);
        }
        field5075++;
        if (this.field5068 != null) {
            arg0 = (int) ((long) this.field5071 * (long) arg0 / (long) this.field5070) + 6;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILri;IIIBI)V", line = 29)
    public static final void method2043(int arg0, class301 arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field5066++;
        if (arg5 != -38) {
            method2046(12);
        }
        int var7 = arg6 * arg6 + (arg3 * arg3);
        if (var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg1.field4923 / 2, arg1.field4882 / 2);
        if (var7 <= (var8 * var8)) {
            class226.method1571(class314.field5342[arg2], (byte) -87, arg6, arg1, arg3, arg4, arg0);
            return;
        }
        var8 -= 10;
        int var9 = class249.field4134 + class147.field2379 & 0x7FF;
        int var10 = class310.field5199[var9];
        int var11 = var10 * 256 / (class260.field4341 + 256);
        int var12 = class310.field5197[var9];
        int var13 = var12 * 256 / (class260.field4341 + 256);
        int var14 = arg3 * var13 - (arg6 * var11) >> 16;
        int var15 = arg3 * var11 + (arg6 * var13) >> 16;
        double var16 = Math.atan2((double) var15, (double) var14);
        int var18 = (int) ((double) var8 * Math.sin(var16));
        int var19 = (int) (Math.cos(var16) * (double) var8);
        if (class99.field1675) {
            ((class87) class221.field3625[arg2]).method645(240, 240, (arg4 - (-(arg1.field4923 / 2) - var18)) * 16, (arg1.field4882 / 2 + arg0 - var19) * 16, (int) (var16 * 10430.378D), 4096);
        } else {
            ((class327) class221.field3625[arg2]).method1954(arg1.field4923 / 2 + arg4 + var18 - 10, arg1.field4882 / 2 + -var19 + arg0 - 10, 20, 20, 15, 15, var16, 256);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)I", line = 76)
    public final int method2044(int arg0, int arg1) {
        if (arg1 != 153068674) {
            method2047(-82, true, 32, 101, -117);
        }
        if (this.field5068 != null) {
            arg0 = (int) ((long) this.field5071 * (long) arg0 / (long) this.field5070);
        }
        field5061++;
        return arg0;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([BB)[B", line = 91)
    public final byte[] method2045(byte[] arg0, byte arg1) {
        if (this.field5068 != null) {
            int var3 = 0;
            int var4 = (int) ((long) arg0.length * (long) this.field5071 / (long) this.field5070) + 14;
            int[] var5 = new int[var4];
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                int[] var8 = this.field5068[var6];
                byte var9 = arg0[var7];
                for (int var10 = 0; var10 < 14; var10++) {
                    var5[var3 + var10] += var8[var10] * var9;
                }
                int var11 = this.field5071 + var6;
                int var12 = var11 / this.field5070;
                var3 += var12;
                var6 = var11 - this.field5070 * var12;
            }
            arg0 = new byte[var4];
            for (int var13 = 0; var13 < var4; var13++) {
                int var14 = var5[var13] + 32768 >> 16;
                if (var14 < -128) {
                    arg0[var13] = -128;
                } else if (var14 <= 127) {
                    arg0[var13] = (byte) var14;
                } else {
                    arg0[var13] = 127;
                }
            }
        }
        if (arg1 <= 73) {
            field5065 = 58;
        }
        field5063++;
        return arg0;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V", line = 171)
    public static final void method2046(int arg0) {
        field5067++;
        if (class12.field164 == arg0) {
            class12.field164 = 6;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZIII)V", line = 183)
    public static final void method2047(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field5062++;
        class285 var5 = (class285) class243.field4004.method713(3365, (long) arg3);
        if (var5 == null) {
            var5 = new class285();
            class243.field4004.method710(var5, (byte) 85, (long) arg3);
        }
        if (var5.field4696.length <= arg4) {
            int[] var6 = new int[arg4 + 1];
            int[] var7 = new int[arg4 + 1];
            for (int var8 = 0; var8 < var5.field4696.length; var8++) {
                var7[var8] = var5.field4696[var8];
                var6[var8] = var5.field4707[var8];
            }
            for (int var9 = var5.field4696.length; var9 < arg4; var9++) {
                var7[var9] = -1;
                var6[var9] = 0;
            }
            var5.field4696 = var7;
            var5.field4707 = var6;
        }
        if (!arg1) {
            method2049(-19, -44);
        }
        var5.field4696[arg4] = arg0;
        var5.field4707[arg4] = arg2;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V", line = 236)
    public static void method2048(int arg0) {
        field5069 = null;
        field5060 = null;
        field5064 = null;
        if (arg0 > -12) {
            method2046(111);
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(II)I", line = 248)
    public static final int method2049(int arg0, int arg1) {
        field5072++;
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        if (arg1 != 2539) {
            method2050(true);
        }
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(II)V", line = 274)
    public class303(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class234.method1661(arg1, arg0, 125);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field5068 = new int[var5][14];
            this.field5070 = var5;
            this.field5071 = var4;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field5068[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                double var10 = (double) var4 / (double) var5;
                int var12 = (int) Math.floor(var8 + 1.0D - 7.0D);
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                if (var12 < 0) {
                    var12 = 0;
                }
                while (var12 < var13) {
                    double var14 = var10;
                    double var16 = ((double) var12 - var8) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var10 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var12 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var12++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)V", line = 338)
    public static final void method2050(boolean arg0) {
        if (arg0) {
            field5060 = (class32[]) null;
        }
        class194.method1359((long) class319.field5393);
        if (class198.field3292 != -1) {
            class213.method1506(class198.field3292, (byte) 120);
        }
        field5074++;
        for (int var1 = 0; var1 < class15.field186; var1++) {
            if (class187.field3036[var1]) {
                class189.field3067[var1] = true;
            }
            class214.field3529[var1] = class187.field3036[var1];
            class187.field3036[var1] = false;
        }
        class257.field4299 = -1;
        if (class99.field1675) {
            class132.field2145 = true;
        }
        class185.field3008 = class319.field5393;
        class328.field5593 = null;
        class173.field2826 = -1;
        if (class198.field3292 != -1) {
            class15.field186 = 0;
            class184.method1298(0, class273.field4567, 0, 22, -1, class266.field4484, class198.field3292, 0, 0);
        }
        if (class99.field1675) {
            class212.method1498();
        } else {
            class210.method1466();
        }
        class69.field1106 = 0;
    }
}
