import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class302 extends class255 {

    @OriginalMember(owner = "client!pl", name = "y", descriptor = "Lpm;")
    private class99 field5083 = null;

    @OriginalMember(owner = "client!pl", name = "s", descriptor = "I")
    private int field5077 = -1;

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "I")
    private int field5076 = -32768;

    @OriginalMember(owner = "client!pl", name = "K", descriptor = "Z")
    private boolean field5093 = true;

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "I")
    private int field5074 = -1;

    @OriginalMember(owner = "client!pl", name = "P", descriptor = "I")
    private int field5098 = 0;

    @OriginalMember(owner = "client!pl", name = "Q", descriptor = "I")
    private int field5099 = 0;

    @OriginalMember(owner = "client!pl", name = "I", descriptor = "I")
    private int field5091 = 0;

    @OriginalMember(owner = "client!pl", name = "u", descriptor = "I")
    private int field5079;

    @OriginalMember(owner = "client!pl", name = "D", descriptor = "I")
    private int field5087;

    @OriginalMember(owner = "client!pl", name = "R", descriptor = "I")
    private int field5100;

    @OriginalMember(owner = "client!pl", name = "U", descriptor = "I")
    private int field5102;

    @OriginalMember(owner = "client!pl", name = "v", descriptor = "I")
    private int field5080;

    @OriginalMember(owner = "client!pl", name = "S", descriptor = "I")
    private int field5101;

    @OriginalMember(owner = "client!pl", name = "t", descriptor = "Leg;")
    private class142 field5078;

    @OriginalMember(owner = "client!pl", name = "E", descriptor = "I")
    private int field5088;

    @OriginalMember(owner = "client!pl", name = "F", descriptor = "I")
    private int field5089;

    @OriginalMember(owner = "client!pl", name = "L", descriptor = "Lbd;")
    public static class162 field5094 = class17.method142(0, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!pl", name = "M", descriptor = "I")
    public static int field5095 = -1;

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "Z")
    public static boolean field5073 = false;

    @OriginalMember(owner = "client!pl", name = "w", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!pl", name = "x", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!pl", name = "z", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!pl", name = "A", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!pl", name = "C", descriptor = "I")
    public static int field5086;

    @OriginalMember(owner = "client!pl", name = "G", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!pl", name = "J", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!pl", name = "N", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!pl", name = "O", descriptor = "I")
    public static int field5097;

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "[[[B")
    public static byte[][][] field5075;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BII)V", line = 10)
    private final void method2056(byte arg0, int arg1, int arg2) {
        if (this.field5078 != null) {
            int var4 = class90.field1598 - this.field5089;
            if (var4 > 100 && this.field5078.field2530 > 0) {
                int var5 = this.field5078.field2522.length - this.field5078.field2530;
                while (this.field5088 < var5 && this.field5078.field2527[this.field5088] < var4) {
                    var4 -= this.field5078.field2527[this.field5088];
                    this.field5088++;
                }
                if (this.field5088 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field5078.field2522.length; var7++) {
                        var6 += this.field5078.field2527[var7];
                    }
                    var4 %= var6;
                }
            }
            label62: {
                do {
                    do {
                        if (var4 <= this.field5078.field2527[this.field5088]) {
                            break label62;
                        }
                        class229.method1638(false, this.field5078, this.field5088, arg2, -648569400, arg1);
                        var4 -= this.field5078.field2527[this.field5088];
                        this.field5088++;
                    } while (this.field5088 < this.field5078.field2522.length);
                    this.field5088 -= this.field5078.field2530;
                } while (this.field5088 >= 0 && this.field5088 < this.field5078.field2522.length);
                this.field5078 = null;
            }
            this.field5089 = class90.field1598 - var4;
        }
        field5090++;
        if (arg0 != 56) {
            this.method1763(24, 119, 74, (byte) 89, -8);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "()I", line = 78)
    public final int method46() {
        field5082++;
        return this.field5076;
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(IIIIIIIZLrk;)V", line = 469)
    public class302(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class255 arg8) {
        this.field5079 = arg4;
        this.field5087 = arg3;
        this.field5100 = arg0;
        this.field5102 = arg2;
        this.field5080 = arg1;
        this.field5101 = arg5;
        if (class117.field2159 && arg8 != null) {
            if (arg8 instanceof class302) {
                ((class302) arg8).method2061((byte) 108);
            } else {
                class311 var10 = class229.method1637(this.field5100, (byte) 93);
                if (var10.field5191 != null) {
                    var10 = var10.method2105((byte) -127);
                }
                if (var10 != null) {
                    class109.method883(var10, this.field5079, 0, this.field5101, this.field5102, this.field5087, this.field5080, 104, 0);
                }
            }
        }
        if (arg6 != -1) {
            this.field5078 = class139.method1084(-107, arg6);
            this.field5088 = 0;
            this.field5089 = class90.field1598 - 1;
            if (this.field5078.field2517 == 0 && arg8 != null && arg8 instanceof class302) {
                class302 var11 = (class302) arg8;
                if (this.field5078 == var11.field5078) {
                    this.field5088 = var11.field5088;
                    this.field5089 = var11.field5089;
                    return;
                }
            }
            if (arg7 && this.field5078.field2530 != -1) {
                this.field5088 = (int) (Math.random() * (double) this.field5078.field2522.length);
                this.field5089 -= (int) (Math.random() * (double) this.field5078.field2527[this.field5088]);
            }
        }
        if (class117.field2159 && arg8 != null) {
            this.method2060(-20703, true);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V", line = 95)
    public static void method2057(int arg0) {
        if (arg0 > 43) {
            field5094 = null;
            field5075 = (byte[][][]) null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)Lrk;", line = 117)
    private final class255 method2058(int arg0) {
        if (arg0 != -20894) {
            field5094 = (class162) null;
        }
        field5096++;
        return this.method2060(-20703, false);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIIIIIJ)V", line = 135)
    public final void method49(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field5084++;
        class255 var11 = this.method2058(-20894);
        if (var11 != null) {
            var11.method49(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field5076 = var11.method46();
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(B)V", line = 152)
    public static final void method2059(byte arg0) {
        field5097++;
        if (!class32.field539) {
            if (class29.field491 != 0) {
                class233.field3876 = class185.field3197;
                class43.field718 = class297.field4980;
            } else if (class238.field3954 == 0) {
                class233.field3876 = class109.field1961;
                class43.field718 = class274.field4554;
            } else {
                class43.field718 = class183.field3158;
                class233.field3876 = class153.field2721;
            }
            class293.field4931 = 1;
            class105.field1911[0] = 1006;
            class1.field9[0] = class35.field566;
            class31.field516[0] = class244.field4053;
        }
        if (class265.field4412 != -1) {
            class116.method922(class265.field4412, (byte) -63);
        }
        for (int var1 = 0; var1 < class258.field4293; var1++) {
            if (class73.field1159[var1]) {
                class252.field4211[var1] = true;
            }
            class243.field4044[var1] = class73.field1159[var1];
            class73.field1159[var1] = false;
        }
        class223.field3724 = -1;
        class19.field308 = -1;
        class216.field3606 = null;
        if (class117.field2159) {
            class253.field4216 = true;
        }
        class178.field3045 = class90.field1598;
        if (arg0 > -81) {
            method2059((byte) 116);
        }
        if (class265.field4412 != -1) {
            class258.field4293 = 0;
            class54.method383(class252.field4205, 0, class251.field4201, -3419, class265.field4412, -1, 0, 0, 0);
        }
        if (class117.field2159) {
            class16.method122();
        } else {
            class316.method2155();
        }
        class156.method1219(103);
        if (class32.field539) {
            class291.method2018((byte) 23);
        } else if (class19.field308 != -1) {
            class262.method1806(class223.field3724, class19.field308, false);
        }
        if (class240.field3982 == 3) {
            for (int var2 = 0; var2 < class258.field4293; var2++) {
                if (class243.field4044[var2]) {
                    if (class117.field2159) {
                        class16.method135(class111.field2015[var2], class230.field3834[var2], class214.field3593[var2], class283.field4799[var2], 16711935, 128);
                    } else {
                        class316.method2157(class111.field2015[var2], class230.field3834[var2], class214.field3593[var2], class283.field4799[var2], 16711935, 128);
                    }
                } else if (class252.field4211[var2]) {
                    if (class117.field2159) {
                        class16.method135(class111.field2015[var2], class230.field3834[var2], class214.field3593[var2], class283.field4799[var2], 16711680, 128);
                    } else {
                        class316.method2157(class111.field2015[var2], class230.field3834[var2], class214.field3593[var2], class283.field4799[var2], 16711680, 128);
                    }
                }
            }
        }
        class167.method1304(class149.field2680, class122.field2215.field5013, class122.field2215.field5047, 3, class157.field2765);
        class149.field2680 = 0;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IZ)Lrk;", line = 277)
    private final class255 method2060(int arg0, boolean arg1) {
        field5092++;
        boolean var3 = class73.field1166 != class206.field3473;
        class311 var4 = class229.method1637(this.field5100, (byte) 93);
        if (var4.field5191 != null) {
            var4 = var4.method2105((byte) -119);
        }
        if (var4 == null) {
            if (class117.field2159 && !var3) {
                this.method2061((byte) 113);
            }
            return null;
        }
        int var5 = this.field5102 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var6 = var4.field5201;
            var7 = var4.field5217;
        } else {
            var6 = var4.field5217;
            var7 = var4.field5201;
        }
        int var8 = (var7 + 1 >> 1) + this.field5079;
        if (arg0 != -20703) {
            this.method2061((byte) -7);
        }
        int var9 = (var6 >> 1) + this.field5101;
        int var10 = (var6 + 1 >> 1) + this.field5101;
        int var11 = this.field5079 + (var7 >> 1);
        this.method2056((byte) 56, var11 * 128, var9 * 128);
        boolean var12 = !var3 && var4.field5242 && (this.field5077 != var4.field5219 || this.field5088 != this.field5074 && class291.field4906 >= 2);
        if (arg1 && !var12) {
            return null;
        }
        int[][] var13 = class206.field3473[this.field5087];
        int var14 = var13[var8][var9] + var13[var11][var9] + var13[var8][var10] + var13[var11][var10] >> 2;
        int var15 = (this.field5079 << 7) + (var7 << 6);
        int var16 = (this.field5101 << 7) + (var6 << 6);
        int[][] var17 = (int[][]) null;
        if (var3) {
            var17 = class73.field1166[0];
        } else if (this.field5087 < 3) {
            var17 = class206.field3473[this.field5087 + 1];
        }
        if (class117.field2159 && var12) {
            class287.method1988(this.field5083, this.field5098, this.field5091, this.field5099);
        }
        boolean var18 = this.field5083 == null;
        class128 var19;
        if (this.field5078 == null) {
            var19 = var4.method2100(false, var14, this.field5080, var17, -1, this.field5102, var13, var16, var12, var15, var18 ? class277.field4626 : this.field5083);
        } else {
            var19 = var4.method2096(this.field5080, arg0 + 26131, this.field5088, this.field5078, var18 ? class277.field4626 : this.field5083, var14, var16, var15, var12, this.field5102, var17, var13);
        }
        if (var19 == null) {
            return null;
        }
        if (class117.field2159 && var12) {
            if (var18) {
                class277.field4626 = var19.field2317;
            }
            int var20 = 0;
            if (this.field5087 != 0) {
                int[][] var21 = class206.field3473[0];
                var20 = var14 - (var21[var11][var9] + var21[var11][var10] + var21[var8][var9] + var21[var8][var10] >> 2);
            }
            class99 var22 = var19.field2317;
            if (this.field5093 && class287.method1991(var22, var15, var20, var16)) {
                this.field5093 = false;
            }
            if (!this.field5093) {
                class287.method1995(var22, var15, var20, var16);
                if (var18) {
                    class277.field4626 = null;
                }
                this.field5083 = var22;
                this.field5091 = var20;
                this.field5099 = var16;
                this.field5098 = var15;
            }
            this.field5074 = this.field5088;
            this.field5077 = var4.field5219;
        }
        return var19.field2327;
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(B)V", line = 409)
    public final void method2061(byte arg0) {
        field5086++;
        if (this.field5083 != null) {
            class287.method1988(this.field5083, this.field5098, this.field5091, this.field5099);
        }
        int var2 = 33 % ((arg0 + 12) / 62);
        this.field5077 = -1;
        this.field5074 = -1;
        this.field5083 = null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIBI)V", line = 440)
    public final void method1763(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != -5) {
            method2059((byte) 96);
        }
        field5081++;
        if (class117.field2159) {
            this.method2060(-20703, true);
        } else {
            this.method2056((byte) 56, ((arg2 - arg1 >> 1) + arg1) * 128 + 64, ((-arg0 + arg4 >> 1) + arg0) * 128 + 64);
        }
    }
}
