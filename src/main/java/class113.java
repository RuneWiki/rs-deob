import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class113 extends class256 {

    @OriginalMember(owner = "client!vj", name = "A", descriptor = "Ljd;")
    public static class86 field2149 = class122.method868("k", true);

    @OriginalMember(owner = "client!vj", name = "G", descriptor = "Ljd;")
    public static class86 field2154 = class122.method868("details", true);

    @OriginalMember(owner = "client!vj", name = "B", descriptor = "I")
    public static int field2150 = 0;

    @OriginalMember(owner = "client!vj", name = "L", descriptor = "[J")
    public static long[] field2159 = new long[100];

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!vj", name = "x", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!vj", name = "y", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!vj", name = "C", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!vj", name = "E", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!vj", name = "H", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!vj", name = "I", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!vj", name = "J", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!vj", name = "N", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!vj", name = "O", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!vj", name = "P", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!vj", name = "Q", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!vj", name = "K", descriptor = "[I")
    private int[] field2158;

    @OriginalMember(owner = "client!vj", name = "R", descriptor = "[I")
    private int[] field2165;

    @OriginalMember(owner = "client!vj", name = "M", descriptor = "[Ljd;")
    private class86[] field2160;

    @OriginalMember(owner = "client!vj", name = "F", descriptor = "[[I")
    private int[][] field2153;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZI)I")
    private final int method793(boolean arg0, int arg1) {
        if (arg0) {
            return -59;
        } else {
            field2145++;
            return this.field2165 == null || arg1 < 0 || this.field2165.length < arg1 ? -1 : this.field2165[arg1];
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BLqk;)V")
    public final void method794(byte arg0, class200 arg1) {
        field2152++;
        while (true) {
            int var3 = arg1.method1408((byte) -50);
            if (var3 == 0) {
                if (arg0 >= -78) {
                    this.field2158 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method801(var3, -123, arg1);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lqk;B[I)V")
    private final void method795(class200 arg0, byte arg1, int[] arg2) {
        field2161++;
        if (this.field2165 == null) {
            return;
        }
        int var4 = 107 / ((arg1 - 55) / 38);
        for (int var5 = 0; var5 < this.field2165.length; var5++) {
            if (var5 >= arg2.length) {
                return;
            }
            int var6 = class234.field4231[this.method793(false, var5)];
            if (var6 > 0) {
                arg0.method1422(var6, (long) arg2[var5], (byte) -124);
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IILi;)V")
    public static final void method796(int arg0, int arg1, class55 arg2) {
        field2163++;
        Object[] var3 = arg2.field1128;
        int var4 = (Integer) var3[0];
        class191 var5 = class116.method823(25147, var4);
        if (var5 == null) {
            return;
        }
        class114.field2169 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int[] var9 = var5.field3385;
        int[] var10 = var5.field3379;
        byte var11 = -1;
        try {
            class204.field3688 = new class86[var5.field3386];
            class15.field439 = new int[var5.field3388];
            int var12 = 0;
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if ((var3[var14] instanceof Integer)) {
                    int var16 = (Integer) var3[var14];
                    if (var16 == -2147483647) {
                        var16 = arg2.field1121;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg2.field1113;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg2.field1114 == null ? -1 : arg2.field1114.field222;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg2.field1118;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg2.field1114 == null ? -1 : arg2.field1114.field177;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg2.field1129 == null ? -1 : arg2.field1129.field222;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg2.field1129 == null ? -1 : arg2.field1129.field177;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg2.field1115;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg2.field1119;
                    }
                    class15.field439[var12++] = var16;
                } else if (var3[var14] instanceof class86) {
                    class86 var15 = (class86) var3[var14];
                    if (var15.method625((byte) -16, class275.field4834)) {
                        var15 = arg2.field1123;
                    }
                    class204.field3688[var13++] = var15;
                }
            }
            int var17 = 0;
            if (arg1 != -6118) {
                method802((byte) -108);
            }
            label3590: while (true) {
                var17++;
                if (arg0 < var17) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var472 = var9[var8];
                if (var472 < 100) {
                    if (var472 == 0) {
                        class68.field1330[var6++] = var10[var8];
                        continue;
                    }
                    if (var472 == 1) {
                        int var18 = var10[var8];
                        class68.field1330[var6++] = class273.field4805[var18];
                        continue;
                    }
                    if (var472 == 2) {
                        int var19 = var10[var8];
                        var6--;
                        class274.method1867(class68.field1330[var6], arg1 - 1252110324, var19);
                        continue;
                    }
                    if (var472 == 3) {
                        class256.field4547[var7++] = var5.field3381[var8];
                        continue;
                    }
                    if (var472 == 6) {
                        var8 += var10[var8];
                        continue;
                    }
                    if (var472 == 7) {
                        var6 -= 2;
                        if (class68.field1330[var6 + 1] != class68.field1330[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var472 == 8) {
                        var6 -= 2;
                        if (class68.field1330[var6 + 1] == class68.field1330[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var472 == 9) {
                        var6 -= 2;
                        if (class68.field1330[var6 + 1] > class68.field1330[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var472 == 10) {
                        var6 -= 2;
                        if (class68.field1330[var6] > class68.field1330[var6 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var472 == 21) {
                        if (class114.field2169 == 0) {
                            return;
                        }
                        class185 var20 = class244.field4359[--class114.field2169];
                        var5 = var20.field3285;
                        class15.field439 = var20.field3280;
                        class204.field3688 = var20.field3279;
                        var10 = var5.field3379;
                        var9 = var5.field3385;
                        var8 = var20.field3274;
                        continue;
                    }
                    if (var472 == 25) {
                        int var21 = var10[var8];
                        class68.field1330[var6++] = class233.method1615(var21, (byte) -68);
                        continue;
                    }
                    if (var472 == 27) {
                        int var22 = var10[var8];
                        var6--;
                        class62.method446(123, class68.field1330[var6], var22);
                        continue;
                    }
                    if (var472 == 31) {
                        var6 -= 2;
                        if (class68.field1330[var6 + 1] >= class68.field1330[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var472 == 32) {
                        var6 -= 2;
                        if (class68.field1330[var6] >= class68.field1330[var6 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var472 == 33) {
                        class68.field1330[var6++] = class15.field439[var10[var8]];
                        continue;
                    }
                    int var10001;
                    if (var472 == 34) {
                        var10001 = var10[var8];
                        var6--;
                        class15.field439[var10001] = class68.field1330[var6];
                        continue;
                    }
                    if (var472 == 35) {
                        class256.field4547[var7++] = class204.field3688[var10[var8]];
                        continue;
                    }
                    if (var472 == 36) {
                        var10001 = var10[var8];
                        var7--;
                        class204.field3688[var10001] = class256.field4547[var7];
                        continue;
                    }
                    if (var472 == 37) {
                        int var23 = var10[var8];
                        var7 -= var23;
                        class86 var24 = class229.method1593(0, var23, var7, class256.field4547);
                        class256.field4547[var7++] = var24;
                        continue;
                    }
                    if (var472 == 38) {
                        var6--;
                        continue;
                    }
                    if (var472 == 39) {
                        var7--;
                        continue;
                    }
                    if (var472 == 40) {
                        int var25 = var10[var8];
                        class191 var26 = class116.method823(25147, var25);
                        int[] var27 = new int[var26.field3388];
                        class86[] var28 = new class86[var26.field3386];
                        for (int var29 = 0; var29 < var26.field3378; var29++) {
                            var27[var29] = class68.field1330[var6 + var29 - var26.field3378];
                        }
                        for (int var30 = 0; var30 < var26.field3377; var30++) {
                            var28[var30] = class256.field4547[var7 + var30 - var26.field3377];
                        }
                        var6 -= var26.field3378;
                        var7 -= var26.field3377;
                        class185 var31 = new class185();
                        var31.field3279 = class204.field3688;
                        var31.field3285 = var5;
                        var31.field3274 = var8;
                        var31.field3280 = class15.field439;
                        if (class114.field2169 >= class244.field4359.length) {
                            throw new RuntimeException();
                        }
                        class244.field4359[class114.field2169++] = var31;
                        var8 = -1;
                        var5 = var26;
                        class15.field439 = var27;
                        class204.field3688 = var28;
                        var10 = var26.field3379;
                        var9 = var26.field3385;
                        continue;
                    }
                    if (var472 == 42) {
                        class68.field1330[var6++] = class208.field3775[var10[var8]];
                        continue;
                    }
                    if (var472 == 43) {
                        int var32 = var10[var8];
                        var6--;
                        class208.field3775[var32] = class68.field1330[var6];
                        class251.method1695(var32, 14259);
                        continue;
                    }
                    if (var472 == 44) {
                        int var33 = var10[var8] & 0xFFFF;
                        int var34 = var10[var8] >> 16;
                        var6--;
                        int var35 = class68.field1330[var6];
                        if (var35 >= 0 && var35 <= 5000) {
                            class181.field3260[var34] = var35;
                            byte var36 = -1;
                            if (var33 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var37 >= var35) {
                                    continue label3590;
                                }
                                class204.field3694[var34][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var472 == 45) {
                        var6--;
                        int var38 = class68.field1330[var6];
                        int var39 = var10[var8];
                        if (var38 >= 0 && var38 < class181.field3260[var39]) {
                            class68.field1330[var6++] = class204.field3694[var39][var38];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var472 == 46) {
                        var6 -= 2;
                        int var40 = var10[var8];
                        int var41 = class68.field1330[var6];
                        if (var41 >= 0 && class181.field3260[var40] > var41) {
                            class204.field3694[var40][var41] = class68.field1330[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var472 == 47) {
                        class86 var42 = class246.field4374[var10[var8]];
                        if (var42 == null) {
                            var42 = class30.field645;
                        }
                        class256.field4547[var7++] = var42;
                        continue;
                    }
                    if (var472 == 48) {
                        int var43 = var10[var8];
                        var7--;
                        class246.field4374[var43] = class256.field4547[var7];
                        class62.method448((byte) 112, var43);
                        continue;
                    }
                    if (var472 == 51) {
                        class252 var44 = var5.field3382[var10[var8]];
                        var6--;
                        class2 var45 = (class2) var44.method1698((long) class68.field1330[var6], (byte) -115);
                        if (var45 != null) {
                            var8 += var45.field24;
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
                if (var472 < 300) {
                    if (var472 == 100) {
                        var6 -= 3;
                        int var47 = class68.field1330[var6 + 1];
                        int var48 = class68.field1330[var6 + 2];
                        int var49 = class68.field1330[var6];
                        if (var47 == 0) {
                            throw new RuntimeException();
                        }
                        class6 var50 = class25.method178(arg1 + 6218, var49);
                        if (var50.field216 == null) {
                            var50.field216 = new class6[var48 + 1];
                        }
                        if (var50.field216.length <= var48) {
                            class6[] var51 = new class6[var48 + 1];
                            for (int var52 = 0; var52 < var50.field216.length; var52++) {
                                var51[var52] = var50.field216[var52];
                            }
                            var50.field216 = var51;
                        }
                        if (var48 > 0 && var50.field216[var48 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var48 - 1));
                        }
                        class6 var53 = new class6();
                        var53.field217 = true;
                        var53.field177 = var48;
                        var53.field221 = var53.field222 = var50.field222;
                        var53.field184 = var47;
                        var50.field216[var48] = var53;
                        if (var46) {
                            class143.field2708 = var53;
                        } else {
                            class91.field1860 = var53;
                        }
                        class62.method441(-29481, var50);
                        continue;
                    }
                    if (var472 == 101) {
                        class6 var54 = var46 ? class143.field2708 : class91.field1860;
                        if (var54.field177 == -1) {
                            if (!var46) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class6 var55 = class25.method178(arg1 + 6199, var54.field222);
                        var55.field216[var54.field177] = null;
                        class62.method441(-29481, var55);
                        continue;
                    }
                    if (var472 == 102) {
                        var6--;
                        class6 var56 = class25.method178(88, class68.field1330[var6]);
                        var56.field216 = null;
                        class62.method441(-29481, var56);
                        continue;
                    }
                    if (var472 == 200) {
                        var6 -= 2;
                        int var57 = class68.field1330[var6];
                        int var58 = class68.field1330[var6 + 1];
                        class6 var59 = class229.method1596(var58, var57, (byte) -27);
                        if (var59 != null && var58 != -1) {
                            class68.field1330[var6++] = 1;
                            if (var46) {
                                class143.field2708 = var59;
                            } else {
                                class91.field1860 = var59;
                            }
                            continue;
                        }
                        class68.field1330[var6++] = 0;
                        continue;
                    }
                    if (var472 == 201) {
                        var6--;
                        int var60 = class68.field1330[var6];
                        class6 var61 = class25.method178(98, var60);
                        if (var61 == null) {
                            class68.field1330[var6++] = 0;
                        } else {
                            class68.field1330[var6++] = 1;
                            if (var46) {
                                class143.field2708 = var61;
                            } else {
                                class91.field1860 = var61;
                            }
                        }
                        continue;
                    }
                } else if (var472 < 500) {
                    if (var472 == 403) {
                        var6 -= 2;
                        int var461 = class68.field1330[var6];
                        int var462 = class68.field1330[var6 + 1];
                        if (var461 >= 7) {
                            var461 -= 7;
                        }
                        class124.field2412.field4019.method511(var462, var461, 105);
                        continue;
                    }
                    if (var472 == 404) {
                        var6 -= 2;
                        int var463 = class68.field1330[var6];
                        int var464 = class68.field1330[var6 + 1];
                        class124.field2412.field4019.method505(-126, var463, var464);
                        continue;
                    }
                    if (var472 == 410) {
                        var6--;
                        boolean var465 = class68.field1330[var6] != 0;
                        class124.field2412.field4019.method502(arg1 + 6126, var465);
                        continue;
                    }
                } else if (var472 >= 1000 && var472 < 1100 || var472 >= 2000 && var472 < 2100) {
                    class6 var455;
                    if (var472 < 2000) {
                        var455 = var46 ? class143.field2708 : class91.field1860;
                    } else {
                        var472 -= 1000;
                        var6--;
                        var455 = class25.method178(113, class68.field1330[var6]);
                    }
                    if (var472 == 1000) {
                        var6 -= 4;
                        var455.field87 = class68.field1330[var6];
                        var455.field202 = class68.field1330[var6 + 1];
                        int var456 = class68.field1330[var6 + 3];
                        if (var456 < 0) {
                            var456 = 0;
                        } else if (var456 > 5) {
                            var456 = 5;
                        }
                        int var457 = class68.field1330[var6 + 2];
                        var455.field168 = (byte) var456;
                        if (var457 < 0) {
                            var457 = 0;
                        } else if (var457 > 5) {
                            var457 = 5;
                        }
                        var455.field182 = (byte) var457;
                        class62.method441(-29481, var455);
                        class177.method1250(var455, false);
                        if (var455.field177 == -1) {
                            class114.method811(var455.field222, (byte) -105);
                        }
                        continue;
                    }
                    if (var472 == 1001) {
                        var6 -= 4;
                        var455.field98 = class68.field1330[var6];
                        var455.field225 = class68.field1330[var6 + 1];
                        var455.field214 = 0;
                        var455.field140 = 0;
                        int var458 = class68.field1330[var6 + 2];
                        int var459 = class68.field1330[var6 + 3];
                        if (var459 < 0) {
                            var459 = 0;
                        } else if (var459 > 4) {
                            var459 = 4;
                        }
                        var455.field244 = (byte) var459;
                        if (var458 < 0) {
                            var458 = 0;
                        } else if (var458 > 4) {
                            var458 = 4;
                        }
                        var455.field183 = (byte) var458;
                        class62.method441(-29481, var455);
                        class177.method1250(var455, false);
                        if (var455.field184 == 0) {
                            class142.method1010(var455, false, -126);
                        }
                        continue;
                    }
                    if (var472 == 1003) {
                        var6--;
                        boolean var460 = class68.field1330[var6] == 1;
                        if (var460 != var455.field231) {
                            var455.field231 = var460;
                            class62.method441(-29481, var455);
                        }
                        if (var455.field177 == -1) {
                            class234.method1623(false, var455.field222);
                        }
                        continue;
                    }
                    if (var472 == 1004) {
                        var6 -= 2;
                        var455.field94 = class68.field1330[var6];
                        var455.field220 = class68.field1330[var6 + 1];
                        class62.method441(arg1 - 23363, var455);
                        class177.method1250(var455, false);
                        if (var455.field184 == 0) {
                            class142.method1010(var455, false, -126);
                        }
                        continue;
                    }
                } else {
                    int var10000;
                    if (var472 >= 1100 && var472 < 1200 || var472 >= 2100 && var472 < 2200) {
                        class6 var452;
                        if (var472 >= 2000) {
                            var472 -= 1000;
                            var10000 = arg1 ^ 0xFFFFE869;
                            var6--;
                            var452 = class25.method178(var10000, class68.field1330[var6]);
                        } else {
                            var452 = var46 ? class143.field2708 : class91.field1860;
                        }
                        if (var472 == 1100) {
                            var6 -= 2;
                            var452.field138 = class68.field1330[var6];
                            if (var452.field114 - var452.field163 < var452.field138) {
                                var452.field138 = var452.field114 - var452.field163;
                            }
                            if (var452.field138 < 0) {
                                var452.field138 = 0;
                            }
                            var452.field102 = class68.field1330[var6 + 1];
                            if (var452.field199 - var452.field131 < var452.field102) {
                                var452.field102 = var452.field199 - var452.field131;
                            }
                            if (var452.field102 < 0) {
                                var452.field102 = 0;
                            }
                            class62.method441(arg1 - 23363, var452);
                            if (var452.field177 == -1) {
                                class91.method679(var452.field222, false);
                            }
                            continue;
                        }
                        if (var472 == 1101) {
                            var6--;
                            var452.field104 = class68.field1330[var6];
                            class62.method441(-29481, var452);
                            if (var452.field177 == -1) {
                                class127.method892(10776, var452.field222);
                            }
                            continue;
                        }
                        if (var472 == 1102) {
                            var6--;
                            var452.field186 = class68.field1330[var6] == 1;
                            class62.method441(-29481, var452);
                            continue;
                        }
                        if (var472 == 1103) {
                            var6--;
                            var452.field153 = class68.field1330[var6];
                            class62.method441(-29481, var452);
                            continue;
                        }
                        if (var472 == 1104) {
                            var6--;
                            var452.field234 = class68.field1330[var6];
                            class62.method441(arg1 ^ 0x64CD, var452);
                            continue;
                        }
                        if (var472 == 1105) {
                            var6--;
                            var452.field219 = class68.field1330[var6];
                            class62.method441(-29481, var452);
                            continue;
                        }
                        if (var472 == 1106) {
                            var6--;
                            var452.field107 = class68.field1330[var6];
                            class62.method441(-29481, var452);
                            continue;
                        }
                        if (var472 == 1107) {
                            var6--;
                            var452.field128 = class68.field1330[var6] == 1;
                            class62.method441(-29481, var452);
                            continue;
                        }
                        if (var472 == 1108) {
                            var452.field162 = 1;
                            var6--;
                            var452.field195 = class68.field1330[var6];
                            class62.method441(arg1 ^ 0x64CD, var452);
                            if (var452.field177 == -1) {
                                class198.method1369(0, var452.field222);
                            }
                            continue;
                        }
                        if (var472 == 1109) {
                            var6 -= 6;
                            var452.field136 = class68.field1330[var6];
                            var452.field108 = class68.field1330[var6 + 1];
                            var452.field192 = class68.field1330[var6 + 2];
                            var452.field110 = class68.field1330[var6 + 3];
                            var452.field126 = class68.field1330[var6 + 4];
                            var452.field198 = class68.field1330[var6 + 5];
                            class62.method441(-29481, var452);
                            if (var452.field177 == -1) {
                                class216.method1530(arg1 ^ 0xFFFFE84F, var452.field222);
                                class67.method478(-111, var452.field222);
                            }
                            continue;
                        }
                        if (var472 == 1110) {
                            var6--;
                            int var453 = class68.field1330[var6];
                            if (var452.field79 != var453) {
                                var452.field88 = 0;
                                var452.field119 = 0;
                                var452.field79 = var453;
                                class62.method441(-29481, var452);
                            }
                            if (var452.field177 == -1) {
                                class117.method836(var452.field222, 5);
                            }
                            continue;
                        }
                        if (var472 == 1111) {
                            var6--;
                            var452.field230 = class68.field1330[var6] == 1;
                            class62.method441(-29481, var452);
                            continue;
                        }
                        if (var472 == 1112) {
                            var7--;
                            class86 var454 = class256.field4547[var7];
                            if (!var454.method625((byte) 60, var452.field149)) {
                                var452.field149 = var454;
                                class62.method441(-29481, var452);
                            }
                            if (var452.field177 == -1) {
                                class72.method531(var452.field222, 3);
                            }
                            continue;
                        }
                        if (var472 == 1113) {
                            var6--;
                            var452.field196 = class68.field1330[var6];
                            class62.method441(arg1 - 23363, var452);
                            continue;
                        }
                        if (var472 == 1114) {
                            var6 -= 3;
                            var452.field109 = class68.field1330[var6];
                            var452.field226 = class68.field1330[var6 + 1];
                            var452.field208 = class68.field1330[var6 + 2];
                            class62.method441(-29481, var452);
                            continue;
                        }
                        if (var472 == 1115) {
                            var6--;
                            var452.field224 = class68.field1330[var6] == 1;
                            class62.method441(arg1 ^ 0x64CD, var452);
                            continue;
                        }
                        if (var472 == 1116) {
                            var6--;
                            var452.field203 = class68.field1330[var6];
                            class62.method441(-29481, var452);
                            continue;
                        }
                        if (var472 == 1117) {
                            var6--;
                            var452.field141 = class68.field1330[var6];
                            class62.method441(arg1 - 23363, var452);
                            continue;
                        }
                        if (var472 == 1118) {
                            var6--;
                            var452.field116 = class68.field1330[var6] == 1;
                            class62.method441(arg1 ^ 0x64CD, var452);
                            continue;
                        }
                        if (var472 == 1119) {
                            var6--;
                            var452.field147 = class68.field1330[var6] == 1;
                            class62.method441(-29481, var452);
                            continue;
                        }
                        if (var472 == 1120) {
                            var6 -= 2;
                            var452.field114 = class68.field1330[var6];
                            var452.field199 = class68.field1330[var6 + 1];
                            class62.method441(-29481, var452);
                            if (var452.field184 == 0) {
                                class142.method1010(var452, false, -126);
                            }
                            continue;
                        }
                        if (var472 == 1121) {
                            var6 -= 2;
                            class62.method441(arg1 ^ 0x64CD, var452);
                            continue;
                        }
                        if (var472 == 1122) {
                            var6--;
                            var452.field92 = class68.field1330[var6] == 1;
                            class62.method441(-29481, var452);
                            continue;
                        }
                    } else if (var472 >= 1200 && var472 < 1300 || var472 >= 2200 && var472 < 2300) {
                        class6 var448;
                        if (var472 >= 2000) {
                            var472 -= 1000;
                            var6--;
                            var448 = class25.method178(119, class68.field1330[var6]);
                        } else {
                            var448 = var46 ? class143.field2708 : class91.field1860;
                        }
                        class62.method441(arg1 - 23363, var448);
                        if (var472 == 1200 || var472 == 1205) {
                            var6 -= 2;
                            int var449 = class68.field1330[var6];
                            int var450 = class68.field1330[var6 + 1];
                            if (var448.field177 == -1) {
                                class230.method1599(var448.field222, -121);
                                class216.method1530(127, var448.field222);
                                class67.method478(-111, var448.field222);
                            }
                            if (var449 == -1) {
                                var448.field154 = -1;
                                var448.field162 = 1;
                                var448.field195 = -1;
                            } else {
                                var448.field154 = var449;
                                var448.field127 = var450;
                                class69 var451 = class272.method1853(0, var449);
                                var448.field198 = var451.field1350;
                                var448.field108 = var451.field1399;
                                var448.field110 = var451.field1406;
                                if (var448.field214 > 0) {
                                    var448.field198 = var448.field198 * 32 / var448.field214;
                                } else if (var448.field98 > 0) {
                                    var448.field198 = var448.field198 * 32 / var448.field98;
                                }
                                if (var472 == 1205) {
                                    var448.field190 = false;
                                } else {
                                    var448.field190 = true;
                                }
                                var448.field192 = var451.field1346;
                                var448.field136 = var451.field1371;
                                var448.field126 = var451.field1386;
                            }
                            continue;
                        }
                        if (var472 == 1201) {
                            var448.field162 = 2;
                            var6--;
                            var448.field195 = class68.field1330[var6];
                            if (var448.field177 == -1) {
                                class198.method1369(arg1 + 6118, var448.field222);
                            }
                            continue;
                        }
                        if (var472 == 1202) {
                            var448.field162 = 3;
                            var448.field195 = class124.field2412.field4019.method510(false);
                            if (var448.field177 == -1) {
                                class198.method1369(0, var448.field222);
                            }
                            continue;
                        }
                        if (var472 == 1203) {
                            var448.field162 = 6;
                            var6--;
                            var448.field195 = class68.field1330[var6];
                            if (var448.field177 == -1) {
                                class198.method1369(0, var448.field222);
                            }
                            continue;
                        }
                        if (var472 == 1204) {
                            var448.field162 = 5;
                            var6--;
                            var448.field195 = class68.field1330[var6];
                            if (var448.field177 == -1) {
                                class198.method1369(0, var448.field222);
                            }
                            continue;
                        }
                    } else if (var472 >= 1300 && var472 < 1400 || var472 >= 2300 && var472 < 2400) {
                        class6 var444;
                        if (var472 < 2000) {
                            var444 = var46 ? class143.field2708 : class91.field1860;
                        } else {
                            var10000 = arg1 + 6187;
                            var6--;
                            var444 = class25.method178(var10000, class68.field1330[var6]);
                            var472 -= 1000;
                        }
                        if (var472 == 1300) {
                            var6--;
                            int var445 = class68.field1330[var6] - 1;
                            if (var445 >= 0 && var445 <= 9) {
                                var7--;
                                var444.method43(0, class256.field4547[var7], var445);
                                continue;
                            }
                            var7--;
                            continue;
                        }
                        if (var472 == 1301) {
                            var6 -= 2;
                            int var446 = class68.field1330[var6];
                            int var447 = class68.field1330[var6 + 1];
                            var444.field134 = class229.method1596(var447, var446, (byte) -27);
                            continue;
                        }
                        if (var472 == 1302) {
                            var6--;
                            var444.field96 = class68.field1330[var6] == 1;
                            continue;
                        }
                        if (var472 == 1303) {
                            var6--;
                            var444.field194 = class68.field1330[var6];
                            continue;
                        }
                        if (var472 == 1304) {
                            var6--;
                            var444.field146 = class68.field1330[var6];
                            continue;
                        }
                        if (var472 == 1305) {
                            var7--;
                            var444.field170 = class256.field4547[var7];
                            continue;
                        }
                        if (var472 == 1306) {
                            var7--;
                            var444.field197 = class256.field4547[var7];
                            continue;
                        }
                        if (var472 == 1307) {
                            var444.field238 = null;
                            continue;
                        }
                    } else {
                        if (var472 >= 1400 && var472 < 1500 || var472 >= 2400 && var472 < 2500) {
                            class6 var62;
                            if (var472 >= 2000) {
                                var472 -= 1000;
                                var6--;
                                var62 = class25.method178(127, class68.field1330[var6]);
                            } else {
                                var62 = var46 ? class143.field2708 : class91.field1860;
                            }
                            var7--;
                            class86 var63 = class256.field4547[var7];
                            int[] var64 = null;
                            if (var63.method612((byte) 109) > 0 && var63.method611(48, var63.method612((byte) 61) - 1) == 89) {
                                var6--;
                                int var65 = class68.field1330[var6];
                                if (var65 > 0) {
                                    var64 = new int[var65];
                                    while ((var65--) > 0) {
                                        var6--;
                                        var64[var65] = class68.field1330[var6];
                                    }
                                }
                                var63 = var63.method610(0, var63.method612((byte) 84) - 1, (byte) -81);
                            }
                            Object[] var66 = new Object[var63.method612((byte) 88) + 1];
                            for (int var67 = var66.length - 1; var67 >= 1; var67--) {
                                if (var63.method611(48, var67 - 1) == 115) {
                                    var7--;
                                    var66[var67] = class256.field4547[var7];
                                } else {
                                    var6--;
                                    var66[var67] = Integer.valueOf(class68.field1330[var6]);
                                }
                            }
                            var6--;
                            int var68 = class68.field1330[var6];
                            if (var68 == -1) {
                                var66 = null;
                            } else {
                                var66[0] = Integer.valueOf(var68);
                            }
                            if (var472 == 1400) {
                                var62.field122 = var66;
                            } else if (var472 == 1401) {
                                var62.field83 = var66;
                            } else if (var472 == 1402) {
                                var62.field89 = var66;
                            } else if (var472 == 1403) {
                                var62.field164 = var66;
                            } else if (var472 == 1404) {
                                var62.field166 = var66;
                            } else if (var472 == 1405) {
                                var62.field173 = var66;
                            } else if (var472 == 1406) {
                                var62.field179 = var66;
                            } else if (var472 == 1407) {
                                var62.field204 = var66;
                                var62.field171 = var64;
                            } else if (var472 == 1408) {
                                var62.field215 = var66;
                            } else if (var472 == 1409) {
                                var62.field133 = var66;
                            } else if (var472 == 1410) {
                                var62.field76 = var66;
                            } else if (var472 == 1411) {
                                var62.field120 = var66;
                            } else if (var472 == 1412) {
                                var62.field157 = var66;
                            } else if (var472 == 1414) {
                                var62.field93 = var66;
                                var62.field242 = var64;
                            } else if (var472 == 1415) {
                                var62.field80 = var66;
                                var62.field175 = var64;
                            } else if (var472 == 1416) {
                                var62.field239 = var66;
                            } else if (var472 == 1417) {
                                var62.field130 = var66;
                            } else if (var472 == 1418) {
                                var62.field85 = var66;
                            } else if (var472 == 1419) {
                                var62.field205 = var66;
                            } else if (var472 == 1420) {
                                var62.field135 = var66;
                            } else if (var472 == 1421) {
                                var62.field101 = var66;
                            } else if (var472 == 1422) {
                                var62.field167 = var66;
                            } else if (var472 == 1423) {
                                var62.field241 = var66;
                            } else if (var472 == 1424) {
                                var62.field105 = var66;
                            } else if (var472 == 1425) {
                                var62.field78 = var66;
                            } else if (var472 == 1426) {
                                var62.field112 = var66;
                            } else if (var472 == 1427) {
                                var62.field103 = var66;
                            } else if (var472 == 1428) {
                                var62.field160 = var64;
                                var62.field86 = var66;
                            } else if (var472 == 1429) {
                                var62.field95 = var66;
                                var62.field113 = var64;
                            }
                            var62.field152 = true;
                            continue;
                        }
                        if (var472 < 1600) {
                            class6 var69 = var46 ? class143.field2708 : class91.field1860;
                            if (var472 == 1500) {
                                class68.field1330[var6++] = var69.field117;
                                continue;
                            }
                            if (var472 == 1501) {
                                class68.field1330[var6++] = var69.field158;
                                continue;
                            }
                            if (var472 == 1502) {
                                class68.field1330[var6++] = var69.field163;
                                continue;
                            }
                            if (var472 == 1503) {
                                class68.field1330[var6++] = var69.field131;
                                continue;
                            }
                            if (var472 == 1504) {
                                class68.field1330[var6++] = var69.field231 ? 1 : 0;
                                continue;
                            }
                            if (var472 == 1505) {
                                class68.field1330[var6++] = var69.field221;
                                continue;
                            }
                        } else if (var472 < 1700) {
                            class6 var443 = var46 ? class143.field2708 : class91.field1860;
                            if (var472 == 1600) {
                                class68.field1330[var6++] = var443.field138;
                                continue;
                            }
                            if (var472 == 1601) {
                                class68.field1330[var6++] = var443.field102;
                                continue;
                            }
                            if (var472 == 1602) {
                                class256.field4547[var7++] = var443.field149;
                                continue;
                            }
                            if (var472 == 1603) {
                                class68.field1330[var6++] = var443.field114;
                                continue;
                            }
                            if (var472 == 1604) {
                                class68.field1330[var6++] = var443.field199;
                                continue;
                            }
                            if (var472 == 1605) {
                                class68.field1330[var6++] = var443.field198;
                                continue;
                            }
                            if (var472 == 1606) {
                                class68.field1330[var6++] = var443.field192;
                                continue;
                            }
                            if (var472 == 1607) {
                                class68.field1330[var6++] = var443.field126;
                                continue;
                            }
                            if (var472 == 1608) {
                                class68.field1330[var6++] = var443.field110;
                                continue;
                            }
                            if (var472 == 1609) {
                                class68.field1330[var6++] = var443.field153;
                                continue;
                            }
                        } else if (var472 < 1800) {
                            class6 var70 = var46 ? class143.field2708 : class91.field1860;
                            if (var472 == 1700) {
                                class68.field1330[var6++] = var70.field154;
                                continue;
                            }
                            if (var472 == 1701) {
                                if (var70.field154 == -1) {
                                    class68.field1330[var6++] = 0;
                                } else {
                                    class68.field1330[var6++] = var70.field127;
                                }
                                continue;
                            }
                            if (var472 == 1702) {
                                class68.field1330[var6++] = var70.field177;
                                continue;
                            }
                        } else if (var472 < 1900) {
                            class6 var71 = var46 ? class143.field2708 : class91.field1860;
                            if (var472 == 1800) {
                                class68.field1330[var6++] = class86.method629(-120, client.method1111(var71));
                                continue;
                            }
                            if (var472 == 1801) {
                                var6--;
                                int var72 = class68.field1330[var6];
                                int var473 = var72 - 1;
                                if (var71.field238 != null && var473 < var71.field238.length && var71.field238[var473] != null) {
                                    class256.field4547[var7++] = var71.field238[var473];
                                    continue;
                                }
                                class256.field4547[var7++] = class61.field1206;
                                continue;
                            }
                            if (var472 == 1802) {
                                if (var71.field170 == null) {
                                    class256.field4547[var7++] = class61.field1206;
                                } else {
                                    class256.field4547[var7++] = var71.field170;
                                }
                                continue;
                            }
                        } else if (var472 < 2600) {
                            var6--;
                            class6 var442 = class25.method178(84, class68.field1330[var6]);
                            if (var472 == 2500) {
                                class68.field1330[var6++] = var442.field117;
                                continue;
                            }
                            if (var472 == 2501) {
                                class68.field1330[var6++] = var442.field158;
                                continue;
                            }
                            if (var472 == 2502) {
                                class68.field1330[var6++] = var442.field163;
                                continue;
                            }
                            if (var472 == 2503) {
                                class68.field1330[var6++] = var442.field131;
                                continue;
                            }
                            if (var472 == 2504) {
                                class68.field1330[var6++] = var442.field231 ? 1 : 0;
                                continue;
                            }
                            if (var472 == 2505) {
                                class68.field1330[var6++] = var442.field221;
                                continue;
                            }
                        } else if (var472 < 2700) {
                            var6--;
                            class6 var441 = class25.method178(115, class68.field1330[var6]);
                            if (var472 == 2600) {
                                class68.field1330[var6++] = var441.field138;
                                continue;
                            }
                            if (var472 == 2601) {
                                class68.field1330[var6++] = var441.field102;
                                continue;
                            }
                            if (var472 == 2602) {
                                class256.field4547[var7++] = var441.field149;
                                continue;
                            }
                            if (var472 == 2603) {
                                class68.field1330[var6++] = var441.field114;
                                continue;
                            }
                            if (var472 == 2604) {
                                class68.field1330[var6++] = var441.field199;
                                continue;
                            }
                            if (var472 == 2605) {
                                class68.field1330[var6++] = var441.field198;
                                continue;
                            }
                            if (var472 == 2606) {
                                class68.field1330[var6++] = var441.field192;
                                continue;
                            }
                            if (var472 == 2607) {
                                class68.field1330[var6++] = var441.field126;
                                continue;
                            }
                            if (var472 == 2608) {
                                class68.field1330[var6++] = var441.field110;
                                continue;
                            }
                            if (var472 == 2609) {
                                class68.field1330[var6++] = var441.field153;
                                continue;
                            }
                        } else if (var472 < 2800) {
                            if (var472 == 2700) {
                                var6--;
                                class6 var431 = class25.method178(86, class68.field1330[var6]);
                                class68.field1330[var6++] = var431.field154;
                                continue;
                            }
                            if (var472 == 2701) {
                                var6--;
                                class6 var432 = class25.method178(102, class68.field1330[var6]);
                                if (var432.field154 == -1) {
                                    class68.field1330[var6++] = 0;
                                } else {
                                    class68.field1330[var6++] = var432.field127;
                                }
                                continue;
                            }
                            if (var472 == 2702) {
                                var6--;
                                int var433 = class68.field1330[var6];
                                class1 var434 = (class1) class1.field15.method1698((long) var433, (byte) -37);
                                if (var434 == null) {
                                    class68.field1330[var6++] = 0;
                                } else {
                                    class68.field1330[var6++] = 1;
                                }
                                continue;
                            }
                            if (var472 == 2703) {
                                var10000 = arg1 ^ 0xFFFFE849;
                                var6--;
                                class6 var435 = class25.method178(var10000, class68.field1330[var6]);
                                if (var435.field216 == null) {
                                    class68.field1330[var6++] = 0;
                                    continue;
                                }
                                int var436 = var435.field216.length;
                                for (int var437 = 0; var437 < var435.field216.length; var437++) {
                                    if (var435.field216[var437] == null) {
                                        var436 = var437;
                                        break;
                                    }
                                }
                                class68.field1330[var6++] = var436;
                                continue;
                            }
                            if (var472 == 2704 || var472 == 2705) {
                                var6 -= 2;
                                int var438 = class68.field1330[var6];
                                int var439 = class68.field1330[var6 + 1];
                                class1 var440 = (class1) class1.field15.method1698((long) var438, (byte) 126);
                                if (var440 != null && var440.field2 == var439) {
                                    class68.field1330[var6++] = 1;
                                    continue;
                                }
                                class68.field1330[var6++] = 0;
                                continue;
                            }
                        } else if (var472 < 2900) {
                            var10000 = arg1 + 6205;
                            var6--;
                            class6 var429 = class25.method178(var10000, class68.field1330[var6]);
                            if (var472 == 2800) {
                                class68.field1330[var6++] = class86.method629(class177.method1249(arg1, -6044), client.method1111(var429));
                                continue;
                            }
                            if (var472 == 2801) {
                                var6--;
                                int var430 = class68.field1330[var6];
                                int var474 = var430 - 1;
                                if (var429.field238 != null && var429.field238.length > var474 && var429.field238[var474] != null) {
                                    class256.field4547[var7++] = var429.field238[var474];
                                    continue;
                                }
                                class256.field4547[var7++] = class61.field1206;
                                continue;
                            }
                            if (var472 == 2802) {
                                if (var429.field170 == null) {
                                    class256.field4547[var7++] = class61.field1206;
                                } else {
                                    class256.field4547[var7++] = var429.field170;
                                }
                                continue;
                            }
                        } else if (var472 < 3200) {
                            if (var472 == 3100) {
                                var7--;
                                class86 var414 = class256.field4547[var7];
                                class58.method423(var414, false, 0, class61.field1206);
                                continue;
                            }
                            if (var472 == 3101) {
                                var6 -= 2;
                                class228.method1592(class68.field1330[var6 + 1], -64, class124.field2412, class68.field1330[var6]);
                                continue;
                            }
                            if (var472 == 3103) {
                                class51.method389(true);
                                continue;
                            }
                            if (var472 == 3104) {
                                class8.field262++;
                                var7--;
                                class86 var415 = class256.field4547[var7];
                                int var416 = 0;
                                if (var415.method599((byte) -64)) {
                                    var416 = var415.method598(26);
                                }
                                class36.field809.method1356(148, true);
                                class36.field809.method1406(1472534024, var416);
                                continue;
                            }
                            if (var472 == 3105) {
                                class226.field4100++;
                                var7--;
                                class86 var417 = class256.field4547[var7];
                                class36.field809.method1356(252, true);
                                class36.field809.method1399((byte) -106, var417.method622(-2));
                                continue;
                            }
                            if (var472 == 3106) {
                                class24.field580++;
                                var7--;
                                class86 var418 = class256.field4547[var7];
                                class36.field809.method1356(122, true);
                                class36.field809.method1388(-127, var418.method612((byte) 64) + 1);
                                class36.field809.method1379(0, var418);
                                continue;
                            }
                            if (var472 == 3107) {
                                var7--;
                                class86 var419 = class256.field4547[var7];
                                var6--;
                                int var420 = class68.field1330[var6];
                                class150.method1068(var420, (byte) -127, var419);
                                continue;
                            }
                            if (var472 == 3108) {
                                var6 -= 3;
                                int var421 = class68.field1330[var6];
                                int var422 = class68.field1330[var6 + 1];
                                int var423 = class68.field1330[var6 + 2];
                                class6 var424 = class25.method178(126, var423);
                                class210.method1491(var422, var421, var424, -65);
                                continue;
                            }
                            if (var472 == 3109) {
                                var6 -= 2;
                                int var425 = class68.field1330[var6];
                                int var426 = class68.field1330[var6 + 1];
                                class6 var427 = var46 ? class143.field2708 : class91.field1860;
                                class210.method1491(var426, var425, var427, -60);
                                continue;
                            }
                            if (var472 == 3110) {
                                var6--;
                                int var428 = class68.field1330[var6];
                                class142.field2688++;
                                class36.field809.method1356(58, true);
                                class36.field809.method1428((byte) -89, var428);
                                continue;
                            }
                        } else if (var472 < 3300) {
                            if (var472 == 3200) {
                                var6 -= 3;
                                class37.method310(class68.field1330[var6], class68.field1330[var6 + 2], class68.field1330[var6 + 1], 50);
                                continue;
                            }
                            if (var472 == 3201) {
                                var10000 = arg1 + 6123;
                                var6--;
                                class211.method1498(var10000, class68.field1330[var6]);
                                continue;
                            }
                            if (var472 == 3202) {
                                var6 -= 2;
                                class96.method698(11, class68.field1330[var6 + 1], class68.field1330[var6]);
                                continue;
                            }
                        } else if (var472 < 3400) {
                            if (var472 == 3300) {
                                class68.field1330[var6++] = class236.field4265;
                                continue;
                            }
                            if (var472 == 3301) {
                                var6 -= 2;
                                int var73 = class68.field1330[var6 + 1];
                                int var74 = class68.field1330[var6];
                                class68.field1330[var6++] = class33.method237(var74, var73, class177.method1249(arg1, -12089));
                                continue;
                            }
                            if (var472 == 3302) {
                                var6 -= 2;
                                int var75 = class68.field1330[var6];
                                int var76 = class68.field1330[var6 + 1];
                                class68.field1330[var6++] = class134.method962(var75, var76, (byte) -75);
                                continue;
                            }
                            if (var472 == 3303) {
                                var6 -= 2;
                                int var77 = class68.field1330[var6];
                                int var78 = class68.field1330[var6 + 1];
                                class68.field1330[var6++] = class3.method17(var78, arg1 + 6118, var77);
                                continue;
                            }
                            if (var472 == 3304) {
                                var6--;
                                int var79 = class68.field1330[var6];
                                class68.field1330[var6++] = class83.method578(var79, arg1 + 6194).field2764;
                                continue;
                            }
                            if (var472 == 3305) {
                                var6--;
                                int var80 = class68.field1330[var6];
                                class68.field1330[var6++] = class221.field3974[var80];
                                continue;
                            }
                            if (var472 == 3306) {
                                var6--;
                                int var81 = class68.field1330[var6];
                                class68.field1330[var6++] = class44.field976[var81];
                                continue;
                            }
                            if (var472 == 3307) {
                                var6--;
                                int var82 = class68.field1330[var6];
                                class68.field1330[var6++] = class69.field1351[var82];
                                continue;
                            }
                            if (var472 == 3308) {
                                int var83 = (class124.field2412.field676 >> 7) + class252.field4481;
                                int var84 = (class124.field2412.field685 >> 7) + class79.field1554;
                                int var85 = class180.field3244;
                                class68.field1330[var6++] = (var83 << 14) + (var85 << 28) + var84;
                                continue;
                            }
                            if (var472 == 3309) {
                                var6--;
                                int var86 = class68.field1330[var6];
                                class68.field1330[var6++] = class1.method5(var86, 268424790) >> 14;
                                continue;
                            }
                            if (var472 == 3310) {
                                var6--;
                                int var87 = class68.field1330[var6];
                                class68.field1330[var6++] = var87 >> 28;
                                continue;
                            }
                            if (var472 == 3311) {
                                var6--;
                                int var88 = class68.field1330[var6];
                                class68.field1330[var6++] = class1.method5(var88, 16383);
                                continue;
                            }
                            if (var472 == 3312) {
                                class68.field1330[var6++] = class125.field2422 ? 1 : 0;
                                continue;
                            }
                            if (var472 == 3313) {
                                var6 -= 2;
                                int var89 = class68.field1330[var6] + 32768;
                                int var90 = class68.field1330[var6 + 1];
                                class68.field1330[var6++] = class33.method237(var89, var90, 14557);
                                continue;
                            }
                            if (var472 == 3314) {
                                var6 -= 2;
                                int var91 = class68.field1330[var6 + 1];
                                int var92 = class68.field1330[var6] + 32768;
                                class68.field1330[var6++] = class134.method962(var92, var91, (byte) -114);
                                continue;
                            }
                            if (var472 == 3315) {
                                var6 -= 2;
                                int var93 = class68.field1330[var6] + 32768;
                                int var94 = class68.field1330[var6 + 1];
                                class68.field1330[var6++] = class3.method17(var94, 0, var93);
                                continue;
                            }
                            if (var472 == 3316) {
                                if (class38.field905 >= 2) {
                                    class68.field1330[var6++] = class38.field905;
                                } else {
                                    class68.field1330[var6++] = 0;
                                }
                                continue;
                            }
                            if (var472 == 3317) {
                                class68.field1330[var6++] = class226.field4104;
                                continue;
                            }
                            if (var472 == 3318) {
                                class68.field1330[var6++] = class147.field2766;
                                continue;
                            }
                            if (var472 == 3321) {
                                class68.field1330[var6++] = class73.field1481;
                                continue;
                            }
                            if (var472 == 3322) {
                                class68.field1330[var6++] = class257.field4565;
                                continue;
                            }
                            if (var472 == 3323) {
                                if (class75.field1505 >= 5 && class75.field1505 <= 9) {
                                    class68.field1330[var6++] = 1;
                                    continue;
                                }
                                class68.field1330[var6++] = 0;
                                continue;
                            }
                            if (var472 == 3324) {
                                if (class75.field1505 >= 5 && class75.field1505 <= 9) {
                                    class68.field1330[var6++] = class75.field1505;
                                    continue;
                                }
                                class68.field1330[var6++] = 0;
                                continue;
                            }
                            if (var472 == 3325) {
                                class68.field1330[var6++] = class122.field2376 ? 1 : 0;
                                continue;
                            }
                            if (var472 == 3326) {
                                class68.field1330[var6++] = class124.field2412.field4045;
                                continue;
                            }
                            if (var472 == 3327) {
                                class68.field1330[var6++] = class124.field2412.field4019.field1425 ? 1 : 0;
                                continue;
                            }
                            if (var472 == 3328) {
                                class68.field1330[var6++] = class21.field548;
                                continue;
                            }
                            if (var472 == 3329) {
                                class68.field1330[var6++] = class134.field2542;
                                continue;
                            }
                            if (var472 == 3330) {
                                var6--;
                                int var95 = class68.field1330[var6];
                                class68.field1330[var6++] = class1.method3(var95, (byte) 121);
                                continue;
                            }
                            if (var472 == 3331) {
                                var6 -= 2;
                                int var96 = class68.field1330[var6];
                                int var97 = class68.field1330[var6 + 1];
                                class68.field1330[var6++] = class48.method372(false, 0, var97, var96);
                                continue;
                            }
                            if (var472 == 3332) {
                                var6 -= 2;
                                int var98 = class68.field1330[var6];
                                int var99 = class68.field1330[var6 + 1];
                                class68.field1330[var6++] = class48.method372(true, 0, var99, var98);
                                continue;
                            }
                            if (var472 == 3333) {
                                class68.field1330[var6++] = class257.field4552;
                                continue;
                            }
                            if (var472 == 3335) {
                                class68.field1330[var6++] = class257.field4558;
                                continue;
                            }
                        } else if (var472 < 3500) {
                            if (var472 == 3400) {
                                var6 -= 2;
                                int var397 = class68.field1330[var6];
                                int var398 = class68.field1330[var6 + 1];
                                class219 var399 = class193.method1346(var397, (byte) 112);
                                class256.field4547[var7++] = var399.method1548((byte) 71, var398);
                                continue;
                            }
                            if (var472 == 3408) {
                                var6 -= 4;
                                int var400 = class68.field1330[var6];
                                int var401 = class68.field1330[var6 + 3];
                                int var402 = class68.field1330[var6 + 2];
                                int var403 = class68.field1330[var6 + 1];
                                class219 var404 = class193.method1346(var402, (byte) 72);
                                if (var404.field3940 == var400 && var404.field3933 == var403) {
                                    if (var403 == 115) {
                                        class256.field4547[var7++] = var404.method1548((byte) 85, var401);
                                    } else {
                                        class68.field1330[var6++] = var404.method1541(-60, var401);
                                    }
                                    continue;
                                }
                                throw new RuntimeException("C3408-1");
                            }
                            if (var472 == 3409) {
                                var6 -= 3;
                                int var405 = class68.field1330[var6];
                                int var406 = class68.field1330[var6 + 1];
                                int var407 = class68.field1330[var6 + 2];
                                if (var406 == -1) {
                                    throw new RuntimeException("C3409-2");
                                }
                                class219 var408 = class193.method1346(var406, (byte) 38);
                                if (var408.field3933 != var405) {
                                    throw new RuntimeException("C3409-1");
                                }
                                class68.field1330[var6++] = var408.method1542(var407, -92) ? 1 : 0;
                                continue;
                            }
                            if (var472 == 3410) {
                                var6--;
                                int var409 = class68.field1330[var6];
                                var7--;
                                class86 var410 = class256.field4547[var7];
                                if (var409 == -1) {
                                    throw new RuntimeException("C3410-2");
                                }
                                class219 var411 = class193.method1346(var409, (byte) 72);
                                if (var411.field3933 != 115) {
                                    throw new RuntimeException("C3410-1");
                                }
                                class68.field1330[var6++] = var411.method1539(var410, 127) ? 1 : 0;
                                continue;
                            }
                            if (var472 == 3411) {
                                var6--;
                                int var412 = class68.field1330[var6];
                                class219 var413 = class193.method1346(var412, (byte) 102);
                                class68.field1330[var6++] = var413.field3927.method1700((byte) -115);
                                continue;
                            }
                        } else if (var472 < 3700) {
                            if (var472 == 3600) {
                                if (class2.field25 == 0) {
                                    class68.field1330[var6++] = -2;
                                } else if (class2.field25 == 1) {
                                    class68.field1330[var6++] = -1;
                                } else {
                                    class68.field1330[var6++] = class97.field1928;
                                }
                                continue;
                            }
                            if (var472 == 3601) {
                                var6--;
                                int var100 = class68.field1330[var6];
                                if (class2.field25 == 2 && class97.field1928 > var100) {
                                    class256.field4547[var7++] = class100.field1957[var100];
                                    continue;
                                }
                                class256.field4547[var7++] = class61.field1206;
                                continue;
                            }
                            if (var472 == 3602) {
                                var6--;
                                int var101 = class68.field1330[var6];
                                if (class2.field25 == 2 && var101 < class97.field1928) {
                                    class68.field1330[var6++] = class98.field1944[var101];
                                    continue;
                                }
                                class68.field1330[var6++] = 0;
                                continue;
                            }
                            if (var472 == 3603) {
                                var6--;
                                int var102 = class68.field1330[var6];
                                if (class2.field25 == 2 && var102 < class97.field1928) {
                                    class68.field1330[var6++] = class140.field2664[var102];
                                    continue;
                                }
                                class68.field1330[var6++] = 0;
                                continue;
                            }
                            if (var472 == 3604) {
                                var6--;
                                int var103 = class68.field1330[var6];
                                var7--;
                                class86 var104 = class256.field4547[var7];
                                class142.method1015(true, var103, var104);
                                continue;
                            }
                            if (var472 == 3605) {
                                var7--;
                                class86 var105 = class256.field4547[var7];
                                class17.method128(true, var105.method622(-2));
                                continue;
                            }
                            if (var472 == 3606) {
                                var7--;
                                class86 var106 = class256.field4547[var7];
                                class115.method812((byte) -119, var106.method622(arg1 + 6116));
                                continue;
                            }
                            if (var472 == 3607) {
                                var7--;
                                class86 var107 = class256.field4547[var7];
                                class17.method134(var107.method622(-2), true);
                                continue;
                            }
                            if (var472 == 3608) {
                                var7--;
                                class86 var108 = class256.field4547[var7];
                                class62.method445(var108.method622(arg1 + 6116), (byte) 77);
                                continue;
                            }
                            if (var472 == 3609) {
                                var7--;
                                class86 var109 = class256.field4547[var7];
                                if (var109.method597(class217.field3908, 7) || var109.method597(class183.field3265, 53)) {
                                    var109 = var109.method633(7, (byte) 61);
                                }
                                class68.field1330[var6++] = class141.method1002(var109, (byte) -45) ? 1 : 0;
                                continue;
                            }
                            if (var472 == 3610) {
                                var6--;
                                int var110 = class68.field1330[var6];
                                if (class2.field25 == 2 && var110 < class97.field1928) {
                                    class256.field4547[var7++] = class207.field3755[var110];
                                    continue;
                                }
                                class256.field4547[var7++] = class61.field1206;
                                continue;
                            }
                            if (var472 == 3611) {
                                if (class65.field1295 == null) {
                                    class256.field4547[var7++] = class61.field1206;
                                } else {
                                    class256.field4547[var7++] = class65.field1295.method608((byte) 38);
                                }
                                continue;
                            }
                            if (var472 == 3612) {
                                if (class65.field1295 == null) {
                                    class68.field1330[var6++] = 0;
                                } else {
                                    class68.field1330[var6++] = class144.field2738;
                                }
                                continue;
                            }
                            if (var472 == 3613) {
                                var6--;
                                int var111 = class68.field1330[var6];
                                if (class65.field1295 != null && class144.field2738 > var111) {
                                    class256.field4547[var7++] = class162.field3053[var111].field1097.method608((byte) 9);
                                    continue;
                                }
                                class256.field4547[var7++] = class61.field1206;
                                continue;
                            }
                            if (var472 == 3614) {
                                var6--;
                                int var112 = class68.field1330[var6];
                                if (class65.field1295 != null && var112 < class144.field2738) {
                                    class68.field1330[var6++] = class162.field3053[var112].field1099;
                                    continue;
                                }
                                class68.field1330[var6++] = 0;
                                continue;
                            }
                            if (var472 == 3615) {
                                var6--;
                                int var113 = class68.field1330[var6];
                                if (class65.field1295 != null && var113 < class144.field2738) {
                                    class68.field1330[var6++] = class162.field3053[var113].field1104;
                                    continue;
                                }
                                class68.field1330[var6++] = 0;
                                continue;
                            }
                            if (var472 == 3616) {
                                class68.field1330[var6++] = class247.field4393;
                                continue;
                            }
                            if (var472 == 3617) {
                                var7--;
                                class86 var114 = class256.field4547[var7];
                                class133.method947(0, var114);
                                continue;
                            }
                            if (var472 == 3618) {
                                class68.field1330[var6++] = class65.field1287;
                                continue;
                            }
                            if (var472 == 3619) {
                                var7--;
                                class86 var115 = class256.field4547[var7];
                                class187.method1285(true, var115.method622(arg1 + 6116));
                                continue;
                            }
                            if (var472 == 3620) {
                                class181.method1262(13587);
                                continue;
                            }
                            if (var472 == 3621) {
                                if (class2.field25 == 0) {
                                    class68.field1330[var6++] = -1;
                                } else {
                                    class68.field1330[var6++] = class56.field1146;
                                }
                                continue;
                            }
                            if (var472 == 3622) {
                                var6--;
                                int var116 = class68.field1330[var6];
                                if (class2.field25 != 0 && var116 < class56.field1146) {
                                    class256.field4547[var7++] = class202.method1440(class119.field2325[var116], (byte) 119).method608((byte) 75);
                                    continue;
                                }
                                class256.field4547[var7++] = class61.field1206;
                                continue;
                            }
                            if (var472 == 3623) {
                                var7--;
                                class86 var117 = class256.field4547[var7];
                                if (var117.method597(class217.field3908, 74) || var117.method597(class183.field3265, 18)) {
                                    var117 = var117.method633(7, (byte) 61);
                                }
                                class68.field1330[var6++] = class2.method9(119, var117) ? 1 : 0;
                                continue;
                            }
                            if (var472 == 3624) {
                                var6--;
                                int var118 = class68.field1330[var6];
                                if (class162.field3053 != null && var118 < class144.field2738 && class162.field3053[var118].field1097.method631(arg1 ^ 0xFFFFD8C6, class124.field2412.field4029)) {
                                    class68.field1330[var6++] = 1;
                                    continue;
                                }
                                class68.field1330[var6++] = 0;
                                continue;
                            }
                            if (var472 == 3625) {
                                if (class265.field4686 == null) {
                                    class256.field4547[var7++] = class61.field1206;
                                } else {
                                    class256.field4547[var7++] = class265.field4686.method608((byte) 126);
                                }
                                continue;
                            }
                            if (var472 == 3626) {
                                var6--;
                                int var119 = class68.field1330[var6];
                                if (class65.field1295 != null && class144.field2738 > var119) {
                                    class256.field4547[var7++] = class162.field3053[var119].field1101;
                                    continue;
                                }
                                class256.field4547[var7++] = class61.field1206;
                                continue;
                            }
                            if (var472 == 3627) {
                                var6--;
                                int var120 = class68.field1330[var6];
                                if (class2.field25 == 2 && var120 >= 0 && class97.field1928 > var120) {
                                    class68.field1330[var6++] = class137.field2610[var120] ? 1 : 0;
                                    continue;
                                }
                                class68.field1330[var6++] = 0;
                                continue;
                            }
                            if (var472 == 3628) {
                                var7--;
                                class86 var121 = class256.field4547[var7];
                                if (var121.method597(class217.field3908, 82) || var121.method597(class183.field3265, arg1 ^ 0xFFFFE836)) {
                                    var121 = var121.method633(7, (byte) 61);
                                }
                                class68.field1330[var6++] = class38.method322(-29602, var121);
                                continue;
                            }
                        } else if (var472 < 4000) {
                            if (var472 == 3903) {
                                var6--;
                                int var122 = class68.field1330[var6];
                                class68.field1330[var6++] = class111.field2123[var122].method1294((byte) -32);
                                continue;
                            }
                            if (var472 == 3904) {
                                var6--;
                                int var123 = class68.field1330[var6];
                                class68.field1330[var6++] = class111.field2123[var123].field3318;
                                continue;
                            }
                            if (var472 == 3905) {
                                var6--;
                                int var124 = class68.field1330[var6];
                                class68.field1330[var6++] = class111.field2123[var124].field3325;
                                continue;
                            }
                            if (var472 == 3906) {
                                var6--;
                                int var125 = class68.field1330[var6];
                                class68.field1330[var6++] = class111.field2123[var125].field3339;
                                continue;
                            }
                            if (var472 == 3907) {
                                var6--;
                                int var126 = class68.field1330[var6];
                                class68.field1330[var6++] = class111.field2123[var126].field3323;
                                continue;
                            }
                            if (var472 == 3908) {
                                var6--;
                                int var127 = class68.field1330[var6];
                                class68.field1330[var6++] = class111.field2123[var127].field3334;
                                continue;
                            }
                            if (var472 == 3910) {
                                var6--;
                                int var128 = class68.field1330[var6];
                                int var129 = class111.field2123[var128].method1290((byte) 88);
                                class68.field1330[var6++] = var129 == 0 ? 1 : 0;
                                continue;
                            }
                            if (var472 == 3911) {
                                var6--;
                                int var130 = class68.field1330[var6];
                                int var131 = class111.field2123[var130].method1290((byte) 88);
                                class68.field1330[var6++] = var131 == 2 ? 1 : 0;
                                continue;
                            }
                            if (var472 == 3912) {
                                var6--;
                                int var132 = class68.field1330[var6];
                                int var133 = class111.field2123[var132].method1290((byte) 88);
                                class68.field1330[var6++] = var133 == 5 ? 1 : 0;
                                continue;
                            }
                            if (var472 == 3913) {
                                var6--;
                                int var134 = class68.field1330[var6];
                                int var135 = class111.field2123[var134].method1290((byte) 88);
                                class68.field1330[var6++] = var135 == 1 ? 1 : 0;
                                continue;
                            }
                        } else if (var472 < 4100) {
                            if (var472 == 4000) {
                                var6 -= 2;
                                int var136 = class68.field1330[var6 + 1];
                                int var137 = class68.field1330[var6];
                                class68.field1330[var6++] = var136 + var137;
                                continue;
                            }
                            if (var472 == 4001) {
                                var6 -= 2;
                                int var138 = class68.field1330[var6 + 1];
                                int var139 = class68.field1330[var6];
                                class68.field1330[var6++] = var139 - var138;
                                continue;
                            }
                            if (var472 == 4002) {
                                var6 -= 2;
                                int var140 = class68.field1330[var6];
                                int var141 = class68.field1330[var6 + 1];
                                class68.field1330[var6++] = var140 * var141;
                                continue;
                            }
                            if (var472 == 4003) {
                                var6 -= 2;
                                int var142 = class68.field1330[var6];
                                int var143 = class68.field1330[var6 + 1];
                                class68.field1330[var6++] = var142 / var143;
                                continue;
                            }
                            if (var472 == 4004) {
                                var6--;
                                int var144 = class68.field1330[var6];
                                class68.field1330[var6++] = (int) ((double) var144 * Math.random());
                                continue;
                            }
                            if (var472 == 4005) {
                                var6--;
                                int var145 = class68.field1330[var6];
                                class68.field1330[var6++] = (int) ((double) (var145 + 1) * Math.random());
                                continue;
                            }
                            if (var472 == 4006) {
                                var6 -= 5;
                                int var146 = class68.field1330[var6];
                                int var147 = class68.field1330[var6 + 2];
                                int var148 = class68.field1330[var6 + 1];
                                int var149 = class68.field1330[var6 + 4];
                                int var150 = class68.field1330[var6 + 3];
                                class68.field1330[var6++] = var146 + ((var148 - var146) * (var149 - var147) / (var150 - var147));
                                continue;
                            }
                            if (var472 == 4007) {
                                var6 -= 2;
                                long var151 = (long) class68.field1330[var6 + 1];
                                long var153 = (long) class68.field1330[var6];
                                class68.field1330[var6++] = (int) (var153 + (var151 * var153 / 100L));
                                continue;
                            }
                            if (var472 == 4008) {
                                var6 -= 2;
                                int var155 = class68.field1330[var6 + 1];
                                int var156 = class68.field1330[var6];
                                class68.field1330[var6++] = class49.method377(0x1 << var155, var156);
                                continue;
                            }
                            if (var472 == 4009) {
                                var6 -= 2;
                                int var157 = class68.field1330[var6];
                                int var158 = class68.field1330[var6 + 1];
                                class68.field1330[var6++] = class1.method5(var157, -(0x1 << var158) - 1);
                                continue;
                            }
                            if (var472 == 4010) {
                                var6 -= 2;
                                int var159 = class68.field1330[var6];
                                int var160 = class68.field1330[var6 + 1];
                                class68.field1330[var6++] = class1.method5(var159, 0x1 << var160) == 0 ? 0 : 1;
                                continue;
                            }
                            if (var472 == 4011) {
                                var6 -= 2;
                                int var161 = class68.field1330[var6];
                                int var162 = class68.field1330[var6 + 1];
                                class68.field1330[var6++] = var161 % var162;
                                continue;
                            }
                            if (var472 == 4012) {
                                var6 -= 2;
                                int var163 = class68.field1330[var6 + 1];
                                int var164 = class68.field1330[var6];
                                if (var164 == 0) {
                                    class68.field1330[var6++] = 0;
                                } else {
                                    class68.field1330[var6++] = (int) Math.pow((double) var164, (double) var163);
                                }
                                continue;
                            }
                            if (var472 == 4013) {
                                var6 -= 2;
                                int var165 = class68.field1330[var6];
                                int var166 = class68.field1330[var6 + 1];
                                if (var165 == 0) {
                                    class68.field1330[var6++] = 0;
                                } else if (var166 == 0) {
                                    class68.field1330[var6++] = Integer.MAX_VALUE;
                                } else {
                                    class68.field1330[var6++] = (int) Math.pow((double) var165, 1.0D / (double) var166);
                                }
                                continue;
                            }
                            if (var472 == 4014) {
                                var6 -= 2;
                                int var167 = class68.field1330[var6 + 1];
                                int var168 = class68.field1330[var6];
                                class68.field1330[var6++] = class1.method5(var167, var168);
                                continue;
                            }
                            if (var472 == 4015) {
                                var6 -= 2;
                                int var169 = class68.field1330[var6];
                                int var170 = class68.field1330[var6 + 1];
                                class68.field1330[var6++] = class49.method377(var170, var169);
                                continue;
                            }
                            if (var472 == 4016) {
                                var6 -= 2;
                                int var171 = class68.field1330[var6];
                                int var172 = class68.field1330[var6 + 1];
                                class68.field1330[var6++] = var171 >= var172 ? var172 : var171;
                                continue;
                            }
                            if (var472 == 4017) {
                                var6 -= 2;
                                int var173 = class68.field1330[var6];
                                int var174 = class68.field1330[var6 + 1];
                                class68.field1330[var6++] = var174 >= var173 ? var174 : var173;
                                continue;
                            }
                            if (var472 == 4018) {
                                var6 -= 3;
                                long var175 = (long) class68.field1330[var6 + 2];
                                long var177 = (long) class68.field1330[var6];
                                long var179 = (long) class68.field1330[var6 + 1];
                                class68.field1330[var6++] = (int) (var175 * var177 / var179);
                                continue;
                            }
                        } else if (var472 < 4200) {
                            if (var472 == 4100) {
                                var7--;
                                class86 var345 = class256.field4547[var7];
                                var6--;
                                int var346 = class68.field1330[var6];
                                class256.field4547[var7++] = class109.method783(2, new class86[] { var345, class4.method26(false, var346) });
                                continue;
                            }
                            if (var472 == 4101) {
                                var7 -= 2;
                                class86 var347 = class256.field4547[var7 + 1];
                                class86 var348 = class256.field4547[var7];
                                class256.field4547[var7++] = class109.method783(2, new class86[] { var348, var347 });
                                continue;
                            }
                            if (var472 == 4102) {
                                var7--;
                                class86 var349 = class256.field4547[var7];
                                var6--;
                                int var350 = class68.field1330[var6];
                                class256.field4547[var7++] = class109.method783(2, new class86[] { var349, class48.method376(var350, arg1 + 6128, true) });
                                continue;
                            }
                            if (var472 == 4103) {
                                var7--;
                                class86 var351 = class256.field4547[var7];
                                class256.field4547[var7++] = var351.method585(33);
                                continue;
                            }
                            if (var472 == 4104) {
                                var6--;
                                int var352 = class68.field1330[var6];
                                long var353 = ((long) var352 + 11745L) * 86400000L;
                                class193.field3458.setTime(new Date(var353));
                                int var355 = class193.field3458.get(5);
                                int var356 = class193.field3458.get(2);
                                int var357 = class193.field3458.get(1);
                                class256.field4547[var7++] = class109.method783(2, new class86[] { class4.method26(false, var355), class147.field2765, class116.field2204[var356], class147.field2765, class4.method26(false, var357) });
                                continue;
                            }
                            if (var472 == 4105) {
                                var7 -= 2;
                                class86 var358 = class256.field4547[var7];
                                class86 var359 = class256.field4547[var7 + 1];
                                if (class124.field2412.field4019 != null && class124.field2412.field4019.field1425) {
                                    class256.field4547[var7++] = var359;
                                    continue;
                                }
                                class256.field4547[var7++] = var358;
                                continue;
                            }
                            if (var472 == 4106) {
                                var6--;
                                int var360 = class68.field1330[var6];
                                class256.field4547[var7++] = class4.method26(false, var360);
                                continue;
                            }
                            if (var472 == 4107) {
                                var7 -= 2;
                                class68.field1330[var6++] = class256.field4547[var7].method623(class256.field4547[var7 + 1], -14154);
                                continue;
                            }
                            if (var472 == 4108) {
                                var7--;
                                class86 var361 = class256.field4547[var7];
                                var6 -= 2;
                                int var362 = class68.field1330[var6 + 1];
                                int var363 = class68.field1330[var6];
                                byte[] var364 = class98.field1951.method1084((byte) -116, var362, 0);
                                class148 var365 = new class148(var364);
                                var365.method1752(class238.field4294, (int[]) null);
                                class68.field1330[var6++] = var365.method1757(var361, var363);
                                continue;
                            }
                            if (var472 == 4109) {
                                var6 -= 2;
                                int var366 = class68.field1330[var6];
                                var7--;
                                class86 var367 = class256.field4547[var7];
                                int var368 = class68.field1330[var6 + 1];
                                byte[] var369 = class98.field1951.method1084((byte) -123, var368, 0);
                                class148 var370 = new class148(var369);
                                var370.method1752(class238.field4294, (int[]) null);
                                class68.field1330[var6++] = var370.method1749(var367, var366);
                                continue;
                            }
                            if (var472 == 4110) {
                                var7 -= 2;
                                class86 var371 = class256.field4547[var7];
                                class86 var372 = class256.field4547[var7 + 1];
                                var6--;
                                if (class68.field1330[var6] == 1) {
                                    class256.field4547[var7++] = var371;
                                } else {
                                    class256.field4547[var7++] = var372;
                                }
                                continue;
                            }
                            if (var472 == 4111) {
                                var7--;
                                class86 var373 = class256.field4547[var7];
                                class256.field4547[var7++] = class259.method1769(var373);
                                continue;
                            }
                            if (var472 == 4112) {
                                var7--;
                                class86 var374 = class256.field4547[var7];
                                var6--;
                                int var375 = class68.field1330[var6];
                                if (var375 == -1) {
                                    throw new RuntimeException("null char");
                                }
                                class256.field4547[var7++] = var374.method627(1, var375);
                                continue;
                            }
                            if (var472 == 4113) {
                                var6--;
                                int var376 = class68.field1330[var6];
                                class68.field1330[var6++] = class36.method270((byte) -122, var376) ? 1 : 0;
                                continue;
                            }
                            if (var472 == 4114) {
                                var6--;
                                int var377 = class68.field1330[var6];
                                class68.field1330[var6++] = class236.method1632(97, var377) ? 1 : 0;
                                continue;
                            }
                            if (var472 == 4115) {
                                var6--;
                                int var378 = class68.field1330[var6];
                                class68.field1330[var6++] = class98.method708(var378, (byte) -38) ? 1 : 0;
                                continue;
                            }
                            if (var472 == 4116) {
                                var6--;
                                int var379 = class68.field1330[var6];
                                class68.field1330[var6++] = class15.method110(var379, (byte) -119) ? 1 : 0;
                                continue;
                            }
                            if (var472 == 4117) {
                                var7--;
                                class86 var380 = class256.field4547[var7];
                                if (var380 == null) {
                                    class68.field1330[var6++] = 0;
                                } else {
                                    class68.field1330[var6++] = var380.method612((byte) 76);
                                }
                                continue;
                            }
                            if (var472 == 4118) {
                                var6 -= 2;
                                int var381 = class68.field1330[var6];
                                var7--;
                                class86 var382 = class256.field4547[var7];
                                int var383 = class68.field1330[var6 + 1];
                                class256.field4547[var7++] = var382.method610(var381, var383, (byte) -81);
                                continue;
                            }
                            if (var472 == 4119) {
                                boolean var384 = false;
                                var7--;
                                class86 var385 = class256.field4547[var7];
                                class86 var386 = class106.method758(var385.method612((byte) 79), 0);
                                for (int var387 = 0; var387 < var385.method612((byte) 88); var387++) {
                                    int var388 = var385.method611(48, var387);
                                    if (var388 == 60) {
                                        var384 = true;
                                    } else if (var388 == 62) {
                                        var384 = false;
                                    } else if (!var384) {
                                        var386.method620(var388, (byte) -41);
                                    }
                                }
                                var386.method628(arg1 + 3282);
                                class256.field4547[var7++] = var386;
                                continue;
                            }
                            if (var472 == 4120) {
                                var6 -= 2;
                                int var389 = class68.field1330[var6 + 1];
                                var7--;
                                class86 var390 = class256.field4547[var7];
                                int var391 = class68.field1330[var6];
                                class68.field1330[var6++] = var390.method587(false, var391, var389);
                                continue;
                            }
                            if (var472 == 4121) {
                                var7 -= 2;
                                class86 var392 = class256.field4547[var7];
                                class86 var393 = class256.field4547[var7 + 1];
                                var6--;
                                int var394 = class68.field1330[var6];
                                class68.field1330[var6++] = var392.method603((byte) 4, var393, var394);
                                continue;
                            }
                            if (var472 == 4122) {
                                var6--;
                                int var395 = class68.field1330[var6];
                                class68.field1330[var6++] = class124.method880(var395, (byte) 94);
                                continue;
                            }
                            if (var472 == 4123) {
                                var6--;
                                int var396 = class68.field1330[var6];
                                class68.field1330[var6++] = class121.method854(var396, -54);
                                continue;
                            }
                        } else if (var472 < 4300) {
                            if (var472 == 4200) {
                                var6--;
                                int var326 = class68.field1330[var6];
                                class256.field4547[var7++] = class272.method1853(0, var326).field1421;
                                continue;
                            }
                            if (var472 == 4201) {
                                var6 -= 2;
                                int var327 = class68.field1330[var6 + 1];
                                int var328 = class68.field1330[var6];
                                class69 var329 = class272.method1853(arg1 ^ 0xFFFFE81A, var328);
                                if (var327 >= 1 && var327 <= 5 && var329.field1348[var327 - 1] != null) {
                                    class256.field4547[var7++] = var329.field1348[var327 - 1];
                                    continue;
                                }
                                class256.field4547[var7++] = class61.field1206;
                                continue;
                            }
                            if (var472 == 4202) {
                                var6 -= 2;
                                int var330 = class68.field1330[var6];
                                int var331 = class68.field1330[var6 + 1];
                                class69 var332 = class272.method1853(0, var330);
                                if (var331 >= 1 && var331 <= 5 && var332.field1412[var331 - 1] != null) {
                                    class256.field4547[var7++] = var332.field1412[var331 - 1];
                                    continue;
                                }
                                class256.field4547[var7++] = class61.field1206;
                                continue;
                            }
                            if (var472 == 4203) {
                                var6--;
                                int var333 = class68.field1330[var6];
                                class68.field1330[var6++] = class272.method1853(0, var333).field1358;
                                continue;
                            }
                            if (var472 == 4204) {
                                var6--;
                                int var334 = class68.field1330[var6];
                                class68.field1330[var6++] = class272.method1853(0, var334).field1390 == 1 ? 1 : 0;
                                continue;
                            }
                            if (var472 == 4205) {
                                var6--;
                                int var335 = class68.field1330[var6];
                                class69 var336 = class272.method1853(0, var335);
                                if (var336.field1391 == -1 && var336.field1360 >= 0) {
                                    class68.field1330[var6++] = var336.field1360;
                                    continue;
                                }
                                class68.field1330[var6++] = var335;
                                continue;
                            }
                            if (var472 == 4206) {
                                var6--;
                                int var337 = class68.field1330[var6];
                                class69 var338 = class272.method1853(arg1 ^ 0xFFFFE81A, var337);
                                if (var338.field1391 >= 0 && var338.field1360 >= 0) {
                                    class68.field1330[var6++] = var338.field1360;
                                    continue;
                                }
                                class68.field1330[var6++] = var337;
                                continue;
                            }
                            if (var472 == 4207) {
                                var6--;
                                int var339 = class68.field1330[var6];
                                class68.field1330[var6++] = class272.method1853(class177.method1249(arg1, -6118), var339).field1396 ? 1 : 0;
                                continue;
                            }
                            if (var472 == 4208) {
                                var6 -= 2;
                                int var340 = class68.field1330[var6];
                                int var341 = class68.field1330[var6 + 1];
                                class105 var342 = class22.method162(true, var341);
                                if (var342.method754(-116)) {
                                    class256.field4547[var7++] = class272.method1853(class177.method1249(arg1, -6118), var340).method493(var342.field2007, true, var341);
                                } else {
                                    class68.field1330[var6++] = class272.method1853(0, var340).method490(var342.field2006, 0, var341);
                                }
                                continue;
                            }
                            if (var472 == 4210) {
                                var7--;
                                class86 var343 = class256.field4547[var7];
                                var6--;
                                int var344 = class68.field1330[var6];
                                class186.method1282(var343, arg1 - 1949288953, var344 == 1);
                                class68.field1330[var6++] = class143.field2710;
                                continue;
                            }
                            if (var472 == 4211) {
                                if (class272.field4771 != null && class143.field2710 > class260.field4661) {
                                    class68.field1330[var6++] = class1.method5(class272.field4771[class260.field4661++], 65535);
                                    continue;
                                }
                                class68.field1330[var6++] = -1;
                                continue;
                            }
                            if (var472 == 4212) {
                                class260.field4661 = 0;
                                continue;
                            }
                        } else if (var472 < 4400) {
                            if (var472 == 4300) {
                                var6 -= 2;
                                int var181 = class68.field1330[var6];
                                int var182 = class68.field1330[var6 + 1];
                                class105 var183 = class22.method162(true, var182);
                                if (var183.method754(-116)) {
                                    class256.field4547[var7++] = class178.method1251(var181, (byte) -68).method93(var182, var183.field2007, true);
                                } else {
                                    class68.field1330[var6++] = class178.method1251(var181, (byte) -68).method86((byte) 23, var182, var183.field2006);
                                }
                                continue;
                            }
                            if (var472 == 4301) {
                                var6--;
                                int var184 = class68.field1330[var6];
                                class68.field1330[var6++] = class178.method1251(var184, (byte) -68).field388;
                                continue;
                            }
                            if (var472 == 4302) {
                                var6--;
                                int var185 = class68.field1330[var6];
                                class68.field1330[var6++] = class178.method1251(var185, (byte) -68).field335;
                                continue;
                            }
                            if (var472 == 4303) {
                                var6--;
                                int var186 = class68.field1330[var6];
                                class68.field1330[var6++] = class178.method1251(var186, (byte) -68).field328;
                                continue;
                            }
                            if (var472 == 4304) {
                                var6--;
                                int var187 = class68.field1330[var6];
                                class68.field1330[var6++] = class178.method1251(var187, (byte) -68).field376;
                                continue;
                            }
                            if (var472 == 4305) {
                                var6--;
                                int var188 = class68.field1330[var6];
                                class68.field1330[var6++] = class178.method1251(var188, (byte) -68).field345;
                                continue;
                            }
                            if (var472 == 4306) {
                                var6--;
                                int var189 = class68.field1330[var6];
                                class68.field1330[var6++] = class178.method1251(var189, (byte) -68).field369;
                                continue;
                            }
                            if (var472 == 4307) {
                                var6--;
                                int var190 = class68.field1330[var6];
                                class68.field1330[var6++] = class178.method1251(var190, (byte) -68).field370;
                                continue;
                            }
                        } else if (var472 >= 4500) {
                            if (var472 < 4600) {
                                if (var472 == 4500) {
                                    var6 -= 2;
                                    int var191 = class68.field1330[var6];
                                    int var192 = class68.field1330[var6 + 1];
                                    class105 var193 = class22.method162(true, var192);
                                    if (var193.method754(-116)) {
                                        class256.field4547[var7++] = class150.method1071(65, var191).method790((byte) -38, var192, var193.field2007);
                                    } else {
                                        class68.field1330[var6++] = class150.method1071(113, var191).method787(class177.method1249(arg1, -6118), var192, var193.field2006);
                                    }
                                    continue;
                                }
                            } else if (var472 < 5100) {
                                if (var472 == 5000) {
                                    class68.field1330[var6++] = class227.field4119;
                                    continue;
                                }
                                if (var472 == 5001) {
                                    var6 -= 3;
                                    class202.field3664++;
                                    class227.field4119 = class68.field1330[var6];
                                    class132.field2500 = class68.field1330[var6 + 1];
                                    class17.field494 = class68.field1330[var6 + 2];
                                    class36.field809.method1356(152, true);
                                    class36.field809.method1388(arg1 ^ 0x178B, class227.field4119);
                                    class36.field809.method1388(-77, class132.field2500);
                                    class36.field809.method1388(-51, class17.field494);
                                    continue;
                                }
                                if (var472 == 5002) {
                                    class132.field2501++;
                                    var6 -= 2;
                                    var7--;
                                    class86 var194 = class256.field4547[var7];
                                    int var195 = class68.field1330[var6 + 1];
                                    int var196 = class68.field1330[var6];
                                    class36.field809.method1356(247, true);
                                    class36.field809.method1399((byte) -34, var194.method622(-2));
                                    class36.field809.method1388(-69, var196 - 1);
                                    class36.field809.method1388(-53, var195);
                                    continue;
                                }
                                if (var472 == 5003) {
                                    var6--;
                                    int var197 = class68.field1330[var6];
                                    class86 var198 = null;
                                    if (var197 < 100) {
                                        var198 = class122.field2367[var197];
                                    }
                                    if (var198 == null) {
                                        var198 = class61.field1206;
                                    }
                                    class256.field4547[var7++] = var198;
                                    continue;
                                }
                                if (var472 == 5004) {
                                    int var199 = -1;
                                    var6--;
                                    int var200 = class68.field1330[var6];
                                    if (var200 < 100 && class122.field2367[var200] != null) {
                                        var199 = class189.field3346[var200];
                                    }
                                    class68.field1330[var6++] = var199;
                                    continue;
                                }
                                if (var472 == 5005) {
                                    class68.field1330[var6++] = class132.field2500;
                                    continue;
                                }
                                if (var472 == 5008) {
                                    var7--;
                                    class86 var201 = class256.field4547[var7];
                                    if (var201.method597(class39.field911, 121)) {
                                        class57.method416(var201, 108);
                                        continue;
                                    }
                                    if (class38.field905 == 0 && (class21.field548 == 1 || class134.field2542 == 1)) {
                                        continue;
                                    }
                                    class12.field396++;
                                    class86 var202 = var201.method585(33);
                                    byte var203 = 0;
                                    byte var204 = 0;
                                    if (var202.method597(class33.field703, 37)) {
                                        var204 = 0;
                                        var201 = var201.method633(class33.field703.method612((byte) 92), (byte) 61);
                                    } else if (var202.method597(class162.field3039, 127)) {
                                        var201 = var201.method633(class162.field3039.method612((byte) 102), (byte) 61);
                                        var204 = 1;
                                    } else if (var202.method597(class135.field2594, 16)) {
                                        var204 = 2;
                                        var201 = var201.method633(class135.field2594.method612((byte) 63), (byte) 61);
                                    } else if (var202.method597(class178.field3224, 104)) {
                                        var204 = 3;
                                        var201 = var201.method633(class178.field3224.method612((byte) 119), (byte) 61);
                                    } else if (var202.method597(class11.field381, 25)) {
                                        var204 = 4;
                                        var201 = var201.method633(class11.field381.method612((byte) 106), (byte) 61);
                                    } else if (var202.method597(class57.field1162, -127)) {
                                        var201 = var201.method633(class57.field1162.method612((byte) 51), (byte) 61);
                                        var204 = 5;
                                    } else if (var202.method597(class61.field1211, arg1 ^ 0xFFFFE87A)) {
                                        var201 = var201.method633(class61.field1211.method612((byte) 75), (byte) 61);
                                        var204 = 6;
                                    } else if (var202.method597(class60.field1192, -127)) {
                                        var201 = var201.method633(class60.field1192.method612((byte) 97), (byte) 61);
                                        var204 = 7;
                                    } else if (var202.method597(class12.field400, arg1 + 5994)) {
                                        var201 = var201.method633(class12.field400.method612((byte) 106), (byte) 61);
                                        var204 = 8;
                                    } else if (var202.method597(class60.field1195, 77)) {
                                        var201 = var201.method633(class60.field1195.method612((byte) 53), (byte) 61);
                                        var204 = 9;
                                    } else if (var202.method597(class214.field3868, -128)) {
                                        var204 = 10;
                                        var201 = var201.method633(class214.field3868.method612((byte) 53), (byte) 61);
                                    } else if (var202.method597(class232.field4200, 74)) {
                                        var201 = var201.method633(class232.field4200.method612((byte) 120), (byte) 61);
                                        var204 = 11;
                                    } else if (class257.field4558 != 0) {
                                        if (var202.method597(class33.field745, arg1 ^ 0xFFFFE803)) {
                                            var201 = var201.method633(class33.field745.method612((byte) 106), (byte) 61);
                                            var204 = 0;
                                        } else if (var202.method597(class162.field3040, -125)) {
                                            var204 = 1;
                                            var201 = var201.method633(class162.field3040.method612((byte) 77), (byte) 61);
                                        } else if (var202.method597(class135.field2593, -123)) {
                                            var204 = 2;
                                            var201 = var201.method633(class135.field2593.method612((byte) 64), (byte) 61);
                                        } else if (var202.method597(class178.field3222, -127)) {
                                            var201 = var201.method633(class178.field3222.method612((byte) 73), (byte) 61);
                                            var204 = 3;
                                        } else if (var202.method597(class11.field331, -127)) {
                                            var204 = 4;
                                            var201 = var201.method633(class11.field331.method612((byte) 95), (byte) 61);
                                        } else if (var202.method597(class57.field1165, arg1 ^ 0xFFFFE822)) {
                                            var204 = 5;
                                            var201 = var201.method633(class57.field1165.method612((byte) 83), (byte) 61);
                                        } else if (var202.method597(class61.field1213, 32)) {
                                            var204 = 6;
                                            var201 = var201.method633(class61.field1213.method612((byte) 53), (byte) 61);
                                        } else if (var202.method597(class60.field1203, arg1 + 5992)) {
                                            var201 = var201.method633(class60.field1203.method612((byte) 87), (byte) 61);
                                            var204 = 7;
                                        } else if (var202.method597(class12.field391, -126)) {
                                            var204 = 8;
                                            var201 = var201.method633(class12.field391.method612((byte) 104), (byte) 61);
                                        } else if (var202.method597(class60.field1193, 56)) {
                                            var204 = 9;
                                            var201 = var201.method633(class60.field1193.method612((byte) 67), (byte) 61);
                                        } else if (var202.method597(class214.field3863, 118)) {
                                            var201 = var201.method633(class214.field3863.method612((byte) 65), (byte) 61);
                                            var204 = 10;
                                        } else if (var202.method597(class232.field4199, arg1 ^ 0x1798)) {
                                            var204 = 11;
                                            var201 = var201.method633(class232.field4199.method612((byte) 73), (byte) 61);
                                        }
                                    }
                                    class86 var205 = var201.method585(33);
                                    if (var205.method597(class45.field1008, -123)) {
                                        var201 = var201.method633(class45.field1008.method612((byte) 91), (byte) 61);
                                        var203 = 1;
                                    } else if (var205.method597(class22.field560, 97)) {
                                        var203 = 2;
                                        var201 = var201.method633(class22.field560.method612((byte) 72), (byte) 61);
                                    } else if (var205.method597(class248.field4409, arg1 + 6165)) {
                                        var201 = var201.method633(class248.field4409.method612((byte) 90), (byte) 61);
                                        var203 = 3;
                                    } else if (var205.method597(class41.field930, 53)) {
                                        var201 = var201.method633(class41.field930.method612((byte) 115), (byte) 61);
                                        var203 = 4;
                                    } else if (var205.method597(class20.field537, arg1 + 6152)) {
                                        var201 = var201.method633(class20.field537.method612((byte) 105), (byte) 61);
                                        var203 = 5;
                                    } else if (class257.field4558 != 0) {
                                        if (var205.method597(class45.field1013, 51)) {
                                            var203 = 1;
                                            var201 = var201.method633(class45.field1013.method612((byte) 118), (byte) 61);
                                        } else if (var205.method597(class22.field565, -125)) {
                                            var203 = 2;
                                            var201 = var201.method633(class22.field565.method612((byte) 70), (byte) 61);
                                        } else if (var205.method597(class248.field4398, arg1 ^ 0xFFFFE837)) {
                                            var201 = var201.method633(class248.field4398.method612((byte) 99), (byte) 61);
                                            var203 = 3;
                                        } else if (var205.method597(class41.field925, 89)) {
                                            var201 = var201.method633(class41.field925.method612((byte) 124), (byte) 61);
                                            var203 = 4;
                                        } else if (var205.method597(class20.field524, arg1 ^ 0xFFFFE801)) {
                                            var203 = 5;
                                            var201 = var201.method633(class20.field524.method612((byte) 88), (byte) 61);
                                        }
                                    }
                                    class36.field809.method1356(87, true);
                                    class36.field809.method1388(-107, 0);
                                    int var206 = class36.field809.field3565;
                                    class36.field809.method1388(-40, var204);
                                    class36.field809.method1388(-103, var203);
                                    class4.method24(class36.field809, (byte) 72, var201);
                                    class36.field809.method1400(arg1 ^ 0xFFFFE87D, class36.field809.field3565 - var206);
                                    continue;
                                }
                                if (var472 == 5009) {
                                    var7 -= 2;
                                    class86 var207 = class256.field4547[var7];
                                    class86 var208 = class256.field4547[var7 + 1];
                                    if (class38.field905 != 0 || class21.field548 != 1 && class134.field2542 != 1) {
                                        class22.field559++;
                                        class36.field809.method1356(52, true);
                                        class36.field809.method1388(-124, 0);
                                        int var209 = class36.field809.field3565;
                                        class36.field809.method1399((byte) -45, var207.method622(-2));
                                        class4.method24(class36.field809, (byte) 106, var208);
                                        class36.field809.method1400(117, class36.field809.field3565 - var209);
                                    }
                                    continue;
                                }
                                if (var472 == 5010) {
                                    var6--;
                                    int var210 = class68.field1330[var6];
                                    class86 var211 = null;
                                    if (var210 < 100) {
                                        var211 = class13.field406[var210];
                                    }
                                    if (var211 == null) {
                                        var211 = class61.field1206;
                                    }
                                    class256.field4547[var7++] = var211;
                                    continue;
                                }
                                if (var472 == 5011) {
                                    var6--;
                                    int var212 = class68.field1330[var6];
                                    class86 var213 = null;
                                    if (var212 < 100) {
                                        var213 = class96.field1904[var212];
                                    }
                                    if (var213 == null) {
                                        var213 = class61.field1206;
                                    }
                                    class256.field4547[var7++] = var213;
                                    continue;
                                }
                                if (var472 == 5012) {
                                    var6--;
                                    int var214 = class68.field1330[var6];
                                    int var215 = -1;
                                    if (var214 < 100) {
                                        var215 = class157.field2960[var214];
                                    }
                                    class68.field1330[var6++] = var215;
                                    continue;
                                }
                                if (var472 == 5015) {
                                    class86 var216;
                                    if (class124.field2412 == null || class124.field2412.field4029 == null) {
                                        var216 = class56.field1152;
                                    } else {
                                        var216 = class124.field2412.method1571(27804);
                                    }
                                    class256.field4547[var7++] = var216;
                                    continue;
                                }
                                if (var472 == 5016) {
                                    class68.field1330[var6++] = class17.field494;
                                    continue;
                                }
                                if (var472 == 5017) {
                                    class68.field1330[var6++] = class201.field3615;
                                    continue;
                                }
                                if (var472 == 5050) {
                                    var6--;
                                    int var217 = class68.field1330[var6];
                                    class256.field4547[var7++] = class272.method1854(0, var217).field453;
                                    continue;
                                }
                                if (var472 == 5051) {
                                    var6--;
                                    int var218 = class68.field1330[var6];
                                    class16 var219 = class272.method1854(0, var218);
                                    if (var219.field458 == null) {
                                        class68.field1330[var6++] = 0;
                                    } else {
                                        class68.field1330[var6++] = var219.field458.length;
                                    }
                                    continue;
                                }
                                if (var472 == 5052) {
                                    var6 -= 2;
                                    int var220 = class68.field1330[var6 + 1];
                                    int var221 = class68.field1330[var6];
                                    class16 var222 = class272.method1854(arg1 + 6118, var221);
                                    int var223 = var222.field458[var220];
                                    class68.field1330[var6++] = var223;
                                    continue;
                                }
                                if (var472 == 5053) {
                                    var6--;
                                    int var224 = class68.field1330[var6];
                                    class16 var225 = class272.method1854(0, var224);
                                    if (var225.field450 == null) {
                                        class68.field1330[var6++] = 0;
                                    } else {
                                        class68.field1330[var6++] = var225.field450.length;
                                    }
                                    continue;
                                }
                                if (var472 == 5054) {
                                    var6 -= 2;
                                    int var226 = class68.field1330[var6];
                                    int var227 = class68.field1330[var6 + 1];
                                    class68.field1330[var6++] = class272.method1854(0, var226).field450[var227];
                                    continue;
                                }
                                if (var472 == 5055) {
                                    var6--;
                                    int var228 = class68.field1330[var6];
                                    class256.field4547[var7++] = class177.method1244(var228, 1).method800(1);
                                    continue;
                                }
                                if (var472 == 5056) {
                                    var6--;
                                    int var229 = class68.field1330[var6];
                                    class113 var230 = class177.method1244(var229, 1);
                                    if (var230.field2158 == null) {
                                        class68.field1330[var6++] = 0;
                                    } else {
                                        class68.field1330[var6++] = var230.field2158.length;
                                    }
                                    continue;
                                }
                                if (var472 == 5057) {
                                    var6 -= 2;
                                    int var231 = class68.field1330[var6];
                                    int var232 = class68.field1330[var6 + 1];
                                    class68.field1330[var6++] = class177.method1244(var231, 1).field2158[var232];
                                    continue;
                                }
                                if (var472 == 5058) {
                                    class216.field3900 = new class83();
                                    var6--;
                                    class216.field3900.field1620 = class68.field1330[var6];
                                    class216.field3900.field1626 = class177.method1244(class216.field3900.field1620, 1);
                                    class216.field3900.field1623 = new int[class216.field3900.field1626.method797(36)];
                                    continue;
                                }
                                if (var472 == 5059) {
                                    class168.field3106++;
                                    class36.field809.method1356(130, true);
                                    class36.field809.method1388(-101, 0);
                                    int var233 = class36.field809.field3565;
                                    class36.field809.method1388(arg1 + 6060, 0);
                                    class36.field809.method1428((byte) 34, class216.field3900.field1620);
                                    class216.field3900.field1626.method795(class36.field809, (byte) -71, class216.field3900.field1623);
                                    class36.field809.method1400(95, class36.field809.field3565 - var233);
                                    continue;
                                }
                                if (var472 == 5060) {
                                    class16.field464++;
                                    var7--;
                                    class86 var234 = class256.field4547[var7];
                                    class36.field809.method1356(64, true);
                                    class36.field809.method1388(arg1 + 6002, 0);
                                    int var235 = class36.field809.field3565;
                                    class36.field809.method1399((byte) -111, var234.method622(-2));
                                    class36.field809.method1428((byte) -122, class216.field3900.field1620);
                                    class216.field3900.field1626.method795(class36.field809, (byte) -75, class216.field3900.field1623);
                                    class36.field809.method1400(86, class36.field809.field3565 - var235);
                                    continue;
                                }
                                if (var472 == 5061) {
                                    class36.field809.method1356(130, true);
                                    class36.field809.method1388(-121, 0);
                                    int var236 = class36.field809.field3565;
                                    class36.field809.method1388(arg1 + 6025, 1);
                                    class168.field3106++;
                                    class36.field809.method1428((byte) 0, class216.field3900.field1620);
                                    class216.field3900.field1626.method795(class36.field809, (byte) 94, class216.field3900.field1623);
                                    class36.field809.method1400(97, class36.field809.field3565 - var236);
                                    continue;
                                }
                                if (var472 == 5062) {
                                    var6 -= 2;
                                    int var237 = class68.field1330[var6 + 1];
                                    int var238 = class68.field1330[var6];
                                    class68.field1330[var6++] = class272.method1854(0, var238).field449[var237];
                                    continue;
                                }
                                if (var472 == 5063) {
                                    var6 -= 2;
                                    int var239 = class68.field1330[var6];
                                    int var240 = class68.field1330[var6 + 1];
                                    class68.field1330[var6++] = class272.method1854(0, var239).field460[var240];
                                    continue;
                                }
                                if (var472 == 5064) {
                                    var6 -= 2;
                                    int var241 = class68.field1330[var6];
                                    int var242 = class68.field1330[var6 + 1];
                                    if (var242 == -1) {
                                        class68.field1330[var6++] = -1;
                                    } else {
                                        class68.field1330[var6++] = class272.method1854(0, var241).method113(var242, (byte) 3);
                                    }
                                    continue;
                                }
                                if (var472 == 5065) {
                                    var6 -= 2;
                                    int var243 = class68.field1330[var6];
                                    int var244 = class68.field1330[var6 + 1];
                                    if (var244 == -1) {
                                        class68.field1330[var6++] = -1;
                                    } else {
                                        class68.field1330[var6++] = class272.method1854(arg1 + 6118, var243).method118(var244, -1);
                                    }
                                    continue;
                                }
                                if (var472 == 5066) {
                                    var6--;
                                    int var245 = class68.field1330[var6];
                                    class68.field1330[var6++] = class177.method1244(var245, 1).method797(55);
                                    continue;
                                }
                                if (var472 == 5067) {
                                    var6 -= 2;
                                    int var246 = class68.field1330[var6];
                                    int var247 = class68.field1330[var6 + 1];
                                    int var248 = class177.method1244(var246, arg1 ^ 0xFFFFE81B).method793(false, var247);
                                    class68.field1330[var6++] = var248;
                                    continue;
                                }
                                if (var472 == 5068) {
                                    var6 -= 2;
                                    int var249 = class68.field1330[var6];
                                    int var250 = class68.field1330[var6 + 1];
                                    class216.field3900.field1623[var249] = var250;
                                    continue;
                                }
                                if (var472 == 5069) {
                                    var6 -= 2;
                                    int var251 = class68.field1330[var6 + 1];
                                    int var252 = class68.field1330[var6];
                                    class216.field3900.field1623[var252] = var251;
                                    continue;
                                }
                                if (var472 == 5070) {
                                    var6 -= 3;
                                    int var253 = class68.field1330[var6];
                                    int var254 = class68.field1330[var6 + 2];
                                    int var255 = class68.field1330[var6 + 1];
                                    class113 var256 = class177.method1244(var253, 1);
                                    if (var256.method793(false, var255) != 0) {
                                        throw new RuntimeException("bad command");
                                    }
                                    class68.field1330[var6++] = var256.method798(arg1 + 6117, var255, var254);
                                    continue;
                                }
                            } else if (var472 < 5200) {
                                if (var472 == 5100) {
                                    if (class9.field295[86]) {
                                        class68.field1330[var6++] = 1;
                                    } else {
                                        class68.field1330[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var472 == 5101) {
                                    if (class9.field295[82]) {
                                        class68.field1330[var6++] = 1;
                                    } else {
                                        class68.field1330[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var472 == 5102) {
                                    if (class9.field295[81]) {
                                        class68.field1330[var6++] = 1;
                                    } else {
                                        class68.field1330[var6++] = 0;
                                    }
                                    continue;
                                }
                            } else if (var472 < 5300) {
                                if (var472 == 5200) {
                                    var6--;
                                    class134.method957(class68.field1330[var6], true);
                                    continue;
                                }
                                if (var472 == 5201) {
                                    class68.field1330[var6++] = class159.method1162(true);
                                    continue;
                                }
                                if (var472 == 5202) {
                                    var6--;
                                    class9.method68((byte) 118, class68.field1330[var6]);
                                    continue;
                                }
                                if (var472 == 5203) {
                                    var7--;
                                    class21.method156(false, class256.field4547[var7]);
                                    continue;
                                }
                                if (var472 == 5204) {
                                    class256.field4547[var7 - 1] = class38.method321(class256.field4547[var7 - 1], 0);
                                    continue;
                                }
                                if (var472 == 5205) {
                                    var7--;
                                    class215.method1526(class256.field4547[var7], 50);
                                    continue;
                                }
                                if (var472 == 5206) {
                                    var6--;
                                    int var257 = class68.field1330[var6];
                                    class210 var258 = class215.method1520(var257 & 0x3FFF, arg1 ^ 0xFFFFBFE9, var257 >> 14 & 0x3FFF);
                                    if (var258 == null) {
                                        class256.field4547[var7++] = class61.field1206;
                                    } else {
                                        class256.field4547[var7++] = var258.field3795;
                                    }
                                    continue;
                                }
                                if (var472 == 5207) {
                                    var7--;
                                    class210 var259 = class2.method10(class256.field4547[var7], (byte) 86);
                                    if (var259 != null && var259.field3796 != null) {
                                        class256.field4547[var7++] = var259.field3796;
                                        continue;
                                    }
                                    class256.field4547[var7++] = class61.field1206;
                                    continue;
                                }
                            } else if (var472 < 5400) {
                                if (var472 == 5300) {
                                    var6 -= 2;
                                    class68.field1330[var6++] = 0;
                                    continue;
                                }
                                if (var472 == 5301) {
                                    continue;
                                }
                                if (var472 == 5302) {
                                    class68.field1330[var6++] = 0;
                                    continue;
                                }
                                if (var472 == 5303) {
                                    var6--;
                                    class68.field1330[var6++] = 0;
                                    class68.field1330[var6++] = 0;
                                    continue;
                                }
                                if (var472 == 5305) {
                                    byte var260 = -1;
                                    class68.field1330[var6++] = var260;
                                    continue;
                                }
                                if (var472 == 5306) {
                                    class68.field1330[var6++] = class173.method1236(-77);
                                    continue;
                                }
                                if (var472 == 5307) {
                                    var6--;
                                    int var261 = class68.field1330[var6];
                                    if (var261 < 0 || var261 > 2) {
                                        var261 = 0;
                                    }
                                    class119.method848(false, -1, arg1 + 6118, var261, -1);
                                    continue;
                                }
                                if (var472 == 5308) {
                                    class68.field1330[var6++] = class42.field949;
                                    continue;
                                }
                                if (var472 == 5309) {
                                    var6--;
                                    int var262 = class68.field1330[var6];
                                    if (var262 < 0 || var262 > 2) {
                                        var262 = 0;
                                    }
                                    class42.field949 = var262;
                                    class3.method15(-86, class157.field2954);
                                    continue;
                                }
                            } else if (var472 < 5500) {
                                if (var472 == 5400) {
                                    class54.field1096++;
                                    var7 -= 2;
                                    class86 var302 = class256.field4547[var7];
                                    var6--;
                                    int var303 = class68.field1330[var6];
                                    class86 var304 = class256.field4547[var7 + 1];
                                    class36.field809.method1356(65, true);
                                    class36.field809.method1388(-36, class268.method1841(0, var302) - (-class268.method1841(0, var304) - 1));
                                    class36.field809.method1379(0, var302);
                                    class36.field809.method1379(arg1 + 6118, var304);
                                    class36.field809.method1388(-71, var303);
                                    continue;
                                }
                                if (var472 == 5401) {
                                    var6 -= 2;
                                    class176.field3188[class68.field1330[var6]] = (short) class209.method1487(class68.field1330[var6 + 1], true);
                                    class78.method551(252645135);
                                    class125.method887((byte) -95);
                                    class3.method14(17946);
                                    class62.method443(19);
                                    class273.method1857((byte) -106);
                                    continue;
                                }
                                if (var472 == 5405) {
                                    var6 -= 2;
                                    int var305 = class68.field1330[var6];
                                    int var306 = class68.field1330[var6 + 1];
                                    if (var305 >= 0 && var305 < 2) {
                                        class220.field3955[var305] = new int[var306 << 1][4];
                                    }
                                    continue;
                                }
                                if (var472 == 5406) {
                                    var6 -= 7;
                                    int var307 = class68.field1330[var6];
                                    int var308 = class68.field1330[var6 + 1] << 1;
                                    int var309 = class68.field1330[var6 + 2];
                                    int var310 = class68.field1330[var6 + 3];
                                    int var311 = class68.field1330[var6 + 4];
                                    int var312 = class68.field1330[var6 + 5];
                                    int var313 = class68.field1330[var6 + 6];
                                    if (var307 >= 0 && var307 < 2 && class220.field3955[var307] != null && var308 >= 0 && var308 < class220.field3955[var307].length) {
                                        class220.field3955[var307][var308] = new int[] { (class1.method5(268419142, var309) >> 14) * 128, var310, class1.method5(var309, 16383) * 128, var313 };
                                        class220.field3955[var307][var308 + 1] = new int[] { class1.method5(var311 >> 14, 16383) * 128, var312, class1.method5(16383, var311) * 128 };
                                    }
                                    continue;
                                }
                                if (var472 == 5407) {
                                    var6--;
                                    int var314 = class220.field3955[class68.field1330[var6]].length >> 1;
                                    class68.field1330[var6++] = var314;
                                    continue;
                                }
                                if (var472 == 5411) {
                                    if (class138.field2627 == null) {
                                        class109.method778(false, 3031, class169.method1215(124));
                                    } else {
                                        System.exit(0);
                                    }
                                    continue;
                                }
                                if (var472 == 5419) {
                                    class86 var315 = class61.field1206;
                                    if (class96.field1897 != null) {
                                        var315 = class268.method1842(class96.field1897.field612, 70);
                                        try {
                                            if (class96.field1897.field611 != null) {
                                                byte[] var316 = ((String) class96.field1897.field611).getBytes("ISO-8859-1");
                                                var315 = class102.method733((byte) -127, var316.length, 0, var316);
                                            }
                                        } catch (UnsupportedEncodingException var470) {
                                        }
                                    }
                                    class256.field4547[var7++] = var315;
                                    continue;
                                }
                                if (var472 == 5420) {
                                    class68.field1330[var6++] = class254.field4522 == 3 ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 5421) {
                                    var7--;
                                    class86 var317 = class256.field4547[var7];
                                    var6--;
                                    boolean var318 = class68.field1330[var6] == 1;
                                    class86 var319 = class109.method783(2, new class86[] { class169.method1215(arg1 + 6229), var317 });
                                    if (class138.field2627 == null && (!var318 || class254.field4522 == 3 || !class254.field4511.startsWith("win") || class179.field3232)) {
                                        class109.method778(var318, 3031, var319);
                                        continue;
                                    }
                                    class97.field1931 = var319;
                                    class124.field2413 = var318;
                                    class62.field1219 = class157.field2954.method1723(arg1 + 6123, new String(var319.method619((byte) 65), "ISO-8859-1"));
                                    continue;
                                }
                                if (var472 == 5422) {
                                    var7 -= 2;
                                    class86 var320 = class256.field4547[var7];
                                    var6--;
                                    int var321 = class68.field1330[var6];
                                    class86 var322 = class256.field4547[var7 + 1];
                                    if (var320.method612((byte) 52) > 0) {
                                        if (class273.field4804 == null) {
                                            class273.field4804 = new class86[class132.field2504[class39.field910]];
                                        }
                                        class273.field4804[var321] = var320;
                                    }
                                    if (var322.method612((byte) 55) > 0) {
                                        if (class190.field3376 == null) {
                                            class190.field3376 = new class86[class132.field2504[class39.field910]];
                                        }
                                        class190.field3376[var321] = var322;
                                    }
                                    continue;
                                }
                                if (var472 == 5423) {
                                    var7--;
                                    class256.field4547[var7].method614(57);
                                    continue;
                                }
                            } else if (var472 < 5600) {
                                if (var472 == 5500) {
                                    var6 -= 4;
                                    int var263 = class68.field1330[var6];
                                    int var264 = class68.field1330[var6 + 1];
                                    int var265 = class68.field1330[var6 + 2];
                                    int var266 = class68.field1330[var6 + 3];
                                    class33.method242(((var263 & 0xFFFCBEF) >> 14) - class252.field4481, var265, var266, false, var264, false, (var263 & 0x3FFF) - class79.field1554);
                                    continue;
                                }
                                if (var472 == 5501) {
                                    var6 -= 4;
                                    int var267 = class68.field1330[var6 + 1];
                                    int var268 = class68.field1330[var6 + 2];
                                    int var269 = class68.field1330[var6];
                                    int var270 = class68.field1330[var6 + 3];
                                    class201.method1432(var268, (var269 & 0x3FFF) - class79.field1554, var267, 124, ((var269 & 0xFFFFF13) >> 14) - class252.field4481, var270);
                                    continue;
                                }
                                if (var472 == 5502) {
                                    var6 -= 6;
                                    int var271 = class68.field1330[var6];
                                    if (var271 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class253.field4494 = var271;
                                    int var272 = class68.field1330[var6 + 1];
                                    if ((class220.field3955[class253.field4494].length >> 1) <= (var272 + 1)) {
                                        throw new RuntimeException();
                                    }
                                    class96.field1916 = 0;
                                    class80.field1565 = var272;
                                    class208.field3770 = class68.field1330[var6 + 2];
                                    class228.field4133 = class68.field1330[var6 + 3];
                                    int var273 = class68.field1330[var6 + 4];
                                    if (var273 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class163.field3065 = var273;
                                    int var274 = class68.field1330[var6 + 5];
                                    if ((var274 + 1) >= (class220.field3955[class163.field3065].length >> 1)) {
                                        throw new RuntimeException();
                                    }
                                    class152.field2874 = 3;
                                    class55.field1111 = var274;
                                    continue;
                                }
                                if (var472 == 5503) {
                                    class206.method1469(false);
                                    continue;
                                }
                                if (var472 == 5504) {
                                    var6 -= 2;
                                    class139.field2641 = class68.field1330[var6];
                                    class86.field1664 = class68.field1330[var6 + 1];
                                    class252.method1701(128);
                                    continue;
                                }
                                if (var472 == 5505) {
                                    class68.field1330[var6++] = class139.field2641;
                                    continue;
                                }
                                if (var472 == 5506) {
                                    class68.field1330[var6++] = class86.field1664;
                                    continue;
                                }
                            } else if (var472 < 5700) {
                                if (var472 == 5600) {
                                    var7 -= 2;
                                    var6--;
                                    int var298 = class68.field1330[var6];
                                    class86 var299 = class256.field4547[var7];
                                    class86 var300 = class256.field4547[var7 + 1];
                                    if (class84.field1634 == 10 && class7.field254 == 0 && class154.field2892 == 0 && class195.field3489 == 0 && class161.field3024 == 0) {
                                        class219.method1551(var298, var299, var300, true);
                                    }
                                    continue;
                                }
                                if (var472 == 5601) {
                                    class65.method463((byte) -101);
                                    continue;
                                }
                                if (var472 == 5602) {
                                    if (class154.field2892 == 0) {
                                        class185.field3282 = -2;
                                    }
                                    continue;
                                }
                                if (var472 == 5603) {
                                    var6 -= 4;
                                    if (class84.field1634 == 10 && class7.field254 == 0 && class154.field2892 == 0 && class195.field3489 == 0 && class161.field3024 == 0) {
                                        class258.method1741(class68.field1330[var6 + 1], class68.field1330[var6], class68.field1330[var6 + 2], (byte) -115, class68.field1330[var6 + 3]);
                                    }
                                    continue;
                                }
                                if (var472 == 5604) {
                                    var7--;
                                    if (class84.field1634 == 10 && class7.field254 == 0 && class154.field2892 == 0 && class195.field3489 == 0 && class161.field3024 == 0) {
                                        class107.method764(0, class256.field4547[var7].method622(-2));
                                    }
                                    continue;
                                }
                                if (var472 == 5605) {
                                    var6 -= 4;
                                    var7 -= 2;
                                    if (class84.field1634 == 10 && class7.field254 == 0 && class154.field2892 == 0 && class195.field3489 == 0 && class161.field3024 == 0) {
                                        class3.method13(class256.field4547[var7].method622(-2), class68.field1330[var6 + 1], class256.field4547[var7 + 1], class68.field1330[var6 + 3], 46, class68.field1330[var6], class68.field1330[var6 + 2]);
                                    }
                                    continue;
                                }
                                if (var472 == 5606) {
                                    if (class195.field3489 == 0) {
                                        class153.field2890 = -2;
                                    }
                                    continue;
                                }
                                if (var472 == 5607) {
                                    class68.field1330[var6++] = class185.field3282;
                                    continue;
                                }
                                if (var472 == 5608) {
                                    class68.field1330[var6++] = class20.field533;
                                    continue;
                                }
                                if (var472 == 5609) {
                                    class68.field1330[var6++] = class153.field2890;
                                    continue;
                                }
                                if (var472 == 5610) {
                                    for (int var301 = 0; var301 < 5; var301++) {
                                        class256.field4547[var7++] = class75.field1498.length > var301 ? class75.field1498[var301].method608((byte) 77) : class61.field1206;
                                    }
                                    class75.field1498 = null;
                                    continue;
                                }
                                if (var472 == 5611) {
                                    class68.field1330[var6++] = class243.field4349;
                                    continue;
                                }
                            } else if (var472 < 6100) {
                                if (var472 == 6001) {
                                    var6--;
                                    int var275 = class68.field1330[var6];
                                    if (var275 < 1) {
                                        var275 = 1;
                                    }
                                    if (var275 > 4) {
                                        var275 = 4;
                                    }
                                    class21.field547 = var275;
                                    if (class21.field547 == 1) {
                                        class145.method1042(0.9F);
                                    }
                                    if (class21.field547 == 2) {
                                        class145.method1042(0.8F);
                                    }
                                    if (class21.field547 == 3) {
                                        class145.method1042(0.7F);
                                    }
                                    if (class21.field547 == 4) {
                                        class145.method1042(0.6F);
                                    }
                                    class125.method887((byte) -113);
                                    class3.method15(-99, class157.field2954);
                                    class111.field2129 = false;
                                    continue;
                                }
                                if (var472 == 6002) {
                                    var6--;
                                    class134.method965(true, class68.field1330[var6] == 1);
                                    class121.method853(-100);
                                    class237.method1635(-15);
                                    class100.method721(-126);
                                    class3.method15(-112, class157.field2954);
                                    class111.field2129 = false;
                                    continue;
                                }
                                if (var472 == 6003) {
                                    var6--;
                                    class79.field1555 = class68.field1330[var6] == 1;
                                    class100.method721(arg1 + 5991);
                                    class3.method15(99, class157.field2954);
                                    class111.field2129 = false;
                                    continue;
                                }
                                if (var472 == 6005) {
                                    var6--;
                                    class116.field2224 = class68.field1330[var6] == 1;
                                    class237.method1635(-9);
                                    class3.method15(-113, class157.field2954);
                                    class111.field2129 = false;
                                    continue;
                                }
                                if (var472 == 6006) {
                                    var6--;
                                    class202.field3655 = class68.field1330[var6] == 1;
                                    ((class201) class145.field2756).method1436((byte) 79, !class202.field3655);
                                    class3.method15(-84, class157.field2954);
                                    class111.field2129 = false;
                                    continue;
                                }
                                if (var472 == 6007) {
                                    var6--;
                                    class42.field936 = class68.field1330[var6] == 1;
                                    class3.method15(84, class157.field2954);
                                    class111.field2129 = false;
                                    continue;
                                }
                                if (var472 == 6008) {
                                    var6--;
                                    class4.field63 = class68.field1330[var6] == 1;
                                    class3.method15(-78, class157.field2954);
                                    class111.field2129 = false;
                                    continue;
                                }
                                if (var472 == 6009) {
                                    var6--;
                                    class107.field2061 = class68.field1330[var6] == 1;
                                    class3.method15(arg1 + 6232, class157.field2954);
                                    class111.field2129 = false;
                                    continue;
                                }
                                if (var472 == 6010) {
                                    var6--;
                                    class272.field4769 = class68.field1330[var6] == 1;
                                    class3.method15(-75, class157.field2954);
                                    class111.field2129 = false;
                                    continue;
                                }
                                if (var472 == 6011) {
                                    var6--;
                                    int var276 = class68.field1330[var6];
                                    if (var276 < 0 || var276 > 2) {
                                        var276 = 0;
                                    }
                                    class133.field2513 = var276;
                                    class3.method15(-113, class157.field2954);
                                    class111.field2129 = false;
                                    continue;
                                }
                                if (var472 == 6012) {
                                    var6--;
                                    class168.field3114 = class68.field1330[var6] == 1;
                                    if (class21.field547 == 1) {
                                        class145.method1042(0.9F);
                                    }
                                    if (class21.field547 == 2) {
                                        class145.method1042(0.8F);
                                    }
                                    if (class21.field547 == 3) {
                                        class145.method1042(0.7F);
                                    }
                                    if (class21.field547 == 4) {
                                        class145.method1042(0.6F);
                                    }
                                    class237.method1635(-92);
                                    class3.method15(-99, class157.field2954);
                                    class111.field2129 = false;
                                    continue;
                                }
                                if (var472 == 6014) {
                                    var6--;
                                    class161.field3029 = class68.field1330[var6] == 1;
                                    class3.method15(-115, class157.field2954);
                                    class111.field2129 = false;
                                    continue;
                                }
                                if (var472 == 6015) {
                                    var6--;
                                    class83.field1621 = class68.field1330[var6] == 1;
                                    class3.method15(81, class157.field2954);
                                    class111.field2129 = false;
                                    continue;
                                }
                                if (var472 == 6016) {
                                    var6--;
                                    int var277 = class68.field1330[var6];
                                    if (var277 < 0 || var277 > 2) {
                                        var277 = 0;
                                    }
                                    class64.field1257 = var277;
                                    class3.method15(arg1 ^ 0x1784, class157.field2954);
                                    class111.field2129 = false;
                                    continue;
                                }
                                if (var472 == 6017) {
                                    var6--;
                                    class31.field647 = class68.field1330[var6] == 1;
                                    class98.method711(2);
                                    class3.method15(114, class157.field2954);
                                    class111.field2129 = false;
                                    continue;
                                }
                                if (var472 == 6018) {
                                    var6--;
                                    int var278 = class68.field1330[var6];
                                    if (var278 < 0) {
                                        var278 = 0;
                                    }
                                    if (var278 > 127) {
                                        var278 = 127;
                                    }
                                    class264.field4672 = var278;
                                    class3.method15(-124, class157.field2954);
                                    class111.field2129 = false;
                                    continue;
                                }
                                if (var472 == 6019) {
                                    var6--;
                                    int var279 = class68.field1330[var6];
                                    if (var279 < 0) {
                                        var279 = 0;
                                    }
                                    if (var279 > 255) {
                                        var279 = 255;
                                    }
                                    if (class139.field2646 != var279) {
                                        if (class139.field2646 == 0 && class39.field909 != -1) {
                                            class108.method770(false, (byte) -82, class39.field909, class232.field4204, 0, var279);
                                            class91.field1854 = false;
                                        } else if (var279 == 0) {
                                            class136.method977((byte) -90);
                                            class91.field1854 = false;
                                        } else {
                                            class171.method1222((byte) -75, var279);
                                        }
                                        class139.field2646 = var279;
                                    }
                                    class3.method15(57, class157.field2954);
                                    class111.field2129 = false;
                                    continue;
                                }
                                if (var472 == 6020) {
                                    var6--;
                                    int var280 = class68.field1330[var6];
                                    if (var280 < 0) {
                                        var280 = 0;
                                    }
                                    if (var280 > 127) {
                                        var280 = 127;
                                    }
                                    class152.field2879 = var280;
                                    class3.method15(125, class157.field2954);
                                    class111.field2129 = false;
                                    continue;
                                }
                                if (var472 == 6021) {
                                    var6--;
                                    class238.field4285 = class68.field1330[var6] == 1;
                                    class100.method721(-126);
                                    continue;
                                }
                            } else if (var472 < 6200) {
                                if (var472 == 6101) {
                                    class68.field1330[var6++] = class21.field547;
                                    continue;
                                }
                                if (var472 == 6102) {
                                    class68.field1330[var6++] = class171.method1225(57) ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 6103) {
                                    class68.field1330[var6++] = class79.field1555 ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 6105) {
                                    class68.field1330[var6++] = class116.field2224 ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 6106) {
                                    class68.field1330[var6++] = class202.field3655 ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 6107) {
                                    class68.field1330[var6++] = class42.field936 ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 6108) {
                                    class68.field1330[var6++] = class4.field63 ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 6109) {
                                    class68.field1330[var6++] = class107.field2061 ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 6110) {
                                    class68.field1330[var6++] = class272.field4769 ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 6111) {
                                    class68.field1330[var6++] = class133.field2513;
                                    continue;
                                }
                                if (var472 == 6112) {
                                    class68.field1330[var6++] = class168.field3114 ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 6114) {
                                    class68.field1330[var6++] = class161.field3029 ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 6115) {
                                    class68.field1330[var6++] = class83.field1621 ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 6116) {
                                    class68.field1330[var6++] = class64.field1257;
                                    continue;
                                }
                                if (var472 == 6117) {
                                    class68.field1330[var6++] = class31.field647 ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 6118) {
                                    class68.field1330[var6++] = class264.field4672;
                                    continue;
                                }
                                if (var472 == 6119) {
                                    class68.field1330[var6++] = class139.field2646;
                                    continue;
                                }
                                if (var472 == 6120) {
                                    class68.field1330[var6++] = class152.field2879;
                                    continue;
                                }
                                if (var472 == 6121) {
                                    class68.field1330[var6++] = 0;
                                    continue;
                                }
                            } else if (var472 < 6300) {
                                if (var472 == 6200) {
                                    var6 -= 2;
                                    class76.field1518 = (short) class68.field1330[var6];
                                    if (class76.field1518 <= 0) {
                                        class76.field1518 = 256;
                                    }
                                    class244.field4364 = (short) class68.field1330[var6 + 1];
                                    if (class244.field4364 <= 0) {
                                        class244.field4364 = 205;
                                    }
                                    continue;
                                }
                                if (var472 == 6201) {
                                    var6 -= 2;
                                    class70.field1427 = (short) class68.field1330[var6];
                                    if (class70.field1427 <= 0) {
                                        class70.field1427 = 256;
                                    }
                                    class73.field1477 = (short) class68.field1330[var6 + 1];
                                    if (class73.field1477 <= 0) {
                                        class73.field1477 = 320;
                                    }
                                    continue;
                                }
                                if (var472 == 6202) {
                                    var6 -= 4;
                                    class189.field3342 = (short) class68.field1330[var6];
                                    if (class189.field3342 <= 0) {
                                        class189.field3342 = 1;
                                    }
                                    class53.field1088 = (short) class68.field1330[var6 + 1];
                                    if (class53.field1088 <= 0) {
                                        class53.field1088 = 32767;
                                    } else if (class53.field1088 < class189.field3342) {
                                        class53.field1088 = class189.field3342;
                                    }
                                    class68.field1332 = (short) class68.field1330[var6 + 2];
                                    if (class68.field1332 <= 0) {
                                        class68.field1332 = 1;
                                    }
                                    class207.field3761 = (short) class68.field1330[var6 + 3];
                                    if (class207.field3761 <= 0) {
                                        class207.field3761 = 32767;
                                    } else if (class207.field3761 < class68.field1332) {
                                        class207.field3761 = class68.field1332;
                                    }
                                    continue;
                                }
                                if (var472 == 6203) {
                                    class255.method1727(false, class91.field1855.field163, 0, class91.field1855.field131, 0, -125);
                                    class68.field1330[var6++] = class82.field1611;
                                    class68.field1330[var6++] = class115.field2194;
                                    continue;
                                }
                                if (var472 == 6204) {
                                    class68.field1330[var6++] = class70.field1427;
                                    class68.field1330[var6++] = class73.field1477;
                                    continue;
                                }
                                if (var472 == 6205) {
                                    class68.field1330[var6++] = class76.field1518;
                                    class68.field1330[var6++] = class244.field4364;
                                    continue;
                                }
                            } else if (var472 < 6400) {
                                if (var472 == 6300) {
                                    class68.field1330[var6++] = (int) (class253.method1711((byte) -64) / 60000L);
                                    continue;
                                }
                                if (var472 == 6301) {
                                    class68.field1330[var6++] = (int) (class253.method1711((byte) -69) / 86400000L) - 11745;
                                    continue;
                                }
                                if (var472 == 6302) {
                                    var6 -= 3;
                                    int var293 = class68.field1330[var6];
                                    int var294 = class68.field1330[var6 + 2];
                                    int var295 = class68.field1330[var6 + 1];
                                    class193.field3458.clear();
                                    class193.field3458.set(11, 12);
                                    class193.field3458.set(var294, var295, var293);
                                    class68.field1330[var6++] = (int) (class193.field3458.getTime().getTime() / 86400000L) - 11745;
                                    continue;
                                }
                                if (var472 == 6303) {
                                    class193.field3458.clear();
                                    class193.field3458.setTime(new Date(class253.method1711((byte) -105)));
                                    class68.field1330[var6++] = class193.field3458.get(1);
                                    continue;
                                }
                                if (var472 == 6304) {
                                    boolean var296 = true;
                                    var6--;
                                    int var297 = class68.field1330[var6];
                                    if (var297 < 0) {
                                        var296 = (var297 + 1) % 4 == 0;
                                    } else if (var297 < 1582) {
                                        var296 = var297 % 4 == 0;
                                    } else if (var297 % 4 != 0) {
                                        var296 = false;
                                    } else if ((var297 % 100) != 0) {
                                        var296 = true;
                                    } else if (var297 % 400 != 0) {
                                        var296 = false;
                                    }
                                    class68.field1330[var6++] = var296 ? 1 : 0;
                                    continue;
                                }
                            } else if (var472 < 6500) {
                                if (var472 == 6405) {
                                    class68.field1330[var6++] = class125.method889(96) ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 6406) {
                                    class68.field1330[var6++] = class185.method1273((byte) -10) ? 1 : 0;
                                    continue;
                                }
                            } else if (var472 < 6600) {
                                if (var472 == 6500) {
                                    if (class84.field1634 == 10 && class7.field254 == 0 && class154.field2892 == 0 && class195.field3489 == 0) {
                                        class68.field1330[var6++] = class150.method1064(0) ? 1 : 0;
                                        continue;
                                    }
                                    class68.field1330[var6++] = 1;
                                    continue;
                                }
                                if (var472 == 6501) {
                                    class239 var281 = class151.method1085(0);
                                    if (var281 == null) {
                                        class68.field1330[var6++] = -1;
                                        class68.field1330[var6++] = 0;
                                        class256.field4547[var7++] = class61.field1206;
                                        class68.field1330[var6++] = 0;
                                        class256.field4547[var7++] = class61.field1206;
                                        class68.field1330[var6++] = 0;
                                    } else {
                                        class68.field1330[var6++] = var281.field4307;
                                        class68.field1330[var6++] = var281.field1733;
                                        class256.field4547[var7++] = var281.field4303;
                                        class260 var282 = var281.method1646((byte) -19);
                                        class68.field1330[var6++] = var282.field4640;
                                        class256.field4547[var7++] = var282.field4641;
                                        class68.field1330[var6++] = var281.field1730;
                                    }
                                    continue;
                                }
                                if (var472 == 6502) {
                                    class239 var283 = class193.method1348(false);
                                    if (var283 == null) {
                                        class68.field1330[var6++] = -1;
                                        class68.field1330[var6++] = 0;
                                        class256.field4547[var7++] = class61.field1206;
                                        class68.field1330[var6++] = 0;
                                        class256.field4547[var7++] = class61.field1206;
                                        class68.field1330[var6++] = 0;
                                    } else {
                                        class68.field1330[var6++] = var283.field4307;
                                        class68.field1330[var6++] = var283.field1733;
                                        class256.field4547[var7++] = var283.field4303;
                                        class260 var284 = var283.method1646((byte) -19);
                                        class68.field1330[var6++] = var284.field4640;
                                        class256.field4547[var7++] = var284.field4641;
                                        class68.field1330[var6++] = var283.field1730;
                                    }
                                    continue;
                                }
                                if (var472 == 6503) {
                                    var6--;
                                    int var285 = class68.field1330[var6];
                                    if (class84.field1634 == 10 && class7.field254 == 0 && class154.field2892 == 0 && class195.field3489 == 0) {
                                        class68.field1330[var6++] = class188.method1291(29331, var285) ? 1 : 0;
                                        continue;
                                    }
                                    class68.field1330[var6++] = 0;
                                    continue;
                                }
                                if (var472 == 6504) {
                                    var6--;
                                    class194.field3481 = class68.field1330[var6];
                                    class3.method15(-74, class157.field2954);
                                    continue;
                                }
                                if (var472 == 6505) {
                                    class68.field1330[var6++] = class194.field3481;
                                    continue;
                                }
                                if (var472 == 6506) {
                                    var6--;
                                    int var286 = class68.field1330[var6];
                                    class239 var287 = class50.method383((byte) 124, var286);
                                    if (var287 == null) {
                                        class68.field1330[var6++] = -1;
                                        class256.field4547[var7++] = class61.field1206;
                                        class68.field1330[var6++] = 0;
                                        class256.field4547[var7++] = class61.field1206;
                                        class68.field1330[var6++] = 0;
                                    } else {
                                        class68.field1330[var6++] = var287.field1733;
                                        class256.field4547[var7++] = var287.field4303;
                                        class260 var288 = var287.method1646((byte) -19);
                                        class68.field1330[var6++] = var288.field4640;
                                        class256.field4547[var7++] = var288.field4641;
                                        class68.field1330[var6++] = var287.field1730;
                                    }
                                    continue;
                                }
                                if (var472 == 6507) {
                                    var6 -= 4;
                                    boolean var289 = class68.field1330[var6 + 1] == 1;
                                    int var290 = class68.field1330[var6 + 2];
                                    int var291 = class68.field1330[var6];
                                    boolean var292 = class68.field1330[var6 + 3] == 1;
                                    class78.method552(var290, (byte) -117, var291, var292, var289);
                                    continue;
                                }
                            }
                        } else if (var472 == 4400) {
                            var6 -= 2;
                            int var323 = class68.field1330[var6 + 1];
                            int var324 = class68.field1330[var6];
                            class105 var325 = class22.method162(true, var323);
                            if (var325.method754(arg1 ^ 0x1796)) {
                                class256.field4547[var7++] = class268.method1845(var324, (byte) -90).method839(var323, -15898, var325.field2007);
                            } else {
                                class68.field1330[var6++] = class268.method1845(var324, (byte) -128).method834(var323, var325.field2006, (byte) -58);
                            }
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var471) {
            if (var5.field3387 == null) {
                if (class220.field3961 != 0) {
                    class58.method423(class202.field3649, false, 0, class61.field1206);
                }
                class143.method1018(var471, "CS2 - scr:" + var5.field3759 + " op:" + var11, 88);
            } else {
                class86 var467 = class106.method758(30, 0);
                var467.method582(arg1 + 6117, class165.field3089).method582(-1, var5.field3387);
                for (int var468 = class114.field2169 - 1; var468 >= 0; var468--) {
                    var467.method582(-1, class272.field4774).method582(-1, class244.field4359[var468].field3285.field3387);
                }
                if (var11 == 40) {
                    int var469 = var10[var8];
                    var467.method582(-1, class13.field403).method582(-1, class4.method26(false, var469));
                }
                if (class220.field3961 != 0) {
                    class58.method423(class109.method783(arg1 ^ 0xFFFFE818, new class86[] { class124.field2417, var5.field3387 }), false, 0, class61.field1206);
                }
                class143.method1018(var471, "CS2 - scr:" + var5.field3759 + " op:" + var11 + new String(var467.method619((byte) 65)), arg1 ^ 0xFFFFE83B);
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "(I)I")
    private final int method797(int arg0) {
        int var2 = -32 % ((-arg0 - 63) / 42);
        field2147++;
        return this.field2165 == null ? 0 : this.field2165.length;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)I")
    private final int method798(int arg0, int arg1, int arg2) {
        field2156++;
        if (this.field2165 == null || arg1 < 0 || this.field2165.length < arg1) {
            return -1;
        } else {
            if (arg0 != -1) {
                this.method793(true, 124);
            }
            return this.field2153[arg1] == null || arg2 < 0 || arg2 > this.field2153[arg1].length ? -1 : this.field2153[arg1][arg2];
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lqk;I)Ljd;")
    public final class86 method799(class200 arg0, int arg1) {
        class86 var3 = class106.method758(80, arg1 ^ 0x1);
        field2164++;
        if (this.field2165 != null) {
            for (int var4 = 0; var4 < this.field2165.length; var4++) {
                var3.method582(arg1 ^ 0xFFFFFFFE, this.field2160[var4]);
                var3.method582(-1, class132.method943(this.field2165[var4], true, this.field2153[var4], arg0.method1395((byte) 101, class50.field1053[this.field2165[var4]])));
            }
        }
        var3.method582(-1, this.field2160[this.field2160.length - arg1]);
        return var3.method628(-2836);
    }

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "(I)Ljd;")
    private final class86 method800(int arg0) {
        field2155++;
        class86 var2 = class106.method758(80, arg0 - 1);
        if (this.field2160 == null) {
            return class109.field2085;
        }
        var2.method582(arg0 - 2, this.field2160[0]);
        for (int var3 = arg0; var3 < this.field2160.length; var3++) {
            var2.method582(-1, class132.field2498);
            var2.method582(-1, this.field2160[var3]);
        }
        return var2.method628(-2836);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IILqk;)V")
    private final void method801(int arg0, int arg1, class200 arg2) {
        int var4 = 26 % ((arg1 + 23) / 52);
        field2146++;
        if (arg0 == 1) {
            this.field2160 = arg2.method1376((byte) 24).method606(-3762, 60);
        } else if (arg0 == 2) {
            int var9 = arg2.method1408((byte) -94);
            this.field2158 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2158[var10] = arg2.method1410(-64);
            }
        } else if (arg0 == 3) {
            int var5 = arg2.method1408((byte) -118);
            this.field2153 = new int[var5][];
            this.field2165 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = arg2.method1410(-99);
                this.field2165[var6] = var7;
                this.field2153[var6] = new int[class5.field73[var7]];
                for (int var8 = 0; var8 < class5.field73[var7]; var8++) {
                    this.field2153[var6][var8] = arg2.method1410(-112);
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V")
    public static final void method802(byte arg0) {
        field2157++;
        if (class195.field3489 == 0) {
            return;
        }
        try {
            if ((++class138.field2633) > 2000) {
                if (class248.field4415 != null) {
                    class248.field4415.method207((byte) 101);
                    class248.field4415 = null;
                }
                if (class253.field4497 >= 1) {
                    class195.field3489 = 0;
                    class153.field2890 = -5;
                    return;
                }
                class138.field2633 = 0;
                if (class59.field1188 == class191.field3390) {
                    class191.field3390 = field2162;
                } else {
                    class191.field3390 = class59.field1188;
                }
                class195.field3489 = 1;
                class253.field4497++;
            }
            if (class195.field3489 == 1) {
                class183.field3266 = class157.field2954.method1715(class91.field1852, class191.field3390, true);
                class195.field3489 = 2;
            }
            if (arg0 >= 116) {
                if (class195.field3489 == 2) {
                    if (class183.field3266.field613 == 2) {
                        throw new IOException();
                    }
                    if (class183.field3266.field613 != 1) {
                        return;
                    }
                    class248.field4415 = new class31((Socket) class183.field3266.field611, class157.field2954);
                    class183.field3266 = null;
                    class248.field4415.method209(class36.field809.field3547, 4900, class36.field809.field3565, 0);
                    if (class25.field601 != null) {
                        class25.field601.method355((byte) 30);
                    }
                    if (class76.field1517 != null) {
                        class76.field1517.method355((byte) 34);
                    }
                    int var1 = class248.field4415.method204(-30290);
                    if (class25.field601 != null) {
                        class25.field601.method355((byte) 123);
                    }
                    if (class76.field1517 != null) {
                        class76.field1517.method355((byte) 114);
                    }
                    if (var1 != 21) {
                        class153.field2890 = var1;
                        class195.field3489 = 0;
                        class248.field4415.method207((byte) 107);
                        class248.field4415 = null;
                        return;
                    }
                    class195.field3489 = 3;
                }
                if (class195.field3489 == 3) {
                    if (class248.field4415.method208(-11084) < 1) {
                        return;
                    }
                    class75.field1498 = new class86[class248.field4415.method204(-30290)];
                    class195.field3489 = 4;
                }
                if (class195.field3489 == 4 && class248.field4415.method208(-11084) >= class75.field1498.length * 8) {
                    class168.field3102.field3565 = 0;
                    class248.field4415.method210(class168.field3102.field3547, (byte) 50, 0, class75.field1498.length * 8);
                    for (int var2 = 0; var2 < class75.field1498.length; var2++) {
                        class75.field1498[var2] = class202.method1440(class168.field3102.method1409(-122), (byte) 47);
                    }
                    class195.field3489 = 0;
                    class153.field2890 = 21;
                    class248.field4415.method207((byte) 120);
                    class248.field4415 = null;
                }
            }
        } catch (IOException var3) {
            if (class248.field4415 != null) {
                class248.field4415.method207((byte) 121);
                class248.field4415 = null;
            }
            if (class253.field4497 < 1) {
                if (class59.field1188 == class191.field3390) {
                    class191.field3390 = field2162;
                } else {
                    class191.field3390 = class59.field1188;
                }
                class138.field2633 = 0;
                class253.field4497++;
                class195.field3489 = 1;
            } else {
                class195.field3489 = 0;
                class153.field2890 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "(I)V")
    public final void method803(int arg0) {
        if (arg0 < 74) {
            field2149 = null;
        }
        if (this.field2158 != null) {
            for (int var2 = 0; var2 < this.field2158.length; var2++) {
                this.field2158[var2] = class49.method377(this.field2158[var2], 32768);
            }
        }
        field2148++;
    }

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "(I)V")
    public static void method804(int arg0) {
        field2149 = null;
        field2154 = null;
        field2159 = null;
        if (arg0 != 1802) {
            field2151 = -108;
        }
    }
}
