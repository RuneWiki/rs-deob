import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Date;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class147 extends class220 {

    @OriginalMember(owner = "client!ll", name = "ab", descriptor = "I")
    private int field2530 = 0;

    @OriginalMember(owner = "client!ll", name = "db", descriptor = "Z")
    public boolean field2533 = false;

    @OriginalMember(owner = "client!ll", name = "ib", descriptor = "I")
    private int field2538 = -1;

    @OriginalMember(owner = "client!ll", name = "X", descriptor = "Lci;")
    private class190 field2527;

    @OriginalMember(owner = "client!ll", name = "Y", descriptor = "Z")
    private boolean field2528;

    @OriginalMember(owner = "client!ll", name = "gb", descriptor = "Z")
    private boolean field2536;

    @OriginalMember(owner = "client!ll", name = "kb", descriptor = "Z")
    private boolean field2540;

    @OriginalMember(owner = "client!ll", name = "E", descriptor = "Z")
    private boolean field2509;

    @OriginalMember(owner = "client!ll", name = "O", descriptor = "I")
    private int field2519;

    @OriginalMember(owner = "client!ll", name = "H", descriptor = "I")
    private int field2512;

    @OriginalMember(owner = "client!ll", name = "M", descriptor = "I")
    private int field2517;

    @OriginalMember(owner = "client!ll", name = "G", descriptor = "I")
    private int field2511;

    @OriginalMember(owner = "client!ll", name = "Q", descriptor = "I")
    public static int field2521 = 0;

    @OriginalMember(owner = "client!ll", name = "K", descriptor = "Lmh;")
    public static class128 field2515 = class22.method156(123, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!ll", name = "Z", descriptor = "S")
    public static short field2529 = 1;

    @OriginalMember(owner = "client!ll", name = "N", descriptor = "I")
    public static int field2518 = 500;

    @OriginalMember(owner = "client!ll", name = "hb", descriptor = "[I")
    public static int[] field2537 = new int[50];

    @OriginalMember(owner = "client!ll", name = "I", descriptor = "[I")
    public static int[] field2513 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ll", name = "S", descriptor = "F")
    private float field2523;

    @OriginalMember(owner = "client!ll", name = "F", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!ll", name = "J", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!ll", name = "L", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!ll", name = "P", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!ll", name = "R", descriptor = "I")
    private int field2522;

    @OriginalMember(owner = "client!ll", name = "V", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!ll", name = "W", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!ll", name = "bb", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!ll", name = "cb", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!ll", name = "fb", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!ll", name = "eb", descriptor = "Lng;")
    public static class152 field2534;

    @OriginalMember(owner = "client!ll", name = "jb", descriptor = "Ldj;")
    public static class314 field2539;

    @OriginalMember(owner = "client!ll", name = "T", descriptor = "[I")
    private int[] field2524;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ldc;ZI)V", line = 12)
    public static final void method983(class102 arg0, boolean arg1, int arg2) {
        field2535++;
        Object[] var3 = arg0.field1743;
        int var4 = (Integer) var3[0];
        class266 var5 = class219.method1517(var4, 8);
        if (!arg1) {
            field2537 = (int[]) null;
        }
        if (var5 == null) {
            return;
        }
        class6.field136 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int[] var9 = var5.field4618;
        int[] var10 = var5.field4610;
        byte var11 = -1;
        try {
            class16.field452 = new class128[var5.field4614];
            class212.field3761 = new int[var5.field4619];
            int var12 = 0;
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if ((var3[var14] instanceof Integer)) {
                    int var16 = (Integer) var3[var14];
                    if (var16 == -2147483647) {
                        var16 = arg0.field1752;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg0.field1748;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg0.field1738 == null ? -1 : arg0.field1738.field230;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg0.field1742;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg0.field1738 == null ? -1 : arg0.field1738.field259;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg0.field1739 == null ? -1 : arg0.field1739.field230;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg0.field1739 == null ? -1 : arg0.field1739.field259;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg0.field1753;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg0.field1746;
                    }
                    class212.field3761[var13++] = var16;
                } else if (var3[var14] instanceof class128) {
                    class128 var15 = (class128) var3[var14];
                    if (var15.method855(class159.field2718, 255)) {
                        var15 = arg0.field1747;
                    }
                    class16.field452[var12++] = var15;
                }
            }
            int var17 = 0;
            label3985: while (true) {
                var17++;
                if (arg2 < var17) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var483 = var9[var8];
                if (var483 < 100) {
                    if (var483 == 0) {
                        class140.field2396[var6++] = var10[var8];
                        continue;
                    }
                    if (var483 == 1) {
                        int var18 = var10[var8];
                        class140.field2396[var6++] = class104.field1778[var18];
                        continue;
                    }
                    if (var483 == 2) {
                        int var19 = var10[var8];
                        var6--;
                        class275.method1929(var19, -27870, class140.field2396[var6]);
                        continue;
                    }
                    if (var483 == 3) {
                        class103.field1759[var7++] = var5.field4608[var8];
                        continue;
                    }
                    if (var483 == 6) {
                        var8 += var10[var8];
                        continue;
                    }
                    if (var483 == 7) {
                        var6 -= 2;
                        if (class140.field2396[var6 + 1] != class140.field2396[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var483 == 8) {
                        var6 -= 2;
                        if (class140.field2396[var6 + 1] == class140.field2396[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var483 == 9) {
                        var6 -= 2;
                        if (class140.field2396[var6] < class140.field2396[var6 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var483 == 10) {
                        var6 -= 2;
                        if (class140.field2396[var6] > class140.field2396[var6 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var483 == 21) {
                        if (class6.field136 == 0) {
                            return;
                        }
                        class294 var20 = class148.field2541[--class6.field136];
                        class212.field3761 = var20.field5030;
                        var5 = var20.field5024;
                        var8 = var20.field5025;
                        var10 = var5.field4610;
                        class16.field452 = var20.field5035;
                        var9 = var5.field4618;
                        continue;
                    }
                    if (var483 == 25) {
                        int var21 = var10[var8];
                        class140.field2396[var6++] = class56.method375((byte) -123, var21);
                        continue;
                    }
                    if (var483 == 27) {
                        int var22 = var10[var8];
                        var6--;
                        class167.method1093((byte) 69, class140.field2396[var6], var22);
                        continue;
                    }
                    if (var483 == 31) {
                        var6 -= 2;
                        if (class140.field2396[var6] <= class140.field2396[var6 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var483 == 32) {
                        var6 -= 2;
                        if (class140.field2396[var6] >= class140.field2396[var6 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var483 == 33) {
                        class140.field2396[var6++] = class212.field3761[var10[var8]];
                        continue;
                    }
                    int var10001;
                    if (var483 == 34) {
                        var10001 = var10[var8];
                        var6--;
                        class212.field3761[var10001] = class140.field2396[var6];
                        continue;
                    }
                    if (var483 == 35) {
                        class103.field1759[var7++] = class16.field452[var10[var8]];
                        continue;
                    }
                    if (var483 == 36) {
                        var10001 = var10[var8];
                        var7--;
                        class16.field452[var10001] = class103.field1759[var7];
                        continue;
                    }
                    if (var483 == 37) {
                        int var23 = var10[var8];
                        var7 -= var23;
                        class128 var24 = class219.method1519(class103.field1759, var7, true, var23);
                        class103.field1759[var7++] = var24;
                        continue;
                    }
                    if (var483 == 38) {
                        var6--;
                        continue;
                    }
                    if (var483 == 39) {
                        var7--;
                        continue;
                    }
                    if (var483 == 40) {
                        int var25 = var10[var8];
                        class266 var26 = class219.method1517(var25, 8);
                        int[] var27 = new int[var26.field4619];
                        class128[] var28 = new class128[var26.field4614];
                        for (int var29 = 0; var29 < var26.field4604; var29++) {
                            var27[var29] = class140.field2396[var6 + var29 - var26.field4604];
                        }
                        for (int var30 = 0; var30 < var26.field4622; var30++) {
                            var28[var30] = class103.field1759[var7 + var30 - var26.field4622];
                        }
                        var7 -= var26.field4622;
                        var6 -= var26.field4604;
                        class294 var31 = new class294();
                        var31.field5025 = var8;
                        var31.field5030 = class212.field3761;
                        var31.field5035 = class16.field452;
                        var31.field5024 = var5;
                        if (class148.field2541.length <= class6.field136) {
                            throw new RuntimeException();
                        }
                        var8 = -1;
                        var5 = var26;
                        class148.field2541[class6.field136++] = var31;
                        var9 = var26.field4618;
                        class212.field3761 = var27;
                        var10 = var26.field4610;
                        class16.field452 = var28;
                        continue;
                    }
                    if (var483 == 42) {
                        class140.field2396[var6++] = class189.field3287[var10[var8]];
                        continue;
                    }
                    if (var483 == 43) {
                        int var32 = var10[var8];
                        var6--;
                        class189.field3287[var32] = class140.field2396[var6];
                        class79.method508(var32, (byte) -79);
                        continue;
                    }
                    if (var483 == 44) {
                        int var33 = var10[var8] >> 16;
                        int var34 = var10[var8] & 0xFFFF;
                        var6--;
                        int var35 = class140.field2396[var6];
                        if (var35 >= 0 && var35 <= 5000) {
                            class116.field1972[var33] = var35;
                            byte var36 = -1;
                            if (var34 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var37 >= var35) {
                                    continue label3985;
                                }
                                class77.field1414[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var483 == 45) {
                        int var38 = var10[var8];
                        var6--;
                        int var39 = class140.field2396[var6];
                        if (var39 >= 0 && var39 < class116.field1972[var38]) {
                            class140.field2396[var6++] = class77.field1414[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var483 == 46) {
                        var6 -= 2;
                        int var40 = var10[var8];
                        int var41 = class140.field2396[var6];
                        if (var41 >= 0 && var41 < class116.field1972[var40]) {
                            class77.field1414[var40][var41] = class140.field2396[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var483 == 47) {
                        class128 var42 = class207.field3630[var10[var8]];
                        if (var42 == null) {
                            var42 = class287.field4907;
                        }
                        class103.field1759[var7++] = var42;
                        continue;
                    }
                    if (var483 == 48) {
                        int var43 = var10[var8];
                        var7--;
                        class207.field3630[var43] = class103.field1759[var7];
                        class3.method19(var43, (byte) 69);
                        continue;
                    }
                    if (var483 == 51) {
                        class120 var44 = var5.field4620[var10[var8]];
                        var6--;
                        class155 var45 = (class155) var44.method728(false, (long) class140.field2396[var6]);
                        if (var45 != null) {
                            var8 += var45.field2672;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var10[var8] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var483 < 300) {
                    if (var483 == 100) {
                        var6 -= 3;
                        int var462 = class140.field2396[var6];
                        int var463 = class140.field2396[var6 + 1];
                        int var464 = class140.field2396[var6 + 2];
                        if (var463 != 0) {
                            class10 var465 = class233.method1606(arg1, var462);
                            if (var465.field348 == null) {
                                var465.field348 = new class10[var464 + 1];
                            }
                            if (var464 >= var465.field348.length) {
                                class10[] var466 = new class10[var464 + 1];
                                for (int var467 = 0; var467 < var465.field348.length; var467++) {
                                    var466[var467] = var465.field348[var467];
                                }
                                var465.field348 = var466;
                            }
                            if (var464 > 0 && var465.field348[var464 - 1] == null) {
                                throw new RuntimeException("Gap at:" + (var464 - 1));
                            }
                            class10 var468 = new class10();
                            var468.field259 = var464;
                            var468.field267 = var468.field230 = var465.field230;
                            var468.field288 = var463;
                            var468.field294 = true;
                            var465.field348[var464] = var468;
                            if (var46) {
                                class265.field4597 = var468;
                            } else {
                                class106.field1811 = var468;
                            }
                            class7.method48(var465, 0);
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var483 == 101) {
                        class10 var469 = var46 ? class265.field4597 : class106.field1811;
                        if (var469.field259 == -1) {
                            if (var46) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class10 var470 = class233.method1606(true, var469.field230);
                        var470.field348[var469.field259] = null;
                        class7.method48(var470, 0);
                        continue;
                    }
                    if (var483 == 102) {
                        var6--;
                        class10 var471 = class233.method1606(true, class140.field2396[var6]);
                        var471.field348 = null;
                        class7.method48(var471, 0);
                        continue;
                    }
                    if (var483 == 200) {
                        var6 -= 2;
                        int var472 = class140.field2396[var6 + 1];
                        int var473 = class140.field2396[var6];
                        class10 var474 = class271.method1908(var473, var472, false);
                        if (var474 != null && var472 != -1) {
                            class140.field2396[var6++] = 1;
                            if (var46) {
                                class265.field4597 = var474;
                            } else {
                                class106.field1811 = var474;
                            }
                            continue;
                        }
                        class140.field2396[var6++] = 0;
                        continue;
                    }
                    if (var483 == 201) {
                        var6--;
                        int var475 = class140.field2396[var6];
                        class10 var476 = class233.method1606(arg1, var475);
                        if (var476 == null) {
                            class140.field2396[var6++] = 0;
                        } else {
                            class140.field2396[var6++] = 1;
                            if (var46) {
                                class265.field4597 = var476;
                            } else {
                                class106.field1811 = var476;
                            }
                        }
                        continue;
                    }
                } else if (var483 < 500) {
                    if (var483 == 403) {
                        var6 -= 2;
                        int var457 = class140.field2396[var6];
                        int var458 = class140.field2396[var6 + 1];
                        if (var457 >= 7) {
                            var457 -= 7;
                        }
                        class163.field2796.field2078.method34(var457, var458, (byte) 19);
                        continue;
                    }
                    if (var483 == 404) {
                        var6 -= 2;
                        int var459 = class140.field2396[var6 + 1];
                        int var460 = class140.field2396[var6];
                        class163.field2796.field2078.method35(var460, (byte) 52, var459);
                        continue;
                    }
                    if (var483 == 410) {
                        var6--;
                        boolean var461 = class140.field2396[var6] != 0;
                        class163.field2796.field2078.method36(var461, 12);
                        continue;
                    }
                } else if (var483 >= 1000 && var483 < 1100 || var483 >= 2000 && var483 < 2100) {
                    class10 var451;
                    if (var483 >= 2000) {
                        var6--;
                        var451 = class233.method1606(true, class140.field2396[var6]);
                        var483 -= 1000;
                    } else {
                        var451 = var46 ? class265.field4597 : class106.field1811;
                    }
                    if (var483 == 1000) {
                        var6 -= 4;
                        var451.field249 = class140.field2396[var6];
                        var451.field338 = class140.field2396[var6 + 1];
                        int var452 = class140.field2396[var6 + 2];
                        if (var452 < 0) {
                            var452 = 0;
                        } else if (var452 > 5) {
                            var452 = 5;
                        }
                        int var453 = class140.field2396[var6 + 3];
                        if (var453 < 0) {
                            var453 = 0;
                        } else if (var453 > 5) {
                            var453 = 5;
                        }
                        var451.field270 = (byte) var453;
                        var451.field341 = (byte) var452;
                        class7.method48(var451, 0);
                        class128.method837((byte) 75, var451);
                        if (var451.field259 == -1) {
                            class210.method1447(var451.field230, 0);
                        }
                        continue;
                    }
                    if (var483 == 1001) {
                        var6 -= 4;
                        var451.field327 = class140.field2396[var6];
                        var451.field229 = class140.field2396[var6 + 1];
                        var451.field276 = 0;
                        var451.field361 = 0;
                        int var454 = class140.field2396[var6 + 3];
                        int var455 = class140.field2396[var6 + 2];
                        if (var454 < 0) {
                            var454 = 0;
                        } else if (var454 > 4) {
                            var454 = 4;
                        }
                        if (var455 < 0) {
                            var455 = 0;
                        } else if (var455 > 4) {
                            var455 = 4;
                        }
                        var451.field271 = (byte) var455;
                        var451.field272 = (byte) var454;
                        class7.method48(var451, 0);
                        class128.method837((byte) -126, var451);
                        if (var451.field288 == 0) {
                            class15.method112(var451, false, false);
                        }
                        continue;
                    }
                    if (var483 == 1003) {
                        var6--;
                        boolean var456 = class140.field2396[var6] == 1;
                        if (var451.field292 != var456) {
                            var451.field292 = var456;
                            class7.method48(var451, 0);
                        }
                        if (var451.field259 == -1) {
                            class92.method579((byte) -107, var451.field230);
                        }
                        continue;
                    }
                    if (var483 == 1004) {
                        var6 -= 2;
                        var451.field208 = class140.field2396[var6];
                        var451.field297 = class140.field2396[var6 + 1];
                        class7.method48(var451, 0);
                        class128.method837((byte) -119, var451);
                        if (var451.field288 == 0) {
                            class15.method112(var451, false, false);
                        }
                        continue;
                    }
                } else if (var483 >= 1100 && var483 < 1200 || var483 >= 2100 && var483 < 2200) {
                    class10 var448;
                    if (var483 < 2000) {
                        var448 = var46 ? class265.field4597 : class106.field1811;
                    } else {
                        var6--;
                        var448 = class233.method1606(true, class140.field2396[var6]);
                        var483 -= 1000;
                    }
                    if (var483 == 1100) {
                        var6 -= 2;
                        var448.field281 = class140.field2396[var6];
                        if (var448.field307 - var448.field260 < var448.field281) {
                            var448.field281 = var448.field307 - var448.field260;
                        }
                        if (var448.field281 < 0) {
                            var448.field281 = 0;
                        }
                        var448.field241 = class140.field2396[var6 + 1];
                        if ((var448.field349 - var448.field226) < var448.field241) {
                            var448.field241 = var448.field349 - var448.field226;
                        }
                        if (var448.field241 < 0) {
                            var448.field241 = 0;
                        }
                        class7.method48(var448, 0);
                        if (var448.field259 == -1) {
                            class284.method1969(31356, var448.field230);
                        }
                        continue;
                    }
                    if (var483 == 1101) {
                        var6--;
                        var448.field256 = class140.field2396[var6];
                        class7.method48(var448, 0);
                        if (var448.field259 == -1) {
                            class54.method366(var448.field230, 6);
                        }
                        continue;
                    }
                    if (var483 == 1102) {
                        var6--;
                        var448.field215 = class140.field2396[var6] == 1;
                        class7.method48(var448, 0);
                        continue;
                    }
                    if (var483 == 1103) {
                        var6--;
                        var448.field257 = class140.field2396[var6];
                        class7.method48(var448, 0);
                        continue;
                    }
                    if (var483 == 1104) {
                        var6--;
                        var448.field213 = class140.field2396[var6];
                        class7.method48(var448, 0);
                        continue;
                    }
                    if (var483 == 1105) {
                        var6--;
                        var448.field331 = class140.field2396[var6];
                        class7.method48(var448, 0);
                        continue;
                    }
                    if (var483 == 1106) {
                        var6--;
                        var448.field371 = class140.field2396[var6];
                        class7.method48(var448, 0);
                        continue;
                    }
                    if (var483 == 1107) {
                        var6--;
                        var448.field350 = class140.field2396[var6] == 1;
                        class7.method48(var448, 0);
                        continue;
                    }
                    if (var483 == 1108) {
                        var448.field283 = 1;
                        var6--;
                        var448.field265 = class140.field2396[var6];
                        class7.method48(var448, 0);
                        if (var448.field259 == -1) {
                            class103.method632((byte) -26, var448.field230);
                        }
                        continue;
                    }
                    if (var483 == 1109) {
                        var6 -= 6;
                        var448.field212 = class140.field2396[var6];
                        var448.field228 = class140.field2396[var6 + 1];
                        var448.field231 = class140.field2396[var6 + 2];
                        var448.field290 = class140.field2396[var6 + 3];
                        var448.field225 = class140.field2396[var6 + 4];
                        var448.field264 = class140.field2396[var6 + 5];
                        class7.method48(var448, 0);
                        if (var448.field259 == -1) {
                            class314.method2154((byte) 71, var448.field230);
                            class156.method1032(true, var448.field230);
                        }
                        continue;
                    }
                    if (var483 == 1110) {
                        var6--;
                        int var449 = class140.field2396[var6];
                        if (var448.field275 != var449) {
                            var448.field354 = 0;
                            var448.field315 = 0;
                            var448.field275 = var449;
                            class7.method48(var448, 0);
                        }
                        if (var448.field259 == -1) {
                            class306.method2089(5, var448.field230);
                        }
                        continue;
                    }
                    if (var483 == 1111) {
                        var6--;
                        var448.field286 = class140.field2396[var6] == 1;
                        class7.method48(var448, 0);
                        continue;
                    }
                    if (var483 == 1112) {
                        var7--;
                        class128 var450 = class103.field1759[var7];
                        if (!var450.method855(var448.field207, 255)) {
                            var448.field207 = var450;
                            class7.method48(var448, 0);
                        }
                        if (var448.field259 == -1) {
                            class66.method444(103, var448.field230);
                        }
                        continue;
                    }
                    if (var483 == 1113) {
                        var6--;
                        var448.field314 = class140.field2396[var6];
                        class7.method48(var448, 0);
                        continue;
                    }
                    if (var483 == 1114) {
                        var6 -= 3;
                        var448.field295 = class140.field2396[var6];
                        var448.field366 = class140.field2396[var6 + 1];
                        var448.field266 = class140.field2396[var6 + 2];
                        class7.method48(var448, 0);
                        continue;
                    }
                    if (var483 == 1115) {
                        var6--;
                        var448.field362 = class140.field2396[var6] == 1;
                        class7.method48(var448, 0);
                        continue;
                    }
                    if (var483 == 1116) {
                        var6--;
                        var448.field278 = class140.field2396[var6];
                        class7.method48(var448, 0);
                        continue;
                    }
                    if (var483 == 1117) {
                        var6--;
                        var448.field347 = class140.field2396[var6];
                        class7.method48(var448, 0);
                        continue;
                    }
                    if (var483 == 1118) {
                        var6--;
                        var448.field237 = class140.field2396[var6] == 1;
                        class7.method48(var448, 0);
                        continue;
                    }
                    if (var483 == 1119) {
                        var6--;
                        var448.field273 = class140.field2396[var6] == 1;
                        class7.method48(var448, 0);
                        continue;
                    }
                    if (var483 == 1120) {
                        var6 -= 2;
                        var448.field307 = class140.field2396[var6];
                        var448.field349 = class140.field2396[var6 + 1];
                        class7.method48(var448, 0);
                        if (var448.field288 == 0) {
                            class15.method112(var448, false, false);
                        }
                        continue;
                    }
                    if (var483 == 1121) {
                        var6 -= 2;
                        var448.field305 = (short) class140.field2396[var6];
                        var448.field261 = (short) class140.field2396[var6 + 1];
                        class7.method48(var448, 0);
                        continue;
                    }
                    if (var483 == 1122) {
                        var6--;
                        var448.field214 = class140.field2396[var6] == 1;
                        class7.method48(var448, 0);
                        continue;
                    }
                } else if (!(var483 < 1200 || var483 >= 1300) || !(var483 < 2200 || var483 >= 2300)) {
                    class10 var47;
                    if (var483 >= 2000) {
                        var6--;
                        var47 = class233.method1606(true, class140.field2396[var6]);
                        var483 -= 1000;
                    } else {
                        var47 = var46 ? class265.field4597 : class106.field1811;
                    }
                    class7.method48(var47, 0);
                    if (var483 == 1200 || var483 == 1205) {
                        var6 -= 2;
                        int var48 = class140.field2396[var6];
                        int var49 = class140.field2396[var6 + 1];
                        if (var47.field259 == -1) {
                            class133.method883(var47.field230, -124);
                            class314.method2154((byte) 71, var47.field230);
                            class156.method1032(true, var47.field230);
                        }
                        if (var48 == -1) {
                            var47.field265 = -1;
                            var47.field283 = 1;
                            var47.field299 = -1;
                        } else {
                            var47.field252 = var49;
                            var47.field299 = var48;
                            class200 var50 = class180.method1226(!arg1, var48);
                            var47.field231 = var50.field3519;
                            var47.field264 = var50.field3554;
                            var47.field228 = var50.field3503;
                            var47.field212 = var50.field3532;
                            var47.field225 = var50.field3547;
                            if (var483 == 1205) {
                                var47.field328 = false;
                            } else {
                                var47.field328 = true;
                            }
                            if (var47.field276 > 0) {
                                var47.field264 = var47.field264 * 32 / var47.field276;
                            } else if (var47.field327 > 0) {
                                var47.field264 = var47.field264 * 32 / var47.field327;
                            }
                            var47.field290 = var50.field3530;
                        }
                        continue;
                    }
                    if (var483 == 1201) {
                        var47.field283 = 2;
                        var6--;
                        var47.field265 = class140.field2396[var6];
                        if (var47.field259 == -1) {
                            class103.method632((byte) -26, var47.field230);
                        }
                        continue;
                    }
                    if (var483 == 1202) {
                        var47.field283 = 3;
                        var47.field265 = class163.field2796.field2078.method33((byte) -119);
                        if (var47.field259 == -1) {
                            class103.method632((byte) -26, var47.field230);
                        }
                        continue;
                    }
                    if (var483 == 1203) {
                        var47.field283 = 6;
                        var6--;
                        var47.field265 = class140.field2396[var6];
                        if (var47.field259 == -1) {
                            class103.method632((byte) -26, var47.field230);
                        }
                        continue;
                    }
                    if (var483 == 1204) {
                        var47.field283 = 5;
                        var6--;
                        var47.field265 = class140.field2396[var6];
                        if (var47.field259 == -1) {
                            class103.method632((byte) -26, var47.field230);
                        }
                        continue;
                    }
                } else if (var483 >= 1300 && var483 < 1400 || var483 >= 2300 && var483 < 2400) {
                    class10 var51;
                    if (var483 < 2000) {
                        var51 = var46 ? class265.field4597 : class106.field1811;
                    } else {
                        var6--;
                        var51 = class233.method1606(true, class140.field2396[var6]);
                        var483 -= 1000;
                    }
                    if (var483 == 1300) {
                        var6--;
                        int var52 = class140.field2396[var6] - 1;
                        if (var52 >= 0 && var52 <= 9) {
                            var7--;
                            var51.method78(var52, 123, class103.field1759[var7]);
                            continue;
                        }
                        var7--;
                        continue;
                    }
                    if (var483 == 1301) {
                        var6 -= 2;
                        int var53 = class140.field2396[var6 + 1];
                        int var54 = class140.field2396[var6];
                        var51.field333 = class271.method1908(var54, var53, false);
                        continue;
                    }
                    if (var483 == 1302) {
                        var6--;
                        var51.field285 = class140.field2396[var6] == 1;
                        continue;
                    }
                    if (var483 == 1303) {
                        var6--;
                        var51.field322 = class140.field2396[var6];
                        continue;
                    }
                    if (var483 == 1304) {
                        var6--;
                        var51.field330 = class140.field2396[var6];
                        continue;
                    }
                    if (var483 == 1305) {
                        var7--;
                        var51.field334 = class103.field1759[var7];
                        continue;
                    }
                    if (var483 == 1306) {
                        var7--;
                        var51.field357 = class103.field1759[var7];
                        continue;
                    }
                    if (var483 == 1307) {
                        var51.field360 = null;
                        continue;
                    }
                } else {
                    if (var483 >= 1400 && var483 < 1500 || var483 >= 2400 && var483 < 2500) {
                        class10 var55;
                        if (var483 < 2000) {
                            var55 = var46 ? class265.field4597 : class106.field1811;
                        } else {
                            var6--;
                            var55 = class233.method1606(true, class140.field2396[var6]);
                            var483 -= 1000;
                        }
                        var7--;
                        class128 var56 = class103.field1759[var7];
                        int[] var57 = null;
                        if (var56.method865((byte) 70) > 0 && var56.method828((byte) 48, var56.method865((byte) -82) - 1) == 89) {
                            var6--;
                            int var58 = class140.field2396[var6];
                            if (var58 > 0) {
                                var57 = new int[var58];
                                while (var58-- > 0) {
                                    var6--;
                                    var57[var58] = class140.field2396[var6];
                                }
                            }
                            var56 = var56.method848(0, 105, var56.method865((byte) 115) - 1);
                        }
                        Object[] var59 = new Object[var56.method865((byte) 91) + 1];
                        for (int var60 = var59.length - 1; var60 >= 1; var60--) {
                            if (var56.method828((byte) 48, var60 - 1) == 115) {
                                var7--;
                                var59[var60] = class103.field1759[var7];
                            } else {
                                var6--;
                                var59[var60] = Integer.valueOf(class140.field2396[var6]);
                            }
                        }
                        var6--;
                        int var61 = class140.field2396[var6];
                        if (var61 == -1) {
                            var59 = null;
                        } else {
                            var59[0] = Integer.valueOf(var61);
                        }
                        var55.field329 = true;
                        if (var483 == 1400) {
                            var55.field269 = var59;
                        } else if (var483 == 1401) {
                            var55.field291 = var59;
                        } else if (var483 == 1402) {
                            var55.field300 = var59;
                        } else if (var483 == 1403) {
                            var55.field345 = var59;
                        } else if (var483 == 1404) {
                            var55.field242 = var59;
                        } else if (var483 == 1405) {
                            var55.field310 = var59;
                        } else if (var483 == 1406) {
                            var55.field209 = var59;
                        } else if (var483 == 1407) {
                            var55.field262 = var57;
                            var55.field227 = var59;
                        } else if (var483 == 1408) {
                            var55.field211 = var59;
                        } else if (var483 == 1409) {
                            var55.field308 = var59;
                        } else if (var483 == 1410) {
                            var55.field369 = var59;
                        } else if (var483 == 1411) {
                            var55.field244 = var59;
                        } else if (var483 == 1412) {
                            var55.field316 = var59;
                        } else if (var483 == 1414) {
                            var55.field234 = var59;
                            var55.field293 = var57;
                        } else if (var483 == 1415) {
                            var55.field248 = var57;
                            var55.field313 = var59;
                        } else if (var483 == 1416) {
                            var55.field235 = var59;
                        } else if (var483 == 1417) {
                            var55.field303 = var59;
                        } else if (var483 == 1418) {
                            var55.field367 = var59;
                        } else if (var483 == 1419) {
                            var55.field210 = var59;
                        } else if (var483 == 1420) {
                            var55.field284 = var59;
                        } else if (var483 == 1421) {
                            var55.field298 = var59;
                        } else if (var483 == 1422) {
                            var55.field219 = var59;
                        } else if (var483 == 1423) {
                            var55.field326 = var59;
                        } else if (var483 == 1424) {
                            var55.field319 = var59;
                        } else if (var483 == 1425) {
                            var55.field355 = var59;
                        } else if (var483 == 1426) {
                            var55.field239 = var59;
                        } else if (var483 == 1427) {
                            var55.field306 = var59;
                        } else if (var483 == 1428) {
                            var55.field343 = var57;
                            var55.field342 = var59;
                        } else if (var483 == 1429) {
                            var55.field282 = var59;
                            var55.field332 = var57;
                        }
                        continue;
                    }
                    if (var483 < 1600) {
                        class10 var62 = var46 ? class265.field4597 : class106.field1811;
                        if (var483 == 1500) {
                            class140.field2396[var6++] = var62.field253;
                            continue;
                        }
                        if (var483 == 1501) {
                            class140.field2396[var6++] = var62.field309;
                            continue;
                        }
                        if (var483 == 1502) {
                            class140.field2396[var6++] = var62.field260;
                            continue;
                        }
                        if (var483 == 1503) {
                            class140.field2396[var6++] = var62.field226;
                            continue;
                        }
                        if (var483 == 1504) {
                            class140.field2396[var6++] = var62.field292 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 1505) {
                            class140.field2396[var6++] = var62.field267;
                            continue;
                        }
                    } else if (var483 < 1700) {
                        class10 var447 = var46 ? class265.field4597 : class106.field1811;
                        if (var483 == 1600) {
                            class140.field2396[var6++] = var447.field281;
                            continue;
                        }
                        if (var483 == 1601) {
                            class140.field2396[var6++] = var447.field241;
                            continue;
                        }
                        if (var483 == 1602) {
                            class103.field1759[var7++] = var447.field207;
                            continue;
                        }
                        if (var483 == 1603) {
                            class140.field2396[var6++] = var447.field307;
                            continue;
                        }
                        if (var483 == 1604) {
                            class140.field2396[var6++] = var447.field349;
                            continue;
                        }
                        if (var483 == 1605) {
                            class140.field2396[var6++] = var447.field264;
                            continue;
                        }
                        if (var483 == 1606) {
                            class140.field2396[var6++] = var447.field231;
                            continue;
                        }
                        if (var483 == 1607) {
                            class140.field2396[var6++] = var447.field225;
                            continue;
                        }
                        if (var483 == 1608) {
                            class140.field2396[var6++] = var447.field290;
                            continue;
                        }
                        if (var483 == 1609) {
                            class140.field2396[var6++] = var447.field257;
                            continue;
                        }
                    } else if (var483 < 1800) {
                        class10 var63 = var46 ? class265.field4597 : class106.field1811;
                        if (var483 == 1700) {
                            class140.field2396[var6++] = var63.field299;
                            continue;
                        }
                        if (var483 == 1701) {
                            if (var63.field299 == -1) {
                                class140.field2396[var6++] = 0;
                            } else {
                                class140.field2396[var6++] = var63.field252;
                            }
                            continue;
                        }
                        if (var483 == 1702) {
                            class140.field2396[var6++] = var63.field259;
                            continue;
                        }
                    } else if (var483 < 1900) {
                        class10 var64 = var46 ? class265.field4597 : class106.field1811;
                        if (var483 == 1800) {
                            class140.field2396[var6++] = class33.method234(-111, client.method1657(var64));
                            continue;
                        }
                        if (var483 == 1801) {
                            var6--;
                            int var65 = class140.field2396[var6];
                            int var484 = var65 - 1;
                            if (var64.field360 != null && var484 < var64.field360.length && var64.field360[var484] != null) {
                                class103.field1759[var7++] = var64.field360[var484];
                                continue;
                            }
                            class103.field1759[var7++] = class22.field556;
                            continue;
                        }
                        if (var483 == 1802) {
                            if (var64.field334 == null) {
                                class103.field1759[var7++] = class22.field556;
                            } else {
                                class103.field1759[var7++] = var64.field334;
                            }
                            continue;
                        }
                    } else if (var483 < 2600) {
                        var6--;
                        class10 var66 = class233.method1606(true, class140.field2396[var6]);
                        if (var483 == 2500) {
                            class140.field2396[var6++] = var66.field253;
                            continue;
                        }
                        if (var483 == 2501) {
                            class140.field2396[var6++] = var66.field309;
                            continue;
                        }
                        if (var483 == 2502) {
                            class140.field2396[var6++] = var66.field260;
                            continue;
                        }
                        if (var483 == 2503) {
                            class140.field2396[var6++] = var66.field226;
                            continue;
                        }
                        if (var483 == 2504) {
                            class140.field2396[var6++] = var66.field292 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 2505) {
                            class140.field2396[var6++] = var66.field267;
                            continue;
                        }
                    } else if (var483 < 2700) {
                        var6--;
                        class10 var446 = class233.method1606(true, class140.field2396[var6]);
                        if (var483 == 2600) {
                            class140.field2396[var6++] = var446.field281;
                            continue;
                        }
                        if (var483 == 2601) {
                            class140.field2396[var6++] = var446.field241;
                            continue;
                        }
                        if (var483 == 2602) {
                            class103.field1759[var7++] = var446.field207;
                            continue;
                        }
                        if (var483 == 2603) {
                            class140.field2396[var6++] = var446.field307;
                            continue;
                        }
                        if (var483 == 2604) {
                            class140.field2396[var6++] = var446.field349;
                            continue;
                        }
                        if (var483 == 2605) {
                            class140.field2396[var6++] = var446.field264;
                            continue;
                        }
                        if (var483 == 2606) {
                            class140.field2396[var6++] = var446.field231;
                            continue;
                        }
                        if (var483 == 2607) {
                            class140.field2396[var6++] = var446.field225;
                            continue;
                        }
                        if (var483 == 2608) {
                            class140.field2396[var6++] = var446.field290;
                            continue;
                        }
                        if (var483 == 2609) {
                            class140.field2396[var6++] = var446.field257;
                            continue;
                        }
                    } else if (var483 < 2800) {
                        if (var483 == 2700) {
                            var6--;
                            class10 var436 = class233.method1606(true, class140.field2396[var6]);
                            class140.field2396[var6++] = var436.field299;
                            continue;
                        }
                        if (var483 == 2701) {
                            var6--;
                            class10 var437 = class233.method1606(true, class140.field2396[var6]);
                            if (var437.field299 == -1) {
                                class140.field2396[var6++] = 0;
                            } else {
                                class140.field2396[var6++] = var437.field252;
                            }
                            continue;
                        }
                        if (var483 == 2702) {
                            var6--;
                            int var438 = class140.field2396[var6];
                            class88 var439 = (class88) class182.field3198.method728(false, (long) var438);
                            if (var439 == null) {
                                class140.field2396[var6++] = 0;
                            } else {
                                class140.field2396[var6++] = 1;
                            }
                            continue;
                        }
                        if (var483 == 2703) {
                            var6--;
                            class10 var440 = class233.method1606(true, class140.field2396[var6]);
                            if (var440.field348 == null) {
                                class140.field2396[var6++] = 0;
                                continue;
                            }
                            int var441 = var440.field348.length;
                            for (int var442 = 0; var442 < var440.field348.length; var442++) {
                                if (var440.field348[var442] == null) {
                                    var441 = var442;
                                    break;
                                }
                            }
                            class140.field2396[var6++] = var441;
                            continue;
                        }
                        if (var483 == 2704 || var483 == 2705) {
                            var6 -= 2;
                            int var443 = class140.field2396[var6];
                            int var444 = class140.field2396[var6 + 1];
                            class88 var445 = (class88) class182.field3198.method728(false, (long) var443);
                            if (var445 != null && var445.field1510 == var444) {
                                class140.field2396[var6++] = 1;
                                continue;
                            }
                            class140.field2396[var6++] = 0;
                            continue;
                        }
                    } else if (var483 < 2900) {
                        var6--;
                        class10 var67 = class233.method1606(true, class140.field2396[var6]);
                        if (var483 == 2800) {
                            class140.field2396[var6++] = class33.method234(-128, client.method1657(var67));
                            continue;
                        }
                        if (var483 == 2801) {
                            var6--;
                            int var68 = class140.field2396[var6];
                            int var485 = var68 - 1;
                            if (var67.field360 != null && var67.field360.length > var485 && var67.field360[var485] != null) {
                                class103.field1759[var7++] = var67.field360[var485];
                                continue;
                            }
                            class103.field1759[var7++] = class22.field556;
                            continue;
                        }
                        if (var483 == 2802) {
                            if (var67.field334 == null) {
                                class103.field1759[var7++] = class22.field556;
                            } else {
                                class103.field1759[var7++] = var67.field334;
                            }
                            continue;
                        }
                    } else if (var483 < 3200) {
                        if (var483 == 3100) {
                            var7--;
                            class128 var421 = class103.field1759[var7];
                            class212.method1456(var421, 1, class22.field556, 0);
                            continue;
                        }
                        if (var483 == 3101) {
                            var6 -= 2;
                            class159.method1055(class140.field2396[var6], class163.field2796, 17446, class140.field2396[var6 + 1]);
                            continue;
                        }
                        if (var483 == 3103) {
                            class8.method67(true);
                            continue;
                        }
                        if (var483 == 3104) {
                            class91.field1561++;
                            var7--;
                            class128 var422 = class103.field1759[var7];
                            int var423 = 0;
                            if (var422.method821(-3677)) {
                                var423 = var422.method845((byte) -128);
                            }
                            class71.field1320.method570(244, -1);
                            class71.field1320.method1337(-106, var423);
                            continue;
                        }
                        if (var483 == 3105) {
                            class20.field538++;
                            var7--;
                            class128 var424 = class103.field1759[var7];
                            class71.field1320.method570(75, -1);
                            class71.field1320.method1344(101, var424.method819((byte) 99));
                            continue;
                        }
                        if (var483 == 3106) {
                            class1.field6++;
                            var7--;
                            class128 var425 = class103.field1759[var7];
                            class71.field1320.method570(191, -1);
                            class71.field1320.method1352(7528, var425.method865((byte) -114) + 1);
                            class71.field1320.method1343((byte) 66, var425);
                            continue;
                        }
                        if (var483 == 3107) {
                            var7--;
                            class128 var426 = class103.field1759[var7];
                            var6--;
                            int var427 = class140.field2396[var6];
                            class43.method297(var427, (byte) 100, var426);
                            continue;
                        }
                        if (var483 == 3108) {
                            var6 -= 3;
                            int var428 = class140.field2396[var6];
                            int var429 = class140.field2396[var6 + 1];
                            int var430 = class140.field2396[var6 + 2];
                            class10 var431 = class233.method1606(arg1, var430);
                            class102.method630(var429, var428, var431, 1163);
                            continue;
                        }
                        if (var483 == 3109) {
                            var6 -= 2;
                            class10 var432 = var46 ? class265.field4597 : class106.field1811;
                            int var433 = class140.field2396[var6];
                            int var434 = class140.field2396[var6 + 1];
                            class102.method630(var434, var433, var432, 1163);
                            continue;
                        }
                        if (var483 == 3110) {
                            var6--;
                            int var435 = class140.field2396[var6];
                            class252.field4357++;
                            class71.field1320.method570(180, -1);
                            class71.field1320.method1324(var435, 15803);
                            continue;
                        }
                    } else if (var483 < 3300) {
                        if (var483 == 3200) {
                            var6 -= 3;
                            class218.method1510(class140.field2396[var6 + 1], class140.field2396[var6], false, class140.field2396[var6 + 2]);
                            continue;
                        }
                        if (var483 == 3201) {
                            var6--;
                            class38.method263(class140.field2396[var6], 25250);
                            continue;
                        }
                        if (var483 == 3202) {
                            var6 -= 2;
                            class166.method1088(class140.field2396[var6 + 1], 127, class140.field2396[var6]);
                            continue;
                        }
                    } else if (var483 < 3400) {
                        if (var483 == 3300) {
                            class140.field2396[var6++] = class293.field5011;
                            continue;
                        }
                        if (var483 == 3301) {
                            var6 -= 2;
                            int var394 = class140.field2396[var6];
                            int var395 = class140.field2396[var6 + 1];
                            class140.field2396[var6++] = client.method1648(var395, var394, -70);
                            continue;
                        }
                        if (var483 == 3302) {
                            var6 -= 2;
                            int var396 = class140.field2396[var6];
                            int var397 = class140.field2396[var6 + 1];
                            class140.field2396[var6++] = class288.method1986(var397, (byte) -53, var396);
                            continue;
                        }
                        if (var483 == 3303) {
                            var6 -= 2;
                            int var398 = class140.field2396[var6];
                            int var399 = class140.field2396[var6 + 1];
                            class140.field2396[var6++] = class116.method698(-22575, var399, var398);
                            continue;
                        }
                        if (var483 == 3304) {
                            var6--;
                            int var400 = class140.field2396[var6];
                            class140.field2396[var6++] = class292.method2006((byte) -113, var400).field4037;
                            continue;
                        }
                        if (var483 == 3305) {
                            var6--;
                            int var401 = class140.field2396[var6];
                            class140.field2396[var6++] = class128.field2219[var401];
                            continue;
                        }
                        if (var483 == 3306) {
                            var6--;
                            int var402 = class140.field2396[var6];
                            class140.field2396[var6++] = class221.field3884[var402];
                            continue;
                        }
                        if (var483 == 3307) {
                            var6--;
                            int var403 = class140.field2396[var6];
                            class140.field2396[var6++] = class207.field3631[var403];
                            continue;
                        }
                        if (var483 == 3308) {
                            int var404 = class133.field2315;
                            int var405 = (class163.field2796.field418 >> 7) + class4.field72;
                            int var406 = (class163.field2796.field478 >> 7) + class221.field3889;
                            class140.field2396[var6++] = (var404 << 28) + (var406 << 14) + var405;
                            continue;
                        }
                        if (var483 == 3309) {
                            var6--;
                            int var407 = class140.field2396[var6];
                            class140.field2396[var6++] = class238.method1622(16383, var407 >> 14);
                            continue;
                        }
                        if (var483 == 3310) {
                            var6--;
                            int var408 = class140.field2396[var6];
                            class140.field2396[var6++] = var408 >> 28;
                            continue;
                        }
                        if (var483 == 3311) {
                            var6--;
                            int var409 = class140.field2396[var6];
                            class140.field2396[var6++] = class238.method1622(var409, 16383);
                            continue;
                        }
                        if (var483 == 3312) {
                            class140.field2396[var6++] = class170.field2961 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3313) {
                            var6 -= 2;
                            int var410 = class140.field2396[var6 + 1];
                            int var411 = class140.field2396[var6] + 32768;
                            class140.field2396[var6++] = client.method1648(var410, var411, -87);
                            continue;
                        }
                        if (var483 == 3314) {
                            var6 -= 2;
                            int var412 = class140.field2396[var6] + 32768;
                            int var413 = class140.field2396[var6 + 1];
                            class140.field2396[var6++] = class288.method1986(var413, (byte) -53, var412);
                            continue;
                        }
                        if (var483 == 3315) {
                            var6 -= 2;
                            int var414 = class140.field2396[var6] + 32768;
                            int var415 = class140.field2396[var6 + 1];
                            class140.field2396[var6++] = class116.method698(-22575, var415, var414);
                            continue;
                        }
                        if (var483 == 3316) {
                            if (class226.field3943 < 2) {
                                class140.field2396[var6++] = 0;
                            } else {
                                class140.field2396[var6++] = class226.field3943;
                            }
                            continue;
                        }
                        if (var483 == 3317) {
                            class140.field2396[var6++] = class32.field713;
                            continue;
                        }
                        if (var483 == 3318) {
                            class140.field2396[var6++] = class105.field1793;
                            continue;
                        }
                        if (var483 == 3321) {
                            class140.field2396[var6++] = class57.field1087;
                            continue;
                        }
                        if (var483 == 3322) {
                            class140.field2396[var6++] = class6.field116;
                            continue;
                        }
                        if (var483 == 3323) {
                            if (class112.field1866 >= 5 && class112.field1866 <= 9) {
                                class140.field2396[var6++] = 1;
                                continue;
                            }
                            class140.field2396[var6++] = 0;
                            continue;
                        }
                        if (var483 == 3324) {
                            if (class112.field1866 >= 5 && class112.field1866 <= 9) {
                                class140.field2396[var6++] = class112.field1866;
                                continue;
                            }
                            class140.field2396[var6++] = 0;
                            continue;
                        }
                        if (var483 == 3325) {
                            class140.field2396[var6++] = class239.field4084 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3326) {
                            class140.field2396[var6++] = class163.field2796.field2081;
                            continue;
                        }
                        if (var483 == 3327) {
                            class140.field2396[var6++] = class163.field2796.field2078.field119 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3328) {
                            class140.field2396[var6++] = class191.field3311;
                            continue;
                        }
                        if (var483 == 3329) {
                            class140.field2396[var6++] = class208.field3681;
                            continue;
                        }
                        if (var483 == 3330) {
                            var6--;
                            int var416 = class140.field2396[var6];
                            class140.field2396[var6++] = class273.method1920(var416, 0);
                            continue;
                        }
                        if (var483 == 3331) {
                            var6 -= 2;
                            int var417 = class140.field2396[var6];
                            int var418 = class140.field2396[var6 + 1];
                            class140.field2396[var6++] = class150.method1004((byte) 123, var418, var417, false);
                            continue;
                        }
                        if (var483 == 3332) {
                            var6 -= 2;
                            int var419 = class140.field2396[var6];
                            int var420 = class140.field2396[var6 + 1];
                            class140.field2396[var6++] = class150.method1004((byte) 126, var420, var419, true);
                            continue;
                        }
                        if (var483 == 3333) {
                            class140.field2396[var6++] = class173.field3024;
                            continue;
                        }
                        if (var483 == 3335) {
                            class140.field2396[var6++] = class77.field1417;
                            continue;
                        }
                    } else if (var483 < 3500) {
                        if (var483 == 3400) {
                            var6 -= 2;
                            int var69 = class140.field2396[var6];
                            int var70 = class140.field2396[var6 + 1];
                            class196 var71 = class176.method1211(50, var69);
                            if (var71.field3450 != 115) {
                            }
                            class103.field1759[var7++] = var71.method1371(var70, (byte) 45);
                            continue;
                        }
                        if (var483 == 3408) {
                            var6 -= 4;
                            int var72 = class140.field2396[var6];
                            int var73 = class140.field2396[var6 + 3];
                            int var74 = class140.field2396[var6 + 2];
                            int var75 = class140.field2396[var6 + 1];
                            class196 var76 = class176.method1211(50, var74);
                            if (var76.field3455 == var72 && var76.field3450 == var75) {
                                if (var75 == 115) {
                                    class103.field1759[var7++] = var76.method1371(var73, (byte) 120);
                                } else {
                                    class140.field2396[var6++] = var76.method1364(var73, 31343);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var483 == 3409) {
                            var6 -= 3;
                            int var77 = class140.field2396[var6];
                            int var78 = class140.field2396[var6 + 2];
                            int var79 = class140.field2396[var6 + 1];
                            if (var79 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class196 var80 = class176.method1211(50, var79);
                            if (var80.field3450 != var77) {
                                throw new RuntimeException("C3409-1");
                            }
                            class140.field2396[var6++] = var80.method1370((byte) 58, var78) ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3410) {
                            var6--;
                            int var81 = class140.field2396[var6];
                            var7--;
                            class128 var82 = class103.field1759[var7];
                            if (var81 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class196 var83 = class176.method1211(50, var81);
                            if (var83.field3450 != 115) {
                                throw new RuntimeException("C3410-1");
                            }
                            class140.field2396[var6++] = var83.method1369(24927, var82) ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3411) {
                            var6--;
                            int var84 = class140.field2396[var6];
                            class196 var85 = class176.method1211(50, var84);
                            class140.field2396[var6++] = var85.field3432.method727((byte) 40);
                            continue;
                        }
                    } else if (var483 < 3700) {
                        if (var483 == 3600) {
                            if (class177.field3111 == 0) {
                                class140.field2396[var6++] = -2;
                            } else if (class177.field3111 == 1) {
                                class140.field2396[var6++] = -1;
                            } else {
                                class140.field2396[var6++] = class214.field3779;
                            }
                            continue;
                        }
                        if (var483 == 3601) {
                            var6--;
                            int var86 = class140.field2396[var6];
                            if (class177.field3111 == 2 && class214.field3779 > var86) {
                                class103.field1759[var7++] = class313.field5284[var86];
                                continue;
                            }
                            class103.field1759[var7++] = class22.field556;
                            continue;
                        }
                        if (var483 == 3602) {
                            var6--;
                            int var87 = class140.field2396[var6];
                            if (class177.field3111 == 2 && class214.field3779 > var87) {
                                class140.field2396[var6++] = class171.field2996[var87];
                                continue;
                            }
                            class140.field2396[var6++] = 0;
                            continue;
                        }
                        if (var483 == 3603) {
                            var6--;
                            int var88 = class140.field2396[var6];
                            if (class177.field3111 == 2 && var88 < class214.field3779) {
                                class140.field2396[var6++] = class208.field3707[var88];
                                continue;
                            }
                            class140.field2396[var6++] = 0;
                            continue;
                        }
                        if (var483 == 3604) {
                            var7--;
                            class128 var89 = class103.field1759[var7];
                            var6--;
                            int var90 = class140.field2396[var6];
                            class134.method894(-112, var89, var90);
                            continue;
                        }
                        if (var483 == 3605) {
                            var7--;
                            class128 var91 = class103.field1759[var7];
                            class96.method604(var91.method819((byte) 122), 198);
                            continue;
                        }
                        if (var483 == 3606) {
                            var7--;
                            class128 var92 = class103.field1759[var7];
                            class16.method123(var92.method819((byte) 118), (byte) 64);
                            continue;
                        }
                        if (var483 == 3607) {
                            var7--;
                            class128 var93 = class103.field1759[var7];
                            class108.method660(-110, var93.method819((byte) 112));
                            continue;
                        }
                        if (var483 == 3608) {
                            var7--;
                            class128 var94 = class103.field1759[var7];
                            class175.method1203(var94.method819((byte) 118), arg1);
                            continue;
                        }
                        if (var483 == 3609) {
                            var7--;
                            class128 var95 = class103.field1759[var7];
                            if (var95.method838(class165.field2830, -9650) || var95.method838(client.field4167, -9650)) {
                                var95 = var95.method829(7, (byte) 123);
                            }
                            class140.field2396[var6++] = class84.method535(var95, -1373) ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3610) {
                            var6--;
                            int var96 = class140.field2396[var6];
                            if (class177.field3111 == 2 && class214.field3779 > var96) {
                                class103.field1759[var7++] = class6.field114[var96];
                                continue;
                            }
                            class103.field1759[var7++] = class22.field556;
                            continue;
                        }
                        if (var483 == 3611) {
                            if (class183.field3208 == null) {
                                class103.field1759[var7++] = class22.field556;
                            } else {
                                class103.field1759[var7++] = class183.field3208.method850(55);
                            }
                            continue;
                        }
                        if (var483 == 3612) {
                            if (class183.field3208 == null) {
                                class140.field2396[var6++] = 0;
                            } else {
                                class140.field2396[var6++] = class288.field4928;
                            }
                            continue;
                        }
                        if (var483 == 3613) {
                            var6--;
                            int var97 = class140.field2396[var6];
                            if (class183.field3208 != null && var97 < class288.field4928) {
                                class103.field1759[var7++] = class208.field3694[var97].field582.method850(55);
                                continue;
                            }
                            class103.field1759[var7++] = class22.field556;
                            continue;
                        }
                        if (var483 == 3614) {
                            var6--;
                            int var98 = class140.field2396[var6];
                            if (class183.field3208 != null && class288.field4928 > var98) {
                                class140.field2396[var6++] = class208.field3694[var98].field579;
                                continue;
                            }
                            class140.field2396[var6++] = 0;
                            continue;
                        }
                        if (var483 == 3615) {
                            var6--;
                            int var99 = class140.field2396[var6];
                            if (class183.field3208 != null && var99 < class288.field4928) {
                                class140.field2396[var6++] = class208.field3694[var99].field578;
                                continue;
                            }
                            class140.field2396[var6++] = 0;
                            continue;
                        }
                        if (var483 == 3616) {
                            class140.field2396[var6++] = class278.field4793;
                            continue;
                        }
                        if (var483 == 3617) {
                            var7--;
                            class128 var100 = class103.field1759[var7];
                            class65.method443(var100, (byte) -122);
                            continue;
                        }
                        if (var483 == 3618) {
                            class140.field2396[var6++] = class203.field3600;
                            continue;
                        }
                        if (var483 == 3619) {
                            var7--;
                            class128 var101 = class103.field1759[var7];
                            class88.method550((byte) 75, var101.method819((byte) 121));
                            continue;
                        }
                        if (var483 == 3620) {
                            class226.method1557(1);
                            continue;
                        }
                        if (var483 == 3621) {
                            if (class177.field3111 == 0) {
                                class140.field2396[var6++] = -1;
                            } else {
                                class140.field2396[var6++] = class218.field3847;
                            }
                            continue;
                        }
                        if (var483 == 3622) {
                            var6--;
                            int var102 = class140.field2396[var6];
                            if (class177.field3111 != 0 && var102 < class218.field3847) {
                                class103.field1759[var7++] = class260.method1827(true, class208.field3646[var102]).method850(55);
                                continue;
                            }
                            class103.field1759[var7++] = class22.field556;
                            continue;
                        }
                        if (var483 == 3623) {
                            var7--;
                            class128 var103 = class103.field1759[var7];
                            if (var103.method838(class165.field2830, -9650) || var103.method838(client.field4167, -9650)) {
                                var103 = var103.method829(7, (byte) 104);
                            }
                            class140.field2396[var6++] = class254.method1800((byte) 90, var103) ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3624) {
                            var6--;
                            int var104 = class140.field2396[var6];
                            if (class208.field3694 != null && class288.field4928 > var104 && class208.field3694[var104].field582.method861(10362, class163.field2796.field2079)) {
                                class140.field2396[var6++] = 1;
                                continue;
                            }
                            class140.field2396[var6++] = 0;
                            continue;
                        }
                        if (var483 == 3625) {
                            if (class90.field1528 == null) {
                                class103.field1759[var7++] = class22.field556;
                            } else {
                                class103.field1759[var7++] = class90.field1528.method850(55);
                            }
                            continue;
                        }
                        if (var483 == 3626) {
                            var6--;
                            int var105 = class140.field2396[var6];
                            if (class183.field3208 != null && class288.field4928 > var105) {
                                class103.field1759[var7++] = class208.field3694[var105].field569;
                                continue;
                            }
                            class103.field1759[var7++] = class22.field556;
                            continue;
                        }
                        if (var483 == 3627) {
                            var6--;
                            int var106 = class140.field2396[var6];
                            if (class177.field3111 == 2 && var106 >= 0 && var106 < class214.field3779) {
                                class140.field2396[var6++] = class256.field4406[var106] ? 1 : 0;
                                continue;
                            }
                            class140.field2396[var6++] = 0;
                            continue;
                        }
                        if (var483 == 3628) {
                            var7--;
                            class128 var107 = class103.field1759[var7];
                            if (var107.method838(class165.field2830, -9650) || var107.method838(client.field4167, -9650)) {
                                var107 = var107.method829(7, (byte) 106);
                            }
                            class140.field2396[var6++] = class94.method590(true, var107);
                            continue;
                        }
                    } else if (var483 < 4000) {
                        if (var483 == 3903) {
                            var6--;
                            int var108 = class140.field2396[var6];
                            class140.field2396[var6++] = class273.field4738[var108].method1266((byte) 100);
                            continue;
                        }
                        if (var483 == 3904) {
                            var6--;
                            int var109 = class140.field2396[var6];
                            class140.field2396[var6++] = class273.field4738[var109].field3270;
                            continue;
                        }
                        if (var483 == 3905) {
                            var6--;
                            int var110 = class140.field2396[var6];
                            class140.field2396[var6++] = class273.field4738[var110].field3272;
                            continue;
                        }
                        if (var483 == 3906) {
                            var6--;
                            int var111 = class140.field2396[var6];
                            class140.field2396[var6++] = class273.field4738[var111].field3257;
                            continue;
                        }
                        if (var483 == 3907) {
                            var6--;
                            int var112 = class140.field2396[var6];
                            class140.field2396[var6++] = class273.field4738[var112].field3274;
                            continue;
                        }
                        if (var483 == 3908) {
                            var6--;
                            int var113 = class140.field2396[var6];
                            class140.field2396[var6++] = class273.field4738[var113].field3275;
                            continue;
                        }
                        if (var483 == 3910) {
                            var6--;
                            int var114 = class140.field2396[var6];
                            int var115 = class273.field4738[var114].method1262((byte) -106);
                            class140.field2396[var6++] = var115 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3911) {
                            var6--;
                            int var116 = class140.field2396[var6];
                            int var117 = class273.field4738[var116].method1262((byte) -106);
                            class140.field2396[var6++] = var117 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3912) {
                            var6--;
                            int var118 = class140.field2396[var6];
                            int var119 = class273.field4738[var118].method1262((byte) -106);
                            class140.field2396[var6++] = var119 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3913) {
                            var6--;
                            int var120 = class140.field2396[var6];
                            int var121 = class273.field4738[var120].method1262((byte) -106);
                            class140.field2396[var6++] = var121 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var483 < 4100) {
                        if (var483 == 4000) {
                            var6 -= 2;
                            int var349 = class140.field2396[var6];
                            int var350 = class140.field2396[var6 + 1];
                            class140.field2396[var6++] = var349 + var350;
                            continue;
                        }
                        if (var483 == 4001) {
                            var6 -= 2;
                            int var351 = class140.field2396[var6];
                            int var352 = class140.field2396[var6 + 1];
                            class140.field2396[var6++] = var351 - var352;
                            continue;
                        }
                        if (var483 == 4002) {
                            var6 -= 2;
                            int var353 = class140.field2396[var6];
                            int var354 = class140.field2396[var6 + 1];
                            class140.field2396[var6++] = var353 * var354;
                            continue;
                        }
                        if (var483 == 4003) {
                            var6 -= 2;
                            int var355 = class140.field2396[var6];
                            int var356 = class140.field2396[var6 + 1];
                            class140.field2396[var6++] = var355 / var356;
                            continue;
                        }
                        if (var483 == 4004) {
                            var6--;
                            int var357 = class140.field2396[var6];
                            class140.field2396[var6++] = (int) (Math.random() * (double) var357);
                            continue;
                        }
                        if (var483 == 4005) {
                            var6--;
                            int var358 = class140.field2396[var6];
                            class140.field2396[var6++] = (int) (Math.random() * (double) (var358 + 1));
                            continue;
                        }
                        if (var483 == 4006) {
                            var6 -= 5;
                            int var359 = class140.field2396[var6 + 1];
                            int var360 = class140.field2396[var6];
                            int var361 = class140.field2396[var6 + 2];
                            int var362 = class140.field2396[var6 + 3];
                            int var363 = class140.field2396[var6 + 4];
                            class140.field2396[var6++] = var360 + ((var359 - var360) * (var363 - var361) / (var362 - var361));
                            continue;
                        }
                        if (var483 == 4007) {
                            var6 -= 2;
                            long var364 = (long) class140.field2396[var6];
                            long var366 = (long) class140.field2396[var6 + 1];
                            class140.field2396[var6++] = (int) (var364 * var366 / 100L + var364);
                            continue;
                        }
                        if (var483 == 4008) {
                            var6 -= 2;
                            int var368 = class140.field2396[var6];
                            int var369 = class140.field2396[var6 + 1];
                            class140.field2396[var6++] = class279.method1951(0x1 << var369, var368);
                            continue;
                        }
                        if (var483 == 4009) {
                            var6 -= 2;
                            int var370 = class140.field2396[var6 + 1];
                            int var371 = class140.field2396[var6];
                            class140.field2396[var6++] = class238.method1622(var371, -(0x1 << var370) - 1);
                            continue;
                        }
                        if (var483 == 4010) {
                            var6 -= 2;
                            int var372 = class140.field2396[var6 + 1];
                            int var373 = class140.field2396[var6];
                            class140.field2396[var6++] = class238.method1622(0x1 << var372, var373) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var483 == 4011) {
                            var6 -= 2;
                            int var374 = class140.field2396[var6];
                            int var375 = class140.field2396[var6 + 1];
                            class140.field2396[var6++] = var374 % var375;
                            continue;
                        }
                        if (var483 == 4012) {
                            var6 -= 2;
                            int var376 = class140.field2396[var6 + 1];
                            int var377 = class140.field2396[var6];
                            if (var377 == 0) {
                                class140.field2396[var6++] = 0;
                            } else {
                                class140.field2396[var6++] = (int) Math.pow((double) var377, (double) var376);
                            }
                            continue;
                        }
                        if (var483 == 4013) {
                            var6 -= 2;
                            int var378 = class140.field2396[var6 + 1];
                            int var379 = class140.field2396[var6];
                            if (var379 == 0) {
                                class140.field2396[var6++] = 0;
                            } else if (var378 == 0) {
                                class140.field2396[var6++] = Integer.MAX_VALUE;
                            } else {
                                class140.field2396[var6++] = (int) Math.pow((double) var379, 1.0D / (double) var378);
                            }
                            continue;
                        }
                        if (var483 == 4014) {
                            var6 -= 2;
                            int var380 = class140.field2396[var6];
                            int var381 = class140.field2396[var6 + 1];
                            class140.field2396[var6++] = class238.method1622(var380, var381);
                            continue;
                        }
                        if (var483 == 4015) {
                            var6 -= 2;
                            int var382 = class140.field2396[var6];
                            int var383 = class140.field2396[var6 + 1];
                            class140.field2396[var6++] = class279.method1951(var382, var383);
                            continue;
                        }
                        if (var483 == 4016) {
                            var6 -= 2;
                            int var384 = class140.field2396[var6];
                            int var385 = class140.field2396[var6 + 1];
                            class140.field2396[var6++] = var385 <= var384 ? var385 : var384;
                            continue;
                        }
                        if (var483 == 4017) {
                            var6 -= 2;
                            int var386 = class140.field2396[var6];
                            int var387 = class140.field2396[var6 + 1];
                            class140.field2396[var6++] = var386 <= var387 ? var387 : var386;
                            continue;
                        }
                        if (var483 == 4018) {
                            var6 -= 3;
                            long var388 = (long) class140.field2396[var6];
                            long var390 = (long) class140.field2396[var6 + 1];
                            long var392 = (long) class140.field2396[var6 + 2];
                            class140.field2396[var6++] = (int) (var388 * var392 / var390);
                            continue;
                        }
                    } else if (var483 < 4200) {
                        if (var483 == 4100) {
                            var7--;
                            class128 var297 = class103.field1759[var7];
                            var6--;
                            int var298 = class140.field2396[var6];
                            class103.field1759[var7++] = class28.method177((byte) -95, new class128[] { var297, class257.method1811(var298, (byte) -6) });
                            continue;
                        }
                        if (var483 == 4101) {
                            var7 -= 2;
                            class128 var299 = class103.field1759[var7 + 1];
                            class128 var300 = class103.field1759[var7];
                            class103.field1759[var7++] = class28.method177((byte) -127, new class128[] { var300, var299 });
                            continue;
                        }
                        if (var483 == 4102) {
                            var6--;
                            int var301 = class140.field2396[var6];
                            var7--;
                            class128 var302 = class103.field1759[var7];
                            class103.field1759[var7++] = class28.method177((byte) -92, new class128[] { var302, class79.method509(var301, (byte) 42, true) });
                            continue;
                        }
                        if (var483 == 4103) {
                            var7--;
                            class128 var303 = class103.field1759[var7];
                            class103.field1759[var7++] = var303.method836((byte) 72);
                            continue;
                        }
                        if (var483 == 4104) {
                            var6--;
                            int var304 = class140.field2396[var6];
                            long var305 = (long) var304 * 86400000L + 1014768000000L;
                            class34.field728.setTime(new Date(var305));
                            int var307 = class34.field728.get(5);
                            int var308 = class34.field728.get(2);
                            int var309 = class34.field728.get(1);
                            class103.field1759[var7++] = class28.method177((byte) -99, new class128[] { class257.method1811(var307, (byte) 122), class307.field5223, class249.field4284[var308], class307.field5223, class257.method1811(var309, (byte) -124) });
                            continue;
                        }
                        if (var483 == 4105) {
                            var7 -= 2;
                            class128 var310 = class103.field1759[var7];
                            class128 var311 = class103.field1759[var7 + 1];
                            if (class163.field2796.field2078 != null && class163.field2796.field2078.field119) {
                                class103.field1759[var7++] = var311;
                                continue;
                            }
                            class103.field1759[var7++] = var310;
                            continue;
                        }
                        if (var483 == 4106) {
                            var6--;
                            int var312 = class140.field2396[var6];
                            class103.field1759[var7++] = class257.method1811(var312, (byte) -124);
                            continue;
                        }
                        if (var483 == 4107) {
                            var7 -= 2;
                            class140.field2396[var6++] = class103.field1759[var7].method853(class103.field1759[var7 + 1], -22264);
                            continue;
                        }
                        if (var483 == 4108) {
                            var6 -= 2;
                            int var313 = class140.field2396[var6];
                            var7--;
                            class128 var314 = class103.field1759[var7];
                            int var315 = class140.field2396[var6 + 1];
                            byte[] var316 = class107.field1822.method2155(0, var315, (byte) 70);
                            class14 var317 = new class14(var316);
                            var317.method2084(class167.field2861, (int[]) null);
                            class140.field2396[var6++] = var317.method2071(var314, var313);
                            continue;
                        }
                        if (var483 == 4109) {
                            var6 -= 2;
                            var7--;
                            class128 var318 = class103.field1759[var7];
                            int var319 = class140.field2396[var6];
                            int var320 = class140.field2396[var6 + 1];
                            byte[] var321 = class107.field1822.method2155(0, var320, (byte) 70);
                            class14 var322 = new class14(var321);
                            var322.method2084(class167.field2861, (int[]) null);
                            class140.field2396[var6++] = var322.method2081(var318, var319);
                            continue;
                        }
                        if (var483 == 4110) {
                            var7 -= 2;
                            class128 var323 = class103.field1759[var7 + 1];
                            class128 var324 = class103.field1759[var7];
                            var6--;
                            if (class140.field2396[var6] == 1) {
                                class103.field1759[var7++] = var324;
                            } else {
                                class103.field1759[var7++] = var323;
                            }
                            continue;
                        }
                        if (var483 == 4111) {
                            var7--;
                            class128 var325 = class103.field1759[var7];
                            class103.field1759[var7++] = class305.method2066(var325);
                            continue;
                        }
                        if (var483 == 4112) {
                            var7--;
                            class128 var326 = class103.field1759[var7];
                            var6--;
                            int var327 = class140.field2396[var6];
                            if (var327 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class103.field1759[var7++] = var326.method830(1, var327);
                            continue;
                        }
                        if (var483 == 4113) {
                            var6--;
                            int var328 = class140.field2396[var6];
                            class140.field2396[var6++] = class230.method1579(2, var328) ? 1 : 0;
                            continue;
                        }
                        if (var483 == 4114) {
                            var6--;
                            int var329 = class140.field2396[var6];
                            class140.field2396[var6++] = class121.method740(true, var329) ? 1 : 0;
                            continue;
                        }
                        if (var483 == 4115) {
                            var6--;
                            int var330 = class140.field2396[var6];
                            class140.field2396[var6++] = class268.method1868(var330, (byte) -95) ? 1 : 0;
                            continue;
                        }
                        if (var483 == 4116) {
                            var6--;
                            int var331 = class140.field2396[var6];
                            class140.field2396[var6++] = class246.method1673(57, var331) ? 1 : 0;
                            continue;
                        }
                        if (var483 == 4117) {
                            var7--;
                            class128 var332 = class103.field1759[var7];
                            if (var332 == null) {
                                class140.field2396[var6++] = 0;
                            } else {
                                class140.field2396[var6++] = var332.method865((byte) -77);
                            }
                            continue;
                        }
                        if (var483 == 4118) {
                            var6 -= 2;
                            var7--;
                            class128 var333 = class103.field1759[var7];
                            int var334 = class140.field2396[var6];
                            int var335 = class140.field2396[var6 + 1];
                            class103.field1759[var7++] = var333.method848(var334, 88, var335);
                            continue;
                        }
                        if (var483 == 4119) {
                            var7--;
                            class128 var336 = class103.field1759[var7];
                            class128 var337 = class4.method25(95, var336.method865((byte) 124));
                            boolean var338 = false;
                            for (int var339 = 0; var339 < var336.method865((byte) 83); var339++) {
                                int var340 = var336.method828((byte) 48, var339);
                                if (var340 == 60) {
                                    var338 = true;
                                } else if (var340 == 62) {
                                    var338 = false;
                                } else if (!var338) {
                                    var337.method831(!arg1, var340);
                                }
                            }
                            var337.method846(116);
                            class103.field1759[var7++] = var337;
                            continue;
                        }
                        if (var483 == 4120) {
                            var6 -= 2;
                            var7--;
                            class128 var341 = class103.field1759[var7];
                            int var342 = class140.field2396[var6];
                            int var343 = class140.field2396[var6 + 1];
                            class140.field2396[var6++] = var341.method862(var342, -72, var343);
                            continue;
                        }
                        if (var483 == 4121) {
                            var7 -= 2;
                            var6--;
                            int var344 = class140.field2396[var6];
                            class128 var345 = class103.field1759[var7 + 1];
                            class128 var346 = class103.field1759[var7];
                            class140.field2396[var6++] = var346.method817(0, var344, var345);
                            continue;
                        }
                        if (var483 == 4122) {
                            var6--;
                            int var347 = class140.field2396[var6];
                            class140.field2396[var6++] = class297.method2035(-128, var347);
                            continue;
                        }
                        if (var483 == 4123) {
                            var6--;
                            int var348 = class140.field2396[var6];
                            class140.field2396[var6++] = class99.method620(var348, (byte) -68);
                            continue;
                        }
                    } else if (var483 < 4300) {
                        if (var483 == 4200) {
                            var6--;
                            int var278 = class140.field2396[var6];
                            class103.field1759[var7++] = class180.method1226(false, var278).field3506;
                            continue;
                        }
                        if (var483 == 4201) {
                            var6 -= 2;
                            int var279 = class140.field2396[var6];
                            int var280 = class140.field2396[var6 + 1];
                            class200 var281 = class180.method1226(!arg1, var279);
                            if (var280 >= 1 && var280 <= 5 && var281.field3517[var280 - 1] != null) {
                                class103.field1759[var7++] = var281.field3517[var280 - 1];
                                continue;
                            }
                            class103.field1759[var7++] = class22.field556;
                            continue;
                        }
                        if (var483 == 4202) {
                            var6 -= 2;
                            int var282 = class140.field2396[var6 + 1];
                            int var283 = class140.field2396[var6];
                            class200 var284 = class180.method1226(!arg1, var283);
                            if (var282 >= 1 && var282 <= 5 && var284.field3521[var282 - 1] != null) {
                                class103.field1759[var7++] = var284.field3521[var282 - 1];
                                continue;
                            }
                            class103.field1759[var7++] = class22.field556;
                            continue;
                        }
                        if (var483 == 4203) {
                            var6--;
                            int var285 = class140.field2396[var6];
                            class140.field2396[var6++] = class180.method1226(false, var285).field3534;
                            continue;
                        }
                        if (var483 == 4204) {
                            var6--;
                            int var286 = class140.field2396[var6];
                            class140.field2396[var6++] = class180.method1226(false, var286).field3497 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 4205) {
                            var6--;
                            int var287 = class140.field2396[var6];
                            class200 var288 = class180.method1226(false, var287);
                            if (var288.field3537 == -1 && var288.field3528 >= 0) {
                                class140.field2396[var6++] = var288.field3528;
                                continue;
                            }
                            class140.field2396[var6++] = var287;
                            continue;
                        }
                        if (var483 == 4206) {
                            var6--;
                            int var289 = class140.field2396[var6];
                            class200 var290 = class180.method1226(false, var289);
                            if (var290.field3537 >= 0 && var290.field3528 >= 0) {
                                class140.field2396[var6++] = var290.field3528;
                                continue;
                            }
                            class140.field2396[var6++] = var289;
                            continue;
                        }
                        if (var483 == 4207) {
                            var6--;
                            int var291 = class140.field2396[var6];
                            class140.field2396[var6++] = class180.method1226(false, var291).field3485 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 4208) {
                            var6 -= 2;
                            int var292 = class140.field2396[var6];
                            int var293 = class140.field2396[var6 + 1];
                            class62 var294 = class207.method1422(11, var293);
                            if (var294.method410(0)) {
                                class103.field1759[var7++] = class180.method1226(!arg1, var292).method1384((byte) 120, var294.field1170, var293);
                            } else {
                                class140.field2396[var6++] = class180.method1226(false, var292).method1394(-86, var294.field1164, var293);
                            }
                            continue;
                        }
                        if (var483 == 4210) {
                            var7--;
                            class128 var295 = class103.field1759[var7];
                            var6--;
                            int var296 = class140.field2396[var6];
                            class233.method1602(0, var296 == 1, var295);
                            class140.field2396[var6++] = class315.field5341;
                            continue;
                        }
                        if (var483 == 4211) {
                            if (class118.field2001 != null && class215.field3786 < class315.field5341) {
                                class140.field2396[var6++] = class238.method1622(class118.field2001[class215.field3786++], 65535);
                                continue;
                            }
                            class140.field2396[var6++] = -1;
                            continue;
                        }
                        if (var483 == 4212) {
                            class215.field3786 = 0;
                            continue;
                        }
                    } else if (var483 < 4400) {
                        if (var483 == 4300) {
                            var6 -= 2;
                            int var268 = class140.field2396[var6 + 1];
                            int var269 = class140.field2396[var6];
                            class62 var270 = class207.method1422(11, var268);
                            if (var270.method410(0)) {
                                class103.field1759[var7++] = class203.method1411(false, var269).method1430(86, var268, var270.field1170);
                            } else {
                                class140.field2396[var6++] = class203.method1411(false, var269).method1427(var270.field1164, -27403, var268);
                            }
                            continue;
                        }
                        if (var483 == 4301) {
                            var6--;
                            int var271 = class140.field2396[var6];
                            class140.field2396[var6++] = class203.method1411(false, var271).field3639;
                            continue;
                        }
                        if (var483 == 4302) {
                            var6--;
                            int var272 = class140.field2396[var6];
                            class140.field2396[var6++] = class203.method1411(false, var272).field3700;
                            continue;
                        }
                        if (var483 == 4303) {
                            var6--;
                            int var273 = class140.field2396[var6];
                            class140.field2396[var6++] = class203.method1411(false, var273).field3674;
                            continue;
                        }
                        if (var483 == 4304) {
                            var6--;
                            int var274 = class140.field2396[var6];
                            class140.field2396[var6++] = class203.method1411(false, var274).field3647;
                            continue;
                        }
                        if (var483 == 4305) {
                            var6--;
                            int var275 = class140.field2396[var6];
                            class140.field2396[var6++] = class203.method1411(false, var275).field3680;
                            continue;
                        }
                        if (var483 == 4306) {
                            var6--;
                            int var276 = class140.field2396[var6];
                            class140.field2396[var6++] = class203.method1411(false, var276).field3705;
                            continue;
                        }
                        if (var483 == 4307) {
                            var6--;
                            int var277 = class140.field2396[var6];
                            class140.field2396[var6++] = class203.method1411(!arg1, var277).field3697;
                            continue;
                        }
                    } else if (var483 >= 4500) {
                        if (var483 < 4600) {
                            if (var483 == 4500) {
                                var6 -= 2;
                                int var122 = class140.field2396[var6];
                                int var123 = class140.field2396[var6 + 1];
                                class62 var124 = class207.method1422(11, var123);
                                if (var124.method410(0)) {
                                    class103.field1759[var7++] = class9.method72((byte) 126, var122).method1253((byte) 48, var123, var124.field1170);
                                } else {
                                    class140.field2396[var6++] = class9.method72((byte) -62, var122).method1254((byte) -53, var124.field1164, var123);
                                }
                                continue;
                            }
                        } else if (var483 < 5100) {
                            if (var483 == 5000) {
                                class140.field2396[var6++] = class217.field3827;
                                continue;
                            }
                            if (var483 == 5001) {
                                class27.field586++;
                                var6 -= 3;
                                class217.field3827 = class140.field2396[var6];
                                class225.field3930 = class140.field2396[var6 + 1];
                                class155.field2673 = class140.field2396[var6 + 2];
                                class71.field1320.method570(163, -1);
                                class71.field1320.method1352(7528, class217.field3827);
                                class71.field1320.method1352(7528, class225.field3930);
                                class71.field1320.method1352(7528, class155.field2673);
                                continue;
                            }
                            if (var483 == 5002) {
                                class133.field2307++;
                                var6 -= 2;
                                var7--;
                                class128 var125 = class103.field1759[var7];
                                int var126 = class140.field2396[var6];
                                int var127 = class140.field2396[var6 + 1];
                                class71.field1320.method570(10, -1);
                                class71.field1320.method1344(86, var125.method819((byte) 118));
                                class71.field1320.method1352(7528, var126 - 1);
                                class71.field1320.method1352(7528, var127);
                                continue;
                            }
                            if (var483 == 5003) {
                                var6--;
                                int var128 = class140.field2396[var6];
                                class128 var129 = null;
                                if (var128 < 100) {
                                    var129 = class287.field4903[var128];
                                }
                                if (var129 == null) {
                                    var129 = class22.field556;
                                }
                                class103.field1759[var7++] = var129;
                                continue;
                            }
                            if (var483 == 5004) {
                                var6--;
                                int var130 = class140.field2396[var6];
                                int var131 = -1;
                                if (var130 < 100 && class287.field4903[var130] != null) {
                                    var131 = class45.field913[var130];
                                }
                                class140.field2396[var6++] = var131;
                                continue;
                            }
                            if (var483 == 5005) {
                                class140.field2396[var6++] = class225.field3930;
                                continue;
                            }
                            if (var483 == 5008) {
                                var7--;
                                class128 var132 = class103.field1759[var7];
                                if (var132.method838(class55.field1056, -9650)) {
                                    class294.method2014(0, var132);
                                    continue;
                                }
                                if (class226.field3943 == 0 && (class191.field3311 == 1 || class208.field3681 == 1)) {
                                    continue;
                                }
                                byte var133 = 0;
                                class128 var134 = var132.method836((byte) 72);
                                class132.field2281++;
                                byte var135 = 0;
                                if (var134.method838(class66.field1270, -9650)) {
                                    var133 = 0;
                                    var132 = var132.method829(class66.field1270.method865((byte) 124), (byte) 120);
                                } else if (var134.method838(class108.field1843, -9650)) {
                                    var133 = 1;
                                    var132 = var132.method829(class108.field1843.method865((byte) 122), (byte) 109);
                                } else if (var134.method838(class112.field1873, -9650)) {
                                    var133 = 2;
                                    var132 = var132.method829(class112.field1873.method865((byte) -80), (byte) 104);
                                } else if (var134.method838(class246.field4197, -9650)) {
                                    var133 = 3;
                                    var132 = var132.method829(class246.field4197.method865((byte) -91), (byte) 106);
                                } else if (var134.method838(class226.field3945, -9650)) {
                                    var133 = 4;
                                    var132 = var132.method829(class226.field3945.method865((byte) 61), (byte) 106);
                                } else if (var134.method838(class253.field4368, -9650)) {
                                    var133 = 5;
                                    var132 = var132.method829(class253.field4368.method865((byte) -58), (byte) 122);
                                } else if (var134.method838(class177.field3116, -9650)) {
                                    var132 = var132.method829(class177.field3116.method865((byte) 92), (byte) 116);
                                    var133 = 6;
                                } else if (var134.method838(class294.field5033, -9650)) {
                                    var133 = 7;
                                    var132 = var132.method829(class294.field5033.method865((byte) 77), (byte) 105);
                                } else if (var134.method838(class289.field4955, -9650)) {
                                    var132 = var132.method829(class289.field4955.method865((byte) 124), (byte) 126);
                                    var133 = 8;
                                } else if (var134.method838(class103.field1774, -9650)) {
                                    var132 = var132.method829(class103.field1774.method865((byte) 117), (byte) 105);
                                    var133 = 9;
                                } else if (var134.method838(class177.field3123, -9650)) {
                                    var133 = 10;
                                    var132 = var132.method829(class177.field3123.method865((byte) 58), (byte) 111);
                                } else if (var134.method838(class203.field3599, -9650)) {
                                    var132 = var132.method829(class203.field3599.method865((byte) -118), (byte) 116);
                                    var133 = 11;
                                } else if (class77.field1417 != 0) {
                                    if (var134.method838(class66.field1268, -9650)) {
                                        var132 = var132.method829(class66.field1268.method865((byte) 57), (byte) 118);
                                        var133 = 0;
                                    } else if (var134.method838(class108.field1830, -9650)) {
                                        var132 = var132.method829(class108.field1830.method865((byte) 80), (byte) 114);
                                        var133 = 1;
                                    } else if (var134.method838(class112.field1872, -9650)) {
                                        var133 = 2;
                                        var132 = var132.method829(class112.field1872.method865((byte) -96), (byte) 105);
                                    } else if (var134.method838(class246.field4212, -9650)) {
                                        var132 = var132.method829(class246.field4212.method865((byte) 108), (byte) 124);
                                        var133 = 3;
                                    } else if (var134.method838(class226.field3956, -9650)) {
                                        var132 = var132.method829(class226.field3956.method865((byte) 115), (byte) 113);
                                        var133 = 4;
                                    } else if (var134.method838(class253.field4364, -9650)) {
                                        var133 = 5;
                                        var132 = var132.method829(class253.field4364.method865((byte) -81), (byte) 106);
                                    } else if (var134.method838(class177.field3109, -9650)) {
                                        var132 = var132.method829(class177.field3109.method865((byte) -87), (byte) 119);
                                        var133 = 6;
                                    } else if (var134.method838(class294.field5034, -9650)) {
                                        var132 = var132.method829(class294.field5034.method865((byte) 56), (byte) 106);
                                        var133 = 7;
                                    } else if (var134.method838(class289.field4954, -9650)) {
                                        var132 = var132.method829(class289.field4954.method865((byte) 60), (byte) 125);
                                        var133 = 8;
                                    } else if (var134.method838(class103.field1769, -9650)) {
                                        var133 = 9;
                                        var132 = var132.method829(class103.field1769.method865((byte) -66), (byte) 113);
                                    } else if (var134.method838(class177.field3120, -9650)) {
                                        var132 = var132.method829(class177.field3120.method865((byte) -79), (byte) 104);
                                        var133 = 10;
                                    } else if (var134.method838(class203.field3598, -9650)) {
                                        var133 = 11;
                                        var132 = var132.method829(class203.field3598.method865((byte) -58), (byte) 122);
                                    }
                                }
                                class128 var136 = var132.method836((byte) 72);
                                if (var136.method838(class17.field495, -9650)) {
                                    var132 = var132.method829(class17.field495.method865((byte) -61), (byte) 117);
                                    var135 = 1;
                                } else if (var136.method838(class162.field2769, -9650)) {
                                    var132 = var132.method829(class162.field2769.method865((byte) -82), (byte) 116);
                                    var135 = 2;
                                } else if (var136.method838(class198.field3463, -9650)) {
                                    var132 = var132.method829(class198.field3463.method865((byte) 125), (byte) 106);
                                    var135 = 3;
                                } else if (var136.method838(class116.field1950, -9650)) {
                                    var132 = var132.method829(class116.field1950.method865((byte) 127), (byte) 110);
                                    var135 = 4;
                                } else if (var136.method838(class225.field3936, -9650)) {
                                    var132 = var132.method829(class225.field3936.method865((byte) -96), (byte) 109);
                                    var135 = 5;
                                } else if (class77.field1417 != 0) {
                                    if (var136.method838(class17.field489, -9650)) {
                                        var132 = var132.method829(class17.field489.method865((byte) -79), (byte) 123);
                                        var135 = 1;
                                    } else if (var136.method838(class162.field2771, -9650)) {
                                        var132 = var132.method829(class162.field2771.method865((byte) -110), (byte) 106);
                                        var135 = 2;
                                    } else if (var136.method838(class198.field3462, -9650)) {
                                        var135 = 3;
                                        var132 = var132.method829(class198.field3462.method865((byte) 82), (byte) 113);
                                    } else if (var136.method838(class116.field1959, -9650)) {
                                        var135 = 4;
                                        var132 = var132.method829(class116.field1959.method865((byte) 101), (byte) 107);
                                    } else if (var136.method838(class225.field3940, -9650)) {
                                        var132 = var132.method829(class225.field3940.method865((byte) -104), (byte) 110);
                                        var135 = 5;
                                    }
                                }
                                class71.field1320.method570(157, -1);
                                class71.field1320.method1352(7528, 0);
                                int var137 = class71.field1320.field3380;
                                class71.field1320.method1352(7528, var133);
                                class71.field1320.method1352(7528, var135);
                                class143.method954(class71.field1320, -62, var132);
                                class71.field1320.method1294(class71.field1320.field3380 - var137, (byte) 121);
                                continue;
                            }
                            if (var483 == 5009) {
                                var7 -= 2;
                                class128 var138 = class103.field1759[var7];
                                class128 var139 = class103.field1759[var7 + 1];
                                if (class226.field3943 != 0 || class191.field3311 != 1 && class208.field3681 != 1) {
                                    class71.field1320.method570(217, -1);
                                    class71.field1320.method1352(7528, 0);
                                    class33.field715++;
                                    int var140 = class71.field1320.field3380;
                                    class71.field1320.method1344(94, var138.method819((byte) 121));
                                    class143.method954(class71.field1320, -85, var139);
                                    class71.field1320.method1294(class71.field1320.field3380 - var140, (byte) 108);
                                }
                                continue;
                            }
                            if (var483 == 5010) {
                                class128 var141 = null;
                                var6--;
                                int var142 = class140.field2396[var6];
                                if (var142 < 100) {
                                    var141 = class289.field4953[var142];
                                }
                                if (var141 == null) {
                                    var141 = class22.field556;
                                }
                                class103.field1759[var7++] = var141;
                                continue;
                            }
                            if (var483 == 5011) {
                                var6--;
                                int var143 = class140.field2396[var6];
                                class128 var144 = null;
                                if (var143 < 100) {
                                    var144 = class53.field1038[var143];
                                }
                                if (var144 == null) {
                                    var144 = class22.field556;
                                }
                                class103.field1759[var7++] = var144;
                                continue;
                            }
                            if (var483 == 5012) {
                                int var145 = -1;
                                var6--;
                                int var146 = class140.field2396[var6];
                                if (var146 < 100) {
                                    var145 = class249.field4304[var146];
                                }
                                class140.field2396[var6++] = var145;
                                continue;
                            }
                            if (var483 == 5015) {
                                class128 var147;
                                if (class163.field2796 == null || class163.field2796.field2079 == null) {
                                    var147 = class273.field4736;
                                } else {
                                    var147 = class163.field2796.method753(-97);
                                }
                                class103.field1759[var7++] = var147;
                                continue;
                            }
                            if (var483 == 5016) {
                                class140.field2396[var6++] = class155.field2673;
                                continue;
                            }
                            if (var483 == 5017) {
                                class140.field2396[var6++] = class120.field2023;
                                continue;
                            }
                            if (var483 == 5050) {
                                var6--;
                                int var148 = class140.field2396[var6];
                                class103.field1759[var7++] = class236.method1620(var148, -107).field1449;
                                continue;
                            }
                            if (var483 == 5051) {
                                var6--;
                                int var149 = class140.field2396[var6];
                                class81 var150 = class236.method1620(var149, -117);
                                if (var150.field1445 == null) {
                                    class140.field2396[var6++] = 0;
                                } else {
                                    class140.field2396[var6++] = var150.field1445.length;
                                }
                                continue;
                            }
                            if (var483 == 5052) {
                                var6 -= 2;
                                int var151 = class140.field2396[var6 + 1];
                                int var152 = class140.field2396[var6];
                                class81 var153 = class236.method1620(var152, -87);
                                int var154 = var153.field1445[var151];
                                class140.field2396[var6++] = var154;
                                continue;
                            }
                            if (var483 == 5053) {
                                var6--;
                                int var155 = class140.field2396[var6];
                                class81 var156 = class236.method1620(var155, -67);
                                if (var156.field1455 == null) {
                                    class140.field2396[var6++] = 0;
                                } else {
                                    class140.field2396[var6++] = var156.field1455.length;
                                }
                                continue;
                            }
                            if (var483 == 5054) {
                                var6 -= 2;
                                int var157 = class140.field2396[var6 + 1];
                                int var158 = class140.field2396[var6];
                                class140.field2396[var6++] = class236.method1620(var158, -109).field1455[var157];
                                continue;
                            }
                            if (var483 == 5055) {
                                var6--;
                                int var159 = class140.field2396[var6];
                                class103.field1759[var7++] = class145.method968(true, var159).method328(0);
                                continue;
                            }
                            if (var483 == 5056) {
                                var6--;
                                int var160 = class140.field2396[var6];
                                class47 var161 = class145.method968(true, var160);
                                if (var161.field949 == null) {
                                    class140.field2396[var6++] = 0;
                                } else {
                                    class140.field2396[var6++] = var161.field949.length;
                                }
                                continue;
                            }
                            if (var483 == 5057) {
                                var6 -= 2;
                                int var162 = class140.field2396[var6];
                                int var163 = class140.field2396[var6 + 1];
                                class140.field2396[var6++] = class145.method968(true, var162).field949[var163];
                                continue;
                            }
                            if (var483 == 5058) {
                                class11.field375 = new class94();
                                var6--;
                                class11.field375.field1592 = class140.field2396[var6];
                                class11.field375.field1590 = class145.method968(true, class11.field375.field1592);
                                class11.field375.field1595 = new int[class11.field375.field1590.method325((byte) -124)];
                                continue;
                            }
                            if (var483 == 5059) {
                                class15.field406++;
                                class71.field1320.method570(215, -1);
                                class71.field1320.method1352(7528, 0);
                                int var164 = class71.field1320.field3380;
                                class71.field1320.method1352(7528, 0);
                                class71.field1320.method1324(class11.field375.field1592, 15803);
                                class11.field375.field1590.method332(class11.field375.field1595, true, class71.field1320);
                                class71.field1320.method1294(class71.field1320.field3380 - var164, (byte) 125);
                                continue;
                            }
                            if (var483 == 5060) {
                                class275.field4753++;
                                var7--;
                                class128 var165 = class103.field1759[var7];
                                class71.field1320.method570(72, -1);
                                class71.field1320.method1352(7528, 0);
                                int var166 = class71.field1320.field3380;
                                class71.field1320.method1344(57, var165.method819((byte) 125));
                                class71.field1320.method1324(class11.field375.field1592, 15803);
                                class11.field375.field1590.method332(class11.field375.field1595, arg1, class71.field1320);
                                class71.field1320.method1294(class71.field1320.field3380 - var166, (byte) 8);
                                continue;
                            }
                            if (var483 == 5061) {
                                class15.field406++;
                                class71.field1320.method570(215, -1);
                                class71.field1320.method1352(7528, 0);
                                int var167 = class71.field1320.field3380;
                                class71.field1320.method1352(7528, 1);
                                class71.field1320.method1324(class11.field375.field1592, 15803);
                                class11.field375.field1590.method332(class11.field375.field1595, true, class71.field1320);
                                class71.field1320.method1294(class71.field1320.field3380 - var167, (byte) 102);
                                continue;
                            }
                            if (var483 == 5062) {
                                var6 -= 2;
                                int var168 = class140.field2396[var6 + 1];
                                int var169 = class140.field2396[var6];
                                class140.field2396[var6++] = class236.method1620(var169, -72).field1463[var168];
                                continue;
                            }
                            if (var483 == 5063) {
                                var6 -= 2;
                                int var170 = class140.field2396[var6];
                                int var171 = class140.field2396[var6 + 1];
                                class140.field2396[var6++] = class236.method1620(var170, -63).field1459[var171];
                                continue;
                            }
                            if (var483 == 5064) {
                                var6 -= 2;
                                int var172 = class140.field2396[var6];
                                int var173 = class140.field2396[var6 + 1];
                                if (var173 == -1) {
                                    class140.field2396[var6++] = -1;
                                } else {
                                    class140.field2396[var6++] = class236.method1620(var172, -112).method513(2, var173);
                                }
                                continue;
                            }
                            if (var483 == 5065) {
                                var6 -= 2;
                                int var174 = class140.field2396[var6 + 1];
                                int var175 = class140.field2396[var6];
                                if (var174 == -1) {
                                    class140.field2396[var6++] = -1;
                                } else {
                                    class140.field2396[var6++] = class236.method1620(var175, -114).method519(-94, var174);
                                }
                                continue;
                            }
                            if (var483 == 5066) {
                                var6--;
                                int var176 = class140.field2396[var6];
                                class140.field2396[var6++] = class145.method968(true, var176).method325((byte) -128);
                                continue;
                            }
                            if (var483 == 5067) {
                                var6 -= 2;
                                int var177 = class140.field2396[var6 + 1];
                                int var178 = class140.field2396[var6];
                                int var179 = class145.method968(true, var178).method334(123, var177);
                                class140.field2396[var6++] = var179;
                                continue;
                            }
                            if (var483 == 5068) {
                                var6 -= 2;
                                int var180 = class140.field2396[var6];
                                int var181 = class140.field2396[var6 + 1];
                                class11.field375.field1595[var180] = var181;
                                continue;
                            }
                            if (var483 == 5069) {
                                var6 -= 2;
                                int var182 = class140.field2396[var6 + 1];
                                int var183 = class140.field2396[var6];
                                class11.field375.field1595[var183] = var182;
                                continue;
                            }
                            if (var483 == 5070) {
                                var6 -= 3;
                                int var184 = class140.field2396[var6];
                                int var185 = class140.field2396[var6 + 2];
                                int var186 = class140.field2396[var6 + 1];
                                class47 var187 = class145.method968(true, var184);
                                if (var187.method334(114, var186) != 0) {
                                    throw new RuntimeException("bad command");
                                }
                                class140.field2396[var6++] = var187.method330(var186, -6988, var185);
                                continue;
                            }
                        } else if (var483 < 5200) {
                            if (var483 == 5100) {
                                if (class257.field4426[86]) {
                                    class140.field2396[var6++] = 1;
                                } else {
                                    class140.field2396[var6++] = 0;
                                }
                                continue;
                            }
                            if (var483 == 5101) {
                                if (class257.field4426[82]) {
                                    class140.field2396[var6++] = 1;
                                } else {
                                    class140.field2396[var6++] = 0;
                                }
                                continue;
                            }
                            if (var483 == 5102) {
                                if (class257.field4426[81]) {
                                    class140.field2396[var6++] = 1;
                                } else {
                                    class140.field2396[var6++] = 0;
                                }
                                continue;
                            }
                        } else if (var483 < 5300) {
                            if (var483 == 5200) {
                                var6--;
                                class263.method1847((byte) -85, class140.field2396[var6]);
                                continue;
                            }
                            if (var483 == 5201) {
                                class140.field2396[var6++] = class142.method949((byte) -31);
                                continue;
                            }
                            if (var483 == 5202) {
                                var6--;
                                class97.method606(class140.field2396[var6], -105);
                                continue;
                            }
                            if (var483 == 5203) {
                                var7--;
                                class106.method650(-25153, class103.field1759[var7]);
                                continue;
                            }
                            if (var483 == 5204) {
                                class103.field1759[var7 - 1] = class82.method526(class103.field1759[var7 - 1], false);
                                continue;
                            }
                            if (var483 == 5205) {
                                var7--;
                                class144.method964(class103.field1759[var7], 480);
                                continue;
                            }
                            if (var483 == 5206) {
                                var6--;
                                int var188 = class140.field2396[var6];
                                class241 var189 = class257.method1807(-14, var188 & 0x3FFF, var188 >> 14 & 0x3FFF);
                                if (var189 == null) {
                                    class103.field1759[var7++] = class22.field556;
                                } else {
                                    class103.field1759[var7++] = var189.field4130;
                                }
                                continue;
                            }
                            if (var483 == 5207) {
                                var7--;
                                class241 var190 = class37.method246(class103.field1759[var7], 118);
                                if (var190 != null && var190.field4127 != null) {
                                    class103.field1759[var7++] = var190.field4127;
                                    continue;
                                }
                                class103.field1759[var7++] = class22.field556;
                                continue;
                            }
                        } else if (var483 < 5400) {
                            if (var483 == 5300) {
                                var6 -= 2;
                                int var191 = class140.field2396[var6 + 1];
                                int var192 = class140.field2396[var6];
                                class217.method1502(3, (byte) 59, var191, false, var192);
                                class140.field2396[var6++] = class114.field1924 == null ? 0 : 1;
                                continue;
                            }
                            if (var483 == 5301) {
                                if (class114.field1924 != null) {
                                    class217.method1502(class165.field2836, (byte) 84, -1, false, -1);
                                }
                                continue;
                            }
                            if (var483 == 5302) {
                                class264[] var193 = class16.method128(106);
                                class140.field2396[var6++] = var193.length;
                                continue;
                            }
                            if (var483 == 5303) {
                                var6--;
                                int var194 = class140.field2396[var6];
                                class264[] var195 = class16.method128(122);
                                class140.field2396[var6++] = var195[var194].field4572;
                                class140.field2396[var6++] = var195[var194].field4585;
                                continue;
                            }
                            if (var483 == 5305) {
                                int var196 = class206.field3629;
                                int var197 = -1;
                                int var198 = class221.field3885;
                                class264[] var199 = class16.method128(5);
                                for (int var200 = 0; var200 < var199.length; var200++) {
                                    class264 var201 = var199[var200];
                                    if (var201.field4572 == var196 && var201.field4585 == var198) {
                                        var197 = var200;
                                        break;
                                    }
                                }
                                class140.field2396[var6++] = var197;
                                continue;
                            }
                            if (var483 == 5306) {
                                class140.field2396[var6++] = class166.method1089(2);
                                continue;
                            }
                            if (var483 == 5307) {
                                var6--;
                                int var202 = class140.field2396[var6];
                                if (var202 < 0 || var202 > 2) {
                                    var202 = 0;
                                }
                                class217.method1502(var202, (byte) 86, -1, false, -1);
                                continue;
                            }
                            if (var483 == 5308) {
                                class140.field2396[var6++] = class165.field2836;
                                continue;
                            }
                            if (var483 == 5309) {
                                var6--;
                                int var203 = class140.field2396[var6];
                                if (var203 < 0 || var203 > 2) {
                                    var203 = 0;
                                }
                                class165.field2836 = var203;
                                class187.method1255(class288.field4925, true);
                                continue;
                            }
                        } else if (var483 < 5500) {
                            if (var483 == 5400) {
                                class291.field4972++;
                                var7 -= 2;
                                class128 var243 = class103.field1759[var7];
                                class128 var244 = class103.field1759[var7 + 1];
                                var6--;
                                int var245 = class140.field2396[var6];
                                class71.field1320.method570(124, -1);
                                class71.field1320.method1352(7528, class306.method2093(var243, -1) - (-class306.method2093(var244, -1) - 1));
                                class71.field1320.method1343((byte) 66, var243);
                                class71.field1320.method1343((byte) 66, var244);
                                class71.field1320.method1352(7528, var245);
                                continue;
                            }
                            if (var483 == 5401) {
                                var6 -= 2;
                                class298.field5083[class140.field2396[var6]] = (short) class185.method1250(class140.field2396[var6 + 1], -180);
                                class273.method1919(20115);
                                class152.method1012((byte) -102);
                                client.method1655((byte) 113);
                                class143.method955((byte) -77);
                                class232.method1598(0);
                                continue;
                            }
                            if (var483 == 5405) {
                                var6 -= 2;
                                int var246 = class140.field2396[var6 + 1];
                                int var247 = class140.field2396[var6];
                                if (var247 >= 0 && var247 < 2) {
                                    class107.field1823[var247] = new int[var246 << 1][4];
                                }
                                continue;
                            }
                            if (var483 == 5406) {
                                var6 -= 7;
                                int var248 = class140.field2396[var6 + 1] << 1;
                                int var249 = class140.field2396[var6 + 2];
                                int var250 = class140.field2396[var6 + 3];
                                int var251 = class140.field2396[var6];
                                int var252 = class140.field2396[var6 + 4];
                                int var253 = class140.field2396[var6 + 6];
                                int var254 = class140.field2396[var6 + 5];
                                if (var251 >= 0 && var251 < 2 && class107.field1823[var251] != null && var248 >= 0 && var248 < class107.field1823[var251].length) {
                                    class107.field1823[var251][var248] = new int[] { class238.method1622(16383, var249 >> 14) * 128, var250, class238.method1622(16383, var249) * 128, var253 };
                                    class107.field1823[var251][var248 + 1] = new int[] { (class238.method1622(var252, 268420925) >> 14) * 128, var254, class238.method1622(16383, var252) * 128 };
                                }
                                continue;
                            }
                            if (var483 == 5407) {
                                var6--;
                                int var255 = class107.field1823[class140.field2396[var6]].length >> 1;
                                class140.field2396[var6++] = var255;
                                continue;
                            }
                            if (var483 == 5411) {
                                if (class114.field1924 != null) {
                                    class217.method1502(class165.field2836, (byte) 90, -1, false, -1);
                                }
                                if (class200.field3483 == null) {
                                    class84.method532(class205.method1415(arg1), false, !arg1);
                                } else {
                                    System.exit(0);
                                }
                                continue;
                            }
                            if (var483 == 5419) {
                                class128 var256 = class22.field556;
                                if (class158.field2710 != null) {
                                    var256 = class31.method223(class158.field2710.field563, arg1);
                                    try {
                                        if (class158.field2710.field562 != null) {
                                            byte[] var257 = ((String) class158.field2710.field562).getBytes("ISO-8859-1");
                                            var256 = class220.method1520(var257.length, (byte) 116, 0, var257);
                                        }
                                    } catch (UnsupportedEncodingException var481) {
                                    }
                                }
                                class103.field1759[var7++] = var256;
                                continue;
                            }
                            if (var483 == 5420) {
                                class140.field2396[var6++] = class270.field4676 == 3 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 5421) {
                                if (class114.field1924 != null) {
                                    class217.method1502(class165.field2836, (byte) 65, -1, false, -1);
                                }
                                var6--;
                                boolean var259 = class140.field2396[var6] == 1;
                                var7--;
                                class128 var260 = class103.field1759[var7];
                                class128 var261 = class28.method177((byte) -102, new class128[] { class205.method1415(true), var260 });
                                if (class200.field3483 == null && (!var259 || class270.field4676 == 3 || !class270.field4678.startsWith("win") || class156.field2688)) {
                                    class84.method532(var261, var259, !arg1);
                                    continue;
                                }
                                class7.field167 = var261;
                                class72.field1328 = var259;
                                class74.field1399 = class288.field4925.method1890(new String(var261.method825(-24750), "ISO-8859-1"), 105);
                                continue;
                            }
                            if (var483 == 5422) {
                                var7 -= 2;
                                class128 var262 = class103.field1759[var7 + 1];
                                class128 var263 = class103.field1759[var7];
                                var6--;
                                int var264 = class140.field2396[var6];
                                if (var263.method865((byte) -116) > 0) {
                                    if (class36.field742 == null) {
                                        class36.field742 = new class128[class284.field4880[class98.field1701]];
                                    }
                                    class36.field742[var264] = var263;
                                }
                                if (var262.method865((byte) -79) > 0) {
                                    if (class210.field3722 == null) {
                                        class210.field3722 = new class128[class284.field4880[class98.field1701]];
                                    }
                                    class210.field3722[var264] = var262;
                                }
                                continue;
                            }
                            if (var483 == 5423) {
                                var7--;
                                class103.field1759[var7].method839((byte) -61);
                                continue;
                            }
                        } else if (var483 < 5600) {
                            if (var483 == 5500) {
                                var6 -= 4;
                                int var204 = class140.field2396[var6 + 1];
                                int var205 = class140.field2396[var6 + 3];
                                int var206 = class140.field2396[var6];
                                int var207 = class140.field2396[var6 + 2];
                                class264.method1852(true, (var206 >> 14 & 0x3FFF) - class221.field3889, false, var204, var205, var207, (var206 & 0x3FFF) - class4.field72);
                                continue;
                            }
                            if (var483 == 5501) {
                                var6 -= 4;
                                int var208 = class140.field2396[var6];
                                int var209 = class140.field2396[var6 + 1];
                                int var210 = class140.field2396[var6 + 3];
                                int var211 = class140.field2396[var6 + 2];
                                class151.method1009(var210, var211, (var208 >> 14 & 0x3FFF) - class221.field3889, (var208 & 0x3FFF) + -class4.field72, 6379, var209);
                                continue;
                            }
                            if (var483 == 5502) {
                                var6 -= 6;
                                int var212 = class140.field2396[var6];
                                if (var212 >= 2) {
                                    throw new RuntimeException();
                                }
                                class86.field1500 = var212;
                                int var213 = class140.field2396[var6 + 1];
                                if ((class107.field1823[class86.field1500].length >> 1) <= (var213 + 1)) {
                                    throw new RuntimeException();
                                }
                                class92.field1573 = var213;
                                class167.field2877 = 0;
                                class279.field4828 = class140.field2396[var6 + 2];
                                class308.field5236 = class140.field2396[var6 + 3];
                                int var214 = class140.field2396[var6 + 4];
                                if (var214 >= 2) {
                                    throw new RuntimeException();
                                }
                                class157.field2691 = var214;
                                int var215 = class140.field2396[var6 + 5];
                                if ((var215 + 1) >= (class107.field1823[class157.field2691].length >> 1)) {
                                    throw new RuntimeException();
                                }
                                class1.field21 = 3;
                                class146.field2506 = var215;
                                continue;
                            }
                            if (var483 == 5503) {
                                class17.method133((byte) 115);
                                continue;
                            }
                            if (var483 == 5504) {
                                var6 -= 2;
                                class115.field1945 = class140.field2396[var6];
                                class118.field1997 = class140.field2396[var6 + 1];
                                class121.method736((byte) 75);
                                continue;
                            }
                            if (var483 == 5505) {
                                class140.field2396[var6++] = class115.field1945;
                                continue;
                            }
                            if (var483 == 5506) {
                                class140.field2396[var6++] = class118.field1997;
                                continue;
                            }
                        } else if (var483 < 5700) {
                            if (var483 == 5600) {
                                var7 -= 2;
                                class128 var239 = class103.field1759[var7];
                                var6--;
                                int var240 = class140.field2396[var6];
                                class128 var241 = class103.field1759[var7 + 1];
                                if (class105.field1799 == 10 && class203.field3583 == 0 && class254.field4382 == 0 && class4.field75 == 0 && class234.field4033 == 0) {
                                    class130.method878(var241, var240, 0, var239);
                                }
                                continue;
                            }
                            if (var483 == 5601) {
                                class133.method885(5278);
                                continue;
                            }
                            if (var483 == 5602) {
                                if (class254.field4382 == 0) {
                                    class77.field1413 = -2;
                                }
                                continue;
                            }
                            if (var483 == 5603) {
                                var6 -= 4;
                                if (class105.field1799 == 10 && class203.field3583 == 0 && class254.field4382 == 0 && class4.field75 == 0 && class234.field4033 == 0) {
                                    class94.method592(class140.field2396[var6 + 2], class140.field2396[var6 + 3], 6520, class140.field2396[var6], class140.field2396[var6 + 1]);
                                }
                                continue;
                            }
                            if (var483 == 5604) {
                                var7--;
                                if (class105.field1799 == 10 && class203.field3583 == 0 && class254.field4382 == 0 && class4.field75 == 0 && class234.field4033 == 0) {
                                    class236.method1616(class103.field1759[var7].method819((byte) 121), 32767);
                                }
                                continue;
                            }
                            if (var483 == 5605) {
                                var7 -= 2;
                                var6 -= 4;
                                if (class105.field1799 == 10 && class203.field3583 == 0 && class254.field4382 == 0 && class4.field75 == 0 && class234.field4033 == 0) {
                                    class103.method635(class103.field1759[var7].method819((byte) 106), (byte) 62, class140.field2396[var6 + 1], class103.field1759[var7 + 1], class140.field2396[var6 + 3], class140.field2396[var6 + 2], class140.field2396[var6]);
                                }
                                continue;
                            }
                            if (var483 == 5606) {
                                if (class4.field75 == 0) {
                                    class192.field3330 = -2;
                                }
                                continue;
                            }
                            if (var483 == 5607) {
                                class140.field2396[var6++] = class77.field1413;
                                continue;
                            }
                            if (var483 == 5608) {
                                class140.field2396[var6++] = class268.field4641;
                                continue;
                            }
                            if (var483 == 5609) {
                                class140.field2396[var6++] = class192.field3330;
                                continue;
                            }
                            if (var483 == 5610) {
                                for (int var242 = 0; var242 < 5; var242++) {
                                    class103.field1759[var7++] = class3.field43.length > var242 ? class3.field43[var242].method850(55) : class22.field556;
                                }
                                class3.field43 = null;
                                continue;
                            }
                            if (var483 == 5611) {
                                class140.field2396[var6++] = class82.field1468;
                                continue;
                            }
                        } else if (var483 < 6100) {
                            if (var483 == 6001) {
                                var6--;
                                int var233 = class140.field2396[var6];
                                if (var233 < 1) {
                                    var233 = 1;
                                }
                                if (var233 > 4) {
                                    var233 = 4;
                                }
                                class254.field4378 = var233;
                                if (!class247.field4247 || !class90.field1536) {
                                    if (class254.field4378 == 1) {
                                        class141.method946(0.9F);
                                    }
                                    if (class254.field4378 == 2) {
                                        class141.method946(0.8F);
                                    }
                                    if (class254.field4378 == 3) {
                                        class141.method946(0.7F);
                                    }
                                    if (class254.field4378 == 4) {
                                        class141.method946(0.6F);
                                    }
                                }
                                if (class247.field4247) {
                                    class129.method872(-1);
                                    if (!class90.field1536) {
                                        class279.method1950(-117);
                                    }
                                }
                                class152.method1012((byte) 52);
                                class187.method1255(class288.field4925, true);
                                class183.field3204 = false;
                                continue;
                            }
                            if (var483 == 6002) {
                                var6--;
                                class3.method17((byte) 59, class140.field2396[var6] == 1);
                                class3.method22(false);
                                class279.method1950(84);
                                class152.method1014(0);
                                class187.method1255(class288.field4925, true);
                                class183.field3204 = false;
                                continue;
                            }
                            if (var483 == 6003) {
                                var6--;
                                class116.field1969 = class140.field2396[var6] == 1;
                                class152.method1014(0);
                                class187.method1255(class288.field4925, true);
                                class183.field3204 = false;
                                continue;
                            }
                            if (var483 == 6005) {
                                var6--;
                                class228.field3968 = class140.field2396[var6] == 1;
                                class279.method1950(44);
                                class187.method1255(class288.field4925, true);
                                class183.field3204 = false;
                                continue;
                            }
                            if (var483 == 6006) {
                                var6--;
                                class1.field12 = class140.field2396[var6] == 1;
                                ((class163) class141.field2419).method1073(!class1.field12, 0);
                                class187.method1255(class288.field4925, true);
                                class183.field3204 = false;
                                continue;
                            }
                            if (var483 == 6007) {
                                var6--;
                                class22.field545 = class140.field2396[var6] == 1;
                                class187.method1255(class288.field4925, true);
                                class183.field3204 = false;
                                continue;
                            }
                            if (var483 == 6008) {
                                var6--;
                                class260.field4512 = class140.field2396[var6] == 1;
                                class187.method1255(class288.field4925, true);
                                class183.field3204 = false;
                                continue;
                            }
                            if (var483 == 6009) {
                                var6--;
                                class121.field2039 = class140.field2396[var6] == 1;
                                class187.method1255(class288.field4925, true);
                                class183.field3204 = false;
                                continue;
                            }
                            if (var483 == 6010) {
                                var6--;
                                class114.field1916 = class140.field2396[var6] == 1;
                                class187.method1255(class288.field4925, true);
                                class183.field3204 = false;
                                continue;
                            }
                            if (var483 == 6011) {
                                var6--;
                                int var234 = class140.field2396[var6];
                                if (var234 < 0 || var234 > 2) {
                                    var234 = 0;
                                }
                                class182.field3197 = var234;
                                class187.method1255(class288.field4925, true);
                                class183.field3204 = false;
                                continue;
                            }
                            if (var483 == 6012) {
                                if (class247.field4247) {
                                    class217.method1498((byte) -29, 0, 0);
                                }
                                var6--;
                                class90.field1536 = class140.field2396[var6] == 1;
                                if (class247.field4247 && class90.field1536) {
                                    class141.method946(0.7F);
                                } else {
                                    if (class254.field4378 == 1) {
                                        class141.method946(0.9F);
                                    }
                                    if (class254.field4378 == 2) {
                                        class141.method946(0.8F);
                                    }
                                    if (class254.field4378 == 3) {
                                        class141.method946(0.7F);
                                    }
                                    if (class254.field4378 == 4) {
                                        class141.method946(0.6F);
                                    }
                                }
                                class279.method1950(-120);
                                class187.method1255(class288.field4925, true);
                                class183.field3204 = false;
                                continue;
                            }
                            if (var483 == 6014) {
                                var6--;
                                class240.field4101 = class140.field2396[var6] == 1;
                                if (class247.field4247) {
                                    class279.method1950(125);
                                }
                                class187.method1255(class288.field4925, true);
                                class183.field3204 = false;
                                continue;
                            }
                            if (var483 == 6015) {
                                var6--;
                                class271.field4693 = class140.field2396[var6] == 1;
                                if (class247.field4247) {
                                    class129.method872(-1);
                                }
                                class187.method1255(class288.field4925, arg1);
                                class183.field3204 = false;
                                continue;
                            }
                            if (var483 == 6016) {
                                var6--;
                                int var235 = class140.field2396[var6];
                                if (class247.field4247) {
                                    class167.field2872 = true;
                                }
                                if (var235 < 0 || var235 > 2) {
                                    var235 = 0;
                                }
                                class238.field4073 = var235;
                                class187.method1255(class288.field4925, true);
                                class183.field3204 = false;
                                continue;
                            }
                            if (var483 == 6017) {
                                var6--;
                                class31.field689 = class140.field2396[var6] == 1;
                                class11.method88((byte) 93);
                                class187.method1255(class288.field4925, true);
                                class183.field3204 = false;
                                continue;
                            }
                            if (var483 == 6018) {
                                var6--;
                                int var236 = class140.field2396[var6];
                                if (var236 < 0) {
                                    var236 = 0;
                                }
                                if (var236 > 127) {
                                    var236 = 127;
                                }
                                class214.field3778 = var236;
                                class187.method1255(class288.field4925, arg1);
                                class183.field3204 = false;
                                continue;
                            }
                            if (var483 == 6019) {
                                var6--;
                                int var237 = class140.field2396[var6];
                                if (var237 < 0) {
                                    var237 = 0;
                                }
                                if (var237 > 255) {
                                    var237 = 255;
                                }
                                if (class139.field2391 != var237) {
                                    if (class139.field2391 == 0 && class152.field2612 != -1) {
                                        class140.method923(false, var237, 75, class152.field2612, 0, class162.field2765);
                                        class64.field1205 = false;
                                    } else if (var237 == 0) {
                                        class140.method922(1);
                                        class64.field1205 = false;
                                    } else {
                                        class233.method1601(0, var237);
                                    }
                                    class139.field2391 = var237;
                                }
                                class187.method1255(class288.field4925, arg1);
                                class183.field3204 = false;
                                continue;
                            }
                            if (var483 == 6020) {
                                var6--;
                                int var238 = class140.field2396[var6];
                                if (var238 < 0) {
                                    var238 = 0;
                                }
                                if (var238 > 127) {
                                    var238 = 127;
                                }
                                class158.field2699 = var238;
                                class187.method1255(class288.field4925, true);
                                class183.field3204 = false;
                                continue;
                            }
                            if (var483 == 6021) {
                                var6--;
                                class79.field1443 = class140.field2396[var6] == 1;
                                class152.method1014(0);
                                continue;
                            }
                        } else if (var483 < 6200) {
                            if (var483 == 6101) {
                                class140.field2396[var6++] = class254.field4378;
                                continue;
                            }
                            if (var483 == 6102) {
                                class140.field2396[var6++] = class117.method702(true) ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6103) {
                                class140.field2396[var6++] = class116.field1969 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6105) {
                                class140.field2396[var6++] = class228.field3968 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6106) {
                                class140.field2396[var6++] = class1.field12 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6107) {
                                class140.field2396[var6++] = class22.field545 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6108) {
                                class140.field2396[var6++] = class260.field4512 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6109) {
                                class140.field2396[var6++] = class121.field2039 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6110) {
                                class140.field2396[var6++] = class114.field1916 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6111) {
                                class140.field2396[var6++] = class182.field3197;
                                continue;
                            }
                            if (var483 == 6112) {
                                class140.field2396[var6++] = class90.field1536 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6114) {
                                class140.field2396[var6++] = class240.field4101 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6115) {
                                class140.field2396[var6++] = class271.field4693 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6116) {
                                class140.field2396[var6++] = class238.field4073;
                                continue;
                            }
                            if (var483 == 6117) {
                                class140.field2396[var6++] = class31.field689 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6118) {
                                class140.field2396[var6++] = class214.field3778;
                                continue;
                            }
                            if (var483 == 6119) {
                                class140.field2396[var6++] = class139.field2391;
                                continue;
                            }
                            if (var483 == 6120) {
                                class140.field2396[var6++] = class158.field2699;
                                continue;
                            }
                            if (var483 == 6121) {
                                if (class247.field4247) {
                                    class140.field2396[var6++] = class247.field4229 ? 1 : 0;
                                } else {
                                    class140.field2396[var6++] = 0;
                                }
                                continue;
                            }
                        } else if (var483 < 6300) {
                            if (var483 == 6200) {
                                var6 -= 2;
                                class298.field5081 = (short) class140.field2396[var6];
                                if (class298.field5081 <= 0) {
                                    class298.field5081 = 256;
                                }
                                class225.field3926 = (short) class140.field2396[var6 + 1];
                                if (class225.field3926 <= 0) {
                                    class225.field3926 = 205;
                                }
                                continue;
                            }
                            if (var483 == 6201) {
                                var6 -= 2;
                                class27.field589 = (short) class140.field2396[var6];
                                if (class27.field589 <= 0) {
                                    class27.field589 = 256;
                                }
                                class289.field4947 = (short) class140.field2396[var6 + 1];
                                if (class289.field4947 <= 0) {
                                    class289.field4947 = 320;
                                }
                                continue;
                            }
                            if (var483 == 6202) {
                                var6 -= 4;
                                field2529 = (short) class140.field2396[var6];
                                if (field2529 <= 0) {
                                    field2529 = 1;
                                }
                                class30.field680 = (short) class140.field2396[var6 + 1];
                                if (class30.field680 <= 0) {
                                    class30.field680 = 32767;
                                } else if (field2529 > class30.field680) {
                                    class30.field680 = field2529;
                                }
                                class134.field2331 = (short) class140.field2396[var6 + 2];
                                if (class134.field2331 <= 0) {
                                    class134.field2331 = 1;
                                }
                                class22.field543 = (short) class140.field2396[var6 + 3];
                                if (class22.field543 <= 0) {
                                    class22.field543 = 32767;
                                } else if (class22.field543 < class134.field2331) {
                                    class22.field543 = class134.field2331;
                                }
                                continue;
                            }
                            if (var483 == 6203) {
                                class69.method460(class266.field4621.field260, 0, (byte) -115, 0, class266.field4621.field226, false);
                                class140.field2396[var6++] = class116.field1951;
                                class140.field2396[var6++] = class57.field1089;
                                continue;
                            }
                            if (var483 == 6204) {
                                class140.field2396[var6++] = class27.field589;
                                class140.field2396[var6++] = class289.field4947;
                                continue;
                            }
                            if (var483 == 6205) {
                                class140.field2396[var6++] = class298.field5081;
                                class140.field2396[var6++] = class225.field3926;
                                continue;
                            }
                        } else if (var483 < 6400) {
                            if (var483 == 6300) {
                                class140.field2396[var6++] = (int) (class71.method470(arg1) / 60000L);
                                continue;
                            }
                            if (var483 == 6301) {
                                class140.field2396[var6++] = (int) (class71.method470(true) / 86400000L) - 11745;
                                continue;
                            }
                            if (var483 == 6302) {
                                var6 -= 3;
                                int var228 = class140.field2396[var6 + 2];
                                int var229 = class140.field2396[var6 + 1];
                                int var230 = class140.field2396[var6];
                                class34.field728.clear();
                                class34.field728.set(11, 12);
                                class34.field728.set(var228, var229, var230);
                                class140.field2396[var6++] = (int) (class34.field728.getTime().getTime() / 86400000L) - 11745;
                                continue;
                            }
                            if (var483 == 6303) {
                                class34.field728.clear();
                                class34.field728.setTime(new Date(class71.method470(arg1)));
                                class140.field2396[var6++] = class34.field728.get(1);
                                continue;
                            }
                            if (var483 == 6304) {
                                var6--;
                                int var231 = class140.field2396[var6];
                                boolean var232 = true;
                                if (var231 < 0) {
                                    var232 = ((var231 + 1) % 4) == 0;
                                } else if (var231 < 1582) {
                                    var232 = (var231 % 4) == 0;
                                } else if ((var231 % 4) != 0) {
                                    var232 = false;
                                } else if ((var231 % 100) != 0) {
                                    var232 = true;
                                } else if (var231 % 400 != 0) {
                                    var232 = false;
                                }
                                class140.field2396[var6++] = var232 ? 1 : 0;
                                continue;
                            }
                        } else if (var483 < 6500) {
                            if (var483 == 6405) {
                                class140.field2396[var6++] = class99.method618(-5952) ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6406) {
                                class140.field2396[var6++] = class58.method386(69) ? 1 : 0;
                                continue;
                            }
                        } else if (var483 < 6600) {
                            if (var483 == 6500) {
                                if (class105.field1799 == 10 && class203.field3583 == 0 && class254.field4382 == 0 && class4.field75 == 0) {
                                    class140.field2396[var6++] = class235.method1613(110) ? 1 : 0;
                                    continue;
                                }
                                class140.field2396[var6++] = 1;
                                continue;
                            }
                            if (var483 == 6501) {
                                class140 var216 = class58.method384((byte) 107);
                                if (var216 == null) {
                                    class140.field2396[var6++] = -1;
                                    class140.field2396[var6++] = 0;
                                    class103.field1759[var7++] = class22.field556;
                                    class140.field2396[var6++] = 0;
                                    class103.field1759[var7++] = class22.field556;
                                    class140.field2396[var6++] = 0;
                                } else {
                                    class140.field2396[var6++] = var216.field2397;
                                    class140.field2396[var6++] = var216.field2493;
                                    class103.field1759[var7++] = var216.field2407;
                                    class230 var217 = var216.method919((byte) -80);
                                    class140.field2396[var6++] = var217.field3998;
                                    class103.field1759[var7++] = var217.field3999;
                                    class140.field2396[var6++] = var216.field2487;
                                }
                                continue;
                            }
                            if (var483 == 6502) {
                                class140 var218 = class17.method130((byte) 109);
                                if (var218 == null) {
                                    class140.field2396[var6++] = -1;
                                    class140.field2396[var6++] = 0;
                                    class103.field1759[var7++] = class22.field556;
                                    class140.field2396[var6++] = 0;
                                    class103.field1759[var7++] = class22.field556;
                                    class140.field2396[var6++] = 0;
                                } else {
                                    class140.field2396[var6++] = var218.field2397;
                                    class140.field2396[var6++] = var218.field2493;
                                    class103.field1759[var7++] = var218.field2407;
                                    class230 var219 = var218.method919((byte) 126);
                                    class140.field2396[var6++] = var219.field3998;
                                    class103.field1759[var7++] = var219.field3999;
                                    class140.field2396[var6++] = var218.field2487;
                                }
                                continue;
                            }
                            if (var483 == 6503) {
                                var6--;
                                int var220 = class140.field2396[var6];
                                if (class105.field1799 == 10 && class203.field3583 == 0 && class254.field4382 == 0 && class4.field75 == 0) {
                                    class140.field2396[var6++] = class309.method2103(-1, var220) ? 1 : 0;
                                    continue;
                                }
                                class140.field2396[var6++] = 0;
                                continue;
                            }
                            if (var483 == 6504) {
                                var6--;
                                class196.field3435 = class140.field2396[var6];
                                class187.method1255(class288.field4925, true);
                                continue;
                            }
                            if (var483 == 6505) {
                                class140.field2396[var6++] = class196.field3435;
                                continue;
                            }
                            if (var483 == 6506) {
                                var6--;
                                int var221 = class140.field2396[var6];
                                class140 var222 = class105.method647(var221, false);
                                if (var222 == null) {
                                    class140.field2396[var6++] = -1;
                                    class103.field1759[var7++] = class22.field556;
                                    class140.field2396[var6++] = 0;
                                    class103.field1759[var7++] = class22.field556;
                                    class140.field2396[var6++] = 0;
                                } else {
                                    class140.field2396[var6++] = var222.field2493;
                                    class103.field1759[var7++] = var222.field2407;
                                    class230 var223 = var222.method919((byte) -91);
                                    class140.field2396[var6++] = var223.field3998;
                                    class103.field1759[var7++] = var223.field3999;
                                    class140.field2396[var6++] = var222.field2487;
                                }
                                continue;
                            }
                            if (var483 == 6507) {
                                var6 -= 4;
                                int var224 = class140.field2396[var6];
                                boolean var225 = class140.field2396[var6 + 1] == 1;
                                int var226 = class140.field2396[var6 + 2];
                                boolean var227 = class140.field2396[var6 + 3] == 1;
                                class246.method1677(var224, (byte) -116, var225, var227, var226);
                                continue;
                            }
                        }
                    } else if (var483 == 4400) {
                        var6 -= 2;
                        int var265 = class140.field2396[var6 + 1];
                        int var266 = class140.field2396[var6];
                        class62 var267 = class207.method1422(11, var265);
                        if (var267.method410(0)) {
                            class103.field1759[var7++] = class239.method1629((byte) -114, var266).method260(16348, var267.field1170, var265);
                        } else {
                            class140.field2396[var6++] = class239.method1629((byte) 125, var266).method255(var265, var267.field1164, 105);
                        }
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var482) {
            if (var5.field4615 == null) {
                if (class236.field4057 != 0) {
                    class212.method1456(class6.field137, 1, class22.field556, 0);
                }
                class79.method506((byte) -51, "CS2 - scr:" + var5.field4915 + " op:" + var11, var482);
            } else {
                class128 var478 = class4.method25(118, 30);
                var478.method847(true, class291.field4981).method847(arg1, var5.field4615);
                for (int var479 = class6.field136 - 1; var479 >= 0; var479--) {
                    var478.method847(true, class72.field1326).method847(true, class148.field2541[var479].field5024.field4615);
                }
                if (var11 == 40) {
                    int var480 = var10[var8];
                    var478.method847(true, class120.field2025).method847(true, class257.method1811(var480, (byte) -116));
                }
                if (class236.field4057 != 0) {
                    class212.method1456(class28.method177((byte) -57, new class128[] { class309.field5243, var5.field4615 }), 1, class22.field556, 0);
                }
                class79.method506((byte) -51, "CS2 - scr:" + var5.field4915 + " op:" + var11 + new String(var478.method825(-24750)), var482);
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IILem;I)V", line = 5871)
    public static final void method984(int arg0, int arg1, class10 arg2, int arg3) {
        field2514++;
        if (arg2.field341 == 0) {
            arg2.field253 = arg2.field249;
        } else if (arg2.field341 == 1) {
            arg2.field253 = (arg0 - arg2.field260) / 2 + arg2.field249;
        } else if (arg2.field341 == 2) {
            arg2.field253 = arg0 - arg2.field260 - arg2.field249;
        } else if (arg2.field341 == 3) {
            arg2.field253 = arg2.field249 * arg0 >> 14;
        } else if (arg2.field341 == 4) {
            arg2.field253 = (arg2.field249 * arg0 >> 14) + (arg0 - arg2.field260) / 2;
        } else {
            arg2.field253 = arg0 - (arg2.field260 + (arg2.field249 * arg0 >> 14));
        }
        if (arg3 > -125) {
            field2539 = (class314) null;
        }
        if (arg2.field270 == 0) {
            arg2.field309 = arg2.field338;
        } else if (arg2.field270 == 1) {
            arg2.field309 = (arg1 - arg2.field226) / 2 + arg2.field338;
        } else if (arg2.field270 == 2) {
            arg2.field309 = arg1 - arg2.field338 - arg2.field226;
        } else if (arg2.field270 == 3) {
            arg2.field309 = arg2.field338 * arg1 >> 14;
        } else if (arg2.field270 == 4) {
            arg2.field309 = (arg2.field338 * arg1 >> 14) + (arg1 - arg2.field226) / 2;
        } else {
            arg2.field309 = arg1 - (arg2.field338 * arg1 >> 14) - arg2.field226;
        }
        if (!class3.field57 || !(client.method1657(arg2) != 0 || arg2.field288 == 0)) {
            return;
        }
        if (arg2.field253 < 0) {
            arg2.field253 = 0;
        } else if ((arg2.field260 + arg2.field253) > arg0) {
            arg2.field253 = arg0 - arg2.field260;
        }
        if (arg2.field309 < 0) {
            arg2.field309 = 0;
        } else if (arg2.field309 + arg2.field226 > arg1) {
            arg2.field309 = arg1 - arg2.field226;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lem;Z)Lem;", line = 5949)
    public static final class10 method985(class10 arg0, boolean arg1) {
        field2525++;
        if (!arg1) {
            method983((class102) null, true, 105);
        }
        class10 var2 = client.method1650(arg0);
        if (var2 == null) {
            var2 = arg0.field333;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZLdj;ILkh;F)[I", line = 5984)
    public final int[] method986(boolean arg0, class314 arg1, int arg2, class13 arg3, float arg4) {
        if (arg2 != -21028) {
            return (int[]) null;
        }
        field2532++;
        if (this.field2524 == null || this.field2523 != arg4) {
            if (!this.field2527.method1277(arg3, 8417, arg1)) {
                return null;
            }
            int var6 = arg0 ? 64 : 128;
            this.field2524 = this.field2527.method1278(var6, arg1, (double) arg4, arg2 + 21028, this.field2536, var6, arg3, true);
            this.field2523 = arg4;
            if (this.field2528) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6 * var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6];
                int var11 = var6;
                int var12;
                int var13 = var12 = var6;
                int var15 = var6 - 1;
                int var16 = var6 - 1;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var19 = var15; var19 >= 0; var19--) {
                        var12--;
                        int var20 = this.field2524[var12];
                        var7[var19] += class238.method1622(var20, 16756522) >> 16;
                        var9[var19] += class238.method1622(var20 >> 8, 255);
                        var10[var19] += class238.method1622(var20, 255);
                    }
                    if (var12 == 0) {
                        var12 = var17;
                    }
                }
                int var21 = var17;
                for (int var22 = var16; var22 >= 0; var22--) {
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 1;
                    int var27 = 1;
                    for (int var28 = 2; var28 >= 0; var28--) {
                        var26--;
                        var25 += var7[var26];
                        var24 += var10[var26];
                        var23 += var9[var26];
                        if (var26 == 0) {
                            var26 = var11;
                        }
                    }
                    for (int var29 = var15; var29 >= 0; var29--) {
                        int var30 = var25 / 9;
                        int var31 = var23 / 9;
                        var27--;
                        var26--;
                        int var32 = var24 / 9;
                        var21--;
                        var8[var21] = class279.method1951(var32, class279.method1951(var30 << 16, var31 << 8));
                        var23 += var9[var26] - var9[var27];
                        var24 += var10[var26] - var10[var27];
                        var25 += var7[var26] - var7[var27];
                        if (var27 == 0) {
                            var27 = var11;
                        }
                        if (var26 == 0) {
                            var26 = var11;
                        }
                    }
                    for (int var33 = var15; var33 >= 0; var33--) {
                        var13--;
                        int var34 = this.field2524[var13];
                        var12--;
                        int var35 = this.field2524[var12];
                        var7[var33] += class238.method1622(var35 >> 16, 255) - (class238.method1622(var34, 16724778) >> 16);
                        var9[var33] += -class238.method1622(255, var34 >> 8) + class238.method1622(var35 >> 8, 255);
                        var10[var33] += class238.method1622(var35, 255) - class238.method1622(var34, 255);
                    }
                    if (var12 == 0) {
                        var12 = var17;
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                }
                this.field2524 = var8;
            }
        }
        return this.field2524;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BI)V", line = 6153)
    public final void method987(byte arg0, int arg1) {
        field2531++;
        if (this.field2524 == null) {
            return;
        }
        if (arg0 != 84) {
            field2529 = -87;
        }
        if (this.field2512 == 0 && this.field2519 == 0) {
            return;
        }
        if (class58.field1110 == null || class58.field1110.length < this.field2524.length) {
            class58.field1110 = new int[this.field2524.length];
        }
        int var3 = this.field2524.length == 4096 ? 64 : 128;
        int var4 = this.field2524.length;
        int var5 = var3 - 1;
        int var6 = this.field2512 * arg1 * var3;
        int var7 = this.field2519 * arg1;
        int var8 = var4 - 1;
        for (int var9 = 0; var9 < var4; var9 += var3) {
            int var10 = var8 & var6 + var9;
            for (int var11 = 0; var11 < var3; var11++) {
                int var12 = (var11 + var7 & var5) + var10;
                int var13 = var9 + var11;
                class58.field1110[var13] = this.field2524[var12];
            }
        }
        int[] var14 = this.field2524;
        this.field2524 = class58.field1110;
        class58.field1110 = var14;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lkh;Ldj;B)Z", line = 6215)
    public final boolean method988(class13 arg0, class314 arg1, byte arg2) {
        if (arg2 != 114) {
            method983((class102) null, false, -120);
        }
        field2510++;
        return this.field2527.method1277(arg0, 8417, arg1);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIILjm;JZ)V", line = 6225)
    public static final void method989(int arg0, int arg1, int arg2, int arg3, class226 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class92 var8 = new class92();
        var8.field1572 = arg4;
        var8.field1563 = arg1 * 128 + 64;
        var8.field1567 = arg2 * 128 + 64;
        var8.field1562 = arg3;
        var8.field1568 = arg5;
        var8.field1569 = arg6;
        if (class182.field3184[arg0][arg1][arg2] == null) {
            class182.field3184[arg0][arg1][arg2] = new class150(arg0, arg1, arg2);
        }
        class182.field3184[arg0][arg1][arg2].field2586 = var8;
    }

    @OriginalMember(owner = "client!ll", name = "finalize", descriptor = "()V", line = 6245)
    protected final void finalize() throws Throwable {
        field2520++;
        if (this.field2538 != -1) {
            class274.method1927(this.field2538, this.field2530, this.field2522);
            this.field2538 = -1;
            this.field2530 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IZLkh;Ldj;)Z", line = 6262)
    public final boolean method990(int arg0, boolean arg1, class13 arg2, class314 arg3) {
        field2526++;
        if (!this.field2527.method1277(arg2, 8417, arg3)) {
            return false;
        }
        GL var5 = class247.field4253;
        int var6 = arg1 ? 64 : 128;
        int var7 = class167.method1092(arg0 ^ 0xFFFFFFAA);
        if ((var7 & arg0) == 0) {
            if (this.field2538 == -1) {
                int[] var8 = new int[1];
                var5.glGenTextures(1, var8, 0);
                this.field2522 = class274.field4748;
                this.field2538 = var8[0];
                class247.method1691(this.field2538);
                ByteBuffer var9 = ByteBuffer.wrap(this.field2527.method1272(arg3, this.field2536, -11609, arg2, var6, 0.7D, var6));
                if (this.field2517 == 2) {
                    GLU var10 = new GLU();
                    var10.gluBuild2DMipmaps(3553, 6408, var6, var6, 6408, 5121, var9);
                    var5.glTexParameteri(3553, 10241, 9987);
                    var5.glTexParameteri(3553, 10240, 9729);
                    class274.field4744 += var9.limit() * 4 / 3 - this.field2530;
                    this.field2530 = var9.limit() * 4 / 3;
                } else if (this.field2517 == 1) {
                    int var11 = 0;
                    while (true) {
                        var5.glTexImage2D(3553, var11++, 6408, var6, var6, 0, 6408, 5121, var9);
                        var6 >>= 0x1;
                        if (var6 == 0) {
                            var5.glTexParameteri(3553, 10241, 9987);
                            var5.glTexParameteri(3553, 10240, 9729);
                            class274.field4744 += var9.limit() * 4 / 3 - this.field2530;
                            this.field2530 = var9.limit() * 4 / 3;
                            break;
                        }
                        var9 = ByteBuffer.wrap(this.field2527.method1272(arg3, this.field2536, -11609, arg2, var6, 0.7D, var6));
                    }
                } else {
                    var5.glTexImage2D(3553, 0, 6408, var6, var6, 0, 6408, 5121, var9);
                    var5.glTexParameteri(3553, 10241, 9729);
                    var5.glTexParameteri(3553, 10240, 9729);
                    class274.field4744 += var9.limit() - this.field2530;
                    this.field2530 = var9.limit();
                }
                var5.glTexParameteri(3553, 10242, this.field2540 ? 10497 : 33071);
                var5.glTexParameteri(3553, 10243, this.field2509 ? 10497 : 33071);
            } else {
                class247.method1691(this.field2538);
            }
        }
        if ((var7 & 0x2) == 0) {
            class247.method1701(this.field2511);
        }
        if ((var7 & 0x4) == 0) {
            class247.method1687(0);
        }
        if ((var7 & 0x8) == 0) {
            if (this.field2512 == 0 && this.field2519 == 0) {
                class247.method1710();
            } else {
                float var12 = (float) (class247.field4243 * this.field2519) / (float) var6;
                float var13 = (float) (class247.field4243 * this.field2512) / (float) var6;
                class247.method1698(var12, var13, 0.0F);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "(I)V", line = 6366)
    public static void method991(int arg0) {
        field2539 = null;
        field2515 = null;
        field2513 = null;
        field2537 = null;
        field2534 = null;
        int var1 = 91 / ((arg0 + 6) / 54);
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lbg;)V", line = 6426)
    public class147(class194 arg0) {
        this.field2527 = new class190(arg0);
        this.field2528 = arg0.method1325(7627) == 1;
        this.field2536 = arg0.method1325(7627) == 1;
        this.field2540 = arg0.method1325(7627) == 1;
        this.field2509 = arg0.method1325(7627) == 1;
        int var2 = arg0.method1325(7627) & 0x3;
        this.field2519 = arg0.method1326((byte) 97);
        this.field2512 = arg0.method1326((byte) 124);
        int var3 = arg0.method1325(7627);
        arg0.method1325(7627);
        this.field2517 = (var3 & 0xF5) >> 4;
        if (var2 == 1) {
            this.field2511 = 2;
        } else if (var2 == 2) {
            this.field2511 = 3;
        } else if (var2 == 3) {
            this.field2511 = 4;
        } else {
            this.field2511 = 0;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ldj;ILkh;Z)[I", line = 6404)
    public final int[] method992(class314 arg0, int arg1, class13 arg2, boolean arg3) {
        field2516++;
        if (!this.field2527.method1277(arg2, 8417, arg0)) {
            return null;
        }
        if (arg1 != -5609) {
            method983((class102) null, true, -128);
        }
        int var5 = arg3 ? 64 : 128;
        return this.field2527.method1278(var5, arg0, 1.0D, 0, this.field2536, var5, arg2, false);
    }
}
