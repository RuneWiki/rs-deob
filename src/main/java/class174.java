import java.io.UnsupportedEncodingException;
import java.util.Date;
import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class174 extends class270 {

    @OriginalMember(owner = "client!e", name = "V", descriptor = "I")
    public static int field2804 = 0;

    @OriginalMember(owner = "client!e", name = "W", descriptor = "Lmh;")
    public static class62 field2805 = class201.method1405(true, "Lade)3)3)3");

    @OriginalMember(owner = "client!e", name = "Y", descriptor = "I")
    public static int field2807 = 1;

    @OriginalMember(owner = "client!e", name = "ab", descriptor = "Lmh;")
    public static class62 field2809 = class201.method1405(true, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!e", name = "S", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!e", name = "T", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!e", name = "U", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!e", name = "X", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!e", name = "Z", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZLei;I)V", line = 11)
    public static final void method1236(boolean arg0, class161 arg1, int arg2) {
        field2801++;
        Object[] var3 = arg1.field2598;
        int var4 = (Integer) var3[0];
        class64 var5 = class15.method56(var4, 0);
        if (var5 == null) {
            return;
        }
        if (!arg0) {
            method1236(false, (class161) null, 80);
        }
        class16.field143 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        byte var9 = -1;
        int[] var10 = var5.field968;
        int[] var11 = var5.field970;
        try {
            class32.field431 = new class62[var5.field972];
            int var12 = 0;
            class246.field4184 = new int[var5.field969];
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if ((var3[var14] instanceof Integer)) {
                    int var16 = (Integer) var3[var14];
                    if (var16 == -2147483647) {
                        var16 = arg1.field2603;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg1.field2606;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg1.field2597 == null ? -1 : arg1.field2597.field3142;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg1.field2595;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg1.field2597 == null ? -1 : arg1.field2597.field3104;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg1.field2611 == null ? -1 : arg1.field2611.field3142;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg1.field2611 == null ? -1 : arg1.field2611.field3104;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg1.field2605;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg1.field2594;
                    }
                    class246.field4184[var12++] = var16;
                } else if (var3[var14] instanceof class62) {
                    class62 var15 = (class62) var3[var14];
                    if (var15.method446((byte) 89, class64.field974)) {
                        var15 = arg1.field2596;
                    }
                    class32.field431[var13++] = var15;
                }
            }
            int var17 = 0;
            label3930: while (true) {
                var17++;
                if (arg2 < var17) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var474 = var11[var8];
                if (var474 < 100) {
                    if (var474 == 0) {
                        class185.field2960[var6++] = var10[var8];
                        continue;
                    }
                    if (var474 == 1) {
                        int var18 = var10[var8];
                        class185.field2960[var6++] = class222.field3877[var18];
                        continue;
                    }
                    if (var474 == 2) {
                        int var19 = var10[var8];
                        var6--;
                        class36.method236(var19, 79, class185.field2960[var6]);
                        continue;
                    }
                    if (var474 == 3) {
                        class104.field1705[var7++] = var5.field976[var8];
                        continue;
                    }
                    if (var474 == 6) {
                        var8 += var10[var8];
                        continue;
                    }
                    if (var474 == 7) {
                        var6 -= 2;
                        if (class185.field2960[var6 + 1] != class185.field2960[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var474 == 8) {
                        var6 -= 2;
                        if (class185.field2960[var6 + 1] == class185.field2960[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var474 == 9) {
                        var6 -= 2;
                        if (class185.field2960[var6 + 1] > class185.field2960[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var474 == 10) {
                        var6 -= 2;
                        if (class185.field2960[var6 + 1] < class185.field2960[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var474 == 21) {
                        if (class16.field143 == 0) {
                            return;
                        }
                        class60 var20 = class166.field2708[--class16.field143];
                        class246.field4184 = var20.field879;
                        class32.field431 = var20.field877;
                        var5 = var20.field873;
                        var10 = var5.field968;
                        var8 = var20.field875;
                        var11 = var5.field970;
                        continue;
                    }
                    if (var474 == 25) {
                        int var21 = var10[var8];
                        class185.field2960[var6++] = class103.method812(8, var21);
                        continue;
                    }
                    if (var474 == 27) {
                        int var22 = var10[var8];
                        var6--;
                        class258.method1795(11370, class185.field2960[var6], var22);
                        continue;
                    }
                    if (var474 == 31) {
                        var6 -= 2;
                        if (class185.field2960[var6 + 1] >= class185.field2960[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var474 == 32) {
                        var6 -= 2;
                        if (class185.field2960[var6] >= class185.field2960[var6 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var474 == 33) {
                        class185.field2960[var6++] = class246.field4184[var10[var8]];
                        continue;
                    }
                    int var10001;
                    if (var474 == 34) {
                        var10001 = var10[var8];
                        var6--;
                        class246.field4184[var10001] = class185.field2960[var6];
                        continue;
                    }
                    if (var474 == 35) {
                        class104.field1705[var7++] = class32.field431[var10[var8]];
                        continue;
                    }
                    if (var474 == 36) {
                        var10001 = var10[var8];
                        var7--;
                        class32.field431[var10001] = class104.field1705[var7];
                        continue;
                    }
                    if (var474 == 37) {
                        int var23 = var10[var8];
                        var7 -= var23;
                        class62 var24 = class16.method61(class104.field1705, var7, var23, (byte) -100);
                        class104.field1705[var7++] = var24;
                        continue;
                    }
                    if (var474 == 38) {
                        var6--;
                        continue;
                    }
                    if (var474 == 39) {
                        var7--;
                        continue;
                    }
                    if (var474 == 40) {
                        int var25 = var10[var8];
                        class64 var26 = class15.method56(var25, 0);
                        int[] var27 = new int[var26.field969];
                        class62[] var28 = new class62[var26.field972];
                        for (int var29 = 0; var29 < var26.field977; var29++) {
                            var27[var29] = class185.field2960[var6 + var29 - var26.field977];
                        }
                        for (int var30 = 0; var30 < var26.field966; var30++) {
                            var28[var30] = class104.field1705[var7 + var30 - var26.field966];
                        }
                        var6 -= var26.field977;
                        var7 -= var26.field966;
                        class60 var31 = new class60();
                        var31.field877 = class32.field431;
                        var31.field873 = var5;
                        var31.field879 = class246.field4184;
                        var31.field875 = var8;
                        if (class16.field143 >= class166.field2708.length) {
                            throw new RuntimeException();
                        }
                        var5 = var26;
                        var8 = -1;
                        class166.field2708[class16.field143++] = var31;
                        var10 = var26.field968;
                        class246.field4184 = var27;
                        class32.field431 = var28;
                        var11 = var26.field970;
                        continue;
                    }
                    if (var474 == 42) {
                        class185.field2960[var6++] = class194.field3264[var10[var8]];
                        continue;
                    }
                    if (var474 == 43) {
                        int var32 = var10[var8];
                        var6--;
                        class194.field3264[var32] = class185.field2960[var6];
                        class37.method253(var32, -116);
                        continue;
                    }
                    if (var474 == 44) {
                        int var33 = var10[var8] >> 16;
                        int var34 = var10[var8] & 0xFFFF;
                        var6--;
                        int var35 = class185.field2960[var6];
                        if (var35 >= 0 && var35 <= 5000) {
                            class19.field179[var33] = var35;
                            byte var36 = -1;
                            if (var34 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var37 >= var35) {
                                    continue label3930;
                                }
                                class232.field4004[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var474 == 45) {
                        int var38 = var10[var8];
                        var6--;
                        int var39 = class185.field2960[var6];
                        if (var39 >= 0 && class19.field179[var38] > var39) {
                            class185.field2960[var6++] = class232.field4004[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var474 == 46) {
                        int var40 = var10[var8];
                        var6 -= 2;
                        int var41 = class185.field2960[var6];
                        if (var41 >= 0 && var41 < class19.field179[var40]) {
                            class232.field4004[var40][var41] = class185.field2960[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var474 == 47) {
                        class62 var42 = class212.field3560[var10[var8]];
                        if (var42 == null) {
                            var42 = class306.field5261;
                        }
                        class104.field1705[var7++] = var42;
                        continue;
                    }
                    if (var474 == 48) {
                        int var43 = var10[var8];
                        var7--;
                        class212.field3560[var43] = class104.field1705[var7];
                        class136.method1032(var43, 116);
                        continue;
                    }
                    if (var474 == 51) {
                        class49 var44 = var5.field973[var10[var8]];
                        var6--;
                        class173 var45 = (class173) var44.method311((byte) 114, (long) class185.field2960[var6]);
                        if (var45 != null) {
                            var8 += var45.field2796;
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
                if (var474 < 300) {
                    if (var474 == 100) {
                        var6 -= 3;
                        int var47 = class185.field2960[var6 + 2];
                        int var48 = class185.field2960[var6];
                        int var49 = class185.field2960[var6 + 1];
                        if (var49 == 0) {
                            throw new RuntimeException();
                        }
                        class191 var50 = class1.method2(var48, (byte) -37);
                        if (var50.field3180 == null) {
                            var50.field3180 = new class191[var47 + 1];
                        }
                        if (var50.field3180.length <= var47) {
                            class191[] var51 = new class191[var47 + 1];
                            for (int var52 = 0; var52 < var50.field3180.length; var52++) {
                                var51[var52] = var50.field3180[var52];
                            }
                            var50.field3180 = var51;
                        }
                        if (var47 > 0 && var50.field3180[var47 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var47 - 1));
                        }
                        class191 var53 = new class191();
                        var53.field3104 = var47;
                        var53.field3068 = var49;
                        var53.field3074 = var53.field3142 = var50.field3142;
                        var53.field3209 = true;
                        var50.field3180[var47] = var53;
                        if (var46) {
                            class38.field599 = var53;
                        } else {
                            class282.field4814 = var53;
                        }
                        class250.method1744(var50, (byte) -54);
                        continue;
                    }
                    if (var474 == 101) {
                        class191 var54 = var46 ? class38.field599 : class282.field4814;
                        if (var54.field3104 == -1) {
                            if (!var46) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class191 var55 = class1.method2(var54.field3142, (byte) -37);
                        var55.field3180[var54.field3104] = null;
                        class250.method1744(var55, (byte) -43);
                        continue;
                    }
                    if (var474 == 102) {
                        var6--;
                        class191 var56 = class1.method2(class185.field2960[var6], (byte) -37);
                        var56.field3180 = null;
                        class250.method1744(var56, (byte) 92);
                        continue;
                    }
                    if (var474 == 200) {
                        var6 -= 2;
                        int var57 = class185.field2960[var6 + 1];
                        int var58 = class185.field2960[var6];
                        class191 var59 = class52.method331((byte) -101, var58, var57);
                        if (var59 != null && var57 != -1) {
                            class185.field2960[var6++] = 1;
                            if (var46) {
                                class38.field599 = var59;
                            } else {
                                class282.field4814 = var59;
                            }
                            continue;
                        }
                        class185.field2960[var6++] = 0;
                        continue;
                    }
                    if (var474 == 201) {
                        var6--;
                        int var60 = class185.field2960[var6];
                        class191 var61 = class1.method2(var60, (byte) -37);
                        if (var61 == null) {
                            class185.field2960[var6++] = 0;
                        } else {
                            class185.field2960[var6++] = 1;
                            if (var46) {
                                class38.field599 = var61;
                            } else {
                                class282.field4814 = var61;
                            }
                        }
                        continue;
                    }
                } else if (var474 < 500) {
                    if (var474 == 403) {
                        var6 -= 2;
                        int var62 = class185.field2960[var6];
                        if (var62 >= 7) {
                            var62 -= 7;
                        }
                        int var63 = class185.field2960[var6 + 1];
                        class268.field4551.field2448.method86(var63, var62, true);
                        continue;
                    }
                    if (var474 == 404) {
                        var6 -= 2;
                        int var64 = class185.field2960[var6];
                        int var65 = class185.field2960[var6 + 1];
                        class268.field4551.field2448.method93(var64, (byte) 117, var65);
                        continue;
                    }
                    if (var474 == 410) {
                        var6--;
                        boolean var66 = class185.field2960[var6] != 0;
                        class268.field4551.field2448.method87(var66, false);
                        continue;
                    }
                } else if (var474 >= 1000 && var474 < 1100 || var474 >= 2000 && var474 < 2100) {
                    class191 var67;
                    if (var474 < 2000) {
                        var67 = var46 ? class38.field599 : class282.field4814;
                    } else {
                        var6--;
                        var67 = class1.method2(class185.field2960[var6], (byte) -37);
                        var474 -= 1000;
                    }
                    if (var474 == 1000) {
                        var6 -= 4;
                        var67.field3049 = class185.field2960[var6];
                        var67.field3124 = class185.field2960[var6 + 1];
                        int var68 = class185.field2960[var6 + 2];
                        if (var68 < 0) {
                            var68 = 0;
                        } else if (var68 > 5) {
                            var68 = 5;
                        }
                        int var69 = class185.field2960[var6 + 3];
                        if (var69 < 0) {
                            var69 = 0;
                        } else if (var69 > 5) {
                            var69 = 5;
                        }
                        var67.field3077 = (byte) var69;
                        var67.field3072 = (byte) var68;
                        class250.method1744(var67, (byte) -56);
                        class287.method1966(128, var67);
                        if (var67.field3104 == -1) {
                            class97.method781((byte) -58, var67.field3142);
                        }
                        continue;
                    }
                    if (var474 == 1001) {
                        var6 -= 4;
                        var67.field3163 = class185.field2960[var6];
                        var67.field3128 = class185.field2960[var6 + 1];
                        var67.field3051 = 0;
                        var67.field3202 = 0;
                        int var70 = class185.field2960[var6 + 3];
                        if (var70 < 0) {
                            var70 = 0;
                        } else if (var70 > 4) {
                            var70 = 4;
                        }
                        int var71 = class185.field2960[var6 + 2];
                        var67.field3046 = (byte) var70;
                        if (var71 < 0) {
                            var71 = 0;
                        } else if (var71 > 4) {
                            var71 = 4;
                        }
                        var67.field3062 = (byte) var71;
                        class250.method1744(var67, (byte) 111);
                        class287.method1966(128, var67);
                        if (var67.field3068 == 0) {
                            class192.method1347(-1908822544, false, var67);
                        }
                        continue;
                    }
                    if (var474 == 1003) {
                        var6--;
                        boolean var72 = class185.field2960[var6] == 1;
                        if (var67.field3116 != var72) {
                            var67.field3116 = var72;
                            class250.method1744(var67, (byte) -73);
                        }
                        if (var67.field3104 == -1) {
                            class57.method373(var67.field3142, (byte) -54);
                        }
                        continue;
                    }
                    if (var474 == 1004) {
                        var6 -= 2;
                        var67.field3144 = class185.field2960[var6];
                        var67.field3181 = class185.field2960[var6 + 1];
                        class250.method1744(var67, (byte) 85);
                        class287.method1966(128, var67);
                        if (var67.field3068 == 0) {
                            class192.method1347(-1908822544, false, var67);
                        }
                        continue;
                    }
                } else if (!(var474 < 1100 || var474 >= 1200) || !(var474 < 2100 || var474 >= 2200)) {
                    class191 var464;
                    if (var474 >= 2000) {
                        var6--;
                        var464 = class1.method2(class185.field2960[var6], (byte) -37);
                        var474 -= 1000;
                    } else {
                        var464 = var46 ? class38.field599 : class282.field4814;
                    }
                    if (var474 == 1100) {
                        var6 -= 2;
                        var464.field3073 = class185.field2960[var6];
                        if (var464.field3073 > var464.field3149 - var464.field3190) {
                            var464.field3073 = var464.field3149 - var464.field3190;
                        }
                        if (var464.field3073 < 0) {
                            var464.field3073 = 0;
                        }
                        var464.field3188 = class185.field2960[var6 + 1];
                        if (var464.field3188 > (var464.field3067 - var464.field3126)) {
                            var464.field3188 = var464.field3067 - var464.field3126;
                        }
                        if (var464.field3188 < 0) {
                            var464.field3188 = 0;
                        }
                        class250.method1744(var464, (byte) -43);
                        if (var464.field3104 == -1) {
                            class56.method363(var464.field3142, -121);
                        }
                        continue;
                    }
                    if (var474 == 1101) {
                        var6--;
                        var464.field3174 = class185.field2960[var6];
                        class250.method1744(var464, (byte) -125);
                        if (var464.field3104 == -1) {
                            class19.method80((byte) 58, var464.field3142);
                        }
                        continue;
                    }
                    if (var474 == 1102) {
                        var6--;
                        var464.field3187 = class185.field2960[var6] == 1;
                        class250.method1744(var464, (byte) 90);
                        continue;
                    }
                    if (var474 == 1103) {
                        var6--;
                        var464.field3172 = class185.field2960[var6];
                        class250.method1744(var464, (byte) 110);
                        continue;
                    }
                    if (var474 == 1104) {
                        var6--;
                        var464.field3206 = class185.field2960[var6];
                        class250.method1744(var464, (byte) -85);
                        continue;
                    }
                    if (var474 == 1105) {
                        var6--;
                        var464.field3166 = class185.field2960[var6];
                        class250.method1744(var464, (byte) 86);
                        continue;
                    }
                    if (var474 == 1106) {
                        var6--;
                        var464.field3095 = class185.field2960[var6];
                        class250.method1744(var464, (byte) 82);
                        continue;
                    }
                    if (var474 == 1107) {
                        var6--;
                        var464.field3135 = class185.field2960[var6] == 1;
                        class250.method1744(var464, (byte) -53);
                        continue;
                    }
                    if (var474 == 1108) {
                        var464.field3105 = 1;
                        var6--;
                        var464.field3141 = class185.field2960[var6];
                        class250.method1744(var464, (byte) -94);
                        if (var464.field3104 == -1) {
                            class101.method804(-128, var464.field3142);
                        }
                        continue;
                    }
                    if (var474 == 1109) {
                        var6 -= 6;
                        var464.field3158 = class185.field2960[var6];
                        var464.field3090 = class185.field2960[var6 + 1];
                        var464.field3182 = class185.field2960[var6 + 2];
                        var464.field3192 = class185.field2960[var6 + 3];
                        var464.field3125 = class185.field2960[var6 + 4];
                        var464.field3118 = class185.field2960[var6 + 5];
                        class250.method1744(var464, (byte) 126);
                        if (var464.field3104 == -1) {
                            class192.method1346(var464.field3142, !arg0);
                            class26.method144(var464.field3142, 3);
                        }
                        continue;
                    }
                    if (var474 == 1110) {
                        var6--;
                        int var465 = class185.field2960[var6];
                        if (var464.field3177 != var465) {
                            var464.field3160 = 0;
                            var464.field3177 = var465;
                            var464.field3086 = 0;
                            class250.method1744(var464, (byte) 119);
                        }
                        if (var464.field3104 == -1) {
                            class284.method1930((byte) -127, var464.field3142);
                        }
                        continue;
                    }
                    if (var474 == 1111) {
                        var6--;
                        var464.field3113 = class185.field2960[var6] == 1;
                        class250.method1744(var464, (byte) -122);
                        continue;
                    }
                    if (var474 == 1112) {
                        var7--;
                        class62 var466 = class104.field1705[var7];
                        if (!var466.method446((byte) 86, var464.field3199)) {
                            var464.field3199 = var466;
                            class250.method1744(var464, (byte) -109);
                        }
                        if (var464.field3104 == -1) {
                            class212.method1478(106, var464.field3142);
                        }
                        continue;
                    }
                    if (var474 == 1113) {
                        var6--;
                        var464.field3198 = class185.field2960[var6];
                        class250.method1744(var464, (byte) -73);
                        continue;
                    }
                    if (var474 == 1114) {
                        var6 -= 3;
                        var464.field3164 = class185.field2960[var6];
                        var464.field3079 = class185.field2960[var6 + 1];
                        var464.field3048 = class185.field2960[var6 + 2];
                        class250.method1744(var464, (byte) -114);
                        continue;
                    }
                    if (var474 == 1115) {
                        var6--;
                        var464.field3165 = class185.field2960[var6] == 1;
                        class250.method1744(var464, (byte) 107);
                        continue;
                    }
                    if (var474 == 1116) {
                        var6--;
                        var464.field3108 = class185.field2960[var6];
                        class250.method1744(var464, (byte) -47);
                        continue;
                    }
                    if (var474 == 1117) {
                        var6--;
                        var464.field3100 = class185.field2960[var6];
                        class250.method1744(var464, (byte) -120);
                        continue;
                    }
                    if (var474 == 1118) {
                        var6--;
                        var464.field3115 = class185.field2960[var6] == 1;
                        class250.method1744(var464, (byte) 86);
                        continue;
                    }
                    if (var474 == 1119) {
                        var6--;
                        var464.field3153 = class185.field2960[var6] == 1;
                        class250.method1744(var464, (byte) -62);
                        continue;
                    }
                    if (var474 == 1120) {
                        var6 -= 2;
                        var464.field3149 = class185.field2960[var6];
                        var464.field3067 = class185.field2960[var6 + 1];
                        class250.method1744(var464, (byte) 82);
                        if (var464.field3068 == 0) {
                            class192.method1347(-1908822544, false, var464);
                        }
                        continue;
                    }
                    if (var474 == 1121) {
                        var6 -= 2;
                        var464.field3047 = (short) class185.field2960[var6];
                        var464.field3210 = (short) class185.field2960[var6 + 1];
                        class250.method1744(var464, (byte) -111);
                        continue;
                    }
                    if (var474 == 1122) {
                        var6--;
                        var464.field3186 = class185.field2960[var6] == 1;
                        class250.method1744(var464, (byte) 118);
                        continue;
                    }
                } else if (var474 >= 1200 && var474 < 1300 || var474 >= 2200 && var474 < 2300) {
                    class191 var73;
                    if (var474 < 2000) {
                        var73 = var46 ? class38.field599 : class282.field4814;
                    } else {
                        var474 -= 1000;
                        var6--;
                        var73 = class1.method2(class185.field2960[var6], (byte) -37);
                    }
                    class250.method1744(var73, (byte) 93);
                    if (var474 == 1200 || var474 == 1205) {
                        var6 -= 2;
                        int var74 = class185.field2960[var6];
                        int var75 = class185.field2960[var6 + 1];
                        if (var73.field3104 == -1) {
                            class80.method617(23564, var73.field3142);
                            class192.method1346(var73.field3142, false);
                            class26.method144(var73.field3142, 3);
                        }
                        if (var74 == -1) {
                            var73.field3105 = 1;
                            var73.field3159 = -1;
                            var73.field3141 = -1;
                        } else {
                            var73.field3171 = var75;
                            var73.field3159 = var74;
                            class37 var76 = class189.method1320(0, var74);
                            var73.field3118 = var76.field544;
                            var73.field3182 = var76.field545;
                            var73.field3158 = var76.field516;
                            if (var474 == 1205) {
                                var73.field3066 = false;
                            } else {
                                var73.field3066 = true;
                            }
                            if (var73.field3202 > 0) {
                                var73.field3118 = var73.field3118 * 32 / var73.field3202;
                            } else if (var73.field3163 > 0) {
                                var73.field3118 = var73.field3118 * 32 / var73.field3163;
                            }
                            var73.field3192 = var76.field504;
                            var73.field3125 = var76.field559;
                            var73.field3090 = var76.field525;
                        }
                        continue;
                    }
                    if (var474 == 1201) {
                        var73.field3105 = 2;
                        var6--;
                        var73.field3141 = class185.field2960[var6];
                        if (var73.field3104 == -1) {
                            class101.method804(0, var73.field3142);
                        }
                        continue;
                    }
                    if (var474 == 1202) {
                        var73.field3105 = 3;
                        var73.field3141 = class268.field4551.field2448.method89((byte) 28);
                        if (var73.field3104 == -1) {
                            class101.method804(-124, var73.field3142);
                        }
                        continue;
                    }
                    if (var474 == 1203) {
                        var73.field3105 = 6;
                        var6--;
                        var73.field3141 = class185.field2960[var6];
                        if (var73.field3104 == -1) {
                            class101.method804(-126, var73.field3142);
                        }
                        continue;
                    }
                    if (var474 == 1204) {
                        var73.field3105 = 5;
                        var6--;
                        var73.field3141 = class185.field2960[var6];
                        if (var73.field3104 == -1) {
                            class101.method804(78, var73.field3142);
                        }
                        continue;
                    }
                } else if (var474 >= 1300 && var474 < 1400 || var474 >= 2300 && var474 < 2400) {
                    class191 var460;
                    if (var474 < 2000) {
                        var460 = var46 ? class38.field599 : class282.field4814;
                    } else {
                        var474 -= 1000;
                        var6--;
                        var460 = class1.method2(class185.field2960[var6], (byte) -37);
                    }
                    if (var474 == 1300) {
                        var6--;
                        int var461 = class185.field2960[var6] - 1;
                        if (var461 >= 0 && var461 <= 9) {
                            var7--;
                            var460.method1341(-1, class104.field1705[var7], var461);
                            continue;
                        }
                        var7--;
                        continue;
                    }
                    if (var474 == 1301) {
                        var6 -= 2;
                        int var462 = class185.field2960[var6 + 1];
                        int var463 = class185.field2960[var6];
                        var460.field3133 = class52.method331((byte) -101, var463, var462);
                        continue;
                    }
                    if (var474 == 1302) {
                        var6--;
                        var460.field3129 = class185.field2960[var6] == 1;
                        continue;
                    }
                    if (var474 == 1303) {
                        var6--;
                        var460.field3184 = class185.field2960[var6];
                        continue;
                    }
                    if (var474 == 1304) {
                        var6--;
                        var460.field3081 = class185.field2960[var6];
                        continue;
                    }
                    if (var474 == 1305) {
                        var7--;
                        var460.field3080 = class104.field1705[var7];
                        continue;
                    }
                    if (var474 == 1306) {
                        var7--;
                        var460.field3082 = class104.field1705[var7];
                        continue;
                    }
                    if (var474 == 1307) {
                        var460.field3134 = null;
                        continue;
                    }
                } else {
                    if (var474 >= 1400 && var474 < 1500 || var474 >= 2400 && var474 < 2500) {
                        class191 var453;
                        if (var474 >= 2000) {
                            var474 -= 1000;
                            var6--;
                            var453 = class1.method2(class185.field2960[var6], (byte) -37);
                        } else {
                            var453 = var46 ? class38.field599 : class282.field4814;
                        }
                        var7--;
                        class62 var454 = class104.field1705[var7];
                        int[] var455 = null;
                        if (var454.method439(117) > 0 && var454.method456(var454.method439(105) - 1, 31846) == 89) {
                            var6--;
                            int var456 = class185.field2960[var6];
                            if (var456 > 0) {
                                var455 = new int[var456];
                                while (var456-- > 0) {
                                    var6--;
                                    var455[var456] = class185.field2960[var6];
                                }
                            }
                            var454 = var454.method429(var454.method439(0) - 1, 0, true);
                        }
                        Object[] var457 = new Object[var454.method439(103) + 1];
                        for (int var458 = var457.length - 1; var458 >= 1; var458--) {
                            if (var454.method456(var458 - 1, 31846) == 115) {
                                var7--;
                                var457[var458] = class104.field1705[var7];
                            } else {
                                var6--;
                                var457[var458] = Integer.valueOf(class185.field2960[var6]);
                            }
                        }
                        var6--;
                        int var459 = class185.field2960[var6];
                        if (var459 == -1) {
                            var457 = null;
                        } else {
                            var457[0] = Integer.valueOf(var459);
                        }
                        if (var474 == 1400) {
                            var453.field3151 = var457;
                        } else if (var474 == 1401) {
                            var453.field3132 = var457;
                        } else if (var474 == 1402) {
                            var453.field3114 = var457;
                        } else if (var474 == 1403) {
                            var453.field3195 = var457;
                        } else if (var474 == 1404) {
                            var453.field3060 = var457;
                        } else if (var474 == 1405) {
                            var453.field3096 = var457;
                        } else if (var474 == 1406) {
                            var453.field3212 = var457;
                        } else if (var474 == 1407) {
                            var453.field3162 = var457;
                            var453.field3097 = var455;
                        } else if (var474 == 1408) {
                            var453.field3203 = var457;
                        } else if (var474 == 1409) {
                            var453.field3092 = var457;
                        } else if (var474 == 1410) {
                            var453.field3088 = var457;
                        } else if (var474 == 1411) {
                            var453.field3063 = var457;
                        } else if (var474 == 1412) {
                            var453.field3087 = var457;
                        } else if (var474 == 1414) {
                            var453.field3052 = var455;
                            var453.field3055 = var457;
                        } else if (var474 == 1415) {
                            var453.field3045 = var455;
                            var453.field3161 = var457;
                        } else if (var474 == 1416) {
                            var453.field3053 = var457;
                        } else if (var474 == 1417) {
                            var453.field3084 = var457;
                        } else if (var474 == 1418) {
                            var453.field3111 = var457;
                        } else if (var474 == 1419) {
                            var453.field3147 = var457;
                        } else if (var474 == 1420) {
                            var453.field3112 = var457;
                        } else if (var474 == 1421) {
                            var453.field3154 = var457;
                        } else if (var474 == 1422) {
                            var453.field3148 = var457;
                        } else if (var474 == 1423) {
                            var453.field3138 = var457;
                        } else if (var474 == 1424) {
                            var453.field3157 = var457;
                        } else if (var474 == 1425) {
                            var453.field3208 = var457;
                        } else if (var474 == 1426) {
                            var453.field3136 = var457;
                        } else if (var474 == 1427) {
                            var453.field3117 = var457;
                        } else if (var474 == 1428) {
                            var453.field3054 = var457;
                            var453.field3102 = var455;
                        } else if (var474 == 1429) {
                            var453.field3205 = var455;
                            var453.field3078 = var457;
                        }
                        var453.field3069 = true;
                        continue;
                    }
                    if (var474 < 1600) {
                        class191 var452 = var46 ? class38.field599 : class282.field4814;
                        if (var474 == 1500) {
                            class185.field2960[var6++] = var452.field3152;
                            continue;
                        }
                        if (var474 == 1501) {
                            class185.field2960[var6++] = var452.field3098;
                            continue;
                        }
                        if (var474 == 1502) {
                            class185.field2960[var6++] = var452.field3190;
                            continue;
                        }
                        if (var474 == 1503) {
                            class185.field2960[var6++] = var452.field3126;
                            continue;
                        }
                        if (var474 == 1504) {
                            class185.field2960[var6++] = var452.field3116 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 1505) {
                            class185.field2960[var6++] = var452.field3074;
                            continue;
                        }
                    } else if (var474 < 1700) {
                        class191 var77 = var46 ? class38.field599 : class282.field4814;
                        if (var474 == 1600) {
                            class185.field2960[var6++] = var77.field3073;
                            continue;
                        }
                        if (var474 == 1601) {
                            class185.field2960[var6++] = var77.field3188;
                            continue;
                        }
                        if (var474 == 1602) {
                            class104.field1705[var7++] = var77.field3199;
                            continue;
                        }
                        if (var474 == 1603) {
                            class185.field2960[var6++] = var77.field3149;
                            continue;
                        }
                        if (var474 == 1604) {
                            class185.field2960[var6++] = var77.field3067;
                            continue;
                        }
                        if (var474 == 1605) {
                            class185.field2960[var6++] = var77.field3118;
                            continue;
                        }
                        if (var474 == 1606) {
                            class185.field2960[var6++] = var77.field3182;
                            continue;
                        }
                        if (var474 == 1607) {
                            class185.field2960[var6++] = var77.field3125;
                            continue;
                        }
                        if (var474 == 1608) {
                            class185.field2960[var6++] = var77.field3192;
                            continue;
                        }
                        if (var474 == 1609) {
                            class185.field2960[var6++] = var77.field3172;
                            continue;
                        }
                    } else if (var474 < 1800) {
                        class191 var78 = var46 ? class38.field599 : class282.field4814;
                        if (var474 == 1700) {
                            class185.field2960[var6++] = var78.field3159;
                            continue;
                        }
                        if (var474 == 1701) {
                            if (var78.field3159 == -1) {
                                class185.field2960[var6++] = 0;
                            } else {
                                class185.field2960[var6++] = var78.field3171;
                            }
                            continue;
                        }
                        if (var474 == 1702) {
                            class185.field2960[var6++] = var78.field3104;
                            continue;
                        }
                    } else if (var474 < 1900) {
                        class191 var79 = var46 ? class38.field599 : class282.field4814;
                        if (var474 == 1800) {
                            class185.field2960[var6++] = class161.method1170(client.method2058(var79), -21132);
                            continue;
                        }
                        if (var474 == 1801) {
                            var6--;
                            int var80 = class185.field2960[var6];
                            int var475 = var80 - 1;
                            if (var79.field3134 != null && var475 < var79.field3134.length && var79.field3134[var475] != null) {
                                class104.field1705[var7++] = var79.field3134[var475];
                                continue;
                            }
                            class104.field1705[var7++] = class71.field1086;
                            continue;
                        }
                        if (var474 == 1802) {
                            if (var79.field3080 == null) {
                                class104.field1705[var7++] = class71.field1086;
                            } else {
                                class104.field1705[var7++] = var79.field3080;
                            }
                            continue;
                        }
                    } else if (var474 < 2600) {
                        var6--;
                        class191 var81 = class1.method2(class185.field2960[var6], (byte) -37);
                        if (var474 == 2500) {
                            class185.field2960[var6++] = var81.field3152;
                            continue;
                        }
                        if (var474 == 2501) {
                            class185.field2960[var6++] = var81.field3098;
                            continue;
                        }
                        if (var474 == 2502) {
                            class185.field2960[var6++] = var81.field3190;
                            continue;
                        }
                        if (var474 == 2503) {
                            class185.field2960[var6++] = var81.field3126;
                            continue;
                        }
                        if (var474 == 2504) {
                            class185.field2960[var6++] = var81.field3116 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 2505) {
                            class185.field2960[var6++] = var81.field3074;
                            continue;
                        }
                    } else if (var474 < 2700) {
                        var6--;
                        class191 var82 = class1.method2(class185.field2960[var6], (byte) -37);
                        if (var474 == 2600) {
                            class185.field2960[var6++] = var82.field3073;
                            continue;
                        }
                        if (var474 == 2601) {
                            class185.field2960[var6++] = var82.field3188;
                            continue;
                        }
                        if (var474 == 2602) {
                            class104.field1705[var7++] = var82.field3199;
                            continue;
                        }
                        if (var474 == 2603) {
                            class185.field2960[var6++] = var82.field3149;
                            continue;
                        }
                        if (var474 == 2604) {
                            class185.field2960[var6++] = var82.field3067;
                            continue;
                        }
                        if (var474 == 2605) {
                            class185.field2960[var6++] = var82.field3118;
                            continue;
                        }
                        if (var474 == 2606) {
                            class185.field2960[var6++] = var82.field3182;
                            continue;
                        }
                        if (var474 == 2607) {
                            class185.field2960[var6++] = var82.field3125;
                            continue;
                        }
                        if (var474 == 2608) {
                            class185.field2960[var6++] = var82.field3192;
                            continue;
                        }
                        if (var474 == 2609) {
                            class185.field2960[var6++] = var82.field3172;
                            continue;
                        }
                    } else if (var474 < 2800) {
                        if (var474 == 2700) {
                            var6--;
                            class191 var442 = class1.method2(class185.field2960[var6], (byte) -37);
                            class185.field2960[var6++] = var442.field3159;
                            continue;
                        }
                        if (var474 == 2701) {
                            var6--;
                            class191 var443 = class1.method2(class185.field2960[var6], (byte) -37);
                            if (var443.field3159 == -1) {
                                class185.field2960[var6++] = 0;
                            } else {
                                class185.field2960[var6++] = var443.field3171;
                            }
                            continue;
                        }
                        if (var474 == 2702) {
                            var6--;
                            int var444 = class185.field2960[var6];
                            class146 var445 = (class146) class214.field3632.method311((byte) 114, (long) var444);
                            if (var445 == null) {
                                class185.field2960[var6++] = 0;
                            } else {
                                class185.field2960[var6++] = 1;
                            }
                            continue;
                        }
                        if (var474 == 2703) {
                            var6--;
                            class191 var446 = class1.method2(class185.field2960[var6], (byte) -37);
                            if (var446.field3180 == null) {
                                class185.field2960[var6++] = 0;
                                continue;
                            }
                            int var447 = var446.field3180.length;
                            for (int var448 = 0; var448 < var446.field3180.length; var448++) {
                                if (var446.field3180[var448] == null) {
                                    var447 = var448;
                                    break;
                                }
                            }
                            class185.field2960[var6++] = var447;
                            continue;
                        }
                        if (var474 == 2704 || var474 == 2705) {
                            var6 -= 2;
                            int var449 = class185.field2960[var6];
                            int var450 = class185.field2960[var6 + 1];
                            class146 var451 = (class146) class214.field3632.method311((byte) 114, (long) var449);
                            if (var451 != null && var451.field2312 == var450) {
                                class185.field2960[var6++] = 1;
                                continue;
                            }
                            class185.field2960[var6++] = 0;
                            continue;
                        }
                    } else if (var474 < 2900) {
                        var6--;
                        class191 var440 = class1.method2(class185.field2960[var6], (byte) -37);
                        if (var474 == 2800) {
                            class185.field2960[var6++] = class161.method1170(client.method2058(var440), -21132);
                            continue;
                        }
                        if (var474 == 2801) {
                            var6--;
                            int var441 = class185.field2960[var6];
                            int var476 = var441 - 1;
                            if (var440.field3134 != null && var476 < var440.field3134.length && var440.field3134[var476] != null) {
                                class104.field1705[var7++] = var440.field3134[var476];
                                continue;
                            }
                            class104.field1705[var7++] = class71.field1086;
                            continue;
                        }
                        if (var474 == 2802) {
                            if (var440.field3080 == null) {
                                class104.field1705[var7++] = class71.field1086;
                            } else {
                                class104.field1705[var7++] = var440.field3080;
                            }
                            continue;
                        }
                    } else if (var474 < 3200) {
                        if (var474 == 3100) {
                            var7--;
                            class62 var83 = class104.field1705[var7];
                            class116.method901(0, class71.field1086, var83, (byte) 50);
                            continue;
                        }
                        if (var474 == 3101) {
                            var6 -= 2;
                            class124.method942(117, class185.field2960[var6 + 1], class268.field4551, class185.field2960[var6]);
                            continue;
                        }
                        if (var474 == 3103) {
                            class287.method1965(0);
                            continue;
                        }
                        if (var474 == 3104) {
                            var7--;
                            class62 var84 = class104.field1705[var7];
                            class195.field3300++;
                            int var85 = 0;
                            if (var84.method447((byte) -59)) {
                                var85 = var84.method431(64);
                            }
                            class170.field2772.method1693(244, false);
                            class170.field2772.method712(var85, 17);
                            continue;
                        }
                        if (var474 == 3105) {
                            class194.field3263++;
                            var7--;
                            class62 var86 = class104.field1705[var7];
                            class170.field2772.method1693(150, false);
                            class170.field2772.method694(var86.method451(81), (byte) -34);
                            continue;
                        }
                        if (var474 == 3106) {
                            class203.field3428++;
                            var7--;
                            class62 var87 = class104.field1705[var7];
                            class170.field2772.method1693(191, false);
                            class170.field2772.method717(1, var87.method439(-54) + 1);
                            class170.field2772.method710(var87, !arg0);
                            continue;
                        }
                        if (var474 == 3107) {
                            var6--;
                            int var88 = class185.field2960[var6];
                            var7--;
                            class62 var89 = class104.field1705[var7];
                            class153.method1102(0, var89, var88);
                            continue;
                        }
                        if (var474 == 3108) {
                            var6 -= 3;
                            int var90 = class185.field2960[var6 + 1];
                            int var91 = class185.field2960[var6 + 2];
                            int var92 = class185.field2960[var6];
                            class191 var93 = class1.method2(var91, (byte) -37);
                            class222.method1578(var90, var92, var93, 32);
                            continue;
                        }
                        if (var474 == 3109) {
                            var6 -= 2;
                            int var94 = class185.field2960[var6];
                            int var95 = class185.field2960[var6 + 1];
                            class191 var96 = var46 ? class38.field599 : class282.field4814;
                            class222.method1578(var95, var94, var96, 32);
                            continue;
                        }
                        if (var474 == 3110) {
                            class5.field54++;
                            var6--;
                            int var97 = class185.field2960[var6];
                            class170.field2772.method1693(224, false);
                            class170.field2772.method738((byte) -104, var97);
                            continue;
                        }
                    } else if (var474 < 3300) {
                        if (var474 == 3200) {
                            var6 -= 3;
                            class281.method1919(class185.field2960[var6 + 1], class185.field2960[var6 + 2], -26080, class185.field2960[var6]);
                            continue;
                        }
                        if (var474 == 3201) {
                            var6--;
                            class64.method462((byte) -110, class185.field2960[var6]);
                            continue;
                        }
                        if (var474 == 3202) {
                            var6 -= 2;
                            class192.method1349(class185.field2960[var6], -109, class185.field2960[var6 + 1]);
                            continue;
                        }
                    } else if (var474 < 3400) {
                        if (var474 == 3300) {
                            class185.field2960[var6++] = class199.field3367;
                            continue;
                        }
                        if (var474 == 3301) {
                            var6 -= 2;
                            int var413 = class185.field2960[var6 + 1];
                            int var414 = class185.field2960[var6];
                            class185.field2960[var6++] = class102.method808(var413, arg0, var414);
                            continue;
                        }
                        if (var474 == 3302) {
                            var6 -= 2;
                            int var415 = class185.field2960[var6];
                            int var416 = class185.field2960[var6 + 1];
                            class185.field2960[var6++] = class207.method1453(var416, var415, 20258);
                            continue;
                        }
                        if (var474 == 3303) {
                            var6 -= 2;
                            int var417 = class185.field2960[var6];
                            int var418 = class185.field2960[var6 + 1];
                            class185.field2960[var6++] = class20.method92(var418, (byte) 64, var417);
                            continue;
                        }
                        if (var474 == 3304) {
                            var6--;
                            int var419 = class185.field2960[var6];
                            class185.field2960[var6++] = class189.method1319(var419, (byte) -8).field423;
                            continue;
                        }
                        if (var474 == 3305) {
                            var6--;
                            int var420 = class185.field2960[var6];
                            class185.field2960[var6++] = class146.field2314[var420];
                            continue;
                        }
                        if (var474 == 3306) {
                            var6--;
                            int var421 = class185.field2960[var6];
                            class185.field2960[var6++] = class260.field4372[var421];
                            continue;
                        }
                        if (var474 == 3307) {
                            var6--;
                            int var422 = class185.field2960[var6];
                            class185.field2960[var6++] = class52.field742[var422];
                            continue;
                        }
                        if (var474 == 3308) {
                            int var423 = class7.field85;
                            int var424 = (class268.field4551.field3821 >> 7) + class120.field2006;
                            int var425 = (class268.field4551.field3814 >> 7) + class290.field4936;
                            class185.field2960[var6++] = (var423 << 28) + (var424 << 14) + var425;
                            continue;
                        }
                        if (var474 == 3309) {
                            var6--;
                            int var426 = class185.field2960[var6];
                            class185.field2960[var6++] = class234.method1648(var426, 268423140) >> 14;
                            continue;
                        }
                        if (var474 == 3310) {
                            var6--;
                            int var427 = class185.field2960[var6];
                            class185.field2960[var6++] = var427 >> 28;
                            continue;
                        }
                        if (var474 == 3311) {
                            var6--;
                            int var428 = class185.field2960[var6];
                            class185.field2960[var6++] = class234.method1648(16383, var428);
                            continue;
                        }
                        if (var474 == 3312) {
                            class185.field2960[var6++] = class294.field5021 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3313) {
                            var6 -= 2;
                            int var429 = class185.field2960[var6] + 32768;
                            int var430 = class185.field2960[var6 + 1];
                            class185.field2960[var6++] = class102.method808(var430, arg0, var429);
                            continue;
                        }
                        if (var474 == 3314) {
                            var6 -= 2;
                            int var431 = class185.field2960[var6] + 32768;
                            int var432 = class185.field2960[var6 + 1];
                            class185.field2960[var6++] = class207.method1453(var432, var431, 20258);
                            continue;
                        }
                        if (var474 == 3315) {
                            var6 -= 2;
                            int var433 = class185.field2960[var6] + 32768;
                            int var434 = class185.field2960[var6 + 1];
                            class185.field2960[var6++] = class20.method92(var434, (byte) 23, var433);
                            continue;
                        }
                        if (var474 == 3316) {
                            if (class293.field4985 < 2) {
                                class185.field2960[var6++] = 0;
                            } else {
                                class185.field2960[var6++] = class293.field4985;
                            }
                            continue;
                        }
                        if (var474 == 3317) {
                            class185.field2960[var6++] = class196.field3326;
                            continue;
                        }
                        if (var474 == 3318) {
                            class185.field2960[var6++] = class123.field2046;
                            continue;
                        }
                        if (var474 == 3321) {
                            class185.field2960[var6++] = class238.field4074;
                            continue;
                        }
                        if (var474 == 3322) {
                            class185.field2960[var6++] = class292.field4974;
                            continue;
                        }
                        if (var474 == 3323) {
                            if (class70.field1076 >= 5 && class70.field1076 <= 9) {
                                class185.field2960[var6++] = 1;
                                continue;
                            }
                            class185.field2960[var6++] = 0;
                            continue;
                        }
                        if (var474 == 3324) {
                            if (class70.field1076 >= 5 && class70.field1076 <= 9) {
                                class185.field2960[var6++] = class70.field1076;
                                continue;
                            }
                            class185.field2960[var6++] = 0;
                            continue;
                        }
                        if (var474 == 3325) {
                            if (class166.field2703 > 0) {
                                class185.field2960[var6++] = 1;
                            } else {
                                class185.field2960[var6++] = 0;
                            }
                            continue;
                        }
                        if (var474 == 3326) {
                            class185.field2960[var6++] = class268.field4551.field2441;
                            continue;
                        }
                        if (var474 == 3327) {
                            class185.field2960[var6++] = class268.field4551.field2448.field201 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3328) {
                            class185.field2960[var6++] = class304.field5236;
                            continue;
                        }
                        if (var474 == 3329) {
                            class185.field2960[var6++] = class14.field111;
                            continue;
                        }
                        if (var474 == 3330) {
                            var6--;
                            int var435 = class185.field2960[var6];
                            class185.field2960[var6++] = class158.method1160(var435, 99);
                            continue;
                        }
                        if (var474 == 3331) {
                            var6 -= 2;
                            int var436 = class185.field2960[var6 + 1];
                            int var437 = class185.field2960[var6];
                            class185.field2960[var6++] = class66.method473(var437, 23808, var436, false);
                            continue;
                        }
                        if (var474 == 3332) {
                            var6 -= 2;
                            int var438 = class185.field2960[var6];
                            int var439 = class185.field2960[var6 + 1];
                            class185.field2960[var6++] = class66.method473(var438, 23808, var439, true);
                            continue;
                        }
                        if (var474 == 3333) {
                            class185.field2960[var6++] = class45.field679;
                            continue;
                        }
                    } else if (var474 < 3500) {
                        if (var474 == 3400) {
                            var6 -= 2;
                            int var98 = class185.field2960[var6];
                            int var99 = class185.field2960[var6 + 1];
                            class56 var100 = class163.method1178(var98, 64);
                            if (var100.field825 != 115) {
                            }
                            class104.field1705[var7++] = var100.method370(var99, 1);
                            continue;
                        }
                        if (var474 == 3408) {
                            var6 -= 4;
                            int var101 = class185.field2960[var6];
                            int var102 = class185.field2960[var6 + 1];
                            int var103 = class185.field2960[var6 + 2];
                            int var104 = class185.field2960[var6 + 3];
                            class56 var105 = class163.method1178(var103, 64);
                            if (var105.field822 == var101 && var105.field825 == var102) {
                                if (var102 == 115) {
                                    class104.field1705[var7++] = var105.method370(var104, 1);
                                } else {
                                    class185.field2960[var6++] = var105.method371(var104, 1);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var474 == 3409) {
                            var6 -= 3;
                            int var106 = class185.field2960[var6];
                            int var107 = class185.field2960[var6 + 2];
                            int var108 = class185.field2960[var6 + 1];
                            if (var108 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class56 var109 = class163.method1178(var108, 64);
                            if (var109.field825 != var106) {
                                throw new RuntimeException("C3409-1");
                            }
                            class185.field2960[var6++] = var109.method369(var107, 15983) ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3410) {
                            var6--;
                            int var110 = class185.field2960[var6];
                            var7--;
                            class62 var111 = class104.field1705[var7];
                            if (var110 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class56 var112 = class163.method1178(var110, 64);
                            if (var112.field825 != 115) {
                                throw new RuntimeException("C3410-1");
                            }
                            class185.field2960[var6++] = var112.method364(var111, 1) ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3411) {
                            var6--;
                            int var113 = class185.field2960[var6];
                            class56 var114 = class163.method1178(var113, 64);
                            class185.field2960[var6++] = var114.field816.method312(125);
                            continue;
                        }
                    } else if (var474 < 3700) {
                        if (var474 == 3600) {
                            if (class293.field4993 == 0) {
                                class185.field2960[var6++] = -2;
                            } else if (class293.field4993 == 1) {
                                class185.field2960[var6++] = -1;
                            } else {
                                class185.field2960[var6++] = class190.field3042;
                            }
                            continue;
                        }
                        if (var474 == 3601) {
                            var6--;
                            int var391 = class185.field2960[var6];
                            if (class293.field4993 == 2 && class190.field3042 > var391) {
                                class104.field1705[var7++] = class294.field5022[var391];
                                continue;
                            }
                            class104.field1705[var7++] = class71.field1086;
                            continue;
                        }
                        if (var474 == 3602) {
                            var6--;
                            int var392 = class185.field2960[var6];
                            if (class293.field4993 == 2 && var392 < class190.field3042) {
                                class185.field2960[var6++] = class26.field311[var392];
                                continue;
                            }
                            class185.field2960[var6++] = 0;
                            continue;
                        }
                        if (var474 == 3603) {
                            var6--;
                            int var393 = class185.field2960[var6];
                            if (class293.field4993 == 2 && class190.field3042 > var393) {
                                class185.field2960[var6++] = class144.field2299[var393];
                                continue;
                            }
                            class185.field2960[var6++] = 0;
                            continue;
                        }
                        if (var474 == 3604) {
                            var7--;
                            class62 var394 = class104.field1705[var7];
                            var6--;
                            int var395 = class185.field2960[var6];
                            class193.method1356(var394, -120, var395);
                            continue;
                        }
                        if (var474 == 3605) {
                            var7--;
                            class62 var396 = class104.field1705[var7];
                            class108.method838(var396.method451(73), 0);
                            continue;
                        }
                        if (var474 == 3606) {
                            var7--;
                            class62 var397 = class104.field1705[var7];
                            class181.method1270(-98, var397.method451(97));
                            continue;
                        }
                        if (var474 == 3607) {
                            var7--;
                            class62 var398 = class104.field1705[var7];
                            class265.method1825(var398.method451(82), 117);
                            continue;
                        }
                        if (var474 == 3608) {
                            var7--;
                            class62 var399 = class104.field1705[var7];
                            class281.method1917(63, var399.method451(88));
                            continue;
                        }
                        if (var474 == 3609) {
                            var7--;
                            class62 var400 = class104.field1705[var7];
                            if (var400.method414((byte) -39, class230.field3994) || var400.method414((byte) -39, class72.field1105)) {
                                var400 = var400.method407(7, 15552);
                            }
                            class185.field2960[var6++] = class256.method1781(var400, (byte) 37) ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3610) {
                            var6--;
                            int var401 = class185.field2960[var6];
                            if (class293.field4993 == 2 && class190.field3042 > var401) {
                                class104.field1705[var7++] = class234.field4034[var401];
                                continue;
                            }
                            class104.field1705[var7++] = class71.field1086;
                            continue;
                        }
                        if (var474 == 3611) {
                            if (class127.field2105 == null) {
                                class104.field1705[var7++] = class71.field1086;
                            } else {
                                class104.field1705[var7++] = class127.field2105.method419(28768);
                            }
                            continue;
                        }
                        if (var474 == 3612) {
                            if (class127.field2105 == null) {
                                class185.field2960[var6++] = 0;
                            } else {
                                class185.field2960[var6++] = class201.field3410;
                            }
                            continue;
                        }
                        if (var474 == 3613) {
                            var6--;
                            int var402 = class185.field2960[var6];
                            if (class127.field2105 != null && class201.field3410 > var402) {
                                class104.field1705[var7++] = class225.field3923[var402].field3922.method419(28768);
                                continue;
                            }
                            class104.field1705[var7++] = class71.field1086;
                            continue;
                        }
                        if (var474 == 3614) {
                            var6--;
                            int var403 = class185.field2960[var6];
                            if (class127.field2105 != null && var403 < class201.field3410) {
                                class185.field2960[var6++] = class225.field3923[var403].field3919;
                                continue;
                            }
                            class185.field2960[var6++] = 0;
                            continue;
                        }
                        if (var474 == 3615) {
                            var6--;
                            int var404 = class185.field2960[var6];
                            if (class127.field2105 != null && var404 < class201.field3410) {
                                class185.field2960[var6++] = class225.field3923[var404].field3924;
                                continue;
                            }
                            class185.field2960[var6++] = 0;
                            continue;
                        }
                        if (var474 == 3616) {
                            class185.field2960[var6++] = class297.field5065;
                            continue;
                        }
                        if (var474 == 3617) {
                            var7--;
                            class62 var405 = class104.field1705[var7];
                            class155.method1146(94, var405);
                            continue;
                        }
                        if (var474 == 3618) {
                            class185.field2960[var6++] = class241.field4117;
                            continue;
                        }
                        if (var474 == 3619) {
                            var7--;
                            class62 var406 = class104.field1705[var7];
                            class235.method1655(0, var406.method451(65));
                            continue;
                        }
                        if (var474 == 3620) {
                            class177.method1246(true);
                            continue;
                        }
                        if (var474 == 3621) {
                            if (class293.field4993 == 0) {
                                class185.field2960[var6++] = -1;
                            } else {
                                class185.field2960[var6++] = class141.field2269;
                            }
                            continue;
                        }
                        if (var474 == 3622) {
                            var6--;
                            int var407 = class185.field2960[var6];
                            if (class293.field4993 != 0 && var407 < class141.field2269) {
                                class104.field1705[var7++] = class170.method1227(0, class55.field808[var407]).method419(28768);
                                continue;
                            }
                            class104.field1705[var7++] = class71.field1086;
                            continue;
                        }
                        if (var474 == 3623) {
                            var7--;
                            class62 var408 = class104.field1705[var7];
                            if (var408.method414((byte) -39, class230.field3994) || var408.method414((byte) -39, class72.field1105)) {
                                var408 = var408.method407(7, 15552);
                            }
                            class185.field2960[var6++] = class94.method759(-116, var408) ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3624) {
                            var6--;
                            int var409 = class185.field2960[var6];
                            if (class225.field3923 != null && class201.field3410 > var409 && class225.field3923[var409].field3922.method436(class268.field4551.field2430, 32)) {
                                class185.field2960[var6++] = 1;
                                continue;
                            }
                            class185.field2960[var6++] = 0;
                            continue;
                        }
                        if (var474 == 3625) {
                            if (class291.field4944 == null) {
                                class104.field1705[var7++] = class71.field1086;
                            } else {
                                class104.field1705[var7++] = class291.field4944.method419(28768);
                            }
                            continue;
                        }
                        if (var474 == 3626) {
                            var6--;
                            int var410 = class185.field2960[var6];
                            if (class127.field2105 != null && var410 < class201.field3410) {
                                class104.field1705[var7++] = class225.field3923[var410].field3921;
                                continue;
                            }
                            class104.field1705[var7++] = class71.field1086;
                            continue;
                        }
                        if (var474 == 3627) {
                            var6--;
                            int var411 = class185.field2960[var6];
                            if (class293.field4993 == 2 && var411 >= 0 && var411 < class190.field3042) {
                                class185.field2960[var6++] = class203.field3430[var411] ? 1 : 0;
                                continue;
                            }
                            class185.field2960[var6++] = 0;
                            continue;
                        }
                        if (var474 == 3628) {
                            var7--;
                            class62 var412 = class104.field1705[var7];
                            if (var412.method414((byte) -39, class230.field3994) || var412.method414((byte) -39, class72.field1105)) {
                                var412 = var412.method407(7, 15552);
                            }
                            class185.field2960[var6++] = class2.method13(var412, arg0);
                            continue;
                        }
                    } else if (var474 < 4000) {
                        if (var474 == 3903) {
                            var6--;
                            int var377 = class185.field2960[var6];
                            class185.field2960[var6++] = class281.field4808[var377].method1410(80);
                            continue;
                        }
                        if (var474 == 3904) {
                            var6--;
                            int var378 = class185.field2960[var6];
                            class185.field2960[var6++] = class281.field4808[var378].field3408;
                            continue;
                        }
                        if (var474 == 3905) {
                            var6--;
                            int var379 = class185.field2960[var6];
                            class185.field2960[var6++] = class281.field4808[var379].field3415;
                            continue;
                        }
                        if (var474 == 3906) {
                            var6--;
                            int var380 = class185.field2960[var6];
                            class185.field2960[var6++] = class281.field4808[var380].field3395;
                            continue;
                        }
                        if (var474 == 3907) {
                            var6--;
                            int var381 = class185.field2960[var6];
                            class185.field2960[var6++] = class281.field4808[var381].field3403;
                            continue;
                        }
                        if (var474 == 3908) {
                            var6--;
                            int var382 = class185.field2960[var6];
                            class185.field2960[var6++] = class281.field4808[var382].field3401;
                            continue;
                        }
                        if (var474 == 3910) {
                            var6--;
                            int var383 = class185.field2960[var6];
                            int var384 = class281.field4808[var383].method1407(3);
                            class185.field2960[var6++] = var384 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3911) {
                            var6--;
                            int var385 = class185.field2960[var6];
                            int var386 = class281.field4808[var385].method1407(3);
                            class185.field2960[var6++] = var386 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3912) {
                            var6--;
                            int var387 = class185.field2960[var6];
                            int var388 = class281.field4808[var387].method1407(3);
                            class185.field2960[var6++] = var388 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3913) {
                            var6--;
                            int var389 = class185.field2960[var6];
                            int var390 = class281.field4808[var389].method1407(3);
                            class185.field2960[var6++] = var390 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var474 < 4100) {
                        if (var474 == 4000) {
                            var6 -= 2;
                            int var332 = class185.field2960[var6];
                            int var333 = class185.field2960[var6 + 1];
                            class185.field2960[var6++] = var332 + var333;
                            continue;
                        }
                        if (var474 == 4001) {
                            var6 -= 2;
                            int var334 = class185.field2960[var6];
                            int var335 = class185.field2960[var6 + 1];
                            class185.field2960[var6++] = var334 - var335;
                            continue;
                        }
                        if (var474 == 4002) {
                            var6 -= 2;
                            int var336 = class185.field2960[var6 + 1];
                            int var337 = class185.field2960[var6];
                            class185.field2960[var6++] = var336 * var337;
                            continue;
                        }
                        if (var474 == 4003) {
                            var6 -= 2;
                            int var338 = class185.field2960[var6];
                            int var339 = class185.field2960[var6 + 1];
                            class185.field2960[var6++] = var338 / var339;
                            continue;
                        }
                        if (var474 == 4004) {
                            var6--;
                            int var340 = class185.field2960[var6];
                            class185.field2960[var6++] = (int) ((double) var340 * Math.random());
                            continue;
                        }
                        if (var474 == 4005) {
                            var6--;
                            int var341 = class185.field2960[var6];
                            class185.field2960[var6++] = (int) ((double) (var341 + 1) * Math.random());
                            continue;
                        }
                        if (var474 == 4006) {
                            var6 -= 5;
                            int var342 = class185.field2960[var6 + 1];
                            int var343 = class185.field2960[var6];
                            int var344 = class185.field2960[var6 + 2];
                            int var345 = class185.field2960[var6 + 3];
                            int var346 = class185.field2960[var6 + 4];
                            class185.field2960[var6++] = var343 + ((var342 - var343) * (var346 - var344) / (var345 - var344));
                            continue;
                        }
                        if (var474 == 4007) {
                            var6 -= 2;
                            long var347 = (long) class185.field2960[var6 + 1];
                            long var349 = (long) class185.field2960[var6];
                            class185.field2960[var6++] = (int) (var347 * var349 / 100L + var349);
                            continue;
                        }
                        if (var474 == 4008) {
                            var6 -= 2;
                            int var351 = class185.field2960[var6 + 1];
                            int var352 = class185.field2960[var6];
                            class185.field2960[var6++] = class270.method1854(0x1 << var351, var352);
                            continue;
                        }
                        if (var474 == 4009) {
                            var6 -= 2;
                            int var353 = class185.field2960[var6];
                            int var354 = class185.field2960[var6 + 1];
                            class185.field2960[var6++] = class234.method1648(var353, -(0x1 << var354) - 1);
                            continue;
                        }
                        if (var474 == 4010) {
                            var6 -= 2;
                            int var355 = class185.field2960[var6];
                            int var356 = class185.field2960[var6 + 1];
                            class185.field2960[var6++] = class234.method1648(var355, 0x1 << var356) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var474 == 4011) {
                            var6 -= 2;
                            int var357 = class185.field2960[var6 + 1];
                            int var358 = class185.field2960[var6];
                            class185.field2960[var6++] = var358 % var357;
                            continue;
                        }
                        if (var474 == 4012) {
                            var6 -= 2;
                            int var359 = class185.field2960[var6];
                            int var360 = class185.field2960[var6 + 1];
                            if (var359 == 0) {
                                class185.field2960[var6++] = 0;
                            } else {
                                class185.field2960[var6++] = (int) Math.pow((double) var359, (double) var360);
                            }
                            continue;
                        }
                        if (var474 == 4013) {
                            var6 -= 2;
                            int var361 = class185.field2960[var6 + 1];
                            int var362 = class185.field2960[var6];
                            if (var362 == 0) {
                                class185.field2960[var6++] = 0;
                            } else if (var361 == 0) {
                                class185.field2960[var6++] = Integer.MAX_VALUE;
                            } else {
                                class185.field2960[var6++] = (int) Math.pow((double) var362, 1.0D / (double) var361);
                            }
                            continue;
                        }
                        if (var474 == 4014) {
                            var6 -= 2;
                            int var363 = class185.field2960[var6];
                            int var364 = class185.field2960[var6 + 1];
                            class185.field2960[var6++] = class234.method1648(var363, var364);
                            continue;
                        }
                        if (var474 == 4015) {
                            var6 -= 2;
                            int var365 = class185.field2960[var6 + 1];
                            int var366 = class185.field2960[var6];
                            class185.field2960[var6++] = class270.method1854(var365, var366);
                            continue;
                        }
                        if (var474 == 4016) {
                            var6 -= 2;
                            int var367 = class185.field2960[var6];
                            int var368 = class185.field2960[var6 + 1];
                            class185.field2960[var6++] = var367 < var368 ? var367 : var368;
                            continue;
                        }
                        if (var474 == 4017) {
                            var6 -= 2;
                            int var369 = class185.field2960[var6];
                            int var370 = class185.field2960[var6 + 1];
                            class185.field2960[var6++] = var370 < var369 ? var369 : var370;
                            continue;
                        }
                        if (var474 == 4018) {
                            var6 -= 3;
                            long var371 = (long) class185.field2960[var6 + 1];
                            long var373 = (long) class185.field2960[var6];
                            long var375 = (long) class185.field2960[var6 + 2];
                            class185.field2960[var6++] = (int) (var373 * var375 / var371);
                            continue;
                        }
                    } else if (var474 < 4200) {
                        if (var474 == 4100) {
                            var6--;
                            int var115 = class185.field2960[var6];
                            var7--;
                            class62 var116 = class104.field1705[var7];
                            class104.field1705[var7++] = class254.method1772(new class62[] { var116, class42.method284(var115, -122) }, 0);
                            continue;
                        }
                        if (var474 == 4101) {
                            var7 -= 2;
                            class62 var117 = class104.field1705[var7];
                            class62 var118 = class104.field1705[var7 + 1];
                            class104.field1705[var7++] = class254.method1772(new class62[] { var117, var118 }, 0);
                            continue;
                        }
                        if (var474 == 4102) {
                            var7--;
                            class62 var119 = class104.field1705[var7];
                            var6--;
                            int var120 = class185.field2960[var6];
                            class104.field1705[var7++] = class254.method1772(new class62[] { var119, class77.method596(true, (byte) 120, var120) }, 0);
                            continue;
                        }
                        if (var474 == 4103) {
                            var7--;
                            class62 var121 = class104.field1705[var7];
                            class104.field1705[var7++] = var121.method430(11645);
                            continue;
                        }
                        if (var474 == 4104) {
                            var6--;
                            int var122 = class185.field2960[var6];
                            long var123 = (long) var122 * 86400000L + 1014768000000L;
                            class56.field827.setTime(new Date(var123));
                            int var125 = class56.field827.get(5);
                            int var126 = class56.field827.get(2);
                            int var127 = class56.field827.get(1);
                            class104.field1705[var7++] = class254.method1772(new class62[] { class42.method284(var125, -123), class106.field1725, class182.field2889[var126], class106.field1725, class42.method284(var127, -125) }, 0);
                            continue;
                        }
                        if (var474 == 4105) {
                            var7 -= 2;
                            class62 var128 = class104.field1705[var7];
                            class62 var129 = class104.field1705[var7 + 1];
                            if (class268.field4551.field2448 != null && class268.field4551.field2448.field201) {
                                class104.field1705[var7++] = var129;
                                continue;
                            }
                            class104.field1705[var7++] = var128;
                            continue;
                        }
                        if (var474 == 4106) {
                            var6--;
                            int var130 = class185.field2960[var6];
                            class104.field1705[var7++] = class42.method284(var130, -122);
                            continue;
                        }
                        if (var474 == 4107) {
                            var7 -= 2;
                            class185.field2960[var6++] = class104.field1705[var7].method443(class104.field1705[var7 + 1], (byte) -49);
                            continue;
                        }
                        if (var474 == 4108) {
                            var7--;
                            class62 var131 = class104.field1705[var7];
                            var6 -= 2;
                            int var132 = class185.field2960[var6 + 1];
                            int var133 = class185.field2960[var6];
                            byte[] var134 = class281.field4800.method157(0, var132, (byte) 19);
                            class11 var135 = new class11(var134);
                            var135.method2041(class248.field4212, (int[]) null);
                            class185.field2960[var6++] = var135.method2032(var131, var133);
                            continue;
                        }
                        if (var474 == 4109) {
                            var7--;
                            class62 var136 = class104.field1705[var7];
                            var6 -= 2;
                            int var137 = class185.field2960[var6 + 1];
                            int var138 = class185.field2960[var6];
                            byte[] var139 = class281.field4800.method157(0, var137, (byte) 19);
                            class11 var140 = new class11(var139);
                            var140.method2041(class248.field4212, (int[]) null);
                            class185.field2960[var6++] = var140.method2027(var136, var138);
                            continue;
                        }
                        if (var474 == 4110) {
                            var7 -= 2;
                            class62 var141 = class104.field1705[var7];
                            class62 var142 = class104.field1705[var7 + 1];
                            var6--;
                            if (class185.field2960[var6] == 1) {
                                class104.field1705[var7++] = var141;
                            } else {
                                class104.field1705[var7++] = var142;
                            }
                            continue;
                        }
                        if (var474 == 4111) {
                            var7--;
                            class62 var143 = class104.field1705[var7];
                            class104.field1705[var7++] = class299.method2022(var143);
                            continue;
                        }
                        if (var474 == 4112) {
                            var7--;
                            class62 var144 = class104.field1705[var7];
                            var6--;
                            int var145 = class185.field2960[var6];
                            if (var145 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class104.field1705[var7++] = var144.method453((byte) -67, var145);
                            continue;
                        }
                        if (var474 == 4113) {
                            var6--;
                            int var146 = class185.field2960[var6];
                            class185.field2960[var6++] = class186.method1306(var146, -1) ? 1 : 0;
                            continue;
                        }
                        if (var474 == 4114) {
                            var6--;
                            int var147 = class185.field2960[var6];
                            class185.field2960[var6++] = class49.method322(var147, (byte) 118) ? 1 : 0;
                            continue;
                        }
                        if (var474 == 4115) {
                            var6--;
                            int var148 = class185.field2960[var6];
                            class185.field2960[var6++] = class131.method962(var148, 97) ? 1 : 0;
                            continue;
                        }
                        if (var474 == 4116) {
                            var6--;
                            int var149 = class185.field2960[var6];
                            class185.field2960[var6++] = class256.method1779(false, var149) ? 1 : 0;
                            continue;
                        }
                        if (var474 == 4117) {
                            var7--;
                            class62 var150 = class104.field1705[var7];
                            if (var150 == null) {
                                class185.field2960[var6++] = 0;
                            } else {
                                class185.field2960[var6++] = var150.method439(78);
                            }
                            continue;
                        }
                        if (var474 == 4118) {
                            var6 -= 2;
                            var7--;
                            class62 var151 = class104.field1705[var7];
                            int var152 = class185.field2960[var6 + 1];
                            int var153 = class185.field2960[var6];
                            class104.field1705[var7++] = var151.method429(var152, var153, true);
                            continue;
                        }
                        if (var474 == 4119) {
                            boolean var154 = false;
                            var7--;
                            class62 var155 = class104.field1705[var7];
                            class62 var156 = class296.method2005(var155.method439(-47), -1757618132);
                            for (int var157 = 0; var157 < var155.method439(-127); var157++) {
                                int var158 = var155.method456(var157, 31846);
                                if (var158 == 60) {
                                    var154 = true;
                                } else if (var158 == 62) {
                                    var154 = false;
                                } else if (!var154) {
                                    var156.method449((byte) -45, var158);
                                }
                            }
                            var156.method434(-74);
                            class104.field1705[var7++] = var156;
                            continue;
                        }
                        if (var474 == 4120) {
                            var6 -= 2;
                            int var159 = class185.field2960[var6];
                            var7--;
                            class62 var160 = class104.field1705[var7];
                            int var161 = class185.field2960[var6 + 1];
                            class185.field2960[var6++] = var160.method410(var161, 1, var159);
                            continue;
                        }
                        if (var474 == 4121) {
                            var7 -= 2;
                            class62 var162 = class104.field1705[var7];
                            class62 var163 = class104.field1705[var7 + 1];
                            var6--;
                            int var164 = class185.field2960[var6];
                            class185.field2960[var6++] = var162.method437(true, var163, var164);
                            continue;
                        }
                        if (var474 == 4122) {
                            var6--;
                            int var165 = class185.field2960[var6];
                            class185.field2960[var6++] = class55.method359(var165, -11230);
                            continue;
                        }
                        if (var474 == 4123) {
                            var6--;
                            int var166 = class185.field2960[var6];
                            class185.field2960[var6++] = class267.method1838((byte) 98, var166);
                            continue;
                        }
                    } else if (var474 < 4300) {
                        if (var474 == 4200) {
                            var6--;
                            int var167 = class185.field2960[var6];
                            class104.field1705[var7++] = class189.method1320(0, var167).field541;
                            continue;
                        }
                        if (var474 == 4201) {
                            var6 -= 2;
                            int var168 = class185.field2960[var6];
                            int var169 = class185.field2960[var6 + 1];
                            class37 var170 = class189.method1320(0, var168);
                            if (var169 >= 1 && var169 <= 5 && var170.field512[var169 - 1] != null) {
                                class104.field1705[var7++] = var170.field512[var169 - 1];
                                continue;
                            }
                            class104.field1705[var7++] = class71.field1086;
                            continue;
                        }
                        if (var474 == 4202) {
                            var6 -= 2;
                            int var171 = class185.field2960[var6];
                            int var172 = class185.field2960[var6 + 1];
                            class37 var173 = class189.method1320(0, var171);
                            if (var172 >= 1 && var172 <= 5 && var173.field520[var172 - 1] != null) {
                                class104.field1705[var7++] = var173.field520[var172 - 1];
                                continue;
                            }
                            class104.field1705[var7++] = class71.field1086;
                            continue;
                        }
                        if (var474 == 4203) {
                            var6--;
                            int var174 = class185.field2960[var6];
                            class185.field2960[var6++] = class189.method1320(0, var174).field538;
                            continue;
                        }
                        if (var474 == 4204) {
                            var6--;
                            int var175 = class185.field2960[var6];
                            class185.field2960[var6++] = class189.method1320(0, var175).field528 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 4205) {
                            var6--;
                            int var176 = class185.field2960[var6];
                            class37 var177 = class189.method1320(0, var176);
                            if (var177.field509 == -1 && var177.field576 >= 0) {
                                class185.field2960[var6++] = var177.field576;
                                continue;
                            }
                            class185.field2960[var6++] = var176;
                            continue;
                        }
                        if (var474 == 4206) {
                            var6--;
                            int var178 = class185.field2960[var6];
                            class37 var179 = class189.method1320(0, var178);
                            if (var179.field509 >= 0 && var179.field576 >= 0) {
                                class185.field2960[var6++] = var179.field576;
                                continue;
                            }
                            class185.field2960[var6++] = var178;
                            continue;
                        }
                        if (var474 == 4207) {
                            var6--;
                            int var180 = class185.field2960[var6];
                            class185.field2960[var6++] = class189.method1320(0, var180).field526 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 4208) {
                            var6 -= 2;
                            int var181 = class185.field2960[var6];
                            int var182 = class185.field2960[var6 + 1];
                            class227 var183 = class182.method1277(var182, -7);
                            if (var183.method1604((byte) 43)) {
                                class104.field1705[var7++] = class189.method1320(0, var181).method245(var182, var183.field3953, 26533);
                            } else {
                                class185.field2960[var6++] = class189.method1320(0, var181).method243(-69, var183.field3946, var182);
                            }
                            continue;
                        }
                        if (var474 == 4210) {
                            var7--;
                            class62 var184 = class104.field1705[var7];
                            var6--;
                            int var185 = class185.field2960[var6];
                            class268.method1844(79, var185 == 1, var184);
                            class185.field2960[var6++] = class53.field768;
                            continue;
                        }
                        if (var474 == 4211) {
                            if (class143.field2275 != null && class159.field2561 < class53.field768) {
                                class185.field2960[var6++] = class234.method1648(class143.field2275[class159.field2561++], 65535);
                                continue;
                            }
                            class185.field2960[var6++] = -1;
                            continue;
                        }
                        if (var474 == 4212) {
                            class159.field2561 = 0;
                            continue;
                        }
                    } else if (var474 < 4400) {
                        if (var474 == 4300) {
                            var6 -= 2;
                            int var186 = class185.field2960[var6 + 1];
                            int var187 = class185.field2960[var6];
                            class227 var188 = class182.method1277(var186, -101);
                            if (var188.method1604((byte) 43)) {
                                class104.field1705[var7++] = class226.method1601(768, var187).method1877(var186, var188.field3953, 116);
                            } else {
                                class185.field2960[var6++] = class226.method1601(768, var187).method1887(var186, var188.field3946, 29415);
                            }
                            continue;
                        }
                        if (var474 == 4301) {
                            var6--;
                            int var189 = class185.field2960[var6];
                            class185.field2960[var6++] = class226.method1601(768, var189).field4682;
                            continue;
                        }
                        if (var474 == 4302) {
                            var6--;
                            int var190 = class185.field2960[var6];
                            class185.field2960[var6++] = class226.method1601(768, var190).field4699;
                            continue;
                        }
                        if (var474 == 4303) {
                            var6--;
                            int var191 = class185.field2960[var6];
                            class185.field2960[var6++] = class226.method1601(768, var191).field4664;
                            continue;
                        }
                        if (var474 == 4304) {
                            var6--;
                            int var192 = class185.field2960[var6];
                            class185.field2960[var6++] = class226.method1601(768, var192).field4677;
                            continue;
                        }
                        if (var474 == 4305) {
                            var6--;
                            int var193 = class185.field2960[var6];
                            class185.field2960[var6++] = class226.method1601(768, var193).field4667;
                            continue;
                        }
                        if (var474 == 4306) {
                            var6--;
                            int var194 = class185.field2960[var6];
                            class185.field2960[var6++] = class226.method1601(768, var194).field4675;
                            continue;
                        }
                        if (var474 == 4307) {
                            var6--;
                            int var195 = class185.field2960[var6];
                            class185.field2960[var6++] = class226.method1601(768, var195).field4715;
                            continue;
                        }
                    } else if (var474 < 4500) {
                        if (var474 == 4400) {
                            var6 -= 2;
                            int var196 = class185.field2960[var6 + 1];
                            int var197 = class185.field2960[var6];
                            class227 var198 = class182.method1277(var196, -67);
                            if (var198.method1604((byte) 43)) {
                                class104.field1705[var7++] = class252.method1755(var197, (byte) -124).method1537(65535, var196, var198.field3953);
                            } else {
                                class185.field2960[var6++] = class252.method1755(var197, (byte) -71).method1540((byte) -97, var198.field3946, var196);
                            }
                            continue;
                        }
                    } else if (var474 < 4600) {
                        if (var474 == 4500) {
                            var6 -= 2;
                            int var199 = class185.field2960[var6];
                            int var200 = class185.field2960[var6 + 1];
                            class227 var201 = class182.method1277(var200, 79);
                            if (var201.method1604((byte) 43)) {
                                class104.field1705[var7++] = class307.method2095(var199, true).method1012((byte) -94, var200, var201.field3953);
                            } else {
                                class185.field2960[var6++] = class307.method2095(var199, true).method1010(-2, var200, var201.field3946);
                            }
                            continue;
                        }
                    } else if (var474 < 5100) {
                        if (var474 == 5000) {
                            class185.field2960[var6++] = class7.field68;
                            continue;
                        }
                        if (var474 == 5001) {
                            class286.field4889++;
                            var6 -= 3;
                            class7.field68 = class185.field2960[var6];
                            class208.field3529 = class185.field2960[var6 + 1];
                            class247.field4208 = class185.field2960[var6 + 2];
                            class170.field2772.method1693(20, false);
                            class170.field2772.method717(1, class7.field68);
                            class170.field2772.method717(1, class208.field3529);
                            class170.field2772.method717(1, class247.field4208);
                            continue;
                        }
                        if (var474 == 5002) {
                            var7--;
                            class62 var269 = class104.field1705[var7];
                            var6 -= 2;
                            class181.field2874++;
                            int var270 = class185.field2960[var6];
                            int var271 = class185.field2960[var6 + 1];
                            class170.field2772.method1693(75, false);
                            class170.field2772.method694(var269.method451(56), (byte) -34);
                            class170.field2772.method717(1, var270 - 1);
                            class170.field2772.method717(1, var271);
                            continue;
                        }
                        if (var474 == 5003) {
                            var6--;
                            int var272 = class185.field2960[var6];
                            class62 var273 = null;
                            if (var272 < 100) {
                                var273 = class201.field3411[var272];
                            }
                            if (var273 == null) {
                                var273 = class71.field1086;
                            }
                            class104.field1705[var7++] = var273;
                            continue;
                        }
                        if (var474 == 5004) {
                            var6--;
                            int var274 = class185.field2960[var6];
                            int var275 = -1;
                            if (var274 < 100 && class201.field3411[var274] != null) {
                                var275 = class219.field3777[var274];
                            }
                            class185.field2960[var6++] = var275;
                            continue;
                        }
                        if (var474 == 5005) {
                            class185.field2960[var6++] = class208.field3529;
                            continue;
                        }
                        if (var474 == 5008) {
                            var7--;
                            class62 var276 = class104.field1705[var7];
                            if (var276.method414((byte) -39, class301.field5189)) {
                                class226.method1599(var276, false);
                                continue;
                            }
                            if (class293.field4985 == 0 && (class304.field5236 == 1 || class14.field111 == 1)) {
                                continue;
                            }
                            class96.field1587++;
                            class62 var277 = var276.method430(11645);
                            byte var278 = 0;
                            if (var277.method414((byte) -39, class102.field1682)) {
                                var276 = var276.method407(class102.field1682.method439(-10), 15552);
                                var278 = 0;
                            } else if (var277.method414((byte) -39, class129.field2117)) {
                                var276 = var276.method407(class129.field2117.method439(94), 15552);
                                var278 = 1;
                            } else if (var277.method414((byte) -39, class176.field2812)) {
                                var276 = var276.method407(class176.field2812.method439(-99), 15552);
                                var278 = 2;
                            } else if (var277.method414((byte) -39, class119.field1989)) {
                                var276 = var276.method407(class119.field1989.method439(-10), 15552);
                                var278 = 3;
                            } else if (var277.method414((byte) -39, class98.field1603)) {
                                var276 = var276.method407(class98.field1603.method439(107), 15552);
                                var278 = 4;
                            } else if (var277.method414((byte) -39, class62.field931)) {
                                var278 = 5;
                                var276 = var276.method407(class62.field931.method439(-48), 15552);
                            } else if (var277.method414((byte) -39, class240.field4094)) {
                                var278 = 6;
                                var276 = var276.method407(class240.field4094.method439(-121), 15552);
                            } else if (var277.method414((byte) -39, class12.field108)) {
                                var276 = var276.method407(class12.field108.method439(121), 15552);
                                var278 = 7;
                            } else if (var277.method414((byte) -39, class74.field1177)) {
                                var276 = var276.method407(class74.field1177.method439(-84), 15552);
                                var278 = 8;
                            } else if (var277.method414((byte) -39, class248.field4221)) {
                                var278 = 9;
                                var276 = var276.method407(class248.field4221.method439(-124), 15552);
                            } else if (var277.method414((byte) -39, class110.field1785)) {
                                var278 = 10;
                                var276 = var276.method407(class110.field1785.method439(-18), 15552);
                            } else if (var277.method414((byte) -39, class159.field2558)) {
                                var278 = 11;
                                var276 = var276.method407(class159.field2558.method439(127), 15552);
                            } else if (class185.field2964 != 0) {
                                if (var277.method414((byte) -39, class102.field1678)) {
                                    var278 = 0;
                                    var276 = var276.method407(class102.field1678.method439(79), 15552);
                                } else if (var277.method414((byte) -39, class129.field2114)) {
                                    var278 = 1;
                                    var276 = var276.method407(class129.field2114.method439(-124), 15552);
                                } else if (var277.method414((byte) -39, class176.field2814)) {
                                    var278 = 2;
                                    var276 = var276.method407(class176.field2814.method439(116), 15552);
                                } else if (var277.method414((byte) -39, class119.field1994)) {
                                    var276 = var276.method407(class119.field1994.method439(-126), 15552);
                                    var278 = 3;
                                } else if (var277.method414((byte) -39, class98.field1614)) {
                                    var278 = 4;
                                    var276 = var276.method407(class98.field1614.method439(105), 15552);
                                } else if (var277.method414((byte) -39, class62.field890)) {
                                    var278 = 5;
                                    var276 = var276.method407(class62.field890.method439(-117), 15552);
                                } else if (var277.method414((byte) -39, class240.field4091)) {
                                    var276 = var276.method407(class240.field4091.method439(-11), 15552);
                                    var278 = 6;
                                } else if (var277.method414((byte) -39, class12.field103)) {
                                    var278 = 7;
                                    var276 = var276.method407(class12.field103.method439(124), 15552);
                                } else if (var277.method414((byte) -39, class74.field1190)) {
                                    var276 = var276.method407(class74.field1190.method439(-85), 15552);
                                    var278 = 8;
                                } else if (var277.method414((byte) -39, class248.field4222)) {
                                    var276 = var276.method407(class248.field4222.method439(78), 15552);
                                    var278 = 9;
                                } else if (var277.method414((byte) -39, class110.field1789)) {
                                    var278 = 10;
                                    var276 = var276.method407(class110.field1789.method439(94), 15552);
                                } else if (var277.method414((byte) -39, class159.field2565)) {
                                    var278 = 11;
                                    var276 = var276.method407(class159.field2565.method439(-7), 15552);
                                }
                            }
                            byte var279 = 0;
                            class62 var280 = var276.method430(11645);
                            if (var280.method414((byte) -39, class200.field3384)) {
                                var276 = var276.method407(class200.field3384.method439(-77), 15552);
                                var279 = 1;
                            } else if (var280.method414((byte) -39, class278.field4771)) {
                                var276 = var276.method407(class278.field4771.method439(111), 15552);
                                var279 = 2;
                            } else if (var280.method414((byte) -39, class143.field2288)) {
                                var276 = var276.method407(class143.field2288.method439(84), 15552);
                                var279 = 3;
                            } else if (var280.method414((byte) -39, class298.field5093)) {
                                var276 = var276.method407(class298.field5093.method439(120), 15552);
                                var279 = 4;
                            } else if (var280.method414((byte) -39, class149.field2358)) {
                                var279 = 5;
                                var276 = var276.method407(class149.field2358.method439(80), 15552);
                            } else if (class185.field2964 != 0) {
                                if (var280.method414((byte) -39, class200.field3385)) {
                                    var276 = var276.method407(class200.field3385.method439(-1), 15552);
                                    var279 = 1;
                                } else if (var280.method414((byte) -39, class278.field4768)) {
                                    var279 = 2;
                                    var276 = var276.method407(class278.field4768.method439(-53), 15552);
                                } else if (var280.method414((byte) -39, class143.field2289)) {
                                    var276 = var276.method407(class143.field2289.method439(-116), 15552);
                                    var279 = 3;
                                } else if (var280.method414((byte) -39, class298.field5081)) {
                                    var276 = var276.method407(class298.field5081.method439(-21), 15552);
                                    var279 = 4;
                                } else if (var280.method414((byte) -39, class149.field2355)) {
                                    var276 = var276.method407(class149.field2355.method439(4), 15552);
                                    var279 = 5;
                                }
                            }
                            class170.field2772.method1693(100, false);
                            class170.field2772.method717(1, 0);
                            int var281 = class170.field2772.field1476;
                            class170.field2772.method717(1, var278);
                            class170.field2772.method717(1, var279);
                            class30.method200(class170.field2772, true, var276);
                            class170.field2772.method695(class170.field2772.field1476 - var281, true);
                            continue;
                        }
                        if (var474 == 5009) {
                            var7 -= 2;
                            class62 var282 = class104.field1705[var7];
                            class62 var283 = class104.field1705[var7 + 1];
                            if (class293.field4985 != 0 || class304.field5236 != 1 && class14.field111 != 1) {
                                class170.field2772.method1693(221, false);
                                class170.field2772.method717(1, 0);
                                class116.field1944++;
                                int var284 = class170.field2772.field1476;
                                class170.field2772.method694(var282.method451(116), (byte) -34);
                                class30.method200(class170.field2772, true, var283);
                                class170.field2772.method695(class170.field2772.field1476 - var284, true);
                            }
                            continue;
                        }
                        if (var474 == 5010) {
                            var6--;
                            int var285 = class185.field2960[var6];
                            class62 var286 = null;
                            if (var285 < 100) {
                                var286 = class7.field84[var285];
                            }
                            if (var286 == null) {
                                var286 = class71.field1086;
                            }
                            class104.field1705[var7++] = var286;
                            continue;
                        }
                        if (var474 == 5011) {
                            var6--;
                            int var287 = class185.field2960[var6];
                            class62 var288 = null;
                            if (var287 < 100) {
                                var288 = class209.field3536[var287];
                            }
                            if (var288 == null) {
                                var288 = class71.field1086;
                            }
                            class104.field1705[var7++] = var288;
                            continue;
                        }
                        if (var474 == 5012) {
                            var6--;
                            int var289 = class185.field2960[var6];
                            int var290 = -1;
                            if (var289 < 100) {
                                var290 = class17.field172[var289];
                            }
                            class185.field2960[var6++] = var290;
                            continue;
                        }
                        if (var474 == 5015) {
                            class62 var291;
                            if (class268.field4551 == null || class268.field4551.field2430 == null) {
                                var291 = class275.field4689;
                            } else {
                                var291 = class268.field4551.method1105((byte) 105);
                            }
                            class104.field1705[var7++] = var291;
                            continue;
                        }
                        if (var474 == 5016) {
                            class185.field2960[var6++] = class247.field4208;
                            continue;
                        }
                        if (var474 == 5017) {
                            class185.field2960[var6++] = class274.field4642;
                            continue;
                        }
                        if (var474 == 5050) {
                            var6--;
                            int var292 = class185.field2960[var6];
                            class104.field1705[var7++] = class233.method1647(true, var292).field761;
                            continue;
                        }
                        if (var474 == 5051) {
                            var6--;
                            int var293 = class185.field2960[var6];
                            class53 var294 = class233.method1647(arg0, var293);
                            if (var294.field777 == null) {
                                class185.field2960[var6++] = 0;
                            } else {
                                class185.field2960[var6++] = var294.field777.length;
                            }
                            continue;
                        }
                        if (var474 == 5052) {
                            var6 -= 2;
                            int var295 = class185.field2960[var6];
                            int var296 = class185.field2960[var6 + 1];
                            class53 var297 = class233.method1647(true, var295);
                            int var298 = var297.field777[var296];
                            class185.field2960[var6++] = var298;
                            continue;
                        }
                        if (var474 == 5053) {
                            var6--;
                            int var299 = class185.field2960[var6];
                            class53 var300 = class233.method1647(true, var299);
                            if (var300.field767 == null) {
                                class185.field2960[var6++] = 0;
                            } else {
                                class185.field2960[var6++] = var300.field767.length;
                            }
                            continue;
                        }
                        if (var474 == 5054) {
                            var6 -= 2;
                            int var301 = class185.field2960[var6];
                            int var302 = class185.field2960[var6 + 1];
                            class185.field2960[var6++] = class233.method1647(true, var301).field767[var302];
                            continue;
                        }
                        if (var474 == 5055) {
                            var6--;
                            int var303 = class185.field2960[var6];
                            class104.field1705[var7++] = class31.method206(var303, false).method1801(1);
                            continue;
                        }
                        if (var474 == 5056) {
                            var6--;
                            int var304 = class185.field2960[var6];
                            class258 var305 = class31.method206(var304, false);
                            if (var305.field4350 == null) {
                                class185.field2960[var6++] = 0;
                            } else {
                                class185.field2960[var6++] = var305.field4350.length;
                            }
                            continue;
                        }
                        if (var474 == 5057) {
                            var6 -= 2;
                            int var306 = class185.field2960[var6];
                            int var307 = class185.field2960[var6 + 1];
                            class185.field2960[var6++] = class31.method206(var306, false).field4350[var307];
                            continue;
                        }
                        if (var474 == 5058) {
                            class38.field594 = new class214();
                            var6--;
                            class38.field594.field3635 = class185.field2960[var6];
                            class38.field594.field3640 = class31.method206(class38.field594.field3635, !arg0);
                            class38.field594.field3634 = new int[class38.field594.field3640.method1793((byte) -84)];
                            continue;
                        }
                        if (var474 == 5059) {
                            class170.field2772.method1693(165, false);
                            class118.field1980++;
                            class170.field2772.method717(1, 0);
                            int var308 = class170.field2772.field1476;
                            class170.field2772.method717(1, 0);
                            class170.field2772.method738((byte) 103, class38.field594.field3635);
                            class38.field594.field3640.method1798(class170.field2772, -1, class38.field594.field3634);
                            class170.field2772.method695(class170.field2772.field1476 - var308, true);
                            continue;
                        }
                        if (var474 == 5060) {
                            class205.field3476++;
                            var7--;
                            class62 var309 = class104.field1705[var7];
                            class170.field2772.method1693(38, !arg0);
                            class170.field2772.method717(1, 0);
                            int var310 = class170.field2772.field1476;
                            class170.field2772.method694(var309.method451(77), (byte) -34);
                            class170.field2772.method738((byte) -97, class38.field594.field3635);
                            class38.field594.field3640.method1798(class170.field2772, -1, class38.field594.field3634);
                            class170.field2772.method695(class170.field2772.field1476 - var310, true);
                            continue;
                        }
                        if (var474 == 5061) {
                            class170.field2772.method1693(165, false);
                            class118.field1980++;
                            class170.field2772.method717(1, 0);
                            int var311 = class170.field2772.field1476;
                            class170.field2772.method717(1, 1);
                            class170.field2772.method738((byte) 119, class38.field594.field3635);
                            class38.field594.field3640.method1798(class170.field2772, -1, class38.field594.field3634);
                            class170.field2772.method695(class170.field2772.field1476 - var311, arg0);
                            continue;
                        }
                        if (var474 == 5062) {
                            var6 -= 2;
                            int var312 = class185.field2960[var6 + 1];
                            int var313 = class185.field2960[var6];
                            class185.field2960[var6++] = class233.method1647(true, var313).field766[var312];
                            continue;
                        }
                        if (var474 == 5063) {
                            var6 -= 2;
                            int var314 = class185.field2960[var6];
                            int var315 = class185.field2960[var6 + 1];
                            class185.field2960[var6++] = class233.method1647(true, var314).field776[var315];
                            continue;
                        }
                        if (var474 == 5064) {
                            var6 -= 2;
                            int var316 = class185.field2960[var6 + 1];
                            int var317 = class185.field2960[var6];
                            if (var316 == -1) {
                                class185.field2960[var6++] = -1;
                            } else {
                                class185.field2960[var6++] = class233.method1647(arg0, var317).method348(var316, (byte) -107);
                            }
                            continue;
                        }
                        if (var474 == 5065) {
                            var6 -= 2;
                            int var318 = class185.field2960[var6];
                            int var319 = class185.field2960[var6 + 1];
                            if (var319 == -1) {
                                class185.field2960[var6++] = -1;
                            } else {
                                class185.field2960[var6++] = class233.method1647(true, var318).method347((byte) -33, var319);
                            }
                            continue;
                        }
                        if (var474 == 5066) {
                            var6--;
                            int var320 = class185.field2960[var6];
                            class185.field2960[var6++] = class31.method206(var320, !arg0).method1793((byte) -86);
                            continue;
                        }
                        if (var474 == 5067) {
                            var6 -= 2;
                            int var321 = class185.field2960[var6];
                            int var322 = class185.field2960[var6 + 1];
                            int var323 = class31.method206(var321, !arg0).method1791(var322, 114);
                            class185.field2960[var6++] = var323;
                            continue;
                        }
                        if (var474 == 5068) {
                            var6 -= 2;
                            int var324 = class185.field2960[var6 + 1];
                            int var325 = class185.field2960[var6];
                            class38.field594.field3634[var325] = var324;
                            continue;
                        }
                        if (var474 == 5069) {
                            var6 -= 2;
                            int var326 = class185.field2960[var6];
                            int var327 = class185.field2960[var6 + 1];
                            class38.field594.field3634[var326] = var327;
                            continue;
                        }
                        if (var474 == 5070) {
                            var6 -= 3;
                            int var328 = class185.field2960[var6];
                            int var329 = class185.field2960[var6 + 1];
                            int var330 = class185.field2960[var6 + 2];
                            class258 var331 = class31.method206(var328, !arg0);
                            if (var331.method1791(var329, -68) != 0) {
                                throw new RuntimeException("bad command");
                            }
                            class185.field2960[var6++] = var331.method1799(var329, 0, var330);
                            continue;
                        }
                    } else if (var474 < 5200) {
                        if (var474 == 5100) {
                            if (class291.field4939[86]) {
                                class185.field2960[var6++] = 1;
                            } else {
                                class185.field2960[var6++] = 0;
                            }
                            continue;
                        }
                        if (var474 == 5101) {
                            if (class291.field4939[82]) {
                                class185.field2960[var6++] = 1;
                            } else {
                                class185.field2960[var6++] = 0;
                            }
                            continue;
                        }
                        if (var474 == 5102) {
                            if (class291.field4939[81]) {
                                class185.field2960[var6++] = 1;
                            } else {
                                class185.field2960[var6++] = 0;
                            }
                            continue;
                        }
                    } else if (var474 < 5300) {
                        if (var474 == 5200) {
                            var6--;
                            class201.method1409(-51, class185.field2960[var6]);
                            continue;
                        }
                        if (var474 == 5201) {
                            class185.field2960[var6++] = class193.method1354((byte) -116);
                            continue;
                        }
                        if (var474 == 5202) {
                            var6--;
                            class309.method2104(class185.field2960[var6], 123);
                            continue;
                        }
                        if (var474 == 5203) {
                            var7--;
                            class92.method724(class104.field1705[var7], (byte) 18);
                            continue;
                        }
                        if (var474 == 5204) {
                            class104.field1705[var7 - 1] = class46.method303((byte) 62, class104.field1705[var7 - 1]);
                            continue;
                        }
                        if (var474 == 5205) {
                            var7--;
                            class16.method63(class104.field1705[var7], (byte) 9);
                            continue;
                        }
                        if (var474 == 5206) {
                            var6--;
                            int var202 = class185.field2960[var6];
                            class274 var203 = class101.method801(var202 & 0x3FFF, -1322541556, var202 >> 14 & 0x3FFF);
                            if (var203 == null) {
                                class104.field1705[var7++] = class71.field1086;
                            } else {
                                class104.field1705[var7++] = var203.field4650;
                            }
                            continue;
                        }
                        if (var474 == 5207) {
                            var7--;
                            class274 var204 = class194.method1361((byte) -59, class104.field1705[var7]);
                            if (var204 != null && var204.field4653 != null) {
                                class104.field1705[var7++] = var204.field4653;
                                continue;
                            }
                            class104.field1705[var7++] = class71.field1086;
                            continue;
                        }
                    } else if (var474 < 5400) {
                        if (var474 == 5300) {
                            var6 -= 2;
                            int var258 = class185.field2960[var6];
                            int var259 = class185.field2960[var6 + 1];
                            if (class212.field3569 != null) {
                                class57.method376(-28268);
                            }
                            class267.method1836((byte) -14, var258, var259);
                            class185.field2960[var6++] = class212.field3569 == null ? 0 : 1;
                            continue;
                        }
                        if (var474 == 5301) {
                            if (class212.field3569 != null) {
                                class57.method376(-28268);
                            }
                            continue;
                        }
                        if (var474 == 5302) {
                            class304[] var260 = class187.method1310(0);
                            class185.field2960[var6++] = var260.length;
                            continue;
                        }
                        if (var474 == 5303) {
                            var6--;
                            int var261 = class185.field2960[var6];
                            class304[] var262 = class187.method1310(0);
                            class185.field2960[var6++] = var262[var261].field5226;
                            class185.field2960[var6++] = var262[var261].field5233;
                            continue;
                        }
                        if (var474 == 5305) {
                            int var263 = class124.field2055;
                            int var264 = -1;
                            int var265 = class54.field795;
                            class304[] var266 = class187.method1310(0);
                            for (int var267 = 0; var267 < var266.length; var267++) {
                                class304 var268 = var266[var267];
                                if (var268.field5226 == var263 && var268.field5233 == var265) {
                                    var264 = var267;
                                    break;
                                }
                            }
                            class185.field2960[var6++] = var264;
                            continue;
                        }
                        if (var474 == 5306) {
                            class185.field2960[var6++] = client.method2050((byte) 64);
                            continue;
                        }
                    } else if (var474 < 5500) {
                        if (var474 == 5400) {
                            var7 -= 2;
                            class62 var236 = class104.field1705[var7];
                            class173.field2793++;
                            class62 var237 = class104.field1705[var7 + 1];
                            var6--;
                            int var238 = class185.field2960[var6];
                            class170.field2772.method1693(129, false);
                            class170.field2772.method717(1, class152.method1090(21850, var236) + class152.method1090(21850, var237) + 1);
                            class170.field2772.method710(var236, false);
                            class170.field2772.method710(var237, false);
                            class170.field2772.method717(1, var238);
                            continue;
                        }
                        if (var474 == 5401) {
                            var6 -= 2;
                            class233.field4028[class185.field2960[var6]] = (short) class275.method1886(class185.field2960[var6 + 1], -22322);
                            class214.method1516((byte) 29);
                            class288.method1969(-113);
                            class301.method2066(false);
                            class265.method1827(-1);
                            class235.method1654(true);
                            continue;
                        }
                        if (var474 == 5405) {
                            var6 -= 2;
                            int var239 = class185.field2960[var6];
                            int var240 = class185.field2960[var6 + 1];
                            if (var239 >= 0 && var239 < 2) {
                                class206.field3491[var239] = new int[var240 << 1][4];
                            }
                            continue;
                        }
                        if (var474 == 5406) {
                            var6 -= 7;
                            int var241 = class185.field2960[var6];
                            int var242 = class185.field2960[var6 + 1] << 1;
                            int var243 = class185.field2960[var6 + 4];
                            int var244 = class185.field2960[var6 + 5];
                            int var245 = class185.field2960[var6 + 2];
                            int var246 = class185.field2960[var6 + 3];
                            int var247 = class185.field2960[var6 + 6];
                            if (var241 >= 0 && var241 < 2 && class206.field3491[var241] != null && var242 >= 0 && var242 < class206.field3491[var241].length) {
                                class206.field3491[var241][var242] = new int[] { (class234.method1648(var245, 268426116) >> 14) * 128, var246, class234.method1648(var245, 16383) * 128, var247 };
                                class206.field3491[var241][var242 + 1] = new int[] { class234.method1648(var243 >> 14, 16383) * 128, var244, class234.method1648(16383, var243) * 128 };
                            }
                            continue;
                        }
                        if (var474 == 5407) {
                            var6--;
                            int var248 = class206.field3491[class185.field2960[var6]].length >> 1;
                            class185.field2960[var6++] = var248;
                            continue;
                        }
                        if (var474 == 5408) {
                            class185.field2960[var6++] = 1;
                            continue;
                        }
                        if (var474 == 5409) {
                            class266.method1832(110);
                            continue;
                        }
                        if (var474 == 5411) {
                            if (class212.field3569 != null) {
                                class57.method376(-28268);
                            }
                            if (class216.field3686 == null) {
                                class300.method2044(class96.method765((byte) -125), false, 22);
                            } else {
                                System.exit(0);
                            }
                            continue;
                        }
                        if (var474 == 5419) {
                            class62 var249 = class71.field1086;
                            if (class195.field3286 != null) {
                                var249 = class250.method1736((byte) -112, class195.field3286.field2320);
                                try {
                                    if (class195.field3286.field2323 != null) {
                                        byte[] var250 = ((String) class195.field3286.field2323).getBytes("ISO-8859-1");
                                        var249 = class266.method1833(0, var250.length, var250, 0);
                                    }
                                } catch (UnsupportedEncodingException var471) {
                                }
                            }
                            class104.field1705[var7++] = var249;
                            continue;
                        }
                        if (var474 == 5420) {
                            class185.field2960[var6++] = class278.field4772 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 5421) {
                            if (class212.field3569 != null) {
                                class57.method376(-28268);
                            }
                            var6--;
                            boolean var252 = class185.field2960[var6] == 1;
                            var7--;
                            class62 var253 = class104.field1705[var7];
                            class62 var254 = class254.method1772(new class62[] { class96.method765((byte) -128), var253 }, 0);
                            if (class216.field3686 == null && (!var252 || class278.field4772 == 2 || !class285.field4865.startsWith("win") || class60.field868)) {
                                class300.method2044(var254, var252, 32);
                                continue;
                            }
                            class200.field3390 = var252;
                            class248.field4218 = var254;
                            class133.field2174 = class193.field3246.method1943(new String(var254.method404(-231), "ISO-8859-1"), (byte) -107);
                            continue;
                        }
                        if (var474 == 5422) {
                            var6--;
                            int var255 = class185.field2960[var6];
                            var7 -= 2;
                            class62 var256 = class104.field1705[var7];
                            class62 var257 = class104.field1705[var7 + 1];
                            if (var256.method439(-6) > 0) {
                                if (class77.field1293 == null) {
                                    class77.field1293 = new class62[class54.field799[class131.field2132]];
                                }
                                class77.field1293[var255] = var256;
                            }
                            if (var257.method439(108) > 0) {
                                if (class260.field4378 == null) {
                                    class260.field4378 = new class62[class54.field799[class131.field2132]];
                                }
                                class260.field4378[var255] = var257;
                            }
                            continue;
                        }
                    } else if (var474 < 5600) {
                        if (var474 == 5500) {
                            var6 -= 4;
                            int var205 = class185.field2960[var6 + 2];
                            int var206 = class185.field2960[var6 + 1];
                            int var207 = class185.field2960[var6];
                            int var208 = class185.field2960[var6 + 3];
                            class294.method2002(false, var205, (var207 & 0x3FFF) - class290.field4936, var208, ((var207 & 0xFFFF54B) >> 14) - class120.field2006, var206, 128);
                            continue;
                        }
                        if (var474 == 5501) {
                            var6 -= 4;
                            int var209 = class185.field2960[var6];
                            int var210 = class185.field2960[var6 + 1];
                            int var211 = class185.field2960[var6 + 2];
                            int var212 = class185.field2960[var6 + 3];
                            class121.method931(var211, (byte) 109, var210, var212, ((var209 & 0xFFFCEC1) >> 14) - class120.field2006, (var209 & 0x3FFF) + -class290.field4936);
                            continue;
                        }
                        if (var474 == 5502) {
                            var6 -= 6;
                            int var213 = class185.field2960[var6];
                            if (var213 >= 2) {
                                throw new RuntimeException();
                            }
                            class44.field665 = var213;
                            int var214 = class185.field2960[var6 + 1];
                            if (class206.field3491[class44.field665].length >> 1 <= var214 + 1) {
                                throw new RuntimeException();
                            }
                            class251.field4259 = 0;
                            class286.field4897 = var214;
                            class46.field684 = class185.field2960[var6 + 2];
                            class24.field260 = class185.field2960[var6 + 3];
                            int var215 = class185.field2960[var6 + 4];
                            if (var215 >= 2) {
                                throw new RuntimeException();
                            }
                            class134.field2188 = var215;
                            int var216 = class185.field2960[var6 + 5];
                            if (class206.field3491[class134.field2188].length >> 1 <= var216 + 1) {
                                throw new RuntimeException();
                            }
                            class21.field220 = 3;
                            class155.field2494 = var216;
                            continue;
                        }
                        if (var474 == 5503) {
                            class94.method757(5);
                            continue;
                        }
                        if (var474 == 5504) {
                            var6 -= 2;
                            class20.field208 = class185.field2960[var6];
                            class267.field4516 = class185.field2960[var6 + 1];
                            class236.method1662((byte) 120);
                            continue;
                        }
                        if (var474 == 5505) {
                            class185.field2960[var6++] = class20.field208;
                            continue;
                        }
                        if (var474 == 5506) {
                            class185.field2960[var6++] = class267.field4516;
                            continue;
                        }
                    } else if (var474 < 5700) {
                        if (var474 == 5600) {
                            var7 -= 2;
                            class62 var217 = class104.field1705[var7];
                            class62 var218 = class104.field1705[var7 + 1];
                            var6--;
                            int var219 = class185.field2960[var6];
                            if (class118.field1983 == 10 && class296.field5052 == 0 && class265.field4466 == 0) {
                                class54.method356(var217, var218, var219, (byte) -127);
                            }
                            continue;
                        }
                        if (var474 == 5601) {
                            class77.method593(1262386856);
                            continue;
                        }
                        if (var474 == 5602) {
                            if (class296.field5052 == 0) {
                                class114.field1922 = -2;
                            }
                            continue;
                        }
                        if (var474 == 5603) {
                            var6 -= 4;
                            if (class118.field1983 == 10 && class296.field5052 == 0 && class265.field4466 == 0) {
                                class184.method1292(97, class185.field2960[var6 + 3], class185.field2960[var6], class185.field2960[var6 + 2], class185.field2960[var6 + 1]);
                            }
                            continue;
                        }
                        if (var474 == 5604) {
                            var7--;
                            if (class118.field1983 == 10 && class296.field5052 == 0 && class265.field4466 == 0) {
                                class7.method34(class104.field1705[var7].method451(121), 15222);
                            }
                            continue;
                        }
                        if (var474 == 5605) {
                            var7 -= 2;
                            var6 -= 4;
                            if (class118.field1983 == 10 && class296.field5052 == 0 && class265.field4466 == 0) {
                                class272.method1866(class185.field2960[var6 + 2], class185.field2960[var6 + 3], 88, class104.field1705[var7 + 1], class185.field2960[var6 + 1], class104.field1705[var7].method451(44), class185.field2960[var6]);
                            }
                            continue;
                        }
                        if (var474 == 5606) {
                            if (class265.field4466 == 0) {
                                class243.field4131 = -2;
                            }
                            continue;
                        }
                        if (var474 == 5607) {
                            class185.field2960[var6++] = class114.field1922;
                            continue;
                        }
                        if (var474 == 5608) {
                            class185.field2960[var6++] = class309.field5295;
                            continue;
                        }
                        if (var474 == 5609) {
                            class185.field2960[var6++] = class243.field4131;
                            continue;
                        }
                        if (var474 == 5610) {
                            for (int var220 = 0; var220 < 5; var220++) {
                                class104.field1705[var7++] = var220 >= class238.field4070.length ? class71.field1086 : class238.field4070[var220].method419(28768);
                            }
                            class238.field4070 = null;
                            continue;
                        }
                        if (var474 == 5611) {
                            class185.field2960[var6++] = class90.field1425;
                            continue;
                        }
                    } else if (var474 < 6100) {
                        if (var474 == 6001) {
                            var6--;
                            int var221 = class185.field2960[var6];
                            if (var221 < 1) {
                                var221 = 1;
                            }
                            if (var221 > 4) {
                                var221 = 4;
                            }
                            class44.field662 = var221;
                            if (!client.field5162) {
                                if (class44.field662 == 1) {
                                    class23.method104(0.9F);
                                }
                                if (class44.field662 == 2) {
                                    class23.method104(0.8F);
                                }
                                if (class44.field662 == 3) {
                                    class23.method104(0.7F);
                                }
                                if (class44.field662 == 4) {
                                    class23.method104(0.6F);
                                }
                            }
                            class246.method1717(-47);
                            if (!client.field5162) {
                                class96.method770(!arg0);
                            }
                            class288.method1969(-106);
                            class12.method47((byte) -101, class193.field3246);
                            class50.field730 = false;
                            continue;
                        }
                        if (var474 == 6002) {
                            var6--;
                            class229.method1624(0, class185.field2960[var6] == 1);
                            class120.method928(0);
                            class96.method770(false);
                            class170.method1226(2);
                            class12.method47((byte) -115, class193.field3246);
                            class50.field730 = false;
                            continue;
                        }
                        if (var474 == 6003) {
                            var6--;
                            class113.field1877 = class185.field2960[var6] == 1;
                            class170.method1226(2);
                            class12.method47((byte) -93, class193.field3246);
                            class50.field730 = false;
                            continue;
                        }
                        if (var474 == 6005) {
                            var6--;
                            class276.field4733 = class185.field2960[var6] == 1;
                            class96.method770(false);
                            class12.method47((byte) -106, class193.field3246);
                            class50.field730 = false;
                            continue;
                        }
                        if (var474 == 6006) {
                            var6--;
                            class306.field5262 = class185.field2960[var6] == 1;
                            ((class29) class23.field248).method182(-6354, !class306.field5262);
                            class12.method47((byte) -92, class193.field3246);
                            class50.field730 = false;
                            continue;
                        }
                        if (var474 == 6007) {
                            var6--;
                            class74.field1157 = class185.field2960[var6] == 1;
                            class12.method47((byte) -83, class193.field3246);
                            class50.field730 = false;
                            continue;
                        }
                        if (var474 == 6008) {
                            var6--;
                            class92.field1499 = class185.field2960[var6] == 1;
                            class12.method47((byte) -84, class193.field3246);
                            class50.field730 = false;
                            continue;
                        }
                        if (var474 == 6009) {
                            var6--;
                            class170.field2777 = class185.field2960[var6] == 1;
                            class12.method47((byte) -79, class193.field3246);
                            class50.field730 = false;
                            continue;
                        }
                        if (var474 == 6010) {
                            var6--;
                            class158.field2547 = class185.field2960[var6] == 1;
                            class12.method47((byte) -128, class193.field3246);
                            class50.field730 = false;
                            continue;
                        }
                        if (var474 == 6011) {
                            var6--;
                            int var222 = class185.field2960[var6];
                            if (var222 < 0 || var222 > 2) {
                                var222 = 0;
                            }
                            class301.field5179 = var222;
                            class12.method47((byte) -116, class193.field3246);
                            class50.field730 = false;
                            continue;
                        }
                        if (var474 == 6012) {
                            class135.method1024(0, -13, 0);
                            var6--;
                            client.field5162 = class185.field2960[var6] == 1;
                            if (client.field5162) {
                                class23.method104(0.7F);
                            } else {
                                if (class44.field662 == 1) {
                                    class23.method104(0.9F);
                                }
                                if (class44.field662 == 2) {
                                    class23.method104(0.8F);
                                }
                                if (class44.field662 == 3) {
                                    class23.method104(0.7F);
                                }
                                if (class44.field662 == 4) {
                                    class23.method104(0.6F);
                                }
                            }
                            class96.method770(false);
                            class12.method47((byte) -120, class193.field3246);
                            class50.field730 = false;
                            continue;
                        }
                        if (var474 == 6014) {
                            var6--;
                            class72.field1107 = class185.field2960[var6] == 1;
                            class96.method770(false);
                            class12.method47((byte) -77, class193.field3246);
                            class50.field730 = false;
                            continue;
                        }
                        if (var474 == 6015) {
                            var6--;
                            class52.field756 = class185.field2960[var6] == 1;
                            class246.method1717(-105);
                            class12.method47((byte) -76, class193.field3246);
                            class50.field730 = false;
                            continue;
                        }
                        if (var474 == 6016) {
                            var6--;
                            int var223 = class185.field2960[var6];
                            if (var223 < 0 || var223 > 2) {
                                var223 = 0;
                            }
                            class163.field2648 = true;
                            class97.field1596 = var223;
                            class12.method47((byte) -128, class193.field3246);
                            class50.field730 = false;
                            continue;
                        }
                        if (var474 == 6017) {
                            var6--;
                            class218.field3770 = class185.field2960[var6] == 1;
                            class247.method1722((byte) -112);
                            class12.method47((byte) -93, class193.field3246);
                            class50.field730 = false;
                            continue;
                        }
                        if (var474 == 6018) {
                            var6--;
                            int var224 = class185.field2960[var6];
                            if (var224 < 0) {
                                var224 = 0;
                            }
                            if (var224 > 127) {
                                var224 = 127;
                            }
                            class169.field2744 = var224;
                            class12.method47((byte) -82, class193.field3246);
                            class50.field730 = false;
                            continue;
                        }
                        if (var474 == 6019) {
                            var6--;
                            int var225 = class185.field2960[var6];
                            if (var225 < 0) {
                                var225 = 0;
                            }
                            if (var225 > 255) {
                                var225 = 255;
                            }
                            if (class100.field1650 != var225) {
                                if (class100.field1650 == 0 && class182.field2909 != -1) {
                                    class198.method1387(0, false, 108, class163.field2649, class182.field2909, var225);
                                    class91.field1429 = false;
                                } else if (var225 == 0) {
                                    class237.method1673(-129);
                                    class91.field1429 = false;
                                } else {
                                    class22.method99(var225, 0);
                                }
                                class100.field1650 = var225;
                            }
                            class12.method47((byte) -97, class193.field3246);
                            class50.field730 = false;
                            continue;
                        }
                        if (var474 == 6020) {
                            var6--;
                            int var226 = class185.field2960[var6];
                            if (var226 < 0) {
                                var226 = 0;
                            }
                            if (var226 > 127) {
                                var226 = 127;
                            }
                            class114.field1902 = var226;
                            class12.method47((byte) -79, class193.field3246);
                            class50.field730 = false;
                            continue;
                        }
                        if (var474 == 6021) {
                            var6--;
                            class249.field4231 = class185.field2960[var6] == 1;
                            class170.method1226(2);
                            continue;
                        }
                        if (var474 == 6022) {
                            var6--;
                            class235.field4039 = class185.field2960[var6] == 1;
                            class12.method47((byte) -93, class193.field3246);
                            class197.method1378(false, 0);
                            continue;
                        }
                    } else if (var474 < 6200) {
                        if (var474 == 6101) {
                            class185.field2960[var6++] = class44.field662;
                            continue;
                        }
                        if (var474 == 6102) {
                            class185.field2960[var6++] = class149.method1073((byte) -126) ? 1 : 0;
                            continue;
                        }
                        if (var474 == 6103) {
                            class185.field2960[var6++] = class113.field1877 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 6105) {
                            class185.field2960[var6++] = class276.field4733 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 6106) {
                            class185.field2960[var6++] = class306.field5262 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 6107) {
                            class185.field2960[var6++] = class74.field1157 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 6108) {
                            class185.field2960[var6++] = class92.field1499 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 6109) {
                            class185.field2960[var6++] = class170.field2777 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 6110) {
                            class185.field2960[var6++] = class158.field2547 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 6111) {
                            class185.field2960[var6++] = class301.field5179;
                            continue;
                        }
                        if (var474 == 6112) {
                            class185.field2960[var6++] = client.field5162 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 6114) {
                            class185.field2960[var6++] = class72.field1107 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 6115) {
                            class185.field2960[var6++] = class52.field756 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 6116) {
                            class185.field2960[var6++] = class97.field1596;
                            continue;
                        }
                        if (var474 == 6117) {
                            class185.field2960[var6++] = class218.field3770 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 6118) {
                            class185.field2960[var6++] = class169.field2744;
                            continue;
                        }
                        if (var474 == 6119) {
                            class185.field2960[var6++] = class100.field1650;
                            continue;
                        }
                        if (var474 == 6120) {
                            class185.field2960[var6++] = class114.field1902;
                            continue;
                        }
                        if (var474 == 6121) {
                            class185.field2960[var6++] = class154.field2469 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 6122) {
                            class185.field2960[var6++] = class235.field4039 ? 1 : 0;
                            continue;
                        }
                    } else if (var474 < 6300) {
                        if (var474 == 6200) {
                            var6 -= 2;
                            class129.field2115 = (short) class185.field2960[var6];
                            if (class129.field2115 <= 0) {
                                class129.field2115 = 256;
                            }
                            class244.field4154 = (short) class185.field2960[var6 + 1];
                            if (class244.field4154 <= 0) {
                                class244.field4154 = 205;
                            }
                            continue;
                        }
                        if (var474 == 6201) {
                            var6 -= 2;
                            class162.field2633 = (short) class185.field2960[var6];
                            if (class162.field2633 <= 0) {
                                class162.field2633 = 256;
                            }
                            class12.field106 = (short) class185.field2960[var6 + 1];
                            if (class12.field106 <= 0) {
                                class12.field106 = 320;
                            }
                            continue;
                        }
                        if (var474 == 6202) {
                            var6 -= 4;
                            class245.field4164 = (short) class185.field2960[var6];
                            if (class245.field4164 <= 0) {
                                class245.field4164 = 1;
                            }
                            class171.field2780 = (short) class185.field2960[var6 + 1];
                            if (class171.field2780 <= 0) {
                                class171.field2780 = 32767;
                            } else if (class171.field2780 < class245.field4164) {
                                class171.field2780 = class245.field4164;
                            }
                            class287.field4905 = (short) class185.field2960[var6 + 2];
                            if (class287.field4905 <= 0) {
                                class287.field4905 = 1;
                            }
                            class268.field4558 = (short) class185.field2960[var6 + 3];
                            if (class268.field4558 <= 0) {
                                class268.field4558 = 32767;
                            } else if (class287.field4905 > class268.field4558) {
                                class268.field4558 = class287.field4905;
                            }
                            continue;
                        }
                        if (var474 == 6203) {
                            class206.method1449(false, class297.field5074.field3126, class297.field5074.field3190, 0, 0, false);
                            class185.field2960[var6++] = class199.field3370;
                            class185.field2960[var6++] = class102.field1673;
                            continue;
                        }
                        if (var474 == 6204) {
                            class185.field2960[var6++] = class162.field2633;
                            class185.field2960[var6++] = class12.field106;
                            continue;
                        }
                        if (var474 == 6205) {
                            class185.field2960[var6++] = class129.field2115;
                            class185.field2960[var6++] = class244.field4154;
                            continue;
                        }
                    } else if (var474 < 6400) {
                        if (var474 == 6300) {
                            class185.field2960[var6++] = (int) (class293.method1985((byte) -71) / 60000L);
                            continue;
                        }
                        if (var474 == 6301) {
                            class185.field2960[var6++] = (int) (class293.method1985((byte) -71) / 86400000L) - 11745;
                            continue;
                        }
                        if (var474 == 6302) {
                            var6 -= 3;
                            int var227 = class185.field2960[var6 + 2];
                            int var228 = class185.field2960[var6 + 1];
                            int var229 = class185.field2960[var6];
                            class56.field827.clear();
                            class56.field827.set(11, 12);
                            class56.field827.set(var227, var228, var229);
                            class185.field2960[var6++] = (int) (class56.field827.getTime().getTime() / 86400000L) - 11745;
                            continue;
                        }
                        if (var474 == 6303) {
                            class56.field827.clear();
                            class56.field827.setTime(new Date(class293.method1985((byte) -71)));
                            class185.field2960[var6++] = class56.field827.get(1);
                            continue;
                        }
                        if (var474 == 6304) {
                            var6--;
                            int var230 = class185.field2960[var6];
                            boolean var231 = true;
                            if (var230 < 0) {
                                var231 = (var230 + 1) % 4 == 0;
                            } else if (var230 < 1582) {
                                var231 = var230 % 4 == 0;
                            } else if (var230 % 4 != 0) {
                                var231 = false;
                            } else if ((var230 % 100) != 0) {
                                var231 = true;
                            } else if (var230 % 400 != 0) {
                                var231 = false;
                            }
                            class185.field2960[var6++] = var231 ? 1 : 0;
                            continue;
                        }
                    } else if (var474 < 6500) {
                        if (var474 == 6400) {
                            class185.field2960[var6++] = class31.field427 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 6401) {
                            var7--;
                            class62 var232 = class104.field1705[var7];
                            var6--;
                            int var233 = class185.field2960[var6];
                            String var234;
                            try {
                                var234 = new String(var232.method404(-231), "ISO-8859-1");
                            } catch (UnsupportedEncodingException var472) {
                                var234 = new String(var232.method404(-231));
                            }
                            if (class31.field427) {
                                if (!browsercontrol.iscreated()) {
                                    browsercontrol.create("about:blank");
                                }
                                if (browsercontrol.iscreated()) {
                                    browsercontrol.navigate(var234);
                                    class282.field4811 = var233;
                                    class197.method1378(!arg0, 0);
                                }
                            }
                            continue;
                        }
                        if (var474 == 6402) {
                            if (browsercontrol.iscreated()) {
                                browsercontrol.navigate("about:blank");
                                browsercontrol.hide();
                                class282.field4811 = 0;
                                class197.method1378(false, 0);
                            }
                            continue;
                        }
                        if (var474 == 6403) {
                            class104.field1705[var7++] = class252.field4277;
                            continue;
                        }
                        if (var474 == 6404) {
                            class104.field1705[var7++] = class194.field3258;
                            continue;
                        }
                        if (var474 == 6405) {
                            class185.field2960[var6++] = class131.method964(116) ? 1 : 0;
                            continue;
                        }
                        if (var474 == 6406) {
                            class185.field2960[var6++] = class113.method884(0) ? 1 : 0;
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var473) {
            if (var5.field980 == null) {
                if (class101.field1669 != 0) {
                    class116.method901(0, class71.field1086, class199.field3354, (byte) 104);
                }
                class235.method1659(var473, "CS2 - scr:" + var5.field3499 + " op:" + var9, -28677);
            } else {
                class62 var468 = class296.method2005(30, -1757618132);
                var468.method403(class256.field4325, false).method403(var5.field980, false);
                for (int var469 = class16.field143 - 1; var469 >= 0; var469--) {
                    var468.method403(class197.field3332, !arg0).method403(class166.field2708[var469].field873.field980, false);
                }
                if (var9 == 40) {
                    int var470 = var10[var8];
                    var468.method403(class215.field3658, false).method403(class42.method284(var470, -116), false);
                }
                if (class101.field1669 != 0) {
                    class116.method901(0, class71.field1086, class254.method1772(new class62[] { class12.field109, var5.field980 }, 0), (byte) 105);
                }
                class235.method1659(var473, "CS2 - scr:" + var5.field3499 + " op:" + var9 + new String(var468.method404(-231)), -28677);
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V", line = 5767)
    public static void method1237(int arg0) {
        if (arg0 == 1) {
            field2805 = null;
            field2809 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)[I", line = 5783)
    public final int[] method6(int arg0, int arg1) {
        field2802++;
        int[] var3 = this.field4573.method919(arg1, 26072);
        if (this.field4573.field1984) {
            int[][] var4 = this.method1855(false, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class109.field1770; var8++) {
                var3[var8] = (var5[var8] + var7[var8] + var6[var8]) / 3;
            }
        }
        return arg0 == 18693 ? var3 : (int[]) null;
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V", line = 5825)
    public class174() {
        super(1, true);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIBIIII)V", line = 5830)
    public static final void method1238(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field2806++;
        int var8 = 0;
        int var9 = arg4;
        int var10 = 0;
        if (arg3 != -84) {
            method1238(2, -23, 43, (byte) -100, 125, 16, 43, -35);
        }
        int var11 = arg5 - arg1;
        int var12 = arg5 * arg5;
        int var13 = arg4 - arg1;
        int var14 = arg4 * arg4;
        int var15 = var11 * var11;
        int var16 = var13 * var13;
        int var17 = var14 << 1;
        int var18 = var16 << 1;
        int var19 = var15 << 1;
        int var20 = var12 << 1;
        int var21 = arg4 << 1;
        int var22 = var13 << 1;
        int var23 = (1 - var21) * var12 + var17;
        int var24 = var14 - ((var21 - 1) * var20);
        int var25 = (1 - var22) * var15 + var18;
        int var26 = var12 << 2;
        int var27 = var15 << 2;
        int var28 = var16 - ((var22 - 1) * var19);
        int var29 = var14 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var20;
        int var33 = var29;
        int var34 = (var22 - 3) * var19;
        int var35 = var18 * 3;
        int var36 = (arg4 - 1) * var26;
        int var37 = var30;
        int var38 = (var13 - 1) * var27;
        if (class99.field1630 <= arg2 && arg2 <= class81.field1348) {
            int[] var39 = class282.field4817[arg2];
            int var40 = class4.method17(class176.field2819, -16168, class52.field755, arg0 - arg5);
            int var41 = class4.method17(class176.field2819, -16168, class52.field755, arg0 + arg5);
            int var42 = class4.method17(class176.field2819, arg3 - 16084, class52.field755, arg0 - var11);
            int var43 = class4.method17(class176.field2819, -16168, class52.field755, arg0 + var11);
            class271.method1861(arg6, true, var39, var42, var40);
            class271.method1861(arg7, true, var39, var43, var42);
            class271.method1861(arg6, true, var39, var41, var43);
        }
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var8++;
                    var23 += var31;
                    var24 += var33;
                    var33 += var29;
                    var31 += var29;
                }
            }
            if (var24 < 0) {
                var8++;
                var24 += var33;
                var23 += var31;
                var33 += var29;
                var31 += var29;
            }
            boolean var44 = var9 <= var13;
            var24 += -var32;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var35;
                        var10++;
                        var28 += var37;
                        var35 += var30;
                        var37 += var30;
                    }
                }
                if (var28 < 0) {
                    var25 += var35;
                    var35 += var30;
                    var10++;
                    var28 += var37;
                    var37 += var30;
                }
                var25 += -var38;
                var38 -= var27;
                var28 += -var34;
                var34 -= var27;
            }
            var32 -= var26;
            var9--;
            var23 += -var36;
            var36 -= var26;
            int var45 = arg2 - var9;
            int var46 = arg2 + var9;
            if (var46 >= class99.field1630 && var45 <= class81.field1348) {
                int var47 = class4.method17(class176.field2819, -16168, class52.field755, arg0 + var8);
                int var48 = class4.method17(class176.field2819, arg3 - 16084, class52.field755, arg0 - var8);
                if (var44) {
                    int var49 = class4.method17(class176.field2819, -16168, class52.field755, arg0 + var10);
                    int var50 = class4.method17(class176.field2819, arg3 - 16084, class52.field755, arg0 - var10);
                    if (class99.field1630 <= var45) {
                        int[] var51 = class282.field4817[var45];
                        class271.method1861(arg6, true, var51, var50, var48);
                        class271.method1861(arg7, true, var51, var49, var50);
                        class271.method1861(arg6, true, var51, var47, var49);
                    }
                    if (class81.field1348 >= var46) {
                        int[] var52 = class282.field4817[var46];
                        class271.method1861(arg6, true, var52, var50, var48);
                        class271.method1861(arg7, true, var52, var49, var50);
                        class271.method1861(arg6, true, var52, var47, var49);
                    }
                } else {
                    if (var45 >= class99.field1630) {
                        class271.method1861(arg6, true, class282.field4817[var45], var47, var48);
                    }
                    if (class81.field1348 >= var46) {
                        class271.method1861(arg6, true, class282.field4817[var46], var47, var48);
                    }
                }
            }
        }
    }
}
