import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class435 {

    @OriginalMember(owner = "client!sp", name = "h", descriptor = "Lig;")
    private class15 field6339 = new class15();

    @OriginalMember(owner = "client!sp", name = "m", descriptor = "Lig;")
    private class15 field6344 = new class15();

    @OriginalMember(owner = "client!sp", name = "u", descriptor = "Lig;")
    private class15 field6352 = new class15();

    @OriginalMember(owner = "client!sp", name = "w", descriptor = "Lig;")
    private class15 field6354 = new class15();

    @OriginalMember(owner = "client!sp", name = "y", descriptor = "Lat;")
    private class256 field6356 = new class256(4);

    @OriginalMember(owner = "client!sp", name = "E", descriptor = "B")
    private byte field6362 = 0;

    @OriginalMember(owner = "client!sp", name = "F", descriptor = "I")
    public volatile int field6363 = 0;

    @OriginalMember(owner = "client!sp", name = "D", descriptor = "I")
    public volatile int field6361 = 0;

    @OriginalMember(owner = "client!sp", name = "C", descriptor = "Lat;")
    private class256 field6360 = new class256(8);

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "Lvq;")
    public static class24 field6335 = new class24(27, 15);

    @OriginalMember(owner = "client!sp", name = "t", descriptor = "[I")
    public static int[] field6351 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!sp", name = "x", descriptor = "Lvq;")
    public static class24 field6355;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "I")
    public static int field6332;

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "I")
    public static int field6333;

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "I")
    public static int field6334;

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "I")
    public static int field6336;

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "I")
    public static int field6337;

    @OriginalMember(owner = "client!sp", name = "g", descriptor = "I")
    public static int field6338;

    @OriginalMember(owner = "client!sp", name = "i", descriptor = "I")
    public static int field6340;

    @OriginalMember(owner = "client!sp", name = "j", descriptor = "I")
    public static int field6341;

    @OriginalMember(owner = "client!sp", name = "k", descriptor = "I")
    public static int field6342;

    @OriginalMember(owner = "client!sp", name = "l", descriptor = "I")
    public static int field6343;

    @OriginalMember(owner = "client!sp", name = "n", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!sp", name = "o", descriptor = "I")
    public static int field6346;

    @OriginalMember(owner = "client!sp", name = "p", descriptor = "I")
    public static int field6347;

    @OriginalMember(owner = "client!sp", name = "q", descriptor = "I")
    public static int field6348;

    @OriginalMember(owner = "client!sp", name = "r", descriptor = "I")
    public static int field6349;

    @OriginalMember(owner = "client!sp", name = "s", descriptor = "I")
    public static int field6350;

    @OriginalMember(owner = "client!sp", name = "v", descriptor = "I")
    public static int field6353;

    @OriginalMember(owner = "client!sp", name = "z", descriptor = "I")
    private int field6357;

    @OriginalMember(owner = "client!sp", name = "A", descriptor = "J")
    private long field6358;

    @OriginalMember(owner = "client!sp", name = "B", descriptor = "Lh;")
    private class440 field6359;

    @OriginalMember(owner = "client!sp", name = "G", descriptor = "Lbl;")
    private class57 field6364;

    static {
        new class409(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
        field6355 = new class24(50, 0);
        new class409("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIIIII)V", line = 3)
    public static final void method2667(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6334++;
        int var7 = class208.field2933;
        class88.field1074 = 0;
        int[] var8 = class88.field1085;
        byte var9 = class369.method2346(0) == 2 ? (byte) class253.field3713 : 1;
        label440: for (int var10 = 0; var10 < (class14.field231 + var7); var10++) {
            class327 var33 = null;
            class58 var34;
            if (var7 <= var10) {
                var34 = class364.field5260[class301.field4380[var10 - var7]];
                var33 = ((class26) var34).field369;
                if (var33.field4871 != null) {
                    var33 = var33.method2139(true);
                    if (var33 == null) {
                        continue;
                    }
                }
            } else {
                var34 = class455.field6731[var8[var10]];
            }
            if (var34.field748 >= 0) {
                if (class444.field6472 != null && var34.field4960 > class187.field2619.field4960) {
                    for (int var35 = var34.field4961; var35 <= var34.field4957; var35++) {
                        for (int var36 = var34.field4959; var36 <= var34.field4950; var36++) {
                            if (class444.field6472[var34.field4960][var35][var36] == var9) {
                                continue label440;
                            }
                        }
                    }
                }
                class275.method1876(arg5 >> 1, var34, arg3, 0, var34.method269((byte) -117), arg4, arg2 >> 1);
                if (class18.field296[0] >= 0) {
                    if (var34.field773 != null && (var7 <= var10 || class195.field2749 == 0 || class195.field2749 == 3 || class195.field2749 == 1 && class353.method2260(true, ((class380) var34).field5587)) && class88.field1074 < class146.field1983) {
                        class146.field1988[class88.field1074] = class233.field3502.method2333(111, var34.field773) / 2;
                        class146.field1985[class88.field1074] = class18.field296[0];
                        class146.field1982[class88.field1074] = class18.field296[1];
                        class146.field1989[class88.field1074] = var34.field714;
                        class146.field1984[class88.field1074] = var34.field741;
                        class146.field1987[class88.field1074] = var34.field729;
                        class146.field1980[class88.field1074] = var34.field773;
                        class88.field1074++;
                    }
                    class285 var37 = class253.field3719[0];
                    int var38 = class18.field296[1] + arg1 - Math.max(class233.field3502.field5284, var37.method1862());
                    if (!var34.field771 && class388.field5665 < var34.field747) {
                        class285 var39 = class253.field3719[1];
                        if (var34 instanceof class26) {
                            class26 var40 = (class26) var34;
                            class285[] var41 = (class285[]) class327.field4877.method2310((byte) -128, (long) var40.field369.field4832);
                            if (var41 == null) {
                                class144[] var42 = class144.method993(class257.field3813, var40.field369.field4832, 0);
                                if (var42 != null) {
                                    var41 = new class285[var42.length];
                                    for (int var43 = 0; var43 < var42.length; var43++) {
                                        var41[var43] = class74.field942.method100(var42[var43], true);
                                    }
                                    class327.field4877.method2299(true, var41, (long) var40.field369.field4832);
                                }
                            }
                            if (var41 != null && var41.length == 2) {
                                var37 = var41[0];
                                var39 = var41[1];
                            }
                        }
                        int var44 = class18.field296[0] + arg6 - (var37.method1868() >> 1);
                        var37.method1915(var44, var38);
                        int var45 = var37.method1868() * var34.field762 / 255;
                        if (var34.field762 > 0 && var45 < 2) {
                            var45 = 2;
                        }
                        class74.field942.method170(var44, var38, var44 + var45, var38 + var37.method1862());
                        var39.method1915(var44, var38);
                        class74.field942.method77(arg6, arg1, arg6 + arg5, arg1 + arg2);
                    }
                    var38 -= 2;
                    if (!var34.field771) {
                        if (var34.field726 > class388.field5665) {
                            class285 var46 = class56.field685[var34.field761 ? 2 : 0];
                            class285 var47 = class56.field685[var34.field761 ? 3 : 1];
                            boolean var48 = true;
                            int var49;
                            if ((var34 instanceof class26)) {
                                var49 = var33.field4867;
                                if (var49 == -1) {
                                    var49 = var34.method450(arg0 + 5480).field6493;
                                }
                            } else {
                                var49 = var34.method450(0).field6493;
                            }
                            if (var49 != -1) {
                                class285[] var50 = (class285[]) class286.field4195.method2310((byte) -128, (long) var49);
                                if (var50 == null) {
                                    class144[] var51 = class144.method993(class257.field3813, var49, 0);
                                    if (var51 != null) {
                                        var50 = new class285[var51.length];
                                        for (int var52 = 0; var52 < var51.length; var52++) {
                                            var50[var52] = class74.field942.method100(var51[var52], true);
                                        }
                                        class286.field4195.method2299(true, var50, (long) var49);
                                    }
                                }
                                if (var50 != null && var50.length == 4) {
                                    var47 = var50[var34.field761 ? 3 : 1];
                                    var46 = var50[var34.field761 ? 2 : 0];
                                }
                            }
                            int var53 = var34.field726 - class388.field5665;
                            int var54;
                            if (var34.field718 >= var53) {
                                var54 = var46.method1868();
                            } else {
                                int var55 = var53 - var34.field718;
                                int var56 = var34.field750 == 0 ? 0 : (var34.field733 - var55) / var34.field750 * var34.field750;
                                var54 = var46.method1868() * var56 / var34.field733;
                            }
                            int var57 = var46.method1862();
                            var38 -= var57;
                            int var58 = arg6 + class18.field296[0] - (var46.method1868() >> 1);
                            var46.method1915(var58, var38);
                            class74.field942.method170(var58, var38, var58 + var54, var38 - -var57);
                            var47.method1915(var58, var38);
                            var38 -= 2;
                            class74.field942.method77(arg6, arg1, arg5 + arg6, arg1 + arg2);
                        }
                        if (var10 < var7) {
                            class380 var60 = (class380) var34;
                            if (var60.field5578 != -1) {
                                var38 -= 25;
                                class136.field1870[var60.field5578].method1915(arg6 + class18.field296[0] - 12, var38);
                                var38 -= 2;
                            }
                            if (var60.field5545 != -1) {
                                var38 -= 25;
                                class130.field1781[var60.field5545].method1915(arg6 - (12 - class18.field296[0]), var38);
                                var38 -= 2;
                            }
                        } else if (var33.field4809 >= 0 && var33.field4809 < class130.field1781.length) {
                            var38 -= 25;
                            class285 var59 = class130.field1781[var33.field4809];
                            var59.method1915(arg6 + (class18.field296[0] - (var59.method1868() >> 1)), var38);
                            var38 -= 2;
                        }
                    }
                    int var10000;
                    if (!var34 instanceof class380) {
                        int var67 = 0;
                        class99[] var68 = class331.field4910;
                        for (int var69 = 0; var69 < var68.length; var69++) {
                            class99 var73 = var68[var69];
                            if (var73 != null && var73.field1223 == 1 && class301.field4380[var10 - var7] == var73.field1230) {
                                class285 var74 = class369.field5353[var73.field1231];
                                if (var74.method1862() > var67) {
                                    var67 = var74.method1862();
                                }
                                if (class388.field5665 % 20 < 10) {
                                    var74.method1915(class18.field296[0] + arg6 - 12, var38 + -var74.method1862());
                                }
                            }
                        }
                        if (var67 > 0) {
                            var10000 = var38 - (var67 + 2);
                        }
                    } else if (var10 >= 0) {
                        int var61 = 0;
                        class99[] var62 = class331.field4910;
                        for (int var63 = 0; var63 < var62.length; var63++) {
                            class99 var65 = var62[var63];
                            if (var65 != null && var65.field1223 == 10 && var8[var10] == var65.field1230) {
                                class285 var66 = class369.field5353[var65.field1231];
                                if (var66.method1862() > var61) {
                                    var61 = var66.method1862();
                                }
                                var66.method1915(class18.field296[0] + arg6 - 12, -var66.method1862() + var38);
                            }
                        }
                        if (var61 > 0) {
                            var10000 = var38 - (var61 + 2);
                        }
                    }
                    for (int var71 = 0; var71 < 4; var71++) {
                        if (class388.field5665 < var34.field749[var71]) {
                            int var72 = var34.method269((byte) -117) / 2;
                            class275.method1876(arg5 >> 1, var34, arg3, arg0 + 5480, var72, arg4, arg2 >> 1);
                            if (class18.field296[0] > -1) {
                                if (var71 == 1) {
                                    class18.field296[1] -= 20;
                                }
                                if (var71 == 2) {
                                    class18.field296[0] -= 15;
                                    class18.field296[1] -= 10;
                                }
                                if (var71 == 3) {
                                    class18.field296[0] += 15;
                                    class18.field296[1] -= 10;
                                }
                                class458.field6760[var34.field755[var71]].method1915(class18.field296[0] + arg6 - 12, class18.field296[1] + arg1 + -12);
                                class55.field675.method576(-1, class18.field296[1] + arg1 + 3, Integer.toString(var34.field744[var71]), true, 0, class18.field296[0] + arg6 - 1);
                            }
                        }
                    }
                }
            }
        }
        for (int var11 = 0; var11 < class226.field3385; var11++) {
            int var29 = class79.field987[var11];
            class58 var30;
            if (var29 < 2048) {
                var30 = class455.field6731[var29];
            } else {
                var30 = class364.field5260[var29 - 2048];
            }
            int var31 = class22.field316[var11];
            class58 var32;
            if (var31 >= 2048) {
                var32 = class364.field5260[var31 - 2048];
            } else {
                var32 = class455.field6731[var31];
            }
            class266.method1835(arg6, --var30.field779, var32, var30, arg3, arg1, arg2, arg5, arg4, true);
        }
        int var12 = class233.field3502.field5284 + class233.field3502.field5268 + 2;
        int var13 = 0;
        if (arg0 != -5480) {
            method2679(-46);
        }
        while (class88.field1074 > var13) {
            int var14 = class146.field1985[var13];
            int var15 = class146.field1982[var13];
            int var16 = class146.field1988[var13];
            boolean var17 = true;
            while (var17) {
                var17 = false;
                for (int var28 = 0; var28 < var13; var28++) {
                    if ((class146.field1982[var28] - var12) < (var15 + 2) && var15 - var12 < class146.field1982[var28] + 2 && (class146.field1988[var28] + class146.field1985[var28]) > (var14 - var16) && (class146.field1985[var28] - class146.field1988[var28]) < (var14 + var16) && class146.field1982[var28] - var12 < var15) {
                        var15 = class146.field1982[var28] - var12;
                        var17 = true;
                    }
                }
            }
            class146.field1982[var13] = var15;
            String var18 = class146.field1980[var13];
            if (class161.field2149 == 0) {
                int var19 = 16776960;
                if (class146.field1989[var13] < 6) {
                    var19 = class251.field3695[class146.field1989[var13]];
                }
                if (class146.field1989[var13] == 6) {
                    var19 = class253.field3713 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class146.field1989[var13] == 7) {
                    var19 = class253.field3713 % 20 < 10 ? 255 : 65535;
                }
                if (class146.field1989[var13] == 8) {
                    var19 = (class253.field3713 % 20) < 10 ? 45056 : 8454016;
                }
                if (class146.field1989[var13] == 9) {
                    int var20 = 150 - class146.field1987[var13];
                    if (var20 < 50) {
                        var19 = var20 * 1280 + 16711680;
                    } else if (var20 < 100) {
                        var19 = 16776960 + 16384000 - (var20 * 327680);
                    } else if (var20 < 150) {
                        var19 = ((var20 - 100) * 5) + 65280;
                    }
                }
                if (class146.field1989[var13] == 10) {
                    int var21 = 150 - class146.field1987[var13];
                    if (var21 < 50) {
                        var19 = var21 * 5 + 16711680;
                    } else if (var21 < 100) {
                        var19 = 16711935 + 16384000 - (var21 * 327680);
                    } else if (var21 < 150) {
                        var19 = var21 * 327680 + 255 - ((var21 - 100) * 5) - 32768000;
                    }
                }
                if (class146.field1989[var13] == 11) {
                    int var22 = 150 - class146.field1987[var13];
                    if (var22 < 50) {
                        var19 = 16777215 - (var22 * 327685);
                    } else if (var22 < 100) {
                        var19 = ((var22 - 50) * 327685) + 65280;
                    } else if (var22 < 150) {
                        var19 = 16777215 - ((var22 - 100) * 327680);
                    }
                }
                int var23 = var19 | 0xFF000000;
                if (class146.field1984[var13] == 0) {
                    class111.field1540.method576(var23, arg1 + var15, var18, true, -16777216, arg6 + var14);
                }
                if (class146.field1984[var13] == 1) {
                    class111.field1540.method569(100, arg6 + var14, var23, arg1 + var15, var18, class253.field3713, -16777216);
                }
                if (class146.field1984[var13] == 2) {
                    class111.field1540.method578(arg1 + var15, arg0 + 5368, arg6 + var14, var18, -16777216, class253.field3713, var23);
                }
                if (class146.field1984[var13] == 3) {
                    class111.field1540.method563(150 - class146.field1987[var13], arg6 - -var14, var23, -16777216, var18, class253.field3713, -16702, arg1 + var15);
                }
                if (class146.field1984[var13] == 4) {
                    int var24 = (150 - class146.field1987[var13]) * (class233.field3502.method2333(119, var18) + 100) / 150;
                    class74.field942.method170(arg6 + var14 - 50, arg1, arg6 + var14 + 50, arg1 + arg2);
                    class111.field1540.method565(-16777216, arg0 ^ -13295, arg1 + var15, var18, var23, arg6 + var14 + 50 - var24);
                    class74.field942.method77(arg6, arg1, arg5 + arg6, arg1 + arg2);
                }
                if (class146.field1984[var13] == 5) {
                    int var25 = 150 - class146.field1987[var13];
                    int var26 = 0;
                    if (var25 < 25) {
                        var26 = var25 - 25;
                    } else if (var25 > 125) {
                        var26 = var25 - 125;
                    }
                    int var27 = class233.field3502.field5284 + class233.field3502.field5268;
                    class74.field942.method170(arg6, arg1 + var15 - var27 - 1, arg5 + arg6, arg1 + var15 + 5);
                    class111.field1540.method576(var23, arg1 + var26 + var15, var18, true, -16777216, arg6 + var14);
                    class74.field942.method77(arg6, arg1, arg5 + arg6, arg1 + arg2);
                }
            } else {
                class111.field1540.method576(-256, arg1 + var15, var18, true, -16777216, arg6 + var14);
            }
            var13++;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)V", line = 586)
    public final void method2668(int arg0) {
        field6350++;
        if (this.field6359 != null) {
            this.field6359.method2696(arg0 ^ 0xFFFF9F);
        }
        if (arg0 != 16777215) {
            this.field6362 = -65;
        }
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(I)V", line = 602)
    public static final void method2669(int arg0) {
        class359.field5214 = null;
        field6346++;
        if (arg0 != -16777216) {
            field6351 = null;
        }
        class403.method2518(class318.field4672, 0, 0, 0, 0, class214.field3016, class375.field5473, (byte) 40, -1);
        if (class359.field5214 != null) {
            class336.method2178(0, class271.field4013, class69.field912, 0, class214.field3016, class375.field5473, class359.field5214, -1412584499, -96, class42.field567.field3365);
            class359.field5214 = null;
        }
    }

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "(I)I", line = 624)
    public final int method2670(int arg0) {
        field6342++;
        if (arg0 != -1) {
            this.method2675(26);
        }
        return this.field6339.method212(20031) + this.field6344.method212(arg0 + 20032);
    }

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "(I)Z", line = 635)
    public final boolean method2671(int arg0) {
        field6338++;
        if (arg0 != 28522) {
            method2674(58, -90);
        }
        return this.method2670(arg0 - 28523) >= 20;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(ILh;Z)V", line = 648)
    public final void method2672(int arg0, class440 arg1, boolean arg2) {
        if (arg0 != 19436) {
            this.method2672(-80, (class440) null, false);
        }
        if (this.field6359 != null) {
            try {
                this.field6359.method2695(arg0 ^ 0x4BEC);
            } catch (Exception var8) {
            }
            this.field6359 = null;
        }
        field6332++;
        this.field6359 = arg1;
        this.method2682(-1);
        this.method2677(arg2, (byte) -37);
        this.field6360.field3762 = 0;
        this.field6364 = null;
        while (true) {
            class57 var4 = (class57) this.field6344.method213(0);
            if (var4 == null) {
                while (true) {
                    class57 var5 = (class57) this.field6354.method213(0);
                    if (var5 == null) {
                        if (this.field6362 != 0) {
                            try {
                                this.field6356.field3762 = 0;
                                this.field6356.method1727(-128, 4);
                                this.field6356.method1727(arg0 ^ 0xFFFFB46C, this.field6362);
                                this.field6356.method1750((byte) 0, 0);
                                this.field6359.method2694(4, 1, this.field6356.field3764, 0);
                            } catch (IOException var7) {
                                try {
                                    this.field6359.method2695(0);
                                } catch (Exception var6) {
                                }
                                this.field6359 = null;
                                this.field6361 = -2;
                                this.field6363++;
                            }
                        }
                        this.field6357 = 0;
                        this.field6358 = class43.method364(-16756);
                        return;
                    }
                    this.field6352.method211(var5, arg0 - 51692);
                }
            }
            this.field6339.method211(var4, -32256);
        }
    }

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "(I)Z", line = 718)
    public final boolean method2673(int arg0) {
        field6345++;
        if (this.field6359 != null) {
            long var2 = class43.method364(-16756);
            int var4 = (int) (var2 - this.field6358);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field6358 = var2;
            this.field6357 += var4;
            if (this.field6357 > 30000) {
                try {
                    this.field6359.method2695(0);
                } catch (Exception var27) {
                }
                this.field6359 = null;
            }
        }
        if (this.field6359 == null) {
            return this.method2670(-1) == 0 && this.method2684(-125) == 0;
        }
        try {
            this.field6359.method2704((byte) 52);
            for (class57 var5 = (class57) this.field6339.method209(28); var5 != null; var5 = (class57) this.field6339.method217(-27864)) {
                this.field6356.field3762 = 0;
                this.field6356.method1727(-128, 1);
                this.field6356.method1724(0, (int) var5.field406);
                this.field6359.method2694(4, 1, this.field6356.field3764, 0);
                this.field6344.method211(var5, -32256);
            }
            for (class57 var6 = (class57) this.field6352.method209(arg0 ^ 0x1C); var6 != null; var6 = (class57) this.field6352.method217(-27864)) {
                this.field6356.field3762 = 0;
                this.field6356.method1727(-128, 0);
                this.field6356.method1724(arg0, (int) var6.field406);
                this.field6359.method2694(4, 1, this.field6356.field3764, 0);
                this.field6354.method211(var6, -32256);
            }
            for (int var7 = arg0; var7 < 100; var7++) {
                int var8 = this.field6359.method2705(-88);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field6357 = 0;
                byte var9 = 0;
                if (this.field6364 == null) {
                    var9 = 8;
                } else if (this.field6364.field691 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field6360.field3762;
                    if (var10 > var8) {
                        var10 = var8;
                    }
                    this.field6359.method2702(this.field6360.field3762, var10, this.field6360.field3764, (byte) 113);
                    if (this.field6362 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field6360.field3764[this.field6360.field3762 + var11] = (byte) class134.method895(this.field6360.field3764[this.field6360.field3762 + var11], this.field6362);
                        }
                    }
                    this.field6360.field3762 += var10;
                    if (this.field6360.field3762 >= var9) {
                        if (this.field6364 == null) {
                            this.field6360.field3762 = 0;
                            int var12 = this.field6360.method1738((byte) -62);
                            int var13 = this.field6360.method1767(1930493576);
                            int var14 = this.field6360.method1738((byte) -20);
                            int var15 = this.field6360.method1746(20972);
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class57 var21;
                            if (var17) {
                                for (var21 = (class57) this.field6354.method209(28); var21 != null && var21.field406 != var18; var21 = (class57) this.field6354.method217(-27864)) {
                                }
                            } else {
                                for (var21 = (class57) this.field6344.method209(arg0 ^ 0x1C); var21 != null && var21.field406 != var18; var21 = (class57) this.field6344.method217(-27864)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            this.field6364 = var21;
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field6364.field700 = new class256(var15 + var22 + this.field6364.field703);
                            this.field6364.field700.method1727(-128, var16);
                            this.field6364.field700.method1721(25153, var15);
                            this.field6360.field3762 = 0;
                            this.field6364.field691 = 8;
                        } else if (this.field6364.field691 != 0) {
                            throw new IOException();
                        } else if (this.field6360.field3764[0] == -1) {
                            this.field6360.field3762 = 0;
                            this.field6364.field691 = 1;
                        } else {
                            this.field6364 = null;
                        }
                    }
                } else {
                    int var23 = this.field6364.field700.field3764.length - this.field6364.field703;
                    int var24 = 512 - this.field6364.field691;
                    if (var24 > (var23 - this.field6364.field700.field3762)) {
                        var24 = var23 - this.field6364.field700.field3762;
                    }
                    if (var24 > var8) {
                        var24 = var8;
                    }
                    this.field6359.method2702(this.field6364.field700.field3762, var24, this.field6364.field700.field3764, (byte) 96);
                    if (this.field6362 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field6364.field700.field3764[this.field6364.field700.field3762 + var25] = (byte) class134.method895(this.field6364.field700.field3764[this.field6364.field700.field3762 + var25], this.field6362);
                        }
                    }
                    this.field6364.field691 += var24;
                    this.field6364.field700.field3762 += var24;
                    if (this.field6364.field700.field3762 == var23) {
                        this.field6364.method299((byte) -86);
                        this.field6364.field5650 = false;
                        this.field6364 = null;
                    } else if (this.field6364.field691 == 512) {
                        this.field6364.field691 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field6359.method2695(0);
            } catch (Exception var26) {
            }
            this.field6361 = -2;
            this.field6359 = null;
            this.field6363++;
            return this.method2670(-1) == 0 && this.method2684(-125) == 0;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)I", line = 993)
    public static final int method2674(int arg0, int arg1) {
        field6343++;
        if (arg1 <= 98) {
            method2669(119);
        }
        return (arg0 & 0x3FA41) >> 11;
    }

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "(I)V", line = 1006)
    public final void method2675(int arg0) {
        field6349++;
        if (this.field6359 != null) {
            this.field6359.method2695(0);
        }
        if (arg0 != -7416) {
            this.field6358 = -99L;
        }
    }

    @OriginalMember(owner = "client!sp", name = "g", descriptor = "(I)Z", line = 1020)
    public final boolean method2676(int arg0) {
        if (arg0 != -14594) {
            method2679(41);
        }
        field6348++;
        return this.method2684(-125) >= 20;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(ZB)V", line = 1034)
    public final void method2677(boolean arg0, byte arg1) {
        field6353++;
        if (arg1 >= -32 || this.field6359 == null) {
            return;
        }
        try {
            this.field6356.field3762 = 0;
            this.field6356.method1727(-128, arg0 ? 2 : 3);
            this.field6356.method1724(0, 0);
            this.field6359.method2694(4, 1, this.field6356.field3764, 0);
        } catch (IOException var4) {
            try {
                this.field6359.method2695(0);
            } catch (Exception var3) {
            }
            this.field6359 = null;
            this.field6361 = -2;
            this.field6363++;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)V", line = 1062)
    public final void method2678(byte arg0) {
        try {
            this.field6359.method2695(0);
        } catch (Exception var2) {
        }
        field6340++;
        this.field6362 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field6359 = null;
        if (arg0 != -36) {
            this.method2672(14, (class440) null, false);
        }
        this.field6363++;
        this.field6361 = -1;
    }

    @OriginalMember(owner = "client!sp", name = "h", descriptor = "(I)V", line = 1084)
    public static void method2679(int arg0) {
        field6335 = null;
        field6355 = null;
        if (arg0 != 10) {
            field6351 = null;
        }
        field6351 = null;
    }

    @OriginalMember(owner = "client!sp", name = "i", descriptor = "(I)V", line = 1096)
    public final void method2680(int arg0) {
        field6333++;
        if (arg0 != -21154 || this.field6359 == null) {
            return;
        }
        try {
            this.field6356.field3762 = 0;
            this.field6356.method1727(-128, 7);
            this.field6356.method1724(0, 0);
            this.field6359.method2694(4, arg0 ^ 0xFFFFAD5F, this.field6356.field3764, 0);
        } catch (IOException var3) {
            try {
                this.field6359.method2695(0);
            } catch (Exception var2) {
            }
            this.field6359 = null;
            this.field6363++;
            this.field6361 = -2;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIZB)Lbl;", line = 1126)
    public final class57 method2681(int arg0, int arg1, int arg2, boolean arg3, byte arg4) {
        field6337++;
        long var6 = (long) ((arg1 << 16) + arg0);
        class57 var8 = new class57();
        var8.field5654 = arg3;
        if (arg2 != 0) {
            this.field6354 = null;
        }
        var8.field703 = arg4;
        var8.field406 = var6;
        if (arg3) {
            if (this.method2670(-1) >= 20) {
                throw new RuntimeException();
            }
            this.field6339.method211(var8, -32256);
        } else if (this.method2684(-125) < 20) {
            this.field6352.method211(var8, -32256);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!sp", name = "j", descriptor = "(I)V", line = 1177)
    private final void method2682(int arg0) {
        field6347++;
        if (this.field6359 == null) {
            return;
        }
        try {
            this.field6356.field3762 = 0;
            this.field6356.method1727(-128, 6);
            this.field6356.method1724(0, 3);
            if (arg0 == -1) {
                this.field6359.method2694(4, arg0 + 2, this.field6356.field3764, 0);
            }
        } catch (IOException var3) {
            try {
                this.field6359.method2695(0);
            } catch (Exception var2) {
            }
            this.field6361 = -2;
            this.field6359 = null;
            this.field6363++;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Ljava/util/Random;BI)I", line = 1207)
    public static final int method2683(Random arg0, byte arg1, int arg2) {
        field6341++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class104.method709(true, arg2)) {
            return (int) ((long) arg2 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            if (arg1 != -75) {
                method2669(77);
            }
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg2);
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (var3 <= var4);
            return class41.method357(arg2, var4, -1);
        }
    }

    @OriginalMember(owner = "client!sp", name = "k", descriptor = "(I)I", line = 1238)
    private final int method2684(int arg0) {
        field6336++;
        if (arg0 != -125) {
            method2669(-89);
        }
        return this.field6352.method212(arg0 ^ 0xFFFFB1BC) + this.field6354.method212(20031);
    }
}
