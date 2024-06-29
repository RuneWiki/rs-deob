import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class206 extends class287 {

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "[Lid;")
    public class266[] field3257;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "[B")
    public byte[] field3260;

    @OriginalMember(owner = "client!qg", name = "C", descriptor = "[S")
    public short[] field3274;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "[I")
    private int[] field3264;

    @OriginalMember(owner = "client!qg", name = "J", descriptor = "[B")
    public byte[] field3281;

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "[B")
    public byte[] field3268;

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "[Le;")
    public class237[] field3263;

    @OriginalMember(owner = "client!qg", name = "D", descriptor = "I")
    public int field3275;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "[I")
    public static int[] field3262 = new int[25];

    @OriginalMember(owner = "client!qg", name = "H", descriptor = "Ljava/lang/String;")
    public static String field3279 = "Loading interfaces - ";

    @OriginalMember(owner = "client!qg", name = "I", descriptor = "Z")
    public static boolean field3280 = true;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!qg", name = "A", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!qg", name = "B", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!qg", name = "E", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!qg", name = "G", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "Lug;")
    public static class253 field3258;

    @OriginalMember(owner = "client!qg", name = "F", descriptor = "Lug;")
    public static class253 field3277;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "[I")
    public static int[] field3261;

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "[[B")
    public static byte[][] field3269;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lvc;Z)V", line = 10)
    public static final void method1516(class137 arg0, boolean arg1) {
        field3267++;
        class309 var2 = null;
        class326.field5123 = 3;
        class80.method590(true, true);
        class27.field399 = 2;
        class220.field3482 = arg1;
        class196.field3127 = 0;
        class204.field3233 = 255;
        class86.field1164 = true;
        class47.field622 = true;
        class71.field985 = true;
        class198.field3163 = true;
        class202.field3214 = 0;
        class95.field1259 = true;
        class10.field183 = 127;
        class99.field1334 = true;
        class144.field2277 = 127;
        class317.field5019 = true;
        class48.field635 = 0;
        field3280 = true;
        class180.field2926 = 0;
        class187.field3018 = true;
        class14.field240 = true;
        if (class234.field3641 < 96) {
            class151.method1105(0);
        } else {
            class151.method1105(2);
        }
        class332.field5180 = 0;
        class82.field1124 = false;
        class245.field3828 = true;
        class163.field2648 = false;
        class36.field523 = false;
        class232.field3630 = 0;
        class101.field1351 = 0;
        try {
            class114 var3 = arg0.method1010("runescape", true);
            while (var3.field1595 == 0) {
                class272.method1918((byte) 22, 1L);
            }
            if (var3.field1595 == 1) {
                var2 = (class309) var3.field1591;
                byte[] var4 = new byte[(int) var2.method2138((byte) 108)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method2133(var4, var5, (byte) 103, var4.length - var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class273.method1922(15568, new class6(var4));
            }
        } catch (Exception var10) {
        }
        try {
            if (var2 != null) {
                var2.method2135(109);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I[B[ILbj;)Z", line = 94)
    public final boolean method1517(int arg0, byte[] arg1, int[] arg2, class101 arg3) {
        field3271++;
        boolean var5 = true;
        int var6 = 0;
        class266 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field3264[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg3.method700(var9 >> 2, (byte) 2, arg2);
                        } else {
                            var7 = arg3.method701(var9 >> 2, 0, arg2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field3257[var8] = var7;
                        this.field3264[var8] = 0;
                    }
                }
            }
        }
        if (arg0 < 21) {
            this.method1517(-29, (byte[]) null, (int[]) null, (class101) null);
        }
        return var5;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)I", line = 150)
    public static final int method1518(int arg0, int arg1) {
        field3278++;
        int var2 = -109 / ((9 - arg0) / 45);
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IBIIIII)V", line = 181)
    public static final void method1519(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3259++;
        class276.field4262 = 0;
        for (int var7 = -1; var7 < (class232.field3631 + class79.field1083); var7++) {
            class303 var8;
            if (var7 == -1) {
                var8 = class146.field2310;
            } else if (var7 < class232.field3631) {
                var8 = class284.field4403[class81.field1116[var7]];
            } else {
                var8 = class59.field870[class85.field1157[var7 - class232.field3631]];
            }
            if (var8 != null && var8.method1546((byte) 96)) {
                if (var8 instanceof class212) {
                    class161 var9 = ((class212) var8).field3346;
                    if (var9.field2585 != null) {
                        var9 = var9.method1192(-1);
                    }
                    if (var9 == null) {
                        continue;
                    }
                }
                if (class232.field3631 <= var7) {
                    class161 var10 = ((class212) var8).field3346;
                    if (var10.field2585 != null) {
                        var10 = var10.method1192(-1);
                    }
                    if (var10.field2596 >= 0 && class212.field3338.length > var10.field2596) {
                        int var11;
                        if (var10.field2567 == -1) {
                            var11 = var8.method2097(0) + 15;
                        } else {
                            var11 = var10.field2567 + 15;
                        }
                        class246.method1777(var8, arg0, var11, (byte) -87, arg6 >> 1, arg2, arg5 >> 1);
                        if (class315.field4923 > -1) {
                            class212.field3338[var10.field2596].method1273(arg3 + class315.field4923 - 12, class113.field1585 + arg4 + -30);
                        }
                    }
                    class182[] var12 = class287.field4436;
                    for (int var13 = 0; var13 < var12.length; var13++) {
                        class182 var14 = var12[var13];
                        if (var14 != null && var14.field2954 == 1 && class85.field1157[var7 - class232.field3631] == var14.field2951 && class229.field3595 % 20 < 10) {
                            int var15;
                            if (var10.field2567 == -1) {
                                var15 = var8.method2097(0) + 15;
                            } else {
                                var15 = var10.field2567 + 15;
                            }
                            class246.method1777(var8, arg0, var15, (byte) -87, arg6 >> 1, arg2, arg5 >> 1);
                            if (class315.field4923 > -1) {
                                class163.field2644[var14.field2963].method1273(class315.field4923 + arg3 - 12, arg4 - -class113.field1585 + -28);
                            }
                        }
                    }
                } else {
                    int var16 = 30;
                    class337 var17 = (class337) var8;
                    if (var17.field5270 != -1 || var17.field5269 != -1) {
                        class246.method1777(var8, arg0, var8.method2097(0) + 15, (byte) -87, arg6 >> 1, arg2, arg5 >> 1);
                        if (class315.field4923 > -1) {
                            if (var17.field5270 != -1) {
                                class254.field4011[var17.field5270].method1273(arg3 + class315.field4923 - 12, class113.field1585 + arg4 - var16);
                                var16 += 25;
                            }
                            if (var17.field5269 != -1) {
                                class212.field3338[var17.field5269].method1273(class315.field4923 + arg3 - 12, class113.field1585 + arg4 + -var16);
                                var16 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        class182[] var18 = class287.field4436;
                        for (int var19 = 0; var19 < var18.length; var19++) {
                            class182 var20 = var18[var19];
                            if (var20 != null && var20.field2954 == 10 && class81.field1116[var7] == var20.field2951) {
                                class246.method1777(var8, arg0, var8.method2097(0) + 15, (byte) -87, arg6 >> 1, arg2, arg5 >> 1);
                                if (class315.field4923 > -1) {
                                    class163.field2644[var20.field2963].method1273(class315.field4923 + arg3 - 12, class113.field1585 + arg4 + -var16);
                                }
                            }
                        }
                    }
                }
                if (var8.field4706 != null && (var7 >= class232.field3631 || class164.field2657 == 0 || class164.field2657 == 3 || class164.field2657 == 1 && class282.method2004(((class337) var8).field5277, 21216))) {
                    class246.method1777(var8, arg0, var8.method2097(0), (byte) -87, arg6 >> 1, arg2, arg5 >> 1);
                    if (class315.field4923 > -1 && class276.field4262 < class199.field3182) {
                        class199.field3173[class276.field4262] = class270.field4197.method2254(var8.field4706) / 2;
                        class199.field3180[class276.field4262] = class270.field4197.field5060;
                        class199.field3179[class276.field4262] = class315.field4923;
                        class199.field3188[class276.field4262] = class113.field1585;
                        class199.field3174[class276.field4262] = var8.field4667;
                        class199.field3184[class276.field4262] = var8.field4660;
                        class199.field3187[class276.field4262] = var8.field4672;
                        class199.field3189[class276.field4262] = var8.field4706;
                        class276.field4262++;
                    }
                }
                if (var8.field4734 > class229.field3595) {
                    class169 var21 = class162.field2632[0];
                    class169 var22 = class162.field2632[1];
                    int var26;
                    if (var8 instanceof class212) {
                        class212 var23 = (class212) var8;
                        class169[] var24 = (class169[]) ((class169[]) class84.field1148.method1351((long) var23.field3346.field2548, 63));
                        if (var24 == null) {
                            var24 = class298.method2074(class256.field4042, 0, var23.field3346.field2548, 0);
                            if (var24 != null) {
                                class84.field1148.method1347(var24, (long) var23.field3346.field2548, (byte) -91);
                            }
                        }
                        class161 var25 = var23.field3346;
                        if (var24 != null && var24.length == 2) {
                            var22 = var24[1];
                            var21 = var24[0];
                        }
                        if (var25.field2567 == -1) {
                            var26 = var8.method2097(0);
                        } else {
                            var26 = var25.field2567;
                        }
                    } else {
                        var26 = var8.method2097(0);
                    }
                    class246.method1777(var8, arg0, var26 + var21.field2791 + 10, (byte) -87, arg6 >> 1, arg2, arg5 >> 1);
                    if (class315.field4923 > -1) {
                        int var27 = class113.field1585 + arg4 - 3;
                        int var28 = arg3 + class315.field4923 - (var21.field2788 >> 1);
                        var21.method1273(var28, var27);
                        int var29 = var8.field4721 * var21.field2788 / 255;
                        int var30 = var21.field2791;
                        if (class109.field1458) {
                            class122.method884(var28, var27, var28 + var29, var27 + var30);
                        } else {
                            class280.method1967(var28, var27, var28 + var29, var27 + var30);
                        }
                        var22.method1273(var28, var27);
                        if (class109.field1458) {
                            class122.method885(arg3, arg4, arg3 + arg6, arg4 + arg5);
                        } else {
                            class280.method1978(arg3, arg4, arg3 + arg6, arg4 + arg5);
                        }
                    }
                }
                for (int var31 = 0; var31 < 4; var31++) {
                    if (class229.field3595 < var8.field4743[var31]) {
                        int var32;
                        if ((var8 instanceof class212)) {
                            class212 var33 = (class212) var8;
                            class161 var34 = var33.field3346;
                            if (var34.field2567 == -1) {
                                var32 = var8.method2097(0) / 2;
                            } else {
                                var32 = var34.field2567 / 2;
                            }
                        } else {
                            var32 = var8.method2097(0) / 2;
                        }
                        class246.method1777(var8, arg0, var32, (byte) -87, arg6 >> 1, arg2, arg5 >> 1);
                        if (class315.field4923 > -1) {
                            if (var31 == 1) {
                                class113.field1585 -= 20;
                            }
                            if (var31 == 2) {
                                class315.field4923 -= 15;
                                class113.field1585 -= 10;
                            }
                            if (var31 == 3) {
                                class315.field4923 += 15;
                                class113.field1585 -= 10;
                            }
                            class249.field3922[var8.field4663[var31]].method1273(class315.field4923 + arg3 - 12, class113.field1585 + arg4 - 12);
                            class29.field430.method2258(Integer.toString(var8.field4744[var31]), arg3 + class315.field4923 - 1, class113.field1585 + arg4 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        if (arg1 >= -31) {
            field3258 = (class253) null;
        }
        for (int var35 = 0; var35 < class276.field4262; var35++) {
            int var36 = class199.field3179[var35];
            int var37 = class199.field3173[var35];
            int var38 = class199.field3188[var35];
            boolean var39 = true;
            int var40 = class199.field3180[var35];
            while (var39) {
                var39 = false;
                for (int var41 = 0; var41 < var35; var41++) {
                    if ((class199.field3188[var41] - class199.field3180[var41]) < (var38 + 2) && var38 - var40 < class199.field3188[var41] + 2 && (var36 - var37) < (class199.field3179[var41] + class199.field3173[var41]) && var36 + var37 > class199.field3179[var41] + -class199.field3173[var41] && class199.field3188[var41] - class199.field3180[var41] < var38) {
                        var39 = true;
                        var38 = class199.field3188[var41] - class199.field3180[var41];
                    }
                }
            }
            class315.field4923 = class199.field3179[var35];
            class113.field1585 = class199.field3188[var35] = var38;
            String var42 = class199.field3189[var35];
            if (class105.field1383 == 0) {
                int var43 = 16776960;
                if (class199.field3174[var35] < 6) {
                    var43 = class274.field4234[class199.field3174[var35]];
                }
                if (class199.field3174[var35] == 6) {
                    var43 = class301.field4629 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class199.field3174[var35] == 7) {
                    var43 = (class301.field4629 % 20) < 10 ? 255 : 65535;
                }
                if (class199.field3174[var35] == 8) {
                    var43 = class301.field4629 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class199.field3174[var35] == 9) {
                    int var44 = 150 - class199.field3187[var35];
                    if (var44 < 50) {
                        var43 = var44 * 1280 + 16711680;
                    } else if (var44 < 100) {
                        var43 = 33160960 - (var44 * 327680);
                    } else if (var44 < 150) {
                        var43 = (var44 - 100) * 5 + 65280;
                    }
                }
                if (class199.field3174[var35] == 10) {
                    int var45 = 150 - class199.field3187[var35];
                    if (var45 < 50) {
                        var43 = var45 * 5 + 16711680;
                    } else if (var45 < 100) {
                        var43 = 33095935 - (var45 * 327680);
                    } else if (var45 < 150) {
                        var43 = (var45 - 100) * 327680 + 255 - ((var45 - 100) * 5);
                    }
                }
                if (class199.field3174[var35] == 11) {
                    int var46 = 150 - class199.field3187[var35];
                    if (var46 < 50) {
                        var43 = 16777215 - (var46 * 327685);
                    } else if (var46 < 100) {
                        var43 = (var46 - 50) * 327685 + 65280;
                    } else if (var46 < 150) {
                        var43 = 32768000 + 16777215 - var46 * 327680;
                    }
                }
                if (class199.field3184[var35] == 0) {
                    class270.field4197.method2258(var42, class315.field4923 + arg3, class113.field1585 + arg4, var43, 0);
                }
                if (class199.field3184[var35] == 1) {
                    class270.field4197.method2269(var42, class315.field4923 + arg3, arg4 - -class113.field1585, var43, 0, class301.field4629);
                }
                if (class199.field3184[var35] == 2) {
                    class270.field4197.method2264(var42, class315.field4923 + arg3, arg4 - -class113.field1585, var43, 0, class301.field4629);
                }
                if (class199.field3184[var35] == 3) {
                    class270.field4197.method2248(var42, class315.field4923 + arg3, class113.field1585 + arg4, var43, 0, class301.field4629, 150 - class199.field3187[var35]);
                }
                if (class199.field3184[var35] == 4) {
                    int var47 = (150 - class199.field3187[var35]) * (class270.field4197.method2254(var42) + 100) / 150;
                    if (class109.field1458) {
                        class122.method884(class315.field4923 + arg3 - 50, arg4, arg3 + class315.field4923 + 50, arg4 + arg5);
                    } else {
                        class280.method1967(class315.field4923 + arg3 - 50, arg4, class315.field4923 + arg3 + 50, arg4 + arg5);
                    }
                    class270.field4197.method2252(var42, arg3 - var47 - (-class315.field4923 - 50), class113.field1585 + arg4, var43, 0);
                    if (class109.field1458) {
                        class122.method885(arg3, arg4, arg3 + arg6, arg4 + arg5);
                    } else {
                        class280.method1978(arg3, arg4, arg3 + arg6, arg4 + arg5);
                    }
                }
                if (class199.field3184[var35] == 5) {
                    int var48 = 150 - class199.field3187[var35];
                    int var49 = 0;
                    if (var48 < 25) {
                        var49 = var48 - 25;
                    } else if (var48 > 125) {
                        var49 = var48 - 125;
                    }
                    if (class109.field1458) {
                        class122.method884(arg3, arg4 + class113.field1585 - (class270.field4197.field5060 - -1), arg3 - -arg6, class113.field1585 + arg4 + 5);
                    } else {
                        class280.method1967(arg3, class113.field1585 + arg4 - class270.field4197.field5060 - 1, arg3 + arg6, class113.field1585 + arg4 + 5);
                    }
                    class270.field4197.method2258(var42, class315.field4923 + arg3, arg4 - -class113.field1585 - -var49, var43, 0);
                    if (class109.field1458) {
                        class122.method885(arg3, arg4, arg3 + arg6, arg4 - -arg5);
                    } else {
                        class280.method1978(arg3, arg4, arg3 + arg6, arg4 + arg5);
                    }
                }
            } else {
                class270.field4197.method2258(var42, arg3 + class315.field4923, arg4 - -class113.field1585, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)V", line = 668)
    public final void method1520(int arg0) {
        this.field3264 = null;
        if (arg0 <= -52) {
            field3265++;
        }
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(I)V", line = 686)
    public static final void method1521(int arg0) {
        if (arg0 <= -60) {
            field3273++;
            class197.field3154.method1359(110);
            class62.field909.method1359(83);
            class161.field2597.method1359(64);
        }
    }

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "(I)V", line = 707)
    public static void method1522(int arg0) {
        field3262 = null;
        field3269 = (byte[][]) null;
        field3258 = null;
        if (arg0 != 128) {
            method1516((class137) null, false);
        }
        field3261 = null;
        field3277 = null;
        field3279 = null;
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V", line = 720)
    public class206() {
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "([B)V", line = 722)
    public class206(byte[] arg0) {
        this.field3257 = new class266[128];
        this.field3260 = new byte[128];
        this.field3274 = new short[128];
        this.field3264 = new int[128];
        this.field3281 = new byte[128];
        this.field3268 = new byte[128];
        int var2 = 0;
        this.field3263 = new class237[128];
        class6 var3 = new class6(arg0);
        while (var3.field115[var3.field111 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method83((byte) -91);
        }
        var3.field111++;
        var2++;
        int var6 = var3.field111;
        var3.field111 += var2;
        int var7;
        for (var7 = 0; var3.field115[var3.field111 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method83((byte) -109);
        }
        var3.field111++;
        var7++;
        int var10 = var3.field111;
        int var11 = 0;
        var3.field111 += var7;
        while (var3.field115[var3.field111 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method83((byte) -90);
        }
        var3.field111++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var3.method58(-288140008);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var18 <= var16) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        }
        class237[] var19 = new class237[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class237 var21 = var19[var20] = new class237();
            int var22 = var3.method58(-288140008);
            if (var22 > 0) {
                var21.field3713 = new byte[var22 * 2];
            }
            int var23 = var3.method58(-288140008);
            if (var23 > 0) {
                var21.field3720 = new byte[var23 * 2 + 2];
                var21.field3720[1] = 64;
            }
        }
        int var24 = var3.method58(-288140008);
        int var25 = 0;
        byte[] var26 = var24 > 0 ? new byte[var24 * 2] : null;
        int var27 = var3.method58(-288140008);
        while (var3.field115[var3.field111 + var25] != 0) {
            var25++;
        }
        byte[] var28 = var27 > 0 ? new byte[var27 * 2] : null;
        byte[] var29 = new byte[var25];
        for (int var30 = 0; var30 < var25; var30++) {
            var29[var30] = var3.method83((byte) -124);
        }
        var3.field111++;
        var25++;
        int var31 = 0;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var3.method58(-288140008);
            this.field3274[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var3.method58(-288140008);
            this.field3274[var34] = (short) (this.field3274[var34] + (var33 << 8));
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (var37 == 0) {
                if (var29.length <= var35) {
                    var37 = -1;
                } else {
                    var37 = var29[var35++];
                }
                var36 = var3.method29(-102);
            }
            this.field3274[var38] = (short) (this.field3274[var38] + (class333.method2319(2, var36 - 1) << 14));
            this.field3264[var38] = var36;
            var37--;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field3264[var42] != 0) {
                if (var40 == 0) {
                    if (var39 >= var4.length) {
                        var40 = -1;
                    } else {
                        var40 = var4[var39++];
                    }
                    var41 = var3.field115[var6++] - 1;
                }
                this.field3260[var42] = (byte) var41;
                var40--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field3264[var46] != 0) {
                if (var43 == 0) {
                    if (var8.length > var45) {
                        var43 = var8[var45++];
                    } else {
                        var43 = -1;
                    }
                    var44 = var3.field115[var10++] + 16 << 2;
                }
                var43--;
                this.field3281[var46] = (byte) var44;
            }
        }
        int var47 = 0;
        int var48 = 0;
        class237 var49 = null;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field3264[var50] != 0) {
                if (var48 == 0) {
                    var49 = var19[var14[var47]];
                    if (var12.length > var47) {
                        var48 = var12[var47++];
                    } else {
                        var48 = -1;
                    }
                }
                var48--;
                this.field3263[var50] = var49;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var51 == 0) {
                if (var29.length > var53) {
                    var51 = var29[var53++];
                } else {
                    var51 = -1;
                }
                if (this.field3264[var54] > 0) {
                    var52 = var3.method58(-288140008) + 1;
                }
            }
            this.field3268[var54] = (byte) var52;
            var51--;
        }
        this.field3275 = var3.method58(-288140008) + 1;
        for (int var55 = 0; var55 < var15; var55++) {
            class237 var56 = var19[var55];
            if (var56.field3713 != null) {
                for (int var57 = 1; var57 < var56.field3713.length; var57 += 2) {
                    var56.field3713[var57] = var3.method83((byte) -103);
                }
            }
            if (var56.field3720 != null) {
                for (int var58 = 3; var58 < (var56.field3720.length - 2); var58 += 2) {
                    var56.field3720[var58] = var3.method83((byte) -116);
                }
            }
        }
        if (var26 != null) {
            for (int var59 = 1; var59 < var26.length; var59 += 2) {
                var26[var59] = var3.method83((byte) -101);
            }
        }
        if (var28 != null) {
            for (int var60 = 1; var60 < var28.length; var60 += 2) {
                var28[var60] = var3.method83((byte) -109);
            }
        }
        for (int var61 = 0; var61 < var15; var61++) {
            class237 var62 = var19[var61];
            if (var62.field3720 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field3720.length; var64 += 2) {
                    var63 = var63 + var3.method58(-288140008) + 1;
                    var62.field3720[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var15; var65++) {
            class237 var66 = var19[var65];
            if (var66.field3713 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field3713.length; var68 += 2) {
                    var67 = (var67 + var3.method58(-288140008)) + 1;
                    var66.field3713[var68] = (byte) var67;
                }
            }
        }
        if (var26 != null) {
            int var69 = var3.method58(-288140008);
            var26[0] = (byte) var69;
            for (int var70 = 2; var70 < var26.length; var70 += 2) {
                var69 = var3.method58(-288140008) + var69 + 1;
                var26[var70] = (byte) var69;
            }
            byte var71 = var26[0];
            byte var72 = var26[1];
            for (int var73 = 0; var73 < var71; var73++) {
                this.field3268[var73] = (byte) (this.field3268[var73] * var72 + 32 >> 6);
            }
            int var74 = 2;
            while (var74 < var26.length) {
                byte var75 = var26[var74];
                int var76 = (var75 - var71) / 2 + (var75 - var71) * var72;
                byte var77 = var26[var74 + 1];
                var74 += 2;
                for (int var78 = var71; var78 < var75; var78++) {
                    int var79 = class150.method1099((byte) 110, var76, var75 - var71);
                    var76 += var77 - var72;
                    this.field3268[var78] = (byte) (this.field3268[var78] * var79 + 32 >> 6);
                }
                var72 = var77;
                var71 = var75;
            }
            for (int var80 = var71; var80 < 128; var80++) {
                this.field3268[var80] = (byte) (this.field3268[var80] * var72 + 32 >> 6);
            }
            Object var81 = null;
        }
        if (var28 != null) {
            int var82 = var3.method58(-288140008);
            var28[0] = (byte) var82;
            for (int var83 = 2; var83 < var28.length; var83 += 2) {
                var82 = var3.method58(-288140008) + var82 + 1;
                var28[var83] = (byte) var82;
            }
            byte var84 = var28[0];
            int var85 = var28[1] << 1;
            for (int var86 = 0; var86 < var84; var86++) {
                int var87 = (this.field3281[var86] & 0xFF) + var85;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field3281[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var88 < var28.length) {
                byte var89 = var28[var88];
                int var90 = var28[var88 + 1] << 1;
                var88 += 2;
                int var91 = (var89 - var84) / 2 + (var89 - var84) * var85;
                for (int var92 = var84; var92 < var89; var92++) {
                    int var93 = class150.method1099((byte) 83, var91, var89 - var84);
                    int var94 = (this.field3281[var92] & 0xFF) + var93;
                    var91 += var90 - var85;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field3281[var92] = (byte) var94;
                }
                var84 = var89;
                var85 = var90;
            }
            Object var95 = null;
            for (int var96 = var84; var96 < 128; var96++) {
                int var97 = (this.field3281[var96] & 0xFF) + var85;
                if (var97 < 0) {
                    var97 = 0;
                }
                if (var97 > 128) {
                    var97 = 128;
                }
                this.field3281[var96] = (byte) var97;
            }
        }
        for (int var98 = 0; var98 < var15; var98++) {
            var19[var98].field3721 = var3.method58(-288140008);
        }
        for (int var99 = 0; var99 < var15; var99++) {
            class237 var100 = var19[var99];
            if (var100.field3713 != null) {
                var100.field3709 = var3.method58(-288140008);
            }
            if (var100.field3720 != null) {
                var100.field3726 = var3.method58(-288140008);
            }
            if (var100.field3721 > 0) {
                var100.field3710 = var3.method58(-288140008);
            }
        }
        for (int var101 = 0; var101 < var15; var101++) {
            var19[var101].field3714 = var3.method58(-288140008);
        }
        for (int var102 = 0; var102 < var15; var102++) {
            class237 var103 = var19[var102];
            if (var103.field3714 > 0) {
                var103.field3722 = var3.method58(-288140008);
            }
        }
        for (int var104 = 0; var104 < var15; var104++) {
            class237 var105 = var19[var104];
            if (var105.field3722 > 0) {
                var105.field3724 = var3.method58(-288140008);
            }
        }
    }
}
