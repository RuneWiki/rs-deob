import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class174 extends class126 {

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "I")
    private int field3167 = -32768;

    @OriginalMember(owner = "client!bc", name = "H", descriptor = "I")
    public static int field3176 = -1;

    @OriginalMember(owner = "client!bc", name = "M", descriptor = "Lcc;")
    private static class209 field3181 = class95.method669(88, "Created gameworld");

    @OriginalMember(owner = "client!bc", name = "K", descriptor = "I")
    public static int field3179 = -1;

    @OriginalMember(owner = "client!bc", name = "E", descriptor = "Lcc;")
    public static class209 field3173 = field3181;

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "I")
    public int field3166;

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!bc", name = "B", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!bc", name = "D", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!bc", name = "F", descriptor = "I")
    public int field3174;

    @OriginalMember(owner = "client!bc", name = "J", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!bc", name = "L", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!bc", name = "N", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!bc", name = "C", descriptor = "Lcg;")
    public static class165 field3171;

    @OriginalMember(owner = "client!bc", name = "G", descriptor = "Lsj;")
    public static class49 field3175;

    @OriginalMember(owner = "client!bc", name = "I", descriptor = "[I")
    public static int[] field3177;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIIIIJILmd;)V")
    public final void method208(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class221 arg10) {
        field3170++;
        class189 var13 = class249.method1728(this.field3174, true).method600((class241) null, 0, this.field3166, (byte) 76);
        if (var13 != null) {
            var13.method208(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field3167 = var13.method216();
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "()I")
    public final int method216() {
        field3165++;
        return this.field3167;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIII)V")
    public final void method214(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3172++;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BJ)V")
    public static final void method1196(byte arg0, long arg1) {
        field3164++;
        if (arg1 <= 0L) {
            return;
        }
        if ((arg1 % 10L) == 0L) {
            class247.method1720(arg1 - 1L, true);
            class247.method1720(1L, true);
        } else {
            class247.method1720(arg1, true);
        }
        if (arg0 <= 75) {
            method1196((byte) -25, 65L);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)V")
    public static final void method1197(int arg0, int arg1) {
        class131.field2513 = false;
        class65.field1264 = null;
        class262.field4724 = -1;
        if (arg0 <= 87) {
            return;
        }
        field3180++;
        class61.field1220 = arg1;
        class244.field4428 = 1;
        class54.field1067 = 0;
        class99.field1930 = -1;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1198(int arg0, int arg1, int arg2, int arg3) {
        if (class224.method1579(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class187.method1276(var4 + 1, class271.field4803[arg0][arg1][arg2] + arg3, var5 + 1) && class187.method1276(var4 + 128 - 1, class271.field4803[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class187.method1276(var4 + 128 - 1, class271.field4803[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class187.method1276(var4 + 1, class271.field4803[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILrg;I)V")
    public static final void method1199(int arg0, class227 arg1, int arg2) {
        Object[] var3 = arg1.field4134;
        field3169++;
        int var4 = (Integer) var3[0];
        class144 var5 = class206.method1407(var4, -105);
        if (var5 == null) {
            return;
        }
        class63.field1237 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var5.field2660;
        int[] var9 = var5.field2668;
        int var10 = 0;
        if (arg0 < 44) {
            return;
        }
        byte var11 = -1;
        try {
            class14.field264 = new class209[var5.field2654];
            class191.field3474 = new int[var5.field2670];
            int var12 = 0;
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if ((var3[var14] instanceof Integer)) {
                    int var16 = (Integer) var3[var14];
                    if (var16 == -2147483647) {
                        var16 = arg1.field4147;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg1.field4130;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg1.field4143 == null ? -1 : arg1.field4143.field779;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg1.field4144;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg1.field4143 == null ? -1 : arg1.field4143.field721;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg1.field4136 == null ? -1 : arg1.field4136.field779;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg1.field4136 == null ? -1 : arg1.field4136.field721;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg1.field4131;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg1.field4142;
                    }
                    class191.field3474[var12++] = var16;
                } else if (var3[var14] instanceof class209) {
                    class209 var15 = (class209) var3[var14];
                    if (var15.method1457((byte) -101, class64.field1249)) {
                        var15 = arg1.field4139;
                    }
                    class14.field264[var13++] = var15;
                }
            }
            int var17 = 0;
            label3751: while (true) {
                var17++;
                if (arg2 < var17) {
                    throw new RuntimeException("slow");
                }
                var7++;
                int var487 = var9[var7];
                if (var487 < 100) {
                    if (var487 == 0) {
                        class168.field3030[var10++] = var8[var7];
                        continue;
                    }
                    if (var487 == 1) {
                        int var18 = var8[var7];
                        class168.field3030[var10++] = class38.field647[var18];
                        continue;
                    }
                    if (var487 == 2) {
                        int var19 = var8[var7];
                        var10--;
                        class256.method1768(3, class168.field3030[var10], var19);
                        continue;
                    }
                    if (var487 == 3) {
                        class289.field5106[var6++] = var5.field2663[var7];
                        continue;
                    }
                    if (var487 == 6) {
                        var7 += var8[var7];
                        continue;
                    }
                    if (var487 == 7) {
                        var10 -= 2;
                        if (class168.field3030[var10 + 1] != class168.field3030[var10]) {
                            var7 += var8[var7];
                        }
                        continue;
                    }
                    if (var487 == 8) {
                        var10 -= 2;
                        if (class168.field3030[var10 + 1] == class168.field3030[var10]) {
                            var7 += var8[var7];
                        }
                        continue;
                    }
                    if (var487 == 9) {
                        var10 -= 2;
                        if (class168.field3030[var10 + 1] > class168.field3030[var10]) {
                            var7 += var8[var7];
                        }
                        continue;
                    }
                    if (var487 == 10) {
                        var10 -= 2;
                        if (class168.field3030[var10] > class168.field3030[var10 + 1]) {
                            var7 += var8[var7];
                        }
                        continue;
                    }
                    if (var487 == 21) {
                        if (class63.field1237 == 0) {
                            return;
                        }
                        class84 var20 = class274.field4851[--class63.field1237];
                        var7 = var20.field1671;
                        var5 = var20.field1679;
                        var9 = var5.field2668;
                        class14.field264 = var20.field1676;
                        var8 = var5.field2660;
                        class191.field3474 = var20.field1667;
                        continue;
                    }
                    if (var487 == 25) {
                        int var21 = var8[var7];
                        class168.field3030[var10++] = class177.method1223(var21, false);
                        continue;
                    }
                    if (var487 == 27) {
                        int var22 = var8[var7];
                        var10--;
                        class264.method1809(var22, true, class168.field3030[var10]);
                        continue;
                    }
                    if (var487 == 31) {
                        var10 -= 2;
                        if (class168.field3030[var10 + 1] >= class168.field3030[var10]) {
                            var7 += var8[var7];
                        }
                        continue;
                    }
                    if (var487 == 32) {
                        var10 -= 2;
                        if (class168.field3030[var10] >= class168.field3030[var10 + 1]) {
                            var7 += var8[var7];
                        }
                        continue;
                    }
                    if (var487 == 33) {
                        class168.field3030[var10++] = class191.field3474[var8[var7]];
                        continue;
                    }
                    int var10001;
                    if (var487 == 34) {
                        var10001 = var8[var7];
                        var10--;
                        class191.field3474[var10001] = class168.field3030[var10];
                        continue;
                    }
                    if (var487 == 35) {
                        class289.field5106[var6++] = class14.field264[var8[var7]];
                        continue;
                    }
                    if (var487 == 36) {
                        var10001 = var8[var7];
                        var6--;
                        class14.field264[var10001] = class289.field5106[var6];
                        continue;
                    }
                    if (var487 == 37) {
                        int var23 = var8[var7];
                        var6 -= var23;
                        class209 var24 = class34.method262(class289.field5106, -676, var6, var23);
                        class289.field5106[var6++] = var24;
                        continue;
                    }
                    if (var487 == 38) {
                        var10--;
                        continue;
                    }
                    if (var487 == 39) {
                        var6--;
                        continue;
                    }
                    if (var487 == 40) {
                        int var25 = var8[var7];
                        class144 var26 = class206.method1407(var25, 86);
                        int[] var27 = new int[var26.field2670];
                        class209[] var28 = new class209[var26.field2654];
                        for (int var29 = 0; var29 < var26.field2656; var29++) {
                            var27[var29] = class168.field3030[var10 + var29 - var26.field2656];
                        }
                        for (int var30 = 0; var30 < var26.field2665; var30++) {
                            var28[var30] = class289.field5106[var6 - (var26.field2665 - var30)];
                        }
                        var6 -= var26.field2665;
                        var10 -= var26.field2656;
                        class84 var31 = new class84();
                        var31.field1667 = class191.field3474;
                        var31.field1676 = class14.field264;
                        var31.field1671 = var7;
                        var31.field1679 = var5;
                        if (class63.field1237 >= class274.field4851.length) {
                            throw new RuntimeException();
                        }
                        var5 = var26;
                        var7 = -1;
                        class274.field4851[class63.field1237++] = var31;
                        var8 = var26.field2660;
                        class14.field264 = var28;
                        var9 = var26.field2668;
                        class191.field3474 = var27;
                        continue;
                    }
                    if (var487 == 42) {
                        class168.field3030[var10++] = class182.field3301[var8[var7]];
                        continue;
                    }
                    if (var487 == 43) {
                        int var32 = var8[var7];
                        var10--;
                        class182.field3301[var32] = class168.field3030[var10];
                        class50.method382(127, var32);
                        continue;
                    }
                    if (var487 == 44) {
                        int var33 = var8[var7] >> 16;
                        int var34 = var8[var7] & 0xFFFF;
                        var10--;
                        int var35 = class168.field3030[var10];
                        if (var35 >= 0 && var35 <= 5000) {
                            class36.field629[var33] = var35;
                            byte var36 = -1;
                            if (var34 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var35 <= var37) {
                                    continue label3751;
                                }
                                class209.field3812[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var487 == 45) {
                        int var38 = var8[var7];
                        var10--;
                        int var39 = class168.field3030[var10];
                        if (var39 >= 0 && class36.field629[var38] > var39) {
                            class168.field3030[var10++] = class209.field3812[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var487 == 46) {
                        var10 -= 2;
                        int var40 = class168.field3030[var10];
                        int var41 = var8[var7];
                        if (var40 >= 0 && var40 < class36.field629[var41]) {
                            class209.field3812[var41][var40] = class168.field3030[var10 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var487 == 47) {
                        class209 var42 = class92.field1819[var8[var7]];
                        if (var42 == null) {
                            var42 = class9.field172;
                        }
                        class289.field5106[var6++] = var42;
                        continue;
                    }
                    if (var487 == 48) {
                        int var43 = var8[var7];
                        var6--;
                        class92.field1819[var43] = class289.field5106[var6];
                        class74.method527((byte) 100, var43);
                        continue;
                    }
                    if (var487 == 51) {
                        class255 var44 = var5.field2651[var8[var7]];
                        var10--;
                        class18 var45 = (class18) var44.method1755((long) class168.field3030[var10], (byte) -104);
                        if (var45 != null) {
                            var7 += var45.field363;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var8[var7] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var487 < 300) {
                    if (var487 == 100) {
                        var10 -= 3;
                        int var466 = class168.field3030[var10 + 1];
                        int var467 = class168.field3030[var10];
                        int var468 = class168.field3030[var10 + 2];
                        if (var466 == 0) {
                            throw new RuntimeException();
                        }
                        class42 var469 = class247.method1719(var467, -8667);
                        if (var469.field762 == null) {
                            var469.field762 = new class42[var468 + 1];
                        }
                        if (var468 >= var469.field762.length) {
                            class42[] var470 = new class42[var468 + 1];
                            for (int var471 = 0; var471 < var469.field762.length; var471++) {
                                var470[var471] = var469.field762[var471];
                            }
                            var469.field762 = var470;
                        }
                        if (var468 > 0 && var469.field762[var468 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var468 - 1));
                        }
                        class42 var472 = new class42();
                        var472.field721 = var468;
                        var472.field710 = var472.field779 = var469.field779;
                        var472.field810 = var466;
                        var472.field795 = true;
                        var469.field762[var468] = var472;
                        if (var46) {
                            class109.field2187 = var472;
                        } else {
                            class37.field644 = var472;
                        }
                        class126.method907(var469, 0);
                        continue;
                    }
                    if (var487 == 101) {
                        class42 var473 = var46 ? class109.field2187 : class37.field644;
                        if (var473.field721 == -1) {
                            if (var46) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class42 var474 = class247.method1719(var473.field779, -8667);
                        var474.field762[var473.field721] = null;
                        class126.method907(var474, 0);
                        continue;
                    }
                    if (var487 == 102) {
                        var10--;
                        class42 var475 = class247.method1719(class168.field3030[var10], -8667);
                        var475.field762 = null;
                        class126.method907(var475, 0);
                        continue;
                    }
                    if (var487 == 200) {
                        var10 -= 2;
                        int var476 = class168.field3030[var10];
                        int var477 = class168.field3030[var10 + 1];
                        class42 var478 = class116.method827(var477, (byte) 89, var476);
                        if (var478 != null && var477 != -1) {
                            class168.field3030[var10++] = 1;
                            if (var46) {
                                class109.field2187 = var478;
                            } else {
                                class37.field644 = var478;
                            }
                            continue;
                        }
                        class168.field3030[var10++] = 0;
                        continue;
                    }
                    if (var487 == 201) {
                        var10--;
                        int var479 = class168.field3030[var10];
                        class42 var480 = class247.method1719(var479, -8667);
                        if (var480 == null) {
                            class168.field3030[var10++] = 0;
                        } else {
                            class168.field3030[var10++] = 1;
                            if (var46) {
                                class109.field2187 = var480;
                            } else {
                                class37.field644 = var480;
                            }
                        }
                        continue;
                    }
                } else if (var487 < 500) {
                    if (var487 == 403) {
                        var10 -= 2;
                        int var47 = class168.field3030[var10 + 1];
                        int var48 = class168.field3030[var10];
                        if (var48 >= 7) {
                            var48 -= 7;
                        }
                        class223.field4069.field2142.method949(var48, var47, 9730);
                        continue;
                    }
                    if (var487 == 404) {
                        var10 -= 2;
                        int var49 = class168.field3030[var10];
                        int var50 = class168.field3030[var10 + 1];
                        class223.field4069.field2142.method959(-117, var50, var49);
                        continue;
                    }
                    if (var487 == 410) {
                        var10--;
                        boolean var51 = class168.field3030[var10] != 0;
                        class223.field4069.field2142.method952(var51, (byte) 114);
                        continue;
                    }
                } else if (var487 >= 1000 && var487 < 1100 || var487 >= 2000 && var487 < 2100) {
                    class42 var460;
                    if (var487 >= 2000) {
                        var10--;
                        var460 = class247.method1719(class168.field3030[var10], -8667);
                        var487 -= 1000;
                    } else {
                        var460 = var46 ? class109.field2187 : class37.field644;
                    }
                    if (var487 == 1000) {
                        var10 -= 4;
                        var460.field750 = class168.field3030[var10];
                        var460.field754 = class168.field3030[var10 + 1];
                        int var461 = class168.field3030[var10 + 2];
                        int var462 = class168.field3030[var10 + 3];
                        if (var461 < 0) {
                            var461 = 0;
                        } else if (var461 > 5) {
                            var461 = 5;
                        }
                        var460.field813 = (byte) var461;
                        if (var462 < 0) {
                            var462 = 0;
                        } else if (var462 > 5) {
                            var462 = 5;
                        }
                        var460.field720 = (byte) var462;
                        class126.method907(var460, 0);
                        class182.method1244(var460, 9542);
                        if (var460.field721 == -1) {
                            class241.method1665(var460.field779, 5);
                        }
                        continue;
                    }
                    if (var487 == 1001) {
                        var10 -= 4;
                        var460.field808 = class168.field3030[var10];
                        var460.field853 = class168.field3030[var10 + 1];
                        var460.field728 = 0;
                        var460.field716 = 0;
                        int var463 = class168.field3030[var10 + 2];
                        if (var463 < 0) {
                            var463 = 0;
                        } else if (var463 > 4) {
                            var463 = 4;
                        }
                        int var464 = class168.field3030[var10 + 3];
                        var460.field791 = (byte) var463;
                        if (var464 < 0) {
                            var464 = 0;
                        } else if (var464 > 4) {
                            var464 = 4;
                        }
                        var460.field693 = (byte) var464;
                        class126.method907(var460, 0);
                        class182.method1244(var460, 9542);
                        if (var460.field810 == 0) {
                            class224.method1580(-19451, false, var460);
                        }
                        continue;
                    }
                    if (var487 == 1003) {
                        var10--;
                        boolean var465 = class168.field3030[var10] == 1;
                        if (var465 != var460.field706) {
                            var460.field706 = var465;
                            class126.method907(var460, 0);
                        }
                        if (var460.field721 == -1) {
                            class216.method1517(var460.field779, (byte) 52);
                        }
                        continue;
                    }
                    if (var487 == 1004) {
                        var10 -= 2;
                        var460.field723 = class168.field3030[var10];
                        var460.field804 = class168.field3030[var10 + 1];
                        class126.method907(var460, 0);
                        class182.method1244(var460, 9542);
                        if (var460.field810 == 0) {
                            class224.method1580(-19451, false, var460);
                        }
                        continue;
                    }
                } else if (var487 >= 1100 && var487 < 1200 || var487 >= 2100 && var487 < 2200) {
                    class42 var52;
                    if (var487 < 2000) {
                        var52 = var46 ? class109.field2187 : class37.field644;
                    } else {
                        var487 -= 1000;
                        var10--;
                        var52 = class247.method1719(class168.field3030[var10], -8667);
                    }
                    if (var487 == 1100) {
                        var10 -= 2;
                        var52.field696 = class168.field3030[var10];
                        if ((var52.field733 - var52.field789) < var52.field696) {
                            var52.field696 = var52.field733 - var52.field789;
                        }
                        if (var52.field696 < 0) {
                            var52.field696 = 0;
                        }
                        var52.field819 = class168.field3030[var10 + 1];
                        if (var52.field819 > var52.field782 - var52.field758) {
                            var52.field819 = var52.field782 - var52.field758;
                        }
                        if (var52.field819 < 0) {
                            var52.field819 = 0;
                        }
                        class126.method907(var52, 0);
                        if (var52.field721 == -1) {
                            class277.method1880(var52.field779, -114);
                        }
                        continue;
                    }
                    if (var487 == 1101) {
                        var10--;
                        var52.field727 = class168.field3030[var10];
                        class126.method907(var52, 0);
                        if (var52.field721 == -1) {
                            class79.method561(var52.field779, (byte) 69);
                        }
                        continue;
                    }
                    if (var487 == 1102) {
                        var10--;
                        var52.field718 = class168.field3030[var10] == 1;
                        class126.method907(var52, 0);
                        continue;
                    }
                    if (var487 == 1103) {
                        var10--;
                        var52.field765 = class168.field3030[var10];
                        class126.method907(var52, 0);
                        continue;
                    }
                    if (var487 == 1104) {
                        var10--;
                        var52.field704 = class168.field3030[var10];
                        class126.method907(var52, 0);
                        continue;
                    }
                    if (var487 == 1105) {
                        var10--;
                        var52.field725 = class168.field3030[var10];
                        class126.method907(var52, 0);
                        continue;
                    }
                    if (var487 == 1106) {
                        var10--;
                        var52.field840 = class168.field3030[var10];
                        class126.method907(var52, 0);
                        continue;
                    }
                    if (var487 == 1107) {
                        var10--;
                        var52.field846 = class168.field3030[var10] == 1;
                        class126.method907(var52, 0);
                        continue;
                    }
                    if (var487 == 1108) {
                        var52.field769 = 1;
                        var10--;
                        var52.field798 = class168.field3030[var10];
                        class126.method907(var52, 0);
                        if (var52.field721 == -1) {
                            class165.method1144(var52.field779, -102);
                        }
                        continue;
                    }
                    if (var487 == 1109) {
                        var10 -= 6;
                        var52.field802 = class168.field3030[var10];
                        var52.field817 = class168.field3030[var10 + 1];
                        var52.field773 = class168.field3030[var10 + 2];
                        var52.field748 = class168.field3030[var10 + 3];
                        var52.field837 = class168.field3030[var10 + 4];
                        var52.field712 = class168.field3030[var10 + 5];
                        class126.method907(var52, 0);
                        if (var52.field721 == -1) {
                            class190.method1308(22378, var52.field779);
                            class69.method511(var52.field779, (byte) -73);
                        }
                        continue;
                    }
                    if (var487 == 1110) {
                        var10--;
                        int var53 = class168.field3030[var10];
                        if (var52.field850 != var53) {
                            var52.field805 = 0;
                            var52.field850 = var53;
                            var52.field815 = 0;
                            class126.method907(var52, 0);
                        }
                        if (var52.field721 == -1) {
                            class63.method469(var52.field779, false);
                        }
                        continue;
                    }
                    if (var487 == 1111) {
                        var10--;
                        var52.field841 = class168.field3030[var10] == 1;
                        class126.method907(var52, 0);
                        continue;
                    }
                    if (var487 == 1112) {
                        var6--;
                        class209 var54 = class289.field5106[var6];
                        if (!var54.method1457((byte) -122, var52.field820)) {
                            var52.field820 = var54;
                            class126.method907(var52, 0);
                        }
                        if (var52.field721 == -1) {
                            class266.method1817(var52.field779, 202);
                        }
                        continue;
                    }
                    if (var487 == 1113) {
                        var10--;
                        var52.field692 = class168.field3030[var10];
                        class126.method907(var52, 0);
                        continue;
                    }
                    if (var487 == 1114) {
                        var10 -= 3;
                        var52.field767 = class168.field3030[var10];
                        var52.field694 = class168.field3030[var10 + 1];
                        var52.field847 = class168.field3030[var10 + 2];
                        class126.method907(var52, 0);
                        continue;
                    }
                    if (var487 == 1115) {
                        var10--;
                        var52.field742 = class168.field3030[var10] == 1;
                        class126.method907(var52, 0);
                        continue;
                    }
                    if (var487 == 1116) {
                        var10--;
                        var52.field812 = class168.field3030[var10];
                        class126.method907(var52, 0);
                        continue;
                    }
                    if (var487 == 1117) {
                        var10--;
                        var52.field851 = class168.field3030[var10];
                        class126.method907(var52, 0);
                        continue;
                    }
                    if (var487 == 1118) {
                        var10--;
                        var52.field713 = class168.field3030[var10] == 1;
                        class126.method907(var52, 0);
                        continue;
                    }
                    if (var487 == 1119) {
                        var10--;
                        var52.field784 = class168.field3030[var10] == 1;
                        class126.method907(var52, 0);
                        continue;
                    }
                    if (var487 == 1120) {
                        var10 -= 2;
                        var52.field733 = class168.field3030[var10];
                        var52.field782 = class168.field3030[var10 + 1];
                        class126.method907(var52, 0);
                        if (var52.field810 == 0) {
                            class224.method1580(-19451, false, var52);
                        }
                        continue;
                    }
                    if (var487 == 1121) {
                        class126.method907(var52, 0);
                        var10 -= 2;
                        continue;
                    }
                    if (var487 == 1122) {
                        var10--;
                        var52.field719 = class168.field3030[var10] == 1;
                        class126.method907(var52, 0);
                        continue;
                    }
                    if (var487 == 1123) {
                        var10--;
                        var52.field712 = class168.field3030[var10];
                        class126.method907(var52, 0);
                        if (var52.field721 == -1) {
                            class190.method1308(22378, var52.field779);
                        }
                        continue;
                    }
                } else if (var487 >= 1200 && var487 < 1300 || var487 >= 2200 && var487 < 2300) {
                    class42 var55;
                    if (var487 >= 2000) {
                        var487 -= 1000;
                        var10--;
                        var55 = class247.method1719(class168.field3030[var10], -8667);
                    } else {
                        var55 = var46 ? class109.field2187 : class37.field644;
                    }
                    class126.method907(var55, 0);
                    if (var487 == 1200 || var487 == 1205) {
                        var10 -= 2;
                        int var56 = class168.field3030[var10];
                        int var57 = class168.field3030[var10 + 1];
                        if (var55.field721 == -1) {
                            class266.method1821((byte) 69, var55.field779);
                            class190.method1308(22378, var55.field779);
                            class69.method511(var55.field779, (byte) -73);
                        }
                        if (var56 == -1) {
                            var55.field699 = -1;
                            var55.field769 = 1;
                            var55.field798 = -1;
                        } else {
                            var55.field699 = var56;
                            var55.field818 = var57;
                            class82 var58 = class249.method1728(var56, true);
                            var55.field817 = var58.field1596;
                            var55.field773 = var58.field1630;
                            var55.field712 = var58.field1640;
                            var55.field802 = var58.field1616;
                            var55.field748 = var58.field1618;
                            if (var487 == 1205) {
                                var55.field833 = false;
                            } else {
                                var55.field833 = true;
                            }
                            if (var55.field716 > 0) {
                                var55.field712 = var55.field712 * 32 / var55.field716;
                            } else if (var55.field808 > 0) {
                                var55.field712 = var55.field712 * 32 / var55.field808;
                            }
                            var55.field837 = var58.field1590;
                        }
                        continue;
                    }
                    if (var487 == 1201) {
                        var55.field769 = 2;
                        var10--;
                        var55.field798 = class168.field3030[var10];
                        if (var55.field721 == -1) {
                            class165.method1144(var55.field779, -124);
                        }
                        continue;
                    }
                    if (var487 == 1202) {
                        var55.field769 = 3;
                        var55.field798 = class223.field4069.field2142.method960(14486);
                        if (var55.field721 == -1) {
                            class165.method1144(var55.field779, -75);
                        }
                        continue;
                    }
                    if (var487 == 1203) {
                        var55.field769 = 6;
                        var10--;
                        var55.field798 = class168.field3030[var10];
                        if (var55.field721 == -1) {
                            class165.method1144(var55.field779, -52);
                        }
                        continue;
                    }
                    if (var487 == 1204) {
                        var55.field769 = 5;
                        var10--;
                        var55.field798 = class168.field3030[var10];
                        if (var55.field721 == -1) {
                            class165.method1144(var55.field779, -94);
                        }
                        continue;
                    }
                } else if (var487 >= 1300 && var487 < 1400 || var487 >= 2300 && var487 < 2400) {
                    class42 var456;
                    if (var487 < 2000) {
                        var456 = var46 ? class109.field2187 : class37.field644;
                    } else {
                        var10--;
                        var456 = class247.method1719(class168.field3030[var10], -8667);
                        var487 -= 1000;
                    }
                    if (var487 == 1300) {
                        var10--;
                        int var457 = class168.field3030[var10] - 1;
                        if (var457 >= 0 && var457 <= 9) {
                            var6--;
                            var456.method312(var457, class289.field5106[var6], (byte) -126);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var487 == 1301) {
                        var10 -= 2;
                        int var458 = class168.field3030[var10];
                        int var459 = class168.field3030[var10 + 1];
                        var456.field774 = class116.method827(var459, (byte) 103, var458);
                        continue;
                    }
                    if (var487 == 1302) {
                        var10--;
                        var456.field785 = class168.field3030[var10] == 1;
                        continue;
                    }
                    if (var487 == 1303) {
                        var10--;
                        var456.field763 = class168.field3030[var10];
                        continue;
                    }
                    if (var487 == 1304) {
                        var10--;
                        var456.field714 = class168.field3030[var10];
                        continue;
                    }
                    if (var487 == 1305) {
                        var6--;
                        var456.field799 = class289.field5106[var6];
                        continue;
                    }
                    if (var487 == 1306) {
                        var6--;
                        var456.field760 = class289.field5106[var6];
                        continue;
                    }
                    if (var487 == 1307) {
                        var456.field825 = null;
                        continue;
                    }
                } else {
                    if (var487 >= 1400 && var487 < 1500 || var487 >= 2400 && var487 < 2500) {
                        int[] var449 = null;
                        class42 var450;
                        if (var487 < 2000) {
                            var450 = var46 ? class109.field2187 : class37.field644;
                        } else {
                            var487 -= 1000;
                            var10--;
                            var450 = class247.method1719(class168.field3030[var10], -8667);
                        }
                        var6--;
                        class209 var451 = class289.field5106[var6];
                        if (var451.method1486(5) > 0 && var451.method1491(111, var451.method1486(5) - 1) == 89) {
                            var10--;
                            int var452 = class168.field3030[var10];
                            if (var452 > 0) {
                                var449 = new int[var452];
                                while ((var452--) > 0) {
                                    var10--;
                                    var449[var452] = class168.field3030[var10];
                                }
                            }
                            var451 = var451.method1466(123, var451.method1486(5) - 1, 0);
                        }
                        Object[] var453 = new Object[var451.method1486(5) + 1];
                        for (int var454 = var453.length - 1; var454 >= 1; var454--) {
                            if (var451.method1491(111, var454 - 1) == 115) {
                                var6--;
                                var453[var454] = class289.field5106[var6];
                            } else {
                                var10--;
                                var453[var454] = Integer.valueOf(class168.field3030[var10]);
                            }
                        }
                        var10--;
                        int var455 = class168.field3030[var10];
                        if (var455 == -1) {
                            var453 = null;
                        } else {
                            var453[0] = Integer.valueOf(var455);
                        }
                        var450.field737 = true;
                        if (var487 == 1400) {
                            var450.field724 = var453;
                        } else if (var487 == 1401) {
                            var450.field809 = var453;
                        } else if (var487 == 1402) {
                            var450.field729 = var453;
                        } else if (var487 == 1403) {
                            var450.field786 = var453;
                        } else if (var487 == 1404) {
                            var450.field731 = var453;
                        } else if (var487 == 1405) {
                            var450.field701 = var453;
                        } else if (var487 == 1406) {
                            var450.field736 = var453;
                        } else if (var487 == 1407) {
                            var450.field771 = var449;
                            var450.field744 = var453;
                        } else if (var487 == 1408) {
                            var450.field823 = var453;
                        } else if (var487 == 1409) {
                            var450.field717 = var453;
                        } else if (var487 == 1410) {
                            var450.field793 = var453;
                        } else if (var487 == 1411) {
                            var450.field796 = var453;
                        } else if (var487 == 1412) {
                            var450.field770 = var453;
                        } else if (var487 == 1414) {
                            var450.field768 = var449;
                            var450.field839 = var453;
                        } else if (var487 == 1415) {
                            var450.field792 = var453;
                            var450.field848 = var449;
                        } else if (var487 == 1416) {
                            var450.field711 = var453;
                        } else if (var487 == 1417) {
                            var450.field777 = var453;
                        } else if (var487 == 1418) {
                            var450.field709 = var453;
                        } else if (var487 == 1419) {
                            var450.field852 = var453;
                        } else if (var487 == 1420) {
                            var450.field842 = var453;
                        } else if (var487 == 1421) {
                            var450.field772 = var453;
                        } else if (var487 == 1422) {
                            var450.field776 = var453;
                        } else if (var487 == 1423) {
                            var450.field835 = var453;
                        } else if (var487 == 1424) {
                            var450.field705 = var453;
                        } else if (var487 == 1425) {
                            var450.field734 = var453;
                        } else if (var487 == 1426) {
                            var450.field822 = var453;
                        } else if (var487 == 1427) {
                            var450.field700 = var453;
                        } else if (var487 == 1428) {
                            var450.field787 = var453;
                            var450.field845 = var449;
                        } else if (var487 == 1429) {
                            var450.field830 = var453;
                            var450.field726 = var449;
                        }
                        continue;
                    }
                    if (var487 < 1600) {
                        class42 var448 = var46 ? class109.field2187 : class37.field644;
                        if (var487 == 1500) {
                            class168.field3030[var10++] = var448.field801;
                            continue;
                        }
                        if (var487 == 1501) {
                            class168.field3030[var10++] = var448.field756;
                            continue;
                        }
                        if (var487 == 1502) {
                            class168.field3030[var10++] = var448.field789;
                            continue;
                        }
                        if (var487 == 1503) {
                            class168.field3030[var10++] = var448.field758;
                            continue;
                        }
                        if (var487 == 1504) {
                            class168.field3030[var10++] = var448.field706 ? 1 : 0;
                            continue;
                        }
                        if (var487 == 1505) {
                            class168.field3030[var10++] = var448.field710;
                            continue;
                        }
                    } else if (var487 < 1700) {
                        class42 var447 = var46 ? class109.field2187 : class37.field644;
                        if (var487 == 1600) {
                            class168.field3030[var10++] = var447.field696;
                            continue;
                        }
                        if (var487 == 1601) {
                            class168.field3030[var10++] = var447.field819;
                            continue;
                        }
                        if (var487 == 1602) {
                            class289.field5106[var6++] = var447.field820;
                            continue;
                        }
                        if (var487 == 1603) {
                            class168.field3030[var10++] = var447.field733;
                            continue;
                        }
                        if (var487 == 1604) {
                            class168.field3030[var10++] = var447.field782;
                            continue;
                        }
                        if (var487 == 1605) {
                            class168.field3030[var10++] = var447.field712;
                            continue;
                        }
                        if (var487 == 1606) {
                            class168.field3030[var10++] = var447.field773;
                            continue;
                        }
                        if (var487 == 1607) {
                            class168.field3030[var10++] = var447.field837;
                            continue;
                        }
                        if (var487 == 1608) {
                            class168.field3030[var10++] = var447.field748;
                            continue;
                        }
                        if (var487 == 1609) {
                            class168.field3030[var10++] = var447.field765;
                            continue;
                        }
                        if (var487 == 1610) {
                            class168.field3030[var10++] = var447.field802;
                            continue;
                        }
                        if (var487 == 1611) {
                            class168.field3030[var10++] = var447.field817;
                            continue;
                        }
                    } else if (var487 < 1800) {
                        class42 var446 = var46 ? class109.field2187 : class37.field644;
                        if (var487 == 1700) {
                            class168.field3030[var10++] = var446.field699;
                            continue;
                        }
                        if (var487 == 1701) {
                            if (var446.field699 == -1) {
                                class168.field3030[var10++] = 0;
                            } else {
                                class168.field3030[var10++] = var446.field818;
                            }
                            continue;
                        }
                        if (var487 == 1702) {
                            class168.field3030[var10++] = var446.field721;
                            continue;
                        }
                    } else if (var487 < 1900) {
                        class42 var444 = var46 ? class109.field2187 : class37.field644;
                        if (var487 == 1800) {
                            class168.field3030[var10++] = class14.method108(43, client.method1070(var444));
                            continue;
                        }
                        if (var487 == 1801) {
                            var10--;
                            int var445 = class168.field3030[var10];
                            int var489 = var445 - 1;
                            if (var444.field825 != null && var489 < var444.field825.length && var444.field825[var489] != null) {
                                class289.field5106[var6++] = var444.field825[var489];
                                continue;
                            }
                            class289.field5106[var6++] = class37.field645;
                            continue;
                        }
                        if (var487 == 1802) {
                            if (var444.field799 == null) {
                                class289.field5106[var6++] = class37.field645;
                            } else {
                                class289.field5106[var6++] = var444.field799;
                            }
                            continue;
                        }
                    } else if (var487 < 2600) {
                        var10--;
                        class42 var443 = class247.method1719(class168.field3030[var10], -8667);
                        if (var487 == 2500) {
                            class168.field3030[var10++] = var443.field801;
                            continue;
                        }
                        if (var487 == 2501) {
                            class168.field3030[var10++] = var443.field756;
                            continue;
                        }
                        if (var487 == 2502) {
                            class168.field3030[var10++] = var443.field789;
                            continue;
                        }
                        if (var487 == 2503) {
                            class168.field3030[var10++] = var443.field758;
                            continue;
                        }
                        if (var487 == 2504) {
                            class168.field3030[var10++] = var443.field706 ? 1 : 0;
                            continue;
                        }
                        if (var487 == 2505) {
                            class168.field3030[var10++] = var443.field710;
                            continue;
                        }
                    } else if (var487 < 2700) {
                        var10--;
                        class42 var442 = class247.method1719(class168.field3030[var10], -8667);
                        if (var487 == 2600) {
                            class168.field3030[var10++] = var442.field696;
                            continue;
                        }
                        if (var487 == 2601) {
                            class168.field3030[var10++] = var442.field819;
                            continue;
                        }
                        if (var487 == 2602) {
                            class289.field5106[var6++] = var442.field820;
                            continue;
                        }
                        if (var487 == 2603) {
                            class168.field3030[var10++] = var442.field733;
                            continue;
                        }
                        if (var487 == 2604) {
                            class168.field3030[var10++] = var442.field782;
                            continue;
                        }
                        if (var487 == 2605) {
                            class168.field3030[var10++] = var442.field712;
                            continue;
                        }
                        if (var487 == 2606) {
                            class168.field3030[var10++] = var442.field773;
                            continue;
                        }
                        if (var487 == 2607) {
                            class168.field3030[var10++] = var442.field837;
                            continue;
                        }
                        if (var487 == 2608) {
                            class168.field3030[var10++] = var442.field748;
                            continue;
                        }
                        if (var487 == 2609) {
                            class168.field3030[var10++] = var442.field765;
                            continue;
                        }
                        if (var487 == 2610) {
                            class168.field3030[var10++] = var442.field802;
                            continue;
                        }
                        if (var487 == 2611) {
                            class168.field3030[var10++] = var442.field817;
                            continue;
                        }
                    } else if (var487 < 2800) {
                        if (var487 == 2700) {
                            var10--;
                            class42 var59 = class247.method1719(class168.field3030[var10], -8667);
                            class168.field3030[var10++] = var59.field699;
                            continue;
                        }
                        if (var487 == 2701) {
                            var10--;
                            class42 var60 = class247.method1719(class168.field3030[var10], -8667);
                            if (var60.field699 == -1) {
                                class168.field3030[var10++] = 0;
                            } else {
                                class168.field3030[var10++] = var60.field818;
                            }
                            continue;
                        }
                        if (var487 == 2702) {
                            var10--;
                            int var61 = class168.field3030[var10];
                            class97 var62 = (class97) class114.field2288.method1755((long) var61, (byte) -77);
                            if (var62 == null) {
                                class168.field3030[var10++] = 0;
                            } else {
                                class168.field3030[var10++] = 1;
                            }
                            continue;
                        }
                        if (var487 == 2703) {
                            var10--;
                            class42 var63 = class247.method1719(class168.field3030[var10], -8667);
                            if (var63.field762 == null) {
                                class168.field3030[var10++] = 0;
                                continue;
                            }
                            int var64 = var63.field762.length;
                            for (int var65 = 0; var65 < var63.field762.length; var65++) {
                                if (var63.field762[var65] == null) {
                                    var64 = var65;
                                    break;
                                }
                            }
                            class168.field3030[var10++] = var64;
                            continue;
                        }
                        if (var487 == 2704 || var487 == 2705) {
                            var10 -= 2;
                            int var66 = class168.field3030[var10 + 1];
                            int var67 = class168.field3030[var10];
                            class97 var68 = (class97) class114.field2288.method1755((long) var67, (byte) -125);
                            if (var68 != null && var68.field1895 == var66) {
                                class168.field3030[var10++] = 1;
                                continue;
                            }
                            class168.field3030[var10++] = 0;
                            continue;
                        }
                    } else if (var487 < 2900) {
                        var10--;
                        class42 var69 = class247.method1719(class168.field3030[var10], -8667);
                        if (var487 == 2800) {
                            class168.field3030[var10++] = class14.method108(-98, client.method1070(var69));
                            continue;
                        }
                        if (var487 == 2801) {
                            var10--;
                            int var70 = class168.field3030[var10];
                            int var488 = var70 - 1;
                            if (var69.field825 != null && var69.field825.length > var488 && var69.field825[var488] != null) {
                                class289.field5106[var6++] = var69.field825[var488];
                                continue;
                            }
                            class289.field5106[var6++] = class37.field645;
                            continue;
                        }
                        if (var487 == 2802) {
                            if (var69.field799 == null) {
                                class289.field5106[var6++] = class37.field645;
                            } else {
                                class289.field5106[var6++] = var69.field799;
                            }
                            continue;
                        }
                    } else if (var487 < 3200) {
                        if (var487 == 3100) {
                            var6--;
                            class209 var427 = class289.field5106[var6];
                            class238.method1649((byte) -126, class37.field645, 0, var427);
                            continue;
                        }
                        if (var487 == 3101) {
                            var10 -= 2;
                            class227.method1596(class168.field3030[var10 + 1], false, class223.field4069, class168.field3030[var10]);
                            continue;
                        }
                        if (var487 == 3103) {
                            class249.method1732((byte) -27);
                            continue;
                        }
                        if (var487 == 3104) {
                            var6--;
                            class209 var428 = class289.field5106[var6];
                            field3168++;
                            int var429 = 0;
                            if (var428.method1487(0)) {
                                var429 = var428.method1477((byte) 110);
                            }
                            class84.field1677.method287((byte) 122, 20);
                            class84.field1677.method758(var429, 1469334200);
                            continue;
                        }
                        if (var487 == 3105) {
                            class207.field3692++;
                            var6--;
                            class209 var430 = class289.field5106[var6];
                            class84.field1677.method287((byte) 126, 3);
                            class84.field1677.method756(var430.method1448(true), (byte) 100);
                            continue;
                        }
                        if (var487 == 3106) {
                            class148.field2715++;
                            var6--;
                            class209 var431 = class289.field5106[var6];
                            class84.field1677.method287((byte) 118, 120);
                            class84.field1677.method773(-6385, var431.method1486(5) + 1);
                            class84.field1677.method745(var431, (byte) 119);
                            continue;
                        }
                        if (var487 == 3107) {
                            var10--;
                            int var432 = class168.field3030[var10];
                            var6--;
                            class209 var433 = class289.field5106[var6];
                            class85.method613(var432, (byte) 86, var433);
                            continue;
                        }
                        if (var487 == 3108) {
                            var10 -= 3;
                            int var434 = class168.field3030[var10];
                            int var435 = class168.field3030[var10 + 1];
                            int var436 = class168.field3030[var10 + 2];
                            class42 var437 = class247.method1719(var436, -8667);
                            class109.method790(var435, var434, 255, var437);
                            continue;
                        }
                        if (var487 == 3109) {
                            var10 -= 2;
                            int var438 = class168.field3030[var10];
                            int var439 = class168.field3030[var10 + 1];
                            class42 var440 = var46 ? class109.field2187 : class37.field644;
                            class109.method790(var439, var438, 255, var440);
                            continue;
                        }
                        if (var487 == 3110) {
                            class104.field2015++;
                            var10--;
                            int var441 = class168.field3030[var10];
                            class84.field1677.method287((byte) 123, 181);
                            class84.field1677.method740(255, var441);
                            continue;
                        }
                    } else if (var487 < 3300) {
                        if (var487 == 3200) {
                            var10 -= 3;
                            class228.method1600(-110, class168.field3030[var10], class168.field3030[var10 + 1], class168.field3030[var10 + 2]);
                            continue;
                        }
                        if (var487 == 3201) {
                            var10--;
                            class204.method1396(class168.field3030[var10], false);
                            continue;
                        }
                        if (var487 == 3202) {
                            var10 -= 2;
                            class14.method106(120, class168.field3030[var10 + 1], class168.field3030[var10]);
                            continue;
                        }
                    } else if (var487 < 3400) {
                        if (var487 == 3300) {
                            class168.field3030[var10++] = class163.field2968;
                            continue;
                        }
                        if (var487 == 3301) {
                            var10 -= 2;
                            int var71 = class168.field3030[var10 + 1];
                            int var72 = class168.field3030[var10];
                            class168.field3030[var10++] = class155.method1085(var72, var71, -8149);
                            continue;
                        }
                        if (var487 == 3302) {
                            var10 -= 2;
                            int var73 = class168.field3030[var10];
                            int var74 = class168.field3030[var10 + 1];
                            class168.field3030[var10++] = class199.method1362(var74, (byte) -119, var73);
                            continue;
                        }
                        if (var487 == 3303) {
                            var10 -= 2;
                            int var75 = class168.field3030[var10];
                            int var76 = class168.field3030[var10 + 1];
                            class168.field3030[var10++] = class86.method617(12860, var76, var75);
                            continue;
                        }
                        if (var487 == 3304) {
                            var10--;
                            int var77 = class168.field3030[var10];
                            class168.field3030[var10++] = class134.method938(var77, -106).field2602;
                            continue;
                        }
                        if (var487 == 3305) {
                            var10--;
                            int var78 = class168.field3030[var10];
                            class168.field3030[var10++] = class170.field3116[var78];
                            continue;
                        }
                        if (var487 == 3306) {
                            var10--;
                            int var79 = class168.field3030[var10];
                            class168.field3030[var10++] = class198.field3548[var79];
                            continue;
                        }
                        if (var487 == 3307) {
                            var10--;
                            int var80 = class168.field3030[var10];
                            class168.field3030[var10++] = class104.field2011[var80];
                            continue;
                        }
                        if (var487 == 3308) {
                            int var81 = (class223.field4069.field1571 >> 7) + field3178;
                            int var82 = class99.field1937;
                            int var83 = (class223.field4069.field1534 >> 7) + class245.field4444;
                            class168.field3030[var10++] = (var82 << 28) + (var81 << 14) + var83;
                            continue;
                        }
                        if (var487 == 3309) {
                            var10--;
                            int var84 = class168.field3030[var10];
                            class168.field3030[var10++] = class27.method220(var84 >> 14, 16383);
                            continue;
                        }
                        if (var487 == 3310) {
                            var10--;
                            int var85 = class168.field3030[var10];
                            class168.field3030[var10++] = var85 >> 28;
                            continue;
                        }
                        if (var487 == 3311) {
                            var10--;
                            int var86 = class168.field3030[var10];
                            class168.field3030[var10++] = class27.method220(16383, var86);
                            continue;
                        }
                        if (var487 == 3312) {
                            class168.field3030[var10++] = class90.field1761 ? 1 : 0;
                            continue;
                        }
                        if (var487 == 3313) {
                            var10 -= 2;
                            int var87 = class168.field3030[var10 + 1];
                            int var88 = class168.field3030[var10] + 32768;
                            class168.field3030[var10++] = class155.method1085(var88, var87, -8149);
                            continue;
                        }
                        if (var487 == 3314) {
                            var10 -= 2;
                            int var89 = class168.field3030[var10 + 1];
                            int var90 = class168.field3030[var10] + 32768;
                            class168.field3030[var10++] = class199.method1362(var89, (byte) -112, var90);
                            continue;
                        }
                        if (var487 == 3315) {
                            var10 -= 2;
                            int var91 = class168.field3030[var10] + 32768;
                            int var92 = class168.field3030[var10 + 1];
                            class168.field3030[var10++] = class86.method617(12860, var92, var91);
                            continue;
                        }
                        if (var487 == 3316) {
                            if (class198.field3550 >= 2) {
                                class168.field3030[var10++] = class198.field3550;
                            } else {
                                class168.field3030[var10++] = 0;
                            }
                            continue;
                        }
                        if (var487 == 3317) {
                            class168.field3030[var10++] = class59.field1188;
                            continue;
                        }
                        if (var487 == 3318) {
                            class168.field3030[var10++] = class37.field646;
                            continue;
                        }
                        if (var487 == 3321) {
                            class168.field3030[var10++] = class109.field2192;
                            continue;
                        }
                        if (var487 == 3322) {
                            class168.field3030[var10++] = class117.field2339;
                            continue;
                        }
                        if (var487 == 3323) {
                            if (class224.field4084 >= 5 && class224.field4084 <= 9) {
                                class168.field3030[var10++] = 1;
                                continue;
                            }
                            class168.field3030[var10++] = 0;
                            continue;
                        }
                        if (var487 == 3324) {
                            if (class224.field4084 >= 5 && class224.field4084 <= 9) {
                                class168.field3030[var10++] = class224.field4084;
                                continue;
                            }
                            class168.field3030[var10++] = 0;
                            continue;
                        }
                        if (var487 == 3325) {
                            class168.field3030[var10++] = class92.field1815 ? 1 : 0;
                            continue;
                        }
                        if (var487 == 3326) {
                            class168.field3030[var10++] = class223.field4069.field2171;
                            continue;
                        }
                        if (var487 == 3327) {
                            class168.field3030[var10++] = class223.field4069.field2142.field2588 ? 1 : 0;
                            continue;
                        }
                        if (var487 == 3328) {
                            class168.field3030[var10++] = class250.field4505 && !class68.field1304 ? 1 : 0;
                            continue;
                        }
                        if (var487 == 3329) {
                            class168.field3030[var10++] = class252.field4534 ? 1 : 0;
                            continue;
                        }
                        if (var487 == 3330) {
                            var10--;
                            int var93 = class168.field3030[var10];
                            class168.field3030[var10++] = class51.method386(var93, false);
                            continue;
                        }
                        if (var487 == 3331) {
                            var10 -= 2;
                            int var94 = class168.field3030[var10 + 1];
                            int var95 = class168.field3030[var10];
                            class168.field3030[var10++] = class201.method1375(var94, false, var95, true);
                            continue;
                        }
                        if (var487 == 3332) {
                            var10 -= 2;
                            int var96 = class168.field3030[var10];
                            int var97 = class168.field3030[var10 + 1];
                            class168.field3030[var10++] = class201.method1375(var97, true, var96, true);
                            continue;
                        }
                        if (var487 == 3333) {
                            class168.field3030[var10++] = class84.field1675;
                            continue;
                        }
                        if (var487 == 3335) {
                            class168.field3030[var10++] = class131.field2514;
                            continue;
                        }
                    } else if (var487 < 3500) {
                        if (var487 == 3400) {
                            var10 -= 2;
                            int var410 = class168.field3030[var10];
                            int var411 = class168.field3030[var10 + 1];
                            class176 var412 = class100.method697(var410, 256);
                            class289.field5106[var6++] = var412.method1216(var411, (byte) -66);
                            continue;
                        }
                        if (var487 == 3408) {
                            var10 -= 4;
                            int var413 = class168.field3030[var10 + 1];
                            int var414 = class168.field3030[var10];
                            int var415 = class168.field3030[var10 + 3];
                            int var416 = class168.field3030[var10 + 2];
                            class176 var417 = class100.method697(var416, 256);
                            if (var417.field3204 == var414 && var417.field3199 == var413) {
                                if (var413 == 115) {
                                    class289.field5106[var6++] = var417.method1216(var415, (byte) 125);
                                } else {
                                    class168.field3030[var10++] = var417.method1213(89, var415);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var487 == 3409) {
                            var10 -= 3;
                            int var418 = class168.field3030[var10];
                            int var419 = class168.field3030[var10 + 1];
                            int var420 = class168.field3030[var10 + 2];
                            if (var419 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class176 var421 = class100.method697(var419, 256);
                            if (var421.field3199 != var418) {
                                throw new RuntimeException("C3409-1");
                            }
                            class168.field3030[var10++] = var421.method1207(var420, (byte) 124) ? 1 : 0;
                            continue;
                        }
                        if (var487 == 3410) {
                            var10--;
                            int var422 = class168.field3030[var10];
                            var6--;
                            class209 var423 = class289.field5106[var6];
                            if (var422 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class176 var424 = class100.method697(var422, 256);
                            if (var424.field3199 != 115) {
                                throw new RuntimeException("C3410-1");
                            }
                            class168.field3030[var10++] = var424.method1217(var423, (byte) -22) ? 1 : 0;
                            continue;
                        }
                        if (var487 == 3411) {
                            var10--;
                            int var425 = class168.field3030[var10];
                            class176 var426 = class100.method697(var425, 256);
                            class168.field3030[var10++] = var426.field3205.method1761(0);
                            continue;
                        }
                    } else if (var487 < 3700) {
                        if (var487 == 3600) {
                            if (class32.field576 == 0) {
                                class168.field3030[var10++] = -2;
                            } else if (class32.field576 == 1) {
                                class168.field3030[var10++] = -1;
                            } else {
                                class168.field3030[var10++] = class3.field38;
                            }
                            continue;
                        }
                        if (var487 == 3601) {
                            var10--;
                            int var98 = class168.field3030[var10];
                            if (class32.field576 == 2 && var98 < class3.field38) {
                                class289.field5106[var6++] = class286.field5049[var98];
                                continue;
                            }
                            class289.field5106[var6++] = class37.field645;
                            continue;
                        }
                        if (var487 == 3602) {
                            var10--;
                            int var99 = class168.field3030[var10];
                            if (class32.field576 == 2 && class3.field38 > var99) {
                                class168.field3030[var10++] = class198.field3541[var99];
                                continue;
                            }
                            class168.field3030[var10++] = 0;
                            continue;
                        }
                        if (var487 == 3603) {
                            var10--;
                            int var100 = class168.field3030[var10];
                            if (class32.field576 == 2 && class3.field38 > var100) {
                                class168.field3030[var10++] = class84.field1678[var100];
                                continue;
                            }
                            class168.field3030[var10++] = 0;
                            continue;
                        }
                        if (var487 == 3604) {
                            var6--;
                            class209 var101 = class289.field5106[var6];
                            var10--;
                            int var102 = class168.field3030[var10];
                            class43.method326((byte) -116, var102, var101);
                            continue;
                        }
                        if (var487 == 3605) {
                            var6--;
                            class209 var103 = class289.field5106[var6];
                            class134.method941(5, var103.method1448(true));
                            continue;
                        }
                        if (var487 == 3606) {
                            var6--;
                            class209 var104 = class289.field5106[var6];
                            class50.method385(20637, var104.method1448(true));
                            continue;
                        }
                        if (var487 == 3607) {
                            var6--;
                            class209 var105 = class289.field5106[var6];
                            class37.method276(var105.method1448(true), 100);
                            continue;
                        }
                        if (var487 == 3608) {
                            var6--;
                            class209 var106 = class289.field5106[var6];
                            class1.method2(var106.method1448(true), (byte) -111);
                            continue;
                        }
                        if (var487 == 3609) {
                            var6--;
                            class209 var107 = class289.field5106[var6];
                            if (var107.method1472(class150.field2747, 0) || var107.method1472(class214.field3862, 0)) {
                                var107 = var107.method1461(-31, 7);
                            }
                            class168.field3030[var10++] = class170.method1181((byte) 22, var107) ? 1 : 0;
                            continue;
                        }
                        if (var487 == 3610) {
                            var10--;
                            int var108 = class168.field3030[var10];
                            if (class32.field576 == 2 && var108 < class3.field38) {
                                class289.field5106[var6++] = class258.field4666[var108];
                                continue;
                            }
                            class289.field5106[var6++] = class37.field645;
                            continue;
                        }
                        if (var487 == 3611) {
                            if (class280.field4930 == null) {
                                class289.field5106[var6++] = class37.field645;
                            } else {
                                class289.field5106[var6++] = class280.field4930.method1459((byte) -84);
                            }
                            continue;
                        }
                        if (var487 == 3612) {
                            if (class280.field4930 == null) {
                                class168.field3030[var10++] = 0;
                            } else {
                                class168.field3030[var10++] = class6.field113;
                            }
                            continue;
                        }
                        if (var487 == 3613) {
                            var10--;
                            int var109 = class168.field3030[var10];
                            if (class280.field4930 != null && class6.field113 > var109) {
                                class289.field5106[var6++] = class42.field743[var109].field64.method1459((byte) -104);
                                continue;
                            }
                            class289.field5106[var6++] = class37.field645;
                            continue;
                        }
                        if (var487 == 3614) {
                            var10--;
                            int var110 = class168.field3030[var10];
                            if (class280.field4930 != null && class6.field113 > var110) {
                                class168.field3030[var10++] = class42.field743[var110].field65;
                                continue;
                            }
                            class168.field3030[var10++] = 0;
                            continue;
                        }
                        if (var487 == 3615) {
                            var10--;
                            int var111 = class168.field3030[var10];
                            if (class280.field4930 != null && class6.field113 > var111) {
                                class168.field3030[var10++] = class42.field743[var111].field69;
                                continue;
                            }
                            class168.field3030[var10++] = 0;
                            continue;
                        }
                        if (var487 == 3616) {
                            class168.field3030[var10++] = class154.field2808;
                            continue;
                        }
                        if (var487 == 3617) {
                            var6--;
                            class209 var112 = class289.field5106[var6];
                            class266.method1818((byte) -120, var112);
                            continue;
                        }
                        if (var487 == 3618) {
                            class168.field3030[var10++] = class265.field4757;
                            continue;
                        }
                        if (var487 == 3619) {
                            var6--;
                            class209 var113 = class289.field5106[var6];
                            class25.method217(var113.method1448(true), 157);
                            continue;
                        }
                        if (var487 == 3620) {
                            class186.method1272(-98);
                            continue;
                        }
                        if (var487 == 3621) {
                            if (class32.field576 == 0) {
                                class168.field3030[var10++] = -1;
                            } else {
                                class168.field3030[var10++] = class163.field2949;
                            }
                            continue;
                        }
                        if (var487 == 3622) {
                            var10--;
                            int var114 = class168.field3030[var10];
                            if (class32.field576 != 0 && class163.field2949 > var114) {
                                class289.field5106[var6++] = class56.method437(class253.field4566[var114], (byte) 84).method1459((byte) -57);
                                continue;
                            }
                            class289.field5106[var6++] = class37.field645;
                            continue;
                        }
                        if (var487 == 3623) {
                            var6--;
                            class209 var115 = class289.field5106[var6];
                            if (var115.method1472(class150.field2747, 0) || var115.method1472(class214.field3862, 0)) {
                                var115 = var115.method1461(-61, 7);
                            }
                            class168.field3030[var10++] = class144.method1007(0, var115) ? 1 : 0;
                            continue;
                        }
                        if (var487 == 3624) {
                            var10--;
                            int var116 = class168.field3030[var10];
                            if (class42.field743 != null && var116 < class6.field113 && class42.field743[var116].field64.method1483(class223.field4069.field2140, (byte) -50)) {
                                class168.field3030[var10++] = 1;
                                continue;
                            }
                            class168.field3030[var10++] = 0;
                            continue;
                        }
                        if (var487 == 3625) {
                            if (class93.field1841 == null) {
                                class289.field5106[var6++] = class37.field645;
                            } else {
                                class289.field5106[var6++] = class93.field1841.method1459((byte) -82);
                            }
                            continue;
                        }
                        if (var487 == 3626) {
                            var10--;
                            int var117 = class168.field3030[var10];
                            if (class280.field4930 != null && var117 < class6.field113) {
                                class289.field5106[var6++] = class42.field743[var117].field67;
                                continue;
                            }
                            class289.field5106[var6++] = class37.field645;
                            continue;
                        }
                        if (var487 == 3627) {
                            var10--;
                            int var118 = class168.field3030[var10];
                            if (class32.field576 == 2 && var118 >= 0 && class3.field38 > var118) {
                                class168.field3030[var10++] = class8.field156[var118] ? 1 : 0;
                                continue;
                            }
                            class168.field3030[var10++] = 0;
                            continue;
                        }
                        if (var487 == 3628) {
                            var6--;
                            class209 var119 = class289.field5106[var6];
                            if (var119.method1472(class150.field2747, 0) || var119.method1472(class214.field3862, 0)) {
                                var119 = var119.method1461(-121, 7);
                            }
                            class168.field3030[var10++] = class53.method398(var119, 30014);
                            continue;
                        }
                        if (var487 == 3629) {
                            class168.field3030[var10++] = class79.field1467;
                            continue;
                        }
                    } else if (var487 < 4000) {
                        if (var487 == 3903) {
                            var10--;
                            int var120 = class168.field3030[var10];
                            class168.field3030[var10++] = class284.field4984[var120].method627(true);
                            continue;
                        }
                        if (var487 == 3904) {
                            var10--;
                            int var121 = class168.field3030[var10];
                            class168.field3030[var10++] = class284.field4984[var121].field1738;
                            continue;
                        }
                        if (var487 == 3905) {
                            var10--;
                            int var122 = class168.field3030[var10];
                            class168.field3030[var10++] = class284.field4984[var122].field1724;
                            continue;
                        }
                        if (var487 == 3906) {
                            var10--;
                            int var123 = class168.field3030[var10];
                            class168.field3030[var10++] = class284.field4984[var123].field1727;
                            continue;
                        }
                        if (var487 == 3907) {
                            var10--;
                            int var124 = class168.field3030[var10];
                            class168.field3030[var10++] = class284.field4984[var124].field1730;
                            continue;
                        }
                        if (var487 == 3908) {
                            var10--;
                            int var125 = class168.field3030[var10];
                            class168.field3030[var10++] = class284.field4984[var125].field1726;
                            continue;
                        }
                        if (var487 == 3910) {
                            var10--;
                            int var126 = class168.field3030[var10];
                            int var127 = class284.field4984[var126].method630(7);
                            class168.field3030[var10++] = var127 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var487 == 3911) {
                            var10--;
                            int var128 = class168.field3030[var10];
                            int var129 = class284.field4984[var128].method630(7);
                            class168.field3030[var10++] = var129 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var487 == 3912) {
                            var10--;
                            int var130 = class168.field3030[var10];
                            int var131 = class284.field4984[var130].method630(7);
                            class168.field3030[var10++] = var131 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var487 == 3913) {
                            var10--;
                            int var132 = class168.field3030[var10];
                            int var133 = class284.field4984[var132].method630(7);
                            class168.field3030[var10++] = var133 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var487 < 4100) {
                        if (var487 == 4000) {
                            var10 -= 2;
                            int var365 = class168.field3030[var10];
                            int var366 = class168.field3030[var10 + 1];
                            class168.field3030[var10++] = var365 + var366;
                            continue;
                        }
                        if (var487 == 4001) {
                            var10 -= 2;
                            int var367 = class168.field3030[var10];
                            int var368 = class168.field3030[var10 + 1];
                            class168.field3030[var10++] = var367 - var368;
                            continue;
                        }
                        if (var487 == 4002) {
                            var10 -= 2;
                            int var369 = class168.field3030[var10 + 1];
                            int var370 = class168.field3030[var10];
                            class168.field3030[var10++] = var369 * var370;
                            continue;
                        }
                        if (var487 == 4003) {
                            var10 -= 2;
                            int var371 = class168.field3030[var10];
                            int var372 = class168.field3030[var10 + 1];
                            class168.field3030[var10++] = var371 / var372;
                            continue;
                        }
                        if (var487 == 4004) {
                            var10--;
                            int var373 = class168.field3030[var10];
                            class168.field3030[var10++] = (int) ((double) var373 * Math.random());
                            continue;
                        }
                        if (var487 == 4005) {
                            var10--;
                            int var374 = class168.field3030[var10];
                            class168.field3030[var10++] = (int) ((double) (var374 + 1) * Math.random());
                            continue;
                        }
                        if (var487 == 4006) {
                            var10 -= 5;
                            int var375 = class168.field3030[var10];
                            int var376 = class168.field3030[var10 + 1];
                            int var377 = class168.field3030[var10 + 2];
                            int var378 = class168.field3030[var10 + 3];
                            int var379 = class168.field3030[var10 + 4];
                            class168.field3030[var10++] = (var376 - var375) * (var379 - var377) / (var378 - var377) + var375;
                            continue;
                        }
                        if (var487 == 4007) {
                            var10 -= 2;
                            long var380 = (long) class168.field3030[var10];
                            long var382 = (long) class168.field3030[var10 + 1];
                            class168.field3030[var10++] = (int) (var380 * var382 / 100L + var380);
                            continue;
                        }
                        if (var487 == 4008) {
                            var10 -= 2;
                            int var384 = class168.field3030[var10];
                            int var385 = class168.field3030[var10 + 1];
                            class168.field3030[var10++] = class6.method63(0x1 << var385, var384);
                            continue;
                        }
                        if (var487 == 4009) {
                            var10 -= 2;
                            int var386 = class168.field3030[var10];
                            int var387 = class168.field3030[var10 + 1];
                            class168.field3030[var10++] = class27.method220(-(0x1 << var387) - 1, var386);
                            continue;
                        }
                        if (var487 == 4010) {
                            var10 -= 2;
                            int var388 = class168.field3030[var10 + 1];
                            int var389 = class168.field3030[var10];
                            class168.field3030[var10++] = class27.method220(0x1 << var388, var389) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var487 == 4011) {
                            var10 -= 2;
                            int var390 = class168.field3030[var10 + 1];
                            int var391 = class168.field3030[var10];
                            class168.field3030[var10++] = var391 % var390;
                            continue;
                        }
                        if (var487 == 4012) {
                            var10 -= 2;
                            int var392 = class168.field3030[var10];
                            int var393 = class168.field3030[var10 + 1];
                            if (var392 == 0) {
                                class168.field3030[var10++] = 0;
                            } else {
                                class168.field3030[var10++] = (int) Math.pow((double) var392, (double) var393);
                            }
                            continue;
                        }
                        if (var487 == 4013) {
                            var10 -= 2;
                            int var394 = class168.field3030[var10 + 1];
                            int var395 = class168.field3030[var10];
                            if (var395 == 0) {
                                class168.field3030[var10++] = 0;
                            } else if (var394 == 0) {
                                class168.field3030[var10++] = Integer.MAX_VALUE;
                            } else {
                                class168.field3030[var10++] = (int) Math.pow((double) var395, 1.0D / (double) var394);
                            }
                            continue;
                        }
                        if (var487 == 4014) {
                            var10 -= 2;
                            int var396 = class168.field3030[var10];
                            int var397 = class168.field3030[var10 + 1];
                            class168.field3030[var10++] = class27.method220(var397, var396);
                            continue;
                        }
                        if (var487 == 4015) {
                            var10 -= 2;
                            int var398 = class168.field3030[var10];
                            int var399 = class168.field3030[var10 + 1];
                            class168.field3030[var10++] = class6.method63(var399, var398);
                            continue;
                        }
                        if (var487 == 4016) {
                            var10 -= 2;
                            int var400 = class168.field3030[var10];
                            int var401 = class168.field3030[var10 + 1];
                            class168.field3030[var10++] = var400 < var401 ? var400 : var401;
                            continue;
                        }
                        if (var487 == 4017) {
                            var10 -= 2;
                            int var402 = class168.field3030[var10];
                            int var403 = class168.field3030[var10 + 1];
                            class168.field3030[var10++] = var402 <= var403 ? var403 : var402;
                            continue;
                        }
                        if (var487 == 4018) {
                            var10 -= 3;
                            long var404 = (long) class168.field3030[var10];
                            long var406 = (long) class168.field3030[var10 + 2];
                            long var408 = (long) class168.field3030[var10 + 1];
                            class168.field3030[var10++] = (int) (var404 * var406 / var408);
                            continue;
                        }
                    } else if (var487 < 4200) {
                        if (var487 == 4100) {
                            var6--;
                            class209 var313 = class289.field5106[var6];
                            var10--;
                            int var314 = class168.field3030[var10];
                            class289.field5106[var6++] = class229.method1604(new class209[] { var313, class66.method485(var314, (byte) 70) }, (byte) 74);
                            continue;
                        }
                        if (var487 == 4101) {
                            var6 -= 2;
                            class209 var315 = class289.field5106[var6 + 1];
                            class209 var316 = class289.field5106[var6];
                            class289.field5106[var6++] = class229.method1604(new class209[] { var316, var315 }, (byte) 100);
                            continue;
                        }
                        if (var487 == 4102) {
                            var6--;
                            class209 var317 = class289.field5106[var6];
                            var10--;
                            int var318 = class168.field3030[var10];
                            class289.field5106[var6++] = class229.method1604(new class209[] { var317, class239.method1659(true, 10, var318) }, (byte) 43);
                            continue;
                        }
                        if (var487 == 4103) {
                            var6--;
                            class209 var319 = class289.field5106[var6];
                            class289.field5106[var6++] = var319.method1467((byte) 85);
                            continue;
                        }
                        if (var487 == 4104) {
                            var10--;
                            int var320 = class168.field3030[var10];
                            long var321 = ((long) var320 + 11745L) * 86400000L;
                            class131.field2511.setTime(new Date(var321));
                            int var323 = class131.field2511.get(5);
                            int var324 = class131.field2511.get(2);
                            int var325 = class131.field2511.get(1);
                            class289.field5106[var6++] = class229.method1604(new class209[] { class66.method485(var323, (byte) 63), class19.field377, class6.field126[var324], class19.field377, class66.method485(var325, (byte) 118) }, (byte) 73);
                            continue;
                        }
                        if (var487 == 4105) {
                            var6 -= 2;
                            class209 var326 = class289.field5106[var6];
                            class209 var327 = class289.field5106[var6 + 1];
                            if (class223.field4069.field2142 != null && class223.field4069.field2142.field2588) {
                                class289.field5106[var6++] = var327;
                                continue;
                            }
                            class289.field5106[var6++] = var326;
                            continue;
                        }
                        if (var487 == 4106) {
                            var10--;
                            int var328 = class168.field3030[var10];
                            class289.field5106[var6++] = class66.method485(var328, (byte) 46);
                            continue;
                        }
                        if (var487 == 4107) {
                            var6 -= 2;
                            class168.field3030[var10++] = class289.field5106[var6].method1489((byte) 88, class289.field5106[var6 + 1]);
                            continue;
                        }
                        if (var487 == 4108) {
                            var6--;
                            class209 var329 = class289.field5106[var6];
                            var10 -= 2;
                            int var330 = class168.field3030[var10 + 1];
                            int var331 = class168.field3030[var10];
                            byte[] var332 = class56.field1156.method353(0, -73, var330);
                            class77 var333 = new class77(var332);
                            var333.method1279(class234.field4218, (int[]) null);
                            class168.field3030[var10++] = var333.method1299(var329, var331);
                            continue;
                        }
                        if (var487 == 4109) {
                            var6--;
                            class209 var334 = class289.field5106[var6];
                            var10 -= 2;
                            int var335 = class168.field3030[var10];
                            int var336 = class168.field3030[var10 + 1];
                            byte[] var337 = class56.field1156.method353(0, -93, var336);
                            class77 var338 = new class77(var337);
                            var338.method1279(class234.field4218, (int[]) null);
                            class168.field3030[var10++] = var338.method1286(var334, var335);
                            continue;
                        }
                        if (var487 == 4110) {
                            var6 -= 2;
                            class209 var339 = class289.field5106[var6 + 1];
                            class209 var340 = class289.field5106[var6];
                            var10--;
                            if (class168.field3030[var10] == 1) {
                                class289.field5106[var6++] = var340;
                            } else {
                                class289.field5106[var6++] = var339;
                            }
                            continue;
                        }
                        if (var487 == 4111) {
                            var6--;
                            class209 var341 = class289.field5106[var6];
                            class289.field5106[var6++] = class188.method1294(var341);
                            continue;
                        }
                        if (var487 == 4112) {
                            var6--;
                            class209 var342 = class289.field5106[var6];
                            var10--;
                            int var343 = class168.field3030[var10];
                            if (var343 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class289.field5106[var6++] = var342.method1468(var343, -71);
                            continue;
                        }
                        if (var487 == 4113) {
                            var10--;
                            int var344 = class168.field3030[var10];
                            class168.field3030[var10++] = class222.method1571(-118, var344) ? 1 : 0;
                            continue;
                        }
                        if (var487 == 4114) {
                            var10--;
                            int var345 = class168.field3030[var10];
                            class168.field3030[var10++] = class171.method1187(var345, -126) ? 1 : 0;
                            continue;
                        }
                        if (var487 == 4115) {
                            var10--;
                            int var346 = class168.field3030[var10];
                            class168.field3030[var10++] = class165.method1142(var346, (byte) -105) ? 1 : 0;
                            continue;
                        }
                        if (var487 == 4116) {
                            var10--;
                            int var347 = class168.field3030[var10];
                            class168.field3030[var10++] = class288.method1940(57, var347) ? 1 : 0;
                            continue;
                        }
                        if (var487 == 4117) {
                            var6--;
                            class209 var348 = class289.field5106[var6];
                            if (var348 == null) {
                                class168.field3030[var10++] = 0;
                            } else {
                                class168.field3030[var10++] = var348.method1486(5);
                            }
                            continue;
                        }
                        if (var487 == 4118) {
                            var10 -= 2;
                            int var349 = class168.field3030[var10];
                            var6--;
                            class209 var350 = class289.field5106[var6];
                            int var351 = class168.field3030[var10 + 1];
                            class289.field5106[var6++] = var350.method1466(125, var351, var349);
                            continue;
                        }
                        if (var487 == 4119) {
                            var6--;
                            class209 var352 = class289.field5106[var6];
                            class209 var353 = class79.method554(-30159, var352.method1486(5));
                            boolean var354 = false;
                            for (int var355 = 0; var352.method1486(5) > var355; var355++) {
                                int var356 = var352.method1491(111, var355);
                                if (var356 == 60) {
                                    var354 = true;
                                } else if (var356 == 62) {
                                    var354 = false;
                                } else if (!var354) {
                                    var353.method1451(31919, var356);
                                }
                            }
                            var353.method1460((byte) 104);
                            class289.field5106[var6++] = var353;
                            continue;
                        }
                        if (var487 == 4120) {
                            var6--;
                            class209 var357 = class289.field5106[var6];
                            var10 -= 2;
                            int var358 = class168.field3030[var10 + 1];
                            int var359 = class168.field3030[var10];
                            class168.field3030[var10++] = var357.method1482(-1, var358, var359);
                            continue;
                        }
                        if (var487 == 4121) {
                            var10--;
                            int var360 = class168.field3030[var10];
                            var6 -= 2;
                            class209 var361 = class289.field5106[var6];
                            class209 var362 = class289.field5106[var6 + 1];
                            class168.field3030[var10++] = var361.method1450(-20711, var362, var360);
                            continue;
                        }
                        if (var487 == 4122) {
                            var10--;
                            int var363 = class168.field3030[var10];
                            class168.field3030[var10++] = class52.method394(var363, -28394);
                            continue;
                        }
                        if (var487 == 4123) {
                            var10--;
                            int var364 = class168.field3030[var10];
                            class168.field3030[var10++] = class2.method7(var364, (byte) -41);
                            continue;
                        }
                    } else if (var487 < 4300) {
                        if (var487 == 4200) {
                            var10--;
                            int var134 = class168.field3030[var10];
                            class289.field5106[var6++] = class249.method1728(var134, true).field1629;
                            continue;
                        }
                        if (var487 == 4201) {
                            var10 -= 2;
                            int var135 = class168.field3030[var10 + 1];
                            int var136 = class168.field3030[var10];
                            class82 var137 = class249.method1728(var136, true);
                            if (var135 >= 1 && var135 <= 5 && var137.field1615[var135 - 1] != null) {
                                class289.field5106[var6++] = var137.field1615[var135 - 1];
                                continue;
                            }
                            class289.field5106[var6++] = class37.field645;
                            continue;
                        }
                        if (var487 == 4202) {
                            var10 -= 2;
                            int var138 = class168.field3030[var10];
                            int var139 = class168.field3030[var10 + 1];
                            class82 var140 = class249.method1728(var138, true);
                            if (var139 >= 1 && var139 <= 5 && var140.field1632[var139 - 1] != null) {
                                class289.field5106[var6++] = var140.field1632[var139 - 1];
                                continue;
                            }
                            class289.field5106[var6++] = class37.field645;
                            continue;
                        }
                        if (var487 == 4203) {
                            var10--;
                            int var141 = class168.field3030[var10];
                            class168.field3030[var10++] = class249.method1728(var141, true).field1581;
                            continue;
                        }
                        if (var487 == 4204) {
                            var10--;
                            int var142 = class168.field3030[var10];
                            class168.field3030[var10++] = class249.method1728(var142, true).field1583 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var487 == 4205) {
                            var10--;
                            int var143 = class168.field3030[var10];
                            class82 var144 = class249.method1728(var143, true);
                            if (var144.field1625 == -1 && var144.field1619 >= 0) {
                                class168.field3030[var10++] = var144.field1619;
                                continue;
                            }
                            class168.field3030[var10++] = var143;
                            continue;
                        }
                        if (var487 == 4206) {
                            var10--;
                            int var145 = class168.field3030[var10];
                            class82 var146 = class249.method1728(var145, true);
                            if (var146.field1625 >= 0 && var146.field1619 >= 0) {
                                class168.field3030[var10++] = var146.field1619;
                                continue;
                            }
                            class168.field3030[var10++] = var145;
                            continue;
                        }
                        if (var487 == 4207) {
                            var10--;
                            int var147 = class168.field3030[var10];
                            class168.field3030[var10++] = class249.method1728(var147, true).field1578 ? 1 : 0;
                            continue;
                        }
                        if (var487 == 4208) {
                            var10 -= 2;
                            int var148 = class168.field3030[var10];
                            int var149 = class168.field3030[var10 + 1];
                            class288 var150 = class273.method1866(var149, -10249);
                            if (var150.method1936((byte) -51)) {
                                class289.field5106[var6++] = class249.method1728(var148, true).method586(var149, -67, var150.field5090);
                            } else {
                                class168.field3030[var10++] = class249.method1728(var148, true).method591(78, var150.field5084, var149);
                            }
                            continue;
                        }
                        if (var487 == 4210) {
                            var6--;
                            class209 var151 = class289.field5106[var6];
                            var10--;
                            int var152 = class168.field3030[var10];
                            class126.method911(0, var152 == 1, var151);
                            class168.field3030[var10++] = class289.field5092;
                            continue;
                        }
                        if (var487 == 4211) {
                            if (class3.field47 != null && class28.field519 < class289.field5092) {
                                class168.field3030[var10++] = class27.method220(class3.field47[class28.field519++], 65535);
                                continue;
                            }
                            class168.field3030[var10++] = -1;
                            continue;
                        }
                        if (var487 == 4212) {
                            class28.field519 = 0;
                            continue;
                        }
                    } else if (var487 < 4400) {
                        if (var487 == 4300) {
                            var10 -= 2;
                            int var153 = class168.field3030[var10];
                            int var154 = class168.field3030[var10 + 1];
                            class288 var155 = class273.method1866(var154, -10249);
                            if (var155.method1936((byte) -63)) {
                                class289.field5106[var6++] = class78.method549(112, var153).method1646(-1, var155.field5090, var154);
                            } else {
                                class168.field3030[var10++] = class78.method549(110, var153).method1643(-1, var154, var155.field5084);
                            }
                            continue;
                        }
                        if (var487 == 4301) {
                            var10--;
                            int var156 = class168.field3030[var10];
                            class168.field3030[var10++] = class78.method549(98, var156).field4264;
                            continue;
                        }
                        if (var487 == 4302) {
                            var10--;
                            int var157 = class168.field3030[var10];
                            class168.field3030[var10++] = class78.method549(87, var157).field4293;
                            continue;
                        }
                        if (var487 == 4303) {
                            var10--;
                            int var158 = class168.field3030[var10];
                            class168.field3030[var10++] = class78.method549(82, var158).field4236;
                            continue;
                        }
                        if (var487 == 4304) {
                            var10--;
                            int var159 = class168.field3030[var10];
                            class168.field3030[var10++] = class78.method549(91, var159).field4296;
                            continue;
                        }
                        if (var487 == 4305) {
                            var10--;
                            int var160 = class168.field3030[var10];
                            class168.field3030[var10++] = class78.method549(100, var160).field4279;
                            continue;
                        }
                        if (var487 == 4306) {
                            var10--;
                            int var161 = class168.field3030[var10];
                            class168.field3030[var10++] = class78.method549(68, var161).field4235;
                            continue;
                        }
                        if (var487 == 4307) {
                            var10--;
                            int var162 = class168.field3030[var10];
                            class168.field3030[var10++] = class78.method549(111, var162).field4259;
                            continue;
                        }
                    } else if (var487 >= 4500) {
                        if (var487 < 4600) {
                            if (var487 == 4500) {
                                var10 -= 2;
                                int var163 = class168.field3030[var10];
                                int var164 = class168.field3030[var10 + 1];
                                class288 var165 = class273.method1866(var164, -10249);
                                if (var165.method1936((byte) -11)) {
                                    class289.field5106[var6++] = class132.method933(var163, (byte) -33).method683(var164, 0, var165.field5090);
                                } else {
                                    class168.field3030[var10++] = class132.method933(var163, (byte) -120).method684(var164, 113, var165.field5084);
                                }
                                continue;
                            }
                        } else if (var487 < 5100) {
                            if (var487 == 5000) {
                                class168.field3030[var10++] = class111.field2241;
                                continue;
                            }
                            if (var487 == 5001) {
                                var10 -= 3;
                                class111.field2241 = class168.field3030[var10];
                                class241.field4351 = class168.field3030[var10 + 1];
                                class244.field4430 = class168.field3030[var10 + 2];
                                class184.field3314++;
                                class84.field1677.method287((byte) 118, 7);
                                class84.field1677.method773(-6385, class111.field2241);
                                class84.field1677.method773(-6385, class241.field4351);
                                class84.field1677.method773(-6385, class244.field4430);
                                continue;
                            }
                            if (var487 == 5002) {
                                var10 -= 2;
                                class85.field1690++;
                                var6--;
                                class209 var166 = class289.field5106[var6];
                                int var167 = class168.field3030[var10];
                                int var168 = class168.field3030[var10 + 1];
                                class84.field1677.method287((byte) 120, 168);
                                class84.field1677.method756(var166.method1448(true), (byte) 85);
                                class84.field1677.method773(-6385, var167 - 1);
                                class84.field1677.method773(-6385, var168);
                                continue;
                            }
                            if (var487 == 5003) {
                                var10--;
                                int var169 = class168.field3030[var10];
                                class209 var170 = null;
                                if (var169 < 100) {
                                    var170 = class136.field2558[var169];
                                }
                                if (var170 == null) {
                                    var170 = class37.field645;
                                }
                                class289.field5106[var6++] = var170;
                                continue;
                            }
                            if (var487 == 5004) {
                                int var171 = -1;
                                var10--;
                                int var172 = class168.field3030[var10];
                                if (var172 < 100 && class136.field2558[var172] != null) {
                                    var171 = class102.field1956[var172];
                                }
                                class168.field3030[var10++] = var171;
                                continue;
                            }
                            if (var487 == 5005) {
                                class168.field3030[var10++] = class241.field4351;
                                continue;
                            }
                            if (var487 == 5008) {
                                var6--;
                                class209 var173 = class289.field5106[var6];
                                if (var173.method1472(class33.field583, 0)) {
                                    class13.method98(var173, true);
                                    continue;
                                }
                                if (class198.field3550 == 0 && (class250.field4505 && !class68.field1304 || class252.field4534)) {
                                    continue;
                                }
                                class209 var174 = var173.method1467((byte) 101);
                                class71.field1345++;
                                byte var175 = 0;
                                if (var174.method1472(class21.field398, 0)) {
                                    var173 = var173.method1461(-25, class21.field398.method1486(5));
                                    var175 = 0;
                                } else if (var174.method1472(class56.field1140, 0)) {
                                    var173 = var173.method1461(-113, class56.field1140.method1486(5));
                                    var175 = 1;
                                } else if (var174.method1472(class253.field4562, 0)) {
                                    var173 = var173.method1461(-55, class253.field4562.method1486(5));
                                    var175 = 2;
                                } else if (var174.method1472(class224.field4087, 0)) {
                                    var173 = var173.method1461(-54, class224.field4087.method1486(5));
                                    var175 = 3;
                                } else if (var174.method1472(class142.field2621, 0)) {
                                    var173 = var173.method1461(-116, class142.field2621.method1486(5));
                                    var175 = 4;
                                } else if (var174.method1472(class254.field4580, 0)) {
                                    var173 = var173.method1461(-51, class254.field4580.method1486(5));
                                    var175 = 5;
                                } else if (var174.method1472(class262.field4713, 0)) {
                                    var173 = var173.method1461(-64, class262.field4713.method1486(5));
                                    var175 = 6;
                                } else if (var174.method1472(class283.field4977, 0)) {
                                    var173 = var173.method1461(-58, class283.field4977.method1486(5));
                                    var175 = 7;
                                } else if (var174.method1472(class3.field41, 0)) {
                                    var173 = var173.method1461(-30, class3.field41.method1486(5));
                                    var175 = 8;
                                } else if (var174.method1472(class277.field4878, 0)) {
                                    var175 = 9;
                                    var173 = var173.method1461(-77, class277.field4878.method1486(5));
                                } else if (var174.method1472(class177.field3236, 0)) {
                                    var173 = var173.method1461(-102, class177.field3236.method1486(5));
                                    var175 = 10;
                                } else if (var174.method1472(class200.field3591, 0)) {
                                    var175 = 11;
                                    var173 = var173.method1461(-57, class200.field3591.method1486(5));
                                } else if (class131.field2514 != 0) {
                                    if (var174.method1472(class21.field399, 0)) {
                                        var173 = var173.method1461(-53, class21.field399.method1486(5));
                                        var175 = 0;
                                    } else if (var174.method1472(class56.field1146, 0)) {
                                        var173 = var173.method1461(-24, class56.field1146.method1486(5));
                                        var175 = 1;
                                    } else if (var174.method1472(class253.field4563, 0)) {
                                        var175 = 2;
                                        var173 = var173.method1461(-44, class253.field4563.method1486(5));
                                    } else if (var174.method1472(class224.field4079, 0)) {
                                        var175 = 3;
                                        var173 = var173.method1461(-92, class224.field4079.method1486(5));
                                    } else if (var174.method1472(class142.field2626, 0)) {
                                        var173 = var173.method1461(-108, class142.field2626.method1486(5));
                                        var175 = 4;
                                    } else if (var174.method1472(class254.field4585, 0)) {
                                        var175 = 5;
                                        var173 = var173.method1461(-125, class254.field4585.method1486(5));
                                    } else if (var174.method1472(class262.field4722, 0)) {
                                        var175 = 6;
                                        var173 = var173.method1461(-31, class262.field4722.method1486(5));
                                    } else if (var174.method1472(class283.field4975, 0)) {
                                        var173 = var173.method1461(-70, class283.field4975.method1486(5));
                                        var175 = 7;
                                    } else if (var174.method1472(class3.field52, 0)) {
                                        var173 = var173.method1461(-94, class3.field52.method1486(5));
                                        var175 = 8;
                                    } else if (var174.method1472(class277.field4884, 0)) {
                                        var175 = 9;
                                        var173 = var173.method1461(-109, class277.field4884.method1486(5));
                                    } else if (var174.method1472(class177.field3231, 0)) {
                                        var175 = 10;
                                        var173 = var173.method1461(-110, class177.field3231.method1486(5));
                                    } else if (var174.method1472(class200.field3576, 0)) {
                                        var173 = var173.method1461(-97, class200.field3576.method1486(5));
                                        var175 = 11;
                                    }
                                }
                                class209 var176 = var173.method1467((byte) 28);
                                byte var177 = 0;
                                if (var176.method1472(class28.field518, 0)) {
                                    var177 = 1;
                                    var173 = var173.method1461(-50, class28.field518.method1486(5));
                                } else if (var176.method1472(class30.field539, 0)) {
                                    var173 = var173.method1461(-47, class30.field539.method1486(5));
                                    var177 = 2;
                                } else if (var176.method1472(class182.field3303, 0)) {
                                    var173 = var173.method1461(-46, class182.field3303.method1486(5));
                                    var177 = 3;
                                } else if (var176.method1472(class30.field547, 0)) {
                                    var177 = 4;
                                    var173 = var173.method1461(-40, class30.field547.method1486(5));
                                } else if (var176.method1472(class210.field3834, 0)) {
                                    var177 = 5;
                                    var173 = var173.method1461(-26, class210.field3834.method1486(5));
                                } else if (class131.field2514 != 0) {
                                    if (var176.method1472(class28.field515, 0)) {
                                        var177 = 1;
                                        var173 = var173.method1461(-125, class28.field515.method1486(5));
                                    } else if (var176.method1472(class30.field540, 0)) {
                                        var173 = var173.method1461(-55, class30.field540.method1486(5));
                                        var177 = 2;
                                    } else if (var176.method1472(class182.field3294, 0)) {
                                        var177 = 3;
                                        var173 = var173.method1461(-95, class182.field3294.method1486(5));
                                    } else if (var176.method1472(class30.field551, 0)) {
                                        var177 = 4;
                                        var173 = var173.method1461(-31, class30.field551.method1486(5));
                                    } else if (var176.method1472(class210.field3835, 0)) {
                                        var177 = 5;
                                        var173 = var173.method1461(-67, class210.field3835.method1486(5));
                                    }
                                }
                                class84.field1677.method287((byte) 119, 191);
                                class84.field1677.method773(-6385, 0);
                                int var178 = class84.field1677.field2085;
                                class84.field1677.method773(-6385, var175);
                                class84.field1677.method773(-6385, var177);
                                class52.method396(class84.field1677, var173, (byte) 108);
                                class84.field1677.method779(105, class84.field1677.field2085 - var178);
                                continue;
                            }
                            if (var487 == 5009) {
                                var6 -= 2;
                                class209 var179 = class289.field5106[var6];
                                class209 var180 = class289.field5106[var6 + 1];
                                if (class198.field3550 != 0 || (!class250.field4505 || class68.field1304) && !class252.field4534) {
                                    class69.field1320++;
                                    class84.field1677.method287((byte) 121, 219);
                                    class84.field1677.method773(-6385, 0);
                                    int var181 = class84.field1677.field2085;
                                    class84.field1677.method756(var179.method1448(true), (byte) 81);
                                    class52.method396(class84.field1677, var180, (byte) 108);
                                    class84.field1677.method779(111, class84.field1677.field2085 - var181);
                                }
                                continue;
                            }
                            if (var487 == 5010) {
                                var10--;
                                int var182 = class168.field3030[var10];
                                class209 var183 = null;
                                if (var182 < 100) {
                                    var183 = class231.field4199[var182];
                                }
                                if (var183 == null) {
                                    var183 = class37.field645;
                                }
                                class289.field5106[var6++] = var183;
                                continue;
                            }
                            if (var487 == 5011) {
                                var10--;
                                int var184 = class168.field3030[var10];
                                class209 var185 = null;
                                if (var184 < 100) {
                                    var185 = class230.field4188[var184];
                                }
                                if (var185 == null) {
                                    var185 = class37.field645;
                                }
                                class289.field5106[var6++] = var185;
                                continue;
                            }
                            if (var487 == 5012) {
                                var10--;
                                int var186 = class168.field3030[var10];
                                int var187 = -1;
                                if (var186 < 100) {
                                    var187 = class192.field3481[var186];
                                }
                                class168.field3030[var10++] = var187;
                                continue;
                            }
                            if (var487 == 5015) {
                                class209 var188;
                                if (class223.field4069 == null || class223.field4069.field2140 == null) {
                                    var188 = class246.field4467;
                                } else {
                                    var188 = class223.field4069.method781(65535);
                                }
                                class289.field5106[var6++] = var188;
                                continue;
                            }
                            if (var487 == 5016) {
                                class168.field3030[var10++] = class244.field4430;
                                continue;
                            }
                            if (var487 == 5017) {
                                class168.field3030[var10++] = class171.field3127;
                                continue;
                            }
                            if (var487 == 5050) {
                                var10--;
                                int var189 = class168.field3030[var10];
                                class289.field5106[var6++] = class279.method1885(var189, 0).field4969;
                                continue;
                            }
                            if (var487 == 5051) {
                                var10--;
                                int var190 = class168.field3030[var10];
                                class283 var191 = class279.method1885(var190, 0);
                                if (var191.field4965 == null) {
                                    class168.field3030[var10++] = 0;
                                } else {
                                    class168.field3030[var10++] = var191.field4965.length;
                                }
                                continue;
                            }
                            if (var487 == 5052) {
                                var10 -= 2;
                                int var192 = class168.field3030[var10];
                                int var193 = class168.field3030[var10 + 1];
                                class283 var194 = class279.method1885(var192, 0);
                                int var195 = var194.field4965[var193];
                                class168.field3030[var10++] = var195;
                                continue;
                            }
                            if (var487 == 5053) {
                                var10--;
                                int var196 = class168.field3030[var10];
                                class283 var197 = class279.method1885(var196, 0);
                                if (var197.field4963 == null) {
                                    class168.field3030[var10++] = 0;
                                } else {
                                    class168.field3030[var10++] = var197.field4963.length;
                                }
                                continue;
                            }
                            if (var487 == 5054) {
                                var10 -= 2;
                                int var198 = class168.field3030[var10 + 1];
                                int var199 = class168.field3030[var10];
                                class168.field3030[var10++] = class279.method1885(var199, 0).field4963[var198];
                                continue;
                            }
                            if (var487 == 5055) {
                                var10--;
                                int var200 = class168.field3030[var10];
                                class289.field5106[var6++] = class215.method1507(var200, 12076).method1781(-126);
                                continue;
                            }
                            if (var487 == 5056) {
                                var10--;
                                int var201 = class168.field3030[var10];
                                class257 var202 = class215.method1507(var201, 12076);
                                if (var202.field4650 == null) {
                                    class168.field3030[var10++] = 0;
                                } else {
                                    class168.field3030[var10++] = var202.field4650.length;
                                }
                                continue;
                            }
                            if (var487 == 5057) {
                                var10 -= 2;
                                int var203 = class168.field3030[var10];
                                int var204 = class168.field3030[var10 + 1];
                                class168.field3030[var10++] = class215.method1507(var203, 12076).field4650[var204];
                                continue;
                            }
                            if (var487 == 5058) {
                                class234.field4215 = new class154();
                                var10--;
                                class234.field4215.field2807 = class168.field3030[var10];
                                class234.field4215.field2802 = class215.method1507(class234.field4215.field2807, 12076);
                                class234.field4215.field2809 = new int[class234.field4215.field2802.method1783(false)];
                                continue;
                            }
                            if (var487 == 5059) {
                                class84.field1677.method287((byte) 121, 82);
                                class84.field1677.method773(-6385, 0);
                                int var205 = class84.field1677.field2085;
                                class84.field1677.method773(-6385, 0);
                                class84.field1677.method740(255, class234.field4215.field2807);
                                class119.field2375++;
                                class234.field4215.field2802.method1778(class234.field4215.field2809, class84.field1677, 40);
                                class84.field1677.method779(97, class84.field1677.field2085 - var205);
                                continue;
                            }
                            if (var487 == 5060) {
                                var6--;
                                class209 var206 = class289.field5106[var6];
                                class99.field1927++;
                                class84.field1677.method287((byte) 125, 241);
                                class84.field1677.method773(-6385, 0);
                                int var207 = class84.field1677.field2085;
                                class84.field1677.method756(var206.method1448(true), (byte) -76);
                                class84.field1677.method740(255, class234.field4215.field2807);
                                class234.field4215.field2802.method1778(class234.field4215.field2809, class84.field1677, 108);
                                class84.field1677.method779(118, class84.field1677.field2085 - var207);
                                continue;
                            }
                            if (var487 == 5061) {
                                class119.field2375++;
                                class84.field1677.method287((byte) 124, 82);
                                class84.field1677.method773(-6385, 0);
                                int var208 = class84.field1677.field2085;
                                class84.field1677.method773(-6385, 1);
                                class84.field1677.method740(255, class234.field4215.field2807);
                                class234.field4215.field2802.method1778(class234.field4215.field2809, class84.field1677, 104);
                                class84.field1677.method779(113, class84.field1677.field2085 - var208);
                                continue;
                            }
                            if (var487 == 5062) {
                                var10 -= 2;
                                int var209 = class168.field3030[var10];
                                int var210 = class168.field3030[var10 + 1];
                                class168.field3030[var10++] = class279.method1885(var209, 0).field4970[var210];
                                continue;
                            }
                            if (var487 == 5063) {
                                var10 -= 2;
                                int var211 = class168.field3030[var10];
                                int var212 = class168.field3030[var10 + 1];
                                class168.field3030[var10++] = class279.method1885(var211, 0).field4968[var212];
                                continue;
                            }
                            if (var487 == 5064) {
                                var10 -= 2;
                                int var213 = class168.field3030[var10];
                                int var214 = class168.field3030[var10 + 1];
                                if (var214 == -1) {
                                    class168.field3030[var10++] = -1;
                                } else {
                                    class168.field3030[var10++] = class279.method1885(var213, 0).method1903(var214, (byte) 115);
                                }
                                continue;
                            }
                            if (var487 == 5065) {
                                var10 -= 2;
                                int var215 = class168.field3030[var10];
                                int var216 = class168.field3030[var10 + 1];
                                if (var216 == -1) {
                                    class168.field3030[var10++] = -1;
                                } else {
                                    class168.field3030[var10++] = class279.method1885(var215, 0).method1902(30206, var216);
                                }
                                continue;
                            }
                            if (var487 == 5066) {
                                var10--;
                                int var217 = class168.field3030[var10];
                                class168.field3030[var10++] = class215.method1507(var217, 12076).method1783(false);
                                continue;
                            }
                            if (var487 == 5067) {
                                var10 -= 2;
                                int var218 = class168.field3030[var10 + 1];
                                int var219 = class168.field3030[var10];
                                int var220 = class215.method1507(var219, 12076).method1780(false, var218);
                                class168.field3030[var10++] = var220;
                                continue;
                            }
                            if (var487 == 5068) {
                                var10 -= 2;
                                int var221 = class168.field3030[var10];
                                int var222 = class168.field3030[var10 + 1];
                                class234.field4215.field2809[var221] = var222;
                                continue;
                            }
                            if (var487 == 5069) {
                                var10 -= 2;
                                int var223 = class168.field3030[var10 + 1];
                                int var224 = class168.field3030[var10];
                                class234.field4215.field2809[var224] = var223;
                                continue;
                            }
                            if (var487 == 5070) {
                                var10 -= 3;
                                int var225 = class168.field3030[var10 + 1];
                                int var226 = class168.field3030[var10];
                                int var227 = class168.field3030[var10 + 2];
                                class257 var228 = class215.method1507(var226, 12076);
                                if (var228.method1780(false, var225) != 0) {
                                    throw new RuntimeException("bad command");
                                }
                                class168.field3030[var10++] = var228.method1782(var227, -26923, var225);
                                continue;
                            }
                            if (var487 == 5071) {
                                var6--;
                                class209 var229 = class289.field5106[var6];
                                var10--;
                                boolean var230 = class168.field3030[var10] == 1;
                                class37.method278(var229, var230, 2);
                                class168.field3030[var10++] = class289.field5092;
                                continue;
                            }
                            if (var487 == 5072) {
                                if (class3.field47 != null && class289.field5092 > class28.field519) {
                                    class168.field3030[var10++] = class27.method220(65535, class3.field47[class28.field519++]);
                                    continue;
                                }
                                class168.field3030[var10++] = -1;
                                continue;
                            }
                            if (var487 == 5073) {
                                class28.field519 = 0;
                                continue;
                            }
                        } else if (var487 < 5200) {
                            if (var487 == 5100) {
                                if (class228.field4153[86]) {
                                    class168.field3030[var10++] = 1;
                                } else {
                                    class168.field3030[var10++] = 0;
                                }
                                continue;
                            }
                            if (var487 == 5101) {
                                if (class228.field4153[82]) {
                                    class168.field3030[var10++] = 1;
                                } else {
                                    class168.field3030[var10++] = 0;
                                }
                                continue;
                            }
                            if (var487 == 5102) {
                                if (class228.field4153[81]) {
                                    class168.field3030[var10++] = 1;
                                } else {
                                    class168.field3030[var10++] = 0;
                                }
                                continue;
                            }
                        } else if (var487 < 5300) {
                            if (var487 == 5200) {
                                var10--;
                                class142.method992(class168.field3030[var10], -8949);
                                continue;
                            }
                            if (var487 == 5201) {
                                class168.field3030[var10++] = class134.method937(false);
                                continue;
                            }
                            if (var487 == 5202) {
                                var10--;
                                class90.method643(-151, class168.field3030[var10]);
                                continue;
                            }
                            if (var487 == 5203) {
                                var6--;
                                class164.method1135(0, class289.field5106[var6]);
                                continue;
                            }
                            if (var487 == 5204) {
                                class289.field5106[var6 - 1] = class256.method1771(class289.field5106[var6 - 1], false);
                                continue;
                            }
                            if (var487 == 5205) {
                                var6--;
                                class222.method1570(class289.field5106[var6], (byte) 45);
                                continue;
                            }
                            if (var487 == 5206) {
                                var10--;
                                int var296 = class168.field3030[var10];
                                class284 var297 = class200.method1366(89, var296 >> 14 & 0x3FFF, var296 & 0x3FFF);
                                if (var297 == null) {
                                    class289.field5106[var6++] = class37.field645;
                                } else {
                                    class289.field5106[var6++] = var297.field4994;
                                }
                                continue;
                            }
                            if (var487 == 5207) {
                                var6--;
                                class284 var298 = class32.method258((byte) 72, class289.field5106[var6]);
                                if (var298 != null && var298.field5005 != null) {
                                    class289.field5106[var6++] = var298.field5005;
                                    continue;
                                }
                                class289.field5106[var6++] = class37.field645;
                                continue;
                            }
                            if (var487 == 5208) {
                                class168.field3030[var10++] = class38.field652;
                                class168.field3030[var10++] = class67.field1287;
                                continue;
                            }
                            if (var487 == 5209) {
                                class168.field3030[var10++] = class200.field3580 + class38.field654;
                                class168.field3030[var10++] = class98.field1921 + class224.field4082 - class118.field2370 - 1;
                                continue;
                            }
                            if (var487 == 5210) {
                                class284 var299 = class128.method922((byte) 99);
                                if (var299 == null) {
                                    class168.field3030[var10++] = 0;
                                    class168.field3030[var10++] = 0;
                                } else {
                                    class168.field3030[var10++] = var299.field4991 * 64;
                                    class168.field3030[var10++] = var299.field4985 * 64;
                                }
                                continue;
                            }
                            if (var487 == 5211) {
                                class284 var300 = class128.method922((byte) -101);
                                if (var300 == null) {
                                    class168.field3030[var10++] = 0;
                                    class168.field3030[var10++] = 0;
                                } else {
                                    class168.field3030[var10++] = var300.field4981 - var300.field4987;
                                    class168.field3030[var10++] = var300.field4983 - var300.field5006;
                                }
                                continue;
                            }
                            if (var487 == 5212) {
                                int var301 = class111.method797(-30532);
                                int var302 = 0;
                                class209 var303;
                                if (var301 == -1) {
                                    var303 = class37.field645;
                                } else {
                                    var303 = class134.field2548.field3032[var301];
                                    var302 = class134.field2548.method1154(var301, 3);
                                }
                                class209 var304 = var303.method1471(class275.field4861, class222.field4064, false);
                                class289.field5106[var6++] = var304;
                                class168.field3030[var10++] = var302;
                                continue;
                            }
                            if (var487 == 5213) {
                                int var305 = class288.method1939(-1);
                                int var306 = 0;
                                class209 var307;
                                if (var305 == -1) {
                                    var307 = class37.field645;
                                } else {
                                    var307 = class134.field2548.field3032[var305];
                                    var306 = class134.field2548.method1154(var305, 3);
                                }
                                class209 var308 = var307.method1471(class275.field4861, class222.field4064, false);
                                class289.field5106[var6++] = var308;
                                class168.field3030[var10++] = var306;
                                continue;
                            }
                            if (var487 == 5214) {
                                var10--;
                                int var309 = class168.field3030[var10];
                                class154.method1069(var309 >> 14 & 0x3FFF, (byte) 125, var309 & 0x3FFF);
                                continue;
                            }
                        } else if (var487 < 5400) {
                            if (var487 == 5300) {
                                var10 -= 2;
                                class168.field3030[var10++] = 0;
                                continue;
                            }
                            if (var487 == 5301) {
                                continue;
                            }
                            if (var487 == 5302) {
                                class168.field3030[var10++] = 0;
                                continue;
                            }
                            if (var487 == 5303) {
                                var10--;
                                class168.field3030[var10++] = 0;
                                class168.field3030[var10++] = 0;
                                continue;
                            }
                            if (var487 == 5305) {
                                byte var231 = -1;
                                class168.field3030[var10++] = var231;
                                continue;
                            }
                            if (var487 == 5306) {
                                class168.field3030[var10++] = class258.method1788(28);
                                continue;
                            }
                            if (var487 == 5307) {
                                var10--;
                                int var232 = class168.field3030[var10];
                                if (var232 < 0 || var232 > 2) {
                                    var232 = 0;
                                }
                                class257.method1779((byte) -65, var232, false, -1, -1);
                                continue;
                            }
                            if (var487 == 5308) {
                                class168.field3030[var10++] = class54.field1063;
                                continue;
                            }
                            if (var487 == 5309) {
                                var10--;
                                int var233 = class168.field3030[var10];
                                if (var233 < 0 || var233 > 2) {
                                    var233 = 0;
                                }
                                class54.field1063 = var233;
                                class183.method1250((byte) 49, class230.field4187);
                                continue;
                            }
                        } else if (var487 < 5500) {
                            if (var487 == 5400) {
                                class166.field3000++;
                                var6 -= 2;
                                class209 var234 = class289.field5106[var6];
                                var10--;
                                int var235 = class168.field3030[var10];
                                class209 var236 = class289.field5106[var6 + 1];
                                class84.field1677.method287((byte) 127, 190);
                                class84.field1677.method773(-6385, class254.method1750(true, var234) + class254.method1750(true, var236) + 1);
                                class84.field1677.method745(var234, (byte) -95);
                                class84.field1677.method745(var236, (byte) 46);
                                class84.field1677.method773(-6385, var235);
                                continue;
                            }
                            if (var487 == 5401) {
                                var10 -= 2;
                                class276.field4872[class168.field3030[var10]] = (short) class177.method1219(class168.field3030[var10 + 1], -1636);
                                class6.method60((byte) -121);
                                class33.method259(-63);
                                class137.method957((byte) -101);
                                class122.method892((byte) -106);
                                class285.method1917((byte) 87);
                                continue;
                            }
                            if (var487 == 5405) {
                                var10 -= 2;
                                int var237 = class168.field3030[var10];
                                int var238 = class168.field3030[var10 + 1];
                                if (var237 >= 0 && var237 < 2) {
                                    class25.field476[var237] = new int[var238 << 1][4];
                                }
                                continue;
                            }
                            if (var487 == 5406) {
                                var10 -= 7;
                                int var239 = class168.field3030[var10 + 2];
                                int var240 = class168.field3030[var10];
                                int var241 = class168.field3030[var10 + 3];
                                int var242 = class168.field3030[var10 + 1] << 1;
                                int var243 = class168.field3030[var10 + 6];
                                int var244 = class168.field3030[var10 + 4];
                                int var245 = class168.field3030[var10 + 5];
                                if (var240 >= 0 && var240 < 2 && class25.field476[var240] != null && var242 >= 0 && var242 < class25.field476[var240].length) {
                                    class25.field476[var240][var242] = new int[] { class27.method220(var239 >> 14, 16383) * 128, var241, class27.method220(16383, var239) * 128, var243 };
                                    class25.field476[var240][var242 + 1] = new int[] { (class27.method220(var244, 268425364) >> 14) * 128, var245, class27.method220(var244, 16383) * 128 };
                                }
                                continue;
                            }
                            if (var487 == 5407) {
                                var10--;
                                int var246 = class25.field476[class168.field3030[var10]].length >> 1;
                                class168.field3030[var10++] = var246;
                                continue;
                            }
                            if (var487 == 5411) {
                                if (class230.field4176 == null) {
                                    class163.method1130(class34.method268(14537), false, 0);
                                } else {
                                    System.exit(0);
                                }
                                continue;
                            }
                            if (var487 == 5419) {
                                class209 var247 = class37.field645;
                                if (class170.field3100 != null) {
                                    var247 = class38.method285((byte) -95, class170.field3100.field3645);
                                    try {
                                        if (class170.field3100.field3642 != null) {
                                            byte[] var248 = ((String) class170.field3100.field3642).getBytes("ISO-8859-1");
                                            var247 = class281.method1897(0, var248.length, -29806, var248);
                                        }
                                    } catch (UnsupportedEncodingException var485) {
                                    }
                                }
                                class289.field5106[var6++] = var247;
                                continue;
                            }
                            if (var487 == 5420) {
                                class168.field3030[var10++] = class143.field2644 == 3 ? 1 : 0;
                                continue;
                            }
                            if (var487 == 5421) {
                                var6--;
                                class209 var249 = class289.field5106[var6];
                                var10--;
                                boolean var250 = class168.field3030[var10] == 1;
                                class209 var251 = class229.method1604(new class209[] { class34.method268(14537), var249 }, (byte) 37);
                                if (class230.field4176 == null && (!var250 || class143.field2644 == 3 || !class143.field2639.startsWith("win") || class197.field3539)) {
                                    class163.method1130(var251, var250, 0);
                                    continue;
                                }
                                class172.field3139 = var251;
                                class45.field892 = var250;
                                class230.field4173 = class230.field4187.method1003((byte) 115, new String(var251.method1455((byte) -22), "ISO-8859-1"));
                                continue;
                            }
                            if (var487 == 5422) {
                                var6 -= 2;
                                var10--;
                                int var252 = class168.field3030[var10];
                                class209 var253 = class289.field5106[var6 + 1];
                                class209 var254 = class289.field5106[var6];
                                if (var254.method1486(5) > 0) {
                                    if (class2.field33 == null) {
                                        class2.field33 = new class209[class186.field3350[class218.field3936]];
                                    }
                                    class2.field33[var252] = var254;
                                }
                                if (var253.method1486(5) > 0) {
                                    if (class227.field4146 == null) {
                                        class227.field4146 = new class209[class186.field3350[class218.field3936]];
                                    }
                                    class227.field4146[var252] = var253;
                                }
                                continue;
                            }
                            if (var487 == 5423) {
                                var6--;
                                class289.field5106[var6].method1464(106);
                                continue;
                            }
                        } else if (var487 < 5600) {
                            if (var487 == 5500) {
                                var10 -= 4;
                                int var255 = class168.field3030[var10];
                                int var256 = class168.field3030[var10 + 1];
                                int var257 = class168.field3030[var10 + 2];
                                int var258 = class168.field3030[var10 + 3];
                                class239.method1655((byte) -67, var256, var257, false, (var255 >> 14 & 0x3FFF) - field3178, (var255 & 0x3FFF) - class245.field4444, var258);
                                continue;
                            }
                            if (var487 == 5501) {
                                var10 -= 4;
                                int var259 = class168.field3030[var10 + 1];
                                int var260 = class168.field3030[var10 + 2];
                                int var261 = class168.field3030[var10];
                                int var262 = class168.field3030[var10 + 3];
                                class51.method389(var259, (var261 & 0x3FFF) - class245.field4444, ((var261 & 0xFFFCB92) >> 14) + -field3178, var262, var260, -123);
                                continue;
                            }
                            if (var487 == 5502) {
                                var10 -= 6;
                                int var263 = class168.field3030[var10];
                                if (var263 >= 2) {
                                    throw new RuntimeException();
                                }
                                class14.field262 = var263;
                                int var264 = class168.field3030[var10 + 1];
                                if ((var264 + 1) >= (class25.field476[class14.field262].length >> 1)) {
                                    throw new RuntimeException();
                                }
                                class160.field2910 = var264;
                                class144.field2662 = 0;
                                class95.field1878 = class168.field3030[var10 + 2];
                                class33.field587 = class168.field3030[var10 + 3];
                                int var265 = class168.field3030[var10 + 4];
                                if (var265 >= 2) {
                                    throw new RuntimeException();
                                }
                                class181.field3263 = var265;
                                int var266 = class168.field3030[var10 + 5];
                                if (class25.field476[class181.field3263].length >> 1 <= var266 + 1) {
                                    throw new RuntimeException();
                                }
                                class155.field2843 = var266;
                                class16.field334 = 3;
                                continue;
                            }
                            if (var487 == 5503) {
                                class137.method948(25676);
                                continue;
                            }
                            if (var487 == 5504) {
                                var10 -= 2;
                                class28.field496 = class168.field3030[var10];
                                class253.field4565 = class168.field3030[var10 + 1];
                                class237.method1634(-13);
                                continue;
                            }
                            if (var487 == 5505) {
                                class168.field3030[var10++] = class28.field496;
                                continue;
                            }
                            if (var487 == 5506) {
                                class168.field3030[var10++] = class253.field4565;
                                continue;
                            }
                        } else if (var487 < 5700) {
                            if (var487 == 5600) {
                                var6 -= 2;
                                class209 var267 = class289.field5106[var6];
                                class209 var268 = class289.field5106[var6 + 1];
                                var10--;
                                int var269 = class168.field3030[var10];
                                if (class284.field5008 == 10 && class168.field3018 == 0 && class168.field3023 == 0 && class78.field1444 == 0 && class185.field3343 == 0) {
                                    class173.method1194(var268, var267, var269, 32);
                                }
                                continue;
                            }
                            if (var487 == 5601) {
                                class56.method440(102);
                                continue;
                            }
                            if (var487 == 5602) {
                                if (class168.field3023 == 0) {
                                    class8.field164 = -2;
                                }
                                continue;
                            }
                            if (var487 == 5603) {
                                var10 -= 4;
                                if (class284.field5008 == 10 && class168.field3018 == 0 && class168.field3023 == 0 && class78.field1444 == 0 && class185.field3343 == 0) {
                                    class44.method327((byte) -124, class168.field3030[var10 + 2], class168.field3030[var10], class168.field3030[var10 + 3], class168.field3030[var10 + 1]);
                                }
                                continue;
                            }
                            if (var487 == 5604) {
                                var6--;
                                if (class284.field5008 == 10 && class168.field3018 == 0 && class168.field3023 == 0 && class78.field1444 == 0 && class185.field3343 == 0) {
                                    class179.method1233(true, class289.field5106[var6].method1448(true));
                                }
                                continue;
                            }
                            if (var487 == 5605) {
                                var10 -= 4;
                                var6 -= 2;
                                if (class284.field5008 == 10 && class168.field3018 == 0 && class168.field3023 == 0 && class78.field1444 == 0 && class185.field3343 == 0) {
                                    class197.method1349(128, class168.field3030[var10 + 1], class168.field3030[var10], class168.field3030[var10 + 3], class289.field5106[var6].method1448(true), class289.field5106[var6 + 1], class168.field3030[var10 + 2]);
                                }
                                continue;
                            }
                            if (var487 == 5606) {
                                if (class78.field1444 == 0) {
                                    class72.field1360 = -2;
                                }
                                continue;
                            }
                            if (var487 == 5607) {
                                class168.field3030[var10++] = class8.field164;
                                continue;
                            }
                            if (var487 == 5608) {
                                class168.field3030[var10++] = class129.field2488;
                                continue;
                            }
                            if (var487 == 5609) {
                                class168.field3030[var10++] = class72.field1360;
                                continue;
                            }
                            if (var487 == 5610) {
                                for (int var270 = 0; var270 < 5; var270++) {
                                    class289.field5106[var6++] = var270 >= class144.field2655.length ? class37.field645 : class144.field2655[var270].method1459((byte) -115);
                                }
                                class144.field2655 = null;
                                continue;
                            }
                            if (var487 == 5611) {
                                class168.field3030[var10++] = class195.field3516;
                                continue;
                            }
                        } else if (var487 < 6100) {
                            if (var487 == 6001) {
                                var10--;
                                int var271 = class168.field3030[var10];
                                if (var271 < 1) {
                                    var271 = 1;
                                }
                                if (var271 > 4) {
                                    var271 = 4;
                                }
                                class128.field2469 = var271;
                                if (class128.field2469 == 1) {
                                    class15.method112(0.9F);
                                }
                                if (class128.field2469 == 2) {
                                    class15.method112(0.8F);
                                }
                                if (class128.field2469 == 3) {
                                    class15.method112(0.7F);
                                }
                                if (class128.field2469 == 4) {
                                    class15.method112(0.6F);
                                }
                                class33.method259(-104);
                                class183.method1250((byte) 49, class230.field4187);
                                class223.field4068 = false;
                                continue;
                            }
                            if (var487 == 6002) {
                                var10--;
                                class44.method335(true, class168.field3030[var10] == 1);
                                class252.method1741(-28543);
                                class186.method1267((byte) 8);
                                class230.method1609(-6099);
                                class183.method1250((byte) 49, class230.field4187);
                                class223.field4068 = false;
                                continue;
                            }
                            if (var487 == 6003) {
                                var10--;
                                class129.field2484 = class168.field3030[var10] == 1;
                                class230.method1609(-6099);
                                class183.method1250((byte) 49, class230.field4187);
                                class223.field4068 = false;
                                continue;
                            }
                            if (var487 == 6005) {
                                var10--;
                                class52.field1022 = class168.field3030[var10] == 1;
                                class186.method1267((byte) 8);
                                class183.method1250((byte) 49, class230.field4187);
                                class223.field4068 = false;
                                continue;
                            }
                            if (var487 == 6006) {
                                var10--;
                                class84.field1681 = class168.field3030[var10] == 1;
                                ((class279) class15.field271).method1884(false, !class84.field1681);
                                class183.method1250((byte) 49, class230.field4187);
                                class223.field4068 = false;
                                continue;
                            }
                            if (var487 == 6007) {
                                var10--;
                                class161.field2917 = class168.field3030[var10] == 1;
                                class183.method1250((byte) 49, class230.field4187);
                                class223.field4068 = false;
                                continue;
                            }
                            if (var487 == 6008) {
                                var10--;
                                class9.field185 = class168.field3030[var10] == 1;
                                class183.method1250((byte) 49, class230.field4187);
                                class223.field4068 = false;
                                continue;
                            }
                            if (var487 == 6009) {
                                var10--;
                                class39.field662 = class168.field3030[var10] == 1;
                                class183.method1250((byte) 49, class230.field4187);
                                class223.field4068 = false;
                                continue;
                            }
                            if (var487 == 6010) {
                                var10--;
                                class234.field4209 = class168.field3030[var10] == 1;
                                class183.method1250((byte) 49, class230.field4187);
                                class223.field4068 = false;
                                continue;
                            }
                            if (var487 == 6011) {
                                var10--;
                                int var272 = class168.field3030[var10];
                                if (var272 < 0 || var272 > 2) {
                                    var272 = 0;
                                }
                                class254.field4587 = var272;
                                class183.method1250((byte) 49, class230.field4187);
                                class223.field4068 = false;
                                continue;
                            }
                            if (var487 == 6012) {
                                var10--;
                                class163.field2961 = class168.field3030[var10] == 1;
                                if (class128.field2469 == 1) {
                                    class15.method112(0.9F);
                                }
                                if (class128.field2469 == 2) {
                                    class15.method112(0.8F);
                                }
                                if (class128.field2469 == 3) {
                                    class15.method112(0.7F);
                                }
                                if (class128.field2469 == 4) {
                                    class15.method112(0.6F);
                                }
                                class186.method1267((byte) 8);
                                class183.method1250((byte) 49, class230.field4187);
                                class223.field4068 = false;
                                continue;
                            }
                            if (var487 == 6014) {
                                var10--;
                                class145.field2671 = class168.field3030[var10] == 1;
                                class183.method1250((byte) 49, class230.field4187);
                                class223.field4068 = false;
                                continue;
                            }
                            if (var487 == 6015) {
                                var10--;
                                class281.field4940 = class168.field3030[var10] == 1;
                                class183.method1250((byte) 49, class230.field4187);
                                class223.field4068 = false;
                                continue;
                            }
                            if (var487 == 6016) {
                                var10--;
                                int var273 = class168.field3030[var10];
                                if (var273 < 0 || var273 > 2) {
                                    var273 = 0;
                                }
                                class163.field2960 = var273;
                                continue;
                            }
                            if (var487 == 6017) {
                                var10--;
                                class71.field1343 = class168.field3030[var10] == 1;
                                class284.method1911((byte) -81);
                                class183.method1250((byte) 49, class230.field4187);
                                class223.field4068 = false;
                                continue;
                            }
                            if (var487 == 6018) {
                                var10--;
                                int var274 = class168.field3030[var10];
                                if (var274 < 0) {
                                    var274 = 0;
                                }
                                if (var274 > 127) {
                                    var274 = 127;
                                }
                                class75.field1406 = var274;
                                class183.method1250((byte) 49, class230.field4187);
                                class223.field4068 = false;
                                continue;
                            }
                            if (var487 == 6019) {
                                var10--;
                                int var275 = class168.field3030[var10];
                                if (var275 < 0) {
                                    var275 = 0;
                                }
                                if (var275 > 255) {
                                    var275 = 255;
                                }
                                if (class258.field4662 != var275) {
                                    if (class258.field4662 == 0 && class59.field1184 != -1) {
                                        class51.method391(class279.field4902, false, 0, class59.field1184, true, var275);
                                        class94.field1865 = false;
                                    } else if (var275 == 0) {
                                        class80.method567(-91);
                                        class94.field1865 = false;
                                    } else {
                                        class64.method478(100, var275);
                                    }
                                    class258.field4662 = var275;
                                }
                                class183.method1250((byte) 49, class230.field4187);
                                class223.field4068 = false;
                                continue;
                            }
                            if (var487 == 6020) {
                                var10--;
                                int var276 = class168.field3030[var10];
                                if (var276 < 0) {
                                    var276 = 0;
                                }
                                if (var276 > 127) {
                                    var276 = 127;
                                }
                                class176.field3202 = var276;
                                class183.method1250((byte) 49, class230.field4187);
                                class223.field4068 = false;
                                continue;
                            }
                            if (var487 == 6021) {
                                var10--;
                                class51.field1008 = class168.field3030[var10] == 1;
                                class230.method1609(-6099);
                                continue;
                            }
                            if (var487 == 6023) {
                                var10--;
                                int var277 = class168.field3030[var10];
                                if (var277 < 0) {
                                    var277 = 0;
                                }
                                if (var277 > 2) {
                                    var277 = 2;
                                }
                                class221.method1565(var277);
                                class183.method1250((byte) 49, class230.field4187);
                                class223.field4068 = false;
                                continue;
                            }
                            if (var487 == 6024) {
                                var10--;
                                int var278 = class168.field3030[var10];
                                if (var278 < 0 || var278 > 2) {
                                    var278 = 0;
                                }
                                class202.field3639 = var278;
                                class183.method1250((byte) 49, class230.field4187);
                                continue;
                            }
                        } else if (var487 < 6200) {
                            if (var487 == 6101) {
                                class168.field3030[var10++] = class128.field2469;
                                continue;
                            }
                            if (var487 == 6102) {
                                class168.field3030[var10++] = class186.method1273(-90) ? 1 : 0;
                                continue;
                            }
                            if (var487 == 6103) {
                                class168.field3030[var10++] = class129.field2484 ? 1 : 0;
                                continue;
                            }
                            if (var487 == 6105) {
                                class168.field3030[var10++] = class52.field1022 ? 1 : 0;
                                continue;
                            }
                            if (var487 == 6106) {
                                class168.field3030[var10++] = class84.field1681 ? 1 : 0;
                                continue;
                            }
                            if (var487 == 6107) {
                                class168.field3030[var10++] = class161.field2917 ? 1 : 0;
                                continue;
                            }
                            if (var487 == 6108) {
                                class168.field3030[var10++] = class9.field185 ? 1 : 0;
                                continue;
                            }
                            if (var487 == 6109) {
                                class168.field3030[var10++] = class39.field662 ? 1 : 0;
                                continue;
                            }
                            if (var487 == 6110) {
                                class168.field3030[var10++] = class234.field4209 ? 1 : 0;
                                continue;
                            }
                            if (var487 == 6111) {
                                class168.field3030[var10++] = class254.field4587;
                                continue;
                            }
                            if (var487 == 6112) {
                                class168.field3030[var10++] = class163.field2961 ? 1 : 0;
                                continue;
                            }
                            if (var487 == 6114) {
                                class168.field3030[var10++] = class145.field2671 ? 1 : 0;
                                continue;
                            }
                            if (var487 == 6115) {
                                class168.field3030[var10++] = class281.field4940 ? 1 : 0;
                                continue;
                            }
                            if (var487 == 6116) {
                                class168.field3030[var10++] = class163.field2960;
                                continue;
                            }
                            if (var487 == 6117) {
                                class168.field3030[var10++] = class71.field1343 ? 1 : 0;
                                continue;
                            }
                            if (var487 == 6118) {
                                class168.field3030[var10++] = class75.field1406;
                                continue;
                            }
                            if (var487 == 6119) {
                                class168.field3030[var10++] = class258.field4662;
                                continue;
                            }
                            if (var487 == 6120) {
                                class168.field3030[var10++] = class176.field3202;
                                continue;
                            }
                            if (var487 == 6121) {
                                class168.field3030[var10++] = 0;
                                continue;
                            }
                            if (var487 == 6123) {
                                class168.field3030[var10++] = class221.method1561();
                                continue;
                            }
                            if (var487 == 6124) {
                                class168.field3030[var10++] = class202.field3639;
                                continue;
                            }
                        } else if (var487 < 6300) {
                            if (var487 == 6200) {
                                var10 -= 2;
                                class7.field145 = (short) class168.field3030[var10];
                                if (class7.field145 <= 0) {
                                    class7.field145 = 256;
                                }
                                class196.field3524 = (short) class168.field3030[var10 + 1];
                                if (class196.field3524 <= 0) {
                                    class196.field3524 = 205;
                                }
                                continue;
                            }
                            if (var487 == 6201) {
                                var10 -= 2;
                                class172.field3138 = (short) class168.field3030[var10];
                                if (class172.field3138 <= 0) {
                                    class172.field3138 = 256;
                                }
                                class275.field4867 = (short) class168.field3030[var10 + 1];
                                if (class275.field4867 <= 0) {
                                    class275.field4867 = 320;
                                }
                                continue;
                            }
                            if (var487 == 6202) {
                                var10 -= 4;
                                class197.field3536 = (short) class168.field3030[var10];
                                if (class197.field3536 <= 0) {
                                    class197.field3536 = 1;
                                }
                                class103.field1992 = (short) class168.field3030[var10 + 1];
                                if (class103.field1992 <= 0) {
                                    class103.field1992 = 32767;
                                } else if (class103.field1992 < class197.field3536) {
                                    class103.field1992 = class197.field3536;
                                }
                                class60.field1199 = (short) class168.field3030[var10 + 2];
                                if (class60.field1199 <= 0) {
                                    class60.field1199 = 1;
                                }
                                class60.field1200 = (short) class168.field3030[var10 + 3];
                                if (class60.field1200 <= 0) {
                                    class60.field1200 = 32767;
                                } else if (class60.field1200 < class60.field1199) {
                                    class60.field1200 = class60.field1199;
                                }
                                continue;
                            }
                            if (var487 == 6203) {
                                class142.method990(class51.field1021.field789, 0, 1, class51.field1021.field758, 0, false);
                                class168.field3030[var10++] = class98.field1919;
                                class168.field3030[var10++] = class256.field4627;
                                continue;
                            }
                            if (var487 == 6204) {
                                class168.field3030[var10++] = class172.field3138;
                                class168.field3030[var10++] = class275.field4867;
                                continue;
                            }
                            if (var487 == 6205) {
                                class168.field3030[var10++] = class7.field145;
                                class168.field3030[var10++] = class196.field3524;
                                continue;
                            }
                        } else if (var487 < 6400) {
                            if (var487 == 6300) {
                                class168.field3030[var10++] = (int) (class180.method1236(3) / 60000L);
                                continue;
                            }
                            if (var487 == 6301) {
                                class168.field3030[var10++] = (int) (class180.method1236(-115) / 86400000L) - 11745;
                                continue;
                            }
                            if (var487 == 6302) {
                                var10 -= 3;
                                int var291 = class168.field3030[var10 + 2];
                                int var292 = class168.field3030[var10];
                                int var293 = class168.field3030[var10 + 1];
                                class131.field2511.clear();
                                class131.field2511.set(11, 12);
                                class131.field2511.set(var291, var293, var292);
                                class168.field3030[var10++] = (int) (class131.field2511.getTime().getTime() / 86400000L) - 11745;
                                continue;
                            }
                            if (var487 == 6303) {
                                class131.field2511.clear();
                                class131.field2511.setTime(new Date(class180.method1236(109)));
                                class168.field3030[var10++] = class131.field2511.get(1);
                                continue;
                            }
                            if (var487 == 6304) {
                                var10--;
                                int var294 = class168.field3030[var10];
                                boolean var295 = true;
                                if (var294 < 0) {
                                    var295 = ((var294 + 1) % 4) == 0;
                                } else if (var294 < 1582) {
                                    var295 = (var294 % 4) == 0;
                                } else if ((var294 % 4) != 0) {
                                    var295 = false;
                                } else if ((var294 % 100) != 0) {
                                    var295 = true;
                                } else if (var294 % 400 != 0) {
                                    var295 = false;
                                }
                                class168.field3030[var10++] = var295 ? 1 : 0;
                                continue;
                            }
                        } else if (var487 < 6500) {
                            if (var487 == 6405) {
                                class168.field3030[var10++] = class98.method689(true) ? 1 : 0;
                                continue;
                            }
                            if (var487 == 6406) {
                                class168.field3030[var10++] = class171.method1183(-97) ? 1 : 0;
                                continue;
                            }
                        } else if (var487 < 6600) {
                            if (var487 == 6500) {
                                if (class284.field5008 == 10 && class168.field3018 == 0 && class168.field3023 == 0 && class78.field1444 == 0) {
                                    class168.field3030[var10++] = class237.method1640(false) == -1 ? 0 : 1;
                                    continue;
                                }
                                class168.field3030[var10++] = 1;
                                continue;
                            }
                            if (var487 == 6501) {
                                class159 var279 = class40.method298(0);
                                if (var279 == null) {
                                    class168.field3030[var10++] = -1;
                                    class168.field3030[var10++] = 0;
                                    class289.field5106[var6++] = class37.field645;
                                    class168.field3030[var10++] = 0;
                                    class289.field5106[var6++] = class37.field645;
                                    class168.field3030[var10++] = 0;
                                } else {
                                    class168.field3030[var10++] = var279.field2894;
                                    class168.field3030[var10++] = var279.field2379;
                                    class289.field5106[var6++] = var279.field2897;
                                    class11 var280 = var279.method1104(-118);
                                    class168.field3030[var10++] = var280.field208;
                                    class289.field5106[var6++] = var280.field221;
                                    class168.field3030[var10++] = var279.field2380;
                                }
                                continue;
                            }
                            if (var487 == 6502) {
                                class159 var281 = class277.method1877(104);
                                if (var281 == null) {
                                    class168.field3030[var10++] = -1;
                                    class168.field3030[var10++] = 0;
                                    class289.field5106[var6++] = class37.field645;
                                    class168.field3030[var10++] = 0;
                                    class289.field5106[var6++] = class37.field645;
                                    class168.field3030[var10++] = 0;
                                } else {
                                    class168.field3030[var10++] = var281.field2894;
                                    class168.field3030[var10++] = var281.field2379;
                                    class289.field5106[var6++] = var281.field2897;
                                    class11 var282 = var281.method1104(-122);
                                    class168.field3030[var10++] = var282.field208;
                                    class289.field5106[var6++] = var282.field221;
                                    class168.field3030[var10++] = var281.field2380;
                                }
                                continue;
                            }
                            if (var487 == 6503) {
                                var10--;
                                int var283 = class168.field3030[var10];
                                if (class284.field5008 == 10 && class168.field3018 == 0 && class168.field3023 == 0 && class78.field1444 == 0) {
                                    class168.field3030[var10++] = class168.method1153(0, var283) ? 1 : 0;
                                    continue;
                                }
                                class168.field3030[var10++] = 0;
                                continue;
                            }
                            if (var487 == 6504) {
                                var10--;
                                class70.field1338 = class168.field3030[var10];
                                class183.method1250((byte) 49, class230.field4187);
                                continue;
                            }
                            if (var487 == 6505) {
                                class168.field3030[var10++] = class70.field1338;
                                continue;
                            }
                            if (var487 == 6506) {
                                var10--;
                                int var284 = class168.field3030[var10];
                                class159 var285 = class117.method829(var284, -63);
                                if (var285 == null) {
                                    class168.field3030[var10++] = -1;
                                    class289.field5106[var6++] = class37.field645;
                                    class168.field3030[var10++] = 0;
                                    class289.field5106[var6++] = class37.field645;
                                    class168.field3030[var10++] = 0;
                                } else {
                                    class168.field3030[var10++] = var285.field2379;
                                    class289.field5106[var6++] = var285.field2897;
                                    class11 var286 = var285.method1104(-127);
                                    class168.field3030[var10++] = var286.field208;
                                    class289.field5106[var6++] = var286.field221;
                                    class168.field3030[var10++] = var285.field2380;
                                }
                                continue;
                            }
                            if (var487 == 6507) {
                                var10 -= 4;
                                boolean var287 = class168.field3030[var10 + 1] == 1;
                                int var288 = class168.field3030[var10];
                                int var289 = class168.field3030[var10 + 2];
                                boolean var290 = class168.field3030[var10 + 3] == 1;
                                class273.method1859(var288, var289, var287, (byte) 126, var290);
                                continue;
                            }
                        } else if (var487 < 6700) {
                            if (var487 == 6600) {
                                var10--;
                                class69.field1319 = class168.field3030[var10] == 1;
                                class183.method1250((byte) 49, class230.field4187);
                                continue;
                            }
                            if (var487 == 6601) {
                                class168.field3030[var10++] = class69.field1319 ? 1 : 0;
                                continue;
                            }
                        }
                    } else if (var487 == 4400) {
                        var10 -= 2;
                        int var310 = class168.field3030[var10];
                        int var311 = class168.field3030[var10 + 1];
                        class288 var312 = class273.method1866(var311, -10249);
                        if (var312.method1936((byte) 125)) {
                            class289.field5106[var6++] = class245.method1711(27093, var310).method1536(var311, (byte) -10, var312.field5090);
                        } else {
                            class168.field3030[var10++] = class245.method1711(27093, var310).method1532(2, var311, var312.field5084);
                        }
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var486) {
            if (var5.field2659 == null) {
                if (class100.field1945 != 0) {
                    class238.method1649((byte) -118, class37.field645, 0, class90.field1770);
                }
                class78.method548((byte) -17, "CS2 - scr:" + var5.field596 + " op:" + var11, var486);
            } else {
                class209 var482 = class79.method554(-30159, 30);
                var482.method1445(class60.field1206, (byte) -76).method1445(var5.field2659, (byte) -76);
                for (int var483 = class63.field1237 - 1; var483 >= 0; var483--) {
                    var482.method1445(class276.field4870, (byte) -76).method1445(class274.field4851[var483].field1679.field2659, (byte) -76);
                }
                if (var11 == 40) {
                    int var484 = var8[var7];
                    var482.method1445(class274.field4855, (byte) -76).method1445(class66.method485(var484, (byte) 43), (byte) -76);
                }
                if (class100.field1945 != 0) {
                    class238.method1649((byte) -118, class37.field645, 0, class229.method1604(new class209[] { class44.field870, var5.field2659 }, (byte) 57));
                }
                class78.method548((byte) -17, "CS2 - scr:" + var5.field596 + " op:" + var11 + new String(var482.method1455((byte) -17)), var486);
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
    public static void method1200(byte arg0) {
        field3173 = null;
        field3175 = null;
        if (arg0 <= 52) {
            method1199(-51, (class227) null, -12);
        }
        field3177 = null;
        field3181 = null;
        field3171 = null;
    }
}
