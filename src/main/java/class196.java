import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class196 extends class222 {

    @OriginalMember(owner = "client!ta", name = "D", descriptor = "I")
    private int field3053;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    private int field3042;

    @OriginalMember(owner = "client!ta", name = "C", descriptor = "I")
    private int field3052;

    @OriginalMember(owner = "client!ta", name = "A", descriptor = "I")
    private int field3050;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "Lna;")
    public static class26 field3036 = class69.method505("Zugewiesener Speicher)3", (byte) -123);

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "Lna;")
    private static class26 field3040 = class69.method505("Choose Option", (byte) -123);

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "Lna;")
    public static class26 field3046 = field3040;

    @OriginalMember(owner = "client!ta", name = "B", descriptor = "I")
    public static int field3051 = 0;

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "[I")
    public static int[] field3049 = new int[] { -1, 0, 8, 0, 2, 0, 0, 0, 0, 12, 0, 1, 0, 3, 7, 0, 15, 6, 0, 0, 4, 7, -2, -1, 2, 0, 2, 8, 0, 0, 0, 0, -2, 5, 0, 0, 8, 3, 6, 0, 0, 0, -1, 0, -1, 0, 0, 6, -2, 0, 12, 0, 0, 0, -1, -2, 10, 0, 0, 0, 3, 0, -1, 0, 0, 5, 6, 0, 0, 8, -1, -1, 0, 8, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 6, 2, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 5, 0, 0, -2, 0, 0, 0, 0, 0, 12, 2, 0, -2, -2, 20, 0, 0, 10, 0, 15, 0, -1, 0, 8, -2, 0, 0, 0, 8, 0, 12, 0, 0, 7, 0, 0, 0, 0, 0, -1, -1, 0, 4, 5, 0, 0, 0, 6, 0, 0, 0, 0, 8, 9, 0, 0, 0, 2, -1, 0, -2, 0, 4, 14, 0, 0, 0, 24, 0, -2, 5, 0, 0, 0, 10, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 2, 1, 0, 0, 2, -1, 1, 0, 0, 0, 0, 14, 0, 0, 0, 0, 10, 5, 0, 0, 0, 0, 0, -2, 0, 0, 9, 0, 0, 8, 0, 0, 0, 0, -2, 6, 0, 0, 0, -2, 0, 3, 0, 1, 7, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 3, 0, 0 };

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!ta", name = "y", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!ta", name = "E", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!ta", name = "F", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "[I")
    public static int[] field3038;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "[I")
    public static int[] field3039;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V", line = 6)
    public static final void method1315(int arg0) {
        for (int var1 = 0; var1 < class28.field474; var1++) {
            int var2 = class168.field2599[var1];
            class324 var3 = class185.field2877[var2];
            int var4 = class300.field5157.method642((byte) -122);
            if ((var4 & 0x8) != 0) {
                var4 += class300.field5157.method642((byte) -90) << 8;
            }
            if ((var4 & 0x40) != 0) {
                int var5 = class300.field5157.method642((byte) -57);
                int var6 = class300.field5157.method625(true);
                var3.method1660(var6, -8, class229.field3626, var5);
                var3.field3918 = class229.field3626 + 300;
                var3.field3912 = class300.field5157.method593(true);
            }
            if ((var4 & 0x2) != 0) {
                int var7 = class300.field5157.method625(true);
                int var8 = class300.field5157.method593(true);
                var3.method1660(var8, -8, class229.field3626, var7);
            }
            if ((var4 & 0x10) != 0) {
                int var9 = class300.field5157.method576(1);
                int var10 = class300.field5157.method642((byte) -83);
                if (var9 == 65535) {
                    var9 = -1;
                }
                class259.method1819(var10, var9, 39, var3);
            }
            if ((var4 & 0x4) != 0) {
                var3.field3909 = class300.field5157.method597(-117);
                if (var3.field3909 == 65535) {
                    var3.field3909 = -1;
                }
            }
            if ((var4 & 0x80) != 0) {
                int var11 = class300.field5157.method597(46);
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var12 = class300.field5157.method621(-46);
                boolean var13 = true;
                if (var11 != -1 && var3.field3986 != -1 && client.method1731(class236.method1582((byte) 42, var11).field5168, (byte) -20).field4060 < client.method1731(class236.method1582((byte) 42, var3.field3986).field5168, (byte) -20).field4060) {
                    var13 = false;
                }
                if (var13) {
                    var3.field3986 = var11;
                    var3.field3894 = (var12 & 0xFFFF) + class229.field3626;
                    var3.field3896 = 0;
                    var3.field3945 = 0;
                    var3.field3939 = var12 >> 16;
                    var3.field3969 = 1;
                    if (var3.field3894 > class229.field3626) {
                        var3.field3945 = -1;
                    }
                    if (var3.field3986 != -1 && class229.field3626 == var3.field3894) {
                        int var14 = class236.method1582((byte) 42, var3.field3986).field5168;
                        if (var14 != -1) {
                            class249 var15 = client.method1731(var14, (byte) -20);
                            if (var15 != null && var15.field4051 != null) {
                                class285.method2020(var3.field3972, var15, 183921384, var3.field3962, false, 0);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x1) != 0) {
                if (var3.field5565.method1276(-1)) {
                    class173.method1188(var3, false);
                }
                var3.method2251(-1, class96.method720(class300.field5157.method605(-84), 27112));
                var3.method1665(var3.field5565.field2894, 2);
                var3.field3900 = var3.field5565.field2938;
                if (var3.field5565.method1276(-1)) {
                    class267.method1903(var3.field3890[0], false, (class78) null, 0, var3, var3.field3904[0], class279.field4651, (class159) null);
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field3968 = class300.field5157.method615(true);
                var3.field3957 = 100;
            }
            if ((var4 & 0x100) != 0) {
                int var16 = class300.field5157.method625(true);
                int[] var17 = new int[var16];
                int[] var18 = new int[var16];
                int[] var19 = new int[var16];
                for (int var20 = 0; var20 < var16; var20++) {
                    int var21 = class300.field5157.method605(-101);
                    if (var21 == 65535) {
                        var21 = -1;
                    }
                    var17[var20] = var21;
                    var18[var20] = class300.field5157.method593(true);
                    var19[var20] = class300.field5157.method576(1);
                }
                class268.method1905(var19, (byte) 92, var3, var18, var17);
            }
            if ((var4 & 0x200) != 0) {
                var3.field3923 = class300.field5157.method597(-103);
                var3.field3898 = class300.field5157.method576(1);
            }
        }
        field3043++;
        int var22 = 44 % ((27 - arg0) / 39);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZI)V", line = 183)
    public final void method305(int arg0, boolean arg1, int arg2) {
        field3048++;
        int var4 = this.field3042 * arg2 >> 12;
        int var5 = this.field3050 * arg0 >> 12;
        int var6 = this.field3052 * arg2 >> 12;
        int var7 = this.field3053 * arg0 >> 12;
        if (arg1) {
            class21.method135(this.field3516, var6, var7, var4, var5, this.field3518, -2);
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)V", line = 209)
    public static void method1316(byte arg0) {
        field3039 = null;
        field3036 = null;
        field3040 = null;
        if (arg0 != 75) {
            method1316((byte) -116);
        }
        field3046 = null;
        field3049 = null;
        field3038 = null;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(IIIIIII)V", line = 224)
    public class196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3053 = arg1;
        this.field3042 = arg2;
        this.field3052 = arg0;
        this.field3050 = arg3;
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(III)V", line = 238)
    public final void method303(int arg0, int arg1, int arg2) {
        field3054++;
        int var4 = this.field3052 * arg1 >> 12;
        int var5 = this.field3042 * arg1 >> 12;
        int var6 = this.field3053 * arg2 >> 12;
        int var7 = this.field3050 * arg2 >> 12;
        class56.method407(var4, this.field3513, (byte) 121, var7, var5, var6);
        if (arg0 != 2) {
            field3040 = (class26) null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lve;III)Z", line = 258)
    public static final boolean method1317(class266 arg0, int arg1, int arg2, int arg3) {
        field3045++;
        byte[] var4 = arg0.method1889(arg2, (byte) -122, arg1);
        if (arg3 != -30901) {
            field3036 = (class26) null;
        }
        if (var4 == null) {
            return false;
        } else {
            class7.method45(var4, 98);
            return true;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)V", line = 292)
    public final void method307(int arg0, int arg1, int arg2) {
        if (arg2 != 4898) {
            return;
        }
        field3037++;
        int var4 = this.field3052 * arg1 >> 12;
        int var5 = this.field3053 * arg0 >> 12;
        int var6 = this.field3042 * arg1 >> 12;
        int var7 = this.field3050 * arg0 >> 12;
        class310.method2163(this.field3518, var7, this.field3513, this.field3516, var5, 4096, var6, var4);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZIII)V", line = 311)
    public static final void method1318(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field3055++;
        if (class71.method509(arg3, 104)) {
            class170.method1173(arg2, arg1, arg4, 235, arg0, class86.field1416[arg3]);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([Lmm;ILve;)V", line = 323)
    public static final void method1319(class256[] arg0, int arg1, class266 arg2) {
        field3041++;
        class74.field1135 = arg2;
        class86.field1422 = arg0;
        if (arg1 != -11931) {
            return;
        }
        class146.field2228 = new boolean[class86.field1422.length];
        class287.field4796.method253(-68);
        int var3 = class74.field1135.method1876(class294.field4902, (byte) -30);
        int[] var4 = class74.field1135.method1897((byte) -128, var3);
        for (int var5 = 0; var5 < var4.length; var5++) {
            class287.field4796.method257(true, class220.method1481(new class82(class74.field1135.method1889(var3, (byte) -122, var4[var5])), true));
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIZII)V", line = 351)
    public static final void method1320(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field3044++;
        if (arg4 >= class80.field1259 && arg4 <= class117.field1840) {
            int var5 = class308.method2151(class27.field454, arg0, (byte) 0, class225.field3572);
            int var6 = class308.method2151(class27.field454, arg3, (byte) 0, class225.field3572);
            class110.method778(arg1, arg4, var6, (byte) -123, var5);
        }
        if (!arg2) {
            field3040 = (class26) null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V", line = 374)
    public static final void method1321(boolean arg0) {
        class186.field2893.method368(-124);
        field3047++;
        for (int var1 = 0; var1 < 32; var1++) {
            class205.field3202[var1] = 0L;
        }
        if (arg0) {
            for (int var2 = 0; var2 < 32; var2++) {
                class287.field4807[var2] = 0L;
            }
            class37.field615 = 0;
        }
    }
}
