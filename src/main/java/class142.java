import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class142 extends class456 {

    @OriginalMember(owner = "client!fe", name = "H", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!fe", name = "I", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!fe", name = "J", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!fe", name = "K", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!fe", name = "L", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!fe", name = "N", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!fe", name = "O", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!fe", name = "P", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!fe", name = "Q", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!fe", name = "M", descriptor = "[Lrm;")
    private class73[] field2029;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ltq;I)V", line = 11)
    public static final void method977(class63 arg0, int arg1) {
        ++field2031;
        int var2 = class432.field6144;
        int var3 = class99.field1414;
        int var4 = class330.field4935;
        int var5 = class450.field6355;
        int var6 = -10660793;
        arg0.method530(var5, var6, var3, (byte) 108, var2, var4);
        arg0.method530(16, -16777216, var3 + 1, (byte) 108, var2 + 1, var4 + -2);
        arg0.method584((byte) 125, var4 + -2, var5 - 19, var2 + 1, -16777216, var3 - -18);
        class462.field6513.method1497(-1, class473.field6624.method2036(class4.field85, (byte) -21), var2 + 3, (byte) -67, var6, var3 + 14);
        int var7 = class78.field1105.method1975(77);
        int var8 = class78.field1105.method1984((byte) -87);
        int var9 = 0;
        if (arg1 < 107) {
            method978(34, -91);
        }
        for (class146 var10 = (class146) class451.field6377.method2456(32101); var10 != null; var10 = (class146) class451.field6377.method2461(301)) {
            int var11 = (-var9 + -1 + class186.field2817) * 16 + 31 + var3;
            short var12 = -1;
            if (var7 > var2 && var2 + var4 > var7 && var11 + -13 < var8 && var11 + 3 > var8 && var10.field2059) {
                var12 = -256;
            }
            int[] var13 = null;
            if (!class9.method104(var10.field2056, 0)) {
                if (~var10.field2057 == 0) {
                    if (class120.method851((byte) -111, var10.field2056)) {
                        class349 var14 = class18.field241[(int) var10.field2066];
                        if (var14 != null) {
                            class273 var15 = var14.field5309;
                            if (var15.field4107 != null) {
                                var15 = var15.method1781(class315.field4736, true);
                            }
                            if (var15 != null) {
                                var13 = var15.field4142;
                            }
                        }
                    } else if (class450.method2656(1008, var10.field2056)) {
                        Object var16 = null;
                        class271 var17;
                        if (var10.field2056 != 1008) {
                            var17 = class206.field3124.method338((byte) 103, (int) (2147483647L & var10.field2066 >>> 32));
                        } else {
                            var17 = class206.field3124.method338((byte) 122, (int) var10.field2066);
                        }
                        if (var17.field4015 != null) {
                            var17 = var17.method1759(class315.field4736, true);
                        }
                        if (var17 != null) {
                            var13 = var17.field4029;
                        }
                    }
                } else {
                    var13 = class23.field309.method2364((byte) 118, var10.field2057).field2795;
                }
            } else {
                var13 = class23.field309.method2364((byte) 118, (int) var10.field2066).field2795;
            }
            String var18 = class340.method2087(false, var10);
            if (var13 != null) {
                var18 = var18 + class220.method1450(-1, var13);
            }
            class462.field6513.method1504(var18, 0, var2 + 3, var11, -126, var12, class288.field4395, class163.field2265);
            ++var9;
            if (var10.field2060) {
                class45.field636.method1958(var2 + 5 + class131.field1828.method3(var18, (byte) 92), var11 + -12);
            }
        }
        class237.method1541(class432.field6144, class450.field6355, class330.field4935, 0, class99.field1414);
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(II)I", line = 115)
    public static final int method978(int arg0, int arg1) {
        ++field2024;
        if (class27.field335 != null) {
            class27.field335.method998((byte) -13);
            class27.field335 = null;
        }
        ++class237.field3464;
        if (class237.field3464 > 4) {
            class237.field3464 = 0;
            class140.field2006 = 0;
            return arg1;
        } else {
            if (~class84.field1192 != ~class461.field6509) {
                class461.field6509 = class84.field1192;
            } else {
                class461.field6509 = class82.field1158;
            }
            class140.field2006 = arg0;
            return -1;
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V", line = 147)
    public class142() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IBLre;)V", line = 150)
    public final void method210(int arg0, byte arg1, class446 arg2) {
        if (arg1 != 55) {
            this.field2029 = null;
        }
        if (arg0 != 0) {
            if (arg0 == 1) {
                super.field6486 = arg2.method2628(49152) == 1;
            }
        } else {
            this.field2029 = new class73[arg2.method2628(49152)];
            for (int var4 = 0; this.field2029.length > var4; ++var4) {
                int var5 = arg2.method2628(49152);
                if (~var5 != -1) {
                    if (var5 != 1) {
                        if (var5 != 2) {
                            if (~var5 == -4) {
                                this.field2029[var4] = class88.method697(arg2, (byte) -61);
                            }
                        } else {
                            this.field2029[var4] = class447.method2645(arg2, (byte) -18);
                        }
                    } else {
                        this.field2029[var4] = class28.method242(arg2, 112);
                    }
                } else {
                    this.field2029[var4] = class324.method2001(arg2, arg1 + 43);
                }
            }
        }
        ++field2032;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IILje;I)V", line = 225)
    public static final void method979(int arg0, int arg1, class178 arg2, int arg3) {
        class199.field3008 = arg0;
        class184.field2802 = arg3;
        if (arg1 == -1) {
            class157.field2192 = arg2;
            ++field2028;
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)[I", line = 239)
    public final int[] method33(int arg0, int arg1) {
        ++field2025;
        int[] var3 = super.field6466.method2533(true, arg1);
        if (super.field6466.field6153) {
            this.method980((byte) 99, super.field6466.method2531(-9443));
        }
        return arg0 != -1 ? null : var3;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)[[I", line = 263)
    public final int[][] method212(int arg0, int arg1) {
        ++field2027;
        int[][] var3 = super.field6468.method1090(-2, arg1);
        if (super.field6468.field2227) {
            int var4 = class156.field2169;
            int var5 = class487.field6842;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field6468.method1091(arg0 ^ 6);
            this.method980((byte) 126, var6);
            for (int var8 = 0; ~class487.field6842 < ~var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; class156.field2169 > var14; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class412.method2463(var15, 255) << 4;
                    var12[var14] = class412.method2463(4080, var15 >> 4);
                    var11[var14] = class412.method2463(16711680, var15) >> 12;
                }
            }
        }
        if (arg0 != 0) {
            method979(72, 1, (class178) null, 67);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B[[I)V", line = 326)
    private final void method980(byte arg0, int[][] arg1) {
        ++field2033;
        int var3 = class156.field2169;
        int var4 = class487.field6842;
        if (arg0 >= 31) {
            class327.method2007(true, arg1);
            class483.method2824(-107, class428.field6112, 0, 0, class493.field6947);
            if (this.field2029 != null) {
                for (int var5 = 0; var5 < this.field2029.length; ++var5) {
                    class73 var6 = this.field2029[var5];
                    int var7 = var6.field985;
                    int var8 = var6.field988;
                    if (~var7 <= -1) {
                        if (~var8 > -1) {
                            var6.method630((byte) 118, var4, var3);
                        } else {
                            var6.method632(5263, var3, var4);
                        }
                    } else if (~var8 <= -1) {
                        var6.method627(-16, var3, var4);
                    }
                }
            }
        }
    }
}
