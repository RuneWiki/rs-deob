import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class159 {

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "Lji;")
    private class40 field2898 = new class40();

    @OriginalMember(owner = "client!sg", name = "B", descriptor = "Lji;")
    private class40 field2906 = new class40();

    @OriginalMember(owner = "client!sg", name = "C", descriptor = "Lji;")
    private class40 field2907 = new class40();

    @OriginalMember(owner = "client!sg", name = "D", descriptor = "Lji;")
    private class40 field2908 = new class40();

    @OriginalMember(owner = "client!sg", name = "I", descriptor = "Lsi;")
    private class194 field2912 = new class194(4);

    @OriginalMember(owner = "client!sg", name = "K", descriptor = "I")
    public volatile int field2914 = 0;

    @OriginalMember(owner = "client!sg", name = "L", descriptor = "B")
    private byte field2915 = 0;

    @OriginalMember(owner = "client!sg", name = "J", descriptor = "I")
    public volatile int field2913 = 0;

    @OriginalMember(owner = "client!sg", name = "M", descriptor = "Lsi;")
    private class194 field2916 = new class194(8);

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field2879 = 0;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "Loh;")
    public static class263 field2890 = class253.method1681(-127, "::breakcon");

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "Loh;")
    public static class263 field2889 = class253.method1681(-121, "Spielwelt erstellt)3");

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "Z")
    public static boolean field2896 = true;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "Loh;")
    private static class263 field2893 = class253.method1681(-119, "You can(Wt add yourself to your own ignore list)3");

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "Loh;")
    public static class263 field2881 = field2893;

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
    public static int field2900 = 0;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!sg", name = "y", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!sg", name = "A", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!sg", name = "H", descriptor = "I")
    private int field2911;

    @OriginalMember(owner = "client!sg", name = "G", descriptor = "J")
    private long field2910;

    @OriginalMember(owner = "client!sg", name = "F", descriptor = "Lnk;")
    private class125 field2909;

    @OriginalMember(owner = "client!sg", name = "N", descriptor = "Lgh;")
    private class24 field2917;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "[I")
    public static int[] field2886;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)Z")
    public final boolean method1033(boolean arg0) {
        field2905++;
        if (!arg0) {
            this.field2917 = null;
        }
        return this.method1037(-115) >= 20;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)Z")
    public final boolean method1034(int arg0) {
        if (arg0 != -31062) {
            field2889 = null;
        }
        field2899++;
        return this.method1040(arg0 ^ 0x7921) >= 20;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Loh;BILoh;)V")
    public static final void method1035(class263 arg0, byte arg1, int arg2, class263 arg3) {
        class20.field460 = arg3;
        class201.field3636 = arg2;
        class20.field461 = arg0;
        field2902++;
        if (class20.field461.method1788(-26006, class20.field459) || class20.field460.method1788(arg1 - 25935, class20.field459)) {
            class96.field1873 = 3;
        } else if (class7.field127 == -1) {
            class11.field254 = 1;
            class89.field1769 = 0;
            class96.field1873 = -3;
            class14.field359 = 0;
            class194 var4 = new class194(128);
            var4.method1288((byte) -56, 10);
            var4.method1276((int) (Math.random() * 99999.0D), arg1 - 37);
            var4.method1276(521, -41);
            var4.method1272((byte) 89, class20.field461.method1755(1));
            var4.method1286(-11740, (int) (Math.random() * 9.9999999E7D));
            var4.method1312(-90, class20.field460);
            var4.method1286(-11740, (int) (Math.random() * 9.9999999E7D));
            var4.method1322((byte) -18, class89.field1760, class222.field3931);
            if (arg1 != -71) {
                field2886 = null;
            }
            class154.field2792.field3497 = 0;
            class154.field2792.method1288((byte) -63, 222);
            class154.field2792.method1288((byte) -9, var4.field3497);
            class154.field2792.method1271(var4.field3497, 0, var4.field3469, arg1 ^ 0xFFFFB7FC);
        } else {
            class261.method1720(-1);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)Z")
    public final boolean method1036(byte arg0) {
        field2891++;
        if (this.field2909 != null) {
            long var2 = class25.method182(true);
            int var4 = (int) (var2 - this.field2910);
            this.field2910 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field2911 += var4;
            if (this.field2911 > 30000) {
                try {
                    this.field2909.method809((byte) 79);
                } catch (Exception var28) {
                }
                this.field2909 = null;
            }
        }
        if (this.field2909 == null) {
            return this.method1037(-121) == 0 && this.method1040(50) == 0;
        }
        try {
            this.field2909.method811(95);
            for (class24 var5 = (class24) this.field2898.method250(0); var5 != null; var5 = (class24) this.field2898.method251((byte) -70)) {
                this.field2912.field3497 = 0;
                this.field2912.method1288((byte) -9, 1);
                this.field2912.method1275((byte) -112, (int) var5.field3647);
                this.field2909.method806(0, 4, this.field2912.field3469, -101);
                this.field2906.method253(var5, (byte) 13);
            }
            for (class24 var6 = (class24) this.field2907.method250(0); var6 != null; var6 = (class24) this.field2907.method251((byte) -38)) {
                this.field2912.field3497 = 0;
                this.field2912.method1288((byte) -53, 0);
                this.field2912.method1275((byte) 4, (int) var6.field3647);
                this.field2909.method806(0, 4, this.field2912.field3469, -120);
                this.field2908.method253(var6, (byte) 13);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field2909.method803(-119);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field2911 = 0;
                byte var9 = 0;
                if (this.field2917 == null) {
                    var9 = 8;
                } else if (this.field2917.field695 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field2916.field3497;
                    if (var10 > var8) {
                        var10 = var8;
                    }
                    this.field2909.method810(this.field2916.field3497, -1, var10, this.field2916.field3469);
                    if (this.field2915 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field2916.field3469[this.field2916.field3497 + var11] = (byte) class38.method239(this.field2916.field3469[this.field2916.field3497 + var11], this.field2915);
                        }
                    }
                    this.field2916.field3497 += var10;
                    if (var9 <= this.field2916.field3497) {
                        if (this.field2917 == null) {
                            this.field2916.field3497 = 0;
                            int var12 = this.field2916.method1301(-8317);
                            int var13 = this.field2916.method1294((byte) 3);
                            int var14 = this.field2916.method1301(-8317);
                            int var15 = var14 & 0x7F;
                            boolean var16 = (var14 & 0x80) != 0;
                            Object var17 = null;
                            long var18 = (long) ((var12 << 16) + var13);
                            int var20 = this.field2916.method1266(4);
                            class24 var21;
                            if (var16) {
                                for (var21 = (class24) this.field2908.method250(0); var21 != null && var21.field3647 != var18; var21 = (class24) this.field2908.method251((byte) -75)) {
                                }
                            } else {
                                for (var21 = (class24) this.field2906.method250(0); var21 != null && var21.field3647 != var18; var21 = (class24) this.field2906.method251((byte) -64)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            int var22 = var15 == 0 ? 5 : 9;
                            this.field2917 = var21;
                            this.field2917.field688 = new class194(this.field2917.field687 + var22 + var20);
                            this.field2917.field688.method1288((byte) -27, var15);
                            this.field2917.field688.method1286(-11740, var20);
                            this.field2917.field695 = 8;
                            this.field2916.field3497 = 0;
                        } else if (this.field2917.field695 != 0) {
                            throw new IOException();
                        } else if (this.field2916.field3469[0] == -1) {
                            this.field2917.field695 = 1;
                            this.field2916.field3497 = 0;
                        } else {
                            this.field2917 = null;
                        }
                    }
                } else {
                    int var23 = this.field2917.field688.field3469.length - this.field2917.field687;
                    int var24 = 512 - this.field2917.field695;
                    if ((var23 - this.field2917.field688.field3497) < var24) {
                        var24 = var23 - this.field2917.field688.field3497;
                    }
                    if (var24 > var8) {
                        var24 = var8;
                    }
                    this.field2909.method810(this.field2917.field688.field3497, -1, var24, this.field2917.field688.field3469);
                    if (this.field2915 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field2917.field688.field3469[this.field2917.field688.field3497 + var25] = (byte) class38.method239(this.field2917.field688.field3469[this.field2917.field688.field3497 + var25], this.field2915);
                        }
                    }
                    this.field2917.field688.field3497 += var24;
                    this.field2917.field695 += var24;
                    if (this.field2917.field688.field3497 == var23) {
                        this.field2917.method1401((byte) 27);
                        this.field2917.field3427 = false;
                        this.field2917 = null;
                    } else if (this.field2917.field695 == 512) {
                        this.field2917.field695 = 0;
                    }
                }
            }
            int var26 = 95 % ((70 - arg0) / 46);
            return true;
        } catch (IOException var29) {
            try {
                this.field2909.method809((byte) 67);
            } catch (Exception var27) {
            }
            this.field2914++;
            this.field2909 = null;
            this.field2913 = -2;
            return this.method1037(-91) == 0 && this.method1040(-119) == 0;
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)I")
    public final int method1037(int arg0) {
        field2888++;
        if (arg0 >= -49) {
            field2900 = -88;
        }
        return this.field2898.method256(27635) + this.field2906.method256(27635);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BI)V")
    public static final void method1038(byte arg0, int arg1) {
        field2884++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class41.field918[arg1];
        int var3 = class106.field2018[arg1];
        int var4 = class202.field3645[arg1];
        int var5 = (int) class215.field3814[arg1];
        long var6 = class215.field3814[arg1];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        if (var4 == 51) {
            class90 var8 = class31.field774[var5];
            if (var8 != null) {
                class131.method845(false, class229.field4018.field4713[0], 2, 1, var8.field4714[0], 1, class229.field4018.field4714[0], var8.field4713[0], 0, 0, 0, (byte) -96);
                class108.field2032 = class31.field777;
                class184.field3338 = class57.field1173;
                class3.field58 = 0;
                class143.field2623 = 2;
                class154.field2792.method1516(-104, 112);
                class154.field2792.method1299(var5, 4929);
                class144.field2628++;
            }
        }
        if (arg0 != -91) {
            method1050((class263) null, (byte) -88);
        }
        if (var4 == 40) {
            class209.method1440(class12.field321, var3, var2);
        }
        if (var4 == 37) {
            class112.field2099 = true;
            class209.method1440(class12.field321, var3, var2);
        }
        if (var4 == 30) {
            class137 var9 = class151.field2725[var5];
            if (var9 != null) {
                class14.field360++;
                class131.method845(false, class229.field4018.field4713[0], 2, 1, var9.field4714[0], 1, class229.field4018.field4714[0], var9.field4713[0], 0, 0, 0, (byte) -122);
                class3.field58 = 0;
                class108.field2032 = class31.field777;
                class143.field2623 = 2;
                class184.field3338 = class57.field1173;
                class154.field2792.method1516(113, 52);
                class154.field2792.method1276(var5, arg0 ^ 0x1D);
            }
        }
        if (var4 == 10) {
            class267.field4720++;
            class154.field2792.method1516(-73, 124);
            class154.field2792.method1286(-11740, var2);
            class21 var10 = class8.method55(65535, var2);
            if (var10.field579 != null && var10.field579[0][0] == 5) {
                int var11 = var10.field579[0][1];
                class48.field1038[var11] = 1 - class48.field1038[var11];
                class233.method1568(var11, -94);
            }
        }
        if (var4 == 5 && class113.field2121 == null) {
            class37.method236((byte) -77, var2, var3);
            class113.field2121 = class64.method394(var2, -1943367162, var3);
            class220.method1508(class113.field2121, (byte) -59);
        }
        if (var4 == 38) {
            class89.field1759++;
            class154.field2792.method1516(56, 145);
            class154.field2792.method1286(-11740, var2);
            class154.field2792.method1299(var3, 4929);
            class154.field2792.method1286(-11740, class114.field2144);
            class154.field2792.method1280(class5.field100, (byte) -3);
        }
        if (var4 == 12) {
            boolean var12 = class131.method845(false, class229.field4018.field4713[0], 2, 0, var3, 0, class229.field4018.field4714[0], var2, 0, 0, 0, (byte) -93);
            if (!var12) {
                class131.method845(false, class229.field4018.field4713[0], 2, 1, var3, 1, class229.field4018.field4714[0], var2, 0, 0, 0, (byte) -128);
            }
            class108.field2032 = class31.field777;
            class36.field843++;
            class184.field3338 = class57.field1173;
            class143.field2623 = 2;
            class3.field58 = 0;
            class154.field2792.method1516(-36, 158);
            class154.field2792.method1325(false, class142.field2596 + var2);
            class154.field2792.method1280(var3 + class93.field1844, (byte) -97);
            class154.field2792.method1299(var5, arg0 ^ 0xFFFFECE4);
        }
        if (var4 == 19) {
            class127.field2353++;
            class154.field2792.method1516(-87, 217);
            class154.field2792.method1268(-65, var2);
            class154.field2792.method1276(var3, arg0 + 30);
            class154.field2792.method1325(false, var5);
            class55.field1160 = 0;
            class150.field2705 = class8.method55(arg0 ^ 0xFFFF005A, var2);
            class157.field2814 = var3;
        }
        if (var4 == 2) {
            class103.method692((byte) -122, var2, var6, var3);
            class154.field2792.method1516(~arg0, 220);
            class182.field3301++;
            class154.field2792.method1280((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) 116);
            class154.field2792.method1325(false, class142.field2596 + var2);
            class154.field2792.method1299(class93.field1844 + var3, arg0 ^ 0xFFFFECE4);
        }
        if (var4 == 31) {
            class154.field2792.method1516(arg0 + 188, 109);
            class54.field1132++;
            class154.field2792.method1325(false, var3);
            class154.field2792.method1276(class5.field100, -121);
            class154.field2792.method1286(-11740, class114.field2144);
            class154.field2792.method1280(var5, (byte) 118);
            class154.field2792.method1290(var2, 76);
            class55.field1160 = 0;
            class150.field2705 = class8.method55(65535, var2);
            class157.field2814 = var3;
        }
        if (var4 == 15) {
            class103.method692((byte) -122, var2, var6, var3);
            class154.field2792.method1516(-78, 33);
            class26.field702++;
            class154.field2792.method1280(class93.field1844 + var3, (byte) 121);
            class154.field2792.method1280(class142.field2596 + var2, (byte) -117);
            class154.field2792.method1299(Integer.MAX_VALUE & (int) (var6 >>> 32), 4929);
        }
        if (var4 == 48) {
            class266.field4645++;
            boolean var14 = class131.method845(false, class229.field4018.field4713[0], 2, 0, var3, 0, class229.field4018.field4714[0], var2, 0, 0, 0, (byte) -121);
            if (!var14) {
                class131.method845(false, class229.field4018.field4713[0], 2, 1, var3, 1, class229.field4018.field4714[0], var2, 0, 0, 0, (byte) -123);
            }
            class143.field2623 = 2;
            class184.field3338 = class57.field1173;
            class3.field58 = 0;
            class108.field2032 = class31.field777;
            class154.field2792.method1516(83, 209);
            class154.field2792.method1325(false, class93.field1844 + var3);
            class154.field2792.method1299(var2 + class142.field2596, 4929);
            class154.field2792.method1276(var5, -122);
            class154.field2792.method1268(arg0 ^ 0xFFFFFFD6, class114.field2144);
            class154.field2792.method1325(false, class5.field100);
        }
        if (var4 == 1001) {
            class108.field2032 = class31.field777;
            class143.field2623 = 2;
            class184.field3338 = class57.field1173;
            class3.field58 = 0;
            class90 var16 = class31.field774[var5];
            if (var16 != null) {
                class204 var17 = var16.field1787;
                if (var17.field3691 != null) {
                    var17 = var17.method1407((byte) -31);
                }
                if (var17 != null) {
                    class154.field2792.method1516(arg0 + 31, 208);
                    class94.field1849++;
                    class154.field2792.method1280(var17.field3668, (byte) 3);
                }
            }
        }
        if (var4 == 4) {
            class90 var18 = class31.field774[var5];
            if (var18 != null) {
                class257.field4472++;
                class131.method845(false, class229.field4018.field4713[0], 2, 1, var18.field4714[0], 1, class229.field4018.field4714[0], var18.field4713[0], 0, 0, 0, (byte) -101);
                class143.field2623 = 2;
                class184.field3338 = class57.field1173;
                class3.field58 = 0;
                class108.field2032 = class31.field777;
                class154.field2792.method1516(-37, 173);
                class154.field2792.method1325(false, class5.field100);
                class154.field2792.method1268(-89, class114.field2144);
                class154.field2792.method1325(false, var5);
            }
        }
        if (var4 == 21) {
            class90 var19 = class31.field774[var5];
            if (var19 != null) {
                class223.field3938++;
                class131.method845(false, class229.field4018.field4713[0], 2, 1, var19.field4714[0], 1, class229.field4018.field4714[0], var19.field4713[0], 0, 0, 0, (byte) -123);
                class108.field2032 = class31.field777;
                class3.field58 = 0;
                class143.field2623 = 2;
                class184.field3338 = class57.field1173;
                class154.field2792.method1516(-56, 85);
                class154.field2792.method1299(var5, arg0 ^ 0xFFFFECE4);
            }
        }
        if (var4 == 36) {
            class68.field1386++;
            class154.field2792.method1516(71, 102);
            class154.field2792.method1325(false, var5);
            class154.field2792.method1280(var3, (byte) -4);
            class154.field2792.method1268(-89, var2);
            class55.field1160 = 0;
            class150.field2705 = class8.method55(65535, var2);
            class157.field2814 = var3;
        }
        if (var4 == 33) {
            class137 var20 = class151.field2725[var5];
            if (var20 != null) {
                class131.method845(false, class229.field4018.field4713[0], 2, 1, var20.field4714[0], 1, class229.field4018.field4714[0], var20.field4713[0], 0, 0, 0, (byte) -93);
                class184.field3338 = class57.field1173;
                class92.field1813++;
                class108.field2032 = class31.field777;
                class143.field2623 = 2;
                class3.field58 = 0;
                class154.field2792.method1516(81, 172);
                class154.field2792.method1299(var5, 4929);
            }
        }
        if (var4 == 58) {
            class137 var21 = class151.field2725[var5];
            if (var21 != null) {
                class131.method845(false, class229.field4018.field4713[0], 2, 1, var21.field4714[0], 1, class229.field4018.field4714[0], var21.field4713[0], 0, 0, 0, (byte) -106);
                class184.field3338 = class57.field1173;
                class3.field58 = 0;
                class143.field2623 = 2;
                class108.field2032 = class31.field777;
                class154.field2792.method1516(arg0 ^ 0x63, 230);
                class125.field2308++;
                class154.field2792.method1325(false, var5);
            }
        }
        if (var4 == 23) {
            class137 var22 = class151.field2725[var5];
            if (var22 != null) {
                class82.field1615++;
                class131.method845(false, class229.field4018.field4713[0], 2, 1, var22.field4714[0], 1, class229.field4018.field4714[0], var22.field4713[0], 0, 0, 0, (byte) -99);
                class143.field2623 = 2;
                class3.field58 = 0;
                class184.field3338 = class57.field1173;
                class108.field2032 = class31.field777;
                class154.field2792.method1516(-103, 133);
                class154.field2792.method1280(var5, (byte) 121);
            }
        }
        if (var4 == 34) {
            class252.method1679((byte) 126);
            class21 var23 = class8.method55(65535, var2);
            class49.field1060 = 1;
            class121.field2247 = var3;
            class156.field2802 = var5;
            class46.field1006 = var2;
            class220.method1508(var23, (byte) -65);
            class236.field4127 = class124.method797(-62, new class263[] { class61.field1244, class92.method649(arg0 ^ 0x7EA1, var5).field1467, class98.field1880 });
            if (class236.field4127 == null) {
                class236.field4127 = class226.field3990;
            }
            return;
        }
        if (var4 == 41) {
            class154.field2792.method1516(-72, 124);
            class154.field2792.method1286(-11740, var2);
            class267.field4720++;
            class21 var24 = class8.method55(65535, var2);
            if (var24.field579 != null && var24.field579[0][0] == 5) {
                int var25 = var24.field579[0][1];
                if (class48.field1038[var25] != var24.field576[0]) {
                    class48.field1038[var25] = var24.field576[0];
                    class233.method1568(var25, -103);
                }
            }
        }
        if (var4 == 3) {
            class137 var26 = class151.field2725[var5];
            if (var26 != null) {
                class41.field924++;
                class131.method845(false, class229.field4018.field4713[0], 2, 1, var26.field4714[0], 1, class229.field4018.field4714[0], var26.field4713[0], 0, 0, 0, (byte) -99);
                class3.field58 = 0;
                class143.field2623 = 2;
                class108.field2032 = class31.field777;
                class184.field3338 = class57.field1173;
                class154.field2792.method1516(arg0 ^ 0xFFFFFFC6, 137);
                class154.field2792.method1276(var5, -80);
            }
        }
        if (var4 == 8) {
            class90 var27 = class31.field774[var5];
            if (var27 != null) {
                class240.field4207++;
                class131.method845(false, class229.field4018.field4713[0], 2, 1, var27.field4714[0], 1, class229.field4018.field4714[0], var27.field4713[0], 0, 0, 0, (byte) -122);
                class108.field2032 = class31.field777;
                class3.field58 = 0;
                class184.field3338 = class57.field1173;
                class143.field2623 = 2;
                class154.field2792.method1516(arg0 + 177, 231);
                class154.field2792.method1280(var5, (byte) -41);
            }
        }
        if (var4 == 24) {
            class137 var28 = class151.field2725[var5];
            if (var28 != null) {
                class131.method845(false, class229.field4018.field4713[0], 2, 1, var28.field4714[0], 1, class229.field4018.field4714[0], var28.field4713[0], 0, 0, 0, (byte) -102);
                class108.field2032 = class31.field777;
                class3.field58 = 0;
                class143.field2623 = 2;
                class184.field3338 = class57.field1173;
                class154.field2792.method1516(-111, 25);
                class154.field2792.method1280(var5, (byte) 114);
                class249.field4347++;
            }
        }
        if (var4 == 1005) {
            class184.field3338 = class57.field1173;
            class143.field2623 = 2;
            class91.field1790++;
            class3.field58 = 0;
            class108.field2032 = class31.field777;
            class154.field2792.method1516(-70, 245);
            class154.field2792.method1280(var5, (byte) 122);
        }
        if (var4 == 16) {
            class154.field2792.method1516(-113, 135);
            class162.field2951++;
            class154.field2792.method1268(92, var2);
            class154.field2792.method1325(false, var5);
            class154.field2792.method1299(var3, arg0 + 5020);
            class55.field1160 = 0;
            class150.field2705 = class8.method55(65535, var2);
            class157.field2814 = var3;
        }
        if (var4 == 13) {
            class154.field2792.method1516(-124, 229);
            class154.field2792.method1280(var3, (byte) 116);
            class200.field3615++;
            class154.field2792.method1268(arg0 + 157, var2);
            class154.field2792.method1276(var5, -45);
            class55.field1160 = 0;
            class150.field2705 = class8.method55(65535, var2);
            class157.field2814 = var3;
        }
        if (var4 == 6) {
            class90 var29 = class31.field774[var5];
            if (var29 != null) {
                class126.field2337++;
                class131.method845(false, class229.field4018.field4713[0], 2, 1, var29.field4714[0], 1, class229.field4018.field4714[0], var29.field4713[0], 0, 0, 0, (byte) -106);
                class108.field2032 = class31.field777;
                class143.field2623 = 2;
                class3.field58 = 0;
                class184.field3338 = class57.field1173;
                class154.field2792.method1516(88, 128);
                class154.field2792.method1292(class46.field1006, 10776);
                class154.field2792.method1280(class156.field2802, (byte) -107);
                class154.field2792.method1276(var5, -59);
                class154.field2792.method1280(class121.field2247, (byte) 120);
            }
        }
        if (var4 == 32) {
            class212.field3791++;
            class154.field2792.method1516(-94, 90);
            class154.field2792.method1292(var2, 10776);
            class154.field2792.method1325(false, var3);
            class154.field2792.method1276(var5, -117);
            class55.field1160 = 0;
            class150.field2705 = class8.method55(65535, var2);
            class157.field2814 = var3;
        }
        if (var4 == 59) {
            class229.field4022++;
            class154.field2792.method1516(arg0 + 52, 170);
            class154.field2792.method1299(var5, 4929);
            class154.field2792.method1299(var3, 4929);
            class154.field2792.method1268(arg0 + 191, var2);
            class55.field1160 = 0;
            class150.field2705 = class8.method55(65535, var2);
            class157.field2814 = var3;
        }
        if (var4 == 43 || var4 == 1007) {
            class244.method1657(107, var3, class68.field1382[arg1], var5, var2);
        }
        if (var4 == 44) {
            class90 var30 = class31.field774[var5];
            if (var30 != null) {
                class131.method845(false, class229.field4018.field4713[0], 2, 1, var30.field4714[0], 1, class229.field4018.field4714[0], var30.field4713[0], 0, 0, 0, (byte) -119);
                class184.field3338 = class57.field1173;
                class108.field2032 = class31.field777;
                class236.field4121++;
                class3.field58 = 0;
                class143.field2623 = 2;
                class154.field2792.method1516(123, 235);
                class154.field2792.method1276(var5, -109);
            }
        }
        if (var4 == 28) {
            class30.field748++;
            class154.field2792.method1516(110, 196);
            class154.field2792.method1276(var3, -97);
            class154.field2792.method1290(var2, 111);
            class154.field2792.method1325(false, var5);
            class55.field1160 = 0;
            class150.field2705 = class8.method55(65535, var2);
            class157.field2814 = var3;
        }
        if (var4 == 1004) {
            class21 var31 = class8.method55(65535, var2);
            if (var31 == null || var31.field618[var3] < 100000) {
                class154.field2792.method1516(55, 57);
                class154.field2792.method1280(var5, (byte) 6);
                class201.field3640++;
            } else {
                class120.method774(0, class124.method797(-44, new class263[] { class136.method891(-78, var31.field618[var3]), class37.field853, class92.method649(-32508, var5).field1467 }), -11292, class20.field459);
            }
            class55.field1160 = 0;
            class150.field2705 = class8.method55(65535, var2);
            class157.field2814 = var3;
        }
        if (var4 == 22) {
            class271.method1845(arg0 + 91);
        }
        if (var4 == 47) {
            class137 var32 = class151.field2725[var5];
            if (var32 != null) {
                class131.method845(false, class229.field4018.field4713[0], 2, 1, var32.field4714[0], 1, class229.field4018.field4714[0], var32.field4713[0], 0, 0, 0, (byte) -123);
                class184.field3338 = class57.field1173;
                class143.field2623 = 2;
                class3.field58 = 0;
                class85.field1674++;
                class108.field2032 = class31.field777;
                class154.field2792.method1516(71, 207);
                class154.field2792.method1290(class46.field1006, -96);
                class154.field2792.method1299(var5, arg0 + 5020);
                class154.field2792.method1299(class121.field2247, 4929);
                class154.field2792.method1276(class156.field2802, arg0 ^ 0x7);
            }
        }
        if (var4 == 46) {
            class90 var33 = class31.field774[var5];
            if (var33 != null) {
                class188.field3381++;
                class131.method845(false, class229.field4018.field4713[0], 2, 1, var33.field4714[0], 1, class229.field4018.field4714[0], var33.field4713[0], 0, 0, 0, (byte) -116);
                class108.field2032 = class31.field777;
                class184.field3338 = class57.field1173;
                class3.field58 = 0;
                class143.field2623 = 2;
                class154.field2792.method1516(arg0 + 172, 29);
                class154.field2792.method1280(var5, (byte) 115);
            }
        }
        if (var4 == 42) {
            class20.field454++;
            boolean var34 = class131.method845(false, class229.field4018.field4713[0], 2, 0, var3, 0, class229.field4018.field4714[0], var2, 0, 0, 0, (byte) -105);
            if (!var34) {
                class131.method845(false, class229.field4018.field4713[0], 2, 1, var3, 1, class229.field4018.field4714[0], var2, 0, 0, 0, (byte) -120);
            }
            class143.field2623 = 2;
            class108.field2032 = class31.field777;
            class184.field3338 = class57.field1173;
            class3.field58 = 0;
            class154.field2792.method1516(77, 195);
            class154.field2792.method1299(var2 + class142.field2596, 4929);
            class154.field2792.method1276(class93.field1844 + var3, arg0 ^ 0x68);
            class154.field2792.method1280(var5, (byte) 115);
        }
        if (var4 == 7 && class103.method692((byte) -122, var2, var6, var3)) {
            class207.field3752++;
            class154.field2792.method1516(arg0 + 188, 234);
            class154.field2792.method1276(class121.field2247, -39);
            class154.field2792.method1299((int) (var6 >>> 32) & Integer.MAX_VALUE, 4929);
            class154.field2792.method1280(class142.field2596 + var2, (byte) -27);
            class154.field2792.method1325(false, class156.field2802);
            class154.field2792.method1292(class46.field1006, 10776);
            class154.field2792.method1325(false, class93.field1844 + var3);
        }
        if (var4 == 50) {
            class103.method692((byte) -122, var2, var6, var3);
            class181.field3292++;
            class154.field2792.method1516(-76, 5);
            class154.field2792.method1325(false, class142.field2596 + var2);
            class154.field2792.method1280(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) 117);
            class154.field2792.method1299(class93.field1844 + var3, 4929);
        }
        if (var4 == 1006) {
            class103.method692((byte) -122, var2, var6, var3);
            class43.field944++;
            class154.field2792.method1516(-38, 148);
            class154.field2792.method1280(var2 + class142.field2596, (byte) -42);
            class154.field2792.method1276(Integer.MAX_VALUE & (int) (var6 >>> 32), -58);
            class154.field2792.method1325(false, class93.field1844 + var3);
        }
        if (var4 == 9) {
            class36.field832++;
            boolean var36 = class131.method845(false, class229.field4018.field4713[0], 2, 0, var3, 0, class229.field4018.field4714[0], var2, 0, 0, 0, (byte) -123);
            if (!var36) {
                class131.method845(false, class229.field4018.field4713[0], 2, 1, var3, 1, class229.field4018.field4714[0], var2, 0, 0, 0, (byte) -101);
            }
            class143.field2623 = 2;
            class108.field2032 = class31.field777;
            class3.field58 = 0;
            class184.field3338 = class57.field1173;
            class154.field2792.method1516(-109, 203);
            class154.field2792.method1276(class93.field1844 + var3, -32);
            class154.field2792.method1276(var2 + class142.field2596, -108);
            class154.field2792.method1299(var5, 4929);
        }
        if (var4 == 25) {
            class137 var38 = class151.field2725[var5];
            if (var38 != null) {
                class131.method845(false, class229.field4018.field4713[0], 2, 1, var38.field4714[0], 1, class229.field4018.field4714[0], var38.field4713[0], 0, 0, 0, (byte) -111);
                class108.field2032 = class31.field777;
                class143.field2623 = 2;
                class3.field58 = 0;
                class12.field336++;
                class184.field3338 = class57.field1173;
                class154.field2792.method1516(50, 185);
                class154.field2792.method1280(var5, (byte) 121);
            }
        }
        if (var4 == 18) {
            class137 var39 = class151.field2725[var5];
            if (var39 != null) {
                class157.field2824++;
                class131.method845(false, class229.field4018.field4713[0], 2, 1, var39.field4714[0], 1, class229.field4018.field4714[0], var39.field4713[0], 0, 0, 0, (byte) -93);
                class184.field3338 = class57.field1173;
                class143.field2623 = 2;
                class3.field58 = 0;
                class108.field2032 = class31.field777;
                class154.field2792.method1516(-124, 108);
                class154.field2792.method1325(false, var5);
            }
        }
        if (var4 == 1) {
            class225.field3975++;
            boolean var40 = class131.method845(false, class229.field4018.field4713[0], 2, 0, var3, 0, class229.field4018.field4714[0], var2, 0, 0, 0, (byte) -98);
            if (!var40) {
                class131.method845(false, class229.field4018.field4713[0], 2, 1, var3, 1, class229.field4018.field4714[0], var2, 0, 0, 0, (byte) -111);
            }
            class3.field58 = 0;
            class108.field2032 = class31.field777;
            class184.field3338 = class57.field1173;
            class143.field2623 = 2;
            class154.field2792.method1516(arg0 ^ 0xFFFFFF9E, 232);
            class154.field2792.method1276(class142.field2596 + var2, arg0 ^ 0x1E);
            class154.field2792.method1299(class93.field1844 + var3, 4929);
            class154.field2792.method1325(false, var5);
        }
        if (var4 == 39) {
            class150.field2714++;
            boolean var42 = class131.method845(false, class229.field4018.field4713[0], 2, 0, var3, 0, class229.field4018.field4714[0], var2, 0, 0, 0, (byte) -96);
            if (!var42) {
                class131.method845(false, class229.field4018.field4713[0], 2, 1, var3, 1, class229.field4018.field4714[0], var2, 0, 0, 0, (byte) -109);
            }
            class3.field58 = 0;
            class143.field2623 = 2;
            class108.field2032 = class31.field777;
            class184.field3338 = class57.field1173;
            class154.field2792.method1516(arg0 + 184, 152);
            class154.field2792.method1276(var5, -77);
            class154.field2792.method1299(class142.field2596 + var2, 4929);
            class154.field2792.method1276(class93.field1844 + var3, -69);
        }
        if (var4 == 20) {
            class21 var44 = class64.method394(var2, -1943367162, var3);
            if (var44 != null) {
                class252.method1679((byte) 126);
                class144.method955(class238.method1592(-479449948, client.method1005(var44)), var3, var2, (byte) -110);
                class49.field1060 = 0;
                class151.field2727 = class237.method1585(var44, false);
                if (class151.field2727 == null) {
                    class151.field2727 = class63.field1269;
                }
                if (!var44.field573) {
                    class39.field875 = class124.method797(-49, new class263[] { class218.field3870, var44.field566, class98.field1880 });
                    return;
                }
                class39.field875 = class124.method797(-78, new class263[] { var44.field477, class98.field1880 });
            }
            return;
        }
        if (var4 == 49) {
            class137 var45 = class151.field2725[var5];
            if (var45 != null) {
                class131.method845(false, class229.field4018.field4713[0], 2, 1, var45.field4714[0], 1, class229.field4018.field4714[0], var45.field4713[0], 0, 0, 0, (byte) -113);
                class143.field2623 = 2;
                class70.field1410++;
                class108.field2032 = class31.field777;
                class184.field3338 = class57.field1173;
                class3.field58 = 0;
                class154.field2792.method1516(90, 115);
                class154.field2792.method1292(class114.field2144, arg0 ^ 0xFFFFD5BD);
                class154.field2792.method1276(class5.field100, -66);
                class154.field2792.method1280(var5, (byte) -14);
            }
        }
        if (var4 == 1002) {
            class143.field2623 = 2;
            class201.field3640++;
            class3.field58 = 0;
            class108.field2032 = class31.field777;
            class184.field3338 = class57.field1173;
            class154.field2792.method1516(120, 57);
            class154.field2792.method1280(var5, (byte) -1);
        }
        if (var4 == 17) {
            class154.field2792.method1516(-108, 182);
            class154.field2792.method1286(-11740, var2);
            class107.field2025++;
            class154.field2792.method1325(false, var3);
            class154.field2792.method1299(var5, arg0 + 5020);
            class55.field1160 = 0;
            class150.field2705 = class8.method55(arg0 + 65626, var2);
            class157.field2814 = var3;
        }
        if (var4 == 14 && class103.method692((byte) -122, var2, var6, var3)) {
            class154.field2792.method1516(arg0 ^ 0x75, 250);
            class154.field2792.method1280(class5.field100, (byte) -40);
            class154.field2792.method1325(false, class142.field2596 + var2);
            class125.field2311++;
            class154.field2792.method1325(false, class93.field1844 + var3);
            class154.field2792.method1280((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) -74);
            class154.field2792.method1292(class114.field2144, 10776);
        }
        if (var4 == 26) {
            class77.field1579++;
            class154.field2792.method1516(96, 213);
            class154.field2792.method1276(var3, -112);
            class154.field2792.method1268(-58, var2);
            class154.field2792.method1325(false, var5);
            class55.field1160 = 0;
            class150.field2705 = class8.method55(65535, var2);
            class157.field2814 = var3;
        }
        if (var4 == 29) {
            boolean var46 = class131.method845(false, class229.field4018.field4713[0], 2, 0, var3, 0, class229.field4018.field4714[0], var2, 0, 0, 0, (byte) -98);
            if (!var46) {
                class131.method845(false, class229.field4018.field4713[0], 2, 1, var3, 1, class229.field4018.field4714[0], var2, 0, 0, 0, (byte) -100);
            }
            class52.field1111++;
            class184.field3338 = class57.field1173;
            class143.field2623 = 2;
            class3.field58 = 0;
            class108.field2032 = class31.field777;
            class154.field2792.method1516(103, 43);
            class154.field2792.method1276(class156.field2802, -99);
            class154.field2792.method1299(var5, 4929);
            class154.field2792.method1276(class121.field2247, arg0 ^ 0x2F);
            class154.field2792.method1290(class46.field1006, 83);
            class154.field2792.method1325(false, class142.field2596 + var2);
            class154.field2792.method1276(class93.field1844 + var3, -121);
        }
        if (var4 == 57) {
            class236.field4124++;
            class103.method692((byte) -122, var2, var6, var3);
            class154.field2792.method1516(arg0 - 23, 160);
            class154.field2792.method1299(Integer.MAX_VALUE & (int) (var6 >>> 32), 4929);
            class154.field2792.method1325(false, class93.field1844 + var3);
            class154.field2792.method1299(var2 + class142.field2596, arg0 + 5020);
        }
        if (var4 == 35) {
            class21 var48 = class8.method55(65535, var2);
            boolean var49 = true;
            if (var48.field516 > 0) {
                var49 = class4.method25(true, var48);
            }
            if (var49) {
                class267.field4720++;
                class154.field2792.method1516(103, 124);
                class154.field2792.method1286(-11740, var2);
            }
        }
        if (var4 == 11) {
            class164.field2979++;
            class154.field2792.method1516(-72, 214);
            class154.field2792.method1276(var3, -66);
            class154.field2792.method1299(class156.field2802, 4929);
            class154.field2792.method1299(class121.field2247, 4929);
            class154.field2792.method1290(class46.field1006, arg0 + 187);
            class154.field2792.method1290(var2, -108);
            class154.field2792.method1299(var5, 4929);
            class55.field1160 = 0;
            class150.field2705 = class8.method55(65535, var2);
            class157.field2814 = var3;
        }
        if (var4 == 45) {
            class188.field3382++;
            class154.field2792.method1516(-73, 83);
            class154.field2792.method1290(var2, 76);
            class154.field2792.method1325(false, var3);
            class154.field2792.method1276(var5, -96);
            class55.field1160 = 0;
            class150.field2705 = class8.method55(65535, var2);
            class157.field2814 = var3;
        }
        if (class49.field1060 != 0) {
            class49.field1060 = 0;
            class220.method1508(class8.method55(65535, class46.field1006), (byte) -115);
        }
        if (class130.field2387) {
            class252.method1679((byte) 124);
        }
        if (class150.field2705 != null && class55.field1160 == 0) {
            class220.method1508(class150.field2705, (byte) -80);
        }
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)V")
    private final void method1039(int arg0) {
        field2894++;
        if (this.field2909 == null) {
            return;
        }
        try {
            if (arg0 <= 52) {
                this.method1040(-78);
            }
            this.field2912.field3497 = 0;
            this.field2912.method1288((byte) -20, 6);
            this.field2912.method1275((byte) 117, 3);
            this.field2909.method806(0, 4, this.field2912.field3469, -102);
        } catch (IOException var3) {
            try {
                this.field2909.method809((byte) 85);
            } catch (Exception var2) {
            }
            this.field2913 = -2;
            this.field2914++;
            this.field2909 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(I)I")
    private final int method1040(int arg0) {
        field2904++;
        int var2 = 87 % ((arg0 + 53) / 51);
        return this.field2907.method256(27635) + this.field2908.method256(27635);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZIIB)Lgh;")
    public final class24 method1041(int arg0, boolean arg1, int arg2, int arg3, byte arg4) {
        field2887++;
        if (arg2 >= -27) {
            this.method1040(95);
        }
        long var6 = (long) ((arg3 << 16) + arg0);
        class24 var8 = new class24();
        var8.field3436 = arg1;
        var8.field3647 = var6;
        var8.field687 = arg4;
        if (arg1) {
            if (this.method1037(-54) >= 20) {
                throw new RuntimeException();
            }
            this.field2898.method253(var8, (byte) 13);
        } else if (this.method1040(42) < 20) {
            this.field2907.method253(var8, (byte) 13);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)V")
    public final void method1042(byte arg0) {
        field2901++;
        int var2 = 109 / ((71 - arg0) / 37);
        if (this.field2909 != null) {
            this.field2909.method809((byte) 114);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BZ)V")
    public static final void method1043(byte arg0, boolean arg1) {
        field2882++;
        class1.field14 = arg1;
        if (arg0 <= 29) {
            field2896 = false;
        }
        class40.field897 = !class77.method526(-26670);
    }

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "(I)V")
    public final void method1044(int arg0) {
        if (arg0 <= 42) {
            this.method1039(5);
        }
        field2895++;
        if (this.field2909 != null) {
            this.field2909.method798(2061376624);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lnk;IZ)V")
    public final void method1045(class125 arg0, int arg1, boolean arg2) {
        if (arg1 != 4) {
            this.field2917 = null;
        }
        field2883++;
        if (this.field2909 != null) {
            try {
                this.field2909.method809((byte) 85);
            } catch (Exception var8) {
            }
            this.field2909 = null;
        }
        this.field2909 = arg0;
        this.method1039(arg1 + 73);
        this.method1047(arg2, 54);
        this.field2916.field3497 = 0;
        this.field2917 = null;
        while (true) {
            class24 var4 = (class24) this.field2906.method255(arg1 ^ 0x4);
            if (var4 == null) {
                while (true) {
                    class24 var5 = (class24) this.field2908.method255(0);
                    if (var5 == null) {
                        if (this.field2915 != 0) {
                            try {
                                this.field2912.field3497 = 0;
                                this.field2912.method1288((byte) -77, 4);
                                this.field2912.method1288((byte) -88, this.field2915);
                                this.field2912.method1276(0, -112);
                                this.field2909.method806(0, 4, this.field2912.field3469, -126);
                            } catch (IOException var7) {
                                try {
                                    this.field2909.method809((byte) 88);
                                } catch (Exception var6) {
                                }
                                this.field2914++;
                                this.field2909 = null;
                                this.field2913 = -2;
                            }
                        }
                        this.field2911 = 0;
                        this.field2910 = class25.method182(true);
                        return;
                    }
                    this.field2907.method253(var5, (byte) 13);
                }
            }
            this.field2898.method253(var4, (byte) 13);
        }
    }

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "(I)V")
    public final void method1046(int arg0) {
        field2903++;
        if (this.field2909 == null) {
            return;
        }
        try {
            this.field2912.field3497 = arg0;
            this.field2912.method1288((byte) -37, 7);
            this.field2912.method1275((byte) 117, 0);
            this.field2909.method806(0, 4, this.field2912.field3469, -110);
        } catch (IOException var3) {
            try {
                this.field2909.method809((byte) 80);
            } catch (Exception var2) {
            }
            this.field2909 = null;
            this.field2914++;
            this.field2913 = -2;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZI)V")
    public final void method1047(boolean arg0, int arg1) {
        field2897++;
        if (this.field2909 == null) {
            return;
        }
        try {
            this.field2912.field3497 = 0;
            if (arg1 <= 26) {
                method1050((class263) null, (byte) -89);
            }
            this.field2912.method1288((byte) -116, arg0 ? 2 : 3);
            this.field2912.method1275((byte) -124, 0);
            this.field2909.method806(0, 4, this.field2912.field3469, -101);
        } catch (IOException var4) {
            try {
                this.field2909.method809((byte) 107);
            } catch (Exception var3) {
            }
            this.field2914++;
            this.field2909 = null;
            this.field2913 = -2;
        }
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(B)V")
    public final void method1048(byte arg0) {
        field2892++;
        try {
            this.field2909.method809((byte) 83);
            if (arg0 >= -124) {
                this.method1040(27);
            }
        } catch (Exception var2) {
        }
        this.field2909 = null;
        this.field2915 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field2914++;
        this.field2913 = -1;
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(B)V")
    public static void method1049(byte arg0) {
        field2886 = null;
        field2890 = null;
        field2893 = null;
        field2881 = null;
        if (arg0 != 115) {
            method1049((byte) 33);
        }
        field2889 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Loh;B)Z")
    public static final boolean method1050(class263 arg0, byte arg1) {
        field2880++;
        if (arg0 == null) {
            return false;
        }
        int var2 = -9 / ((76 - arg1) / 48);
        for (int var3 = 0; var3 < class100.field1908; var3++) {
            if (arg0.method1766(-1, class238.field4159[var3])) {
                return true;
            }
        }
        return arg0.method1766(-1, class229.field4018.field2508);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method1051(byte arg0, Component arg1) {
        if (arg0 != 104) {
            field2890 = null;
        }
        field2885++;
        arg1.removeKeyListener(class236.field4122);
        arg1.removeFocusListener(class236.field4122);
        class95.field1868 = -1;
    }
}
