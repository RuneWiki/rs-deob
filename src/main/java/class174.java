import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class174 extends class110 {

    @OriginalMember(owner = "client!wj", name = "E", descriptor = "I")
    private int field2806 = -32768;

    @OriginalMember(owner = "client!wj", name = "r", descriptor = "[I")
    public static int[] field2793 = new int[14];

    @OriginalMember(owner = "client!wj", name = "v", descriptor = "[I")
    public static int[] field2797 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!wj", name = "s", descriptor = "Z")
    public static boolean field2794 = false;

    @OriginalMember(owner = "client!wj", name = "B", descriptor = "[I")
    public static int[] field2803 = new int[100];

    @OriginalMember(owner = "client!wj", name = "A", descriptor = "Z")
    public static boolean field2802 = false;

    @OriginalMember(owner = "client!wj", name = "J", descriptor = "I")
    public static int field2811 = 99;

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!wj", name = "t", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!wj", name = "u", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!wj", name = "w", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!wj", name = "x", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!wj", name = "y", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!wj", name = "z", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!wj", name = "C", descriptor = "I")
    public int field2804;

    @OriginalMember(owner = "client!wj", name = "D", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!wj", name = "F", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!wj", name = "G", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!wj", name = "H", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!wj", name = "I", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!wj", name = "K", descriptor = "I")
    public int field2812;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(B)V", line = 8)
    public static void method1301(byte arg0) {
        field2793 = null;
        field2797 = null;
        if (arg0 < -97) {
            field2803 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "()I", line = 20)
    public final int method565() {
        field2795++;
        return this.field2806;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIIIIIJILnl;)V", line = 31)
    public final void method576(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class249 arg10) {
        field2796++;
        class74 var13 = class222.method1576(this.field2804, (byte) 92).method828((class28) null, 0, this.field2812, (byte) -114, 0, -1, (class295) null);
        if (var13 != null) {
            var13.method576(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field2806 = var13.method565();
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljd;BILjd;I)Lg;", line = 44)
    public static final class68 method1302(class95 arg0, byte arg1, int arg2, class95 arg3, int arg4) {
        field2801++;
        if (arg1 != 33) {
            field2797 = (int[]) null;
        }
        return class31.method233(arg4, 0, arg2, arg3) ? class52.method386(-22416, arg0.method696(arg4, (byte) 122, arg2)) : null;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILbl;I)V", line = 61)
    public static final void method1303(int arg0, class296 arg1, int arg2) {
        field2799++;
        Object[] var3 = arg1.field4575;
        int var4 = (Integer) var3[0];
        class172 var5 = class330.method2300(true, var4);
        if (var5 == null) {
            return;
        }
        class291.field4476 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int[] var9 = var5.field2783;
        int[] var10 = var5.field2776;
        byte var11 = -1;
        try {
            class25.field279 = new String[var5.field2779];
            class290.field4464 = new int[var5.field2777];
            int var12 = 0;
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if (var3[var14] instanceof Integer) {
                    int var15 = (Integer) var3[var14];
                    if (var15 == -2147483647) {
                        var15 = arg1.field4567;
                    }
                    if (var15 == -2147483646) {
                        var15 = arg1.field4573;
                    }
                    if (var15 == -2147483645) {
                        var15 = arg1.field4574 == null ? -1 : arg1.field4574.field2615;
                    }
                    if (var15 == -2147483644) {
                        var15 = arg1.field4565;
                    }
                    if (var15 == -2147483643) {
                        var15 = arg1.field4574 == null ? -1 : arg1.field4574.field2510;
                    }
                    if (var15 == -2147483642) {
                        var15 = arg1.field4570 == null ? -1 : arg1.field4570.field2615;
                    }
                    if (var15 == -2147483641) {
                        var15 = arg1.field4570 == null ? -1 : arg1.field4570.field2510;
                    }
                    if (var15 == -2147483640) {
                        var15 = arg1.field4576;
                    }
                    if (var15 == -2147483639) {
                        var15 = arg1.field4577;
                    }
                    class290.field4464[var12++] = var15;
                } else if (var3[var14] instanceof String) {
                    String var16 = (String) var3[var14];
                    if (var16.equals("event_opbase")) {
                        var16 = arg1.field4568;
                    }
                    class25.field279[var13++] = var16;
                }
            }
            int var17 = 0;
            label4448: while (true) {
                var17++;
                if (arg2 < var17) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var528 = var9[var8];
                if (var528 < 100) {
                    if (var528 == 0) {
                        class268.field4166[var6++] = var10[var8];
                        continue;
                    }
                    if (var528 == 1) {
                        int var18 = var10[var8];
                        class268.field4166[var6++] = class154.field2330[var18];
                        continue;
                    }
                    int var10001;
                    if (var528 == 2) {
                        int var19 = var10[var8];
                        var10001 = arg0 - 6652;
                        var6--;
                        class333.method2329(var19, var10001, class268.field4166[var6]);
                        continue;
                    }
                    if (var528 == 3) {
                        class207.field3175[var7++] = var5.field2780[var8];
                        continue;
                    }
                    if (var528 == 6) {
                        var8 += var10[var8];
                        continue;
                    }
                    if (var528 == 7) {
                        var6 -= 2;
                        if (class268.field4166[var6 + 1] != class268.field4166[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var528 == 8) {
                        var6 -= 2;
                        if (class268.field4166[var6 + 1] == class268.field4166[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var528 == 9) {
                        var6 -= 2;
                        if (class268.field4166[var6] < class268.field4166[var6 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var528 == 10) {
                        var6 -= 2;
                        if (class268.field4166[var6] > class268.field4166[var6 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var528 == 21) {
                        if (class291.field4476 == 0) {
                            return;
                        }
                        class224 var20 = class30.field363[--class291.field4476];
                        var5 = var20.field3416;
                        var8 = var20.field3423;
                        var9 = var5.field2783;
                        class25.field279 = var20.field3421;
                        class290.field4464 = var20.field3420;
                        var10 = var5.field2776;
                        continue;
                    }
                    if (var528 == 25) {
                        int var21 = var10[var8];
                        class268.field4166[var6++] = class222.method1580(var21, (byte) 123);
                        continue;
                    }
                    if (var528 == 27) {
                        int var22 = var10[var8];
                        var6--;
                        class31.method237(class268.field4166[var6], var22, (byte) -126);
                        continue;
                    }
                    if (var528 == 31) {
                        var6 -= 2;
                        if (class268.field4166[var6] <= class268.field4166[var6 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var528 == 32) {
                        var6 -= 2;
                        if (class268.field4166[var6 + 1] <= class268.field4166[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var528 == 33) {
                        class268.field4166[var6++] = class290.field4464[var10[var8]];
                        continue;
                    }
                    if (var528 == 34) {
                        var10001 = var10[var8];
                        var6--;
                        class290.field4464[var10001] = class268.field4166[var6];
                        continue;
                    }
                    if (var528 == 35) {
                        class207.field3175[var7++] = class25.field279[var10[var8]];
                        continue;
                    }
                    if (var528 == 36) {
                        var10001 = var10[var8];
                        var7--;
                        class25.field279[var10001] = class207.field3175[var7];
                        continue;
                    }
                    if (var528 == 37) {
                        int var23 = var10[var8];
                        var7 -= var23;
                        String var24 = class39.method296(var7, var23, arg0 - 6614, class207.field3175);
                        class207.field3175[var7++] = var24;
                        continue;
                    }
                    if (var528 == 38) {
                        var6--;
                        continue;
                    }
                    if (var528 == 39) {
                        var7--;
                        continue;
                    }
                    if (var528 == 40) {
                        int var25 = var10[var8];
                        class172 var26 = class330.method2300(true, var25);
                        int[] var27 = new int[var26.field2777];
                        String[] var28 = new String[var26.field2779];
                        for (int var29 = 0; var29 < var26.field2771; var29++) {
                            var27[var29] = class268.field4166[var29 + var6 - var26.field2771];
                        }
                        for (int var30 = 0; var30 < var26.field2775; var30++) {
                            var28[var30] = class207.field3175[var7 + var30 - var26.field2775];
                        }
                        var6 -= var26.field2771;
                        var7 -= var26.field2775;
                        class224 var31 = new class224();
                        var31.field3416 = var5;
                        var31.field3421 = class25.field279;
                        var31.field3423 = var8;
                        var31.field3420 = class290.field4464;
                        if (class30.field363.length <= class291.field4476) {
                            throw new RuntimeException();
                        }
                        class30.field363[class291.field4476++] = var31;
                        var5 = var26;
                        class290.field4464 = var27;
                        var10 = var26.field2776;
                        var9 = var26.field2783;
                        class25.field279 = var28;
                        var8 = -1;
                        continue;
                    }
                    if (var528 == 42) {
                        class268.field4166[var6++] = class233.field3555[var10[var8]];
                        continue;
                    }
                    if (var528 == 43) {
                        int var32 = var10[var8];
                        var6--;
                        class233.field3555[var32] = class268.field4166[var6];
                        class166.method1259((byte) 123, var32);
                        continue;
                    }
                    if (var528 == 44) {
                        int var33 = var10[var8] >> 16;
                        var6--;
                        int var34 = class268.field4166[var6];
                        int var35 = var10[var8] & 0xFFFF;
                        if (var34 >= 0 && var34 <= 5000) {
                            class210.field3230[var33] = var34;
                            byte var36 = -1;
                            if (var35 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var37 >= var34) {
                                    continue label4448;
                                }
                                class327.field5055[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var528 == 45) {
                        var6--;
                        int var38 = class268.field4166[var6];
                        int var39 = var10[var8];
                        if (var38 >= 0 && var38 < class210.field3230[var39]) {
                            class268.field4166[var6++] = class327.field5055[var39][var38];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var528 == 46) {
                        int var40 = var10[var8];
                        var6 -= 2;
                        int var41 = class268.field4166[var6];
                        if (var41 >= 0 && class210.field3230[var40] > var41) {
                            class327.field5055[var40][var41] = class268.field4166[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var528 == 47) {
                        String var42 = class291.field4480[var10[var8]];
                        if (var42 == null) {
                            var42 = "null";
                        }
                        class207.field3175[var7++] = var42;
                        continue;
                    }
                    if (var528 == 48) {
                        int var43 = var10[var8];
                        var7--;
                        class291.field4480[var43] = class207.field3175[var7];
                        method1305(-29696, var43);
                        continue;
                    }
                    if (var528 == 51) {
                        class250 var44 = var5.field2786[var10[var8]];
                        var6--;
                        class293 var45 = (class293) var44.method1716(-1, (long) class268.field4166[var6]);
                        if (var45 != null) {
                            var8 += var45.field4519;
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
                if (var528 < 300) {
                    if (var528 == 100) {
                        var6 -= 3;
                        int var508 = class268.field4166[var6];
                        int var509 = class268.field4166[var6 + 1];
                        int var510 = class268.field4166[var6 + 2];
                        if (var509 == 0) {
                            throw new RuntimeException();
                        }
                        class161 var511 = class331.method2308((byte) -125, var508);
                        if (var511.field2509 == null) {
                            var511.field2509 = new class161[var510 + 1];
                        }
                        if (var510 >= var511.field2509.length) {
                            class161[] var512 = new class161[var510 + 1];
                            for (int var513 = 0; var513 < var511.field2509.length; var513++) {
                                var512[var513] = var511.field2509[var513];
                            }
                            var511.field2509 = var512;
                        }
                        if (var510 > 0 && var511.field2509[var510 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var510 - 1));
                        }
                        class161 var514 = new class161();
                        var514.field2510 = var510;
                        var514.field2590 = var509;
                        var514.field2550 = true;
                        var514.field2566 = var514.field2615 = var511.field2615;
                        var511.field2509[var510] = var514;
                        if (var46) {
                            class277.field4303 = var514;
                        } else {
                            class308.field4802 = var514;
                        }
                        class254.method1776(4, var511);
                        continue;
                    }
                    if (var528 == 101) {
                        class161 var515 = var46 ? class277.field4303 : class308.field4802;
                        if (var515.field2510 == -1) {
                            if (var46) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class161 var516 = class331.method2308((byte) 77, var515.field2615);
                        var516.field2509[var515.field2510] = null;
                        class254.method1776(4, var516);
                        continue;
                    }
                    if (var528 == 102) {
                        var6--;
                        class161 var517 = class331.method2308((byte) -35, class268.field4166[var6]);
                        var517.field2509 = null;
                        class254.method1776(4, var517);
                        continue;
                    }
                    if (var528 == 200) {
                        var6 -= 2;
                        int var518 = class268.field4166[var6];
                        int var519 = class268.field4166[var6 + 1];
                        class161 var520 = class94.method680(var518, 0, var519);
                        if (var520 != null && var519 != -1) {
                            class268.field4166[var6++] = 1;
                            if (var46) {
                                class277.field4303 = var520;
                            } else {
                                class308.field4802 = var520;
                            }
                            continue;
                        }
                        class268.field4166[var6++] = 0;
                        continue;
                    }
                    if (var528 == 201) {
                        var6--;
                        int var521 = class268.field4166[var6];
                        class161 var522 = class331.method2308((byte) -126, var521);
                        if (var522 == null) {
                            class268.field4166[var6++] = 0;
                        } else {
                            class268.field4166[var6++] = 1;
                            if (var46) {
                                class277.field4303 = var522;
                            } else {
                                class308.field4802 = var522;
                            }
                        }
                        continue;
                    }
                } else if (var528 < 500) {
                    if (var528 == 403) {
                        var6 -= 2;
                        int var47 = class268.field4166[var6 + 1];
                        int var48 = class268.field4166[var6];
                        for (int var49 = 0; var49 < class265.field4134.length; var49++) {
                            if (class265.field4134[var49] == var48) {
                                class39.field575.field4199.method2041(var49, 1, var47);
                                continue label4448;
                            }
                        }
                        int var50 = 0;
                        while (true) {
                            if (var50 >= class178.field2834.length) {
                                continue label4448;
                            }
                            if (class178.field2834[var50] == var48) {
                                class39.field575.field4199.method2041(var50, 1, var47);
                                continue label4448;
                            }
                            var50++;
                        }
                    }
                    if (var528 == 404) {
                        var6 -= 2;
                        int var51 = class268.field4166[var6];
                        int var52 = class268.field4166[var6 + 1];
                        class39.field575.field4199.method2046(var52, true, var51);
                        continue;
                    }
                    if (var528 == 410) {
                        var6--;
                        boolean var53 = class268.field4166[var6] != 0;
                        class39.field575.field4199.method2040(2, var53);
                        continue;
                    }
                } else if (var528 >= 1000 && var528 < 1100 || var528 >= 2000 && var528 < 2100) {
                    class161 var502;
                    if (var528 >= 2000) {
                        var528 -= 1000;
                        var6--;
                        var502 = class331.method2308((byte) 50, class268.field4166[var6]);
                    } else {
                        var502 = var46 ? class277.field4303 : class308.field4802;
                    }
                    if (var528 == 1000) {
                        var6 -= 4;
                        var502.field2513 = class268.field4166[var6];
                        var502.field2558 = class268.field4166[var6 + 1];
                        int var503 = class268.field4166[var6 + 2];
                        int var504 = class268.field4166[var6 + 3];
                        if (var503 < 0) {
                            var503 = 0;
                        } else if (var503 > 5) {
                            var503 = 5;
                        }
                        if (var504 < 0) {
                            var504 = 0;
                        } else if (var504 > 5) {
                            var504 = 5;
                        }
                        var502.field2577 = (byte) var503;
                        var502.field2534 = (byte) var504;
                        class254.method1776(4, var502);
                        class211.method1508(var502, (byte) 100);
                        if (var502.field2510 == -1) {
                            class224.method1599(0, var502.field2615);
                        }
                        continue;
                    }
                    if (var528 == 1001) {
                        var6 -= 4;
                        var502.field2576 = class268.field4166[var6];
                        var502.field2462 = class268.field4166[var6 + 1];
                        var502.field2602 = 0;
                        var502.field2465 = 0;
                        int var505 = class268.field4166[var6 + 3];
                        if (var505 < 0) {
                            var505 = 0;
                        } else if (var505 > 4) {
                            var505 = 4;
                        }
                        int var506 = class268.field4166[var6 + 2];
                        var502.field2574 = (byte) var505;
                        if (var506 < 0) {
                            var506 = 0;
                        } else if (var506 > 4) {
                            var506 = 4;
                        }
                        var502.field2535 = (byte) var506;
                        class254.method1776(arg0 - 6529, var502);
                        class211.method1508(var502, (byte) 100);
                        if (var502.field2590 == 0) {
                            class255.method1793((byte) -108, var502, false);
                        }
                        continue;
                    }
                    if (var528 == 1003) {
                        var6--;
                        boolean var507 = class268.field4166[var6] == 1;
                        if (var502.field2557 != var507) {
                            var502.field2557 = var507;
                            class254.method1776(4, var502);
                        }
                        if (var502.field2510 == -1) {
                            class65.method473(7, var502.field2615);
                        }
                        continue;
                    }
                    if (var528 == 1004) {
                        var6 -= 2;
                        var502.field2505 = class268.field4166[var6];
                        var502.field2586 = class268.field4166[var6 + 1];
                        class254.method1776(4, var502);
                        class211.method1508(var502, (byte) 100);
                        if (var502.field2590 == 0) {
                            class255.method1793((byte) -108, var502, false);
                        }
                        continue;
                    }
                    if (var528 == 1005) {
                        var6--;
                        var502.field2601 = class268.field4166[var6] == 1;
                        continue;
                    }
                } else if (var528 >= 1100 && var528 < 1200 || var528 >= 2100 && var528 < 2200) {
                    class161 var54;
                    if (var528 >= 2000) {
                        var6--;
                        var54 = class331.method2308((byte) 10, class268.field4166[var6]);
                        var528 -= 1000;
                    } else {
                        var54 = var46 ? class277.field4303 : class308.field4802;
                    }
                    if (var528 == 1100) {
                        var6 -= 2;
                        var54.field2573 = class268.field4166[var6];
                        if (var54.field2623 - var54.field2619 < var54.field2573) {
                            var54.field2573 = var54.field2623 - var54.field2619;
                        }
                        if (var54.field2573 < 0) {
                            var54.field2573 = 0;
                        }
                        var54.field2546 = class268.field4166[var6 + 1];
                        if ((var54.field2441 - var54.field2490) < var54.field2546) {
                            var54.field2546 = var54.field2441 - var54.field2490;
                        }
                        if (var54.field2546 < 0) {
                            var54.field2546 = 0;
                        }
                        class254.method1776(4, var54);
                        if (var54.field2510 == -1) {
                            class184.method1367(var54.field2615, (byte) -115);
                        }
                        continue;
                    }
                    if (var528 == 1101) {
                        var6--;
                        var54.field2597 = class268.field4166[var6];
                        class254.method1776(4, var54);
                        if (var54.field2510 == -1) {
                            class120.method907((byte) -86, var54.field2615);
                        }
                        continue;
                    }
                    if (var528 == 1102) {
                        var6--;
                        var54.field2544 = class268.field4166[var6] == 1;
                        class254.method1776(4, var54);
                        continue;
                    }
                    if (var528 == 1103) {
                        var6--;
                        var54.field2512 = class268.field4166[var6];
                        class254.method1776(arg0 ^ 0x1981, var54);
                        continue;
                    }
                    if (var528 == 1104) {
                        var6--;
                        var54.field2553 = class268.field4166[var6];
                        class254.method1776(4, var54);
                        continue;
                    }
                    if (var528 == 1105) {
                        var6--;
                        var54.field2589 = class268.field4166[var6];
                        class254.method1776(4, var54);
                        continue;
                    }
                    if (var528 == 1106) {
                        var6--;
                        var54.field2484 = class268.field4166[var6];
                        class254.method1776(4, var54);
                        continue;
                    }
                    if (var528 == 1107) {
                        var6--;
                        var54.field2479 = class268.field4166[var6] == 1;
                        class254.method1776(4, var54);
                        continue;
                    }
                    if (var528 == 1108) {
                        var54.field2481 = 1;
                        var6--;
                        var54.field2444 = class268.field4166[var6];
                        class254.method1776(4, var54);
                        if (var54.field2510 == -1) {
                            class184.method1364((byte) 119, var54.field2615);
                        }
                        continue;
                    }
                    if (var528 == 1109) {
                        var6 -= 6;
                        var54.field2600 = class268.field4166[var6];
                        var54.field2609 = class268.field4166[var6 + 1];
                        var54.field2622 = class268.field4166[var6 + 2];
                        var54.field2473 = class268.field4166[var6 + 3];
                        var54.field2475 = class268.field4166[var6 + 4];
                        var54.field2565 = class268.field4166[var6 + 5];
                        class254.method1776(arg0 ^ 0x1981, var54);
                        if (var54.field2510 == -1) {
                            class191.method1405((byte) 32, var54.field2615);
                            class217.method1550(1, var54.field2615);
                        }
                        continue;
                    }
                    if (var528 == 1110) {
                        var6--;
                        int var55 = class268.field4166[var6];
                        if (var54.field2494 != var55) {
                            var54.field2532 = 1;
                            var54.field2494 = var55;
                            var54.field2460 = 0;
                            var54.field2470 = 0;
                            class254.method1776(4, var54);
                        }
                        if (var54.field2510 == -1) {
                            class203.method1469(var54.field2615, 18);
                        }
                        continue;
                    }
                    if (var528 == 1111) {
                        var6--;
                        var54.field2474 = class268.field4166[var6] == 1;
                        class254.method1776(4, var54);
                        continue;
                    }
                    if (var528 == 1112) {
                        var7--;
                        String var56 = class207.field3175[var7];
                        if (!var56.equals(var54.field2466)) {
                            var54.field2466 = var56;
                            class254.method1776(arg0 ^ 0x1981, var54);
                        }
                        if (var54.field2510 == -1) {
                            class52.method383(var54.field2615, 122);
                        }
                        continue;
                    }
                    if (var528 == 1113) {
                        var6--;
                        var54.field2446 = class268.field4166[var6];
                        class254.method1776(arg0 - 6529, var54);
                        continue;
                    }
                    if (var528 == 1114) {
                        var6 -= 3;
                        var54.field2541 = class268.field4166[var6];
                        var54.field2469 = class268.field4166[var6 + 1];
                        var54.field2542 = class268.field4166[var6 + 2];
                        class254.method1776(4, var54);
                        continue;
                    }
                    if (var528 == 1115) {
                        var6--;
                        var54.field2607 = class268.field4166[var6] == 1;
                        class254.method1776(4, var54);
                        continue;
                    }
                    if (var528 == 1116) {
                        var6--;
                        var54.field2569 = class268.field4166[var6];
                        class254.method1776(4, var54);
                        continue;
                    }
                    if (var528 == 1117) {
                        var6--;
                        var54.field2568 = class268.field4166[var6];
                        class254.method1776(4, var54);
                        continue;
                    }
                    if (var528 == 1118) {
                        var6--;
                        var54.field2502 = class268.field4166[var6] == 1;
                        class254.method1776(4, var54);
                        continue;
                    }
                    if (var528 == 1119) {
                        var6--;
                        var54.field2581 = class268.field4166[var6] == 1;
                        class254.method1776(4, var54);
                        continue;
                    }
                    if (var528 == 1120) {
                        var6 -= 2;
                        var54.field2623 = class268.field4166[var6];
                        var54.field2441 = class268.field4166[var6 + 1];
                        class254.method1776(4, var54);
                        if (var54.field2590 == 0) {
                            class255.method1793((byte) -108, var54, false);
                        }
                        continue;
                    }
                    if (var528 == 1121) {
                        var6 -= 2;
                        var54.field2561 = (short) class268.field4166[var6];
                        var54.field2547 = (short) class268.field4166[var6 + 1];
                        class254.method1776(arg0 - 6529, var54);
                        continue;
                    }
                    if (var528 == 1122) {
                        var6--;
                        var54.field2461 = class268.field4166[var6] == 1;
                        class254.method1776(4, var54);
                        continue;
                    }
                    if (var528 == 1123) {
                        var6--;
                        var54.field2565 = class268.field4166[var6];
                        class254.method1776(4, var54);
                        if (var54.field2510 == -1) {
                            class191.method1405((byte) 32, var54.field2615);
                        }
                        continue;
                    }
                    if (var528 == 1124) {
                        var6--;
                        int var57 = class268.field4166[var6];
                        var54.field2515 = var57 == 1;
                        class254.method1776(arg0 ^ 0x1981, var54);
                        continue;
                    }
                } else if (!(var528 < 1200 || var528 >= 1300) || !(var528 < 2200 || var528 >= 2300)) {
                    class161 var498;
                    if (var528 >= 2000) {
                        var6--;
                        var498 = class331.method2308((byte) -125, class268.field4166[var6]);
                        var528 -= 1000;
                    } else {
                        var498 = var46 ? class277.field4303 : class308.field4802;
                    }
                    class254.method1776(4, var498);
                    if (var528 == 1200 || var528 == 1205 || var528 == 1208 || var528 == 1209) {
                        var6 -= 2;
                        int var499 = class268.field4166[var6 + 1];
                        int var500 = class268.field4166[var6];
                        if (var498.field2510 == -1) {
                            class3.method18(arg0 ^ 0x19E0, var498.field2615);
                            class191.method1405((byte) 32, var498.field2615);
                            class217.method1550(1, var498.field2615);
                        }
                        if (var500 == -1) {
                            var498.field2523 = -1;
                            var498.field2444 = -1;
                            var498.field2481 = 1;
                            continue;
                        }
                        var498.field2456 = var499;
                        var498.field2523 = var500;
                        if (var528 == 1208 || var528 == 1209) {
                            var498.field2611 = true;
                        } else {
                            var498.field2611 = false;
                        }
                        class108 var501 = class222.method1576(var500, (byte) 92);
                        var498.field2609 = var501.field1623;
                        if (var528 == 1205) {
                            var498.field2455 = false;
                        } else {
                            var498.field2455 = true;
                        }
                        var498.field2600 = var501.field1576;
                        var498.field2565 = var501.field1572;
                        var498.field2473 = var501.field1570;
                        var498.field2475 = var501.field1632;
                        if (var498.field2465 > 0) {
                            var498.field2565 = var498.field2565 * 32 / var498.field2465;
                        } else if (var498.field2576 > 0) {
                            var498.field2565 = var498.field2565 * 32 / var498.field2576;
                        }
                        var498.field2622 = var501.field1621;
                        continue;
                    }
                    if (var528 == 1201) {
                        var498.field2481 = 2;
                        var6--;
                        var498.field2444 = class268.field4166[var6];
                        if (var498.field2510 == -1) {
                            class184.method1364((byte) 119, var498.field2615);
                        }
                        continue;
                    }
                    if (var528 == 1202) {
                        var498.field2481 = 3;
                        var498.field2444 = class39.field575.field4199.method2045(false);
                        if (var498.field2510 == -1) {
                            class184.method1364((byte) 119, var498.field2615);
                        }
                        continue;
                    }
                    if (var528 == 1203) {
                        var498.field2481 = 6;
                        var6--;
                        var498.field2444 = class268.field4166[var6];
                        if (var498.field2510 == -1) {
                            class184.method1364((byte) 119, var498.field2615);
                        }
                        continue;
                    }
                    if (var528 == 1204) {
                        var498.field2481 = 5;
                        var6--;
                        var498.field2444 = class268.field4166[var6];
                        if (var498.field2510 == -1) {
                            class184.method1364((byte) 119, var498.field2615);
                        }
                        continue;
                    }
                    if (var528 == 1206) {
                        var6 -= 4;
                        var498.field2491 = class268.field4166[var6];
                        var498.field2514 = class268.field4166[var6 + 1];
                        var498.field2449 = class268.field4166[var6 + 2];
                        var498.field2439 = class268.field4166[var6 + 3];
                        class254.method1776(arg0 ^ 0x1981, var498);
                        continue;
                    }
                    if (var528 == 1207) {
                        var6 -= 2;
                        var498.field2459 = class268.field4166[var6];
                        var498.field2471 = class268.field4166[var6 + 1];
                        class254.method1776(4, var498);
                        continue;
                    }
                } else if (var528 >= 1300 && var528 < 1400 || var528 >= 2300 && var528 < 2400) {
                    class161 var58;
                    if (var528 < 2000) {
                        var58 = var46 ? class277.field4303 : class308.field4802;
                    } else {
                        var6--;
                        var58 = class331.method2308((byte) 44, class268.field4166[var6]);
                        var528 -= 1000;
                    }
                    if (var528 == 1300) {
                        var6--;
                        int var59 = class268.field4166[var6] - 1;
                        if (var59 >= 0 && var59 <= 9) {
                            var7--;
                            var58.method1211(class207.field3175[var7], (byte) -121, var59);
                            continue;
                        }
                        var7--;
                        continue;
                    }
                    if (var528 == 1301) {
                        var6 -= 2;
                        int var60 = class268.field4166[var6];
                        int var61 = class268.field4166[var6 + 1];
                        var58.field2464 = class94.method680(var60, 0, var61);
                        continue;
                    }
                    if (var528 == 1302) {
                        var6--;
                        var58.field2571 = class268.field4166[var6] == 1;
                        continue;
                    }
                    if (var528 == 1303) {
                        var6--;
                        var58.field2555 = class268.field4166[var6];
                        continue;
                    }
                    if (var528 == 1304) {
                        var6--;
                        var58.field2616 = class268.field4166[var6];
                        continue;
                    }
                    if (var528 == 1305) {
                        var7--;
                        var58.field2545 = class207.field3175[var7];
                        continue;
                    }
                    if (var528 == 1306) {
                        var7--;
                        var58.field2596 = class207.field3175[var7];
                        continue;
                    }
                    if (var528 == 1307) {
                        var58.field2448 = null;
                        continue;
                    }
                    if (var528 == 1308) {
                        var6--;
                        var58.field2604 = class268.field4166[var6];
                        var6--;
                        var58.field2563 = class268.field4166[var6];
                        continue;
                    }
                    if (var528 == 1309) {
                        var6--;
                        int var62 = class268.field4166[var6];
                        var6--;
                        int var63 = class268.field4166[var6];
                        if (var63 >= 1 && var63 <= 10) {
                            var58.method1204(var63 - 1, var62, arg0 ^ 0xFFFFE61B);
                        }
                        continue;
                    }
                    if (var528 == 1310) {
                        var7--;
                        var58.field2527 = class207.field3175[var7];
                        continue;
                    }
                } else {
                    if (var528 >= 1400 && var528 < 1500 || var528 >= 2400 && var528 < 2500) {
                        class161 var491;
                        if (var528 >= 2000) {
                            var528 -= 1000;
                            var6--;
                            var491 = class331.method2308((byte) -122, class268.field4166[var6]);
                        } else {
                            var491 = var46 ? class277.field4303 : class308.field4802;
                        }
                        var7--;
                        String var492 = class207.field3175[var7];
                        int[] var493 = null;
                        if (var492.length() > 0 && var492.charAt(var492.length() - 1) == 'Y') {
                            var6--;
                            int var494 = class268.field4166[var6];
                            if (var494 > 0) {
                                var493 = new int[var494];
                                while ((var494--) > 0) {
                                    var6--;
                                    var493[var494] = class268.field4166[var6];
                                }
                            }
                            var492 = var492.substring(0, var492.length() - 1);
                        }
                        Object[] var495 = new Object[var492.length() + 1];
                        for (int var496 = var495.length - 1; var496 >= 1; var496--) {
                            if (var492.charAt(var496 - 1) == 's') {
                                var7--;
                                var495[var496] = class207.field3175[var7];
                            } else {
                                var6--;
                                var495[var496] = Integer.valueOf(class268.field4166[var6]);
                            }
                        }
                        var6--;
                        int var497 = class268.field4166[var6];
                        if (var497 == -1) {
                            var495 = null;
                        } else {
                            var495[0] = Integer.valueOf(var497);
                        }
                        if (var528 == 1400) {
                            var491.field2520 = var495;
                        } else if (var528 == 1401) {
                            var491.field2610 = var495;
                        } else if (var528 == 1402) {
                            var491.field2516 = var495;
                        } else if (var528 == 1403) {
                            var491.field2608 = var495;
                        } else if (var528 == 1404) {
                            var491.field2517 = var495;
                        } else if (var528 == 1405) {
                            var491.field2483 = var495;
                        } else if (var528 == 1406) {
                            var491.field2518 = var495;
                        } else if (var528 == 1407) {
                            var491.field2548 = var495;
                            var491.field2612 = var493;
                        } else if (var528 == 1408) {
                            var491.field2485 = var495;
                        } else if (var528 == 1409) {
                            var491.field2528 = var495;
                        } else if (var528 == 1410) {
                            var491.field2564 = var495;
                        } else if (var528 == 1411) {
                            var491.field2575 = var495;
                        } else if (var528 == 1412) {
                            var491.field2519 = var495;
                        } else if (var528 == 1414) {
                            var491.field2536 = var495;
                            var491.field2472 = var493;
                        } else if (var528 == 1415) {
                            var491.field2603 = var495;
                            var491.field2499 = var493;
                        } else if (var528 == 1416) {
                            var491.field2570 = var495;
                        } else if (var528 == 1417) {
                            var491.field2492 = var495;
                        } else if (var528 == 1418) {
                            var491.field2537 = var495;
                        } else if (var528 == 1419) {
                            var491.field2450 = var495;
                        } else if (var528 == 1420) {
                            var491.field2495 = var495;
                        } else if (var528 == 1421) {
                            var491.field2506 = var495;
                        } else if (var528 == 1422) {
                            var491.field2585 = var495;
                        } else if (var528 == 1423) {
                            var491.field2592 = var495;
                        } else if (var528 == 1424) {
                            var491.field2582 = var495;
                        } else if (var528 == 1425) {
                            var491.field2530 = var495;
                        } else if (var528 == 1426) {
                            var491.field2451 = var495;
                        } else if (var528 == 1427) {
                            var491.field2452 = var495;
                        } else if (var528 == 1428) {
                            var491.field2618 = var493;
                            var491.field2538 = var495;
                        } else if (var528 == 1429) {
                            var491.field2476 = var493;
                            var491.field2486 = var495;
                        }
                        var491.field2606 = true;
                        continue;
                    }
                    if (var528 < 1600) {
                        class161 var490 = var46 ? class277.field4303 : class308.field4802;
                        if (var528 == 1500) {
                            class268.field4166[var6++] = var490.field2621;
                            continue;
                        }
                        if (var528 == 1501) {
                            class268.field4166[var6++] = var490.field2587;
                            continue;
                        }
                        if (var528 == 1502) {
                            class268.field4166[var6++] = var490.field2619;
                            continue;
                        }
                        if (var528 == 1503) {
                            class268.field4166[var6++] = var490.field2490;
                            continue;
                        }
                        if (var528 == 1504) {
                            class268.field4166[var6++] = var490.field2557 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 1505) {
                            class268.field4166[var6++] = var490.field2566;
                            continue;
                        }
                    } else if (var528 < 1700) {
                        class161 var489 = var46 ? class277.field4303 : class308.field4802;
                        if (var528 == 1600) {
                            class268.field4166[var6++] = var489.field2573;
                            continue;
                        }
                        if (var528 == 1601) {
                            class268.field4166[var6++] = var489.field2546;
                            continue;
                        }
                        if (var528 == 1602) {
                            class207.field3175[var7++] = var489.field2466;
                            continue;
                        }
                        if (var528 == 1603) {
                            class268.field4166[var6++] = var489.field2623;
                            continue;
                        }
                        if (var528 == 1604) {
                            class268.field4166[var6++] = var489.field2441;
                            continue;
                        }
                        if (var528 == 1605) {
                            class268.field4166[var6++] = var489.field2565;
                            continue;
                        }
                        if (var528 == 1606) {
                            class268.field4166[var6++] = var489.field2622;
                            continue;
                        }
                        if (var528 == 1607) {
                            class268.field4166[var6++] = var489.field2475;
                            continue;
                        }
                        if (var528 == 1608) {
                            class268.field4166[var6++] = var489.field2473;
                            continue;
                        }
                        if (var528 == 1609) {
                            class268.field4166[var6++] = var489.field2512;
                            continue;
                        }
                        if (var528 == 1610) {
                            class268.field4166[var6++] = var489.field2600;
                            continue;
                        }
                        if (var528 == 1611) {
                            class268.field4166[var6++] = var489.field2609;
                            continue;
                        }
                        if (var528 == 1612) {
                            class268.field4166[var6++] = var489.field2589;
                            continue;
                        }
                    } else if (var528 < 1800) {
                        class161 var488 = var46 ? class277.field4303 : class308.field4802;
                        if (var528 == 1700) {
                            class268.field4166[var6++] = var488.field2523;
                            continue;
                        }
                        if (var528 == 1701) {
                            if (var488.field2523 == -1) {
                                class268.field4166[var6++] = 0;
                            } else {
                                class268.field4166[var6++] = var488.field2456;
                            }
                            continue;
                        }
                        if (var528 == 1702) {
                            class268.field4166[var6++] = var488.field2510;
                            continue;
                        }
                    } else if (var528 < 1900) {
                        class161 var64 = var46 ? class277.field4303 : class308.field4802;
                        if (var528 == 1800) {
                            class268.field4166[var6++] = client.method1012(var64).method34(arg0 - 6412);
                            continue;
                        }
                        if (var528 == 1801) {
                            var6--;
                            int var65 = class268.field4166[var6];
                            int var529 = var65 - 1;
                            if (var64.field2448 != null && var529 < var64.field2448.length && var64.field2448[var529] != null) {
                                class207.field3175[var7++] = var64.field2448[var529];
                                continue;
                            }
                            class207.field3175[var7++] = "";
                            continue;
                        }
                        if (var528 == 1802) {
                            if (var64.field2545 == null) {
                                class207.field3175[var7++] = "";
                            } else {
                                class207.field3175[var7++] = var64.field2545;
                            }
                            continue;
                        }
                    } else if (var528 < 2600) {
                        var6--;
                        class161 var66 = class331.method2308((byte) -127, class268.field4166[var6]);
                        if (var528 == 2500) {
                            class268.field4166[var6++] = var66.field2621;
                            continue;
                        }
                        if (var528 == 2501) {
                            class268.field4166[var6++] = var66.field2587;
                            continue;
                        }
                        if (var528 == 2502) {
                            class268.field4166[var6++] = var66.field2619;
                            continue;
                        }
                        if (var528 == 2503) {
                            class268.field4166[var6++] = var66.field2490;
                            continue;
                        }
                        if (var528 == 2504) {
                            class268.field4166[var6++] = var66.field2557 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 2505) {
                            class268.field4166[var6++] = var66.field2566;
                            continue;
                        }
                    } else if (var528 < 2700) {
                        var6--;
                        class161 var487 = class331.method2308((byte) -5, class268.field4166[var6]);
                        if (var528 == 2600) {
                            class268.field4166[var6++] = var487.field2573;
                            continue;
                        }
                        if (var528 == 2601) {
                            class268.field4166[var6++] = var487.field2546;
                            continue;
                        }
                        if (var528 == 2602) {
                            class207.field3175[var7++] = var487.field2466;
                            continue;
                        }
                        if (var528 == 2603) {
                            class268.field4166[var6++] = var487.field2623;
                            continue;
                        }
                        if (var528 == 2604) {
                            class268.field4166[var6++] = var487.field2441;
                            continue;
                        }
                        if (var528 == 2605) {
                            class268.field4166[var6++] = var487.field2565;
                            continue;
                        }
                        if (var528 == 2606) {
                            class268.field4166[var6++] = var487.field2622;
                            continue;
                        }
                        if (var528 == 2607) {
                            class268.field4166[var6++] = var487.field2475;
                            continue;
                        }
                        if (var528 == 2608) {
                            class268.field4166[var6++] = var487.field2473;
                            continue;
                        }
                        if (var528 == 2609) {
                            class268.field4166[var6++] = var487.field2512;
                            continue;
                        }
                        if (var528 == 2610) {
                            class268.field4166[var6++] = var487.field2600;
                            continue;
                        }
                        if (var528 == 2611) {
                            class268.field4166[var6++] = var487.field2609;
                            continue;
                        }
                        if (var528 == 2612) {
                            class268.field4166[var6++] = var487.field2589;
                            continue;
                        }
                    } else if (var528 < 2800) {
                        if (var528 == 2700) {
                            var6--;
                            class161 var477 = class331.method2308((byte) -126, class268.field4166[var6]);
                            class268.field4166[var6++] = var477.field2523;
                            continue;
                        }
                        if (var528 == 2701) {
                            var6--;
                            class161 var478 = class331.method2308((byte) -14, class268.field4166[var6]);
                            if (var478.field2523 == -1) {
                                class268.field4166[var6++] = 0;
                            } else {
                                class268.field4166[var6++] = var478.field2456;
                            }
                            continue;
                        }
                        if (var528 == 2702) {
                            var6--;
                            int var479 = class268.field4166[var6];
                            class242 var480 = (class242) class222.field3383.method1716(-1, (long) var479);
                            if (var480 == null) {
                                class268.field4166[var6++] = 0;
                            } else {
                                class268.field4166[var6++] = 1;
                            }
                            continue;
                        }
                        if (var528 == 2703) {
                            var6--;
                            class161 var481 = class331.method2308((byte) 53, class268.field4166[var6]);
                            if (var481.field2509 == null) {
                                class268.field4166[var6++] = 0;
                                continue;
                            }
                            int var482 = var481.field2509.length;
                            for (int var483 = 0; var483 < var481.field2509.length; var483++) {
                                if (var481.field2509[var483] == null) {
                                    var482 = var483;
                                    break;
                                }
                            }
                            class268.field4166[var6++] = var482;
                            continue;
                        }
                        if (var528 == 2704 || var528 == 2705) {
                            var6 -= 2;
                            int var484 = class268.field4166[var6 + 1];
                            int var485 = class268.field4166[var6];
                            class242 var486 = (class242) class222.field3383.method1716(arg0 ^ 0xFFFFE67A, (long) var485);
                            if (var486 != null && var486.field3689 == var484) {
                                class268.field4166[var6++] = 1;
                                continue;
                            }
                            class268.field4166[var6++] = 0;
                            continue;
                        }
                    } else if (var528 < 2900) {
                        var6--;
                        class161 var67 = class331.method2308((byte) 4, class268.field4166[var6]);
                        if (var528 == 2800) {
                            class268.field4166[var6++] = client.method1012(var67).method34(32);
                            continue;
                        }
                        if (var528 == 2801) {
                            var6--;
                            int var68 = class268.field4166[var6];
                            int var530 = var68 - 1;
                            if (var67.field2448 != null && var67.field2448.length > var530 && var67.field2448[var530] != null) {
                                class207.field3175[var7++] = var67.field2448[var530];
                                continue;
                            }
                            class207.field3175[var7++] = "";
                            continue;
                        }
                        if (var528 == 2802) {
                            if (var67.field2545 == null) {
                                class207.field3175[var7++] = "";
                            } else {
                                class207.field3175[var7++] = var67.field2545;
                            }
                            continue;
                        }
                    } else if (var528 < 3200) {
                        if (var528 == 3100) {
                            var7--;
                            String var462 = class207.field3175[var7];
                            class262.method1840("", var462, 0, -67);
                            continue;
                        }
                        if (var528 == 3101) {
                            var6 -= 2;
                            class291.method2007(class268.field4166[var6], class268.field4166[var6 + 1], arg0 - 6656, class39.field575);
                            continue;
                        }
                        if (var528 == 3103) {
                            class214.method1529(190);
                            continue;
                        }
                        if (var528 == 3104) {
                            class305.field4757++;
                            int var463 = 0;
                            var7--;
                            String var464 = class207.field3175[var7];
                            if (class139.method1046(var464, (byte) -41)) {
                                var463 = class129.method990(var464, arg0 ^ 0x1993);
                            }
                            class85.field1236.method1141((byte) 97, 132);
                            class85.field1236.method1773(var463, false);
                            continue;
                        }
                        if (var528 == 3105) {
                            class144.field2205++;
                            var7--;
                            String var465 = class207.field3175[var7];
                            class85.field1236.method1141((byte) 87, 248);
                            class85.field1236.method1738((byte) 27, class49.method374(var465, -1));
                            continue;
                        }
                        if (var528 == 3106) {
                            class197.field3029++;
                            var7--;
                            String var466 = class207.field3175[var7];
                            class85.field1236.method1141((byte) 44, 222);
                            class85.field1236.method1752(var466.length() + 1, -121);
                            class85.field1236.method1766(0, var466);
                            continue;
                        }
                        if (var528 == 3107) {
                            var6--;
                            int var467 = class268.field4166[var6];
                            var7--;
                            String var468 = class207.field3175[var7];
                            class231.method1630(false, var468, var467);
                            continue;
                        }
                        if (var528 == 3108) {
                            var6 -= 3;
                            int var469 = class268.field4166[var6];
                            int var470 = class268.field4166[var6 + 2];
                            int var471 = class268.field4166[var6 + 1];
                            class161 var472 = class331.method2308((byte) -125, var470);
                            class229.method1616((byte) -115, var471, var469, var472);
                            continue;
                        }
                        if (var528 == 3109) {
                            class161 var473 = var46 ? class277.field4303 : class308.field4802;
                            var6 -= 2;
                            int var474 = class268.field4166[var6];
                            int var475 = class268.field4166[var6 + 1];
                            class229.method1616((byte) -72, var475, var474, var473);
                            continue;
                        }
                        if (var528 == 3110) {
                            var6--;
                            int var476 = class268.field4166[var6];
                            class32.field459++;
                            class85.field1236.method1141((byte) 62, 59);
                            class85.field1236.method1744(true, var476);
                            continue;
                        }
                    } else if (var528 < 3300) {
                        if (var528 == 3200) {
                            var6 -= 3;
                            class39.method302(class268.field4166[var6], 255, class268.field4166[var6 + 1], class268.field4166[var6 + 2], -24);
                            continue;
                        }
                        if (var528 == 3201) {
                            var6--;
                            class212.method1521(true, class268.field4166[var6], 255);
                            continue;
                        }
                        if (var528 == 3202) {
                            var6 -= 2;
                            class96.method719(255, 6387, class268.field4166[var6 + 1], class268.field4166[var6]);
                            continue;
                        }
                    } else if (var528 < 3400) {
                        if (var528 == 3300) {
                            class268.field4166[var6++] = class233.field3542;
                            continue;
                        }
                        if (var528 == 3301) {
                            var6 -= 2;
                            int var428 = class268.field4166[var6];
                            int var429 = class268.field4166[var6 + 1];
                            class268.field4166[var6++] = class171.method1290(var428, -85, var429);
                            continue;
                        }
                        if (var528 == 3302) {
                            var6 -= 2;
                            int var430 = class268.field4166[var6 + 1];
                            int var431 = class268.field4166[var6];
                            class268.field4166[var6++] = class298.method2056(var430, 0, var431);
                            continue;
                        }
                        if (var528 == 3303) {
                            var6 -= 2;
                            int var432 = class268.field4166[var6];
                            int var433 = class268.field4166[var6 + 1];
                            class268.field4166[var6++] = class76.method602(class181.method1355(arg0, 6533), var433, var432);
                            continue;
                        }
                        if (var528 == 3304) {
                            var6--;
                            int var434 = class268.field4166[var6];
                            class268.field4166[var6++] = class96.method720(true, var434).field581;
                            continue;
                        }
                        if (var528 == 3305) {
                            var6--;
                            int var435 = class268.field4166[var6];
                            class268.field4166[var6++] = class222.field3384[var435];
                            continue;
                        }
                        if (var528 == 3306) {
                            var6--;
                            int var436 = class268.field4166[var6];
                            class268.field4166[var6++] = class293.field4524[var436];
                            continue;
                        }
                        if (var528 == 3307) {
                            var6--;
                            int var437 = class268.field4166[var6];
                            class268.field4166[var6++] = class231.field3529[var437];
                            continue;
                        }
                        if (var528 == 3308) {
                            int var438 = class265.field4112;
                            int var439 = (class39.field575.field4731 >> 7) + class293.field4522;
                            int var440 = (class39.field575.field4713 >> 7) + class327.field5054;
                            class268.field4166[var6++] = (var438 << 28) + (var440 << 14) + var439;
                            continue;
                        }
                        if (var528 == 3309) {
                            var6--;
                            int var441 = class268.field4166[var6];
                            class268.field4166[var6++] = class149.method1117(var441 >> 14, 16383);
                            continue;
                        }
                        if (var528 == 3310) {
                            var6--;
                            int var442 = class268.field4166[var6];
                            class268.field4166[var6++] = var442 >> 28;
                            continue;
                        }
                        if (var528 == 3311) {
                            var6--;
                            int var443 = class268.field4166[var6];
                            class268.field4166[var6++] = class149.method1117(var443, 16383);
                            continue;
                        }
                        if (var528 == 3312) {
                            class268.field4166[var6++] = class205.field3152 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3313) {
                            var6 -= 2;
                            int var444 = class268.field4166[var6 + 1];
                            int var445 = class268.field4166[var6] + 32768;
                            class268.field4166[var6++] = class171.method1290(var445, class181.method1355(arg0, -6613), var444);
                            continue;
                        }
                        if (var528 == 3314) {
                            var6 -= 2;
                            int var446 = class268.field4166[var6 + 1];
                            int var447 = class268.field4166[var6] + 32768;
                            class268.field4166[var6++] = class298.method2056(var446, 0, var447);
                            continue;
                        }
                        if (var528 == 3315) {
                            var6 -= 2;
                            int var448 = class268.field4166[var6 + 1];
                            int var449 = class268.field4166[var6] + 32768;
                            class268.field4166[var6++] = class76.method602(0, var448, var449);
                            continue;
                        }
                        if (var528 == 3316) {
                            if (class295.field4546 >= 2) {
                                class268.field4166[var6++] = class295.field4546;
                            } else {
                                class268.field4166[var6++] = 0;
                            }
                            continue;
                        }
                        if (var528 == 3317) {
                            class268.field4166[var6++] = class223.field3414;
                            continue;
                        }
                        if (var528 == 3318) {
                            class268.field4166[var6++] = class224.field3424;
                            continue;
                        }
                        if (var528 == 3321) {
                            class268.field4166[var6++] = class1.field9;
                            continue;
                        }
                        if (var528 == 3322) {
                            class268.field4166[var6++] = class335.field5203;
                            continue;
                        }
                        if (var528 == 3323) {
                            if (class262.field4025 >= 5 && class262.field4025 <= 9) {
                                class268.field4166[var6++] = 1;
                                continue;
                            }
                            class268.field4166[var6++] = 0;
                            continue;
                        }
                        if (var528 == 3324) {
                            if (class262.field4025 >= 5 && class262.field4025 <= 9) {
                                class268.field4166[var6++] = class262.field4025;
                                continue;
                            }
                            class268.field4166[var6++] = 0;
                            continue;
                        }
                        if (var528 == 3325) {
                            class268.field4166[var6++] = class38.field558 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3326) {
                            class268.field4166[var6++] = class39.field575.field4203;
                            continue;
                        }
                        if (var528 == 3327) {
                            class268.field4166[var6++] = class39.field575.field4199.field4553 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3328) {
                            class268.field4166[var6++] = class2.field29 && !class161.field2454 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3329) {
                            class268.field4166[var6++] = class90.field1308 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3330) {
                            var6--;
                            int var450 = class268.field4166[var6];
                            class268.field4166[var6++] = class71.method503(var450, 782);
                            continue;
                        }
                        if (var528 == 3331) {
                            var6 -= 2;
                            int var451 = class268.field4166[var6];
                            int var452 = class268.field4166[var6 + 1];
                            class268.field4166[var6++] = class91.method659(var451, false, var452, (byte) -37);
                            continue;
                        }
                        if (var528 == 3332) {
                            var6 -= 2;
                            int var453 = class268.field4166[var6];
                            int var454 = class268.field4166[var6 + 1];
                            class268.field4166[var6++] = class91.method659(var453, true, var454, (byte) -26);
                            continue;
                        }
                        if (var528 == 3333) {
                            class268.field4166[var6++] = class297.field4579;
                            continue;
                        }
                        if (var528 == 3335) {
                            class268.field4166[var6++] = class81.field1197;
                            continue;
                        }
                        if (var528 == 3336) {
                            var6 -= 4;
                            int var455 = class268.field4166[var6];
                            int var456 = class268.field4166[var6 + 1];
                            int var457 = (var456 << 14) + var455;
                            int var458 = class268.field4166[var6 + 2];
                            int var459 = class268.field4166[var6 + 3];
                            int var460 = (var458 << 28) + var457;
                            int var461 = var459 + var460;
                            class268.field4166[var6++] = var461;
                            continue;
                        }
                        if (var528 == 3337) {
                            class268.field4166[var6++] = class76.field1109;
                            continue;
                        }
                    } else if (var528 < 3500) {
                        if (var528 == 3400) {
                            var6 -= 2;
                            int var411 = class268.field4166[var6];
                            int var412 = class268.field4166[var6 + 1];
                            class320 var413 = class325.method2258(25494, var411);
                            if (var413.field4936 == 's') {
                            }
                            class207.field3175[var7++] = var413.method2225(var412, false);
                            continue;
                        }
                        if (var528 == 3408) {
                            var6 -= 4;
                            int var414 = class268.field4166[var6 + 1];
                            int var415 = class268.field4166[var6];
                            int var416 = class268.field4166[var6 + 2];
                            int var417 = class268.field4166[var6 + 3];
                            class320 var418 = class325.method2258(25494, var416);
                            if (var418.field4952 == var415 && var418.field4936 == var414) {
                                if (var414 == 115) {
                                    class207.field3175[var7++] = var418.method2225(var417, false);
                                } else {
                                    class268.field4166[var6++] = var418.method2229(var417, 63);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var528 == 3409) {
                            var6 -= 3;
                            int var419 = class268.field4166[var6];
                            int var420 = class268.field4166[var6 + 1];
                            int var421 = class268.field4166[var6 + 2];
                            if (var420 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class320 var422 = class325.method2258(25494, var420);
                            if (var422.field4936 != var419) {
                                throw new RuntimeException("C3409-1");
                            }
                            class268.field4166[var6++] = var422.method2228(var421, (byte) -23) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3410) {
                            var6--;
                            int var423 = class268.field4166[var6];
                            var7--;
                            String var424 = class207.field3175[var7];
                            if (var423 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class320 var425 = class325.method2258(25494, var423);
                            if (var425.field4936 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            class268.field4166[var6++] = var425.method2220(var424, class181.method1355(arg0, 1639536213)) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3411) {
                            var6--;
                            int var426 = class268.field4166[var6];
                            class320 var427 = class325.method2258(25494, var426);
                            class268.field4166[var6++] = var427.field4944.method1710(true);
                            continue;
                        }
                    } else if (var528 < 3700) {
                        if (var528 == 3600) {
                            if (class102.field1474 == 0) {
                                class268.field4166[var6++] = -2;
                            } else if (class102.field1474 == 1) {
                                class268.field4166[var6++] = -1;
                            } else {
                                class268.field4166[var6++] = class159.field2416;
                            }
                            continue;
                        }
                        if (var528 == 3601) {
                            var6--;
                            int var387 = class268.field4166[var6];
                            if (class102.field1474 == 2 && var387 < class159.field2416) {
                                class207.field3175[var7++] = class309.field4819[var387];
                                continue;
                            }
                            class207.field3175[var7++] = "";
                            continue;
                        }
                        if (var528 == 3602) {
                            var6--;
                            int var388 = class268.field4166[var6];
                            if (class102.field1474 == 2 && var388 < class159.field2416) {
                                class268.field4166[var6++] = class238.field3626[var388];
                                continue;
                            }
                            class268.field4166[var6++] = 0;
                            continue;
                        }
                        if (var528 == 3603) {
                            var6--;
                            int var389 = class268.field4166[var6];
                            if (class102.field1474 == 2 && var389 < class159.field2416) {
                                class268.field4166[var6++] = class97.field1392[var389];
                                continue;
                            }
                            class268.field4166[var6++] = 0;
                            continue;
                        }
                        if (var528 == 3604) {
                            var6--;
                            int var390 = class268.field4166[var6];
                            var7--;
                            String var391 = class207.field3175[var7];
                            class72.method514(var390, (byte) -8, var391);
                            continue;
                        }
                        if (var528 == 3605) {
                            var7--;
                            String var392 = class207.field3175[var7];
                            class167.method1265(class49.method374(var392, arg0 ^ 0xFFFFE67A), 0);
                            continue;
                        }
                        if (var528 == 3606) {
                            var7--;
                            String var393 = class207.field3175[var7];
                            class101.method762(class49.method374(var393, -1), (byte) 119);
                            continue;
                        }
                        if (var528 == 3607) {
                            var7--;
                            String var394 = class207.field3175[var7];
                            class302.method2075(class49.method374(var394, -1), false, true);
                            continue;
                        }
                        if (var528 == 3608) {
                            var7--;
                            String var395 = class207.field3175[var7];
                            class91.method658((byte) -126, class49.method374(var395, -1));
                            continue;
                        }
                        if (var528 == 3609) {
                            var7--;
                            String var396 = class207.field3175[var7];
                            if (var396.startsWith("<img=0>") || var396.startsWith("<img=1>")) {
                                var396 = var396.substring(7);
                            }
                            class268.field4166[var6++] = class97.method727(var396, false) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3610) {
                            var6--;
                            int var397 = class268.field4166[var6];
                            if (class102.field1474 == 2 && var397 < class159.field2416) {
                                class207.field3175[var7++] = class314.field4875[var397];
                                continue;
                            }
                            class207.field3175[var7++] = "";
                            continue;
                        }
                        if (var528 == 3611) {
                            if (class223.field3400 == null) {
                                class207.field3175[var7++] = "";
                            } else {
                                class207.field3175[var7++] = class61.method424(class223.field3400, -124);
                            }
                            continue;
                        }
                        if (var528 == 3612) {
                            if (class223.field3400 == null) {
                                class268.field4166[var6++] = 0;
                            } else {
                                class268.field4166[var6++] = class333.field5190;
                            }
                            continue;
                        }
                        if (var528 == 3613) {
                            var6--;
                            int var398 = class268.field4166[var6];
                            if (class223.field3400 != null && var398 < class333.field5190) {
                                class207.field3175[var7++] = class61.method424(class36.field524[var398].field3360, -93);
                                continue;
                            }
                            class207.field3175[var7++] = "";
                            continue;
                        }
                        if (var528 == 3614) {
                            var6--;
                            int var399 = class268.field4166[var6];
                            if (class223.field3400 != null && class333.field5190 > var399) {
                                class268.field4166[var6++] = class36.field524[var399].field3366;
                                continue;
                            }
                            class268.field4166[var6++] = 0;
                            continue;
                        }
                        if (var528 == 3615) {
                            var6--;
                            int var400 = class268.field4166[var6];
                            if (class223.field3400 != null && class333.field5190 > var400) {
                                class268.field4166[var6++] = class36.field524[var400].field3367;
                                continue;
                            }
                            class268.field4166[var6++] = 0;
                            continue;
                        }
                        if (var528 == 3616) {
                            class268.field4166[var6++] = class241.field3677;
                            continue;
                        }
                        if (var528 == 3617) {
                            var7--;
                            String var401 = class207.field3175[var7];
                            class151.method1138(true, var401);
                            continue;
                        }
                        if (var528 == 3618) {
                            class268.field4166[var6++] = class209.field3198;
                            continue;
                        }
                        if (var528 == 3619) {
                            var7--;
                            String var402 = class207.field3175[var7];
                            class97.method723((byte) 79, class49.method374(var402, arg0 - 6534));
                            continue;
                        }
                        if (var528 == 3620) {
                            class162.method1219(45);
                            continue;
                        }
                        if (var528 == 3621) {
                            if (class102.field1474 == 0) {
                                class268.field4166[var6++] = -1;
                            } else {
                                class268.field4166[var6++] = class153.field2321;
                            }
                            continue;
                        }
                        if (var528 == 3622) {
                            var6--;
                            int var403 = class268.field4166[var6];
                            if (class102.field1474 != 0 && class153.field2321 > var403) {
                                class207.field3175[var7++] = class336.method2344(23827, class162.field2626[var403]);
                                continue;
                            }
                            class207.field3175[var7++] = "";
                            continue;
                        }
                        if (var528 == 3623) {
                            var7--;
                            String var404 = class207.field3175[var7];
                            if (var404.startsWith("<img=0>") || var404.startsWith("<img=1>")) {
                                var404 = var404.substring(7);
                            }
                            class268.field4166[var6++] = class56.method404((byte) -82, var404) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3624) {
                            var6--;
                            int var405 = class268.field4166[var6];
                            if (class36.field524 != null && var405 < class333.field5190 && class36.field524[var405].field3360.equalsIgnoreCase(class39.field575.field4218)) {
                                class268.field4166[var6++] = 1;
                                continue;
                            }
                            class268.field4166[var6++] = 0;
                            continue;
                        }
                        if (var528 == 3625) {
                            if (class137.field2063 == null) {
                                class207.field3175[var7++] = "";
                            } else {
                                class207.field3175[var7++] = class61.method424(class137.field2063, -85);
                            }
                            continue;
                        }
                        if (var528 == 3626) {
                            var6--;
                            int var406 = class268.field4166[var6];
                            if (class223.field3400 != null && var406 < class333.field5190) {
                                class207.field3175[var7++] = class36.field524[var406].field3365;
                                continue;
                            }
                            class207.field3175[var7++] = "";
                            continue;
                        }
                        if (var528 == 3627) {
                            var6--;
                            int var407 = class268.field4166[var6];
                            if (class102.field1474 == 2 && var407 >= 0 && class159.field2416 > var407) {
                                class268.field4166[var6++] = class330.field5070[var407] ? 1 : 0;
                                continue;
                            }
                            class268.field4166[var6++] = 0;
                            continue;
                        }
                        if (var528 == 3628) {
                            var7--;
                            String var408 = class207.field3175[var7];
                            if (var408.startsWith("<img=0>") || var408.startsWith("<img=1>")) {
                                var408 = var408.substring(7);
                            }
                            class268.field4166[var6++] = class72.method512((byte) -3, var408);
                            continue;
                        }
                        if (var528 == 3629) {
                            class268.field4166[var6++] = class25.field288;
                            continue;
                        }
                        if (var528 == 3630) {
                            var7--;
                            String var409 = class207.field3175[var7];
                            class302.method2075(class49.method374(var409, -1), true, true);
                            continue;
                        }
                        if (var528 == 3631) {
                            var6--;
                            int var410 = class268.field4166[var6];
                            class268.field4166[var6++] = class339.field5266[var410] ? 1 : 0;
                            continue;
                        }
                    } else if (var528 < 4000) {
                        if (var528 == 3903) {
                            var6--;
                            int var69 = class268.field4166[var6];
                            class268.field4166[var6++] = client.field1989[var69].method1668((byte) 126);
                            continue;
                        }
                        if (var528 == 3904) {
                            var6--;
                            int var70 = class268.field4166[var6];
                            class268.field4166[var6++] = client.field1989[var70].field3656;
                            continue;
                        }
                        if (var528 == 3905) {
                            var6--;
                            int var71 = class268.field4166[var6];
                            class268.field4166[var6++] = client.field1989[var71].field3661;
                            continue;
                        }
                        if (var528 == 3906) {
                            var6--;
                            int var72 = class268.field4166[var6];
                            class268.field4166[var6++] = client.field1989[var72].field3654;
                            continue;
                        }
                        if (var528 == 3907) {
                            var6--;
                            int var73 = class268.field4166[var6];
                            class268.field4166[var6++] = client.field1989[var73].field3659;
                            continue;
                        }
                        if (var528 == 3908) {
                            var6--;
                            int var74 = class268.field4166[var6];
                            class268.field4166[var6++] = client.field1989[var74].field3660;
                            continue;
                        }
                        if (var528 == 3910) {
                            var6--;
                            int var75 = class268.field4166[var6];
                            int var76 = client.field1989[var75].method1670((byte) 43);
                            class268.field4166[var6++] = var76 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3911) {
                            var6--;
                            int var77 = class268.field4166[var6];
                            int var78 = client.field1989[var77].method1670((byte) 43);
                            class268.field4166[var6++] = var78 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3912) {
                            var6--;
                            int var79 = class268.field4166[var6];
                            int var80 = client.field1989[var79].method1670((byte) 43);
                            class268.field4166[var6++] = var80 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3913) {
                            var6--;
                            int var81 = class268.field4166[var6];
                            int var82 = client.field1989[var81].method1670((byte) 43);
                            class268.field4166[var6++] = var82 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var528 < 4100) {
                        if (var528 == 4000) {
                            var6 -= 2;
                            int var342 = class268.field4166[var6];
                            int var343 = class268.field4166[var6 + 1];
                            class268.field4166[var6++] = var342 + var343;
                            continue;
                        }
                        if (var528 == 4001) {
                            var6 -= 2;
                            int var344 = class268.field4166[var6];
                            int var345 = class268.field4166[var6 + 1];
                            class268.field4166[var6++] = var344 - var345;
                            continue;
                        }
                        if (var528 == 4002) {
                            var6 -= 2;
                            int var346 = class268.field4166[var6 + 1];
                            int var347 = class268.field4166[var6];
                            class268.field4166[var6++] = var346 * var347;
                            continue;
                        }
                        if (var528 == 4003) {
                            var6 -= 2;
                            int var348 = class268.field4166[var6];
                            int var349 = class268.field4166[var6 + 1];
                            class268.field4166[var6++] = var348 / var349;
                            continue;
                        }
                        if (var528 == 4004) {
                            var6--;
                            int var350 = class268.field4166[var6];
                            class268.field4166[var6++] = (int) ((double) var350 * Math.random());
                            continue;
                        }
                        if (var528 == 4005) {
                            var6--;
                            int var351 = class268.field4166[var6];
                            class268.field4166[var6++] = (int) ((double) (var351 + 1) * Math.random());
                            continue;
                        }
                        if (var528 == 4006) {
                            var6 -= 5;
                            int var352 = class268.field4166[var6];
                            int var353 = class268.field4166[var6 + 1];
                            int var354 = class268.field4166[var6 + 2];
                            int var355 = class268.field4166[var6 + 3];
                            int var356 = class268.field4166[var6 + 4];
                            class268.field4166[var6++] = var352 + ((var353 - var352) * (var356 - var354) / (var355 - var354));
                            continue;
                        }
                        if (var528 == 4007) {
                            var6 -= 2;
                            long var357 = (long) class268.field4166[var6 + 1];
                            long var359 = (long) class268.field4166[var6];
                            class268.field4166[var6++] = (int) (var359 + (var357 * var359 / 100L));
                            continue;
                        }
                        if (var528 == 4008) {
                            var6 -= 2;
                            int var361 = class268.field4166[var6 + 1];
                            int var362 = class268.field4166[var6];
                            class268.field4166[var6++] = class261.method1835(var362, 0x1 << var361);
                            continue;
                        }
                        if (var528 == 4009) {
                            var6 -= 2;
                            int var363 = class268.field4166[var6 + 1];
                            int var364 = class268.field4166[var6];
                            class268.field4166[var6++] = class149.method1117(-(0x1 << var363) - 1, var364);
                            continue;
                        }
                        if (var528 == 4010) {
                            var6 -= 2;
                            int var365 = class268.field4166[var6];
                            int var366 = class268.field4166[var6 + 1];
                            class268.field4166[var6++] = class149.method1117(var365, 0x1 << var366) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var528 == 4011) {
                            var6 -= 2;
                            int var367 = class268.field4166[var6];
                            int var368 = class268.field4166[var6 + 1];
                            class268.field4166[var6++] = var367 % var368;
                            continue;
                        }
                        if (var528 == 4012) {
                            var6 -= 2;
                            int var369 = class268.field4166[var6];
                            int var370 = class268.field4166[var6 + 1];
                            if (var369 == 0) {
                                class268.field4166[var6++] = 0;
                            } else {
                                class268.field4166[var6++] = (int) Math.pow((double) var369, (double) var370);
                            }
                            continue;
                        }
                        if (var528 == 4013) {
                            var6 -= 2;
                            int var371 = class268.field4166[var6];
                            int var372 = class268.field4166[var6 + 1];
                            if (var371 == 0) {
                                class268.field4166[var6++] = 0;
                            } else if (var372 == 0) {
                                class268.field4166[var6++] = Integer.MAX_VALUE;
                            } else {
                                class268.field4166[var6++] = (int) Math.pow((double) var371, 1.0D / (double) var372);
                            }
                            continue;
                        }
                        if (var528 == 4014) {
                            var6 -= 2;
                            int var373 = class268.field4166[var6];
                            int var374 = class268.field4166[var6 + 1];
                            class268.field4166[var6++] = class149.method1117(var374, var373);
                            continue;
                        }
                        if (var528 == 4015) {
                            var6 -= 2;
                            int var375 = class268.field4166[var6];
                            int var376 = class268.field4166[var6 + 1];
                            class268.field4166[var6++] = class261.method1835(var375, var376);
                            continue;
                        }
                        if (var528 == 4016) {
                            var6 -= 2;
                            int var377 = class268.field4166[var6];
                            int var378 = class268.field4166[var6 + 1];
                            class268.field4166[var6++] = var377 >= var378 ? var378 : var377;
                            continue;
                        }
                        if (var528 == 4017) {
                            var6 -= 2;
                            int var379 = class268.field4166[var6];
                            int var380 = class268.field4166[var6 + 1];
                            class268.field4166[var6++] = var380 < var379 ? var379 : var380;
                            continue;
                        }
                        if (var528 == 4018) {
                            var6 -= 3;
                            long var381 = (long) class268.field4166[var6];
                            long var383 = (long) class268.field4166[var6 + 1];
                            long var385 = (long) class268.field4166[var6 + 2];
                            class268.field4166[var6++] = (int) (var381 * var385 / var383);
                            continue;
                        }
                    } else if (var528 < 4200) {
                        if (var528 == 4100) {
                            var7--;
                            String var292 = class207.field3175[var7];
                            var6--;
                            int var293 = class268.field4166[var6];
                            class207.field3175[var7++] = var292 + var293;
                            continue;
                        }
                        if (var528 == 4101) {
                            var7 -= 2;
                            String var294 = class207.field3175[var7];
                            String var295 = class207.field3175[var7 + 1];
                            class207.field3175[var7++] = var294 + var295;
                            continue;
                        }
                        if (var528 == 4102) {
                            var7--;
                            String var296 = class207.field3175[var7];
                            var6--;
                            int var297 = class268.field4166[var6];
                            class207.field3175[var7++] = var296 + class49.method372(var297, false, true);
                            continue;
                        }
                        if (var528 == 4103) {
                            var7--;
                            String var298 = class207.field3175[var7];
                            class207.field3175[var7++] = var298.toLowerCase();
                            continue;
                        }
                        if (var528 == 4104) {
                            var6--;
                            int var299 = class268.field4166[var6];
                            long var300 = ((long) var299 + 11745L) * 86400000L;
                            class182.field2884.setTime(new Date(var300));
                            int var302 = class182.field2884.get(5);
                            int var303 = class182.field2884.get(2);
                            int var304 = class182.field2884.get(1);
                            class207.field3175[var7++] = var302 + "-" + class200.field3042[var303] + "-" + var304;
                            continue;
                        }
                        if (var528 == 4105) {
                            var7 -= 2;
                            String var305 = class207.field3175[var7];
                            String var306 = class207.field3175[var7 + 1];
                            if (class39.field575.field4199 != null && class39.field575.field4199.field4553) {
                                class207.field3175[var7++] = var306;
                                continue;
                            }
                            class207.field3175[var7++] = var305;
                            continue;
                        }
                        if (var528 == 4106) {
                            var6--;
                            int var307 = class268.field4166[var6];
                            class207.field3175[var7++] = Integer.toString(var307);
                            continue;
                        }
                        if (var528 == 4107) {
                            var7 -= 2;
                            class268.field4166[var6++] = class290.method2003((byte) -107, class299.method2063(class207.field3175[var7 + 1], class181.method1355(arg0, -6534), class207.field3175[var7], class81.field1197));
                            continue;
                        }
                        if (var528 == 4108) {
                            var6 -= 2;
                            var7--;
                            String var308 = class207.field3175[var7];
                            int var309 = class268.field4166[var6 + 1];
                            int var310 = class268.field4166[var6];
                            class268.field4166[var6++] = class76.method600(6, var309).method2259(var308, var310);
                            continue;
                        }
                        if (var528 == 4109) {
                            var6 -= 2;
                            var7--;
                            String var311 = class207.field3175[var7];
                            int var312 = class268.field4166[var6 + 1];
                            int var313 = class268.field4166[var6];
                            class268.field4166[var6++] = class76.method600(6, var312).method2273(var311, var313);
                            continue;
                        }
                        if (var528 == 4110) {
                            var7 -= 2;
                            String var314 = class207.field3175[var7];
                            String var315 = class207.field3175[var7 + 1];
                            var6--;
                            if (class268.field4166[var6] == 1) {
                                class207.field3175[var7++] = var314;
                            } else {
                                class207.field3175[var7++] = var315;
                            }
                            continue;
                        }
                        if (var528 == 4111) {
                            var7--;
                            String var316 = class207.field3175[var7];
                            class207.field3175[var7++] = class326.method2263(var316);
                            continue;
                        }
                        if (var528 == 4112) {
                            var6--;
                            int var317 = class268.field4166[var6];
                            var7--;
                            String var318 = class207.field3175[var7];
                            if (var317 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class207.field3175[var7++] = var318 + (char) var317;
                            continue;
                        }
                        if (var528 == 4113) {
                            var6--;
                            int var319 = class268.field4166[var6];
                            class268.field4166[var6++] = class280.method1937((byte) -124, (char) var319) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4114) {
                            var6--;
                            int var320 = class268.field4166[var6];
                            class268.field4166[var6++] = class314.method2146(-50, (char) var320) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4115) {
                            var6--;
                            int var321 = class268.field4166[var6];
                            class268.field4166[var6++] = class138.method1042((char) var321, 31451) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4116) {
                            var6--;
                            int var322 = class268.field4166[var6];
                            class268.field4166[var6++] = class238.method1661(-13287, (char) var322) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4117) {
                            var7--;
                            String var323 = class207.field3175[var7];
                            if (var323 == null) {
                                class268.field4166[var6++] = 0;
                            } else {
                                class268.field4166[var6++] = var323.length();
                            }
                            continue;
                        }
                        if (var528 == 4118) {
                            var6 -= 2;
                            var7--;
                            String var324 = class207.field3175[var7];
                            int var325 = class268.field4166[var6 + 1];
                            int var326 = class268.field4166[var6];
                            class207.field3175[var7++] = var324.substring(var326, var325);
                            continue;
                        }
                        if (var528 == 4119) {
                            boolean var327 = false;
                            var7--;
                            String var328 = class207.field3175[var7];
                            StringBuffer var329 = new StringBuffer(var328.length());
                            for (int var330 = 0; var330 < var328.length(); var330++) {
                                char var331 = var328.charAt(var330);
                                if (var331 == '<') {
                                    var327 = true;
                                } else if (var331 == '>') {
                                    var327 = false;
                                } else if (!var327) {
                                    var329.append(var331);
                                }
                            }
                            class207.field3175[var7++] = var329.toString();
                            continue;
                        }
                        if (var528 == 4120) {
                            var6 -= 2;
                            int var332 = class268.field4166[var6 + 1];
                            var7--;
                            String var333 = class207.field3175[var7];
                            int var334 = class268.field4166[var6];
                            class268.field4166[var6++] = var333.indexOf(var334, var332);
                            continue;
                        }
                        if (var528 == 4121) {
                            var7 -= 2;
                            String var335 = class207.field3175[var7];
                            String var336 = class207.field3175[var7 + 1];
                            var6--;
                            int var337 = class268.field4166[var6];
                            class268.field4166[var6++] = var335.indexOf(var336, var337);
                            continue;
                        }
                        if (var528 == 4122) {
                            var6--;
                            int var338 = class268.field4166[var6];
                            class268.field4166[var6++] = Character.toLowerCase((char) var338);
                            continue;
                        }
                        if (var528 == 4123) {
                            var6--;
                            int var339 = class268.field4166[var6];
                            class268.field4166[var6++] = Character.toUpperCase((char) var339);
                            continue;
                        }
                        if (var528 == 4124) {
                            var6--;
                            boolean var340 = class268.field4166[var6] != 0;
                            var6--;
                            int var341 = class268.field4166[var6];
                            class207.field3175[var7++] = class49.method377(var340, 48, 0, (long) var341, class81.field1197);
                            continue;
                        }
                    } else if (var528 < 4300) {
                        if (var528 == 4200) {
                            var6--;
                            int var273 = class268.field4166[var6];
                            class207.field3175[var7++] = class222.method1576(var273, (byte) 92).field1630;
                            continue;
                        }
                        if (var528 == 4201) {
                            var6 -= 2;
                            int var274 = class268.field4166[var6];
                            int var275 = class268.field4166[var6 + 1];
                            class108 var276 = class222.method1576(var274, (byte) 92);
                            if (var275 >= 1 && var275 <= 5 && var276.field1595[var275 - 1] != null) {
                                class207.field3175[var7++] = var276.field1595[var275 - 1];
                                continue;
                            }
                            class207.field3175[var7++] = "";
                            continue;
                        }
                        if (var528 == 4202) {
                            var6 -= 2;
                            int var277 = class268.field4166[var6];
                            int var278 = class268.field4166[var6 + 1];
                            class108 var279 = class222.method1576(var277, (byte) 92);
                            if (var278 >= 1 && var278 <= 5 && var279.field1611[var278 - 1] != null) {
                                class207.field3175[var7++] = var279.field1611[var278 - 1];
                                continue;
                            }
                            class207.field3175[var7++] = "";
                            continue;
                        }
                        if (var528 == 4203) {
                            var6--;
                            int var280 = class268.field4166[var6];
                            class268.field4166[var6++] = class222.method1576(var280, (byte) 92).field1639;
                            continue;
                        }
                        if (var528 == 4204) {
                            var6--;
                            int var281 = class268.field4166[var6];
                            class268.field4166[var6++] = class222.method1576(var281, (byte) 92).field1583 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4205) {
                            var6--;
                            int var282 = class268.field4166[var6];
                            class108 var283 = class222.method1576(var282, (byte) 92);
                            if (var283.field1571 == -1 && var283.field1580 >= 0) {
                                class268.field4166[var6++] = var283.field1580;
                                continue;
                            }
                            class268.field4166[var6++] = var282;
                            continue;
                        }
                        if (var528 == 4206) {
                            var6--;
                            int var284 = class268.field4166[var6];
                            class108 var285 = class222.method1576(var284, (byte) 92);
                            if (var285.field1571 >= 0 && var285.field1580 >= 0) {
                                class268.field4166[var6++] = var285.field1580;
                                continue;
                            }
                            class268.field4166[var6++] = var284;
                            continue;
                        }
                        if (var528 == 4207) {
                            var6--;
                            int var286 = class268.field4166[var6];
                            class268.field4166[var6++] = class222.method1576(var286, (byte) 92).field1575 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4208) {
                            var6 -= 2;
                            int var287 = class268.field4166[var6 + 1];
                            int var288 = class268.field4166[var6];
                            class21 var289 = class111.method851(var287, 11);
                            if (var289.method166(-127)) {
                                class207.field3175[var7++] = class222.method1576(var288, (byte) 92).method815(31792, var289.field240, var287);
                            } else {
                                class268.field4166[var6++] = class222.method1576(var288, (byte) 92).method822((byte) 87, var287, var289.field239);
                            }
                            continue;
                        }
                        if (var528 == 4210) {
                            var6--;
                            int var290 = class268.field4166[var6];
                            var7--;
                            String var291 = class207.field3175[var7];
                            class278.method1930(false, var291, var290 == 1);
                            class268.field4166[var6++] = class191.field2985;
                            continue;
                        }
                        if (var528 == 4211) {
                            if (class23.field257 != null && class43.field622 < class191.field2985) {
                                class268.field4166[var6++] = class149.method1117(65535, class23.field257[class43.field622++]);
                                continue;
                            }
                            class268.field4166[var6++] = -1;
                            continue;
                        }
                        if (var528 == 4212) {
                            class43.field622 = 0;
                            continue;
                        }
                    } else if (var528 < 4400) {
                        if (var528 == 4300) {
                            var6 -= 2;
                            int var83 = class268.field4166[var6 + 1];
                            int var84 = class268.field4166[var6];
                            class21 var85 = class111.method851(var83, 11);
                            if (var85.method166(-127)) {
                                class207.field3175[var7++] = class242.method1676(var84, 64).method2317(var85.field240, 103, var83);
                            } else {
                                class268.field4166[var6++] = class242.method1676(var84, arg0 - 6469).method2314(var85.field239, var83, (byte) 115);
                            }
                            continue;
                        }
                    } else if (var528 < 4500) {
                        if (var528 == 4400) {
                            var6 -= 2;
                            int var86 = class268.field4166[var6];
                            int var87 = class268.field4166[var6 + 1];
                            class21 var88 = class111.method851(var87, 11);
                            if (var88.method166(-127)) {
                                class207.field3175[var7++] = class226.method1607(-128, var86).method258(true, var88.field240, var87);
                            } else {
                                class268.field4166[var6++] = class226.method1607(class181.method1355(arg0, 6643), var86).method249(var88.field239, (byte) 126, var87);
                            }
                            continue;
                        }
                    } else if (var528 >= 4600) {
                        if (var528 < 5100) {
                            if (var528 == 5000) {
                                class268.field4166[var6++] = class130.field2001;
                                continue;
                            }
                            if (var528 == 5001) {
                                class1.field21++;
                                var6 -= 3;
                                class130.field2001 = class268.field4166[var6];
                                class248.field3731 = class268.field4166[var6 + 1];
                                class61.field822 = class268.field4166[var6 + 2];
                                class85.field1236.method1141((byte) 75, 182);
                                class85.field1236.method1752(class130.field2001, -101);
                                class85.field1236.method1752(class248.field3731, -125);
                                class85.field1236.method1752(class61.field822, -88);
                                continue;
                            }
                            if (var528 == 5002) {
                                var7--;
                                String var89 = class207.field3175[var7];
                                var6 -= 2;
                                class101.field1451++;
                                int var90 = class268.field4166[var6];
                                int var91 = class268.field4166[var6 + 1];
                                class85.field1236.method1141((byte) 71, 228);
                                class85.field1236.method1738((byte) 45, class49.method374(var89, -1));
                                class85.field1236.method1752(var90 - 1, -82);
                                class85.field1236.method1752(var91, -83);
                                continue;
                            }
                            if (var528 == 5003) {
                                String var92 = null;
                                var6--;
                                int var93 = class268.field4166[var6];
                                if (var93 < 100) {
                                    var92 = class79.field1152[var93];
                                }
                                if (var92 == null) {
                                    var92 = "";
                                }
                                class207.field3175[var7++] = var92;
                                continue;
                            }
                            if (var528 == 5004) {
                                var6--;
                                int var94 = class268.field4166[var6];
                                int var95 = -1;
                                if (var94 < 100 && class79.field1152[var94] != null) {
                                    var95 = class131.field2004[var94];
                                }
                                class268.field4166[var6++] = var95;
                                continue;
                            }
                            if (var528 == 5005) {
                                class268.field4166[var6++] = class248.field3731;
                                continue;
                            }
                            if (var528 == 5008) {
                                var7--;
                                String var96 = class207.field3175[var7];
                                if (!var96.startsWith("::")) {
                                    if (class295.field4546 == 0 && (class2.field29 && !class161.field2454 || class90.field1308)) {
                                        continue;
                                    }
                                    String var97 = var96.toLowerCase();
                                    class32.field431++;
                                    byte var98 = 0;
                                    byte var99 = 0;
                                    if (var97.startsWith(class100.field1449)) {
                                        var99 = 0;
                                        var96 = var96.substring(class100.field1449.length());
                                    } else if (var97.startsWith(class101.field1465)) {
                                        var96 = var96.substring(class101.field1465.length());
                                        var99 = 1;
                                    } else if (var97.startsWith(class147.field2241)) {
                                        var99 = 2;
                                        var96 = var96.substring(class147.field2241.length());
                                    } else if (var97.startsWith(class263.field4050)) {
                                        var99 = 3;
                                        var96 = var96.substring(class263.field4050.length());
                                    } else if (var97.startsWith(class206.field3158)) {
                                        var96 = var96.substring(class206.field3158.length());
                                        var99 = 4;
                                    } else if (var97.startsWith(class102.field1478)) {
                                        var99 = 5;
                                        var96 = var96.substring(class102.field1478.length());
                                    } else if (var97.startsWith(class1.field13)) {
                                        var99 = 6;
                                        var96 = var96.substring(class1.field13.length());
                                    } else if (var97.startsWith(class72.field1031)) {
                                        var99 = 7;
                                        var96 = var96.substring(class72.field1031.length());
                                    } else if (var97.startsWith(class214.field3286)) {
                                        var96 = var96.substring(class214.field3286.length());
                                        var99 = 8;
                                    } else if (var97.startsWith(class77.field1119)) {
                                        var96 = var96.substring(class77.field1119.length());
                                        var99 = 9;
                                    } else if (var97.startsWith(class37.field529)) {
                                        var96 = var96.substring(class37.field529.length());
                                        var99 = 10;
                                    } else if (var97.startsWith(class122.field1868)) {
                                        var96 = var96.substring(class122.field1868.length());
                                        var99 = 11;
                                    } else if (class81.field1197 != 0) {
                                        if (var97.startsWith(class97.field1397)) {
                                            var99 = 0;
                                            var96 = var96.substring(class97.field1397.length());
                                        } else if (var97.startsWith(class77.field1127)) {
                                            var99 = 1;
                                            var96 = var96.substring(class77.field1127.length());
                                        } else if (var97.startsWith(class133.field2029)) {
                                            var99 = 2;
                                            var96 = var96.substring(class133.field2029.length());
                                        } else if (var97.startsWith(class284.field4426)) {
                                            var96 = var96.substring(class284.field4426.length());
                                            var99 = 3;
                                        } else if (var97.startsWith(class323.field4999)) {
                                            var99 = 4;
                                            var96 = var96.substring(class323.field4999.length());
                                        } else if (var97.startsWith(class129.field1972)) {
                                            var99 = 5;
                                            var96 = var96.substring(class129.field1972.length());
                                        } else if (var97.startsWith(class225.field3432)) {
                                            var96 = var96.substring(class225.field3432.length());
                                            var99 = 6;
                                        } else if (var97.startsWith(class41.field599)) {
                                            var99 = 7;
                                            var96 = var96.substring(class41.field599.length());
                                        } else if (var97.startsWith(class268.field4161)) {
                                            var99 = 8;
                                            var96 = var96.substring(class268.field4161.length());
                                        } else if (var97.startsWith(class335.field5219)) {
                                            var96 = var96.substring(class335.field5219.length());
                                            var99 = 9;
                                        } else if (var97.startsWith(class137.field2072)) {
                                            var99 = 10;
                                            var96 = var96.substring(class137.field2072.length());
                                        } else if (var97.startsWith(class228.field3481)) {
                                            var99 = 11;
                                            var96 = var96.substring(class228.field3481.length());
                                        }
                                    }
                                    String var100 = var96.toLowerCase();
                                    if (var100.startsWith(class341.field5289)) {
                                        var98 = 1;
                                        var96 = var96.substring(class341.field5289.length());
                                    } else if (var100.startsWith(class251.field3802)) {
                                        var96 = var96.substring(class251.field3802.length());
                                        var98 = 2;
                                    } else if (var100.startsWith(class181.field2869)) {
                                        var96 = var96.substring(class181.field2869.length());
                                        var98 = 3;
                                    } else if (var100.startsWith(class139.field2085)) {
                                        var96 = var96.substring(class139.field2085.length());
                                        var98 = 4;
                                    } else if (var100.startsWith(class31.field383)) {
                                        var96 = var96.substring(class31.field383.length());
                                        var98 = 5;
                                    } else if (class81.field1197 != 0) {
                                        if (var100.startsWith(class170.field2756)) {
                                            var98 = 1;
                                            var96 = var96.substring(class170.field2756.length());
                                        } else if (var100.startsWith(class332.field5153)) {
                                            var98 = 2;
                                            var96 = var96.substring(class332.field5153.length());
                                        } else if (var100.startsWith(class237.field3603)) {
                                            var96 = var96.substring(class237.field3603.length());
                                            var98 = 3;
                                        } else if (var100.startsWith(class98.field1407)) {
                                            var96 = var96.substring(class98.field1407.length());
                                            var98 = 4;
                                        } else if (var100.startsWith(class222.field3382)) {
                                            var98 = 5;
                                            var96 = var96.substring(class222.field3382.length());
                                        }
                                    }
                                    class85.field1236.method1141((byte) 33, 159);
                                    class85.field1236.method1752(0, -99);
                                    int var101 = class85.field1236.field3866;
                                    class85.field1236.method1752(var99, -97);
                                    class85.field1236.method1752(var98, arg0 - 6639);
                                    class322.method2237((byte) -10, class85.field1236, var96);
                                    class85.field1236.method1767(class85.field1236.field3866 - var101, 791705512);
                                    continue;
                                }
                                class110.method842(var96, -23198);
                                continue;
                            }
                            if (var528 == 5009) {
                                var7 -= 2;
                                String var102 = class207.field3175[var7];
                                String var103 = class207.field3175[var7 + 1];
                                if (class295.field4546 != 0 || (!class2.field29 || class161.field2454) && !class90.field1308) {
                                    class298.field4588++;
                                    class85.field1236.method1141((byte) 44, 218);
                                    class85.field1236.method1752(0, arg0 - 6642);
                                    int var104 = class85.field1236.field3866;
                                    class85.field1236.method1738((byte) 120, class49.method374(var102, -1));
                                    class322.method2237((byte) -68, class85.field1236, var103);
                                    class85.field1236.method1767(class85.field1236.field3866 - var104, 791705512);
                                }
                                continue;
                            }
                            if (var528 == 5010) {
                                var6--;
                                int var105 = class268.field4166[var6];
                                String var106 = null;
                                if (var105 < 100) {
                                    var106 = class280.field4344[var105];
                                }
                                if (var106 == null) {
                                    var106 = "";
                                }
                                class207.field3175[var7++] = var106;
                                continue;
                            }
                            if (var528 == 5011) {
                                var6--;
                                int var107 = class268.field4166[var6];
                                String var108 = null;
                                if (var107 < 100) {
                                    var108 = class160.field2430[var107];
                                }
                                if (var108 == null) {
                                    var108 = "";
                                }
                                class207.field3175[var7++] = var108;
                                continue;
                            }
                            if (var528 == 5012) {
                                int var109 = -1;
                                var6--;
                                int var110 = class268.field4166[var6];
                                if (var110 < 100) {
                                    var109 = class148.field2248[var110];
                                }
                                class268.field4166[var6++] = var109;
                                continue;
                            }
                            if (var528 == 5015) {
                                String var111;
                                if (class39.field575 == null || class39.field575.field4218 == null) {
                                    var111 = class160.field2432;
                                } else {
                                    var111 = class39.field575.method1895(1958408711);
                                }
                                class207.field3175[var7++] = var111;
                                continue;
                            }
                            if (var528 == 5016) {
                                class268.field4166[var6++] = class61.field822;
                                continue;
                            }
                            if (var528 == 5017) {
                                class268.field4166[var6++] = class234.field3556;
                                continue;
                            }
                            if (var528 == 5050) {
                                var6--;
                                int var112 = class268.field4166[var6];
                                class207.field3175[var7++] = class207.method1493(var112, (byte) -23).field10;
                                continue;
                            }
                            if (var528 == 5051) {
                                var6--;
                                int var113 = class268.field4166[var6];
                                class1 var114 = class207.method1493(var113, (byte) -23);
                                if (var114.field5 == null) {
                                    class268.field4166[var6++] = 0;
                                } else {
                                    class268.field4166[var6++] = var114.field5.length;
                                }
                                continue;
                            }
                            if (var528 == 5052) {
                                var6 -= 2;
                                int var115 = class268.field4166[var6 + 1];
                                int var116 = class268.field4166[var6];
                                class1 var117 = class207.method1493(var116, (byte) -23);
                                int var118 = var117.field5[var115];
                                class268.field4166[var6++] = var118;
                                continue;
                            }
                            if (var528 == 5053) {
                                var6--;
                                int var119 = class268.field4166[var6];
                                class1 var120 = class207.method1493(var119, (byte) -23);
                                if (var120.field15 == null) {
                                    class268.field4166[var6++] = 0;
                                } else {
                                    class268.field4166[var6++] = var120.field15.length;
                                }
                                continue;
                            }
                            if (var528 == 5054) {
                                var6 -= 2;
                                int var121 = class268.field4166[var6 + 1];
                                int var122 = class268.field4166[var6];
                                class268.field4166[var6++] = class207.method1493(var122, (byte) -23).field15[var121];
                                continue;
                            }
                            if (var528 == 5055) {
                                var6--;
                                int var123 = class268.field4166[var6];
                                class207.field3175[var7++] = class181.method1354(var123, class181.method1355(arg0, -6654)).method1583((byte) 10);
                                continue;
                            }
                            if (var528 == 5056) {
                                var6--;
                                int var124 = class268.field4166[var6];
                                class223 var125 = class181.method1354(var124, 111);
                                if (var125.field3394 == null) {
                                    class268.field4166[var6++] = 0;
                                } else {
                                    class268.field4166[var6++] = var125.field3394.length;
                                }
                                continue;
                            }
                            if (var528 == 5057) {
                                var6 -= 2;
                                int var126 = class268.field4166[var6];
                                int var127 = class268.field4166[var6 + 1];
                                class268.field4166[var6++] = class181.method1354(var126, arg0 - 6655).field3394[var127];
                                continue;
                            }
                            if (var528 == 5058) {
                                class280.field4345 = new class336();
                                var6--;
                                class280.field4345.field5224 = class268.field4166[var6];
                                class280.field4345.field5233 = class181.method1354(class280.field4345.field5224, 113);
                                class280.field4345.field5226 = new int[class280.field4345.field5233.method1587((byte) 78)];
                                continue;
                            }
                            if (var528 == 5059) {
                                class165.field2673++;
                                class85.field1236.method1141((byte) 30, 251);
                                class85.field1236.method1752(0, -121);
                                int var128 = class85.field1236.field3866;
                                class85.field1236.method1752(0, arg0 ^ 0xFFFFE60A);
                                class85.field1236.method1744(true, class280.field4345.field5224);
                                class280.field4345.field5233.method1584(class280.field4345.field5226, class85.field1236, (byte) -37);
                                class85.field1236.method1767(class85.field1236.field3866 - var128, 791705512);
                                continue;
                            }
                            if (var528 == 5060) {
                                class217.field3322++;
                                var7--;
                                String var129 = class207.field3175[var7];
                                class85.field1236.method1141((byte) 61, 168);
                                class85.field1236.method1752(0, -87);
                                int var130 = class85.field1236.field3866;
                                class85.field1236.method1738((byte) 37, class49.method374(var129, -1));
                                class85.field1236.method1744(true, class280.field4345.field5224);
                                class280.field4345.field5233.method1584(class280.field4345.field5226, class85.field1236, (byte) -37);
                                class85.field1236.method1767(class85.field1236.field3866 - var130, 791705512);
                                continue;
                            }
                            if (var528 == 5061) {
                                class85.field1236.method1141((byte) 30, 251);
                                class85.field1236.method1752(0, -116);
                                class165.field2673++;
                                int var131 = class85.field1236.field3866;
                                class85.field1236.method1752(1, -85);
                                class85.field1236.method1744(true, class280.field4345.field5224);
                                class280.field4345.field5233.method1584(class280.field4345.field5226, class85.field1236, (byte) -37);
                                class85.field1236.method1767(class85.field1236.field3866 - var131, arg0 + 791698979);
                                continue;
                            }
                            if (var528 == 5062) {
                                var6 -= 2;
                                int var132 = class268.field4166[var6];
                                int var133 = class268.field4166[var6 + 1];
                                class268.field4166[var6++] = class207.method1493(var132, (byte) -23).field3[var133];
                                continue;
                            }
                            if (var528 == 5063) {
                                var6 -= 2;
                                int var134 = class268.field4166[var6];
                                int var135 = class268.field4166[var6 + 1];
                                class268.field4166[var6++] = class207.method1493(var134, (byte) -23).field16[var135];
                                continue;
                            }
                            if (var528 == 5064) {
                                var6 -= 2;
                                int var136 = class268.field4166[var6];
                                int var137 = class268.field4166[var6 + 1];
                                if (var137 == -1) {
                                    class268.field4166[var6++] = -1;
                                } else {
                                    class268.field4166[var6++] = class207.method1493(var136, (byte) -23).method1((char) var137, (byte) 84);
                                }
                                continue;
                            }
                            if (var528 == 5065) {
                                var6 -= 2;
                                int var138 = class268.field4166[var6 + 1];
                                int var139 = class268.field4166[var6];
                                if (var138 == -1) {
                                    class268.field4166[var6++] = -1;
                                } else {
                                    class268.field4166[var6++] = class207.method1493(var139, (byte) -23).method3((byte) -120, (char) var138);
                                }
                                continue;
                            }
                            if (var528 == 5066) {
                                var6--;
                                int var140 = class268.field4166[var6];
                                class268.field4166[var6++] = class181.method1354(var140, class181.method1355(arg0, -6530)).method1587((byte) 78);
                                continue;
                            }
                            if (var528 == 5067) {
                                var6 -= 2;
                                int var141 = class268.field4166[var6];
                                int var142 = class268.field4166[var6 + 1];
                                int var143 = class181.method1354(var141, arg0 - 6459).method1593(var142, 0);
                                class268.field4166[var6++] = var143;
                                continue;
                            }
                            if (var528 == 5068) {
                                var6 -= 2;
                                int var144 = class268.field4166[var6];
                                int var145 = class268.field4166[var6 + 1];
                                class280.field4345.field5226[var144] = var145;
                                continue;
                            }
                            if (var528 == 5069) {
                                var6 -= 2;
                                int var146 = class268.field4166[var6];
                                int var147 = class268.field4166[var6 + 1];
                                class280.field4345.field5226[var146] = var147;
                                continue;
                            }
                            if (var528 == 5070) {
                                var6 -= 3;
                                int var148 = class268.field4166[var6];
                                int var149 = class268.field4166[var6 + 2];
                                int var150 = class268.field4166[var6 + 1];
                                class223 var151 = class181.method1354(var148, arg0 ^ 0x1984);
                                if (var151.method1593(var150, 0) != 0) {
                                    throw new RuntimeException("bad command");
                                }
                                class268.field4166[var6++] = var151.method1589(true, var150, var149);
                                continue;
                            }
                            if (var528 == 5071) {
                                var6--;
                                boolean var152 = class268.field4166[var6] == 1;
                                var7--;
                                String var153 = class207.field3175[var7];
                                class219.method1560(var153, (byte) 110, var152);
                                class268.field4166[var6++] = class191.field2985;
                                continue;
                            }
                            if (var528 == 5072) {
                                if (class23.field257 != null && class43.field622 < class191.field2985) {
                                    class268.field4166[var6++] = class149.method1117(65535, class23.field257[class43.field622++]);
                                    continue;
                                }
                                class268.field4166[var6++] = -1;
                                continue;
                            }
                            if (var528 == 5073) {
                                class43.field622 = 0;
                                continue;
                            }
                        } else if (var528 < 5200) {
                            if (var528 == 5100) {
                                if (class180.field2860[86]) {
                                    class268.field4166[var6++] = 1;
                                } else {
                                    class268.field4166[var6++] = 0;
                                }
                                continue;
                            }
                            if (var528 == 5101) {
                                if (class180.field2860[82]) {
                                    class268.field4166[var6++] = 1;
                                } else {
                                    class268.field4166[var6++] = 0;
                                }
                                continue;
                            }
                            if (var528 == 5102) {
                                if (class180.field2860[81]) {
                                    class268.field4166[var6++] = 1;
                                } else {
                                    class268.field4166[var6++] = 0;
                                }
                                continue;
                            }
                        } else if (var528 < 5300) {
                            if (var528 == 5200) {
                                var6--;
                                class114.method880(class268.field4166[var6], (byte) -123);
                                continue;
                            }
                            if (var528 == 5201) {
                                class268.field4166[var6++] = class36.method280((byte) 82);
                                continue;
                            }
                            if (var528 == 5202) {
                                var6--;
                                class90.method654(class268.field4166[var6], 258);
                                continue;
                            }
                            if (var528 == 5203) {
                                var7--;
                                class51.method379(-83, class207.field3175[var7]);
                                continue;
                            }
                            if (var528 == 5204) {
                                class207.field3175[var7 - 1] = class149.method1118((byte) 112, class207.field3175[var7 - 1]);
                                continue;
                            }
                            if (var528 == 5205) {
                                var6--;
                                class215.method1538(-1, class268.field4166[var6], (byte) 109, -1);
                                continue;
                            }
                            if (var528 == 5206) {
                                var6--;
                                int var232 = class268.field4166[var6];
                                class262 var233 = class63.method434((var232 & 0xFFFD1EE) >> 14, var232 & 0x3FFF, (byte) 103);
                                if (var233 == null) {
                                    class268.field4166[var6++] = -1;
                                } else {
                                    class268.field4166[var6++] = var233.field4034;
                                }
                                continue;
                            }
                            if (var528 == 5207) {
                                var6--;
                                class262 var234 = class36.method275((byte) 1, class268.field4166[var6]);
                                if (var234 != null && var234.field4044 != null) {
                                    class207.field3175[var7++] = var234.field4044;
                                    continue;
                                }
                                class207.field3175[var7++] = "";
                                continue;
                            }
                            if (var528 == 5208) {
                                class268.field4166[var6++] = class177.field2827;
                                class268.field4166[var6++] = class13.field175;
                                continue;
                            }
                            if (var528 == 5209) {
                                class268.field4166[var6++] = class8.field119 + class196.field3024;
                                class268.field4166[var6++] = class229.field3494 + class176.field2822 - class49.field680 - 1;
                                continue;
                            }
                            if (var528 == 5210) {
                                var6--;
                                int var235 = class268.field4166[var6];
                                class262 var236 = class36.method275((byte) 1, var235);
                                if (var236 == null) {
                                    class268.field4166[var6++] = 0;
                                    class268.field4166[var6++] = 0;
                                } else {
                                    class268.field4166[var6++] = class149.method1117(var236.field4032 >> 14, 16383);
                                    class268.field4166[var6++] = class149.method1117(var236.field4032, 16383);
                                }
                                continue;
                            }
                            if (var528 == 5211) {
                                var6--;
                                int var237 = class268.field4166[var6];
                                class262 var238 = class36.method275((byte) 1, var237);
                                if (var238 == null) {
                                    class268.field4166[var6++] = 0;
                                    class268.field4166[var6++] = 0;
                                } else {
                                    class268.field4166[var6++] = var238.field4039 - var238.field4036;
                                    class268.field4166[var6++] = var238.field4043 - var238.field4046;
                                }
                                continue;
                            }
                            if (var528 == 5212) {
                                int var239 = class103.method786((byte) -6);
                                int var240 = 0;
                                String var241;
                                if (var239 == -1) {
                                    var241 = "";
                                } else {
                                    var241 = class228.field3489.field283[var239];
                                    var240 = class228.field3489.method202(arg0 ^ 0x1986, var239);
                                }
                                String var242 = class225.method1602(var241, 0, " ", "<br>");
                                class207.field3175[var7++] = var242;
                                class268.field4166[var6++] = var240;
                                continue;
                            }
                            if (var528 == 5213) {
                                int var243 = class16.method118((byte) 50);
                                int var244 = 0;
                                String var245;
                                if (var243 == -1) {
                                    var245 = "";
                                } else {
                                    var245 = class228.field3489.field283[var243];
                                    var244 = class228.field3489.method202(3, var243);
                                }
                                String var246 = class225.method1602(var245, 0, " ", "<br>");
                                class207.field3175[var7++] = var246;
                                class268.field4166[var6++] = var244;
                                continue;
                            }
                            if (var528 == 5214) {
                                var6--;
                                int var247 = class268.field4166[var6];
                                class262 var248 = class85.method641(8);
                                if (var248 != null) {
                                    int[] var249 = var248.method1842((var247 & 0xFFFC42F) >> 14, (var247 & 0x3D7D865C) >> 28, var247 & 0x3FFF, (byte) 100);
                                    if (var249 != null) {
                                        class103.method787(-10858, var249[1], var249[2]);
                                    }
                                }
                                continue;
                            }
                            if (var528 == 5215) {
                                var6 -= 2;
                                int var250 = class268.field4166[var6 + 1];
                                int var251 = class268.field4166[var6];
                                boolean var252 = false;
                                class257 var253 = class153.method1156(80, var251 & 0x3FFF, var251 >> 14 & 0x3FFF);
                                for (class262 var254 = (class262) var253.method1811(7); var254 != null; var254 = (class262) var253.method1807(arg0 - 6410)) {
                                    if (var254.field4034 == var250) {
                                        var252 = true;
                                        break;
                                    }
                                }
                                if (var252) {
                                    class268.field4166[var6++] = 1;
                                } else {
                                    class268.field4166[var6++] = 0;
                                }
                                continue;
                            }
                            if (var528 == 5216) {
                                var6--;
                                int var255 = class268.field4166[var6];
                                class154.method1160((byte) 50, var255);
                                continue;
                            }
                            if (var528 == 5217) {
                                var6--;
                                int var256 = class268.field4166[var6];
                                if (class15.method116(0, var256)) {
                                    class268.field4166[var6++] = 1;
                                } else {
                                    class268.field4166[var6++] = 0;
                                }
                                continue;
                            }
                            if (var528 == 5218) {
                                var6--;
                                int var257 = class268.field4166[var6];
                                class262 var258 = class36.method275((byte) 1, var257);
                                if (var258 == null) {
                                    class268.field4166[var6++] = -1;
                                } else {
                                    class268.field4166[var6++] = var258.field4037;
                                }
                                continue;
                            }
                            if (var528 == 5219) {
                                var7--;
                                class148.method1114(false, class207.field3175[var7]);
                                continue;
                            }
                            if (var528 == 5220) {
                                class268.field4166[var6++] = class215.field3299 == 100 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 5221) {
                                var6--;
                                int var259 = class268.field4166[var6];
                                class103.method787(-10858, var259 >> 14 & 0x3FFF, var259 & 0x3FFF);
                                continue;
                            }
                            if (var528 == 5222) {
                                class262 var260 = class85.method641(8);
                                if (var260 == null) {
                                    class268.field4166[var6++] = -1;
                                    class268.field4166[var6++] = -1;
                                } else {
                                    int[] var261 = var260.method1843(class229.field3494 + class176.field2822 - class49.field680 - 1, class8.field119 + class196.field3024, arg0 - 15563);
                                    if (var261 == null) {
                                        class268.field4166[var6++] = -1;
                                        class268.field4166[var6++] = -1;
                                    } else {
                                        class268.field4166[var6++] = var261[1];
                                        class268.field4166[var6++] = var261[2];
                                    }
                                }
                                continue;
                            }
                            if (var528 == 5223) {
                                var6 -= 2;
                                int var262 = class268.field4166[var6];
                                int var263 = class268.field4166[var6 + 1];
                                class215.method1538(var263 & 0x3FFF, var262, (byte) -38, (var263 & 0xFFFE0C0) >> 14);
                                continue;
                            }
                            if (var528 == 5224) {
                                var6--;
                                int var264 = class268.field4166[var6];
                                class262 var265 = class85.method641(8);
                                if (var265 == null) {
                                    class268.field4166[var6++] = -1;
                                    class268.field4166[var6++] = -1;
                                } else {
                                    int[] var266 = var265.method1842((var264 & 0xFFFE98E) >> 14, (var264 & 0x3460398F) >> 28, var264 & 0x3FFF, (byte) 123);
                                    if (var266 == null) {
                                        class268.field4166[var6++] = -1;
                                        class268.field4166[var6++] = -1;
                                    } else {
                                        class268.field4166[var6++] = var266[1];
                                        class268.field4166[var6++] = var266[2];
                                    }
                                }
                                continue;
                            }
                            if (var528 == 5225) {
                                var6--;
                                int var267 = class268.field4166[var6];
                                class262 var268 = class85.method641(8);
                                if (var268 == null) {
                                    class268.field4166[var6++] = -1;
                                    class268.field4166[var6++] = -1;
                                } else {
                                    int[] var269 = var268.method1843(var267 & 0x3FFF, (var267 & 0xFFFC04A) >> 14, -9030);
                                    if (var269 == null) {
                                        class268.field4166[var6++] = -1;
                                        class268.field4166[var6++] = -1;
                                    } else {
                                        class268.field4166[var6++] = var269[1];
                                        class268.field4166[var6++] = var269[2];
                                    }
                                }
                                continue;
                            }
                        } else if (var528 < 5400) {
                            if (var528 == 5300) {
                                var6 -= 2;
                                int var219 = class268.field4166[var6];
                                int var220 = class268.field4166[var6 + 1];
                                class181.method1356(var219, 3, -90, false, var220);
                                class268.field4166[var6++] = class170.field2747 == null ? 0 : 1;
                                continue;
                            }
                            if (var528 == 5301) {
                                if (class170.field2747 != null) {
                                    class181.method1356(-1, class216.field3321, -87, false, -1);
                                }
                                continue;
                            }
                            if (var528 == 5302) {
                                class134[] var221 = class275.method1913(arg0 ^ 0x19D9);
                                class268.field4166[var6++] = var221.length;
                                continue;
                            }
                            if (var528 == 5303) {
                                var6--;
                                int var222 = class268.field4166[var6];
                                class134[] var223 = class275.method1913(95);
                                class268.field4166[var6++] = var223[var222].field2035;
                                class268.field4166[var6++] = var223[var222].field2043;
                                continue;
                            }
                            if (var528 == 5305) {
                                int var224 = class25.field272;
                                int var225 = class169.field2735;
                                int var226 = -1;
                                class134[] var227 = class275.method1913(arg0 ^ 0x19AF);
                                for (int var228 = 0; var228 < var227.length; var228++) {
                                    class134 var229 = var227[var228];
                                    if (var229.field2035 == var224 && var229.field2043 == var225) {
                                        var226 = var228;
                                        break;
                                    }
                                }
                                class268.field4166[var6++] = var226;
                                continue;
                            }
                            if (var528 == 5306) {
                                class268.field4166[var6++] = class63.method431(1);
                                continue;
                            }
                            if (var528 == 5307) {
                                var6--;
                                int var230 = class268.field4166[var6];
                                if (var230 < 0 || var230 > 2) {
                                    var230 = 0;
                                }
                                class181.method1356(-1, var230, arg0 ^ 0xFFFFE625, false, -1);
                                continue;
                            }
                            if (var528 == 5308) {
                                class268.field4166[var6++] = class216.field3321;
                                continue;
                            }
                            if (var528 == 5309) {
                                var6--;
                                int var231 = class268.field4166[var6];
                                if (var231 < 0 || var231 > 2) {
                                    var231 = 0;
                                }
                                class216.field3321 = var231;
                                class110.method840(-74, class330.field5074);
                                continue;
                            }
                        } else if (var528 < 5500) {
                            if (var528 == 5400) {
                                class331.field5108++;
                                var7 -= 2;
                                var6--;
                                int var154 = class268.field4166[var6];
                                String var155 = class207.field3175[var7];
                                String var156 = class207.field3175[var7 + 1];
                                class85.field1236.method1141((byte) 123, 178);
                                class85.field1236.method1752((class308.method2108(12146, var155) + class308.method2108(arg0 ^ 0x36F7, var156)) + 1, arg0 ^ 0xFFFFE635);
                                class85.field1236.method1766(arg0 - 6533, var155);
                                class85.field1236.method1766(0, var156);
                                class85.field1236.method1752(var154, arg0 ^ 0xFFFFE62B);
                                continue;
                            }
                            if (var528 == 5401) {
                                var6 -= 2;
                                class273.field4263[class268.field4166[var6]] = (short) class72.method510(-64, class268.field4166[var6 + 1]);
                                class227.method1612(false);
                                class109.method833((byte) 106);
                                class200.method1447(4096);
                                class264.method1849(0);
                                class323.method2241(103);
                                continue;
                            }
                            if (var528 == 5405) {
                                var6 -= 2;
                                int var157 = class268.field4166[var6];
                                int var158 = class268.field4166[var6 + 1];
                                if (var157 >= 0 && var157 < 2) {
                                    class81.field1195[var157] = new int[var158 << 1][4];
                                }
                                continue;
                            }
                            if (var528 == 5406) {
                                var6 -= 7;
                                int var159 = class268.field4166[var6 + 1] << 1;
                                int var160 = class268.field4166[var6];
                                int var161 = class268.field4166[var6 + 2];
                                int var162 = class268.field4166[var6 + 5];
                                int var163 = class268.field4166[var6 + 4];
                                int var164 = class268.field4166[var6 + 6];
                                int var165 = class268.field4166[var6 + 3];
                                if (var160 >= 0 && var160 < 2 && class81.field1195[var160] != null && var159 >= 0 && class81.field1195[var160].length > var159) {
                                    class81.field1195[var160][var159] = new int[] { (class149.method1117(var161, 268423721) >> 14) * 128, var165, class149.method1117(16383, var161) * 128, var164 };
                                    class81.field1195[var160][var159 + 1] = new int[] { class149.method1117(16383, var163 >> 14) * 128, var162, class149.method1117(var163, 16383) * 128 };
                                }
                                continue;
                            }
                            if (var528 == 5407) {
                                var6--;
                                int var166 = class81.field1195[class268.field4166[var6]].length >> 1;
                                class268.field4166[var6++] = var166;
                                continue;
                            }
                            if (var528 == 5411) {
                                if (class170.field2747 != null) {
                                    class181.method1356(-1, class216.field3321, arg0 ^ 0xFFFFE624, false, -1);
                                }
                                if (class254.field3878 == null) {
                                    class87.method646(false, class36.method276(1), (byte) 94);
                                } else {
                                    System.exit(0);
                                }
                                continue;
                            }
                            if (var528 == 5419) {
                                String var167 = "";
                                if (class43.field620 != null) {
                                    if (class43.field620.field3186 == null) {
                                        var167 = class115.method884(class43.field620.field3184, (byte) -4);
                                    } else {
                                        var167 = (String) class43.field620.field3186;
                                    }
                                }
                                class207.field3175[var7++] = var167;
                                continue;
                            }
                            if (var528 == 5420) {
                                class268.field4166[var6++] = class6.field87 == 3 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 5421) {
                                if (class170.field2747 != null) {
                                    class181.method1356(-1, class216.field3321, -102, false, -1);
                                }
                                var7--;
                                String var168 = class207.field3175[var7];
                                var6--;
                                boolean var169 = class268.field4166[var6] == 1;
                                String var170 = class36.method276(arg0 - 6532) + var168;
                                if (class254.field3878 != null || var169 && class6.field87 != 3 && class6.field101.startsWith("win") && !class237.field3595) {
                                    class237.field3607 = var169;
                                    class168.field2728 = var170;
                                    class336.field5228 = class330.field5074.method58(var170, false);
                                    continue;
                                }
                                class87.method646(var169, var170, (byte) 97);
                                continue;
                            }
                            if (var528 == 5422) {
                                var7 -= 2;
                                String var171 = class207.field3175[var7];
                                String var172 = class207.field3175[var7 + 1];
                                var6--;
                                int var173 = class268.field4166[var6];
                                if (var171.length() > 0) {
                                    if (class56.field736 == null) {
                                        class56.field736 = new String[class182.field2885[class248.field3754]];
                                    }
                                    class56.field736[var173] = var171;
                                }
                                if (var172.length() > 0) {
                                    if (class260.field4000 == null) {
                                        class260.field4000 = new String[class182.field2885[class248.field3754]];
                                    }
                                    class260.field4000[var173] = var172;
                                }
                                continue;
                            }
                            if (var528 == 5423) {
                                var7--;
                                System.out.println(class207.field3175[var7]);
                                continue;
                            }
                            if (var528 == 5424) {
                                var6 -= 11;
                                class87.field1238 = class268.field4166[var6];
                                class180.field2858 = class268.field4166[var6 + 1];
                                class277.field4315 = class268.field4166[var6 + 2];
                                class34.field492 = class268.field4166[var6 + 3];
                                class54.field713 = class268.field4166[var6 + 4];
                                class114.field1800 = class268.field4166[var6 + 5];
                                class238.field3629 = class268.field4166[var6 + 6];
                                class182.field2886 = class268.field4166[var6 + 7];
                                class333.field5195 = class268.field4166[var6 + 8];
                                class255.field3913 = class268.field4166[var6 + 9];
                                class153.field2325 = class268.field4166[var6 + 10];
                                class264.field4087.method707(class54.field713, (byte) 123);
                                class264.field4087.method707(class114.field1800, (byte) 72);
                                class264.field4087.method707(class238.field3629, (byte) 14);
                                class264.field4087.method707(class182.field2886, (byte) 67);
                                class264.field4087.method707(class333.field5195, (byte) 27);
                                class264.field4093 = true;
                                continue;
                            }
                            if (var528 == 5425) {
                                class81.method627(arg0 - 6623);
                                class264.field4093 = false;
                                continue;
                            }
                            if (var528 == 5426) {
                                var6--;
                                class340.field5284 = class268.field4166[var6];
                                continue;
                            }
                            if (var528 == 5427) {
                                var6 -= 2;
                                class314.field4864 = class268.field4166[var6];
                                class283.field4410 = class268.field4166[var6 + 1];
                                continue;
                            }
                            if (var528 == 5428) {
                                var6 -= 2;
                                int var174 = class268.field4166[var6 + 1];
                                int var175 = class268.field4166[var6];
                                class268.field4166[var6++] = class79.method612((byte) 78, var175, var174) ? 1 : 0;
                                continue;
                            }
                        } else if (var528 < 5600) {
                            if (var528 == 5500) {
                                var6 -= 4;
                                int var176 = class268.field4166[var6 + 2];
                                int var177 = class268.field4166[var6];
                                int var178 = class268.field4166[var6 + 1];
                                int var179 = class268.field4166[var6 + 3];
                                class32.method253(var178, ((var177 & 0xFFFF694) >> 14) - class327.field5054, (var177 & 0x3FFF) + -class293.field4522, false, arg0 ^ 0xFFFFE62B, var179, var176);
                                continue;
                            }
                            if (var528 == 5501) {
                                var6 -= 4;
                                int var180 = class268.field4166[var6];
                                int var181 = class268.field4166[var6 + 2];
                                int var182 = class268.field4166[var6 + 1];
                                int var183 = class268.field4166[var6 + 3];
                                class133.method1029(var181, var183, (var180 & 0x3FFF) - class293.field4522, true, var182, ((var180 & 0xFFFEC17) >> 14) - class327.field5054);
                                continue;
                            }
                            if (var528 == 5502) {
                                var6 -= 6;
                                int var184 = class268.field4166[var6];
                                if (var184 >= 2) {
                                    throw new RuntimeException();
                                }
                                class98.field1418 = var184;
                                int var185 = class268.field4166[var6 + 1];
                                if ((var185 + 1) >= (class81.field1195[class98.field1418].length >> 1)) {
                                    throw new RuntimeException();
                                }
                                class319.field4931 = 0;
                                class131.field2008 = var185;
                                class34.field497 = class268.field4166[var6 + 2];
                                class153.field2320 = class268.field4166[var6 + 3];
                                int var186 = class268.field4166[var6 + 4];
                                if (var186 >= 2) {
                                    throw new RuntimeException();
                                }
                                class267.field4150 = var186;
                                int var187 = class268.field4166[var6 + 5];
                                if ((class81.field1195[class267.field4150].length >> 1) <= (var187 + 1)) {
                                    throw new RuntimeException();
                                }
                                class268.field4168 = 3;
                                class183.field2896 = var187;
                                continue;
                            }
                            if (var528 == 5503) {
                                class187.method1386(44);
                                continue;
                            }
                            if (var528 == 5504) {
                                var6 -= 2;
                                class34.method267(class268.field4166[var6 + 1], class268.field4166[var6], -3);
                                continue;
                            }
                            if (var528 == 5505) {
                                class268.field4166[var6++] = (int) class307.field4786;
                                continue;
                            }
                            if (var528 == 5506) {
                                class268.field4166[var6++] = (int) class243.field3695;
                                continue;
                            }
                            if (var528 == 5507) {
                                class215.method1537(arg0 - 6644);
                                continue;
                            }
                            if (var528 == 5508) {
                                class110.method845((byte) -49);
                                continue;
                            }
                            if (var528 == 5509) {
                                class110.method837((byte) 94);
                                continue;
                            }
                            if (var528 == 5510) {
                                class203.method1468(10);
                                continue;
                            }
                            if (var528 == 5512) {
                                class269.method1886((byte) 122);
                                continue;
                            }
                        } else if (var528 < 5700) {
                            if (var528 == 5600) {
                                var7 -= 2;
                                var6--;
                                int var188 = class268.field4166[var6];
                                String var189 = class207.field3175[var7];
                                String var190 = class207.field3175[var7 + 1];
                                if (class152.field2308 == 10 && class300.field4622 == 0 && class59.field787 == 0 && class38.field564 == 0 && class151.field2284 == 0) {
                                    class264.method1854(var188, var189, var190, (byte) 69);
                                }
                                continue;
                            }
                            if (var528 == 5601) {
                                client.method999(true);
                                continue;
                            }
                            if (var528 == 5602) {
                                if (class59.field787 == 0) {
                                    class184.field2907 = -2;
                                }
                                continue;
                            }
                            if (var528 == 5603) {
                                var6 -= 4;
                                if (class152.field2308 == 10 && class300.field4622 == 0 && class59.field787 == 0 && class38.field564 == 0 && class151.field2284 == 0) {
                                    class167.method1264(class268.field4166[var6 + 3], arg0 ^ 0xFFFFE678, class268.field4166[var6 + 2], class268.field4166[var6 + 1], class268.field4166[var6]);
                                }
                                continue;
                            }
                            if (var528 == 5604) {
                                var7--;
                                if (class152.field2308 == 10 && class300.field4622 == 0 && class59.field787 == 0 && class38.field564 == 0 && class151.field2284 == 0) {
                                    class115.method887((byte) -121, class49.method374(class207.field3175[var7], arg0 - 6534));
                                }
                                continue;
                            }
                            if (var528 == 5605) {
                                var6 -= 7;
                                var7 -= 3;
                                if (class152.field2308 == 10 && class300.field4622 == 0 && class59.field787 == 0 && class38.field564 == 0 && class151.field2284 == 0) {
                                    class189.method1399(class268.field4166[var6 + 6] == 1, class207.field3175[var7 + 1], class268.field4166[var6 + 1], class268.field4166[var6 + 4] == 1, (byte) -92, class268.field4166[var6 + 2], class49.method374(class207.field3175[var7], -1), class268.field4166[var6 + 5] == 1, class268.field4166[var6 + 3], class207.field3175[var7 + 2], class268.field4166[var6]);
                                }
                                continue;
                            }
                            if (var528 == 5606) {
                                if (class38.field564 == 0) {
                                    class338.field5251 = -2;
                                }
                                continue;
                            }
                            if (var528 == 5607) {
                                class268.field4166[var6++] = class184.field2907;
                                continue;
                            }
                            if (var528 == 5608) {
                                class268.field4166[var6++] = class135.field2048;
                                continue;
                            }
                            if (var528 == 5609) {
                                class268.field4166[var6++] = class338.field5251;
                                continue;
                            }
                            if (var528 == 5610) {
                                for (int var191 = 0; var191 < 5; var191++) {
                                    class207.field3175[var7++] = var191 < class142.field2189.length ? class61.method424(class142.field2189[var191], -127) : "";
                                }
                                class142.field2189 = null;
                                continue;
                            }
                            if (var528 == 5611) {
                                class268.field4166[var6++] = class196.field3021;
                                continue;
                            }
                        } else if (var528 < 6100) {
                            if (var528 == 6001) {
                                var6--;
                                int var209 = class268.field4166[var6];
                                if (var209 < 1) {
                                    var209 = 1;
                                }
                                if (var209 > 4) {
                                    var209 = 4;
                                }
                                class102.field1482 = var209;
                                if (!class73.field1058 || !class309.field4812) {
                                    if (class102.field1482 == 1) {
                                        class164.method1246(0.9F);
                                    }
                                    if (class102.field1482 == 2) {
                                        class164.method1246(0.8F);
                                    }
                                    if (class102.field1482 == 3) {
                                        class164.method1246(0.7F);
                                    }
                                    if (class102.field1482 == 4) {
                                        class164.method1246(0.6F);
                                    }
                                }
                                if (class73.field1058) {
                                    class222.method1578(-13559);
                                    if (!class309.field4812) {
                                        class158.method1189(-31);
                                    }
                                }
                                class109.method833((byte) 106);
                                class110.method840(-52, class330.field5074);
                                class157.field2380 = false;
                                continue;
                            }
                            if (var528 == 6002) {
                                var6--;
                                class197.method1437(-124, ~class268.field4166[var6] == -2);
                                class201.method1453(false);
                                class158.method1189(-31);
                                class60.method420((byte) -111);
                                class110.method840(-96, class330.field5074);
                                class157.field2380 = false;
                                continue;
                            }
                            if (var528 == 6003) {
                                var6--;
                                class322.field4976 = class268.field4166[var6] == 1;
                                class60.method420((byte) -117);
                                class110.method840(-95, class330.field5074);
                                class157.field2380 = false;
                                continue;
                            }
                            if (var528 == 6005) {
                                var6--;
                                class320.field4958 = class268.field4166[var6] == 1;
                                class158.method1189(-31);
                                class110.method840(-83, class330.field5074);
                                class157.field2380 = false;
                                continue;
                            }
                            if (var528 == 6006) {
                                var6--;
                                class255.field3884 = class268.field4166[var6] == 1;
                                ((class265) class164.field2662).method1864(!class255.field3884, -1);
                                class110.method840(-98, class330.field5074);
                                class157.field2380 = false;
                                continue;
                            }
                            if (var528 == 6007) {
                                var6--;
                                class267.field4149 = class268.field4166[var6] == 1;
                                class110.method840(-120, class330.field5074);
                                class157.field2380 = false;
                                continue;
                            }
                            if (var528 == 6008) {
                                var6--;
                                class284.field4430 = class268.field4166[var6] == 1;
                                class110.method840(-99, class330.field5074);
                                class157.field2380 = false;
                                continue;
                            }
                            if (var528 == 6009) {
                                var6--;
                                class258.field3983 = class268.field4166[var6] == 1;
                                class110.method840(arg0 ^ 0xFFFFE61C, class330.field5074);
                                class157.field2380 = false;
                                continue;
                            }
                            if (var528 == 6010) {
                                var6--;
                                class134.field2036 = class268.field4166[var6] == 1;
                                class110.method840(-98, class330.field5074);
                                class157.field2380 = false;
                                continue;
                            }
                            if (var528 == 6011) {
                                var6--;
                                int var210 = class268.field4166[var6];
                                if (var210 < 0 || var210 > 2) {
                                    var210 = 0;
                                }
                                class165.field2674 = var210;
                                class110.method840(-88, class330.field5074);
                                class157.field2380 = false;
                                continue;
                            }
                            if (var528 == 6012) {
                                if (class73.field1058) {
                                    class241.method1672(0, -123, 0);
                                }
                                var6--;
                                class309.field4812 = class268.field4166[var6] == 1;
                                if (class73.field1058 && class309.field4812) {
                                    class164.method1246(0.7F);
                                } else {
                                    if (class102.field1482 == 1) {
                                        class164.method1246(0.9F);
                                    }
                                    if (class102.field1482 == 2) {
                                        class164.method1246(0.8F);
                                    }
                                    if (class102.field1482 == 3) {
                                        class164.method1246(0.7F);
                                    }
                                    if (class102.field1482 == 4) {
                                        class164.method1246(0.6F);
                                    }
                                }
                                class158.method1189(-31);
                                class110.method840(-120, class330.field5074);
                                class157.field2380 = false;
                                continue;
                            }
                            if (var528 == 6014) {
                                var6--;
                                class122.field1874 = class268.field4166[var6] == 1;
                                if (class73.field1058) {
                                    class158.method1189(-31);
                                }
                                class110.method840(arg0 - 6632, class330.field5074);
                                class157.field2380 = false;
                                continue;
                            }
                            if (var528 == 6015) {
                                var6--;
                                class67.field972 = class268.field4166[var6] == 1;
                                if (class73.field1058) {
                                    class222.method1578(arg0 ^ 0xFFFFD28C);
                                }
                                class110.method840(-80, class330.field5074);
                                class157.field2380 = false;
                                continue;
                            }
                            if (var528 == 6016) {
                                var6--;
                                int var211 = class268.field4166[var6];
                                if (var211 < 0 || var211 > 2) {
                                    var211 = 0;
                                }
                                class142.field2190 = var211;
                                if (class73.field1058) {
                                    class229.field3496 = true;
                                }
                                continue;
                            }
                            if (var528 == 6017) {
                                var6--;
                                class318.field4915 = class268.field4166[var6] == 1;
                                class43.method333(0);
                                class110.method840(-108, class330.field5074);
                                class157.field2380 = false;
                                continue;
                            }
                            if (var528 == 6018) {
                                var6--;
                                int var212 = class268.field4166[var6];
                                if (var212 < 0) {
                                    var212 = 0;
                                }
                                if (var212 > 127) {
                                    var212 = 127;
                                }
                                class311.field4833 = var212;
                                class110.method840(-127, class330.field5074);
                                class157.field2380 = false;
                                continue;
                            }
                            if (var528 == 6019) {
                                var6--;
                                int var213 = class268.field4166[var6];
                                if (var213 < 0) {
                                    var213 = 0;
                                }
                                if (var213 > 255) {
                                    var213 = 255;
                                }
                                if (class59.field783 != var213) {
                                    if (class59.field783 == 0 && class276.field4284 != -1) {
                                        class262.method1837(false, arg0 ^ 0x1985, class222.field3389, var213, class276.field4284, 0);
                                        class132.field2016 = false;
                                    } else if (var213 == 0) {
                                        class281.method1947(160);
                                        class132.field2016 = false;
                                    } else {
                                        class331.method2311(var213, false);
                                    }
                                    class59.field783 = var213;
                                }
                                class110.method840(-124, class330.field5074);
                                class157.field2380 = false;
                                continue;
                            }
                            if (var528 == 6020) {
                                var6--;
                                int var214 = class268.field4166[var6];
                                if (var214 < 0) {
                                    var214 = 0;
                                }
                                if (var214 > 127) {
                                    var214 = 127;
                                }
                                class71.field1022 = var214;
                                class110.method840(-58, class330.field5074);
                                class157.field2380 = false;
                                continue;
                            }
                            if (var528 == 6021) {
                                var6--;
                                class132.field2022 = class268.field4166[var6] == 1;
                                class60.method420((byte) -112);
                                continue;
                            }
                            if (var528 == 6023) {
                                boolean var215 = false;
                                var6--;
                                int var216 = class268.field4166[var6];
                                if (var216 < 0) {
                                    var216 = 0;
                                }
                                if (var216 > 2) {
                                    var216 = 2;
                                }
                                if (class245.field3715 < 96) {
                                    var216 = 0;
                                    var215 = true;
                                }
                                class249.method1700(var216);
                                class110.method840(arg0 - 6631, class330.field5074);
                                class157.field2380 = false;
                                class268.field4166[var6++] = var215 ? 0 : 1;
                                continue;
                            }
                            if (var528 == 6024) {
                                var6--;
                                int var217 = class268.field4166[var6];
                                if (var217 < 0 || var217 > 2) {
                                    var217 = 0;
                                }
                                class248.field3745 = var217;
                                class110.method840(-106, class330.field5074);
                                continue;
                            }
                            if (var528 == 6027) {
                                var6--;
                                int var218 = class268.field4166[var6];
                                if (!class73.field1058) {
                                    continue;
                                }
                                if (var218 < 0 || var218 > 1) {
                                    var218 = 0;
                                }
                                class1.method8(256, var218 == 1);
                                continue;
                            }
                            if (var528 == 6028) {
                                var6--;
                                class305.field4698 = class268.field4166[var6] != 0;
                                class110.method840(-103, class330.field5074);
                                continue;
                            }
                        } else if (var528 < 6200) {
                            if (var528 == 6101) {
                                class268.field4166[var6++] = class102.field1482;
                                continue;
                            }
                            if (var528 == 6102) {
                                class268.field4166[var6++] = class110.method841((byte) 88) ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6103) {
                                class268.field4166[var6++] = class322.field4976 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6105) {
                                class268.field4166[var6++] = class320.field4958 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6106) {
                                class268.field4166[var6++] = class255.field3884 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6107) {
                                class268.field4166[var6++] = class267.field4149 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6108) {
                                class268.field4166[var6++] = class284.field4430 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6109) {
                                class268.field4166[var6++] = class258.field3983 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6110) {
                                class268.field4166[var6++] = class134.field2036 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6111) {
                                class268.field4166[var6++] = class165.field2674;
                                continue;
                            }
                            if (var528 == 6112) {
                                class268.field4166[var6++] = class309.field4812 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6114) {
                                class268.field4166[var6++] = class122.field1874 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6115) {
                                class268.field4166[var6++] = class67.field972 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6116) {
                                class268.field4166[var6++] = class142.field2190;
                                continue;
                            }
                            if (var528 == 6117) {
                                class268.field4166[var6++] = class318.field4915 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6118) {
                                class268.field4166[var6++] = class311.field4833;
                                continue;
                            }
                            if (var528 == 6119) {
                                class268.field4166[var6++] = class59.field783;
                                continue;
                            }
                            if (var528 == 6120) {
                                class268.field4166[var6++] = class71.field1022;
                                continue;
                            }
                            if (var528 == 6121) {
                                if (class73.field1058) {
                                    class268.field4166[var6++] = class73.field1042 ? 1 : 0;
                                } else {
                                    class268.field4166[var6++] = 0;
                                }
                                continue;
                            }
                            if (var528 == 6123) {
                                class268.field4166[var6++] = class249.method1704();
                                continue;
                            }
                            if (var528 == 6124) {
                                class268.field4166[var6++] = class248.field3745;
                                continue;
                            }
                            if (var528 == 6126) {
                                if (class73.field1058) {
                                    class268.field4166[var6++] = class20.method156() ? 1 : 0;
                                } else {
                                    class268.field4166[var6++] = 0;
                                }
                                continue;
                            }
                            if (var528 == 6127) {
                                class268.field4166[var6++] = class235.field3578 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6128) {
                                class268.field4166[var6++] = class305.field4698 ? 1 : 0;
                                continue;
                            }
                        } else if (var528 < 6300) {
                            if (var528 == 6200) {
                                var6 -= 2;
                                class29.field356 = (short) class268.field4166[var6];
                                if (class29.field356 <= 0) {
                                    class29.field356 = 256;
                                }
                                class238.field3624 = (short) class268.field4166[var6 + 1];
                                if (class238.field3624 <= 0) {
                                    class238.field3624 = 205;
                                }
                                continue;
                            }
                            if (var528 == 6201) {
                                var6 -= 2;
                                class227.field3468 = (short) class268.field4166[var6];
                                if (class227.field3468 <= 0) {
                                    class227.field3468 = 256;
                                }
                                class118.field1838 = (short) class268.field4166[var6 + 1];
                                if (class118.field1838 <= 0) {
                                    class118.field1838 = 320;
                                }
                                continue;
                            }
                            if (var528 == 6202) {
                                var6 -= 4;
                                class76.field1108 = (short) class268.field4166[var6];
                                if (class76.field1108 <= 0) {
                                    class76.field1108 = 1;
                                }
                                class141.field2158 = (short) class268.field4166[var6 + 1];
                                if (class141.field2158 <= 0) {
                                    class141.field2158 = 32767;
                                } else if (class76.field1108 > class141.field2158) {
                                    class141.field2158 = class76.field1108;
                                }
                                class51.field688 = (short) class268.field4166[var6 + 2];
                                if (class51.field688 <= 0) {
                                    class51.field688 = 1;
                                }
                                class112.field1691 = (short) class268.field4166[var6 + 3];
                                if (class112.field1691 <= 0) {
                                    class112.field1691 = 32767;
                                } else if (class51.field688 > class112.field1691) {
                                    class112.field1691 = class51.field688;
                                }
                                continue;
                            }
                            if (var528 == 6203) {
                                class100.method755(0, 0, (byte) -66, false, class302.field4628.field2490, class302.field4628.field2619);
                                class268.field4166[var6++] = class228.field3490;
                                class268.field4166[var6++] = class114.field1792;
                                continue;
                            }
                            if (var528 == 6204) {
                                class268.field4166[var6++] = class227.field3468;
                                class268.field4166[var6++] = class118.field1838;
                                continue;
                            }
                            if (var528 == 6205) {
                                class268.field4166[var6++] = class29.field356;
                                class268.field4166[var6++] = class238.field3624;
                                continue;
                            }
                        } else if (var528 < 6400) {
                            if (var528 == 6300) {
                                class268.field4166[var6++] = (int) (class105.method789((byte) 55) / 60000L);
                                continue;
                            }
                            if (var528 == 6301) {
                                class268.field4166[var6++] = (int) (class105.method789((byte) 55) / 86400000L) - 11745;
                                continue;
                            }
                            if (var528 == 6302) {
                                var6 -= 3;
                                int var204 = class268.field4166[var6];
                                int var205 = class268.field4166[var6 + 2];
                                int var206 = class268.field4166[var6 + 1];
                                class182.field2884.clear();
                                class182.field2884.set(11, 12);
                                class182.field2884.set(var205, var206, var204);
                                class268.field4166[var6++] = (int) (class182.field2884.getTime().getTime() / 86400000L) - 11745;
                                continue;
                            }
                            if (var528 == 6303) {
                                class182.field2884.clear();
                                class182.field2884.setTime(new Date(class105.method789((byte) 55)));
                                class268.field4166[var6++] = class182.field2884.get(1);
                                continue;
                            }
                            if (var528 == 6304) {
                                boolean var207 = true;
                                var6--;
                                int var208 = class268.field4166[var6];
                                if (var208 < 0) {
                                    var207 = (var208 + 1) % 4 == 0;
                                } else if (var208 < 1582) {
                                    var207 = var208 % 4 == 0;
                                } else if ((var208 % 4) != 0) {
                                    var207 = false;
                                } else if (var208 % 100 != 0) {
                                    var207 = true;
                                } else if ((var208 % 400) != 0) {
                                    var207 = false;
                                }
                                class268.field4166[var6++] = var207 ? 1 : 0;
                                continue;
                            }
                        } else if (var528 < 6500) {
                            if (var528 == 6405) {
                                class268.field4166[var6++] = class10.method92(class181.method1355(arg0, 25869)) ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6406) {
                                class268.field4166[var6++] = class171.method1288((byte) 127) ? 1 : 0;
                                continue;
                            }
                        } else if (var528 < 6600) {
                            if (var528 == 6500) {
                                if (class152.field2308 == 10 && class300.field4622 == 0 && class59.field787 == 0 && class38.field564 == 0) {
                                    class268.field4166[var6++] = class109.method829(-128) == -1 ? 0 : 1;
                                    continue;
                                }
                                class268.field4166[var6++] = 1;
                                continue;
                            }
                            if (var528 == 6501) {
                                class163 var192 = class141.method1084(arg0 ^ 0xFFFFE630);
                                if (var192 == null) {
                                    class268.field4166[var6++] = -1;
                                    class268.field4166[var6++] = 0;
                                    class207.field3175[var7++] = "";
                                    class268.field4166[var6++] = 0;
                                    class207.field3175[var7++] = "";
                                    class268.field4166[var6++] = 0;
                                } else {
                                    class268.field4166[var6++] = var192.field2647;
                                    class268.field4166[var6++] = var192.field2736;
                                    class207.field3175[var7++] = var192.field2639;
                                    class309 var193 = var192.method1223(0);
                                    class268.field4166[var6++] = var193.field4816;
                                    class207.field3175[var7++] = var193.field4818;
                                    class268.field4166[var6++] = var192.field2731;
                                }
                                continue;
                            }
                            if (var528 == 6502) {
                                class163 var194 = class133.method1031(false);
                                if (var194 == null) {
                                    class268.field4166[var6++] = -1;
                                    class268.field4166[var6++] = 0;
                                    class207.field3175[var7++] = "";
                                    class268.field4166[var6++] = 0;
                                    class207.field3175[var7++] = "";
                                    class268.field4166[var6++] = 0;
                                } else {
                                    class268.field4166[var6++] = var194.field2647;
                                    class268.field4166[var6++] = var194.field2736;
                                    class207.field3175[var7++] = var194.field2639;
                                    class309 var195 = var194.method1223(0);
                                    class268.field4166[var6++] = var195.field4816;
                                    class207.field3175[var7++] = var195.field4818;
                                    class268.field4166[var6++] = var194.field2731;
                                }
                                continue;
                            }
                            if (var528 == 6503) {
                                var6--;
                                int var196 = class268.field4166[var6];
                                if (class152.field2308 == 10 && class300.field4622 == 0 && class59.field787 == 0 && class38.field564 == 0) {
                                    class268.field4166[var6++] = class51.method381(var196, 1) ? 1 : 0;
                                    continue;
                                }
                                class268.field4166[var6++] = 0;
                                continue;
                            }
                            if (var528 == 6504) {
                                var6--;
                                class146.field2232 = class268.field4166[var6];
                                class110.method840(-71, class330.field5074);
                                continue;
                            }
                            if (var528 == 6505) {
                                class268.field4166[var6++] = class146.field2232;
                                continue;
                            }
                            if (var528 == 6506) {
                                var6--;
                                int var197 = class268.field4166[var6];
                                class163 var198 = class25.method194((byte) 120, var197);
                                if (var198 == null) {
                                    class268.field4166[var6++] = -1;
                                    class207.field3175[var7++] = "";
                                    class268.field4166[var6++] = 0;
                                    class207.field3175[var7++] = "";
                                    class268.field4166[var6++] = 0;
                                } else {
                                    class268.field4166[var6++] = var198.field2736;
                                    class207.field3175[var7++] = var198.field2639;
                                    class309 var199 = var198.method1223(0);
                                    class268.field4166[var6++] = var199.field4816;
                                    class207.field3175[var7++] = var199.field4818;
                                    class268.field4166[var6++] = var198.field2731;
                                }
                                continue;
                            }
                            if (var528 == 6507) {
                                var6 -= 4;
                                int var200 = class268.field4166[var6];
                                boolean var201 = class268.field4166[var6 + 1] == 1;
                                int var202 = class268.field4166[var6 + 2];
                                boolean var203 = class268.field4166[var6 + 3] == 1;
                                class41.method316(var200, var203, 17124, var201, var202);
                                continue;
                            }
                        } else if (var528 < 6700) {
                            if (var528 == 6600) {
                                var6--;
                                class152.field2305 = class268.field4166[var6] == 1;
                                class110.method840(arg0 - 6585, class330.field5074);
                                continue;
                            }
                            if (var528 == 6601) {
                                class268.field4166[var6++] = class152.field2305 ? 1 : 0;
                                continue;
                            }
                        }
                    } else if (var528 == 4500) {
                        var6 -= 2;
                        int var270 = class268.field4166[var6];
                        int var271 = class268.field4166[var6 + 1];
                        class21 var272 = class111.method851(var271, 11);
                        if (var272.method166(-127)) {
                            class207.field3175[var7++] = client.method1003(-3, var270).method312(var271, false, var272.field240);
                        } else {
                            class268.field4166[var6++] = client.method1003(-3, var270).method310(var271, (byte) 17, var272.field239);
                        }
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var527) {
            if (var5.field2782 == null) {
                if (class312.field4837 != 0) {
                    class262.method1840("", "Clientscript error - check log for details", 0, -7);
                }
                class189.method1401(true, var527, "CS2 - scr:" + var5.field69 + " op:" + var11);
            } else {
                StringBuffer var524 = new StringBuffer(30);
                var524.append("%0a - in: ").append(var5.field2782);
                for (int var525 = class291.field4476 - 1; var525 >= 0; var525--) {
                    var524.append("%0a - via: ").append(class30.field363[var525].field3416.field2782);
                }
                if (var11 == 40) {
                    int var526 = var10[var8];
                    var524.append("%0a - non-existant gosub script-num: ").append(Integer.toString(var526));
                }
                if (class312.field4837 != 0) {
                    class262.method1840("", "Clientscript error in: " + var5.field2782, 0, -24);
                }
                class189.method1401(true, var527, "CS2 - scr:" + var5.field69 + " op:" + var11 + var524.toString());
            }
            if (arg0 != 6533) {
                method1306(-64, -77);
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "(B)V", line = 6584)
    public static final void method1304(byte arg0) {
        int var1 = -101 % ((arg0 - 9) / 61);
        field2798++;
        for (class242 var2 = (class242) class222.field3383.method1706(0); var2 != null; var2 = (class242) class222.field3383.method1705((byte) 76)) {
            int var3 = var2.field3689;
            if (class154.method1161(var3, 81)) {
                class161[] var4 = class8.field128[var3];
                boolean var5 = true;
                for (int var6 = 0; var6 < var4.length; var6++) {
                    if (var4[var6] != null) {
                        var5 = var4[var6].field2550;
                        break;
                    }
                }
                if (!var5) {
                    int var7 = (int) var2.field69;
                    class161 var8 = class331.method2308((byte) 91, var7);
                    if (var8 != null) {
                        class254.method1776(4, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(II)V", line = 6643)
    private static final void method1305(int arg0, int arg1) {
        field2809++;
        class188 var2 = class147.method1111(-63, arg1, 2);
        if (arg0 != -29696) {
            method1308((byte) 19);
        }
        var2.method1393((byte) -114);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIII)V", line = 6655)
    public final void method572(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2810++;
    }

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(II)I", line = 6662)
    public static final int method1306(int arg0, int arg1) {
        field2807++;
        int var2 = (arg1 & 0xE8) >> 6;
        int var3 = arg1 & 0x3F;
        if (var3 == 18) {
            if (var2 == 0) {
                return 1;
            }
            if (var2 == 1) {
                return 2;
            }
            if (var2 == 2) {
                return 4;
            }
            if (var2 == 3) {
                return 8;
            }
        } else if (var3 == 19 || var3 == 21) {
            if (var2 == 0) {
                return 16;
            }
            if (var2 == 1) {
                return 32;
            }
            if (var2 == 2) {
                return 64;
            }
            if (var2 == 3) {
                return 128;
            }
        }
        if (arg0 != -2) {
            method1307((class95) null, -66, (class95) null);
        }
        return 0;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljd;ILjd;)V", line = 6723)
    public static final void method1307(class95 arg0, int arg1, class95 arg2) {
        if (arg1 != 16383) {
            field2792 = 111;
        }
        field2808++;
        class226.field3462 = arg0;
        class262.field4031 = arg2;
    }

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "(B)V", line = 6751)
    public static final void method1308(byte arg0) {
        field2800++;
        if (arg0 < 9) {
            method1305(-51, 102);
        }
        for (int var1 = 0; var1 < class67.field970; var1++) {
            int var2 = class219.field3351[var1];
            class270 var3 = class201.field3096[var2];
            int var4 = class204.field3136.method1774((byte) -99);
            if ((var4 & 0x40) != 0) {
                var4 += class204.field3136.method1774((byte) -102) << 8;
            }
            class34.method263(var3, var2, var4, -108);
        }
    }
}
