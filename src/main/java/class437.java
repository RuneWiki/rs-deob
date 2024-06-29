import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class437 {

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "Lrp;")
    private class288 field6429 = new class288(16);

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "Llt;")
    private class458 field6438;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "Lke;")
    public static class407 field6439;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "[I")
    public static int[] field6440;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field6428;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field6430;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field6431;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field6432;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field6433;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field6435;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public static int field6436;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
    public static int field6437;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "Lo;")
    public static class24 field6434;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IBLlc;III)Lda;")
    public final class41 method2552(int arg0, byte arg1, class440 arg2, int arg3, int arg4, int arg5) {
        field6432++;
        class240[] var7 = null;
        if (arg1 < 26) {
            method2558(58);
        }
        class434 var8 = this.method2554(arg5, 29);
        if (var8.field6367 != null) {
            var7 = new class240[var8.field6367.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class482 var10 = arg2.method2567((byte) 119, var8.field6367[var9]);
                var7[var9] = new class240(var10.field7363, var10.field7356, var10.field7366, var10.field7361, var10.field7364, var10.field7359, var10.field7360, var10.field7353);
            }
        }
        return new class41(var8.field6369, var7, var8.field6366, arg3, arg4, arg0);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6428++;
        int var7 = class328.field4921;
        int[] var8 = class280.field4247;
        class319.field4797 = 0;
        for (int var9 = 0; var9 < (var7 + class352.field5175); var9++) {
            class245 var32 = null;
            class135 var33;
            if (var7 <= var9) {
                var33 = class195.field3085[field6440[var9 - var7]];
                var32 = ((class249) var33).field3819;
                if (var32.field3703 != null) {
                    var32 = var32.method1477(class273.field4144, arg6 - 12819);
                    if (var32 == null) {
                        continue;
                    }
                }
            } else {
                var33 = class224.field3450[var8[var9]];
            }
            if (var33.field2151 >= 0 && (class338.field5055 == var33.field2154 || class286.field4329.field3217 == var33.field3217)) {
                class179.method1122(arg1, arg6, arg4 >> 1, var33.method899((byte) 126), arg5 >> 1, arg0, var33);
                if (class161.field2529[0] >= 0) {
                    if (var33.field2203 != null && (var9 >= var7 || class341.field5095 == 0 || class341.field5095 == 3 || class341.field5095 == 1 && class347.method2117(arg6, ((class47) var33).field685)) && class319.field4797 < class212.field3302) {
                        class212.field3299[class319.field4797] = class512.field7764.method2349(var33.field2203, 0) / 2;
                        class212.field3295[class319.field4797] = class161.field2529[0];
                        class212.field3300[class319.field4797] = class161.field2529[1];
                        class212.field3301[class319.field4797] = var33.field2161;
                        class212.field3290[class319.field4797] = var33.field2223;
                        class212.field3298[class319.field4797] = var33.field2184;
                        class212.field3296[class319.field4797] = var33.field2203;
                        class319.field4797++;
                    }
                    int var34 = arg3 + class161.field2529[1];
                    int var45;
                    if (var33.field2177 || var33.field2217 <= class369.field5424) {
                        var45 = var34 - Math.max(class512.field7764.field5780, class383.field5570[0].method993());
                    } else {
                        boolean var35 = true;
                        byte var36 = 1;
                        int var37;
                        if (var9 >= var7) {
                            var37 = var32.field3745;
                            if (var37 == -1) {
                                var37 = var33.method892((byte) -110).field170;
                            }
                        } else {
                            class47 var38 = class224.field3450[var8[var9]];
                            var37 = var33.method892((byte) -110).field170;
                            if (var38.field688) {
                                var36 = 2;
                            }
                        }
                        class154[] var39 = class383.field5570;
                        if (var37 != -1) {
                            class154[] var40 = (class154[]) class145.field2351.method1752(0, (long) var37);
                            if (var40 == null) {
                                class351[] var41 = class351.method2137(class472.field7225, var37, 0);
                                if (var41 != null) {
                                    var40 = new class154[var41.length];
                                    for (int var42 = 0; var42 < var41.length; var42++) {
                                        var40[var42] = class345.field5116.method1952(var41[var42], true);
                                    }
                                    class145.field2351.method1758(1, var40, (long) var37);
                                }
                            }
                            if (var40 != null && var40.length >= 2) {
                                var39 = var40;
                            }
                        }
                        if (var36 >= var39.length) {
                            var36 = 1;
                        }
                        class154 var43 = var39[0];
                        class154 var44 = var39[var36];
                        var45 = var34 - Math.max(class512.field7764.field5780, var43.method993());
                        int var46 = arg2 + class161.field2529[0] - (var43.method1001() >> 1);
                        int var47 = var43.method1001() * var33.field2175 / 255;
                        if (var33.field2175 > 0 && var47 < 2) {
                            var47 = 2;
                        }
                        var43.method994(var46, var45);
                        class345.field5116.method1948(var46, var45, var46 + var47, var45 - -var43.method993());
                        var44.method994(var46, var45);
                        class345.field5116.method1982(arg2, arg3, arg2 + arg5, arg3 + arg4);
                    }
                    var45 -= 2;
                    if (!var33.field2177) {
                        if (class369.field5424 < var33.field2147) {
                            class154 var48 = class139.field2284[var33.field2209 ? 2 : 0];
                            class154 var49 = class139.field2284[var33.field2209 ? 3 : 1];
                            boolean var50 = true;
                            int var51;
                            if ((var33 instanceof class249)) {
                                var51 = var32.field3729;
                                if (var51 == -1) {
                                    var51 = var33.method892((byte) -110).field162;
                                }
                            } else {
                                var51 = var33.method892((byte) -110).field162;
                            }
                            if (var51 != -1) {
                                class154[] var52 = (class154[]) class255.field3889.method1752(0, (long) var51);
                                if (var52 == null) {
                                    class351[] var53 = class351.method2137(class472.field7225, var51, 0);
                                    if (var53 != null) {
                                        var52 = new class154[var53.length];
                                        for (int var54 = 0; var54 < var53.length; var54++) {
                                            var52[var54] = class345.field5116.method1952(var53[var54], true);
                                        }
                                        class255.field3889.method1758(1, var52, (long) var51);
                                    }
                                }
                                if (var52 != null && var52.length == 4) {
                                    var48 = var52[var33.field2209 ? 2 : 0];
                                    var49 = var52[var33.field2209 ? 3 : 1];
                                }
                            }
                            int var55 = var33.field2147 - class369.field5424;
                            int var56;
                            if (var55 <= var33.field2140) {
                                var56 = var48.method1001();
                            } else {
                                int var57 = var55 - var33.field2140;
                                int var58 = var33.field2183 == 0 ? 0 : (var33.field2171 - var57) / var33.field2183 * var33.field2183;
                                var56 = var58 * var48.method1001() / var33.field2171;
                            }
                            int var59 = var48.method993();
                            var45 -= var59;
                            int var60 = class161.field2529[0] + arg2 - (var48.method1001() >> 1);
                            var48.method994(var60, var45);
                            class345.field5116.method1948(var60, var45, var60 + var56, var45 + var59);
                            var49.method994(var60, var45);
                            class345.field5116.method1982(arg2, arg3, arg2 + arg5, arg3 + arg4);
                            var45 -= 2;
                        }
                        if (var7 > var9) {
                            class47 var62 = (class47) var33;
                            if (var62.field683 != -1) {
                                var45 -= 25;
                                class18.field244[var62.field683].method994(class161.field2529[0] + arg2 - 12, var45);
                                var45 -= 2;
                            }
                            if (var62.field707 != -1) {
                                var45 -= 25;
                                class189.field3022[var62.field707].method994(arg2 + class161.field2529[0] - 12, var45);
                                var45 -= 2;
                            }
                        } else if (var32.field3743 >= 0 && var32.field3743 < class189.field3022.length) {
                            var45 -= 25;
                            class154 var61 = class189.field3022[var32.field3743];
                            var61.method994(class161.field2529[0] + (arg2 - (var61.method1001() >> 1)), var45);
                            var45 -= 2;
                        }
                    }
                    int var10000;
                    if (!(var33 instanceof class47)) {
                        int var63 = 0;
                        class97[] var64 = class228.field3487;
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            class97 var67 = var64[var65];
                            if (var67 != null && var67.field1745 == 1 && field6440[var9 - var7] == var67.field1747) {
                                class154 var68 = class512.field7766[var67.field1755];
                                if (var68.method993() > var63) {
                                    var63 = var68.method993();
                                }
                                if (class369.field5424 % 20 < 10) {
                                    var68.method994(class161.field2529[0] + arg2 - 12, var45 - var68.method993());
                                }
                            }
                        }
                        if (var63 > 0) {
                            var10000 = var45 - (var63 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var69 = 0;
                        class97[] var70 = class228.field3487;
                        for (int var71 = 0; var71 < var70.length; var71++) {
                            class97 var73 = var70[var71];
                            if (var73 != null && var73.field1745 == 10 && var8[var9] == var73.field1747) {
                                class154 var74 = class512.field7766[var73.field1755];
                                if (var74.method993() > var69) {
                                    var69 = var74.method993();
                                }
                                var74.method994(arg2 + class161.field2529[0] - 12, -var74.method993() + var45);
                            }
                        }
                        if (var69 > 0) {
                            var10000 = var45 - (var69 + 2);
                        }
                    }
                    for (int var75 = 0; var75 < 4; var75++) {
                        if (class369.field5424 < var33.field2159[var75]) {
                            int var76 = var33.method899((byte) 119) / 2;
                            class179.method1122(arg1, 0, arg4 >> 1, var76, arg5 >> 1, arg0, var33);
                            if (class161.field2529[0] > -1) {
                                if (var75 == 1) {
                                    class161.field2529[1] -= 20;
                                }
                                if (var75 == 2) {
                                    class161.field2529[1] -= 10;
                                    class161.field2529[0] -= 15;
                                }
                                if (var75 == 3) {
                                    class161.field2529[0] += 15;
                                    class161.field2529[1] -= 10;
                                }
                                class383.field5578[var33.field2173[var75]].method994(class161.field2529[0] + arg2 - 12, class161.field2529[1] + arg3 + -12);
                                class266.field4026.method2933(arg2 - (1 - class161.field2529[0]), arg3 - (-class161.field2529[1] - 3), -1, 0, 11252, Integer.toString(var33.field2190[var75]));
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < class116.field1960; var10++) {
            int var28 = class6.field76[var10];
            class135 var29;
            if (var28 < 2048) {
                var29 = class224.field3450[var28];
            } else {
                var29 = class195.field3085[var28 - 2048];
            }
            int var30 = class146.field2366[var10];
            class135 var31;
            if (var30 >= 2048) {
                var31 = class195.field3085[var30 - 2048];
            } else {
                var31 = class224.field3450[var30];
            }
            class233.method1398(arg3, var29, arg1, arg0, var31, arg4, arg2, --var29.field2145, arg5, (byte) 93);
        }
        int var11 = class512.field7764.field5780 + class512.field7764.field5779 + 2;
        for (int var12 = arg6; var12 < class319.field4797; var12++) {
            int var13 = class212.field3295[var12];
            int var14 = class212.field3300[var12];
            int var15 = class212.field3299[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var27 = 0; var27 < var12; var27++) {
                    if ((var14 + 2) > (class212.field3300[var27] - var11) && class212.field3300[var27] + 2 > -var11 + var14 && (class212.field3295[var27] + class212.field3299[var27]) > (var13 - var15) && var13 + var15 > class212.field3295[var27] - class212.field3299[var27] && var14 > class212.field3300[var27] - var11) {
                        var16 = true;
                        var14 = class212.field3300[var27] - var11;
                    }
                }
            }
            class212.field3300[var12] = var14;
            String var17 = class212.field3296[var12];
            if (class252.field3851 == 0) {
                int var18 = 16776960;
                if (class212.field3301[var12] < 6) {
                    var18 = class221.field3418[class212.field3301[var12]];
                }
                if (class212.field3301[var12] == 6) {
                    var18 = class338.field5055 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class212.field3301[var12] == 7) {
                    var18 = class338.field5055 % 20 >= 10 ? 65535 : 255;
                }
                if (class212.field3301[var12] == 8) {
                    var18 = (class338.field5055 % 20) >= 10 ? 8454016 : 45056;
                }
                if (class212.field3301[var12] == 9) {
                    int var19 = 150 - class212.field3298[var12];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - ((var19 - 50) * 327680);
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (class212.field3301[var12] == 10) {
                    int var20 = 150 - class212.field3298[var12];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16384000 - (var20 * 327680 - 16711935);
                    } else if (var20 < 150) {
                        var18 = 255 - (((var20 - 100) * 5) + 32768000 - (var20 * 327680));
                    }
                }
                if (class212.field3301[var12] == 11) {
                    int var21 = 150 - class212.field3298[var12];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 + 32768000 - (var21 * 327680);
                    }
                }
                int var22 = var18 | 0xFF000000;
                if (class212.field3290[var12] == 0) {
                    class493.field7514.method2933(arg2 + var13, arg3 + var14, var22, -16777216, arg6 + 11252, var17);
                }
                if (class212.field3290[var12] == 1) {
                    class493.field7514.method2928((byte) 54, var22, arg3 + var14, arg2 + var13, -16777216, class338.field5055, var17);
                }
                if (class212.field3290[var12] == 2) {
                    class493.field7514.method2944(var17, class338.field5055, -16777216, 15066, var22, arg2 + var13, arg3 + var14);
                }
                if (class212.field3290[var12] == 3) {
                    class493.field7514.method2945(var22, var17, -16777216, class338.field5055, arg2 + var13, arg3 + var14, arg6 - 126, -class212.field3298[var12] + 150);
                }
                if (class212.field3290[var12] == 4) {
                    int var23 = (150 - class212.field3298[var12]) * (class512.field7764.method2349(var17, arg6) + 100) / 150;
                    class345.field5116.method1948(arg2 + var13 - 50, arg3, arg2 + var13 + 50, arg3 - -arg4);
                    class493.field7514.method2938(var22, arg3 + var14, var13 + 50 + -var23 + arg2, 32768, var17, -16777216);
                    class345.field5116.method1982(arg2, arg3, arg2 + arg5, arg3 - -arg4);
                }
                if (class212.field3290[var12] == 5) {
                    int var24 = 150 - class212.field3298[var12];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    int var26 = class512.field7764.field5780 + class512.field7764.field5779;
                    class345.field5116.method1948(arg2, arg3 + var14 - var26 - 1, arg2 - -arg5, arg3 + var14 + 5);
                    class493.field7514.method2933(arg2 + var13, arg3 + var14 + var25, var22, -16777216, 11252, var17);
                    class345.field5116.method1982(arg2, arg3, arg2 + arg5, arg3 - -arg4);
                }
            } else {
                class493.field7514.method2933(arg2 + var13, arg3 + var14, -256, -16777216, 11252, var17);
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)Lav;")
    private final class434 method2554(int arg0, int arg1) {
        field6433++;
        class288 var3 = this.field6429;
        class434 var4;
        synchronized (this.field6429) {
            var4 = (class434) this.field6429.method1752(arg1 ^ 0x1D, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field6438.method2715(arg0, arg1, false);
        class434 var6 = new class434();
        if (var5 != null) {
            var6.method2538(new class40(var5), (byte) -34);
        }
        class288 var7 = this.field6429;
        synchronized (this.field6429) {
            this.field6429.method1758(arg1 - 28, var6, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
    public final void method2555(int arg0) {
        field6431++;
        if (arg0 == -1) {
            class288 var2 = this.field6429;
            synchronized (this.field6429) {
                this.field6429.method1749((byte) -113);
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method2556(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field6436++;
        int var6 = 0;
        int var7 = arg3;
        int var8 = arg0 * arg0;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg3 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        if (!arg5) {
            method2553(29, -62, -18, 11, 113, -3, -97);
        }
        int var18 = ((arg3 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        class78.method566(class69.field1212[arg4], arg0 + arg1, arg2, -7, arg1 - arg0);
        int var20 = (arg3 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var17 += var16;
                    var6++;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var6++;
                var19 += var16;
                var17 += var16;
            }
            var13 += -var20;
            var14 += -var18;
            var20 -= var15;
            var18 -= var15;
            var7--;
            int var21 = arg4 - var7;
            int var22 = arg4 + var7;
            int var23 = arg1 + var6;
            int var24 = arg1 - var6;
            class78.method566(class69.field1212[var21], var23, arg2, -7, var24);
            class78.method566(class69.field1212[var22], var23, arg2, -7, var24);
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
    public final void method2557(int arg0) {
        if (arg0 != -3612) {
            method2553(3, -128, -90, -125, 113, -50, -19);
        }
        class288 var2 = this.field6429;
        synchronized (this.field6429) {
            this.field6429.method1761(-109);
        }
        field6430++;
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)V")
    public static void method2558(int arg0) {
        field6434 = null;
        if (arg0 != 20201) {
            method2558(50);
        }
        field6439 = null;
        field6440 = null;
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lcm;ILlt;)V")
    public class437(class491 arg0, int arg1, class458 arg2) {
        this.field6438 = arg2;
        this.field6438.method2726((byte) 113, 29);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)V")
    public final void method2559(int arg0, byte arg1) {
        class288 var3 = this.field6429;
        synchronized (this.field6429) {
            this.field6429.method1760(arg0, 30398);
        }
        field6435++;
        if (arg1 != -41) {
            this.method2559(-55, (byte) 83);
        }
    }

    static {
        new class423("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
        field6439 = new class407(512);
        field6440 = new int[1024];
    }
}
