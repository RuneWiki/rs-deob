import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class281 {

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field6058;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field6043;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field6044;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field6045;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field6046;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field6047;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field6048;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field6050;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field6051;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field6052;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field6053;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field6055;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field6056;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field6057;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field6059;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field6061;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "Lwo;")
    public static class285 field6060;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "Z")
    public static boolean field6062;

    static {
        new class72("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
        field6058 = 0;
        new class72("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 4)
    public static final void method2685() {
        boolean var0 = class403.field5601 == 1 && class450.field6291 > 200 || class403.field5601 == 0 && class450.field6291 > 50;
        for (int var1 = 0; var1 < class450.field6291; var1++) {
            class131 var10 = class212.field2584[class304.field4083[var1]];
            if (var10.method839((byte) 30)) {
                var10.method240((byte) -59);
                if (var10.field1512 >= 0 && var10.field1518 >= 0 && var10.field1510 < class22.field232 && var10.field1517 < class196.field2329) {
                    var10.field1474 = var10.field2423 ? var0 : false;
                    int var11 = 0;
                    if (!var10.field2460) {
                        var11++;
                    }
                    if (var10.field2422 > class106.field1273) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method841(true) << 2);
                    if (class354.field4817 == 0) {
                        var12 += 32;
                    } else {
                        var12 += 128;
                    }
                    var12 += 256;
                    var10.field2413 = var12 + 1;
                } else {
                    var10.field2413 = -1;
                }
            } else {
                var10.field2413 = -1;
            }
        }
        for (int var2 = 0; var2 < class106.field1263; var2++) {
            class298 var7 = class220.field2726[class437.field5984[var2]];
            if (var7.method1889((byte) 79) && var7.field3971.method1951(1)) {
                var7.method240((byte) -59);
                if (var7.field1512 >= 0 && var7.field1518 >= 0 && var7.field1510 < class22.field232 && var7.field1517 < class196.field2329) {
                    int var8 = 0;
                    if (!var7.field2460) {
                        var8++;
                    }
                    if (var7.field2422 > class106.field1273) {
                        var8 += 2;
                    }
                    int var9 = var8 + (5 - var7.method841(true) << 2);
                    if (class354.field4817 == 0) {
                        if (var7.field3971.field4120) {
                            var9 += 64;
                        } else {
                            var9 += 128;
                        }
                    } else if (class354.field4817 == 1) {
                        if (var7.field3971.field4120) {
                            var9 += 32;
                        } else {
                            var9 += 64;
                        }
                    }
                    if (var7.field3971.field4151) {
                        var9 += 512;
                    } else if (!var7.field3971.field4149) {
                        var9 += 256;
                    }
                    var7.field2413 = var9 + 1;
                } else {
                    var7.field2413 = -1;
                }
            } else {
                var7.field2413 = -1;
            }
        }
        for (int var3 = 0; var3 < class307.field4159.length; var3++) {
            class220 var4 = class307.field4159[var3];
            if (var4 != null) {
                if (var4.field2716 == 1) {
                    class298 var5 = class220.field2726[var4.field2711];
                    if (var5 != null && var5.field2413 >= 0) {
                        var5.field2413 += 1024;
                    }
                } else if (var4.field2716 == 10) {
                    class131 var6 = class212.field2584[var4.field2711];
                    if (var6 != null && var6.field2413 >= 0) {
                        var6.field2413 += 1024;
                    }
                }
            }
        }
        class143.field1684.field2413 = Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Laq;)Z", line = 140)
    public static final boolean method2686(class453 arg0) {
        if (class186.field2151) {
            if (method2696(arg0).field4847 != 0) {
                return false;
            }
            if (arg0.field6383 == 0) {
                return false;
            }
        }
        return arg0.field6459;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Laq;)Laq;", line = 155)
    public static final class453 method2687(class453 arg0) {
        int var1 = method2696(arg0).method2258(false);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class195.method1212(arg0.field6462, (byte) 49);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 174)
    private final void method2688(int arg0) {
        field6056++;
        if (class434.field5930 < class235.field3094.field5214) {
            class138.field1578 = (class235.field3094.field5214 - 1) * 50 * 5;
            if (class70.field874 == class249.field3279) {
                class70.field874 = class389.field5303;
            } else {
                class70.field874 = class249.field3279;
            }
            if (class138.field1578 > 3000) {
                class138.field1578 = 3000;
            }
            if (class235.field3094.field5214 >= 2 && class235.field3094.field5215 == 6) {
                this.method1758("js5connect_outofdate", 0);
                class174.field2017 = 1000;
                return;
            }
            if (class235.field3094.field5214 >= 4 && class235.field3094.field5215 == -1) {
                this.method1758("js5crc", 0);
                class174.field2017 = 1000;
                return;
            }
            if (class235.field3094.field5214 >= 4 && (class174.field2017 == 0 || class174.field2017 == 5)) {
                if (class235.field3094.field5215 == 7 || class235.field3094.field5215 == 9) {
                    this.method1758("js5connect_full", 0);
                } else if (class235.field3094.field5215 > 0) {
                    this.method1758("js5connect", arg0);
                } else {
                    this.method1758("js5io", 0);
                }
                class174.field2017 = 1000;
                return;
            }
        }
        class434.field5930 = class235.field3094.field5214;
        if (class138.field1578 > 0) {
            class138.field1578--;
            return;
        }
        try {
            if (class168.field1963 == arg0) {
                class12.field155 = class401.field5525.method2714(class70.field874, false, class330.field4505);
                class168.field1963++;
            }
            if (class168.field1963 == 1) {
                if (class12.field155.field4244 == 2) {
                    this.method2694(1000, 0);
                    return;
                }
                if (class12.field155.field4244 == 1) {
                    class168.field1963++;
                }
            }
            if (class168.field1963 == 2) {
                class383.field5239 = new class399((Socket) class12.field155.field4243, class401.field5525);
                class242 var2 = new class242(5);
                var2.method1593(15, -108);
                var2.method1560(-26356, 568);
                class383.field5239.method2464((byte) 113, 0, 5, var2.field3188);
                class168.field1963++;
                class170.field1997 = class164.method1038(8635);
            }
            if (class168.field1963 == 3) {
                if (class174.field2017 == 0 || class174.field2017 == 5 || class383.field5239.method2467((byte) 52) > 0) {
                    int var3 = class383.field5239.method2469(arg0 - 19969);
                    if (var3 != 0) {
                        this.method2694(var3, arg0);
                        return;
                    }
                    class168.field1963++;
                } else if ((class164.method1038(8635) - class170.field1997) > 30000L) {
                    this.method2694(1001, 0);
                    return;
                }
            }
            if (class168.field1963 == 4) {
                boolean var4 = class174.field2017 == 5 || class174.field2017 == 10 || class174.field2017 == 28;
                class235.field3094.method2368(class383.field5239, !var4, (byte) 88);
                class12.field155 = null;
                class168.field1963 = 0;
                class383.field5239 = null;
            }
        } catch (IOException var5) {
            this.method2694(1002, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Laq;IIIIIIIII)V", line = 320)
    public static final void method2689(class453[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class453 var11 = arg0[var10];
            if (var11 != null && var11.field6462 == arg1) {
                int var12 = var11.field6394 + arg6;
                int var13 = var11.field6434 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field6383 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field6377 + var12;
                    int var19 = var11.field6432 + var13;
                    if (var11.field6383 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field6383 == 0 || var11.field6371 || method2696(var11).field4847 != 0 || class137.field1559 == var11 || var11.field6415 == 1338) {
                    if (!method2686(var11)) {
                        if (class264.field3404 == var11) {
                            class262.field3369 = true;
                            class94.field1109 = var12;
                            class438.field6008 = var13;
                        }
                        if (var11.field6408 || var14 < var16 && var15 < var17) {
                            if (var11.field6383 == 0 && var11.field6316 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class221 var20 = (class221) class302.field4054.method1690((byte) -123); var20 != null; var20 = (class221) class302.field4054.method1699((byte) 24)) {
                                    if (var20.field2730) {
                                        var20.method263(false);
                                        var20.field2732.field6388 = false;
                                    }
                                }
                                if (class56.field644 == 0) {
                                    class264.field3404 = null;
                                    class137.field1559 = null;
                                }
                                class38.field453 = 0;
                                class287.field3783 = false;
                                class252.field3304 = false;
                                if (!class49.field574) {
                                    class398.method2458(true);
                                }
                            }
                            boolean var21;
                            if (class358.field4866.method1860(16) >= var14 && class358.field4866.method1858(-18493) >= var15 && class358.field4866.method1860(16) < var16 && class358.field4866.method1858(-18493) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class49.field574 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class115.method673(var11, arg8 - var12, arg9 - var13, 110);
                            }
                            boolean var22 = false;
                            if (class358.field4866.method1847((byte) -7) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            if (class208.field2516 != null && class208.field2516.method6(false) == 0 && class208.field2516.method5(27878) >= var14 && class208.field2516.method2(false) >= var15 && class208.field2516.method5(27878) < var16 && class208.field2516.method2(false) < var17) {
                                var23 = true;
                            }
                            if (var11.field6423 != null) {
                                for (int var24 = 0; var24 < var11.field6423.length; var24++) {
                                    if (class261.field3359.method623(9, var11.field6423[var24])) {
                                        if (var11.field6405 == null || class106.field1273 >= var11.field6405[var24]) {
                                            byte var25 = var11.field6323[var24];
                                            if (var25 == 0 || ((var25 & 0x8) == 0 || !class261.field3359.method623(9, 86) && !class261.field3359.method623(9, 82) && !class261.field3359.method623(9, 81)) && ((var25 & 0x2) == 0 || class261.field3359.method623(9, 86)) && ((var25 & 0x1) == 0 || class261.field3359.method623(9, 82)) && ((var25 & 0x4) == 0 || class261.field3359.method623(9, 81))) {
                                                class54.method308("", -100, -1, var24 + 1, var11.field6475);
                                                int var26 = var11.field6378[var24];
                                                if (var11.field6405 == null) {
                                                    var11.field6405 = new int[var11.field6423.length];
                                                }
                                                if (var26 == 0) {
                                                    var11.field6405[var24] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field6405[var24] = class106.field1273 + var26;
                                                }
                                            }
                                        }
                                    } else if (var11.field6405 != null) {
                                        var11.field6405[var24] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class416.method2560((byte) -112, var11, class208.field2516.method2(false) - var13, class208.field2516.method5(27878) - var12);
                            }
                            if (class264.field3404 != null && class264.field3404 != var11 && var21 && method2696(var11).method2259(2)) {
                                class334.field4561 = var11;
                            }
                            if (class137.field1559 == var11) {
                                class143.field1683 = true;
                                class325.field4340 = var12;
                                class395.field5379 = var13;
                            }
                            if (var11.field6371 || var11.field6415 != 0) {
                                if (var21 && class236.field3097 != 0 && var11.field6325 != null) {
                                    class221 var27 = new class221();
                                    var27.field2730 = true;
                                    var27.field2732 = var11;
                                    var27.field2738 = class236.field3097;
                                    var27.field2735 = var11.field6325;
                                    class302.field4054.method1696(false, var27);
                                }
                                if (class264.field3404 != null || class49.field574 || var11.field6415 != 1400 && class38.field453 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field6415 != 0) {
                                    if (var11.field6415 == 1337 || var11.field6415 == 1403) {
                                        class336.field4583 = var11;
                                        if (class451.field6298 != null) {
                                            class451.field6298.method450(false, var11.field6432, class267.field3454);
                                        }
                                        if (var11.field6415 == 1337) {
                                            if (!class49.field574 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class356.method2253(1090, arg8, arg9, class267.field3454);
                                                for (class23 var28 = (class23) class210.field2546.method1838(-6325); var28 != null; var28 = (class23) class210.field2546.method1834((byte) 91)) {
                                                    if (arg8 >= var28.field242 && arg8 < var28.field243 && arg9 >= var28.field244 && arg9 < var28.field249) {
                                                        class398.method2458(true);
                                                        class238.method1529(var28.field239, false);
                                                    }
                                                }
                                            }
                                            class333.method2135(var11, 2, var13, var12);
                                            continue;
                                        }
                                    }
                                    if (var11.field6415 == 1338) {
                                        if (var11.method2808(class267.field3454, false) == null || class184.field2133 != 0 && class184.field2133 != 3 || class49.field574 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var29 = arg8 - var12;
                                        int var30 = arg9 - var13;
                                        int var31 = var11.field6322[var30];
                                        if (var29 < var31 || var29 > var11.field6334[var30] + var31) {
                                            continue;
                                        }
                                        int var32 = var29 - var11.field6377 / 2;
                                        int var33 = var30 - var11.field6432 / 2;
                                        int var34;
                                        if (class320.field4294 == 4) {
                                            var34 = (int) class434.field5929 & 0x3FFF;
                                        } else {
                                            var34 = (int) class434.field5929 + class231.field3043 & 0x3FFF;
                                        }
                                        int var35 = class363.field4927[var34];
                                        int var36 = class363.field4917[var34];
                                        if (class320.field4294 != 4) {
                                            var35 = (class280.field3627 + 256) * var35 >> 8;
                                            var36 = (class280.field3627 + 256) * var36 >> 8;
                                        }
                                        int var37 = var32 * var36 + var33 * var35 >> 15;
                                        int var38 = var33 * var36 - var32 * var35 >> 15;
                                        int var39;
                                        int var40;
                                        if (class320.field4294 == 4) {
                                            var39 = (class225.field2856 >> 7) + (var37 >> 2);
                                            var40 = (class347.field4725 >> 7) - (var38 >> 2);
                                        } else {
                                            int var41 = (class143.field1684.method841(true) - 1) * 64;
                                            var39 = (class143.field1684.field1516 - var41 >> 7) + (var37 >> 2);
                                            var40 = (class143.field1684.field1514 - var41 >> 7) - (var38 >> 2);
                                        }
                                        if (class104.field1224 && (class105.field1248 & 0x40) != 0) {
                                            class453 var42 = class378.method2346(-23490, class62.field759, class357.field4844);
                                            if (var42 == null) {
                                                class416.method2561((byte) -24);
                                            } else {
                                                class300.method1908(class272.field3513, " ->", var40, 672, 1L, class335.field4569, var39, 60);
                                            }
                                            continue;
                                        }
                                        if (class31.field356 == 1) {
                                            class300.method1908(-1, "", var40, 672, 1L, class238.field3143.method434(class373.field5057, -8192), var39, 59);
                                        }
                                        class300.method1908(-1, "", var40, 672, 1L, class217.field2662, var39, 21);
                                        continue;
                                    }
                                    if (var11.field6415 == 1400) {
                                        class310.field4200 = var11;
                                        if (var21) {
                                            class287.field3783 = true;
                                        }
                                        if (var23) {
                                            int var43 = (int) ((double) (class208.field2516.method5(27878) - var12 - var11.field6377 / 2) * 2.0D / (double) class224.field2811);
                                            int var44 = (int) (-((double) (class208.field2516.method2(false) - var13 - var11.field6432 / 2) * 2.0D / (double) class224.field2811));
                                            int var45 = class54.field633 + var43 + class224.field2825;
                                            int var46 = class394.field5366 + var44 + class224.field2815;
                                            class195 var47 = class150.method957(-15039);
                                            if (var47 == null) {
                                                continue;
                                            }
                                            int[] var48 = new int[3];
                                            var47.method1210(var48, var46, 21436, var45);
                                            if (var48 != null) {
                                                if (class261.field3359.method623(9, 82) && class427.field5842 > 0) {
                                                    class424.method2597(var48[2], var48[0], var48[1], 66885254);
                                                    continue;
                                                }
                                                class252.field3304 = true;
                                                class106.field1255 = var48[0];
                                                class310.field4204 = var48[1];
                                                class23.field251 = var48[2];
                                            }
                                            class38.field453 = 1;
                                            class211.field2576 = false;
                                            class356.field4829 = class358.field4866.method1860(16);
                                            class20.field214 = class358.field4866.method1858(-18493);
                                            continue;
                                        }
                                        if (var22 && class38.field453 > 0) {
                                            if (class38.field453 == 1 && (class356.field4829 != class358.field4866.method1860(16) || class20.field214 != class358.field4866.method1858(-18493))) {
                                                class130.field1435 = class54.field633;
                                                class361.field4887 = class394.field5366;
                                                class38.field453 = 2;
                                            }
                                            if (class38.field453 == 2) {
                                                class211.field2576 = true;
                                                class186.method1151(-1, class130.field1435 + (int) ((double) (class356.field4829 - class358.field4866.method1860(16)) * 2.0D / (double) class224.field2814));
                                                class79.method502(class361.field4887 - (int) ((double) (class20.field214 - class358.field4866.method1858(-18493)) * 2.0D / (double) class224.field2814), (byte) 55);
                                            }
                                            continue;
                                        }
                                        if (class38.field453 > 0 && !class211.field2576) {
                                            if ((class396.field5388 == 1 || method2703(86)) && class57.field660 > 2) {
                                                class263.method1660(2, 117, class356.field4829, class20.field214);
                                            } else if (class310.method1966(true)) {
                                                class263.method1660(0, -97, class356.field4829, class20.field214);
                                            }
                                        }
                                        class38.field453 = 0;
                                        continue;
                                    }
                                    if (var11.field6415 == 1401) {
                                        if (var22) {
                                            class169.method1076((byte) 96, class358.field4866.method1858(-18493) - var13, var11.field6432, var11.field6377, class358.field4866.method1860(16) - var12);
                                        }
                                        continue;
                                    }
                                    if (var11.field6415 == 1406) {
                                        class2.method10(-85, var11, var12, var13);
                                        continue;
                                    }
                                }
                                if (!var11.field6444 && var23) {
                                    var11.field6444 = true;
                                    if (var11.field6438 != null) {
                                        class221 var49 = new class221();
                                        var49.field2730 = true;
                                        var49.field2732 = var11;
                                        var49.field2736 = class208.field2516.method5(27878) - var12;
                                        var49.field2738 = class208.field2516.method2(false) - var13;
                                        var49.field2735 = var11.field6438;
                                        class302.field4054.method1696(false, var49);
                                    }
                                }
                                if (var11.field6444 && var22 && var11.field6402 != null) {
                                    class221 var50 = new class221();
                                    var50.field2730 = true;
                                    var50.field2732 = var11;
                                    var50.field2736 = class358.field4866.method1860(16) - var12;
                                    var50.field2738 = class358.field4866.method1858(-18493) - var13;
                                    var50.field2735 = var11.field6402;
                                    class302.field4054.method1696(false, var50);
                                }
                                if (var11.field6444 && !var22) {
                                    var11.field6444 = false;
                                    if (var11.field6349 != null) {
                                        class221 var51 = new class221();
                                        var51.field2730 = true;
                                        var51.field2732 = var11;
                                        var51.field2736 = class358.field4866.method1860(16) - var12;
                                        var51.field2738 = class358.field4866.method1858(-18493) - var13;
                                        var51.field2735 = var11.field6349;
                                        class53.field625.method1696(false, var51);
                                    }
                                }
                                if (var22 && var11.field6442 != null) {
                                    class221 var52 = new class221();
                                    var52.field2730 = true;
                                    var52.field2732 = var11;
                                    var52.field2736 = class358.field4866.method1860(16) - var12;
                                    var52.field2738 = class358.field4866.method1858(-18493) - var13;
                                    var52.field2735 = var11.field6442;
                                    class302.field4054.method1696(false, var52);
                                }
                                if (!var11.field6388 && var21) {
                                    var11.field6388 = true;
                                    if (var11.field6372 != null) {
                                        class221 var53 = new class221();
                                        var53.field2730 = true;
                                        var53.field2732 = var11;
                                        var53.field2736 = class358.field4866.method1860(16) - var12;
                                        var53.field2738 = class358.field4866.method1858(-18493) - var13;
                                        var53.field2735 = var11.field6372;
                                        class302.field4054.method1696(false, var53);
                                    }
                                }
                                if (var11.field6388 && var21 && var11.field6468 != null) {
                                    class221 var54 = new class221();
                                    var54.field2730 = true;
                                    var54.field2732 = var11;
                                    var54.field2736 = class358.field4866.method1860(16) - var12;
                                    var54.field2738 = class358.field4866.method1858(-18493) - var13;
                                    var54.field2735 = var11.field6468;
                                    class302.field4054.method1696(false, var54);
                                }
                                if (var11.field6388 && !var21) {
                                    var11.field6388 = false;
                                    if (var11.field6365 != null) {
                                        class221 var55 = new class221();
                                        var55.field2730 = true;
                                        var55.field2732 = var11;
                                        var55.field2736 = class358.field4866.method1860(16) - var12;
                                        var55.field2738 = class358.field4866.method1858(-18493) - var13;
                                        var55.field2735 = var11.field6365;
                                        class53.field625.method1696(false, var55);
                                    }
                                }
                                if (var11.field6379 != null) {
                                    class221 var56 = new class221();
                                    var56.field2732 = var11;
                                    var56.field2735 = var11.field6379;
                                    class161.field1871.method1696(false, var56);
                                }
                                if (var11.field6343 != null && class17.field184 > var11.field6458) {
                                    if (var11.field6465 == null || class17.field184 - var11.field6458 > 32) {
                                        class221 var61 = new class221();
                                        var61.field2732 = var11;
                                        var61.field2735 = var11.field6343;
                                        class302.field4054.method1696(false, var61);
                                    } else {
                                        label670: for (int var57 = var11.field6458; var57 < class17.field184; var57++) {
                                            int var58 = class262.field3370[var57 & 0x1F];
                                            for (int var59 = 0; var59 < var11.field6465.length; var59++) {
                                                if (var11.field6465[var59] == var58) {
                                                    class221 var60 = new class221();
                                                    var60.field2732 = var11;
                                                    var60.field2735 = var11.field6343;
                                                    class302.field4054.method1696(false, var60);
                                                    break label670;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6458 = class17.field184;
                                }
                                if (var11.field6412 != null && class346.field4698 > var11.field6422) {
                                    if (var11.field6464 == null || class346.field4698 - var11.field6422 > 32) {
                                        class221 var66 = new class221();
                                        var66.field2732 = var11;
                                        var66.field2735 = var11.field6412;
                                        class302.field4054.method1696(false, var66);
                                    } else {
                                        label646: for (int var62 = var11.field6422; var62 < class346.field4698; var62++) {
                                            int var63 = class282.field3681[var62 & 0x1F];
                                            for (int var64 = 0; var64 < var11.field6464.length; var64++) {
                                                if (var11.field6464[var64] == var63) {
                                                    class221 var65 = new class221();
                                                    var65.field2732 = var11;
                                                    var65.field2735 = var11.field6412;
                                                    class302.field4054.method1696(false, var65);
                                                    break label646;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6422 = class346.field4698;
                                }
                                if (var11.field6463 != null && class283.field3709 > var11.field6391) {
                                    if (var11.field6413 == null || class283.field3709 - var11.field6391 > 32) {
                                        class221 var71 = new class221();
                                        var71.field2732 = var11;
                                        var71.field2735 = var11.field6463;
                                        class302.field4054.method1696(false, var71);
                                    } else {
                                        label622: for (int var67 = var11.field6391; var67 < class283.field3709; var67++) {
                                            int var68 = class204.field2469[var67 & 0x1F];
                                            for (int var69 = 0; var69 < var11.field6413.length; var69++) {
                                                if (var11.field6413[var69] == var68) {
                                                    class221 var70 = new class221();
                                                    var70.field2732 = var11;
                                                    var70.field2735 = var11.field6463;
                                                    class302.field4054.method1696(false, var70);
                                                    break label622;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6391 = class283.field3709;
                                }
                                if (var11.field6360 != null && class40.field480 > var11.field6318) {
                                    if (var11.field6352 == null || class40.field480 - var11.field6318 > 32) {
                                        class221 var76 = new class221();
                                        var76.field2732 = var11;
                                        var76.field2735 = var11.field6360;
                                        class302.field4054.method1696(false, var76);
                                    } else {
                                        label598: for (int var72 = var11.field6318; var72 < class40.field480; var72++) {
                                            int var73 = class126.field1412[var72 & 0x1F];
                                            for (int var74 = 0; var74 < var11.field6352.length; var74++) {
                                                if (var11.field6352[var74] == var73) {
                                                    class221 var75 = new class221();
                                                    var75.field2732 = var11;
                                                    var75.field2735 = var11.field6360;
                                                    class302.field4054.method1696(false, var75);
                                                    break label598;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6318 = class40.field480;
                                }
                                if (var11.field6355 != null && class288.field3789 > var11.field6401) {
                                    if (var11.field6336 == null || class288.field3789 - var11.field6401 > 32) {
                                        class221 var81 = new class221();
                                        var81.field2732 = var11;
                                        var81.field2735 = var11.field6355;
                                        class302.field4054.method1696(false, var81);
                                    } else {
                                        label574: for (int var77 = var11.field6401; var77 < class288.field3789; var77++) {
                                            int var78 = class197.field2335[var77 & 0x1F];
                                            for (int var79 = 0; var79 < var11.field6336.length; var79++) {
                                                if (var11.field6336[var79] == var78) {
                                                    class221 var80 = new class221();
                                                    var80.field2732 = var11;
                                                    var80.field2735 = var11.field6355;
                                                    class302.field4054.method1696(false, var80);
                                                    break label574;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6401 = class288.field3789;
                                }
                                if (class366.field4985 > var11.field6400 && var11.field6380 != null) {
                                    class221 var82 = new class221();
                                    var82.field2732 = var11;
                                    var82.field2735 = var11.field6380;
                                    class302.field4054.method1696(false, var82);
                                }
                                if (class424.field5812 > var11.field6400 && var11.field6421 != null) {
                                    class221 var83 = new class221();
                                    var83.field2732 = var11;
                                    var83.field2735 = var11.field6421;
                                    class302.field4054.method1696(false, var83);
                                }
                                if (class42.field503 > var11.field6400 && var11.field6375 != null) {
                                    class221 var84 = new class221();
                                    var84.field2732 = var11;
                                    var84.field2735 = var11.field6375;
                                    class302.field4054.method1696(false, var84);
                                }
                                if (class191.field2252 > var11.field6400 && var11.field6450 != null) {
                                    class221 var85 = new class221();
                                    var85.field2732 = var11;
                                    var85.field2735 = var11.field6450;
                                    class302.field4054.method1696(false, var85);
                                }
                                if (class364.field4955 > var11.field6400 && var11.field6446 != null) {
                                    class221 var86 = new class221();
                                    var86.field2732 = var11;
                                    var86.field2735 = var11.field6446;
                                    class302.field4054.method1696(false, var86);
                                }
                                var11.field6400 = class383.field5246;
                                if (var11.field6373 != null) {
                                    for (int var87 = 0; var87 < class40.field481; var87++) {
                                        class221 var88 = new class221();
                                        var88.field2732 = var11;
                                        var88.field2737 = class6.field56[var87].method323(0);
                                        var88.field2729 = class6.field56[var87].method318(true);
                                        var88.field2735 = var11.field6373;
                                        class302.field4054.method1696(false, var88);
                                    }
                                }
                                if (class4.field27 && var11.field6333 != null) {
                                    class221 var89 = new class221();
                                    var89.field2732 = var11;
                                    var89.field2735 = var11.field6333;
                                    class302.field4054.method1696(false, var89);
                                }
                            }
                            if (var11.field6383 == 5 && var11.field6424 != -1) {
                                var11.method2807(1419390864).method450(false, var11.field6432, class267.field3454);
                            }
                            class18.method115(var11, (byte) 114);
                            if (var11.field6383 == 0) {
                                method2689(arg0, var11.field6475, var14, var15, var16, var17, var12 - var11.field6345, var13 - var11.field6386, arg8, arg9);
                                if (var11.field6350 != null) {
                                    method2689(var11.field6350, var11.field6475, var14, var15, var16, var17, var12 - var11.field6345, var13 - var11.field6386, arg8, arg9);
                                }
                                class244 var90 = (class244) class282.field3678.method2218(1, (long) var11.field6475);
                                if (var90 != null) {
                                    if (var90.field3240 == 0 && !class49.field574 && var21 && !class186.field2151) {
                                        class398.method2458(true);
                                    }
                                    class258.method1633(var13, var16, var12, (byte) -121, arg9, var15, var90.field3245, arg8, var17, var14);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class18.method115(var11, (byte) 125);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 1196)
    public final void method1770(int arg0) {
        if (class181.field2109) {
            class380.method2363(940);
        }
        field6051++;
        if (class267.field3454 != null) {
            class267.field3454.method745(arg0 ^ 0x2);
        }
        if (class53.field620 != null) {
            class53.method303(true, class401.field5525, class53.field620);
            class53.field620 = null;
        }
        if (class181.field2107 != null) {
            class181.field2107.method2465((byte) -85);
            class181.field2107 = null;
        }
        if (class97.field1143 != null) {
            class97.field1143.method375(false, class357.field4845);
        }
        class97.field1143 = null;
        if (class252.field3301 != null) {
            class252.field3301.method1105((byte) 37);
        }
        if (class424.field5811 != null) {
            class424.field5811.method1105((byte) 37);
        }
        if (arg0 != 0) {
            this.method1770(-107);
        }
        class235.field3094.method2367(arg0 + 91);
        class296.field3943.method1727(-2580);
        if (class203.field2384 != null) {
            class203.field2384.method1220((byte) 9);
            class203.field2384 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 1246)
    private final void method2690(int arg0) {
        field6044++;
        if (arg0 != 26909) {
            return;
        }
        class439.field6032++;
        class333.method2135((class453) null, arg0 - 26907, -1, -1);
        class2.method10(88, (class453) null, -1, -1);
        class399.method2470((byte) -24);
        class383.field5246++;
        for (int var2 = 0; var2 < 32768; var2++) {
            class298 var12 = class220.field2726[var2];
            if (var12 != null) {
                byte var13 = var12.field3971.field4139;
                if ((var13 & 0x1) != 0) {
                    int var14 = var12.method841(true);
                    if ((var13 & 0x2) != 0 && var12.field2486 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var15 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var16 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var15 != 0 || var16 != 0) {
                            int var17 = var12.field2480[0] + var15;
                            if (var17 < 0) {
                                var17 = 0;
                            } else if (var17 > class22.field232 - var14 - 1) {
                                var17 = class22.field232 - var14 - 1;
                            }
                            int var18 = var12.field2482[0] + var16;
                            if (var18 < 0) {
                                var18 = 0;
                            } else if ((class196.field2329 - var14 - 1) < var18) {
                                var18 = class196.field2329 - var14 - 1;
                            }
                            int var19 = class218.method1327(var14, class355.field4824, 0, true, -9, var12.field2480[0], var14, class266.field3431, -1, class156.field1815[var12.field1528], var12.field2482[0], var14, var18, var17, 0);
                            if (var19 > 0) {
                                if (var19 > 9) {
                                    var19 = 9;
                                }
                                for (int var20 = 0; var20 < var19; var20++) {
                                    var12.field2480[var20] = class355.field4824[var19 - var20 - 1];
                                    var12.field2482[var20] = class266.field3431[var19 - var20 - 1];
                                    var12.field2478[var20] = 1;
                                }
                                var12.field2486 = var19;
                            }
                        }
                    }
                    class303.method1924(var12, true, (byte) 120);
                    int var21 = class299.method1900(var12, (byte) 107);
                    class229.method1433(-10220, class397.field5393, class325.field4335, var12, var21);
                    class87.method539(-4279, var12);
                }
            }
        }
        if (class80.field970 == 0 && class102.field1189 == 0) {
            if (class320.field4294 == 2) {
                class146.method944(false);
            } else {
                class307.method1953(false);
            }
            if (class287.field3784 >> 7 < 14 || class287.field3784 >> 7 >= class22.field232 - 14 || (class80.field979 >> 7) < 14 || class196.field2329 - 14 <= class80.field979 >> 7) {
                class208.method1280(-118);
            }
        }
        while (true) {
            class221 var3;
            class453 var4;
            class453 var5;
            do {
                var3 = (class221) class161.field1871.method1688(arg0 ^ 0x6974);
                if (var3 == null) {
                    while (true) {
                        class221 var6;
                        class453 var7;
                        class453 var8;
                        do {
                            var6 = (class221) class53.field625.method1688(arg0 ^ 0x6973);
                            if (var6 == null) {
                                while (true) {
                                    class221 var9;
                                    class453 var10;
                                    class453 var11;
                                    do {
                                        var9 = (class221) class302.field4054.method1688(114);
                                        if (var9 == null) {
                                            if (class264.field3404 != null) {
                                                class361.method2271((byte) 116);
                                            }
                                            if ((class106.field1273 % 1500) == 0) {
                                                class382.method2384(arg0 ^ 0x6962);
                                            }
                                            class384.method2390(11147);
                                            if (class181.field2109 && (class164.method1038(8635) - 60000L) > class368.field5015) {
                                                class380.method2363(940);
                                                return;
                                            }
                                            return;
                                        }
                                        var10 = var9.field2732;
                                        if (var10.field6364 < 0) {
                                            break;
                                        }
                                        var11 = class195.method1212(var10.field6462, (byte) 49);
                                    } while (var11 == null || var11.field6350 == null || var11.field6350.length <= var10.field6364 || var11.field6350[var10.field6364] != var10);
                                    class93.method578(var9);
                                }
                            }
                            var7 = var6.field2732;
                            if (var7.field6364 < 0) {
                                break;
                            }
                            var8 = class195.method1212(var7.field6462, (byte) 49);
                        } while (var8 == null || var8.field6350 == null || var7.field6364 >= var8.field6350.length || var8.field6350[var7.field6364] != var7);
                        class93.method578(var6);
                    }
                }
                var4 = var3.field2732;
                if (var4.field6364 < 0) {
                    break;
                }
                var5 = class195.method1212(var4.field6462, (byte) 49);
            } while (var5 == null || var5.field6350 == null || var4.field6364 >= var5.field6350.length || var5.field6350[var4.field6364] != var4);
            class93.method578(var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 1454)
    private final void method2691(int arg0) {
        if (!class11.field132) {
            for (int var2 = 0; var2 < class40.field481; var2++) {
                if (class6.field56[var2].method318(true) == 's' || class6.field56[var2].method318(true) == 'S') {
                    class11.field132 = true;
                    break;
                }
            }
        }
        field6043++;
        if (class283.field3704 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class164.method1038(8635);
            if (class332.field4524 == 0L) {
                class332.field4524 = var5;
            }
            if (var4 > 16384 && (var5 - class332.field4524) < 5000L) {
                if ((var5 - class91.field1068) > 1000L) {
                    System.gc();
                    class91.field1068 = var5;
                }
                class263.field3378 = class67.field807.method434(class373.field5057, arg0 - 28309);
                class298.field3965 = 5;
            } else {
                class263.field3378 = class202.field2377.method434(class373.field5057, -8192);
                class283.field3704 = 10;
                class298.field3965 = 5;
            }
        } else if (class283.field3704 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class156.field1815[var7] = class15.method85(class196.field2329, class262.method1658(arg0, -20118), class22.field232);
            }
            class263.field3378 = class406.field5629.method434(class373.field5057, -8192);
            class283.field3704 = 20;
            class298.field3965 = 10;
        } else if (class283.field3704 == 20) {
            if (class341.field4649 == null) {
                class341.field4649 = new class153(class235.field3094, class296.field3943);
            }
            if (class341.field4649.method982(true)) {
                class228.field2876 = class140.method901(true, false, 1, 0, true);
                class446.field6192 = class140.method901(true, false, 1, 1, true);
                class332.field4520 = class140.method901(true, false, 1, 2, true);
                class14.field174 = class140.method901(true, false, 1, 3, true);
                class349.field4759 = class140.method901(true, false, 1, 4, true);
                class335.field4572 = class140.method901(true, true, 1, 5, true);
                class150.field1738 = class140.method901(true, true, 1, 6, false);
                class363.field4936 = class140.method901(true, false, 1, 7, true);
                class15.field177 = class140.method901(true, false, 1, 8, true);
                class319.field4287 = class140.method901(true, false, 1, 9, true);
                class364.field4951 = class140.method901(true, false, 1, 10, true);
                field6060 = class140.method901(true, false, 1, 11, true);
                class108.field1294 = class140.method901(true, false, 1, 12, true);
                class201.field2370 = class140.method901(true, false, 1, 13, true);
                class296.field3947 = class140.method901(true, false, 1, 14, false);
                class434.field5936 = class140.method901(true, false, 1, 15, true);
                class90.field1054 = class140.method901(true, false, 1, 16, true);
                class127.field1420 = class140.method901(true, false, 1, 17, true);
                class382.field5236 = class140.method901(true, false, 1, 18, true);
                class267.field3455 = class140.method901(true, false, 1, 19, true);
                class412.field5672 = class140.method901(true, false, 1, 20, true);
                class424.field5813 = class140.method901(true, false, 1, 21, true);
                class429.field5867 = class140.method901(true, false, 1, 22, true);
                class33.field365 = class140.method901(true, true, 1, 23, true);
                class28.field322 = class140.method901(true, false, 1, 24, true);
                class421.field5773 = class140.method901(true, false, 1, 25, true);
                class282.field3682 = class140.method901(true, true, 1, 26, true);
                class316.field4248 = class140.method901(true, false, 1, 27, true);
                class259.field3342 = class140.method901(true, true, 1, 28, true);
                class263.field3378 = class76.field926.method434(class373.field5057, -8192);
                class283.field3704 = 30;
                class298.field3965 = 15;
            } else {
                class263.field3378 = class319.field4289.method434(class373.field5057, -8192);
                class298.field3965 = 12;
            }
        } else if (class283.field3704 == 30) {
            int var8 = 0;
            for (int var9 = 0; var9 < 29; var9++) {
                var8 += class330.field4506[var9].method916(-46) * class192.field2256[var9] / 100;
            }
            if (var8 == 100) {
                class263.field3378 = class384.field5258.method434(class373.field5057, -8192);
                class298.field3965 = 20;
                class55.method311(arg0 ^ 0xFFFFB16A, class15.field177);
                class362.method2274(-24744, class15.field177);
                class283.field3704 = 40;
            } else {
                if (var8 != 0) {
                    class263.field3378 = class302.field4043.method434(class373.field5057, -8192) + var8 + "%";
                }
                class298.field3965 = 20;
            }
        } else if (class283.field3704 == 40) {
            if (class259.field3342.method1804(-115)) {
                this.method2704(class259.field3342.method1805(1, true), (byte) -4);
                class263.field3378 = class281.field3640.method434(class373.field5057, -8192);
                class283.field3704 = 50;
                class298.field3965 = 25;
            } else {
                class263.field3378 = class225.field2860.method434(class373.field5057, -8192) + class259.field3342.method1823((byte) -104) + "%";
                class298.field3965 = 25;
            }
        } else if (class283.field3704 == 50) {
            class453.method2800(class373.field5049, (byte) -111, 2, 22050);
            class217.field2666 = new class229();
            class217.field2666.method1432(9, (byte) 120, 128);
            class252.field3301 = class334.method2138(class357.field4845, 22050, class401.field5525, 0, arg0 ^ 0xFFFFB16A);
            class252.field3301.method1110(class217.field2666, 100);
            class162.method1033((byte) 116, class217.field2666, class296.field3947, class434.field5936, class349.field4759);
            class424.field5811 = class334.method2138(class357.field4845, 2048, class401.field5525, 1, -1);
            class352.field4781 = new class292();
            class424.field5811.method1110(class352.field4781, 126);
            class265.field3418 = new class451(22050, class247.field3267);
            class421.field5761 = class150.field1738.method1806((byte) -93, "scape main");
            class263.field3378 = class440.field6067.method434(class373.field5057, arg0 - 28309);
            class298.field3965 = 30;
            class283.field3704 = 60;
        } else if (class283.field3704 == 60) {
            int var10 = class238.method1522(class201.field2370, class15.field177, (byte) -26);
            int var11 = class428.method2610(255);
            if (var11 > var10) {
                class263.field3378 = class247.field3263.method434(class373.field5057, -8192) + var10 * 100 / var11 + "%";
                class298.field3965 = 35;
            } else {
                class263.field3378 = class238.field3147.method434(class373.field5057, -8192);
                class283.field3704 = 70;
                class298.field3965 = 35;
            }
        } else if (class283.field3704 == 70) {
            int var12 = class112.method654((byte) 113, class15.field177);
            int var13 = class296.method1884(true);
            if (var13 > var12) {
                class263.field3378 = class268.field3467.method434(class373.field5057, arg0 ^ 0xFFFFAE95) + var12 * 100 / var13 + "%";
                class298.field3965 = 40;
            } else {
                class263.field3378 = class432.field5905.method434(class373.field5057, -8192);
                class283.field3704 = 80;
                class298.field3965 = 40;
            }
        } else if (class283.field3704 == 80) {
            if (class282.field3682.method1804(113)) {
                class450.field6292 = new class150(class282.field3682, class319.field4287, class15.field177);
                class263.field3378 = class5.field38.method434(class373.field5057, arg0 ^ 0xFFFFAE95);
                class298.field3965 = 45;
                class283.field3704 = 90;
            } else {
                class263.field3378 = class387.field5284.method434(class373.field5057, -8192) + class282.field3682.method1823((byte) -111) + "%";
                class298.field3965 = 45;
            }
        } else if (class283.field3704 == 90) {
            class263.field3378 = class272.field3506.method434(class373.field5057, -8192);
            class283.field3704 = 95;
            class298.field3965 = 50;
        } else if (class283.field3704 == 95) {
            if (class11.field132) {
                class276.field3580 = 0;
                class121.field1382 = 0;
                class414.field5684 = 0;
                class192.field2254 = 0;
                class444.field6135 = 1;
            }
            class11.field132 = true;
            class362.method2273(class401.field5525, (byte) 111);
            class49.method274(42);
            class336.method2155(class121.field1382, arg0 ^ 0xFFFFB112, false);
            class263.field3378 = class79.field967.method434(class373.field5057, -8192);
            class298.field3965 = 55;
            class283.field3704 = 100;
        } else if (class283.field3704 == 100) {
            class225.method1389(class267.field3454, arg0 ^ 0x4ECB, class15.field177, class201.field2370);
            class263.field3378 = class354.field4812.method434(class373.field5057, arg0 - 28309);
            class298.field3965 = 60;
            class259.method1637(5, (byte) 79);
            class283.field3704 = 110;
        } else if (class283.field3704 == 110) {
            byte var14 = 0;
            class332.field4520.method1804(-115);
            int var15 = var14 + class332.field4520.method1823((byte) -99);
            class90.field1054.method1804(-112);
            int var16 = var15 + class90.field1054.method1823((byte) -124);
            class127.field1420.method1804(-109);
            int var17 = var16 + class127.field1420.method1823((byte) -115);
            class382.field5236.method1804(-113);
            int var18 = var17 + class382.field5236.method1823((byte) -93);
            class267.field3455.method1804(21);
            int var19 = var18 + class267.field3455.method1823((byte) -127);
            class412.field5672.method1804(arg0 ^ 0x4EEF);
            int var20 = var19 + class412.field5672.method1823((byte) -117);
            class424.field5813.method1804(-121);
            int var21 = var20 + class424.field5813.method1823((byte) -91);
            class429.field5867.method1804(26);
            int var22 = var21 + class429.field5867.method1823((byte) -101);
            class28.field322.method1804(103);
            int var23 = var22 + class28.field322.method1823((byte) -118);
            class421.field5773.method1804(-123);
            int var24 = var23 + class421.field5773.method1823((byte) -90);
            class316.field4248.method1804(52);
            int var25 = var24 + class316.field4248.method1823((byte) -126);
            if (var25 < 1100) {
                class263.field3378 = class40.field479.method434(class373.field5057, arg0 ^ 0xFFFFAE95) + var25 / 11 + "%";
                class298.field3965 = 65;
            } else {
                class152.method978(class332.field4520, (byte) -111);
                class416.method2562(-113, class332.field4520);
                class298.method1895(class332.field4520, 25008);
                class33.method217(class363.field4936, class332.field4520, true);
                class422.method2587(class363.field4936, class90.field1054, (byte) 77, true, class373.field5057);
                class349.method2223(true, class382.field5236, arg0 ^ 0x4E15, class363.field4936, class373.field5057);
                class113.method659(class267.field3455, class373.field5057, -1, true, class363.field4936);
                class339.method2174(class332.field4520, -124);
                class170.method1085(class446.field6192, arg0 - 20225, class228.field2876, class412.field5672);
                class51.method292((byte) 97, class332.field4520);
                class66.method378(-96, class363.field4936, class424.field5813);
                class383.method2385(class429.field5867, arg0 ^ 0x4E8B);
                class433.method2640(class332.field4520, true);
                class432.method2636(class14.field174, class363.field4936, class201.field2370, class15.field177, arg0 - 20118);
                class59.method340(85, class332.field4520);
                class190.method1180(class127.field1420, -32654);
                class140.method896(class421.field5773, 1, new class247(), class28.field322);
                class79.method501(87, class28.field322, class421.field5773);
                class32.method211(class332.field4520, (byte) 39);
                class180.method1129(class332.field4520, (byte) -9);
                class434.method2647(-1, class332.field4520);
                class270.method1702(class332.field4520, class15.field177, false);
                class209.method1284(34, class332.field4520, class15.field177);
                class249.method1622(arg0 - 20117, class332.field4520);
                class146.method946(class15.field177, class332.field4520, false);
                class173.method1089(arg0 ^ 0xFFFFFFD3, class332.field4520);
                class28.method178(arg0 - 20102, class332.field4520);
                class263.field3378 = class416.field5695.method434(class373.field5057, -8192);
                class298.field3965 = 65;
                class67.method389(arg0 - 20228);
                class283.field3704 = 120;
            }
        } else if (class283.field3704 == 120) {
            int var26 = class413.method2553(class15.field177, (byte) -34);
            int var27 = class285.method1808(true);
            if (var27 > var26) {
                class263.field3378 = class280.field3621.method434(class373.field5057, arg0 - 28309) + var26 * 100 / var27 + "%";
                class298.field3965 = 70;
            } else {
                class244.method1606(class15.field177, 5356, class267.field3454);
                class207.method1268(-16998, class333.field4546);
                class263.field3378 = class249.field3280.method434(class373.field5057, -8192);
                class298.field3965 = 70;
                class283.field3704 = 130;
            }
        } else if (class283.field3704 == 130) {
            class263.field3378 = class40.field469.method434(class373.field5057, arg0 ^ 0xFFFFAE95);
            class283.field3704 = 140;
            class298.field3965 = 75;
        } else if (class283.field3704 == 140) {
            if (class364.field4951.method1798("huffman", (byte) 86, "")) {
                class157 var28 = new class157(class364.field4951.method1800("huffman", "", true));
                class384.method2391((byte) 126, var28);
                class263.field3378 = class388.field5295.method434(class373.field5057, arg0 ^ 0xFFFFAE95);
                class283.field3704 = 150;
                class298.field3965 = 80;
            } else {
                class263.field3378 = class381.field5186.method434(class373.field5057, -8192) + "0%";
                class298.field3965 = 80;
            }
        } else if (class283.field3704 == 150) {
            if (!class14.field174.method1804(arg0 ^ 0x4EAC)) {
                class263.field3378 = class291.field3846.method434(class373.field5057, -8192) + class14.field174.method1823((byte) -102) * 3 / 4 + "%";
                class298.field3965 = 85;
            } else if (!class108.field1294.method1804(59)) {
                class263.field3378 = class291.field3846.method434(class373.field5057, -8192) + (class108.field1294.method1823((byte) -98) / 10 + 75) + "%";
                class298.field3965 = 85;
            } else if (!class201.field2370.method1804(89)) {
                class263.field3378 = class291.field3846.method434(class373.field5057, -8192) + (class201.field2370.method1823((byte) -107) / 20 + 85) + "%";
                class298.field3965 = 85;
            } else if (class33.field365.method1818((byte) 35, "details")) {
                class224.method1377(class33.field365);
                class190.method1181(1024, class316.field4248);
                class406.method2531((byte) 74, class363.field4936, class450.field6292);
                class263.field3378 = class238.field3148.method434(class373.field5057, -8192);
                class283.field3704 = 160;
                class298.field3965 = 85;
            } else {
                class263.field3378 = class291.field3846.method434(class373.field5057, -8192) + (class33.field365.method1790("details", arg0 ^ 0x4E95) / 10 + 90) + "%";
                class298.field3965 = 85;
            }
        } else if (class283.field3704 == 160) {
            int var29 = class304.method1931(1003);
            if (var29 == -1) {
                class263.field3378 = class369.field5024.method434(class373.field5057, -8192);
                class298.field3965 = 90;
            } else if (var29 == 7 || var29 == 9) {
                this.method1758("worldlistfull", 0);
                class259.method1637(1000, (byte) 79);
            } else if (class236.field3103) {
                class263.field3378 = class30.field327.method434(class373.field5057, -8192);
                class283.field3704 = 170;
                class298.field3965 = 90;
            } else {
                this.method1758("worldlistio_" + var29, 0);
                class259.method1637(1000, (byte) 79);
            }
        } else if (class283.field3704 == 170) {
            class51.field597 = new String[class341.field4650];
            class53.field618 = new boolean[class192.field2253];
            class198.field2338 = new int[class192.field2253];
            for (int var30 = 0; var30 < class192.field2253; var30++) {
                if (class18.method104(var30, (byte) -122).field1397 == 0) {
                    class53.field618[var30] = true;
                    class405.field5612++;
                }
                class198.field2338[var30] = -1;
            }
            class194.method1198(107);
            class72.field889 = class14.field174.method1806((byte) -127, "loginscreen");
            class335.field4572.method1799(true, false, (byte) 111);
            class150.field1738.method1799(true, true, (byte) 96);
            class15.field177.method1799(true, true, (byte) 121);
            class201.field2370.method1799(true, true, (byte) 106);
            class364.field4951.method1799(true, true, (byte) 103);
            class14.field174.method1799(true, true, (byte) 105);
            class421.field5757 = true;
            class332.field4520.field3759 = 2;
            class127.field1420.field3759 = 2;
            class90.field1054.field3759 = 2;
            class382.field5236.field3759 = 2;
            class267.field3455.field3759 = 2;
            class412.field5672.field3759 = 2;
            class424.field5813.field3759 = 2;
            class56.method312(-1, true, -1, class444.field6135, false);
            class263.field3378 = class249.field3281.method434(class373.field5057, arg0 - 28309);
            class283.field3704 = 180;
            class298.field3965 = 95;
        } else if (arg0 == 20117 && class283.field3704 == 180) {
            class169.method1074(true, -85);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 1996)
    public static final void method2692() {
        for (int var0 = -1; var0 < class450.field6291 + class106.field1263; var0++) {
            class204 var1;
            if (var0 < 0) {
                var1 = class143.field1684;
            } else if (var0 < class450.field6291) {
                var1 = class212.field2584[class304.field4083[var0]];
            } else {
                var1 = class220.field2726[class437.field5984[var0 - class450.field6291]];
            }
            if (var1.field2413 >= 0) {
                int var2 = var1.method841(true);
                if ((var2 & 0x1) == 0) {
                    if ((var1.field1516 & 0x7F) != 0 || (var1.field1514 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var1.field1516 & 0x7F) != 64 || (var1.field1514 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var2 == 1) {
                    int var3 = var1.field1516 >> 7;
                    int var4 = var1.field1514 >> 7;
                    if (var1.field2413 > class15.field180[var3][var4]) {
                        class15.field180[var3][var4] = var1.field2413;
                        class330.field4498[var3][var4] = 1;
                    } else if (class15.field180[var3][var4] == var1.field2413) {
                        var10002 = class330.field4498[var3][var4]++;
                    }
                } else {
                    int var5 = (var2 - 1) * 64 + 60;
                    int var6 = var1.field1516 - var5 >> 7;
                    int var7 = var1.field1514 - var5 >> 7;
                    int var8 = var1.field1516 + var5 >> 7;
                    int var9 = var1.field1514 + var5 >> 7;
                    for (int var10 = var6; var10 <= var8; var10++) {
                        for (int var11 = var7; var11 <= var9; var11++) {
                            if (var1.field2413 > class15.field180[var10][var11]) {
                                class15.field180[var10][var11] = var1.field2413;
                                class330.field4498[var10][var11] = 1;
                            } else if (class15.field180[var10][var11] == var1.field2413) {
                                var10002 = class330.field4498[var10][var11]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 2089)
    public final void method1774(int arg0) {
        field6049++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class334.method2139((byte) 83);
        class296.field3943 = new class275(class401.field5525);
        class235.field3094 = new class381();
        if (~class173.field2003 != arg0) {
            class368.field5018 = new byte[50][];
        }
        class282.method1776(~arg0, class401.field5525);
        if (class94.field1105 == 0) {
            class296.field3944 = this.getCodeBase().getHost();
            class116.field1342 = 43594;
            class22.field237 = 443;
        } else if (class94.field1105 == 1) {
            class296.field3944 = this.getCodeBase().getHost();
            class22.field237 = class215.field2659 + 50000;
            class116.field1342 = class215.field2659 + 40000;
        } else if (class94.field1105 == 2) {
            class116.field1342 = class215.field2659 + 40000;
            class22.field237 = class215.field2659 + 50000;
            class296.field3944 = "127.0.0.1";
        }
        class389.field5303 = class22.field237;
        class249.field3279 = class116.field1342;
        class354.field4816 = class116.field1342;
        class330.field4505 = class296.field3944;
        if (class441.field6075 == 3) {
            class388.field5290 = class215.field2659;
        }
        class382.field5235 = class70.field873 = class223.field2801 = class401.field5536 = new short[256];
        class70.field874 = class354.field4816;
        if (class31.field356 == 1) {
            class423.field5793 = class378.field5151;
            class384.field5257 = true;
            class319.field4293 = 0;
            class184.field2127 = class310.field4203;
            class345.field4684 = class103.field1212;
            class314.field4231 = 16777215;
            class50.field579 = class380.field5176;
        } else {
            class50.field579 = class250.field3289;
            class423.field5793 = class437.field5994;
            class345.field4684 = class148.field1729;
            class184.field2127 = class423.field5796;
        }
        class261.field3359 = class139.method893((byte) -115, class357.field4845);
        class358.field4866 = class101.method612(class357.field4845, true, 8);
        class97.field1143 = class187.method1156((byte) -107);
        if (class97.field1143 != null) {
            class97.field1143.method372((byte) -96, class357.field4845);
        }
        class350.field4765 = class441.field6075;
        try {
            if (class401.field5525.field6086 != null) {
                class162.field1890 = new class432(class401.field5525.field6086, 5200, 0);
                for (int var3 = 0; var3 < 29; var3++) {
                    class419.field5715[var3] = new class432(class401.field5525.field6087[var3], 6000, 0);
                }
                class217.field2668 = new class432(class401.field5525.field6085, 6000, 0);
                class399.field5404 = new class334(255, class162.field1890, class217.field2668, 500000);
                class357.field4846 = new class432(class401.field5525.field6079, 24, 0);
                class401.field5525.field6086 = null;
                class401.field5525.field6087 = null;
                class401.field5525.field6079 = null;
                class401.field5525.field6085 = null;
            }
        } catch (IOException var4) {
            class357.field4846 = null;
            class217.field2668 = null;
            class162.field1890 = null;
            class399.field5404 = null;
        }
        if (class94.field1105 != 0) {
            class139.field1615 = true;
        }
        if (class31.field356 == 0) {
            class18.field199 = class379.field5158.method434(class373.field5057, -8192);
        } else if (class31.field356 == 1) {
            class18.field199 = class191.field2248.method434(class373.field5057, -8192);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V", line = 2206)
    public static void method2693(boolean arg0) {
        if (!arg0) {
            field6060 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 2218)
    public final void method1757(int arg0) {
        field6045++;
        if (class174.field2017 == 1000) {
            return;
        }
        class106.field1273++;
        if (class106.field1273 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class314.field4237 = var2.get(11) * 600 + (var2.get(12) * 10) + (var2.get(13) / 6);
            class392.field5343.setSeed((long) class314.field4237);
        }
        this.method2698(arg0 - 1341);
        if (class341.field4649 != null) {
            class341.field4649.method985((byte) 22);
        }
        class379.method2353(-6804);
        class94.method589(arg0 ^ 0xFFFFE327);
        class261.field3359.method630(2);
        class358.field4866.method1853(0);
        if (class97.field1143 != null) {
            int var3 = class97.field1143.method377((byte) -91);
            class236.field3097 = var3;
        }
        if (arg0 != 7341) {
            field6059 = -55;
        }
        if (class267.field3454 != null) {
            class267.field3454.method706((int) class164.method1038(arg0 + 1294));
        }
        class72.method431(true);
        class40.field481 = 0;
        for (class57 var4 = class261.field3359.method629((byte) 124); var4 != null && class40.field481 < 128; var4 = class261.field3359.method629((byte) 120)) {
            if (var4.method316((byte) -125) != 1) {
                char var5 = var4.method318(true);
                if (!class28.method173(-1) || var5 != '`' && var5 != '§') {
                    class6.field56[class40.field481] = var4;
                    class40.field481++;
                } else if (class300.method1907(true)) {
                    class112.method656(false);
                } else {
                    class80.method508(-16238);
                }
            }
        }
        class208.field2516 = null;
        for (class373 var6 = class358.field4866.method1859(-12196); var6 != null; var6 = class358.field4866.method1859(-12196)) {
            int var7 = var6.method6(false);
            if (var7 == -1) {
                class186.field2159.method1696(false, var6);
            } else if (class387.method2409(-6, var7)) {
                class208.field2516 = var6;
            }
        }
        if (class300.method1907(true)) {
            class91.method569(26026);
        }
        if (class174.field2017 == 0) {
            this.method2691(20117);
            class274.method1722(arg0 ^ 0xFFFFA140);
        } else if (class174.field2017 == 5) {
            this.method2691(20117);
            class274.method1722(-16915);
        } else if (class174.field2017 == 25 || class174.field2017 == 28) {
            class276.method1738((byte) -110);
        }
        if (class174.field2017 == 10) {
            this.method2690(arg0 + 19568);
            class358.method2266((byte) -72);
            class8.method36(arg0 ^ 0x1CAD);
            class218.method1325(-2637);
        } else if (class174.field2017 == 30) {
            class102.method614(false);
        } else if (class174.field2017 == 40) {
            class218.method1325(-2637);
            if (class406.field5620 != -3) {
                if (class406.field5620 == 15) {
                    class238.method1526(false);
                } else if (class406.field5620 != 2) {
                    class335.method2151(116);
                }
            }
        }
        class258.method1634(class267.field3454, false);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V", line = 2360)
    private final void method2694(int arg0, int arg1) {
        class168.field1963 = arg1;
        class383.field5239 = null;
        class235.field3094.field5214++;
        field6047++;
        class12.field155 = null;
        class235.field3094.field5215 = arg0;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 2372)
    public final void init() {
        field6055++;
        if (!this.method1769(true)) {
            return;
        }
        class215.field2659 = Integer.parseInt(this.getParameter("worldid"));
        class94.field1105 = Integer.parseInt(this.getParameter("modewhere"));
        if (class94.field1105 < 0 || class94.field1105 > 1) {
            class94.field1105 = 0;
        }
        class173.field2003 = Integer.parseInt(this.getParameter("modewhat"));
        if (class173.field2003 < 0 || class173.field2003 > 2) {
            class173.field2003 = 0;
        }
        try {
            class373.field5057 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var7) {
            class373.field5057 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class41.field486 = true;
        } else {
            class41.field486 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class314.field4219 = true;
        } else {
            class314.field4219 = false;
        }
        String var3 = this.getParameter("game");
        if (var3 != null && var3.equals("1")) {
            class31.field356 = 1;
        } else {
            class31.field356 = 0;
        }
        try {
            class333.field4549 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var6) {
            class333.field4549 = 0;
        }
        class220.field2727 = this.getParameter("quiturl");
        class175.field2033 = this.getParameter("settings");
        if (class175.field2033 == null) {
            class175.field2033 = "";
        }
        String var4 = this.getParameter("country");
        if (var4 != null) {
            try {
                class104.field1230 = Integer.parseInt(var4);
            } catch (Exception var5) {
                class104.field1230 = 0;
            }
        }
        class283.field3692 = Integer.parseInt(this.getParameter("colourid"));
        if (class283.field3692 < 0 || class283.field3692 >= class295.field3898.length) {
            class283.field3692 = 0;
        }
        class346.field4701 = this;
        this.method1765(503, 765, (byte) 46, 568, class173.field2003 + 32);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 2447)
    public static final void method2695() {
        int var0 = class194.field2297 ? class450.field6291 : class450.field6291 + class106.field1263;
        for (int var1 = -1; var1 < var0; var1++) {
            class204 var2;
            if (var1 < 0) {
                var2 = class143.field1684;
            } else if (var1 < class450.field6291) {
                var2 = class212.field2584[class304.field4083[var1]];
            } else {
                var2 = class220.field2726[class437.field5984[var1 - class450.field6291]];
            }
            var2.field2438 = 0;
            if (var2.field2413 < 0) {
                var2.field2460 = false;
            } else {
                int var3 = var2.method841(true);
                if ((var3 & 0x1) == 0) {
                    if ((var2.field1516 & 0x7F) != 0 || (var2.field1514 & 0x7F) != 0) {
                        var2.field2460 = false;
                        continue;
                    }
                } else if ((var2.field1516 & 0x7F) != 64 || (var2.field1514 & 0x7F) != 64) {
                    var2.field2460 = false;
                    continue;
                }
                int var10002;
                if (var3 == 1) {
                    int var4 = var2.field1516 >> 7;
                    int var5 = var2.field1514 >> 7;
                    if (class15.field180[var4][var5] != var2.field2413) {
                        var2.field2460 = true;
                        continue;
                    }
                    if (class330.field4498[var4][var5] > 1) {
                        var10002 = class330.field4498[var4][var5]--;
                        var2.field2460 = true;
                        continue;
                    }
                } else {
                    int var6 = (var3 - 1) * 64 + 60;
                    int var7 = var2.field1516 - var6 >> 7;
                    int var8 = var2.field1514 - var6 >> 7;
                    int var9 = var2.field1516 + var6 >> 7;
                    int var10 = var2.field1514 + var6 >> 7;
                    if (!class22.method132(var8, var9, var7, var10, -108, var2.field2413)) {
                        for (int var11 = var7; var11 <= var9; var11++) {
                            for (int var12 = var8; var12 <= var10; var12++) {
                                if (class15.field180[var11][var12] == var2.field2413) {
                                    var10002 = class330.field4498[var11][var12]--;
                                }
                            }
                        }
                        var2.field2460 = true;
                        continue;
                    }
                }
                if (var2 instanceof class131 && var2.field2487 != null && class106.field1273 >= var2.field2488 && class106.field1273 < var2.field2492) {
                    ((class131) var2).field1474 = false;
                }
                var2.field2460 = false;
                var2.field1521 = class189.method1170(var2.field1514, var2.field1516, true, class43.field513);
                class94.method591(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Laq;)Lwi;", line = 2563)
    public static final class357 method2696(class453 arg0) {
        class357 var1 = (class357) class368.field5013.method2218(1, ((long) arg0.field6475 << 32) + (long) arg0.field6364);
        return var1 == null ? arg0.field6337 : var1;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 2568)
    public static final void main(String[] arg0) {
        field6053++;
        try {
            if (arg0.length != 4) {
                class222.method1350((byte) -85, "argument count");
            }
            class215.field2659 = Integer.parseInt(arg0[0]);
            class94.field1105 = 2;
            if (arg0[1].equals("live")) {
                class173.field2003 = 0;
            } else if (arg0[1].equals("rc")) {
                class173.field2003 = 1;
            } else if (arg0[1].equals("wip")) {
                class173.field2003 = 2;
            } else {
                class222.method1350((byte) -43, "modewhat");
            }
            class373.field5057 = class300.method1904(arg0[2], 77);
            if (class373.field5057 == -1) {
                if (arg0[2].equals("english")) {
                    class373.field5057 = 0;
                } else if (arg0[2].equals("german")) {
                    class373.field5057 = 1;
                } else {
                    class222.method1350((byte) -33, "language");
                }
            }
            class41.field486 = false;
            class314.field4219 = false;
            if (arg0[3].equals("game0")) {
                class31.field356 = 0;
            } else if (arg0[3].equals("game1")) {
                class31.field356 = 1;
            } else {
                class222.method1350((byte) -35, "game");
            }
            class283.field3692 = class31.field356;
            class333.field4549 = 0;
            class104.field1230 = 0;
            class175.field2033 = "";
            client var1 = new client();
            class346.field4701 = var1;
            var1.method1759(class173.field2003 + 32, false, class31.field356 == 1 ? "stellardawn" : "runescape", 568, 1024, 29, 768, 100);
            class167.field1942.setLocation(40, 40);
        } catch (Exception var3) {
            class402.method2510((String) null, var3, -29832);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 2631)
    public final void method1760(byte arg0) {
        field6048++;
        method2693(false);
        class344.method2191(arg0 + 22);
        class12.method61((byte) -16);
        class72.method432(2);
        class320.method2001((byte) -115);
        class287.method1831(-31001);
        class430.method2624(98);
        class179.method1120(false);
        class161.method1025(true);
        class349.method2226(-127);
        class281.method1772(-82);
        class330.method2122(0);
        class450.method2784((byte) -42);
        class118.method782(arg0 - 99);
        class220.method1340(1);
        class242.method1541(-118);
        class270.method1692(arg0 ^ 0x14);
        class65.method374(-26238);
        class399.method2463(false);
        class381.method2364(-2);
        class275.method1731((byte) -52);
        class153.method983(123);
        class141.method908(-2);
        class432.method2629(arg0 ^ 0xFFFFA437);
        class334.method2143(arg0 ^ 0xFFFFDE0D);
        class365.method2296((byte) 58);
        class298.method1893((byte) -113);
        class195.method1208((byte) 123);
        class392.method2437(-5);
        class76.method454(0);
        class288.method1841(arg0 ^ 0x59);
        class453.method2811((byte) 119);
        class215.method1316(741029735);
        class131.method838(false);
        class440.method2709((byte) 69);
        class336.method2154((byte) -109);
        class176.method1106((byte) 58);
        class451.method2790(62);
        class434.method2655((byte) 123);
        class156.method999(false);
        class204.method1253((byte) -128);
        class31.method199((byte) -77);
        class316.method1983(49);
        class186.method1152((byte) 123);
        class228.method1395(0);
        class244.method1602(arg0 + 22);
        class357.method2262(-1);
        class423.method2594(-11251);
        class197.method1219((byte) -103);
        class347.method2205((byte) 72);
        class402.method2509(-6740);
        class386.method2403(-10862);
        class279.method1746(0);
        class291.method1861(8597);
        class92.method575((byte) 59);
        class33.method218(arg0 ^ 0x15);
        class127.method820(-1);
        class212.method1298((byte) -98);
        class62.method360(58);
        class335.method2148((byte) -56);
        class140.method895(65280);
        class265.method1664(18570);
        class300.method1906((byte) 65);
        class46.method268((byte) -63);
        class148.method954(192);
        class201.method1237(20846);
        class249.method1621(-1);
        class346.method2201((byte) -94);
        class446.method2758(arg0 + 26);
        class419.method2573((byte) -84);
        class342.method2185(-24855);
        class4.method17(105);
        class52.method301((byte) -82);
        class307.method1949((byte) 99);
        class59.method334(0);
        class158.method1011(arg0 + 26);
        class259.method1636(-1);
        class184.method1146(-112);
        class340.method2180((byte) -100);
        class255.method1630(126);
        class147.method953(arg0 ^ 0x2A72);
        class210.method1288(-120);
        class325.method2041(arg0 + 141);
        class112.method655(10);
        class319.method1994((byte) 54);
        class121.method801(false);
        class15.method86(126);
        class27.method170(arg0 + 82);
        class431.method2626(arg0 + 31308);
        class198.method1221(59);
        class168.method1068(-295);
        class86.method526();
        class18.method111(true);
        class174.method1097((byte) -69);
        class429.method2617(-13806);
        class258.method1635((byte) -23);
        class367.method2316(121);
        class94.method587((byte) 122);
        class236.method1517(0);
        class93.method579();
        class224.method1379();
        class115.method670(arg0 + 54);
        if (arg0 != -22) {
            this.method2698(-114);
        }
        class278.method1743(-62);
        class117.method682();
        class35.method225(44);
        class222.method1348(-1);
        class134.method874(24169);
        class150.method958(65);
        class108.method646(93);
        class358.method2264(-124);
        class146.method951(false);
        class192.method1184(false);
        class354.method2245((byte) -108);
        class352.method2236((byte) -111);
        class203.method1244(20);
        class214.method1310((byte) -122);
        class89.method553(-1);
        class280.method1751(0);
        class397.method2452(true);
        class252.method1626((byte) 39);
        class437.method2671((byte) -93);
        class167.method1065(-7524);
        class326.method2045(15632);
        class91.method571(-116);
        class49.method271(2);
        class130.method834(arg0 ^ 0x2);
        class90.method559(-125);
        class247.method1616(arg0 ^ 0x6B00);
        class299.method1901((byte) -128);
        class276.method1733((byte) 92);
        class138.method889((byte) -37);
        class66.method381(-88);
        class438.method2681(-2745);
        class125.method810(true);
        class333.method2136(arg0 + 22);
        class235.method1514(false);
        class157.method1005(109);
        class293.method1872(20173);
        class384.method2397((byte) -124);
        class193.method1188();
        class54.method305(false);
        class104.method621(arg0 ^ 0xFFFFFFEB);
        class107.method642(-1319);
        class133.method867((byte) 81);
        class22.method131(-26117);
        class175.method1102(arg0 ^ 0xFFFFFFEB);
        class219.method1335(true);
        class69.method397();
        class439.method2683((byte) 16);
        class264.method1661(false);
        class6.method26((byte) 124);
        class388.method2411(arg0 + 21);
        class226.method1390((byte) 124);
        class364.method2285(true);
        class272.method1714(1);
        class42.method259(arg0 ^ 0x77);
        class416.method2564(-58);
        class241.method1535((byte) 44);
        class202.method1241((byte) -102);
        class17.method101(74);
        class391.method2434(true);
        class306.method1943(arg0 ^ 0x7D);
        class190.method1176(0);
        class173.method1091(10);
        class113.method660((byte) 93);
        class295.method1879((byte) -72);
        class208.method1276(arg0 ^ 0xFFFFFFEA);
        class394.method2447(arg0 ^ 0xFFFFFFD8);
        class362.method2275((byte) -106);
        class273.method1718();
        class67.method387((byte) 112);
        class136.method881(true);
        class23.method143(arg0 - 106);
        class302.method1922(-45);
        class303.method1925(arg0 - 21173);
        class187.method1154(10070);
        class30.method186(false);
        class414.method2556(64);
        class14.method84(16);
        class191.method1182((byte) -26);
        class225.method1388((byte) 114);
        class380.method2362((byte) -3);
        class211.method1290((byte) -104);
        class55.method309((byte) -60);
        class250.method1624(127);
        class99.method606();
        class103.method617(-125);
        class345.method2193(-91);
        class274.method1721(0);
        class355.method2250(122);
        class263.method1659((byte) 96);
        class411.method2546((byte) -113);
        class207.method1266(true);
        class398.method2460(arg0 + 23);
        class412.method2550((byte) 71);
        class271.method1712();
        class269.method1685((byte) 69);
        class368.method2322(false);
        class406.method2526((byte) 84);
        class277.method1740(false);
        class29.method181();
        class199.method1228();
        class143.method922((byte) -38);
        class28.method176(arg0 - 71);
        class369.method2324(7);
        class41.method256(768);
        class20.method119((byte) -87);
        class122.method804((byte) -123);
        class24.method154();
        class454.method2814();
        class390.method2423(arg0 + 136);
        class209.method1283(-127);
        class88.method550();
        class405.method2522(7);
        class194.method1201(-49);
        class341.method2181(-34);
        class308.method1960(121);
        class267.method1672((byte) -97);
        class283.method1783(-120);
        class286.method1824(true);
        class314.method1977(77);
        class296.method1881((byte) -126);
        class421.method2583((byte) 118);
        class56.method313((byte) -128);
        class213.method1303(-7599);
        class169.method1073(arg0 ^ 0x64);
        class382.method2382(30);
        class51.method285(-1);
        class268.method1678((byte) 120);
        class40.method253(51);
        class376.method2342(-12906);
        class163.method1035(63);
        class234.method1509(22);
        class420.method2576(arg0 ^ 0x7A);
        class70.method416(-13886);
        class318.method1988(-91);
        class8.method39((byte) 93);
        class5.method19(-110);
        class98.method604(0);
        class97.method599(false);
        class180.method1127(91);
        class378.method2347((byte) -43);
        class223.method1355((byte) -88);
        class361.method2269(-18519);
        class79.method503(0);
        class106.method639(109);
        class126.method817((byte) -127);
        class261.method1654((byte) 44);
        class374.method2339(37);
        class310.method1965((byte) -122);
        class217.method1318(9556);
        class181.method1130((byte) -8);
        class39.method248(4);
        class301.method1910((byte) 100);
        class387.method2410(6422);
        class449.method2781(false);
        class170.method1081(true);
        class53.method302(0);
        class350.method2230((byte) -44);
        class11.method57(32575);
        class383.method2386(arg0 - 14565);
        class183.method1140(-100);
        class363.method2280(arg0 - 88);
        class96.method598(20655);
        class75.method446(99);
        class395.method2448(76);
        class424.method2599((byte) 14);
        class50.method276((byte) -112);
        class321.method2003((byte) -90);
        class102.method616(-99);
        class87.method538((byte) -124);
        class400.method2489();
        class410.method2543();
        class80.method509(arg0 + 22);
        class332.method2131(arg0 + 22);
        class137.method888((byte) -108);
        class370.method2329((byte) -95);
        class427.method2608((byte) -118);
        class372.method2333(15311);
        class393.method2440(56);
        class284.method1789(-20222);
        class433.method2639((byte) 26);
        class57.method322((byte) -114);
        class373.method2335(79);
        class379.method2354((byte) -119);
        class240.method1534(arg0 ^ 0x4F);
        class162.method1031(false);
        class101.method611((byte) -82);
        class428.method2615(Integer.MAX_VALUE);
        class266.method1666((byte) 101);
        class238.method1527(30);
        class1.method4(0);
        class116.method676((byte) 109);
        class282.method1777(-26000);
        class262.method1655(-1);
        class447.method2778((byte) 94);
        class304.method1932(arg0 + 21);
        class231.method1493(-7130);
        class401.method2498(9722);
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)I", line = 2941)
    public static final int method2697(int arg0) {
        field6046++;
        if (class53.field620 == null) {
            int var1 = -101 / ((arg0 + 47) / 43);
            return class158.field1840 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V", line = 2954)
    private final void method2698(int arg0) {
        field6052++;
        if (arg0 != 6000) {
            this.method2704((byte[]) null, (byte) -53);
        }
        boolean var2 = class235.field3094.method2376(false);
        if (!var2) {
            this.method2688(0);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 2971)
    public static final void method2699() {
        class372.field5042 = 0;
        for (int var0 = 0; var0 < class106.field1263; var0++) {
            class298 var1 = class220.field2726[class437.field5984[var0]];
            if (var1.field2460 && var1.method845(-72) != -1) {
                int var2 = (var1.method841(true) - 1) * 64 + 60;
                int var3 = var1.field1516 - var2 >> 7;
                int var4 = var1.field1514 - var2 >> 7;
                class204 var5 = class194.method1204(true, var3, var4, class43.field513);
                if (var5 != null) {
                    int var6 = var5.field2445;
                    if (var5 instanceof class298) {
                        var6 += 2048;
                    }
                    if (var5.field2438 == 0 && var5.method845(-76) != -1) {
                        class430.field5869[class372.field5042] = var6;
                        class31.field331[class372.field5042] = var6;
                        class372.field5042++;
                        var5.field2438++;
                    }
                    class430.field5869[class372.field5042] = var6;
                    class31.field331[class372.field5042] = var1.field2445 + 2048;
                    class372.field5042++;
                    var5.field2438++;
                }
            }
        }
        class122.method803(0, class372.field5042 - 1, class430.field5869, class31.field331, 104);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V", line = 3023)
    public static final void method2700(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6057++;
        if (arg3 != 10) {
            return;
        }
        if (arg1 == arg2) {
            class336.method2156(arg7, -20, arg5, arg0, arg2, arg4, arg6);
        } else if (class295.field3937 <= arg5 - arg2 && class427.field5844 >= (arg2 + arg5) && arg4 - arg1 >= class53.field624 && (arg1 + arg4) <= class118.field1356) {
            class213.method1306(arg2, arg4, arg5, arg0, arg6, arg1, -5981, arg7);
        } else {
            class196.method1215(arg6, arg5, arg1, (byte) 127, arg2, arg7, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "()V", line = 3050)
    public static final void method2701() {
        for (int var0 = 0; var0 < class22.field232; var0++) {
            int[] var1 = class15.field180[var0];
            for (int var2 = 0; var2 < class196.field2329; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "()V", line = 3068)
    public static final void method2702() {
        int var0 = class194.field2297 ? class450.field6291 : class450.field6291 + class106.field1263;
        for (int var1 = -1; var1 < var0; var1++) {
            class204 var2;
            if (var1 < 0) {
                var2 = class143.field1684;
            } else if (var1 < class450.field6291) {
                var2 = class212.field2584[class304.field4083[var1]];
            } else {
                var2 = class220.field2726[class437.field5984[var1 - class450.field6291]];
            }
            if (var2.field2413 >= 0) {
                int var3 = var2.method841(true);
                if ((var3 & 0x1) == 0) {
                    if ((var2.field1516 & 0x7F) == 0 && (var2.field1514 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var2.field1516 & 0x7F) == 64 && (var2.field1514 & 0x7F) == 64) {
                    continue;
                }
                if (var2 instanceof class131 && var2.field2487 != null && class106.field1273 >= var2.field2488 && class106.field1273 < var2.field2492) {
                    ((class131) var2).field1474 = false;
                }
                var2.field1521 = class189.method1170(var2.field1514, var2.field1516, true, class43.field513);
                class94.method591(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)Z", line = 3112)
    public static final boolean method2703(int arg0) {
        field6050++;
        class266 var1 = (class266) class97.field1138.field3483.field507;
        if (arg0 < 73) {
            method2693(false);
        }
        if (var1 == null || class97.field1138.field3483 == var1) {
            return false;
        } else {
            if (var1.field3424 >= 2000) {
                var1.field3424 -= 2000;
            }
            return var1.field3424 == 1010;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BB)V", line = 3137)
    private final void method2704(byte[] arg0, byte arg1) {
        field6054++;
        class242 var3 = new class242(arg0);
        int var4 = -84 % ((arg1 + 57) / 52);
        while (true) {
            while (true) {
                while (true) {
                    int var5 = var3.method1563(-128);
                    if (var5 == 0) {
                        return;
                    }
                    if (var5 == 1) {
                        int[] var10 = class62.field760 = new int[6];
                        var10[0] = var3.method1587((byte) -102);
                        var10[1] = var3.method1587((byte) -102);
                        var10[2] = var3.method1587((byte) -102);
                        var10[3] = var3.method1587((byte) -102);
                        var10[4] = var3.method1587((byte) -102);
                        var10[5] = var3.method1587((byte) -102);
                    } else if (var5 == 4) {
                        int var6 = var3.method1563(-128);
                        class103.field1213 = new int[var6];
                        for (int var7 = 0; var7 < var6; var7++) {
                            class103.field1213[var7] = var3.method1587((byte) -102);
                            if (class103.field1213[var7] == 65535) {
                                class103.field1213[var7] = -1;
                            }
                        }
                    } else if (var5 == 5) {
                        int var8 = var3.method1563(-128);
                        class89.field1040 = new int[var8];
                        for (int var9 = 0; var9 < var8; var9++) {
                            class89.field1040[var9] = var3.method1587((byte) -102);
                            if (class89.field1040[var9] == 65535) {
                                class89.field1040[var9] = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 3221)
    public final void method1768(int arg0) {
        field6061++;
        if (class174.field2017 == 1000) {
            return;
        }
        long var2 = class102.method613((byte) -54) / 1000000L - class113.field1316;
        class113.field1316 = class102.method613((byte) -54) / 1000000L;
        if (arg0 != -25402) {
            method2701();
        }
        boolean var4 = class136.method880((byte) -3);
        if (var4 && class344.field4679 && class252.field3301 != null) {
            class252.field3301.method1112((byte) -104);
        }
        if (class174.field2017 == 30 || class174.field2017 == 10) {
            if (class290.field3819 != 0L && class290.field3819 < class164.method1038(8635)) {
                class56.method312(class244.field3249, true, class428.field5851, method2697(-97), false);
            } else if (class267.field3454.method761() && class198.field2337) {
                class6.method23((byte) -58);
            }
        }
        if (class53.field620 == null) {
            Container var5;
            if (class167.field1942 == null) {
                var5 = class401.field5525.field6077;
            } else {
                var5 = class167.field1942;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class167.field1942 == var5) {
                Insets var8 = class167.field1942.getInsets();
                var6 -= var8.left + var8.right;
                var7 -= var8.top + var8.bottom;
            }
            if (class283.field3693 != var6 || class450.field6290 != var7) {
                if (class267.field3454 == null || class267.field3454.method770()) {
                    class334.method2139((byte) 108);
                } else {
                    class283.field3693 = var6;
                    class450.field6290 = var7;
                }
                class290.field3819 = class164.method1038(arg0 + 34037) + 500L;
            }
        }
        if (class53.field620 != null && !class178.field2084 && (class174.field2017 == 30 || class174.field2017 == 10)) {
            class56.method312(-1, true, -1, class444.field6135, false);
        }
        boolean var9 = false;
        if (class422.field5790) {
            class422.field5790 = false;
            var9 = true;
        }
        if (var9) {
            class419.method2571(29);
        }
        if (class267.field3454 != null && class267.field3454.method762() || method2697(-91) != 1) {
            class11.method53(16026);
        }
        if (class174.field2017 == 0) {
            class32.method215(class298.field3965, class87.field1006[class283.field3692], class295.field3898[class283.field3692], class131.field1476[class283.field3692], class263.field3378, var9, (byte) 124);
        } else if (class174.field2017 == 5) {
            class363.method2278(class295.field3898[class283.field3692].getRGB(), class87.field1006[class283.field3692].getRGB(), class131.field1476[class283.field3692].getRGB(), var9 | class267.field3454.method762(), class210.field2544, class267.field3454, arg0 ^ 0xFFFF9CD8);
        } else if (class174.field2017 == 10) {
            class334.method2146(4);
        } else if (class174.field2017 == 25 || class174.field2017 == 28) {
            if (class303.field4070 == 1) {
                if (class416.field5700 < class3.field26) {
                    class416.field5700 = class3.field26;
                }
                int var11 = (class416.field5700 - class3.field26) * 50 / class416.field5700;
                class190.method1179(0, class72.field894.method434(class373.field5057, -8192) + "<br>(" + var11 + "%)", true, class55.field636);
            } else if (class303.field4070 == 2) {
                if (class374.field5072 > class330.field4502) {
                    class330.field4502 = class374.field5072;
                }
                int var10 = (class330.field4502 - class374.field5072) * 50 / class330.field4502 + 50;
                class190.method1179(0, class72.field894.method434(class373.field5057, arg0 ^ 0x7CC6) + "<br>(" + var10 + "%)", true, class55.field636);
            } else {
                class190.method1179(0, class72.field894.method434(class373.field5057, arg0 + 17210), true, class55.field636);
            }
        } else if (class174.field2017 == 30) {
            class406.method2534(0, var2);
        } else if (class174.field2017 == 40) {
            class190.method1179(0, class242.field3230.method434(class373.field5057, -8192) + "<br>" + class130.field1450.method434(class373.field5057, -8192), true, class55.field636);
        }
        if (class422.field5781 == 3) {
            for (int var12 = 0; var12 < class319.field4291; var12++) {
                Rectangle var13 = class41.field487[var12];
                if (class287.field3778[var12]) {
                    class267.field3454.method739((byte) -126, -1996553985, var13.x, var13.width, var13.y, var13.height);
                } else if (class326.field4346[var12]) {
                    class267.field3454.method739((byte) -128, -1996554240, var13.x, var13.width, var13.y, var13.height);
                }
            }
        }
        if (class300.method1907(true)) {
            class46.method269(class267.field3454, 30442);
        }
        if ((class174.field2017 == 30 || class174.field2017 == 10) && class422.field5781 == 0 && method2697(120) == 1 && !var9 && class441.field6078.equals("1.1")) {
            int var14 = 0;
            for (int var15 = 0; var15 < class319.field4291; var15++) {
                if (class326.field4346[var15]) {
                    class326.field4346[var15] = false;
                    class370.field5040[var14++] = class41.field487[var15];
                }
            }
            class267.field3454.method713(class370.field5040, var14);
        } else if (class174.field2017 != 0) {
            class267.field3454.method757();
            for (int var16 = 0; var16 < class319.field4291; var16++) {
                class326.field4346[var16] = false;
            }
        }
        if (class355.field4825 == 0) {
            class219.method1330(15L, true);
        } else if (class355.field4825 == 1) {
            class219.method1330(10L, true);
        } else if (class355.field4825 == 2) {
            class219.method1330(5L, true);
        } else if (class355.field4825 == 3) {
            class219.method1330(2L, true);
        }
        if (class421.field5757) {
            class43.method261(5);
        }
        if (class11.field132 && class174.field2017 == 10 && class366.field4983 != -1) {
            class11.field132 = false;
            class362.method2273(class401.field5525, (byte) 93);
        }
    }
}
