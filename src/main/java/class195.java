import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class195 extends class98 {

    @OriginalMember(owner = "client!qg", name = "ic", descriptor = "I")
    public int field2913 = -1;

    @OriginalMember(owner = "client!qg", name = "rc", descriptor = "I")
    public int field2922 = -1;

    @OriginalMember(owner = "client!qg", name = "pc", descriptor = "I")
    public int field2920 = 0;

    @OriginalMember(owner = "client!qg", name = "mc", descriptor = "I")
    public int field2917 = -1;

    @OriginalMember(owner = "client!qg", name = "E", descriptor = "I")
    public int field2911 = 0;

    @OriginalMember(owner = "client!qg", name = "uc", descriptor = "I")
    public int field2925 = 0;

    @OriginalMember(owner = "client!qg", name = "yc", descriptor = "I")
    public int field2929 = -1;

    @OriginalMember(owner = "client!qg", name = "oc", descriptor = "I")
    private int field2919 = 0;

    @OriginalMember(owner = "client!qg", name = "Ac", descriptor = "I")
    public int field2931 = -1;

    @OriginalMember(owner = "client!qg", name = "wc", descriptor = "I")
    public int field2927 = 0;

    @OriginalMember(owner = "client!qg", name = "vc", descriptor = "I")
    public int field2926 = 0;

    @OriginalMember(owner = "client!qg", name = "Lc", descriptor = "Z")
    public boolean field2942 = false;

    @OriginalMember(owner = "client!qg", name = "Ec", descriptor = "I")
    public int field2935 = -1;

    @OriginalMember(owner = "client!qg", name = "Jc", descriptor = "I")
    public int field2940 = -1;

    @OriginalMember(owner = "client!qg", name = "sc", descriptor = "[I")
    public static int[] field2923 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!qg", name = "Kc", descriptor = "Lkj;")
    public static class245 field2941 = new class245();

    @OriginalMember(owner = "client!qg", name = "Mc", descriptor = "I")
    public static int field2943 = -1;

    @OriginalMember(owner = "client!qg", name = "Oc", descriptor = "I")
    public static int field2945 = 0;

    @OriginalMember(owner = "client!qg", name = "jc", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!qg", name = "kc", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!qg", name = "lc", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!qg", name = "nc", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!qg", name = "qc", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!qg", name = "tc", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!qg", name = "xc", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!qg", name = "zc", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!qg", name = "Bc", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!qg", name = "Cc", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!qg", name = "Fc", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!qg", name = "Gc", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!qg", name = "Hc", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!qg", name = "Ic", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!qg", name = "Nc", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!qg", name = "hc", descriptor = "Lid;")
    public class255 field2912;

    @OriginalMember(owner = "client!qg", name = "Dc", descriptor = "Ljava/lang/String;")
    public String field2934;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "(I)Z", line = 5)
    public final boolean method455(int arg0) {
        field2938++;
        if (this.field2912 == null) {
            return false;
        } else if (arg0 <= 115) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)I", line = 20)
    public final int method460(int arg0) {
        if (arg0 != -32299) {
            this.field2929 = 57;
        }
        field2915++;
        return this.field1546;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZI)V", line = 44)
    public static final void method1342(boolean arg0, int arg1) {
        if (!arg0) {
            field2923 = (int[]) null;
        }
        class265.field4064.method2174(-12634, arg1);
        field2933++;
        class73.field951.method2174(-12634, arg1);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIBIILnj;IIILbh;II)V", line = 59)
    private final void method1343(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, class100 arg8, int arg9, int arg10, int arg11, class18 arg12, int arg13, int arg14) {
        if (arg5 != 4) {
            this.method455(-91);
        }
        int var16 = arg6 * arg6 + arg10 * arg10;
        field2939++;
        if (var16 < 16 || var16 > 360000) {
            return;
        }
        int var17 = (int) (Math.atan2((double) arg6, (double) arg10) * 325.949D) & 0x7FF;
        class100 var18 = class240.method1630(var17, arg4, arg8, this.field1505, this.field1566, (byte) 76, this.field1497);
        if (var18 == null) {
            return;
        }
        if (!class117.field1817) {
            var18.method111(0, arg14, arg2, arg3, arg9, arg1, arg11, arg13, -1L, arg0, arg12);
            return;
        }
        float var19 = class117.method820();
        float var20 = class117.method824();
        class117.method831();
        class117.method828(var19, var20 - 150.0F);
        var18.method111(0, arg14, arg2, arg3, arg9, arg1, arg11, arg13, -1L, arg0, arg12);
        class117.method829();
        class117.method828(var19, var20);
    }

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "(I)Ljava/lang/String;", line = 100)
    public final String method1344(int arg0) {
        if (arg0 != -1) {
            this.field2929 = 39;
        }
        String var2 = this.field2934;
        field2914++;
        if (class40.field491 != null) {
            var2 = class40.field491[this.field2919] + var2;
        }
        if (class147.field2211 != null) {
            var2 = var2 + class147.field2211[this.field2919];
        }
        return var2;
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(B)I", line = 144)
    public final int method696(byte arg0) {
        field2937++;
        if (this.field2912 == null || this.field2912.field3873 == -1) {
            if (arg0 != 117) {
                this.method108(-67, -32, -83, 71, -31);
            }
            return super.method696((byte) 117);
        } else {
            return class235.method1615(this.field2912.field3873, 1128).field759;
        }
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(B)V", line = 169)
    public static void method1345(byte arg0) {
        field2923 = null;
        int var1 = 2 / ((-arg0 - 46) / 54);
        field2941 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BLre;)V", line = 192)
    public final void method1346(byte arg0, class263 arg1) {
        field2930++;
        arg1.field4025 = 0;
        int var3 = arg1.method1787(false);
        int var4 = var3 & 0x1;
        int var5 = -1;
        int[] var6 = new int[12];
        int var7 = super.method696((byte) 117);
        boolean var8 = (var3 & 0x4) != 0;
        this.method698((var3 >> 3 & 0x7) + 1, (byte) -76);
        this.field2919 = (var3 & 0xD1) >> 6;
        this.field1566 += (this.method696((byte) 117) - var7) * 64;
        this.field1505 += (this.method696((byte) 117) - var7) * 64;
        this.field2929 = arg1.method1810((byte) 101);
        this.field2935 = arg1.method1810((byte) 115);
        this.field2926 = 0;
        for (int var9 = 0; var9 < 12; var9++) {
            int var10 = arg1.method1787(false);
            if (var10 == 0) {
                var6[var9] = 0;
            } else {
                int var11 = arg1.method1787(false);
                int var12 = (var10 << 8) + var11;
                if (var9 == 0 && var12 == 65535) {
                    var5 = arg1.method1830((byte) -77);
                    this.field2926 = arg1.method1787(false);
                    break;
                }
                if (var12 >= 32768) {
                    int var13 = class28.field380[var12 - 32768];
                    var6[var9] = class140.method1009(1073741824, var13);
                    int var14 = class325.method2219(var13, -9379).field3848;
                    if (var14 != 0) {
                        this.field2926 = var14;
                    }
                } else {
                    var6[var9] = class140.method1009(var12 - 256, Integer.MIN_VALUE);
                }
            }
        }
        int[] var15 = new int[5];
        for (int var16 = 0; var16 < 5; var16++) {
            int var17 = arg1.method1787(false);
            if (var17 < 0 || var17 >= class110.field1706[var16].length) {
                var17 = 0;
            }
            var15[var16] = var17;
        }
        if (arg0 < 37) {
            field2923 = (int[]) null;
        }
        this.field1546 = arg1.method1830((byte) -77);
        long var18 = arg1.method1797(-1023818720);
        this.field2934 = class194.method1337(var18, 1);
        this.field2927 = arg1.method1787(false);
        if (var8) {
            this.field2925 = arg1.method1830((byte) -77);
            this.field2911 = this.field2927;
            this.field2922 = -1;
        } else {
            this.field2925 = 0;
            this.field2911 = arg1.method1787(false);
            this.field2922 = arg1.method1787(false);
            if (this.field2922 == 255) {
                this.field2922 = -1;
            }
        }
        int var20 = this.field2920;
        this.field2920 = arg1.method1787(false);
        if (this.field2920 == 0) {
            class49.method337(this, true);
        } else {
            int var21 = this.field2917;
            int var22 = this.field2940;
            int var23 = this.field2931;
            int var24 = this.field2913;
            this.field2917 = arg1.method1830((byte) -77);
            this.field2913 = arg1.method1830((byte) -77);
            this.field2940 = arg1.method1830((byte) -77);
            this.field2931 = arg1.method1830((byte) -77);
            if (this.field2920 != var20 || this.field2917 != var21 || this.field2913 != var24 || this.field2940 != var22 || this.field2931 != var23) {
                class178.method1233(this, true);
            }
        }
        if (this.field2912 == null) {
            this.field2912 = new class255();
        }
        int var25 = this.field2912.field3873;
        this.field2912.method1735(this.field1546, var5, var15, -1842912672, var6, var4 == 1);
        if (var5 != var25) {
            this.field1566 = this.field1541[0] * 128 + (this.method696((byte) 117) * 64);
            this.field1505 = this.field1516[0] * 128 + (this.method696((byte) 117) * 64);
        }
        if (this.field1472 != null) {
            this.field1472.method120();
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IBLlm;I)Lle;", line = 344)
    public static final class127 method1347(int arg0, byte arg1, class210 arg2, int arg3) {
        field2928++;
        if (class249.method1680(arg0, arg2, arg3, (byte) 76)) {
            if (arg1 > -121) {
                method1345((byte) -45);
            }
            return class228.method1580((byte) -56);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIBZ)V", line = 362)
    public final void method1348(int arg0, int arg1, byte arg2, boolean arg3) {
        if (arg2 != 109) {
            this.method455(47);
        }
        super.method701(arg3, arg1, this.method696((byte) 117), 21611, arg0);
        field2932++;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "()I", line = 375)
    public final int method115() {
        field2921++;
        return this.field1522;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIII)V", line = 383)
    public final void method108(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2916++;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIIIIJILbh;)V", line = 400)
    public final void method111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class18 arg10) {
        field2936++;
        if (this.field2912 == null) {
            return;
        }
        class272 var13 = this.field1549 != -1 && this.field1538 == 0 ? class72.method468(this.field1549, -120) : null;
        class272 var14 = this.field1507 == -1 || this.field2942 || this.field1507 == this.method699(0).field3597 && var13 != null ? null : class72.method468(this.field1507, -118);
        class100 var15 = this.field2912.method1727(true, this.field1500, this.field1485, var14, 449856673, this.field1496, var13, this.field1486, this.field1555, this.field1480, this.field1487);
        int var16 = class113.method779(4096);
        if (class117.field1817 && class84.field1251 < 96 && var16 > 50) {
            class265.method1861(125);
        }
        if (class21.field259 != 0 && var16 < 50) {
            int var17 = 50 - var16;
            while (var17 > class265.field4059) {
                class268.field4111[class265.field4059] = new byte[102400];
                class265.field4059++;
            }
            while (var17 < class265.field4059) {
                class265.field4059--;
                class268.field4111[class265.field4059] = null;
            }
        }
        if (var15 == null) {
            return;
        }
        this.field1522 = var15.method115();
        if (class130.field2019 && (this.field2912.field3873 == -1 || class235.method1615(this.field2912.field3873, 1128).field737)) {
            class100 var18 = class115.method790(160, 0, this.field1497, 1, arg0, this.field1505, (byte) 119, 0, this.field1566, 240, var15, var14 == null ? var13 : var14, var14 == null ? this.field1486 : this.field1555, this.field1510);
            if (class117.field1817) {
                float var19 = class117.method820();
                float var20 = class117.method824();
                class117.method831();
                class117.method828(var19, var20 - 150.0F);
                var18.method111(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class18) null);
                class117.method829();
                class117.method828(var19, var20);
            } else {
                var18.method111(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class18) null);
            }
        }
        if (class114.field1750 == this) {
            for (int var21 = class294.field4497.length - 1; var21 >= 0; var21--) {
                class323 var22 = class294.field4497[var21];
                if (var22 != null && var22.field4875 != -1) {
                    if (var22.field4869 == 1 && var22.field4871 >= 0 && class187.field2788.length > var22.field4871) {
                        class69 var23 = class187.field2788[var22.field4871];
                        if (var23 != null) {
                            int var24 = var23.field1566 / 32 - class114.field1750.field1566 / 32;
                            int var25 = var23.field1505 / 32 - (class114.field1750.field1505 / 32);
                            this.method1343(arg9, arg5, arg2, arg3, var22.field4875, (byte) 4, var24, arg0, var15, arg4, var25, arg6, (class18) null, arg7, arg1);
                        }
                    }
                    if (var22.field4869 == 2) {
                        int var26 = (var22.field4872 - class217.field3309) * 4 + 2 - (class114.field1750.field1566 / 32);
                        int var27 = (var22.field4881 - class189.field2807) * 4 + 2 - (class114.field1750.field1505 / 32);
                        this.method1343(arg9, arg5, arg2, arg3, var22.field4875, (byte) 4, var26, arg0, var15, arg4, var27, arg6, (class18) null, arg7, arg1);
                    }
                    if (var22.field4869 == 10 && var22.field4871 >= 0 && class241.field3592.length > var22.field4871) {
                        class195 var28 = class241.field3592[var22.field4871];
                        if (var28 != null) {
                            int var29 = var28.field1566 / 32 - class114.field1750.field1566 / 32;
                            int var30 = var28.field1505 / 32 - (class114.field1750.field1505 / 32);
                            this.method1343(arg9, arg5, arg2, arg3, var22.field4875, (byte) 4, var29, arg0, var15, arg4, var30, arg6, (class18) null, arg7, arg1);
                        }
                    }
                }
            }
        }
        this.method695(-1, var15);
        this.method702(arg0, var15, 41);
        class100 var31 = null;
        if (!this.field2942 && this.field1490 != -1 && this.field1563 != -1) {
            class48 var32 = class8.method31(this.field1490, (byte) -126);
            var31 = var32.method331(this.field1529, true, this.field1563, this.field1550);
            if (var31 != null) {
                var31.method508(0, -this.field1561, 0);
                if (var32.field601) {
                    if (class84.field1246 != 0) {
                        var31.method489(class84.field1246);
                    }
                    if (class309.field4694 != 0) {
                        var31.method503(class309.field4694);
                    }
                    if (field2945 != 0) {
                        var31.method508(0, field2945, 0);
                    }
                }
            }
        }
        class100 var33 = null;
        if (!this.field2942 && this.field1517 != null) {
            if (class304.field4641 >= this.field1528) {
                this.field1517 = null;
            }
            if (this.field1542 <= class304.field4641 && class304.field4641 < this.field1528) {
                if ((this.field1517 instanceof class17)) {
                    var33 = (class100) ((class17) this.field1517).method114(-93);
                } else {
                    var33 = (class100) this.field1517;
                }
                var33.method508(this.field1524 - this.field1566, this.field1512 - this.field1497, this.field1476 - this.field1505);
                if (this.field1474 == 512) {
                    var33.method504();
                } else if (this.field1474 == 1024) {
                    var33.method516();
                } else if (this.field1474 == 1536) {
                    var33.method496();
                }
            }
        }
        if (class117.field1817) {
            var15.field1592 = true;
            var15.method111(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1472);
            if (var31 != null) {
                var31.field1592 = true;
                var31.method111(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1472);
            }
        } else {
            if (var31 != null) {
                var15 = ((class77) var15).method523(var31);
            }
            if (var33 != null) {
                var15 = ((class77) var15).method523(var33);
            }
            var15.field1592 = true;
            var15.method111(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1472);
        }
        if (var33 == null) {
            return;
        }
        if (this.field1474 == 512) {
            var33.method496();
        } else if (this.field1474 == 1024) {
            var33.method516();
        } else if (this.field1474 == 1536) {
            var33.method504();
        }
        var33.method508(this.field1566 - this.field1524, -this.field1512 + this.field1497, this.field1505 - this.field1476);
    }

    @OriginalMember(owner = "client!qg", name = "finalize", descriptor = "()V", line = 652)
    protected final void finalize() {
        field2924++;
    }
}
