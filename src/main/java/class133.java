import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class133 {

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "Lad;")
    private class122 field2253 = new class122();

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "Lwh;")
    private class9 field2259 = new class9();

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
    private int field2262;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "I")
    private int field2260;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "Lo;")
    private class199 field2257;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "Lqd;")
    public static class40 field2252 = class147.method1106("blaugr-Un:", (byte) -86);

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "Lqd;")
    public static class40 field2263 = class147.method1106("0", (byte) -50);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V", line = 11)
    public static void method978(byte arg0) {
        field2252 = null;
        if (arg0 != -31) {
            method978((byte) 117);
        }
        field2263 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)V", line = 26)
    public static final void method979(int arg0, int arg1) {
        if (arg1 >= -95) {
            field2263 = (class40) null;
        }
        class263.field4394.method1348(0, arg0);
        class209.field3340.method1348(0, arg0);
        field2256++;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(B)V", line = 55)
    public static final void method980(byte arg0) {
        field2250++;
        for (class255 var1 = (class255) class101.field1774.method1971(100); var1 != null; var1 = (class255) class101.field1774.method1967(100)) {
            if (var1.field4232) {
                var1.method1794(false);
            }
        }
        for (class255 var2 = (class255) class253.field4194.method1971(100); var2 != null; var2 = (class255) class253.field4194.method1967(100)) {
            if (var2.field4232) {
                var2.method1794(false);
            }
        }
        int var3 = 70 / ((arg0 - 24) / 46);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)Lcj;", line = 87)
    public final class307 method981(int arg0) {
        if (arg0 != 0) {
            field2263 = (class40) null;
        }
        field2249++;
        return this.field2257.method1400(~arg0);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lad;JB)V", line = 99)
    public final void method982(class122 arg0, long arg1, byte arg2) {
        field2258++;
        if (arg2 != 79) {
            this.method982((class122) null, 115L, (byte) -118);
        }
        if (this.field2260 == 0) {
            class122 var5 = this.field2259.method48(1);
            var5.method2095(0);
            var5.method921(arg2 ^ 0x4D);
            if (this.field2253 == var5) {
                class122 var6 = this.field2259.method48(arg2 - 78);
                var6.method2095(0);
                var6.method921(2);
            }
        } else {
            this.field2260--;
        }
        this.field2257.method1396(-19928, arg1, arg0);
        this.field2259.method55(arg0, 119);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)V", line = 135)
    public static final void method983(int arg0, int arg1, int arg2) {
        class314 var3 = class292.method2009(arg1, -93);
        field2248++;
        if (arg0 != 22805) {
            field2263 = (class40) null;
        }
        int var4 = var3.field5312;
        int var5 = var3.field5297;
        int var6 = var3.field5300;
        int var7 = class294.field4938[var6 - var5];
        if (arg2 < 0 || var7 < arg2) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        class274.method1907(var4, arg0 - 22804, class243.field4015[var4] & ~var8 | arg2 << var5 & var8);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IJ)Lad;", line = 162)
    public final class122 method984(int arg0, long arg1) {
        field2261++;
        class122 var4 = (class122) this.field2257.method1405((byte) 115, arg1);
        if (var4 != null) {
            this.field2259.method55(var4, 113);
        }
        if (arg0 != 0) {
            method979(-16, 41);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V", line = 186)
    public final void method985(int arg0) {
        field2254++;
        int var2 = 21 / ((14 - arg0) / 38);
        this.field2259.method56((byte) 97);
        this.field2257.method1399((byte) 126);
        this.field2253 = new class122();
        this.field2260 = this.field2262;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILsd;)V", line = 199)
    public static final void method986(int arg0, class26 arg1) {
        field2264++;
        int var2 = class314.field5306 >> 1;
        int var3 = class277.field4671 >> 2 << 10;
        byte[][] var4 = new byte[class233.field3840][class268.field4462];
        while (arg1.field472.length > arg1.field478) {
            boolean var5 = false;
            int var6 = 0;
            int var7 = 0;
            if (arg1.method226(255) == 1) {
                var5 = true;
                var7 = arg1.method226(255);
                var6 = arg1.method226(255);
            }
            int var8 = arg1.method226(255);
            int var9 = arg1.method226(255);
            int var10 = class272.field4524 + class268.field4462 - (var9 * 64) - 1;
            int var11 = var8 * 64 - class91.field1662;
            if (var11 >= 0 && (var10 - 63) >= 0 && class233.field3840 > var11 + 63 && class268.field4462 > var10) {
                for (int var12 = 0; var12 < 64; var12++) {
                    byte[] var13 = var4[var11 + var12];
                    for (int var14 = 0; var14 < 64; var14++) {
                        if (!var5 || var7 * 8 <= var12 && (var7 * 8 + 8) > var12 && var6 * 8 <= var14 && var6 * 8 + 8 > var14) {
                            var13[var10 - var14] = arg1.method234(2193);
                        }
                    }
                }
            } else if (var5) {
                arg1.field478 += 64;
            } else {
                arg1.field478 += 4096;
            }
        }
        int var15 = class268.field4462;
        int var16 = class233.field3840;
        int[] var17 = new int[var15];
        int[] var18 = new int[var15];
        int[] var19 = new int[var15];
        int[] var20 = new int[var15];
        int[] var21 = new int[var15];
        if (arg0 >= -35) {
            method986(-56, (class26) null);
        }
        for (int var22 = -5; var22 < var16; var22++) {
            for (int var23 = 0; var23 < var15; var23++) {
                int var24 = var22 + 5;
                int var10002;
                if (var24 < var16) {
                    int var25 = var4[var24][var23] & 0xFF;
                    if (var25 > 0) {
                        class308 var26 = class25.method183(-14949, var25 - 1);
                        var17[var23] += var26.field5178;
                        var18[var23] += var26.field5173;
                        var19[var23] += var26.field5176;
                        var21[var23] += var26.field5168;
                        var10002 = var20[var23]++;
                    }
                }
                int var27 = var22 - 5;
                if (var27 >= 0) {
                    int var28 = var4[var27][var23] & 0xFF;
                    if (var28 > 0) {
                        class308 var29 = class25.method183(-14949, var28 - 1);
                        var17[var23] -= var29.field5178;
                        var18[var23] -= var29.field5173;
                        var19[var23] -= var29.field5176;
                        var21[var23] -= var29.field5168;
                        var10002 = var20[var23]--;
                    }
                }
            }
            if (var22 >= 0) {
                int var30 = 0;
                int var31 = 0;
                int[][] var32 = class86.field1495[var22 >> 6];
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = -5; var36 < var15; var36++) {
                    int var37 = var36 + 5;
                    if (var15 > var37) {
                        var34 += var20[var37];
                        var35 += var21[var37];
                        var31 += var18[var37];
                        var30 += var17[var37];
                        var33 += var19[var37];
                    }
                    int var38 = var36 - 5;
                    if (var38 >= 0) {
                        var35 -= var21[var38];
                        var33 -= var19[var38];
                        var30 -= var17[var38];
                        var34 -= var20[var38];
                        var31 -= var18[var38];
                    }
                    if (var36 >= 0 && var34 > 0) {
                        int[] var39 = var32[var36 >> 6];
                        int var40 = var35 == 0 ? 0 : class275.method1912((byte) 94, var33 / var34, var31 / var34, var30 * 256 / var35);
                        if (var4[var22][var36] != 0) {
                            if (var39 == null) {
                                var39 = var32[var36 >> 6] = new int[4096];
                            }
                            int var41 = (var40 & 0x7F) + var2;
                            if (var41 < 0) {
                                var41 = 0;
                            } else if (var41 > 127) {
                                var41 = 127;
                            }
                            int var42 = (var3 + var40 & 0xFC00) + var41 + (var40 & 0x380);
                            var39[class276.method1923(var22, 63) + class276.method1923(var36 << 6, 4032)] = class203.field3212[class63.method517(96, var42, -110880281)];
                        } else if (var39 != null) {
                            var39[class276.method1923(63, var22) + class276.method1923(var36 << 6, 4032)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILke;)V", line = 436)
    public static final void method987(int arg0, class107 arg1) {
        class162.field2692 = 3;
        class191 var2 = null;
        field2255++;
        class129.method963(false, true);
        class194.field3131 = true;
        class223.field3704 = true;
        class90.field1636 = 255;
        class81.field1429 = true;
        class1.field8 = true;
        class159.field2665 = 0;
        class104.field1847 = true;
        class217.field3623 = true;
        class213.field3497 = 0;
        class142.field2387 = true;
        class204.field3230 = 0;
        class33.field669 = false;
        class105.field1854 = 127;
        class296.field4952 = 0;
        class104.field1848 = 0;
        class178.field2929 = true;
        class206.field3287 = true;
        class94.field1698 = 127;
        class182.field2961 = 0;
        class285.field4804 = 2;
        class96.field1728 = true;
        class250.field4144 = true;
        try {
            if (arg0 != -22904) {
                field2263 = (class40) null;
            }
            class70 var3 = arg1.method817("runescape", -7930);
            while (var3.field1258 == 0) {
                class160.method1227(1L, false);
            }
            if (var3.field1258 == 1) {
                var2 = (class191) var3.field1260;
                byte[] var4 = new byte[(int) var2.method1372(true)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method1371(var5, arg0 + 22905, var4.length + -var5, var4);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class42.method387((byte) -121, new class26(var4));
            }
        } catch (Exception var10) {
        }
        try {
            if (var2 != null) {
                var2.method1376(arg0 + 22903);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(I)V", line = 539)
    public class133(int arg0) {
        this.field2262 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2260 = arg0;
        this.field2257 = new class199(var2);
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(B)Lcj;", line = 516)
    public final class307 method988(byte arg0) {
        if (arg0 > -105) {
            method980((byte) 23);
        }
        field2251++;
        return this.field2257.method1403(111);
    }
}
