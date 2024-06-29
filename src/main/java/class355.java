import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class355 {

    @OriginalMember(owner = "client!th", name = "g", descriptor = "[B")
    private byte[] field4994;

    @OriginalMember(owner = "client!th", name = "t", descriptor = "[[B")
    private byte[][] field5007;

    @OriginalMember(owner = "client!th", name = "w", descriptor = "I")
    public int field5010;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public int field4990;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public int field4997;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "Liq;")
    public static class362 field4995 = new class362("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    public static int field4999 = 127;

    @OriginalMember(owner = "client!th", name = "s", descriptor = "Lgn;")
    public static class419 field5006 = new class419(0, 0);

    @OriginalMember(owner = "client!th", name = "u", descriptor = "I")
    public static int field5008 = -1;

    @OriginalMember(owner = "client!th", name = "v", descriptor = "[Lbj;")
    public static class130[] field5009 = new class130[0];

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    public static int field5001;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!th", name = "r", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/lang/String;Z[Lgj;)I", line = 3)
    public final int method2255(String arg0, boolean arg1, class381[] arg2) {
        field4998++;
        if (arg0 == null) {
            return 0;
        } else if (arg1) {
            int var4 = -1;
            int var5 = -1;
            int var6 = 0;
            int var7 = arg0.length();
            for (int var8 = 0; var8 < var7; var8++) {
                char var9 = arg0.charAt(var8);
                if (var9 == '<') {
                    var4 = var8;
                } else {
                    if (var9 == '>' && var4 != -1) {
                        String var10 = arg0.substring(var4 + 1, var8);
                        var4 = -1;
                        if (var10.equals("lt")) {
                            var9 = '<';
                        } else if (var10.equals("gt")) {
                            var9 = '>';
                        } else if (var10.equals("nbsp")) {
                            var9 = ' ';
                        } else if (var10.equals("shy")) {
                            var9 = '\u00AD';
                        } else if (var10.equals("times")) {
                            var9 = '×';
                        } else if (var10.equals("euro")) {
                            var9 = '€';
                        } else if (var10.equals("copy")) {
                            var9 = '©';
                        } else {
                            if (!var10.equals("reg")) {
                                if (var10.startsWith("img=") && arg2 != null) {
                                    try {
                                        int var11 = class4.method29(var10.substring(4), 10);
                                        var5 = -1;
                                        var6 += arg2[var11].method762();
                                    } catch (Exception var12) {
                                    }
                                }
                                continue;
                            }
                            var9 = '®';
                        }
                    }
                    if (var4 == -1) {
                        var6 += this.field4994[class348.method2226(var9, (byte) -124) & 0xFF] & 0xFF;
                        if (this.field5007 != null && var5 != -1) {
                            var6 += this.field5007[var5][var9];
                        }
                        var5 = var9;
                    }
                }
            }
            return var6;
        } else {
            return -34;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V", line = 109)
    public static void method2256(int arg0) {
        field5009 = null;
        int var1 = -30 / ((arg0 + 83) / 40);
        field5006 = null;
        field4995 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "([Lgj;BILjava/lang/String;I)I", line = 121)
    public final int method2257(class381[] arg0, byte arg1, int arg2, String arg3, int arg4) {
        field4993++;
        if (arg4 == 0) {
            arg4 = this.field5010;
        }
        int var6 = this.method2262(arg3, new int[] { arg2 }, arg0, class306.field4295, -21293);
        int var7 = 107 / ((-arg1 - 37) / 34);
        int var8 = (var6 - 1) * arg4;
        return this.field4997 + var8 + this.field4990;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZIZZ)V", line = 142)
    public static final void method2258(int arg0, boolean arg1, int arg2, boolean arg3, boolean arg4) {
        class54.method313((byte) 75, 0, arg4, field5009.length - 1, arg1, arg2, arg0);
        field5005++;
        class101.field1234 = null;
        if (!arg3) {
            method2268(-4, 58, 78);
        }
        class385.field5435 = 0;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BI[Lgj;Ljava/lang/String;)I", line = 155)
    public final int method2259(byte arg0, int arg1, class381[] arg2, String arg3) {
        if (arg0 == 20) {
            field4989++;
            return this.method2262(arg3, new int[] { arg1 }, arg2, class306.field4295, arg0 - 21313);
        } else {
            return 79;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)I", line = 167)
    public final int method2260(int arg0, int arg1) {
        int var3 = -74 % ((-arg1 - 64) / 40);
        field4988++;
        return this.field4994[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "([Lgj;ILjava/lang/String;I)I", line = 178)
    public final int method2261(class381[] arg0, int arg1, String arg2, int arg3) {
        field5003++;
        int var5 = this.method2262(arg2, new int[] { arg3 }, arg0, class306.field4295, arg1 ^ 0xFFFFACD3);
        int var6 = arg1;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method2255(class306.field4295[var7], true, arg0);
            if (var8 > var6) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/lang/String;[I[Lgj;[Ljava/lang/String;I)I", line = 208)
    public final int method2262(String arg0, int[] arg1, class381[] arg2, String[] arg3, int arg4) {
        field5004++;
        if (arg0 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int var9 = 0;
        byte var10 = 0;
        int var11 = -1;
        int var12 = -1;
        if (arg4 != -21293) {
            this.field4994 = null;
        }
        int var13 = 0;
        int var14 = arg0.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class348.method2226(arg0.charAt(var15), (byte) -126) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var17 += this.method2260(var16, -124);
                    var18 = var15;
                    if (this.field5007 != null && var12 != -1) {
                        var17 += this.field5007[var12][var16];
                    }
                    var12 = var16;
                } else {
                    if (var16 != 62) {
                        continue;
                    }
                    var18 = var11;
                    String var19 = arg0.substring(var11 + 1, var15);
                    var11 = -1;
                    if (var19.equals("br")) {
                        arg3[var13] = arg0.substring(var7, var15 + 1);
                        var13++;
                        if (var13 >= arg3.length) {
                            return 0;
                        }
                        var6 = 0;
                        var7 = var15 + 1;
                        var8 = -1;
                        var12 = -1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method2260(60, arg4 ^ 0xFFFFAC82);
                        if (this.field5007 != null && var12 != -1) {
                            var17 += this.field5007[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method2260(62, -13);
                        if (this.field5007 != null && var12 != -1) {
                            var17 += this.field5007[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method2260(160, -109);
                        if (this.field5007 != null && var12 != -1) {
                            var17 += this.field5007[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method2260(173, -109);
                        if (this.field5007 != null && var12 != -1) {
                            var17 += this.field5007[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method2260(215, 26);
                        if (this.field5007 != null && var12 != -1) {
                            var17 += this.field5007[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method2260(8364, 111);
                        if (this.field5007 != null && var12 != -1) {
                            var17 += this.field5007[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method2260(169, -120);
                        if (this.field5007 != null && var12 != -1) {
                            var17 += this.field5007[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method2260(174, -126);
                        if (this.field5007 != null && var12 != -1) {
                            var17 += this.field5007[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg2 != null) {
                        try {
                            int var20 = class4.method29(var19.substring(4), 10);
                            var17 += arg2[var20].method762();
                            var12 = -1;
                        } catch (Exception var21) {
                        }
                    }
                    var16 = -1;
                }
                if (var17 > 0) {
                    var6 += var17;
                    if (arg1 != null) {
                        if (var16 == 32) {
                            var9 = var6;
                            var8 = var15;
                            var10 = 1;
                        }
                        if (var6 > arg1[var13 >= arg1.length ? arg1.length - 1 : var13]) {
                            if (var8 >= 0) {
                                arg3[var13] = arg0.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (arg3.length <= var13) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var12 = -1;
                                var6 -= var9;
                                var8 = -1;
                            } else {
                                arg3[var13] = arg0.substring(var7, var18);
                                var13++;
                                if (arg3.length <= var13) {
                                    return 0;
                                }
                                var12 = -1;
                                var8 = -1;
                                var7 = var18;
                                var6 = var17;
                            }
                        }
                        if (var16 == 45) {
                            var10 = 0;
                            var8 = var15;
                            var9 = var6;
                        }
                    }
                }
            }
        }
        if (var7 < arg0.length()) {
            arg3[var13] = arg0.substring(var7, arg0.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ICI)I", line = 456)
    public final int method2263(int arg0, char arg1, int arg2) {
        if (arg0 < 50) {
            return 124;
        } else {
            field5000++;
            return this.field5007 == null ? 0 : this.field5007[arg2][arg1];
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 473)
    public final int method2264(String arg0, int arg1) {
        int var3 = -64 % ((73 - arg1) / 47);
        field5001++;
        return this.method2255(arg0, true, (class381[]) null);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIII)I", line = 483)
    public static final int method2265(int arg0, int arg1, int arg2, int arg3) {
        int var4 = -38 / ((arg2 - 65) / 35);
        field5002++;
        int var5 = arg1 & 0x3;
        if (var5 == 0) {
            return arg0;
        } else if (var5 == 1) {
            return arg3;
        } else if (var5 == 2) {
            return 1023 - arg0;
        } else {
            return 1023 - arg3;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lfj;B)V", line = 512)
    public static final void method2266(class396 arg0, byte arg1) {
        field4992++;
        boolean var2 = false;
        if (class189.field2726 == arg0.field5636 || arg0.field5612 == -1 || arg0.field5638 != 0) {
            var2 = true;
        } else {
            class412 var3 = class189.method1288(-8192, arg0.field5612);
            if (var3.field5935 || var3.field5918[arg0.field5591] < (arg0.field5634 + 1)) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg0.field5636 - arg0.field5579;
            int var5 = class189.field2726 - arg0.field5579;
            int var6 = arg0.field5644 * 128 + (arg0.method242(-30129) * 64);
            int var7 = arg0.field5631 * 128 + (arg0.method242(-30129) * 64);
            int var8 = arg0.field5610 * 128 + arg0.method242(-30129) * 64;
            int var9 = arg0.field5632 * 128 + arg0.method242(-30129) * 64;
            arg0.field3284 = ((var4 - var5) * var6 + var5 * var8) / var4;
            arg0.field3269 = ((var4 - var5) * var7 + var5 * var9) / var4;
        }
        arg0.field5666 = 0;
        if (arg0.field5582 == 0) {
            arg0.method2533(8192, -117);
        }
        int var10 = -82 % ((-arg1 - 30) / 40);
        if (arg0.field5582 == 1) {
            arg0.method2533(12288, 92);
        }
        if (arg0.field5582 == 2) {
            arg0.method2533(0, 119);
        }
        if (arg0.field5582 == 3) {
            arg0.method2533(4096, 92);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIB[Lon;IIIIII)V", line = 574)
    public static final void method2267(int arg0, int arg1, byte arg2, class184[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4996++;
        class151.field1873.method660(arg8, arg6, arg5, arg9);
        for (int var10 = 0; var10 < arg3.length; var10++) {
            class184 var11 = arg3[var10];
            if (var11 != null && (var11.field2599 == arg0 || arg0 == -1412584499 && class225.field3144 == var11)) {
                int var12;
                if (arg4 == -1) {
                    class130.field1584[class421.field6017].setBounds(var11.field2567 + arg1, var11.field2602 + arg7, var11.field2618, var11.field2516);
                    var12 = class421.field6017++;
                } else {
                    var12 = arg4;
                }
                var11.field2568 = class189.field2726;
                var11.field2542 = var12;
                if (!client.method1119(var11)) {
                    if (var11.field2561 > 0) {
                        class189.method1289(var11, -1);
                    }
                    int var13 = var11.field2567 + arg1;
                    int var14 = var11.field2602 + arg7;
                    int var15 = var11.field2665;
                    if (class367.field5204 && (client.method1121(var11).field3981 != 0 || var11.field2524 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class225.field3144 == var11) {
                        if (arg0 != -1412584499 && !var11.field2575) {
                            class285.field4004 = arg1;
                            class268.field3808 = arg7;
                            class55.field665 = arg3;
                            continue;
                        }
                        if (class284.field3993 && class191.field2751) {
                            int var16 = class306.field4306.method17(20417);
                            int var17 = class306.field4306.method18(arg2 ^ 0x5F);
                            int var18 = var17 - class261.field3723;
                            int var19 = var16 - class3.field24;
                            if (var19 < class5.field71) {
                                var19 = class5.field71;
                            }
                            if (class36.field424 > var18) {
                                var18 = class36.field424;
                            }
                            if (var11.field2618 + var19 > class5.field71 + class276.field3921.field2618) {
                                var19 = class5.field71 + class276.field3921.field2618 - var11.field2618;
                            }
                            var13 = var19;
                            if (class36.field424 + class276.field3921.field2516 < var11.field2516 + var18) {
                                var18 = class36.field424 + class276.field3921.field2516 - var11.field2516;
                            }
                            var14 = var18;
                        }
                        if (!var11.field2575) {
                            var15 = 128;
                        }
                    }
                    int var22;
                    int var23;
                    int var24;
                    int var25;
                    if (var11.field2524 == 2) {
                        var25 = arg5;
                        var22 = arg6;
                        var24 = arg9;
                        var23 = arg8;
                    } else {
                        int var20 = var11.field2618 + var13;
                        int var21 = var14 + var11.field2516;
                        if (var11.field2524 == 9) {
                            var21++;
                            var20++;
                        }
                        var22 = arg6 < var14 ? var14 : arg6;
                        var23 = var13 > arg8 ? var13 : arg8;
                        var24 = arg9 <= var21 ? arg9 : var21;
                        var25 = arg5 > var20 ? var20 : arg5;
                    }
                    if (var25 > var23 && var24 > var22) {
                        if (var11.field2561 != 0) {
                            if (var11.field2561 == 1337 || var11.field2561 == 1403) {
                                class404.method2583(var11.field2561 == 1403, false, var11.field2516, var11.field2618, var14, var13);
                                class394.field5556[var12] = true;
                                class151.field1873.method660(arg8, arg6, arg5, arg9);
                                continue;
                            }
                            if (var11.field2561 == 1338) {
                                if (var11.method1240(class151.field1873, 123) != null) {
                                    class356.method2270(false);
                                    class370.method2359(var13, var14, class151.field1873, var11, (byte) -50);
                                    class418.field5974[var12] = true;
                                    class151.field1873.method660(arg8, arg6, arg5, arg9);
                                }
                                continue;
                            }
                            if (var11.field2561 == 1339) {
                                if (var11.method1240(class151.field1873, -128) != null) {
                                    class360.method2313(var14, var11, (byte) -22, var13);
                                    class418.field5974[var12] = true;
                                    class151.field1873.method660(arg8, arg6, arg5, arg9);
                                }
                                continue;
                            }
                            if (var11.field2561 == 1400) {
                                class106.method583(var14, var13, var11.field2516, class1.field6, class151.field1873, 56, var11.field2618);
                                class394.field5556[var12] = true;
                                class151.field1873.method660(arg8, arg6, arg5, arg9);
                                continue;
                            }
                            if (var11.field2561 == 1401) {
                                class412.method2626(var11.field2618, class151.field1873, 50, var13, var11.field2516, var14);
                                class394.field5556[var12] = true;
                                class151.field1873.method660(arg8, arg6, arg5, arg9);
                                continue;
                            }
                            if (var11.field2561 == 1405) {
                                if (!class151.field1866 && !class356.field5017) {
                                    continue;
                                }
                                int var26 = var11.field2618 + var13;
                                int var27 = var14 + 15;
                                if (class151.field1866) {
                                    class73.field874.method1772("Fps:" + class98.field1195, (byte) 87, -1, -256, var27, var26);
                                    var27 += 15;
                                    Runtime var28 = Runtime.getRuntime();
                                    int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                    int var30 = -256;
                                    if (var29 > 65536) {
                                        var30 = -65536;
                                    }
                                    class73.field874.method1772("Mem:" + var29 + "k", (byte) 104, -1, var30, var27, var26);
                                    var27 += 15;
                                    int var31 = class151.field1873.method648() / 1024;
                                    class73.field874.method1772("Offheap:" + var31 + "k", (byte) 118, -1, var31 > 65536 ? -65536 : -256, var27, var26);
                                    var27 += 15;
                                    int var32 = 0;
                                    int var33 = 0;
                                    int var34 = 0;
                                    for (int var35 = 0; var35 < 29; var35++) {
                                        var32 += class448.field6437[var35].method2310((byte) -46);
                                        var33 += class448.field6437[var35].method2300((byte) -116);
                                        var34 += class448.field6437[var35].method2297(arg2 ^ 0x5E);
                                    }
                                    int var36 = var34 * 100 / var32;
                                    int var37 = var33 * 10000 / var32;
                                    String var38 = "Cache:" + class218.method1462(0, 2, -107, true, (long) var37) + "% (" + var36 + "%)";
                                    class263.field3750.method1772(var38, (byte) 100, -1, -256, var27, var26);
                                    var27 += 12;
                                }
                                if (class330.field4665 > 0) {
                                    class263.field3750.method1772("Particles: " + class129.field1572 + " / " + class330.field4665, (byte) 93, -1, -256, var27, var26);
                                }
                                var27 += 12;
                                if (class356.field5017) {
                                    class263.field3750.method1772("Polys: " + class151.field1873.method646() + " Models: " + class151.field1873.method621(), (byte) 88, -1, -256, var27, var26);
                                    var27 += 12;
                                    class263.field3750.method1772("Ls: " + class203.field2922 + " La: " + class152.field1884 + " NPC: " + class22.field277 + " Pl: " + class72.field869, (byte) 96, -1, -256, var27, var26);
                                    var27 += 12;
                                    class264.method1759(-124);
                                }
                                class394.field5556[var12] = true;
                                continue;
                            }
                        }
                        if (var11.field2524 == 0) {
                            if (var11.field2561 == 1407 && class151.field1873.method647()) {
                                class151.field1873.method622(var13, var14, var11.field2618, var11.field2516);
                            }
                            method2267(var11.field2584, var13 - var11.field2655, (byte) 94, arg3, var12, var25, var22, var14 - var11.field2648, var23, var24);
                            if (var11.field2603 != null) {
                                method2267(var11.field2584, var13 - var11.field2655, (byte) 94, var11.field2603, var12, var25, var22, var14 - var11.field2648, var23, var24);
                            }
                            class167 var39 = (class167) class22.field280.method1888((long) var11.field2584, (byte) -30);
                            if (var39 != null) {
                                class268.method1784(var12, var24, var25, var14, var39.field2332, var22, var13, (byte) 111, var23);
                            }
                            if (var11.field2561 == 1407 && class151.field1873.method647()) {
                                class151.field1873.method623();
                                class285.field4003 = true;
                            }
                            class151.field1873.method660(arg8, arg6, arg5, arg9);
                        }
                        if (class181.field2475[var12] || class159.field2068 > 1) {
                            if (var11.field2524 == 3) {
                                if (var15 == 0) {
                                    if (var11.field2514) {
                                        class151.field1873.method653(var13, var14, var11.field2618, var11.field2516, var11.field2546, 0);
                                    } else {
                                        class151.field1873.method594(var13, var14, var11.field2618, var11.field2516, var11.field2546, 0);
                                    }
                                } else if (var11.field2514) {
                                    class151.field1873.method653(var13, var14, var11.field2618, var11.field2516, var11.field2546 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                } else {
                                    class151.field1873.method594(var13, var14, var11.field2618, var11.field2516, 255 - (var15 & 0xFF) << 24 | var11.field2546 & 0xFFFFFF, 1);
                                }
                            } else if (var11.field2524 == 4) {
                                class266 var40 = var11.method1237((byte) -45, class151.field1873);
                                if (var40 != null) {
                                    int var41 = var11.field2546;
                                    String var42 = var11.field2650;
                                    if (var11.field2635 != -1) {
                                        class163 var43 = class50.method288(0, var11.field2635);
                                        var42 = var43.field2238;
                                        if (var42 == null) {
                                            var42 = "null";
                                        }
                                        if ((var43.field2278 == 1 || var11.field2657 != 1) && var11.field2657 != -1) {
                                            var42 = "<col=ff9040>" + var42 + "</col> x" + class382.method2456(var11.field2657, -111);
                                        }
                                    }
                                    if (class59.field709 == var11) {
                                        var42 = class17.field203.method2331(25, class271.field3836);
                                        var41 = var11.field2546;
                                    }
                                    if (class434.field6242) {
                                        class151.field1873.method679(var13, var14, var13 + var11.field2618, var11.field2516 + var14);
                                    }
                                    var40.method1765(var13, true, (class433) null, var11.field2516, 0, var14, var11.field2651 ? -16777216 : -1, (int[]) null, class347.field4907, var11.field2612, 0, var41 | 0xFF000000, var11.field2618, var42, var11.field2652, var11.field2659);
                                    if (class434.field6242) {
                                        class151.field1873.method660(arg8, arg6, arg5, arg9);
                                    }
                                } else if (class76.field897) {
                                    class186.method1277(var11, (byte) 106);
                                }
                            } else if (var11.field2524 == 5) {
                                if (var11.field2569 < 0) {
                                    class381 var45;
                                    if (var11.field2635 == -1) {
                                        var45 = var11.method1242(32, class151.field1873);
                                    } else {
                                        class274 var44 = var11.field2597 ? class384.field5422.field453 : null;
                                        var45 = class341.method2192(var11.field2643 | 0xFF000000, var11.field2657, var11.field2615, var11.field2635, var11.field2640, (byte) 126, var44, class151.field1873);
                                    }
                                    if (var45 != null) {
                                        int var46 = var45.method762();
                                        int var47 = var45.method761();
                                        if (var11.field2533) {
                                            class151.field1873.method679(var13, var14, var11.field2618 + var13, var11.field2516 + var14);
                                            if (var11.field2592 != 0) {
                                                int var48 = (var11.field2618 + var46 - 1) / var46;
                                                int var49 = (-(-var47 - var11.field2516) - 1) / var47;
                                                for (int var50 = 0; var50 < var48; var50++) {
                                                    for (int var51 = 0; var51 < var49; var51++) {
                                                        var45.method2448((float) var46 / 2.0F + (float) (var13 + (var46 * var50)), (float) var47 / 2.0F + (float) (var47 * var51 + var14), 4096, var11.field2592);
                                                    }
                                                }
                                            } else if (var15 == 0) {
                                                var45.method760(var13, var14, var11.field2618, var11.field2516, 0, 0, 1);
                                            } else {
                                                var45.method760(var13, var14, var11.field2618, var11.field2516, 1, 255 - (var15 & 0xFF) << 24 | 0xFFFFFF, 1);
                                            }
                                            class151.field1873.method660(arg8, arg6, arg5, arg9);
                                        } else if (var15 != 0) {
                                            int var52 = 255 - (var15 & 0xFF) << 24 | 0xFFFFFF;
                                            if (var11.field2592 != 0) {
                                                var45.method2447((float) var11.field2618 / 2.0F + (float) var13, (float) var11.field2516 / 2.0F + (float) var14, var11.field2618 * 4096 / var46, var11.field2592, 1, var52, 1);
                                            } else if (var11.field2618 == var46 && var11.field2516 == var47) {
                                                var45.method756(var13, var14, 1, var52, 1);
                                            } else {
                                                var45.method752(var13, var14, var11.field2618, var11.field2516, 1, var52, 1);
                                            }
                                        } else if (var11.field2592 != 0) {
                                            var45.method2448((float) var11.field2618 / 2.0F + (float) var13, (float) var11.field2516 / 2.0F + (float) var14, var11.field2618 * 4096 / var46, var11.field2592);
                                        } else if (var11.field2618 == var46 && var11.field2516 == var47) {
                                            var45.method2446(var13, var14);
                                        } else {
                                            var45.method2452(var13, var14, var11.field2618, var11.field2516);
                                        }
                                    } else if (class76.field897) {
                                        class186.method1277(var11, (byte) -127);
                                    }
                                } else {
                                    var11.method1246(-41).method1794(var11.field2630 << 3, var11.field2525 << 3, var13, 123, var11.field2516, var11.field2618, 0, 0, class151.field1873, var14);
                                }
                            } else if (var11.field2524 == 6) {
                                class97.method534(-50);
                                class210 var53 = null;
                                int var54 = 0;
                                if (var11.field2635 != -1) {
                                    class163 var55 = class50.method288(0, var11.field2635);
                                    if (var55 != null) {
                                        class163 var56 = var55.method1092(true, var11.field2657);
                                        class412 var57 = var11.field2544 == -1 ? null : class189.method1288(-8192, var11.field2544);
                                        class274 var58 = var11.field2597 ? class384.field5422.field453 : null;
                                        var53 = var56.method1096((byte) 80, var58, var11.field2541, 1, var11.field2550, 1024, var57, var11.field2566, class151.field1873);
                                        if (var53 == null) {
                                            class186.method1277(var11, (byte) 113);
                                        } else {
                                            var54 = -var53.method1405() / 2;
                                        }
                                    }
                                } else if (var11.field2539 == 5) {
                                    if (var11.field2520 == -1) {
                                        var53 = client.field2299.method1809(1, (class412) null, class151.field1873, 0, (class299[]) null, (class412) null, true, -1, -1, 0, 1024, -1, -1);
                                    } else {
                                        int var63 = var11.field2520;
                                        class40 var64;
                                        if (class414.field5948 == var63) {
                                            var64 = class384.field5422;
                                        } else {
                                            var64 = class26.field314[var63];
                                        }
                                        class412 var65 = var11.field2544 == -1 ? null : class189.method1288(-8192, var11.field2544);
                                        if (var64 != null && (var63 == 2047 || class302.method1988((byte) 73, var64.field487) == var11.field2560)) {
                                            var53 = var64.field453.method1809(1, (class412) null, class151.field1873, var11.field2550, (class299[]) null, var65, true, var11.field2541, 0, 0, 1024, -1, var11.field2566);
                                        }
                                    }
                                } else if (var11.field2539 == 8 || var11.field2539 == 9) {
                                    class411 var60 = class144.method878(false, var11.field2520, -111);
                                    class412 var61 = var11.field2544 == -1 ? null : class189.method1288(arg2 ^ 0xFFFFE05E, var11.field2544);
                                    if (var60 != null) {
                                        class274 var62 = var11.field2597 ? class384.field5422.field453 : null;
                                        var53 = var60.method2621(var62, var11.field2566, 1710352968, var11.field2541, var61, var11.field2539 == 9, 1024, var11.field2560, class151.field1873, var11.field2550);
                                    }
                                } else if (var11.field2544 == -1) {
                                    var53 = var11.method1239(0, -1, (byte) -46, (class412) null, -1, 1024, class151.field1873, class384.field5422.field453);
                                    if (var53 == null && class76.field897) {
                                        class186.method1277(var11, (byte) 82);
                                    }
                                } else {
                                    class412 var59 = class189.method1288(-8192, var11.field2544);
                                    var53 = var11.method1239(var11.field2550, var11.field2541, (byte) -46, var59, var11.field2566, 1024, class151.field1873, class384.field5422.field453);
                                    if (var53 == null && class76.field897) {
                                        class186.method1277(var11, (byte) -104);
                                    }
                                }
                                if (var53 != null) {
                                    int var66;
                                    if (var11.field2523 <= 0) {
                                        var66 = 512;
                                    } else {
                                        var66 = (var11.field2618 << 9) / var11.field2523;
                                    }
                                    int var67;
                                    if (var11.field2627 > 0) {
                                        var67 = (var11.field2516 << 9) / var11.field2627;
                                    } else {
                                        var67 = 512;
                                    }
                                    int var68 = (var11.field2625 * var66 >> 9) + var11.field2618 / 2 + var13;
                                    int var69 = (var11.field2628 * var67 >> 9) + var11.field2516 / 2 + var14;
                                    class65.field743.method129();
                                    class151.field1873.method628(class65.field743);
                                    int var70 = class158.field2055[var11.field2532 << 3] * var11.field2558 >> 15;
                                    int var71 = class158.field2059[var11.field2532 << 3] * var11.field2558 >> 15;
                                    class151.field1873.method652(var68, var69, var66, var67);
                                    class151.field1873.method691((float) var11.field2564, var11.field2664 ? (float) var11.field2562 : (float) var11.field2562 * 1.5F);
                                    if (class285.field4003) {
                                        class151.field1873.method624();
                                        class151.field1873.method600();
                                        class151.field1873.method660(arg8, arg6, arg5, arg9);
                                        class285.field4003 = false;
                                    }
                                    if (var11.field2644) {
                                        class151.field1873.method617(false);
                                    }
                                    class295.field4115.method120(-var11.field2515 << 3);
                                    class295.field4115.method119(var11.field2604 << 3);
                                    class295.field4115.method125(var11.field2607, var54 + var70 + var11.field2588, var11.field2588 + var71);
                                    class295.field4115.method130(var11.field2532 << 3);
                                    if (class434.field6242) {
                                        class151.field1873.method679(var13, var14, var11.field2618 + var13, var11.field2516 + var14);
                                    }
                                    if (var11.field2664) {
                                        var53.method1412(class295.field4115, (class136) null, var11.field2558, 1);
                                    } else {
                                        var53.method1416(class295.field4115, (class136) null, 1);
                                    }
                                    if (class434.field6242) {
                                        class151.field1873.method660(arg8, arg6, arg5, arg9);
                                    }
                                    if (var11.field2644) {
                                        class151.field1873.method617(true);
                                    }
                                }
                            } else if (var11.field2524 == 9) {
                                int var72;
                                int var73;
                                int var74;
                                int var75;
                                if (var11.field2571) {
                                    var72 = var11.field2516 + var14;
                                    var73 = var14;
                                    var74 = var13 + var11.field2618;
                                    var75 = var13;
                                } else {
                                    var74 = var11.field2618 + var13;
                                    var73 = var11.field2516 + var14;
                                    var72 = var14;
                                    var75 = var13;
                                }
                                if (var11.field2581 == 1) {
                                    class151.field1873.method593(var75, var72, var74, var73, var11.field2546, 0);
                                } else {
                                    class151.field1873.method612(var75, var72, var74, var73, var11.field2546, var11.field2581, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg2 != 94) {
            field4995 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(III)V", line = 1233)
    public static final void method2268(int arg0, int arg1, int arg2) {
        if (arg0 > -48) {
            field5006 = null;
        }
        field4991++;
        class20 var3 = class369.method2351((byte) 123, 12, arg2);
        var3.method146(115);
        var3.field252 = arg1;
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "([B)V", line = 1256)
    public class355(byte[] arg0) {
        class236 var2 = new class236(arg0);
        int var3 = var2.method1574(-43);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method1574(-117) == 1;
        this.field4994 = new byte[256];
        var2.method1570(this.field4994, 256, 0, -1);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method1574(-95);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method1574(-33);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method1589(false);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method1589(false);
                    var11[var12][var16] = var15;
                }
            }
            this.field5007 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field5007[var13][var14] = (byte) class97.method533(var6, this.field4994, var11, var13, var5, var9, (byte) 92, var14);
                        }
                    }
                }
            }
            this.field5010 = var5[32] + var6[32];
        } else {
            this.field5010 = var2.method1574(-62);
        }
        var2.method1574(-12);
        var2.method1574(-37);
        this.field4990 = var2.method1574(-66);
        this.field4997 = var2.method1574(-94);
    }
}
