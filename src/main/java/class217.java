import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class217 {

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    private int field3170;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "[Luj;")
    private class155[] field3168;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static volatile int field3171 = -1;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "[I")
    public static int[] field3169 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "[C")
    public static char[] field3177 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "J")
    private long field3175;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "Luj;")
    private class155 field3179;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "Llc;")
    public static class270 field3181;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
    public static void method1510(byte arg0) {
        field3177 = null;
        field3169 = null;
        field3181 = null;
        int var1 = -43 / ((arg0 + 57) / 51);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILmh;IIII)V")
    public static final void method1511(int arg0, int arg1, class263 arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 != 4) {
            return;
        }
        field3174++;
        class66 var7 = class206.method1458(arg0, 22464);
        if (var7 == null || !var7.field992 || !var7.method491(0)) {
            return;
        }
        if (var7.field990 != null) {
            int[] var8 = new int[var7.field990.length];
            for (int var9 = 0; var9 < var8.length / 2; var9++) {
                int var11 = (int) class102.field1736 + class267.field4279 & 0x7FF;
                int var12 = class244.field3590[var11];
                int var13 = var12 * 256 / (class131.field2168 + 256);
                int var14 = class244.field3592[var11];
                int var15 = var14 * 256 / (class131.field2168 + 256);
                var8[var9 * 2] = ((var7.field990[var9 * 2] * 4 + arg3) * var15 + (var7.field990[var9 * 2 + 1] * 4 + arg6) * var13 >> 16) + arg2.field4215 / 2 + arg1;
                var8[var9 * 2 + 1] = arg4 + (arg2.field4046 / 2) - ((var7.field990[var9 * 2 + 1] * 4 + arg6) * var15 - ((var7.field990[var9 * 2] * 4 + arg3) * var13) >> 16);
            }
            class216.method1503(var8, var7.field995, var7.field995 >>> 24, arg2.field4220, arg2.field4168);
            for (int var10 = 0; var10 < (var8.length / 2 - 1); var10++) {
                class130.method999(var8[var10 * 2], var8[var10 * 2 + 1], var8[var10 * 2 + 2], var8[var10 * 2 + 2 + 1], var7.field1021, var7.field1021 >>> 24, arg2.field4220, arg2.field4168);
            }
            class130.method999(var8[var8.length - 2], var8[var8.length - 1], var8[0], var8[1], var7.field1021, var7.field1021 >>> 24, arg2.field4220, arg2.field4168);
        }
        class138 var16 = null;
        if (var7.field993 != -1) {
            var16 = var7.method499(false, false, false);
            if (var16 != null) {
                class100.method788(arg4, arg1, arg3, (byte) -110, arg6, var16, arg2);
            }
        }
        if (var7.field991 == null) {
            return;
        }
        int var17 = 0;
        if (var16 != null) {
            var17 = var16.field2255;
        }
        class10 var18 = class84.field1336;
        if (var7.field1014 == 1) {
            var18 = class124.field2073;
        }
        if (var7.field1014 == 2) {
            var18 = class208.field3084;
        }
        class123.method944(arg4, arg1, arg5 - 1, var18, arg6, var17, var7.field1005, arg2, var7.field991, arg3);
        return;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(JI)V")
    public static final void method1512(long arg0, int arg1) {
        if (arg1 != 13196) {
            return;
        }
        field3180++;
        if (arg0 != 0L) {
            class265.field4247++;
            class144.field2338.method683(true, 218);
            class144.field2338.method382(902642416, arg0);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public static final void method1513(int arg0) {
        field3176++;
        class169.field2570.method1422((byte) 115);
        class33.field413.method1422((byte) 113);
        if (arg0 != 8221) {
            field3171 = -12;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "()V")
    public static final void method1514() {
        class71.field1117 = 0;
        label191: for (int var0 = 0; var0 < class139.field2268; var0++) {
            class57 var1 = class254.field3829[var0];
            if (class249.field3766 != null) {
                for (int var2 = 0; var2 < class249.field3766.length; var2++) {
                    if (class249.field3766[var2] != -1000000 && (var1.field849 <= class249.field3766[var2] || var1.field839 <= class249.field3766[var2]) && (var1.field844 <= class163.field2519[var2] || var1.field846 <= class163.field2519[var2]) && (var1.field844 >= class187.field2785[var2] || var1.field846 >= class187.field2785[var2]) && (var1.field847 <= class24.field265[var2] || var1.field834 <= class24.field265[var2]) && (var1.field847 >= class224.field3290[var2] || var1.field834 >= class224.field3290[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field826 == 1) {
                int var3 = var1.field827 + class91.field1457 - class142.field2288;
                if (var3 >= 0 && var3 <= class91.field1457 + class91.field1457) {
                    int var4 = var1.field831 + class91.field1457 - class138.field2252;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field825 + class91.field1457 - class138.field2252;
                    if (var5 > class91.field1457 + class91.field1457) {
                        var5 = class91.field1457 + class91.field1457;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class79.field1276[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class159.field2479 - var1.field844;
                        if (var7 > 32) {
                            var1.field840 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field840 = 2;
                            var7 = -var7;
                        }
                        var1.field850 = (var1.field847 - class141.field2281 << 8) / var7;
                        var1.field837 = (var1.field834 - class141.field2281 << 8) / var7;
                        var1.field829 = (var1.field849 - class282.field4540 << 8) / var7;
                        var1.field832 = (var1.field839 - class282.field4540 << 8) / var7;
                        class199.field2934[class71.field1117++] = var1;
                    }
                }
            } else if (var1.field826 == 2) {
                int var8 = var1.field831 + class91.field1457 - class138.field2252;
                if (var8 >= 0 && var8 <= class91.field1457 + class91.field1457) {
                    int var9 = var1.field827 + class91.field1457 - class142.field2288;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field848 + class91.field1457 - class142.field2288;
                    if (var10 > class91.field1457 + class91.field1457) {
                        var10 = class91.field1457 + class91.field1457;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class79.field1276[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class141.field2281 - var1.field847;
                        if (var12 > 32) {
                            var1.field840 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field840 = 4;
                            var12 = -var12;
                        }
                        var1.field852 = (var1.field844 - class159.field2479 << 8) / var12;
                        var1.field833 = (var1.field846 - class159.field2479 << 8) / var12;
                        var1.field829 = (var1.field849 - class282.field4540 << 8) / var12;
                        var1.field832 = (var1.field839 - class282.field4540 << 8) / var12;
                        class199.field2934[class71.field1117++] = var1;
                    }
                }
            } else if (var1.field826 == 4) {
                int var13 = var1.field849 - class282.field4540;
                if (var13 > 128) {
                    int var14 = var1.field831 + class91.field1457 - class138.field2252;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field825 + class91.field1457 - class138.field2252;
                    if (var15 > class91.field1457 + class91.field1457) {
                        var15 = class91.field1457 + class91.field1457;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field827 + class91.field1457 - class142.field2288;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field848 + class91.field1457 - class142.field2288;
                        if (var17 > class91.field1457 + class91.field1457) {
                            var17 = class91.field1457 + class91.field1457;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class79.field1276[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field840 = 5;
                            var1.field852 = (var1.field844 - class159.field2479 << 8) / var13;
                            var1.field833 = (var1.field846 - class159.field2479 << 8) / var13;
                            var1.field850 = (var1.field847 - class141.field2281 << 8) / var13;
                            var1.field837 = (var1.field834 - class141.field2281 << 8) / var13;
                            class199.field2934[class71.field1117++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)V")
    public static final void method1515(int arg0, int arg1) {
        class276.field4464.method1416(arg1, 0);
        if (arg0 > 20) {
            field3172++;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IJ)Luj;")
    public final class155 method1516(int arg0, long arg1) {
        this.field3175 = arg1;
        field3182++;
        class155 var4 = this.field3168[(int) (arg1 & (long) (this.field3170 - 1))];
        if (arg0 != 10042) {
            field3181 = null;
        }
        for (this.field3179 = var4.field2420; this.field3179 != var4; this.field3179 = this.field3179.field2420) {
            if (this.field3179.field2422 == arg1) {
                class155 var5 = this.field3179;
                this.field3179 = this.field3179.field2420;
                return var5;
            }
        }
        this.field3179 = null;
        return null;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(I)V")
    public class217(int arg0) {
        this.field3170 = arg0;
        this.field3168 = new class155[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class155 var3 = this.field3168[var2] = new class155();
            var3.field2424 = var3;
            var3.field2420 = var3;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BJLuj;)V")
    public final void method1517(byte arg0, long arg1, class155 arg2) {
        if (arg2.field2424 != null) {
            arg2.method1135(false);
        }
        class155 var5 = this.field3168[(int) (arg1 & (long) (this.field3170 - 1))];
        field3183++;
        arg2.field2420 = var5;
        arg2.field2424 = var5.field2424;
        int var6 = -56 / ((arg0 + 18) / 62);
        arg2.field2424.field2420 = arg2;
        arg2.field2422 = arg1;
        arg2.field2420.field2424 = arg2;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)Luj;")
    public final class155 method1518(byte arg0) {
        if (arg0 <= 66) {
            return null;
        }
        field3173++;
        if (this.field3179 == null) {
            return null;
        }
        class155 var2 = this.field3168[(int) ((long) (this.field3170 - 1) & this.field3175)];
        while (this.field3179 != var2) {
            if (this.field3179.field2422 == this.field3175) {
                class155 var3 = this.field3179;
                this.field3179 = this.field3179.field2420;
                return var3;
            }
            this.field3179 = this.field3179.field2420;
        }
        this.field3179 = null;
        return null;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)V")
    public static final void method1519(byte arg0) {
        field3178++;
        if (arg0 > -92) {
            field3177 = null;
        }
        class241.field3533.method1420((byte) 127);
    }
}
