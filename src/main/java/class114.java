import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class114 {

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "[I")
    private int[] field1947;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "[I")
    private int[] field1946;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "Lph;")
    public static class229 field1930 = class266.method1858("weiss:", 0);

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
    public static int field1941 = -1;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field1934 = 0;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "[Lce;")
    public static class209[] field1931 = new class209[2048];

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    private int field1936;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    private int field1937;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
    private int field1942;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
    private int field1944;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "[I")
    public static int[] field1938;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZI)I", line = 14)
    public static final int method862(int arg0, boolean arg1, int arg2) {
        field1929++;
        if (arg1) {
            return 4;
        }
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg2 >>= 0x1;
            arg0 *= arg0;
        }
        if (arg2 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V", line = 41)
    private final void method863(boolean arg0) {
        if (arg0) {
            return;
        }
        field1935++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var11 = var9 ^ var8 << 11;
            int var12 = var6 + var11;
            int var13 = var7 + var8;
            int var14 = var13 ^ var7 >>> 2;
            int var15 = var7 + var12;
            int var16 = var5 + var14;
            int var17 = var15 ^ var12 << 8;
            int var18 = var12 + var16;
            var6 = var18 ^ var16 >>> 16;
            int var19 = var3 + var6;
            int var20 = var4 + var17;
            int var21 = var16 + var20;
            var5 = var21 ^ var20 << 10;
            int var22 = var2 + var5;
            int var23 = var19 + var20;
            var4 = var23 ^ var19 >>> 4;
            int var24 = var19 + var22;
            var3 = var24 ^ var22 << 8;
            int var25 = var4 + var11;
            var8 = var3 + var14;
            int var26 = var22 + var25;
            var2 = var26 ^ var25 >>> 9;
            var9 = var8 + var25;
            var7 = var2 + var17;
        }
        for (int var27 = 0; var27 < 256; var27 += 8) {
            int var28 = this.field1946[var27 + 6] + var3;
            int var29 = this.field1946[var27 + 2] + var7;
            int var30 = this.field1946[var27 + 5] + var4;
            int var31 = this.field1946[var27 + 7] + var2;
            int var32 = this.field1946[var27] + var9;
            int var33 = this.field1946[var27 + 3] + var6;
            int var34 = this.field1946[var27 + 4] + var5;
            int var35 = this.field1946[var27 + 1] + var8;
            int var36 = var32 ^ var35 << 11;
            int var37 = var33 + var36;
            int var38 = var29 + var35;
            int var39 = var38 ^ var29 >>> 2;
            int var40 = var29 + var37;
            int var41 = var40 ^ var37 << 8;
            int var42 = var34 + var39;
            int var43 = var37 + var42;
            int var44 = var30 + var41;
            var6 = var43 ^ var42 >>> 16;
            int var45 = var6 + var28;
            int var46 = var42 + var44;
            var5 = var46 ^ var44 << 10;
            int var47 = var44 + var45;
            int var48 = var5 + var31;
            var4 = var47 ^ var45 >>> 4;
            int var49 = var45 + var48;
            var3 = var49 ^ var48 << 8;
            var8 = var3 + var39;
            int var50 = var4 + var36;
            int var51 = var48 + var50;
            var2 = var51 ^ var50 >>> 9;
            var7 = var2 + var41;
            var9 = var8 + var50;
            this.field1947[var27] = var9;
            this.field1947[var27 + 1] = var8;
            this.field1947[var27 + 2] = var7;
            this.field1947[var27 + 3] = var6;
            this.field1947[var27 + 4] = var5;
            this.field1947[var27 + 5] = var4;
            this.field1947[var27 + 6] = var3;
            this.field1947[var27 + 7] = var2;
        }
        for (int var52 = 0; var52 < 256; var52 += 8) {
            int var53 = this.field1947[var52 + 4] + var5;
            int var54 = this.field1947[var52] + var9;
            int var55 = this.field1947[var52 + 1] + var8;
            int var56 = this.field1947[var52 + 6] + var3;
            int var57 = this.field1947[var52 + 7] + var2;
            int var58 = var54 ^ var55 << 11;
            int var59 = this.field1947[var52 + 5] + var4;
            int var60 = this.field1947[var52 + 3] + var6;
            int var61 = this.field1947[var52 + 2] + var7;
            int var62 = var58 + var60;
            int var63 = var55 + var61;
            int var64 = var63 ^ var61 >>> 2;
            int var65 = var53 + var64;
            int var66 = var61 + var62;
            int var67 = var66 ^ var62 << 8;
            int var68 = var62 + var65;
            var6 = var68 ^ var65 >>> 16;
            int var69 = var59 + var67;
            int var70 = var6 + var56;
            int var71 = var65 + var69;
            var5 = var71 ^ var69 << 10;
            int var72 = var5 + var57;
            int var73 = var69 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var4 + var58;
            int var75 = var70 + var72;
            var3 = var75 ^ var72 << 8;
            var8 = var3 + var64;
            int var76 = var72 + var74;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var74;
            this.field1947[var52] = var9;
            this.field1947[var52 + 1] = var8;
            this.field1947[var52 + 2] = var7;
            this.field1947[var52 + 3] = var6;
            this.field1947[var52 + 4] = var5;
            this.field1947[var52 + 5] = var4;
            this.field1947[var52 + 6] = var3;
            this.field1947[var52 + 7] = var2;
        }
        this.method870(1);
        this.field1944 = 256;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(Z)V", line = 199)
    public static final void method864(boolean arg0) {
        class141.field2278 = class326.field5573;
        class68.field1081 = class70.field1179;
        class22.field295 = class50.field722;
        class134.field2183 = class167.field2741;
        class311.field5217 = class142.field2293;
        class220.field3612 = class97.field1629;
        class44.field683 = class268.field4496;
        class222.field3662 = class17.field239;
        class275.field4591 = class139.field2242;
        class108.field1839 = class29.field478;
        class208.field3426 = class323.field5502;
        class63.field967 = class311.field5225;
        class85.field1466 = class154.field2508;
        class94.field1585 = class70.field1164;
        class72.field1228 = class18.field247;
        class331.field5638 = class57.field803;
        class324.field5542 = class84.field1449;
        class249.field4144 = class280.field4627;
        class76.field1272 = class76.field1273;
        class4.field46 = class296.field4834;
        class239.field3942 = class187.field3050;
        class185.field3005 = class58.field823;
        if (arg0) {
            field1931 = (class209[]) null;
        }
        class107.field1816 = class65.field1002;
        class105.field1785 = class54.field784;
        class100.field1709 = class224.field3677;
        client.field5417 = class121.field2039;
        field1939++;
        class95.field1609 = class226.field3708;
        class207.field3418 = class314.field5340;
        class329.field5613 = class294.field4822;
        class203.field3353 = class190.field3096;
        class29.field472 = class126.field2103;
        class10.field120 = class201.field3325;
        class139.field2244 = class167.field2730;
        class126.field2101 = class40.field639;
        class218.field3583 = class229.field3765;
        class296.field4835 = class249.field4141;
        class94.field1591 = class103.field1756;
        class250.field4162 = class263.field4400;
        class65.field989 = class307.field5183;
        class260.field4347 = class282.field4687;
        class29.field476 = class126.field2103;
        class236.field3889 = class279.field4620;
        class302.field5051 = class316.field5365;
        class285.field4706 = class60.field861;
        class254.field4244 = class15.field184;
        class184.field2987 = class331.field5630;
        class54.field783 = class214.field3538;
        class295.field4824 = class200.field3311;
        class126.field2108 = class262.field4385;
        class135.field2188 = class156.field2530;
        class118.field1990 = class131.field2139;
        class132.field2151 = class175.field2878;
        class188.field3054 = class203.field3352;
        class141.field2279 = class328.field5581;
        class39.field618 = class44.field674;
        class51.field733 = class313.field5283;
        class280.field4644 = class294.field4804;
        class142.field2308 = class146.field2365;
        class211.field3494 = class228.field3741;
        class313.field5271 = class241.field3986;
        class221.field3634 = class293.field4787;
        class315.field5360 = class285.field4703;
        class168.field2778 = class195.field3272;
        class72.field1237 = class164.field2691;
        class196.field3277 = class251.field4172;
        class308.field5191 = class93.field1571;
        class105.field1789 = class78.field1298;
        class312.field5257 = class315.field5356;
        class187.field3051 = class307.field5188;
        class167.field2718 = class135.field2198;
        class78.field1303 = class116.field1961;
        class108.field1842 = class82.field1337;
        class186.field3032 = class6.field78;
        class16.field195 = class252.field4217;
        class97.field1630 = client.field5420;
        class325.field5555 = class259.field4324;
        class66.field1041 = class111.field1891;
        class85.field1456 = class154.field2508;
        class25.field334 = class107.field1810;
        class282.field4677 = class251.field4174;
        class66.field1033 = class236.field3892;
        class143.field2321 = class296.field4833;
        class160.field2591 = class191.field3133;
        class329.field5604 = class294.field4822;
        class328.field5586 = class249.field4136;
        class175.field2869 = class215.field3546;
        class138.field2233 = class103.field1751;
        class254.field4245 = class82.field1365;
        class18.field251 = class82.field1366;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(Z)I", line = 530)
    public final int method865(boolean arg0) {
        if (arg0) {
            field1941 = 53;
        }
        if (this.field1944-- == 0) {
            this.method870(1);
            this.field1944 = 255;
        }
        field1932++;
        return this.field1946[this.field1944];
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(Z)V", line = 548)
    public static final void method866(boolean arg0) {
        field1940++;
        int var1 = class178.field2930.length;
        if (arg0) {
            return;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            if (class178.field2930[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class6.field71; var4++) {
                    if (class287.field4723[var2] == class238.field3934[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class238.field3934[class6.field71] = class287.field4723[var2];
                    var3 = class6.field71++;
                }
                class164 var5 = new class164(class178.field2930[var2]);
                int var6 = 0;
                while (class178.field2930[var2].length > var5.field2670 && var6 < 511) {
                    int var7 = var5.method1161(true);
                    int var8 = var7 >> 14;
                    int var9 = (var7 & 0x1FE6) >> 7;
                    int var10 = var3 | var6++ << 6;
                    int var11 = (class287.field4723[var2] >> 8) * 64 + var9 - class1.field9;
                    int var12 = var7 & 0x3F;
                    int var13 = (class287.field4723[var2] & 0xFF) * 64 + var12 - class1.field1;
                    class313 var14 = class25.method155(var5.method1161(true), -28);
                    if (class187.field3035[var10] == null && (var14.field5323 & 0x1) > 0 && class102.field1742 == var8 && var11 >= 0 && var11 + var14.field5304 < 104 && var13 >= 0 && (var14.field5304 + var13) < 104) {
                        class187.field3035[var10] = new class217();
                        class217 var15 = class187.field3035[var10];
                        class162.field2620[class253.field4233++] = var10;
                        var15.field5162 = class319.field5393;
                        var15.method1523((byte) 109, var14);
                        var15.method2058((byte) -90, var15.field3559.field5304);
                        var15.field5163 = var15.field5122 = class299.field4858[var15.field3559.field5294];
                        var15.field5142 = var15.field3559.field5288;
                        var15.field5161 = var15.field3559.field5319;
                        var15.field5114 = var15.field3559.field5276;
                        var15.field5160 = var15.field3559.field5302;
                        var15.field5153 = var15.field3559.field5292;
                        var15.field5146 = var15.field3559.field5317;
                        var15.field5131 = var15.field3559.field5289;
                        var15.field5108 = var15.field3559.field5312;
                        if (var15.field5108 == 0) {
                            var15.field5122 = 0;
                        }
                        var15.method2066(var11, var13, var15.method1457(0), (byte) 122, true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIII)V", line = 648)
    public static final void method867(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class119.field2001 < 100) {
            class173.method1251(false);
        }
        if (class99.field1675) {
            class212.method1502(arg1, arg2, arg0 + arg1, arg2 + arg4);
        } else {
            class210.method1472(arg1, arg2, arg1 + arg0, arg2 + arg4);
        }
        field1943++;
        if (class119.field2001 < 100) {
            byte var15 = 20;
            int var16 = arg0 / 2 + arg1;
            int var17 = arg4 / 2 + arg2 - var15 - 18;
            if (class99.field1675) {
                class212.method1494(arg1, arg2, arg0, arg4, 0);
                class212.method1501(var16 - 152, var17, 304, 34, 9179409);
                class212.method1501(var16 - 151, var17 + 1, 302, 32, 0);
                class212.method1494(var16 - 150, var17 + 2, class119.field2001 * 3, 30, 9179409);
                class212.method1494((class119.field2001 * 3) + var16 - 150, var17 + 2, 300 - class119.field2001 * 3, 30, 0);
            } else {
                class210.method1465(arg1, arg2, arg0, arg4, 0);
                class210.method1463(var16 - 152, var17, 304, 34, 9179409);
                class210.method1463(var16 - 151, var17 - -1, 302, 32, 0);
                class210.method1465(var16 - 150, var17 - -2, class119.field2001 * 3, 30, 9179409);
                class210.method1465(var16 + (class119.field2001 * 3) - 150, var17 + 2, 300 - (class119.field2001 * 3), 30, 0);
            }
            class213.field3517.method261(class72.field1237, var16, var17 + var15, 16777215, -1);
            return;
        }
        class230.field3824 = class324.field5534 - ((int) ((float) arg4 / class95.field1604));
        class221.field3624 = (int) ((float) (arg4 * 2) / class95.field1604);
        class280.field4641 = class103.field1767 - ((int) ((float) arg0 / class95.field1604));
        int var5 = (int) ((float) arg0 / class95.field1604) + class103.field1767;
        class320.field5401 = (int) ((float) (arg0 * 2) / class95.field1604);
        int var6 = class324.field5534 - ((int) ((float) arg4 / class95.field1604));
        int var7 = (int) ((float) arg4 / class95.field1604) + class324.field5534;
        int var8 = -89 / ((-arg3 - 39) / 59);
        int var9 = class103.field1767 - ((int) ((float) arg0 / class95.field1604));
        if (class99.field1675) {
            if (class119.field1999 == null || class119.field1999.field4785 != arg0 || class119.field1999.field4786 != arg4) {
                class119.field1999 = null;
                class119.field1999 = new class267(arg0, arg4);
            }
            class210.method1481(class119.field1999.field5579, arg0, arg4);
            class269.method1872(var5, (byte) -20, 0, 0, arg4, var7, var6, var9, arg0);
            class221.method1538(var9, 0, arg0, var7, var5, -52, arg4, 0, var6);
            class186.method1311(arg0, true, var7, var6, 0, var5, arg4, 0, var9);
            class119.field1999.method647(arg1, arg2);
        } else {
            class269.method1872(var5, (byte) -119, arg2, arg1, arg2 + arg4, var7, var6, var9, arg0 + arg1);
            class221.method1538(var9, arg2, arg0 + arg1, var7, var5, -34, arg2 + arg4, arg1, var6);
            class186.method1311(arg0 + arg1, true, var7, var6, arg1, var5, arg2 + arg4, arg2, var9);
        }
        if (class214.field3527 > 0) {
            class214.field3527--;
        }
        if (!class54.field785) {
            return;
        }
        int var10 = arg0 + arg1 - 5;
        int var11 = arg2 + arg4 - 8;
        class237.field3905.method250(class248.method1746(8528, new class229[] { class215.field3549, class50.method354(0, class16.field189) }), var10, var11, 16776960, -1);
        int var18 = var11 - 15;
        Runtime var12 = Runtime.getRuntime();
        int var13 = (int) ((var12.totalMemory() - var12.freeMemory()) / 1024L);
        int var14 = 16776960;
        if (var13 > 65536) {
            var14 = 16711680;
        }
        class237.field3905.method250(class248.method1746(8528, new class229[] { class65.field996, class50.method354(0, var13), class323.field5504 }), var10, var18, var14, -1);
        var11 = var18 - 15;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V", line = 763)
    public static void method868(int arg0) {
        if (arg0 != -1817) {
            method869(-77, -2);
        }
        field1930 = null;
        field1931 = null;
        field1938 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)Z", line = 779)
    public static final boolean method869(int arg0, int arg1) {
        field1933++;
        if (arg0 >= -11) {
            method864(false);
        }
        return (-arg1 & arg1) == arg1;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V", line = 803)
    private final void method870(int arg0) {
        this.field1942 += ++this.field1936;
        field1945++;
        if (arg0 != 1) {
            field1930 = (class229) null;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field1947[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1937 ^= this.field1937 << 13;
                } else {
                    this.field1937 ^= this.field1937 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1937 ^= this.field1937 << 2;
            } else {
                this.field1937 ^= this.field1937 >>> 16;
            }
            this.field1937 += this.field1947[var2 + 128 & 0xFF];
            int var4;
            this.field1947[var2] = var4 = this.field1942 + (this.field1947[class243.method1696(255, var3 >> 2)] + this.field1937);
            this.field1946[var2] = this.field1942 = var3 + this.field1947[class243.method1696(var4 >> 8 >> 2, 255)];
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V", line = 842)
    private class114() {
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "([I)V", line = 847)
    public class114(int[] arg0) {
        this.field1947 = new int[256];
        this.field1946 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1946[var2] = arg0[var2];
        }
        this.method863(false);
    }
}
