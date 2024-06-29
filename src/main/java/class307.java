import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class307 {

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "[I")
    private int[] field5155 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "Z")
    public boolean field5161 = false;

    @OriginalMember(owner = "client!wl", name = "s", descriptor = "I")
    public int field5169 = -1;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "Lok;")
    public static class41 field5156 = class137.method956("mem=", 45);

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "Lok;")
    public static class41 field5154 = class137.method956("", 45);

    @OriginalMember(owner = "client!wl", name = "C", descriptor = "Lok;")
    public static class41 field5179 = class137.method956("::cardmem", 45);

    @OriginalMember(owner = "client!wl", name = "E", descriptor = "I")
    public static int field5181 = -1;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field5152;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public static int field5153;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    public static int field5159;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!wl", name = "r", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!wl", name = "u", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!wl", name = "w", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!wl", name = "x", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!wl", name = "y", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!wl", name = "B", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!wl", name = "D", descriptor = "Z")
    public static boolean field5180;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "[I")
    private int[] field5162;

    @OriginalMember(owner = "client!wl", name = "A", descriptor = "[I")
    public static int[] field5177;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "[Lok;")
    public static class41[] field5151;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "[S")
    private short[] field5163;

    @OriginalMember(owner = "client!wl", name = "t", descriptor = "[S")
    private short[] field5170;

    @OriginalMember(owner = "client!wl", name = "v", descriptor = "[S")
    private short[] field5172;

    @OriginalMember(owner = "client!wl", name = "z", descriptor = "[S")
    private short[] field5176;

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "[[[S")
    public static short[][][] field5164;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)Ln;", line = 5)
    public final class233 method2126(byte arg0) {
        field5168++;
        class233[] var2 = new class233[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field5155[var4] != -1) {
                var2[var3++] = class233.method1661(class35.field524, this.field5155[var4], 0);
            }
        }
        class233 var5 = new class233(var2, var3);
        if (arg0 != 29) {
            field5180 = true;
        }
        if (this.field5163 != null) {
            for (int var6 = 0; var6 < this.field5163.length; var6++) {
                var5.method1680(this.field5163[var6], this.field5170[var6]);
            }
        }
        if (this.field5172 != null) {
            for (int var7 = 0; var7 < this.field5172.length; var7++) {
                var5.method1662(this.field5172[var7], this.field5176[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIII)V", line = 61)
    public static final void method2127(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5153++;
        class269.method1908(arg1 ^ 0x13, class239.field3829[arg0], arg3, arg2 + arg4, -arg2 + arg4);
        int var6 = arg1;
        int var7 = arg5;
        int var8 = arg2 * arg2;
        int var9 = arg5 * arg5;
        int var10 = var9 << 1;
        int var11 = arg5 << 1;
        int var12 = var8 << 1;
        int var13 = var9 - ((var11 - 1) * var12);
        int var14 = (1 - var11) * var8 + var10;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((arg1 << 1) + 3) * var10;
        int var18 = ((arg5 << 1) - 3) * var12;
        int var19 = (arg5 - 1) * var15;
        int var20 = (arg1 + 1) * var16;
        while (var7 > 0) {
            var7--;
            if (var14 < 0) {
                while (var14 < 0) {
                    var13 += var20;
                    var6++;
                    var20 += var16;
                    var14 += var17;
                    var17 += var16;
                }
            }
            int var21 = arg0 - var7;
            if (var13 < 0) {
                var13 += var20;
                var20 += var16;
                var6++;
                var14 += var17;
                var17 += var16;
            }
            var13 += -var18;
            var14 += -var19;
            int var22 = arg4 + var6;
            int var23 = arg0 + var7;
            var19 -= var15;
            int var24 = arg4 - var6;
            class269.method1908(19, class239.field3829[var21], arg3, var22, var24);
            class269.method1908(19, class239.field3829[var23], arg3, var22, var24);
            var18 -= var15;
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(B)V", line = 141)
    public static void method2128(byte arg0) {
        field5151 = null;
        field5177 = null;
        field5179 = null;
        field5154 = null;
        field5164 = (short[][][]) null;
        if (arg0 == 11) {
            field5156 = null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IJ)V", line = 158)
    public static final void method2129(int arg0, long arg1) {
        field5152++;
        if (arg1 == 0L) {
            return;
        }
        if (class281.field4576 >= 100) {
            class262.method1843(class289.field4696, 0, class266.field4233, 77);
            return;
        }
        class41 var3 = class235.method1690(arg1, (byte) -127).method288((byte) -119);
        int var4 = 0;
        if (arg0 < 119) {
            field5160 = -45;
        }
        while (class281.field4576 > var4) {
            if (class273.field4436[var4] == arg1) {
                class262.method1843(class187.method1346(new class41[] { var3, class289.field4699 }, 0), 0, class266.field4233, 122);
                return;
            }
            var4++;
        }
        for (int var5 = 0; var5 < class118.field1741; var5++) {
            if (class65.field1001[var5] == arg1) {
                class262.method1843(class187.method1346(new class41[] { class240.field3837, var3, class57.field825 }, 0), 0, class266.field4233, 50);
                return;
            }
        }
        if (var3.method268(class62.field913.field3933, 1631)) {
            class262.method1843(class272.field4411, 0, class266.field4233, 120);
            return;
        }
        class77.field1141++;
        class273.field4436[class281.field4576] = arg1;
        class315.field5310[class281.field4576++] = class235.method1690(arg1, (byte) 71);
        class275.field4508 = class33.field493;
        class285.field4642.method844(-4, 120);
        class285.field4642.method800(arg1, (byte) -113);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIILth;IJIIII)Z", line = 223)
    public static final boolean method2130(int arg0, int arg1, int arg2, int arg3, class126 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class314.method2174(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(B)V", line = 233)
    public static final void method2131(byte arg0) {
        int var1 = 68 % ((arg0 - 11) / 48);
        field5173++;
        class151.field2344.method135(18436);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IILbc;I)V", line = 244)
    public static final void method2132(int arg0, int arg1, class302 arg2, int arg3) {
        field5171++;
        if (class317.field5361 != null || class251.field3993 || arg2 == null || class296.method2040(arg2, 4617) == null) {
            return;
        }
        class317.field5361 = arg2;
        class86.field1264 = class296.method2040(arg2, 4617);
        class1.field9 = arg3;
        class256.field4111 = false;
        if (arg0 >= -59) {
            field5164 = (short[][][]) ((short[][][]) null);
        }
        class124.field1842 = arg1;
        class171.field2757 = 0;
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "(B)Z", line = 267)
    public final boolean method2133(byte arg0) {
        field5157++;
        if (this.field5162 == null) {
            return true;
        }
        boolean var2 = true;
        int var3 = 0;
        int var4 = 71 / ((1 - arg0) / 38);
        while (var3 < this.field5162.length) {
            if (!class35.field524.method471(0, this.field5162[var3], (byte) -127)) {
                var2 = false;
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)Ln;", line = 293)
    public final class233 method2134(int arg0) {
        field5167++;
        if (this.field5162 == null) {
            return null;
        }
        class233[] var2 = new class233[this.field5162.length];
        if (arg0 != 994137410) {
            field5181 = -25;
        }
        for (int var3 = 0; var3 < this.field5162.length; var3++) {
            var2[var3] = class233.method1661(class35.field524, this.field5162[var3], 0);
        }
        class233 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class233(var2, var2.length);
        }
        if (this.field5163 != null) {
            for (int var5 = 0; var5 < this.field5163.length; var5++) {
                var4.method1680(this.field5163[var5], this.field5170[var5]);
            }
        }
        if (this.field5172 != null) {
            for (int var6 = 0; var6 < this.field5172.length; var6++) {
                var4.method1662(this.field5172[var6], this.field5176[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Llb;I)V", line = 365)
    public final void method2135(class112 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method792(arg1 ^ 0xFFFFE75E);
            if (var3 == 0) {
                field5166++;
                if (arg1 != -6308) {
                    field5160 = 121;
                }
                return;
            }
            this.method2139(arg0, var3, (byte) 79);
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V", line = 392)
    public static final void method2136(int arg0) {
        for (int var1 = 0; var1 < class41.field620; var1++) {
            int var10002 = class38.field587[var1]--;
            if (class38.field587[var1] >= -10) {
                class49 var2 = class271.field4360[var1];
                if (var2 == null) {
                    var2 = class49.method347(class44.field693, class18.field227[var1], 0);
                    if (var2 == null) {
                        continue;
                    }
                    class38.field587[var1] += var2.method348();
                    class271.field4360[var1] = var2;
                }
                if (class38.field587[var1] < 0) {
                    int var3;
                    if (class38.field595[var1] == 0) {
                        var3 = class1.field3;
                    } else {
                        int var4 = (class38.field595[var1] & 0xFF) * 128;
                        int var5 = class38.field595[var1] >> 16 & 0xFF;
                        int var6 = var5 * 128 + 64 - class62.field913.field4280;
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        int var7 = (class38.field595[var1] & 0xFF0A) >> 8;
                        int var8 = var7 * 128 + 64 - class62.field913.field4311;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var6 + var8 - 128;
                        if (var9 > var4) {
                            class38.field587[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var3 = (var4 - var9) * class225.field3606 / var4;
                    }
                    if (var3 > 0) {
                        class291 var10 = var2.method349().method2020(class13.field163);
                        class215 var11 = class215.method1528(var10, 100, var3);
                        var11.method1538(class52.field784[var1] - 1);
                        class225.field3596.method1422(var11);
                    }
                    class38.field587[var1] = -100;
                }
            } else {
                class41.field620--;
                for (int var12 = var1; var12 < class41.field620; var12++) {
                    class18.field227[var12] = class18.field227[var12 + 1];
                    class271.field4360[var12] = class271.field4360[var12 + 1];
                    class52.field784[var12] = class52.field784[var12 + 1];
                    class38.field587[var12] = class38.field587[var12 + 1];
                    class38.field595[var12] = class38.field595[var12 + 1];
                }
                var1--;
            }
        }
        if (arg0 < 12) {
            method2132(-110, -95, (class302) null, -32);
        }
        if (class265.field4193 && !class235.method1694((byte) -106)) {
            if (class244.field3900 != 0 && class237.field3805 != -1) {
                class271.method1916(16611, class294.field4763, class244.field3900, false, 0, class237.field3805);
            }
            class265.field4193 = false;
        } else if (class244.field3900 != 0 && class237.field3805 != -1 && !class235.method1694((byte) -96)) {
            class285.field4642.method844(-4, 200);
            class228.field3632++;
            class285.field4642.method787(853918096, class237.field3805);
            class237.field3805 = -1;
        }
        field5158++;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIILue;II)V", line = 524)
    public static final void method2137(int arg0, int arg1, int arg2, int arg3, class223 arg4, int arg5, int arg6) {
        field5165++;
        long var7 = 0L;
        if (arg1 == 0) {
            var7 = class95.method679(arg6, arg3, arg0);
        } else if (arg1 == 1) {
            var7 = class30.method190(arg6, arg3, arg0);
        } else if (arg1 == 2) {
            var7 = class281.method1982(arg6, arg3, arg0);
        } else if (arg1 == 3) {
            var7 = class14.method62(arg6, arg3, arg0);
        }
        boolean var9 = false;
        boolean var10 = true;
        int var11 = ((int) var7 & 0x7F0C5) >> 14;
        int var12 = (int) (var7 >>> 32) & Integer.MAX_VALUE;
        class171 var13 = class234.method1684(-2441, var12);
        if (arg2 <= 64) {
            return;
        }
        boolean var14 = false;
        if (var13.method1219(true)) {
            class245.method1750(true, var13, arg3, arg0, arg6);
        }
        int var15 = ((int) var7 & 0x30D226) >> 20;
        if (var7 == 0L) {
            return;
        }
        class126 var16 = null;
        class126 var17 = null;
        if (arg1 == 0) {
            class241 var21 = class88.method627(arg6, arg3, arg0);
            if (var21 != null) {
                var16 = var21.field3854;
                var17 = var21.field3864;
            }
            if (var13.field2771 != 0) {
                arg4.method1607(var15, arg3, var11, arg0, -1, var13.field2727);
            }
        } else if (arg1 == 1) {
            class198 var18 = class248.method1763(arg6, arg3, arg0);
            if (var18 != null) {
                var17 = var18.field3177;
                var16 = var18.field3176;
            }
        } else if (arg1 == 2) {
            class232 var20 = class240.method1721(arg6, arg3, arg0);
            if (var20 != null) {
                var17 = var20.field3674;
            }
            if (var13.field2771 != 0 && (arg3 + var13.field2752) < 104 && var13.field2752 + arg0 < 104 && var13.field2784 + arg3 < 104 && var13.field2784 + arg0 < 104) {
                arg4.method1613(var13.field2727, var15, var13.field2752, false, var13.field2784, arg0, arg3);
            }
        } else if (arg1 == 3) {
            class107 var19 = class224.method1614(arg6, arg3, arg0);
            if (var19 != null) {
                var17 = var19.field1499;
            }
            if (var13.field2771 == 1) {
                arg4.method1594(arg0, arg3, -262145);
            }
        }
        if (!class166.field2625 || !var13.field2781) {
            return;
        }
        if (var11 == 2) {
            if ((var17 instanceof class272)) {
                ((class272) var17).method1922((byte) -79);
            } else {
                class105.method723(arg3, 0, arg5, 0, arg0, 0, var13, var15 + 4, var11);
            }
            if (var16 instanceof class272) {
                ((class272) var16).method1922((byte) -79);
            } else {
                class105.method723(arg3, 0, arg5, 0, arg0, 0, var13, var15 + 1 & 0x3, var11);
            }
        } else if (var11 == 5) {
            if ((var17 instanceof class272)) {
                ((class272) var17).method1922((byte) -79);
            } else {
                class105.method723(arg3, class245.field3913[var15] * 8, arg5, class151.field2343[var15] * 8, arg0, 0, var13, var15, 4);
            }
        } else if (var11 == 6) {
            if ((var17 instanceof class272)) {
                ((class272) var17).method1922((byte) -79);
            } else {
                class105.method723(arg3, class27.field399[var15] * 8, arg5, class138.field2077[var15] * 8, arg0, 0, var13, var15 + 4, 4);
            }
        } else if (var11 == 7) {
            if ((var17 instanceof class272)) {
                ((class272) var17).method1922((byte) -79);
            } else {
                class105.method723(arg3, 0, arg5, 0, arg0, 0, var13, (var15 + 2 & 0x3) + 4, 4);
            }
        } else if (var11 == 8) {
            if (var17 instanceof class272) {
                ((class272) var17).method1922((byte) -79);
            } else {
                class105.method723(arg3, class27.field399[var15] * 8, arg5, class138.field2077[var15] * 8, arg0, 0, var13, var15 + 4, 4);
            }
            if (var16 instanceof class272) {
                ((class272) var16).method1922((byte) -79);
            } else {
                class105.method723(arg3, class27.field399[var15] * 8, arg5, class138.field2077[var15] * 8, arg0, 0, var13, (var15 + 2 & 0x3) + 4, 4);
            }
        } else if (var11 == 11) {
            if ((var17 instanceof class272)) {
                ((class272) var17).method1922((byte) -79);
            } else {
                class105.method723(arg3, 0, arg5, 0, arg0, 0, var13, var15 + 4, 10);
            }
        } else if ((var17 instanceof class272)) {
            ((class272) var17).method1922((byte) -79);
        } else {
            class105.method723(arg3, 0, arg5, 0, arg0, 0, var13, var15, var11);
        }
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)V", line = 731)
    public static final void method2138(int arg0) {
        int var1 = class164.field2597.method849(8, 38);
        field5174++;
        if (class85.field1248 > var1) {
            for (int var2 = var1; var2 < class85.field1248; var2++) {
                class239.field3834[class65.field997++] = class118.field1737[var2];
            }
        }
        if (class85.field1248 < var1) {
            throw new RuntimeException("gppov1");
        }
        class85.field1248 = 0;
        if (arg0 != 1) {
            field5177 = (int[]) null;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class118.field1737[var3];
            class245 var5 = class246.field3955[var4];
            int var6 = class164.field2597.method849(1, 38);
            if (var6 == 0) {
                class118.field1737[class85.field1248++] = var4;
                var5.field4294 = class18.field234;
            } else {
                int var7 = class164.field2597.method849(2, arg0 ^ 0x27);
                if (var7 == 0) {
                    class118.field1737[class85.field1248++] = var4;
                    var5.field4294 = class18.field234;
                    class241.field3853[class85.field1239++] = var4;
                } else if (var7 == 1) {
                    class118.field1737[class85.field1248++] = var4;
                    var5.field4294 = class18.field234;
                    int var11 = class164.field2597.method849(3, 38);
                    var5.method1903(false, var11, 71);
                    int var12 = class164.field2597.method849(1, arg0 ^ 0x27);
                    if (var12 == 1) {
                        class241.field3853[class85.field1239++] = var4;
                    }
                } else if (var7 == 2) {
                    class118.field1737[class85.field1248++] = var4;
                    var5.field4294 = class18.field234;
                    int var8 = class164.field2597.method849(3, arg0 ^ 0x27);
                    var5.method1903(true, var8, arg0 - 125);
                    int var9 = class164.field2597.method849(3, arg0 ^ 0x27);
                    var5.method1903(true, var9, -98);
                    int var10 = class164.field2597.method849(1, 38);
                    if (var10 == 1) {
                        class241.field3853[class85.field1239++] = var4;
                    }
                } else if (var7 == 3) {
                    class239.field3834[class65.field997++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Llb;IB)V", line = 834)
    private final void method2139(class112 arg0, int arg1, byte arg2) {
        field5175++;
        if (arg1 == 1) {
            this.field5169 = arg0.method792(2);
        } else if (arg1 == 2) {
            int var4 = arg0.method792(arg2 ^ 0x4D);
            this.field5162 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5162[var5] = arg0.method759((byte) -37);
            }
        } else if (arg1 == 3) {
            this.field5161 = true;
        } else if (arg1 == 40) {
            int var6 = arg0.method792(2);
            this.field5163 = new short[var6];
            this.field5170 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field5163[var7] = (short) arg0.method759((byte) -78);
                this.field5170[var7] = (short) arg0.method759((byte) -44);
            }
        } else if (arg1 == 41) {
            int var8 = arg0.method792(2);
            this.field5176 = new short[var8];
            this.field5172 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field5172[var9] = (short) arg0.method759((byte) -128);
                this.field5176[var9] = (short) arg0.method759((byte) -124);
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field5155[arg1 - 60] = arg0.method759((byte) -64);
        }
        if (arg2 != 79) {
            this.field5170 = (short[]) null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "(I)V", line = 913)
    public static final void method2140(int arg0) {
        field5178++;
        class165.field2608.method131(arg0 ^ 0xFFFFFFFD);
        class222.field3540.method131(-2);
        if (arg0 != 3) {
            method2127(57, 115, -85, 48, 0, 68);
        }
    }

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "(B)Z", line = 925)
    public final boolean method2141(byte arg0) {
        field5159++;
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field5155[var3] != -1 && !class35.field524.method471(0, this.field5155[var3], (byte) 125)) {
                var2 = false;
            }
        }
        if (arg0 >= -41) {
            method2127(-68, -19, -47, -66, -35, 56);
        }
        return var2;
    }
}
